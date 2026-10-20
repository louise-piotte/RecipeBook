# WP02/WP03/WP04 R761–R763 integration

## Integrated reviews

- **R761 — black fonio flour:** Updated the existing `ingredient-ref-black-fonio-flour` ledger record with two primary studies and one `blocked_pending_evidence` finding. Malomo et al. describe fermented Acha and Iburu flours as a broad wheat alternative for snack production, but give no snack formula or replacement amount. Babarinde et al. test fonio/pigeon-pea blends and breakfast food, not wheat-flour replacement. No active rule, measure, recipe link, or catalog field was added; measurement research remains open.
- **R762 — Post Shredded Wheat & Bran Spoon Size:** Added identity-only `ingredient-ref-post-shredded-wheat-bran-spoon-size` as `Post Shredded Wheat & Bran Spoon Size / Shredded Wheat Spoon Size Wheat & Bran de Post`, with the retailer-description alias `céréales Shredded Wheat & Bran`. Kept it separate from plain shredded wheat, wheat bran, bran flakes, and Post Shreddies. Added no forms, observations, measures, conversions, yields, recipe links, or substitutions. Serving and transferable-measure research remains open.
- **R763 — whole brook trout:** Added `ingredient-form-brook-trout-whole-fish` under the existing `ingredient-ref-brook-trout` as `whole brook trout / omble de fontaine entier`. Raymer’s paired buyer pages distinguish table-market whole portions from live stocking fish. Treated “portion” and the 350–900 g average market-size range as non-measures; added no temperature or cleaning state, recipe link, conversion, yield, or substitution.

The broader A6, Section F, and Section P plan items remain open.

## Evidence and boundaries

- The [2020 Springer study](https://link.springer.com/article/10.1007/s13197-020-04393-7) tests black-fonio and pigeon-pea flour blends and breakfast-food formulations; it does not test wheat-flour replacement.
- The [2024 Ife Journal study](https://ijt.oauife.edu.ng/index.php/ijt/article/view/223) studies fermented Acha and Iburu flours separately; its abstract gives no snack recipe or replacement proportion.
- Post Consumer Brands Canada lists the [English product](https://www.postconsumerbrands.ca/brand/shredded-wheat/products/original-wheat-bran-spoon-size/) and [Canadian French product](https://www.postconsumerbrands.ca/fr-ca/marques/shredded-wheat-fr/produits/loriginal-spoon-size-wheat-et-bran/) with the exact product headings and 525 g package size.
- The [Super C Québec listing](https://www.superc.ca/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-de-ble-de-grains-entiers-avec-fibres/p/628154011323) identifies the 525 g product and its whole-grain wheat and wheat-bran ingredients. Its description supports the narrow alias `céréales Shredded Wheat & Bran`; its wording is not treated as a terminology ruling.
- Raymer Aquaculture’s paired [French buyer page](https://raymeraquaculture.ca/pourquoi-acheter-lomble-signe-raymer-aquaculture-2/) and [English buyer page](https://raymeraquaculture.ca/pourquoi-acheter-lomble-signe-raymer-aquaculture/) identify brook trout as whole portions for the table market and separately live for stocking. Its [technical sheet](https://raymeraquaculture.ca/fiche-technique-omble-de-fontaine/) identifies *Salvelinus fontinalis* and gives a 350–900 g average consumption-market size; that range does not establish portion weight or a kitchen measure.

Full evidence and ownership checks are in the [R761 proposal](../../proposals/wp02-a6-next-gap-review-r761-20261018.md), [R762 proposal](../../proposals/wp03-section-f-next-gap-review-r762-20261018.md), and [R763 proposal](../../proposals/wp04-section-p-next-open-gap-review-r763-20261018.md). Source records and the accepted decisions are in [research-ledger.v1.json](../../research-ledger.v1.json).

## Catalog and picker impact

After R761–R763 the bundled package contains **1,850 references** (283 in `GRAIN_AND_CEREAL`) and **186 forms**. The research ledger contains **2,245 records**, **10,539 source entries**, **8,893 distinct source IDs**, and **7,540 distinct source URLs**. R761–R763 add eight distinct source IDs and eight distinct source URLs. The generated reference index contains 1,850 entries.

R761 does not change picker results. R762 has these static phrase-first search effects:

| Query | Before | After | Effect |
| --- | ---: | ---: | --- |
| `Post Shredded Wheat & Bran Spoon Size` | 0 | 1 | Exact English product title. |
| `Shredded Wheat Spoon Size Wheat & Bran de Post` | 0 | 1 | Exact manufacturer French product title. |
| `céréales Shredded Wheat & Bran` | 0 | 1 | Exact Québec retailer-description phrase. |
| `shredded wheat` | 1 | 2 | Plain cereal and named wheat-and-bran product. |
| `shredded wheat cereal` | 1 | 1 | Remains on the existing plain cereal. |
| `blé filamenté` | 1 | 1 | Remains on the existing plain cereal. |
| `bran flakes` | 3 | 3 | Existing bran-flake results stay scoped. |
| `bran` | 14 | 15 | Adds the named product to the broad partial search. |
| `cereal` / `céréales` | 77 / 73 | 77 / 74 | The French retailer phrase adds one broad French result. |

These counts are a static projection from current reference and form search terms; no Android picker test was run.

R763 has these static phrase-first search effects:

| Query | Before | After | Effect |
| --- | ---: | ---: | --- |
| `whole brook trout` | 0 | 1 | Exact English form label selects brook trout and supplies the form hint. |
| `omble de fontaine entier` | 0 | 1 | Exact French form label selects the same identity and supplies the form hint. |
| `trout`; `truite` | 7; 6 | 7; 6 | Existing species-level result sets are unchanged. |
| `whole fish`; `poisson entier` | 1; 1 | 1; 1 | Generic whole-fish searches remain unchanged. |
| `whole`; `entier` | 51; 24 | 52; 25 | Each broad presentation query adds brook trout and remains multi-result. |
| `whole trout`; `fresh whole` | 0; 8 | 0; 8 | No generic or fresh-state phrase is added. |

## Recipe corpus

The manifest lists **114 recipe files** and **1,123 structured ingredient rows**. Full scans found no candidate-specific recipe text or reference link for black fonio flour, Post Shredded Wheat & Bran Spoon Size, or brook trout. No bundled recipe was changed or linked.

## Files updated

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json`
- `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt` (regenerated from the reference JSON)
- `docs/catalog/research-ledger.v1.json`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`

## Static validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` passed; the bundled package and research-ledger schema are valid and normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed with 1,850 references.
- Exact ownership for the new source IDs and URLs, reference/form/ledger record-key uniqueness, JSON ASCII escaping, UTF-8 without BOM, recipe-corpus demand, picker projection, and scoped whitespace checks passed.
- No software tests, build, emulator run, or deployment were run because the active catalog changes only add database JSON data under `AGENTS.md`.
