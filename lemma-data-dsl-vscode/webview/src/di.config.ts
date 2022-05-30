/********************************************************************************
 * Copyright (c) 2020 TypeFox and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 ********************************************************************************/

import "../css/diagram.css";
import "sprotty/css/sprotty.css";

import { Container, ContainerModule } from "inversify";
import {
  configureCommand,
  configureModelElement,
  ConsoleLogger,
  CreateElementCommand,
  HtmlRoot,
  HtmlRootView,
  LogLevel,
  overrideViewerOptions,
  RectangularNodeView,
  SGraphView,
  SLabelView,
  SRoutingHandle,
  SRoutingHandleView,
  TYPES,
  loadDefaultModules,
  SGraph,
  SLabel,
  editLabelFeature,
  SEdge,
  PolylineEdgeView,
  SCompartment,
  SCompartmentView,
  RectangularNode,
} from "sprotty";
import {
  ComplexTypeFeatureView,
  DataFieldLabelView,
  DataOperationLabelView,
  IconView,
  PolylineLineArrowEdgeView,
  PolylineSolidArrowEdgeView,
} from "./views";
import { ComplexTypeNode, DataFieldLabel, DataOperationLabel, Icon, ListNode } from "./model";

const lemmaDataDslDiagramModule = new ContainerModule((bind, unbind, isBound, rebind) => {
  rebind(TYPES.ILogger).to(ConsoleLogger).inSingletonScope();
  rebind(TYPES.LogLevel).toConstantValue(LogLevel.warn);

  const context = { bind, unbind, isBound, rebind };
  configureModelElement(context, "graph", SGraph, SGraphView);

  configureModelElement(context, "comp", SCompartment, SCompartmentView);
  configureModelElement(context, "comp:header", SCompartment, ComplexTypeFeatureView);
  configureModelElement(context, "comp:enumFields", SCompartment, SCompartmentView);
  configureModelElement(context, "comp:dataFields", SCompartment, SCompartmentView);
  configureModelElement(context, "comp:complexTypeFeature", SCompartment, ComplexTypeFeatureView);
  configureModelElement(context, "comp:dataOperations", SCompartment, SCompartmentView);

  configureModelElement(context, "node", RectangularNode, RectangularNodeView);
  configureModelElement(context, "node:version", RectangularNode, RectangularNodeView);
  configureModelElement(context, "node:context", RectangularNode, RectangularNodeView);
  configureModelElement(context, "node:structure", ComplexTypeNode, RectangularNodeView);
  configureModelElement(context, "node:list", ListNode, RectangularNodeView);
  configureModelElement(context, "node:enum", ComplexTypeNode, RectangularNodeView);

  configureModelElement(context, "label", SLabel, SLabelView, {
    enable: [editLabelFeature],
  });
  configureModelElement(context, "label:complexType", SLabel, SLabelView);
  configureModelElement(context, "label:complexTypeFeature", SLabel, SLabelView);
  configureModelElement(context, "label:dataField", DataFieldLabel, DataFieldLabelView);
  configureModelElement(context, "label:dataOperation", DataOperationLabel, DataOperationLabelView);
  configureModelElement(context, "label:enumField", SLabel, SLabelView);
  configureModelElement(context, "label:icon", SLabel, SLabelView);

  configureModelElement(context, "edge", SEdge, PolylineEdgeView);
  configureModelElement(context, "edge:generalization", SEdge, PolylineSolidArrowEdgeView);
  configureModelElement(context, "edge:association", SEdge, PolylineLineArrowEdgeView);
  configureModelElement(context, "edge:dependency", SEdge, PolylineLineArrowEdgeView);

  configureModelElement(context, "icon", Icon, IconView);


  configureModelElement(context, "html", HtmlRoot, HtmlRootView);
  configureModelElement(context, "routing-point", SRoutingHandle, SRoutingHandleView);

  configureCommand(context, CreateElementCommand);
});

export function createLemmaDataDslDiagramContainer(widgetId: string): Container {
  const container = new Container();
  loadDefaultModules(container);
  container.load(lemmaDataDslDiagramModule);
  overrideViewerOptions(container, {
    needsClientLayout: true,
    needsServerLayout: true,
    baseDiv: widgetId,
  });
  return container;
}
