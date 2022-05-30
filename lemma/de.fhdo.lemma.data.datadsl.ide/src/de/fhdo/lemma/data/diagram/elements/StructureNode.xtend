package de.fhdo.lemma.data.diagram.elements

import de.fhdo.lemma.data.ComplexType
import de.fhdo.lemma.data.DataStructure
import java.util.function.Consumer
import java.util.stream.Collectors
import org.eclipse.sprotty.SModelElement
import org.eclipse.sprotty.xtext.IDiagramGenerator.Context

class StructureNode extends ComplexTypeNode {

	new(DataStructure structure, extension Context context) {
		super(structure, context)
		type = "node:structure"
	}

	new(DataStructure structure, Context context, Consumer<ComplexTypeNode> initializer) {
		this(structure, context)
		initializer.accept(this)
	}

	override children(ComplexType complexType, extension Context context) {
		val structure = complexType as DataStructure // It's a little ugly but I couldn't figure out a better way
		(
				#[
			new DataDslCompartment [
				it.id = idCache.uniqueId(structure.buildQualifiedName("_") + '_compartment_fields')
				it.type = "comp:dataFields"
				it.children = structure.dataFields.map[new DataFieldLabel(it, context) as SModelElement].toList.stream.
					collect(Collectors.toList)
			] as SModelElement,
			new DataDslCompartment [
				it.id = idCache.uniqueId(structure.buildQualifiedName("_") + '_compartment_operations')
				it.type = "comp:dataOperations"
				it.children = structure.operations.map[new DataOperationLabel(it, context) as SModelElement].toList.
					stream.collect(Collectors.toList)
			]
		]).toList.stream.collect(Collectors.toList)
	}

	override iconLetter() { "S" }

}
