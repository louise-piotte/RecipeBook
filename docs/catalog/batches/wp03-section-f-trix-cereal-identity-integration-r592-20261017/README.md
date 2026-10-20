# WP03 Section F R592 — Trix cereal identity

Date: 2026-10-17

## Decision

Added identity-only `ingredient-ref-trix-cereal` with English display `Trix cereal` and French display `Céréales Trix`, category `GRAIN_AND_CEREAL`. It has no aliases, forms, measurements, density, unit mappings, conversions, recipe links, yields, or substitutions. The ledger records the identity as verified; measurement research found no supported reusable measure, and substitution research remains not yet researched.

The reference stays separate from fruit, corn, rice flour, puffed grains, and other finished cereals. Metro’s “Céréales en forme de fruits, Trix” heading remains evidence rather than an alias, so broad fruit searches do not acquire this cereal. The 303 g package and the manufacturer’s 14 g whole-grain statement are not total serving measures.

## Evidence

- General Mills Canada, [Trix](https://www.generalmills.ca/our-food/brands/trix): identifies Trix as a cereal and describes six crispy puff shapes with fruit flavours. Its 14 g whole-grain statement does not give total serving mass or volume.
- General Mills Canada, [Trix (French-Canadian page)](https://www.generalmills.ca/fr-ca/our-food/brands/trix): calls it “la céréale” and describes the product in French; this supports descriptive French wording, not an OQLF ruling.
- Metro Québec, [Céréales en forme de fruits, Trix](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-en-forme-de-fruits/p/065633150836): lists the product title, 303 g package, UPC `065633150836`, and ingredient declaration. Product formulation and retail listing can change; the package mass is not a kitchen measure.

See the [R592 proposal](../../proposals/wp03-section-f-next-gap-review-r592-20261017.md), the [Section F item](../../../RecipeBook-global-ingredient-catalog-plan.txt#L4525), and the broader [Section F review](../../../RecipeBook-global-ingredient-catalog-plan.txt#L14968). Those larger review items remain open.

## Static verification

The bundled package and reference JSON validation passed, the generated ingredient index is current, source IDs and URLs have no conflicting owners, the static picker projection matches the proposal, and the manifest-listed recipe corpus contains no Trix demand. UTF-8/no-BOM, local-link, and scoped whitespace checks passed. No application tests, build, emulator check, or deployment were needed because this change only adds database JSON data and tracking documentation under `AGENTS.md`.
