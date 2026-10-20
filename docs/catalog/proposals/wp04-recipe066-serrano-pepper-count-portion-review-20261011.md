# WP04 Proposal: Recipe 066 Serrano Pepper Count and Edible Portion Review

**Review date:** 2026-10-11

**Status:** Root review integrated on 2026-10-11. The ledger retains 6.1 g as a source-specific one-raw-serrano observation, adds the corroborating Health Canada CNF portion, and no longer calls that weight an exact match for the publisher's medium pepper. The medium-pepper weight remains unresolved; no recipe line or conversion changed. See [`wp02-wp03-wp04-quebec-flour-sushi-rice-serrano-portion-integration-20261011`](../batches/wp02-wp03-wp04-quebec-flour-sushi-rice-serrano-portion-integration-20261011/README.md).

## Decision

Do not treat the current 6.1 g raw-serrano portion as an exact weight for recipe 066 ingredient 4. The live publisher page specifies **one medium serrano pepper**, while the exact Health Canada Canadian Nutrient File (CNF) portion and the already-recorded USDA SR28 portion each say only **one pepper**. Neither official portion identifies its pepper as medium. The ingredient species, raw state, and count basis match, but the size match is unverified.

The recipe JSON itself stores `1 serrano pepper, thinly sliced`, quantity `1`, unit `item`, and `optional: true`; it has no size qualifier. Its linked publisher page is the current controlling description for this review: it was updated August 12, 2026, and lists “1 medium serrano pepper (optional).” The publisher's instruction repeats “1 medium serrano pepper (about 1 tablespoon)” and has the pepper sliced into the seasoning before the eggs are refrigerated. Do not edit the recipe JSON in this review.

## Recipe-to-source comparison

| Dimension | Current linked publisher and recipe preparation | Health Canada CNF food code 4858 | Match? |
| --- | --- | --- | --- |
| Species | Serrano pepper. | `Pepper, serrano, raw` / `Piment, serrano, cru`. | Yes. |
| Size | One **medium** serrano pepper. | `1 pepper = 6.1 g`; no size qualifier is shown. | **Not established.** Do not relabel the CNF count as medium. |
| Raw/preparation state | Pepper is thinly sliced into the seasoning; the pepper is not cooked. The eggs are cooked separately, then chilled in the marinade. | Raw pepper; the common count measure is presented as an edible-portion measure. | Yes for raw pepper before slicing/marinating. |
| Count basis | One whole pepper, optional. | One pepper. | Yes. |
| Edible portion/refuse | The publisher does not request removing seeds. Slicing implies the stem is not included in the food portion, but it gives no weight. | 6.1 g for one pepper; total refuse 3%, identified as stems. | The source defines stem refuse; it does not resolve the size gap. |

## Official portions checked

1. **Health Canada CNF 2015, food code 4858, `Pepper, serrano, raw`.** The serving page lists `1 pepper = 6.1 g`, identifies total refuse as 3%, and names stems as the 3% refuse. It also lists chopped-volume portions (100 mL = 44.4 g, 125 mL = 55.5 g, 250 mL = 110.9 g). None is labelled medium. The same page's food name confirms the species and raw state. [Health Canada CNF serving page](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4858)

2. **USDA Standard Reference Release 28, NDB 11977, `Peppers, serrano, raw`.** Its common-measure row likewise lists `1 pepper = 6.1 g` and `3% Stems`; it does not say medium. This is the source already present in the ledger under `WP04-RESIDUAL-PRODUCE-COUNT-20261010-S02`. Preserve this as source-specific historical raw-serrano portion evidence, but do not assert that it weighs the current publisher's medium pepper. [USDA SR28 Food Group 11, page 1301](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg11.pdf#page=1301)

3. **The linked publisher page.** The current page identifies the ingredient as `1 medium serrano pepper (optional)` and instructs the reader to thinly slice `1 medium serrano pepper (about 1 tablespoon)` into the seasoning. The “about 1 tablespoon” volume does not provide a weight. [The Kitchn, Korean Soy-Marinated Jammy Eggs](https://www.thekitchn.com/korean-soy-marinated-eggs-recipe-23636937)

The 2026 CNF dataset is published with a separate Measure Weight Conversion CSV, but that CSV URL could not be opened in this review. This is an access limitation, not evidence that the 2026 file lacks a serrano measure or a medium qualifier. The accessible CNF 2015 page is exact for an unqualified raw serrano count and cannot close the medium-size gap. [Canadian Nutrient File, 2026 dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109)

## Current ledger and candidate state

The bundled line maps to `ingredient-ref-serrano-pepper`, with `1` / `item`, raw pepper prepared thinly sliced, and an optional flag. There is no separate unresolved candidate record for this line. Before root integration, the active ingredient-reference ledger entry had `measurementState: researched_supported`, an accepted USDA SR28 source, and a 6.1 g / one-pepper `count_weight` observation whose wording said it matched recipe 066 ingredient 4.

Root integration retained the 6.1 g observation as USDA-specific evidence for one unqualified raw serrano pepper, added the Health Canada CNF source, and narrowed the decision and observation text. The USDA and CNF rows do not identify the pepper as medium, so the 6.1 g value does not establish the weight of the publisher's medium pepper. Do not promote it into a medium-serrano conversion or use it to infer a general pepper count.

## Explicit boundaries

- Keep the recipe 066 line unresolved for a source-matched medium serrano weight unless an official/source-specific measure explicitly identifies a medium raw serrano, or the 2026 CNF measure-weight data can be checked and supports that exact qualifier.
- Do not use CNF's jalapeño measure or any other pepper species.
- Do not scale CNF's chopped-volume measures to the publisher's approximate tablespoon, and do not derive a mass from volume.
- Do not treat the 6.1 g unqualified source measure as proof of a medium pepper's weight or as a runtime `item` conversion.
- Do not change the stored recipe line, its optional flag, preparation, or source link.
