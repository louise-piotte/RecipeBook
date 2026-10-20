# WP03 Section N — umbilicate hydnum identity review (R1026)

- **Reviewed:** 2026-10-19
- **Disposition:** Recommend one identity-only generic culinary-fungus reference for *Hydnum umbilicatum* Peck.
- **Scope:** Generic ingredient diversity. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched. Commercial-product counts do not add ingredient diversity; any roster-only queue item is out of scope and should not be pursued.
- **Plan anchors:** The open Section N item covers “Huitlacoche and other documented culinary fungi” ([catalog plan, line 7179](../../RecipeBook-global-ingredient-catalog-plan.txt#L7179)); species-sensitive naming and substitution review remains open ([line 7198](../../RecipeBook-global-ingredient-catalog-plan.txt#L7198)). The broader mushroom-form checklist also remains open ([line 7164](../../RecipeBook-global-ingredient-catalog-plan.txt#L7164)).
- **Mutation scope:** Proposal only. This file is the only proposed change; no catalog, ledger, recipe, checklist, roadmap, workflow, or other file is changed.

## Recommendation and identity boundary

Add **ingredient-ref-umbilicate-hydnum** with the bilingual display **umbilicate hydnum / hydne ombiliqué**, scoped to *Hydnum umbilicatum* Peck. Cultur’Innov’s Québec field guide directly pairs the French name, English name, and taxon, and describes this species as edible with culinary use. MycoQuébec independently pairs the same two names with the taxon and distinguishes it from *H. repandum*. [S01–S02]

The catalog identity covers the whole culinary mushroom (fruiting body), described by the sources as cap, spines, and stem. This is a species-scoped ingredient identity, not an identification or foraging guide. Do not extend it to mycelium, spores, extracts, supplements, or an unspecified “hedgehog” fungus. No field-safety or harvesting advice is proposed.

Keep *Hydnum repandum* separate. Cultur’Innov notes that the species can be confused and describes *H. repandum* as `hydne sinueux` / `pied de mouton`; MycoQuébec lists `hydne sinué` / `pied de mouton` and English `Hedgehog Mushroom` for that species. Do not add `pied de mouton`, `hedgehog mushroom`, `sweet tooth`, or `sweet tooth mushroom` as aliases for this row. Do not use `hydne hérisson`: it is already the display name for *Hericium erinaceus* under `ingredient-ref-lions-mane-mushroom`. Keep the binomial in evidence, not as a picker alias. [S01–S02]

## Proposed minimal data

| Field | Proposed value |
|---|---|
| id | `ingredient-ref-umbilicate-hydnum` |
| nameEn | `umbilicate hydnum` |
| nameFr | `hydne ombiliqué` |
| aliasesEn / aliasesFr | `[]` / `[]` |
| defaultDensity | `null` |
| unitMappings | `[]` |
| category | `VEGETABLE_AND_AROMATIC` |
| updatedAt | `2026-10-19T00:00:00Z` |

Do not add a form, measure, recipe link, conversion, yield, package yield, or active substitution in this review.

## Current ownership and demand audit

The inspected snapshot contains **2,035 active ingredient references**, **205 forms**, **55 legacy candidates**, **2,440 research-ledger records**, and **11,418 ledger source entries**. The bundled manifest lists **114 recipes** and **1,123 structured ingredient rows**. Proposed reference ID `ingredient-ref-umbilicate-hydnum` and source-ID prefix `WP03-N-UMBILICATE-HYDNUM-R1026-20261019` are unused.

I checked case-folded, accent-insensitive candidate terms across active references, forms, legacy candidates, ledger records, and manifest-listed recipe content. Terms included the proposed bilingual names, taxon, `pied de mouton`, `hydne sinué`, `sweet tooth`, `hedgehog mushroom`, and the existing `hydne hérisson` boundary.

| Surface | Current finding | Proposal effect |
|---|---|---|
| Active references | No *H. umbilicatum* or `hydne ombiliqué` owner exists. `ingredient-ref-mushroom` remains the generic identity. `ingredient-ref-lions-mane-mushroom` owns display `lion’s mane mushroom / hydne hérisson`. | Add one separate species-scoped reference; preserve both current identities and all existing evidence. |
| Active forms | No form is attached to an *H. umbilicatum* identity. `ingredient-form-mushroom-dried` belongs only to `ingredient-ref-mushroom` and is explicitly species-unspecified. | Do not attach the generic dried-mushroom form to this species or create a new form. |
| Legacy candidates | None of the 55 candidates matches the proposed identity or taxon. | No legacy candidate is revived, merged, or rewritten. |
| Research ledger | No candidate identity, source, decision, or source URL is owned by an *H. umbilicatum* record. The lion’s-mane record and its `hydne hérisson` evidence remain separate. The exact Cultur’Innov guide, MycoQuébec page, and taxonomy-paper DOI are not present. | If accepted, create a new identity record with the source IDs below; do not transfer sources or claims from neighboring fungi. |
| Bundled recipes | Exact target-name, taxon, and reviewed confusion-term searches found **0 matching recipe files and 0 matching structured ingredient rows**. Generic mushroom recipe lines do not establish demand for this species. | Add no recipe link, amount, or recipe-based form. |

## Forms, numbers, and substitutions

Cultur’Innov reports that *H. umbilicatum* may be consumed fresh, dried, or frozen. Those species-specific states do not require catalog forms without recipe demand; the open Section N form checklist remains unresolved. No powdered, canned, reconstituted, or soaking-liquid form is supported by the reviewed sources. Keep `ingredient-form-mushroom-dried` under the generic mushroom owner. [S01]

The sources report cap diameters of **2–6 cm** (Cultur’Innov) and **3–6 cm** (MycoQuébec). These are biological descriptions, not household measures or portion weights. Cultur’Innov also reports a historical local fresh-market price of about **25 $/kg**; that 2013 market figure is economic context, not an ingredient conversion. No household mass or volume, serving weight, packing basis, density, yield, or cross-state conversion is supported. Do not encode any of these figures as catalog measures. [S01–S02]

The sources compare taste with *H. repandum* but do not test replacement in a recipe or give a substitution ratio. Similarity, relative flavour, and shared edibility do not establish interchangeability. Add no global or contextual substitution. If accepted into the ledger, use `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`, with no measurement observations or substitution findings.

## Sources

Source IDs below are proposal-local and have not been added to the shared ledger.

| ID | Source | What it supports; limits |
|---|---|---|
| `WP03-N-UMBILICATE-HYDNUM-R1026-20261019-S01` | Coopérative de solidarité Cultur’Innov, *Guide des principaux PFNL de l’Estrie* (2013), [PDF, pp. 66–68](https://www.agrireseau.net/agriculturebiologique/documents/guide_pfnl_vf_oct_protege.pdf) | Pairs `hydne ombiliqué` with `Umbilicate hydnum` and *Hydnum umbilicatum*; describes culinary use and explicitly compares it with *H. repandum* / `pied de mouton`. It lists fresh, dried, and frozen states. Cap diameters and the 2013 market price remain biological and historical market context, not kitchen measures. The guide’s handling and cooking directions are not generalized here. `sourceKind: culinary_reference`. |
| `WP03-N-UMBILICATE-HYDNUM-R1026-20261019-S02` | MycoQuébec, [Hydnes](https://raymondboyer.mycoquebec.org/Hydnes.htm) | Directly names *H. umbilicatum* Peck as `Hydne ombiliqué` / `Umbilicate Hydnum`, calls it edible, and compares its flavour with *H. repandum*. Its morphology supports species description only; it does not support a household measure, density, or substitution. `sourceKind: other`. |
| `WP03-N-UMBILICATE-HYDNUM-R1026-20261019-S03` | Swenie et al., [“Six new species and reports of *Hydnum* (Cantharellales) from eastern North America”](https://doi.org/10.3897/mycokeys.42.27369), *MycoKeys* 42 (2018): 35–72 | Taxonomic research context for species-level *Hydnum* identities in eastern North America. It supports treating named taxa as distinct identities; it does not establish Québec common names, food use, measures, or culinary substitution. `sourceKind: other`. |

## Disposition summary

Recommend one identity-only reference for **umbilicate hydnum / hydne ombiliqué**, scoped to the edible fruiting body of *Hydnum umbilicatum*. Keep *H. repandum*, generic mushrooms, lion’s mane, and the generic dried-mushroom form separate. Add no aliases, forms, measures, recipe links, conversions, yields, or substitutions. Preserve all existing entries and evidence; the open Section N fungal-forms and species-sensitive substitution work remains open.

## Link and encoding checks

- The relative Section N plan links resolve to the stated checklist lines.
- The two regional naming/culinary sources and primary taxonomy article were opened during this review.
- This proposal is UTF-8 without BOM with a final newline. No software tests or builds were run because the task is proposal-only.
