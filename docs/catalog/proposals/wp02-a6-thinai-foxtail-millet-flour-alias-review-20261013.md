# WP02 A6 review: Thinai flour alias for foxtail millet flour

## Review record

- **Reviewed and sources accessed:** 2026-10-13.
- **Status:** Accepted and integrated on 2026-10-13. The flour alias, picker-safe grain alias, research ledger, generated catalog index, plan, roadmap, and integration record were updated. No app tests or emulator checks were run for this database-data change.
- **Scope:** Review the English phrase **thinai flour** as a regional name for the already active foxtail-millet-flour identity, and add source-backed **thinai** to the existing grain identity so a bare grain-name query does not return flour alone. This adds no new identity and is not a general review of millet names.
- **Plan context:** WP02 A6 remains open. Generic millet flour, pearl- and finger-millet flour, fonio and black-fonio flour, Job's tears flour, quinoa and amaranth variants, kodo/proso/foxtail flour identities, the reviewed naming holds, sprouted buckwheat flour, and Makki aliases are already covered. This review does not reopen them. The brown-top, barnyard, Sikiya/crab-finger, little-millet, sprouted-pearl, and separate `bajri flour` holds remain out of scope.
- **Source IDs:** `WP02-A6-THINAI-FOXTAIL-FLOUR-ALIAS-20261013-S01` through `S08`. This prefix was absent from the ledger and proposal/batch Markdown at the pre-draft check; the sources are now recorded in the research ledger.
- **Proposed path:** This file did not exist before drafting.

## Recommendation

Add **`thinai flour`** to `aliasesEn` on the existing `ingredient-ref-foxtail-millet-flour` row, and add **`thinai`** to `aliasesEn` on the existing `ingredient-ref-foxtail-millet` grain row. The grain alias is supported by official name mappings and ensures that a bare `thinai` query returns the grain and flour as distinct choices; the complete `thinai flour` phrase returns only flour. Retain both display pairs, keep French aliases empty, leave `defaultDensity: null` and `unitMappings: []`, and allocate no new identity.

The source mapping is supported by two independent parts of the evidence: official Indian food and agriculture sources pair Tamil `Thinai`/`Tenai` with foxtail millet (*Setaria italica*), and a current Kitchener product page titles its flour **Foxtail Millet Flour** and describes it as made from foxtail millet (**Thinai**) [S01–S03]. A Greater Toronto retailer also titles a product **Thinai Flour**, but does not declare its grain species; use that listing only as evidence that the exact phrase appears in Canadian retail wording [S04].

| Phrase or field | Recommendation | Evidence boundary |
|---|---|---|
| `thinai flour` | Add as one English alias to `ingredient-ref-foxtail-millet-flour`. | The Canadian foxtail-flour product pairs the source grain name Thinai with the flour identity; the GTA listing independently uses the exact phrase as a flour product title. Official sources anchor Thinai to *Setaria italica*. [S01–S04] |
| `thinai` | Add as an alias to the existing foxtail-millet grain row; do not add it as a separate alias to the flour row. | Official sources identify Thinai/Tenai as a foxtail-millet grain name. The picker also matches the word inside `thinai flour`, so keeping the grain alias lets a bare query return both the grain and flour choices. [S01–S02] |
| `thinai maavu`, `thinai mavu`, `tenai flour`, `foxtail flour`, `kangni flour`, `kangni atta`, `korra flour`, `navane flour`, `kaon flour`, `kakum flour` | Leave inactive in this review. | They are not the exact Canadian English product wording selected here. Although some are regional names or occur in non-Canadian seller content, this review does not establish a stable Canadian alias set for them. [S01–S04] |
| French display and aliases | Retain `farine de millet d'Italie`; keep `aliasesFr` empty. | OQLF supports `millet d'Italie` for the source grain, and the Québec food directory's current millet-flour record does not identify a species or Thinai wording. No Québec source reviewed here ties a French flour term to this specific grain. [existing OQLF source `WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S07`, S05] |
| New identity, form, recipe link, conversion, yield, or substitution | Add none. | The evidence supports an English search alias only. Density and substitution research below is source-scoped and does not establish active runtime behavior. |

## Grain and Québec naming boundary

The Food Safety and Standards Authority of India (FSSAI) millet guidance lists foxtail millet with its Tamil name `Tenai, Thinai`; Tamil Nadu Agricultural University identifies foxtail millet as *Setaria italica* and uses `Tenai` in its crop guidance [S01–S02]. These sources make the Thinai/foxtail connection explicit without relying on a retailer's unspecified flour. They do not standardize a flour grade or make regional grain names universally interchangeable.

The Ontario TastyGrain product page is headed `Foxtail Millet Flour - NFS` and says the flour is made from foxtail millet (Thinai) [S03]. That directly connects the regional grain wording to the qualified flour product. Eraa Supermarket in the Greater Toronto Area titles a product `Eraa Thinai Flour`, but its page does not identify the source-grain species [S04]. Its exact title corroborates Canadian flour naming; it is not used alone to establish the botanical identity.

For French, the OQLF entry for *millet des oiseaux* identifies *Setaria italica*, lists `millet d'Italie` among its preferred Québec terms, and notes the bird-feed association of `millet des oiseaux` [existing OQLF source `WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S07`]. The existing French display follows that grain terminology. The Québec Répertoire des aliments québécois lists a Cuisine Soleil `Organic Millet Flour` product, but its ingredient declaration says only `Organic millet flour` and does not identify *Setaria italica* [S05]. Do not transfer its unqualified French/English wording or portion label to this species-qualified flour, and do not invent `farine de Thinai` or another French alias.

## Live catalog, ledger, exact-key, and picker audit

Pre-integration snapshot read from the shared workspace on 2026-10-13. Hashes cover exact file bytes. The recipe-corpus fingerprint hashes each manifest-ordered relative recipe path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte.

| Store | Snapshot | SHA-256 / fingerprint |
|---|---:|---|
| Active ingredient references | 1,330 rows; 426,166 bytes | `160e2a43bd4626bf60f428e49102f80c7c0cfad59e0c1a444ea98d8767d48ede` |
| Ingredient forms | 98 rows; 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 rows; 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,638 records; 6,108 source entries; 5,123 distinct source IDs; 8 unit conversions; 6,018,736 bytes | `a5b97343b8b82a3d314bc49261df3779718691e2d93354ed40fc2eaa0b0bf264` |
| Seed manifest | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

Before integration, the target was `ingredient-ref-foxtail-millet-flour`, category `FLOUR_AND_STARCH`, displayed as `foxtail millet flour / farine de millet d'Italie`. Its alias arrays are empty, `defaultDensity` is null, and `unitMappings` is empty. It has no attached form. Its ledger record is `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`.

Exact normalized-key ownership was checked against active reference IDs/names/aliases, form IDs/labels/match terms, legacy candidate IDs/names/aliases, and ledger record IDs. Normalization follows `IngredientSearch.kt`: lowercase, NFKD/accent and ligature folding, punctuation to spaces, then whitespace collapse.

| Normalized key | Current exact owner | Proposed disposition |
|---|---|---|
| `thinai flour` | None | Add only to `ingredient-ref-foxtail-millet-flour`. |
| `thinai` | None | Add to the existing foxtail-millet grain row; the picker also returns the flour row because of `thinai flour`. |
| `thinai maavu`, `thinai mavu`, `tenai flour`, `foxtail flour`, `kangni flour`, `kangni atta`, `korra flour`, `navane flour`, `kaon flour`, `kakum flour` | None | Leave inactive. |
| `ingredient-ref-thinai-flour` | None | No new ID is proposed. |
| `ingredient-ref-foxtail-millet-flour` | Target reference and matching ledger record ID | Retain the current ID. |
| `foxtail millet flour`; `farine de millet d'Italie` | `ingredient-ref-foxtail-millet-flour` | Retain current displays. |
| `foxtail millet`; `millet d'Italie` | `ingredient-ref-foxtail-millet` | Keep on the grain identity. |
| `millet flour`; `farine de millet` | `ingredient-ref-millet-flour` (and the broader `millet flour` phrase also occurs in species-qualified flour displays) | Retain the generic flour identity; do not add an unqualified alias. |

The pre-integration phrase-containment projection compared with the integrated aliases is:

| Query | Current result | With integrated aliases | Effect |
|---|---|---|---|
| `thinai flour` | No result | `ingredient-ref-foxtail-millet-flour` only | The qualified candidate selects the existing flour row alone. |
| `thinai` | No result | `ingredient-ref-foxtail-millet` and `ingredient-ref-foxtail-millet-flour` | The base-grain alias and phrase containment offer grain and flour as distinct choices. |
| `thinai maavu`; `tenai flour` | No result | No result | Unreviewed variants remain inactive. |
| `foxtail millet flour` | Foxtail-millet flour only | Same | Existing English name remains unique. |
| `foxtail millet` | Foxtail-millet grain and flour | Same | Both qualified identities remain visible. |
| `millet flour` | Finger-, foxtail-, kodo-, generic-, pearl-, and proso-millet flour | Same | Existing broad phrase remains a multiple-choice search. |
| `farine de millet d'Italie` | Foxtail-millet flour only | Same | Existing French display remains unique. |
| `millet d'Italie` | Foxtail-millet grain and flour | Same | Grain and flour remain available under the shared source-grain wording. |

This is a static projection using the current search-term and word-phrase logic, not a runtime picker test.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned across parsed string fields and ingredient-row fields using project-style case/accent/punctuation normalization. The scan included `thinai flour`, `thinai`, `thinai maavu`, `thinai mavu`, `tenai flour`, the foxtail flour and grain names, `farine de millet d'Italie`, other reviewed foxtail terms, and `ingredient-ref-foxtail-millet-flour`.

- Recipe files with a candidate phrase: **0**.
- Ingredient rows with a candidate phrase: **0**.
- Direct ingredient links to `ingredient-ref-foxtail-millet-flour`: **0**.

No recipe link, amount, instruction, or recipe edit is proposed. The alias is supported by current Canadian wording and official grain-name evidence, not by bundled recipe demand.

## Measurements, density, and substitutions

Keep active `defaultDensity: null` and `unitMappings: []`. Health Canada's Canadian Nutrient File lists generic `Grains, millet, flour` (food code 6186) with `250 mL = 125.7 g` and `1 serving = 20.0 g` [S06]. The food description does not specify foxtail millet, so neither its portion nor its implied bulk value can be assigned to this species-qualified row. The Québec directory's `1/4 cup (52 g)` value is likewise attached to an unspecified Cuisine Soleil millet flour [S05]. These are useful local comparators, not measurements for the proposed Thinai/foxtail product.

Subramanian and Viswanathan report laboratory bulk-density values of **502.6–534.9 kg/m³ (0.5026–0.5349 g/mL)** for foxtail millet flour across their tested flour-moisture range of 11.1–42.8% dry basis [S07]. These are moisture-dependent study measurements of flour samples, not a settled household cup measure or a retail Thinai-flour default. Integrated as two source-scoped density endpoint observations; `measurementState` is `researched_supported`, while active density and unit mappings remain empty.

A 2023 bread-ready-mix study tested foxtail millet flour at multiple proportions in a defined wheat-flour formulation and reported its study-specific blend result at 30% [S08]. This is evidence about one formula and its tested ingredients/process, not a general replacement ratio for wheat flour, rotis, dosa, baking, thickening, or other recipes. Integrated as a blocked research finding with `substitutionResearchState: blocked_pending_evidence`; no global or contextual substitution, yield, form conversion, or recipe-line link was added.

## Integration record

1. Added `thinai flour` to `aliasesEn` on `ingredient-ref-foxtail-millet-flour` and `thinai` to `aliasesEn` on `ingredient-ref-foxtail-millet`; retained both displays and all empty/null runtime fields.
2. Added source evidence S01–S08 to the flour ledger record and S01–S02 to the grain record, with accepted decisions. Reused the already recorded OQLF source `WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S07` instead of duplicating its source ID.
3. Recorded the two endpoints of the moisture-dependent foxtail-flour bulk-density range as study-specific measured observations; set `measurementState: researched_supported` while leaving active numeric fields empty. Recorded the formula-limited bread finding and set `substitutionResearchState: blocked_pending_evidence`; added no runtime substitution.
4. Added no new reference, form, legacy candidate, French alias, recipe link, measure, conversion, yield, or active substitution. The broader WP02 A6 checklist remains open.

The generated ingredient catalog index was refreshed. Static package, ledger-schema, source-ID, picker-projection, recipe-corpus, UTF-8, and whitespace checks passed. No app tests or emulator checks were run for this database-data update.

## Sources

All new sources below were checked on 2026-10-13. Sources S01–S08 are recorded in the research ledger under these IDs; S01–S02 are attached to both the grain and flour records.

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-A6-THINAI-FOXTAIL-FLOUR-ALIAS-20261013-S01** | Food Safety and Standards Authority of India, [Guidance Note: Millets — the Nutri-Cereals](https://www.fssai.gov.in/upload/uploadfiles/files/Guidance_Notes_Version_2_Millets_29_01_2020.pdf), Version 2 (2020), language names table. Lists foxtail millet with Tamil `Tenai, Thinai`. | Government food-safety guidance used for grain-name mapping. It is not a flour standard, Canadian label, or support for health claims or recipe behavior. |
| **WP02-A6-THINAI-FOXTAIL-FLOUR-ALIAS-20261013-S02** | Tamil Nadu Agricultural University, [Foxtail millet (Tenai) — package of practices](https://www.agritech.tnau.ac.in/agriculture/minormillets_tenai.html). Identifies foxtail millet as *Setaria italica* and uses the Tamil form `Tenai`. | University crop-production page. It supports the grain identity and spelling context, not a flour grade or Canadian market label. |
| **WP02-A6-THINAI-FOXTAIL-FLOUR-ALIAS-20261013-S03** | TastyGrain, Kitchener, Ontario, [Foxtail Millet Flour - NFS](https://www.tastygrain.ca/products/foxtail-millet-flour-nfs). Product title names the flour; the description says it is made from foxtail millet (Thinai). | Canadian retailer/product page. Its listed 500 g package, grinding details, marketing and recipe suggestions are not generalized or used as measurements/substitutions. Availability text is inconsistent; no stock claim is relied on. |
| **WP02-A6-THINAI-FOXTAIL-FLOUR-ALIAS-20261013-S04** | Eraa Supermarket, Greater Toronto Area, [Eraa Thinai Flour](https://eraa.ca/products/eraa-thinai-flour). The exact product title uses `Thinai Flour`. | Canadian retailer listing does not state a botanical species. Used only for Canadian phrase usage; not enough on its own to map the product to *Setaria italica*. |
| **WP02-A6-THINAI-FOXTAIL-FLOUR-ALIAS-20261013-S05** | Ministère de l'Agriculture, des Pêcheries et de l'Alimentation du Québec, [Répertoire des aliments québécois: Cuisine Soleil organic millet flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223769), last updated 2026-04-09. Lists `Organic Millet Flour`; ingredient statement is `Organic millet flour`; nutrition label gives 1/4 cup (52 g). | Québec product-directory listing does not identify a millet species. The serving amount is not transferred to foxtail-millet flour. |
| **WP02-A6-THINAI-FOXTAIL-FLOUR-ALIAS-20261013-S06** | Health Canada, [Canadian Nutrient File serving sizes, food code 6186](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=6186). Names generic `Grains, millet, flour` / `Grains céréaliers, millet, farine`; lists 250 mL = 125.7 g and one 20.0 g serving. | Does not specify *Setaria italica*; not assigned to the foxtail/Thinai row or active conversion data. |
| **WP02-A6-THINAI-FOXTAIL-FLOUR-ALIAS-20261013-S07** | Subramanian and Viswanathan, [“Bulk density and friction coefficients of selected minor millet grains and flours”](https://doi.org/10.1016/j.jfoodeng.2006.09.026), *Journal of Food Engineering* 81(1) (2007), 118–126. Reports 502.6–534.9 kg/m³ for foxtail millet flour across tested flour moisture levels. | Laboratory, moisture-dependent property data, not a household cup measure, Canadian product density, or universal default. No recipe values are imported. |
| **WP02-A6-THINAI-FOXTAIL-FLOUR-ALIAS-20261013-S08** | [“Quality characterization, bread making properties and storage stability of foxtail millet incorporated bread ready-mix”](https://doi.org/10.1016/j.jspr.2023.102208), *Journal of Stored Products Research* 104 (2023), article 102208. Tests foxtail millet flour in wheat bread ready-mix formulations and reports a study-specific result for the 30% blend. | One defined formulation and evaluation; it does not support a general household substitution ratio or active contextual rule. |

**Reused existing ledger source:** `WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S07`, Office québécois de la langue française, [millet des oiseaux, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506452/millet-des-oiseaux), checked again on 2026-10-13. It identifies *Setaria italica*, lists preferred `millet d'Italie`, and notes the bird-feed association of `millet des oiseaux`. It is terminology for the grain, not a Thinai or flour-specific term; reuse this existing ID rather than adding a duplicate source record.

## Disposition

**Integrated:** `thinai flour` is the sole English alias on the existing foxtail-millet-flour row, and `thinai` is an English alias on the existing foxtail-millet grain row to keep the picker result clear. Unsupported regional variants and French wording remain inactive. The ledger holds the study-specific density endpoints and formula-specific bread finding; runtime density, mappings, and substitutions remain empty. No recipe links were added. This closes one regional flour-name gap; the broad A6 task remains open.
