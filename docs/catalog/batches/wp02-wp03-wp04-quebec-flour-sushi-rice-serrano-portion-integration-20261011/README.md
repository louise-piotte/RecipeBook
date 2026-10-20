# WP02 / WP03 / WP04 Québec flour, sushi-rice, and serrano review

**Date:** 2026-10-11
**Status:** Integrated research and ledger review. No active ingredient reference, recipe line, form, numeric conversion, app code, or generated catalog index changed.

## Decisions

### Japanese weak wheat flour

Retain `Japanese weak wheat flour (hakurikiko)` / `farine de blé tendre japonaise (hakurikiko)` and the qualified alias `farine de blé mou japonaise`. The OQLF supports both generic French base terms, and Canadian French flour references treat `farine de blé tendre` as a broader family that includes more specific cake and pastry flour products. No source attests the full Japanese-qualified compound as a fixed Québec term, so keep that compound provisional and keep generic cake flour separate. The independent sources and decision are in the [research proposal](../../proposals/wp02-japanese-weak-wheat-flour-quebec-review-20261011.md) and research ledger.

### Sushi rice

Keep `ingredient-ref-sushi-rice` ledger-only as `needs_clarification`. Québec retailers use `riz à sushi` for dry products made from medium-grain Calrose and short-grain Koshihikari rice; Toronto Public Health also uses “sushi rice” for cooked, seasoned ready-to-eat rice. No bundled recipe requires a new identity, and no active alias, form, recipe link, or measurement was added. See the [terminology review](../../proposals/wp03-section-f-sushi-rice-quebec-terminology-review-20261011.md).

### Recipe 066 serrano portion

Keep the USDA observation `1 raw serrano pepper = 6.1 g` as source-specific count evidence, with 3% stem refuse. Health Canada's CNF 2015 page independently lists the same unqualified one-pepper amount. The current linked publisher page specifies one **medium** serrano pepper (about one tablespoon) but gives no mass; neither official count measure identifies its pepper as medium. The ledger now leaves the medium-pepper weight unresolved and no longer claims that 6.1 g exactly matches that publisher portion. The recipe line, optional flag, and count remain unchanged; no `item` conversion was added. See the [portion review](../../proposals/wp04-recipe066-serrano-pepper-count-portion-review-20261011.md).

The Canadian Nutrient File 2026 dataset lists a downloadable Measure Weight Conversion file, but its serrano row was not directly inspected in this pass. The medium-pepper question remains open pending that row or another size-matched source: [CNF 2026 dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109).

## Package and verification

- Bundled package stayed at **950 references, 53 forms, 114 recipes, and 1,123 ingredient rows**.
- Research ledger has **1,220 records, 3,613 source entries, 2,950 distinct source IDs, 8 unit conversions, and 0 validation errors**.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — passed.
- `python3 -m tools.seed_package.test_bundled_seed_package` — **106 passed**.
- `git diff --check` and the UTF-8/no-BOM checks — passed.

SHA-256: research ledger `2737f9d72f2e520569d5ba8f981b005542607ddb8a241a975626e118d76dd94b`; unchanged reference catalog `35de430059cdbe39bd3b12aba9dec359d5de085f848956313ff338825df1a3e9`.

No Android runtime files or bundled package parts changed in this review, so Pixel 9a deployment and UI checks were not repeated. The prior app-data and bilingual picker verification remains documented in [the preceding package batch](../wp02-wp03-wp04-specialty-flour-sorghum-flakes-fish-balls-integration-20261011/README.md).

## Source links

- [OQLF, farine de blé tendre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357375/farine-de-ble-tendre) — preferred generic terms `farine de blé tendre` and `farine de blé mou`.
- [Metro, Farine 101](https://api.metro.ca/produits-a-decouvrir/boulangerie/nos-pains-patisseries-et-farines/farine-101-guide-des-different-type-et-usages) — broader soft-wheat family and separate cake/pastry flour descriptions.
- [MITO, Riz à sushi Calrose](https://mito.ca/produit/riz-calrose-450-g/) and [Walmart Canada, Hakuro Riz à sushi](https://www.walmart.ca/fr/ip/Hakuro-Riz-sushi-de-qualit-sup-rieure/3U478VX51H55?classType=REGULAR) — current Québec/Canadian retail usage across Calrose and Koshihikari products.
- [OQLF, sushi](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359752/sushi), [RiceSelect Sushi Rice](https://www.riceselect.com/products/riceselect-sushi-rice), and [Toronto Public Health, Specific Food Processes](https://www.toronto.ca/community-people/health-wellness-care/food-safety/food-safety-for-businesses/food-safety-resources/specialty-foods/) — prepared seasoned-rice and dry-product boundaries.
- [Health Canada CNF, raw serrano pepper](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4858), [USDA SR28, NDB 11977](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg11.pdf#page=1301), and [The Kitchn, Korean Soy-Marinated Jammy Eggs](https://www.thekitchn.com/korean-soy-marinated-eggs-recipe-23636937) — 6.1 g unqualified portions versus the current medium-pepper wording.
