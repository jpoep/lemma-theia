package de.fhdo.lemma.data.diagram.elements

import de.fhdo.lemma.data.ComplexType
import de.fhdo.lemma.data.Enumeration
import java.util.function.Consumer
import java.util.stream.Collectors
import org.eclipse.sprotty.SModelElement
import org.eclipse.sprotty.xtext.IDiagramGenerator.Context

import static extension de.fhdo.lemma.data.diagram.utils.DataDslUtils.fullId


class EnumNode extends ComplexTypeNode {

	new(Enumeration enumType, extension Context context) {
		super(enumType, context)
		type = "node:enum"
	}

	new(Enumeration enumType, Context context, Consumer<ComplexTypeNode> initializer) {
		this(enumType, context)
		initializer.accept(this)
	}

	override children(ComplexType complexType, extension Context context) {
		val Enumeration enumType = complexType as Enumeration
		(#[new DataDslCompartment [
			it.id = idCache.uniqueId(enumType.fullId + '_compartment')
			type="comp:enumFields"
			it.children = enumType.fields.map[new EnumFieldLabel(it, context) as SModelElement].toList.stream.collect(
				Collectors.toList)
		] as SModelElement] ).toList.stream.collect(Collectors.toList)
	}
	
	override iconLetter() {
		"E"
	}

}
