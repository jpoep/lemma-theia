package de.fhdo.lemma.data.launch;

import com.google.gson.GsonBuilder;
import java.util.Map;
import org.eclipse.elk.alg.layered.options.LayeredMetaDataProvider;
import org.eclipse.elk.core.util.persistence.ElkGraphResourceFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sprotty.layout.ElkLayoutEngine;
import org.eclipse.sprotty.server.json.EnumTypeAdapter;
import org.eclipse.sprotty.xtext.EditActionTypeAdapterFactory;
import org.eclipse.sprotty.xtext.launch.DiagramLanguageServerSetup;
import org.eclipse.sprotty.xtext.ls.SyncDiagramServerModule;
import org.eclipse.xtext.ide.server.ServerModule;
import org.eclipse.xtext.util.Modules2;

@SuppressWarnings("all")
public class DataDslLanguageServerSetup extends DiagramLanguageServerSetup {
  @Override
  public void setupLanguages() {
    LayeredMetaDataProvider _layeredMetaDataProvider = new LayeredMetaDataProvider();
    ElkLayoutEngine.initialize(_layeredMetaDataProvider);
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    ElkGraphResourceFactory _elkGraphResourceFactory = new ElkGraphResourceFactory();
    _extensionToFactoryMap.put("elkg", _elkGraphResourceFactory);
  }
  
  @Override
  public GsonBuilder configureGson(final GsonBuilder gsonBuilder) {
    EditActionTypeAdapterFactory _editActionTypeAdapterFactory = new EditActionTypeAdapterFactory();
    GsonBuilder _registerTypeAdapterFactory = gsonBuilder.registerTypeAdapterFactory(_editActionTypeAdapterFactory);
    EnumTypeAdapter.Factory _factory = new EnumTypeAdapter.Factory();
    return _registerTypeAdapterFactory.registerTypeAdapterFactory(_factory);
  }
  
  @Override
  public com.google.inject.Module getLanguageServerModule() {
    ServerModule _serverModule = new ServerModule();
    SyncDiagramServerModule _syncDiagramServerModule = new SyncDiagramServerModule();
    return Modules2.mixin(_serverModule, _syncDiagramServerModule);
  }
}
