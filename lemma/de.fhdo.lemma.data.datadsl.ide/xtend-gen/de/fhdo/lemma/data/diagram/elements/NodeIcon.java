package de.fhdo.lemma.data.diagram.elements;

import java.util.Collections;
import java.util.function.Consumer;
import org.eclipse.sprotty.Layouting;
import org.eclipse.sprotty.SLabel;
import org.eclipse.sprotty.SModelElement;
import org.eclipse.sprotty.SShapeElement;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend.lib.annotations.ToString;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Accessors
@ToString(skipNulls = true)
@SuppressWarnings("all")
public class NodeIcon extends SShapeElement implements Layouting {
  private String layout;
  
  public NodeIcon(final String letter, final String id) {
    super();
    this.setType("icon");
    this.setId(id);
    this.setLayout(Layouting.LayoutKind.stack);
    final Consumer<SLabel> _function = (SLabel it) -> {
      it.setId(("label_" + id));
      it.setType("label:icon");
      it.setText(letter);
    };
    SLabel _sLabel = new SLabel(_function);
    this.setChildren(Collections.<SModelElement>unmodifiableList(CollectionLiterals.<SModelElement>newArrayList(_sLabel)));
  }
  
  public NodeIcon(final String letter, final String id, final Consumer<SShapeElement> initializer) {
    this(letter, id);
    initializer.accept(this);
  }
  
  @Pure
  @Override
  public String getLayout() {
    return this.layout;
  }
  
  public void setLayout(final String layout) {
    this.layout = layout;
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
