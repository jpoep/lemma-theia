package de.fhdo.lemma.data.diagram.elements;

import de.fhdo.lemma.data.ComplexType;
import de.fhdo.lemma.data.DataOperation;
import de.fhdo.lemma.data.DataOperationFeature;
import de.fhdo.lemma.data.DataOperationParameter;
import de.fhdo.lemma.data.PrimitiveType;
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
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Accessors
@ToString(skipNulls = true)
@SuppressWarnings("all")
public class DataOperationLabel extends SLabel {
  private boolean hidden;
  
  private boolean hasNoReturnType;
  
  private List<String> dataOperationFeatures;
  
  public DataOperationLabel(final DataOperation dataOperation, @Extension final IDiagramGenerator.Context context) {
    super();
    this.setType("label:dataOperation");
    this.hidden = dataOperation.isHidden();
    this.hasNoReturnType = dataOperation.isHasNoReturnType();
    final Function1<DataOperationFeature, String> _function = (DataOperationFeature it) -> {
      return it.toString();
    };
    this.dataOperationFeatures = ListExtensions.<DataOperationFeature, String>map(dataOperation.getFeatures(), _function);
    this.setText(this.getText(dataOperation));
    this.setId(context.getIdCache().uniqueId(dataOperation, DataDslUtils.fullId(dataOperation)));
  }
  
  public DataOperationLabel(final DataOperation dataOperation, final IDiagramGenerator.Context context, final Consumer<SLabel> initializer) {
    this(dataOperation, context);
    initializer.accept(this);
  }
  
  private String getText(final DataOperation dataOperation) {
    final Type operationType = dataOperation.getPrimitiveOrComplexReturnType();
    String _xifexpression = null;
    boolean _isHasNoReturnType = dataOperation.isHasNoReturnType();
    if (_isHasNoReturnType) {
      _xifexpression = "void";
    } else {
      _xifexpression = this.getTypeName(operationType);
    }
    final String fieldTypeName = _xifexpression;
    final Function1<DataOperationParameter, String> _function = (DataOperationParameter it) -> {
      return this.getParameterString(it);
    };
    final List<String> params = ListExtensions.<DataOperationParameter, String>map(dataOperation.getParameters(), _function);
    StringConcatenation _builder = new StringConcatenation();
    String _name = dataOperation.getName();
    _builder.append(_name);
    _builder.append("(");
    String _join = IterableExtensions.join(params, ", ");
    _builder.append(_join);
    _builder.append("): ");
    _builder.append(fieldTypeName);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  private String getTypeName(final Type type) {
    String _switchResult = null;
    boolean _matched = false;
    if (type instanceof ComplexType) {
      _matched=true;
      _switchResult = ((ComplexType)type).getName();
    }
    if (!_matched) {
      if (type instanceof PrimitiveType) {
        _matched=true;
        _switchResult = ((PrimitiveType)type).getTypeName();
      }
    }
    return _switchResult;
  }
  
  private String getParameterString(final DataOperationParameter param) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = param.getName();
    _builder.append(_name);
    _builder.append(": ");
    String _typeName = this.getTypeName(param.getEffectiveType());
    _builder.append(_typeName);
    return _builder.toString();
  }
  
  @Pure
  public boolean isHidden() {
    return this.hidden;
  }
  
  public void setHidden(final boolean hidden) {
    this.hidden = hidden;
  }
  
  @Pure
  public boolean isHasNoReturnType() {
    return this.hasNoReturnType;
  }
  
  public void setHasNoReturnType(final boolean hasNoReturnType) {
    this.hasNoReturnType = hasNoReturnType;
  }
  
  @Pure
  public List<String> getDataOperationFeatures() {
    return this.dataOperationFeatures;
  }
  
  public void setDataOperationFeatures(final List<String> dataOperationFeatures) {
    this.dataOperationFeatures = dataOperationFeatures;
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
