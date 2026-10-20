# WP03 Section M/N and WP04 Section P identity tranche — 2026-10-10

## Reviewed proposals

This checkpoint integrates the [Section M fruit-gap review](../../proposals/wp03-section-m-fruit-gaps-20261010.md), [huitlacoche identity review](../../proposals/wp03-section-n-huitlacoche-identity-20261010.md), and [Section P finfish review](../../proposals/wp04-finfish-gaps-20261010.md). Their proposal-local source registers record the full candidate audits. The accepted names are supported by OQLF’s [asimine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083801/asimine), [figue de Barbarie](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297016/figue-de-barbarie), [plie canadienne](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198638/plie-canadienne), and [barbue de rivière](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198686/barbue-de-riviere) entries; by TERMIUM Plus and the American Phytopathological Society’s [common-smut profile](https://www.apsnet.org/edcenter/pdlessons/Pages/CornSmut.aspx); and by Fisheries and Oceans Canada’s [Pacific halibut profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pac-halibut-fletan-pac-eng.html) and [French profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pac-halibut-fletan-pac-fra.html).

## Decisions

| Catalog change | fr-CA / English | Boundary |
|---|---|---|
| Add asimine | `asimine` / `pawpaw (Asimina triloba)` | Keep separate from papaya and cherimoya. Do not activate ambiguous `papaw` or `mangue du Canada`. |
| Add prickly pear | `figue de Barbarie` / `prickly pear` | Add only the English alias `cactus pear`; do not include nopal/cladodes, other *Opuntia* fruits, or the ambiguous `tuna`. |
| Add huitlacoche | `huitlacoche` / `huitlacoche` | Young edible *Ustilago maydis* galls on maize ears; English alias `cuitlacoche`. Keep corn, generic mushroom, and disease terms distinct. |
| Add American plaice | `plie canadienne` / `American plaice` | Species-scoped to *Hippoglossoides platessoides*. Keep bare sole, flounder, plie, and plaice out of aliases. |
| Add channel catfish | `barbue de rivière` / `channel catfish` | Species-scoped to *Ictalurus punctatus*. Keep generic catfish and `poisson chat` unresolved. |
| Add Pacific halibut | `flétan du Pacifique` / `Pacific halibut` | Species-scoped to *Hippoglossus stenolepis* and separate from Atlantic halibut. |

All six rows are identity-only with null density and empty unit mappings. No recipe lines or links, ingredient forms, measurements, conversions, yields, or substitutions changed. The fruit review also kept the existing holds for melon/cantaloupe, plantain maturity, fresh cherry subtypes, generic dried cherries, and Goji wording. Section M/N/P coverage and independent Québec terminology review remain active.

## Search behavior

Pixel 9a / Android 16 picker checks were run against a fresh load of the bundled seed. English searches resolved `pawpaw` to `pawpaw (Asimina triloba)`, `prickly pear` to `prickly pear`, `huitlacoche` to `huitlacoche`, and the species-qualified fish searches to American plaice, channel catfish, and Pacific halibut. French searches resolved `asimine`, `figue de Barbarie`, `plie canadienne`, `barbue de rivière`, and unaccented `fletan du Pacifique` to the intended localized rows with accents displayed correctly.

The unit search assertions verify that the generic `halibut` and `flétan` queries show both Atlantic and Pacific halibut, while no species-wide aliases were added. The empty draft used to reach the picker was discarded. The app was left on the French home screen with all 114 recipes.

| Screenshot | Query or state |
|---|---|
| `screenshots/picker-en-pawpaw.png` | `pawpaw` → `pawpaw (Asimina triloba)` |
| `screenshots/picker-fr-asimine.png` | `asimine` → `asimine` |
| `screenshots/picker-en-prickly-pear.png` | `prickly pear` → `prickly pear` |
| `screenshots/picker-fr-figue-de-barbarie.png` | `figue de Barbarie` → `figue de Barbarie` |
| `screenshots/picker-en-huitlacoche.png` | `huitlacoche` → `huitlacoche` |
| `screenshots/picker-en-american-plaice.png` | `American plaice` → `American plaice` |
| `screenshots/picker-fr-plie-canadienne.png` | `plie canadienne` → `plie canadienne` |
| `screenshots/picker-en-channel-catfish.png` | `channel catfish` → `channel catfish` |
| `screenshots/picker-fr-barbue-de-riviere.png` | `barbue de riviere` → `barbue de rivière` |
| `screenshots/picker-en-pacific-halibut.png` | `Pacific halibut` → `Pacific halibut` |
| `screenshots/picker-fr-fletan-pacifique.png` | `fletan du Pacifique` → `flétan du Pacifique` |
| `screenshots/home-en.png` | English home; 114 recipes |
| `screenshots/home-final-fr.png` | French home; 114 recipes |

Exact PNG SHA-256 values are in [`screenshots/SHA256SUMS.txt`](screenshots/SHA256SUMS.txt).

## Verification

- Bundled seed-package normalization and generated ingredient-index freshness checks passed. The generated Kotlin index contains 660 references.
- Research-ledger validation passed with 844 records and zero errors. All 10 Python seed-package tests passed.
- `./gradlew :app:testDebugUnitTest --no-daemon` passed all 317 Android unit tests. The deployment script’s full `test` task and `:app:assembleDebug` task also succeeded.
- `tools/deploy_to_pixel9a_emulator.sh` installed and launched the app on `RecipeBook_Pixel_9a`, emulator `emulator-5556`. Only the emulator app data was reset so the new bundled seed loaded. Manual English and French picker checks passed, the blank draft was discarded, and the French 114-recipe home was restored.

## Package snapshot

Hashes cover exact file bytes. The recipe-corpus digest processes each manifest-relative recipe path, a NUL byte, exact recipe-file bytes, and another NUL byte in manifest order.

| Data | Count | SHA-256 / digest |
|---|---:|---|
| Ingredient references | 660 | `0ed3cf126bc93c3dc709b222d831aade0d68990c944c3e2da6835ba058c8af4a` |
| Ingredient forms | 33 | `275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732` |
| Research ledger | 844 records / 1,446 source entries / 1,213 distinct source IDs | `b4c72b7199cc4736f2ae26a72d546080b43b7d98694352974de4813a6b84f380` |
| Legacy candidates | 86 | `7e416c84748a1d83bd29e05962dbc18cf9b9f4b16f5f572fcddb7b40667fa5ab` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 recipes / 1,123 ingredient rows | `7b275f9696892e81ee05e247177d4c09a7a92f51d64586882d7599760bc6f22f` |

The canonical split seed package remains the sole full-library interchange format. Broader Section M/N/P identity coverage, independent Québec terminology review, and source-backed measurement and substitution work remain open.
