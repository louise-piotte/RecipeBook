# WP02 Section A7 R462: spelt groats alias for spelt berries

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Accepted and integrated as one English alias on the existing spelt-berries identity.
- **Open checklist:** WP02 Section A7 remains open for other grain meals and milling products at [plan line 1998](../../RecipeBook-global-ingredient-catalog-plan.txt#L1998).
- **Scope:** Decide whether the current Canadian product wording `spelt groats` can be a narrow English alias of the existing whole-kernel `spelt berries / grains d’épeautre` identity. This does not propose a new row, decide generic `spelt meal`, `spelt grits`, or `spelt semolina`, or change the French display.
- **Non-duplication:** R170 accepted the spelt-berries identity without aliases; it did not assess `spelt groats`. R458 assessed spelt grits and mentioned Canadian spelt groats only as the distinct whole-kernel neighbor; its instruction not to add `spelt groats` to a possible **grits** row is preserved. This review addresses only the previously unallocated English phrase on the existing whole-spelt-kernel row.
- **Registered source-ID prefix:** `WP02-A7-SPELT-GROATS-ALIAS-R462-20261017`. S01–S03 are now registered on `ingredient-ref-spelt-berries`; existing OQLF and R170 source IDs are reused below.

## Recommendation

**Add only the English alias `spelt groats` to the existing `ingredient-ref-spelt-berries` row.** Keep its canonical pair, category, empty French aliases, and all numeric and form fields unchanged.

Oak Manor Organic's current Canadian product page titles its item **Organic Spelt Groats (Kernels)** and describes it as “Hulled spelt kernels, or groats,” which may be cooked whole. The page says the product is grown and processed in Ontario [S01]. This is direct product-level evidence that the unqualified phrase *spelt groats* names whole, hull-removed spelt kernels in a Canadian food product. 1847 Stone Flour Milling independently sells **Organic Spelt Berries** as a grain product for food and home milling [S02]. Québec sources use `grains d’épeautre` for whole spelt used in cooking; Grains du Québec notes that spelt's adherent hull must be removed after harvest [S03; reused R170 S01]. Together, these sources support the narrow synonym on the already-existing edible whole-kernel identity.

This alias does not assign `spelt groats` to the held grits candidate. Oak Manor distinguishes its whole kernels, which can be cooked whole or flaked/ground at home, from the separately milled grain fraction called grits in R458's sources. R458's hold on `spelt grits` and its unverified French display remain unchanged.

| Proposed field | Value |
|---|---|
| Existing ID | `ingredient-ref-spelt-berries` |
| Existing category | `GRAIN_AND_CEREAL` |
| Existing English display | `spelt berries` — unchanged |
| Existing French display | `grains d’épeautre` — unchanged |
| English aliases | Add only `spelt groats` |
| French aliases | `[]` |
| New ingredient reference or candidate ID | None |
| Forms, default density, unit mappings, measurements, conversions, yields, recipe links, substitutions | None |

Do not add `organic spelt groats`, `whole spelt kernels`, `hulled spelt kernels`, singular `spelt groat`, `spelt grits`, `gruau d’épeautre`, or any farro/emmer wording. `Organic` is a product-specific qualifier, `hulled spelt kernels` is explanatory copy rather than a cross-supplier name, and no reviewed Québec source gives a product-matched French name `gruau d’épeautre`. The existing `grains d’épeautre` display already supplies the local French product wording.

## Product and neighboring-identity boundaries

| Neighbor | Current state | R462 boundary |
|---|---|---|
| `ingredient-ref-spelt-berries` | `spelt berries / grains d’épeautre`, `GRAIN_AND_CEREAL`; no aliases or forms, null density, and empty unit mappings. | Add only the source-backed English alias `spelt groats`; do not change the identity or its accepted French pair. |
| `ingredient-ref-spelt-flakes` | `spelt flakes / flocons d’épeautre`. | Flaked spelt is a processed product, not the unprocessed whole-kernel phrase. |
| Spelt flour rows | Generic, white, whole, sprouted, and malted spelt flour are separate active references. | Home milling is a described use, not a reason to alias groats to flour or create a flour form. |
| R458 spelt grits candidate | Held unallocated; no reference or alias. | Keep `spelt grits` off the whole-kernel row. Oak Manor's whole-cooking statement does not define a grits process. |
| R42 spelt-meal candidate and R443 spelt-semolina candidate | Both remain held under their existing source and naming boundaries. | Do not add `spelt meal`, `spelt semolina`, or `semoule d’épeautre`. |
| Einkorn | `ingredient-ref-einkorn-berries` / `grains de petit épeautre`, with separate flour. | Keep einkorn and its French `petit épeautre` terms distinct from spelt. |
| Emmer and farro grain rows | Separate `ingredient-ref-emmer-grain` and `ingredient-ref-farro-grain` identities. | No `farro`, `emmer groats`, or generic `groats` alias is proposed. |
| Other groats rows | Canary-seed groats, hulled barley, oat groats, raw buckwheat groats, and roasted buckwheat groats remain separate. | The alias is species-qualified; do not add bare `groats` or transfer the barley-groats decision to other grains. |
| Wheat groats | R451 holds the named Dzedzaz product because its kernel/process state and Québec French name are unresolved. | That separate wheat product boundary does not decide the explicitly whole, hull-removed Oak Manor spelt SKU. |

## Current ownership, allocation, and snapshot audit

Read-only pre-integration audit of the split seed package and shared research files on 2026-10-17. The inventory, counts, and hashes below describe that proposal-time snapshot.

| Store | Current snapshot | Exact ownership and allocation finding |
|---|---:|---|
| Active ingredient references | 1,747 rows; SHA-256 `5cc8653539f7fb5113bae267d78e449fb3b18d8cac2360a8640d317b5796c87f` | `ingredient-ref-spelt-berries` is the only exact owner of `spelt berries / grains d’épeautre`; it has empty alias arrays. No active display or alias owns `spelt groats`, `spelt groat`, `organic spelt groats`, or the proposed no-new ID `ingredient-ref-spelt-groats`. The row remains `GRAIN_AND_CEREAL`, null density, and no unit mappings. |
| Ingredient forms | 141 rows; SHA-256 `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` | No form label or match term owns the candidate phrases; no form is attached to `ingredient-ref-spelt-berries`. |
| Legacy import identities | 56 candidates; SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` | No exact candidate ID, display, or alias owns `spelt groats` or `spelt groat`. |
| Research ledger | 2,106 records / 9,588 source entries / 8 unit conversions; SHA-256 `4b0977d2b63e8795dfa10c037754febf55143638442c1f5a88c4034b35e9ef35` | No `candidate-spelt-groats` or `ingredient-ref-spelt-groats` record exists. The accepted `ingredient-ref-spelt-berries` record has the R170 product sources, no measurement observations, and no substitution findings. The R462 source-ID prefix and three new source URLs are absent from the ledger. Reuse the established OQLF ID `WP03-SPELT-FLAKES-20261011-S01` for `épeautre`; reuse the existing OQLF `gruau` IDs rather than duplicating those source records. |
| Recipe manifest | 114 paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | Every manifest-listed recipe file was parsed. The corpus has 1,123 ingredient rows, 753,988 recipe-file bytes, and manifest-ordered fingerprint `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`. |

The exact source-ID prefix, target proposal path, and proposed alias were absent from the shared ledger and active catalog at audit time. R458 is the only prior A7 record found that names `spelt groats`; it uses the phrase only to distinguish whole kernels from the held grits candidate and does not assign it to `ingredient-ref-spelt-berries`. R170's accepted spelt-berries record had no aliases and did not adjudicate this later product wording. No previously reviewed or held `spelt groats` identity was found.

Integration attached the three new source records and an alias decision to the existing `ingredient-ref-spelt-berries` research record. No ingredient row, meal/grits candidate, or second active owner was created.

## Phrase-first picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes case, accents, ligatures, punctuation, and spaces, prefers complete word phrases, then falls back to substring matching. The audit includes display names, aliases, and attached form terms.

| Query | Current result | Projected result |
|---|---|---|
| `spelt groats` | No result. | `spelt berries` through the proposed English alias. |
| `spelt groat` | No result. | `spelt berries` by substring fallback within the plural alias; no singular alias is stored. |
| `groats` | Five: canary seed groats; hulled barley; oat groats; raw buckwheat groats; roasted buckwheat groats. | Those five plus spelt berries. |
| `groat` | The same five by substring fallback. | Those five plus spelt berries. |
| `spelt` | Eight spelt identities, including spelt berries. | Same eight; the row is already returned through its display. |
| `spelt berries`; `grains d’épeautre` | Spelt berries. | Unchanged. |
| `organic spelt groats`; `whole spelt kernels`; `hulled spelt kernels` | No result. | No result; no product qualifier or explanatory copy is stored as an alias. |
| `gruau d’épeautre`; `spelt grits` | No result. | No result; neither is assigned to the whole-kernel row. |

The only new general query result is the species-specific groats wording. The plural and singular broad `groat(s)` searches gain one relevant row; the broader `spelt` result count does not change. This is a static projection, not a UI test.

## Bundled recipe-demand audit

All **114 manifest-listed recipe files** and all **1,123 structured ingredient rows** were scanned. The complete serialized recipe files and every top-level ingredient row were searched after applying the picker’s lowercase, NFKD accent/ligature fold, punctuation-to-space conversion, and whitespace normalization. The scan found **0 recipe-file hits and 0 ingredient-row hits** for `spelt groats`, `spelt groat`, `organic spelt groats`, `spelt berries`, `grains d’épeautre`, `grain d’épeautre`, `whole spelt kernels`, `hulled spelt kernels`, `épeautre`, and `gruau d’épeautre`. No recipe link or relink is proposed.

## Forms, measurements, conversions, yields, and substitutions

- Oak Manor describes the kernels as cookable whole and grindable or flakeable at home [S01]. These are product uses, not standardized catalog forms or conversions to flour, flakes, or another grain state.
- Oak Manor's selectable package size and 1847's listed 1 kg, 2.5 kg, 10 kg, and 20 kg packages are product/package data, not household measures or reusable mass-volume relations [S01–S02]. Do not copy a retailer nutrition serving into a recipe measure; it does not establish a volume conversion.
- No source provides a density or a tested conversion between groats and spelt flour, flakes, meal, grits, or semolina. Keep `defaultDensity: null`, `unitMappings: []`, and forms empty for the existing spelt-berries identity.
- The sources provide no tested replacement ratio or method scope for substituting spelt groats for another ingredient. Add no global form conversion, contextual substitution, recipe association, yield, or measurement observation.

## Source register

Online sources were checked on 2026-10-17. S01–S03 are registered on the existing spelt-berries ledger record. Reused IDs were already registered and were not duplicated.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| `WP02-A7-SPELT-GROATS-ALIAS-R462-20261017-S01` | Oak Manor Organic, [Organic Spelt Groats (Kernels)](https://oak-manor.myshopify.com/products/organic-spelt-berries), product description and selectable sizes. | Current Ontario mill/brand page names the product `Organic Spelt Groats (Kernels)`, equates groats with “hulled spelt kernels,” says they can be cooked whole, ground, or flaked at home, and says Ontario grown and processed. | One supplier's product wording; it does not establish a universal process or Québec French label. `Organic` and `(Kernels)` are product-title qualifiers, not proposed generic aliases. The product page does not give a reusable kitchen measure or conversion. |
| `WP02-A7-SPELT-GROATS-ALIAS-R462-20261017-S02` | 1847 Stone Flour Milling, [Organic Spelt Berries](https://1847.ca/product/spelt-berries/), current product listing. | Canadian mill independently sells a named spelt-berries grain product with selectable package sizes; its page identifies the item under the mill's organic grain-berries range. | It does not call the product groats or state a hull-removal specification. The package sizes are not measures. It corroborates the existing English grain identity, not the alias by itself. |
| `WP02-A7-SPELT-GROATS-ALIAS-R462-20261017-S03` | Grains du Québec, [Épeautre](https://grainsduquebec.ca/nos-grains/epeautre), current regional grain page. | Uses the Québec French base name `épeautre`, describes the adherent hull and required post-harvest dehulling, and says whole grain is used in cooking. | Sector information rather than a product label; it does not name `spelt groats`, establish a specific retail SKU, or support `gruau d’épeautre`. |
| **Reused — ledger** `WP03-SPELTBERRIES-R170-20261016-S01` | Coop Agrobio / Comptoir Saint-Vrac, [Grains d’épeautre Bio](https://comptoirstvrac.com/product/2088), product title and use description. | Current Québec product source underlying the accepted `grains d’épeautre` display; identifies *Triticum spelta* and describes whole-grain cooking and home milling/flaking/sprouting use. | It does not use the English term `spelt groats` and does not define a groats alias. Its package/cooking values remain product-specific and are not reused as measurements. |
| **Reused — ledger** `WP03-SPELT-FLAKES-20261011-S01` | Office québécois de la langue française, [épeautre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354125/epeautre), preferred term and English equivalent. | Pairs Québec French `épeautre` with English `spelt`; supports the existing base-grain name. | Does not define a full product name for groats or provide a French translation for `spelt groats`. |
| **Reused — ledger** `WP03-BW-GROATS-QC-20261011-S02` | Office québécois de la langue française, [gruau (GDT), technical entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8430011/gruau), dated 1983. | Gives a technical, generic milling sense and an English `grits` translation, with a description that can include uncrushed grain whose outer covering is removed. | The domain is malt crushing/brewing; it is not a current spelt product label or approval for `gruau d’épeautre`. |
| **Reused — ledger** `WP03-BW-GROATS-QC-20261011-S01` | Office québécois de la langue française, [gruau (GDT), food/dish entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau), updated 2002. | Records the familiar Québec/Canada prepared-dish sense of `gruau` and notes extension to dishes made from other cereals. | It does not name dry spelt kernels or support a French alias for them. |
| **Audit** `R01` | Read-only audit of the A7 checklist, current references/forms/legacy identities/ledger, proposal and integration archive, [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), and every manifest-listed recipe. | Supports current ownership/allocation, non-duplication, source-ID checks, picker projections, corpus counts, and recipe-demand results. | Repository snapshot only; not external product, terminology, or market evidence. |

## Disposition

**Accepted and integrated:** added only the English alias `spelt groats` to `ingredient-ref-spelt-berries`; kept its canonical bilingual display, category, French aliases, density, and unit mappings unchanged. The exact regional query now finds spelt berries; generic `groats` and `groat` searches each gain this relevant row, while generic `spelt`, the existing French display, and grits/meal/semolina queries retain their prior results. No forms, measures, mappings, conversions, yields, recipe links, or substitutions were added. Static package normalization, generated-index freshness, ledger-schema validation, source ownership, picker projection, recipe corpus, UTF-8/no-BOM, and scoped whitespace checks passed. The post-integration snapshot at this batch was 1,747 references / 141 forms; 2,106 ledger records / 9,591 source entries / 8,138 distinct source IDs / 6,851 distinct source URLs; 114 recipes / 1,123 ingredient rows. No software tests were run for this database-JSON addition under `AGENTS.md`. See the [R462 integration README](../batches/wp02-a7-spelt-groats-alias-integration-r462-20261017/README.md). Section A7 remains open.
