# WP04 Section P — Sardo marinated-mussels product-boundary review (round 46)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** Proposal-only Canadian/Québec product naming, active ownership, picker, bundled-recipe demand, and numeric/substitution review.
- **Recommendation:** Hold Sardo herb-and-garlic marinated mussels outside active references and forms until a bundled recipe requests this product. Add no active identity, alias, form, measure, density, unit mapping, recipe link, conversion, yield, substitution, or ledger candidate now.
- **Write scope:** This proposal file only. No shared catalog, ledger, checklist, roadmap, recipe, code, or batch README was changed. No tests were run.
- **New source-ID prefix:** `WP04-SECTIONP-MARINATED-MUSSELS-20261013-R46-`. The prefix was absent from the live ledger and checked archive before this packet; source IDs below remain local to this proposal.

## Bounded gap and decision

The open [shellfish checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4129) and [preservation-state checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4207) leave product-state questions open. The existing [blue-mussel identity review](wp04-blue-mussel-identity-review-20261011.md) accepted only the *Mytilus edulis* identity and kept generic mussel wording unresolved. The broader [preserved-fish review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md) rejected universal preservation forms without an exact recipe or product request. This packet reviews one product-specific boundary not decided in those packets or the adjacent [rollmops review](wp04-section-p-herring-rollmops-product-boundary-review-20261013-round45.md): **Sardo herb-and-garlic marinated mussels**.

Sardo's current Canadian product page names **Select Herb & Garlic Marinated Mussels** and lists mussels, canola oil, garlic, lemon flavour, parsley, water, salt, vinegar, lactic acid, and calcium chloride. Québec retailer Super C lists the same product number in French as **Moules marinées aux herbes et à l'ail, Premium Select** and in English as **Herb and Garlic Marinated Mussels, Premium Select**. The manufacturer and retailer establish a real finished product, bilingual market wording, and a multi-ingredient marinade. They do not identify the mussel species. [S01–S04]

Keep the exact product unallocated until a bundled recipe selects it. Do not turn the retailer's full product title into an identity for all marinated mussels, use bare `moules` or `mussels` as aliases, or assign this Sardo SKU to blue mussel / *Mytilus edulis*. The Québec OQLF entry maps its normalized food-mollusc term `moule` specifically to blue mussel / *M. edulis*; DFO identifies blue mussel as the single mussel species harvested in Canada, but neither fact supplies the missing species or catch-origin statement for this branded product. The label's “Product of Canada” / Canadian product-region wording is not a species identification. [S05–S06]

This is distinct from herring rollmops: that packet addresses a vinegar-marinated herring fillet rolled around a pickle, while this review concerns a manufacturer-named, herb-and-garlic seasoned mussel product. Do not infer a shared recipe use or substitution from the common word `marinated`.

## Naming and product boundary

| Wording or evidence | What it supports | Limit |
|---|---|---|
| **Select Herb & Garlic Marinated Mussels** | Sardo's manufacturer product title and English ingredient list. [S01] | One finished product with a stated marinade; it does not identify a biological mussel species or generalize to other marinated mussels. |
| **Herb and Garlic Marinated Mussels, Premium Select** | Current Super C English listing, product no. `055823086458`. [S03] | Retail title for the Sardo SKU, not a common-name standard or recipe line. |
| **Moules marinées aux herbes et à l'ail, Premium Select** | Current Québec Super C French listing for the same product number; ingredient declaration begins `moules`. [S02] | Retail product wording, not an OQLF-normalized generic name or species assignment. Keep the full phrase together if a later recipe explicitly requests this product. |
| **moule / blue mussel / *Mytilus edulis*** | OQLF's preferred Québec commercial name and its specified taxon. DFO also names blue mussel as the single mussel species harvested in Canada. [S05–S06] | These sources do not say that Sardo's product uses this species. Do not map the product to the active blue-mussel identity from Canadian-origin wording alone. |

Sardo's ingredient list makes this a seasoned mixture rather than plain mussel flesh. The product page describes it as an appetizer or seafood-platter component and possible main-meal ingredient, but does not establish an intended recipe, species, drained state, or universal marinade formula. Keep it separate from fresh blue mussels, green-lipped mussels, unqualified mussels, smoked mussels, rollmops, and other marinated seafood. [S01]

## Exact ownership audit

The live package contains **1,370 ingredient references**, **100 forms**, **64 legacy candidates**, and **1,700 research-ledger records** with **6,651 source entries / 5,575 distinct source IDs**. Exact terms were checked after normalizing active reference names and aliases, form labels and match terms, and legacy candidate names and aliases. The review also checked ledger text/source IDs, prior proposals, batch notes, and the live checklist.

| Exact term or owner | Current owner and effect |
|---|---|
| `ingredient-ref-blue-mussel` | Active `PROTEIN` reference **blue mussel / moule**, with English alias `blue mussels` and French aliases `moule bleue`, `moules bleues`. No forms are attached. This identity is scoped to *Mytilus edulis*. |
| `ingredient-ref-green-lipped-mussel` | Active `PROTEIN` reference **green-lipped mussel / moule verte**. No aliases or forms are attached. It remains separate from blue mussel. |
| `ingredient-ref-mussel` | Ledger-only candidate with `identityState: needs_clarification`; existing decisions leave unqualified mussel wording unresolved. It is not an active reference and does not own this Sardo product. |
| `herb and garlic marinated mussels`; `marinated mussels`; `moules marinées aux herbes et à l'ail`; `moules marinées` | No exact active reference, form, legacy candidate, or dedicated ledger product record owns these terms. No exact Sardo product proposal or matching source ID existed in the checked archive. |

The legacy import file contains 64 candidates; its only seafood-text match in this audit is an unrelated oyster-sauce candidate, with no mussel or marinated-mussel key. No forms are attached to either active mussel species reference or to the unresolved generic candidate. The shared ledger's `ingredient-ref-mussel` candidate retains the earlier generic-species evidence and decisions; this proposal does not append a second record or change that decision.

## Picker/search projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase/NFKD normalization, fold `œ`/`æ`/`ß` and `&`, remove combining marks, normalize punctuation and spaces, prefer complete word-phrase matches, and use substring matching only if no phrase matches.

For impact analysis only, the hypothetical row uses English display **Herb and Garlic Marinated Mussels** and Québec French display **Moules marinées aux herbes et à l'ail**, with no aliases or forms. This is not a request to integrate a row.

| Query | Current results | With hypothetical row |
|---|---|---|
| `mussel` | Blue mussel; green-lipped mussel | The same two; the proposed plural `mussels` term does not match singular `mussel` under phrase-first search. |
| `mussels` | Blue mussel | Blue mussel; herb-and-garlic marinated mussels. |
| `moule` | Blue mussel; green-lipped mussel | The same two; the candidate uses the plural `moules`. |
| `moules` | Blue mussel | Blue mussel; herb-and-garlic marinated mussels. |
| `marinated mussels`; `moules marinées`; full bilingual product phrases | No result | The hypothetical product only. |

Adding the row would make the exact Sardo-style product phrase searchable, but it would also turn both current plural searches `mussels` and `moules` into two-result queries containing a prepared, seasoned product beside species-level rows. The singular search results would stay at two because the display uses plural terms. Keep this product out of the picker until recipe demand clarifies whether the requested product is this finished SKU or plain mussels.

## Bundled recipe demand

The complete manifest-listed corpus contains **114 recipe files and 1,123 ingredient rows**. Every full recipe JSON text and ingredient row was scanned for `mussel`, `mussels`, `moule`, `moules`, `marinated mussels`, `moules marinées`, the bilingual product phrases, and the product number. The scan found **zero matching ingredient rows** and no recipe-text request for mussels or the marinated product. The 13 text matches for French plural `moules` occur in baking-pan instructions; they are not seafood references. [R01]

The bundle therefore supplies no recipe name, cooking method, ingredient role, or requested quantity that would support a new product identity, recipe link, form, or substitution. Existing seafood recipe rows for crab or calamari do not imply mussel demand.

## Numeric and substitution limits

The Québec retailer lists a **250 ml** package, and Voilà's listing displays the nutrition serving as **10 pieces (55 g)** for the same branded item. Treat these as product-specific retail evidence only. The 250 ml is package volume for a product containing both mussels and marinade; it is not the volume or drained mass of mussel flesh. The 55 g value is the displayed serving for this SKU; the available product record does not say whether it represents drained mussels or includes any marinade. Do not turn either number into a default piece mass, per-mussel conversion, recipe portion, density, package yield, or quantity for other mussel products. [S02, S04]

Sardo's ingredient statement includes canola oil, water, vinegar, garlic, lemon flavour, parsley, salt, lactic acid, and calcium chloride. No reviewed source or bundled recipe supports replacing this seasoned product with plain fresh/frozen mussels, another marinated seafood product, rollmops, fish balls, surimi, or any fish species at a fixed ratio. No global form conversion or contextual substitution is proposed. [S01]

## Next action

Keep the Sardo marinated-mussel product outside active references and forms and leave the generic mussel candidate unresolved. Reopen this boundary when a bundled recipe or confirmed import explicitly names marinated mussels or this Sardo SKU. Then verify the package's species/source and drained-versus-marinade quantity basis before deciding whether the requested ingredient is a recipe-specific finished product or a reusable catalog identity.

## Source register

Online sources were checked on 2026-10-13. New source IDs are local to this proposal and are not ledger entries.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-MARINATED-MUSSELS-20261013-R46-S01** | Sardo Foods, [Select Herb & Garlic Marinated Mussels](https://sardofoods.ca/product/select-herb-garlic-marinated-mussels/), product title, ingredient declaration, product-region section, and product description. | Manufacturer identifies a named marinated product, lists its ingredients, labels product region Canada, and describes appetizer/seafood-platter/main-meal uses. It does not identify mussel species, source fishery, drained quantity, or a recipe portion. Page opened directly; current crawl was within the last month. |
| **WP04-SECTIONP-MARINATED-MUSSELS-20261013-R46-S02** | Super C, [Moules marinées aux herbes et à l'ail, Premium Select](https://www.superc.ca/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-prepares/poissons-et-fruits-de-mer-marines/moules-marinees-aux-herbes-et-a-l-ail/p/055823086458), product no. `055823086458`, product title, `250 ml` package, Canada-origin badge, ingredients. | Current Québec retailer French wording and product/package evidence. Its page opener returned HTTP 403 in this review; the search-indexed listing supplied the product details. No species, drained mass, or serving measure is shown. |
| **WP04-SECTIONP-MARINATED-MUSSELS-20261013-R46-S03** | Super C, [Herb and Garlic Marinated Mussels, Premium Select](https://www.superc.ca/en/aisles/fish-seafood/prepared-fish-seafood/marinated-fish-seafood/herb-and-garlic-marinated-mussels/p/055823086458), same product no. `055823086458`, English title and ingredient declaration. | English and French retail titles resolve to the same Sardo item code. The English product page also returned HTTP 403 to the page opener; evidence came from the indexed listing. It is product-specific retail wording, not a naming standard. |
| **WP04-SECTIONP-MARINATED-MUSSELS-20261013-R46-S04** | Voilà, [Sardo Marinated Mussels Herb & Garlic, 250 ml](https://voila.ca/products/sardo-marinated-mussels-herb-garlic-250-ml/437193EA), brand, storage and nutrition-information section. | Current listing gives the 250 ml package and displays nutrition information per 10 pieces (55 g). Its page opener returned a redirect loop, so the serving display is retained only as indexed, product-specific evidence and not a conversion. |
| **WP04-SECTIONP-MARINATED-MUSSELS-20261013-R46-S05** | Office québécois de la langue française, [GDT: moule](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198877/moule), food-mollusc domain, preferred term, English equivalent, Latin name, and commercial-label note; updated 2012. | Supports Québec `moule` for blue mussel / *Mytilus edulis*. It does not identify the species used in Sardo's product or normalize the complete marinated-product phrase. |
| **WP04-SECTIONP-MARINATED-MUSSELS-20261013-R46-S06** | Fisheries and Oceans Canada, [Identifying bivalve shellfish](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm), “Mussels” section. | States that the single mussel species harvested in Canada is blue mussel (*Mytilus edulis*), and notes its Atlantic/Pacific range and Maritime farming. The product pages do not say where the mussels were harvested or identify them as this species; this source cannot be used to infer the Sardo SKU's taxon. |
| **WP04-SECTIONP-MARINATED-MUSSELS-20261013-R46-R01** | [Bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), and full archive/plan exact-key scan. | Static ownership, picker, and corpus audit: 1,370 active references, 100 forms, 64 legacy candidates, 1,700 ledger records, and 114 recipes / 1,123 ingredient rows. Exact product keys and the new source-ID prefix were absent before this proposal. |

The proposal assigns source IDs S01–S06 and audit ID R01 under the unique R46 prefix. No shared catalog, ledger, checklist, roadmap, recipe, code, or batch file was changed.
