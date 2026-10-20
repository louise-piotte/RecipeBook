# WP03 Section F: nurungji (Korean scorched rice crust) identity review

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12 as an identity-only catalog row and ledger record; see the [integration batch README](../batches/wp03-section-f-nurungji-identity-integration-20261012/README.md).
- **Scope:** The named Korean rice-crust product *nurungji*, including its dry, shelf-stable commercial form. This review does not catalog its rehydrated porridge or beverage preparations.
- **Open checklist:** Section F still requests review of regionally significant cereal products and preprocessed grains ([plan, regional cereal item](../../RecipeBook-global-ingredient-catalog-plan.txt#L2239)). Archive and plan searches found no earlier *nurungji* review, hold, active reference, ledger record, recipe mention, or source-prefix allocation.
- **Integrated recommendation:** Added identity-only `ingredient-ref-nurungji` as **`nurungji (scorched rice crust) / nurungji (croûte de riz trop cuit)`** in `GRAIN_AND_CEREAL`. Aliases remain empty; density is null; unit mappings and forms are empty; no recipe links, conversion, yield, or substitution rule were added.
- **Naming limitation:** English product wording is current in manufacturer and Canadian retailer pages. French `croûte de riz trop cuit (nurungji)` is directly attested in a French Canadian federal trademark journal and a French-language Korean-cuisine guide. No Québec retail package label or OQLF/TERMIUM terminology entry for the item was located in this review; treat the fr-CA display as a source-backed descriptive gloss, not an OQLF-preferred or Québec-market-certified name.

## Identity and product boundary

The Academy of Korean Studies' Encyclopedia of Korean Culture defines *nurungji* as rice stuck to the bottom of the pot during rice cooking. It says it is eaten as a snack and can be boiled with water to make *nurungji-bap*, while the resulting drink is *sungnyung*. The entry also distinguishes newer *nurungji*-flavoured sweets. The page was last revised in 2023 and cautions that its author's expert view may differ from the institution's official position.

Ottogi's current manufacturer page calls its product “Nurungji (Scorched Rice),” describes freshly cooked rice grilled on a cast-iron plate, and sells 30 g and 60 g packs. Korea Rice Bio's Rice Show product page describes a slow-roasted Korean snack and topping; its particular product contains 80% glutinous rice, 18% white rice, 1% corn starch, and 1% corn. These sources support the product family while showing that a commercial SKU may not be a single-rice ingredient.

| Candidate / neighbor | Review disposition | Boundary |
|---|---|---|
| Dry, plain *nurungji* | Integrated as an identity-only row. | Shelf-stable rice crust made from cooked rice and browned by contact with a hot cooking surface. Commercial rice types and formulations may vary. Do not promise a universal formula or preparation method. |
| *Nurungji* / “scorched rice crust” | Keep the Korean product name in both displays, with a directly attested descriptive gloss. | Do not create bare `scorched rice` as a general cross-cuisine alias. Other cuisines have their own scorched-rice products and preparations. |
| *Nurungji-bap* and *sungnyung* | Exclude as prepared dishes/beverages. | The Korean encyclopedia distinguishes the boiled rice-crust dish and its broth/drink from the crust itself. Do not add forms for these preparations without recipe demand and a defined form model. |
| *Nurungji Pop*, candy, or other flavored/composite snacks | Exclude from the plain candidate. | MFDS's 2026 import record for “NURUNGJI POP” lists glutinous rice, palm oil, sugar, corn starch, salt, lecithin, and green-tea extract. This is a product-specific composite snack, not evidence for aliases or formula of the plain crust. |
| Puffed rice / `riz soufflé` | Keep the active identity separate. | Heat-expanded rice grains are not the cooked-and-browned pot crust described by the *nurungji* sources. |
| Crispy rice cereal / `céréales de riz croustillantes` | Keep the active ready-to-eat cereal separate. | The Québec/Canadian cereal identity and its recipe use remain unchanged; do not transfer cereal aliases or measures. |
| Flattened rice (poha) / `flocons de riz (poha)` | Keep the active flattened/flaked product separate. | Flattening cooked/dehydrated rice is a distinct process and product boundary. |
| Toasted rice powder / `poudre de riz rôti` | Keep the active seasoning powder separate. | A powder made from toasted rice is not the intact dry crust. |
| Brown, white, glutinous, and generic rice | Keep the base-grain identities separate. | *Nurungji* is a processed product, not a rice cultivar or a form of one rice reference; producer ingredients can include multiple rice types and other components. |

No aliases were added. The bilingual displays themselves include the source-attested names/glosses; do not additionally add `scorched rice`, `scorched brown rice`, `scorched glutinous rice`, or a made-up French synonym.

## Canadian and Québec naming

- **English:** Ottogi names a packaged product “Nurungji (Scorched Rice).” The Canadian retailer The K Mart lists “Cheongjeongwon Pure Rice Nurungji 250G”; its page showed sold out at access time. The Canadian listing supports market wording but does not establish Québec stock or a complete ingredient declaration.
- **French:** The Government of Canada's French-language *Journal des marques de commerce* (2024-01-31, Vol. 71 No. 3614, application 2,067,826) publishes the wording `croûte de riz trop cuit (nurungji)` in the applicant's goods list. A French-language Korean-cuisine guide hosted by Mirae Asset also calls it `croûte de riz trop cuit (“Nurungji”)`. These are direct French attestations, but neither is a Québec product label or a terminology ruling. A 2026 French Canadian CIPO journal listing also uses `nurungji [croûte de riz]`, corroborating the shorter descriptive gloss; CIPO goods wording remains application/translation evidence, not OQLF approval.
- **Québec-specific check:** Exact targeted searches for `nurungji`, `croûte de riz trop cuit`, and `scorched rice` in OQLF/TERMIUM and Québec retail/product pages did not return a Québec terminology entry or product label in this review. This negative search is limited to the queried terms and sources. The integrated French display is therefore intentionally anchored by *nurungji* and remains provisional if stricter Québec-market evidence is required.

## Exact ownership and picker audit

The read-only key audit applied the current accent-, punctuation-, and case-folded ingredient-search normalization to reference displays/aliases, form labels/match terms, legacy candidate names/aliases, and ledger record IDs. Before integration, no exact normalized owner or reserved ID was found for `nurungji`, `scorched rice`, `scorched rice crust`, `nurungji (scorched rice crust)`, `croûte de riz trop cuit`, or `nurungji (croûte de riz trop cuit)`. Before this file was created, no *nurungji* source occurrence or proposal-prefix allocation was found in the existing ledger/proposal/batch archive. The complete-name query results in this section are static picker projections, not live Android observations.

Relevant existing exact owners remain:

| Existing phrase | Owner |
|---|---|
| `puffed rice` / `riz soufflé` | `ingredient-ref-puffed-rice` |
| `crispy rice cereal` / `céréales de riz croustillantes` | `ingredient-ref-rice-cereal` |
| `flattened rice (poha)` / `flocons de riz (poha)` | `ingredient-ref-flattened-rice-poha` |
| `toasted rice powder` / `poudre de riz rôti` | `ingredient-ref-toasted-rice-powder` |

Using the current `filterByIngredientSearchQuery` behavior (normalized complete-word-phrase matches first, substring fallback second), a static picker projection with the integrated displays yields:

| Query | Projected result |
|---|---|
| `nurungji`, `scorched rice crust`, `croûte de riz trop cuit` | The integrated *nurungji* row only. |
| `puffed rice` | Existing puffed-rice row only. |
| `crispy rice cereal` | Existing crispy-rice-cereal row only. |
| `toasted rice` | Existing toasted-rice-powder row only. |
| `rice` / `riz` | Broad rice-result sets (50 / 46 rows, including the integrated row); this is expected family discovery and not an exact ownership collision. |

Because the displays contain descriptive glosses, current phrase matching also returns the row for the unqualified query `scorched rice`. No competing active phrase currently owns that query. Do not add broader cross-cuisine aliases; if the catalog later includes another scorched-rice identity, rerun this picker review so the Korean qualifier is not lost in an unqualified search.

## Recipe-demand, measurement, density, and substitution audit

Every recipe file in the current manifest was parsed in manifest order and all string values and ingredient rows were scanned for `nurungji`, `scorched rice`, `rice crust`, `croûte de riz`, `riz trop cuit`, and `burnt rice` variants. Result: **0 matching recipes and 0 matching ingredient rows** in the full 114-file / 1,123-row bundle. No recipe link, quantity, or form is warranted.

The manufacturer lists 30 g and 60 g retail packs and instructs one 60 g pack to be prepared with 400 mL of hot water for a prepared bowl. That is a product-specific package instruction, not a dry-product volume measure or density. The Korea Rice Show page's 1 kg product size and its ingredient percentages are likewise SKU-specific; the Canadian retailer's 250 g is a package size only. No transferable household measure, volume-to-mass value, default density, or unit mapping was found. The integrated row has `defaultDensity: null` and `unitMappings: []`.

Sources describe *nurungji* as snack, garnish, topping, or a base to simmer in water; none demonstrates substitution for puffed rice, crispy rice cereal, flattened rice, toasted rice powder, or another ingredient at a tested ratio or scoped recipe role. The ledger records `researched_no_supported_substitute`; no global or contextual substitution was activated.

## Live package and corpus snapshot after integration

Recorded after integration on 2026-10-12 in the [integration batch README](../batches/wp03-section-f-nurungji-identity-integration-20261012/README.md). File hashes cover exact bytes. The corpus fingerprint hashes each manifest-relative recipe path, NUL, exact recipe bytes, and trailing NUL, in manifest order.

| Artifact | Live count | SHA-256 / fingerprint |
|---|---:|---|
| `ingredient-references.v1.json` | 1,324 references; 139 `GRAIN_AND_CEREAL` | `6b4a1e34d8b7e8b75fdaf48c1bbf27c6ca1ce6562a75dc958a00d1b9e5014a7d` |
| `ingredient-forms.v1.json` | 98 forms | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `research-ledger.v1.json` | 1,632 records; 6,017 source entries; 5,033 distinct source IDs; 8 unit conversions | `b959f36a409e902795dfc8f5322cfbce667e7e7c0030eecef6c6c49ca3298d0d` |
| Generated `BundledIngredientCatalog.kt` | 1,324 references | `d2f206e8499e985c8195a76ce1d38cd39de4f9781f283f5d5fc05f485f4472ba` |
| Manifest-ordered recipe corpus | 114 files; 1,123 rows; 753,792 recipe-file bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

These are the live post-integration values recorded in the batch README.

## Integrated catalog and ledger delta

The integration added one reference:

| Field | Integrated value |
|---|---|
| ID | `ingredient-ref-nurungji` |
| `nameEn` | `nurungji (scorched rice crust)` |
| `nameFr` | `nurungji (croûte de riz trop cuit)`; source-backed descriptive wording, with no Québec terminology ruling located |
| Category | `GRAIN_AND_CEREAL` |
| Aliases | `aliasesEn: []`; `aliasesFr: []` |
| Numeric fields | `defaultDensity: null`; `unitMappings: []` |
| Forms, conversions, yields, recipe links, substitutions | None |

One verified identity ledger record was added with source-specific SKU observations and separate no-supported-value/no-supported-substitute decisions. The 30 g/60 g/250 g/1 kg package sizes and Ottogi's 60 g + 400 mL instruction remain scoped to their cited products. The French display remains a provisional source-backed gloss because no Québec-specific product label or terminology ruling was found.

Source IDs `WP03-NURUNGJI-20261012-S01` through `S08` were absent from the live ledger and catalog archive when checked; they are registered by the integration record. The proposed file path was absent before this review created it. Static checks passed after integration, including seed-package normalization and validation, generated-catalog consistency, ingredient-reference normalization, and recipe-corpus, ownership, encoding, and whitespace checks. No app, unit, instrumentation, or emulator tests were run because this change only adds database JSON data, as permitted by `AGENTS.md`.

## Source register

All source pages were accessed 2026-10-12 unless their publication date is shown. Reuse a source by URL rather than duplicating it if a later ledger integration finds the same source already registered.

| Source ID | Source and direct URL | Supports and limits |
|---|---|---|
| `WP03-NURUNGJI-20261012-S01` | Academy of Korean Studies, *Encyclopedia of Korean Culture*, [Nurungji](https://encykorea.aks.ac.kr/Article/E0067930); last revised 2023-02-07. | Defines the crust as cooked rice stuck to a pot bottom; describes snack use, *nurungji-bap*, *sungnyung*, and later flavored sweets. The entry notes that its contributor's scholarly view may differ from the institution's official position. It is not a specification for all commercial products. |
| `WP03-NURUNGJI-20261012-S02` | Ottogi, [NURUNGJI_BOWL / Nurungji (Scorched Rice)](https://www.otoki.com/en/product/product_detail?categorySeqFirst=9&productIdx=2795), current manufacturer page. | Names the product in English, describes freshly cooked rice grilled on cast iron, lists 30 g/60 g retail packs, and directs one 60 g pack with 400 mL water for a prepared bowl. These sizes and directions are SKU-specific and do not establish density or a reusable measure. |
| `WP03-NURUNGJI-20261012-S03` | Korea Rice Foodstuffs Association, Rice Show, [Korea Rice Bio — Scorched Glutinous Rice 1 kg](https://www.riceshow.or.kr/html/info/productView.php?lang=eng&no=1023), producer product listing. | Describes slow-roasted *nurungji* as a snack/topping and gives this SKU's formula: 80% glutinous rice, 18% white rice, 1% corn starch, 1% corn. It supports product-family identity and formulation variability, not a universal formula, measure, or substitution. |
| `WP03-NURUNGJI-20261012-S04` | The K Mart Canada, [Cheongjeongwon Pure Rice Nurungji 250 g](https://www.thekmart.ca/en/products/%EC%B2%AD%EC%A0%95%EC%9B%90-%EC%88%9C%EC%8C%80-%EB%88%84%EB%A3%BD%EC%A7%80-250g), current Canadian retail listing. | Canadian English title names *nurungji* and a 250 g package. The page showed sold out; it does not establish Québec availability, a French label, ingredient composition, or a household portion. |
| `WP03-NURUNGJI-20261012-S05` | Government of Canada, CIPO, [Trade-marks Journal, Vol. 71 No. 3614, French PDF](https://publications.gc.ca/collections/collection_2024/opic-cipo/RG42-2-71-3614-fra.pdf), 2024-01-31, printed p. 99, application 2,067,826. | French goods wording says `croûte de riz trop cuit (nurungji)`. This is a published applicant goods list and French translation, not an OQLF ruling, a Québec product label, or evidence of market frequency. |
| `WP03-NURUNGJI-20261012-S06` | Government of Canada, CIPO, [Trade-marks Journal, Vol. 73 No. 3725, French PDF](https://publications.gc.ca/collections/collection_2026/opic-cipo/RG42-2-73-3725-fra.pdf), 2026; French goods listing. | The current French-language journal includes `nurungji [croûte de riz]`, supporting a shorter descriptive French gloss. The PDF is large; browser search excerpt exposed the phrase. As with S05, this is applicant goods wording rather than terminology approval. |
| `WP03-NURUNGJI-20261012-S07` | Mirae Asset-hosted French guide, [Culture Culinaire Coréenne 1](https://img.securities.miraeasset.com/download/cookbook/fra_c1_1.pdf), p. 13. | Uses `croûte de riz trop cuit (“Nurungji”)` and describes its use in a drink. Supports French-language descriptive naming and the prepared-drink boundary; it is not a Québec retailer label or official terminology source. |
| `WP03-NURUNGJI-20261012-S08` | Ministry of Food and Drug Safety (Republic of Korea), [Imported Food Information Maru — NURUNGJI POP](https://impfood.mfds.go.kr/CFCCC01F03?callBackFn=fnPopupCallback&rcno=202600067536), 2026 import record. | Identifies this imported product as a snack and lists glutinous rice, palm oil, sugar, corn starch, salt, lecithin, and green-tea extract. This is one composite SKU and supports keeping flavored “Nurungji Pop” outside the plain-crust identity. |
