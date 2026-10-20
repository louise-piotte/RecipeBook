# WP02/WP03/WP04 R785–R787 gap-review integration

Date: 2026-10-18

## Decisions

- **R785 — generic glutinous rice flour measurement:** added five product- or formula-specific portions to the existing `ingredient-ref-glutinous-rice-flour` ledger record. Bob’s Red Mill Sweet White Rice Flour label and chart are retained only as named-product evidence; the chart’s spoon-and-level method is recorded, without inferring a generic mass or density. King Arthur Baking’s Hotteok and Jiān Duī amounts remain recipe-specific. Transferable measurement is `researched_no_supported_value`; substitution research, active names, density, mappings, forms, recipes, and picker behavior are unchanged.
- **R786 — Rice Krispies family:** superseded R780’s Holiday-only hold by adding identity-only references for Holiday Edition, Spring Edition, and the standard/Original product. Refreshed French family source `WP03-S88` under its existing `ingredient-ref-rice-cereal` owner; the English family source is shared across the new family records. Kept the generic crispy-rice-cereal identity, recipe 040 link, and R291’s SKU-specific 1 cup (28 g) observation unchanged. Added no aliases, forms, product details, measures, recipe links, or substitutions.
- **R787 — Alaska and Atlantic pollock fillets:** resolved R574 with paired `fillet_cut` forms under the existing species references: frozen Alaska pollock and fresh Atlantic pollock. Reused R574’s Alaska candidate ID and its two Metro routes, then added current PA English/French listing evidence and Nova Scotia Seafood’s species/product-type profile. Package weights and product-specific state are not generalized. No reusable measure, recipe link, yield, conversion, or active substitution was added.

## Package snapshot

- **1,873 ingredient references and 195 forms.**
- **2,277 research-ledger records, 10,661 source entries, 8,973 distinct source IDs, and 7,620 distinct source URLs.**
- **114 manifest-listed recipes and 1,123 structured ingredient rows.** The corpus scan found no matching candidate-specific ingredient rows for the glutinous-rice-flour measurements, Rice Krispies family names, or pollock/goberge fillet forms.

## Static verification

- Research-ledger schema and custom validation passed with zero errors through the bundled-package validator.
- Bundled seed package normalization check passed; the package was already normalized after integration.
- `BundledIngredientCatalog.kt` was regenerated from the canonical reference JSON and is current at 1,873 references.
- Picker projection: `Rice Krispies` and `Céréales Rice Krispies` each return the three family entries; the generic `crispy rice cereal` and `céréales de riz croustillantes` queries each still return one generic row. `pollock fillet(s)` and `filet(s) de goberge` each return both pollock species; qualified forms return one species. Broad `fillet` and `fillets` results grow 9→11, `filet` grows 4→6, and `pollock` / `goberge` remain four results each.
- The 114-recipe / 1,123-row corpus scan found no matching candidate rows.
- Source-ID/URL ownership, UTF-8 without BOM, escaped Unicode in bundled JSON, local proposal links, mojibake markers, and scoped whitespace were checked.
- **No software tests, build, emulator run, or deployment were performed.** These active catalog changes add database JSON; the generated reference index was refreshed from its canonical JSON source without changing behavior.

## Proposals

- [R785 generic glutinous-rice-flour measurement review](../../proposals/wp02-a6-glutinous-rice-flour-measurement-review-r785-20261018.md)
- [R786 Rice Krispies family review](../../proposals/wp03-section-f-rice-krispies-family-picker-review-r786-20261018.md)
- [R787 paired pollock fillet-form review](../../proposals/wp04-section-p-pollock-fillet-pair-boundary-review-r787-20261018.md)
