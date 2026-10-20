# WP02 Section A7 R701: Wheatlets measurement evidence review

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Proposal only. This review changes no catalog JSON, research ledger, plan, workflow, roadmap, or recipe.
- **Plan anchor:** Section A7 remains open for other grain meals and milling products ([plan, line 2114](../../RecipeBook-global-ingredient-catalog-plan.txt#L2114)). R698 integrated `Wheatlets / Wheatlets` as an identity-only reference ([plan, line 21986](../../RecipeBook-global-ingredient-catalog-plan.txt#L22014); [workflow, R698 entry](../ingredient-catalog-workflow.md#L2927)).
- **Target:** Existing `ingredient-ref-wheatlets`, `Wheatlets / Wheatlets`, category `FLOUR_AND_STARCH`.
- **Selection audit:** R698 reviewed and integrated the identity, using the existing Ardent Mills English and French portfolio source entries. Its ledger row is identity `verified`, measurement `researched_no_supported_value`, and substitution `not_yet_researched`, with no measurement observations. R455 mentioned Wheatlets only as a distinct neighbor to granular flour. No earlier proposal reviews household measures or recipe amounts for the R698 reference.

## Recommendation

Keep the reference unchanged and retain `measurementState: researched_no_supported_value`. No source reviewed here supports a household portion, a recipe amount that can be tied to Ardent Mills product 10287, a mass-to-volume relation, a density, or a package yield for that exact product. The manufacturer source reports a 20 kg commercial format; that is package size only.

Do not transfer the amounts found for similarly named consumer wheatlets, Wheathearts, Cream of Wheat, or semolina products. Their sources do not identify Ardent Mills product 10287. Keep `defaultDensity` null, `unitMappings` empty, forms absent, and the measurement-observation list empty. Keep `substitutionResearchState: not_yet_researched`: the manufacturer's note that Wheatlets is useful where wheat middlings are required is an application statement, without a named recipe, replacement direction, or ratio. It does not support a substitution finding or rule.

No shared source or observation ID is allocated by this proposal. The review citations below are proposal-only; the R698 portfolio source entries remain the existing ledger evidence.

## Evidence and limits

| Source | Evidence checked 2026-10-18 | Disposition |
|---|---|---|
| Ardent Mills Canada, [Flour Portfolio](https://ardentmills.ca/media/2154/ardent-mills-flour-portfolio_en.pdf); existing ledger source `WP02-A7-GRANULAR-FLOUR-R455-20261017-S03`, reused on the Wheatlets row by R698. | Names code 10287 Wheatlets as a coarse granular product from purified wheat endosperm and says it is useful where wheat middlings are required. | Product/application evidence only. It gives no household measure, formula, serving mass, density, or quantitative replacement. Do not reinterpret the application statement as a substitution ratio. |
| Ardent Mills Canada, [Gamme de farine](https://contentlibrary.ardentmills.com/m/2f1bc7848e6b9a0/original/FR-Flour-Portfolio.pdf); existing ledger source `WP02-A7-GRANULAR-FLOUR-R455-20261017-S04`, reused on the Wheatlets row by R698. | The French-language portfolio also names Wheatlets and describes the coarse purified-endosperm product. | It adds no amount, recipe, density, or replacement evidence. Reuse the existing evidence; add no duplicate source entry. |
| Ardent Mills, [Portefeuille de farines (2018)](https://www.ardentmills.ca/media/2155/portefeuille-de-farines.pdf), pp. 2–3. | Lists `10287 WHEATLETS granules de blé` in a 20 kg format. | Confirms a manufacturer-listed commercial package size, not a household portion or recipe yield. The document gives no volume-to-mass value or density. |
| TraceGains, [Ardent Mills supplier listing: WHEATLETS COARSE WHEAT GRANULES (10287)](https://gather.tracegains.com/market/wheatlets-coarse-wheat-granules-ardent-mills-ulc-canada-mississauga-on-484BEE9A-2D67-45D1-BB36-37C33E1D6A20). | The visible profile describes the same coarse, purified-endosperm product and lists a product specification sheet among the documents. The public profile text has no kitchen measure, recipe, mass-volume pair, or density value. | Supports exact product scope only. The listed specification sheet's underlying values were not available in the page text reviewed; do not assume it reports density or a usable kitchen measure. |
| Chicken Pieces, [Ardent Mills Wheatlets Coarse Wheat Granules #2, 20 kg](https://www.chickenpieces.com/ardent-mills-wheatlets-coarse-wheat-granules-2-20kg-unit-1-unit-case/). | The retailer identifies the Ardent Mills item and states a 20 kg package, with broad slow-cooking cereal and specialty-bread uses. The opened product page provides no dry serving amount, recipe formula, water ratio, cup conversion, or density. | Confirms commercial package scope only. Search-result summaries that were not present in the opened page were not treated as evidence. |
| Bulk Barn, [Creamy Wheatlets](https://www.bulkbarn.ca/en/Products/All/Creamy-Wheatlets-1533). | The store's product page gives cooking instructions for 1 cup (135 g), a four-serving yield, and a nutrition serving of 3/4 cup (100 g). Its ingredient declaration is wheat semolina. | These are source-specific amounts for Bulk Barn's separately named product. The page does not identify Ardent Mills, code 10287, or the R698 product description; do not attach these quantities to `ingredient-ref-wheatlets`. |
| Nadia's Cooking, [Qatayef (Walnut Filled Crêpes)](https://cookingmiddleeasternfood.com/2013/07/22/qatayef-walnut-filled-crepes/), ingredient list and method. | The recipe for about 20 crêpes lists 250 mL (1 cup) `wheatlets (wheathearts)` in the batter. It gives no mass, supplier, wheat class, or product code. | A recipe amount for an unqualified similarly named ingredient, not a source-matched amount for Ardent product 10287. Do not record it as a Wheatlets observation or derive density. |
| Nadia's Cooking, [Harissy or Nammoura (Wheatheart Cake)](https://cookingmiddleeasternfood.com/2011/11/30/harissy-or-nammoura-wheatheart-cake/). | The recipe lists 500 mL (2 cups) `smeed/wheatlets (wheathearts/semolina) – preferably coarse`; no mass or product identity is supplied. | The page groups the term with semolina and does not establish a match to the Ardent product. Do not transfer this recipe quantity. |
| Quick German Recipes, [Mutti's German Poppy Seed Cake with Streusel](https://www.quick-german-recipes.com/poppy-seed-cake-recipe.html), filling ingredients and method. | Lists 1/3 cup (50 g) `Wheatlets (Cream of Wheat)` and directs readers to cook it as cereal with water. | The explicit Cream of Wheat/cereal context is not identified as the coarse Ardent milling product. Do not attach the amount to the target. |
| Maxi, [Clic Wheatlets Medium](https://www.maxi.ca/en/wheatlets-medium/p/20845666_EA?icta=recommended-carousel). | The product page reports a 42 g serving for a separately named medium wheatlets product, without a volume equivalent or an Ardent/code 10287 match. | No mass-volume measure for the target. Keep the serving attached to that product only. |

The targeted search also found processed breads that list “Wheatlets” in their ingredient declarations, but their serving weights describe finished bread and do not disclose the Wheatlets amount. No exact-product recipe with an amount, manufacturer-published kitchen portion, or product-matched density was found. No public source reviewed gives a wheatlets-to-wheat-middlings replacement formula.

## Current catalog, ledger, archive, and picker review

- The active reference has empty aliases, null default density, and empty unit mappings. No form or substitution rule targets this ID. No recipe line uses the ID.
- The existing ledger row has no measurement observations. R698's recipe-corpus audit found no Wheatlets hits or recipe links in the 114-file / 1,123-row bundle; this review found no reason to change that snapshot.
- The archive contains the R698 identity review and R455's neighboring granular-flour review, but no earlier measurement proposal targeting `ingredient-ref-wheatlets`.
- The current picker resolves `Wheatlets` to the R698 reference. No name or alias change is proposed, so picker behavior and neighboring results remain unchanged. Do not add `wheathearts`, `sooji`, `semolina`, or generic product-description phrases as aliases from these measurement sources.

## Proposed disposition

Retain the current ledger measurement state `researched_no_supported_value`, with no new measurement observation or source entry. Leave the identity, aliases, forms, density, unit mappings, conversions, yields, recipe links, and substitutions unchanged. Reopen only if a source identifies Ardent Mills code 10287 (or otherwise documents the same exact milling product) and publishes a household measure, a quantified recipe use, or a method-qualified density. A future observation must preserve that product, preparation, and method scope; it must not become an active conversion without separate evidence and review.

This was proposal-only source, archive, recipe-corpus, and picker review. No software tests, build, emulator run, or deployment were performed.
