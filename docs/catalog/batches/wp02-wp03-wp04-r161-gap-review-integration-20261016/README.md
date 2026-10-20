# WP02 / WP03 / WP04 R161 gap-review integration

Reviewed and integrated on 2026-10-16. Root reviewed the three proposal-only files before
updating shared catalog data, the research ledger, generated index, plan, and roadmap.

## Decisions

| Work area | Integrated decision |
|---|---|
| WP02 A6 — buckwheat flour | Added identity-only `dark buckwheat flour / farine grise de sarrasin` as a separate `FLOUR_AND_STARCH` row. The Québec mill lists dark/gray flour separately from its pale and whole products. Added no aliases, forms, measures, density, mappings, conversions, yields, recipe links, or substitutions. |
| WP03 Section F — Chulpe corn | Added identity-only `Chulpe corn / maïs chulpe` in `GRAIN_AND_CEREAL`. Kept `Chulpi corn`, `Chullpi corn`, `maïs chulpi`, and `maïs chullpi` as spelling aliases. Kept `cancha` unassigned. The source title `Chulpe corn for toasting` remains evidence only: the picker matches query phrases within terms, so that alias would make broad `corn for toasting` resolve to one Chulpe row. Added no forms, measures, density, mappings, conversions, yields, recipe links, or substitutions. |
| WP04 Section P — soft-shell clam | Held *Mya arenaria* / `soft-shell clam / mye` outside active references and the ledger while the generic clam identity remains unresolved. The row would make broad `clam` search return one species, and the recipe bundle contains no clam demand. |

## Package and recipe scope

The two accepted rows have no matching bundled-recipe demand. All 114 manifest-listed recipes and
1,123 ingredient rows were checked. No recipe files, forms, package yields, or substitution rules
were changed. The ¼-cup (32 g) value mirrored for a Goya Chulpe product was not verified against a
manufacturer label or matching USDA record and was not added as a ledger observation, measure, or
density. The buckwheat directory's serving applies to a separately named whole-flour product and was
not transferred.

The proposal-local source IDs were registered only to their accepted ledger records. WP02 reuses
the existing OQLF source `WP02-S31`. The WP04 hold allocates no source or candidate record.

## Verification

- Seed-package normalization and validation passed; no package parts required normalization.
- Generated `BundledIngredientCatalog.kt` is current at 1,537 ingredient references.
- Research-ledger schema, record/source-ID links, source ownership, picker projection, recipe scan,
  escaped JSON Unicode, UTF-8/no-BOM, local links, and scoped whitespace checks passed.
- Final totals: 1,537 references, 119 forms, 1,882 ledger records, 8,009 source entries, and 6,853
  distinct source IDs; the recipe bundle remains 114 files / 1,123 ingredient rows.
- No app, unit, instrumentation, emulator, or deployment tests were run because the catalog changes
  add database JSON data under the current `AGENTS.md` rule.

## Proposals

- [WP02 A6 dark buckwheat flour review](../../proposals/wp02-a6-next-regional-flour-gap-review-r161-20261016-dark-buckwheat-flour.md)
- [WP03 Chulpe corn identity review](../../proposals/wp03-section-f-chulpe-corn-identity-review-r161-20261016.md)
- [WP04 soft-shell clam / mye boundary review](../../proposals/wp04-section-p-mye-commune-species-picker-boundary-review-r161-20261016.md)
- [Active catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)
