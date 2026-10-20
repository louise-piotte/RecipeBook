# WP03 Section F — Biowig millet cream identity integration

Reviewed and integrated 2026-10-14. The broader Section F cereal and preprocessed-grain sweep
remains open.

## Decision

Added one product-specific identity for Moulin Abénakis's **Biowig Organic Millet Cream / crème
Biowig au millet biologique**, a Québec cereal blend listing organic millet, linseed, sesame,
sunflower seed, and brown almonds. The product remains separate from plain millet, generic millet
meal, and other single-grain cereal creams. Its ingredient sources do not identify the millet
species, milling grade, or particle size, so none is inferred.

Kept only the source-attested product-title variants as aliases: English `Biowig cream (millet)
organic` and French `crème de céréales Biowig au millet biologique`. No forms, density, unit
mappings, conversions, yields, recipe links, or substitutions were added. The 350 g package and
manufacturer's tablespoon-based preparation directions do not state product mass for a reusable
measure. The 114-recipe / 1,123-row corpus has no matching demand.

## Integration and validation

- Added `ingredient-ref-biowig-millet-cream` and one accepted research-ledger record with seven
  source records.
- Updated the Section F checklist and roadmap, and refreshed the generated ingredient catalog.
- Current counts: 1,434 references, 105 forms, 1,774 ledger records, 63 legacy candidates, 114
  recipes, and 1,123 ingredient rows.
- Seed-package and reference normalization, ledger-schema validation, generated-index freshness,
  source ownership, picker projection, encoding, local links, and scoped whitespace checks passed.
- No app, Gradle, instrumentation, or emulator tests were run because the change only adds database
  JSON data and its generated catalog index.

See the detailed [review proposal](../../proposals/wp03-section-f-next-grain-gap-review-20261014.md).

## Sources

- The Québec maker's [product page](https://moulinabenakis.com/products/creme-biowig-millet-bio)
  gives the French product name, package format, and preparation instructions.
- [Aliments du Québec](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/creme-de-cereales-biowig-au-millet-biologique)
  records the cereal-directory title, Québec retail channels, and 350 g size.
- Québec retailers [La Boîte à Grains](https://laboiteagrains.com/en/products/biowig-organic-millet-cream)
  and [La Moisson](https://lamoisson.com/collections/abenakis-gourmet/products/creme-biowig-millet-biologique-biowig-millet-organic-cream)
  attest the English and French market names and the product's five listed ingredients.
- OQLF's [millet entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet)
  supports the broad French grain term but does not define the branded cereal product.
- Horizon Nature's [September 2019 catalogue](https://horizonnature.ca/wp-content/uploads/2019/12/catalog-hn-en.pdf)
  records the historic distributor name, 350 g format, and UPC; it is not treated as evidence of
  current stock or a kitchen measure.
