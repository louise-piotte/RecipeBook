# WP02 Section A — hard red spring wheat flour identity review (R222, 2026-10-16)

## Review record

- **Reviewed and sources accessed:** 2026-10-16.
- **Status:** Submitted proposal accepted and integrated on 2026-10-16. The handoff changed no shared catalog data; see the R219–R225 gap-review integration README. No app tests or emulator checks were run because the integrated additions are database JSON data and documentation under `AGENTS.md`.
- **Scope:** One currently unowned regional wheat-flour product identity under the open Section A checklist item, “Add the remaining functionally distinct regional wheat-flour identities.”
- **Prior-work boundary:** R152 integrated hard red spring wheat berries as an intact-kernel `GRAIN_AND_CEREAL` identity. The WP02 high-gluten review describes a Canadian high-gluten product milled from hard red spring wheat, but it reviews the narrower high-gluten class and its French alias, not the source-qualified flour family. R216 concerns soft red winter wheat flour; R219 concerns hard red winter wheat flour. Both winter-flour candidates are excluded from this R222 review. No focused hard red spring wheat flour proposal, acceptance, or hold was found.
- **Proposed source-ID namespace:** `WP02-A-HRSW-FLOUR-R222-20261016-S01` through `S06`. The prefix and filename were checked against the active ledger and proposal/batch archive and were unused. The six new source IDs are now allocated on the accepted ledger record; registered CGC, OQLF, and Ardent Mills sources are reused.

## Decision

**Add one identity-only reference: hard red spring wheat flour / farine de blé de force roux de printemps**, category **`FLOUR_AND_STARCH`**.

The proposed identity is for food-grade flour that a producer or seller explicitly identifies as milled from hard red spring wheat. Current Canadian mill and seller pages offer named hard-red-spring flour products. Québec French product pages also use `blé de force roux de printemps` to describe flour made from Canadian hard red spring wheat. The complete French display is a transparent, source-backed construction; it is not an OQLF entry or a located Québec product title for a single-ingredient flour marketed under that exact full name.

Do not interpret the source phrase as one formal Canadian Grain Commission class, a specific variety, or a single flour grade. The Commission groups Canadian varieties into regional classes by function. Its current class table identifies several red-spring classes with differing characteristics; the reviewed retail and mill products do not assign their wheat to a designated class or variety. The proposed identity preserves the marketed wheat-source distinction and does not assert a protein threshold, extraction rate, whole-grain status, bleaching status, origin, or special use for every product carrying this source description. The specific milling product remains whatever the source says it is.

### Proposed reference fields

| Field | Proposal |
|---|---|
| ID | `ingredient-ref-hard-red-spring-wheat-flour` |
| English display | **hard red spring wheat flour** |
| Québec French display | **farine de blé de force roux de printemps** — source-backed construction using current Canadian French terminology and Québec product descriptions |
| English aliases | None |
| French aliases | None |
| Category | `FLOUR_AND_STARCH` |
| Forms, density, unit mappings, conversions, yields, recipe links | None |

Do not add `hard red spring flour`, `hard wheat flour`, `bread flour`, `high-gluten flour`, `farine de blé de force`, `farine à pain`, `farine tout usage`, `whole-wheat flour`, `whole grain flour`, `CWRS`, `CERS`, or `CWES` as aliases. The broad French `farine de blé de force` is already a search alias on the active high-gluten-flour identity. The full proposed source phrase should remain explicit. Do not merge source-qualified flour with whole-kernel wheat berries or with existing whole-wheat, bread, all-purpose, and high-gluten flour identities.

## Current ownership and prior decisions

The read-only active snapshot contains **1,614 ingredient references, 122 forms, 61 legacy candidates, and 1,959 research-ledger records**.

| Existing identity or record | Boundary to preserve |
|---|---|
| `ingredient-ref-hard-red-spring-wheat-berries` | R152's intact whole-kernel food product. It is not flour and receives no flour alias. |
| `ingredient-ref-high-gluten-flour` | A functional flour grade, with `farine de blé de force` as a generic French alias. Ardent Mills identifies its own high-gluten flour as milled from Canadian hard red spring wheat. That one product relationship does not make all hard-red-spring flour high-gluten flour. |
| `ingredient-ref-bread-flour` and `ingredient-ref-all-purpose-flour` | Existing culinary classes. Some named hard-red-spring products are marketed for bread or all-purpose use, but this does not establish a general synonym or grade crosswalk. |
| `ingredient-ref-whole-wheat-flour`, `ingredient-ref-white-whole-wheat-flour`, and `ingredient-ref-whole-wheat-pastry-flour` | Existing milling or culinary identities. A product's source wheat does not establish whether it is whole, white, or pastry flour. |
| `ingredient-ref-whole-red-fife-flour` and `ingredient-ref-white-red-fife-flour` | Cultivar-qualified flour identities; keep Red Fife separate from generic hard-red-spring products. |
| `ingredient-ref-soft-red-winter-wheat-flour` | R216's accepted soft winter sibling. It remains distinct from hard red spring flour. |
| R219 hard red winter flour proposal | Separate sibling candidate; excluded by this handoff and not an active owner in the current package. |

Exact phrase and ID checks found no hard-red-spring-flour owner in active references, forms, legacy candidates, or the ledger. The ledger contains the HRS wheat-berry record and the high-gluten-flour record, but no HRS flour record. Proposal and batch archive searches found the R152 whole-kernel review, the high-gluten product/source discussion, and R216's laboratory study reference to hard red spring flour; none decides a hard-red-spring flour identity. The Japanese flour holds, Manitoba grade recheck, and other held candidates do not concern this identity.

## Canadian and Québec market and terminology evidence

Engrained Flour Co. currently lists **“Hard Red Spring – Sifted Flour”** and describes it as a Manitoba-milled flour made from hard red spring wheat. It reports an 80–85% extraction rate for this product and lists 1 kg and 2.5 kg packages. Its page also lists a separate hard-red-spring whole-grain flour. NutraSun says its western-Canadian mill produces baker's flour from hard red spring wheat in white, whole-grain, and whole-wheat varieties. These pages establish currently marketed Canadian flour products and demonstrate that the grain-source wording does not by itself specify one extraction grade or preparation [S01–S02].

For Québec context, Nature Sante lists Anita's unbleached all-purpose flour and describes it in French as milled from Canadian `blé de force roux de printemps`. The listing is for that all-purpose product, not a pure class-wide flour label. Coop Agrobio du Québec currently lists a white, unbleached, organic bread flour made from red spring wheat, roller-milled to T65 and supplemented with malted barley. This is a composite product and supports local French market wording only; it is not evidence for an alias to `farine à pain`, for a pure single-ingredient flour, or for a general T65 mapping [S03–S04].

The current Canadian Grain Commission's French class table uses `blé de force roux de printemps` within red-spring class descriptions. Its English table describes the CWRS class as hard red spring wheat, and distinguishes it from other spring classes. The French NRC Canada page for its REDS-1 certified reference material uses the phrase `farine de blé de force roux de printemps`; that page supports French terminology only, because REDS-1 is a laboratory reference material rather than a consumer flour. I therefore propose the full French display as an explicit descriptive construction, not as a verified standalone Québec retail title or OQLF-approved term [S05–S06; reused S07–S09].

The Canadian Grain Commission's current 2025 CWRS report describes that single class as having strong milling and baking performance and flour with high water absorption, suitable for pan breads and other products. These statements are specific to the CWRS harvest class and its testing. The report does not classify the products above as CWRS and does not supply universal properties for all flour described as hard red spring [S06].

## Measurement and substitution evidence

- **Household measurement:** None of the reviewed sources gives a transferable cup-to-mass value, volumetric density, or recipe unit mapping for hard-red-spring flour. The Engrained and Québec retail package sizes are package quantities, not household measures. The CGC report's milling yields, flour extraction samples, farinograph absorption, and 50 g test bowls are laboratory or industrial data, not kitchen conversions. Do not derive a default density or unit mapping from those values.
- **Product-level substitution:** Engrained says its specific 80–85%-extraction sifted flour may be used instead of all-purpose flour, but gives no ratio or recipe conditions. Keep that statement source-specific; it does not establish a general substitution rule for hard-red-spring flour or other all-purpose flour. Ardent Mills' hard-red-spring-derived high-gluten flour is a separately named product, not a general hard-red-spring replacement recommendation.
- **If accepted:** Set measurement research to `researched_no_supported_value` and transferable substitution research to `researched_no_supported_substitute`. Leave `defaultDensity` null, `unitMappings` empty, and forms, conversions, yields, recipe links, and active substitution rules empty. A source-specific substitution finding may preserve Engrained's unquantified product claim without making it active.

## Bundled recipe demand

The current seed manifest lists **114 recipes and 1,123 structured ingredient rows**. All manifest-listed recipe files and ingredient rows were scanned for normalized forms of `hard red spring wheat flour`, `hard red spring flour`, `red spring wheat flour`, `hard red spring wheat`, `farine de blé de force roux de printemps`, `farine de blé roux de printemps`, the proposed reference ID, and the existing hard-red-spring wheat-berry ID. The scan found **zero candidate text hits in recipe files and zero ingredient-row hits**. No row is linked to the existing hard-red-spring wheat-berries or high-gluten-flour references. No recipe link, relink, or substitution link is proposed.

## Source register

The new S01–S06 IDs were checked against the active research ledger and proposal/batch archive and are proposal-local. Reused sources keep their registered IDs; this proposal does not allocate them in shared data.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP02-A-HRSW-FLOUR-R222-20261016-S01` | Engrained Flour Co., [Hard Red Spring – Sifted Flour](https://engrainedflour.ca/product/red-spring-100-whole-grain-sifted/), current product page. | Names a Canadian hard-red-spring flour product, describes the product's 80–85% extraction and use, and lists package sizes. Its extraction, usage, and package claims apply to this one sifted flour. Its all-purpose substitution statement has no ratio or recipe scope. |
| `WP02-A-HRSW-FLOUR-R222-20261016-S02` | NutraSun Foods, [Conventional Flours](https://www.nutrasunfoods.com/products/conventional-flours/), current flour range. | Says its western-Canadian mill produces baker's flour from hard red spring wheat and lists white, whole-grain, and whole-wheat variants. This is one manufacturer's flour range, not a universal class or technical specification. |
| `WP02-A-HRSW-FLOUR-R222-20261016-S03` | Nature Sante, [Farine tout usage non blanchie Anita's](https://naturesante.ca/fr/products/62363699895), current Québec retailer listing. | The French description says the product is milled from Canadian `blé de force roux de printemps`. It is an all-purpose product listing and does not establish that this phrase is a standalone flour title or that the flour class is all-purpose. |
| `WP02-A-HRSW-FLOUR-R222-20261016-S04` | Coop Agrobio du Québec via Arôme des Champs, [Farine de blé à pain biologique](https://boutiquearomedeschamps.com/products/farine-de-ble-tout-usage-biologique-copie), current product listing. | A Québec cooperative's white, unbleached, organic bread flour is described as made from red spring wheat and roller-milled to T65, with malted barley added. Supports Québec French food-market context only; the product is composite and its T65 grade is not a general wheat-class mapping. |
| `WP02-A-HRSW-FLOUR-R222-20261016-S05` | National Research Council Canada, [REDS-1](https://www.nrc.canada.ca/fr/certifications-evaluations-normes/materiaux-reference-certifies/liste/141), current French certified reference-material listing. | Uses `farine de blé de force roux de printemps` in French for a hard-red-spring wheat flour reference material. Terminology evidence only; it is not a consumer food product or a household measure. |
| `WP02-A-HRSW-FLOUR-R222-20261016-S06` | Canadian Grain Commission, [Quality of Canada Western Red Spring wheat in 2025](https://www.canada.ca/en/grain-commission/services/science/harvest-export-quality/wheat-cwrs/2025-harvest-quality-cwrs-wheat.html), 2025 harvest report. | Describes CWRS milling, baking, and flour quality and laboratory measures. CWRS is one Canadian class within the broader hard-red-spring market wording; its class data do not classify the reviewed products or yield household conversions. |
| **Reused: `WP03-HRSW-R152-20261015-S01`** | Canadian Grain Commission, [Canadian wheat classes](https://www.canada.ca/en/grain-commission/services/grain-quality-system/wheat-classes.html), current class table. | Already registered in the ledger. Groups Canadian wheat varieties by regional class and function; its classes show that hard red spring is not a cultivar or a single specified milling grade. |
| **Reused: `WP03-HRSW-R152-20261015-S02`** | Canadian Grain Commission, [Classes de blé canadien](https://www.grainscanada.gc.ca/fr/qualite-grains/classement-des-grains/classes-ble.html), current French class table. | Already registered in the ledger. Uses `blé de force roux de printemps` in red-spring class descriptions. Supports French class terminology, not an OQLF ruling or an exact standalone flour product title. |
| **Reused: `WP02-HG-FORCE-20261012-S01`** | Office québécois de la langue française, [`farine de blé de force`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357376/farine-de-ble-de-force), GDT entry. | Already registered in the ledger. Supports the generic Québec term for flour from strong, gluten-rich wheat; its broad term remains on the existing high-gluten-flour alias list and is not proposed as an HRS flour alias. |
| **Reused: `WP02-HG-FORCE-20261012-S02` and `S03`** | Ardent Mills Canada, [Haute teneur en gluten](https://ardentmills.ca/fr/products/traditional-wheat/standard-flours/high-gluten/) and [High Gluten Flour](https://ardentmills.ca/products/traditional-wheat/standard-flours/high-gluten/), current bilingual product pages. | Already registered in the ledger. Identify Ardent Mills' high-gluten flour as milled from Canadian hard red spring wheat and name it as a separate high-gluten product. Supports the source-versus-functional-grade boundary, not a universal formula or HRS-wide high-gluten equivalence. |

## Local evidence references

- Active checklist: [WP02 Section A open regional wheat-flour item](../../RecipeBook-global-ingredient-catalog-plan.txt#L1424).
- Adjacent source-grain identity: [R152 hard red spring wheat berries proposal](wp03-section-f-next-grain-gap-review-r152-20261015.md).
- Existing functional-grade boundary: [WP02 high-gluten flour Québec term review](wp02-high-gluten-flour-force-alias-boundary-review-20261012.md).
- Winter sibling exclusions: [R216 soft red winter flour proposal](wp02-a6-or-section-a-gap-review-r216-20261016.md) and [R219 hard red winter flour proposal](wp02-a-or-a6-hard-red-winter-wheat-flour-review-r219-20261016.md).
- Read-only ownership and demand checks used the active [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), and manifest-ordered recipe corpus.
