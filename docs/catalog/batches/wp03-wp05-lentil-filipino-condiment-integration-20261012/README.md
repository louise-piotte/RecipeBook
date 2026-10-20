# WP03 and WP05 lentil and Filipino condiment integration — 2026-10-12

## Accepted changes

- Kept the five active lentil identities and modeled whole, split, coated, and dehulled as product/form distinctions. Added no lentil forms because the 114 bundled recipes contain no lentil ingredient lines and no exact product demand was identified.
- Removed the unscoped French alias `lentilles corail` from `ingredient-ref-red-lentils`. Québec sources attest the phrase but do not tie it to a whole, split, or dehulled product; it remains unassigned until that boundary is documented. Added seven source records and a decision to the existing red-lentil ledger record.
- Added identity-only `banana ketchup / ketchup aux bananes`, with manufacturer-backed `banana catsup` and the Québec recipe wording `ketchup à la banane` as scoped aliases. Kept it separate from generic tomato ketchup, fruit ketchup, and green-tomato ketchup.
- Added identity-only bottled `toyomansi soy sauce with calamansi / sauce soya toyomansi` with no aliases. It remains distinct from generic soy sauce, calamansi, and fresh, variable table-mixed toyomansi dipping sauce.
- Independently reassessed the existing `padaek / sauce padaek` row. Retained its current English and French displays and `pa daek` / `padek` aliases; added no duplicate reference or catalog data.

No recipe text, ingredient links, forms, measurement values, unit mappings, package yields, conversions, or substitutions changed.

## Evidence packets

- [WP03 lentil form and alias review](../../proposals/wp03-section-h-lentil-whole-split-dehulled-form-review-20261012.md)
- [WP05 banana ketchup and bottled toyomansi Québec terminology review](../../proposals/wp05-section-x-banana-ketchup-toyomansi-quebec-review-20261012.md)
- [WP05 padaek identity reassessment](../../proposals/wp05-section-x-padaek-identity-reassessment-20261012.md)

## Data checkpoint

- 1,103 ingredient references; 79 forms; 114 recipes; 1,123 ingredient rows.
- 1,403 research-ledger records; 4,688 source entries; 3,847 distinct source IDs; 8 unit conversions; 0 ledger validation errors.
- The two new identities have null density and empty unit mappings. Their measurement and substitution research remains `not_yet_researched`.
- The red-lentil identity remains verified; `lentilles corail` is no longer an active alias. No form record was created.

## Validation

- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py` — normalized 1,103 references.
- `python3 tools/seed_package/normalize_bundled_seed_package.py` — normalized package; 0 part files changed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py` — refreshed generated index to 1,103 references.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — valid.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — already normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — current.
- Direct research-ledger validation — 1,403 records, 0 errors.
- Exact-key ownership audit — each new English/French display or alias maps to only its intended identity; `lentilles corail` has no active owner.
- Recipe corpus audit — no ingredient-line or recipe-text matches for the new products or reviewed lentil forms.
- Seed reference and ledger files have no BOM and store non-ASCII text as Unicode escapes. Scoped whitespace checks passed.

No unit, instrumentation, build, or emulator tests were run. The changes are catalog data and documentation; no application logic changed.
