# WP02 Section A — hard red winter wheat flour identity review (R219, 2026-10-16)

## Review record

- **Reviewed and sources accessed:** 2026-10-16.
- **Status:** Submitted proposal accepted and integrated on 2026-10-16. The handoff changed no shared catalog data; see the R219–R225 gap-review integration README. No app tests or emulator checks were run because the integrated additions are database JSON data and documentation under `AGENTS.md`.
- **Scope:** One currently unowned regional wheat-flour product candidate under the open Section A checklist item, “Add the remaining functionally distinct regional wheat-flour identities.”
- **Prior-work boundary:** R216 integrated Farinart’s soft red winter wheat flour. Farinart’s same current product-range page names a separate hard red winter flour, but R216 did not review or allocate it. WP03 R156 reviewed hard red winter wheat berries as whole kernels, not flour. No focused proposal, accepted item, or hold for a hard red winter flour identity was found.
- **Proposed source-ID namespace:** `WP02-A-HRWW-FLOUR-R219-20261016-S01` through `S02`. The prefix was checked against the current ledger and proposal/batch archive and was unused. The two new source IDs are allocated on the accepted ledger record; previously registered Farinart, CEHRW, and OQLF sources are reused under their existing IDs.

## Decision

**Add one identity-only reference: hard red winter wheat flour / farine de blé rouge d’hiver dur**, category **`FLOUR_AND_STARCH`**.

Farinart’s current Québec product-range page names **“Farine de blé rouge d’hiver dur”** and describes it as offering strength and structure for breads. The matching English launch announcement lists hard red winter wheat flour in the same range of whole-grain, stone-milled flours made from grain grown in Québec for artisan bakeries. This supplies a current local product name and a functional distinction from the soft red winter flour already accepted under R216.

The proposal is scoped to food-grade flour marketed with the hard red winter wheat source class. It does not assert a cultivar, formal Canadian Grain Commission class, protein specification, extraction grade, or exact composition beyond Farinart’s own whole-grain range description. Farinart does not name the wheat variety or a CEHRW/CWRW class assignment. Keep this product distinct from generic bread flour, high-gluten flour, soft red winter wheat flour, whole-wheat flour, and hard red winter wheat berries.

### Proposed reference fields

| Field | Proposal |
|---|---|
| ID | `ingredient-ref-hard-red-winter-wheat-flour` |
| English display | **hard red winter wheat flour** |
| Québec French display | **farine de blé rouge d’hiver dur** — exact wording on Farinart’s current Québec product-range page |
| English aliases | None |
| French aliases | None |
| Category | `FLOUR_AND_STARCH` |
| Forms, density, unit mappings, conversions, yields, recipe links | None |

Do not add `hard red winter flour`, `hard winter wheat flour`, `hard wheat flour`, `bread flour`, `strong flour`, `high-gluten flour`, `farine de blé de force`, `farine forte`, `farine à pain`, `CEHRW`, or `CWRW` as aliases. The full source-backed display names are sufficient. In particular, the existing high-gluten-flour row already owns the French search alias `farine de blé de force`; that generic functional term is not a synonym for Farinart’s source-qualified flour.

## Current ownership and prior decisions

The open [WP02 Section A checklist item](../../RecipeBook-global-ingredient-catalog-plan.txt#L1424) remains unresolved. Read-only checks covered the active ingredient references, ingredient forms, legacy-import candidates, research ledger, proposal archive, and batch archive.

| Current row or record | Current boundary |
|---|---|
| `ingredient-ref-hard-red-winter-wheat-berries` | Existing whole-kernel food identity; do not treat it as flour. Its R156 WP03 review explicitly separates grain berries from flour. |
| `ingredient-ref-soft-red-winter-wheat-flour` | R216 flour sibling from Farinart’s same range; keep the hard product separate. |
| `ingredient-ref-high-gluten-flour` | Functional flour category with existing French alias `farine de blé de force`; neither alias nor class assignment for the proposed product. |
| Generic bread, whole-wheat, pastry, and cake flour rows | Keep their existing culinary or milling boundaries; do not map them automatically to hard red winter wheat flour. |

The active package snapshot has **1,614 ingredient references, 122 forms, 61 legacy candidates, and 1,959 ledger records**. The only active reference hit for the proposed source phrase is the hard red winter **berries** row. No active flour form or legacy candidate owns the proposed flour. The exact proposed reference ID and the R219 source-ID prefix were absent from the active ledger; the prefix was also absent from proposal and batch archives.

Related archive mentions do not resolve this candidate: R156 is the whole-kernel identity review; R216 records the Farinart hard red winter product only as the sibling of its accepted soft red winter flour. No prior flour proposal or naming hold for this hard red winter product was found.

## Canadian and Québec naming and class boundary

Farinart is a Québec grain processor. Its current May 2026 French page lists **farine de blé rouge d’hiver dur** separately from **farine de blé rouge d’hiver tendre**, says the range is stone-milled and whole-grain, and describes the hard product’s bread function. Its April 21, 2026 English launch announcement describes a 100% Québec-grown whole-grain range made from locally grown grains for artisan bakeries and includes both hard and soft red winter wheat flours. This supports the two proposed displays as market wording, not broad consumer-retail availability.

The Canadian Grain Commission groups wheat varieties into regional classes according to variety designation and functional characteristics. Its current French class table lists a Western Canadian red winter class (**CWRW**) and an Eastern Canadian hard red winter class (**CEHRW**). The Commission’s 2026 CEHRW designated-variety list uses **blé de force rouge d’hiver de l’Est canadien** and lists varieties assigned to that formal class. Farinart’s page supplies no variety or class code, so do not classify its Québec product as CEHRW or CWRW. The directly attested Québec product wording is the better display for this reference; the formal class phrases are not activated as aliases.

Grain Farmers of Ontario’s 2025 technical sheet describes Ontario CEHRW composites as suitable for bread, flatbread, noodle, and pizza dough applications, with good baking strength and blending potential. These class-level findings corroborate that hard red winter wheat has baking functionality distinct from soft red winter wheat; they are not specifications for Farinart’s flour.

## Measurement and substitution evidence

- Farinart’s current product page gives no household volume, flour mass, package size, density, or reusable unit conversion.
- Grain Farmers of Ontario’s 2025 technical sheet reports a **74.9% milling yield** and **54.5% farinograph water absorption** for a tested grade-2-or-better Ontario CEHRW composite, along with controlled baking-test data. These are milling and laboratory-quality results, not cup-to-mass evidence, a kitchen density, or numeric properties for Farinart’s unidentified wheat variety. Do not transfer them into recipe conversions.
- Farinart describes the hard flour’s bread use as offering strength and structure. Neither its page nor the reviewed class-quality source gives a replacement ratio. Do not infer a 1:1 substitution for bread flour, high-gluten flour, soft red winter flour, or generic whole-wheat flour. Add no global or contextual substitution rule.
- If accepted, record `measurementState: researched_no_supported_value` and `substitutionResearchState: researched_no_supported_substitute`; leave `defaultDensity` null and unit mappings, forms, conversions, yields, and active substitutions empty.

## Bundled recipe demand

The current manifest lists **114 recipes and 1,123 structured ingredient rows**. Case-insensitive, accent-normalized scans of all manifest-listed recipe files found zero hits for `hard red winter wheat flour`, `hard red winter flour`, `hard red winter wheat`, `farine de blé rouge d’hiver dur`, `farine de blé de force rouge d’hiver`, and the proposed reference ID. No recipe link or relink is proposed. The priority comes from the open regional flour checklist and a current Québec flour product, not bundled recipe demand.

## Source register

New proposal-local sources below were accessed on 2026-10-16. The S01–S02 namespace was unused in the ledger and proposal/batch archive when checked. The Farinart page and launch release already cited by R216, and the CEHRW designated-variety list and OQLF term already in the ledger, are reused under their registered source IDs.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| **Reused: WP02-A-FLOUR-GAP-R216-20261016-S01** | Farinart, [farines intégrales issues de l’agriculture régénératrice](https://farinart.ca/fr/farinart-farines-integrales-agriculture-regeneratrice/), current May 2026 French product-range page. | Already registered in the ledger for R216. Its hard-winter sibling locator directly names `Farine de blé rouge d’hiver dur`, distinguishes the soft red winter flour, and describes bread strength/structure, stone milling, whole-grain products, and Québec-grown grain. Does not state a wheat variety, formal grain class, package size, household measure, or substitution ratio. |
| **Reused: WP02-A-FLOUR-GAP-R216-20261016-S02** | Farinart Inc. via CNW, [Farinart launches a new range of 100% local whole-grain bakery flours](https://www.newswire.ca/news-releases/farinart-launches-a-new-range-of-100-local-whole-grain-bakery-flours-from-regenerative-agriculture-884771945.html), 2026-04-21. | Already registered in the ledger for R216. Names soft and hard red winter wheat flours in the Québec-grown, stone-milled range for artisan bakeries. Supports the English display and market context, not an individual variety, CEHRW/CWRW class assignment, retail package, or household measure. |
| **WP02-A-HRWW-FLOUR-R219-20261016-S01** | Canadian Grain Commission, [Classes de blé canadien](https://www.grainscanada.gc.ca/fr/qualite-grains/classement-des-grains/classes-ble.html), current French class table. | Lists the CWRW and CEHRW red winter classes, their regional and functional distinctions, and the variety-designation framework. It does not assign Farinart’s product to a regulated class. |
| **WP02-A-HRWW-FLOUR-R219-20261016-S02** | Grain Farmers of Ontario with Cereals Canada, [Ontario Hard Red Winter Wheat — 2025 Technical Information](https://gfo.ca/wp-content/uploads/2026/01/Hard_Red_Winter_Wheat_Tech_Sheet-2025.pdf), 2025 harvest composite data. | Reports representative Ontario CEHRW technical and test-baking results, including milling yield, farinograph absorption, bread performance, and blending potential. These are class- and test-specific; they do not identify Farinart’s product, supply a household measure, or establish a substitution ratio. |
| **Reused: WP03-HARDREDWINTER-R156-20261015-S01** | Canadian Grain Commission, [Blé de force rouge d’hiver, Est canadien (CEHRW)](https://www.canada.ca/fr/commission-grains/services/systeme-qualite-grains/arretes/lvd-ble-cehrw.html), 2026-07 designated-variety list. | Already registered in the ledger. Supports the official French CEHRW class name and variety-based class assignment; it does not classify Farinart’s product. |
| **Reused: WP02-HG-FORCE-20261012-S01** | Office québécois de la langue française, [`farine de blé de force` (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357376/farine-de-ble-de-force). | Already registered in the ledger. Defines the generic Québec term for flour from strong, gluten-rich wheat, mainly used for bread. It does not attest Farinart’s full product wording or assign it to the existing high-gluten category; do not use it as an alias here. |

## Local evidence references

- Active checklist: [WP02 Section A open regional wheat-flour item](../../RecipeBook-global-ingredient-catalog-plan.txt#L1424).
- Adjacent accepted flour: [R216 soft red winter wheat flour proposal](wp02-a6-or-section-a-gap-review-r216-20261016.md).
- Adjacent whole-kernel decision: [R156 hard red winter wheat berries proposal](wp03-section-f-next-grain-gap-review-r156-20261015.md).
- Read-only ownership and demand checks used the active [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), and the manifest-ordered recipe corpus.
