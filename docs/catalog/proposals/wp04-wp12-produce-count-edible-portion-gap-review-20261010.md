# WP04/WP12 Proposal: Produce Count and Edible-Portion Gap Review

**Review date:** 2026-10-10
**Status:** Proposal-only. This review creates no active count conversion, density, recipe change, or package-yield record.

## Disposition

The bundled recipes contain useful count and edible-portion demand for common produce, but most lines omit a produce size or name a cut/variety that does not match the available count measure. Keep count-to-mass unavailable in runtime. Preserve any accepted values only as source-specific `published_portion` observations with the exact food description, raw/cooked state, count qualifier, edible basis, refuse, and source locator. Do not add broad `count` conversions, default densities, inferred item sizes, or recipe edits.

Five exact matches in the 2015 CNF serving pages are provisional ledger-only candidates because the recipe line and published portion use the same food and count qualifier: raw garlic clove, large raw onion, small raw carrot, raw leek, and large raw tomato. Do not promote them until the corresponding 2026 CNF measure-weight rows are checked. Health Canada now publishes CNF 2026, while its own page describes the 2015 online tool as an interim measure. CNF also publishes five fresh basil leaves = 2.5 g, but the recipe asks for ten leaves; this is not an exact portion match, so S06 is retained as boundary evidence and no basil measurement observation is proposed. The provisional candidate line mapping appears below.

Do not fold the existing chicken-egg packet or the S&W black-bean package-yield record into this audit. The CNF weights below are edible-portion observations, not gross whole-item weights or purchase yields. Refuse percentages describe portions excluded by the CNF entry; they are not extra mass to add to the listed serving weight.

## Live snapshot before integration

Snapshot was taken from the shared package and ledger on 2026-10-10 before any integration of this proposal. File hashes cover raw bytes. The recipe-set hash uses the 114 manifest-listed paths sorted by relative path, then path bytes, NUL, file bytes, NUL.

| Artifact | Count | Bytes | SHA-256 |
| --- | ---: | ---: | --- |
| Ingredient references | 753 | 237,825 | `eaccfeb7fe5c4cf25dea4ad4d844bf6b2b3b41e7fc7bf9b0f01440b36a3fef5b` |
| Ingredient forms | 36 | 24,403 | `1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef` |
| Units | 30 | 5,447 | `6f6e3afc8b2c12fe9120dbcf453d1e675fee596fa754f93cfead040a7ba8c8e4` |
| Seed manifest | 13 fields | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Package yields | 1 | 853 | `5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b` |
| Research ledger | 958 records; 8 unit conversions; 1,968 source entries; 1,590 distinct source IDs | 2,102,914 | `1be05afc4c8e4b8fd37ee0c87f73555489272e94b75f37e2eac3f320e8e095ef` |
| Recipes | 114 files; 1,123 ingredient rows | 750,593 combined | `806c88c67b42177ddd6671fce0134d0063df30c677112770e2e5767b627b045a` |

The targeted active references currently have `defaultDensity: null` and empty `unitMappings`. No measurement observations are present on the targeted generic produce-reference ledger records. The only matching form record found is canned diced tomatoes, unrelated to these fresh-count observations.

## Recipe-demand scan

Scanned all 114 manifest recipes and 1,123 ingredient rows. The following table captures 44 produce/herb rows across 25 recipe files whose stored unit or source text is count-like. It includes the package-style `box` rows so the boundary remains visible. Egg count demand and the reviewed black-bean package yield are excluded. Line notation `019#6` means the sixth ingredient row in manifest recipe 019; it resolves to the full `ingredient.id` stored in that recipe JSON.

| Recipe line | Source ingredient text | Current mapping | Evidence / disposition |
| --- | --- | --- | --- |
| `001#3` | 1/2 large over-ripe banana | `ingredient-ref-banana` | Hold: CNF gives raw banana sizes and edible weights but has no over-ripe qualifier. |
| `007#2` | 1 clove garlic, minced | `ingredient-ref-garlic` | Candidate S01: exact unqualified clove portion. |
| `015#2` | 2 onions; stored unit `medium onion` | `ingredient-ref-onion` | Hold: CNF generic onion gives a large, not medium, count. |
| `019#6` | 2 green onions, chopped | `ingredient-ref-green-onions` | Hold: CNF has small/medium/large portions; recipe has no size. |
| `021#2` | 4 to 5 rosemary sprigs; stored quantity 4 | `ingredient-ref-rosemary-sprigs` | Hold: CNF gives volume measures, not a sprig count; source text is a range. |
| `028#7` | 16 maraschino cherries, drained and chopped | `ingredient-ref-cerises-au-marasquin` | Hold: processed cherries; raw sweet-cherry CNF data is not an identity match. |
| `034#1` | 1 onion, finely chopped | `ingredient-ref-onion` | Hold: no size. |
| `034#2` | 1 jalapeno pepper, finely chopped | `ingredient-ref-jalapeno-pepper` | Hold: CNF portion is one medium pepper; recipe omits size. |
| `034#5` | 2 cloves garlic, finely chopped | `ingredient-ref-garlic` | Candidate S01: exact unqualified clove portion. |
| `037#3` | 1 yellow onion, chopped | `ingredient-ref-onion` | Hold: no size; generic mapping also conflicts with existing yellow-onion identity. |
| `037#6` | 2 cloves garlic, chopped | `ingredient-ref-garlic` | Candidate S01: exact unqualified clove portion. |
| `037#8` | 1 potato, peeled and diced | `ingredient-ref-potato` | Hold: CNF count portion is size-specific; recipe omits size. |
| `044#7` | 2 ears corn on the cob; unit is blank | `ingredient-ref-corn-on-the-cob` | Hold: CNF found a white-corn raw count and size portions only; recipe has no corn color or ear size. |
| `066#2` | 1/4 medium yellow onion, finely diced | `ingredient-ref-onion` | Hold: CNF generic onion page has no medium portion; generic mapping conflicts with existing yellow-onion identity. |
| `066#3` | 3 green onions, thinly sliced | `ingredient-ref-green-onions` | Hold: size omitted. |
| `066#4` | 1 serrano pepper, thinly sliced | `ingredient-ref-serrano-pepper` | Retrieval gap: no exact CNF/FDC count portion was verified in this pass. Do not borrow jalapeno data. |
| `066#5` | 3 cloves garlic, chopped | `ingredient-ref-garlic` | Candidate S01: exact unqualified clove portion. |
| `066#13` | 1/2 lemon, thinly sliced | `ingredient-ref-lemon` | Hold: retrieved CNF entry is lemon without peel; recipe says sliced fruit and does not state peel removal. |
| `067#8` | 18 maraschino cherries | `ingredient-ref-cerises-au-marasquin` | Hold: processed cherries; no exact CNF count portion verified. |
| `073#10` | 3 bananas, mashed | `ingredient-ref-banana` | Hold: CNF has size-specific raw portions; recipe count has no size. |
| `074#3` | 1 onion, chopped | `ingredient-ref-onion` | Hold: no size. |
| `077#5` | 1 celery stalk, cut into small dice | `ingredient-ref-celery` | Hold: CNF stalk weights differ by size; recipe does not specify stalk size. |
| `078#10` | 2 garlic cloves, minced | `ingredient-ref-garlic` | Candidate S01: exact unqualified clove portion. |
| `086#3` | 1 onion, coarsely chopped | `ingredient-ref-onion` | Hold: no size. |
| `086#4` | 2 garlic cloves, coarsely chopped | `ingredient-ref-garlic` | Candidate S01: exact unqualified clove portion. |
| `089#2` | 1 leek | `ingredient-ref-leek` | Candidate S04: CNF publishes one raw leek portion. |
| `089#3` | 1/2 box mushrooms | `ingredient-ref-mushroom` | Package boundary: box size/source absent; not an individual produce count. |
| `090#11` | 3 cloves garlic, minced | `ingredient-ref-garlic` | Candidate S01: exact unqualified clove portion. |
| `090#13` | 2 small sweet potatoes, peeled and diced | `ingredient-ref-sweet-potato` | Hold: CNF portion is medium only; no small-size value. |
| `093#2` | 1/2 onion | `ingredient-ref-onion` | Hold: no size. |
| `096#1` | 4 large tomatoes, diced | `ingredient-ref-tomatoes` | Candidate S05: large whole tomato portion; retain CNF’s red-ripe/raw qualifier. |
| `096#3` | 1 Spanish onion, finely chopped | `ingredient-ref-onion` | Hold: generic mapping conflicts with existing Spanish-onion identity; no size. |
| `096#5` | 2 large garlic cloves, finely chopped | `ingredient-ref-garlic` | Hold: CNF clove measure has no large-size qualifier. |
| `096#9` | 10 fresh basil leaves | `ingredient-ref-basil` | No exact-portion candidate: CNF portion is 5 leaves = 2.5 g, not the 10-leaf recipe amount. |
| `098#1` | 1 box cranberries | `ingredient-ref-cranberries` | Package boundary: box size and recipe source are absent; do not infer a gross or edible weight. |
| `101#6` | 1 clove garlic, grated | `ingredient-ref-garlic` | Candidate S01: exact unqualified clove portion. |
| `104#1` | 1 bunch asparagus, trimmed and cut into 1/2-inch pieces | `ingredient-ref-asparagus` | Hold: CNF gives spear sizes and a six-medium-spear portion, not a bunch. |
| `104#7` | 1 clove garlic, minced | `ingredient-ref-garlic` | Candidate S01: exact unqualified clove portion. |
| `105#3` | 1 large onion, chopped | `ingredient-ref-onion` | Candidate S02: exact large-onion count qualifier. |
| `105#4` | 4 cloves garlic, crushed | `ingredient-ref-garlic` | Candidate S01: exact unqualified clove portion. |
| `105#5` | 1 sweet potato | `ingredient-ref-sweet-potato` | Hold: no size; CNF only supplies a medium count. |
| `105#6` | 4 small carrots, diced | `ingredient-ref-carrot` | Candidate S03: exact small-carrot count qualifier. |
| `105#7` | 2 stalks celery, chopped | `ingredient-ref-celery` | Hold: CNF medium/small/large stalk values; recipe has no size. |
| `113#6` | 1 medium garlic clove, pressed or minced | `ingredient-ref-garlic` | Hold: CNF clove value has no medium-size qualifier. |

### Provisional 2015 source-specific observations

Each observation below is restricted to the CNF food description and portion as published. It is not an active unit mapping and does not authorize recipe rewriting or scaling across size classes.

| Ledger target | Source | Published portion | Matching recipe line(s) |
| --- | --- | --- | --- |
| `ingredient-ref-garlic` | S01 | Garlic, raw: 1 clove = 3.0 g edible portion; refuse is 13% (knob and skin). | `007#2`, `034#5`, `037#6`, `066#5`, `078#10`, `086#4`, `090#11`, `101#6`, `104#7`, `105#4`. Exclude size-qualified `096#5` and `113#6`. |
| `ingredient-ref-onion` | S02 | Onion, raw: 1 large = 150.0 g edible portion; refuse is 10% (stem ends, sprouts, defects). | `105#3` only. |
| `ingredient-ref-carrot` | S03 | Carrot, raw: 1 small (14 cm long) = 50.0 g edible portion; refuse is 11% (crown, tops, scrapings). | `105#6` only. |
| `ingredient-ref-leek` | S04 | Leeks (bulb and lower-leaf portion), raw: 1 leek = 89.0 g edible portion; refuse is 56% (tops, root ends, skin). | `089#2` only. |
| `ingredient-ref-tomatoes` | S05 | Tomato, red, ripe, raw, year-round average: 1 large whole (7.6 cm diameter) = 182.0 g edible portion; refuse is 9% (core and stem). | `096#1` only; retain the CNF food description in the source record. |

If the 2026 CNF rows confirm these portions, candidate source records should use `relationship: portion_weight`, `evidenceKind: published_portion`, and source-specific food/portion language. Preserve the original recipe amount and preparation. Do not turn these observations into generic item weights, kitchen conversions, or edible-yield rules.

S06 stays in the source register for auditability but is not an exact recipe-portion candidate; no base five-leaf observation is proposed for integration in this cohort.

## Source register and evidence limits

The CNF serving pages below were checked on 2026-10-10, but they belong to the 2015 online CNF that Health Canada says remains available as an interim measure. Health Canada published the 2026 CNF dataset in May 2026 with a separate Measure Weight Conversion file. The Open Government Portal page and download URLs were discoverable, but this research web connector could not open the portal resource or CSV (403 / inaccessible URL), so 2026 portion values could not be verified. Treat S01–S18 as historical evidence and hold their candidate values pending comparison with the 2026 food and measure-weight files. Each 2015 page states available serving-size portions and identifies the edible-portion basis; the refuse entry distinguishes inedible parts. These are descriptive food-composition portions, not measured market-size distributions.

| Source ID | Source and locator | Relevant evidence / scope limit |
| --- | --- | --- |
| `WP04-WP12-PRODUCE-20261010-S01` | Health Canada CNF, [Garlic, raw](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=2394), food code 2394. | 1 clove = 3.0 g; bulb = 24.0 g; total refuse 13% (knob and skin). No clove-size distribution. |
| `WP04-WP12-PRODUCE-20261010-S02` | Health Canada CNF, [Onion, raw](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2401), food code 2401. | 1 large = 150.0 g; page does not list a medium onion; refuse 10%. Generic onion only, not a cultivar-specific yellow, Spanish, sweet, or red onion weight. |
| `WP04-WP12-PRODUCE-20261010-S03` | Health Canada CNF, [Carrot, raw](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=2380), food code 2380. | Small (14 cm) = 50.0 g; medium = 61.0 g; large = 72.0 g; refuse 11%. |
| `WP04-WP12-PRODUCE-20261010-S04` | Health Canada CNF, [Leeks (bulb and lower-leaf portion), raw](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2396), food code 2396. | 1 leek = 89.0 g; refuse 56%. Edible weight is not whole-leek gross weight. |
| `WP04-WP12-PRODUCE-20261010-S05` | Health Canada CNF, [Tomato, red, ripe, raw, year-round average](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2460), food code 2460. | Large whole (7.6 cm diameter) = 182.0 g; refuse 9%. No variety named; preserve the raw/red-ripe food state. |
| `WP04-WP12-PRODUCE-20261010-S06` | Health Canada CNF, [Basil, fresh](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=212), food code 212. | 5 leaves = 2.5 g; total refuse 36%. No per-leaf variability range. |
| `WP04-WP12-PRODUCE-20261010-S07` | Health Canada CNF, [Banana, raw](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=1704), food code 1704. | Large (20–22.5 cm) = 136.0 g edible portion; refuse 36% (skin). Does not describe over-ripe banana state. |
| `WP04-WP12-PRODUCE-20261010-S08` | Health Canada CNF, [Onion, spring (green) or scallion, raw](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2144), food code 2144. | Small = 5.0 g, medium = 15.0 g, large = 25.0 g; roots 4% refuse. Recipe lines omit size. |
| `WP04-WP12-PRODUCE-20261010-S09` | Health Canada CNF, [Celery, raw](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2386), food code 2386. | Small stalk = 17.0 g; medium stalk = 40.0 g; large stalk = 64.0 g; refuse 11%. Recipe lines omit size. |
| `WP04-WP12-PRODUCE-20261010-S10` | Health Canada CNF, [Pepper, jalapeno, raw](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4860), food code 4860. | 1 medium = 14.0 g; refuse 8% (stems and seeds). Recipe line 034#2 does not state medium. Not evidence for serrano. |
| `WP04-WP12-PRODUCE-20261010-S11` | Health Canada CNF, [Potato, flesh, raw](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=2417), food code 2417. | 1 potato (6.3 cm diameter) = 112.0 g; refuse 25% (parings and trimmings). Recipe 037#8 does not state size. |
| `WP04-WP12-PRODUCE-20261010-S12` | Health Canada CNF, [Sweet potato, raw](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2240), food code 2240. | 1 medium (12.7 cm × 5.1 cm diameter) = 130.0 g; refuse 28%. No small count portion. |
| `WP04-WP12-PRODUCE-20261010-S13` | Health Canada CNF, [Corn, sweet, white, raw](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=6408), food code 6408. | Small ear = 73.0 g, medium = 90.0 g, large = 143.0 g edible portion; total refuse 64% (husk/silk/trimmings 35%, cob 29%). Does not match generic color-unspecified recipe count. |
| `WP04-WP12-PRODUCE-20261010-S14` | Health Canada CNF, [Asparagus, raw](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=1990), food code 1990. | Six medium spears = 96.0 g; ends are 47% refuse. No bunch weight or spear count for a bunch. |
| `WP04-WP12-PRODUCE-20261010-S15` | Health Canada CNF, [Lemon, raw, without peel](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=1587), food code 1587. | Medium fruit = 58.0 g; large = 84.0 g; total refuse 47% (peel 45%, seeds 2%). Recipe 066#13 does not state that peel is removed. |
| `WP04-WP12-PRODUCE-20261010-S16` | Health Canada CNF, [Spices, rosemary, fresh](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4723), food code 4723. | 5 mL = 0.7 g; 15 mL = 1.7 g; stems are 35% refuse. No sprig portion. |
| `WP04-WP12-PRODUCE-20261010-S17` | Health Canada CNF, [Cherry, sweet, raw](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=1531), food code 1531. | 10 pitted raw fruits = 82.0 g; 20 = 164.0 g; refuse 10%. This is not a maraschino-cherry identity or drained-jar measure. |
| `WP04-WP12-PRODUCE-20261010-S18` | Health Canada, [Nutrition labelling: Table of reference amounts for food](https://www.canada.ca/en/health-canada/services/technical-documents-labelling-requirements/nutrition-labelling-table-reference-amounts-food.html), section J.9. | Maraschino cherries are named as fruit for garnish/flavour, with a 4 g regulatory reference amount and a serving expression based on the number of whole pieces closest in grams. This is not a per-cherry weight or a kitchen count conversion. |
| `WP04-WP12-PRODUCE-20261010-S19` | Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), CNF 2026 description; [Open Government dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109), [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv). | Establishes that CNF 2026 is published and that the 2015 online CNF remains an interim tool. The 2026 measure-weight CSV was not retrievable through the research web connector; no 2026 value is asserted here. |

For `1 box cranberries` and `1/2 box mushrooms`, a serving-size page cannot replace the missing package evidence: brand/product identity, net quantity, drained or usable amount when relevant, and a source page are absent from the recipe row. The CNF raw-cranberry entry does not establish box contents. No package-yield candidate is proposed.

## Integration boundaries and follow-up

- Keep generic count mappings and default densities empty. Do not add an automatic gram value for any `count`, `item`, `clove`, `stalk`, `bunch`, `ear`, or produce-size word.
- If integrating exact candidates, store only source-scoped published portions under the exact identity and state listed above. Keep CNF refuse data and portion method alongside the observed weight.
- First compare each candidate with the 2026 CNF `Food Name`, `Measure Name`, `Measure Type`, and `Measure Weight Conversion` records. The present source tool could not retrieve the 2026 conversion CSV; until that refresh is possible, keep all S01–S18 numbers provisional and do not add them to the ledger.
- Do not apply the garlic 3 g value to `large` or `medium` cloves; do not apply onion weights across named varieties; do not infer a fruit or vegetable size where the recipe omits it.
- Hold recipe lines whose mapping points a yellow or Spanish onion to generic onion for the existing identity review. This audit does not remap those recipe links.
- Keep raw, peeled, pitted, drained, edible-part, and whole-package distinctions explicit. Recipe preparation words such as diced or minced do not transform CNF raw portions into cooked weights.
- Research exact CNF/FDC count measures for serrano pepper, cranberry packaging, maraschino cherries, and asparagus bunches only if later recipe demand warrants it. No CNF/FDC exact portion was verified for those pairings in this review.

## Scope and validation

This is the only file created by this review. No canonical references, forms, recipes, ledger, plan, roadmap, tests, or code were edited. No test or integration run was performed.
