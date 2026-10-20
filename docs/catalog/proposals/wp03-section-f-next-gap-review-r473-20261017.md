# WP03 Section F R473 — Bob's Red Mill 5 Grain Hot Cereal identity review (2026-10-17)

## Review record

- **Scope:** One unreviewed packaged cereal blend in the open Section F regional-cereal and preprocessed-grain review: Bob's Red Mill 5 Grain Hot Cereal, Canadian item P101107.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference, `ingredient-ref-bobs-red-mill-5-grain-hot-cereal`, with source-attested English and Québec French product wording. Keep it separate from the existing 8-grain and 10-grain products, the Red River 7-grain cereal, multigrain flakes, and the component grains.
- **Status:** Proposal only. No shared catalog JSON, ledger, plan, roadmap, generated file, batch README, or test file was changed.
- **Plan context:** This is one bounded product identity under the open Section F checklist at [plan line 552](../../RecipeBook-global-ingredient-catalog-plan.txt#L552) and its [regional cereal-mix checkpoint at line 14490](../../RecipeBook-global-ingredient-catalog-plan.txt#L14518). It does not close the broader review.
- **Snapshot:** 1,753 active references, 141 forms, 56 legacy candidates, 2,112 research-ledger records, and 114 manifest-listed recipes / 1,123 structured ingredient rows.

## Product identity and proposed delta

Bob's Red Mill's 2026 Canadian French product list names **Cereal, 5 Grain Hot / Céréales chaudes 5 grains**, identifies item **P101107**, and lists the Canadian 454 g package and ingredients. A current Metro Québec listing uses the local retail title **Céréales 5 grains Bob's Red Mill**, gives the same 454 g package, and shows the same product number/UPC [reused S01–S02; new S04]. The manufacturer product page supplies the matching English product name and an ingredient list of whole-grain wheat, whole-grain rye, barley, whole-grain oats, whole-grain triticale, and flaxseed [new S03]. The product's “5 Grain” name should remain the source's product name; do not convert it into a general five-grain formula or omit flaxseed from the product's declared ingredients.

If accepted, add only this product reference:

| Field | Proposed value |
|---|---|
| Stable ID | `ingredient-ref-bobs-red-mill-5-grain-hot-cereal` |
| English display | `Bob's Red Mill 5 Grain Hot Cereal` |
| Québec French display | `Céréales 5 grains Bob's Red Mill` |
| English aliases | `Cereal, 5 Grain Hot` |
| French aliases | `Céréales chaudes 5 grains` |
| Category | `GRAIN_AND_CEREAL` |
| `defaultDensity` / `unitMappings` | `null` / `[]` |
| Forms, recipe links, active conversions, yields, substitutions | None |

Both aliases are the exact English/French titles in Bob's Red Mill's Canadian product list. The French display is the exact Québec retailer title. Do not add generic aliases such as `5 grain cereal`, `five-grain cereal`, `multigrain hot cereal`, `céréales multigrains`, `hot cereal`, or component-grain names.

### Neighboring products

| Product | Current owner | Decision |
|---|---|---|
| Bob's Red Mill 10 Grain Hot Cereal | `ingredient-ref-bobs-red-mill-10-grain-hot-cereal` | Keep unchanged. Its ten-grain flour/meal formula is a different named blend. |
| Bob's Red Mill Gluten Free 8 Grain Hot Cereal | `ingredient-ref-bobs-red-mill-8-grain-hot-cereal` | Keep unchanged. The Canadian SKU and formula differ, and this 5-grain product contains wheat. |
| Red River 7 Grain Hot Cereal | `ingredient-ref-red-river-7-grain-hot-cereal` | Keep unchanged. It is a separate Canadian cereal blend and brand. |
| Individual wheat, rye, barley, oat, triticale, and flax ingredients | Existing grain references | Do not link blend components as ingredient aliases or recipe-line components. |
| Plain multigrain flakes and other ready-to-eat cereals | Existing separate references | Keep as different product classes. |

The repository-wide phrase scan found unrelated five-grain references, including a puffed emmer mixture and marketing copy about Cheerios. Neither assigns this Bob's Red Mill SKU. No focused review of P101107 or `ingredient-ref-bobs-red-mill-5-grain-hot-cereal` was found in the plan, proposal archive, batch archive, active references, forms, legacy candidates, or ledger records.

## Ownership, source reuse, and picker projection

The exact normalized ownership audit used the app's case-, punctuation-, accent-, and ligature-folded search behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It covered active names and aliases, form labels and match terms, legacy names and aliases, and ledger record IDs.

| Candidate key | Current exact owner |
|---|---|
| Proposed ID, `Bob's Red Mill 5 Grain Hot Cereal` | None |
| `Cereal, 5 Grain Hot`, `Céréales chaudes 5 grains`, `Céréales 5 grains` | None |
| Item `P101107`, product number/UPC `039978001153` | None |

The two manufacturer-list URLs have existing ledger ownership and should be reused rather than assigned duplicate source IDs:

- Reuse **`WP02-GF-BLENDS-20261010-S08`** for the Bob's Red Mill 2026 Canadian French Product List. Its current ledger attachment cites the same complete list for flour wording; the cereal line is a separate product entry in that document.
- Reuse **`WP03-MIGHTYTASTY-R77-20261013-S05`** for pages 28–29 of the Bob's Red Mill 2025 Canadian Product List. Its current attachment cites the same page for Mighty Tasty; page 28–29 also lists the 5 Grain Hot Cereal and item P101107.

The two proposal-local IDs below are absent from the live ledger and proposal/batch archive. Their exact URLs are not currently assigned another source ID. Keep them proposal-local unless root later allocates them during integration.

| Proposed local ID | URL |
|---|---|
| `WP03-BRM5G-R473-20261017-S01` | `https://www.bobsredmill.com/product/5-grain-rolled-cereal` |
| `WP03-BRM5G-R473-20261017-S02` | `https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-5-grains/p/039978001153` |

Static picker projection with the proposed displays and aliases:

| Query | Current results | With proposed row |
|---|---:|---:|
| `Bob's Red Mill 5 Grain Hot Cereal` | 0 | 1 |
| `Céréales 5 grains Bob's Red Mill` | 0 | 1 |
| `Cereal, 5 Grain Hot` | 0 | 1 |
| `Céréales chaudes 5 grains` | 0 | 1 |
| `Céréales 5 grains` / `5 grains` | 0 / 0 | 1 / 1 |
| `hot cereal` | 11 | 12 |
| `cereal` / `céréales` | 46 / 42 | 47 / 43 |
| `Bob's Red Mill 10 Grain Hot Cereal` | 1 | 1 |

The exact product queries gain the named blend. Broad cereal queries gain one expected product option; the existing 8- and 10-grain exact searches remain unchanged. This is a static projection through the current Kotlin search implementation, not live Android picker QA.

## Bundled recipe demand

Every one of the **114 manifest-listed recipe files** and all **1,123 structured ingredient rows** were scanned for the proposed ID, item P101107, UPC/product number, and English/French product phrases and close spelling variants. The scan found **zero matching files, zero ingredient-row hits, and zero direct reference links**. No recipe link or recipe-text change is supported.

## Measurements, forms, and substitution

- Bob's Red Mill's current product page reports a manufacturer-label serving of **1/3 cup (40 g)** for its 5 Grain Hot Cereal [S03]. The Canadian catalog independently identifies P101107 with the same product name and blend; the serving is product-specific, not a reusable density or volume conversion. If the source observation is recorded in the ledger, use `relationship: portion_weight`, `value: 40`, `valueUnit: g`, `sourceQuantity: 1/3 US customary cup`, `foodState: dry`, and `evidenceKind: manufacturer_label`. Keep it out of active mappings and `defaultDensity`.
- The Canadian 454 g figure is package mass, not a household serving or measure. No cooking yield or dry-to-cooked conversion is proposed.
- The product page says the cereal may replace rolled oats in recipes, but gives no recipe, quantity, role, cooking method, or tested outcome. Record this only as an unquantified manufacturer suggestion; set the ledger substitution research state to `researched_no_supported_substitute`, add no replacement rule, and keep substitutions unavailable to the picker.
- Add no dry/cooked form or recipe-line substitution link. The full bundled corpus has no demand for this SKU.

If root integrates the identity, the ledger can record `identityState: verified`, `measurementState: researched_supported` for the single source-specific label portion, and `substitutionResearchState: researched_no_supported_substitute` with a no-rule finding bounded to the manufacturer's qualitative rolled-oat suggestion. Keep the reference identity-only at runtime: no active density, mapping, form, conversion, yield, recipe link, or substitution rule.

## Source register

Sources checked on **2026-10-17**. Existing IDs are reused for both Canadian manufacturer catalogs. New IDs remain proposal-local.

| Source ID | Source and evidence limits |
|---|---|
| Reused `WP02-GF-BLENDS-20261010-S08` | Bob's Red Mill, [2026 Canadian French Product List](https://bobs-ebooks.cld.bz/Bob-s-Red-Mill-Canadian-French-Product-List/1). The indexed manufacturer catalog lists `Cereal, 5 Grain Hot / Céréales chaudes 5 grains`, item P101107, a 454 g package, and the product ingredients. The direct page fetch returned a cache miss; the indexed product-list text was available. Its existing source ID is attached elsewhere in the ledger and is reused, not duplicated. |
| Reused `WP03-MIGHTYTASTY-R77-20261013-S05` | Bob's Red Mill, [Canadian Product List 2025, pages 28–29](https://bobs-ebooks.cld.bz/Bob-s-Red-Mill-Canadian-Product-List-2025/28-29/). Lists `Cereal, 5 Grain Hot`, `Céréales chaudes 5 grains`, item P101107, package size 454 g, and the ingredient declaration. This is older manufacturer corroboration; it is not needed to establish current stock. |
| `WP03-BRM5G-R473-20261017-S01` | Bob's Red Mill, [5 Grain Hot Cereal](https://www.bobsredmill.com/product/5-grain-rolled-cereal). Current manufacturer product page. Supports the English name, six declared ingredients, 1/3 cup (40 g) product-label serving, and a broad rolled-oat replacement suggestion. It is the US-facing page, not a Canadian label; keep its serving source-specific and do not turn the broad replacement wording into a substitution rule. |
| `WP03-BRM5G-R473-20261017-S02` | Metro Québec, [Céréales 5 grains Bob's Red Mill, 454 g](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-5-grains/p/039978001153). Supports local French retail wording, product number, package mass, and ingredients. Direct French page retrieval returned a cache miss; the matching English Metro page identifies the same product number and reported it out of stock at the selected store. Do not infer Québec-wide availability from the listing. |

## Recommendation

Add only the brand-specific, identity-only `ingredient-ref-bobs-red-mill-5-grain-hot-cereal` row with the displays and two product-label aliases above. Record the 1/3 cup (40 g) manufacturer serving only as a product-specific ledger observation, and record no supported automatic replacement for rolled oats despite the manufacturer's unqualified suggestion. Do not add a form, active measure, density, unit mapping, conversion, yield, recipe link, or substitution rule. Keep the larger Section F regional cereal and preprocessed-grain review open.
