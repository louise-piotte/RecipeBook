# WP05 Section T hot paprika integration — R305 — 2026-10-16

## Decision

Promoted the held legacy ID `ingredient-ref-hot-paprika` to identity-only **hot paprika / paprika fort** in `BAKING_AND_SPICE`. Added French search aliases `poudre de paprika fort` and `paprika épicé broyé`, attested as single-spice labels in the CFIA Canadian survey. Kept generic paprika, smoked paprika, cayenne, red chili flakes, chili powder, Hungarian wording, and products combining smoked and hot styles distinct.

The official Codex and ISO standards classify hot paprika as ground paprika and distinguish it from ground chilli pepper. The 114-recipe, 1,123-row bundled corpus has no matching hot-paprika phrase, so no recipe line was linked or relinked.

Bulk Barn’s 100 g nutrition-label basis is not a recipe measure. A general-purpose converter’s 2.3 g/tsp assertion lacks a measurement method or product-specific source, so it was not adopted. Density, unit mappings, forms, conversions, yields, and measurement observations remain absent. Illinois Extension says cayenne may work when hot paprika is unavailable but gives no amount or recipe context; the ledger records that suggestion as blocked evidence with no replacement entry or active rule.

## Data changes

- `ingredient-references.v1.json`: added one reference using the existing held ID.
- `research-ledger.v1.json`: promoted the candidate; added seven source records, one blocked substitution finding, and decisions for identity and measurement research.
- `BundledIngredientCatalog.kt`: regenerated the reference index (1,671 references).
- `RecipeBook-global-ingredient-catalog-plan.txt`: checked the hot-paprika subtask and left the broader paprika/chile checklist item open.
- `roadmap.md`: recorded R305.

## Verification

Reference normalization and `--check`, bundled package normalization, `--check` and `--validate-only`, generated-index `--check`, research-ledger/schema and source ownership validation, picker phrase uniqueness, corpus scan, UTF-8/no-BOM and explicit seed escape checks, local links, and scoped `git diff --check` passed. The scoped audit found 1,671 references, 127 forms, 2,018 ledger records, 8,929 source entries, and the expected 114 recipes / 1,123 ingredient rows.

No software tests, builds, or emulator checks were run because this change only adds database JSON data, as directed by `AGENTS.md`.

A repository-wide `git diff --check` also reports trailing whitespace in unrelated modified exported-recipe JSON files; the R305 paths pass the scoped check. Those unrelated files were not changed in this batch.

## References

- [R305 proposal](../../proposals/wp05-section-t-hot-paprika-identity-review-r305-20261016.md)
- [Codex CXS 353-2022](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/pl/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS+353-2022%2FCXS_353e.pdf)
- [ISO 7540:2020](https://www.iso.org/standard/70871.html)
- [Bulk Barn Paprika fort](https://www.bulkbarn.ca/fr/products/all/hot-paprika-2245)
- [CFIA French ground-spice survey](https://inspection.canada.ca/sites/default/files/documents/2025-03/2020-2021-undeclared-allergens-gluten-in-ground-spices-herbs-fra.pdf)
- [Shashi Foods French catalog](https://www.shashifoods.com/wp-content/uploads/2023/03/Shashi-Catalog-FR-2023-Web-PDF.pdf)
- [University of Illinois Extension](https://extension.illinois.edu/blogs/simply-nutritious-quick-and-delicious/2020-02-28-sweet-hot-or-smoked-paprika)
