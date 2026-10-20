# WP02 / WP04 / WP06 R397–R399 integration — 2026-10-17

## Decisions

- **WP02 Section A7 R397:** Added identity-only `barley semolina / semoule d'orge` as `GRAIN_AND_CEREAL`, with the exact source-attested medium-size aliases. Kept generic barley meal, grits, cracked barley, barley flour, cream-of-barley cereal, and barley couscous separate; `belboula` remains on barley couscous, and no `dchicha` family terms were added. The 1½ cups (315 g) in one Québec pudding recipe is product/recipe-specific, and the Canadian Nutrient File food code combines barley flour and semolina. No form, density, unit mapping, reusable measure, conversion, yield, recipe link, or substitution was added. Measurement and substitution research found no supported general value or rule.
- **WP04 Section P R398:** Added identity-only Metro item 773365154601 as `boneless salted pollock / goberge salée et désossée`, `PROTEIN`. Corrected feminine agreement in the French display while preserving the retailer’s original title in evidence. Kept the product separate from Atlantic and Alaska pollock, the Seafood Depot *P. virens* product, salt cod, stockfish, and pollock flakes. Its 454 g package and ingredient declaration remain SKU-specific; no species, form, reusable measure, conversion, yield, recipe link, or substitution was added.
- **WP06 Europe R399:** Added identity-only `nduja / nduja`, `PROTEIN`, with empty alias arrays. Kept retailer wording such as “spicy spreadable salami” as source evidence, not a generic alias; preserved Gianduja, generic salami and sausage, brand-specific formulations, and Spilinga wording as separate boundaries. The retailer’s 250 g packages remain SKU-specific. No form, measure, conversion, yield, recipe link, or substitution was added.

All three proposal scans found no matching rows or links in the 114 bundled recipes / 1,123 ingredient rows. Broader A7, Section P, and Europe-wide coverage remain open.

## Research-ledger records

Added three verified `ingredient_reference` records. Each records `measurementState: researched_no_supported_value` and `substitutionResearchState: researched_no_supported_substitute`; none adds an observation, substitution finding, or runtime rule. The three records contain 16 source entries in total:

- R397 sources `WP02-A7-BARLEY-SEMOLINA-R397-20261017-S01` through `-S06` cover a Québec ITHQ recipe and buying guide, Health Canada, CFIA, a Canadian retailer, the Canadian Nutrient File, and a trade catalog.
- R398 sources `WP04-SECTIONP-BONELESS-SALTED-POLLOCK-R398-20261017-S01` and `-S02` are Metro’s paired product pages. The record also links the separate Seafood Depot product evidence and reuses CFIA Fish List, OQLF `goberge`, and CFIA fish-labelling sources.
- R399 sources `WP06-EUROPE-CALABRIA-NDUJA-R399-20261017-S01` through `-S04` cover Mayrand’s bilingual pages for one SKU, a separate Montréal retailer SKU, and the Calabria regional tourism plan.

The proposals hold the detailed source registers, picker projections, ownership audits, product boundaries, and scope limitations: [R397 barley semolina](../../proposals/wp02-section-a7-barley-semolina-identity-review-r397-20261017.md), [R398 boneless salted pollock](../../proposals/wp04-section-p-boneless-salted-pollock-product-boundary-review-r398-20261017.md), and [R399 nduja](../../proposals/wp06-europe-calabrian-nduja-identity-review-r399-20261017.md).

## Static validation

- Bundled seed package validation passed; ingredient references are normalized and the generated picker index is current at 1,709 references.
- The ledger contains 2,069 records, 9,352 source entries, 7,919 distinct source IDs, and 6,637 distinct URLs. The source-ID/URL audit found no conflicts or dangling source references.
- The package contains 1,709 ingredient references, 141 forms, and 114 recipes / 1,123 ingredient rows. The full recipe scan found no R397–R399 phrase or reference matches.
- UTF-8/no-BOM, explicit Unicode escapes in database JSON, proposal links, and scoped whitespace checks passed.
- No unit tests, instrumentation tests, build, emulator check, or deployment was run. `AGENTS.md` exempts JSON-only database data additions from testing.
