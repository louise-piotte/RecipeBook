# WP07 granulated-sugar CNF portion integration

Recorded five Health Canada CNF 2015 food code 4318 portion observations for `granulated sugar / sucre granulé`: 5 mL = 4.2 g, 15 mL = 12.7 g, 100 mL = 84.5 g, 125 mL = 105.7 g, and 250 mL = 211.3 g. The CNF page does not state the filling or packing method, so the values remain source-specific ledger observations. The earlier USDA SR28 and King Arthur cup observations remain separate.

The ledger state is `researched_supported` for the documented portions. The active reference remains unchanged with null `defaultDensity` and empty `unitMappings`; no conversion, recipe amount, form, alias, or substitution changed. The recipe corpus remains at 114 files / 1,123 ingredient rows; granulated sugar remains linked in 65 rows across 54 recipes.

The package validation and generated-index freshness check passed. Focused ledger checks confirmed the five exact values, one owner for the new source ID, unique observation IDs, and unchanged active sugar conversion fields. UTF-8/no-BOM and `git diff --check` passed. No app, unit, instrumentation, or emulator tests were run because this change only adds database JSON data under the updated `AGENTS.md` rule.

See the [review memo](../../proposals/wp07-granulated-sugar-cnf-portion-evidence-review-20261016.md). Overall ledger totals are 1,885 records, 8,032 source entries (6,873 distinct source IDs), and 467 measurement observations.
