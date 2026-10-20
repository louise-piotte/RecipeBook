# WP04 Section P R826 — generic scallop CNF portion review

- **Review date:** 2026-10-19.
- **Candidate:** Historical Health Canada Canadian Nutrient File (CNF) 2015 count portions for the existing species-unspecified `ingredient-ref-scallop` identity.
- **Recommendation:** Record two code- and edition-scoped `published_portion` observations for raw mixed-species scallop in CNF 2015 Food Code 3213: one small = 6.0 g and one large = 15.0 g. Set only this ledger record's `measurementState` to `researched_supported`. Leave current CNF 2026 row verification open.
- **Write scope:** This proposal only. No shared catalog, ledger, recipe, plan, roadmap, workflow, or generated file was changed.

## Open Section P work and prior-work boundary

The live plan keeps the parent **“Mussel, clam, oyster, cockle, and remaining shellfish identities; scallop is integrated below”** open at [line 8170](../../RecipeBook-global-ingredient-catalog-plan.txt#L8188). Its generic scallop identity decision was accepted in 2026-10-12 as a species-unspecified marketed adductor-muscle ingredient, with no measurements. R826 addresses that distinct ledger evidence gap; it does not add a scallop identity or revisit a product boundary.

Recent work through R823 is separate: R811 held Iceland cockle outside the picker, R814 added canned-crab label portions, R817 recorded Eastern-oyster CNF portions, R820 recorded one raw mixed-species squid count, and R823 recorded raw blue-mussel CNF portions. Other existing scallop reviews cover the generic identity, named species, supplier-specific portions, dried scallop, and detached roe. None records CNF Food Code 3213 or a generic raw scallop count weight. R826 does not repeat any of those decisions.

## Existing identity, labels, and evidence dimensions

| Item | Current state | R826 scope |
|---|---|---|
| `ingredient-ref-scallop` | Active `PROTEIN` identity: `scallop / pétoncle`; aliases `scallops`, `scallop meat`, and `pétoncles`; species unspecified. | Preserve the display and aliases. Add no CNF alias or taxon. |
| Québec terminology | The existing OQLF source [pétoncle (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199062/petoncle) supports preferred Québec `pétoncle`, English `scallop` / `scallop meat`, and the marketed adductor-muscle scope. OQLF warns against `coquille Saint-Jacques`, which it assigns to European species. | Reuse this source already owned by the ledger record. Do not add CNF's parenthetical `coquille St Jacques` wording as a display or alias. |
| Species boundary | DFO's [Identifying bivalve shellfish](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm) lists multiple harvested scallop species in Canada. Existing CFIA and OQLF sources also distinguish the general marketed category from named scallop taxa. | Treat CNF's `mixed species` row as source-specific generic evidence only. Do not attach it to sea, Icelandic, bay, or Hokkaido scallop, and do not imply species interchangeability. |
| Forms and active numeric fields | No form is attached to `ingredient-ref-scallop`; `defaultDensity` is null and `unitMappings` is empty. | Add no raw form, active measure, density, count mapping, or conversion. |
| Ledger record | `identityState: verified`; `measurementState: not_yet_researched`; `substitutionResearchState: not_yet_researched`; zero measurement observations and zero substitution findings. | Add only the two historical observations, two new food-composition source entries, and one accepted measurement decision. Change only `measurementState` to `researched_supported`. |
| Neighboring identities | Dried scallop, sea scallop, Icelandic scallop, bay scallop, and Hokkaido scallop are separate active records. Scallop roe remains a separate boundary; the generic identity excludes whole animals and attached roe. | Keep all neighboring rows and the generic roe boundary unchanged. Do not infer whether CNF's raw food entry includes attached roe; retain that source-detail gap in the observation limit. |

## CNF 2015 Food Code 3213 evidence and limits

Health Canada's [CNF 2015 serving-size page, Food Code 3213](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3213) names **“Mollusks, scallop, mixed species, raw”** and **“Mollusques, pétoncle (coquille St Jacques), espèces diverses, cru.”** The available portions are:

| Source portion | Published mass | R826 treatment |
|---|---:|---|
| 1 small | 6.0 g | One code-specific `count_weight` observation. |
| 1 large | 15.0 g | Separate code-specific `count_weight` observation. |

The page also lists a 100 g edible-portion baseline and a 90 g food-guide serving; neither is a household count measure and neither is proposed as an observation. The page's `Refuse` field contains no value. Do not interpret a blank field as 0%, infer a whole-scallop or shell-on mass, or calculate a yield. CNF's [2015 Users' Guide, section C](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html) says the listed conversion weights are generic weights for described portions and are weights of edible material without refuse. Thus these are historical edible-portion counts for the mixed-species raw food-code row, not weights of whole scallops as purchased. The serving page provides no size cutoff for “small” or “large,” no weighing protocol, and no statement about whether attached roe is included.

The English CNF description directly identifies the food as mixed-species raw scallop; the existing OQLF and DFO identity sources support the generic `scallop / pétoncle` crosswalk without assigning a taxon. The French page's parenthetical `coquille St Jacques` is source wording only. Preserve `pétoncle` as the Québec display and do not use that parenthetical as an alias, since OQLF assigns the discouraged term to specified European taxa. Do not use either CNF weight as a clean adductor-only or roe-inclusive guarantee beyond the source's stated edible-portion basis.

## Current CNF 2026 access limit

Health Canada's [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says the 2026 CNF is published as relational CSV files and the 2015 online search remains available as an interim access route while a more user-friendly 2026 viewer is developed. The [Open Government CNF 2026 listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) lists Food Name and Measure Weight Conversion resources. The current [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) and [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) were not accessible through the available web reader. No CNF 2026 row-level claim is made: this proposal does not claim Food Code 3213 continues, disappears, or carries forward the 2015 portions. Keep direct 2026 row inspection open as a separate follow-up.

## Exact proposed ledger delta

Append two sources to the existing `ingredient-ref-scallop` ledger record. The exact CNF 2015 serving-page URL has no ledger owner. The 2015 Users' Guide URL is already cited by seven other records, including the R817, R820, and R823 reviews; use a new record-specific source ID for this record.

```json
[
  {
    "sourceId": "WP04-SECTIONP-SCALLOP-CNF-PORTIONS-R826-20261019-S01",
    "url": "https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3213",
    "title": "Health Canada, Canadian Nutrient File 2015 serving size, Food Code 3213",
    "versionOrDate": "CNF 2015; page details modified 2019-03-01",
    "accessedOn": "2026-10-19",
    "locator": "Bilingual food names; Food Code 3213; available serving sizes 1 small = 6.0 g and 1 large = 15.0 g; 100 g edible-portion baseline and 90 g food-guide serving also shown; refuse field blank.",
    "supports": "Publishes two source-specific edible count portions for raw, mixed-species scallop in CNF 2015 Food Code 3213. The page does not define size categories, weighing protocol, or roe state, and shows no refuse value.",
    "sourceKind": "food_composition"
  },
  {
    "sourceId": "WP04-SECTIONP-SCALLOP-CNF-PORTIONS-R826-20261019-S02",
    "url": "https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html",
    "title": "Health Canada, Canadian Nutrient File — Users Guide",
    "versionOrDate": "2015",
    "accessedOn": "2026-10-19",
    "locator": "Section C, Conversion factor file, Portion size conversion factors; described generic portions and edible material without refuse.",
    "supports": "Explains that CNF portion weights are generic weights for described food-specific portions and are edible material without refuse. It is the 2015 guide and does not verify CNF 2026 rows.",
    "sourceKind": "food_composition"
  }
]
```

Append the following two observations with `evidenceKind: published_portion`, `valueUnit: g`, `value` equal to `observedMassG`, no `ingredientFormId`, and both new source IDs. The source quantity preserves the page's one-item size label within the Food Code 3213 food context.

```json
[
  {
    "observationId": "scallop-raw-cnf2015-one-small-r826-20261019",
    "relationship": "count_weight",
    "value": 6.0,
    "valueUnit": "g",
    "foodDescription": "Mollusks, scallop, mixed species, raw / Mollusques, pétoncle (coquille St Jacques), espèces diverses, cru (CNF 2015 Food Code 3213).",
    "foodState": "Raw, mixed-species scallop as named by CNF 2015 Food Code 3213; edible portion without refuse under the CNF 2015 Users' Guide. The page does not state whether attached roe is included.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1 small = 6.0 g. It gives no size cutoff or weighing protocol.",
    "quantityBasis": "Food-code-specific published edible count portion. The page shows no refuse value; do not infer 0% refuse, whole-animal mass, roe inclusion/exclusion, yield, or a reusable count conversion.",
    "sourceQuantity": { "amount": 1, "unit": "small scallop" },
    "observedMassG": 6.0,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-SCALLOP-CNF-PORTIONS-R826-20261019-S01",
      "WP04-SECTIONP-SCALLOP-CNF-PORTIONS-R826-20261019-S02"
    ]
  },
  {
    "observationId": "scallop-raw-cnf2015-one-large-r826-20261019",
    "relationship": "count_weight",
    "value": 15.0,
    "valueUnit": "g",
    "foodDescription": "Mollusks, scallop, mixed species, raw / Mollusques, pétoncle (coquille St Jacques), espèces diverses, cru (CNF 2015 Food Code 3213).",
    "foodState": "Raw, mixed-species scallop as named by CNF 2015 Food Code 3213; edible portion without refuse under the CNF 2015 Users' Guide. The page does not state whether attached roe is included.",
    "measurementMethod": "The CNF 2015 serving-size page lists 1 large = 15.0 g. It gives no size cutoff or weighing protocol.",
    "quantityBasis": "Food-code-specific published edible count portion. The page shows no refuse value; do not infer 0% refuse, whole-animal mass, roe inclusion/exclusion, yield, or a reusable count conversion.",
    "sourceQuantity": { "amount": 1, "unit": "large scallop" },
    "observedMassG": 15.0,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP04-SECTIONP-SCALLOP-CNF-PORTIONS-R826-20261019-S01",
      "WP04-SECTIONP-SCALLOP-CNF-PORTIONS-R826-20261019-S02"
    ]
  }
]
```

Add one `accepted` measurement decision citing S01 and S02. State that the two values are historical, edible-portion observations for raw mixed-species CNF 2015 Food Code 3213 only; the page's blank refuse field is not zero and supplies no yield; size cutoffs, weighing method, and roe state remain unspecified; and CNF 2026 rows remain unverified. Set only `measurementState` to `researched_supported`. Preserve `identityState: verified` and `substitutionResearchState: not_yet_researched`. Do not add or edit a catalog row, form, recipe link, active measure, density, unit mapping, conversion, yield, alias, substitution finding, or rule.

## Catalog ownership and picker projection

The current bundled catalog contains **1,886 active references** and **199 forms**; the ledger contains **2,294 records** and **10,774 source entries**. `ingredient-ref-scallop` has no attached forms, active numeric values, or measurements. The CNF 2015 serving-page URL is unowned in the ledger. The Users' Guide URL is already owned by seven other records; the new S02 is scoped to this generic scallop record. Both proposed source IDs and both observation IDs are absent from the live ledger and focused Section P proposal/batch archive.

`IngredientSearch.kt` prefers complete normalized word phrases within longer indexed terms before falling back to substring matching. The current projection below includes broad and subphrase queries over reference names, aliases, and attached forms. Since R826 changes ledger evidence only, the projected results remain identical.

| Query | Current and projected results | Search note |
|---|---|---|
| `scallop` | 6: bay scallop; dried scallop; Hokkaido scallop; Icelandic scallop; generic scallop; sea scallop. | The shared singular word matches inside species-specific and dried names; it is already multiple-choice. |
| `scallops` | Same six references. | Plural aliases preserve the same broad choice set. |
| `pétoncle`; `pétoncles` | Same six references. | Broad Québec-French queries remain multiple-choice across species and dried product. |
| `scallop meat` | Generic `ingredient-ref-scallop` only. | Existing exact alias is unchanged. |
| `sea scallop` | `ingredient-ref-sea-scallop` only. | Existing species-qualified display remains separately owned. |
| `small scallop`; `large scallop`; `raw scallop`; `mixed species scallop` | No active result. | Ledger portions add no search terms or form hints. |
| `coquille Saint-Jacques` | No active result. | Do not add CNF's parenthetical French source wording as an alias; OQLF reserves it for specified European taxa. |

The generic scallop identity is already active and does not create a singleton for broad scallop or pétoncle searches. This evidence-only proposal does not change picker behavior or expose count weights as active recipe measures.

## Recipe demand and substitutions

The package manifest lists **114 recipe files** with **1,123 ingredient rows**. A read-only scan of every manifest-listed ingredient row and reference link found **zero** occurrences of scallop/pétoncle wording or `ingredient-ref-scallop`. A full recipe text scan also found no scallop mentions. Thus no bundled recipe currently requests a generic scallop count, form, or quantity. The source evidence is retained on the catalog ledger as a separate completeness dimension; it does not fill an active recipe need and must not create a recipe link.

The CNF portion rows are not substitution evidence. Preserve `substitutionResearchState: not_yet_researched`, add no finding or rule, and do not infer substitution between generic scallop, named species, dried scallop/conpoy, smoked products, breaded scallops, or roe-bearing preparations.

## Source register and limits

| Source | Evidence used | Limits and ownership |
|---|---|---|
| Health Canada, [CNF 2015 Food Code 3213 serving size](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3213) | Raw mixed-species scallop bilingual name; 1 small = 6.0 g; 1 large = 15.0 g; 100 g edible-portion baseline; 90 g food-guide serving; page details modified 2019-03-01. | Historical, code-specific page; no size thresholds, weighing method, roe state, or refuse value. Exact URL is unowned in the ledger. |
| Health Canada, [CNF Users' Guide (2015)](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html) | Section C says weights are generic weights of described portions and are for edible material without refuse. | General interpretation source, not scallop-specific and not a CNF 2026 check. URL is already cited by seven ledger records; use the new R826 S02 source ID. |
| OQLF, [pétoncle (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199062/petoncle) | Existing source supports Québec `pétoncle`, English `scallop` / `scallop meat`, and the marketed adductor-muscle boundary; it notes the whole animal is not the consumer product and discourages `coquille Saint-Jacques` for Québec use. | Last updated 1998; terminology and market-part evidence only, not the CNF weight. Already owned by this ledger row. |
| Fisheries and Oceans Canada, [Identifying bivalve shellfish](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm) | Existing source lists several harvested scallop taxa, supporting the generic/mixed-species boundary. | Modified 2021-06-09; species list only, not a count measure. Already owned by the ledger. |
| Health Canada, [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), and [Open Government CNF 2026 dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) | Establishes the current relational-file release and lists the Food Name and Measure Weight Conversion resources. | The direct current CSV links were inaccessible in the available reader; no Food Code 3213 row-level 2026 result is claimed. Keep current-row inspection open. |

## Static review and testing disposition

- Read the current Section P checklist, R823, prior generic scallop and named-species reviews, the catalog workflow, current reference/form/ledger rows, the manifest and recipe files, and `IngredientSearch.kt`.
- Parsed current catalog, form, ledger, and manifest JSON read-only. Confirmed the generic scallop identity, 0 attached forms, null density, empty mappings, zero existing measurement/substitution findings on its ledger record, and no collisions for proposed IDs.
- Reproduced the current phrase-first picker projection for broad English/French, species-qualified subphrase, and absent raw/count queries. A ledger-only addition has no picker effect.
- Scanned all 114 manifest-listed recipes and 1,123 ingredient rows; found no scallop ingredient, linked reference, or recipe-text demand.
- No catalog or ledger changes, app tests, build, emulator run, or deployment were performed. The current [`AGENTS.md`](../../../AGENTS.md) states that software testing is unnecessary when the eventual change only adds database JSON data; static validation is sufficient for that data-only integration.

## Recommendation

Accept two historical count-weight observations on the existing `ingredient-ref-scallop` ledger record: one small raw mixed-species scallop = 6.0 g, and one large = 15.0 g, both from CNF 2015 Food Code 3213. Treat them as edible-portion evidence without refuse; do not infer zero refuse from the blank field, whole-scallop weight, attached-roe state, or a reusable conversion. Preserve the generic `scallop / pétoncle` labels, named species, detached-roe and dried-product boundaries, active catalog behavior, and substitution state. Leave direct CNF 2026 row verification open.
