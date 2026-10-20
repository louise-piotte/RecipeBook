# WP05 East Asian preserve gap — Hakka mei gan cai review

- **Packet type:** proposal only; no catalog or ledger integration performed.
- **Review and source-access date:** 2026-10-16.
- **Scope:** one open Chinese regional preserve from the WP05 Section W further-preserves gap, rechecked against the WP06 East Asia sweep, live references/forms/legacy identities/ledger, and the complete recipe corpus. Rakkyo and fukujinzuke are excluded because they have separate proposals.
- **Recommendation:** add one identity-only `mei gan cai` reference for the Hakka dried, preserved leaf-mustard product. Use the source-attested local French wording with the regional name retained. Keep `mei cai`, `mui choy`, suan cai, fu cai, and generic pickled mustard greens distinct or unresolved; do not add a catch-all preserved-mustard identity.
- **Write scope:** this proposal file only. No shared catalog, ledger, recipe, plan, roadmap, code, or test file was changed. No tests or emulator checks were run.

## Live snapshot and ownership check

Snapshot captured on 2026-10-16 from the shared checkout. Recipe-corpus digest hashes each manifest-relative recipe path, a NUL byte, the exact recipe bytes, and a trailing NUL byte, in manifest order.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| Ingredient references | 1,595 | `999088c56419aeb84bd95b022715de9b26a7126be3158c2ede8ac59d0e885392` |
| Ingredient forms | 122 | `d8fcce3554d3dab0f972f045231292ac61da2b6df62045481095ac3443129cc1` |
| Legacy import identities | 61 | `bf1a780527e26e90526f6d579096b67e8b82cbbbd764ce1ced650c2d9c9a0a14` |
| Research ledger | 1,940 records; 8,388 source entries; 7,128 distinct source IDs | `b577938bc7c4255efbbb74eec2c776fdb98d253e8acf95ac6998941174629589` |
| Manifest | 114 recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143` |

No exact `mei gan cai`, `meigan cai`, `mei cai`, `mui choy`, `xian cai gan`, `梅乾菜`, `梅干菜`, or proposed ID owner appears in the active reference names or aliases, forms, legacy candidates, or ledger records. The older WP05 Section W review had already listed `mei cai` and `mei gan cai` as unowned candidates and left further regional preserves open; its live snapshot is superseded by the audit above. The only current related active identities include raw mustard greens, generic pickled mustard greens, zha cai, Yibin ya cai, and takana-zuke, each with a separate boundary.

The complete manifest-listed ingredient scan found no exact or source-spelling match for `mei gan cai`, `meigan cai`, `mei cai`, `mui choy`, `xian cai gan`, `Mei Cai Kou Rou`, or dried/preserved mustard-green wording. Regional Hakka dishes and a current Montréal restaurant menu establish external culinary use, not bundled recipe demand.

## Proposed identity

| Proposed ID | English display | Proposed fr-CA display | Aliases | Category | Scope |
|---|---|---|---|---|---|
| `ingredient-ref-mei-gan-cai` | `mei gan cai (dried mustard greens)` | `feuilles de moutarde séchées (Meigan Cai)` | English: `meigan cai`; French: `meigan cai` | `SAUCE_AND_CONDIMENT` | The named Hakka dried preserve made from leaf mustard after salting/fermentation and further drying. The Hakka Affairs Council distinguishes it from the less-dried suan cai and fu cai products. Do not generalize the name to every product labeled dried or preserved mustard greens. [S01–S03] |

The Québec display follows a current Montréal-facing bilingual menu, which names a dish `Porc braisé aux feuilles de moutarde séchées (Meigan Cai)` and gives `dried mustard greens` in English. This is customer-facing restaurant wording, not an OQLF ruling or a general product standard. Retain the regional term in both displays so the French descriptor does not become an alias for every dried mustard product. The spelling `Meigan Cai` is a source-attested variant and is the only proposed alias. [S03]

Hakka Affairs Council sources describe mei gan cai as a mustard-green preserve dried to a much lower moisture state than suan cai or fu cai, and document its use with meat and other dishes. These sources support a named product identity, not one universal recipe or a required processing formula across all manufacturers. The name does not indicate plum as an ingredient. [S01–S02]

Add no forms, recipe links, density, unit mappings, measures, conversions, package yields, cooking yields, preservation instructions, or substitutions. The dry/preserved state is part of this named product identity; the sources do not support a reusable same-ingredient conversion or a substitution rule.

## Candidate dispositions and boundaries

| Candidate or term | Disposition | Decision and next action |
|---|---|---|
| Hakka mei gan cai / 梅乾菜 | **Proposed identity** | Add only the named dried, preserved leaf-mustard identity above. The official Hakka source defines the dry-stage boundary; the Montréal menu supports local French wording. Keep it source-bounded and identity-only. [S01–S03] |
| `meigan cai` | **Alias/variant** | Retain as the only active spelling alias because it appears in the current Montréal menu for the named product. Do not add additional compressed, accented, or Chinese-script spellings without a search need and source review. [S03] |
| `xian cai gan` | **Alias/variant; not activated** | One Hakka Affairs Council page names this as another term for mei gan cai, but it can collide with the shorter and differently processed `xian cai`. Keep it in source notes only; do not create a broad search alias. [S04] |
| `mei cai` | **Unresolved/hold** | The abbreviated term is not a safe alias for the Hakka fully dried product across regions and retail labels. Keep it separate until a source fixes the product boundary and local display. [S01, S05] |
| `mui choy` | **Unresolved/hold** | Hong Kong FEHD lists `Mui choy` for 梅菜 as a vegetable product. That source does not establish equivalence to the narrower 梅乾菜 Hakka dry product, so do not add it as an alias. [S05] |
| `suan cai` and `fu cai` | **Unresolved/hold** | Hakka sources distinguish these leaf-mustard preserves by processing/drying state. Keep both distinct from mei gan cai and from each other; no new identity is proposed without a separate Québec-facing product-name review. [S01–S02] |
| `xian cai` / generic salted or fermented mustard greens | **Unresolved/hold** | Do not alias broad salted/fermented mustard-green wording to the drier named Hakka product. Prior Section W reviews keep this broader regional preserve family open. [S01–S02] |
| Generic `pickled mustard greens / feuilles de moutarde marinées` | **Already covered** | Retain `ingredient-ref-pickled-mustard-greens` for its generic prepared-product label. It is not a synonym for dried Hakka mei gan cai. [live seed; Section W integration] |
| Fresh mustard greens | **Already covered** | Retain the raw `ingredient-ref-mustard-greens` plant identity; do not infer preserving or drying from a generic mustard-green request. [live seed] |
| zha cai and Yibin ya cai | **Already covered** | Retain their separately named and source-bounded active identities. They are not aliases or substitute forms for mei gan cai. [live seed; WP05 East Asian condiment integration] |
| takana-zuke, takuan, pickled radish, kimchi/kkakdugi, fermented bamboo shoots | **Already covered** | Keep the current named preserve identities distinct; this proposal adds no aliases or changes to them. [live seed; Section W integrations] |
| `Mei Cai Kou Rou` / preserved-mustard pork dishes | **Identity/compound** | Treat as prepared dishes, not as the preserve identity and not as bundled ingredient demand. External Hakka sources and the Montréal menu illustrate use only. [S01–S03] |
| `mei gan cai` product labels made with non-mustard vegetables | **Unresolved/hold** | Keep out of the proposed Hakka mustard-green scope unless product-specific sources establish the base vegetable. No identity should imply that every manufacturer’s product has one substrate or formula. [S06] |
| rakkyo and fukujinzuke | **Already reviewed separately; excluded** | Leave their distinct proposals and ownership for root review; neither is a candidate or alias in this packet. They are not treated as integrated seed identities here. |

## Exact recipe demand versus external regional use

The current manifest contains 114 recipe files and 1,123 ingredient rows. A phrase scan of each ingredient row's `originalText`, `ingredientName`, and `ingredientRefId` found no match for the proposed name, known source spellings, or the local French phrase. No recipe link or relinking is proposed.

The Hakka Affairs Council describes mei gan cai in Hakka cooking and offers particular dish examples. The Montréal restaurant menu currently lists a pork dish with `Meigan Cai`. These are regional culinary and local menu evidence, not evidence of exact demand in the bundled recipes. Recipe quantities, serving counts, and methods in those external recipes are not transferred to the catalog. [S01–S04]

## Source register

Sources were accessed on 2026-10-16. New source IDs below were searched against the live ledger and catalog documents; no existing use was found.

| Source ID | Source | Claim supported and limit |
|---|---|---|
| `WP05-W-MEIGAN-CAI-20261016-S01` | Taiwan Hakka Affairs Council, [Classic Hakka Food](https://english.hakka.gov.tw/Content/Content?LanguageType=ENG&NodeID=685&PageID=39957). | Identifies mei gan cai as leaf mustard; describes it as the completely dried stage of Hakka mustard-green preserves, distinguishes suan cai/fu cai, and names Hakka culinary uses. It also attests `Xian Cai Gan`, which is not activated as an alias because shorter `xian cai` can refer to another preparation. Regional description, not a universal manufacturer formula. |
| `WP05-W-MEIGAN-CAI-20261016-S02` | Taiwan Hakka Affairs Council, [Stewed Pork Belly with Preserved Vegetables](https://english.hakka.gov.tw/Content/Content?LanguageType=ENG&NodeID=686&PageID=41767). | Separates Hakka suan cai, fu cai, and mei gan cai; describes mei gan cai as dried preserved vegetables with no plum ingredient and gives an example of use. Any recipe quantities or steps remain source-specific and are not catalog measures or preparation instructions. |
| `WP05-W-MEIGAN-CAI-20261016-S03` | Interasia Chinese Kitchen, Montréal, [current Uber Eats menu](https://www.ubereats.com/ca/store/interasia-chinese-kitchen-4335-rue-wellington/sx4BHAMkUBCAst_HJ1eIzw). | Current Montréal menu pairs `Porc braisé aux feuilles de moutarde séchées (Meigan Cai)` with `Braised pork belly with dried mustard greens`, and its description uses `preserved mustard greens`. Supports local customer-facing wording and the compressed spelling variant, not an authoritative terminology ruling or technical product specification. |
| `WP05-W-MEIGAN-CAI-20261016-S04` | Taiwan Hakka Affairs Council, [Characteristics of Hakka Delicacies](https://english.hakka.gov.tw/Content/Content?LanguageType=ENG&NodeID=685&PageID=39954). | Independently describes the suan cai → fu cai → mei gan cai drying distinction and names mei gan cai as leaf mustard; uses the source spelling `Xian Cai Gan`. Supports the alias hold and regional product boundary, not a universal process for all retail goods. |
| `WP05-W-MEIGAN-CAI-20261016-S05` | Hong Kong Food and Environmental Hygiene Department, [Guide to Application for Food Factory Licence (PDF)](https://www.fehd.gov.hk/english/forms/FSO_guide.pdf). | Lists `Mui choy` for 梅菜 in a vegetable-products classification. It does not state that the term is equivalent to the narrower Hakka 梅乾菜 identity. Regulatory classification list, not culinary terminology guidance for Québec. |
| `WP05-W-MEIGAN-CAI-20261016-S06` | Reshine Trading Ltd., [Miscellaneous Dry Goods](https://reshine.ca/zh/collections/miscellaneous-dry-goods). | Current Canadian-facing online retail page lists 梅干菜 as `Plant Based Dry Marinated Mustard`. Supports a product-specific Canadian English retail label only; it does not establish Québec availability, a French name, the product’s exact vegetable cultivar, or a general formula. |

## Prior-review reconciliation and next action

The WP06 East Asia cuisine sweep routed Chinese preserved mustard products and further preserves to WP05. The 2026-10-12 WP05 Section W regional-preserve review explicitly left `mei cai`, `mei gan cai`, `dongcai`, and `paocai` open and required region-, substrate-, preparation-, and Québec-name evidence before adding another identity. This proposal addresses only the source-defined Hakka mei gan cai candidate; it does not resolve generic `mei cai`, `mui choy`, suan cai, fu cai, dongcai, paocai, preserved mustard greens, or the wider East Asian condiment checklist. [WP06 East Asia sweep; Section W boundary review]

If accepted, integrate only `ingredient-ref-mei-gan-cai`, its source-attested `meigan cai` spelling alias, and the six source records. Preserve all current owners and holds above. Repeat the live exact-name, source-ID, and recipe-demand scans immediately before integration because the shared checkout is active. No tests or emulator checks are needed for the proposal-only write, and none were run.
