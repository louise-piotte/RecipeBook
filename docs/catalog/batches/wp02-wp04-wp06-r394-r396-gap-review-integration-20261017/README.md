# WP02 / WP04 / WP06 R394–R396 integration — 2026-10-17

## Decisions

- **WP02 A7 R394:** Added identity-only `spring wheat semolina / semoule de blé tendre` as `FLOUR_AND_STARCH`. Prairie Flour Mills identifies a Canadian Red Spring Wheat semolina product and OQLF supplies the bilingual term pair. Kept `farina`, generic wheat meal, durum semolina, and prepared cream-of-wheat cereal separate. Added no aliases, forms, measures, density, mappings, conversions, recipe links, yields, or active substitution. Measurement research found no reusable value; exact-product substitution research remains open.
- **WP04 Section P R395:** Added identity-only `trout roe / œufs de truite` as `PROTEIN`, with only `trout caviar` and `caviar de truite` as qualified aliases. Kept species and product handling unspecified, excluded fishing bait, and left salmon roe, tobiko, masago, bottarga, milt, sturgeon caviar, and uni separate. Recorded CaviarHub’s 50 g for 1–2 people and 100 g for 2–4 seller suggestions as source-specific portion observations. No reusable measures, density, mappings, forms, recipe links, conversions, yields, or active substitution were added. The retailer’s salmon-roe comparison does not support a recipe replacement.
- **WP06 Europe R396:** Added identity-only `burrata / burrata` as `CHEESE`, with current Canadian product-title aliases `burrata cheese`, `fresh burrata cheese`, and `fromage burrata frais`. Kept mozzarella, stracciatella, burratini, and *Burrata di Andria* PGI distinct. Recorded one Québec recipe’s 200 g burrata for two portions as a recipe-specific observation. Fresh mozzarella remains a qualitative comparison only; substitution research is blocked pending recipe-specific evidence. No active substitution, form, density, unit mapping, package yield, conversion, or recipe link was added.

All three proposals found no matching rows or links in the 114 bundled recipes / 1,123 ingredient rows. Broader A7, Section P, and Europe coverage remain open.

## Research-ledger reconciliation

Added missing `ingredient_reference` records for four existing active identities: Baddaz, bsissa, fregola sarda, and Keskes Khoumassi. Their identity records and proposal integrations already existed, but the shared ledger did not contain matching rows.

- **Baddaz:** recorded DARI’s qualitative corn-couscous alternative guidance without a ratio or runtime rule.
- **Bsissa:** recorded one brand-specific 100 g / 5 tablespoons serving and one cinnamon-biscuit flour replacement formulation. Neither is generalized to other products or recipes.
- **Fregola sarda:** recorded AP/Milk Street’s equal-volume pearl-couscous alternative only for the named four-serving S’erbuzzu soup, including its recipe-specific 3/4 US cup amount and cook-timing adjustment.
- **Keskes Khoumassi:** recorded the reviewed protected-product identity and that reviewed sources support no reusable measure or recipe replacement.

These findings add no active measure, mapping, density, form, yield, recipe link, or substitution rule. The existing records for these identities were preserved.

During the full-ledger source audit, one duplicate CFIA source ID had two URL spellings. Corrected the missing `and` in the URL path to match the live [CFIA standard page](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-2). Its source ID, evidence, and product findings did not change.

## Static validation

- The bundled seed package and research-ledger schema/semantic validation passed.
- Ingredient-reference normalization and generated picker-index freshness passed; the index contains 1,706 references.
- The ledger contains 2,066 records, 9,336 source entries, 7,906 distinct source IDs, and 6,625 distinct URLs. A global source-ID-to-URL check found no conflicts or dangling decision, observation, or finding source IDs.
- The package contains 1,706 ingredient references, 141 forms, and 114 recipes / 1,123 ingredient rows.
- UTF-8/no-BOM, explicit Unicode escapes in the database JSON, local links, and scoped whitespace checks passed.
- No software tests, build, emulator check, or deployment were run. The catalog update adds database JSON data, and `AGENTS.md` exempts JSON-only database additions from testing.

See the [R394 proposal](../../proposals/wp02-section-a7-next-milling-gap-review-r394-20261017.md), [R395 proposal](../../proposals/wp04-section-p-next-fish-shellfish-gap-review-r395-20261017.md), and [R396 proposal](../../proposals/wp06-europe-region-gap-review-r396-20261017.md).
