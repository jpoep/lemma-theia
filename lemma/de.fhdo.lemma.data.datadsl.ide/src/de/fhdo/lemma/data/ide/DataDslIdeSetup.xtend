/*
 * generated by Xtext 2.12.0
 */
package de.fhdo.lemma.data.ide

import com.google.inject.Guice
import de.fhdo.lemma.data.DataDslRuntimeModule
import de.fhdo.lemma.data.DataDslStandaloneSetup
import de.fhdo.lemma.data.diagram.DataDslDiagramModule
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class DataDslIdeSetup extends DataDslStandaloneSetup {

    override createInjector() {
        Guice.createInjector(Modules2.mixin(new DataDslRuntimeModule, new DataDslIdeModule, new DataDslDiagramModule))
    }

}
