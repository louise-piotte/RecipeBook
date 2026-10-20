# WP03 Black Fonio Identity

- **Owner:** WP03 plant-food researcher; WP10 integration lead
- **Reviewers:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Integrate the black fonio grain identity. Keep white fonio and milling or processed products distinct; do not infer measurement or substitution behavior.

## Identity decision

| Stable ID | English / fr-CA display | Aliases | Category and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-black-fonio` | black fonio / fonio noir | None | `GRAIN_AND_CEREAL`; *Digitaria iburua*, distinct from white fonio (*D. exilis*). No state variants or process products are implied. [S36–S37] |

Health Canada's French crop-group table lists both *fonio blanc* (*Digitaria exilis*) and *fonio noir* (*Digitaria iburua*). FAO's West African food-composition table gives the exact bilingual entry “Fonio, black, whole grain, raw / Fonio, noir, grain entier, cru” and identifies *D. iburua*. These sources support the canonical display and species distinction. Additional aliases were not added because the reviewed entries do not establish other unambiguous same-identity names. The FAO descriptor is not treated as a separate raw/whole form or as measurement evidence.

## Source register

- **S36 — Health Canada, crop-group list:** [Groupes de cultures présentant des propriétés chimiques ou des résidus similaires](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html). The French table lists white and black fonio with their respective species. Used for the Canadian French label and species distinction.
- **S37 — FAO, West African Food Composition Table:** [PDF](https://www.fao.org/4/i2698b/i2698b00.pdf). The black-fonio entry provides the bilingual whole-grain raw food description and *Digitaria iburua* taxonomy. No composition, portion, or measurement value is used.

## Recipe and integration audit

All 114 bundled recipe files were parsed. No ingredient `ingredientName` or `originalText` field matched `black fonio`, `fonio noir`, or `Digitaria iburua`; no recipe was relinked. The canonical seed contains 315 ingredient references (SHA-256 `a2542ddc80d1e23409e9d6098a4c0626fc41d8d5c6db5e00cafe35c32c6f097e`). The evidence ledger contains 466 records (SHA-256 `b57ee338329415647fdceb5b25987a6924f57a39653ac31efd099d0a8158ca67`). This row has null density and empty unit mappings; no aliases, forms, conversions, measurements, yields, or substitutions were added.

## Verification

- All 210 Android unit tests and all 9 Python seed-package tests passed. Reference normalization, package validation/normalization, generated-catalog freshness, research-ledger schema validation, the UTF-8/no-BOM audit across all 124 bundled JSON files, and `git diff --check` passed.
- Android 16 / API 36 Pixel 9a instrumentation completed 26 cases: 24 passed, two QA-gated skips, zero failures/errors. Skips were `openRouterSettingsPersistAndBlankKeyDisablesRemoteAi` and `actualActivityRetainsEditedAmountsMetadataAndDraftPhotoAcrossRecreation`.
- The deploy script's Gradle `test` and debug-assembly tasks passed; the app installed and launched on the Pixel 9a AVD at 1080×2424. Live picker searches `black fonio` and `fonio noir` each returned one result. The unsaved probe was discarded and the French home screen remained at 114 recipes.
- Pixel 9a screenshots: `pixel9a-black-fonio-picker-en.png`, `pixel9a-black-fonio-picker-fr-ca.png`, and `pixel9a-black-fonio-home-fr-ca-114.png` in this directory.

## Remaining work

- Obtain independent Québec French review of `fonio noir` and the species-qualified identity.
- Keep measurement and substitution research open.
- Continue remaining Section F grain/cereal coverage and the broader WP03 plant-food review.
