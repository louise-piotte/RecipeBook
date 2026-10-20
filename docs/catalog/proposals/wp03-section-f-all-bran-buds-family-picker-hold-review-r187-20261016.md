# WP03 Section F: All-Bran Buds family picker hold (R187)

## Packet record

- **Reviewed:** 2026-10-16.
- **Resolution:** The family-wide condition was met by R203, which added all four currently listed All-Bran products together. This archived proposal remains the record of the temporary hold; see the R203 proposal and integration README for the active disposition.
- **Status:** hold outside active ingredient references and the research ledger pending a family-wide picker decision.
- **Candidate:** current Canadian All-Bran Buds ready-to-eat cereal, with the manufacturer title pair `All-Bran Buds Cereal / Céréales All-Bran Buds`.
- **Recommendation:** do not add only Buds while the other current All-Bran products have no named catalog identities. With the current phrase-first picker, a Buds-only row would make a broad `All-Bran` query return Buds as the sole brand-family result.
- **Scope:** one product-family member only. This review does not propose generic bran buds, wheat bran, psyllium, All-Bran Original, the All-Bran Flakes SKU, or frosted bran flakes as part of the same identity.
- **Data:** no active reference, form, measurement, mapping, recipe link, substitution rule, or ledger record is proposed for integration while the hold stands.

## Open Section F work and prior review

The active [Section F checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L3557) leaves regionally significant cereal mixes and preprocessed grains open. The focused [bran-flakes cereal review](wp03-section-f-bran-flakes-cereal-identity-review-20261012.md) added the generic `bran flakes cereal / céréales de son en flocons` identity. It mentions All-Bran Buds only as a separate manufacturer-listed sibling product; it does not decide Buds' active identity, aliases, recipe-corpus demand, product-specific serving, or picker behavior. Searches of the active plan, proposals, and batches found no focused All-Bran Buds proposal or hold.

The current French All-Bran family page lists four separate products: `Céréales All-Bran Flakes`, `Céréales All-Bran Original`, `Céréales All-Bran Buds`, and `Flocons de son givrés All-Bran`. The existing generic bran-flakes reference is not a brand-specific All-Bran Flakes SKU and does not satisfy the brand-family search. The Buds identity is sufficiently documented to consider, but its solo family match is a picker boundary that should be resolved with the sibling products.

## Ownership and corpus audit

Read-only audit of the shared package after the WP04 R186 integration on 2026-10-16:

| Surface | Snapshot and result |
| --- | --- |
| Active ingredient references | 1,566 references. No exact normalized owner for `All-Bran Buds`, `All Bran Buds`, `All-Bran Buds Cereal`, `Céréales All-Bran Buds`, `Céréales de son All-Bran Buds`, or `bran buds cereal`; proposed ID `ingredient-ref-all-bran-buds-cereal` is unallocated. Nearby entries include generic bran-flakes cereal, wheat bran, and component cereal products, which do not name this finished product. |
| Ingredient forms | 122 forms. No exact candidate wording in form labels or match terms; no Buds form is proposed. |
| Legacy import identities | 61 candidates. No exact candidate wording or proposed ID owns the product. |
| Research ledger | 1,911 records, 8,220 source entries, 7,020 distinct source IDs, and 5,814 distinct URLs. No Buds record or decision exists. The generic bran-flakes record contains an adjacent mention from its manufacturer family-page source; it explicitly distinguishes Buds and does not decide this candidate. The family-page URL is already owned as `WP03-BRAN-FLAKES-CEREAL-20261012-S04` and is reused below. |
| Source ownership | The current Buds English and French product URLs, the Metro Québec product URL, the manufacturer recipe URL, and the proposed R187 source IDs below were absent from the ledger at review time. Do not duplicate the already-owned family-page URL under a new source ID. |
| Bundled recipe corpus | All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned for the candidate names and normalized variants. No file or ingredient row matched; no catalog recipe demand or relinking is justified. |

The adjacent family-page mention is retained as boundary evidence only. It does not make this a repeated proposal: there is no candidate reference, form, legacy mapping, dedicated ledger record, focused plan disposition, or earlier picker decision.

## Identity and family boundary

| Candidate or neighbor | Decision |
| --- | --- |
| All-Bran Buds | Current named Canadian product; the manufacturer gives the exact English and French product titles. Hold as a single-family-member addition until the other All-Bran products or family-query behavior are reviewed together. |
| `bran flakes cereal / céréales de son en flocons` | Keep the existing generic finished-cereal identity unchanged. Its display does not include the All-Bran brand, and its scope is not the Buds product. |
| Wheat bran and psyllium seed husk | Keep as component ingredients. The manufacturer product contains both, along with sugar and other listed ingredients; the finished cereal is not an alias or form of either component. |
| All-Bran Flakes, All-Bran Original, frosted bran flakes | Keep as separate named products if later reviewed. The current manufacturer family listing names each separately; it does not establish formula equivalence. |
| Aliases | None proposed. In particular, adding an `All-Bran` alias would reinforce the single-result family collision. |

## Picker behavior and collision consequence

`IngredientReferenceSearchIndex` normalizes accents and punctuation, returns complete word-phrase matches first, and falls back to substring matches only when no complete phrase matches. A static projection using the current bilingual displays and aliases, plus the proposed Buds displays and no forms, gives:

| Query | Current result | With Buds alone | Consequence |
| --- | --- | --- | --- |
| `All-Bran Buds` / `Céréales All-Bran Buds` | 0 | 1: Buds | Useful specific product query. |
| `All-Bran` / `All Bran` | 0 | 1: Buds | Misleading: three other distinct products are listed in the manufacturer's current family, but would be absent from this result. |
| `bran flakes` | 1: generic bran-flakes cereal | 1: same generic row | Specific generic cereal search remains stable. |
| `céréales de son en flocons` | 1: generic bran-flakes cereal | 1: same generic row | Existing Québec generic title remains stable. |
| `bran` | 8 bran-related references | 9, including Buds | Expected broad-query expansion; components and generic cereal remain separately selectable. |

This is the same material picker concern documented in other cereal-family holds: one exact product row would appear to answer a broader manufacturer-family query by itself. Reopen after a family-wide product review, or when picker behavior can expose a family result without selecting one unreviewed sibling as the only match.

## Numeric and substitution evidence

| Evidence | Supported use | Limit |
| --- | --- | --- |
| Manufacturer product pages list a `1/3 cup (28 g)` nutrition serving, and show 500 g and 1,050 g packages. | If the identity is later accepted, retain the serving only as a product- and label-specific ledger observation: `sourceQuantity.amount = 1/3`, `sourceQuantity.unit = cup`, `observedMassG = 28`, dry cereal as sold. | This is not a generic cereal portion, loose-fill measurement, density, volume-to-mass mapping, or package conversion. Do not populate `defaultDensity`, unit mappings, or forms. Package sizes describe product variants only. |
| WK Kellogg's `Simple Savoury Topping` recipe lists 2 cups All-Bran Buds **or** 2 cups All-Bran Original for that named topping. | Records a source-specific, recipe-context product option; if both products receive reviewed identities later, consider retaining the finding in the ledger. | One manufacturer formula does not establish general interchangeability, a global conversion, or a transferable substitution across baking, cereal, or other roles. All-Bran Original has no active named reference in this snapshot. Add no substitution rule from this evidence alone. |
| Current manufacturer ingredient declaration lists wheat bran, sugar, psyllium seed husk, salt, baking soda, annatto, BHT, and listed vitamins/minerals. | Supports this as a distinct finished cereal product. | Do not create component aliases or infer a universal formula for bran cereal. |

The bundle has no matching ingredient line, and the product pages give no preparation yield. Add no recipe link, cooked form, conversion, yield, or contextual rule under this review.

## Conditional reference and ledger details if the family decision later permits an add

This is a future integration sketch only. It is **not** an instruction to add the reference while the hold stands.

```json
{
  "id": "ingredient-ref-all-bran-buds-cereal",
  "nameEn": "All-Bran Buds Cereal",
  "nameFr": "Céréales All-Bran Buds",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "GRAIN_AND_CEREAL"
}
```

If accepted after the family/picker review, create one `ingredient_reference` ledger record owned by `ingredient-ref-all-bran-buds-cereal`, with the English/French product sources and Québec listing below; reuse the existing brand-family source ID for its already-owned URL. Record the 1/3 cup (28 g) serving only as a product-specific measurement observation and leave active measures, density, and mappings empty. Record the single recipe option as a source-limited finding only if All-Bran Original receives a reviewed target identity; do not add a runtime substitution rule from this proposal. Add no form, legacy mapping, recipe link, conversion, yield, or replacement alias.

## Source register

Sources checked online on 2026-10-16. R187 source IDs below are proposal-local and were not present in the ledger or archive when checked. Each ID refers to one URL. The All-Bran family URL is already registered under its existing ID and must be reused rather than duplicated.

| Source ID | Source | What it supports and limits |
| --- | --- | --- |
| `WP03-ALL-BRAN-BUDS-R187-20261016-S01` | WK Kellogg Co Canada, [All-Bran Buds Cereal](https://www.wkkellogg.ca/en/products/all-bran-buds-cereal-product) | Current Canada-English product page gives the English title, ingredient declaration, 500 g and 1,050 g sizes, and 1/3 cup (28 g) nutrition serving. The serving and formulation remain product-specific. |
| `WP03-ALL-BRAN-BUDS-R187-20261016-S02` | WK Kellogg Co Canada, [Céréales All-Bran Buds](https://www.wkkellogg.ca/fr/produits/cereales-all-bran-buds-product) | Current Canada-French product page gives the exact French product title, French ingredient declaration, Québec retailer context, and the same 1/3 tasse (28 g) serving. This is manufacturer wording, not an OQLF ruling. |
| `WP03-ALL-BRAN-BUDS-R187-20261016-S03` | Metro Québec, [Céréales de son, All-Bran Buds](https://www.metro.ca/epicerie-en-ligne/allees/aliments-vegetariens-et-vegetaliens/garde-manger/cereales-de-son/p/064100000704) | Current indexed Québec product listing gives the local French title, Kellogg's product number `064100000704`, and 500 g package. The page returned 403 when opened in this review; use the indexed title as corroboration, not as nutrition or ingredient authority. |
| `WP03-ALL-BRAN-BUDS-R187-20261016-S04` | WK Kellogg Co Canada, [Simple Savoury Topping](https://www.wkkellogg.ca/en/recipes/simple-savoury-topping-recipe) | Manufacturer recipe lists 2 cups Buds or 2 cups All-Bran Original for that particular savory topping. Supports only a named recipe option; not general product equivalence or a transferable substitution ratio. |
| `WP03-BRAN-FLAKES-CEREAL-20261012-S04` (reuse) | WK Kellogg Co Canada, [All-Bran products, French](https://www.wkkellogg.ca/fr/nos-aliments/nos-marques/all-bran) | Existing ledger source. Lists the four distinct All-Bran product titles and supports the family-level picker boundary, not a generic formula or substitution. Do not create another source ID for this URL. |

## Reopen conditions

Reopen when the All-Bran family can be reviewed together, including the manufacturer-listed Buds, Original, Flakes, and frosted-bran products, or when picker behavior can return an All-Bran family choice without making Buds the sole child result. At that review, recheck current Canadian/Québec product pages and package labels, confirm whether sibling entries can be independently scoped, and rescan the current 114-recipe corpus. Keep the 28 g serving label-specific and the single topping option recipe-specific unless new evidence supports broader numeric or substitution behavior.
