package de.fhdo.lemma.data.diagram.elements;

import de.fhdo.lemma.data.ComplexType;
import de.fhdo.lemma.data.DataField;
import de.fhdo.lemma.data.ListType;
import de.fhdo.lemma.data.PrimitiveType;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.eclipse.sprotty.SCompartment;
import org.eclipse.sprotty.SModelElement;
import org.eclipse.sprotty.xtext.IDiagramGenerator;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend.lib.annotations.ToString;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Accessors
@ToString(skipNulls = true)
@SuppressWarnings("all")
public class ListNode extends ComplexTypeNode {
  public String primitiveType;
  
  public ListNode(final ListType list, @Extension final IDiagramGenerator.Context context) {
    super(list, context);
    PrimitiveType _primitiveType = list.getPrimitiveType();
    String _typeName = null;
    if (_primitiveType!=null) {
      _typeName=_primitiveType.getTypeName();
    }
    this.primitiveType = _typeName;
    this.setType("node:list");
  }
  
  public ListNode(final ListType list, final IDiagramGenerator.Context context, final Consumer<ComplexTypeNode> initializer) {
    this(list, context);
    initializer.accept(this);
  }
  
  @Override
  public List<SModelElement> children(final ComplexType complexType, @Extension final IDiagramGenerator.Context context) {
    List<SModelElement> _xblockexpression = null;
    {
      final ListType list = ((ListType) complexType);
      final Consumer<SCompartment> _function = (SCompartment it) -> {
        String _name = list.getName();
        String _plus = (_name + "_compartment");
        it.setId(context.getIdCache().uniqueId(_plus));
        it.setType("comp:dataFields");
        final Function1<DataField, SModelElement> _function_1 = (DataField it_1) -> {
          DataFieldLabel _dataFieldLabel = new DataFieldLabel(it_1, context);
          return ((SModelElement) _dataFieldLabel);
        };
        it.setChildren(IterableExtensions.<SModelElement>toList(ListExtensions.<DataField, SModelElement>map(list.getDataFields(), _function_1)).stream().collect(
          Collectors.<SModelElement>toList()));
      };
      DataDslCompartment _dataDslCompartment = new DataDslCompartment(_function);
      _xblockexpression = IterableExtensions.<SModelElement>toList(Collections.<SModelElement>unmodifiableList(CollectionLiterals.<SModelElement>newArrayList(((SModelElement) _dataDslCompartment)))).stream().collect(Collectors.<SModelElement>toList());
    }
    return _xblockexpression;
  }
  
  @Override
  public String iconLetter() {
    return "L";
  }
  
  @Override
  public String titleText(final ComplexType complexType) {
    String _xblockexpression = null;
    {
      final ListType listType = ((ListType) complexType);
      PrimitiveType _primitiveType = listType.getPrimitiveType();
      String _typeName = null;
      if (_primitiveType!=null) {
        _typeName=_primitiveType.getTypeName();
      }
      final String primitiveType = _typeName;
      String _xifexpression = null;
      if ((primitiveType == null)) {
        _xifexpression = listType.getName();
      } else {
        StringConcatenation _builder = new StringConcatenation();
        String _name = listType.getName();
        _builder.append(_name);
        _builder.append(" <");
        _builder.append(primitiveType);
        _builder.append(">");
        _xifexpression = _builder.toString();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  @Pure
  public String getPrimitiveType() {
    return this.primitiveType;
  }
  
  public void setPrimitiveType(final String primitiveType) {
    this.primitiveType = primitiveType;
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
