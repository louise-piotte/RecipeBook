# WP03 Section F shredded-wheat cereal identity integration

## Decision

Added identity-only `ingredient-ref-shredded-wheat-cereal` as `shredded wheat cereal / blé filamenté`
in `GRAIN_AND_CEREAL`. The current Canadian manufacturer product range supports a plain shredded-wheat
cereal class and distinguishes its bran-added variant. Health Canada's Canadian Nutrient File pairs
the ready-to-eat product with the Québec French name `blé filamenté`; current Québec government usage
and Usito's definition independently support that display and distinguish the cereal from puffed
wheat.

Kept wheat grain, flour, flakes, puffed wheat, bran flakes, bran-added cereal, altered varieties, and
composite cereals distinct. Added no aliases, forms, density, unit mappings, measurements,
conversions, yields, recipe links, or substitutions. The 114 manifest-listed recipes and all 1,123
ingredient rows have no candidate phrase or reference link.

## Sources

- [Post Consumer Brands Canada — Shredded Wheat Cereal](https://www.postconsumerbrands.ca/brand/shredded-wheat/): distinguishes Original Big Biscuit, Original Spoon Size, and Spoon Size Shredded Wheat & Bran.
- [Post Consumer Brands Canada — Original Spoon Size](https://www.postconsumerbrands.ca/brand/shredded-wheat/products/original-spoon-size/): identifies a Canadian-prepared original cereal with whole-grain wheat as its sole ingredient; its package and serving particulars remain SKU-specific.
- [Health Canada — Canadian Nutrient File food code 1279](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=1279): gives the bilingual label `Cereal, ready to eat, Shredded Wheat, Post / Céréale, prête-à-manger, blé filamenté, Post`. The 25 g biscuit serving is not a generic measure.
- [Gouvernement du Québec — Allergènes et leurs différentes appellations](https://www.quebec.ca/sante/alimentation/allergies-alimentaires/allergenes-differentes-appellations): uses `blé filamenté` as a breakfast-cereal example; page last updated 2026-02-16.
- [Usito, Université de Sherbrooke — blé](https://usito.usherbrooke.ca/d%C3%A9finitions/bl%C3%A9): defines `blé filamenté` as wheat processed into filaments and generally eaten as breakfast cereal, and separately defines `blé soufflé`.

Full source records and the accepted decision are in `research-ledger.v1.json` under
`ingredient-ref-shredded-wheat-cereal`. The [source review](../../proposals/wp03-section-f-shredded-wheat-cereal-identity-review-20261012.md)
documents exact-key ownership and the full recipe audit.

## Snapshot and validation

Snapshot after integration; hashes cover exact file bytes.

| Surface | Count | SHA-256 |
| --- | ---: | --- |
| Ingredient references | 1,227 | `255496df3d6cf09d667e87759989af0c858942a685142846802d187af185b882` |
| `GRAIN_AND_CEREAL` references | 112 | — |
| Ingredient forms | 86 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Legacy import identities | 66 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Research ledger | 1,526 records; 5,217 source entries; 4,280 distinct source IDs | `b6016f97ad0159dec2741910bdcf74d9e7a42a08ba609269671d0b68a60a0cee` |
| Generated Kotlin catalog | 1,227 references | `c9a55e13dbb2484bd4043d6811c2f551b1cbcd915a2e47c3aeab3aa3a4fba590` |
| Seed manifest | 114 recipes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe content | 1,123 ingredient rows; 752,942 bytes | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |

Seed-package validation, reference normalization, generated-catalog freshness, research-ledger
validation, normalized exact-key ownership, recipe scanning, UTF-8/no-BOM, and scoped whitespace
checks passed. No tests or emulator checks were run because the change only adds database JSON data,
as directed in `AGENTS.md`.
