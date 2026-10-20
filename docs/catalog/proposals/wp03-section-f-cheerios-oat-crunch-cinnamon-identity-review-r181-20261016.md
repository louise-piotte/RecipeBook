# WP03 Section F: Cheerios Oat Crunch Cinnamon identity review (R181)

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Root disposition recorded below; no catalog or ledger data was integrated.
- **Open checklist:** The active plan still has the Section F item for regionally significant cereal mixes and preprocessed grains [Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L3513).
- **Candidate:** the current Canadian ready-to-eat SKU titled **Oat Crunch Cinnamon Cheerios**.
- **Recommendation:** Add identity-only `GRAIN_AND_CEREAL` reference **`Oat Crunch Cinnamon Cheerios / Croquantes à l’avoine Cannelle Cheerios`**, proposed ID `ingredient-ref-cheerios-oat-crunch-cinnamon`. Keep aliases empty. Add no forms, active measures, density, mappings, conversions, yields, recipe links, or substitutions.

## Product boundary and bilingual naming

General Mills' current Canadian English and French product pages identify the same cinnamon-flavoured, oat-topped multigrain ready-to-eat cereal. Use their exact bilingual product titles: **Oat Crunch Cinnamon Cheerios** and **Croquantes à l’avoine Cannelle Cheerios** [S01–S02]. The French manufacturer's product title is the best-supported Quebec-facing catalog display; current Provigo Québec listings independently use `Cheerios Croquantes à l'Avoine, Saveur Cannelle, Format Familial` and give the same 516 g package size [S03]. Keep the retailer's longer title as source evidence, not as an alias.

The product is one formulated boxed cereal. The manufacturer's description says multigrain cereal is topped with whole-grain oats, and its current ingredient list includes oats, whole-grain corn, brown-rice flour, cinnamon, sugars, starches, oils, salt, and fortification ingredients. Do not model it as generic multigrain flakes, rolled oats, or an ingredient bundle. The manufacturer's product catalog lists **Oat Crunch Almond**, **Oat Crunch Cinnamon**, and **Oat Crunch Oats ’N Honey** as distinct products; keep this identity limited to Cinnamon [S01–S02, S04].

| Neighbor | Existing owner | Boundary |
|---|---|---|
| `Multi-Grain Cheerios / céréales multigrains Cheerios` | `ingredient-ref-multi-grain-cheerios` (R180) | A separate named cereal SKU; the shared Cheerios brand does not make it an alias or equivalent product. |
| Oat Crunch Almond and Oat Crunch Oats ’N Honey | Separate manufacturer-listed SKUs; no exact active reference found | Do not broaden this row to the Oat Crunch family or other flavours. |
| `multigrain flakes / flocons multigrains` | `ingredient-ref-multigrain-flakes` | A generic loose flake blend, not a finished sweetened and fortified cereal. |
| `rolled oats / flocons d’avoine`, `brown rice flour / farine de riz brun`, `ground cinnamon / cannelle moulue`, and other component references | Existing component identities | Keep listed recipe and formula ingredients separate; do not decompose this branded product into them. |
| `Cheerios Pomme et Cannelle` | A distinct Canadian product listing | Shared cinnamon wording does not imply an interchangeable formula or a base-Cheerios relationship. |

## Exact ownership and source-collision audit

The working-tree snapshot contains **1,558 active ingredient references**, **122 ingredient forms**, **61 legacy-import candidates**, and **1,903 research-ledger records**. The ledger contains **8,164 source entries**, **6,975 distinct source IDs**, and **5,771 distinct source URLs**.

Exact searches across active reference displays and aliases, form labels and match terms, legacy-import names and aliases, ledger records, the active plan, all proposal and batch files, and the bundled recipe corpus found no owner or earlier focused review/hold for the proposed ID, either exact manufacturer title, `Oat Crunch Cinnamon`, `Croquantes à l’avoine Cannelle`, or the product-specific manufacturer URLs. The broader Cheerios product family is discussed in the R180 Multi-Grain review, which explicitly distinguishes other variants but does not decide this SKU. The proposed source IDs `WP03-OAT-CRUNCH-CINNAMON-R181-20261016-S01` through `S04` and the source URLs below are absent from the ledger.

The active exact-title neighbors are R180's Multi-Grain Cheerios, multigrain flakes, rolled oats, brown-rice flour, ground cinnamon, corn flakes, and other cereal identities. These are distinct ingredient or product choices. The French product title does not use the catalog phrase `céréales`; no generic cereal alias is recommended.

## Picker projection

`IngredientSearch.kt` normalizes accents and punctuation, prefers complete word-phrase matches across display names and aliases, and falls back to substring matches only when there are no phrase matches. A static projection from the current catalog gives:

| Query | Current results | With proposed display |
|---|---:|---:|
| `Oat Crunch Cinnamon Cheerios` / `Croquantes à l’avoine Cannelle Cheerios` | 0 | 1 proposed row |
| `Oat Crunch` | 0 | 1 proposed row |
| `Cheerios` | 1 (R180 Multi-Grain Cheerios) | 2, including this Cinnamon product |
| `cinnamon` / `cannelle` | 1 (ground cinnamon) | 2, including this cereal |
| `cereal` / `céréales` | 20 / 17 | 20 / 17; neither word appears in the proposed titles |
| `multigrain` / `multigrains` | 2 / 3 | 2 / 3; the product's marketing description is not a picker term |

The brand and flavour queries returning both the cereal and ground cinnamon are expected phrase matches, not equivalence. Empty aliases keep shorter terms such as `Oat Crunch Cinnamon cereal`, `cereal`, `céréales`, `multigrain`, and unqualified Oat Crunch variants from being promoted beyond the exact bilingual product name.

## Recipe-corpus demand

The manifest corpus contains **114 recipe files and 1,123 ingredient rows**. Full recipe files and ingredient rows were searched for the exact English and French product names, `Oat Crunch Cinnamon`, `Croquantes à l’avoine Cannelle`, `Oat Crunch`, and the reviewed product codes. The scan found **0 matching files and 0 matching ingredient rows**. There is no recipe-specific link or alias to add.

## Numeric, preparation, and substitution boundaries

- **Nutrition serving:** The English and French manufacturer pages list **1 cup (56 g)** / **1 tasse (56 g)** for this SKU [S01–S02]. Retain this only as a product-page serving observation if later recorded in the research ledger. It does not establish a generic cereal cup measure, density, or conversion.
- **Package:** The manufacturer's 516 g size and the Québec retailer's 516 g family package are package net amounts, not portions, recipe quantities, or yields [S01–S03].
- **Preparation:** The page presents the cereal with milk and gives no dry-to-prepared yield or recipe preparation ratio. Add no form or yield.
- **Composition:** The source ingredient list identifies ingredients but provides no quantities or stable formulation proportions. Add no component formula or mappings to oats, corn, brown-rice flour, cinnamon, or other ingredients.
- **Substitution:** No reviewed source supplies a tested quantity-qualified exchange with Multi-Grain Cheerios, another Oat Crunch flavour, loose flakes, or another ready-to-eat cereal. Add no global or contextual substitution.

## Source register

Sources accessed 2026-10-16. Proposal-local source IDs are not ledger additions.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-OAT-CRUNCH-CINNAMON-R181-20261016-S01` | General Mills / Cheerios Canada, [Oat Crunch Cinnamon Cheerios](https://www.cheerios.ca/products/oat-crunch-cinnamon-cheerios), product title, description, ingredient list, package size, and nutrition panel. | Current Canada-English manufacturer SKU page. Supports the English title, product identity, ingredients, 516 g package, and product-specific 1 cup (56 g) nutrition serving. The page notes that package labeling governs if the online formula or nutrition data differ. |
| `WP03-OAT-CRUNCH-CINNAMON-R181-20261016-S02` | General Mills / Cheerios Canada, [Croquantes à l’avoine Cannelle Cheerios](https://www.cheerios.ca/fr-CA/products/croquantes-a-lavoine-cannelle-cheerios), French product page, ingredients, and nutrition panel. | Current Canada-French page supports the exact French display, ingredient list, 516 g size, and 1 tasse (56 g) serving. It is product-specific manufacturer wording, not a terminology ruling or reusable measure. |
| `WP03-OAT-CRUNCH-CINNAMON-R181-20261016-S03` | Provigo Québec, [Céréales pour la famille](https://www.provigo.ca/fr/alimentation/garde-manger/c-r-ales-et-petit-d-jeuner/c-r-ales-pour-la-famille/c/29894), current product listing. | Québec-facing retail listing names General Mills Cheerios Croquantes à l’Avoine, Saveur Cannelle, Format Familial, 516 g. It supports local retail naming and package size; it is not formula or measure authority. |
| `WP03-OAT-CRUNCH-CINNAMON-R181-20261016-S04` | General Mills / Cheerios Canada, [Nos produits](https://www.cheerios.ca/fr-CA/products), current French brand-product list. | Lists Croquantes à l’avoine Cannelle separately from the Almond and Oats-and-Honey Oat Crunch variants. Supports SKU separation, not formula or ingredient substitution. |

## Recommendation

**Add identity-only `ingredient-ref-cheerios-oat-crunch-cinnamon` as `Oat Crunch Cinnamon Cheerios / Croquantes à l’avoine Cannelle Cheerios`.** Current Canadian manufacturer pages establish the exact bilingual SKU, while current Québec retail listings corroborate the French product wording and 516 g package. Keep it distinct from R180 Multi-Grain Cheerios, other Oat Crunch variants, generic flakes, and its ingredient components. Keep aliases empty and add no forms, reusable measurements, density, mappings, conversions, yields, recipe links, or substitutions. The Section F sweep remains open.


## Root integration decision

**Hold the proposed row for picker coverage.** General Mills confirms the exact bilingual Cinnamon SKU and lists separate Oat Crunch Almond and Oat Crunch Oats ’N Honey products. With Cinnamon as the only active Oat Crunch reference, the current picker would make the broad `Oat Crunch` query return only this flavor. The catalog already records a similar single-variant hold for Shreddies Original. The product name, Québec-facing wording, and 1 cup (56 g) product-specific serving are supported, but they do not resolve the family-query result. No reference or research-ledger record was added. Revisit this flavor together with its Oat Crunch siblings or after picker behavior can represent the family boundary.
