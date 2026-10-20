# WP04 Section P — Atlantic mackerel CNF 2015 portions (R844)

- **Candidate:** Historical portion observations for the existing Atlantic mackerel reference, ingredient-ref-atlantic-mackerel.
- **Recommendation:** Record the two portions published for Health Canada CNF 2015 Food Code 3021: 1 fillet = 115.2 g and 1 food guide serving = 90.0 g.
- **Scope:** Keep both observations ledger-only and tied to the named raw Atlantic-mackerel row. The page separately reports total refuse of 0%; retain that field as context and do not use it to infer yield, whole-fish mass, or a conversion. Leave CNF 2026 continuity unverified.
- **Write scope:** Integrated as two historical, ledger-only CNF 2015 portion observations. No active catalog behavior was changed. Under `AGENTS.md`, adding database JSON data requires no software tests, build, emulator run, or deployment. See the [R842–R844 integration README](../batches/wp02-wp03-wp04-r842-r844-gap-review-integration-20261019/README.md).

## Plan anchor and prior-work boundary

The open WP04 Section P parent at [plan line 7103](../../RecipeBook-global-ingredient-catalog-plan.txt#L7121) lists mackerel among the remaining fish coverage. R838 covers Atlantic herring (Food Code 3014), R841 covers Atlantic cod (3194), R835 covers American lobster (3210), R832 covers mixed-species cuttlefish (3114), and R829 covers blue crab (3096). This proposal reviews a different species and portion record. See the completed [R838](wp04-section-p-next-gap-review-r838-20261019.md) and [R841](wp04-section-p-next-gap-review-r841-20261019.md) reviews and the latest [R839–R841 integration README](../batches/wp02-wp03-wp04-r839-r841-gap-review-integration-20261019/README.md); that integration confirms the cod observations and leaves Section P open without covering mackerel.

Proposed nested checklist entry for integration: record two historical CNF 2015 Food Code 3021 portions for raw Atlantic mackerel: one fillet = 115.2 g and one food-guide serving = 90.0 g. Keep both ledger-only and the separate 0% refuse field as context only; infer no whole-fish mass, yield, or reusable fillet conversion, and leave CNF 2026 continuity unverified.

Prior Atlantic-mackerel decisions are also separate: [R304](wp04-section-p-next-gap-review-r304-20261016.md) added the existing French search alias maquereau bleu, and [R668](wp04-section-p-next-regional-fish-gap-review-r668-20261018.md) held a proposed whole-thawed retail form outside active data. Neither decision records portions. The active reference is species-qualified as Atlantic mackerel, Scomber scombrus; the Health Canada page pairs the English row name “Fish, mackerel, atlantic, raw” with “Poisson maquereau bleu, cru.” DFO’s [official bilingual fish-identification guide](https://waves-vagues.dfo-mpo.gc.ca/Library/24740v.3fre.pdf) pairs MAQUEREAU BLEU with Scomber scombrus and English Atlantic mackerel. The active identity and existing alias therefore align with this CNF row without broadening generic mackerel naming.

## CNF 2015 evidence and limits

Health Canada’s [CNF serving-size page, Food Code 3021](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3021) names “Fish, mackerel, atlantic, raw” / “Poisson maquereau bleu, cru.” It lists 1 fillet = 115.2 g and 1 food guide serving = 90g = 90.0 g. It separately reports total refuse of 0%. The page gives no fillet dimensions, standardized fillet size, or weighing procedure.

The [2015 CNF Users’ Guide, Section C](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html) describes listed portion weights as generic weights for the described edible portions and says these weights are for edible material without refuse. It treats refuse and yield data as separate files. Preserve the two page values as source-specific published portions; do not derive total fish mass, yield, or another portion from the 0% refuse field. Do not turn the single-fillet entry into a standard fillet size or reusable form conversion.

Health Canada’s [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says the CNF 2026 release is available as relational CSV files and the online 2015 CNF remains an interim access route. The [official CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) lists a [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) and a [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv). Direct browser retrieval of both CSV resources failed, so this review did not join Food Code 3021 to 2026 food-name and measure rows. No 2026 row presence, absence, label, measure, or value is claimed; the 2015 observations remain historical.

## Exact proposed ledger delta

On ingredient-ref-atlantic-mackerel, add the following new source entry. Its source ID and URL are not currently owned in the ledger.

~~~json
{
  "sourceId": "WP04-SECTIONP-ATLANTIC-MACKEREL-CNF-PORTIONS-R844-20261019-S01",
  "url": "https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3021",
  "title": "Health Canada, Canadian Nutrient File serving-size page, Food Code 3021",
  "versionOrDate": "CNF 2015 online; page details modified 2019-03-01",
  "accessedOn": "2026-10-19",
  "locator": "Food Code 3021 title and serving-size panel; 1 fillet = 115.2 g; 1 food guide serving = 90g = 90.0 g; Refuse: total refuse 0%.",
  "supports": "Names raw Atlantic mackerel in English and French and lists the two source-specific portions. Separately reports total refuse 0%. The page gives no fillet dimensions, standard size, weighing procedure, or CNF 2026 row check.",
  "sourceKind": "food_composition"
}
~~~

Also attach these already-owned source entries to the Atlantic-mackerel record unchanged:

- WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02 — Health Canada, 2015 Canadian Nutrient File Users’ Guide, Section C. Its existing URL remains https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html.
- WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S33 — Health Canada, current Canadian Nutrient File overview. Its existing URL remains https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html.
- The existing DFO bilingual fish-identification guide source WP04-SECTIONP-MACKEREL-BLEU-R304-20261016-S02 already belongs to this record and needs no edit.

Append these two observations to the Atlantic-mackerel record’s measurementObservations:

~~~json
[
  {
    "observationId": "atlantic-mackerel-raw-cnf2015-one-fillet-r844-20261019",
    "relationship": "portion_weight",
    "value": 115.2,
    "valueUnit": "g",
    "foodDescription": "Fish, mackerel, atlantic, raw / Poisson maquereau bleu, cru (CNF 2015 Food Code 3021).",
    "foodState": "Raw Atlantic mackerel as named by CNF 2015 Food Code 3021. The source gives no fillet dimensions or standardized fillet size.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1 fillet = 115.2 g; it gives no weighing procedure or dimensions.",
    "quantityBasis": "One food-specific published portion for CNF 2015 Food Code 3021. The 2015 Users’ Guide describes listed portion weights as generic weights for the described edible portions and says the weights are for edible material without refuse. Keep 115.2 g attached only to this historical raw-row fillet portion; it is not a standard fillet size, recipe amount, whole-fish mass, yield, or reusable conversion. The separately reported 0% refuse is context only and is not used to calculate another weight.",
    "sourceQuantity": {
      "amount": 1,
      "unit": "fillet"
    },
    "observedMassG": 115.2,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-ATLANTIC-MACKEREL-CNF-PORTIONS-R844-20261019-S01",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02"
    ]
  },
  {
    "observationId": "atlantic-mackerel-raw-cnf2015-one-food-guide-serving-r844-20261019",
    "relationship": "portion_weight",
    "value": 90.0,
    "valueUnit": "g",
    "foodDescription": "Fish, mackerel, atlantic, raw / Poisson maquereau bleu, cru (CNF 2015 Food Code 3021).",
    "foodState": "Raw Atlantic mackerel as named by CNF 2015 Food Code 3021. The page does not state a preparation procedure for its food guide serving.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1 food guide serving = 90g = 90.0 g.",
    "quantityBasis": "One food-specific published food guide portion for CNF 2015 Food Code 3021. The 2015 Users’ Guide describes listed portion weights as generic weights for the described edible portions and says the weights are for edible material without refuse. Keep 90.0 g attached only to this historical raw-row food guide serving; it is not a recipe recommendation, whole-fish mass, yield, or reusable conversion. The separately reported 0% refuse is context only and is not used to calculate another weight.",
    "sourceQuantity": {
      "amount": 1,
      "unit": "food guide serving"
    },
    "observedMassG": 90.0,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-ATLANTIC-MACKEREL-CNF-PORTIONS-R844-20261019-S01",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02"
    ]
  }
]
~~~

Set only ingredient-ref-atlantic-mackerel.measurementState to researched_supported; preserve its verified identityState and not_yet_researched substitutionResearchState. Append this accepted decision:

~~~json
{
  "outcome": "accepted",
  "reason": "Record two historical CNF 2015 Food Code 3021 portions for raw Atlantic mackerel: 1 fillet = 115.2 g and 1 food guide serving = 90.0 g. Keep both ledger-only and source-specific to the described food row. The page separately reports total refuse of 0%; do not use it to infer whole-fish mass, yield, or a reusable fillet conversion. CNF 2026 Food Code 3021 row presence and values were not checked, so these observations make no current-edition continuity claim.",
  "sourceIds": [
    "WP04-SECTIONP-ATLANTIC-MACKEREL-CNF-PORTIONS-R844-20261019-S01",
    "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02",
    "WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S33",
    "WP04-SECTIONP-MACKEREL-BLEU-R304-20261016-S02"
  ]
}
~~~

Keep the active reference catalog unchanged. Add no alias, form, density, unit mapping, active conversion, package yield, recipe link, or substitution. In particular, do not attach 115.2 g to a mackerel-fillets form or treat it as a general raw mackerel measure.

## Ownership, picker, and recipe audit

- **Active identity and ledger state:** ingredient-ref-atlantic-mackerel is displayed as Atlantic mackerel / maquereau de l’Atlantique, category PROTEIN, with the existing French alias maquereau bleu. It has null default density, no unit mappings, verified identity, measurementState not_yet_researched, substitutionResearchState not_yet_researched, and no measurement observations.
- **Forms and neighboring identities:** The target has no active ingredient forms. The completed R668 review concerned a whole-thawed retail form and added none. Canned, canned-in-tomato-sauce, and smoked mackerel remain separate active references, as do Pacific and other species-qualified mackerels. This portion review changes none of those boundaries.
- **Rules and numeric ownership:** No Atlantic-mackerel match was found in active substitution rules, contextual substitution rules, package-yield data, ingredient unit mappings, or ledger unitConversions. No existing ledger observation cites Food Code 3021 or records a portion for this identity.
- **Source and ID ownership:** The Food Code 3021 URL and proposed R844 source ID are unused in the current ledger. The two proposed observation IDs are also unused. The 2015 Users’ Guide source ID and CNF overview source ID already map to their respective official URLs on other records; reuse them without changing their URL ownership. The DFO source ID already on the Atlantic-mackerel row continues to support the bilingual identity mapping.
- **Picker projection:** A static projection following the phrase-first normalized matching in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) returns Atlantic mackerel alone for Atlantic mackerel, maquereau de l’Atlantique, and maquereau bleu. The broad mackerel query returns ten species or product references, and maquereau bleu returns only the existing Atlantic-mackerel reference. Generic fillet returns eleven fish references; mackerel fillet currently returns none. Since this proposal changes only ledger evidence, all picker results remain unchanged.
- **Recipe demand:** Scanned all 114 manifest-listed recipe files and their 1,123 ingredient rows. No recipe text or ingredient row mentions Atlantic mackerel, maquereau bleu, maquereau de l’Atlantique, or the target reference ID. No recipe link or recipe-specific measure is justified.

## Static review and limits

- Checked the open Section P parent anchor, the latest R839–R841 integration, R838/R841 edition boundaries, the existing Atlantic-mackerel source/alias decisions, and the distinct R668 whole-form hold.
- Verified the official [CNF Food Code 3021 serving-size page](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3021), [2015 Users’ Guide](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html), [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), and [CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109). The dataset metadata lists the Food Name and Measure Weight Conversion resources, but the browser could not retrieve their CSV contents; the 2026 row join remains open.
- Static checks confirmed no current Food Code 3021 source or portion observation, no source-ID/URL ownership conflict for the proposed addition, no collision for the proposed observation IDs, no target forms or active numeric rules, unchanged picker projection for a ledger-only delta, and zero bundled recipe demand.
- This is one new proposal file only. It has no BOM, uses UTF-8, and was checked for local-link targets, trailing whitespace, and mojibake. No software tests, build, emulator run, or deployment were run; AGENTS.md exempts database-JSON-only additions from software testing.
