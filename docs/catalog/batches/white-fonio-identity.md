# WP03/WP06 White Fonio Identity

- **Owner:** WP03 plant-food researcher; WP10 integration lead
- **Reviewers:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Integrate the source-named white fonio grain identity. Keep black fonio, fonio flour, and processed fonio products separate; do not infer measurement or substitution behavior.

## Identity decision

| Stable ID | English / fr-CA display | Aliases | Category and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-white-fonio` | white fonio / fonio blanc | EN: `fonio`, `acha`, `hungry rice`; FR: `fonio`, `acha`, `fundi`, `findi` | `GRAIN_AND_CEREAL`; white fonio is *Digitaria exilis*. Keep black fonio (*Digitaria iburua*) and milling products separate. [S34–S35] |

OQLF directly pairs *fonio blanc* with English *white fonio*, supplies the Latin name, and lists the accepted term families above. FAO distinguishes white fonio from black fonio by species and regional distribution. The alias `hungry rice` is retained because OQLF lists it as an English term; the catalog does not add bare `rice` as an alias.

The separate WP02 flour review found Canadian listings for ground dehulled and milled whole-grain fonio flour, plus Québec products sold as roasted or precooked fonio flour. The process and generic-display decision remains open in `baking-flours-starches.md` and the candidate evidence record; this grain row does not absorb those products.

## Source register

- **S34 — OQLF, fonio blanc:** [Québec terminology entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529747/fonio-blanc). Defines the West African cereal, pairs *fonio blanc* with English *white fonio*, gives *Digitaria exilis*, and lists French and English terms. No flour or numeric data is inferred.
- **S35 — FAO, Types of millet:** [Annex I](https://www.fao.org/4/W1808E/w1808e0k.htm). Distinguishes white fonio (*D. exilis*) and black fonio (*D. iburua*) and gives their regional occurrence. Used for the grain identity boundary only.

## Recipe and integration audit

All 114 bundled recipe files were parsed. Ingredient-name and original-text fields had no word-boundary matches for `fonio`, `fonio blanc`, `white fonio`, `acha`, `fundi`, `findi`, or `iburu`; no recipe was relinked.

The final canonical seed contains 314 ingredient references (SHA-256 `745706a4981225f5617f67be70ae9fe9d45e46e43c9b55b725adc3c251a3f7bf`). The research ledger contains 465 records (SHA-256 `234ab15124ffb6eea495a5c7543acbe2d70561dba6126fe1c2dd7bdac37f7c2b`). This row has null density and empty unit mappings; no forms, conversions, measurements, yields, or substitutions were added.

## Verification

- All 209 Android unit tests passed, including `BundledIngredientCatalogTest` checks for bilingual names, accepted aliases, grain category, absent numeric data, and separation from black fonio.
- All 9 Python seed-package tests passed. Ingredient-reference normalization, bundled-package validation and normalization checks, generated-index freshness, ledger schema/alias validation, UTF-8/no-BOM audit across all 124 bundled JSON files, and `git diff --check` passed.
- Android 16 / API 36 Pixel 9a instrumentation on `emulator-5554` completed 26 cases: 24 passed, two QA-gated skips, zero failures/errors. Skips were `openRouterSettingsPersistAndBlankKeyDisablesRemoteAi` and `actualActivityRetainsEditedAmountsMetadataAndDraftPhotoAcrossRecreation`.
- The project deploy script's full Gradle `test` and debug-assembly tasks passed and installed/launched the app on the Pixel 9a AVD at 1080×2424. Live picker searches `white fonio` and `fonio blanc` each returned one localized result. After discarding the unsaved probe, the French home screen still showed 114 recipes.
- Pixel 9a screenshots: `pixel9a-white-fonio-picker-en.png`, `pixel9a-white-fonio-picker-fr-ca.png`, and `pixel9a-white-fonio-home-fr-ca-114.png` in this directory.

## Remaining work

- Obtain independent bilingual Québec French review of the display and accepted regional names.
- Research fonio flour, roasted fonio flour, precooked fonio flour, and any processing/form distinctions as their own identity work.
- Keep measurement and substitution evidence open.
