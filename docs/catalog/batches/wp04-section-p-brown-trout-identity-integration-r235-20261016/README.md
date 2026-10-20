# WP04 Section P — brown trout identity integration (R235, 2026-10-16)

## Decision

Added identity-only `brown trout / truite brune` for *Salmo trutta* as a `PROTEIN` reference. The display pair is supported by OQLF, Québec, and CFIA naming; aliases are `German brown trout`, `truite d’Europe`, and `truite allemande`.

Kept `sea trout / truite de mer`, bare `trout / truite`, `truite Loch Leven`, `truite fario`, and the scientific name out of the alias fields. The species-neutral smoked- and canned-trout references remain separate. No forms, measures, density, unit mappings, recipe links, conversions, yields, or substitutions were added.

Québec sources establish that the species is raised and can be sold through specified channels. They do not establish broad current retail availability or a current brown-trout consumer SKU. The identity row makes no prevalence or sourcing claim. The bundled recipe corpus has no matching ingredient demand.

## Files updated

- [Bundled ingredient references](../../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json): one new reference.
- [Research ledger](../../research-ledger.v1.json): one verified identity record, with no measurement observations or substitution findings. Reused existing source IDs for the same source URLs.
- [Generated ingredient catalog](../../../../app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt): regenerated from the reference package.
- [Catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt): marked the brown-trout coverage item complete.
- [Roadmap](../../../../roadmap.md): recorded the R235 decision and post-integration counts.
- [R235 proposal](../../proposals/wp04-section-p-brown-trout-identity-review-r235-20261016.md): updated with the accepted disposition.

## Verification

- `normalize_seed_ingredient_references.py --check`: passed.
- `normalize_bundled_seed_package.py --check`: passed.
- Generated catalog check: current at **1,628 references**.
- Research ledger validation: **1,973 records, 0 errors**.
- Picker projection: all five retained names resolve only to `ingredient-ref-brown-trout`; `trout` returns six choices and `truite` returns five; broad `brown` returns thirteen choices. Rejected alias terms return no result.
- Manifest corpus scan: **114 recipe files, 1,123 ingredient rows, 0 matching rows**.
- UTF-8/no-BOM and escaped-Unicode checks passed for the database JSON. Local Markdown links and scoped whitespace checks passed.
- Counts: **1,628 references**, **122 forms**, and **1,973 ledger records / 8,631 source entries / 7,314 distinct source IDs / 6,089 distinct URLs**; **114 recipes / 1,123 ingredient rows**.

No software tests or emulator checks were run because the change only adds database JSON data under [`AGENTS.md`](../../../../AGENTS.md).
