# WP05 Japanese condiment identity integration

Date: 2026-10-10  
Status: Canonical identity rows, evidence ledger, generated catalog, regression coverage, plan, roadmap, and disposable Pixel 9a search QA are complete. Broader WP05 coverage and independent Québec terminology review remain open.

Proposal input: [WP05 Japanese condiment boundary review](../../proposals/wp05-japanese-condiments-boundary-review-20261010.md).

## Accepted changes

- Promote the former legacy-only generic miso candidate to `ingredient-ref-miso`, with English/French display `miso` and OQLF-backed French alias `pâte de miso`. Keep the recipe-backed `ingredient-ref-white-miso-paste` separate and its current French display provisional. Remove generic miso from the legacy candidate file; 81 unrelated candidates remain.
- Add identity-only `amazake`, soy/citrus `ponzu sauce / sauce ponzu`, `mentsuyu`, `shiro dashi`, `teriyaki sauce / sauce teriyaki`, `yuzu kosho / piment au yuzu`, `umeboshi`, and `beni shoga`. Keep the source-backed aliases `yuzu chili paste`, `Japanese pickled plum`, and `red pickled ginger` narrowly scoped.
- Keep generic `tare`, tonkatsu and okonomiyaki sauce pending Québec French labels, Japanese mayonnaise as a distinct style, generic Japanese preserves, and Japanese `gari` held. The existing `ingredient-ref-gari` remains West African cassava gari/garri.
- No recipe links or recipe text changed. No forms, densities, unit mappings, yields, conversions, or substitutions were added.

The identity decisions follow the proposal's source limits: MAFF distinguishes miso styles and amazake types; OQLF supports generic `miso` / `pâte de miso` and `sauce teriyaki`; manufacturer and exporter sources bound the soy/citrus ponzu and named Japanese products. MAFF and JETRO describe yuzu kosho, MAFF describes umeboshi and red pickled ginger, and Endo lists gari separately from beni shoga. Sources do not justify collapsing specific miso styles, `tare`, generic ponzu, or the West African and Japanese uses of `gari`. See the proposal's source-to-claim map for the full 24-source record and held decisions.

## Package snapshot

SHA-256 values cover exact file bytes. The recipe fingerprint covers sorted manifest-relative recipe paths, with NUL separators around each file's exact bytes.

| Surface | Count | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 792 | `eae8d7c7ebab358cc39da5dab73ef741e349f83872d976c20e3f1714bde86c5d` |
| Ingredient forms | 36 | `1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef` |
| Research ledger | 1,018 records / 2,166 source entries / 1,754 source IDs | `ddecb739cc2874ebdd6b42c674abbdbde7cafce4d8e76497d85acd4d9526b2fe` |
| Seed manifest | — | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 recipes / 1,123 ingredient rows | `806c88c67b42177ddd6671fce0134d0063df30c677112770e2e5767b627b045a` |

## Verification

- Python seed-package tests: 25 passed.
- Android unit tests: 342 passed, 0 failed. The deploy workflow also completed Gradle `test`, `assembleDebug`, install, and launch.
- Bundled-package normalization, ingredient-reference normalization, generated-catalog freshness, evidence-ledger validation, and `git diff --check` passed. Ledger validation reported 1,018 records and no errors.
- Seed JSON is UTF-8 without a BOM; French accents are stored using JSON Unicode escapes as required.
- Pixel QA ran on a disposable Pixel 9a / Android 16 (API 36) clone, serial `emulator-5558`, 1080 × 2424 at 420 dpi. The app seeded and displayed all 114 recipes.
- In English ingredient-manager search, `ponzu` returned `ponzu sauce / sauce ponzu`, `mentsuyu` returned its single identity, and `yuzu` returned both the fruit and yuzu kosho. `gari` still resolved only to the existing gari identity.
- In French, `piment au yuzu` returned `piment au yuzu / yuzu kosho`, and accentless `pate de miso` returned generic `miso`. The app returned to `Toutes les recettes (114)`.
- The original Pixel 9a AVD `userdata-qemu.img` SHA-256 was `48d6753085207cbbdf6b1c2bc9416af3fe92ad42f6000ed5cfa49103ed0f9997` before and after clone QA. Only emulator 5558 was used for app navigation and screenshots.

Screenshots are saved under `screenshots/`:

| Screenshot | SHA-256 |
|---|---|
| `en-ponzu.png` | `19a5fc06637b03dc6fd1d4038250e034ee6fbaff5ff72986a1107ad71d603c2f` |
| `en-mentsuyu.png` | `c1b065b9b5c6de55f7085d32fa64be52ded5125d07db9b11dfd2940c661f19c0` |
| `en-yuzu-broad.png` | `f306c2076595906de46e3d24423f74d263ae075ccc7b699f94c9c084e7c0aa5e` |
| `en-gari-boundary.png` | `c9adc5cdd5246c5e524136972c96d9457a3145de43fb3973d014e02317ecb2d5` |
| `fr-piment-au-yuzu.png` | `8e7b71ff100575cf5661a31b180a09651916185fedaecb1fced93b486db87f6c` |
| `fr-pate-de-miso-accentless.png` | `50aaa39fd165ff1e05d1da9b5c8e5c8d79c96c1952b701973d599129a7ec4f88` |
| `fr-home-114-recipes.png` | `4b6b7014ed47fca4117a266a9ebddbc79b34b2f9133e706650e690416e5873a1` |

## Remaining scope

Keep broad WP05 condiment and preserved-food coverage open. Independent Québec French review remains needed for Japanese product names and regional style labels; the review did not establish measurement or substitution behavior.
