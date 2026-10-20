# WP04 Section P — Atlantic wolffish species identity review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** species identity, Québec naming, ownership, picker, and recipe-demand review; integrated on 2026-10-12.
- **Disposition:** **Accept identity-only** for Atlantic wolffish / loup de l’Atlantique (*Anarhichas lupus*), category PROTEIN. Store no aliases, forms, recipe links, amounts, conversions, yields, or substitutions.
- **Integration:** the active reference and ledger record are present, the generated catalog is refreshed, and the plan, roadmap, and integration README record the accepted result. No app or emulator tests were run for this database-JSON addition.

## Candidate and disposition

Section P remains open for regional fish identities. A search of existing Section P proposals, batches, and the plan found no prior review of Atlantic wolffish, loup de l’Atlantique, or *Anarhichas lupus*. This is a single species review, separate from northern wolffish (*A. denticulatus*) and spotted wolffish (*A. minor*).

| Candidate ID | Category | English display | Québec French display | Taxon | Aliases |
|---|---|---|---|---|---|
| ingredient-ref-atlantic-wolffish | PROTEIN | **Atlantic wolffish** | **loup de l’Atlantique** | *Anarhichas lupus* | None |

Accept the species identity because the Office québécois de la langue française (OQLF) places the French term in both ichthyology and edible-fish domains, identifies *A. lupus*, and pairs it with English “Atlantic wolffish.” CFIA independently lists the scientific name with “Atlantic Wolffish,” while Health Canada’s Canadian Nutrient File includes a raw-food record for the same species under a French Atlantic-wolffish name. These establish a real, species-scoped food identity. They do not establish that the fish is routinely available in Québec or that any particular source or landing is lawful.

Current fisheries evidence supplies important context: Atlantic wolffish is listed as Special Concern, and recent DFO assessment material describes low landings and continued fishery interactions, largely as bycatch. That context does not erase the recognized food identity or establish a blanket harvest or sale prohibition. Keep the reference neutral and identity-only; do not add availability, sourcing, regulatory, or safety claims to the catalog.

## Taxonomic and naming boundary

- Limit the row to *Anarhichas lupus*. DFO and CFIA list spotted wolffish (*A. minor*) and northern wolffish (*A. denticulatus*) separately, with distinct names and conservation statuses. Do not merge these species or their products.
- OQLF’s preferred Québec fish-product term is **loup de l’Atlantique**. Its entry was last updated in 2011; this is strong terminology evidence, not a current retailer listing.
- OQLF explicitly says **loup atlantique**, **loup marin**, and **loup de mer** were not retained for Québec fish-product marketing to prevent label confusion. It discourages **chat de mer** for this concept. Do not store these as aliases.
- CFIA associates several English names with *A. lupus*, including **Wolffish**, **Atlantic Catfish**, **Ocean Catfish**, **Sea Catfish**, **Catfish**, and **Ocean Wolffish**. Some names are broad or overlap other taxa. OQLF also lists “Atlantic catfish” and “sea-cat” as English translations, but their broader label use does not make them safe catalog aliases.
- Store only the full paired displays **Atlantic wolffish / loup de l’Atlantique**. Do not add **wolffish**, **catfish**, **Atlantic catfish**, **sea-cat**, **ocean catfish**, **loup atlantique**, **loup marin**, **loup de mer**, **chat de mer**, or names of the other *Anarhichas* species.

## Exact ownership audit

The following ownership audit is a review-time, pre-integration snapshot. It normalized candidate keys with lowercase, Unicode compatibility decomposition, accent and common-ligature folding, punctuation-to-space conversion, and whitespace collapse, matching the project’s ingredient search-key logic. It checked active reference IDs, displays and aliases; form IDs, labels and match terms; all legacy-candidate IDs, names and aliases; and ledger record IDs and full record text. Snapshot hashes cover exact bytes. See the [integration README](../batches/wp03-wp04-kaniwa-atlantic-wolffish-integration-20261012/README.md) for current counts and hashes.

| Artifact | Count | SHA-256 |
|---|---:|---|
| Active ingredient references | 1,256 | e036e35d32c5f7dbce09eda5f533ddd24be89dfd5a8415025388002d79264d65 |
| Ingredient forms | 94 | 55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b |
| Legacy candidates | 66 | bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f |
| Research-ledger records | 1,565 | c18da49dbe6b8b6273c7c80580cb4c477542c5ec911d2c602804cf6825732312 |
| Recipe manifest | 114 paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | 7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c |

| Candidate key or ID | Exact owner and consequence |
|---|---|
| Atlantic wolffish / loup de l’Atlantique / *Anarhichas lupus* | No exact active reference, form, legacy candidate, or ledger record owns the reviewed species/name keys. |
| ingredient-ref-atlantic-wolffish / candidate-atlantic-wolffish | Neither ID is allocated in active references, forms, legacy candidates, or ledger record IDs. |
| wolffish / loup | No standalone exact active or legacy key exists. The words appear within the proposed qualified displays; the current picker can return the species row for these shorter queries. |
| catfish | No standalone exact reference key exists. The current reference ingredient-ref-channel-catfish (“channel catfish / barbue de rivière”) contains the word and is the existing picker/ledger owner for this partial query. Do not add a catfish alias to wolffish. |
| Atlantic catfish / sea-cat / ocean catfish / sea catfish / ocean wolffish | No exact active or legacy owner was found for these phrases; they are deliberately excluded because the regulatory and terminology lists use them inconsistently or more broadly. |
| loup atlantique / loup marin / loup de mer / chat de mer | No exact active or legacy owner was found. OQLF’s Québec fish-product guidance rules these out as aliases for the proposed identity. |
| *Anarhichas minor* / *A. denticulatus* | No exact active identity was found in this catalog audit. The taxa remain separate from the proposed *A. lupus* row. |

No form is linked to an Atlantic-wolffish identity. No current legacy candidate or research-ledger identity record owns the candidate. The proposed source-ID prefix WP04-P-ATLANTIC-WOLFFISH-20261012 was absent from the current ledger and proposal/batch files.

## Picker phrase boundary

The two full displays are species-qualified. With the proposed row present, searches for “Atlantic wolffish” and “loup de l’Atlantique” identify this species. Under current phrase matching, a shorter query for “wolffish” or “loup” will also retrieve the row because those words occur in its qualified display. That retrieval is not a reason to store either broad term as an alias, and it does not make this record a generic wolffish or generic loup identity. Keep the generic family/common-name concepts unresolved. A “catfish” query currently retrieves channel catfish; adding any catfish wording would broaden that result set and is not proposed.

## Recipe-corpus demand audit

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned, along with full recipe JSON text, for the proposed English and French names, scientific name, alternate CFIA/OQLF names, and the two related Canadian wolffish taxa.

**Result: zero candidate phrase matches in recipe ingredient rows and zero matching recipe files.** No bundled recipe requests Atlantic wolffish, and no recipe link or relink is supported. Lack of a recipe hit does not invalidate the separately verified catalog identity; it means this proposal should add no recipe-specific form or behavior.

## English and Québec French evidence limits

- OQLF establishes the accepted Québec food-fish display, English pairing, and taxon. Its 2011 “commercial potential” note is not evidence of current Québec retail availability.
- CFIA’s Fish List establishes Canadian regulated common-name associations for *A. lupus*, but its row set also attaches broad English names to multiple wolffish taxa. Do not turn every CFIA synonym into a picker alias.
- A Québec government marine-area atlas describes loup atlantique as not subject to a directed fishery in the Îles-de-la-Madeleine study context and reports local commercial fishing activity there as bycatch. Its use of loup atlantique is regional ecological wording, not a reason to override OQLF’s fish-product display.
- DFO’s 2025 wolffish assessment describes current fishery interactions and low recent landings. DFO’s 2026 Gulf groundfish plan lists Atlantic wolffish as Special Concern under COSEWIC and SARA. The status and fishery evidence do not by themselves establish a general sales ban, an active Québec consumer market, or a universal sourcing rule.
- The 2020 federal management plan describes historical commercial value and older marketing/product activity while also recording that experimental fishing did not identify Canadian areas with catch rates sufficient for directed commercial exploitation. These historical facts are not current availability evidence.

The disposition is therefore limited to recognizing the documented food identity. It makes no assertion that Atlantic wolffish is routinely sold in Québec or that any specific catch may be retained, marketed, or consumed.

## Forms, numeric data, and substitutions

Health Canada CNF food code 3091 describes raw Atlantic wolffish and reports a half-fillet portion of 148.4 g, a 90 g Food Guide serving, and total refuse of 73%. Treat these only as source-specific observations:

- The 90 g Food Guide serving is not a recipe default.
- The one-half-fillet weight is not a universal fillet or count conversion.
- Total refuse is not a validated edible-yield or cooking-yield rule for the app.
- None of these values supplies density or volume-to-mass data.

Keep default density null and unit mappings empty. Add no fresh/frozen, whole/fillet, cooked/raw, smoked, salted, dried, canned, powdered, or other form. Add no package amount, edible yield, unit conversion, count mapping, or form-conversion rule. No exact recipe or source establishes a safe or useful substitution between Atlantic wolffish and another finfish; add no global or contextual substitution. Do not infer food-safety or cooking equivalence from the taxonomic family or market-name overlap.

## Source register and ledger disposition

Sources were accessed on 2026-10-12. Sources S01–S04 and S06 appear in the integrated ledger record; S05 and S07 remain proposal evidence and were not copied into the ledger.

| Source ID | Source | Supported claim and limit |
|---|---|---|
| WP04-P-ATLANTIC-WOLFFISH-20261012-S01 | OQLF, [loup de l’Atlantique, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198844/loup-de-latlantique) | Preferred Québec food-fish term; edible-fish and ichthyology domains; English “Atlantic wolffish”; taxon *A. lupus*; rejects several shorter Québec product-label names. Updated 2011; terminology and commercial-potential note, not current inventory. |
| WP04-P-ATLANTIC-WOLFFISH-20261012-S02 | CFIA, [Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | Lists *A. lupus* with Atlantic Wolffish and several other English common-name rows; shows that some names are broad or inconsistently qualified. Naming evidence, not recipe equivalence or proof of current retail stock. |
| WP04-P-ATLANTIC-WOLFFISH-20261012-S03 | Fisheries and Oceans Canada, [Status of *Anarhichas lupus*, *A. minor*, and *A. denticulatus* in Canadian Atlantic and Arctic Regions, 2025](https://www.dfo-mpo.gc.ca/csas-sccs/Publications/ResDocs-DocRech/2025/2025_037-eng.pdf) | Current science assessment covering three distinct taxa, commercial landings, observed fishery interactions, and bycatch/discards. Population and fishery evidence; not a consumer-market survey or harvest authorization. |
| WP04-P-ATLANTIC-WOLFFISH-20261012-S04 | Fisheries and Oceans Canada, [2026 Gulf of St. Lawrence groundfish Integrated Fisheries Management Plan](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/groundfish-poisson-fond/2026/groundfish-poisson-fond-4rst-3pn-4vn-eng.html) | Lists *A. lupus* as Special Concern under COSEWIC and SARA. Status evidence only; this proposal makes no legal sale or catch-permission inference. |
| WP04-P-ATLANTIC-WOLFFISH-20261012-S05 | Government of Québec, [Îles-de-la-Madeleine marine protected-area cartographic atlas, 2022](https://www.environnement.gouv.qc.ca/biodiversite/aires_protegees/aire-marine/iles-de-la-madeleine/atlas-cartographique-iles-madeleine-2022.pdf) | Describes no directed fishery for the species in the local study context and reports commercial fishing activity as bycatch. Regional ecological/fishery context, not a Québec-wide market survey. |
| WP04-P-ATLANTIC-WOLFFISH-20261012-S06 | Health Canada, [CNF serving size, food code 3091, English](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3091) and [French](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3091&lang=fre) | Raw Atlantic-wolffish CNF name and source-specific half-fillet, Food Guide portion, and refuse values. These do not establish a recipe amount, generic yield, density, or conversion. |
| WP04-P-ATLANTIC-WOLFFISH-20261012-S07 | Government of Canada, [Northern and spotted wolffish recovery strategy and Atlantic wolffish management plan, 2020](https://www.canada.ca/en/environment-climate-change/services/species-risk-public-registry/recovery/wolffish-northern-spotted-atlantic-strategy-management-plan-2020.html) | Records historical market value and product activity, while noting unsuccessful exploratory work for a directed Canadian commercial fishery. Historical source; not evidence of present Québec availability. |

## Integration result

**Integrated `ingredient-ref-atlantic-wolffish` as an identity-only PROTEIN reference** with the displays Atlantic wolffish / loup de l’Atlantique and no aliases. The reference has no forms, default density, unit mappings, package values, conversions, yields, recipe links, or substitutions. The ledger retains the half-fillet and Food Guide serving only as source-specific observations. This catalog identity does not promise current retail availability or make any harvest, sale, cooking-safety, or sourcing claim. See the [integration record](../batches/wp03-wp04-kaniwa-atlantic-wolffish-integration-20261012/README.md).

