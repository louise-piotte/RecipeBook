# WP02 A7 — Malted Amaranth Flour Boundary Review (R40)

- Reviewed: 2026-10-13.
- Status: integrated documentation-only hold; no catalog, ledger, recipe, or generated data changed.
- Proposal-local source-ID prefix: `WP02-A7-MALTED-AMARANTH-FLOUR-20261013-R40-S` (sources S01–S07). These IDs belong only to this proposal and are not ledger records.
- Scope: flour made from malted amaranth, considered separately from plain amaranth flour, the already-active sprouted amaranth flour, amaranth grain/malt, and generic malt flour. This is not a re-review of A7’s amaranth-meal hold.

## Disposition

Keep malted amaranth flour **unresolved and unallocated**. Add no active reference, alias, form, legacy identity, ledger candidate, measure, density, unit mapping, recipe link, conversion, yield, or substitution.

A peer-reviewed bread study prepares malted amaranth by germinating the grain, steaming it, drying it, and milling it for a test formulation. That establishes an experimental ingredient, not a current Canadian or Québec malted-amaranth-flour product or a commercial process specification. An Ontario supplier already sells `Sprouted Amaranth Flour`, while the study's malted flour includes post-germination steaming; neither source establishes that these materials are equivalent or mutually exclusive. Do not add a second active flour row or alias the experimental term to the sprouted-flour row without a product-level crosswalk.

OQLF supports the base French term `amarante` and notes that its seeds can be ground into flour. `Farine d’amarante maltée` is a literal search phrase only: no reviewed Québec source uses it as a malted-amaranth product label or validates it as a display or alias.

## A7 and archive check

The [active A7 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1444) still calls for other grain meals, malted/toasted flour identities, and gluten-flour equivalence. The [R39 malted-rice review](wp02-a7-malted-rice-flour-boundary-review-20261013-round39.md) is a separate archive item; it does not cover amaranth. No prior A7 proposal adjudicates malted amaranth flour.

Adjacent decisions are bounded: [R29 holds amaranth meal](wp02-a7-amaranth-meal-boundary-review-20261013-round29.md), while the [A6 integration](../batches/wp02-a6-quinoa-amaranth-flour-integration-20261011/README.md) added the source-named `sprouted amaranth flour / farine d'amarante germée`. The [A6 Québec wording review](wp02-a6-quinoa-amaranth-quebec-wording-review-20261011.md) reviews the sprouted form only. None defines malted amaranth flour or its relationship to the active sprouted product. The R40 proposal filename and source-ID prefix were unused before this review.

## Live ownership and picker audit

Audit snapshot: **1,367 active references**, **100 forms**, **64 legacy-import candidates**, **1,699 research-ledger records**, **114 manifest-listed recipes**, and **1,123 ingredient rows**.

| Surface | Current owner or finding |
|---|---|
| Amaranth references | `ingredient-ref-amaranth-flour` owns `amaranth flour / farine d'amarante`, with English aliases `rajgira flour`, `rajgira atta`, and `ramdana flour`. `ingredient-ref-sprouted-amaranth-flour` owns `sprouted amaranth flour / farine d'amarante germée`. Both are `FLOUR_AND_STARCH`, with null default density and empty unit mappings. No active reference names malted amaranth flour. |
| Other amaranth products | `ingredient-ref-amaranth-grain`, `ingredient-ref-amaranth-flakes`, `ingredient-ref-amaranth-greens`, and `ingredient-ref-puffed-amaranth` own the grain, flakes, greens, and puffed forms. None is a flour-form owner for the candidate. The active plain flour and sprouted flour remain distinct; this review does not infer an equivalence between them or malted amaranth. |
| Generic malt | `ingredient-ref-malt-flour` owns `malt flour / farine maltée`, with English alias `malted cereal flour`. It has no density, unit mapping, or form and does not specifically own malted amaranth flour. |
| Forms | The 100-form package has no amaranth flour or malt-flour form. No form currently defines a malted or sprouted amaranth processing relation. |
| Legacy and ledger | Searches of all 64 legacy candidates and 1,699 research-ledger records found no owner for `malted amaranth flour`, `amaranth malt flour`, or a French malted-amaranth phrase. The accepted sprouted-flour identity is a separate record. No candidate is proposed for either store. |
| Proposal archive | The archive contains the amaranth-meal hold and the A6 sprouted-amaranth-flour work, but no prior A7 malted-amaranth-flour decision. These neighboring reviews do not resolve the malted-versus-sprouted product boundary. |

The picker uses normalized names, aliases, and attached form terms in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Static projections from the current package are:

| Query | Current results | If a separate row used `malted amaranth flour / farine d'amarante maltée` |
|---|---:|---:|
| `malted amaranth flour`; `amaranth malt flour`; `farine d'amarante maltée` | 0 | 1 for the two proposed display phrases; the other phrase remains 0 |
| `amaranth flour` | 2: plain and sprouted amaranth flour | 3 |
| `farine d'amarante` | 2: plain and sprouted amaranth flour | 3 |
| `amaranth` | 6 related references | 7 |

These are search-index projections, not a live UI test. Adding an unallocated third flour choice would broaden both flour queries and the general amaranth query, with no current recipe demand. No picker change is proposed.

## Bundled recipe demand

I scanned all **114 manifest-listed recipe JSON files** and their **1,123 structured ingredient rows** in the [bundled package](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json). Searches for the English and French malted-amaranth phrases returned **zero full-recipe matches and zero ingredient-row matches**. No structured ingredient row mentions amaranth. The bundle therefore supplies no demand, recipe link, amount, or line to relink.

## Measurement, density, and substitution limits

- The active plain and sprouted amaranth-flour references have no default density, unit mapping, or form-level density. No exact-form measure or density for malted amaranth flour was found.
- The Québec Food Directory gives a **40 g serving** for one named plain organic amaranth flour, without a volume measure. This is a product-specific serving only; it is not a density or reusable mapping and must not be transferred to malted amaranth flour.
- The 2022 study tests a particular **70:30 wheat-to-malted-amaranth composite flour** in bread. That formulation is not a general wheat-flour substitution, a substitution for plain/sprouted amaranth flour, or a recipe rule. Its germination, steaming, drying, and milling conditions are study-specific process data, not home measurement or flour yield conversions.
- No reviewed source supports an exact-form volume-to-weight mapping, density, general yield, same-ingredient form conversion, or broadly scoped substitution. Add none.

## Sources and limits

Online sources checked on 2026-10-13.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| `WP02-A7-MALTED-AMARANTH-FLOUR-20261013-R40-S01` | Onyango et al., [“Utilisation of Amaranth and Finger Millet as Ingredients in Wheat Dough and Bread for Increased Agro-Food Biodiversity”](https://www.mdpi.com/2304-8158/11/7/911), *Foods* 11(7) (2022), 911, DOI [10.3390/foods11070911](https://doi.org/10.3390/foods11070911); abstract, sections 2.1–2.4, and conclusions. | Primary study processes amaranth by malting, steaming, drying, and milling, then tests malted amaranth in a 70:30 wheat composite flour. | Experimental grain and bread formulation; it establishes neither a commercial Canadian product nor Québec French naming, household measure, or general substitution. |
| `WP02-A7-MALTED-AMARANTH-FLOUR-20261013-R40-S02` | Everspring Farms, [Sprouted Amaranth Flour](https://www.everspringfarms.ca/product/sprouted-amaranth-flour/), product title, product codes/origin, description, and package details. | Current Ontario supplier productizes sprouted amaranth flour as separate wholesale SKUs. This is the key active-product neighbor. | It is named sprouted, not malted; the page does not compare it with malted flour or publish a full process standard. |
| `WP02-A7-MALTED-AMARANTH-FLOUR-20261013-R40-S03` | Everspring Farms, [Sprouting](https://www.everspringfarms.ca/sprouting/), “How We Create High-Quality Sprouted Grain and Seed Products” and “Baking with Sprouted Flour.” | Describes controlled soaking, moisture, warmth, oxygen, germination, sprouting, and milling capabilities. | A supplier-level sprouting description, not a malted-amaranth SKU or proof that sprouted and malted amaranth flour are equivalent. |
| `WP02-A7-MALTED-AMARANTH-FLOUR-20261013-R40-S04` | Office québécois de la langue française, [*amarante* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503667/amarante), preferred term and note (updated 2009). | Supports Québec French `amarante`, its feminine gender, and the fact that amaranth seeds may be ground into flour. | Does not name malted amaranth flour or validate `farine d’amarante maltée`. |
| `WP02-A7-MALTED-AMARANTH-FLOUR-20261013-R40-S05` | Aliments du Québec, [*Farine d'amarante biologique*](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/farine-damarante-biologique), product title, producer, description, and listed formats. | Current Québec producer listing uses `farine d'amarante` for a plain amaranth flour. | Not a malted product; its description recommends blending with other flours and does not establish a malted name or measure. |
| `WP02-A7-MALTED-AMARANTH-FLOUR-20261013-R40-S06` | Répertoire des aliments québécois, [Cuisine Soleil, *Farine d'Amaranthe Biologique*](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223777), product ingredients, serving portion, and update field (2026-04-09). | Current Québec product record identifies a plain organic amaranth flour and lists a 40 g serving. | The registered title's spelling and the plain-product portion do not establish a malted identity, Québec display, density, or reusable volume measure. |
| `WP02-A7-MALTED-AMARANTH-FLOUR-20261013-R40-S07` | Port Royal Mills, [Canadian supplier overview](https://www.portroyalmills.com/), company scope and product list (2026 page), lines 35–39 and 55–89. | Canadian mill lists amaranth, malted barley, and malted wheat among its grain product families, separately. | Its public list has no malted-amaranth flour SKU; this is a bounded supplier-page observation, not proof of market-wide absence or Québec French wording. |

## Next action

Keep malted amaranth flour inactive and unallocated. Reopen if a Canadian or Québec-facing producer identifies a standalone malted-amaranth-flour product and explains how it differs from its sprouted amaranth flour, and a Québec source supports the French display. Then rerun owner and picker checks. Research exact-form measures and any recipe-specific use separately; do not infer them from plain or sprouted amaranth flour or the study's bread ratio.
