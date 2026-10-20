# WP02/WP03/WP04 R173 gap-review integration

**Integrated:** 2026-10-16

**Plan:** [global ingredient catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)

**Reviewed proposals:** [Kodri grain and flour spelling](../../proposals/wp02-a6-next-regional-flour-review-r173-20261016-kodri.md), [Bob’s Red Mill 8 Grain Hot Cereal](../../proposals/wp03-section-f-bobs-red-mill-8-grain-hot-cereal-identity-review-r173-20261016.md), and [canned crab meat](../../proposals/wp04-section-p-canned-crab-meat-form-review-r173-20261016.md).

## Integrated decisions

- **WP02 A6 — Kodri:** Held the shared `kodri` alias outside the active catalog and ledger. Seed-package validation enforces one owner for each normalized reference name or alias, while assigning the spelling to only one row would hide the other product class in exact search. The two proposal-local source IDs remain unallocated; the full evidence and collision rationale are recorded in the proposal.
- **WP03 Section F — 8 Grain Hot Cereal:** Added identity-only `Bob's Red Mill Gluten Free 8 Grain Hot Cereal / Bob's Red Mill Céréales chaudes à 8 grains sans gluten` as a `GRAIN_AND_CEREAL` reference for Canadian item P101125. The exact Canadian maker and retailer titles are searchable aliases. The 709 g package remains package metadata; no measure, form, component alias, recipe link, conversion, yield, or substitution was added. US P101124 sources S04/S05 remain excluded comparators; their formula conflict and serving were not transferred.
- **WP04 Section P — canned crab:** Added `ingredient-form-crab-canned` (`canned crab meat / chair de crabe en conserve`) under the existing `ingredient-ref-crab`. The existing Jumbo Lump form and recipe link are unchanged. Species, cut, grade, packing medium, package, and drained state remain product-specific; no measure, density, conversion, yield, recipe link, or substitution was added.

## Source registration

- Added eight new source IDs and URLs: WP03 S01–S03 and WP04 S01–S05. Reused the existing OQLF `WP04-CRAB-MEAT-20261011-S01` on the canned-form record; it adds one source entry but no new ID or URL.
- Did not register the two WP02 proposal-local IDs because that candidate was held.

## Static validation

- Bundled seed-package normalization check and validation passed. Ingredient-reference normalization passed, and the generated Kotlin picker catalog is current at **1,549 references**.
- Research-ledger validation passed with **1,894 records and zero errors**. All eight new source IDs and URLs have unique ledger ownership.
- Static picker projection confirmed the English and French canned-crab phrases return the existing crab reference with the canned form hint; `en conserve` now returns 12 references including crab. The 8-grain English and French product titles return only the new Canadian SKU, and the existing 10-grain result is unchanged. `kodri` remains unallocated.
- The manifest scan covered **114 recipe files / 1,123 ingredient rows**. It found no R173 candidate text or links to either new identity/form.
- UTF-8/no-BOM, ASCII-escaped bundled JSON, local Markdown links, and scoped whitespace checks passed.
- Totals: **1,549 references**, **120 forms**, **1,894 ledger records / 8,116 source entries / 6,940 distinct source IDs / 5,736 distinct source URLs**; 114 recipes / 1,123 ingredient rows.
- No software tests, builds, emulator checks, or deployment were run. The active catalog changes add database JSON data under the updated `AGENTS.md` rule; static data and package validation were used.

Sections 04 A6, F, and P remain open for broader candidate coverage.
