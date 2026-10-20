# WP06 Andean chuño and tunta identities — 2026-10-09

## Catalog decisions

- `ingredient-ref-chuno-negro`: EN `black chuño`; fr-CA `chuño negro` (provisional).
- `ingredient-ref-tunta`: EN `tunta (white chuño)`; fr-CA `tunta (chuño blanco)` (provisional).
- Both use category `VEGETABLE_AND_AROMATIC`.
- Both are identity-only whole-tuber products. No aliases, forms, density, unit mappings, measurements, conversions, substitutions, or recipe links were added.
- Keep black chuño separate from tunta. The supported pairing is specifically `tunta` / `chuño blanco`; plain `chuño` and `moraya` remain unresolved. Do not equate either identity with papa seca, generic dried potato, potato flour, or potato starch.
- The display names contain their source terms; therefore a broad `chuño` search returns both references. This search overlap is not an alias or equivalence decision.

## Evidence

Bolivia's [Ministry of Productive Development potato overview](https://produccion.gob.bo/wp-content/uploads/2025/08/papa.pdf) distinguishes black chuño from whitish chuño tunta. Peru's [INIA study](https://repositorio.inia.gob.pe/items/efa53c44-9283-4922-b66c-96eca15f675a/full) pairs `chuño blanco (tunta)`, and [INACAL's summary of the artisanal tunta standard](https://www.inacal.gob.pe/principal/noticia/np-tunta-artesanal) documents a distinct white-potato product. See the full [boundary proposal](../../proposals/wp06-chuno-tunta-boundary-review-20261009.md) for product comparisons, locators, limits, and exact audit method.

## Collision and recipe checks

The proposal's exact-key scan found no target-family owner among references, forms, or legacy candidates in its 481-reference / 17-form pre-integration snapshot. It checked 58 surface spellings (48 normalized keys) and all 114 recipes / 1,123 ingredient rows. No target phrase occurred in recipe text; the only noted overlap is generic `dried potato` search text inside the existing papa seca display name. No recipe text or links were changed.

## Validation

- Current reference file: 487 entries, SHA-256 `de40604fe47b36f504b59febe5f6473dcbae59818e0a9c289764954688d8db48`.
- Forms: 18, SHA-256 `ee299dbe8f4a2349a16c495b37ac6ee4830a128fdceffd91f3bf2001f1e10617`.
- Manifest: 114 recipe paths, SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Research ledger: 654 records / 972 source entries / 845 distinct source IDs, SHA-256 `7acc14614d9f92dba2a4dfea40993f22c349481d04d920e4c6fff16342fe2d94`; schema validation reported zero errors.
- Package normalization, generated-index freshness, all 9 Python package tests, and all 305 Android unit tests passed.
- Pixel 9a / Android 16 instrumentation on `emulator-5556`: 29 XML cases, 27 passed, 2 skipped, 0 failures or errors. The deploy script installed and launched the build.
- English search `black chuno` and French accent-insensitive search `chuno negro` each returned their localized black-chuño result. `tunta` returned its localized name in English and French. The unsaved recipe draft was discarded and the French home returned to 114 recipes.

## Emulator screenshots

| Screenshot | SHA-256 |
|---|---|
| English picker: black chuño | `c6a5d53c824cd68e2720aa4220a3a3b6822dc7f6895096e96959e0b654d08353` |
| French picker: chuño negro | `29c04b53186e1457f08ce37e50c7ba39a80220082585fd326d707827b14f13aa` |
| English picker: tunta | `05fa42aa2ffe4495428ef0e4bc8b79c046e9947d81de5038c1de2067c8c991ce` |
| French picker: tunta | `2125f382a58e3214e43ce188c739067a84c24a12a58f048a38dfd4b4cdd95ddb` |
| French home, 114 recipes | `32cd824106f7ee7a5173a5d30f404dc66ff2930f6f938870a0aff6b127a44c86` |

## Open work

Québec product naming and the broader Andean/South American gap review remain open. Do not apply the provisional display wording as an authoritative Québec terminology ruling.
