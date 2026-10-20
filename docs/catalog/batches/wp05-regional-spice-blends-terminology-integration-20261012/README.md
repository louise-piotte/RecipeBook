# WP05 regional spice-blend terminology integration

Integrated on 2026-10-12 from the [post-integration terminology review](../../proposals/wp05-regional-spice-blends-post-integration-review-20261012.md).

## Catalog changes

- Added EN alias `Moroccan seasoning` to the existing `ingredient-ref-ras-el-hanout` reference. Kept FR `épices couscous` off the global alias list because an indexed Québec retailer distinguishes a couscous-spice product from ras el hanout; direct package evidence remains a possible follow-up.
- Updated the existing dukkah reference to FR display `dukka`, FR alias `dukkah`, EN display `dukkah`, and EN alias `duqqa`. Bilingual search indexes both display names in either locale, so `dukka` does not need a redundant EN alias.
- Kept the `ingredient-ref-baharat` display and aliases unchanged. Turkish baharat and Sabaa Baharat remain regional/product-specific terms.
- Kept all three blends identity-only and composition-variable. The corpus has no matching recipe lines or prose; no new identities, recipe links, forms, measurements, conversions, or substitutions were added.
- Added re-review source records `WP05-T-REGIONAL-RECHECK-20261012-S13` through `S20` to the research ledger.

## Resulting snapshot

- Ingredient references: 1,192; SHA-256 `cadcbf8364313c2c8ebe73647082aa66c0648bfad40e8b54528cda451cd48318`.
- Ingredient forms: 86; SHA-256 `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978`.
- Research ledger: 1,493 records, 5,009 source entries, 4,086 distinct source IDs, and 8 unit conversions; SHA-256 `1cc991e9f32200ea398dee8b029d5d47b9f1df16731d80944b76e31abddbe59f`.
- Manifest: 114 recipe files; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Legacy import candidates: 66; SHA-256 `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f`.

Static package validation, ledger schema/evidence validation, reference normalization, and generated-index freshness passed. No tests or emulator checks were run; this integration changes catalog data and its supporting documentation only.
