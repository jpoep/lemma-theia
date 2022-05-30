package de.fhdo.lemma.data.diagram.elements;

import de.fhdo.lemma.data.ComplexType;
import de.fhdo.lemma.data.DataField;
import de.fhdo.lemma.data.DataOperation;
import de.fhdo.lemma.data.DataStructure;
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
public class StructureNode extends ComplexTypeNode {
  public StructureNode(final DataStructure structure, @Extension final IDiagramGenerator.Context context) {
    super(structure, context);
    this.setType("node:structure");
  }
  
  public StructureNode(final DataStructure structure, final IDiagramGenerator.Context context, final Consumer<ComplexTypeNode> initializer) {
    this(structure, context);
    initializer.accept(this);
  }
  
  @Override
  public List<SModelElement> children(final ComplexType complexType, @Extension final IDiagramGenerator.Context context) {
    List<SModelElement> _xblockexpression = null;
    {
      final DataStructure structure = ((DataStructure) complexType);
      final Consumer<SCompartment> _function = (SCompartment it) -> {
        String _buildQualifiedName = structure.buildQualifiedName("_");
        String _plus = (_buildQualifiedName + "_compartment_fields");
        it.setId(context.getIdCache().uniqueId(_plus));
        it.setType("comp:dataFields");
        final Function1<DataField, SModelElement> _function_1 = (DataField it_1) -> {
          DataFieldLabel _dataFieldLabel = new DataFieldLabel(it_1, context);
          return ((SModelElement) _dataFieldLabel);
        };
        it.setChildren(IterableExtensions.<SModelElement>toList(ListExtensions.<DataField, SModelElement>map(structure.getDataFields(), _function_1)).stream().collect(Collectors.<SModelElement>toList()));
      };
      DataDslCompartment _dataDslCompartment = new DataDslCompartment(_function);
      final Consumer<SCompartment> _function_1 = (SCompartment it) -> {
        String _buildQualifiedName = structure.buildQualifiedName("_");
        String _plus = (_buildQualifiedName + "_compartment_operations");
        it.setId(context.getIdCache().uniqueId(_plus));
        it.setType("comp:dataOperations");
        final Function1<DataOperation, SModelElement> _function_2 = (DataOperation it_1) -> {
          DataOperationLabel _dataOperationLabel = new DataOperationLabel(it_1, context);
          return ((SModelElement) _dataOperationLabel);
        };
        it.setChildren(IterableExtensions.<SModelElement>toList(ListExtensions.<DataOperation, SModelElement>map(structure.getOperations(), _function_2)).stream().collect(Collectors.<SModelElement>toList()));
      };
      DataDslCompartment _dataDslCompartment_1 = new DataDslCompartment(_function_1);
      _xblockexpression = IterableExtensions.toList(Collections.<SModelElement>unmodifiableList(CollectionLiterals.<SModelElement>newArrayList(((SModelElement) _dataDslCompartment), _dataDslCompartment_1))).stream().collect(Collectors.<SModelElement>toList());
    }
    return _xblockexpression;
  }
  
  @Override
  public String iconLetter() {
    return "S";
  }
}
