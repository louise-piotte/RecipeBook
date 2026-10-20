# WP04 Section P — Alaska pollock CNF 2015 portions (R847)

- **Candidate:** Historical portion observations for the existing Alaska pollock reference, `ingredient-ref-alaska-pollock`.
- **Recommendation:** Record the two portions published for Health Canada CNF 2015 Food Code 3039: 1 fillet = 84.9 g and 1 food-guide serving = 90.0 g.
- **Scope:** Keep both observations ledger-only and tied to the named raw CNF row. The page separately reports 66% total refuse; preserve it as context only and do not use it to infer whole-fish mass, yield, or a reusable fillet conversion. Leave CNF 2026 continuity unverified.
- **Write scope:** Integrated as two historical, ledger-only CNF 2015 portion observations. The active catalog and broader Section P parent remain unchanged. Under `AGENTS.md`, database-JSON-only additions need no software tests, build, emulator run, or deployment. See the [R845–R847 integration README](../batches/wp02-wp03-wp04-r845-r847-gap-review-integration-20261019/README.md).

## Plan anchor and non-overlap

The open WP04 Section P parent at [plan line 7103](../../RecipeBook-global-ingredient-catalog-plan.txt#L7121) includes pollock among the remaining fish coverage. R847 reviews a different measurement gap from R835's American-lobster portions, R838's Atlantic-herring portions, R841's Atlantic-cod portions, and R844's Atlantic-mackerel portions. The latest [R842–R844 integration README](../batches/wp02-wp03-wp04-r842-r844-gap-review-integration-20261019/README.md) leaves the Section P parent open. The already integrated [R787 pollock fillet-pair decision](wp04-section-p-pollock-fillet-pair-boundary-review-r787-20261018.md) remains the relevant form boundary: it added the frozen Alaska-pollock and fresh Atlantic-pollock fillet forms, made generic pollock-fillet searches return both species, and added no reusable measure. R847 records only historical portions on the Alaska-pollock parent reference; it does not revise that form decision or transfer values to either form.

Proposed nested checklist entry for integration: record two historical CNF 2015 Food Code 3039 portions for raw Alaska pollock: one fillet = 84.9 g and one food-guide serving = 90.0 g. Keep them ledger-only, leave the separately reported 66% refuse as context, infer no whole-fish mass, yield, or reusable fillet conversion, and leave CNF 2026 continuity unverified.

## CNF 2015 evidence and edition limits

Health Canada's [CNF serving-size page for Food Code 3039](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3039) names “Fish, pollock, (alaska), raw” and gives the French source label “Poisson, morue, pacifique occidental, crue.” It lists 1 fillet = 84.9 g and 1 food guide serving = 90g = 90.0 g, and separately reports total refuse of 66%. The English name explicitly qualifies the row as Alaska pollock. The French source label does not match the existing Québec display name; do not copy it into the catalog as an alias or use it to broaden search behavior. The active reference is already identity-verified as Alaska pollock, with its existing CFIA and NOAA identity evidence. The serving-size page does not provide fillet dimensions or a weighing procedure.

The [CNF 2015 Users' Guide, Section C](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html) says portion weights are generic weights for the described portions and apply to edible material without refuse. Treat both listed values as source-specific published edible portions. Do not reconcile either with the separate 66% refuse value, derive an as-purchased fish weight or yield, or make 84.9 g a standard fillet mass or reusable conversion.

Health Canada's [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says CNF 2026 is published as relational CSV files and the online CNF 2015 remains accessible as an interim measure. The [official CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) and its Food Name and Measure Weight Conversion CSV resources could not be retrieved in this review: the dataset listing returned 403 in the web reader and direct CSV retrieval was inaccessible. Therefore, Food Code 3039's presence, label, and measure in CNF 2026 remain unchecked. The observations below describe CNF 2015 only and make no continuity or absence claim about the current edition.

## Exact proposed ledger delta

On `ingredient-ref-alaska-pollock`, add this new source entry. The CNF 2015 page URL and proposed source ID are not currently owned in the ledger.

~~~json
{
  "sourceId": "WP04-SECTIONP-ALASKA-POLLOCK-CNF-PORTIONS-R847-20261019-S01",
  "url": "https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3039",
  "title": "Health Canada, Canadian Nutrient File serving-size page, Food Code 3039",
  "versionOrDate": "CNF 2015 online; page modified 2019-03-01",
  "accessedOn": "2026-10-19",
  "locator": "Food Code 3039 title and serving-size panel: 1 fillet = 84.9 g; 1 food guide serving = 90g = 90.0 g. Refuse: total refuse 66%.",
  "supports": "Names Fish, pollock, (alaska), raw and the French source label Poisson, morue, pacifique occidental, crue; lists the two source-specific portions and separately reports total refuse. The page gives no fillet dimensions or weighing procedure and does not verify CNF 2026 row presence or values.",
  "sourceKind": "food_composition"
}
~~~

Also attach these already-owned source records to the Alaska-pollock ledger row without changing their source IDs or URL mappings:

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

Append these observations to the `ingredient-ref-alaska-pollock` record's `measurementObservations`. Leave `ingredientFormId` absent: the source describes raw Alaska pollock, not the existing frozen Alaska-pollock fillet form.

~~~json
[
  {
    "observationId": "alaska-pollock-raw-cnf2015-one-fillet-r847-20261019",
    "relationship": "portion_weight",
    "value": 84.9,
    "valueUnit": "g",
    "foodDescription": "Fish, pollock, (alaska), raw / Poisson, morue, pacifique occidental, crue (CNF 2015 Food Code 3039).",
    "foodState": "Raw Alaska pollock as named by CNF 2015 Food Code 3039. The source does not give fillet dimensions or identify a standardized fillet size.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1 fillet = 84.9 g; it gives no dimensions or weighing procedure.",
    "quantityBasis": "One source-specific published portion for CNF 2015 Food Code 3039. The 2015 Users' Guide describes listed portion weights as generic weights for the described edible portions without refuse. Keep 84.9 g attached only to this historical raw-row fillet portion; it is not a standard fillet size, a value for the frozen retail form, a recipe amount, whole-fish mass, yield, or reusable conversion. The separately reported 66% refuse is not used to derive another weight or yield.",
    "sourceQuantity": {
      "amount": 1,
      "unit": "fillet"
    },
    "observedMassG": 84.9,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-ALASKA-POLLOCK-CNF-PORTIONS-R847-20261019-S01",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02"
    ]
  },
  {
    "observationId": "alaska-pollock-raw-cnf2015-one-food-guide-serving-r847-20261019",
    "relationship": "portion_weight",
    "value": 90.0,
    "valueUnit": "g",
    "foodDescription": "Fish, pollock, (alaska), raw / Poisson, morue, pacifique occidental, crue (CNF 2015 Food Code 3039).",
    "foodState": "Raw Alaska pollock as named by CNF 2015 Food Code 3039. The page does not state a preparation procedure for its food guide serving.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1 food guide serving = 90g = 90.0 g.",
    "quantityBasis": "One source-specific published food guide portion for CNF 2015 Food Code 3039. The 2015 Users' Guide describes listed portion weights as generic weights for the described edible portions without refuse. Keep 90.0 g attached only to this historical raw-row food guide serving; it is not a recipe recommendation, a value for the frozen retail form, whole-fish mass, yield, or reusable conversion. The separately reported 66% refuse is not used to derive another weight or yield.",
    "sourceQuantity": {
      "amount": 1,
      "unit": "food guide serving"
    },
    "observedMassG": 90.0,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-ALASKA-POLLOCK-CNF-PORTIONS-R847-20261019-S01",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02"
    ]
  }
]
~~~

Set only `ingredient-ref-alaska-pollock.measurementState` to `researched_supported`; preserve its `verified` identity state and `not_yet_researched` substitution state. Append this accepted decision:

~~~json
{
  "outcome": "accepted",
  "reason": "Record two historical CNF 2015 Food Code 3039 portions for raw Alaska pollock: 1 fillet = 84.9 g and 1 food guide serving = 90.0 g. Keep both ledger-only and specific to the described raw row. The page separately reports total refuse of 66%; do not use it to infer whole-fish mass, yield, or a reusable fillet conversion. Do not transfer either observation to the existing frozen retail fillet form. CNF 2026 Food Code 3039 row presence and values were not verified, so these observations make no current-edition continuity claim.",
  "sourceIds": [
    "WP04-SECTIONP-ALASKA-POLLOCK-CNF-PORTIONS-R847-20261019-S01",
    "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02",
    "WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S33",
    "WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S01",
    "WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S04"
  ]
}
~~~

Keep the active ingredient reference and form catalogs unchanged. Add no alias, form, density, unit mapping, active conversion, package yield, recipe link, or substitution. Do not attach either CNF observation to `ingredient-form-alaska-pollock-frozen-fillets` or `ingredient-form-atlantic-pollock-fresh-fillets`.

## Ownership, picker, and recipe audit

- **Existing identity and ledger state:** `ingredient-ref-alaska-pollock` is displayed as `Alaska pollock / goberge de l’Alaska`, category `PROTEIN`, with no aliases, null default density, and no unit mappings. Its identity is verified; before this proposal its measurement and substitution states were `not_yet_researched`, and it had no measurement observations. Existing CFIA and NOAA entries support the Alaska-pollock naming/taxon boundary. The CNF row's French wording is not being added as an alias.
- **Forms and neighboring identities:** The Alaska-pollock parent currently has one form, `ingredient-form-alaska-pollock-frozen-fillets`, with a frozen, species-qualified fillet label. Its form ledger record reports no supported reusable measurement; Metro's approximately 300 g tray amount remains specific to product 226631. Atlantic pollock is a separate `Pollachius virens` reference and has a separate fresh-fillets form. R847 assigns no value across these species or forms.
- **Rules and numeric ownership:** No target match is present in active substitution rules, contextual substitution rules, package-yield data, ledger unit conversions, or the reference's unit mappings. The two portion observations add no active conversion behavior. The form-level 300 g retailer tray estimate remains untouched.
- **Source and ID ownership:** The proposed Food Code 3039 source ID and accessible serving-size URL have no current ledger owner. The 2015 Users' Guide source ID `WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02` and overview source ID `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S33` are already used elsewhere and each retains its existing single URL mapping; reuse their source records unchanged. The existing CFIA pollock identity source `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S01` and NOAA Alaska-pollock identity source `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S04` already belong to the target record. Both proposed observation IDs are unused.
- **Picker projection:** A static projection applying the normalization and phrase-first behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) returns Alaska pollock alone for `Alaska pollock`, `goberge de l’Alaska`, `frozen Alaska pollock fillets`, and `filets de goberge de l’Alaska surgelés`. Generic `pollock fillet`, `pollock fillets`, and `filets de goberge` each return both Alaska pollock and Atlantic pollock, as intended by R787. Broader `pollock` and `goberge` each return four identities/products. The ledger-only delta adds no searchable names or forms, so all projections remain unchanged.
- **Recipe demand:** Scanned all 114 recipe files listed in the bundled manifest and their 1,123 ingredient-array rows. None contains the target reference or form IDs, Alaska pollock, pollock, goberge, or *Gadus chalcogrammus*. No recipe association or recipe-specific measure is supported.

## Static review and limits

- Checked the current Section P plan anchor, the R842–R844 integration, the R787 form boundary, and the active Alaska and Atlantic pollock references, forms, aliases, ledger states, measurements, rules, conversions, yields, search projection, and manifest recipes.
- Verified the official [CNF 2015 Food Code 3039 serving-size page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3039), [2015 Users' Guide](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html), [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), and [CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109). Direct CNF 2026 dataset and CSV retrieval was blocked by the web reader; Food Code 3039's current-edition row presence and values remain unknown.
- Static source and observation ownership checks found no collision for the proposed source ID, URL, or observation IDs. No app tests, build, emulator run, or deployment were performed; this is a proposal-only data review, and AGENTS.md exempts database-JSON-only additions from software testing.
