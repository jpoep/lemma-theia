package de.fhdo.lemma.data.diagram.elements;

import de.fhdo.lemma.data.EnumerationField;
import de.fhdo.lemma.data.PrimitiveValue;
import de.fhdo.lemma.data.diagram.utils.DataDslUtils;
import java.util.function.Consumer;
import org.eclipse.sprotty.SLabel;
import org.eclipse.sprotty.xtext.IDiagramGenerator;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend.lib.annotations.ToString;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Accessors
@ToString(skipNulls = true)
@SuppressWarnings("all")
public class EnumFieldLabel extends SLabel {
  public EnumFieldLabel(final EnumerationField field, @Extension final IDiagramGenerator.Context context) {
    super();
    this.setType("label:enumField");
    this.setText(this.getText(field));
    this.setId(context.getIdCache().uniqueId(field, DataDslUtils.fullId(field)));
  }
  
  public EnumFieldLabel(final EnumerationField field, final IDiagramGenerator.Context context, final Consumer<SLabel> initializer) {
    this(field, context);
    initializer.accept(this);
  }
  
  private String getText(final EnumerationField field) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      PrimitiveValue _initializationValue = field.getInitializationValue();
      boolean _tripleNotEquals = (_initializationValue != null);
      if (_tripleNotEquals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(\"");
        String _valueAsString = field.getInitializationValue().valueAsString();
        _builder.append(_valueAsString);
        _builder.append("\")");
        _xifexpression = _builder.toString();
      } else {
        _xifexpression = "";
      }
      final String defaultValue = _xifexpression;
      StringConcatenation _builder_1 = new StringConcatenation();
      String _name = field.getName();
      _builder_1.append(_name);
      _builder_1.append(defaultValue);
      _xblockexpression = _builder_1.toString();
    }
    return _xblockexpression;
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
