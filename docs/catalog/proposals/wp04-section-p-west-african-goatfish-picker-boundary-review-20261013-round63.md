# WP04 Section P — West African goatfish / rouget du Sénégal picker-boundary review (round 63)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** Proposal-only fish identity, Québec naming, Canadian food-market, picker, ownership, recipe-demand, and field-limit review.
- **Candidate:** West African goatfish / `rouget du Sénégal` (*Pseudupeneus prayensis*).
- **Disposition:** **Hold** the species outside active references and the research ledger. CFIA gives a species-qualified bilingual name and a Montréal fishmonger lists the binomial on a food product, but a qualified row would make broad `rouget` and `goatfish` searches return this one species. OQLF and CFIA document broader uses of those terms, including another species in the Québec `rouget` market group.
- **Conditional identity shape if the picker can preserve the broader scope:** `ingredient-ref-west-african-goatfish`, category `PROTEIN`, English **West African goatfish**, Québec French **rouget du Sénégal**, no aliases, scoped to *P. prayensis*. This shape is not recommended for insertion under current picker behavior.
- **Status:** Root reviewed; held outside active references and the research ledger. The integration record is in [`wp04-section-p-west-african-goatfish-picker-boundary-hold-integration-20261013`](../batches/wp04-section-p-west-african-goatfish-picker-boundary-hold-integration-20261013/README.md).
- **Worktree scope:** this proposal file only. No shared catalog JSON, ledger, or recipe was changed.

## Why this is a distinct open gap

The open Section P parent still includes named and regional fish. The active checklist, current references and forms, legacy candidates, ledger, proposal archive, and batch archive contain no focused review or allocation for *Pseudupeneus prayensis*, West African goatfish, or `rouget du Sénégal`. This review concerns one goatfish species; it does not reopen recent bullhead, rockfish, saury, ocean-pout, clam, or crab decisions.

The candidate has a species-specific Canadian Fish List name pair. Québec evidence also establishes a broader local market group: OQLF maps `rouget` and English `goatfish` to *Pseudupeneus* sp. and says both *P. maculatus* and *P. prayensis* occur on the market. A current Montréal fishmonger lists **Rouget** with the binomial *P. prayensis*, Senegal origin, artisanal-fishery wording, and culinary suggestions. That is direct local product evidence for this species, while the broader Québec naming scope remains unresolved in the current picker.

## Identity and Québec naming boundary

CFIA lists *P. prayensis* as **West African Goatfish / Rouget du Sénégal**, and also lists the same species under the shorter **Goatfish / Rouget** pair. It separately lists a genus-level *Pseudupeneus* sp. row as **Goatfish / Rouget**. OQLF's edible-fish entry gives preferred Québec **rouget**, English **goatfish**, and Latin *Pseudupeneus* sp.; it identifies *P. maculatus* (rouget-barbet tacheté) and *P. prayensis* (rouget-barbet du Sénégal) as market species. OQLF says `barbet` and `rouget-barbet` were not retained for Québec fish-product marketing because a single normalized term is intended to avoid consumer confusion. [S01–S03]

Do not merge this candidate with the unrelated `red mullet / rouget-barbet` wording for Mullidae products, *Mullus* spp., or another goatfish genus. CFIA assigns **Goatfish / Rouget** to *Mulloidichthys* spp., *Mullus* spp., *Pseudupeneus* spp., *P. prayensis*, and *Upeneichthys* spp.; it also assigns **Red Mullet** to *Mullus* spp. and *Upeneichthys* spp. These Canadian label rows show that the shorter phrases do not identify *P. prayensis* alone. OQLF's Québec `rouget` entry is more narrowly *Pseudupeneus* sp., but explicitly includes two species. [S01–S02]

The conditional species identity is therefore limited to the exact qualified pair **West African goatfish / rouget du Sénégal**, for *P. prayensis*. Do not use `goatfish`, `rouget`, `red mullet`, `rouget-barbet`, `rouget-barbet tacheté`, `Pseudupeneus`, or the binomial as aliases. The candidate remains separate from goat meat / viande de chevreau; the app's token-based phrase search does not treat `goat` and `goatfish` as the same term.

## Exact ownership and prior-review audit

The ownership audit used [`normalizeIngredientSearchKey`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, Unicode NFKD, compatibility folding, accent removal, punctuation-to-space conversion, and whitespace collapse. Exact checks covered reference IDs, bilingual displays and aliases; form IDs, labels and match terms; legacy candidate IDs, names and aliases; and ledger record IDs and source/decision text.

The review-time snapshot contains 1,387 active references, 100 ingredient forms, 63 legacy-import candidates, and 1,720 ledger records with 6,762 source entries. No exact owner was found for the target names, taxon, or proposed IDs in the current references, forms, legacy candidates, or ledger. No existing form, recipe reference, ledger record, or legacy identity needs relinking. Searches of the plan and focused WP04 proposal/batch archive found no earlier *P. prayensis* or `rouget du Sénégal` decision.

| Key or neighbor | Current exact owner | Boundary |
|---|---|---|
| `West African goatfish`; `rouget du Sénégal`; *Pseudupeneus prayensis* | None in active references, forms, legacy candidates, or ledger. | The candidate's exact name and species are unallocated. |
| `ingredient-ref-west-african-goatfish`; `candidate-west-african-goatfish` | Neither ID is allocated in references, forms, legacy candidates, or ledger. | Conditional names only; do not reserve either ID while the hold stands. |
| `rouget`; `goatfish` | No exact active owner. | OQLF/CFIA evidence assigns these broader names to a genus or multiple fish taxa; do not allocate them through the species display. |
| `red mullet`; `rouget-barbet`; `rouget-barbet tacheté` | No exact active owner. | Keep distinct from the OQLF Québec `rouget` market group and from *P. prayensis*. |
| `goat` | `ingredient-ref-goat-meat` — goat meat / viande de chevreau. | Current `goat` search is meat-related; do not add a `goat` alias. |

The proposal-local source prefix `WP04-SECTIONP-WEST-AFRICAN-GOATFISH-BOUNDARY-20261013-R63-` was checked against the research ledger and proposal/batch archive and is unused. CFIA's general Fish List scope source reuses the already-owned source ID `WP04-SECTIONP-BLUE-CRAB-IDENTITY-20261013-R5-S04` if a later ledger update needs that same overview claim; the species-row evidence below has its own proposal-local source ID.

## Phrase-first picker projection

The picker indexes bilingual displays, aliases, and attached-form search terms, then prefers full word phrases before substring fallback. I projected the conditional row using the current reference and form data; no aliases or forms were added.

| Query | Current picker | With conditional row | Boundary |
|---|---|---|---|
| `West African goatfish` | No result | West African goatfish / rouget du Sénégal only | Exact species-qualified English display. |
| `rouget du Sénégal` | No result | Same candidate only | Exact species-qualified French display. |
| `rouget` | No result | Same candidate only | OQLF scopes this Québec term to *Pseudupeneus* sp. and names two market species; CFIA also uses it on other taxa. A singleton would overstate species resolution. |
| `goatfish` | No result | Same candidate only | CFIA applies the common name to multiple genera; this would falsely narrow a broad English query. |
| `red mullet`; `rouget-barbet`; `Pseudupeneus prayensis` | No result | No result with the proposed names and no scientific-name alias | Do not redirect these distinct or technical searches to the candidate. |
| `goat` | Goat meat / viande de chevreau | Same existing result | `goatfish` remains a whole-word token; no meat result is displaced. |

The two exact qualified queries would be useful, and the Québec product listing supplies species-specific evidence. The current matcher cannot make the display terms `rouget` and `goatfish` keep their broader choices visible. Keep the row unallocated until a genus/group identity or search behavior can represent the relevant scope without presenting one species as the only answer.

## Canadian and Québec food-use evidence

Poissonnerie Cartierville's current Montréal product catalogue offers **Rouget**, identifies it as *Pseudupeneus prayensis*, gives Senegal / artisanal-fishery wording, and describes it as suitable for frying or grilling. The page shows a product price and a 0.23–0.5 kg size band; these belong to that vendor's listing and are not a recipe portion or reusable count measure. The page does not state a harvest lot, a standardized package, or a universal product form. [S04]

Poissonnerie La Gambas, a Montréal fishmonger with local pickup and delivery, also lists **Rouget Barbet (Entière)** as a frozen Senegal-origin item with cleaning and scaling details. It gives no binomial. This confirms local food-market use of a conflicting retail phrase, but does not identify that item as *P. prayensis* or make `rouget-barbet` a Québec catalog alias. Its 1 kg item weight is product-specific. [S05]

These retailer sources support current Québec-facing food use and demonstrate why product wording alone must not widen the identity. OQLF supplies the normalized Québec name scope, and CFIA supplies the accepted species-specific Canadian label pair. Neither the 2011 OQLF entry nor the 2023-modified Fish List establishes which species an unqualified package means unless that package identifies the taxon.

## Complete bundled-recipe demand audit

All **114 manifest-listed recipe files**, all **1,123 ingredient rows**, and the complete parsed recipe JSON text were scanned for `West African goatfish`, `goatfish`, `rouget du Sénégal`, `rouget`, *Pseudupeneus prayensis*, `Pseudupeneus`, `red mullet`, and `rouget-barbet`. The scan found **zero matching recipe files and zero ingredient-row hits** for every candidate phrase. No recipe identifies a product state, amount, cooking method, or source-specific label that could be linked to this identity.

The retail size bands and package weight above do not establish kitchen measures. No source reviewed here supplies an applicable density, mass/volume mapping, unit conversion, edible yield, cooking yield, or generally reusable portion for *P. prayensis*. No bundled recipe or source establishes a directed substitute for another goatfish, red mullet, or finfish.

## Conditional fields and limits

| Field | Conditional value if the picker boundary is resolved |
|---|---|
| ID | `ingredient-ref-west-african-goatfish` |
| Category | `PROTEIN` |
| English display | `West African goatfish` |
| Québec French display | `rouget du Sénégal` |
| Scope | *Pseudupeneus prayensis* |
| English/French aliases | None |
| Default density / unit mappings | `null` / `[]` |
| Forms, measurements, conversions, yields | None |
| Recipe links / substitutions | None |

Under the current hold, do not create this reference, a legacy-import candidate, or a ledger candidate. Keep the retailer's size and weight wording source-specific in this proposal. Do not infer frozen, whole, cleaned, scaled, or other reusable forms for the species from a second seller's unbinned item; add no package yield, density, mapping, conversion, recipe link, cooking yield, or global/contextual substitution.

## Recommendation

Keep *Pseudupeneus prayensis* out of active references and the research ledger for now. The exact species pair and a current local food product are supported, but an active row would make generic `rouget` and `goatfish` queries appear resolved to one species. Revisit if the catalog first represents the broader *Pseudupeneus* market group and its other named species, or if search behavior can preserve that broader choice alongside a species-qualified result. Do not merge this fish with *Mullus* red mullet or propagate the Montréal seller's `rouget-barbet` wording to the active catalog.

No tests or emulator checks were run: this is a proposal-only documentation change with no database JSON changes.

## Root integration outcome

Confirmed the hold. CFIA and OQLF distinguish the species-qualified label pair from broader `rouget` / `goatfish` names, and OQLF identifies two *Pseudupeneus* market species under the Québec term. Under current picker behavior, adding a species row would present a single species for each broad query. The candidate remains unallocated; no reference, alias, ledger candidate, form, measure, recipe link, conversion, yield, or substitution was added. Section P remains open.

## Sources

Sources were accessed on 2026-10-13. Proposal-local source IDs are not ledger allocations.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP04-SECTIONP-WEST-AFRICAN-GOATFISH-BOUNDARY-20261013-R63-S01` | Office québécois de la langue française, [rouget (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198981/rouget) | Preferred Québec edible-fish term `rouget`, English `goatfish`, *Pseudupeneus* sp.; names *P. maculatus* and *P. prayensis* as market species. States that `barbet` and `rouget-barbet` were not retained for Québec fish-product marketing. Last updated 2011; terminology and market-scope evidence, not current stock. |
| `WP04-SECTIONP-WEST-AFRICAN-GOATFISH-BOUNDARY-20261013-R63-S02` | Canadian Food Inspection Agency, [CFIA Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | Lists *P. prayensis* as Goatfish / Rouget and West African Goatfish / Rouget du Sénégal; also lists *Pseudupeneus* spp. as Goatfish / Rouget and applies Goatfish / Rouget to other Mullidae genera. Result table shows a 2023-09-18 modification date. Canadian fish-label names and taxonomy, not proof of a specific retail item or recipe equivalence. |
| **Reused `WP04-SECTIONP-BLUE-CRAB-IDENTITY-20261013-R5-S04`** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Describes English/French common names acceptable for Canadian fish labelling and their scientific-name/TSN association. It does not establish retail availability or culinary measures. |
| `WP04-SECTIONP-WEST-AFRICAN-GOATFISH-BOUNDARY-20261013-R63-S03` | Poissonnerie Cartierville, [catalogue](https://poissonneriecartierville.com/catalogue) | Montréal catalogue entry names Rouget, identifies *P. prayensis*, and gives Senegal / artisanal-fishery wording and culinary uses. Its size and price are listing-specific; the page does not give a harvest lot, standardized form, or reusable measure. |
| `WP04-SECTIONP-WEST-AFRICAN-GOATFISH-BOUNDARY-20261013-R63-S04` | Poissonnerie La Gambas, [Rouget Barbet (Entière)](https://lagambas.ca/products/rouget-barbet) | Montréal fishmonger lists a whole frozen Senegal-origin product with cleaning/scaling wording and a vendor package weight, but no binomial. This corroborates local seafood use and terminology variation only; it does not identify the SKU as *P. prayensis* or supply reusable form/measure data. |
