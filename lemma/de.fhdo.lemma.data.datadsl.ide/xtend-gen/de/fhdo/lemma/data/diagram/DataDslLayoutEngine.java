package de.fhdo.lemma.data.diagram;

import java.util.Collections;
import java.util.EnumSet;
import java.util.function.Consumer;
import org.eclipse.elk.alg.layered.options.LayeredOptions;
import org.eclipse.elk.core.options.CoreOptions;
import org.eclipse.elk.core.options.HierarchyHandling;
import org.eclipse.elk.core.options.NodeLabelPlacement;
import org.eclipse.elk.graph.properties.IPropertyHolder;
import org.eclipse.sprotty.Action;
import org.eclipse.sprotty.SGraph;
import org.eclipse.sprotty.SModelRoot;
import org.eclipse.sprotty.layout.ElkLayoutEngine;
import org.eclipse.sprotty.layout.SprottyLayoutConfigurator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class DataDslLayoutEngine extends ElkLayoutEngine {
  @Override
  public void layout(final SModelRoot root, final Action cause) {
    if ((root instanceof SGraph)) {
      final SprottyLayoutConfigurator configurator = new SprottyLayoutConfigurator();
      configurator.configureByType("graph").<String>setProperty(CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID).<HierarchyHandling>setProperty(CoreOptions.HIERARCHY_HANDLING, HierarchyHandling.INCLUDE_CHILDREN).<Double>setProperty(
        CoreOptions.SPACING_NODE_NODE, Double.valueOf(20.0)).<Double>setProperty(CoreOptions.SPACING_LABEL_LABEL, Double.valueOf(20.0));
      final Function1<String, IPropertyHolder> _function = (String it) -> {
        return configurator.configureByType(it);
      };
      final Consumer<IPropertyHolder> _function_1 = (IPropertyHolder it) -> {
        it.<Double>setProperty(CoreOptions.SPACING_NODE_NODE, Double.valueOf(20.0));
      };
      ListExtensions.<String, IPropertyHolder>map(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("node:list", "node:enum", "node:structure")), _function).forEach(_function_1);
      final Function1<String, IPropertyHolder> _function_2 = (String it) -> {
        return configurator.configureByType(it);
      };
      final Consumer<IPropertyHolder> _function_3 = (IPropertyHolder it) -> {
        it.<EnumSet<NodeLabelPlacement>>setProperty(CoreOptions.NODE_LABELS_PLACEMENT, NodeLabelPlacement.outsideTopLeft());
      };
      ListExtensions.<String, IPropertyHolder>map(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("node:context", "node:version")), _function_2).forEach(_function_3);
      this.layout(((SGraph)root), configurator, cause);
    }
  }
}
