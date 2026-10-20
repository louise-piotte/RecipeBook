# WP04 / WP05 R428 and R430 gap-review integration

**Date:** 2026-10-17
**Scope:** WP04 Section P whole tilapia; WP05 Section Z aioli.

## Integrated decisions

- **R428 — whole tilapia:** Added identity-only `whole tilapia / tilapia entier` as `ingredient-ref-whole-tilapia` in `PROTEIN`, separate from the species-neutral fillet identity and the held Nile tilapia candidate. The English and French aliases follow current Mayrand and Loblaws wording. Mayrand's 1.36 kg unit/case amounts and `350/550` notation remain product-specific; neither supports a general measure, species, portion, or yield. The record reuses the reviewed OQLF and CFIA evidence and adds four current retailer sources. No form, observation, density, mapping, package yield, recipe link, conversion, or substitution was added. Since the package observation was omitted, measurement research remains `not_yet_researched`; substitution research also remains `not_yet_researched`. See the [R428 proposal](../../proposals/wp04-section-p-whole-tilapia-boundary-review-r428-20261017.md).
- **R430 — aioli:** Added identity-only `aioli / aïoli` as `ingredient-ref-aioli` in `SAUCE_AND_CONDIMENT`, with only OQLF's French spelling `ailloli` as an alias. Keep plain mayonnaise, Toum, garlic sauce, garlic mayonnaise, and chipotle aioli distinct. The Hellmann's volume portion and package are SKU-specific; CNF code 531 is regular mayonnaise and was not transferred. No measurement observation, form, density, mapping, recipe link, package yield, or substitution was added. Measurement research is `researched_no_supported_value`; substitution research remains `not_yet_researched`. See the [R430 proposal](../../proposals/wp05-section-z-aioli-identity-review-r430-20261017.md).

## Corpus and picker review

The manifest lists 114 recipes and 1,123 ingredient rows. A full serialized-text scan found no tilapia, aioli, aïoli, ailloli, or remoulade mentions. No recipe links or ingredient rows changed.

Picker projection using the current phrase-first normalization:

| Query | Projected result |
|---|---|
| `tilapia` | species-neutral fillets; whole tilapia |
| `tilapia fillets`, `filets de tilapia` | species-neutral fillets only |
| `whole tilapia`, `tilapia entier`, `tilapia whole fish`, `tilapia poisson entier` | whole tilapia only |
| `aioli`, `aïoli`, `ailloli` | aioli only |
| `garlic aioli`, `chipotle aioli`, `garlic sauce`, `sauce à l’ail`, `remoulade` | no result |
| `mayonnaise`, `mayo` | existing mayonnaise only |
| `toum`, `sauce toum` | existing Toum only |

The existing eight-result `garlic` query and eight-result `ail` query are unchanged.

## Validation

- Bundled package normalization and schema checks passed; references are normalized at 1,727 rows, forms remain at 141, and the ledger has 2,086 records.
- Generated ingredient index freshness check passed at 1,727 references.
- The ledger contains 9,461 source entries, 8,018 distinct source IDs, and 6,734 distinct source URLs. The nine new source IDs and URLs are unique; the two reused R428 source entries match their existing ledger records.
- UTF-8/no-BOM and escaped-Unicode JSON checks, new-source ID/URL uniqueness, exact reused-source checks, picker projection, manifest recipe scan, local README/proposal links, and scoped whitespace checks passed.
- No app tests, builds, emulator checks, or deployment were run because the changes only add database JSON data, consistent with `AGENTS.md`.

WP04 Section P remains open for other fish and unresolved species coverage. WP05 Section Z remains open for remoulade and the other unreviewed sauces and condiments.
