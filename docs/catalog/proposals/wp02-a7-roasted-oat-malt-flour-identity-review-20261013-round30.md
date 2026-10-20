# WP02 A7 — Roasted Oat Malt Flour Identity Review (R30)

- **Reviewed:** 2026-10-13.
- **Status:** Proposal only. No catalog, recipe, ledger, plan, roadmap, or generated file was changed.
- **Proposal-local source IDs:** `WP02-A7-ROASTED-OAT-MALT-FLOUR-20261013-R30-S01` through `S04`. These IDs are unique to this file and are not ledger records.
- **Scope:** Decide whether the current Castle Ingredients product `Castle Oat 80` supports a distinct roasted oat malt flour identity under the open WP02 A7 checklist.
- **Exclusions:** This review does not reopen the earlier generic toasted-oat-flour hold, dry oat meal or Scottish oatmeal, generic malt flour, accepted cereal-specific malted flours, gluten-flour equivalence, or the R29 amaranth-meal review.

## Disposition

| Candidate | Recommendation | Proposed identity-only display | Boundary |
|---|---|---|---|
| Castle Oat 80 | **Accept as a narrow product identity:** `roasted oat malt flour / farine de malt d'avoine torréfiée`. | `roasted oat malt flour` / `farine de malt d'avoine torréfiée` | Castle's current English and French listings identify this as roasted oat malt flour and specify that this product is non-enzymatic. The manufacturer's general explanation describes malt flour as made from germinated and dried grain, with controlled roasting and milling. This supports a cereal-specific malt-flour identity, distinct from ordinary roasted oat flour. It does not establish an oat cultivar, hull status, universal enzyme behavior, or equivalence to other malted oat products. |

If integrated, add only the proposed `FLOUR_AND_STARCH` reference. Add no aliases: the English and French displays already contain the supplier-attested search phrases. Keep `Castle Oat 80` as source evidence, not a general alias. Do not add a malted, roasted, non-enzymatic, naked-oat, or toasted form; the product is a distinct flour identity for this narrow review.

Keep the prior Moulins de Soulanges roasted/pregelatinized oat-flour names unresolved. That review found conflicting product wording without a malted-grain specification; Castle's separately named product has explicit malt-flour, roast, and milling evidence. This decision does not establish that the two products are equivalent. Keep Hodmedod's `Malted Naked Oat Flour` recipe wording separate as well: the recipe does not identify it as Castle Oat 80 or show that it shares Castle's non-enzymatic roasted grade.

Retain the generic `malt flour / farine maltée`, plain `oat flour / farine d'avoine`, and existing malted barley, wheat, rye, spelt, and roasted wheat malt-flour identities unchanged. Do not reopen the accepted `gluten flour / farine de gluten` alias on vital wheat gluten or infer that all products called gluten flour are equivalent to vital wheat gluten.

## Live ownership and archive audit

The audit covered the current split seed package, its ingredient-form file, the legacy-import candidate file, the research ledger, the A7 proposal archive, and the picker implementation.

| Surface | Finding |
|---|---|
| Active references | No exact owner for `roasted oat malt flour`, `oat malt flour`, `farine de malt d'avoine torréfiée`, or proposed ID `ingredient-ref-roasted-oat-malt-flour`. Nearby active rows include plain oat flour, generic malt flour, malted barley/wheat/rye/spelt flour, and roasted wheat malt flour. |
| Ingredient forms | No oat-malt flour form, matching label, or form search term exists. Current oat forms are attached to oat bran and concern dry/cooked bran only. |
| Legacy-import candidates and research ledger | No exact candidate name, display, or proposed ID is present. |
| Prior proposals | No dedicated roasted oat malt-flour decision was found. The prior roasted/pregelatinized oat-flour review holds the different Moulins de Soulanges product. The earlier A7 review covers generic malt flour and other cereal-specific products, but not this Castle oat product. |

The current picker uses complete normalized word phrases first, then substring matching, as implemented in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Accent folding means the proposed French phrase behaves the same with or without accents.

| Query | Current result | Projected result if integrated | Search boundary |
|---|---|---|---|
| `roasted oat malt flour`; `oat malt flour` | No result | Proposed roasted oat malt flour | These phrases are present in the manufacturer-attested English display. |
| `farine de malt d'avoine torréfiée`; `farine de malt d'avoine` | No result | Proposed roasted oat malt flour | The French display matches the full source wording; accent folding applies. |
| `malt flour` | Generic malt flour; roasted wheat malt flour; malted spelt flour | Those three plus proposed roasted oat malt flour | Keep the broad malt query multi-result. |
| `oat flour`; `farine d'avoine` | Plain oat flour | Plain oat flour | Do not add a plain-flour alias to the malted product. |
| `malted oat flour`; `malted naked oat flour` | No result | No result | These are not the Castle listing's wording; do not alias the distinct Hodmedod recipe ingredient to Castle Oat 80. |
| `farine maltée` | Generic malt flour | Generic malt flour | Keep the existing broad French name on the generic identity only. |

No picker-code change is proposed. These are static projections from the current names, aliases, forms, and phrase-first search behavior.

## Bundled recipe demand

I scanned all **114 recipe files** and **1,123 ingredient lines** in the current bundled package for the proposed English and French names and close spellings including `oat malt flour`, `roasted oat malt flour`, `malted oat flour`, `malted naked oat flour`, `farine de malt d'avoine`, and `farine d'avoine maltée`. There were **zero matching lines**. The four broader oat/malt hits are ordinary rolled or quick oats, not oat flour or oat malt flour. There is no bundled recipe to link.

Hodmedod's 2022 *Malted Naked Oat Loaf* recipe is external evidence of a separately named ingredient: its loaf line says `50g Malted Wheat Flour or Malted Naked Oat Flour`; another line says `50g Malted Wheat Flakes or Whole Malted Naked Oats` [S04]. This is one recipe-specific alternative, and the source does not identify the flour as Castle Oat 80. It neither creates bundled-library demand nor supports an alias, recipe link, or general equivalence.

## Measurement, form, and substitution limits

- Castle's public listings establish the ingredient identity and describe the product as non-enzymatic; they provide no exact-form household measure, mass-volume pair, density, or cooking yield. Keep `defaultDensity` null and `unitMappings` empty. Add no measurement observation or package-yield value.
- Hodmedod's 50 g line is a quantity in one source recipe, not a household measure or density observation for Castle Oat 80. Do not transfer it to this identity.
- The same Hodmedod recipe permits its own malted naked oat flour instead of malted wheat flour at that recipe's listed amount. Do not generalize that author-written alternative into a substitution rule, and do not map it to Castle's differently specified roasted, non-enzymatic product.
- Add no ingredient form, same-ingredient conversion, ingredient-to-ingredient substitution, or recipe-line substitution.

## Sources and limits

Sources were checked on **2026-10-13**. The Castle pages are manufacturer or manufacturer-shop sources. Castle is a Belgian ingredient supplier; its French listing is direct manufacturer French, not a Québec product label or an OQLF ruling.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| `WP02-A7-ROASTED-OAT-MALT-FLOUR-20261013-R30-S01` | Castle Ingredients, [Malt Flour](https://www.castle-group.eu/malt-flour), “What is malt flour?” and “How Castle Malt Flours work” sections; Castle Oat 80 product entry. | Describes malt flour as finely milled germinated and dried cereal grain; describes malting, roasting, and milling; identifies Castle Oat 80 with roasted oat flavor and baking applications. | The process description is general to the malt-flour range. It gives no cultivar, hull status, product-specific roast conditions, density, or household measure. Application and performance statements are not catalog behavior. |
| `WP02-A7-ROASTED-OAT-MALT-FLOUR-20261013-R30-S02` | Castle Ingredients, [English malt-flour product listing](https://www.shop.castle-ingredients.com/shop/category/baking-flours-malt-15?order=name+asc), Castle Oat 80 product tile and ingredient list. | Current listing calls the product “Roasted oat malt flour, non-enzymatic” and separately lists `Oat malt flour` as its ingredient category. | B2B product listing; it does not establish Québec retail availability or a universal oat-malt-flour specification. The linked item-detail page returned a cache miss during this review, so no hidden product detail is assumed. |
| `WP02-A7-ROASTED-OAT-MALT-FLOUR-20261013-R30-S03` | Castle Ingredients, [French malt-flour product listing](https://www.shop.castle-ingredients.com/fr/shop/category/farines-de-boulangerie-9), CASTLE OAT 80 product tile. | Gives the direct French descriptor `Farine de malt d'avoine torréfiée, non enzymatique`, supporting the proposed French display. | Manufacturer French wording, not a Québec label or OQLF terminology ruling; no household measurement or retail-market evidence. |
| `WP02-A7-ROASTED-OAT-MALT-FLOUR-20261013-R30-S04` | Hodmedod's, [Malted Naked Oat Loaf](https://hodmedods.co.uk/blogs/recipes/malted-naked-oat-loaf), tags and ingredient lines (published 2022-06-28). | Names malted naked oat flour and whole malted naked oats as distinct recipe ingredients; gives the exact loaf-specific 50 g quantities and alternative wording. | A single UK recipe, not a product specification, general substitution, measurement reference, or evidence that the flour is Castle Oat 80. |

## Next action

Carry the narrow identity-only recommendation into the next WP02 A7 integration review. Preserve the earlier toasted-oat-flour hold and all existing malted-flour/gluten-flour decisions. If integrated, add only `roasted oat malt flour / farine de malt d'avoine torréfiée`, with no aliases, forms, numeric fields, recipe links, conversions, yields, or substitutions.
