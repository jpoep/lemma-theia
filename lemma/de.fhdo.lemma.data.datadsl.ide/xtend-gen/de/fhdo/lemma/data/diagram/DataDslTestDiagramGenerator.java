package de.fhdo.lemma.data.diagram;

import com.google.inject.Inject;
import de.fhdo.lemma.data.DataModel;
import java.util.Collections;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sprotty.Dimension;
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
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DataDslTestDiagramGenerator implements IDiagramGenerator {
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
      it.setId(context.getIdCache().uniqueId(dataModel, "test"));
      final Consumer<SNode> _function_1 = (SNode it_1) -> {
        it_1.setId("a");
        it_1.setType("node:context");
        final Consumer<SLabel> _function_2 = (SLabel it_2) -> {
          it_2.setText("Node A");
        };
        SLabel _sLabel = new SLabel(_function_2);
        final Consumer<SNode> _function_3 = (SNode it_2) -> {
          final Consumer<SLabel> _function_4 = (SLabel it_3) -> {
            it_3.setId("fuckthatshit");
            it_3.setText("Node A.A");
            Dimension _dimension = new Dimension(100.0, 15.0);
            it_3.setSize(_dimension);
          };
          SLabel _sLabel_1 = new SLabel(_function_4);
          it_2.setChildren(Collections.<SModelElement>unmodifiableList(CollectionLiterals.<SModelElement>newArrayList(_sLabel_1)));
        };
        SNode _sNode = new SNode(_function_3);
        final Consumer<SNode> _function_4 = (SNode it_2) -> {
          it_2.setId("ab");
          final Consumer<SLabel> _function_5 = (SLabel it_3) -> {
            it_3.setId("yo");
            it_3.setText("Node A.B (label 1)");
          };
          SLabel _sLabel_1 = new SLabel(_function_5);
          final Consumer<SLabel> _function_6 = (SLabel it_3) -> {
            it_3.setId("sup");
            it_3.setText("Node A.B (label 2)");
          };
          SLabel _sLabel_2 = new SLabel(_function_6);
          it_2.setChildren(Collections.<SModelElement>unmodifiableList(CollectionLiterals.<SModelElement>newArrayList(_sLabel_1, _sLabel_2)));
        };
        SNode _sNode_1 = new SNode(_function_4);
        it_1.setChildren(Collections.<SModelElement>unmodifiableList(CollectionLiterals.<SModelElement>newArrayList(_sLabel, _sNode, _sNode_1)));
      };
      SNode _sNode = new SNode(_function_1);
      it.setChildren(Collections.<SModelElement>unmodifiableList(CollectionLiterals.<SModelElement>newArrayList(_sNode)));
    };
    return this.<SGraph>traceAndMark(new SGraph(_function), dataModel, context);
  }
  
  public <T extends SModelElement> T traceAndMark(final T sElement, final EObject element, final IDiagramGenerator.Context context) {
    return this._sIssueMarkerDecorator.<T>addIssueMarkers(this._iTraceProvider.<T>trace(sElement, element), element, context);
  }
}
