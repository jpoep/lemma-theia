package de.fhdo.lemma.data.diagram

import org.eclipse.sprotty.xtext.DiagramServerFactory

class DataDslDiagramServerFactory extends DiagramServerFactory {
	
	override getDiagramTypes() {
		#['data-dsl-diagram']
	}
}