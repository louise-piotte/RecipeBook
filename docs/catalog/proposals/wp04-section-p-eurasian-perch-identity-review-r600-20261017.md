# WP04 Section P R600 — Eurasian perch identity review

- **Review date:** 2026-10-17.
- **Open checklist anchors:** Section P lists regional finfish at [plan lines 6421–6422](../../RecipeBook-global-ingredient-catalog-plan.txt#L6430). The broader fish-powder, fish-ball, surimi, and regional seafood review remains open at [the Section P follow-up](../../RecipeBook-global-ingredient-catalog-plan.txt#L15002).
- **Distinct scope:** One freshwater fish species, *Perca fluviatilis*. This does not reopen Hilsa (R587), Arapaima/Paiche (R590), Tambaqui (R593), Rohu (R594), or North African catfish (R597), and does not revise the already-active Yellow Perch, White Perch, Nile Perch, or pike-perch identities.
- **Recommendation:** **Add** an identity-only PROTEIN reference for **Eurasian perch / perche européenne**, scientific identity *Perca fluviatilis*. Use only the source-attested English aliases **European perch** and **European Yellow Perch**. Keep broad **perch / perche**, **yellow perch / perchaude**, and the scientific name out of aliases.
- **Candidate row:** `ingredient-ref-eurasian-perch`; French display follows CFIA’s accepted Canadian fish-label wording. No French alias is proposed.
- **Mutation status:** Integrated 2026-10-17. The identity row and research record are present in the shared JSON data; the plan, roadmap, and integration README now record the disposition.

## Gap and boundary

The open finfish checklist explicitly includes regional fish. A focused search of the plan, proposals, batches, active reference and form JSON, legacy import identities, and research ledger found no prior allocation or decision for *Perca fluviatilis*. The species is separate from Yellow Perch (*Perca flavescens*), White Perch (*Morone americana*), Nile Perch (*Lates niloticus*), and pike-perch (*Sander lucioperca*). The fact that the genus *Perca* contains the two species does not make their names, products, or recipe lines interchangeable.

The proposed identity is supported by CFIA’s Canadian fish-label list, which gives a qualified bilingual name pair and a separate scientific taxon number. The proposal does not map a current Ontario seller’s similarly worded item to that taxon: the seller uses “European Lake Yellow Perch” but supplies no scientific name. That listing is treated only as adjacent product-wording context.

## Current source cross-check and fr-CA wording

CFIA’s Fish List row for TSN 168470 pairs *Perca fluviatilis* with **Eurasian Perch / Perche européenne** and also lists **European Yellow Perch** for the same taxon. The neighboring row assigns **Yellow Perch / Perchaude** to *Perca flavescens*. CFIA says the Fish List supplies English and French common names acceptable in Canada for fish labelling and scientific names with TSNs. This supports the candidate identity and a species-qualified Canadian French display; the list is naming guidance, not a current-stock or culinary-source claim. The results page reports a 2023-09-18 modification date. [S01, reused overview source]

ITIS currently treats *Perca fluviatilis* as a valid species and lists **Eurasian perch**, **European perch**, and **river perch** as English common names. It corroborates the taxon and the proposed English alias, but is not a Canadian market or recipe source. [S02]

The European Commission commercial-designation page is taxon-specific: it lists **perche européenne** for France and **European perch** for Ireland, and records caught and farmed production methods. This corroborates European commercial usage only. The Commission page attributes species-description material to FishBase; no Canadian market or recipe claim is drawn from it. [S03]

France’s DGCCRF list, version effective December 2025, lists *Perca fluviatilis* as **perche européenne, perche**. Its notice says the list records commercial designations notified by France and does not itself establish authorization to market each species. [S04]

OQLF’s GDT fish/ichthyology entry for **perche** maps the term to *P. fluviatilis* but marks the term **France**. It does not establish bare **perche** as the Québec display. Use the qualified Canadian CFIA wording **perche européenne**; do not call that wording an OQLF-preferred term. [S05]

An Ontario food retailer currently lists **European Lake Yellow Perch** as individually quick-frozen fillets, with European lake fisheries as the described source and Lake Erie perch as a comparison. The page does not give a binomial, and its wording is not used to identify that SKU as *P. fluviatilis*. The price-per-pound and size selector do not provide a standardized package mass. [S06]

## Proposed identity and picker scope

| Field | Proposal |
| --- | --- |
| Reference ID | `ingredient-ref-eurasian-perch` |
| Category | `PROTEIN` |
| English display | `Eurasian perch` |
| fr-CA display | `perche européenne` |
| English aliases | `European perch`; `European Yellow Perch` |
| French aliases | None |
| Scientific name | *Perca fluviatilis*; evidence only, not a search alias |
| Density / unit mappings | `null` / empty |

The aliases are limited to CFIA’s accepted alternate label and the English common name recorded by ITIS and the European Commission. Do not add **river perch**, **perch**, **yellow perch**, **perchaude**, **perche**, **perche commune**, **Perca fluviatilis**, or the unverified Ontario SKU wording as aliases. In particular, keep the seller’s **European Lake Yellow Perch** phrase source-local because the seller does not identify the scientific species.

The current phrase-first picker normalizes accents and punctuation, prefers complete word phrases, and uses substring matching only when no full-phrase result exists. The table projects the proposed display and two English aliases against the active 1,814-reference and 154-form snapshot:

| Query | Current results | With proposed row | Effect |
| --- | --- | --- | --- |
| `Eurasian perch` | None | Eurasian perch | Exact qualified display. |
| `European perch` | None | Eurasian perch | Exact sourced English alias. |
| `European Yellow Perch` | None | Eurasian perch | Exact CFIA alternate label. |
| `perche européenne` | None | Eurasian perch | Exact CFIA French display. |
| `perch` | Nile perch, White perch, Yellow perch, pike-perch (4) | Those four plus Eurasian perch (5) | Broad English search remains multi-result. |
| `perche` | Nile perch (1) | Nile perch and Eurasian perch (2) | Broad French search becomes multi-result. |
| `yellow perch` | Yellow perch (1) | Yellow perch and Eurasian perch (2) | The CFIA alternate English label surfaces both Perca species rather than silently hiding the European taxon. |
| `perchaude` | Yellow perch (1) | Yellow perch (1) | The Québec name for *P. flavescens* stays species-scoped. |
| `fish` | 14 references | 14 references | No generic fish term is added. |

Adding the alternate label broadens `yellow perch` to two separately titled species. The bare English and French family searches already remain or become multi-result. No query projects this qualified identity as the only result for a generic perch term.

## Active ownership and source-ID audit

The read-only snapshot contains **1,814 active references**, **154 forms**, **56 legacy candidates**, and **2,184 research-ledger records**. Exact scans found no active reference, form, legacy identity, ledger record, or archive proposal for `ingredient-ref-eurasian-perch`, `candidate-eurasian-perch`, *Perca fluviatilis*, **Eurasian perch**, **European perch**, **European Yellow Perch**, or **perche européenne**. The neighboring active identities listed above remain distinct and keep their current displays. The R600 source-ID prefix below is unallocated.

The CFIA results endpoint is widely used in the ledger, including with other query parameters. At proposal time, the exact Eurasian-perch query URL and the ITIS, European Commission, DGCCRF, OQLF, and Leamington URLs had no ledger owners; integration has now recorded them under S01–S06. The already-owned CFIA overview source `WP04-FINFISH-GAPS-20261010-S11` is reused rather than duplicated.

## Bundled recipe demand

Scanned all **114 manifest-listed recipe files**, their **1,123 structured ingredient rows**, and **753,988 exact recipe-file bytes**. The scan covered *Perca fluviatilis*, Eurasian perch, European perch, European Yellow Perch, perche européenne, perche commune, and river perch. It found **zero matching recipe files and zero matching ingredient rows**. Corpus fingerprint: **847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e**, SHA-256 over each manifest-relative recipe path, NUL separator, exact recipe bytes, and NUL separator in manifest order.

There is no recipe basis to add a species-specific cut, preparation, amount, role, method, recipe link, or substitution.

## Forms, measurements, and substitutions

The Ontario seller describes its own frozen fillet product and bills by the pound. It does not document a fixed package mass, count, edible yield, or the product’s scientific species; do not convert its price unit or selector into an ingredient measure. The official and taxonomic references reviewed here do not support a reusable fillet amount, serving measure, density, volume mapping, cooking yield, or count-to-mass mapping. Add no form, form label, measurement observation, density, unit mapping, conversion, package yield, or recipe link.

No reviewed source or bundled recipe supports a directed substitution between Eurasian perch, Yellow Perch, White Perch, Nile Perch, pike-perch, or generic fish. Add no global conversion, contextual substitution, warning rule, or recipe-line substitution.

## Source register

| Source ID | Source and locator | Evidence and limits |
| --- | --- | --- |
| `WP04-SECTIONP-EURASIAN-PERCH-R600-20261017-S01` | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fpresults.asp?cmbIn=e&q=Eurasian%20Perch), TSN 168470 and neighboring TSN 168469. | Lists *P. fluviatilis* as Eurasian Perch / Perche européenne and European Yellow Perch; the adjacent *P. flavescens* row lists Yellow Perch / Perchaude. Canadian fish-label naming, not retail inventory or recipe behavior. This specific query URL is unowned in the ledger. |
| Reused `WP04-FINFISH-GAPS-20261010-S11` | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | Defines the list’s Canadian English/French fish-label and scientific-name/TSN scope. Existing ledger source ID and URL reused. |
| `WP04-SECTIONP-EURASIAN-PERCH-R600-20261017-S02` | ITIS, [*Perca fluviatilis* TSN 168470](https://www.itis.gov/servlet/SingleRpt/SingleRpt?print_version=PRT&search_topic=TSN&search_value=168470). | Current standing valid; lists Eurasian perch, European perch, and river perch. Taxonomic and English-name cross-check only. |
| `WP04-SECTIONP-EURASIAN-PERCH-R600-20261017-S03` | European Commission, [Commercial designations: *Perca fluviatilis*](https://fish-commercial-names.ec.europa.eu/fish-names/species/perca-fluviatilis_en). | Lists France’s perche européenne and Ireland’s European perch, plus caught/farmed production methods. European commercial-name context only; not Canadian supply or recipe evidence. |
| `WP04-SECTIONP-EURASIAN-PERCH-R600-20261017-S04` | France DGCCRF, [Fish commercial-designation list, December 2025 version](https://www.economie.gouv.fr/files/files/directions_services/dgccrf/consommation/Produits-de-la-mer/poissons-decembre-2025.pdf), p. 17, *P. fluviatilis* row. | Lists perche européenne and perche, code FPE. The document explicitly says its notified designations do not determine whether a species is authorized for marketing. French commercial nomenclature only. |
| `WP04-SECTIONP-EURASIAN-PERCH-R600-20261017-S05` | OQLF, [GDT: perche](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10435867/perche), fish/ichthyology entry. | Maps French perche to *P. fluviatilis* but marks the term France. It does not establish bare perche as the Québec display; no OQLF preference claim is made for perche européenne. |
| `WP04-SECTIONP-EURASIAN-PERCH-R600-20261017-S06` | Leamington Food Outlet, [European Lake Yellow Perch](https://leamingtonfoodoutlet.ca/products/european-lake-yellow-perch). | Ontario seller describes IQF fillets from European lake fisheries and price per pound. It gives no binomial, French title, fixed package mass, or species-to-CFIA crosswalk; its item is not assigned to *P. fluviatilis* here. |

**R01 read-only audit:** Re-read AGENTS.md, the open regional-finfish and broader Section P checklist anchors, recent integrated WP04 rounds and proposals, active reference/form JSON, legacy identities, the research ledger, `IngredientSearch.kt`, the bundled manifest, and all manifest-listed recipe files. Source URL/ID ownership, candidate ID reuse, picker projection, and corpus checks are recorded above. Static document checks only; no app tests, build, emulator run, or deployment were performed for this proposal-only review.

## Proposed disposition

Integrated identity-only **Eurasian perch / perche européenne** for *Perca fluviatilis*, with only **European perch** and **European Yellow Perch** as English aliases. The CFIA Fish List directly provides the accepted Canadian bilingual identity and an alternate English label; ITIS confirms the species status and names, while European commercial-name references corroborate the English/French wording without asserting Québec preference. The Ontario product page remains unlinked to the species because it lacks a binomial. Broad perch searches remain multi-result, and `yellow perch` returns both CFIA-listed *Perca* species. No bundled recipe demand or reusable numeric behavior is supported. See the [R600 integration README](../batches/wp04-section-p-eurasian-perch-identity-integration-r600-20261017/README.md).
