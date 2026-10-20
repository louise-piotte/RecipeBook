# WP05 Section W — fermented bamboo-shoot boundary review

- **Packet type:** research proposal only; no catalog integration performed.
- **Reviewed/source access date:** 2026-10-12.
- **Scope:** fermented or preserved bamboo-shoot products only, including the boundary from fresh and ordinary treated shoots and from named regional or product-specific preserves.
- **Recommendation:** propose one generic, identity-only reference for `fermented bamboo shoots / pousses de bambou fermentées`. Keep the active fresh/general bamboo-shoot identity unchanged. Do not attach `menma`, Liuzhou `酸笋`, or generic “pickled/sour” wording as aliases.
- **Write scope:** this proposal file only. No canonical references, forms, recipe files, ledger, checklist, roadmap, or code were edited. No tests or emulator runs were performed; this is research documentation, with no database JSON change.

## Proposed identity

| Proposed ID | English display | Proposed fr-CA display | Aliases | Category | Scope |
|---|---|---|---|---|---|
| `ingredient-ref-fermented-bamboo-shoots` | `fermented bamboo shoots` | `pousses de bambou fermentées` | EN: `fermented bamboo shoot`; FR: `pousse de bambou fermentée` | `SAUCE_AND_CONDIMENT` | Generic naturally fermented bamboo-shoot preserve when a recipe or package identifies that product class. The French display is directly supported as the Codex name for the corresponding canned product. This entry does not identify every regional bamboo ferment. [S01–S02] |

The aliases are singular grammatical variants of the proposed displays, following the active base row’s singular search variants. Do not add `pickled bamboo shoots`, `sour bamboo shoots`, `bamboo sprouts`, `menma`, `suan sun`, `suansun`, `sunsi`, or `Liuzhou sour bamboo shoots` as aliases.

The existing `ingredient-ref-bamboo-shoots` remains the broad identity for fresh shoots and otherwise unqualified bamboo shoots, including plain nonfermented canned/tinned shoots. Its existing forms remain unmodeled. This proposal adds no canned, boiled, dried, sliced, pickled, or fermented forms to that row.

## Product boundary

The Codex standard is specifically for canned bamboo shoots. It describes canned shoots as packed with or without fermentation and distinguishes naturally fermented, acidified, and nonfermented/nonacidified products. Its retail product names include `pousses de bambou fermentées`. This supports the proposed display and establishes that “fermented” must not be used as a synonym for every canned or preserved shoot. It does not establish a universal name for all fermented regional products. [S01]

- **Fresh shoots:** keep `bamboo shoots / pousses de bambou` in the existing `VEGETABLE_AND_AROMATIC` row. OQLF defines the young shoot and supports the French-English base naming, including fresh or treated use. [S02]
- **Naturally fermented generic product:** propose the separate identity above, classified `SAUCE_AND_CONDIMENT`, consistent with the active identity-only preserved-product rows for kimchi, takuan, zha cai, and Yibin ya cai. This category is catalog classification for a named preserve; it does not assert that the ingredient is used only as a condiment.
- **Plain boiled/canned and acidified shoots:** keep them outside the proposed fermented identity. Codex distinguishes the three canned product classes; no pH, heat-processing, filling, or measurement rules are being copied into the catalog. [S01]
- **Menma:** hold as a separate product-specific candidate, not an alias for generic fermented shoots. A Japanese menma maker describes its own dried menma base as lactofermented machiku bamboo shoots and dried; that is useful producer evidence but not a universal formulation. [S04] A Québec French recipe calls a quickly braised preparation `menma (bambou mariné)` and starts with sliced canned bamboo shoots; its method does not ferment them. This mixed local usage makes `menma` and `bambou mariné` unreliable aliases for the proposed generic preserve. It does not establish a standard Québec French display for commercial menma. [S06]
- **Liuzhou `酸笋`:** hold as a regional product candidate. China’s national standards platform lists the current local standard DB4502/T 0030-2022 as the second part of the processing specification for prepackaged Liuzhou luosifen ingredients, titled `酸笋`. The geographic and dish qualifier belongs to that product scope; no broadly accepted fr-CA name or romanized alias is established here. Do not create `suan sun`, `sunsi`, `Liuzhou sour bamboo shoots`, or an invented French translation as generic aliases. [S03]
- **Pickled/sour retail wording:** do not map the words `pickled` or `sour` to the fermented identity. A Canadian retailer lists a Thai `Pickled Sour Bamboo Shoot` product as a water-and-salt brined ingredient to cook before use, but the listing does not state that it is fermented. That product description cannot establish either fermentation or a global product synonym. [S05]

No recipe line in the bundled corpus requests any of these names, so no recipe link is proposed. The row, if accepted later, should have `defaultDensity: null`, empty `unitMappings`, no preparation forms, no package-yield data, and no numeric conversion, cooking, or substitution behavior. Do not infer a measure from Codex container rules, seller package sizes, or a producer’s rehydration procedure.

## Source register

The proposal-local source IDs use the prefix `WP05-FBAMBOO-20261012-`; that prefix had no prior match in the catalog ledger or proposal/batch Markdown at the pre-write audit.

| Source ID | Source | What it supports and its limit |
|---|---|---|
| `WP05-FBAMBOO-20261012-S01` | FAO/WHO Codex Alimentarius, [Norme pour les pousses de bambou en conserve, CXS 241-2003](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/pl/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B241-2003%252FCXS_241f.pdf). | Official French standard, amended through 2023. Sections 1–2 limit it to canned shoots, allow products with or without fermentation, and distinguish naturally fermented, acidified, and nonfermented/nonacidified classes. Section 8.1.1 names `pousses de bambou fermentées`. Supports the proposed French product name in this canned-product scope, not all regional ferments. |
| `WP05-FBAMBOO-20261012-S02` | Office québécois de la langue française, [pousse de bambou (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083672/pousse-de-bambou). | Preferred French `pousse de bambou`, English `bamboo shoot`; defines the young shoot as a vegetable and notes fresh or treated use. Supports the active base identity and its boundary, not a fermented-product form. |
| `WP05-FBAMBOO-20261012-S03` | National Standards Information Public Service Platform of China (SAMR), [DB4502/T 0030-2022](https://std.samr.gov.cn/db/search/stdDBDetailed?id=DEB42E85B0207CF4E05397BE0A0A4B1F). | Official record for a current recommended Liuzhou local standard covering `酸笋` as part 2 of the prepackaged luosifen ingredient-processing specification. Establishes the regional/product qualifier; it provides no Québec French display. |
| `WP05-FBAMBOO-20261012-S04` | Marumatsu Bussan, [Menma: reconstituting dried menma](https://www.marumatsu-mb.co.jp/menma/DriedMenma.html). | Producer account says its machiku bamboo material is lactofermented and dried before processing into menma products. This is one manufacturer’s dried-menma product path, not a definition of all products sold as menma. |
| `WP05-FBAMBOO-20261012-S05` | Haisue Canada, [Cock Brand Pickled Sour Bamboo Shoot](https://haisue.ca/products/cock-brand-pickled-sour-bamboo-shoot-slice-850g). | Canadian retailer lists a Thai sour/pickled product in water-and-salt brine and says it needs cooking. The listing does not claim fermentation, so it is evidence that the retail wording alone is insufficient for aliasing. |
| `WP05-FBAMBOO-20261012-S06` | Bon pour toi, Québec recipe [Menma (bambou mariné)](https://bonpourtoi.ca/recettes/menma-bambou-marine/). | Local French usage labels a quick soy-based braise of sliced canned shoots `menma (bambou mariné)`; the method has no fermentation step. This is a recipe usage example, not terminology authority or evidence about commercial menma composition. |

## Live catalog and recipe audit

Snapshot refreshed on 2026-10-12 immediately before writing. Hashes cover exact file bytes. The recipe corpus digest hashes each manifest-relative recipe path, a NUL byte, the exact recipe bytes, and a trailing NUL byte in manifest order. The shared checkout contains unrelated concurrent changes; this packet records the inspected state and does not overwrite them.

| Artifact | Current count/state | SHA-256 or corpus digest |
|---|---:|---|
| Git HEAD | `0caaef893ebd9e12` | — |
| `ingredient-references.v1.json` | 1,192 references | `cadcbf8364313c2c8ebe73647082aa66c0648bfad40e8b54528cda451cd48318` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `research-ledger.v1.json` | 1,493 records; 5,009 source entries; 4,086 distinct source IDs | `1cc991e9f32200ea398dee8b029d5d47b9f1df16731d80944b76e31abddbe59f` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |

Audit results:

- Exact normalized name/alias checks covered the active references, forms, and legacy candidates for the proposed English/French names, singular variants, `pickled/sour bamboo shoots`, `menma`, `suan sun/suansun/sunsi`, `Liuzhou sour bamboo shoots`, and Chinese `酸笋`/`竹笋`. The only active exact owner was `ingredient-ref-bamboo-shoots` (`bamboo shoots / pousses de bambou`, aliases `bamboo shoot / pousse de bambou`); no fermented identity, form, or legacy candidate owns the proposed names.
- The only bamboo-specific ledger record is `ingredient-ref-bamboo-shoots`, sourced by `WP03J-S20` (OQLF). Its identity is `verified`; measurement and substitution research remain `not_yet_researched`. It records no fermented product, forms, or numeric behavior.
- A text scan of all 114 manifest-listed recipe JSON files, including ingredient rows and prose, found zero matches for bamboo shoots, bamboo/bambou, fermented/pickled/sour shoots, menma, suan sun/suansun/sunsi, or `酸笋`/`竹笋`. The 1,123 ingredient rows contain no candidate demand and receive no links.
- No proposed reference ID (`ingredient-ref-fermented-bamboo-shoots`, `ingredient-ref-menma`, `ingredient-ref-liuzhou-sour-bamboo-shoots`) collided with active references, forms, or legacy candidates. The source-ID prefix above was also clear before this proposal was written.

The prior Section W review and WP06 East Asia sweep both left fermented bamboo shoots open/held, with no recipe demand. This packet narrows the naming question using the current Codex, OQLF, SAMR, producer, Canadian-retailer, and Québec recipe evidence; it remains unintegrated until accepted. [WP05 Section W review](wp05-east-asian-condiments-section-w-review-20261011.md) [WP05 preserved-condiment demand review](wp05-preserved-condiments-exact-recipe-demand-review-20261010.md) [WP06 East Asia sweep](wp06-east-asia-cuisine-gap-sweep-20261011.md)
