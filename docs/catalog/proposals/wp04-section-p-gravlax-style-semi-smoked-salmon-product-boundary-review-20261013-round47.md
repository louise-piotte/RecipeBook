# WP04 Section P — gravlax-style semi-smoked salmon product-boundary review (round 47)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** Proposal-only Canadian/Québec product naming, active ownership, picker, bundled-recipe demand, and numeric/substitution review.
- **Recommendation:** Hold the Grizzly `gravlax-style semi-smoked Atlantic salmon` SKU outside active references and forms. Its Québec product wording names a processed, semi-smoked item, while OQLF's preferred term `gravlax` describes raw salmon macerated with seasonings. No bundled recipe requests either product. Add no active identity, alias, form, measure, density, unit mapping, recipe link, conversion, yield, substitution, or ledger candidate now.
- **Write scope:** This proposal file only. No shared catalog, ledger, checklist, roadmap, recipe, code, or batch README was changed. No tests were run.
- **New source-ID prefix:** `WP04-SECTIONP-GRAVLAX-20261013-R47-`. The prefix and product candidate ID were absent from the live ledger and checked archive before this packet; source IDs below remain local to this proposal.

## Bounded gap and decision

The open [preservation-state checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4207) leaves named fish products for exact review. The existing [preserved-fish review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md) defers generic smoked/cured forms without recipe demand. This packet reviews one separate, currently listed Québec product boundary: Fumoir Grizzly's **gravlax-style semi-smoked Atlantic salmon**, listed in French as **saumon atlantique mi-fumé tranché style Gravlax**. The Grizzly listing is a distinct prepared product, not a species identity or a general form for salmon. It is outside the adjacent [herring rollmops review](wp04-section-p-herring-rollmops-product-boundary-review-20261013-round45.md) and [Sardo marinated-mussels review](wp04-section-p-sardo-marinated-mussels-product-boundary-review-20261013-round46.md).

OQLF's preferred Québec word is **gravlax** (also the English term). Its definition is a Scandinavian dish of thin slices of raw salmon macerated with salt, sugar, white pepper, and dill. Québec's food-safety guidance likewise describes gravlax generally as raw marinated or dry-brined fish. In contrast, Grizzly's current product is specifically labeled semi-smoked, and its ingredient declaration includes Atlantic salmon, sugar, salt, herbs, bacterial culture, and natural wood smoke. The maker calls it `style Gravlax`; that marketing qualifier does not establish that this SKU is the same product state as the OQLF-defined raw preparation. Do not use bare `gravlax` as an alias for this semi-smoked SKU, call the product fermented based only on “bacterial culture,” or generalize its recipe and package details to all gravlax or smoked salmon. [S01–S04]

Keep both the general gravlax term and this exact SKU out of the catalog pending a bundled recipe or confirmed import. A future request should determine whether it means raw cured gravlax, the Grizzly semi-smoked product, or another gravlax-style product before choosing a name or owner.

## Naming and product boundary

| Wording or evidence | What it supports | Limit |
|---|---|---|
| **gravlax** | OQLF's preferred Québec term and English equivalent for the named Scandinavian salmon dish. OQLF describes raw salmon slices macerated in salt, sugar, white pepper, and dill. [S01] | This is not evidence that every product marketed “gravlax style” follows that definition. OQLF discourages `gravad lax` and `gravlaks` in French; do not add them as Québec aliases. |
| **saumon atlantique mi-fumé tranché style Gravlax** / **Gravlax style half-smoked sliced Atlantic salmon** | MAPAQ's Québec food directory title for one Grizzly product, GTIN `775200007202`; it classifies the item as prepared/processed fish. The maker's French and English product pages identify the same semi-smoked, 100 g item. [S03–S04] | These are exact product labels, not synonyms for raw gravlax, plain Atlantic salmon, generic smoked salmon, or all Gravlax-style products. |
| **Grizzly Gravlax** | The manufacturer's short name for its own product and recipe ingredient. Its ingredient list includes bacterial culture and natural wood smoke. [S04–S05] | A brand/product name does not define a reusable preparation or one universal formulation. The source does not explain the culture or establish a general fermentation process. |
| **Atlantic salmon / saumon atlantique** | The exact species-qualified salmon wording on the product record and manufacturer's page. [S03–S04] | Do not turn this single processed SKU into an active Atlantic-salmon identity or map it to the existing unqualified `salmon fillets` reference. |

The product directory lists a 100 g package and nutrition facts per package, but its record says to keep it frozen before use, while the manufacturer's current product page says it is available in refrigerated counters and says not to refreeze. These are product-record and sales-channel details, not one universal storage state. The product is presented as a finished, sliced item; its exact cure, microbial culture, smoking method, and state after thawing are not established well enough to model as a general salmon form. [S03–S04]

## Exact ownership audit

The live package contains **1,372 ingredient references**, **100 forms**, **64 legacy candidates**, and **1,702 research-ledger records** with **6,658 source entries / 5,582 distinct source IDs**. Exact terms were checked after normalizing active reference names and aliases, form labels and match terms, and legacy candidate names and aliases. The research ledger, current plan, roadmap, proposals, and batch notes were also searched for the product terms, GTIN, candidate ID, and new source-ID prefix.

| Exact term or owner | Current owner and effect |
|---|---|
| `ingredient-ref-salmon-fillets-without-skin` | Active `PROTEIN` reference **salmon fillets / filet de saumon**; no aliases, forms, density, or unit mappings. This is the only active reference returned today by broad `salmon` and `saumon` searches. It does not specify species, cure, smoking, or Gravlax preparation. |
| `candidate-wp04-salmon-species-scope` | Ledger-only candidate with `identityState: needs_clarification`; existing decisions keep the generic salmon-fillets row from being mapped to a species. It does not own the Grizzly product. |
| `candidate-salmon-roe` | Separate unresolved roe candidate. It does not own a salmon-flesh product, Gravlax, or the Grizzly SKU. |
| `gravlax`; `Gravlax style semi-smoked sliced Atlantic salmon`; `saumon atlantique mi-fumé tranché style Gravlax`; GTIN `775200007202` | No exact active reference, form, legacy candidate, or dedicated ledger product record owns these terms or this SKU. No exact Gravlax product proposal or R47 source-ID prefix existed in the checked archive. |

No forms are attached to the current salmon reference. The fact that its one bundled recipe row requests 675 g of salmon fillets does not identify the Grizzly SKU, species, or preserved state. This proposal does not create a second salmon row or a product-specific ledger candidate.

## Picker/search projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase/NFKD normalization, fold `œ`/`æ`/`ß` and `&`, remove accents, normalize punctuation and spaces, prefer complete word-phrase matches, and use substring matching only if no phrase matches.

For impact analysis only, the hypothetical bilingual row uses the Québec directory's exact product titles: English **Gravlax style half-smoked sliced Atlantic salmon** and French **saumon atlantique mi-fumé tranché style Gravlax**, with no aliases or forms. This is not a request to integrate the row.

| Query | Current results | With hypothetical product row |
|---|---|---|
| `gravlax`; exact English or French product title | No result | The product row only. |
| `Atlantic salmon`; `saumon atlantique` | No result | The product row only. |
| `salmon`; `saumon` | Salmon fillets | Salmon fillets and the semi-smoked product. |
| `smoked salmon`; `saumon fumé` | No result | Still no result: those complete phrases do not occur contiguously in the product titles. |
| `half-smoked`; `mi-fumé` | No result | The product row only. |
| `smoked` | Five unrelated smoked-meat, smoked-paprika, smoked-salt, and smoked-tofu references | The same five plus the semi-smoked salmon product. |
| `fumé` | Three unrelated smoked-paprika, smoked-salt, and smoked-tofu references | The same three plus the semi-smoked salmon product. |

An exact `gravlax` row would make the current no-result query return the Grizzly semi-smoked product even though OQLF's name points to raw-cured salmon. The full title would also add that product to broad salmon searches and broad smoke-term results. This conflation risk and lack of bundled demand support holding both the generic product term and the exact SKU outside the picker.

## Bundled recipe demand

The complete manifest-listed corpus contains **114 recipe files and 1,123 ingredient rows**. Every full recipe JSON text and ingredient row was scanned for `gravlax`, `gravad lax`, `gravlaks`, `semi-smoked`, `half-smoked`, `mi-fumé`, the exact bilingual product titles, and `Atlantic salmon` / `saumon atlantique`. The scan found **zero matching ingredient rows and zero matching recipe files**. [R01]

A separate broad salmon search found one ingredient row: Recipe 077, ingredient 10, `675 g salmon fillets without skin, cut into cubes`, linked to `ingredient-ref-salmon-fillets-without-skin` ([recipe file](../../../app/src/main/assets/seed/bundled-library/recipes/077-pate-au-saumon-salmon-pot-pie-b8e3b67d-3a62-4e68-8842-457c86bbab5f.v1.json)). That row requests generic cubed fillets; it contains no Gravlax, smoking, marinating, or species-specific wording and must not be linked to this product.

Grizzly's own separate recipe **Salade Gravlax, melon et fraise** uses `1 paquet de Gravlax Grizzly` for four portions. This is evidence of a manufacturer-specific recipe use, not demand in the bundled library. The bundled corpus itself supplies no request, recipe link, cooking method, role, or quantity for Gravlax or this semi-smoked SKU. [S05, R01]

## Numeric and substitution limits

| Evidence | Bounded interpretation |
|---|---|
| MAPAQ product record: 100 g package/net content and nutrition facts per package; GTIN `775200007202`. [S03] | One SKU/package observation only. It is not a universal Gravlax package size, serving amount, volume measure, density, yield, or default for other salmon products. |
| Grizzly's salad recipe: one package for four portions; the matched product record lists that manufacturer's 100 g product. [S03, S05] | For this one manufacturer recipe and package, the paired evidence implies 100 g / 4 = **25 g per recipe portion**. Keep that as source-specific arithmetic only; it is not a recommendation or general portion rule. |
| Grizzly's separate tart recipe: 150 g Gravlax for 4–6 portions. [S06] | The recipe does not identify the 100 g GTIN or say that it uses this semi-smoked SKU, so do not combine it with the MAPAQ package data or treat it as another measurement for this product. |
| Product ingredients and pack information. [S03–S04] | No volume, density, edible fraction, draining instruction, rehydration/cooking yield, or standard household measure is given. Add none. |

No reviewed source or bundled recipe supports replacing this product with fresh salmon fillets, generic smoked salmon, plain gravlax, another smoked fish, rollmops, or any seafood at a fixed ratio. The maker's recipe uses its own Gravlax product and gives no substitution. Add no global form conversion, contextual substitution, warning, recipe-line substitution, package yield, or cooking yield. [S05, R01]

## Next action

Hold the exact Grizzly SKU and bare `gravlax` outside active references and forms; leave the existing generic salmon-fillets reference and held salmon-species candidate unchanged. Reopen when a bundled recipe or confirmed import identifies raw-cured gravlax or this exact semi-smoked SKU. Then check the requested product label and determine whether a distinct finished-product identity is justified; do not infer a form, species identity, measure, or substitution from the product's marketing name.

## Source register

Online sources were accessed or rechecked on 2026-10-13. New IDs are local to this proposal and are not ledger entries.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-GRAVLAX-20261013-R47-S01** | Office québécois de la langue française, [GDT: gravlax](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502314/gravlax), definition, preferred French term, English terms; last updated 2010. | Supports French and English `gravlax` and defines the named dish as raw salmon slices macerated with salt, sugar, white pepper, and dill. OQLF discourages `gravad lax` and `gravlaks` in French. This is terminology and product-definition evidence, not a processing standard for the Grizzly SKU. |
| **WP04-SECTIONP-GRAVLAX-20261013-R47-S02** | Gouvernement du Québec, [Préparation sécuritaire du gravlax](https://www.quebec.ca/sante/alimentation/salubrite-aliments-prevention-risques/etablissements-alimentaires/precautions-aliments-dangereux/poisson/gravlax), opening definition; last updated 2025-02-05. | Describes gravlax generally as raw fish marinated or dry-brined and classified as raw. Cited here only for product-state distinction; the guidance does not identify the Grizzly SKU or supply a recipe measure. |
| **WP04-SECTIONP-GRAVLAX-20261013-R47-S03** | Gouvernement du Québec / MAPAQ, [Québec Food Directory product sheet: saumon atlantique mi-fumé tranché style Gravlax](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8206019), product name, GTIN `775200007202`, package, ingredient, nutrition, storage, and product-category fields; last updated 2026-04-09. | Records the exact 100 g Grizzly prepared/processed fish product and ingredients including Atlantic salmon, sugar, salt, herbs, bacterial culture, and natural wood smoke. Nutrition facts are per package. Its frozen-storage field is product-record context, not a universal Gravlax storage rule or recipe conversion. |
| **WP04-SECTIONP-GRAVLAX-20261013-R47-S04** | Fumoir Grizzly, [French product page](https://grizzly.qc.ca/produits/saumon-atlantique-mi-fume-style-gravlax-refresh/) / [English product page](https://grizzly.qc.ca/en/products/gravlax-style-semi-smoked-atlantic-salmon-refresh/), product name, format, ingredients, and purchase information. | Current manufacturer pages use the bilingual semi-smoked product wording, list 100 g, describe a Scandinavian-style marinade and light smoke, and identify the ingredients and retail outlets. They do not establish a standardized Gravlax formula, recipe conversion, or species-wide preservation form. |
| **WP04-SECTIONP-GRAVLAX-20261013-R47-S05** | Fumoir Grizzly, [Salade Gravlax, melon et fraise](https://grizzly.qc.ca/recettes/salade-gravlax-melon-et-fraise/), ingredient list and yield. | Manufacturer recipe uses one package of Grizzly Gravlax for four portions. This is external product-specific recipe evidence; it is not a bundled RecipeBook demand or universal serving size. |
| **WP04-SECTIONP-GRAVLAX-20261013-R47-S06** | Fumoir Grizzly, [Tarte fine gravlax et yogourt à l'aneth](https://grizzly.qc.ca/recettes/tarte-fine-gravlax-saumon-yogourt-aneth/), ingredient list and yield. | Lists 150 g Gravlax for four to six portions but does not identify the 100 g GTIN or exact semi-smoked SKU. Do not treat it as a second exact-product quantity. |
| **WP04-SECTIONP-GRAVLAX-20261013-R47-R01** | [Bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), and current plan/proposal archive. | Static exact-owner, picker, and corpus audit: 1,372 references, 100 forms, 64 legacy candidates, 1,702 ledger records, and 114 recipes / 1,123 ingredient rows. The ledger has 6,658 source entries / 5,582 distinct source IDs. The ordered recipe-corpus digest is `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`. Exact Gravlax product keys and this source-ID prefix were absent before the proposal. |

The proposal assigns source IDs S01–S06 and audit ID R01 under the unique R47 prefix. No shared catalog, ledger, checklist, roadmap, recipe, code, or batch file was changed.
