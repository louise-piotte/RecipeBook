# R1012–R1014 cross-category generic ingredient integration

- **Date:** 2026-10-19
- **Status:** Integrated
- **Scope:** Generic ingredient gaps in grain milling, sea vegetables, and poultry.

## Integrated data

- **R1012:** Added identity-only `parboiled rice flour / farine de riz étuvé` in `FLOUR_AND_STARCH`. The French compound remains descriptive and provisional. The sources establish a parboiled-rice flour identity and a regional Bakhar use; sample preparation and study behavior stay source-scoped. No aliases, forms, measures, density, mappings, recipe links, or substitutions were added.
- **R1013:** Resolved the existing `ingredient-ref-aonori` candidate in place as identity-only `aonori / aonori`, with `green laver` as its sole English alias. Aonori is a named dried food class spanning more than one green-algal genus, not a taxon. Keep aosa, sea lettuce, red-algal nori, and sheet-prepared ita aonori distinct; no forms, measures, recipe links, or substitutions were added.
- **R1014:** Added generic `chicken / poulet` in `PROTEIN`. Recorded only the legacy Food Guide's source-scoped cooked portion of 75 g for one serving; its paired 125 mL is not conversion data. The three recipe rows still request chicken breast and retain their existing links; no forms or recipe links were added.

See the [R1012](../../proposals/wp02-generic-flour-starch-gap-review-r1012-20261019.md), [R1013](../../proposals/wp03-generic-produce-fungi-gap-review-r1013-20261019.md), and [R1014](../../proposals/wp04-generic-protein-seafood-gap-review-r1014-20261019.md) proposals for source registers, evidence limits, and identity-boundary reviews.

## Cross-category scope

The three reviews selected generic culinary identities. No brand, product-line, flavour-family, SKU, or retailer-variant roster was pursued. A queued item whose only deliverable is a commercial roster is out of scope because **commercial-product counts do not add ingredient diversity**; record that reason and stop the roster research. Existing branded rows and source ownership remain intact. Manufacturer pages remain usable when their evidence supports the generic ingredient, while product-only claims and measurements stay attached to that product unless transferability is separately reviewed.

## Data checks

- Bundled references: 2,028 (up from 2,025); unique IDs remain unique.
- Ingredient forms: 205 (unchanged).
- Research ledger: 2,433 records (up from 2,431); source IDs and decision links validate.
- Legacy candidates: 55 (unchanged).
- Recipe corpus: 114 manifest-listed files and 1,123 ingredient rows (unchanged); the three chicken rows still link to `ingredient-ref-chicken-breast`.
- Bundled package validation passed; reference normalization and generated Kotlin catalog checks passed at 2,028 references.
- Exact-name and alias ownership checks found one owner each for `parboiled rice flour`, `aonori`, `green laver`, `chicken`, and `poulet`. UTF-8/no-BOM, local Markdown targets, and `git diff --check` passed.
- Software tests, builds, emulator checks, and deployment were not run; the app data changes only add database JSON under `AGENTS.md`.

See the [cross-category scope review](../generic-ingredient-scope-review-20261019/README.md). Sections A6, N, and O remain open for their other generic ingredient and evidence gaps.
