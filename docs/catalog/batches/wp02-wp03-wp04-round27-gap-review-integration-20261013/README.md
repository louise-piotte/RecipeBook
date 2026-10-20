# WP02 / WP03 / WP04 round-twenty-seven gap-review integration

Date: 2026-10-13

## Dispositions

- **WP02 B2 — macadamia flour:** Held the generic identity and aliases unallocated. Sources describe both whole-kernel flour and mechanically defatted oil-press-cake flour, with meaningful process differences and no exact Québec French flour-product name established in the reviewed sources. The recipe corpus has no matching demand. No active reference, alias, ledger candidate, form, measure, recipe link, conversion, yield, or substitution was added. See the [boundary review](../../proposals/wp02-b2-macadamia-flour-boundary-review-R27-20261013.md).
- **WP03 Section F — pearl barley:** Added `ingredient-form-pearl-barley-dry` (`pearl barley, dry / orge perlé, sec`) and `ingredient-form-pearl-barley-cooked` (`pearl barley, cooked / orge perlé, cuit`) under the existing pearl-barley identity. Both have no match terms and null form density. Added ledger source/decision records for the bilingual CNF state labels. The historical CNF 2015 portion pages are not imported as measurement observations; density, mappings, active measures, cooking yield, recipe links, and substitutions remain empty. Keep the measurement review open until the CNF 2026 food-name and measure-weight rows are checked. The recipe corpus has no pearl-barley demand. See the [dry/cooked-form review](../../proposals/wp03-section-f-pearl-barley-dry-cooked-form-review-R27-20261013.md).
- **WP04 Section P — European turbot:** Held *Scophthalmus maximus* outside the active picker. OQLF supports a species-scoped `turbot / turbot commun` identity, while OQLF and MAPAQ document Québec use of bare `turbot` for Greenland halibut. A qualified row would become the only result for a bare `turbot` search. The corpus has no matching demand. No active reference, alias, ledger candidate, form, measure, recipe link, or substitution was added. See the [picker and market-boundary review](../../proposals/wp04-section-p-european-turbot-picker-market-boundary-review-20261013-round27.md).

## Shared data changes

The active package still has **1,355 ingredient references** and now has **100 forms**. The research ledger has **1,679 records** and **6,556 source entries**, with **5,492 distinct source IDs** and **4,576 distinct URLs**. It retains **343 measurement observations** and **195 substitution findings**. The generated Kotlin catalog remains at 1,355 references. This batch added two forms and two ledger form records, with source references to the two CNF 2015 state-label pages; it added no active measurement observations, reference rows, or recipe links.

The manifest-listed recipe corpus remains at **114 files**, **1,123 ingredient rows**, and **753,792 bytes**. No recipe JSON or line links changed.

| Artifact | State after R27 |
|---|---:|
| `ingredient-references.v1.json` | 1,355 references |
| `ingredient-forms.v1.json` | 100 forms |
| `research-ledger.v1.json` | 1,679 records; 6,556 sources; 5,492 IDs; 4,576 URLs |
| Measurement observations | 343 |
| Substitution findings | 195 |
| `BundledIngredientCatalog.kt` | 1,355 references |
| Recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes |

## Verification

- Ingredient-reference normalization, bundled-package normalization, package validation, and generated Kotlin catalog freshness checks passed.
- Ledger schema, source-ID resolution, and source URL checks passed through bundled-package validation.
- Static picker projection confirms complete queries `pearl barley, dry` / `orge perlé, sec` and `pearl barley, cooked` / `orge perlé, cuit` identify their corresponding forms; `pearl barley`, `orge perlé`, and `jau` remain on the existing reference without a state hint. The proposed European-turbot row remains absent; its proposal documents the hypothetical broad-query collision.
- The corpus remains at 114 recipe files / 1,123 ingredient rows, with no pearl-barley, macadamia-flour, or European-turbot matches.
- UTF-8 without BOM, mojibake, local Markdown links, and scoped whitespace checks passed.
- No app, unit, instrumentation, or emulator tests were run. The shared changes only add database JSON data and documentation; the `AGENTS.md` rule says database-JSON-only additions do not need testing.

See the [macadamia-flour review](../../proposals/wp02-b2-macadamia-flour-boundary-review-R27-20261013.md), [pearl-barley form review](../../proposals/wp03-section-f-pearl-barley-dry-cooked-form-review-R27-20261013.md), and [European-turbot review](../../proposals/wp04-section-p-european-turbot-picker-market-boundary-review-20261013-round27.md). WP02 B2, Section F, and Section P remain open.
