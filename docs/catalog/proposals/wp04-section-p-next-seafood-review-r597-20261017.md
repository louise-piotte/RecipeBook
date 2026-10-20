# WP04 Section P R597 — North African catfish identity and picker-boundary review

- **Review and source-access date:** 2026-10-17.
- **Open checklist anchor:** The broad finfish item remains open at [plan lines 6417–6418](../../RecipeBook-global-ingredient-catalog-plan.txt#L6426). The wider fish-powder, fish-ball, surimi, and regional-seafood review also remains open at [plan line 14953](../../RecipeBook-global-ingredient-catalog-plan.txt#L14981).
- **Distinct scope:** This reviews one species, *Clarias gariepinus*. It does not reopen R587 Hilsa, R590 Arapaima, R593 Tambaqui, or R594 Rohu.
- **Candidate:** North African catfish, *Clarias gariepinus*.
- **Recommendation:** **Hold** the prospective ingredient-ref-north-african-catfish identity outside active references, legacy identities, and the research ledger. CFIA supplies an accepted English/French species-name pair, but adding “poisson-chat nord-africain” would make bare “poisson-chat” select this species alone in the current phrase-first picker. That would present a species-specific choice as the sole answer to the broader French catfish term.
- **Possible future display only:** If picker behavior can preserve the broader French catfish scope and a recipe or product request justifies the species, reconsider the exact CFIA pair “North African catfish / poisson-chat nord-africain,” with no aliases. This proposal does not reserve a reference or candidate ID.
- **Status:** Integrated as a documentation-only picker hold. No active reference or ledger record was added. See the [integration README](../batches/wp04-section-p-north-african-catfish-picker-hold-integration-r597-20261017/README.md).
- **New proposal-local source IDs:** WP04-SECTIONP-NORTH-AFRICAN-CATFISH-R597-20261017-S01 and S02. The CFIA result and overview URLs reuse existing ledger source IDs listed below.

## Why this is a distinct open gap

The open finfish checklist explicitly includes catfish and regional fish. A targeted case-insensitive audit found no focused *Clarias gariepinus* proposal, hold, batch, active reference, form, legacy identity, or ledger candidate. Exact checks found no owner for ingredient-ref-north-african-catfish, candidate-north-african-catfish, *Clarias gariepinus*, North African catfish, African catfish, poisson-chat nord-africain, or poisson-chat africain.

The active catalog already keeps channel catfish / barbue de rivière and brown bullhead / barbotte as separate identities. The CFIA Fish List also shows that its clariid entries have species-specific names, including a different species that carries the unqualified French name “Poisson-chat”. This review stays scoped to *C. gariepinus* and does not assign that generic wording to it.

## Species and fr-CA name evidence

The CFIA Fish List row for TSN 164125 identifies *Clarias gariepinus* as **North African Catfish / Poisson-chat Nord Africain** and also lists **African Catfish / Poisson-chat Africain** for the same taxon. CFIA says the Fish List supplies English and French common names acceptable in Canada for fish labelling, along with scientific names and TSNs. The results page reports a 2023-09-18 modification date. This supports a species-scoped Canadian label pair; it does not establish a current Canadian or Québec retail listing. [Reused CFIA sources S-CFIA-ROW and S-CFIA-OVERVIEW]

Targeted searches of OQLF's GDT and TERMIUM for *Clarias gariepinus*, “North African catfish”, and the two CFIA French names did not locate a separate entry. The proposed future French wording therefore follows CFIA's exact Canadian fish-label spelling “Poisson-chat Nord Africain”. It is not described as an OQLF-preferred term. In catalog casing, use “poisson-chat nord-africain”.

FAO's 2013 technical paper explicitly identifies North African catfish as *Clarias gariepinus* and documents its aquaculture in sub-Saharan Africa, including regional production context. Those figures are dated aquaculture statistics, not a current production claim or kitchen quantity. [S01]

Ghana's Fisheries Commission *2023 Annual Performance Report* (published April 2024) reports 2023 aquaculture output under the term “African catfish” and gives the catfish production total and price per metric tonne. The report does not provide a scientific name for that category in the cited table, so it is not used to map Ghana's reported output to *C. gariepinus*. It supports dated 2023 regional fish-production context only, not identity, Canadian availability, a household measure, or a retail package. [S02]

## Candidate and source ownership

The read-only snapshot contains **1,814 active references**, **154 forms**, **56 legacy candidates**, and **2,184 research-ledger records**. The exact identity/name checks found no current owner for the candidate terms or prospective ID above. The proposal-local prefix WP04-SECTIONP-NORTH-AFRICAN-CATFISH-R597-20261017- has no existing allocation in the ledger, proposals, or batch archive.

The CFIA results URL is already owned by multiple ledger source IDs; reuse WP04-P-MILKFISH-IDENTITY-20261013-S02 for its *C. gariepinus* row locator rather than creating a duplicate URL record. The CFIA overview URL is already owned by WP04-FINFISH-GAPS-20261010-S11; reuse that ID for the Fish List's naming scope. The FAO paper and Ghana annual-report URLs have no current ledger owners and use new proposal-local S01 and S02. Because the recommendation is a hold, no source or identity record is added to the shared ledger.

## Picker projection

The picker in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes punctuation and accents, then prefers complete word-phrase matches over substring fallback. No aliases or forms are proposed. The table shows the hypothetical effect if the exact CFIA name pair were later activated:

| Query | Current result | Hypothetical row | Effect |
|---|---|---|---|
| North African catfish | No result | North African catfish | Exact species-qualified English choice. |
| poisson-chat nord-africain | No result | North African catfish | Exact species-qualified French choice. |
| African catfish | No result | North African catfish | The phrase occurs within the English display, even without an alias. |
| catfish | Brown bullhead and channel catfish | Those two plus North African catfish | English catfish remains a multi-result query. |
| poisson-chat / poisson chat | No result | North African catfish | A broad French catfish phrase would return this one species alone. |
| poisson | 13 references | 14 references | Remains a broad multi-result fish query. |
| chat | Four substring-fallback results, all chestnut products | North African catfish | Phrase matching would suppress unrelated chestnut substring results; this is not the principal hold reason. |
| Clarias gariepinus | No result | No result | Scientific names are not proposed as picker aliases. |
| fish | 14 references | 14 references | No generic fish term is added. |

Do not add African catfish or poisson-chat africain as aliases. Although the Fish List provides that alternate pair for *C. gariepinus*, it would not resolve the bare French poisson-chat issue, and this review does not need to broaden the candidate's picker surface. Do not add Clarias, a binomial, African magur, or sharptooth catfish as aliases.

The hold is limited to search scope. It does not claim that the exact qualified Canadian labels are invalid; it records that the current shared picker cannot show the species-qualified French choice without also making a generic French search appear species-resolved.

## Bundled recipe demand

All **114 manifest-listed recipe files**, their **1,123 structured ingredient rows**, and **753,988 exact recipe-file bytes** were scanned. The search covered *Clarias gariepinus*, North African catfish, African catfish, poisson-chat nord-africain, poisson-chat africain, African magur, magur, sharptooth catfish, and case/spacing variants. It found **zero matching recipe files and zero matching ingredient rows**. Corpus fingerprint: **847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e**, SHA-256 over each manifest-relative recipe path, NUL separator, exact recipe bytes, and NUL separator in manifest order.

The bundle supplies no species-specific recipe amount, cut, preparation, role, method, or direction for a recipe-line link.

## Forms, measurements, and substitutions

The Ghana report's annual production and price-per-metric-tonne figures describe aquaculture production and market value. FAO's production, feed, and fish-growth figures are aquaculture measurements. None establishes a serving size, package mass, edible or cooked yield, household measure, density, or volume-to-mass mapping. Add no form, form label, measure, measurement observation, default density, unit mapping, conversion, yield, or recipe link.

No reviewed source or recipe tests a directed substitution between *C. gariepinus*, channel catfish, brown bullhead, other catfish, or generic fish. Add no global conversion, contextual substitution, warning rule, or recipe-line substitution.

## Source register and ownership

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **Reused WP04-P-MILKFISH-IDENTITY-20261013-S02** | CFIA, [Fish List lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), TSN 164125, *Clarias gariepinus*. | The result row gives North African Catfish / Poisson-chat Nord Africain and African Catfish / Poisson-chat Africain for the species. This results URL already has ledger owners; the ID and URL are reused with this row locator. The list reports a 2023-09-18 modification date. Canadian fish-label names, not Canadian stock or recipe evidence. |
| **Reused WP04-FINFISH-GAPS-20261010-S11** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | Says the Fish List provides acceptable Canadian English/French fish-label names, scientific names, and TSNs. Reused from the ledger; not a source for picker or recipe behavior. |
| **WP04-SECTIONP-NORTH-AFRICAN-CATFISH-R597-20261017-S01** | FAO, [A review of on-farm feed management practices for North African catfish (*Clarias gariepinus*) in sub-Saharan Africa](https://www.fao.org/fishery/docs/CDrom/T583/root/17.pdf), *On-farm feeding and feed management in aquaculture*, FAO Fisheries and Aquaculture Technical Paper 583 (2013), pp. 463–479. | Directly pairs North African catfish with *C. gariepinus* and documents regional aquaculture. Production statistics cited in the paper are historical (primarily through 2010/2012); do not present them as current. Aquaculture context only, not Canadian retail, recipe, or household-measure evidence. |
| **WP04-SECTIONP-NORTH-AFRICAN-CATFISH-R597-20261017-S02** | Ghana Fisheries Commission, [2023 Annual Performance Report](https://www.mofaq.gov.gh/wp-content/uploads/2025/04/Very-final_2023-APR-FINAL-02082024_Board.pdf), published April 2024, aquaculture chapter, pp. 57–58, Table 3.1. | Reports 2023 aquaculture production under African catfish but does not give a scientific name in that table. The category is not mapped here to *C. gariepinus*. Its tonnage and wholesale price are not ingredient measures or product specifications. |

**R01 read-only audit:** Re-read AGENTS.md, the active regional-fish and broader Section P plan anchors, the R587/R590/R593/R594 proposal and integration state, current WP04 proposals/batches, active reference/form JSON, legacy identities, the research ledger, IngredientSearch.kt, the bundled manifest, and all manifest-listed recipe files. Exact candidate/source-ID/URL ownership, picker, and recipe-corpus checks are recorded above. The CFIA URLs reuse their existing IDs; the FAO and Ghana report URLs and new S01/S02 are unowned in the ledger. The proposal-stage R01 audit was read-only. Root accepted the hold and added the review-log, plan, roadmap, and integration README entries. No active catalog or ledger data changed. This documentation-only hold required no app tests, build, emulator run, or deployment.

## Accepted hold

Keep *Clarias gariepinus* outside active references, legacy identities, and the shared ledger. The CFIA label pair is source-supported, but adding the French qualifier would make broad `poisson-chat` queries resolve to this one species. The bundled corpus and reviewed sources provide no Canadian or Québec product or recipe request to disambiguate that choice. Revisit after a picker change can preserve the general French catfish scope or a source-backed product/recipe provides a specific use. No catalog or ledger data was added. See the [integration README](../batches/wp04-section-p-north-african-catfish-picker-hold-integration-r597-20261017/README.md). R587, R590, R593, R594, and the broader Section P checklist remain unchanged.

