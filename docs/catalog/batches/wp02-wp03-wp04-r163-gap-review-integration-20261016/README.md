# WP02 / WP03 / WP04 R163 gap-review integration

Reviewed and integrated on 2026-10-16. The three proposal files were audited before shared
catalog data, the research ledger, generated index, active plan, and roadmap were updated.

## Decisions

| Work area | Integrated decision |
|---|---|
| WP02 A6 — foxtail-millet naming | Added English aliases `kakum` and `kakun` to the existing foxtail-millet grain row and `kakum flour` to the existing flour row. `kakum` returns both existing rows, `kakum flour` selects flour, and `kakun` selects grain. Reused the existing IIMR, FSSAI, and Silkrute source IDs. French displays, measurements, and blocked flour substitution research remain unchanged. |
| WP03 Section F — white corn | Added identity-only `white corn kernels / grains de maïs blanc` in `GRAIN_AND_CEREAL`, scoped to dry, food-grade whole white kernels for human food use. Kept it distinct from yellow or mixed grain corn, sweet corn, blue corn, white canjica, popcorn, hominy, and milled or prepared products. The short `maïs blanc` search now shows white corn and white canjica together. |
| WP04 Section P — Atlantic argentine | Held *Argentina silus* / `Atlantic argentine / grande argentine` outside the active catalog and ledger. CFIA also assigns `Argentine / Argentine` to *Argentina elongata*, and OQLF says the unqualified Québec fish-product name was not retained. A lone Atlantic argentine row would make `argentine` misleadingly appear resolved. |

## Data and recipe scope

The bundle remains 114 manifest-listed recipes and 1,123 structured ingredient rows. The focused
candidate scans found no matching recipe demand. The white-corn row has no aliases, forms, density,
unit mappings, measurements, conversions, yields, recipe links, or substitutions. Foxtail-millet
measurements and the flour's blocked substitution finding were preserved. The Atlantic argentine
hold adds no reference, candidate, or source.

WP03 registered five new evidence sources on the white-corn ledger record and reused the existing
Montréal canjica source only for locally attested French wording. WP02 reused its existing source
IDs; the FSSAI source is also attached to the foxtail grain row with a locator scoped to Kakun.

## Verification

- Seed-package normalization, validation, and generated-index freshness passed.
- Research-ledger schema, decision/source linkage, and reused-source bibliographic consistency checks
  passed; white-corn source ownership and the existing CFIA/OQLF argentine sources were reviewed.
- Exact-key ownership, picker projection, recipe corpus scan, escaped JSON Unicode, UTF-8/no-BOM,
  local links, scoped whitespace, and `git diff --check` passed.
- Final totals: 1,539 references, 119 forms, 1,884 ledger records, 8,023 source entries, and 6,864
  distinct source IDs; the recipe bundle remains 114 files / 1,123 rows.
- No app, unit, instrumentation, emulator, or deployment tests were run. The catalog change adds
  database JSON data, which is covered by the updated project no-testing rule.

## Proposals

- [WP02 A6 Kakum foxtail-millet alias review](../../proposals/wp02-a6-next-regional-flour-gap-review-r163-20261016-kakum-foxtail-millet.md)
- [WP03 white-corn-kernels identity review](../../proposals/wp03-section-f-white-corn-kernels-identity-review-r163-20261016.md)
- [WP04 Atlantic argentine picker-boundary hold](../../proposals/wp04-section-p-atlantic-argentine-picker-boundary-review-r163-20261016.md)
- [Active catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)
