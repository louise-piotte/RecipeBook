# WP02/WP06/WP07 cassava, egusi, and egg evidence follow-up — 2026-10-10

## Accepted decisions

- **Gari:** keep `ingredient-ref-gari` and add only the English spelling alias `garri`. The [Codex gari standard](https://www.fao.org/input/download/standards/49/CXS_151e.pdf) defines gari as a cassava product with its own processing steps; [Abebi Foods](https://abebifoods.com.ng/our-products/) uses the spelling `garri`. Keep gari distinct from whole-root cassava flour, extracted tapioca starch, and fufu flour.
- **Tapioca pearls:** add identity-only `ingredient-ref-tapioca-pearls`, displayed as `tapioca pearls / perles de tapioca`. Add `tapioca ball` and OQLF's singular `perle de tapioca` as aliases. OQLF defines pearls as a product made from tapioca starch and discourages French `bulle de tapioca`; retain the pearl identity separately from extracted starch and do not add broad `tapioca` aliases.
- **Ogiri-egusi:** add identity-only `ingredient-ref-ogiri-egusi` in `SAUCE_AND_CONDIMENT`, with the borrowed name in both display fields and no aliases. Nigerian food-science sources describe it as a fermented melon-seed condiment. The National Academies chapter reports `ogiri-isi` in Nigeria and `avrouda` in Benin for a related fermented egusi seasoning, with dried shrimp inclusion variable. Those region-scoped names remain source notes rather than global aliases because the catalog cannot encode that regional scope or product variability.
- **Chicken-egg portions and variability:** make no catalog or ledger measurement changes. The official FDC search exposes NDB numbers but not readable item IDs and portion rows for the three egg-part records. The UK report gives group means from 12 subsamples per shell-size band, not individual egg ranges; its narrative and detail sheets disagree on some collection years. The U.S. retail study reports brand means without a size class and has a Table 1 brand-count total of 306 against 309 stated in the article. These are bounded variability findings, not universal count-to-mass mappings. Keep all three runtime egg measurement states blocked and exact FDC portion retrieval open.

Sources checked independently include OQLF's [tapioca](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497643/tapioca) and [perle de tapioca](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26578849/perle-de-tapioca) entries; the National Academies' [Egusi chapter](https://www.nationalacademies.org/read/11763/chapter/10); Ogueke et al.'s [fermented melon-seed study](https://doi.org/10.21161/MJM.47312); Ire et al.'s [ogiri-egusi condiment study](https://jlbsr.org/index.php/jlbsr/article/view/13); the [USDA FDC API guide](https://fdc.nal.usda.gov/api-guide/) and [field descriptions](https://fdc.nal.usda.gov/docs/Download_Field_Descriptions_Oct2020.pdf); the UK [egg sampling report](https://assets.publishing.service.gov.uk/media/5a7aa918ed915d71db8b19bf/Nutrient_analysis_of_eggs_Sampling_Report.pdf); and the U.S. [commercial egg study](https://pmc.ncbi.nlm.nih.gov/articles/PMC7705037/).

Proposal packets: [WP02 cassava products](../../proposals/wp02-west-african-cassava-flour-products-review-20261010.md), [WP06 egusi boundary](../../proposals/wp06-west-central-african-egusi-product-boundary-review-20261010.md), and [WP07 FDC/variability audit](../../proposals/wp07-fdc-chicken-egg-portion-retrieval-review-20261010.md).

## Catalog and recipe snapshot

The integrated seed contains **712 ingredient references and 34 forms**. The research ledger contains **901 records, 1,760 source entries, and 1,444 distinct source IDs**. The manifest-ordered recipe corpus remains **114 recipes and 1,123 ingredient rows**, with digest `921fe260478d90251440fbb082d7b30be5828bfaddeaee67fe42541963aaa629`.

The two new references have null densities and empty unit mappings. No forms, measurements, conversions, yields, substitutions, or recipe links were added; the only existing-row edit is the `garri` alias. A token-boundary scan of all bundled recipe ingredient names, source lines, and reference IDs found zero matches for the reviewed gari/garri, tapioca-pearl, and ogiri-egusi terms.

## Verification

| Check | Result |
|---|---|
| Bundled package normalization | Passed; already normalized |
| Ingredient-reference normalization | Passed; already normalized |
| Generated Kotlin catalog freshness | Passed; current at 712 references |
| Research-ledger validation | Passed; 901 records, 0 errors |
| Python seed-package tests | Passed; 10 tests |
| Android unit tests | Passed; 323 tests, 0 failures |
| Pixel 9a / Android 16 instrumentation | `emulator-5556`: 30 cases, 28 passed, 2 skipped, 0 failures/errors. `emulator-5554` ran 0 cases because installation failed with insufficient storage. |
| Pixel deployment | `tools/deploy_to_pixel9a_emulator.sh` passed test and APK assembly, installed the APK on `emulator-5556`, and launched RecipeBook. |
| `git diff --check` | Passed |

## Pixel picker results and screenshots

The fresh-seed picker returned gari for `garri`, tapioca pearls for English `tapioca ball` and French `perle de tapioca`, and separate tapioca-starch and pearl rows for broad `tapioca`. The `egusi` query returned both egusi seeds and ogiri-egusi in English and French. `ogiri-egusi` returned its single identity in both locales. The intentionally held queries `ogiri-isi`, `avrouda`, and French `bulle de tapioca` returned no results. Both unsaved drafts were discarded.

Screenshot files and their SHA-256 checks are listed in [`screenshots/SHA256SUMS.txt`](screenshots/SHA256SUMS.txt).

The saved owner database and recipe-catalog preferences were restored byte-for-byte. The French language preference was set to the expected French state, and the home again showed **Toutes les recettes (114)**. Final hashes: database `4e5175c27806ed5778755164716b9e2fbf8f09ca0616df7e387211afa4c22621`; recipe-catalog preferences `6d10aedaacfdb21227ab2053e3f6925cdee41da910111f0258dcb384f33073c8`; French app-language preference `d116672ec5a029be8308bac97ad535bd4365844149bb44a97ec4edbffbe83ba0`.

| Screenshot | Check | SHA-256 |
|---|---|---|
| [picker-en-garri.png](screenshots/picker-en-garri.png) | `garri` → gari | `3abd75cf4fa02a1e2d57bfc7d3ca3e195252f36c7e06a5f87ef7860be090bcab` |
| [picker-en-tapioca-ball.png](screenshots/picker-en-tapioca-ball.png) | `tapioca ball` → tapioca pearls | `19716d77409c88183b74f363bd5dfb0c17760fbc7af56851f5e8d71b9acf8b90` |
| [picker-en-tapioca-both.png](screenshots/picker-en-tapioca-both.png) | `tapioca` → pearls and starch | `cd3c9823b7b43f3f087916baaa34a128262f72f9afcae025b74e740b5748bba7` |
| [picker-fr-perle-de-tapioca.png](screenshots/picker-fr-perle-de-tapioca.png) | `perle de tapioca` → perles de tapioca | `981eb19c1134eaa9e72c3187d562720dc82c3fc4d9e34863b877e64dc4f4a9fe` |
| [picker-fr-perles-de-tapioca.png](screenshots/picker-fr-perles-de-tapioca.png) | Display spelling `perles de tapioca` | `61b1d74e39f9b763328536d867acd2f37204dce62b3988dd757a07770cce396a` |
| [picker-fr-no-bulle-de-tapioca.png](screenshots/picker-fr-no-bulle-de-tapioca.png) | `bulle de tapioca` → no result | `c035760c51feba078d0697aceca0bee229a0f51a229119d2110b43c96f8326fe` |
| [picker-en-ogiri-egusi.png](screenshots/picker-en-ogiri-egusi.png) | `ogiri-egusi` → ogiri-egusi | `a62198fa883c93b5b176c76b0c2245a52053c8c97e4f404f7548957ecbae1975` |
| [picker-fr-ogiri-egusi.png](screenshots/picker-fr-ogiri-egusi.png) | French picker `ogiri-egusi` → ogiri-egusi | `27db123a3a779fa1969b5bc8ad8a7842def1b6b356213d973b5e24ed163c5213` |
| [picker-en-egusi-two-identities.png](screenshots/picker-en-egusi-two-identities.png) | `egusi` → seeds and ogiri-egusi | `0d9d6a27f60d5cf77f5f4505446238ff5316d8fc6fb488135ca05b2a7dd4c63d` |
| [picker-fr-egusi-two-identities.png](screenshots/picker-fr-egusi-two-identities.png) | French `egusi` → seeds and ogiri-egusi | `b4c99b7d3a65414bf4d60e5d76b2f9e6931ba993689d6a62cc5a14fb3b9d137e` |
| [picker-en-no-ogiri-isi.png](screenshots/picker-en-no-ogiri-isi.png) | `ogiri-isi` → no result | `a967978400b9752e3e206ff631e177911b0608fc448290d8438a579b40c84ab4` |
| [picker-en-no-avrouda.png](screenshots/picker-en-no-avrouda.png) | `avrouda` → no result | `6b5cad6c7aa0e722ca19eee1922c0640a7c7c1680bdbcbd04bd92c21632d61bb` |
| [home-fr-restored-114.png](screenshots/home-fr-restored-114.png) | Final French home, 114 recipes | `032bc7a5fe0ccd0323f1d166b1002dd04e50060d0f9248bca145ef262608fa12` |

## Final artifact hashes

| Artifact | Count / status | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 712 references | `cd7a01b16ce3fa3ba219458234460fb15d0786769308d1f4ec4962dafc1ea095` |
| `ingredient-forms.v1.json` | 34 forms | `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938` |
| `manifest.v1.json` | Normalized | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `research-ledger.v1.json` | 901 records / 1,760 source entries / 1,444 source IDs | `65fc421f6ee5daef9204a4c589d908977e2c1135621e1fd158aff001e01f562f` |
| `BundledIngredientCatalog.kt` | Generated index at 712 references | `8d58ccfd37af49d24f8485bd0fb82a8a06c8ecf702290c4e55bbfecdf8a3c672` |
| Manifest-ordered recipe corpus | 114 recipes / 1,123 ingredient rows | `921fe260478d90251440fbb082d7b30be5828bfaddeaee67fe42541963aaa629` |

## Open work

WP02 B2/B3 remains open for generic fufu flour and blends, amala/elubo, source-neutral fermented cassava products, palm-sago pearls pending independent Québec terminology review, regional starch granules, and native/pregelatinized wording. Section Z remains open beyond the narrow Nigerian ogiri-egusi identity; the `graines de melon` search overlap and provisional borrowed French label need review. WP07 remains open for exact FDC item IDs and readable portion rows, plus a safe evidence representation for sample ranges. No egg measurement state or runtime conversion was changed.
