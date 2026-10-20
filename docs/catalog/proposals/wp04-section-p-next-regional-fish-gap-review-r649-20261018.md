# WP04 Section P R649 — Blue whiting / *Micromesistius poutassou* market-name boundary

- **Status:** Integrated hold; active catalog and ledger data remain unchanged.
- **Review and source-access date:** 2026-10-18.
- **Open checklist anchor:** Section P’s broad finfish and regional-fish item remains open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6563).
- **Candidate:** Blue whiting, *Micromesistius poutassou* (CFIA TSN 164774).
- **Scope:** One species-name boundary, distinct from R641 Bowfin and R645 Blue Runner and from the recent bream, Catla, Mrigal, gilthead bream, *Seriola rivoliana*, searobin, and snakehead decisions. This review does not allocate *Micromesistius australis*, another taxon sharing the CFIA English label `Blue Whiting`.

## Source findings and Québec naming

The CFIA Fish List returns two distinct species under the exact English common name **Blue Whiting**: *M. poutassou* (TSN 164774) and *M. australis* (TSN 164775). For *M. poutassou*, CFIA pairs `Blue Whiting / Merlan` and separately `Whiting / Merlan Bleu`. For *M. australis*, it lists `Blue Whiting / Morue Bleue`, `Southern Blue Whiting`, and `Blue Cod / Merlan Bleu Austral`. The Fish List states that its common names are acceptable in Canada for fish labelling and pairs them with the scientific names used for identification. The table is Canadian nomenclature evidence, not evidence that two taxa are interchangeable. [S01, S02]

The OQLF GDT entry **merlan**, fiche 1198918, is in edible-fish terminology and identifies *Merlangius merlangus*. It prefers `merlan` and pairs it with English `whiting`; its note describes that fish as having commercial potential in Québec. That makes a display pair using CFIA’s *M. poutassou* French label `merlan` liable to point a Québec user toward a different fish. [S03]

Usito’s Québec dictionary distinguishes **merlan bleu** from **merlan bleu austral** as separate lexical entries. Its `merlan bleu` entry describes the northern Atlantic form; its `merlan bleu austral` entry describes the southern Atlantic form. This distinction is useful Québec lexical evidence, but it does not remove CFIA’s shared English `Blue Whiting` label or supply a unique Canadian market name for a single picker row. [S04]

A current first-party product catalogue from Montréal-based Lagoon Seafood lists frozen `Morue Bleue ... (Merlan bleu Austral)` products. The supplier describes itself as a Montréal seafood processor, distributor, importer, and exporter serving wholesalers and large retail chains. CFIA and Usito map `Merlan Bleu Austral` / `merlan bleu austral` to *M. australis*. The product catalogue therefore shows the competing taxon’s Québec-facing product wording; it does not identify a *M. poutassou* SKU or establish present shelf stock at a particular retailer. Product package details remain SKU-specific. [S05, S06]

The sources support the scientific identity of *M. poutassou* and show a plausible qualified term pair, but activating a single row would present **Blue Whiting** as one species even though CFIA applies that exact name to both *M. poutassou* and *M. australis*. The French wording also crosses the nearby OQLF `merlan` identity and the separately named `merlan bleu austral` Québec product. A safe one-row English/French picker identity is not established by this review.

## Exact proposed catalog delta

**Hold; make no active-data change.** Keep all of the following absent from active references, forms, legacy-import identities, and the research ledger:

- `ingredient-ref-blue-whiting` and `candidate-blue-whiting`;
- `Blue Whiting`, `blue whiting`, `merlan`, `merlan bleu`, and *Micromesistius poutassou* as a new reference, alias, or form;
- any reference or group covering both *M. poutassou* and *M. australis*.

Add no forms, measures, density, unit mappings, package yields, conversions, recipe links, or substitutions. Do not infer species equivalence, cooking equivalence, or a shared form from the naming overlap. The proposal-local evidence IDs below are not ledger allocations. Revisit only when a paired treatment can preserve the two taxa and their English/French market-name scopes without presenting either as the unique meaning of `Blue Whiting`.

## Active ownership, picker behavior, and recipe demand

The read-only audit covered current ingredient references and forms, legacy-import identities, research ledger, Section P plan, proposal and integration archive, picker search implementation, the bundled-library manifest, and every manifest-listed recipe. The package snapshot contains **1,833 active references**, **162 forms**, **56 legacy candidates**, **2,204 research-ledger records**, and **114 recipe files with 1,123 structured ingredient rows**.

No active reference, form, legacy candidate, or ledger record owns *M. poutassou*, *M. australis*, `Blue Whiting`, `Southern Blue Whiting`, `merlan bleu`, `merlan bleu austral`, `Morue Bleue`, `Blue Cod`, `ingredient-ref-blue-whiting`, `candidate-blue-whiting`, or the R649 source-ID prefix. A repository search of prior WP04 proposals and batch notes found no focused review for either *Micromesistius* species or the Blue-Whiting label collision. [R01]

The projection below follows [the current ingredient picker search](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), which normalizes accents and punctuation, prefers complete word phrases, and uses substring matching only when no phrase result exists. The hypothetical row is a diagnostic only; it is not the recommendation.

| Query | Current results | If one row `Blue whiting / merlan bleu` were added for *M. poutassou* | Boundary |
|---|---|---|---|
| `blue whiting` | No result | The proposed *M. poutassou* row only | CFIA assigns this exact English name to both *M. poutassou* and *M. australis*. |
| `whiting` | No result | The proposed row only | CFIA also assigns `Whiting` to several other taxa; a single result would over-resolve the broad query. |
| `merlan` | No result | The proposed row only | OQLF’s `merlan` entry identifies *Merlangius merlangus*, not *M. poutassou*. |
| `merlan bleu` | No result | The proposed row only | Usito distinguishes this term from `merlan bleu austral`; a paired row for the latter taxon would also match this phrase under the current phrase-first picker. |
| `merlan bleu austral`; `morue bleue`; `blue cod`; `southern blue whiting` | No result | No result | These terms are scoped by CFIA/Usito to *M. australis* and are excluded from the *M. poutassou* row. |

The manifest-ordered corpus audit searched all **114 recipe files** and **1,123 ingredient rows** for both binomials and the candidate’s English/French names, variants, and related *M. australis* labels. It found **zero matching recipe files and zero matching ingredient rows**. No bundled recipe supports a reference, form, amount, preparation, or substitution for this candidate. [R01]

## Source-ID and URL ownership

The proposed reference ID, candidate ID, and R649 source-ID prefix are unallocated in the active data and shared ledger. The exact OQLF, Usito, and Lagoon URLs below have no exact source-URL owner in the current ledger. The CFIA `q=Blue` result URL is already used by two Blue Crab ledger records, so this proposal uses a new proposal-local source ID scoped to this review and registers nothing in the ledger. Reuse the existing shared CFIA Fish List guidance ID for the general Canadian labelling context. [R01]

| ID | Source and locator | Evidence and ownership limit |
|---|---|---|
| **New proposal-local WP04-SECTIONP-BLUE-WHITING-R649-20261018-S01** | CFIA, [Fish List results for `Blue`](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=Blue), retrieved 2026-10-18. | Lists *M. poutassou* and *M. australis* with the shared English label `Blue Whiting`, and gives their distinct French names and taxa. The exact query URL is already owned by Blue Crab records; this source ID remains local and adds no shared ledger record. The page shows a 2023-09-18 modification date. |
| **Reused WP04-FINFISH-GAPS-20261010-S11** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | Existing shared source ID for the Fish List’s Canadian food-labelling and scientific-name scope. |
| **New proposal-local WP04-SECTIONP-BLUE-WHITING-R649-20261018-S03** | OQLF, [GDT: merlan, fiche 1198918](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198918/merlan). | Identifies *Merlangius merlangus*, prefers `merlan`, and gives the English term `whiting`. Exact URL has no ledger owner; this is a different fish from the candidate. |
| **New proposal-local WP04-SECTIONP-BLUE-WHITING-R649-20261018-S04** | Université de Sherbrooke, [Usito: merlan](https://usito.usherbrooke.ca/d%C3%A9finitions/merlan/lexies). | Distinguishes the lexical entries `merlan bleu` and `merlan bleu austral`; not a Canadian regulatory label list. Exact URL has no ledger owner. |
| **New proposal-local WP04-SECTIONP-BLUE-WHITING-R649-20261018-S05** | Lagoon Seafood, [French product catalogue](https://lagoonseafood.com/fr/produits/). | Current product titles include frozen `Morue Bleue ... (Merlan bleu Austral)` listings. Supports Québec-facing market wording for the competing taxon, not a *M. poutassou* SKU, scientific identification by the seller, or a reusable measurement. Exact URL has no ledger owner. |
| **New proposal-local WP04-SECTIONP-BLUE-WHITING-R649-20261018-S06** | Lagoon Seafood, [About](https://lagoonseafood.com/fr/a-propos/). | Identifies Lagoon as a Montréal seafood processor/distributor/importer/exporter serving wholesalers and large retail chains. Market-channel context only. Exact URL has no ledger owner. |
| **R01** | Read-only repository audit of active refs/forms, legacy identities, ledger/source ownership, Section P, proposal/batch archive, picker code, manifest, and bundled recipes. | Repository evidence only; no shared file was changed. |

## Recommendation and remaining scope

**Hold *Micromesistius poutassou* outside active data.** CFIA provides a sound species record, but its exact `Blue Whiting` English label also belongs to *M. australis*. The candidate’s plausible French phrase does not solve the bilingual picker boundary: CFIA also supplies `Merlan` and `Merlan Bleu` for *M. poutassou*, while OQLF identifies `merlan` with *Merlangius merlangus* and Usito separately distinguishes `merlan bleu austral`. A hypothetical single row would turn English `blue whiting` and French `merlan bleu` into singleton results for one species while the Canadian/Québec sources document another species in the same name family. The local market catalogue demonstrates that this boundary occurs in Québec-facing product naming. The recipe corpus supplies no demand to justify accepting that risk.

This hold does not reopen R641 Bowfin or R645 Blue Runner, allocate *M. australis*, or close Section P’s broad finfish and regional-fish item. No measure, form, conversion, yield, recipe link, or substitution is proposed.

## Proposal-only static checks

- Passed UTF-8/no-BOM, replacement-character, and trailing-whitespace checks.
- Confirmed all internal Markdown links resolve; the external source links are primary institutional, university, or first-party company pages.
- Confirmed the proposed IDs and R649 source-ID prefix are absent from active references/forms, legacy candidates, and the shared ledger; confirmed the CFIA `q=Blue` URL’s existing ledger owners and the unowned exact OQLF, Usito, and Lagoon URLs.
- Recomputed current picker phrase/substring projections and scanned all 114 manifest-listed recipes / 1,123 ingredient rows; no candidate-specific demand was found.
- Updated the Section P checklist, roadmap, workflow, and integration note. Active references, forms, legacy identities, and ledger remain unchanged. No software tests, build, emulator, or deployment were needed for this documentation-only hold.
