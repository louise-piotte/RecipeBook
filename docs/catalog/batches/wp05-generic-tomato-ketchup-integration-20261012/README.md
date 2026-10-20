# WP05 generic tomato-ketchup integration

- **Date:** 2026-10-12.
- **Proposal:** [generic tomato ketchup identity review](../../proposals/wp05-generic-tomato-ketchup-identity-review-20261012.md).
- **Scope:** Verify the existing ketchup identity and add English search aliases. No recipe content changed.

## Decision integrated

Verified the existing `ingredient-ref-ketchup` identity as generic tomato ketchup, with `ketchup` as its English and Québec French display. Added the CFIA/OQLF-supported English aliases `catsup`, `catchup`, `katsup`, `tomato catsup`, and `tomato ketchup`. French aliases remain empty because OQLF identifies unqualified `ketchup` as the preferred French term and discourages `ketchup aux tomates` for the usual tomato product.

Banana ketchup, Québec fruit ketchup, and green-tomato ketchup remain separately qualified identities. Phrase search for `catsup` returns generic ketchup and banana ketchup; `tomato ketchup` returns generic ketchup and green-tomato ketchup because the complete qualified names contain those phrases. `catchup`, `katsup`, and `tomato catsup` each return the generic identity alone. These results preserve both the standardized names and their qualified product distinctions.

Recipes 034, 074, and 101 already request unqualified ketchup and link to the generic reference. No recipe lines were changed. No forms, density, unit mappings, measurements, conversions, yields, or substitutions were added. Measurement research remains blocked pending evidence; substitution research remains not yet researched.

The research ledger retains the older unresolved note about removed source-less numeric drafts, marks identity verified, adds four sources, and records the accepted naming/alias decision.

## Final package and data snapshot

The package contains 1,254 ingredient references, 94 forms, and 66 legacy candidates. The ledger contains 1,562 records, 5,460 source entries, 4,498 distinct source IDs, and 8 unit conversions, with zero validation errors. The 114 manifest-listed recipes contain 1,123 ingredient rows and 753,736 recipe-file bytes.

| Artifact | SHA-256 |
|---|---|
| `ingredient-references.v1.json` | `7a2916bb212ad9cc967ba63520c0ee01115d11d06bd9fce106a53819796904e7` |
| `ingredient-forms.v1.json` | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `BundledIngredientCatalog.kt` | `baff8547d208f37750f6b4b2478c24b984fbf799d729572f72a1b02571166ffe` |
| `research-ledger.v1.json` | `a6671fa6261e5d4904ca1a56bc5a73d64e06be9d5dc2cb39129c874711103636` |
| `manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

## Static validation

Passed:

- bundled seed-package normalization and validation-only checks;
- ingredient-reference normalization and generated-index freshness checks (1,254 references);
- research-ledger validation (1,562 records, zero errors);
- static phrase-ownership checks for the five aliases and qualified ketchup boundaries;
- recipe audit across all 114 manifest-listed files and 1,123 ingredient rows;
- UTF-8/no-BOM and whitespace checks for changed data and documentation, plus targeted `git diff --check`.

No app unit tests, instrumentation tests, emulator checks, or deployment were run. This change only adds database JSON data and its generated index, per `AGENTS.md`.
