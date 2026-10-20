# R871 and R873 generic ingredient identity integration

Integrated 2026-10-19. This batch updates two generic ingredient identities across seafood and leafy vegetables.

## R871 — qualified oyster market-name group

Promoted the existing unresolved ledger candidate `ingredient-ref-fresh-oyster` in place to an identity-only reference:

- English: `oyster (name used for multiple oyster species)`
- French: `huître (nom utilisé pour plusieurs espèces d’huîtres)`
- English alias: `oysters`
- French alias: `huîtres`
- Category: `PROTEIN`

The qualifier makes the broad market-name scope visible. It does not identify one taxon or imply species interchangeability, preparation, food-safety, yield, measurement, or substitution equivalence. OQLF defines the Québec food-mollusc term `huître` with *Crassostrea virginica* but also describes cupped and flat oyster types. DFO lists multiple Canadian harvested oyster species. CFIA's Fish List is designed around common names paired to scientific taxa; the focused `Oyster` result evidence records unqualified `Oyster` and/or `Huître` across multiple taxa, but the interactive result page was not directly readable in the web reader during this integration. Treat that focused result claim as source-scoped, not as a new regulatory or recipe taxonomy.

The previous unresolved decision and sources remain in the ledger as review history. The candidate was promoted in place; no second oyster-group ID was added. Existing Pacific, Eastern, Kumamoto, European-flat, Olympia hold, dried-oyster, oyster-sauce, vegan oyster-sauce, and oyster-mushroom records remain distinct and unchanged. R817's CNF portions remain attached to Eastern oyster evidence. No forms, measurements, density, unit mappings, recipe links, product relationships, conversions, yields, or substitutions were added.

## R873 — garden orach

Added an identity-only reference for `garden orach / arroche des jardins`, scoped to leafy culinary use of *Atriplex hortensis*:

- English aliases: `garden orache`, `orach`, `orache`
- French alias: `arroche`
- Category: `VEGETABLE_AND_AROMATIC`

OQLF pairs the names with *A. hortensis* and describes its leaves as prepared like spinach or used in soup. The 1990 update date is recorded as a terminology limitation. Tennessee Extension and the RHS support edible leafy use. The 2023 Gazette officielle du Québec list cross-references `Arroche — Atriplex hortensis`; it does not establish retail availability. Spinach-named common names were excluded from aliases to avoid directing searches to spinach. Other *Atriplex* species, spinach, Malabar spinach, water spinach, New Zealand spinach, and common purslane remain separate.

No forms, measurements, density, unit mappings, recipe links, conversions, yields, or substitutions were added. Measurement and substitution research remain `not_yet_researched`.

## Generic-only scope and preserved evidence

The cross-category review found no open checklist task whose only deliverable is a brand, product-line, flavor, or retailer-variant roster. Such expansions remain out of scope because commercial-product counts do not add ingredient diversity. Existing branded rows were preserved. Product-specific measurements and claims remain attached to their cited products; manufacturer evidence may support a generic identity only when the evidence itself applies to the generic ingredient. No product-only claims were transferred in this batch.

## Catalog, ledger, and recipe audit

The active catalog contains 1,904 ingredient references and 201 forms. The ledger contains 2,311 records and 10,900 source entries. The bundled manifest lists 114 recipes and 1,123 ingredient rows. Both proposed identities were absent from the prior catalog and recipe corpus; no recipe link was added.

Exact query terms `garden orach`, `garden orache`, `orach`, `orache`, and `arroche des jardins` resolve to the garden-orach identity. No spinach alias was added. Exact qualified oyster display queries resolve only to the new market-name group. The plain plural aliases also match the new group while broad oyster / huître queries remain multi-result across species and prepared products. At integration, `oyster` returned 10 choices, `oysters` 5, `huître` 8, and `huîtres` 7. Named species, dried oyster, sauces, and oyster mushrooms remain separately selectable. Exact garden-orach names each returned the new row only; `spinach` remains a four-result search without garden orach. No recipe ingredient row contains the proposed names or IDs.

## Static validation

Static package and data checks passed after integration:

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`
- Research-ledger JSON Schema Draft 2020-12 validation.
- Source/ID ownership, reference category, no-measurement/no-substitution, picker projection, recipe corpus, UTF-8/no-BOM, escaped Unicode in bundled JSON, local links, plan anchors, and scoped whitespace checks.

No software tests, build, emulator, or deployment were run. `AGENTS.md` exempts database JSON-only additions from testing.
