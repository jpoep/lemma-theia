package de.fhdo.lemma.data.launch;

import org.eclipse.sprotty.xtext.launch.DiagramLanguageServerSetup;
import org.eclipse.sprotty.xtext.launch.DiagramServerLauncher;

@SuppressWarnings("all")
public class DataDslServerLauncher extends DiagramServerLauncher {
  @Override
  public DiagramLanguageServerSetup createSetup() {
    return new DataDslLanguageServerSetup();
  }
  
  public static void main(final String[] args) {
    new DataDslServerLauncher().run(args);
  }
}
