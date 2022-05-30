package de.fhdo.lemma.data.diagram.elements

import java.util.function.Consumer
import org.eclipse.sprotty.LayoutOptions
import org.eclipse.sprotty.LayoutOptions.HAlignKind
import org.eclipse.sprotty.LayoutOptions.VAlignKind
import org.eclipse.sprotty.Layouting
import org.eclipse.sprotty.Point
import org.eclipse.sprotty.SLabel
import org.eclipse.sprotty.SShapeElement
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.ToString

@Accessors
@ToString(skipNulls=true)
class NodeIcon extends SShapeElement implements Layouting {

	String layout

	new(String letter, String id) {
		super()
		type = "icon"
		this.id = id
		layout = LayoutKind.stack
//		layoutOptions = new LayoutOptions [
//			HAlign = HAlignKind.center
//			VAlign = VAlignKind.center
//		]
		children = #[
			new SLabel [
				it.id = "label_" + id
				it.type = "label:icon"
				text = letter
			]
		]
	}

	new(String letter, String id, Consumer<SShapeElement> initializer) {
		this(letter, id)
		initializer.accept(this)
	}

}
