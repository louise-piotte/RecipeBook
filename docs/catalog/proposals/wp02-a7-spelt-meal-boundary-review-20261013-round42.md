# WP02 A7 — Spelt Meal Product and French Naming Boundary Review (R42)

- **Reviewed:** 2026-10-13
- **Status:** Integrated documentation-only follow-up hold. This source refresh changes no catalog, forms, legacy candidates, research ledger, or generated files.
- **Open checklist item:** WP02 A7, “Continue A7 review of other grain meals …” in the [active catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1444).
- **Scope:** Recheck the unresolved English product name *spelt meal*, separately from spelt flour, malted spelt flour, spelt flakes, puffed spelt, and einkorn (*petit épeautre*). This is a focused follow-up to the grouped hold in the [A7 residual grain-meals review](wp02-a7-residual-grain-meals-followup-20261011.md). It does not reopen triticale meal (R41) or malted amaranth flour (R40).
- **Proposal-local source IDs:** `WP02-A7-SPELT-MEAL-20261013-R42-S01` through `WP02-A7-SPELT-MEAL-20261013-R42-S10`. The prefix and filename were checked for collisions; these IDs are not ledger records.

## Disposition

Keep **spelt meal unresolved and unallocated**. Add no active ingredient reference, French or English alias, form, legacy identity, ledger candidate, density, unit mapping, recipe link, conversion, yield, or substitution.

The new review strengthens the product-form signal: a current Saskatchewan grain processor lists both **Meal** and **Flour** as spelt applications, and current Canadian cracker ingredient listings name **Spelt Meal** [S01–S03]. These sources do not provide a meal specification, grain fraction, particle size, preparation state, or a Québec French product display. Québec sources establish *épeautre* as the French name for *spelt* but do not establish a French name for this meal product. Keep the English candidate distinct from all active spelt and einkorn products until a Québec-facing source resolves that boundary.

## Prior review and neighboring identities

The 2026-10-11 residual A7 review found no exact owner for *spelt meal* and grouped it with other named cereal meals whose declarations lacked milling and Québec-language detail. This R42 review adds a current spelt-specific Canadian processor application page and rechecks local French naming; it is a focused source refresh of the prior hold, not a new candidate.

The current package separately owns `spelt flour / farine d'épeautre`, `malted spelt flour / farine d'épeautre malté`, `spelt flakes / flocons d’épeautre`, and `puffed spelt / épeautre soufflé`. The French phrase `farine d'épeautre` must not be used for the candidate: it already selects flour identities. `petit épeautre` belongs to the distinct einkorn references and is not a French alias for spelt meal.

## Exact ownership and picker projection

Snapshot read from the current bundled package on 2026-10-13:

| Store | Current snapshot | Exact candidate result |
|---|---:|---|
| Active ingredient references | 1,367 rows; SHA-256 `1a6117715e6c4dafb3a3d345bcab27ef601f30e97f8a479158432f774fcad597` | No exact owner for `spelt meal`. The nearest active rows are the four spelt identities listed above. There is no plain spelt-grain row. |
| Ingredient forms | 100 rows; SHA-256 `10d6ff7e9dce21aecb8bda299f16a04882fa6f17235d0d5a976de4ce9cf3da63` | No spelt-specific form or form term names meal. |
| Legacy import candidates | 64 rows; SHA-256 `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` | No exact spelt-meal candidate or alias. |
| Research ledger | 1,699 records; SHA-256 `c15e890e23039dca1ccca3923deab08be0a4b6e87fd76c0cc081a4ecb83e1a55` | No exact spelt-meal record. Earlier A7 review material remains the source for the grouped hold. |

Picker projections were checked against [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), using current reference displays, aliases, and form terms. The search checks complete normalized phrases first, then uses substring matching when no phrase result exists.

| Query | Current results |
|---|---|
| `spelt meal` | No results. |
| `spelt` | `puffed spelt`, `spelt flakes`, `spelt flour`, and `malted spelt flour` (4). |
| `meal` | `cornmeal`, `cracker crumbs`, `matzo meal`, `rye meal`, and `whole wheat meal` (5). |
| `farine d'épeautre` | `spelt flour` and `malted spelt flour` (2); the longer malted phrase also contains this complete phrase. |
| `gruau` | `hominy grits`, `oat groats`, raw buckwheat groats, rye meal, Scottish oatmeal, and sorghum grits (6). |
| `épeautre` | Einkorn berries and flour (`petit épeautre`), plus puffed spelt, spelt flakes, spelt flour, and malted spelt flour (6). |

An active spelt-meal row would add another result to broad `spelt` and `meal` searches. A future Québec French display would also change the relevant French query results; do not project or add `gruau d'épeautre` as a Québec alias on the strength of non-Québec labels alone. No query currently selects a spelt-meal identity.

## Recipe-demand audit

The current manifest lists **114 recipe files and 1,123 ingredient rows**. A scan of every manifest-listed recipe JSON file found **zero** occurrences of `spelt`, `épeautre`, `spelt meal`, or `gruau d'épeautre`, including ingredient rows and serialized recipe text. The manifest-ordered recipe-content digest is `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

The absence of bundled demand does not show the product is unused elsewhere. It means this library currently supplies no recipe line that requires an active spelt-meal picker result or a recipe link.

## Measurement and substitution limits

- No exact-form spelt-meal household measure, cup or spoon mass, density, or unit mapping was found in the reviewed Canadian product pages or current package data. The German mill page reports nutrition per 100 g, which is a nutrition basis and not a household-volume conversion [S10]. Do not infer a volume mapping from that figure or transfer one from spelt flour, other meals, or a composite cracker.
- The German mill describes its own product as whole cleaned spelt containing endosperm, bran, and germ and as less finely milled than wholegrain flour, with fine, medium, and coarse grades [S10]. This confirms that a named product can have a defined meal/flour boundary, but it is a different supplier and specification; it does not define the Saskatchewan processor's meal or the spelt meal in a Canadian cracker label.
- InfraReady's separate statement that *spelt flour* can replace wheat flour concerns flour only; neither it nor the mill's bread/muesli uses gives a meal substitution ratio [S01, S10]. Add no meal-to-flour, meal-to-grain, or cross-grain substitution rule.

## Source register

| ID | Source and locator | What it supports | Limits |
|---|---|---|---|
| `WP02-A7-SPELT-MEAL-20261013-R42-S01` | InfraReady Products, [Spelt](https://www.infrareadyproducts.com/products/spelt), “Applications” list and company contact block; accessed 2026-10-13. | Current Saskatchewan processor lists `Meal` and `Flour` separately for spelt; the page identifies the company at Saskatoon, Saskatchewan. | Application categories are not a standalone SKU or a milling specification. The page gives no grain fraction, particle size, precooking state, French display, or household measure. Its separate flour-substitution note is not about meal. |
| `WP02-A7-SPELT-MEAL-20261013-R42-S02` | Metro, [Dare Breton crackers variety pack](https://www.metro.ca/en/online-grocery/aisles/snacks/salty-snacks/crackers/original-multigrain-and-garden-vegetable-flavoured-crackers-variety-pack/p/055653672906), product 055653672906, ingredient declaration; accessed 2026-10-13. | A Canadian retailer's current listing includes the exact phrase `Spelt Meal` in a multigrain product's whole-grain ingredient list. | The composite ingredient list does not define the spelt meal's grind or processing. Metro marks the item out of stock and warns that label data can change; it gives no French spelt-meal phrase. |
| `WP02-A7-SPELT-MEAL-20261013-R42-S03` | Voilà, [Dare Breton Multigrain Crackers 225 g](https://voila.ca/products/dare-breton-crackers-multigrain-225-g/215865EA), “Ingredients” and product information; accessed 2026-10-13. | A second current Canadian retailer listing uses `Spelt Meal` in the whole-grains list. | It is the same branded composite food category, not an independent milling specification; retailer data may change and gives no French name or exact meal form. |
| `WP02-A7-SPELT-MEAL-20261013-R42-S04` | Office québécois de la langue française, [épeautre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354126/epeautre), preferred term and English equivalent; updated 2005. | Supports the Québec French base term `épeautre` for English `spelt`. | It names the cereal, not a meal product or a compound French ingredient display. |
| `WP02-A7-SPELT-MEAL-20261013-R42-S05` | OQLF, [gruau (GDT), porridge sense](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau), definition and preferred terms; updated 2002. | Records Québec/Canada `gruau` for an oatmeal porridge, with scope that can extend to porridge made from other cereals. | Does not define dry spelt meal or validate `gruau d'épeautre`. |
| `WP02-A7-SPELT-MEAL-20261013-R42-S06` | OQLF, [gruau (GDT), malt-crushing sense](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8430011/gruau), definitions and notes; dated 1983. | Shows a separate technical brewing sense for crushed malt grits and notes usage of `semoule` by some authors. | The entry is about malt crushing and grits, not a spelt-meal retail name. It does not settle a food-product display. |
| `WP02-A7-SPELT-MEAL-20261013-R42-S07` | Coop Vitality (Switzerland), [Pural spelt rusks](https://www.coopvitality.ch/fr/p/pural-biscottes-l-epeautre-sans-sucre-demeter-200-g-5144614), “Composition”; current product page. | French-language Swiss ingredient wording lists `farine d'épeautre` and `gruau d'épeautre complet` separately in one product. | The product is German-origin and sold through a Swiss retailer. It is evidence that the phrase exists outside Québec, not that it is the Québec label for the Canadian candidate or that the milling form matches. |
| `WP02-A7-SPELT-MEAL-20261013-R42-S08` | Équiterre, [Épeautre](https://www.bienmangerbonmarche.ca/fr/trucs-et-astuces/epeautre), Québec market guide, “Répertoire de l'épeautre”; current page accessed 2026-10-13. | The guide lists Québec-market spelt offerings such as grains, flakes, bran, and flour and uses `épeautre`. | The directory is not an exhaustive product census and does not prove no Québec meal product exists; it supplies no meal label. |
| `WP02-A7-SPELT-MEAL-20261013-R42-S09` | Recettes du Québec, [Petits pains au gruau et farine d'épeautre](https://www.recettes.qc.ca/recettes/recette/petits-pains-au-gruau-et-farine-d-epeautre-100525), ingredient list and step 2; published 2009. | A Québec recipe uses generic `gruau` separately from `farine d'épeautre`, without calling the gruau spelt. This cautions against treating bare `gruau` as an exact meal crosswalk. | User-submitted and old; it does not identify the cereal in the generic gruau line or establish a commercial spelt-meal name. |
| `WP02-A7-SPELT-MEAL-20261013-R42-S10` | Heimatsmühle, [Spelt Meal Fine/Medium/Coarse](https://www.heimatsmuehle.com/en/commercial-customers/products/spelt-meal-fine-medium-coarse), product description and nutrition panel; accessed 2026-10-13. | A German mill specifies its own whole-spelt meal, identifies it as coarser than wholegrain flour, offers fine/medium/coarse grades, and gives nutrition per 100 g. | A different mill's product cannot define the Canadian candidate. The 100 g nutrition basis is not a cup or spoon measure, density, or transferable unit mapping. |

## Next action

Keep the candidate unallocated. Reopen for integration only if a Canadian or Québec-facing producer or package supplies a bilingual display for the same spelt-meal product and enough item-specific process/grade detail to distinguish it from flour and whole grain. Then recheck the exact owner and picker projection. Research a household measure only from an exact-form source if a real recipe line needs one; do not infer it from the other supplier's wholegrain meal or from the multigrain cracker. Add substitution guidance only from meal-specific evidence with a defined recipe role and basis.

## Integration

The source refresh is recorded under the open A7 checklist and in the roadmap. The earlier A7 residual review already holds spelt meal, so no duplicate legacy candidate or ledger record was added. No catalog or numeric data changed. No tests were run for this documentation-only update.
