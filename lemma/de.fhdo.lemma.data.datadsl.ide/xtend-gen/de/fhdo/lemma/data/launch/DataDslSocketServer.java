package de.fhdo.lemma.data.launch;

import org.eclipse.sprotty.xtext.launch.DiagramLanguageServerSetup;
import org.eclipse.sprotty.xtext.launch.DiagramServerSocketLauncher;

@SuppressWarnings("all")
public class DataDslSocketServer extends DiagramServerSocketLauncher {
  @Override
  public DiagramLanguageServerSetup createSetup() {
    return new DataDslLanguageServerSetup();
  }
  
  public static void main(final String... args) {
    new DataDslSocketServer().run(args);
  }
}
