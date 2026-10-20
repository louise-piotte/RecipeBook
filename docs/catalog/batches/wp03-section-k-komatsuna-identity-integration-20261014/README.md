# WP03 Section K Komatsuna identity integration

## Decision

Added identity-only `komatsuna / komatsuna` as `ingredient-ref-komatsuna` in
`VEGETABLE_AND_AROMATIC`. The source-backed English aliases are `komatsu-na`, `mustard spinach`,
`spinach mustard`, and `Japanese mustard spinach`; French aliases remain empty. The Montréal French
gardening guide and an Ottawa seller’s bilingual seed listing support `komatsuna` as a provisional
borrowed fr-CA display. An independent review agreed with that market-name use while noting the
Québec marketplace evidence is seasonal and the name is not OQLF-standardized.

Bare `spinach`, `mustard`, `mustard greens`, and `Japanese mustard greens` remain unassigned. The
qualified English aliases expand broad `spinach` and `mustard` searches, but exact `mustard greens`
ownership remains with the existing references. No forms, density, mappings, conversions, yields, or
bundled recipe links were added.

## Measurements and substitutions

The ledger keeps two retailer-specific 200 g package listings and three recipe ingredient amounts
(400 g for four servings, 200 g for two servings, and 80 g for one serving) as source observations.
They do not establish a standard package, bunch, serving, density, cup conversion, or preparation
yield. Fukuya’s “spinach substitute” product wording has no dish, form, amount, or ratio, so the
ledger records a blocked finding and no active substitution.

The bundled corpus has no Komatsuna recipe demand or recipe-line links.

## Evidence and review

The R119 proposal records crop, Canadian and Québec market, recipe, terminology-search, and CNF
evidence with their limits. The independent fr-CA review supports provisional borrowed-name use,
not an OQLF ruling or current Québec retail availability.

See [the proposal](../../proposals/wp03-section-k-komatsuna-identity-gap-review-r119-20261014.md)
and [the catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt). The wider Section K
leafy-green and brassica sweep remains open.

No app, Gradle, instrumentation, or emulator tests were run: this integration adds database JSON
data and documentation under the updated `AGENTS.md` rule.
