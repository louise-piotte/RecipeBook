# WP04 Section P — white perch / baret identity review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** Finfish identity, Québec naming, picker ownership, recipe demand, and product-boundary review, refreshed after integration.
- **Disposition:** Integrated as one identity-only `PROTEIN` reference for white perch / baret (*Morone americana*). Aliases remain empty; no forms, recipe links, measurements, conversions, yields, or substitutions were added.
- **Worktree scope:** This refresh edits only this proposal. Root separately integrated the shared catalog and ledger and updated the batch, plan, and roadmap.

## Candidate and scope

Section P remains open for named and regional fish. Recent coverage mentions white perch only to distinguish it from freshwater drum and white bass. The original review found no standalone white-perch allocation or hold; root has since integrated this distinct species without reopening the cisco / tullibee, white-bass, or freshwater-drum decisions. This refresh records the integrated state.

| Integrated ID | Category | English display | Québec French display | Taxon | Aliases |
|---|---|---|---|---|---|
| `ingredient-ref-white-perch` | `PROTEIN` | **white perch** | **baret** | *Morone americana* | None |

Scope the identity to the edible fish of *M. americana*. The common name does not make it a member of genus *Perca*. Keep white bass (*M. chrysops*), striped bass (*M. saxatilis*), yellow perch (*Perca flavescens*), and Nile perch (*Lates niloticus*) separate. Do not add a row for a generic “perch,” “bass,” or “bar,” or infer a species from an unqualified recipe or package phrase.

## Québec and Canadian name boundary

The Office québécois de la langue française (OQLF) classifies **baret** in ichthyology and edible fish, directly pairs it with English **white perch**, and identifies *Morone americana*. The entry calls the species one with commercial potential in Québec; this 2011 terminology note is not proof of current Québec inventory. OQLF lists **bar-perche**, **perche blanche**, and **petit bar** as terms used in some contexts and says they were not retained by the fish-products terminology committee. Use the preferred Québec term **baret** as the French display, and add none of those alternatives as aliases. [S01]

CFIA's Fish List associates taxonomic serial number 167678 and *M. americana* with **White Perch**, **Bar Blanc D'Amérique**, **Baret**, and **Perche Blanche**. Its adjacent *M. chrysops* entry is **White Bass / Bar Blanc**, confirming that the two species are distinct. The Fish List supplies Canadian fish-label common names and taxa; it does not establish that a product is in stock, that a specific catch may be sold, or that two species are culinary substitutes. [S02, S03]

Do not store **bar blanc d’Amérique** as an alias. Although CFIA lists it for *M. americana*, the live picker treats a complete word in any display or alias as a phrase match. Adding that label would make the generic query **bar** return white perch alone at the phrase stage, hiding the query's broad scope. The OQLF-preferred **baret** preserves a direct Québec French query while avoiding an exact `bar` token. Because it begins with the letters `bar`, the current substring fallback still includes it in the already broad `bar` results; it does not become the sole result. Do not add `bar-perche`, `perche blanche`, or `petit bar` either: OQLF explicitly says those names were not retained for fish products. [S01–S03]

The English display **white perch** contains the broad word `perch`. This remains an informative multiple-choice search: `perch` currently returns Nile perch and yellow perch, and would return all three qualified fish identities if this row is added. Do not add `perch` as a separate alias. The supplier-only name **Black Back** is also omitted because it has no corroboration here as a Québec consumer-fish term. [S04]

## Canadian product and market scope

SeaCore Seafood Inc.'s current product page names **White Perch**, identifies it as *M. americana*, and describes a fresh, wild Canadian product caught in Ontario's Great Lakes. It lists whole-fish and fillet presentations. This is a direct supplier description of its own product; the page does not show live inventory, establish Québec retail availability, or define all white-perch products. [S04]

Fisheries and Oceans Canada's 2024 freshwater-landings table reports a **Perch** category whose footnote says it includes yellow and white perch. The combined numbers cannot establish white-perch-specific landings. They are fishery statistics rather than retail or recipe evidence. [S05]

Taken together, OQLF and CFIA support a species-scoped edible-fish identity, while the supplier page demonstrates a Canadian product tied to the species. These sources do not establish Québec supply, a particular source lot, or a general legal harvest or sale pathway. The integrated row makes none of those claims.

## Exact ownership audit and current snapshot

The exact-key scan follows `normalizeIngredientSearchKey` in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase with `Locale.ROOT`, Unicode NFKD, fold `œ` / `æ` / `ß` and `&`, remove combining marks, convert other punctuation to spaces, then collapse whitespace. It checked active reference IDs, displays, and aliases; form IDs, labels, and match terms; legacy-candidate IDs, names, and aliases; ledger record IDs and every ledger string; and the generated Kotlin catalog. Snapshot hashes cover exact file bytes.

The exact English and Québec French display keys **white perch** and **baret**, and `ingredient-ref-white-perch`, are now owned by the active integrated reference below. *Morone americana* and the cited alternate terms occur in the accepted ledger evidence; they are not catalog aliases. There is no `candidate-white-perch` legacy identity, no form linked to this reference, and no recipe link. The generated catalog contains the integrated reference. The ledger record is `ingredient-ref-white-perch` with accepted identity state and five source IDs under `WP04-SECTIONP-WHITE-PERCH-20261012-R9`; each of those IDs occurs exactly once in the ledger.

| Artifact at refresh time | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,320 references | 422,612 | `4170561b1106f2bf98a3cfb0c789ec2f1a80e11095a58d342fd55a28fce56ef3` |
| `ingredient-forms.v1.json` | 98 forms | 73,589 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates | 15,264 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,628 records; 5,979 source entries; 4,996 distinct source IDs | 5,930,872 | `c1ef18297730fb99f8c2f032b4478ec04c6e4e2d51b614a0ee4c8ff89c21c523` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `BundledIngredientCatalog.kt` | Generated catalog index | 578,498 | `0c5a0254e5b0961cbf271d92e69ba56bf6f1a6ea9cc38a8aab7a179c94024236` |
| `substitution-rules.v1.json` | 0 global rules | 3 | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| `contextual-substitution-rules.v1.json` | 0 contextual rules | 3 | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |

The five source IDs `WP04-SECTIONP-WHITE-PERCH-20261012-R9-S01` through `...-S05` are now allocated to `ingredient-ref-white-perch` in the ledger. All five are unique there and are recorded in the integrated batch and this proposal's source register.

## Picker projection

I projected the two displays, with no aliases or forms, through the current phrase-first search behavior. Whole normalized word phrases take priority across the result set; substring matching is used only if no phrase matches.

| Query | Current live results | Boundary |
|---|---|---|---|
| `white perch` | White perch / baret | Specific English display returns the integrated species. |
| `baret` | White perch / baret | Preferred Québec French display returns the integrated species. |
| `perch` | Nile perch; yellow perch; white perch | Broad query retains three species-qualified choices. |
| `perche` | Nile perch | White perch is not returned through an unretained French variant. |
| `bar` | 25 substring-fallback results, including white perch / baret | The partial match remains a broad fallback set, not a sole species result. |
| `bar blanc` | None | The CFIA-listed alternate is not a display or alias. |
| `white bass` | None | White bass / bar blanc remains a separate species boundary. |

The live picker results confirm why **baret** is the French display and why the CFIA-listed **bar blanc d’Amérique** label should not be stored as an alias: under current picker behavior, it would make a query for bare **bar** return white perch alone at the phrase stage.

## Recipe-corpus audit

The read-only audit followed all **114 manifest-listed recipe files** in manifest order and inspected every parsed string, every ingredient row, and every row's name, source text, and reference ID. It searched the candidate and boundary phrases **white perch**, **baret**, *Morone americana*, **bar blanc d’Amérique**, **bar-perche**, **perche blanche**, **petit bar**, **Black Back**, **white bass**, **bar blanc**, **striped bass**, **yellow perch**, **Nile perch**, and the broad picker words **perch** and **bar**.

**Result: zero matching recipe files and zero matching ingredient rows for every scanned phrase.** There are 1,123 ingredient rows and 753,792 exact recipe-file bytes in the corpus. The corpus digest is `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`; it hashes each manifest-relative path, a NUL byte, the exact recipe bytes, and another NUL byte in manifest order. No source recipe selects white perch, and no generic seafood wording identifies it. No link or relink is supported.

## Forms, measurements, and substitutions

- The SeaCore page's whole-fish and fillet presentations are specific product information, not a recipe-driven reason to add catalog forms. Its whole-fish length of 5–7 inches and fillet size listing of 1–3 oz describe that supplier's product only; neither is a general portion, count-to-mass conversion, cooking yield, or usable household measure. DFO's aggregated live-weight landings are not recipe quantities. [S04, S05]
- The integrated reference has no form, unit mapping, package conversion, recipe link, edible yield, cooking yield, or other numeric behavior; its density is null and unit mappings are empty.
- The global and contextual substitution-rule files currently contain zero rules. No recipe or reviewed source establishes a directed substitution between white perch and yellow perch, Nile perch, white bass, striped bass, or another fish. Add no substitution and infer no cooking, storage, curing, or raw-consumption equivalence.

## Source register and limits

Sources were accessed on 2026-10-12. The five source IDs below are allocated to the accepted `ingredient-ref-white-perch` ledger record.

| Source ID | Primary source | Supports and limits |
|---|---|---|
| **WP04-SECTIONP-WHITE-PERCH-20261012-R9-S01** | OQLF, [baret, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198873/baret) | Preferred Québec edible-fish term, English **white perch**, taxon *M. americana*, and the 2011 note about commercial potential. It explicitly says **bar-perche**, **perche blanche**, and **petit bar** were not retained by the fish-products terminology committee. Terminology evidence, not current inventory. |
| **WP04-SECTIONP-WHITE-PERCH-20261012-R9-S02** | CFIA Fish List, [White Perch search](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=White%20Perch) | Official CFIA search-result output for the exact White Perch query identifies *M. americana* / **White Perch**, **Bar Blanc D'Amérique**, **Baret**, and **Perche Blanche**, and distinguishes adjacent *M. chrysops* / **White Bass** / **Bar Blanc**. The specific result endpoint did not render directly in the review check; these names are recorded from the official search-result output, not a directly rendered result page. This supports Canadian fish-label nomenclature, not product availability or culinary equivalence. |
| **WP04-SECTIONP-WHITE-PERCH-20261012-R9-S03** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Explains that the Fish List supplies common names acceptable in Canada for fish labelling and scientific names for species identification. It does not establish current stock, a specific lot's source, or recipe use. |
| **WP04-SECTIONP-WHITE-PERCH-20261012-R9-S04** | SeaCore Seafood, [White Perch](https://www.seacoreseafood.com/product/white-perch) | Current supplier page names *M. americana*, and describes its own fresh, wild Ontario Great Lakes product as whole or fillet, including product-specific size statements. A supplier listing is not a live inventory guarantee, Québec retail proof, a universal alias source, or a household-measure standard. |
| **WP04-SECTIONP-WHITE-PERCH-20261012-R9-S05** | Fisheries and Oceans Canada, [Freshwater landings, 2024](https://www.dfo-mpo.gc.ca/stats/commercial/land-debarq/freshwater-eaudouce/2024-eng.htm) | The `Perch` table row footnote combines yellow and white perch. Its provincial catches and landed values are not species-specific white-perch amounts or retail availability. |

**Access limits:** Ontario's government [White Perch species page](https://www.ontario.ca/page/white-perch) appeared in current search results with *M. americana* and Ontario-range information, but direct page retrieval returned HTTP 403; it is not needed for the integrated identity. The CFIA [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) was directly readable and defines the list as Canadian fish-labelling nomenclature with scientific names for species identification. The specific CFIA White Perch search-result endpoint did not render directly in the review check; S02's specific names are attributed to official CFIA search-result output. OQLF, the readable CFIA overview, DFO, and the supplier page support the bounded disposition, subject to that endpoint limit.

## Integrated disposition

The integrated identity is `ingredient-ref-white-perch` with English display **white perch**, Québec French display **baret**, category `PROTEIN`, and empty aliases. It keeps the species separate from white bass and the other perch identities. **Bar blanc d’Amérique**, **bar-perche**, **perche blanche**, **petit bar**, **Black Back**, and generic fish words remain outside aliases. No forms, measures, recipe links, conversions, yields, or substitutions were added. Section P remains open.

## Static checks

- Parsed the live references, forms, legacy candidates, ledger, manifest, and every manifest-listed recipe as UTF-8 JSON; the counts and hashes above were recomputed from the current worktree after integration.
- Reimplemented the Kotlin normalization and phrase-first/substring-fallback matching; the integrated active-reference ownership, empty form ownership, and current picker results are listed above.
- Scanned all 114 recipe files, 1,123 ingredient rows, and parsed recipe strings; the candidate and adjacent-species phrases have zero corpus matches.
- Confirmed all five source IDs are allocated to the accepted ledger record and each occurs once in the current ledger.
- For this refresh, checked strict UTF-8 decoding, no BOM, final newline, trailing whitespace, common mojibake markers, and all eight live snapshot hashes.
- No app tests or emulator checks were run; this update changes only the proposal, and the repository's JSON-only data exemption applies to the separate integration.
