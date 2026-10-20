# WP03 Section F R813 — generic dry-millet form boundary review

- **Reviewed:** 2026-10-19.
- **Target:** Existing broad `ingredient-ref-millet` identity and the species-qualified common-millet form.
- **Recommendation:** Hold a generic dry-millet form. Keep Food Code 4491 on `ingredient-ref-common-millet` (*Panicum miliaceum*) and preserve the separate species-unspecified cooked-millet form on `ingredient-ref-millet`.
- **Write scope:** This review adds no active catalog or ledger data. The Section F species and product sweep remains open.

## Evidence and existing ownership

OQLF's generic millet entry says the unqualified word can refer to several species or abbreviate one species. Its separate common-millet entry identifies *Panicum miliaceum*. Health Canada's CNF 2026 Food Name row for Food Code 4491 names `Grains, millet, dry / Grains céréaliers, millet, sec` and specifies `ScientificName=Panicum miliaceum`. The CNF 2015 serving page for the same code provides dry-millet portions, but that evidence follows the Food Code 4491 species scope.

R547 already added `ingredient-form-common-millet-dry` under `ingredient-ref-common-millet` and recorded four distinct CNF 2015/2026 portions on its form ledger record. Do not copy those sources or values onto the broad millet identity. By comparison, the existing `ingredient-form-millet-cooked` is supported by CNF 2015 Food Code 4492, whose bilingual cooked-millet description does not name a species. Keep that generic cooked form unchanged.

## Picker and recipe scope

The active search projection indexes exact form labels separately and returns an exact form-label match before phrase fallback. The existing `common millet, dry` label supports the `millet dry` phrase fallback. Adding a generic `millet, dry` form would create an exact `millet dry` key and make that query return only the broad millet reference, hiding the existing species-qualified common-millet form. No source in this review supports assigning the raw Food Code 4491 state or its portions to all millet species. Do not add `dry` match terms or alter either existing form label.

The 114 manifest-listed recipes and 1,123 structured ingredient rows have no `ingredient-ref-millet` or common-millet link and no matching generic dry-millet phrase. This review does not add a recipe link or infer dry-millet demand.

## Exact disposition

- Leave `ingredient-ref-millet` as `millet / millet` with its existing aliases, category, measurement state, and substitutions unchanged.
- Keep its existing species-unspecified `ingredient-form-millet-cooked` and CNF 2015 Food Code 4492 observations.
- Keep `ingredient-form-common-millet-dry` and all CNF 2015/2026 Food Code 4491 observations under `ingredient-ref-common-millet`.
- Add no identity, form, alias, measurement observation, density, unit mapping, conversion, yield, recipe link, or substitution.

## Source register

| Source | Supports | Limit |
|---|---|---|
| OQLF, [millet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet), existing ledger source `WP03-S20` | Bilingual broad term and its multi-species or abbreviated-species use. | Does not say that every millet species has the same raw form, measurement, or cooking behavior. |
| OQLF, [millet commun](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506451/millet-commun), existing ledger source `WP03-S180` | Common millet identity and the *Panicum miliaceum* species scope. | Does not set a generic all-millet dry state or measurement. |
| Health Canada, [CNF 2026 Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv), existing R547 source `WP03-CNF2026-COMMON-MILLET-4491-R547-S01` | Food Code 4491 dry bilingual label and `ScientificName=Panicum miliaceum`. | Food Code 4491 is not species-neutral. Its measures stay on the R547 common-millet dry form. |
| Health Canada, [CNF 2015 Food Code 4491 serving page](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4491), existing R547 source `WP03-CNF2015-COMMON-MILLET-4491-R547-S01` | Dry state plus its published portion values. | The page is tied to the same species-qualified Food Code 4491; it does not support a generic millet measure. |
| Health Canada, CNF 2015 Food Code 4492 serving page, existing ledger source `WP03-CNF2015-MILLET-4492-R567-S01` | Species-unspecified cooked-millet state and portions already on the generic cooked form. | Does not establish a dry form or a dry-to-cooked yield. |

## Static checks and test disposition

- The live references, forms, and ledger were checked for the broad millet, common-millet, and cooked/dry form owners.
- Existing R547 ownership and observation records were checked; Food Code 4491 source IDs and measurements already belong to the common-millet dry form.
- Exact form-label priority and phrase fallback in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) were inspected; a hypothetical `millet, dry` label would shadow the existing common-millet phrase result for `millet dry`.
- The manifest counts and relevant recipe text were checked. No active catalog, ledger, recipe, or generated-index change is proposed, so no software tests, build, emulator run, or deployment were performed.
