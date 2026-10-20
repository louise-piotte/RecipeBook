# WP04 Section P — red grouper / mérou nègre picker-boundary review (R97)

- **Review and source-access date:** 2026-10-14.
- **Packet type:** species identity, Canadian/Québec naming, picker ownership, recipe demand, and product-boundary review.
- **Open checklist:** the Section P finfish identity item remains open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4371).
- **Candidate:** red grouper, *Epinephelus morio* (CFIA TSN 167702).
- **Recommendation:** hold an active species row. CFIA supports a species-qualified Canadian label pair, `Red Grouper / Mérou nègre`, but the same taxon also has the unqualified `Grouper / Mérou` label, and CFIA assigns those broad terms to other groupers as well. OQLF defines Québec `mérou / grouper` broadly for Serranidae, particularly *Epinephelus* and *Mycteroperca*. A row with the qualified display would become the sole result for the broad `grouper` and `mérou` queries under current phrase-first search. The Québec retailer evidence does not tie a marketed product to the scientific species, and the bundled recipes contain no grouper demand.
- **Shared-data effect:** none proposed. Do not add a reference, legacy candidate, ledger record, alias, form, measure, recipe link, conversion, yield, or substitution.
- **Tests:** none. This is proposal-only documentation and changes no application or database data.

## Why this is one distinct unresolved candidate

The open Section P finfish checklist includes grouper. The 2026-10-10 finfish review held only the generic `snapper / grouper` market terms and called for any later pass to start from a named species and a Québec display. This packet checks one named candidate, *E. morio*, against current Canadian and Québec sources, ownership, search, and recipe evidence. The focused proposal and batch archive search found no earlier *E. morio* / red-grouper decision or active allocation. This is distinct from the recent chum-salmon addition and R92/R94/R95 holds; none is reopened here.

The CFIA Fish List assigns *E. morio* both `Red Grouper / Mérou nègre` and `Grouper / Mérou`. It also assigns `Grouper` or `Mérou` to multiple other taxa, including *Epinephelus acanthistius*, *E. adscensionis*, *E. guttatus*, *E. itajara*, *Epinephelus* spp., *Mycteroperca interstitialis*, and *Mycteroperca* spp. This is Canadian commercial-label nomenclature, not evidence that these species are interchangeable. OQLF defines `mérou / grouper` as applying broadly to the Serranidae family, especially *Epinephelus* and *Mycteroperca*. The exact English/Québec terminology is therefore not a one-species boundary.

## Taxon, names, and Québec market wording

CFIA’s current Fish List maps *E. morio* (TSN 167702) to `Red Grouper / Mérou nègre`, alongside the same fish’s broader `Grouper / Mérou` name. CFIA explains that the Fish List gives the French and English common names acceptable for fish labeling in Canada. These are naming records, not recipe synonyms, source-country proof, or a direction to merge all groupers.

Metro’s Québec French fish page uses `mérou` and calls it `Red Grouper` in English. Its page describes grouper generically, without a scientific name. Metro’s separate sustainability page currently lists `Mérou | Tous | Toutes les régions` among products temporarily withdrawn from Metro inventory. That is evidence about Metro’s own sourcing/stock policy at the time checked; it does not establish a legal restriction or absence of grouper from every Canadian seller. Carthage Seafood’s current catalog has a `Grouper or hamour` item listed as Mediterranean wild fish, also without a binomial or French product name. These retailer pages confirm current market use of broad grouper wording while leaving the species of the listed products unresolved.

Use `red grouper / mérou nègre` only as a **conditional** pair if the row is reconsidered. Do not use `red hind`, `mérou rouge`, `hamour`, or generic `grouper / mérou` as aliases: the reviewed Canadian label record does not establish those terms as exclusive synonyms for this taxon, while the Québec term is broad. Metro’s equivalence wording is a retailer description, not a taxonomic crosswalk. The CFIA label pair is not a guarantee that `mérou nègre` is the preferred contemporary Québec consumer display; a later integration should retain that naming caveat.

## Current ownership and picker projection

The live package snapshot contains **1,431 ingredient references and 105 forms**; the legacy-import file has **63 candidates**; the research ledger has **1,771 records**. Exact normalized ownership checks found no active reference, form, legacy candidate, or ledger record for `red grouper`, `mérou nègre`, *Epinephelus morio*, or the prospective ID `ingredient-ref-red-grouper`. The ledger and proposal/batch archive have no use of the proposed source-ID prefix `WP04-SECTIONP-RED-GROUPER-BOUNDARY-R97-20261014-`. Existing category-level work is the older generic grouper hold, not an *E. morio* allocation or review.

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases across displays, aliases, and attached form terms match before partial-substring fallback. I statically compared the live catalog with a hypothetical alias-free `red grouper / mérou nègre` row. This is a code-behavior projection, not a UI or emulator test.

| Query | Current result | With a hypothetical row | Consequence |
|---|---|---|---|
| `red grouper` | None | `red grouper / mérou nègre` | The qualified English query would be specific. |
| `mérou nègre` | None | `red grouper / mérou nègre` | The qualified French query would be specific. |
| `grouper` | None | `red grouper / mérou nègre` alone | A broad market query would surface one of many CFIA-listed grouper taxa. |
| `mérou` | None | `red grouper / mérou nègre` alone | A broad Québec term that OQLF scopes to many taxa would look species-resolved. |
| `red hind`; `mérou rouge`; `hamour` | None | None | None of these is proposed as a display or alias. |

The row would preserve the qualifier in its display, but the picker does not show an unallocated family or indicate that multiple species can answer a broad query. No alias can remove the collision because `grouper` and `mérou` are already part of the required bilingual display. Keep the candidate unallocated until search can preserve the broader choice set or a user request supplies a species-qualified term.

If the search boundary is later resolved and the Québec display is confirmed, the narrow conditional reference would be:

| Field | Conditional value |
|---|---|
| ID | `ingredient-ref-red-grouper` |
| Category | `PROTEIN` |
| English / fr-CA display | `red grouper` / `mérou nègre` (CFIA label pair; Québec consumer preference still needs confirmation) |
| Aliases | `aliasesEn: []`; `aliasesFr: []` |
| Scope evidence | *Epinephelus morio*, TSN 167702; scientific scope stays in the evidence record, not a new catalog field |
| Numeric data | `defaultDensity: null`; `unitMappings: []` |
| Forms / recipe links / substitutions | None |

This is a conditional projection only. It is not an approval to add an active reference under the current picker behavior.

## Bundled recipe demand

I scanned every manifest-listed recipe document and all ingredient rows for `grouper`, `red grouper`, `red hind`, `mérou`, `mérou nègre`, `mérou rouge`, *Epinephelus morio*, and the candidate ID. The bundle contains **114 recipe files and 1,123 ingredient rows**; the scan found **zero matching files and zero matching ingredient rows**. No catalog recipe link, amount, preparation, or substitution can be derived.

Metro also hosts a recipe page dated **2013-08-06** titled *Grouper with Pink Peppercorns* (French title: *Papillote de mérou au poivre rose*). It lists four grouper for four servings, gives no fish weight, and names no scientific species. That external, generic recipe is not part of the bundled corpus and cannot link a recipe line to *E. morio* or support a reusable count or portion for this candidate.

## Product states, measures, and substitutions

Metro’s current fish page describes generic grouper as available fresh, frozen, and in steaks, and gives cooking methods for that general market category. The page does not establish that those states are *E. morio* products or a form sequence under that taxon. Carthage’s current item is sold as `Grouper or hamour`, with 3 kg and 5 kg package choices, but no species. Those quantities are seller package options, not recipe measures. Metro’s old recipe uses a count with no mass or state. Add no raw, frozen, steak, cooked, or other form and no density, unit mapping, portion, or yield.

Health Canada’s 2015 Canadian Nutrient File page (modified 2019-03-01) has food code 3009, *Fish, grouper, mixed species, raw*, with a 259 g fillet, a 90 g food-guide serving, and 62% refuse. Its explicit mixed-species scope prevents transfer to *E. morio* or a current Québec product. Keep these source-specific observations out of active measures and the ledger. No reviewed source establishes a product- and method-matched substitution between red grouper and another fish; do not add a global or contextual rule.

## Recommendation and limits

Keep *Epinephelus morio* outside active references and the research ledger. The Canadian label pair is taxonomically specific, but the required bilingual display makes broad `grouper` and `mérou` queries return only this species even though both names span multiple taxa. Current Québec retailer evidence uses the broader market category and does not identify its product species; Metro currently reports all grouper temporarily withdrawn from its inventory. The full bundled recipe scan found no demand.

Revisit this one candidate if a bundled recipe or current package names *E. morio* and the picker can retain the species alternatives for broad terms. Before any future integration, confirm the Québec French display beyond the older CFIA label entry. Do not infer a taxon from the retailer’s generic page, transfer the mixed-species CNF portion, or treat a related grouper as a safe substitute. The Section P parent item remains open.

## Source register

Sources were accessed on **2026-10-14**. Proposal-local IDs below are not ledger entries.

| Source ID | Source and date | Evidence and limit |
|---|---|---|
| **WP04-SECTIONP-RED-GROUPER-BOUNDARY-R97-20261014-S01** | Canadian Food Inspection Agency, [Fish List results for *Epinephelus morio*](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Epinephelus%20morio); list modified 2023-09-18. | Lists TSN 167702 with both `Grouper / Mérou` and `Red Grouper / Mérou nègre`. Label-name and taxon evidence, not recipe equivalence or local product identification. |
| **WP04-SECTIONP-RED-GROUPER-BOUNDARY-R97-20261014-S02** | Canadian Food Inspection Agency, [Fish List results for grouper](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=grouper); list modified 2023-09-18; see also the CFIA [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), modified 2019-06-28. | Shows broad `Grouper` / `Mérou` entries across *Epinephelus* and *Mycteroperca* taxa. CFIA describes its names as acceptable fish-label names; that list does not make its taxa culinary substitutes. |
| **WP04-SECTIONP-RED-GROUPER-BOUNDARY-R97-20261014-S03** | Office québécois de la langue française, [GDT: mérou](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428135/merou), last updated 1983. | Defines `mérou / grouper` broadly for Serranidae, particularly *Epinephelus* and *Mycteroperca*. Older Québec terminology entry; not species-specific or proof of current inventory. |
| **WP04-SECTIONP-RED-GROUPER-BOUNDARY-R97-20261014-S04** | Metro, [Mérou](https://www.metro.ca/produits-a-decouvrir/poissonnerie/nos-poissons-et-fruits-de-mer/merou) and English [Grouper (red grouper)](https://www.metro.ca/en/products-to-discover/fish-seafood/our-fish-seafood/grouper-red-grouper), accessed 2026-10-14; no page date shown. | Québec retailer pages use broad `mérou / grouper`, describe fresh/frozen/steak product states and cooking methods, and do not give a binomial. The bilingual naming does not establish that the described fish is *E. morio*. |
| **WP04-SECTIONP-RED-GROUPER-BOUNDARY-R97-20261014-S05** | Metro, [sustainable fishing and aquaculture policy](https://api.metro.ca/fr/produits-a-decouvrir/poissonnerie/notre-politique-de-peche-durable), accessed 2026-10-14; no page date shown. | Metro’s temporary withdrawal list says `Mérou | Tous | Toutes les régions`. This is Metro inventory policy evidence at access time only, not a legal ban or evidence that no other seller has grouper. |
| **WP04-SECTIONP-RED-GROUPER-BOUNDARY-R97-20261014-S06** | Carthage Seafood, [Grouper or hamour](https://carthageseafood.ca/catalog/wild-caught-fish/grouper-or-hamour-697ad7553f681b10331de04c), accessed 2026-10-14; page copyright 2026. | Current product wording calls it Mediterranean wild fish and offers 3 kg / 5 kg choices; no species, binomial, or French display is supplied. This does not identify *E. morio* or provide a reusable measure. |
| **WP04-SECTIONP-RED-GROUPER-BOUNDARY-R97-20261014-S07** | Metro, [Grouper with Pink Peppercorns / Papillote de mérou au poivre rose](https://www.metro.ca/recettes-et-occasions/recettes/papillote-de-merou-au-poivre-rose), published 2013-08-06. | An external Metro recipe lists four generic grouper for four servings but gives no fish weight, taxon, or explicit product state. It is not part of this app’s bundled recipe corpus and is not transferable to *E. morio*. |
| **WP04-SECTIONP-RED-GROUPER-BOUNDARY-R97-20261014-S08** | Health Canada, [CNF serving portion, food code 3009](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3009), page modified 2019-03-01; 2015 CNF entry. | Describes raw grouper, mixed species, with a 259 g fillet, 90 g food-guide serving, and 62% refuse. The mixed-species entry is not a species-specific measure, density, package conversion, or yield. |

## Static review record

- Re-read `AGENTS.md`, relevant project requirements, the open Section P plan item, and the current roadmap. The project instructions exempt database-JSON-only changes from testing; this packet changes no database data.
- Checked the focused proposal and batch archive, current active agents, live references/forms, legacy candidates, ledger, and source-ID ownership. No other WP04 Section P reviewer was active at the time of the check; no exact candidate owner or prefix collision was found.
- Parsed the current package and reproduced the phrase-first display/alias/form-term projection for the four material queries. Confirmed that the hypothetical row would be the only result for both generic `grouper` and `mérou` queries.
- Scanned all **114 manifest-listed recipes / 1,123 ingredient rows** for the candidate, its taxonomic name, and generic grouper/merou wording; found zero matching files and rows.
- No catalog, ledger, legacy, recipe, plan, roadmap, application, or generated file was changed. This proposal was checked for UTF-8 without BOM, final newline, trailing whitespace, mojibake markers, link targets, and source-ID uniqueness. No app, Gradle, instrumentation, or emulator tests were run.
