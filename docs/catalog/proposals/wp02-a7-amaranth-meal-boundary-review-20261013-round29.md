# WP02 A7 — Amaranth Meal Retailer-Title Boundary Review (R29)

- **Reviewed:** 2026-10-13.
- **Status:** Proposal only. No catalog, form, recipe, ledger, plan, roadmap, or generated file was changed.
- **Scope:** Determine whether the Canadian retailer title `Amaranth Flour (Powder, Meal)` identifies an amaranth meal product separate from the existing amaranth-flour reference. This addresses the open A7 review of other grain meals at the [active checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1444).
- **Proposal-local source IDs:** `WP02-A7-AMARANTH-MEAL-20261013-R29-S01` through `S03`. They are unique to this proposal and are not ledger source records.
- **Exclusions:** This review does not reopen buckwheat meal (R23), einkorn meal (R28), micronised toasted millet flour (R25), toasted white sorghum flour (R26), or earlier malted/toasted flour decisions and gluten-flour wording. See the [R23 buckwheat-meal review](wp02-a7-buckwheat-meal-boundary-review-20261013-round23.md), [R24 malted-spelt review](wp02-a7-malted-spelt-flour-quebec-name-boundary-review-20261013-round24.md), [R25 millet review](wp02-a7-micronised-toasted-millet-flour-boundary-review-20261013-round25.md), [R26 sorghum review](wp02-a7-toasted-white-sorghum-flour-boundary-review-20261013-round26.md), [R28 einkorn-meal review](wp02-a7-einkorn-meal-boundary-review-R28-20261013.md), and the [earlier A7 malted/toasted and gluten-flour review](wp02-a7-grain-meals-malt-toasted-boundaries-20261010.md).

## Disposition

| Candidate or term | Recommendation | Reason and boundary |
|---|---|---|
| `amaranth meal` | **Keep inactive. Do not add an active identity, alias, or ledger candidate from this evidence.** | Walmart Canada's Yupik listing includes `(Powder, Meal)` in its title, but classifies the item as `Amaranth Flours` and `Powders`. Its product details repeat the manufacturer’s description of finely milled whole amaranth, and Walmart says supplier/third-party information is not separately verified. The title therefore does not establish a distinct, coarser meal product or prove that `amaranth meal` is a synonym for fine amaranth flour. [S01–S02] |
| `ingredient-ref-amaranth-flour` | **Retain unchanged.** | Keep `amaranth flour / farine d'amarante` and its current flour-qualified aliases. Do not add `amaranth meal` or translate it as `gruau d'amarante` or `semoule d'amarante`. The reviewed sources establish no Québec product display for an amaranth meal. [S01–S03] |
| Separate amaranth-meal identity | **Unresolved; do not create a row.** | No source in this review specifies a distinct meal grind, particle-size boundary, milling process, or Canadian/Québec bilingual product name. The OQLF entry names `amarante` and notes its seeds may be milled into flour or used whole; it does not define an amaranth-meal product. [S03] |

## Catalog, ownership, and picker audit

The read-only audit covered the live ingredient references, ingredient forms, legacy-import candidates, research ledger, A7 proposal archive, and the search implementation. No exact active reference, form label/match term, legacy candidate, ledger record, or prior dedicated A7 proposal owns `amaranth meal`, `meal of amaranth`, `gruau d'amarante`, or `semoule d'amarante`.

Nearby active rows remain distinct:

- `ingredient-ref-amaranth-flour` — `amaranth flour / farine d'amarante`; current English aliases are `rajgira flour`, `rajgira atta`, and `ramdana flour`. Its default density is null and unit mappings are empty.
- `ingredient-ref-sprouted-amaranth-flour` — `sprouted amaranth flour / farine d'amarante germée`.
- `ingredient-ref-amaranth-grain` — `amaranth / amarante`.
- Other amaranth rows cover flakes, greens, and puffed amaranth. None is a meal identity or form.

The current phrase-first picker projection, following [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), is:

| Query | Current result | Implication |
|---|---|---|
| `amaranth meal`; `meal amaranth` | No result | No active alias or identity claims the marketplace wording. |
| `gruau d'amarante`; `semoule d'amarante` | No result | Do not fill the French gap with an unsourced literal translation. |
| `amaranth flour`; `farine d'amarante` | `ingredient-ref-amaranth-flour`; `ingredient-ref-sprouted-amaranth-flour` | The broad flour query already returns both plain and sprouted products. |
| `amaranth` | The grain, plain flour, sprouted flour, flakes, greens, and puffed-amaranth references | Existing family discovery remains multi-result. |

Adding `amaranth meal` as an alias to the flour row would cause a query prompted by the retailer title to select a source-described finely milled flour. Adding a distinct row would claim a product boundary and French display that these sources do not establish. No picker change is recommended.

## Bundled recipe demand

I scanned all **114 manifest-listed recipe files** and their **1,123 ingredient rows**, checking normalized `originalText`, `ingredientName`, `preparation`, and `notes` for `amaranth meal`, `meal of amaranth`, `amaranth flour`, `farine d'amarante`, `gruau d'amarante`, and `semoule d'amarante`. The scan found **zero matching rows**. No recipe link or relink is proposed.

## Measurement and substitution limits

- Yupik's product page gives a nutrition serving of **1/8 cup (30 g)** for its exact finely milled organic amaranth flour. This is a source-specific serving observation, not a density or universal volume-to-mass conversion; it does not measure a hypothetical coarse amaranth meal. Keep the active flour row's density and unit mappings empty. [S01]
- Yupik says its ground amaranth can replace up to 25% of flour in recipes. This is product-specific baking guidance for the fine-milled flour, not a validated ingredient-to-ingredient substitution rule for a distinct meal product or a transferable ratio across recipes. Add no substitution rule or recipe-line link. [S01]
- No form, form-level density, yield, conversion, or meal-to-flour equivalence is supported.

## Sources and limits

Sources were checked on **2026-10-13**.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| `WP02-A7-AMARANTH-MEAL-20261013-R29-S01` | Yupik, [Organic Amaranth Flour, Gluten-Free](https://yupik.com/en/organic-amaranth-flour-gluten-free-p31507), product heading, description, ingredients, and Nutrition Facts. | Manufacturer names the item as amaranth flour; describes ground whole amaranth as finely milled; recommends replacing up to 25% of flour in recipes; lists a 1/8-cup (30-g) nutrition serving. | Supports this named fine-milled product only. It does not identify a separate amaranth meal, provide a Québec French product name, or establish a general density or substitution rule. |
| `WP02-A7-AMARANTH-MEAL-20261013-R29-S02` | Walmart Canada, [Yupik Organic & Gluten-Free Amaranth Flour (Powder, Meal), 1 kg](https://www.walmart.ca/en/ip/Yupik-Organic-Gluten-Free-Amaranth-Flour-Powder-Meal-1Kg/7FTXZGSAWV8L), item title; `At a glance`; product details; supplier-information notice. | Shows where the parenthetical `Meal` wording enters the query space. The same listing classifies the item as `Amaranth Flours` and `Powders` and repeats the fine-milling description. | Walmart says product information may be provided by manufacturers, suppliers, or marketplace sellers and is not separately verified. The listing supplies no meal grind/process boundary or French ingredient name. |
| `WP02-A7-AMARANTH-MEAL-20261013-R29-S03` | OQLF, [amarante, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503667/amarante), definition, note, and preferred term. | Establishes the Québec French base term `amarante`; notes that the seeds can be milled into flour or used whole. | It does not define `amaranth meal`, a meal grind, or a compound French product name. |

## Next action

Keep `amaranth meal` unallocated and leave all shared data unchanged. Reopen only if a manufacturer, regulator, or qualified Canadian food source establishes a standalone human-food amaranth-meal product with a stated grind/process boundary and a Québec-facing French product name. If later evidence proves `meal` is merely a source-specific label for fine flour, review that exact alias separately; do not infer it from the retailer title alone.
