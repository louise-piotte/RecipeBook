# WP04 Proposal: Recipe-Specific Tomato-Paste Package Amount

**Review date:** 2026-10-10
**Status:** Accepted and integrated in [`wp04-recipe-package-amounts-integration-20261010`](../batches/wp04-recipe-package-amounts-integration-20261010/README.md). The recipe keeps 156 ml while structured metadata records one 156 ml can; no reusable yield was added.
**Scope:** One uncovered count-and-net-volume package line in the current 114-recipe corpus. This is a package-measurement case in the WP04 Butter Chicken recipe, not a new animal-food identity or a tomato-paste conversion.

## Disposition

The direct source for recipe `086`, *Poulet au beurre / Butter Chicken*, lists exactly `1 boîte de 156 ml de pâte de tomates` (one container of 156 mL tomato paste). The bundled `086#12` row already stores the recipe quantity as `156 ml`, but its `originalText` omits the package count and its bilingual note adds an unsupported `small` size adjective. The direct recipe supports preserving both facts on this one line: one package and 156 mL declared contents.

Integration stores a line-level `packageAmount` with count `1`, package type `CAN` (the repository's existing mapping for French `boîte` in food-package wording), and declared net quantity `156 ml`. The recipe quantity remains `156 ml`, separate from the package count. The localized note now says `1 boîte` / `1 can`, without the unsupported `small`. The source does not identify a brand, SKU, packaging material, net mass, drained/edible yield, or composition. No reusable package-yield observation, density, mass conversion, ingredient form, or runtime conversion was added.

**Integration is justified for this exact recipe line** because the source and current v1 recipe schema support an unambiguous count plus declared volume. Integration must preserve the distinction between `quantity: 156 ml` and `packageAmount.count: 1`; the current package helper would overwrite the latter with `156` unless corrected as described below.

## Exact recipe demand and current state

| Field | Current bundled value / evidence |
|---|---|
| Recipe | `086` — *Poulet au beurre / Butter Chicken* |
| Ingredient line | `1d0098bc-da72-40b3-ab68-d128d7ba0c3c-ingredient-12` (`086#12`) |
| Current source text | `156 ml tomato paste` |
| Current structured amount | `quantity: 156`, `unit: "ml"` |
| Current note | French `1 petite boîte`; English `1 small can` |
| Current reference | `ingredient-ref-tomato-paste`, verified identity; category `VEGETABLE_AND_AROMATIC` |
| Recorded recipe source | Trois fois par jour, the linked French *Poulet au beurre* page |
| Direct source line | `1 boîte de 156 ml de pâte de tomates` |
| Recipe method | The tomato paste is mixed with the other liquid ingredients before the sauce is heated and simmered with chicken. |

The live ingredient-reference ledger record remains `measurementState: not_yet_researched`; its accepted identity decision expressly added no measurements. The new evidence is a recipe-specific package declaration. It is not an ingredient-level edible-portion or count-weight observation, so this proposal does not change that ledger state or add a measurement observation.

## Proposed line representation

The current full-library v1 schema already has `IngredientLine.packageAmount`, whose `IngredientPackageAmount` shape supports package count, type, and declared net amount. The DTO and mapper already carry those fields. A future coordinated integration can preserve this line as follows:

```json
{
  "originalText": "1 can (156 ml) tomato paste",
  "ingredientName": "tomato paste",
  "ingredientRefId": "ingredient-ref-tomato-paste",
  "quantity": 156,
  "unit": "ml",
  "notes": {
    "fr": "1 boîte de 156 ml",
    "en": "1 can (156 ml)"
  },
  "packageAmount": {
    "count": 1,
    "packageType": "CAN",
    "declaredNetQuantity": 156,
    "declaredNetUnit": "ml"
  }
}
```

This is a dual representation of the exact source amount and its package context, not two quantities to add together. Keep `requestedBasis` null: the source specifies no drained, usable, or edible basis. The bilingual note is faithful to the original French wording; remove `small`, which the source page does not say. Keep the row linked to the existing tomato-paste reference.

### Required package-helper correction

`packageAmountForIngredientLine` currently takes any positive `ingredient.quantity` as package `count`, even when the row unit is `ml`. It also parses package count from `originalText`. With the proposed row, it would parse one can and 156 mL, then replace `count: 1` with the ingredient's `quantity: 156`. That makes the structured metadata incorrect at display/conversion time.

Before integrating the `packageAmount`, update this helper so the package count comes from an explicit `packageAmount.count` or a parsed package expression; use `ingredient.quantity` as a package count only when the row's unit is itself a package unit. Do not treat volume, mass, or serving quantities as package counts. This is an in-place pre-MVP v1 correction; do not add a compatibility shim or schema-version migration.

## Validation and change boundaries for a later integration

1. Preserve the original source amount as `quantity: 156`, `unit: "ml"`, and preserve package details separately as `count: 1`, `packageType: "CAN"`, and `declaredNetQuantity: 156`, `declaredNetUnit: "ml"`.
2. Keep the recipe-level `sourceUrl` on Trois fois par jour and retain the source wording on the ingredient line or localized note, so this exact package fact remains traceable when the recipe is exported.
3. Do not add a research-ledger measurement or `package-yields.v1.json` row. The source is a recipe, not a manufacturer specification, and it names no brand/SKU or usable yield. `PackageYieldObservation` would imply reusable product-specific yield evidence that this page does not provide.
4. Do not change tomato-paste identity, aliases, forms, density, unit mappings, substitution rules, edible portion, or cooking yield. Do not generalize `156 ml` to other tomato-paste products or to other recipes.
5. No DTO, mapper, full-library JSON Schema, or recipe-creation JSON Schema shape change is needed: both v1 payload schemas already accept `packageAmount`, and the Kotlin DTO/mappers already round-trip it. Add a round-trip fixture for a package count and net volume alongside a separate `quantity: 156 ml` if this line is integrated.
6. Add package-helper tests showing that the exact hybrid row resolves to one can with a declared net amount of 156 mL, never 156 cans. Also retain coverage for package-unit rows and the already reviewed `026#3` and `114#17` hybrid package/volume rows.
7. Validate the recipe package with the existing manifest-plus-part ZIP path. Do not add a parallel interchange file or compatibility conversion.

No tests were run for this proposal-only review.

## Evidence boundaries

| Evidence dimension | Accepted here | Not established |
|---|---|---|
| **Recipe package count** | One `boîte` in the exact recipe source. The existing project package vocabulary maps food-context `boîte` to `CAN`; keep the French term in the source-faithful note. | The source does not name a specific brand, SKU, manufacturer, container material, or country of origin. |
| **Declared contents** | `156 ml`, stated in the same source line as the one package. | No mass value, density, ounce conversion, or volume-to-mass mapping. |
| **Food state / process** | Tomato paste is mixed into the sauce before heating and simmering. | No drained state, edible-portion yield, post-cook retained amount, or preparation yield. |
| **Catalog scope** | Keep the existing `tomato paste / pâte de tomates` reference. | No new reference, form, alias, or generic package-size rule. |
| **Measurement state** | Exact recipe-local package amount only. | No general count weight or reusable `PackageYieldObservation`; no update to the ingredient reference's `measurementState`. |

## Sources and access

| ID | Source | Evidence and limits |
|---|---|---|
| **WP04-TOMATO-PASTE-PACKAGE-20261010-S01** | Trois fois par jour, [Poulet au beurre](https://www.troisfoisparjour.com/fr/recettes/plats-principaux/poulet-volaille/poulet-au-beurre/), “Les ingrédients liquides” and step 1. | Direct linked source opened 2026-10-10. The ingredient list states `1 boîte de 156 ml de pâte de tomates`; step 1 mixes the liquids before cooking. It supports this recipe's package count and volume only, not a manufacturer package specification, brand/SKU, mass, composition, or yield. |
| **Local corpus** | [Bundled recipe 086](../../../app/src/main/assets/seed/bundled-library/recipes/086-poulet-au-beurre-butter-chicken-1d0098bc-da72-40b3-ab68-d128d7ba0c3c.v1.json), ingredient row 12. | Source URL, current `156 ml` amount, current translated package note, identity link, and recipe method were checked locally on 2026-10-10. |
| **Current v1 package contract** | [Full-library schema](../../../docs/schemas/full-library.schema.v1.json), [`IngredientPackageAmount`](../../../docs/schemas/full-library.schema.v1.json#L1179); [schema DTOs](../../../app/src/main/java/app/recipebook/data/schema/SchemaDtos.kt#L140); [schema mappers](../../../app/src/main/java/app/recipebook/data/schema/SchemaMappers.kt#L181); [package resolver](../../../app/src/main/java/app/recipebook/data/local/recipes/PackageYieldConverter.kt#L87); [round-trip fixtures](../../../app/src/test/java/app/recipebook/data/schema/SchemaRoundTripTest.kt#L83). | Confirms the existing fields and the helper's quantity-to-count behavior described above. |
| **Plan requirement** | [Catalog plan, Section 07 package checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L269) and [WP04](../../RecipeBook-global-ingredient-catalog-plan.txt#L497); [Requirements FR-5](../../../Requirements.md#L322). | Package count, declared contents, and usable yield are separate facts; ordinary count conversion must not be assumed without an explicit mapping. |
| **Prior-scope check** | [WP04 tomato/cucurbit identity review](wp03-tomato-cucurbit-coordinator-review-20261009.md#L43), [WP04 package residual](wp04-next-animal-food-count-residual-20261010.md), [WP04 dairy package reviews](wp04-evaporated-milk-can-source-correction-20261010.md) and [sweetened-condensed-milk follow-up](wp04-sweetened-condensed-milk-can-source-followup-20261010.md). | The tomato review records `086#12` as a recipe volume and explicitly says it is not a density observation; the other package proposals concern different ingredients and do not cover this line's package representation. |

The direct recipe page was accessible in French. No manufacturer package label or product photograph tied to this recipe's exact package was reviewed; therefore this packet does not identify the recipe's product as a named brand or SKU.

## Integration conclusion

`086#12` stores the source's exact one-package/156 mL pairing at the recipe-line level and keeps its ingredient quantity unchanged. The count helper no longer treats 156 mL as 156 cans. The direct source supports no tomato-paste yield, density, mass conversion, or transferable package rule.
