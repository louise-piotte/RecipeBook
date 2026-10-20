# WP03 Section G: Somen noodles identity

- **Status:** identity, package, unit, lint, APK, instrumentation, and Pixel 9a verification passed. Broader Section F/G coverage and independent Québec French review remain open.
- **Accepted reference:** `ingredient-ref-somen-noodles`, `somen noodles / somen`, category `GRAIN_AND_CEREAL`, no aliases.
- **Evidence record:** `ingredient-ref-somen-noodles` in `research-ledger.v1.json`; sources WP03-S215–WP03-S223.

## Identity boundary

OQLF lists *somen* as a preferred French term and distinguishes the thin Japanese noodle class from thick udon. MAFF separately classifies dried somen, hiyamugi, and udon; it does not establish a universal somen formulation. Keep somen separate from udon, hiyamugi, soba, ramen, generic wheat or maize noodles, and prepared noodle dishes.

The fr-CA display is `somen`; no alias is necessary because the bilingual picker searches display names from both locales. The package normalizer removed the redundant proposed English alias. No form rows were added.

## Portion and substitution evidence

Health Canada's cooked-somen record lists 100 mL = 74.4 g, 125 mL = 93.0 g, and 250 mL = 186.0 g. These are three source-specific cooked portion observations only. The record does not state draining or packing method, so the values do not activate a density or general volume conversion.

Kikkoman lists 300 g somen for four servings and says spaghetti may substitute in that recipe. The 300 g is the somen amount; no separate spaghetti amount or adjustment is given. The ledger preserves this one recipe-scoped finding and adds no runtime rule or recipe-line link.

## Audit and validation

- The merge-time audit found no normalized-key collision among 412 references and 16 forms. The 114 bundled recipes / 1,123 ingredient rows had no somen line or mention.
- Package validation, reference normalization, generated-index check, 9 Python package tests, and `git diff --check` passed.
- Android checks passed: 277 unit tests, `lintDebug`, debug APK and Android-test APK assembly. Pixel 9a/API 36 connected instrumentation reported 29 cases: 27 passed, 2 QA-only assumption skips, and 0 failures.
- Live picker search `somen` returned `somen noodles` in English and `somen` in fr-CA. The unsaved probe was discarded; the fr-CA home screen returned to 114 recipes.
- Verification used the isolated `/tmp/recipebook-pixel9a-userdata.img`. The original Pixel_9a AVD was restored; `app.recipebook` remains uninstalled there and `/data` has 402 MB available.

Screenshots (1080×2424):

- [English picker result](pixel9a-somen-picker-en.png), SHA-256 `2f7888d4b7defaaf59ca10716becca72e993e7d6c8be245ec1c1791d699eb8e2`.
- [fr-CA picker result](pixel9a-somen-picker-fr-ca.png), SHA-256 `81ae60f41f9bbca963c8b458c25853a4b353698b2906109ac01330652e410732`.

Reference JSON SHA-256: `5f7cca9264d410c2c2e619321fc0daa7ed6a6907630225dd490ba0894ce8288e`; evidence ledger SHA-256: `db6ac4439396eca82f5f66508d30d538f5b4686431e09d87240239060143c647`.

Sources:

- [OQLF, nouilles de blé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18699784/nouilles-de-ble) and [Japan MAFF, Grain products](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/kokurui.html) — name, product boundary, and dried-noodle class.
- [Health Canada CNF, cooked somen portion](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4463&lang=fre) — the three published portion observations.
- [Kikkoman, Somen Noodles with Cherry Tomatoes](https://www.kikkoman.com/en/cookbook/recipe/00001264.html) — one recipe-scoped spaghetti option.

The full source-to-claim map is in [`../proposals/wp03-somen-identity-20261009.md`](../proposals/wp03-somen-identity-20261009.md).
