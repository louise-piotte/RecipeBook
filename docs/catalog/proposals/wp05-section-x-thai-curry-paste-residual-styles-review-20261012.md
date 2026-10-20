# WP05 Section X — Thai Curry Paste Residual Styles Review

Date: 2026-10-12. Status: proposal-only; no catalog, recipe, research-ledger, workflow, plan, or roadmap changes were made. This review is limited to the remaining Thai curry-paste and named condiment candidates in the Section X open item. No tests or emulator checks were run.

## Scope and current state

The open checklist line names Thai red/green/yellow/Panang/Massaman curry pastes, nam prik pao, shrimp pastes, fermented-fish condiments, and tamarind preparations. Thai green curry paste already has an active, source-reviewed identity (`ingredient-ref-green-curry-paste`) with English `Thai green curry paste` and French `pâte de cari vert thaï`; the linked focused review records its identity-only treatment. This packet covers the remaining Thai curry styles and nam prik pao, checks the adjacent shrimp/fish boundary only where it bears on this checklist line, and does not reassess the broader tamarind item. [S12]

The current live package snapshot is:

| File or population | Count | SHA-256 |
|---|---:|---|
| Ingredient references | 1,176 | `4dea98cb665a77e2c8e103af4c2c2225ff86a4df9b07bdd9f7948ad77c6ea237` |
| Ingredient forms | 85 | `897a1d2e80f49d08810f4a08cc1b9b38429338217a8a995224688ac0bbf49699` |
| Legacy import candidates | 66 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Manifest recipe files | 114 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Ingredient rows across those recipes | 1,123 | — |

Relevant active references and boundaries:

| Existing ID | Current English / fr-CA display | Finding for this review |
|---|---|---|
| `ingredient-ref-curry-paste` | `curry paste` / `pâte de cari` | Generic prepared paste; no regional style alias is proposed. Its research-ledger identity remains unreviewed. |
| `ingredient-ref-red-curry-paste` | `red curry paste` / `pâte de cari rouge` | Existing unqualified red identity with only store-bought wording aliases. Its ledger record is unreviewed and has no sources or decisions; see the hold below. |
| `ingredient-ref-green-curry-paste` | `Thai green curry paste` / `pâte de cari vert thaï` | Retain the integrated identity and empty alias lists. |
| `ingredient-ref-curry-powder` | `curry powder` / `poudre de cari` | Dry powder remains distinct from prepared curry pastes. |
| `ingredient-ref-kapi-shrimp-paste` | `kapi` / `pâte de crevettes Kapi` | Retain the specific Thai shrimp-paste identity. Do not add unqualified `shrimp paste` as an alias. |
| `ingredient-ref-fish-sauce` | `fish sauce` / `sauce de poisson` | Keep liquid fish sauce distinct from pastes and pla ra. |
| `ingredient-ref-padaek` | `padaek` / `sauce padaek` | Retain the Lao identity and its scoped spelling aliases; do not add Thai pla ra as an alias. |
| `ingredient-ref-tamarind-paste` | `tamarind paste` / `pâte de tamarin` | Already active; no change is proposed in this Thai-style review. |
| `ingredient-ref-belacan`, `ingredient-ref-terasi`, `ingredient-ref-bagoong-alamang`, `ingredient-ref-bagoong-isda`, `ingredient-ref-prahok` | Country-named Southeast Asian pastes | Already active as distinct regional identities; no changes are proposed. The broad `ngapi` candidate remains unresolved. [S15] |

The exact-name audit followed the search-key folding implemented in `IngredientSearch.kt` and scanned current bilingual reference labels and aliases, form labels and match terms, and legacy candidate names and aliases. No exact normalized active-reference, form, or legacy-candidate owner was found for the proposed yellow, Panang, Massaman/Massamun, nam prik pao/nam phrik phao, or pla ra names. The unqualified red reference is the one existing overlap that needs a scope decision; green is already active. No form matched these product-style terms. No proposed new ID is currently active or present as a legacy candidate.

## Recommendations

The commercial source confirms distinct Thai red, yellow, Panang, and Massamun curry-paste products, and the Canadian trademark journal uses separate French goods wording for the Thai styles. These sources establish named product styles; they do not make each vendor formulation a universal recipe. Pantai also markets separate “instant” red, green, and Panang SKUs. This packet does not generalize those vendor-specific instant products into a shared ingredient form. [S01–S04]

| Candidate | Recommendation and proposed ID | Proposed English / fr-CA display | Aliases | Boundary |
|---|---|---|---|---|
| Thai red curry paste | **Hold the relationship** to `ingredient-ref-red-curry-paste`; do not add a second ID or a Thai-qualified alias yet. If a separate Thai identity is later accepted, proposed displays are `Thai red curry paste` / `pâte de cari rouge thaïe`. | Proposed wording shown for a future resolution only. | None while held. | The active red row is unqualified and unreviewed, and the only bundled row asks for unqualified `red curry paste`. Manufacturer and Canadian evidence confirm Thai red curry paste as a product style but do not settle whether the existing generic row is intended to mean that style. Aliasing now could make every unqualified red paste resolve as Thai; adding a second row could duplicate the current identity. Resolve the existing row’s intended scope before either move. [S01–S02] |
| Thai green curry paste | **Retain** `ingredient-ref-green-curry-paste`. | `Thai green curry paste` / `pâte de cari vert thaï` | None. | Already integrated and source reviewed; no new aliases, links, forms, or data. [S12] |
| Thai yellow curry paste | **Add separate identity-only row:** `ingredient-ref-yellow-curry-paste`. | `Thai yellow curry paste` / `pâte de cari jaune thaïe` | None. | Keep distinct from curry powder, generic curry paste, other color/style pastes, and finished yellow curry sauce. [S01–S02] |
| Panang curry paste | **Add separate identity-only row:** `ingredient-ref-panang-curry-paste`. | `Panang curry paste` / `pâte de cari panang thaïe` | None. | Keep distinct from generic curry paste, other curry-paste styles, Panang finished curry/sauce, and curry powder. No unverified transliteration variants are proposed. [S01–S03] |
| Massaman curry paste | **Add separate identity-only row:** `ingredient-ref-massaman-curry-paste`. | `Massaman curry paste` / `pâte de cari massaman thaïe` | EN: `Massamun curry paste`; FR: `pâte de curry Massamun`. | The Thai Embassy names “Massamun Curry (Gang-Massaman)”; Pantai sells its Thai paste as Massamun and its French product page uses `Pâte de Curry Massamun`. **Inference:** taken together, the dish-name crosswalk and the maker’s paste label support this bounded spelling alias; they do not establish a universal transliteration rule. Do not add `Matsaman`, generic `curry paste`, or the finished Massaman curry as aliases. [S02–S04] |
| Nam prik pao | **Add separate identity-only row:** `ingredient-ref-nam-prik-pao`. | `Thai chili paste (nam prik pao)` / `pâte de chili rouge thaï (nam prik pao)` | EN and FR: `nam phrik phao`. | Keep the named Thai paste distinct from Thai red curry paste, generic chili paste, nam pla/fish sauce, kapi, and Thai sweet chili sauce. Do not alias generic `Thai chili paste`, `nam phrik`, or `chili paste with soya/soybean oil`: those broad descriptions do not identify every product sold as nam prik pao. The spelling alias is an inference across transliteration conventions: Thai academic work uses `nam phrik phao`, while the named manufacturers and Canadian food-service recipe use `nam prik pao`. The French display follows that Canadian recipe’s wording. [S05–S08] |
| Thai pla ra | **Add separate identity-only row:** `ingredient-ref-pla-ra`. | `pla ra` / `pla ra (sauce de poisson fermentée)` | FR: `sauce de poisson fermentée (pla ra)`. | Keep separate from Lao padaek/pa daek/padek, generic fish sauce/nam pla, Kapi, and the already active country-named fermented pastes. The French display and alias use wording on a Canadian French-language retailer site; they remain transparent descriptors, not a Québec terminology standard. The Thai Tourism Office’s French page independently calls it `pla ra (poisson fermenté)`. [S09–S11, S14] |
| Thai shrimp paste | **Retain** `ingredient-ref-kapi-shrimp-paste`; do not create a generic Thai shrimp-paste row or broaden its aliases. | `kapi` / `pâte de crevettes Kapi` | None. | The active Kapi identity is separately supported by the Thai product standard and Canadian product/French recipe evidence. Do not alias Kapi to other national shrimp pastes or use curry-paste product ingredient lists to infer an identity, form, or substitution. [S13] |

All proposed new paste/condiment rows belong in `SAUCE_AND_CONDIMENT`. The yellow, Panang, Massaman, nam prik pao, and pla ra proposals are identity-only: no forms, densities, unit mappings, package yields, conversions, recipe-line links, or substitution rules. Red remains held pending scope resolution; green and the existing regional shrimp/fish identities remain unchanged. The supplier’s “instant” style SKUs are a research lead only, not evidence for one form shared across styles. [S01, S12–S15]

## Bundled recipe-row demand

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned for English and French style names and related exact product terms. No row requests Thai red with a Thai qualifier, green, yellow, Panang, Massaman/Massamun, nam prik pao/nam phrik phao, pla ra, Kapi, or the other named fermented shrimp/fish products. No row is linked or reassigned by this proposal.

The only nearby ingredient rows are unqualified requests with their current owners:

| Recipe | Row ID | Ingredient text | Current owner | Demand limit |
|---|---|---|---|---|
| 086, Butter Chicken | `1d0098bc-da72-40b3-ab68-d128d7ba0c3c-ingredient-8` | `curry paste` | `ingredient-ref-curry-paste` | Does not identify a Thai style or color. |
| 095, Satay | `9ec0ba36-1f7e-47d0-aedc-22ca03a5c672-ingredient-4` | `red curry paste` | `ingredient-ref-red-curry-paste` | Does not specify Thai style; this is why the red-row relationship remains held. |
| 093, Fried Rice | `2a2a7481-b5dc-45a5-9733-e3885d682131-ingredient-6` | `fish sauce` | `ingredient-ref-fish-sauce` | Generic liquid fish sauce does not establish pla ra demand. |
| 095, Satay | `9ec0ba36-1f7e-47d0-aedc-22ca03a5c672-ingredient-5` | `fish sauce` | `ingredient-ref-fish-sauce` | Generic liquid fish sauce does not establish pla ra or Kapi demand. |
| 086, Butter Chicken | `1d0098bc-da72-40b3-ab68-d128d7ba0c3c-ingredient-6` | `curry powder` | `ingredient-ref-curry-powder` | Powder remains distinct from prepared paste. |

This table records owner demand only; recipe amounts are intentionally omitted. The absence of an exact bundled row does not establish that a style is unused outside this package.

## French wording and evidence limits

- The Canadian Intellectual Property Office’s 2025 *Journal des marques de commerce* lists `pâte de cari rouge thaïe`, `pâte de cari jaune thaïe`, `pâte de cari panang thaïe`, and `pâte de cari massaman thaïe`. This is useful Canadian French product wording, not an OQLF ruling, food standard, or proof that all brands share one formula. [S02]
- For Massaman/Massamun, the Embassy’s dish-name crosswalk and Pantai’s Massamun product/French product page jointly support the proposed scoped spelling link. This is an inference bounded to the named curry-paste style; the inspected sources do not support adding `Matsaman` or turning either spelling into a generic curry-paste alias. [S03–S04]
- For nam prik pao, Gordon Food Service Canada’s French recipe uses `pâte de chili rouge thaï (nam prik pao)`. This is direct Canadian French culinary wording. I did not find an OQLF entry for this prepared product name. [S08]
- For pla ra, the Thai Agricultural Standard calls Pla-Ra fermented/salt-fermented fish, but its scope is **raw** Pla-Ra and it expressly excludes processed Pla-Ra. A Canadian French-language retailer lists `Sauce de poisson fermentée (pla ra)` and a named seasoned pla ra product; the Thai Tourism Office’s French-language page calls it `pla ra (poisson fermenté)`. These support a transparent local descriptor, not a Canadian terminology standard or a universal processed form. Targeted OQLF searches did not return an entry; that bounded search does not prove that no terminology record exists. [S09–S11]

## Remaining evidence gaps

- The unreviewed generic red-paste row needs a decision on whether it is intended as a broad red-paste identity or the Thai product style. The available recipe wording does not resolve that question.
- Canadian French CIPO wording supports the curry-style labels but is not a terminology standard. A Québec recipe, retailer, or manufacturer source for yellow, Panang, and Massaman paste names was not located in this bounded review.
- The Massamun spelling link is well supported for the named Thai curry and one manufacturer’s paste, but independent Canadian retail usage for the Massamun paste spelling was not found.
- Nam prik pao product descriptions vary by manufacturer. Neither the “with oil” wording nor any one product’s ingredients should become an alias rule or universal recipe.
- Canadian French retail wording for pla ra is available, but no OQLF entry was found in the targeted search and the retailer wording is not a terminology standard. The Thai standard only covers raw product, so future form distinctions need product-specific evidence.
- Pantai separately markets some “instant” curry-paste SKUs. Their relationship to ordinary paste does not establish a shared form or a conversion; review only if a matching exact recipe or product request appears.
- No style-specific bundled rows exist for the proposed new identities, so this scan supplies no package measurement, form, conversion, or substitution evidence.

## Sources

External sources were accessed 2026-10-12. Manufacturer ingredient descriptions support their named SKUs only. Recipe quantities and product composition were not transferred to catalog measurements or formulations.

| ID | Direct source | Claim supported and limit |
|---|---|---|
| `WP05-THAI-RESIDUAL-20261012-S01` | Pantainorasingh Manufacturer Co., [Curry Pastes](https://pantainorasingh.com/collections/curry-pastes) | Manufacturer presents Thai red, green, yellow, Panang, sour, and Massamun curry-paste products and separately lists some “instant” products. This establishes market-named products, not universal formulations or shared forms. |
| `WP05-THAI-RESIDUAL-20261012-S02` | Canadian Intellectual Property Office, [Journal des marques de commerce, Vol. 72 No. 3677, p. 586](https://publications.gc.ca/collections/collection_2025/opic-cipo/RG42-2-72-3677-fra.pdf) | Canadian French goods wording lists Thai red, green, yellow, Panang, and Massaman curry pastes and chili paste with soya oil. Trademark goods wording is not a terminology or product standard. |
| `WP05-THAI-RESIDUAL-20261012-S03` | Royal Thai Embassy in Copenhagen, [“Taste of Thailand: Thai Street Food Festival”](https://copenhagen.thaiembassy.org/en/content/81638-%E2%80%9CTaste-of-Thailand%3A-Thai-Street-Food-Festival%E2%80%9D?cate=5d81e20015e39c161400214e) | Official Thai Embassy text names “Massamun Curry (Gang-Massaman),” supporting the bounded spellings for that curry style, not a general linguistic alias rule. |
| `WP05-THAI-RESIDUAL-20261012-S04` | Pantainorasingh Manufacturer Co., [Pâte de Curry Massamun](https://www.pantainorasingh.com/fr-products/massamun-curry-paste) and [Massamun Curry Paste](https://pantainorasingh.com/products/massamun-curry-paste) | Manufacturer names and sells the Thai paste as Massamun; its French page uses `Pâte de Curry Massamun`. This supports one source-bounded bilingual alias, not Canadian standardization. |
| `WP05-THAI-RESIDUAL-20261012-S05` | Pantainorasingh Manufacturer Co., [Chili Paste with Soya Bean Oil (Medium Hot)](https://www.pantainorasingh.com/products/chili-paste-with-soya-bean-oil-medium-hot) | Manufacturer identifies its named product as also known as nam prik pao. The product-specific description does not make “chili paste with soya bean oil” a universal synonym or formula. |
| `WP05-THAI-RESIDUAL-20261012-S06` | Chita Organic Food Co., [Organic Thai Chilli Paste (Nam Prik Pao)](https://www.chitaorganicfood.co.th/en/product/47942-41421/organic-thai-chilli-paste-nam-prik-pao) | Thai manufacturer names a product Nam Prik Pao and describes it as roasted chili paste in oil; its own product composition is not generalized. |
| `WP05-THAI-RESIDUAL-20261012-S07` | Kasetsart University thesis hosted by Thailand’s National Research Council of Thailand, [Aroma-active compounds in Thai chili paste (Nam Phrik Phao)](https://doi.nrct.go.th/ListDoi/Download/56459?Resolve_DOI=10.14457%2FKU.the.2009.406) | Academic title and text use `Nam Phrik Phao` for Thai chili paste, supporting the spelling alias and identity. Its studied recipe and processing are not adopted as a universal formula. |
| `WP05-THAI-RESIDUAL-20261012-S08` | Gordon Food Service Canada, [Pâtes au crabe Tom Yum](https://gfs.ca/fr-ca/idees/recette/pates-au-crabe-tom-yum/) | Canadian French recipe uses `pâte de chili rouge thaï (nam prik pao)`. This supports local culinary wording; the recipe’s quantity is not reproduced. |
| `WP05-THAI-RESIDUAL-20261012-S09` | Thailand National Bureau of Agricultural Commodity and Food Standards, [TAS 7023–2018: Pla-Ra](https://tas2go.acfs.go.th/upload_standard/321_en.pdf) | Thai agricultural standard names Pla-Ra as fermented/salt-fermented fish and defines a raw-product scope; it excludes processed Pla-Ra. Do not generalize its raw-product requirements to every processed product. |
| `WP05-THAI-RESIDUAL-20261012-S10` | Office National du Tourisme de Thaïlande, [Recette éprouvée](https://www.tourismethai.fr/experiences/cuisine-thai/recette/recette-eprouvee/) | Thailand Tourism Office’s French-language page uses `pla ra (poisson fermenté)` and describes its Isan culinary context. It is French usage from France, not Canadian terminology evidence. |
| `WP05-THAI-RESIDUAL-20261012-S11` | Sukanya Online Thai Food, [Canadian French-language store](https://sukanyaonline.ca/fr) | Canadian French-language storefront uses `Sauce de poisson fermentée (pla ra)` and lists a separate seasoned pla ra product. Retail product wording supports the proposed transparent label, not a terminology standard or every pla ra product form. |
| `WP05-THAI-RESIDUAL-20261012-S12` | Existing proposal, [WP05 Section X green curry paste and Thai sweet chili sauce review](wp05-section-x-green-curry-paste-sweet-chili-review-20261012.md) | Confirms green curry paste is already active as an identity-only Thai style with no aliases, numeric data, forms, or recipe links. |
| `WP05-THAI-RESIDUAL-20261012-S13` | Existing batch note, [WP05 Kapi shrimp-paste identity checkpoint](../batches/wp05-kapi-shrimp-paste.md) | Confirms active Kapi as a distinct Thai shrimp-paste identity and records the no-generic-`shrimp paste` alias boundary. |
| `WP05-THAI-RESIDUAL-20261012-S14` | Existing proposal, [WP05 Section X padaek identity reassessment](wp05-section-x-padaek-identity-reassessment-20261012.md) | Supports keeping Lao padaek distinct from Thai pla ra, generic fish sauce, and regional shrimp pastes; it explicitly calls for any exact Thai pla ra request to receive separate review. |
| `WP05-THAI-RESIDUAL-20261012-S15` | Existing batch note, [WP05 fermented-paste identities integration](../batches/wp05-fermented-paste-identities-integration-20261012/README.md) | Confirms the current active belacan, terasi, bagoong alamang/isda, and prahok rows and the decision to keep broad `ngapi` unresolved. |

## Handoff

This packet recommends separate identity-only rows for Thai yellow curry paste, Panang curry paste, Massaman curry paste, nam prik pao, and Thai pla ra; retains green curry paste and the active Kapi/regional-paste rows; and holds the Thai red alias/identity relationship until the current unqualified red row is resolved. No recipe-line links or quantities are proposed. The Section X checklist remains open until accepted work is integrated and its other product families are reviewed. Re-run the live package, ID, normalized alias, form/legacy, and full recipe-row audits before any integration. No tests were run because this packet changes documentation only.
