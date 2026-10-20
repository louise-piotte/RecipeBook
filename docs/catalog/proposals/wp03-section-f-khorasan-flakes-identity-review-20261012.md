# WP03 Section F: Khorasan-flakes identity review

## Packet record

- **Reviewed:** 2026-10-12.
- **Status:** integrated on 2026-10-12. Added identity-only `ingredient-ref-khorasan-flakes` and its seven source entries plus accepted decision; broader Section F work remains open.
- **Scope:** one human-food grain product: plain Khorasan flakes.
- **Decision:** Added identity-only `ingredient-ref-khorasan-flakes` as `Khorasan flakes / flocons de khorasan`, category `GRAIN_AND_CEREAL`. Added no aliases, forms, measurements, density, unit mappings, conversions, yields, recipe links, or substitutions.
- **Evidence summary:** the current product catalogs of Québec manufacturer La Milanaise list the bilingual product names `Organic Khorasan Flakes` and `Flocons de khorasan biologiques`. A Québec retailer independently uses the French name for the same manufacturer SKU. OQLF pairs English `Khorasan wheat` with French `blé khorasan` and marks `Kamut` as a trademark, so `Kamut` is not proposed as a generic alias.

## Open item and prior coverage

The live plan still leaves the broader Section F identity and terminology work open ([plan lines 502–508](../../RecipeBook-global-ingredient-catalog-plan.txt#L506), [grains and processed cereals](../../RecipeBook-global-ingredient-catalog-plan.txt#L1950), [dry/cooked forms and regionally significant preprocessed grains](../../RecipeBook-global-ingredient-catalog-plan.txt#L2012)). The current progress checkpoint also says to continue Section F grains, processed cereals, and Québec terminology ([plan line 8238](../../RecipeBook-global-ingredient-catalog-plan.txt#L8509)). Khorasan flakes fit the still-open preprocessed-grain item.

This is not a repeat of the Khorasan-flour identity, the accepted wheat-flakes or triticale-flakes identities, or an earlier dedicated Khorasan-flakes review. The active `khorasan flour / farine de khorasan` row covers a milled product. The [spelt-flakes review](./wp03-section-f-spelt-flakes-identity-review-20261011.md) mentions Khorasan only as a separate sibling flake product. The [wheat-flakes review](./wp03-section-f-next-grains-gap-sweep-20261012.md) excludes a composite Khorasan cereal from the plain wheat-flakes identity; it does not review the single-grain Khorasan-flakes product. No prior proposal or ledger record reviews Khorasan flakes as its own product identity.

The intended identity is flakes made from Khorasan wheat as a single-grain cereal ingredient. It does not include Khorasan flour, generic wheat flakes, spelt flakes, puffed Khorasan, or multi-grain cereal blends that contain Khorasan. The product's organic status, brand, package size, recipe quantities, and product-specific preparation suggestions are not part of the proposed identity.

## Pre-integration package snapshot

Read-only snapshot of the shared package at review time:

| Surface | Count before integration | SHA-256 |
| --- | ---: | --- |
| Active ingredient references | 1,224 total; 109 `GRAIN_AND_CEREAL` | `cb5bc0962c77e97dcad944c6352ed933002dd6d2ea2c7ef9a578c6064c3f8fcf` |
| Ingredient forms | 86 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Seed-package manifest | 114 listed recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Research ledger | 1,523 records; 5,192 source entries; 4,255 distinct source IDs | `05223549fbf89b9e452282865ea1c551013d12f5d3a4214fa5d8792c984732fb` |
| Legacy import identities | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |

The manifest-listed recipe files contain 1,123 ingredient rows and 752,942 bytes in total. Their manifest-order content digest (relative path, NUL, raw file bytes, NUL) is `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622`. Counts and hashes are a point-in-time snapshot, not proposed data.

## Exact-key ownership and recipe audit

The audit compared normalized candidate phrases using the repository's `normalize_search_key` implementation in `tools/seed_package/bundled_seed_package.py`; it folds case and accents, normalizes ligatures, and maps punctuation runs to spaces. It checked the active reference names and aliases, form names and search terms, all legacy import candidates, the ledger, and all recipe JSON named by the current manifest.

| Surface | Result before integration |
| --- | --- |
| Active ingredient references | No exact normalized name or alias owner for `Khorasan flakes`, `Khorasan flake`, `Organic Khorasan Flakes`, `flaked Khorasan`, `Khorasan wheat flakes`, `flocons de khorasan`, `flocon de khorasan`, `flocons de khorasan biologiques`, `flocons de blé khorasan`, or `flocons de blé khorasan biologiques`. Proposed ID `ingredient-ref-khorasan-flakes` is unallocated. The only active Khorasan reference is `ingredient-ref-khorasan-flour` (`khorasan flour / farine de khorasan`) with no aliases; it is a separate milled product. Do not alias the bare word `Khorasan` to either row. |
| Ingredient forms | 86 forms; no name or search term contains Khorasan- or Kamut-flake wording. |
| Legacy import identities | 66 candidates; no exact Khorasan-flakes phrase or proposed ID. |
| Research ledger | No Khorasan-flakes candidate ID, exact product phrase, or dedicated review. Related text is limited to the Khorasan-flour record and incidental sibling-product context in the prior spelt-flakes and wheat-flakes reviews cited above. |
| Bundled recipe corpus | All 114 manifest-listed files were searched for Khorasan/Kamut and the candidate phrases. No file or ingredient row has a matching product phrase, and none uses the proposed ID. The corpus has 1,123 ingredient rows total. |

This is an exact-key and corpus-text audit, not a live picker test. No recipe relinking, form, measure, conversion, yield, or substitution is justified by the current package.

## Name and product boundaries

| Proposed field or boundary | Recommendation | Evidence and limit |
| --- | --- | --- |
| English display | `Khorasan flakes` | The manufacturer lists `Organic Khorasan Flakes`. Remove the SKU's organic qualifier from the generic food identity. |
| Québec French display | `flocons de khorasan` | La Milanaise's current French catalog and recipe use this phrase. OQLF supports the base term `blé khorasan`; product sources also use `flocons de blé khorasan` in the ingredient description. The shorter display follows the manufacturer's established product wording. |
| Category | `GRAIN_AND_CEREAL` | This is a processed cereal product made from a named wheat grain, parallel to the existing species-specific grain-flake rows. |
| Aliases | None | Keep product wording such as `organic`, `biologique`, `flaked Khorasan`, and the ingredient-panel wording as source evidence only. Do not add `Kamut` or `blé Kamut`: OQLF marks these as trademarks. |
| Khorasan flour | Keep separate | `ingredient-ref-khorasan-flour` names a milled product. Flakes are a different product identity; no form, conversion, or substitution relation is established. |
| Wheat and other grain flakes | Keep separate | Do not map Khorasan flakes to generic wheat flakes, spelt flakes, or any other species' flakes. Grain-specific flake products already have their own identities. |
| Composite cereals | Exclude | La Milanaise lists Khorasan flakes separately from multigrain flakes and describes its multigrain product as a blend of oats, barley, wheat, rye, and Khorasan. Do not treat that composite title or formula as a Khorasan-flakes alias. |
| Processing, organic status, brand | Unspecified in runtime data | A cited retailer describes a particular product as grain rolled flat; the manufacturer calls its commercial SKU organic. Neither wording justifies a global whole-grain, steamed, precooked, organic, or brand-specific qualifier. |

## Numeric data, recipes, and substitutions

| Data area | Recommendation |
| --- | --- |
| Forms | Add none. Sources identify flakes as a product but do not establish a general raw, steamed, cooked, quick-cooking, or ready-to-eat form. |
| Density and unit mappings | Leave unset. A Québec recipe uses one cup (250 ml) of the flakes in that recipe but gives no corresponding weight. This is not density or a general household-volume mapping. |
| Measurements and conversions | Add none. Do not transfer a recipe-specific quantity, package size, or product serving to the catalog. |
| Package yields | Add none. The listed 500 g retail pack is a net package size, not a yield. |
| Recipe links | Add none. No manifest-listed recipe uses the candidate phrase. The external recipe cited below is evidence of food use, not a bundled recipe link. |
| Substitutions | Add no rule. A manufacturer comparison to oat flakes is product-specific and supplies no validated recipe scope or ratio. |

## Source register

Sources were checked on 2026-10-12. These IDs were proposal-local during review, checked for collisions, and have since been added to the new Khorasan-flakes ledger record.

| Source ID | Source | Evidence and limits |
| --- | --- | --- |
| `WP03-KHORASAN-FLAKES-20261012-S01` | [OQLF, Grand dictionnaire terminologique — blé khorasan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26533000/ble-khorasan) | Québec terminology authority gives French `blé khorasan`, English `Khorasan wheat`, and the taxon *Triticum turanicum*. It lists `blé Kamut`, `Kamut`, and English `Kamut wheat` as trademarks. This supports the base bilingual grain name and excludes the trademark from generic aliases; it does not name the flaked product. |
| `WP03-KHORASAN-FLAKES-20261012-S02` | [La Milanaise — Nos produits (French)](https://lamilanaise.com/nos-produits/) | Current Québec manufacturer catalog lists `Flocons de khorasan biologiques` under organic flakes, alongside oat, spelt, barley, rye, and multigrain flakes. This directly supports the French product wording and a separate Khorasan flake product; the organic qualifier is SKU-specific. |
| `WP03-KHORASAN-FLAKES-20261012-S03` | [La Milanaise — Our products (English)](https://lamilanaise.com/en/organic-products/) | Current manufacturer catalog lists `Organic Khorasan Flakes` separately among grain flakes. This directly supports the English product wording; it does not establish organic status as a generic identity. |
| `WP03-KHORASAN-FLAKES-20261012-S04` | [La Milanaise — Organic Khorasan Flakes](https://lamilanaise.com/en/produits/organic-khorasan-flakes/) | Manufacturer product page names the product `Organic Khorasan Flakes`, categorizes it as organic flakes, and lists product-specific uses and a 500 g format. The format and uses describe this retail SKU only. |
| `WP03-KHORASAN-FLAKES-20261012-S05` | [Metro Québec — Flocons de khorasan biologique, La Milanaise, product 627062203455](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/farines-et-essentiels-de-cuisson/flocons-de-khorasan-biologique/p/627062203455) | Québec French retail listing uses `Flocons de khorasan biologique`, identifies La Milanaise and the 500 g product number, and reports Khorasan as its ingredient. The listing showed out of stock when retrieved; it is naming and product-identity evidence, not an availability claim. |
| `WP03-KHORASAN-FLAKES-20261012-S06` | [La Milanaise — Carrés aux framboises](https://lamilanaise.com/recette/carres-aux-framboises/) | Québec recipe page uses `1 tasse (250 ml) de flocons de khorasan` in a raspberry-square recipe. This confirms French culinary use. Its amount is recipe-specific and gives no weight conversion. |
| `WP03-KHORASAN-FLAKES-20261012-S07` | [La Milanaise — Organic flakes category](https://lamilanaise.com/en/categorie-produits/organic-flakes/) | Manufacturer describes the Khorasan-flake product separately and identifies its `Organic Multigrain Flakes` as a blend of oats, barley, wheat, rye, and Khorasan. This supports excluding composite flakes from the proposed single-grain identity. |

## Decision

Added identity-only `ingredient-ref-khorasan-flakes` as **`Khorasan flakes / flocons de khorasan`** in `GRAIN_AND_CEREAL`. The manufacturer’s current bilingual catalog and Québec retail wording establish a distinct human-food flake product; OQLF supports the underlying bilingual Khorasan name and prevents treating `Kamut` as a generic alias. The entry has no aliases, forms, numeric behavior, recipe links, or substitutions. The Khorasan-flour identity and all other grain-flake products remain separate. The broader Section F checklist remains open.
