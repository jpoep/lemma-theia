package de.fhdo.lemma.data.diagram.elements

import de.fhdo.lemma.data.ComplexType
import de.fhdo.lemma.data.ListType
import java.util.function.Consumer
import java.util.stream.Collectors
import org.eclipse.sprotty.SModelElement
import org.eclipse.sprotty.xtext.IDiagramGenerator.Context
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.ToString

@Accessors
@ToString(skipNulls=true)
class ListNode extends ComplexTypeNode {

	public String primitiveType

	new(ListType list, extension Context context) {
		super(list, context)
		primitiveType = list.primitiveType?.typeName
		type = "node:list"
	}

	new(ListType list, Context context, Consumer<ComplexTypeNode> initializer) {
		this(list, context)
		initializer.accept(this)
	}

	override children(ComplexType complexType, extension Context context) {
		val list = complexType as ListType
		(#[
			new DataDslCompartment [
				it.id = idCache.uniqueId(list.name + '_compartment')
				it.type = "comp:dataFields"
				it.children = list.dataFields.map[new DataFieldLabel(it, context) as SModelElement].toList.stream.collect(
					Collectors.toList)
			] as SModelElement
		]).toList.stream.collect(Collectors.toList)
	}
	
	override iconLetter() {
		"L"
	}
	
	override titleText(ComplexType complexType) {
		// We can't access this.primitiveType because it's not yet initiliazed when this method is called
		val ListType listType = complexType as ListType // we know this for sure (tm)
		val primitiveType = listType.primitiveType?.typeName
		primitiveType === null ? listType.name : '''«listType.name» <«primitiveType»>'''
	}
}