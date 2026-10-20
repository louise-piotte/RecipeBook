# WP03 Section F Palestinian maftool identity integration — 2026-10-13

## Decision

Added `ingredient-ref-maftool` as an identity-only `GRAIN_AND_CEREAL` reference, displayed as
`maftool (Palestinian couscous) / maftoul (couscous palestinien)`. The producer and Canadian seller
identify a hand-rolled Palestinian grain product made with bulgur and whole-wheat flour. The French
display follows French-language federal wording but remains provisional; no OQLF entry or current
Québec product label for maftool was found. The sources describe their own products and do not
establish one universal formulation.

Keep maftool distinct from generic and pearl couscous, bulgur, and wheat flour. The Canadian seller's
500 g package and product-specific cooking directions are not reusable measures, density, unit
mapping, cooked form, or yield. The bundle contains no matching demand. No aliases, forms, recipe
links, measurements, conversions, yields, or substitutions were added.

## Evidence and data changes

- [Mawasem / New Farm Co.](https://mawasem.ps/products/maftool/) describes its Maftool as hand-rolled
  whole-wheat Palestinian couscous and lists bulgur, salt, wheat flour, water, and cumin for that
  product.
- [Watany Palestinian Products](https://watanypalestinianproducts.com/products/maftool), a Canadian
  seller, describes Palestinian hand-rolled Maftool made with bulgur and whole-wheat flour and gives
  one package size and product-specific preparation directions.
- The [OQLF couscous entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502225/couscous)
  defines generic couscous from agglomerated durum-wheat semolina; it does not define maftool.
- A French-language [Agriculture and Agri-Food Canada report](https://publications.gc.ca/collections/collection_2012/agr/A74-1-97-2012-fra.pdf)
  uses “couscous palestinien de type « maftoul »” and describes hand-rolling in Palestinian women's
  cooperatives. This supports the French descriptor as provisional wording, not an OQLF ruling or a
  current Québec retail term.

The proposal's scan found no matching term in 114 bundled recipes or 1,123 ingredient rows.

- Added one reference to `ingredient-references.v1.json` with no aliases, forms, density, or unit
  mappings.
- Added one verified identity record and four source records to `research-ledger.v1.json`.
  Measurement and substitution states remain blocked pending exact recipe/product evidence.
- Regenerated `BundledIngredientCatalog.kt` from the canonical reference JSON. The manifest and
  schema did not change.

No app or emulator tests were run; this change only adds database JSON data and updates its generated
catalog index. See the [proposal](../../proposals/wp03-section-f-palestinian-maftool-identity-review-20261013-r51.md)
and [Section F checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L2556).
