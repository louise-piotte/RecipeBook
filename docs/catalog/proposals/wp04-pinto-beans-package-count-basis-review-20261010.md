# WP04 Proposal: Source-Qualified Pinto-Bean Can Count and Liquid Basis

**Review date:** 2026-10-10
**Status:** Accepted and integrated in [`wp04-recipe-package-amounts-integration-20261010`](../batches/wp04-recipe-package-amounts-integration-20261010/README.md). Recipe `007#4` stores one can with a `NET_CONTENTS` basis and no inferred size or yield.
**Scope:** One exact package-count line in recipe 007, after excluding the previously reviewed package and count cases.

## Disposition

The direct source for *Mexican Inspired Bento Box Lunch* specifies `1 can of pinto beans`. Its method says to add the **whole can** of beans **along with the liquid**. This directly supports one recipe-specific can and use of its packed contents with liquid for `007#4`; it does not state the can's declared net amount, mass, drained weight, or composition.

Integration persists the already represented package count and source-supported net-contents basis in this line's existing `packageAmount` field:

```json
"packageAmount": {
  "count": 1,
  "packageType": "CAN",
  "requestedBasis": "NET_CONTENTS"
}
```

Keep `quantity: 1`, `unit: "can"`, `originalText: "1 can pinto beans with liquid"`, and the bilingual preparation text unchanged. Keep `declaredNetQuantity`, `declaredNetUnit`, and `packingMedium` unset. The direct source is recipe evidence, not a package label or yield specification. Do not infer the package size, packing-liquid type, bean mass, drained/edible amount, or cooking yield.

**Line-level integration is justified** for the source-supported count and use of contents with liquid. No reusable package-yield observation, count-to-mass conversion, ingredient form, or tomato/black-bean package evidence is justified. Keep the pinto-bean ledger `measurementState` as `not_yet_researched`; this recipe-specific package basis is not an ingredient-wide measurement finding.

## Exact recipe and catalog evidence

| Field | Current value / finding |
|---|---|
| Recipe | `007` — *Refried Pinto Beans* (from *Mexican Inspired Bento Box Lunch*) |
| Ingredient line | `4392bc3d-9785-43ac-b98e-496f96c1d628-ingredient-4` (`007#4`) |
| Current line text | `1 can pinto beans with liquid` |
| Current amount and unit | `quantity: 1`, `unit: "can"` |
| Current preparation | English `with liquid`; French `avec le liquide` |
| Current reference | Existing verified `ingredient-ref-pinto-beans` |
| Recipe-level source | Ethan Chlebowski, [Mexican Inspired Bento Box Lunch](https://www.ethanchlebowski.com/cooking-techniques-recipes/mexican-inspired-bento-box-lunch) |
| Direct source statements | Ingredient list: `1 can of pinto beans`. Method: `Add the whole can of beans along with the liquid`. |
| Existing package model | No pinto-bean entry in `package-yields.v1.json`; it has a source-specific S&W black-bean package entry, which is a different bean and product. |

The prior WP03 lentil/pea/soybean review lists this pinto-bean line only as out-of-scope lexical demand for that identity sweep; it explicitly added no package yield or measurement. The current WP04 package residual covers beef broth and cream of coconut, while the recent tomato-paste packet covers a different row. This pinto-bean line is not covered by those packages. The produce count packet's black-bean package evidence is not transferable to pinto beans.

## Evidence and limits

| Evidence dimension | Supported here | Remains unknown |
|---|---|---|
| **Package count** | One can in this exact source recipe. The current recipe row already retains that count and package unit. | No count mapping for other recipes or other pinto-bean products. |
| **Contents basis** | Use the whole can including its liquid; `NET_CONTENTS` is the matching package basis. | The source does not identify the liquid as water, brine, or another packing medium. Keep `packingMedium` null. |
| **Declared package amount** | No numeric net amount appears in the source. | No can size, net volume, net mass, or package weight. Do not insert a conventional can size. |
| **Edible / drained portion** | The source does not drain the beans before adding them. | No edible-mass or drained-mass observation. Do not apply a drained black-bean yield or a cooked/mashed yield. |
| **Composition and state** | The named product is pinto beans; the full can is added with liquid and then simmered and mashed. | Brand, SKU, bean composition, liquid composition, solids-to-liquid ratio, and post-cook yield are unspecified. Do not create a new canned-with-liquid form from this one line. |
| **Substitution and conversions** | None. | No density, can-to-mass mapping, cross-bean conversion, or substitute rule. |

The source identifies the refried-bean component as three servings, but it does not give a per-serving mass or volume. Do not divide an unknown can quantity or use the serving count to invent one.

## v1 integration boundary

- **Recipe data:** Add only the `packageAmount` object shown above to line `007#4`. Preserve the current source text, ingredient link, quantity, unit, and preparation values.
- **Full-library/schema DTOs and mapper:** No shape change is required. `IngredientPackageAmount` already supports `count`, `packageType`, and `requestedBasis`; the full-library and recipe-creation v1 schemas, Kotlin DTO, and mapper already support it. The package parser already recognizes `can` and `with liquid` as `NET_CONTENTS`, and because this line's quantity is one can, it does not have the volume-as-count issue found in the other hybrid package/volume lines.
- **Research ledger:** Do not add a package-yield record or measurement observation. The recipe's source URL and exact ingredient wording provide line provenance; the source gives no reusable size or yield. Leave the reference's measurement state unchanged.
- **Tests for a later integration:** Add a `PackageYieldConverterTest` fixture for this exact text/unit that asserts count `1`, package type `CAN`, null declared net size, null packing-medium type, and `NET_CONTENTS` basis. Add or extend `SchemaRoundTripTest` to preserve a can amount with no declared net-size pair alongside a quantity/unit of `1 can`. Do not add a conversion assertion because no matching pinto yield exists.
- **Versioning and interchange:** Keep the change in v1 and use the canonical manifest-plus-part-files library package. No migration, compatibility shim, or parallel interchange format is warranted.

No tests were run for this proposal-only review.

## Sources and access

| ID | Source | Evidence and limits |
|---|---|---|
| **WP04-PINTO-PACKAGE-20261010-S01** | Ethan Chlebowski, [Mexican Inspired Bento Box Lunch](https://www.ethanchlebowski.com/cooking-techniques-recipes/mexican-inspired-bento-box-lunch), “Refried Beans” ingredient list and method. | Direct linked recipe source opened 2026-10-10. The ingredient list says `1 can of pinto beans`; the method says to add the whole can with its liquid. It supports one source-recipe can and the included-liquid basis only. No declared package size, brand/SKU, mass, drained yield, or edible portion is published. |
| **Local recipe line** | [Bundled recipe 007](../../../app/src/main/assets/seed/bundled-library/recipes/007-haricots-pinto-refrits-refried-pinto-beans-4392bc3d-9785-43ac-b98e-496f96c1d628.v1.json), ingredient 4. | Current line, ingredient reference, quantity, unit, preparation, and source URL checked locally on 2026-10-10. |
| **Current package model** | [Package-yield part](../../../app/src/main/assets/seed/bundled-library/package-yields.v1.json); [package resolver](../../../app/src/main/java/app/recipebook/data/local/recipes/PackageYieldConverter.kt#L87); [package tests](../../../app/src/test/java/app/recipebook/data/local/recipes/PackageYieldConverterTest.kt#L47); [round-trip tests](../../../app/src/test/java/app/recipebook/data/schema/SchemaRoundTripTest.kt#L82). | Shows the existing black-bean package is S&W-specific and the current parser separately recognizes can count and `with liquid`; it does not provide a pinto-bean yield. |
| **Prior package and identity scope** | [WP03 pulse identity review](wp03-lentils-peas-soybeans-coordinator-review-20261009.md#L85); [WP04 package residual](wp04-next-animal-food-count-residual-20261010.md); [WP04 tomato-paste package review](wp04-tomato-paste-recipe-package-amount-review-20261010.md). | Confirms the pinto line was not measured in the pulse identity pass, and keeps the already reviewed black-bean, animal-package, and tomato-paste cases distinct. |
| **Plan** | [Section 07 package-aware requirement](../../RecipeBook-global-ingredient-catalog-plan.txt#L269); [WP12 package-yield acceptance](../../RecipeBook-global-ingredient-catalog-plan.txt#L914); [WP04 scope](../../RecipeBook-global-ingredient-catalog-plan.txt#L497). | Keep package count, declared net amount, packing liquid, and sourced usable yield as separate evidence; WP12 package tasks remain in progress. |

## Integration conclusion

The source verifies one whole can of pinto beans with its liquid for `007#4`. The line stores only that exact package count and `NET_CONTENTS` basis. Package size, packing-medium type, mass, drained/edible portion, and yield remain unavailable; the S&W black-bean package record was not reused.
