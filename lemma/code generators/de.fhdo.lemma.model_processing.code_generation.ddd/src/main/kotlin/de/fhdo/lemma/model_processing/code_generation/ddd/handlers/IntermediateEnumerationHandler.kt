package de.fhdo.lemma.model_processing.code_generation.ddd.handlers

import com.github.javaparser.ast.body.EnumDeclaration
import de.fhdo.lemma.data.intermediate.IntermediateEnumeration
import de.fhdo.lemma.model_processing.code_generation.ddd.DDD_VERSION
import de.fhdo.lemma.model_processing.code_generation.ddd.getDddElementsForFeatures
import de.fhdo.lemma.model_processing.code_generation.java_base.ast.ImportTargetElementType
import de.fhdo.lemma.model_processing.code_generation.java_base.ast.addDependency
import de.fhdo.lemma.model_processing.code_generation.java_base.ast.addImport
import de.fhdo.lemma.model_processing.code_generation.java_base.genlets.GenletCodeGenerationHandlerI
import de.fhdo.lemma.model_processing.code_generation.java_base.genlets.GenletCodeGenerationHandlerResult
import de.fhdo.lemma.model_processing.code_generation.java_base.handlers.CodeGenerationHandler

@CodeGenerationHandler
internal class IntermediateEnumerationHandler
    : GenletCodeGenerationHandlerI<IntermediateEnumeration, EnumDeclaration, Nothing> {
    override fun handlesEObjectsOfInstance() = IntermediateEnumeration::class.java
    override fun generatesNodesOfInstance() = EnumDeclaration::class.java

    override fun execute(eObject: IntermediateEnumeration, node: EnumDeclaration, context: Nothing?)
        : GenletCodeGenerationHandlerResult<EnumDeclaration>? {
        val dddElements = node.getDddElementsForFeatures(eObject.featureNames.toSet())

        if (dddElements.interfaces.isNotEmpty())
            node.addDependency("de.fhdo.lemma.ddd:de.fhdo.lemma.ddd:${DDD_VERSION}")

        dddElements.interfaces.forEach { (iface, ifaceImport) ->
            node.addImport(ifaceImport, ImportTargetElementType.IMPLEMENTED_INTERFACE)
            node.addImplementedType(iface)
        }
        return GenletCodeGenerationHandlerResult(node)
    }
}