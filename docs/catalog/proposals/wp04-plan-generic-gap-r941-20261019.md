# WP04 Section P — fish trimmings identity review (R941)

- **Review and source-access date:** 2026-10-19.
- **Status:** Accepted and integrated in the R939–R941 batch; see the integration README. The shared data now contains the identity-only fish-trimmings reference and its source-scoped evidence.
- **Open plan anchor:** The Section P fish and regional-fish parent at [global catalog plan, line 7312](../../RecipeBook-global-ingredient-catalog-plan.txt#L7312).
- **Candidate:** Generic culinary fish trimmings used as an input to fumet or fish stock.
- **Recommendation:** Add one identity-only `PROTEIN` reference for `fish trimmings / parures de poisson`, with only singular inflection aliases. Treat it as a variable-composition culinary aggregate, not as an anatomical synonym for any one part.
- **Scope:** One generic seafood ingredient gap. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched.

## Gap and identity boundary

The broad Section P fish parent remains open. Recent reviews added separate generic references for fish heads, fish bones, and fish frames, each with a narrower part boundary. This proposal advances the distinct collective stock input called fish trimmings. Québec sources use `parures de poisson` in fish-fumet guidance; English culinary guidance uses `fish trimmings` for a stock ingredient. The sources do not establish one universal set of included parts: one Québec recipe glosses parures as heads and bones, while other sources list parures separately from bones. The catalog identity should therefore record the generic culinary wording and use only, not a fixed anatomical composition. [R941-S01–S05]

Do not treat the proposed row as a synonym or replacement for fish heads, fish bones, fish frames, or fish stock. Depending on the source and recipe, the trimmings may include or be listed alongside some named parts. Keep each named-part identity independently searchable, and do not add any of those names as aliases. The liquid fumet or stock remains a separate prepared ingredient.

## Current ownership and bundled demand

Current read-only package snapshot: **1,958 active ingredient references**, **205 forms**, **55 legacy-import candidates**, and **2,363 research-ledger records**. Exact phrase checks across active displays and aliases, forms and match terms, and legacy candidates found no owner or candidate for `fish trimmings`, `fish trimming`, `parures de poisson`, or `parure de poisson`. No dedicated proposal or batch review for this identity was found.

The only current ledger record containing the phrase is `ingredient-ref-fish-frames`, through reused source `R938-S03` (Zeste). That source says its particular fish fumet uses bones and trimmings and excludes salmon carcasses for the stated clear-fumet method. Its source entry remains owned by the fish-frames record; this proposal does not copy, move, or broaden its finding. [reused R938-S03]

The neighboring active identities remain unchanged:

| Current reference | Current scope | Proposed boundary |
|---|---|---|
| `ingredient-ref-fish-heads` — `fish heads / têtes de poisson` | Fish heads as a named culinary part. | Some recipes may include a head among trimmings; the terms are not synonyms. |
| `ingredient-ref-fish-bones` — `fish bones / arêtes de poisson` | Fish skeletal bones used as a culinary input. | Some recipes may list bones with or within trimmings; retain the independent bones identity. |
| `ingredient-ref-fish-frames` — `fish frames / carcasses de poisson` | Post-filleting frames, as defined by the sources reviewed for R938. | A frame is not a universal name for all trimmings. Keep its identity and evidence separate. |
| `ingredient-ref-fish-stock` — `fish stock / fumet de poisson` | Prepared liquid. | Do not alias the raw stock input to the resulting liquid. |

A read-only search across all **114 manifest-listed recipe files** found no `fish trimming(s)` or `parure(s) de poisson` phrase. The bundle supplies no recipe link, recipe-specific amount, or substitution context for this candidate.

Integrated identity fields:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-fish-trimmings` |
| Category | `PROTEIN` |
| English display | `fish trimmings` |
| Québec French display | `parures de poisson` |
| English alias | `fish trimming` (singular inflection only) |
| French alias | `parure de poisson` (singular inflection only) |
| Density / unit mappings | None |
| Forms | None |

The French display is supported as Québec culinary wording, but no fish-specific OQLF entry was located. Treat `parures de poisson` as an attested descriptive display, not as an OQLF-normalized product name. Do not add `fish scraps`, `fish waste`, species names, or names of the separately catalogued parts as aliases.

## Measures, forms, and substitutions

- **Measures:** Ricardo uses 1 kg of parures (identified in that recipe as heads and bones) in one fish-fumet recipe yielding 1 L. Académie Culinaire gives 625 g of white-fish parures and bones for its 1 L recipe. These are recipe-specific composite inputs and yields; neither is a reusable measure for generic trimmings. Record no density, unit mapping, household measure, yield, or conversion. [R941-S01, S02]
- **Preparation:** DFO, Zeste, and the Québec cooking sources describe trimmings as stock/fumet inputs, but do not establish one stable raw, cleaned, fresh, frozen, or species-specific form. Add no forms or form conversions. The Zeste exclusion of salmon carcasses is scoped to its stated clear-fumet method and must not become a general salmon-trimming rule. [R941-S02–S04; reused R938-S03]
- **Substitution:** Similar use in stock recipes does not prove that trimmings, heads, bones, frames, or prepared stock replace one another. No global or contextual substitution, recipe-line link, or yield relationship is supported.

## Queue disposition and preservation

This proposal addresses generic culinary ingredient diversity, not commercial-product counts. No brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only task was pursued. Any roster-only queue item remains out of scope because commercial-product counts do not add ingredient diversity. Preserve all existing branded entries and their evidence; do not transfer product-specific measures, composition, or preparation claims without a separate transferability review.

## Proposal source register

New source IDs R941-S01–S05 were added to the fish-trimmings ledger record. Existing source `R938-S03` remains cited in the proposal only and stays attached to `ingredient-ref-fish-frames`; it was not copied or broadened.

| Source | Evidence and limits |
|---|---|
| **R941-S01** | Ricardo, [Fumet de poisson](https://www.ricardocuisine.com/recettes/7137-fumet-de-poisson), ingredient list and method. Québec recipe uses 1 kg of `parures de poisson (têtes, arêtes)` and reports a 1 L yield. Supports local culinary usage; the parenthetical composition and both quantities belong to this recipe and do not define every trim set or a reusable amount. |
| **R941-S02** | Académie Culinaire, [Fumet de poisson](https://academieculinaire.com/blogs/recettes/fumet-de-poisson), 2016-09-06, ingredient list and method. Lists 625 g of `parures et arêtes de poissons blancs` for a recipe yielding 1 L. Supports local stock use and separate wording for parures and bones in this recipe; the quantity and yield are composite and recipe-specific. |
| **R941-S03** | Fisheries and Oceans Canada, [Préparation et Cuisson — Poisson d’eau douce](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/181627.pdf), fumet definition on printed p. 33 (PDF p. 36). The PDF’s opening publication/copyright page identifies 1984; the DFO catalogue title includes 1995. Defines fumet in French as a fish broth with bones and trimmings added for stronger flavour. Supports French culinary use in a Canadian federal guide, not a universal composition, household measure, or form. |
| **R941-S04** | Le Cordon Bleu, [Fish Stock](https://app.ckbk.com/reference/cook52062c01s001ss001e003/fish-stock), *Le Cordon Bleu Complete Cooking Techniques* (1996). Uses `fish trimmings` alongside bones for fish stock and limits its example to listed lean/pale fish. Supports English culinary wording and stock use; it does not establish a Canadian or Québec product identity, a universal eligible-species list, or a transferable measure. |
| **R941-S05** | Office québécois de la langue française, [parer (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8887876/parer), updated 1983. In the food/cooking domain, defines `parer` for fish and other foods and states that removed elements are called `parures`. Supports the French culinary word family only; it does not specifically standardize `parures de poisson` or define their composition. |
| **Reused R938-S03** | Zeste, [Fonds et bouillons : comment les faire maison?](https://www.zeste.ca/articles/fonds-bouillons-comment-faire-maison), fish-fumet section, updated 2023-01-17. Uses bones and trimmings in its particular fish fumet and excludes salmon carcasses for that preparation. This source is already recorded on the fish-frames ledger row; reuse it only for the reviewed boundary claim and do not alter its ownership. |
| **R941-R01** | Repository audit of the open Section P plan, current references/forms, legacy candidates, research ledger, proposal archive, manifest-listed recipe files, and neighboring fish-part records. | Confirms current ownership, lack of bundled recipe demand, and prior review overlap only; it is not external identity evidence or a shared-ledger source. |

## Recommendation

Accept one identity-only `PROTEIN` reference for `fish trimmings / parures de poisson`, scoped to the variable-composition fish cuttings described as a culinary stock/fumet input. Preserve fish heads, bones, frames, stock, species identities, branded rows, and all source-specific amounts as separate records. Add no forms, measurements, density, mappings, conversion, yield, recipe link, or substitution.
