# sdk-commons

sdk-commons is a utility package providing domain models and dtos for organizations and spaces.

## TODO

Currently, the documentation is located in usual files like `README.md`, `CHANGELOG.md`, `CONTRIBUTING.md` and `LICENSE.md` inside the root folder of the repository. That folder is not processed by MkDocs. To build the technical documentation for MkDocs we could follow these steps:

- Move the documentation to Markdown files inside the `docs` folder.
- Build a proper folder/file structure in `docs` and update the navigation in `mkdocs.yaml`.
- Keep the usual files like `README.md`, `CHANGELOG.md`, `CONTRIBUTING.md` and `LICENSE.md` inside the root folder of the repository (developers expect them to be there, especially in open source projects), but keep them short/generic and just refer to the documentation in the `docs` folder.