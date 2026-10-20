# WP03 Section F — Frosted Flakes family picker boundary review (R783)

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Proposal only. No shared catalog JSON, research ledger, roadmap, checklist, recipe, or generated file is changed here.
- **Plan context:** Section F identity and terminology coverage remains open in the [active checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L564). R780 held Rice Krispies Holiday Edition pending a three-product Rice Krispies family decision; this review covers a separate, previously unresolved Frosted Flakes family gap. R179's Less Sugar Multigrain entry remains accepted and unchanged.
- **Recommendation:** Add four identity-only `GRAIN_AND_CEREAL` references for the current manufacturer-listed Frosted Flakes family members not yet represented: standard Cereal, Strawberry Milkshake, Cookies & Crème Milkshake, and Chocolate Peanut Butter. Keep R179's Less Sugar Multigrain cereal and the generic `corn flakes` identity unchanged. The Chocolate Peanut Butter row is supported only as a name in the current bilingual family pages; hold its SKU, formulation, package, ingredient, nutrition, and regional availability facts.

## Current family and proposed identities

WK Kellogg Canada’s current English and Canadian French Frosted Flakes pages list the same five product cards in matching order. The manufacturer’s standard family list is therefore the boundary for the broad brand query in this review. The product-specific English pages further corroborate the first three proposed identities. The French family card is the naming source for all four proposed French displays.

Trademark symbols are omitted from proposed catalog display strings, consistent with the existing R179 display; the manufacturer wording and qualifiers are otherwise preserved.

| Current family member | Proposed English display | Proposed French display | Status / proposed ID |
|---|---|---|---|
| Standard product | `Kellogg's Frosted Flakes Cereal` | `Céréales Kellogg's Frosted Flakes` | Add identity only: `ingredient-ref-frosted-flakes-cereal` |
| Less Sugar Multigrain | `Kellogg's Frosted Flakes Less Sugar Multigrain Cereal` | `Céréales Kellogg's Frosted Flakes Multigrains Moins de sucre` | Already active as `ingredient-ref-frosted-flakes-less-sugar-multigrain`; preserve R179 unchanged |
| Strawberry Milkshake | `Kellogg's Frosted Flakes Strawberry Milkshake Flavour Cereal` | `Kellogg's Céréales Frosted Flakes Saveur de frappé à la fraise` | Add identity only: `ingredient-ref-frosted-flakes-strawberry-milkshake-cereal` |
| Cookies & Crème Milkshake | `Kellogg's Frosted Flakes Cookies & Crème Milkshake Flavour Cereal` | `Céréales Kellogg's Frosted Flakes Saveur de lait frappé biscuits et crème` | Add identity only: `ingredient-ref-frosted-flakes-cookies-creme-milkshake-cereal` |
| Chocolate Peanut Butter | `Kellogg's Frosted Flakes Chocolate Peanut Butter Flavour` | `Kellogg's Frosted Flakes Chocolat et beurre d’arachide` | Add family-page identity only: `ingredient-ref-frosted-flakes-chocolate-peanut-butter-cereal`; hold all SKU and availability facts |

The manufacturer lists all five under the Frosted Flakes cereal family, but the Chocolate Peanut Butter card omits the word “Cereal/Céréales.” Preserve that exact card wording rather than inserting an unverified product-level title. Its `GRAIN_AND_CEREAL` category follows the page’s cereal-family context; the missing word is not an alias or a separate product-class claim.

Keep these finished branded cereals separate from generic `corn flakes / flocons de maïs`, loose multigrain flakes, and one another. The formula-specific variant names do not establish ingredient equivalence, recipe interchangeability, or a reusable cereal component. Add no aliases, forms, density, unit mappings, package measures, recipe links, conversions, yields, or substitutions. In particular, do not add bare `Frosted Flakes` as an alias: the full display names already make that phrase return the distinct products.

## Catalog, ledger, and path audit

The live seed snapshot contains 1,866 ingredient references and 191 forms; the research ledger contains 2,266 records. Exact candidate IDs above are absent from active references, forms, and ledger record IDs. Exact proposed displays are not owned by another active reference or form. Prior Frosted Flakes review coverage is limited to R179's Less Sugar Multigrain identity and the earlier multigrain-flakes boundary note; no previous review covers the standard, Strawberry Milkshake, Cookies & Crème Milkshake, or Chocolate Peanut Butter catalog identities.

The proposal path was unused before this review. The proposed source-ID prefix `WP03-FF-FAMILY-R783-20261018-` is unused in the ledger and proposal archive. The English family page and the product detail URLs listed below have no exact ledger URL owner. The French family URL is already registered as `WP03-MFLAKES-20261012-S06` on `ingredient-ref-multigrain-flakes`; its existing locator and support text mention only the Less Sugar Multigrain sibling. Do not duplicate that URL or source ID, transfer its owner, or treat its existing narrow support text as already covering this full family. If the family rows are integrated, refresh that existing source observation under its current owner to record the current five-item list, preserving its ID and URL.

The French Where to Buy URL is already registered on other ledger records, not on Frosted Flakes. It is not proposed as a new source or as evidence of product identity. Its current Québec selection lists standard, Strawberry, Cookies & Crème, and Less Sugar products; Chocolate Peanut Butter is absent. That absence does not establish that the product is discontinued or unavailable in Québec, so make no such claim.

## Picker projection

This static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): names, aliases, and form terms are normalized; complete word-phrase matches are preferred; substring matching is used only when no phrase match exists. It is a projection, not live Android picker QA.

| Query | Current | After four proposed rows | Effect |
|---|---:|---:|---|
| `Frosted Flakes` | 1 (R179 Less Sugar Multigrain) | 5 | Returns the complete current manufacturer-listed family as separate choices. |
| `Frosted Flakes Cereal` | 0 | 1 | Finds the standard cereal by its full title. |
| `Strawberry Milkshake` | 0 | 1 | Finds only the Strawberry Milkshake cereal. |
| `Cookies & Crème` | 0 | 1 | Finds only the Cookies & Crème Milkshake cereal after punctuation normalization. |
| `Chocolate Peanut Butter` | 0 | 1 | Finds the family-listed name-only identity; no SKU details are implied. |
| `Céréales Kellogg's Frosted Flakes` | 1 (R179) | 3 | Adds the standard and Cookies & Crème displays. Strawberry retains the source’s `Kellogg's Céréales` word order; Chocolate uses its family-card French name. |
| `Frosted Flakes Less Sugar Multigrain Cereal` | 1 (R179) | 1 | R179 stays the sole exact variant result. |
| `cereal` / `céréales` | 93 / 90 | 96 / 93 | The three proposed displays containing those words enter the broad category results; the Chocolate card’s official title does not contain them. |
| `corn flakes` / `flocons de maïs` | 1 / 1 | 1 / 1 | Generic corn-flakes ownership remains unchanged. |

The five-result `Frosted Flakes` query reflects five separately named current products, not equivalence. No short alias is needed to produce it.

## Bundled recipe demand

The complete current manifest was scanned in manifest order: **114 recipe files and 1,123 structured ingredient rows**. The serialized recipe files and ingredient rows were searched for `Frosted Flakes`, `Kellogg's Frosted Flakes`, `Frosted Flakes cereal`, `Less Sugar Multigrain`, Strawberry Milkshake wording, Cookies & Crème wording, Chocolate Peanut Butter wording, and the paired French names. The scan found **0 matching recipe files and 0 matching ingredient rows**. This is catalog coverage only; add no recipe links or recipe edits.

## Evidence limits and held details

The current bilingual family pages support the five listed product names and the family boundary. The standard, Strawberry, and Cookies & Crème English product pages also load product-specific details, but this proposal does not transfer their ingredients, package sizes, claims, or retailer listings into reusable catalog data.

The Chocolate Peanut Butter English detail endpoint currently returns no product content (the page reports that it cannot find the requested product). No accessible product-specific French detail page or Québec product confirmation was established. The French family card is sufficient for a distinct name-only identity within the cereal family, but it does not support a package, SKU, formulation, ingredient, nutrition, product-status, or local-availability observation. Hold those details until a product-matched source is available. Do not infer discontinuation from either the endpoint failure or the item’s absence from the Québec retailer list.

No reviewed source establishes a reusable measure or a quantity-qualified replacement among the four proposed products, R179's Less Sugar Multigrain product, generic corn flakes, or loose flakes. Keep all measurement, conversion, yield, and substitution behavior empty.

## Source register

Sources were checked on 2026-10-18. `S01`–`S04` are proposed review-local source IDs, not allocated ledger IDs. The existing French family source is reused without URL or owner duplication.

| Key | Source and locator | Evidence and limit |
|---|---|---|
| `WP03-FF-FAMILY-R783-20261018-S01` | WK Kellogg Canada, [Frosted Flakes brand page (English)](https://www.wkkellogg.ca/en/our-foods/our-brands/frosted-flakes), Products list | Current manufacturer family page lists standard, Less Sugar Multigrain, Strawberry Milkshake, Cookies & Crème Milkshake, and Chocolate Peanut Butter with the English product-card names. Supports identity and family boundaries, not equivalence or recipe use. The URL is not registered in the ledger. |
| `WP03-MFLAKES-20261012-S06` (existing; keep owner) | WK Kellogg Canada, [Frosted Flakes brand page (French)](https://www.wkkellogg.ca/fr/nos-aliments/nos-marques/frosted-flakes), Products list | Current page lists the same five French product-card names in the corresponding order. The URL and source ID are already owned by `ingredient-ref-multigrain-flakes`; its recorded support is currently scoped to Less Sugar Multigrain. If reused for the four new names, refresh its locator/support and accessed date under the same owner. Do not create a duplicate URL/source entry. |
| `WP03-FF-FAMILY-R783-20261018-S02` | WK Kellogg Canada, [Kellogg's Frosted Flakes Cereal](https://www.wkkellogg.ca/en/products/frosted-flakes-original-product), product title and description | Confirms the standard English product title and finished-cereal identity. Its current package sizes are product-specific and are not proposed as measures. The URL is not registered in the ledger. |
| `WP03-FF-FAMILY-R783-20261018-S03` | WK Kellogg Canada, [Frosted Flakes Strawberry Milkshake Flavour Cereal](https://www.wkkellogg.ca/en/products/kelloggs-frosted-flakes-strawberry-milkshake-flavour-cereal), product title | Corroborates the English family-card identity. No formulation, size, or nutrition fact from the product page is proposed for reusable data. The URL is not registered in the ledger. |
| `WP03-FF-FAMILY-R783-20261018-S04` | WK Kellogg Canada, [Frosted Flakes Cookies & Crème Milkshake Flavour Cereal](https://www.wkkellogg.ca/en/products/frosted-flakes-cereal-cookies-creme-milkshake), product title | Corroborates the English family-card identity. No formulation, size, or nutrition fact from the product page is proposed for reusable data. The URL is not registered in the ledger. |
| Checked, not proposed as a supporting source | WK Kellogg Canada, [Frosted Flakes Chocolate Peanut Butter Flavour](https://www.wkkellogg.ca/en/products/frosted-flakes-cereal-chocolate-peanut-butter) | Current product endpoint returns no product content; it is not evidence for a current SKU or product facts. The English and French family cards remain the only identity support used for this row. |
| Checked, not proposed for re-registration | WK Kellogg Canada, [Où acheter](https://www.wkkellogg.ca/fr/ou-acheter), Québec selector | Current list contains four Frosted Flakes products, but not Chocolate Peanut Butter. This URL is already registered on other ledger records; its absence is not proof of nonavailability and does not support a new Frosted Flakes ledger observation. |

## Recommendation

**Add the four missing named Frosted Flakes family identities as separate identity-only `GRAIN_AND_CEREAL` references.** Preserve `ingredient-ref-frosted-flakes-less-sugar-multigrain` and generic `ingredient-ref-corn-flakes` unchanged. Use empty aliases, forms, measures, mappings, recipe links, conversions, yields, and substitutions. Keep Chocolate Peanut Butter at family-page name-only confidence and hold all product-specific and regional facts pending a current matched source. Section F's wider grain and cereal review remains open.
