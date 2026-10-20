# WP04 Section P — Acadian redfish / sébaste acadien identity review

- **Review and source-access date:** 2026-10-13.
- **Status:** Integrated in [the R72 batch record](../batches/wp04-section-p-acadian-redfish-identity-integration-20261013/README.md).
- **Scope:** One species-scoped finfish identity, *Sebastes fasciatus*.
- **Recommendation:** Add identity-only `Acadian redfish / sébaste acadien` as `ingredient-ref-acadian-redfish` in `PROTEIN`. Keep aliases empty and add no forms, measures, recipe links, density, unit mappings, conversions, yields, or substitutions.

## Identity and Québec naming scope

The CFIA Fish List maps TSN 166774 and *Sebastes fasciatus* to several fish-labelling names, including `Acadian Redfish`, `Redfish / Sébaste Acadien`, `Atlantic Ocean Perch / Perche Rose Atlantique`, and `Ocean Perch / Sébaste`. The result page also shows other *Sebastes* taxa under overlapping `Redfish`, `Ocean Perch`, `Rosefish`, and `Rockfish` wording. This confirms the candidate’s species-linked Canadian name scope; it does not make the other labels general ingredient synonyms.

TERMIUM Plus supplies the precise bilingual pair proposed here. Its 2023-01-04 fish record identifies *S. fasciatus*, marks English `Acadian redfish` as the commercial name recommended by the Fisheries and Oceans Canada commercial-fisheries terminology committee, and marks French `sébaste acadien` as the normalized commercial French name. It lists `sébaste d’Acadie` as a Canadian Museum of Nature preference and `sébaste rose` as another term, but neither is needed for this row. The proposal uses only the exact qualified pair.

OQLF’s Québec entry for `sébaste` is deliberately broader: it assigns the edible-fish term to *Sebastes* sp., lists English `redfish`, `rosefish`, and `ocean perch`, and says Québec catches include *S. marinus*, *S. fasciatus*, and *S. mentella*. It was last updated in 2012 and is not an *S. fasciatus*-specific product label. The proposed French display is supported as the standardized commercial term by TERMIUM and is also used on a Québec-facing species page from Mange ton Saint-Laurent; it is not represented as a dedicated OQLF-preferred species entry.

The 2026 DFO Gulf plan treats the Unit 1 fishery as a two-species fishery involving deepwater redfish (*S. mentella*) and Acadian redfish (*S. fasciatus*). DFO describes the fishery and management status; those statements do not identify a particular retail fish or establish species-specific Québec product availability. A current Québec retailer page lists frozen `Filets de sébaste sauvage du Québec` without a scientific name. Preserve that group-level product as `Québec redfish / sébaste du Québec`; do not relabel its SKU as Acadian redfish.

**Naming confidence:** High for the scientific identity and Canadian commercial pair; high for the qualified French term’s Québec relevance, with the stated limit that the direct OQLF entry covers the broader genus-level market term. Current Québec product evidence supports the regional redfish group, not a species-verified consumer package.

## Exact ownership and archive status

The read-only audit covered active reference names and aliases, all form labels and match terms, legacy-import names and aliases, research-ledger record IDs and identity allocations, the bundled recipe package, and the Section P proposal/batch archive. Search-term comparisons use the repository’s `normalizeIngredientSearchKey` behavior: lowercase, Unicode NFKD, fold ligatures and accents, replace punctuation with spaces, then collapse whitespace.

| Candidate or nearby term | Current ownership and boundary |
|---|---|
| `Acadian redfish`, `sébaste acadien`, *Sebastes fasciatus* | No exact active display/alias, form label/match-term, or legacy-candidate owner. No ledger record allocates the candidate as an identity. These names remain unallocated in the app picker. |
| `ingredient-ref-acadian-redfish`, `candidate-acadian-redfish` | No active reference ID, legacy ID, or ledger record ID collision. |
| `redfish`, `sébaste` | Currently match the single active group row `ingredient-ref-quebec-redfish` (`Québec redfish / sébaste du Québec`); they are not aliases on that row. There are no forms attached to this group reference. |
| `ingredient-ref-quebec-redfish` | Existing active and verified ledger allocation for the Québec commercial *Sebastes* group. Its ledger sources mention *S. fasciatus* as one species in the group, but the decision keeps individual species unallocated and does not map the generic retail product to one taxon. |
| `ocean perch`, `perche rose`, `Atlantic Ocean Perch`, `rosefish`, `poisson rouge`, `sébaste d’Acadie`, `sébaste rose` | Not proposed as aliases. CFIA/TERMIUM list these as other source-specific names; broader terms would weaken the species and Québec market boundary. |

The live snapshot has 1,393 active references, 101 forms, 63 legacy candidates, and 1,727 research-ledger records (6,833 source entries, 5,746 distinct source IDs, and 8 unit conversions). The ledger has no `candidate-acadian-redfish` or `ingredient-ref-acadian-redfish` record; its `ingredient-ref-quebec-redfish` record is the group-level allocation described above.

The earlier [Québec redfish market-group review](wp04-section-p-quebec-redfish-market-group-review-20261012.md) named *S. fasciatus* as one Québec-caught species while explicitly separating species-level identities from the group. That is useful boundary context, not a prior Acadian-redfish allocation. The archive search found no dedicated Acadian-redfish species review or integration.

Source-ID audit: the three new IDs `WP04-SECTIONP-ACADIAN-REDFISH-20261013-R72-S01` through `S03` had no exact match in the research ledger or proposal/batch archive at review time and were registered under the new Acadian-redfish record during R72 integration. The existing OQLF, MAPAQ, DFO Unit 1, CFIA, and retailer sources below reuse the IDs already attached to the Québec redfish group record rather than registering duplicate IDs for the same pages.

## Picker projection

The picker first returns complete normalized word-phrase matches and falls back to substring matches only when no complete phrase matches. The projection below adds one display-only reference with empty alias arrays and no forms.

| Search | Current results | With proposal | Result |
|---|---|---|---|
| `Acadian redfish` | 0 | 1 | `Acadian redfish / sébaste acadien` |
| `sébaste acadien` / `sebaste acadien` | 0 | 1 | `Acadian redfish / sébaste acadien`; accent folding handles the unaccented query. |
| `redfish` | 1 | 2 | Both `Québec redfish / sébaste du Québec` and `Acadian redfish / sébaste acadien` remain visible. |
| `sébaste` / `sebaste` | 1 | 2 | Both the Québec market group and the species identity remain visible. |
| `Québec redfish` / `sébaste du Québec` | 1 group result | 1 group result | No change to the existing market-group selection. |
| `ocean perch`, `perche rose`, `rosefish`, `poisson rouge` | 0 | 0 | These labels are intentionally not aliases. |
| `perche` | 1: `Nile perch / perche du Nil` | Same one result | No new broad `perche` match is introduced. |
| *S. fasciatus* / `Sebastes fasciatus` | 0 | 0 | The scientific name remains evidence, not a user-facing ingredient alias. |

The two broad `redfish` and `sébaste` result rows distinguish the existing multi-species Québec market group from the new species-qualified identity. Neither query collapses to an Acadian-only result or silently maps the generic Québec retail SKU to this species.

## Bundled recipe demand

The manifest lists 114 recipe files containing 1,123 ingredient rows. A normalized phrase scan of every complete recipe JSON file and every ingredient row found **zero** matches for `Acadian redfish`, `sébaste acadien`, *Sebastes fasciatus*, `Acadian rockfish`, `Labrador redfish`, and nearby species-qualified names. The corpus contains no species-specific recipe demand, quantity, form, preparation state, or substitution basis. Add no recipe link or relink.

Mange ton Saint-Laurent also publishes a Québec recipe associated with `Sébaste acadien`, but its ingredient line says `10 filets de sébaste` for two portions and gives no fillet mass or species-specific ingredient wording. Treat that as an external, recipe-specific count only. It does not override the zero bundled demand or support a reusable measure or form.

## Numeric, conversion, and substitution limits

- DFO’s 2026–2027 Unit 1 plan sets a **60,000 t** total allowable catch for the combined redfish fishery and allocates **3,319.5 t** to the Québec inshore coastal fleet row. These are fishery-management amounts, not *S. fasciatus*-specific landings, proof of a species-identified retail product, recipe quantities, or kitchen measures.
- MAPAQ’s 2026 industry brochure reports preliminary 2025 Québec landings of **653 t** and **$557,171** under the group label `SÉBASTE`. Those are regional group-level fishery/economic totals, not a species split or edible portion.
- The current Québec `Filets de sébaste sauvage du Québec` retail SKU is sold as a **454 g** pack and estimates **about 3–4 portions**. The page provides no binomial; retain both numbers only as this group-level SKU context. Do not assign them to Acadian redfish or derive a per-serving or fillet conversion.
- The external Québec recipe’s **10 fillets / 2 portions** is a source-specific recipe count. It provides neither a weight per fillet nor a verified species line, so it is not an active count-to-mass conversion or default serving.
- No reviewed source establishes *S. fasciatus*-specific density, household-volume mapping, count-to-mass relationship, edible yield, thaw/drain/cooking yield, or a reusable portion. Add no numeric catalog behavior or form.
- No bundled recipe or source supports substituting Acadian redfish for the group-level Québec redfish row, another fish, or a generic white-fish ingredient. Similar taxonomy, fishery, or culinary descriptions do not establish a directed conversion or substitution.

## Proposed disposition

Add the identity-only `PROTEIN` row `Acadian redfish / sébaste acadien` for *Sebastes fasciatus*, with empty aliases. The species-qualified common-name pair is supported by the CFIA Fish List and the commercial terminology record; current Québec sources establish a broader regional *Sebastes* market and fishery, while leaving species identity unspecified on the retail SKU. The picker can preserve both the existing Québec group and a specifically named Acadian-redfish identity on broad searches by showing both rows. Keep product and fishery quantities source-scoped, and add no measure, form, conversion, recipe link, yield, or substitution.

## Sources

Sources were reviewed on 2026-10-13. Source IDs marked **reused** are present in the active `ingredient-ref-quebec-redfish` ledger record. The three new IDs are registered in the active `ingredient-ref-acadian-redfish` ledger record as part of R72 integration.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-ACADIAN-REDFISH-20261013-R72-S01** | Government of Canada Translation Bureau, [TERMIUM Plus: *Sebastes fasciatus*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=38&i=&index=ptr&lang=eng&sg_kp_wet=1643777&srchtxt=SEBASTES%20FASCIATUS) | Fish record dated 2023-01-04 identifies the taxon, recommends `Acadian redfish` as the trade name, and standardizes `sébaste acadien` as the French commercial name. Lists `sébaste d’Acadie` and `sébaste rose` separately; no alternate aliases are proposed. |
| **WP04-SECTIONP-ACADIAN-REDFISH-20261013-R72-S02** | Mange ton Saint-Laurent!, [Sébaste acadien](https://mangetonsaintlaurent.com/especes/sebaste-acadien/) | Québec-facing species page pairs *Sebastes fasciatus* with `Acadian redfish` and `sébaste acadien`, and presents the fish as a culinary species. This is local food-information context, not a retailer SKU or current inventory record. |
| **WP04-SECTIONP-ACADIAN-REDFISH-20261013-R72-S03** | Mange ton Saint-Laurent!, [Fish n’ chips de sébaste](https://mangetonsaintlaurent.com/recettes/fish-n-chips-de-sebaste/) | Québec recipe page was last modified 2024-11-04 and associates the recipe with Acadian redfish. It specifies 10 generic `filets de sébaste` for 2 portions, without a mass or species-specific ingredient line; not a reusable measure or bundled recipe demand. |
| **Reused `WP04-P-QUEBEC-REDFISH-GROUP-20261012-S01`** | OQLF GDT, [sébaste](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198848/sebaste) | Preferred Québec edible-fish term and broad *Sebastes* sp. scope; reports Québec catches include *S. fasciatus* among three species. Last updated 2012; not an *S. fasciatus*-specific consumer name or current inventory source. |
| **Reused `WP04-P-QUEBEC-REDFISH-GROUP-20261012-S02`** | MAPAQ, [Poissons et fruits de mer du Québec à l’international (2026 brochure)](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/BR_brochure-poissons-fruits-mer-qc-int_MAPAQ.pdf) | Reports preliminary 2025 Québec landings of 653 t and $557,171 under `SÉBASTE`; group-level current industry data, not an *S. fasciatus* split or consumer portion. |
| **Reused `WP04-P-QUEBEC-REDFISH-GROUP-20261012-S03`** | DFO, [Unit 1 Redfish Management Plan 2026–2027](https://www.dfo-mpo.gc.ca/fisheries-peches/decisions/fm-2026-gp/atl-33-fra.html) | Current combined Unit 1 redfish fishery plan; reports a 60,000 t total allowable catch and Québec fleet allocations. It does not identify a retail lot or claim that an allocation is species-specific food availability. |
| **Reused `WP04-P-QUEBEC-REDFISH-GROUP-20261012-S04`** | DFO, [second year of the commercial Redfish fishery (2025–2026)](https://www.canada.ca/en/fisheries-oceans/news/2025/06/fisheries-and-oceans-canada-announces-details-for-second-year-of-commercial-redfish-fishery.html) | Identifies *S. mentella* and *S. fasciatus* as the two redfish species in the Gulf fishery context. It is fishery-scope evidence, not a species-specific Québec SKU or current retail inventory. |
| **Reused `WP04-P-QUEBEC-REDFISH-GROUP-20261012-S05`** | CFIA Fish List, [redfish results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Redfish) | The same Fish List source maps multiple labels to *S. fasciatus* (TSN 166774) and shows overlap of bare `Redfish`, `Ocean Perch`, and related labels across taxa. List modified 2023-09-18; Canadian fish-label terminology, not a consumer synonym set. |
| **Reused `WP04-P-QUEBEC-REDFISH-GROUP-20261012-S06`** | Réserve Locale / La Gaspésienne, [Filets de sébaste sauvage du Québec (454 g)](https://reservelocale.ca/products/sebaste-sauvage-du-quebec-454g) | Current Québec-facing listing for a frozen regional redfish-group SKU; 454 g and about 3–4 portions. No Latin taxon is stated; amounts remain SKU-specific. |

**Proposal-only checks:** exact candidate ownership and source-ID collision scan, picker projection, and full manifest recipe/ingredient-row phrase scan completed. The proposal was checked for UTF-8, broken encoding markers, local relative-link targets, and whitespace. No app tests or emulator checks were run.
