package de.fhdo.lemma.data.diagram

import org.eclipse.sprotty.xtext.DefaultDiagramModule
import org.eclipse.sprotty.xtext.IDiagramGenerator
import org.eclipse.sprotty.xtext.LanguageAwareDiagramServer

class DataDslDiagramModule extends DefaultDiagramModule {

	def Class<? extends IDiagramGenerator> bindIDiagramGenerator() {
		DataDslDiagramGenerator
	}

	override bindIDiagramServerFactory() {
		DataDslDiagramServerFactory
	}

	override bindILayoutEngine() {
		DataDslLayoutEngine
	}
	
	override bindIDiagramServer() {
		LanguageAwareDiagramServer
	}

}
