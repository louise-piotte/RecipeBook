# WP03 broken-rice identity

- **Date:** 2026-10-07
- **Status:** identity integrated and verified in the Pixel 9a picker; connected instrumentation remains open because of emulator storage
- **Scope:** allocate broken rice as a source-backed edible milling-grade identity, separate from generic rice state forms. This does not establish a rice variety, preparation method, yield, measurement, or substitution.

## Catalog decision

- **ID:** `ingredient-ref-broken-rice`
- **English:** `broken rice`
- **fr-CA:** `riz en brisures`
- **Category:** `GRAIN_AND_CEREAL`
- **Aliases:** none
- **Forms and numeric data:** none

The current 2026 Canada Customs Tariff pairs the exact English/French names at item 1006.40.00. The Codex rice standard covers rice for direct human consumption and defines whole and broken kernels, so the item is an edible physical/milling-grade identity rather than a dry/cooked preparation form [WP03-S63, S97–S98, S119–S120].

OQLF's related *brisures de riz* entries are scoped to brewing. Keep those associated terms, brewer's rice, rice grits, rice screenings, cracked rice, *riz cassé*, and *riz brisé* inactive as broad aliases. Québec retailer evidence for *brisures de riz au jasmin parfumé* remains product-specific; do not generalize its jasmine label or alternate product names [WP03-S61–S66, S99].

No bundled recipe requests broken rice, but catalog identity coverage does not require existing recipe demand. Do not add forms under generic rice or activate density, unit mappings, measurements, yields, conversions, or substitutions.

## Recipe and catalog audit

- Scanned all 114 bundled recipe JSON files for `broken rice`, `riz en brisures`, `brisures de riz`, `riz cassé`, and `riz brisé`: no matching text was found.
- Compared the new English and French display keys against every active reference name and alias with the app's accent/ligature-folding search normalization: no exact normalized-key collision was found.
- No recipe lines, IDs, or quantities changed.

## Verification

- Canonical seed: 359 ingredient references, 16 forms, and 114 recipes.
- SHA-256 values:
  - `ingredient-references.v1.json`: `8fa8d500761041ff169d66979bdbe973d84699852bdb3051db34139d62372daf`
  - `ingredient-forms.v1.json`: `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a`
  - `manifest.v1.json`: `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`
  - research ledger (523 records): `cd2ae5caeda0b3efbda764e3f10ba2627fb9dd103c98bf465eaa7c722f17b2b5`
  - generated Kotlin catalog: `b4e03e4cdb14cc5a058b27c8f23851a846333490d53df26221b18ce01c13caf2`
- Reference normalization, bundled-package normalization/validation, and generated-index freshness checks passed.
- All 256 Android unit tests and all 9 Python seed-package tests passed. The initial unit run exposed the test's stale hard-coded reference count; it was updated to 359 and the full suite then passed.
- `tools/deploy_to_pixel9a_emulator.sh` passed its unit-test and debug-assembly tasks, installed the APK, and launched RecipeBook.
- On Pixel 9a, the English search `broken rice` returned `broken rice`; the French search `riz en brisures` returned `riz en brisures`. Both QA drafts were discarded, and the French home showed `Toutes les recettes (114)` afterward.
- Screenshots: [English picker](screenshots/picker-broken-rice-en.png), [French picker](screenshots/picker-broken-rice-fr-ca.png).
- Connected instrumentation was not retried. The retained AVD had 523 MB free (91% used) before the app update; prior test-APK installs failed with `INSTALL_FAILED_INSUFFICIENT_STORAGE` before any tests ran. Leave this gate open until emulator storage can be increased safely.
- UTF-8/no-BOM, seed JSON Unicode-escape, and `git diff --check` results are recorded in the final plan checkpoint.

## Sources

- **WP03-S61 — [OQLF, *brisures de riz* (1982)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8890710/brisures-de-riz):** brewing-domain entry; do not apply its term pair as a global alias.
- **WP03-S62 — [OQLF, *brisures de riz* (1986)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2088658/brisures-de-riz):** brewing-domain entry defining fragmented grains and listing associated brewing terms.
- **WP03-S63 / S97 — [Codex Standard for Rice CXS 198-1995](https://www.fao.org/input/download/standards/61/CXS_198e.pdf):** direct-human-consumption scope and broken-kernel size classes.
- **WP03-S98 — [USDA Economic Research Service, *Growing Demand for Broken Rice for Feed and Food*](https://www.govinfo.gov/content/pkg/GOVPUB-A93-PURL-gpo244601/pdf/GOVPUB-A93-PURL-gpo244601.pdf):** documents broken rice as a milling byproduct with human-food uses.
- **WP03-S119 — [Canada Border Services Agency, Customs Tariff, Chapter 10 (2026, English)](https://www.cbsa-asfc.gc.ca/trade-commerce/tariff-tarif/2026/01-99/ch10-2026-eng.pdf):** tariff item 1006.40.00 is named `Broken rice`.
- **WP03-S120 — [Agence des services frontaliers du Canada, Tarif des douanes, chapitre 10 (2026, français)](https://www.cbsa-asfc.gc.ca/trade-commerce/tariff-tarif/2026/01-99/ch10-2026-fra.pdf):** numéro tarifaire 1006.40.00 nommé « Riz en brisures ».
- **WP03-S65 / S66 / S99 — [Marché Afritibi French product page](https://afritibi.com/produit/brisures-de-riz/) and [English product page](https://afritibi.com/en/produit/jasmine-broken-rice/):** Québec human-food listing with a retained jasmine qualifier; the French page separately lists *riz cassé 2 fois*.

Independent Québec French review and the remaining Section F identities remain open.
