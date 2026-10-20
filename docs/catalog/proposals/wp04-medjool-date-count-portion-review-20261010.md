# WP04 Proposal: Medjool-Date Count and Edible-Portion Review

**Review date:** 2026-10-10
**Status:** integrated as source-specific ledger evidence on 2026-10-10. No recipe text, amount, or unit was changed.
**Scope:** One exact count line, Chocolate Dates `031#1`: `20 Medjool dates`.

## Disposition

Recommend recording one source-specific USDA published portion for the existing Medjool-date reference: **1 pitted Medjool date = 24 g edible portion** in USDA SR28 NDB 09421. The same record lists **8% pits** as refuse. The original recipe calls for Medjool dates and directs the cook to remove each pit, so the source food and pitted state match the recipe's edible ingredient.

This supports only the USDA record's named common measure. The report gives no retail grade, length, size class, product brand, measurement method, or weight range. Keep the value as an evidence observation, not an active `date → g` mapping. Do not multiply 24 g by the recipe's 20-count amount, estimate gross whole-date mass from the refuse percentage, carry the value to another date variety or preparation, or use the other Medjool recipe's 425 g amount to infer an average.

If accepted into the ledger, recommend a `count_weight` observation with `evidenceKind: published_portion` and measurement state `researched_supported` for this exact source-qualified portion. Recipe `031#1` remains `20 date`; its actual total mass remains unavailable because the recipe and the USDA entry do not specify a retail size or establish the mass of these particular dates. No runtime count conversion, density, unit mapping, package yield, form, substitution, or recipe edit is proposed.

## Exact recipe demand and current state

| Field | Current evidence |
|---|---|
| Recipe | `031` — Chocolate Dates (3 Flavors) / *Dattes au chocolat, 3 saveurs*. |
| Ingredient line | `fdb8f001-0f1a-4c73-a916-8721bdc1713f-ingredient-1` (`031#1`). |
| Exact bundled text | `20 Medjool dates`. |
| Structured amount | `quantity: 20`, `unit: "date"`; recipe yield is 20 dates. |
| Recipe preparation | The method says to slice each date open lengthwise and remove its pit. The publisher advises using whole dates and removing the seed, noting that pre-pitted dates can be dry inside. The date is stuffed, coated in chocolate, and frozen; the count observation concerns the date before stuffing/coating, after pit removal. |
| Source | Cooking With Ayeh, [Chocolate Dates](https://cookingwithayeh.com/chocolate-dates/). The page identifies 20 Medjool dates and serves 20. |
| Existing reference | `ingredient-ref-medjool-dates`, `medjool dates` / `dattes medjool`, category `NUT_SEED_AND_DRIED_FRUIT`; no aliases, default density, or unit mappings. No ingredient form is linked. |
| Existing ledger state | `identityState: verified`; `measurementState: blocked_pending_evidence`; `substitutionResearchState: not_yet_researched`. Its existing source and accepted decision cover variety identity and Québec naming only; there are no measurement observations. |

The corpus has one other line linked to this reference: `024#1`, `425 g Medjool dates, pitted and chopped`. That separate mass-based formula provides no count weight or portion for `031#1`; do not compare or rescale the two recipe quantities.

## Prior-review check

The current WP04/WP12 proposal and batch files were searched for `031#1`, the ingredient-line ID, the exact phrase `20 Medjool dates`, and the 24 g portion. No earlier WP04/WP12 count or edible-portion review for this line was found. The WP03 dried-fruit and open-fruit identity packets mention `031#1` only to retain the explicit Medjool identity; the identity integration left the measurement state blocked and added no portion. This proposal contributes measurement evidence only and does not reopen that identity decision.

## Source evidence and measurement limits

The original [Cooking With Ayeh recipe page](https://cookingwithayeh.com/chocolate-dates/) (Ayeh Manfre; published July 7, 2022, updated February 7, 2025; accessed 2026-10-10) lists 20 Medjool dates and 20 servings. The method opens each fruit and removes the pit. Its tip says to use whole rather than pre-pitted dates and remove the seed, because pre-pitted dates are usually dry inside. It gives no mass, date dimensions, retail grade, brand, or size class.

The USDA Agricultural Research Service [Standard Reference Release 28, Food Group 09](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg09.pdf#page=270) (2015; accessed 2026-10-10) has NDB `09421`, **Dates, medjool**. Under the report's “Amount in edible portion of common measures of food,” it lists **Measure 1 = 24 g: 1 date, pitted**. The same record labels **8% Pits** under refuse. The entry reports a source-specific edible-portion measure but does not explain how the one-date mass was established, define a size class, identify a retail SKU, or give variability data.

| Dimension | Supported | Unresolved; do not infer |
|---|---|---|
| Variety / identity | Both the recipe and USDA item name Medjool dates. | A particular cultivar lot, brand, origin, or retail grade. |
| Count | Recipe uses 20 dates; USDA publishes a common measure of one date. | Whether each recipe fruit weighs the USDA reference amount. Do not multiply the reference portion by 20 to claim the recipe's mass. |
| Pit / edible basis | Recipe method removes the pit. USDA's listed one-date portion is explicitly pitted and belongs to the report's edible-portion measures. The record also lists 8% pits as refuse. | Gross as-purchased mass of a whole date; whether the report's refuse percentage applies to each retail size. Do not add 8% to 24 g or derive a gross weight. |
| Size | No size qualifier is stated in the recipe or USDA common-measure label. | Length, grade, retail size, or size distribution. The source measure is not proof that every date is a uniform 24 g. |
| Further preparation | The date is pitted, stuffed, coated in chocolate, and frozen. | Mass after stuffing, coating, or freezing; retained filling/chocolate; finished-product yield. Do not transfer the pitted-fruit portion to the finished confection. |
| Other relationships | USDA directly publishes one source-specific count portion. | Density, a generic date count mapping, package yield, substitution, or applicability to Deglet Noor, generic dates, chopped dates, or the separate 425 g recipe line. |

## Proposed source-specific observation

If the coordinator accepts the evidence, retain the following bounded observation on `ingredient-ref-medjool-dates`:

| Field | Proposed value |
|---|---|
| `relationship` | `count_weight` |
| `value` / `valueUnit` | `24` / `g` |
| `foodDescription` | `Dates, medjool; USDA SR28 NDB 09421.` |
| `foodState` | `Pitted edible date; USDA report separately lists 8% pits as refuse.` |
| `measurementMethod` | `Published USDA SR28 common-measure entry; no one-date weighing method or variability is stated.` |
| `quantityBasis` | `Source-specific one pitted Medjool date, 24 g edible portion; date size is unspecified. Not a gross whole-date mass or a generic date conversion.` |
| `evidenceKind` | `published_portion` |
| `sourceQuantity` | `{ "amount": 1, "unit": "date" }` |
| `observedMassG` | `24` |
| `sourceId` | `WP04-MEDJOOL-COUNT-20261010-S02` |

This observation does not change `031#1`'s stored amount. The editor or any future conversion flow must not turn `20 date` into a displayed or saved mass from this observation without separately supported source-size and application rules.

## Sources and access

| ID | Source | Evidence and limit |
|---|---|---|
| `WP04-MEDJOOL-COUNT-20261010-S01` | Cooking With Ayeh, [Chocolate Dates (3 Flavors)](https://cookingwithayeh.com/chocolate-dates/), Ayeh Manfre; published 2022-07-07, updated 2025-02-07. | Lists 20 Medjool dates and serves 20; method removes pits; tip recommends whole, not pre-pitted, dates. It does not report date mass or size. Accessed 2026-10-10. |
| `WP04-MEDJOOL-COUNT-20261010-S02` | USDA ARS, [Standard Reference Release 28, Food Group 09 report](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg09.pdf#page=270), NDB 09421, *Dates, medjool*, printed p. 270. | The report identifies the measure as part of the edible portion of common measures: 1 date, pitted = 24 g; the same entry lists 8% pits as refuse. It does not state date size or the method/variability for the common-measure mass. Release 28 (2015). Accessed 2026-10-10. |
| Local corpus and ledger | Bundled recipe `031`, linked recipe `024`, `ingredient-ref-medjool-dates`, and its research-ledger record. | Checked 2026-10-10. Confirms exact count and pitting preparation, the distinct 425 g line, empty measurement observations, and current blocked measurement state. |

## Remaining coverage gaps

- The source-specific USDA portion is for one pitted Medjool date with no size qualifier; the actual mass of the recipe's 20 purchased dates remains unknown.
- The source gives no date-size distribution, retail product, one-date measurement method, or mass range. Do not use it as a recipe total or general retail count weight.
- The separate `024#1` mass amount remains independent; no per-date ratio is established between the two recipes.
- The finding does not support generic dates, other date varieties, pre-pitted retail product, chopped dates, stuffed/coated finished dates, package yields, densities, substitutions, or runtime conversions.

**Source-review conclusion:** USDA SR28 supplies a source-specific edible portion that matches the recipe's Medjool variety and pitted state: one pitted date = 24 g, with 8% pits listed as refuse. The coordinator retained that observation as source evidence only, while leaving the recipe's 20-count mass and any active conversion unresolved.

**Coordinator disposition:** accepted one `count_weight` / `published_portion` observation after independently checking the USDA SR28 NDB 09421 entry and the linked recipe's 20-date, pit-removal instructions. The observation is recorded as one source-specific 24 g pitted edible Medjool date, with size unspecified; it does not support a generic date mapping, gross whole-fruit weight, or multiplication by the recipe's count. The existing Medjool identity and recipe links remain unchanged. Python regression coverage checks the observation boundary and unchanged count line.
