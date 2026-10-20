# WP02 Section A7 R987: wholegrain einkorn semolina evidence review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. No shared catalog, forms, ledger, recipes, plan, roadmap, generated files, or tests were changed.
- **Open-plan anchor:** The A7 parent remains open to review other grain meals and milling products ([plan, line 2289](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)).
- **Selected generic gap:** A primary study's use of **wholegrain einkorn semolina** as a pasta-making ingredient. This is a bounded grain-milling evidence question, not a commercial-product roster.
- **Overlap check:** This is distinct from R984's barley-meal evidence update and the R985–R986 fruit and preserved-food identities.
- **Recommendation:** If accepted for later integration, add one unresolved source-bound ledger candidate, `candidate-wholegrain-einkorn-semolina`. Do not add an active reference while the transferable milling boundary and Québec French display remain unresolved.

## Recommendation and identity boundary

A 2025 primary food-science study describes wholegrain einkorn semolina as an input used to make pasta samples and identifies the sample as stone-ground. This is credible evidence that the exact ingredient phrase occurs in culinary research, distinct in wording from plain einkorn flour and whole einkorn grain. It supports carrying a narrow research candidate for review; it does not establish a broad market identity or a standard einkorn-semolina grade. [WP02-A7-EINKORN-SEMOLINA-R987-20261019-S01]

Keep the candidate limited to the source phrase **wholegrain einkorn semolina**. The study does not state a particle-size range, extraction rate, universal stone-milling specification, or a generally applicable boundary against einkorn flour. It also does not establish that a source's wholegrain semolina is compositionally or functionally interchangeable with another einkorn flour or semolina. Do not broaden the source phrase to every einkorn semolina or infer a generic meal identity from it.

The proposed French construction `semoule complète d’engrain` remains unverified and must not be activated. TERMIUM maps *Triticum monococcum* to einkorn and the French species names *engrain* and *petit épeautre*, but it does not name a milling product. OQLF's Québec entry for `semoule` defines the product as broken durum-wheat kernel; that source does not support extending the Québec term to einkorn. The active durum-semolina OQLF evidence is likewise scoped to durum wheat. [WP02-A7-EINKORN-SEMOLINA-R987-20261019-S02; reused `WP03-EINKORN-BERRIES-20261012-S04`; existing `WP02-S23`]

Keep this separate from the existing `einkorn flour / farine de petit épeautre` and `einkorn berries / grains de petit épeautre` references. The earlier R28 hold concerns **einkorn meal**, a different milling question; it remains unchanged and does not settle semolina. [R28 einkorn-meal review](wp02-a7-einkorn-meal-boundary-review-R28-20261013.md). The R443 spelt-semolina proposal concerns a different wheat species and remains separate. [R443 spelt-semolina review](wp02-section-a7-next-gap-review-r443-20261017.md)

## Current ownership and recipe-demand audit

Read-only checks covered the current split seed package, forms, research ledger, legacy-import identities, plan, proposal archive, and all manifest-listed recipe files.

| Store or query | Current snapshot | Finding |
|---|---:|---|
| Ingredient references | 2,003 rows | No `einkorn semolina`, `wholegrain einkorn semolina`, or `semoule complète d’engrain` owner. Exact adjacent owners are `ingredient-ref-einkorn-berries` — `einkorn berries / grains de petit épeautre` (`GRAIN_AND_CEREAL`) and `ingredient-ref-einkorn-flour` — `einkorn flour / farine de petit épeautre` (`FLOUR_AND_STARCH`). Preserve both. |
| Related milling identities | Included above | `ingredient-ref-durum-semolina`, `ingredient-ref-spring-wheat-semolina`, `ingredient-ref-emmer-semolina`, and `ingredient-ref-khorasan-semolina` are distinct active semolina references. Their `FLOUR_AND_STARCH` category is a likely future category precedent, not a current assignment for this unresolved candidate. Do not add bare `semolina`, `einkorn`, `engrain`, or `petit épeautre` aliases; the existing species names already span grain and flour owners. |
| Ingredient forms | 205 rows | No einkorn-semolina form or form owner. No dry/cooked, grind, or other form is proposed. |
| Research ledger | 2,408 records | No `candidate-wholegrain-einkorn-semolina` or einkorn-semolina record. The TERMIUM species-name source is already recorded on `ingredient-ref-einkorn-berries`; its taxon/name mapping is reusable only for identifying *T. monococcum*, not for a milling term. Existing einkorn-flour portions and blocked substitution evidence remain on the flour row; none transfers. |
| Legacy-import identities | 55 candidates | No matching einkorn-semolina, `engrain`-semolina, or wholegrain-einkorn-semolina legacy owner. |
| Recipe manifest | 114 files; 1,123 ingredient rows | Full recipe JSON and ingredient rows were searched for `einkorn`, `wholegrain einkorn semolina`, `einkorn semolina`, `engrain`, `semoule d’engrain`, and `petit épeautre`; 0 files and 0 ingredient rows matched. No recipe link or relink is supported. |

The R28 `einkorn meal` review did not allocate a meal row or ledger candidate. This proposal does not reopen that decision or treat meal as an alias for semolina. Prior spelt-semolina evidence is also a separate species-specific question. No existing branded reference was edited, merged, or used to generalize a product claim.

## Evidence and transferability limits

| Source | Type and current owner | Supports | Does not support |
|---|---|---|---|
| **WP02-A7-EINKORN-SEMOLINA-R987-20261019-S01** | Peer-reviewed primary food-science study, [*Nutritional, Chemical, and Functional Properties of Wholegrain Einkorn Pasta Through Cooking and Digestion: A Comparative Study with Wholegrain Durum Wheat Pasta*](https://pmc.ncbi.nlm.nih.gov/articles/PMC11817464/), *Foods* 14(3), 370 (2025), sample description §2.2. Proposed ledger `sourceKind: other` because the schema has no primary-study kind. | The study says its wholegrain einkorn pasta samples were made using stone-ground wholegrain einkorn semolina. This is one source-bounded culinary use of the ingredient phrase. | A market-wide identity, generic milling specification, particle size, wholegrain percentage, Québec availability or label, or transferable composition, cooking, nutrition, safety, measure, density, or substitution claim. Any study method, sample property, amount, and result stays attached to that study. |
| Reused `WP03-EINKORN-BERRIES-20261012-S04` | Government of Canada Translation Bureau, [TERMIUM Plus, EINKORN](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enb&lang=fra&srchtxt=EINKORN), record 2; current owner `ingredient-ref-einkorn-berries`. | Maps *Triticum monococcum* to English `einkorn` and French `engrain` / `petit épeautre`. This is transferable only for taxon and base-name identification. | A French milling-product name, semolina definition, or Québec consumer display. Do not copy its species names as aliases on a semolina candidate. |
| **WP02-A7-EINKORN-SEMOLINA-R987-20261019-S02** | Office québécois de la langue française, [GDT, semoule](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8889523/semoule), terminology entry last updated 1982. Proposed ledger `sourceKind: regional_authority`. | Shows the Québec term `semoule` and English `semolina` in a cereal-processing entry; its definition is a broken durum-wheat kernel and its notes describe grades and uses. This creates a local terminology boundary for review. | An einkorn semolina name or a milling specification transferable from durum to einkorn. The entry is not evidence that `semoule complète d’engrain` is a Québec term. |
| Existing `WP02-S23` | OQLF, [GDT, semoule de blé dur](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432752/semoule-de-ble-dur); current owners include durum-flour and durum-semolina references. | Defines the durum semolina milling product and pairs it with `durum semolina` / `semolina`. It is useful only as an adjacent, durum-scoped term boundary. | Einkorn identity, milling, or French naming. Do not copy its durum definition or claims onto this candidate. |

## Proposed minimal state (not applied)

| Field or store | Proposed value |
|---|---|
| Research ledger candidate | Append `candidate-wholegrain-einkorn-semolina` as `recordType: candidate`, `identityState: needs_clarification`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Keep the candidate phrase source-bounded to “wholegrain einkorn semolina.” |
| Candidate sources | Add `WP02-A7-EINKORN-SEMOLINA-R987-20261019-S01` and `WP02-A7-EINKORN-SEMOLINA-R987-20261019-S02`, with the source kinds above. Reuse `WP03-EINKORN-BERRIES-20261012-S04` only for *T. monococcum* / base-name identification. Do not copy or generalize the existing durum-specific `WP02-S23` evidence. |
| Decision | Record an unresolved identity decision with `sourceIds: [WP02-A7-EINKORN-SEMOLINA-R987-20261019-S01, WP02-A7-EINKORN-SEMOLINA-R987-20261019-S02, WP03-EINKORN-BERRIES-20261012-S04]`: one primary study supports a wholegrain einkorn-semolina input, but current Québec terminology and the absent grind boundary do not establish a transferable bilingual catalog identity distinct from einkorn flour. |
| Active reference and category | None. If later evidence resolves the identity, `FLOUR_AND_STARCH` is the likely category by analogy with the active wheat-species semolina rows; leave the classification unassigned during this hold. |
| English and French names; aliases | Keep the exact source phrase in the candidate decision only. Do not assign a French display; leave `semoule complète d’engrain` unverified. Add no aliases, especially bare `semolina`, `semoule`, `einkorn`, `engrain`, or `petit épeautre`. |
| Forms, measures, and conversion data | None. If a reference is later accepted, start with null density and empty unit mappings. Do not transfer the einkorn-flour 1/4-cup (30 g) directory portion or named-formula amounts to semolina. No study pasta amount or cooking result becomes a reusable ingredient measure, form, conversion, yield, or package amount. |
| Recipe links and substitutions | None. Keep substitution state `not_yet_researched`; add no recipe links or active rules. |
| Legacy identity | None. Do not reserve an active reference ID or create a legacy-import identity while the candidate remains unresolved. |

The unresolved boundaries are the Québec French display, the meaning of `semolina` for einkorn under local terminology, a transferable grind/wholegrain specification, and separation from the existing einkorn-flour identity. Reopen only with general milling evidence and a Québec-facing name source that address those boundaries. No measurement, process, composition, nutrition, health, or substitution bounds are supported beyond the named study sample.

## Plan queue scope

The A7 parent remains open at [plan line 2289](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289). The named Anson Mills Colonial-Style Toasted Stone Cut Wheat Meal lead appears as an already checked product hold at [plan line 2368](../../RecipeBook-global-ingredient-catalog-plan.txt#L2368); R875 records further named-product research as out of scope at [plan line 2302](../../RecipeBook-global-ingredient-catalog-plan.txt#L2302), because **commercial-product counts do not add ingredient diversity**. I did not investigate or reopen that line. No separate A7 commercial-roster-only task was found. Preserve all existing branded rows and their scoped evidence.

## Disposition

Accept, if desired, only the proposed unresolved candidate and its source-bounded evidence. Keep the active reference catalog, forms, recipes, legacy identities, and existing ledger owners unchanged until the milling boundary and Québec French display are supported. This documentation-only proposal has no test or build work.
