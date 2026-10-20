# WP07 maple-syrup CNF portion integration — R293 — 2026-10-16

## Decision

Verified the existing `maple syrup / sirop d'érable` identity using OQLF's preferred bilingual terminology and CFIA's current single-ingredient product boundary. Recorded ten CNF 2015 `portion_weight` observations under the existing maple-syrup ledger record: five each for Food Code 4326 (`bulk`) and Food Code 6175 (`prepackaged`). The observations retain their source code and edition and are historic evidence only.

The current 2026 CNF is distributed as relational CSV files. The Measure Weight Conversion CSV was listed in the official dataset but returned 403 through the available retrieval, so the exact maple-syrup row and its food/measure joins remain unreviewed. Measurement state remains `blocked_pending_evidence`. `defaultDensity` stays null, `unitMappings` stays empty, and no form, active conversion, substitution, or recipe link was added. Substitution research remains not yet researched.

Three direct maple-syrup ingredient rows remain unchanged in recipes 001, 025, and 085. Recipe 065 mentions maple syrup only as an example in an optional, unlinked “sweetener, to taste” note; it is not treated as a fourth linked recipe line. No recipe quantity was converted.

## Evidence

- Health Canada's CNF 2015 online pages directly publish available portions for separate food codes. For 4326, the values are 15 mL = 20.0 g, 30 mL = 39.9 g, 100 mL = 133.1 g, 125 mL = 166.4 g, and 250 mL = 332.9 g. For 6175, they are 15 mL = 20.9 g, 30 mL = 40.6 g, 100 mL = 135.3 g, 125 mL = 169.1 g, and 250 mL = 338.1 g.
- The two food codes differ at shared volume portions. CNF does not describe the original measure or filling method on these pages. The ledger keeps the classes separate and does not average the values, fit a density, or extrapolate a cup conversion.
- Health Canada's current CNF page says the 2026 edition is published as relational CSV files and the online 2015 CNF remains an interim access route.
- OQLF names `sirop d'érable` as preferred and pairs it with `maple syrup`. `Sirop du pays` is context-specific and old, so it was not added as a global alias.
- CFIA defines maple syrup as a pure, single-ingredient food obtained by concentrating maple sap or diluting/solving another maple product in potable water. This supports the product boundary only.

## Data changes

- `docs/catalog/research-ledger.v1.json`: verified the identity; added six source entries (four new source IDs and two reused CNF overview/CSV source IDs) and ten historic CNF portion observations. The record's measurement state remains blocked pending current-file review.
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`: checked the historic-observation subtask while leaving WP07's broader priority open.
- `roadmap.md`: recorded the batch and the unavailable current CSV.
- No ingredient reference, bundled recipe, form, substitution rule, density, unit mapping, or generated catalog changed.

## Verification

Static checks passed: ledger JSON Schema, source-ID and exact-URL ownership, the two reused source IDs, all ten source-specific observation values, maple-syrup picker projection, the 114-recipe/1,123-row corpus scan, UTF-8/no-BOM, local Markdown links, and scoped whitespace. The exact bilingual picker queries each return the existing maple-syrup row; broad `maple` and `érable` queries still return seven separate products.

Final totals: 1,663 references, 127 forms, 2,013 ledger records, 8,878 source entries, 7,516 distinct source IDs, and 6,277 distinct URLs. The bundle remains at 114 recipes and 1,123 ingredient rows.

No software tests, builds, or emulator checks were run because this change only adds database JSON data, as directed by the project's `AGENTS.md`.

## References

- [R293 proposal](../../proposals/wp07-maple-syrup-cnf-portion-evidence-review-r293-20261016.md)
- [CNF 2015 Food Code 4326: maple syrup, bulk](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4326)
- [CNF 2015 Food Code 6175: maple syrup, prepackaged](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=6175)
- [OQLF GDT: sirop d'érable](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358382/sirop-derable)
- [CFIA: Importing maple syrup and maple products](https://inspection.canada.ca/en/importing-food-plants-animals/food-imports/food-specific-requirements/maple-products)
- [Health Canada: Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html)
- [CNF 2026 Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv)
