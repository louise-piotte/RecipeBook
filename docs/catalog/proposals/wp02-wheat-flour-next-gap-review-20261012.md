# WP02 Section A next wheat-flour identity: Japanese medium-strength wheat flour

- **Review date:** 2026-10-12
- **Status:** Proposal only. No active catalog, form, legacy, ledger, recipe, plan, roadmap, or code data changed.
- **Scope:** One remaining regional wheat-flour class from Section A: Japanese medium-strength wheat flour, 中力粉 (*chūrikiko*).
- **Proposal-local source prefix:** `WP02-JAPANESE-MEDIUM-WHEAT-20261012-S01` through `S05`; the prefix and proposal filename were absent before drafting.

## Recommendation

Add one identity-only `FLOUR_AND_STARCH` reference for the Japanese market class 中力粉 (*chūrikiko*):

| Field | Proposal |
|---|---|
| Stable ID | `ingredient-ref-japanese-medium-strength-wheat-flour` |
| English display | `Japanese medium-strength wheat flour (chūrikiko)` |
| Proposed fr-CA display | `farine de blé japonaise de force moyenne (chūrikiko)` |
| English aliases | None |
| French aliases | None |
| Category | `FLOUR_AND_STARCH` |

The Japanese Ministry of Agriculture, Forestry and Fisheries (MAFF) distinguishes 中力粉 from strong, semi-strong, and weak wheat flour by gluten strength; it describes the medium class as intermediate in strength and used for udon and other Japanese noodles. Nippn currently sells a product explicitly named `中力小麦粉` (“medium-strength wheat flour”). This supports a named Japanese flour class. It does **not** establish a statutory standard: Japan’s Flour Milling Promotion Foundation says the four practical classes are not public flour definitions or standards and are used by milling companies. Do not store class-wide protein limits or milling thresholds. [S01–S03]

The French display is a transparent descriptive construction, not an OQLF-approved class name. OQLF documents Québec terms for generic all-purpose, strong-wheat, and soft-wheat flour, but I found no entry for a medium-strength class or a Japanese-qualified form. Keep this display provisional pending independent Québec French review. [S04–S05]

## Identity boundary and neighboring classes

| Neighbor | Decision |
|---|---|
| Japanese weak wheat flour, `hakurikiko` | Keep the active `ingredient-ref-japanese-weak-wheat-flour` separate. MAFF describes weak flour as softer and lower in gluten; it is not the medium class. |
| Japanese strong and semi-strong wheat flour, `kyōrikiko` and `jun-kyōrikiko` | Keep separate. MAFF distinguishes both from 中力粉 by relative gluten strength and typical uses. This proposal adds neither class. |
| All-purpose flour / `farine tout usage` | Do not alias or crosswalk. OQLF defines Canadian all-purpose flour as a blend of hard- and soft-wheat milling products with about 12% protein and notes that flour classes and names vary by country. Nippn’s single medium-flour product lists 10 g protein per 100 g; that product-specific label does not establish a class-wide equivalence or a substitution. [S03–S04] |
| Bread flour and high-gluten flour | Keep the existing general identities separate. OQLF’s `farine de blé de force` is high-gluten flour used mainly for bread; it does not name the Japanese middle-strength class. Do not alias generic bread, high-gluten, or hard-wheat terms. [S05] |
| Japanese product `たけ` | Do not add the brand/product name as an alias. Nippn uses it for one packaged product, not as a class synonym. |

The medium class is an ingredient identity, not a preparation form. Its functional and national qualifier belongs in the ingredient display; do not create an `IngredientForm` or map the class to another country’s flour grade.

## Names, aliases, and picker behavior

Keep both alias arrays empty. The romanized class name in each display supports searches for `chūrikiko` and `churikiko`; NFKD normalization removes the macron, so both resolve to the same searchable key. Do not add `all-purpose flour`, `plain flour`, `medium flour`, `farine tout usage`, or `farine de blé de force` as aliases: those terms either denote another class or omit the Japanese qualifier.

Do not add the native-script strings `中力粉` or `中力小麦粉` as aliases under the current picker. `IngredientSearch.kt` normalizes search to lowercase, accent-folded ASCII letters and digits; a CJK-only query becomes empty, and an empty normalized query returns the entire catalog. The current picker returns no result for the proposed English/French phrases or for `chūrikiko` / `churikiko`; after this row is added, the full qualified names and romanization should each be unique. Broad one-word searches such as `medium` remain family searches and are not proposed aliases.

## Forms, measurements, conversions, substitutions, and recipe links

- **Forms:** None. 中力粉 is a flour class, not a preparation state.
- **Measurements:** No generic cup, volume, density, or package-yield value is supported. Nippn lists one product as a 1 kg package and gives that SKU’s nutrition per 100 g; neither value is a reusable volume mapping or class-wide measurement. Keep `defaultDensity: null` and `unitMappings: []`. If integrated, record measurement state as `researched_no_supported_value`.
- **Conversions:** None. No form conversion or class crosswalk is supported.
- **Substitutions:** None. MAFF and mill product pages describe uses, not a tested replacement ratio. If integrated, record substitution state as `researched_no_supported_substitute`.
- **Recipe links:** None. A manifest-order scan of every bundled recipe found no matching class name, native label, romanization, proposed French display, or proposed reference ID. Do not link or relink a recipe line based on this review.

## Live-package and ownership audit

Read-only snapshot on 2026-10-12; hashes cover exact file bytes. The recipe digest hashes each manifest-listed relative path, a NUL byte, the exact recipe bytes, and a trailing NUL byte.

| Surface | Current snapshot | SHA-256 / digest |
|---|---:|---|
| Ingredient references | 1,264 | `c373d1cf4f192b0cfdaf8f8095b8642a5bd6d55cd50be822ef81ed3060914d39` |
| Ingredient forms | 94 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| Legacy-import candidates | 66 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Research ledger | 1,573 records; 5,526 record source entries; 4,562 distinct source IDs; 8 unit conversions | `f0caa10408e515af8bc74cf7a158d73f7f3b5ad8873d1f5c9d0622664bd14965` |
| Manifest-listed recipes | 114 files; 1,123 ingredient rows | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

| Ownership surface | Finding |
|---|---|
| Active references | No proposed ID, English display, French display, romanization, or exact candidate alias is owned. The related Japanese weak-flour row is active and remains distinct. |
| Forms | No form ID, label, or match term owns the candidate ID, class name, or romanization. |
| Legacy candidates | No candidate owns the proposed ID or exact English/French display or romanized term. |
| Research ledger | No `ingredient_reference` record has the proposed ID and no record describes a medium-strength/chūrikiko identity. The MAFF URL itself is already cited as `WP02-JSF-20261011-S01` on the Japanese weak-flour record, scoped there to the weak class. This proposal uses MAFF’s separate 中力粉 passage and does not widen or edit that existing record. |
| Prior proposals | I scanned the WP02 proposal archive. The Japanese weak-flour proposal and review cover `hakurikiko`; no standalone medium-strength/chūrikiko proposal or hold was found. The new source prefix, reference ID, and requested filename had no exact owner. |

The live search logic in `IngredientSearch.kt` folds accents and punctuation, prefers complete normalized word-phrase matches, and falls back to substring matches only when no phrase match exists. Current exact searches for `Japanese medium-strength wheat flour`, `farine de blé japonaise de force moyenne`, `chūrikiko`, and `churikiko` return zero rows; the exact `中力粉` query normalizes to empty and returns all 1,264 references. After integration, the qualified English and French phrases and romanization should each return only the proposed row. Avoid a bare `medium` alias.

I scanned all 114 manifest-listed recipe JSON files, including every ingredient row, for the English and French candidate phrases, 中力粉, 中力小麦粉, chūrikiko/churikiko, and the proposed ID. There were zero matches and zero recipe links. For context, the existing package has 50 all-purpose-flour lines in 47 recipes, four cake-flour lines, and two bread-flour lines; none calls for the Japanese medium class.

## Source register

Sources were accessed or rechecked on 2026-10-12. They support only the stated class boundary and naming claims.

| ID | Source | Evidence and limit |
|---|---|---|
| **WP02-JAPANESE-MEDIUM-WHEAT-20261012-S01** | Japan Ministry of Agriculture, Forestry and Fisheries, [小麦粉の種類について教えてください](https://www.maff.go.jp/j/heya/sodan/1106/02.html), updated 2023. | Officially distinguishes four practical wheat-flour classes by gluten strength. It describes 中力粉 as intermediate in strength and used for udon/Japanese noodles. It gives no numeric class threshold or cross-country equivalence. The same URL is already in the ledger for the separate weak-class review. |
| **WP02-JAPANESE-MEDIUM-WHEAT-20261012-S02** | Japan Flour Milling Promotion Foundation, [小麦粉の加工と製品](https://www.seifun.or.jp/pages/79/). | Explains that the four strength classes are practical milling-company classifications, not public legal definitions or standards, and describes 中力粉’s intermediate gluten strength and Japanese-noodle use. Not a class-wide quantitative specification. |
| **WP02-JAPANESE-MEDIUM-WHEAT-20261012-S03** | Nippn, [ニップン たけ（中力小麦粉）](https://www.nippn.co.jp/products/powder/flour/detail/1194445_2250.html). | Current manufacturer product page names a 1 kg SKU as 中力小麦粉 and lists broad cooking uses, 10 g protein per 100 g, and product-specific package information. This proves a marketed product label, not a universal class specification, measure, or substitute. |
| **WP02-JAPANESE-MEDIUM-WHEAT-20261012-S04** | OQLF, [farine tout usage (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/25796945/farine-tout-usage), updated 2016. | Defines the Canadian all-purpose class as a hard/soft-wheat milling blend, around 12% protein, and states that flour classifications and names differ by country. Québec terminology and class-boundary evidence, not a Japanese crosswalk. |
| **WP02-JAPANESE-MEDIUM-WHEAT-20261012-S05** | OQLF, [farine de blé de force (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357376/farine-de-ble-de-force) and [farine de blé tendre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357375/farine-de-ble-tendre). | Québec entries establish neighboring strong- and soft-wheat terminology and their baking functions. Neither defines a medium-strength Japanese class or attests the proposed French compound. |

## Integration limits

If accepted, integrate only the one identity-only reference and its ledger evidence. Preserve the country/class wording and provisional Québec display. Do not add numeric claims, aliases, forms, conversion/substitution rules, or recipe references. The broader Section A checklist remains open.
