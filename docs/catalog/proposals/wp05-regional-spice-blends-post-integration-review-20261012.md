# WP05 Section T — Regional spice-blend post-integration review

- **Packet type:** proposal-only refresh of the ras el hanout, baharat, and dukkah identity review.
- **Source access date:** 2026-10-12.
- **Plan area:** Section T, individual spices and seasoning blends.
- **Disposition:** keep the three existing identity-only references; propose two narrowly scoped terminology updates and retain the regional-variant holds below. No bundled recipe currently demands any of these blends.
- **Proposal source IDs:** `WP05-T-REGIONAL-RECHECK-20261012-S13` through `S20`.

## Recommendation

The three active references remain distinct and appropriately identity-only. Add no ingredient identity, form, quantity behavior, conversion, recipe link, or substitution. The live package has no matching recipe ingredient lines or recipe prose for these names. This proposal makes no catalog or planning-file changes.

| Existing reference | Current owner and recipe demand | Proposed bilingual labels and aliases | Recommendation and boundary |
|---|---|---|---|
| `ingredient-ref-ras-el-hanout` | Current FR display `ras-el-hanout`; EN display `ras el hanout`; no aliases. The no-hyphen and hyphen forms both normalize to this one owner. No recipe row or prose hit. | Keep FR `ras-el-hanout`; EN `ras el hanout`. Add EN alias `Moroccan seasoning`. Keep FR `épices couscous` on hold. | OQLF lists `Moroccan seasoning` as an English term in the ras-el-hanout entry, and no exact active catalog owner collides with it. OQLF also lists `épices couscous`, but a current Québec retailer index separately names `Épices Ras El Hanout` and `Épices couscous rouge`; hold that unqualified French phrase as a global search alias because it can denote a different commercial blend. Do not alias `couscous spice`, tagine seasoning, or components. The indexed retailer page could not be fetched directly, so this FR hold should be revisited if direct package evidence or recipe demand appears. |
| `ingredient-ref-baharat` | Current FR/EN display `baharat`; no aliases. No recipe row or prose hit. | Keep FR `baharat`; EN `baharat`; no aliases. | A Québec producer uses `Baharat` in French company/product context; no targeted OQLF/GDT search surfaced a French equivalent. Keep `baharat` as a borrowed product name. Hold `Turkish baharat`, `Sabaa Baharat`, `sept épices`, generic `seven spice(s)`, allspice, and related blends as global aliases. A regional or product-specific name does not establish a universal crosswalk. |
| `ingredient-ref-dukkah` | Current FR/EN display `dukkah`; current EN alias `duqqa`. No other active owner matches `dukka`; no recipe row or prose hit. | Propose FR display `dukka`, FR alias `dukkah`; keep EN display `dukkah` and EN alias `duqqa`. The French display is searchable in either locale, so no separate EN `dukka` alias is needed. | OQLF gives French preferred term `dukka` and lists both `dukka` and `dukkah` as English terms. A Québec producer’s French product page uses `Dukkah`, supporting `dukkah` as a local FR search alias; a Canadian seller attests `Duqqa` as a spelling, supporting the existing EN alias. Do not add `dokka`, `Daqa`, or generic `Egyptian spice blend`. Product recipes vary, so record no fixed nuts, seeds, legumes, salt, grind, or allergen profile. |

The recommended changes above are terminology edits to existing IDs only. They are not new identities. No forms or numeric behavior are recommended for any row.

## Pre-integration audit snapshot

This snapshot records the package checked before coordinator integration on 2026-10-12. The resulting package state is recorded under **Coordinator integration outcome** below.

The audit used the current manifest and every bundled recipe file, scanning each ingredient's `originalText` and `ingredientName`, then both languages' title, description, instructions, and notes. Exact phrase comparison used the app's normalization behavior: lowercase, Unicode decomposition/accent folding, the `œ`/`æ`/`ß` folds, and punctuation-to-space normalization.

| Asset | Current count | SHA-256 |
|---|---:|---|
| Ingredient references | 1,190 | `24a913f1af8a0d778d803bcac0624603eee70179c29112f16f2cdce24663e0dd` |
| Ingredient forms | 86 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Manifest recipe files | 114 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Bundled recipe ingredient rows | 1,123 | Counted across all manifest recipe files |
| Legacy import candidates | 66 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Research-ledger records | 1,491 | `e014f19fdf72353f16ef99adff433ce131eaeef7feafbe2c0e067a659802a914` |
| Ledger source entries / distinct source IDs | 4,983 / 4,066 | Same ledger hash above |
| Ledger unit conversions | 8 | Same ledger hash above |

The three target references each have verified identity state, `not_yet_researched` measurement and substitution states, and no density or unit mappings. Their ledger rows contain 3 sources / 1 decision for ras el hanout, 5 / 1 for baharat, and 4 / 1 for dukkah. Exact owner scans across reference names and aliases, form labels and match terms, and legacy names and aliases found only the expected current owners: `ras el hanout` and its hyphen spelling map to the ras reference; `baharat` maps to the baharat reference; `dukkah` and current alias `duqqa` map to the dukkah reference. There is no exact owner for `Moroccan seasoning`, `épices couscous`, or `dukka`. All 22 reviewed phrases had zero exact ingredient-line and recipe-prose hits across 114 recipes / 1,123 rows.

Reviewed phrases: `ras el hanout`, `ras-el-hanout`, `raselhanout`, `ras al hanout`, `Moroccan seasoning`, `Moroccan spice blend`, `épices couscous`, `epices couscous`, `couscous spice`, `baharat`, `Turkish baharat`, `Sabaa Baharat`, `Saba Baharat`, `seven spice`, `seven spices`, `Lebanese seven spice`, `dukkah`, `dukka`, `duqqa`, `dokka`, `Daqa`, and `Egyptian spice blend`.

## Source notes and evidence limits

| Source ID | Source | Supports and limit |
|---|---|---|
| `WP05-T-REGIONAL-RECHECK-20261012-S13` | Office québécois de la langue française, [ras-el-hanout (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8351906/ras-el-hanout). | Defines a Moroccan spice blend with variable composition; lists French terms `ras-el-hanout` and `épices couscous`, permits French spelling without the hyphen, and lists English `Ras el Hanout` and `Moroccan seasoning`. The record is attributed to 2006 but remained available when checked on 2026-10-12. Its terminology entry does not establish that every product sold as couscous seasoning is ras el hanout. |
| `WP05-T-REGIONAL-RECHECK-20261012-S14` | Office québécois de la langue française, [dukka (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503698/dukka). | Names `dukka` as the preferred French term and lists `dukka` and `dukkah` as English terms. Notes ingredient variation. The record was last updated in 2009; it is terminology evidence, not a current universal formula or allergen specification. |
| `WP05-T-REGIONAL-RECHECK-20261012-S15` | Épices Crousset, [À propos](https://crousset.com/a-propos/). | Québec producer names ras el hanout and Baharat in its French-language account of its blends. This supports local borrowed-name usage, not an official French equivalent or common composition. |
| `WP05-T-REGIONAL-RECHECK-20261012-S16` | Épices Crousset, [Dukkah](https://crousset.com/produit/dukkah/). | Current French-language Québec product page uses `Dukkah`, says many varieties exist, and lists that product's ingredients. It supports a local spelling alias and product variation only. |
| `WP05-T-REGIONAL-RECHECK-20261012-S17` | The Tuscan Kitchen, [Dukkah Spice Blend](https://www.thetuscankitchen.com/products/dukkah-spice-blend). | Canadian seller calls `Duqqa` a spelling of dukkah. The page was out of stock when accessed; use it only for spelling, not availability or universal composition. |
| `WP05-T-REGIONAL-RECHECK-20261012-S18` | The Silk Road Spice Merchant, [Turkish Baharat](https://silkroadspices.ca/collections/all/products/turkish-baharat). | Canadian seller describes baharat mixtures as varying by region and identifies its own product as Turkish-style. Supports keeping this label regional and product-specific. |
| `WP05-T-REGIONAL-RECHECK-20261012-S19` | Le Pro 1600, [Sept épices — 85 g](https://lepro1600.com/products/7-epices-libanais-85-g). | Montréal-area seller describes one Lebanese seven-spice product as `Sabaa Baharat`. Supports that product-specific relation only, not a global synonym for all baharat. |
| `WP05-T-REGIONAL-RECHECK-20261012-S20` | Marché Al Farah, [Produits du Moyen-Orient](https://marchealfarah.ca/produits-du-moyen-orient/). | Current indexed Québec product listing names separate `Épices Ras El Hanout` and `Épices couscous rouge` items. The page could not be fetched directly on review, so this is a search-indexed collision signal, not inspected package evidence. It is sufficient to keep the unqualified FR phrase out of the proposed global alias pending stronger direct evidence. |

No OQLF/GDT result for `baharat` surfaced in the targeted searches performed on 2026-10-12; this is a bounded search result, not proof that no terminology resource anywhere uses another French equivalent. The live recipe scan likewise establishes only that this bundled library has no current demand. A future source recipe or directly inspected retail package could justify revisiting a held term, but this review does not transfer recipe quantities, infer a substitution, or convert any blend into a component list.


## Coordinator integration outcome — 2026-10-12

- Added EN alias `Moroccan seasoning` to `ingredient-ref-ras-el-hanout`; held FR `épices couscous` because the indexed Québec retailer lists a separate couscous-spice product.
- Updated `ingredient-ref-dukkah` to FR display `dukka`, FR alias `dukkah`, and EN alias `duqqa`. The French display is searchable in either locale, so the redundant EN alias `dukka` was omitted by catalog normalization.
- Kept `ingredient-ref-baharat` and all three blends identity-only; added no recipe links, forms, composition, measurements, conversions, or substitutions.
- Recorded re-review sources `WP05-T-REGIONAL-RECHECK-20261012-S13`–`S20` in the ledger. The final package has 1,192 references (`cadcbf8364313c2c8ebe73647082aa66c0648bfad40e8b54528cda451cd48318`) and 1,493 ledger records / 5,009 source entries / 4,086 distinct source IDs (`1cc991e9f32200ea398dee8b029d5d47b9f1df16731d80944b76e31abddbe59f`).
- Package and ledger static validation, reference normalization, and generated-index freshness passed. No tests or emulator checks were run for these catalog-data changes. See [`../batches/wp05-regional-spice-blends-terminology-integration-20261012/README.md`](../batches/wp05-regional-spice-blends-terminology-integration-20261012/README.md).
