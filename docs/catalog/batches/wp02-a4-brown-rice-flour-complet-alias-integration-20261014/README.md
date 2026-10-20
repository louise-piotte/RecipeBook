# WP02 A4 R115: brown-rice-flour French alias integration

Reviewed and integrated on 2026-10-14. WP02 A4 remains open.

## Change

Added the French search aliases `farine de riz complet` and `farine de riz brun complet` to the
existing `ingredient-ref-brown-rice-flour` reference. Kept the display `brown rice flour / farine de
riz brun`, its English aliases, category, and numeric fields unchanged. This adds no separate
identity and does not make the family-level `farine de riz` term brown-specific.

The shorter alias is an internal terminology inference: Cuisine Soleil calls brown rice `riz brun`,
`riz cargo`, or `riz complet`, while OQLF defines the broader `farine de riz` family as flour from
white or brown rice. Cuisine l’Angélique and QUeen Milling directly use `farine de riz brun complet`
for brown-rice flour. OQLF does not list `farine de riz complet` as a preferred grade term, so the
canonical display remains `farine de riz brun`.

The brown-rice-flour ledger entry now records the four terminology sources and an accepted alias
decision. It also records the two product-specific Québec serving sources and an unresolved decision:
they do not support a reusable measure or density. Its measurement state is now
`researched_no_supported_value`; substitution remains `not_yet_researched`. No form, active measure,
density, unit mapping, conversion, yield, recipe link, or substitution was added.

## Picker and recipe boundary

The static phrase-first projection returns the brown-rice-flour row for both new aliases. `farine de
riz brun` and `brown rice flour` remain single-result queries. `riz complet` now returns the brown
rice grain and brown rice flour, consistent with the existing multi-result behavior of `riz brun`.
The broad `farine de riz` and `rice flour` searches remain seven-result lists; `farine de riz blanc`
and `white rice flour` remain on white rice flour alone.

The 114 manifest-listed recipes and 1,123 structured ingredient rows contain no brown-rice-flour
line and no rice-flour-family term hit. No recipe references or quantities changed.

## Evidence

- OQLF, [farine de riz](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432782/farine-de-riz), keeps the preferred term at the family level and says the source grain can be white or brown rice.
- Cuisine Soleil, [Farine de riz brun](https://cuisinesoleil.com/produit/farine-de-riz-brun/), connects `riz complet` with brown rice and describes the retained bran and germ.
- Cuisine l’Angélique, [Farine de riz brun complet](https://www.cuisinelangelique.com/fr/produits/farine-riz-brun-sans-gluten), and QUeen Milling, [Farine de riz brun complet superfine sans gluten](https://www.queenmilling.ca/fr/products/gluten-free-wholegrain-brown-rice-flour-superfine-1), use the full compound wording for brown-rice flour.
- The proposal records ownership, source-specific servings, picker projection, recipe scan, and all six sources: [R115 review](../../proposals/wp02-a4-brown-rice-flour-complet-review-r115-20261014.md).

## Static verification

- Ingredient-reference normalization, bundled-package and ledger validation, and generated Kotlin catalog freshness passed. Current totals are 1,457 references, 105 forms, and 1,797 ledger records.
- Post-integration picker projection passed for all 11 reviewed queries. The full 114-recipe / 1,123-row scan found no brown-rice-flour or rice-flour-family hit.
- UTF-8/no-BOM, final-newline, local-link, and scoped whitespace checks passed.
- No app, Gradle, instrumentation, or emulator tests were run because this change only adds database JSON data and its generated catalog entry, as directed by `AGENTS.md`.
