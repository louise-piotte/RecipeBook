# WP02 / WP04 / WP06 R400–R402 integration — 2026-10-17

## Decisions

- **WP02 Section A7 R400:** Held buckwheat semolina / `semoule de sarrasin` outside active references and aliases. A Ukrainian mill distinguishes its product from flour, but the current Québec buckwheat page only lists `semoule`, without a matching English label or product boundary; the bilingual Statistics Canada code is from 1996. Kept `candidate-buckwheat-meal` unresolved. No new candidate, catalog row, form, measure, or recipe link was added.
- **WP04 Section P R401:** Held cod roe / `œufs de morue` unallocated pending a bundled recipe or a current Québec-facing product that identifies its intended presentation. OQLF's 1983 entry spans several product states; Salties' current fresh listing is from an Edmonton supplier; Azuma's current French title belongs to a spicy cod-roe paste SKU. Salties' linked product page returned a cache miss during coordinator review, so no species assignment or product French wording from that page is relied on. No catalog or ledger row was added.
- **WP06 Europe R402:** Added identity-only `fromage Comté / Comté cheese` as `ingredient-ref-comte-cheese`, category `CHEESE`, with only `fromage Comté AOP` as a French alias. Kept Gruyère, Vacherin, Tomme de Savoie, and other named cheeses distinct. The alias follows exact Québec recipe wording; it is not presented as an OQLF-approved term. No bundled recipe demand or recipe link was found.

No forms, reusable measures, density, unit mappings, conversions, yields, or substitutions were added. The full manifest-listed corpus contains 114 recipes and 1,123 ingredient rows and no matching Comté, buckwheat-semolina, or cod-roe demand.

## Research ledger

Added one verified `ingredient_reference` record for Comté, with seven source entries. Measurement state is `researched_no_supported_value`; substitution research remains `not_yet_researched` because the identity and recipe sources do not amount to a broad substitute review. No active substitute rule was added. No new ledger record was added for the holds; the existing `candidate-buckwheat-meal` remains unresolved.

The detailed source registers, ownership audits, picker projections, boundaries, and limits remain in the [R400 buckwheat semolina review](../../proposals/wp02-section-a7-next-milling-gap-review-r400-20261017.md), [R401 cod roe review](../../proposals/wp04-section-p-next-seafood-gap-review-r401-20261017.md), and [R402 Comté review](../../proposals/wp06-europe-next-regional-identity-review-r402-20261017.md).

## Static validation

- Bundled seed package validation passed; ingredient references are normalized and the generated picker index is current at 1,710 references.
- Phrase-first projection resolves `Comté`, `Comte`, `fromage Comté`, `Comté cheese`, and both AOP phrases only to the new Comté row. Buckwheat semolina/meal and cod-roe phrases remain unallocated.
- The ledger contains 2,070 records and 9,359 source entries, with 7,926 distinct source IDs and 6,644 distinct URLs. Source ownership and schema validation passed.
- The package contains 1,710 ingredient references, 141 forms, and 114 recipes / 1,123 ingredient rows. The full corpus scan found no phrase or reference matches for these three reviews.
- UTF-8/no-BOM, escaped Unicode in database JSON, proposal links, and scoped whitespace checks passed.
- No unit tests, instrumentation tests, builds, emulator checks, or deployment were run. `AGENTS.md` exempts database-JSON-only additions from testing.
