# WP05 / WP06 East Asia: Nara-zuke preserve identity review

- **Review and source-access date:** 2026-10-16.
- **Packet type:** proposal only; this file is the only write in this review.
- **Plan owner:** WP05 Japanese regional preserves, supporting the open WP06 East Asia coverage item.
- **Recommendation:** Add one identity-only `ingredient-ref-narazuke` reference, English `nara-zuke` and fr-CA `narazuke`, in `SAUCE_AND_CONDIMENT`. Add no aliases, forms, measurements, or recipe links.
- **Scope limit:** The proposal covers the named Japanese preserve documented by Japan’s MAFF. Its vegetable substrates and seasoning variations do not establish one universal formula or process.

WP05 leaves “other regional Japanese preserved condiments” open after integrating yuzu kosho, umeboshi, beni shoga, takuan, and takana-zuke ([plan, Japanese preserves](../../RecipeBook-global-ingredient-catalog-plan.txt#L7261)). WP06 also remains open and explicitly leaves regional preserves and other East Asian cuisine gaps unresolved ([plan, East Asia](../../RecipeBook-global-ingredient-catalog-plan.txt#L7658)). A current Montréal retailer lists `Narazuke` in its French-language produce collection, while MAFF documents the named preserve and uses the English spelling `Nara-zuke`. The scoped identity is distinct from the already integrated pickles and from the separately proposed rakkyo, fukujinzuke, shibazuke, and mei gan cai candidates.

## Live snapshot and ownership audit

Snapshot refreshed from the shared checkout on 2026-10-16. Raw JSON and manifest hashes cover exact file bytes. The recipe-corpus digest hashes each manifest-relative recipe path, a NUL byte, the exact recipe bytes, and a trailing NUL byte in manifest order (which is sorted in this snapshot).

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,595 references | `999088c56419aeb84bd95b022715de9b26a7126be3158c2ede8ac59d0e885392` |
| `ingredient-forms.v1.json` | 122 forms | `d8fcce3554d3dab0f972f045231292ac61da2b6df62045481095ac3443129cc1` |
| `legacy-import-identities.v1.json` | 61 candidates | `bf1a780527e26e90526f6d579096b67e8b82cbbbd764ce1ced650c2d9c9a0a14` |
| `research-ledger.v1.json` | 1,940 records; 8,388 source entries; 7,128 distinct source IDs | `b577938bc7c4255efbbb74eec2c776fdb98d253e8acf95ac6998941174629589` |
| `manifest.v1.json` | 114 recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143` |

Exact and spelling-variant searches found no `narazuke`, `nara-zuke`, `nara zuke`, `奈良漬`, `奈良漬け`, `ならづけ`, `なら漬け`, or `ナラヅケ` owner in active reference names/aliases, forms, legacy candidates, or ledger records. Broader `kasuzuke`, `kasu-zuke`, `粕漬`, and `粕漬け` terms likewise have no active owner. `ingredient-ref-narazuke` is unowned. The proposed source-ID prefix `WP05-JP-NARAZUKE-20261016-S` was absent from the ledger, proposals, and batches; the target path was absent before drafting. The nearest active product identities include sake, takuan, takana-zuke, umeboshi, beni shoga, pickled radish, and pickled mustard greens. They remain separate.

The recipe audit covered every ingredient row in the 114 manifest-listed recipe files, searching each row’s `originalText`, `ingredientName`, and `ingredientRefId` for the name, romanized and Japanese-script spellings, broader sake-lees-pickle terms, and descriptive wording. **No exact row matched.** No recipe is relinked. The MAFF regional recipe/use examples and Montréal retail listing are external culinary and market evidence, not bundled-recipe demand.

## Proposed reference

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-narazuke` |
| `nameEn` | `nara-zuke` |
| `nameFr` | `narazuke` |
| Category | `SAUCE_AND_CONDIMENT` |
| English aliases | None |
| French aliases | None |
| Density / unit mappings / forms | None |
| Recipe links / conversions / yields / substitutions | None |

MAFF’s English page titles the preserve `Nara-zuke`; the Montréal retailer’s French-language `Fruits et légumes` page lists `Narazuke` as a product name. Retain each source-attested spelling in its locale field. The retailer page showed the item as sold out at review time and supplies no general product formula or descriptive French equivalent. Its package-size text is not carried into the catalog. Do not invent a descriptive translation or use retailer availability as evidence of general Québec supply.

MAFF classifies Nara-zuke as a Nara preserved food and describes vegetables first salted and then pickled repeatedly in sake lees. It names shirouri melon as a traditional substrate and lists other vegetable and fruit varieties and flavor variations. These sources support the named identity but show that substrate, flavor, and production details vary. No universal component list, optional preparation form, recipe amount, shelf life, or preservation instruction is encoded in the proposed row. The MAFF pages also describe serving it with rice or tea and using it in salads, appetizers, snacks, and other foods; these are external regional-use examples only.

## Candidate dispositions and boundaries

| Candidate or term | Disposition | Boundary and next action |
|---|---|---|
| `Nara-zuke` / `narazuke` | **Proposed identity** | Add only the named Japanese preserve identity above. Keep the official MAFF English spelling and the Montréal French-retail spelling in their respective display fields; add no aliases. [S01–S03] |
| `shirouri` and other vegetable/fruit substrates named by MAFF | **Identity/compound** | These are possible substrates or product variants, not synonyms for Nara-zuke. Keep their raw ingredient identities separate and do not encode a single substrate or universal product formula. [S01–S02] |
| Sake lees / sake kasu | **Identity/compound** | MAFF names sake lees as the pickling material. It is a component, not an alias or substitution for the finished preserve or the active sake identity. Do not create a form or automatic conversion from sake. [S01–S02] |
| `kasuzuke` / `kasu-zuke` | **Unresolved/hold** | MAFF mentions `Kasuzuke` in a historical account but does not establish it as a safe current synonym for the named Nara-zuke identity. Do not add it as an alias; a broader sake-lees-pickle class requires separate scope and Québec naming review. [S01–S02] |
| Generic Japanese pickles / `tsukemono` / generic pickled vegetables | **Identity/compound** | These are broader product families. Keep the named Nara preserve distinct; do not use generic pickle wording as an alias. MAFF’s classification treats Nara-zuke as one named pickle among separate products. [S02, S04] |
| `Nara-ae` / 奈良和え | **Identity/compound** | MAFF documents Nara-ae as a prepared dish that uses Nara-zuke. Do not create a dish row or alias; its recipe is external regional use evidence. [S05] |
| Takuan, takana-zuke, umeboshi, beni shoga, pickled radish, and pickled mustard greens | **Already covered** | Preserve their active identities and existing boundaries. None is an alias, form, or generic substrate for Nara-zuke. [live seed; WP05 integration batches] |
| Rakkyo, fukujinzuke, shibazuke, and mei gan cai | **Separate proposals; excluded** | Keep the distinct 2026-10-16 proposal owners intact; none is active as the Nara-zuke identity or an alias here. This proposal does not reconsider them. See the linked [rakkyo](wp05-east-asian-rakkyo-preserve-identity-review-20261016.md), [fukujinzuke](wp05-east-asian-fukujinzuke-preserve-identity-review-20261016.md), [shibazuke](wp05-east-asian-shibazuke-preserve-identity-review-20261016.md), and [mei gan cai](wp05-east-asian-mei-gan-cai-preserve-identity-review-20261016.md) proposals. |
| Chinese zha cai, Yibin ya cai, and fermented bamboo shoots | **Already covered** | Retain their separately integrated Chinese preserve identities. They are distinct products and are outside this Japanese preserve proposal. [WP05 Section W integration batches] |
| Nara-zuke salads, snacks, and other prepared dishes | **Identity/compound** | MAFF’s regional food pages describe examples that use the preserve. Do not promote the dish or serving name as a preserve alias or a bundled ingredient link. [S01–S02, S05] |

## Recipe demand versus external regional use

The bundled recipe audit found no exact Nara-zuke, spelling-variant, Japanese-script, or sake-lees-pickle ingredient row. No recipe link or relinking is proposed. MAFF describes use as a rice accompaniment and in tea refreshments, salads, appetizers, and other preparations, and its Nara-ae page documents a regional dish using the preserve. These examples establish external culinary use only; they do not supply bundled demand or a recipe-independent measure. [S01–S02, S05]

No ingredient measure, density, unit mapping, form, package yield, recipe yield, conversion, preservation instruction, or substitution is proposed. Product-specific recipe amounts and retailer package sizes remain source-local and are not transferred.

## Source register

Sources were accessed on 2026-10-16. Claims are paraphrased and kept within their stated regional or product scope.

| ID | Source | Supports and limits |
|---|---|---|
| `WP05-JP-NARAZUKE-20261016-S01` | Japan Ministry of Agriculture, Forestry and Fisheries (MAFF), [奈良漬け（ならづけ） — にっぽん伝統食図鑑](https://www.maff.go.jp/j/keikaku/syokubunka/traditional-foods/menu/naraduke.html). | Official Japanese regional record names Nara-zuke, classifies it as a Nara pickle, describes salt-pickling followed by repeated sake-lees pickling, lists varying substrates/flavor profiles, and gives serving/use examples. Its cited recipes and production details are source-specific; they do not establish a universal formula or catalog amount. |
| `WP05-JP-NARAZUKE-20261016-S02` | MAFF, [Nara-zuke — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/menu/nara_zuke.html). | Official English spelling and regional description; identifies Nara City and Nara Prefecture, multiple vegetable/fruit varieties, use with rice/tea and other dishes, and manufacturer/crop variation. The page’s recipe is one regional example, not a source for default recipe quantities or substitutions. |
| `WP05-JP-NARAZUKE-20261016-S03` | Miyamoto Grocery, Montréal, [Fruits et légumes](https://miyamotomontreal.com/collections/legumes-1), listing `Narazuke`. | Current Montréal-facing French collection uses the borrowed product name `Narazuke`; the listing was marked sold out at review time. It supports the fr-CA display spelling, not a standardized French translation, general availability, product formula, or reusable package amount. |
| `WP05-JP-NARAZUKE-20261016-S04` | MAFF, [Pickled — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/tukemono.html). | Distinguishes Japanese pickle categories and describes Nara-zuke as vegetables pickled in sake lees, with repeated changes of lees. This supports keeping the named preserve separate from generic pickles and takuan; it does not define a generic catalog alias. |
| `WP05-JP-NARAZUKE-20261016-S05` | MAFF, [Nara-ae — Our Regional Cuisines](https://www.maff.go.jp/j/keikaku/syokubunka/k_ryouri/search_menu/menu/naraae_nara.html). | Regional recipe source names Nara-zuke as one ingredient in Nara-ae and explicitly notes regional/household recipe variation. This establishes an external dish-use example, not a separate preserve name or bundled-recipe demand. |

## Prior-review reconciliation and next action

The WP06 East Asia cuisine sweep routed additional Chinese and Japanese preserves to WP05 and explicitly left regional preserve coverage open. The WP05 Japanese-condiment review integrated yuzu kosho, umeboshi, and beni shoga, with broader Japanese preserves still open; subsequent WP05 integrations separately added takuan and takana-zuke. Recent proposals separately review rakkyo, fukujinzuke, shibazuke, and Hakka mei gan cai. This proposal adds only the named Nara-zuke identity; it does not close the WP05 checklist or the broader WP06 East Asia sweep. See the [WP06 East Asia sweep](wp06-east-asia-cuisine-gap-sweep-20261011.md), [Japanese condiment and preserve boundary review](wp05-japanese-condiments-boundary-review-20261010.md), [East Asian Section W review](wp05-east-asian-condiments-section-w-review-20261011.md), and [Section W regional preserved-vegetable review](wp05-section-w-regional-preserved-vegetable-boundary-review-20261012.md).

If accepted, integrate only `ingredient-ref-narazuke` with the locale displays above and record the five source IDs S01–S05 in the ledger. Keep all active identities, the recipe corpus, forms, numeric behavior, conversions, yields, substitutions, and broader plan checklists unchanged. No tests, builds, emulator checks, or deployment were run for this proposal-only documentation write.

**Encoding:** UTF-8 without BOM.
