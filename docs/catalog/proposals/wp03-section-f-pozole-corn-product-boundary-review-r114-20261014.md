# WP03 Section F — pozole-corn product boundary and Québec display review (R114, 2026-10-14)

## Packet record

- **Reviewed:** 2026-10-14.
- **Status:** Integrated by root on 2026-10-14 as a documentation-only hold. Pozole corn remains a ledger candidate pending a distinct Québec French product name; no active catalog or numeric behavior was added. See the [R114 batch README](../batches/wp03-section-f-pozole-corn-boundary-hold-integration-20261014/README.md).
- **Scope:** recheck the ledger-only `ingredient-ref-pozole-corn` candidate against current Canadian and Québec labels, the prepared hominy row, related corn identities, picker phrase ownership, and the complete bundled recipe corpus.
- **Recommendation:** **hold** `ingredient-ref-pozole-corn` as a separate ledger-only candidate in `needs_clarification`. Current evidence now clearly distinguishes dry raw whole-kernel corn intended for later nixtamalization from already nixtamalized/prepared hominy. It still does not support a distinct fr-CA display for the dry product. Add no active identity, display, alias, form, measurement, conversion, recipe link, yield, or substitution.

The dry product boundary is clearer than in the earlier [hominy/pozole boundary record](../batches/hominy-boundary-review.md) and the [2026-10-10 source refresh](wp03-section-f-pozole-corn-boundary-review-20261010.md). The new evidence does not settle the candidate's name for Québec French. In current Québec listings, *Maïs Pozolero Blanc* is attached to a ready-to-serve product sold as hominy, while a separate local listing gives only the underspecified title *Maïs Pozolero Blanc*. Neither labels raw dry kernels for home nixtamalization.

## Current plan, catalog, forms, and ledger

The current plan records the earlier boundary review as complete while retaining both candidates unresolved at [lines 2819–2828](../../RecipeBook-global-ingredient-catalog-plan.txt#L2819). The aggregate Section F inventory remains open at [line 2889](../../RecipeBook-global-ingredient-catalog-plan.txt#L2889); this proposal does not close or edit that item.

The current split package contains **1,456 ingredient references**, **105 forms**, and **114 manifest-listed recipe files**; the research ledger contains **1,796 records**. Nearby active owners are:

| Active ID | Current display, aliases, and category | Boundary for this review |
| --- | --- | --- |
| `ingredient-ref-corn-kernels` | `corn kernels / maïs`; no aliases; `VEGETABLE_AND_AROMATIC` | Generic kernels. It has no dry whole-grain or nixtamalization form. |
| `ingredient-ref-dried-sweet-corn-kernels` | `dried sweet corn kernels / maïs sucré séché`; no aliases; `VEGETABLE_AND_AROMATIC` | Dried kernels of sweet corn. They are not mature field maize selected for later nixtamalization. See the [R112 review](wp03-section-f-dried-sweet-corn-identity-review-r112-20261014.md#L1). |
| `ingredient-ref-hominy-corn` | `hominy corn / maïs lessivé`; English alias `lyed corn`; `VEGETABLE_AND_AROMATIC` | Processed whole kernels that meet the preserved/liquid-packed hominy scope. Keep generic *pozole corn* off this row because it also names dry raw grain. |
| `ingredient-ref-hominy-grits` | `hominy grits / gruau de maïs`; no aliases; `GRAIN_AND_CEREAL` | Ground hominy. Not a whole-kernel pozole product. See the [R111 Québec display review](wp03-section-f-hominy-grits-quebec-display-review-r111-20261014.md#L1). |
| `ingredient-ref-cornmeal` | `cornmeal / semoule de maïs`; English alias `corn meal`; `FLOUR_AND_STARCH` | Milled corn, not whole kernels. |
| `ingredient-ref-corn-grits` | `corn grits / semoule de maïs de type grits`; English aliases `degermed corn grits`, `maize grits`; `GRAIN_AND_CEREAL` | Ordinary degermed grits are ground and distinct from whole kernels and hominy grits. See the [R113 review](wp03-section-f-ordinary-corn-grits-boundary-review-r113-20261014.md#L1). |
| `ingredient-ref-masa-harina` | `masa harina / farine de maïs nixtamalisée`; no aliases; `FLOUR_AND_STARCH` | Dehydrated nixtamalized flour, not whole-kernel corn. |

The active rows above have null default density, empty unit mappings, and no attached corn/pozole forms in the [105-form file](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json). `ingredient-ref-pozole-corn` is not in the active reference file; it remains a ledger-only candidate at [ledger line 89106](../research-ledger.v1.json#L89106), with `identityState: needs_clarification`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Its earlier unresolved decision says to wait until product state and display wording are narrowed. The separate `ingredient-ref-pearled-hominy` candidate remains unresolved at [ledger line 84448](../research-ledger.v1.json#L84448); do not merge it with whole dry kernels, since it is a dry-milled product.

## What current evidence resolves—and what it does not

Official Mexican food and agricultural sources distinguish dry and precooked maize for pozole. The current Secretariat of Agriculture page describes *maíz pozolero (cacahuazintle) precocido o seco*. An IMSS food-catalog extract separately labels *maíz para pozole* and describes dry kernels for later nixtamalization alongside a precooked Cacahuazintle product. These records establish that product state can be specified; the generic *pozole corn* name alone still leaves the state open.

The product class is not limited to one maize race. INIFAP’s 2023 study discusses Ancho and Cacahuazintle controls alongside varieties from the Elotes Occidentales race used as pozolero corn. CONABIO describes Ancho itself as a principal pozole maize in Guerrero and records use in other states. Do not promote *Cacahuazintle* as a generic alias or cultivar name for the whole candidate.

A current Toronto/GTA wholesale listing explicitly offers *dried raw kernel* for the buyer’s own lime cook and *nixtamalized / processed hominy* as separate grades. Its umbrella title is *White Hominy / Pozole Corn* and it treats the grades as one commercial product record; the page is quote-only, says origin/specification are decided per offer, and provides no lot documents until quotation. It supports the raw-versus-processed distinction, but not a consumer SKU, universal grain specification, or Québec French name.

The Québec French evidence remains attached to the prepared product. OQLF pairs `hominy corn / maïs lessivé` and defines the French term as a product made from fully developed dry yellow or white maize placed in preserving liquid. A Montréal retailer lists a Mexican-style white hominy item and describes it as *Maïs Pozolero Blanco* and ready to serve. A Québec retailer’s product list uses *Carey – Maïs Pozolero Blanc* without stating whether it is raw, precooked, canned, or dry. Another Canada-wide Mexican-grocery listing uses Spanish *Maíz pozolero*, ships to Québec, and gives no product state or French display. These listings do not establish *maïs pozolero* as the fr-CA name of raw dry kernels.

Accordingly, no source supports activating `maïs pozolero`, `maïs sec pour pozole`, `maïs pour pozole`, or `maïs cacahuazintle` as a display or alias for the dry raw product. The first phrase is locally attached to ready-to-serve hominy; the others would extend or translate wording without a Québec food-label attestation. Retain *Maïs Pozolero Blanc* only as a source-specific retail label for the prepared item, not as a catalog alias.

## Picker ownership and recipe demand

The current [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9) normalizes accents and punctuation, checks attached form terms, then returns references whose names, aliases, or form terms contain a complete word phrase before substring fallback ([search order](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L113)). The ledger is not part of that search input. A static phrase-ownership projection against the live [reference file](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L4297) and [form file](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) gives:

| Query | Current phrase owner(s) | R114 disposition |
| --- | --- | --- |
| `pozole corn`, `posole corn`, `dry pozole corn`, `maíz pozolero`, `maïs pozolero`, `maïs sec pour pozole`, `cacahuazintle`, `cacahuacintle` | None | Keep the candidate out of the picker. |
| `hominy` | `ingredient-ref-hominy-corn`; `ingredient-ref-hominy-grits` | Broad term returns both the whole processed product and the ground product. |
| `hominy corn`, `maïs lessivé` | `ingredient-ref-hominy-corn` | Preserve the current processed whole-kernel owner. |
| `hominy grits`, `gruau de maïs` | `ingredient-ref-hominy-grits` | Preserve the current ground-product owner. |
| `cornmeal` | `ingredient-ref-cornmeal` | Preserve the existing milled-product owner. |
| `corn grits`, `semoule de maïs de type grits` | `ingredient-ref-corn-grits` | Preserve R113’s qualified ordinary-grits owner. |
| `semoule de maïs` | `ingredient-ref-cornmeal`; `ingredient-ref-corn-grits` | Existing phrase is ambiguous because it is also contained in the longer corn-grits display. Do not reuse this broad phrase for pozole corn. |
| `masa harina`, `farine de maïs nixtamalisée` | `ingredient-ref-masa-harina` | Preserve the current ground nixtamalized-flour owner. |

The [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) lists **114 recipes** with **1,123 ingredient entries**. A scan of every listed recipe JSON file and ingredient entry found **zero** mentions of `pozole`, `posole`, `pozolero`, `cacahuazintle`, `cacahuacintle`, `hominy`, `maïs pozolero`, `maïs lessivé`, or pearled hominy. No recipe line, authored amount, or recipe link depends on this candidate.

## Numeric, form, and substitution limits

- **Forms and conversion data:** add none. The candidate has no supported form, density, unit mapping, dry-to-cooked conversion, hydration ratio, or cooking yield. The whole kernel’s later alkaline processing is not a reusable conversion to canned hominy.
- **Source-specific weights:** the Puebla procurement specification for *maíz pozolero precocido en lata* lists **822 g ± 50 g net** and **460 g ± 50 g drained** for that prepared packed product. These are product-specification tolerances, not a household measure, dry-grain weight, generic can yield, or conversion. Allzone’s 25/50 kg bags and bulk-bag options are quote-only commercial packing, not recipe portions.
- **Recipe amounts:** none in the bundled corpus. Amounts in any pozole recipe or product label remain source-specific and are not transferable to the candidate.
- **Substitutions:** add none. The ledger remains `not_yet_researched`, and both [global](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json) and [contextual](../../../app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json) substitution files currently contain no rules. The earlier New Mexico source mentions hominy as a regional substitute for its “true posole” ingredient; that recipe-specific statement does not establish a global dry-corn-to-canned-hominy substitution. Keep pozole corn separate from pearled hominy, hominy grits, corn grits, cornmeal, masa harina, generic kernels, and dried sweet-corn kernels.

## Source record and access limits

The local source IDs below are proposal-only; this review does not add them to the shared ledger. Sources were opened or searched on **2026-10-14**, unless an earlier ledger access date is stated.

| Source ID | Source | Supports and limits |
| --- | --- | --- |
| `WP03-PZ-R114-20261014-S01` | Mexico Secretaría de Agricultura y Desarrollo Rural, [Pozole, el platillo insignia de las fiestas patrias](https://www.gob.mx/agricultura/articulos/pozole-el-platillo-insignia-de-las-fiestas-patrias-que-reune-sabor-cultura-y-tradicion), published 2026-09-13. | Indexed extract says *maíz pozolero (cacahuazintle) precocido o seco*. Supports separate states. Direct page retrieval returned HTTP 403, so the claim is limited to the indexed extract and not its surrounding context. |
| `WP03-PZ-R114-20261014-S02` | Mexican Social Security Institute (IMSS), [Group 4: Cereals food catalog](https://www.imss.gob.mx/sites/all/statics/pdf/cuadros-basicos/Grupo4-Cereales.pdf), maize entries. | Indexed PDF extract lists *maíz para pozole*, dry kernels for later nixtamalization, and precooked Cacahuazintle. The current direct PDF fetch did not expose readable text; use is limited to the indexed extract. |
| `WP03-PZ-R114-20261014-S03` | INIFAP / Revista Mexicana de Ciencias Agrícolas, [Yield of varieties of pozolero corn of the ‘elotes occidentales’ race](https://cienciasagricolas.inifap.gob.mx/index.php/agricolas/en/article/view/3225), published 2023-08-03, abstract. | Describes Ancho and Cacahuazintle controls and Elotes Occidentales varieties evaluated for pozolero use. Supports a multi-race use class; it is not a Québec retail label. |
| `WP03-PZ-R114-20261014-S04` | CONABIO / Biodiversidad Mexicana, [Ancho maize race](https://www.biodiversidad.gob.mx/diversidad/alimentos/maices/razas/OchoH/Ancho), updated 2025-07-08. | Identifies Ancho as a characteristic pozole maize in Guerrero and records use in several other states. Supports regional scope beyond a Cacahuazintle-only label; does not establish a Canadian or Québec product term. |
| `WP03-PZ-R114-20261014-S05` | Gobierno del Estado de Puebla / SEDIF, [2022 procurement specification](https://licitaciones.puebla.gob.mx/images/BasesEstatales2022/Mayo/GESAL-105-152-2022-CALIENTES_Y_FRIOS_CASAS_DE_ASITENCIA.pdf), item 17, PDF p. 98. | Defines one *maíz pozolero precocido en lata* product, mainly Cacahuacintle, with lime nixtamalization, deheading, blanching, blooming, and hermetic liquid packing. Its mass tolerances apply only to this procurement specification; it is not a definition of all pozole corn. |
| `WP03-PZ-R114-20261014-S06` | OQLF, [maïs lessivé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059882/mais-lessive), preferred term and definition, last updated 1979. | Directly pairs `hominy corn / maïs lessivé` and defines the preserving-liquid product. It supports the existing processed identity, not a dry pozole-grain name. |
| `WP03-PZ-R114-20261014-S07` | Allzone Trading, Toronto/GTA, [White Hominy / Pozole Corn](https://allzonetrading.ca/supply/white-hominy-pozole-corn). | Current Canadian B2B page distinguishes dried raw kernels for the buyer’s lime cook from processed hominy, but is quote-only, uses one umbrella product record, and supplies no fixed origin, lot, confirmed specification, or French label. It is seller marketing, not a product standard. |
| `WP03-PZ-R114-20261014-S08` | Mon Épicerie Mexicaine, [Maíz pozolero](https://monepiceriemexicaine.ca/en/produit/maiz-pozolero-2/). | Current Canadian listing says in stock and ships to Québec/Ontario, but supplies no form, package amount, processing state, or French display. It supports only the Spanish product label’s local-market presence. |
| `WP03-PZ-R114-20261014-S09` | Casa Sabor, Québec, [Tous les produits](https://www.casa-sabor.ca/boutique/tous-les-produits), Carey product listing. | The current French-language collection lists *Carey – Maïs Pozolero Blanc*; its product detail was not retrievable and the collection page supplies no processing or package state. It does not attest the term for raw dry kernels. |
| `WP03-PZ-R114-20261014-S10` | Rancho Latin Market, Montréal, [Maïs blanc Hominy à la mexicaine](https://rancholatinmarket.ca/fr/products/goya-white-hominy-corn-mexican-29-oz-maiz-pozolero-blanco-grande-hominy-822g-by-goya). | Retail title calls the item hominy; French description uses *Maïs Pozolero Blanco* and says it is ready to serve. This is direct local product-copy evidence for a prepared item, not terminology authority or support for the dry-product display. |
| `WP03-PZ-R114-20261014-S11` | Visit Albuquerque, [New Mexico Holiday Recipes: Posole](https://assets.simpleviewinc.com/simpleview/image/upload/v1/clients/albuquerque/NMHolidayRecipes_ABQ_Posole_c3c3269d-a512-4c57-b32e-ec017af0f274.pdf), prior access 2026-10-07, recorded as WP03-S156 in the [existing boundary review](../batches/hominy-boundary-review.md#L37). | The regional recipe source describes dried lime-treated posole corn and hominy as a substitute in that context. Direct retrieval failed in this recheck; retain the prior record’s narrow source-specific use, not a general identity or substitution claim. |

## Final recommendation

Keep `ingredient-ref-pozole-corn` ledger-only with `identityState: needs_clarification`. Do not assign an English or fr-CA display or active aliases. In particular, do not alias generic `pozole corn`, `posole corn`, `maíz pozolero`, or `Maïs Pozolero Blanc` to `ingredient-ref-hominy-corn`: the first terms may describe dry raw kernels, and the Québec French retail phrase found here describes a prepared hominy product. Where a specific item is already nixtamalized and prepared in liquid and meets OQLF’s `maïs lessivé` scope, keep it on the existing hominy-corn row.

A future activation would need a source that labels the raw dry whole-kernel food product and a Québec-facing French name for that same state. Until then, preserve the separate boundaries, leave all numeric and substitution behavior unset, and keep the aggregate Section F plan item open.
