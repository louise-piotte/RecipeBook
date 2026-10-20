# WP04 Section P cunner / tanche-tautogue Québec market hold

- **Date:** 2026-10-12.
- **Proposal:** [cunner Québec market and picker-boundary review](../../proposals/wp04-section-p-cunner-quebec-market-hold-review-20261012.md).
- **Scope:** Integrate a documentation-only hold. No active catalog or ledger data changed.

## Decision integrated

Keep cunner / `tanche-tautogue` (*Tautogolabrus adspersus*) unallocated. OQLF supports the Québec species/name pair, but the current Fourchette Bleue guide reports no commercial fishing and says it is not yet commercialized in Québec. The hold is local to current Québec market evidence; it does not claim the fish is never consumed elsewhere.

Do not add short `tanche` as an alias. The picker matches complete word phrases within a stored name, so a bare `tanche` query would return `tanche-tautogue` even without a standalone alias. Keep the short local and alternate names out of the active catalog until current product evidence and the search boundary are resolved.

No active reference, ledger candidate, alias, form, recipe link, measure, conversion, yield, or substitution was added. The reviewed 114-recipe, 1,123-row corpus has no cunner, `tanche-tautogue`, or alternate-name demand. The plan and roadmap now record this reviewed hold; broader Section P coverage remains open.

## Current worktree snapshot

| Artifact | Count/state | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,254 references | `7a2916bb212ad9cc967ba63520c0ee01115d11d06bd9fce106a53819796904e7` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,563 records; 5,467 source entries; 4,505 distinct source IDs | `f2c2040ce7d49b717bcbb051fd904ad1a305ae307c20f07b0c35c3ebb378acc0` |
| `BundledIngredientCatalog.kt` | 1,254 references | `baff8547d208f37750f6b4b2478c24b984fbf799d729572f72a1b02571166ffe` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,736 bytes | `3a2a0736febcca77bc8cdc058e1c1eec2c21032f4b1e573c0129bb569cd62aa3` |

## Review checks

- OQLF and TERMIUM names identify the species, while the Fourchette Bleue page supplies the current Québec commercialization limitation.
- Exact normalized ownership searches found no active reference, form, legacy candidate, or ledger candidate for cunner, `tanche-tautogue`, *Tautogolabrus adspersus*, or the reviewed alternates.
- Static picker-phrase and full-recipe scans found the bare-`tanche` phrase overlap and zero recipe demand.
- UTF-8/no-BOM, whitespace, and targeted diff checks passed for the documentation changes.

No app tests or emulator checks were run because this is a documentation-only hold.
