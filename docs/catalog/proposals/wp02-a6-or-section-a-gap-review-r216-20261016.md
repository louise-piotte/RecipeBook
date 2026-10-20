# WP02 Section A — soft red winter wheat flour identity review (R216, 2026-10-16)

## Review record

- **Reviewed and sources accessed:** 2026-10-16.
- **Status:** Submitted proposal accepted and integrated on 2026-10-16. The worker handoff itself changed no shared catalog JSON, ledger, recipe, checklist, roadmap, generated file, or batch record; see the R216–R218 integration README.
- **Scope:** One bounded candidate under the open Section A checklist item, “Add the remaining functionally distinct regional wheat-flour identities.”
- **Prior-work boundary:** The WP03 R159 review added soft red wheat berries, a whole-kernel identity. Its reuse of Farinart’s April 2026 flour announcement was phrase context only; it did not review or allocate a flour identity. This proposal concerns the milling product.
- **Proposed source-ID namespace:** **WP02-A-FLOUR-GAP-R216-20261016-S01** through **S06**. This prefix and each ID were checked against the active research ledger and proposal/batch archive and were unused at review time. These are proposal-local IDs only; none has been allocated in shared data.

## Decision

**Add one identity-only reference: soft red winter wheat flour / farine de blé rouge d’hiver tendre**, category **FLOUR_AND_STARCH**.

The current Farinart Québec product-range page names a flour with this exact French wording. Its English launch release describes the range as including soft and hard red winter wheat flours. Farinart presents the range as whole-grain, stone-milled, Québec-grown flour for artisan bakeries. This supports a named Canadian milling product and a source-grain class boundary. It does not establish a cultivar, protein specification, formal Canadian Grain Commission class assignment, or a general extraction grade for every flour made from soft red winter wheat.

Keep the proposed identity separate from generic whole-wheat flour, white whole-wheat flour, whole-wheat pastry flour, pastry flour, cake flour, and soft red winter wheat berries. The Ontario mill Arva also describes locally grown soft red winter wheat being milled into its branded Imperial Pastry Flour. That is evidence that the source class and a culinary flour grade can overlap in a specific product; it does not make “soft red winter wheat flour” a synonym for all pastry flour or establish a universal crosswalk. Do not assign the Farinart product to the formal CESRW class without cultivar or designation evidence.

### Proposed reference fields

| Field | Proposal |
|---|---|
| ID | **ingredient-ref-soft-red-winter-wheat-flour** |
| English display | **soft red winter wheat flour** |
| Québec French display | **farine de blé rouge d’hiver tendre** — current Farinart wording |
| English aliases | None |
| French aliases | **farine de blé tendre rouge d'automne** — exact wording in Farinart’s April launch release for the same new flour range; retain only as this product-family search variant |
| Category | **FLOUR_AND_STARCH** |
| Forms, density, unit mappings, conversions, yields, recipe links | None |

Do not add the broader aliases **soft wheat flour**, **soft wheat**, **soft red wheat flour**, **farine de blé tendre**, **farine de blé mou**, **farine à pâtisserie**, **pastry flour**, **cake flour**, or **CESRW**. OQLF’s preferred **farine de blé tendre** is a generic soft-wheat flour term. The CGC class name applies through designated varieties and region; Farinart does not identify a cultivar or class code. Keep the hard red winter sibling separate.

The April Farinart French release calls the soft red winter product “farine de blé tendre rouge d'automne”; the current May product page uses “farine de blé rouge d’hiver tendre.” The English announcement identifies the flour as winter wheat. The April wording is proposed only as an exact, supplier-specific search variant for this same range, not as a universal Québec French grade term. OQLF does not validate the full compound name.

## Current owners and prior decisions

A read-only check of the active package, forms, legacy identities, research ledger, proposal archive, and batch archive found no existing owner for the proposed ID or exact display phrases. The current package has 1,611 ingredient references and 122 forms; the legacy identity file has 61 candidates and the ledger has 1,956 records.

| Current reference | Current boundary |
|---|---|
| **ingredient-ref-soft-red-winter-wheat-berries** | Existing whole-kernel soft red winter wheat; keep separate from flour. |
| **ingredient-ref-soft-red-wheat-berries** | Existing unseasoned whole-kernel soft red wheat; do not infer winter season or milling. |
| **ingredient-ref-hard-red-winter-wheat-berries** | Hard winter grain sibling, not an alias or equivalent. |
| **ingredient-ref-whole-wheat-flour** and **ingredient-ref-white-whole-wheat-flour** | General whole-wheat milling identities; do not absorb a source-class-qualified flour. |
| **ingredient-ref-whole-wheat-pastry-flour**, **ingredient-ref-pastry-flour**, **ingredient-ref-cake-flour** | Existing culinary or extraction classes; retain their current identities and do not map them automatically to this regional flour. |
| **ingredient-ref-japanese-weak-wheat-flour** | Separate national flour class; “weak wheat” is not a soft-red-winter alias. |

The open [WP02 Section A item](../../RecipeBook-global-ingredient-catalog-plan.txt#L1424) remains unresolved after the completed sprouted-wheat, whole-spelt, Red Fife, and national wheat-type work. No active flour form or legacy candidate claims the proposed product. R159’s focused review is for berries, not flour, and its Farinart source entry is reused below only for the historical French wording.

## Canadian and Québec market and class evidence

Farinart’s current product page places the soft red winter flour beside a hard red winter flour in a Québec-grown whole-grain line, says the range is stone-milled, and describes it as intended for artisan bakeries. The company’s English launch release names soft and hard red winter wheat flours and says the grain is grown in Québec. This is direct Québec product-range evidence, not proof of consumer retail packaging or broad national availability.

The Canadian Grain Commission describes Canada Eastern Soft Red Winter (CESRW) as a distinct functional wheat class: low protein, high flour yield, and used for cakes, pastry, cereals, crackers, biscuits, and fillings. Its 2025 harvest report says CESRW is produced primarily in Ontario, with some production in Québec and Atlantic Canada. These facts make the class regionally relevant and functionally distinct, but they do not prove that Farinart’s unnamed cultivar belongs to CESRW. The CGC’s 2026 designated-variety order ties formal class assignment to named varieties; preserve that boundary.

OQLF lists **farine de blé tendre** and **farine de blé mou** as preferred generic terms for soft-wheat flour and describes that flour as lower in gluten and mainly used for pastries. It does not approve either full compound display proposed here. The current Farinart French wording is therefore the best available Québec-market display, with the older supplier wording kept as a narrow search alias.

## Measurement and substitution evidence

- Farinart’s current product page gives no household volume measure, cup weight, density, or reusable package-to-volume mapping.
- The CGC harvest report’s milling-yield values are industrial milling data, not kitchen measures. The KONA study tests soft red winter and hard red spring flour flow and consolidation properties using laboratory procedures, including 50 g samples; it does not provide a household cup-to-mass value. Do not convert its powder-handling results into recipe measurement data.
- Farinart describes intended soft-baked-product performance but provides no replacement ratio. The CGC’s end-use classes are not substitution directions.
- Arva’s current Flour Guide gives a 1:1 cake-or-pastry-flour substitution for its branded Imperial Pastry Flour. That guidance is tied to Arva’s specific low-protein product. It is not guidance for Farinart’s Québec whole-grain flour or for the soft red winter wheat class generally. Keep it out of global and contextual substitution rules.
- If integrated, record **measurementState: researched_no_supported_value** and **substitutionResearchState: researched_no_supported_substitute**. Leave density null and unit mappings, forms, conversions, yields, and substitution rules empty.

## Bundled recipe demand

The current manifest lists **114 recipes and 1,123 structured ingredient rows**. Case-insensitive scans of the complete recipe files found zero hits for soft red winter wheat flour, soft red winter flour, soft red wheat flour, soft wheat flour, the current and prior Farinart French phrases, or the proposed reference ID. No recipe link or relink is proposed. The gap is supported by the regional product and class coverage request, not by current bundled recipe demand.

## Source register

New sources were accessed on 2026-10-16. The proposed S01–S05 namespace is unallocated outside this review.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| **WP02-A-FLOUR-GAP-R216-20261016-S01** | Farinart, [current French whole-grain flour range](https://farinart.ca/fr/farinart-farines-integrales-agriculture-regeneratrice/), May 2026 range description. | Current Québec page lists “Farine de blé rouge d’hiver tendre” and a separate hard red winter flour; describes the line as local, whole-grain, stone-milled, and intended for artisan bakeries. It does not give cultivar, formal class, protein, package measure, or household conversion. |
| **WP02-A-FLOUR-GAP-R216-20261016-S02** | Farinart Inc. via CNW, [English launch announcement](https://www.newswire.ca/news-releases/farinart-launches-a-new-range-of-100-local-whole-grain-bakery-flours-from-regenerative-agriculture-884771945.html), 2026-04-21. | Names soft and hard red winter wheat flours in a Québec-grown whole-grain line. Supports the English phrase and local supplier context, not formal CESRW assignment. |
| **WP02-A-FLOUR-GAP-R216-20261016-S03** | Canadian Grain Commission, [Quality of Canada Eastern Soft Red Winter wheat in 2025](https://www.canada.ca/en/grain-commission/services/science/harvest-export-quality/wheat-cesrw/2025-harvest-quality-cesrw-wheat.html), 2025 harvest report. | Describes the CESRW class’s low protein, weak dough, common end uses, Eastern Canadian production, and milling quality. Class-level data are context only and do not assign the Farinart product to CESRW. Industrial flour yield is not a kitchen measure. |
| **WP02-A-FLOUR-GAP-R216-20261016-S04** | Zhao et al., [Effects of Powder Vibration and Time Consolidation on Soft and Hard Wheat Flour Properties](https://www.jstage.jst.go.jp/article/kona/38/0/38_2021007/_html/-char/en), KONA Powder and Particle Journal, 2021. | Studies SRW and HRS flour flow, compressibility, cohesion, permeability, and wall friction for handling and storage. Laboratory sample and consolidation data do not support a recipe volume-to-mass value or substitution rule. |
| **WP02-A-FLOUR-GAP-R216-20261016-S05** | Arva Flour Mills, [Our Story — grain by grain, farm by region](https://history.arvaflourmills.com/), soft red winter wheat and Imperial Pastry Flour section. | The Ontario mill says locally sourced soft red winter wheat becomes its branded Imperial Pastry Flour. This supports Canadian product context and a specific source-class/function overlap; it is not a synonym or crosswalk for all soft red winter wheat flour. |
| **Reused WP03-SRWB-R159-20261016-S04** | Canadian Grain Commission, [Classes de blé canadien](https://grainscanada.gc.ca/fr/qualite-grains/classement-des-grains/classes-ble.html). | Already registered in the ledger. Supports the official French class wording and the rule that class definitions are regional and variety-based; it does not classify Farinart’s flour. |
| **Reused WP03-SRWB-R159-20261016-S05** | Canadian Grain Commission, [2026 designated-variety order for CESRW](https://www.grainscanada.gc.ca/fr/qualite-grains/listes-des-varietes-designees/2026/lvd-ble-cesrw.html). | Already registered in the ledger. The order lists varieties assigned to the formal class; it is not a flour product label. |
| **Reused WP02A3-20261010-S05** | OQLF, [farine de blé tendre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357375/farine-de-ble-tendre). | Already registered in the ledger. Supports the generic French and English soft-wheat terms only, not the full regional grade wording. |
| **Reused WP03-SRWB-R159-20261016-S06** | Farinart Inc. via CNW, [French April 2026 launch announcement](https://www.newswire.ca/fr/news-releases/farinart-lance-une-nouvelle-gamme-de-farines-integrales-de-boulangerie-100-locales-issues-de-l-agriculture-regeneratrice-883487150.html). | Already registered in the ledger for the R159 berries review. It calls the corresponding flour “farine de blé tendre rouge d'automne”; reuse that source ID for the bounded product-family alias, not for a whole-kernel identity. |
| **WP02-A-FLOUR-GAP-R216-20261016-S06** | Arva Flour Mills, [Flour Guide](https://arvaflourmills.com/pages/flour-guide), Imperial Pastry baking and substitution notes. | The page gives a 1:1 cake-or-pastry-flour substitution for Arva’s branded Imperial Pastry product only. Keep this source-specific guidance out of global and contextual rules for the Farinart flour. This source ID uses a focused locator for the substitution evidence; the same page URL already appears in the ledger under a separate spelt-specific source ID. |

## Local evidence references

- Active checklist: [WP02 Section A open regional wheat-flour item](../../RecipeBook-global-ingredient-catalog-plan.txt#L1424).
- Prior flour review: [R206 whole spelt flour proposal](wp02-section-a-next-functional-wheat-flour-gap-review-r206-20261016.md).
- Adjacent grain review: [R159 soft red wheat berries proposal](wp03-section-f-soft-red-wheat-berries-identity-review-r159-20261016.md).
- Active references, forms, legacy identities, ledger, recipe manifest, and proposal/batch archive were inspected read-only for ownership and recipe demand.
