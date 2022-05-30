package de.fhdo.lemma.data.diagram

import com.google.inject.Inject
import de.fhdo.lemma.data.DataModel
import org.eclipse.emf.ecore.EObject
import org.eclipse.sprotty.Dimension
import org.eclipse.sprotty.SGraph
import org.eclipse.sprotty.SLabel
import org.eclipse.sprotty.SModelElement
import org.eclipse.sprotty.SNode
import org.eclipse.sprotty.xtext.IDiagramGenerator
import org.eclipse.sprotty.xtext.SIssueMarkerDecorator
import org.eclipse.sprotty.xtext.tracing.ITraceProvider

class DataDslTestDiagramGenerator implements IDiagramGenerator {

	@Inject extension ITraceProvider
	@Inject extension SIssueMarkerDecorator

	override generate(IDiagramGenerator.Context context) {
		(context.resource.contents.head as DataModel).toSGraph(context)
	}

	def toSGraph(DataModel dataModel, extension IDiagramGenerator.Context context) {
		(new SGraph [
			id = idCache.uniqueId(dataModel, "test")
			children = #[
//				new SNode [
//					children = #[
//						new SLabel [
//							text = "Node C"
//						],
//						new SNode [
//							children = #[
//								new SLabel[
//									text = "Node C.A"
//								],
//								new SNode [
//									
//									children = #[
//										new SLabel[
//											text = "Node C.A.A"
//										]
//									]
//								],
//								new SNode [
//									children = #[
//										new SLabel[
//											text = "Node C.A.B"
//										]
//									]
//								]
//							]
//						],
//						new SNode [
//							children = #[
//								new SLabel[
//									id="nodecb"
//									text = "Node C.B"
//								],
//								new SNode [
//									children = #[
//										new SLabel[
//											id="nodecba"
//											text = "Node C.B.A"
//										]
//									]
//								],
//								new SNode [
//									children = #[
//										new SLabel[
//											id="nodecbb"
//											text = "Node C.B.B"
//										]
//									]
//								]
//							]
//						]
//						]
//					],
				new SNode [
					id="a"
					type="node:context"
					children = #[
						new SLabel [
							text = "Node A"
						],
						new SNode [
							children = #[
								new SLabel [
									id = "fuckthatshit"
									text = "Node A.A"
									size = new Dimension(100.0, 15.0)	
								]
							]

						],
						new SNode [
							id ="ab"
							children = #[
								new SLabel [
									id = "yo"
									text = "Node A.B (label 1)"
								],
								new SLabel [
									id = "sup"
									text = "Node A.B (label 2)"
									
								]
							]
//							type="node:list"
						]
					]
				]
//				,
// 				new SNode [
//					children = #[
//						new SLabel [
//							id="nodeb"
//							text = "Node B"
//						],
//						new SNode [
//							children = #[
//								new SLabel [
//									text = "Node B.A"
//									id="nodeba"
//								]
//							]
//						]
//					]
//				]
			]
		]
		).

	traceAndMark
	(dataModel, context)}

	def <T extends SModelElement> T traceAndMark(T sElement, EObject element, IDiagramGenerator.Context context) {
		sElement.trace(element).addIssueMarkers(element, context)
	}
}
