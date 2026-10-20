# WP03 Milo and WP04 Atlantic Tomcod Integration

- **Date:** 2026-10-12.
- **Inputs:** [WP03 milo boundary review](../../proposals/wp03-section-f-milo-grain-alias-boundary-review-20261012.md) and [WP04 Atlantic tomcod identity review](../../proposals/wp04-section-p-atlantic-tomcod-identity-review-20261012.md).
- **Scope:** One accepted fish identity and one accepted alias hold. No recipe text changed.

## Decisions integrated

- Added identity-only `ingredient-ref-atlantic-tomcod` in `PROTEIN`, with English display `Atlantic tomcod`, fr-CA display `poulamon`, and no aliases. The identity is limited to *Microgadus tomcod*. It remains separate from Atlantic/Pacific cod, burbot, Pacific tomcod, and the other regional names that OQLF does not retain for Québec fish-product marketing.
- Kept `ingredient-ref-grain-sorghum` and its empty aliases unchanged. Recorded an accepted hold for bare `milo`, `sorghum milo grain`, and `grain de sorgho milo`; the current sources do not establish a sufficiently scoped Québec human-food alias for the general grain-sorghum row.
- Added four tomcod sources and its accepted identity decision to the new ledger record. Added seven milo review sources and the alias-boundary decision to the existing grain-sorghum ledger record, reusing its existing OQLF source `WP03-S22` for the displayed term.
- Left forms, recipe links, measures, densities, unit mappings, conversions, yields, and substitutions unchanged. Measurement and substitution research for tomcod remains unresearched.

## Recipe and package audit

The manifest-ordered package contains 114 recipes and 1,123 ingredient rows. Exact whole-phrase searches across all recipe files found no hits for the reviewed tomcod names or milo/sorghum-grain candidates. The recipe corpus remains 753,736 bytes with digest `3a2a0736febcca77bc8cdc058e1c1eec2c21032f4b1e573c0129bb569cd62aa3`.

The final package contains 1,253 ingredient references, 94 forms, and 66 legacy candidates. The research ledger contains 1,561 records, 5,446 source entries, and 4,484 distinct source IDs, with zero validation errors.

| Artifact | SHA-256 |
|---|---|
| `ingredient-references.v1.json` | `75e1ecad60f53aa4698c98ab294c32903cfffa2266d4dc16a932ede6fda6c889` |
| `ingredient-forms.v1.json` | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `BundledIngredientCatalog.kt` | `89a7cf4842c00af096c82d5e0437dc5f39d1d912873a9937eda3eafd1a25b773` |
| `research-ledger.v1.json` | `460185a66893d25c2381ee7b51c5950da04cd3d4feb015e05c889816977ff98f` |
| `manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

## Static validation

Passed:

- bundled seed-package normalization check and validation-only check;
- ingredient-reference normalization check;
- generated catalog freshness check at 1,253 references;
- research-ledger validation: 1,561 records, zero errors;
- exact recipe-phrase scan across the 114 manifest-listed files;
- UTF-8/no-BOM and whitespace checks for the changed data and documentation.

No app tests, Android instrumentation tests, emulator checks, or deployment were run. The catalog updates only add database JSON data and ledger evidence, covered by the JSON-only rule in `AGENTS.md`.
