# WP02 A4 R561 — Rye meal portion and replacement evidence — 2026-10-17

- **Status:** Integrated on 2026-10-17. The ledger now records the two separate King Arthur package-label observations and the bounded no-general-replacement finding; active catalog numeric behavior remains unchanged. See the [R560–R561 integration README](../batches/wp02-wp04-r560-r561-gap-review-integration-20261017/README.md).

- **Recommendation:** Add two separate King Arthur Baking package-label observations to the existing `ingredient-ref-rye-meal` ledger record: its Nutrition Facts serving, **1/4 cup = 30 g**, and the named product's amount in the package's Everything Bagel Pumpernickel Bread formula, **1 cup = 106 g**. Preserve the separate contexts and the label's apparent discrepancy; do not infer or encode a reusable cup-to-gram mapping. Record the maker's rye-flour-use guidance as bounded evidence, but do not encode a reusable substitution rule.
- **Scope:** Measurement and replacement research for plain coarse whole-kernel rye meal. This does not repeat R555's medium rye flour research, reopen rye identity/aliases, or address malted rye meal.
- **Exact plan anchor:** The open A4 rye milling parent is at [plan line 1658](../../RecipeBook-global-ingredient-catalog-plan.txt#L1658). Its existing rye-meal identity item at [lines 1684–1687](../../RecipeBook-global-ingredient-catalog-plan.txt#L1684) adds the distinct coarse whole-kernel product and leaves active numeric and substitution behavior empty. R561 completes only this bounded evidence follow-up; the parent remains open. See the prior [R555 medium-rye review](wp02-next-gap-review-r555-20261017.md) for the separate flour grade.

## Current owner and evidence boundary

The live row is [`ingredient-ref-rye-meal`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L18054), displayed as **rye meal / gruau de seigle** in `FLOUR_AND_STARCH`. Its English aliases are `coarse rye meal`, `pumpernickel meal`, and `pumpernickel flour`; its French aliases are `semoule de seigle` and `farine à pumpernickel`. Default density is null and unit mappings are empty. It has no attached form, global or contextual substitution rule, or package yield.

The [`ingredient-ref-rye-meal` ledger entry](../research-ledger.v1.json#L130205) has verified identity but `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`. Its existing source IDs are `WP02-RYEMEAL-20261010-S01` through `S03`, supporting TERMIUM terminology, Ardent Mills' product-family boundary, and a Montréal bakery ingredient declaration. Those records do not provide a household measure or reusable replacement amount. The identity scope and aliases were already reviewed in the [rye-meal identity proposal](wp02-rye-meal-identity-boundary-20261010.md).

## Source-ID ownership and picker projection

| ID or source | Current owner | R561 treatment |
|---|---|---|
| `WP02-RYEMEAL-20261010-S01`–`S03` | `ingredient-ref-rye-meal` | Retain for the existing identity decision; do not duplicate or broaden their claims. |
| `WP02-A7-MALTED-RYE-MEAL-20261013-R56-S04` | `candidate-malted-rye-meal`; [R56 proposal](wp02-a7-malted-rye-meal-boundary-review-20261013-round56.md) | Reuse only as the existing Ontario comparator source. Its current Arva Flour Mill listing describes plain rye meal as coarse whole rye flour with bran, germ, and endosperm; the page provides no mass-volume measure. Do not create a second source ID for that URL. |
| `WP02-A4-RYEMEAL-MEASURE-SUB-R561-20261017-S01` and `-S02` | Unowned at proposal time | New IDs for King Arthur Baking's current Pumpernickel Flour product page and the package PDF currently linked from it. |
| Proposed observations `rye-meal-king-arthur-pumpernickel-portion-r561-20261017` and `rye-meal-king-arthur-everything-bagel-portion-r561-20261017`, plus finding `rye-meal-no-general-home-replacement-r561-20261017` | Unowned at proposal time | New, row-scoped ledger IDs; do not reuse for medium rye flour or malted rye meal. |

No names, aliases, or forms change, so the picker projection stays unchanged. The static projection follows the phrase-first matching and substring fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

| Query | Current result |
|---|---|
| `rye meal`; `coarse rye meal`; `pumpernickel meal`; `pumpernickel flour` | `ingredient-ref-rye-meal` |
| `gruau de seigle`; `semoule de seigle`; `farine à pumpernickel` | `ingredient-ref-rye-meal` |
| `pumpernickel` | `ingredient-ref-rye-meal` |
| `rye`; `seigle` | 11 rye references, including this row and the separately scoped flour, grain, berry, bran, flake, and cracked-rye rows |
| `meal` | 6 rows: cornmeal, cracker crumbs, matzo meal, rye meal, the vector-meal-replacement reference, and whole wheat meal |
| `gruau` | 11 cereal results, including rye meal; this broad French query remains unchanged |

The package label's product name does not justify adding or moving any pumpernickel term. Retain the established aliases and preserve the separate whole-rye-flour and medium-rye-flour rows.

## Bundled recipe demand

The current manifest lists **114 recipe files** with **1,123 structured ingredient rows**. I parsed every file and scanned complete recipe JSON text and ingredient rows for the exact rye-meal and adjacent terms: `rye meal`, `coarse rye meal`, `pumpernickel meal`, `pumpernickel flour`, `gruau de seigle`, `semoule de seigle`, and `farine à pumpernickel`. The scan found **zero matching recipe files, zero matching ingredient rows, and zero direct `ingredientRefId` links** to `ingredient-ref-rye-meal`. No recipe link or relink is proposed.

## Source findings and limits

1. **King Arthur Baking product page and linked label.** The current product page describes its Pumpernickel Flour as coarse and made from whole-rye components. The linked package label recommends using that product in recipes calling for rye flour. This is evidence about one named product and its maker's use guidance, not a shared specification for every rye-meal or pumpernickel-labeled product. The label does not state a replacement quantity or dough/process adjustments. [R561 S01–S02]
2. **King Arthur Baking package label: serving and recipe amounts.** The current product page links to a package PDF for SKU 400186. In the PDF, the Nutrition Facts panel declares **serving size 1/4 cup (30 g)**, while the printed Everything Bagel Pumpernickel Bread recipe lists **1 cup (106 g)** of the named flour for a recipe yielding one 10-inch loaf. Preserve these as separate source-specific observations: one nutrition serving and one ingredient amount in a particular package formula. Multiplying the serving declaration by four would give 120 g, 14 g above the recipe's printed amount; that arithmetic is not a third observation and does not resolve the discrepancy. The label gives no filling/leveling method. Neither statement establishes a generic density, a standard cup mapping, nor a value for the Canadian mill's product. [R561 S02]
3. **Current Canadian product comparator.** Arva Flour Mill's live Ontario listing describes its 650 g Rye Meal as coarsely ground whole rye flour containing bran, germ, and endosperm. The listing supports Canadian availability and a compatible plain-meal product boundary, but gives no household measure or serving weight. Its source ID is already owned by the R56 malted-rye-meal comparator record, so R561 reuses that existing evidence without re-registering the URL.
4. **Terminology remains source-bounded.** The existing TERMIUM entry maps rye meal/pumpernickel flour to the current bilingual identity and describes a coarse, dark, whole-kernel product. It is already recorded as `WP02-RYEMEAL-20261010-S01`; it supports identity wording, not this numerical observation.

### Measurement decision

Add both distinct King Arthur observations below to the existing ledger record. Set `measurementState: researched_supported` to reflect that two published, product-specific quantities are documented in separate contexts. The Nutrition Facts entry is a product serving; the 1-cup entry is a recipe ingredient amount in the package's one-loaf formula, not a serving. Do not reconcile, average, scale, or select one as the generic value. Keep `defaultDensity: null` and `unitMappings: []` in the catalog; add no active household measure, conversion, form, cooking yield, or package-yield record.

| Field | Proposed ledger value |
|---|---|
| `observationId` | `rye-meal-king-arthur-pumpernickel-portion-r561-20261017` |
| `relationship` | `portion_weight` |
| `value`, `valueUnit` | `30`, `g` |
| `foodDescription` | King Arthur Baking Pumpernickel Flour, SKU `400186`, UPC `071012002740` |
| `foodState` | As sold; manufacturer label identifies whole rye flour and the product page describes a coarse consistency. |
| `measurementMethod` | Manufacturer package Nutrition Facts serving declaration; no filling or leveling method is stated. |
| `quantityBasis` | Product-specific Nutrition Facts serving only; not an identity-wide conversion or reusable cup-weight mapping. |
| `sourceQuantity`, `observedMassG` | `{"amount": 0.25, "unit": "cup"}`, `30` |
| `evidenceKind`, `sourceIds` | `manufacturer_label`; `WP02-A4-RYEMEAL-MEASURE-SUB-R561-20261017-S02` |

| Field | Proposed ledger value |
|---|---|
| `observationId` | `rye-meal-king-arthur-everything-bagel-portion-r561-20261017` |
| `relationship` | `portion_weight` |
| `value`, `valueUnit` | `106`, `g` |
| `foodDescription` | King Arthur Baking Pumpernickel Flour, SKU `400186`, UPC `071012002740`, as listed in the package's Everything Bagel Pumpernickel Bread recipe |
| `foodState` | Product as sold; one stated ingredient in the package formula yielding one 10-inch loaf. |
| `measurementMethod` | Package recipe ingredient line states 1 cup (106 g); filling/leveling method is not stated. |
| `quantityBasis` | One formula-specific ingredient amount only; not the Nutrition Facts serving and not an identity-wide or reusable cup-weight mapping. |
| `sourceQuantity`, `observedMassG` | `{"amount": 1, "unit": "cup"}`, `106` |
| `evidenceKind`, `sourceIds` | `manufacturer_label`; `WP02-A4-RYEMEAL-MEASURE-SUB-R561-20261017-S02` |

### Substitution decision

Add one evidence-only finding for the question of a **reusable quantified home-recipe replacement for rye flour**. The King Arthur label recommends using its Pumpernickel Flour in rye-flour recipes, but does not specify the amount to replace or adjustments by recipe role or method. Its printed Everything Bagel Pumpernickel Bread formula uses the product alongside all-purpose flour; it does not compare the product with another rye flour or describe a replacement experiment. The two label quantities above are not substitution ratios. Arva's Canadian rye-meal listing describes a coarse whole-grain product but gives no replacement ratio. Keep `substitutionResearchState: researched_no_supported_substitute` for a reusable ratio on the generic catalog row while preserving the maker's narrower recommendation in the finding. Do not create a global or contextual substitution rule.

| Field | Proposed ledger value |
|---|---|
| `findingId` | `rye-meal-no-general-home-replacement-r561-20261017` |
| `researchState` | `researched_no_supported_substitute` |
| `context` | Whether the generic rye-meal identity has a reusable, quantified amount for replacing rye flour across home-baking recipes. |
| `basis` | King Arthur Baking recommends its named Pumpernickel Flour in rye-flour recipes but states no replacement quantity or process adjustments. Its package recipe is a particular blend formula for one loaf, not a comparison of rye-flour alternatives. Arva describes a current Canadian coarse whole-grain rye meal but gives no substitution amount. These sources do not establish a transferable ratio for the generic row. |
| `limitations` | Preserve the King Arthur recommendation as product-specific evidence; do not infer a 1:1 quantity. The 1/4-cup Nutrition Facts serving and 1-cup recipe amount are separate label contexts (30 g vs 106 g); do not reconcile or generalize them as a conversion. Do not generalize the use recommendation across brands, rye-meal grades, bread methods, or non-bread roles. Do not create an active substitution rule. Neither label quantity is itself a substitution ratio. |
| `sourceIds` | `WP02-RYEMEAL-20261010-S01`; `WP02-A4-RYEMEAL-MEASURE-SUB-R561-20261017-S01`; `WP02-A4-RYEMEAL-MEASURE-SUB-R561-20261017-S02`; existing Arva comparator `WP02-A7-MALTED-RYE-MEAL-20261013-R56-S04` |

## Integration recommendation

If accepted, update only the `ingredient-ref-rye-meal` ledger entry with the two new King Arthur sources, the two separate portion observations, the one bounded replacement finding, and the two research-state updates described above. Keep the live reference, aliases, forms, picker results, recipe files, default density, unit mappings, global/contextual rules, and package yields unchanged. The A4 rye-milling and A7 grain-meal parent items remain open.

## Source register

Reviewed 2026-10-17. New source IDs were checked against the current research ledger and proposal archive; the Arva source remains owned by its prior R56 entry.

| Source ID | Source and locator | Evidence and limit |
|---|---|---|
| `WP02-A4-RYEMEAL-MEASURE-SUB-R561-20261017-S01` | King Arthur Baking, [Pumpernickel Flour product page](https://shop.kingarthurbaking.com/items/pumpernickel-flour), product SKU `400186` / UPC `071012002740`, product description. | Current manufacturer description says the named product is coarse and made with whole-rye components. It does not give a measure or a market-wide product definition. |
| `WP02-A4-RYEMEAL-MEASURE-SUB-R561-20261017-S02` | King Arthur Baking, [manufacturer-linked Pumpernickel Flour package PDF](https://shop.kingarthurbaking.com/content/packaging/400186_1.pdf), current SKU `400186`, Nutrition Facts serving-size declaration, Everything Bagel Pumpernickel Bread formula, ingredients, and use guidance. Accessed 2026-10-17. | Label states **1/4 cup (30 g)** for a Nutrition Facts serving and **1 cup (106 g)** in its one-10-inch-loaf package formula, lists whole rye flour as the ingredient, and recommends using the product in rye-flour recipes. Preserve the two amounts separately; no fill method, general density, or replacement quantity is given. The 14 g difference from simple scaling is unresolved and not a reusable conversion. |
| **Reused:** `WP02-A7-MALTED-RYE-MEAL-20261013-R56-S04` | Arva Flour Mill, [Rye Meal 650g](https://arvaflourmills.com/products/rye-meal), live Ontario mill listing. | Confirms a current Canadian plain rye-meal product and coarse whole-grain boundary; no household measure or volume-to-mass value. Existing source record belongs to `candidate-malted-rye-meal` and remains in that ownership context. |
| **Reused:** `WP02-RYEMEAL-20261010-S01` | Government of Canada Translation Bureau, [TERMIUM Plus: rye meal / gruau de seigle](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=GRUAU+SEIGLE), food industries / breadmaking entry. | Supports the existing identity and French names, not a portion measure or replacement amount. Already recorded on `ingredient-ref-rye-meal`. |

The integration changed the research ledger, plan, roadmap, and integration documentation; active ingredient-reference data and recipes remain unchanged. Static ledger and seed-package validation, source-ID and observation-ID checks, UTF-8/no-BOM, local links, and whitespace checks passed. No app tests, build, emulator, or deployment were run because this change only adds database evidence and no software behavior, as exempted by `AGENTS.md`.
