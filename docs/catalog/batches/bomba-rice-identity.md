# WP03 Bomba Rice Identity

- **Owner:** WP03 plant-food researcher; WP10 integration lead
- **Reviewers:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Add the named Bomba rice variety as an identity. Keep paella use and grain shape descriptive; do not infer measurement, state, or substitution behavior.

## Identity decision

| Stable ID | English / fr-CA display | Aliases | Category and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-bomba-rice` | bomba rice / riz bomba | None | `GRAIN_AND_CEREAL`; RICARDO pairs the English and French names and describes the short-grain rice variety's paella use. The EU specification corroborates Bomba as an *Oryza sativa* variety. [S40, S41] |

Only `bomba rice / riz bomba` is active. Paella use and the short-grain description are context, not generic aliases. The row has no aliases, forms, density, unit mappings, yields, or substitutions. It remains distinct from Arborio rice, Carnaroli rice, glutinous rice, and cooked rice.

## Source register

- **S40 — RICARDO, rice-variety lexicon:** [English page](https://www.ricardocuisine.com/en/articles/the-ingredient/1680-a-little-lexicon-of-rice-varieties) and [French page](https://www.ricardocuisine.com/chroniques/l-ingredient/1680-le-petit-lexique-des-varietes-de-riz). The headings use *Bomba Rice* and *riz Bomba*; both describe paella use. Used for names and culinary context only.
- **S41 — European Union, Arroz de Valencia product specification:** [Official Journal entry](https://eur-lex.europa.eu/eli/C/2024/3986/oj). Lists Bomba among the named *Oryza sativa* varieties. Used to corroborate varietal identity; no geographic-protection claim or numeric grain property is imported.

## Recipe and integration audit

All 114 bundled recipe JSON files were scanned for Bomba text and `ingredient-ref-bomba-rice`; no match was found and no recipe was relinked. The catalog has 318 references (SHA-256 `90b2495d5964e8a0d2ab783c42469d0afedc2d95a8b0f2c837a76e414e46d194`) and the evidence ledger has 468 records (SHA-256 `10bfcc65053d1ce368578bf49e2d9a793551a080dfe9516088b6583a289c1f10`). The normalized keys `bomba rice` and `riz bomba` each resolve only to this row; the full catalog has no normalized alias collisions.

## Verification

- Reference normalization, bundled-package validation and normalization checks, generated-index freshness, ledger schema validation, and `git diff --check` passed. All 124 bundled JSON files are valid UTF-8 without BOM; they contain no raw non-ASCII characters or detected mojibake markers.
- All 213 Android unit tests and all 9 Python seed-package tests passed. The deploy script's full `test` and debug-assembly tasks also passed.
- Android 16 / API 36 Pixel 9a instrumentation completed 26 cases: 24 passed, two QA-gated skips, zero failures/errors. Skipped tests were `openRouterSettingsPersistAndBlankKeyDisablesRemoteAi` and `actualActivityRetainsEditedAmountsMetadataAndDraftPhotoAcrossRecreation`.
- The app installed and launched on the Pixel 9a AVD at 1080×2424. English search `bomba rice` and French search `riz bomba` each returned one result under the matching UI language. The temporary empty recipe draft was discarded; the French home screen remained at 114 recipes.
- Screenshots: `pixel9a-bomba-rice-picker-en.png`, `pixel9a-bomba-rice-picker-fr-ca.png`, and `pixel9a-bomba-rice-home-fr-ca-114.png` in this directory.

## Remaining work

- Obtain independent Québec French review of *riz bomba* as the fr-CA display.
- Keep rice preparation-state modeling, measurements, and substitutions open.
- Continue remaining Section F rice varieties and broader plant-food coverage.
