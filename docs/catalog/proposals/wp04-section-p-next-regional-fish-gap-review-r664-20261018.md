# WP04 Section P R664 — Blue ling / lingue bleue identity and picker-boundary review

- **Status:** Accepted documentation-only hold; no catalog or ledger data changed.
- **Review and source-access date:** 2026-10-18.
- **Open checklist anchor:** The broader [WP04 Section P finfish and regional-fish item](../../RecipeBook-global-ingredient-catalog-plan.txt#L6536) remains open after R661.
- **Candidate:** Blue ling, *Molva dypterygia*.
- **Recommendation:** **Hold the candidate outside active references, forms, legacy identities, and the research ledger.** The species/name pairing is well supported, including by OQLF and DFO’s Québec Region. The hold is specifically for the picker boundary: Canadian and Québec terminology records assign `blue ling` / `lingue bleue` and the shorter `ling` / `lingue` to more than one taxon. The current picker would return a single *M. dypterygia* result for those broad queries. Do not interpret this hold as a claim that the fish is not edible, not commercially available, or lacks a Québec name.

## Evidence and identity boundary

OQLF’s GDT fiche 1199109 places `lingue bleue` in zoology/ichthyology and edible-fish terminology, gives *Molva dypterygia*, and lists `blue ling`, `trade ling`, and `lesser ling` in English. Its note calls this a fish species with commercial potential in Québec. The fiche was last updated in 1998; it supports the bilingual identity but does not establish current Québec retail stock. [S01]

Government of Canada TERMIUM Plus has three fish records relevant to this spelling. The 2023 record for *M. dypterygia* calls `lingue bleue` normalized by OQLF and BNQ, but also notes that `lingue` is used for multiple Lotidae and Ophidiidae and says `lingue bleue` should not be confused with *Molva macrophthalma*. TERMIUM’s separate *M. macrophthalma* entry lists both `blue ling` and `lingue bleue`; its *M. molva* entry also lists `lingue bleue` and explains that `ling` is used for *M. dypterygia*, *Lota lota*, and *Genypterus blacodes*. The same records establish that the name pairing is real while documenting why it cannot safely be treated as a species-exclusive bilingual picker key across Canadian terminology. [S02]

Fisheries and Oceans Canada’s Québec Region code list (2014) identifies code 456 as *M. dypterygia*, `lingue bleue / blue ling`. This is direct regional species/name evidence from the Maurice Lamontagne Institute’s scientific database coding; it is not a current retail listing or Canadian food-label approval. [S03]

CFIA describes its Fish List as the source for common names acceptable for Canadian fish labelling, paired with scientific names. In the public results page reviewed, I found `Ling / lingue` for *M. molva* and `Ling` for *Lota lota*, but no candidate-specific *M. dypterygia* row. I treat the missing result as **no CFIA confirmation located**, not proof that a Québec seller cannot use OQLF’s term. The broader CFIA `Ling / lingue` scope reinforces the query collision. [S04, S05]

A current Canadian supplier, Salties, advertises fresh `Blue Ling filets, skin off`, identifies *M. dypterygia*, and gives French `Lingue bleue`; it lists a supplier-specific filet-size floor, a five-kilogram minimum order, and year-round availability. Salties identifies itself as an Edmonton, Alberta business serving wholesale and home-delivery customers. This supports a current Canadian product listing, but not a Québec retailer listing or a national package convention. The supplier’s extra names (`Ling`, `Deepwater ling`, `Purple ling`, `Birkelange`, and `Black ling`) are not added as catalog aliases. [S06, S07]

Targeted searches for a Québec retailer product under `lingue bleue`, `blue ling`, and *M. dypterygia* did not locate a Québec-specific listing. The OQLF note about commercial potential and Salties’ Alberta listing remain bounded evidence; the search result does not establish that no Québec retailer sells it. French retailer listings were excluded as non-Québec market evidence.

## Exact disposition

**JSON delta: none.** Keep *M. dypterygia* outside active ingredient references and forms, legacy-import identities, and the research ledger for this pass. Add no aliases, measures, density, unit mappings, recipe links, conversions, yields, or substitutions. Do not reserve `ingredient-ref-blue-ling` or a source-ID prefix in shared data.

The source-backed pair to reconsider if the picker can preserve the ambiguity is English `blue ling` and Québec French `lingue bleue` for *M. dypterygia*. Even this display-only pair is not safe under current search behavior: its individual words cause `ling` and `lingue` to return the candidate as a single result, and TERMIUM records those shorter names across several fish taxa. The exact phrases `blue ling` and `lingue bleue` are also listed for *M. macrophthalma*. The source-attested alternatives `trade ling` and `lesser ling` do not solve the issue because they also contain broad `ling`; no supplier-only alternate is promoted as an alias.

This hold does **not** reopen the separate lingcod / morue-lingue hold for *Ophiodon elongatus*, assign the generic identity `ling / lingue`, or change the existing burbot, cusk, pink cusk-eel, stockfish, or other Section P decisions. It does not allocate *M. molva* or *M. macrophthalma* to this candidate.

## Active ownership and source-ID audit

At the R664 review snapshot before R665 integration, the read-only package contained **1,836 ingredient references**, **164 forms**, **56 legacy-import candidates**, and **2,209 research-ledger records**. Exact candidate-string and identifier scans found no active reference, form, or legacy candidate for `blue ling`, `lingue bleue`, `trade ling`, `lesser ling`, *M. dypterygia*, or `ingredient-ref-blue-ling`. There is no candidate-specific identity record or R664 source-ID prefix in the ledger. One ledger source note under `ingredient-ref-stockfish` mentions `blue ling` as one species covered by a multi-species stockfish rule; this is a dried-fish product-state citation, not an allocated *M. dypterygia* identity or picker alias.

The archive and Section P checklist contain no prior focused *M. dypterygia* identity review or allocation. The nearby proposal [WP04 salt-cod / stockfish boundary review](wp04-salt-cod-stockfish-boundary-review-20261009.md) uses `blue ling` only to describe the regulation’s species scope for a dried product. The R637 DFO code-list citation is for *Prionotus carolinus* (species code 800), not this candidate’s code 456.

| Artifact or term | Current exact ownership | Boundary |
|---|---|---|
| Active references and forms | No exact candidate name, binomial, or proposed key. | No existing picker owner; current matches below are a projection, not active data. |
| Legacy identities | No exact candidate name, binomial, or proposed key among 56 candidates. | No legacy candidate is advanced or rewritten. |
| Research ledger | No candidate identity record among 2,209 records. One `ingredient-ref-stockfish` source note references blue ling in a multi-species stockfish regulation. | The stockfish record remains a product-state identity and does not own this fish as an ingredient reference. |
| DFO Québec Region code-list URL | Already cited on `ingredient-ref-northern-searobin` under `WP04-SECTIONP-NORTHERN-SEAROBIN-R637-20261018-S02`, with locator/code 800. | This proposal’s code-456 evidence is a different row in the same document. No ledger source object or duplicate URL owner is proposed. |
| CFIA Fish List overview URL | Existing shared source ID `WP04-FINFISH-GAPS-20261010-S11`; the generic results endpoint also has multiple source owners. | CFIA’s overview establishes Fish List scope. The endpoint’s broad shared URL is not a candidate-specific approval. |
| OQLF fiche 1199109 and TERMIUM query | No exact URL owner found in the active ledger. | IDs below are proposal-local; no ledger record is proposed. |
| Salties product and About pages | No exact URL owner found in the active ledger. | Vendor evidence only; no Québec-market or legal-label claim. |
| R664 identity/source IDs | No earlier proposal, batch, active record, or source-ID owner found. | `ingredient-ref-blue-ling` remains unallocated; IDs below are local to this proposal. |

## Picker boundary

The current [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes case, accents, punctuation, and spacing; it returns complete normalized word-phrase matches first and uses substring matches only if no phrase match exists. The following read-only projection uses the current active references and their attached form search terms:

| Query | Current result | With hypothetical primary names `blue ling / lingue bleue` and no aliases | Decision |
|---|---|---|---|
| `blue ling` | No result | Candidate only | TERMIUM also records both exact terms for *M. macrophthalma*; do not imply a unique taxon. |
| `lingue bleue` | No result | Candidate only | OQLF standardizes it for *M. dypterygia*, while TERMIUM lists it for *M. macrophthalma* and *M. molva* as well. |
| `ling` | Four substring fallbacks: lingonberry, pearl onion, poppy-seed filling, and sparkling water | Candidate only via the complete word token | TERMIUM says `ling` is used across multiple Lotidae/Ophidiidae taxa; CFIA also lists it for *M. molva* and *Lota lota*. A candidate-only result would falsely narrow the query. |
| `lingue` | No result | Candidate only via the complete word token | TERMIUM documents wider `lingue` use, including *M. macrophthalma* and *M. molva*. |
| `trade ling`; `lesser ling` | No result | Candidate only if added as aliases | OQLF/TERMIUM attest them for this species, but they retain the broad `ling` token and do not solve the boundary. Exclude them. |

The projection intentionally treats attached form terms the same way as the app. No result from the current ingredient picker is evidence of nonexistence; the hold is based on the unsupported single-species result that would follow from adding the candidate.

## Recipe and culinary-demand audit

The manifest lists **114 recipe files**. A full scan covered all 114 recipe JSON documents and their **1,123 structured ingredient rows** for `blue ling`, `lingue bleue`, *Molva dypterygia*, `trade ling`, `lesser ling`, and the exact generic tokens `ling` and `lingue`; it found **zero recipe-file matches and zero ingredient-row matches**. There is no candidate-specific recipe demand, form request, measurement evidence, recipe link, conversion, yield, or substitution. Other fish and generic seafood rows do not establish demand for this species.

## Sources and ownership

IDs in this table are proposal-local and are not new ledger entries. Existing owners and URL reuse are disclosed above.

| Source ID | Source and evidence | Limits / ownership |
|---|---|---|
| **WP04-SECTIONP-BLUE-LING-R664-20261018-S01** | Office québécois de la langue française, [GDT fiche 1199109: lingue bleue](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199109/lingue-bleue). | Edible-fish and zoology domains; preferred Québec French term and *M. dypterygia*. Last updated 1998; commercial-potential note is not current inventory. No exact ledger URL owner found. |
| **WP04-SECTIONP-BLUE-LING-R664-20261018-S02** | Government of Canada TERMIUM Plus, [search results for LINGUE BLEUE](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frb&lang=fra&srchtxt=LINGUE+BLEUE). | Fish records dated 2023 and 2021 identify the three *Molva* taxa, preferred/normalized terms, and the `ling` / `lingue` and blue-ling collision described above. No exact ledger URL owner found. |
| **WP04-SECTIONP-BLUE-LING-R664-20261018-S03** | Fisheries and Oceans Canada, [Québec Region species-code list, Canadian Data Report 1254](https://publications.gc.ca/collections/collection_2014/mpo-dfo/Fs97-13-1254.pdf), table 1, species code 456. | Pairs *M. dypterygia* with `lingue bleue / blue ling`. The same document URL is already ledger-owned under R637 S02 for a different taxon/locator; this ID is proposal-local, and no new ledger source is proposed. |
| **WP04-SECTIONP-BLUE-LING-R664-20261018-S04** | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), rows for *Molva molva* and *Lota lota*; see also the [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | The overview says the list supplies acceptable Canadian fish-labelling names and scientific names. The results page reviewed lists `Ling / lingue` for *M. molva* and `Ling` for *L. lota*; no *M. dypterygia* row was found. The candidate-specific absence is not proof of inadmissibility. The overview and general endpoint already have shared ledger owners. |
| **WP04-SECTIONP-BLUE-LING-R664-20261018-S05** | Salties, [Fresh Blue Ling filets, skin off](https://www.salties.ca/products/fresh-blue-ling-filets-skin-off). | Current Canadian supplier product page identifies *M. dypterygia*, `English Blue Ling`, and `French Lingue bleue`; its size, order minimum, and availability are supplier-specific. No exact ledger URL owner found. |
| **WP04-SECTIONP-BLUE-LING-R664-20261018-S06** | Salties, [About](https://www.salties.ca/about). | Identifies Edmonton, Alberta, and wholesale/home-delivery service. It does not establish Québec distribution. No exact ledger URL owner found. |
| **R01** | Read-only scan of current active JSON, ledger, legacy identities, Section P checklist, proposal/batch archive, picker implementation, package manifest, and every manifest-listed recipe. | Repository audit only; no shared file changed. |

## Static validation performed

- Confirmed the proposal path, candidate key, and R664 source-ID prefix were not already allocated in the active data or archive before drafting.
- Checked active references, forms, legacy identities, and every ledger record for exact candidate names, scientific name, and candidate key; reviewed the one stockfish source-note mention separately as a non-owner.
- Audited exact source-ID/URL ownership. The DFO code-list URL is already in the ledger for a different taxon locator; the CFIA overview/results URLs are shared; no new ledger source is proposed.
- Projected current phrase-first / substring-fallback matching using all active reference names, aliases, and attached form terms. This was a static data projection, not an app test.
- Scanned all 114 manifest-listed recipe JSON files and all 1,123 ingredient rows; candidate and exact generic `ling`/`lingue` searches returned zero matches.
- Verified this proposal as UTF-8 without a BOM, with no trailing whitespace or mojibake markers, and checked its relative repository links.

No software tests, build, emulator run, or deployment were performed. This accepted hold and its integration add documentation only and make no database JSON change.

## Recommendation

**Hold *Molva dypterygia* outside active picker and ledger data for now.** OQLF, TERMIUM, and DFO’s Québec Region support `blue ling / lingue bleue` as a fish identity, and a Canadian supplier currently lists the species as a fresh food product. The limiting issue is name scope: TERMIUM gives the exact bilingual pair to more than one *Molva* species and documents `ling / lingue` as broader names; the current matcher would make each query return only *M. dypterygia*. The 114-recipe corpus has no candidate demand. Reopen if search can present the documented ambiguity, or if a new Québec-facing bilingual product term avoids the shared names and has source support.
