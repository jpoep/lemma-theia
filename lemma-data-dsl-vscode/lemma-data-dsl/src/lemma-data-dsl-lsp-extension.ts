/********************************************************************************
 * Copyright (c) 2018 TypeFox and others.
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

import * as path from "path";
import * as vscode from "vscode";
import * as net from "net";

import {
  CloseAction,
  ErrorAction,
  Executable,
  LanguageClient,
  LanguageClientOptions,
  ServerOptions,
  StreamInfo,
} from "vscode-languageclient";
import {
  LspLabelEditActionHandler,
  WorkspaceEditActionHandler,
  SprottyLspEditVscodeExtension,
} from "sprotty-vscode/lib/lsp/editing";
import { SprottyDiagramIdentifier, SprottyLspWebview } from "sprotty-vscode/lib/lsp";
import { SprottyWebview } from "sprotty-vscode/lib/sprotty-webview";

export class LemmaDataDslLspVscodeExtension extends SprottyLspEditVscodeExtension {
  constructor(context: vscode.ExtensionContext) {
    super("lemma-data-dsl", context);
  }

  protected getDiagramType(commandArgs: any[]): string | undefined {
    if (
      commandArgs.length === 0 ||
      (commandArgs[0] instanceof vscode.Uri && commandArgs[0].path.endsWith(".data"))
    ) {
      return "data-dsl-diagram";
    }
  }

  createWebView(identifier: SprottyDiagramIdentifier): SprottyWebview {
    const webview = new SprottyLspWebview({
      extension: this,
      identifier,
      localResourceRoots: [this.getExtensionFileUri("pack")],
      scriptUri: this.getExtensionFileUri("pack", "webview.js"),
      singleton: false, // Change this to `true` to enable a singleton view
    });
    webview.addActionHandler(WorkspaceEditActionHandler);
    webview.addActionHandler(LspLabelEditActionHandler);
    return webview;
  }

  private debugServerOptions(): Thenable<StreamInfo> {
    const connectionInfo = {
      port: 5008,
    };
    let socket = net.connect(connectionInfo);
    console.log("Attempting connection");
    return Promise.resolve({
      writer: socket,
      reader: socket,
    });
  }

  private getServerOptions(context: vscode.ExtensionContext): ServerOptions {
    const javaExecutable = "java";
    const languageServerJar = "de.fhdo.lemma.data.datadsl.ide-0.8.5-SNAPSHOT-ls.jar";
    const languageServerPath = path.join(
      "language-server",
      languageServerJar
    );

    const languageServerAbsolutePath = context.asAbsolutePath(languageServerPath);
    const executable: Executable = {
      command: javaExecutable,
      args: ["-jar", languageServerAbsolutePath],
    };

    const serverOptions: ServerOptions = {
      run: executable,
      debug: executable,
    };
    return serverOptions;
  }

  protected activateLanguageClient(context: vscode.ExtensionContext): LanguageClient {
    const serverOptions = this.getServerOptions(context);

    const fileSystemWatcher = vscode.workspace.createFileSystemWatcher("**/*.data");
    context.subscriptions.push(fileSystemWatcher);
    const clientOptions: LanguageClientOptions = {
      documentSelector: [{ scheme: "file", language: "lemma-data-dsl" }],
      synchronize: {
        // Notify the server about file changes to files contained in the workspace
        fileEvents: fileSystemWatcher,
      },
      errorHandler: {
        error: (error, message, closed) => {
          console.log(`Error: ${error}`);
          console.log(`Message: ${message}`);
          console.log(`Closed: ${closed}`);
          return ErrorAction.Continue;
        },
        closed: () => {
          console.log("closed");

          return CloseAction.DoNotRestart;
        },
      },
    };
    const languageClient = new LanguageClient(
      "lemmaDataDslLanguageClient",
      "LEMMA Data DSL Language Server",
      process.env["DEBUG_LANGUAGE_SERVER"] ? this.debugServerOptions : serverOptions,
      clientOptions
    );
    context.subscriptions.push(languageClient.start());
    return languageClient;
  }
}
