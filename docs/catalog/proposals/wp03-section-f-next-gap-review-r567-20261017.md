# WP03 Section F R567 — cooked millet form and CNF 2015 portions

## Review decision

- **Status:** Integrated. The cooked form and its three CNF 2015 observations are in the seed form file and research ledger; see the [R567 integration README](../batches/wp03-r567-cooked-millet-cnf2015-integration-20261017/README.md). No recipe or code files were changed.
- **Selected gap:** The open WP03 Section F dry/cooked-grain parent has no cooked form under the broad `millet / millet` identity, and there is no form-level ledger record for it.
- **Recommendation:** Add one generic cooked-millet form under `ingredient-ref-millet` and record the three published CNF 2015 Food Code **4492** volume portions as separate, edition- and food-code-specific ledger observations. Do not place code 4492 on the distinct `common millet / millet commun` identity. Keep CNF 2026 row inspection open: this review could not read its CSV rows and makes no 2026 row or value claim.
- **Boundaries:** Add no alias, density, unit mapping, active measure, reusable conversion, dry-to-cooked yield, recipe link, or substitution.

## Checklist anchor and scope

The open parent is [Section F, “Dry versus cooked forms for remaining grains”](../../RecipeBook-global-ingredient-catalog-plan.txt#L4375), which says generic rice, quinoa, and oat-bran forms are integrated and treats cooking yield as a separate relation. The existing common-millet identity and its dry-form review are covered by the completed child at [plan line 4426](../../RecipeBook-global-ingredient-catalog-plan.txt#L4435) and R547. R567 addresses one adjacent gap: a cooked state under the separate broad millet identity, backed by the exact CNF 2015 cooked-millet page. It does not reopen R547's dry common-millet rows or close the broader Section F parent.

## Existing ownership and form boundary

| Current owner | Current state | R567 treatment |
|---|---|---|
| `ingredient-ref-millet` | Bilingual generic name `millet / millet`; `GRAIN_AND_CEREAL`; no aliases, density, or unit mappings. Its ledger identity is verified; measurement and substitution research are `not_yet_researched`. No form or measurement observation is attached. | Add the proposed cooked form beneath this broad identity. Keep the reference aliases, density, mappings, measurement state, and substitution state unchanged. |
| `ingredient-ref-common-millet` | Species-qualified `common millet / millet commun` for *Panicum miliaceum*, with English aliases including `proso millet`, `chena`, `barri`, `cheno`, `cheena`, `cheena millet`, and `panivaragu`. | Keep it separate. Do not assign CNF 2015 Food Code 4492 to this species-specific identity because the accessible 2015 page does not give a scientific name. |
| `ingredient-form-common-millet-dry` | Existing `common millet, dry / millet commun, sec` form from R547. Its ledger has separate CNF 2015 and CNF 2026 Food Code 4491 portions. | Leave unchanged. Code 4491's 2026 row was joined to *Panicum miliaceum*; that does not establish the species or measurement for code 4492. |
| proposed `ingredient-form-millet-cooked` | No catalog form or ledger record currently owns this ID or the exact bilingual phrases `millet, cooked / millet, cuit`. | Add only this generic cooked-state form and its code-4492 observations. |

The OQLF's [generic *millet* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet), already owned by the generic reference as `WP03-S20`, says the unqualified name can group several species or abbreviate a particular species. Its preferred French and English terms include `millet` / `millet`. By contrast, OQLF's separate *millet commun* entry identifies *Panicum miliaceum*. The CNF 2015 code-4492 page gives only the generic bilingual name `Grains, millet, cooked / Grains céréaliers, millet, cuit`; it does not name a species. These sources support the generic cooked form label below and do not justify a `common millet, cooked` form, new aliases, or a species claim.

## Bilingual name and picker projection

Propose this single form:

| Field | Proposed value |
|---|---|
| ID / owner | `ingredient-form-millet-cooked` / `ingredient-ref-millet` |
| `formCode` / `prepState` | `cooked` / `cooked` |
| English / French labels | `millet, cooked` / `millet, cuit` |
| English / French match terms | Empty / empty |
| `densityGPerMl` | `null` |
| Form note | The state label comes from CNF 2015 Food Code 4492; its portions do not establish a general millet density or conversion. |

The current phrase-first `IngredientReferenceSearchIndex` indexes bilingual reference terms and attached form labels. There is no exact active owner for `millet cooked` or `millet cuit`; adding this form would make either normalized phrase resolve to `ingredient-ref-millet` with the cooked-form hint. Broad `millet` search already returns the generic and species/product references that contain that word; this form adds no reference and does not alter that result set. Keep `millet commun`, `common millet`, the dry common-millet form, and its aliases on their existing owner. The reversed-order query `cooked millet` currently resolves to `ingredient-ref-thiakry-millet-granules` through its `pre-cooked millet granules` name. Leave that result unchanged: add no `cooked millet` alias or match term, and let only the bilingual form labels provide the new exact picker phrases.

## Recipe demand, measurement use, and substitutions

A read-only scan of the 114 manifest-listed recipe files and all 1,123 structured ingredient rows found no generic or species-qualified millet text, no millet ingredient row, and no direct link to `ingredient-ref-millet` or a millet form. This is source-backed catalog coverage, not a response to current bundle demand. Do not add recipe lines or infer a recipe amount.

The three CNF 2015 values below are published portions for the exact cooked food code. They are not reusable measures or a density. The page states no filling or packing method, and code 4492's cooked portions are not paired observations of the raw ingredient or a stated cooking batch. Do not calculate density, extrapolate to other volumes, infer a cooking ratio or yield, or link a substitution. Keep the generic reference's substitution state unchanged and leave the new form's substitution research unresearched.

## CNF 2015 evidence and exact portions

Health Canada's [CNF 2015 serving-size page for Food Code 4492](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4492) labels the food **`Grains, millet, cooked / Grains céréaliers, millet, cuit`**. It displays a 100 g edible-portion baseline, 100 mL = 73.5 g, 125 mL = 91.9 g, 250 mL = 183.9 g, and total refuse of 0%. Its page details show a 2019-03-01 modification date. The 100 g baseline and refuse entry are not additional kitchen portions and should stay out of the proposed observations. No filling, levelling, packing, recipe, or cooking method is reported.

| Food Code | Edition and exact bilingual food description | Listed volume portion | Proposed treatment |
|---:|---|---:|---|
| 4492 | CNF 2015, `Grains, millet, cooked / Grains céréaliers, millet, cuit` | 100 mL = 73.5 g | Record one source-specific `portion_weight` observation on the generic cooked-millet form. |
| 4492 | Same food-code row | 125 mL = 91.9 g | Record as a distinct observation; do not extrapolate from 100 mL. |
| 4492 | Same food-code row | 250 mL = 183.9 g | Record as a distinct observation; do not derive density. |
| 4492 | Same food-code row | 100 g edible portion = 100 g | Exclude; it is a mass baseline, not a volume portion. |
| 4492 | Same food-code row | total refuse = 0% | Exclude; it is not an edible mass/volume measure. |

## Current CNF 2026 limit

Health Canada's current [CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says the CNF 2026 release is published as relational CSV files and that the CNF 2015 online tool remains available as an interim route. The official [CNF 2026 Food Name resource](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad) and the direct CSV URLs used by R547 are current-edition sources, not code-4492 row evidence in this review.

On 2026-10-17, the browser tool could not open the official `food_name.csv`, `measure_weight_conversion.csv`, `measure_name.csv`, or `measure_type.csv` downloads; the Open Government resource page returned HTTP 403. A local Python HTTPS request failed with `Temporary failure in name resolution`. Therefore this proposal makes **no** claim that code 4492 exists or is absent in CNF 2026, does not report its current scientific name, measure codes, types, values, or row dates, and allocates no CNF 2026 source IDs. Keep that joined-row inspection open. The CNF 2015 observations below remain clearly scoped to the 2015 web page and do not depend on a presumed 2026 match.

## Source ownership and proposed ledger entries

The existing `WP03-S20` OQLF source belongs to `ingredient-ref-millet` and supports generic naming only. R547's `WP03-S180` OQLF source and CNF sources for Food Code 4491 belong to `ingredient-ref-common-millet` and its dry form; do not cite them for code 4492. The CNF 2015 Food Code 4492 page is now owned by the new cooked-form ledger record:

| Proposed source ID | Primary source | Scope |
|---|---|---|
| `WP03-CNF2015-MILLET-4492-R567-S01` | Health Canada, [CNF 2015 serving-size page for Food Code 4492](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4492) | Exact generic bilingual cooked-millet description, the three displayed volume portions, page modification date, 100 g edible baseline, and zero-refuse row. Does not identify a species, state a packing method, or establish a reusable conversion. |

The integration adds three separate observations to the new `ingredient-form-millet-cooked` form record. Each uses `relationship: portion_weight`, `valueUnit: g`, `evidenceKind: published_portion`, `observedVolumeMl` and `sourceQuantity.amount` equal to the listed millilitres, `observedMassG` equal to the displayed mass, and `sourceIds: [WP03-CNF2015-MILLET-4492-R567-S01]`.

| Proposal-local observation ID | Portion | Form |
|---|---:|---|
| `millet-cooked-cnf2015-100ml-portion-r567-20261017` | 100 mL = 73.5 g | `ingredient-form-millet-cooked` |
| `millet-cooked-cnf2015-125ml-portion-r567-20261017` | 125 mL = 91.9 g | `ingredient-form-millet-cooked` |
| `millet-cooked-cnf2015-250ml-portion-r567-20261017` | 250 mL = 183.9 g | `ingredient-form-millet-cooked` |

Each observation uses the full CNF 2015 bilingual code-4492 name, `Cooked millet (CNF 2015 Food Code 4492)` as its state, and a measurement-method note that the page states no filling or packing method. Its quantity basis is limited to this CNF 2015 Food Code 4492 published portion—not a generic millet conversion or cooking yield. Only the new form's measurement state is `researched_supported`; the parent reference's measurement state, both substitution states, and all active numeric conversion data remain unchanged.

## Bounded integration delta and limits

1. Add `ingredient-form-millet-cooked` under the existing broad `ingredient-ref-millet`, with the bilingual labels above, empty match terms, null density, and no active measure or unit mapping.
2. The three CNF 2015 code-4492 `portion_weight` observations are recorded on that form's ledger record with the R567 source ID above.
3. Leave the separate `ingredient-ref-common-millet`, R547's dry form, and all code-4491 source-specific observations unchanged. Do not infer that the 4492 page describes *Panicum miliaceum*.
4. Keep code-4492's mass baseline and zero-refuse entry out of observations. Add no CNF 2026 value or row-presence claim until its Food Name and measure rows can be read and joined. Add no density, mapping, conversion, dry-to-cooked yield, recipe link, or substitution.

This closes only the generic cooked-millet form and its three CNF 2015 portions. The CNF 2026 code-4492 join and the broader Section F parent remain open. No app tests, build, emulator run, or deployment were run for this database-JSON-only addition under `AGENTS.md`.
