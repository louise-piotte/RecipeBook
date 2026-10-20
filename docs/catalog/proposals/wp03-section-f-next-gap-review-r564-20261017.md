# WP03 Section F R564 — CNF 2015 wild-rice form portions

- **Status:** Integrated on 2026-10-17. The five CNF 2015 observations are now recorded on the existing dry and cooked wild-rice form ledger records, separately from R550’s 2026 values. See the [R564 integration README](../batches/wp03-r564-cnf2015-wild-rice-integration-20261017/README.md).

## Review record

- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, recipe, or code files were changed.
- **Scope:** Add the CNF 2015 volume portions for Food Codes **4449** (wild rice, dry) and **4450** (wild rice, cooked) as historical edition-specific observations on the two existing wild-rice forms.
- **Recommendation:** Record two dry-form and three cooked-form `portion_weight` observations. Keep them separate from R550's CNF 2026 observations. Do not add active measures, density, mappings, conversions, cooking yield, recipe links, or substitutions.
- **Gap status:** R177 retained the CNF 2015 portions as source context and R550 added CNF 2026 observations on both forms. The current form records still have no CNF 2015 observations. R564 is limited to that missing edition-specific structure; it does not repeat R550's 2026 join.

## Checklist anchor and distinct scope

The open Section F parent is [plan lines 4366–4367](../../RecipeBook-global-ingredient-catalog-plan.txt#L4375): “Dry versus cooked forms for remaining grains where recipes or measurements need them; generic rice, quinoa, and oat bran forms are integrated. Cooking yield is a separate quantity relation.” The wild-rice form item is complete at [plan line 4427](../../RecipeBook-global-ingredient-catalog-plan.txt#L4436), and the CNF 2026 joined-row review is complete at [plan line 4431](../../RecipeBook-global-ingredient-catalog-plan.txt#L4440). R177's form proposal retained the 2015 values as source context; it did not create form-level measurement observations. R550 later added CNF 2026 observations for the same forms and again kept the 2015 entries as historical context. R564 proposes only to record those omitted 2015 values on their exact existing forms. The broader Section F parent stays open.

## Current identity, forms, and ledger

The active catalog has **1,805 ingredient references** and **150 forms**; the research ledger has **2,171 records**.

| Owner | Current data and ledger state | R564 treatment |
|---|---|---|
| `ingredient-ref-wild-rice` | `wild rice / riz sauvage`, `GRAIN_AND_CEREAL`, no aliases, `defaultDensity: null`, `unitMappings: []`. The parent ledger record is identity-verified; measurement and substitution research remain `not_yet_researched`. | Leave identity, aliases, category, density, mappings, and parent-ledger state unchanged. |
| `ingredient-form-wild-rice-dry` | `wild rice, dry / riz sauvage, sec`, `formCode/prepState: dry`, empty match terms, `densityGPerMl: null`. Its form ledger record is `researched_supported` with two CNF 2026 observations for code 4449 and no CNF 2015 observations. | Add only the two CNF 2015 portions below to this existing record. Keep its substitution state unchanged. |
| `ingredient-form-wild-rice-cooked` | `wild rice, cooked / riz sauvage, cuit`, `formCode/prepState: cooked`, empty match terms, `densityGPerMl: null`. Its form ledger record is `researched_supported` with three CNF 2026 observations for code 4450 and no CNF 2015 observations. | Add only the three CNF 2015 portions below to this existing record. Keep its substitution state unchanged. |

The [OQLF entry for *riz sauvage*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8418384/riz-sauvage) directly pairs that Québec French term with English *wild rice*. Its broad identity label and the existing form labels remain bilingual and distinct from ordinary rice. R564 proposes no new identity, alias, form, or match term.

## Picker projection and recipe demand

`IngredientReferenceSearchIndex` includes reference names and aliases plus attached form labels and match terms in its bilingual phrase search. A static projection of the current catalog gives:

| Query | Current result | R564 effect |
|---|---|---|
| `wild rice` / `riz sauvage` | Plain wild rice, wild-rice blend, puffed wild rice, and wild-rice flour results | Unchanged. |
| `wild rice, dry` / `riz sauvage, sec` | `ingredient-ref-wild-rice`, with the dry-form hint | Unchanged. |
| `wild rice, cooked` / `riz sauvage, cuit` | `ingredient-ref-wild-rice`, with the cooked-form hint | Unchanged. |
| `cooked rice` / `riz cuit` | Generic `ingredient-ref-rice`, with its cooked-form hint | Unchanged. |

The proposed ledger-only observations do not add picker search terms or change current results.

A read-only scan of all **114 manifest-listed recipes** and **1,123 structured ingredient rows** searched wild-rice English/French names, *Zizania*, the wild-rice reference and both form IDs. It found **zero matching recipe files, zero matching ingredient rows, and zero direct links**. R564 records Health Canada portions; it does not address a bundled recipe demand or justify a recipe amount or substitution link.

## CNF 2015 pages and exact portions

Health Canada's [CNF 2015 page for dry wild rice, Food Code 4449](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4449) labels the food **`Grains, rice, wild, dry / Grains céréaliers, riz sauvage, sec`** and displays 100 mL = 67.6 g, 250 mL = 169.1 g, a separate “amount to make 125ml” entry of 32.5 g, a 100 g edible-portion baseline, and 0% total refuse. Its page details show a 2019-03-01 modification date. Health Canada's [CNF 2015 page for cooked wild rice, Food Code 4450](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4450) labels the food **`Grains, rice, wild, cooked / Grains céréaliers, riz sauvage, cuit`** and displays 100 mL = 69.3 g, 125 mL = 86.6 g, and 250 mL = 173.3 g, plus a 100 g edible-portion baseline and 0% total refuse. It has the same page modification date. Neither page states a filling, levelling, or packing method. Health Canada describes CNF 2015 online access as an interim route while CNF 2026 is published as relational CSV files in its [CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html).

| Food Code and state | Page-listed volume portion | R564 disposition |
|---|---:|---|
| 4449 — wild rice, dry | 100 mL = 67.6 g | Record as one CNF 2015 portion on the dry form. |
| 4449 — wild rice, dry | 250 mL = 169.1 g | Record as a separate CNF 2015 portion on the dry form. |
| 4449 — wild rice, dry | “amount to make 125ml” = 32.5 g | Exclude from portion observations; retain as uninterpreted page evidence. |
| 4449 — wild rice, dry | total refuse = 0% | Exclude from edible portions and kitchen measures. |
| 4450 — wild rice, cooked | 100 mL = 69.3 g | Record as one CNF 2015 portion on the cooked form. |
| 4450 — wild rice, cooked | 125 mL = 86.6 g | Record as a separate CNF 2015 portion on the cooked form. |
| 4450 — wild rice, cooked | 250 mL = 173.3 g | Record as a separate CNF 2015 portion on the cooked form. |
| 4450 — wild rice, cooked | total refuse = 0% | Exclude from edible portions and kitchen measures. |

R550's direct join of the four official CNF 2026 CSVs already records the current-release rows separately: code 4449 at 100 and 250 mL = 67.625 and 169.062 g; code 4450 at 100, 125, and 250 mL = 69.315, 86.644, and 173.288 g. Each rounds to the corresponding CNF 2015 display at one decimal place. Preserve both editions and do not average them or describe the matching rounded values as independent kitchen validation. R564 does not alter or duplicate the 2026 observations.

The dry code-4449 page's “amount to make 125ml” value is not a named 125 mL portion. R550 joined its current CNF 2026 counterpart as a type-9 Yield row and kept it uninterpreted. The existing Health Canada [CNF API Guide, “Yield Amount”](https://produits-sante.canada.ca/api/documentation/cnf-documentation-en.html), recorded in the ledger as `WP03-CNF2026-PEARL-BARLEY-4411-R544-S05`, defines that field generally as yield from refuse and/or cooking losses assigned to certain foods, most often for food-inventory purposes. This general definition does not establish the preparation basis of the wild-rice row. Do not record 32.5 g as a portion, density, cooking yield, or conversion.

## Source ownership and proposed observations

The CNF 2015 sources already in the ledger, `WP03-WILDRICE-FORMS-R177-20261016-S01` (code 4449) and `WP03-WILDRICE-FORMS-R177-20261016-S02` (code 4450), point to the exact pages above and already record their bilingual state descriptions and historical portions. The first is attached to the wild-rice identity and dry form; the second is attached to the wild-rice identity and cooked form. Reuse those exact existing sources for the new observations; add no new source ID or shared source record. R550's current-edition sources `WP03-CNF2026-WILDRICE-4449-R550-S01` through `S04` and `WP03-CNF2026-WILDRICE-4450-R550-S01` through `S04` remain scoped to their respective 2026 CSV rows and stay on the same form records. Do not cite those 2026 sources as evidence for the historical observations. Existing identity sources `WP03-S12` (OQLF) and `WP03-S13` (Ontario Ministry of Agriculture) remain unchanged.

The following new observation IDs were checked against the active ledger and proposal archive and are unallocated. They are proposal-local until root integration:

| Observation ID | Form | CNF 2015 portion | Source ID to reuse |
|---|---|---:|---|
| `wild-rice-dry-cnf2015-100ml-portion-r564-20261017` | `ingredient-form-wild-rice-dry` | 100 mL = 67.6 g | `WP03-WILDRICE-FORMS-R177-20261016-S01` |
| `wild-rice-dry-cnf2015-250ml-portion-r564-20261017` | `ingredient-form-wild-rice-dry` | 250 mL = 169.1 g | `WP03-WILDRICE-FORMS-R177-20261016-S01` |
| `wild-rice-cooked-cnf2015-100ml-portion-r564-20261017` | `ingredient-form-wild-rice-cooked` | 100 mL = 69.3 g | `WP03-WILDRICE-FORMS-R177-20261016-S02` |
| `wild-rice-cooked-cnf2015-125ml-portion-r564-20261017` | `ingredient-form-wild-rice-cooked` | 125 mL = 86.6 g | `WP03-WILDRICE-FORMS-R177-20261016-S02` |
| `wild-rice-cooked-cnf2015-250ml-portion-r564-20261017` | `ingredient-form-wild-rice-cooked` | 250 mL = 173.3 g | `WP03-WILDRICE-FORMS-R177-20261016-S02` |

Use `relationship: portion_weight`, `valueUnit: g`, `observedMassG` equal to the displayed mass, `observedVolumeMl` and `sourceQuantity` equal to the listed millilitres, and `evidenceKind: published_portion`. Use each full bilingual Food Code description for `foodDescription`; state the exact form; note no filling or packing method is reported; and scope `quantityBasis` to that CNF 2015 food-code-specific published portion, not a reusable conversion. Each observation cites only its code-specific existing CNF 2015 source ID.

## Bounded integration delta and limits

On `ingredient-form-wild-rice-dry` and `ingredient-form-wild-rice-cooked` only:

1. Append the five CNF 2015 observations above, using the existing R177 source IDs.
2. Keep each form's `measurementState: researched_supported`, substitution state, labels, match terms, and density unchanged. Keep the parent wild-rice reference's `measurementState: not_yet_researched` unchanged.
3. Leave `defaultDensity` and both form densities null; leave unit mappings, active measures, and conversions empty. Add no dry-to-cooked yield or comparison of the two food-code portion tables.
4. Keep all type-9 “amount to make” and refuse entries out of observations. Add no recipe line, ingredient substitution, or state conversion.

CNF portions are food-code- and edition-specific published values. They do not specify wild-rice variety, lot, particle handling, a filling method, or the preparation process behind the cooked code. The 100/125/250 mL entries are not paired measurements of one batch; they do not support a dry-to-cooked yield or substitution to ordinary rice. This fills only the wild-rice CNF 2015 observation gap; the Section F parent remains open. Static ledger/schema/source, encoding, plan, link, and whitespace checks passed. No software tests were run because the change only adds database JSON data, as exempted by `AGENTS.md`.
