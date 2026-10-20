# WP03 Section K — carrot tops integration (R934)

## Decision

Add identity-only generic `carrot tops / fanes de carottes` as a leafy part of culinary carrots,
separate from carrot root, radish leaves, celery leaves, and other greens. Keep only the singular
part-qualified aliases `carrot top` and `fane de carotte`. The French display is locally attested
Québec culinary wording, not an OQLF-standardized term.

Télé-Québec's `2 tasses` is a combined optional line for carrot tops, radish tops, and celery leaves
in one pesto. That amount and the alternatives remain scoped to that recipe; neither supports a
carrot-tops-only measure or a general substitution. No form, density, unit mapping, recipe link,
reusable measure, conversion, yield, or substitution was added. Existing carrot-root and branded
rows remain unchanged.

## Cross-category scope

R934 covers a generic plant part. No brand, product line, flavour, SKU, or retailer roster was
researched. Commercial-product counts do not add ingredient diversity. Existing branded entries
and product-scoped evidence remain intact; product-specific measurements require a separate
transferability review before reuse for a generic ingredient.

## Static validation

- Ingredient-reference normalization and bundled seed-package validation passed.
- After R935, generated `BundledIngredientCatalog.kt` is current at 1,955 references.
- Current counts: 1,955 ingredient references, 204 forms, and 2,359 research-ledger records; the bundled
  recipe corpus remains 114 recipes and 1,123 ingredient rows.
- Package validation covers ledger schema, source ownership, and alias collisions. UTF-8/no-BOM,
  local links, and scoped whitespace checks are recorded with the final integration checkpoint.
- No software tests, build, emulator, or deployment were run because the app data change only adds
  database JSON under `AGENTS.md`.

## Sources

- [Colorado State University Extension, How to Use Carrots](https://extension.colostate.edu/resource/how-to-use-carrots/)
- [University of Connecticut Extension, Carrots](https://farmtoschool.extension.uconn.edu/local-products/carrots/)
- [Télé-Québec Cuisinez, Pesto de fanes](https://cuisinez.telequebec.tv/recettes/5950/pesto-de-fanes)
- [Recettes du Québec, Manger les fanes des légumes](https://www.recettes.qc.ca/chroniques/quoi-manger/article/manger-les-fanes-des-legumes)
- [OQLF, légumes feuilles (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26544178/legumes-feuilles)

## Proposal

- [R934 — carrot-tops identity review](../../proposals/wp03-sections-k-l-generic-produce-gap-review-r934-20261019.md)
- [Cross-category generic ingredient scope review](../generic-ingredient-scope-review-20261019/README.md)
