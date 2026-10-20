# R1080–R1082 cross-category generic ingredient review

**Date:** 2026-10-19
**Scope:** One milling-boundary hold, one form-scoped measurement, one formula-scoped substitution, and an all-category queue scan for commercial-only assignments.

## Integrated decisions

- **R1080 — rye aleurone flour:** Keep this plausible generic milling fraction outside active catalog and ledger data. The reviewed primary sources identify a rye aleurone fraction and experimental breads, but they do not establish broadly usable human culinary identity or a Québec French food display. Keep it distinct from wheat aleurone flour, rye bran, rye-bran flour, rye germ, rye flour, and rye meal. Do not transfer study material, process, formula, or animal-model claims. The generic wheat-meal gap remains open. The named Anson Mills wheat-meal lead is out of scope because commercial-product counts do not add ingredient diversity. See the [R1080 proposal](../../proposals/wp02-a7-next-generic-milling-gap-r1080-20261019.md).
- **R1081 — semisweet chocolate chips:** Added one historical USDA `published_portion` observation to the existing `ingredient-ref-semisweet-chocolate` ledger record, with `ingredientFormId: ingredient-form-semisweet-chocolate-chips`: 1 source cup = 168 g, USDA HGB 72 Table 9 Food No. 960. USDA Table 1 defines that cup as 237 mL / 8 fluid ounces; no filling or packing method is stated. Keep the observation tied to that generic chip form and 2002 source. Do not derive density or activate a unit mapping, or transfer the value to unformed, chopped, melted, or other chocolate. No seed reference, form, recipe line, or measurement quantity was changed. See the [R1081 proposal](../../proposals/wp07-next-generic-measurement-review-r1081-20261019.md) and [USDA HGB 72](https://www.ars.usda.gov/ARSUserFiles/80400525/Data/hg72/hg72_2002.pdf).
- **R1082 — rolled oats to quick oats:** Added one source and one `researched_supported` finding to the existing rolled-oats ledger row. The option is limited to Healthful Blondie’s blended, single-serving *Air Fryer Baked Oats* formula and RecipeBook line `001#1`. Keep the 1/2-cup amount tied to the recipe’s rolled-oat baseline; the source gives no quick-oat quantity. Add no global or contextual rule, recipe-line link, reverse direction, amount conversion, or transfer to other recipes. See the [R1082 proposal](../../proposals/wp08-next-generic-substitution-review-r1082-20261019.md) and [Healthful Blondie’s recipe](https://healthfulblondie.com/air-fryer-baked-oats/).

## All-category commercial-scope review

The full unchecked-plan scan found no new brand-, product-line-, flavour-family-, SKU-, retailer-variant-, or commercial-roster-only deliverable in any ingredient category. Remaining open prompts concern generic ingredient diversity, terminology, transferable evidence, or source limits. Commercial-only counts do not add ingredient diversity; do not pursue those queues. The Section F cereal rosters and named Anson Mills, Nu Life Market, Dempsey, and Mochiko/Shiratamako product-only leads remain out of scope for that reason.

Preserve existing branded entries and their product-specific observations. Do not delete or merge them into generic ingredients without separately reviewing whether each claim or measurement transfers to the generic ingredient. Manufacturer pages may still support a generic ingredient when the supported statement is transferable; keep any product-only portion, process, or performance claim attached to its product.

## Validation

- Seed package normalization check passed; the seed package was already normalized.
- Generated ingredient catalog freshness check passed at **2,072 references**.
- Research-ledger Draft 2020-12 schema validation passed; source links and new IDs are unique and resolvable.
- Final counts: **2,072 references, 205 forms, 2,477 ledger records, 11,561 source entries, 9,714 distinct source IDs, 931 measurement observations, 433 substitution findings, 114 recipes, and 1,123 ingredient rows**.
- UTF-8 without BOM, no mojibake, local documentation links, and scoped whitespace checks passed.
- No software tests, build, emulator, or deployment were run: this batch only adds research data to database JSON, as allowed by `AGENTS.md`.

Generic ingredient coverage remains open across categories. The full project plan and roadmap carry the remaining priorities.
