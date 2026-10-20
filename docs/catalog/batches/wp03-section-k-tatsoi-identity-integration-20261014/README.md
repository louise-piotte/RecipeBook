# WP03 Section K — tatsoi identity integration (R117)

Integrated on 2026-10-14. The broader Section K leafy-green and brassica sweep remains open.

## Decision

Added `ingredient-ref-tatsoi` in `VEGETABLE_AND_AROMATIC` with `tatsoi` for both English and fr-CA display. Added the English search aliases `tat soi`, `tah tsai`, and `tat choy`, supported by Canadian crop/seed sources. Added no French alias: accent normalization resolves `tatsoï` to the display name. Kept `rosette bok choy`, `rosette pak choy`, mustard descriptors, and generic `chou chinois` out of aliases because they either collide with existing picker identities or describe a broader food family.

Québec grower and market pages use Tatsoi in French-facing content. This is a supported borrowed market name; no OQLF terminology ruling is claimed. A separate bilingual terminology review remains open.

## Data boundary

- The 114 bundled recipes and 1,123 ingredient rows have no tatsoi demand; no recipe link was added.
- The RICARDO bowl’s `4 cups / 100 g` leaves amount is recorded as a source-specific `portion_weight` observation only. No cup-to-mass mapping, density, serving default, or packing method is activated.
- The same recipe page suggests baby bok choy leaves or spinach for that bowl. This is preserved as a `blocked_pending_evidence` contextual ledger finding because it supplies no quantity and the catalog has no generic spinach identity or bok-choy leaf form. No active substitution rule or recipe-line substitution was added.
- No forms, conversions, yields, or microgreen identity were added.

The source register and full boundary analysis are in the [R117 proposal](../../proposals/wp03-next-section-k-tatsoi-identity-gap-review-20261014-r2.md).

## Verification

- Bundled reference normalization and package validation passed.
- The generated `BundledIngredientCatalog.kt` index was refreshed and its `--check` passed.
- Research-ledger schema/semantic validation passed.
- Picker projection confirmed `tatsoi`, `tatsoï`, `tat soi`, `tah tsai`, and `tat choy` resolve to this row; exact `bok choy` ownership remains unchanged.
- UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- No app or emulator tests were run because this change adds database JSON data under the updated `AGENTS.md` rule.
