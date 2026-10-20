# WP03 Section F R840 — dry and cooked couscous forms

## Review record

- **Reviewed:** 2026-10-19.
- **Plan anchor:** The open Section F checklist at [line 4859](../../RecipeBook-global-ingredient-catalog-plan.txt#L4868): add dry versus cooked forms for remaining grains where recipes or measurements need them; cooking yield remains a separate quantity relation.
- **Candidate:** State forms for the existing generic `couscous / couscous` ingredient reference.
- **Recommendation:** Add separate dry and cooked forms under the existing couscous reference and link the five matching CNF 2015 volume-portion observations already recorded by R822 to those forms.
- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, recipe, generated-index, or workflow file was changed.
- **Boundary:** Reuse the already-ledgered CNF sources and values. Keep the 34.5 g “amount to make 125 mL” observation unassigned to a form, preserve it as a ledger-only source relation, and add no density, unit mapping, active conversion, new yield, recipe link, or substitution.

## Why this is distinct and supported

R822 added five edition-specific CNF 2015 volume portions and the directly stated 34.5 g “amount to make 125 mL” relation to the generic couscous ledger record ([R822 proposal](wp03-section-f-next-gap-review-r822-20261019.md), [R821–R823 integration README](../batches/wp02-wp03-wp04-r821-r823-gap-review-integration-20261019/README.md)). It intentionally created no active form. R840 addresses the separate open dry/cooked-form checklist: the two official CNF food pages name the same grain product in distinct dry and cooked states, and each state has its own volume portions. Those state-labelled portions are sufficient measurement evidence for form identities, even though the recipe corpus has no couscous ingredient row. This proposal supersedes only R822’s no-form conclusion; it does not repeat or revise R822’s source values or amount-to-make interpretation.

Health Canada’s [CNF 2015 Food Code 4420 page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4420&lang=eng&wbdisable=true) names `Grains, couscous, dry / Grains céréaliers, couscous, sec` and reports 100 mL = 73.1 g and 250 mL = 182.8 g. Its separate [Food Code 4490 page](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4490) names `Grains, couscous, cooked / Grains céréaliers, couscous, cuit` and reports 100 mL = 66.4 g, 125 mL = 82.9 g, and 250 mL = 165.9 g. The bilingual state labels and their separate portion rows directly support two forms and their source-scoped observations. They do not establish a reusable density or conversion.

The existing OQLF [cereal-product entry for couscous](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502225/couscous) defines the ingredient as agglomerated durum-wheat semolina grains that are steamed and dried; it also notes the word names a prepared dish. OQLF’s separate [dish entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502206/couscous) describes the composed North African dish. Keep both proposed forms attached to the cereal ingredient reference, not to a prepared couscous dish identity.

The form proposal follows the plan’s measurement-based condition and the existing pattern used for CNF-named grain states, including [common millet](wp03-section-f-next-gap-review-r547-20261017.md), [pearl barley](wp03-section-f-pearl-barley-dry-cooked-form-review-R27-20261013.md), and [wild rice](wp03-section-f-wild-rice-dry-cooked-form-review-r177-20261016.md). The current `ingredient-ref-couscous` ledger record already holds the five matching state-specific portion observations. Its “amount to make” observation is different: it records dry input to a stated prepared-product amount, without a preparation protocol or an explicitly named cooked output. Leave it unscoped and ledger-only; do not make a form or runtime conversion from it.

This item is separate from R837’s `nachni` finger-millet alias, R834’s parboiled-rice CNF 2026 access hold, and the [R836–R838 integration batch](../batches/wp02-wp03-wp04-r836-r838-gap-review-integration-20261019/README.md) (R836 emmer semolina evidence, R837 `nachni`, R838 Atlantic herring portions). It also differs from R822: R822 supplied the existing measurement observations; R840 proposes only state forms and their attachment to matching portions.

## Exact proposed data delta

### Active forms

Append two forms to `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json`:

| Field | Dry form | Cooked form |
|---|---|---|
| `id` | `ingredient-form-couscous-dry` | `ingredient-form-couscous-cooked` |
| `ingredientRefId` | `ingredient-ref-couscous` | `ingredient-ref-couscous` |
| `formCode` | `dry` | `cooked` |
| `labelEn` | `couscous, dry` | `couscous, cooked` |
| `labelFr` | `couscous, sec` | `couscous, cuit` |
| `prepState` | `dry` | `cooked` |
| `matchTermsEn` | `["dry couscous"]` | `["cooked couscous"]` |
| `matchTermsFr` | `[]` | `[]` |
| `densityGPerMl` | `null` | `null` |

Use notes stating that the form names the CNF 2015 state only and provides no density, reusable conversion, or cooking-yield rule. Set `updatedAt` to `2026-10-19T00:00:00Z` during integration. The English match terms support the common adjective-first query order; they are form search terms, not ingredient-reference aliases. The French form labels follow the exact CNF `sec` and `cuit` state wording.

### Existing research-ledger record

On `recordId: ingredient-ref-couscous`, keep `identityState: verified`, `measurementState: researched_supported`, and `substitutionResearchState: not_yet_researched`.

1. Add `ingredient-form-couscous-dry` to `ingredientFormId` on the two existing `portion_weight` observations:
   - `couscous-dry-cnf2015-100ml-r822-20261019`
   - `couscous-dry-cnf2015-250ml-r822-20261019`
2. Add `ingredient-form-couscous-cooked` to `ingredientFormId` on the three existing `portion_weight` observations:
   - `couscous-cooked-cnf2015-100ml-r822-20261019`
   - `couscous-cooked-cnf2015-125ml-r822-20261019`
   - `couscous-cooked-cnf2015-250ml-r822-20261019`
3. Leave `couscous-dry-to-made-125ml-cnf2015-r822-20261019` without `ingredientFormId`. Its `cooking_yield` relationship, 34.5 g input, 125 mL stated output, wording, and current source links remain unchanged.
4. In existing source entries `WP03-COUSCOUS-CNF-PORTIONS-R822-20261019-S01` and `...-S02`, make the `supports` text explicitly retain the bilingual Food Code name as well as the already-recorded portions. Keep the existing URLs, IDs, access dates, and record ownership. Add no new source ID.
5. Append an accepted follow-up decision using only S01 and S02 that adds the two forms and attaches only the five state-matched portion observations. State that this supersedes R822’s earlier no-form conclusion only for the dry/cooked form question. Preserve R822’s values and its boundary for the “amount to make” entry.

Do not alter the generic couscous reference, its empty aliases, null default density, or empty unit mappings. Add no form conversion, unit mapping, recipe ingredient link, package measurement, substitution finding, or global/contextual substitution rule.

## Ownership, forms, ledger, and rules audit

| Surface | Current finding |
|---|---|
| Active references | The catalog contains 1,886 references. `ingredient-ref-couscous` is `couscous / couscous`, category `GRAIN_AND_CEREAL`, with empty English/French aliases, null default density, and empty unit mappings. No reference change is proposed. The other seven couscous-family references remain separate identities. |
| Active forms | The catalog contains 199 forms and none belongs to `ingredient-ref-couscous`. Exact proposed form IDs and labels are unallocated in active forms and prior proposal/batch history. No form-level conversion or measurement value is proposed. |
| Legacy candidates | No exact couscous dry/cooked form candidate or proposed form ID is owned by the legacy import identity file. |
| Research ledger | The 2,294-record ledger already has `ingredient-ref-couscous`, identity verified, measurement researched-supported, and substitution research not yet researched. R822 owns the two CNF food-code sources, five volume portions, and one separate amount-to-make observation on this same record. All six observations currently omit `ingredientFormId`; only the five volume portions receive one under this proposal. |
| Source ownership | R822 source S01 is the Food Code 4420 page and S02 is the Food Code 4490 page, both already owned by the generic couscous ledger record. Reuse those entries and URLs; no new evidence/source ID is required. The older R20 citation to Food Code 4420 under barley couscous explicitly excludes the generic CNF portions from that product and does not own or receive this proposal’s values. |
| Substitution/conversion rules | Both global form-conversion and contextual-substitution rule files contain no couscous rule. No such rule is proposed. |
| Prior decision | R822 recorded the measurements without forms and explicitly said no active form was supported at that time. R840 revisits only this modeling decision against the open line 4828 checklist and the two explicit bilingual state names plus state-specific portion rows. Its accepted follow-up must clearly supersede that single no-form conclusion while retaining every R822 measurement boundary. |

## Static picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) gives exact normalized form labels and form search terms a unique form hint. Adding these forms does not add new reference identities or reference aliases.

| Query | Current | With R840 forms | Form hint after R840 |
|---|---|---|---|
| `couscous` | 8 couscous-family reference results | Same 8 | None; broad family search remains multi-result. |
| `couscous, dry` / `couscous, sec` | No result | `ingredient-ref-couscous` | `ingredient-form-couscous-dry` |
| `dry couscous` | No result | `ingredient-ref-couscous` | `ingredient-form-couscous-dry` |
| `couscous, cooked` / `couscous, cuit` | No result | `ingredient-ref-couscous` | `ingredient-form-couscous-cooked` |
| `cooked couscous` | No result | `ingredient-ref-couscous` | `ingredient-form-couscous-cooked` |

Single-word `dry` / `sec` / `cooked` / `cuit` each gain the generic couscous reference through these form terms; broad state queries remain multi-result. Existing `couscous` family identities and their ownership do not change.

## Bundled recipe demand

Parsed all **114 manifest-listed recipe files** and **1,123 ingredient rows**. The word `couscous` appears only in recipe 018’s English and French description/instructions as an optional accompaniment. There are no couscous ingredient rows and no `ingredientRefId` links to `ingredient-ref-couscous`. The serving suggestion is qualitative and does not establish a recipe quantity or preparation-state instruction. The official CNF portions independently support state forms for measurement scoping; no recipe edit or recipe link is proposed.

## Sources and limits

- **Existing ledger source S01:** Health Canada, [CNF 2015 Food Code 4420 serving size](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4420&lang=eng&wbdisable=true). The page’s bilingual name is dry couscous; it reports 100 mL = 73.1 g, 250 mL = 182.8 g, and “amount to make 125 mL” = 34.5 g. Only the two volume portions are assigned to the dry form.
- **Existing ledger source S02:** Health Canada, [CNF 2015 Food Code 4490 serving size](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4490). The page’s bilingual name is cooked couscous; it reports 100 mL = 66.4 g, 125 mL = 82.9 g, and 250 mL = 165.9 g. These three portions are assigned to the cooked form.
- **Existing ledger sources WP03-S164 and WP03-S165:** OQLF’s [cereal-product entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502225/couscous) and [prepared-dish entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502206/couscous) support the ingredient-versus-dish boundary; no new OQLF decision is proposed.
- The CNF sources are the 2015 edition pages, last modified 2019-03-01. This review does not claim current CNF 2026 values or row presence. The source does not provide a volume-fill protocol, cooking method, or water quantity. Portion values remain edition-specific ledger observations, not an app conversion.
- The 34.5 g amount-to-make entry remains separate from the forms. It has a stated dry input and prepared-product amount but no explicit cooked-state endpoint or preparation protocol; the existing ledger description preserves this limit. Do not infer an active yield or attach the observation to the cooked form.

## Static checks

- Re-read current `AGENTS.md`, the line 4828 plan item, roadmap, workflow, the R836–R838 integration README, R822, the live reference/form/ledger data, substitution rule files, picker implementation, and manifest recipe list.
- Checked current form/ID/name ownership and the existing R822 source and observation IDs; no new source ID is proposed.
- Projected the relevant search queries against current form-aware picker behavior and scanned all 114 manifest recipes / 1,123 ingredient rows.
- This is proposal-only documentation. The proposed integration changes only bundled database JSON. Under `AGENTS.md`, no software tests, build, emulator run, or deployment are needed; static JSON/package, ledger/schema, picker, corpus, encoding, and link checks are sufficient during integration.
