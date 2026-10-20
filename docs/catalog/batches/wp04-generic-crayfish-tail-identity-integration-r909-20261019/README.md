# WP04 R909 — Freshwater crayfish tails integration

Integrated 2026-10-19. Added one generic edible cut identity while preserving the existing whole-crayfish record.

## Decision and evidence scope

Added `freshwater crayfish tails / queues d’écrevisses d’eau douce` as `ingredient-ref-crayfish-tail` in `PROTEIN`, with only the freshwater-qualified singular aliases `freshwater crayfish tail` and `queue d’écrevisse d’eau douce`. The OQLF fisheries entry normalizes `queue / tail` as a marketable anatomical part, includes écrevisse among the covered species, and describes a crustacean tail as its abdominal portion, often still in its shell. Metro’s English and Québec French consumer guides support general culinary use of the crayfish tail.

The identity does not choose a species or shelling, cooking, or preservation state. It remains separate from the whole-crayfish reference, picked meat without a tail claim, crab, shrimp/prawn, lobster, and other crustaceans. Keep `crawfish` and `crawdads` out of global aliases because Québec sources document overlap between the English terms and langouste.

No forms, measures, density, mappings, conversions, yields, recipe links, or substitutions were added. The complete 114-recipe corpus has no crayfish-tail match. Existing whole-crayfish sources, decisions, and product-specific observations remain unchanged.

## Cross-category queue disposition

The user’s scope rule applies across every ingredient type: prioritize generic culinary ingredient diversity and mark brand, product-line, flavour-family, SKU, or retailer-variant-only rosters out of scope because commercial-product counts do not add ingredient diversity. No roster-only task was pursued in R909. Existing branded rows and scoped evidence remain intact.

## Validation

- Ingredient-reference and bundled-package normalizers completed; the package normalizer reported no additional part changes after reference normalization.
- Generated Kotlin ingredient catalog refreshed to 1,936 references.
- Ledger schema/package validation, ID and source ownership, exact picker phrases, and complete recipe-corpus scan checked.
- Bundled JSON retains escaped Unicode; modified files are UTF-8 without BOM. Local links and scoped whitespace checked.

No software tests, build, emulator, or deployment were run because the active data change only adds ingredient database JSON under `AGENTS.md`.

See the [R909 proposal](../../proposals/wp04-next-generic-seafood-gap-review-r909-20261019.md) and [generic ingredient scope review](../generic-ingredient-scope-review-20261019/README.md).
