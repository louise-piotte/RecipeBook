# WP02 B4 — Defatted tigernut flour integration

## Result

Added identity-only `defatted tigernut flour / farine de souchet dégraissée` as a separate
`FLOUR_AND_STARCH` reference from the existing whole-tuber `tigernut flour / farine de souchet`.
The Québec French display remains provisional because the reviewed Québec retailer evidence covers
whole-tuber flour, not a defatted product. Added no aliases, forms, recipe links, measurements,
conversions, yields, or substitutions. The proposal audit found no matching ingredient line in the
114 bundled recipes / 1,123 ingredient rows.

## Evidence and boundary

- Tigernuts Traders names a defatted tigernut flour and describes oil extraction; its French product
  page uses `farine de souchet dégraissée` in the explanatory body. The manufacturer's claims about
  market exclusivity and process are not generalized.
- European patent EP 3741221 A1, paragraphs 23–25, distinguishes non-de-oiled/non-defatted flour from
  de-oiled flour and allows mixtures. This supports a product distinction, not a food standard.
- Wu et al. (2024) treat defatted tigernut flour as a named ingredient in frozen wheat-dough research.
  Those study-specific formulas are not imported as recipe substitutions or conversions.
- La Moisson's Québec listing supports the local base wording `farine de souchet` for whole-tuber
  flour; it does not attest a defatted product or its Québec name.

Full source locators, name-collision audit, and limitations are in
[`wp02-b4-defatted-tigernut-flour-identity-review-20261011.md`](../../proposals/wp02-b4-defatted-tigernut-flour-identity-review-20261011.md).

## Package state

- 1,027 ingredient references; 70 forms; 114 recipes / 1,123 ingredient rows.
- 1,314 research-ledger records; 4,255 source entries; 3,493 distinct source IDs; 8 unit conversions.
- 75 legacy candidates.
- Recipe and form data were unchanged.

## Validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — passed.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` — passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — passed.
- `validate_research_ledger()` — passed with 0 errors.
- Targeted `git diff --check` — passed for this batch's changed files.
- No tests or emulator run were needed because this change only adds database JSON data, as stated in
  `AGENTS.md`.

## SHA-256

| File | SHA-256 |
| --- | --- |
| `ingredient-references.v1.json` | `b63ae0206120f62b9879dfed2eee0bf0af43c2057981f1154c5fd1475dc67e0b` |
| `research-ledger.v1.json` | `97cfa57c7343800a8aac6545f9ba9ad319f3250067c12d14316a8e808e9b1249` |
| `BundledIngredientCatalog.kt` | `7382e4c44debf0cac65418a5a6afb15a24ca545cefeaee7108f13341e3c88a2d` |
