# WP02 Barley Flour Identity (Section 04 A4)

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Integrate general barley flour with an OQLF-supported Québec French name. Keep it distinct from barley grain identities and from malted/toasted barley flour products; do not infer measurement or substitution claims.
- **Input revision:** repository `HEAD` `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4`; pre-integration reference JSON SHA-256 `0259a6499ee6bac49dec93431ea5c6833fba935a486a3dbd818fe98e0ea12f4c` (306 references); pre-integration evidence-ledger SHA-256 `a9787d308e06fc4bdcbd95314397843421ea3d2d75f1da413dbd07481813e7d8` (456 records); plan snapshot SHA-256 `abce6eeacc1a483f810e180a3d9eee0a6822417a552a4dffb9a50a18cc09421c`.
- **Recipe audit:** no bundled recipe ingredient line contains barley flour, farine d'orge, or malt barley flour; no recipe line was relinked.
- **Existing identity audit:** no general barley or barley-flour reference exists. Hulled barley and pearl barley are separate `GRAIN_AND_CEREAL` references, and no barley flour form/conversion/substitution records exist.
- **Dependencies:** WP01 identity/evidence contract; WP02 A4 flour review and B6 toasted/malted product review; WP03 grain review; WP10 canonical seed integration.

## Identity decision

| Stable ID | English / fr-CA display | Active aliases | Evidence and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-barley-flour` | barley flour / farine d'orge | None | OQLF directly pairs the Québec French and English product names. La Milanaise lists barley flour products in both locales. Keep hulled and pearl barley as grain identities, and keep malted barley flour outside general aliases. [S01–S04] |

The identity is `FLOUR_AND_STARCH`, separate from hulled barley and pearl barley in
`GRAIN_AND_CEREAL`. Whole-grain, sifted, organic, malted, toasted, and brand-specific products remain
grades or qualified products outside this general row. No aliases, density, measurement, conversion,
form, or substitution data were activated.

## Source register

Sources were accessed on 2026-10-06.

- **S01 — OQLF, farine d'orge:** [Grand dictionnaire terminologique entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489060/farine-dorge). Gives preferred `farine d'orge` and English `barley flour`. The entry's historical milling/performance notes are not used.
- **S02 — La Milanaise, Organic Whole Barley Flour:** [English product page](https://lamilanaise.com/en/produits/organic-whole-barley-flour/). The product heading corroborates barley flour as a named Québec milling product. Whole-grain, organic, T150, protein, and use details are not imported.
- **S03 — La Milanaise, farine d'orge entière biologique:** [French product page](https://lamilanaise.com/produits/farine-orge-entiere-biologique/). The product heading corroborates the French name. Whole-grain, organic, T150, protein, and use details are not imported.
- **S04 — OQLF, farine d'orge maltée:** [Grand dictionnaire terminologique entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497648/farine-dorge-maltee). Pairs `farine d'orge maltée` with `malt barley flour`; it supports a distinct qualifier boundary, not an alias or synonym for general barley flour.

## Integration and verification

Integration and verification are complete; the batch remains `in_review` pending independent
bilingual Québec French approval. The final reference JSON has 307 records (SHA-256
`392b68395d123e68ecb4ef369adc590929f5f67a57dc85b4b6541c66b09a8835`), and the research ledger has
457 records (SHA-256 `e868ad32a7e519d47f8fce8af5d50795699a9571f12d3539d0e7ca815ade3874`).

- `:app:testDebugUnitTest` passed all 201 unit tests. Connected Pixel 9a / Android 16
  instrumentation reported 26 tests: 24 passed, two environment-gated skips, and zero failures or
  errors. All 9 Python seed-package tests passed. Reference normalization, package normalization and
  validation, generated-catalog freshness, ledger-schema and alias-collision checks, UTF-8/no-BOM
  audit across 124 bundled JSON files, and `git diff --check` passed.
- The deploy script's `test` and debug-assembly tasks passed and installed/launched the build. The
  original 6 GB Pixel 9a AVD reported insufficient storage during APK installation, so UI and
  instrumentation verification used a temporary copy of the Pixel 9a profile with an 8 GB data
  partition and the same 1080×2424 display. The original AVD data was preserved.
- Live ingredient-picker search `barley flour` returned one barley-flour result. Exact Québec French
  search `farine d'orge` returned that same single result. `malt barley flour` returned no result for
  the general barley-flour identity. Screenshots are `pixel9a-barley-exact-en.png`,
  `pixel9a-barley-exact-fr.png`, and `pixel9a-barley-malted-boundary.png` in this directory.
- The unsaved probe was discarded without saving; the home screen still showed `All Recipes (114)`.
  The launch and final home screenshots are `pixel9a-barley-launch.png` and
  `pixel9a-barley-home-114.png`.

## Remaining work

- Obtain independent bilingual Québec French review of the display and malted/toasted boundary.
- Keep barley flour distinct from WP03 grain identities and continue A4 milling-grade review.
