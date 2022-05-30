package de.fhdo.lemma.data.diagram.elements;

import com.google.common.collect.Iterables;
import de.fhdo.lemma.data.ComplexType;
import de.fhdo.lemma.data.ComplexTypeFeature;
import de.fhdo.lemma.data.diagram.utils.DataDslUtils;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.eclipse.sprotty.LayoutOptions;
import org.eclipse.sprotty.Layouting;
import org.eclipse.sprotty.SCompartment;
import org.eclipse.sprotty.SLabel;
import org.eclipse.sprotty.SModelElement;
import org.eclipse.sprotty.xtext.IDiagramGenerator;
import org.eclipse.xtend.lib.annotations.ToString;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@ToString(skipNulls = true)
@SuppressWarnings("all")
public class ComplexTypeFeatureCompartment extends SCompartment {
  public ComplexTypeFeatureCompartment(final ComplexType complexType, @Extension final IDiagramGenerator.Context context) {
    super();
    String _fullId = DataDslUtils.fullId(complexType);
    String _plus = (_fullId + "_feature-compartment");
    this.setId(context.getIdCache().uniqueId(_plus));
    this.setType("comp:complexTypeFeature");
    this.setLayout(Layouting.LayoutKind.hbox);
    final Consumer<LayoutOptions> _function = (LayoutOptions it) -> {
      it.setHAlign(LayoutOptions.HAlignKind.center);
      it.setHGap(Double.valueOf(2.0));
      it.setPaddingTop(Double.valueOf(2.0));
      it.setPaddingBottom(Double.valueOf(2.0));
      it.setPaddingLeft(Double.valueOf(0.0));
      it.setPaddingRight(Double.valueOf(0.0));
    };
    LayoutOptions _layoutOptions = new LayoutOptions(_function);
    this.setLayoutOptions(_layoutOptions);
    final Consumer<SLabel> _function_1 = (SLabel it) -> {
      String _fullId_1 = DataDslUtils.fullId(complexType);
      String _plus_1 = (_fullId_1 + "_feature_label_opening_bracket");
      it.setId(context.getIdCache().uniqueId(_plus_1));
      it.setText("«");
      it.setType("label:complexTypeFeature");
    };
    SLabel _sLabel = new SLabel(_function_1);
    final Function1<ComplexTypeFeature, String> _function_2 = (ComplexTypeFeature it) -> {
      return it.toString();
    };
    final Function1<String, SModelElement> _function_3 = (String str) -> {
      final Consumer<SLabel> _function_4 = (SLabel it) -> {
        String _fullId_1 = DataDslUtils.fullId(complexType);
        String _plus_1 = (_fullId_1 + "_feature_label_");
        String _plus_2 = (_plus_1 + str);
        it.setId(context.getIdCache().uniqueId(_plus_2));
        it.setText(str);
        it.setType("label:complexTypeFeature");
      };
      SLabel _sLabel_1 = new SLabel(_function_4);
      return ((SModelElement) _sLabel_1);
    };
    List<SModelElement> _map = ListExtensions.<String, SModelElement>map(((List<String>)Conversions.doWrapArray(IterableExtensions.join(ListExtensions.<ComplexTypeFeature, String>map(complexType.getFeatures(), _function_2), ",•,").split(","))), _function_3);
    Iterable<SModelElement> _plus_1 = Iterables.<SModelElement>concat(Collections.<SModelElement>unmodifiableList(CollectionLiterals.<SModelElement>newArrayList(((SModelElement) _sLabel))), _map);
    final Consumer<SLabel> _function_4 = (SLabel it) -> {
      String _fullId_1 = DataDslUtils.fullId(complexType);
      String _plus_2 = (_fullId_1 + "_feature_label_closing_bracket");
      it.setId(context.getIdCache().uniqueId(_plus_2));
      it.setText("»");
      it.setType("label:complexTypeFeature");
    };
    SLabel _sLabel_1 = new SLabel(_function_4);
    this.setChildren(IterableExtensions.<SModelElement>toList(Iterables.<SModelElement>concat(_plus_1, Collections.<SModelElement>unmodifiableList(CollectionLiterals.<SModelElement>newArrayList(((SModelElement) _sLabel_1))))).stream().collect(Collectors.<SModelElement>toList()));
  }
  
  public ComplexTypeFeatureCompartment(final ComplexType complexType, @Extension final IDiagramGenerator.Context context, final Consumer<SCompartment> initializer) {
    this(complexType, context);
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
