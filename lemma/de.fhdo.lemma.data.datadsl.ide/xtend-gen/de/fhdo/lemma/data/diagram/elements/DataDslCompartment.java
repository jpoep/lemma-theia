package de.fhdo.lemma.data.diagram.elements;

import java.util.function.Consumer;
import org.eclipse.sprotty.LayoutOptions;
import org.eclipse.sprotty.Layouting;
import org.eclipse.sprotty.SCompartment;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend.lib.annotations.ToString;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Accessors
@ToString(skipNulls = true)
@SuppressWarnings("all")
public class DataDslCompartment extends SCompartment {
  public DataDslCompartment() {
    super();
    this.setType("comp");
    this.setLayout(Layouting.LayoutKind.vbox);
    final Consumer<LayoutOptions> _function = (LayoutOptions it) -> {
      it.setHAlign(LayoutOptions.HAlignKind.left);
      it.setPaddingTop(Double.valueOf(7.0));
      it.setPaddingBottom(Double.valueOf(7.0));
      it.setPaddingLeft(Double.valueOf(0.0));
      it.setPaddingRight(Double.valueOf(0.0));
    };
    LayoutOptions _layoutOptions = new LayoutOptions(_function);
    this.setLayoutOptions(_layoutOptions);
  }
  
  public DataDslCompartment(final Consumer<SCompartment> initializer) {
    this();
    initializer.accept(this);
  }
  
  @Override
  @Pure
  public String toString() {
    return new ToStringBuilder(this)
    	.addAllFields()
    	.skipNulls()
    	.toString();
  }
}
