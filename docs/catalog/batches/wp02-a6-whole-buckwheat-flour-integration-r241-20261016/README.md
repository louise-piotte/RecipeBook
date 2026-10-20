# WP02 Section A6 R241 — whole buckwheat flour integration (2026-10-16)

## Accepted identity

Added identity-only `ingredient-ref-whole-buckwheat-flour`:

- English: `whole buckwheat flour`
- French: `farine entière de sarrasin`
- French alias: `farine de sarrasin entière`
- Category: `FLOUR_AND_STARCH`

Current Québec sources name whole buckwheat flour separately from dark/gray and light/pale flour. The sources do not establish one universal whole-grain, hull, extraction, milling-code, or grind specification. Keep this row separate from generic, dark/gray, light/pale, sprouted, Tartary, buckwheat meal, and buckwheat starch identities. No forms, density, mappings, reusable measures, conversions, yields, or recipe links were added. The 114-recipe / 1,123-row corpus has no matching buckwheat ingredient demand.

## Source-specific findings

The historical Québec Food Directory product 8204187 reports 60 g per 1/3 cup. It is stored only as an observation for that exact older La Milanaise product record. Current record 8205132 displays 1/4 cup (30 g) in its nutrition panel but also 1/3 cup (60 g) in a separate serving field; therefore measurement state stays blocked and neither current portion field is promoted.

The current directory says it is best to combine its La Milanaise flour with wheat flour. Because no recipe context, ratio, method, or tested result is supplied, this remains a blocked ledger finding without replacements or an active substitution rule.

- [R241 proposal](../../proposals/wp02-a6-whole-buckwheat-flour-identity-review-r241-20261016.md)
- [WP02 Section A6 checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L1598)
- [Trigone French product page](https://alimentstrigone.com/products/farine-entiere-de-sarrasin-biologique-1-kg)
- [Trigone English buckwheat catalogue](https://en.alimentstrigone.com/collections/organic-black-buckwheat)
- [Québec Food Directory current product 8205132](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8205132)
- [Québec Food Directory historical product 8204187](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8204187)

## Static verification

- Active references: **1,636** (up from 1,635).
- Ingredient forms: **122** (unchanged).
- Research-ledger records: **1,981** (up from 1,980); source entries: **8,657**; distinct source IDs: **7,336**; distinct URLs: **6,111**.
- Bundled corpus: **114 recipes / 1,123 ingredient rows** (unchanged).
- Package normalization, reference normalization, generated index, ledger schema, source ownership, UTF-8/no-BOM, local links, and scoped whitespace checks are recorded after validation.
- No software tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

The A6 review of buckwheat and other regional grain flours remains open.
