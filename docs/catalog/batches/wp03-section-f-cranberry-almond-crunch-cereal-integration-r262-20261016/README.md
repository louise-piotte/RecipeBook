# WP03 Section F R262 — Cranberry Almond Crunch cereal integration

Integrated the [R262 review proposal](../../proposals/wp03-section-f-cranberry-almond-crunch-cereal-identity-review-r262-20261016.md).

## Decision

Added `ingredient-ref-cranberry-almond-crunch-cereal` as identity-only `Cranberry Almond Crunch cereal / céréales canneberges et amandes croquantes` in `GRAIN_AND_CEREAL`. This is one named Canadian ready-to-eat cereal product. Keep it separate from generic granola, multigrain flakes, its cranberry, almond, oat, rice, wheat, and corn ingredients, and other branded cereals.

The reference has no aliases, forms, density, or unit mappings. Do not add the manufacturer name `Post` as a prefix or alias, and do not create recipe links, conversions, yields, or substitutions.

## Measurements and use

The research ledger records the manufacturer-listed 380 g, 1.1 kg, and 1.4 kg packages, and Maxi's 1 cup (66 g) serving, as product-specific observations. These values do not define reusable package behavior, a density, or a cup-to-mass mapping. Post's separate crumble recipe uses one cup in that recipe; it is not a bundled RecipeBook link or a general cereal measure.

The manifest-listed bundle contains 114 recipes and 1,123 structured ingredient rows. It has no matching cereal name or ingredient-reference demand.

## Integration record

- Added four R262 source entries and four source-specific observations to the research-ledger record.
- Updated the Section F checklist, plan integration log, and roadmap. Broader Section F coverage remains open.
- Static seed-package normalization and validation, generated-index freshness, ledger schema and source ownership, picker projection, recipe-corpus, UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- No software tests or emulator checks were run; `AGENTS.md` exempts changes that only add database JSON data from testing.

## Evidence

The Canadian manufacturer pages identify the English and French product names and package sizes. The Québec Maxi listing confirms the French cereal title, the 380 g package, and its 1 cup (66 g) serving. The manufacturer recipe shows one product-specific use. Source URLs and limitations are documented in the proposal and ledger.
