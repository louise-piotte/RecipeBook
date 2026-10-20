# WP03 Section F Pozole-Corn and Pearled-Hominy Boundary Review

## Packet record

- **Reviewed:** 2026-10-10.
- **Status:** proposal-only source refresh. The existing hominy boundary decision remains unresolved; no catalog, ledger, recipe, plan, roadmap, code, or test file changed. No tests were run.
- **Scope:** recheck the open `pozole corn` candidate against the active processed hominy identities and the adjacent dry-milled `pearled hominy` candidate; audit current recipe demand and names; assess whether current evidence supports a bounded identity or fr-CA display.
- **Disposition:** sources now make the dry-versus-precooked product boundary explicit, but no new identity or alias is ready. Keep `ingredient-ref-pozole-corn` and `ingredient-ref-pearled-hominy` as separate ledger-only holds. Do not alias generic `pozole corn` / `maïs pozolero` to the current canned/processed `hominy corn / maïs lessivé` identity.

This is a narrow source refresh of the completed 2026-10-07 review in [`hominy-boundary-review.md`](../batches/hominy-boundary-review.md), not a replacement for that review or a request to duplicate its ledger findings. That review already decided to hold the broad candidate because it spans dry regional maize and canned products overlapping hominy. The new evidence below sharpens that state boundary; it does not resolve a Quebec French display for dry food-use maize.

## Current catalog and demand audit

At this snapshot, the bundled package has **862 ingredient references, 47 forms, 114 recipe files, and 78 legacy-import candidates**; the research ledger has **1,107 records**. The relevant current IDs and states are:

| ID | Current state | Boundary relevant here |
| --- | --- | --- |
| `ingredient-ref-corn-kernels` | Active; `corn kernels / maïs`; `VEGETABLE_AND_AROMATIC` | Generic kernels. No dry-grain, pozole, or nixtamalized form is recorded. |
| `ingredient-ref-hominy-corn` | Active; `hominy corn / maïs lessivé`; `VEGETABLE_AND_AROMATIC`; aliases empty | OQLF's preserved-corn product made from mature dry corn in preserving liquid; the direct destination for the already processed, liquid-packed product class when a specific product meets that scope. |
| `ingredient-ref-hominy-grits` | Active; `hominy grits / gruau de maïs`; `GRAIN_AND_CEREAL`; aliases empty | Ground hominy grits; remains separate from whole-kernel hominy, ordinary grits, and cornmeal. |
| `ingredient-ref-cornmeal` | Active; `cornmeal / semoule de maïs`; `FLOUR_AND_STARCH`; EN alias `corn meal` | Ground maize, not a whole kernel for nixtamalization. |
| `ingredient-ref-masa-harina` | Active; `masa harina / farine de maïs nixtamalisée`; `FLOUR_AND_STARCH` | Dehydrated nixtamalized flour, not a whole-kernel pozole product. |
| `ingredient-ref-pearled-hominy` | Ledger candidate only; `needs_clarification` | Separate dry-milling product; human-food Quebec French name remains unsupported. |
| `ingredient-ref-pozole-corn` | Ledger candidate only; `needs_clarification` | Broad regional-use/product label; no active identity, display, or alias. |

No corn-, hominy-, nixtamal-, or pozole-specific form exists in the 47-form file. The ledger marks both candidates `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`. Neither has an active seed row.

A fresh scan of all **114 recipes**, checking ingredient-row text and full recipe JSON for `pozole`, `posole`, `pozolero`, `cacahuazintle`, `cacahuacintle`, `hominy`, `maïs lessivé`, `gruau de maïs`, `pearled hominy`, and `hominy perlé`, found **zero ingredient-line and zero file-text hits**. No recipe link or authored amount depends on this candidate.

An accent-folded exact-key audit across active displays/aliases, forms/match terms, and legacy candidates found no exact match for `pozole corn`, `posole corn`, `maize for pozole`, `corn for pozole`, `dry pozole corn`, `maíz pozolero`, `maïs pozolero`, `maïs pour pozole`, `maïs sec pour pozole`, `cacahuazintle`, `cacahuacintle`, `pearled hominy`, `hominy perlé`, or `maïs perlé`. The closest active names remain the explicit corn/hominy rows above; this absence does not remove the semantic overlap with the current hominy product.

## Checklist mapping and prior decision

- **Plan lines 1407–1410:** the explicit pearled-hominy/pozole boundary review is marked complete; its result is to retain both as unresolved ledger candidates. This packet leaves that completion record intact.
- **Plan lines 1430–1436:** the grits, polenta, pearled-hominy, pozole-corn, dried-sweet-corn, and further puffed-grain inventory remains an open aggregate item. This packet addresses only the pozole/pearled-hominy boundary.
- **Roadmap WP03 Section F summary:** pozole corn and pearled hominy remain listed among unresolved candidates. No status change is proposed.

The active boundary already supported by existing rows is `maïs lessivé` for preserved processed whole-kernel corn, `gruau de maïs` for hominy grits, `semoule de maïs` for cornmeal, and `farine de maïs nixtamalisée` for masa harina. Keep these names and category assignments unchanged.

## New source findings and decision

### Pozole corn spans dry grain and prepared whole-kernel products

The Mexican Social Security Institute's 2023 food catalogue identifies `MAIZ PARA POZOLE` as a synonym in its Cacahuazintle maize entry and lists separate plain and precooked Cacahuazintle products. Its indexed extract describes the plain material as dry for later nixtamalization and the precooked product as nixtamalized. The 2025 Mexican Secretariat of Agriculture article likewise calls the ingredient `maíz pozolero (cacahuazintle) precocido o seco`. Those official records support a useful distinction by product state, but the exact *pozole* label does not itself select one state.

Mexico's CONABIO describes the Ancho maize race as the principal pozole maize in Guerrero and notes its use for that purpose in several other states. Along with the existing INIFAP evidence, this shows that `pozolero` is a regional culinary-use designation across more than one maize race, not a synonym that uniquely identifies Cacahuazintle. The candidate cannot be narrowed to one cultivar merely by choosing `cacahuazintle` as its English/French display.

The Puebla SEDIF procurement specification gives a clear bounded example: `maíz pozolero precocido en lata`, mainly Cacahuacintle, nixtamalized with calcium hydroxide, deheaded, blanched and bloomed, then packed hermetically in liquid. This is a specific processed whole-kernel product. The Quebec OQLF definition of `maïs lessivé` also names mature dry yellow/white maize placed in preserving liquid; it directly pairs that processed-product scope with `hominy corn`. A current Quebec-market listing titles a Carey/La Costeña commercial product `Maïs blanc Hominy à la mexicaine` and describes it as `Maïs Pozolero Blanco`. Thus the locally marketed prepared example overlaps the active hominy row and does not justify another broad identity.

A dry food-use maize intended for subsequent nixtamalization is distinguishable from that prepared product. In principle it could support a future bounded whole-grain identity if an exact source-defined product were selected. This review cannot accept one: sources do not settle whether the catalog target is Cacahuazintle only, several pozolero races, or all large-kernel maize marketed for pozole, and no authoritative Quebec French human-food pair for the dry product surfaced. Do not invent `maïs sec pour pozole` as a preferred name or store it as an alias based only on a literal translation.

### Keep pearled hominy separate

No new source in this refresh changes the existing `ingredient-ref-pearled-hominy` hold. TERMIUM and USDA dry-milling evidence in the prior review describe pearl hominy as a dry-milled product; CFIA's `hominy perlé` evidence is feed-scoped, and OQLF's `semoules du maïs` entry is broader than a distinct pearled human-food identity. Dry pozole maize is selected as a whole kernel for eventual nixtamalization; pearled hominy is a different dry-milling product. Do not merge or alias them because both may be sold dry.

### Québec terminology disposition

No OQLF/TERMIUM food-term pair for dry `pozole corn` / `pozolero` was found in this refresh. Quebec retail use of `Maïs Pozolero Blanc` is useful evidence that the Spanish product name appears locally, but the accessible examples refer to a canned/liquid-packed item also titled as hominy; they do not establish a Quebec French display for a dry, unprocessed grain. Retain the current `hominy corn / maïs lessivé` and `hominy grits / gruau de maïs` names. Keep `maïs pozolero`, `maïs pour pozole`, `maïs cacahuazintle`, and their English/Spanish counterparts out of aliases until the target product state and local naming are explicit.

## Accepted, held, merge, and numeric dispositions

| Question | Recommendation |
| --- | --- |
| New pozole-corn identity | **Hold.** No new active row or category is supported at this boundary review. A future dry-grain candidate must state whether it names a particular maize race or a use-class and must have Quebec French human-food wording. |
| Canned/precooked pozolero corn | **No duplicate row.** Where the product is the nixtamalized, liquid-packed whole-kernel product described by the Puebla/Québec sources, it overlaps the current `ingredient-ref-hominy-corn` scope. Keep generic `pozole corn` off that row's aliases because the term also names dry maize. |
| Dry pozole corn → pearled hominy | **Reject merge.** Whole kernels intended for nixtamalization are not the dry-milled pearl-hominy product. Keep both ledger candidates distinct. |
| Pozole corn → hominy grits, cornmeal, or masa harina | **Reject merge.** These are ground products, with distinct current IDs and processes. |
| Measurements, forms, or yield | **None.** Puebla's specified canned package gives 822 g ± 50 g net and 460 g ± 50 g drained; those package limits are not a generic conversion or yield. No form, density, unit mapping, or cooking yield is supported for the candidate. |
| Substitution | **None globally.** A recipe may use a stated hominy substitute for a specific dry regional posole product, as recorded in the older New Mexico source, but this does not establish a general substitution rule between dry maize and canned hominy. No bundled recipe asks for either product. |

## Focused future search fixtures

| Query/input | Expected disposition if reviewed or integrated later |
| --- | --- |
| `hominy corn`, `maïs lessivé` | Current `ingredient-ref-hominy-corn`. |
| `hominy grits`, `gruau de maïs` | Current `ingredient-ref-hominy-grits`; keep distinct from whole-kernel items. |
| `pozole corn`, `posole corn`, `maíz pozolero`, `maïs pozolero` | Do not auto-select `ingredient-ref-hominy-corn` while the query can refer to dry or prepared products. Resolve only after product state is known. |
| `dry Cacahuazintle maize` vs. canned `Maíz Pozolero Blanco` | Preserve the dry whole-grain vs. cooked/nixtamalized liquid-packed product boundary; the latter may resolve to existing hominy when its package specification matches. |
| `pearled hominy`, `hominy perlé`, `pozole corn` | Do not map either term to the other; obtain human-food Quebec naming before activating pearled hominy. |
| `cornmeal`, `semoule de maïs`, `masa harina`, `farine de maïs nixtamalisée` | Keep the existing ground-product IDs distinct from all whole-kernel forms. |

## Sources and access limits

All sources below were accessed or searched on 2026-10-10. Local source IDs here are proposal-only and are not research-ledger entries.

| Source ID | Source | Supports and limits |
| --- | --- | --- |
| `WP03-PZ-20261010-S01` | Mexican Social Security Institute (IMSS), [Cuadro de Alimentos IMSS 2023](https://www.imss.gob.mx/sites/all/statics/pdf/cuadros-basicos/Cuadro-de-Alimentos-IMSS-2023-completo.pdf), group 4 cereals, sub-group maize 405 | Indexed extract lists plain and precooked Cacahuazintle entries, `Maiz para pozole` as a synonym, and dry versus precooked-nixtamalized presentations. Direct PDF retrieval returned an IMSS error in this review; use is limited to the indexed extract, not full-document inspection. |
| `WP03-PZ-20261010-S02` | Mexico Secretariat of Agriculture and Rural Development, [Pozole, un platillo delicioso y nutritivo](https://www.gob.mx/agricultura/articulos/pozole-un-platillo-delicioso-y-nutritivo-para-celebrar-a-mexico) | Search-index extract gives `maíz pozolero (cacahuazintle) precocido o seco`, supporting the state ambiguity. Direct page fetch returned HTTP 403; do not rely on unviewed surrounding context. |
| `WP03-PZ-20261010-S03` | CONABIO / Biodiversidad Mexicana, [Ancho maize race](https://www.biodiversidad.gob.mx/diversidad/alimentos/maices/razas/OchoH/Ancho) | Page text says Ancho is the characteristic `maíz pozolero` in Guerrero and records regional use in other states. Supports multiple maize-race scope, not a Québec food name. Page states it was updated 2025-07-08. |
| `WP03-PZ-20261010-S04` | Puebla Secretaría de Administración / SEDIF, [GESAL-105-152/2022 procurement specification](https://licitaciones.puebla.gob.mx/images/BasesEstatales2022/Mayo/GESAL-105-152-2022-CALIENTES_Y_FRIOS_CASAS_DE_ASITENCIA.pdf), item 17, PDF p. 98 | Defines one canned precooked product, mainly Cacahuacintle, with nixtamalization, deheading, blanching, blooming, and hermetic liquid packing. It is a bounded 2022 procurement specification, not a universal definition of all pozole maize. |
| `WP03-PZ-20261010-S05` | OQLF, [maïs lessivé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059882/mais-lessive) | Direct fr-CA/English pair `maïs lessivé / hominy corn` and a preserving-liquid product definition; last updated 1979. Supports the existing product scope, not the dry pozole grain name. |
| `WP03-PZ-20261010-S06` | OQLF, [semoules du maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17036518/semoules-du-mais) | Defines hulled, degermed hominy broken or ground into sizes; last updated 1987. The broad definition does not establish `hominy perlé` as a distinct human-food display. |
| `WP03-PZ-20261010-S07` | Rancho Latin Market, Montréal, [Maïs blanc Hominy à la mexicaine / Maïs Pozolero Blanco](https://rancholatinmarket.ca/fr/products/goya-white-hominy-corn-mexican-29-oz-maiz-pozolero-blanco-grande-hominy-822g-by-goya) | Current Quebec-market product page titles a commercial white-hominy item `Maïs blanc Hominy à la mexicaine` and describes it as `Maïs Pozolero Blanco`; it also lists Montréal pickup. Retail naming corroborates local overlap; it is not a terminology authority or evidence for a dry product. |
| `WP03-PZ-20261010-S08` | Casa Sabor, Québec, [Tous les produits](https://www.casa-sabor.ca/boutique/tous-les-produits) | Current French-language Quebec product listing includes `Carey – Maïs Pozolero Blanc`. Collection page confirms the local product name but its linked product detail could not be retrieved; no processing or package claim is taken from this listing. |
| `WP03-PZ-20261010-S09` | Existing source set in [`hominy-boundary-review.md`](../batches/hominy-boundary-review.md): TERMIUM WP03-S126, USDA ERS WP03-S151, CFIA WP03-S139, OQLF WP03-S153, and regional sources WP03-S154–S157 | Retained as the prior evidence for the open candidate and pearled-hominy distinction. The TERMIUM/USDA/CFIA records were not re-fetched in this refresh; their original limits and access dates remain in the linked review and ledger. |

## Review conclusion

The new government and regional sources reinforce a three-way boundary: dry whole maize selected for pozole, precooked nixtamalized whole-kernel maize, and dry-milled pearled hominy are not one interchangeable identity. The accessible Quebec evidence names the prepared/packed pozolero product while also calling it hominy; it does not resolve the display for the dry grain. Keep both ledger candidates unresolved and distinct, preserve the current hominy and ground-product rows, add no aliases, and leave numeric and substitution data unknown.
