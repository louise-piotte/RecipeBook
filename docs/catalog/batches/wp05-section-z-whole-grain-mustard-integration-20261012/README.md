# WP05 Section Z Whole-Grain Mustard Integration

- **Date:** 2026-10-12.
- **Proposal:** [whole-grain mustard identity and Québec wording review](../../proposals/wp05-section-z-whole-grain-mustard-quebec-identity-boundary-review-20261012.md).
- **Scope:** One identity-only prepared-condiment reference and a narrow English alias. No recipe content changed.

## Decision integrated

Added `ingredient-ref-whole-grain-mustard` in `SAUCE_AND_CONDIMENT` with English display `whole grain mustard`, fr-CA display `moutarde à l’ancienne`, and English alias `old-fashioned mustard`. French aliases remain empty. The identity is bounded to the prepared condiment class supported by whole or partly crushed mustard seeds; the alias `old-fashioned mustard` is limited to the Québec producer wording paired with that texture.

OQLF distinguishes dry mustard (`moutarde`) from prepared paste (`moutarde préparée`) and defines Dijon mustard separately. Morehouse lists whole-grain mustard as a separate product class and describes whole or partly crushed seeds. La Maison Orphée directly pairs `Moutarde à l’Ancienne Biologique` with `Organic Old-Fashioned Mustard` and describes the crunch from partially crushed seeds. The Québec Food Directory corroborates the manufacturer, product, size, and prepared-in-Québec certification, while its English listing does not establish French terminology. Metro’s `Old-Style Prepared Mustard` SKU does not describe seed texture, so old-style wording alone remains outside the alias. See the proposal’s source register for source scope and limits.

Bare `mustard / moutarde`, generic prepared-mustard phrases, Dijon-qualified whole-grain products, mustard seeds, mustard greens, mustard oil, and pickled mustard greens remain separate. Under current phrase matching, broad `mustard` and `moutarde` queries now return seven related active references; each exact query `whole grain mustard`, `moutarde à l’ancienne`, and `old-fashioned mustard` returns only the new row. No recipe lines were relinked. The 114-recipe, 1,123-row corpus has no exact hit for the new identity or alias.

No forms, densities, unit mappings, measures, conversions, yields, or substitutions were added. The research ledger records ten external sources and the accepted identity decision; internal project boundary source S11 remains linked in the proposal as review context.

## Final package and data snapshot

The final package contains 1,254 ingredient references, 94 forms, and 66 legacy candidates. The ledger contains 1,562 records, 5,456 source entries, 4,494 distinct source IDs, and 8 unit conversions, with zero validation errors. The 114 manifest-listed recipes total 1,123 ingredient rows and 753,736 bytes. Their basename-ordered digest is `747f01139ccf1d682c6000a983c440642d454d1e3a8bd43fb4b2538d078d3a97`.

| Artifact | SHA-256 |
|---|---|
| `ingredient-references.v1.json` | `9d8c32f57f0c0b84dbe0ec96c42fb8a7d20c10394b9cc1fb15be9a21659914c8` |
| `ingredient-forms.v1.json` | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `BundledIngredientCatalog.kt` | `b5502d736c16b3a1db48b553fbd79ea31b4ec8beca132c767ba5f05ac09c4ad0` |
| `research-ledger.v1.json` | `4728ea57e46812816426e7e98ffe3ab25629099e1c6cc0a58c4d3e7e951abd81` |
| `manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

## Static validation

Passed:

- bundled seed-package normalization check and validation-only check;
- ingredient-reference normalization and generated catalog freshness checks (1,254 references);
- research-ledger validation (1,562 records, zero errors);
- exact phrase ownership audit for the new displays and alias, and broad mustard-query ownership audit;
- exact recipe phrase scan across all 114 manifest-listed files;
- UTF-8/no-BOM and whitespace checks for changed data and documentation.

No app unit tests, Android instrumentation tests, emulator checks, or deployment were run. This catalog update only adds database JSON data and its generated index, covered by the JSON-only rule in `AGENTS.md`.
