# WP04 proposal: Fraisier garnish strawberry count portion review

**Review date:** 2026-10-10
**Status:** Proposal-only. No recipe, active conversion, density, or shared catalog data changed.
**Scope:** The single unresolved garnish count `045#16`, `1 strawberry for decoration`.

## Disposition

Keep the garnish count at one and leave its count-to-mass portion unavailable. The linked publisher page confirms one strawberry for decoration, but gives no diameter, size class, mass, cultivar, calyx/stem condition, or edible-basis instruction for that berry. Health Canada's 2015 CNF record for raw strawberry offers four **size-qualified** berry weights, not one unqualified berry weight. None can be selected for this line.

Do not use the size note for the cake's perimeter strawberries as a qualifier for the separate garnish: Fashion Cooking says to choose perimeter berries of a similar calibre, but does not say that this applies to the decorative berry. Do not infer that the separately listed garnish berry is included in or additional to the 500 g fresh-strawberry line, calculate a recipe total, or turn a berry portion into a generic count mapping, density, conversion, package yield, or substitution.

This is a line-specific measurement gap. The active reference also serves three other recipe lines with mass or volume amounts, so this packet does not recommend changing the reference-wide measurement state to “no supported value.” It adds no numeric measurement observation and leaves the current ledger record untouched.

## Exact bundled demand and live state

| Recipe line | Exact bundled row | Current link and structured amount | Measurement gap |
| --- | --- | --- | --- |
| `045#16` — Strawberry Fraisier Cake / *Fraisier*; `b8cf19ee-618b-495a-9ecb-9a90e88a9dac-ingredient-16` | `1 strawberry for decoration`; group `Decoration` | `ingredient-ref-strawberries`; `quantity: 1`; no `unit` | No count size/diameter, mass, cultivar, calyx/stem handling, or edible/as-purchased basis. |

The linked primary recipe source is Anne-Sophie Fashion Cooking's *Fraisier traditionnel*. Its decoration list says `1 fraise`; the instructions describe decorating with melted white chocolate, strawberries, and sugar pearls. The page separately lists `500g de fraises fraîches` in the mousseline section. Its footnote about choosing strawberries of similar calibre applies expressly to the visible strawberries around the cake perimeter, not the garnish line. The page gives no weight or size for the one decorative strawberry.

The live `ingredient-ref-strawberries` row is `strawberries / fraises`, category `FRUIT`, with empty aliases, `defaultDensity: null`, and `unitMappings: []`; no strawberry form is present. Its ledger record remains `identityState: unreviewed`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`, with empty sources and decisions. The other recipe demand using this reference is `045#11` (`500 g fresh strawberries`), `049#1` (`6 1/2 cups quartered strawberries`), and `051#1` (`454 g fresh strawberries`). Those mass/volume lines do not establish a weight for `045#16`.

Exact-ID and exact-text searches across the existing WP04/WP12 proposal and batch files found no prior focused review of `045#16` or its ingredient UUID. Prior WP02 strawberry-purée work covers `051#12` and the separate purée identity; it does not cover this garnish count. The existing WP04/WP12 produce-count packets do not list this row.

## Source evidence and limits

| Source ID | Source and locator | What it supports; what it does not support |
| --- | --- | --- |
| `WP04-STRAWBERRY-GARNISH-20261010-S01` | Anne-Sophie Vidal, Fashion Cooking, [Fraisier traditionnel](https://www.fashioncooking.fr/2016/09/fraisier-traditionnel/), decoration ingredient list and decoration instructions; accessed 2026-10-10. The URL archive path is `2016/09`; no exact publication/update date is displayed on the page. | Direct support that this recipe source requests `1 fraise` for decoration. The page does not state its weight, calibre, diameter, cultivar, or calyx/stem condition. The similar-calibre note is scoped to the perimeter berries. |
| `WP04-STRAWBERRY-GARNISH-20261010-S02` | Health Canada, Canadian Nutrient File, [Strawberry, raw / Fraise, crue, food code 1749](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=1749), common serving sizes; page modified 2019-03-01; accessed 2026-10-10. | Publishes edible-portion weights of 7.0 g for one small berry (2.5 cm diameter), 12.0 g for one medium berry (3.2 cm), 18.0 g for one large berry (3.5 cm), and 27.0 g for one extra-large berry (4.1 cm). It lists 6% total refuse, identified as caps and stems. The recipe line selects none of the four diameter classes and does not say whether the garnish keeps its cap/stem, so none is a direct match. These are CNF source portions, not a size distribution, range, recipe-specific measurement, or generic berry mapping. |
| `WP04-STRAWBERRY-GARNISH-20261010-S03` | Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), lines on CNF 2026 and continued access to the 2015 online database; page dated 2026-06-19. Open Government Portal, [Canadian Nutrient File, 2026](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109), including its [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv); accessed/attempted 2026-10-10. | Health Canada identifies the 2015 web CNF as an interim access path while it works toward easier access to CNF 2026. The current 2026 portal lists a measure-weight file, but the direct CSV could not be read through the web research connector on this date. This access failure is not evidence that the 2026 file lacks strawberry rows; no claim about its contents is made. |
| `WP04-STRAWBERRY-GARNISH-20261010-S04` | USDA ARS, [Standard Reference Release 28, Food Group 09: Fruits and Fruit Juices](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg09.pdf#page=883), NDB `09316`, *Strawberries, raw*, common-measure block; release 2015; accessed 2026-10-10. | The record lists cup measures for halves, purée, and slices and 6% caps-and-stems refuse; it does not list a one-berry common measure. This is an additional historical primary record, not proof that no other source publishes a berry weight. Its cup measures cannot resolve an unqualified count. |

## Recommendation and acceptance checks

**Recommendation:** preserve `045#16` as the authored one-count line and keep mass unavailable for that line. Do not add a size-specific CNF weight as its `count_weight` or `published_portion`; the recipe provides no corresponding size or edible basis. Do not alter ingredient identity, recipe text, quantity, or unit.

If a coordinator later records this research, keep any source-specific evidence attached to its source and qualifiers. Do not change the global reference measurement state based only on this one line. No substitution research is proposed.

Accept a future line-level portion only if all of these checks pass:

1. The source names raw/fresh strawberry or otherwise matches the garnish's explicitly established state, and publishes one berry's weight with a count/size description that the exact recipe source supplies or unambiguously constrains.
2. The observation preserves the source's count qualifier, diameter or other size basis, edible/as-purchased basis, cap/stem handling, reported precision, source locator, and dataset/version date.
3. It remains a source-specific observation; it creates no default `strawberries → g` mapping, density, package yield, or conversion.
4. It is not multiplied to infer a cake total or merged with the separate `500 g` filling line.
5. If CNF 2026 data are used, the actual relevant food and measure-weight rows are retrieved and linked. The 2026 portal metadata alone is not evidence for a strawberry portion.

## Remaining coverage gaps

- The one garnish berry remains an exact count with no matching mass. A direct publisher measurement or a source-qualified size on the recipe line would be needed to resolve it.
- CNF 2026 food and measure-weight rows for raw strawberry remain unchecked because the current CSV could not be read in this review; the older CNF figures must not be represented as a current-dataset lookup.
- This packet does not review or alter the separate 500 g fresh-strawberry, quartered-cup, or reduced-purée recipe lines and does not close the broader WP04 count/edible-portion backlog.

No tests were run. This proposal file is the only artifact created by this review.
