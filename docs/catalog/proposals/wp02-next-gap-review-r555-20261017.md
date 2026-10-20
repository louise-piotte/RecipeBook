# WP02 Section A4 medium rye flour measurement and substitution review — R555 — 2026-10-17

## Review record

- **Reviewed and sources accessed:** 2026-10-17.
- **Status:** Integrated by root on 2026-10-17. The research ledger, plan, roadmap, and R555–R557 integration README were updated; active catalog data and rules remain unchanged.
- **Scope:** Complete the missing measurement and general wheat-replacement research states for the existing `ingredient-ref-medium-rye-flour`. Preserve its accepted market-grade identity and the distinction from generic, light, whole, malted, and meal rye products.
- **Exact plan anchor:** The still-open WP02 Section A4 parent at [line 1658](../../RecipeBook-global-ingredient-catalog-plan.txt#L1658) calls for resolving rye by useful extraction/grind and related milling distinctions. The existing medium-rye identity-only item at [line 1696](../../RecipeBook-global-ingredient-catalog-plan.txt#L1696) explicitly leaves measurements and substitutions open. R555 reviews only that row; it does not duplicate R549 malted-barley, R552 roasted-barley, or R281 whole-barley work, and it does not close the A4 parent.
- **New source IDs:** `WP02-A4-MRYE-MEAS-SUB-R555-20261017-S01` is proposal-local for the USDA SR28 medium-rye-flour entry; `S02` is proposal-local for Angioloni and Collar's breadmaking study. The exact study DOI/URL and R555 prefix were not present in the current research ledger or catalog archive. The USDA PDF URL already has records for other food codes; the existing rye record uses NDB 20062 and does not cover NDB 20064. Reuse existing IDs for the Canadian reference-amount page and Brant's product definition rather than minting duplicate URL records.

## Bounded decision

**Add one historical source-specific portion observation and an evidence-only no-general-substitution finding; add no active conversion or substitution behavior.** If accepted, set `measurementState` to `researched_supported` because USDA SR28 publishes one cup at 102 g for its named `Rye flour, medium` food record. Set `substitutionResearchState` to `researched_no_supported_substitute` for a reusable home-recipe replacement amount. Keep `identityState: verified`.

Keep `defaultDensity: null` and `unitMappings: []`. The USDA table does not state cup volume, a filling method, or whether the record matches any current Canadian product specification. Store the 102 g only as a source-specific published portion; do not make it a row-wide cup conversion. Add no form, cooking or package yield, recipe link, global form rule, contextual wheat replacement rule, preferred alternative, or recipe-line substitution.

## Current catalog and source-ID ownership

The active reference is `medium rye flour / farine de seigle moyenne`, category `FLOUR_AND_STARCH`, with no aliases, null density, and empty unit mappings. Its ledger row is identity-verified; `measurementState` and `substitutionResearchState` are both `not_yet_researched`, with no measurement observations or substitution findings. No form points to the row, no global or contextual rule involves it, and the package-yield file has no entry for it.

| Existing source ID or URL | Current owner and scope | R555 handling |
|---|---|---|
| `WP02-MED-DARK-RYE-BOUNDARY-20261011-S01` through `S05`; `WP02-MED-RYE-FRCA-20261011-S02` | Existing medium-rye ledger row. They establish the middle-grade identity, product distinctions, and accepted French display; none records a household measure or replacement formula. | Reuse only for the existing identity and grade boundaries. |
| `WP02-MED-DARK-RYE-BOUNDARY-20261011-S02` | Brant Flour Mills' current milling guide, on the target row. It describes the mill's medium rye flour as fine and partially sifted, with bran flakes removed. | Reuse as one mill's product-grade context. It does not define a universal milling threshold or give a measure or substitution amount. |
| `WP03-RYE-RECHECK-20261010-S05` | The USDA SR28 Food Group 20 PDF URL is already attached to `ingredient-ref-rye-grain` and `ingredient-ref-rye-berries`, for NDB 20062, “Rye grain.” The same PDF URL is also used under `WP03-DURUM-GRAIN-20261012-S05` for durum wheat. | Use new R555 S01 for the distinct NDB 20064, “Rye flour, medium” locator and 102 g measure. Do not repurpose the rye-grain source entry, whose locator and observation describe a different food code. |
| `WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012-S10` | Health Canada's current Table of Reference Amounts for Food, currently attached to `ingredient-ref-sprouted-buckwheat-flour`; it cites item C.6. | Reuse as a Canadian regulatory boundary: C.6 assigns 30 g to flours including rye. This is a nutrition-labelling reference amount, not a household portion or cup-to-mass conversion. |
| `WP02-A4-MRYE-MEAS-SUB-R555-20261017-S01` | No existing owner. The R555 ID is new for the specific USDA NDB 20064 row in the official SR28 report. | If accepted, add once to the existing medium-rye ledger record. The value is an old source-specific common measure, not a current Canadian product specification. |
| `WP02-A4-MRYE-MEAS-SUB-R555-20261017-S02` | No existing owner. Angioloni and Collar DOI and page URL were not found in the current catalog archive. | If accepted, add once to the existing medium-rye ledger record. The study supports one controlled breadmaking context, not a reusable home ratio. |

The [medium/dark rye product-boundary review](wp02-medium-dark-rye-product-boundary-review-20261011.md) intentionally accepted medium rye as a named grade without measurements or substitution data. No earlier proposal was found that reviews measurement or substitution for the active medium-rye row. Keep the broad dark-rye candidate held because supplier grade scopes vary, and do not transfer findings between medium, light, whole, generic, malted, or meal rye identities.

## Bilingual naming and picker projection

Retain the current English display `medium rye flour` and accepted Québec French display `farine de seigle moyenne`. Both alias lists remain empty. TERMIUM and the independent Québec wording review already support the current French wording; this is not a new terminology proposal.

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): accents, punctuation, and case are normalized; complete word phrases are returned before partial matches. The current reference and form data project as follows:

| Query | Current results | R555 effect |
|---|---|---|
| `medium rye flour`; `farine de seigle moyenne` | Only `ingredient-ref-medium-rye-flour`. | No change; preserve the exact bilingual identity. |
| `rye flour`; `farine de seigle` | Five rows: generic, light, malted, medium, and whole rye flour. | No change; preserve the multi-result grade family. |
| `rye meal`; `pumpernickel flour` | Only `ingredient-ref-rye-meal`. | No change; keep the coarse meal and pumpernickel terms off medium flour. |

This is a static projection, not a live Android picker test. R555 proposes no display, alias, form, or picker-term changes.

## Bundled recipe demand and package context

Scanned all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**. Exact case-insensitive searches of ingredient rows and full recipe documents for `medium rye flour`, `farine de seigle moyenne`, and `ingredient-ref-medium-rye-flour` found **zero matching files and zero matching rows**. The bundled library has no medium-rye recipe link, recipe-specific measure, dish context, or demand for a wheat replacement.

Brant's current milling guide defines its medium product's grind/sifting scope but lists no household serving or paired mass and volume. Health Canada's C.6 reference amount of 30 g applies to label serving presentation for a family of flours that includes rye; it does not prescribe a recipe amount and gives no medium-rye-specific volume. No Canadian or Québec consumer package/recipe source was found that links a medium-rye product to a household measure.

## Measurement, density, and conversion evidence

- The USDA Agricultural Research Service's [National Nutrient Database for Standard Reference, Release 28, Food Group 20](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg20.pdf) identifies **NDB 20064, `Rye flour, medium`**, states `Measure 1 = 102g: 1 cup`, and lists 0% refuse. This is a direct, exact-grade published common measure [S01]. It is a 2015 U.S. food-composition record, not a present-day Canadian brand or standardized medium-rye milling specification. The table does not state the cup's volume or flour-filling method.
- Brant Flour Mills, an Ontario mill, currently describes its own medium rye product as fine, partially sifted flour with bran flakes removed [reused `WP02-MED-DARK-RYE-BOUNDARY-20261011-S02`]. This supports the product-grade scope but does not show that its flour is the same sample as NDB 20064 or provide a mass/volume value.
- Health Canada's current [Table of Reference Amounts for Food](https://www.canada.ca/en/health-canada/services/technical-documents-labelling-requirements/nutrition-labelling-table-reference-amounts-food.html), item C.6, sets **30 g** for flours and cornmeal, including rye. This is for nutrition labelling and is not a household-measure conversion, generic serving recommendation, density, or medium-rye-specific portion [reused `WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012-S10`].
- USDA FoodData Central lists SR Legacy as its final Standard Reference release, and says that data type will not be updated. The USDA table therefore remains useful as a traceable historical observation, not as evidence of current Canadian retail specifications [USDA FoodData Central, download page](https://fdc.nal.usda.gov/download-datasets/).

The bounded supported delta is the NDB 20064 **1 cup = 102 g** observation only. Keep the US record's cup unconverted to a metric cup, and do not derive density from it because its cup volume is unstated. Keep `defaultDensity: null` and `unitMappings: []`; do not transfer 102 g to generic, light, whole, dark, or meal rye flour.

## Substitution evidence and limits

Brant's medium-rye product page gives a milling description but no advice for replacing wheat flour. Angioloni and Collar's original breadmaking study tests rye flour in controlled single- and multigrain matrices: the abstract reports an initial single-cereal matrix with 100% wheat-flour replacement, multigrain matrices at 20–44%, and a selected oat/rye/buckwheat/wheat mixture in a 20:20:20:40 weight ratio [S02]. The authors explicitly endorse that tested blend as suitable for the reported nutritional and functional objectives in baked goods. That is a recommendation for the study's particular multigrain formula and process context. The abstract does not identify its rye as medium grade, establish a match to Brant's product, or support using medium rye as a general home-recipe wheat replacement. The result therefore remains formula-specific evidence, not a reusable substitution rule.

The reviewed sources do not support a general medium-rye-for-wheat replacement amount across breads and other home recipes. Preserve the authors' endorsement only for their tested blend; do not infer water, gluten, leavening, texture, fermentation, or yield adjustments for another formula. A future recipe-specific wheat-to-rye suggestion would be an ingredient-to-ingredient contextual substitution and would need dish type, role, method, amount, and risk scope under [Requirements FR-5](../../../Requirements.md#L322) and [§6.5](../../../Requirements.md#L641). The bundled corpus supplies no medium-rye context. Add no active substitution rule or recipe-line substitution.

## Proposed ledger delta and integration recommendation

If accepted, update only `ingredient-ref-medium-rye-flour` in `docs/catalog/research-ledger.v1.json`:

| Field | Proposed value |
|---|---|
| `identityState` | Keep `verified`. |
| `measurementState` | `researched_supported`. |
| Observation ID | `medium-rye-flour-usda-sr28-portion-r555-20261017`. |
| Observation | `relationship: portion_weight`; `value: 102`; `valueUnit: g`; `sourceQuantity: { amount: 1, unit: cup }`; `observedMassG: 102`; `evidenceKind: published_portion`. |
| Observation scope | `foodDescription: USDA SR28 NDB 20064, Rye flour, medium`; `foodState: As listed; 0% refuse`; `measurementMethod: Published USDA SR28 common measure; no cup-volume or filling method is stated`; `quantityBasis: One historical source-specific portion for NDB 20064 only; not a reusable mapping for the catalog identity`. |
| Observation `sourceIds` | New proposal-local `WP02-A4-MRYE-MEAS-SUB-R555-20261017-S01`. |
| `substitutionResearchState` | `researched_no_supported_substitute` for a general home-recipe wheat replacement. |
| Finding ID | `medium-rye-flour-no-general-home-wheat-substitute-r555-20261017`. |
| Finding `researchState` | `researched_no_supported_substitute`. |
| Finding `context` | Whether medium rye flour has a reusable wheat-flour replacement amount across home-recipe types and roles. |
| Finding `basis` | Brant's current product guidance identifies one mill's medium-rye milling scope but gives no recipe ratio. One original breadmaking study reports controlled rye-containing matrices and endorses a selected oat/rye/buckwheat/wheat blend (20:20:20:40 by weight) for the study's stated baked-goods objectives; it does not identify the rye as medium grade. Health Canada's C.6 amount is a label reference amount, not recipe guidance. |
| Finding `limitations` | Preserve the authors' endorsement only as evidence for that tested multigrain formula; do not encode it as a general or medium-rye substitution. Do not transfer it to other rye grades or infer hydration, leavening, texture, or yield adjustments. Do not interpret the 30 g label reference amount as a recipe serving. |
| Finding `sourceIds` | Reused `WP02-MED-DARK-RYE-BOUNDARY-20261011-S02`; reused `WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012-S10`; new proposal-local `WP02-A4-MRYE-MEAS-SUB-R555-20261017-S02`. |

Keep the reference JSON, names, aliases, forms, density, mappings, package yields, global/contextual substitution files, and recipes unchanged. Close only medium rye flour's measurement/substitution research subtask in the open A4 parent; leave broad rye extraction grades and the other parent topics open.

## Source register

Sources were accessed on **2026-10-17** unless their existing ledger record gives an earlier date. Reused IDs remain owned by their existing ledger row(s). The two new R555 source IDs are now attached to the medium-rye ledger row.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP02-A4-MRYE-MEAS-SUB-R555-20261017-S01` | USDA Agricultural Research Service, [National Nutrient Database for Standard Reference, Release 28, Food Group 20](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg20.pdf), NDB No. 20064. | Names `Rye flour, medium`; reports `Measure 1 = 102g: 1 cup` and 0% refuse. Direct, exact-grade published common measure. The 2015 U.S. food-composition record does not identify a current Canadian product, cup volume, or fill method. The URL is already in the ledger for other NDB records, but those source entries do not cover NDB 20064. |
| `WP02-A4-MRYE-MEAS-SUB-R555-20261017-S02` | Angioloni A. and Collar C., [“Nutritional and functional added value of oat, Kamut®, spelt, rye and buckwheat versus common wheat in breadmaking”](https://scijournals.onlinelibrary.wiley.com/doi/10.1002/jsfa.4314), *Journal of the Science of Food and Agriculture* 91(7) (2011), 1283–1292, DOI 10.1002/jsfa.4314. | Original breadmaking research; the authors endorse the selected 20:20:20:40 oat/rye/buckwheat/wheat blend for their reported baked-goods objectives. This is limited to the tested blend and process context; the rye grade is unspecified and the source does not establish a general medium-rye home-recipe replacement amount. |
| Reused `WP02-MED-DARK-RYE-BOUNDARY-20261011-S02` | Brant Flour Mills, [Milling Guide](https://www.brantflourmills.com/milling-guide), current medium rye product entry. | Describes this mill's medium rye flour as fine and partially sifted, with bran flakes removed. One product definition; no household measure or general milling threshold. |
| Reused `WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012-S10` | Health Canada, [Table of Reference Amounts for Food](https://www.canada.ca/en/health-canada/services/technical-documents-labelling-requirements/nutrition-labelling-table-reference-amounts-food.html), item C.6. | Sets a 30 g label reference amount for flour categories including rye. It is not a recipe measure, household portion, cup conversion, or medium-specific value. |
| **R01 — repository audit** | Current ingredient-reference, form, package-yield, and substitution-rule JSON; research ledger; open A4 plan; rye proposals and batches; `IngredientSearch.kt`; manifest-listed recipes. | Workspace snapshot on 2026-10-17. Confirms current source ownership, reference states, static picker projection, and zero bundled medium-rye recipe matches. |

## Integration status and static verification

Re-read the current `AGENTS.md`, the relevant unit-conversion and contextual-substitution requirements, the open A4 parent, the target reference and ledger records, adjacent rye identities, the earlier medium/dark rye boundary review, and the package manifest. Rechecked source-ID and URL ownership, the exact USDA food-code locator, static picker projection, and every manifest-listed recipe. The ledger schema/source validator accepted 2,169 records with no errors. No software tests were run because this integration only adds database JSON evidence and documentation under `AGENTS.md`.
