# WP03 brown rice identity

- **Reviewed:** 2026-10-07
- **Status:** identity integrated and verified on Pixel 9a; independent Québec review of broader rice terminology remains open.
- **Scope:** brown rice as a milling distinction. No recipe links, state forms, measurements, yields, conversions, or substitutions are added.

## Integrated reference

| ID | English | fr-CA | Aliases | Category | Boundary |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-brown-rice` | brown rice | riz brun | `hulled rice` (EN); `riz cargo` (FR) | `GRAIN_AND_CEREAL` | Milling distinction that can overlap long-, medium-, short-grain, and glutinous rice. Keep brown rice flour separate; do not create length × milling × cooked-state rows. |

The row has null density and empty unit mappings. It has no forms. The alias pair is limited to OQLF-supported same-identity terms. Keep Europe-scoped `cargo rice` and the broader French variants `riz décortiqué`, `riz complet`, `riz intégral`, and `riz non usiné` inactive pending regional review.

## Evidence and naming limits

TERMIUM identifies *brown rice* / *riz brun* as the correct bilingual pair in Milling and Cereal Industries. Its record defines brown rice by removing the outer hull while retaining the bran. It lists *riz complet* and *riz intégral*, but those variants are not activated [WP03-S115].

OQLF defines *riz cargo* as whole rice without its husk, pairs it with English *hulled rice*, and explicitly identifies it as brown rice in its explanatory note. These are the only aliases [WP03-S118]. TERMIUM marks *cargo rice* as a European term, so it is not added.

Codex distinguishes husked (brown) rice, with only the husk removed, from milled (white) rice, from which all or part of the bran and germ are removed. Grain-length classes are separate [WP03-S116]. The federal French food specification calls brown rice a whole-grain distinction, says long-, short-, and glutinous rice may be consumed brown, and specifies long-grain brown rice by default when no length is given [WP03-S117].

## Recipe and collision audit

All 114 bundled recipe JSON files were scanned for brown rice, *riz brun*, the active aliases, and the withheld variants. No recipe line requests brown rice or a matching ingredient reference. The live normalized-key audit found no collision for the display names or active aliases. Existing `ingredient-ref-brown-rice-flour` remains a separate `FLOUR_AND_STARCH` product.

## Verification record

- Seed package: 357 references, 16 forms, and 114 recipe files; evidence ledger: 522 records.
- Package normalization/validation, ingredient-reference normalization, generated catalog freshness, ledger schema validation, and 9 Python package tests passed.
- Android unit tests passed: 254 tests, zero failures or errors. Pixel 9a / Android 16 connected instrumentation passed: 29 tests, two existing skips, zero failures or errors.
- The repository deploy script completed its test and debug assembly tasks, installed the APK, and launched the app on Pixel 9a. Picker searches returned `brown rice` for English `hulled rice` and `riz brun` for French `riz cargo`. The unsaved QA draft was discarded; the French home screen still shows 114 recipes.
- Screenshots: [English `hulled rice` picker](screenshots/picker-brown-rice-en-hulled.png), [fr-CA `riz cargo` picker](screenshots/picker-brown-rice-fr-ca-riz-cargo.png), [French library home with 114 recipes](screenshots/brown-rice-home-fr-ca-114.png), and [English library home](screenshots/brown-rice-home-en.png).
- Screenshot SHA-256: English picker `333c4206731c1ac742b03925ddf4e25edc3609b6c7ec982053a5df02ed4266b6`; fr-CA picker `3147a2873fa4de4fc624fb9a61248884295afebd9534e0d5a6d0ac95707e27e0`; French home `d7f73cca7403e1a4982f14f5250313576f1c3d41161bd9f9dc3dbc458b42d4b9`; English home `57708f8119c2a1600d4edbf35959f521c6da0cb34b116926ad5a7a2d1a97c335`.
- Final SHA-256: ingredient references `4aebf7f33b8e04cf13e796200c911f7e86c43823a8b64c048028037c5acdb70a`; forms `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a`; manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; research ledger `22a9b8c9b25ebb95446be5c631c7d8c3f5835043820ee3439655fc96315fdc5a`; generated Kotlin catalog `ee09a26a0ce1a18d4c24cb5a84013e7135b6e957623bdb429297bc16477a7f0a`.
- The UTF-8/no-BOM and mojibake scan passed for 198 maintained text files; `git diff --check` passed. Bundled seed and ledger JSON use explicit Unicode escapes.

## Sources

- **WP03-S115 — TERMIUM Plus, [brown rice / riz brun](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=frt&lang=eng&srchtxt=RIZ+INTEGRAL):** correct bilingual display terms and retained-bran milling definition; other French variants remain inactive.
- **WP03-S116 — Codex Alimentarius, [Standard for Rice CXS 198-1995](https://www.fao.org/input/download/standards/61/CXS_198e.pdf):** brown/husked versus white/milled rice distinction and separate grain-length classification.
- **WP03-S117 — Government of Canada, [Spécifications sur la qualité des aliments – Riz](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-fra.pdf):** brown rice can occur across grain lengths and in glutinous rice; long-grain brown rice is the unspecified default in this procurement specification.
- **WP03-S118 — OQLF, [riz cargo](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432771/riz-cargo):** pairs *riz cargo* with English *hulled rice* and identifies it as brown rice.
