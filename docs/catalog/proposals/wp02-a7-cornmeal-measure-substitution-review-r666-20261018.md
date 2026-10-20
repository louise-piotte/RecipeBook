# WP02 Section A7 R666: cornmeal measurement and substitution review

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Accepted and integrated in the R666–R669 coverage batch. The six new cornmeal observations and one contextual finding are on the existing ledger record; no active measure, density, mapping, form, recipe link, yield, or runtime substitution was added.
- **Plan anchor:** WP02 Section A7 remains open for other grain meals and milling products. Its current checklist has completed the R647 Bob’s Red Mill label portion, alongside wheat-bran/wheat-germ, Scottish-oatmeal, durum-semolina, barley-semolina, and cracked-rye evidence reviews.
- **Current progress:** The roadmap and workflow record R647 as integrated; Section A7 remains open. This proposal does not change either progress file.
- **Candidate:** Existing `ingredient-ref-cornmeal` (`cornmeal / semoule de maïs`, category `FLOUR_AND_STARCH`).
- **Why this is still the same review:** R647 recorded only Bob’s Red Mill Canada’s named coarse-ground product label, 1/4 cup (41 g). The Health Canada food-code entries, King Arthur chart rows and recipe amount, and contextual substitution material below were not part of R647. No pivot to another A7 ingredient is needed.

## Existing record snapshot

| Surface | Current state |
|---|---|
| Active reference | `ingredient-ref-cornmeal`; English `cornmeal`; Québec French `semoule de maïs`; `FLOUR_AND_STARCH`; English alias `corn meal`; no French aliases; `defaultDensity: null`; `unitMappings: []`. |
| Research ledger | Identity is `verified`; `measurementState: researched_supported`; `substitutionResearchState: not_yet_researched`. Sources are OQLF `S5-cornmeal` and R647’s Bob’s Red Mill Canada source `WP02-A7-CORNMEAL-R647-20261018-S01`. One existing observation records the manufacturer’s 1/4 cup (41 g) coarse-ground product serving. No substitution findings are recorded. |
| Forms and active behavior | No cornmeal form, global form-conversion rule, contextual substitution rule, or package-yield entry is present. The current form file has 164 forms; none refers to cornmeal. Both active substitution-rule files are empty. |
| Bundled recipe benchmark | Scanned all 114 manifest-listed recipes and 1,123 ingredient rows: zero `ingredient-ref-cornmeal` links and zero text hits for `cornmeal`, `corn meal`, or `semoule de maïs`. |
| Neighboring name boundary | Corn grits remains separate. The ledger’s generic polenta candidate remains `needs_clarification` and unallocated. The King Arthur chart’s separate row “Polenta (coarse ground cornmeal)” is not counted as cornmeal evidence: the existing polenta review documents that `polenta` can name a prepared dish or materially different dry retail products, and says not to resolve it automatically to cornmeal. Do not add `polenta` as an alias or transfer that row’s 1 cup (163 g) value. |

## Source evidence

| Source and locator | Evidence, disposition, and limits |
|---|---|
| Health Canada, [Canadian Nutrient File: Serving size, food code 4418](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4418), “Available serving size(s)” list; page modified 2019-03-01, accessed 2026-10-18 | The food is titled “Grains, cornmeal (yellow), whole-grain” / “Grains céréaliers, semoule de maïs (jaune), grain entier.” The page directly lists 100 ml as 51.6 g, 250 ml as 128.9 g, and 1 serving as 20.0 g. These are three source-reported portions for CNF food code 4418. The page gives no grind grade, product, preparation protocol, or cup convention. Preserve the listed pairs; do not calculate a density or convert them to cups. Proposed source ID: `WP02-A7-CORNMEAL-MEASURE-SUB-R666-20261018-S01`. |
| King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart), “Cornmeal (whole)” and “Cornmeal (yellow, Quaker)” rows and chart note; accessed 2026-10-18 | The chart lists 1 cup of whole cornmeal as 138 g and 1 cup of yellow Quaker cornmeal as 156 g. Its note says some recipe-page gram values differ from chart values and advises following the recipe amount. The chart does not specify cup capacity or a row-specific filling method. Keep each row separate. Reuse existing source ID `WP07-KAB-IWC`. |
| King Arthur Baking Test Kitchen, [Spoonbread](https://www.kingarthurbaking.com/recipes/spoonbread-recipe), updated 2022-07-01, Ingredients / Base; accessed 2026-10-18 | The formula lists 1/2 cup (78 g) yellow cornmeal for its spoonbread base. No cup-filling or weighing method is given; this remains one formula-specific portion. Proposed source ID: `WP02-A7-CORNMEAL-MEASURE-SUB-R666-20261018-S02`. |
| Bob’s Red Mill Canada, [Semoule de maïs à broyage grossier](https://www.bobsredmill.ca/produit/semoule-de-mais-a-broyage-grossier), nutrition-panel serving; R647 source and observation already integrated | The existing observation is 1/4 cup (41 g) for that named coarse-ground product. R647 notes the page does not describe a cup convention, fill method, or independent weighing procedure. Reuse the existing R647 evidence; do not duplicate it. |
| King Arthur Baking, [Semolina Flour, SKU 100227](https://shop.kingarthurbaking.com/items/semolina-flour), product description and semolina-use text; accessed 2026-10-18 | The page describes this product as a coarse grind of durum wheat and recommends sprinkling it on a baking sheet in place of cornmeal to keep breads from sticking. This directly supports one contextual direction, cornmeal to this semolina product for bread-sheet dusting only. No amount, ratio, or general replacement is supplied. Durum wheat contains gluten, so this does not serve cornmeal’s gluten-avoidance role. Reuse source ID `WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S02`, already owned by the durum-semolina ledger row. |
| King Arthur Baking, [3 ways to switch up your bread baking](https://www.kingarthurbaking.com/blog/2020/10/28/3-ways-to-switch-up-your-bread-baking), “Here’s how to substitute different flours,” especially the Classic Baguette example and pro tips; accessed 2026-10-18 | The author describes replacing roughly 10%–15% of the total flour in a 538 g Classic Baguette formula, about 53–80 g of its all-purpose flour in the final dough, with a whole-grain option including cornmeal; the poolish is excluded from that amount. The author says water needs vary by grain and suggests adding 14 g at a time until the dough is supple. This is contextual, author-level guidance in the reverse direction (all-purpose flour to cornmeal), not a global cornmeal rule or a cornmeal-origin ledger finding. The URL has no current ledger owner; no source ID is proposed in this cornmeal-row delta. |

## Recommendation

Keep the active reference unchanged. Append the six new, directly published portion observations below to the existing cornmeal ledger row and add one scoped substitution finding for cornmeal used as bread-sheet dusting. Keep `measurementState: researched_supported`; change `substitutionResearchState` to `researched_supported` because one explicit, source-backed contextual alternative was found.

The CNF entries are useful direct mass/volume observations for the specifically named yellow whole-grain food code. They do not support a reusable density on the broader cornmeal identity, which covers multiple grinds and is not tied to that food code. The King Arthur chart distinguishes two rows, and its recipe note cautions that recipe amounts can differ from chart amounts. Bob’s label and the spoonbread formula add product/formula portions without a shared weighing protocol. Retain every pair as published; do not average, scale, derive density, or infer a conversion.

No global substitution is supported. The King Arthur product page supports one contextual cornmeal-to-semolina use on a bread baking sheet, with no amount or ratio. Keep the finding in the research ledger only: do not activate a runtime rule, form, recipe link, or replacement quantity. The bread-flour article is evaluated separately above because it describes the reverse direction and a particular bread-making role; it does not change this recommendation.

Do not change `nameEn`, `nameFr`, aliases, category, picker behavior, `defaultDensity`, or `unitMappings`. The source terms do not establish a naming correction. In particular, keep `polenta` unallocated under the existing boundary decision.

## Source ownership and duplicate audit

| URL or identifier | Ownership result |
|---|---|
| CNF food code 4418 URL | No ledger URL owner; proposed as new source S01. |
| King Arthur Spoonbread URL | No ledger URL owner; proposed as new source S02. |
| King Arthur ingredient-weight-chart URL | Already reused across ledger rows under `WP07-KAB-IWC`; reuse that source ID. Do not create a cornmeal-specific duplicate source ID. |
| King Arthur semolina product URL | Already owned on `ingredient-ref-durum-semolina` by R635 source `WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S02`; reference that ID for the cornmeal contextual finding. |
| Bob’s Red Mill Canada product URL | Already owned by R647 on the cornmeal row; retain its current source and observation. |
| OQLF `semoule de maïs` URL | Already owned as `S5-cornmeal`; retain it for terminology and grind scope only. |
| King Arthur bread-flour article URL | No ledger URL owner. It is reviewed as reverse-direction contextual evidence but not assigned to the cornmeal row. |

The proposed S01/S02 source IDs, six observation IDs, finding ID, source URLs, and proposal path were checked against the live ledger and proposal archive. They are currently unowned; the target proposal path did not exist before this review.

## Proposed ledger delta

Merge the following sources into the existing `ingredient-ref-cornmeal` record. Reuse the chart and semolina-product source IDs as shown; leave the existing OQLF and R647 source entries intact.

```json
[
  {
    "sourceId": "WP02-A7-CORNMEAL-MEASURE-SUB-R666-20261018-S01",
    "url": "https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4418",
    "title": "Health Canada, Canadian Nutrient File, Serving size, food code 4418",
    "accessedOn": "2026-10-18",
    "locator": "Food code 4418 page, Available serving size(s) list",
    "supports": "The page lists yellow whole-grain cornmeal and directly reports 100 ml = 51.6 g, 250 ml = 128.9 g, and 1 serving = 20.0 g. These are CNF food-code portions only; the page does not state a grind grade, product, measurement protocol, or cup convention. Do not derive a general density or conversion.",
    "sourceKind": "food_composition"
  },
  {
    "sourceId": "WP07-KAB-IWC",
    "url": "https://www.kingarthurbaking.com/learn/ingredient-weight-chart",
    "title": "King Arthur Baking, Ingredient Weight Chart",
    "accessedOn": "2026-10-18",
    "locator": "Cornmeal (whole) and Cornmeal (yellow, Quaker) rows; chart note following the table",
    "supports": "The chart lists 1 cup of whole cornmeal as 138 g and 1 cup of yellow Quaker cornmeal as 156 g. It notes that some recipe-page gram weights differ and advises following the recipe value. The page does not state a cup convention or row-specific fill method; retain the rows separately.",
    "sourceKind": "culinary_reference"
  },
  {
    "sourceId": "WP02-A7-CORNMEAL-MEASURE-SUB-R666-20261018-S02",
    "url": "https://www.kingarthurbaking.com/recipes/spoonbread-recipe",
    "title": "King Arthur Baking Test Kitchen, Spoonbread",
    "accessedOn": "2026-10-18",
    "locator": "Updated July 1, 2022; Ingredients / Base, yellow cornmeal line",
    "supports": "The Spoonbread formula lists 1/2 cup (78 g) yellow cornmeal. The page gives no cup-filling or weighing method; keep this amount specific to the published formula.",
    "sourceKind": "test_kitchen"
  },
  {
    "sourceId": "WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S02",
    "url": "https://shop.kingarthurbaking.com/items/semolina-flour",
    "title": "King Arthur Baking, Semolina Flour, SKU 100227",
    "accessedOn": "2026-10-18",
    "locator": "Product description and semolina-use text about baking-sheet dusting",
    "supports": "The page identifies this semolina flour as a coarse grind of durum wheat and recommends sprinkling it on a baking sheet in place of cornmeal to keep breads from sticking. This is limited to the named product and surface-dusting role; no amount, ratio, or general substitution is given.",
    "sourceKind": "manufacturer"
  }
]
```

Append these six `portion_weight` observations. All values and quantities are printed by the cited source. In particular, retain the CNF millilitre pairs as published; do not calculate a density or translate any cup amount into millilitres.

```json
[
  {
    "observationId": "cornmeal-cnf-4418-100-ml-51-6-g-r666-20261018",
    "relationship": "portion_weight",
    "value": 51.6,
    "valueUnit": "g",
    "foodDescription": "Health Canada CNF food code 4418, yellow whole-grain cornmeal.",
    "foodState": "Food-code entry; the page gives no preparation state or grind grade.",
    "measurementMethod": "The CNF serving-size page directly lists 100 ml as 51.6 g; no measuring or weighing procedure is stated.",
    "quantityBasis": "Directly published pair for CNF code 4418 only. Do not derive a cup conversion, a density, or a value for every cornmeal grind or product.",
    "sourceQuantity": { "amount": 100, "unit": "ml" },
    "observedMassG": 51.6,
    "observedVolumeMl": 100,
    "evidenceKind": "published_portion",
    "sourceIds": ["WP02-A7-CORNMEAL-MEASURE-SUB-R666-20261018-S01"]
  },
  {
    "observationId": "cornmeal-cnf-4418-250-ml-128-9-g-r666-20261018",
    "relationship": "portion_weight",
    "value": 128.9,
    "valueUnit": "g",
    "foodDescription": "Health Canada CNF food code 4418, yellow whole-grain cornmeal.",
    "foodState": "Food-code entry; the page gives no preparation state or grind grade.",
    "measurementMethod": "The CNF serving-size page directly lists 250 ml as 128.9 g; no measuring or weighing procedure is stated.",
    "quantityBasis": "Directly published pair for CNF code 4418 only. Do not derive a cup conversion, a density, or a value for every cornmeal grind or product.",
    "sourceQuantity": { "amount": 250, "unit": "ml" },
    "observedMassG": 128.9,
    "observedVolumeMl": 250,
    "evidenceKind": "published_portion",
    "sourceIds": ["WP02-A7-CORNMEAL-MEASURE-SUB-R666-20261018-S01"]
  },
  {
    "observationId": "cornmeal-cnf-4418-serving-20-g-r666-20261018",
    "relationship": "portion_weight",
    "value": 20,
    "valueUnit": "g",
    "foodDescription": "Health Canada CNF food code 4418, yellow whole-grain cornmeal.",
    "foodState": "Food-code entry; the page gives no preparation state or grind grade.",
    "measurementMethod": "The CNF serving-size page directly lists one serving as 20.0 g.",
    "quantityBasis": "One serving as defined by CNF code 4418 only; not a household measure or conversion.",
    "sourceQuantity": { "amount": 1, "unit": "serving" },
    "observedMassG": 20,
    "evidenceKind": "published_portion",
    "sourceIds": ["WP02-A7-CORNMEAL-MEASURE-SUB-R666-20261018-S01"]
  },
  {
    "observationId": "cornmeal-kab-whole-chart-cup-138-g-r666-20261018",
    "relationship": "portion_weight",
    "value": 138,
    "valueUnit": "g",
    "foodDescription": "King Arthur Baking Ingredient Weight Chart row Cornmeal (whole).",
    "foodState": "Chart ingredient row; no preparation state or specific whole-cornmeal product is given.",
    "measurementMethod": "The chart directly lists 1 cup as 138 g; it gives no row-specific filling method.",
    "quantityBasis": "King Arthur chart row only. Preserve separately from the Quaker row and recipe values; do not derive density or treat it as a universal cornmeal cup weight.",
    "sourceQuantity": { "amount": 1, "unit": "cup" },
    "observedMassG": 138,
    "evidenceKind": "published_portion",
    "sourceIds": ["WP07-KAB-IWC"]
  },
  {
    "observationId": "cornmeal-kab-quaker-yellow-chart-cup-156-g-r666-20261018",
    "relationship": "portion_weight",
    "value": 156,
    "valueUnit": "g",
    "foodDescription": "King Arthur Baking Ingredient Weight Chart row Cornmeal (yellow, Quaker).",
    "foodState": "Chart ingredient row; the named brand and yellow-corn qualifier are retained.",
    "measurementMethod": "The chart directly lists 1 cup as 156 g; it gives no row-specific filling method.",
    "quantityBasis": "King Arthur chart row for the named Quaker cornmeal only. Do not combine with the whole-cornmeal row or treat it as a universal cornmeal cup weight.",
    "sourceQuantity": { "amount": 1, "unit": "cup" },
    "observedMassG": 156,
    "evidenceKind": "published_portion",
    "sourceIds": ["WP07-KAB-IWC"]
  },
  {
    "observationId": "cornmeal-kab-spoonbread-half-cup-78-g-r666-20261018",
    "relationship": "portion_weight",
    "value": 78,
    "valueUnit": "g",
    "foodDescription": "Yellow cornmeal in King Arthur Baking Test Kitchen's Spoonbread formula.",
    "foodState": "Recipe ingredient before cooking; the recipe does not specify a cornmeal grind or measuring method.",
    "measurementMethod": "The ingredient line directly lists 1/2 cup (78 g); no cup-filling or weighing procedure is stated.",
    "quantityBasis": "One Spoonbread formula only; do not scale to a cup weight or treat as a general cornmeal measure.",
    "sourceQuantity": { "amount": 0.5, "unit": "cup" },
    "observedMassG": 78,
    "evidenceKind": "published_portion",
    "sourceIds": ["WP02-A7-CORNMEAL-MEASURE-SUB-R666-20261018-S02"]
  }
]
```

Append this one source-bounded substitution finding to the cornmeal row. It records the direction supported by the King Arthur product page; it creates no active rule.

```json
{
  "findingId": "cornmeal-to-durum-semolina-baking-sheet-kab-r666-20261018",
  "researchState": "researched_supported",
  "fromIngredientRefId": "ingredient-ref-cornmeal",
  "replacements": [
    {
      "ingredientRefId": "ingredient-ref-durum-semolina",
      "roleInCompound": "Surface dusting on a baking sheet to keep bread from sticking."
    }
  ],
  "context": "Only King Arthur Baking's recommendation for using its Semolina Flour, SKU 100227, to dust a baking sheet under bread.",
  "basis": "The product page describes the flour as a coarse grind of durum wheat and recommends sprinkling it on a baking sheet in place of cornmeal to keep breads from sticking. The source gives no quantity or replacement ratio.",
  "limitations": [
    "This applies only to surface dusting for bread; do not generalize to cornmeal mixed into dough, cooked polenta, or other roles.",
    "The source describes one King Arthur product and does not establish a generic durum-semolina replacement.",
    "Durum wheat contains gluten. Do not use this substitution where cornmeal was selected to avoid wheat or gluten.",
    "Do not activate a global or contextual runtime rule: there is no amount or ratio, no bundled recipe demand, and no source basis for broader scope."
  ],
  "sourceIds": ["WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S02"]
}
```

Retain `identityState: verified` and `measurementState: researched_supported`. Change only `substitutionResearchState` to `researched_supported`, append the sources, six observations, one finding, and this decision:

```json
{
  "outcome": "accepted",
  "reason": "Preserve the Health Canada CNF 4418, King Arthur chart and Spoonbread, and existing Bob’s Red Mill portions as separate source-specific observations. The direct CNF millilitre pairs do not establish a reusable density for the broad cornmeal reference, and no source supports an active unit mapping or conversion. Record King Arthur's recommendation of its durum semolina product for bread-sheet dusting as one contextual cornmeal alternative only. Keep defaultDensity null, unitMappings empty, all active forms and rules unchanged, and polenta unallocated.",
  "sourceIds": [
    "S5-cornmeal",
    "WP02-A7-CORNMEAL-R647-20261018-S01",
    "WP02-A7-CORNMEAL-MEASURE-SUB-R666-20261018-S01",
    "WP07-KAB-IWC",
    "WP02-A7-CORNMEAL-MEASURE-SUB-R666-20261018-S02",
    "WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S02"
  ]
}
```

The KAB article about replacing all-purpose flour with cornmeal is not included in this row’s proposed sources or findings. Its direction originates at `ingredient-ref-all-purpose-flour`; preserve that direction if a separate flour-side review records it.

## Static acceptance checks

- The R647 proposal and integration README were checked: only Bob’s Red Mill Canada’s coarse-ground 1/4-cup (41 g) manufacturer serving was recorded there; substitution research stayed `not_yet_researched`.
- The current reference, cornmeal ledger record, 164-form file, active substitution-rule files, package-yield file, Section A7 checklist, roadmap, and recent workflow progress were read.
- Opened the current CNF and King Arthur source pages and checked the exact code, chart rows, recipe line, product usage, and bread guidance reported above. The KAB polenta row was excluded under the existing unresolved-polenta boundary.
- Audited the complete 114-recipe / 1,123-row benchmark, reference link, and exact cornmeal wording. No bundled demand was found.
- Checked source and observation ownership, URL ownership, the proposed finding ID, and the new proposal path. The chart and semolina-product source IDs are reused; no duplicate source record is proposed.
- Parsed all four proposed JSON blocks and validated a simulated ledger merge against `research-ledger.schema.json`; it passed.
- Integration confirmed all six R666 `sourceQuantity` values against their cited pages, source and observation ownership, null `defaultDensity`, empty `unitMappings`, and no active rule, form, recipe link, or yield. Ledger schema/custom and bundled-package validation passed.
- No software tests, build, emulator run, or deployment were performed because the accepted change only adds database JSON data, under `AGENTS.md`.
