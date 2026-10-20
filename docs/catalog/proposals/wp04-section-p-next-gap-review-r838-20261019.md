# WP04 Section P R838: Atlantic herring CNF 2015 portions — 2026-10-19

- **Candidate:** Historical portion observations for the existing `ingredient-ref-atlantic-herring` identity.
- **Recommendation:** Accept two source-specific published portions from Health Canada's CNF 2015 Food Code 3014: one fillet = 189.3 g and one food-guide serving = 90.0 g.
- **Scope:** Keep both observations ledger-only on the species reference. The page separately reports 46% total refuse; retain this as source context only. Do not reconcile it with either portion, calculate whole-fish mass or edible yield, add a raw-fillet form, or create a reusable count/volume conversion. CNF 2026 row presence and values remain unverified.
- **Write scope:** Proposal only. No shared catalog, ledger, recipe, plan, roadmap, workflow, README, or generated file was changed. Any later integration limited to database JSON needs no software tests under `AGENTS.md`.

## Plan anchor and prior-work boundary

The exact open WP04 Section P parent checklist is at [plan line 7055](../../RecipeBook-global-ingredient-catalog-plan.txt#L7073): salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.

The completed Atlantic herring sub-item at plan lines 7023–7027 adds only the state-neutral `whole Atlantic herring / hareng de l’Atlantique entier` form and expressly excludes measures. The identity-only checkpoint at lines 8823–8826 also records no measures. R838 fills a distinct historical measurement gap on the existing Atlantic herring identity. It does not revisit the whole-fish form or overlap [R829's raw blue crab portion](wp04-section-p-next-gap-review-r829-20261019.md), [R832's raw mixed-species cuttlefish portion](wp04-section-p-next-gap-review-r832-20261019.md), or [R835's American lobster portions](wp04-section-p-next-gap-review-r835-20261019.md). The [R830–R832 integration README](../batches/wp02-wp03-wp04-r830-r832-gap-review-integration-20261019/README.md) and [R833–R835 integration README](../batches/wp02-wp03-wp04-r833-r835-gap-review-integration-20261019/README.md) distinguish those prior food codes.

## CNF 2015 evidence and limits

Health Canada's [CNF 2015 serving-size page, Food Code 3014](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3014) names “Fish, herring, atlantic, raw” / “Poisson, hareng, atlantique, cru” and lists these available portions:

| CNF 2015 portion label | Published mass | Proposed treatment |
|---|---:|---|
| 1 fillet | 189.3 g | Source-specific edible portion for the raw Food Code 3014 row. |
| 1 food guide serving | 90g = 90.0 g | Source-specific food-guide portion; not a recipe amount. |

The same page lists **total refuse 46%**. Health Canada's [CNF 2015 Users' Guide, Section C](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html) describes conversion-factor values as generic weights for described portions and says they represent edible material without refuse. It distinguishes refuse from yields in Sections D–E. Keep the 46% figure separate; do not derive an as-purchased weight, fillet yield, or whole-to-fillet relationship from it. The CNF page gives no fillet dimensions, standard size, cleaning state, or weighing procedure.

The current [Health Canada CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says CNF 2026 is published as relational CSV files and that the CNF 2015 online viewer remains available as an interim access route. The official [CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) exposes food-name and measure-weight-conversion files. Attempts to inspect their row contents were unsuccessful through the available web tool and workspace network. R838 therefore accepts only the historical CNF 2015 observations and makes no claim that Food Code 3014 appears in CNF 2026 or that any 2026 measure matches these values.

## Exact proposed ledger delta

Add the following source to `ingredient-ref-atlantic-herring`. The CNF 2015 Food Code 3014 page URL has no ledger owner. Reuse the existing CNF guide source ID from the blue-mussel record and the existing current-overview source ID from the vegetable-stems research; preserve each source ID's current URL and source details.

~~~json
[
  {
    "sourceId": "WP04-SECTIONP-ATLANTIC-HERRING-CNF-PORTIONS-R838-20261019-S01",
    "url": "https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3014",
    "title": "Health Canada, Canadian Nutrient File 2015 serving size, Food Code 3014",
    "versionOrDate": "CNF 2015; page details modified 2019-03-01",
    "accessedOn": "2026-10-19",
    "locator": "Bilingual food names; Food Code 3014; 1 fillet = 189.3 g; 1 food guide serving = 90g = 90.0 g; Refuse: total refuse 46 %.",
    "supports": "The CNF 2015 page names raw Atlantic herring and lists two published portion weights. It separately reports total refuse 46%. The page does not state fillet dimensions, a standard fillet size, cleaning state, or weighing procedure; the refuse field does not supply a whole-fish weight or yield. This is not a CNF 2026 row check.",
    "sourceKind": "food_composition"
  },
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

Append these two observations to the same ledger record:

~~~json
[
  {
    "observationId": "atlantic-herring-raw-cnf2015-one-fillet-r838-20261019",
    "relationship": "portion_weight",
    "value": 189.3,
    "valueUnit": "g",
    "foodDescription": "Fish, herring, atlantic, raw / Poisson, hareng, atlantique, cru (CNF 2015 Food Code 3014).",
    "foodState": "Raw Atlantic herring as named by CNF 2015 Food Code 3014. The source lists one fillet but does not state fillet dimensions, size, cleaning state, or weighing procedure.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1 fillet = 189.3 g and gives no weighing procedure or fillet dimensions.",
    "quantityBasis": "One source-specific published portion for CNF 2015 Food Code 3014. The CNF 2015 Users’ Guide describes portion weights as generic weights for the described edible portions without refuse. Keep 189.3 g attached only to this historical row’s one-fillet portion; do not treat it as a standard fillet size, recipe amount, whole-fish mass, yield, or reusable conversion. Do not infer whole-fish mass or yield from the separate 46% refuse field.",
    "sourceQuantity": {
      "amount": 1,
      "unit": "fillet"
    },
    "observedMassG": 189.3,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-ATLANTIC-HERRING-CNF-PORTIONS-R838-20261019-S01",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02"
    ]
  },
  {
    "observationId": "atlantic-herring-raw-cnf2015-one-food-guide-serving-r838-20261019",
    "relationship": "portion_weight",
    "value": 90.0,
    "valueUnit": "g",
    "foodDescription": "Fish, herring, atlantic, raw / Poisson, hareng, atlantique, cru (CNF 2015 Food Code 3014).",
    "foodState": "Raw Atlantic herring as named by CNF 2015 Food Code 3014. The source does not state cleaning state or preparation procedure for its food-guide serving.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1 food guide serving = 90g = 90.0 g.",
    "quantityBasis": "One source-specific published food-guide portion for CNF 2015 Food Code 3014. The CNF 2015 Users’ Guide describes portion weights as generic weights for the described edible portions without refuse. Keep 90.0 g attached only to this historical row’s food-guide serving; it is not a recipe recommendation, whole-fish mass, yield, or reusable conversion. Do not infer whole-fish mass or yield from the separate 46% refuse field.",
    "sourceQuantity": {
      "amount": 1,
      "unit": "food guide serving"
    },
    "observedMassG": 90.0,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-ATLANTIC-HERRING-CNF-PORTIONS-R838-20261019-S01",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02"
    ]
  }
]
~~~

Set only `ingredient-ref-atlantic-herring.measurementState` to `researched_supported`, keep `identityState` and `substitutionResearchState` unchanged, and append this accepted decision:

~~~json
{
  "outcome": "accepted",
  "reason": "Record two historical CNF 2015 Food Code 3014 portions for raw Atlantic herring: 1 fillet = 189.3 g and 1 food guide serving = 90.0 g. Keep both values source-specific and ledger-only as generic edible portions without refuse. The page separately reports total refuse 46%; do not reconcile it with either portion or use it to infer a whole-fish weight, edible yield, or fillet conversion. CNF 2026 Food Code 3014 row presence and values were not verified, so these observations make no current-edition continuity claim.",
  "sourceIds": [
    "WP04-SECTIONP-ATLANTIC-HERRING-CNF-PORTIONS-R838-20261019-S01",
    "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02",
    "WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S33"
  ]
}
~~~

Keep the active catalog unchanged: no raw-fillet form, aliases, density, unit mapping, active conversion, yield, recipe link, or substitution is proposed. Keep the existing whole-fish form ledger record at `researched_no_supported_value`; the new values belong to the CNF food-code observation on the species reference and do not establish a measure for whole fish.

## Ownership, search, and recipe audit

- **Existing identity:** `ingredient-ref-atlantic-herring` is `Atlantic herring / hareng de l’Atlantique`, category `PROTEIN`, with empty alias arrays, null default density, and no unit mappings. Its ledger identity is verified. Before this proposal it had no measurement observations; its measurement and substitution research states were `not_yet_researched`.
- **Forms and neighboring references:** The only attached form matching herring terms is `ingredient-form-atlantic-herring-whole-fish`. It is state-neutral and has no match terms, density, or measurements. Other herring-named active references are Pacific herring, herring fillets in tomato sauce, smoked herring bloater, and smoked herring fillets in oil. There is no raw-fillet form.
- **Source and ID ownership:** The Food Code 3014 page URL and the two proposed observation IDs have no current ledger owner. The CNF Users’ Guide and overview URLs already have registered source IDs, reused above without repointing. The new S01 maps only to the Code 3014 page.
- **Rules and numeric data:** No herring match was found in active substitution rules, contextual substitution rules, package yields, ledger unit conversions, or ingredient unit mappings.
- **Search projection:** Reproducing the phrase-first, accent-folded matching in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), `Atlantic herring`, `hareng de l’Atlantique`, and `whole Atlantic herring` resolve to the existing Atlantic herring reference. Broad `herring` and `hareng` each return five separate references. `herring fillet` returns only tomato-sauce and smoked-fillet product references. The ledger-only portions make no search or form-hint change.
- **Recipe demand:** Parsed all 114 manifest-listed recipe files and 1,123 structured ingredient rows. No recipe contains Atlantic herring, hareng de l’Atlantique, *Clupea harengus*, or a whole Atlantic herring form reference.

## Static review and limits

- Checked the Section P plan anchor, the current `ingredient-ref-atlantic-herring` and whole-fish form records, all herring-related active names and aliases, applicable forms/rules/conversions/yields, ledger source/observation ownership, current picker search terms, and all bundled manifest recipes.
- Verified the official [CNF 2015 Food Code 3014 page](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3014), [CNF 2015 Users’ Guide, Section C–E](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html), and [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html). The CNF 2026 food-name and measure-weight-conversion resources could not be fetched for a row join. No claim is made about the 2026 row's presence or values.
- Checked this proposal for UTF-8 without BOM, trailing whitespace, required historical/current-edition limits, and local Markdown link targets. No application tests, build, emulator, or deployment were run; this proposal does not change database JSON or application code.
