# WP04 Section P R560 — Atlantic and Pacific cod-loin form review

- **Review and source-access date:** 2026-10-17.
- **Packet:** Finfish cut boundary, bilingual product naming, source-ID ownership, picker projection, bundle demand, SKU and measurement limits, and substitution review.
- **Status:** Accepted and integrated on 2026-10-17. The two species-qualified cut forms and form-scoped evidence are in the bundled catalog and research ledger; the broader finfish parent remains open. See the [R560–R561 integration README](../batches/wp02-wp04-r560-r561-gap-review-integration-20261017/README.md).
- **Disposition:** **Add two species-qualified cut forms under the existing Atlantic-cod and Pacific-cod references.** A single Atlantic-cod form would make Atlantic cod the only fish result for bare singular `loin` / `longe`, alongside the existing pork-loin result. The paired forms make `cod loin` return both cod species; bare singular cut queries return both cods and pork. Do not index plural `loins` / `longes`, so the accepted R554 Haddock-loin hold remains in place. The bundled recipes contain no cod or fish-loin demand, so add no recipe link or numeric behavior.

## Open checklist anchor and prior-work check

The broader finfish checklist remains open at [WP04 Section P, lines 6344–6345 of the global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6353). R560 resolves only whether the already-catalogued Atlantic and Pacific cod identities should each have a species-qualified loin cut form. It does not close the finfish parent.

The focused review found no active Atlantic- or Pacific-cod loin form, legacy candidate, form-level ledger record, or prior Cod-loin disposition. Proposed form IDs `ingredient-form-atlantic-cod-loin` and `ingredient-form-pacific-cod-loin` were unallocated in the reviewed snapshot.

- [R554](wp04-section-p-next-gap-review-r554-20261017.md) holds Haddock loins / longes d’aiglefin because plural labels would make broad `loins` and `longes` searches return Haddock alone. R560 adds no Haddock name, form, or plural match term and does not release that hold.
- [R557](wp04-section-p-next-gap-review-r557-20261017.md) holds swordfish steak because broad `fish steak` would return Swordfish alone while omitting Atlantic halibut steak. R560 adds no swordfish cut or generic fish-loin alias.
- [R545](wp04-section-p-atlantic-halibut-steak-form-review-r545-20261017.md) already adds a species-qualified Atlantic-halibut steak / darne form with empty match-term arrays. Its acceptance supports a source-backed species-and-cut form, not a general rule to add every single-species cut. R560 pairs the two existing cod species because the actual picker would otherwise make bare singular `loin` and `longe` resolve to one fish species. Generic terms remain multi-result after this pair.
- [R548](wp04-section-p-next-gap-review-r548-20261017.md) and [R551](wp04-section-p-next-gap-review-r551-20261017.md) review rainbow-trout fillet and Atlantic-halibut cheeks, respectively; neither allocates a cod-loin form.
- The earlier R554 review cites a current Atlantic-cod-loin product as sibling evidence. It did not add a form or ledger record, so that product source remains proposal-local under R554 source ID S04.

At proposal time, the shared plan and roadmap had not yet been edited. Root recorded the accepted bounded delta there during integration and left the Section P parent open; see the [R560–R561 integration README](../batches/wp02-wp04-r560-r561-gap-review-integration-20261017/README.md).

## Candidate scope and bilingual names

The proposed entries are cut-only forms under two existing species identities, not new ingredient references or frozen-product identities:

| Proposed form ID | Existing parent | English display | French display | Proposed `formCode` / `prepState` |
|---|---|---|---|---|
| `ingredient-form-atlantic-cod-loin` | `ingredient-ref-atlantic-cod` | `Atlantic cod loin` | `longe de morue de l’Atlantique` | `loin_cut` / `loin_cut` |
| `ingredient-form-pacific-cod-loin` | `ingredient-ref-pacific-cod` | `Pacific cod loin` | `longe de morue du Pacifique` | `loin_cut` / `loin_cut` |

Use empty `matchTermsEn` and `matchTermsFr` arrays, and null form density. Keep each form’s existing parent aliases unchanged. In particular, add no generic `fish loin` / `longe de poisson`, bare `loin(s)` / `longe(s)`, or cross-species `cod` / `morue` alias. Do not add frozen, fresh, boneless, skinless, or individually portioned to either form label: those qualifiers are SKU-specific or absent from the reviewed evidence.

The English High Liner product name is plural and its paired French route says `longes`; Metro’s Pacific product title says `Loin Portion` / `portion de longe`. The singular form displays are intentional normalization for the cut. The current picker does not stem singular and plural words, so product-exact plural queries will not match; adding plural terms would also cause bare `loins` / `longes` to resolve to cod while the held Haddock cut remains unrepresented. Preserve that limitation and the R554 hold rather than creating a misleading generic plural result.

## Active catalog and source-ID ownership

Review-time snapshot: **1,805 active references, 148 forms, 56 legacy candidates, 2,169 research-ledger records, 10,035 source entries, 8,480 distinct source IDs, and 7,146 distinct URLs**. The package manifest lists **114 recipes / 1,123 structured ingredient rows**.

| Current owner | State before R560 | R560 treatment |
|---|---|---|
| `ingredient-ref-atlantic-cod` | `Atlantic cod / morue de l’Atlantique`; empty alias arrays; null default density; empty unit mappings; no forms. Its reference-level ledger record is identity-verified, while measurement and substitution are `not_yet_researched`. | Retain its bilingual parent identity and all existing fields. If accepted, attach only the proposed cut form and form-scoped evidence. Do not change the parent research states. |
| `ingredient-ref-pacific-cod` | `Pacific cod / morue du Pacifique`; English aliases `gray cod`, `grey cod`; null default density; empty unit mappings; no forms. Its parent ledger record has existing CNF observations and a general-scope `researched_no_supported_substitute` finding. | Retain the parent aliases and all parent-level findings. CNF’s raw fillet and prepared/flaked portions do not describe loin cuts. The marketplace-equivalence sentence in DFO is not a recipe substitution. Do not copy those measures or findings onto the new cut. |
| `ingredient-ref-pork-loin-chops` | `boneless pork loin chops / côtelettes de longe de porc désossées`, no aliases or forms; already used by one recipe line. | Preserve as a separate meat identity. It is relevant only because the live picker includes `loin` and `longe` in its existing parent names. |
| `ingredient-ref-haddock` | `haddock / églefin`, French alias `aiglefin`, no loin form. | Leave untouched under the R554 hold. |

No active or legacy row owns either proposed form ID. Exact source-URL and source-ID searches found no ledger entry for the High Liner French route or either Metro 244982 language route. The High Liner English product URL was already named in R554 as `WP04-SECTIONP-HADDOCK-LOINS-R554-20261017-S04`, but that ID is **not** in the shared ledger because R554 was a hold. Reuse that exact proposal-local ID for the same URL if the source is promoted during integration; do not mint a second ID for it.

The new R560 product-source IDs below are proposal-local and unallocated in the reviewed ledger:

- `WP04-SECTIONP-COD-LOIN-R560-20261017-S01` — paired High Liner French-language route for the same product UUID as R554 S04. The language route has been rechecked against the identifier: both routes are UUID `9ca8c00f-aeba-4fec-a92a-38437e991bb8`, product code **3269**, GTIN **10061763032698**. The distinct `423326e5-69a0-4c02-9267-e6c3511e8adb` route is code **8337** / GTIN **10061763083379** and is excluded as a separate SKU, not treated as the French page for 3269.
- `WP04-SECTIONP-COD-LOIN-R560-20261017-S02` — Metro English route for product 244982.
- `WP04-SECTIONP-COD-LOIN-R560-20261017-S03` — Metro French route for the same product 244982.

Reuse the existing ingredient-level owners `WP04-FINFISH-ID-20261009-S02`, `WP04-FINFISH-ID-20261009-S06`, and `WP04-FINFISH-ID-20261009-S07` for Atlantic-cod identity/common-name context; and `WP04-PACIFIC-COD-IDENTITY-20261012-S01` through `S04` for Pacific-cod identity and bilingual/common-name context. Do not duplicate those source URLs or treat them as cut evidence. The repository search also found no allocated R560 source prefix in `docs/catalog` before this proposal.

## Ingredient identity evidence and product evidence

Keep species-level evidence separate from evidence about individual packaged products.

**Ingredient-level evidence:** The existing OQLF / Faune et flore du pays entry for [morue de l’Atlantique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26573546/morue-de-latlantique) maps the bilingual species pair to *Gadus morhua*. The current [CFIA fish common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) explains that the CFIA Fish List provides French and English common names tied to species; the existing Atlantic-cod ledger sources record the CFIA Cod query as shared across more than one cod-named taxon. Fisheries and Oceans Canada identifies [Pacific cod](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pac-cod-morue-pac-eng.html) and [morue du Pacifique](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pac-cod-morue-pac-fra.html) as *Gadus macrocephalus*. DFO says Pacific and Atlantic cod are considered equivalent in the marketplace; that is not tested recipe replacement guidance and establishes no loin equivalence.

None of those identity sources defines a fish-loin cut. I found no separate OQLF fish-cut standard for `loin/longe` in the cited record; R560 uses the current bilingual product wording below and makes no claim that OQLF or CFIA standardizes it as a general cut term.

**Product-level evidence:**

| Source ID | Product evidence | Exact scope and limits |
|---|---|---|
| Reuse proposal-local **`WP04-SECTIONP-HADDOCK-LOINS-R554-20261017-S04`** | High Liner Foodservice Canada, [Individually Quick Frozen Atlantic Cod Loins, approx. 113 g / 4 oz](https://www.highlinerfoodservice.com/en-CA/products/atlantic/9ca8c00f-aeba-4fec-a92a-38437e991bb8/high-liner-foodservice-signature-454-kg-10-lb-individually-quick-frozen-atlantic-cod-loins-approx-113-g-4-oz). The current English page identifies Product Code **3269**, GTIN **10061763032698**, and describes loins as rectangular portions from the thickest part of the fillet. The title states **4.54 kg / 10 lb** and **individually quick frozen**; the nutrition panel gives about **1 loin (113 g / 4 oz)**. | One foodservice product page/SKU. Its approximate serving is not an exact unit mapping, universal loin weight, recipe portion, piece count, fillet yield, or substitution ratio. The listed package/title weight, gross-weight field (**5.22 kg** on the product specifications), and about-one-loin serving are distinct fields; they do not establish a usable package yield. The product page explicitly says frozen for this SKU only. |
| **`WP04-SECTIONP-COD-LOIN-R560-20261017-S01`** | High Liner Foodservice Canada, [French route for the same Atlantic-cod product UUID](https://www.highlinerfoodservice.com/fr/products/atlantic/9ca8c00f-aeba-4fec-a92a-38437e991bb8/high-liner-foodservice-signature-454-kg-10-lb-individually-quick-frozen-atlantic-cod-loins-approx-113-g-4-oz), titled `Longes de morue de l’Atlantique surgelées séparément, environ 113 g / 4 oz`. The indexed French page reports product code **3269**, GTIN **10061763032698**, and about **113 g**. | Paired language view of UUID `9ca8c00f-aeba-4fec-a92a-38437e991bb8` / product 3269, not a second SKU. The English route directly confirms code and GTIN; the French route is reachable through that page’s FR locale link, but its direct content fetch returned a cache miss. Use indexed French content for bilingual wording and SKU cross-check, not as independent package/measurement evidence. |
| **`WP04-SECTIONP-COD-LOIN-R560-20261017-S02`** | Metro, [Frozen Pacific Cod Loin Portion, product 244982](https://www.metro.ca/en/online-grocery/aisles/frozen/fish-seafood/fish-filets-steaks/frozen-pacific-cod-loin-portion/p/244982). The current English listing states **113 g**, product number **244982**, *Gadus macrocephalus*, Northwest Pacific / Canada provenance, and wild bottom-trawl method. The title and breadcrumb both identify the SKU as frozen. | One retailer SKU, explicitly shown out of stock at the selected Metro Arthur W. & Hwy. 61 store during retrieval. This does not establish Quebec inventory or general current availability. The listed 113 g is this product’s item weight, not an individual-loin standard, fillet yield, or reusable recipe portion. |
| **`WP04-SECTIONP-COD-LOIN-R560-20261017-S03`** | Metro, [Portion de longe de morue du Pacifique surgelée, product 244982](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/filets-et-darnes-de-poissons/portion-de-longe-de-morue-du-pacifique-surgelee/p/244982). The indexed French route gives the same product number, **113 g**, species, origin, and harvest method. | French route for the same Metro SKU as S02, not another product. Direct opening returned HTTP 403; use the indexed route as paired French-label evidence and retain the store/availability limitation in S02. The page explicitly names the SKU `surgelée`; do not propagate that state to all Pacific-cod loin cuts. |

The two market examples are different species, vendors, products, and presentations: High Liner 3269 is a 10 lb individually quick-frozen foodservice case whose nutrition panel uses an approximate one-loin serving; Metro 244982 is a frozen single loin-portion listing at 113 g. Equal-looking numbers do not establish equivalent cut sizes or interchangeable portions. Do not add either amount to form defaults, density, mappings, conversions, yield data, or a shared portion observation.

**SKU-pairing correction and exclusion:** An audit initially raised a different High Liner French route, UUID `423326e5-69a0-4c02-9267-e6c3511e8adb`. The current High Liner English and French pages for that UUID identify code **8337**, GTIN **10061763083379**, and about **170 g / 6 oz**; it is a separate product from 3269. The R560 S01 citation is the `/fr/` locale route retaining UUID `9ca8c00f-aeba-4fec-a92a-38437e991bb8`, not the 423… route. Exclude 8337 from the proposed evidence delta and do not combine its 170 g amount, package details, or language wording with SKU 3269. The excluded page is retained here only to explain the pairing decision; it receives no proposal source ID and owns no catalog evidence.

## Picker projection and alias boundary

The read-only projection follows the current [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) behavior: normalized complete word phrases are searched first, and substring matching runs only when no complete phrase is found. A form result maps to its parent reference; the form hint is available only when the query exactly equals a form label or match term. Projection below adds only the two proposed singular labels, with no match terms, to the current 1,805-reference / 148-form snapshot.

| Query | Projected result | Picker effect |
|---|---|---|
| `Atlantic cod loin`; `longe de morue de l’Atlantique` | Atlantic cod only; exact label can show the Atlantic loin form hint. | Species-qualified English and French form search. |
| `Pacific cod loin`; `longe de morue du Pacifique` | Pacific cod only; exact label can show the Pacific loin form hint. | Species-qualified English and French form search. |
| `cod loin` | Atlantic cod + Pacific cod. | Both species are selectable; neither is a sole-species answer to the shared cut phrase, and this shorter query does not itself show an exact form hint. |
| `loin`; `longe` | Atlantic cod + Pacific cod + boneless pork loin chops. | Multi-result because the two proposed fish forms are paired and the existing pork name also contains the query. No exact form hint is shown for these bare terms. |
| `loins`; `longes` | No result. | Plural terms remain unindexed; R554 Haddock hold is unchanged. |
| `Atlantic cod loins`; `longes de morue de l’Atlantique` | No result. | Source titles are plural; current search does not stem to the proposed singular display. This is an explicit discovery limit. |
| `fish loin`; `longe de poisson` | No result. | No generic fish-cut alias is introduced. |
| `morue` | Existing multiple cod/morue references, including Atlantic and Pacific cod. | Parent-level broad naming remains unchanged; R560 adds no generic cod/morue alias. |

This is materially different from adding only Atlantic cod: a single Atlantic-cod form would capture bare singular `loin` and `longe` as an Atlantic-cod-only fish result. The paired proposal prevents that singleton. It also deliberately leaves generic plural search unsupported, rather than making plural `loins` / `longes` point to cod while the R554 Haddock form remains held. The broader-picker limitation is that generic singular queries show parent rows without a cut hint; exact species-qualified labels show the form hint. If product requirements later call for a generic selectable `fish loin` form or hints on incomplete cut terms, revisit picker behavior separately instead of widening these aliases.

## Bundle demand, measurements, and conversions

The audit read every manifest-listed recipe: **114 recipe files and 1,123 ingredient rows**. It found **zero** cod/morue or fish-loin references in recipe text or ingredient rows. The only matching row was recipe 095 Satay’s `1 lb boneless pork loin chops, cut into diagonal strips`, already linked to `ingredient-ref-pork-loin-chops`; it is unrelated to seafood. There is no bundled cod-loin demand or form link.

The external source amounts above remain SKU observations only. They do not support a standard mass per loin, an exact count per package, edible yield, loss during cooking, one-to-one replacement, or comparison between an Atlantic loin and a Pacific loin portion. Keep both parents’ default densities null and unit mappings empty. For each proposed form, an integrated form-level ledger record may mark measurement research `researched_no_supported_value` for a **reusable** value while preserving the product source’s limitations; do not record the 113 g figures as general form measures.

Add no lb↔g conversion from these package facts, volume density, piece/count mapping, package-yield record, cooking-yield estimate, recipe link, or form conversion.

## Substitution scope

No reviewed source or bundled recipe supports a directed substitution between Atlantic-cod loin, Pacific-cod loin portion, another cod cut, fillet, or a different fish with a stated amount, method, role, and adjustment. DFO’s marketplace-equivalence statement does not establish recipe interchangeability. Pacific cod’s existing no-supported-substitute finding is parent/general-use scoped and explicitly rejects inferring substitution from that sentence; the new form cannot inherit it as cut-level cooking evidence. Atlantic cod’s parent substitution state is still `not_yet_researched`.

If root integrates the forms, record only form-scoped `researched_no_supported_substitute` findings for this bounded source and recipe review. Keep both parent states as they are; add no global form conversion, contextual substitution rule, warning, or recipe-line substitution.

## Bounded integration recommendation

The integration added only these two form rows to `ingredient-forms.v1.json`:

1. `ingredient-form-atlantic-cod-loin` under `ingredient-ref-atlantic-cod`, labels `Atlantic cod loin / longe de morue de l’Atlantique`, `formCode` and `prepState` `loin_cut`, empty match-term arrays, null density.
2. `ingredient-form-pacific-cod-loin` under `ingredient-ref-pacific-cod`, labels `Pacific cod loin / longe de morue du Pacifique`, `formCode` and `prepState` `loin_cut`, empty match-term arrays, null density.

One `ingredient_form` ledger record per form reuses existing Atlantic/Pacific identity sources and the product-source IDs above. For Atlantic, the English High Liner URL uses the prior proposal-local R554 S04 ID; it is not duplicated under a new ID. Product amounts, frozen state, and the Metro selected-store out-of-stock state remain source-specific. Parent aliases, densities, unit mappings, observations, substitutions, and the broader plan parent remain unchanged. Static seed-package and ledger validation passed. No app tests, build, emulator, or deployment were run because this change only adds database JSON data, as exempted by `AGENTS.md`.

## Sources and limits

New R560 source IDs below are proposal-local; existing identity sources and the R554 S04 source ID are reused by owner. Sources were checked on 2026-10-17; page contents and retailer availability may change.

| Source ID | Source | Evidence and limits |
|---|---|---|
| Reuse `WP04-FINFISH-ID-20261009-S02` | OQLF / Faune et flore du pays, [morue de l’Atlantique (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26573546/morue-de-latlantique). | Supports Atlantic cod / morue de l’Atlantique and *Gadus morhua*. Species-level evidence only; it does not define a loin cut. |
| Reuse `WP04-FINFISH-ID-20261009-S06` and `S07` | CFIA, [fish common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) and the existing [Fish List Cod query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Cod). | CFIA guidance describes the bilingual common-name list and ties names to species. The source is not a cut-form or measurement authority. The Cod query URL is already owned by S07; do not duplicate it. |
| Reuse `WP04-PACIFIC-COD-IDENTITY-20261012-S01` through `S04` | CFIA Pacific-cod Fish List query; DFO, [Pacific Cod](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pac-cod-morue-pac-eng.html) and [Morue du Pacifique](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pac-cod-morue-pac-fra.html); Government of Canada TERMIUM Plus gray-cod record. | Supports the existing Pacific species label and *Gadus macrocephalus*. DFO’s marketplace-equivalence phrase is not a recipe substitution; these sources do not establish a loin cut. |
| Reuse proposal-local `WP04-SECTIONP-HADDOCK-LOINS-R554-20261017-S04` | High Liner Foodservice Canada, [Atlantic Cod Loins product code 3269](https://www.highlinerfoodservice.com/en-CA/products/atlantic/9ca8c00f-aeba-4fec-a92a-38437e991bb8/high-liner-foodservice-signature-454-kg-10-lb-individually-quick-frozen-atlantic-cod-loins-approx-113-g-4-oz). | Current English product page, product code, GTIN and manufacturer cut description; see SKU limits above. The URL is already assigned an ID in R554 but is not an active ledger source. |
| `WP04-SECTIONP-COD-LOIN-R560-20261017-S01` | High Liner Foodservice Canada, [paired French product route](https://www.highlinerfoodservice.com/fr/products/atlantic/9ca8c00f-aeba-4fec-a92a-38437e991bb8/high-liner-foodservice-signature-454-kg-10-lb-individually-quick-frozen-atlantic-cod-loins-approx-113-g-4-oz). | Supports `Longes de morue de l’Atlantique`; indexed French content reports code 3269 / GTIN 10061763032698 / about 113 g. Its exact UUID matches R554 S04, whose English page was directly opened and confirms code and GTIN. Direct French content fetch returned a cache miss; it is paired-label evidence, not an independent SKU or measurement source. |
| `WP04-SECTIONP-COD-LOIN-R560-20261017-S02` | Metro, [Frozen Pacific Cod Loin Portion, product 244982](https://www.metro.ca/en/online-grocery/aisles/frozen/fish-seafood/fish-filets-steaks/frozen-pacific-cod-loin-portion/p/244982). | Current English page directly opened; exact product title, 113 g item listing, product number, species, provenance, method, frozen category path, and selected-store out-of-stock message. One SKU only. |
| `WP04-SECTIONP-COD-LOIN-R560-20261017-S03` | Metro, [Portion de longe de morue du Pacifique surgelée, product 244982](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/filets-et-darnes-de-poissons/portion-de-longe-de-morue-du-pacifique-surgelee/p/244982). | Current indexed French route supports paired wording and same SKU number. Direct retrieval returned HTTP 403; it is not independent product evidence from S02. |
| Excluded comparison (not a proposal source ID) | High Liner Foodservice Canada, [separate Atlantic cod loin product, UUID 423326e5-69a0-4c02-9267-e6c3511e8adb](https://www.highlinerfoodservice.com/fr/products/atlantic/423326e5-69a0-4c02-9267-e6c3511e8adb/high-liner-foodservice-signature-454-kg-10-lb-individually-quick-frozen-atlantic-cod-loins-approx-170-g-6-oz). | Product code **8337**, GTIN **10061763083379**, about **170 g / 6 oz**. This is a distinct SKU, not the French locale page for 3269; deliberately excluded from R560 evidence/data delta and from any pooled measurement claim. |
| R01 — repository audit (not a catalog source ID) | Current active reference and form JSON, [research ledger](../research-ledger.v1.json), [legacy-import candidates](../legacy-import-identities.v1.json), Section P plan, prior proposals, [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), and all manifest-listed recipes. | Proposal-time workspace snapshot on 2026-10-17. Confirms the reviewed IDs, source ownership, picker projection, and no bundled cod-loin demand. Root later integrated only the bounded R560 delta; see the [integration README](../batches/wp02-wp04-r560-r561-gap-review-integration-20261017/README.md). |
