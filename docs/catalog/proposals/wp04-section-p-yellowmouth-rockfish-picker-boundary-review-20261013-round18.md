# WP04 Section P — yellowmouth rockfish picker-boundary review (round 18)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** proposal-only species identity, Canadian/Québec naming, picker, market, ownership, recipe-demand, and fishery-scope review.
- **Candidate:** yellowmouth rockfish / sébaste à bouche jaune (*Sebastes reedi*).
- **Disposition:** **Hold** the species outside the active catalog and research ledger. Official naming sources support the species and bilingual pair, and Canadian fishery sources establish a managed British Columbia commercial fishery. In the current picker, however, the English display would make broad `rockfish` return this one species alone. The Québec Pacific-rockfish retail example identifies only *Sebastes* spp., not *S. reedi*, and the recipe corpus has no demand.
- **Scope:** this is a distinct species review from the R14 yelloweye-rockfish (*S. ruberrimus*) hold, the Pacific ocean-perch (*S. alutus*) hold, and the active Québec redfish / *Sebastes* spp. market group. It does not reopen those decisions or the generic snapper hold.
- **Worktree scope:** this proposal file only. No catalog JSON, research ledger, plan, roadmap, recipe, generated file, or other reviewer’s file was changed.

## Conditional identity

If the picker can preserve broad rockfish searches, the narrow identity to reconsider is:

| Candidate ID | Category | English display | Québec French display | Taxon | Aliases |
|---|---|---|---|---|---|
| `ingredient-ref-yellowmouth-rockfish` | `PROTEIN` | **Yellowmouth Rockfish** | **sébaste à bouche jaune** | *Sebastes reedi* | None proposed |

TERMIUM Plus’s fish entry, updated 2026-01-08, pairs *S. reedi* with **yellowmouth rockfish** and **sébaste à bouche jaune**. CFIA lists the same species under those names and also returns `Rockfish / Sébaste à Bouche Jaune`; Fisheries and Oceans Canada’s British Columbia identification guide independently pairs the species and qualified names. These sources establish an identity, not the identity of an unlabelled retail fish or a culinary substitution. [R18-S01; reused R14-S01 and R14-S05]

Do not add `rockfish`, `redfish`, `rosefish`, `Pacific rockfish`, `Pacific Red Snapper`, `Poisson Rose`, `snapper`, or bare `sébaste` as aliases. The proposed displays themselves contain `rockfish` and `sébaste`, so omitting aliases cannot prevent those words from matching. CFIA applies `Rockfish`, `Rosefish`, `Pacific Red Snapper`, and `Poisson Rose` across other taxa. OQLF’s Québec `sébaste` entry is genus-level and describes a different local market group. [reused R14-S01 and R14-S04]

Keep this candidate separate from the Québec market-group row `ingredient-ref-quebec-redfish` (*Sebastes* spp.), Pacific ocean perch (*S. alutus*), yelloweye rockfish (*S. ruberrimus*), yellowmouth grouper, and every other rockfish. Do not infer species from region, colour, generic `rockfish` or `sébaste` wording, or a shared trawl fishery. CFIA’s Fish List is a Canadian fish-labelling source; it does not make every listed name a consumer synonym or recipe equivalence. [reused R14-S01, R14-S02, and R14-S04–R14-S05]

## Distinct open gap and exact ownership

The open Section P parent still calls for regional finfish coverage. The live checklist and archive were checked against the R14 yelloweye packet, the prior Pacific ocean-perch packet, the Québec redfish market-group decision, the current references/forms, legacy identities, and ledger. Yellowmouth is mentioned as a different species in neighboring reviews, but no focused yellowmouth identity allocation or hold was found. Those neighboring records do not assign *S. reedi*.

The exact-key audit used the app’s search normalization (lowercase, Unicode NFKD, accent folding, punctuation-to-space, and collapsed whitespace) against active reference IDs/names/aliases, form IDs/labels/match terms, legacy candidate IDs/names/aliases, and ledger record IDs.

| Key or nearby owner | Review result |
|---|---|
| `Yellowmouth Rockfish`, `yellowmouth`, `sébaste à bouche jaune`, *Sebastes reedi* | No exact active reference, form, legacy-candidate, or ledger identity owner. |
| `ingredient-ref-yellowmouth-rockfish`, `candidate-yellowmouth-rockfish` | Neither ID is allocated in active references, forms, legacy candidates, or ledger records. |
| `ingredient-ref-quebec-redfish` | Existing active owner: `Québec redfish / sébaste du Québec`, a Québec *Sebastes* market group. It is not a species assignment for *S. reedi*. |
| `ingredient-ref-yellow-perch` | Existing freshwater yellow perch / perchaude. It does not own or imply yellowmouth rockfish. |
| R14 `yelloweye rockfish` and prior `Pacific Ocean Perch` packets | Separate holds for *S. ruberrimus* and *S. alutus*. Neither is an active identity or a source of aliases for *S. reedi*. |
| `rockfish` | No current active picker result; the live CFIA list assigns it across numerous taxa. A proposed yellowmouth row would become its only active result. |

The live catalog snapshot at review time contained **1,345 references, 98 forms, 64 legacy candidates, and 1,658 ledger records**. No source record or decision was created for this held candidate.

## Phrase-first picker projection

The app searches complete normalized word phrases across active reference names, aliases, and attached form terms before falling back to substring matching ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). The projection below uses the live catalog and forms, then adds only the proposed displays and no aliases or forms.

| Query | Current picker | If the row were added | Boundary |
|---|---|---|---|
| `yellowmouth rockfish` | No result | Yellowmouth Rockfish / sébaste à bouche jaune only | Species-qualified English display. |
| `yellowmouth` | No result | Candidate only | The distinctive common-name component. |
| `sébaste à bouche jaune` | No result | Candidate only | Species-qualified French display. |
| `rockfish` | No result | Candidate only | Unsafe singleton: CFIA assigns this broad name to many species. This is the hold reason. |
| `sébaste` | Québec redfish / sébaste du Québec only | Québec market group plus *S. reedi* | Better than a single candidate, but still not a complete lookup for all Canadian *Sebastes* taxa. |
| `redfish` | Québec redfish / sébaste du Québec only | Same Québec market group | The proposed names add no redfish alias; existing group scope remains unchanged. |
| `Pacific Red Snapper`, `Poisson Rose`, `snapper`, `Pacific rockfish` | No result | No result | Excluded names are not in the proposed display or aliases; CFIA usage spans other taxa. |

The narrow display accurately names one taxon, but its normal words still create the broad `rockfish` singleton. Hold until picker behavior can preserve that category or a reviewed set of rockfish identities prevents the singleton from appearing species-specific.

## Canadian and Québec market evidence

- **Québec retailer evidence is group-level.** Metro’s French-language listing for **Filet de sébaste du Pacifique**, product 216842, states only `Sebastes spp.`, Northeast Pacific / Canada provenance, and wild bottom or midwater trawl. The item is out of stock at the store selected on the page. Its displayed 400 g average belongs to this retailer’s unqualified SKU; it does not identify *S. reedi*, provide a standard fillet weight, or establish current Québec stock. Do not map this product to the candidate. [R18-S06]
- **Species-named Canadian supply evidence is limited.** Canada Fish Export’s current supplier page lists yellowmouth rockfish and describes cooking uses, but it provides no binomial on the page, Québec retail listing, package specification, or lot-level label. The page supports a current supplier-market mention, not a Québec availability or package claim. [reused R14-S07]
- **Older supplier catalogue is more specific but dated.** Canfisco’s June 2023 catalogue names Yellowmouth Rockfish (*S. reedi*) and lists fresh fillets and whole-round product year-round. This is useful product-state evidence for that supplier’s catalogue at that date, but it does not establish 2026 inventory, Québec availability, package size, or a standardized form. [R18-S07]

Taken together, the Canadian sources support a species and a commercial product history in British Columbia. The current Québec listing is not species-specific, and no reviewed Québec package declares *S. reedi*. Do not claim routine Québec availability or infer this species from any Pacific-rockfish listing.

## Fishery and conservation scope

Keep identity separate from harvest status. COSEWIC assessed yellowmouth rockfish as **Threatened in 2010** for its Pacific-coast range. In 2017, the Governor in Council decided **not** to add it to Schedule 1 of SARA; the decision states that SARA’s listing prohibitions and recovery-planning requirements therefore would not apply through that listing, and that DFO would continue managing the species under the Fisheries Act within the integrated British Columbia groundfish fishery. The current federal SARA status table, checked 2026-10-13, likewise lists *S. reedi* as COSEWIC **Threatened**, SARA **No Status**, and **No schedule**. The 2010 COSEWIC assessment is distinct from legal listing; this does not mean the species is unthreatened, globally secure, or unregulated. [R18-S04–R18-S05]

DFO’s 2021 stock assessment is an assessment for British Columbia and should be read within its assessed stock/geographic units; it does not confer a conservation status on all products sold under `rockfish` or `sébaste`. DFO’s notice effective June 8, 2026 sets a **15% temporary quota species cap for Yellowmouth Rockfish** within the 2026/2027 commercial groundfish-trawl plan. The cap is a licence/sector management figure, not a consumer package quantity, an all-sector catch allowance, proof of any package’s origin, or a general sustainability label. No catch authorization or legal status is inferred for Québec, other jurisdictions, or an unidentified retail item. [R18-S02–R18-S03]

## Bundled recipe demand, measures, and substitutions

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned for `yellowmouth rockfish`, `yellowmouth`, `sébaste à bouche jaune`, *Sebastes reedi*, `rockfish`, `Pacific Red Snapper`, and `Poisson Rose`. The manifest-ordered recipe corpus digest was `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

**Result: zero matching recipe files and zero matching ingredient-row hits for every audited term.** No recipe link, requested product state, or recipe quantity is supported.

| Evidence | Limit and decision |
|---|---|
| Metro item 216842: 400 g average for its Pacific `Sebastes spp.` fillet listing. [R18-S06] | Retailer/SKU-specific, currently out of stock at the selected store, and not species-matched. Do not copy 400 g as a fillet size, portion, count mapping, or measure for *S. reedi*. |
| Canfisco 2023 listing: fresh fillets or whole-round product, without pack weight. [R18-S07] | Supplier and catalogue-date-specific. It does not establish an active form, household measure, or package yield for the catalog. |
| DFO fish identification and stock sources: biological species information. | Identification and fishery context do not provide a recipe serving, edible yield, density, volume-to-mass mapping, or cooked-yield conversion. |
| Canada Fish Export describes frying, baking, and grilling. [reused R14-S07] | Supplier descriptions are not a recipe comparison or tested substitution source. |

Keep `defaultDensity` null and unit mappings empty if this identity is reconsidered. Add no whole, fillet, fresh, frozen, cooked, or preserved form from the present evidence. No source supports substitution to yelloweye rockfish, Pacific ocean perch, Québec redfish, cod, or another fish; add no global or contextual substitution, recipe link, cooking equivalence, or food-safety equivalence.

## Source-ID and URL audit

New IDs below use the proposal-local prefix `WP04-SECTIONP-YELLOWMOUTH-ROCKFISH-20261013-R18-`; the prefix was absent from the current ledger and proposal/batch archive. The URLs for the CFIA Fish List query, CFIA fish-labelling guidance, OQLF `sébaste`, DFO’s BC identification guide, and Canada Fish Export’s supplier page are identical to URLs already documented in the R14 yelloweye packet, so this packet reuses those exact R14 source IDs rather than creating duplicate IDs for the same pages. Other URLs and new source IDs were checked against the current ledger and archive; no duplicate source ID or exact URL entry was found. These source references remain proposal-local because this is a hold, not a ledger addition.

| Source ID | Source | Evidence and limit |
|---|---|---|
| **Reused `WP04-SECTIONP-YELLOWEYE-ROCKFISH-PICKER-BOUNDARY-20261013-R14-S01`** | CFIA, [Fish List results for rockfish](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=rockfish) | Lists *S. reedi* as Yellowmouth Rockfish, Rockfish / Sébaste à Bouche Jaune, Pacific Red Snapper / Poisson Rose, and Rosefish; the same page assigns broad `Rockfish` and some red-snapper terms to many other taxa. Fish-labelling name inventory, not recipe equivalence or a local package check; page shows a 2023-09-18 modification date. |
| **New `WP04-SECTIONP-YELLOWMOUTH-ROCKFISH-20261013-R18-S01`** | TERMIUM Plus, [*Sebastes reedi* terminology record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=38&i=&index=frw&lang=fra&sg_kp_wet=1643771&srchtxt=sebastes) | Fish entry dated 2026-01-08 pairs *S. reedi*, `yellowmouth rockfish`, and `sébaste à bouche jaune`. Terminology, not current inventory or a product specification. |
| **Reused `WP04-SECTIONP-YELLOWEYE-ROCKFISH-PICKER-BOUNDARY-20261013-R14-S02`** | CFIA, [Guidance on common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Establishes the Fish List’s Canadian fish-labelling role. It is not a recipe synonym or product traceability service. |
| **Reused `WP04-SECTIONP-YELLOWEYE-ROCKFISH-PICKER-BOUNDARY-20261013-R14-S04`** | OQLF, [sébaste, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198848/sebaste) | Québec edible-fish `sébaste` is *Sebastes* sp.; the entry identifies several species in Québec catches and predates current retail inventory. Generic Québec naming evidence, not a species assignment for *S. reedi*. |
| **Reused `WP04-SECTIONP-YELLOWEYE-ROCKFISH-PICKER-BOUNDARY-20261013-R14-S05`** | Fisheries and Oceans Canada, [British Columbia fish identification guide (French)](https://www.pac.dfo-mpo.gc.ca/fm-gp/rec/identify-identifier-fra.html) | Lists Yellowmouth Rockfish / Sébaste à bouche jaune / *S. reedi* separately from other rockfish. Identification evidence, not a food label or consumer supply source. |
| **New `WP04-SECTIONP-YELLOWMOUTH-ROCKFISH-20261013-R18-S02`** | Fisheries and Oceans Canada, [2021 Yellowmouth Rockfish stock assessment for British Columbia](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/41091450.pdf) | DFO scientific assessment of BC stocks, published 2022. Scope is the assessed BC stock/geographic units; not a current 2026 stock-status certificate for all catches or a culinary measure. |
| **New `WP04-SECTIONP-YELLOWMOUTH-ROCKFISH-20261013-R18-S03`** | Fisheries and Oceans Canada, [2026/2027 groundfish trawl harvest-plan notice FN0571](https://notices.dfo-mpo.gc.ca/fns-sap/index-eng.cfm?DOC_ID=356604&ID=all&pg=view_notice) | Notice sent 2026-06-09; sets the temporary 15% Yellowmouth Rockfish cap for the commercial groundfish trawl plan effective 2026-06-08. Licence/sector fishery management only, not product origin, package quantity, or a universal catch rule. |
| **New `WP04-SECTIONP-YELLOWMOUTH-ROCKFISH-20261013-R18-S04`** | Environment and Climate Change Canada, [2017 decision not to list yellowmouth rockfish under SARA](https://www.canada.ca/fr/environnement-changement-climatique/services/registre-public-especes-peril/decrets/avis-ne-pas-inscrire-especes-mai-2017.html) | Records the Governor in Council decision not to add the species to SARA Schedule 1 and continuation of DFO management under the Fisheries Act. The page also reports the separate 2010 COSEWIC Threatened assessment; it does not say the species is unthreatened or free of fishery regulation. |
| **New `WP04-SECTIONP-YELLOWMOUTH-ROCKFISH-20261013-R18-S05`** | Environment and Climate Change Canada, [current SARA Schedule 1 status table](https://www.canada.ca/en/environment-climate-change/services/species-risk-act-accord-funding/listing-process/wildlife-species-amendment-list-schedule-1.html) | The current federal table lists *S. reedi* as COSEWIC Threatened, SARA No Status, and No schedule. This reports the table’s legal-status fields; it does not make a claim about fishery regulation, stock condition, or food availability. |
| **New `WP04-SECTIONP-YELLOWMOUTH-ROCKFISH-20261013-R18-S06`** | Metro, [Pacific Rockfish Fillet, product 216842](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/pacific-rockfish-fillet/p/216842) | Metro’s French product listing names `Filet de sébaste du Pacifique`, shows `Sebastes spp.`, Northeast Pacific / Canada provenance, wild trawl, and 400 g average; it was out of stock at the selected store when checked. Retailer/SKU-specific, not identified as *S. reedi* and not a Québec availability or transferable measure. |
| **Reused `WP04-SECTIONP-YELLOWEYE-ROCKFISH-PICKER-BOUNDARY-20261013-R14-S07`** | Canada Fish Export, [Canadian seafood supplier page](https://canadafishexports.com/products/) | Current page lists yellowmouth rockfish and describes market/cooking uses. It provides no scientific-name lot label, Québec SKU, package measurement, or validated substitute. Same page URL as the R14 source; rechecked for this candidate. |
| **New `WP04-SECTIONP-YELLOWMOUTH-ROCKFISH-20261013-R18-S07`** | Canfisco Group, [product catalogue (June 2023 PDF)](https://canfiscogroup.com/wp-content/uploads/2023/06/CanfiscoGroup-products-2023-06.pdf) | Names Yellowmouth Rockfish (*S. reedi*) and lists fresh fillets/whole-round product as year-round in that supplier catalogue. Dated 2023 market evidence only; no package size, current 2026 inventory, or Québec availability. |

## Recommendation

Keep `ingredient-ref-yellowmouth-rockfish` and `candidate-yellowmouth-rockfish` unallocated. The identity is well supported, but the current picker would make broad `rockfish` a one-result query, while no recipe or species-matched Québec product supplies a present need. Keep the Québec *Sebastes* group, Pacific ocean perch, yelloweye rockfish, and every other rockfish identity separate. Add no aliases, forms, measurements, recipe links, conversions, yields, or substitutions.

No app, unit, instrumentation, or emulator tests were run: this is a proposal-only documentation change and no database JSON changed. If a later integration only adds data to database JSON files, the updated `AGENTS.md` rule says testing is not needed.

## Root integration status

**Root disposition: held.** No reference or ledger record was added. The hold and picker rationale are recorded in the [round-eighteen integration record](../batches/wp02-wp03-wp04-round18-gap-review-integration-20261013/README.md).
