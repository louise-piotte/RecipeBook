# WP02 B2/B3 next gap review — potato-flour French plural boundary

- **Reviewed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12.
- **Scope:** Revisit the exact French ingredient-label wording `farine de pommes de terre` for the existing whole-potato-flour reference. This does not reopen the already accepted `amidon de pommes de terre` alias on potato starch.
- **Source-ID prefix:** `WP02-B2B3-POTATO-FLOUR-PLURAL-20261012`; checked against the current proposal archive and ledger before drafting, with no prior occurrence.

## Recommendation

**Accept `farine de pommes de terre` as one French alias of the existing `ingredient-ref-potato-flour`.** Keep the canonical display `potato flour / farine de pomme de terre`, leave English aliases empty, and retain potato flour as distinct from extracted potato starch. Two current Rich Products Canada bilingual ingredient declarations pair English `Potato flour` with the exact French plural `Farine de pommes de terre`; these are direct Canadian product-label wording, although both pages come from the same manufacturer. The current standalone Canadian potato-flour listing and the technical comparison below support the whole-potato product boundary. [S01–S05]

No new ingredient reference, form, recipe link, active measure, density, unit mapping, conversion, package yield, or runtime substitution rule was added. The existing flour record now carries `farine de pommes de terre` as one French alias. Its ledger contains USDA's 1 cup = 160 g observation and four King Arthur findings limited to yeast-bread contexts; measurement and substitution research are marked `researched_supported`, while `defaultDensity` remains null and `unitMappings` remain empty. None of the findings became an active rule or recipe-line link. The broader WP02 B2/B3 review remains open. [S01–S07]

## Exact name and product boundary

| Term or wording | Current ownership / recommendation | Evidence and limit |
|---|---|---|
| `potato flour` | Keep as `ingredient-ref-potato-flour.nameEn`. | Current catalog name and Canadian product evidence identify whole-potato flour. [S03, S05, S07] |
| `farine de pomme de terre` | Keep as `ingredient-ref-potato-flour.nameFr`. | Statistics Canada's archived bilingual food-code entry pairs `potato flour` with this singular French wording. [S03] |
| `farine de pommes de terre` | **Add only as a French alias** of `ingredient-ref-potato-flour`. | Rich Products Canada product #12802 and #12810 directly pair this exact ingredient wording with English `Potato flour`. These are two product listings from the same manufacturer, not independent terminology authorities. [S01–S02] |
| `potato starch` | Keep as `ingredient-ref-potato-starch.nameEn`; do not alias to potato flour. | King Arthur describes starch as washed from crushed potatoes, distinct from whole potatoes cooked, dried, and ground into flour. [S07] |
| `fécule de pomme de terre`, `fécule de pommes de terre`, `amidon de pomme de terre`, `amidon de pommes de terre` | Keep on `ingredient-ref-potato-starch`; add none to flour. | These are the four preferred French terms on the OQLF entry. Its definition and English cross-references are broad, so they do not override the technical flour/starch process boundary. [S04, S07] |
| Walmart's earlier title `Farine de Pommes de Terre` for a Kupiec listing | Keep the prior listing-specific hold rationale on record; it is not the basis for this alias. | The older reviewed retailer listing lacked a reliable process declaration. The new evidence is different: a Canadian manufacturer directly pairs the English and French ingredient names in its bilingual product ingredient declarations. Do not generalize the alias to unrelated retail titles without label evidence. [Prior review](wp02-section-b-regional-starch-residual-gap-sweep-20261012.md); [S01–S02] |

Rich's pages describe finished frozen donuts, not standalone flour packaging. Their listed 85 g serving belongs to one entire donut and does not weigh the potato-flour ingredient. Galloway's current Canadian standalone product page identifies its potato flour as potatoes cooked, dried, and ground; its 455 g and 1 kg values are package sizes. Together these clarify identity and naming but provide no flour portion measure. [S01–S02, S05]

## Measurement and substitution boundaries

- USDA ARS Standard Reference Release 28 (2015), Food Group 11, NDB 11413, lists `Measure 1 = 160g: 1 cup` for `Potato flour`. Preserve this as one historical US common-measure observation only. Its product description, cup convention, and filling method are unspecified; it does not support a default density, a Canadian cup mapping, or an active conversion. [S06]
- Rich's `1 donut (85 g)` is a finished-food serving, and Galloway's `455 g` / `1 kg` are package formats. Neither is a flour mass-per-volume measure. [S01–S02, S05]
- King Arthur Baking's 2017 test-kitchen article compares four loaves of its White Sandwich Bread. It recommends cornstarch or all-purpose flour at 1:1 by volume for yeast recipes, with flavor, color, moisture, texture, and keeping-quality differences; its result is source-specific bread guidance, not a general flour replacement rule. If recorded in the ledger, keep each direction/context source-scoped and activate no runtime rule. [S07]
- The same article gives a mashed-potato formula of 3/4 cup per 1/4 cup potato flour and says to reduce added liquid by half; the tested loaf could collapse, so the article favors rolls. The catalog has no precise mashed-potato form for this recipe context, and the variable water in the mash prevents a reusable conversion. Do not model this as a form conversion or app rule. [S07]
- King Arthur says potato starch and potato flour are not interchangeable in gluten-free baking, and describes them as roughly interchangeable only when retaining moisture in yeast breads; it suggests that less starch may be used but supplies no precise ratio. Keep the identities separate and add no potato-flour/starch rule. [S07]
- The bundle has no potato-flour or potato-starch recipe use. These sources support no recipe-line substitution link. A source-scoped ledger finding may record the yeast-bread evidence, but no global or contextual runtime rule is proposed. [S07]

## Pre-integration catalog, ledger, ownership, and recipe audit

Read-only snapshot captured at proposal time before integration on 2026-10-12:

| Surface | Count / SHA-256 |
|---|---|
| Active ingredient references | 1,312; `c0245d768db432aed546e591e4a848daa0de8fe64d375ffe7d9aae8226a747d3` |
| Ingredient forms | 98; `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64; `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research-ledger records / source entries / distinct source IDs | 1,620 / 5,918 / 4,939; ledger SHA-256 `3959016b78323b78542cac11d8018f0ee1aa90a13a25fd5125adc84363153da2` |
| Package manifest | 114 recipes; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe files / ingredient rows | 114 / 1,123; manifest-order fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The recipe fingerprint hashes each manifest-relative path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte in manifest order.

The normalized exact-key audit used the repository's `normalize_search_key` across active reference names and aliases, form labels and match terms, legacy candidate names and aliases, and ledger record IDs/names. Before integration, the exact French plural `farine de pommes de terre` had no owner in those fields. It appeared only as wording in the earlier hold/review narrative, not as a catalog or ledger identity. The exact owners at proposal time were:

| Exact phrase | Owner before integration |
|---|---|
| `potato flour` | `ingredient-ref-potato-flour.nameEn` |
| `farine de pomme de terre` | `ingredient-ref-potato-flour.nameFr` |
| `farine de pommes de terre` | None; proposed alias |
| `potato starch` | `ingredient-ref-potato-starch.nameEn` |
| `fécule de pomme de terre`, `amidon de pomme de terre`, `fécule de pommes de terre`, `amidon de pommes de terre` | `ingredient-ref-potato-starch.nameFr` / `aliasesFr` |

At proposal time, no exact phrase match existed in ingredient forms or legacy import candidates. The flour and starch references both had `defaultDensity: null` and `unitMappings: []`; neither had a matching form. The flour ledger had `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`; the starch row was also verified with both research states not yet researched.

All strings in all 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned with normalized phrase matching for `potato flour`, `potato starch`, singular and plural `farine de pomme(s) de terre`, `fécule de pomme(s) de terre`, and `amidon de pomme(s) de terre`. The scan found **zero matching recipe files and zero matching ingredient rows**. A separate reference-ID scan found zero rows linked to either potato-flour or potato-starch reference. No reviewed term or potato reference ID appears in this corpus audit.

The source prefix above and the round6 proposal path were absent from the proposal archive and ledger before drafting. The [earlier Section B review](wp02-section-b-regional-starch-residual-gap-sweep-20261012.md) held the exact plural because its retailer listing did not resolve product identity. The new bilingual manufacturer declarations materially change only the French alias boundary; the existing technical separation and no-density/no-runtime-rule limits remain. [S01–S07]

## Source register

External sources below were opened on 2026-10-12. The two Rich's entries are separate product declarations from the same manufacturer.

| ID | Source | Supports | Limits |
|---|---|---|---|
| **WP02-B2B3-POTATO-FLOUR-PLURAL-20261012-S01** | Rich Products Canada, [Plain Cake Donut Ring #12802](https://richproducts.ca/products/donuts/donuts-ready-to-finish-cake/12802/), current product page. | English ingredient list names `Potato flour`; the paired French list names `Farine de pommes de terre`. The same lists identify wheat starch and modified wheat starch separately. | Finished donut ingredient declaration, not standalone-flour process or measurement. The 85 g serving is the donut serving. |
| **WP02-B2B3-POTATO-FLOUR-PLURAL-20261012-S02** | Rich Products Canada, [Chocolate Jumbo Donut Ring #12810](https://richproducts.ca/products/donuts/donuts-ready-to-finish-cake/12810/), current product page. | English ingredient list names `Potato flour`; the paired French list again names `Farine de pommes de terre`. | Same manufacturer as S01; repeated product-label evidence, not an independent terminology authority. Finished-donut serving is not flour weight. |
| **WP02-B2B3-POTATO-FLOUR-PLURAL-20261012-S03** | Statistics Canada, [Food Code (bilingual, archived)](https://www.statcan.gc.ca/en/statistical-programs/document/3503_DLI_D12_T22_V1_B.pdf), 1996, p. 29, food-code entry 1650/F448. | Pairs `Potato flour` with `Farine de pomme de terre`, supporting the existing singular Canadian French display. | Archived food-code terminology; no plural wording, process details, portion, or density. |
| **WP02-B2B3-POTATO-FLOUR-PLURAL-20261012-S04** | Office québécois de la langue française, [*fécule de pomme de terre* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357374/fecule-de-pomme-de-terre), updated 2004. | Lists four preferred French starch terms; defines the powder as wet-extracted or milled cooked/dried tubers; includes English translations `potato flour` and `potato starch`. | The broad definition and dual English cross-reference do not merge the project's distinct English flour/starch identities and do not support `farine de pommes de terre` as an OQLF-preferred term. |
| **WP02-B2B3-POTATO-FLOUR-PLURAL-20261012-S05** | Galloway's Wholesome Foods, [*Potato flour*](https://www.gallowaysfoods.com/products/potato-flour), current Canadian product page. | Identifies a standalone potato-flour product made from potatoes that are cooked, dried, and ground; lists 455 g and 1 kg package variants. | Product process and package sizes are brand-specific; package weights are not kitchen portions or density. |
| **WP02-B2B3-POTATO-FLOUR-PLURAL-20261012-S06** | USDA Agricultural Research Service, [National Nutrient Database for Standard Reference, Release 28, Food Group 11, NDB 11413](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg11.pdf), 2015, PDF p. 1406. | Identifies `Potato flour` and reports `1 cup = 160 g` as Measure 1. | Historical US common-measure entry; no cup convention, filling method, or detailed flour process. Keep as one ledger observation, not app density or conversion. |
| **WP02-B2B3-POTATO-FLOUR-PLURAL-20261012-S07** | King Arthur Baking, [*How to substitute for potato flour*](https://www.kingarthurbaking.com/blog/2017/11/17/potato-flour-substitute), 2017-11-17. | Distinguishes whole-potato flour from extracted starch; reports a white-sandwich-bread test and yeast-recipe guidance for cornstarch, all-purpose flour, mashed potato, and potato starch. | One test kitchen and selected bread context. The advice includes quality changes, liquid adjustments, and explicit gluten-free limits; it does not establish interchangeable identities or a universal substitution rule. |

## Static checks performed

At draft time, the source-prefix and proposal-path checks were proposal-only. Root reviewed the recommendation and integrated the single French alias on the existing potato-flour reference, one USDA source-specific portion observation, four King Arthur yeast-bread findings, and a decision on the separate potato-starch record. The seven new source IDs are unique to this review; four are attached to both related ingredient records to document the shared boundary. The pre-integration catalog, ledger, and recipe snapshot above is retained as the review baseline. See the batch README for post-integration counts and static checks. Under the updated repository rule, no app tests or emulator checks were run for this database-data addition.
