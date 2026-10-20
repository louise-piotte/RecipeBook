# WP02 Section A7 — malted triticale flour boundary review (2026-10-13)

## Scope and recommendation

- **Status:** Root accepted as a documentation-only hold on 2026-10-13. No catalog JSON, form data, legacy candidates, research ledger, recipe, or generated file changed; the plan, roadmap, this decision note, and a batch README record the outcome.
- **Source check date:** 2026-10-13.
- **Open-plan item:** This is a new candidate under the still-open A7 checklist to continue reviewing other grain meals and malted/toasted flour identities ([plan, line 1449](../../RecipeBook-global-ingredient-catalog-plan.txt#L1449)).
- **Distinct from prior work:** The archive has no malted-triticale-flour decision. This review does not reopen the active [plain triticale flour identity](wp02-section-a-triticale-flour-identity-review-20261012.md) or the held [triticale-meal boundary (R41)](wp02-a7-triticale-meal-boundary-review-20261013-round41.md), nor the separate cereal-specific malted flour reviews for wheat, barley, rye, spelt, oat, buckwheat, maize, sorghum, millet, teff, quinoa, rice, or amaranth.
- **Recommendation:** Keep experimental **malted triticale flour** unallocated. Do not create a new active reference, attach malted wording to plain `triticale flour`, or create a ledger/legacy candidate yet. Primary studies establish a research ingredient made by malting and milling triticale, but the reviewed current Canadian/Québec sources do not establish a standalone food product or a Québec French product display.

The research ingredient is distinct from unprocessed triticale flour as a study material, but that is not enough to establish an ingredient identity for the catalog. The studies describe experimental preparation and use; they are not product specifications or Canadian retail evidence. Do not invent a French name such as `farine de triticale maltée` from the base term alone. Reopen if a current Canadian or Québec-facing source identifies a standalone malted-triticale-flour product, describes its product boundary, and supplies product-specific French wording.

## Source findings

The 2023 biscuit study explicitly prepares malted triticale flour by malting triticale grain, removing rootlets and coleoptiles, and milling it; it compares that flour with native triticale flour. The reported laboratory fineness belongs only to that experimental preparation and is not adopted as a generic definition. A separate 2024 dry-pasta study also tests malted triticale flour in a food formulation. Together, these primary studies support the existence of an experimental malted-flour material, not a current packaged product or a universally standardized process [S01–S02].

Québec and Canadian sources establish nearby names and commercial context, but not the candidate product. OQLF's entry gives `farine de triticale` for plain `triticale flour`; it does not name a malted product [S03]. CFIA's 2024 AIRS update lists triticale flour as an import/product class without a malted distinction [S04]. Port Royal Mills, a current Canadian grain mill, describes triticale and malted wheat within its product portfolio, but its public page does not identify malted triticale flour [S05]. The Québec food registry's current Bon Matin 14-grain label names `triticale concassé` and barley malt extract as separate ingredients; that single product label does not supply a flour product or a French name for malted triticale flour [S06].

| Candidate or neighbor | Evidence | Catalog disposition |
| --- | --- | --- |
| Malted triticale flour | Experimental human-food flour is made and tested in two primary studies. No reviewed current Canadian/Québec standalone product or Québec French display was found. | Hold outside the active catalog, ledger, and legacy candidate list. |
| Plain triticale flour | OQLF names `farine de triticale`; the existing active row owns the plain product phrase. | Retain the active identity unchanged. Do not attach malted terms as aliases or forms. |
| Triticale grain and flakes | Active references represent the grain and flaked product separately. | Keep distinct from both plain and malted triticale flour. |

No amount, density, unit mapping, conversion, yield, recipe link, or substitution is proposed. The study recipes and laboratory measurements are not kitchen measures or evidence for a reusable conversion, and the source preparations do not establish equivalence to plain triticale flour.

## Current catalog, ownership, and picker audit

Snapshot at review: **1,378 ingredient references, 100 ingredient forms, 63 legacy-import candidates, and 1,708 research-ledger records**. The manifest lists **114 bundled recipe files**. The audited files are the [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy-import candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), and [bundled-library manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json).

| Query or record | Exact owner / current result | Finding |
| --- | --- | --- |
| `malted triticale flour`; `malted triticale`; `triticale malt flour`; `triticale malted flour`; `farine de triticale malté`; `farine maltée de triticale` | No exact reference, form, legacy-candidate, or ledger owner. No earlier proposal/archive decision for the candidate phrase. | Do not reserve an active or legacy ID from the research phrase alone. |
| `triticale flour`; `farine de triticale` | `ingredient-ref-triticale-flour`, `FLOUR_AND_STARCH`; no aliases, default density, unit mappings, or attached form. | Exact owner remains plain flour only. |
| `triticale`; `triticale flakes` | `ingredient-ref-triticale-grain`, `ingredient-ref-triticale-flakes`, and `ingredient-ref-triticale-flour` appear for the broad `triticale` query; `ingredient-ref-triticale-flakes` owns `triticale flakes / flocons de triticale`. | Grain, flake, and flour names already create distinct results. A new row would broaden broad `triticale` searches; an alias on plain flour would conflate the malted and unprocessed study materials. Neither consequence is supported yet. |
| Triticale form state | No form is attached to any active triticale reference; no form label or match term names the malted candidate. | Do not encode malting as a same-ingredient preparation form. The reviewed sources describe flour identity and processing, not a reversible kitchen state. |
| Legacy and ledger | No malted-triticale phrase or candidate ID exists in the 63 legacy candidates or 1,708 ledger records. Existing ledger entries for triticale grain/flakes/flour remain separate. | Do not add a pending ledger identity record until market evidence supports catalog-level identity. |

Picker behavior was projected from the project's complete-word bilingual search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The candidate phrases currently return no result; `triticale` returns the three existing grain, flakes, and flour rows. No picker change is proposed. Adding a candidate alias to plain triticale flour would make an experimental malted phrase select an unprocessed-flour identity; adding a new row would introduce another broad `triticale` result without a current Québec product name.

## Bundled recipe demand

I scanned all **114 manifest-listed recipe files**, all ingredient rows, and serialized recipe JSON using normalized phrase checks. The scan found **zero recipe files and zero ingredient rows** mentioning `malted triticale flour`, `malted triticale`, `triticale malt flour`, `triticale malted flour`, or the proposed French compounds. It also found no plain `triticale` mentions in the current recipe bundle. No recipe link, relink, measurement, or picker addition is supported by bundled demand.

## Source-to-claim table

| Source ID | Source | Claim supported and limit |
| --- | --- | --- |
| `WP02-A7-MALTED-TRITICALE-FLOUR-20261013-R55-S01` | Piazza et al., [Combining Native and Malted Triticale Flours in Biscuits: Nutritional and Technological Implications](https://doi.org/10.3390/foods12183418), *Foods* 12(18), 3418 (2023). | Primary study makes malted triticale flour from malted grain and compares it with native triticale flour in biscuit formulations. The study process and laboratory fineness are not a Canadian product specification. |
| `WP02-A7-MALTED-TRITICALE-FLOUR-20261013-R55-S02` | Cervini et al., [Replacement of Native with Malted Triticale (× *Triticosecale* Wittmack) Flour in Dry Pasta: Technological and Nutritional Implications](https://doi.org/10.3390/foods13152315), *Foods* 13(15), 2315 (2024). | Independent primary study tests malted triticale flour in dry pasta formulations. It confirms research use, not retail availability, a Québec display, or a generic substitution ratio. |
| `WP02-A7-MALTED-TRITICALE-FLOUR-20261013-R55-S03` | Office québécois de la langue française, [farine de triticale (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497480/farine-de-triticale). | Current GDT page lists `farine de triticale` and `triticale flour` for the plain-flour term. It does not establish a malted-flour name. The underlying terminology entry dates to 1984. |
| `WP02-A7-MALTED-TRITICALE-FLOUR-20261013-R55-S04` | Canadian Food Inspection Agency, [CFIA-AIRS Updates — December 2, 2024](https://inspection.canada.ca/en/importing-food-plants-animals/plant-and-plant-product/airs/cfia-airs-updates-2024-12-02), Chapter 11. | Lists triticale flour among flour product/import classes. This is a regulatory classification list, not evidence of a malted product or a retail identity. |
| `WP02-A7-MALTED-TRITICALE-FLOUR-20261013-R55-S05` | Port Royal Mills, [Canadian Supplier of Whole Grain Products](https://www.portroyalmills.com/), public product overview. | Current Ontario mill describes whole-grain milling and lists triticale, malted barley, and malted wheat. The visible page does not list malted triticale flour; the page is not claimed to be an exhaustive market survey. |
| `WP02-A7-MALTED-TRITICALE-FLOUR-20261013-R55-S06` | Gouvernement du Québec, [Répertoire des aliments québécois: Bon Matin 14 céréales](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8207424). | Current Québec product label lists `triticale concassé` in a cereal blend and barley malt extract separately. It provides local wording/context but no malted triticale flour product or display. |

## Audit limits

- The Canadian and Québec source checks are a focused review, not an exhaustive survey of every supplier or product listing. No current local source located in this review supports an active identity.
- Research-scale malted triticale flour remains distinct from plain triticale flour and from malted wheat, barley, rye, or spelt flours. No process, enzymatic activity, fineness, ingredient function, amount, or substitution transfers among those products.
- If a current Canadian product listing or Québec-facing package is found later, recheck its grain identity, malting process, display wording, existing exact owners, picker consequences, and recipe demand before allocating it.

## Root integration decision (2026-10-13)

Accepted the hold. The primary studies establish an experimental flour used in food formulations, but the reviewed current Canadian and Québec sources do not establish a standalone consumer product or a product-specific Québec French display. Keep it outside active references, forms, legacy candidates, and the research ledger; preserve plain triticale flour as its existing identity. No numeric data, aliases, recipe links, conversions, yields, or substitutions were added. The A7 review remains open.

The proposal's catalog snapshot (1,378 references and 1,708 ledger records) predates the same-day integration of WP03 Section F R54 South African samp. The current counts are 1,379 references and 1,709 ledger records; the triticale ownership and recipe-demand findings are unchanged.

Integration is recorded in [`docs/catalog/batches/wp02-a7-malted-triticale-flour-boundary-hold-integration-20261013/README.md`](../batches/wp02-a7-malted-triticale-flour-boundary-hold-integration-20261013/README.md) and the A7 child checklist and chronology in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt).
