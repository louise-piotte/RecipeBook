# WP02 Section A7 R448: barley-groats alias boundary review

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Root-reviewed and integrated on 2026-10-17; see the [R448 integration README](../batches/wp02-a7-barley-groats-alias-integration-r448-20261017/README.md). No new identity, form, measurement, or recipe link was added.
- **Open checklist:** The [active A7 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L2004) remains open for other grain meals and milling products.
- **Recent decisions kept:** R440 integrated identity-only `emmer semolina / semoule de blé amidonnier`; R443 held `spelt semolina` pending Québec-facing French product naming. The [R443–R445 integration README](../batches/wp02-wp04-wp06-r443-r445-next-gap-review-integration-20261017/README.md) records those outcomes. The current barley-grits owner comes from R412.
- **Scope:** Review only the English product phrase `barley groats` as a possible search alias for whole hulled barley. Keep barley grits, barley meal, barley semolina, barley couscous, cracked barley, pearl barley, pot barley, and prepared barley cereal separate.
- **Source IDs:** IDs marked **proposal-local** exist only in this review. IDs marked **reused** already exist in the shared ledger and are not duplicated here.

## Recommendation

**Recommend adding the exact English alias `barley groats` to the existing `ingredient-ref-hulled-barley` row.** Keep the bilingual display `hulled barley / orge mondé`, current French alias `orge à grains nus`, and other aliases unchanged. Do not create a `barley groats` identity or ledger candidate.

A current Canadian seller’s `Organic Hulled Barley` page explicitly calls `barley groats` another name for the product, then defines that product as barley with only its tough outer husk removed and the germ, bran, and endosperm retained [S01]. That product boundary matches the active OQLF-backed `hulled barley / orge mondé` row [reused `WP03-S32`]. A Canadian retail listing also shows the wording `Kupiec Groats, Hulled Barley` and the package ingredient `Hulled Barley Groats` [S02]. The alias would route this retail term to the existing whole-kernel identity.

The wording is not universal. CBSA’s 2026 tariff defines “groats” and “meal” within heading 11.03 as products obtained by fragmentation of cereal grains, while heading 11.04 covers otherwise worked cereal grains such as hulled grains [S03]. This is a tariff classification, not a consumer naming rule. It is a reason to keep the proposal narrow: add the phrase only as a search alias for the specifically documented Canadian whole-hulled product, do not create a general groats class, and do not merge it with barley grits.

| Proposed field | Recommendation |
|---|---|
| Existing owner | `ingredient-ref-hulled-barley` — `hulled barley / orge mondé`, category `GRAIN_AND_CEREAL` |
| English alias | Add `barley groats` only |
| French display and aliases | Keep `orge mondé` and `orge à grains nus`; add no French alias |
| New identity or ledger candidate | None |
| Other names | Do not add `gruau d'orge`; it is already the display of `ingredient-ref-barley-grits`. Do not add generic `groats`, `whole barley groats`, or a milling form. |

The specific French name `gruau d'orge` remains owned by the active barley-grits row, which R412 accepted from bilingual product evidence [reused `WP02-A7-BARLEY-GRITS-R412-20261017-S03/S04`]. OQLF’s Québec food entry uses unqualified `gruau` for cooked oatmeal and says the sense can extend to other cereal dishes; its separate technical malt-crushing entry records a milling sense [reused `WP03-BW-GROATS-QC-20261011-S01/S02`]. Neither source supplies a product-matched Québec French name for dry barley groats. Retain the existing `orge mondé` display instead of creating a competing French label.

## Current ownership and archive audit

Read-only snapshot of the live split seed package and research files on 2026-10-17:

| Store | Snapshot | Exact-phrase finding |
|---|---:|---|
| Ingredient references | 1,739 rows; SHA-256 `798afd6aa45fa8725b81e212b53586c10462491121ae12d5aa24f1b2c30b2351` | No active name or alias owns `barley groats` or `barley groat`. `ingredient-ref-hulled-barley` is the product-matched existing row. |
| Ingredient forms | 141 rows; SHA-256 `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` | No barley-groats form or matching form term. No form is attached to `ingredient-ref-hulled-barley` or `ingredient-ref-barley-grits`. |
| Legacy import identities | 56 rows; SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` | No `barley groats` legacy identity or alias. |
| Research ledger | 2,098 records / 9,533 source entries / 8 unit conversions; SHA-256 `04e160b974f41e7bb741e282b75a5b660ca3f0dfecec33ff003866d6d05f8ae9` | No `candidate-barley-groats` or exact `barley groats` ledger record. `candidate-barley-meal` remains unresolved and separate. |
| Recipe manifest | 114 recipe paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | Every listed path exists and parses; the corpus has 1,123 ingredient rows. |

Relevant active references and candidates:

| Current record | Current bilingual name and state | Boundary kept |
|---|---|---|
| `ingredient-ref-hulled-barley` | `hulled barley / orge mondé`; English aliases `hulless barley`, `naked barley`; French alias `orge à grains nus`; null density; empty unit mappings. Its ledger identity decision reuses OQLF source `WP03-S32`. | Whole barley with only the outer hull removed. The requested alias is limited to the documented Canadian retail use. |
| `ingredient-ref-barley-grits` | `barley grits / gruau d'orge`; no aliases; null density; empty unit mappings. R412’s accepted ledger record has four product sources. | Keep the current grits product and its French term separate. The sources do not support assigning `barley groats` to this row. |
| `ingredient-ref-barley-semolina` | `barley semolina / semoule d'orge`, with qualified medium-size aliases. | Keep the separately named semolina product separate. |
| `candidate-barley-meal` | Existing unresolved ledger candidate; its reviewed sources use “barley meal” for both ground whole barley and cross-cut pieces and do not support a Québec French display. | Do not reuse its name, `farine d'orge`, `gruau d'orge`, or `semoule d'orge` for groats. |

The archive does not already allocate this phrase. R412 includes `barley groats` only in its recipe-search vocabulary; its decision adds `barley grits / gruau d'orge` and explicitly keeps whole barley separate. The earlier [A7 residual-meals review](wp02-a7-remaining-meals-review-20261010.md) mentions groats in a terminology boundary discussion but does not assign the exact phrase to a catalog row. No earlier review or `candidate-barley-groats` record for this exact phrase was found.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete phrases are preferred; if none match, the search falls back to substring matching.

| Query | Current result | With the proposed alias |
|---|---|---|
| `barley groats` | No result | `ingredient-ref-hulled-barley` |
| `barley groat` | No result | `ingredient-ref-hulled-barley` by substring fallback against the plural alias; no singular alias is stored |
| `hulled barley`; `orge mondé` | `ingredient-ref-hulled-barley` | Unchanged |
| `barley grits`; `barley grit`; `gruau d'orge` | `ingredient-ref-barley-grits` | Unchanged; no French term is reassigned |
| `whole barley groats`; `hulled barley groats` | No result | No result; neither phrase is proposed as an alias |
| `groats` | Four rows: canary seed groats, oat groats, raw buckwheat groats, roasted buckwheat groats | Those four plus `ingredient-ref-hulled-barley` (five total) |
| `grits` | Six rows: attiéké, barley grits, buckwheat grits, corn grits, hominy grits, sorghum grits | Unchanged |
| `barley`; `orge` | 20 rows each | Unchanged at 20 each; the hulled-barley row already matches both broad queries |
| `gruau` | 11 rows | Unchanged |

The English query gains the specific whole-hulled choice. The proposal does not add the generic English word `groats` or alter French routing.

## Bundled recipe-demand audit

All **114** manifest-listed recipe files were read and parsed, covering **1,123 ingredient rows**. The scan checked each decoded, serialized recipe and each structured ingredient row for `barley groats`, `barley groat`, `hulled barley groats`, `whole barley groats`, `hulled barley`, `dehulled barley`, `hulless barley`, `naked barley`, `orge à grains nus`, `barley grits`, `barley grit`, `gruau d'orge`, `gruau d’orge`, `gruaux d'orge`, `gruaux d’orge`, `barley meal`, `barley semolina`, `semoule d'orge`, `semoule d’orge`, `barley couscous`, `cracked barley`, `orge concassée`, `orge mondé`, `orge mondée`, `barley flour`, `barley flakes`, and `cream of barley cereal`.

Results: **0 matching recipe files and 0 matching ingredient rows** for every listed phrase; exact whole-word searches for `barley` and `orge` also found **0 files and 0 ingredient rows**. The normalized substring `orge` occurs once inside `dégorger` in recipe 049’s French instructions; it is not an ingredient name. No recipe links to `ingredient-ref-hulled-barley` or `ingredient-ref-barley-grits`. There is no bundled recipe demand, quantity, or recipe line to relink.

## Evidence limits

- A&B Grainmills & Organics is a Canadian seller in New Brunswick. Its current page labels a 10 kg `Organic Hulled Barley` item as sold out; its exact synonym statement is direct product-page evidence, not a Québec package label or a universal terminology ruling [S01].
- Instacart’s Canadian listing names `Kupiec Groats, Hulled Barley`, lists the package ingredient as `Hulled Barley Groats`, and says it is made in Poland [S02]. It is a retailer aggregator page, not a manufacturer specification; no particular Québec store or French package label is identified.
- The current CBSA tariff is authoritative for tariff classification only. Its 1.25 mm sieve criterion is not a household grind size, cooking measure, or universal consumer definition of “groats” [S03].
- OQLF directly supports `orge mondé / hulled barley`, not `barley groats`; no current Québec product page or authoritative Québec terminology entry for `barley groats` was found in the sources checked on 2026-10-17.
- Statistics Canada’s NAPCS examples include barley meal for human consumption, hulled barley, and kibbled barley but not a `barley groats` example. The list is illustrative rather than exhaustive; it is classification context, not proof that no such product exists [reused `WP02-A7-GRAIN-MEALS-MALT-TOASTED-BOUNDARIES-20261010-S06`].

## Numeric, form, and substitution boundaries

- The active hulled-barley row has `defaultDensity: null`, `unitMappings: []`, and no attached form. The forms file has no matching barley-groats form. Add no density, unit mapping, form, or conversion.
- The 10 kg and 14 oz figures on the reviewed product pages are package sizes, not household measures. The CBSA 1.25 mm threshold applies only to its heading 11.03 tariff definition. Add no mass-volume conversion, grind grade, or reusable measure.
- No current recipe uses the candidate name or links to the hulled-barley row, and no recipe-specific cooking yield is available. Add no yield or recipe link.
- The current global and contextual substitution-rule files each contain zero rules. No source supports replacing barley groats with barley grits, barley meal, semolina, pearl barley, or another grain under a general ratio. Add no substitution rule.

## Source register

Sources were checked on 2026-10-17. Reused source IDs already appear in the research ledger; this proposal adds no shared source or decision record.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| **Proposal-local** `WP02-A7-BARLEY-GROATS-R448-20261017-S01` | A&B Grainmills & Organics, [Organic Hulled Barley](https://www.grainmillsandorganics.ca/products/organic-hulled-barley), current product page. | Directly says hulled barley is also called dehulled barley or barley groats; describes removal of only the inedible outer layer and retention of germ, bran, and endosperm. | New Brunswick seller, not a Québec bilingual label. The listed 10 kg SKU was sold out. Product-specific language, not a universal groats definition. |
| **Proposal-local** `WP02-A7-BARLEY-GROATS-R448-20261017-S02` | Instacart Canada, [Kupiec Groats, Hulled Barley](https://www.instacart.ca/products/16955532-kupiec-groats-hulled-barley-14-oz), retailer listing. | Lists the retail name `Kupiec Groats, Hulled Barley` and package ingredient `Hulled Barley Groats`; says the product is made in Poland. | Retail aggregator, not the manufacturer or a Québec product label. The 14 oz package size is not a kitchen measure. |
| **Proposal-local** `WP02-A7-BARLEY-GROATS-R448-20261017-S03` | Canada Border Services Agency, [Customs Tariff 2026, Chapter 11](https://www.cbsa-asfc.gc.ca/trade-commerce/tariff-tarif/2026/html/00/ch11-eng.html), headings 11.03–11.04 and note 3. | Separates cereal groats/meal from otherwise worked cereal grains; for heading 11.03, defines groats and meal as products obtained by fragmentation, with at least 95% of non-maize product passing a 1.25 mm sieve. | Tariff classification, not a retail or culinary naming rule. The sieve threshold is not adopted as a kitchen specification. |
| **Reused** `WP03-S32` | Office québécois de la langue française, [orge mondé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358517/orge-monde), 2004. | Pairs Québec French `orge mondé` with English `hulled barley`; defines it as barley whose outer covering has been removed. | Does not define `barley groats`; reused from the active hulled-barley ledger record. |
| **Reused** `WP03-HULLESS-BARLEY-R88-20261013-S03/S04` | Department of National Defence, [Food Specifications, English](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-eng.pdf) and [French](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-fra.pdf), barley section. | Distinguishes hulled whole barley, with only the outer husk removed, from pearl/pot barley and quick-cooking barley grits. | 2018 procurement specification; it does not use `barley groats` as a Québec retail term. Reused from the hulled-barley ledger record. |
| **Reused** `WP02-A7-BARLEY-GRITS-R412-20261017-S03/S04` | Metro bilingual listing and Sysco item specification, as registered in the [R412 proposal](wp02-section-a7-next-milling-gap-review-r412-20261017.md). | Supports the existing exact bilingual barley-grits owner `barley grits / gruau d'orge`. | Product-specific grits evidence; it does not translate barley groats. Reused from `ingredient-ref-barley-grits`. |
| **Reused** `WP03-BW-GROATS-QC-20261011-S01/S02` | OQLF, [gruau, food-domain entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau) and [gruau, malt-crushing entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8430011/gruau). | Records both the Québec cooked-cereal sense and a separate technical milling sense. | Neither entry names dry barley groats as a Québec consumer product. Reused from existing ledger research. |
| **Reused** `WP02-A7-GRAIN-MEALS-MALT-TOASTED-BOUNDARIES-20261010-S06` | Statistics Canada, [NAPCS Canada 2022, all examples for 1821294](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=3&CPV=1821294&CST=17022022&CVD=1386659&Function=getAllExample&MLV=4&TVD=1384502&V=447178&VST=17022022), modified 2026-01-08. | Lists barley meal for human consumption and neighboring hulled/kibbled barley product examples. | Illustrative classification examples; it neither defines `barley groats` nor supplies a bilingual consumer name. Reused from the unresolved barley-meal ledger candidate. |

## Disposition

Integrated **one English alias, `barley groats`, on `ingredient-ref-hulled-barley`**. The existing French display and aliases remain unchanged; `barley grits / gruau d'orge` and unresolved `candidate-barley-meal` remain separate. No new identity, ledger candidate, measurement, form, mapping, conversion, yield, recipe link, or substitution was added. No app tests, builds, or emulator checks were run because the active data change only updates database JSON.
