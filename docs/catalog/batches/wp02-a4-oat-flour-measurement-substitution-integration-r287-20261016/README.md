# WP02 Section A R287 integration: generic oat-flour research

Completed bounded measurement and wheat-replacement research for the existing `ingredient-ref-oat-flour` row. Recorded Cuisine Soleil’s `1/4 cup (30 g)` label only as an exact-product portion observation. Its label does not state cup convention, filling method, or whether the flour is whole-grain, so no generic density, cup conversion, or unit mapping was added. Kept CNF food code 6275 and its 20 g serving with R230’s separate whole-grain oat-flour identity.

Recorded the 2023 bread study as formula-specific evidence. Its 10% (w/w) wheat-flour replacement and texture results do not establish a reusable home-recipe substitution. No form, conversion, yield, recipe link, or active rule was added. The 114-recipe bundle has no matching oat-flour demand.

## Files

- `docs/catalog/research-ledger.v1.json`
- `docs/catalog/proposals/wp02-a4-oat-flour-measurement-substitution-review-r287-20261016.md`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`

## Verification

- Bundled package normalization and validation, ingredient-reference normalization, and generated picker-index freshness passed after the concurrent R287/R289 catalog integration.
- Research-ledger schema validation and targeted R287 source-ID/URL linkage checks passed.
- Scanned all 114 manifest-listed recipes (1,123 structured ingredient rows); no generic or whole-grain oat-flour demand was found.
- UTF-8/no-BOM, local-link, scoped whitespace, and targeted database JSON checks passed.
- No software tests, builds, or emulator checks were run. This batch adds database research JSON only, per `AGENTS.md`.

Totals at the R287 integration point: 1,661 ingredient references, 126 forms, and 2,010 ledger records / 8,849 source entries / 7,491 distinct source IDs / 6,253 distinct URLs; 114 recipes / 1,123 ingredient rows.

## Sources

- [R287 oat-flour measurement and substitution proposal](../../proposals/wp02-a4-oat-flour-measurement-substitution-review-r287-20261016.md)
- [Québec Food Directory: Cuisine Soleil Organic Gluten Free Oat Flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223779)
- [He et al., 2023 bread study](https://academic.oup.com/ijfst/article/58/4/1979/7807321)
