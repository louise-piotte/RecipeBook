# WP02 / WP03 / WP04 R152 gap-review integration

Integrated the three R152 proposals after reviewing their source evidence, exact ownership,
French naming, picker projections, and bundled-recipe impact:

- **WP02 Section 04 A6 — sweet white sorghum flour:** added only `sweet white sorghum flour` and
  `farine douce de sorgho blanc` as aliases on the existing `sorghum flour / farine de sorgho`
  reference. The Canadian manufacturer list pairs those product names, and current Canadian and
  Montréal-facing listings corroborate them. The change adds a bilingual search path without
  creating another identity or changing the existing flour's measurements or blocked substitution
  research.
- **WP03 Section F — hard red spring wheat berries:** added identity-only `hard red spring wheat
  berries / grains de blé roux de printemps` as a Canadian whole-kernel product class. Keep it
  separate from generic, durum, Red Fife, and sprouted wheat berries. The French display is a
  source-informed construction from Canadian Grain Commission wording, not an OQLF ruling or
  verified Québec retail title.
- **WP04 Section P — shirasu:** added identity-only `shirasu / shirasu` as a species-neutral Japanese
  market product class, with only the qualified English aliases `boiled shirasu` and `Japanese
  whitebait`. Keep bare `whitebait` on New Zealand whitebait; the broad `whitebait` query now returns
  those two distinct products. No French alias was added.

The bundle has **114 recipes and 1,123 ingredient rows**; no matching candidate terms or ingredient
links were found. No forms, recipe links, new measurements, densities, unit mappings, conversions,
yields, or active substitutions were added. The existing sorghum-flour measurement observation and
blocked substitution finding remain unchanged. The complete package contains **1,522 references and
119 forms**; the ledger contains **1,867 records, 7,894 source entries, and 6,749 distinct source
IDs**. The generated catalog index contains 1,522 references.

Static package normalization and validation, reference normalization, generated-index freshness,
ledger schema and source-ID linkage, picker projection, recipe-corpus scan, UTF-8/no-BOM, local
links, and scoped whitespace checks passed. No Gradle, unit, instrumentation, emulator, app, or
deployment tests were run; this round only adds database JSON data and related documentation under
the updated `AGENTS.md` rule.

See the [WP02 sweet white sorghum flour proposal](../../proposals/wp02-a6-next-regional-flour-gap-review-r152-20261015.md),
[WP03 hard red spring wheat berries proposal](../../proposals/wp03-section-f-next-grain-gap-review-r152-20261015.md),
[WP04 shirasu proposal](../../proposals/wp04-section-p-next-seafood-gap-review-r152-20261015.md),
and the [global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt). Sections
04 A6, F, and P remain open.
