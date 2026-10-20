# WP05 nutritional yeast identity integration

## Decision

Added identity-only `nutritional yeast / levure alimentaire` with English alias `nooch` and French
alias `levure nutritionnelle`. OQLF pairs the bilingual names, marks `nooch` as common-language
English, and defines the product as inactive dried yeast sold as flakes or yellowish powder. A
current Maxi Québec listing corroborates `levure alimentaire` on a Bob’s Red Mill product. Nutrient
and fortification claims remain product-specific.

Kept nutritional yeast separate from baker’s yeast, brewer’s yeast, yeast extract, and yeast-extract
spreads. The bundled recipe corpus has no matching phrase or ingredient line. Added no form, density,
unit mapping, recipe link, conversion, yield, or substitution.

Sources: [WP05 nutritional yeast review](../../proposals/wp05-nutritional-yeast-identity-review-20261011.md),
[OQLF terminology entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298907/levure-alimentaire),
[Maxi Québec product listing](https://www.maxi.ca/fr/levure-alimentaire-gros-flocons/p/21732583_EA).

## Files and verification

Updated the reference JSON, generated Kotlin search index, research ledger, global plan, and roadmap.
The package has 1,032 references / 72 forms / 114 recipes / 1,123 ingredient rows; the ledger has
1,324 records / 4,326 source entries / 3,559 distinct source IDs.

Package normalization and validation, reference normalization, generated-index freshness, research-
ledger schema validation, exact alias collision and recipe-demand checks, UTF-8/no-BOM, whitespace,
and scoped `git diff --check` passed. No tests or emulator run were needed for the database JSON
addition.
