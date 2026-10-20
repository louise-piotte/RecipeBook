# WP04 Proposal: Recipe-Matched Egg Count and Edible-Portion Review

**Reviewed:** 2026-10-10  
**Status:** Proposal-only. This review changes no canonical catalog, seed, ledger, plan, roadmap, or tests.

## Scope and disposition

This is a live-corpus recheck of count and edible-portion evidence for whole eggs, egg whites, and egg yolks. It supplements the source and measurement review in [WP07 chicken-egg count-to-mass review](wp07-chicken-egg-count-mass-evidence-review-20261010.md) by matching each existing published portion to the exact quantity, size wording, ingredient part, and preparation state in the recipe line.

Keep all egg count-to-mass observations source-qualified in the research ledger. Do not add an active unit mapping, density, shell-on-to-edible factor, size inference, or scaled multi-count value. The existing ingredient-level measurement state remains blocked: the source records disagree for large whole eggs and large yolks, the recipes do not name a market or chicken species, and neither source set reports portion-weight variability. Some source observations do match individual recipe lines exactly; that supports recording the evidence-to-line match, not turning a market-specific count into a global conversion.

One current recipe already gives a recipe-specific mass: Amaretti `003#4` says `2 large egg whites (60 g)`. Its original source, Foodtasia, publishes the same 60 g target for that recipe. Keep it as a recipe-specific line value; do not infer that two large whites always weigh 60 g or replace it with twice a one-white portion.

## Current audit snapshot

The audit scanned all manifest recipe files and ingredient rows, then read the live ingredient references and ledger. Recipe line IDs use the three-digit filename prefix and one-based ingredient position.

| Artifact | Current result |
| --- | ---: |
| Bundled recipes | 114 files; 1,123 ingredient rows |
| Egg-related ingredient rows | 65 rows in 55 recipes |
| Linked rows | 62: 48 whole egg, 8 egg white, 6 egg yolk |
| Unlinked rows | 3: two egg-yolk lines and one egg-wash line |
| Catalog | 783 references; 36 forms; no egg form or numeric egg mapping |
| Research ledger | 1,006 records; 2,135 source entries; 1,730 distinct source IDs |

SHA-256 snapshot (raw file bytes, recipe-set hash uses sorted relative path, NUL, file bytes, NUL):

| Artifact | SHA-256 |
| --- | --- |
| `ingredient-references.v1.json` | `198dcc88fb36ecaad6515a3a5ad367a99d397ccd0f8e5dcfe8e1bb310eb865a2` |
| `ingredient-forms.v1.json` | `1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef` |
| `research-ledger.v1.json` | `efd9d4de54cda5f9f9c64b2bdc87e77da3ce931f4cb7ca5a60c1dfd8ec22f90c` |
| Recipe set | `806c88c67b42177ddd6671fce0134d0063df30c677112770e2e5767b627b045a` |

## Exact source portions and recipe-line matches

The government values below were re-opened on the review date. CNF explicitly describes its entries as whole chicken egg, egg white, and egg yolk and labels the listed weights as edible-portion household measures. USDA SR28 separately labels the common-measure mass as edible portion. Keep their published basis and market/source labels attached.

| Current ledger record / observation | Source-published quantity | Exact recipe match in this corpus | Match disposition |
| --- | --- | --- | --- |
| `ingredient-ref-egg` / `WP07-EGG-CNF125-large` | CNF food code 125: 1 large egg = 52.7 g | `001#2`, `033#6`, `038#7`, `039#5`, `054#7`, `060#1`, `109#5` (`1 large egg`) | Exact count and size wording. Source-specific CNF edible portion only. |
| `ingredient-ref-egg` / `WP07-EGG-SR28-01123-large`; `WP07-EGG-HG72-large` | USDA SR28 NDB 01123: 1 large = 50 g; USDA HG72 Table 9: 1 large edible egg = 50 g | Same seven `1 large egg` lines above | Exact wording, but 50 g is not the CNF 52.7 g value. Preserve source separation; do not average. |
| `ingredient-ref-egg` / `WP07-EGG-CNF125-two-large` | CNF food code 125: 2 large eggs = 105.4 g | `012#5` Lemon Crinkle Cookies; `013#6` Pinwheel Cookies; `018#6` Turkey Meatballs; `055#17` Coffee Cake; `059#8` Buttermilk Waffles; `070#7` Nanaimo Cake; `073#9` Chocolate Banana Bread; `107#2` French Silk Pie; `114#9` German Chocolate Cake | Exact quantity and size wording for this CNF portion only. Do not derive a value for other counts by multiplying or dividing this observation. |
| `ingredient-ref-egg-white` / `WP07-EGG-CNF126-large-white`; `WP07-EGG-SR28-01124-large-white`; `WP07-EGG-HG72-large-white` | CNF food code 126 and USDA SR28 NDB 01124: 1 large raw white = 33 g; HG72: 33 g | `021#14` Yule Log: `1 large egg white` | Exact part, count, and size. The recipe line is a raw ingredient later used in the recipe; this is an edible white portion, not a whole egg. |
| `ingredient-ref-egg-yolk` / `WP07-EGG-CNF127-large-yolk`; `WP07-EGG-SR28-01125-large-yolk`; `WP07-EGG-HG72-large-yolk` | CNF food code 127: 1 large raw yolk = 16.1 g; USDA SR28 NDB 01125 and HG72: 1 large raw yolk = 17 g | `110#4` Almond Frangipane Mini Tarts: `1 large egg yolk` | Exact part, count, and size; preserve the 16.1 g / 17 g source disagreement. |
| `ingredient-ref-egg-white` / `WP07-EGG-FOODTASIA-two-large-whites` | Foodtasia recipe-specific target: 2 large whites = 60 g | `003#4` Amaretti: `2 large egg whites (60 g), lightly beaten` | Exact source recipe and line value. It is already explicit in the recipe; retain only as this recipe-specific target, not a generic egg-white portion. |

The source-specific government values above are already present as `published_portion` observations in the live ledger. The table identifies exact recipe demand; it does not propose duplicate observations or active count mappings.

## Published portions that do not match an exact recipe line

| Existing observation | Why it does not match |
| --- | --- |
| CNF 125: 1 medium egg = 46.4 g | The corpus has `052#6` Mango Cake, `2 medium eggs`; there is no one-medium-egg line and the source does not publish a two-medium portion. Do not multiply 46.4 g by two. |
| CNF 126: 3 egg whites = 99 g | No recipe line requests exactly three egg whites. Recipe lines request 1, 2, or 5 whites; CNF does not size-qualify its three-white portion. |
| CNF 127: 2 egg yolks = 25 g; 4 egg yolks = 68 g | No recipe line requests exactly two or four unqualified yolks. `010#8` requests 2 **large** yolks; `088#5` requests 3 unqualified yolks; `046#3`, `057#8`, and `114#16` request 5 or 3 **large** yolks. Do not silently drop or invent the size qualifier, scale to another count, or use the unqualified two-yolk value for a large-yolk line. |
| USDA SR28 large whole egg = 50 g; large white = 33 g; large yolk = 17 g | SR28 publishes single-portion values for these entries, not the 3-, 4-, 5-, 6-, or 10-egg recipe lines. Do not multiply a single portion into a multi-count value. The single-count matches are listed above. |
| USDA Foundation Foods search results for items 1123, 1124, and 1125 | The current USDA FDC result names `Eggs, Grade A, Large, egg whole/white/yolk`, but the readable search result does not expose a usable serving-weight or portion-variability row. It does not resolve the SR28/CNF differences or support a count value in this review. |

The same strict rule applies when a line's stored unit says `large egg` but its `originalText` only says `egg`: the recipe's stored unit is not evidence that its source specified size. In the 48 linked whole-egg rows, 26 original texts explicitly say large, one says medium, 20 have unsized count wording, and one is mass-based. Twelve unsized whole-egg lines are nevertheless stored with unit `large egg`: `006#4`, `009#3`, `016#2`, `019#1`, `023#7`, `027#6`, `047#1`, `053#4`, `069#1`, `093#5`, `102#4`, and `104#8`. Do not treat that normalized unit as a source-size claim.

## Ingredient parts and preparation-state boundaries

- **Whole eggs:** The 48 linked lines point to `ingredient-ref-egg`. Source text covers unsized eggs, explicitly large eggs, two medium eggs, and the mass expression `150 g whole eggs` (`045#1`). The mass expression already provides a weight and needs no count conversion. Recipe instructions use eggs before the recipe's cooking step; SR28/CNF raw edible portions therefore describe a different stage from the cooked dish's final mass.
- **Separated whole eggs:** `021#9` (six large), `068#3` (three large), `091#8` (four large), and `104#8` (four unsized) say the eggs are separated. They remain whole-egg counts before separation; do not recast a whole-egg weight as white or yolk mass or derive the component split from these rows.
- **Egg whites:** The 8 linked rows point to `ingredient-ref-egg-white`. Five specify large whites; three do not specify size. `003#4` carries its own 60 g mass. `008#8` and `035#5` ask for two large whites but have no exact government multi-white portion; `051#8` asks for five large whites. `079#3`, `079#7`, and `110#12` ask for one unsized white. Only `021#14` exactly matches the existing one-large-white government portion.
- **Egg yolks:** The 6 linked rows point to `ingredient-ref-egg-yolk`; four lines specify large yolks, one specifies three unsized yolks, and `045#7` is already 60 g. Only `110#4` exactly matches a published one-large-yolk portion. `057#8` (three large yolks) and `072#11` (one egg yolk) have no `ingredientRefId`; this review leaves both links untouched.
- **Preparation wording:** Beaten, whisked, room-temperature, or separated describes how the recipe will handle the ingredient. It does not make the recipe egg cooked, change the count basis, or justify a weight factor. The government measurements are raw edible portions before cooking; they are not the final cooked recipe yield.
- **Egg wash:** `072#13` is an unlinked `Egg wash` line with no amount. It can denote a prepared coating mixture and has no exact whole-egg count or state; do not map it to whole egg or infer a count.
- **Species:** Recipe lines use generic `egg`, `egg white`, and `egg yolk`; none explicitly says chicken. CNF codes 125–127 are explicitly chicken. USDA SR28 NDB 01123–01125 entries are raw whole egg/white/yolk without a species qualifier in the report's food description. Duck and quail have separate catalog references and species-specific source observations. Preserve this source qualification; do not make duck/quail the match for a generic recipe line or treat CNF's chicken qualifier as an explicit recipe qualifier.

## Government-source verification

Accessed 2026-10-10. These are corroborating links to the sources already cataloged under the IDs shown; no new source IDs are proposed here.

| Existing source ID | Primary source and reviewed claim | Limits retained |
| --- | --- | --- |
| `WP07-EGG-20261010-S01` | Health Canada [CNF food code 125](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=125): *Egg, chicken, whole, fresh or frozen, raw*; 1 large egg = 52.7 g, 2 large eggs = 105.4 g, 1 medium egg = 46.4 g; total refuse 12%. | CNF's household portion is edible amount, not shell-on weight. The 2-large measure is exact only for the two-large lines; the recipe corpus otherwise has counts CNF 125 does not publish as matching quantities. |
| `WP07-EGG-20261010-S02` | Health Canada [CNF food code 126](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=126): *Egg, chicken, white, fresh or frozen, raw*; 1 large white = 33.0 g; 3 unqualified whites = 99.0 g; total refuse 0%. | The single-large-white measure matches `021#14`; the unqualified three-white portion matches no recipe line. |
| `WP07-EGG-20261010-S03` | Health Canada [CNF food code 127](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=127&lang=eng): *Egg, chicken, yolk, fresh or frozen, raw*; 1 large yolk = 16.1 g; 2 unqualified yolks = 25.0 g; 4 unqualified yolks = 68.0 g; total refuse 0%. | The 1-large value matches `110#4`. The 2- and 4-yolk measures are not size-qualified and do not match current recipe wording. |
| `WP07-EGG-20261010-S04` | Health Canada [CNF Users Guide](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html), 2015 edition. | CNF describes average food-composition values and its household portions as edible weights; it does not give egg-specific portion-weight variability. CNF sources may not be statistically independent from USDA Standard Reference data. |
| `WP07-EGG-20261010-S05` | USDA ARS [SR28 Food Group 01](https://www.ars.usda.gov/ARSUserFiles/80400525/Data/SR/SR28/reports/sr28fg01.pdf), NDB 01123 (whole raw fresh; 1 large = 50 g), NDB 01124 (white raw fresh; 1 large = 33 g), NDB 01125 (yolk raw fresh; 1 large = 17 g). The common-measure values are in the edible-portion tables. | The whole-egg row does not name species; all values are source-specific and published to integer grams. SR28 does not publish the multi-count quantities needed for most larger recipe lines. |
| `WP07-EGG-20261010-S06` | USDA ARS [Home and Garden Bulletin 72](https://www.ars.usda.gov/ARSUserFiles/80400525/Data/hg72/hg72_2002.pdf), Table 9, printed p. 22 / PDF p. 28: 50 g per large edible whole egg, 33 g per large white, 17 g per large yolk. | The bulletin says the values derive from USDA Standard Reference Release 13, so it is corroborating historical publication, not an independent sample. |
| `WP07-EGG-20261010-S10` | USDA [FoodData Central Foundation Foods egg search](https://fdc.nal.usda.gov/food-search/?query=eggs&type=Foundation): results identify egg whole/white/yolk item IDs 1123/1124/1125 under `Eggs, Grade A, Large`. | The public search page exposes item names/IDs, but no readable edible count-portion mass or variability range was verified for these entries. No numeric observation is inferred from their labels. |

## Proposal recommendations

1. Retain the existing CNF, SR28, HG72, and Foodtasia observations as ledger evidence with their exact size, species, food-part, raw/fresh-or-frozen, edible-portion, and source qualifiers. Do not add duplicate source entries.
2. Associate an existing observation with a recipe line only where amount, named size, ingredient part, and source state align exactly as listed in the match table. A match does not activate `unitMappings` or turn the source observation into a universal conversion.
3. Leave whole egg, egg white, and egg yolk count conversion unavailable in the active catalog. Do not average CNF and SR28 or multiply a published one-count portion to fill a different recipe count.
4. Preserve `003#4`'s explicit 60 g as a Foodtasia recipe-specific white target; it does not alter the two-large-white lines `008#8` and `035#5`.
5. Keep unsized, unlinked, and composition-distinct lines unresolved as described. In particular, do not infer size from a stored unit, species from the CNF source, an egg-part split from a separated-egg line, or an egg count from egg wash.

## Search and integrity notes

Re-opened CNF food codes 125, 126, and 127; USDA SR28 Food Group 01 and NDB records 01123–01125; USDA FDC Foundation Foods search results; and the existing USDA HG72 source. Re-scanned the live 114-file corpus and current egg records/observations. This work only adds this proposal file. It does not alter canonical data, source IDs, recipe rows, or status fields.
