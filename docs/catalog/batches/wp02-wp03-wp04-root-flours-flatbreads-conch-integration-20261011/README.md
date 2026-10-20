# WP02/WP03/WP04 root flours, flatbreads, and conch integration

**Date:** 2026-10-11

**Scope:** Independent Québec display review for six existing flours; three prepared flatbread identities; a held generic conch candidate.

## Decisions integrated

### Root and fruit flour displays

The independent Québec review recommends retaining all six active English/French pairs, without adding aliases or changing product boundaries:

| Active reference | English display | fr-CA display | Review status |
|---|---|---|---|
| `ingredient-ref-green-banana-flour` | green banana flour | farine de banane verte | Retain |
| `ingredient-ref-green-plantain-flour` | green plantain flour | farine de banane plantain verte | Provisional; retain |
| `ingredient-ref-breadfruit-flour` | breadfruit flour | farine de fruit à pain | Provisional; retain |
| `ingredient-ref-tigernut-flour` | tigernut flour | farine de souchet | Retain |
| `ingredient-ref-yam-flour` | yam flour | farine d’igname | Retain |
| `ingredient-ref-taro-flour` | taro flour | farine de taro | Provisional; retain |

OQLF’s 1982 `farine de banane` entry is generic and corresponds to *banana meal*; it does not support adding that phrase as an alias for green banana or green plantain flour. Local plantain and taro fufu listings describe blended products, so they do not establish single-source flour labels. No active reference or numeric behavior changed in this review.

### Prepared flatbreads

Added three distinct identity-only references in `BAKING_MIXIN_AND_PANTRY`:

| Reference | English display | fr-CA display | Search alias |
|---|---|---|---|
| `ingredient-ref-naan-bread` | naan bread | pain naan | `nan` in English and French |
| `ingredient-ref-roti` | roti | roti | None |
| `ingredient-ref-paratha` | paratha | paratha | None |

The sources distinguish prepared naan, roti, and paratha from each other and from flour, chapati, and the broad `pain plat` family. Each reference has null density and no unit mappings, forms, measures, recipe links, conversions, yields, or substitutions. The English `roti` search also returns `toasted rice powder` because its French display `riz rôti` accent-folds to a matching search term; the intended bread is the first exact result. The French query likewise returns `poudre de riz rôti` alongside `roti`.

### Conch boundary

Added `candidate-conch` to the evidence ledger as an unresolved, held candidate. Generic `conch / conque` spans several gastropod taxa and product states, with no bundled recipe demand, so it has no active reference, aliases, forms, measures, recipe links, or substitution behavior. OQLF’s `strombe géant` names Queen Conch (*Strombus gigas*) specifically; `conque canaliculée` and `conque à nodules` refer to *Busycon* whelks. Keep these product identities separate. No conch-specific measurement or substitution is supported.

See the source-backed review packets for detailed evidence and limits:

- [WP02 independent Québec flour display review](../../proposals/wp02-regional-root-flours-quebec-display-review-20261011.md)
- [WP03 naan, roti, and paratha identity review](../../proposals/wp03-section-g-naan-roti-paratha-quebec-identity-review-20261011.md)
- [WP04 conch product boundary review](../../proposals/wp04-conch-quebec-product-boundary-review-20261011.md)

## Package state

- 946 ingredient references, 53 forms, and 114 recipes with 1,123 ingredient rows.
- 1,214 research-ledger records, 3,565 source entries, and 2,904 distinct source IDs.
- The three new bread entries are identity-only. No recipe rows, forms, or numeric or substitution behavior changed in this batch.
- Generic conch remains held; the six existing flour reference names and aliases remain unchanged.

## Verification and emulator QA

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`: passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`: passed; generated catalog is current at 946 references.
- `python3 -m tools.seed_package.test_bundled_seed_package`: 106 passed.
- Scoped `git diff --check` and a trailing-whitespace audit of this batch’s text files passed. The full worktree check reports existing trailing whitespace in the already-dirty exported-recipe archive; that archive was left untouched in this batch.
- `GRADLE_USER_HOME=/tmp/recipebook-gradle-home ./gradlew :app:testDebugUnitTest --no-daemon`: 409 passed.
- `GRADLE_USER_HOME=/tmp/recipebook-gradle-home ./gradlew :app:connectedDebugAndroidTest --no-daemon`: 36 reported, 34 passed, 2 skipped, 0 failed, 0 errors. Report: `app/build/outputs/androidTest-results/connected/debug/TEST-emulator-5556 - 16-_app-.xml`.
- `RECIPEBOOK_ADB_EXE=adb RECIPEBOOK_EMULATOR_SERIAL=emulator-5556 ./tools/deploy_to_pixel9a_emulator.sh`: installed and launched successfully on the disposable Android 16 / API 36 Pixel 9a QA profile.
- English picker: `naan` → `naan bread`; `roti` → `roti` plus the accent-folding co-result `toasted rice powder`; `paratha` → `paratha`.
- French picker: `nan` → `pain naan`; `roti` → `roti` plus `poudre de riz rôti`; `paratha` → `paratha`.
- Discarded both blank QA drafts without saving. Restored the French home and confirmed `Toutes les recettes (114)`.

## Screenshots and SHA-256

Screenshots are from the deployed app on `emulator-5556` (Android 16 / API 36). The picker screenshots show the search query and displayed result list.

| Screenshot | SHA-256 |
|---|---|
| [English naan search](screenshots/recipebook-naan-en.png) | `1c2f6fc41fe8535bb82d178baa17585fc952b7db76fd253d9110855387d6de70` |
| [English roti search](screenshots/recipebook-roti-en.png) | `936b7061d3727d72cd057fe562eb7487c61737a5ea3015c8f1884799c53726e1` |
| [English paratha search](screenshots/recipebook-paratha-en.png) | `20c0bb11ff62406921d119d9473fe3e11e09343057fedf43641dec6005fa3034` |
| [French naan search](screenshots/recipebook-naan-fr.png) | `fadba1ef676cb1a3543581df615687a63ae1f83d84a3e3f91a124b06513d2275` |
| [French roti search](screenshots/recipebook-roti-fr.png) | `c18f83488d2f993ac0fbf195db1b88ac0675d2bacf4c62905024d33447f4b601` |
| [French paratha search](screenshots/recipebook-paratha-fr.png) | `25e4b896f7cef191fa8602dfa38a6a9347f23e8775346d0d6c4c229899c13efd` |
| [French home, 114 recipes](screenshots/recipebook-french-home-final.png) | `64b5929860bc1dbed6cbd3ecf2782d765cd32c18798bbc9886c6cf12379d7de9` |
