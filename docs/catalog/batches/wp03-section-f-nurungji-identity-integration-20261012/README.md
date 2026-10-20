# WP03 Section F: nurungji identity integration

## Decision

Added identity-only `ingredient-ref-nurungji` for the Korean cooked-rice crust browned against a hot cooking surface:

- English display: `nurungji (scorched rice crust)`
- French display: `nurungji (croûte de riz trop cuit)`
- Category: `GRAIN_AND_CEREAL`
- Aliases: none
- Density: `null`; unit mappings and forms: none

The French wording is a source-backed descriptive gloss, not an OQLF/TERMIUM-preferred or Québec-market-certified term. CIPO French-language goods listings and a French Korean-cuisine guide attest the wording; this review found no Québec retail label or terminology entry for the product.

## Scope and evidence boundary

The Academy of Korean Studies distinguishes the crust from prepared nurungji-bap, the drink sungnyung, and later flavored sweets. Manufacturer and product sources show that commercial formulations can vary, including a cited product made from glutinous rice, white rice, corn starch, and corn. Those variants do not establish a universal formula.

Keep prepared nurungji-bap and sungnyung, composite or flavored snacks, puffed rice, crispy rice cereal, flattened rice/poha, toasted rice powder, and base-rice identities separate. The 114-file / 1,123-row bundled recipe corpus has no matching recipe or ingredient row. The review found no transferable household measure, density, unit mapping, or supported substitution. No forms, package yields, recipe links, conversions, or substitution rules were added.

The source register and detailed ownership, picker, and corpus review are in [the accepted proposal](../../proposals/wp03-section-f-next-regional-grain-review-20261012-round11.md).

## Validation

After integration, the following static checks passed:

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only`
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`
- Recipe-corpus, ownership, encoding, and whitespace checks

No app, unit, instrumentation, or emulator tests were run because this change only adds database JSON data. Section F remains open.

## Live snapshot after integration

Counts and file hashes are for exact bytes; the corpus fingerprint hashes each manifest-relative path, NUL, recipe bytes, and trailing NUL in manifest order.

| Artifact | Count | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,324; 139 `GRAIN_AND_CEREAL` | `6b4a1e34d8b7e8b75fdaf48c1bbf27c6ca1ce6562a75dc958a00d1b9e5014a7d` |
| Ingredient forms | 98 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Research ledger | 1,632 records; 6,017 source entries; 5,033 distinct source IDs; 8 unit conversions | `b959f36a409e902795dfc8f5322cfbce667e7e7c0030eecef6c6c49ca3298d0d` |
| Generated `BundledIngredientCatalog.kt` | 1,324 references | `d2f206e8499e985c8195a76ce1d38cd39de4f9781f283f5d5fc05f485f4472ba` |
| Manifest-ordered recipe corpus | 114 files; 1,123 rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
