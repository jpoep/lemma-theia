package de.fhdo.lemma.data.diagram;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import de.fhdo.lemma.data.ComplexType;
import de.fhdo.lemma.data.DataField;
import de.fhdo.lemma.data.DataModel;
import de.fhdo.lemma.data.DataOperation;
import de.fhdo.lemma.data.DataOperationParameter;
import de.fhdo.lemma.data.DataStructure;
import de.fhdo.lemma.data.Enumeration;
import de.fhdo.lemma.data.ListType;
import de.fhdo.lemma.data.Version;
import de.fhdo.lemma.data.diagram.elements.ComplexTypeNode;
import de.fhdo.lemma.data.diagram.elements.EnumNode;
import de.fhdo.lemma.data.diagram.elements.ListNode;
import de.fhdo.lemma.data.diagram.elements.StructureNode;
import de.fhdo.lemma.data.diagram.utils.DataDslUtils;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sprotty.SEdge;
import org.eclipse.sprotty.SGraph;
import org.eclipse.sprotty.SLabel;
import org.eclipse.sprotty.SModelElement;
import org.eclipse.sprotty.SModelRoot;
import org.eclipse.sprotty.SNode;
import org.eclipse.sprotty.xtext.IDiagramGenerator;
import org.eclipse.sprotty.xtext.SIssueMarkerDecorator;
import org.eclipse.sprotty.xtext.tracing.ITraceProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class DataDslDiagramGenerator implements IDiagramGenerator {
  @Inject
  @Extension
  private ITraceProvider _iTraceProvider;
  
  @Inject
  @Extension
  private SIssueMarkerDecorator _sIssueMarkerDecorator;
  
  @Override
  public SModelRoot generate(final IDiagramGenerator.Context context) {
    EObject _head = IterableExtensions.<EObject>head(context.getResource().getContents());
    return this.toSGraph(((DataModel) _head), context);
  }
  
  public SGraph toSGraph(final DataModel dataModel, @Extension final IDiagramGenerator.Context context) {
    final Consumer<SGraph> _function = (SGraph it) -> {
      it.setId(context.getIdCache().uniqueId(dataModel, "root"));
      final Function1<Version, SNode> _function_1 = (Version it_1) -> {
        return this.mapVersion(it_1, context);
      };
      List<SNode> _map = ListExtensions.<Version, SNode>map(dataModel.getVersions(), _function_1);
      final Function1<de.fhdo.lemma.data.Context, SNode> _function_2 = (de.fhdo.lemma.data.Context it_1) -> {
        return this.mapContext(it_1, context);
      };
      List<SNode> _map_1 = ListExtensions.<de.fhdo.lemma.data.Context, SNode>map(dataModel.getContexts(), _function_2);
      Iterable<SNode> _plus = Iterables.<SNode>concat(_map, _map_1);
      final Function1<ComplexType, SNode> _function_3 = (ComplexType it_1) -> {
        return this.mapComplexType(it_1, context);
      };
      List<SNode> _map_2 = ListExtensions.<ComplexType, SNode>map(dataModel.getComplexTypes(), _function_3);
      Iterable<SNode> _plus_1 = Iterables.<SNode>concat(_plus, _map_2);
      final Function1<ComplexType, List<SEdge>> _function_4 = (ComplexType it_1) -> {
        return this.getAllEdges(it_1, context);
      };
      Iterable<SEdge> _flatMap = IterableExtensions.<ComplexType, SEdge>flatMap(this.allComplexTypes(dataModel), _function_4);
      it.setChildren(IterableExtensions.<SModelElement>toList(Iterables.<SModelElement>concat(_plus_1, _flatMap)));
    };
    return this.<SGraph>traceAndMark(new SGraph(_function), dataModel, context);
  }
  
  private SNode mapVersion(final Version version, @Extension final IDiagramGenerator.Context context) {
    final Consumer<SNode> _function = (SNode it) -> {
      final String theId = context.getIdCache().uniqueId(version, version.getName());
      it.setId(theId);
      final Consumer<SLabel> _function_1 = (SLabel it_1) -> {
        it_1.setId((theId + "_label"));
        it_1.setText(version.getName());
      };
      SLabel _sLabel = new SLabel(_function_1);
      final Function1<de.fhdo.lemma.data.Context, SNode> _function_2 = (de.fhdo.lemma.data.Context it_1) -> {
        return this.mapContext(it_1, context);
      };
      List<SNode> _map = ListExtensions.<de.fhdo.lemma.data.Context, SNode>map(version.getContexts(), _function_2);
      Iterable<SModelElement> _plus = Iterables.<SModelElement>concat(Collections.<SModelElement>unmodifiableList(CollectionLiterals.<SModelElement>newArrayList(((SModelElement) _sLabel))), _map);
      final Function1<ComplexType, SNode> _function_3 = (ComplexType it_1) -> {
        return this.mapComplexType(it_1, context);
      };
      List<SNode> _map_1 = ListExtensions.<ComplexType, SNode>map(version.getComplexTypes(), _function_3);
      it.setChildren(IterableExtensions.<SModelElement>toList(Iterables.<SModelElement>concat(_plus, _map_1)).stream().collect(Collectors.<SModelElement>toList()));
      it.setType("node:version");
    };
    return this.<SNode>traceAndMark(new SNode(_function), version, context);
  }
  
  private SNode mapContext(final de.fhdo.lemma.data.Context lemmaContext, @Extension final IDiagramGenerator.Context context) {
    final Consumer<SNode> _function = (SNode it) -> {
      final String nodeId = context.getIdCache().uniqueId(lemmaContext, lemmaContext.getName());
      it.setId(nodeId);
      final Consumer<SLabel> _function_1 = (SLabel it_1) -> {
        it_1.setId(context.getIdCache().uniqueId((nodeId + "_label")));
        it_1.setText(lemmaContext.getName());
      };
      SLabel _sLabel = new SLabel(_function_1);
      final Function1<ComplexType, SNode> _function_2 = (ComplexType it_1) -> {
        return this.mapComplexType(it_1, context);
      };
      List<SNode> _map = ListExtensions.<ComplexType, SNode>map(lemmaContext.getComplexTypes(), _function_2);
      it.setChildren(IterableExtensions.<SModelElement>toList(Iterables.<SModelElement>concat(Collections.<SModelElement>unmodifiableList(CollectionLiterals.<SModelElement>newArrayList(((SModelElement) _sLabel))), _map)).stream().collect(Collectors.<SModelElement>toList()));
      it.setType("node:context");
    };
    return this.<SNode>traceAndMark(new SNode(_function), lemmaContext, context);
  }
  
  private SNode mapComplexType(final ComplexType complexType, @Extension final IDiagramGenerator.Context context) {
    ComplexTypeNode _switchResult = null;
    boolean _matched = false;
    if (complexType instanceof DataStructure) {
      _matched=true;
      _switchResult = new StructureNode(((DataStructure)complexType), context);
    }
    if (!_matched) {
      if (complexType instanceof ListType) {
        _matched=true;
        _switchResult = new ListNode(((ListType)complexType), context);
      }
    }
    if (!_matched) {
      if (complexType instanceof Enumeration) {
        _matched=true;
        _switchResult = new EnumNode(((Enumeration)complexType), context);
      }
    }
    return this.<ComplexTypeNode>traceAndMark(_switchResult, complexType, context);
  }
  
  private List<SEdge> getAllEdges(final ComplexType complexType, @Extension final IDiagramGenerator.Context context) {
    List<SEdge> _xblockexpression = null;
    {
      List<SEdge> generalizationEdges = Collections.<SEdge>unmodifiableList(CollectionLiterals.<SEdge>newArrayList());
      if ((complexType instanceof DataStructure)) {
        SEdge _generalizationEdge = this.getGeneralizationEdge(((DataStructure)complexType), context);
        generalizationEdges = Collections.<SEdge>unmodifiableList(CollectionLiterals.<SEdge>newArrayList(_generalizationEdge));
      }
      final Function1<DataField, SEdge> _function = (DataField it) -> {
        return this.getDataFieldEdges(it, context);
      };
      List<SEdge> _map = ListExtensions.<DataField, SEdge>map(this.getAllDataFields(complexType), _function);
      final Function1<DataOperation, List<SEdge>> _function_1 = (DataOperation it) -> {
        return this.getDataOperationEdges(it, context);
      };
      Iterable<SEdge> _flatMap = IterableExtensions.<DataOperation, SEdge>flatMap(this.getAllDataOperations(complexType), _function_1);
      Iterable<SEdge> _plus = Iterables.<SEdge>concat(_map, _flatMap);
      final Function<SEdge, Object> _function_2 = (SEdge edge) -> {
        return edge.getId();
      };
      _xblockexpression = IterableExtensions.<SEdge>toList(IterableExtensions.<SEdge>filterNull(Iterables.<SEdge>concat(_plus, generalizationEdges))).stream().filter(DataDslUtils.<SEdge>distinctByKey(_function_2)).collect(Collectors.<SEdge>toList());
    }
    return _xblockexpression;
  }
  
  private List<DataField> getAllDataFields(final ComplexType complexType) {
    List<DataField> _switchResult = null;
    boolean _matched = false;
    if (complexType instanceof DataStructure) {
      _matched=true;
      _switchResult = ((DataStructure)complexType).getDataFields();
    }
    if (!_matched) {
      if (complexType instanceof ListType) {
        _matched=true;
        _switchResult = ((ListType)complexType).getDataFields();
      }
    }
    if (!_matched) {
      _switchResult = Collections.<DataField>unmodifiableList(CollectionLiterals.<DataField>newArrayList());
    }
    return _switchResult;
  }
  
  private List<DataOperation> getAllDataOperations(final ComplexType complexType) {
    List<DataOperation> _switchResult = null;
    boolean _matched = false;
    if (complexType instanceof DataStructure) {
      _matched=true;
      _switchResult = ((DataStructure)complexType).getOperations();
    }
    if (!_matched) {
      _switchResult = Collections.<DataOperation>unmodifiableList(CollectionLiterals.<DataOperation>newArrayList());
    }
    return _switchResult;
  }
  
  private SEdge getEdge(final EObject source, final EObject target, final String idBase, final String subType, @Extension final IDiagramGenerator.Context context) {
    final Consumer<SEdge> _function = (SEdge it) -> {
      it.setSourceId(context.getIdCache().getId(source));
      it.setTargetId(context.getIdCache().getId(target));
      String _sourceId = it.getSourceId();
      String _plus = (_sourceId + ":");
      String _targetId = it.getTargetId();
      String _plus_1 = (_plus + _targetId);
      it.setId(_plus_1);
      it.setType(("edge:" + subType));
    };
    return new SEdge(_function);
  }
  
  private List<SEdge> getDataOperationEdges(final DataOperation operation, @Extension final IDiagramGenerator.Context context) {
    ComplexType _complexReturnType = operation.getComplexReturnType();
    final Function1<DataOperationParameter, ComplexType> _function = (DataOperationParameter it) -> {
      return it.getComplexType();
    };
    List<ComplexType> _map = ListExtensions.<DataOperationParameter, ComplexType>map(operation.getParameters(), _function);
    final Function1<ComplexType, SEdge> _function_1 = (ComplexType it) -> {
      return this.getEdge(operation.eContainer(), it, DataDslUtils.fullId(operation), "dependency", context);
    };
    return IterableExtensions.<SEdge>toList(IterableExtensions.<ComplexType, SEdge>map(IterableExtensions.<ComplexType>filterNull(Iterables.<ComplexType>concat(Collections.<ComplexType>unmodifiableList(CollectionLiterals.<ComplexType>newArrayList(_complexReturnType)), _map)), _function_1)).stream().distinct().collect(Collectors.<SEdge>toList());
  }
  
  private SEdge getDataFieldEdges(final DataField field, @Extension final IDiagramGenerator.Context context) {
    ComplexType _complexType = field.getComplexType();
    boolean _tripleNotEquals = (_complexType != null);
    if (_tripleNotEquals) {
      return this.getEdge(field.eContainer(), field.getEffectiveType(), DataDslUtils.fullId(field), "association", context);
    }
    return null;
  }
  
  private SEdge getGeneralizationEdge(final DataStructure structure, @Extension final IDiagramGenerator.Context context) {
    DataStructure _super = structure.getSuper();
    boolean _tripleNotEquals = (_super != null);
    if (_tripleNotEquals) {
      return this.getEdge(structure, structure.getSuper(), DataDslUtils.fullId(structure), "generalization", context);
    }
    return null;
  }
  
  private Iterable<ComplexType> allComplexTypes(final DataModel model) {
    final Function1<Version, EList<de.fhdo.lemma.data.Context>> _function = (Version it) -> {
      return it.getContexts();
    };
    final Function1<de.fhdo.lemma.data.Context, EList<ComplexType>> _function_1 = (de.fhdo.lemma.data.Context it) -> {
      return it.getComplexTypes();
    };
    Iterable<ComplexType> _flatMap = IterableExtensions.<de.fhdo.lemma.data.Context, ComplexType>flatMap(IterableExtensions.<Version, de.fhdo.lemma.data.Context>flatMap(model.getVersions(), _function), _function_1);
    final Function1<Version, EList<ComplexType>> _function_2 = (Version it) -> {
      return it.getComplexTypes();
    };
    Iterable<ComplexType> _flatMap_1 = IterableExtensions.<Version, ComplexType>flatMap(model.getVersions(), _function_2);
    Iterable<ComplexType> _plus = Iterables.<ComplexType>concat(_flatMap, _flatMap_1);
    final Function1<de.fhdo.lemma.data.Context, EList<ComplexType>> _function_3 = (de.fhdo.lemma.data.Context it) -> {
      return it.getComplexTypes();
    };
    Iterable<ComplexType> _flatMap_2 = IterableExtensions.<de.fhdo.lemma.data.Context, ComplexType>flatMap(model.getContexts(), _function_3);
    Iterable<ComplexType> _plus_1 = Iterables.<ComplexType>concat(_plus, _flatMap_2);
    EList<ComplexType> _complexTypes = model.getComplexTypes();
    return Iterables.<ComplexType>concat(_plus_1, _complexTypes);
  }
  
  private <T extends SModelElement> T traceAndMark(final T sElement, final EObject element, final IDiagramGenerator.Context context) {
    return this._sIssueMarkerDecorator.<T>addIssueMarkers(this._iTraceProvider.<T>trace(sElement, element), element, context);
  }
}
