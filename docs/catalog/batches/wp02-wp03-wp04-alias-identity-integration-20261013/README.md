# WP02/WP03/WP04 catalog integration — 2026-10-13

This batch integrates two source-backed search aliases and one identity-only finfish reference. The complete proposal records are [WP02 kodo millet atta](../../proposals/wp02-a6-next-regional-flour-gap-review-20261013.md), [WP03 atukulu](../../proposals/wp03-section-f-next-regional-cereal-review-20261013.md), and [WP04 milkfish](../../proposals/wp04-section-p-next-seafood-gap-review-20261013.md).

## Integrated data

- Added `kodo millet atta` to `aliasesEn` on the existing `ingredient-ref-kodo-millet-flour`. The English and Québec French displays and product boundary are unchanged. The Canada-facing Veehacart listing uses the exact phrase; Organic Mandya identifies kodo atta as its kodo-millet flour. The listing was search-indexed, showed a 500 g package, and indicated sold out, so this records product wording only, not availability.
- Added `atukulu` to `aliasesEn` on the existing `ingredient-ref-flattened-rice-poha`. The Indian Institute of Food Processing Technology handbook hosted at niftem.ac.in identifies it as Telugu for flaked rice. Indexed Canada-facing PushmyCart and Silkrute product listings pair it with white poha/flattened rice, and a separate Silkrute listing also pairs it with red poha. The unqualified name therefore stays on the generic rice-flake identity; no color or thickness form is inferred. The indexed retailer pages do not establish current stock.
- Added identity-only `ingredient-ref-milkfish`: `milkfish / chanos`, category `PROTEIN`, for *Chanos chanos*. CFIA's Fish List and OQLF support the species and bilingual names. No aliases, forms, measurements, density, mappings, conversions, recipe links, or substitution rules were added. `milk fish` remains inactive because it would broaden ordinary `milk` and `fish` searches; OQLF discourages the `poisson lait` calque and does not retain `bangus` for Québec fish-product marketing.

## Research ledger

- Added eight source entries to the existing kodo-millet-flour record. The study's 0.68 ± 0.00 g/mL bulk density and one Tamil thattai recipe's 1 cup / 250 g amount are separate, source-specific observations. Active `defaultDensity` remains null and `unitMappings` remains empty.
- Recorded the wheat/millet flatbread and heat-moisture-treated muffin studies as blocked substitution findings. Their formulas and processing conditions do not establish a reusable replacement rule; no active substitution JSON changed.
- Added four source entries and an accepted alias decision to the flattened-rice record. Its measurement observations and blocked substitution research remain unchanged.
- Added a verified identity record for milkfish with six sources. Measurement and substitution research remain `not_yet_researched` because this identity review did not establish culinary quantities or replacements.

The full recipe corpus was scanned: 114 files and 1,123 ingredient rows, with no matching demand for the added aliases or milkfish. No recipe lines or links changed.

## Final snapshot

| Artifact | Count/state | SHA-256 |
| --- | --- | --- |
| `ingredient-references.v1.json` | 1,337 references; 0 non-null default densities; 0 non-empty unit mappings | `c7bdd65a833d345292f6a480867267a72321cdce4f631018afb4040b9644c8ae` |
| `ingredient-forms.v1.json` | 98 forms | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `research-ledger.v1.json` | 1,645 records; 6,206 source entries; 5,210 distinct source IDs | `f57a7dc26346beda9f850bc5f42a0da0c4c4385d8035c11c7113a1ab9e0c44ec` |
| Seed `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `BundledIngredientCatalog.kt` | Generated index of 1,337 references | `117fe0019ddd9ceeee1a4954936dac7df8780c9f147ec64548b57c9f0821c885` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Validation

- Bundled seed package validation passed; the package is normalized.
- The generated Kotlin ingredient catalog matches the seed references and contains 1,337 references.
- Research-ledger schema and semantic validation passed: 1,645 records, zero errors.
- Exact normalized ownership and source-ID checks passed. The alias-only picker projection gives one result for `kodo millet atta` and `atukulu`; the milkfish row gives one result for `milkfish` and `chanos`, while `milk`, `fish`, and `milk fish` retain their preexisting results.
- UTF-8/no-BOM and scoped whitespace checks passed.
- No app tests or emulator checks were run. This batch only adds database catalog/evidence data and documentation; `AGENTS.md` exempts JSON-only database additions from testing.

