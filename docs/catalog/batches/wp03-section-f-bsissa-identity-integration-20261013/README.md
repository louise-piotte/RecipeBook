# WP03 Section F round 43 — Bsissa identity

Integrated 2026-10-13 as identity-only `ingredient-ref-bsissa` under the open [Section F regional cereal checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L2555).

## Integration

Added the bilingual display name `bsissa / bsissa`, English aliases `bsissa powder` and `bsissa flour`, and French alias `bsissa en poudre` to the canonical reference JSON as `GRAIN_AND_CEREAL`. Density is null and unit mappings are empty. The generated [`BundledIngredientCatalog.kt`](../../../../app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt) index was regenerated from the seed. No form, recipe link, measure, conversion, yield, or substitution was added.

## Boundary

The reference represents the dry roasted cereal/legume powder family. Formula variation across producers and regions is part of the family boundary; no universal grain or legume formula is assigned. The Québec-made gluten-free SKU's qualifier stays product-specific. Prepared pastes, breakfast creams, energy balls, and ready-to-drink cereal beverages remain separate preparations or products. Keep the identity distinct from Moroccan Zamita/Zammita/Zemita and from roasted barley or wheat flour.

The 114-file / 1,123-row seed corpus has no direct Bsissa demand. The new source-backed name becomes a direct result for Bsissa searches and adds one item to broad `flour`, `powder`, and `poudre` query projections; `farine` is unchanged. Package sizes are not kitchen measures. No forms, density, mappings, recipe links, conversions, yields, or substitutions were activated.

## Sources and checks

- [Aliments du Québec](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/bsissa-sans-gluten) lists a Québec-prepared product as `Bsissa sans gluten`, in cereals and granola, and describes a breakfast mix of cereals and legumes.
- [Création Delicia's French page](https://www.creationdelicia.com/products/bsissa-sans-gluten) and [English page](https://www.creationdelicia.com/en/products/gluten-free-bsissa) use *Bsissa* in both languages and name *Bsissa flour* in English; these describe one gluten-free formula and do not establish a family-wide gluten claim.
- The [2020 Lamta survey](https://agribalkan.congress.gen.tr/files/site/16/files/AGBIOL%20Conference%202020%20Full%20Proceeding%20Book%282%29.pdf) describes a roasted, ground, and sifted cereal/legume/spice powder and documents variation among collected formulas. The [2021 *Food Control* study](https://www.sciencedirect.com/science/article/abs/pii/S0956713521000694) describes commercial Bsissa as roasted cereals, legumes, and spices and examined 34 products.
- [ILEY'COM](https://ileycom.tn/en/collections/bsissa-en-poudre) uses *Bsissa powder* and lists cereal-based variants; [Azza Food](https://azzafood.tn/categorie-produit/bsissa-en-poudre/) uses *Bsissa en poudre* in French. These support aliases, not a single formula.
- [Délice Holding](https://www.delice.tn/bsissa/) identifies *Bsissa à boire* as a separate UHT cereal-milk beverage. The proposal includes the source register, exact ownership and picker projection, numeric limits, and corpus audit.

The database package and generated-index static checks passed. No tests or emulator checks were run because this change only adds database reference data and its generated index under the updated workspace rule. Section F remains open.
