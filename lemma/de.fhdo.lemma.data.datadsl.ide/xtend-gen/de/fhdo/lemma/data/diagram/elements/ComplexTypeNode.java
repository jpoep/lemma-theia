package de.fhdo.lemma.data.diagram.elements;

import com.google.common.collect.Iterables;
import de.fhdo.lemma.data.ComplexType;
import de.fhdo.lemma.data.ComplexTypeFeature;
import de.fhdo.lemma.data.diagram.utils.DataDslUtils;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.sprotty.LayoutOptions;
import org.eclipse.sprotty.Layouting;
import org.eclipse.sprotty.SCompartment;
import org.eclipse.sprotty.SLabel;
import org.eclipse.sprotty.SModelElement;
import org.eclipse.sprotty.SNode;
import org.eclipse.sprotty.xtext.IDiagramGenerator;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend.lib.annotations.ToString;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Accessors({ AccessorType.PUBLIC_GETTER, AccessorType.PUBLIC_SETTER })
@ToString(skipNulls = true)
@SuppressWarnings("all")
public abstract class ComplexTypeNode extends SNode {
  private List<String> complexTypeFeatures;
  
  public ComplexTypeNode(final ComplexType complexType, @Extension final IDiagramGenerator.Context context) {
    super();
    final Function1<ComplexTypeFeature, String> _function = (ComplexTypeFeature it) -> {
      return it.toString();
    };
    this.complexTypeFeatures = ListExtensions.<ComplexTypeFeature, String>map(complexType.getFeatures(), _function);
    this.setId(context.getIdCache().uniqueId(complexType, DataDslUtils.fullId(complexType)));
    ComplexTypeFeatureCompartment _xifexpression = null;
    boolean _isEmpty = complexType.getFeatures().isEmpty();
    if (_isEmpty) {
      _xifexpression = null;
    } else {
      _xifexpression = new ComplexTypeFeatureCompartment(complexType, context);
    }
    final Consumer<SCompartment> _function_1 = (SCompartment it) -> {
      String _fullId = DataDslUtils.fullId(complexType);
      String _plus = (_fullId + "_header");
      it.setId(context.getIdCache().uniqueId(_plus));
      it.setLayout(Layouting.LayoutKind.hbox);
      it.setType("comp:header");
      final Consumer<LayoutOptions> _function_2 = (LayoutOptions it_1) -> {
        it_1.setHGap(Double.valueOf(7.0));
        it_1.setPaddingTop(Double.valueOf(0.0));
        it_1.setVAlign(LayoutOptions.VAlignKind.center);
      };
      LayoutOptions _layoutOptions = new LayoutOptions(_function_2);
      it.setLayoutOptions(_layoutOptions);
      String _iconLetter = this.iconLetter();
      String _fullId_1 = DataDslUtils.fullId(complexType);
      String _plus_1 = (_fullId_1 + "_icon");
      String _uniqueId = context.getIdCache().uniqueId(_plus_1);
      NodeIcon _nodeIcon = new NodeIcon(_iconLetter, _uniqueId);
      final Consumer<SLabel> _function_3 = (SLabel it_1) -> {
        String _fullId_2 = DataDslUtils.fullId(complexType);
        String _plus_2 = (_fullId_2 + "_label");
        it_1.setId(context.getIdCache().uniqueId(_plus_2));
        it_1.setText(this.titleText(complexType));
        it_1.setType("label:complexType");
      };
      SLabel _sLabel = new SLabel(_function_3);
      it.setChildren(Collections.<SModelElement>unmodifiableList(CollectionLiterals.<SModelElement>newArrayList(_nodeIcon, _sLabel)));
    };
    SCompartment _sCompartment = new SCompartment(_function_1);
    List<SModelElement> _children = this.children(complexType, context);
    this.setChildren(IterableExtensions.<SModelElement>toList(IterableExtensions.<SModelElement>filterNull(Iterables.<SModelElement>concat(Collections.<SCompartment>unmodifiableList(CollectionLiterals.<SCompartment>newArrayList(_xifexpression, _sCompartment)), _children))));
    this.setLayout(Layouting.LayoutKind.vbox);
    final Consumer<LayoutOptions> _function_2 = (LayoutOptions it) -> {
      it.setPaddingLeft(Double.valueOf(10.0));
      it.setPaddingBottom(Double.valueOf(10.0));
      it.setPaddingRight(Double.valueOf(10.0));
      it.setPaddingTop(Double.valueOf(10.0));
      it.setHAlign(LayoutOptions.HAlignKind.left);
    };
    LayoutOptions _layoutOptions = new LayoutOptions(_function_2);
    this.setLayoutOptions(_layoutOptions);
  }
  
  public ComplexTypeNode(final ComplexType complexType, @Extension final IDiagramGenerator.Context context, final Consumer<SNode> initializer) {
    this(complexType, context);
    initializer.accept(this);
  }
  
  /**
   * This method is so that the titleText can be overridden by a sub class if needed. This is used
   * with ListTypes, for example, as they want to put their primitive type there if it exists.
   * This base implementation simply returns the ComplexType's name.
   */
  public String titleText(final ComplexType complexType) {
    return complexType.getName();
  }
  
  public abstract List<SModelElement> children(final ComplexType complexType, final IDiagramGenerator.Context context);
  
  /**
   * The letter to put in the circle next to the name. Color is hard coded via CSS.
   */
  public abstract String iconLetter();
  
  @Pure
  public List<String> getComplexTypeFeatures() {
    return this.complexTypeFeatures;
  }
  
  public void setComplexTypeFeatures(final List<String> complexTypeFeatures) {
    this.complexTypeFeatures = complexTypeFeatures;
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
