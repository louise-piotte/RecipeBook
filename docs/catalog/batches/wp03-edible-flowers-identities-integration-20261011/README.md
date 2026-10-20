# WP03 edible-flower identity integration

Integrated 2026-10-11 from the reviewed [Section K identity proposal](../../proposals/wp03-edible-flowers-identity-review-20261011.md). This batch adds four identity-only references and resolves the existing roselle-calyx candidate. It does not change recipe files or application logic.

## Catalog decisions

- Added `culinary lavender / lavande culinaire` for food-grade *Lavandula angustifolia* flowers.
- Added `rose petals / pétales de rose`, separate from rose hips and the existing rose-syrup sweetener.
- Added `nasturtium flowers / fleurs de capucine`, keeping the *Tropaeolum tuberosum* mashua identity separate.
- Added `dried hibiscus calyces / calices d'hibiscus séchés` for the food-grade *Hibiscus sabdariffa* calyx product. Retained `fleurs d'hibiscus séchées` as a Québec-market alias; left plant-level `oseille de Guinée`, `sorrel`, and generic `hibiscus` out of the match set.
- Added no forms, recipe links, measurements, densities, unit mappings, conversions, yields, or substitutions. No recipe ingredient rows matched the candidates.
- Kept generic `edible flowers` unresolved because the food plant, edible part, and food-grade handling are species- and product-specific.

## Sources

The ledger records ten new source IDs for OQLF and Québec food terminology, a Québec culinary lavender grower, UQAC’s rose-petal guidance, the MAPAQ food directory, Canadian and Montréal hibiscus products, and University of Florida IFAS edible-flower guidance. The roselle record retains its three earlier regional sources.

## Validation

- 1,016 ingredient references, 66 forms, 114 recipes, and 1,123 ingredient rows.
- 1,296 research-ledger records, 4,171 source entries, 3,419 distinct source IDs, and 8 unit conversions.
- Ingredient-reference and bundled-package normalization, package validation, generated-catalog freshness, and ledger validation passed.
- No tests were run because this batch changes database JSON only, as specified in `AGENTS.md`.
