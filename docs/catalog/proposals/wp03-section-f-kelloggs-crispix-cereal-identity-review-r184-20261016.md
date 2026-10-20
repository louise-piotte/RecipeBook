# WP03 Section F: Kellogg’s Crispix cereal identity review (R184)

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Integrated (2026-10-16). The reference and evidence record are in the bundled catalog and research ledger; see the [R184 integration report](../batches/wp02-wp03-wp04-r184-gap-review-integration-20261016/README.md).
- **Open checklist:** Section F continues to request regional cereal-mix and preprocessed-grain coverage in the [active plan](../../RecipeBook-global-ingredient-catalog-plan.txt).
- **Candidate:** the current Canadian ready-to-eat SKU **Kellogg’s Crispix Cereal / Céréales Crispix**.
- **Recommendation:** Add identity-only `GRAIN_AND_CEREAL` reference `ingredient-ref-kelloggs-crispix-cereal`, with the manufacturer-backed bilingual product names. Keep aliases empty and add no forms, active measures, density, mappings, conversions, yields, recipe links, or substitutions.

## Product identity and Québec naming

WK Kellogg Co Canada currently identifies the product in English as **Kellogg’s Crispix Cereal** and in Canadian French as **Céréales Crispix**. The French manufacturer SKU page selects Québec and lists Provigo, Maxi, Voilà, Wholesale Club, and Metro Québec as retailer routes. Its current package selector shows 350 g [S01–S02]. The current Provigo Québec family-cereal listing independently titles the product **Kellogg’s Céréales Crispix**, 350 g [S04]. Use the concise manufacturer titles for bilingual catalog displays; the retailer wording is corroborating market evidence, not an alias or a terminology ruling.

WK Kellogg’s Canadian English brand page lists one current Crispix cereal product, **Kellogg’s Crispix Cereal** [S03]. The product pages describe a finished, ready-to-eat cereal combining corn and toasted rice. Their ingredient declarations include rice, milled corn, sugars, salt, turmeric, and vitamins/minerals [S01–S03]. This is a formulated packaged product, not a generic corn-and-rice blend or a form of either grain.

| Neighbor | Existing owner | Boundary |
|---|---|---|
| `corn flakes / flocons de maïs` | `ingredient-ref-corn-flakes` | Toasted corn flakes; Crispix is a differently formed corn-and-rice cereal. Keep distinct and do not map or substitute one for the other. |
| `crispy rice cereal / céréales de riz croustillantes` | `ingredient-ref-rice-cereal` | Rice-based crispy cereal; Crispix includes milled corn and has its own product identity. |
| `corn bran / son de maïs`, cornmeal, rice, brown-rice syrup, and turmeric references | Existing ingredient references | Label components remain separate from the complete cereal; the declaration gives no component quantities. |
| Other Kellogg’s and ready-to-eat cereals | Existing product or generic cereal identities | Keep this bilingual product choice separate from those formulations even where ingredients or uses overlap. |

The French product page lists one named product and one 350 g package, and the brand page lists only the Crispix cereal product. No current Canadian sibling flavour needs to be represented as part of a multi-product Crispix family in this proposal. Package size is not a separate ingredient identity.

## Ownership and source-collision audit

The working-tree snapshot contains **1,561 active ingredient references**, **122 ingredient forms**, **61 legacy-import candidates**, and **1,906 research-ledger records**, with **8,180 source entries**, **6,990 distinct source IDs**, and **5,785 distinct source URLs**.

Exact searches across active reference displays and aliases, ingredient-form labels and match terms, legacy-import names and aliases, ledger records, the active plan, proposal and batch archive, and the bundled recipe corpus found no active owner, legacy candidate, ledger identity, or focused proposal/hold for `Kellogg’s Crispix Cereal`, `Céréales Crispix`, `Crispix`, or proposed ID `ingredient-ref-kelloggs-crispix-cereal`. Exact `Crispix` search hits were absent from the plan, catalog archive, references, forms, legacy-import candidates, and ledger. `ingredient-ref-corn-flakes` and `ingredient-ref-rice-cereal` own only their respective cereal identities.

The proposal-local source IDs `WP03-CRISPIX-R184-20261016-S01` through `S04` and the English/French manufacturer product URLs, English brand-page URL, and Provigo French listing URL below were checked absent from ledger source IDs/URLs and the proposal archive.

## Picker projection

The current picker normalizes accents and punctuation, prefers complete word-phrase matches across display names and aliases, and falls back to substring matching only when no full phrase matches. A static projection from the current reference data shows:

| Query | Current results | With proposed display |
|---|---:|---:|
| `Crispix` / `Kellogg’s Crispix Cereal` | 0 / 0 | 1 proposed row / 1 proposed row |
| `céréales Crispix` | 0 | 1 proposed row |
| `corn flakes` | 1, `ingredient-ref-corn-flakes` | 1; the exact phrase remains with the corn-flakes identity |
| `crispy rice cereal` | 1, `ingredient-ref-rice-cereal` | 1; the exact phrase remains with the crispy-rice identity |
| `cereal` / `céréales` | 21 / 18 | 22 / 19 |
| `corn` / `rice` | 33 / 66 | 33 / 66; neither appears in the proposed display names |

The exact product and French product-class queries route to Crispix. Broad cereal queries gain one finished cereal. Because aliases stay empty, `corn flakes`, `crispy rice cereal`, `corn`, and `rice` do not become synonyms for the brand product.

## Recipe-corpus demand

The complete manifest corpus contains **114 recipe files and 1,123 ingredient rows**. Full serialized files and ingredient rows were searched for `Crispix`, `Kellogg’s Crispix Cereal`, and `Céréales Crispix`. There were **0 matching recipe files and 0 matching ingredient rows**. WK Kellogg separately publishes an English Crispix Peanut Butter Snack Mix recipe and a French Mélange croquant au beurre d’arachide Crispix recipe. They are separate recipes, not matched translations: the English recipe calls for 4 cups and yields 15 portions, while the French recipe calls for 6 cups and yields about 16 portions [S05–S06]. Neither is bundled-library demand, and their different recipe quantities and yields do not establish a cereal conversion or a recipe link.

## Numeric, preparation, and substitution boundaries

- **Package:** The manufacturer’s Canada SKU pages list a 350 g package [S01–S02]. This is package net mass, not a recipe quantity, portion, or yield.
- **Serving and density:** The manufacturer pages direct readers to SmartLabel for full nutrition data and do not provide a general volume-to-mass conversion. No verified product serving measurement is needed to establish the identity; add no active cup measure, density, or unit mapping.
- **Preparation:** Crispix is sold ready to eat. The pages do not establish a cooked form, preparation ratio, or yield. Add no form or yield.
- **Composition:** Rice, milled corn, sugars, and the other listed ingredients have no stated proportions. Do not split the product into component links or make a formula record from the label.
- **External recipe amounts:** WK Kellogg's English peanut-butter snack mix calls for **4 cups of Crispix** and yields 15 portions; its separately published French snack mix calls for **6 cups** and yields about 16 portions [S05–S06]. These amounts belong to different recipes; neither reports a cereal mass or supports a cup-to-mass conversion, package yield, or reusable portion.
- **Substitution:** The manufacturer describes snack use and publishes recipes that call for Crispix, but gives no tested quantity-qualified exchange with corn flakes, crispy rice cereal, or another product [S05–S06]. Add no global or contextual substitution.

## Source register

Sources accessed 2026-10-16. Proposal-local IDs are not ledger additions.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-CRISPIX-R184-20261016-S01` | WK Kellogg Co Canada, [Kellogg’s Crispix Cereal](https://www.wkkellogg.ca/en/products/crispix-krispies-cereal-product), product title, description, ingredients, package selector, and retailers. | Current Canada-English manufacturer SKU page. Supports the English product name, corn-and-toasted-rice description, ingredient list, and 350 g SKU. Full nutrition information is delegated to SmartLabel; no reusable measure is inferred. |
| `WP03-CRISPIX-R184-20261016-S02` | WK Kellogg Co Canada, [Céréales Crispix](https://www.wkkellogg.ca/fr/produits/cereales-crispix), product title, French description and ingredients, and Québec retailer selector. | Current Canada-French product page supports the exact French title, rice-and-milled-corn product boundary, Québec-facing retailer routes including Metro Québec, and 350 g size. It does not define a measure or substitution. |
| `WP03-CRISPIX-R184-20261016-S03` | WK Kellogg Co Canada, [Crispix English brand page](https://www.wkkellogg.ca/en/our-foods/our-brands/crispix), current products list. | Lists Kellogg’s Crispix Cereal as the brand’s cereal product. Supports current product-family scope, not a universal formula. |
| `WP03-CRISPIX-R184-20261016-S04` | Provigo Québec, [Céréales pour la famille](https://www.provigo.ca/fr/fr/alimentation/garde-manger/c-r-ales-et-petit-d-jeuner/c-r-ales-pour-la-famille/c/29894), current retailer listing. | Lists Kellogg’s Céréales Crispix, 350 g, supporting current Québec-facing product wording and package context. It is not an ingredient specification or nutrition-measure authority. |
| `WP03-CRISPIX-R184-20261016-S05` | WK Kellogg Co Canada, [Crispix Peanut Butter Snack Mix](https://www.wkkellogg.ca/en/recipes/crispix-peanut-butter-snack-mix). | Separate current Canadian English manufacturer recipe. Calls for 4 cups Crispix and yields 15 portions. This is one recipe's cereal quantity, not a cereal cup weight or reusable conversion. |
| `WP03-CRISPIX-R184-20261016-S06` | WK Kellogg Co Canada, [Mélange croquant au beurre d’arachide Crispix](https://www.wkkellogg.ca/fr/recettes/crispix-melange-croquant-au-beurre-darachide). | Separate current Canadian French manufacturer recipe. Calls for 6 cups Crispix and yields about 16 portions. It is not a translated version of S05; its recipe amount cannot be combined with S05 as one measure observation. Neither recipe supports a cereal cup weight, package yield, or substitution. |

## Recommendation

**Add identity-only `ingredient-ref-kelloggs-crispix-cereal` as `Kellogg’s Crispix Cereal / Céréales Crispix`.** Current Canadian manufacturer pages establish the cereal’s bilingual identity, and the French SKU page explicitly lists Québec retailers. Keep it distinct from corn flakes, crispy rice cereal, corn bran, and its component ingredients. Keep aliases empty and add no forms, reusable measurements, density, mappings, conversions, yields, recipe links, or substitutions. The Section F sweep remains open.
