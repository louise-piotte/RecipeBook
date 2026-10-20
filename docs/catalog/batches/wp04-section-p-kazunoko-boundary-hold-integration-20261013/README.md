# WP04 Section P kazunoko boundary hold integration

## Decision

Integrated the R42 proposal as an evidence-only hold. Keep plain kazunoko, the salted herring-roe skein product, outside active references and forms until a bundled recipe identifies the product presentation. Keep it distinct from spawn-on-kelp (`kazunoko kombu` / `komochi kombu`), whole herring, and other roe products.

Canadian processor sources describe their own kazunoko products in a Pacific-herring context, but the evidence does not establish one scientific species for every product sold under this name. Canadian French wording supports `kazunoko salé et aromatisé (œufs de hareng)`; the Québec government page uses `œufs de hareng` generally, and OQLF lists only generic `œufs de poisson`. These sources do not establish a Québec retail package label for this product.

## Picker and recipe scope

The proposal’s static projection follows the current phrase-first search behavior. Bare `roe` currently returns Greenland halibut through substring fallback because the French display `flétan du Groenland` contains the letters `roe` inside `Groenland`. A hypothetical kazunoko row with `roe` as a full phrase would take over that query; it would also add kazunoko to the results for broad `herring`. The 114 manifest-listed recipes and 1,123 ingredient rows contain no candidate-phrase matches, so the bundle does not resolve that picker tradeoff.

## Changes

- Added the hold under the open [Section P roe checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L4378).
- Added this integration record and updated the plan progress log and roadmap.
- Changed no catalog JSON, generated index, research ledger, forms, recipes, legacy candidates, or application code. Added no identity, alias, form, measure, density, mapping, recipe link, conversion, yield, substitution, or candidate record.

## Evidence and limits

- [Canfisco’s processor catalogue](https://canfiscogroup.com/wp-content/uploads/2023/06/CanfiscoGroup-products-2023-06.pdf) separates `Herring Roe (Kazunoko)` from `Herring Roe on Kelp (Komochi Kombu)`. It places its kazunoko product in a Pacific-herring context, but its product-origin table says only `Herring`; the stated 38 lb pail is package information, not a recipe quantity.
- [Aero Trading](https://aerotrading.ca/our-products/kazunoko/) describes its products as Pacific herring roe sacs or egg skeins and separately names herring roe on kelp. This is supplier-specific sourcing and product-line evidence.
- [Seaborn Toronto](https://www.seaborntoronto.com/product-page/kazunoko-herring-roe-%E6%95%B0%E3%81%AE%E5%AD%90) lists a 200 g `Kazunoko / Herring Roe / 数の子` product and describes one SKU as brine-cured and marinated with soy-dashi seasoning. This is not a universal formulation or species determination.
- [Agriculture and Agri-Food Canada](https://www.canada.ca/fr/nouvelles/archive/2014/10/gouvernement-harper-investit-afin-trouver-nouveaux-marches-fruits-mer-canadiens-haut-gamme.html) uses `kazunoko salé et aromatisé (œufs de hareng)` for a Canadian industry product association. It is not a current package label.
- The [Québec marine-products page](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/portraits-peche-aquaculture-commerciales/transformation-produits-marins) identifies herring roe as a high-value export product. [OQLF’s `œufs de poisson` entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10435851/oeufs-de-poisson) is a generic term for fish roe, not a kazunoko-specific name.
- [Ozawa Canada](https://ozawa.ca/product/kazunoko-300g/) lists item FS-1001A as 200 g and gives a Montréal office. The package size does not define a recipe portion.
- The proposal’s exact ownership audit found no dedicated active reference, form, legacy candidate, or ledger record. Its pre-proposal snapshot was 1,369 references, 100 forms, 64 legacy candidates, and 1,699 ledger records.
- No recipe portion, household measure, mass-to-volume value, density, preparation yield, conversion, or substitution is supported. Retail and bulk package weights remain product-specific observations.

## Verification

The proposal-only ownership, picker, recipe-corpus, source-ID, local-link, and numeric audit is recorded in [the R42 proposal](../../proposals/wp04-section-p-kazunoko-salted-herring-roe-product-boundary-review-20261013-round42.md). No automated tests were needed or run: this integration changes documentation only. Section P remains open.
