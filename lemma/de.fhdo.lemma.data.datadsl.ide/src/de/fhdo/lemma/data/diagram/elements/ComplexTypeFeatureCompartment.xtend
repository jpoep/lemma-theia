package de.fhdo.lemma.data.diagram.elements

import de.fhdo.lemma.data.ComplexType
import java.util.function.Consumer
import java.util.stream.Collectors
import org.eclipse.sprotty.LayoutOptions
import org.eclipse.sprotty.LayoutOptions.HAlignKind
import org.eclipse.sprotty.SCompartment
import org.eclipse.sprotty.SLabel
import org.eclipse.sprotty.SModelElement
import org.eclipse.sprotty.xtext.IDiagramGenerator.Context
import org.eclipse.xtend.lib.annotations.ToString

import static extension de.fhdo.lemma.data.diagram.utils.DataDslUtils.fullId

@ToString(skipNulls=true)
class ComplexTypeFeatureCompartment extends SCompartment {

	new(ComplexType complexType, extension Context context) {
		super()
		id = idCache.uniqueId(complexType.fullId + "_feature-compartment")
		type = "comp:complexTypeFeature"
		layout = LayoutKind.hbox
		layoutOptions = new LayoutOptions [
			HAlign = HAlignKind.center
			HGap = 2.0
			paddingTop = 2.0
			paddingBottom = 2.0
			paddingLeft = 0.0
			paddingRight = 0.0
		]
		children = (#[
			new SLabel [
				it.id = idCache.uniqueId(complexType.fullId + "_feature_label_opening_bracket")
				it.text = "«"
				it.type = "label:complexTypeFeature"
			] as SModelElement
		] + complexType.features.map[toString].join(",•,").split(",")
		
		.map [ str |
			new SLabel [
				it.id = idCache.uniqueId(complexType.fullId + "_feature_label_" + str)
				it.text = str
				it.type = "label:complexTypeFeature"
			] as SModelElement
		]
		 + #[
			new SLabel [
				it.id = idCache.uniqueId(complexType.fullId + "_feature_label_closing_bracket")
				it.text = "»"
				it.type = "label:complexTypeFeature"
			] as SModelElement	
		]).toList.stream.collect(Collectors.toList)

	}

	new(ComplexType complexType, extension Context context, Consumer<SCompartment> initializer) {
		this(complexType, context)
		initializer.accept(this)
	}

}
