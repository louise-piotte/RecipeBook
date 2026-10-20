# WP04 Proposal: Large-Onion Edible Portion for Recipe 105

**Review date:** 2026-10-11
**Status:** Proposal only. No shared catalog, ledger, recipe, plan, roadmap, code, or test files changed.
**Scope:** Verify the source-specific CNF 2026 large-onion portion against the exact linked publisher line `105#3`.

## Disposition

Recommend applying the existing CNF 2026 `1 large` raw-onion observation (150 g) to the exact source line in bundled recipe `105#3`. The publisher page's current card and the bundle both say **one large onion, chopped**. The CNF food description is generic raw onion, and its user-defined measure is also exactly `1 large`; the row has no extra diameter or cultivar qualifier. The onion is introduced raw before simmering. These qualifiers match closely enough for a source-specific published-portion observation tied to this line.

This is a match for one published large-onion portion, not a claim that the particular household onion used in the recipe weighed 150 g. Keep the CNF 10% total-refuse figure attached to the source record; do not add refuse mass to 150 g or call the value an as-purchased weight. Do not multiply the value into a recipe total, use it for medium or named-variety onions, or activate a generic count conversion.

The existing `ingredient-ref-onion` ledger already contains the exact CNF 2026 observation and its source. If integrated, add the linked publisher source and a decision scoped to `105#3` that accepts the existing observation as a matched source-specific portion; do not duplicate or alter its numeric observation. Leave recipe text, amount, unit, and mapping unchanged.

## Prior-review inventory and selected line

The shared research ledger, WP04 proposals, and all 114 manifest-listed recipe files were inspected before selecting this follow-up. Prior count/portion work already covers the egg line set; pork-rack, pork-shoulder, chicken-breast, and tuna lines; the jalapeño and serrano lines; garlic, leek, and maraschino-cherry portions; and the dedicated banana, carrot, celery, lemon, sweet-potato, mango, vanilla-pod, asparagus-bunch, fresh-herb, brioche-slice, pie-crust, and strawberry-garnish reviews. The residual animal-food reviews found no further unreviewed count-like animal line with a usable linked publisher source. The remaining animal package line `015#4` has no linked publisher URL or package size.

Earlier produce inventories identified `105#3` as a provisional exact large-onion candidate and recorded the CNF 2026 data, but did not compare the current linked publisher card with that exact row. The adjacent carrot line `105#6` was source-checked separately and was found to mismatch the publisher's count and size. This proposal addresses only the onion line; it does not treat the rest of the bundled recipe as a source-exact version.

## Exact bundled line and source match

| Field | Bundled recipe | Linked publisher card |
|---|---|---|
| Recipe | `105`, *Habitant Pea Soup* | Bryanna Clark Grogan, *Homemade Habitant Pea Soup (Soupe aux Pois), Vegan-Style* |
| Ingredient line | `105#3`; ingredient UUID `e152b749-db75-4a7c-9bbf-3b94f721451d-ingredient-3` | `1 large onion, chopped` |
| Stored data | `quantity: 1`; `unit: count`; `ingredientRefId: ingredient-ref-onion` | The current card lists `1 large onion, chopped`; the page says the recipe serves 6–8 and was adapted from a cookbook recipe. |
| Preparation stage | Bundled instructions add the onion raw with the other vegetables before a 1 h 30 min simmer. | The publisher lists the onion as an ingredient before cooking; the recipe method combines it with vegetables and simmers the soup. |
| Exact match limits | Generic onion; size word `large`; no cultivar, diameter, measured item mass, or purchase/edible basis is stated in the recipe line. | The matching line supports the count and size wording only. Other ingredient amounts differ between the live card and bundled recipe. |

The publisher card's `1 large onion` is a line-level match to CNF's `1 large` measure. Its 150 g is the database's source-published portion for that measure. The recipe does not independently report a weight, and the observation must remain attributed to CNF rather than the publisher.

## Official measurement evidence

| Evidence | Exact row or locator | Result and limit |
|---|---|---|
| Health Canada CNF 2026 | Food Name `Food_Code=2401` (`Onion, raw` / `Oignon, cru`; *Allium cepa*; USDA NDB 11282); Measure Name `Measure_Code=139` (`1 large` / `1 gros`); Measure Type `6` (`User-defined`); Measure Weight Conversion tuple `(2401, 6, 139)` | `1 large = 150 g`. Separate Refuse tuple `(2401, 3, 750)` is 10% total refuse. The existing ledger observation ID is `ingredient-ref-onion-raw-count-weight-cnf-2026-139`, source ID `WP04-WP12-CNF-2026-PRODUCE-20261011-ONION`. The row has no diameter qualifier. |
| USDA SR28 | NDB `11282`, *Onions, raw*, Food Group 11, common-measure block | Lists volume measures (including chopped/sliced cups and chopped tablespoons), not a large-onion count. This supports keeping the CNF row as the source for the large count; it supplies no competing large count. |
| USDA ERS TB-1927 | Appendix A, Table A-2, *Onions, raw* / NDB 11282 | Separately reports one medium raw onion (2½-inch diameter) = 110 g, with 10% inedible. It is a historical medium-size assumption, not a measure for this large-onion line. Preserve it as a distinct observation and do not average or crosswalk it to CNF's large portion. |

The current official CNF 2026 data are published as relational CSVs. Their exact joined rows and source hashes are documented in the [CNF 2026 retrieval integration](../batches/wp04-wp12-cnf-2026-portion-retrieval-integration-20261011/README.md), and the current ledger preserves the joined identifiers above. During this follow-up, the Open Government page was reachable through search but a direct web open returned 403 and the CSV itself was not served by the web connector; the verified current-row details are therefore taken from the already retrieved official files and their checked-in evidence, not inferred from the inaccessible web response.

## Integration recommendation

If accepted into the ledger:

1. Add the direct publisher source below to `ingredient-ref-onion`, with locator limited to recipe `105#3` and the current ingredient card.
2. Add one accepted decision scoped to `105#3`: the publisher and bundled line both specify one large raw onion; CNF 2026's source-specific `1 large` observation is an exact count/size match. State that 150 g is the CNF published portion, not a measured weight of the recipe's particular onion or an active conversion.
3. Reuse the existing CNF source ID and observation unchanged. Do not add a duplicate observation.
4. Keep `defaultDensity: null`, `unitMappings: []`, and the recipe line unchanged. Add no cooked yield, recipe-total mass, substitution, or alias.

If the integration owner does not treat an unqualified source `large` as matching CNF's identically worded `large` measure, retain the existing CNF observation as source-specific only and record that the recipe-specific onion mass remains unknown. Do not replace the exact source-row qualifier with an inferred diameter.

## Sources

Accessed or rechecked **2026-10-11**.

| ID | Source | Evidence and limits |
|---|---|---|
| `WP04-NEXT-COUNT-EDIBLE-PORTION-20261011-S01` | Bryanna Clark Grogan, [Homemade Habitant Pea Soup (Soupe aux Pois), Vegan-Style](https://veganfeastkitchen.blogspot.com/2013/02/homemade-habitant-pea-soup-soupe-aux.html), dated 2013-02-18; current ingredient list and method. | The live card lists `1 large onion, chopped`, serves 6–8, and identifies the recipe as adapted from a cookbook. The method adds vegetables to broth and simmers. Direct source for the matching line only; other recipe quantities differ from the bundled adaptation. |
| `WP04-WP12-CNF-2026-PRODUCE-20261011-ONION` (existing ledger ID) | Health Canada, [Canadian Nutrient File 2026 dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109); [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv), [Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv), [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv), and [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv). | Joined rows `Food_Code=2401`, `Measure_Code=139`, `Measure_Type_Code=6` report one large raw onion = 150 g. Separate Refuse rows report 10% total refuse. The exact observation/source are already in the shared ledger; no second numeric observation is proposed. |
| `WP04-NEXT-COUNT-EDIBLE-PORTION-20261011-S02` | USDA ARS, [SR28 Food Group 11: Vegetables and Vegetable Products](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg11.pdf#page=1140), NDB `11282`, *Onions, raw*. | The common-measure block has chopped/sliced volume measures but no large raw-onion count. Used as a comparison boundary, not as evidence against the distinct CNF 2026 large measure. |
| `WP04-NEXT-COUNT-EDIBLE-PORTION-20261011-S03` | USDA ERS, [Technical Bulletin 1927](https://www.ers.usda.gov/sites/default/files/_laserfiche/publications/47570/8043_tb1927.pdf?v=24481), Appendix A, Table A-2, raw onion / NDB `11282`. | Lists one medium onion (2½-inch diameter) = 110 g and a separate 10% inedible share. This distinct historical medium-size assumption is not applied to the large-onion line. |
| Local corpus | Bundled recipe 105, [recipe JSON](../../../app/src/main/assets/seed/bundled-library/recipes/105-soupe-aux-pois-habitant-pea-soup-e152b749-db75-4a7c-9bbf-3b94f721451d.v1.json), ingredient 3; current reference and ledger. | Confirms the saved exact wording, quantity, unit, current generic-onion link, raw-before-simmer context, and existing CNF observation. |

## Review boundary

This is one proposal file only. It does not alter recipe quantities or add a generic runtime conversion. No tests were run because no shared implementation or data were changed.
