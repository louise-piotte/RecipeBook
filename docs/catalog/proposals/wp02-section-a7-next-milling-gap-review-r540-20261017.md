# WP02 Section A7 R540: rye-groats candidate boundary review

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Integrated documentation-only hold (2026-10-17). No catalog, form, ledger, or recipe data changed.
- **Open parent:** WP02 Section A7 remains open for other grain-meal and milling reviews in the [active checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L2042); the [roadmap](../../../roadmap.md) records R469, R472, and R540 while keeping A7 open.
- **Candidate:** the unqualified food-product phrases `rye groats` and `rye groat`.
- **Scope:** Determine whether the phrase is a separate rye milling identity or a safe alias for the existing whole-kernel rye identity. This review does not reopen rye berries, rye meal, rye grits, rye semolina, cracked rye, or rye flakes.
- **Non-duplication:** The proposal archive contains no focused rye-groats disposition. R434 holds rye grits; R385 holds Finnish rye semolina; the active rye-meal record owns `gruau de seigle` and `semoule de seigle`; and the active rye-berries record owns `grains de seigle` / `rye kernels`. The older rye-flakes review mentions `rye groat flakes` only as an unverified alias for flakes, not as a decision on a standalone rye-groats product. R448 barley groats and R462 spelt groats have grain-specific product evidence and do not decide rye.
- **Proposal-local source IDs:** `WP02-A7-RYE-GROATS-R540-20261017-S01` and `S02`. Both IDs and their URLs are unallocated in the shared ledger. Sources reused from other ledger records are identified in the evidence table.

## Recommendation

**Hold `rye groats` and `rye groat` outside the active catalog.** Do not create `ingredient-ref-rye-groats`, add either phrase to `ingredient-ref-rye-berries`, or create a shared `candidate-rye-groats` ledger record. Keep all current rye references and aliases unchanged.

The current Canadian and Québec product sources reviewed here name whole rye grain, rye berries, cut or cracked rye, rolled rye, and rye flour. They do not identify a current human-food product sold as `rye groats` with a stated kernel or particle boundary. The Canadian Grain Commission defines *groats* specifically for oat kernels without hulls; its definition does not transfer to rye. The current CBSA tariff uses `groats and meal` for fragmented cereal grains under customs heading 11.03, including the specified sieve criterion for non-corn cereals. That classification is not a retail product definition or culinary grind specification. These usages leave the exact rye product state unresolved.

The reviewed sources do not establish a Québec French display for a distinct rye-groats item. `Grains de seigle` is already the Québec-market display on the whole rye berries row. `Gruau de seigle` and `semoule de seigle` are already owned by the rye-meal row for coarse, dark-ground whole rye. Do not move those phrases to a groats candidate or derive a new French label from an English translation alone.

| Proposed field | Disposition |
|---|---|
| Active identity / ID | None; do not create `ingredient-ref-rye-groats`. |
| Existing whole-kernel identity | Retain `ingredient-ref-rye-berries` as `rye berries / grains de seigle`, with its current `rye kernels` alias. |
| Existing meal identity | Retain `ingredient-ref-rye-meal` as `rye meal / gruau de seigle`, including `semoule de seigle` and its other current aliases. |
| New aliases or French display | None. Keep `rye groats`, `rye groat`, `gruau de seigle`, `semoule de seigle`, and `grains de seigle` off any new row. |
| Legacy candidate / ledger record | None; do not allocate `candidate-rye-groats`. |
| Forms, measures, densities, mappings, conversions, yields | None. |
| Recipe links or substitutions | None. |
| Proposed JSON patch | None. This hold leaves all JSON files unchanged. |

Reopen only when a current Canadian or Québec human-food manufacturer or package identifies a specific rye-groats product, explains whether it is intact whole rye or a fragmented milling fraction, and supplies product-matched French wording that distinguishes it from `grains de seigle`, cracked rye, and rye meal. If a source explicitly equates its product with the existing whole-rye berries product, review a narrowly supported English alias on that existing row. If it documents a distinct fragmented product, assess a separate identity only after the particle boundary and French term are established.

## Product and neighboring-identity boundaries

| Neighbor | Current owner or evidence | R540 boundary |
|---|---|---|
| Whole rye / rye berries | `ingredient-ref-rye-grain` is `rye / seigle`; `ingredient-ref-rye-berries` is `rye berries / grains de seigle`, with `rye kernels` as its only English alias. Current Québec product evidence describes intact whole rye grains sold as `Grains de seigle Bio`. | Do not add `rye groats` as a whole-grain alias without a product source that equates the phrases. The Québec wording remains on the existing owner. |
| Cracked rye | `ingredient-ref-cracked-rye` is `cracked rye / seigle concassé`. A Québec mill and current Canadian rye listings treat cut or cracked rye as a separate product. | Do not route an unspecified “groats” phrase to cracked rye based on a customs sieve threshold. |
| Rye meal | `ingredient-ref-rye-meal` is `rye meal / gruau de seigle`; it also owns `semoule de seigle`, `coarse rye meal`, `pumpernickel meal`, and source-supported pumpernickel wording. | TERMIUM defines this as coarse, dark ground whole-kernel rye for pumpernickel. Do not repurpose its French display for an unground or differently fragmented product. |
| Rye grits | R434 keeps `rye grits` / `rye grit` unallocated because the reviewed product and Québec French boundary were not established. | R540 is a separate candidate phrase; it does not reopen the grits hold or assign its names to groats. |
| Rye semolina | R385 holds Finnish rye semolina / Ruismanna outside active references. | Keep that distinct review unchanged. It does not decide a rye-groats product. |
| Rye flakes | `ingredient-ref-rye-flakes` owns `rye flakes / flocons de seigle`. | The archived rejection of `rye groat flakes` as a global alias for flakes is not a standalone groats decision. |

## Current ownership, allocation, and archive audit

Read-only snapshot of the live files inspected on 2026-10-17.

| Store | Snapshot | Finding |
|---|---:|---|
| Active ingredient references | 1,805 rows; SHA-256 `528c61e2727665c2593b58a9d76dda2616c9d900bcccb0df197ecb85fe549816` | No exact `rye groats`, `rye groat`, `gruaux de seigle`, `seigle mondé`, or proposed rye-groats ID owner. Existing rye rows retain the names and aliases listed above. |
| Ingredient forms | 146 rows; SHA-256 `8c2cf2a8f526c5d935cdab57db39670cbda452e59f3eacc047c03a0bb4283c9b` | No rye form, form label, match term, or form attached to any rye reference. |
| Legacy import identities | 56 candidates; SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` | No exact rye-groats candidate, name, or alias. |
| Research ledger | 2,164 records / 9,957 source entries / 8,424 distinct source IDs / 7,132 distinct URLs; SHA-256 `2ec5d5137f30302dd7fa916fdcb60b146d28fba5583aba36b4fd35f054cb3617` | No `ingredient-ref-rye-groats`, `candidate-rye-groats`, or exact rye-groats phrase. The rye-berries, cracked-rye, and rye-meal records retain their separate source ownership. No R540 source ID has been allocated. |
| Bundled recipe manifest | 114 paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | All manifest paths were read and parsed. |
| Proposal / batch archive | Exact phrase and proposed-ID search | No focused `rye groats` or `rye groat` decision was found. R434's rye-grits hold, R385's rye-semolina hold, the rye-meal record, and `rye groat flakes` in the rye-flakes alias review are adjacent decisions with separate scopes. |

Source ownership was checked by URL and source ID before drafting. The current Canadian Grain Commission oats page is already registered as `WP03-OAT-RICE-R174-20261016-S05`; the Québec whole-rye listing is registered as `WP03-RYE-NAME-QC-20261012-S03`; TERMIUM's rye-meal entry is registered as `WP02-RYEMEAL-20261010-S01`; and the current CBSA tariff pages are reused under `WP02-A7-UNQUAL-WHEAT-MEAL-20261014-R104-S02/S03`. No shared-ledger source row is proposed. The two proposal-local sources below use URLs not currently present in the ledger.

## Picker projection

The projection follows the phrase-first normalization in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), using the live reference and form files above.

| Query | Current result | R540 hold projection |
|---|---|---|
| `rye groats` | No match | No match |
| `rye groat` | No match | No match |
| `groats` | Six existing rows: canary seed groats, hulled barley, oat groats, raw buckwheat groats, roasted buckwheat groats, and spelt berries (through `spelt groats`) | Same six; no rye row is added |
| `rye` | Eleven rows: cracked rye, rye berries, rye, rye bran, rye flakes, rye flour, rye meal, malted rye flour, light rye flour, medium rye flour, and whole rye flour | Same eleven |
| `grains de seigle` | `ingredient-ref-rye-berries` | Unchanged |
| `gruau de seigle` / `semoule de seigle` | `ingredient-ref-rye-meal` | Unchanged |
| `seigle concassé` | `ingredient-ref-cracked-rye` | Unchanged |

No picker result changes under the recommendation. Creating an unqualified row would add another result to the broad `groats` and `rye` searches before the product state or French display is resolved. Giving the row `gruau de seigle` or `semoule de seigle` would create duplicate ownership with rye meal; giving it `grains de seigle` would duplicate the whole-rye berries owner.

## Bundled-recipe scan

All **114 manifest-listed recipe files** and **1,123 structured ingredient rows** were parsed. The complete serialized recipes and ingredient rows were scanned after lowercasing, NFKD accent folding, punctuation normalization, and whitespace normalization.

The scan found **zero recipe-file hits and zero ingredient-row hits** for `rye groats`, `rye groat`, `whole rye groats`, `rye berries`, `rye kernels`, `grains de seigle`, `gruau de seigle`, `gruaux de seigle`, `seigle mondé`, `grains de seigle mondés`, `cracked rye`, `seigle concassé`, `rye grits`, `rye meal`, `rye semolina`, `semoule de seigle`, and `rye flakes`. It found **zero recipe ingredient links** to the rye-grain, rye-berries, cracked-rye, or rye-meal references. There is no bundled demand, recipe-line amount, form, or relinking basis for this candidate.

## Forms, measures, and substitution limits

- The rye-berries, rye-grain, cracked-rye, and rye-meal references have no attached forms, default density, or unit mappings.
- The Québec whole-rye product page publishes package sizes and cooking directions for its whole-grain product. Those values are source-specific to that product; they are not measures or yields for rye groats.
- CBSA's 1.25 mm sieve criterion is a customs-classification rule for non-corn cereal groats and meal under heading 11.03. It is not a general recipe grind threshold, household measure, or conversion.
- The source set supports no density, unit mapping, cooked form, cooking yield, conversion, recipe link, or substitution among rye berries, cracked rye, meal, grits, semolina, or the unresolved groats phrase. Add none.

## Evidence register

Sources were checked on 2026-10-17. `S01` and `S02` are proposal-local only; all reused source records retain their existing ledger IDs.

| ID | Source and locator | Supports | Limits and allocation notes |
|---|---|---|---|
| **WP02-A7-RYE-GROATS-R540-20261017-S01** | Basic Grain Products, Inc., [Products](https://www.basicgrain.ca/products), current Canadian grain-product listing; rye products section. | Names four distinct rye products: whole rye kernels, cut rye described as coarsely cracked, rolled rye, and rye flour. This supports the current neighboring rye-product boundaries. | The page is one supplier's published range, not an exhaustive Canadian market survey. Its failure to list rye groats does not prove that no such product is sold elsewhere. It supplies no French name or rye-groats process specification. The URL is not in the shared ledger. |
| **WP02-A7-RYE-GROATS-R540-20261017-S02** | 1847 Stone Flour Milling, [Organic Rye Berries](https://1847.ca/product/organic-rye-berries-2-5kg/), current Canadian-facing product page; product title and listed package sizes. | Confirms a current Canadian-market product titled `Organic Rye Berries`, already within the neighboring whole-rye identity. | The page does not call the item rye groats or describe a dehulling or fragmentation step. Its 2.5 kg, 10 kg, and 20 kg package sizes are not kitchen measures. The URL is not in the shared ledger. |
| **Reused `WP03-RYE-NAME-QC-20261012-S03`** | Comptoir Saint-Vrac / Coop Agrobio, [Grains de seigle Bio](https://comptoirstvrac.com/product/2087), current Québec-facing product listing; product title, ingredients, and description. | Names a 100% Québec-origin whole rye product `Grains de seigle Bio`, describes it as intact whole grain for cooking, home milling, and sprouting, and compares its use to wheat berries. This is direct local evidence for the existing whole-rye product boundary. | It does not name `rye groats` or a separate groats process. Package sizes and the listed 1-cup-to-3-cups cooking direction/yield remain product-specific and are not added to runtime data. Reuse the existing ledger source record. |
| **Reused `WP02-A7-UNQUAL-WHEAT-MEAL-20261014-R104-S02/S03`** | CBSA, [Customs Tariff 2026, Chapter 11 (English)](https://www.cbsa-asfc.gc.ca/trade-commerce/tariff-tarif/2026/html/02/ch11-eng.html) and [French](https://www.cbsa-asfc.gc.ca/trade-commerce/tariff-tarif/2026/html/02/ch11-fra.html), Notes 2–3 and heading 11.03. | The current tariff defines heading-11.03 groats and meal as products from cereal-grain fragmentation and specifies a 95%-through-1.25-mm sieve condition for non-corn cereals. It lists cereal groats and meal as a customs class separate from other worked-grain classes. | Customs classification does not define a Québec consumer product, rye-groats retail label, culinary grade, recipe quantity, or standalone rye product. Reuse existing ledger source IDs; no source row is added. |
| **Reused `WP03-OAT-RICE-R174-20261016-S05`** | Canadian Grain Commission, [Oats: Grading factors](https://www.canada.ca/en/grain-commission/services/grain-quality/official-grain-grading-guide/07-oats/grading-factors.html), current Official Grain Grading Guide, “Hulled and hulless” section. | Defines hulless oats as oats with loose hulls usually removed during harvesting and defines groats as oat kernels without hulls. This shows that the Commission's groats definition is explicitly oat-scoped. | Oat grading terminology does not establish a rye-groats process or Québec name. Reuse existing oat-groats source entry. |
| **Reused `WP02-RYEMEAL-20261010-S01`** | Translation Bureau, TERMIUM Plus, [rye meal / gruau de seigle](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=GRUAU+SEIGLE), Food Industries / Breadmaking entry. | Defines rye meal / pumpernickel flour as whole rye kernel ground coarse and dark for pumpernickel bread; lists `gruau de seigle` and `semoule de seigle` as French terms. | Terminology record is for the rye-meal product, not groats, and is not a current package standard. It is already the rye-meal row's ledger source. |
| **Reused `WP03-BW-GROATS-QC-20261011-S01/S02`** | OQLF, [`gruau` (food entry)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau) and [`gruau` (malt-crushing entry)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8430011/gruau). | Records the Québec food sense for cooked oatmeal and a separate technical malt-crushing sense for grits. | Neither entry names a rye-groats product or validates a new French compound. Reuse existing ledger sources; do not promote unqualified `gruau`. |

## Disposition

Keep the fresh `rye groats` / `rye groat` question on hold and make no shared-data changes. The exact candidate lacks a current product-matched Canadian/Québec identity and French display. Retain the current ownership of `rye berries / grains de seigle`, `cracked rye / seigle concassé`, and `rye meal / gruau de seigle`; do not transfer aliases from barley, spelt, or oat groats. The corpus has no matching demand, and current source-specific package/cooking quantities do not support measures or conversions. This integrated documentation-only hold adds no JSON data. See the [R540 integration README](../batches/wp02-a7-rye-groats-hold-integration-r540-20261017/README.md).
