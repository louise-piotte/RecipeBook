# WP03 Section F — Greek sour trahana product identity (R48, 2026-10-13)

## Review record

- **Scope:** the VLAHA Sour Trahana product listed by Krinos Foods Canada. This review does not define every Greek trahanas recipe or the Turkish tarhana family.
- **Open checklist:** the parent item for regional cereal mixes and preprocessed grains remains open in the [live Section F plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2556).
- **Status:** proposal only. No shared catalog, ledger, plan, roadmap, batch README, recipe, generated file, or application file was changed.
- **Recommendation:** add one identity-only reference, `sour trahana / trahana sûre`, with proposed ID `ingredient-ref-sour-trahana` and category `GRAIN_AND_CEREAL`. Use the two Canadian product-page titles as the names and add no aliases. The manufacturer’s bilingual Canada pages identify the product and provide a Québec-facing French title; they support this exact product, not a universal formula for all trahanas.
- **Data limits:** no forms, ingredient links, recipe links, measurements, density, unit mappings, conversion, cooking yield, or substitutions. Keep the Turkish `tarhana` and spelling `trahanas` unassigned to this row.
- **Proposal-local source-ID prefix:** `WP03-F-GREEK-TRAHANA-R48-20261013-S` (S01–S04); no prior use was found in the catalog documentation or bundled data.

## Why this is an uncovered candidate

R47 reviewed Turkish `tarhana` and explicitly left Greek trahanas outside its scope. Its mention of `trahanas` as a Turkish retailer search tag did not establish it as a synonym. The current plan, roadmap, proposal archive, active references and forms, legacy-import candidates, research ledger, and bundled recipes contain no separate Greek sour-trahana decision or owner. The exact Canadian product page distinguishes this candidate by its own title, ingredient statement, and described pebble-like pasta form [S01, S02]. A 1993 primary study also identifies trahanas as a fermented milk-and-wheat-flour food prepared in Greece; it supports the Greek product family, but not the current VLAHA package formula [S04].

## English and Québec French naming boundary

| Use | Evidence and boundary |
|---|---|
| **English product wording** | Krinos Canada’s product title is **Sour Trahana**. Its page describes a hard, pebble-like pasta resembling coarse couscous, suitable as hot cereal or soup and stew thickener [S01]. Use the title as the English catalog name; do not add `coarse couscous` or `pasta` as aliases. |
| **Québec French wording** | The same Canadian supplier’s French page is titled **Trahana sûre** and gives a French ingredient statement [S02]. Krinos says it opened in Montréal and distributes Greek foods in Canada [S03]. This is direct Canadian French product naming suitable as a source-attested `fr-CA` display, not an OQLF or TERMIUM terminology ruling. The body copy contains the apparent typo `rassemble à`; do not reuse that phrase as approved French description. |
| **Regional and product boundary** | The supplier presents this as a VLAHA product on its Greek-food site, while the primary study describes Greek trahanas as a fermented milk-wheat product [S01, S03, S04]. The manufacturer’s ingredient list is specific to this SKU. Do not represent every regional trahanas variant or claim a shared formula. |
| **Spelling boundary** | Use the product-page spelling `trahana`. Do not add `trahanas`, `tarhana`, `tarkhana`, `Greek tarhana`, or regional variants as aliases. R47’s Turkish hold expressly did not assess Greek trahanas; the words are not interchangeable picker aliases. |

## Exact ownership and picker effects

At the review snapshot, the active catalog contains **1,369 references** and **100 forms**; the legacy-import file lists **64 candidates**, and the research ledger contains **1,699 records**. Exact candidate-term scans found no current reference, form, legacy candidate, or ledger record for `trahana`, `trahanas`, or `tarhana`. The search also found no existing use of the proposed reference ID or source-ID prefix. R47 is the only prior Section F review that mentions `trahana`; it explicitly leaves Greek trahanas outside scope.

| Current owner | Exact boundary | Effect if this proposal is accepted |
|---|---|---|
| None for `sour trahana` or `trahana sûre` | No active reference, attached form, legacy-import candidate, or ledger record owns this product name. | Add only `ingredient-ref-sour-trahana`, named `sour trahana / trahana sûre`, with no aliases. |
| `ingredient-ref-durum-semolina` — `durum semolina / semoule de blé dur` | Category `FLOUR_AND_STARCH`; no aliases, forms, density, or unit mappings. It is a declared VLAHA ingredient, not the finished product. | Keep it as a separate ingredient owner; do not alias the trahana product to semolina. |
| `ingredient-ref-plain-yogurt` — `plain yogurt / yogourt nature` | Category `DAIRY_AND_ALTERNATIVE`; alias `plain yoghurt`; no forms or conversion data. | Yogurt is a source-listed component, not an identity or substitute for the multi-ingredient trahana. |
| `ingredient-ref-unsalted-butter` — `unsalted butter / beurre non salé` (English alias `butter`), `ingredient-ref-salted-butter` — `salted butter / beurre salé`, and `ingredient-ref-salt` — `salt / sel` | Existing component owners; none owns the finished product. The source wording `milk butter` is not treated as an alias for either butter row. | Leave component owners unchanged; do not derive an equivalence from the label wording. |
| `ingredient-ref-couscous` and `ingredient-ref-pearl-couscous` | Existing `GRAIN_AND_CEREAL` identities. The product description compares texture to coarse couscous but does not define an ingredient equivalence. | Do not add a couscous alias or substitution. Existing couscous search results remain unchanged. |
| None for Turkish `tarhana` or `trahanas` | The Turkish tarhana family remains unallocated under R47; a `trahanas` retailer tag there did not establish synonymy. | Keep `tarhana` and `trahanas` unassigned. |

The static picker review follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9), which prefers complete normalized word phrases before partial matching. Current searches for `trahana`, `sour trahana`, `trahana sûre`, `trahanas`, and `tarhana` return **0**. With the proposed bilingual names and no aliases, `trahana`, `sour trahana`, and `trahana sûre` would each return the single proposed reference. `trahanas` and `tarhana` would remain at 0. Queries for `couscous`, `durum semolina`, yogurt, butter, and salt would retain their existing component owners.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were searched across complete serialized recipe JSON and ingredient fields for `trahana`, `trahanas`, Greek-script `τραχανά`, `tarhana`, `tarkhana`, and `tarhanasi`.

- Candidate-phrase recipe files: **0**.
- Candidate-phrase ingredient rows: **0**.
- Ingredient-reference links to a trahana identity: **0**.

The bundled corpus has no direct recipe demand. The product-page use descriptions establish possible applications, not an amount or a reason to assign a recipe link [S01, S02].

## Forms, measurements, and substitutions

- **Forms:** add none. The supplier describes this package as a hard, pebble-like pasta and lists hot-cereal and thickener uses, but provides no form-specific cooking conversion or recipe line [S01, S02].
- **Numeric limits:** the supplier lists a **500 g** package and the SKU’s composition as yogurt **370 g per kg semolina**, milk butter **28 g per kg semolina**, and salt **2% maximum** [S01, S02]. These are package and manufacturer-formulation figures, not household measures, a density, a cooking yield, or a transferable recipe ratio. Keep all reusable measures, density, and unit mappings empty.
- **Substitutions:** add no global or contextual substitution with couscous, pearl couscous, pasta, durum semolina, bulgur, yogurt, or Turkish tarhana. The sources do not establish interchangeable cooking behavior or a transferable quantity.

## Source register

Sources were accessed online on 2026-10-13. Source IDs are local to this proposal and were not added to the shared ledger.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-F-GREEK-TRAHANA-R48-20261013-S01` | Krinos Foods Canada, [VLAHA — Sour Trahana](https://krinos.ca/products/vlaha-sour-trahana/). | Current Canadian supplier page gives the exact English product title, described form and uses, 500 g size, and product-specific ingredient statement. It does not establish a universal trahana recipe, household quantity, density, yield, or conversion. |
| `WP03-F-GREEK-TRAHANA-R48-20261013-S02` | Krinos Foods Canada, [VLAHA — Trahana sûre](https://krinos.ca/fr/products/vlaha-trahana-sure/). | French product page supplies the exact French title and ingredient wording with the same figures. Its description contains the apparent typo `rassemble à`, so the proposal relies on its title and ingredient statement rather than that sentence as French product guidance. |
| `WP03-F-GREEK-TRAHANA-R48-20261013-S03` | Krinos Foods Canada, [About Krinos Canada](https://krinos.ca/about/). | Identifies Krinos as a Canadian importer, manufacturer, and distributor of Greek foods and says it opened in Montréal in 1965. It establishes the local supplier context, not a Québec terminology standard or current retail stock. |
| `WP03-F-GREEK-TRAHANA-R48-20261013-S04` | Lazos, Aggelousis, and Bratakos, [“The fermentation of trahanas: a milk-wheat flour combination prepared in Greece”](https://pubmed.ncbi.nlm.nih.gov/8332586/), *Plant Foods for Human Nutrition* 44(1), 1993. | Primary study supports the Greek milk-wheat fermented-food identity. Its age and study scope do not establish the current commercial SKU’s formula, regional universality, consumer terminology, or recipe measures. |

## Next action

If accepted, integrate only the bilingual product identity and leave all numeric, form, conversion, and substitution fields empty. Keep Greek `trahana` separate from the Turkish `tarhana` hold, and keep Section F open while other unresolved candidates remain. No tests were run because this is proposal-only research.
