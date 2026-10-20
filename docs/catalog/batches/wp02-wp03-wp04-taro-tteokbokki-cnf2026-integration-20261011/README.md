# WP02 / WP03 / WP04 taro, tteokbokki sticks, and CNF 2026 checkpoint

**Date:** 2026-10-11
**Status:** Integrated research and ledger updates; one identity-only ingredient reference was added.

## Decisions

### Extracted taro-corm starch

Keep `candidate-taro-corm-starch` at `needs_clarification`. This pass found no exact Québec or Canadian French product listing for isolated starch from *Colocasia esculenta* corms. Retain `taro flour / farine de taro` as a separate whole-corm flour identity. Do not activate `fécule de taro` or `amidon de taro` based on linguistic inference or a non-Canadian commercial classification, and add no reference, alias, form, measure, recipe link, conversion, yield, or substitution.

One French dictionary-search aggregator surfaced a sentence claiming that taro starch is used in Canada, but it did not identify the underlying source or a product listing. It was treated as a search lead, not Québec product-name evidence. The bounded product-name review and its eight ledger sources are in the [WP02 proposal](../../proposals/wp02-taro-corm-starch-exact-quebec-product-name-review-20261011.md).

### Korean tteokbokki rice-cake sticks

Add the narrow identity-only reference `ingredient-ref-korean-tteokbokki-rice-cake-sticks`:

| Field | Value |
| --- | --- |
| English display | `Korean rice cake sticks for tteokbokki` |
| French display | `bâtonnets de gâteau de riz coréen pour tteokbokki` |
| English aliases | `Korean rice cake stick(s)`; `rice cake stick(s)` |
| French aliases | `bâtonnet(s) de gâteau de riz` |

Canadian retail wording supports the qualified identity: Walmart's French and English Tokimi pages connect `bâtonnet de gâteau de riz` / `Rice Cake Stick` with a Korean cylindrical product intended for tteokbokki, and a Brossard T&T listing corroborates the bilingual stick wording. OQLF's unqualified `gâteau de riz` entry refers to rice pudding, so the display stays fully qualified. Keep generic `rice cake`, `gâteau de riz`, `galette de riz`, `tteok`, `tteokbokki`, `topokki`, and `garaetteok` outside the aliases. The candidate is marked merged in the ledger.

No form, measurement, conversion, density, recipe link, yield, or substitution was added. The full boundary analysis is in the [WP03 proposal](../../proposals/wp03-tteokbokki-rice-cake-sticks-quebec-terminology-review-20261011.md).

### Recipe 066 serrano count

The 2026 Canadian Nutrient File conversion row for food code `4858` (raw serrano) is measure code `185`, `1 pepper / 1 poivron = 6.1 g`. It has no medium-size qualifier; the row was last updated 2000-12-20. The linked publisher recipe specifies one medium serrano but supplies no mass. Keep the medium-pepper weight unresolved and preserve the existing USDA observation as source-specific. No measurement observation, recipe edit, or `item` conversion was added from this CNF row. See the [WP04 proposal](../../proposals/wp04-recipe066-serrano-cnf-2026-measure-row-review-20261011.md), the [CNF 2026 dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109), the [CNF conversion CSV](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv), and [The Kitchn recipe](https://www.thekitchn.com/korean-soy-marinated-eggs-recipe-23636937).

## Package state

- Bundled library: **951 references, 53 forms, 114 recipes, and 1,123 ingredient rows**.
- Research ledger: **1,221 records, 3,638 source entries, 2,966 distinct source IDs, 8 unit conversions, and 0 validation errors**.
- The Korean tteokbokki stick identity is the only active catalog row added in this checkpoint. Taro and serrano remain research-only; recipe files and ingredient rows are unchanged.

## Verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — passed.
- `python3 -m tools.seed_package.test_bundled_seed_package` — **106 passed**.
- `:app:testDebugUnitTest --no-daemon --offline` — succeeded; test reports show **409 passed, 0 failed**.
- `:app:connectedDebugAndroidTest --no-daemon --offline` — succeeded on Android 16 / API 36; **34 passed, 2 skipped, 0 failed** (36 reported).
- `tools/deploy_to_pixel9a_emulator.sh` — deployed to the `Pixel_9a` AVD.
- Picker QA in the French UI: `Korean rice cake sticks` and accent-insensitive `batonnets de gateau de riz` each returned `bâtonnets de gâteau de riz coréen pour tteokbokki`. The blank draft was discarded and the French home was restored to 114 recipes.
- One transient system ANR appeared while reopening the menu after draft exit. Android reported a main-activity focus-event timeout. A force-stop/relaunch restored the app, after which the English query succeeded and the final French home was confirmed. The ANR trace itself was inaccessible to the shell user because `/data/anr` is system-protected.

## Pixel 9a screenshots

| Capture | SHA-256 |
| --- | --- |
| [English query in French UI](screenshots/picker-english-query-fr-ui.png) | `181463f35f69047687737f4f95ece6eb924b1be24fdf48b6e2a15e6680ab372d` |
| [French query in French UI](screenshots/picker-french-query-fr-ui.png) | `9a365aa95010ddc58bdaa71c09079452b0af366191a3ac02eb9261fb2c32d738` |
| [Restored French home, 114 recipes](screenshots/home-fr-114-recipes.png) | `4a293f15e89efdd69a6c34d8505400977d4d177d5317f181699bae9ef79be7a1` |

The broader global catalog plan remains open. The exact Québec/Canadian French product name for extracted taro-corm starch remains a follow-up.
