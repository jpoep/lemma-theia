package de.fhdo.lemma.data.launch

import org.eclipse.sprotty.xtext.launch.DiagramServerLauncher

class DataDslServerLauncher extends DiagramServerLauncher {
	override createSetup() {
		new DataDslLanguageServerSetup
	}

	def static void main(String[] args) {
		new DataDslServerLauncher().run(args)
	}
}
