package de.fhdo.lemma.data.diagram.elements

import de.fhdo.lemma.data.ComplexType
import java.util.List
import java.util.function.Consumer
import org.eclipse.sprotty.LayoutOptions
import org.eclipse.sprotty.LayoutOptions.HAlignKind
import org.eclipse.sprotty.LayoutOptions.VAlignKind
import org.eclipse.sprotty.SCompartment
import org.eclipse.sprotty.SLabel
import org.eclipse.sprotty.SModelElement
import org.eclipse.sprotty.SNode
import org.eclipse.sprotty.xtext.IDiagramGenerator.Context
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.ToString

import static extension de.fhdo.lemma.data.diagram.utils.DataDslUtils.fullId

@Accessors(#[PUBLIC_GETTER, PUBLIC_SETTER])
@ToString(skipNulls=true)
abstract class ComplexTypeNode extends SNode {

	List<String> complexTypeFeatures

	new(ComplexType complexType, extension Context context) {
		super()
		this.complexTypeFeatures = complexType.features.map[it.toString]

		id = idCache.uniqueId(complexType, complexType.fullId)
		children = (#[
			complexType.features.isEmpty ? null : new ComplexTypeFeatureCompartment(complexType, context),
			new SCompartment [
				id = idCache.uniqueId(complexType.fullId + "_header")
				layout = LayoutKind.hbox
				type = "comp:header"
				layoutOptions = new LayoutOptions [
					HGap = 7.0
					paddingTop = 0.0
					VAlign = VAlignKind.center
				]
				children = #[new NodeIcon(iconLetter(), idCache.uniqueId(complexType.fullId + "_icon")), new SLabel [
					it.id = idCache.uniqueId(complexType.fullId + "_label")
					it.text = titleText(complexType)
					it.type = "label:complexType"
				]]
			]
		] + children(complexType, context)).filterNull.toList()
		layout = LayoutKind.vbox
		layoutOptions = new LayoutOptions [
			paddingLeft = 10.0
			paddingBottom = 10.0
			paddingRight = 10.0
			paddingTop = 10.0
			HAlign = HAlignKind.left
		]
	}

	new(ComplexType complexType, extension Context context, Consumer<SNode> initializer) {
		this(complexType, context)
		initializer.accept(this)
	}
	
	/**
	 * This method is so that the titleText can be overridden by a sub class if needed. This is used
	 * with ListTypes, for example, as they want to put their primitive type there if it exists.
	 * This base implementation simply returns the ComplexType's name.
	 */
	def String titleText(ComplexType complexType) {
		return complexType.name
	}

	abstract def List<SModelElement> children(ComplexType complexType, Context context)

	/**
	 * The letter to put in the circle next to the name. Color is hard coded via CSS. 
	 */
	abstract def String iconLetter()


}
