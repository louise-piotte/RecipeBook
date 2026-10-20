# WP04 butter products integration — 2026-10-10

## Integration outcome

- Added `ingredient-ref-half-salted-butter` as `half-salted butter` / `beurre demi-sel`, with English alias `semi-salted butter`.
- Linked only recipe `024#10` (`170 g semi-salted butter, softened`) to the new reference. Its source text, amount, unit, and preparation were preserved.
- Removed `beurre demi-sel` from `ingredient-ref-salted-butter`. Existing unsalted butter and ghee identities remain distinct; `beurre doux` stays limited to the source-defined sweet-cream product.
- Recorded held research candidates for cultured butter, generic clarified butter, and a browned-butter preparation form. They have no bundled ingredient-line demand, so no active references/forms were added.
- Added 14 source records and explicit evidence decisions to the research ledger. Product-specific servings and sodium comparisons remain source-scoped; no density, unit mapping, conversion, package yield, or new substitution rule was activated.

## Evidence and boundaries

The source proposal records the OQLF terminology, CFIA butter and clarified-butter standards, Natrel and Maxi product wording, and the OQLF/King Arthur brown-butter process distinction: [WP04 butter-products identity review](../../proposals/wp04-butter-products-identity-review-20261010.md).

## Package snapshot

After the shared catalog integrations settled, the package contains 853 ingredient references, 47 forms, and 1,099 research-ledger records (2,613 source entries / 2,039 distinct source IDs). Hashes cover exact file bytes; the recipe-corpus fingerprint processes each manifest-relative path, a NUL byte, the exact recipe bytes, and another NUL byte in manifest order.

| Artifact | Count | SHA-256 / fingerprint |
| --- | ---: | --- |
| Ingredient references | 853 | `70d0e37da498e5889ef97ff96fdaa4183b86e6ed4dfdc59e45addb816524aba9` |
| Ingredient forms | 47 | `7676316bf4e3b0ba6972b6c0759f0a86156428f03a2e86730ff6b986756ff3ce` |
| Research ledger | 1,099 records / 2,613 source entries / 2,039 source IDs | `acb5f6ed7b993f04c870e6c32e094e5671b368560e854dec137eef25fff0fc6b` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 recipes / 1,123 ingredient rows | `cacecabe373f8eec512d4921d2101fc6abee9ee098285d7212f41e8aa3897e00` |

## Verification

- Bundled-package normalization and validation, ingredient-reference normalization, generated-index freshness, and research-ledger validation passed; the ledger validator reported 1,099 records and no errors.
- Python bundled-seed package tests: 29 passed.
- Android unit tests: 349 passed, 0 failed, 0 skipped. Connected Android instrumentation: 30 cases, 28 passed, 2 skipped, 0 failures/errors.
- `tools/deploy_to_pixel9a_emulator.sh` passed its test/build steps, installed the debug APK, and launched the app.
- Pixel QA used a disposable Pixel 9a / Android 16 API 36 clone at 1080 × 2424 and 420 dpi (`emulator-5558`). The home screen loaded all 114 recipes. The Date Squares detail displayed `170 g half-salted butter, softened`, confirming the recipe's new catalog link. The original AVD image SHA-256 remained `48d6753085207cbbdf6b1c2bc9416af3fe92ad42f6000ed5cfa49103ed0f9997`.
- Screenshot evidence is in [`screenshots/`](screenshots/): [English home](screenshots/pixel9a-en-home.png) (`d1fcf4f5d0ebb0dec91724f752b797bf022ab20dd0b8749910b89d70b8f4d659`) and [Date Squares butter row](screenshots/pixel9a-en-date-squares-half-salted-butter.png) (`dfeb2aa88c6be34ce29d4fabf7f3b0d3ec3209eebec0f60ca2b18d8b3948df09`).
- `git diff --check` passed.
