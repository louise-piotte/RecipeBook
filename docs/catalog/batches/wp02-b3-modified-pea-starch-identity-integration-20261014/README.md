# WP02 B3 — modified pea starch identity (R91)

Integrated 2026-10-14. Section 04 B2/B3 remains open.

## Decision

Added identity-only **modified pea starch / amidon de pois modifié** as a distinct `FLOUR_AND_STARCH` reference, separate from the existing general/native **pea starch / amidon de pois** identity. The new row has empty aliases and unit mappings, no default density, and no forms or recipe links.

The Canadian Food Inspection Agency's current English and French common-name tables specify source-plant naming for ordinary and modified starch. Metro Québec's English listing and Jean Coutu's French listing use *Modified pea starch* / *Amidon de pois modifié* in the same Selection sour peach ring candy SKU. Supplier documentation supports modified pea starch as a distinct product family, with differences among individual grades. These sources support a separate ingredient identity without identifying the candy ingredient's modification chemistry or a general grade equivalence.

The research ledger records the publisher abstract's high-resistant-starch PeaP bread result as a single study-specific formulation finding. It supports no reusable flour or starch substitution rule. No product-matched kitchen measure or density is available. The unrelated pharmaceutical granule densities remain excluded from ingredient measurements.

The 114 manifest-listed recipes and 1,123 ingredient rows have no matching candidate phrases or links. No forms, measurements, conversions, yields, recipe links, or substitutions were added.

## Changed files

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`: added `ingredient-ref-modified-pea-starch`.
- `docs/catalog/research-ledger.v1.json`: added its accepted identity record, ten sources, and one bounded bread-study finding.
- `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt`: regenerated from the canonical reference JSON.
- `docs/RecipeBook-global-ingredient-catalog-plan.txt` and `roadmap.md`: recorded this integration while keeping the broad WP02 checklist open.

See the [R91 proposal](../../proposals/wp02-b3-r91-modified-pea-starch-review-20261014.md) for the source register, exact picker projection, recipe scan, and evidence limits.

## Static validation

- Bundled seed package validation passed.
- Ingredient reference normalization, research-ledger schema validation, and generated catalog freshness checks passed.
- Source IDs, exact identity ownership, picker results, recipe demand, UTF-8/no-BOM encoding, local links, and scoped whitespace were checked.
- No app, Gradle, instrumentation, or emulator tests were run because the change only adds database JSON data.
