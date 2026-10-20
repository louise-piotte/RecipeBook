# WP02 B3 R598 — polvilho azedo package observation

Date: 2026-10-17

## Decision

Added one `package_yield` observation to the existing `ingredient-ref-brazil-polvilho-azedo` ledger record: a single Da Terrinha Polvilho Azedo 500 g package, identified by internal item 48163 and EAN 7898960982978. This is product-specific package-mass evidence only.

Set ledger `measurementState` to `researched_no_supported_value`: the reviewed sources establish no transferable household measure or density. Kept `defaultDensity: null`, `unitMappings: []`, and `substitutionResearchState: not_yet_researched`. The French display and alias, ingredient forms, active package-yield data, conversions, recipe links, and substitutions remain unchanged.

The retailer listing includes separate AZEDO and DOCE options. Its page-level barcode matches the manufacturer's Azedo EAN; the barcode is not attributed to both variants. The 2020 manufacturer catalog corroborates item 48163 and the Azedo EAN but is used as product identity evidence, not current availability evidence.

## Evidence

- Da Terrinha Alimentos, [Farináceos](https://www.daterrinhaalimentos.com/pt/farinaceos): current manufacturer lineup separately lists Polvilho Azedo 500 g and Polvilho Doce 500 g.
- Da Terrinha Alimentos, [2020 unified product catalog](https://www.daterrinhaalimentos.com.br/wp-content/uploads/2020/10/CATALOGO_UNIFICADO_DT_6D_WA.pdf): page 8 lists `Polvilho Azedo Da Terrinha 500g`, item 48163, EAN 7898960982978, and a separate Doce SKU.
- Brazilian Market, [Polvilho 500g (Da Terrinha)](https://brazilianmarket.ca/products/polvilho-da-terrinha): current listing shows the same page-level barcode, 500 g amount, and separate AZEDO/DOCE choices; the AZEDO option is in stock in the reviewed page snapshot.

These package listings give no cup/spoon measure, volume, density, or substitution result. The bundle has no recipe demand for this reference or named Da Terrinha product.

See the [R598 proposal](../../proposals/wp02-b3-polvilho-azedo-package-yield-review-r598-20261017.md), the [B3 flour and starch checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L3042), and the broader [WP02 B2/B3 review](../../../RecipeBook-global-ingredient-catalog-plan.txt#L15900). Both broader plan items remain open.

## Static verification

Research-ledger schema validation, source ID/URL ownership, bundled package validation, reference normalization, generated-index freshness, UTF-8/no-BOM, local-link, and scoped whitespace checks passed. No app tests, build, emulator check, or deployment were needed because this change only adds database JSON data and tracking documentation under `AGENTS.md`.
