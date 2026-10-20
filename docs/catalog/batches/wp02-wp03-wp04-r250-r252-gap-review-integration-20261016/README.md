# WP02 / WP03 / WP04 R250–R252 Gap Review Integration

- **Status:** Integrated one flour form and six identity-only cereal products; documented one seafood picker hold.
- **Review date:** 2026-10-16.

## R250 — Sprouted brown-rice flour

Added `sprouted brown rice flour / farine de riz brun germé` as the `sprouted` form under
`ingredient-ref-brown-rice-flour`, with `germinated brown rice flour` as its only English match term.
The French compound is supported by a Québec ingredient declaration, while OQLF supports the
head term `farine de riz` only; keep the compound provisional. The separate whole-grain
`sprouted brown rice / riz brun germé` reference is unchanged.

The form ledger retains One Degree's 680 g package, Well.ca's 1/4 cup (43 g) serving, and the
brand-hosted brownie recipe's 3/4 cup (107 g) amount as separate observations. It records the
manufacturer's qualitative guidance for using its sprouted flour in recipes calling for regular
brown-rice flour. No reusable density, cup conversion, unit mapping, recipe link, active
substitution, or ratio was added. The full recipe bundle has no matching demand.

## R251 — Vector cereal and granola family

Added six current products together as separate identity-only `GRAIN_AND_CEREAL` references:

| English display | French display | Product-specific observations |
|---|---|---|
| Vector Maple Flavour Cereal | Céréales Vector à saveur d’érable | 306 g package; 1 cup (44 g) serving |
| Vector Meal Replacement | Substitut de repas Vector | 400 g, 550 g, 850 g, and 1,134 g packages; 55 g cereal portion described with 200 mL skim milk |
| Vector Peanut Butter Flavour Cereal | Céréales Vector à saveur de beurre d’arachides | 306 g package; 1 cup (44 g) serving |
| Vector Chocolate Flavour Granola Cereal | Granola Vector Saveur de chocolat | 311 g package; 1 cup (108 g) serving |
| Vector Vanilla Almond Granola Cereal | Granola Vector Vanille et amandes | 311 g package; 1 cup (98 g) serving |
| Vector Strawberry Granola | Granolas aux fraises Vector | 311 g package; 1 cup (118 g) serving |

All aliases remain empty; each item stays separate from generic granola and the ingredients in its
formula. The package sizes and servings remain product-specific ledger observations. No forms,
reusable measures, density, mappings, conversions, yields, recipe links, or substitutions were
added. The six-item brand query is complete; the recipe bundle has no matching demand.

## R252 — Silver pomfret hold

Kept silver pomfret / *Pampus argenteus* outside active references, forms, legacy identities, and the
research ledger. CFIA and TERMIUM support the species-specific bilingual name, and Canadian
suppliers list identified silver pomfret. Under current picker behavior, however, adding it would
make broad `pomfret` searches return this species alone while Canadian listings use the broader
pomfret family for different taxa. No Québec-specific species-identified product listing or bundled
recipe demand was found. See the [R252 proposal](../../proposals/wp04-section-p-residual-seafood-gap-review-r252-20261016.md) for the full source and market-boundary review.

## Data and checks

The R250–R252 proposals and their source registers are linked from the [R250 proposal](../../proposals/wp02-next-review-gap-r250-20261016.md), [R251 proposal](../../proposals/wp03-section-f-vector-cereal-family-identity-review-r251-20261016.md), and [R252 proposal](../../proposals/wp04-section-p-residual-seafood-gap-review-r252-20261016.md).

- **Static checks:** seed-package normalization and validation; generated-index freshness; research-ledger schema, source-ID/source-URL ownership and reference linkage; picker projection; recipe-corpus scan; UTF-8/no-BOM and escaped-seed-Unicode checks; local links; scoped whitespace.
- **Totals:** 1,646 references, 125 forms, and 1,994 ledger records / 8,714 source entries / 7,383 distinct source IDs / 6,152 distinct URLs; 114 bundled recipes / 1,123 ingredient rows.
- **Software tests and emulator:** none run. These changes add database JSON data and documentation under the JSON-only exception in `AGENTS.md`.

The broader WP02 A6, Section F, and Section P reviews remain open.
