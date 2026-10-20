# WP02/WP03/WP04 fruit, wheat-meal, and cured-pork integration — 2026-10-10

## Coordinator decision

Integrated 11 active ingredient identities: six scoped fruit references, `whole wheat meal`, bacon, pancetta, guanciale, and prosciutto. The bacon reference reuses its legacy ID. The existing ham reference was verified and retained; its only bundled recipe link remains recipe 089's diced-ham line. Broad salt pork and unqualified `jamón` remain unresolved ledger candidates, not active catalog identities.

The three sapote species remain separate and species-qualified. Baobab is limited to separated fruit pulp; its category is `NUT_SEED_AND_DRIED_FRUIT` because the sourced ingredient is dried pulp. Maqui and cocona refer to named edible fruits. No recipe links, ingredient forms, unit mappings, measurements, yields, conversions, or substitutions changed.

The wheat-meal reference uses `whole wheat meal` / `farine de blé entier brute`, with the French alternate `farine de blé complet brute`. The proposed English alias `coarse whole wheat flour` was not activated: a `whole wheat flour` search would then also return the meal reference. Unqualified `wheat meal`, wheat groats, cracked wheat, and durum semolina remain separate or unresolved.

## Source basis

OQLF distinguishes *sapote* from *sapotille* and ties its preferred fruit term to *Pouteria sapota*; TERMIUM records overlapping common names for different fruits. The *Diospyros nigra* and *Casimiroa edulis* identities and French names are cross-checked against [Kew's accepted-name entry](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:322764-1/general-information) and [Pl@ntUse's white-sapote entry](https://plantuse.plantnet.org/fr/Casimiroa_edulis). [OQLF's sapote](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296929/sapote), [sapotille](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296930/sapotille), and [TERMIUM's *Pouteria sapota* terms](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=alt&lang=eng&srchtxt=SAPOTILLE+MAMEY) support the separation and alias restraint. The black-sapote French display is provisional pending independent Québec terminology review.

For baobab, OQLF describes the edible pulp and distinguishes the capsule and dried leaves; the UK Food Standards Agency describes a separated, dried *Adansonia digitata* fruit-pulp product. [OQLF's baobab entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17487017/baobab) and the [FSA product record](https://data.food.gov.uk/regulated-products/novel_authorisations/novel-7) support the narrow product boundary. [EPPO's *Aristotelia chilensis* entry](https://gd.eppo.int/taxon/AITCH) supplies the maqui names, with Chile's [SIMEF use record](https://simef.minagri.gob.cl/herramientas/informacion-de-bosques-de-chile/ver/06) supporting food-fruit scope. Peru's [INACAL cocona standard notice](https://www.gob.pe/institucion/inacal/noticias/817509-inacal-brinda-requisitos-de-calidad-de-la-cocona) and [Pl@ntUse's species entry](https://plantuse.plantnet.org/fr/Solanum_sessiliflorum) support the cocona identity.

The whole-wheat-meal boundary follows a live [manufacturer description](https://www.heimatsmuehle.com/en/commercial-customers/products/wheat-meal-fine-medium-coarse) of whole-kernel meal retaining bran and germ and milled less finely than wholegrain flour. [OQLF's *farine de blé entier brute* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497897/farine-de-ble-entier-brute) supplies the Québec French name and alternate; it does not define the milling process. These sources support the scoped identity, not every product called *wheat meal*.

OQLF defines [bacon](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8408976/bacon), [pancetta](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8409640/pancetta), and [prosciutto](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2498694/prosciutto) as distinct product names. CFIA's [meat identity standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-7) distinguish ham from belly bacon and loin-based back bacon. The guanciale boundary is limited to the evidence available for a named product: the [European Commission's Amatriciana specification](https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A52019XC1120%2802%29) describes matured pork jowl, and a [Québec Mayrand listing](https://mayrand.ca/fr/nos-produits/charcuterie/bacon-et-pancetta?page=1) uses *guanciale* for salted pork jowl. Neither is treated as a universal curing standard.

The individual proposals record the full evidence registers, collision audits, holds, and terminology caveats: [WP03 fruit follow-up](../../proposals/wp03-section-m-sapote-baobab-followup-20261010.md), [WP04 cured-pork boundaries](../../proposals/wp04-section-o-cured-pork-boundaries-20261010.md), and [WP02 wheat-meal boundary](../../proposals/wp02-a7-wheat-meal-product-boundary-followup-20261010.md).

## Pixel 9a picker verification

Installed and launched on the Pixel 9a / Android 16 AVD (`RecipeBook_Pixel_9a`, `emulator-5556`). Each result below was verified together with the picker title before the screenshot was saved.

| Locale | Query | Picker result | Screenshot |
|---|---|---|---|
| English | `mamey sapote` | `mamey sapote (Pouteria sapota)` | [PNG](screenshots/pixel9a-en-mamey-sapote.png) |
| English | `black sapote` | `black sapote (Diospyros nigra)` | [PNG](screenshots/pixel9a-en-black-sapote.png) |
| English | `white sapote` | `white sapote (Casimiroa edulis)` | [PNG](screenshots/pixel9a-en-white-sapote.png) |
| English | `baobab fruit pulp` | `baobab fruit pulp (Adansonia digitata)` | [PNG](screenshots/pixel9a-en-baobab-fruit-pulp.png) |
| English | `maqui berry` | `maqui berry (Aristotelia chilensis)` | [PNG](screenshots/pixel9a-en-maqui-berry.png) |
| English | `cocona` | `cocona (Solanum sessiliflorum)` | [PNG](screenshots/pixel9a-en-cocona.png) |
| English | `whole wheat meal` | `whole wheat meal` | [PNG](screenshots/pixel9a-en-wheat-meal.png) |
| English | `bacon` | `bacon` | [PNG](screenshots/pixel9a-en-bacon.png) |
| English | `pancetta` | `pancetta` | [PNG](screenshots/pixel9a-en-pancetta.png) |
| English | `guanciale` | `guanciale` | [PNG](screenshots/pixel9a-en-guanciale.png) |
| English | `prosciutto ham` | `prosciutto` | [PNG](screenshots/pixel9a-en-prosciutto.png) |
| French | `mamey sapote` | `sapote (Pouteria sapota)` | [PNG](screenshots/pixel9a-fr-mamey-sapote.png) |
| French | `sapote noire` | `sapote noire (Diospyros nigra)` | [PNG](screenshots/pixel9a-fr-black-sapote.png) |
| French | `sapote blanche` | `sapote blanche (Casimiroa edulis)` | [PNG](screenshots/pixel9a-fr-white-sapote.png) |
| French | `pulpe de fruit de baobab` | `pulpe de fruit de baobab (Adansonia digitata)` | [PNG](screenshots/pixel9a-fr-baobab-fruit-pulp.png) |
| French | `maqui du Chili` | `maqui du Chili (Aristotelia chilensis)` | [PNG](screenshots/pixel9a-fr-maqui-berry.png) |
| French | `cocona` | `cocona (Solanum sessiliflorum)` | [PNG](screenshots/pixel9a-fr-cocona.png) |
| French | `brute` | `farine de blé entier brute` | [PNG](screenshots/pixel9a-fr-wheat-meal.png) |
| French | `bacon` | `bacon` | [PNG](screenshots/pixel9a-fr-bacon.png) |
| French | `poitrine roulee` | `pancetta` | [PNG](screenshots/pixel9a-fr-pancetta.png) |
| French | `guanciale` | `guanciale` | [PNG](screenshots/pixel9a-fr-guanciale.png) |
| French | `prosciutto` | `prosciutto` | [PNG](screenshots/pixel9a-fr-prosciutto.png) |

The unsaved QA drafts were discarded without saving a recipe. The app was returned to the French home screen with all 114 recipes visible: [final home screenshot](screenshots/pixel9a-home-fr-ca-114.png). Exact PNG checksums are listed in [SHA256SUMS.txt](screenshots/SHA256SUMS.txt).

## Verification

- Bundled seed-package normalization, ingredient-reference normalization, and generated Kotlin catalog freshness checks passed; the generated catalog contains 676 references.
- Research-ledger validation passed with 862 records and zero errors. All 10 Python seed-package tests passed.
- `./gradlew :app:testDebugUnitTest --no-daemon` passed 317 tests with zero failures, errors, or skips. The deployment script's `test` task and `:app:assembleDebug` also passed.
- The fresh Pixel 9a install displayed all 11 accepted references in both picker locales. French was restored, and the home count remained 114.
- All 23 archived screenshots passed `cd screenshots && sha256sum -c SHA256SUMS.txt`.

## Package snapshot

Hashes cover exact file bytes. The recipe-corpus digest processes each manifest-relative recipe path, a NUL byte, exact recipe-file bytes, and another NUL byte in manifest order.

| Data | Count | SHA-256 / digest |
|---|---:|---|
| Ingredient references | 676 | `7d0e0ce05c66c89003ff8990ffb34da2aee9c26c6fa8bb0f1dca43d142d797d4` |
| Ingredient forms | 33 | `275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732` |
| Research ledger | 862 records / 1,518 source entries / 1,284 distinct source IDs | `3d65565a17135b7684e8ab509822c21b7cd574df87ffdfaaa0b55d96d8891552` |
| Legacy candidates | 85 | `8d7ab2999637a4bcfefba8a1a16c517d4708af0a2e4e4b7f26f1f724e765e28b` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 recipes / 1,123 ingredient rows | `af3785e58c0310cbda8ae22668d37388e23e07f51db73f6e77892deea007c328` |

Further Section M sapote/baobab product scope, Section O cured-pork regional boundaries, Section A7 grain products, and independent Québec terminology review remain open. The proposal packets and master plan retain those open items.
