# WP02 Section A7 R797 — Khorasan flour product-portion review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Integrated on 2026-10-19. Root added one product-specific portion observation to the existing Khorasan-flour ledger row; see the [R797–R799 integration README](../batches/wp02-wp03-wp04-r797-r799-gap-review-integration-20261019/README.md).
- **Plan anchor:** The Section A7 parent remains open for other grain meals and milling products, including the unresolved wheat-meal candidate ([global catalog plan, line 2276](../../RecipeBook-global-ingredient-catalog-plan.txt#L2276)).
- **Candidate:** The existing milling-product reference `ingredient-ref-khorasan-flour` (`khorasan flour / farine de khorasan`). This is a measurement review on the flour row, not a new identity. R469 surfaced this exact Québec flour product while keeping its portion separate from the distinct A7 Khorasan-semolina identity.
- **Scope:** Assess one current Québec product-sheet serving for the flour product. Do not reopen the active identity, French display, alias, semolina, or substitution decisions.
- **ID handling:** Reused existing source `WP02A4-KH-S02`; root assigned observation ID `la-milanaise-white-khorasan-flour-third-cup-60g-r797-20261019`.

## Recommendation

**Record one product-specific `portion_weight` observation** on the existing `ingredient-ref-khorasan-flour` ledger row:

- La Milanaise Organic Unbleached White Khorasan Flour, 1 kg product: **1/3 cup = 60 g**, as the current Québec Food Directory product sheet’s nutrition serving.

If accepted, set that row’s `measurementState` to `researched_supported`. Keep the observation bound to the named white, unbleached product (Québec Food Directory product GTIN `627062198614`). The published serving is useful for recipes that choose to track the manufacturer’s listed volume-and-mass portion; it is not a validated general cup conversion.

Do not infer a default density or unit mapping, average this value with other products, or apply it to whole, sifted, semolina, or other Khorasan products. Leave the reference names and aliases unchanged, keep `defaultDensity` null and `unitMappings` empty, add no form or active conversion, add no recipe link or package yield, and leave substitution research unchanged.

## Source evidence and limits

Sources were checked online on 2026-10-19.

| Source / ownership | Evidence | Limits |
|---|---|---|
| **Reuse existing ledger source `WP02A4-KH-S02`** — Québec Food Directory, [Organic Unbleached White Khorasan Flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8201408), product sheet. | The English and French views use the names **Organic Unbleached White Khorasan Flour** / **Farine de Khorasan blanche non blanchie biologique**, list La Meunerie Milanaise and 1 kg format, and state nutrition facts **per 1/3 cup (60 g)**. The sheet identifies GTIN `627062198614`; the English view showed last updated 2026-06-29 and the French view 2026-07-07. | This is the Québec Food Directory’s transcription of company product information, not a package photograph or an independent laboratory measurement. Its legal notice says MAPAQ is not responsible for the accuracy of published company information. The page does not state the cup capacity, scoop/fill/level method, or a separate weighing procedure. Treat the value only as the named product’s published nutrition serving. |
| **Manufacturer corroboration, cited here only** — La Milanaise, [Organic Unbleached White Khorasan Flour](https://lamilanaise.com/en/produits/organic-unbleached-white-khorasan-flour/) and [Farine de khorasan blanche non blanchie biologique](https://lamilanaise.com/produits/farine-de-khorasan-blanche-non-blanchie-biologique/). | The current manufacturer pages use the matching English and Québec French product names, describe a 1 kg retail format and T60 flour, and recommend it for baking, breads, pasta, and other uses. | The manufacturer pages corroborate current product identity and culinary use, but publish no 1/3-cup or 60 g serving. They are not independent numeric support. No source rows or IDs for these pages are proposed in this review. |
| **Reuse existing ledger source `WP02A4-KH-S01`** — OQLF, [blé khorasan (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26533000/ble-khorasan). | Supports the Québec term `blé khorasan` and existing identity context. | Terminology source only; it does not define this flour product or support its serving amount. No duplicate source entry is proposed. |

## Existing-key and source-ownership audit

| Surface | Live state and disposition |
|---|---|
| Active reference | `ingredient-ref-khorasan-flour` is verified as `khorasan flour / farine de khorasan` in `FLOUR_AND_STARCH`. Its English and French alias arrays are empty, `defaultDensity` is null, and `unitMappings` is empty. Preserve all of these fields. Do not add product qualifiers such as `white`, `unbleached`, or `organic` as aliases. |
| Ledger | The owning row has `measurementState: not_yet_researched`, `substitutionResearchState: not_yet_researched`, and no measurement observations. Its existing source `WP02A4-KH-S02` already owns the Québec Food Directory URL and bilingual identity evidence. If accepted, enrich that existing source entry with the product-sheet portion locator/support and a refreshed access date, then append one observation on this same row. Do not create a duplicate source entry. |
| Related references and forms | Khorasan wheat grain, Khorasan flakes, Khorasan semolina, and other Khorasan-derived products are distinct active references. The flour row has no active ingredient form; neither global nor contextual substitution rules mention this reference. This review adds no form, cross-product mapping, or active rule. |
| Picker impact | No ingredient-reference fields or search keys change. The active bilingual display remains `khorasan flour / farine de khorasan`; product-specific source wording remains evidence only. Search and picker ownership therefore remain unchanged. |
| Prior A7 ownership | R469 established the separate A7 Khorasan-semolina identity and explicitly stated that the Québec directory’s 1/3-cup (60 g) flour portion must not be transferred to semolina. The R469 integration added no flour observation. R656 later recorded 70 g of Khorasan/Kamut semolina only as a complete two-serving porridge formula amount; it does not cover this flour product. The R605/R472 wheat-meal decisions, R794 hominy-grits portion, and the other recent A7 grain-meal reviews do not own this observation. This proposal places the source only on the flour row that already owns it. |
| Source and proposal ownership | The directory URL and `WP02A4-KH-S02` each occur as a source entry only on `ingredient-ref-khorasan-flour`; prior proposal mentions are cross-references to that same source and explicitly exclude transfer to semolina. No existing Khorasan-flour measurement observation or focused measurement proposal was found. The R797 proposal path was free before drafting. No shared observation ID is generated here. |
| Bundled recipe corpus | Inspected all **114** manifest-listed recipe files and **1,123** structured ingredient rows. Normalized searches for Khorasan, `farine de khorasan`, Khorasan flour, and Kamut flour found no bundled recipe match or ingredient link. The manufacturer’s external use guidance provides culinary context but creates no bundled recipe demand. Add no recipe link or recipe edit. |

The exact French product name is supported by both the Québec directory and La Milanaise’s French product page. The proposed serving is not a new French alias and does not alter the broad active display. The adjacent semolina record remains separate and keeps its existing formula-specific observation.

## Candidate data delta if accepted

On the existing `ingredient-ref-khorasan-flour` research-ledger record only:

| Field | Proposed value or operation |
|---|---|
| `measurementState` | Change from `not_yet_researched` to `researched_supported`. |
| Existing source `WP02A4-KH-S02` | Reuse the existing source entry; refresh its `accessedOn` date and extend its locator/support to include the named product’s nutrition serving (**1/3 cup (60 g)**). Add no duplicate source entry or new shared source ID. |
| One `measurementObservation` | Append one `portion_weight` observation: `value: 60`, `valueUnit: g`, `sourceQuantity: 1/3 cup`, `observedMassG: 60`, `evidenceKind: published_portion`, and `sourceIds: [WP02A4-KH-S02]`. Identify the food as La Milanaise Organic Unbleached White Khorasan Flour, GTIN `627062198614`, 1 kg; describe the observation as the product-sheet nutrition serving with unspecified cup capacity and fill/level method. Assign its required observation ID only during root integration. |
| Unchanged fields | Keep identity, aliases, category, active forms, null density, empty unit mappings, and substitution-research state unchanged. Add no conversion, yield, recipe link, or active substitution. |

## No-data / hold option

If a nutrition serving transcribed in the Québec Food Directory is not acceptable without a direct photograph or confirmation from the manufacturer, hold the measure. Preserve `measurementState: not_yet_researched`, keep the observation array empty, and retain the active names, null density, empty mappings, no forms, and no substitutions. The official manufacturer pages corroborate the current product and its culinary use but do not independently publish the numeric serving. No generic Khorasan-flour amount should be inferred from another product or from the whole-grain product page.

## Review checks performed

- Inspected the live A7 checklist, active ingredient-reference and form catalogs, the owning ledger record, and global/contextual substitution rules.
- Audited R469 and R656 proposals and integration batches, the adjacent Khorasan product owners, and the earlier A7 grain-meal decisions; checked the exact source URL and source-ID ownership.
- Scanned all 114 bundled recipes / 1,123 ingredient rows for matching Khorasan flour demand.
- Checked current La Milanaise English and French product pages and the Québec Food Directory’s bilingual product sheet online.
- At proposal handoff, no shared JSON, checklist, workflow, roadmap, or README files had been changed. No software tests, build, emulator run, or deployment were performed for the proposal-only review.

## Root integration — 2026-10-19

Accepted the product-specific portion. Root refreshed the existing `WP02A4-KH-S02` source entry, changed the row's `measurementState` to `researched_supported`, and added observation `la-milanaise-white-khorasan-flour-third-cup-60g-r797-20261019`. No active reference field, alias, density, mapping, form, recipe link, or substitution state changed. No software tests were run after the database-JSON-only update; see the [R797–R799 integration README](../batches/wp02-wp03-wp04-r797-r799-gap-review-integration-20261019/README.md).
