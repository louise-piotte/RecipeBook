# WP03 Section M — Mashed-ripe banana form integration

## Result

Added `ingredient-form-banana-mashed-ripe` under the existing `banana / banane` reference and
linked only recipe 073#10. Kept the authored line `3 bananas, mashed`, quantity `3`, count unit,
and bilingual `very ripe, mashed` preparation unchanged. Recipe 001#3 remains unqualified because
it asks for an over-ripe whole banana without naming a separate mashed-fruit ingredient.

This form records a recipe preparation. It does not define a ripeness threshold or identify a
formulated commercial banana purée. No amount, conversion, density, yield, or substitution was added.

## Evidence and limits

- The OQLF GDT entry pairs `purée de bananes mûres` with `mashed ripe bananas`. Its direct page
  fetch returned a cache miss; the indexed GDT result supplied the terminology fields.
- Recettes du Québec describes bananas as commonly reduced to purée for baking and uses
  `bananes écrasées`; its approximate volume note is not treated as a general conversion.
- The linked Preppy Kitchen recipe card specifies three very ripe bananas mashed and describes
  mixing the mash into the batter. It directly corroborates recipe 073#10 but gives no mass or
  weighing stage.
- Monin Canada's commercial banana purée lists sugar, banana purée, water, natural flavours, citric
  acid, and colour. This one formulation supports keeping commercial product wording separate; it
  does not classify all banana purées.

The full source register, prior-work reconciliation, and exact row audit are in
[`wp03-section-m-fruit-products-mashed-ripe-banana-form-review-20261011.md`](../../proposals/wp03-section-m-fruit-products-mashed-ripe-banana-form-review-20261011.md).

## Package state

- 1,027 ingredient references; 71 forms; 114 recipes / 1,123 ingredient rows.
- 1,316 research-ledger records; 4,266 source entries; 3,502 distinct source IDs; 8 unit conversions.
- 75 legacy candidates.
- No recipe text or quantity changed.

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
| `ingredient-forms.v1.json` | `1db31d8f54262555a18e15173f2a69b0d164cad5d53bf14fad86dac390c7989a` |
| Recipe 073 `recipes/...v1.json` | `5c71a92cb318baec68cf285c5ac370d1b1c51b114b1de529a07cf86d53a3e24c` |
| `research-ledger.v1.json` | `2227ba0b0f4bdeb5c86eb08488ec998cdb1cab3f0c460cfcc7bfd87bff0db939` |
