# WP03 Section F — common-millet `cheena` alias review (2026-10-13, round 18)

## Review record

- **Status:** Proposal packet; root integration completed 2026-10-13.
- **Scope:** Review the regional name `cheena` and the sourced phrase `cheena millet` for the existing species-qualified grain reference `ingredient-ref-common-millet`.
- **Next-gap selection:** Round 15 added `chena`, round 16 added `barri`, and round 17 added `cheno` to common millet. Those packets each left `cheena` for separate review. This packet addresses that remaining spelling; it does not repeat the finger-millet-rava hold (round 12) or black-fonio `iburu` alias (round 13).
- **Plan location:** The updated Section F common-millet checklist is at [plan lines 2172–2179](../../RecipeBook-global-ingredient-catalog-plan.txt#L2265); it records the species and all six English aliases, including the two added by this packet.
- **Recommendation:** Add only **`cheena` and `cheena millet`** to `aliasesEn` for `ingredient-ref-common-millet`. Preserve the French display `millet commun`, keep French aliases empty, and leave the separate proso-millet-flour row unchanged.

## Identity and evidence boundary

The Indian Council of Agricultural Research's Indian Institute of Millets Research (ICAR–IIMR) currently groups English `Proso Millet` with Bengali and Punjabi `Cheena`; the page footer reports an update on 2026-07-07. This primary crop-name table supports the regional spelling-to-crop mapping. It does not establish Canadian or Québec consumer usage. Its URL is already in the ledger under the existing proso-millet source ID and is reused here rather than registered again [reused `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S03`].

The Government of Canada's TERMIUM Plus record maps Latin *Panicum miliaceum* to `cheena millet` as a correct, standardized English term in botany and grain growing. The record itself is dated 2016-03-10. This is authoritative Canadian terminology evidence, not a current package declaration or proof that the term is widely used in Canadian recipes. A current-indexed-result check exposed the entry; direct page retrieval returned a cache miss [S01].

Agriculture and Agri-Food Canada's GRIN-Global-CA identifies *Panicum miliaceum* L. subsp. *miliaceum*, lists India common names `cheena` and `chin`, and records human food use as cereal. The page reports a modification date of 2019-03-01. It is a Canadian government taxonomic and germplasm resource, not a current Canadian label; direct retrieval returned a cache miss, so the page content was verified from the current indexed result [S02].

The Canada-facing Desertcart product page title calls a 1 kg item **“Superior Proso Millet”** and includes `Cheena` in its alternate-name list. The indexed page was crawled three weeks before this review and showed a Canadian-dollar listing. It says Desertcart obtains products on the buyer's behalf from other markets; the title is marketplace product copy, not a verified Canadian package label or stable local inventory record [S03]. Taken together, the primary Indian crop crosswalk, Canadian government terminology and taxonomy, and Canada-facing product wording support a search alias for the existing common-millet grain. They do not support a new ingredient identity, processing state, or recipe measure.

For Québec French, the Office québécois de la langue française (OQLF) GDT identifies *Panicum miliaceum*, gives `millet commun` as a preferred term, and lists `common millet` and `proso millet` in English. The entry was last updated in 2010 and does not mention Cheena [reused `WP03-S180`]. Mayrand's current Québec listing calls its product `Graines de millet crues 1 kg`; it does not identify the species or use Cheena. This supports keeping the established French display, but it does not establish a French alias such as `millet cheena` [reused `WP03-COMMON-CHENA-ALIAS-20261013-R15-S02`].

Health Canada's crop-group listing keeps proso millet (*Panicum miliaceum* subsp. *miliaceum*) distinct from other millet species. It supports the existing species boundary rather than the Cheena spelling or any consumer-measure claim [reused `WP03-S181`].

| Candidate or neighbor | Decision | Boundary |
|---|---|---|
| `cheena` | Add as an English alias on `ingredient-ref-common-millet`. | ICAR–IIMR and AAFC connect the spelling with proso millet / *Panicum miliaceum*; the Canada-facing product listing also uses it on a proso-millet grain item. |
| `cheena millet` | Add as an English alias on the same row. | TERMIUM explicitly assigns the phrase to *Panicum miliaceum*. Adding the whole phrase makes the Canadian terminology search resolve to the species-qualified grain. |
| `cheena flour`, `cheena atta`, and other flour-qualified terms | Leave unassigned. | Sources reviewed here support grain wording. They do not establish these flour names on a Canadian or Québec product. Keep `ingredient-ref-proso-millet-flour` separate with its current aliases. |
| `millet cheena` and French Cheena spellings | Leave unassigned. | Neither OQLF nor the reviewed Québec product page uses Cheena. Keep `millet commun` as the French display. |
| Generic `millet` / `mil` | Keep current ownership unchanged. | This proposal does not broaden the species-qualified row to generic millet terms or other millet taxa. |
| Birdseed, feed, flour, cooked grain, and prepared cereal products | Do not create additional identities or forms. | The proposal covers the edible cereal grain name only. It does not encode feed use, kernel preparation, a cooked state, or a processed product. |

## Proposed catalog delta

| Field | Current | Proposed |
|---|---|---|
| ID | `ingredient-ref-common-millet` | Unchanged |
| English display | `common millet` | Unchanged |
| French display | `millet commun` | Unchanged |
| English aliases | `chena`, `proso millet`, `barri`, `cheno` | Append only `cheena` and `cheena millet` |
| French aliases | `[]` | Unchanged |
| Category | `GRAIN_AND_CEREAL` | Unchanged |
| Default density / unit mappings | `null` / `[]` | Unchanged |
| Forms, recipe links, substitutions | None | None |

No new reference, form, flour alias, recipe link, grain-to-flour relation, conversion, or substitution is proposed.

## Exact ownership and picker projection

The read-only ownership audit checked active ingredient names and aliases, all ingredient-form labels and match terms, legacy import candidates, and ledger record IDs. Search projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize spelling and accents, prefer complete word-phrase matches, then fall back to partial matching. This is a static projection of source and code, not runtime picker or emulator QA.

| Surface | Current finding |
|---|---|
| Active ingredient references | No exact owner for `cheena`, `cheena millet`, `cheena flour`, or `cheena atta`. `ingredient-ref-common-millet` currently owns `common millet / millet commun` with English aliases `proso millet`, `chena`, `barri`, and `cheno`. `ingredient-ref-proso-millet-flour` remains a separate milling product. |
| Ingredient forms | 98 forms checked; no common-millet form and no exact Cheena label or match term. |
| Legacy import candidates | 64 candidates checked; no exact Cheena candidate. |
| Research ledger | 1,658 records checked; no Cheena record ID, source, or accepted decision. The current IIMR source record already backs the related spellings and is reused for Cheena; the source URL is repeated under several other millet source IDs, so retain the existing proso-specific source ID. |
| Proposal and batch archive | No accepted Cheena decision found before this packet. R15–R17 each left Cheena as the remaining spelling for separate review. No R18 filename or proposed R18 source ID exists yet. |

| Query | Current projection | With only `cheena` and `cheena millet` added |
|---|---|---|
| `cheena` | No result | `ingredient-ref-common-millet` only |
| `cheena millet` | No result | `ingredient-ref-common-millet` only |
| `cheena flour` / `cheena atta` | No result | No result; grain aliases do not establish a flour identity |
| `millet cheena` | No result | No result; no French or reversed-word-order alias is proposed |
| `chena` / `cheno` | Common millet only | Same result |
| `barri` | Common millet and proso-millet flour | Same two results; the separate `barri flour` alias still makes the flour row a result for the bare word |
| `proso millet` | Common millet and proso-millet flour | Same two results |
| `proso millet flour` | Proso-millet flour only | Same result |
| `common millet` | Common millet only | Same result |
| `millet commun` | Common millet and proso-millet flour | Same two results |
| `millet` | 18 existing generic, species, flour, and processed-millet results | Same 18 results |

This fills the two exact zero-result searches established by Canadian terminology and product wording. It leaves flour-qualified, Québec French, and broad millet searches unchanged.

## Recipe demand

All **114** manifest-listed recipe files and **1,123** ingredient rows were scanned. Whole-phrase scans of serialized recipe text and ingredient-row values for `cheena`, `cheena millet`, `cheena flour`, `cheena atta`, `chena`, `cheno`, `barri`, `proso millet`, `common millet`, and `millet commun` found **zero recipe-file hits and zero ingredient-row hits**. There are **zero direct links** to `ingredient-ref-common-millet`. This is a terminology coverage decision; no recipe demand or recipe edit is proposed.

The manifest-ordered recipe corpus contains **753,792 bytes** and has fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`. The digest hashes each manifest-relative recipe path, a NUL byte, exact file bytes, and a trailing NUL byte in manifest order.

## Measures and substitutions

- The existing common-millet ledger has `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`; the reference has `defaultDensity: null`, `unitMappings: []`, and no forms.
- No common-millet reference occurs in the live package-yield, global substitution, contextual substitution, or units JSON files. Add no volume-to-mass mapping, package yield, dry/cooked form, density, serving, cooking ratio, or preparation conversion.
- The 1 kg marketplace and Mayrand packages give net product mass only, not a recipe quantity, volume measure, density, or cooking yield. Availability and prices may change.
- Add no global or contextual substitution rule and no recipe-line substitution link. The reviewed sources identify a grain name; they do not establish a recipe-specific replacement, role, method, or ratio.

## Source-ID and URL audit

The live snapshot contains **1,345 active references**, **98 forms**, **64 legacy candidates**, and **1,658 ledger records** with **6,435 source entries**, **5,389 distinct source IDs**, and **4,479 distinct URLs**. These counts were checked after R17 integration and before this proposal was written.

The exact URLs proposed for new source IDs S01–S03 and the corresponding IDs were absent from the live ledger and catalog archive. Existing sources are reused without minting a second ID:

| Source ID | Exact URL / collision handling |
|---|---|
| `WP03-CHEENA-MILLET-ALIAS-20261013-R18-S01` (new) | TERMIUM Plus English `BROOM MILLET` record URL: `https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enw&lang=eng&srchtxt=BROOM+MILLET`. Exact URL and ID absent from the live ledger. |
| `WP03-CHEENA-MILLET-ALIAS-20261013-R18-S02` (new) | AAFC GRIN-Global-CA taxon URL: `https://pgrc-rpc.agr.gc.ca/gringlobal/taxon/taxonomydetail?id=26567`. Exact URL and ID absent from the live ledger. |
| `WP03-CHEENA-MILLET-ALIAS-20261013-R18-S03` (new) | Desertcart Canada product URL: `https://canada.desertcart.com/products/885364060-superior-proso-millet-1-kg-premium-whole-grain-source-dietary`. Exact URL and ID absent from the live ledger. |
| Reuse `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S03` | IIMR URL `https://millets.res.in/millets_info.php`, already registered against common millet and proso-millet flour. The same base URL also appears under kodo- and other millet source IDs. Reuse the proso-millet crosswalk ID, and do not create another URL record. |
| Reuse `WP03-S180` | OQLF `millet commun` URL, already on common millet and also cited for proso-millet flour. |
| Reuse `WP03-S181` | Health Canada crop-groups URL, already on common millet and many taxonomy records. |
| Reuse `WP03-COMMON-CHENA-ALIAS-20261013-R15-S02` | Mayrand raw millet listing URL, already registered on common millet. Use only for current generic Québec product wording and package-size context. |

The A1 listing source `WP03-COMMON-CHENA-ALIAS-20261013-R15-S01` is not used as Cheena evidence: its title lists `Chena / Cheno / Barri`, not the reviewed `Cheena` spelling. This avoids carrying a source ID across a spelling the page does not show.

No new catalog ID, ledger record ID, measurement ID, yield ID, substitution ID, or recipe link is proposed. Root can attach any accepted alias decision to the existing `ingredient-ref-common-millet` record and reuse the cited source IDs where noted.

## Source register

Sources were checked on 2026-10-13. New source IDs below are proposal-time IDs for root to register if it accepts the recommendation. Existing shared IDs are explicitly marked reused.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-CHEENA-MILLET-ALIAS-20261013-R18-S01` | Translation Bureau, Government of Canada, [TERMIUM Plus: BROOM MILLET](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enw&lang=eng&srchtxt=BROOM+MILLET), record dated 2016-03-10; botany and grain growing. | Lists `cheena millet` as a correct, standardized English term for *Panicum miliaceum*. The individual terminology record is older; current indexed content was available, but direct fetch returned a cache miss. Terminology support does not establish present consumer frequency or a product label. |
| `WP03-CHEENA-MILLET-ALIAS-20261013-R18-S02` | Agriculture and Agri-Food Canada, [GRIN-Global-CA: *Panicum miliaceum* L. subsp. *miliaceum*](https://pgrc-rpc.agr.gc.ca/gringlobal/taxon/taxonomydetail?id=26567), common-names and economic-use sections. | Lists India common names `cheena` and `chin`, and human food use as cereal. Page modification date is 2019-03-01; direct fetch returned a cache miss, so indexed content was checked. It is a government taxonomic resource, not current Canadian product naming. |
| `WP03-CHEENA-MILLET-ALIAS-20261013-R18-S03` | [Desertcart Canada: Superior Proso Millet 1 kg](https://canada.desertcart.com/products/885364060-superior-proso-millet-1-kg-premium-whole-grain-source-dietary), product title and alternate-name wording. | Canada-facing listing uses `Cheena` in the product title's alternate-name list. The search index reports a crawl three weeks before review; direct fetch returned a cache miss. Desertcart says it purchases items on buyers' behalf from other markets, so this is current marketplace copy rather than proof of Canadian manufacture, an inspected package, or stable stock. The 1 kg is package mass only. |
| Reused `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S03` | ICAR–IIMR, [Millets Information: common names in Indian languages](https://www.millets.res.in/millets_info.php), Proso Millet entry, lines 164–174; page updated 2026-07-07. | Primary current table lists Bengali and Punjabi `Cheena` for English `Proso Millet`. Direct page retrieval succeeded. It establishes the regional crop crosswalk, not Canadian/Québec use. The same ledger ID is reused; the ledger summary can be broadened to include this exact Bengali/Punjabi spelling without duplicating the URL. |
| Reused `WP03-S180` | OQLF, [GDT: millet commun](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506451/millet-commun), preferred terms, translations, and Latin name. | Official Québec terminology supports `millet commun`, *Panicum miliaceum*, `common millet`, and `proso millet`. Last updated 2010; it does not mention Cheena. |
| Reused `WP03-S181` | Health Canada, [Residue Chemistry Crop Groups](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html), cereal-grain subgroup. | Lists proso millet (*Panicum miliaceum* subsp. *miliaceum*) separately from other millet taxa. Regulatory crop-group evidence only; it does not establish a consumer alias or kitchen quantity. |
| Reused `WP03-COMMON-CHENA-ALIAS-20261013-R15-S02` | Mayrand, [Graines de millet crues 1 kg](https://mayrand.ca/fr/nos-produits/fruits-et-legumes/noix-et-fruits-secs/noix-et-fruits-secs-vrac/graine-de-millet-crue-mayrand-chef-27825), product and store-availability sections. | Current Québec retail page provides generic French grain wording and a 1 kg package; it showed stock in several Québec stores when checked, which may change. It does not identify *Panicum miliaceum* or use Cheena. Package mass is not a recipe measure. |

## Disposition

**Recommend appending `cheena` and `cheena millet` to `aliasesEn` on `ingredient-ref-common-millet`.** The first spelling is supported by the current primary ICAR–IIMR crop-name table, AAFC's taxon record, and a Canada-facing millet product listing; the complete phrase is separately supported by TERMIUM for *Panicum miliaceum*. Keep `millet commun` as the French display because OQLF supports it and the current Québec product wording is generic. Do not add Cheena flour terms, forms, measures, yields, conversions, or substitutions. The bundled recipe corpus has no matching demand.

## Root integration status

**Root integration complete.** Added `cheena` and `cheena millet` to the English aliases for `ingredient-ref-common-millet`. See the [round-eighteen integration record](../batches/wp02-wp03-wp04-round18-gap-review-integration-20261013/README.md).
