# WP03 Section F: bran-flakes cereal identity review

## Packet record

- **Reviewed:** 2026-10-12.
- **Status:** accepted and integrated as an identity-only `GRAIN_AND_CEREAL` reference.
- **Scope:** one human-food, bran-flakes breakfast cereal product class.
- **Recommendation:** add identity-only `ingredient-ref-bran-flakes-cereal` as **`bran flakes cereal / céréales de son en flocons`** in `GRAIN_AND_CEREAL`.
- **Evidence summary:** the current Canadian manufacturer product page names the English product `All-Bran Flakes® Cereal`; its current Québec French product page names `Céréales All-Bran Flakes®` and lists whole wheat, wheat bran, sugars, salt, and fortification. A Québec retailer uses the non-brand French product wording `Céréales de son en flocons` for that All-Bran product. These sources support a distinct cereal identity and bilingual display. They do not establish a universal recipe for every bran-flakes cereal.
- **Data scope:** add no aliases, forms, density, unit mappings, measurements, conversions, yields, recipe links, or substitutions. Keep brand names and product-specific ingredient proportions out of runtime data.

## Root integration

Added identity-only `ingredient-ref-bran-flakes-cereal` with the display pair
`bran flakes cereal / céréales de son en flocons` in `GRAIN_AND_CEREAL`. Kept the
wheat-bran fraction, wheat flakes, and branded or formulated cereal products separate. Added no
aliases, forms, numeric behavior, recipe links, or substitutions. The post-integration snapshot and
static checks are recorded in the
[integration README](../batches/wp03-section-f-bran-flakes-cereal-identity-integration-20261012/README.md).

## Open checklist and prior coverage

The live Section F checklist still leaves regional cereal mixes and preprocessed grains open at [plan line 1921](../../RecipeBook-global-ingredient-catalog-plan.txt#L2014); the broader identity and terminology review remains open at [line 506](../../RecipeBook-global-ingredient-catalog-plan.txt#L506) and in the latest continuation checkpoint at [line 8394](../../RecipeBook-global-ingredient-catalog-plan.txt#L8675). Bran-flakes cereal is a separate prepared cereal product, distinct from the wheat grain flakes and bran milling-fraction references already present.

No earlier proposal or ledger record is a dedicated bran-flakes cereal review. The [wheat-flakes identity review](./wp03-section-f-next-grains-gap-sweep-20261012.md) explicitly leaves bran flakes outside its scope. The [sorghum-flakes review](./wp03-section-f-next-grain-product-review-20261011.md) also lists bran flakes only as an excluded sibling product. The [Graham-flour review](./wp02-a4-graham-flour-identity-boundary-review-20261011.md) mentions ground bran flakes as part of a different flour definition. These mentions do not assess bran-flakes cereal as an ingredient identity.

## Pre-integration package snapshot

Read-only snapshot of the shared package when the ownership and recipe audit was run:

| Surface | Count | SHA-256 |
| --- | ---: | --- |
| Active ingredient references | 1,225 total; 110 `GRAIN_AND_CEREAL` | `c6a949abe54b0598fa9db207aad047a51ecb2fdfac72d689bf4454c70bae141e` |
| Ingredient forms | 86 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Seed-package manifest | 114 listed recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Research ledger | 1,524 records; 5,203 source entries; 4,266 distinct source IDs | `b21803cad548fec3e0ed94ceeced3eea072c2e96b393393dfe3c5d29e81e7433` |
| Legacy import identities | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |

The 114 manifest-listed recipe files contain 1,123 ingredient rows and 752,942 bytes. Their manifest-order content digest (relative path, NUL, raw file bytes, NUL) is `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622`. This is a point-in-time snapshot, not proposed data.

## Exact-key ownership and recipe audit

Candidate wording was normalized with the repository's `normalize_search_key` implementation in `tools/seed_package/bundled_seed_package.py` (case-folding, accent and ligature folding, and punctuation-to-space normalization). The audit checked exact candidate keys and the proposed ID across active reference names and aliases, form labels and search terms, legacy candidates, and ledger text. Candidate wording included `bran flakes`, `bran flake`, `bran flakes cereal`, `All-Bran Flakes`, `céréales de son en flocons`, `céréale de son en flocons`, `céréales de flocons de son`, and `flocons de son`.

| Surface | Result before integration |
| --- | --- |
| Active ingredient references | No exact normalized name or alias owns the candidate wording. Proposed ID `ingredient-ref-bran-flakes-cereal` is unallocated. Nearby identities include `ingredient-ref-wheat-bran` (`wheat bran / son de blé`), `ingredient-ref-wheat-flakes` (`wheat flakes / flocons de blé`), and `ingredient-ref-corn-flakes` (`corn flakes / flocons de maïs`); none names the formulated bran-flakes cereal product. |
| Ingredient forms | No exact candidate wording in the 86 form names or search terms. |
| Legacy import identities | No exact candidate name, alias, or proposed ID among 66 candidates. |
| Research ledger | No exact candidate key, candidate ID, or dedicated bran-flakes cereal review. Incidental mentions occur in the Graham-flour record, which discusses ground bran flakes in its product definition, and the wheat-flakes record, which cites a withdrawn historical cereal standard distinguishing bran flakes from wheat flakes. Neither is a bran-flakes cereal decision. |
| Bundled recipe corpus | All 114 manifest-listed recipe JSON files and all 1,123 ingredient rows were scanned for the candidate phrase set and proposed ID. No file or ingredient row matched. |

The recipe search covered raw file text as well as ingredient rows. No recipe relinking is justified. This is an exact-key and corpus-text audit, not a live picker test.

## Identity and boundaries

| Proposed field or boundary | Recommendation | Evidence and limit |
| --- | --- | --- |
| English display | `bran flakes cereal` | The Canadian manufacturer uses `All-Bran Flakes® Cereal`. The generic display removes the product brand and marks a food category; the product page does not define one universal formula. |
| Québec French display | `céréales de son en flocons` | This is the Québec retailer's product description for the All-Bran flakes listing. The manufacturer also uses `Céréales All-Bran Flakes®` on its Québec-facing French product page. |
| Category | `GRAIN_AND_CEREAL` | A prepared breakfast cereal product, separate from grain flakes and bran as a milling fraction. |
| Aliases | None | Product and brand wording establishes the display pair but does not justify extra generic or branded search aliases. |
| Wheat bran | Keep separate | `wheat bran / son de blé` is a milling fraction. The cited cereal product contains wheat bran along with whole wheat and other ingredients. |
| Wheat flakes and other single-grain flakes | Keep separate | The cereal is a formulated breakfast product; it is not a synonym or form of wheat flakes, rye flakes, or another grain-specific flake identity. |
| Frosted, raisin, nugget, or composite cereals | Exclude | The manufacturer’s French product list names standard All-Bran Flakes separately from frosted bran flakes, All-Bran Original, and All-Bran Buds. This proposal does not merge those products or establish their ingredient equivalence. |
| Brand and recipe | Exclude from identity | `All-Bran` is the source product brand. Its specific ingredients and proportions are product evidence, not universal requirements for the generic cereal identity. |

## Numeric data and recipe behavior

| Data area | Recommendation |
| --- | --- |
| Forms | Add none. Product pages establish a cereal product, not separate dry/cooked or other catalog forms. |
| Density and unit mappings | Leave unset. |
| Measurements and conversions | Add none. The manufacturer gives a product-specific nutrition serving; it is not a default recipe portion or conversion. |
| Package sizes or yields | Add none. Listed retail pack sizes describe specific products only. |
| Recipe links | Add none. The bundled manifest corpus has no candidate match. |
| Substitutions | Add no rule. No contextual replacement evidence was reviewed. |

## Source register

Sources were checked on 2026-10-12. The four proposal-local source IDs below were checked absent from the shared ledger and all existing proposal files before writing.

| Source ID | Source | Evidence and limits |
| --- | --- | --- |
| `WP03-BRAN-FLAKES-CEREAL-20261012-S01` | WK Kellogg Co Canada, [All-Bran Flakes® Cereal](https://www.wkkellogg.ca/en/products/all-bran-flakes-cereal-product) | Current Canadian manufacturer page gives the exact English branded product name and describes whole grain wheat, wheat bran, sugars, salt, and fortification. The 34 g serving and listed package sizes are product-specific label information, not proposed catalog values. |
| `WP03-BRAN-FLAKES-CEREAL-20261012-S02` | WK Kellogg Co Canada, [Céréales All-Bran Flakes®](https://www.wkkellogg.ca/fr/produits/cereales-all-bran-flakes-product) | Current Québec-facing French product page gives the French branded product name, describes the cereal, lists ingredients in French, and shows Québec retail channels. It supports the French product identification but not a generic recipe. |
| `WP03-BRAN-FLAKES-CEREAL-20261012-S03` | Super C Québec, [Céréales de son en flocons format familial, All-Bran](https://www.superc.ca/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-de-son-en-flocons-format-familial/p/059724101760) | Current Québec retail listing names the product `Céréales de son en flocons`, identifies All-Bran and product 059724101760, and gives the ingredient panel. The selected store listing reports pickup availability only; no province-wide availability claim is made. |
| `WP03-BRAN-FLAKES-CEREAL-20261012-S04` | WK Kellogg Co Canada, [All-Bran® products, French](https://www.wkkellogg.ca/fr/nos-aliments/nos-marques/all-bran) | Current French brand page lists `Céréales All-Bran Flakes®` separately from `Céréales All-Bran Original®`, `Céréales All-Bran Buds®`, and `Flocons de son givrés All-Bran®`. This supports maintaining separate product boundaries; it does not establish equivalence among them. |

## Recommendation

Add identity-only **`ingredient-ref-bran-flakes-cereal`**, displayed as **`bran flakes cereal / céréales de son en flocons`** in `GRAIN_AND_CEREAL`. This captures a documented human-food cereal product with Canadian English and Québec French naming. Keep the active wheat-bran and wheat-flakes identities unchanged, and do not add aliases, forms, numeric behavior, recipe links, or substitutions. The broader Section F checklist remains open.

## Remaining Section F gaps

This review does not close Section F. The live plan still lists unqualified farro, generic sushi rice, pearled hominy, pozole corn, and other unresolved grain products; generic grits and polenta, dried sweet corn, and puffed-grain candidates also remain unresolved or held. Dry/cooked forms remain open where recipes or measurements require them. Regionally significant cereal mixes and preprocessed grains still need review, as does independent Québec terminology approval for open names such as pot barley. See the live checklist at [plan lines 506 and 1857–1921](../../RecipeBook-global-ingredient-catalog-plan.txt#L506).

## Review limits

The original proposal changed no shared files. Root's reconciliation added the identity-only
reference and ledger decision, refreshed the generated index, and updated the plan and roadmap. No
tests or emulator checks were run for this database-JSON-only addition.
