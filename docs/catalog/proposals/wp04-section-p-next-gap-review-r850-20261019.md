# WP04 Section P — Channel Catfish CNF 2015 portions (R850)

- **Candidate:** Historical portion observations for the existing `ingredient-ref-channel-catfish` reference.
- **Recommendation:** Record two source-specific portions for each of CNF 2015 Food Codes 2993 (wild, raw) and 3180 (farmed, raw): 1 fillet = 159.0 g and 1 food-guide serving = 90.0 g.
- **Scope:** Keep all four observations ledger-only and attached to their named raw source rows. Code 2993 separately reports 65% total refuse; code 3180 renders a Refuse heading without a value. Preserve that distinction. Do not infer a yield, whole-fish mass, generic fillet weight, or current-edition continuity.
- **Status:** Integrated four historical CNF 2015 portions on the existing Channel Catfish ledger row; no active catalog behavior changed. See the [R848–R850 integration README](../batches/wp02-wp03-wp04-r848-r850-gap-review-integration-20261019/README.md). No software tests, build, emulator, or deployment were run for this database-JSON-only integration under `AGENTS.md`.

## Plan anchor and non-overlap

The open WP04 Section P parent at [plan line 7103](../../RecipeBook-global-ingredient-catalog-plan.txt#L7121) explicitly includes catfish among the remaining fish coverage. Channel Catfish already has a verified identity: the earlier [identity tranche at plan line 13730](../../RecipeBook-global-ingredient-catalog-plan.txt#L13758) added it while preserving measurements and other behavior. Its current ledger state remains `measurementState: not_yet_researched` with no observations, so historical portion evidence is a distinct open measurement dimension under the still-open parent.

R850 does not overlap the recent measurements for American lobster (R835), Atlantic herring (R838), Atlantic cod (R841), Atlantic mackerel (R844), or Alaska pollock (R847). The latest [R845–R847 integration README](../batches/wp02-wp03-wp04-r845-r847-gap-review-integration-20261019/README.md) keeps Section P open. It also does not reopen the blue-catfish picker hold in [R578](wp04-section-p-next-gap-review-r578-20261017.md): the approximately 200 g Metro SKU 219018 observation there is product-specific and must not be transferred to Channel Catfish or either CNF row.

Proposed nested checklist entry for integration: record the CNF 2015 Food Code 2993 wild raw and Food Code 3180 farmed raw portions separately: each row lists 1 fillet = 159.0 g and 1 food-guide serving = 90.0 g. Keep the separately reported 65% wild refuse as context and the blank farmed refuse field unreported. Infer no yield or generic fillet conversion; leave CNF 2026 continuity unchecked.

## Primary source evidence and edition limits

Health Canada's [CNF 2015 Food Code 2993 serving-size page](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=2993) names “Fish, catfish, channel (bullhead), wild, raw” and the French source label “Poisson, barbue de rivière, sauvage, crue.” It lists 1 fillet = 159.0 g and 1 food guide serving = 90g = 90.0 g, and separately reports total refuse of 65%. The row is explicitly wild and raw; the page gives no fillet dimensions or weighing procedure.

Health Canada's [CNF 2015 Food Code 3180 serving-size page](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3180) names “Fish, catfish, channel (bullhead), farmed, raw” and “Poisson, barbue de rivière, élevage, crue.” It lists the same two portions: 1 fillet = 159.0 g and 1 food guide serving = 90g = 90.0 g. The page displays a Refuse heading but gives no value. Treat farmed refuse as **unreported**, not zero, and do not transfer the wild row's 65% figure to it.

The [2015 CNF Users' Guide, Section C](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html) describes portion weights as generic weights for the portions named in the food row and says they are weights of edible material without refuse. Sections D and E discuss refuse and yield separately. Thus the four observations below preserve the listed portions; neither the wild refuse percentage nor the farmed blank supports a yield or as-purchased weight calculation.

Health Canada's [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says the current CNF is published as 2026 relational CSV files and that the 2015 online file remains accessible as an interim measure. The overview's [official 2026 dataset link](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) returned HTTP 403 in the web reader. The CNF 2026 food-name and measure-weight rows were therefore not inspected. The 2015 codes' current-edition presence, labels, and values remain unchecked; this review makes no continuity or absence claim.

## Exact proposed ledger delta

On `ingredient-ref-channel-catfish`, add these two source entries:

~~~json
[
  {
    "sourceId": "WP04-SECTIONP-CHANNEL-CATFISH-CNF-PORTIONS-R850-20261019-S01",
    "url": "https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=2993",
    "title": "Health Canada, Canadian Nutrient File serving-size page, Food Code 2993",
    "versionOrDate": "CNF 2015 online; page modified 2019-03-01",
    "accessedOn": "2026-10-19",
    "locator": "Food Code 2993 title and serving-size panel: 1 fillet = 159.0 g; 1 food guide serving = 90g = 90.0 g. Refuse: total refuse 65%.",
    "supports": "Names Fish, catfish, channel (bullhead), wild, raw / Poisson, barbue de rivière, sauvage, crue; lists the two source-specific portions and separately reports 65% total refuse. The page gives no fillet dimensions or weighing procedure and does not verify CNF 2026 row presence or values.",
    "sourceKind": "food_composition"
  },
  {
    "sourceId": "WP04-SECTIONP-CHANNEL-CATFISH-CNF-PORTIONS-R850-20261019-S02",
    "url": "https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3180",
    "title": "Health Canada, Canadian Nutrient File serving-size page, Food Code 3180",
    "versionOrDate": "CNF 2015 online; page modified 2019-03-01",
    "accessedOn": "2026-10-19",
    "locator": "Food Code 3180 title and serving-size panel: 1 fillet = 159.0 g; 1 food guide serving = 90g = 90.0 g. Refuse heading has no reported value.",
    "supports": "Names Fish, catfish, channel (bullhead), farmed, raw / Poisson, barbue de rivière, élevage, crue; lists the two source-specific portions. The rendered Refuse heading has no value, which is unreported rather than zero. The page gives no fillet dimensions or weighing procedure and does not verify CNF 2026 row presence or values.",
    "sourceKind": "food_composition"
  }
]
~~~

Also attach these already-owned source records to the Channel Catfish ledger row without changing their IDs or URL mappings:

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

Append these four observations to `ingredient-ref-channel-catfish.measurementObservations`. Leave `ingredientFormId` absent because the active catalog has no Channel Catfish forms and neither source row defines a separate catalog form.

~~~json
[
  {
    "observationId": "channel-catfish-wild-cnf2015-one-fillet-r850-20261019",
    "relationship": "portion_weight",
    "value": 159.0,
    "valueUnit": "g",
    "foodDescription": "Fish, catfish, channel (bullhead), wild, raw / Poisson, barbue de rivière, sauvage, crue (CNF 2015 Food Code 2993).",
    "foodState": "Wild, raw Channel Catfish as named by CNF 2015 Food Code 2993. The source does not give fillet dimensions or a standardized fillet size.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1 fillet = 159.0 g; it gives no dimensions or weighing procedure.",
    "quantityBasis": "One source-specific published portion for CNF 2015 Food Code 2993. The 2015 Users' Guide describes listed portion weights as generic weights for the described edible portions without refuse. Keep 159.0 g attached only to this historical wild raw-row fillet portion; it is not a standardized fillet mass, a value for farmed Channel Catfish, whole-fish mass, yield, or reusable conversion. The separately reported 65% refuse is not used to derive another weight or yield.",
    "sourceQuantity": {
      "amount": 1,
      "unit": "fillet"
    },
    "observedMassG": 159.0,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-CHANNEL-CATFISH-CNF-PORTIONS-R850-20261019-S01",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02"
    ]
  },
  {
    "observationId": "channel-catfish-wild-cnf2015-one-food-guide-serving-r850-20261019",
    "relationship": "portion_weight",
    "value": 90.0,
    "valueUnit": "g",
    "foodDescription": "Fish, catfish, channel (bullhead), wild, raw / Poisson, barbue de rivière, sauvage, crue (CNF 2015 Food Code 2993).",
    "foodState": "Wild, raw Channel Catfish as named by CNF 2015 Food Code 2993.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1 food guide serving = 90g = 90.0 g.",
    "quantityBasis": "One source-specific published food guide portion for CNF 2015 Food Code 2993. The 2015 Users' Guide describes listed portion weights as generic weights for the described edible portions without refuse. Keep 90.0 g attached only to this historical wild raw-row food guide serving; it is not a recipe recommendation, a value for farmed Channel Catfish, whole-fish mass, yield, or reusable conversion. The separately reported 65% refuse is not used to derive another weight or yield.",
    "sourceQuantity": {
      "amount": 1,
      "unit": "food guide serving"
    },
    "observedMassG": 90.0,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-CHANNEL-CATFISH-CNF-PORTIONS-R850-20261019-S01",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02"
    ]
  },
  {
    "observationId": "channel-catfish-farmed-cnf2015-one-fillet-r850-20261019",
    "relationship": "portion_weight",
    "value": 159.0,
    "valueUnit": "g",
    "foodDescription": "Fish, catfish, channel (bullhead), farmed, raw / Poisson, barbue de rivière, élevage, crue (CNF 2015 Food Code 3180).",
    "foodState": "Farmed, raw Channel Catfish as named by CNF 2015 Food Code 3180. The source does not give fillet dimensions or a standardized fillet size.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1 fillet = 159.0 g; it gives no dimensions or weighing procedure.",
    "quantityBasis": "One source-specific published portion for CNF 2015 Food Code 3180. The 2015 Users' Guide describes listed portion weights as generic weights for the described edible portions without refuse. Keep 159.0 g attached only to this historical farmed raw-row fillet portion; it is not a standardized fillet mass, a value for wild Channel Catfish, whole-fish mass, yield, or reusable conversion. The page's Refuse heading has no value, so farmed refuse is unreported, not zero; no refuse or yield value is inferred.",
    "sourceQuantity": {
      "amount": 1,
      "unit": "fillet"
    },
    "observedMassG": 159.0,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-CHANNEL-CATFISH-CNF-PORTIONS-R850-20261019-S02",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02"
    ]
  },
  {
    "observationId": "channel-catfish-farmed-cnf2015-one-food-guide-serving-r850-20261019",
    "relationship": "portion_weight",
    "value": 90.0,
    "valueUnit": "g",
    "foodDescription": "Fish, catfish, channel (bullhead), farmed, raw / Poisson, barbue de rivière, élevage, crue (CNF 2015 Food Code 3180).",
    "foodState": "Farmed, raw Channel Catfish as named by CNF 2015 Food Code 3180.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1 food guide serving = 90g = 90.0 g.",
    "quantityBasis": "One source-specific published food guide portion for CNF 2015 Food Code 3180. The 2015 Users' Guide describes listed portion weights as generic weights for the described edible portions without refuse. Keep 90.0 g attached only to this historical farmed raw-row food guide serving; it is not a recipe recommendation, a value for wild Channel Catfish, whole-fish mass, yield, or reusable conversion. The page's Refuse heading has no value, so farmed refuse is unreported, not zero; no refuse or yield value is inferred.",
    "sourceQuantity": {
      "amount": 1,
      "unit": "food guide serving"
    },
    "observedMassG": 90.0,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-CHANNEL-CATFISH-CNF-PORTIONS-R850-20261019-S02",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02"
    ]
  }
]
~~~

Set only `ingredient-ref-channel-catfish.measurementState` to `researched_supported`. Preserve its verified identity state and `not_yet_researched` substitution state. Append this accepted decision:

~~~json
{
  "outcome": "accepted",
  "reason": "Record four historical CNF 2015 portions for raw Channel Catfish: Food Code 2993 (wild) and Food Code 3180 (farmed) each list 1 fillet = 159.0 g and 1 food guide serving = 90.0 g. Keep each observation tied to its named row. Code 2993 separately reports 65% total refuse; code 3180's Refuse heading has no value, so farmed refuse is unreported, not zero. Do not infer whole-fish mass, yield, a generic fillet weight, or a reusable conversion. CNF 2026 row presence and values were not checked, so these observations make no current-edition continuity claim.",
  "sourceIds": [
    "WP04-SECTIONP-CHANNEL-CATFISH-CNF-PORTIONS-R850-20261019-S01",
    "WP04-SECTIONP-CHANNEL-CATFISH-CNF-PORTIONS-R850-20261019-S02",
    "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02",
    "WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S33"
  ]
}
~~~

Keep active ingredient references and forms unchanged. Add no alias, form, density, unit mapping, active conversion, package yield, recipe link, or substitution.

## Ownership, picker, and recipe audit

- **Identity and ledger owner:** `ingredient-ref-channel-catfish` is `channel catfish / barbue de rivière`, category `PROTEIN`, with no aliases, null default density, and no unit mappings. Its identity is verified; before this review its measurement and substitution states were `not_yet_researched`, and it had no measurement observations. Existing OQLF, Québec government, and CFIA entries remain the identity evidence; this review adds only portion evidence.
- **Forms and nearby catfish identities:** No active ingredient form is attached to Channel Catfish. Brown Bullhead is a separate identity with its own `brown catfish / barbotte brune` aliases. Blue Catfish remains outside active data under R578. The wild/farmed distinction belongs in these source-specific ledger observations and does not create searchable form names or aliases.
- **Rules and numeric ownership:** No active substitution rule, contextual substitution rule, package yield, ledger unit conversion, or reference unit mapping matches Channel Catfish. The four portions add no reusable conversion or yield behavior.
- **Source and ID ownership:** At proposal time, the proposed Food Code 2993 and 3180 source IDs, URLs, and four observation IDs had no owner or collision; all are now attached to `ingredient-ref-channel-catfish`. The 2015 Users' Guide source ID `WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02` and current overview source ID `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S33` are already used elsewhere and retain their exact existing source ID-to-URL mappings; reuse their records unchanged.
- **Picker projection:** A static projection using the phrase-first normalized search behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) returns Channel Catfish alone for `channel catfish`, `barbue de rivière`, and `barbue`. The broad `catfish` query returns Brown Bullhead and Channel Catfish. `poisson chat` returns no result; no unqualified French alias is proposed. This ledger-only delta adds no searchable text or forms, so picker results remain unchanged.
- **Recipe demand:** Scanned the 114 recipe files named in the bundled manifest and their 1,123 ingredient-array rows. None contains the Channel Catfish reference ID, `channel catfish`, `barbue de rivière`, or *Ictalurus punctatus*. No recipe association or recipe-specific measure is supported.

## Static review and limits

- Checked the open plan anchor and earlier identity tranche, the R845–R847 integrated checkpoint, the current Channel Catfish reference and ledger row, forms, aliases, source ownership, active rules, contextual rules, package yields, unit conversions, picker projection, and manifest recipes.
- Verified the official Health Canada [CNF 2015 Food Code 2993](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=2993) and [Food Code 3180](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3180) pages, the [2015 Users' Guide](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html), and the [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html). The official CNF 2026 dataset listing returned HTTP 403 through the web reader; current row presence and values remain unknown.
- Static ownership checks found no collision for the proposed source IDs, URLs, or observation IDs. This proposal was integrated without changing active references, forms, recipe files, or runtime substitution/conversion behavior. Static checks are in the batch README; no software tests, build, emulator run, or deployment were performed.
