package de.fhdo.lemma.ui.highlighting

import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.util.CancelIndicator
import de.fhdo.lemma.service.Microservice
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import de.fhdo.lemma.service.ServicePackage
import de.fhdo.lemma.service.ProtocolSpecification
import de.fhdo.lemma.service.ImportedServiceAspect
import de.fhdo.lemma.service.Interface
import de.fhdo.lemma.service.ReferredOperation
import de.fhdo.lemma.service.Operation
import de.fhdo.lemma.service.TechnologyReference
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.Keyword
import de.fhdo.lemma.technology.TechnologyPackage
import de.fhdo.lemma.technology.TechnologySpecificPropertyValueAssignment
import com.google.common.base.Function

/**
 * Provide custom syntax highlighting for certain elements.
 *
 * @author <a href="mailto:florian.rademacher@fh-dortmund.de>Florian Rademacher</a>
 */
class HighlightingCalculator implements ISemanticHighlightingCalculator {
    /**
     * Provide highlighting
     */
    override provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor,
        CancelIndicator cancelIndicator) {
        resource.provideHighlightingForAnnotations(acceptor)
        resource.provideHighlightingForDefaultTypeDefinitionFlag(acceptor)
        resource.provideHighlightingForBooleanConstants(acceptor)
        resource.provideHighlightingForApiComments(acceptor)
    }

    /**
     * Provide highlighting for annotations
     */
    private def provideHighlightingForAnnotations(XtextResource resource,
        IHighlightedPositionAcceptor acceptor) {
        /*
         * The following map contains the annotatable concepts and their features being part of
         * annotations. That is, a list of feature description pairs is assigned to each concept.
         * An assigned pair's key represents the feature that may be part of an annotation. The
         * pair's value is a boolean flag. It specifies if the highlighting should start
         * immediately, i.e., if the feature itself should be highlighted, or not. This mechanism is
         * necessary for features that represent annotations themselves. This is, for instance, the
         * case for imported aspects, e.g. java::aspects.HttpStatus. By contrast, e.g., for
         * technologies only the surrounding annotation nodes should get highlighted. For example,
         * the "@technology" part of the technology annotation "@technology(java)". Setting the flag
         * to false hence prevents that the respective feature's value is highlighted.
         *
         * Map structure summary:
         *  CONCEPT1 -> [
         *      CONCEPT1_FEATURE1: HIGHLIGHT_IMMEDIATELY,
         *      CONCEPT1_FEATURE2: HIGHLIGHT_IMMEDIATELY
         *  ],
         *  CONCEPT2 -> [
         *      CONCEPT2_FEATURE1: HIGHLIGHT_IMMEDIATELY
         *  ],
         *  ...
         */
        val annotatableConcepts = #{
            Microservice -> #[
                ServicePackage.Literals::MICROSERVICE__ENDPOINTS -> false
            ],
            TechnologyReference -> #[
                ServicePackage.Literals::TECHNOLOGY_REFERENCE__TECHNOLOGY -> false
            ],
            Interface -> #[
                ServicePackage.Literals::INTERFACE__ENDPOINTS -> false
            ],
            Operation -> #[
                ServicePackage.Literals::OPERATION__ENDPOINTS -> false
            ],
            ReferredOperation -> #[
                ServicePackage.Literals::REFERRED_OPERATION__ENDPOINTS -> false
            ],
            ProtocolSpecification -> #[
                ServicePackage.Literals::PROTOCOL_SPECIFICATION__PROTOCOL -> false
            ],
            ImportedServiceAspect -> #[
                ServicePackage.Literals::IMPORTED_SERVICE_ASPECT__IMPORTED_ASPECT -> true
            ]
        }

        /*
         * Perform the actual highlighting by iterating through the map and filtering the resource
         * to get highlighted for all relevant concepts
         */
        annotatableConcepts.forEach[concept, featureDescriptions |
            resource.allContents.filter[concept.isInstance(it)]
                .forEach[featureDescriptions.forEach[featureDescription |
                    val feature = featureDescription.key
                    val highlightImmediately = featureDescription.value

                    /* Iterate over the current feature's nodes to highlight them */
                    NodeModelUtils.findNodesForFeature(it, feature).forEach[
                        // Determine node to start highlighting. In case highlighting shall not
                        // start on the feature node itself, i.e., immediately, find the opening
                        // bracket of the aspect string (currently there are no built-in aspects
                        // without parameters, i.e., opening brackets).
                        var nodeToHighlight = it
                        if (!highlightImmediately)
                            while (nodeToHighlight.hasNextNode &&
                                !nodeToHighlight.nextNodeIsOpeningAspectBracket)
                                nodeToHighlight = nodeToHighlight.previousSibling

                        // Highlight nodes including the "@" sign, which marks the beginning of an
                        // aspect's annotation string
                        if (nodeToHighlight !== null)
                            nodeToHighlight.highlightUntil([previousSibling], "@", acceptor,
                                HighlightingConfiguration.ANNOTATION_ID, true)
                    ]
                ]]
        ]
    }

    /**
     * Check if the given node has a next sibling
     */
    private def hasNextNode(INode node) {
        return node !== null && node.nextSibling !== null
    }

    /**
     * Check if the next sibling of the given node is the opening bracket of an aspect string
     */
    private def nextNodeIsOpeningAspectBracket(INode node) {
        return node.nextSibling.text == "(" || node.nextSibling.text == "({"
    }

    /**
     * Provide highlighting for default type definition flag of built-in @technology annotation
     */
    private def provideHighlightingForDefaultTypeDefinitionFlag(XtextResource resource,
        IHighlightedPositionAcceptor acceptor) {
        for (eObject : resource.allContents.toList) {
            val relevantFeatures = NodeModelUtils.findNodesForFeature(eObject,
                ServicePackage.Literals::TECHNOLOGY_REFERENCE__IS_TYPE_DEFINITION_TECHNOLOGY)
            if (!relevantFeatures.empty) {
                var currentNode = relevantFeatures.get(0).previousSibling
                var typedefKeywordColored = false
                while (currentNode !== null && !typedefKeywordColored) {
                    if ("typedef" == currentNode.keywordValue) {
                        acceptor.addPosition(currentNode.offset, currentNode.length,
                            HighlightingConfiguration.DEFAULT_ID)
                        typedefKeywordColored = true
                    } else
                        currentNode = currentNode.previousSibling
                }
            }
        }
    }

    /**
     * Helper to return the value of a Keyword INode. Returns an empty string if the passed node is
     * not a Keyword.
     */
    private def String keywordValue(INode node) {
        val grammarElement = node.grammarElement
        return if (grammarElement instanceof Keyword)
                grammarElement.value
            else
                ""
    }

    /**
     * Provide highlighting for boolean values
     */
    private def provideHighlightingForBooleanConstants(XtextResource resource,
        IHighlightedPositionAcceptor acceptor) {
        val booleanConcepts = newHashMap(
            ImportedServiceAspect -> #[
                [
                    val value = (it as ImportedServiceAspect).singlePropertyValue
                    value !== null && value.booleanValue !== null
                ]
                -> ServicePackage::Literals.IMPORTED_SERVICE_ASPECT__SINGLE_PROPERTY_VALUE
            ],

            TechnologySpecificPropertyValueAssignment -> #[
                [
                    val value = (it as TechnologySpecificPropertyValueAssignment).value
                    value !== null && value.booleanValue !== null
                ]
                -> TechnologyPackage::Literals.TECHNOLOGY_SPECIFIC_PROPERTY_VALUE_ASSIGNMENT__VALUE
            ],

            TechnologyReference -> #[
                [true]
                -> ServicePackage::Literals.TECHNOLOGY_REFERENCE__IS_TYPE_DEFINITION_TECHNOLOGY
            ]
        )

        resource.allContents.forEach[eObject |
            val matchingBooleanConcept = booleanConcepts.keySet.findFirst[it.isInstance(eObject)]
            if (matchingBooleanConcept !== null) {
                val primitiveValueGetters = booleanConcepts.get(matchingBooleanConcept)
                primitiveValueGetters.forEach[
                    val isBooleanValue = it.key
                    val feature = it.value

                    if (isBooleanValue.apply(eObject))
                        NodeModelUtils.findNodesForFeature(eObject, feature).forEach[
                            acceptor.addPosition(offset, length,
                                HighlightingConfiguration.KEYWORD_ID)
                        ]
                ]
            }
        ]
    }

    /**
     * Provide highlighting for API operation comments
     */
    private def provideHighlightingForApiComments(XtextResource resource,
        IHighlightedPositionAcceptor acceptor) {
        resource.allContents.forEach[
            // API operation comment
            val commentFeatures = NodeModelUtils
                .findNodesForFeature(it, ServicePackage::Literals.API_OPERATION_COMMENT__COMMENT)
            if (!commentFeatures.empty) {
                commentFeatures.forEach[
                    acceptor.addPosition(offset, length, HighlightingConfiguration.API_OPERATION_ID)
                ]

                commentFeatures.get(0).highlightUntil([previousSibling], "---", acceptor,
                    HighlightingConfiguration.API_OPERATION_ID, false)
                commentFeatures.get(0).highlightUntil([nextSibling], "---", acceptor,
                    HighlightingConfiguration.API_OPERATION_ID, false)
            }

            // API parameter comment
            val parameterFeatures = NodeModelUtils
                .findNodesForFeature(it, ServicePackage::Literals.API_PARAMETER_COMMENT__PARAMETER)
            if (!parameterFeatures.empty) {
                commentFeatures.get(0).previousSibling.highlightUntil([previousSibling], "@",
                    acceptor, HighlightingConfiguration.TASK_ID, false)

                parameterFeatures.forEach[
                    acceptor.addPosition(offset, length, HighlightingConfiguration.API_PARAMETER_ID)
                ]
            }
        ]
    }

    /**
     * Helper to iteratively highlight nodes until a node with a certain text was reached
     */
    private def highlightUntil(INode startNode, Function<INode, INode> getNextNode, String until,
        IHighlightedPositionAcceptor acceptor, String highlightId, boolean colorStartNode) {
        if (colorStartNode)
            acceptor.addPosition(startNode.offset, startNode.length, highlightId)

        if (until == startNode.text) {
            return
        }

        var nextNode = startNode
        var endReached = false
        do {
            nextNode = getNextNode.apply(nextNode)
            if (nextNode !== null) {
                acceptor.addPosition(nextNode.offset, nextNode.length, highlightId)
                endReached = until == nextNode.text
            }
        } while (nextNode !== null && !endReached)
    }
}