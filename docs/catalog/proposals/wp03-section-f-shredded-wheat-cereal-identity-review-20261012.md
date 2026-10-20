# WP03 Section F: shredded-wheat cereal identity review

## Packet record

- **Reviewed:** 2026-10-12.
- **Status:** integrated on 2026-10-12 after root source and ownership review. Added identity-only `ingredient-ref-shredded-wheat-cereal` plus five source entries and the accepted decision; broader Section F coverage remains open.
- **Scope:** one ready-to-eat wheat cereal made by forming wheat into filaments, represented by the plain shredded-wheat cereal class.
- **Decision:** accepted and integrated identity-only `ingredient-ref-shredded-wheat-cereal` as **`shredded wheat cereal / blé filamenté`** in `GRAIN_AND_CEREAL`.
- **Evidence summary:** current Post Consumer Brands Canada pages sell original shredded-wheat cereal, including a Canadian-prepared one-ingredient wheat product. Health Canada's current Canadian Nutrient File pairs the ready-to-eat cereal name with `blé filamenté`; Québec.ca also uses `blé filamenté` as a breakfast-cereal example, and Usito defines the term as wheat formed into filaments and generally eaten as breakfast cereal. Together these support a distinct cereal identity and Québec French name. Product-specific shape, package and serving data are not generalized.
- **Data scope:** add no aliases, forms, density, unit mappings, measurements, conversions, yields, recipe links, or substitutions.

## Open checklist and prior coverage

The live Section F checklist leaves regional cereal mixes and preprocessed grains open at [plan line 1921](../../RecipeBook-global-ingredient-catalog-plan.txt#L2014). The broader identity and terminology review remains open at [line 506](../../RecipeBook-global-ingredient-catalog-plan.txt#L506), and grits, polenta, pearled hominy, pozole corn, dried sweet corn, and remaining puffed-grain candidates remain listed at [line 1857](../../RecipeBook-global-ingredient-catalog-plan.txt#L1950).

No earlier proposal, active reference, or ledger record is a dedicated shredded-wheat cereal review. The [puffed-wheat review](./wp03-section-f-next-residual-identities-20261010.md) mentions shredded wheat only as a sibling ready-to-eat cereal in an archived food-code comparison. The corresponding [integration note](../batches/wp03-puffed-wheat-identity-integration-20261010/README.md) retains the same incidental comparison; neither makes a shredded-wheat decision. This packet addresses that separate preprocessed wheat product only.

## Pre-review package snapshot

Read-only snapshot of the shared package when the exact-key and recipe audit was run:

| Surface | Count | SHA-256 |
| --- | ---: | --- |
| Active ingredient references | 1,226 total; 111 `GRAIN_AND_CEREAL` | `4946cf6b6256f8d1ef2714ee534ebad44f02d29bdfbf0dfa84f20146a133220f` |
| Ingredient forms | 86 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Seed-package manifest | 114 listed recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Research ledger | 1,525 records; 5,212 source entries; 4,275 distinct source IDs | `6954a3784dfff117b9ab926914123af8a503e32c18aee5ea7f90859ba115e953` |
| Legacy import identities | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |

The 114 manifest-listed recipe files contain 1,123 ingredient rows and 752,942 bytes. Their manifest-order content digest (relative path, NUL, raw file bytes, NUL) is `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622`. This is a point-in-time snapshot, not proposed data.

## Exact-key ownership and recipe audit

Candidate wording was normalized with the repository's `normalize_search_key` implementation in `tools/seed_package/bundled_seed_package.py` (case-folding, accent and ligature folding, and punctuation-to-space normalization). The audit checked the proposed ID and these candidate phrases: `shredded wheat`, `shredded wheat cereal`, `shredded wheat biscuit(s)`, `Original Shredded Wheat`, `Spoon Size Shredded Wheat`, `wheat biscuit cereal`, `blé filamenté`, `céréales de blé filamenté`, `céréale de blé filamenté`, and `biscuits de blé filamenté`.

| Surface | Result before integration |
| --- | --- |
| Active ingredient references | No exact normalized name or alias owns the candidate phrases. Proposed ID `ingredient-ref-shredded-wheat-cereal` is unallocated. Nearby active products include wheat berries, cracked wheat, wheat flakes, puffed wheat, and the newly integrated bran-flakes cereal; none is a name, alias, form, or equivalent of shredded-wheat cereal. |
| Ingredient forms | No exact candidate name or search term among the 86 forms. |
| Legacy import identities | No exact candidate name, alias, or proposed ID among 66 candidates. |
| Research ledger | No candidate ID or dedicated shredded-wheat cereal record. One incidental archived-classification sentence in the puffed-wheat record refers to “shredded-wheat cereal” while comparing cereal classes; it is not a product identity decision. |
| Bundled recipe corpus | All 114 manifest-listed recipe JSON files and all 1,123 ingredient rows were scanned for the candidate phrases, common hyphenation, and proposed ID. No file or ingredient row matched. |

The recipe search covered raw file text as well as ingredient rows. No recipe relinking is justified. This is an exact-key and corpus-text audit, not a live picker test.

## Identity and boundaries

| Proposed field or boundary | Recommendation | Evidence and limit |
| --- | --- | --- |
| English display | `shredded wheat cereal` | Post Consumer Brands Canada names the product `Shredded Wheat` and describes it as a cereal. This display names the product class without taking a brand name as a generic alias. |
| Québec French display | `blé filamenté` | Health Canada's bilingual food name and current Québec.ca usage use this term for the cereal; Usito defines it as wheat processed into filaments and generally eaten at breakfast. |
| Category | `GRAIN_AND_CEREAL` | This is a ready-to-eat preprocessed wheat cereal, distinct from wheat grain, flour, meal, flakes, and puffed wheat. |
| Aliases | None | The direct English and Québec French displays are supported. No additional synonyms or branded terms are proposed. |
| Bran-added and frosted variants | Keep outside this plain identity | Post Canada lists Original Big Biscuit, Original Spoon Size, and Spoon Size Shredded Wheat & Bran as separate cereal varieties. Do not equate the bran-added product or other altered variants with the plain identity. |
| Wheat flakes, bran flakes, puffed wheat, and cracked wheat | Keep separate | Existing identities describe other processed products. Usito directly distinguishes `blé filamenté` from `blé soufflé`; Post's plain product is identified as shredded wheat, not a flaked or puffed cereal. |
| Whole-grain content | Do not encode as a universal qualifier | Post's plain product is described as 100% whole grain wheat; this supports the cited product, not every possible cereal sold as shredded wheat. |
| Biscuit size and preparation | Do not encode | Big Biscuit and Spoon Size are product formats. They do not establish separate generic identities, ingredient forms, or recipe conversions. |

## Numeric data and recipe behavior

| Data area | Recommendation |
| --- | --- |
| Forms | Add none. Ready-to-eat describes the product class; no separate runtime form is required by this review. |
| Density and unit mappings | Leave unset. |
| Measurements and conversions | Add none. Health Canada's serving page lists a 25 g Post biscuit; that product-specific serving is not a default recipe portion or conversion. |
| Package sizes or yields | Add none. The manufacturer’s package sizes describe current product SKUs only. |
| Recipe links | Add none. The bundled manifest corpus has no candidate match. |
| Substitutions | Add no rule. No contextual replacement evidence was reviewed. |

## Source register

Sources were checked on 2026-10-12. The five proposal-local source IDs below were checked absent from the shared ledger and all existing proposal files before writing.

| Source ID | Source | Evidence and limits |
| --- | --- | --- |
| `WP03-SHREDDED-WHEAT-20261012-S01` | Post Consumer Brands Canada, [Shredded Wheat Cereal](https://www.postconsumerbrands.ca/brand/shredded-wheat/) | Current Canadian manufacturer page names `Shredded Wheat` cereal and lists the product range as Original Big Biscuit, Original Spoon Size, and Spoon Size Shredded Wheat & Bran. The overview identifies the original product as made from whole grain wheat. It does not make the bran variant equivalent to the original. |
| `WP03-SHREDDED-WHEAT-20261012-S02` | Post Consumer Brands Canada, [Original Spoon Size](https://www.postconsumerbrands.ca/brand/shredded-wheat/products/original-spoon-size/) | Current specific product page identifies Original Spoon Size as prepared in Canada and describes it as one ingredient, 100% whole grain wheat. The 525 g package is SKU-specific and not proposed as catalog data. |
| `WP03-SHREDDED-WHEAT-20261012-S03` | Health Canada, Canadian Nutrient File, [Cereal, ready to eat, Shredded Wheat, Post](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=1279) | Current bilingual food entry pairs English `Cereal, ready to eat, Shredded Wheat, Post` with French `Céréale, prête-à-manger, blé filamenté, Post`. The listed 25 g biscuit serving is not transferred to the catalog. |
| `WP03-SHREDDED-WHEAT-20261012-S04` | Gouvernement du Québec, [Allergènes et leurs différentes appellations](https://www.quebec.ca/sante/alimentation/allergies-alimentaires/allergenes-differentes-appellations) | The Québec page, updated 2026-02-16, includes `blé filamenté` in its examples of breakfast cereals. This is current local usage evidence, not a process specification. |
| `WP03-SHREDDED-WHEAT-20261012-S05` | Usito, Université de Sherbrooke, [blé](https://usito.usherbrooke.ca/d%C3%A9finitions/bl%C3%A9) | Defines `blé filamenté` as wheat grains ground and transformed into filaments, generally eaten as breakfast cereal, and distinguishes it from `blé soufflé`. This directly supports the product boundary and French term. |

## Recommendation

Add identity-only **`ingredient-ref-shredded-wheat-cereal`**, displayed as **`shredded wheat cereal / blé filamenté`** in `GRAIN_AND_CEREAL`. Current Canadian product evidence and independent Québec lexical and government usage support a distinct wheat cereal product and its French name. Keep wheat flakes, puffed wheat, bran flakes, and wheat grain identities separate; add no aliases, forms, numeric behavior, recipe links, or substitutions. The broader Section F checklist remains open.

## Remaining Section F gaps

This review does not close Section F. The live plan still lists unqualified farro, generic sushi rice, pearled hominy, pozole corn, and other unresolved grain products. Generic grits and polenta, dried sweet corn, and the puffed-teff, puffed-rye, and puffed-corn candidates also remain held or unresolved. Dry/cooked forms remain open where recipes or measurements require them. Regional cereal mixes and preprocessed grains still need further coverage, and independent Québec review remains open for terms such as pot barley / `orge en pot`. See the active checklist at [plan lines 506 and 1857–1921](../../RecipeBook-global-ingredient-catalog-plan.txt#L506).

## Integration record

Added the identity-only reference and accepted ledger decision with five source records. No aliases,
forms, measurements, conversions, yields, recipe links, or substitutions were added. The complete
114-recipe / 1,123-row scan found no match. Package validation, normalized-reference check, generated
catalog check, ledger validation, exact-key ownership, recipe scan, UTF-8/no-BOM, and scoped whitespace
checks passed. No tests or emulator checks were run because this change only adds database JSON data
under `AGENTS.md`. See `../batches/wp03-section-f-shredded-wheat-cereal-integration-20261012/README.md`.
