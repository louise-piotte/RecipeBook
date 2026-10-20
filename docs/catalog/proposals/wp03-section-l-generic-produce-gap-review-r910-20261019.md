# WP03 Section L — unripe green tomato form review (R910)

**Status at drafting:** Proposal only. This subtask changed only this proposal file; no shared catalog, ledger, checklist, roadmap, or workflow file was edited.

**Reviewed:** 2026-10-19

**Plan anchor:** The exact unchecked Section L parent is [“Fresh, cherry, plum, whole canned, diced, crushed, tomato pulp, puréed, passata, paste, sun-dried, and oil-packed tomato identities/forms”](../../RecipeBook-global-ingredient-catalog-plan.txt#L6731). Its existing tomato children cover the currently catalogued fresh, canned, and dried presentations. This review proposes one generic maturity-state form under the existing tomato reference; the broader Section L parent remains open. Recent context includes [Section L R667](../ingredient-catalog-workflow.md#L2799), [R865 tomato pulp](../ingredient-catalog-workflow.md#L3347), and [R908 produce-gap progress](../../../roadmap.md#L1570).

## Recommendation

Add one form under the existing generic tomato reference:

- Reference: `ingredient-ref-tomatoes`
- Form ID: `ingredient-form-tomatoes-unripe-green`
- English display: **unripe green tomatoes**
- Québec French display: **tomates vertes non mûres** (descriptive and provisional; not claimed as an OQLF-standardized compound)
- Form code: `unripe_green`
- Preparation state: `unripe`

This form represents tomatoes harvested before ripening and used as an unripe culinary ingredient. It is a maturity state of generic tomato, not a new botanical identity. Keep mature green cultivars, including varieties that remain green when ripe, within their current generic tomato identity. Do not alias bare `green tomato(s)` or `tomate(s) verte(s)` to the new form: the Québec recipe sources commonly use the shorter wording for end-of-season unripe fruit, but OQLF notes that some tomato varieties are green even when ripe. The added French qualifier is a clarity label based on that boundary, not a claim that an authoritative source has standardized the full compound. [S01–S03]

Keep tomatillo / tomatille separate. Keep the existing `green tomato ketchup / ketchup vert` reference separate from the fresh raw ingredient, and keep relish, chow-chow, and other prepared products distinct. This proposal adds no commercial brand, product line, flavour-family, SKU, or retailer variant.

## Names and alias boundaries

| Term | Proposed treatment | Limit |
|---|---|---|
| unripe green tomatoes | English display | Exact maturity and colour wording follows University of Maine Cooperative Extension’s “unripe, green tomatoes” description. |
| unripe green tomato | English form match term | Singular inflection of the source-attested phrase; qualified wording only. |
| tomates vertes non mûres | Québec French display; provisional descriptive compound | Québec recipe sources attest `tomates vertes` in end-of-season, less-ripe use. `non mûres` is retained to disambiguate the state; no standardized-term claim is made. |
| tomate verte non mûre | French form match term | Singular inflection of the qualified descriptive display. |
| green tomato(s); tomate(s) verte(s) | Do not add as aliases to the new form | Unqualified wording can describe cultivars that are green when fully ripe; bare phrases can also collide in search with the separate green-tomato-ketchup identity. |
| tomato(es); tomate(s) | Keep on the existing generic reference | These are already generic tomato terms and do not identify maturity. |
| tomatillo; tomatille; alkékenge du Mexique | Keep on the existing tomatillo identity | Distinct ingredient with different culinary properties; no equivalence is proposed. |
| ketchup vert; ketchup aux tomates vertes | Keep on `ingredient-ref-green-tomato-ketchup` | Prepared condiment, not the raw green tomato ingredient. |

The exact Québec compound remains the main naming limit. The proposed French wording is intentionally marked provisional and should receive local editorial review at integration; if that review cannot accept it, hold the French qualified display/match term rather than silently broadening aliases to `tomates vertes`.

## Current ownership, recipes, and picker projection

Read-only audit of the live data before drafting found the generic tomato reference and its fresh, canned, sun-dried, and oil-packed forms, plus separate tomato pulp, tomato purée, tomato paste, tomato sauce, tomatillo, and green-tomato-ketchup references. No existing tomato form distinguishes unripe green fruit. The generic tomato reference has no default density or unit mappings. The ketchup and tomatillo records remain separate and untouched.

The active catalog, legacy-candidate file, and research ledger contain no owner for an unripe-green-tomato form or the proposed form ID. The generic tomato ledger has a Canadian Nutrient File observation for one red-ripe raw tomato. Its separate USDA comparison source notes that the historical SR28 182 g “large” portion is for NDB 11527, *Tomatoes, green, raw*; it does not record that value as a reusable observation or mapping. Do not transfer the CNF red-ripe portion, the USDA comparison value, or a prepared ketchup recipe amount to this candidate. The proposed form ID and source-ID prefix `WP03-L-UNRIPE-GREEN-TOMATO-R910-20261019-S` were unallocated in the review.

The manifest lists 114 bundled recipes and 1,123 ingredient rows. A scan of every listed recipe found no unripe/green-tomato ingredient wording, so no bundled recipe link is proposed. Québec recipe sources below show external regional culinary use; they do not establish demand in the bundled corpus.

The picker indexes form labels and match terms through their owning reference, matches complete word phrases before substring fallback, folds accents, and shows a form hint only when the entire query equals a form term ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). Expected effect:

| Query | Current result | With proposal |
|---|---|---|
| unripe green tomatoes; unripe green tomato | No result | Generic tomatoes with the unripe-green form hint. |
| tomates vertes non mûres; tomate verte non mûre | No result | Generic tomatoes with the unripe-green form hint. |
| green tomatoes | No result for this exact phrase | Generic tomatoes may match the phrase inside the form label, but the exact form hint will not appear because the query omits `unripe`. Do not add this phrase as an alias. |
| green tomato | Existing green-tomato-ketchup result | The qualified singular form match term also returns generic tomatoes, without a form hint because the query omits `unripe`. The ketchup result remains separate; no bare alias is added. |
| tomates vertes | Existing green-tomato-ketchup result via its French alias | Generic tomatoes may also match the qualified form phrase; the form hint will not appear because the query is incomplete. The ketchup result remains separate. |
| tomato(es); tomate(s) | Existing generic tomato and other current matches | Unchanged; no broad aliases are added. |
| tomatillo; tomatille | Existing tomatillo result | Unchanged. |

The incomplete green-tomato searches remain intentionally ambiguous and do not carry a maturity hint. Users can select the state explicitly with the full qualified phrase. Existing entries are preserved.

## Source review and limits

| Source ID | Source | What it supports and what remains source-specific |
|---|---|---|
| S01 (reuse `WP03-TC-20261009-S01`) | OQLF, [GDT: tomate](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082628/tomate), accessed 2026-10-19; last updated 1991. | Supports the Québec French/English base pair `tomate / tomato`, culinary use, and the boundary that some tomato varieties are green even when ripe. It does not establish a standardized French phrase for immature green tomatoes. Keep it owned by the existing generic tomato record. |
| S02 — `WP03-L-UNRIPE-GREEN-TOMATO-R910-20261019-S02` | University of Maine Cooperative Extension, [Ripen and Preserve End of Season Green Tomatoes](https://extension.umaine.edu/gardening/2014/09/16/maine-home-garden-news-september-2014/), accessed 2026-10-19. | Calls fall-harvest fruit “unripe, green tomatoes” and describes use in vegetable dishes, salads, salsa, pickles, relish, and fried green tomato slices. Supports maturity-state identity and general culinary use; it does not establish a Québec French term, universal recipe suitability, or a general safety/canning rule. The page’s preservation directions are not adopted. |
| S03 — `WP03-L-UNRIPE-GREEN-TOMATO-R910-20261019-S03` | Recettes du Québec, [Les tomates vertes: recettes, trucs, astuces](https://www.recettes.qc.ca/dossiers/thematiques-culinaires/dossier/les-tomates-vertes-188), accessed 2026-10-19. | A Québec collection describes end-of-season tomatoes gathered before cold weather as less ripe than usual and lists 17 recipes, including fried green tomatoes, pies, muffins, and ketchup. Supports local culinary demand and source wording in that maturity context; it is an editorial recipe collection, not a terminology authority or botanical standard. |
| S04 — `WP03-L-UNRIPE-GREEN-TOMATO-R910-20261019-S04` | Télé-Québec Cuisinez, [Ketchup vert](https://cuisinez.telequebec.tv/recettes/5613/ketchup-vert), accessed 2026-10-19. | The Québec recipe calls for 20 green tomatoes in one ketchup formula. This is a recipe-specific ingredient count, not a general count-to-weight measure, amount, or formulation for other ketchup. The finished ketchup remains separate from raw tomatoes. |
| S05 — `WP03-L-UNRIPE-GREEN-TOMATO-R910-20261019-S05` | USDA Agricultural Research Service, [Standard Reference Release 28, Food Group 11](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg11.pdf#page=2117), NDB 11527, *Tomatoes, green, raw*, accessed 2026-10-19. | The historical USDA entry lists 1 cup = 180 g, 1 large = 182 g, and 1 medium = 123 g. These are measures for that exact source item. The record label does not establish cultivar or explicitly resolve whether its green colour is a maturity state; keep the figures as source-level evidence and do not attach them to this form unless that identity is independently resolved. The cup’s cut basis is not further specified in the listed portion label. Add no active unit mapping, generic density, or red-ripe measure. |
| S06 — `WP03-L-UNRIPE-GREEN-TOMATO-R910-20261019-S06` | Utah State University Extension, [How to Grow Tomatillos in Your Garden](https://extension.usu.edu/yardandgarden/research/tomatillos-in-the-garden), accessed 2026-10-19. | In the context of seeking authentic tomatillo flavour, the page rejects green tomato as a replacement and distinguishes their flavour, texture, and juice. This supports keeping the two identities separate and, if recorded, only that contextual negative finding. It does not establish a universal rule for every dish or a reverse replacement. |

The short source labels S01–S06 above map to the full source IDs in the first column. No new measurement observation or active substitution rule is recommended for this proposal. The exact USDA quantities remain source-level evidence because the entry does not resolve the maturity ambiguity; the Tele-Québec count stays with its one recipe formula.

No manufacturer or retailer evidence was used. No commercial-product values were transferred. Recipe quantities remain with their exact recipe; the USDA portions remain with NDB 11527; the OQLF source stays owned by the existing generic tomato record.

## Recommended data scope if integrated

Add one form under `ingredient-ref-tomatoes`:

```json
{
  "id": "ingredient-form-tomatoes-unripe-green",
  "ingredientRefId": "ingredient-ref-tomatoes",
  "formCode": "unripe_green",
  "labelFr": "tomates vertes non mûres",
  "labelEn": "unripe green tomatoes",
  "prepState": "unripe",
  "matchTermsFr": ["tomate verte non mûre"],
  "matchTermsEn": ["unripe green tomato"],
  "densityGPerMl": null
}
```

The proposed display and match terms must retain the maturity qualifier. Keep the parent reference’s names and aliases, default density, and unit mappings unchanged; keep form density null. Do not add an active recipe link; no bundled recipe line names this state. Do not add an active substitution rule. Do not record the USDA portions as observations on this form unless the NDB 11527 identity is resolved as unripe green fruit; retain the exact source quantities and name only as source-level evidence in the meantime. Keep the Télé-Québec count only in its recipe context. Do not infer a form conversion, yield, cup density, or general count weight. The Utah State tomatillo comparison may be recorded as narrowly contextual evidence only; it does not justify a substitution rule.

No cooking, preservation, or food-safety instruction is proposed. The University of Maine source discusses preservation, but its canning and safety guidance is not generalized here.

## Cross-category scope disposition

The current [generic-ingredient scope review](../batches/generic-ingredient-scope-review-20261019/README.md) and [R908 progress](../../../roadmap.md#L1570) reaffirm the cross-category rule. Any brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only research encountered is **out of scope** because commercial-product counts do not add ingredient diversity; stop that research. The two Section F cereal-roster clauses and the named Anson Mills wheat-meal lead remain out of scope for that reason and were not pursued in this Section L review. Existing branded rows remain preserved, and product-only claims and amounts remain scoped to their source products.

**Proposal-only decision delta:** add one generic unripe-green maturity form under the existing tomato reference, with qualified bilingual terms and no new identity, recipe link, density, unit mapping, conversion, yield, or active substitution. Preserve the separate ketchup and tomatillo identities. Keep the USDA portions at source level pending maturity identification; keep the Québec recipe count within its formula.

No software tests, builds, emulator checks, or deployment were run; this is a proposal-only data review. Only this assigned proposal file was written by this subtask. Shared active-worktree edits were present before drafting and were not modified here.

## Root integration outcome (2026-10-19)

Accepted as one generic unripe-green maturity form under `ingredient-ref-tomatoes`, with the bilingual display and match terms kept maturity-qualified. The OQLF green-ripe-variety boundary and separate green-tomato-ketchup identity remain intact. USDA SR28 NDB 11527 measures and the Télé-Québec count remain source-level evidence only; no amount, conversion, density, yield, recipe link, or active substitution was transferred. See the [R910–R912 integration README](../batches/wp03-r910-r912-generic-integration-20261019/README.md).
