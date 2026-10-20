# WP07 R1074 — Generic almond portion review — 2026-10-19

**Disposition:** Accepted and integrated. Record source-qualified USDA SR28 portion observations for unroasted whole, sliced, and slivered almonds. Keep each observation tied to the source-described physical state. Do not activate a density, cup-to-millilitre conversion, unit mapping, edible yield, or count weight. Preserve all recipe quantities and existing almond/product records. See the [R1073–R1076 batch README](../batches/wp02-wp07-wp08-r1073-r1076-generic-gap-integration-20261019/README.md).

## Scope and candidate selection

Review the accepted generic `ingredient-ref-almonds` for transferable household-measure, portion, density, unit-mapping, conversion, edible-yield, or count-weight evidence. Almonds were selected as a high-demand generic ingredient not covered by R1061/R1062 or the current R1063/R1065 assignments. This is generic culinary ingredient measurement research, not commercial-product coverage.

The evidence search found direct generic measures in USDA ARS Standard Reference Release 28 (SR28), Food Group 12, NDB 12061. The values are useful as published portion observations for the exact states shown. The report does not provide the volume convention or filling method for its `cup` entries, so the observations must remain source-qualified and cannot safely become a universal density or runtime conversion.

## Current record and recipe demand

The live seed row is `ingredient-ref-almonds` (`almonds` / `amandes`), category `NUT_SEED_AND_DRIED_FRUIT`. It has the accepted English alias `whole almonds`, `defaultDensity: null`, and `unitMappings: []`. The ledger verifies the identity but leaves `measurementState: blocked_pending_evidence`; it has no measurement source or observation. The source-less draft density and mappings were previously removed, and the ledger requires exact source, food/form, unit convention, and basis before restoring numeric data.

There are **9 linked recipe rows in 8 recipe files**: two unqualified cup amounts; one `2 tbsp whole almonds` line; a separate half-cup sliced line; sliced, blanched, and finely chopped amounts or uses; and one unqualified garnish. Recipe text establishes demand only. No recipe amount is used as a measured conversion.

Existing accepted forms include blanched, sliced, and finely chopped almonds. The sliced-form review states that slices may be blanched or unblanched and does not encode skin state. No whole or slivered form is currently modeled. Keep those form decisions unchanged.

## Evidence review

| Source and locator | Exact identity, state, and portion basis | Finding and limit |
|---|---|---|
| USDA ARS, [Standard Reference Release 28, Food Group 12: Nut and Seed Products](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg12.pdf), NDB 12061, printed pp. 17–19; entry `Nuts, almonds` and its common measures/footnotes. | The record footnote says `Unroasted`; the common-measure table lists `1 cup, whole = 143 g`, `1 cup, sliced = 92 g`, and `1 cup, slivered = 108 g`. SR28 labels these as common measures of the edible portion. The food description reports 60% shells refuse for the as-purchased record. | Primary, generic food-composition evidence for the source-described unroasted almond forms. These are published portion weights, not universal densities. The report does not state cup capacity, packing/filling method, or the skin/blanching state of the kernels. Keep the shell refuse note separate from recipe-ready edible-kernel amounts. |
| USDA ARS, [SR28 Documentation](https://www.ars.usda.gov/arsuserfiles/80400525/data/sr/sr28/sr28_doc.pdf), “Weights and Measures,” printed p. 27, and Weight File description, printed p. 36. | USDA says measure weights represent edible material without refuse. It describes the measure-weight sources as published sources, industry files, USDA studies, and FNDDS measures; representative values are sought, but values from different sources may vary considerably. | Explains the edible-portion basis and the limits of the published weight data. It does not identify the original measurement method or fill protocol for almond NDB 12061. Do not describe these values as direct controlled measurements of a stated cup method. |
| USDA, [FoodData Central almond search](https://fdc.nal.usda.gov/food-search/?query=almonds), current result for NDB 12061. | The current search result labels NDB 12061 `Nuts, almonds, whole, raw`. | Identity cross-check only; portion weights above come from the cited SR28 report, not this search page. |
| Health Canada, [Nutrient Value of Some Common Foods (2008)](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/nutrient-value-some-common-foods-2008.html), introduction and Nuts table, `Almonds, dried` row. | The introduction describes reasonable average household measures for ready-to-eat foods. The table lists `Almonds, dried — 60 mL — 36 g`; it does not specify whole/sliced/slivered shape, packing method, or the underlying CNF food code in the displayed table. | This is an authoritative Canadian generic portion, but its physical form is not explicit enough to attach to the SR28 whole/sliced/slivered observations. Record as a bounded finding only; do not transfer it to a specific almond form or treat the old booklet as the current CNF dataset. |

## Recommended observations and boundaries

The accepted integration added source-qualified `portion_weight` observations to the evidence ledger, with target-scoped SR28 source entries including `WP07-ALMOND-MEASURE-20261019-S01`:

| Observation | Ledger target | Source-native portion | Required scope |
|---|---|---|---|
| `wp07-almonds-sr28-whole-cup-143g-20261019` | `ingredient-ref-almonds` | 1 cup, whole = 143 g | NDB 12061, unroasted whole edible almonds; skin state and filling method not stated. This does not imply in-shell purchase mass. |
| `wp07-almonds-sr28-sliced-cup-92g-20261019` | `ingredient-form-almonds-sliced` | 1 cup, sliced = 92 g | NDB 12061, unroasted sliced edible almonds; source does not specify skin state, cut thickness beyond “sliced,” or filling method. Do not infer blanching. |
| `wp07-almonds-sr28-slivered-cup-108g-20261019` | `ingredient-ref-almonds`, description scoped to source state | 1 cup, slivered = 108 g | NDB 12061, unroasted slivered edible almonds; no active slivered form or recipe link exists. Preserve as a source-specific observation and do not create a form in this measurement review. |

Keep `sourceQuantity.unit` as the source’s `cup`; the report does not define its millilitre volume or a fill/leveling procedure. Do not derive half-cup, tablespoon, millilitre, or grams-per-millilitre values. The source does not report a count measure for NDB 12061, so add no almond count-weight observation. Its 60% shell-refuse figure concerns the as-purchased shell-on record; it is not an edible-yield conversion for the catalog’s recipe-ready almond kernels.

The Health Canada `60 mL = 36 g` row should remain documented as a publication-specific, shape-unspecified finding. Do not use it to assert a whole-kernel density or to convert the USDA `cup` measures. If later source access supplies a matching physical form and method, a separate observation can be reviewed.

Recommend ledger measurement state `researched_supported` only for the exact source-qualified observations above. Leave `defaultDensity: null`, `unitMappings: []`, and all form `densityGPerMl` fields null. Do not change recipe rows, forms, aliases, identities, or substitution data. Do not interpret the source values as an average that covers blanched or finely chopped almonds.

## Ledger ownership and transferability audit

- The current `ingredient-ref-almonds` ledger entry owns only OQLF identity evidence; it has no measurements. Its current seed alias and separate recipe forms remain intact.
- Existing almond-form ledger records for blanched, sliced, and finely chopped almonds are identity/form reviews with no measure observations. Their recipe-source measurements remain recipe-scoped and are not reused here.
- The SR28 Food Group 12 PDF is already cited on ledger records for acorn flour, lotus seeds, pumpkin/squash seeds, and watermelon seed kernels. None of those locators supports almond NDB 12061. Add a new almond-scoped source locator if the proposal is accepted; do not reuse a source entry whose locator/supports text is scoped to another food.
- The existing almond-flour record retains King Arthur’s chart/package portions (1 cup = 96 g and, on the same package, 1/8 cup = 16 g) and Bob’s Red Mill Canada’s package serving (2 tbsp = 14 g) as evidence for those exact almond-flour products. The King Arthur package values conflict when scaled; none transfers to whole almonds, sliced almonds, or slivered almonds. Preserve all existing branded identities and product-specific measurements unchanged.
- **All-category scope check:** this batch targets the generic culinary ingredient almonds. No brand, product-line, flavour, SKU, or retailer-variant roster was researched or added. Any commercial-only roster lead is out of scope because counting products does not add ingredient diversity; product-only evidence remains scoped to its exact product.

## Search log

Queries and page checks were performed on 2026-10-19. Search results were used to find primary records; the cited source pages were opened to verify each value and its locator.

| Query or inspection | Result and bound |
|---|---|
| `site:ars.usda.gov SR28 Food Group 12 almonds NDB 12061 measure` | Found the USDA ARS Food Group 12 report; opened the NDB 12061 entry and verified the three portion weights and footnote. |
| `"NDB No. 12061" "1 cup, whole" USDA` | Confirmed USDA SR28’s `1 cup, whole = 143 g`, `1 cup, sliced = 92 g`, and `1 cup, slivered = 108 g` common measures. |
| USDA SR28 Documentation, “Weights and Measures” and Weight File sections | Verified edible material without refuse, general sources of the measure weights, and the stated possibility of source variation. No almond-specific fill method was found. |
| `site:fdc.nal.usda.gov almonds NDB 12061` | Current FoodData Central search identifies NDB 12061 as whole, raw almonds; used for identity only. |
| `"Almonds, dried" "60 mL" "36 g" Health Canada` and full-page check of the 2008 NVSCF | Verified the official table’s `60 mL = 36 g` entry. The row does not state a physical form, so no transfer to one of the SR28 states is made. |
| Existing ledger and almond proposals: exact ingredient/form IDs, source URLs, observations, and source IDs | Confirmed no current almond portion owner; audited adjacent form and branded almond-flour evidence before recommending any observations. |

## Final disposition

The integration accepted only the USDA SR28 source-qualified portion observations for unroasted whole, sliced, and slivered almonds, as separately described above. Recipe amounts and existing identities remain unchanged. Density fields stay null and unit mappings empty; no mL conversion, density, count weight, edible-yield rule, or new form was added. Health Canada’s 2008 shape-unspecified portion remains a bounded finding, not a transferable almond-form value. Static package and ledger checks passed; no software tests were run because the application change only adds database JSON under `AGENTS.md`.
