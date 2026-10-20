# WP05 Section W — Korean kimchi types and jeotgal boundary review

- **Packet type:** research review with root integration recorded below.
- **Reviewed/source access date:** 2026-10-12.
- **Scope:** remaining Section W questions for named kimchi types, fermented shrimp, and other jeotgal; checked against the live plan, references, forms, legacy candidates, ledger, related WP05 reviews/integrations, and all 114 manifest-listed recipes.
- **Decision:** integrated identity-only references for `kkakdugi` and Korean `saeu-jeot`. Other named kimchi types remain open pending exact Québec/Canadian French product naming; generic fermented shrimp and unqualified `jeotgal` remain held because they cover distinct products and forms. Fish sauces, shrimp pastes, and regional ferments remain separate.
- **Integration:** root added two references and their ledger evidence, updated the Section W plan and roadmap, and wrote `docs/catalog/batches/wp05-section-w-korean-kimchi-jeotgal-integration-20261012/README.md`. No recipe data, forms, or numeric behavior changed. No tests were run because the changes only add database JSON data.

## Proposed identities

| Proposed ID | English display | Proposed fr-CA display | Aliases | Category | Supported scope |
|---|---|---|---|---|---|
| `ingredient-ref-kkakdugi` | `kkakdugi` | `kkakdugi` | EN: `cubed radish kimchi`; FR: `kimchi de radis coupés en dés` | `SAUCE_AND_CONDIMENT` | The named Korean kimchi made with radish cut into cubes and fermented with seasonings. The English and French wording is present on a Canadian seller’s product pages. This is one named type, not a synonym for all radish kimchi. [S03–S04] |
| `ingredient-ref-saeu-jeot` | `saeu-jeot (salted shrimp)` | `saeu-jeot (crevettes coréennes fermentées au sel)` | EN: `saeujeot` | `SAUCE_AND_CONDIMENT` | Korean salt-fermented small shrimp (새우젓), kept under the official romanized Korean name. `Salted shrimp` is an official English gloss and a Montréal retail label; the French parenthetical is a descriptive translation, not an OQLF-preferred term. This is not generic shrimp paste or liquid fish sauce. [S05–S10] |

The `kkakdugi` English and French aliases reproduce the Canadian seller’s descriptors. Do not add broad aliases such as `radish kimchi`, `kimchi`, or `pickled radish`: they would erase the named cut/style or confuse it with other radish preserves. Retain the current generic `kimchi` reference and its OQLF-listed spelling aliases unchanged. [S01, S03–S04]

For `saeu-jeot`, retain the Korean name in both displays. The parenthetical French identifies the product but is a transparent catalog translation from the official Korean description, not a claim that Québec terminology authorities have standardized a product name. Do not add `shrimp paste`, `shrimp sauce`, `fish sauce`, or `fermented shrimp` as aliases. The available sources establish one exact Korean product class, not a cross-regional shrimp-preserve synonym. [S05–S12]

## Identity boundaries and holds

| Product or term | Evidence and current owner | Disposition |
|---|---|---|
| Generic `kimchi` | Active `ingredient-ref-kimchi` (`kimchi / kimchi`); OQLF defines the generic Korean preparation as seasoned, fermented vegetables served as an accompaniment, and lists its accepted French/English spellings. [S01] | Keep as the generic prepared fermented-vegetable identity. Do not attach named varieties as aliases. |
| `kkakdugi` | Soora Canada’s French page labels the product `Kkakdugi` and `Kimchi de radis coupés en dés`; its English page calls it `Kkakdugi (Cubed Radish Kimchi)` and describes cubed Korean radish and fermentation. [S03–S04] | Propose the narrow identity above. Keep separate from generic kimchi, fresh radish/daikon, and salt-and-vinegar `pickled radish`. The product page describes one seller’s recipe, not a universal ingredient list. |
| Other named kimchi types | MAFRA’s English site names baechu (kimchi/napa cabbage), chonggak (whole-radish), and gat (leaf-mustard) kimchi as different types. Its examples are not a complete taxonomy and do not provide a Québec French display for each. [S02] | Hold these and other named types for exact product and locale review. Do not add them as aliases to generic kimchi or as generic forms. |
| Broad `fermented shrimp` | The phrase can describe multiple salted, fermented, seasoned, ground, or liquid shrimp products. MFDS defines a broad salted-and-fermented-seafood class using several animal groups and product types. [S05–S06] | Do not create a generic fermented-shrimp identity. Use an exact regional/product name such as `saeu-jeot` only when the source identifies that class. |
| Korean `saeu-jeot` | NIKL’s Korean-English dictionary defines 새우젓 as jeotgal made from small white shrimp preserved in salt and gives `salted shrimp`; NIKL’s romanization entry gives `saeu-jeot`. A Montréal Korean grocery lists a product as `WANG Salted Shrimp` with the Korean name 새우젓. [S07–S10] | Propose the named identity, with the French descriptive wording clearly marked as a translation. Keep distinct from shrimp-paste products, regional fish/shrimp pastes, and fish-sauce liquids. No general `salted shrimp` alias is proposed outside this Korean name/context. |
| Generic `jeotgal` / `jeotkal` | MFDS uses 젓갈류 as a broad processed-seafood category. Its current product types include salted-fermented seafood, seasoned salted-fermented seafood, liquid products separated from the fermented seafood, and other preparations. [S05–S06] | Hold as a generic catalog ingredient. It names a broad category, not a single ingredient with one substrate or form. Do not map it to fish sauce or shrimp paste. |
| Other named jeotgal, including myeolchi-jeot | NIKL and the Korean official food-name table give item names such as `myeolchi-jeot` (salted anchovies) and `saeu-jeot` (salted shrimp); these identify different seafood substrates. [S07–S08, S13] | Keep additional named jeotgal open for one-by-one Canadian/Québec label and recipe-demand review. Do not alias salted anchovies to active plain `anchovy`, anchovy paste, or fish sauce. |
| Fish sauce / liquid seafood seasonings | Active `ingredient-ref-fish-sauce` is `fish sauce / sauce de poisson`, with its current narrow regional aliases including `patis`. The two recipe rows below explicitly request this generic liquid. Existing catalog entries also distinguish `pla ra`, `padaek`, and other regional fish sauces. [S05–S06] | Keep liquid fish sauces separate from solid/semi-solid salted-fermented seafood and from saeujeot. No `jeotgal`, `saeu-jeot`, or shrimp-sauce alias is proposed on fish sauce. |
| Regional shrimp/fish pastes | Active identities include `kapi`, `belacan`, `terasi`, `bagoong alamang`, `bagoong isda`, and `prahok`; broad Myanmar `ngapi` remains a `candidate-ngapi` record with `needs_clarification`. Their existing records document regional scopes. | Keep each named product as currently recorded. Do not merge any into `saeu-jeot`, generic jeotgal, or fish sauce; do not infer substitution from shared saltiness or fermentation. |
| Japanese and sweet Korean-style radish preserves | Active `ingredient-ref-takuan` and `ingredient-ref-pickled-radish` already have their bounded identities. The earlier Section W review keeps named kimchi types distinct from generic vinegar pickles. [S11–S12] | Keep takuan, sweet yellow pickled radish products, wrapping-radish products, and kkakdugi distinct. Do not use generic `pickled radish` or `takuan` as aliases for kkakdugi. |

## Exact-name ownership and recipe demand

The exact-key audit used the project’s case-insensitive, NFKD/accent-folding, punctuation-normalizing search-key behavior across active reference names and aliases, all form labels and match terms, and legacy candidate names and aliases. Candidate IDs were checked against those files and ledger record IDs.

| Exact name/key family | Current owner | Result |
|---|---|---|
| `kimchi`; `kim chi`; `kim chee`; `kimchee` | `ingredient-ref-kimchi` owns the generic display and OQLF-supported aliases (French aliases include `kim chi`). | Existing generic identity remains unchanged; named types are not added as aliases. |
| `kkakdugi`; `cubed radish kimchi`; `kimchi de radis coupés en dés` | None in current reference, form, or legacy name/alias fields. No `ingredient-ref-kkakdugi` ID exists. | Proposed identity and the two narrow aliases are available. |
| `baechu kimchi`; `chonggak kimchi`; `gat kimchi` | No exact owner beyond generic `ingredient-ref-kimchi`; none appears as a separate reference, form, or legacy name/alias. | Hold as separate type candidates; do not assign their names to generic kimchi. |
| `saeu-jeot`; `saeujeot`; `salted shrimp`; `fermented shrimp`; `jeotgal`; `jeotkal` | None in current reference, form, or legacy name/alias fields. No `ingredient-ref-saeu-jeot` or `ingredient-ref-jeotgal` ID exists. | Proposed exact Korean identity is available; broad `fermented shrimp` and `jeotgal` stay held. |
| `myeolchi-jeot`; `salted anchovies` | None as an exact active reference, form, or legacy name/alias. The active plain anchovy reference does not own either full phrase. | Hold for a separate bilingual product review; do not alias to plain anchovy, anchovy paste, or fish sauce. |
| `fish sauce`; `sauce de poisson`; `patis` | `ingredient-ref-fish-sauce`. | Keep the existing exact owner and narrow aliases. Do not redirect either recipe line or use it as a jeotgal crosswalk. |
| `pickled radish`; `radis mariné`; `takuan` | `ingredient-ref-pickled-radish`; `ingredient-ref-takuan`. | Preserve both current product boundaries; neither owns kkakdugi. |
| `kapi`; `belacan`; `terasi`; `bagoong alamang`; `bagoong isda`; `prahok`; `pla ra`; `padaek` | Corresponding active region-specific references. `ngapi` remains a ledger candidate, not a reference. | Keep current exact product identities and the unresolved `ngapi` candidate. No aliases or substitutions are added. |

The manifest lists **114 recipe files** and the current package contains **1,123 ingredient rows**. A case-, punctuation-, and accent-folded scan of every manifest-listed recipe JSON file, including ingredient fields and prose, found **zero** mentions of `kkakdugi`, `cubed/diced radish kimchi`, `saeu-jeot`, `saeujeot`, `salted shrimp`, `fermented shrimp`, `jeotgal`, `myeolchi-jeot`, or the reviewed named kimchi types. There is no exact recipe demand or recipe link for either proposed identity.

The only matching seafood condiment rows are existing generic fish-sauce requests:

| Recipe | Ingredient row | Current text and owner | Disposition |
|---|---|---|---|
| 093, Fried Rice | `2a2a7481-b5dc-45a5-9733-e3885d682131-ingredient-6` | `2 tbsp fish sauce` → `ingredient-ref-fish-sauce` | Keep generic fish sauce. |
| 095, Satay | `9ec0ba36-1f7e-47d0-aedc-22ca03a5c672-ingredient-5` | `1 tbsp fish sauce` → `ingredient-ref-fish-sauce` | Keep generic fish sauce; the recipe title and amount do not establish a Korean or regional seafood preserve. |

The exact-key scan found no candidate name, alias, form, or legacy collision for either proposed ID or its proposed display/aliases. The ledger has a verified `ingredient-ref-kimchi` record sourced to the OQLF kimchi entry; existing jeotgal-adjacent entries are region-specific paste/sauce records plus unresolved `candidate-ngapi`. No ledger record currently assigns identity, measurement, or substitution behavior to `kkakdugi`, `saeu-jeot`, or generic `jeotgal`.

## Numeric data, forms, and substitutions

For both proposed identity-only rows, keep `defaultDensity: null` and `unitMappings: []`. Add no ingredient forms, package-yield relationships, conversions, or cooking-measure values. The Soora kkakdugi page’s 1 kg listing and Marché Korea’s 500 g salted-shrimp SKU are package sizes for named retail items, not general measures or yields. No recipe lines request either item.

Do not encode a substitution between generic kimchi and kkakdugi, between kkakdugi and salt-and-vinegar pickled radish/takuan, or between saeujeot and liquid fish sauce, anchovy paste, or any regional shrimp/fish paste. Fermentation, seafood origin, saltiness, shared seasoning use, and one product’s formulation do not establish a global replacement or ratio. No substitution is proposed.

## Sources

The proposal-local source prefix `WP05-W-KIMCHI-JEOTGAL-20261012-S##` had no prior match in the current catalog documents or ledger before this file was written.

| Source ID | Source | Claim supported and limit |
|---|---|---|
| `WP05-W-KIMCHI-JEOTGAL-20261012-S01` | Office québécois de la langue française, [kimchi (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529902/kimchi), accessed 2026-10-12. | Defines generic kimchi and provides preferred French and English spellings. Supports the active generic identity and its narrow alias boundary, not named type names. |
| `WP05-W-KIMCHI-JEOTGAL-20261012-S02` | Republic of Korea Ministry of Agriculture, Food and Rural Affairs, [“Kimchi will lead the K-Food trend in Malaysia!”](https://www.mafra.go.kr/bbs/english/25/566510/artclView.do?layout=unknown), accessed 2026-10-12. | Official English naming for baechu (napa cabbage), chonggak (whole radish), and gat (leaf mustard) kimchi. The article is an example list, not a complete taxonomy or Québec French terminology source. |
| `WP05-W-KIMCHI-JEOTGAL-20261012-S03` | Soora Canada, [Kkakdugi (French product page)](https://soora.ca/fr/produit/kkakdugi/), accessed 2026-10-12. | Québec/Canadian French product wording `Kkakdugi` and `Kimchi de radis coupés en dés`; describes diced Korean radish, fermentation, seasoning, and one 1 kg product. It is one seller’s product description, not a universal recipe. |
| `WP05-W-KIMCHI-JEOTGAL-20261012-S04` | Soora Canada, [Kkakdugi (English product page)](https://soora.ca/product/kkakdugi/), accessed 2026-10-12. | Parallel English wording `Kkakdugi` and `Cubed Radish Kimchi`; confirms the same product-class description. It does not establish numeric measures or substitutions. |
| `WP05-W-KIMCHI-JEOTGAL-20261012-S05` | Ministry of Food and Drug Safety / Food Safety Korea, [Food Standards and Specifications, 20-2 젓갈류](https://www.foodsafetykorea.go.kr/popup/safefoodlife/food/foodRvlv/foodRvlvDetail.do?rvlv_no=46), accessed 2026-10-12. | Current Korean official standard defines the broad jeotgal seafood-processing class and distinguishes salted-fermented items, seasoned items, and liquid products. The class is wider than shrimp and is not one generic ingredient identity. |
| `WP05-W-KIMCHI-JEOTGAL-20261012-S06` | Ministry of Food and Drug Safety, [Article 5: Standards and Specifications for Each Food Product (English translation)](https://www.mfds.go.kr/files/upload/eng/Article_5._Standards_and_Spefications_for_Each_Food_Product.pdf), accessed 2026-10-12. | Government English rendering of the salted-and-fermented-seafood category, its broad fish/crustacean/mollusk/echinoderm scope, and product types including liquid separated products. The current Korean Food Code in S05 is the primary current text. |
| `WP05-W-KIMCHI-JEOTGAL-20261012-S07` | National Institute of Korean Language, [Basic Korean-English Dictionary entry for 새우젓](https://krdict.korean.go.kr/m/eng/searchResult?ParaWordNo=62690&currentPage=4&exaType=&font_size=12&mainSearchWord=%EC%83%88&nation=eng&nationCode=6&proverbType=&searchType=W&sort=W&viewType=A&wordMatchFlag=N), accessed 2026-10-12. | Defines the product as jeotgal made from small white shrimp preserved in salt and gives the English gloss `salted shrimp`. It does not establish a Québec French product term. |
| `WP05-W-KIMCHI-JEOTGAL-20261012-S08` | National Institute of Korean Language, [Romanization entry for 새우젓](https://www.korean.go.kr/front/roman/romanView.do?mn_id=98&pageIndex=1&roman_seq=12853), accessed 2026-10-12. | Gives the official romanization `saeu-jeot`; supports using that form as the primary borrowed name. |
| `WP05-W-KIMCHI-JEOTGAL-20261012-S09` | Korea Agro-Fisheries & Food Trade Corporation, K-Food Trade, [“E-Commerce / Korean Spicy Taste, Gochutgaru”](https://www.k-foodtrade.or.kr/brd/m_139/view.do?seq=513), accessed 2026-10-12. | Uses the unhyphenated spelling `Saeujeot` with the gloss `salted shrimp` and describes it as a kimchi ingredient. Promotional context; supports a spelling variant, not a recipe measure or replacement ratio. |
| `WP05-W-KIMCHI-JEOTGAL-20261012-S10` | Marché Korea, Montréal, [WANG Salted Shrimp / 동백하 새우젓, 500 g](https://marchekorea.com/shop/wang-salted-shrimp-%EB%8F%99%EB%B0%B1%ED%95%98-%EC%83%88%EC%9A%B0%EC%A0%93-500g/), accessed 2026-10-12. | Current Montréal retail listing pairs `Salted Shrimp` with the Korean name 새우젓. It supplies no French product title; 500 g is SKU packaging only. |
| `WP05-W-KIMCHI-JEOTGAL-20261012-S11` | Office québécois de la langue française, [crevette (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198913/crevette), accessed 2026-10-12. | Supports the Québec French noun `crevette` for English `shrimp`; it does not name or define saeujeot. |
| `WP05-W-KIMCHI-JEOTGAL-20261012-S12` | Office québécois de la langue française, [fermentation (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2088400/fermentation), accessed 2026-10-12. | Supports the Québec French food-process term `fermentation`; it does not provide a product-specific name for saeujeot. |
| `WP05-W-KIMCHI-JEOTGAL-20261012-S13` | National Institute of Korean Language, [Standard Romanization and Translation of 200 Major Korean Food Names](https://www.korean.go.kr/common/download.do%3Bfront%3D691C836ACDEDE5A35426F3A54B4AAF1B?c_file_name=f9b97f04-a549-4fb7-9da2-892c599bb06c.pdf&file_path=notice&o_file_name=140502_%ED%95%9C%EC%8B%9D%EB%AA%85_%EB%A1%9C%EB%A7%88%EC%9E%90_%ED%91%9C%EA%B8%B0_%EB%B0%8F_%ED%91%9C%EC%A4%80_%EB%B2%88%EC%97%AD_%ED%99%95%EC%A0%95%EC%95%88_.pdf), accessed 2026-10-12. | Lists `Myeolchi-jeot / Salted Anchovies` and `Saeu-jeot / Salted Shrimp`; supports these as separately named Korean products and English glosses, not a French equivalent. |

## Package snapshot before integration

Snapshot captured from the shared checkout before root integration on 2026-10-12. It is retained as the review baseline and does not describe the current package. Hashes cover exact file bytes. The recipe-corpus digest hashes each manifest-relative recipe path, a NUL byte, the exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Current count/state | SHA-256 or corpus digest |
|---|---:|---|
| Git HEAD | `0caaef893ebd9e12` | — |
| `ingredient-references.v1.json` | 1,197 references | `4d12c120489d6076127f3b797f439ebdafbe8b1db4706c46b8c6467b8b699be1` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,499 records; 5,048 source entries; 4,118 distinct source IDs | `4fcb1fc52a2387b821f5293945576d337a2e01b7e60082fea5b3816241e0ea89` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |

The full exact-name and recipe-demand audit remains here as review evidence. Root integrated the two accepted identities; the current counts and hashes are recorded in `docs/catalog/batches/wp05-section-w-korean-kimchi-jeotgal-integration-20261012/README.md`. Remaining Section W product families stay open for separate exact-name and locale review.
