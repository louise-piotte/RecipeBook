# WP05 Section Z R433 remoulade identity integration

**Date:** 2026-10-17

## Decision

Added identity-only `remoulade / sauce rémoulade` as `ingredient-ref-remoulade` in `SAUCE_AND_CONDIMENT`. The row stores `rémoulade` as its OQLF-backed French alias and `remoulade sauce` as its current Québec menu-attested English alias. Keep the identity separate from tartar sauce, mayonnaise, aioli, prepared horseradish, Toum, celery-rémoulade dishes, and qualified styles. The ledger has three identity sources, no measurement observations, `measurementState=researched_no_supported_value`, and `substitutionResearchState=not_yet_researched`. Add no form, density, unit mapping, package yield, recipe link, conversion, or substitution. See the [R433 proposal](../../proposals/wp05-section-z-remoulade-identity-review-r433-20261017.md).

OQLF supplies the preferred French terms and English `remoulade`; current Québec restaurant listings corroborate local wording. The older OQLF definition describes one mayonnaise-based version, while current menus vary in wording, so no shared formula or quantity is stored.

## Corpus and picker review

The manifest lists 114 recipes and 1,123 ingredient rows. No recipe text or ingredient row mentions remoulade, and no link or recipe edit was made. The only ingredient-row matches for tartar/tartare are the existing cream-of-tartar rows in recipes 021 and 068; both remain linked unchanged.

Picker projection using the current phrase-first normalization:

| Query | Result after integration |
|---|---|
| `remoulade`, `rémoulade`, `sauce rémoulade`, `sauce remoulade`, `remoulade sauce` | `ingredient-ref-remoulade` only |
| `sauce` | 45 references; adds remoulade to an already broad query |
| `sauce tartare`, `tartar sauce`, `tartare sauce` | existing tartar-sauce row only |
| `tartar` | cream of tartar, tartar sauce, Tartary buckwheat flour |
| `tartare` | tartar sauce, Tartary buckwheat flour |
| `mayonnaise`, `mayo` | existing mayonnaise only |
| `aioli`, `aïoli` | existing aioli only |
| `prepared horseradish`, `raifort préparé` | existing prepared-horseradish row only |
| `céleri rémoulade`, `celeriac remoulade` | no result |

## Validation

- Bundled package normalization and schema checks passed; references are normalized at 1,728 rows, forms remain at 141, and the ledger has 2,087 records.
- Generated ingredient index freshness check passed at 1,728 references.
- The ledger contains 9,464 source entries, 8,021 distinct source IDs, and 6,737 distinct source URLs. The three new source IDs and URLs are unique.
- UTF-8/no-BOM and escaped-Unicode JSON checks, picker projection, manifest recipe scan, local README/proposal links, and scoped whitespace checks passed.
- No app tests, builds, emulator checks, or deployment were run because the change only adds database JSON data, consistent with `AGENTS.md`.

WP05 Section Z remains open for ketchup, mustard varieties, Worcestershire, brown and steak sauces, barbecue sauces, and other unreviewed condiments.
