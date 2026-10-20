# WP07 olive-oil portion gap review — R721 — 2026-10-18

- **Status:** Proposal only; no shared file was changed.
- **Candidate:** Existing `ingredient-ref-olive-oil` (`olive oil / huile d'olive`).
- **Recommendation:** Repair one misowned duplicate decision in this ledger row, then add three historical, CNF-2015-specific `portion_weight` observations. Keep `measurementState` as `blocked_pending_evidence`; add no density, unit mapping, conversion, form, recipe edit, or substitution.
- **Identifier handling:** All `R721` source/observation identifiers below are proposal-local examples. They are not shared allocations.

## Why this is a distinct WP07 gap

WP07 is `in_review`. Its open checklist still prioritizes frequently converted pantry ingredients, broader forms where evidence exists, and explicit gaps where evidence is insufficient. The live generic olive-oil reference has seven direct recipe rows, but its ledger contains no measurement observations. Recent WP07 work includes maple syrup (R293, 2026-10-16), while the more recent R659/R660 portion reviews concern WP02 flour. I found no previous WP07 olive-oil portion review in the current proposal or integration archive. This review addresses only the existing generic olive-oil identity and its measurement record; it does not reopen the WP05 oil identity decisions.

See the [WP07 plan section](../../RecipeBook-global-ingredient-catalog-plan.txt#L1271), [workflow status](../ingredient-catalog-workflow.md#L412), [latest WP07 roadmap entry](../../../roadmap.md#L1260), and prior [R293 maple-syrup proposal](wp07-maple-syrup-cnf-portion-evidence-review-r293-20261016.md).

## Live identity, ownership, and bounded ledger repair

The active reference is `ingredient-ref-olive-oil`, displayed as `olive oil / huile d'olive` in `FAT_AND_OIL`. Both alias arrays are empty; `defaultDensity` is `null`; `unitMappings` is empty. There are no olive-oil ingredient forms or global/contextual substitution rules. Keep the generic row and the separate `ingredient-ref-extra-virgin-olive-oil` identity unchanged. The earlier [WP05 Section S integration](../batches/wp05-section-s-fats-oils-integration-20261012/README.md) already retains the seven unqualified olive-oil recipe lines on the generic identity and relinks only the two lines that explicitly say extra-virgin.

The current `ingredient-ref-olive-oil` ledger record is `identityState: unreviewed`, `measurementState: blocked_pending_evidence`, and `substitutionResearchState: not_yet_researched`; it has no sources or measurement observations. Its decisions array contains:

1. The oil-owned unresolved decision that removes source-less draft density and mappings and requires exact source, food/form, unit convention, method or basis, and reviewer disposition before any value is restored.
2. An unrelated accepted evaporated-milk identity decision, including four evaporated-milk source IDs.

That second entry is an exact duplicate of the accepted decision on `ingredient-ref-evaporated-milk`; its four source IDs and supporting sources belong to the evaporated-milk row. The olive-oil record has no source entries for them. **Proposed repair:** remove only that duplicate accepted evaporated-milk decision from `ingredient-ref-olive-oil`. Preserve the olive-oil unresolved measurement decision and all other olive-oil fields. Leave `ingredient-ref-evaporated-milk`, including its decision and sources, untouched. This is a narrow ownership correction required before appending evidence to the misowned row; it does not reconsider either ingredient's decision.

Before drafting this proposal, the live reference and ledger plus prior proposal/batch archive were searched for the new source-ID prefix and exact CNF URL. No prior owner was found for `WP07-OLIVE-OIL-R721-20261018-S01` or the CNF Food Code 422 page URL. The OQLF term page URL also had no prior ledger or proposal owner. The CFIA fats-and-oils URL is already recorded as `WP05-OIL-INT-20261012-S01` on the canola-oil, extra-virgin-olive-oil, and vegetable-oil rows; reuse that existing source context rather than registering it again. Health Canada's CNF overview and 2026 measure-weight CSV also have existing source entries (`WP03-QCM-20261012-S05` and `WP03-CNF2026-QUINOA-R267-S02`, respectively); do not mint duplicate IDs for them. Before this proposal was created, the R721 prefix and proposal filename had no exact owner.

## Source findings and measurement limits

Health Canada's CNF 2015 serving-size page identifies Food Code **422** as `Vegetable oil, olive / Huile végétale, olive` and lists three available metric-volume portions:

| CNF food code and descriptor | Published source quantity | Published mass | Proposal-local observation ID |
|---|---:|---:|---|
| 422, `Vegetable oil, olive / Huile végétale, olive` | 5 mL | 4.6 g | `olive-oil-cnf422-5ml-4_6g-r721-20261018` |
| 422, same descriptor | 15 mL | 13.7 g | `olive-oil-cnf422-15ml-13_7g-r721-20261018` |
| 422, same descriptor | 100 mL | 91.3 g | `olive-oil-cnf422-100ml-91_3g-r721-20261018` |

These are the exact historical portions shown on Health Canada's [Food Code 422 serving-size page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=422) (page modified 2019-03-01). The page reports the listed volume/mass pairs but does not state a fill, leveling, pouring, temperature, or sampling method, nor does the descriptor specify an olive-oil grade. Preserve each reported pair as a source-specific `portion_weight` observation for the exact CNF descriptor. Do not combine or scale the observations, infer a density, or treat them as a general olive-oil conversion.

Health Canada's current [CNF information page](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says CNF 2026 is distributed as relational CSV files and that the online CNF 2015 remains available as an interim route. The current [CNF 2026 dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) lists a [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv), but the dataset and resource could not be retrieved through the available browser route (403/inaccessible). I did not inspect or assert the presence or absence of a 2026 olive-oil row. Treat this as an access limit, not evidence that the current row is missing.

The catalog's base units define `tbsp` as 14.78676 mL and `tsp` as 4.928922 mL; the CNF portions are explicitly 15, 5, and 100 mL. The 2015 page does not establish that its metric portions use the app's U.S. spoon convention, and no source supports interpolating these weights to the recipe-line `tbsp`/`tsp` volumes. Keep the existing unresolved measurement decision in place and `measurementState` blocked until the current CNF 2026 food-name/measure-name/measure-type join and compatible unit convention are reviewed. Leave `defaultDensity: null` and `unitMappings: []`.

For identity and product boundaries, OQLF's [GDT entry for *huile d'olive*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8413232/huile-dolive) gives the French term and English equivalent *olive oil* and describes oil from the olive fruit; the entry is dated 1987, so use it for terminology only. CFIA's current [Labelling requirements for fats and oils](https://inspection.canada.ca/en/food-labels/labelling/industry/fats-and-oils) says olive oil is obtained from olive fruit and that virgin/extra-virgin designations have their own requirements. These sources support leaving the existing bilingual generic identity and distinct extra-virgin reference as they are; neither supports a measurement. No new alias such as `cooking oil`, `virgin olive oil`, `refined olive oil`, `huile végétale`, or bare `oil`/`huile` is proposed.

## Current picker projection

I projected all 1,841 live reference names/aliases and 174 forms through the phrase-first normalization and fallback substring behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Existing aliases and forms do not need editing.

| Query | Current results | Interpretation |
|---|---|---|
| `olive oil` | `olive oil / huile d'olive`; `extra-virgin olive oil / huile d'olive vierge extra`; `octopus in olive oil / poulpe à l’huile d’olive` | Three clearly named choices; the octopus product is a contained prepared food, not another oil identity. |
| `huile d’olive` | Same three references | Accent/apostrophe folding returns the same source-name matches; each existing result keeps its grade or prepared-food qualifier. |
| `olive` | Same three references | Broad plant-word query remains multiple-choice. |
| `oil` | 32 references, including named oils and products packed in oil | Existing broad fallback is already intentionally broad; adding a bare oil alias would make it less precise. |
| `extra-virgin olive oil` / `huile d’olive vierge extra` | Only the extra-virgin reference | The qualified identity stays distinct. |

The current picker intentionally returns a food product containing olive oil for the broad `olive oil` phrase because it is named `octopus in olive oil`. This collateral result is clearly qualified and does not warrant a picker code change or an alias change for this measurement review.

## Bundled-corpus scan and target links

I parsed all **114 manifest-listed recipe files** and their **1,123 ingredient rows**, checked complete decoded recipe JSON for olive-oil wording, and checked each ingredient row's current reference ID, name, original text, quantity, and unit. The corpus contains seven direct rows for `ingredient-ref-olive-oil` across seven recipes, plus two separately linked rows that explicitly name extra-virgin olive oil. The seven generic rows provide recipe quantities but no paired mass measurement, so they do not validate a volume-to-weight mapping.

| Recipe source | Ingredient-line ID | Existing source line | Existing owner |
|---|---|---|---|
| [Preppy Kitchen — Turkey Meatballs](https://preppykitchen.com/turkey-meatballs/) | `43199cff-7fba-4cd0-8447-2c7265b0bb1c-ingredient-10` | `2 tbsp olive oil` | `ingredient-ref-olive-oil` |
| [Fit Foodie Finds — Sous Vide Ribs](https://fitfoodiefinds.com/24-hour-sous-vide-ribs/) | `a8429c9a-dcc8-4694-b09d-81c62d51af2d-ingredient-2` | `1/2 tbsp olive oil` | `ingredient-ref-olive-oil` |
| [Roxanne Cuisine — Crème de champignons](https://roxannecuisine.com/recette/creme-de-champignons/) | `6cd92702-2256-4fc5-8f41-91ca188b4fbf-ingredient-1` | `2 tbsp olive oil` | `ingredient-ref-olive-oil` |
| [Preppy Kitchen — Pizza Dough](https://preppykitchen.com/spring-pizzas/) | `14d20789-1967-432a-b9bc-0319599ffbd3-ingredient-6` | `1 tbsp olive oil` | `ingredient-ref-olive-oil` |
| [The Wholesome Dish — Shepherd’s Pie](https://www.thewholesomedish.com/the-best-classic-shepherds-pie/) | `d356eec5-b3c4-4e22-b943-63900317e569-ingredient-1` | `2 tbsp olive oil` | `ingredient-ref-olive-oil` |
| [Fox and Briar — Chicken Parmesan](https://www.foxandbriar.com/baked-chicken-parmesan-recipe/) | `c68bebce-c549-4789-a5b4-d023ed58f782-ingredient-1` | `2 tbsp olive oil` | `ingredient-ref-olive-oil` |
| [Le Coup de Grace — Sauce à pizza](https://lecoupdegrace.ca/recette/sauce-a-pizza-maison/) | `7f200ce7-8ce5-4f82-97aa-e3eccebc2fd7-ingredient-2` | `2 tsp olive oil` | `ingredient-ref-olive-oil` |

The two extra-virgin rows remain on `ingredient-ref-extra-virgin-olive-oil`: recipe 111 [Sous Vide Tuna](https://recipes.anovaculinary.com/recipe/sous-vide-tuna), `1 tbsp extra-virgin olive oil`; and recipe 113 [Tzatziki](https://cookieandkate.com/how-to-make-tzatziki/), `2 tbsp extra-virgin olive oil`. They are not reassigned or used as evidence about recipe-line portions for generic olive oil. No recipe link, row, quantity, or source text changes are proposed.

## Proposed ledger record example

This schema-valid `Record` example shows the minimum record content after the one ownership repair and the three historical observations. The olive-oil `decisions` array preserves its existing unresolved measurement decision and adds one accepted decision limited to recording historical source-specific portions; the evaporated-milk row is not modified. The single new source ID and observation IDs remain proposal-local until an integration decision assigns them.

```json
{
  "recordId": "ingredient-ref-olive-oil",
  "recordType": "ingredient_reference",
  "identityState": "unreviewed",
  "measurementState": "blocked_pending_evidence",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP07-OLIVE-OIL-R721-20261018-S01",
      "url": "https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=422",
      "title": "Health Canada, Canadian Nutrient File 2015 serving size: Vegetable oil, olive",
      "versionOrDate": "CNF 2015; serving-size page modified 2019-03-01",
      "accessedOn": "2026-10-18",
      "locator": "Food Code 422, descriptor Vegetable oil, olive / Huile végétale, olive; available serving-size list.",
      "supports": "Lists 5 mL = 4.6 g, 15 mL = 13.7 g, and 100 mL = 91.3 g as food-code-specific historical portions. The page does not state a fill or pour method; values do not establish a current CNF 2026 row or an active app conversion.",
      "sourceKind": "food_composition"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "olive-oil-cnf422-5ml-4_6g-r721-20261018",
      "relationship": "portion_weight",
      "value": 4.6,
      "valueUnit": "g",
      "foodDescription": "Health Canada CNF 2015 Food Code 422: Vegetable oil, olive / Huile végétale, olive.",
      "measurementMethod": "Published available serving-size relationship; filling and pouring method not stated.",
      "quantityBasis": "Food Code 422 and CNF 2015 edition only; no grade is identified.",
      "sourceQuantity": { "amount": 5, "unit": "mL", "unitConvention": "CNF 2015 metric millilitre as published; no cup or spoon convention or app-unit equivalence is stated." },
      "observedMassG": 4.6,
      "observedVolumeMl": 5,
      "evidenceKind": "published_portion",
      "sourceIds": ["WP07-OLIVE-OIL-R721-20261018-S01"]
    },
    {
      "observationId": "olive-oil-cnf422-15ml-13_7g-r721-20261018",
      "relationship": "portion_weight",
      "value": 13.7,
      "valueUnit": "g",
      "foodDescription": "Health Canada CNF 2015 Food Code 422: Vegetable oil, olive / Huile végétale, olive.",
      "measurementMethod": "Published available serving-size relationship; filling and pouring method not stated.",
      "quantityBasis": "Food Code 422 and CNF 2015 edition only; no grade is identified.",
      "sourceQuantity": { "amount": 15, "unit": "mL", "unitConvention": "CNF 2015 metric millilitre as published; no cup or spoon convention or app-unit equivalence is stated." },
      "observedMassG": 13.7,
      "observedVolumeMl": 15,
      "evidenceKind": "published_portion",
      "sourceIds": ["WP07-OLIVE-OIL-R721-20261018-S01"]
    },
    {
      "observationId": "olive-oil-cnf422-100ml-91_3g-r721-20261018",
      "relationship": "portion_weight",
      "value": 91.3,
      "valueUnit": "g",
      "foodDescription": "Health Canada CNF 2015 Food Code 422: Vegetable oil, olive / Huile végétale, olive.",
      "measurementMethod": "Published available serving-size relationship; filling and pouring method not stated.",
      "quantityBasis": "Food Code 422 and CNF 2015 edition only; no grade is identified.",
      "sourceQuantity": { "amount": 100, "unit": "mL", "unitConvention": "CNF 2015 metric millilitre as published; no cup or spoon convention or app-unit equivalence is stated." },
      "observedMassG": 91.3,
      "observedVolumeMl": 100,
      "evidenceKind": "published_portion",
      "sourceIds": ["WP07-OLIVE-OIL-R721-20261018-S01"]
    }
  ],
  "decisions": [
    {
      "outcome": "unresolved",
      "reason": "Removed source-less draft density and unit-mapping values from the active bundled catalog. Restore a value only with source, exact food/form, unit convention, method or basis, and reviewer disposition."
    },
    {
      "outcome": "accepted",
      "reason": "Preserve the CNF 2015 Food Code 422 available volume/mass pairs as historical source-specific portions only. Keep measurement blocked pending current CNF 2026 row review and compatible source/app unit convention; add no active density or mapping.",
      "sourceIds": ["WP07-OLIVE-OIL-R721-20261018-S01"]
    }
  ]
}
```

## Source register and limits

| Proposal reference | Source | Supports and limits | Ownership |
|---|---|---|---|
| `WP07-OLIVE-OIL-R721-20261018-S01` | Health Canada, [CNF 2015 Food Code 422 serving size](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=422). Accessed 2026-10-18. | Direct evidence for the three exact code-specific volume/mass portions only; no method, grade, or current-edition assertion. This is the only source proposed for addition to the olive-oil ledger row. | No prior exact ledger/archive URL owner or R721 ID-prefix owner was found. |
| `WP07-OLIVE-OIL-R721-20261018-S02` (proposal-only) | OQLF, [GDT: *huile d'olive*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8413232/huile-dolive), 1987. | Supports the Québec French preferred term and its English equivalent; the older classification notes are not used for thresholds or numeric evidence. | No prior ledger/archive URL owner was found; not proposed as a ledger source addition. |
| Existing `WP05-OIL-INT-20261012-S01` | CFIA, [Labelling requirements for fats and oils](https://inspection.canada.ca/en/food-labels/labelling/industry/fats-and-oils). | Supports the olive-fruit source boundary and distinct virgin/extra-virgin designations; not a measurement source. | Already owned by canola oil, extra-virgin olive oil, and vegetable oil ledger records. Reuse the exact existing source ID; add no duplicate source entry. |
| Existing `WP03-QCM-20261012-S05` | Health Canada, [Canadian Nutrient File overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html). | Establishes that CNF 2026 is the current relational-file edition and that the 2015 online interface is interim; no olive-oil row data. | Existing source ID; no duplicate entry proposed. |
| Existing `WP03-CNF2026-QUINOA-R267-S02` | Health Canada, [CNF 2026 Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv). | Identifies the current source file to check; retrieval was blocked, so no olive-oil row presence/absence claim is made. | Existing source ID and URL on other ingredient records; no duplicate entry proposed. |

## Proposed bounded disposition

Repair the duplicated evaporated-milk decision only on `ingredient-ref-olive-oil`, preserving the row's own unresolved decision and leaving `ingredient-ref-evaporated-milk` untouched. Then record the three CNF 2015 Food Code 422 portion observations on the existing olive-oil ledger record. Keep the state `blocked_pending_evidence` until the current CNF 2026 food/measure join and app/source volume convention are reviewed. Preserve the existing olive-oil and extra-virgin names, aliases, forms, and links. Leave recipe rows and all active numeric catalog fields unchanged.

Static review only: the example matches the ledger `Record`, `Source`, and `MeasurementObservation` shapes in `research-ledger.schema.json`; no package/schema files, shared ledger/catalog/checklist/roadmap/workflow files, or application code were changed. No tests, builds, emulator runs, or deployments were run for this proposal-only, database-data review.
