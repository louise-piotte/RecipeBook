# WP07 Proposal: FDC Chicken-Egg Portion Retrieval and Sample Variability

**Review date:** 2026-10-10

**Status:** The initial evidence audit was proposal-only. A coordinator follow-up later retrieved the official April 2026 archive and integrated the three verified count portions as ledger-only observations; the initial retrieval limits below describe the earlier review path. See [official archive retrieval follow-up](wp07-fdc-chicken-egg-archive-retrieval-20261010.md).

## Disposition

Keep the chicken-egg portion issue open and keep all three runtime measurement states blocked. Official FoodData Central (FDC) search confirms the Foundation Foods egg records by their NDB numbers and descriptions, but the exact FDC item IDs, food-portion rows, weights, and portion bases could not be read in this review. The 2019-07-08 date shown in the official search results is not a serving measure or sample date. The official search rows are not enough to claim that any candidate detail-page ID or mirror-listed weight belongs to the USDA record.

Two independent research sources document sample-level differences in egg-part weights, but neither supports a general count-to-mass rule for this library. The UK report presents 12 group-average observations per UK shell-size band, rather than individual-egg min/max values. The U.S. retail study reports brand means from eggs whose size class is not stated. These data are useful as bounded variability evidence, but they are not a Canadian or U.S. “large egg” conversion and cannot resolve unsized recipe lines.

Do not add an FDC or sample-range measurement observation to the shared ledger from this review. The current ledger schema stores a single positive scalar per measurement observation and has no fields for sample size, range, minimum, maximum, standard deviation, or standard error. Leave sample ranges in research documentation until exact source rows and a safe representation are available. Do not infer density, a shell fraction, universal count mapping, substitution, or recipe relinks.

This follows Requirements.md FR-5, which says count quantities should generally not auto-convert unless explicitly mapped, and WP07 §07, which requires source-qualified observations and rejects category-density defaults.

## Snapshot and existing egg records

The inspected package contains 710 ingredient references, 34 forms, 30 units, 899 evidence-ledger records, and 114 manifest-listed recipes with 1,123 ingredient lines.

The active references are:

| Reference | Catalog state relevant to portions |
| --- | --- |
| ingredient-ref-egg | English egg / French œuf; default density is null; unit mappings are empty. |
| ingredient-ref-egg-white | English egg white / French blanc d'œuf; default density is null; unit mappings are empty. |
| ingredient-ref-egg-yolk | English egg yolk / French jaune d'œuf; default density is null; unit mappings are empty. |

There are no egg forms. The units large egg, large egg white, and large egg yolk are count units with only self-base factor 1. They do not map to grams. The three egg ledger records each remain blocked_pending_evidence. The ledger already contains 23 source-qualified count-to-edible-mass observations: 13 whole-egg, five white, and five yolk. No FDC observation is present.

The existing evidence has real source and market collisions that must stay separate. Health Canada's Canadian Nutrient File (CNF) reports one large whole egg at 52.7 g, while USDA SR28 and the older USDA HG72 table report 50 g for a large edible whole egg. CNF and the USDA sources report one large white at 33 g. For a large yolk, CNF reports 16.1 g while SR28 and HG72 report 17 g. CNF also has two unsized-yolk portions of 25 g for two yolks and 68 g for four yolks; neither is scaled from the large-yolk entry. HG72 states that its egg values derive from SR13, so it is corroborative rather than independent of that USDA series.

Primary references for those current ledger collisions: [CNF whole egg, food code 125](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=125), [CNF white, food code 126](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=126), [CNF yolk, food code 127](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=127&lang=eng), [USDA SR28 Food Group 01](https://www.ars.usda.gov/ARSUserFiles/80400525/Data/SR/SR28/reports/sr28fg01.pdf), and [USDA HG72](https://www.ars.usda.gov/ARSUserFiles/80400525/Data/hg72/hg72_2002.pdf).

## Official FDC records and retrieval audit

### Search records

The [official FDC Foundation search](https://fdc.nal.usda.gov/food-search/?query=eggs&type=Foundation) returns these egg entries:

| Official result | Search identifier shown | What the result establishes |
| --- | ---: | --- |
| Eggs, Grade A, Large, egg whole | NDB 1123 | Foundation record name and category; no readable portion amount or basis. |
| Eggs, Grade A, Large, egg white | NDB 1124 | Foundation record name and category; no readable portion amount or basis. |
| Eggs, Grade A, Large, egg yolk | NDB 1125 | Foundation record name and category; no readable portion amount or basis. |

The search table displays 2019-07-08 for these rows. Its sortable column is labeled Most Recent Acquisition Date; I do not treat that date as an egg-serving date, a publication date, or an indication of portion variability. USDA’s [official field descriptions](https://fdc.nal.usda.gov/docs/Download_Field_Descriptions_Oct2020.pdf) distinguish NDB_number from fdc_id. The three search identifiers therefore cannot be substituted for the FDC IDs required by the detail API.

### Methods tried and results

| Path | Exact URL or method | Result on 2026-10-10 |
| --- | --- | --- |
| Official Foundation search | https://fdc.nal.usda.gov/food-search/?query=eggs&type=Foundation | Search-index extraction exposes the three NDB rows above. Direct page extraction exposes the page shell and result headings, but not their measure rows or serving weights. |
| Official API search | GET https://api.nal.usda.gov/fdc/v1/foods/search?api_key=DEMO_KEY&query=Eggs%2C%20Grade%20A%2C%20Large%2C%20egg%20whole&dataType=Foundation; same path with query=Eggs%2C%20Grade%20A%2C%20Large%2C%20egg%20white and query=Eggs%2C%20Grade%20A%2C%20Large%2C%20egg%20yolk | The web retrieval tool returned “URL is not accessible” for all three; no HTTP response or JSON was obtained. The official [API guide](https://fdc.nal.usda.gov/api-guide/) documents /foods/search and says each request requires a data.gov key. It documents DEMO_KEY for exploration with lower limits. |
| Official item API | https://api.nal.usda.gov/fdc/v1/food/748967?api_key=DEMO_KEY; https://api.nal.usda.gov/fdc/v1/food/747997?api_key=DEMO_KEY; https://api.nal.usda.gov/fdc/v1/food/748236?api_key=DEMO_KEY | These are candidate IDs found in a previously reviewed third-party transcription, not FDC IDs verified from USDA. The web retrieval tool marked each URL inaccessible. A direct curl attempt for 748967 exited 6 with “Could not resolve host: api.nal.usda.gov” and HTTP 000. No item payload was retrieved; this does not establish whether the candidate IDs are valid. |
| Official item UI | https://fdc.nal.usda.gov/food-details/748967/nutrients; https://fdc.nal.usda.gov/food-details/747997/nutrients; https://fdc.nal.usda.gov/food-details/748236/nutrients | Each candidate path returned 404 through the web reader. Because the IDs were not officially confirmed, the 404s do not show that the NDB search records lack item pages. |
| Official April 2026 Foundation CSV archive | https://fdc.nal.usda.gov/fdc-datasets/FoodData_Central_foundation_food_csv_2026-04-30.zip | The official download page links this archive. The browser reader rejected its application/zip content type; direct curl exited 6 with “Could not resolve host: fdc.nal.usda.gov” and HTTP 000. No archive contents were inspected. |
| Official April 2026 Foundation JSON archive | https://fdc.nal.usda.gov/fdc-datasets/FoodData_Central_foundation_food_json_2026-04-30.zip | The official download page links this archive. Clicking the link produced the same unsupported application/zip response; direct workspace host resolution for fdc.nal.usda.gov failed. No archive contents were inspected. |

The [official download page](https://fdc.nal.usda.gov/download-datasets/) lists the April 2026 Foundation Foods CSV and JSON releases. USDA’s [Foundation Foods documentation](https://fdc.nal.usda.gov/Foundation_Foods_Documentation/) explains that Foundation records can expose individual sample nutrient/component values and acquisition metadata. This general capability does not certify that the measure row for any egg item contains a sampled weight distribution.

The official field descriptions define a food_portion row with a measure amount, unit, description/modifier, gram_weight, data_points, footnote, and minimum acquisition year. data_points is a count of observations behind the measure; it is not a range or a distribution. The portion field description lists one gram weight and does not define min/max or standard-deviation fields. The same document does define min, max, median, and standard_error for nutrient values, but those are nutrient statistics and cannot be repurposed as variation in an egg serving weight.

**Verified source basis:** only the three official Foundation search descriptions and NDB numbers.

**Not verified:** FDC IDs; portion amount/unit/description/modifier; gram weights; whether any whole-egg measure includes or excludes shell; sample count for portion weights; acquisition details for portion weights; or any portion-weight variability.

No numeric third-party mirror values were copied into this packet or the shared ledger.

## Independent sample-variability evidence

These sources can inform a later review of sample variability. Their means and ranges remain research evidence, not a recipe conversion.

### United Kingdom Department of Health sampling report

[Nutrient analysis of eggs — Sampling Report](https://assets.publishing.service.gov.uk/media/5a7aa918ed915d71db8b19bf/Nutrient_analysis_of_eggs_Sampling_Report.pdf), UK Department of Health, 29 June 2012. Relevant locators: sampling protocol and size definitions, PDF pp. 5–8; raw white/yolk methods and size tables, PDF pp. 18–20.

The report's sampling notes say samples were collected before grading at three UK distribution centres between 22 and 25 March 2011. Detailed sample sheets conflict with that summary: subsamples 1–2 list 22 March 2010 (PDF text line 197), and subsamples 7, 11, and 12 list March 2010 dates (lines 242, 304, and 321), while other detail sheets list 2011. The collection year is therefore internally inconsistent and the summary date range is not uniformly verified. Eggs were sorted into UK medium (53–62.9 g shell-on) and large (63–73 g shell-on) bands. Each composite sample had 12 subsamples; each raw sample used 24 eggs. Samples covered enriched-cage, barn, free-range, and organic production types, with substitutions when barn or organic samples were unavailable. Tables say all entries are average values.

The 12 raw-part entries per size band are sample-group averages in grams:

| UK shell-on band | Raw white group means | Raw yolk group means | Published means |
| --- | ---: | ---: | --- |
| Medium, 53–62.9 g | 34.4–37.5 g | 14.1–15.7 g | white 36.0 g; yolk 15.1 g |
| Large, 63–73 g | 39.1–42.7 g | 15.7–17.7 g | white 40.7 g; yolk 16.6 g |

These intervals are the minimum and maximum of the 12 published subsample averages in each size band, not individual-egg minima/maxima or confidence intervals. UK shell-on bands are not assumed equivalent to Canadian or U.S. carton size labels. Whites were separated with commercial separators; the report says yolk samples contained small amounts of white, white samples contained no yolk, and blood spots were removed. The report also shows an edible-portion factor for whole eggs, but this review does not convert it into a universal shell-removal factor or a count mapping.

This is usable evidence for source-bounded group-average variability in raw egg parts. It is not usable as a generic one-white/one-yolk recipe weight, a Canadian/U.S. large-egg rule, a shell-on-to-edible conversion, or an individual egg range.

### U.S. commercial retail study

[Hisasaga, Griffin, and Tarrant, “Survey of egg quality in commercially available table eggs,” Poultry Science 99(12), 7202–7206 (2020)](https://pmc.ncbi.nlm.nih.gov/articles/PMC7705037/), DOI [10.1016/j.psj.2020.09.049](https://doi.org/10.1016/j.psj.2020.09.049). Relevant locators: methods and brand counts, “Materials and methods” and Table 1; masses, Table 2.

The study measured total, shell, yolk, and albumen weights per egg using a digital scale. It reports 309 eggs from two sampling periods spanning seven months and six retail brands. The article’s Table 1 brand counts sum to 306 (36, 26, 46, 104, 82, 12), which does not reconcile to the stated 309 total. Methods call the eggs “A grading”; this is quality grade and does not specify an egg-size class. Table 2 labels total egg weight as shell plus yolk plus albumen and reports brand means in grams:

| Measured category | Range across published brand means | Scope |
| --- | ---: | --- |
| Total egg, including shell | 59.6–62.4 g | Six selected U.S. retail brands; not edible whole-egg mass. |
| Yolk | 14.9–21.4 g | Brand means; no size class reported. |
| Albumen | 30.3–35.5 g | Brand means; no size class reported. |

The table prints “±” values beside means but the accessible article text does not define that statistic, so this packet does not call it SD, SE, or an individual-weight interval. The sample is useful evidence that measured retail products differ by brand, but it does not provide a standardized-size conversion. It gives no raw individual-weight distribution in the article and no directly reported shell-free whole-egg mass.

This is usable as product-specific U.S. retail variability context only. It cannot establish a universal count mapping, a shell fraction, a standard-size recipe measure, or a Canadian-market equivalent.

## Exact bundled recipe-line demand

I rescanned all 114 manifest-listed recipes and 1,123 ingredient rows. There are 62 linked chicken egg/white/yolk lines across 55 recipes: 48 whole egg, eight white, and six yolk. There are no linked duck-egg or quail-egg lines. One additional unlinked Hamburger Buns line, 072#13, says “Egg wash” and has no amount.

Original source text supplies the size qualifier. Stored unit is shown separately because several structured units do not match their source line:

- Whole egg: 26 source lines explicitly say large; one says medium; 20 are unsized count expressions; one is a mass expression. Stored units: 35 large egg, 10 count, one g, and two blank. Twelve lines stored as large egg have no “large” in the original text.
- Egg white: five lines explicitly say large and three are unsized. One large-white line includes a recipe-specific 60 g parenthetical. Stored units: four large egg white and four count.
- Egg yolk: four lines explicitly say large, one is an unsized count, and one is a mass expression. Stored units: four large egg yolk, one count, and one g.

### Whole egg (48 lines)

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

### Egg white (8 lines)

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

### Egg yolk (6 lines)

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

## Proposed source IDs and initial next action

The following fresh prefix was checked against the repository and was unused during this initial review. The coordinator later reserved these IDs for the verified source records:

| Candidate source ID | Source |
| --- | --- |
| WP07-EGG-VAR-AUDIT-20261010-S01 | UK Department of Health, Nutrient analysis of eggs — Sampling Report. |
| WP07-EGG-VAR-AUDIT-20261010-S02 | Hisasaga, Griffin, and Tarrant, 2020, U.S. commercial table-egg study. |

The official April 2026 archive was retrieved and the exact item and foodPortion rows were verified in the [coordinator follow-up](wp07-fdc-chicken-egg-archive-retrieval-20261010.md). On 2026-10-11, the UK sample-group and U.S. brand-mean spreads were integrated as derived `observed_sample_range` intervals in the ledger; they do not represent individual-egg extrema. The 2026-10-11 follow-up stores source-bounded ranges across published UK group means and U.S. brand means in the ledger. It does not encode individual-egg ranges, and runtime count conversions remain blocked.

No tests or integration work were run during this initial proposal-only review. Later coordinator follow-ups added the three FDC count portions, then nine derived UK/U.S. sample/brand-mean intervals with Python regression coverage; no Android behavior changed.
