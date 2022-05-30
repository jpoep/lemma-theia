package de.fhdo.lemma.data.diagram.elements

import java.util.function.Consumer
import org.eclipse.sprotty.LayoutOptions
import org.eclipse.sprotty.LayoutOptions.HAlignKind
import org.eclipse.sprotty.SCompartment
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.ToString

@Accessors
@ToString(skipNulls=true)
class DataDslCompartment extends SCompartment {

	new() {
		super()
		type="comp"
		layout = LayoutKind.vbox
		layoutOptions = new LayoutOptions [
			HAlign = HAlignKind.left
			paddingTop = 7.0
			paddingBottom = 7.0
			paddingLeft = 0.0
			paddingRight = 0.0
		]
	}

	new(Consumer<SCompartment> initializer) {
		this()
		initializer.accept(this)
	}

}
