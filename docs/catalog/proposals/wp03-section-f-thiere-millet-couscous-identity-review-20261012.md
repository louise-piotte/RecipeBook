# WP03 Section F: millet couscous (thiéré) identity review

## Packet record

- **Reviewed:** 2026-10-12.
- **Status:** accepted and integrated; see [the batch README](../batches/wp03-section-f-thiere-identity-integration-20261012/README.md).
- **Scope:** Senegalese millet couscous sold as thiéré, including source-documented rolled and precooked products.
- **Recommendation:** add identity-only `ingredient-ref-millet-couscous-thiere` as `millet couscous (thiéré) / couscous de mil (thiéré)`, category `GRAIN_AND_CEREAL`. Use the single English alias `tyere`, attested by an English-language storefront priced in Canadian dollars. Add no French aliases, forms, measures, density, unit mappings, recipe links, yields, conversions, or active substitutions.
- **Evidence summary:** Senegal's standards body certifies human-food couscous de mil under the name Thiéré. Montréal and Canadian product pages independently use `couscous de mil`, `Thiéré`, and English `millet couscous`. Traditional and industrial process sources establish a millet-based rolled-granule cereal, while showing variation in ingredients, moisture, precooking, drying, and preparation.

## Open item and prior coverage

The global plan still leaves **“Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps”** open at [plan line 2153](../../RecipeBook-global-ingredient-catalog-plan.txt#L2246), with a later checkpoint retaining broader Section F cereal and preprocessed-grain review at the end of the plan. Recent entries cover such products as millet flakes, quick-cooking rice, Khorasan flakes, sprouted grains, and cereal mixes; they do not cover Senegalese millet couscous.

I searched the proposal and batch archive for `thiéré`, `thiere`, `tyere`, `thiakry`, `millet couscous`, and `couscous de mil`. No earlier proposal or batch reviews this identity. The existing `ingredient-ref-couscous` and `ingredient-ref-pearl-couscous` are adjacent picker entries, while `ingredient-ref-millet`, `ingredient-ref-pearl-millet`, and the other millet rows describe grain or other grain products. None is an existing thiéré identity.

## Product boundary and names

The ASN certification regulation calls the human-food product “couscous de mil” named “Thiéré” and ties the mark to Senegal's NS ECOSTAND couscous-de-mil specification. The publicly available regulation establishes the name and product class; it does not reproduce the complete standard or prove that every retail SKU has the same formula. Current Montréal-area French product pages use `couscous de mil` and/or `Thiéré`; an English-language storefront priced in Canadian dollars uses `Thiéré` and `millet couscous` and explicitly gives `tyere` as an alternate spelling. These support the proposed bilingual displays as market wording, not as an OQLF or TERMIUM ruling.

| Proposed field or boundary | Recommendation | Evidence and limit |
| --- | --- | --- |
| English display | `millet couscous (thiéré)` | TiMaxExpress uses the title `Thiéré [millet couscous]`. The parenthetical preserves the regional product name. |
| Québec French display | `couscous de mil (thiéré)` | AFROLECK, Maad MTL, and Salikhate use `Couscous de mil` and/or `Thiéré` on Canadian-facing pages. This is current local product language, not an official terminology ruling. |
| English alias | `tyere` | TiMaxExpress explicitly says “Thiéré or tyere.” It is one seller's alternative spelling; keep it English-only and do not add other speculative spellings. |
| French aliases | None | `couscous de mil` and `thiéré` are already in the French display; accent folding also matches the unaccented retail spelling `thiere`. Do not add `couscous de millet` without local product evidence. |
| Category | `GRAIN_AND_CEREAL` | Sources identify a cereal product made by rolling millet-derived flour or semolina into granules. |
| Generic couscous | Keep separate | The existing `ingredient-ref-couscous` follows OQLF and Codex wording for couscous made from durum-wheat semolina; OQLF separately records the prepared-dish sense. Do not use the unqualified word `couscous` as an alias for thiéré. Senegalese couscous can be made from multiple cereals, so the cereal qualifier carries identity information. |
| Pearl couscous | Keep separate | `ingredient-ref-pearl-couscous` is already an exact picker owner for `pearl couscous / couscous perlé`; it is not a millet product. |
| Millet grain and flours | Keep separate | Do not alias bare `millet`, `mil`, `pearl millet`, or millet flour. Thiéré is a formed cereal product, not the intact grain or flour input. The Senegal study's *Pennisetum glaucum* description is specific to that study, not a species-level definition for every product sold as millet couscous. |
| Thiakry, lakh, and fondè | Exclude | FAO describes different granule-size and dish uses: thiacry uses medium, irregular grains; lakh and fondè are porridge preparations. AFROLECK also lists Thiakry and Arraw mil gros as separate products. These names are not thiéré aliases. |
| Thiéré lalo and Fadiouth salted couscous | Exclude from the generic identity's aliases | Maad's `Thiéré Lalo` includes added baobab-leaf powder and is precooked and dried; FAO's Fadiouth version is fermented, salty, and includes baobab leaf powder. Keep those source-specific formulations and locality claims out of the generic row. |

The ASN, FAO, IRD/ORSTOM, and research descriptions do not establish one universal recipe or processing state: sources describe fresh market couscous, one- or two-stage steaming, fermentation, additives, precooking, and drying. The proposed row is a product identity only; it does not assert a universal moisture state, cooking readiness, millet variety, or ingredient formula.

## Picker ownership and recipe demand

The audit used the current `normalizeIngredientSearchKey` and phrase-first matcher in `IngredientSearch.kt` as a static projection. Candidate phrases were checked against active reference names and aliases, form labels and search terms, all legacy import candidates, all ledger strings, and every recipe JSON listed in the current package manifest. This is not a live Android picker observation.

| Query or surface | Current result | Projection with the proposed row |
| --- | --- | --- |
| Exact candidate phrases: `millet couscous`, `couscous de mil`, `thiéré`, accent-folded `thiere`, and `tyere` | No active reference owner, form owner, legacy candidate, or dedicated ledger record. | Each returns the proposed row; `tyere` depends on the recommended English alias. |
| `couscous` | `ingredient-ref-couscous` and `ingredient-ref-pearl-couscous`. | Those two plus thiéré. Do not add `couscous` as an alias. |
| `millet` | 14 existing rows, including common, finger, foxtail, kodo, pearl, generic millet, flour, flakes, and puffed millet identities. | 15 rows; the candidate is one more qualified millet product. Do not add bare `millet` as an alias. |
| `mil` | `ingredient-ref-pearl-millet-flour` (`farine de mil chandelle`). | That row plus thiéré, because the source-backed French display contains the exact word `mil`. The narrow `couscous de mil` query remains unique to thiéré. |
| `pearl couscous` | `ingredient-ref-pearl-couscous` only. | Unchanged. |
| `thiakry` | No active reference owner. | No match; keep the products separate. |
| Forms and legacy identities | 98 forms and 64 legacy candidates; no exact candidate phrase owner. | No forms or legacy candidates proposed. |
| Research ledger | 1,632 records; no thiéré, tyere, or couscous-de-mil identity record or exact candidate phrase. A separate pearl-couscous record remains distinct. | If accepted, create a new record with the proposal-local source register below; do not reuse the pearl-couscous record. |
| Full bundled recipe corpus | 114 manifest-listed recipes and 1,123 ingredient rows; zero full-file matches for the candidate and neighboring phrases listed above. | No recipe relinking or recipe-line behavior is justified. |

The recipe audit searched all strings in all 114 manifest-listed JSON files, not only ingredient display text. Candidate and boundary phrases included `millet couscous`, `couscous de mil`, `couscous de millet`, `couscous au mil`, `couscous mil`, `thiéré`, `thiere`, `tyere`, `thiéré lalo`, `couscous de mil lalo`, `thiakry`, `thiacry`, `thiaçry`, `pearl couscous`, `arraw`, `araw`, `fondé`, and `lakh`. No bundled recipe contains one of these phrases. The external recipes below show culinary use but are not bundled recipe demand.

## Measures, density, and substitutions

| Data area | Recommendation | Evidence and limit |
| --- | --- | --- |
| Forms | Add none. | Fresh, steamed, precooked, dried, fermented, and additive-containing products appear across the sources. No single state is established for all retail thiéré. |
| Density and unit mappings | Leave unset. | None of the reviewed sources gives a transferable mass-per-volume value. A 600 g package is not a cup conversion; the research paper's 500 g bags were study samples. |
| Measurements and conversions | Add none. | FAO gives 1 kg of ready-to-cook Fadiouth salted millet couscous with 1 tablespoon of baobab-leaf powder, 20 minutes of hydration, and 20 minutes of steaming. This is a locality- and formulation-specific recipe, with no volume-to-mass conversion. Maad MTL says to add “some” warm water and steam its product, without a ratio. |
| Recipe-specific wheat alternative | Record only as a bounded research finding; do not activate a general rule. | Le Monde's Harouna Sow recipe lists 500 g of millet couscous “or wheat” for that dish, but says steaming time and repeated cycles depend on the semolina. Nomaallim says millet couscous can replace wheat couscous in its traditional recipe, but gives no validated cross-recipe ratio; its ingredient list and method also differ on the water amount. These are source-specific recipe suggestions, not a general ingredient conversion. |
| Other substitutions | Add no rule. | The RSC study compares pearl-millet couscous with wheat couscous in digestion behavior; that comparison is not culinary substitution validation. Recipe-specific claims do not establish a reusable dish scope, preparation state, ratio, or warning policy. |
| Recipe links and package yields | Add none. | The bundled corpus has no candidate demand. Retail package mass and laboratory package size are not yields. |

## Live package snapshot before proposed integration

Read-only snapshot taken on 2026-10-12. File hashes are SHA-256 of the exact bytes. The recipe-corpus digest is SHA-256 over each manifest-ordered relative path, NUL, raw recipe-file bytes, NUL.

| Surface | Live count | SHA-256 |
| --- | ---: | --- |
| Active ingredient references | 1,324 total; 139 `GRAIN_AND_CEREAL` | `6b4a1e34d8b7e8b75fdaf48c1bbf27c6ca1ce6562a75dc958a00d1b9e5014a7d` |
| Ingredient forms | 98 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import identities | 64 candidates | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,632 records; 6,017 source entries; 5,033 distinct source IDs; 8 unit conversions | `b959f36a409e902795dfc8f5322cfbce667e7e7c0030eecef6c6c49ca3298d0d` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Generated ingredient catalog | 1,324 references; 580,316 bytes | `d2f206e8499e985c8195a76ce1d38cd39de4f9781f283f5d5fc05f485f4472ba` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The proposed ID and source prefix were checked against the active references and `docs/catalog`; the proposal path was unused and `WP03-THIERE-20261012-` had zero existing occurrences. The counts and hashes are a live snapshot, not proposed data.

## Source register

Sources checked on 2026-10-12. IDs were proposal-local before integration and are now recorded on `ingredient-ref-millet-couscous-thiere`. The source prefix was unique at review time.

| Source ID | Source | Evidence and limit |
| --- | --- | --- |
| `WP03-THIERE-20261012-S01` | [Association Sénégalaise de Normalisation (ASN), Règlement particulier de certification: Couscous de mil](https://www.asn.sn/sites/default/files/ASN%20RP%20027%20CCOUSCOUS%20DE%20MIL.pdf) | The certification regulation names `couscous de mil` “Thiéré,” covers it for human consumption, and connects certification to NS ECOSTAND 62. It is not the full standard and does not disclose every SKU's formula. |
| `WP03-THIERE-20261012-S02` | [FAO / Slow Food Foundation, *Sentinelle du couscous salé de mil de l’île de Fadiouth*](https://www.fao.org/fileadmin/templates/olq/files/generaldoc/Senegal_libretto.pdf) | Describes Senegalese couscous as made from several cereals and distinguishes thiacry, lakh, and fondè by grain size/use. Gives the local Fadiouth salted-millet process and recipe. The baobab-leaf formula and preparation belong to that local version, not every thiéré. |
| `WP03-THIERE-20261012-S03` | [IRD / ORSTOM, *Aliments de l'ouest africain: tables de composition*](https://horizon.documentation.ird.fr/exl-doc/pleins_textes/divers13-04/010057842.pdf) | Describes family preparation from millet flour and semolina, hand rolling and sieving, an initial steam, and possible baobab powder or gum before another steam. This older observational source documents variation and traditional market moisture; it is not a current Canadian package specification. |
| `WP03-THIERE-20261012-S04` | [Maad MTL, THIÉRÉ LALO (Couscous de mil), 600 g](https://maadmtl.com/products/thiere-couscous-de-mil) | Montréal-area product page describes rolling millet flour with water, adding baobab-leaf `laalo`, precooking by steam, drying, then rehydrating and steaming. The SKU was marked sold out; 600 g is package mass, not a serving or density. The formula is specific to thiéré lalo. |
| `WP03-THIERE-20261012-S05` | [Salikhate, Thiéré – Couscous de Mil Traditionnel](https://salikhate.ca/products/thiere-couscous-de-mil-traditionnel) | Canadian seller page describes hand-rolled West African millet couscous and steaming; it says delivery in Canada and pickup in Montréal. The page was marked sold out and gives no full ingredient declaration or package mass. |
| `WP03-THIERE-20261012-S06` | [AFROLECK, Couscous de mil – Thiere](https://www.afroleck.com/fr/produit/couscousmil/) | Montréal-based Canadian grocer uses this exact French product title and lists it under cereals, flours, and semolina. It separately lists Arraw mil gros and Thiakry. The retrieved page's five-month-old crawl included an inventory count, which is not treated as current availability; no ingredient declaration, package mass, or preparation instructions are given. |
| `WP03-THIERE-20261012-S07` | [TiMaxExpress, Thiéré (“millet couscous”)](https://www.timaxexpress.com/en/product-page/thi%C3%A9r%C3%A9-couscous-de-mil) | English-language storefront priced in Canadian dollars supplies `millet couscous`; item text gives `tyere` as an alternate spelling and identifies Senegal. It does not provide an ingredient panel, package mass, or preparation details. |
| `WP03-THIERE-20261012-S08` | [Basse et al., “Shelf-life evaluation of precooked millet couscous (Pennisetum glaucum) during ambient storage, in Senegal,” *Frontiers in Food Science and Technology* (2026)](https://www.frontiersin.org/journals/food-science-and-technology/articles/10.3389/frfst.2026.1898623/full) | Primary study dries and mills hulled millet, moistens and rolls it, steams twice, then dries the product; study samples were packed at 500 g. Supports an industrial precooked product state, not a universal process, household measure, or species definition for all couscous de mil. |
| `WP03-THIERE-20261012-S09` | [RSC Publishing, “Pearl millet (*Pennisetum glaucum*) couscous breaks down faster than wheat couscous in the Human Gastric Simulator, though has slower starch hydrolysis” (2020)](https://pubs.rsc.org/en/content/articlehtml/2020/fo/c9fo01461f) | Peer-reviewed comparison treats millet couscous and wheat couscous as separate products and compares digestion behavior. It does not validate culinary substitution or a recipe ratio. |
| `WP03-THIERE-20261012-S10` | [Le Monde, Harouna Sow's Senegalese couscous recipe (2025)](https://www.lemonde.fr/les-recettes-du-monde/article/2025/07/11/le-couscous-senegalais-la-recette-de-harouna-sow_6620658_5324493.html) | For one dish, lists 500 g of couscous de mil “or wheat”; it says steaming takes 20–30 minutes depending on semolina and may be repeated. Recipe-specific alternative and method; not a generic replacement rule or measure mapping. |
| `WP03-THIERE-20261012-S11` | [Nomaallim, Préparation du couscous de mil](https://www.nomaallim.com/couscous-de-mil.html) | A consumer recipe says millet couscous can replace wheat couscous in its traditional recipe and gives soak/steam directions. Its ingredient list and instructions differ on the amount of water; retain only as a source-specific substitution claim, not a transferable ratio or density. |
| `WP03-THIERE-20261012-S12` | [OQLF, couscous (céréale traitée)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502225/couscous) | Defines the existing unqualified ingredient name as agglomerated durum-wheat semolina grains that are steamed and dried, and notes the separate prepared-dish sense. This is the Québec terminology boundary for the existing couscous row; it does not define thiéré. |
| `WP03-THIERE-20261012-S13` | [OQLF, couscous (mets)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502206/couscous) | Documents the North African prepared-dish sense separately from the ingredient term. It supports retaining the product-versus-dish distinction but does not name Senegalese millet couscous. |
| `WP03-THIERE-20261012-S14` | [Codex Alimentarius, Standard for Couscous CXS 202-1995](https://www.fao.org/input/download/standards/65/CXS_202e.pdf) | Defines the standardized couscous product from durum-wheat semolina and physical treatment, including cooking and drying. It corroborates the existing generic row's wheat-product boundary; it does not cover Senegal's millet-couscous standard. |

## Decision

Added `millet couscous (thiéré) / couscous de mil (thiéré)` as a separate identity-only `GRAIN_AND_CEREAL` row, with only English alias `tyere`. The ledger records no supported transferable measurement value and keeps the general wheat-couscous replacement blocked; it adds no active forms, mappings, conversions, yields, recipe links, or substitution rules. Section F remains open.
