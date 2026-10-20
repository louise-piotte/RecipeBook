# WP03 Section F R589 — CNF 2026 quick-oats Food Code 1439 access recheck (2026-10-17)

- **Status:** Integrated as a documentation-only access hold; no catalog or ledger data changed. See the [R589 integration README](../batches/wp03-r589-quick-oats-cnf2026-access-hold-integration-20261017/README.md).
- **Recommendation:** Evidence-only hold. The current official listing confirms that CNF 2026 relational files are published, but their four row files could not be read through the available browser tool. Make no Food Code 1439 presence/absence, name, measure, or value claim for CNF 2026. Keep this row-level gap open and leave the catalog and ledger unchanged.
- **Bounded scope:** Recheck only the unresolved CNF 2026 row join for Food Code 1439, the existing Quaker quick-oats food. This does not revisit R586’s Nature’s Path Superseeds & Grains product or R573’s already-integrated branded serving.

## Exact open plan anchor

The open Section F parent is [Dry versus cooked forms for remaining grains](../../RecipeBook-global-ingredient-catalog-plan.txt#L4405), which says generic rice, quinoa, and oat-bran forms are integrated and that cooking yield is separate. The code-specific residual is called out under the completed R573 item at [plan line 4475](../../RecipeBook-global-ingredient-catalog-plan.txt#L4484): the CNF 2026 Food Code 1439 join remains open. The broader regional cereal and preprocessed-grain review also remains open at [line 14940](../../RecipeBook-global-ingredient-catalog-plan.txt#L14968).

R589 addresses only the Food Code 1439 evidence gap beneath the dry/cooked parent. It neither closes the parent nor changes the broader Section F cereal-mix checklist.

## Current catalog and ledger state

The live identity is `ingredient-ref-quick-oats`, category `GRAIN_AND_CEREAL`, displayed as `quick oats / flocons d'avoine à cuisson rapide`. Its aliases are `quick-cooking oats` and `avoine à cuisson rapide`; it has no attached form, no default density, and no active unit mappings. The [live reference](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L16834) and the [quick-oats ledger record](../research-ledger.v1.json#L124875) were inspected.

R573 already records Quaker Canada’s bilingual 1/3-cup (30 g) label serving as one branded, dry-product portion observation. Its ledger state remains `measurementState: blocked_pending_evidence`; the observation is not a generic quick-oats cup conversion. The 2015 page’s `amount to make 175 mL cooked` entry remains uninterpreted and is not an app yield. Reuse the existing [R573 proposal](wp03-section-f-next-gap-review-r573-20261017.md) and its owned source IDs for those historical and branded claims; do not repeat them as R589 evidence.

## Current primary-source recheck

Health Canada’s [Canadian Nutrient File, 2026 listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) lists the Food Name, Measure Weight Conversion, Measure Name, and Measure Type CSV resources. The listing metadata was modified 2026-10-04. This confirms the current resource inventory, but does not establish which food codes or measures occur in the files.

The four direct Health Canada resource URLs were opened again on 2026-10-17. The browser tool returned `URL ... is not accessible via this tool` for each file, so no CSV row could be inspected or joined:

| Proposal-local audit ID | Direct official resource | R589 result |
| --- | --- | --- |
| `WP03-QUICK-OATS-CNF2026-1439-R589-S01` | [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | Resource is listed; content could not be read. |
| `WP03-QUICK-OATS-CNF2026-1439-R589-S02` | [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | Resource is listed; content could not be read. |
| `WP03-QUICK-OATS-CNF2026-1439-R589-S03` | [Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv) | Resource is listed; content could not be read. |
| `WP03-QUICK-OATS-CNF2026-1439-R589-S04` | [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) | Resource is listed; content could not be read. |

These R589 labels are proposal-local access-attempt IDs only; they are not claims that a row was read and are not proposed ledger writes. Health Canada’s [CNF search page](https://food-nutrition.canada.ca/cnf-fce/newNutrientSearch) explicitly says its searchable interface contains the 2015 publication and will not be updated while a more user-friendly CNF 2026 route is developed. The [Food Code 1439 serving page](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=1439&wbdisable=true), already owned as `WP03-QUICK-OATS-CNF1439-R573-S03`, is likewise the 2015 page (modified 2019-03-01), not a 2026 substitute.

Do not infer that Food Code 1439 survives, was removed, or has any particular name or portion in CNF 2026. A future row-level review must join Food Name to Measure Weight Conversion and then join each measure code to Measure Name and Measure Type for the exact code, retaining row dates and distinguishing volume portions from mass-only, refuse, and type-9 amount-to-make/yield entries. No such join was possible here.

## FR-CA wording and picker effect

No French display or alias change is proposed. Keep the catalog’s existing `flocons d'avoine à cuisson rapide / avoine à cuisson rapide`; the R573 review cites TERMIUM, OQLF, and Canadian French product-label evidence for this qualified wording. Do not promote Quaker’s product title `Gruau Quaker Rapide`, bare `gruau`, or a CNF source description into aliases.

The phrase-first picker searches the existing bilingual display names and aliases, with forms included only when present. The quick-oats entry has no form. Since R589 proposes no catalog-term or form change, exact English and French quick-oats queries and all broader queries keep their present results; no picker effect is expected.

## Forms, measurements, substitutions, and recipe demand

No dry or cooked form is proposed. The old CNF `amount to make` entry does not establish a preparation form or cooking yield. Leave the current null density, empty mappings, blocked measurement state, and `not_yet_researched` substitution state unchanged; add no conversion, yield, or substitution.

I scanned the full manifest-listed bundled corpus: 114 recipe files and 1,123 structured ingredient rows. Exactly two rows point to `ingredient-ref-quick-oats`: recipe `024#6` uses `175 g quick oats`, and recipe `047#4` uses `1 1/2 cups quick oats`. Neither line specifies Quaker. The branded R573 1/3-cup observation cannot be used to alter the generic recipe volumes or amounts. No additional cooked-oatmeal line or quick-oats form demand was found.

## Source ownership and ID collision audit

- Reuse `WP03-QUICK-OATS-CNF1439-R573-S03` only for the existing CNF 2015 Food Code 1439 page. Reuse the existing generic dataset-listing source `WP03-SECTION-F-R310-20261016-S04` only for the fact that the official listing names the relational files; its current owners are the dry-millet and dry-pearl-barley records.
- The four 2026 CSV URLs already occur in the ledger under distinct, Food-Code-scoped IDs for other foods, including R541’s rice/quinoa rows and R547/R559/R562 cereal rows. Do not reuse those row-specific source IDs for Food Code 1439. The R589 S01–S04 access labels are new in the proposal/batch archive and the ledger, but are not proposed as ledger source IDs because no file contents were obtained.
- No ingredient-reference ID, form ID, measurement-observation ID, alias, or active measure is proposed. R589 adds no source record or numeric datum to the shared ledger.

## Validation performed

- Confirmed the live open parent at plan line 4384, the explicit residual at line 4463, and the broader Section F checklist at line 14904.
- Inspected the quick-oats reference, ledger record, form file, substitutions, R573 proposal, and source ownership for the official CNF resource URLs.
- Re-opened the official CNF 2026 listing and attempted all four listed CSV URLs on 2026-10-17. Only the resource inventory was readable; the four CSV contents were inaccessible through the browser tool.
- The coordinator retried the four direct CSV requests in memory from the workspace; DNS resolution failed for all four. The official resource page returned 403 or was unavailable through the browser, so no row-level result could be established.
- Scanned all 114 manifest recipe files and 1,123 structured ingredient rows; found the two linked rows reported above.
- Checked the R589 proposal-local ID prefix against the proposal, batch, and research-ledger archive; no collision was found.
- Updated the open row-review checklist, roadmap, and this proposal/README to record the access hold. No shared catalog or ledger data changed. No software tests, build, emulator run, or deployment was run.
