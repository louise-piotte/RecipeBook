# WP04 Proposal: Recipe 066 Serrano CNF 2026 Measure Row Review

**Review date:** 2026-10-11
**Status:** Integrated into the serrano research-ledger decision. The CNF 2026 row has no size qualifier, so the publisher's medium-pepper weight remains unresolved. No recipe or active conversion was changed.

## Question and disposition

The 2026 Health Canada Canadian Nutrient File (CNF) `Measure Weight Conversion` CSV contains entries for food code `4858`, which the same release identifies as *Pepper, serrano, raw*. Its count row is `1 pepper = 6.1 g`; the measure name is not qualified as medium, small, or large. The Kitchn's current linked recipe specifies `1 medium serrano pepper (optional)` and repeats `1 medium serrano pepper (about 1 tablespoon)` in its preparation step.

Recommend leaving the medium-serrano mass unresolved. The 2026 CNF value can be retained as an unqualified, source-specific raw pepper count observation only. Do not map it to the publisher's medium pepper, infer a weight from the tablespoon wording or chopped-volume rows, or create an `item` conversion or recipe edit.

## CNF 2026 file inspection

The official Open Government Portal lists the 2026 CNF and provides the CSV resources below. I downloaded the listed resources directly on 2026-10-11 and parsed them as CSV.

| File/resource | Exact record or key | Finding |
| --- | --- | --- |
| [`food_name.csv`](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | Data row 3,516: `Food_Code=4858` | `Food_Description_EN=Pepper, serrano, raw`; `Food_Description_FR=Piment, serrano, cru`; `USDA_NDB_Code=11977`. |
| [`measure_weight_conversion.csv`](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | Data row 19,285 (physical CSV line 19,286): `Food_Code=4858`, `Measure_Type_Code=6`, `Measure_Code=185` | `Measure_Weight_Conversion=6.1`; `Measure_Weight_Conversion_Last_Updated_Date=2000-12-20`. This is the only count-named conversion row for this food code. |
| [`measure_type.csv`](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) | `Measure_Type_Code=6` | `User-defined` / `Défini par l'utilisateur`. |
| [`measure_name.csv`](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv) | `Measure_Code=185` | `1 pepper` / `1 poivron`; it does not say “medium.” |

The conversion CSV has seven rows with `Food_Code=4858`. The other six are total refuse, stems, 100/125/250 ml chopped measures, and a 30 g measure. None labels a count as medium. This review does not use the volume measures to infer a mass. The conversion CSV retrieved for this review had SHA-256 `9d41fac4ba1471fddd25ea7e51a8352aec66de4f3c88802b0a2e02a85ebc3e6f`.

The dataset landing page is [Canadian Nutrient File, 2026](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109). Health Canada's serving-size page for the same food code also displays `1 pepper = 6.1 g` without a size qualifier, but the row above is the direct 2026-file check: [CNF serving size, food code 4858](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4858).

## Comparison with recipe 066

The bundled recipe's ingredient 4 is `1 serrano pepper, thinly sliced` (amount `1`, unit `item`), with no size qualifier. The current linked publisher page, [The Kitchn, Korean Soy-Marinated Jammy Eggs](https://www.thekitchn.com/korean-soy-marinated-eggs-recipe-23636937), was updated August 12, 2026. Its ingredients list says `1 medium serrano pepper (optional)`. Its preparation step specifies `1 medium serrano pepper (about 1 tablespoon)`. The one-tablespoon note is a volume description and supplies no mass.

The CNF measure and publisher line both concern serrano pepper, but only the publisher specifies medium. Therefore the CNF's unqualified `1 pepper = 6.1 g` does not establish the publisher's medium-pepper weight, and the local recipe line itself does not carry the publisher's size qualifier.

## Recommendation

- Keep the publisher's medium-serrano weight unresolved.
- If this check is added to the research ledger, record CNF 2026 as a source for an unqualified raw `1 pepper = 6.1 g` count observation only, with the exact codes and old row-level update date above.
- Preserve any existing USDA/CNF observations as source-specific. Do not use this row as a generic pepper measure or as the weight of a medium serrano; do not derive a mass from volume; do not edit recipe text, amount, or unit.

The ledger now records the CNF 2026 relational-row sources and the unresolved size decision. The existing USDA measurement observation remains source-specific, with its observation source ID unchanged. No recipe, active conversion, or app code was changed.
