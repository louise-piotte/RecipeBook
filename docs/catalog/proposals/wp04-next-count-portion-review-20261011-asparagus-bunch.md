# WP04 proposal: asparagus bunch count and edible-portion follow-up

**Review date:** 2026-10-11

**Status:** The unresolved-mass disposition and source-bounded findings for `104#1` were recorded in the 2026-10-11 follow-up integration. No recipe edit, bunch mass, conversion, or yield was added. See the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md).

## Recommendation

Preserve the exact bundled line: **`1 bunch asparagus, trimmed and cut into 1/2-inch pieces`** (`1` / `bunch`, `ingredient-ref-asparagus`). The current linked Allrecipes card repeats that same asparagus wording, but gives no bunch mass, spear count, size, trim-stage weight, or post-preparation amount. It says the recipe yields four soufflés; that yield does not establish a usable asparagus amount.

The official evidence adds one important boundary: USDA ERS used an **assumption of 36 medium spears per bunch** in a count-data model. That is a model assumption, not a direct measurement of this recipe's bunch or a retail bunch standard. The recipe does not specify medium spears. Do not turn that assumption into a bunch mass by multiplying it by the USDA medium-spear portion; do not assign the 47% refuse figure as a recipe trim loss. Keep the line unchanged and the quantity-to-mass question open.

## Exact demand and current publisher check

| Recipe line | Bundled record | Linked current publisher card | Match result |
| --- | --- | --- | --- |
| `104#1`; recipe UUID `7239d74f-e895-421d-96e4-09a049546aa1`; ingredient UUID `7239d74f-e895-421d-96e4-09a049546aa1-ingredient-1` | `1 bunch asparagus, trimmed and cut into 1/2-inch pieces`; quantity `1`; unit `bunch`; reference `ingredient-ref-asparagus`. | Allrecipes, *Chef John's Asparagus Souffle*, current page shows “Updated on May 8, 2023”; original 1X yield is four servings/four individual soufflés. Its asparagus line is exactly `1 bunch asparagus, trimmed and cut into 1/2-inch pieces`. The ingredient line does not label it raw or fresh. The method boils it about two minutes while bright green and still crisp, transfers it to ice water, drains it, then purées it. | The asparagus wording and preparation match. The card gives no bunch mass or spear count, no spear size, no weight before or after trimming, and no measured amount after blanching/draining. The method identifies process stages but supplies no yield between them. |

The current page is a partial recipe-version match: its asparagus line matches, while its salt and garlic quantities differ from the bundled JSON. Do not treat the page as proof that all bundled quantities or directions follow that displayed version. This review adds the current-card check to the earlier broad inventory's unresolved asparagus row; it does not repeat that inventory.

## Official portions and exact-match audit

### Health Canada CNF

The current official CNF 2026 relational files retain Food Code `1990`, **Asparagus, raw / Asperge, crue**, USDA NDB `11011`, *Asparagus officinalis*. The food row's last-updated date is `2012-07-11`; the 2026 release is the current dataset distribution, not evidence that these individual portions were newly measured in 2026.

The joined 2026 rows include these raw-food portions:

| Published portion | Weight | Source qualifier |
| --- | ---: | --- |
| One spear tip, 5 cm or less | 3.5 g | Edible-portion food row; distinct from a full spear. |
| One small spear, 12.7 cm or less | 12 g | Size-qualified. |
| One medium spear, 13.3–17.8 cm | 16 g | Size-qualified. |
| Six medium spears, 13.3–17.8 cm | 96 g | Exact published multi-spear portion. |
| One large spear, 18.4–21.6 cm | 20 g | Size-qualified. |
| One extra-large spear, 22.2–25.4 cm | 24 g | Size-qualified. |
| Four spears | 58 g | Count portion with no size qualifier; Measure Code `431`, row date `1997-05-01`. |

The separate refuse row reports **47% total refuse, identified as ends**. The CNF page labels its reference as an edible portion; refuse is not extra edible mass. The 2015 online page shows the size-specific spear portions and six medium spears = 96 g, but not the 2026 file's four-spears row. Health Canada describes that 2015 online tool as interim while the 2026 relational dataset is the published download. The 2026 row codes and historical row dates are preserved here so the two access forms are not conflated.

These are food-specific portions for raw asparagus spears. None states that a bunch has four or six spears, and the unqualified four-spear portion cannot be substituted for a bunch. The multiple weights are separate published portions, not a variability range. No recipe mass follows from them.

### USDA ARS SR28 and USDA ERS count-data assumption

USDA ARS SR28 NDB `11011`, *Asparagus, raw*, lists a common-measure block headed **amount in edible portion**: one cup = 134 g, one small spear (5 inches or less) = 12 g, and one medium spear (5¼–7 inches) = 16 g. It reports 47% refuse as butt ends. This independently agrees with CNF for small/medium raw spear portions and refuse, but gives no bunch portion.

USDA ERS Technical Bulletin 1927, published January 2011, supplies the closest official bunch-count statement found in this follow-up. Appendix A, Table A-2 is explicitly for fruit and vegetable count-data weight and inedible-percentage assumptions. Its raw-asparagus row identifies one **medium spear (5¼–7 inches)** at 16 g and says **36 spears in a bunch are assumed**; it lists butt ends at 47% inedible. The report explains that USDA's 2007 National Nutrient Database was used to convert produce count data to edible weights and estimate refuse. This is a count-data model assumption for food-availability work, not a bunch weighed for the recipe or a retail specification. It provides no size distribution, observed bunch range, exact trimming stage, or directly weighed bunch mass.

The ERS assumption does not exactly match `104#1`: the recipe does not say its spears are medium, and “trimmed” does not identify the mass stage or amount of ends removed. Preserve the ERS assumption as source context only. Do not calculate a bunch mass, use it as a lower/upper bound, or represent 47% as this recipe's trimming loss.

## Proposed data delta

None. Do not add a numeric `published_portion`/`count_weight` for `104#1`, a bunch-to-spear relation, a mass interval, edible-yield factor, default density, unit mapping, conversion, substitution, or recipe edit. Existing raw-spears observations on `ingredient-ref-asparagus` remain scoped to their cited small, medium, six-medium, large, and extra-large portions; they do not cover a bunch. Keep `defaultDensity: null` and `unitMappings: []`.

The unresolved decision is: **no reviewed source specifies a measured mass or exact size-qualified spear count for the publisher's one trimmed asparagus bunch.** The USDA ERS value is an explicit model assumption, but it does not close that exact line's size and preparation-stage gaps.

## Source register

All sources were checked on 2026-10-11. These proposal-local IDs are unique to this file and do not add canonical ledger entries.

| Source ID | Source and locator | Evidence and limit |
| --- | --- | --- |
| `WP04-ASPARAGUS-BUNCH-FOLLOWUP-20261011-S01` | Allrecipes, [Chef John's Asparagus Souffle](https://www.allrecipes.com/recipe/220991/chef-johns-asparagus-souffle/), recipe card, original 1X ingredient list, yield, and directions. | Current page shows `Updated on May 8, 2023`; exact asparagus line matches the bundle. It has four servings/four soufflés but no bunch mass, bunch spear count, size, or preparation-stage weight. The card's salt/garlic amounts differ from the bundle. |
| `WP04-ASPARAGUS-BUNCH-FOLLOWUP-20261011-S02` | Health Canada, [CNF 2026 dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109), Food Name, Measure Name, Measure Type, and Measure Weight Conversion CSV resources; Food Code `1990`, Measure Type `6`, Measure Codes `1140`, `1141`, `1142`, `1473`, `1143`, `1144`, `431`, and Refuse Type `3` / Measure Code `750`. Resource URLs: [Food Name](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv), [Measure Name](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv), [Measure Type](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv), and [Measure Weight Conversion](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv). | Current published 2026 data files were joined locally by food, measure, and type codes. Their SHA-256 fingerprints match the 2026 CNF integration README: Food Name `ee75a3208e8b79ee523ec5adffcf149f3f21806ac5d9942a9449077efe414c6c`; Measure Name `429cf2e8d4bbd2b732a6e9acf35427ce6d3b4e9447aabaf86b427c48833b112f`; Measure Type `ce6ecd0f370820d6800d7b7b88ae5710691b5d7b358c0503273d36a1a878f977`; Measure Weight Conversion `9d41fac4ba1471fddd25ea7e51a8352aec66de4f3c88802b0a2e02a85ebc3e6f`. Confirms source-specific spear/portion rows and 47% ends refuse; no bunch row. Individual underlying measure dates are historical. |
| `WP04-ASPARAGUS-BUNCH-FOLLOWUP-20261011-S03` | Health Canada CNF 2015 online, [Asparagus, raw / Asperge, crue, Food Code 1990](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=1990), serving-size and refuse blocks; Health Canada [CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html). | Online page lists size-specific raw spears, six medium = 96 g, and 47% ends refuse. Health Canada identifies the 2015 online tool as interim while CNF 2026 is provided as relational downloadable files. It gives no bunch measure. |
| `WP04-ASPARAGUS-BUNCH-FOLLOWUP-20261011-S04` | USDA ARS, [SR28 Food Group 11 report](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg11.pdf), NDB `11011`, *Asparagus, raw*, common-measure block. | Historical 2015 SR28 source: 1 cup = 134 g, small spear ≤5 inches = 12 g, medium spear 5¼–7 inches = 16 g, and 47% butt-end refuse. The table states the common measures are edible portions. It has no bunch measure. |
| `WP04-ASPARAGUS-BUNCH-FOLLOWUP-20261011-S05` | USDA Economic Research Service, [Technical Bulletin 1927](https://www.ers.usda.gov/sites/default/files/_laserfiche/publications/47570/8043_tb1927.pdf), January 2011; Appendix A, Table A-2, raw asparagus / NDB `11011`; methodology discussion of USDA SR 2007 count conversions. | Reports one medium spear (5¼–7 inches), 16 g, 47% butt ends, and an **assumed** 36 spears per bunch for count-data modeling. The report uses this for ERS loss-adjusted food-availability estimates. It is not a direct bunch weighing, a retail standard, or a recipe-matched mass. |

## Review boundary

This is the source-specific follow-up to `WP04-WP12-PRODUCE-20261010-S14`. It adds the current linked-card version check, a direct join of the official CNF 2026 asparagus rows (including the 4-spears-without-size tuple), and USDA ERS's contextual 36-spears-per-bunch assumption. It confirms a better-documented unresolved boundary, not a supported recipe mass. The follow-up integration recorded the source-bounded disposition in the research ledger and plan; it made no recipe edit and added no bunch mass. No tests were run during the source review; implementation verification is recorded in the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md).
