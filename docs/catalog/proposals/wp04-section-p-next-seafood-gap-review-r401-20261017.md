# WP04 Section P — cod roe product-boundary review (R401)

- **Review and source-access date:** 2026-10-17.
- **Candidate:** `cod roe / œufs de morue` as a female-roe product category.
- **Recommendation:** Hold outside active references, forms, legacy mappings, and the shared research ledger until a bundled recipe or current Québec-facing product listing selects the intended product presentation.
- **Scope:** This review concerns cod roe only. It does not reopen trout roe, milt, bottarga, tarako, mentaiko, cod-flesh identities, or the R392 mussel-meat and R398 salted-pollock product decisions.
- **Proposal-only status:** This file is the only proposed artifact. No shared catalog, ledger, generated file, recipe, checklist, roadmap, or other proposal was changed. No tests, build, emulator, or deployment were run.
- **Proposal-local source IDs:** `WP04-SECTIONP-COD-ROE-R401-20261017-S01` through `S03`, plus audit ID `WP04-SECTIONP-COD-ROE-R401-20261017-R01`. These are evidence labels in this proposal only, not shared-ledger records.

## Why this is a distinct open boundary

The Section P roe checklist remains open for roe products when recipes call for them. The recent R395 integration added trout roe / `œufs de truite`; it does not allocate cod roe. The R383 milt review explicitly keeps cod roe separate from male fish gonads, while R156 and R40 discuss cod roe only as a neighboring phrase or as an ingredient in specific tarako/mentaiko products. None of those decisions allocates or holds a general cod-roe identity. The current plan still describes the broad roe item as open; see the [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L7371).

The candidate is linguistically clear: the Office québécois de la langue française (OQLF) gives the preferred Québec term `œufs de morue` and English `cod roe`. Its 1983 entry lists fresh, boiled, frozen, salted, smoked, and canned presentations, as well as cod caviar and cod-roe sausage. That entry establishes the bilingual term, but it spans materially different product presentations rather than selecting a current consumer product for the recipe catalog. [S01]

Current Canadian evidence is narrower but does not resolve the Québec product target. Salties, an Edmonton seafood supplier, lists seasonal fresh cod roe at approximately 1,000 g and offers wholesale/home delivery. Its [direct product page](https://www.salties.ca/products/fresh-cod-roe) returned a cache miss during the coordinator's source review, so no species assignment or French display from that page is relied on here. The accessible catalog listing remains one supplier's seasonal item, not a Québec retailer product or a reusable recipe amount. [S02]

Azuma Foods Canada currently lists a 100 g frozen product as `Spicy Cod Roe Paste / Pâte d’œuf de morue épicée`, with cod roe and seasoning as the main ingredients. This is a specific seasoned paste product. R40 already treats mentaiko as a separate unresolved product boundary; the Azuma SKU does not establish a generic French-facing cod-roe product identity. [S03]

**Hold rationale:** OQLF supplies a sound French term, but the present evidence does not identify which of the many cod-roe presentations the picker should represent in Québec. The only current unseasoned listing reviewed is a seasonal Edmonton supplier item, while the current Canadian French product label is a spicy paste already scoped to the mentaiko review. The bundled recipe corpus has no cod-roe request. Keep the candidate unallocated pending a Québec recipe or a current Québec-facing product source that fixes the intended presentation.

## Current ownership and archive audit

The live snapshot inspected for this review contains **1,709 active references**, **141 forms**, **56 legacy candidates**, and **2,069 research-ledger records**. The manifest lists **114 recipe files and 1,123 ingredient rows**.

Exact normalized-key checks across reference names and aliases, form labels and match terms, legacy names and aliases, and ledger record IDs found no owner for `cod roe`, `cod roes`, `œufs de morue`, `cod caviar`, `caviar de morue`, or `ingredient-ref-cod-roe`. A full text scan of ledger records found only the R383 milt source note that lists fresh cod roe as a neighboring product; it is not a cod-roe identity record or decision. The ledger, references, and forms remain unchanged.

| Existing identity or review | Current scope | R401 boundary |
|---|---|---|
| `ingredient-ref-trout-roe` | Species-neutral trout roe / `œufs de truite`, with qualified caviar aliases. | Keep it separate; it does not own cod-roe phrases. |
| `ingredient-ref-bottarga` | Salted, pressed, dried fish roe / `poutargue`; owns generic `fish roe` / `œufs de poisson` wording. | Do not merge with plain cod roe or add generic aliases. |
| `ingredient-ref-fish-milt` | Male fish gonad product / `laitance`, including English `soft roe`. | R383 already identifies cod roe as a separate female-roe neighbor; no cod-roe row was created. |
| Atlantic, Arctic, and Pacific cod references | Species-scoped fish-flesh identities; separate salt-cod and smoked-cod product rows also exist. | Do not attach roe to a cod-flesh reference as a form or infer the general roe category is Atlantic cod. |
| R40 mentaiko and R156 tarako reviews | Distinct seasoned/salted pollock-roe questions; R156 notes Akita *tarako* can refer to raw Pacific-cod roe. | Neither review makes `cod roe` a global alias or decides the broader candidate. |
| R395 trout roe | Recently integrated distinct roe identity with `trout caviar` / `caviar de truite` aliases. | Cod roe remains a separate, unallocated product candidate. |
| R392 frozen cooked mussel meat; R398 boneless salted pollock | Recent, unrelated product identities. | Do not reopen or duplicate either review. |

The R401 source-ID prefix was absent from the shared ledger and proposal/batch archive before this review. The OQLF and Azuma URLs below were not found as existing source URLs in the ledger. Salties' catalog URL was previously cited by R383 for its cod-milt listing; R401 rechecks that same current catalog for its separate `Fresh Cod Roe` item and keeps the source ID local to this proposal.

## Picker projection

The projection follows the phrase-first and substring-fallback behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The hypothetical row has only `cod roe / œufs de morue` as display names and no aliases or forms.

| Query | Current result | If a row were added |
|---|---|---|
| `cod roe`; `œufs de morue` | No result | One cod-roe result |
| `roe` | Bottarga; milt (through `soft roe`); trout roe | The same three plus cod roe |
| `fish roe`; `œufs de poisson` | Bottarga | Unchanged; keep generic wording on its existing owner |
| `caviar` | Finger lime; trout roe (through `caviar de truite`) | Unchanged; do not add `cod caviar` or `caviar de morue` aliases |
| `cod`; `morue` | Six current species/product results | The same six plus cod roe; broad queries remain multi-result |

Exact cod-roe search would become possible, while broad `roe` and `cod/morue` queries would gain another result. Since no recipe calls for the product and current Québec product evidence does not choose a presentation, this review does not recommend widening those picker results yet.

## Bundled recipe demand and numeric limits

The manifest-ordered scan parsed all **114 recipe files** and **1,123 structured ingredient rows**. Complete recipe JSON and ingredient rows were checked for `cod roe`, `cod roes`, `œufs de morue`, `cod caviar`, `caviar de morue`, and nearby `fish roe` wording. It found **zero matching recipe files and zero matching ingredient rows**. No ingredient line, amount, preparation, or method selects cod roe. [R01]

The OQLF entry's presentation list is terminology context, not a basis for generic forms. Salties' approximate 1,000 g listing and seasonal window are seller-specific; Azuma's 100 g frozen package is the separate spicy paste SKU. Add no active measure, density, unit mapping, conversion, package yield, cooking yield, or substitution. Do not attach cod roe to Atlantic, Arctic, or Pacific cod flesh, trout roe, bottarga, milt, tarako, or mentaiko.

## Source register

Sources were checked on 2026-10-17. Source IDs are proposal-local; no shared ledger records or source entries were added.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-COD-ROE-R401-20261017-S01** | OQLF, [GDT: œufs de morue](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488143/oeufs-de-morue), preferred-term entry and note. | Gives Québec French `œufs de morue` and English `cod roe`; describes multiple historical product presentations. Last updated in 1983, so it does not establish current Québec retail availability or select one presentation. |
| **WP04-SECTIONP-COD-ROE-R401-20261017-S02** | Salties, [seafood catalogue](https://www.salties.ca/), current `Fresh Cod Roe` listing; [linked product page](https://www.salties.ca/products/fresh-cod-roe), Edmonton supplier. | The accessible catalog lists approximately 1,000 g and a January–April season. The linked product page returned a cache miss during coordinator review, so its species assignment and French display are not relied on. This remains one seller-specific seasonal listing, not Québec consumer-market evidence or a transferable measure. The catalog URL was previously used by R383 for a different claim about cod milt. |
| **WP04-SECTIONP-COD-ROE-R401-20261017-S03** | Azuma Foods (Canada), [Mentai Paste (100 g)](https://azumafoods.ca/products/mentai-paste-100g/), product 63184, product name and main ingredients. | Current manufacturer listing names `Spicy Cod Roe Paste / Pâte d’œuf de morue épicée` and lists cod roe and seasoning. It supports French wording on that specific prepared SKU, not a generic or unseasoned roe identity. |
| **WP04-SECTIONP-COD-ROE-R401-20261017-R01** | [Bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), current ingredient references/forms, [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), manifest-listed recipes, Section P plan, and related proposals. | Static ownership, archive, proposal-local source-ID, picker-projection, and corpus audit against the snapshot counts above. It does not establish demand outside the bundled recipe library. |

## Final disposition

**Hold cod roe / œufs de morue unallocated.** Preserve OQLF's term and the current product evidence as research context. Reopen when a bundled recipe or a current Québec-facing product source identifies whether the intended ingredient is fresh roe, salted/cured roe, a seasoned paste, or another presentation. Until then, add no reference, alias, form, legacy mapping, ledger record, recipe link, measurement, conversion, yield, or substitution. Section P remains open.
