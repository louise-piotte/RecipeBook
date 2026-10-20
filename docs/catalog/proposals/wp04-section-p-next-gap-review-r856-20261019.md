# WP04 Section P — Atlantic salmon CNF 2015 wild-raw portions (R856)

- **Status:** Integrated on 2026-10-19. The two historical CNF 2015 portions are recorded as ledger-only observations on the wild, raw Atlantic salmon row.
- **Plan anchor:** The open Section P finfish checklist includes salmon and the remaining fish coverage at [plan line 7102](../../RecipeBook-global-ingredient-catalog-plan.txt#L7120).
- **Candidate:** Historical serving portions for the existing `ingredient-ref-atlantic-salmon` identity, Health Canada CNF 2015 Food Code 3049, “Fish, salmon, atlantic, wild, raw.”
- **Recommendation:** Add two source-specific published-portion observations to the existing reference ledger row: one 1/2 fillet = 198.0 g and one food-guide serving = 90.0 g. Keep them ledger-only and preserve the separate 65% refuse field as context.
- **Integration:** Root integrated the ledger changes, plan checkpoint, roadmap/workflow notes, generated index where applicable, and README; details and static checks are in the [R854–R856 integration README](../batches/wp02-wp03-wp04-r854-r856-gap-review-integration-20261019/README.md).

## Gap and non-overlap

The Section P parent remains open after the [R851–R853 integration](../batches/wp02-wp03-wp04-r851-r853-gap-review-integration-20261019/README.md). The active Atlantic salmon identity was added by R115 for *Salmo salar*. At proposal time, its ledger had no measurement observations and recorded `measurementState: researched_no_supported_value`; the earlier finding says no reusable portion, density, unit mapping, or package yield had been supported by the then-reviewed identity and retailer evidence. R856 adds historical CNF observations without turning them into reusable catalog behavior, so that earlier limit remains accurate. The later R709 fresh-whole form and R577 steak-form review concern separate retail cuts and do not own these CNF portions.

This is not a continuation of another fish's Food Code or a transfer to another salmon identity: R835 reviewed American lobster 3210, R838 Atlantic herring 3014, R841 Atlantic cod 3194, R844 Atlantic mackerel 3021, R847 Alaska pollock 3039, R850 wild/farmed Channel Catfish 2993/3180, and R853 wild cooked Rainbow Trout 3206. R856 concerns only wild, raw Atlantic salmon 3049. At proposal time, the exact 3049 page URL, proposed source ID, observation IDs, and R856 source prefix were unallocated in the active ledger/archive; integration assigns them to this row.

## Primary evidence and edition boundary

Health Canada’s [CNF 2015 serving-size page for Food Code 3049](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3049) names **“Fish, salmon, atlantic, wild, raw” / “Poisson, saumon, atlantique, sauvage, cru.”** It lists **1/2 fillet = 198.0 g** and **1 food guide serving = 90g = 90.0 g**. The page separately reports **total refuse 65%** and displays a 100 g edible-portion baseline. The baseline is not a household portion; the refuse is not used to calculate another mass or yield. The page details show a modification date of 2019-03-01; the observations remain explicitly CNF 2015 Food Code 3049 data.

The 2015 [CNF Users’ Guide, Section C](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html) describes portion weights as generic weights for the described edible portions, without refuse. Its separate refuse and yield sections do not authorize deriving a whole-fish mass or cooking yield from this 65% field. These are historical source-specific portions, not a standard fillet size, recipe recommendation, or reusable conversion.

Health Canada’s [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says CNF 2026 is distributed in relational CSV files and the CNF 2015 online lookup remains accessible as an interim measure. This review does not join the 2026 food-name and measure rows for Food Code 3049. Its current-edition presence, label, and values remain unverified; this proposal makes no continuity or absence claim.

## Exact proposed ledger delta

On the existing `ingredient-ref-atlantic-salmon` ledger record, append the following new source entry. Attach the already-owned shared CNF guide source `WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02` and CNF overview source `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S33` unchanged so the cited IDs resolve on this record; do not allocate new IDs or URLs for those shared sources.

```json
{
  "sourceId": "WP04-SECTIONP-ATLANTIC-SALMON-CNF-PORTIONS-R856-20261019-S01",
  "url": "https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3049",
  "title": "Health Canada, Canadian Nutrient File serving-size page, Food Code 3049",
  "versionOrDate": "CNF 2015 online; page modified 2019-03-01",
  "accessedOn": "2026-10-19",
  "locator": "Food Code 3049 title and serving-size panel: 1/2 fillet = 198.0 g; 1 food guide serving = 90g = 90.0 g. Refuse: total refuse 65%.",
  "supports": "Names Fish, salmon, atlantic, wild, raw / Poisson, saumon, atlantique, sauvage, cru; lists the two source-specific portions and separately reports total refuse of 65%. The 100 g edible-portion baseline is not a household portion. This historical page does not verify CNF 2026 row presence or values.",
  "sourceKind": "food_composition"
}
```

Append these observations to `ingredient-ref-atlantic-salmon.measurementObservations`; include the existing shared guide source ID in each observation’s `sourceIds`. Keep `ingredientFormId` absent: the active fresh-whole form is not a raw half-fillet form.

```json
[
  {
    "observationId": "atlantic-salmon-wild-raw-cnf2015-half-fillet-r856-20261019",
    "relationship": "portion_weight",
    "value": 198.0,
    "valueUnit": "g",
    "foodDescription": "Fish, salmon, atlantic, wild, raw / Poisson, saumon, atlantique, sauvage, cru (CNF 2015 Food Code 3049).",
    "foodState": "Wild, raw Atlantic salmon as named by CNF 2015 Food Code 3049. The page does not describe the fillet dimensions or preparation beyond raw.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1/2 fillet = 198.0 g; it gives no fillet dimensions or weighing procedure.",
    "quantityBasis": "One source-specific published portion for CNF 2015 Food Code 3049. The 2015 Users’ Guide describes listed portion weights as generic weights for the described edible portions without refuse. Keep 198.0 g attached only to this historical wild, raw row’s 1/2-fillet portion; it is not a standard fillet size, recipe amount, whole-fish mass, yield, or reusable conversion. The separately reported 65% refuse is not used to derive another weight or yield.",
    "sourceQuantity": {
      "amount": 0.5,
      "unit": "fillet"
    },
    "observedMassG": 198.0,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-ATLANTIC-SALMON-CNF-PORTIONS-R856-20261019-S01",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02"
    ]
  },
  {
    "observationId": "atlantic-salmon-wild-raw-cnf2015-food-guide-serving-r856-20261019",
    "relationship": "portion_weight",
    "value": 90.0,
    "valueUnit": "g",
    "foodDescription": "Fish, salmon, atlantic, wild, raw / Poisson, saumon, atlantique, sauvage, cru (CNF 2015 Food Code 3049).",
    "foodState": "Wild, raw Atlantic salmon as named by CNF 2015 Food Code 3049. The page does not state a preparation or recipe-serving procedure for its food-guide serving.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1 food guide serving = 90g = 90.0 g.",
    "quantityBasis": "One source-specific published food-guide portion for CNF 2015 Food Code 3049. The 2015 Users’ Guide describes listed portion weights as generic weights for the described edible portions without refuse. Keep 90.0 g attached only to this historical wild, raw row’s food-guide serving; it is not a recipe recommendation, whole-fish mass, yield, or reusable conversion. The separately reported 65% refuse is not used to derive another weight or yield.",
    "sourceQuantity": {
      "amount": 1,
      "unit": "food guide serving"
    },
    "observedMassG": 90.0,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-ATLANTIC-SALMON-CNF-PORTIONS-R856-20261019-S01",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02"
    ]
  }
]
```

Set only the Atlantic-salmon reference’s `measurementState` to `researched_supported` for these historical observations. Preserve its verified identity and `researched_no_supported_substitute` state. Append this accepted decision:

```json
{
  "outcome": "accepted",
  "reason": "Record the historical CNF 2015 Food Code 3049 portions for wild, raw Atlantic salmon: 1/2 fillet = 198.0 g and 1 food guide serving = 90.0 g. Keep them ledger-only and attached to the named wild, raw row. The separate 65% refuse does not support whole-fish mass, yield, or a reusable fillet conversion. Do not transfer these values to the fresh-whole form, farmed Atlantic salmon, or the generic salmon-fillets recipe line. CNF 2026 Food Code 3049 row presence and values are unverified, so this decision makes no current-edition continuity claim.",
  "sourceIds": [
    "WP04-SECTIONP-ATLANTIC-SALMON-CNF-PORTIONS-R856-20261019-S01",
    "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02",
    "WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S33"
  ]
}
```

Do not change the catalog reference, active forms, aliases, density, unit mappings, recipes, rules, or package yields.

Recommended nested checklist sentence for root integration:

> Record historical CNF 2015 Food Code 3049 portions for wild, raw Atlantic salmon: one 1/2 fillet = 198.0 g and one food-guide serving = 90.0 g. Keep both ledger-only on `ingredient-ref-atlantic-salmon`; retain the separate 65% refuse as context, infer no whole-fish mass, yield, or generic fillet conversion, and leave CNF 2026 continuity unverified. Proposed link target: `catalog/proposals/wp04-section-p-next-gap-review-r856-20261019.md`.

## Ownership, forms, picker, rules, and recipes

- **Reference and form ownership:** The active reference is `ingredient-ref-atlantic-salmon` (`Atlantic salmon / saumon de l’Atlantique`, alias `saumon atlantique`, *Salmo salar*). It owns no observations yet. Its only form is `ingredient-form-atlantic-salmon-fresh-whole`, a fresh whole retail cut; its form ledger has no supported measurement. No raw-fillet form is active. R856 attaches no observation to that fresh-whole form and does not create another form.
- **Source and ID ownership:** No exact ledger source owns the new Food Code 3049 URL, and the proposed R856 source/observation IDs are unallocated. Reuse the existing `WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02` guide source and `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S33` overview source; their URL mappings are already stable. The species pairing is already supported on this reference by R115’s OQLF and CFIA sources. The source code does not make wild portions applicable to farmed salmon.
- **Legacy and active rules:** The legacy-import identity list has no Atlantic-salmon duplicate. Neither active substitution-rule file nor `package-yields.v1.json` contains a rule or yield for this reference or its fresh-whole form. The ledger still says no supported substitute; this proposal makes no substitution claim.
- **Picker projection:** The current phrase-first projection returns one result for `Atlantic salmon`, `saumon de l’Atlantique`, and `saumon atlantique`; broad `salmon` and `saumon` each return 10 references; `salmon fillets` returns only the separate generic salmon-fillets reference. As the proposed delta is ledger-only, all these results and form hints stay unchanged.
- **Bundled recipes:** The manifest lists 114 recipes and 1,123 ingredient rows. A complete manifest-file scan found no `Atlantic salmon`, `saumon de l’Atlantique`, `saumon atlantique`, *Salmo salar*, or Atlantic-salmon reference/form ID occurrence. Recipe 077#10 remains the generic 675 g `salmon fillets without skin` line linked to `ingredient-ref-salmon-fillets-without-skin`; R856 does not infer its species or amount from CNF.

## Static review checks and limits

- Read the current Section P anchor, roadmap/workflow checkpoint, and latest R851–R853 integration README. Verified that the R835/R838/R841/R844/R847/R850/R853 review items refer to separate species and Food Codes.
- Inspected the live reference/form records, Atlantic-salmon ledger state, legacy identities, source-ID/URL ownership, substitution-rule files, package yields, phrase-first search behavior, and all manifest-listed recipes. No shared catalog, ledger, plan, roadmap, workflow, generated index, README, or recipe file was edited.
- Verified the official 2015 Food Code 3049 page and the official 2015 CNF Users’ Guide. The 2026 source describes the release format only; the code-specific 2026 join was not performed, so row presence/absence, labels, and values are unknown.
- This is proposal documentation only. No software tests, build, emulator run, or deployment were performed. If integration only adds the proposed database JSON evidence, the `AGENTS.md` rule requires no testing.
