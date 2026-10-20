# WP02 Section A — entire-wheat-flour alias integration (2026-10-12)

## Decision

Added only the English search alias `entire wheat flour` to the existing `ingredient-ref-whole-wheat-flour` reference. The display pair remains `whole-wheat flour / farine de blé entier`; French aliases remain empty. No new ingredient identity, form, measurement, unit mapping, recipe link, conversion, yield, or substitution was added.

The CFIA standard already recorded on this row names “Whole Wheat Flour or Entire Wheat Flour” as one wheat product. OQLF lists both English terms for `farine de blé entier`. The existing CFIA source entry was reused; the ledger now adds the OQLF terminology source and Scotland’s statutory wholemeal definition as a boundary source. The OQLF entry also lists `farine de blé complet`, but that French alias was not added because the existing wheat-meal row already matches that phrase through `farine de blé complet brute`.

Keep `wholemeal flour` and `whole meal flour` unassigned. Scotland’s [2024 Bread and Flour Amendment Regulations](https://www.legislation.gov.uk/ssi/2024/387/pdfs/ssi_20240387_en.pdf) define wholemeal flour as the whole product from milling or grinding cleaned cereals. The definition took effect on 3 February 2025 and is cereal-wide, not a wheat-specific Canadian or Québec synonym. Other product qualifiers and whole-grain guarantees remain outside this alias decision.

## Picker and recipe boundary

The phrase-first picker audit follows [`IngredientSearch.kt`](../../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). After integration:

| Query | Result |
|---|---|
| `entire wheat flour` | `ingredient-ref-whole-wheat-flour` only |
| `whole-wheat flour` | Whole-wheat flour and white whole-wheat flour, as before |
| `farine de blé entier` | Whole-wheat flour, whole-wheat meal, and whole-wheat pastry flour, as before |
| `farine de blé complet` | Whole-wheat meal, as before |
| `farine intégrale de blé` | White whole-wheat flour, as before |
| `wholemeal flour` | No result; no alias added |

All 114 manifest-listed recipes and 1,123 ingredient rows were scanned for candidate terms and the target ID. No candidate phrase occurred and no row linked to `ingredient-ref-whole-wheat-flour`; no recipe data changed. The existing ledger states remain `measurementState: not_yet_researched` and `substitutionResearchState: researched_no_supported_substitute`.

## Static verification

- Ingredient-reference normalization, bundled seed-package normalization/validation, and generated-index freshness passed.
- Research-ledger JSON Schema validation passed with 1,578 records and zero errors. The record has the two new source entries and one accepted alias decision; the new source IDs are unique.
- Exact phrase ownership, picker boundary, and full recipe-corpus scans passed.
- The changed JSON files are UTF-8 without BOM and store non-ASCII characters as explicit Unicode escapes. Scoped whitespace checks passed.
- No app tests, unit tests, instrumentation tests, emulator checks, or deployment were run because this change only adds database JSON data, as specified in `AGENTS.md`.

Hashes cover exact file bytes. The recipe fingerprint hashes each manifest-relative path, a NUL byte, exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Count | Bytes | SHA-256 or corpus fingerprint |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,270 references | 406,684 | `783b4c4e55d1f638283f11582c7c56743aade73664f8af3241a23d151f003802` |
| `ingredient-forms.v1.json` | 94 forms | 70,793 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 65 candidates | 15,508 | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,578 records; 5,579 source entries; 4,615 distinct source IDs; 8 conversions | 5,454,615 | `36af8936e353e2640df8be8ce9df29b9cd91b582dfe05ac7cf83469f59600664` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 rows | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,270 references | 556,645 | `242747631cf6db0505c44a1f57f0ba86c41eb9b9736338e862ef45f1ebe0a33b` |

See the [source proposal](../../proposals/wp02-a1-entire-wheat-flour-alias-review-20261012.md) for the full source and ownership audit.
