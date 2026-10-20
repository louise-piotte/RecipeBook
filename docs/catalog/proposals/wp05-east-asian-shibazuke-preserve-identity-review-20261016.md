# WP05 / WP06 East Asia: shibazuke preserve identity review

- **Review date:** 2026-10-16.
- **Packet type:** proposal only; this file is the only write in this review.
- **Plan owner:** WP05 Japanese preserved condiments, with supporting WP06 East Asia regional coverage.
- **Recommendation:** Add one identity-only `ingredient-ref-shibazuke` reference, displayed as `shibazuke` in both English and fr-CA, in `SAUCE_AND_CONDIMENT`, with only the source-attested English spelling alias `shiba-zuke`.
- **Scope limit:** This is a distinct, source-named Kyoto pickle. The reviewed sources describe regional, household, and product variations; they do not establish one universal ingredient formula or process.

WP05 leaves “other regional Japanese preserved condiments” open, and WP06 says regional preserves and other East Asian cuisine gaps remain open in its China/Taiwan/Hong Kong/Japan/Korea/Mongolia sweep ([plan, Japanese preserve checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L7261); [plan, WP06 East Asia](../../RecipeBook-global-ingredient-catalog-plan.txt#L7658)). MAFF identifies shibazuke as a Kyoto pickle, and a Québec product directory lists an item tied to a Delson fermentation company under the borrowed name `Shibazuke`. This supports one narrow identity review. The Québec item’s formula is product-specific and differs from the traditional MAFF examples; it is not used to redefine the named Kyoto preserve.

## Live snapshot and ownership audit

Snapshot captured from the shared checkout on 2026-10-16. File hashes cover exact file bytes. The recipe-corpus digest hashes each manifest-relative recipe path, a NUL byte, the exact recipe bytes, and a trailing NUL byte, in manifest order.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,595 references | `999088c56419aeb84bd95b022715de9b26a7126be3158c2ede8ac59d0e885392` |
| `ingredient-forms.v1.json` | 122 forms | `d8fcce3554d3dab0f972f045231292ac61da2b6df62045481095ac3443129cc1` |
| `legacy-import-identities.v1.json` | 61 candidates | `bf1a780527e26e90526f6d579096b67e8b82cbbbd764ce1ced650c2d9c9a0a14` |
| `research-ledger.v1.json` | 1,940 records; 8,388 source entries; 7,128 distinct source IDs | `b577938bc7c4255efbbb74eec2c776fdb98d253e8acf95ac6998941174629589` |
| `manifest.v1.json` | 114 recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143` |

Exact and variant-term searches found no `shibazuke`, `shiba-zuke`, `nama shiba-zuke`, `しば漬`, or `紫葉漬` owner in active references, forms, legacy candidates, or ledger records. No proposed ID owner was found. The nearest active references are separate products: `ingredient-ref-takuan`, `ingredient-ref-takana-zuke`, `ingredient-ref-umeboshi`, `ingredient-ref-beni-shoga`, `ingredient-ref-pickled-radish`, and `ingredient-ref-pickled-mustard-greens`. Before drafting this packet, the source-ID prefix `WP05-JP-SHIBAZUKE-20261016-S` was absent from the existing ledger and catalog documents; the four source IDs below are local to this proposal.

The scan covered all ingredient rows in the 114 manifest-listed recipe files and searched each row’s `originalText`, `ingredientName`, and `ingredientRefId`. **No exact row matched** the proposed term or the checked Japanese, romanized, and descriptive variants. No recipe link or relink is proposed. MAFF’s regional usage and the Québec product listing below are external culinary and market evidence, not bundled-recipe demand.

## Proposed reference

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-shibazuke` |
| `nameEn` | `shibazuke` |
| `nameFr` | `shibazuke` |
| Category | `SAUCE_AND_CONDIMENT` |
| English aliases | `shiba-zuke` |
| French aliases | None |
| Density / unit mappings / forms | None |
| Recipe links / conversions / yields / substitutions | None |

The Québec French-language product record uses `Shibazuke` as the name and adds the descriptor `Pickle de aubergine`; the English-language record says `Eggplant pickle`. These are names on one Québec product record, whose data come from GS1, not a standardized French term or a reliable alias for every eggplant pickle. Retaining the borrowed name in both display fields is the source-supported, narrow choice. Do not store the descriptive phrase as an alias.

MAFF documents shibazuke as a Kyoto preserve eaten with rice or as a snack. Its Kyoto regional source names shiso, cucumber, eggplant, and myoga among associated ingredients and notes home/region recipe variation. Its Kyo-tsukemono overview distinguishes shiba-zuke from other named Kyoto pickles and describes `nama shiba-zuke` as a particular salt-only, lactic-fermented style. A local Québec producer’s GS1-listed item is described as eggplant with lacto-fermented ginger and spices. These differences support the product name while ruling out a single global recipe formula. No components, fermentation state, preparation form, measure, or preservation instruction is encoded in the proposed row.

## Candidate dispositions and boundaries

| Candidate or term | Disposition | Boundary and next action |
|---|---|---|
| `shibazuke` | **Proposed identity** | Add only the named Kyoto preserve identity above. Keep the borrowed term in both language fields; add no alias beyond the source-attested English spelling variant in the next row. [S01–S04] |
| `shiba-zuke` | **Alias/variant** | MAFF uses this hyphenated romanization. The catalog search normalizer converts the hyphen to a word boundary, so `shiba-zuke` does not normalize to `shibazuke`; add this exact English search alias, supported by the official MAFF spelling. [S02] |
| `nama shiba-zuke` | **Alias/variant** | MAFF names this as a particular shibazuke style, not a different parent ingredient. Keep the qualifier as a source-documented style note only; do not add a separate row or alias. [S02] |
| `紫葉漬け` / `むらさきはづけ` | **Alias/variant, not activated** | The Japanese MAFF page gives this spelling/pronunciation in its account of the product name’s origin. That historical naming passage does not establish a current Québec search alias. Keep it in the source notes only. [S01] |
| `Eggplant pickle` / `Pickle de aubergine` | **Identity/compound** | These are descriptors on the single Québec GS1 product record. They do not make generic eggplant pickles synonyms of shibazuke. Do not add either as an alias. [S03] |
| `Kyo-tsukemono`, `Kyoto pickles`, generic `tsukemono` / Japanese pickles | **Identity/compound** | MAFF presents Kyoto pickles as a broad family of distinct named products. Do not use the family name or generic pickle wording as an alias of shibazuke. [S02] |
| `senmai-zuke`, `suguki-zuke`, `nanohana-zuke`, and `Kyoto mibuna-zuke` | **Unresolved/hold** | MAFF lists these as other distinct Kyoto pickles. Their local product naming and Québec display were not reviewed here; keep them for separate candidate reviews. In particular, do not map Kyoto mibuna-zuke to the active raw `mibuna` identity. [S02] |
| `takuan`, `takana-zuke`, `umeboshi`, `beni shoga`, generic pickled radish, and generic pickled mustard greens | **Already covered** | Retain their existing active references and boundaries. None is an alias or form of shibazuke. [live seed; WP05 reviews and integration batches] |
| `rakkyo`, `fukujinzuke`, and Hakka `mei gan cai` | **Unresolved/hold; separately proposed and excluded** | Each has a distinct 2026-10-16 proposal under review. This packet does not reconsider or merge those candidates. |
| Fresh eggplant and cucumber | **Already covered** | Keep the active raw `ingredient-ref-eggplant` and `ingredient-ref-cucumber` rows separate from the prepared shibazuke product. They are not aliases or forms of the preserve. [live seed] |
| Fresh shiso/perilla leaves and myoga | **Unresolved/hold; outside this preserve review** | The MAFF pages name these as source-specific preserve components, but the live seed has no fresh shiso/myoga identity (the separate perilla-seed row does not cover fresh leaves). Keep the source mentions as component evidence only and review fresh products separately with Québec display evidence. [S01–S02; live seed] |

The English and Japanese MAFF sources characterize the traditional product through shiso/perilla and vegetables; the Québec record’s product description and ingredient list apply only to that producer’s item. Do not infer a universal ingredient list, process, nutrition value, refrigerated storage rule, shelf life, serving size, or recipe substitution from that single SKU. The Québec directory itself states that MAPAQ is not responsible for the product-record accuracy.

## Source register

All sources below were accessed on 2026-10-16. The claims are paraphrased; product-specific details remain product-specific.

| ID | Source | Supports and limits |
|---|---|---|
| `WP05-JP-SHIBAZUKE-20261016-S01` | Japan Ministry of Agriculture, Forestry and Fisheries (MAFF), [しば漬け 京都府 — Our Regional Cuisines](https://www.maff.go.jp/j/keikaku/syokubunka/k_ryouri/search_menu/menu/shibazuke_kyoto.html). | Official Kyoto regional source names the product `しば漬け (しばづけ)`, gives Kyoto City as a main transmission region, lists shiso, cucumber, eggplant, and myoga among associated ingredients, describes its sour purple character and use with rice/snacks, and notes regional/home recipe variation. Its displayed recipe is one local recipe, not a standard formula. |
| `WP05-JP-SHIBAZUKE-20261016-S02` | MAFF, [Kyo Tsukemono — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/menu/kyo_tsukemono.html). | Identifies shiba-zuke as an Ohara specialty within a broader Kyoto-pickle family; distinguishes several named products; describes common red-perilla/cucumber or myoga products and a specific nama shiba-zuke style. This does not establish every commercial product’s ingredients or formula. |
| `WP05-JP-SHIBAZUKE-20261016-S03` | Répertoire des aliments québécois, [Shibazuke — Pickle de aubergine](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8202277) (French-language product record). | Lists a Delson, Montérégie producer’s food-service item as `Shibazuke - Pickle de aubergine`; the description and ingredient list refer to that product only. The record identifies GS1 as its data source and includes a MAPAQ accuracy disclaimer. It supports local use of the borrowed product name, not a universal shibazuke formula or standardized French equivalent. |
| `WP05-JP-SHIBAZUKE-20261016-S04` | Suzuya Japanese Market, Burnaby, [Pickles (漬物)](https://suzuya.ecwid.com/Pickles-%E6%BC%AC%E7%89%A9-c125287887). | Current Canadian Japanese-grocery listing includes `NIITAKA Shibazuke Pickled`. The store separately reports nationwide Canada Post shipping with perishables excluded; the page does not say whether this item qualifies for shipping. This supports Canadian retail use of the borrowed product name, not Québec terminology. |

## Prior-review reconciliation and next action

The WP05 Japanese-condiment review integrated yuzu kosho, umeboshi, and beni shoga; later WP05 Section W integration added takuan and takana-zuke. It explicitly left broader regional Japanese-preserve coverage open. The WP06 East Asia sweep also routed further regional preserves to WP05. This proposal adds only the separately named shibazuke candidate and keeps the broader checklist open. See the [Japanese condiment boundary review](wp05-japanese-condiments-boundary-review-20261010.md), [Japanese condiment integration batch](../batches/wp05-japanese-condiment-identities-integration-20261010/README.md), [Section W regional-preserve boundary review](wp05-section-w-regional-preserved-vegetable-boundary-review-20261012.md), and [WP06 East Asia gap sweep](wp06-east-asia-cuisine-gap-sweep-20261011.md).

If accepted, integrate only `ingredient-ref-shibazuke`, the single English spelling alias `shiba-zuke`, and the four records above. Keep French aliases, forms, numeric behavior, recipe links, conversions, yields, and substitutions empty. Recheck the shared seed, ledger, source-ID namespace, and recipe corpus at integration time. No shared catalog, ledger, recipe, plan, roadmap, code, or test file was changed for this proposal; no tests, builds, emulator checks, or deployment were run.
