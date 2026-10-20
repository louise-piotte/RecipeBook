# WP02/WP03/WP04 R181 gap-review integration

**Integrated:** 2026-10-16

**Plan:** [Global ingredient catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)

**Reviewed proposals:** [jackfruit seed flour](../../proposals/wp02-b2-jackfruit-seed-flour-canadian-quebec-product-boundary-hold-r181-20261016.md), [Oat Crunch Cinnamon Cheerios](../../proposals/wp03-section-f-cheerios-oat-crunch-cinnamon-identity-review-r181-20261016.md), and [octopus in olive oil](../../proposals/wp04-section-p-octopus-in-olive-oil-product-boundary-review-r181-20261016.md).

## Integrated decisions

- **WP02 B2 — jackfruit seed flour/powder:** Held outside active references and the research ledger pending a product-matched Québec French name and clearer Canadian food-product scope. The current Canada-facing listing is titled seed powder, and research flour preparations use varying processes. Keep it separate from fruit-bulb flour and extracted seed starch. No recipe demand was found.
- **WP03 Section F — Oat Crunch Cinnamon Cheerios:** Held outside active references and the ledger because it is one flavor in a manufacturer-listed three-SKU Oat Crunch family. A bare `Oat Crunch` picker query would return only Cinnamon while Almond and Oats ’N Honey remain uncatalogued. The exact bilingual product title and 1 cup (56 g) serving are source-supported, but no row was added pending family coverage or a picker distinction. No recipe demand was found.
- **WP04 Section P — octopus in olive oil:** Added identity-only `octopus in olive oil / poulpe à l’huile d’olive` as `PROTEIN`, with empty aliases. The Cambados species, formula, 120 ml format, and 111 g net amount remain SKU-specific. Kept generic octopus, dried octopus, garlic-sauce and Galician-sauce products separate.

Only the octopus identity and its four supporting/boundary sources were added. No forms, active measures, density, mappings, recipe links, conversions, yields, or substitutions were added. The manifest-listed **114 recipes / 1,123 ingredient rows** have no matching candidate demand.

## Source registration

The ledger registers the official Conservas de Cambados product page, a Canadian Solfarmers product listing, the Montréal Olive et Gourmando French listing, and NaturaMarket’s neighboring garlic-sauce product as a boundary source. Existing OQLF and CFIA references remain with their prior source records and IDs. Cheerios proposal sources remain proposal-only because the candidate was held.

## Static data validation

- Bundled seed-package validation, ingredient-reference normalization, and generated Kotlin catalog freshness passed.
- Reference and research-ledger JSON parsing/schema, source-ID and URL ownership, UTF-8 without BOM, escaped-Unicode, and sorted-ID checks passed.
- Exact-name/picker projection and manifest recipe-corpus checks passed.
- Local Markdown links and scoped whitespace checks passed.
- Totals: **1,559 references**, **122 forms**, **1,904 ledger records / 8,168 source entries / 6,979 distinct source IDs / 5,775 distinct source URLs**; **114 recipes / 1,123 ingredient rows**.
- No software tests, builds, emulator runs, or deployments were performed. This round’s active catalog change adds database JSON data under the updated `AGENTS.md` rule.

Broader WP02 B2/B3, Section F, and Section P coverage remains open.
