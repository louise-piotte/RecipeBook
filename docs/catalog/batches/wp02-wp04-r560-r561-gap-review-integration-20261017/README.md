# WP02 / WP04 R560–R561 integration — 2026-10-17

## Integrated decisions

R560 adds two species-qualified loin-cut forms under the existing cod identities:

- `ingredient-form-atlantic-cod-loin` — `Atlantic cod loin / longe de morue de l’Atlantique`
- `ingredient-form-pacific-cod-loin` — `Pacific cod loin / longe de morue du Pacifique`

Both forms use `loin_cut`, have no match terms, and keep density null. The current picker therefore returns both cod species for `cod loin`; bare `loin` / `longe` also retains the existing pork-loin result. Plural `loins` / `longes`, generic fish-loin aliases, and recipe links were not added. The bundle has no cod-loin recipe demand.

High Liner's English product evidence is reused from the R554 proposal-local source ID for product code 3269; the paired French route has the same UUID and SKU. The separate French High Liner product code 8337 / about 170 g SKU is excluded. Metro's English and French routes describe the same Pacific-cod product 244982. Product weights, frozen state, and selected-store availability remain specific to those listings. Neither product listing creates a reusable measure, density, mapping, conversion, package yield, recipe portion, or substitution.

R561 updates the existing `ingredient-ref-rye-meal` ledger record with two separate King Arthur Pumpernickel Flour label observations:

- Nutrition Facts serving: **1/4 cup = 30 g**.
- Package's Everything Bagel Pumpernickel Bread formula: **1 cup = 106 g** for one loaf.

These are kept as separate source contexts. Scaling the serving to one cup would give 120 g, 14 g above the package formula amount; that discrepancy remains unresolved. Neither amount establishes a reusable rye-meal conversion or an active catalog measure. The package recommends using its product in rye-flour recipes but provides no replacement amount or process adjustments, so the ledger records no generally reusable quantified home-recipe replacement. Active density, unit mappings, forms, yields, recipes, and substitution rules remain unchanged.

## Sources and ledger changes

- R560 product IDs: `WP04-SECTIONP-HADDOCK-LOINS-R554-20261017-S04` (reused for High Liner English SKU 3269), `WP04-SECTIONP-COD-LOIN-R560-20261017-S01` (paired French High Liner route), and `...-S02` / `...-S03` (Metro English/French product 244982).
- R561 adds King Arthur product page and package-label sources `WP02-A4-RYEMEAL-MEASURE-SUB-R561-20261017-S01` and `...-S02`; the Arva comparator source remains reused under its existing R56 owner.
- Direct sources: [High Liner Atlantic cod loins, product 3269](https://www.highlinerfoodservice.com/en-CA/products/atlantic/9ca8c00f-aeba-4fec-a92a-38437e991bb8/high-liner-foodservice-signature-454-kg-10-lb-individually-quick-frozen-atlantic-cod-loins-approx-113-g-4-oz), [High Liner French product route](https://www.highlinerfoodservice.com/fr/products/atlantic/9ca8c00f-aeba-4fec-a92a-38437e991bb8/high-liner-foodservice-signature-454-kg-10-lb-individually-quick-frozen-atlantic-cod-loins-approx-113-g-4-oz), [Metro Pacific cod loin portion 244982](https://www.metro.ca/en/online-grocery/aisles/frozen/fish-seafood/fish-filets-steaks/frozen-pacific-cod-loin-portion/p/244982), [King Arthur Pumpernickel Flour](https://shop.kingarthurbaking.com/items/pumpernickel-flour), and its [package label](https://shop.kingarthurbaking.com/content/packaging/400186_1.pdf).
- Current research-ledger inventory: **2,171 records, 10,050 source entries, 8,487 distinct source IDs, and 7,152 distinct URLs**.

## Files updated

- `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json`
- `docs/catalog/research-ledger.v1.json`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`
- R560 and R561 proposal status notes

## Verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — valid.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — already normalized.
- `validate_research_ledger()` — 2,171 records, no schema or source-reference errors.
- Targeted source-ID, observation-ID, local-link, UTF-8/no-BOM, final-newline, and whitespace checks passed.
- No app tests, build, emulator run, or deployment were run: this batch only adds database JSON evidence and forms, under the JSON-only testing exemption in `AGENTS.md`.

WP02 Section A and WP04 Section P remain open.
