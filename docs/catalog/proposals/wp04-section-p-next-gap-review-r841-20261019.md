# WP04 Section P R841 — Atlantic cod CNF 2015 portions — 2026-10-19

- **Candidate:** Historical portion observations for the existing `ingredient-ref-atlantic-cod` identity.
- **Recommendation:** Accept two source-specific published portions from Health Canada's CNF 2015 Food Code 3194: 1 fillet = 231.0 g and 1 food-guide serving = 90.0 g.
- **Scope:** Keep both observations ledger-only and tied to Food Code 3194's raw Atlantic-cod/scrod row. The page separately reports 66% total refuse; retain it only as source context. Do not reconcile refuse with either portion, calculate whole/as-purchased mass or edible yield, add a reusable fillet conversion, or claim continuity with CNF 2026.
- **Write scope:** Proposal only. No shared catalog, ledger, plan, roadmap, workflow, README, recipe, or generated file was changed. If integrated, the change would add database JSON evidence only; `AGENTS.md` says such updates need no software tests.

## Plan anchor and prior-work boundary

The open WP04 Section P parent checklist at [plan line 7103](../../RecipeBook-global-ingredient-catalog-plan.txt#L7121) includes cod among the fish coverage gaps. R712's completed scrod terminology decision at [plan line 8036](../../RecipeBook-global-ingredient-catalog-plan.txt#L8054) added only the qualified `scrod cod` and `scrod haddock` search aliases and expressly added no numeric data. The active Atlantic-cod ledger row still has `measurementState: not_yet_researched`, so the historical portion review is a distinct unfinished dimension. The parent checklist remains open.

R841 does not revisit R712's alias decision or the Atlantic-cod forms. It is separate from R838's Atlantic-herring Food Code 3014 observations, R835's American-lobster Food Code 3210 portions, R832's mixed-species cuttlefish Food Code 3114 portion, and R829's blue-crab Food Code 3096 portion. The latest integrated checkpoint is the [R836–R838 README](../batches/wp02-wp03-wp04-r836-r838-gap-review-integration-20261019/README.md).

## CNF 2015 evidence and limits

Health Canada's [CNF serving-size page, Food Code 3194](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3194) identifies the food as “Fish, cod (scrod), atlantic, raw” and lists 1 fillet = 231.0 g and 1 food-guide serving = 90g = 90.0 g. It separately reports total refuse of 66%. These are values for this described 2015 food record, not generic cod measures.

The [CNF 2015 Users' Guide, Section C](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html) describes portion weights as generic weights for the described edible portions and states that weights are for edible material without refuse. It treats refuse and cooked-yield data separately. The page does not give fillet dimensions, a standard scrod size, a weighing procedure, or recipe guidance. Keep 66% separate; do not use it to reconstruct whole-fish weight, yield, or a conversion.

The current [Health Canada CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says CNF 2026 is published as relational CSV files and the 2015 online viewer remains available as an interim access route. The [official CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) lists food-name and measure-weight-conversion CSV resources. The available web reader returned 403/access errors for the dataset and direct CSV resources, so this review did not inspect a 2026 food-name or measure row. R841 accepts the historical 2015 observations without claiming that Food Code 3194, its portion labels, or these values persist in CNF 2026.

## Exact proposed ledger delta

On `ingredient-ref-atlantic-cod`, update the existing source object `WP04-SECTIONP-SCROD-BOUNDARY-R712-20261018-P04` in place. Preserve its source ID and URL; update only the following fields on the Atlantic-cod record's copy:

~~~json
{
  "versionOrDate": "CNF 2015; page details modified 2019-03-01",
  "locator": "Food Code 3194 title and serving-size panel; 1 fillet = 231.0 g; 1 food guide serving = 90g = 90.0 g; Refuse: total refuse 66%.",
  "supports": "The CNF 2015 page names raw Atlantic cod (scrod) and lists one fillet and one food-guide serving as source-specific published portions. It separately reports 66% total refuse. The page states no fillet dimensions, standardized scrod size, weighing procedure, or whole-fish mass; the refuse field does not establish a yield. This is not a CNF 2026 row check."
}
~~~

Do not change the same source ID's existing source object under `ingredient-ref-haddock`; it records R712's scrod-boundary evidence and retains the same Food Code 3194 URL. Add the following already-owned source records to the Atlantic-cod ledger row, reusing their existing source IDs and exact URL mappings:

~~~json
[
  {
    "sourceId": "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02",
    "url": "https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html",
    "title": "Health Canada, Canadian Nutrient File — Users Guide",
    "versionOrDate": "2015",
    "accessedOn": "2026-10-19",
    "locator": "Section C, Conversion factor file, Portion size conversion factors; generic weights for described portions and edible material without refuse.",
    "supports": "Explains that CNF portion weights are generic weights for described food-specific portions and are weights of edible material without refuse. This is the 2015 guide and does not verify CNF 2026 rows.",
    "sourceKind": "food_composition"
  },
  {
    "sourceId": "WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S33",
    "url": "https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html",
    "title": "Health Canada, Canadian Nutrient File overview",
    "accessedOn": "2026-10-10",
    "locator": "CNF publication and access statement: 2026 relational CSV files and interim access to the 2015 online CNF.",
    "supports": "States that CNF 2026 is published as relational CSV files and the CNF 2015 online viewer remains an interim access route. Supports the edition boundary only, not Food Code 3194 values or 2026 row presence.",
    "sourceKind": "food_composition"
  }
]
~~~

Append these two observations to the Atlantic-cod record's `measurementObservations`:

~~~json
[
  {
    "observationId": "atlantic-cod-raw-cnf2015-one-fillet-r841-20261019",
    "relationship": "portion_weight",
    "value": 231.0,
    "valueUnit": "g",
    "foodDescription": "Fish, cod (scrod), atlantic, raw / Poisson, morue, atlantique, crue (CNF 2015 Food Code 3194).",
    "foodState": "Raw Atlantic cod as named by CNF 2015 Food Code 3194. The source does not state fillet dimensions or a standardized scrod size.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1 fillet = 231.0 g; it gives no dimensions or weighing procedure.",
    "quantityBasis": "One source-specific published portion for CNF 2015 Food Code 3194. The 2015 Users' Guide describes the listed portion weights as generic weights for the described edible portions without refuse. Keep 231.0 g attached only to this historical row's one-fillet portion; do not treat it as a standard fillet size, recipe amount, whole-fish mass, yield, or reusable conversion. The separately reported 66% refuse is not used to derive a weight or yield.",
    "sourceQuantity": {
      "amount": 1,
      "unit": "fillet"
    },
    "observedMassG": 231.0,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-SCROD-BOUNDARY-R712-20261018-P04",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02"
    ]
  },
  {
    "observationId": "atlantic-cod-raw-cnf2015-one-food-guide-serving-r841-20261019",
    "relationship": "portion_weight",
    "value": 90.0,
    "valueUnit": "g",
    "foodDescription": "Fish, cod (scrod), atlantic, raw / Poisson, morue, atlantique, crue (CNF 2015 Food Code 3194).",
    "foodState": "Raw Atlantic cod as named by CNF 2015 Food Code 3194. The source does not state a preparation procedure for its food-guide serving.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1 food guide serving = 90g = 90.0 g.",
    "quantityBasis": "One source-specific published food-guide portion for CNF 2015 Food Code 3194. The 2015 Users' Guide describes the listed portion weights as generic weights for the described edible portions without refuse. Keep 90.0 g attached only to this historical row's food-guide serving; it is not a recipe recommendation, whole-fish mass, yield, or reusable conversion. The separately reported 66% refuse is not used to derive a weight or yield.",
    "sourceQuantity": {
      "amount": 1,
      "unit": "food guide serving"
    },
    "observedMassG": 90.0,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-SCROD-BOUNDARY-R712-20261018-P04",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02"
    ]
  }
]
~~~

Set only `ingredient-ref-atlantic-cod.measurementState` to `researched_supported`. Keep `identityState` and `substitutionResearchState` unchanged and append this accepted decision:

~~~json
{
  "outcome": "accepted",
  "reason": "Record two historical CNF 2015 Food Code 3194 portions for raw Atlantic cod (scrod): 1 fillet = 231.0 g and 1 food-guide serving = 90.0 g. Keep both values as ledger-only, source-specific published edible portions. The page separately reports 66% total refuse; do not reconcile it with either portion or use it to infer whole-fish weight, edible yield, or a reusable fillet conversion. CNF 2026 Food Code 3194 row presence and values were not verified, so these observations make no current-edition continuity claim.",
  "sourceIds": [
    "WP04-SECTIONP-SCROD-BOUNDARY-R712-20261018-P04",
    "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02",
    "WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S33"
  ]
}
~~~

Keep the active catalog unchanged. Add no alias, form, density, unit mapping, active conversion, package yield, recipe link, or substitution. In particular, do not attach the 231.0 g observation to the existing Atlantic-cod fillet form as a reusable mass per fillet.

## Ownership, picker, and recipe audit

- **Existing identity and ledger state:** `ingredient-ref-atlantic-cod` is `Atlantic cod / morue de l’Atlantique`, category `PROTEIN`, with the existing English alias `scrod cod`, no French aliases, null default density, and no unit mappings. Its identity is verified; before this proposal its measurement and substitution states were both `not_yet_researched`. It has no measurement observations yet.
- **Forms and neighboring identities:** The target has three existing forms: Atlantic cod fillets, fresh whole Atlantic cod, and Atlantic cod loin. None stores a measure or density. Related references remain separate: Arctic cod, Pacific cod, Atlantic tomcod, Haddock, sablefish, salt cod, and smoked cod. No form, state, or value is transferred among them.
- **Rules and reusable numeric data:** No match for the target ID exists in active substitution rules, contextual substitution rules, package yields, ledger unit conversions, or ingredient unit mappings. The two proposed observations do not create active conversion behavior.
- **Source and ID ownership:** Food Code 3194's URL is already owned by `WP04-SECTIONP-SCROD-BOUNDARY-R712-20261018-P04`, present under both Atlantic cod and Haddock with the same URL. Reuse that source ID on the Atlantic-cod record and do not repoint or alter the Haddock source object. The CNF 2015 Users' Guide source ID `WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02` and current overview ID `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S33` already map to their same official URLs in other records; reuse those IDs. Both proposed observation IDs are unused. No new source ID or URL is proposed.
- **Picker projection:** A static projection using the phrase-first, accent-folded rules in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) returns Atlantic cod for `Atlantic cod`, `morue de l’Atlantique`, `scrod cod`, `Atlantic cod fillets`, and `fresh whole Atlantic cod`. `scrod` returns Atlantic cod and Haddock; broad `cod` and `morue` each return seven matching references. The ledger-only observations add no names or forms, so these results remain unchanged.
- **Recipe demand:** Scanned the 114 manifest-listed recipe files and 1,123 structured ingredient rows. None contains the Atlantic-cod reference or form IDs, Atlantic cod, morue de l’Atlantique, scrod, or *Gadus morhua*. No recipe-specific amount or link is justified.

## Static review and limits

- Checked the open Section P plan anchor, R712's explicit no-numeric-data boundary, the R836–R838 integration, and the current Atlantic-cod reference, ledger state, source entries, aliases, forms, substitution rules, conversions, yields, picker terms, and manifest recipes.
- Verified the official [CNF 2015 Food Code 3194 page](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3194), the [CNF 2015 Users' Guide](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html), the [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), and the [CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109). Direct dataset/CSV row access failed in the available web reader; no 2026 row-presence or row-absence claim is made.
- Static ownership checks found one URL mapping for each existing source ID and no collisions for either proposed observation ID. The proposal is limited to one new Markdown file; it does not alter shared JSON, checklist, workflow, or generated files.
- Checked this file for UTF-8 without BOM, trailing whitespace, local Markdown link targets, and mojibake. No app tests, build, emulator run, or deployment were performed; this is a proposal-only review, and any later database-JSON-only addition needs no software tests under `AGENTS.md`.
