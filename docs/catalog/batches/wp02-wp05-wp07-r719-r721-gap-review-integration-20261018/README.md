# WP02/WP05/WP07 R719–R721 integration — 2026-10-18

Integrated three bounded reviews into the canonical seed/reference catalog and research ledger. A6, Section Z, and WP07 remain open.

## Decisions

- **R719 — generic quinoa flour:** Added Cuisine Soleil's 1/4 cup (30 g) product-label serving as a `portion_weight` observation on the existing `ingredient-ref-quinoa-flour` ledger row. The Québec Food Directory and a Canadian retailer reproduce the same product-label pair; neither establishes a transferable generic cup measure or filling method. Measurement state is `researched_no_supported_value`; density and unit mappings stay empty. Substitution research remains `not_yet_researched`. No form, alias, recipe link, conversion, yield, or active substitution was added. See the [R719 proposal](../../proposals/wp02-a6-next-gap-review-r719-20261018.md).
- **R720 — fruit mostarda identity:** Added identity-only `fruit mostarda / mostarda` as `ingredient-ref-fruit-mostarda`, with the exact English search alias `mostarda di frutta`. The English display follows the manufacturer; `mostarda` is treated as provisional Québec borrowed-name usage based on a French-language local menu, not as an OQLF ruling. Keep regional styles, vegetable preparations, ordinary mustard, chutney, ketchup, and piccalilli distinct. No forms, measures, density, mappings, conversions, recipe links, yields, or substitutions were added. See the [R720 proposal](../../proposals/wp05-section-z-next-condiment-gap-review-r720-20261018.md).
- **R721 — olive-oil CNF portions and ledger repair:** Added three historical, Food Code 422-specific observations: 5 mL = 4.6 g, 15 mL = 13.7 g, and 100 mL = 91.3 g. Kept measurement state `blocked_pending_evidence` until the current CNF 2026 row and source/app unit convention are reviewed; density and mappings remain empty. Removed only the duplicate evaporated-milk identity decision from the olive-oil ledger record, preserving olive oil's unresolved measurement decision and leaving the evaporated-milk record unchanged. See the [R721 proposal](../../proposals/wp07-next-portion-gap-review-r721-20261018.md).

## Package state

- 1,842 ingredient references, 174 forms, 114 recipes, and 1,123 structured recipe ingredient rows.
- 2,225 research-ledger records, 10,450 source entries, 8,819 distinct source IDs, and 7,468 distinct source URLs.

## Static verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — normalized.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — valid, including seed package and research-ledger schema validation.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — generated catalog current at 1,842 references.
- R719 and R721 proposal records validated against the research-ledger schema; R720's reference and ledger examples validated against the full-library and research-ledger schemas.
- New R719/R720/R721 source IDs and URLs have unique ledger ownership. The olive-oil decision repair removed only the unrelated duplicate; the evaporated-milk row remains intact.
- Picker projection returns one fruit-mostarda row for `fruit mostarda`, `mostarda di frutta`, and `mostarda`; `mustard` and `moutarde` result counts remain 14 and 13.
- The 114-file / 1,123-row manifest corpus has no `mostarda` or quinoa-flour name/ID hits. Seven generic olive-oil rows and two separately linked extra-virgin rows remain unchanged.
- UTF-8/no-BOM and local link/whitespace checks are recorded with the integration. No software tests, build, emulator run, or deployment were needed for this database-JSON update under the current `AGENTS.md` rule.
