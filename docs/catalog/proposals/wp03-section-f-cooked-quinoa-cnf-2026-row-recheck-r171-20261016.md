# WP03 Section F — cooked quinoa CNF 2026 row recheck (R171, 2026-10-16)

**Recommendation: HOLD the measurement review; make no catalog or ledger change.** The active [Section F checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L3494) still requires inspection of the CNF 2026 Food Name and Measure Weight Conversion rows for cooked quinoa. Health Canada currently lists both relational files, but their row contents remain inaccessible in this review. The listing does not establish whether cooked quinoa is present or what measures it reports.

This is a bounded recheck of that open measurement item, following the [2026-10-13 blocked recheck](wp03-section-f-cooked-quinoa-cnf-2026-row-recheck-20261013.md) and its [integration note](../batches/wp03-section-f-cooked-quinoa-cnf-2026-blocked-review-integration-20261013/README.md). It does not reopen the R170 spelt-berries decision or the separate grain-sorghum Québec-language sign-off.

## Decision and exact delta

| Area | Recommendation |
|---|---|
| Ingredient identity | Keep `ingredient-ref-quinoa` as generic quinoa. Do not add or change an identity, alias, form, or recipe link. |
| Measurement state | Keep `ingredient-form-quinoa-cooked.measurementState` as `not_yet_researched`; leave the plan item open. |
| Numeric data | Preserve the four existing, publication-specific portion observations. Add no CNF 2026 observation, active measure, density, mapping, conversion, or cooking yield. |
| Substitutions | Add no rule or substitution finding. Keep the current substitution research state unchanged. |
| IDs and sources | Allocate no catalog, form, observation, or persistent source IDs. R171 source keys below are proposal-local only. |

Reopen the measurement decision after the official Food Name and Measure Weight Conversion contents can be retrieved and joined using the 2026 documentation. Verify the bilingual cooked-food description and all associated measure rows; record only values actually present in that edition. Do not assume the 2015 code `5917` is the 2026 join key, and keep any 2026 observations separate from the 2008 and 2015 values.

## Current ownership and identity boundary

The live [ingredient reference catalog](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) has 1,547 references. `ingredient-ref-quinoa` owns display `quinoa / quinoa`, category `GRAIN_AND_CEREAL`, and English alias `quinua`; it has null default density and no unit mappings. No legacy candidate names quinoa or quinua in the current [legacy import identities](../legacy-import-identities.v1.json) (61 candidates).

The live [form catalog](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) has 119 forms. The generic reference owns `ingredient-form-quinoa-dry` (`quinoa, dry / quinoa, sec`) and `ingredient-form-quinoa-cooked` (`quinoa, cooked / quinoa, cuit`). Both have null density and empty match-term lists. The cooked form has no established density, conversion, or cooking-yield relation. Keep color-specific red and black quinoa, quinoa flour, flakes, puffed quinoa, and other processed products separate from this generic dry/cooked identity.

The cooked form’s ledger record in the [research ledger](../research-ledger.v1.json) is `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. The record already owns `WP03-S5-COOKED-5917` (CNF 2015), `WP03-QCM-20261012-S04` (Health Canada 2008), and `WP03-QCM-20261012-S05` (Health Canada’s CNF overview). The dry form remains a separate state with no measured conversion to cooked quinoa.

### Picker projection

[IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes case, accents, and punctuation, then prefers complete word-phrase matches across reference names, aliases, and attached form labels before substring fallback. No reference term or form label changes in this proposal. The current exact `quinoa` query returns ten quinoa-named references, including generic, color-qualified, flour, flake, and puffed products. The exact phrase `quinoa cooked` filters to the generic quinoa reference, and `matchIngredientFormHint` maps that complete phrase to the cooked form. The existing recipe line is already linked to that form. This decision adds no search term or broader picker result.

## Bundled-recipe demand

The live manifest lists 114 recipe files with 1,123 ingredient rows. A complete scan of every listed file found one structured quinoa ingredient: recipe 016, ingredient 1, `2 cups cooked quinoa`, linked to `ingredient-ref-quinoa` and `ingredient-form-quinoa-cooked`. Recipe 018 mentions quinoa only in serving prose; it has no quinoa ingredient row. Preserve the recipe 016 text, quantity, unit, and links. No dry-quinoa recipe line, dry-to-cooked conversion, or recipe-specific yield is established by the current corpus.

## Numeric and substitution assessment

The current ledger retains four separate published portions for the cooked form:

| Edition and observation | Reported portion | Treatment |
|---|---:|---|
| Health Canada CNF 2015, food code 5917 | 100 mL = 78.2 g; 125 mL = 97.7 g; 250 mL = 195.5 g | Keep as three source-specific observations. The page states no packing method. |
| Health Canada, *Nutrient Value of Some Common Foods* (2008) | 125 mL = 73 g | Keep as a separate household-portion observation. |

The two 125 mL weights conflict. Do not average them or promote either publication’s portions to a reusable volume conversion, density, unit mapping, or cooking yield. The reference and both forms have no density or mapping. The live global and contextual substitution-rule files contain no quinoa rule; the ledger does not research a dry-to-cooked substitution. No numeric or substitution delta is justified while the 2026 rows are unread.

## CNF 2026 access finding

On 2026-10-16, the official Open Government record showed a **2026-10-04** modification date and listed the all-files ZIP, Food Name CSV, and Measure Weight Conversion CSV. The listing and resource metadata identify available files, not quinoa row contents. Direct browser opens of the CSV endpoints returned an access error in this check; prior 2026-10-12 and 2026-10-13 attempts recorded HTTP 403, while a local fetch in this environment failed at DNS resolution. Do not interpret these access failures as evidence that the rows are absent.

Health Canada’s current CNF page says the 2026 file is published as relational CSVs and describes the 2015 online search as an interim access method. The accessible 2015 cooked-quinoa page confirms food code 5917 and the three 2015 portions above. The 2008 Health Canada table confirms its distinct 125 mL = 73 g portion. These older records support historical observations only; none answers the 2026 row check.

## Source and ownership register

The `R171` keys are local citations for this proposal only. They are not allocated source IDs and are not additions to the research ledger.

| Key / existing ID | Source and exact URL | Evidence and ownership result |
|---|---|---|
| `R171-S01` (proposal-local) | Health Canada, [CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109?res_page=1) | Current record modified 2026-10-04; lists the Food Name and Measure Weight Conversion CSV resources. It does not expose their quinoa rows. This exact portal URL is already recorded under `WP07-GARLIC-POWDER-20261012-S04`, `WP03-SORGHUM-SEMOLINA-20261013-S10`, and `WP03-THIAKRY-20261013-S11`; no duplicate ledger source is proposed. |
| `R171-S02` (proposal-local) | [Food Name CSV resource metadata](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad); [direct CSV endpoint](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | The resource listing and field metadata are visible through search indexing; direct row retrieval failed. No exact ledger source owns the download URL. No food name, code, or alternate description is claimed. |
| `R171-S03` (proposal-local) | [Measure Weight Conversion CSV resource metadata](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76); [direct CSV endpoint](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | The dataset lists the file; direct row retrieval failed. No exact ledger source owns the download URL. No measure, weight, or 2026 join is claimed. |
| Existing `WP03-QCM-20261012-S05` | Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) | Already attached to the cooked-quinoa form record. Supports the relational 2026 publication context and says the 2015 online search remains interim; it provides no cooked-quinoa item row. Reuse the existing ledger record. |
| Existing `WP03-S5-COOKED-5917` | Health Canada, [CNF 2015 cooked-quinoa portion page, food code 5917](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=5917) | Already attached to the cooked form. Confirms the bilingual cooked-state label and 2015 values; not a 2026 source. |
| Existing `WP03-QCM-20261012-S04` | Health Canada, [*Nutrient Value of Some Common Foods* (2008)](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/nutrient-value-some-common-foods-2008.html) | Already attached to the cooked form. Confirms the separate 2008 household portion; not a 2026 source. |

The three proposal-local source keys were checked for collisions with current ledger source IDs and are unallocated. The two direct CSV download URLs have no exact URL owner in the live ledger. No reference, form, observation, substitution, or recipe ID is proposed.

## Disposition

Keep the active plan item open, retain `measurementState: not_yet_researched`, and preserve the existing source-specific values and recipe link. No change is recommended to the shared catalog, ledger, generated files, plan, roadmap, README, or recipe data. This proposal records the repeated access blocker and the concrete evidence needed to complete the measurement review.
