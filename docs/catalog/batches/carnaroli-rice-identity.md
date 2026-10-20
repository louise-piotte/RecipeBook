# WP03 Carnaroli Rice Identity

- **Owner:** WP03 plant-food researcher; WP10 integration lead
- **Reviewers:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Add the source-named Carnaroli rice variety as an identity. Keep it distinct from Arborio rice and generic cooked rice; do not infer measurement or substitution behavior.

## Identity decision

| Stable ID | English / fr-CA display | Aliases | Category and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-carnaroli-rice` | carnaroli rice / riz carnaroli | None | `GRAIN_AND_CEREAL`; OQLF identifies a named Northern Italian rice variety. Risotto use is descriptive context, not an alias. [S39] |

OQLF directly pairs *riz carnaroli* with English *carnaroli rice*. It describes the grain as long and plump, grown in northern Italy, and notes its use in risotto. Only the bilingual canonical names are active; bare `carnaroli` and generic `risotto rice` are not aliases. This identity remains separate from `arborio rice / riz arborio` and `cooked rice / riz cuit`. No forms, measurements, yields, or substitutions were inferred.

## Source register

- **S39 — OQLF, riz carnaroli:** [Québec terminology entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26501715/riz-carnaroli). Defines the variety, gives the preferred French term and English translation, and notes the risotto use. No numeric values or additional aliases are activated.

## Recipe and integration audit

All 114 bundled recipe files were parsed for `ingredient-ref-carnaroli-rice`, `carnaroli`, `carnaroli rice`, and `riz carnaroli` in ingredient reference IDs, names, and original line text. No matching ingredient line was found; no recipe was relinked. The canonical seed contains 317 references (SHA-256 `e27bef955f12ce826891dfd9462bfb40db83246ef929277e432f880d942e51c3`), and the evidence ledger contains 467 records (SHA-256 `d2b7f42b920bfd787d873616e06db50ee21232c80da04910f1b6c583d045a6a5`). The row has empty aliases, null density, and empty unit mappings.

## Verification

- All 212 Android unit tests and all 9 Python seed-package tests passed. Reference normalization, package validation/normalization, generated-index freshness, research-ledger schema validation, UTF-8/no-BOM audit across all 124 bundled JSON files, and `git diff --check` passed.
- Android 16 / API 36 Pixel 9a instrumentation completed 26 cases: 24 passed, two QA-gated skips, zero failures/errors. Skips were `openRouterSettingsPersistAndBlankKeyDisablesRemoteAi` and `actualActivityRetainsEditedAmountsMetadataAndDraftPhotoAcrossRecreation`.
- The deploy script's Gradle `test` and debug-assembly tasks passed; the app installed and launched on the Pixel 9a AVD at 1080×2424. Live searches `carnaroli rice` and `riz carnaroli` each returned one result. The empty draft was discarded and the French home screen remained at 114 recipes.
- Pixel 9a screenshots: `pixel9a-carnaroli-rice-picker-en.png`, `pixel9a-carnaroli-rice-picker-fr-ca.png`, and `pixel9a-carnaroli-rice-home-fr-ca-114.png` in this directory.

## Remaining work

- Obtain independent Québec French review of *riz carnaroli* as the fr-CA display.
- Keep rice-state modeling, measurements, and substitutions open.
- Continue remaining Section F rice varieties and broader plant-food coverage.
