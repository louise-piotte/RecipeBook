# WP05 East Asian preserve gap — Japanese rakkyo review

- **Packet type:** proposal only; no catalog or ledger integration performed.
- **Review and source-access date:** 2026-10-16.
- **Scope:** one unresolved Japanese preserve under the open WP05 Section W item for “other regional Japanese preserved condiments.” Rechecked the live references, forms, legacy candidates, research ledger, all manifest-listed recipes, and prior East Asian reviews before selecting it.
- **Recommendation:** add one identity-only `rakkyo / rakkyo` reference for the Japanese pickled mature-bulb product. Use the borrowed name in both locales, with no aliases. Keep raw rakkyo, raw shallots, green onions, generic pickled onions, and other named Japanese pickles distinct.
- **Write scope:** this proposal file only. No catalog, ledger, recipe, plan, roadmap, code, or test file was edited. No tests or emulator checks were run.

## Live snapshot

The snapshot was refreshed on 2026-10-16. The recipe digest sorts manifest-listed paths and hashes each relative path, a NUL byte, exact file bytes, and a trailing NUL byte.

| Artifact | Current count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,595 references | `999088c56419aeb84bd95b022715de9b26a7126be3158c2ede8ac59d0e885392` |
| `ingredient-forms.v1.json` | 122 forms | `d8fcce3554d3dab0f972f045231292ac61da2b6df62045481095ac3443129cc1` |
| `legacy-import-identities.v1.json` | 61 candidates | `bf1a780527e26e90526f6d579096b67e8b82cbbbd764ce1ced650c2d9c9a0a14` |
| `research-ledger.v1.json` | 1,940 records; 8,388 source entries; 7,128 distinct source IDs | `b577938bc7c4255efbbb74eec2c776fdb98d253e8acf95ac6998941174629589` |
| `manifest.v1.json` | 114 recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143` |

The proposed ID `ingredient-ref-rakkyo` is absent from references, forms, legacy candidates, and the ledger. Exact rakkyo spellings are absent from the current recipe corpus. The new source-ID prefix `WP05-JP-RAKKYO-20261016` is absent from existing proposal/batch files and the live ledger. The target proposal path was absent before drafting.

## Reconciliation and candidate dispositions

| Candidate or term | Disposition | Decision and next action |
|---|---|---|
| Japanese rakkyo pickle | **Proposed identity** | Add `ingredient-ref-rakkyo`, EN `rakkyo`, fr-CA `rakkyo`, category `SAUCE_AND_CONDIMENT`, no aliases, null density, and no unit mappings. Limit the identity to the preserved mature-bulb product. MEXT distinguishes raw mature and immature bulbs from the sweetened pickle product; MAFF’s regional records document pickling as a Japanese preserved food. [S01–S04] |
| Raw mature or immature rakkyo bulb | **Identity/form boundary** | Do not use this preserve row for a recipe explicitly requiring raw rakkyo. The national food composition source lists raw mature and immature bulbs separately from the sweetened pickle. Any raw-rakkyo identity requires its own category and naming review. [S01–S02] |
| `pickled scallion`, `pickled shallot`, `Japanese shallot` | **Alias/variant; excluded** | These are source-specific English descriptors, not safe global aliases. MEXT’s classification distinguishes rakkyo from the English “shallot” plant; a Montreal French product listing uses only the borrowed product name. Keep these descriptors out of both alias arrays. [S02, S05] |
| Generic pickled onions / `oignon au vinaigre` / `oignon mariné` | **Unresolved/hold** | The ledger still has `candidate-pickled-onions` in `needs_clarification`, with a decision to wait for exact demand. Do not add these broad terms to rakkyo. Its species and Japanese product context are narrower. [existing ledger sources `WP05-PRESCOND-20261010-S05`–`S06`] |
| Onion, pearl onion, shallot, and green onion | **Already covered** | Preserve `ingredient-ref-onion`, `ingredient-ref-pearl-onion`, `ingredient-ref-shallot`, and `ingredient-ref-green-onions`. In particular, `scallion` is already a green-onion alias and `shallot` is a separate fresh identity; neither becomes an alias of rakkyo. [existing seed; `WP03-J-GREEN-ONIONS-20261011-S01`; `WP03-J-PEARL-SPRING-BOUNDARY-20261011-S01`–`S04`] |
| Takuan, takana-zuke, beni shoga, umeboshi, pickled radish, and pickled mustard greens | **Already covered** | Retain their current separate identities and boundaries. This proposal adds no new alias to these references and does not treat `rakkyo` as generic Japanese pickle wording. See the existing [Japanese condiment review](wp05-japanese-condiments-boundary-review-20261010.md), [takuan integration](../batches/wp05-section-w-takuan-integration-20261012/README.md), and [preserved-mustard integration](../batches/wp05-section-w-regional-preserved-vegetable-integration-20261012/README.md). |
| Japanese `gari` | **Alias/variant; excluded** | Keep it out of `ingredient-ref-gari`, whose active identity is West African cassava. The Japanese ginger product remains without an alias until a separate review resolves the name collision and fr-CA wording. [Japanese condiment review, cited above] |
| Other Japanese preserves and the broader WP05 East Asian checklist | **Unresolved/hold** | This focused review does not reopen generic tare, Japanese mayonnaise, Chinese preserved vegetables, unqualified fermented bean curd, or generic sesame paste. Preserve each prior proposal’s hold and follow-up owner; do not mark Section W or WP05 complete. The earlier [WP06 East Asia sweep](wp06-east-asia-cuisine-gap-sweep-20261011.md) explicitly routes Japanese and Chinese preserve gaps to WP05. |

## Proposed catalog boundary

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-rakkyo` |
| `nameEn` | `rakkyo` |
| `nameFr` | `rakkyo` |
| Category | `SAUCE_AND_CONDIMENT` |
| English aliases | None |
| French aliases | None |
| Default density / unit mappings | `null` / none |
| Forms, conversions, yields, recipe links, substitutions | None |

The French display uses the borrowed name `rakkyo` because the Montreal retailer’s French product collection lists `Niitakaya Rakkyo 113g`; it does not provide a French descriptive compound. The listing was marked sold out when reviewed, so it supports local product naming, not current stock or broad availability. Do not invent `échalote marinée`, `oignon japonais mariné`, `ciboule marinée`, or another translation. [S05]

MEXT labels the product “Japanese scallion, ‘Rakkyo’” but distinguishes rakkyo from shallot, while the MEXT food database classifies the sweetened pickled mature bulb under *Allium chinense*. Keep `Japanese scallion`, `scallion`, `shallot`, and `pickled shallot` out of aliases: the terms can collide with live fresh-produce references or oversimplify the species/product boundary. [S01–S02]

## Exact recipe demand versus regional usage

No rakkyo, rakkyō, `pickled scallion`, or `pickled shallot` mention occurs in the 114 manifest-listed recipes or 1,123 ingredient rows. No line is relinked. This is an externally documented regional identity candidate, not a response to exact bundled recipe demand.

Japan’s Ministry of Agriculture, Forestry and Fisheries (MAFF) describes a regional Ibaraki sweet-vinegar rakkyo pickle as commonly served with curry rice, alongside several other uses. This supports a regional use context only; it does not create bundled demand, establish a universal rakkyo recipe, or support an ingredient substitution. The Tottori MAFF entry documents a different local pickle profile and multiple preparation approaches, so the catalog should not encode a universal fermentation state, brine, sweetness, seasoning, or process. [S03–S04]

No measurement, density, unit conversion, package yield, or substitution is proposed. The MEXT food-composition entry is cited for identity and product state only; its nutrient values and sampling conventions are not kitchen measures or reusable conversion evidence. Product sizes and descriptions on retailer pages remain SKU-specific.

## Source register

All sources below were directly opened or reviewed on 2026-10-16.

| ID | Source | Claim supported and limit |
|---|---|---|
| `WP05-JP-RAKKYO-20261016-S01` | Ministry of Education, Culture, Sports, Science and Technology (MEXT), [Standard Tables of Food Composition in Japan: Notes on Foods, Chapter 3](https://www.mext.go.jp/component/english/__icsFiles/afieldfile/2017/12/20/1385123_Notes-on-food_r11.pdf), pp. 91–92. | Identifies Japanese scallion “Rakkyo” and lists mature bulb raw and sweetened pickles separately from immature bulb raw. The text says rakkyo is different from the potherb called shallot in English. Its explanation of sampled food composition is not used to create numeric catalog behavior. |
| `WP05-JP-RAKKYO-20261016-S02` | MEXT, [Food Composition Database entry 06306: Japanese scallion / Rakkyo, mature bulb, pickles, sweetened](https://fooddb.mext.go.jp/details/details.pl?ITEM_NO=6_06306_7). | Gives the English food name, product state, food number, and botanical name *Allium chinense*. This entry concerns the sweetened pickle product; it is not authority for a universal recipe or Québec translation. |
| `WP05-JP-RAKKYO-20261016-S03` | Japan Ministry of Agriculture, Forestry and Fisheries, [Ibaraki Rakkyo-zuke, Traditional Foods in Japan](https://www.maff.go.jp/j/keikaku/syokubunka/traditional-foods/menu/rakkyo_zuke.html). | Regional record identifies rakkyo pickle, names rakkyo and vinegar as principal ingredients, describes the Ibaraki sweet-vinegar product, and notes curry-rice accompaniment. This one regional preparation is not generalized to all rakkyo pickles. |
| `WP05-JP-RAKKYO-20261016-S04` | Japan Ministry of Agriculture, Forestry and Fisheries, [Tottori Rakkyo-zuke, Traditional Foods in Japan](https://www.maff.go.jp/j/keikaku/syokubunka/traditional-foods/menu/rakkyo_zuke_tottori.html). | Documents the named regional pickle and multiple local preparation approaches, including salted and seasoned products. This supports keeping process and seasoning out of the generic identity; it does not supply reusable catalog quantities. |
| `WP05-JP-RAKKYO-20261016-S05` | Miyamoto Grocery, Montréal, [Fruits et légumes collection](https://miyamotomontreal.com/collections/legumes-1), listing `Niitakaya Rakkyo 113g`. | Québec-facing French collection and product-title evidence for the borrowed display `rakkyo`. The item showed sold out at review time, and the page provides no descriptive French equivalent or general formulation. |

## Prior-review reconciliation and next action

The earlier East Asia cuisine sweep marked Japanese further preserves unresolved and routed them to WP05. The Japanese-condiment boundary review integrated yuzu kosho, umeboshi, and beni shoga while keeping Japanese gari out of the West African cassava-gari row. Subsequent WP05 integrations separately added takuan, takana-zuke, pickled mustard greens, pickled radish, and other documented East Asian preserves. Rakkyo is not an alias or repeat identity of those products; no earlier packet or live record names it. [prior proposal/batch records linked above]

If accepted, integrate only the identity row stated above and record this proposal’s source IDs against that identity in the ledger. Leave the recipe corpus, forms, measures, conversions, yields, substitutions, aliases, and broader checklists unchanged. Independent review should confirm that the borrowed French display `rakkyo` is acceptable for the local catalog context; no descriptive French compound is evidenced here.

**Encoding:** UTF-8 without BOM.
