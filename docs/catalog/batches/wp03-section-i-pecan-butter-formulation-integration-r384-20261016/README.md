# R384 pecan-butter formulation evidence

Integrated 2026-10-16 under the open WP03 Section I formulation checklist.

## Decision

Updated the existing verified `ingredient-ref-pecan-butter` ledger evidence and added one accepted formulation decision. The current Balsam Tahini page describes its SKU as 100% dry-roasted pecans, with no added oils, sugars, or emulsifiers, and says normal top oil separation occurs without stabilizers. The stored Québec Les Minettes product snapshot describes a separate blend of pecans, almonds, maple sugar, coconut, and salt. Keep both claims product-specific; the name `pecan butter` does not imply one universal formula.

The active `pecan butter / beurre de pacanes` row, aliases, null density, and empty unit mappings remain unchanged. Measurement and substitution research remain not yet researched. No form, measure, recipe link, conversion, yield, or substitution was added. The bundled recipes have no pecan-butter demand. The Section I formulation checklist remains open for other identities; see the [R384 proposal](../../proposals/wp03-section-i-next-gap-review-r384-20261016.md).

## Verification

- Reused `WP03-PASTE-PRODUCT-20261010-S11` and `S12`; no source IDs or URLs were added. Updated S11’s access date and support after the 2026-10-16 product-page recheck. S12 remains a stored 2026-10-10 product-page capture because its route returned a cache miss during R384; no current availability is inferred.
- The 114-file, 1,123-row manifest corpus scan found no whole-word phrase hits and no direct link to `ingredient-ref-pecan-butter`.
- Ledger schema/linkage, UTF-8/no-BOM, local-link, whitespace, and scoped-change checks passed. Ledger totals remain 2,056 records / 9,267 source entries / 7,842 distinct source IDs / 6,564 distinct URLs.
- No software tests, build, emulator, or deployment checks were run because the only data change adds research information to the database JSON under `AGENTS.md`.
