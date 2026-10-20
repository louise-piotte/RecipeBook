# WP03 Section F R582 — Bob's Red Mill 7 Grain Hot Cereal identity review

## Review decision

- **Status:** Integrated; see the [R582 integration README](../batches/wp03-r582-bobs-red-mill-7-grain-cereal-integration-20261017/README.md).
- **Plan anchor:** The still-open Section F parent at [line 4514](../../RecipeBook-global-ingredient-catalog-plan.txt#L4523), “Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps.” This review adds one named packaged blend; it does not close that parent or the separate dry/cooked-form checklist.
- **Scope:** Bob's Red Mill's named 7 Grain Hot Cereal, distinct from Red River 7 Grain Hot Cereal and Bob's Red Mill's separate 5, 8, and 10 Grain products.
- **Recommendation:** Add one brand-specific `GRAIN_AND_CEREAL` identity with a single manufacturer-label portion observation. Add no forms, active conversions, density, cooking yield, recipe link, or substitution rule.

## Product evidence and boundary

Bob's Red Mill's current English product page names **7 Grain Hot Cereal** and lists whole-grain wheat, whole-grain rye, whole-grain oats, whole-grain triticale, pearled barley, whole-grain brown rice, oat bran, and flaxseed. The Canadian French manufacturer page describes the same named blend and repeats that ingredient declaration. Both manufacturer pages state a label serving of **1/4 cup (43 g)** [S01–S02]. The manufacturer’s 2026 US product list also lists `Cereal, 7 Grain Hot`, a 25 oz four-pack, and item `P101119` [reused R173 S05]. These sources support a named product, not a generic seven-grain formula: the declaration lists eight ingredients, and the product name must not be used to infer a count or taxonomy for other blends.

iHerb Canada's listing identifies a Bob's Red Mill `7 Grain Hot Cereal` retail item, product code `BRM-11107`, UPC `039978111074`, and a package labeled 1 lb 9 oz (709 g); the rendered package-quantity field says 708 g [S03]. Treat this as product and package evidence only. The 708/709 g display difference is not a kitchen measurement. The page snapshot also reported in-stock and 500+ sold in 30 days, but its indexed content was about three months old when retrieved; it does not establish today's stock or durable Canadian demand. The manufacturer list's P101119 item number and iHerb's retailer code/UPC are reported separately; this review does not claim a code crosswalk between them.

The manufacturer’s Canadian page title is duplicated as `Céréales chaudes chaudes à 7 grains`. In the page body, the manufacturer uses the clean singular wording `céréale chaude à 7 grains` and the category wording `céréales chaudes multigrains` [S01]. Use the source-attested singular phrase as a searchable French alias; do not preserve the duplicated page-title typo or treat it as a terminology ruling. iHerb's Canadian French category listing renders the product `Céréales chaudes à 7 céréales` [S05]. That retailer-authored translation is not needed as an alias because it changes the wording from the manufacturer's `7 grains` and is not independently reviewed.

Keep the product separate from:

| Neighbor | Current owner | Boundary |
|---|---|---|
| Red River 7 Grain Hot Cereal | `ingredient-ref-red-river-7-grain-hot-cereal` | Separate Canadian brand and blend; its current aliases include `Red River 7 Grain Cereal` and `Red River Céréales Chaudes 7 Grains`. |
| Bob's Red Mill 5 Grain Hot Cereal | `ingredient-ref-bobs-red-mill-5-grain-hot-cereal` | Separate labeled product and formula; see [R473](./wp03-section-f-next-gap-review-r473-20261017.md). |
| Bob's Red Mill Gluten Free 8 Grain Hot Cereal | `ingredient-ref-bobs-red-mill-8-grain-hot-cereal` | Separate Canadian product; see [R173](./wp03-section-f-bobs-red-mill-8-grain-hot-cereal-identity-review-r173-20261016.md). |
| Bob's Red Mill 10 Grain Hot Cereal | `ingredient-ref-bobs-red-mill-10-grain-hot-cereal` | Separate product and formula; see [R100](./wp03-section-f-next-grain-gap-review-r100-20261014.md). |
| Nearest active component references | `ingredient-ref-wheat-berries`, `ingredient-ref-rye-grain`, `ingredient-ref-oat-groats`, `ingredient-ref-triticale-grain`, `ingredient-ref-pearl-barley`, `ingredient-ref-brown-rice`, `ingredient-ref-oat-bran`, `ingredient-ref-flax-seeds` | Related component identities only. Do not link or alias them to the packaged blend; this list does not assert exact processing equivalence. |

## Integrated reference delta

Root added this identity row:

```json
{
  "id": "ingredient-ref-bobs-red-mill-7-grain-hot-cereal",
  "nameEn": "Bob's Red Mill 7 Grain Hot Cereal",
  "nameFr": "Céréales chaudes à 7 grains (Bob's Red Mill)",
  "aliasesEn": [],
  "aliasesFr": ["Céréale chaude à 7 grains"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

The English primary name retains the manufacturer's exact product phrase with the brand qualifier. The French display is an editorial pluralized, brand-qualified rendering of the manufacturer's singular phrase, not an exact page title or an OQLF ruling; the French alias is the singular manufacturer phrase. Do not add `7 Grain Cereal` as an English alias: it is an unqualified manufacturer recipe-page title and would cause the current `7 grain cereal` query to return two different branded blends. Do not add `hot cereal`, `céréales chaudes`, `multigrain cereal`, `céréales multigrains`, `gruau`, `grits`, `oatmeal`, or component names as aliases. The selected display and alias match the integrated row.

## Ownership, picker, and recipe-demand audit

At proposal audit baseline, before R579 was integrated, the live package contained **1,805 active references**, **154 forms**, **56 legacy-import identities**, and **2,175 research-ledger records**. Exact-string and case-folded searches found no owner for the proposed reference ID, brand-qualified display names, French alias, manufacturer item `P101119`, iHerb code `BRM-11107`, or UPC `039978111074` in active references, forms, legacy identities, or the live research ledger. The unqualified phrase `7 Grain Hot Cereal` is already present on the separate Red River reference and ledger record; that is an expected same-name-count collision across different brands, not an exact product owner. No form is attached to any of the four sibling hot-cereal references. At R582 integration, after R579, the current baseline was 1,806 references and 2,176 ledger records.

The primary 2026 manufacturer product-list URL is cited in the R173 proposal as proposal-local source `WP03-BRM8G-R173-20261016-S05` for its separate 8 Grain comparison. It is the same official 2026 pages 36–37 URL and also contains the 7 Grain Hot Cereal entry. The Canadian and English manufacturer product-page URLs, iHerb Canada product URL and French category URL, and preparation-page URL had no exact URL owner in the live ledger at audit time. Root registered S01, S02, and S04 for the accepted row; S03 and S05 remain proposal-only because their retailer/category wording was not needed for the integrated identity or portion.

Static picker projection follows the active phrase-first matching and normalization in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), using current references and attached forms:

| Query | Current results | With proposed row | Effect |
|---|---:|---:|---|
| `Bob's Red Mill 7 Grain Hot Cereal` | 0 | 1 | Brand-qualified English name is unique. |
| `Céréales chaudes à 7 grains` | 0 | 1 | Integrated French display phrase is unique. |
| `Céréale chaude à 7 grains` | 0 | 1 | Source-attested singular French alias is unique. |
| `7 grain hot cereal` | 1 | 2 | Returns the separate Red River and Bob's Red Mill products; brand-qualified queries distinguish them. |
| `7 grains` | 1 | 2 | Returns both separately named 7-grain blends. |
| `7 grain cereal` | 1 | 1 | Remains on Red River because the ambiguous short Bob's preparation-page phrase is not added as an alias. |
| `Red River 7 Grain Hot Cereal` | 1 | 1 | Existing brand-qualified match is unchanged. |
| `hot cereal` / `céréales chaudes` | 12 / 8 | 13 / 9 | Each broad category query gains one expected product. |
| `cereal` / `céréales` | 69 / 65 | 70 / 66 | Each broad category query gains one expected product. |

The recipe audit scanned all **114 manifest-listed recipe files** and **1,123 structured ingredient rows** for the brand, proposed ID, English/French product wording, `7 Grain Cereal`, and relevant item identifiers. It found zero matching files, zero matching rows, and zero reference links. No bundled recipe link or recipe edit is proposed.

## Measurement, form, and substitution limits

- **Portion observation:** The two current manufacturer product pages give the same label portion, **1/4 cup (43 g)** [S01–S02]. The ledger records one product-specific `portion_weight` observation for the packaged blend only, with `value: 43`, `valueUnit: "g"`, `sourceQuantity.amount: 0.25`, and `sourceQuantity.unit: "cup"`. The sources do not specify the cup convention; that uncertainty is preserved. The value is not in `defaultDensity`, active `unitMappings`, or a general hot-cereal conversion. The retailer nutrition panel repeats the portion but was not needed for the observation.
- **Package size:** The manufacturer's 2026 list says 25 oz; iHerb's title says 709 g while the page field says 708 g. Keep these as package-label metadata only. Do not derive a cup conversion or use either number as a recipe quantity.
- **Preparation:** The manufacturer’s preparation page gives product-specific instructions including 1 cup cereal with 3 cups water for four servings, and a microwave method using 1/4 cup cereal plus 3/4 cup water for one serving [S04]. These instructions do not establish a reusable cooked yield or dry-to-cooked conversion. Add no cooked form, volume mapping, yield, or state-linked form conversion.
- **Substitution:** The manufacturer describes the cereal as an alternative to oatmeal and a corn-free version of grits [S01–S02]. The wording gives no substitution quantity, tested result, dish role, or method-specific exchange. Record this only as an unquantified product-use statement; add no global or contextual substitute, oatmeal/grits alias, or recipe-line substitution. A ledger finding may be `researched_no_supported_substitute` for this reviewed statement only.
- **Composition:** Do not infer that the brand's “7 Grain” name counts listed ingredients or generalizes to another seven-grain blend. Keep the package identity as sold and do not infer ingredient proportions, grind sizes, or gluten-free status.

## Source register

Sources reviewed on **2026-10-17**. The source IDs were proposal-local at review time; root registered S01, S02, and S04 for the accepted row. The potential R173 reuse remains proposal-only.

| Source ID | Source and evidence limits |
|---|---|
| `WP03-BRM7HOT-R582-20261017-S01` | Bob's Red Mill Canada, [Céréales chaudes à 7 grains product page](https://www.bobsredmill.ca/produit/cereales-chaudes-chaudes-a-7-grains). The page title repeats `chaudes`; its body supplies the singular French phrase, product description, ingredient list, and 1/4 cup (43 g) label portion. Product page, not a Québec terminology ruling. |
| `WP03-BRM7HOT-R582-20261017-S02` | Bob's Red Mill, [7 Grain Hot Cereal](https://www.bobsredmill.com/product/7-grain-hot-cereal). Manufacturer English product page; confirms title, ingredients, 1/4 cup (43 g) portion, oatmeal alternative, and corn-free grits description. Those qualitative uses do not establish substitution rules. |
| Potential reuse `WP03-BRM8G-R173-20261016-S05` (not registered for R582) | Bob's Red Mill, [2026 Product List, pages 36–37](https://bobs-ebooks.cld.bz/Bob-s-Red-Mill-Product-List/36-37/). The same URL is cited in the R173 proposal. Its line for `Cereal, 7 Grain Hot` lists the ingredients, 25 oz four-pack, and item P101119. The review considered an item-specific locator, but root did not need this source for the accepted identity or portion. It is the US product list, not a Canadian-language product catalog. |
| `WP03-BRM7HOT-R582-20261017-S03` | iHerb Canada, [Bob's Red Mill 7 Grain Hot Cereal, 1 lb 9 oz (709 g)](https://ca.iherb.com/pr/bob-s-red-mill-7-grain-hot-cereal-1-lb-9-oz-709-g/126941). The page identifies product code BRM-11107, UPC 039978111074, ingredients, package quantity 708 g, and a time-sensitive availability/sales snapshot. Retailer content may lag packaging; do not use its package quantity as a kitchen measure. |
| `WP03-BRM7HOT-R582-20261017-S04` | Bob's Red Mill, [Basic Preparation Instructions for 7 Grain Cereal](https://www.bobsredmill.com/recipes/how-to-make/basic-preparation-instructions-for-7-grain-cereal). Manufacturer cooking instructions and the unqualified short title `7 Grain Cereal`; use the instructions only as this product's preparation directions, not as a generic yield or substitution. |
| `WP03-BRM7HOT-R582-20261017-S05` | iHerb Canada, [Hot Cereals category](https://ca.iherb.com/c/hot-cereals/store). A search-index result crawled about four months before this review surfaced the French retailer title `Céréales chaudes à 7 céréales`; direct opening of the category URL returned an older English-language snapshot, and a text search found no match. Retain this as weak, time-bounded retailer wording evidence only; it does not establish a Québec terminology ruling, formula, or current availability. |

## Root integration

Root added `ingredient-ref-bobs-red-mill-7-grain-hot-cereal` with the manufacturer's English title and French display `Céréales chaudes à 7 grains (Bob's Red Mill)`, plus the source-attested singular French alias. The ledger records one manufacturer-label **1/4 cup (43 g)** portion with no cup convention, a bounded no-supported-replacement finding for the qualitative oatmeal/grits statements, and sources S01, S02, and S04. The R173 2026 product-list source was not reused because it was unnecessary. `defaultDensity` remains null; `unitMappings`, forms, cooking yields, active conversions, recipe links, and active substitutions remain absent. The larger Section F parent remains open.

The live seed package, research ledger, generated Kotlin index, plan, roadmap, and integration README were updated. The bundle has no matching recipe demand. Seed-package normalization and validation, generated-index freshness, ledger/source ownership, picker projection, UTF-8/no-BOM/escaped-Unicode, local links, and scoped whitespace checks passed. No app tests, build, emulator run, or deployment were run for this database-JSON-only addition under `AGENTS.md`.
