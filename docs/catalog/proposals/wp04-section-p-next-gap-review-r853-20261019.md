# WP04 Section P — Rainbow Trout CNF 2015 cooked-row portions (R853)

- **Candidate:** Historical portion observations for the existing `ingredient-ref-rainbow-trout` reference.
- **Recommendation:** Record three portions from Health Canada CNF 2015 Food Code 3206: 100 mL flaked = 57.5 g, 250 mL = 143.7 g, and 1 food-guide serving = 75.0 g.
- **Scope:** The source row is explicitly wild, baked or broiled. Keep the observations ledger-only and specific to that named cooked row. Its separately reported 65% refuse is context only. Do not infer raw mass, cooking yield, a reusable density, or current-edition continuity.
- **Write scope:** Integrated on 2026-10-19. Root added the ledger source, three historical portion observations, accepted decision, plan checkpoint, and progress records; details and static validation are in the [R851–R853 integration README](../batches/wp02-wp03-wp04-r851-r853-gap-review-integration-20261019/README.md). No software tests, build, emulator, or deployment were needed under `AGENTS.md`.

## Plan anchor and non-overlap

The open WP04 Section P finfish parent at [plan line 7103](../../RecipeBook-global-ingredient-catalog-plan.txt#L7121) includes the remaining fish and regional-fish coverage. R850 is now integrated under that parent at [plan line 8048](../../RecipeBook-global-ingredient-catalog-plan.txt#L8066); it records raw Channel Catfish portions and is unrelated to Rainbow Trout.

R853 uses an existing, verified Rainbow Trout identity whose measurement state remains `not_yet_researched`. The recent [R757 fresh-whole form review](wp04-section-p-next-open-gap-review-r757-20261018.md) concerns Metro product 208107, a fresh whole rainbow-trout presentation. R853 concerns a separate historical CNF row, “wild, baked or broiled.” Do not transfer the CNF values to R757's fresh-whole form or its SKU-specific 450 g average. The latest [R848–R850 integration README](../batches/wp02-wp03-wp04-r848-r850-gap-review-integration-20261019/README.md) records the current Section P checkpoint and leaves the parent open.

Proposed nested checklist entry for integration: record three historical CNF 2015 Food Code 3206 portions for wild, baked-or-broiled rainbow trout: 100 mL flaked = 57.5 g, 250 mL = 143.7 g, and one food-guide serving = 75.0 g. Keep the separately reported 65% refuse as context, infer no raw mass, cooking yield, or reusable density, and leave CNF 2026 continuity unchecked.

## Primary evidence and edition limits

Health Canada's [CNF 2015 Food Code 3206 serving-size page](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3206) names “Fish, trout, rainbow, wild, baked or broiled” and the French source label “Poisson, truite, arc-en-ciel, au four ou grillée.” The English label says **wild**; the displayed French label does not include a wild qualifier. The page lists 100 mL flaked = 57.5 g, 250 mL = 143.7 g, and 1 food guide serving = 75g = 75.0 g. It also displays a 100 g edible-portion baseline and total refuse of 65%. Do not treat the baseline as a household portion or copy the wild qualifier as a new French catalog alias.

The [2015 CNF Users' Guide, Section C](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html) describes portion weights as generic weights for the named portions and says they apply to edible material without refuse. Sections D and E treat refuse and yield separately. The three values below therefore remain specific to CNF 2015 Food Code 3206; do not use the 65% refuse to calculate a whole-fish amount or cooking yield. The 100 g baseline is not proposed as an observation.

Health Canada's [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says the current file is published as 2026 relational CSV files and that online CNF 2015 remains as an interim measure. The official [2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) returned HTTP 403 in the web reader, so the 2026 food-name and measure-weight rows were not inspected. Food Code 3206's current-edition presence, label, and values remain unchecked; this proposal makes no continuity or absence claim.

## Exact proposed ledger delta

On `ingredient-ref-rainbow-trout`, add this new source entry:

~~~json
{
  "sourceId": "WP04-SECTIONP-RAINBOW-TROUT-CNF-PORTIONS-R853-20261019-S01",
  "url": "https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3206",
  "title": "Health Canada, Canadian Nutrient File serving-size page, Food Code 3206",
  "versionOrDate": "CNF 2015 online; page modified 2019-03-01",
  "accessedOn": "2026-10-19",
  "locator": "Food Code 3206 title and serving-size panel: 100 mL flaked = 57.5 g; 250 mL = 143.7 g; 1 food guide serving = 75g = 75.0 g. Refuse: total refuse 65%.",
  "supports": "Names Fish, trout, rainbow, wild, baked or broiled / Poisson, truite, arc-en-ciel, au four ou grillée; lists the three source-specific portions and separately reports total refuse of 65%. The page's French label does not include a wild qualifier. The displayed 100 g edible-portion baseline is not a household portion. The page gives no raw-to-cooked yield and does not verify CNF 2026 row presence or values.",
  "sourceKind": "food_composition"
}
~~~

Also attach these already-owned source records to the Rainbow Trout ledger row without changing their source IDs, fields, or URL mappings:

~~~json
[
  {
    "sourceId": "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02",
    "url": "https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html",
    "title": "Health Canada, Canadian Nutrient File — Users Guide",
    "versionOrDate": "2015",
    "accessedOn": "2026-10-19",
    "locator": "Section C, Conversion factor file, Portion size conversion factors; generic weights for described portions and edible material without refuse.",
    "supports": "Explains that CNF portion weights are generic weights for the described food-specific portions and are weights of edible material without refuse. This is the 2015 guide and does not verify CNF 2026 rows.",
    "sourceKind": "food_composition"
  },
  {
    "sourceId": "WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S33",
    "url": "https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html",
    "title": "Health Canada, Canadian Nutrient File overview",
    "accessedOn": "2026-10-10",
    "locator": "See proposal source register for the cited term, food, product, or data table.",
    "supports": "States that CNF 2026 is available as relational CSV data and that the 2015 online CNF remains as an interim access path. Supports the historical-status caveat above, not any portion.",
    "sourceKind": "food_composition"
  }
]
~~~

Append these three observations to `ingredient-ref-rainbow-trout.measurementObservations`. Leave `ingredientFormId` absent: the current catalog has a fresh-whole form only, and neither that form nor a cooked/flaked form matches CNF 2015 Food Code 3206.

~~~json
[
  {
    "observationId": "rainbow-trout-wild-cnf2015-100ml-flaked-r853-20261019",
    "relationship": "portion_weight",
    "value": 57.5,
    "valueUnit": "g",
    "foodDescription": "Fish, trout, rainbow, wild, baked or broiled / Poisson, truite, arc-en-ciel, au four ou grillée (CNF 2015 Food Code 3206).",
    "foodState": "Wild rainbow trout as named by CNF 2015 Food Code 3206, baked or broiled; flaked for the 100 mL portion. The page does not specify a single baking or broiling procedure.",
    "measurementMethod": "The CNF 2015 serving-size page lists 100 mL flaked = 57.5 g; it gives no packing or preparation protocol for the flaked measure.",
    "quantityBasis": "One source-specific published portion for CNF 2015 Food Code 3206. The 2015 Users' Guide describes listed portion weights as generic weights for the described edible portions without refuse. Keep 57.5 g attached only to this historical wild, baked-or-broiled row's 100 mL flaked portion; it is not a raw-fish measure, fresh-whole-fish weight, standard density, cooking yield, or reusable conversion. The separately reported 65% refuse is not used to derive another weight or yield.",
    "sourceQuantity": {
      "amount": 100,
      "unit": "mL flaked"
    },
    "observedMassG": 57.5,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-RAINBOW-TROUT-CNF-PORTIONS-R853-20261019-S01",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02"
    ]
  },
  {
    "observationId": "rainbow-trout-wild-cnf2015-250ml-r853-20261019",
    "relationship": "portion_weight",
    "value": 143.7,
    "valueUnit": "g",
    "foodDescription": "Fish, trout, rainbow, wild, baked or broiled / Poisson, truite, arc-en-ciel, au four ou grillée (CNF 2015 Food Code 3206).",
    "foodState": "Wild rainbow trout as named by CNF 2015 Food Code 3206, baked or broiled. The page does not further describe the food's preparation in the 250 mL entry.",
    "measurementMethod": "The CNF 2015 serving-size page lists 250 mL = 143.7 g; it gives no packing or portioning protocol for this measure.",
    "quantityBasis": "One source-specific published portion for CNF 2015 Food Code 3206. The 2015 Users' Guide describes listed portion weights as generic weights for the described edible portions without refuse. Keep 143.7 g attached only to this historical wild, baked-or-broiled row's 250 mL entry; do not call the entry flaked because the source does not say so. It is not a raw-fish measure, fresh-whole-fish weight, standard density, cooking yield, or reusable conversion. The separately reported 65% refuse is not used to derive another weight or yield.",
    "sourceQuantity": {
      "amount": 250,
      "unit": "mL"
    },
    "observedMassG": 143.7,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-RAINBOW-TROUT-CNF-PORTIONS-R853-20261019-S01",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02"
    ]
  },
  {
    "observationId": "rainbow-trout-wild-cnf2015-one-food-guide-serving-r853-20261019",
    "relationship": "portion_weight",
    "value": 75.0,
    "valueUnit": "g",
    "foodDescription": "Fish, trout, rainbow, wild, baked or broiled / Poisson, truite, arc-en-ciel, au four ou grillée (CNF 2015 Food Code 3206).",
    "foodState": "Wild rainbow trout as named by CNF 2015 Food Code 3206, baked or broiled. The page does not state a cooking or serving protocol for its food-guide serving.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1 food guide serving = 75g = 75.0 g.",
    "quantityBasis": "One source-specific published food guide portion for CNF 2015 Food Code 3206. The 2015 Users' Guide describes listed portion weights as generic weights for the described edible portions without refuse. Keep 75.0 g attached only to this historical wild, baked-or-broiled row's food-guide serving; it is not a recipe recommendation, raw-fish measure, fresh-whole-fish weight, cooking yield, or reusable conversion. The separately reported 65% refuse is not used to derive another weight or yield.",
    "sourceQuantity": {
      "amount": 1,
      "unit": "food guide serving"
    },
    "observedMassG": 75.0,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-RAINBOW-TROUT-CNF-PORTIONS-R853-20261019-S01",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02"
    ]
  }
]
~~~

Set only `ingredient-ref-rainbow-trout.measurementState` to `researched_supported`. Preserve its verified identity state and `not_yet_researched` substitution state. Append this accepted decision:

~~~json
{
  "outcome": "accepted",
  "reason": "Record three historical CNF 2015 Food Code 3206 portions for wild rainbow trout, baked or broiled: 100 mL flaked = 57.5 g, 250 mL = 143.7 g, and 1 food guide serving = 75.0 g. Keep them attached only to the named cooked row. The page separately reports 65% total refuse; do not use it to infer raw mass, whole-fish mass, cooking yield, a standard density, or a reusable conversion. Do not transfer these observations to the active fresh-whole form. CNF 2026 Food Code 3206 row presence and values were not verified, so the observations make no current-edition continuity claim.",
  "sourceIds": [
    "WP04-SECTIONP-RAINBOW-TROUT-CNF-PORTIONS-R853-20261019-S01",
    "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02",
    "WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S33",
    "WP04-FINFISH-FOLLOWUP-20261009-S01",
    "WP04-FINFISH-FOLLOWUP-20261009-S02"
  ]
}
~~~

Keep active ingredient references and forms unchanged. Add no alias, cooked/flaked form, density, unit mapping, active conversion, package yield, recipe link, or substitution.

## Ownership, picker, and recipe audit

- **Identity and ledger owner:** `ingredient-ref-rainbow-trout` is displayed as `rainbow trout / truite arc-en-ciel`, category `PROTEIN`, with no aliases, null default density, and no unit mappings. Its identity is verified; before this review its measurement and substitution states were `not_yet_researched`, with no measurement observations. Existing OQLF and DFO sources remain attached as identity evidence.
- **Existing form boundary:** The only active form is `ingredient-form-rainbow-trout-fresh-whole`, added under the completed R757 review. It represents the current fresh-whole retail presentation and holds no supported measure. It is not a cooked or flaked form. R853 attaches no observation to this form and transfers neither its state nor its SKU-specific 450 g average.
- **Rules and numeric ownership:** No active substitution rule, contextual substitution rule, package yield, ledger unit conversion, or target unit mapping matches Rainbow Trout. The CNF portions add no active density, unit mapping, conversion, or yield behavior.
- **Source and ID ownership:** The proposed Food Code 3206 source ID, URL, and three observation IDs have no current ledger owner or collision. The 2015 Users' Guide source ID `WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02` and current-overview source ID `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S33` are already used elsewhere; reuse their records exactly, retaining their existing one-to-one source ID-to-URL mappings.
- **Picker projection:** A static projection using the phrase-first normalized search behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) returns Rainbow Trout alone for `rainbow trout`, `truite arc-en-ciel`, `fresh whole rainbow trout`, and `truite arc-en-ciel entière fraîche`. The broader `trout` query returns seven identities/products and `truite` returns six. This ledger-only delta adds no searchable text or forms, so picker results remain unchanged.
- **Recipe demand:** Scanned all 114 manifest-listed recipe files and their 1,123 ingredient-array rows. None contains `ingredient-ref-rainbow-trout`, `rainbow trout`, `truite arc-en-ciel`, or *Oncorhynchus mykiss*. No recipe association or recipe-specific amount is supported.

## Static review and limits

- Checked the open Section P parent, R850's integrated child item, the R848–R850 integration checkpoint, R757's fresh-whole form boundary, and the current Rainbow Trout reference, form, aliases, ledger state, sources, measurements, rules, yields, unit conversions, picker projection, and manifest recipes.
- Verified the official Health Canada [CNF 2015 Food Code 3206 page](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3206), [2015 Users' Guide](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html), and [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html). The official CNF 2026 dataset listing returned HTTP 403 through the web reader; current-edition row presence and values remain unknown.
- Static source and observation ownership checks found no collision for the proposed source ID, URL, or observation IDs. No catalog, ledger, plan, roadmap, workflow, README, generated file, or recipe is changed by this proposal. No software tests, build, emulator run, or deployment were performed.
