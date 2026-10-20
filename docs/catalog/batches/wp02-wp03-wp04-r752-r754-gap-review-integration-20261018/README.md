# WP02/WP03/WP04 R752–R754 gap-review integration — 2026-10-18

## Integrated decisions

- **R752 — generic millet-flour substitution:** Added two formula-specific `blocked_pending_evidence` findings to the existing generic millet-flour ledger row. Aprodu and Banu report one wheat-bread study; Siddique et al. report one wheat-dough chapati study whose abstract and publisher highlight give different sensory thresholds. The accessible publisher material does not resolve millet species or establish a household rule. No active substitution, percentage, hydration adjustment, measurement, form, or mapping was added.
- **R753 — sorghum couscous:** Kept `candidate-sorghum-couscous` ledger-only and unresolved. Added the current Moroccan English/French retail listing and a Togo process source to the existing record. The listing establishes a named 500 g sorghum-couscous product but does not establish its full composition or processed state and does not meet the plan’s Québec-label condition. No active reference, alias, form, measure, or rule was added.
- **R754 — Atlantic halibut:** Added `fresh whole Atlantic halibut / flétan de l’Atlantique frais entier` as a `fresh_whole` form under the existing species-qualified identity. Added a form-level ledger record with the supplier’s English and French pages and reused OQLF identity source `WP04-FINFISH-ID-20261009-S04`. The supplier’s headless format and fishing season stay supplier-specific; no inventory, cleaning, measure, yield, conversion, recipe link, or substitution is claimed.

## Package snapshot

- Ingredient references: **1,848**; ingredient forms: **181**.
- Research ledger: **2,238 records**, **10,511 source entries**, **8,870 distinct source IDs**, and **7,517 distinct source URLs**.
- Bundled recipes: **114 files** and **1,123 structured ingredient rows**. No R752 target phrase, R753 candidate phrase, or R754 Atlantic-halibut phrase appears in the bundled recipe corpus.

## Verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` passed; this statically validates package normalization and the full seed/ledger schemas.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed for **1,848 references**.
- Source-ID and URL ownership checks passed. R752 adds two study sources; R753 adds three sources to the existing candidate; R754 adds two supplier URLs and reuses one existing OQLF source ID without changing its URL ownership.
- Picker projection keeps the generic millet flour results unchanged, leaves sorghum-couscous exact queries at zero results, and makes the full bilingual fresh-whole Atlantic-halibut form labels select the existing halibut identity without adding generic whole-fish terms.
- Recipe corpus scan: 114 manifest-listed files / 1,123 structured rows; no candidate-specific ingredient rows or serialized-text hits for these reviews.
- UTF-8 without BOM, ASCII/escaped Unicode database JSON, unique new source IDs, local links, no mojibake, and scoped whitespace checks passed.
- No software tests, build, emulator, or deployment were run. The shared catalog changes only add research/form data to database JSON, which the current `AGENTS.md` explicitly exempts from testing; R753 is a hold.

## Review records

- [R752 — generic millet-flour substitution review](../../proposals/wp02-a6-generic-millet-flour-substitution-review-r752-20261018.md)
- [R753 — sorghum-couscous product-boundary recheck](../../proposals/wp03-section-f-sorghum-couscous-product-label-recheck-r753-20261018.md)
- [R754 — fresh-whole Atlantic-halibut form review](../../proposals/wp04-section-p-atlantic-halibut-fresh-whole-form-review-r754-20261018.md)
