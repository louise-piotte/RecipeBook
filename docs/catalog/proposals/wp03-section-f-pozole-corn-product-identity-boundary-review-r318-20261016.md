# WP03 Section F: pozole-corn product identity boundary review (R318)

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** proposal-only review; no catalog, research-ledger, checklist, roadmap, generated, or recipe data was changed.
- **Existing candidate:** `ingredient-ref-pozole-corn`, retained in the research ledger as `recordType: candidate` with `identityState: needs_clarification`.
- **Plan:** the earlier pearled-hominy/pozole boundary checks remain complete with both candidates held at [plan lines 3673–3691](../../RecipeBook-global-ingredient-catalog-plan.txt#L3682). The aggregate Section F corn-grain gap remains open at [plan lines 3761–3763](../../RecipeBook-global-ingredient-catalog-plan.txt#L3770).
- **Scope:** recheck current Canadian and Québec product listings, Canadian/Québec terminology, active picker ownership, forms, legacy-import candidates, proposal history, and bundled recipe demand. This R318 follow-up adds a current market and picker audit to the earlier R114 hold; it does not reverse or duplicate the earlier source decision.
- **Recommendation:** **hold** the candidate as ledger-only. Do not add an active reference, alias, form, measurement, conversion, recipe link, yield, or substitution. The broad name spans products with different maize material and processing states, and no Québec French food name for a narrowly defined dry product was established.

## Decision summary

The phrase `pozole corn` does not identify one stable catalog product. Current and historical evidence covers at least three whole-kernel products: raw dried food-use maize intended for a later lime cook; pre-cooked or otherwise nixtamalized kernels sold ready to use, including shelf-stable cans; and regionally described dried lime-treated posole corn. These examples are related by culinary use, but the generic name does not specify variety, prior treatment, or ready-to-use state.

Current consumer listings in Québec primarily expose the prepared side of that boundary. A La Maison Quebec lists Goya `Maiz Pozolero` as canned, whole white corn that is nixtamalized and ready to use; EnRoute lists La Costeña `Maiz para pozole` and describes it as cleaned and precooked. Casa Sabor lists `Carey – Maïs Pozolero Blanc` without product-state details, and Mon Épicerie Mexicaine lists `Maíz pozolero` without a processing statement. A Montréal retailer’s French page titles a product as hominy and describes it as `Maïs Pozolero Blanco`, ready to serve. These retailer labels demonstrate local presence, not an authoritative French name for raw, unprocessed grain.

The current Allzone Toronto/GTA listing does distinguish dried raw kernels for the buyer’s own nixtamalization from nixtamalized/processed hominy. It is a quote-only global sourcing page: origin, specifications, lot and supply are confirmed per enquiry, and no confirmed consumer SKU or Québec French product wording is provided. It makes the processing boundary clearer but does not close the bilingual identity gap.

Mexican sources also show that `pozolero` is not a cultivar name. The 2023 INIFAP study compares Ancho and Cacahuazintle controls with pozole-use maize of the Elotes Occidentales race; CONABIO identifies Ancho as a principal pozole maize in Guerrero and reports its use in other states. Do not substitute `Cacahuazintle` as a generic identity or alias. The 2026 Secretariat of Agriculture article describes `maíz pozolero (cacahuazintle) precocido o seco`, but the exact phrase still spans states and the page does not establish a Québec display.

OQLF’s official entry pairs `maïs lessivé` with `hominy corn` and defines the French term as prepared mature dry yellow or white maize placed in preserving liquid. Where an exact packaged item matches that scope, retain it under the existing `ingredient-ref-hominy-corn`; do not attach unqualified `pozole corn` to that row because the same market name also appears on dry-product offers. Keep the whole-kernel candidate apart from hominy grits, ordinary corn grits, cornmeal, masa harina, white canjica maize, crushed yellow canjiquinha, and the finished pozole dish.

## Active ownership, forms, ledger, and archive audit

The live seed snapshot reviewed contains **1,673 ingredient references** and **127 forms**. The following active rows own nearby phrases or product classes:

| Active reference | Current name, aliases, and category | Boundary kept in this review |
| --- | --- | --- |
| `ingredient-ref-corn-kernels` | `corn kernels / maïs`; no aliases; `VEGETABLE_AND_AROMATIC` | Generic kernels. Its exact picker term does not assert large-kernel, dry-grain, or nixtamalization properties. |
| `ingredient-ref-white-corn-kernels`, `ingredient-ref-yellow-corn-kernels`, `ingredient-ref-blue-corn-kernels` | `white corn kernels / grains de maïs blanc`, `yellow corn kernels / grains de maïs jaune`, `blue corn kernels / grains de maïs bleu`; no aliases; `GRAIN_AND_CEREAL` | Color-class kernel identities; none is a pozole-use or processing alias. |
| `ingredient-ref-canjica-white-maize` | `white canjica maize / maïs blanc pour canjica`; English alias `canjica white`; `GRAIN_AND_CEREAL` | A separate white, degerminated dry maize product. Its accepted R67 review explicitly keeps it apart from hominy, canjiquinha, and prepared canjica; do not cross-assign terms. |
| `ingredient-ref-hominy-corn` | `hominy corn / maïs lessivé`; English alias `lyed corn`; `VEGETABLE_AND_AROMATIC` | Existing whole-kernel processed product. OQLF scopes `maïs lessivé` to a product in preserving liquid; the R114 review rejects broad `pozole corn` as an alias. |
| `ingredient-ref-hominy-grits` | `hominy grits / gruau de maïs`; no aliases; `GRAIN_AND_CEREAL` | Ground product, not whole-kernel pozole maize. |
| `ingredient-ref-corn-grits`, `ingredient-ref-cornmeal` | `corn grits / semoule de maïs de type grits`; aliases `degermed corn grits`, `maize grits`; and `cornmeal / semoule de maïs`, alias `corn meal` | Milled products; neither is a whole-kernel identity. |
| `ingredient-ref-masa-harina` | `masa harina / farine de maïs nixtamalisée`; no aliases; `FLOUR_AND_STARCH` | Dehydrated nixtamalized flour. Nixtamalization alone does not make this whole-kernel product. |
| `ingredient-ref-peruvian-purple-corn-kernels`, `ingredient-ref-chulpe-corn`, `ingredient-ref-dried-sweet-corn-kernels` | Separate whole-kernel or specialty corn identities | Keep regional use, color, and sweet-corn type distinct; none has a pozole alias. |

All nearby references have `defaultDensity: null` and `unitMappings: []`. The 127-form file contains no pozole/posole state form or match term. Its unrelated `dried corn husks` form is for tamal wrappers and is not a corn-grain form.

The legacy import file has 59 candidates and no exact pozole/posole/hominy candidate or `ingredient-ref-pozole-corn` identity. The research-ledger candidate is the only current owner of `ingredient-ref-pozole-corn`; it remains `needs_clarification`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. It already carries the original boundary evidence and the three R114 Canadian/Québec listing records (`WP03-PZ-QC-RETAIL-R114-20261014-S01` through `S03`). This proposal does not change the ledger.

The archive was checked before drafting. The [hominy boundary review](../batches/hominy-boundary-review.md), [2026-10-10 product-boundary review](wp03-section-f-pozole-corn-boundary-review-20261010.md), [R114 product-boundary review](wp03-section-f-pozole-corn-product-boundary-review-r114-20261014.md), [R114 hold integration record](../batches/wp03-section-f-pozole-corn-boundary-hold-integration-20261014/README.md), and [2026-10-12 next-grain gap sweep](wp03-section-f-next-grain-gap-sweep-20261012.md) all keep pozole corn unresolved and distinct from prepared hominy. R67 separately integrated white canjica maize; R220 held Brazilian canjiquinha outside active references. R193 retained pearled hominy as a different dry-milled candidate. None of these decisions allocates an alias to pozole corn or closes the aggregate Section F item.

## Picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes accents and punctuation, prefers complete word-phrase matches across reference names, aliases, and attached form terms, and falls back to substring matching only when no complete phrase is found. A static projection over the current reference/form terms gives:

| Query | Current projected result |
| --- | --- |
| `pozole`, `posole`, `pozole corn`, `maíz pozolero`, `maïs pozolero`, `maïs pour pozole` | No active result. |
| `hominy` | Both `ingredient-ref-hominy-corn` and `ingredient-ref-hominy-grits`; it remains an intentionally broad query. |
| `hominy corn`, `maïs lessivé` | `ingredient-ref-hominy-corn`. |
| `hominy grits` | `ingredient-ref-hominy-grits`. |
| `corn kernels` | Six separate results: generic, dried sweet, white, yellow, blue, and Peruvian purple kernels. |
| `corn` | 34 broad results across kernel, milled, prepared, oil, syrup, starch, cereal, and other corn identities. |
| `masa harina` | `ingredient-ref-masa-harina`. |
| `white canjica maize` / `canjiquinha` | The former returns `ingredient-ref-canjica-white-maize`; the latter has no active result. |

Because there is no exact pozole phrase owner, attaching `pozole corn` or `maíz pozolero` to the hominy row would turn a query that can mean raw or already-treated maize into an automatic selection of the prepared product. Leaving those phrases unassigned is safer until the picker query can be resolved to one product state and a Québec French name is supported. This is a static projection from the current data and search implementation, not a live UI or ranking test.

## Full bundled recipe demand scan

All **114** manifest-listed recipe files and their **1,123** ingredient rows were inspected. No complete recipe file or ingredient row contains `pozole`, `posole`, `pozolero`, `posolero`, `hominy`, `canjica`, `canjiquinha`, `masa harina`, `cornmeal`, `corn meal`, `maïs lessivé`, `gruau de maïs`, or `semoule de maïs`; no row links the relevant hominy/grits/masa/cornmeal IDs.

The two whole-corn recipe lines are `2 ears corn on the cob` in recipe 044 and `1/2 cup frozen corn kernels` in recipe 078. They support only their existing cob and generic-kernel references. They do not show pozole/posole demand and cannot justify adding `pozole corn` as an alias for either line. Other incidental `corn` substring hits are cornstarch and corn syrup, also unrelated to this whole-kernel identity. No bundled recipe is relinked and no quantity is inferred.

## Evidence and Québec naming

The reviewed Canadian and Québec pages strengthen product-state evidence but do not resolve an identity-only bilingual row for raw dry pozole grain. The 2026 Mexican government article explicitly includes both precooked and dry corn under `maíz pozolero`; the accessible Canadian supplier page also separates dried raw food-use kernels from processed hominy. This proves the name is not state-specific in these sources, but it does not prove a unified product specification across suppliers.

The Québec listings use Spanish `Maíz pozolero` or the retail phrase `Maïs Pozolero Blanc`. On the pages with state details, the item is precooked, canned, or explicitly hominy. The other Québec list pages do not say raw, dry, or nixtamalized. No authoritative OQLF or TERMIUM English–Québec French food-term pair for dry, unprocessed pozole maize surfaced in the terminology search. Do not create `maïs sec pour pozole`, `maïs pour pozole`, or `maïs pozolero` as a preferred term or alias for that dry product from literal translation or from a prepared product label.

Keep these boundaries:

- **Generic and color-class maize:** generic `corn kernels / maïs` and the active white, yellow, blue, purple, Chulpe, and dried-sweet-corn rows do not encode the pozole-use selection or its process. Do not attach pozole wording to any of them.
- **Prepared hominy:** keep the current `hominy corn / maïs lessivé` identity for packaged whole kernels that meet its processed/preserved product scope. A retailer’s Spanish or bilingual name `Maíz Pozolero Blanco` on a canned hominy product is not evidence that the raw grain is the same catalog identity.
- **Other processed or dry products:** hominy grits and ordinary corn grits are ground products; cornmeal is a milled product; masa harina is flour made from nixtamalized maize. White canjica is its separately reviewed degerminated maize product. The R220 canjiquinha hold concerns crushed yellow corn. Do not merge them on the basis of being corn or dry grain.
- **Prepared pozole:** `pozole` is also the finished soup/stew. The Mexican government ingredient list names the maize separately from its meat and broth ingredients. Do not add the dish name by itself as a maize alias or treat a prepared pozole as plain corn.

## Measurements and substitution evidence

No reusable measurement or substitution behavior is supported. The market pages give product-level packages only: A La Maison’s Goya listing is 822 g, Walmart’s La Costeña listing is 783 mL, and EnRoute’s La Costeña page is titled 3 kg. These package declarations belong to those listings; they do not provide a household volume for dry kernels, a density, an app unit mapping, a conversion among dry/pre-cooked/canned states, or a cooking yield. Allzone’s bag sizes are quoted commercial packaging and are not recipe measures.

The archived [Visit Albuquerque posole source](../batches/hominy-boundary-review.md) reports hominy as a substitute for a specific regional dried posole product. That contextual alternative does not establish universal equivalence, a conversion ratio, or a safe general substitution for all raw, nixtamalized-dried, precooked, or canned products. Do not promote a global substitution rule. No bundled recipe supplies a quantity, preparation state, or tested replacement for pozole maize.

## Recommendation

Keep `ingredient-ref-pozole-corn` ledger-only and `needs_clarification`. Add no active identity, alias, form, measure, density, unit mapping, recipe link, conversion, cooking yield, or substitution. Preserve the active `hominy corn / maïs lessivé`, hominy-grits, corn-grits, cornmeal, masa-harina, white-canjica, and other corn identities. A later proposal could reconsider only after it selects a source-defined grain/process target and finds Québec French food wording for that same product state; the broad phrase alone should remain unallocated.

## Proposal-local source register

These sources were checked online on 2026-10-16. R318 source IDs are local to this proposal and have not been added to the shared research ledger. Older evidence IDs are cited in the linked prior reviews.

| Source ID | Source | Supports and limits |
| --- | --- | --- |
| `WP03-PZ-R318-20261016-S01` | Office québécois de la langue française, [maïs lessivé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059882/mais-lessive) | Official Québec preferred term and English pair `maïs lessivé / hominy corn`; definition scopes the French name to prepared mature yellow or white maize in preserving liquid. Entry last updated 1979. It supports the existing hominy boundary, not dry pozole grain. |
| `WP03-PZ-R318-20261016-S02` | Government of Canada Translation Bureau, [TERMIUM Plus query for hominy](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=23&i=&index=enb&lang=eng&sg_kp_wet=1113184&srchtxt=CAUSTIC) | The food-industries entry describes hominy as prepared maize kernels, distinguishes lye hominy and pearled hominy, and says corn grits are ground hominy. It does not define pozole corn or name the dry product in Québec French. Also recorded in prior boundary sources as `WP03-S126`. |
| `WP03-PZ-R318-20261016-S03` | Mexico Secretariat of Agriculture and Rural Development, [Pozole, el platillo insignia de las fiestas patrias](https://www.gob.mx/agricultura/articulos/pozole-el-platillo-insignia-de-las-fiestas-patrias-que-reune-sabor-cultura-y-tradicion) | Published 2026-09-13. Search-index extract names `maíz pozolero (cacahuazintle) precocido o seco` and lists corn, meat, and broth separately. Direct page retrieval returned HTTP 403 on this review; treat the finding as limited to the indexed text, not as a full-page inspection or Québec terminology evidence. |
| `WP03-PZ-R318-20261016-S04` | INIFAP / *Revista Mexicana de Ciencias Agrícolas*, [Yield of varieties of pozolero corn of the ‘Elotes Occidentales’ race](https://cienciasagricolas.inifap.gob.mx/index.php/agricolas/en/article/view/3225) | Peer-reviewed 2023 study evaluates Elotes Occidentales varieties alongside Ancho and Cacahuazintle controls. Supports `pozolero` use across several maize races; it does not define a Canadian retail product or French name. |
| `WP03-PZ-R318-20261016-S05` | CONABIO, [Ancho maize race](https://www.biodiversidad.gob.mx/diversidad/alimentos/maices/razas/OchoH/Ancho) | Describes Ancho as a principal pozole maize in Guerrero and reports its use for the same purpose in Morelos, Puebla, Michoacán, and Jalisco. Updated 2025-07-08. Supports regional use and grain traits, not a unique species or Québec product name. |
| `WP03-PZ-R318-20261016-S06` | A La Maison Québec, [Maiz Pozolero Goya 822g](https://alamaisonquebec.com/producto/maiz-pozolero-goya-822g/) | Current Québec storefront lists it under canned goods and describes tender whole white corn as nixtamalized, canned, and ready to use. Its 822 g is a product package. The page is retailer copy in English/Spanish, not an authoritative French name or dry-grain specification. |
| `WP03-PZ-R318-20261016-S07` | EnRoute Québec, [Maiz para pozole 3 kg](https://enrouteqc.ca/producto/maiz-para-pozole-3-kg/) | Québec storefront page describes La Costeña maize as cleaned and precooked, ready to use. The 3 kg title is product-specific packaging; page copy supplies no French display or raw-dry product evidence. |
| `WP03-PZ-R318-20261016-S08` | Casa Sabor, Québec, [Tous les produits](https://www.casa-sabor.ca/boutique/tous-les-produits) | Current French-language catalogue lists `Carey – Maïs Pozolero Blanc` for sale. The accessible collection does not identify processing state or establish this phrase for raw kernels; product detail could not be retrieved. |
| `WP03-PZ-R318-20261016-S09` | Mon Épicerie Mexicaine, [Maíz pozolero](https://monepiceriemexicaine.ca/en/produit/maiz-pozolero-2/) | Current retailer page lists `Maíz pozolero`, says it ships to Québec and Ontario and is in stock at access, but omits processing state and a Québec French name. Availability is volatile. |
| `WP03-PZ-R318-20261016-S10` | Rancho Latin Market, Montréal, [Maïs blanc Hominy à la mexicaine](https://rancholatinmarket.ca/fr/products/goya-white-hominy-corn-mexican-29-oz-maiz-pozolero-blanco-grande-hominy-822g-by-goya) | French retail page titles the item as hominy and describes it as `Maïs Pozolero Blanco`, ready to serve. It documents local label overlap for a prepared product, not the name of raw dry grain. This retailer evidence was also recorded in prior source `WP03-S157`. |
| `WP03-PZ-R318-20261016-S11` | Walmart Canada, [La Costeña White Hominy Mexican Style](https://www.walmart.ca/en/ip/white-hominny/1H5SUZ8X8FQW) | Canadian retailer describes a shelf-stable, whole, canned 783 mL white-hominy product as ready to use for pozole. Supports current prepared-hominy availability, not the raw product boundary or French terminology. |
| `WP03-PZ-R318-20261016-S12` | Allzone Trading, Toronto/GTA, [White Hominy / Pozole Corn](https://allzonetrading.ca/supply/white-hominy-pozole-corn) | Current B2B listing distinguishes dried raw kernels for the buyer’s lime cook from nixtamalized/processed hominy. It is a quote-only, global sourcing page; grade, lot, origin, and specifications are confirmed per enquiry. It is not a confirmed consumer SKU or Québec French label. |
| `WP03-PZ-R318-20261016-S13` | Visit Albuquerque, [New Mexico Holiday Recipes: Posole](https://assets.simpleviewinc.com/simpleview/image/upload/v1/clients/albuquerque/NMHolidayRecipes_ABQ_Posole_c3c3269d-a512-4c57-b32e-ec017af0f274.pdf) | Prior source record WP03-S156 describes lime-treated, dried regional posole corn and hominy as a substitute in that recipe context. This R318 review did not re-fetch the PDF; it is retained only as narrow contextual substitution evidence, not as a universal definition or substitution rule. |

## Review conclusion

**Hold.** R318 confirms that current Canadian/Québec consumer pages mainly sell or label a ready-to-use/precooked hominy product under pozolero wording, while the raw-dry offer found in Canada remains quote-based and lacks Québec French wording. Government and research sources show that pozolero use crosses maize races and product states. Preserve the current active ownership and keep `ingredient-ref-pozole-corn` unresolved; add no row or alias on the strength of culinary use, a prepared-product label, or the fact that pozole recipes contain corn.
