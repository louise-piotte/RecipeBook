# WP05 Section X: Ube halaya identity

- **Status:** identity, package, unit, lint, APK, instrumentation, and Pixel 9a verification passed. Descriptive Québec French wording remains provisional pending independent review; broader Section X coverage remains open.
- **Accepted reference:** `ingredient-ref-ube-halaya`, `ube halaya (purple yam jam) / confiture d’ube (ube halaya)`, category `SAUCE_AND_CONDIMENT`.
- **Aliases:** EN `purple yam jam`; fr-CA `confiture d’ube`. Do not activate bare `ube`, `halaya`, or `ube jam` as global aliases.
- **Evidence record:** `ingredient-ref-ube-halaya` in `research-ledger.v1.json`; sources WP05-UBE-S01–S08.

## Identity boundary and French wording

PNS/FDA 24:2010 defines a prepared purple-yam jam product made from *Dioscorea alata*, sweetened, cooked to consistency, packaged, and heat processed. It distinguishes the prepared spread from raw purple yam and permits optional ingredients that are not universal requirements. DOST-FNRI identifies purple yam separately from purple sweet potato and taro. Keep raw/frozen/dried/powdered ube, extracts or flavourings, purple sweet potato, taro, and the prepared jam as separate products.

The standard accepts `Purple Yam Jam` as a product label. `Ube jam` is not used as an alias because sources describe market variation: it may be used interchangeably with halaya in U.S. retail/recipes, while Filipino usage can distinguish commercial jam from traditional halaya. The Canadian Gusta SKU name is product evidence, not enough to resolve the global boundary.

`Confiture d’ube` is stored as a descriptive French display and alias, provisionally. French recipe usage and one Québec restaurant menu support the wording, but neither is an OQLF term or bilingual Canadian label. Independent Québec French review remains open; no OQLF endorsement is claimed.

## Measurement and substitution evidence

The package's 340 g mass and Oobé's 300–350 g recipe output do not give volume or a general yield. Keep both source-specific; add no density, unit mapping, or package yield. No direct, actionable substitute for prepared ube halaya was found. Frozen ube replacing fresh ube concerns the root, not the prepared jam. No form, conversion, or substitution rule was added.

## Audit and validation

- Merge-time exact normalized-key audit found no collision among 412 references and 16 forms.
- Search across all 114 recipe JSON files found no ube/halaya phrase or candidate line; no recipe relinking or legacy-import identity was needed.
- Package validation/normalization, reference normalization, generated-index freshness, 9 Python package tests, UTF-8/no-BOM audit, and `git diff --check` passed. The Android build passed 276 unit tests, `lintDebug`, and both debug APK assemblies. Connected Pixel 9a/API 36 instrumentation reported 29 cases: 27 passed and 2 QA-only assumption skips, with no failures or errors.
- English search `purple yam jam` returned `ube halaya (purple yam jam)`; fr-CA query `ube halaya` returned `confiture d’ube (ube halaya)`, and accent/punctuation-normalized `confiture d ube` also returned the row. The blank probe was discarded and the home screen returned to 114 recipes.
- Verification used `/tmp/recipebook-pixel9a-userdata.img` because the retained AVD had about 402 MB free. The original AVD user-data image was preserved.

Screenshots (all captured at 1080×2424):

- [English picker result](pixel9a-ube-picker-en.png), SHA-256 `0d8a0915ece93f53473e62c6e51bf6d7ec8e1b6a272994970044fc4e4f5426eb`.
- [fr-CA picker result](pixel9a-ube-picker-fr-ca.png), SHA-256 `ecac67096ab8d969b7e9f30a07e9bf3276820848f97b88f9d2222bd6e3601b6e`.
- Reference JSON SHA-256: `5b851d03bc09eb43a0b73fd7a6cb05e991ea90586f11bf51f21d489fb1fe26fd`; evidence ledger SHA-256: `185e6f502964a83e0c56c7a6a0e3a92e5ded342177705fe45a5196f32762acd1`.

Sources:

- [Philippine FDA, standards manual](https://www.fda.gov.ph/wp-content/uploads/2022/04/CFRR-User-Manual-for-the-Modified-E-portal-V2.pdf) and [PNS/FDA 24:2010 public copy](https://archive.org/download/pns.24.2010/pns.24.2010.pdf) — standard name, product boundary, and label naming.
- [Philippine DOST-FNRI Food Composition Table](https://i.fnri.dost.gov.ph/fct/library/food_content/B) — separates purple yam, purple sweet potato, and taro.
- [King Arthur Baking, Your guide to baking with ube](https://www.kingarthurbaking.com/blog/2024/05/15/what-is-ube) — naming variation and separation of root forms from jam.
- [Oobé, Ube Halaya : la confiture violette philippine](https://oobe.fr/blogs/actualites/ube-halaya-recette) and [OQLF, igname](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26515067/igname) — descriptive French usage and generic terminology limits.

The full source-to-claim map and independent review are in [`../proposals/wp05-ube-halaya-review-20261009.md`](../proposals/wp05-ube-halaya-review-20261009.md).
