# WP05 Korean fermented-paste identity review — 2026-10-10

- **Packet type:** proposal only; no integration performed.
- **Scope:** gochujang, doenjang, ssamjang, generic fermented soybean paste, and recipe-linked prepared variants if present.
- **Prepared and source-access date:** 2026-10-10.
- **Source IDs:** `WP05-KFP-ID-20261010-S01` through `WP05-KFP-ID-20261010-S12`. These IDs were checked against the live research ledger and proposal/batch source IDs before assignment; no collision was found.
- **Earlier proposal context:** `wp05-east-asian-korean-pastes-followup.md` proposed the same three specific identity IDs below but remained unaccepted. This packet rechecks live state, recipes, and the names; it does not request duplicate rows or reuse the earlier packet’s source IDs.

## Recommendation

Accept the three specifically named products as separate `SAUCE_AND_CONDIMENT` identities, with no extra aliases. Hold the generic phrase **fermented soybean paste** as an identity or alias because it is a broad product class and does not identify one Korean product. The French displays below use Canadian French product wording and Quebec `soya` usage where supported; they are product-name recommendations, not claims of an OQLF-approved term for the Korean names.

| Candidate | Disposition | Proposed English display | Proposed French display (`fr-CA`) | Exact scope and limits |
|---|---|---|---|---|
| Gochujang | **ACCEPT, named product** | `gochujang` | `pâte de soya fermentée au piment fort (gochujang)` | Codex defines a red/dark-red fermented paste sold as gochujang and excludes chili paste or sauce whose main ingredient is red pepper [S04–S05]. Use only the named fermented product. Do not alias plain Korean chili paste, pepper paste, hot sauce, gochugaru, or a gochujang-based prepared sauce to this row. |
| Doenjang | **ACCEPT, Korean fermented-paste identity** | `doenjang` | `pâte de soya fermentée coréenne (doenjang)` | Sempio identifies a standalone Korean soybean paste made by fermentation; Canadian French product wording calls it Korean soybean paste [S02, S09]. The manufacturer's one product formula is not a universal recipe. Keep distinct from Japanese miso, Chinese soybean pastes, soy sauce/ganjang, soup bases, and seasoned or prepared soybean-paste products. |
| Ssamjang | **ACCEPT, separate compound condiment** | `ssamjang` | `pâte de soya coréenne assaisonnée (ssamjang)` | Sempio describes a seasoned dipping paste blending doenjang, gochujang, sesame, and vegetables; a Canadian French retailer labels it a Korean soybean dipping paste [S03, S09]. It is its own prepared condiment, not an alias for either component. Do not generalize one maker’s blend as a universal formula. |
| Generic fermented soybean paste / fermented soy paste | **HOLD** | — | — | Codex uses fermented soybean paste as a broad product class, and its food-category record groups Chinese dou jiang, Korean doenjang, and Japanese miso within that class [S06–S07]. Do not create a generic row or add this wording as an alias of doenjang, white miso, doubanjiang, or another named product. Preserve unqualified recipe wording for later context-specific review. |

Only the paired displays above are proposed. Leave aliases empty; do not add broad English/French descriptors such as `Korean chili paste`, `soybean paste`, `seasoned soybean paste`, `pâte de soya fermentée`, or `pâte de haricots assaisonnée` as aliases. The Korean romanized names in parentheses are part of the French display, not additional aliases. No new preparation form, density, unit mapping, package yield, substitution, or measurement is proposed.

## Live catalog and prior-review check

At the pre-draft snapshot, the live catalog contained 770 ingredient references and 36 ingredient forms. No live reference ID, name, or alias matched gochujang, doenjang, ssamjang, or the proposed French displays. No matching form label or term was present. The 82 legacy import candidates contained no exact candidate identity. The only matching candidate IDs found in project documents are the unaccepted proposals in `wp05-east-asian-korean-pastes-followup.md`; they are not live rows.

The research ledger has no Korean candidate identity record and no occurrence of the three romanized product names. One `fermented soybean paste` mention occurs in source context for the existing Chinese doubanjiang research; it is not a catalog identity or crosswalk. No new ledger entry or source is being requested here.

Nearby current identities and boundaries:

| Live reference | Current English / French display | Boundary |
|---|---|---|
| `ingredient-ref-white-miso-paste` | `white miso paste` / `pâte miso blanche` | Keep Japanese miso separate from Korean doenjang. Codex’s broad fermented-paste category is not an equivalence rule. |
| `ingredient-ref-tahini` | `tahini` / `beurre de sésame` | Keep the standalone sesame paste separate from compound ssamjang; sesame appearing as an ingredient in one ssamjang product does not create an identity or alias link. |
| `ingredient-ref-doubanjiang` | `doubanjiang` / `doubanjiang` | Keep the named Chinese chili-and-bean paste separate from gochujang and doenjang. |
| `ingredient-ref-soy-sauce` | `soy sauce` / `sauce soya`; aliases `shoyu` / `sauce soja` | Keep liquid soy sauce separate from the fermented pastes. Do not map ganjang or a soy-sauce recipe phrase here without an independent identity review. |
| `ingredient-ref-chili-powder` | `chili powder` / `poudre de chili` | Dry ground seasoning, not gochujang. |
| `ingredient-ref-red-chili-flakes` | `red chili flakes` / `flocons de piment rouge` | Dry flakes, not gochujang. |
| `ingredient-ref-black-bean-sauce` | `black bean sauce` / `sauce de soja noir` | Prepared sauce; not a whole fermented paste identity or alias target. |

Sempio’s product page describes ssamjang as a blend containing doenjang and gochujang [S03]. Keep all three identities separate. The Canadian French retailer also lists `Tojang` as a separate soybean paste product whose specific page describes it as a lighter, less-salty doenjang-style product and gives a prepared ingredient list [S11]. **Tojang, doenjang-jjigae sauce, stew paste, marinades, bibimjang, and other gochujang-based sauces are not accepted under these rows**; no bundled recipe line calls for one of them.

## Exact bundled-recipe demand audit

I scanned all **114** recipe paths listed in the live bundled-library manifest, covering **1,123 ingredient rows**. For each row I searched `originalText`, `ingredientName`, and `ingredientRefId`. The scan included:

- Gochujang, gochu-jang, Korean chili/chilli paste, Korean red/hot-pepper paste, fermented red-pepper paste, and French spellings of the Codex and Canadian product labels.
- Doenjang, doen-jang, Korean fermented soybean/soya paste, and the French product wording.
- Ssamjang, ssam-jang, seasoned soybean paste, Korean soybean dipping paste, and the French product wording.
- Generic fermented soybean/soy/soya/bean paste, plus `tojang`, `doenjang jjigae`, and soybean-paste stew sauce as possible prepared variants.

| Candidate family | Matching bundled rows | Exact recipe-line IDs |
|---|---:|---|
| Gochujang | 0 | None |
| Doenjang | 0 | None |
| Ssamjang | 0 | None |
| Generic fermented soybean paste | 0 | None |
| Tojang / doenjang-jjigae / soybean-paste stew variants | 0 | None |

There is no current recipe line to link or relink, so no recipe-line ID is proposed. External manufacturer recipes and product use suggestions are not bundled-library demand. A future generic line such as `fermented soybean paste` must remain unresolved until its recipe context identifies the intended product.

## Collision audit

The exact-key audit followed `normalizeIngredientSearchKey` in `IngredientSearch.kt`: lowercase with NFKD, fold `œ`/`æ`/`ß` and ampersands, strip combining marks, normalize punctuation and whitespace. It checked active reference display names and aliases, form labels and match terms, and legacy import names and aliases. No exact collision exists for any proposed display or primary Korean product name. The ID strings below are absent from live references, forms, ledger, and legacy candidates; they appear only as unaccepted proposals in the earlier Korean-pastes packet.

| Proposed reference ID | English display | French display | Exact active/form/legacy owner |
|---|---|---|---|
| `ingredient-ref-gochujang` | `gochujang` | `pâte de soya fermentée au piment fort (gochujang)` | None |
| `ingredient-ref-doenjang` | `doenjang` | `pâte de soya fermentée coréenne (doenjang)` | None |
| `ingredient-ref-ssamjang` | `ssamjang` | `pâte de soya coréenne assaisonnée (ssamjang)` | None |

No alias collision is being created. In particular, do not add the generic terms `fermented soybean paste`, `soybean paste`, `Korean chili paste`, or `seasoned soybean paste` to these rows. Do not merge ssamjang into doenjang/gochujang or infer equivalence with miso, doubanjiang, generic red-pepper paste, or prepared stew/sauce products. A targeted OQLF search returned no entry for the three Korean names; OQLF’s `soya` entry notes that this spelling is used in Quebec more often than European `soja` [S10].

## Sources accessed 2026-10-10

| ID | Source | Supports and limits |
|---|---|---|
| **WP05-KFP-ID-20261010-S01** | Sempio, [Gochujang, Korean Chili Paste](https://en.sempio.com/product/jangpaste/view/621). | Direct producer product page identifies gochujang as a red chili paste and publishes one product’s ingredient list. That formulation is specific to this product; Codex supplies the fermented-product boundary. |
| **WP05-KFP-ID-20261010-S02** | Sempio, [Doenjang, Soybean Paste, Authentic](https://en.sempio.com/product/jangpaste/view/629). | Direct producer page identifies a standalone soybean paste made from soybeans and sea salt and slowly fermented/aged. Its 100-day process and listed ingredients are product-specific. |
| **WP05-KFP-ID-20261010-S03** | Sempio, [Ssamjang, Korean Soybean Dipping Paste](https://en.sempio.com/product/jangpaste/view/632). | Direct producer page calls ssamjang a dipping paste and describes a blend of doenjang, gochujang, sesame, and vegetables. This establishes a separate compound product, not a universal recipe. |
| **WP05-KFP-ID-20261010-S04** | FAO/WHO Codex Alimentarius Commission, [Standard for Gochujang CXS 294-2023 (English)](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/pl/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B294-2023%252FCXS_294e.pdf). | Defines the product as a fermented paste, uses the name gochujang, and explicitly excludes chili paste/sauce whose main ingredient is red pepper. Product-class boundary; no Canadian retail wording. |
| **WP05-KFP-ID-20261010-S05** | FAO/WHO Codex Alimentarius Commission, [Norme pour la pâte de soja fermentée au piment fort (Gochujang), CXS 294-2023 (French)](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B294-2023%252FCXS_294f.pdf). | Supplies the French product wording and same boundary as S04. For the Quebec display, `soja` is adapted to `soya` based on OQLF usage evidence [S10]. |
| **WP05-KFP-ID-20261010-S06** | FAO/WHO Codex Alimentarius Commission, [Regional Standard for Fermented Soybean Paste (Asia), CXS 298R-2009](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/fr/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B298R-2009%252FCXS_298Re.pdf). | Defines fermented soybean paste as a broad paste product based on soybean fermentation. It does not establish a single Korean identity, a crosswalk from every unqualified recipe phrase, or a French Canadian display. |
| **WP05-KFP-ID-20261010-S07** | FAO/WHO Codex Alimentarius Commission, [GSFA food-category details for fermented soybean paste](https://codex.fao.org/codex-texts/codex-online-databases/gsfa/food-categories/food-category-details?categoryId=8e73ded6-249a-f111-b8dc-70a8a5613865). | The category description includes dou jiang (China), doenjang (Republic of Korea), and miso (Japan). It supports keeping the generic class distinct from a specific named product; it is not a product-level identity crosswalk. |
| **WP05-KFP-ID-20261010-S08** | Canadian Intellectual Property Office, [Trademarks Journal, 18 February 2026 (French)](https://www.ic.gc.ca/opic-cipo/tmj/eng/18Feb2026_fr.pdf?edition=02-18&year=2026). | A Canadian French goods list includes `pâte de soja fermentée au piment fort (gochujang)`, `pâte de soya fermentée (doenjang)`, and `pâte de haricots assaisonnée (ssamjang)`. This is Canadian French product-category evidence from a trademark filing, not an OQLF term recommendation or food standard. |
| **WP05-KFP-ID-20261010-S09** | Haisue, [Sempio collection (French)](https://haisue.ca/fr/collections/sempio), Canadian retailer. | Product titles include `Pâte de piment coréenne Gochujang`, `Pâte de Soja Coréenne Doenjang`, and `Ssamjang Pâte de soja coréenne pour trempette`. Product-title evidence only; the retailer’s stock status and source-specific wording do not define universal recipes. |
| **WP05-KFP-ID-20261010-S10** | Office québécois de la langue française, [soya (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296889/soya). | OQLF lists both `soya` and `soja` and notes that Quebec uses `soya` while Europe more often uses `soja`. Supports the Quebec spelling in the proposed French displays; it is not an entry for gochujang, doenjang, or ssamjang. |
| **WP05-KFP-ID-20261010-S11** | Haisue, [Sempio — Pâte de soja (Tojang), French product page](https://haisue.ca/fr/collections/sauces-seasonings/products/sempio-soybean-paste-tojang-450g). | This Canadian French page describes one Tojang product as a lighter, less-salty version of doenjang and lists doenjang with added alcohol, seafood seasoning, garlic, and red pepper. This bounds that product only; it does not make all doenjang products compound or interchangeable. |
| **WP05-KFP-ID-20261010-S12** | Haisue, [Sempio — Ssamjang Pâte de soja coréenne pour trempette (French product page)](https://haisue.ca/fr/products/sempio-ssamjang-korean-soybean-dipping-paste-vegan-500g). | Direct Canadian French product title supports the local compound-paste wording for ssamjang. The page’s title and product origin are not a terminology authority or universal ingredient formula. |

## Pre-integration snapshot

The values below were captured from the live checkout immediately before drafting. File hashes cover exact bytes. The recipe digest is SHA-256 over manifest-listed recipe basenames sorted lexically, each followed by NUL, the exact recipe bytes, and another NUL. The checkout was already dirty in catalog seed/forms and catalog documentation from concurrent work; these values describe that live state, not a clean commit.

| Artifact | Pre-integration state | SHA-256 / digest |
|---|---:|---|
| Git HEAD observed | `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4` | — |
| `ingredient-references.v1.json` | 770 references | `086adb131bf0abf4df3b25be430878173ce51a8ac1bcb2191834b4b73b72a4b4` |
| `ingredient-forms.v1.json` | 36 forms | `1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef` |
| `legacy-import-identities.v1.json` | 82 candidates | `60d389975134f8d31c57c66caa6375b4466c4c9614d399617a64365878d6aa5f` |
| `research-ledger.v1.json` | 988 records; 2,056 source entries; 1,670 unique source IDs | `27300b14879b50bcd61ee46955ba8ecb0e05b3b9110e152bb99f24505c710df9` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Bundled recipe JSON set | 114 files; 1,123 ingredient rows | `d4ba08e849c8f276446433fd1e8c70a78a0b31bd750c0283647e8e5b569604ee` |

No canonical reference/form, recipe, ledger, test, checklist, plan, or roadmap file was changed for this proposal. No tests or package normalization were run.
