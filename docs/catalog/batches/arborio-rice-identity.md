# WP03 Arborio Rice Identity

- **Owner:** WP03 plant-food researcher; WP10 integration lead
- **Reviewers:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Resolve the legacy Arborio rice candidate as a source-backed named rice variety. Keep the varietal identity distinct from generic cooked rice; do not infer measurement or substitution behavior.

## Identity decision

| Stable ID | English / fr-CA display | Aliases | Category and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-arborio-rice` | arborio rice / riz arborio | None | `GRAIN_AND_CEREAL`; OQLF defines the item as an Italian rice variety. No cooked-state, subtype, or risotto-use aliases are inferred. [S38] |

OQLF directly pairs *riz arborio* with English *arborio rice* and defines it as a variety of Italian rice. Its parenthetical discussion of rice types does not activate those names as aliases. Bare `arborio` and `risotto rice` were not added. This is a varietal identity, not a replacement for the existing `cooked rice / riz cuit` identity. No state forms, measurements, yields, or substitutions were inferred.

## Source register

- **S38 — OQLF, riz arborio:** [Québec terminology entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17021211/riz-arborio). Defines *riz arborio* as a variety of Italian rice, gives the preferred French term, and lists *arborio rice* in English. No additional aliases or numeric data are taken from the entry.

## Recipe and integration audit

All 114 bundled recipe files were parsed for `ingredient-ref-arborio-rice`, `arborio`, `arborio rice`, and `riz arborio` in ingredient reference IDs, names, and original line text. No matching ingredient line was found; no recipe was relinked. The canonical seed contains 316 references (SHA-256 `ef79945a16b23b82b57e4f3db9399a2159cc196bcade357eb2f4d8bdc5f9f1b6`), and the evidence ledger contains 466 records (SHA-256 `d77bec241c745fcd88608b686e09e3e209642c9cf1aa85bbef85ecb7904b6c2c`). The legacy import candidate file now contains 103 remaining rows (SHA-256 `e54cd21522dc5a4e1f6b3e3b62dea73d67a3147a967b7a30f6a9c1b784a725d4`). The integrated row has empty aliases, null density, and empty unit mappings. The unresolved legacy-candidate entry was removed after its stable ID was promoted to the canonical reference.

## Verification

- All 211 Android unit tests and all 9 Python seed-package tests passed. Reference normalization, package validation/normalization, generated-index freshness, research-ledger schema validation, UTF-8/no-BOM audit across all 124 bundled JSON files, legacy candidate count consistency, and `git diff --check` passed.
- Android 16 / API 36 Pixel 9a instrumentation completed 26 cases: 24 passed, two QA-gated skips, zero failures/errors. Skips were `openRouterSettingsPersistAndBlankKeyDisablesRemoteAi` and `actualActivityRetainsEditedAmountsMetadataAndDraftPhotoAcrossRecreation`.
- The deploy script's Gradle `test` and debug-assembly tasks passed; the app installed and launched on the Pixel 9a AVD at 1080×2424. Live searches `arborio rice` and `riz arborio` each returned one result. The empty draft was discarded and the French home screen remained at 114 recipes.
- Pixel 9a screenshots: `pixel9a-arborio-rice-picker-en.png`, `pixel9a-arborio-rice-picker-fr-ca.png`, and `pixel9a-arborio-rice-home-fr-ca-114.png` in this directory.

## Remaining work

- Obtain independent Québec French review of *riz arborio* as the fr-CA display.
- Keep dry/cooked rice form modeling, measurements, and substitutions open.
- Continue remaining Section F rice varieties and broader plant-food coverage.
