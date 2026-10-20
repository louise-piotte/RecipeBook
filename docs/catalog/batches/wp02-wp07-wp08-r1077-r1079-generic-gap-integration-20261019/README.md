# WP02/WP07/WP08 R1077–R1079 generic ingredient integration

Reviewed and integrated on 2026-10-19. This batch adds generic ingredient diversity and source-scoped evidence across grain milling, dairy measurement, and recipe-context substitution.

## Integrated decisions

- **R1077 — defatted corn bran:** added identity-only `defatted corn bran / son de maïs dégraissé` as a generic corn-bran milling fraction, distinct from ordinary corn bran, corn bran flour, and corn germ. The Québec French compound is descriptive and provisional. Two human-food biscuit studies support ingredient identity; their defatting procedures, particle preparation, tested formulas, and outcomes remain study-specific. Added no form, measure, density, mapping, conversion, recipe link, yield, or active substitution.
- **R1078 — whole milk:** added six USDA SR28 published-portion observations for two separate generic 3.25% whole-milk records: NDB 01077 (with added vitamin D) and NDB 01211 (without added vitamins A and D). Each record separately reports 1 cup = 244 g, 1 fl oz = 30.5 g, and 1 tbsp = 15 g. Source-native measures remain tied to those exact food records. Density stays null, unit mappings stay empty, and no recipe line or milk powder form was assigned. The CNF 2026 exact-row join remains unresolved.
- **R1079 — ground beef to ground lamb:** recorded the source’s one-pound ground-lamb option only for The Wholesome Dish’s *The Best Classic Shepherd’s Pie* and RecipeBook line `078#3`. The `90% lean` qualifier remains attached to the beef wording. No generic ground-lamb alias/form, active rule, recipe-line substitution link, or recipe edit was added because the resolver cannot enforce the named-recipe limit.

## Cross-category scope review

The catalog queue was checked across all ingredient types. The remaining open prompts that mention cereal or commercial products are generic diversity parents, source-quality guidance, or product-measurement scoping; no additional task whose sole deliverable was a brand, product-line, flavour-family, SKU, or retailer-variant roster was found. Commercial-product counts do not add ingredient diversity, so any such roster-only work remains out of scope. Preserve existing branded rows and review transferability before reusing their evidence. Manufacturer pages remain eligible to support a generic ingredient when their claims apply beyond the named product; product-specific claims and measurements stay scoped to that product.

The Section F commercial cereal rosters and the previously dispositioned Anson Mills, Nu Life Market/Dempsey, and Mochiko/Shiratamako product-only leads remain out of scope. Generic gaps remain open across categories. No existing branded row was deleted, merged, or generalized in this batch.

## Files and validation

- Updated the bundled ingredient-reference JSON with one generic identity and regenerated `BundledIngredientCatalog.kt` to 2,072 references.
- Updated the research ledger with one new identity record, six milk portion observations, and one recipe-scoped substitution finding.
- No recipe JSON, form, substitution-rule JSON, schema, DTO, or runtime behavior changed.
- No software tests, build, emulator run, or deployment were run; the application change adds database JSON data under `AGENTS.md`.

See the [R1077 proposal](../../proposals/wp02-a7-next-generic-milling-gap-r1077-20261019.md), [R1078 review](../../proposals/wp07-next-generic-measurement-review-r1078-20261019.md), and [R1079 proposal](../../proposals/wp08-next-generic-substitution-review-r1079-20261019.md).
