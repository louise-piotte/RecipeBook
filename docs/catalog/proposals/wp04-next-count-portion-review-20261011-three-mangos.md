# WP04 Proposal: Three-Mango Count Portion Review

**Review date:** 2026-10-11
**Status:** The count-only disposition was recorded in the 2026-10-11 follow-up integration. The saved recipe line and runtime mapping remain unchanged; see the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md).
**Scope:** One uncovered fresh-mango count line, recipe `052#1`. This review checks the saved variant against its linked publisher page and official fruit-portion sources. It does not create a recipe edit or reusable conversion.

## Recommendation

Keep recipe `052#1` at **3 mangos** with its structured unit still absent. Do not assign a mass or calculate a three-fruit total. The current Allrecipes ingredient card uses canned sweetened mango pulp; the saved fresh-mango variant is traced to a 2016 reader comment on that page, not to the current author-controlled ingredient list. The comment confirms the count used for that alternative but gives no fruit size, variety, ripeness, peel/pit preparation, or weight.

Official generic raw-mango portions are not consistent: Health Canada's interim CNF 2015 page lists 1 fruit as 207.0 g with 29% refuse, while USDA SR28 lists 1 fruit without refuse as 336 g and also 29% seeds and skin. USDA's older 2002 table lists 207 g. Keep these as distinct source-specific observations if later recorded; do not combine them into a 207–336 g range, select one for the recipe, multiply either value by three, or activate a count mapping. The current CNF 2026 and USDA FDC materials were checked for version context, but no current 2026 whole-mango count value was verified in the accessible source data.

## Exact bundled line and live state

| Field | Current value / finding |
|---|---|
| Recipe | `052` — *Mango Cake* / *Gâteau à la mangue*, manifest position 52 of 114. |
| Ingredient line | `9ec55a0a-92b7-425d-9d7f-1a9a455022bb-ingredient-1` (`052#1`). |
| Exact bundled text | `3 mangos`. |
| Structured amount | `quantity: 3`; no `unit` field. Group: `Mango Puree`. |
| Preparation | The saved instructions blend mangos with icing sugar and milk until smooth. They do not say whether fruit is peeled or pitted, or at what stage the amount would be weighed. |
| Existing reference | `ingredient-ref-mangos`, `mangos / mangues`, category `FRUIT`; null density and empty unit mappings. No linked form. |
| Existing ledger state | `identityState: unreviewed`; `measurementState: not_yet_researched`; no source entries or decisions. |
| Saved source metadata | Allrecipes URL; `recipekeeper-manual-cleanup`, parser version `2026-04-05`. The saved notes identify this as a fresh-mango alternative. |

## Publisher-version and line-match audit

The linked Allrecipes page currently says it was updated **March 31, 2026**. Its author-controlled card lists `1 ½ cups canned sweetened mango pulp`; the recipe tip says this is often called Kesar mango pulp. The page does not list three whole mangoes in its current ingredient card.

The page's August 9, 2016 reader comment says the reviewer could not find the canned pulp and made their own, giving `3 mangos` with powdered sugar and milk, blended until smooth. The bundled line and its adjacent `2 tbsp icing sugar` and `60 ml milk` track that reader's alternative. This is an exact count match for the saved variant, but it is reader-submitted method evidence rather than the current publisher ingredient list. Neither the comment nor the bundle identifies mango size, cultivar, maturity, or peel/pit handling.

Prior-corpus audit found `052#1` mentioned in `wp03-section-m-open-fruit-followup-20261009.md` only as an existing identity to retain. The current research ledger has no mango source or measurement observation, and no earlier WP04 count/portion proposal or integration covers this line. The 2026-10-11 recipe-count follow-up integration covers carrot, banana, celery, and sweet potato, not mango.

## Portion evidence and limits

| Dimension | Evidence | Match limit |
|---|---|---|
| **Count** | The 2016 Allrecipes reader comment uses three mangoes for its fresh-pulp alternative; the bundle preserves that count. | It is not the current author-controlled ingredient amount. It is a household substitution report, not a publisher-tested standard. |
| **Food state** | The comment contrasts fresh fruit with canned sweetened pulp and says the fruit is blended. CNF/SR28 portions below describe raw mango. | The comment does not specify ripe/green state, cultivar, or whether the mangoes are peeled and pitted before blending. Do not equate the saved line with canned pulp. |
| **Size / variety** | CNF 2015 gives a generic `1 fruit`; USDA SR28 NDB 09176 includes a cultivar footnote for Tommy Atkins, Keitt, Kent, and/or Haden. | No recipe or comment size/variety matches a selected portion. USDA SR28 does not identify which listed cultivar produced the whole-fruit measure. |
| **Edible versus as-purchased** | CNF presents the portions alongside 29% refuse for seeds and skin; its database describes values per 100 g edible portion. USDA SR28 labels 336 g as `1 fruit without refuse` and lists 29% seeds and skin. | Neither figure is the whole as-purchased fruit weight. The comment does not state peel/pit handling or weigh the resulting puree. Do not calculate gross weight or puree yield from refuse. |
| **Published weight conflict** | CNF 2015: `1 fruit = 207.0 g`; USDA SR28: `1 fruit without refuse = 336 g`; USDA HG72 (2002): `1 mango = 207 g` for raw mango without skin and seed. | These are separate published portions with different versions and possibly different portion conventions or fruit-size assumptions. They are not endpoints of a measured population range. Do not average, reconcile, or use one to settle the recipe amount. |
| **Current database coverage** | Health Canada has released CNF 2026 relational files, including measure-weight conversion data. USDA's current FDC downloads page lists Foundation Foods April 2026 and FNDDS 2021–2023; SR Legacy's last release is April 2018. | The accessible current-data pages did not expose a verified whole-mango count row for this exact unqualified recipe line. Do not relabel the CNF 2015 website value as a CNF 2026 value or attribute a current count measure to USDA without the corresponding source row. |
| **Other primary method evidence** | USDA AMS's mango lab SOP says to wash and drain the mango, not peel it, cut around the pit, and count units. | This is sample-preparation guidance, not a culinary portion or count weight. Its mango skin state is not shown to match the recipe's puree preparation. |

## Source register

| ID | Primary source | Evidence used and limits |
|---|---|---|
| **WP04-MANGO-COUNT-20261011-S01** | Allrecipes, [Delightfully Exotic Mango Cake](https://www.allrecipes.com/recipe/242162/delightfully-exotic-mango-cake/), current ingredient card, recipe tip, and reader photo/comment section. | Page states “Updated on March 31, 2026”; current card lists 1½ cups canned sweetened mango pulp. A reader comment dated August 9, 2016 gives the fresh alternative with three mangoes, powdered sugar, and milk. The comment matches the saved variant's count and blending context only; it gives no fruit dimensions, cultivar, ripeness, peel/pit state, or weight. Accessed 2026-10-11. |
| **WP04-MANGO-COUNT-20261011-S02** | Health Canada, Canadian Nutrient File 2015, [Mango, raw, food code 1603](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=1603). | Lists `1 fruit = 207.0 g`, `1/2 fruit = 103.5 g`, and 29% refuse (seeds and skin). This is a generic raw-mango portion from the interim 2015 web file, not a current 2026 row, fruit-size standard, or recipe-specific measurement. |
| **WP04-MANGO-COUNT-20261011-S03** | USDA ARS, [SR28 Food Group 09: Fruits and Fruit Juices](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg09.pdf), NDB 09176, *Mangos, raw*, printed pp. 520–522. | Lists 29% seeds and skin; common measures include 165 g per cup pieces and 336 g per `1 fruit without refuse`. Footnote 1 says values are based on analyses of Tommy Atkins, Keitt, Kent, and/or Haden cultivars. This is an edible-portion legacy measure, not a whole as-purchased mass or the selected cultivar/size for recipe 052. SR28 was USDA's 2015 release and remains the latest SR Legacy release. |
| **WP04-MANGO-COUNT-20261011-S04** | USDA ARS, [Home and Garden Bulletin 72, Table 9](https://www.ars.usda.gov/ARSUserFiles/80400525/Data/HG72/hg72_2002.pdf), row 319, printed p. 38. | Lists raw mango without skin and seed, “about 1½ per lb with skin and seed,” with `1 mango = 207 g`. It is an older edible-part table. It does not specify the source comment's mango size or cultivar and does not resolve the SR28 value. |
| **WP04-MANGO-COUNT-20261011-S05** | Health Canada, [Canadian Nutrient File 2026 dataset and resource files](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109); Health Canada, [CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html). | Confirms CNF 2026 is published as relational downloadable files and the 2015 online interface remains an interim lookup while a more user-friendly 2026 interface is developed. A specific 2026 mango measure row was not verified in the accessible data; no numeric value is attributed to this source. |
| **WP04-MANGO-COUNT-20261011-S06** | USDA ARS, [FoodData Central downloads](https://fdc.nal.usda.gov/download-datasets/); USDA ARS, [Foundation Foods documentation](https://fdc.nal.usda.gov/Foundation_Foods_Documentation/); USDA ARS, [FNDDS 2021–2023 downloads and portions/weights workbook](https://www.ars.usda.gov/northeast-area/beltsville-md-bhnrc/beltsville-human-nutrition-research-center/food-surveys-research-group/docs/fndds-download-databases/). | Establishes current FDC data-type/version context and that portion measures are data-type-specific; the FNDDS page links its official portion/weight workbook. The workbook and current Foundation mango measure rows were not extractable through the available page reader, so this review attributes no current FDC whole-fruit value. |
| **WP04-MANGO-COUNT-20261011-S07** | USDA AMS, [PDP Laboratory Operations SOP](https://www.ams.usda.gov/sites/default/files/media/PDPLABOPSOP.pdf), §5.3.27, “Mangoes.” | Sample preparation instructs the lab to wash, not peel, cut around and remove the pit, and count units. It supplies no household count weight and does not establish the recipe's preparation state. |
| **Local corpus** | [Bundled recipe 052](../../../app/src/main/assets/seed/bundled-library/recipes/052-gateau-aux-mangues-mango-cake-9ec55a0a-92b7-425d-9d7f-1a9a455022bb.v1.json), current manifest, reference file, and research ledger. | Checked on 2026-10-11. Confirms the exact count line, source URL, current reference state, empty mango forms, and no existing mango ledger sources or observations. |
| **Prior identity review** | [WP03 Section M open-fruit follow-up](wp03-section-m-open-fruit-followup-20261009.md), row `052#1`. | Retains the existing mango identity only; it does not review count weight, edible portion, or mass. |

## Evidence-based disposition

The saved recipe's three-fruit count is supported as a **reader-reported fresh-mango variant** on the linked Allrecipes page, but it is not the current publisher card's ingredient line. Generic raw-mango references show materially different source-specific edible portions, and neither supplies the variant's fruit size, cultivar, or puree basis. Keep the count and its source distinction; leave recipe mass unavailable. If future ledger work records the CNF or USDA values, preserve them as separate source-qualified observations and keep them out of any runtime count conversion until fruit-size and recipe-basis compatibility is established.
