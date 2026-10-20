# WP02 B3 isolated plantain-starch naming hold

- **Date:** 2026-10-12.
- **Proposal:** [isolated plantain starch Québec naming hold](../../proposals/wp02-b3-plantain-starch-quebec-naming-hold-review-20261012.md).
- **Scope:** Record one unresolved research candidate. No active seed reference or recipe changed.

## Decision integrated

Recorded `candidate-plantain-starch` as an unresolved research-ledger candidate, separate from green plantain flour and dessert-banana starch. Primary studies establish isolated plantain starch as a distinct material, but the reviewed Canadian/Québec sources do not establish a standalone product label or a validated Québec French display. `Amidon de banane plantain` remains a descriptive construction rather than an accepted display or alias.

The existing `plantain flour / farine de plantain` aliases stay on the green-plantain-flour row. No active reference ID was reserved, and no alias, form, recipe link, measurement, conversion, yield, or substitution was added. The candidate records seven bounded sources. Its measurement state is `researched_no_supported_value`; study-specific extraction yields and lab properties do not establish a reusable kitchen measure. Substitution research remains `not_yet_researched`.

The 114-recipe, 1,123-row corpus has no exact plantain-starch demand. Broader `plantain` searches continue to return the existing fresh-fruit and green-flour identities.

## Final package and data snapshot

The package contains 1,254 active ingredient references, 94 forms, and 66 legacy candidates. The ledger contains 1,563 records, 5,467 source entries, 4,505 distinct source IDs, and 8 unit conversions, with zero validation errors. The 114 manifest-listed recipes contain 1,123 ingredient rows and 753,736 recipe-file bytes.

| Artifact | SHA-256 |
|---|---|
| `ingredient-references.v1.json` | `7a2916bb212ad9cc967ba63520c0ee01115d11d06bd9fce106a53819796904e7` |
| `ingredient-forms.v1.json` | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `BundledIngredientCatalog.kt` | `baff8547d208f37750f6b4b2478c24b984fbf799d729572f72a1b02571166ffe` |
| `research-ledger.v1.json` | `f2c2040ce7d49b717bcbb051fd904ad1a305ae307c20f07b0c35c3ebb378acc0` |
| `manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

## Static validation

Passed:

- bundled seed-package validation and ingredient-reference normalization checks;
- generated catalog freshness check at 1,254 references;
- research-ledger validation (1,563 records, zero errors);
- exact-name and alias ownership scan, plus a zero-hit audit of all 114 recipes and 1,123 ingredient rows;
- UTF-8/no-BOM and whitespace checks for changed JSON and documentation, plus targeted `git diff --check`.

No app unit tests, instrumentation tests, emulator checks, or deployment were run. This integration only adds research database JSON data under `AGENTS.md`.
