# WP07 Proposal: Chicken Egg Count-to-Mass and Edible-Portion Evidence Review

**Review date:** 2026-10-10  
**Status:** Proposal-only; no runtime mapping is justified by the evidence and current catalog shape.

## Disposition

Keep chicken egg, egg white, and egg yolk count-to-edible-mass values **ledger-only / runtime unknown**. The reviewed sources publish useful, source-qualified portion weights, but they conflict for large whole eggs and yolks, do not provide a measured variability range for those household portions, and are not represented with market, size-grade, edible-basis, and source-version qualifiers in the active mapping fields. Recipe demand also shows that some rows stored as large egg have unsized source text. Do not infer “large” or an edible fraction for an unspecified egg. Do not add egg density or a shell-on-to-edible conversion.

This follows FR-5: count generally should not auto-convert unless explicitly mapped; missing evidence remains unavailable. Plan §07 also separates source portion weight, count weight, edible-portion yield, and density, and treats egg count weight as size- and edible-portion-dependent. Plan §§09–10 require exact source qualifiers and traceable numeric values. This review is a proposal and leaves the shared catalog, ledger, plan, roadmap, code, and tests untouched.

## Live catalog and evidence snapshot

Refreshed from the current bundled package and research ledger on 2026-10-10. File hashes below are SHA-256 over raw bytes. The recipe-set hash is SHA-256 over each manifest-listed path sorted by relative path, then path bytes, NUL, raw file bytes, NUL.

| Artifact | Count | Bytes | SHA-256 |
| --- | --- | --- | --- |
| Ingredient references | 681 | 213,879 | 719bf518ca9156789d629268b9cf8f3b85e5d177bee161b3606cb9bdf326f77a |
| Ingredient forms | 34 | 23,272 | 904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938 |
| Units | 30 | 5,447 | 6f6e3afc8b2c12fe9120dbcf453d1e675fee596fa754f93cfead040a7ba8c8e4 |
| Seed manifest | 13 | 12,011 | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Package yields | 1 | 853 | 5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b |
| Research ledger | 3 | 1,662,149 | 1e9c1e466d269d68aa0f91a06230d6630cc1c65ea3fdd7b9515e30f7ae962131 |

Recipe package: **114 files, 1,123 ingredient rows, 750,318 combined bytes**, recipe-set SHA-256 **921fe260478d90251440fbb082d7b30be5828bfaddeaee67fe42541963aaa629**. The ledger has **868 records**, **8 unit conversions**, **1,566 source entries**, and **1,325 distinct source IDs**. Package yields contain one unrelated record.

The latest progress entry still has WP07 **in_review**. The workflow says the previous measurement review found no activation-ready conversion or density; its two granulated-sugar portions remain source-specific ledger observations. This egg review adds no shared progress record.

## Existing egg identities, forms, units, and ledger state

| Catalog ID | Display identity / aliases relevant to this review | Active numeric fields / forms |
| --- | --- | --- |
| ingredient-ref-egg | egg / œuf; EN alias eggs; FR aliases gros œuf, gros oeufs, œuf entier, œufs entiers, œuf large, oeufs, œufs moyens | defaultDensity null; unitMappings empty; no egg form |
| ingredient-ref-egg-white | egg white / blanc d'œuf; EN alias egg whites; FR aliases gros blanc d'oeuf, gros blancs d'oeufs | defaultDensity null; unitMappings empty; no egg form |
| ingredient-ref-egg-yolk | egg yolk / jaune d'œuf; EN alias egg yolks; FR aliases gros jaune d'oeuf, gros jaunes d'œufs, jaunes d'œufs | defaultDensity null; unitMappings empty; no egg form |
| ingredient-ref-duck-egg | duck egg / œuf de canard; plural aliases | defaultDensity null; unitMappings empty; no egg form |
| ingredient-ref-quail-egg | quail egg / œuf de caille; plural aliases | defaultDensity null; unitMappings empty; no egg form |

There are **34 forms and none is an egg form**. The three egg-specific units are large egg, large egg white, and large egg yolk; each is typed as count with itself as the base and factor 1. They name count units and encode no gram weight or source qualifier. Other egg recipe lines use count, g, or no unit.

The ledger records chicken whole egg, white, and yolk as blocked_pending_evidence; none has a structured measurement observation. The whole-egg record has a prior source about egg substitutes, not a count-weight measurement. The ledger’s duck/quail identity records cite USDA SR28 entries of 70 g edible portion per raw fresh duck egg (12% shell refuse) and 9.0 g per raw fresh quail egg (8% shell refuse). Those are species-specific USDA portions, not chicken evidence or shell-on weights, and neither is active in the catalog.

## Recipe demand audit

Scanned all **114** manifest recipes and **1,123 ingredient rows**. There are **62 linked chicken egg/white/yolk lines** across **55 recipe files**: 48 whole-egg lines, 8 white lines, and 6 yolk lines. No linked duck-egg or quail-egg lines were found. One additional unlinked line, Hamburger Buns 013#13, says “Egg wash” with no amount.

Original text—not the stored unit—is the size evidence:

- **Whole egg:** 26 source lines explicitly say large; 1 says medium; 20 are unsized count expressions; 1 is a mass expression. Stored units are 10 count, 1 g, 35 large egg, 2 —. Of the 35 lines stored as large egg, 12 have source text without “large”; source lines explicit about large sometimes remain stored as count or no unit.
- **Egg white:** 5 lines explicitly say large and 3 do not. Stored units are 4 count, 4 large egg white. The one recipe-specific line 003#4 gives 2 large egg whites (60 g).
- **Egg yolk:** 4 lines explicitly say large, 1 is an unsized count, and 1 is a mass expression. Stored units are 1 count, 1 g, 4 large egg yolk.

Recipe-line identifiers such as 001#2 use the three-digit recipe filename prefix and one-based ingredient position in that recipe file.

### Whole egg lines (48)

| Recipe line | Recipe | Source ingredient text | Stored unit |
| --- | --- | --- | --- |
| 001#2 | Air Fryer Baked Oats | 1 large egg | large egg |
| 006#4 | Nanaimo Bars | 1 egg, beaten | large egg |
| 008#7 | Vanilla Cake | 3 large eggs | large egg |
| 009#3 | Chocolate Chip Cookies | 1 egg | large egg |
| 012#5 | Lemon Crinkle Cookies | 2 large eggs | large egg |
| 013#6 | Pinwheel Cookies | 2 large eggs | large egg |
| 016#2 | Quinoa Bites | 2 eggs | large egg |
| 018#6 | Turkey Meatballs | 2 large eggs | large egg |
| 019#1 | Crab Balls | 1 egg, lightly whisked | large egg |
| 020#8 | Peanut Butter Brownies | 3 large eggs | large egg |
| 021#9 | Yule Log | 6 large eggs, separated | large egg |
| 023#7 | Air Fried Calamari | 1 egg | large egg |
| 027#6 | Breakfast Casserole | 10 eggs | large egg |
| 033#6 | Air Fryer Churros | 1 large egg | large egg |
| 038#7 | Buttermilk Pancakes | 1 large egg | count |
| 039#5 | Pancakes | 1 large egg | count |
| 045#1 | Strawberry Fraisier Cake | 150 g whole eggs | g |
| 047#1 | Chocolate Galettes | 1 egg | large egg |
| 050#10 | Devil's Food Cake | 3 large eggs, room temperature | large egg |
| 052#6 | Mango Cake | 2 medium eggs | — |
| 053#4 | Carrot Cake | 4 eggs | large egg |
| 054#7 | Cookie Cake | 1 large egg | large egg |
| 055#17 | Coffee Cake | 2 large eggs, room temperature | large egg |
| 056#1 | Pistachio Chocolate Mousse Cake | 2 eggs | count |
| 057#7 | Chocolate Truffle Cake | 3 large eggs | large egg |
| 058#5 | Queen Elizabeth Cake | 1 egg | count |
| 059#8 | Buttermilk Waffles | 2 large eggs, lightly beaten | large egg |
| 060#1 | Waffles | 1 large egg | large egg |
| 066#1 | Korean Soy-Marinated Jammy Eggs | 10 large eggs | large egg |
| 068#3 | Chocolate Mousse | 3 large eggs, separated | large egg |
| 069#1 | Double Chocolate Muffins | 1 egg | large egg |
| 070#7 | Nanaimo Cake | 2 large eggs | large egg |
| 072#10 | Hamburger Buns | 1 whole egg | count |
| 073#9 | Chocolate Banana Bread | 2 large eggs | large egg |
| 074#2 | Meatloaf | 1 egg | count |
| 075#1 | French Toast | 2 eggs | count |
| 081#10 | Pistachio Coconut Almond Cheesecake | 4 large eggs | — |
| 087#3 | Chicken Parmesan | 1 egg | count |
| 089#6 | Mushroom and Ham Quiche | 4 eggs | count |
| 091#8 | Red Velvet Cake with Cream Cheese Frosting | 4 large eggs, separated | large egg |
| 093#5 | Fried Rice | 1 egg | large egg |
| 094#5 | Brownie Cookie Sandwiches | 3 large eggs, room temperature | large egg |
| 102#4 | Chocolate Sausage | 1 egg | large egg |
| 104#8 | Asparagus Souffle | 4 eggs, separated | large egg |
| 107#2 | French Silk Pie | 2 large eggs | large egg |
| 109#5 | Pecan Pie | 1 large egg | large egg |
| 110#11 | Almond Frangipane Mini Tarts | 1 egg | count |
| 114#9 | German Chocolate Cake | 2 large eggs, room temperature | large egg |

### Egg white lines (8)

| Recipe line | Recipe | Source ingredient text | Stored unit |
| --- | --- | --- | --- |
| 003#4 | Amaretti | 2 large egg whites (60 g), lightly beaten | large egg white |
| 008#8 | Vanilla Cake | 2 large egg whites | large egg white |
| 021#14 | Yule Log | 1 large egg white | large egg white |
| 035#5 | Coconut Macaroons | 2 large egg whites | count |
| 051#8 | Strawberry Cake | 5 large egg whites, room temperature | large egg white |
| 079#3 | Almond Paste and Marzipan | 1 egg white, lightly beaten, at room temperature | count |
| 079#7 | Almond Paste and Marzipan | 1 egg white, lightly beaten, at room temperature | count |
| 110#12 | Almond Frangipane Mini Tarts | 1 egg white | count |

### Egg yolk lines (6)

| Recipe line | Recipe | Source ingredient text | Stored unit |
| --- | --- | --- | --- |
| 010#8 | Linzer Cookies | 2 large egg yolks | large egg yolk |
| 045#7 | Strawberry Fraisier Cake | 60 g egg yolks | g |
| 046#3 | French Buttercream | 5 large egg yolks | large egg yolk |
| 088#5 | Chocolate Pudding | 3 egg yolks | count |
| 110#4 | Almond Frangipane Mini Tarts | 1 large egg yolk | large egg yolk |
| 114#16 | German Chocolate Cake | 3 large egg yolks | large egg yolk |

### Unlinked egg-wash line

| Recipe line | Recipe | Source ingredient text | Stored unit |
| --- | --- | --- | --- |
| 072#13 | Hamburger Buns | Egg wash | — |

## Primary-source evidence reviewed

All web access dates below are **2026-10-10**. Published source precision is preserved as shown; no cross-source average is calculated.

| Source and exact locator | Published portion / claim | Basis, geography, and limits |
| --- | --- | --- |
| [Health Canada, Canadian Nutrient File (CNF), food code 125](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=125) | Egg, chicken, whole, fresh or frozen, raw: 1 large egg 52.7 g; medium 46.4 g; small 41.6 g; extra large 58.1 g; jumbo 64.8 g; peewee 33.5 g; 2 large eggs 105.4 g. Total refuse 12%. Page modified 2019-03-01. | Canadian generic raw/fresh-or-frozen whole-chicken-egg record. CNF user guide says household portion weights are edible material without refuse; 52.7 g is therefore the contents portion, not an in-shell size threshold. The page gives no sample count/range for the serving weights and does not establish that its large portion is a particular carton grade. The 12% refuse is source-record refuse, not a universal shell fraction. |
| [Health Canada CNF, food code 126](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=126) | Egg, chicken, white, fresh or frozen, raw: 1 large egg white 33.0 g; 3 egg whites 99.0 g; total refuse 0%. Page modified 2019-03-01. | Canadian generic raw white. Edible white weight; not whole in-shell egg mass. The page supplies no sample count/range for the portion. |
| [Health Canada CNF, food code 127](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=127&lang=eng) | Egg, chicken, yolk, fresh or frozen, raw: 1 large egg yolk 16.1 g; 2 egg yolks 25.0 g; 4 egg yolks 68.0 g; total refuse 0%. Page modified 2019-03-01. | Canadian generic raw yolk. The two- and four-yolk measures are not labelled large; 25.0 g for two does not scale consistently with 16.1 g for one large, while 68.0 g for four is 17 g each. Preserve as separate published portions; do not average or use the unqualified multi-count measures as a large-yolk map. No sample count/range is shown. |
| [Health Canada, Canadian Nutrient File — Users Guide](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html), 2015 edition, “Introduction,” “Limitations,” and “Portion size conversion factors” | CNF reports average values for food available in Canada; much of the data comes from USDA SR up to and including SR27. Generic household portion weights are edible weights without refuse and may differ from local market items. | This qualifies the CNF portion records. It also means CNF and USDA records are not necessarily independent measurement samples. The guide does not publish egg portion-weight sample size or variability. |
| [USDA ARS Standard Reference Release 28, Food Group 01 PDF](https://www.ars.usda.gov/ARSUserFiles/80400525/Data/SR/SR28/reports/sr28fg01.pdf), NDB 01123 (PDF pp. 401–404), 01124 (pp. 374–376), 01125 (pp. 413–416) | NDB 01123 Egg, whole, raw, fresh: 1 large 50 g, extra large 56 g, jumbo 63 g; entry says 12% shell refuse. NDB 01124 Egg, white, raw, fresh: 1 large 33 g, 0% refuse. NDB 01125 Egg, yolk, raw, fresh: 1 large 17 g, 0% refuse. | USDA SR28 (2015), U.S. reference-data context; household weights are in the “amount in edible portion of common measures” section. The whole row does not explicitly name species; treating it as chicken is an inference from the conventional generic egg row and separate duck/quail records. Values are published to integer grams; the report gives no weight sample distribution for these portions. Nutrient-analysis “number of data points” is not a sample count for portion weight. |
| [USDA ARS, Home and Garden Bulletin 72, Nutritive Value of Foods](https://www.ars.usda.gov/ARSUserFiles/80400525/Data/hg72/hg72_2002.pdf), revised October 2002, Table 9 “Nutritive value of the edible part of food,” printed p. 22 / PDF p. 28 | Raw whole egg: medium 44 g, large 50 g, extra large 58 g; large white 33 g; large yolk 17 g. The bulletin states its values are from USDA Standard Reference Release 13. | Older U.S. government table explicitly identifies edible part and size-labelled counts. It corroborates the 50/33/17 values but is not an independent study from USDA SR data; it gives no weight sample distribution. It does not establish a shell-on conversion. |
| [USDA FoodData Central, Foundation Foods search for eggs](https://fdc.nal.usda.gov/food-search/?query=eggs&type=Foundation) and [download page](https://fdc.nal.usda.gov/download-datasets/) | Official search results include Foundation entries named Eggs, Grade A, Large, egg whole, egg white, and egg yolk (NDB numbers 1123, 1124, 1125) and display 2019-07-08 for those rows. The download page lists Foundation Foods as released April 2026 and describes the data type as sample-based with variability information. | Potentially relevant current FDC records with explicit U.S. Grade A/large labels. The browser-readable search result exposes item labels and identifiers but not the serving-weight/sample-range details needed here. The official JSON ZIP endpoint (https://fdc.nal.usda.gov/fdc-datasets/FoodData_Central_foundation_food_json_2026-04-30.zip) was rejected by the web reader as unsupported application/zip; direct API/detail results did not expose a readable record body. Therefore no exact FDC portion mass, sample count, or variation is claimed. FDC's latest SR Legacy download is April 2018 and USDA calls SR Legacy final/no longer updated; it is not a new independent measurement from SR28. |
| [USDA AMS, United States Standards, Grades, and Weight Classes for Shell Eggs](https://www.ams.usda.gov/sites/default/files/media/Shell_Egg_Standard%5B1%5D.pdf), AMS 56, §56.218 (PDF p. 10) | U.S. Large shell-egg class: minimum 24 oz net per dozen; individual eggs at a rate of 23 oz per dozen; the standard permits a lot-average tolerance of 3.3% for individual eggs in the next lower class, as long as no individual case exceeds 5%. | Shell-on class/lot requirements for U.S. consumer-grade eggs. These are not edible contents masses, not a per-egg edible weight, and not a conversion factor. |
| [CFIA, Labelling requirements for shell eggs](https://inspection.canada.ca/en/food-labels/labelling/industry/shelled-eggs-products), “Size designation” | Canada A shell-egg size designations are based on shell-egg weight; Large is not less than 56 g, Medium not less than 49 g, XL not less than 63 g, Jumbo not less than 70 g, Small not less than 42 g, and Peewee below 42 g. | Canadian shell-on class thresholds, not edible contents weight or a mean. They do not turn an unspecified egg into large and cannot be substituted for a raw edible count portion. |
| [Foodtasia, Italian Almond Paste Cookies](https://foodtasia.com/almond-paste-cookies/), published 2021-10-13, modified 2024-05-10, ingredient list and “Tips for Success” | The author says two large egg whites should weigh 60 g, recommends weighing the whites, and says to use large eggs if no scale is available. This is also live recipe 003#4. | Recipe-specific target/basis for this dough, not a generic population estimate. It differs from two times CNF/USDA’s 33 g large-white portion (66 g); it gives no sample count or distribution and cannot justify a universal white mapping. |

### Search and access record

Queries run on 2026-10-10:

- site:food-nutrition.canada.ca/cnf-fce/serving-portion id 125 Egg chicken whole fresh raw large egg 52.7; opened exact CNF codes 125, 126, and 127.
- USDA SR28 Food Group 01 Egg whole raw fresh NDB 01123 1 large 50 g PDF; then inspected SR28 NDB records 01123, 01124, and 01125.
- site:inspection.canada.ca Labelling requirements shell eggs large 56 g egg weight; opened CFIA size designations.
- site:ams.usda.gov United States Standards Grades Weight Classes Shell Eggs 24 oz dozen 23 oz individual; opened AMS 56 §56.218.
- site:fdc.nal.usda.gov/food-search/ Eggs Grade A Large egg whole egg white egg yolk Foundation; opened current FDC search and download pages. The page lists item names but not readable masses in this extraction; the ZIP was not readable by the browser tool.
- Foodtasia almond paste cookies two large egg whites 60 grams; opened the recipe source and confirmed its prose and ingredient list.
- USDA HG72 Nutritive Value of Foods Table 9 eggs 50 g 33 g 17 g; opened the USDA bulletin, Table 9.

## Basis distinctions and evidence interpretation

1. **Whole shell egg / grade:** CFIA and AMS describe shell-on grade classes. Their 56 g Canadian large lower bound and U.S. dozen class thresholds are not edible portion masses. Neither gives the edible portion for a recipe's “1 egg.”
2. **Edible whole raw egg:** CNF and SR28 publish edible count portions for size-labelled raw whole eggs, but their large values differ: 52.7 g (CNF Canada) versus 50 g (USDA SR28/HG72 U.S.). Preserve as different source records; do not average.
3. **White and yolk:** These are separate edible ingredients and count portions. The sources show 33 g for large whites in both CNF and USDA, while large yolk is 16.1 g CNF versus 17 g USDA. The recipe-specific 60 g for two large whites is another source-scoped result.
4. **Unspecified size:** A recipe saying “egg,” “egg white,” or “egg yolk” without a size does not select a large portion. No edible fraction for an unspecified shell egg is inferred. Source refuse percentages cannot be turned into a universal shell-removal factor.
5. **Count-to-mass is not density:** “1 large edible egg = X g” is a count-to-edible-mass observation. It does not state grams per millilitre. CNF also lists 100 ml = 102.7 g for raw liquid whole egg; that is a separate volume-mass portion observation and is not used here to assign a density or to infer shell-on weight.

## Runtime disposition

No exact mapping is justified for runtime in the current catalog. The active references do not distinguish raw/fresh state or source region; the large egg count unit has no source/grade/basis qualifier; and unitMappings on the egg references are empty. A general map on the broad egg identity could be applied to an unsized recipe line, as the line audit demonstrates. The CNF whole/yolk conflicts and the yolk count inconsistency also prevent a source-neutral factor. Keep source-qualified observations in this proposal/ledger research scope only; leave runtime conversion unavailable.

For any future proposal to activate an egg measure, require the original line to specify egg part, raw/cooked state as relevant, size class, source market, and requested shell/edible basis. An explicit Canadian large raw whole egg could be reconsidered as a narrow evidence record only if the data model can preserve those qualifiers and avoid applying it to unsized rows. That would not authorize a general egg mapping, density, white/yolk split, or shell-on-to-edible fraction.

## Remaining evidence gaps

- Retrieve the exact current FDC Foundation item payload for NDB 1123/1124/1125 and inspect its serving weights, source metadata, sample counts, and variation. The public search page found the entries; the April 2026 ZIP and the direct detail output were not readable in this review.
- Find an egg-specific independent measurement dataset that states the source market, grade, sample count, individual or summary edible weights, and shell-removal method for whole, white, and yolk.
- Clarify whether the CNF large egg serving aligns to any Canadian shell grade. The current CNF page does not state that relationship.
- Resolve why CNF code 127 publishes 1 large yolk = 16.1 g but 2 yolks = 25.0 g and 4 yolks = 68.0 g; the larger portions have no size qualifier.
- Recipe lines lack source-market fields. Confirm source truth for the 12 whole-egg rows stored as large egg even though source text is unsized, and the three explicit-large rows stored as count or no unit before considering any line-level conversion.
- Review the one unlinked Egg wash row if it needs catalog identity or quantity; it has no amount and offers no count-to-mass evidence.
- Duck and quail values remain species-specific. This package has no duck/quail recipe demand, and their source weights must not be transferred to chicken eggs.
- No density value is established by this review; volume-mass records need their own state, method, and source review, separate from count-to-mass.

## Scope and validation

This file is the only output of this review. No catalog, ledger, plan, roadmap, code, or test file was edited. No tests or integration work were run.
