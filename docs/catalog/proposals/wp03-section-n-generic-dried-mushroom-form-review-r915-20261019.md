# WP03 Section N proposal — generic dried-mushroom form review (R915)

- **Reviewed:** 2026-10-19
- **Status:** Proposal only. This subtask writes this file alone; no seed data, ledger, recipes, plan, roadmap, workflow, or code is changed. No tests are run.
- **Scope:** Whether to add one dried form under the existing species-unspecified generic mushroom identity. No new identity or commercial-product coverage is proposed.
- **Plan anchor:** The open Section N item at [“Fresh, dried, powdered, canned, reconstituted, and soaking-liquid forms where used”](../../RecipeBook-global-ingredient-catalog-plan.txt#L7086). The item remains open for other forms and decisions.

## Recommendation

Add one generic dried form under the existing `ingredient-ref-mushroom` reference. The bilingual Health Canada recipe uses the general English phrase “dried mushrooms” and the French phrase “champignons séchés” for the same soup context, and explicitly describes dried mushrooms as an option in a soup otherwise made with fresh mushrooms. A Québec Télé-Québec recipe independently uses the same French wording for a dried forest blend. Together, these sources establish a useful generic culinary state and a clear fr-CA label. [S01–S03]

This form covers only an ingredient line that says **dried mushroom(s)** without naming a species or identifying a prepared blend. A named mushroom remains on its own identity and would need a separate form review. The form describes dry state only; it does not encode piece size, species composition, reconstitution, or use of soaking liquid.

The bundled corpus contains no generic dried-mushroom line, so do not link or rewrite a bundled recipe. The direct Canadian recipe evidence still makes the exact generic form useful for search and future generic recipe lines. Its recipe-specific quantity remains source-scoped; it does not establish a general dried-to-fresh conversion or substitution.

## Live package and recipe audit

The current bundled package has **1,939 ingredient references and 203 forms**. There is no mushroom-specific form under any mushroom reference. The active generic reference is `ingredient-ref-mushroom`, displayed as `mushroom / champignons`, with the English plural alias `mushrooms`, null density, and no unit mappings. Its ledger identity is verified and its measurement state is `not_yet_researched`.

Keep the existing `ingredient-ref-ground-dried-candy-cap-mushrooms` and `ingredient-ref-haitian-djon-djon-mushrooms` identities intact. Their documented dry presentations do not justify moving either identity under generic mushroom or attaching a generic form to their records. The separate `ingredient-ref-mushroom-seasoning` also remains a prepared seasoning identity.

The manifest covers **114 recipes and 1,123 ingredient rows**. The only generic mushroom ingredient lines are:

| Position | Existing line and link | Finding |
|---|---|---|
| `037#7` | `1 lb white mushrooms, sliced` → `ingredient-ref-mushroom` | Fresh-like and sliced wording; no dried state. |
| `037#12` | `extra sauteed mushrooms, to taste` → `ingredient-ref-mushroom` | Prepared garnish; no dried state or measured amount. |
| `089#3` | `1/2 box mushrooms` → `ingredient-ref-mushroom` | No state, species, or package size. |

Recipe `100#2` is `7 g ground dried candy cap mushrooms` and stays linked to the separate candy-cap identity. No bundled recipe link, quantity transfer, or relink is proposed.

## Prior coverage and current evidence

The 2026-10-09 fungi coordinator review reported no generic dried form, noted that the bundled dried-mushroom demand was the named ground candy-cap line, and cautioned that a vendor’s reconstitution directions did not support a general yield or fresh-equivalence rule. The mushroom-identity reviews likewise added no forms. The 2026-10-11 mushroom-seasoning review kept general mushroom powder unresolved and distinguished it from seasoning mixtures. R912 added the species-bounded black-trumpet identity without a form. This proposal leaves those decisions intact and adds current generic-form evidence that those identity-only passes did not assess.

| Evidence | Supports | Does not support |
|---|---|---|
| Health Canada’s bilingual mushroom-soup recipe [S01, S02] | Generic dried mushrooms as a culinary state, plus a direct English/French label pair. | A universal dried-to-fresh replacement, a species rule, or a reusable amount. Its 190 mL (¾ cup) dried-mushroom direction belongs to that soup recipe, which starts with specified fresh mushrooms. |
| Télé-Québec’s vol-au-vent recipe [S03] | Québec usage of `champignons séchés` and the preparation of a dried mushroom ingredient for cooking. | A generic package amount, blend composition, soaking time, liquid ratio, or drained yield. The recipe’s 14 g sachet, forest-blend wording, 250 mL water, and 20-minute rehydration remain within that recipe. |

## Proposed form row

If accepted, add only this form under the existing generic mushroom reference:

```json
{
  "id": "ingredient-form-mushroom-dried",
  "ingredientRefId": "ingredient-ref-mushroom",
  "formCode": "dried",
  "labelFr": "champignons séchés",
  "labelEn": "dried mushrooms",
  "prepState": "dry",
  "matchTermsFr": ["champignon séché"],
  "matchTermsEn": ["dried mushroom"],
  "densityGPerMl": null,
  "notesFr": "État sec sans espèce précisée. Les quantités et procédés de réhydratation restent propres à leur recette ou produit; aucune mesure, densité, conversion ou relation de rendement générale n’est établie.",
  "notesEn": "Dry state with no species specified. Quantities and reconstitution methods remain specific to their recipe or product; no general measure, density, conversion, or yield relationship is established.",
  "updatedAt": "2026-10-19T00:00:00Z"
}
```

The qualified full phrases identify the form in search. Keep the generic reference’s names, alias, density, and unit mappings unchanged. If integrated, record the sources and decision on an `ingredient_form` ledger record for the proposed ID, with `measurementState: researched_no_supported_value`; preserve the cited recipe amounts as source-level observations only. Leave substitution research uncompleted and add no rule.

## Name and state boundaries

| Term or state | Treatment |
|---|---|
| `dried mushrooms` / `champignons séchés` | Proposed bilingual displays for the species-unspecified dry form. The French wording is attested in Health Canada’s French recipe and Québec culinary usage. |
| `dried mushroom` / `champignon séché` | Singular match terms so a singular ingredient line can receive the same form hint. |
| Mushroom wording that names a species or another established identity | Keep on that identity; this proposal adds no species-specific form. |
| Ground dried candy caps | Preserve the existing separate reference; do not use this generic form for its recipe line. |
| Powdered, canned, reconstituted, and soaking-liquid states | Not represented by this form. They remain open for their own source and demand review. |
| Forest-blend or other named product wording | Do not add as an alias or generic identity. Keep any amount, composition, or preparation attached to its source recipe or product. |

This proposal does not claim that all mushrooms are interchangeable. The Health Canada soup instruction stays limited to that recipe; it does not become an active global or contextual substitution. No density, unit mapping, package yield, conversion, soak ratio, cooking instruction, or recipe link is proposed.

## Cross-category queue disposition

The active cross-category rule marks brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only research **out of scope** because commercial-product counts do not add ingredient diversity; stop those lines. No such roster research was pursued for this review. Existing branded identities and product-specific evidence remain unchanged, and no product-specific value is generalized. This proposal concerns one generic dry form only. [S04]

## Sources

Sources were accessed on 2026-10-19. Source IDs are local to this proposal and have not been added to the research ledger.

| ID | Source | Supports and limits |
|---|---|---|
| **WP03-GENERIC-DRIED-MUSHROOM-FORM-20261019-S01** | Health Canada, [Mushroom soup](https://www.canada.ca/en/health-canada/services/food-guide/eating-support/kitchen/recipes/mushroom-soup.html), Canada’s Food Guide. | Uses the general term “dried mushrooms” as an option instead of fresh mushrooms. The displayed 190 mL (¾ cup) applies to that one soup recipe and is not stored as a reusable conversion or measure. |
| **WP03-GENERIC-DRIED-MUSHROOM-FORM-20261019-S02** | Health Canada, [Soupe aux champignons](https://www.canada.ca/fr/sante-canada/services/guide-alimentaire/manger-favoriser/cuisine/recettes/soupe-champignons.html), Guide alimentaire canadien. | The French counterpart uses `champignons séchés` for the same recipe-specific option and amount. Supports the bilingual label; the amount is not generalized. |
| **WP03-GENERIC-DRIED-MUSHROOM-FORM-20261019-S03** | Télé-Québec Cuisinez, [Vol-au-vent aux champignons](https://cuisinez.telequebec.tv/recettes/7960/vol-au-vent-aux-champignons). | Québec culinary usage and preparation context for `champignons séchés`. The listed sachet, blend description, water amount, and rehydration duration belong only to this recipe. |
| **WP03-GENERIC-DRIED-MUSHROOM-FORM-20261019-S04** | [Generic ingredient coverage scope review](../batches/generic-ingredient-scope-review-20261019/README.md). | Confirms the cross-category rule that commercial-product counts do not add ingredient diversity; roster-only work is out of scope. |

## Proposal-only decision delta

Recommend one `dried / séché` form under `ingredient-ref-mushroom`, using exact generic bilingual terms and no reusable numeric value. Keep generic recipe demand absent in the current bundle, preserve named mushroom and seasoning identities, and leave every other Section N form question open. No tests are run because this is a proposal-only review.


## Root integration decision

Accepted and integrated as `ingredient-form-mushroom-dried` under `ingredient-ref-mushroom`. The ledger records bilingual generic dry-state evidence and one published 14 g portion for the Télé-Québec forest-mushroom blend, explicitly scoped to that recipe. The 250 mL water/20-minute rehydration method and Health Canada’s 190 mL alternative remain in their source contexts. No generic measure, density, conversion, yield, or substitution is active; the wider Section N forms item stays open. No tests were run for this database-JSON-only change under `AGENTS.md`. See the [R913–R916 integration README](../batches/wp03-r913-r916-generic-boundary-integration-20261019/README.md).
