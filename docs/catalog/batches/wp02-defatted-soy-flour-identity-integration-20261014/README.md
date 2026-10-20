# WP02 Section 04 B2 — defatted soy flour integration

Reviewed and integrated 2026-10-14. The broader flour and starch review remains open.

## Decision

Added identity-only `defatted soy flour / farine de soya dégraissée` as
`ingredient-ref-defatted-soy-flour` in `FLOUR_AND_STARCH`, with no aliases. Use it only when fat
removal is explicitly identified. Keep the existing generic `soy flour / farine de soya` row and
its OQLF-listed aliases unchanged, and keep roasted Kinako, textured soy flour, and finished TVP/PVT
separate.

The Québec French phrase is attested on a local maker’s ingredient label, while current Canadian
food-grade manufacturer/supplier evidence supports the English identity. CFIA treats defatting as a
removal that changes a food’s true nature. These sources do not establish one residual-fat threshold,
heat treatment, protein specification, particle size, or brand-wide behavior.

No forms, measurements, density, unit mappings, recipe links, conversions, package yields, or
substitutions were added. The 114-recipe / 1,123-row bundle has no matching soy-flour demand.

## Integration and validation

- Added one reference and one `ingredient_reference` ledger record; regenerated the Kotlin ingredient
  catalog index. Current counts: 1,432 references, 105 forms, 1,772 ledger records, 63 legacy
  candidates, 114 recipes, and 1,123 ingredient rows.
- Updated the flour checklist, review proposal, and roadmap.
- Seed-package and reference normalization, ledger schema, generated-index freshness, static picker
  projection, source ownership, full recipe scan, recipe-link preservation, UTF-8/no-BOM, local links,
  and scoped whitespace checks passed.
- No app, Gradle, instrumentation, or emulator tests were run because the application change only
  adds database JSON data and its generated catalog index under the `AGENTS.md` exception.

See the detailed [R96 review](../../proposals/wp02-next-specialty-flour-starch-gap-review-20261014.md).

## Sources

- CFIA’s [True nature of food](https://inspection.canada.ca/en/food-labels/labelling/industry/true-nature)
  names defatted soy flour as a result of removing fat from soybeans. This supports a meaningful
  process qualifier, not a class-wide flour standard.
- OQLF’s [farine de soya entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084165/farine-de-soya)
  gives `farine de soya` and `farine de soja` for generic soy flour and lists `soy flour`, `soybean
  flour`, and `soya flour`; it does not specify defatting.
- Cargill’s [Prolia soy-flour page](https://www.cargill.com/food-bev/na/prolia-soy-flour) and Univar
  Canada’s [food-grade Prolia listing](https://www.univarsolutions.com/ca/en/16176226) support current
  food-industry flour products and defatted grades. The 50 lb supplier package is not a kitchen
  measure.
- Québec manufacturer Les Brutes’ [LA FINE – PVT nature page](https://lesbrutes.ca/products/la-fine-pvt-nature)
  declares `farine de soya dégraissée` as an ingredient in finished textured soy protein. It supports
  the French ingredient wording, not a flour measure or hydration rule.
