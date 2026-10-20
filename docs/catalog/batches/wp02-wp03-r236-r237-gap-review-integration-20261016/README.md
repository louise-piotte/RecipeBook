# WP02 A6 / WP03 Section F R236–R237 integration (2026-10-16)

## Integrated decisions

- Added identity-only `ingredient-ref-light-buckwheat-flour` (`light buckwheat flour / farine pâle de sarrasin`) as a source-named Québec milling product. Kept it separate from generic, dark/gray, whole, sprouted, Tartary, and unresolved buckwheat-meal identities. The evidence supports the specific product name, not a universal light-flour grade. No aliases, forms, reusable measurements, mappings, conversions, yields, recipe links, or substitutions were added.
- Added identity-only `ingredient-ref-quaker-super-grains-hot-cereal` (`Quaker Super Grains Hot Cereal / Gruau Quaker Super Grains`). It remains distinct from its oat, flax, and quinoa components and from other packaged hot cereals. The manufacturer’s 1/3 cup (30 g) serving is stored only as a product-specific ledger observation. The 511 g and 512 g retailer listings are source-scoped observations, not a canonical package amount.
- Neither review found a matching bundled recipe ingredient or direct recipe link. No forms, active measures, densities, mappings, conversions, yields, or substitutions were added.

## Evidence and review records

- [R236 light buckwheat flour proposal](../../proposals/wp02-a6-light-buckwheat-flour-identity-review-r236-20261016.md)
- [R237 Quaker Super Grains Hot Cereal proposal](../../proposals/wp03-section-f-quaker-super-grains-hot-cereal-identity-review-r237-20261016.md)
- [WP02 Section A6 checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L1598)
- [WP03 Section F regional cereal mix checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L3714)

The Trigone English and French pages pair light buckwheat flour / farine pâle de sarrasin to SKU 056142006851; its current-range article distinguishes whole, gray, and pale grindings. The Aliments du Québec listing was present in current indexed results, though direct retrieval returned a cache miss. The Quaker Canadian English and French manufacturer pages provide the product titles, ingredients, and 1/3 cup (30 g) serving. Retailers list 511 g and 512 g packages; those amounts were not generalized.

## Data scope and static verification

- Active references: **1,630** (up from 1,628).
- Ingredient forms: **122** (unchanged).
- Research-ledger records: **1,975** (up from 1,973); source entries: **8,640**; distinct source IDs: **7,323**; distinct URLs: **6,098**.
- Bundled corpus: **114 recipes / 1,123 structured ingredient rows** (unchanged).
- Passed `normalize_seed_ingredient_references.py --check`, `normalize_bundled_seed_package.py --check`, `generate_bundled_ingredient_catalog.py --check`, research-ledger JSON Schema validation, new source-ID uniqueness (9/9), and scoped `git diff --check`. The generated catalog index is current.
- No software tests or emulator checks were run because this round only adds database JSON data under `AGENTS.md`.

The broad WP02 A6 and WP03 Section F parent checklist items remain open.
