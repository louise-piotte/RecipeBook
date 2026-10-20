# WP02 Sections B2/B3 — oat germ integration (R933)

## Decision

Add identity-only generic `oat germ / germe d’avoine` as a distinct grain fraction, categorized as
`GRAIN_AND_CEREAL`. Keep the French display provisional and both alias lists empty. Separate it
from oat bran, oat flour, whole oat groats, whole-grain oat flour, sprouted oats, oat-germ oil,
wheat germ, and toasted corn germ.

A primary cereal-germ study prepared oat germ and assessed its potential as a food ingredient. It
supports the fraction as a generic food-ingredient candidate, not common retail availability or
ordinary household use. A processing review says oat groats are not easily converted into separate
germ, endosperm, and bran fractions. Keep these limitations visible; the study's extraction method
and composition findings remain sample-specific. No measures, recipe links, density, form,
conversion, yield, or substitution were added. The separate rice-germ hold remains unchanged.

## Cross-category scope

R933 reviews a generic grain fraction; no brand, product line, flavour family, SKU, or retailer
roster was researched. Commercial-product counts do not add ingredient diversity. Existing branded
oat references and product-scoped evidence remain intact; no product measurements or claims were
transferred.

## Static validation

- Ingredient-reference normalization and bundled seed-package validation passed.
- After R935, generated `BundledIngredientCatalog.kt` is current at 1,955 references.
- Current counts: 1,955 ingredient references, 204 forms, and 2,359 research-ledger records; the bundled
  recipe corpus remains 114 recipes and 1,123 ingredient rows.
- Package validation covers the research-ledger schema, source ownership, and alias collisions.
- No software tests, build, emulator, or deployment were run because the app change only adds
  database JSON under `AGENTS.md`.

## Sources

- [P. J. Barnes, Composition of cereal germ preparations (PubMed)](https://pubmed.ncbi.nlm.nih.gov/7124118/)
- [Decker et al., Processing of oats and the impact of processing operations on nutrition and health benefits](https://www.cambridge.org/core/journals/british-journal-of-nutrition/article/processing-of-oats-and-the-impact-of-processing-operations-on-nutrition-and-health-benefits/12103B74748A0B4FFD8ABC1B5699786F)
- [OQLF, avoine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432769/avoine)
- [OQLF, son d’avoine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18955166/son-davoine)
- [Health Canada, Grains entiers — les faits](https://www.canada.ca/fr/sante-canada/services/guide-alimentaire-canadien/ressources/recommendations-saine-alimentation/savourez-une-variete/grains-entiers/les-faits.html)

## Proposal

- [R933 — oat-germ identity review](../../proposals/wp02-section-b2-b3-generic-gap-review-r933-20261019.md)
- [Cross-category generic ingredient scope review](../generic-ingredient-scope-review-20261019/README.md)
