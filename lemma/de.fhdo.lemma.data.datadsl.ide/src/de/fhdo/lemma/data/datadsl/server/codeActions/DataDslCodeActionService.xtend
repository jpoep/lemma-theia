package de.fhdo.lemma.data.datadsl.server.codeActions

class DataDslCodeActionService {
	}

//class DataDslCodeActionService  implements ICodeActionService2  {
//	static val CREATE_STATE_KIND = 'sprotty.create.state'
//	static val CREATE_EVENT_KIND = 'sprotty.create.event'
//
//	override getCodeActions(Options options) {
//		var root = options.resource.contents.head
//		if (root instanceof StateMachine)
//			createCodeActions(root, options.codeActionParams, options.document)
//		else
//			emptyList
//	}
//
//	private def dispatch List<Either<Command, CodeAction>> createCodeActions(StateMachine stateMachine,
//		CodeActionParams params, Document document) {
//		val result = <Either<Command, CodeAction>>newArrayList
//		if (CREATE_STATE_KIND.matchesContext(params)) {
//			result.add(Either.forRight(new CodeAction => [
//				kind = CREATE_STATE_KIND
//				title = 'new State'
//				edit = createInsertWorkspaceEdit(
//					stateMachine.eResource.URI,
//					document.getPosition(document.contents.length),
//					'''«'\n'»state «getNewName('state', stateMachine.states.map[name])»'''
//				)
//			]));
//		}
//		if (CREATE_EVENT_KIND.matchesContext(params)) {
//			result.add(Either.forRight(new CodeAction => [
//				kind = CREATE_EVENT_KIND
//				title = 'new Event'
//				edit = createInsertWorkspaceEdit(
//					stateMachine.eResource.URI,
//					document.getPosition(document.contents.length),
//					'''«'\n'»event «getNewName('event', stateMachine.events.map[name])»'''
//				)
//			]));
//		}
//		return result
//	}
//
//	private def matchesContext(String kind, CodeActionParams params) {
//		if (params.context?.only === null)
//			return true
//		else
//			return params.context.only.exists[kind.startsWith(it)]
//	}
//
//	private def String getNewName(String prefix, List<? extends String> siblings) {
//		for (var i = 0;; i++) {
//			val currentName = prefix + i
//			if (!siblings.exists[it == currentName])
//				return currentName
//		}
//	}
//
//	private def dispatch List<Either<Command, CodeAction>> createCodeActions(EObject element, CodeActionParams params,
//		Document document) {
//		return emptyList
//	}
//
//	private def createInsertWorkspaceEdit(URI uri, Position position, String text) {
//		new WorkspaceEdit => [
//			changes = #{uri.toString -> #[new TextEdit(new Range(position, position), text)]}
//		]
//	}
//}
