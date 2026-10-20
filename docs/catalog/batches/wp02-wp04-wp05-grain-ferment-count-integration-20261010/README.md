# WP02 / WP04 / WP05 Flour, Ferment, and Count Review

Date: 2026-10-10  
Integration owner: repository coordinator  
Reviewed packets: A6 regional grain flours, A7 grain meals/malted flours/gluten flour, East Asian fermented and sesame products, Korean fermented pastes, and fresh-herb count portions

## Integrated catalog decisions

- Added identity-only `FLOUR_AND_STARCH` references for millet flour, fonio flour, Job’s tears flour, and malted rye flour. Fonio flour keeps only `acha flour` as an English alias. Job’s tears flour stays separate from its grain identity; millet flour stays separate from pearl- and finger-millet flours. No density, unit mapping, form, measurement, conversion, yield, substitution, or recipe link was added.
- Added identity-only `SAUCE_AND_CONDIMENT` references for douchi, white fermented bean curd, red fermented bean curd, Chinese sesame paste, gochujang, doenjang, and ssamjang. White and red curds remain separate; Chinese sesame paste is not a global tahini synonym. The named Korean pastes remain separate from generic fermented soybean paste.
- Added `gluten flour` and `farine de gluten` as bilingual aliases on the existing `vital wheat gluten / gluten de froment élastique` row. OQLF’s term pair and one current Canadian retail SKU support that narrow search bridge. Keep the row separate from high-gluten flour. The CFIA standardized class is broader than a universal claim that all gluten-flour products have the same composition or functionality as vital wheat gluten.
- Added unresolved ledger candidates for barley meal, dry oat meal, generic malt flour, and toasted rye flour. Their reviewed sources do not establish the required consumer-product boundary and Québec French naming. Generic wheat meal remains unresolved even though the narrower whole-wheat-meal reference is active.
- Kept unqualified `fermented bean curd`, `sesame paste`, and `fermented soybean paste` held. No generic aliases or automatic identity links were created. Broad picker searches may display multiple qualified results when their words occur in longer canonical names.
- Reviewed two exact fresh-herb count lines and added no measurement observations: recipe `30e4274f-19fd-47df-b90b-75a5eefdb2c8-ingredient-2` requests 4–5 rosemary sprigs, while USDA SR28 lists teaspoon and tablespoon weights but no sprig weight; recipe `7f200ce7-8ce5-4f82-97aa-e3eccebc2fd7-ingredient-9` requests ten fresh basil leaves, while SR28’s count portion is five leaves = 2.5 g. Do not scale the basil measure or derive a rosemary sprig weight from volume or reference data.
- No bundled recipe, original ingredient text, or manifest path changed. No recipe links, forms, active conversions, yields, or substitution rules were added.

## Evidence packets

- [A6 regional grain flour review](../../proposals/wp02-a6-regional-grain-flour-gaps-20261010.md)
- [A7 grain-meal, malted-rye, and gluten-flour boundary review](../../proposals/wp02-a7-grain-meals-malt-toasted-boundaries-20261010.md)
- [East Asian fermented and sesame identity review](../../proposals/wp05-east-asian-fermented-sesame-identity-resolution-20261010.md)
- [Korean fermented-paste identity review](../../proposals/wp05-korean-fermented-pastes-identity-review-20261010.md)
- [Fresh-herb count-portion review](../../proposals/wp04-fresh-herb-count-portion-review-20261010.md)

WP04’s fresh-herb source IDs remain proposal-local. Per that review, no canonical source rows or measurements were added for the two unsupported recipe counts.

## Search and Pixel 9a verification

The generated catalog exposes 781 references. Android unit coverage checks the three millet-flour picker choices, the fonio/Acha boundary, Job’s tears grain/flour results, the white/red curd split, the scoped Chinese sesame identity, Korean paste names, and the gluten-flour alias behavior.

`tools/deploy_to_pixel9a_emulator.sh` passed its Gradle test and debug-assembly stages, installed the APK, and launched the app on the disposable Pixel 9a / Android 16 AVD at 1080×2424, serial `emulator-5558`. Live searches showed:

- `malted rye flour` → one malted rye flour result.
- `gluten flour` → high-gluten flour and vital wheat gluten; `farine de gluten` → the French vital-wheat-gluten display.
- `millet flour` → finger millet flour, millet flour, and pearl millet flour; `farine de millet` → one millet flour result.
- `acha flour` → `farine de fonio` in the French app.
- `pâte de soya fermentée` (accent-insensitive query) → the French gochujang and doenjang displays.
- `fermented bean curd` → separate French white and red curd displays.
- `Chinese sesame paste` → `pâte de sésame à la chinoise` in the French app.
- Job’s tears flour, douchi, and the exact French millet/gluten terms each returned their reviewed display.

The empty recipe draft was discarded. The French home returned to 114 recipes. The existing owner AVD base image SHA-256 was `48d6753085207cbbdf6b1c2bc9416af3fe92ad42f6000ed5cfa49103ed0f9997` both before and after QA. No ADB navigation or install targeted its serial; the disposable AVD configuration and data image were removed from `/tmp` after shutdown. No app data was cleared.

Screenshots: [French home](screenshots/home-fr.png), [malted rye flour](screenshots/picker-en-malted-rye-flour.png), [gluten flour results](screenshots/picker-en-gluten-flour.png), [millet flour choices](screenshots/picker-en-millet-flour.png), [French vital gluten](screenshots/picker-fr-farine-de-gluten.png), [French millet flour](screenshots/picker-fr-farine-de-millet.png), [French fonio flour](screenshots/picker-fr-fonio-flour.png), [Korean pastes](screenshots/picker-fr-korean-pastes.png), [fermented bean curd](screenshots/picker-fr-fermented-bean-curd.png), and [Chinese sesame paste](screenshots/picker-fr-chinese-sesame-paste.png).

## Validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed at 781 references.
- Research-ledger validation passed with 1,004 records and no errors.
- Python seed-package suite: 22 tests passed.
- Android debug unit suite: 340 tests passed.
- Deployment-script `test`, `:app:assembleDebug`, install, and launch stages passed.
- `git diff --check` passed.
- UTF-8 without BOM checks passed for the edited seed, ledger, generated catalog, plan, and roadmap. Bundled French catalog text remains stored as explicit JSON Unicode escapes.

## Final package fingerprints

| Artifact | Count / scope | SHA-256 / fingerprint |
|---|---:|---|
| `ingredient-references.v1.json` | 781 references | `68873218d7c290b10a05d09cfaffb6b975bbb2dccde87e48b288839de42fdef4` |
| `ingredient-forms.v1.json` | 36 forms | `1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef` |
| `research-ledger.v1.json` | 1,004 records; 2,124 source entries; 1,719 distinct source IDs | `14212b10866568bf890aa88527664d2c901c95227375731ea68856e5a4a1cc9a` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipes | 114 files; 1,123 ingredient rows | `806c88c67b42177ddd6671fce0134d0063df30c677112770e2e5767b627b045a` |
| Debug APK | — | `6de2034126fa6390f0f152e971076e50ee57cff2a8fd8c24d196f967fdd42987` |

## Remaining work

The broader A6 regional-flour review and A7 meal/malt review remain open. WP05 still has other Chinese and Korean sauces, seasonings, and ferments to review. WP04 still has unsupported count portions and animal-food coverage to research. Independent Québec terminology review remains open.
