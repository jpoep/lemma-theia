package de.fhdo.lemma.data.diagram

import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.HierarchyHandling
import org.eclipse.elk.core.options.NodeLabelPlacement
import org.eclipse.sprotty.Action
import org.eclipse.sprotty.SGraph
import org.eclipse.sprotty.SModelRoot
import org.eclipse.sprotty.layout.ElkLayoutEngine
import org.eclipse.sprotty.layout.SprottyLayoutConfigurator

class DataDslLayoutEngine extends ElkLayoutEngine {
	override layout(SModelRoot root, Action cause) {
		if (root instanceof SGraph) {
			val SprottyLayoutConfigurator configurator = new SprottyLayoutConfigurator

			configurator.configureByType('graph').setProperty(CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID).
				setProperty(CoreOptions.HIERARCHY_HANDLING, HierarchyHandling.INCLUDE_CHILDREN).setProperty(
					CoreOptions.SPACING_NODE_NODE, 20.0).setProperty(CoreOptions.SPACING_LABEL_LABEL, 20.0)

			#[
				'node:list',
				'node:enum',
				'node:structure'
			].map [
				configurator.configureByType(it)
			].forEach [
				setProperty(CoreOptions.SPACING_NODE_NODE, 20.0)
			]

			#[
				'node:context',
				'node:version'
			].map [
				configurator.configureByType(it)
			].forEach [
				setProperty(CoreOptions.NODE_LABELS_PLACEMENT, NodeLabelPlacement.outsideTopLeft)
			]

			layout(root, configurator, cause)
		}
	}
}
