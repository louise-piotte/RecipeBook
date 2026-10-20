# WP04 Section P — Atlantic razor clam / couteau picker boundary (round 51)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** Proposal-only species identity, Québec naming and product context, picker, exact ownership, recipe-demand, measurement, and substitution review.
- **Recommendation:** **Hold Atlantic razor clam / couteau outside active ingredient references and the research ledger.** CFIA, OQLF, federal fishery regulations, and Québec seafood sources establish a distinct edible bivalve and local fishery context. However, adding the alias-free identity would make broad clam and razor clam queries resolve to this one row while the generic clam candidate remains unresolved. CFIA uses Razor Clam for *Ensis directus*, *E. siliqua*, *Siliqua costata*, and *S. patula*; it also pairs Couteau with both *E. directus* and *S. costata*. The Québec display couteau would therefore appear to identify one species despite a Canadian name collision, and the same word occurs as a kitchen utensil in recipe instructions. No bundled recipe requests a clam or this species. Keep the species outside the active picker until it can preserve the generic clam choice and multiple razor-clam species, or a recipe or product request selects a specific scope.
- **Conditional identity shape, for impact analysis only:** ingredient-ref-atlantic-razor-clam, category PROTEIN, English **Atlantic razor clam**, Québec French **couteau**, scoped to the CFIA/OQLF binomial *Ensis directus*. Current DFO Québec records and the local seafood guide use *E. leei* for a similarly named local food/fishery resource. This packet records that source-name discrepancy and does not assert synonymy or choose a canonical binomial. Empty alias arrays, null density, and no unit mappings are shown only as a conditional shape. This row is **not** recommended for activation.
- **Shared-data effect:** Root accepted and integrated this documentation-only hold on 2026-10-13. No active reference, form, alias, recipe link, measurement, conversion, yield, substitution, legacy candidate, or ledger record was added.
- **New proposal-local source IDs:** WP04-P-ATLANTIC-RAZOR-CLAM-20261013-R51-S01 through S07. Before this file was written, the prefix was absent from the live ledger and prior proposal/batch archive.

## Why this is a distinct open Section P gap

The Section P shellfish checklist remains open for mussel, clam, oyster, cockle, and other shellfish identities. The generic-clam review previously mentioned razor clam and couteau while assessing the broad clam boundary; it did not allocate or project an *Ensis directus* / *E. leei* identity or assess the current CFIA overlap with *Ensis siliqua*. The Arctic wedge-clam, Stimpson surf-clam, and generic-clam decisions remain separate and unchanged. This packet addresses only the Atlantic razor clam species boundary.

The terminology evidence is unusually specific, but the scientific-name records are not uniform. CFIA’s Fish List returns *E. directus* as both Atlantic Razor Clam / Couteau and Razor Clam / Couteau de l’Atlantique; it also lists *E. siliqua* as Razor Clam / Couteau-silique, *S. costata* as Razor Clam / Couteau, and *S. patula* as Razor Clam or Clam / Couteau de l’Atlantique. DFO’s bivalve identification guide separately calls *S. patula* Couteau. Thus both the broad English phrase Razor Clam and the proposed Québec display couteau have other Canadian species records. OQLF identifies the *E. directus* food mollusc and normalizes Québec couteau, but labels couteau de l’Atlantique France/Europe and says rasoir was not retained for Québec fish-product marketing. Current DFO Québec mapping and a local seafood guide instead use *E. leei* with Atlantic-razor-clam wording. This packet keeps that discrepancy visible and does not silently decide that the two binomials are synonyms.

## Québec and Canadian identity and food-market evidence

- **CFIA Fish List:** CFIA explains that the Fish List provides English/French common names acceptable in Canada for fish labeling along with corresponding scientific names. Its live lookup associates TSN 81022, *Ensis directus*, with both Atlantic Razor Clam / Couteau and Razor Clam / Couteau de l’Atlantique. It separately lists TSN 81026, *E. siliqua*, as Razor Clam / Couteau-silique; TSN 81012, *Siliqua costata*, as Razor Clam / Couteau; and TSN 81008, *S. patula*, as Razor Clam or Clam / Couteau de l’Atlantique. This supports the candidate identity and shows why neither unqualified Razor Clam nor couteau should become a global alias for one species. [S01]
- **Québec terminology:** OQLF’s GDT entry pairs razor clam and Atlantic razor clam with *Ensis directus*, and identifies couteau as the Québec-normalized term. It labels couteau de l’Atlantique France/Europe and says rasoir was not retained for Québec product marketing to avoid consumer-label confusion. The entry was last updated in 2012; it is authoritative terminology evidence but not a current product listing. [S02]
- **Federal fishery scope:** The current *Atlantic Fishery Regulations, 1985*, section 51, defines Atlantic razor clam as *Ensis directus* and gives the French statutory term couteau de l’Atlantique. For Part III only, its defined clam group includes Atlantic razor clam, soft-shell clam, and surf clam. This is a fishery-regulation definition, not a general ingredient or label definition. [S03]
- **Québec species/harvest context:** DFO’s Québec mapping layer identifies known concentration areas of harvested **and unharvested** *E. leei* in the Estuary and Gulf of St. Lawrence. Its metadata says the boundaries combine DFO inventories, research, and commercial-fishery data; the mapped areas depend on which inventories were conducted, do not show the full distribution, and do not indicate where fishing is permitted. The Open Government Portal record was modified 2026-03-24. This supports a Québec food/fishery context for the *E. leei* name, not its taxonomic equivalence to CFIA’s *E. directus* record, current retail stock, or harvest authorization. [S04]
- **Québec food use:** De l’eau à la bouche, an Exploramer project made with Université Laval, lists couteau droit / *Ensis leei*, with couteau américain, couteau de l’Atlantique, and couteau as other culinary wording. It describes consumption as fresh from March to December, conditional recreational harvesting, and an undetermined resource status; it also lists the species in Fourchette bleue. Its product page says the clams are generally sold fresh or canned, but does not provide a named consumer SKU, package amount, or recipe quantity. These are regional food-guide claims, not retail inventory or a taxonomic synonym decision. [S05]
- **Historical Québec supplier evidence:** Exploramer’s 2022 supplier directory lists couteau droit / Common razor clam / *Ensis directus* and Mermax as a fresh-summer supplier serving several Québec regions. This confirms a historical Québec distribution route; the directory is a 2022 snapshot and does not establish current availability in 2026. [S06]

The sources establish more than a taxonomic name: they support a Québec food and fishery context. No current Québec SKU was verified, and the historical supplier listing is not a current stock report. Neither point resolves the active picker collision or creates recipe demand.

## Exact ownership and prior-work audit

The exact-key audit follows normalizeIngredientSearchKey in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, NFKD normalization, compatibility folding, accent removal, punctuation-to-space conversion, and whitespace collapse. It checked active reference display names and aliases, form labels and match terms, legacy-import names and aliases, ledger record IDs and source text, and focused Section P proposal/batch decisions.

| Candidate key or ID | Current owner / evidence state |
|---|---|
| Atlantic razor clam, razor clam, razor clams, Atlantic jackknife clam, common razor clam, couteau, couteau droit, couteau de l’Atlantique, couteau-silique, rasoir, *Ensis directus*, *Ensis leei*, *E. siliqua*, *Siliqua costata*, *S. patula* | No exact active-reference, form, or legacy-import field owner; no species-specific ledger identity record. The CFIA/DFO competitor names remain source evidence only, not catalog assignments. |
| ingredient-ref-atlantic-razor-clam; candidate-atlantic-razor-clam | Absent from active references, forms, legacy candidates, and ledger record IDs. Neither ID is allocated by this hold. |
| ingredient-ref-clam | Existing ledger-only candidate with identityState: needs_clarification; there is no active generic clam reference. Preserve this decision and its three sources unchanged. |
| Forms | The 100 live forms contain no exact candidate name or search term. No clam or razor-clam form is attached to an active reference. |
| Legacy candidates | No candidate owns the candidate names, aliases, taxon, or proposed ID. |
| Prior focused packets | The generic-clam review mentions *S. patula* and razor clam/couteau as a broad-market and species-name boundary, but does not review the *Ensis* identity or its search projection. No dedicated Atlantic-razor-clam or *Ensis* proposal/batch was found. Arctic wedge clam and Stimpson surf clam are separate species decisions. |
| New source-ID prefix WP04-P-ATLANTIC-RAZOR-CLAM-20261013-R51-S | Before this proposal, the prefix was absent from the live ledger and prior proposal/batch archive. IDs S01–S07 are unique within this proposal. |

The live snapshot contained **1,379 references**, **100 forms**, **63 legacy-import candidates**, and **1,709 ledger records**. The ledger had 6,689 source entries and 5,613 distinct source IDs. The only directly related ledger identity is the unresolved generic ingredient-ref-clam candidate; it is not an owner for this species.

## Picker projection

This static projection mirrors the current search rules: complete normalized word phrases win, then substring matching is used only when no full-phrase result exists. It considers active references and attached form terms. No row or form was created; the conditional row below uses Atlantic razor clam / couteau with no aliases solely to show picker impact.

| Query | Current picker result(s) | With the conditional alias-free row | Consequence |
|---|---|---|---|
| Atlantic razor clam | No result | Atlantic razor clam / couteau only | A species-qualified English query would find the candidate. |
| razor clam | No result | Atlantic razor clam / couteau only | CFIA assigns Razor Clam to *E. siliqua*, *S. costata*, and *S. patula* as well; this species row would look like the single answer to a broader product query. |
| clam | No result | Atlantic razor clam / couteau only | The broad family query would appear resolved to this species while generic clam remains a ledger-only candidate. |
| clams | No result | No result | The conditional row has no plural alias; do not add one while generic clam scope remains unresolved. |
| couteau | No result | Atlantic razor clam / couteau only | OQLF’s normalized Québec term would find this row, but CFIA also pairs Couteau with *S. costata*. Nine full-recipe text hits are French utensil instructions, not ingredient rows or food requests; the ingredient picker does not search recipe prose. |
| couteau droit | No result | No result | This local food-guide name is evidence, but is not proposed as an alias in this held conditional shape. |
| couteau de l’Atlantique, rasoir | No result | No result | Do not add these terms globally: CFIA pairs Couteau de l’Atlantique with *S. patula* as well as *E. directus*, OQLF labels the former France/Europe, and OQLF says rasoir was not retained for Québec fish-product marketing. |
| Ensis directus, Ensis leei, couteau-silique | No result | No result | Keep scientific names and the distinct *E. siliqua* French display outside the alias set. |

The current picker cannot display a generic clam choice alongside species-specific clams because the generic candidate is not active. Activating the conditional row would make broad clam and razor clam searches look settled on one species. Keep this candidate unallocated until the search behavior can represent the broader choice or an exact recipe/product request establishes the needed species.

## Bundled recipe demand

The current manifest lists **114 recipe files and 1,123 ingredient rows**. Every complete recipe JSON document and every ingredient row was scanned for Atlantic razor clam, razor clam, couteau, couteau droit, couteau de l’Atlantique, *Ensis directus*, *Ensis leei*, clam, and related shellfish terms.

**Result: zero matching recipe files and zero matching ingredient rows for a clam or razor-clam product.** The nine full-text couteau matches are knife/utensil instructions. Recipe 093#4’s unlinked Cooked meat or seafood, to taste remains too broad to identify a clam. No recipe link, relink, product state, amount, or recipe-specific substitution is supported.

## Measurement and substitution evidence

| Dimension | Evidence found | Catalog decision |
|---|---|---|
| Identity and product | CFIA/OQLF and federal fishery sources identify the species and local name; CFIA also maps the same broad English and French names to other species. DFO maps known harvested and unharvested concentrations; the Québec seafood guide describes local food use. The old supplier directory documents fresh-summer distribution only in 2022. | Keep identity unallocated because the current picker would make broad clam, razor clam, and couteau queries single-species results; do not claim a current SKU. |
| Aliases and forms | The Québec food guide uses couteau droit, while OQLF normalizes couteau; CFIA and DFO sources also show couteau de l’Atlantique. No recipe or current package chooses a form or alias set. | Add no aliases or fresh, canned, cooked, shelled, frozen, or other form. Keep couteau de l’Atlantique, rasoir, couteau-silique, and scientific names out of global aliases. |
| Numeric evidence | The local guide gives biological size and fishery management limits; these are not ingredient measures. The historical supplier directory gives seasonal availability, not package weight. General shellfish cooking and handling guidance is not species-specific recipe evidence. | Record no portion, default measure, density, unit mapping, conversion, count mapping, package yield, or preparation-state yield. |
| Substitutions | No bundled recipe or reviewed Canadian/Québec source tests Atlantic razor clam against another clam species for a named method and amount. Family membership and qualitative flavor/texture statements are insufficient. | Add no global or contextual substitution, ratio, warning, recipe-line link, or food-safety equivalence. |

## Proposal-time baseline snapshot

Counts and hashes describe the shared worktree read on **2026-10-13**. Hashes cover exact file bytes. The recipe fingerprint hashes each manifest-ordered relative path, a NUL byte, exact recipe bytes, and another NUL byte. No shared catalog, ledger, recipe, plan, roadmap, batch, or generated file was changed by this proposal.

| Artifact | Count / size | SHA-256 or fingerprint |
|---|---:|---|
| ingredient-references.v1.json | 1,379 references; 442,517 bytes | 9f4dee58365accf6feb1c765b0f02f4a0fac732d11895c79ebc5efae59775d01 |
| ingredient-forms.v1.json | 100 forms; 74,742 bytes | 10d6ff7e9dce21aecb8bda299f16a04882fa6f17235d0d5a976de4ce9cf3da63 |
| legacy-import-identities.v1.json | 63 candidates; 15,042 bytes | a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb |
| research-ledger.v1.json | 1,709 records; 6,689 source entries; 5,613 distinct source IDs; 6,661,586 bytes | 59143f0b03005a2270eb3b1647931a4852886754aa6ee4ae275d950e5ebd17cf |
| manifest.v1.json | 114 recipe paths; 12,011 bytes | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,806 bytes | 81f1dd0b010f9c90316ebb20b76800442dd29ceaeaf7559d8cd16d38efa7c552 |
| Generated BundledIngredientCatalog.kt | 1,379 references; 605,014 bytes | 5a63c53f043366af813df9d148dc25fdeccf6d62f31159824121e8647d84e93b |

## Source register

Online sources were accessed on 2026-10-13. The six IDs below are proposal-local and are not added to the shared ledger.

| Source ID | Source and supported claim | Limits |
|---|---|---|
| WP04-P-ATLANTIC-RAZOR-CLAM-20261013-R51-S01 | CFIA, [Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [Razor Clam lookup](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fplist.asp?cmbIn=e&lang=e&q=Razor+Clam). The Fish List returns TSN 81022 *Ensis directus* with Atlantic Razor Clam / Couteau and Razor Clam / Couteau de l’Atlantique; TSN 81026 *E. siliqua* with Razor Clam / Couteau-silique; TSN 81012 *Siliqua costata* with Razor Clam / Couteau; and TSN 81008 *S. patula* with Razor Clam or Clam / Couteau de l’Atlantique. | Fish labeling common names and species records; not a Québec retail SKU or recipe measure. |
| WP04-P-ATLANTIC-RAZOR-CLAM-20261013-R51-S02 | Office québécois de la langue française, [couteau (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198882/couteau). It identifies the food mollusc *E. directus*, normalizes couteau in Québec, labels couteau de l’Atlantique France/Europe, and says rasoir was not retained for Québec fish-product marketing. | The entry was last updated in 2012; terminology, not current supply or recipe use. |
| WP04-P-ATLANTIC-RAZOR-CLAM-20261013-R51-S03 | Government of Canada, Justice Laws, [Atlantic Fishery Regulations, 1985, s. 51](https://laws-lois.justice.gc.ca/eng/regulations/SOR-86-21/section-51.html?txthl=means). Current regulation text defines Atlantic razor clam as *E. directus* and, within Part III, defines clam as Atlantic razor clam, soft-shell clam, or surf clam. | Regulatory definitions for that Part; not a general culinary or consumer-label taxonomy. |
| WP04-P-ATLANTIC-RAZOR-CLAM-20261013-R51-S04 | Fisheries and Oceans Canada, [known concentration areas of the Atlantic razor clam in the Estuary and Gulf of St. Lawrence](https://egisp.dfo-mpo.gc.ca/arcgis/rest/services/open_data_donnees_ouvertes/biological_sensitivity_mapping_for_oil_spill_planning_and_response_quebec_en/MapServer/2) and [Open Government Portal record](https://open.canada.ca/data/fr/dataset/a0039b2e-7847-4d48-8fd8-638677760f8b). The Québec layer uses *E. leei* / Couteau de l’Atlantique and maps known harvested and unharvested concentrations. | Layer coverage depends on surveyed areas, does not capture full species distribution, and does not identify where fishing is permitted or current retail supply. It does not resolve the binomial discrepancy with CFIA; record modified 2026-03-24. |
| WP04-P-ATLANTIC-RAZOR-CLAM-20261013-R51-S05 | De l’eau à la bouche, [Couteau droit](https://deleaualabouche.ca/especes/couteau-droit/), a Québec seafood education project developed with Exploramer and Université Laval. It names *E. leei*, lists local French wording, describes seasonal local consumption and fishing, and says products are generally sold fresh or canned. | Regional food-program information, not a current retailer SKU, package amount, recipe-specific measure, or taxonomic crosswalk to the CFIA *E. directus* record. |
| WP04-P-ATLANTIC-RAZOR-CLAM-20261013-R51-S06 | Exploramer, [Répertoire des fournisseurs 2022](https://exploramer.qc.ca/wp-content/uploads/2022/10/22.09.30-Repertoire-des-fournisseurs-2022.pdf), entry 9. Lists Couteau droit / Common razor clam / *Ensis directus* and Mermax as fresh-summer supplier to Québec regions. | 2022 supplier snapshot; does not confirm 2026 stock or establish a consumer package size. |
| WP04-P-ATLANTIC-RAZOR-CLAM-20261013-R51-S07 | Fisheries and Oceans Canada, [Identification des mollusques bivalves](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-fra.htm). The Canadian bivalve guide labels *Siliqua patula* `Couteau`, adding a second Canadian authority with a broad French product name that overlaps this candidate. | National species-identification guide modified 2021-06-09; not a Québec consumer label standard, current product listing, or recipe measure. |

## Recommendation and revisit condition

Keep Atlantic razor clam / couteau unallocated in the active picker and ledger. Preserve the existing generic ingredient-ref-clam candidate. Do not add razor clam, couteau droit, couteau de l’Atlantique, rasoir, couteau-silique, or scientific names as global aliases; do not infer a form, measure, recipe link, conversion, yield, or substitution from fishery and general food-guide evidence. Revisit if a bundled recipe or exact product request names this species, or if picker behavior can preserve a generic clam choice and show the distinct *Ensis* razor-clam species together. Section P remains open.

This documentation-only hold changed no application or database data and needed no app tests or emulator checks.

## Root integration decision (2026-10-13)

Accepted the hold. The CFIA Fish List confirms the name collision across *E. directus*, *E. siliqua*, *S. costata*, and *S. patula*; DFO also calls *S. patula* `Couteau`. OQLF supports the Québec display `couteau` for *E. directus*, while the source set uses *E. leei* in Québec fishery and food-guide records without establishing a taxonomic crosswalk. A new row would make broad `clam`, `razor clam`, and `couteau` searches appear single-species in the live picker, and the bundle has no clam ingredient demand. Keep the current generic `ingredient-ref-clam` candidate unresolved and allocate no Atlantic razor-clam reference or ledger record.

Integration is recorded in the [batch README](../batches/wp04-section-p-atlantic-razor-clam-picker-hold-integration-20261013/README.md) and the open Section P checklist and chronology in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt).
