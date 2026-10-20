# WP04 Section P R823 — blue-mussel CNF portion evidence

- **Review date:** 2026-10-19.
- **Candidate:** Historical Health Canada Canadian Nutrient File (CNF) 2015 serving portions for the existing species-scoped `ingredient-ref-blue-mussel` (*Mytilus edulis*).
- **Recommendation:** Record five code- and edition-scoped `published_portion` observations on the existing ledger record: two volume portions and three individual-count portions from CNF 2015 Food Code 3115. Set only this record's `measurementState` to `researched_supported` for the historical evidence. Keep current CNF 2026 row inspection open.
- **Write scope:** This proposal only. No shared catalog, ledger, recipe, plan, roadmap, workflow, or generated file was changed.

## Open checklist and prior-work boundary

The open WP04 Section P parent remains **“Mussel, clam, oyster, cockle, and remaining shellfish identities; scallop is integrated below”** in the [live plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L8177). R823 fills a measurement-evidence gap on an identity already accepted in that open workstream. It does not add a shellfish identity or revisit the held generic mussel candidate.

Recent distinct reviews cover other boundaries: R811 held Iceland cockle outside the picker; R814 recorded Clover Leaf canned-crab label portions; R817 recorded Eastern-oyster CNF 2015 portions; and R820 recorded one raw, mixed-species squid count from CNF 2015. None owns Food Code 3115 or the *Mytilus edulis* measurement record. This proposal concerns blue mussel only and does not repeat those oyster, crab, cockle, or calamari reviews.

## Existing identity, terminology, and numeric state

| Item | Current state | R823 scope |
|---|---|---|
| `ingredient-ref-blue-mussel` | Active `PROTEIN` identity; display `blue mussel / moule`; English alias `blue mussels`; French aliases `moule bleue`, `moules bleues`; species-scoped to *Mytilus edulis*. | Preserve the identity, display, category, and all aliases. Add no CNF-derived name or search alias. |
| Bilingual identity evidence | Existing ledger sources include OQLF's [moule (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198877/moule), which pairs preferred Québec `moule` with English `blue mussel` and Latin *Mytilus edulis*. Fisheries and Oceans Canada's [Identifying bivalve shellfish](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm) says the single mussel species harvested in Canada is blue mussel (*M. edulis*). | Use these existing identity sources as the crosswalk for the CNF's English/French common-name row. Do not create duplicate terminology sources. The DFO statement does not establish that every imported or unqualified recipe request is this species. |
| Species aliases | Existing names are intentionally qualified; `mussel / moule` remains broader than this row. OQLF says `moule` is its preferred Québec commercial term for this species and does not retain `moule bleue` as the standardized commercial display; the existing blue-qualified spellings remain search aliases only. | Keep the generic mussel candidate unresolved and preserve current alias allocation. |
| Forms and active numeric fields | No form is attached to `ingredient-ref-blue-mussel`; `defaultDensity` is null and `unitMappings` is empty. | Add no `raw` form, measurement field, volume conversion, density, or reusable count mapping. The observations remain in the research ledger only. |
| Ledger record | `identityState: verified`; `measurementState: not_yet_researched`; `substitutionResearchState: not_yet_researched`; zero measurement observations and zero substitution findings. | Add the five historical observations, two new food-composition sources, and one accepted measurement decision. Change only `measurementState` to `researched_supported`; preserve identity and substitution states. |
| Generic mussel boundary | Held generic `ingredient-ref-mussel` remains unresolved. Blue, Mediterranean, and green-lipped mussel identities and separate cooked/frozen, smoked, brined, and escabeche products remain distinct. | Do not assign generic `mussel`, `moules`, or an unqualified recipe request to this species. Do not change any neighboring identity or product. |

The CNF French food-name string is evidence text, not a preferred Québec label. Keep the active labels `blue mussel / moule` and the already-supported species-qualified aliases unchanged.

## CNF 2015 evidence and interpretation

Health Canada's [CNF 2015 serving-size page, Food Code 3115](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3115) names **“Mollusks, mussel, blue, raw”** and **“Mollusques, moule, bleue, crue.”** Under available serving sizes it lists the following portions:

| Source portion | Published mass | Proposed treatment |
|---|---:|---|
| 100 mL | 63.4 g | Record as one CNF 2015 `portion_weight` observation. |
| 250 mL | 158.5 g | Record as a separate CNF 2015 `portion_weight` observation. |
| 1 small | 10.0 g | Record as a code-specific `count_weight` observation. |
| 1 medium | 16.0 g | Record as a separate code-specific `count_weight` observation. |
| 1 large | 20.0 g | Record as a separate code-specific `count_weight` observation. |

The same page also gives a 100 g edible-portion baseline, a 90 g food-guide serving, and **70% total refuse**. Do not record the 100 g baseline or standardized food-guide serving as recipe portions. Do not use the refuse percentage to calculate shell-on mass, yield, or a generic edible ratio. The CNF 2015 [Users' Guide, section C](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html) explains that portion weights are generic weights for the described food-specific portions, can differ from local examples, and are weights of edible material without refuse. Therefore the five listed masses are historical edible-portion evidence for Food Code 3115; they do not weigh mussels in their shells or define a household conversion for any active form. The guide and serving page give no size cutoff for “small”, “medium”, or “large”, no packing protocol for the volume portions, and no weighing procedure.

The match from CNF's bilingual common-name row to this ledger record is supported by its explicit `blue`/`moule bleue` wording and the existing OQLF/DFO species identity evidence. CNF itself supplies no binomial on this portion page. Do not infer that any shell-on retail product, cooked mussel meat, canned product, or unqualified recipe request shares the listed weights. Keep the five portions separate; do not derive a density or average the values.

## Current CNF 2026 access limit

Health Canada's [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says the 2026 CNF is published as relational CSV files and that the 2015 online search remains available as an interim access route while Health Canada develops a more user-friendly 2026 viewer. The [Open Government 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) lists Food Name and Measure Weight Conversion resources, and its indexed dataset record shows an update date of 2026-10-04.

Direct access to the current [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) and [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) returned “not accessible via this tool”; the Open Government dataset page returned 403. This proposal makes no row-level claim about CNF 2026: it does not claim that Food Code 3115 remains, has been removed, or carries forward any of the 2015 values. Keep direct 2026 row inspection open as a separate follow-up and retain any accepted 2015 observations as explicitly historical evidence.

## Exact proposed ledger delta

Append two sources to the existing `ingredient-ref-blue-mussel` ledger record. The exact CNF 2015 serving-page URL has no ledger owner; the Users' Guide URL is already cited on six other records, so use a new record-specific source ID for this observation set. Reuse the existing OQLF/DFO sources for identity crosswalk only.

```json
[
  {
    "sourceId": "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S01",
    "url": "https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3115",
    "title": "Health Canada, Canadian Nutrient File 2015 serving size, Food Code 3115",
    "versionOrDate": "CNF 2015; page details modified 2019-03-01",
    "accessedOn": "2026-10-19",
    "locator": "Bilingual food descriptions; Food Code 3115; available serving sizes 100 mL = 63.4 g, 250 mL = 158.5 g, 1 small = 10.0 g, 1 medium = 16.0 g, and 1 large = 20.0 g; total refuse 70%.",
    "supports": "Publishes five source-specific edible portions for raw blue mussel in CNF 2015 Food Code 3115. The page supplies no size cutoff or weighing/packing protocol; its refuse field is separate from the portion weights.",
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
  }
]
```

Append the following five observations, all with `evidenceKind: published_portion`, `valueUnit: g`, `value` equal to `observedMassG`, no `ingredientFormId`, and both new source IDs. For volume observations include `observedVolumeMl` as shown. The count source quantities preserve the page's one-item count and size label in the Food Code 3115 context.

```json
[
  {
    "observationId": "blue-mussel-raw-cnf2015-100ml-r823-20261019",
    "relationship": "portion_weight",
    "value": 63.4,
    "valueUnit": "g",
    "foodDescription": "Mollusks, mussel, blue, raw / Mollusques, moule, bleue, crue (CNF 2015 Food Code 3115).",
    "foodState": "Raw blue mussel as named by CNF 2015 Food Code 3115; edible portion without refuse under the CNF 2015 Users' Guide.",
    "measurementMethod": "The CNF 2015 serving-size page lists 100 mL = 63.4 g. It states no volume packing or weighing protocol.",
    "quantityBasis": "Food-code-specific published edible portion without refuse. The page separately reports 70% total refuse; do not infer shell-on mass, yield, or identity-wide volume conversion.",
    "sourceQuantity": { "amount": 100, "unit": "mL" },
    "observedMassG": 63.4,
    "observedVolumeMl": 100,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S01",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02"
    ]
  },
  {
    "observationId": "blue-mussel-raw-cnf2015-250ml-r823-20261019",
    "relationship": "portion_weight",
    "value": 158.5,
    "valueUnit": "g",
    "foodDescription": "Mollusks, mussel, blue, raw / Mollusques, moule, bleue, crue (CNF 2015 Food Code 3115).",
    "foodState": "Raw blue mussel as named by CNF 2015 Food Code 3115; edible portion without refuse under the CNF 2015 Users' Guide.",
    "measurementMethod": "The CNF 2015 serving-size page lists 250 mL = 158.5 g. It states no volume packing or weighing protocol.",
    "quantityBasis": "Food-code-specific published edible portion without refuse. The page separately reports 70% total refuse; do not infer shell-on mass, yield, or identity-wide volume conversion.",
    "sourceQuantity": { "amount": 250, "unit": "mL" },
    "observedMassG": 158.5,
    "observedVolumeMl": 250,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S01",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02"
    ]
  },
  {
    "observationId": "blue-mussel-raw-cnf2015-one-small-r823-20261019",
    "relationship": "count_weight",
    "value": 10.0,
    "valueUnit": "g",
    "foodDescription": "Mollusks, mussel, blue, raw / Mollusques, moule, bleue, crue (CNF 2015 Food Code 3115).",
    "foodState": "Raw blue mussel as named by CNF 2015 Food Code 3115; edible portion without refuse under the CNF 2015 Users' Guide.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1 small = 10.0 g. It provides no size cutoff or weighing protocol.",
    "quantityBasis": "Food-code-specific published edible count portion without refuse. The page separately reports 70% total refuse; do not infer shell-on mass, yield, or a reusable count conversion.",
    "sourceQuantity": { "amount": 1, "unit": "small blue mussel" },
    "observedMassG": 10.0,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S01",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02"
    ]
  },
  {
    "observationId": "blue-mussel-raw-cnf2015-one-medium-r823-20261019",
    "relationship": "count_weight",
    "value": 16.0,
    "valueUnit": "g",
    "foodDescription": "Mollusks, mussel, blue, raw / Mollusques, moule, bleue, crue (CNF 2015 Food Code 3115).",
    "foodState": "Raw blue mussel as named by CNF 2015 Food Code 3115; edible portion without refuse under the CNF 2015 Users' Guide.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1 medium = 16.0 g. It provides no size cutoff or weighing protocol.",
    "quantityBasis": "Food-code-specific published edible count portion without refuse. The page separately reports 70% total refuse; do not infer shell-on mass, yield, or a reusable count conversion.",
    "sourceQuantity": { "amount": 1, "unit": "medium blue mussel" },
    "observedMassG": 16.0,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S01",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02"
    ]
  },
  {
    "observationId": "blue-mussel-raw-cnf2015-one-large-r823-20261019",
    "relationship": "count_weight",
    "value": 20.0,
    "valueUnit": "g",
    "foodDescription": "Mollusks, mussel, blue, raw / Mollusques, moule, bleue, crue (CNF 2015 Food Code 3115).",
    "foodState": "Raw blue mussel as named by CNF 2015 Food Code 3115; edible portion without refuse under the CNF 2015 Users' Guide.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1 large = 20.0 g. It provides no size cutoff or weighing protocol.",
    "quantityBasis": "Food-code-specific published edible count portion without refuse. The page separately reports 70% total refuse; do not infer shell-on mass, yield, or a reusable count conversion.",
    "sourceQuantity": { "amount": 1, "unit": "large blue mussel" },
    "observedMassG": 20.0,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S01",
      "WP04-SECTIONP-BLUE-MUSSEL-CNF-PORTIONS-R823-20261019-S02"
    ]
  }
]
```

Add one `accepted` measurement decision citing S01 and S02. State that these are five historical, edible-portion observations for CNF 2015 Food Code 3115 only; that the refuse field is separate and does not establish shell-on mass or yield; and that CNF 2026 row contents remain unverified. Set only `measurementState` to `researched_supported`. Preserve `identityState: verified` and `substitutionResearchState: not_yet_researched`. Add no active form, density, unit mapping, recipe link, yield, conversion, alias, substitution finding, or substitution rule.

## Catalog ownership and picker/subphrase audit

The current package contains **1,886 active ingredient references** and **199 forms**; the research ledger contains **2,294 records** and **10,774 source entries**. The active blue-mussel row has no form, measurement observation, or active numeric behavior. The exact CNF 2015 page URL is not owned by another ledger record. The 2015 Users' Guide URL is cited by six other records, including the recent calamari and Eastern-oyster reviews; S02 is therefore record-specific. Proposed R823 source IDs and five observation IDs were not found in the live ledger or the focused Section P proposal/batch archive.

`IngredientSearch.kt` prefers complete normalized word phrases and allows a query phrase inside a longer indexed term before falling back to substring matching. The following projection applies that current phrase-first behavior to active catalog names, aliases, and forms. This proposal changes ledger evidence only, so every result remains the same after the proposed delta.

| Query | Current and projected active results | Search note |
|---|---|---|
| `mussel` | 4: blue mussel; frozen cooked mussel meat; green-lipped mussel; Mediterranean mussel. | Broad English subphrase appears inside several longer active names. |
| `mussels` | 5: blue mussel; Mediterranean mussel; mussels in brine; canned mussels in escabeche; smoked mussels. | Plural query remains a multi-choice search. |
| `moule` | 4: blue mussel; frozen cooked mussel meat; green-lipped mussel; Mediterranean mussel. | Broad Québec-French subphrase also finds longer French names. |
| `moules` | 5: blue mussel; Mediterranean mussel; mussels in brine; canned mussels in escabeche; smoked mussels. | Plural French search remains a multi-choice search. |
| `blue mussel`; `blue mussels` | `ingredient-ref-blue-mussel` only. | Existing species-qualified display/alias remains unique. |
| `mussel meat` | Frozen cooked mussel meat only. | Phrase match occurs within a longer name; it stays owned by the cooked/frozen meat product, not blue mussel. |
| `moule bleue`; `moules bleues` | `ingredient-ref-blue-mussel` only. | Existing species-qualified aliases remain unique. |
| `raw mussel`; `Mytilus edulis`; `shellfish` | No active result. | No ledger observation creates search terms; this proposal adds no aliases. |

The generic `ingredient-ref-mussel` hold remains unresolved. The current broad English and French queries already return several active mussel identities/products. No catalog row or form is added, so R823 creates no new singleton and changes no picker projection.

## Recipe demand and substitutions

The package manifest lists **114 recipe files** with **1,123 ingredient rows**. A read-only scan of every manifest-listed row found **zero** occurrences of mussel/moule wording, *Mytilus edulis*, or a link to `ingredient-ref-blue-mussel`. Some French recipe instructions use `moules` to mean baking molds; those are equipment mentions, not shellfish ingredient demand. No bundled recipe requests a blue-mussel quantity, form, or count. The measurements are useful only as traceable evidence attached to an already accepted species identity and may support later evidence review; they do not address an active bundled recipe gap.

The CNF portions do not provide substitution evidence. Keep `substitutionResearchState: not_yet_researched`, add no substitution finding or global/contextual rule, and do not infer that fresh blue mussel can replace the frozen cooked meat, smoked mussels, mussels in brine, escabeche, other mussel species, or any recipe ingredient.

## Source register and limits

| Source | Evidence used | Limits and ownership |
|---|---|---|
| Health Canada, [CNF 2015 Food Code 3115 serving size](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3115) | Bilingual raw blue-mussel name; 100 mL = 63.4 g; 250 mL = 158.5 g; 1 small = 10.0 g; 1 medium = 16.0 g; 1 large = 20.0 g; 70% total refuse; page detail date 2019-03-01. | Food-specific historical page; no shell-on portion interpretation, size thresholds, or volume/weight protocol. Exact URL currently has no ledger owner. |
| Health Canada, [CNF Users' Guide (2015)](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html) | Section C explains that portions have generic food-specific weights and are edible material without refuse. | General interpretation source, not mussel-specific and not a CNF 2026 check. URL is already used on six ledger records; attach it with the unique R823 S02 ID. |
| OQLF, [moule (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198877/moule) | Existing identity source pairs preferred Québec `moule`, English `blue mussel`, and *Mytilus edulis*. | Last updated 2012; it supports identity and labels, not CNF weights. Already owned by this ledger record; no duplicate source is proposed. |
| Fisheries and Oceans Canada, [Identifying bivalve shellfish](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm) | Existing species context says the single mussel species harvested in Canada is blue mussel (*Mytilus edulis*). | Modified 2021-06-09; supports species identity, not all imported or recipe uses and not CNF weights. Already owned by this ledger record. |
| Health Canada, [CNF 2026 overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), and [Open Government CNF 2026 dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) | Establish current relational-file release and availability of Food Name and Measure Weight Conversion resources; the indexed dataset record was updated 2026-10-04. | Context only. The dataset page returned 403 and the direct CSV links were not accessible through the available reader, so no row-level 2026 code or value is asserted. Direct row inspection remains open. |

## Static review and testing disposition

- Read the current open WP04 Section P checklist, relevant R811/R814/R817/R820 proposals, the integrated blue-mussel identity review, current workflow materials, the active reference and form files, ledger record, manifest, recipe rows, and `IngredientSearch.kt`.
- Parsed current catalog, ledger, manifest, and recipe JSON read-only. Confirmed 1,886 references, 199 forms, 2,294 ledger records, 10,774 sources, verified blue-mussel identity, zero existing measurements/substitution findings, no attached form, null density, empty unit mappings, and no R823 ID collisions.
- Reproduced the current picker phrase-first projection for broad and qualified English/French mussel queries, including `mussel meat` inside the longer cooked-product term. A ledger-only proposal has no picker effect.
- Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows; found no blue-mussel, generic mussel/moule, *Mytilus edulis*, or direct reference-link demand.
- No shared catalog or ledger edit, app test, build, emulator run, or deployment was performed. The current [`AGENTS.md`](../../../AGENTS.md) says testing is unnecessary when the eventual change only adds database JSON data; static data validation is sufficient for such an integration.

## Recommendation

Accept five source-specific historical observations on the existing `ingredient-ref-blue-mussel` ledger row: 100 mL = 63.4 g, 250 mL = 158.5 g, one small = 10.0 g, one medium = 16.0 g, and one large = 20.0 g, all for CNF 2015 Food Code 3115. Treat every value as an edible portion without refuse. Keep the 70% refuse figure separate, make no shell-on or yield inference, and leave direct CNF 2026 row inspection open. Preserve the existing blue-mussel labels and aliases, generic mussel hold, forms, active numeric behavior, recipes, and substitution research state.
