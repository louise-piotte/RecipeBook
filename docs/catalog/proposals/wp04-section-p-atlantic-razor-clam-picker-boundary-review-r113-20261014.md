# WP04 Section P — Atlantic razor clam / couteau droit picker boundary (R113)

- **Review and source-access date:** 2026-10-14.
- **Packet type:** Proposal-only recheck of the R51 Atlantic razor-clam hold, Québec terminology and current market wording, picker projection, ownership, recipe demand, numeric/form limits, and substitutions.
- **Recommendation:** **Keep the species outside active ingredient references and the research ledger.** Newer Québec evidence supports a species-qualified French identity, especially **couteau droit**, and clarifies that Québec sources using *Ensis directus* and *Ensis leei* refer to the local Atlantic razor-clam naming context. That does not make activation safe in the current picker: the phrase-first search treats broad `couteau`, `razor clam`, and `clam` queries as complete phrases inside the proposed display names and would return this one species as the only result. CFIA still assigns broad Razor Clam and Couteau names across multiple taxa, while the generic `ingredient-ref-clam` remains unresolved. No bundled recipe selects a clam. Keep the existing hold; no active identity, alias, form, ledger record, recipe link, measure, conversion, yield, or substitution is proposed.
- **Conditional identity shape, for boundary analysis only:** Québec French display **couteau droit**; English display **Atlantic razor clam**; scoped to the North American Atlantic *Ensis* food species. Current marine taxonomy accepts *Ensis leei*; CFIA and OQLF food-naming records, and the 2024 Québec government species table, use *E. directus*. The local seafood resource explicitly presents `Ensis directus (Ensis leei)`. Preserve that source-specific nomenclature in the evidence; do not use the scientific names or broad common names as new picker aliases. This conditional row is **not** recommended for activation.
- **Shared-data effect:** Documentation-only review. It does not supersede the integrated R51 hold, generic-clam hold, or the separate Arctic wedge-clam and Stimpson surf-clam holds. The existing generic candidate remains unchanged.
- **Proposal-local source IDs:** `WP04-P-ATLANTIC-RAZOR-CLAM-20261014-R113-S01` through `S09`. This prefix was absent from the live ledger and proposal/batch archive before this file was written. These IDs are local citations only and are not added to the ledger.

## Updated Québec identity evidence

The R51 review correctly kept the species out of the picker because its broad names were ambiguous and it found no recent Québec retail SKU. This recheck adds a clearer French species name and current regional context:

- The Québec government’s 2024 environmental-assessment appendix names **Couteau droit** and pairs it with *Ensis directus*. This is a Québec species-name record, not a consumer SKU.
- The current regional seafood page **Couteau droit** pairs the same local name with *Ensis directus (Ensis leei)* and describes Québec food and commercial-fishery context. It reports an undetermined resource status and sporadic fishing on the North Shore; it is not a current seller inventory or label photograph.
- Fisheries and Oceans Canada’s Québec concentration-area record, modified 2026-03-24, uses *Ensis leei* for Couteau de l’Atlantique. The layer maps known exploited and unexploited areas only; it does not show the full distribution or authorize harvesting.
- WoRMS currently accepts *Ensis leei* and lists *Ensis directus* sensu Abbott, 1954 as an unaccepted synonym. This is a useful current taxonomic cross-reference, but it does not override the names used in Canadian food labelling.
- OQLF’s GDT entry still normalizes **couteau** for the food mollusc under *E. directus*. It labels **couteau de l’Atlantique** France/Europe and says **rasoir** was not retained for Québec fish-product marketing to avoid consumer-label confusion.

Thus a Québec French species-qualified name is now well supported for an internal identity scope. A current Québec merchant listing was also found, but its title is **Couteaux de mer vivants de l’Atlantique** and it says arrivals may be from Canada or Europe; it gives no Latin name. It is market evidence for a broadly worded product, not proof that the product is this local species.

## Current Canadian name overlap

The CFIA Fish List, which provides English and French common names acceptable in Canada for fish labelling, still shows collisions relevant to the picker:

| CFIA scientific-name row | English name(s) shown | French name(s) shown |
|---|---|---|
| *Ensis directus* (TSN 81022) | Razor Clam; Atlantic Razor Clam | Couteau de l’Atlantique; Couteau |
| *Ensis siliqua* (TSN 81026) | Razor Clam | Couteau-silique |
| *Siliqua costata* (TSN 81012) | Razor Clam | Couteau |
| *Siliqua patula* (TSN 81008) | Razor Clam; Clam | Couteau de l’Atlantique |

DFO’s current bivalve identification guide also uses **Razor clam** for *Siliqua patula*. The species-qualified phrase **couteau droit** is more precise in Québec sources, but its first word remains a broad search term and the English phrase **Atlantic razor clam** contains the shared `razor clam` term.

## Current catalog ownership and prior-work audit

The audit used the live bundled reference and form files, the legacy-import identity list, the research ledger, and focused Section P proposals/batches. Exact-key comparison follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase and compatibility-fold, remove accents, turn punctuation into spaces, and collapse whitespace.

| Candidate keys or identifiers | Current owner / evidence state |
|---|---|
| `Atlantic razor clam`, `razor clam(s)`, `Atlantic jackknife clam`, `common razor clam`, `couteau`, `couteau droit`, `couteau de l’Atlantique`, `couteau de mer`, `couteau américain`, `rasoir`, *Ensis directus*, *Ensis leei*, and the competing binomials above | No exact active-reference, form, or legacy-candidate field owner. No species-specific identity record in the ledger. |
| `ingredient-ref-atlantic-razor-clam`, `candidate-atlantic-razor-clam`, and the R113 source-ID prefix | No current identifier allocation in references, forms, legacy candidates, ledger record IDs, or the focused proposal/batch archive. |
| `ingredient-ref-clam` | Existing ledger-only candidate; `recordType: candidate`, `identityState: needs_clarification`, with an unresolved decision to wait for a product or recipe target. Do not change it. |
| Forms and legacy candidates | The live package has 105 forms and the legacy file has 63 candidates; neither has an exact candidate name, alias, label, or match-term owner. |
| Related Section P decisions | The generic clam / palourde hold, Arctic wedge-clam / `clovisse arctique` hold, Stimpson surf-clam hold, and separate clam product-state hold remain independent. Their scope and decisions are unchanged. |

The current live snapshot contains **1,455 active references**, **105 forms**, **63 legacy candidates**, and **1,795 research-ledger records**. The focused archive contains the original [R51 Atlantic razor-clam review](wp04-section-p-atlantic-razor-clam-couteau-picker-boundary-review-20261013-round51.md) and [integrated hold](../batches/wp04-section-p-atlantic-razor-clam-picker-hold-integration-20261013/README.md); no later species-specific activation was found. The currently maintained [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt) marks that hold integrated and keeps Section P open.

## Picker projection

The current `IngredientReferenceSearchIndex` returns complete normalized word phrases found anywhere within a reference or attached form term before using substring fallback. This means a query can be a whole phrase in a longer qualified display. The following static projection adds only the conditional bilingual display names above and no aliases; it does not modify the package.

| Query | Current results | With conditional `Atlantic razor clam / couteau droit` row | Why it matters |
|---|---:|---:|---|
| `couteau` | 0 | 1 | The French qualifier does not stop the broad term from matching the display. |
| `couteau droit` | 0 | 1 | Species-qualified French query works. |
| `razor clam` | 0 | 1 | The phrase matches inside `Atlantic razor clam`, despite broader Canadian use. |
| `Atlantic razor clam` | 0 | 1 | Species-scoped English query works. |
| `clam` | 0 | 1 | Would make the held species look like the generic clam answer. |
| `clams` | 0 | 0 | No plural alias is present in the conditional shape. |
| `razor` | 0 | 1 | The partial query also returns the same singleton. |
| `Ensis leei` | 0 | 0 | No scientific-name alias is proposed. |

The current picker therefore cannot offer the supported species-scoped choice while keeping broad `couteau` / `razor clam` / `clam` searches neutral. Adding fewer aliases does not fix this because the broad words occur in the bilingual display names. Revisit after the picker can require the qualified phrase for species-specific results, or can present a legitimate generic/multi-species choice alongside the species without implying that it resolves the broader search. Until then, keep the row inactive and do not reserve its conditional ID.

## Bundled recipe demand

All **114 manifest-listed recipe files** and their **1,123 ingredient rows** were scanned for clam-family terms, the English razor/jackknife names, the French couteau/rasoir family, and the relevant *Ensis* and *Siliqua* binomials. The scan found **zero matching recipe files for a clam or razor-clam ingredient and zero matching ingredient rows**. There are nine French full-text `couteau` hits, all kitchen-utensil instructions or notes; recipe prose is not searched by the ingredient picker. No recipe link, relink, form, amount, or substitution is supported.

## Numeric, form, and substitution limits

| Dimension | Current evidence | Catalog limit |
|---|---|---|
| Numeric | The current Québec retailer lists 2 lb (about 20–24 animals) and 10 lb (about 100–120) product options, but says origin may be Canada or Europe according to arrivals and supplies no scientific name. Federal regulations set a 100 mm minimum shell length for Atlantic razor-clam harvest. | Do not apply the retailer’s pack sizes or count estimates to this species, infer a count-to-weight mapping, add household measures or density, or store the legal harvest length as a recipe measure. No portion, conversion, or package yield is supported. |
| Form and availability | The retailer calls its uncertain-origin product live. Regional Québec references describe the local species and fishery; the older 2022 Exploramer directory listed a fresh-summer supplier, but is historical. No current seller listing ties a product state to *E. leei* / *E. directus*. | Add no live, fresh, canned, shelled, frozen, drained, or cooked form and no form match terms. Do not claim current availability of a species-specific Québec SKU. |
| Recipe use | No ingredient-row or recipe-text demand identifies a clam; the nine `couteau` hits are utensils. | No recipe reference or quantity. |
| Substitution | The reviewed Canadian/Québec sources identify names, taxa, fisheries, and broad food context; they do not give a tested substitution amount or named recipe method equating this species with generic clams, Arctic wedge clam, Stimpson surf clam, other razor-clam taxa, or another seafood. | Add no global or contextual substitution, ratio, warning, or recipe-line substitution link. |

## Sources

Online pages were accessed on **2026-10-14**, except where the source states its own update date. Limits apply to each source’s claim, as indicated.

| ID | Source and evidence | Limit |
|---|---|---|
| `WP04-P-ATLANTIC-RAZOR-CLAM-20261014-R113-S01` | Office québécois de la langue française, [GDT — couteau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198882/couteau). Maps the food mollusc to *Ensis directus*, normalizes `couteau`, labels `couteau de l’Atlantique` France/Europe, and says `rasoir` was not retained in Québec fish-product marketing. | Entry last updated 2012; authoritative Québec terminology, not a current retail listing. |
| `WP04-P-ATLANTIC-RAZOR-CLAM-20261014-R113-S02` | Government of Québec, [2024 environmental-assessment appendix](https://www.ree.environnement.gouv.qc.ca/dossiers/3211-02-322/3211-02-322-24.pdf), Appendix A-1. Lists French common name `Couteau droit` with *Ensis directus*. | A Québec species table, not consumer packaging or proof of a current product SKU. |
| `WP04-P-ATLANTIC-RAZOR-CLAM-20261014-R113-S03` | Mange ton Saint-Laurent, [Couteau droit](https://mangetonsaintlaurent.com/especes/couteau-droit/). Uses *Ensis directus (Ensis leei)*, “Couteau droit,” and “Common razor clam / American jacknife clam”; gives Québec food and commercial-fishery context and says resource status is undetermined. | Regional seafood education resource; not a vendor SKU, package label, or current inventory. |
| `WP04-P-ATLANTIC-RAZOR-CLAM-20261014-R113-S04` | Fisheries and Oceans Canada, [known concentration areas of Couteau de l’Atlantique in the Estuary and Gulf of St. Lawrence](https://open.canada.ca/data/fr/dataset/a0039b2e-7847-4d48-8fd8-638677760f8b). Dataset uses *Ensis leei* and was modified 2026-03-24; it maps known exploited and unexploited concentration areas. | Survey-dependent areas only; not full distribution, permission to fish, retail supply, or a synonym ruling against the food-label sources. |
| `WP04-P-ATLANTIC-RAZOR-CLAM-20261014-R113-S05` | WoRMS / MolluscaBase, [Ensis leei](https://www.marinespecies.org/aphia.php?id=876640&p=taxdetails). Current accepted species name; lists *Ensis directus* sensu Abbott, 1954 as an unaccepted synonym. | Taxonomy source; not the authority for Canadian food-label display wording. |
| `WP04-P-ATLANTIC-RAZOR-CLAM-20261014-R113-S06` | CFIA, [Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [current Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp). Fish List results pair the overlapping English/French names with *E. directus*, *E. siliqua*, *S. costata*, and *S. patula* as tabulated above. | Acceptable Canadian fish-label common names and TSNs; not evidence that any one Québec seller’s product is one of these species. |
| `WP04-P-ATLANTIC-RAZOR-CLAM-20261014-R113-S07` | Fisheries and Oceans Canada, [Identifying bivalve shellfish](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm). The current guide labels *Siliqua patula* “Razor clam.” | Canadian species-identification guide; it does not identify a particular Québec product. |
| `WP04-P-ATLANTIC-RAZOR-CLAM-20261014-R113-S08` | Capone Gourmet, [Couteaux de mer vivants de l’Atlantique](https://caponegourmet.com/products/couteaux-de-mer-vivants-atlantique-capone-gourmet). Current Québec-facing listing says the product may originate in Canada or Europe depending on arrivals; offers 2 lb and 10 lb options and calls the product live. | No binomial or exact species. Its formats cannot be attributed to the local *Ensis* identity or used as a generic conversion. |
| `WP04-P-ATLANTIC-RAZOR-CLAM-20261014-R113-S09` | Government of Canada, [Atlantic Fishery Regulations, 1985, ss. 51 and 51.2](https://laws-lois.justice.gc.ca/eng/regulations/SOR-86-21/FullText.html?txthl=x). Defines Atlantic razor clam as *Ensis directus* and lists its 100 mm minimum retained length. | Fishery-regulation name and harvest limit; not an ingredient measure or food-safety cooking instruction. |

## Revisit condition

Keep the current hold. Reopen if a recipe or exact product request selects the species, or if picker behavior can preserve its species qualification without treating `couteau`, `razor clam`, or `clam` as resolved by this single row. At that point, carry the current taxonomic cross-reference transparently, use `couteau droit` for Québec French display, and review the exact seller label before adding forms or quantities. Section P remains open. This proposal changes no database JSON, so no app tests or emulator checks were run.
