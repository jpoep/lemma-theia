package de.fhdo.lemma.data.launch

import org.eclipse.sprotty.xtext.launch.DiagramServerSocketLauncher

class DataDslSocketServer extends DiagramServerSocketLauncher  {
	
	override createSetup() {
		new DataDslLanguageServerSetup
	}

	def static void main(String... args) {
		new DataDslSocketServer().run(args)
	}
}