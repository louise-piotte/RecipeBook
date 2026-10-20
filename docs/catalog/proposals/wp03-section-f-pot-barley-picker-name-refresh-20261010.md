# WP03 Section F: pot-barley picker-name refresh

## Review record

- **Reviewed:** 2026-10-10.
- **Status:** reviewed; the coordinator recorded this bounded name refresh in the plan and roadmap. Keep the active-catalog hold. `Orge en pot` is a promising Québec-market display, but current evidence is mixed and does not yet justify promotion.
- **Scope:** refresh French picker wording for the existing pot/Scotch-barley candidate against hulled barley. No grits, corn, or pozole products are reviewed.
- **Disposition:** retain `ingredient-ref-pot-barley` as a ledger-only `needs_clarification` candidate. Keep the hulled- and pearl-barley rows, names, aliases, forms, and numeric data unchanged.

## Finding and recommendation

The process distinction remains supported. The federal food specification treats Scotch/pot barley as retaining more bran than pearl barley, while hulled barley has only the inedible outer husk removed; Nith River Milling describes pot barley as lightly polished to remove some, but not all, outer bran. Keep the candidate separate from both active products.

The official French wording remains unresolved. OQLF's current *orge mondé* entry pairs the term with *hulled barley* and defines removal of the outer hull. TERMIUM's grain-growing record groups *pot barley*, *hulled barley*, and the rarer *Scotch barley* under *orge mondé / orge mondée*. The TERMIUM record was modified 2026-08-06, but it does not distinguish the products in French.

The fresh Québec-facing retail search surfaced *orge en pot* as a candidate display on current retailer and supplier listings. The examples do not form a consistent technical crosswalk: some retailers list pot barley as *orge mondé*, and one product page uses *orge en pot* in its heading but *orge mondé* in the ingredient field. A bilingual grocer also uses *orge mondé* for a product returned by a `pot barley` search, while the same marketplace uses that name for hulled barley. No OQLF or TERMIUM entry reviewed endorses *orge en pot* as a standardized grain name.

**Recommendation: keep the hold.** Keep *orge en pot* as a future Québec-review candidate, not an active display or alias. Do not use *orge mondé / orge mondée* for pot barley; the exact French key is already assigned to hulled barley. Do not substitute a literal process phrase such as *orge partiellement polie* without a source-backed human-food label or terminology review. No evidence supports merging the English products.

## Current package and checklist state

The snapshot contains 862 active ingredient references, 47 forms, 1,107 ledger records, and 114 bundled recipes with 1,123 ingredient rows. The checked [reference seed](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms seed](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), and [research ledger](../research-ledger.v1.json) show:

| Current ID | Current state | Disposition |
| --- | --- | --- |
| `ingredient-ref-pot-barley` | No active seed row. Ledger record is `candidate / needs_clarification`; measurement and substitution states are `not_yet_researched`. | Retain the candidate and hold. Do not add a new active row, aliases, or forms. |
| `ingredient-ref-hulled-barley` | Active `hulled barley / orge mondé`, `GRAIN_AND_CEREAL`, no aliases; density null and unit mappings empty. | Retain. OQLF's exact French term supports this current identity. |
| `ingredient-ref-pearl-barley` | Active `pearl barley / orge perlé`, `GRAIN_AND_CEREAL`, no aliases; density null and unit mappings empty. | Retain as the separately polished product. |

No barley form is present in the forms seed. The bounded checklist item is marked complete as a product-boundary review, while its Québec-name prerequisite remains open: [plan lines 1406–1408](../../RecipeBook-global-ingredient-catalog-plan.txt#L1406) and [checkpoint lines 4100–4103](../../RecipeBook-global-ingredient-catalog-plan.txt#L4346). The prior [pot-barley boundary packet](../batches/pot-barley-boundary-review.md) records the process distinction and earlier hold; this refresh adds only the current-name evidence.

## Recipe demand and data disposition

A whole-phrase scan of all 114 recipe JSON files and 1,123 ingredient rows found no match for barley, pot/Scotch/hulled/pearl barley, *orge mondé*, *orge perlé*, or *orge en pot*. No recipe row links to a barley identity. Do not infer recipe demand, measurements, cooking yields, or substitutions from the retailer pages or federal procurement specification.

Keep density, unit mappings, forms, measurements, conversions, yields, and substitution data unknown. No source reviewed here supports a reusable mass-volume mapping or a global replacement rule among pot, hulled, and pearl barley.

## Focused future picker fixtures

These are proposal expectations only; no tests or seed edits are made here.

| Input | Expected result |
| --- | --- |
| `hulled barley`, `orge mondé` | Existing `ingredient-ref-hulled-barley` only. |
| `pearl barley`, `orge perlé` | Existing `ingredient-ref-pearl-barley` only. |
| `pot barley`, `Scotch barley` | Keep unresolved until the French display and exact product scope are approved; do not select the hulled-barley row by English cross-alias. |
| `orge en pot` | Candidate wording for later review; no active exact match while the hold remains. |
| `orge mondée` | Do not add as a pot-barley alias; preserve the current OQLF/seed hulled-barley mapping. |

## Sources

All sources were accessed on 2026-10-10. Official terminology and federal food-purchasing sources establish the authoritative term conflict and processing boundary. Retail pages are treated as market-label evidence only.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP03-PB-REFRESH-20261010-S01` | OQLF, [orge mondé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358517/orge-monde), updated 2004 | Pairs *hulled barley / orge mondé* and defines the grain as barley with the outer hull removed. Supports the active hulled-barley row, not pot-barley equivalence. |
| `WP03-PB-REFRESH-20261010-S02` | TERMIUM Plus, [Scotch barley search record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enw&lang=fra&srchtxt=SCOTCH+BARLEY), record dated 2021-10-14 and modified 2026-08-06 | Lists *pot barley*, *hulled barley*, and rare *Scotch barley* together and gives *orge mondé / orge mondée* for the class. Confirms the naming collision; does not establish product equivalence. |
| `WP03-PB-REFRESH-20261010-S03` | Department of National Defence, [Food Quality Specifications: Grains, FQS 24-01](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-eng.pdf), paragraphs 11–14 | Separates pearl, Scotch/pot, and hulled barley by processing and retained bran. Federal purchasing specification, not a Québec French naming authority. |
| `WP03-PB-REFRESH-20261010-S04` | Nith River Milling, [Barley Products](https://www.nithriver.ca/barley) | Defines pot barley as dehulled and lightly polished to remove some, but not all, bran, distinguishing it from dehulled barley with bran intact. Process evidence only. |
| `WP03-PB-REFRESH-20261010-S05` | Loblaws Québec-facing French search for [pot barley](https://www.loblaws.ca/fr/search?search-bar=pot+barley), current results | Returns PC Menu Bleu *Orge mondé* and *Orge perlé*. Shows the market's *orge mondé* wording for pot barley, which collides with hulled barley. Search listing, not a technical definition. |
| `WP03-PB-REFRESH-20261010-S06` | OnlineOrganics, [Orge mondé biologique / Organic Pot Barley](https://onlineorganics.ca/fr/products/orge-monde-biologique) | French product page labels the item *Orge mondé biologique* and identifies it in image text as Organic Pot Barley; its description places the product between hulled/dehulled and pearl barley by polishing. The label still uses the exact name assigned to hulled barley by OQLF. |
| `WP03-PB-REFRESH-20261010-S07` | OnlineOrganics, [Orge décortiqué biologique / Organic Hulled Barley](https://onlineorganics.ca/fr/products/orge-decortique-biologique) | Search-indexed page calls hulled barley *orge décortiqué* and says it is also called *orge mondé*. Shows naming overlap within the same retailer. |
| `WP03-PB-REFRESH-20261010-S08` | Healthy Planet, [Oak Manor pot barley product page](https://www.healthyplanetcanada.com/fr/oak-manor-barley-pot-organic-1kg.html) | Indexed French title uses *orge en pot*; its snippet identifies the ingredient as *orge mondé*. Candidate market wording, but inconsistent page terminology and no detailed process label. |
| `WP03-PB-REFRESH-20261010-S09` | FoodServiceDirect.ca, [Agrofusion Orge en pot listing](https://www.foodservicedirect.ca/fr-CA/foods/rice-grains/barley/barley.html) | Current indexed product listing uses *Orge En Pot* and separates it from *Orge Perlé*. Product title only; no technical definition or hulled-barley comparison. |

## Source-access limits

OQLF, the English federal specification, Loblaws, and the OnlineOrganics pot-barley page opened directly. TERMIUM's indexed record returned the relevant current entry, but a direct open returned a cache-miss error during this review. Healthy Planet and FoodServiceDirect product pages were available only as search-indexed snippets; their direct page opens also returned cache-miss errors. Their wording is retained as weak market evidence, not treated as proof of a standardized Québec term. The current evidence does not justify lifting the hold.
