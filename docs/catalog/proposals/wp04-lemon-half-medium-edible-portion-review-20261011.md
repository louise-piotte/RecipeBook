# WP04 proposal: half-medium lemon count and edible-portion review

**Review date:** 2026-10-11

**Status:** The count and edible-portion hold for `066#13` was recorded in the 2026-10-11 follow-up integration. Preserve the bundled line; no source-matched mass, conversion, yield, or recipe edit was added. See the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md).

## Recommendation

Keep recipe `066#13` exactly as bundled: **`1/2 lemon, thinly sliced`**, quantity `0.5`, unit `item`, reference `ingredient-ref-lemon`. The current linked publisher page now specifies `1/2 medium lemon`, but it does not state whether the lemon is peeled. Its method places the thin slices over the eggs; it gives no peel-removal step or statement about whether slices are eaten or removed.

The current Health Canada CNF 2026 files and USDA SR28 both have portions for **raw lemon without peel**. Their medium-fruit and slice measures cannot establish the mass of this recipe's slices because the source does not specify peeled fruit, a numeric fruit diameter, or how many slices result. Keep the current `0.5 item` line and its text unchanged. Do not assign a mass, multiply a portion by the half-fruit count, estimate slice count, or use refuse percentages to derive a purchase weight.

## Exact bundled line and current publisher check

The manifest lists `recipes/066-korean-soy-marinated-jammy-eggs-e0a437cb-da80-4fd5-954d-87caf3b299e7.v1.json`. The line is ingredient UUID `e0a437cb-da80-4fd5-954d-87caf3b299e7-ingredient-13`, with `originalText: "1/2 lemon, thinly sliced"`, `quantity: 0.5`, `unit: "item"`, and `ingredientRefId: "ingredient-ref-lemon"`.

The linked The Kitchn page, *Korean Soy-Marinated Jammy Eggs*, currently shows `1/2 medium lemon` in the recipe card and says to thinly slice it and place the slices over the eggs. The page displays “updated Aug 12, 2026.” That is later than the bundled recipe file's `updatedAt` of 2026-04-04. The current card is therefore evidence for the current publisher version; without a captured page history, it does not establish that the stored line originally had the size qualifier. Preserve the bundle's exact text and structured unit.

| Dimension | Evidence | Match limit |
| --- | --- | --- |
| Count and publisher size | Current linked card: half of one medium lemon. | The bundled line omits “medium”; the current card postdates the bundled recipe timestamp. |
| Preparation | Current method says to thinly slice the lemon and place the slices over the eggs. | No peel-removal step or explicit peel status; no slice count, thickness, diameter, or mass. |
| Edible versus purchase basis | No basis stated by the recipe card. | It is not clear whether the slices are eaten or removed after marination. |
| State and cooking | Lemon is prepared raw for the marinade; whole peeled eggs are marinated with lemon slices under refrigeration. | No cooked, drained, or measured finished-lemon portion is reported. |

## Official portion evidence and match audit

### Health Canada CNF 2026

The 2026 CNF relational files contain Food Code `1587`, **Lemon, raw, without peel** / **Citron, cru, sans pelure**, scientific name *Citrus limon*. The food row was last updated `2012-07-10`; the 2026 release is the current dataset distribution, not evidence that this row's portion measurements were newly measured in 2026.

The joined portion rows report one medium fruit (5.4 cm diameter) at 58.0 g and one large fruit (6 cm diameter) at 84.0 g. The common-measure rows are expressed as edible-portion weights. The record also lists one wedge or slice of a medium fruit at 7.0 g, 100 ml of sections at 89.603 g, and refuse of 47% total (45% peel and 2% seeds). The medium and large measure rows were last updated in 1997; the slice, sections, and refuse rows have historical update dates from 2000–2004.

This is not a matched observation for `066#13`: the food description explicitly excludes peel, while the publisher only says to thinly slice lemon. The publisher does not define “medium” by diameter, and the bundle itself has no size qualifier. The CNF slice measure is a separate portion under this medium, without-peel food code; it does not state slice thickness or the number of slices in half a fruit. Do not transfer the 7 g figure to the recipe or derive a half-fruit weight.

### USDA SR28

USDA ARS SR28 Food Group 09, NDB `09150`, also names the food **Lemons, raw, without peel** and marks 47% refuse (45% peel, 2% seeds). Its common-measure block is explicitly “amount in edible portion”; it lists one 2-1/8-inch fruit at 58 g, one 2-3/8-inch fruit at 84 g, and one wedge or slice of a medium fruit at 7 g. The report is SR28 (2015), so it is historical source evidence, not a new 2026 measurement.

USDA agrees with CNF on a raw lemon without-peel basis. Neither cited official source provides a matching raw, peel-included, thinly-sliced half-medium-lemon portion or a directly measured purchase-weight amount for this line. The separate refuse percentage cannot be used to calculate an as-purchased weight.

## Proposed data delta

None for the recipe line. Keep measurement research for `ingredient-ref-lemon` open; the current ledger record is `measurementState: not_yet_researched` and contains only the existing bounded identity source. This review does not change the ledger.

Do not add or activate a recipe count-to-mass mapping, density, conversion, yield, substitution, peel factor, or recipe edit. The official portions for raw lemon without peel may remain source-specific evidence for that exact CNF/SR28 food state if separately recorded later, but they do not resolve the publisher's unspecific peel status or the bundled line's unqualified size.

## Source register

All sources were checked on 2026-10-11. These proposal-local IDs are not canonical ledger source entries.

| Source ID | Source and locator | Evidence and limit |
| --- | --- | --- |
| `WP04-LEMON-066-20261011-S01` | The Kitchn, [Korean Soy-Marinated Jammy Eggs](https://www.thekitchn.com/korean-soy-marinated-eggs-recipe-23636937), current recipe card and instructions. | Page displays “updated Aug 12, 2026”; current card says `1/2 medium lemon`, and step 5 says to thinly slice it and place it over the eggs. No peel-removal step, slice count, diameter, or mass. The size wording is not in the bundled line, whose file timestamp is earlier. |
| `WP04-LEMON-066-20261011-S02` | Health Canada, [Canadian Nutrient File 2026](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109), [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv), [Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv), [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv), and [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv); Food Code `1587`, Measure Type `6`, Measure Codes `161`, `144`, `1043`, `617`, `1037`, `1038`, `1461`, and refuse Type `3` / Codes `750`, `815`, `804`. | Official current release identifies raw lemon without peel. It reports edible portions by size and sliced measure, plus separate refuse. The component rows retain historical last-updated dates; no cited row is a peel-included half-medium lemon portion. |
| `WP04-LEMON-066-20261011-S03` | USDA ARS, [SR28 Food Group 09](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg09.pdf), NDB `09150`, *Lemons, raw, without peel*, PDF pp. 487–488. | Historical 2015 source lists edible-portion measures for one 2-1/8-inch fruit (58 g), one 2-3/8-inch fruit (84 g), and one medium-fruit wedge or slice (7 g), with 47% refuse. It does not give a peel-included, thin-sliced recipe match. |

## Review boundary

This is a focused follow-up to the broad produce-count screen's held `066#13` row. It adds the live linked publisher version check and a direct match audit against the official CNF 2026 portions and USDA SR28. It confirms a partially matched count/size description in the current publisher version, while leaving edible mass unresolved. The follow-up integration recorded the review in the plan and roadmap; the catalog, ledger, and recipe line remain unchanged. No tests were run during the source review; implementation verification is recorded in the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md).
