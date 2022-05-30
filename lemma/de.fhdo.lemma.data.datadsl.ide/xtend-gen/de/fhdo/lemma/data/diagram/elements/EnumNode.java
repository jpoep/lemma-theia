package de.fhdo.lemma.data.diagram.elements;

import de.fhdo.lemma.data.ComplexType;
import de.fhdo.lemma.data.Enumeration;
import de.fhdo.lemma.data.EnumerationField;
import de.fhdo.lemma.data.diagram.utils.DataDslUtils;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.eclipse.sprotty.SCompartment;
import org.eclipse.sprotty.SModelElement;
import org.eclipse.sprotty.xtext.IDiagramGenerator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class EnumNode extends ComplexTypeNode {
  public EnumNode(final Enumeration enumType, @Extension final IDiagramGenerator.Context context) {
    super(enumType, context);
    this.setType("node:enum");
  }
  
  public EnumNode(final Enumeration enumType, final IDiagramGenerator.Context context, final Consumer<ComplexTypeNode> initializer) {
    this(enumType, context);
    initializer.accept(this);
  }
  
  @Override
  public List<SModelElement> children(final ComplexType complexType, @Extension final IDiagramGenerator.Context context) {
    List<SModelElement> _xblockexpression = null;
    {
      final Enumeration enumType = ((Enumeration) complexType);
      final Consumer<SCompartment> _function = (SCompartment it) -> {
        String _fullId = DataDslUtils.fullId(enumType);
        String _plus = (_fullId + "_compartment");
        it.setId(context.getIdCache().uniqueId(_plus));
        it.setType("comp:enumFields");
        final Function1<EnumerationField, SModelElement> _function_1 = (EnumerationField it_1) -> {
          EnumFieldLabel _enumFieldLabel = new EnumFieldLabel(it_1, context);
          return ((SModelElement) _enumFieldLabel);
        };
        it.setChildren(IterableExtensions.<SModelElement>toList(ListExtensions.<EnumerationField, SModelElement>map(enumType.getFields(), _function_1)).stream().collect(
          Collectors.<SModelElement>toList()));
      };
      DataDslCompartment _dataDslCompartment = new DataDslCompartment(_function);
      _xblockexpression = IterableExtensions.<SModelElement>toList(Collections.<SModelElement>unmodifiableList(CollectionLiterals.<SModelElement>newArrayList(((SModelElement) _dataDslCompartment)))).stream().collect(Collectors.<SModelElement>toList());
    }
    return _xblockexpression;
  }
  
  @Override
  public String iconLetter() {
    return "E";
  }
}
