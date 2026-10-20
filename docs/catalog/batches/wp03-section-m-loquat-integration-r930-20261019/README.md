# WP03 Section M — loquat integration (R930)

## Decision

Add identity-only `loquat / nèfle du Japon` for the edible fruit of *Eriobotrya japonica*, with
source-attested English aliases `Japanese medlar` and `loquats` and French aliases `bibace`,
`bibasse`, and `nèfles du Japon`. Keep it distinct from medlar, sapodilla, and plum. Do not add
`Japanese plum`, cultivar or regional alternatives, a peel or pip form, measures, density, mapping,
recipe link, conversion, yield, or substitution. Horticultural dimensions and cultivar details remain
source-specific. The broad `medlar` and `nèfle` searches can show the qualified loquat entry alongside
the existing medlar and sapodilla entries; each display remains qualified.

## Cross-category scope

R930 selected one generic fruit identity; it did not research or add a brand, product line, flavour,
SKU, retailer variant, or commercial roster. Commercial-product counts do not add ingredient
diversity. Existing branded references and product-scoped evidence remain intact; no product-specific
value was transferred.

## Static validation

- Ingredient-reference normalization and bundled seed-package validation passed.
- Generated `BundledIngredientCatalog.kt` is current at 1,951 references.
- Counts: 1,951 ingredient references, 204 forms, and 2,355 research-ledger records; the bundled
  recipe corpus remains 114 recipes and 1,123 ingredient rows.
- Ledger schema, source ownership, and alias-collision checks passed through package validation.
- No software tests, build, emulator, or deployment were run because the app data change only adds
  database JSON under `AGENTS.md`.

## Sources

- [OQLF, nèfle du Japon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083899/nefle-du-japon)
- [NC State Extension, Loquat — *Eriobotrya japonica*](https://plants.ces.ncsu.edu/plants/eriobotrya-japonica/common-name/loquat/)
- [University of Florida IFAS Extension, *Eriobotrya japonica*: Loquat](https://ask.ifas.ufl.edu/publication/ST235)
- [OQLF, nèfle (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410193/nefle)
- [Japan MAFF, Pickled foods](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/tukemono.html)

## Proposal

- [R930 — loquat identity review](../../proposals/wp03-section-m-generic-fruit-gap-review-r930-20261019.md)
- [Cross-category generic ingredient scope review](../generic-ingredient-scope-review-20261019/README.md)
