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

import {
    boundsFeature,
    CreateElementAction, CreatingOnDrag, EdgePlacement, fadeFeature, layoutableChildFeature, layoutContainerFeature, ManhattanEdgeRouter, RectangularNode,
    RectangularPort, SEdge, SLabel, SNode, SRoutableElement, SShapeElement
} from 'sprotty';
import { Action, Point, SEdge as SEdgeSchema } from 'sprotty-protocol';

export class Icon extends SShapeElement {
    static readonly DEFAULT_FEATURES = [boundsFeature, layoutContainerFeature, layoutableChildFeature, fadeFeature];
    
    position = {
        x: 0,
        y: 0
    }

    size = {
        width: 20,
        height: 20
    };
}

export class ComplexTypeNode extends SNode {
    complexTypeFeatures: string[];
}

export class ListNode extends ComplexTypeNode {
    primitiveType: string | undefined;
}

export class DataFieldLabel extends SLabel {
    hidden: boolean;
    immutable: boolean;
    dataFieldFeatures: string[];
}

export class DataOperationLabel extends SLabel {
    hidden: boolean;
    hasNoReturnType: boolean;
    dataOperationFeatures: string[];
}

export class DataDslEdge extends SEdge {
    routerKind = ManhattanEdgeRouter.KIND;
    targetAnchorCorrection = Math.sqrt(5);
}

export class DataDslEdgeLabel extends SLabel {
    edgePlacement = <EdgePlacement> {
        rotate: true,
        position: 0.6
    };
}

export class DataDslNode extends RectangularNode {
    canConnect(routable: SRoutableElement, role: string) {
        return true;
    }
}

export class CreateTransitionPort extends RectangularPort implements CreatingOnDrag {
    createAction(id: string): Action {
        const edge: SEdgeSchema = {
            id,
            type: 'edge',
            sourceId: this.parent.id,
            targetId: this.id
        };
        return CreateElementAction.create(edge, { containerId: this.root.id });
    }
}