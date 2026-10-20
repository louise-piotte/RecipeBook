# WP03 Section G: Udon identity

- **Status:** identity, package, unit, lint, APK, instrumentation, and Pixel 9a verification passed. Broader Section F/G coverage and independent Québec French review remain open.
- **Accepted reference:** `ingredient-ref-udon-noodles`, `udon noodles / nouilles udon`, category `GRAIN_AND_CEREAL`, with only `udon` as an EN and fr-CA alias.
- **Evidence record:** `ingredient-ref-udon-noodles` in `research-ledger.v1.json`; sources WP03-S206–WP03-S214.

## Identity boundary

Japan's MAFF names udon noodles as a flour-and-salt-water product and describes variation in formula, shape, thickness, and product state. OQLF describes Japanese wheat (sometimes maize) noodles by calibre as thin somen or thick udon, while Québec.ca and Aliments du Québec demonstrate local French use of `udon` and the product wording `nouilles udon`. The proposed wording is supported by observed Québec use; OQLF does not list `nouilles udon` as a preferred term.

Keep udon separate from soba, somen, hiyamugi, hiramen/kishimen, ramen, generic wheat noodles, generic pasta, and starch-defined noodle products. MAFF records fresh, boiled, frozen, dried, and hand-stretched product states, but no bundled recipe requires a state-specific identity or conversion. No form, density, unit mapping, cooked yield, or dry-to-cooked conversion was added.

## Quantity and substitution evidence

Le Dindon du Québec's six-serving turkey teriyaki recipe uses 500 mL (2 cups) cooked udon and says long-form pasta may replace it if needed. That source does not identify a specific shape/form, amount adjustment, or method change. Keep this as a recipe-scoped blocked finding; no runtime substitute is active. The recipe amount is not a mass/volume factor.

## Audit and validation

- Merge-time audit: no normalized-key collision among 412 references and 16 forms; no udon, somen, or relevant noodle line among all 114 bundled recipe files / 1,123 ingredient rows.
- No recipe relinking or legacy-import identity was needed.
- Package validation/normalization, reference normalization, generated-index freshness, 9 Python package tests, UTF-8/no-BOM audit, and `git diff --check` passed. The Android build passed 276 unit tests, `lintDebug`, and both debug APK assemblies. Connected Pixel 9a/API 36 instrumentation reported 29 cases: 27 passed and 2 QA-only assumption skips, with no failures or errors.
- Live picker search `udon` returned `udon noodles` in English and `nouilles udon` in fr-CA. The Le Dindon source's amount and replacement note remain source-specific. The blank probe was discarded and the home screen returned to 114 recipes.
- Verification used `/tmp/recipebook-pixel9a-userdata.img` because the retained AVD had about 402 MB free. The original AVD user-data image was preserved.

Screenshots (all captured at 1080×2424):

- [English picker result](pixel9a-udon-picker-en.png), SHA-256 `8b2e89a687fda11f945ac01cd6d2aa8f2bcc9655f7cc142f0ee60434a2f32c4d`.
- [fr-CA picker result](pixel9a-udon-picker-fr-ca.png), SHA-256 `b3d29e07d011509495e639b25fb69b4323e65e3d6c9787c6d109fd08c0c84a9c`.
- [English home, 114 recipes](pixel9a-new-identities-home-en.png), SHA-256 `2c3e4d98c06a5df6f07094b3c8db1b5d303df8058735783f60b50ed7d0f6af88`.
- Reference JSON SHA-256: `5b851d03bc09eb43a0b73fd7a6cb05e991ea90586f11bf51f21d489fb1fe26fd`; evidence ledger SHA-256: `185e6f502964a83e0c56c7a6a0e3a92e5ded342177705fe45a5196f32762acd1`.

Primary/local sources:

- [OQLF, nouilles de blé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18699784/nouilles-de-ble) — distinguishes the Japanese calibre terms and notes possible wheat or maize.
- [Japan MAFF, Grain products](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/kokurui.html) — product definition, variations, states, and dried-noodle standards.
- [Gouvernement du Québec, Accueillir le touriste japonais](https://www.quebec.ca/tourisme-loisirs-sport/services-industrie-touristique/etudes-statistiques/marches-touristiques/le-marche-touristique-en-asie/marche-touristique-japon/accueillir-le-touriste-japonais) and [Aliments du Québec, Nouilles Udon fraîches](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/nouilles-udon-fraiches) — local French usage.
- [Le Dindon du Québec, Dindon teriyaki avec nouilles udon](https://ledindon.qc.ca/recettes/dindon-teriyaki-avec-nouilles-udon/) — one recipe quantity and its narrowly scoped note.

The complete source-to-claim map is in [`../proposals/wp03-udon-identity-20261009.md`](../proposals/wp03-udon-identity-20261009.md).
