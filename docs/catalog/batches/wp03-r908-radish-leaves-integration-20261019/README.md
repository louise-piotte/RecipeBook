# WP03 R908 — Radish leaves integration

Integrated 2026-10-19 as one generic edible plant-part identity, with a frozen form and carefully scoped evidence.

## Decision and evidence scope

Added `radish leaves / fanes de radis` as `ingredient-ref-radish-leaves` in `VEGETABLE_AND_AROMATIC`. The English aliases are limited to leaf, greens, and top wording; the French aliases are limited to the corresponding radis leaf terms. The reference remains distinct from the existing radish root, daikon, pickled radish, turnip greens, beet greens, and other greens. No daikon-leaf or botanical aliases were inferred.

Added `frozen radish leaves / feuilles de radis congelées` as `ingredient-form-radish-leaves-frozen`. Le Québec cuisine names fresh or frozen leaves in one soup formula, which supports the frozen state but does not establish general fresh/frozen equivalence, thawing, conversion, or yield. The form has no density.

Recorded the recipe's 100 g amount as one published `portion_weight` observation for the full eight-portion `Soupe aux feuilles` formula. It is not divided into a per-serving amount, converted to a volume measure, or generalized to radish leaves in other recipes. The recipe's co-ingredients remain co-ingredients; no substitution is inferred from their presence.

The Kitchn explicitly describes radish greens as usable in place of Swiss chard or mustard greens in a sautéed chickpea, pancetta, and shallot dish. The ledger records separate source-bounded findings for substituting radish leaves for Swiss chard and mustard greens. It has no active rule ID and creates no global or method-wide replacement rule; the source provides no ratio or adjustment.

No bundled recipe row matches radish leaves. No recipe link, default density, unit mapping, conversion, yield, or active substitution rule was added. Existing radish and greens references and their evidence remain unchanged.

## Cross-category scope disposition

This review pursued generic edible plant-part diversity. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched or added. Any roster-only work remains out of scope because commercial-product counts do not add ingredient diversity. Existing branded entries and product-specific evidence were preserved; no product-only measurement was transferred.

## Validation

- Normalized the ingredient references; the package normalizer reported zero additional changed parts.
- Regenerated the Kotlin ingredient catalog at 1,937 references.
- Checked the ledger schema, source-ID ownership, aliases, form labels, recipe corpus, encoding, local links, and scoped whitespace.
- No software tests, build, emulator, or deployment were run because this data change only adds ingredient database JSON under `AGENTS.md`.

See the [R908 proposal](../../proposals/wp03-next-generic-produce-gap-review-r908-20261019.md) and [generic ingredient scope review](../generic-ingredient-scope-review-20261019/README.md).
