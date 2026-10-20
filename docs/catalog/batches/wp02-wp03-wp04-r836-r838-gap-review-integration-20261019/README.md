# WP02/WP03/WP04 R836–R838 gap review integration — 2026-10-19

## Scope and results

- **R836 — emmer semolina:** Set substitution research on the existing `ingredient-ref-emmer-semolina` ledger row to `researched_no_supported_substitute`; added one bounded finding with no replacements. Anson Mills gives no replacement direction, and King Arthur Baking's equal-volume bread-flour advice addresses durum semolina rather than this nearly whole-grain emmer product. No active substitution rule was added.
- **R837 — finger millet:** Added only `nachni` to `aliasesEn` for the existing `ingredient-ref-finger-millet` reference. Mirrored the already-owned FSSAI source entry onto the grain ledger row and added Mithila Foods' whole-grain product page. The distinct `nachni flour` alias remains on the flour reference. The picker returns both grain and flour for `nachni`, only flour for `nachni flour`, both for `ragi` and `finger millet`, and only flour for `farine de ragi`.
- **R838 — Atlantic herring:** Set measurement research on `ingredient-ref-atlantic-herring` to `researched_supported` and recorded CNF 2015 Food Code 3014 portions: 1 fillet = 189.3 g and 1 food-guide serving = 90.0 g. Kept them ledger-only as source-specific edible portions. The separate 46% refuse value remains context; no whole-fish mass, yield, or conversion was inferred. CNF 2026 row presence and values remain unverified.

## Data effects

The research ledger now has **2,294 records**, **10,802 source entries**, **9,088 distinct source IDs**, **7,722 distinct source URLs**, **870 measurement observations**, and **364 substitution findings**. The bundled catalog remains at **1,886 references and 199 forms**; the manifest still lists **114 recipes and 1,123 ingredient rows**. R837 adds one search alias and refreshes the generated Kotlin ingredient catalog. R836 and R838 add research evidence only. No recipes, forms, densities, unit mappings, conversions, package yields, or active substitution rules changed.

## Static validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` passed.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` passed, including bundled-package and research-ledger schema validation.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed for 1,886 references.
- Source-ID/URL integrity and observation/finding ID uniqueness passed. The new source entries retain the original URL mappings for reused IDs.
- A manifest recipe scan passed at 114 files / 1,123 ingredient rows. It found no `nachni` recipe text and no links or text for the emmer-semolina or Atlantic-herring targets.
- A static picker projection confirmed the `nachni`, `nachni flour`, `ragi`, `finger millet`, and `farine de ragi` results listed above.
- Encoding, local Markdown links, mojibake, and scoped whitespace checks passed.
- No software tests, app build, emulator run, or deployment were performed. These changes add database JSON data and its generated data projection, and `AGENTS.md` says database-JSON-only updates need no tests.

See the [R836 proposal](../../proposals/wp02-section-a7-next-gap-review-r836-20261019.md), [R837 proposal](../../proposals/wp03-section-f-next-gap-review-r837-20261019.md), and [R838 proposal](../../proposals/wp04-section-p-next-gap-review-r838-20261019.md). Sections A7, F, and P remain open.
