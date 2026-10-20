# WP07 icing-sugar portion integration (2026-10-12)

Added nine source-specific `portion_weight` observations to the existing `ingredient-ref-icing-sugar`
ledger record: King Arthur Baking reports 1 cup unsifted confectioners' sugar = 113 g; Health Canada
CNF 2015 Food Code 4319 reports 5 ml = 2.5 g, unsifted 100/125/250 ml = 50.7/63.4/126.8 g, and
sifted 100/125/250 ml = 42.3/52.8/105.7 g; Health Canada's 2008 Table 15 reports 5 ml = 3 g. Keep
all units, sifting qualifiers, and publication contexts distinct. Do not average, scale, derive a
density, infer the chart's cup convention, or link observations to recipe lines.

The matching CNF 2026 food and measure rows were not retrieved through the available dataset route
(403); this is an access gap, not evidence of absence. Keep measurement state blocked, active density
null, unit mappings empty, and substitution research not yet researched. The bundle has 30 linked
icing-sugar lines across 26 recipes, all unchanged.

Ledger validation, exact source-ID ownership, package validation, reference normalization,
generated-index freshness, 114-recipe/1,123-row corpus, UTF-8/no-BOM, and scoped whitespace checks
passed. The ledger has 1,618 records. No app tests or emulator checks were run because this adds only
database JSON evidence and documentation. See the [portion review](../../proposals/wp07-icing-sugar-portion-observations-review-20261012.md)
and [common baking measurement packet](../common-baking-measurements.md).
