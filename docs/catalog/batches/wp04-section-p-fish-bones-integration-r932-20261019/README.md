# WP04 Section P — fish bones integration (R932)

## Decision

Add identity-only `fish bones / arêtes de poisson` as a generic culinary stock input, with the
source-attested singular aliases `fish bone` and `arête de poisson`. Keep it distinct from fish heads,
fish frames, fish stock, named fish, and other seafood parts. Do not add a form, density, unit
mapping, conversion, generic measure, yield, recipe link, or substitution.

Metro's `1 fish head and bones` line is a composite amount scoped to that recipe; its stock yield is
not a bone measure. Fisheries and Oceans Canada's 125 lb fish-frame batch remains specific to an
industrial stock recipe. Neither value is transferred to the generic fish-bones identity.

## Cross-category scope

R932 selected one generic seafood part; it did not research or add a brand, product line, flavour,
SKU, retailer variant, or commercial roster. Commercial-product counts do not add ingredient
diversity. Existing branded references and product-scoped evidence remain intact.

## Static validation

- Ingredient-reference normalization and bundled seed-package validation passed.
- After R933–R935, generated `BundledIngredientCatalog.kt` is current at 1,955 references.
- Current counts: 1,955 ingredient references, 204 forms, and 2,359 research-ledger records; the bundled
  recipe corpus remains 114 recipes and 1,123 ingredient rows.
- Ledger schema, source ownership, and alias-collision checks passed through package validation.
- No software tests, build, emulator, or deployment were run because the app data change only adds
  database JSON under `AGENTS.md`.

## Sources

- [OQLF, arête de poisson (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19050602/arete-de-poisson)
- [Metro Québec, Fumet de poisson avec tête et arêtes de poisson](https://api.metro.ca/recettes-et-occasions/recettes/fumet-de-poisson-avec-tete-et-aretes-de-poisson)
- [Fisheries and Oceans Canada, Development of Seafood Products in Newfoundland](https://waves-vagues.dfo-mpo.gc.ca/Library/39104.pdf)

## Proposal

- [R932 — fish bones identity review](../../proposals/wp04-section-p-generic-seafood-gap-review-r932-20261019.md)
- [Cross-category generic ingredient scope review](../generic-ingredient-scope-review-20261019/README.md)
