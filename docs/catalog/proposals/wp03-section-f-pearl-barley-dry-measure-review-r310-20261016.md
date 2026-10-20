# WP03 Section F — pearl-barley dry-form measurement review (R310, 2026-10-16)

## Review record

- **Status:** Proposal only. This file is the only requested change; shared catalog, ledger, package, plan, roadmap, recipe, and generated files remain untouched.
- **Scope:** Published portion evidence for the existing `ingredient-form-pearl-barley-dry` only. No new form, identity, or recipe measurement is proposed.
- **Exact open checklist item:** [Section F, dry/cooked forms for remaining grains](../../RecipeBook-global-ingredient-catalog-plan.txt#L3907): “Dry versus cooked forms for remaining grains where recipes or measurements need them; generic rice, quinoa, and oat bran forms are integrated. Cooking yield is a separate quantity relation.” The nested pearl-barley form addition is checked at [plan lines 3924–3931](../../RecipeBook-global-ingredient-catalog-plan.txt#L3933); it explicitly leaves measurement review open pending CNF 2026 row inspection. The parent checklist item remains open.
- **Recommendation:** Add two CNF 2015 Food Code 4411 entries as edition-specific `portion_weight` observations on the existing dry form and set its ledger `measurementState` to `researched_supported` for those reported portions only. Keep the CNF 2026 row review open. Do not add the page's “amount to make 125ml” field as a portion or yield observation.

## Current package and ledger state

The current package has 1,671 ingredient references and 127 forms. The existing [`ingredient-ref-pearl-barley`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) is `pearl barley / orge perlé`, with the English alias `jau`, category `GRAIN_AND_CEREAL`, `defaultDensity: null`, and `unitMappings: []`.

The existing [`ingredient-form-pearl-barley-dry`](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) is attached to that reference with code/state `dry`, labels `pearl barley, dry / orge perlé, sec`, empty French and English match-term arrays, and `densityGPerMl: null`. The sibling cooked form is also attached, has no match terms and null density, and is outside this form-specific observation proposal.

The dry-form [`research-ledger record`](../research-ledger.v1.json) is identity-verified, with `measurementState: not_yet_researched`, `substitutionResearchState: not_yet_researched`, one existing source/decision for the bilingual dry-state label, and no `measurementObservations`. Leave that existing R27 source's label-only scope unchanged; use a new proposal-local source key for the numeric portion evidence. The [`package-yields`](../../../app/src/main/assets/seed/bundled-library/package-yields.v1.json) file has no pearl-barley row. No pearl-barley conversion or substitution rule is present.

The prior [R27 form proposal](wp03-section-f-pearl-barley-dry-cooked-form-review-R27-20261013.md) and [integration README](../batches/wp02-wp03-wp04-round27-gap-review-integration-20261013/README.md) left CNF 2015 page portions out of the ledger pending CNF 2026 row inspection. This review proposes recording the accessible historical portions separately while preserving that newer-edition follow-up.

## CNF 2015 evidence and exact observations

Health Canada's accessible [CNF serving-size page for pearled barley, dry, Food Code 4411](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4411) identifies the bilingual state and reports **100 mL = 84.5 g** and **250 mL = 211.3 g**. The page is the CNF 2015 online record and its page details show a modification date of 2019-03-01. It does not state a filling or packing method.

| CNF 2015 Food Code 4411 field | Exact displayed text/value | Proposed ledger treatment |
|---|---|---|
| 100 mL portion | `100ml = 84.5 g` | Record as a source-specific `portion_weight` observation. |
| 250 mL portion | `250ml = 211.3 g` | Record as a separate source-specific `portion_weight` observation. |
| Amount to make | `amount to make 125ml = 23.8 g` | Preserve as source wording only. The page does not explain this field's preparation basis; do not encode it as a 125 mL dry portion, a recipe amount, a conversion, or a cooking-yield relation. |
| Edible-portion baseline | `100 grams of edible portion = 100 grams` | Not a kitchen portion; do not record as an observation. |
| Total refuse | `0 %` | Not portion-weight evidence; do not record as an observation. |

The 2015 Users' Guide describes CNF conversion factors as food-specific weights for described portions and warns that generic weights may differ from local products. This supports keeping these values as historical, food-code- and edition-specific observations. The page supports two exact historical volume portions; it does **not** support deriving a reusable density, extrapolating to other measures, or estimating any recipe mass.

If accepted, append only these two observations to `ingredient-form-pearl-barley-dry`:

| Observation ID | Source quantity | Published mass | Treatment |
|---|---:|---:|---|
| `pearl-barley-dry-cnf2015-100ml-portion-r310-20261016` | 100 mL | 84.5 g | CNF 2015 Food Code 4411 published portion only. |
| `pearl-barley-dry-cnf2015-250ml-portion-r310-20261016` | 250 mL | 211.3 g | CNF 2015 Food Code 4411 published portion only. |

For each, use `relationship: portion_weight`, `ingredientFormId: ingredient-form-pearl-barley-dry`, `valueUnit: g`, the reported value in `value` and `observedMassG`, the listed millilitres in `sourceQuantity` and `observedVolumeMl`, and `evidenceKind: published_portion`. Use `foodDescription: Health Canada CNF 2015, Grains, barley, pearled, dry (Food Code 4411).` State that no filling or packing method is reported and scope `quantityBasis` to a CNF 2015 published portion, not a reusable dry-barley conversion. Attach proposal-local source `WP03-SECTION-F-R310-20261016-S01`.

Do not derive mass-per-volume from either pair, interpolate a different volume, compare it with the cooked form, or calculate a dry-to-cooked ratio. The 23.8 g “amount to make” entry is not reinterpreted as a cooking yield. Keep reference/form density null, unit mappings empty, package yield absent, and all active conversions, substitutions, and recipe links unchanged. Keep `substitutionResearchState` unchanged.

The proposed `measurementState: researched_supported` means only that exact CNF 2015 published portions are documented on the dry form. It does not claim a current CNF 2026 value, an identity-wide density, a reusable conversion, or a completed Section F measurement review. This disposition follows the source-specific historical-portion treatment used in the [dry-quinoa review R303](wp03-section-f-next-gap-review-r303-20261016.md) and [cooked-rice review R307](wp03-section-f-next-gap-review-r307-20261016.md).

## CNF 2026 row access

Health Canada says the CNF 2026 release is available as relational CSV files and that the CNF 2015 online search remains available as an interim access route ([CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html)). The official [CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) lists Food Name, Measure Weight Conversion, Measure Name, and Measure Type resources.

For this review, direct browser opens of the official dataset/resource pages returned 403 or were reported inaccessible by the web tool. Direct opens of the listed [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv), [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv), and their attempted portal API routes did not provide row contents. No copies of those CSVs were found in the project tree. The search result exposes the official listing and resource links, but not row data.

Therefore this review verifies **no CNF 2026 Food Name or measure row** for pearl barley and makes no 2026 row-presence, absence, code-continuity, or value claim. This finding is limited to the access attempts above; it does not establish that the files or a relevant row are generally unavailable. Keep a follow-up open to retrieve and join the official 2026 Food Name, Measure Weight Conversion, Measure Name, and Measure Type rows before making a 2026 observation or treating the review as current-edition complete.

## Picker and recipe-corpus boundaries

The current phrase-first picker in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) searches reference labels, aliases, and attached form labels. Static term projection from the live package confirms:

| Query | Current result/form hint | This proposal's effect |
|---|---|---|
| `pearl barley` / `orge perlé` | Existing pearl-barley reference; no exact-form hint. | None. |
| `pearl barley, dry` / `orge perlé, sec` | Existing pearl-barley reference with its dry-form hint. | None. |
| `pearl barley, cooked` / `orge perlé, cuit` | Existing pearl-barley reference with its cooked-form hint. | None. |
| `barley` / `orge` | Multiple qualified barley results (18 current owners for each broad query). | No broader alias or picker term is added. |
| `jau` | The exact alias is on pearl barley; `jau atta` remains on the separate barley-flour reference and can also match the short query. | No alias ownership changes. |

The static audit parsed all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**. Searching decoded recipe JSON text for pearl/pearled barley, dry/cooked state phrases, `orge perlé` variants, and the exact token `jau` found **0 candidate recipe files, 0 matching ingredient rows, and 0 links** to the pearl-barley reference or either form. There is no bundled recipe demand or recipe mass to transfer. These are package-data projections, not live Android picker results.

## Sources and limits

| Source ID | Source and locator | Supports / does not support |
|---|---|---|
| `WP03-SECTION-F-R310-20261016-S01` | Health Canada, [CNF 2015 serving size: Grains, barley, pearled, dry, Food Code 4411](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4411), page modified 2019-03-01. | Directly supports the bilingual dry-state label and the two exact displayed volume portions, 100 mL = 84.5 g and 250 mL = 211.3 g. Also displays `amount to make 125ml = 23.8 g`; its preparation basis is not stated on the page, so this review does not classify it. No packing method, reusable conversion, or dry-to-cooked yield is established. |
| Reuse existing source `WP03-PBARLEY-FORMS-R27-20261013-S01` | Same [Food Code 4411 page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4411), already attached to the dry-form ledger record. | Keep its existing support statement scoped to the bilingual state label; do not rewrite or repurpose it for numeric observations. |
| `WP03-SECTION-F-R310-20261016-S02` | Health Canada, [Canadian Nutrient File Users' Guide (2015)](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html), “Conversion factor file.” | Describes food-specific weights of described portions and notes these generic weights may differ from local-market products. It informs interpretation of 2015 evidence, not a barley-specific conversion. |
| `WP03-SECTION-F-R310-20261016-S03` | Health Canada, [Canadian Nutrient File overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html). | Confirms CNF 2026 is published as relational CSV files and the 2015 online search remains an interim access route. Supplies no pearl-barley 2026 row values. |
| `WP03-SECTION-F-R310-20261016-S04` | Open Government Portal, [CNF 2026 Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) and [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv). | Official resource endpoints were checked, but row contents could not be opened through the available browser routes. No CNF 2026 row claim is made. The same dataset listing also names Measure Name and Measure Type files for a later join. |

## Proposed disposition

Add the two CNF 2015 Food Code 4411 volume portions as separate historical `portion_weight` observations on `ingredient-form-pearl-barley-dry`; use a new source ID for those numeric observations and set that form's ledger measurement state to `researched_supported` for those observations only. Leave the existing bilingual form and reference unchanged; add no active measures, density, mappings, conversions, package/cooking yield, substitution, or recipe link. Keep the CNF 2026 row inspection and the Section F parent checklist item open.

No software tests, builds, emulator checks, deployments, shared catalog changes, or data integration were run for this proposal-only review.
