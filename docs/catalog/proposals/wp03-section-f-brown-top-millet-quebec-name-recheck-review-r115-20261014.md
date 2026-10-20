# WP03 Section F R115 — brown-top millet Québec naming recheck

## Packet record

- **Reviewed:** 2026-10-14.
- **Status:** Integrated by root on 2026-10-14 as a documentation-only hold. The *Urochloa ramosa* candidate remains unallocated, with no catalog or ledger data changed. See the [R115 batch README](../batches/wp03-section-f-brown-top-millet-quebec-name-recheck-integration-20261014/README.md).
- **Scope:** recheck the ledger-only brown-top millet candidate (*Urochloa ramosa*) against newer Canadian French retail wording, Québec terminology, current picker ownership, and the complete bundled recipe corpus.
- **Recommendation:** **hold active allocation**. Canadian French product copy now pairs a `Browntop Millet` SKU with `millet brun` and `Korale`, but the listing is from an Ottawa retailer, its direct page fetch is unavailable, and the same French phrase is used for *Panicum miliaceum* in a French retail product. The Québec terminology source remains generic and does not name *U. ramosa*. No safe, exact fr-CA display is established.

This is a distinct millet-species naming review, separate from the recent [R112 dried-sweet-corn review](wp03-section-f-dried-sweet-corn-identity-review-r112-20261014.md#L1), [R114 pozole-corn review](wp03-section-f-pozole-corn-product-boundary-review-r114-20261014.md#L1), and the earlier [ordinary corn-grits boundary review](wp03-section-f-ordinary-corn-grits-boundary-review-20261010.md#L1). It rechecks the held brown-top candidate because a newer Canadian French product listing surfaced after the [2026-10-10 brown-top review](wp03-section-f-next-grains-coverage-review-20261010.md#L1).

## Plan and prior decision

The aggregate Section F checklist remains open at [plan lines 519–520](../../RecipeBook-global-ingredient-catalog-plan.txt#L519). The plan already records a focused brown-top millet hold at [lines 613–617](../../RecipeBook-global-ingredient-catalog-plan.txt#L613): the species and English product identity were supported, while the Québec French display was unresolved. This source refresh does not change that decision or the shared plan.

The separate brown-top flour candidate remains held in WP02 A6; the [integration note](../batches/wp02-a6-brown-top-millet-flour-hold-integration-20261012/README.md#L1) warns that `farine de millet brun` is also used for a *Panicum miliaceum* flour product. The grain candidate here must not absorb flour, mixed-grain flour, or a maker-specific activated flour.

## Identity and product boundary

The current FSSAI cereal standard includes Brown top (Korale), *Urochloa ramosa*, among millets meant for human food, with the standard scoped to whole or dehulled grains [S01]. The ICAR–Indian Institute of Millets Research handbook also uses `Brown-top millet`, records older scientific names, and lists Korale (Kannada) and Andukorralu (Telugu) as vernacular names [S02]. The current taxonomic name in FSSAI and EPPO is *Urochloa ramosa*; retain *Brachiaria ramosa* and *Panicum ramosum* only as source synonyms.

If later allocated, this identity would cover edible food-grade grain of *U. ramosa*. Keep it separate from generic millet, common/proso millet (*Panicum miliaceum*), other millet species, planting seed, forage or bird feed, flour, and composite grain products. FSSAI and a Canadian grocery listing support the food-grain concept, but neither establishes one Canadian or Québec product specification.

## Current catalog, forms, ledger, and picker ownership

The current split seed snapshot has **1,457 ingredient references** and **105 ingredient forms**; the research ledger has **1,797 records**. The [legacy import identity file](../legacy-import-identities.v1.json) lists **63 candidates**. Counts are a read-only snapshot of the shared worktree on 2026-10-14.

| Current owner | Live state | Boundary |
| --- | --- | --- |
| `ingredient-ref-millet` | `millet / millet`, `GRAIN_AND_CEREAL`; no aliases, density, or unit mappings | Broad millet choice. Do not add brown-top names here. |
| `ingredient-ref-common-millet` | `common millet / millet commun`, `GRAIN_AND_CEREAL`; English aliases include `proso millet`, `chena`, `barri`, `cheno`, `cheena`, `cheena millet`, and `panivaragu` | Separate *Panicum miliaceum* identity. Do not merge it with *U. ramosa*. |
| `ingredient-ref-millet-flour` | `millet flour / farine de millet`, `FLOUR_AND_STARCH` | Generic milled product; not a grain alias. |
| `candidate-brown-top-millet` in the research ledger | Ledger-only `candidate`; `identityState: needs_clarification`; `measurementState: researched_no_supported_value`; `substitutionResearchState: not_yet_researched`; seven prior source entries | Sole current research owner for this named grain candidate. It is not an active picker reference. |

No active reference, form, or legacy phrase owner was found for `brown top millet`, `brown-top millet`, `browntop millet`, `millet brun`, `millet à tête brune`, `panic rameux`, `Korale`, `Urochloa ramosa`, `Brachiaria ramosa`, `Andukorralu`, or `Hari Kangni`. The candidate ID `ingredient-ref-brown-top-millet` is unused. No millet-named form occurs in the live form file. Both global and contextual substitution-rule files currently contain zero rules.

The current [ingredient search implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9) folds accents and punctuation, returns complete normalized name/alias/form phrases first, then falls back to substring matches; the ledger is not a picker source. Static projection over current reference names, aliases, and form terms gives:

| Search text | Current phrase result |
| --- | --- |
| `brown top millet`; `brown-top millet`; `browntop millet` | None |
| `millet brun`; `millet à tête brune`; `panic rameux` | None |
| `Korale`; `Andukorralu`; `Hari Kangni`; `Urochloa ramosa` | None |
| `millet` | 20 references, including broad, species-specific, flour, flakes, and other millet products |

The qualified candidate phrases are not currently owned. The broad `millet` query is intentionally multi-result and does not resolve a species.

## Canadian and Québec naming evidence

The new Canadian French listing is meaningful but not enough to clear the Québec display gate. Spice Divine’s French product page is indexed with the title `Millet Browntop S&V 1 kg`; its description calls the item `millet brun SV` and says it is locally known as `Korale` [S04]. The retailer’s pickup page places the shop in Ottawa, Ontario. On 2026-10-14 the listing appeared in search results, but opening the product page returned a cache-miss error. The indexed copy is useful as a Canadian French wording attestation, not as a directly verified package label, botanical species declaration, Québec term ruling, or current stock claim.

Indian Grocers Canada independently lists `S&V BrownTop Millet` as a 1 kg grocery product in Burlington, Ontario [S03]. Its direct page confirms the English spelling and market product context, but gives no scientific name or French label. Shastha Canada’s millet collection also lists Brown Top Millet grains as a 500 g product, currently marked out of stock [S05]. Package size and inventory are volatile retail details, not ingredient measures.

The OQLF GDT entry for generic `millet` prefers `millet`, `mil`, and `petit mil`, and explicitly says the generic covers multiple species and may also abbreviate a particular species [S06]. The separate OQLF entry for `millet commun` identifies *Panicum miliaceum* and prefers `millet commun` (as well as generic `millet` and `mil`) [S07]. Neither OQLF entry identifies *U. ramosa* or approves `millet brun` or `millet à tête brune` for this food grain.

Other French sources do not converge: SimplyMillets uses `millet brun / Korale` for *U. ramosa*, while the international Crop4HD crop list uses `millet à tête brune` [S08–S09]. EPPO records `panic rameux` as the French common name for the plant species [S10]. These are useful species/name evidence, but none is a Québec human-food label. `Panic rameux` is a plant common name, not a demonstrated consumer name for grain.

The lexical collision is concrete: Naturalia’s French product page names a `farine de millet brun` and declares *Panicum miliaceum* as its ingredient [S11]. This is not a Québec product and it is flour rather than whole grain, so it does not establish Québec usage; it does show that an unqualified `millet brun` can denote another species and product state in French food retail. A Québec product-label or terminology review must disambiguate that wording before it becomes a picker display or alias.

### Proposed bilingual names

| Field | Recommendation now |
| --- | --- |
| Disposition | Hold `candidate-brown-top-millet` in the ledger; do not create an active reference. |
| Conditional English display | `brown top millet` |
| Conditional English aliases | `brown-top millet`; `browntop millet` |
| fr-CA display | None approved. The current Canadian French `millet brun` wording is source-attested for one Ottawa SKU but is not yet a safe Québec-wide ingredient label. |
| French aliases | None. Keep `millet brun`, `millet à tête brune`, and `panic rameux` inactive for this row pending a Québec naming decision. |
| Regional and generic names | Do not add `Korale`, `Andukorralu`, `Hari Kangni`, `millet`, `mil`, `brown millet`, or `millet rice` as aliases in this pass. |
| Category if later accepted | `GRAIN_AND_CEREAL`; `defaultDensity: null`; `unitMappings: []`. |

Do not use `millet brun` as an unqualified canonical French name solely because one Canadian retailer pairs it with a BrownTop SKU. The source is not Québec-based, the displayed title remains English, and the exact French wording is not species-exclusive in the evidence reviewed. Keep the competing French candidates in research notes, not picker ownership.

## Complete bundled recipe audit

The current manifest lists **114 recipe files** with **1,123 structured ingredient rows**. Every manifest-listed recipe and ingredient row was scanned for `brown top millet`, `brown-top millet`, `browntop millet`, `millet brun`, `millet à tête brune`, `panic rameux`, `Korale`, `Urochloa ramosa`, `Brachiaria ramosa`, `Andukorralu`, and `Hari Kangni`: **zero recipe files and zero rows matched**. A separate whole-word scan found zero generic `millet` or `mil` rows. No bundled recipe requires a link, amount, form, or alias for this candidate.

## Numeric, form, and substitution limits

- **Measurements:** retain the ledger’s `researched_no_supported_value` state. Retail package sizes of 500 g or 1 kg (and a separate seller’s 1 lb listing) are package quantities, not cups, servings, or mass-volume mappings. FSSAI moisture and grain-quality limits are regulatory specifications; they are not recipe quantities [S01, S03, S05].
- **Forms and yield:** add no forms, dry/cooked conversion, dehulled-to-whole mapping, cooking ratio, or yield. FSSAI’s whole/dehulled scope supports the commodity boundary, but does not supply a home-cooking state model. IIMR’s seed rate, field yield, and processing loss apply to cultivation/processing in its agronomic context, not a kitchen serving conversion [S02].
- **Substitution:** keep the current `not_yet_researched` ledger state and add no global or contextual rule. A Canadian retailer’s `Brown Top Millet Rice` page says to use the product like rice, but gives no transferable amount or tested interchangeability ratio [S12]. Do not alias the grain to rice or infer a recipe substitution from a use suggestion.
- **Recipe links:** add none; the complete bundled corpus has no candidate demand.

## Sources

All sources were checked or rechecked on **2026-10-14**. Search-index-only evidence and inaccessible direct pages are identified in the limits column; no volatile price or stock statement is used as identity evidence.

| Source ID | Source and locator | Supports / does not support |
| --- | --- | --- |
| `WP03-BTM-R115-20261014-S01` | Food Safety and Standards Authority of India, [Food Safety and Standards Regulations, Chapter 2.4: Cereals and Cereal Products](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), Version 4 dated 2025-05-07, §2.4.6(23), PDF pp. 16–18. | Directly lists Brown top (Korale) — *Urochloa ramosa* under whole/dehulled millet standards. This is an Indian food standard and species/product-scope anchor, not Québec terminology, a recipe measure, or substitution evidence. |
| `WP03-BTM-R115-20261014-S02` | ICAR–Indian Institute of Millets Research, [Latest Millet English Book](https://www.millets.res.in/farmer/Latest_Millet_English_Full_Book_2020.pdf), 2020, ch. 13, pp. 57–58. | Uses `Brown-top millet`, lists *Brachiaria ramosa* and *Panicum ramosum* as older names, and gives Korale (Kannada) and Andukorralu (Telugu). Agronomy/processing context only; field and seed figures are not kitchen measures. |
| `WP03-BTM-R115-20261014-S03` | Indian Grocers Canada, [S&V BrownTop Millet](https://indiangrocerystore.ca/products/s-v-browntop-millet), product page, Burlington, Ontario; opened 2026-10-14. | Direct page title, grocery category, Burlington address, and 1 kg package support a current Canadian English food-grocery listing. No species declaration, French name, recipe quantity, or measure. |
| `WP03-BTM-R115-20261014-S04` | Spice Divine, [Millet Browntop S&V 1 kg](https://spicedivine.ca/fr/products/sv-browntop-millet-1kg), French product page; [pickup page](https://spicedivine.ca/fr/pages/in-store-purchase-pickup) gives Ottawa, Ontario. | Search-indexed product copy pairs `Browntop` with `millet brun` and `Korale`. Direct product-page retrieval returned cache miss on 2026-10-14; use only as indexed Canadian French seller wording, not a verified package label, species declaration, Québec term, or availability claim. |
| `WP03-BTM-R115-20261014-S05` | Shastha Canada, [Millet Grains & Grits](https://shasthacanada.com/collections/millet-grains-grits), Brown Top Millet grains listing; opened 2026-10-14. | Canadian collection lists a 500 g Brown Top Millet grain item and marks it out of stock. The package mass is not a kitchen measure; no French term or current availability claim is inferred. |
| `WP03-BTM-R115-20261014-S06` | OQLF, [GDT: millet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet), last updated 2010. | Preferred French terms `millet`, `mil`, and `petit mil`; notes `millet` is a generic for several species and may be an abbreviation for a particular species. Does not name brown-top millet. |
| `WP03-BTM-R115-20261014-S07` | OQLF, [GDT: millet commun](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506451/millet-commun), last updated 2010. | Identifies *Panicum miliaceum* and gives preferred `millet commun`. Species terminology only; does not name *U. ramosa* or approve `millet brun` for it. |
| `WP03-BTM-R115-20261014-S08` | SimplyMillets, [Guide des millets](https://simplymillets.com/fr), section `Explorer les 9 millets`. | French-language guide uses `millet brun / Korale` for *U. ramosa*. Non-Québec web guide, not an OQLF decision or Québec retail label. |
| `WP03-BTM-R115-20261014-S09` | Alliance Bioversity International / CIAT, [CROPS4HD project page](https://alliancebioversityciat.org/fr/projets/crops4hd-consommation-resiliente-cultures-orphelines-produits-dietetiques-sains), French crop list. | Uses `millet à tête brune` in an international crop list. Not a Québec product label; direct page fetch was unavailable in this review. |
| `WP03-BTM-R115-20261014-S10` | EPPO Global Database, [Urochloa ramosa (PANRA)](https://gd.eppo.int/taxon/PANRA), common-name list and taxonomy. | Current taxon record maps English `browntop millet` and French `panic rameux` to *U. ramosa* and records older synonyms. Botanical common name only, not a Québec food display. |
| `WP03-BTM-R115-20261014-S11` | Naturalia, [Farine de millet brun 500 g bio](https://www.naturalia.fr/produit/farine-millet-brun-500g), ingredient statement. | Current French retail page declares `farine de millet brun (Panicum miliaceum)`. This is France, not Québec, and a flour product; it demonstrates competing French usage but cannot settle the Québec grain name. |
| `WP03-BTM-R115-20261014-S12` | Ceylon Groceries, [Brown Top Millet Rice — Unpolished](https://ceylongroceries.com/collections/featured-products/products/brown-top-millet-rice), indexed product text. | Search-indexed seller copy says to use the product like rice and recommends soaking. Direct page retrieval returned cache miss; this is a seller suggestion without a cooking ratio, not a measure or substitution rule. |

## Review disposition

Keep `candidate-brown-top-millet` ledger-only and unresolved. Conditional English display and orthographic aliases are `brown top millet` / `brown-top millet`, `browntop millet`; no French display or aliases are approved by this recheck. The newer Canadian French seller wording is useful evidence, but its non-Québec source and the competing meaning of `millet brun` do not establish a safe fr-CA picker label. Add no active row, form, measure, recipe link, conversion, yield, or substitution, and leave the aggregate Section F checklist open.
