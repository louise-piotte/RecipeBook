# WP02 / WP04 / WP05 Regional Flour, Sauce, and Produce Count Integration

Date: 2026-10-10  
Integration owner: repository coordinator  
Research packets: WP02 flour boundaries, WP04 produce count alternatives, WP05 East Asian sauces

## Integrated decisions

- Added four identity-only flour references in `FLOUR_AND_STARCH`:
  - `breadfruit flour` / `farine de fruit à pain`, scoped to *Artocarpus altilis* flesh.
  - `tigernut flour` / `farine de souchet`, scoped to whole-tuber flour from *Cyperus esculentus*.
  - `yam flour` / `farine d’igname`, scoped to single-source *Dioscorea* flour.
  - `taro flour` / `farine de taro`, scoped to *Colocasia esculenta* corms; the French compound remains provisional pending independent Québec review.
- Added five identity-only, manufacturer-named references in `SAUCE_AND_CONDIMENT`:
  - `chili oil` / `huile de piment rouge`.
  - `Chiu Chow Style Chili Crisp Oil` / `huile au piment croustillante de type Chiu Chow`.
  - `XO sauce` / `sauce de XO`.
  - `Sa Cha sauce` / `sauce sa cha`.
  - `char siu sauce` / `sauce char siu`.
- Added source-specific published count weights to the research ledger only:
  - Raw garlic: one unqualified clove = 3 g (FDC 169230 portion 84480; corroborated by SR28 NDB 11215). Clove size is unspecified; no size-qualified garlic rows inherit the value.
  - Raw leek: one leek = 89 g for the SR28 NDB 11246 edible bulb/lower-leaf portion. The source’s 56% refuse is retained as a qualifier and is not added to the 89 g.
- Kept one large raw onion, four small raw carrots, and four large red-ripe tomatoes without count weights. SR28’s inspected onion, carrot, and red-ripe tomato entries do not publish those matching counts. The 182 g “one large” value belongs to green tomato NDB 11527 and is excluded.
- No aliases, forms, default densities, unit mappings, active conversions, package yields, substitutions, or recipe links were added. No recipe line, original ingredient text, or manifest path changed. Existing generic yam and taro identities remain separate from the new flours; broad `taro` and `igname` searches can return the root and flour identities, while exact flour queries return one result.

## Source and boundary register

| Candidate | Canonical source IDs | Boundary retained |
|---|---|---|
| Breadfruit flour | `WP02-REGIONAL-ROOT-FLOUR-20261010-S01`, `S02` | Regional French flour wording and the current breadfruit species scope; no breadnut, seed flour, or hybrid alias. |
| Tigernut flour | `WP02-REGIONAL-ROOT-FLOUR-20261010-S08`–`S10` | Whole ground tubers only; defatted flour and grind grades stay distinct. |
| Yam flour | `WP02-REGIONAL-ROOT-FLOUR-20261010-S12`, `S14`, `S16` | Single-source *Dioscorea* flour; no `elubo`, `amala`, `poundo yam`, composite flour, or `fufu/foufou` alias. |
| Taro flour | `WP02-REGIONAL-ROOT-FLOUR-20261010-S18`, `S20`, `S21` | *C. esculenta* only; no *Xanthosoma*, extracted starch, or powder alias. |
| Chili oil | `WP05-EASP-FU-20261010-S08`, `S14` | Kept distinct from crisp oils, dry spices, and other chili sauces. |
| Chiu Chow crisp oil | `WP05-EASP-FU-20261010-S09`, `S15` | Chiu Chow style stays explicit and separate from plain chili oil. |
| XO sauce | `WP05-EASP-FU-20261010-S10`, `S16` | Manufacturer formula is product-specific. |
| Sa Cha sauce | `WP05-EASP-FU-20261010-S11`, `S12`, `S17` | Kept separate from satay; alternate `sha cha` spelling remains unassigned. |
| Char siu sauce | `WP05-EASP-FU-20261010-S13`, `S18` | Chinese-barbecue wording is not an alias of the generic North American BBQ-sauce identity. |
| Garlic and leek portions | `WP04-WP12-FDC-ALT-20261010-S02`–`S04` | Source-specific counts only; no runtime conversion. |
| Held onion, carrot, and tomato counts | `WP04-WP12-FDC-ALT-20261010-S05`–`S07` | Exact matching count evidence is absent from those inspected records; green-tomato weight is a different food record. |

The complete claim limits, retrieval notes, recipe-line audit, and source links are in the proposal packets: [WP02 regional flour boundaries](../../proposals/wp02-regional-root-flour-boundaries-20261010.md), [WP04 produce count alternatives](../../proposals/wp04-produce-count-alternate-source-review-20261010.md), and [WP05 East Asian sauce follow-up](../../proposals/wp05-east-asian-sauce-preserve-followup-20261010.md).

## Validation

- Ingredient-reference normalization and bundled seed-package normalization passed in check mode.
- Generated Kotlin catalog freshness passed at 770 references.
- Research ledger validation passed with 988 records and no errors.
- Python seed-package suite: 19 tests passed.
- Android debug unit suite: 338 tests passed.
- `git diff --check` passed.
- `tools/deploy_to_pixel9a_emulator.sh` completed its generic test, debug-assembly, install, and launch stages on isolated Pixel 9a serial `emulator-5558`. English `taro flour` and French `sauce sa cha` searches each returned one result. After exiting the unsaved draft, the French home still showed 114 recipes. The temporary QA AVD data image and clone config were removed after shutdown.
- The existing AVD base `userdata-qemu.img` SHA-256 was `48d6753085207cbbdf6b1c2bc9416af3fe92ad42f6000ed5cfa49103ed0f9997` before and after QA. No installation or picker interaction targeted that AVD, and no app data was cleared. Its existing `.qcow2` overlay was left in place; this batch did not take a pre/post overlay fingerprint.
- No Room schema or migration changed, so no migration test was needed for this seed/ledger-only batch.

Screenshots: [French recipe home](screenshots/home-fr.png), [English taro-flour result](screenshots/picker-en-taro-flour.png), and [French Sa Cha result](screenshots/picker-fr-sa-cha.png).

## Final package fingerprints

| Artifact | Count / scope | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 770 references | `086adb131bf0abf4df3b25be430878173ce51a8ac1bcb2191834b4b73b72a4b4` |
| `ingredient-forms.v1.json` | 36 forms | `1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `research-ledger.v1.json` | 988 records; 2,055 source entries; 1,669 distinct source IDs | `f5d9274cd2172ea491df20679a0d273f31ecf684f715d8833e6458f7d3fa2289` |
| Manifest-listed recipes | 114 files; 1,123 ingredient rows | `806c88c67b42177ddd6671fce0134d0063df30c677112770e2e5767b627b045a` |

## Remaining work

Continue broader WP02 regional and functional flour coverage, WP04 count and edible-portion retrieval (including the inaccessible CNF 2026 files), WP05 condiment coverage, and independent Québec terminology review. These accepted identities do not close their broader checklist sections.
