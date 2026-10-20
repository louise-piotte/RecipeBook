# WP02/WP03/WP04 R854–R856 integration — 2026-10-19

Integrated three distinct gaps under the still-open WP02 Section A7, WP03 Section F, and WP04
Section P workstreams. The broader parent checklists remain open.

## Changes

- **R854 — hominy grits:** retained Quaker's Quick Grits - Original to regular Quaker or Aunt Jemima
  Enriched Hominy Grits direction as a blocked, recipe-specific ledger finding. The current formula
  lists water while the replacement tip says to increase milk; no baseline milk amount, explicit
  carry-over quantity, or product/SKU crosswalk is provided. The lead has no `fromIngredientRefId`
  or replacements. No grade mapping, catalog alias, active form, or substitution rule was added.
- **R855 — Kellogg's Corn Flake Crumbs:** added a separate bilingual
  `Kellogg's Corn Flake Crumbs® / Chapelure Kellogg's Corn Flake Crumbs®` reference in
  `BAKING_MIXIN_AND_PANTRY`. The matched English/French SmartLabel pages identify GTIN
  `00064100000223`, the 575 g package, and a `1/3 cup / 1/3 tasse (30 g)` manufacturer serving.
  Keep that serving specific to the GTIN. Generic corn flakes and breadcrumbs remain separate; no
  form, broad alias, component link, generic measure, conversion, yield, recipe link, or substitution
  was added.
- **R856 — Atlantic salmon:** recorded CNF 2015 Food Code 3049 wild, raw Atlantic salmon portions
  `1/2 fillet = 198.0 g` and `1 food-guide serving = 90.0 g` as ledger-only observations on
  `ingredient-ref-atlantic-salmon`. The separate 65% refuse remains context. No whole-fish mass,
  yield, reusable fillet conversion, or transfer to the fresh-whole form, farmed salmon, or generic
  recipe line was inferred. CNF 2026 row continuity remains unverified.

## Static validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` passed; the
  package is valid, including the research-ledger schema checks.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` passed; the seed package
  is normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed at
  1,891 references.
- Ledger integrity checks passed: 2,299 records, 10,844 source entries, 9,114 unique source IDs,
  7,747 unique source URLs, 889 unique measurement observations, and 370 unique substitution
  findings. Source IDs map consistently to one URL; all R854–R856 observations, findings, and
  decisions cite sources attached to their own ledger records.
- The catalog has 1,891 references and 201 forms. The manifest contains 114 recipes and 1,123
  ingredient rows (1,097 with an `ingredientRefId`). A full manifest-listed scan found no R854–R856
  candidate term or ID in the recipe corpus.
- Phrase-first picker projection returns the new R855 row alone for each exact English and French
  product name. `corn flakes` continues to return only the generic corn-flakes row; `crumbs` returns
  the five distinct generic/branded crumb identities.
- UTF-8/no-BOM, source/observation/finding ID integrity, local links and plan anchors, and scoped
  whitespace checks passed for the integration artifacts. The relevant local plan anchors now point
  to their current lines after the three checklist additions.
- No software tests, app build, emulator run, or deployment were performed. The active application
  data changes add database JSON under the exception in `AGENTS.md`; the generated Kotlin catalog
  was refreshed from that JSON source.

## Review records

- [R854 proposal](../../proposals/wp02-section-a7-next-gap-review-r854-20261019.md)
- [R855 proposal](../../proposals/wp03-section-f-next-gap-review-r855-20261019.md)
- [R856 proposal](../../proposals/wp04-section-p-next-gap-review-r856-20261019.md)
- [Catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)
