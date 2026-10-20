# WP03 Calrose Rice Identity

- **Owner:** WP03 plant-food researcher; WP10 integration lead
- **Reviewers:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Add Calrose as a named California medium-grain market type. Preserve the boundary with generic sushi rice and avoid inferring preparation-state behavior.

## Identity decision

| Stable ID | English / fr-CA display | Aliases | Category and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-calrose-rice` | calrose rice / riz Calrose | None | `GRAIN_AND_CEREAL`; RICARDO supplies the English/French display pair. University of California rice-breeding material and the California Rice Commission define Calrose as a California medium-grain market type. [S42–S45] |

Only `calrose rice / riz Calrose` is active. The row has no aliases, forms, density, unit mappings, yields, or substitutions. RICARDO associates Calrose with sushi rice and describes it as short-grain; the current technical sources define Calrose as a medium-grain market type. The short-grain descriptor is not imported, and generic `sushi rice / riz à sushi` remains separate and unassigned. This entry represents the Calrose market type, not one modern cultivar.

## Source register

- **S42 — RICARDO, A Little Lexicon of Rice Varieties:** [English page](https://www.ricardocuisine.com/en/articles/the-ingredient/1680-a-little-lexicon-of-rice-varieties). Uses the heading *Calrose Rice*. Its short-grain description and sushi comparison are not adopted as a catalog class or alias.
- **S43 — RICARDO, Le petit lexique des variétés de riz:** [French page](https://www.ricardocuisine.com/chroniques/l-ingredient/1680-le-petit-lexique-des-varietes-de-riz). Uses the heading *Le riz Calrose*. Its occasional *riz à sushi* association is not activated as an alias.
- **S44 — University of California Agriculture and Natural Resources, The California Rice Varieties: From the Rice Experiment Station:** [workshop material](https://rice.ucanr.edu/files/217622.pdf). Describes Calrose as California's first medium-grain variety and says the name is now a market trade name for California medium-grain rice. Used to define the market type, not to claim one current cultivar or import numeric properties.
- **S45 — California Rice Commission, Food:** [California rice information](https://www.calrice.org/food). Describes Calrose as a California-grown medium-grain rice and lists sushi among possible uses. Corroborates the market type; use does not create an alias.

## Recipe and integration audit

All 114 bundled recipe JSON files were scanned for Calrose and generic sushi-rice names. No Calrose or sushi-rice mention was found; no recipe was relinked. The canonical seed contains 319 references (SHA-256 `d335a2112b06196f344bc40e8e721b176eb4364d838eb2885230bdc00a69300a`) and the evidence ledger contains 469 records (SHA-256 `8e2262152ed4f683ad1779d47fab9316957767a0e67dc5f7e37113b6450bd31d`). The normalized keys `calrose rice` and `riz calrose` each resolve only to this row. Generic `sushi rice` and `riz à sushi` remain unassigned.

## Verification

- All 214 Android unit tests and all 9 Python seed-package tests passed. Reference normalization, bundled-package validation/normalization, generated-index freshness, research-ledger schema and alias-collision checks, UTF-8/no-BOM audit across all 124 bundled JSON files, and `git diff --check` passed.
- Android 16 / API 36 Pixel 9a instrumentation completed 26 cases: 24 passed, two QA-gated skips, zero failures/errors. The skipped tests were `openRouterSettingsPersistAndBlankKeyDisablesRemoteAi` and `actualActivityRetainsEditedAmountsMetadataAndDraftPhotoAcrossRecreation`.
- The deploy script's Gradle `test` and debug-assembly tasks passed; the app installed and launched on the temporary 8 GB Pixel 9a AVD at 1080×2424 after the original 6 GB AVD reported insufficient storage. The original AVD data was preserved.
- Live English `calrose rice` and French `riz calrose` picker searches each returned exactly one localized result. Generic `sushi rice` and accent-folded `riz a sushi` searches returned no Calrose result. The empty probe was discarded; the French home screen remained at 114 recipes.
- Screenshots: [English Calrose result](pixel9a-calrose-rice-picker-en.png), [French Calrose result](pixel9a-calrose-rice-picker-fr-ca.png), [English generic sushi-rice boundary](pixel9a-calrose-sushi-rice-boundary-en.png), [French generic sushi-rice boundary](pixel9a-calrose-sushi-rice-boundary-fr-ca.png), and [French home with 114 recipes](pixel9a-calrose-home-fr-ca-114.png).

## Remaining work

- Obtain independent Québec French review of *riz Calrose* as the fr-CA display.
- Keep generic sushi-rice regional scope and rice preparation-state modeling open.
- Continue remaining Section F and broader plant-food coverage.
