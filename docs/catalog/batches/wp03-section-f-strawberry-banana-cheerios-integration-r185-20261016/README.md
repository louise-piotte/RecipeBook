# WP03 Section F Strawberry Banana Cheerios integration — R185

## Decision

Added identity-only `Strawberry Banana Cheerios / Cheerios Fraises et bananes` as a named Canadian ready-to-eat cereal in `GRAIN_AND_CEREAL`. The bilingual manufacturer pages provide the exact catalog titles. Both alias arrays are empty; the Metro Québec descriptive phrase is evidence only. The cereal remains separate from Multi-Grain Cheerios, Oat Crunch products, and its listed oat, fruit, starch, and sugar components.

Recorded the manufacturer Nutrition Facts serving of 1 cup (39 g) as one product-specific ledger observation for dry, ready-to-eat cereal as sold. It is not a generic cereal measure, active unit mapping, density, or conversion. Added no forms, legacy mapping, active measures, conversions, yields, recipe links, or substitution findings. The source pages say the cereal can be used in a recipe but establish no tested replacement with another ingredient.

The proposal's picker projection was reproduced against the live reference and form data using the implemented phrase-first, substring-fallback rules. The exact bilingual product titles each return one row; `Cheerios` grows from one result to two. `cereal` / `céréales` remain at 22 / 19. `strawberry` / `banana` grow from 1 / 8 to 2 / 9. `fraise` grows from three substring results to four; it was not added as an alias, so the query remains in substring fallback. `banane` stays at seven phrase results.

The full 114-recipe, 1,123-row bundle has no exact title, proposed ID, retailer product number, or Cheerios text match. No recipe link was added.

## Sources

- [General Mills / Cheerios Canada, Strawberry Banana Cheerios](https://www.cheerios.ca/products/strawberry-banana-cheerios), current title, ingredients, 317 g package, and 1 cup (39 g) Nutrition Facts serving.
- [General Mills / Cheerios Canada, Cheerios Fraises et bananes](https://www.cheerios.ca/fr-CA/products/cheerios-fraises-et-bananes), current French title, ingredients, 317 g package, and 1 tasse (39 g) serving.
- [General Mills / Cheerios Canada, Our Products](https://www.cheerios.ca/products), current list reports 17 Cheerios products and shows this SKU alongside distinct Multi-Grain and Oat Crunch products.
- [Metro Québec, Céréales à saveur de fraise et banane Cheerios](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-a-saveur-de-fraise-et-de-banane/p/065633188518), current indexed listing corroborates the local product wording, 317 g package, and product number `065633188518`.

## Validation

- Seed-package, research-ledger schema, source-ID linkage, and reference normalization checks passed. All four new source IDs and URLs were absent from the prior source register; each is now linked to this record.
- The generated Kotlin ingredient index is current at 1,564 references. The new reference has empty aliases, null density, and no unit mappings; the ingredient-form count remains 122.
- The product observation is linked to manufacturer sources S01 and S02. Ledger state is `measurementState: researched_supported` and `substitutionResearchState: researched_no_supported_substitute`; there is no finding, active rule, or recipe-line link.
- Picker projections and the 114-recipe / 1,123-row corpus scan passed. No candidate text or ID occurs in bundled recipes.
- JSON is UTF-8 without a BOM; French text is stored as Unicode escapes in bundled JSON. Local proposal link and scoped whitespace checks passed.
- No software tests were run because this batch only adds database JSON data and its generated static reference entry, under the current `AGENTS.md` rule.

## Review record

- [WP03 Section F Strawberry Banana Cheerios identity proposal](../../proposals/wp03-section-f-strawberry-banana-cheerios-identity-review-r185-20261016.md)

Broader Section F identity and terminology coverage remains open.
