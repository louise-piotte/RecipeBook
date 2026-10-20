# WP02 / WP03 / WP04 round-twenty-eight gap-review integration

Date: 2026-10-13

## Dispositions

- **WP02 A7 — einkorn meal:** Kept the candidate unallocated. Sources identify einkorn flour and
  whole grain but establish neither a separate einkorn-meal product nor a Québec French meal name.
  Do not alias meal to flour or grain; add no active reference, legacy candidate, form, measure,
  recipe link, conversion, yield, or substitution. See the [boundary review](../../proposals/wp02-a7-einkorn-meal-boundary-review-R28-20261013.md).
- **WP03 Section G — cornbread:** Added identity-only `cornbread / pain de maïs` as
  `ingredient-ref-cornbread` in `BAKING_MIXIN_AND_PANTRY`. English aliases are `corn bread` and
  `corn breads`; the French alias is `pains de maïs`. Keep cornmeal, polenta, corn muffins,
  johnnycakes, hush puppies, corn cakes, and other named breads distinct. The full recipe corpus has
  no matching ingredient line. Add no forms, active measures, mappings, recipe links, conversions,
  yields, or substitutions. See the [identity review](../../proposals/wp03-section-g-cornbread-identity-review-20261013-round28.md).
- **WP04 Section P — Jonah crab:** Added identity-only `Jonah crab / crabe nordique` for
  *Cancer borealis* as `ingredient-ref-jonah-crab`, with no aliases. Keep `crabe commun` off the
  row because Québec terminology evidence applies it to both Jonah and rock crab. Broad `crab` and
  `crabe` searches continue to show multiple species/products. The full recipe corpus has no
  Jonah-specific demand. Add no forms, active measures, mappings, recipe links, conversions,
  yields, or substitutions. See the [identity review](../../proposals/wp04-section-p-jonah-crab-identity-boundary-review-20261013-r28.md).

## Shared data changes

The active package now has **1,357 ingredient references** and **100 forms**. The research ledger
has **1,681 records** and **6,570 source entries**, with **5,506 distinct source IDs** and
**4,588 distinct URLs**. It retains **343 measurement observations** and **195 substitution
findings**. The generated Kotlin catalog contains 1,357 references. R28 added two active identity
rows, two identity ledger records, and fourteen source entries. It added no forms, measurement
observations, substitution findings, recipe links, or package yields.

The manifest-listed recipe corpus remains at **114 files**, **1,123 ingredient rows**, and
**753,792 bytes**. No recipe JSON or line links changed.

| Artifact | State after R28 |
|---|---:|
| `ingredient-references.v1.json` | 1,357 references |
| `ingredient-forms.v1.json` | 100 forms |
| `research-ledger.v1.json` | 1,681 records; 6,570 sources; 5,506 IDs; 4,588 URLs |
| Measurement observations | 343 |
| Substitution findings | 195 |
| `BundledIngredientCatalog.kt` | 1,357 references |
| Recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes |

## Picker and corpus checks

- Full `cornbread`, `corn bread`, `pain de maïs`, and `pains de maïs` searches resolve to the new
  cornbread reference. The broader queries `corn`, `maïs`, `bread`, and `pain` remain multi-result;
  their counts are 19, 21, 14, and 16 respectively after adding the row.
- Full `Jonah crab` and `crabe nordique` searches resolve to the new Jonah-crab reference. Broad
  `crab` and `crabe` searches each return blue crab, crab meat, Dungeness crab, and Jonah crab;
  `crabe commun` and `rock crab` remain unassigned.
- The 114-file / 1,123-row recipe corpus has no cornbread or Jonah-crab line. Existing recipe
  019#8 remains linked to crab meat and its Jumbo Lump form.

## Verification

- Ingredient-reference normalization, bundled-package normalization, package validation, and
  generated Kotlin catalog freshness checks passed.
- Ledger schema validation, source-ID resolution, and source URL checks passed through package
  validation.
- Static phrase-first picker projection confirmed the exact and broad queries listed above.
- UTF-8 without BOM, mojibake, local Markdown links, and scoped whitespace checks passed.
- No app, unit, instrumentation, or emulator tests were run. The active changes add database JSON
  data and regenerate its Kotlin index; the updated `AGENTS.md` says JSON-only database additions
  do not need testing.

See the [einkorn-meal review](../../proposals/wp02-a7-einkorn-meal-boundary-review-R28-20261013.md),
[cornbread review](../../proposals/wp03-section-g-cornbread-identity-review-20261013-round28.md), and
[Jonah-crab review](../../proposals/wp04-section-p-jonah-crab-identity-boundary-review-20261013-r28.md).
WP02 A7, Section G, and Section P remain open.
