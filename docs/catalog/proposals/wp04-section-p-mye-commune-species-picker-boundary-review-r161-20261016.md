# WP04 Section P — soft-shell clam / mye species and picker-boundary review (R161)

- **Reviewed / sources accessed:** 2026-10-16.
- **Candidate:** Soft-shell clam / `mye`, *Mya arenaria*.
- **Recommendation:** **Hold** a species-specific reference and a separate ledger candidate while the broader clam identity remains unresolved and the bundled recipes request no clam.
- **Scope:** The named *M. arenaria* food-mollusc identity only. This does not reopen the generic `ingredient-ref-clam` hold, other clam species/product states, the cockle/coque candidate, or any recipe instruction that uses a knife (`couteau`).
- **Status:** Proposal-only. No shared catalog JSON, ledger, generated index, checklist, roadmap, batch README, or recipe changed. No tests, builds, emulator, or deployment work was run.
- **Proposal-local IDs:** `WP04-SECTIONP-MYE-COMMUNE-R161-20261016-S01` through `S08`, plus audit ID `WP04-SECTIONP-MYE-COMMUNE-R161-20261016-R01`. These IDs are not allocated in the shared ledger.

## Open checklist and prior-work boundary

The [Section P shellfish checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5586) and the broader [Section P seafood checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5000) remain open. The existing [generic clam review](wp04-section-p-clam-quebec-market-boundary-review-20261012.md) keeps `ingredient-ref-clam` unresolved because Canadian and Québec naming spans multiple species and products. Its source audit records that OQLF names *Mya arenaria* `mye`; it does not decide whether a species-specific soft-shell-clam row should enter the picker while generic clam remains unrepresented. The later [clam product-state review](wp04-section-p-clam-product-state-boundary-review-20261013-round70.md) holds clam juice and canned baby clams as different product boundaries and likewise does not allocate *M. arenaria*.

This proposal answers that narrower species question. It distinguishes the species-qualified bilingual candidate from the unresolved general clam family and checks whether the qualified display can avoid making a broad `clam` query look complete. The recommendation is to keep the species unallocated until the generic clam search boundary is resolved or a recipe/product request specifies this species.

## Québec name and species evidence

OQLF's food-mollusc entry gives **mye** as the normalized Québec French term and pairs it with **soft shell clam** and *Mya arenaria*. It says `clam`, `coque`, `palourde`, and `quahog` are contextual names that were not retained for Québec fish-product marketing, to avoid consumer-label confusion. Use `mye` as the hypothetical French display; do not use those broad/contextual terms as aliases. The existing research ledger already cites this same OQLF page as `WP04-MOLLUSKS-20261009-S08`; it should be reused rather than duplicated if future integration needs that source. [S01]

The current *Atlantic Fishery Regulations, 1985* define a soft-shell clam as *M. arenaria* and give the French term `mye`. In Part VI, the regulation also defines “clam” as a group including Atlantic razor clam, soft-shell clam, and surf clam; that definition applies to the specified fishery part and does not establish a general recipe synonym or a shared ingredient identity. The same section gives a **51 mm minimum shell length** for the fishery. That is a harvest-size rule, not a kitchen quantity. [S02]

DFO's bivalve guide identifies softshell clam as *M. arenaria* and gives its Canadian Atlantic/Pacific range. DFO Québec's current mollusc-harvest page uses `Mye (coque)` and recognizes commercial harvesting in Québec, with sector-specific rules. The page's parenthetical `coque` is a regulatory/harvest-page wording; it does not supersede OQLF's consumer-label recommendation, so it is not proposed as an alias. The DFO bivalve guide is already represented in the shared ledger by `WP04-MOLLUSKS-20261009-S14`. [S03–S04]

Current DFO stock-assessment material identifies *M. arenaria* in Québec coastal waters, and the regional consumer seafood page **Mange ton Saint-Laurent!** lists `mye commune / Mya arenaria` as a seafood item and says commercial gathering is currently possible on the Côte-Nord and at Îles-de-la-Madeleine. This supports a real local food-fishery context; it does not establish one current retail SKU, species-wide package state, recipe amount, or a broader French alias set. [S05–S06]

## Exact ownership and unallocated IDs

The current snapshot contains **1,535 active references**, **119 forms**, **61 legacy-import candidates**, and **1,880 research-ledger records**. Exact normalized-key checks covered active bilingual reference names/aliases, form labels/match terms, legacy names/aliases, and ledger record IDs. They found no active, form, legacy, or candidate owner for `soft-shell clam`, `soft shell clam`, `softshell clam`, `mye`, `mye commune`, `steamer clam`, *Mya arenaria*, or the prospective IDs below. The only relevant existing record is the broader unresolved `ingredient-ref-clam`; it mentions *Mya arenaria* as background and does not allocate that species. [R01]

| Unallocated ID | Hypothetical role if later reopened | Current disposition |
|---|---|---|
| `ingredient-ref-soft-shell-clam` | `PROTEIN` reference, scoped to *Mya arenaria*, with display `soft-shell clam / mye` and no aliases. | Not created or reserved. |
| `candidate-soft-shell-clam` | Optional dedicated ledger candidate if later research requires a species-specific record. | Not created; preserve the existing `ingredient-ref-clam` hold without a duplicate. |

The proposal-local source-ID prefix `WP04-SECTIONP-MYE-COMMUNE-R161-20261016` has no current ledger collision. Existing IDs `WP04-MOLLUSKS-20261009-S08` and `WP04-MOLLUSKS-20261009-S14` are pre-existing evidence owners for the OQLF `mye` entry and DFO bivalve guide. New source labels in this proposal do not allocate additional ledger entries.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): a complete normalized word phrase wins before substring fallback. The current picker has no active clam or mye result. The hypothetical display is only `soft-shell clam / mye`, with no aliases or forms.

| Query | Current result | Hypothetical result | Effect |
|---|---|---|---|
| `soft-shell clam`; `mye` | None | Soft-shell clam / mye | Qualified searches would retrieve the species. |
| `clam` | None | Soft-shell clam / mye only | A broad family query would misleadingly look like a resolved, single clam choice. |
| `mye commune`; `Mya arenaria`; `steamer clam` | None | `mye commune` and `Mya arenaria` remain absent; `steamer clam` remains absent. | No extra alias is proposed; retain OQLF's normalized French term and avoid regional English variants. |
| `palourde`; `coque`; `quahog` | None | None | Do not activate contextual/regional terms that OQLF does not retain for this species' Québec fish-product label. |

The current broad clam query returns no result because the generic `ingredient-ref-clam` is a held ledger candidate, not an active picker entry. Adding the species row would therefore turn a known broad naming gap into an apparent single-species answer. An alias-free species-qualified display cannot prevent this: the word `clam` remains in the English display, and `mye` in the French display is species-specific.

## Bundled-recipe demand

The scan followed the **114** paths in the live manifest, parsed all **1,123** `ingredients[]` rows, and checked complete recipe JSON as well as ingredient-row name/source/reference fields. It searched normalized candidate terms including `soft-shell clam`, `softshell clam`, `steamer clam`, `mye`, `mye commune`, `Mya arenaria`, and `clam`. It found **no full-recipe or ingredient-row match**. No recipe can be linked to this species or used to choose it over another clam product. [R01]

## Measures, density, conversions, yields, and substitutions

Health Canada's Canadian Nutrient File lists household portions for **mixed-species** clams, not *M. arenaria*: raw code 3109 includes small/medium/large-clam weights and a shell-on yield entry; cooked/steamed code 3111 includes 100 mL and 250 mL portions and an edible-part refuse percentage. The database does not establish that those mixed-species observations describe this species, its size, or an in-shell/live recipe request. Do not transfer them to the hypothetical reference or derive a reusable density from the cooked mixed-species volume entries. [S07]

A 2008 *Aquacultural Engineering* study reports processing yields for *M. arenaria* from five Chesapeake Bay harvest locations: about 29% meat yield after manual shucking and up to 43% when steamed and eaten shell-off with the siphon included. The study itself ties the result to harvest area, processing method, and product components. It is not a Québec household portion, recipe-specific conversion, generic shell-on-to-meat yield, or a safe universal package conversion. No form, density, unit mapping, conversion, or yield is proposed. [S08]

The 51 mm legal minimum and DFO guide shell dimensions are biology/fishery observations, not count-to-mass measures. The corpus has no recipe method or role from which to test a substitution. No reviewed source supports replacing this clam species with another clam, shellfish, or fish at a reusable ratio. Add no measurement, conversion, yield, warning, recipe link, or contextual/global substitution.

## Proposed delta and reopening conditions

**No catalog reference, form, alias, ledger record, legacy mapping, recipe link, measurement, conversion, yield, or substitution is proposed.** Keep `ingredient-ref-clam` unresolved. Do not allocate `ingredient-ref-soft-shell-clam` or `candidate-soft-shell-clam`.

Reopen when either (a) a bundled recipe explicitly identifies soft-shell clam / *Mya arenaria*, or (b) the picker can present the broader clam identity and species-specific options without implying that one species is the complete clam choice. At that point, recheck the exact product state and terminology, repeat the live ownership and recipe scan, and activate only directly supported measures or processing data.

## Source register

All online sources below were reviewed on 2026-10-16 unless otherwise stated. S01–S08 are local to this proposal; they are not shared-ledger allocations. The OQLF and DFO pages for S01 and S03 already have shared source IDs noted above and should be reused if the ledger is later updated.

| ID | Source and locator | Support and limits |
|---|---|---|
| **WP04-SECTIONP-MYE-COMMUNE-R161-20261016-S01** | OQLF, [GDT: mye](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198878/mye), updated 2012. | Preferred normalized Québec term `mye`; English `soft shell clam`; Latin *Mya arenaria*. Says broad alternatives `clam`, `coque`, `palourde`, and `quahog` were not retained for Québec fish-product marketing. No recipe measure. Existing shared ledger source: `WP04-MOLLUSKS-20261009-S08`. |
| **WP04-SECTIONP-MYE-COMMUNE-R161-20261016-S02** | Government of Canada, Justice Laws, [Atlantic Fishery Regulations, 1985, s. 51](https://laws-lois.justice.gc.ca/eng/regulations/SOR-86-21/section-51.html), current consolidated text accessed 2026-10-16. | Defines soft-shell clam as *M. arenaria* and French `mye`; Part VI groups it with other clams only for that fishery part. The 51 mm limit is shell length for harvest, not an ingredient measure. |
| **WP04-SECTIONP-MYE-COMMUNE-R161-20261016-S03** | Fisheries and Oceans Canada, [Identifying bivalve shellfish](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm). | Identifies softshell clam as *M. arenaria* and gives Canadian Atlantic/Pacific occurrence and shell traits. Not an edible-portion or kitchen-measure source. Existing shared ledger source: `WP04-MOLLUSKS-20261009-S14`. |
| **WP04-SECTIONP-MYE-COMMUNE-R161-20261016-S04** | Fisheries and Oceans Canada, Québec Region, [Cueillette de mollusques](https://www.qc.dfo-mpo.gc.ca/fr/cueillette-de-mollusques). | Current Québec harvest page uses `Mye (coque)`, lists 51 mm minimum size, and distinguishes commercial/recreational areas. Regulatory terminology is not used to override OQLF consumer naming. |
| **WP04-SECTIONP-MYE-COMMUNE-R161-20261016-S05** | Fisheries and Oceans Canada, [2025 stock assessment for *Mya arenaria* in Québec coastal waters](https://publications.gc.ca/site/eng/9.961646/publication.html), published 2026. | Supports current Québec fishery/stock-assessment context. Not evidence of a retail SKU, recipe amount, or serving. |
| **WP04-SECTIONP-MYE-COMMUNE-R161-20261016-S06** | Mange ton Saint-Laurent!, [Mye commune](https://mangetonsaintlaurent.com/especes/mye-commune/), page accessed from current search result. | Uses `Mye commune / Mya arenaria / softshell clam`, includes culinary context, and describes current commercial gathering in parts of Québec. Its other names are not promoted to aliases; this is not a naming standard or item-level retailer listing. |
| **WP04-SECTIONP-MYE-COMMUNE-R161-20261016-S07** | Health Canada, Canadian Nutrient File portion records [3109, mixed-species raw clams](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3109) and [3111, mixed-species boiled/steamed clams](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3111). | Shows available household portions and refuse/yield observations for mixed-species foods. It does not identify *M. arenaria* or support species transfer. |
| **WP04-SECTIONP-MYE-COMMUNE-R161-20261016-S08** | Wheaton et al., [“Physical properties of soft shell clams, *Mya arenaria*,” *Aquacultural Engineering* 38(3), 181–188 (2008)](https://doi.org/10.1016/j.aquaeng.2008.03.002). | Reports meat-yield results from Chesapeake Bay samples and method/location-specific processing. The yield data are not a reusable Québec recipe or package conversion. |
| **WP04-SECTIONP-MYE-COMMUNE-R161-20261016-R01** | [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5586), [generic-clam review](wp04-section-p-clam-quebec-market-boundary-review-20261012.md), [clam product-state review](wp04-section-p-clam-product-state-boundary-review-20261013-round70.md), active references/forms, legacy-import identities, research ledger, manifest-listed recipes, substitutions, picker code, and archive search. | Read-only exact-key, ID/source-ID, picker, archive, measure/substitution, and corpus audit at 1,535 references, 119 forms, 61 legacy candidates, 1,880 ledger records, and 114 recipes / 1,123 ingredient rows. Snapshot only. |

## Final disposition

**Hold** *Mya arenaria* outside the active catalog and research ledger. Québec terminology and federal/DFO sources support the species and the name pair `soft-shell clam / mye`; they do not resolve the broader active-picker boundary. With no bundled clam demand and no species-transferable measurement or substitution evidence, adding the species now would leave the broad `clam` query with one misleading result. No tests were run because this proposal-only change touches documentation only.
