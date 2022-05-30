package de.fhdo.lemma.data.diagram;

import java.util.Collections;
import java.util.List;
import org.eclipse.sprotty.xtext.DiagramServerFactory;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class DataDslDiagramServerFactory extends DiagramServerFactory {
  @Override
  public List<String> getDiagramTypes() {
    return Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("data-dsl-diagram"));
  }
}
