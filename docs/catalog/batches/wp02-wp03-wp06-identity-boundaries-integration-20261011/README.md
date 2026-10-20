# WP02, WP03, and WP06 identity-boundary integration

**Integrated:** 2026-10-11  
**Device:** Pixel 9a emulator, Android 16 / API 36, 1080 × 2424

## Catalog changes

- Added identity-only yacon / yacón in VEGETABLE_AND_AROMATIC. Both alias lists are empty. An independent Québec review subsequently accepted `yacón` as locally supported display wording, without an OQLF-preferred-term claim. Poire de terre was excluded because of its competing Jerusalem-artichoke use; jicama remains a separate ingredient. See `docs/catalog/proposals/wp06-yacon-quebec-display-review-20261011.md`.
- Added identity-only sweet potato starch noodles / nouilles à base de fécule de patate douce in GRAIN_AND_CEREAL. The English alias is sweet potato glass noodles and the French alias is vermicelles de patate douce. Generic glass/cellophane noodles, bare dangmyeon, mung-bean threads, and sweet potato starch remain separate.
- Updated the existing unqualified wheat-meal candidate with four Canadian product and historical sources. Kept generic wheat meal unresolved and inactive; retained only the already scoped whole wheat meal identity.
- Added no forms, densities, unit mappings, measurement observations, recipe links, conversions, yields, or substitutions. Recipe JSON and ingredient rows are unchanged.

The picker searches both display names and aliases by substring. Queries such as glass noodles and sweet potato starch can surface the qualified sweet-potato-starch noodle row; this does not establish a generic glass-noodle identity or alias.

## Validation and Pixel QA

- Seed normalization: 964 ingredient references.
- Generated Kotlin catalog freshness: passed, 964 references.
- Bundled package normalization: 0 changed parts; package check and validation passed.
- UTF-8 and no-BOM checks passed for the modified seed, ledger, and generated Kotlin file.
- Python package suite: 109 passed.
- Android unit suite: 417 tests, 0 failures, 0 errors, 0 skips.
- Pixel 9a instrumentation: 37 scheduled, 35 passed, 2 skipped, 0 failures.
- Deployment script assembled, installed, and launched the app successfully.
- Pixel picker checks showed yacon and the noodle identity in English and French. The app was returned to the unfiltered English home showing All Recipes (114). No ingredient or recipe edits were saved.

Screenshots are in screenshots/. The four picker screenshots show the two identities in both languages; english-home.png records the restored home. Each image is 1080 × 2424. SHA-256 values are in screenshots/SHA256SUMS.txt.

## Evidence boundaries

Yacon sources WP06-ANDEAN-YACON-20261011-S01–S10 and noodle sources WP03-SPN-20261011-S01–S11 are recorded on their ingredient-reference ledger entries. The wheat-meal update is recorded under ingredient-ref-wheat-meal with sources A7WM-20261011-S05–S08. Source wording and ingredient states remain scoped to the cited crop, product, retailer, or authority; no recipes or numeric behavior were inferred.
