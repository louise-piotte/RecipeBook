# WP05 Section W Korean kimchi and jeotgal identity integration — 2026-10-12

## Catalog decision

- Added `ingredient-ref-kkakdugi`, displayed as `kkakdugi / kkakdugi`, with the narrow Canadian seller descriptors `cubed radish kimchi` and `kimchi de radis coupés en dés`. Category: `SAUCE_AND_CONDIMENT`.
- Added `ingredient-ref-saeu-jeot`, displayed as `saeu-jeot (salted shrimp) / saeu-jeot (crevettes coréennes fermentées au sel)`, with the official romanization variant `saeujeot` as an English alias. The French parenthetical is a descriptive translation; OQLF supports its component vocabulary but does not standardize a product name for saeujeot.
- Kept both identities separate from generic kimchi, salt-and-vinegar pickled radish, takuan, fish sauce, anchovy products, and regional seafood pastes.
- Held other named kimchi types, generic `fermented shrimp`, unqualified `jeotgal`, and other named jeotgal for separate product and locale review. The Korean food standard defines jeotgal broadly across seafood substrates and distinguishes fermented, seasoned, and liquid product types.
- The full bundled recipe scan found no mentions or exact ingredient rows for either new identity. Existing fish-sauce links in recipes 093 and 095 remain unchanged. No recipe links, forms, measurements, density, unit mappings, yields, conversions, or substitutions were added.

## Sources

The identity evidence is recorded on the two ingredient-reference records in `docs/catalog/research-ledger.v1.json`.

| Source ID | Evidence |
|---|---|
| `WP05-W-KIMCHI-JEOTGAL-20261012-S01`–`S02` | OQLF, [kimchi (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529902/kimchi), for the generic identity boundary; Republic of Korea Ministry of Agriculture, Food and Rural Affairs, [named kimchi examples](https://www.mafra.go.kr/bbs/english/25/566510/artclView.do?layout=unknown), for distinctions among named types. |
| `WP05-W-KIMCHI-JEOTGAL-20261012-S03`–`S04` | Soora Canada, [French kkakdugi page](https://soora.ca/fr/produit/kkakdugi/) and [English page](https://soora.ca/product/kkakdugi/), for the bilingual product name and diced-radish description. These are seller descriptions, not a universal formulation. |
| `WP05-W-KIMCHI-JEOTGAL-20261012-S05` | Ministry of Food and Drug Safety / Food Safety Korea, [Food Standards and Specifications, 20-2 젓갈류](https://www.foodsafetykorea.go.kr/popup/safefoodlife/food/foodRvlv/foodRvlvDetail.do?rvlv_no=46), for the broad jeotgal class and its product-type distinctions. |
| `WP05-W-KIMCHI-JEOTGAL-20261012-S06` | The Ministry’s [English translation of Article 5](https://www.mfds.go.kr/files/upload/eng/Article_5._Standards_and_Spefications_for_Each_Food_Product.pdf) corroborates the broad seafood scope; it remains proposal-only because the current Korean standard in S05 is the primary source. |
| `WP05-W-KIMCHI-JEOTGAL-20261012-S07`–`S09` | National Institute of Korean Language, [새우젓 dictionary entry](https://krdict.korean.go.kr/m/eng/searchResult?ParaWordNo=62690&currentPage=4&exaType=&font_size=12&mainSearchWord=%EC%83%88&nation=eng&nationCode=6&proverbType=&searchType=W&sort=W&viewType=A&wordMatchFlag=N) and [official romanization](https://www.korean.go.kr/front/roman/romanView.do?mn_id=98&pageIndex=1&roman_seq=12853), plus K-Food Trade spelling evidence. These support the salt-preserved small-shrimp identity and `saeu-jeot` spelling, not a Québec French product term. |
| `WP05-W-KIMCHI-JEOTGAL-20261012-S10`–`S13` | Montréal Marché Korea [retail listing](https://marchekorea.com/shop/wang-salted-shrimp-%EB%8F%99%EB%B0%B1%ED%95%98-%EC%83%88%EC%9A%B0%EC%A0%93-500g/), OQLF entries for [crevette](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198913/crevette) and [fermentation](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2088400/fermentation), and the NIKL Korean food-name table. These support local product context and descriptive French components while preserving product boundaries. |

## Validation

- Package: 1,199 references, 86 forms, 114 recipes, 1,123 ingredient rows, and 66 legacy candidates.
- Ledger: 1,501 records, 5,066 source entries, 4,135 distinct source IDs, and 8 unit conversions.
- Reference/package normalization and validation, generated-index freshness, ledger validation, exact-key ownership, recipe-demand scan, UTF-8/no-BOM, and scoped whitespace checks passed.
- No tests or emulator checks were run because this change only adds new database JSON data under `AGENTS.md`.
- SHA-256: references `f7311d15ffab705a74d47d1835467535722ae12e0c2f33b29d369c16cba2d1a5`; ledger `9e3ed46d91d445fe8ebb37928512973b3300e763644527d29fdcb3004e4a2d0c`.

The complete boundary and recipe-demand review is in [`wp05-section-w-korean-fermented-vegetable-jeotgal-gap-review-20261012.md`](../../proposals/wp05-section-w-korean-fermented-vegetable-jeotgal-gap-review-20261012.md).
