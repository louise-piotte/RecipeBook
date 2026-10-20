# WP04 Section R plant replacement integration — 2026-10-12

## Catalog decisions

- Added identity-only `ingredient-ref-plant-based-yogurt-substitute` as `plant-based yogurt substitute / substitut de yogourt végétalien`. The OQLF entry defines a fermented product made exclusively from plant-origin ingredients. Aliases are limited to its source-listed substitute terms; ordinary `plant-based yogurt` and `vegan yogurt` remain contextual wording, not aliases.
- Added identity-only `ingredient-ref-vegan-cheese-substitute` as `vegan cheese substitute / substitut de fromage végétalien`. OQLF defines the vegan subclass as made exclusively from plant or fungal ingredients and distinguishes it from broader partial dairy replacements. English aliases are `plant-based cheese substitute` and `plant-based cheese alternative`; French aliases are empty.
- Kept generic plant cream, whipping products, plant butter/spreads, cream-cheese alternatives, and egg replacers unassigned where a generic name does not establish one composition or function. The legacy `egg substitute` candidate remains `needs_clarification`: CFIA's terminology can cover an egg-white product with added ingredients, while the bilingual Bob's Red Mill source describes one vegan baking SKU. Neither defines a universal replacement.
- Natural ingredients such as aquafaba, flax, chia, and fruit purées remain separate from formulated replacements. No ingredient allergen profile or universal substitution behavior was inferred.

## Recipe and numeric data

The scan of all 114 bundled recipes / 1,123 ingredient rows found no recipe demand for the two added identities. No recipe links, forms, density, unit mappings, measurements, conversions, yields, or substitution rules were added or changed.

The package has 1,151 references / 79 forms / 114 recipes / 1,123 ingredient rows; 68 legacy candidates; and 1,445 ledger records / 4,826 source entries / 3,946 distinct source IDs / 8 unit conversions.

## Sources

- OQLF, [substitut de yogourt végétalien](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26584157/substitut-de-yogourt-vegetalien).
- OQLF, [substitut de fromage végétalien](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26558712/substitut-de-fromage-vegetalien) and broader [substitut de fromage](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26561216/substitut-de-fromage).
- CFIA, [common name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/common-name) and [proposed guidance for plant-based egg alternatives](https://inspection.canada.ca/en/about-cfia/transparency/consultations-and-engagement/completed/label-and-represent-plant-based-alternatives/proposed-guidance). The latter is consultation guidance, not a final product standard.
- Bob's Red Mill, [French egg replacer SKU](https://www.bobsredmill.ca/produit/gluten-free-vegan-egg-replacer) and [English product page](https://www.bobsredmill.com/product/gluten-free-vegan-egg-replacer).

## Static validation

Seed normalization/checking, package validation, generated-index freshness, ledger validation, exact-key ownership, recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed after integration. No tests or emulator checks were run because this change only adds database JSON data, as directed by `AGENTS.md`.
