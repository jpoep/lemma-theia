package de.fhdo.lemma.data.diagram

import com.google.inject.Inject
import de.fhdo.lemma.data.ComplexType
import de.fhdo.lemma.data.DataField
import de.fhdo.lemma.data.DataModel
import de.fhdo.lemma.data.DataOperation
import de.fhdo.lemma.data.DataStructure
import de.fhdo.lemma.data.Enumeration
import de.fhdo.lemma.data.ListType
import de.fhdo.lemma.data.diagram.elements.EnumNode
import de.fhdo.lemma.data.diagram.elements.ListNode
import de.fhdo.lemma.data.diagram.elements.StructureNode
import java.util.List
import java.util.stream.Collectors
import org.eclipse.emf.ecore.EObject
import org.eclipse.sprotty.SEdge
import org.eclipse.sprotty.SGraph
import org.eclipse.sprotty.SLabel
import org.eclipse.sprotty.SModelElement
import org.eclipse.sprotty.SNode
import org.eclipse.sprotty.xtext.IDiagramGenerator
import org.eclipse.sprotty.xtext.SIssueMarkerDecorator
import org.eclipse.sprotty.xtext.tracing.ITraceProvider

import static extension de.fhdo.lemma.data.diagram.utils.DataDslUtils.fullId
import de.fhdo.lemma.data.diagram.utils.DataDslUtils
import de.fhdo.lemma.data.Version

class DataDslDiagramGenerator implements IDiagramGenerator {

	@Inject extension ITraceProvider
	@Inject extension SIssueMarkerDecorator
	override generate(IDiagramGenerator.Context context) {
		(context.resource.contents.head as DataModel).toSGraph(context)
	}

	def toSGraph(DataModel dataModel, extension IDiagramGenerator.Context context) {
		(new SGraph [
			id = idCache.uniqueId(dataModel, "root")
			// the stream.collect bit is VERY important, as the List type returned by contexts.map 
			// cannot be used correctly by ELK or Sprotty for whatever godforsaken fucking reason. It took me hours to 
			// figure this shit out
			children = (
				dataModel.versions.map[mapVersion(context)] +
				dataModel.contexts.map[mapContext(context)] +
				dataModel.complexTypes.map[mapComplexType(context)] +
				dataModel.allComplexTypes.flatMap[getAllEdges(context)]
			).toList

		]
		).traceAndMark(dataModel, context)
	}
	
	private def SNode mapVersion(Version version, extension Context context) {
		new SNode [
			val theId = idCache.uniqueId(version, version.name)
			id = theId
			children = (#[
				new SLabel [
					id = theId + "_label"
					text = version.name
				] as SModelElement
			] 
			  + version.contexts.map[mapContext(context)]
			  + version.complexTypes.map[mapComplexType(context)
			]
			).toList.stream.collect(Collectors.toList)

			type = "node:version"
		].traceAndMark(version, context)
	}

	private def SNode mapContext(de.fhdo.lemma.data.Context lemmaContext, extension IDiagramGenerator.Context context) {
		new SNode [
			val nodeId = idCache.uniqueId(lemmaContext, lemmaContext.name)
			id = nodeId
			children = (#[
				new SLabel [
					id = idCache.uniqueId(nodeId + "_label")
					text = lemmaContext.name
				] as SModelElement
			] + lemmaContext.complexTypes.map[mapComplexType(context)]
			).toList.stream.collect(Collectors.toList)

			type = "node:context"
		].traceAndMark(lemmaContext, context)
	}

	private def SNode mapComplexType(ComplexType complexType, extension IDiagramGenerator.Context context) {
		return (switch complexType {
			DataStructure: new StructureNode(complexType, context)
			ListType: new ListNode(complexType, context)
			Enumeration: new EnumNode(complexType, context)
		}).traceAndMark(complexType, context)
	}

	private def List<SEdge> getAllEdges(ComplexType complexType, extension IDiagramGenerator.Context context) {
		var List<SEdge> generalizationEdges = #[]
		if (complexType instanceof DataStructure) {
			generalizationEdges = #[complexType.getGeneralizationEdge(context)]
		}
		
		(
			complexType.getAllDataFields.map[getDataFieldEdges(context)] +
			complexType.getAllDataOperations.flatMap [getDataOperationEdges(context)] +
			generalizationEdges
		)
		.filterNull
		.toList
		.stream()
		.filter(DataDslUtils.distinctByKey([edge|edge.id]))
		.collect(Collectors.toList)
	}

	private def List<DataField> getAllDataFields(ComplexType complexType) {
		switch (complexType) {
			DataStructure: complexType.dataFields
			ListType: complexType.dataFields
			default: #[]
		}
	}

	private def List<DataOperation> getAllDataOperations(ComplexType complexType) {
		switch (complexType) {
			DataStructure: complexType.operations
			default: #[]
		}
	}

	private def SEdge getEdge(EObject source, EObject target, String idBase, String subType,
		extension IDiagramGenerator.Context context) {
		return new SEdge [
			sourceId = idCache.getId(source)
			targetId = idCache.getId(target)
			id = sourceId + ':' + targetId // idCache is not being used because we need duplicate IDs to filter them later via distinctByKey
			type = "edge:" + subType
		]
	}

	private def List<SEdge> getDataOperationEdges(DataOperation operation,
		extension IDiagramGenerator.Context context) {
		(#[operation.complexReturnType] + operation.parameters.map[it.complexType]).filterNull.map [
			getEdge(operation.eContainer, it, operation.fullId, "dependency", context)
		].toList.stream.distinct().collect(Collectors.toList())

	}

	private def SEdge getDataFieldEdges(DataField field, extension IDiagramGenerator.Context context) {
		if (field.complexType !== null) {
			return getEdge(field.eContainer, field.effectiveType, field.fullId, "association", context)
		}
	}
	
	private def SEdge getGeneralizationEdge(DataStructure structure, extension IDiagramGenerator.Context context) {
		if (structure.super !== null) {
			return getEdge(structure, structure.super, structure.fullId, "generalization", context)
		}
	}
	
	private def allComplexTypes(DataModel model) {
		model.versions.flatMap[contexts].flatMap[complexTypes] + 
		model.versions.flatMap[complexTypes] +
		model.contexts.flatMap[complexTypes] +
		model.complexTypes
	}

	private def <T extends SModelElement> T traceAndMark(T sElement, EObject element, IDiagramGenerator.Context context) {
		sElement.trace(element).addIssueMarkers(element, context)
	}
		
}



