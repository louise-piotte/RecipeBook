# WP02/WP03/WP04 R749–R751 gap-review integration — 2026-10-18

## Integrated decisions

- **R749 — red quinoa flour:** Updated the existing ledger row only. Measurement is `researched_no_supported_value`; substitution research is `blocked_pending_evidence` with one finding for the formula-specific bread trial. Added four sources. The 2026 density study's freeze-milled samples are Atlas, Temuco, and BRS Piaburu and do not identify a red sample; the bread trial uses laboratory-ground Bolivian red quinoa seed flour with local type-000 wheat flour. No measurement observation, active conversion, density, mapping, form, recipe link, or substitution rule was added.
- **R750 — corn poha:** Documentation-only hold. Current catalogs list corn poha separately from thin/medium/thick poha grade labels; copying the rice-poha labels would make `thin poha` and `poha fin` ambiguous and attach rice wording to maize. The active catalog and ledger remain unchanged.
- **R751 — Walleye:** Added `whole walleye / doré jaune entier` as one `whole_fish` form with no match terms. Added a form-level ledger record with the Daily Seafood product source and reused OQLF and Québec identity sources. The form does not claim the seller's cleaned/scaled state, fresh/frozen state, product weight, Québec availability, recipe use, measure, yield, conversion, or substitution.

## Package snapshot

- Ingredient references: **1,848**; ingredient forms: **180**.
- Research ledger: **2,237 records**, **10,503 source entries**, **8,863 distinct source IDs**, and **7,510 distinct source URLs**.
- Bundled recipes: **114 files** and **1,123 structured ingredient rows**. No red-quinoa-flour or corn-poha demand was found; the corpus also contains no Walleye rows.

## Verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` passed; this statically validates package normalization and the full seed/ledger schemas.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed for **1,848 references**.
- Source and ID ownership checks passed. The R749 IDs/URLs are new; R751 reuses the two existing Walleye identity sources and adds one new product source. R750 allocates no IDs or sources.
- Picker projection confirms the Walleye phrases become selectable while `whole fish`, `pickerel`, broad `whole`, and freshness queries retain their expected multi-result/boundary behavior. The corn-poha hold leaves all picker results unchanged; copying rice-poha grades to corn would make the exact thin-poha English and French searches ambiguous.
- Recipe corpus scan: 114 manifest-listed files / 1,123 structured rows; zero candidate-specific row or text hits for red quinoa flour, corn poha, or Walleye.
- UTF-8 without BOM, escaped French accents/symbols in database JSON, source ID/URL uniqueness, local links, no mojibake, and scoped whitespace checks passed.
- No software tests, build, emulator, or deployment were run. The shared catalog changes only add research and form data to database JSON, which the current `AGENTS.md` explicitly exempts from testing; R750 is documentation-only.

## Review records

- [R749 — red-quinoa-flour measurement and substitution](../../proposals/wp02-a6-red-quinoa-flour-measure-substitution-review-r749-20261018.md)
- [R750 — corn-poha thickness grades](../../proposals/wp03-section-f-corn-poha-thickness-grade-review-r750-20261018.md)
- [R751 — whole Walleye form](../../proposals/wp04-section-p-walleye-whole-fish-form-review-r751-20261018.md)
