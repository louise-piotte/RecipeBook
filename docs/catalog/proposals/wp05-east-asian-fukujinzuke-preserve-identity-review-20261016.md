# WP05 East Asian preserve gap — Japanese fukujinzuke review

- **Packet type:** proposal only; no catalog or ledger integration performed.
- **Review and source-access date:** 2026-10-16.
- **Scope:** one named Japanese preserve in the open WP05 Section W item for further regional Japanese preserved condiments. Rechecked live references, forms, legacy candidates, the research ledger, the recipe corpus, and the prior WP05/WP06 East Asian reviews.
- **Recommendation:** add one identity-only `fukujinzuke / fukujinzuke` reference for the named soy-sauce-pickled mixed-vegetable product. Use the borrowed name in both locales with no aliases. Keep the identity separate from individual pickled vegetables and from other named Japanese pickles.
- **Write scope:** this proposal file only. No shared catalog, ledger, recipe, plan, roadmap, code, or test file was edited. No tests or emulator checks were run.

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

The proposed ID `ingredient-ref-fukujinzuke` is absent from active references, forms, legacy candidates, and the ledger. Exact spellings `fukujinzuke`, `fukujin-zuke`, `fukujin zuke`, and `福神漬` are absent from the current recipe corpus. The source-ID prefix `WP05-JP-FUKUJINZUKE-20261016` is absent from existing proposal/batch files and the live ledger. The target proposal path was absent before drafting.

## Candidate dispositions and reconciliation

| Candidate or term | Disposition | Decision and next action |
|---|---|---|
| Japanese fukujinzuke | **Proposed identity** | Add `ingredient-ref-fukujinzuke`, EN `fukujinzuke`, fr-CA `fukujinzuke`, category `SAUCE_AND_CONDIMENT`, no aliases, null density, and no unit mappings. Limit the identity to the named soy-sauce-pickled mixed-vegetable product. MAFF treats fukujin-zuke as a named pickle and places it under vegetables pickled in soy sauce. [S01–S02] |
| `fukujin-zuke` | **Alias/variant; no separate row** | This hyphenated rendering appears in MAFF’s English overview; the Montreal French retail listing uses `Fukujinzuke`. Use the locally listed unhyphenated spelling for both displays and do not add a redundant spelling alias without a search need. [S01, S03] |
| Vegetables named in the product description | **Identity/compound boundary** | Do not alias fukujinzuke to daikon, eggplant, gourd, turnip, lotus root, shiso, or soy sauce. The regional source describes a prepared preserved mixture; its components are not synonyms for the compound product. Manufacturer formulas can vary. [S02] |
| Pickled radish and pickled mustard greens | **Already covered** | Retain `ingredient-ref-pickled-radish` and `ingredient-ref-pickled-mustard-greens` as distinct single-substrate product identities. They are not aliases for the named mixed-vegetable pickle. [live seed; WP05 Section W integration records] |
| Umeboshi, beni shoga, takuan, takana-zuke, and rakkyo | **Already covered or separately proposed; excluded** | Keep the already integrated identities and their current boundaries. Rakkyo has its own separate 2026-10-16 proposal and is not treated here as a live seed row. This review adds no alias to any of these products. [Japanese condiment review and linked batches; separate rakkyo proposal] |
| Generic pickled vegetables / generic relish or chutney | **Unresolved/hold** | Do not create or infer a broad pickle identity from fukujinzuke. The Japanese term denotes a named preserved mixture; the component, method, and culinary use are product-specific. Do not treat it as a relish or chutney synonym. [S01–S02] |
| Generic Japanese preserves and other open East Asian WP05 terms | **Unresolved/hold** | This one-candidate review does not resolve generic tare, Japanese mayonnaise, Chinese preserved mustard products beyond their accepted named identities, generic fermented bean curd, or generic sesame paste. Keep the prior holds and owners; Section W and WP05 remain open. See the [Section W boundary review](wp05-east-asian-condiments-section-w-review-20261011.md) and the [Japanese condiment review](wp05-japanese-condiments-boundary-review-20261010.md). |

## Proposed catalog boundary

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-fukujinzuke` |
| `nameEn` | `fukujinzuke` |
| `nameFr` | `fukujinzuke` |
| Category | `SAUCE_AND_CONDIMENT` |
| English aliases | None |
| French aliases | None |
| Default density / unit mappings | `null` / none |
| Forms, conversions, yields, recipe links, substitutions | None |

The fr-CA display keeps the borrowed name because a Montréal retailer’s French `Fruits et légumes` collection lists products titled `Fukujinzuke`. The listing displayed the products as sold out when accessed. It supports Québec-facing use of the product name, not availability, an authoritative translated compound, or a common formulation. Do not invent `légumes marinés à la japonaise`, `légumes marinés à la sauce soya`, or another descriptive translation. [S03]

MAFF’s English overview identifies fukujin-zuke as sliced vegetables pickled in soy sauce and classifies it separately from other pickle families. The Japanese regional page describes Tokyo’s named product and notes that manufacturers may vary the vegetables. Keep soy sauce, the listed vegetables, and fukujinzuke as separate ingredient identities; do not treat one producer’s component list as a universal recipe. [S01–S02]

## Exact recipe demand versus external regional use

No exact fukujinzuke, fukujin-zuke, fukujin zuke, or Japanese-script term occurs in the 114 manifest-listed recipe files or 1,123 ingredient rows. No recipe line is relinked. This is an externally documented regional preserve candidate, not a response to exact bundled recipe demand.

MAFF describes fukujinzuke as a Japanese curry accompaniment and notes other meal uses. That is external regional usage evidence only. The source’s historical account of curry service is explicitly presented among several uncertain origin stories; it does not support a substitution for chutney, relish, or another preserve. [S02]

No measurement, density, unit conversion, package yield, fermentation state, preservation instruction, or substitution is proposed. Retail package sizes are SKU-specific and do not establish reusable amounts.

## Source register

All sources below were directly opened or reviewed on 2026-10-16.

| ID | Source | Claim supported and limit |
|---|---|---|
| `WP05-JP-FUKUJINZUKE-20261016-S01` | Japan Ministry of Agriculture, Forestry and Fisheries, [Pickled — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/tukemono.html). | Describes fukujin-zuke as sliced vegetables pickled in soy sauce, includes it in vegetables pickled in soy sauce, and distinguishes non-fermented preserves from fermented pickle categories. This overview does not define a universal brand formulation or Québec French term. |
| `WP05-JP-FUKUJINZUKE-20261016-S02` | Japan Ministry of Agriculture, Forestry and Fisheries, [Fukujinzuke — Traditional Foods in Japan](https://www.maff.go.jp/j/keikaku/syokubunka/traditional-foods/menu/fukujin_zuke.html). | Official Japanese regional account identifies fukujinzuke as a Tokyo-origin preserved product, describes its vegetable-and-soy-sauce scope, names curry accompaniment, and notes manufacturer variation. Its historical story gives several possible curry origins and is not used to infer chutney substitution. Its product description does not define every commercial SKU. |
| `WP05-JP-FUKUJINZUKE-20261016-S03` | Miyamoto Grocery, Montréal, [Fruits et légumes collection](https://miyamotomontreal.com/collections/legumes-1), listings `Fukujinzuke`. | Current Québec-facing French collection lists two Fukujinzuke products by the borrowed name. Both were marked sold out at review time; the page does not supply a descriptive French equivalent or a general ingredient formula. |

## Prior-review reconciliation and next action

The 2026-10-11 WP05 Section W review kept further Japanese preserves open pending a specific product and Québec display. The 2026-10-11 WP06 East Asia sweep also routed further Japanese and Chinese preserves to WP05. Subsequent integrations established separate identities for pickled radish, pickled mustard greens, takuan, takana-zuke, and other named East Asian preserves. This proposal covers only the separately named fukujinzuke product; it does not repeat those identities or close the wider preserve checklist. The independent rakkyo proposal is excluded from the candidate and from the live-seed owner count.

If accepted, integrate only the identity row above and attach the proposal’s source IDs to that record in the ledger. Leave other identities, aliases, forms, numeric behavior, substitutions, recipe links, and broader WP05 checklists unchanged. A coordinator should independently confirm that the borrowed French display is suitable for the catalog; this review found no sourced French descriptive equivalent.

**Encoding:** UTF-8 without BOM.
