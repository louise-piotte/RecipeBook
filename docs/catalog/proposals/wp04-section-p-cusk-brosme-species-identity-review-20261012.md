# WP04 Section P — cusk / brosme species identity review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** finfish identity, Québec naming, ownership, picker, and recipe-demand review; integrated on 2026-10-12.
- **Disposition:** **Accept identity-only** for cusk / brosme (*Brosme brosme*), category PROTEIN. Store no aliases, forms, recipe links, amounts, conversions, yields, or substitutions.
- **Integration:** the active reference and ledger record are present, the generated catalog is refreshed, and the plan, roadmap, and integration README record the accepted result. No app or emulator tests were run for this database-JSON addition.

## Candidate and accepted disposition

The Section P plan leaves its wider finfish and regional-fish checklist open. A targeted search of the current plan, proposals, batches, active references, forms, and legacy candidates found no prior cusk / brosme identity review or allocation. The existing [stockfish product review](wp04-salt-cod-stockfish-boundary-review-20261009.md) mentions the English word “tusk” in a multi-species dried-fish rule; it does not establish a cusk identity or make stockfish synonymous with cusk.

| Candidate ID | Category | English display | Québec French display | Taxon | Aliases |
|---|---|---|---|---|---|
| ingredient-ref-cusk | PROTEIN | **cusk** | **brosme** | *Brosme brosme* | None |

The OQLF places “brosme” in both ichthyology and edible-fish domains, identifies *B. brosme*, and gives “cusk” as its English term. CFIA lists the same taxon under Cusk and Brosme. DFO also maintains a Cusk/Brosme commercial landings layer covering eastern Canadian regions, including Québec [S01–S03]. This is enough evidence for a genuine species-scoped food identity in the global catalog. It is not evidence of a directed Québec fishery, current retail inventory, or permission to retain or sell a particular catch.

Government of Canada status material reports that cusk is not the subject of a directed commercial or recreational fishery in Canadian waters and is taken as bycatch in Atlantic Canadian fisheries. COSEWIC designated it Endangered in 2012 [S04–S05]. This limits availability claims, not the validity of the documented food-fish identity. Keep the catalog row neutral and identity-only.

## Taxonomic and name boundary

- Scope the row exclusively to *Brosme brosme*. CFIA associates Cusk, Brosme, Brismark, Moonfish, Torsk, and Tusk with this taxon; do not turn every common-name variant into a picker alias [S02].
- OQLF’s preferred Québec French display is **brosme**. Its entry was last updated in 1998 and describes the fish as having commercial potential in Québec. This establishes terminology and culinary category, not present product supply [S01].
- OQLF gives **cusk** as the English name, along with **torsk** and British-labelled **tusk**. CFIA additionally lists **Brismark** and **Moonfish**. Keep only cusk / brosme as displays; add none of these variants as aliases.
- Keep **cusk-eel / kingklip** (*Genypterus blacodes*) separate. CFIA lists it as another taxon and product name. Do not attach cusk-eel, kingklip, or their French name **abadèche rose** to *B. brosme* [S02].
- Keep cusk distinct from the existing unsalted dried product **stockfish**. A stockfish product may be made from more than one species; its mention of “tusk” in a foreign product rule does not make the product a species-level cusk row.
- Do not merge cusk with cod, white hake, pollock, ling, stockfish, salt cod, or any species inferred from a shared fishing gear or product state.

## Exact catalog, form, legacy, and ledger ownership audit

The following audit is a review-time, pre-integration snapshot. It normalized keys with lowercase, Unicode compatibility decomposition, accent and common-ligature folding, punctuation-to-space conversion, and whitespace collapse, matching the project ingredient-search normalization. It checked active reference IDs, English/French displays and aliases; form IDs, labels and match terms; legacy candidate IDs, names and aliases; and ledger record IDs and full record text. Hashes cover exact file bytes. See the [integration README](../batches/wp03-wp04-einkorn-cusk-integration-20261012/README.md) for current counts and hashes.

| Artifact | Count | SHA-256 |
|---|---:|---|
| Active ingredient references | 1,256 | 8315070a479a50d0c06009d804c802bfc9506066e4da3af028eed7da7e1c7063 |
| Ingredient forms | 94 | 55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b |
| Legacy candidates | 66 | bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f |
| Research-ledger records | 1,565 | 221b22c17eff1a7d135caa81225477b601b92dd1d6f0fa5f8b7cd41b5b4f8ec6 |
| Recipe manifest | 114 paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | 7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c |

The corpus fingerprint hashes each manifest-ordered relative recipe path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte.

| Candidate key or ID | Exact owner and consequence |
|---|---|
| cusk / brosme / *Brosme brosme* | No exact active reference, form, legacy candidate, or ledger identity record owns these keys. |
| ingredient-ref-cusk / candidate-cusk | Neither ID is allocated in references, forms, legacy candidates, or ledger record IDs. |
| torsk / tusk / moonfish / brismark | No exact active reference, form, legacy candidate, or ledger identity owner was found. The ledger’s only matching word is “tusk” in source WP04-SALT-STOCKFISH-S08 on `ingredient-ref-stockfish`, where it is one species allowed for a multi-species stockfish product. That is not a cusk identity or alias. |
| cusk-eel / kingklip / *Genypterus blacodes* / abadèche rose | No exact active or legacy owner was found. CFIA identifies cusk-eel / kingklip with a different taxon; keep it outside the cusk row. |
| stockfish | Existing distinct active and ledger product identity. Do not alias or merge it with cusk. |

No form is linked to a cusk identity. There is no current cusk legacy candidate or research-ledger identity record. The proposed source-ID prefix WP04-P-CUSK-BROSME-20261012 was absent from current ledger and proposal/batch files.

## Picker phrase boundary

The full English display **cusk** and French display **brosme** are each species-scoped in the cited OQLF and CFIA terminology. No broad alias is needed. The present picker can also return a qualified term when its complete query words occur within a longer display; if a separate cusk-eel identity is later added, a bare “cusk” query could retrieve both rows because the hyphen is normalized as punctuation. Keep cusk-eel distinct and do not use its full term as a cusk alias.

Queries for torsk, tusk, moonfish, or brismark should not match this proposal through stored aliases. In particular, keep “tusk” out of the cusk aliases because it also occurs in the evidence for the distinct, multi-species stockfish product. Preserve the standalone French display “brosme” as the source-supported Québec term.

## Bundled recipe-corpus demand audit

All 114 manifest-listed recipe files, all 1,123 ingredient rows, and complete recipe JSON text were scanned for cusk, brosme, *Brosme brosme*, the CFIA/OQLF variants, and the related cusk-eel taxon and names.

**Result: zero candidate phrase hits in ingredient rows and zero matching recipe files.** No bundled recipe requests cusk or identifies an appropriate cusk-eel product. No recipe link or relink, product form, or line amount is supported by the current corpus.

## English and Québec French evidence limits

- OQLF establishes the preferred Québec food-fish term, English pairing, and taxon. Its 1998 commercial-potential note is not a current retailer listing [S01].
- CFIA’s Fish List supports the taxon/name mapping and shows that several alternate names exist. The list does not establish which alternate wording is used by a Québec consumer product today [S02].
- DFO’s open commercial-fisheries dataset has a Cusk/Brosme species-and-gear landings layer for 2014–2023, with the described geographic scope including Québec. The data are aggregated landings by weight from fishing records, not retail stock or consumer product evidence; DFO cautions that source logbook records can contain species-identification or weight errors [S03].
- The Government of Canada’s 2018 cusk consultation states that there is no directed commercial or recreational cusk fishery in Canadian waters and that cusk is taken as bycatch in several Atlantic fisheries. This explains why landings records do not prove a directed market supply. The proposal makes no legal harvest or sale claim [S04].
- COSEWIC’s 2012 assessment designated cusk Endangered. The conservation record is a reason to avoid any claim that the catalog row authorizes sourcing, retention, sale, or consumption of a particular catch. This identity review is not a regulatory status determination [S05].

## Form, numeric, and substitution limits

No source reviewed supplies a general recipe portion, fillet count weight, density, volume-to-mass mapping, edible fraction, cooking yield, package yield, or form-specific conversion for cusk. Commercial landing weights are fishery statistics and cannot be used as recipe amounts. Keep default density null and unit mappings empty.

Add no fresh, frozen, whole, fillet, cooked, dried, smoked, salted, canned, or other forms. Do not infer that cusk is the species for generic stockfish or salt-cod references. No exact recipe or source supports substituting cusk for cod, hake, pollock, cusk-eel, or another finfish. Add no global or contextual substitution, recipe link, or safety/cooking equivalence.

## Source register and ledger disposition

Sources were accessed on 2026-10-12. Sources S01–S06 now appear in the integrated ledger record.

| Source ID | Source | Supported claim and limit |
|---|---|---|
| WP04-P-CUSK-BROSME-20261012-S01 | OQLF, [brosme, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198959/brosme) | Preferred Québec term; edible-fish and ichthyology domains; English “cusk”; taxon *B. brosme*; commercial-potential note. Last updated 1998; terminology, not current availability. |
| WP04-P-CUSK-BROSME-20261012-S02 | CFIA, [Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | Lists *B. brosme* as Cusk, Brosme, Brismark, Moonfish, Torsk, and Tusk; separately lists *Genypterus blacodes* as Cusk-eel / Abadéche Rose and Kingklip. Common-name evidence, not a recipe or market equivalence. |
| WP04-P-CUSK-BROSME-20261012-S03 | Fisheries and Oceans Canada, [Eastern Canadian commercial fisheries dataset, Cusk/Brosme layer](https://egisp.dfo-mpo.gc.ca/arcgis/rest/services/open_data_donnees_ouvertes/eastern_canadian_commercial_fishing/MapServer/layers) | Describes commercial species/gear landings from 2014–2023 across eastern Canadian regions including Québec. The layer aggregates landings and includes DFO cautions about the source record quality; it is not consumer-market evidence. |
| WP04-P-CUSK-BROSME-20261012-S04 | Government of Canada, [Cusk consultation](https://www.canada.ca/en/environment-climate-change/services/species-risk-public-registry/consultation-documents/cusk.html) | States no directed commercial or recreational fishery for cusk in Canadian waters and identifies bycatch in Atlantic groundfish and lobster fisheries. The page’s consultation context and COSEWIC summary are not a present-day retail survey or a legal opinion. |
| WP04-P-CUSK-BROSME-20261012-S05 | COSEWIC, [Cusk assessment and status report, 2012](https://www.canada.ca/en/environment-climate-change/services/species-risk-public-registry/cosewic-assessments-status-reports/cusk-2012.html) | Identifies the taxon and records the 2012 Endangered assessment. Conservation status evidence; not recipe, availability, or measurement evidence. |
| WP04-P-CUSK-BROSME-20261012-S06 | Fisheries and Oceans Canada, [Groundfish in NAFO divisions 4VWX5, Maritimes Region, French](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/groundfish-poisson-fond/groundfish-poisson-fond-4vwx5-fra.html) | French fisheries-plan section uses “Brosme” for cusk and describes landings/bycatch in the Maritimes. Some quota figures on the page are explicitly historical (2017–2018); not current retail or recipe data. |

## Integration result

**Integrated `ingredient-ref-cusk` as an identity-only PROTEIN reference** with English `cusk` and Québec French `brosme` displays, no aliases, and taxon *Brosme brosme*. The reference has no forms, default density, unit mappings, package values, conversions, yields, recipe links, or substitutions. The identity recognizes a documented edible fish and does not represent directed fishing, current Québec retail stock, or legal permission to source a particular catch. See the [integration record](../batches/wp03-wp04-einkorn-cusk-integration-20261012/README.md).

