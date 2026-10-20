# WP04 Section P — Yellowtail snapper / vivaneau à queue jaune identity and picker-boundary review (R700)

- **Review and source-access date:** 2026-10-18.
- **Checklist linkage:** the open Section P finfish checklist at [plan line 6745](../../RecipeBook-global-ingredient-catalog-plan.txt#L6763), which includes snapper and regional fish.
- **Candidate:** Yellowtail snapper / vivaneau à queue jaune, *Ocyurus chrysurus*.
- **Disposition:** accept the species/name pair as a verified research candidate; **hold** an active reference and ledger identity because the only source-supported bilingual display would capture the unqualified `snapper` and `vivaneau` picker searches as one fish.
- **Proposal-only scope:** this file only. No shared catalog JSON, research ledger, plan, roadmap, workflow, batch history, recipe, or other file is changed. No tests, build, emulator check, or deployment is requested.

## Why this is one distinct open gap

The open Section P item covers snapper and regional fish. The focused candidate here is *O. chrysurus*, not a general snapper market group and not the previously reviewed *Lutjanus campechanus* red snapper or *Lutjanus griseus* gray snapper. The red-snapper review (R1, 2026-10-12) and gray-snapper review (R308, 2026-10-16) are adjacent picker-boundary precedents; neither names or allocates *O. chrysurus*.

The exact-name archive search found no focused review, active identity, form, legacy candidate, or ledger identity for `yellowtail snapper`, `vivaneau à queue jaune`, or *Ocyurus chrysurus*. One 2026-10-12 yellowtail-flounder packet mentions Yellowtail Snapper only as a neighboring collision in its discussion of the broader word `yellowtail`; it does not review or allocate this species. This review does not reopen the yellowtail-flounder or gray/red-snapper decisions.

The current worktree has 1,838 active ingredient references, 173 forms, 56 legacy candidates, and 2,220 research-ledger records. The prospective reference ID `ingredient-ref-yellowtail-snapper` and legacy candidate ID `candidate-yellowtail-snapper` have no current owner. No active reference or form contains the candidate’s name, taxon, or `snapper` / `vivaneau` / `yellowtail` search terms, and no ledger record is an identity record for this taxon. The exact proposed R700 source-ID prefix is also unallocated. Broad `snapper` mentions in other ledger evidence are not an identity allocation for this candidate. [R01]

## Species and Québec name evidence

The Office québécois de la langue française (OQLF) prefers **vivaneau à queue jaune** for the edible-fish species, links to **yellowtail snapper**, and gives *Ocyurus chrysurus*. Its entry notes commercial potential in Québec, but it was last updated in 2012 and does not establish current retail stock. OQLF says **lutian à queue jaune** was not retained for fish-product marketing; do not add it as an alias. [S01]

The Canadian Food Inspection Agency (CFIA) Fish List query returns TSN 168907 as *Ocyurus chrysurus*, **Yellowtail Snapper / Vivaneau à Queue Jaune**. The same Fish List search returns many other taxa under `Snapper` and `Vivaneau`, including lutjanid entries and fish in the rockfish family. It is Canadian fish-label naming evidence, not a recipe-equivalence standard or proof of present Québec inventory. [reused S02–S03]

Together these sources support the species identity and the Québec-facing bilingual term pair. They do not support treating generic `snapper` or `vivaneau` as synonyms for this species.

## Exact ownership and ID allocation

The read-only ownership audit used the current reference and form JSON, legacy-candidate file, research ledger, Section P plan, and proposal/batch archive. Exact candidate phrases and the scientific name have no active or legacy owner, form owner, or ledger identity. The only focused snapper decisions found are the red-snapper and gray-snapper reviews noted above. [R01]

| Candidate key | Current owner | Decision in this proposal |
|---|---|---|
| Prospective identity `ingredient-ref-yellowtail-snapper` | None in active references, forms, legacy candidates, or ledger identity records. | ID remains unallocated; no active row is proposed. |
| Prospective legacy ID `candidate-yellowtail-snapper` | None. | Do not create a legacy candidate for a species whose identity and Québec term pair are already resolved by the sources. |
| `yellowtail snapper`; `vivaneau à queue jaune`; *Ocyurus chrysurus* | No exact active, form, legacy, or focused archive owner. | Keep as source-verified candidate terms in this proposal only. |
| Generic `snapper`; `vivaneau` | No active picker result. The shared source evidence assigns these names across multiple taxa. | Keep unallocated as candidate aliases; the proposed display itself would capture these broad queries. |
| Forms, match terms, and recipe links | No candidate-specific form or recipe owner. | Add none. |
| R700 source prefix `WP04-SECTIONP-YELLOWTAIL-SNAPPER-R700-20261018` | No prior source-ID occurrence in the ledger, proposals, batches, or plan. | Use only for the new proposal-local OQLF citation and repository audit below; do not add it to the shared ledger. |

The candidate’s exact OQLF fiche URL has no prior allocation in the shared ledger or focused archive. The CFIA Fish List overview URL already has shared source coverage, including `WP04-FINFISH-GAPS-20261010-S11`; reuse that evidence. The exact CFIA snapper-query URL is already cited under proposal-local ID `WP04-SECTIONP-RED-SNAPPER-20261012-R1-S03` and reused by R308; reuse that ID rather than assigning another query source ID. These source IDs remain citations only; this proposal creates no ledger records. [R01]

## Picker boundary

The picker normalizes accents and punctuation, searches complete word phrases before falling back to partial matches, and includes reference displays, aliases, and form terms. A static projection using the current references/forms and the proposed displays `yellowtail snapper` / `vivaneau à queue jaune` gives the following results:

| Query | Current picker | With the hypothetical bilingual display | Boundary |
|---|---:|---:|---|
| `yellowtail snapper` | 0 | Candidate only | Source-supported English species name. |
| `vivaneau à queue jaune` | 0 | Candidate only | OQLF-preferred Québec French species name. |
| `snapper` | 0 | Candidate only | Broad name shared across many CFIA-listed taxa. |
| `vivaneau` | 0 | Candidate only | Broad French name also assigned across taxa in the CFIA Fish List. |
| `yellowtail` | 0 | Candidate only | CFIA also uses Yellowtail in other fish names, including Yellowtail Rockfish. |
| `queue jaune` | 0 | Candidate only | The phrase also occurs in other fish names, such as Sébaste à queue jaune. |
| `Ocyurus chrysurus` | 0 | 0 | Do not add scientific names as picker aliases. |
| `lutian à queue jaune` | 0 | 0 | OQLF says this term was not retained for Québec fish-product marketing. |

The broad-term risk is inherent in both supported displays; omitting aliases cannot prevent the single-result capture. The CFIA snapper search contains 94 result rows, including multiple labels per taxon, and shows the English and French generic names assigned beyond *O. chrysurus*. Adding this one row would make the broad searches look taxon-specific even though the source list shows otherwise. Hold the row until picker behavior can preserve a broader set of snapper/vivaneau results or the catalog can represent the relevant non-exclusive market-name scope clearly. [S02–S03]

## Recipe-demand audit

The manifest-listed bundle contains **114 recipe files and 1,123 ingredient rows**. A read-only scan searched all parsed recipe text and ingredient rows for `yellowtail snapper`, `vivaneau à queue jaune`, *Ocyurus chrysurus*, `yellowtail`, `snapper`, and `vivaneau`. It found **zero files and zero ingredient rows** for every term. The manifest-ordered corpus digest for this audit is `6c6d3b839606d81440c2b3cbfda0d2f14fd8a4c33dac836a7ec1b91a1316f362`. There is no recipe line to link, amount to preserve, or demand for a form or substitution. [R01]

## Product and numeric scope

This is an identity-only candidate. Neither the OQLF terminology entry nor the CFIA Fish List supports a cut, skin/bone state, fresh/frozen/cooked form, kitchen measure, density, edible yield, conversion, or substitution. OQLF’s note about commercial potential is not current retailer availability. Propose no aliases, form, measure, conversion, yield, recipe link, or substitution.

## Source register and limits

Online sources were accessed 2026-10-18. New IDs below are proposal-local only; reused source IDs remain with their original records.

| Source ID | Primary source | Evidence and limits |
|---|---|---|
| `WP04-SECTIONP-YELLOWTAIL-SNAPPER-R700-20261018-S01` | OQLF GDT, [vivaneau à queue jaune](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1299192/vivaneau-a-queue-jaune) | Prefers the Québec French edible-fish term, links English `yellowtail snapper` to *Ocyurus chrysurus*, and says `lutian à queue jaune` was not retained for fish-product marketing. Last updated 2012; terminology evidence, not current inventory. |
| **Reused `WP04-FINFISH-GAPS-20261010-S11`** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Existing shared source for the Canadian English/French common-name list and its scientific names. Labeling nomenclature, not recipe equivalence or stock evidence. |
| **Reused `WP04-SECTIONP-RED-SNAPPER-20261012-R1-S02` and `S03`** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [English snapper query results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&lang=e&q=snapper) | The query lists TSN 168907 as Yellowtail Snapper / Vivaneau à Queue Jaune and returns many other `Snapper` / `Vivaneau` rows. The result page shows 94 rows; that is not a species count. The query is a Canadian labeling list, not proof of current Québec availability. |
| `WP04-SECTIONP-YELLOWTAIL-SNAPPER-R700-20261018-R01` | Repository audit: open [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6763), active references/forms, legacy identities, research ledger, Section P proposal/batch archive, recipe manifest and files, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) | Read-only ownership/source-ID search, static picker projection, and recipe corpus scan. Repository evidence only; not a shared ledger source. |

## Bounded recommendation

**Accept** *Ocyurus chrysurus* and `yellowtail snapper / vivaneau à queue jaune` as the source-verified identity and Québec-facing name pair in this proposal. **Hold** the active reference and ledger identity because the supported display would collapse the broader `snapper`, `vivaneau`, `yellowtail`, and `queue jaune` searches to one candidate, and the recipe bundle has no matching demand. Do not add aliases, forms, measures, recipe links, conversions, yields, or substitutions. Reconsider only after a picker or catalog model can preserve the shared market-name scope.
