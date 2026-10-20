# WP02 A6 review: Korra flour alias for foxtail millet flour

## Review record

- **Reviewed and sources accessed:** 2026-10-13.
- **Status:** Accepted and integrated on 2026-10-13. The existing grain and flour rows received the scoped Korra aliases, their ledger records were updated, the generated catalog index was refreshed, and the roadmap/workflow were updated. No recipe or app behavior changed.
- **Scope:** Review the regional name **Korra flour** for the existing `ingredient-ref-foxtail-millet-flour` and the source-grain name **Korra** for `ingredient-ref-foxtail-millet`. This is one spelling gap under the still-open WP02 A6 review, not a new ingredient identity.
- **Plan context:** The live A6 checklist remains open after integration of generic and species-qualified millet flours, Thinai and Kangni, plus other regional flour names. The Thinai review left `korra flour` inactive because it had not established Canadian product wording at that time. This bounded follow-up checks that exact gap with a current Canadian-facing flour listing and official grain/flour terminology. It does not reopen the brown-top, barnyard, Sikiya/crab-finger, little-millet, or sprouted-pearl holds.
- **Source IDs:** `WP02-A6-KORRA-FOXTAIL-FLOUR-ALIAS-20261013-S01` through `S03`. They were unique before integration and are now attached to the existing grain/flour ledger records.

## Recommendation (accepted)

Add **`korra flour`** as one English alias on the existing `ingredient-ref-foxtail-millet-flour` row, and add **`korra`** as an English alias on the existing `ingredient-ref-foxtail-millet` grain row. The Food Safety and Standards Authority of India (FSSAI) maps Telugu `Korra` to foxtail millet (*Setaria italica*), while an ICAR–Indian Institute of Millets Research (IIMR) technical brochure pairs `Foxtail Millet/Korra` and explicitly names `Korra flour`. A current Canada-facing product listing likewise pairs `Korra` with a product named foxtail millet flour [S01–S03].

Retain the existing displays `foxtail millet / millet d'Italie` and `foxtail millet flour / farine de millet d'Italie`; keep French aliases empty. The Québec terminology source establishes the French grain name and botanical identity but does not list Korra or name a foxtail-millet flour product. A Québec product directory uses the generic label `Farine de Millet` for a product that does not identify the millet species [reused OQLF and MAPAQ sources listed below]. Do not add `farine de Korra` or change either display.

| Wording or field | Recommendation | Evidence boundary |
|---|---|---|
| `korra flour` | Add one English alias to `ingredient-ref-foxtail-millet-flour`. | FSSAI maps Korra to foxtail millet; IIMR explicitly describes Korra flour as a foxtail-millet flour; the Canadian-facing listing pairs Korra with its foxtail-millet-flour product. [S01–S03] |
| `korra` | Add to the existing foxtail-millet grain row, not as a second bare-word flour alias. | FSSAI lists Korra as the Telugu name for foxtail millet (*Setaria italica*). With both rows searchable, a bare query can show grain and flour separately. [S01] |
| French display and aliases | Retain `millet d'Italie` and `farine de millet d'Italie`; add no French alias. | OQLF supports `millet d'Italie` for the grain. Neither OQLF nor the Québec product directory ties `Korra` to a specific French flour name. [reused OQLF source WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S07; reused MAPAQ source WP02-A6-THINAI-FOXTAIL-FLOUR-ALIAS-20261013-S05] |
| `korra pindi`, `korrala pindi`, `korra atta`, `korra biyamu`, `korralu`, `korallu`, `kora`, and `farine de Korra` | Leave inactive in this bounded review. | The sources selected here support `Korra` and `Korra flour`; they do not establish a stable Canadian/Québec alias set for the additional spellings or a French Korra product name. |
| `Korale`, `Korale flour`, `Andukorralu`, and `Andu Korralu flour` | Keep on the distinct brown-top millet hold; do not alias to foxtail millet or Korra. | The brown-top grain candidate is *Urochloa ramosa*; FSSAI/IIMR source context maps Korale/Andukorralu separately from Telugu Korra for foxtail millet (*Setaria italica*). The brown-top flour remains unallocated pending Québec French naming. [WP02 A6 brown-top flour hold review and ledger sources WP03-BTM-20261010-S01–S02] |
| New ingredient ID, form, recipe link, measure, density, conversion, yield, or substitution | Add none. | The evidence supports two names on the existing source-grain and flour identities only. |

## Identity and regional naming boundary

The FSSAI foxtail-millet profile identifies *Setaria italica* and lists `Korra` under Telugu [S01]. The ICAR–IIMR technology brochure independently uses the compound `Foxtail Millet/Korra` for the flour source and names `Korra flour` among its flour products [S02]. These sources support the grain-to-flour mapping; they do not establish a particular Canadian grind, processing specification, or household conversion.

Keep this spelling separate from the live brown-top millet flour hold: the A6 brown-top review uses `Korale flour` and `Andu Korralu flour` for the *Urochloa ramosa* candidate, while the FSSAI foxtail profile uses `Korra` (Telugu) for *Setaria italica*. The related ledger record is `candidate-brown-top-millet`; the brown-top product remains unallocated until a Québec French display is supported. Do not normalize the near-spellings into one alias family.

The Canada-facing Silkrute.ca listing is titled for B&B Organics `Foxtail Millet Flour`; its alternate-name string includes `Korra`, and its ingredient declaration says `foxtail millet flour` [S03]. It provides evidence that the regional name appears alongside this flour product in Canadian online retail wording. It is a marketplace listing for a product of Indian origin, not a Canadian manufacturer label or a Québec French naming decision. Its package quantity, availability, marketing language, and customer reviews are not used as measures or product-behavior evidence.

OQLF identifies *Setaria italica* and lists `millet d'Italie` as a preferred Québec French name for foxtail millet [existing ledger source WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S07]. The Québec Répertoire des aliments québécois lists a Cuisine Soleil product under the generic name `Farine de Millet` and declares generic organic millet flour; it does not identify *Setaria italica* [existing ledger source WP02-A6-THINAI-FOXTAIL-FLOUR-ALIAS-20261013-S05]. Keep the active species-qualified display pair, and do not use the generic product to create `farine de Korra`, replace the display, or infer a foxtail-flour measure.

## Live catalog, ledger, exact ownership, and picker audit

The baseline snapshot was refreshed from the live split seed package immediately before the Korra aliases were allocated on 2026-10-13; it includes the same-day yellow-bullhead integration. Exact-key checks use the app's current `normalizeIngredientSearchKey` behavior: lowercasing, NFKD normalization, diacritic removal, punctuation folding, and whitespace collapse. The picker checks full normalized word phrases across ingredient names and aliases before falling back to partial matches.

| Store | Snapshot | SHA-256 / fingerprint |
|---|---:|---|
| Active ingredient references | 1,336 rows; 428,033 bytes | `f65eeb4cab45f147c42569d7a7a50426e87751ab6e940b7980364e53f27f92e9` |
| Ingredient forms | 98 rows; 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import identities | 64 candidates; 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,644 records; 6,181 source entries; 5,188 distinct source IDs; 6,142,926 bytes | `f09f86669db2a1f97465027ebdf847a41b8049cf44ae969983148294183d3196` |
| Seed manifest | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The recipe fingerprint hashes each manifest-ordered relative path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte. File hashes cover exact bytes.

The integrated grain row is `ingredient-ref-foxtail-millet` (`foxtail millet / millet d'Italie`, aliases `thinai`, `kangni`, and `korra`). The integrated flour row is `ingredient-ref-foxtail-millet-flour` (`foxtail millet flour / farine de millet d'Italie`, aliases `thinai flour`, `kangni flour`, and `korra flour`). Both remain in their current categories. The flour row has `defaultDensity: null` and `unitMappings: []`; its ledger record is `identityState: verified`, `measurementState: researched_supported`, and `substitutionResearchState: blocked_pending_evidence`.

Exact normalized-key ownership was checked across active reference IDs/names/aliases, form IDs/labels/match terms, legacy candidate IDs/names/aliases, and ledger record IDs.

| Exact normalized wording or proposed ID | Before integration | After integration |
|---|---|---|
| `korra` | None across the checked stores | `ingredient-ref-foxtail-millet` |
| `korra flour` | None across the checked stores | `ingredient-ref-foxtail-millet-flour` |
| `korra pindi`; `korrala pindi`; `korra atta`; `korra biyamu`; `korralu`; `korallu`; `kora`; `farine de korra`; `ingredient-ref-korra-flour` | None | None; these terms remain inactive. |
| `foxtail millet`; `millet d'Italie` | `ingredient-ref-foxtail-millet` | Same owner and existing display/aliases retained. |
| `foxtail millet flour`; `farine de millet d'Italie` | `ingredient-ref-foxtail-millet-flour` | Same owner and existing display/aliases retained. |
| `millet flour`; `farine de millet` | `ingredient-ref-millet-flour` | Same generic flour owner remains separate. |
| `ingredient-ref-foxtail-millet`; `ingredient-ref-foxtail-millet-flour` | Corresponding active reference and ledger record IDs | Existing identities retained; no new ID. |

The static picker projection before and after integration is:

| Query | Before integration | After integration | Effect |
|---|---|---|---|
| `korra flour` | No result | `ingredient-ref-foxtail-millet-flour` only | The qualified phrase selects the existing flour row. |
| `korra` | No result | `ingredient-ref-foxtail-millet` and `ingredient-ref-foxtail-millet-flour` | Bare grain wording offers both distinct catalog choices. |
| `korra pindi`; `korra atta`; `korralu`; `Korale`; `Andukorralu` | No result | No result | Unreviewed variants stay inactive; the held brown-top candidate is not an active picker row. |
| `foxtail millet flour` | Foxtail-millet flour only | Same | Existing qualified phrase remains unique. |
| `foxtail millet` | Foxtail-millet grain and flour | Same | Existing shared source-grain phrase remains a multiple-choice search. |
| `millet flour` | Generic, finger-, kodo-, pearl-, and proso-millet flour rows | Same, with foxtail-millet flour also retained | The broad phrase remains a multiple-choice search across distinct species-qualified flours. |
| `millet d'Italie` | Foxtail-millet grain and flour | Same | Existing French grain wording continues to expose both rows. |

This is a static projection from the live search terms and picker phrase-matching code, not a runtime picker test.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned across serialized strings and ingredient-row fields with repository-style case/accent/punctuation normalization. Candidate wording included `korra`, `korra flour`, `korra pindi`, `korra atta`, `korralu`, `korallu`, the existing foxtail-millet grain and flour displays, `millet d'Italie`, and both target reference IDs.

- Recipe files with a candidate phrase: **0**.
- Ingredient rows with a candidate phrase: **0**.
- Direct links to either target reference: **0**.

No recipe link, amount, instruction, or recipe edit is proposed. This is a searchability alias review without bundled-recipe demand.

## Measurements, density, and substitutions

Keep the active flour-row fields `defaultDensity: null` and `unitMappings: []`. The existing ledger record already contains research for the underlying foxtail-millet flour identity; this alias does not change it:

- A peer-reviewed study reports a moisture-dependent bulk-density range of **0.5026–0.5349 g/mL** for its tested foxtail millet flour samples. These values remain study-specific observations, not a retail Korra-flour default or household measure. The active density remains null. [existing ledger source WP02-A6-THINAI-FOXTAIL-FLOUR-ALIAS-20261013-S07]
- Health Canada's CNF value for generic millet flour (food code 6186; 250 mL = 125.7 g, serving 20.0 g) does not identify foxtail millet. MAPAQ's Cuisine Soleil value of 1/4 cup (52 g) likewise belongs to an unspecified millet flour. Neither is assigned to this source-grain-qualified row. [existing ledger sources WP02-A6-THINAI-FOXTAIL-FLOUR-ALIAS-20261013-S06 and WP02-A6-THINAI-FOXTAIL-FLOUR-ALIAS-20261013-S05]
- IIMR's technical brochure includes product/process information and a process flour-yield figure. That is a source-specific milling output, not a kitchen measure or transferable recipe yield; no yield or unit conversion is added. [S02]
- The ledger records a defined 2023 wheat-bread ready-mix experiment as a blocked, formula-specific substitution finding. It does not establish a general replacement ratio for baking, rotis, batter, or thickening. Keep `substitutionResearchState: blocked_pending_evidence`; add no global or contextual substitution. [existing ledger source WP02-A6-THINAI-FOXTAIL-FLOUR-ALIAS-20261013-S08]

No new density, serving measure, conversion, form, yield, or substitution data is proposed. The proposal does not change the existing ledger measurement or substitution states.

## Proposal-local source register

The three source IDs below were added to the ledger during integration. Pages were accessed on 2026-10-13.

| Source ID | Source and locator | Scope and limits |
|---|---|---|
| **WP02-A6-KORRA-FOXTAIL-FLOUR-ALIAS-20261013-S01** | Food Safety and Standards Authority of India, [Foxtail Millet profile](https://fssai.gov.in/upload/EATRIGHTINDIA/Standards.pdf), Foxtail Millet (*Setaria italica*) entry and vernacular-name list. | Identifies Foxtail Millet (*Setaria italica*) and lists `Korra (Telugu)` among its vernacular names. Primary government food guidance; supports the grain-name mapping, not a Canadian product specification or cooking measure. |
| **WP02-A6-KORRA-FOXTAIL-FLOUR-ALIAS-20261013-S02** | ICAR–Indian Institute of Millets Research, [Technologies at a Glance](https://www.millets.res.in/technologies/Technologies_at_glance.pdf), section “Millets Flour.” | Pairs `Foxtail Millet/Korra`, describes dry-milled millet flour, and names `Korra flour`. Primary research-institute technology material; its milling yield, composition, storage, and process claims remain specific to that work and are not transferred to RecipeBook. |
| **WP02-A6-KORRA-FOXTAIL-FLOUR-ALIAS-20261013-S03** | Silkrute Canada, [B&B Organics Foxtail Millet Flour (500 g)](https://www.silkrute.ca/grocery/cooking/flour/product-130613/), product title and ingredient declaration. | Canada-facing marketplace listing pairs `Korra` with a foxtail millet flour product; ingredient declaration names foxtail millet flour. It is an Indian-origin product on a reseller marketplace, not a Canadian manufacturer or Québec terminology source. Package quantity and listed availability are not measures or availability claims here. |

**Reused Québec source:** Office québécois de la langue française, [millet des oiseaux, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506452/millet-des-oiseaux), existing ledger source `WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S07`. It maps foxtail millet to *Setaria italica* and lists `millet d'Italie`; it does not establish a Korra or flour-specific French term.

**Reused Québec product source:** Ministère de l'Agriculture, des Pêcheries et de l'Alimentation du Québec, [Répertoire des aliments québécois: Cuisine Soleil organic millet flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223769), existing ledger source `WP02-A6-THINAI-FOXTAIL-FLOUR-ALIAS-20261013-S05`, last updated 2026-04-09. Its generic flour identity and 1/4-cup (52 g) serving do not identify the source millet species.

**Other reused ledger evidence:** Health Canada CNF food code 6186 (`WP02-A6-THINAI-FOXTAIL-FLOUR-ALIAS-20261013-S06`), the foxtail-flour bulk-density study (`...-S07`), and the defined wheat-bread ready-mix study (`...-S08`) are already attached to the current flour reference. They remain scoped as described above; no duplicate source IDs or measurements are proposed.

## Disposition

**Root disposition (2026-10-13):** Accepted and integrated `korra` as an English alias on `ingredient-ref-foxtail-millet` and `korra flour` on `ingredient-ref-foxtail-millet-flour`. The bare `korra` picker query now offers grain and flour; the qualified phrase selects only flour. Both Québec display strings, active density/mapping fields, study-scoped measurement observations, and blocked substitution state remain unchanged. Other spellings and French Korra wording remain inactive. A6 remains open.

## Integration checks

- Static package normalization, generated-index freshness, and research-ledger schema validation passed. The post-integration ledger has 1,644 records, 6,186 source entries, and 5,191 distinct source IDs.
- Exact ownership and picker projection checks confirm `korra flour` selects only the flour row, bare `korra` selects both grain and flour, and held spellings remain unmatched. The 114-recipe / 1,123-row corpus has no Korra-related matches.
- UTF-8/no-BOM, ASCII-escaped JSON, and scoped whitespace checks passed. No app tests or emulator checks were run because this update only changes database JSON data and catalog documentation.
