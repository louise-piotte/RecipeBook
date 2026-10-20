# WP05 regional spice-blend identity integration

## Decisions

Added three identity-only `BAKING_AND_SPICE` references:

| ID | English / French display | Search aliases | Boundary |
|---|---|---|---|
| `ingredient-ref-ras-el-hanout` | `ras el hanout` / `ras-el-hanout` | EN `ras-el-hanout`; FR `ras el hanout` | OQLF-supported hyphen variants; no broad `Moroccan seasoning` alias or universal formula. |
| `ingredient-ref-baharat` | `baharat` / `baharat` | None | Products explicitly named baharat; regional seven-spice and Turkish variants remain qualified. |
| `ingredient-ref-dukkah` | `dukkah` / `dukkah` | EN `duqqa` | Product formulas vary; no fixed nut, seed, salt, or allergen profile. |

The sources show different formulas within each named blend. No bundled recipe line matches these terms. No forms, density, unit mapping, measurement, conversion, package yield, recipe link, or substitution was added. See the [identity review](../../proposals/wp05-regional-spice-blends-ras-el-hanout-baharat-dukkah-review-20261011.md).

## Files and verification

Added three active references and three verified identity-ledger records with 12 unique source IDs, then updated the Section T checklist and roadmap. The package has 1,042 references / 72 forms / 114 recipes / 1,123 ingredient rows; the ledger has 1,334 records / 4,392 source entries / 3,625 distinct source IDs. Pre-integration exact collision and recipe scans were clean; all proposal source IDs were new.

Structural package normalization and validation, reference normalization, generated-index freshness, ledger validation, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator were run for these database JSON additions.
