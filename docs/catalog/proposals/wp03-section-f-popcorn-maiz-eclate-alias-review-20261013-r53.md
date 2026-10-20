# WP03 Section F: popcorn / *maïs éclaté* alias review — 2026-10-13

## Review record

- **Status:** proposal only; no catalog, ledger, plan, batch checklist, recipe, or generated file was changed.
- **Scope:** resolve the one French alias explicitly left pending for the existing popcorn identity. This does not review plain puffed corn as a separate product.
- **Checklist:** the Section F packet says the alternate French term *maïs éclaté* is inactive pending alias review ([plant-grains-cereals.md, popcorn row](../batches/plant-grains-cereals.md#L198)). The active Section F plan continues to leave the grits, corn-products, and remaining puffed-grain checklist open ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2466)).
- **Recommendation:** add French alias `maïs éclaté` to the existing `ingredient-ref-popcorn` (`popcorn / maïs soufflé`). Do not create a reference for the synonym or attach it to unpopped kernels. Keep `maïs à éclater` separate; it names the variety/product used before popping.

The current OQLF entry directly defines *maïs soufflé* as popped corn and lists *maïs éclaté* as a preferred co-term. A recent Télé-Québec guide uses *maïs éclaté* for the finished popped ingredient while separately calling the input *grains de maïs*. That supports one same-product French search alias. The recommendation leaves the established English and French displays unchanged.

## Ownership, forms, ledger, and archive audit

Read-only audit of the live package: **1,377 ingredient references, 100 forms, 64 legacy-import candidates, 1,707 ledger records, and 114 manifest-listed recipes / 1,123 ingredient rows**.

| Surface | Current owner/result | Disposition |
| --- | --- | --- |
| Active reference | `ingredient-ref-popcorn` is `popcorn / maïs soufflé`, category `GRAIN_AND_CEREAL`; both alias arrays are empty. It has no default density or unit mappings. | Keep its ID, displays, category, and numeric fields. Add only the exact French alias `maïs éclaté`. |
| Neighboring corn reference | `ingredient-ref-corn-kernels` is broad `corn kernels / maïs`, category `VEGETABLE_AND_AROMATIC`, with no aliases. | Keep the unpopped input separate. Do not add `maïs à éclater` to popcorn. |
| Forms | No form is attached to `ingredient-ref-popcorn`; no active form owns `maïs éclaté` or `maïs à éclater`. | No form or state relation is proposed. |
| Legacy candidates | None of the 64 candidates has an exact normalized display/alias for `maïs éclaté`, `maïs à éclater`, `maïs soufflé`, `popcorn`, or `éclaté`. | No legacy promotion or remapping. |
| Ledger | The popcorn record is `identityState: verified`; `measurementState` and `substitutionResearchState` are both `not_yet_researched`. It currently cites OQLF source `WP03-S26` and records that the alternate term was not activated. There is no ledger candidate for the popcorn identity or alias; the separate puffed-corn candidate remains held. | Keep the existing states. If integrated, record the alias decision and the additional sources without changing measurement or substitution status. |
| Proposal/archive | No focused popcorn-alias review or prior approval was found. The existing Section F row explicitly leaves this alias pending. The 2026-10-11 puffed-corn review mentions *maïs éclaté* only to prevent assigning an OQLF popcorn term to a different, unresolved puffed-corn product; it does not decide whether the synonym belongs on popcorn itself ([review](./wp03-section-f-residual-candidate-review-20261011.md#L23)). | This proposal resolves that separate, explicitly open alias question; it does not reopen the puffed-corn hold. |
| Source IDs | The new prefix `WP03-POP-ALIAS-20261013-` was absent from the ledger, proposal archive, and batch archive before assignment. | IDs below are unique to this proposal; existing OQLF source `WP03-S26` is reused, not reissued. |

Normalized exact-key audit used the repository search normalization (lowercase, diacritic and punctuation folding) across active references, form labels/match terms, and legacy candidates:

| Query/key | Current exact owner | Projected result if integrated |
| --- | --- | --- |
| `maïs éclaté` / `mais eclate` | None | `ingredient-ref-popcorn` only |
| `maïs soufflé` / `mais souffle` | `ingredient-ref-popcorn` | Unchanged |
| `popcorn` | `ingredient-ref-popcorn` | Unchanged |
| `maïs à éclater` / `mais a eclater` | None | Still none; not proposed as an alias |

## Picker and recipe consequences

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) first matches complete normalized word phrases and then falls back to substring matches. Today, the query `maïs éclaté` returns no reference. Adding that phrase as an alias makes the exact query return only `ingredient-ref-popcorn`. The existing `maïs soufflé` and `popcorn` queries remain singleton results. A one-word query `éclaté` would also begin returning popcorn because phrase matching finds that word inside the alias; this is a narrow, documented picker expansion, and the French source uses the full phrase specifically for popped corn. The broad query `maïs` already matches popcorn through its current French display and remains broad. `maïs à éclater` remains distinct and unmatched rather than selecting the popped product.

The full bundled corpus has **zero of 114 files and zero of 1,123 ingredient rows** containing the popcorn reference, `popcorn`, *maïs soufflé*, or *maïs éclaté*. No recipe link or line change is warranted. External Québec recipe evidence below establishes term use, not demand in the bundled recipe library.

## Numeric and substitution audit

This is a search-alias decision only. The ledger already leaves measurements and substitutions unresearched. RICARDO's current recipe gives one recipe-specific portion of 50 g (4 cups) of plain popped corn; this is not imported as a general density, measure, or conversion. No reviewed source establishes a transferable cooked yield, conversion, or substitution rule. Keep all numeric and substitution fields empty and unchanged.

## Source evidence

| Source ID | Source and locator | Supports / limits |
| --- | --- | --- |
| Reused `WP03-S26` | Office québécois de la langue française, [*maïs soufflé* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358440/mais-souffle), preferred terms and definition; updated 2017; rechecked 2026-10-13. | Defines the food as corn kernels popped by heat and lists both *maïs soufflé* and *maïs éclaté* as preferred French terms for English *popcorn*. This directly supports the proposed same-identity alias. It does not make the unpopped kernels the same product. |
| `WP03-POP-ALIAS-20261013-S01` | Office québécois de la langue française, [*maïs à éclater* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082773/mais-a-eclater), notes and definition; updated 1991; rechecked 2026-10-13. | Describes the corn variety with small, hard kernels used to make *maïs éclaté*. Supports keeping *maïs à éclater* on the pre-popping side of the boundary; it is not an alias for ready-popped popcorn. |
| `WP03-POP-ALIAS-20261013-S02` | Télé-Québec Cuisinez, [*Petit mode d’emploi pour le parfait maïs soufflé maison*](https://cuisinez.telequebec.tv/articles/314/petit-mode-demploi-pour-le-parfait-mais-souffle-maison), published 2024-02-29, ingredients and steps; rechecked 2026-10-13. | Separates input *grains de maïs* from the finished product and uses *maïs éclaté* for the popped result; also uses *maïs soufflé*. Current Québec culinary usage corroborates the OQLF synonym and state boundary. The recipe directions are not a reusable yield or conversion. |
| `WP03-POP-ALIAS-20261013-S03` | RICARDO, [*Popcorn sucré*](https://www.ricardocuisine.com/recettes/5034-popcorn-sucre), ingredient list and preparation; rechecked 2026-10-13. | Uses `50 g (4 tasses) de maïs éclaté nature` and describes coating it with caramel. Supports current recipe usage of the exact term for already-popped corn. The amount is one recipe observation, not a default measure or density. |

## Proposed disposition

For `ingredient-ref-popcorn`, preserve `nameEn: popcorn` and `nameFr: maïs soufflé`, and add only `maïs éclaté` to `aliasesFr`. Do not add English aliases, another identity, forms, forms-match terms, a recipe link, density, unit mapping, measurement, cooking yield, conversion, or substitution. Keep `maïs à éclater` out of this identity because it denotes the unpopped corn used as input. The proposal closes only the pending popcorn alias question; the wider Section F review remains open.
