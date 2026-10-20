# WP05 Section Y: Ajvar identity

- **Status:** identity, package, unit, lint, APK, instrumentation, and Pixel 9a verification passed. Broader Section Y coverage and independent Québec terminology review remain open.
- **Accepted reference:** `ingredient-ref-ajvar`, `ajvar / ajvar`, category `SAUCE_AND_CONDIMENT`, with `ayvar` as the sole English alias and no French alias.
- **Evidence record:** `ingredient-ref-ajvar` in `research-ledger.v1.json`; sources WP05-AJVAR-S01–S13.

## Identity and boundaries

FAO documents `ayvar` as a Balkan savory spread centered on sweet red pepper and describes family-level variation. Serbia's Leskovac appellation specifies traditional red-pepper Ajvar in mild or hot versions without requiring eggplant. Canadian products show roasted pepper and eggplant as one common formulation, not a defining universal recipe. A bilingual Metro listing retains `ajvar` in both its English and French product names, so the same short name is used in the app in both locales.

Keep Ajvar separate from Pinđur, Malidzano, Ajika, biber salçası, muhammara, and generic roasted-pepper or pepper-and-eggplant spreads. Do not turn mild/hot labels into ingredient forms. Macedonian-script `ајвар` is documented but omitted because the app's current normalizer produces no useful searchable key for it.

## Measurement and substitution evidence

The reviewed retail listings give jar sizes or volume-only servings, not corresponding mass/volume pairs. The official product description's homogeneous texture is qualitative, not a density value. Editorial substitution pages suggest alternatives, but the suggestions vary by dish role and are not test-kitchen or authoritative evidence. No density, unit mapping, package yield, conversion, or active substitution was added; substitution research is recorded as `researched_no_supported_substitute`.

## Audit and validation

- Merge-time exact-key audit found no collision among 412 references and 16 forms.
- Search across all 114 recipe JSON files found no Ajvar, ayvar, neighboring-name, or proposed-label mention in recipe text or ingredient lines.
- No recipe relinking, legacy-import identity, or ingredient form was needed.
- Package validation/normalization, reference normalization, generated-index freshness, 9 Python package tests, UTF-8/no-BOM audit, and `git diff --check` passed. The Android build passed 276 unit tests, `lintDebug`, and both debug APK assemblies. Connected Pixel 9a/API 36 instrumentation reported 29 cases: 27 passed and 2 QA-only assumption skips, with no failures or errors.
- Live picker search `ayvar` returned `ajvar` in English and fr-CA. The blank probe was discarded and the home screen returned to 114 recipes.
- Verification used `/tmp/recipebook-pixel9a-userdata.img` because the retained AVD had about 402 MB free. The original AVD user-data image was preserved.

Screenshots (all captured at 1080×2424):

- [English picker result](pixel9a-ajvar-picker-en.png), SHA-256 `1e96b4713fbbf1de7d08e814aa6f9b3ad8ee6e4b4165d5dc1d9f9e2ac7e8ebd3`.
- [fr-CA picker result](pixel9a-ajvar-picker-fr-ca.png), SHA-256 `41c23526bf6b9365ecf52d9fe01984b9b8e8c67cf7bb23f9e76b4d5c6b4a7638`.
- Reference JSON SHA-256: `5b851d03bc09eb43a0b73fd7a6cb05e991ea90586f11bf51f21d489fb1fe26fd`; evidence ledger SHA-256: `185e6f502964a83e0c56c7a6a0e3a92e5ded342177705fe45a5196f32762acd1`.

Primary and local sources:

- [FAO Regional Office for Europe and Central Asia, Transformation of the Macedonian pepper](https://www.fao.org/europe/resources/stories/details/Transformation-of-the-Macedonian-pepper/en) — alternate spelling and variable family preparation.
- [Serbian Intellectual Property Office, Ajvar from Leskovac](https://www.zis.gov.rs/wp-content/uploads/Reg-no-56-Ajvar-from-Leskovac.pdf) — regional product specification.
- [Metro Canada French product listing](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/tartinades-au-fromage-et-salees/tartinade-a-saveur-d-ajvar/p/069694009393) and [English product listing](https://www.metro.ca/en/online-grocery/aisles/pantry/cereals-spreads-syrups/cheese-savoury-spreads/ajvar-flavoured-spread/p/069694009393) — one bilingual retailer product name; not a universal formula.
- [North Macedonia tourism agency](https://tourismmacedonia.gov.mk/wp-content/uploads/2020/01/3flaer-Wine-.pdf) — lists Ajvar, Pinđur, and Malidzano separately.

The full source-to-claim map is in [`../proposals/wp05-ajvar-identity-20261009.md`](../proposals/wp05-ajvar-identity-20261009.md).
