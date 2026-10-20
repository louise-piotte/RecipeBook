# WP02 R907 — Whole canary-seed meal integration

Integrated 2026-10-19. Added one generic, identity-only milling category from the existing human-food canary-seed family.

## Decision and evidence scope

Added `whole canary seed meal / gruau complet d’alpiste des Canaries` as `ingredient-ref-canary-seed-whole-meal` in `FLOUR_AND_STARCH`. Health Canada distinguishes whole meal from whole groat and whole-grain flour for dehulled, glabrous brown or yellow *Phalaris canariensis* intended for human food. The bilingual official assessments support the English category and the descriptive French construction; the French display is provisional and is not presented as an OQLF headword.

The identity is limited to whole meal made from the specified human-food seed. Canary-seed groats, whole-grain flour, flakes, hulls, extracts, ordinary bird-feed seed, and feed-use “canary meal” remain separate. The new row has empty aliases, no forms, no default density, and no unit mappings. Measurement and substitution research remain `not_yet_researched`.

The existing flour study’s approximately 0.6 g/mL bulk density and its formula-specific replacement trials remain attached to the flour. Health Canada prototype percentages remain scoped to those submitted formulations, and its wheat-allergy labelling caution remains within the assessed food scope. No value or claim was transferred to the meal.

The complete 114-recipe corpus has no canary-seed meal demand. No recipe link, portion, density, yield, conversion, or substitution was added. Existing canary-seed flour and groats rows, sources, and observations were preserved.

## Cross-category queue disposition

The user’s scope rule applies across every ingredient type: prioritize generic culinary ingredient diversity and mark roster-only brand, product-line, flavour-family, SKU, or retailer-variant work out of scope because commercial-product counts do not add ingredient diversity. No such new assignment was encountered in R907. The two Section F cereal-roster clauses and further research limited to the named Anson Mills wheat-meal product remain out of scope; their generic ingredient parents remain open. Existing branded rows and product-specific evidence remain untouched.

## Validation

- Ingredient-reference and bundled-package normalizers completed; the package normalizer reported no additional part changes after reference normalization.
- Generated Kotlin ingredient catalog refreshed to 1,935 references.
- Ledger schema/package validation, ID and source ownership, exact picker phrases, and complete recipe-corpus scan checked.
- Bundled JSON retains escaped Unicode; modified files are UTF-8 without BOM. Local links and scoped whitespace checked.

No software tests, build, emulator, or deployment were run because the active data change only adds ingredient database JSON under `AGENTS.md`.

See the [R907 proposal](../../proposals/wp02-next-generic-grain-gap-review-r907-20261019.md) and [generic ingredient scope review](../generic-ingredient-scope-review-20261019/README.md).
