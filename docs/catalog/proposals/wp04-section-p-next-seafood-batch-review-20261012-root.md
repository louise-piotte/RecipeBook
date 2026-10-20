# WP04 Section P — silver hake / merlu argenté naming and picker boundary

- **Review and source-access date:** 2026-10-12.
- **Packet type:** Proposal-only review of one finfish identity boundary, including taxon, Québec name, picker collisions, recipe demand, commercial forms, measurements, and substitution evidence.
- **Disposition:** Keep the prospective silver hake identity unallocated. The species and preferred Québec bilingual name pair are well supported, but CFIA assigns the same market names to another hake taxon and the current picker would turn the broad French query **merlu** into a single-species result.
- **Worktree scope:** This proposal file only. No catalog JSON, ledger, plan, roadmap, generated file, recipe, or application code changed. No tests or emulator checks were run.

## Decision

*Merluccius bilinearis* is a verified edible-fish species with the Québec-preferred name **merlu argenté** and English equivalent **silver hake**. OQLF directly pairs those names with the taxon; Fisheries and Oceans Canada (DFO) independently uses the same bilingual name pair. The candidate is distinct from the already active red hake / merluche-écureuil (*Urophycis chuss*) and white hake / merluche blanche (*U. tenuis*).

Do not allocate the identity to the active picker yet. CFIA’s Fish List uses English **Silver Hake** for both *M. bilinearis* and Argentine hake (*M. hubbsi*). It also assigns French **Merlu Argenté** to *M. hubbsi* under its **Atlantic Whiting** label. Thus the proposed bilingual pair does not resolve every Canadian fish-list label to one taxon. The current picker compounds that collision: a hypothetical row with the verified display pair would become the sole result for the broad query **merlu**, replacing the current two fallback results for red and white hake. No matching bundled recipe supplies a narrower intended fish.

| Prospective ID | Category if later allocated | English display candidate | Québec French display candidate | Taxon | Conditional aliases |
|---|---|---|---|---|---|
| **ingredient-ref-silver-hake** | PROTEIN | silver hake | merlu argenté | *Merluccius bilinearis* | None |

This is a conditional identity shape, not an active row, candidate record, alias allocation, or ledger record. Keep the Section P fish coverage open.

## Prior-work and product boundary

A search of the current Section P plan, proposals, integration notes, active references, forms, legacy candidates, and research ledger found no earlier silver-hake / merlu-argenté review or allocation. The recent red-hake and white-hake identities are separate taxa and retain their existing species-qualified displays. Their active rows are used here only to measure the picker effect of a French merlu query. This review does not reopen the generic hake / merluche boundary, the held Atlantic pollock question, or any recent Section P decision.

The Fish List collision is specifically relevant to the candidate’s market-name scope:

- CFIA lists *M. bilinearis* as **Silver Hake / Merlu de l’Atlantique**, **Hake / Merlu Argenté**, and **Atlantic Whiting / Merlu**.
- CFIA also lists *M. hubbsi* as **Silver Hake / Merlu Argentin**, **Patagonian Silver Hake / Merlu Argenté Patagonie**, and **Atlantic Whiting / Merlu Argenté**.
- DFO and OQLF provide a cleaner Québec species identity for *M. bilinearis*, but the Fish List establishes that a Canadian label search on Silver Hake or Merlu Argenté alone does not always identify that taxon. No current Québec consumer package reviewed here resolves the overlap for the intended catalog use.
- Keep *M. bilinearis* distinct from *M. hubbsi*, offshore hake (*M. albidus*), Pacific hake (*M. productus*), red hake, and white hake. Do not infer a taxon from an unqualified hake, whiting, or merlu product mention.

## Picker, exact ownership, and snapshot

The picker projection follows **normalizeIngredientSearchKey** and **IngredientReferenceSearchIndex** in the current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized whole-word phrase matches take priority, and substring matches are used only when no whole-word phrase matches. This is a static projection from the active catalog and search implementation, not an app UI test.

| Query | Current result | With the hypothetical display-only row | Boundary |
|---|---|---|---|
| silver hake | None | silver hake / merlu argenté only | The proposed English label becomes a single result despite CFIA’s use of Silver Hake for more than one taxon. |
| merlu argenté | None | silver hake / merlu argenté only | The proposed French label becomes a single result despite CFIA’s second-taxon assignment. |
| hake | red hake; white hake | red hake; white hake; silver hake | The new species would be visible beside the two active species. |
| merlu | red hake; white hake, via substring fallback in merluche | silver hake only, via a complete word match | The new display’s word merlu takes priority and suppresses the current two results; the Fish List uses Merlu for multiple species. |
| whiting | None | None | Do not add the broad term as an alias. |
| Atlantic whiting | None | None | CFIA assigns the label across more than one taxon; do not add it as an alias. |

The live package snapshot read on 2026-10-12 contains 1,300 active references, 98 forms, 64 legacy-import candidates, 1,608 ledger records, and 8 unit conversions. The following normalized keys and IDs have no exact owner in active reference IDs, bilingual names or aliases, form IDs or labels, legacy-candidate IDs or names, or ledger record IDs:

| Candidate key | Current exact owner |
|---|---|
| ingredient-ref-silver-hake; candidate-silver-hake | None |
| silver hake; merlu argenté; *Merluccius bilinearis* | None |
| Atlantic whiting; whiting; merlu; merlan; colin | None |

The proposed source-ID prefix **WP04-P-SILVER-HAKE-BOUNDARY-20261012** is absent from the live ledger and the current proposal/batch archive. The wider strings “silver hake,” “merlu argenté,” *M. bilinearis*, and “Atlantic whiting” also have no occurrence in the prior Section P plan/proposal/batch archive. Broad search results are not exact stored-name ownership: for example, current merlu results arise only from the existing merluche displays.

## Bundled recipe demand

All 114 recipe paths in **manifest.v1.json** and all 1,123 ingredient rows were scanned, along with the parsed recipe text. The normalized whole-phrase scan included **silver hake**, **merlu argenté**, *Merluccius bilinearis*, **Atlantic whiting**, **hake**, **merlu**, **merlan**, and **colin**.

**Result: zero matching ingredient rows and zero matching recipe files.** No recipe link, relink, preparation state, or recipe-specific amount is supported. The active salmon and tuna recipe lines do not identify a hake species.

## Identity and alias decisions

- The conditional bilingual display is **silver hake / merlu argenté**, scoped only to *M. bilinearis*. OQLF identifies this as an edible-fish name and marks merlu argenté as the normalized Québec term.
- Add no aliases. In particular, exclude **whiting**, **Atlantic whiting**, **Atlantic hake**, **hake**, **merlu**, **merluche**, **merlan**, and **colin**. CFIA assigns short market words across taxa; OQLF explicitly says the broad French alternatives **colin**, **merluche**, and **merlan** were not retained for Québec fish-product marketing.
- Do not use the Fish List’s **Merlu de l’Atlantique** label as a new French display: CFIA also assigns it to *M. hubbsi*. Do not create a compound name by analogy or include a binomial in the consumer-facing display as a workaround.
- If search later supports a visibly ambiguous species choice, recheck the accepted Québec display and product label at that time. A source-backed species identity does not itself establish an ingredient reference when its common-name query produces an unqualified single result.

## Product forms and measurement evidence

No active form, density, unit mapping, count conversion, package yield, cooking yield, or edible-portion yield is proposed.

- DFO describes silver hake as reaching about 75 cm and averaging about 750 g. These are biological species-profile figures, not a kitchen portion, fillet weight, recipe count-to-mass mapping, or edible yield.
- An archived NOAA market review describes historical U.S. silver-hake/whiting product states including round, headed-and-gutted, fresh/frozen fillets, fillet blocks, cured products, sticks, and portions. These dated commercial presentations are neither current Québec package definitions nor reusable ingredient forms.
- Health Canada CNF food 3089 is **hake (whiting), mixed species, raw**; it reports one fillet as 94.7 g and total refuse as 73%. CNF food 3090 is **hake (whiting), mixed species, baked or broiled**; it reports 100 mL flaked as 57.5 g, 250 mL as 143.7 g, a 75 g food-guide serving, and total refuse as 73%. Neither entry identifies *M. bilinearis*, so do not transfer these observations to the candidate or use them to create a density or unit mapping.
- If the identity is later allocated without new species-specific measure evidence, leave **defaultDensity** null and **unitMappings** empty. Record no default measure. Treat commercial product descriptions as source-specific notes only.

## Substitution evidence

No recipe-scoped or quantity-backed substitute is supported.

The NOAA Marine Fisheries Review article “Markets for Hake” (January 1980) reports historical **whiting** blocks used as a cod substitute in U.S. commercial markets for battered portions. The same article reports that almost half of 1978 whiting-block imports were Argentine hake (*M. hubbsi*), rather than establishing that all such products were *M. bilinearis*. The source describes market demand and commercial processing; it gives no home-recipe method, directed species-to-species quantity, or adjustment. It cannot support an active silver-hake-to-cod substitution rule.

Do not infer interchangeability with cod, other hake species, pollock, or generic white fish from market group, flesh description, or taxonomy. If a ledger identity is created after the picker boundary is resolved and no better evidence is found, record substitution research as **researched_no_supported_substitute** and retain the NOAA market finding only as a limitation. Add no global form conversion, contextual substitution rule, or recipe-line link.

## Acceptance checks and unresolved gaps

Revisit allocation only when the result for **silver hake / merlu argenté** can preserve the species collision reported by CFIA, such as through a search experience that presents the ambiguous species choice rather than silently returning one taxon. Before any later integration:

1. Reconfirm the candidate ID and exact-key ownership against active references, forms, legacy candidates, ledger, plan, and archive.
2. Verify that searches for **silver hake**, **merlu argenté**, **merlu**, **hake**, **whiting**, and **Atlantic whiting** preserve their known species/product scope; do not allow the French merlu query to hide the existing red- and white-hake choices.
3. Keep *M. bilinearis* distinct from *M. hubbsi*, *M. albidus*, *M. productus*, red hake, white hake, and any generic hake or whiting product.
4. Require exact species-specific recipe or product evidence before attaching a recipe, form, measurement, conversion, yield, or substitution. Mixed-species CNF values and fishery body weights do not satisfy that requirement.

Open gaps are the current Canadian market-name overlap, whether a Québec consumer label supplies a more discriminating product name, and the lack of recipe demand. The species identity and preferred bilingual pair are verified; the picker allocation is unresolved.

## Sources

Online sources were accessed on 2026-10-12. Proposal-local source IDs below are not shared-ledger additions.

| Source ID | Source and date | Evidence and limits |
|---|---|---|
| **WP04-P-SILVER-HAKE-BOUNDARY-20261012-S01** | CFIA, [Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) — page modified 2023-09-18; queried for *Merluccius bilinearis* and silver-hake wording | Lists *M. bilinearis* and *M. hubbsi* with overlapping English **Silver Hake** labels; assigns French **Merlu Argenté** to *M. bilinearis* and to *M. hubbsi* under **Atlantic Whiting**. Canadian fish-label terminology evidence, not a recipe-equivalence or retail-inventory source. |
| **WP04-P-SILVER-HAKE-BOUNDARY-20261012-S02** | OQLF GDT, [merlu argenté](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198847/merlu-argente) — last updated 2011; preferred term normalized in October 1980 | In edible-fish terminology, pairs **merlu argenté**, **silver hake**, and *M. bilinearis*; says the species has commercial potential in Québec. Excludes broader **colin**, **merluche**, and **merlan** from Québec fish-product marketing. Terminology evidence, not current retail availability. |
| **WP04-P-SILVER-HAKE-BOUNDARY-20261012-S03** | DFO, [Silver Hake](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/silver-hake-merlu-argente-eng.html) — modified 2016-12-19 | Pairs **Silver Hake** with *M. bilinearis* and provides biological range/size context. Body size is not a recipe measure. |
| **WP04-P-SILVER-HAKE-BOUNDARY-20261012-S04** | DFO, [Merlu argenté](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/silver-hake-merlu-argente-fra.html) — modified 2016-12-19 | Québec-facing French species profile for *M. bilinearis*, with the same biological limits as S03. |
| **WP04-P-SILVER-HAKE-BOUNDARY-20261012-S05** | DFO Canadian Science Advisory Secretariat, [Stock Status Update of Scotian Shelf Silver Hake (*M. bilinearis*) in NAFO Divisions 4VWX](https://publications.gc.ca/collections/collection_2023/mpo-dfo/fs70-7/Fs70-7-2023-015-eng.pdf) — dated 2023-01-04 | Confirms an established Canadian silver-hake fishery and reports Canadian mobile-gear landings in 4VWX. Fishery evidence does not prove current Québec retail inventory or a recipe use. |
| **WP04-P-SILVER-HAKE-BOUNDARY-20261012-S06** | Health Canada CNF, [Food 3089: mixed-species raw hake](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3089&lang=fre) — page modified 2019-03-01 | Reports 1 fillet = 94.7 g and 73% total refuse for mixed-species raw hake. Not species-specific to *M. bilinearis*. |
| **WP04-P-SILVER-HAKE-BOUNDARY-20261012-S07** | Health Canada CNF, [Food 3090: mixed-species baked or broiled hake](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3090) — page modified 2019-03-01 | Reports flaked-volume portions and 73% total refuse for mixed-species hake. Not a raw density or species-specific measure. |
| **WP04-P-SILVER-HAKE-BOUNDARY-20261012-S08** | NOAA Fisheries, [Silver Hake](https://www.fisheries.noaa.gov/species/silver-hake) — last updated 2026-10-05 | Confirms *M. bilinearis* and describes U.S. market grouping with offshore hake under **whiting**. U.S. market context; do not add **whiting** as a Canadian/Québec species alias. |
| **WP04-P-SILVER-HAKE-BOUNDARY-20261012-S09** | Irene S. Gendron, NOAA Marine Fisheries Review, [“Markets for Hake,” vol. 42 (January 1980)](https://spo.nmfs.noaa.gov/sites/default/files/pdf-content/MFR/mfr421/mfr42111.pdf) | Historical U.S. product forms and market substitution context. Its cod-substitute claim concerns commercial whiting blocks and is not a species-specific recipe substitution or quantity rule. |

No tests or emulator checks were run for this proposal-only review.
