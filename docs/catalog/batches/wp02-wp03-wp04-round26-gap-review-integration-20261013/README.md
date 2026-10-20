# WP02 / WP03 / WP04 round-twenty-six gap-review integration

Date: 2026-10-13

## Dispositions

- **WP02 A7 — toasted white sorghum flour:** Added unresolved ledger-only `candidate-toasted-white-sorghum-flour`. CerealVeneta names one toasted white sorghum semifinished product separately from native white sorghum flour, but does not disclose the process sequence, household product scope, or a Québec French product name. Codex and OQLF establish the base `farine de sorgho` / `sorgho` terms, not a toasted product name. No active reference, alias, form, measure, recipe link, conversion, yield, or substitution was added.
- **WP03 Section G — baguette:** Added identity-only `ingredient-ref-baguette`, displayed as `baguette / baguette`, under `BAKING_MIXIN_AND_PANTRY`. English aliases: `baguettes`, `French baguette`, `French baguettes`, `French stick`, `French sticks`, `long French stick`, and `long French sticks`. French aliases: `baguettes`, `baguette française`, `baguettes françaises`, and `pain baguette`. OQLF defines the long loaf and supports the English terms; Metro Québec listings and recipes support local product and ingredient wording. Kept generic `French bread`, Calabrese and ciabatta baguettes, and fermentation-qualified baguette outside the aliases. The recipe corpus has no matching row. Added no forms, measures, recipe links, conversions, yields, or substitutions.
- **WP04 Section O — guinea fowl:** Added identity-only `ingredient-ref-guinea-fowl`, displayed as `guinea fowl / pintade`, under `PROTEIN`, with no aliases. OQLF supports the bilingual bird name; MAPAQ documents Québec farming and meat sales; CFIA defines young and mature guinea carcasses; and a Québec producer sells a whole frozen pintade. The producer's product-specific weight and portion statement does not establish a general count weight or yield. Kept other poultry, game birds, cuts, age classes, and processed products distinct. The recipe corpus has no matching demand. Added no forms, active measures, recipe links, conversions, yields, or substitutions.

## Shared data changes

The active package now has **1,355 ingredient references** and **98 forms**. The research ledger has **1,677 records** and **6,552 source entries**, with **5,490 distinct source IDs** and **4,574 distinct URLs**. It retains **343 measurement observations** and **195 substitution findings**. The generated Kotlin catalog contains 1,355 references. This batch added two active identity rows and one unresolved ledger candidate, plus twelve source entries. It added no ingredient forms, measurement observations, recipe links, or substitutions.

The manifest-listed recipe corpus remains at **114 files**, **1,123 ingredient rows**, and **753,792 bytes**. No recipe JSON or line links changed.

| Artifact | State after R26 |
|---|---:|
| `ingredient-references.v1.json` | 1,355 references |
| `ingredient-forms.v1.json` | 98 forms |
| `research-ledger.v1.json` | 1,677 records; 6,552 sources; 5,490 IDs; 4,574 URLs |
| Measurement observations | 343 |
| Substitution findings | 195 |
| `BundledIngredientCatalog.kt` | 1,355 references |
| Recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes |

## Verification

- Bundled seed-package normalization check passed; package validation passed.
- Ingredient-reference normalization check passed; the generated Kotlin catalog freshness check passed after regeneration from the canonical JSON.
- Ledger schema, record/source-ID resolution, and source URL checks passed as part of seed-package validation.
- Focused phrase-first picker projections show `baguette`, `baguette française`, `French baguette`, `French stick`, `long French stick`, and `pain baguette` resolve to the new baguette identity. `Baguette calabrese`, `Baguette ciabatta`, and `French bread` do not resolve to it. `guinea fowl` and `pintade` resolve to the new identity; bare `guinea` remains multi-result. The existing `sorghum flour / farine de sorgho` terms still resolve to the generic sorghum-flour identity, while the toasted-white candidate remains absent from active picker results.
- The corpus remains at 114 recipe files / 1,123 ingredient rows; phrase scans found no baguette, guinea-fowl, or toasted-white-sorghum ingredient demand.
- UTF-8 without BOM, mojibake, local Markdown links, and scoped whitespace checks passed.
- No app, unit, instrumentation, or emulator tests were run. Under the updated `AGENTS.md` rule, this batch only adds database JSON data and regenerates the derived Kotlin catalog.

See the [toasted white sorghum flour boundary review](../../proposals/wp02-a7-toasted-white-sorghum-flour-boundary-review-20261013-round26.md), [baguette identity review](../../proposals/wp03-section-g-baguette-identity-review-20261013-round26.md), and [guinea-fowl identity review](../../proposals/wp04-section-o-guinea-fowl-identity-review-20261013-round26.md). WP02 A7, Section G, and Section O remain open.
