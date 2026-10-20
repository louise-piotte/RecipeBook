# WP02 Section A7 R412: barley grits identity

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. No catalog data, ingredient forms, legacy identities, research ledger, plan, roadmap, recipe package, generated index, or tests are changed.
- **Snapshot:** Counts, ownership, picker, and corpus results below describe the workspace before the R412–R414 integration; the integration README records the resulting state.
- **Open checklist:** WP02 Section A7 remains open for other grain meals and milling identities; see [the plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2004).
- **Candidate:** a separately named barley-grits product, not an alias for barley meal, barley semolina, cracked barley, or barley couscous.
- **Proposal-local source IDs:** `WP02-A7-BARLEY-GRITS-R412-20261017-S01` through `S04`. These are not shared-ledger records. OQLF and prior-review sources below are reused by their existing ledger IDs.
- **Scope:** assess the named barley-grits identity and the paired Québec French ingredient wording. Do not reopen the generic barley-meal hold, the R397 barley-semolina integration, or any wheat or triticale decision.

## Recommendation

**Add one identity-only reference as `barley grits / gruau d'orge`.** Keep both alias lists empty and use category `GRAIN_AND_CEREAL`.

This is a distinct, source-named milling product with three useful kinds of evidence: Shiloh Farms markets barley grits as a product and describes its own version as barley kernels cut into pieces; an Ontario retailer separately lists barley grits in its barley product category; and current bilingual Canadian product records pair the ingredient `barley grits` with the French wording `gruau d'orge` [S01–S04]. Metro’s English and French listings for the same Quebec-made Bon Matin bread (product 061077940095) pair those exact terms in a grain-blend ingredient declaration [S03]. A Summer Fresh product specification independently pairs them in the ingredient declaration for its crackers [S04].

Use `gruau d'orge` as **source-attested Québec product wording**, not as an OQLF-approved equivalent. The OQLF’s technical `gruau / grits` entry is specifically in malt crushing, while its food-domain `gruau` entry names a cooked porridge and notes that the sense can extend to other cereals [reused sources below]. The ingredient-list evidence supports this French phrase for a dry barley ingredient in that context; the broader French word should not be added as an alias.

The row should claim only the named barley-grits identity. Barley grits can be cut from products with different kernel-retention states: Shiloh describes its own product as whole hulled barley cut into six pieces, while Hinterland’s separate whole hulless barley product is also described as cut chunks called barley meal or grits [S01; reused `WP02-A7-BARLEY-MEAL-20261011-S03`]. Do not encode one kernel preparation, whole-grain claim, particle-size threshold, or cooking behavior as universal.

| Proposed field | Value |
|---|---|
| ID | `ingredient-ref-barley-grits` |
| Category | `GRAIN_AND_CEREAL` |
| English display | `barley grits` |
| French display | `gruau d'orge` |
| English / French aliases | `[]` / `[]` |
| Forms | none |
| Default density / unit mappings | `null` / `[]` |
| Recipe links, measurements, conversions, yields, substitutions | none |

## Product boundary and prior decisions

| Neighbor | Boundary to retain |
|---|---|
| `ingredient-ref-barley` — barley / orge | The whole grain is not a cut-grain product. Do not attach grits wording to the grain row. |
| `ingredient-ref-barley-semolina` — barley semolina / semoule d'orge | Keep the R397 identity and its narrowly sourced medium-size aliases. Do not add `barley grits` or `gruau d'orge` there, and do not add `semoule d'orge` to the grits row. The local ingredient specifications list barley grits and wheat semolina as separate ingredients [S04]; the active barley-semolina sources and decision remain unchanged. |
| `candidate-barley-meal` | Keep generic `barley meal` unresolved. Earlier Canadian sources use the phrase for both ground whole barley and cross-cut pieces, and had not established a Québec French label for a standalone meal. A specific `barley grits` identity does not resolve that wider phrase or make it a synonym. |
| `ingredient-ref-barley-couscous` — barley couscous / couscous d'orge | Keep `belboula` on the existing row. A barley-grits product can be cut barley kernels; the couscous sources describe a separate couscous product and include conflicting English/French ingredient details. Do not add `barley couscous`, `couscous d'orge`, `belboula`, or the broader `dchicha` family as aliases. |
| `ingredient-ref-cream-of-barley-cereal` — cream of barley cereal / crème d’orge | Keep this separately marketed hot-cereal product distinct from dry barley grits and from a prepared barley porridge. Similar breakfast uses do not establish product equivalence. |
| Cracked barley / `orge concassée` | Keep these terms separate. A Québec bread ingredient list uses `orge finement concassée` for another barley component, and one mill’s `Cracked Barley / Barley Grits` title is product-specific. Neither supports making the terms universal aliases. |
| R406 wheat meal and R409 triticale grits | Leave the R406 unqualified-wheat-meal hold and the R409 triticale-grits hold unchanged. They concern different grain identities and evidence boundaries. |

The R397 barley-semolina proposal explicitly kept `barley grits` out of the semolina aliases. This proposal preserves that decision and considers a separate row because later-audited Québec/Canadian ingredient declarations pair a grits name with a French ingredient term and a Canadian seller separately lists the English product. The prior [barley-meal boundary review](wp02-a7-barley-meal-quebec-product-boundary-review-20261011.md), [R397 barley-semolina review](wp02-section-a7-barley-semolina-identity-review-r397-20261017.md), [R41 barley couscous/Balboula boundary review](wp03-section-f-balboula-belboula-picker-boundary-hold-20261013-r41.md), and [cream-of-barley-cereal review](wp03-section-f-cream-of-barley-cereal-identity-review-20261012.md) remain intact.

## Current catalog, forms, legacy, and ledger audit

The read-only audit used the split seed package and current documentation snapshot. Hashes identify the audited files.

| Store | Snapshot | Ownership finding |
|---|---:|---|
| Active ingredient references | 1,715 rows; SHA-256 `c06d6d4c31d22f433c3fd3f7270c0f523aaa804054c253dce94e881bce1077a1` | No active name or alias owns `barley grits`, `barley grit`, or `gruau d'orge`; no `ingredient-ref-barley-grits` exists. Related active owners include barley, barley semolina, barley flour, barley couscous, barley flakes, hulled/pearl/pot barley, and cream of barley cereal. |
| Ingredient forms | 141 rows; SHA-256 `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` | No form label or match term owns grits or `gruau d'orge`. The barley forms found are dry/cooked forms on pearl barley only. |
| Legacy import identities | 56 candidates; SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` | No exact barley-grits candidate, ID, or alias was found. |
| Research ledger | 2,074 records / 9,389 source entries; SHA-256 `a3c17e5a0197238342792b8de4c511b142ae10f42509ebfab6a776aea1e95e51` | No `candidate-barley-grits` or `ingredient-ref-barley-grits` record exists. `candidate-barley-meal` remains `needs_clarification`; its measurement and substitution research remain `not_yet_researched`. The active barley-semolina record has no supported reusable measure and no supported substitution. |
| Recipe manifest | 114 recipe files; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | All listed files and their 1,123 structured ingredient rows were scanned; see the corpus audit below. |

Relevant current active values remain narrowly named: `ingredient-ref-barley-semolina` owns `barley semolina / semoule d'orge`, with `medium barley semolina` and `semoule d'orge grosseur moyenne`; `ingredient-ref-barley-couscous` owns `barley couscous / couscous d'orge` and English `belboula`; and `ingredient-ref-cream-of-barley-cereal` owns `cream of barley cereal / crème d’orge`. Neither the forms file nor the ledger has a grits-specific form, reusable measure, conversion, yield, or substitution rule.

The source-ID prefix, proposed ID, and proposal filename were absent from the current package and archive at review time. Existing mentions of `barley grits` in prior files are boundary references, not an allocated reference or alias. In particular, R397’s no-alias decision remains valid, and the existing `candidate-barley-meal` record must not be merged or replaced.

## Phrase-first picker projection

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize names and aliases, return complete word-phrase matches across entries first, and use substring matching only when there are no phrase matches. The projection also includes current form terms. No picker aliases or forms are proposed.

| Query | Current result | Projected result |
|---|---|---|
| `barley grits` | none | `ingredient-ref-barley-grits` |
| `barley grit` | none | `ingredient-ref-barley-grits` by substring fallback |
| `gruau d'orge` (accent and apostrophe folded) | none | `ingredient-ref-barley-grits` |
| `barley meal` | none | none; the generic candidate remains unallocated |
| `barley semolina`; `semoule d'orge` | `ingredient-ref-barley-semolina` | unchanged; semolina ownership remains separate |
| `barley flour` | barley flour, malted barley flour, roasted barley flour, whole barley flour | unchanged |
| `barley`; `orge` | 19 qualified barley references | prior 19 plus barley grits (20) |
| `grits` | attiéké, corn grits, hominy grits, sorghum grits (4) | prior 4 plus barley grits (5) |
| `gruau` | 9 cereal/grain results | prior 9 plus barley grits (10) |
| `semoule` | 9 results | unchanged; the proposal adds no semolina alias |
| `cracked barley`; `orge concassée` | none | none; neither phrase is proposed as an alias |

The full qualified name supports targeted English search. The French search term is the exact attested compound, while the broad query `gruau` stays visibly plural and includes the product-qualified label `gruau d'orge`. No bare `grits`, `gruau`, `dchicha`, or `belboula` alias is added.

## Bundled recipe-demand audit

I scanned every recipe JSON named by [`manifest.v1.json`](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), including the complete parsed text and each ingredient object. The corpus contains **114 recipe files** and **1,123 ingredient rows**. Searches used the same lowercasing, diacritic/ligature folding, punctuation removal, and whitespace normalization described in `IngredientSearch.kt`.

Search phrases included `barley grits`, `barley grit`, `barley grist`, `gruau d'orge`, `barley meal`, `barley semolina`, `semoule d'orge`, `barley couscous`, `barley groats`, `cracked barley`, `orge concassée`, `orge moulue`, and the exact words `barley` / `orge`. Results: **0 candidate-specific recipe files, 0 matching ingredient rows, and 0 links** to the proposed ID. The substring `orge` appears once inside the French instruction verb `dégorger`; this is not an ingredient or exact-word match. The current bundle supplies no measure or preparation context, and no recipe relink is proposed.

## Forms, measurements, and substitutions

- Shiloh Farms says its own organic grits are made by cutting hulled barley into six pieces. Its package directions use one part grits to three parts boiling water and simmering for about 20 minutes [S01]. These are product-specific cooking instructions, not a reusable mass-volume observation, universal cooking time, density, or cooking yield.
- Shiloh’s page gives conflicting whole-grain-per-serving figures: 46 g in the product description and 48 g in the page badge and lower summary [S01]. Neither is a reusable cup-to-mass relation for generic barley grits. Retail package masses, and the 520 g finished Bon Matin loaf in the Québec listing, are not grits measures [S02–S03].
- Shiloh suggests using its product in recipes calling for grits and as a replacement for hominy grits, whole barley, or rice in selected dishes [S01]. These unquantified, brand-specific suggestions provide no ratio, tested recipe, or interchangeable product specification. Do not add a global form conversion or contextual substitution.
- The sources do not establish one standard fine/medium/coarse grind, grain-retention state, or household measure for the generic identity. Add no form, default density, unit mapping, measurement observation, conversion, yield, recipe link, or substitution rule.

## Source register

Sources were checked on 2026-10-17. New IDs below are local to this proposal and are not research-ledger entries.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| `WP02-A7-BARLEY-GRITS-R412-20261017-S01` | Shiloh Farms, [Barley Grits, Organic](https://shilohfarms.com/barley-grits-organic/), product description, ingredients, and cooking instructions. | Manufacturer markets an exact `Barley Grits` product and says its own product is hulled barley cut into six pieces; supplies product-specific cooking and replacement suggestions. | The six-piece/whole-grain description, 46 g whole-grain serving statement, directions, and suggestions apply to this SKU. They do not define every barley-grits product or establish a reusable measure, conversion, or substitution. |
| `WP02-A7-BARLEY-GRITS-R412-20261017-S02` | Bulkfood 2 Go, [Barley products](https://bulkfood2go.ca/product-category/baking-supplies/barley/), product listings and Scarborough contact address. | Current Ontario retailer groups standalone `Barley Grits` listings with its barley products, separate from barley flour, barley flakes, hulled barley, and pearl barley. | The category listing does not state a producer, grain preparation, particle size, French product name, or household measure. Retail stock and prices are not treated as stable. |
| `WP02-A7-BARLEY-GRITS-R412-20261017-S03` | Metro, [Bon Matin No Sugar, No Fat Added Multigrain Sliced Bread, English page](https://www.metro.ca/en/online-grocery/aisles/bread-bakery-products/packaged-bread/whole-wheat-grain/multigrain-bread/p/061077940095) and [French page](https://www.metro.ca/epicerie-en-ligne/allees/pains-et-patisseries/pains-emballes/ble-entier-et-cereales/pain-tranche-multigrain/p/061077940095), product 061077940095, grain-blend ingredients. | English ingredient declaration uses `barley grits`; its French counterpart for the same Quebec-made product uses `gruau d'orge`. This is direct Québec-market bilingual food-label wording. | The pages describe a finished bread and a composite grain blend, not a standalone barley-grits package or milling specification. Product status/availability can change. |
| `WP02-A7-BARLEY-GRITS-R412-20261017-S04` | Summer Fresh Salads, [Snack’n go Original Hummus product specification (PDF)](https://syscoitems.ca/specifications/DIPSF71957_7264954x2.pdf), product code DIPSF71957, pp. 1–2. | Manufacturer’s bilingual specification pairs `Barley grits` with `Gruau d'orge` in the crackers’ ingredient declaration; it separately lists durum semolina / semoule de blé dur. | This is a composite Ontario snack product, dated 2023, not a standalone grits label or a milling standard. It gives no barley-grits amount or kitchen measure. |
| Reused `WP03-BW-GROATS-QC-20261011-S02` | OQLF, [gruau / grits (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8430011/gruau), technical malt-crushing entry. | Defines the technical term `gruau`, links its English term to `grits`, and distinguishes grits from finer flour or meal. Supports terminology context only. | Its domain is malt crushing and it is not a barley-specific or consumer-product term. It is reused from the existing ledger source, not added again. |
| Reused `WP03-BW-GROATS-QC-20261011-S01` | OQLF, [gruau (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau), food-domain entry. | Warns that Québec `gruau` commonly names a cooked oat-flake dish and can extend to dishes made from other cereals. This justifies keeping the full ingredient-qualified phrase and not adding bare `gruau`. | It does not define dry barley grits. Reused from the existing ledger source, not added again. |
| Reused `WP02-A7-BARLEY-MEAL-20261011-S03` | Hinterland Flour Mill, [Steel Cut Barley](https://hinterlandflour.com/products/steel-cut-barley), product description. | Describes one Canadian mill’s cross-cut hulless barley chunks as also called barley meal or grits. Supports why `barley meal` must remain unresolved and why the new row should not alias it. | It describes a specific whole-hulless product, not a universal meaning or French name. This source is already recorded on `candidate-barley-meal`; reuse rather than duplicating it. |

## Disposition

Add only identity-only `ingredient-ref-barley-grits` with the source-attested names **`barley grits / gruau d'orge`**, category `GRAIN_AND_CEREAL`, and empty aliases. Keep it distinct from barley meal, barley semolina, barley couscous, cracked barley, and cream-of-barley cereal. Add no forms, measures, density, unit mappings, conversions, yields, recipe links, or substitutions. R406, R409, and the existing neighboring decisions remain unchanged. This review is documentation-only; no software tests, build, emulator, or deployment checks were run.
