# WP02 / WP05 Roasted Flour and Preserved Condiment Follow-up

Date: 2026-10-10

## Integrated decisions

- Added identity-only `roasted urid flour` / `farine de haricot urd torréfiée` and `roasted red rice flour` / `farine de riz rouge torréfiée`. Both have empty aliases and no forms, density, unit mappings, measurements, conversions, yields, substitutions, or recipe links. The French displays are provisional pending independent Québec terminology review.
- Kept roasted mong flour, historical roasted white-rice flour, and the conflicting pregelatinized/roasted oat-flour grade as unresolved evidence-ledger candidates. The mong product's botanical species and flour-versus-starch state remain unclear.
- Verified the existing `bread and butter pickle` / `cornichons sucrés` identity from OQLF terminology, Brine&Co.'s paired Québec product label, and the exact Big Mac Sauce ingredient line. Removed the unsupported mixed-language alias `cornichons bread and butter`.
- Kept sauerkraut, generic pickled cucumber, table olives, pickled onions, generic chutney, and relish as held candidates because the 114-recipe / 1,123-row audit found no exact recipe demand for them. The exact Big Mac Sauce line remains linked to `ingredient-ref-bread-and-butter-pickle`; no recipe line or manifest path changed.
- Proposal and source details: [WP02 roasted-flour review](../../proposals/wp02-roasted-urid-mong-oat-rice-flour-review-20261010.md) and [WP05 preserved-condiment review](../../proposals/wp05-preserved-condiments-exact-recipe-demand-review-20261010.md).

## Verification

- Reference normalizer completed; bundled seed-package normalizer `--check` passed.
- Generated Kotlin reference index is current at 761 entries; ledger validation passed with 979 records and no errors.
- All 18 Python seed-package tests and all 337 Android unit tests passed.
- The original deploy attempt's generic test and debug assembly stages passed, but `adb install -r` failed with `INSTALL_FAILED_INSUFFICIENT_STORAGE` at 335 MB available on the owner Pixel 9a. No owner app data or AVD image was cleared.
- `manifest.v1.json` remains unchanged at 114 recipes. The bundled corpus remains 1,123 ingredient rows.

### Pixel 9a picker follow-up

The live picker check was later completed with the tested 781-reference debug APK (`6de2034126fa6390f0f152e971076e50ee57cff2a8fd8c24d196f967fdd42987`) on a disposable Pixel 9a / Android 16 clone, serial `emulator-5558`, at 1080×2424 and 420 dpi. Its fresh data image lived under `/tmp/recipebook-pixel9a-avds`; only ADB actions to `emulator-5558` were used.

- English `roasted urid flour`, `roasted red rice flour`, and `bread and butter pickle` each returned one matching result.
- Accent-insensitive French `farine de haricot urd torrefiee` and `farine de riz rouge torrefiee` returned `farine de haricot urd torréfiée` and `farine de riz rouge torréfiée`. `cornichons sucres` returned `cornichons sucrés`; the removed `cornichons bread and butter` alias returned no result.
- The unsaved draft was discarded and the French home returned to 114 recipes. The owner AVD's `userdata-qemu.img` SHA-256 was `48d6753085207cbbdf6b1c2bc9416af3fe92ad42f6000ed5cfa49103ed0f9997` before and after QA. The clone was shut down and removed.

Screenshots: [English roasted urid flour](screenshots/picker-en-roasted-urid-flour.png), [English roasted red rice flour](screenshots/picker-en-roasted-red-rice-flour.png), [English bread-and-butter pickle](screenshots/picker-en-bread-and-butter-pickle.png), [French roasted urid flour](screenshots/picker-fr-roasted-urid-flour.png), [French roasted red rice flour](screenshots/picker-fr-roasted-red-rice-flour.png), [French pickle display](screenshots/picker-fr-bread-and-butter-pickle.png), [removed-alias no-result check](screenshots/picker-fr-removed-mixed-alias.png), and [restored French home](screenshots/home-fr.png).

| Screenshot | SHA-256 |
| --- | --- |
| `home-fr.png` | `5b43ce5b66231299cb4d4ab65681addd499af29a460390ddb68d375397bec844` |
| `picker-en-bread-and-butter-pickle.png` | `c460c43370314ab5afac3775ded0fd816e517255b021c490a7f03ae51ed972cf` |
| `picker-en-roasted-red-rice-flour.png` | `321e310f7a658ce270af713f81bb17a8e9178d8461f793c669c6b34c06dce449` |
| `picker-en-roasted-urid-flour.png` | `1cf10aeee864f6ee16993135b4c77791de171084c10b461c0b1aabb9366ac7b8` |
| `picker-fr-bread-and-butter-pickle.png` | `b7ebbcf44ec4136e86c4890125892065088abeeb7305f0d12d11d51099473c16` |
| `picker-fr-removed-mixed-alias.png` | `e17b9b957a40ee1a56e898260abbde904ea91829eb668239cfd67de996e0bb90` |
| `picker-fr-roasted-red-rice-flour.png` | `9f0dcb5bc28323fdddcce70325c1c07fe36d8aacf771216e89b7e14142a44ba9` |
| `picker-fr-roasted-urid-flour.png` | `3432ba540de1d51b7deeb81ed8dd255f0c3a273bb5f039f17c15a0cdcca54ee8` |

## Fingerprints

| Artifact | Count | SHA-256 |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 761 | `c2b385fbeffa8e7e0146665c8530377a3cf6afb073e7034de733ecce08be7384` |
| `ingredient-forms.v1.json` | 36 | `1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `research-ledger.v1.json` | 979 records / 2,027 source entries / 1,641 distinct source IDs | `92ccae5f6da21a238c0e538edaa571b502918baf79028b05545a4a40df336cba` |
| Recipe corpus | 114 files / 1,123 ingredient rows | `d4ba08e849c8f276446433fd1e8c70a78a0b31bd750c0283647e8e5b569604ee` |

## Remaining work

Continue broader WP02 B2/B3 flour and regional-name coverage, WP05 sauce and preserved-condiment coverage, WP04 current CNF portion retrieval, and independent Québec terminology review. The owner-AVD storage failure and isolated-clone resolution are recorded above.
