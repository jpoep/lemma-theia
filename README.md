# Lemma-Theia

This repository contains a distribution of [Theia](https://theia-ide.org/) with [LEMMA](https://github.com/SeelabFhdo/lemma)-capable extensions. As of now, only the Domain Data DSL of LEMMA is supported. Being a language integration extension, the LEMMA extension is distributed as a VSCode extension.

## Running Theia with the extension

- Clone this repository
- `cd lemma-data-dsl-vscode`
- `yarn --cwd webview && yarn --cwd lemma-data-dsl` to install dependencies for the VSCode extension
- `yarn --cwd lemma-data-dsl package` to package the VSCode extension; it generates `lemma-data-dsl-x.x.x.vsix` in the `lemma-data-dsl`directory
- `cd ../lemma-theia`
- `yarn && yarn download:plugins` to install dependencies for Theia
- If you run Linux, there should be a working symlink from `lemma-theia/plugins/lemma-data-dsl-x.x.x.vsix` to `lemma-data-dsl-vscode/lemma-data-dsl/lemma-data-dsl-x.x.x.vsix` already. If not, simply link or copy the file before launching Theia.
- `yarn start:workspace` to launch Theia using an example workspace

## Seeing the example

- Navigate to `localhost:3000`
- Open `CustomerCore.data`
- Right click -> Open in Diagram
- Happiness

![Screenshot of a Theia workspace running the LEMMA extension](/screenshots/theia.png)

As of now, the language server jar is included in source control, which I don't really like. However, as the LEMMA build takes ages and the whole LEMMA situation isn't pretty anyway (I simply copied the entire thing over), it'll stay this way until I can think of a better solution.

The language server can be manually built by running `lemma/build/lemma.sh` (untested on fresh checkouts, it may not behave). After the initial pass, `cd lemma/de.fhdo.lemma.data.datadsl.parent && mvn install` is enough.
