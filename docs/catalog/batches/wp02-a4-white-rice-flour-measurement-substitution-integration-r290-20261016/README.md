# WP02 A4 white rice flour measurement and substitution integration — R290 — 2026-10-16

## Decision

Completed bounded measurement and wheat-replacement research on the existing `ingredient-ref-white-rice-flour` identity. Its accepted bilingual display, empty aliases, `FLOUR_AND_STARCH` category, absent forms, null density, and empty unit mappings remain unchanged.

The research ledger now records Bob's Red Mill White Rice Flour's `1/4 cup (40 g)` Nutrition Facts serving and the manufacturer's white-rice-flour chart row `1 cup = 160 g` as named-product observations. Neither observation supplies an identity-wide volume conversion or density; the chart does not state the filling method for its white-rice row. Measurement research is complete with no reusable value.

The reviewed bread-and-biscuit study tests 5–30% replacement in its own wheat-flour formulas and reports formula-specific changes. It does not establish a transferable home-recipe ratio or hydration adjustment. Substitution research is complete with no supported active rule. No aliases, ingredient forms, conversions, yields, recipe links, or recipe changes were added.

Keep white rice flour separate from generic, brown, and glutinous rice flour, rice starch, and white rice grain. The 114 bundled recipes (1,123 structured ingredient rows) contain no matching white-rice-flour demand.

## Files updated

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` — unchanged; no picker identity or alias update.
- `docs/catalog/research-ledger.v1.json` — completed the two research states; added three source entries (including the already-owned chart source ID), two bounded observations, one no-supported-substitute finding, and one decision.
- `docs/catalog/proposals/wp02-a4-white-rice-flour-measurement-substitution-review-r290-20261016.md` — recorded integrated status.
- `docs/RecipeBook-global-ingredient-catalog-plan.txt` — checked the R290 child item; WP02 A4 remains open.
- `roadmap.md` — recorded the completed review.

## Verification

- Bob's Red Mill product page confirms its product name, white-rice ingredient, stone-ground description, and `1/4 cup (40 g)` serving. Its flour chart lists white rice flour at `40 g` per `1/4 cup` and `160 g` per cup; general measurement guidance does not specify the method used for that row.
- Opened the publisher's article page and full-text paper for the study. The reported 5–30% composite formulations, bread-volume and crumb findings, and smaller varying biscuit effects are treated as study-specific.
- Confirmed both new source IDs and URLs, the reused chart ID/URL ownership, target row state, absence of white-rice-flour forms and active rules, unchanged catalog/picker projection, and no bundled recipe demand.
- Static seed-package, reference-normalization, generated-index, ledger-schema, UTF-8/no-BOM, source-link, local-link, and whitespace checks passed.
- No software tests, build, or emulator run was performed. This update adds only database research JSON and documentation, per `AGENTS.md`.

Totals at the R290 integration point: 1,663 ingredient references, 126 forms, and 2,012 ledger records / 8,864 source entries / 7,505 distinct source IDs / 6,266 distinct URLs; 114 recipes / 1,123 structured ingredient rows.

## Sources

- [R290 white-rice-flour measurement and substitution proposal](../../proposals/wp02-a4-white-rice-flour-measurement-substitution-review-r290-20261016.md)
- Bob's Red Mill, [White Rice Flour](https://www.bobsredmill.com/product/white-rice-flour)
- Bob's Red Mill, [Flour Weight Chart](https://www.bobsredmill.com/articles/bobs-red-mill-flour-weight-chart)
- Švec and Hrušková, [Characteristics of Bread and Biscuit Made With Wheat and Rice Flour Composites](https://archive.conscientiabeam.com/index.php/58/article/view/348), [full text](https://archive.conscientiabeam.com/index.php/58/article/download/348/469)
- USA Rice, [Rice Flour 101](https://www.usarice.com/thinkrice/detail-pages/blog/rice-flour-101-everything-you-need-to-know)
- QUeen Milling, [English products](https://www.queenmilling.ca/collections/all) and [French storefront](https://www.queenmilling.ca/fr)
