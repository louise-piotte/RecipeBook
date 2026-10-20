# WP02 A6 round 19: Panivaragu / Proso millet grain and flour alias boundary — 2026-10-13

## Review record

- **Reviewed:** 2026-10-13.
- **Scope:** Revisit the open Tamil-name boundary after round 18. Decide whether the closed spelling `panivaragu` belongs on the existing proso/common-millet grain identity and whether `panivaragu maavu` belongs on its existing flour identity.
- **Disposition:** Add `panivaragu` to `ingredient-ref-common-millet` and `panivaragu maavu` to `ingredient-ref-proso-millet-flour`. Keep the spaced spellings `pani varagu` and `pani varagu maavu` inactive because of the live picker's `pani` query behavior. No new identity, form, French alias, measure, conversion, yield, recipe link, or substitution.
- **Prior boundary:** Round 2 left `Pani Varagu Maavu` and `Panivaragu Mavu` unassigned because regional grain-name evidence and the maker's name list did not yet establish a Canadian-search term. Round 18 again kept `pani varagu` unassigned to preserve the official distinction between Proso Millet `Pani varagu` and Kodo Millet `Varagu`.
- **Why this is reconsidered:** The current ICAR–IIMR crosswalk still maps Tamil `Pani varagu` to Proso Millet and separately maps `Varagu` to Kodo Millet. Current product pages now directly identify proso flour as `Panivaragu Maavu`; a current Calgary local-store catalogue also labels proso grain `Panivaragu`. A Canada-locale flour listing uses the same closed spelling, though its search snapshot is stale and the page blocked direct retrieval. This supports the closed search spelling on existing identities, not a new ingredient or a claim of current Canadian stock.
- **Status:** Integrated on 2026-10-13; root integration complete.

## Exact proposed ownership

Add only these two English search aliases:

| Existing reference | Current identity | Proposed alias | Boundary |
|---|---|---|---|
| `ingredient-ref-common-millet` | `common millet / millet commun`, *Panicum miliaceum*, `GRAIN_AND_CEREAL` | `panivaragu` | Grain name only; do not assign it to kodo. |
| `ingredient-ref-proso-millet-flour` | `proso millet flour / farine de millet commun`, `FLOUR_AND_STARCH` | `panivaragu maavu` | Flour name only; do not create a separate product form or reference. |

Keep the existing displays and categories, all French fields, density and unit-mapping values, forms, recipe links, and substitution state unchanged. Do not add the spaced keys `pani varagu` or `pani varagu maavu`, the spelling `panivaragu mavu`, `panivaragu flour`, `pani varagu flour`, `panivaragu atta`, or a French transliteration.

### Why the spaced form stays inactive

The authoritative crosswalk uses the two-word Tamil transliteration `Pani varagu`, and a current Sempulam product title says `Proso Millet Flour / Pani Varagu Maavu`. However, `IngredientSearch.kt` returns any whole-word phrase hit before trying substring fallback. The current query `pani` returns four partial results: narrow-barred Spanish mackerel, Spanish onion, spotted Spanish mackerel, and yeast. Adding `pani varagu` as an alias would create a whole-word `pani` hit and suppress those existing partial results. Adding `pani varagu maavu` would do the same through its first token. The closed form is supported independently by a current Calgary proso-grain listing and the current Organic Mandya flour page. With only `panivaragu` / `panivaragu maavu`, `pani` remains a substring query and preserves the existing partial results while adding the proso choices.

This is a picker-specific spelling boundary, not a claim that `Pani varagu` is incorrect Tamil. The full spaced phrases remain documented source wording but are intentionally not active aliases until phrase/partial matching can retain both result sets.

## Evidence and current Canada/Québec limits

1. **Primary crop-name mapping — reuse existing source.** ICAR–Indian Institute of Millets Research's live [Millets Information](https://millets.res.in/millets_info.php) table lists Tamil `Pani varagu` under Proso Millet and Tamil `Varagu` under Kodo Millet; the footer says the page was updated 2026-07-07. This verifies the species boundary, not a flour name, Canadian availability, a household measure, or French terminology. The URL is already registered as `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S03`; reuse it and expand its locator/support if root records this decision.
2. **Current flour product page — reuse existing source.** Organic Mandya's current [Proso Millet Flour](https://organicmandya.com/products/proso-millet-flour-500-gm) page identifies its product as finely milled proso millet flour and says the Tamil name is `Panivaragu Maavu`. The live product page was retrieved on 2026-10-13 and crawled last month. It is an Indian maker page, not a Canadian product label or guarantee of Canadian distribution. The URL and source ID `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S02` are already recorded; reuse them, updating the locator to include this exact spelling rather than creating another entry.
3. **Current Canadian grain terminology.** A search-indexed [BuyNearby Calgary local-store listing](https://buynearby.store/calgary/desiindianmarket?city=calgary&filter_cat=3259&lang=te&store=desiindianmarket) shows `Proso Millet (Panivaragu) 2lb`; the listing was crawled about three weeks before this review. Direct fetch failed, so this supports observed local search wording only; it does not establish a package ingredient declaration or current stock. This is grain evidence, not a Canadian flour-label source.
4. **Canada-locale flour wording, limited snapshot.** A [Silkrute Canada listing](https://www.silkrute.ca/grocery/cooking/flour/proso-millet-flour-1-kg-35.27-oz/) is titled `B&B Organics Proso Millet Flour, 1 kg ... / Panivaragu Mavu`. Its indexed page was crawled about four months before review and direct fetch returned 403. Use it only as corroboration that a Canada-localized listing has used the closed regional spelling for proso flour; do not claim current availability, Canadian manufacture, independent terminology authority, or an exact `maavu` spelling from this page. Its 1 kg is package mass, not a recipe measure. The same retailer domain has an unrelated Kodo/Varagu listing in round 18; this is a different product URL and needs its own source ID.
5. **Current Canadian proso-flour context — reuse existing source.** Little India Grocers' live [Atta and Flour catalogue](https://littleindiagrocers.ca/shop/flour-19949) currently lists `S&V PROSO MILLET FLOUR 2L`; the page identifies the store at Thornhill, Ontario. It confirms current local proso-flour category context, but does not use `Panivaragu`. The URL is already registered as `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S07`; reuse it. The product's `2L` listing does not provide flour mass or density.
6. **Québec French and display boundary — reuse existing source.** OQLF's [millet commun](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506451/millet-commun) entry identifies *Panicum miliaceum*, prefers `millet commun`, and lists English `proso millet`. It was last updated in 2010 and was rechecked online on 2026-10-13. It does not list `Pani varagu`, `Panivaragu`, or a millet-flour term. Keep `farine de millet commun`; add no French alias. Reuse the existing OQLF source on the flour record (`WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S04`) rather than duplicating the URL.

The evidence change since round 2 is therefore specific: we now have an exact current flour product page for the closed `Panivaragu Maavu` spelling, current Canadian grain usage of `Panivaragu`, and a Canada-locale proso-flour listing with the closed spelling. The Canada-locale flour page is stale and inaccessible directly, so it is corroboration only. No current Québec product or authority source was found for the regional spelling. That limitation rules out a French alias and any claim that this term is common across Canadian retail; it does not prevent a bounded English search alias on the verified proso identities.

## Ownership and picker projection

The live seed has 1,345 ingredient references and 98 forms; the legacy candidate file has 64 entries and the research ledger has 1,658 records. Exact normalized ownership was checked across reference names/aliases, form labels/match terms, legacy names/aliases, and ledger record IDs. Neither proposed alias currently has an active reference, form, legacy, or record-ID owner. Prior proposal text and source notes mention these words, but do not create picker ownership.

| Exact key / ID | Current owner | Proposed result |
|---|---|---|
| `panivaragu` | none | `ingredient-ref-common-millet` only as a grain alias. |
| `panivaragu maavu` | none | `ingredient-ref-proso-millet-flour` only as a flour alias. |
| `pani varagu`; `pani varagu maavu` | none | Remain inactive to preserve `pani` partial-query behavior. |
| `panivaragu mavu`; `panivaragu flour`; `pani varagu flour` | none | Remain inactive; no exact support for these spellings/phrases. |
| `varagu`; `varagu maavu` | `ingredient-ref-kodo-millet`; `ingredient-ref-kodo-millet-flour` respectively | Keep on the existing kodo records; do not transfer to proso. |
| `ingredient-ref-common-millet`; `ingredient-ref-proso-millet-flour` | Existing verified grain and flour identities | Reuse; create no IDs. |

The static projection follows `IngredientSearch.kt`: complete normalized word-phrase matches are returned when present; otherwise substring fallback runs. Forms are included in the term set. With only the proposed closed aliases added in memory:

| Query | Current results | With proposed aliases |
|---|---|---|
| `pani` | Four substring results: narrow-barred Spanish mackerel, Spanish onion, spotted Spanish mackerel, yeast. | Same substring results plus common millet grain and proso millet flour. It remains fallback matching; the existing results are not suppressed. |
| `panivaragu` | none | Common millet grain and proso millet flour; deliberate grain/flour choice. |
| `panivaragu maavu` | none | Proso millet flour only. |
| `pani varagu` / `pani varagu maavu` | none | none; intentionally held spaced forms. |
| `panivaragu mavu` / `panivaragu flour` | none | none; unreviewed spellings/phrases. |
| `varagu` | Kodo grain and kodo flour | Same two kodo results. Closed `panivaragu` is a different token and does not broaden the query. |
| `varagu maavu` | Kodo flour only | Same kodo-flour result. |
| `proso millet` | Common millet grain and proso millet flour | Same two existing choices. |
| `proso millet flour`; `farine de millet commun` | Proso millet flour only | Same flour result. |

This intentionally leaves the current official spaced phrase unmatched in the picker. Adding it now would introduce the bare-`pani` result suppression described above. The closed form preserves the kodo/proso distinction in the existing search behavior.

## Bundled recipe demand

The scan covered all **114** manifest-listed recipe files and **1,123** ingredient rows. It searched serialized recipe text and row fields for `panivaragu`, `panivaragu maavu`, the spaced forms, `pani varagu flour`, `panivaragu mavu`, both proso target IDs, and `Panicum miliaceum`.

- Candidate-string hits: **0** files and **0** ingredient rows.
- Direct ingredient-reference links to `ingredient-ref-common-millet`: **0**.
- Direct ingredient-reference links to `ingredient-ref-proso-millet-flour`: **0**.
- Recipe edits, relinks, or recipe-level substitution rules: **none**.

The proposal is supported by product naming and picker coverage, not bundled recipe demand.

## Measurement, product-form, and substitution boundaries

The current proso flour row remains `defaultDensity: null` and `unitMappings: []`; its ledger state is already `measurementResearchState: researched_no_supported_value`. Do not promote the 400 g Sempulam, 500 g Organic Mandya, or 1 kg Silkrute package masses to cup values or flour density. The Canadian `2L` retail title supplies neither package mass nor a household scoop convention. The existing 0.79 g/mL observation belongs to intact proso grain measured with a cylinder and tapping, not to flour. No reviewed source gives a transferable flour volume-to-mass measure, and no form or yield is proposed.

The flour record remains `substitutionResearchState: blocked_pending_evidence`. Its existing findings cover (a) a particular Egyptian balady-bread formula using proso flour in an 87.5%-extraction wheat blend and (b) a separate wheat/proso bread formula optimized with specified emulsifiers and enzymes. Those experiments do not define a general replacement ratio or hydration correction for roti, chapati, bread, cakes, cookies, pastry, or thickening. This alias-only decision adds no active global or contextual substitution, recipe-line conversion, or inferred cooking use.

## Source ID and URL collision audit

Three new source IDs are proposed. They were searched in the live ledger and the proposal/batch archive on 2026-10-13 and were absent. Their exact URLs were also absent from the live ledger and archive. The direct-fetch limitations are recorded above.

| New source ID | Source and support | Limits |
|---|---|---|
| `WP02-A6-PANI-VARAGU-PROSO-ALIAS-20261013-R19-S01` | BuyNearby Calgary local-store listing, [Proso Millet (Panivaragu)](https://buynearby.store/calgary/desiindianmarket?city=calgary&filter_cat=3259&lang=te&store=desiindianmarket), search-indexed product card. | Crawled about three weeks before review; direct fetch failed. Grain wording only; no package-label or stock assertion. |
| `WP02-A6-PANI-VARAGU-PROSO-ALIAS-20261013-R19-S02` | Sempulam, [Proso Millet Flour / Pani Varagu Maavu](https://www.sempulam.com/product-page/proso-millet-flour-pani-varagu-maavu), current product title, category, and Add to Cart control. | Indian seller page, crawled last month. Supports product naming and flour identity; no Canada/Québec market or stock claim. Its spaced spelling is held from picker aliases. |
| `WP02-A6-PANI-VARAGU-PROSO-ALIAS-20261013-R19-S03` | Silkrute Canada, [B&B Organics Proso Millet Flour / Panivaragu Mavu](https://www.silkrute.ca/grocery/cooking/flour/proso-millet-flour-1-kg-35.27-oz/), indexed product title. | Crawled about four months before review; direct fetch returned 403. Corroborates Canada-locale wording only; its `Mavu` spelling is not proposed and no stock claim is made. |

Reuse these existing source IDs/URLs instead of duplicating them: `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S03` for the current IIMR crop-language table; `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S02` for Organic Mandya's current Proso Flour/Panivaragu Maavu page; `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S07` for Little India Grocers' current Canadian proso-flour listing; and `WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S04` for OQLF's millet commun entry. The IIMR URL also appears in the ledger under other millet-specific IDs; reuse the existing proso source ID for the Pani-varagu locator. The Silkrute round-18 Kodo/Varagu source is a different product URL and is not reused. No new reference, form, legacy candidate, recipe link, measurement observation, substitution finding, or finding ID is proposed.

## Root integration recommendation

1. Add `panivaragu` to `aliasesEn` on `ingredient-ref-common-millet`.
2. Add `panivaragu maavu` to `aliasesEn` on `ingredient-ref-proso-millet-flour`.
3. Preserve the current French displays and all numeric fields; add no form, recipe link, measurement, yield, conversion, or active substitution.
4. Keep spaced `pani varagu` and `pani varagu maavu` unassigned until picker behavior can preserve the existing `pani` partial results while exposing phrase hits.
5. Keep `varagu` and `varagu maavu` assigned to the existing kodo rows; do not merge kodo and proso names.
6. Reuse the existing IIMR, Organic Mandya, Little India Grocers, and OQLF source IDs. Register only the new URLs and IDs listed above if root records the local evidence.

At proposal time this packet edited no shared catalog JSON, ledger, plan, roadmap, or generated files. Root integration added only the accepted closed aliases and supporting ledger sources. No app, unit, instrumentation, or emulator tests were run under the updated `AGENTS.md` rule for database-JSON additions.
