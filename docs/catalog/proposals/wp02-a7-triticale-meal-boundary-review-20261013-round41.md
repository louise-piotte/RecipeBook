# WP02 A7 — Triticale Meal Boundary Review (R41)

- Reviewed: 2026-10-13.
- Status: integrated documentation-only hold; no catalog, ledger, recipe, or generated data changed.
- Proposal-local source-ID prefix: `WP02-A7-TRITICALE-MEAL-BOUNDARY-20261013-R41-S` (sources S01–S06). These IDs belong only to this proposal and are not ledger records.
- Scope: current Canadian product evidence and Québec French naming for the unresolved `triticale meal` candidate. Keep it distinct from the active triticale grain, flour, and flakes. This is a focused update to the earlier grouped hold, not a claim that the phrase was never reviewed.

## Disposition

Keep `triticale meal` unresolved and unallocated. Add no active reference, alias, form, legacy identity, ledger candidate, measure, density, unit mapping, recipe link, conversion, yield, or substitution.

A current Saskatchewan supplier page lists `Meal` and `Flour` separately among its triticale applications, and a Canadian cracker ingredient declaration uses the exact term `triticale meal` [S01–S02]. This is stronger product evidence than a research-only phrase: a Canadian supplier presents meal as a distinct milling/application form, and the ingredient wording occurs in a Canadian food product. It still does not identify a standalone retail SKU, the product's grind or retained fractions, or a product-specific process. The cracker page supplies no Québec French ingredient name and currently marks the item out of stock; its label evidence is not a current availability claim.

Québec terminology supports `triticale` for the cereal and `farine de triticale` for its flour. The OQLF technical `gruau` entry concerns grits/coarse cereal particles and does not define triticale meal. The reviewed sources do not establish `gruau de triticale`, `semoule de triticale`, or another fr-CA display for this candidate [S03–S06]. Do not alias it to the active flour, grain, or flakes, and do not invent a French name from the word `meal` alone.

## Checklist and prior-review check

The [active A7 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1444) remains open for grain meals, malted/toasted flour identities, and gluten-flour equivalence. Its triticale-flour note explicitly leaves triticale meal unresolved. The [R40 malted-amaranth review](wp02-a7-malted-amaranth-flour-boundary-review-20261013-round40.md) concerns another cereal and process and is not duplicated here.

The [2026-10-11 residual meal review](wp02-a7-residual-grain-meals-followup-20261011.md) already recorded a grouped hold: Canadian ingredient declarations named triticale meal but did not state grind, milling fraction, or Québec French display. This R41 review adds the current manufacturer page [S01] and checks the exact local ownership and search behavior. The [triticale-flour review](wp02-section-a-triticale-flour-identity-review-20261012.md) and [triticale-flakes review](../proposals/wp03-section-f-triticale-flakes-identity-review-20261012.md) support those separate identities; neither establishes a meal specification. The R41 filename and source-ID prefix were not present in the proposal archive before this review.

## Live ownership and picker audit

Audit snapshot: **1,367 active references**, **100 forms**, **64 legacy-import candidates**, **1,699 research-ledger records**, **114 manifest-listed recipes**, and **1,123 ingredient rows**.

| Surface | Current owner or finding |
|---|---|
| Triticale grain | `ingredient-ref-triticale-grain` owns `triticale / triticale`, category `GRAIN_AND_CEREAL`. It has no aliases, attached form, default density, or unit mapping. |
| Triticale flour | `ingredient-ref-triticale-flour` owns `triticale flour / farine de triticale`, category `FLOUR_AND_STARCH`. It has no aliases or attached form; default density is null and unit mappings are empty. |
| Triticale flakes | `ingredient-ref-triticale-flakes` owns `triticale flakes / flocons de triticale`, category `GRAIN_AND_CEREAL`. It has no aliases or attached form; default density is null and unit mappings are empty. |
| Exact candidate ownership | No active reference or form owns `triticale meal`, `gruau de triticale`, or `semoule de triticale`. The legacy-import file has no triticale candidate. The three triticale ledger records belong to the active grain, flour, and flakes references; there is no separate meal candidate record. The flour decision itself keeps triticale meal unresolved. |
| Alias boundary | Do not put `triticale meal` on the grain, flour, or flakes row. A cereal species name does not identify which milling product is intended. |

The picker normalizes bilingual names and aliases, then prefers complete phrase matches before partial matches in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Static projections from the current package are:

| Query | Current result | Effect if a separate English `triticale meal` row were added |
|---|---|---|
| `triticale meal`; `meal triticale` | 0 references | `triticale meal` would return the new row; reversed word order would not be an exact phrase match. |
| `gruau de triticale`; `semoule de triticale` | 0 references | No French result unless a reviewed French name were later supported and added. |
| `triticale flour`; `farine de triticale` | `ingredient-ref-triticale-flour` only | Unchanged; keep these queries specific to flour. |
| `triticale flakes` | `ingredient-ref-triticale-flakes` only | Unchanged; keep this query specific to flakes. |
| `triticale` | Grain, flour, and flakes: 3 references | Would broaden to 4 results. |

These are search-index projections, not a live UI test. No picker change is proposed.

## Bundled recipe demand

I scanned all **114 manifest-listed recipe JSON files** and their **1,123 structured ingredient rows** in the [bundled package](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json). Searches of the complete serialized recipe files for `triticale`, `triticale meal`, and the candidate French phrases returned **zero file hits and zero ingredient-row hits**. No recipe supplies a meal amount, recipe link, or line to relink.

## Measurement, density, and substitution limits

- The active triticale references have null default densities and empty unit mappings; none has an attached form. The package contains no exact triticale-meal form or measurement.
- InfraReady's page lists a meal application but gives no package size, volume measure, weight-per-volume value, or grind specification. Metro's cracker label is not a measurement source.
- Do not infer a measure, density, cooking ratio, yield, or form conversion from triticale grain, flour, flakes, rye meal, or other cereal meals. No exact-form measurement evidence was found.
- No reviewed source supports replacing triticale meal with triticale flour, grain, or flakes, or substituting another cereal meal. Add no substitution rule.

## Sources and limits

Online sources checked on 2026-10-13.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| `WP02-A7-TRITICALE-MEAL-BOUNDARY-20261013-R41-S01` | InfraReady Products (1998) Ltd., [Triticale](https://www.infrareadyproducts.com/products/triticale), page title and introduction; “Applications” list; Saskatchewan contact address. | A current Canadian supplier describes triticale as a cereal and lists `Meal` and `Flour` separately among its triticale applications, alongside whole, bumped, flaked, and cracked forms. This supports a product-form signal separate from the already-active flour. | It is an applications list, not a standalone meal SKU or specification. It gives no particle size, milling fraction, French display, household measure, density, recipe, or substitution. The page's general nutrition/marketing statements are not catalog data. |
| `WP02-A7-TRITICALE-MEAL-BOUNDARY-20261013-R41-S02` | Metro Canada, [Breton Original, Multigrain and Garden Vegetable Flavoured Crackers Variety Pack](https://www.metro.ca/en/online-grocery/aisles/snacks/salty-snacks/crackers/original-multigrain-and-garden-vegetable-flavoured-crackers-variety-pack/p/055653672906), product number `055653672906`, ingredient section, Multigrain/Garden Vegetable/Original. | A Canadian product ingredient declaration uses `triticale meal` as one member of a named whole-grains list. | The product page marked the item out of stock when checked and warns that manufacturers can change information. A composite cracker label does not define the meal's grind or identify a standalone package; it supplies no French ingredient wording. |
| `WP02-A7-TRITICALE-MEAL-BOUNDARY-20261013-R41-S03` | Office québécois de la langue française, [triticale (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8480832/triticale), term and definition, attributed to Conseil international de la langue française (1974). | Supports Québec use of `triticale` as the cereal name and defines it as a wheat–rye hybrid. | It covers the cereal, not a meal product or processed-product display. |
| `WP02-A7-TRITICALE-MEAL-BOUNDARY-20261013-R41-S04` | Office québécois de la langue française, [farine de triticale (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497480/farine-de-triticale), preferred term and English translation. | Supports the active display `triticale flour / farine de triticale`; it provides a named comparator for keeping flour separate from meal. | It names flour only and does not define triticale meal or a flour/meal equivalence. |
| `WP02-A7-TRITICALE-MEAL-BOUNDARY-20261013-R41-S05` | Office québécois de la langue française, [gruau (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8430011/gruau), technical milling/grits entry (1983). | Shows that `gruau` is used for grits/coarse cereal particles in technical milling senses and that terminology varies by sense. | It is not a triticale-meal record and does not validate `gruau de triticale` as a Québec product name or alias. |
| `WP02-A7-TRITICALE-MEAL-BOUNDARY-20261013-R41-S06` | Statistics Canada, [Monthly Miller's Survey — 2024](https://www23.statcan.gc.ca/imdb/p3Instr.pl?Function=assembleInstr&Item_Id=1530723&a=1&lang=en), archived survey example, Question 10, “Triticale — grains.” | The survey distinguishes `Triticale flour` and `All other triticale products — specify`, showing the flour category separately from a catch-all for other products. | It is an archived survey questionnaire, not a consumer product standard. It does not name meal, determine how a mill should classify a specific meal, or establish retail availability or Québec French wording. |

## Next action

Keep triticale meal inactive and unallocated. Reopen if a Canadian or Québec-facing product source specifies a standalone triticale meal's milling/grind boundary and a Québec source supports its French display. Then rerun exact ownership, picker, and recipe checks. Research exact-form measures or substitution rules only if a specified product and recipe demand make them relevant; do not transfer values from adjacent triticale or cereal products.
