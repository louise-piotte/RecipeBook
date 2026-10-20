# WP02 A7 — Purple Wheat Meal Product and Québec French Boundary Review (R43)

- **Reviewed:** 2026-10-13
- **Status:** Proposal for a documentation-only hold; this proposal edits no shared file and changes no catalog data.
- **Open checklist item:** Continue A7 review of other grain meals, malted/toasted flour identities, and gluten-flour equivalence in the [active catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1444).
- **Scope:** Focused refresh of the previously grouped purple-wheat-meal hold. This review does not reopen malted amaranth flour (R40), triticale meal (R41), spelt meal (R42), or other wheat-meal candidates.
- **Proposal-local source IDs:** WP02-A7-PURPLE-WHEAT-MEAL-20261013-R43-S01 through S05. These are proposal-local and are not ledger records.

## Recommendation

Keep purple wheat meal unresolved and unallocated. Add no active reference, alias, legacy identity, ledger candidate, form, measure, density, unit mapping, recipe link, conversion, yield, or substitution.

This is a focused source refresh of the earlier grouped hold in the [A7 residual grain-meals review](wp02-a7-residual-grain-meals-followup-20261011.md), which already found no exact owner for purple wheat meal. A current Canadian processor now gives a purple-wheat-specific application list in which Meal and Flour appear as separate forms. A Canadian cracker declaration also uses the English phrase purple wheat meal. These establish a meaningful product-form question, but neither source specifies the meal's milling fraction, particle size, preparation state, or a standalone retail SKU.

The Québec French evidence does not resolve the form. A French Metro ingredient listing uses farine de blé pourpre in a whole-grain ingredient list, but it is a different product number from the English cracker listing and does not link that French phrase to purple wheat meal. A French Canadian technical report uses blé pourpre for the crop and documents whole-grain purple-wheat flour prototypes; it does not name a meal product. Do not assign farine de blé pourpre, gruau de blé pourpre, or semoule de blé pourpre to the meal candidate without a source that identifies that exact form.

## Product and bilingual boundary

| Evidence | What it establishes | Boundary |
|---|---|---|
| InfraReady's current Purple Wheat / AnthoGrain page lists Meal and Flour as separate applications for purple wheat. | The processor treats meal and flour as distinct possible forms of this grain. | The page is an application list, not a meal SKU or milling specification. |
| Metro's English listing for Breton product 055653672906 uses purple wheat meal within a composite whole-grains list. | The English phrase occurs in a current Canadian retailer product listing. | A cracker ingredient declaration does not define the meal or show that it is sold separately; the page showed the product out of stock when checked. |
| Metro's French listing for a different Breton product number, 055653629900, uses farine de blé pourpre in its whole-grains list. | This is Québec retail evidence for the French crop phrase in an ingredient declaration. | It is not the same product number as the English listing and does not establish a bilingual meal-to-flour crosswalk. Direct retrieval returned 403; the wording was available in the indexed result. |
| The AgriRéseau technical report uses blé pourpre / AnthoGrain and describes whole-grain flour prototypes. | The French base crop wording is attested in Canadian agricultural material. | The report is older research and does not establish a current meal product or French meal display. |

Do not treat purple wheat meal as an alias of active whole wheat meal. Do not infer that Metro's French farine de blé pourpre is the French equivalent of the English purple wheat meal phrase. The phrase may belong to a flour identity, which is outside this review.

## Exact ownership and picker projection

Live data snapshot checked on 2026-10-13:

| Store | Current snapshot | Exact candidate ownership |
|---|---:|---|
| Active ingredient references | 1,367 rows; SHA-256 1a6117715e6c4dafb3a3d345bcab27ef601f30e97f8a479158432f774fcad597 | No reference owns purple wheat meal, purple wheat, AnthoGrain, blé pourpre, or farine de blé pourpre. |
| Ingredient forms | 100 rows; SHA-256 10d6ff7e9dce21aecb8bda299f16a04882fa6f17235d0d5a976de4ce9cf3da63 | No form or form term identifies the candidate. |
| Legacy import candidates | 64 rows; SHA-256 69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005 | No exact candidate or alias. |
| Research ledger | 1,699 records; SHA-256 c15e890e23039dca1ccca3923deab08be0a4b6e87fd76c0cc081a4ecb83e1a55 | No exact purple-wheat-meal record. The earlier grouped hold remains in proposal documentation only. |

The nearest active wheat-meal identity is ingredient-ref-wheat-meal, displayed as whole wheat meal / farine de blé entier brute, with farine de blé complet brute as its French alias. Its default density is null and its unit mappings are empty. It is not a purple-wheat identity. Whole-wheat flour, malted wheat flour, roasted wheat flour, and roasted wheat malt flour are separate active references; none owns the purple-wheat terms. No purple-wheat grain, meal, or flour identity is active.

Picker projections use current ingredient displays, aliases, and attached form terms with the complete-phrase-first behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt):

| Query | Current result |
|---|---|
| purple wheat meal | 0 |
| AnthoGrain | 0 |
| purple wheat | 0 |
| blé pourpre | 0 |
| farine de blé pourpre | 0 |
| gruau de blé pourpre | 0 |
| meal | 5: cornmeal, cracker crumbs, matzo meal, rye meal, and whole wheat meal |
| wheat | 43 references, including the active wheat meal and separate wheat flour, grain, bran, flakes, and malted/toasted products |

An accepted new row would make exact English phrase searches selectable and would broaden the general wheat and meal searches. A French name would affect its own broad phrase searches; no French meal name is proposed here.

## Bundled recipe demand

I scanned all 114 recipe files listed in the [bundled package manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), covering 1,123 structured ingredient rows and serialized recipe text. Searches for purple wheat, purple wheat meal, AnthoGrain, blé pourpre, blé violet, farine de blé pourpre, and gruau de blé pourpre found zero file hits and zero ingredient-row hits. The bundle supplies no demand, amount, recipe link, or reason to add an active picker identity.

## Measurement and substitution limits

- No exact-form household measure, density, or unit mapping was found for purple wheat meal.
- InfraReady's meal/flour application list gives no volume, mass-per-volume value, package-to-kitchen conversion, or granulation. The cracker listing is not an exact-form measurement source.
- Do not transfer measurements from whole wheat meal, wheat flour, another cereal meal, nutrition panels, or a composite cracker serving.
- No reviewed source supports replacing purple wheat meal with purple wheat flour, whole wheat meal, another grain meal, or a different wheat form. Add no conversion, yield, or substitution rule.

## Source register

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| WP02-A7-PURPLE-WHEAT-MEAL-20261013-R43-S01 | InfraReady Products, [Purple Wheat a.k.a. AnthoGrain Wheat](https://www.infrareadyproducts.com/products/purple-wheat), page title, introduction, Applications list, and Saskatoon contact block; accessed 2026-10-13. | A current Canadian processor identifies AnthoGrain as purple wheat and lists Meal and Flour separately. The contact block places InfraReady in Saskatoon, Saskatchewan. | An application list is not a standalone SKU or grind specification. No French display, grain fraction, particle size, household measure, density, or substitution is provided. |
| WP02-A7-PURPLE-WHEAT-MEAL-20261013-R43-S02 | InfraReady Products, [Applications](https://www.infrareadyproducts.com/applications), “Whole Grain Flakes, Meals & Flours” and “Bakery & Breakfast Cereal Applications”; accessed 2026-10-13. | States AnthoGrain wheat can be processed into whole-grain meals and flours, and describes wheat as available in purple varieties. | General application information; it does not identify a meal grade, SKU, or French product name. The page's separate flour-substitution discussion is about spelt flour and is not applied here. |
| WP02-A7-PURPLE-WHEAT-MEAL-20261013-R43-S03 | Metro Canada, [Breton Original, Multigrain and Garden Vegetable Flavoured Crackers Variety Pack](https://www.metro.ca/en/online-grocery/aisles/snacks/salty-snacks/crackers/original-multigrain-and-garden-vegetable-flavoured-crackers-variety-pack/p/055653672906), product 055653672906, Ingredients section; accessed 2026-10-13. | The Multigrain and Garden Vegetable ingredient lists include purple wheat meal in their whole-grains lists. | A composite cracker label does not define the meal or its grind. The page showed the item out of stock and warns that product information can change. No French equivalent is given on this page. |
| WP02-A7-PURPLE-WHEAT-MEAL-20261013-R43-S04 | Metro Canada, [Craquelins multigrain Breton](https://www.metro.ca/epicerie-en-ligne/allees/collations/collations-salees/craquelins/craquelins-multigrain/p/055653629900), product 055653629900, indexed French Ingredients extract; checked 2026-10-13. | The indexed French ingredient list uses farine de blé pourpre within a whole-grains list. | Direct retrieval returned 403, so the indexed text could not be checked against the package. This is a different product number from S03 and does not establish an English-to-French meal translation, standalone flour specification, or meal grind. |
| WP02-A7-PURPLE-WHEAT-MEAL-20261013-R43-S05 | AgriRéseau, [Innovateurs canadiens en alimentaire](https://www.agrireseau.net/documents/Document_90797.pdf), printed p. 13 (PDF p. 12), project description at lines 704–719; accessed 2026-10-13. | Uses blé pourpre and AnthoGrain for the Canadian crop and describes research prototypes using whole-grain purple-wheat flour, including bran-enriched flour. | The report concerns an older research project and prototypes. It does not name a current retail meal product, define meal versus flour, or establish a Québec French meal display. |

## Next action

Keep purple wheat meal out of the active catalog and unallocated. Reopen only when a Canadian or Québec-facing producer or package identifies a standalone purple-wheat meal in both languages and states enough milling or grade detail to distinguish meal from flour and grain. Then rerun exact ownership, picker, and recipe checks. Research measures and substitutions only if a specified meal product and a matching recipe create a concrete need.
