package de.fhdo.lemma.data.diagram.elements;

import de.fhdo.lemma.data.ComplexType;
import de.fhdo.lemma.data.DataField;
import de.fhdo.lemma.data.DataFieldFeature;
import de.fhdo.lemma.data.PrimitiveType;
import de.fhdo.lemma.data.PrimitiveValue;
import de.fhdo.lemma.data.Type;
import de.fhdo.lemma.data.diagram.utils.DataDslUtils;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.sprotty.SLabel;
import org.eclipse.sprotty.xtext.IDiagramGenerator;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend.lib.annotations.ToString;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Accessors
@ToString(skipNulls = true)
@SuppressWarnings("all")
public class DataFieldLabel extends SLabel {
  private boolean hidden;
  
  private boolean immutable;
  
  private List<String> dataFieldFeatures;
  
  public DataFieldLabel(final DataField dataField, @Extension final IDiagramGenerator.Context context) {
    super();
    this.setType("label:dataField");
    this.hidden = dataField.isHidden();
    this.immutable = dataField.isImmutable();
    final Function1<DataFieldFeature, String> _function = (DataFieldFeature it) -> {
      return it.toString();
    };
    this.dataFieldFeatures = ListExtensions.<DataFieldFeature, String>map(dataField.getFeatures(), _function);
    this.setText(this.getText(dataField));
    this.setId(context.getIdCache().uniqueId(dataField, DataDslUtils.fullId(dataField)));
  }
  
  public DataFieldLabel(final DataField dataField, final IDiagramGenerator.Context context, final Consumer<SLabel> initializer) {
    this(dataField, context);
    initializer.accept(this);
  }
  
  private String getText(final DataField field) {
    final Type fieldType = field.getEffectiveType();
    String _switchResult = null;
    boolean _matched = false;
    if (fieldType instanceof ComplexType) {
      _matched=true;
      _switchResult = ((ComplexType)fieldType).getName();
    }
    if (!_matched) {
      if (fieldType instanceof PrimitiveType) {
        _matched=true;
        _switchResult = ((PrimitiveType)fieldType).getTypeName();
      }
    }
    final String fieldTypeName = _switchResult;
    String _xifexpression = null;
    PrimitiveValue _initializationValue = field.getInitializationValue();
    boolean _tripleNotEquals = (_initializationValue != null);
    if (_tripleNotEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.append("= ");
      String _valueAsString = field.getInitializationValue().valueAsString();
      _builder.append(_valueAsString, " ");
      _xifexpression = _builder.toString();
    } else {
      _xifexpression = "";
    }
    final String initialValue = _xifexpression;
    StringConcatenation _builder_1 = new StringConcatenation();
    String _name = field.getName();
    _builder_1.append(_name);
    _builder_1.append(": ");
    _builder_1.append(fieldTypeName);
    _builder_1.append(initialValue);
    _builder_1.newLineIfNotEmpty();
    return _builder_1.toString();
  }
  
  @Pure
  public boolean isHidden() {
    return this.hidden;
  }
  
  public void setHidden(final boolean hidden) {
    this.hidden = hidden;
  }
  
  @Pure
  public boolean isImmutable() {
    return this.immutable;
  }
  
  public void setImmutable(final boolean immutable) {
    this.immutable = immutable;
  }
  
  @Pure
  public List<String> getDataFieldFeatures() {
    return this.dataFieldFeatures;
  }
  
  public void setDataFieldFeatures(final List<String> dataFieldFeatures) {
    this.dataFieldFeatures = dataFieldFeatures;
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
