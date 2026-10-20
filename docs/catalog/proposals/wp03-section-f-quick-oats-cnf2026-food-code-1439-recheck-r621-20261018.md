# WP03 Section F R621 — CNF 2026 quick-oats Food Code 1439 recheck (2026-10-18)

- **Status:** Accepted and integrated as a documentation-only evidence hold. See the [R621 integration README](../batches/wp03-r621-quick-oats-cnf2026-access-recheck-integration-20261018/README.md). No catalog, ledger, recipe, or package data changed.
- **Open plan item:** The quick-oats row join remains open beneath the Section F dry/cooked-grain review at [line 4507](../../RecipeBook-global-ingredient-catalog-plan.txt#L4516). The prior [R589 proposal](wp03-section-f-next-gap-review-r589-20261017.md) recorded the earlier access hold.
- **Recommendation:** Keep the CNF 2026 Food Code 1439 row join unresolved. Health Canada’s current listing confirms that the four relational files are published, but neither the listed CSV downloads nor the portal’s read-only table-query route returned file rows through the available browser. Make no CNF 2026 row-presence, absence, name, measure, or value claim, and leave the active catalog and ledger unchanged.
- **Bounded scope:** Recheck only the CNF 2026 Food Name, Measure Weight Conversion, Measure Name, and Measure Type joins for Food Code `1439` (quick oats). Do not revisit the accepted quick-oats identity or Quaker’s existing branded serving observation.

## Current catalog and research state

The active reference is [`ingredient-ref-quick-oats`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L16977), displayed as `quick oats / flocons d'avoine à cuisson rapide`, with `quick-cooking oats` and `avoine à cuisson rapide` as aliases. Its category remains `GRAIN_AND_CEREAL`, `defaultDensity` is null, and `unitMappings` is empty. No form is attached to this reference.

The existing [`quick-oats` research record](../research-ledger.v1.json#L126013) remains `identityState: verified`, `measurementState: blocked_pending_evidence`, and `substitutionResearchState: not_yet_researched`. R573’s Quaker Canada `1/3 cup (30 g)` manufacturer-label observation remains on that record as one branded dry-product portion. It is not a generic quick-oats cup weight or a conversion for either recipe line.

The existing Health Canada serving page for Food Code 1439 is the 2015 CNF page, already owned by R573. Its one-serving entry and the older `amount to make 175 mL cooked` text do not answer whether a 2026 row exists and do not establish a general cooking yield. The 2026 files require a new joined-row inspection.

## Recheck results and exact disposition

Health Canada’s [CNF 2026 listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) still identifies the relational Food Name, Measure Weight Conversion, Measure Name, and Measure Type CSV resources. Its catalog record is indexed as modified on 2026-10-04; the resource metadata gives the dataset update date as 2026-05-08. Those metadata dates confirm the listed release and file inventory. They are not the contents of the row files.

On 2026-10-18, I retried each official CSV URL through the web reader. Each direct download returned “not accessible via this tool.” I also checked the Open Government Portal’s official [API instructions](https://open.canada.ca/en/access-our-application-programming-interface-api), which describe CKAN read calls by GET, and attempted read-only `datastore_search` requests against the four resource IDs. The browser likewise could not retrieve those responses. This is a tool-access limitation; it does not establish that the files or API have no Food Code 1439 rows.

**Exact proposed JSON delta: none.** Keep `ingredient-ref-quick-oats` and its aliases unchanged. Add no quick-oats form, observation, source record, measure, density, mapping, conversion, cooking yield, recipe link, or substitution. Do not change the existing measurement state based on the 2015 page or the inaccessible 2026 resources. Preserve R573’s source-specific Quaker observation unchanged.

If file contents become retrievable, join Food Name rows on `Food_Code = 1439`; inspect each corresponding Measure Weight Conversion row; then resolve its measure code against Measure Name and Measure Type. Preserve the file edition and exact labels/types, and keep volume portions separate from mass-only, refuse, and type-9 amount-to-make/yield records. Do not infer absence or numeric values from the resource listing alone.

## Picker projection

No reference, alias, form, or match term changes are proposed. The phrase-first picker in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) therefore has no projected effect:

| Query | Current results | After this hold | Effect |
|---|---:|---:|---|
| `quick oats`; `quick-cooking oats` | 1; 1 | 1; 1 | Existing English identity and alias remain unchanged. |
| `flocons d'avoine à cuisson rapide`; `avoine à cuisson rapide` | 1; 1 | 1; 1 | Existing French display and alias remain unchanged. |
| `oats`; `flocons d'avoine` | 12; 4 | 12; 4 | Broad oat searches remain unchanged. |

## Recipe demand and form boundaries

The current manifest lists 114 recipe files and 1,123 structured ingredient rows. A scan by active reference ID finds two existing quick-oats rows:

| Recipe row | Stored text and amount | Relevance |
|---|---|---|
| `024#6` | `175 g quick oats` | Mass quantity; no CNF 2026 join is needed to preserve it. |
| `047#4` | `1 1/2 cups quick oats` | Volume quantity; do not convert it using Quaker’s branded portion. |

The manifest-ordered recipe corpus read for this review was 753,988 bytes, SHA-256 `1cfa3fe878669664da92964122abdd4baca348a112e89cdd41ca42590a69750e`. No new recipe demand or form link was found. The unresolved measure join does not justify adding a dry/cooked form, converting either line, or deriving a cooking yield. No source reviewed for this recheck supports a quick-oats substitution rule.

## Ownership and collision audit

The current catalog snapshot contains 1,824 ingredient references, 156 forms, 56 legacy-import identities, and 2,196 research-ledger records. The identifier `ingredient-ref-quick-oats` is already the active identity being researched; no new identity or form ID is proposed. No source ID or measurement-observation ID is proposed for the shared ledger.

The four CNF 2026 CSV URLs already have source ownership in the research ledger under other food-code-specific records (12 owners for Food Name, 13 for Measure Weight Conversion, 12 for Measure Name, and 12 for Measure Type). Existing owners include the R267 quinoa, R544/R556 pearl-barley, R547 millet, and R559/R562 oat-bran joins. The dataset-listing URL is also already cited in 21 ledger source records, including the shared R310 listing source. Do not reassign those IDs or use another food code’s row claims for Food Code 1439. The prior R589 proposal’s `...R589-S01–S04` labels are specific to that review; this proposal uses its own local audit labels below, not ledger IDs.

The official 2015 Food Code 1439 serving-page URL is already owned on the active quick-oats ledger record by `WP03-QUICK-OATS-CNF1439-R573-S03`. It is reused below only to distinguish the old page from the CNF 2026 row files. The proposed R621 local-ID prefix `WP03-QUICK-OATS-CNF2026-1439-R621-20261018-` is not present in the prior proposal/archive scan.

## Static review checks

- [x] Confirmed the current open plan item and reviewed the earlier R589 access-hold proposal.
- [x] Inspected the active quick-oats reference, attached forms, existing ledger state and observation, and legacy identity list.
- [x] Rechecked the official Health Canada CNF 2026 listing, all four direct CSV resources, the official CKAN API instructions, and read-only queries for all four resource IDs. The listing and API documentation were accessible in indexed form; no row-file/query content was retrieved.
- [x] Checked CNF resource URL ownership and kept existing food-code-specific source IDs and the R573 CNF 2015 source ID intact.
- [x] Recomputed the relevant phrase-first picker results and scanned all current manifest-listed recipe files and structured rows.
- [x] Kept forms, measures, conversions, yields, recipe links, and substitutions out of scope while the 2026 row join remains inaccessible.
- [x] Checked this proposal for UTF-8 without BOM, valid local links, and scoped whitespace.
- [x] Ran no software tests, builds, emulator checks, or deployment. This documentation-only access hold changed no shared database JSON or executable code; no software test was needed under the repository rule.

## Sources

The audit labels in this table are local to this proposal and do not represent new ledger records.

| Audit ID | Primary source and result | Limit |
|---|---|---|
| `WP03-QUICK-OATS-CNF2026-1439-R621-20261018-S01` | Health Canada, [Canadian Nutrient File, 2026 listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109). The indexed metadata lists all four relational resources and shows the record modification date as 2026-10-04. | The listing confirms the resource inventory, not Food Code 1439 row presence, absence, names, types, or values. Direct opening returned 403. |
| `WP03-QUICK-OATS-CNF2026-1439-R621-20261018-S02` | Health Canada, [Food Name CSV resource](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv). | Direct download and portal query were inaccessible through the browser; no Food Code 1439 row was read. |
| `WP03-QUICK-OATS-CNF2026-1439-R621-20261018-S03` | Health Canada, [Measure Weight Conversion CSV resource](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv). | Direct download and portal query were inaccessible through the browser; no weight-conversion row was read. |
| `WP03-QUICK-OATS-CNF2026-1439-R621-20261018-S04` | Health Canada, [Measure Name CSV resource](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv). | Direct download and portal query were inaccessible through the browser; no measure label was read. |
| `WP03-QUICK-OATS-CNF2026-1439-R621-20261018-S05` | Health Canada, [Measure Type CSV resource](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv). | Direct download and portal query were inaccessible through the browser; no measure type was read. |
| `WP03-QUICK-OATS-CNF2026-1439-R621-20261018-S06` | Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html). The official description identifies CNF as a bilingual relational database and says its 2015 search remains available while a more user-friendly 2026 access method is developed. | Does not expose the Food Code 1439 row from CNF 2026. |
| `WP03-QUICK-OATS-CNF2026-1439-R621-20261018-S07` | Open Government Portal, [API instructions](https://open.canada.ca/en/access-our-application-programming-interface-api). It documents CKAN API GET access for reading portal data. | The documented feature does not guarantee that every resource has a readable datastore; the attempted CNF table queries returned no content through this browser. |
| Existing `WP03-QUICK-OATS-CNF1439-R573-S03` | Health Canada, [CNF 2015 Food Code 1439 serving-size page](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=1439&wbdisable=true). | This is 2015 data already owned by R573; it is not a substitute for the CNF 2026 relational row join. |
