package de.fhdo.lemma.data.diagram.elements

import de.fhdo.lemma.data.ComplexType
import de.fhdo.lemma.data.DataField
import de.fhdo.lemma.data.PrimitiveType
import de.fhdo.lemma.data.Type
import java.util.List
import java.util.function.Consumer
import org.eclipse.sprotty.SLabel
import org.eclipse.sprotty.xtext.IDiagramGenerator.Context
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.ToString

import static extension de.fhdo.lemma.data.diagram.utils.DataDslUtils.fullId

@Accessors
@ToString(skipNulls=true)
class DataFieldLabel extends SLabel {

	boolean hidden
	boolean immutable
	List<String> dataFieldFeatures;

	new(DataField dataField, extension Context context) {
		super()
		type = 'label:dataField'
		hidden = dataField.hidden
		immutable = dataField.immutable
		dataFieldFeatures = dataField.features.map[toString]
		text = getText(dataField)
		id = idCache.uniqueId(dataField, dataField.fullId)
		
	}

	new(DataField dataField, Context context, Consumer<SLabel> initializer) {
		this(dataField, context)
		initializer.accept(this)
	}

	private def String getText(DataField field) {
		val Type fieldType = field.effectiveType
		val String fieldTypeName = switch (fieldType) {
			ComplexType: fieldType.name
			PrimitiveType: fieldType.typeName
		// ImportedComplexType: fieldType.importedType.name TODO: handle importedComplexTypes
		}
		val String initialValue = field.initializationValue !== null
				? ''' = «field.initializationValue.valueAsString»''' : ''
				
		return '''
			«field.name»: «fieldTypeName»«initialValue»
		'''
	}
}
