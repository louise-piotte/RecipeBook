# WP02 A7 R409 / WP04 Section P R410 / WP06 Europe R411 integration

Integrated on 2026-10-17. The three reviewed proposals are [R409](../../proposals/wp02-section-a7-next-milling-gap-review-r409-20261017.md), [R410](../../proposals/wp04-section-p-next-seafood-gap-review-r410-20261017.md), and [R411](../../proposals/wp06-europe-next-regional-identity-review-r411-20261017.md).

## Decisions

- **R409 — triticale grits:** keep the candidate unallocated. MEGRO lists an English milling product and a food study uses chopped hulled triticale grain, but the reviewed evidence establishes neither a Québec French product name nor a product-specific grind boundary. Preserve separate triticale grain, flour, flakes, and meal boundaries. Add no reference, alias, candidate, form, measurement, recipe link, conversion, yield, or substitution.
- **R410 — Nenu Dieune / Oeuf de Mulet:** hold the La Gambas product as a source-specific, unallocated roe listing. The Montréal page does not identify its species and gives an unexplained 250 g selection beside an approximately 908 g / 2 lb description. Keep it separate from whole mullet and bottarga; add no reference, candidate, alias, form, measurement, recipe link, conversion, yield, or substitution.
- **R411 — Pimentón de la Vera:** add identity-only `Pimentón de la Vera / paprika fumé de La Vera` as `ingredient-ref-pimenton-de-la-vera`, with `smoked paprika from La Vera` as its only alias. Keep it within the Spanish PDO boundary and separate from generic smoked paprika, generic paprika, hot paprika without the PDO, other origins, and prepared products. The broad `smoked paprika` / `paprika fumé` queries now return both the generic style and the regional PDO identity; the two existing generic recipe lines remain linked to `ingredient-ref-smoked-paprika`. Preserve Qualifirst's 55 g package and 5 g nutrition serving as SKU-specific evidence only. Add no forms, observations, unit mappings, recipe links, conversions, yields, or substitutions. Measurement remains `researched_no_supported_value`; substitution research remains `not_yet_researched`.

None of the three candidates has a matching line in the bundled recipe corpus. No recipe or recipe link was changed. A7, Section P, and Europe-wide coverage remain open.

## Static validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — bundled seed package valid.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` — references normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — generated catalog current at 1,715 references.
- The research ledger validates against `research-ledger.schema.json`: 2,074 records, 9,389 source entries, 7,952 distinct source IDs, and 6,670 distinct source URLs. All five R411 source IDs occur once and are all referenced by the accepted decision.
- The R411 ledger record is verified with `measurementState: researched_no_supported_value` and `substitutionResearchState: not_yet_researched`; it adds no measurement observations or substitution findings. The active row has null density, empty unit mappings, no French aliases, and only the qualified English alias.
- Static picker projection follows `IngredientSearch.kt`: the three qualified La Vera phrases return the new row; `smoked paprika` and `paprika fumé` return the generic smoked-paprika row plus the PDO row; `hot paprika` and `paprika fort` still return only hot paprika; `roe` remains four results; and `mullet` / `mulet` remain unassigned.
- The 114 manifest-listed recipe files and 1,123 ingredient rows contain no candidate-specific La Vera, triticale-grits, or Nenu Dieune matches. The two generic smoked-paprika lines in recipes 018 and 074 remain linked to `ingredient-ref-smoked-paprika`.
- UTF-8/no-BOM, explicit Unicode escapes in the seed reference JSON, local proposal and README links, and whitespace checks passed.

No software tests, builds, instrumentation, emulator checks, or deployment were run. The only active catalog-data change adds database JSON, so the JSON-only exception in `AGENTS.md` applies.
