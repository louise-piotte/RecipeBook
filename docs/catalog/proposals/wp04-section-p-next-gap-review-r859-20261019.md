# WP04 Section P — Walleye CNF 2015 raw portions (R859)

- **Status:** Integrated on 2026-10-19. The two historical CNF 2015 portions and taxonomic source clarification are recorded on the existing Walleye ledger row; the plan and progress records are updated in the [R857–R859 integration README](../batches/wp02-wp03-wp04-r857-r859-gap-review-integration-20261019/README.md).
- **Plan anchor:** The open Section P finfish parent at [plan line 7102](../../RecipeBook-global-ingredient-catalog-plan.txt#L7120) includes regional fish. Its latest child is the R856 Atlantic-salmon review at [plan lines 8056–8061](../../RecipeBook-global-ingredient-catalog-plan.txt#L8074).
- **Candidate:** Historical serving portions for the existing `ingredient-ref-walleye` reference, CNF 2015 Food Code 3202, “Fish, pickerel, walleye-pickerel (yellow pike), raw.”
- **Recommendation:** Append two source-specific ledger observations: one fillet = 159.0 g and one food-guide serving = 90.0 g. Preserve the separate 65% refuse field as context only. Do not attach either observation to the existing whole-fish form, create a fillet form, or alter picker terms.

## Gap and non-overlap

The Section P parent remains open after the [R854–R856 integration](../batches/wp02-wp03-wp04-r854-r856-gap-review-integration-20261019/README.md). The latest roadmap and workflow checkpoints also leave Section P open ([roadmap line 1542](../../../roadmap.md#L1542), [workflow line 3312](../ingredient-catalog-workflow.md#L3312)). R856 covers wild, raw Atlantic salmon Food Code 3049; R853 covers cooked rainbow trout Food Code 3206. R859 covers a different active identity and historical raw Food Code 3202 row. It does not transfer or revise either recent species’ portions, and it is separate from R835 American lobster, R838 Atlantic herring, R841 Atlantic cod, R844 Atlantic mackerel, R847 Alaska pollock, and R850 Channel Catfish.

Walleye / `doré jaune` was added as an identity-only reference for *Sander vitreus*. The ledger currently marks its identity verified, measurement research `not_yet_researched`, and substitution research `not_yet_researched`; it has no measurement observations. R751 later added one whole-fish presentation under that identity but no measurement. The raw CNF portions are a distinct measurement question and remain ledger-only.

## Primary source evidence, identity boundary, and edition limits

Health Canada’s [CNF 2015 serving-size page for Food Code 3202](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3202) names **“Fish, pickerel, walleye-pickerel (yellow pike), raw”** and **“Poisson, doré (doré jaune ou blanc), cru.”** It lists **1 fillet = 159.0 g** and **1 food guide serving = 90g = 90.0 g**, and separately reports **total refuse 65%**. The page also displays a 100 g edible-portion baseline; that baseline is not another household portion. It gives no fillet dimensions, size standard, or weighing procedure. These are CNF 2015 Food Code 3202 values only.

The bilingual row can be associated with the existing *Sander vitreus* identity. The [Government of Québec species profile](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/dore-jaune) names **Doré jaune / Walleye**, identifies the species as *Sander vitreus*, and lists `doré blanc` among other French names for that same species. The existing ledger source `WP04-FRESHWATER-FINFISH-20261010-S02` already records the direct name/taxon pairing for the active reference; this proposal recommends expanding that source entry’s locator/support text to make its `doré blanc` evidence explicit. The [OQLF GDT entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198870/dore-jaune) calls `doré jaune` the normalized preferred name in Québec fish-product marketing and says `doré blanc` is not retained for that commercial context. Accordingly, keep the active display `walleye / doré jaune`, add no `doré blanc` alias, and do not promote CNF’s `pickerel` or `yellow pike` wording into search aliases. This uses the Government of Québec profile to align the historical bilingual CNF label with the verified species; it does not assert that the other names are preferred consumer labels.

The 2015 [CNF Users’ Guide, Section C](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html) describes the listed portion weights as generic weights for the described portions and says they are for edible material without refuse. Its separate refuse and yield sections do not provide a basis to convert 65% refuse into an as-purchased fish mass or yield. Keep the two weights attached only to the historical raw row’s listed portions; they are not standard fillet dimensions, recipe recommendations, cooking yields, or reusable conversions.

Health Canada’s [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) describes the 2026 release as relational CSV data and says CNF 2015 remains accessible as an interim measure. This proposal does **not** join the 2026 food-name and measure-weight rows for Code 3202. Current-edition row presence, labels, and values remain open; no continuity or absence claim is made.

## Exact proposed ledger delta

On the existing `ingredient-ref-walleye` ledger record:

1. Set `measurementState` to `researched_supported`; preserve `identityState: verified` and `substitutionResearchState: not_yet_researched`.
2. Append the Code 3202 source below. Attach the already-owned CNF 2015 Users’ Guide and current CNF overview source records unchanged. Their source IDs continue to map to their existing single URLs. The active record already owns the Québec species-profile source and OQLF source.
3. For the already-attached source `WP04-FRESHWATER-FINFISH-20261010-S02`, replace only its `locator` and `supports` strings with the following to record the directly reviewed taxonomic alignment. Keep its existing source ID, URL, title, access date, and source kind.

```json
{
  "sourceId": "WP04-FRESHWATER-FINFISH-20261010-S02",
  "locator": "French and English names, current scientific name, freshwater classification, and alternate-name list; the profile lists doré blanc as another French name for Doré jaune / Walleye.",
  "supports": "Identifies Doré jaune / Walleye as Sander vitreus and lists doré blanc among other French names under that same species profile. This aligns the historical CNF 2015 bilingual row with the existing species identity; it does not make doré blanc a preferred Québec fish-product label or an active alias. The biological profile provides no kitchen measure."
}
```

Append this new CNF source record to the target ledger row:

```json
{
  "sourceId": "WP04-SECTIONP-WALLEYE-CNF-PORTIONS-R859-20261019-S01",
  "url": "https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3202",
  "title": "Health Canada, Canadian Nutrient File serving-size page, Food Code 3202",
  "versionOrDate": "CNF 2015 online; page modified 2019-03-01",
  "accessedOn": "2026-10-19",
  "locator": "Food Code 3202 bilingual title and serving-size panel: 1 fillet = 159.0 g; 1 food guide serving = 90g = 90.0 g. Refuse: total refuse 65%.",
  "supports": "Names Fish, pickerel, walleye-pickerel (yellow pike), raw / Poisson, doré (doré jaune ou blanc), cru; lists the two source-specific portions and separately reports 65% total refuse. The displayed 100 g edible-portion baseline is not a household portion. The page gives no fillet dimensions or weighing procedure and does not verify CNF 2026 row presence or values.",
  "sourceKind": "food_composition"
}
```

Also append these previously allocated sources to the same ledger record without changing their existing source IDs or URLs:

```json
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
```

Append these observations to `ingredient-ref-walleye.measurementObservations`. Leave `ingredientFormId` absent: the only active Walleye form is whole fish, not a raw fillet form.

```json
[
  {
    "observationId": "walleye-cnf2015-raw-one-fillet-r859-20261019",
    "relationship": "portion_weight",
    "value": 159.0,
    "valueUnit": "g",
    "foodDescription": "Fish, pickerel, walleye-pickerel (yellow pike), raw / Poisson, doré (doré jaune ou blanc), cru (CNF 2015 Food Code 3202).",
    "foodState": "Raw walleye/pickerel as named by CNF 2015 Food Code 3202. The page does not describe fillet dimensions or preparation beyond raw.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1 fillet = 159.0 g; it gives no fillet dimensions or weighing procedure.",
    "quantityBasis": "One source-specific published portion for CNF 2015 Food Code 3202. The 2015 Users’ Guide describes listed portion weights as generic weights for the described edible portions without refuse. Keep 159.0 g attached only to this historical raw row’s 1-fillet portion; it is not a standard fillet size, recipe amount, whole-fish mass, yield, or reusable conversion. The separately reported 65% refuse is not used to derive another weight or yield.",
    "sourceQuantity": {
      "amount": 1,
      "unit": "fillet"
    },
    "observedMassG": 159.0,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-WALLEYE-CNF-PORTIONS-R859-20261019-S01",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02",
      "WP04-FRESHWATER-FINFISH-20261010-S02"
    ]
  },
  {
    "observationId": "walleye-cnf2015-raw-food-guide-serving-r859-20261019",
    "relationship": "portion_weight",
    "value": 90.0,
    "valueUnit": "g",
    "foodDescription": "Fish, pickerel, walleye-pickerel (yellow pike), raw / Poisson, doré (doré jaune ou blanc), cru (CNF 2015 Food Code 3202).",
    "foodState": "Raw walleye/pickerel as named by CNF 2015 Food Code 3202. The page does not describe a preparation procedure for its food-guide serving.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1 food guide serving = 90g = 90.0 g.",
    "quantityBasis": "One source-specific published food-guide portion for CNF 2015 Food Code 3202. The 2015 Users’ Guide describes listed portion weights as generic weights for the described edible portions without refuse. Keep 90.0 g attached only to this historical raw row’s food-guide serving; it is not a recipe recommendation, whole-fish mass, yield, or reusable conversion. The separately reported 65% refuse is not used to derive another weight or yield.",
    "sourceQuantity": {
      "amount": 1,
      "unit": "food guide serving"
    },
    "observedMassG": 90.0,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-WALLEYE-CNF-PORTIONS-R859-20261019-S01",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02",
      "WP04-FRESHWATER-FINFISH-20261010-S02"
    ]
  }
]
```

Append this decision to the existing Walleye record:

```json
{
  "outcome": "accepted",
  "reason": "Record the historical CNF 2015 Food Code 3202 portions for raw walleye/pickerel: 1 fillet = 159.0 g and 1 food guide serving = 90.0 g. Keep them ledger-only and tied to the named raw row. The Government of Québec profile identifies doré jaune / Walleye as Sander vitreus and lists doré blanc under the same species; OQLF identifies doré jaune as the normalized Québec fish-product name and does not retain doré blanc for that marketing context. Do not add doré blanc, pickerel, or yellow pike as aliases. The separate 65% refuse does not support whole-fish mass, yield, or a reusable fillet conversion. Do not transfer the portions to the whole-fish form. CNF 2026 Food Code 3202 row presence and values remain unverified, so this decision makes no current-edition continuity claim.",
  "sourceIds": [
    "WP04-SECTIONP-WALLEYE-CNF-PORTIONS-R859-20261019-S01",
    "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02",
    "WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S33",
    "WP04-FRESHWATER-FINFISH-20261010-S01",
    "WP04-FRESHWATER-FINFISH-20261010-S02"
  ]
}
```

Recommended nested checklist entry for root integration:

> Record historical CNF 2015 Food Code 3202 portions for raw walleye/pickerel: one fillet = 159.0 g and one food-guide serving = 90.0 g. Keep both ledger-only on `ingredient-ref-walleye`; retain the separate 65% refuse as context, infer no whole-fish mass, yield, or reusable fillet conversion, do not transfer portions to the whole-fish form, and leave CNF 2026 continuity unverified. See proposal `catalog/proposals/wp04-section-p-next-gap-review-r859-20261019.md`.

Make no change to the active reference, whole-fish form, aliases, density, unit mappings, substitution rules, package yields, or recipes.

## Ownership, picker, forms, and bundled recipe audit

- **Identity and form ownership:** `ingredient-ref-walleye` is displayed as `walleye / doré jaune`, category `PROTEIN`, with empty English and French aliases, null density, and no unit mappings. Its identity ledger row owns the OQLF, Government of Québec, and CFIA pollock-boundary sources; it has no prior measurement observations. The sole active Walleye form is `ingredient-form-walleye-whole-fish`, `whole_fish` / `whole`, labeled `whole walleye / doré jaune entier`. Its ledger row has no supported measurements. No raw-fillets form exists. R859 attaches the observations only to the parent reference and does not infer a fillet-to-whole-fish relation.
- **Source and ID ownership:** No active ledger source owns the Food Code 3202 URL or the proposed R859 source ID. No prior proposal or batch owns Food Code 3202 or the proposed observation IDs. The existing Guide source ID `WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02` and overview ID `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S33` are already shared across ledger records; each remains mapped to its existing URL. The Government of Québec source ID `WP04-FRESHWATER-FINFISH-20261010-S02` is already attached to the Walleye parent record and remains the source for the `doré blanc` species-profile clarification. The OQLF source ID `WP04-FRESHWATER-FINFISH-20261010-S01` remains the authority for the preferred Québec fish-product display.
- **Rules and numeric ownership:** No active substitution rule, contextual substitution rule, package-yield row, ledger unit conversion, reference mapping, or Walleye form measurement owns the proposed values. Substitution research remains `not_yet_researched`; R859 makes no substitute finding. The proposal adds historical food-composition portions to the research ledger only.
- **Picker projection:** A static projection using the phrase-first normalization in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) returns one result for `walleye`, `doré jaune`, and `whole walleye`; the last query also maps to the existing whole-fish form. `pickerel`, `doré blanc`, and `yellow pike` currently return no results. These results remain unchanged because the proposal adds no active search term or form.
- **Recipe demand:** Scanned all 114 manifest-listed recipe files and their 1,123 structured ingredient rows for Walleye / `doré jaune`, *Sander vitreus*, `ingredient-ref-walleye`, `ingredient-form-walleye-whole-fish`, and the CNF source labels. No candidate-specific file or row match was found. No recipe link, amount, role, method, or substitution context supports assigning either CNF portion to a recipe.

## Static review checks and limits

- Read the current `AGENTS.md`, the open Section P parent and its latest R856 child, the R854–R856 batch README, and the current roadmap/workflow checkpoints before choosing the candidate.
- Inspected the active Walleye reference and whole-fish form, both ledger records, legacy identities, form and ingredient aliases, substitution-rule files, package-yield file, unit mappings, source-ID/URL ownership, phrase-first search behavior, and all manifest-listed recipes.
- Verified the official CNF 2015 Code 3202 page, 2015 Users’ Guide, current CNF overview, Government of Québec Walleye species profile, and OQLF `doré jaune` entry. The code-specific CNF 2026 Food Name and Measure Weight Conversion rows were not joined; Code 3202 presence, labels, and values in that edition remain unknown.
- Proposal-local static checks: confirm the proposed source ID, URL, and observation IDs are unowned; validate embedded JSON examples against `research-ledger.schema.json`; check UTF-8/no-BOM, local links and plan anchors, and scoped whitespace. No software tests, build, emulator, or deployment are needed for this proposal-only work; `AGENTS.md` exempts changes that only add database JSON data from testing.
