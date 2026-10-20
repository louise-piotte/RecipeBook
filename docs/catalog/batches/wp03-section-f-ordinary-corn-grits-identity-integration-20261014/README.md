# WP03 Section F R113: ordinary corn-grits identity

## Disposition

Added identity-only `corn grits / semoule de maïs de type grits` as
`ingredient-ref-corn-grits`, category `GRAIN_AND_CEREAL`. The only aliases are English
`degermed corn grits` and `maize grits`; French aliases are empty. The qualified French display keeps
`semoule de maïs` with cornmeal and `gruau de maïs` with the provisional hominy-grits row. Bare
`grits` remains unassigned as an alias.

The new row has no forms, active measures, default density, unit mappings, recipe links, conversions,
yields, or substitutions. Bob’s Red Mill Canada label observation (1/4 cup, 40 g) and RICARDO’s
recipe observation (1 cup, 180 g) are retained in the research ledger as source-specific portions;
they do not define a general cup weight or density. Le Porc du Québec’s 250 mL / 1 cup remains a
recipe quantity without a mass conversion.

The review distinguishes ordinary dry degermed corn grits from cornmeal, hominy grits, whole hominy,
quick grits, and alkaline-treated maize products. The 114 bundled recipes and 1,123 ingredient rows
contain no grits demand, so no recipe reference was added.

## Evidence

- The [Codex standard for degermed maize meal and grits](https://www.fao.org/4/a1392e/a1392e00.pdf)
  defines a product boundary distinct from hominy grits, quick grits, alkaline-treated products, and
  cornmeal granularity.
- OQLF’s entries for [semoule de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031243/semoule-de-mais)
  and [gruau de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2088614/gruau-de-mais),
  together with the Statistics Canada [MDFoodCode](https://www.statcan.gc.ca/en/statistical-programs/document/3503_DLI_D12_T22_V1_B.pdf),
  support preserving existing French-term ownership.
- Bob’s Red Mill’s [2026 Canadian French product list](https://bobs-ebooks.cld.bz/Bob-s-Red-Mill-Canadian-French-Product-List/30-31/)
  and [Canadian product page](https://www.bobsredmill.ca/produit/cereales-chaudes-de-gruau-de-mais-cremeux)
  show current product wording and a product-specific 1/4 cup (40 g) serving.
- Le Porc du Québec and [RICARDO](https://www.ricardocuisine.com/recettes/8419-grits-aux-crevettes)
  use the qualified phrase `semoule de maïs de type grits` in Québec recipes. Their recipe amounts and
  suggested coarse-cornmeal replacement are not generalized.

The [R113 proposal](../../proposals/wp03-section-f-ordinary-corn-grits-boundary-review-r113-20261014.md)
contains the complete source register, picker projection, recipe scan, and numeric limits. The
[research ledger](../../research-ledger.v1.json) stores the identity decision and the two
source-specific portion observations.

## Static checks

Reference normalization, generated-index freshness, package and ledger validation, picker ownership,
recipe scan, UTF-8/no-BOM, local links, and whitespace checks passed. No app tests or emulator checks
were run because the change only adds database JSON data and the generated catalog entry.

Section F remains open.
