# Generic ingredient gap integration R936–R938 — 2026-10-19

Integrated three generic culinary ingredient gaps across grain fractions, regional plant foods, and seafood parts. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched or added.

## Accepted catalog changes

- **R936 — barley germ / germe d’orge:** added identity-only `ingredient-ref-barley-germ` in `GRAIN_AND_CEREAL`. The English identity is supported by the cereal-germ study; the descriptive Québec French compound remains provisional. Added no aliases, forms, measures, recipe links, conversions, yields, or substitutions.
- **R937 — glasswort (Salicornia) / salicorne:** added generic `ingredient-ref-glasswort` in `VEGETABLE_AND_AROMATIC` and the source-supported `pickled` form `ingredient-form-glasswort-pickled`. Kept the taxon distinct from sea vegetables and rock samphire. Added no recipe link, generic measure, density, conversion, yield, or active substitution rule.
- **R938 — fish frames / carcasses de poisson:** added identity-only `ingredient-ref-fish-frames` in `PROTEIN`, distinct from loose fish bones, fish heads, trimmings, stock, and named species. The French display remains provisional. Added no forms, aliases beyond singular search variants, measures, conversions, yields, recipe links, or substitutions.

## Evidence scope

- Glasswort ledger observations preserve the Racines boréales **100 g** product listing, the Le Monde recipe’s **50 g total for four people**, and Gourmet Sauvage’s **190 mL** jar. Each remains tied to its exact product or recipe. None is a reusable kitchen measure or transferable density.
- The Le Monde page’s purslane alternative is recorded only for the garnish role in that tomato salad. No general replacement ratio or active substitution rule was added. The freeze-dried extract study remains separate from fresh and pickled salicorne.
- The DFO **125 lb / 50 gallon** fish-frame batch remains industrial and source-scoped. No measure was transferred to the generic frame identity or the existing fish-bones row.
- WorldFish describes regional fish-food uses including fried fish, soups, and sauces; the reviewed passage does not support a consommé claim.
- The barley-germ study and cereal-structure review support a research-prepared grain fraction, not common retail availability or a household measure.

## Cross-category queue disposition

A fresh scan of unchecked plan work found no open task whose sole deliverable is a brand, product line, flavour family, SKU, or retailer-variant roster. The broad Section F cereal-diversity parent remains open for generic ingredient gaps; its commercial-roster child work and the named Anson Mills wheat-meal research remain out of scope because commercial-product counts do not add ingredient diversity. Those prior dispositions remain recorded in the plan. Other open brand or manufacturer mentions are evidence-quality, measurement-scoping, or generic category guidance, not roster assignments.

Existing branded catalog rows and source-specific claims were preserved. No existing entry was deleted, merged, or transferred into a generic row. Manufacturer and producer pages were used only where their evidence supported generic identity or preparation claims; product-specific measurements remain attached to their cited products.

## Data and validation

- Active ingredient references: **1,958** (from 1,955).
- Ingredient forms: **205** (from 204).
- Research ledger records: **2,363** (from 2,359).
- Legacy-import identities: **55**, unchanged.

Static validation passed:

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`
- Scoped ID, ledger-observation, UTF-8/BOM, and documentation checks.

No software tests were run because the accepted catalog changes only add database JSON, as permitted by `AGENTS.md`. The generated ingredient index was refreshed to 1,958 references.

## Research proposals

- [R936 barley germ](../../proposals/wp02-plan-generic-gap-r936-20261019.md)
- [R937 glasswort and pickled form](../../proposals/wp03-plan-generic-gap-r937-20261019.md)
- [R938 fish frames](../../proposals/wp04-plan-generic-gap-r938-20261019.md)
- [Cross-category scope review](../generic-ingredient-scope-review-20261019/README.md)
