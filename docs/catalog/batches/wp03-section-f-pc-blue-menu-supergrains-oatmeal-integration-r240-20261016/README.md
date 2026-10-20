# WP03 Section F R240 — PC Blue Menu Supergrains oatmeal integration (2026-10-16)

## Accepted identities

Added two identity-only `GRAIN_AND_CEREAL` references using current English product titles and Québec retailer French titles:

- `ingredient-ref-pc-blue-menu-regular-supergrains-oatmeal` — PC Blue Menu Regular Supergrains Oatmeal / Gruau supergrains nature Menu Bleu.
- `ingredient-ref-pc-blue-menu-maple-brown-sugar-supergrains-oatmeal` — PC Blue Menu Maple and Brown Sugar Flavour Supergrains Oatmeal / Gruau supergrains à saveur d’érable et cassonade Menu Bleu.

Both remain separate from one another, Quaker Super Grains Hot Cereal, plain oats, and generic instant oatmeal. Aliases are empty. Each listing’s 8 × 38.0 g package is retained only as a SKU-specific ledger observation; it is not an active recipe measure or cooked-yield value. No forms, density, unit mappings, recipe links, conversions, yields, or substitutions were added. The 114-recipe / 1,123-row corpus has no matching demand.

## Evidence and review

- [R240 proposal](../../proposals/wp03-section-f-pc-blue-menu-supergrains-oatmeal-family-review-r240-20261016.md)
- [Section F checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L3714)
- Loblaws Canada’s current English results list both products with 8 × 38.0 g packaging.
- Maxi Québec’s current aisle listings provide both French product titles and the same package listing. These retailer titles are not an OQLF terminology ruling.

## Static verification

- Active references: **1,634** (up from 1,632).
- Ingredient forms: **122** (unchanged).
- Research-ledger records: **1,979** (up from 1,977); source entries: **8,648**; distinct source IDs: **7,329**; distinct URLs: **6,104**.
- Bundled corpus: **114 recipes / 1,123 ingredient rows** (unchanged).
- Seed package normalization, reference normalization, generated index, research-ledger schema, source-ID checks, UTF-8/no-BOM, and scoped whitespace checks are recorded after validation.
- No software tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

The broader Section F checklist remains open.
