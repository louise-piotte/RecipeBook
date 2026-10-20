# WP03 Section F R563 — CNF 2015 dry white-rice portions

## Review record

- **Status:** Integrated on 2026-10-17 as two ledger observations and documentation. Active catalog, recipe, and code data were unchanged.
- **Scope:** Record the two volume portions from the CNF 2015 serving-size page for Food Code **4471** on the existing dry white-rice form, `ingredient-form-white-rice-dry`.
- **Recommendation:** Add two edition-specific `portion_weight` observations. Keep R553's CNF 2026 observations separate. Add no active measure, density, unit mapping, conversion, cooking yield, recipe link, or substitution.
- **Relationship to R553:** R553 completed the joined CNF 2026 rows for code 4471. It reports the CNF 2015 page's two volume values as historical context but intentionally did not add them as ledger observations. R563 is limited to those two currently unrecorded 2015 observations; it does not repeat or revise R553's 2026 evidence.

## Checklist anchor and bounded gap

The exact open Section F parent is [plan lines 4360–4361](../../RecipeBook-global-ingredient-catalog-plan.txt#L4369): “Dry versus cooked forms for remaining grains where recipes or measurements need them; generic rice, quinoa, and oat bran forms are integrated. Cooking yield is a separate quantity relation.” The specific CNF 2026 review for dry white long-grain rice is complete at [plan line 4426](../../RecipeBook-global-ingredient-catalog-plan.txt#L4435). The existing form ledger now contains only the two CNF 2026 observations. The CNF 2015 page is accessible and its two volume values are described in R553, but neither is stored as an observation. R563 fills only that edition-specific ledger gap; the broad Section F parent stays open.

## Current catalog, ledger, naming, and picker ownership

At review time the bundled package contains **1,805 ingredient references**, **148 forms**, and **2,169 research-ledger records**.

| Existing owner | Current data and evidence | R563 treatment |
|---|---|---|
| `ingredient-ref-white-rice` | `white rice / riz blanchi`; English alias `milled rice`; French alias `riz blanc`; category `GRAIN_AND_CEREAL`; `defaultDensity: null`; `unitMappings: []`. Its reference ledger record is identity-verified, with measurement `blocked_pending_evidence` and substitution research `not_yet_researched`. | Keep identity, bilingual names, aliases, category, and parent-ledger states unchanged. |
| `ingredient-form-white-rice-dry` | `dry white rice / riz blanchi, sec`; `formCode` and `prepState` are `dry`; match-term arrays are empty; `densityGPerMl: null`. Its ledger record is `researched_supported` with two CNF 2026 Food Code 4471 observations and no CNF 2015 observations. | Attach only the two CNF 2015 portions below to this existing form record. Keep its identity and substitution state unchanged. |
| `ingredient-ref-rice` and `ingredient-form-rice-dry` | Generic `rice / riz` has English aliases `chawal`, `uruchi rice`, and `uruchimai`; the form is `dry rice / riz sec`. Its form ledger has no observations and `measurementState: not_yet_researched`. Both reference and form have null density and empty mappings. | Keep the generic record unchanged. CNF Food Code 4471 is white, long-grain, regular dry rice; do not copy its values to generic dry rice. |

OQLF's [*riz blanchi* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432775/riz-blanchi) pairs the Québec French term with English *white rice*. The CNF page describes code 4471 more narrowly as white, long-grain, regular, dry rice. This evidence is consistent with the existing white-rice reference and dry form; it does not justify another identity or a generic rice measurement. R563 changes no French display, alias, or match term.

`IngredientReferenceSearchIndex` searches reference and attached form names, aliases, and match terms, preferring full normalized phrase matches. A static projection of the current seed gives:

| Query | Current result | R563 effect |
|---|---|---|
| `dry white rice` / `riz blanchi, sec` | `ingredient-ref-white-rice` with its dry-form hint | Unchanged; ledger evidence is not indexed by the picker. |
| `dry rice` / `riz sec` | `ingredient-ref-rice` with its generic dry-form hint | Unchanged. |
| `white rice` | White-rice grain and white-rice flour | Unchanged. |

## Bundled recipe demand

A read-only scan of all **114 manifest-listed recipe files** and their **1,123 structured ingredient rows** searched for `dry white rice`, `white rice, dry`, `riz blanchi, sec`, `riz blanc sec`, the dry white-rice form ID, generic dry-rice phrases, and its form ID. It found **zero dry-white-rice rows, zero generic dry-rice rows, and zero direct links to either dry form**. The bundle has no recipe-specific dry white-rice quantity or dry-to-cooked substitution need. This proposal records published reference portions only; it changes no recipe text or link.

## CNF 2015 source and reported rows

Health Canada's [CNF 2015 serving-size page for Food Code 4471](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4471) gives the bilingual food name **`Grains, rice, white, long-grain, regular, dry / Grains céréaliers, riz blanc, grain long, ordinaire, sec`**. It reports a 100 g edible-portion baseline, these volume portions, a separate “amount to make 125ml” value, and zero total refuse. The page details show a 2019-03-01 modification date; it remains the CNF 2015 web record. No filling, levelling, or packing method is stated.

| CNF 2015 page entry | Value | Treatment |
|---|---:|---|
| `100ml` | 78.2 g | Record as a CNF 2015 published volume portion. |
| `250ml` | 195.5 g | Record separately as a CNF 2015 published volume portion. |
| `amount to make 125ml` | 35.3 g | Exclude from portion observations; keep uninterpreted. |
| `total refuse` | 0% | Exclude from edible portions and kitchen measures. |

The official CNF 2026 data row reviewed in R553 reports 100 mL = 78.191 g and 250 mL = 195.478 g for the same Food Code. Those 2026 values round to the CNF 2015 page's tenths. Keep the editions as separate publication-specific observations; do not average or treat the matching rounded values as independent kitchen validation. R563 does not repeat R553's row join, the 2026 observations, or its type-9 Yield entry. Health Canada's [CNF API Guide, “Yield Amount”](https://produits-sante.canada.ca/api/documentation/cnf-documentation-en.html) defines yield amounts generally as yield from refuse and/or cooking losses assigned to certain foods, most often for food-inventory purposes. This general definition does not explain the 35.3 g “amount to make 125ml” entry or state its preparation basis. Keep that entry out of portions, active conversions, and dry-to-cooked yield.

## Source-ID ownership and observation proposal

The existing `WP03-S3` source points to this exact CNF 2015 code-4471 page and is already attached to generic rice, generic dry rice, and the white-rice reference. Its existing scope supports the bilingual food/state wording only; R563 will not broaden or repurpose it. `WP03-S108` remains on the separate long-grain-rice reference for wording only. R553's four sources, `WP03-CNF2026-WHITE-RICE-4471-R553-S01` through `S04`, remain attached to the existing white-rice dry-form record and support the current-edition code-4471 join. Do not attach their 2026 source scope to the new historical observations. The existing ledger source `WP03-CNF2026-PEARL-BARLEY-4411-R544-S05` owns the [CNF API Guide](https://produits-sante.canada.ca/api/documentation/cnf-documentation-en.html); reuse that source for its general Yield Amount definition and add no duplicate guide source.

The new source ID and observation IDs below were checked against the active ledger and proposal archive and were not present:

| Proposed ID | Scope |
|---|---|
| `WP03-CNF2015-WHITE-RICE-4471-R563-S01` | Health Canada CNF 2015 serving-size page for Food Code 4471; supports the two displayed volume portions only. It does not replace `WP03-S3`'s label-only role. |
| `white-rice-dry-cnf2015-100ml-portion-r563-20261017` | CNF 2015: 100 mL = 78.2 g. |
| `white-rice-dry-cnf2015-250ml-portion-r563-20261017` | CNF 2015: 250 mL = 195.5 g. |

For each proposed observation use `relationship: portion_weight`, `ingredientFormId: ingredient-form-white-rice-dry`, `valueUnit: g`, `value` and `observedMassG` equal to the published mass, `sourceQuantity` and `observedVolumeMl` equal to the listed millilitres, and `evidenceKind: published_portion`. Use the full CNF 2015 code-4471 description for `foodDescription`; identify the state as dry white long-grain regular rice; state that no filling or packing method is given; and scope `quantityBasis` to the CNF 2015 published portion, not a reusable white-rice or generic-rice conversion. Attach only `WP03-CNF2015-WHITE-RICE-4471-R563-S01` to these two observations.

## Bounded integration delta and limits

On the existing `ingredient-form-white-rice-dry` ledger record only:

1. Add the one scoped CNF 2015 source record and the two observations above. Retain R553's two CNF 2026 observations as separate edition-specific entries.
2. Leave this form's `measurementState: researched_supported`, `substitutionResearchState`, form labels and match terms unchanged. Leave the base white-rice and generic-rice ledger records unchanged.
3. Keep `densityGPerMl` and `defaultDensity` null; active measures, unit mappings, and conversions empty. Add no dry-to-cooked yield, water requirement, recipe quantity, or substitution.
4. Exclude the `amount to make 125ml` and zero-refuse entries. Do not copy Food Code 4471 values to generic `ingredient-form-rice-dry`, brown rice, other white-rice types, or other grain forms.

This follow-up completes only the missing CNF 2015 observation pair for code 4471. The open Section F parent remains open for other grain/form evidence and independent Québec review. The ledger-only addition required no software tests under the `AGENTS.md` database-JSON rule; no app tests, build, emulator check, or deployment were run.
