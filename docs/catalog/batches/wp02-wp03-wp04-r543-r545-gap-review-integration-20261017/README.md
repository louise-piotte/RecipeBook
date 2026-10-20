# WP02 / WP03 / WP04 R543–R545 gap-review integration

Integrated on 2026-10-17. This batch records one bounded substitution finding, three edition-specific CNF portions, and one species-qualified fish-cut form. It does not close the broader WP02 Section A, WP03 Section F, or WP04 Section P parents.

## R543 — generic brown-rice-flour substitution

Added the primary study as a source on `ingredient-ref-brown-rice-flour`, changed its `substitutionResearchState` to `researched_no_supported_substitute`, and added the evidence-only finding `brown-rice-flour-no-general-wheat-substitute-r543-20261017`. The finding keeps the 5% result specific to the tested Barbary flatbread formula and keeps manufacturer blend guidance product-specific. No active rule, replacement amount, hydration adjustment, density, measure, recipe link, or alias was added. The sprouted form and two SKU-only serving observations remain unchanged.

See the [R543 proposal](../../proposals/wp02-next-gap-review-r543-20261017.md).

## R544 — dry pearl barley CNF 2026

Added four record-local CSV sources, the CNF API Guide yield-field source, and the English/French API corroboration sources to `ingredient-form-pearl-barley-dry`. Added three separate `portion_weight` observations:

- Measure 341: 100 ml = 84.531 g.
- Measure 415: 250 ml = 211.327 g.
- Measure 1339: 250 ml dry = 211.327 g.

Measures 415 and 1339 remain separate despite the identical value. Excluded the 45 g mass-only and total-refuse rows. Left both type-9 Yield rows uninterpreted; in particular, `100 ml dry = 0.84531` is not treated as a 100 ml mass. Existing CNF 2015 observations remain separate and unchanged. No density, reusable mapping, active measure, cooking yield, dry-to-cooked conversion, recipe link, or substitution changed. The R510 access hold is retained as historical; R544 closes the joined-row inspection after direct retrieval of the official CSVs.

See the [R544 proposal](../../proposals/wp03-section-f-next-gap-review-r544-20261017.md) and [R510 historical access recheck](../../proposals/wp03-section-f-next-gap-review-r510-20261017.md).

## R545 — Atlantic halibut steak form

Added `ingredient-form-atlantic-halibut-steak` under the existing Atlantic-halibut identity, with the species-qualified bilingual labels, `steak_cut` form/preparation codes, empty match terms, and null density. Added its research-ledger record from two OQLF terminology entries, Metro's paired language views for product 235791, and the reused Atlantic-halibut identity source. The form adds no generic `darne` alias or match term, measure, conversion, yield, recipe link, or substitution. The broad Section P parent remains open.

See the [R545 proposal](../../proposals/wp04-section-p-atlantic-halibut-steak-form-review-r545-20261017.md).

## Validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py` completed; the package was already normalized. `--check` passed.
- The research-ledger validator accepted all 2,165 records and their source references.
- The generated ingredient-reference index is current at 1,805 references. The bundled package contains 147 forms after R545.
- Static assertions confirmed the R543 research state, all three R544 observations, and the R545 form with empty match-term arrays.
- Database JSON parsed as UTF-8 without BOM, with explicit Unicode escapes, a final newline, and no trailing whitespace. Changed documentation links, encoding, whitespace, and `git diff --check` passed.

No software tests, Android build, emulator run, or deployment were performed: the application-data changes only add database JSON data, and the remaining changes are documentation.
