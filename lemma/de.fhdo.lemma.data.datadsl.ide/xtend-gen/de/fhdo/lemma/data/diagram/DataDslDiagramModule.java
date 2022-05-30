package de.fhdo.lemma.data.diagram;

import org.eclipse.sprotty.IDiagramServer;
import org.eclipse.sprotty.ILayoutEngine;
import org.eclipse.sprotty.xtext.DefaultDiagramModule;
import org.eclipse.sprotty.xtext.IDiagramGenerator;
import org.eclipse.sprotty.xtext.IDiagramServerFactory;
import org.eclipse.sprotty.xtext.LanguageAwareDiagramServer;

@SuppressWarnings("all")
public class DataDslDiagramModule extends DefaultDiagramModule {
  public Class<? extends IDiagramGenerator> bindIDiagramGenerator() {
    return DataDslDiagramGenerator.class;
  }
  
  @Override
  public Class<? extends IDiagramServerFactory> bindIDiagramServerFactory() {
    return DataDslDiagramServerFactory.class;
  }
  
  @Override
  public Class<? extends ILayoutEngine> bindILayoutEngine() {
    return DataDslLayoutEngine.class;
  }
  
  @Override
  public Class<? extends IDiagramServer> bindIDiagramServer() {
    return LanguageAwareDiagramServer.class;
  }
}
