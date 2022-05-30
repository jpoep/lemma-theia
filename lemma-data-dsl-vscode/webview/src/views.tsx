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

/** @jsx svg */
import { VNode } from "snabbdom";
import {
  PolylineEdgeView,
  RenderingContext,
  SEdge,
  svg,
  IView,
  SNode,
  SLabelView,
  isEdgeLayoutable,
  setAttr,
  RectangularNodeView,
  SPort,
  SCompartmentView,
  SCompartment,
  IViewArgs,
} from "sprotty";
import { getSubType, Point, toDegrees } from "sprotty-protocol";
import { injectable } from "inversify";
import { ComplexTypeNode, DataFieldLabel, DataOperationLabel, Icon, ListNode } from "./model";

@injectable()
export class IconView implements IView {
  render(element: Icon, context: RenderingContext, args?: IViewArgs): VNode {
    const radius = this.getRadius();
    return (
      <g>
        <circle class-sprotty-icon={true} r={radius} cx={radius} cy={radius}></circle>
        {context.renderChildren(element)}
      </g>
    );
  }

  getRadius() {
    return 20;
  }
}

export class ComplexTypeFeatureView extends SCompartmentView {
  renderAdditionals(compartment: Readonly<SCompartment>, context: RenderingContext, args?: IViewArgs): VNode[] {
    return [<text class-sprotty-label="{true}">&lt;</text>, <text class-sprotty-label="{true}">&gt;</text>];
  }
}

@injectable()
export class DataOperationLabelView extends SLabelView {
  render(model: Readonly<DataOperationLabel>, context: RenderingContext): VNode | undefined {
    if (!isEdgeLayoutable(model) && !this.isVisible(model, context)) {
      return undefined;
    }
    const vnode = (
      <text>
        {model.hidden && (
          <tspan class-sprotty-label={true} class-dataoperation-hidden={model.hidden}>
            -
          </tspan>
        )}
        <tspan class-sprotty-label={true} class-dataoperation-hasnoreturntype={model.hasNoReturnType}>
          {model.text}
        </tspan>
        {model.dataOperationFeatures.map((feature) => (
          <tspan class-sprotty-label={true} class-dataoperation-feature={true} dx="5">
            «{feature}»
          </tspan>
        ))}
      </text>
    );
    const subType = getSubType(model);
    if (subType) {
      setAttr(vnode, "class", subType);
    }
    return vnode;
  }
}
@injectable()
export class DataFieldLabelView extends SLabelView {
  render(model: Readonly<DataFieldLabel>, context: RenderingContext): VNode | undefined {
    if (!isEdgeLayoutable(model) && !this.isVisible(model, context)) {
      return undefined;
    }
    const vnode = (
      <text>
        {model.hidden && (
          <tspan class-sprotty-label={true} class-datafield-hidden={true}>
            -
          </tspan>
        )}
        {model.immutable && (
          <tspan class-sprotty-label={true} class-datafield-immutable={true} dx="5">
            immutable
          </tspan>
        )}
        <tspan class-sprotty-label={true} dx="5">
          {model.text}
        </tspan>
        {model.dataFieldFeatures.map((feature) => (
          <tspan class-sprotty-label={true} class-datafield-feature={true} dx="5">
            «{feature}»
          </tspan>
        ))}
      </text>
    );
    const subType = getSubType(model);
    if (subType) {
      setAttr(vnode, "class", subType);
    }
    return vnode;
  }
}

@injectable()
export class PolylineSolidArrowEdgeView extends PolylineEdgeView {
  protected renderAdditionals(edge: SEdge, segments: Point[], context: RenderingContext): VNode[] {
    const p1 = segments[segments.length - 2];
    const p2 = segments[segments.length - 1];
    return [
      <path
        class-sprotty-edge-arrow={true}
        class-solid={true}
        d="M 10,-7 L 0,0 L 10,7 Z"
        transform={`rotate(${this.angle(p2, p1)} ${p2.x} ${p2.y}) translate(${p2.x} ${p2.y})`}
      />,
    ];
  }

  angle(x0: Point, x1: Point): number {
    return toDegrees(Math.atan2(x1.y - x0.y, x1.x - x0.x));
  }
}

export class PolylineLineArrowEdgeView extends PolylineEdgeView {
  protected renderAdditionals(edge: SEdge, segments: Point[], context: RenderingContext): VNode[] {
    const p1 = segments[segments.length - 2];
    const p2 = segments[segments.length - 1];
    return [
      <path
        class-sprotty-edge-arrow={true}
        class-line={true}
        d="M 10,-7 L 0,0 L 10,7"
        transform={`rotate(${this.angle(p2, p1)} ${p2.x} ${p2.y}) translate(${p2.x} ${p2.y})`}
      />,
    ];
  }

  angle(x0: Point, x1: Point): number {
    return toDegrees(Math.atan2(x1.y - x0.y, x1.x - x0.x));
  }
}

@injectable()
export class SNodeView implements IView {
  render(model: SNode, context: RenderingContext): VNode {
    return <path class-sprotty-button={true} d="M 0,0 L 8,4 L 0,8 Z" />;
  }
}
@injectable()
export class TriangleButtonView implements IView {
  render(model: SPort, context: RenderingContext): VNode {
    return <path class-sprotty-button={true} d="M 0,0 L 8,4 L 0,8 Z" />;
  }
}
