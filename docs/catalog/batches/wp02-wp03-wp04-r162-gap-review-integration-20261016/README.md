# WP02 / WP03 / WP04 R162 gap-review integration

Reviewed and integrated on 2026-10-16. Root reviewed the three proposal-only files before updating
shared catalog data, the research ledger, generated index, active plan, and roadmap.

## Decisions

| Work area | Integrated decision |
|---|---|
| WP02 A6 — sorghum naming | Added English alias `red sorghum` to the existing grain-sorghum reference and `red sorghum flour` to the existing sorghum-flour reference. The shorter `red sorghum` query returns both grain and flour choices; the flour-specific query returns the existing flour row. Added no French aliases or red-specific identities. Existing flour measurements and blocked substitution research remain unchanged. |
| WP03 Section F — blue corn | Added identity-only `blue corn kernels / grains de maïs bleu` in `GRAIN_AND_CEREAL`, scoped to dry, food-grade whole kernels for human food use. The French display is a transparent construction from Usito's Québec term `maïs bleu`, not a direct package title or OQLF ruling. Kept it distinct from generic and sweet corn, Chulpe, popcorn, hominy, milled products, and prepared foods. |
| WP04 Section P — blackfin tuna | Held *Thunnus atlanticus* / `blackfin tuna / thon à nageoires noires` outside active references and the ledger. Adding the row would make `blackfin` return one tuna while CFIA also uses Blackfin Sea Bass for *Lateolabrax latus*. No bundled recipe or species-identified Québec product resolves the picker gap. |

## Package and recipe scope

The blue-corn identity has no matching bundled-recipe demand. The full bundle remains 114 manifest-listed
recipes and 1,123 ingredient rows. No recipe, form, package yield, or substitution rule changed. No new
measure, density, unit mapping, conversion, yield, or substitution finding was added. Existing sorghum
measurements and the sorghum-flour blocked substitution state were preserved.

The WP02 integration reuses the existing ledger sources for TastyGrains and FAO's sorghum reference.
It adds Massa Industries and Green Star sources to the flour record; the indexed JD Best listing and
the general CFIA species source were not needed for the accepted aliases. WP03 registers its four
proposal sources only on the new blue-corn ledger record. WP04 allocates no row, candidate, or source.

## Verification

- Seed-package normalization and validation passed; no package parts required normalization.
- Generated `BundledIngredientCatalog.kt` is current at 1,538 ingredient references.
- Research-ledger schema, source-ID linkage, source ownership, picker projection, recipe scan, escaped
  JSON Unicode, UTF-8/no-BOM, local links, and scoped whitespace checks passed.
- Final totals: 1,538 references, 119 forms, 1,883 ledger records, 8,016 source entries, and 6,859
  distinct source IDs; the recipe bundle remains 114 files / 1,123 ingredient rows.
- No app, unit, instrumentation, emulator, or deployment tests were run because the catalog changes
  add database JSON data under the current `AGENTS.md` rule.

## Proposals

- [WP02 A6 red-sorghum aliases review](../../proposals/wp02-a6-red-sorghum-name-coverage-review-r162-20261016.md)
- [WP03 blue-corn-kernels identity review](../../proposals/wp03-section-f-blue-corn-kernels-identity-review-r162-20261016.md)
- [WP04 blackfin-tuna picker-boundary hold](../../proposals/wp04-section-p-blackfin-tuna-picker-boundary-hold-r162-20261016.md)
- [Active catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)
