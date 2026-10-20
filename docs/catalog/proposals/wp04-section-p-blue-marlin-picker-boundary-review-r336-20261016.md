# WP04 Section P — blue marlin / makaire bleu picker-boundary review (R336)

- **Review and source-access date:** 2026-10-16.
- **Status:** Hold recorded by root on 2026-10-16; see the [R336 integration README](../batches/wp04-section-p-blue-marlin-picker-hold-integration-r336-20261016/README.md). No catalog or ledger data was added.
- **Recommendation:** Keep blue marlin, *Makaira nigricans*, outside active references and the research ledger for now. CFIA and OQLF support the species-qualified bilingual identity, and Canadian/Québec sources show food-product context. But CFIA assigns broad `Marlin / Makaire` to *Tetrapturus* spp.; Usito also distinguishes Atlantic `makaire bleu` (*M. nigricans*) from Indo-Pacific `makaire bleu` (*M. mazara*). A hypothetical `Blue Marlin / Makaire Bleu` row would become the sole picker result for broad `marlin` and `makaire`, and would make the unqualified French species name look exclusive. No bundled recipe demand resolves those boundaries.

## Scope and distinct gap

The Section P finfish checklist remains open in the [global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5748), including its request to resolve vernacular fish names against identity evidence. This review selects only *Makaira nigricans* / blue marlin. It does not reopen the accepted swordfish / espadon identity, the R323 splendid-alfonsino hold, the R328 blackfin-sea-bass hold, the R331 sea-bass-family hold, the R334 amberjack proposal, or any other reviewed fish.

The search across the current plan, active references and forms, legacy candidates, research ledger, proposals, and batches found no focused blue-marlin identity allocation or picker-boundary decision. The closest archive mention is the swordfish identity review, which says to keep swordfish separate from marlin and does not review a marlin taxon or allocate a marlin identity. No current reference, form, legacy mapping, or ledger record owns the proposed `ingredient-ref-blue-marlin` identity or its qualified bilingual display. The new proposal-local source prefix `WP04-SECTIONP-BLUE-MARLIN-R336-20261016-` was unallocated before this document was created. [WP04-SECTIONP-BLUE-MARLIN-R336-20261016-R01]

## Canadian and Québec naming and product evidence

The current CFIA Fish List identifies TSN **172491**, *Makaira nigricans*, with the English/French pair **Blue Marlin / Makaire Bleu**. The same list includes a separate group-level row for *Tetrapturus* spp. under **Marlin / Makaire**. CFIA describes the Fish List as a source of Canadian fish-labelling names linked to scientific names and TSNs, and its guidance says only names listed for a fish species should be used as its name for sale or processing in Canada. These are labelling scopes, not evidence that the taxa are interchangeable ingredients. [S01–S02]

OQLF’s GDT entry prefers Québec French **makaire bleu**, pairs it with English **blue marlin** and *M. nigricans*, and classifies it as an edible fish with commercial potential in Québec. The entry was last updated in 1999; it supports the term and species pairing, not present-day stock or product availability. Its list of older *Makaira* names is not used here to broaden aliases. [S03]

Two product sources corroborate food-market context with different limits:

- Metro Québec’s current “Tout sur le makaire bleu” page says its fish counter offers fresh makaire steaks and gives cooking suggestions. The page supports Québec consumer wording and a sold cut, but supplies no binomial, package measure, or evidence that every item under its shorter `makaire` wording is *M. nigricans*. [S04]
- Vaughan-based Seafood Depot currently lists `Marlin — Makaira nigricans`, calls it Blue Marlin, and describes a fresh, wild product of Costa Rica sold whole or as a loin. This is Canadian supplier evidence for the taxon/product name, not a Québec consumer label, current retail stock guarantee, kitchen measure, or recipe yield. [S05]

Together these sources verify a useful qualified identity but do not make bare `marlin` or `makaire` species-exclusive. The CFIA group row is the decisive boundary for this picker review.

## Current ownership and recipe-demand audit

Read-only counts from the live catalog snapshot are **1,683 ingredient references**, **129 forms**, **58 legacy-import candidates**, and **2,031 research-ledger records**. Exact-name and ID checks found no owner for `ingredient-ref-blue-marlin`, `Blue Marlin`, `makaire bleu`, `Makaira nigricans`, or those candidate terms in active reference displays/aliases, form labels/match terms, legacy candidates, or ledger record IDs. Archive review found only the neighboring swordfish prose described above; no focused prior marlin review or decision was found. [WP04-SECTIONP-BLUE-MARLIN-R336-20261016-R01]

The manifest-ordered recipe scan covered **114 recipe files and 1,123 ingredient rows** (753,928 recipe-file bytes; SHA-256 `5f031747c54c5bba111e8eade3023e40c9d0f50ec873af45f7664efd0c21d535`). Whole-recipe JSON and ingredient-row checks for `Blue Marlin`, `marlin`, `makaire bleu`, `makaire`, *Makaira nigricans*, and `sailfish` found **zero recipe-file hits and zero ingredient-row hits**. No recipe role, quantity, preparation state, form, recipe link, or contextual replacement is supported by the current bundle. [WP04-SECTIONP-BLUE-MARLIN-R336-20261016-R01]

The retail sources describe steaks, whole fish, and loins, but do not establish a reusable form mapping or household quantity. No density, unit conversion, edible yield, cooking yield, or substitution is proposed; each remains unknown. Do not infer raw-consumption, curing, storage, or cooking-safety equivalence from the supplier’s product description.

## Exact phrase-first picker projection

This projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word-phrase matches win across displays and aliases, and substring matching is used only if there are no phrase results. The hypothetical row is identity-only, with the CFIA bilingual display `Blue Marlin / Makaire Bleu`, no aliases, and no forms. It is a projection, not the recommended catalog delta.

| Query | Current picker result | With hypothetical row | Interpretation |
|---|---|---|---|
| `blue marlin` | None | Blue Marlin / Makaire Bleu | Qualified English phrase reaches the candidate. |
| `makaire bleu` | None | Blue Marlin / Makaire Bleu | Qualified Québec French phrase reaches the candidate. |
| `marlin` | None | Blue Marlin / Makaire Bleu | The candidate becomes a misleading singleton for a term CFIA also assigns to *Tetrapturus* spp. |
| `makaire` | None | Blue Marlin / Makaire Bleu | The same singleton problem occurs for the CFIA group-level French term. |
| `swordfish` | swordfish / espadon | swordfish / espadon | The adjacent, separately reviewed identity is unchanged. |
| `espadon` | swordfish / espadon | swordfish / espadon | The adjacent Québec display is unchanged. |

The picker currently has no generic Marlin/Makaire group result. Adding only the blue-marlin species would make a user searching either broad CFIA word see one species-specific row, and the French display would still be ambiguous with *M. mazara* in Usito. Adding source-listed aliases would not solve this, and a group row or narrower Atlantic-qualified product name would require its own market identity review. Keep all proposed names out until the group/species distinction can be shown without the singleton projection or a recipe/product request justifies a separately scoped name.

## Bounded recommendation

**No shared catalog or ledger delta is proposed.** Keep *Makaira nigricans* and the ID `ingredient-ref-blue-marlin` unallocated in active references, forms, aliases, legacy mappings, and the research ledger. Keep `Blue Marlin`, `makaire bleu`, `marlin`, `makaire`, *Makaira nigricans*, and OQLF’s historical name variants out of active search terms. Do not add a recipe link, measure, form, conversion, yield, or substitution.

Revisit this hold if the picker can preserve the broad Marlin/Makaire group alongside species-qualified identities, or if a bundled recipe and product evidence establish a narrower requested product boundary. Recheck current ownership and the manifest corpus at that time.

## Sources and limits

Source IDs below are proposal-local and are not registered in the shared ledger.

| ID | Source | Evidence and limit |
|---|---|---|
| **WP04-SECTIONP-BLUE-MARLIN-R336-20261016-S01** | CFIA, [Fish List results for Blue Marlin](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=Blue) and [complete searchable result set](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), accessed 2026-10-16. | The current results pair *Makaira nigricans*, TSN 172491, with `Blue Marlin / Makaire Bleu`; the full list also contains *Tetrapturus* spp. with `Marlin / Makaire`. Canadian fish-labelling vocabulary and taxon scope; not culinary equivalence or recipe guidance. |
| **WP04-SECTIONP-BLUE-MARLIN-R336-20261016-S02** | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names), accessed 2026-10-16. | Says the CFIA Fish List provides English/French Canadian fish-labelling names with scientific names and TSNs, and that names listed for a species should be used for that fish. Label guidance, not evidence of Québec inventory or ingredient interchangeability. |
| **WP04-SECTIONP-BLUE-MARLIN-R336-20261016-S03** | OQLF, GDT, [makaire bleu](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8382375/makaire-bleu), accessed 2026-10-16. | Prefers `makaire bleu`, pairs it with `blue marlin` and *Makaira nigricans*, and describes an edible fish with commercial potential in Québec. Last updated 1999; terminology evidence only, not current supply. |
| **WP04-SECTIONP-BLUE-MARLIN-R336-20261016-S04** | Metro Québec, [Tout sur le makaire bleu](https://www.metro.ca/produits-a-decouvrir/poissonnerie/nos-poissons-et-fruits-de-mer/makaire), accessed 2026-10-16. | Québec fish-counter educational page says fresh makaire steaks are offered and provides cooking suggestions. It does not give a binomial, serving quantity, or reusable form/conversion. |
| **WP04-SECTIONP-BLUE-MARLIN-R336-20261016-S05** | Seafood Depot, Vaughan, Ontario, [Marlin](https://www.seafooddepot.ca/product-marlin2), accessed 2026-10-16. | Lists `Marlin — Makaira nigricans`, also known as Blue Marlin, fresh and wild, product of Costa Rica, available whole or as loin. Supplier product evidence; no Québec label, stable availability, household measure, or recipe yield. |
| **WP04-SECTIONP-BLUE-MARLIN-R336-20261016-S06** | Usito, Université de Sherbrooke, [makaire](https://usito.usherbrooke.ca/d%C3%A9finitions/makaire), accessed 2026-10-16. | Defines *makaire* across *Makaira* and *Tetrapturus* genera and distinguishes Atlantic `makaire bleu` (*M. nigricans*) from Indo-Pacific `makaire bleu` (*M. mazara*). The entry supports a Québec lexical boundary; it is not a fish-label standard or evidence of current retail stock. |
| **WP04-SECTIONP-BLUE-MARLIN-R336-20261016-R01** | Read-only audit of the Section P plan, active references/forms, legacy candidates, research ledger, proposal/batch archive, manifest-listed recipes, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Repository evidence for current exact-key ownership, source-prefix availability, phrase-first picker projection, and recipe-corpus counts/demand. Not an external identity or labeling authority. |
