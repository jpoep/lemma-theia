package de.fhdo.lemma.data.diagram.elements

import de.fhdo.lemma.data.EnumerationField
import java.util.function.Consumer
import org.eclipse.sprotty.SLabel
import org.eclipse.sprotty.xtext.IDiagramGenerator.Context
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.ToString

import static extension de.fhdo.lemma.data.diagram.utils.DataDslUtils.fullId

@Accessors
@ToString(skipNulls=true)
class EnumFieldLabel extends SLabel {
	
	new(EnumerationField field, extension Context context) {
		super()
		type = 'label:enumField'
		text = getText(field)
		id = idCache.uniqueId(field, field.fullId)
	}

	new(EnumerationField field, Context context, Consumer<SLabel> initializer) {
		this(field, context)
		initializer.accept(this)
	}

	private def String getText(EnumerationField field) {
		val defaultValue = field.initializationValue !== null
				? '''("«field.initializationValue.valueAsString»")''' : ''
		'''«field.name»«defaultValue»'''
	}
}
