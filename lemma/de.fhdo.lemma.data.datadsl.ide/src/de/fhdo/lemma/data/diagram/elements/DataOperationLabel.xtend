package de.fhdo.lemma.data.diagram.elements

import de.fhdo.lemma.data.ComplexType
import de.fhdo.lemma.data.DataOperation
import de.fhdo.lemma.data.DataOperationParameter
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
class DataOperationLabel extends SLabel {
	
	boolean hidden
	boolean hasNoReturnType
	List<String> dataOperationFeatures;

	new(DataOperation dataOperation, extension Context context) {
		super()
		type = 'label:dataOperation'
		hidden = dataOperation.hidden
		hasNoReturnType = dataOperation.hasNoReturnType
		dataOperationFeatures = dataOperation.features.map[toString]
		text = getText(dataOperation)
		id = idCache.uniqueId(dataOperation, dataOperation.fullId)
		
	}

	new(DataOperation dataOperation, Context context, Consumer<SLabel> initializer) {
		this(dataOperation, context)
		initializer.accept(this)
	}

	private def String getText(DataOperation dataOperation) {
		val Type operationType = dataOperation.primitiveOrComplexReturnType
		val String fieldTypeName = dataOperation.hasNoReturnType ? 'void' : getTypeName(operationType)
		val List<String> params = dataOperation.parameters.map[getParameterString]

		return '''
			«dataOperation.name»(«params.join(", ")»): «fieldTypeName»
		'''
	}
	
	private def getTypeName(Type type) {
		switch (type) {
			ComplexType: type.name
			PrimitiveType: type.typeName
		// ImportedComplexType: fieldType.importedType.name TODO: handle importedComplexTypes
		}
	}
	
	private def String getParameterString(DataOperationParameter param) {
		'''«param.name»: «param.effectiveType.getTypeName»'''
	}
}


