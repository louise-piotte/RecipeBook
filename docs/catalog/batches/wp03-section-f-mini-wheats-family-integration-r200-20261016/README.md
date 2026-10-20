# WP03 Section F R200 — Mini-Wheats Family Integration

- **Status:** Integrated as eight identity-only `GRAIN_AND_CEREAL` references.
- **R182 condition:** Met the family-wide picker condition that had held Original Frosted outside the catalog.
- **Data scope:** No aliases, forms, active measures, density, mappings, recipe links, conversions, yields, or substitutions. Each label portion remains a SKU-specific ledger observation.

## Integrated products

| English manufacturer title | French Canadian manufacturer title | Product-specific label observation |
|---|---|---|
| Mini-Wheats Original Frosted Cereal | Céréales Mini-Wheats Originale | 23 biscuits (55 g), Maxi |
| Mini-Wheats Brown Sugar Flavour Cereal | Céréales Mini-Wheats Saveur de cassonade | 23 biscuits (55 g), Maxi |
| Mini-Wheats Strawberry Flavour | Céréales Mini-Wheats Fraise | 23 biscuits (55 g), Maxi |
| Kellogg's Mini-Wheats Low Sugar Cereal | Céréales Kellogg's Mini-Wheats à faible teneur en sucre | 26 biscuits (54 g), manufacturer SmartLabel |
| Mini-Wheats Original Minis Cereal | Céréales Mini-Wheats Minis Originale | 41 biscuits (55 g), Maxi |
| Mini-Wheats Blueberry Flavour Cereal | Céréales Mini-Wheats Bleuet | 23 biscuits (55 g), Maxi |
| Mini-Wheats Chocolate Flavour Cereal | Céréales Mini-Wheats Saveur de chocolat | 21 biscuits (54 g), manufacturer SmartLabel |
| Mini-Wheats Pumpkin Spice Flavour Cereal | Céréales Mini-Wheats Saveur d’épices à citrouille | 25 biscuits (55 g), manufacturer SmartLabel |

The current Canadian English and French manufacturer family pages list the same eight products. Québec Maxi panels support five SKU-specific serving bases, and the Canadian manufacturer label pages support the other three. These counts and weights are not per-biscuit masses or family conversions.

## Picker and recipe demand

The `Mini-Wheats` query returns all eight products. `Céréales Mini-Wheats` returns seven because the manufacturer places `Kellogg's` between those words in the Low Sugar title. The tighter `Mini-Wheats Original` query returns Original Frosted and Original Minis. Aliases remain empty to preserve product selection and avoid colliding normalized keys.

The manifest-listed bundle contains 114 recipes and 1,123 ingredient rows; no Mini-Wheats family or SKU phrases match. The separate shredded-wheat cereal identity remains unchanged.

## Verification

Static seed/package validation, ingredient-reference normalization, generated-index freshness, research-ledger schema validation, source-ID/URL ownership, reference-to-ledger linkage, picker projection, full recipe-corpus scan, UTF-8/no-BOM and escaped-Unicode checks, local links, and scoped whitespace checks passed. Final totals after R199–R201 are **1,588 references**, **122 forms**, and **1,933 ledger records / 8,346 source entries / 7,101 distinct source IDs / 5,891 distinct URLs**.

No software tests or emulator checks were run because the application changes add database JSON data under `AGENTS.md`.

See the [R200 proposal and source register](../../proposals/wp03-section-f-mini-wheats-family-picker-review-r200-20261016.md), the [R182 proposal](../../proposals/wp03-section-f-mini-wheats-original-frosted-family-picker-hold-review-r182-20261016.md), and the [R182 hold integration](../wp02-wp03-wp04-r182-gap-review-integration-20261016/README.md).
