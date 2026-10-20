# WP03 Section F — Rice Krispies Holiday Edition family hold (R780)

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Proposal-only hold. No shared catalog JSON, ledger, recipe, roadmap, checklist, or generated file changed. No ledger source IDs are allocated while the hold stands.
- **Open plan item:** Continue the remaining Section F identity and terminology coverage; the active plan names other unresolved grain products as open ([Section F checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L564)).
- **Candidate:** WK Kellogg Canada’s current **Rice Krispies Holiday Edition Cereal / Céréales Rice Krispies Édition des Fêtes**.
- **Recommendation:** Keep this seasonal cereal outside active references and the research ledger until the picker decision covers its current Rice Krispies family. The manufacturer lists Original, Spring Edition, and Holiday Edition in both languages. Adding Holiday Edition alone would make the broad `Rice Krispies` query return one of three manufacturer-listed products.
- **Scope:** This review assesses the Holiday Edition candidate and its immediate picker boundary. It does not propose adding the Original or Spring Edition, changing generic crispy-rice-cereal identity, or treating the branded products as interchangeable.

## Identity evidence and family boundary

WK Kellogg Canada’s English product page identifies **Rice Krispies Holiday Edition Cereal** as a limited-time product with festive red and green colours, a 340 g package, and a product-specific ingredient declaration that includes food colours [S02]. This supports a separately named finished-cereal candidate. It does not establish a general cereal formula or a reusable recipe measure.

The manufacturer’s bilingual Rice Krispies family pages list three products separately: **Rice Krispies Cereal**, **Rice Krispies Spring Edition Cereal**, and **Rice Krispies Holiday Edition Cereal** in English [S03], and **Céréales Rice Krispies Originale**, **Céréales Rice Krispies Édition printanière**, and **Céréales Rice Krispies Édition des Fêtes** in French [WP03-S88]. The French family-page URL is already registered under `WP03-S88` for product-description context; its current product list was read for this proposal, but the existing ledger source scope is not expanded while the hold stands. The Spring product page describes green and blue pieces added to its classic crispy rice cereal and displays a Québec region setting [S04]. The family evidence therefore makes a Holiday-only row incomplete for the brand query, even though the product name itself is well supported.

The French Holiday name is taken from the manufacturer’s accessible French family listing, not a direct Holiday product-page retrieval: the direct French Holiday route rendered a JavaScript placeholder during this review. The French family page is already a source on the generic crispy-rice-cereal ledger record, and this review reuses that source only for the family’s French product-name list. It does not move or reassign the source.

The existing generic identity remains `crispy rice cereal / céréales de riz croustillantes`. Its accepted boundaries explicitly exclude the Rice Krispies trademark from its aliases; OQLF source `WP03-S90` records `riz croustillant` as a trademark-specific term, not a generic synonym. Preserve those decisions. A future branded identity, if the family boundary permits one, must stay separate from generic crispy rice cereal, puffed rice, and infant rice cereal.

## Catalog, ledger, and archive ownership

The current reference file contains 1,866 ingredient references and the forms file contains 191 forms. No active reference or form owns the candidate’s full English or French product name, the `Rice Krispies Holiday` phrase, or the proposed ID `ingredient-ref-rice-krispies-holiday-edition-cereal`. The existing `ingredient-ref-rice-cereal` row has no aliases or forms; it remains the sole owner of `crispy rice cereal / céréales de riz croustillantes`.

The legacy candidate file contains no Rice Krispies candidate. The 2,266-record evidence ledger has no separate Holiday Edition record. It does contain prior research on the generic crispy-rice-cereal row ([R291 review](wp03-section-f-crispy-rice-cereal-measurement-review-r291-20261016.md)):

- `WP03-S88` owns the French manufacturer family-page URL and supports processed-cereal context and use in treats. Keep this exact source ID and URL with `ingredient-ref-rice-cereal`; do not re-register or reassign it.
- `WP03-S90` owns OQLF’s `riz croustillant` entry, which the existing decision keeps out of generic aliases.
- R291 records a manufacturer-label portion of 1 Canadian label cup (28 g) for a specific 1,120 g Rice Krispies SKU. Keep that observation on the generic research record as SKU-specific evidence; it does not measure Holiday Edition and is not a generic cereal conversion.

The proposal path is unused. The candidate ID is unallocated in the reference, form, legacy, and ledger files; the proposed source-ID prefix `WP03-RK-R780-20261018-` is unused in the ledger and proposal archive. The new manufacturer URLs listed below have no exact ledger owner. The French family-page URL is the one existing URL exception above and remains under `WP03-S88`. The source IDs in this proposal are review-local labels, not allocated ledger IDs.

## Picker projection

This static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize case, accents, punctuation, and spacing; return complete word-phrase matches first; use substring matching only when no phrase matches. It is a projection from current names and aliases, not live Android picker QA.

| Query | Current result | If Holiday Edition alone were added | Effect |
|---|---|---|---|
| `Rice Krispies` | 0 | Holiday Edition only | The current manufacturer family has three named products; a single result would imply a narrower family choice than the source supports. |
| `Rice Krispies Holiday` | 0 | Holiday Edition | Useful product-specific query, but does not resolve the broad-family problem. |
| `Rice Krispies Spring` | 0 | 0 | Holiday-only coverage would leave the manufacturer-listed Spring sibling unrepresented. |
| `crispy rice cereal` | `ingredient-ref-rice-cereal` | `ingredient-ref-rice-cereal` | Preserve the generic recipe ingredient result. |
| `céréales de riz croustillantes` | `ingredient-ref-rice-cereal` | `ingredient-ref-rice-cereal` | Preserve the existing French generic identity. |
| `rice cereal` | `ingredient-ref-baby-rice-cereal`, `ingredient-ref-rice-cereal` | Same two results | No broader rice-cereal alias is needed. |
| `céréales` | 90 references | 91 references | A broad category search would gain one branded product without resolving the three-item family. |

Adding the three products as separate rows could make `Rice Krispies` return three results, but that is not proposed here. It remains to decide whether seasonal colour variants merit separate ingredient identities or should be represented through one family-level choice. Do not silently choose one representation by adding the Holiday SKU alone.

## Bundled recipe demand

The bundled manifest lists 114 recipe files with 1,123 structured ingredient rows. A full-file and ingredient-row search for `Rice Krispies`, `Rice Krispies Holiday`, the French Holiday title, and the Spring/Original product titles found no product-specific recipe mention or row.

Recipe 040 has one relevant row: `6 cups crispy rice cereal`, linked to `ingredient-ref-rice-cereal`. The row is already correctly generic and is not demand for the Rice Krispies brand or a seasonal edition. Preserve it unchanged. No recipe link, amount, form, yield, or substitution is proposed.

## Numeric, form, and substitution boundaries

- The Holiday product page gives a 340 g package size, not a recipe amount or serving conversion [S02]. No Holiday-specific serving mass or fill method was established.
- Keep default density null, unit mappings empty, and forms empty. Do not transfer R291’s 28 g label portion from a different Rice Krispies SKU to this seasonal product.
- The red/green colours and ingredient declaration identify a formulated finished cereal; they do not establish component proportions or links to rice, sugar, barley malt, or colorants.
- No source reviewed here establishes that Holiday Edition can replace Original, Spring Edition, generic crispy rice cereal, or another cereal in a recipe. Add no global or contextual substitution, conversion, or yield.

## Source register

All sources were checked online on 2026-10-18. `S01`–`S04` below are proposal-local citation keys only. The existing source keys are cited with their original owners; no source is added to the active ledger while this is a hold.

| Key | Source and locator | Supports and limits |
|---|---|---|
| `WP03-RK-R780-20261018-S01` | WK Kellogg Canada, [Rice Krispies Cereal](https://www.wkkellogg.ca/en/products/rice-krispies-cereal-product), product description and available sizes | Identifies the current Original product and lists 560 g, 340 g, and 1.12 kg sizes. Product context only; it is not the Holiday formula. |
| `WP03-RK-R780-20261018-S02` | WK Kellogg Canada, [Rice Krispies Holiday Edition Cereal](https://www.wkkellogg.ca/en/products/rice-krispies-holiday-product), product description, package, and ingredients | Names the Holiday product, calls it limited-time, describes festive red/green colours, lists 340 g, and declares food colours. It does not provide a Holiday-specific serving mass or recipe amount. |
| `WP03-RK-R780-20261018-S03` | WK Kellogg Canada, [Rice Krispies brand page (English)](https://www.wkkellogg.ca/en/our-foods/our-brands/rice-krispies), Products section | Lists Original, Spring Edition, and Holiday Edition separately. Supports the current family picker boundary, not equivalence or a recipe substitution. |
| `WP03-RK-R780-20261018-S04` | WK Kellogg Canada, [Céréales Rice Krispies Édition printanière](https://www.wkkellogg.ca/fr/produits/rice-krispies-spring), product title, description, Québec region selector, and ingredients | Confirms the French product title, Québec-facing page, green/blue pieces, and a coloured formulation of the classic crispy rice cereal. It supports a separate named sibling; it does not provide Holiday ingredients. |
| `WP03-S88` (existing URL; scope not expanded) | WK Kellogg Canada, [Rice Krispies brand page (French)](https://www.wkkellogg.ca/fr/nos-aliments/nos-marques/rice-krispies), current Products section | The live page lists the French Original, Spring Edition, and Holiday Edition names. Its existing ledger entry on `ingredient-ref-rice-cereal` is scoped to product-description context; this proposal does not alter that entry or allocate another source ID for the URL. |
| `WP03-S90` (existing; reused) | OQLF, [riz croustillant](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18940757/riz-croustillant), preferred term and English equivalent | Already owned by `ingredient-ref-rice-cereal`; records a trademark-specific term. Do not use it as a generic alias or reassign the source. |
| `WP03-CRRICE-R291-20261016-S01` (existing; reused) | WK Kellogg Canada SmartLabel, [Rice Krispies Cereal, GTIN 00064100108271](https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00064100108271), Nutrition Facts | Already owned by the generic crispy-rice-cereal research record; reports 1 cup (28 g) for one specific SKU. Do not transfer this portion to Holiday Edition or use it as a generic measure. |

## Recommendation and reopen conditions

**Hold Rice Krispies Holiday Edition outside active catalog and ledger data.** Current manufacturer sources establish a named seasonal product and bilingual family context, but the manufacturer lists Original and Spring Edition alongside it. A Holiday-only row would make broad `Rice Krispies` resolve to one of three products; the bundled recipes request only the generic crispy rice cereal already represented by `ingredient-ref-rice-cereal`.

Reopen with a family-level decision that determines whether the Original and seasonal colour variants should be separate picker identities or one brand-level ingredient choice. If later accepted, keep the brand identity separate from generic crispy rice cereal, do not add the trademark as a generic alias, and attach only measurements, forms, or recipe links that are directly supported for the exact selected product. Until then, leave the active reference, ledger, recipes, and generic picker terms unchanged.

## Review checks

- [x] Read `AGENTS.md`, the relevant Requirements section, the active Section F plan item, current roadmap progress, and the current catalog/ledger before selecting the gap.
- [x] Read the existing crispy-rice-cereal identity and R291 decision; preserve its generic name, recipe link, source ownership, and SKU-specific portion evidence.
- [x] Checked candidate ID, form/legacy ownership, proposal path, proposed source-ID prefix, exact URLs, and the existing French family-page/OQLF source IDs.
- [x] Reviewed current manufacturer English/French product and family pages.
- [x] Projected phrase-first picker results for the candidate and generic rice-cereal queries.
- [x] Scanned every manifest-listed recipe file and ingredient row for product-specific demand.
- [x] Kept all active data changes out of scope because the recommendation is a hold.
- [x] Verified this proposal as UTF-8 without BOM and checked scoped whitespace. No software tests, build, emulator run, or deployment were needed for this proposal-only review.
