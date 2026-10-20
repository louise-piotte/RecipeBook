# WP02 Section A Japanese strong wheat flour: Québec display and class-boundary hold

- **Review date:** 2026-10-12
- **Status:** Proposal only. No catalog, form, legacy, ledger, recipe, plan, roadmap, or code data changed.
- **Scope:** Japanese strong wheat flour, 強力粉 (*kyōrikiko*), as a separate nationally qualified class adjacent to Japanese medium-strength flour. The latter already has its own Québec naming hold.
- **Proposal-local source prefix:** WP02-JAPANESE-STRONG-WHEAT-20261012-S01 through S10. The prefix, candidate identity, and filename were absent before this review.

## Recommendation

**Hold 強力粉 (*kyōrikiko*) outside the active catalog.** Japanese official and manufacturer sources establish it as a practical Japanese wheat-flour class, but this review found no authoritative Québec French class name or Canadian bilingual package label for the class. A Canadian-facing French product page from the manufacturer-seller Nisshin Seifun Welna calls one specific bread-only flour SKU *farine à pain*; the manufacturer's own page uses the Japanese name *パン専用小麦粉*. Neither page identifies that SKU as 強力粉 or establishes a class-wide French display, and *farine à pain* already belongs to the active bread-flour identity. Keep “Japanese strong wheat flour (kyōrikiko)” as research wording only; it is not a proposed active display. [S09–S10]

Do not map it to the active high-gluten-flour or bread-flour identities. Do not create a generic strong-wheat-flour identity. Revisit the Japanese-qualified boundary when a Québec or Canadian primary label or authoritative terminology source states how this class should be named and whether it is a distinct catalog identity or an alias on an existing row.

Japan’s Ministry of Agriculture, Forestry and Fisheries (MAFF) distinguishes 強力粉 from 準強力粉, 中力粉, and 薄力粉 by gluten strength and typical uses: strong flour is used for bread and gyoza wrappers; semi-strong flour is next strongest and used for Chinese noodles. The Flour Milling Promotion Foundation says these are practical milling-company categories and that Japan has no public flour definitions or standards. This verifies a Japanese class boundary, not a Canadian grade equivalence or a class-wide composition threshold. [S01–S02]

The French terms found do not settle the class mapping. The OQLF’s preferred Québec term *farine de blé de force* describes flour from strong wheat that is rich in gluten and mainly used for bread; that exact phrase already belongs to the active high-gluten-flour row. OQLF also says flour classifications and names vary by country. Federal TERMIUM Plus records generic *farine forte*, but it does not qualify the term as Japanese. Konnichiwa Mart's Canadian-facing French page, whose seller is Nisshin Seifun Welna, calls the product with JAN 4902110341614 *Farine à pain Nissin Verna*. The manufacturer's page for that same JAN calls it *パン専用小麦粉* (bread-only wheat flour), not 強力粉. This supports the French retail name of one bread-use SKU, not a class-wide Québec display or equivalence across 強力粉. In this catalog, *farine à pain* already belongs to the separate bread-flour row. [S05–S07, S09–S10]

## Identity boundary

| Neighbor | Disposition |
|---|---|
| Japanese weak wheat flour, 薄力粉 (*hakurikiko*) | Keep the active **ingredient-ref-japanese-weak-wheat-flour** distinct. Its Japanese class and existing bilingual names are already documented. |
| Japanese medium-strength flour, 中力粉 (*chūrikiko*) | Keep distinct. Its Québec naming review recommends holding it outside the catalog. |
| Japanese semi-strong flour, 準強力粉 (*jun-kyōrikiko*) | Out of scope. MAFF identifies it as a separate class between strong and medium flour. Do not fold it into this candidate. |
| Generic high-gluten flour | Keep the active **ingredient-ref-high-gluten-flour** row. It owns the OQLF term *farine de blé de force*. Japanese “strong” class language does not establish a Canadian product-grade crosswalk. |
| Bread flour | Keep **ingredient-ref-bread-flour** distinct. Its active French name is *farine à pain*. The Canadian-facing French listing for one Nisshin bread-only product is product-specific, and it does not name the broader 強力粉 class. |
| All-purpose flour | Keep **ingredient-ref-all-purpose-flour** distinct. OQLF describes the Canadian class as a hard/soft wheat blend and notes that flour classifications differ among countries. |
| Generic “strong wheat flour” | Do not create a generic row or alias. The high-gluten Québec terminology review already covers the generic strong/high-gluten boundary; this review is limited to the explicitly Japanese class. |

The Japanese class is flour identity terminology, not a preparation form. The national qualifier matters: bare “strong flour,” “bread flour,” “high-gluten flour,” and French equivalents do not preserve the source class or its market context.

## Names, aliases, and picker behavior

No active name or alias is proposed. Do not add Japanese script as an alias under the current picker: IngredientSearch.kt lowercases and accent-folds text, then replaces non-ASCII letters and digits with spaces. The CJK-only query 強力粉 normalizes to an empty key, and an empty key returns the full ingredient catalog. The romanized query *kyōrikiko* normalizes to *kyorikiko*, so romanization could be searchable if a reviewed row is added later.

Picker behavior was checked against the live reference data using the same normalization and phrase-first matching behavior:

| Query | Current result |
|---|---|
| “Japanese strong wheat flour,” “Japanese strong wheat flour (kyōrikiko),” *kyōrikiko*, *kyorikiko* | No references |
| *farine de blé japonaise de force*, *farine forte japonaise* | No references |
| 強力粉 | Empty normalized key; returns all current references |
| *farine de blé de force* | Only **ingredient-ref-high-gluten-flour** |
| *farine à pain*, “bread flour” | Only **ingredient-ref-bread-flour** |
| *farine tout usage*, “all-purpose flour” | Only **ingredient-ref-all-purpose-flour** |
| *hakurikiko*, *farine de blé tendre japonaise* | Only **ingredient-ref-japanese-weak-wheat-flour** |

The available French marketplace wording is not a safe alias. The eBay.ca page is in French and displays “Farine à pain Nisshin camélia … 強力粉,” but identifies the seller’s location as Santa Clara, California. The product title is seller-generated rather than a Québec term entry or bilingual manufacturer label, and the phrase collides with the active bread-flour name. The WAFUU Canadian storefront uses English “strong flour” for a Japanese product but provides no French class label. [S04, S08]

## Ownership audit

Ownership was checked on the live active references, forms, legacy-import identities, and research ledger. Exact phrases were compared after the picker’s lowercase, NFKD accent-folding, and punctuation normalization. The proposed ID, English research wording, romanization, Japanese class string, and candidate French constructions have no exact owner.

| Surface | Finding |
|---|---|
| Active references | No exact owner for **ingredient-ref-japanese-strong-wheat-flour**, “Japanese strong wheat flour,” “strong wheat flour,” *kyōrikiko* / *kyorikiko*, 強力粉, or the French descriptive candidates. The active Japanese weak-flour row is separate. The exact phrase *farine de blé de force* belongs to high-gluten flour; *farine à pain* and “bread flour” belong to bread flour. |
| Forms | The active form file has no exact label or match-term owner for the candidate ID or class terms. No flour form is proposed. |
| Legacy-import identities | No legacy candidate owns the proposed ID or exact candidate wording. |
| Research ledger | No Japanese strong-flour record or candidate ID exists. The Japanese weak-flour record is verified, with measurement state researched_no_supported_value and substitution state researched_no_supported_substitute; its MAFF citation is scoped to the weak class. The high-gluten record has separate OQLF/Ardent Mills evidence for *farine de blé de force*. The bread-flour record and its recipe-specific substitution research remain separate. Do not widen those records or add a ledger entry for this hold. |
| Proposal archive | The Japanese medium-flour materials mention 強力粉/*kyōrikiko* only as a neighboring class; they do not decide its Québec display. The high-gluten review rejects a generic strong-wheat-flour row, but it does not assess this Japanese-qualified class. No standalone Japanese strong-flour review or owner for this proposal prefix was found. |

## Recipe demand

All 114 manifest-listed bundled recipe files and all 1,123 ingredient lines were scanned for the candidate ID, English research wording, romanizations, 強力粉, and French candidates. There were zero text matches and no recipe links for this class.

For boundary context, the only active bread-flour references are two recipe lines: 420 g in recipe 072 and 95 g in recipe 094. They are explicitly linked to **ingredient-ref-bread-flour**; neither line identifies Japanese flour. No recipe link or note should be reassigned from bread flour to this held candidate.

## Data disposition

| Property | Disposition |
|---|---|
| Active ID and display | None. **ingredient-ref-japanese-strong-wheat-flour** is a research candidate only. |
| English / French aliases | None. Keep *kyōrikiko* and *kyorikiko* out of active search until the class display decision is supported; do not add 強力粉 to the current picker. |
| Density and unit mappings | No supported density or volume mapping. If later integrated, leave defaultDensity absent/null and unitMappings empty unless new evidence supports a value. |
| Measurements | No class-wide cup, mass-per-volume, or package-yield value. NIPPN’s 1 kg package and 13 g protein per 100 g describe one product, not a standard for the Japanese class. WAFUU’s Canadian storefront likewise lists a specific 2 kg Japanese product. Do not convert either package size or protein label into a class value. [S03–S04] |
| Forms | None. 強力粉 is a flour class, not a preparation state. |
| Conversions | None. No volume-to-mass mapping, flour-grade crosswalk, or same-ingredient form conversion is supported. |
| Substitutions | None. Product use for bread, pizza, or gyoza is not a tested substitution ratio. Do not infer equivalence to bread flour, high-gluten flour, or all-purpose flour. |
| Recipe links | None. No bundled recipe references this class. |

## Live-package snapshot

Read-only snapshot immediately before writing this proposal on 2026-10-12. Hashes cover exact file bytes. The recipe-corpus digest hashes each manifest-listed relative path, a NUL byte, exact recipe-file bytes, and a trailing NUL byte.

| Surface | Count | SHA-256 / digest |
|---|---:|---|
| Ingredient references | 1,269 | `adb6080896bea039e290a96f8a739978edaa6c6be735efdb128abf10723056ce` |
| Ingredient forms | 94 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| Legacy-import candidates | 65 | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| Research ledger | 1,577 records; 5,566 source entries; 4,602 distinct source IDs; 8 unit conversions | `ef99e27e6fa2713ca6a1659d089b0ca2e044ae9f8f49f8eaa028d61775def7ab` |
| Manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient lines | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` (digest of each listed relative path + NUL + exact file bytes + NUL) |

## Sources

Sources were accessed or rechecked on 2026-10-12.

| ID | Source | Supports | Limit |
|---|---|---|---|
| S01 | [Japan Ministry of Agriculture, Forestry and Fisheries, “小麦粉の種類について教えてください”](https://www.maff.go.jp/j/heya/sodan/1106/02.html) | Defines the four practical Japanese classes by relative gluten strength and use; identifies 強力粉 for bread and gyoza wrappers and 準強力粉 as a separate next-strongest class. | No statutory grade threshold or crosswalk to Canadian flour classes. |
| S02 | [Japan Flour Milling Promotion Foundation, “小麦粉の加工と製品”](https://www.seifun.or.jp/pages/79/) | Says Japan has no public flour definitions or standards and that milling companies practically classify flour by gluten strength and use. | Industry explanation; does not create a Canadian bilingual name or numerical specification. |
| S03 | [NIPPN, “ニップン 強力小麦粉”](https://www.nippn.co.jp/products/powder/flour/detail/1214765_2250.html) | Current manufacturer product uses the class wording 強力小麦粉; lists a 1 kg package, 13 g protein per 100 g, and bread, pizza, and gyoza uses. | Product-specific data, not a class definition, nutrition threshold, density, or recipe conversion. |
| S04 | [WAFUU Canada, “Haruyokoi 100% Japanese Hokkaido wheat strong flour for bread 2kg”](https://wafuu.com/en-ca/products/haruyokoi-100-japanese-wheat-strong-flour-for-bread-2kg-baking-master) | Canadian storefront offers a Japanese “strong flour” product in English; confirms a product boundary worth preserving in lookup research. | Retail listing, not manufacturer terminology or a Québec French label; product-specific package data only. |
| S05 | [OQLF, “farine de blé de force” (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357376/farine-de-ble-de-force) | Preferred Québec French term; definition describes flour from strong wheat, rich in gluten, used mainly for bread, with pizza and some noodles also mentioned. | Does not name 強力粉 or establish that the Japanese practical class is an exact equivalent. The term is already owned by the active high-gluten row. |
| S06 | [OQLF, “farine tout usage” (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/25796945/farine-tout-usage) | Describes Canadian all-purpose as a hard/soft wheat blend and explicitly notes flour classifications and naming vary by country. | Does not provide a Japanese-grade equivalence. |
| S07 | [Translation Bureau, TERMIUM Plus, “strong flour / farine forte”](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=1&index=frt&lang=eng&srchtxt=FARINE+FORTE) | Records the generic English/French term pair and describes strong flour by water absorption and breadmaking. | Not Japanese-qualified and not a Québec product label; do not add *farine forte* as a Japanese alias. |
| S08 | [eBay.ca, seller listing “Farine à pain Nisshin camélia … 強力粉”](https://www.cafr.ebay.ca/itm/265050936228) | Shows one French-language marketplace title for a Japanese 強力粉 product. | Seller-authored listing; seller location is California. Its use of *farine à pain* does not establish a Québec term or equivalence, and the phrase already maps to bread flour. |
| S09 | [Konnichiwa Mart, “Farine à pain Nissin Verna 2kg x 6 sachets”](https://konnichiwa.ca/fr/products/a415-152) | Canadian-facing French product page for JAN 4902110341614; lists Nisshin Seifun Welna as seller and the French title *Farine à pain*. | Specific SKU only. Its listing does not name 強力粉 or establish the class-wide French term; *farine à pain* already belongs to the bread-flour identity. |
| S10 | [Nisshin Seifun Welna, “日清 パン専用小麦粉”](https://www.nisshin-seifun-welna.com/index/products/4902110341614.html) | Manufacturer page for the same JAN 4902110341614; describes a bread-only flour with more/stronger gluten than Camellia. | Product-specific bread-use name; it does not label the SKU 強力粉 or provide a Québec French class mapping. |

All unsupported class-wide values and crosswalks remain absent. This is a proposal-only naming hold; no test or implementation change was required.
