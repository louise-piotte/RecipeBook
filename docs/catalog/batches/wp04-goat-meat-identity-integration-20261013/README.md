# WP04 goat-meat identity integration — 2026-10-13

Integrated the [goat-meat identity review](../../proposals/wp04-goat-meat-identity-review-20261013.md).

## Catalog decision

Added identity-only `ingredient-ref-goat-meat` as `goat meat / viande de chevreau` in `PROTEIN`, with English alias `chevon` and French associated-term alias `viande de chèvre`. OQLF supplies the bilingual term evidence; current MAPAQ and Québec producer sources establish local human-food use. Keep the identity scoped to plain farmed domestic goat meat. Do not link goat milk or cheese, offal, game, cuts, or prepared products.

The broad `goat` and `chèvre` queries also match this meat display/alias under current phrase search. The legacy goat-cheese candidate remains unreviewed and is not part of the active picker. The proposed row keeps the word `meat` in its English display and does not add bare `goat` or `chèvre` aliases.

## Recipe and behavior limits

The 114-recipe / 1,123-row corpus has no matching goat-meat demand; the generic “cooked meat or seafood” line is not a goat request. Added no recipe link, form, measure, density, unit mapping, conversion, cooking or edible yield, or substitution. MAPAQ's cooking comments and producer cut lists do not support reusable numeric behavior.

## Integration checks

- Ingredient references: 1,384; forms: 100; legacy candidates: 63.
- Research ledger: 1,716 records; the goat-meat record stores five sources and the identity-only decision.
- The generated bundled catalog was refreshed after adding the reference.
- No app tests or emulator checks were run because this change only adds database JSON data and its derived index.

WP04 animal-food coverage remains open.
