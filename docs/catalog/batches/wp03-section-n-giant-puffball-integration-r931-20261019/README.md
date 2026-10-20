# WP03 Section N — giant puffball integration (R931)

## Decision

Add identity-only `giant puffball / vesse-de-loup géante`, scoped to *Calvatia gigantea*.
Use the species name as an exact alias in English and French. Do not alias the broader terms
`puffball`, `puffball mushroom`, `vesse-de-loup`, or `boviste`. Keep the existing generic mushroom,
dried-mushroom form, and all species-specific references separate. The source's organism dimensions
are not culinary measures; no recipe link, form, density, unit mapping, conversion, yield, or
substitution was added.

The OQLF entry pairs the Québec French name with the English name and taxon, and limits its edibility
note to specimens with white flesh. Agriculture Canada's field guide identifies *C. gigantea* as a
culinary species while distinguishing it from the wider puffball group. La Filière Mauricie provides
regional corroboration. No general puffball claim or product-specific value was transferred.

## Cross-category scope

R931 selected one generic culinary fungus; no brand, product line, flavour, SKU, retailer variant, or
commercial roster was researched. Commercial-product counts do not add ingredient diversity. Existing
branded references remain intact, and any product-specific measurements or claims require a separate
transferability review before they can support a generic ingredient.

## Static validation

- Ingredient-reference normalization and bundled seed-package validation passed.
- After subsequent R929–R930 and R932–R935 generic additions, generated
  `BundledIngredientCatalog.kt` is current at 1,955 references.
- Current counts: 1,955 ingredient references, 204 forms, and 2,359 research-ledger records; the
  bundled recipe corpus remains 114 recipes and 1,123 ingredient rows.
- Source ownership and schema validation are included in package validation. The proposal's active
  identity, alias, and recipe scans found no existing match or recipe demand.
- No software tests, build, emulator, or deployment were run because the app data change only adds
  database JSON under `AGENTS.md`.

## Sources

- [OQLF, vesse-de-loup géante (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17018856/vesse-de-loup-geante)
- [Agriculture Canada, Mushroom collecting for beginners](https://publications.gc.ca/collections/collection_2015/aac-aafc/A43-861-1980-eng.pdf)
- [La Filière Mauricie / MycoMauricie, Vesse-de-loup géante](https://mycomauricie.com/en/champignon/vesse-de-loup-geante/)

## Proposal

- [R931 — giant puffball identity review](../../proposals/wp03-section-n-generic-sea-vegetable-gap-review-r931-20261019.md)
- [Cross-category generic ingredient scope review](../generic-ingredient-scope-review-20261019/README.md)
