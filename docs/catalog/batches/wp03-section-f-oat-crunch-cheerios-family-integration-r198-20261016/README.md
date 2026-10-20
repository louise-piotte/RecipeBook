# WP03 Section F R198: Cheerios Oat Crunch family

## Decision

Added three separate Canadian `GRAIN_AND_CEREAL` references together: `Oat Crunch Almond Cheerios / Croquantes à l’avoine Amandes Cheerios`, `Oat Crunch Cinnamon Cheerios / Croquantes à l’avoine Cannelle Cheerios`, and `Oat Crunch Oats ’N Honey Cheerios / Croquantes à l’avoine Avoine et miel Cheerios`. This satisfies the family-coverage condition in the R181 Cinnamon hold: broad English `Oat Crunch` and French `Croquantes à l’avoine` queries now return the complete three-SKU family. Each full bilingual SKU title returns its own reference.

Aliases and forms remain empty. Each manufacturer label's 1 cup (56 g) serving is retained only as a separate, product-specific ledger observation. No generic cereal measure, density, formula, mappings, conversion, yield, recipe link, or substitution is inferred. The 114-recipe/1,123-row corpus contains no product demand.

## Evidence and validation

The three ledger records contain 15 total source entries. The six new family/SKU URLs are joined by the reused English list source and three exact Cinnamon/French-list source IDs from R181's proposal; those earlier product-page IDs are reused rather than replaced. Current manufacturer product pages and lists support the names, three distinct variants, 516 g packages, and SKU-specific servings. Québec retailer pages corroborate French-facing wording and retail packaging.

Static package, schema, catalog freshness, source ownership, picker projection, corpus, encoding, and whitespace checks passed. No software tests or emulator checks were run because this change only adds database JSON data.

See the [R198 proposal](../../proposals/wp03-section-f-oat-crunch-cheerios-family-review-r198-20261016.md). Section F remains open.
