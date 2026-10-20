# WP02 Section A7 — Buckwheat Meal Boundary Review (R23)

- **Reviewed:** 2026-10-13
- **Status:** Proposal only — **hold; do not integrate** a buckwheat-meal identity, display name, alias, form, or recipe link.
- **Scope:** The dry human-food product called `buckwheat meal`, including whether the historic French name `semoule de sarrasin` is suitable for the Québec picker. This review does not reopen the accepted identities for buckwheat flour, groats, flakes, sprouted buckwheat, soba, or creamy buckwheat hot cereal, and it does not cover prepared kasha.
- **Proposal-local source IDs:** `WP02-A7-BWMEAL-20261013-R23-S01` through `S06`. These IDs are local to this proposal and are not added to the research ledger.

## Recommendation

| Field | R23 recommendation |
|---|---|
| Disposition | **Hold; no catalog integration.** The sources establish that the phrase is used for human food, but do not establish one distinct, current Québec product boundary between meal and flour. |
| ID | None. Do not allocate or reserve `ingredient-ref-buckwheat-meal`. |
| English display | None. Keep the source phrase `buckwheat meal` unassigned. |
| Québec French display | None. Do not adopt `semoule de sarrasin` from the 1996 classification as a current picker display. |
| Aliases | None. Do not attach `buckwheat meal` or `semoule de sarrasin` to buckwheat flour, sprouted buckwheat flour, groats, or hot cereal. |
| Forms, measures, recipe links, conversions, yields, and substitutions | None. |

Reopen this candidate when a current Canadian or Québec product source identifies a buckwheat meal as a product distinct from buckwheat flour, describes the milling or particle boundary, and supplies a matching French product name. Until then, treating meal as a separate identity risks splitting one flour product from its own retailer synonym or merging a distinct coarse product into flour without a local naming basis.

## A7 and archive check

The plan keeps the wider A7 review open for other grain meals at [line 1435](../../RecipeBook-global-ingredient-catalog-plan.txt#L1435). The 2026-10-10 [grain-meal and flour-boundary review](wp02-a7-grain-meals-malt-toasted-boundaries-20261010.md) cites the Statistics Canada example for buckwheat meal alongside other grain products, but its recommendation table does not assign buckwheat meal a name, alias, or processing boundary. I found no focused A7 buckwheat-meal decision in the prior proposals.

The [creamy buckwheat hot-cereal review](wp03-section-f-creamy-buckwheat-hot-cereal-identity-review-20261012.md) explicitly leaves the wider buckwheat meal, flour, and grind boundaries outside its scope. The [residual cereal review](wp03-section-f-residual-cereal-review-20261010.md) keeps raw and roasted groats separate from prepared `kacha / kasha`; it does not decide a meal identity. Those are neighboring boundaries, not prior resolutions of this candidate.

## Current catalog, ledger, and picker audit

I read the live split seed package and local catalog records on 2026-10-13. At that snapshot, the package has 1,349 active ingredient references and 98 forms; the research ledger has 1,665 records, and the legacy-import file has 64 candidates.

| Surface | Audit result |
|---|---|
| Active reference names and aliases | No exact `buckwheat meal` or `semoule de sarrasin` owner. Relevant active rows are `ingredient-ref-buckwheat-flour` (`buckwheat flour / farine de sarrasin`), `ingredient-ref-sprouted-buckwheat-flour` (`sprouted buckwheat flour / farine de sarrasin germé`), raw and roasted buckwheat groats, dried sprouted buckwheat, buckwheat flakes, puffed buckwheat, and creamy buckwheat hot cereal. Soba noodles remains a separate noodle identity. |
| Forms | No form is attached to an active buckwheat reference. No form label or match term owns either candidate phrase. |
| Legacy candidates | No buckwheat or sarrasin legacy candidate. |
| Research ledger | No buckwheat-meal candidate record or decision. Existing `ingredient-ref-kasha` records treat `kacha / kasha` as a prepared gruel, not a dry meal or a synonym for dry groats. |
| Prior proposals | The A7 archive mention and neighboring buckwheat reviews above do not define this meal product. |

Picker results below were projected from the live references and forms using the repository's `IngredientReferenceSearchIndex` rules: normalized full-word phrase matches are returned first; substring fallback is used only when there are no phrase matches.

| Query | Current result | Boundary note |
|---|---|---|
| `buckwheat meal` | No result | No active display, alias, or form contains the phrase. |
| `semoule de sarrasin` | No result | The historic bilingual pair is not currently represented in the picker. |
| `buckwheat flour` / `farine de sarrasin` | Plain and sprouted buckwheat flour | Both rows match because the complete phrase occurs inside the sprouted-flour label too. Do not route a generic meal phrase to either one. |
| `gruau de sarrasin` | Raw buckwheat groats | The active French display is `gruau de sarrasin cru`; the shortened search match does not make it a meal. |
| `kasha` | No result | The ledger candidate remains the prepared dish, not a dry ingredient alias. |
| `kacha` | Fingerroot, by substring fallback through its French alias `kachai` | This is a search collision, not a buckwheat result. Do not add `kacha` as a meal alias. |
| `buckwheat` | Eight active references | The broad query reaches multiple distinct buckwheat products and does not identify a meal. |

## Bundled-recipe demand

I scanned all 114 manifest-listed recipe files and their 1,123 ingredient rows. None contains `buckwheat meal`, `semoule de sarrasin`, `buckwheat flour`, `farine de sarrasin`, `gruau de sarrasin`, `kasha`, `kacha`, `buckwheat`, or `sarrasin`. There is no recipe demand supporting a new row, alias, or recipe link.

## Terminology evidence and limits

The evidence supports a human-food use for the English phrase and historic French wording, but it does not settle a distinct current Québec milling product:

- Statistics Canada's [NAPCS Canada 2022 examples for class 1821294](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=3&CPV=1821294&CST=17022022&CVD=1386659&Function=getAllExample&MLV=4&TVD=1384502&V=447178&VST=17022022) list `buckwheat meal for human consumption`, separately from buckwheat flour and buckwheat groats/grits. This is a product-classification example, not a milling specification or a consumer name.
- Statistics Canada's [1996 Model Food Code, row 914](https://www.statcan.gc.ca/en/statistical-programs/document/3503_DLI_D12_T22_V1_B.pdf) pairs `Buckwheat meal` with `Semoule de sarrasin` under “Cereal grains, unmilled or milled — other.” It supplies a Canadian bilingual historical classification pair, but no particle size, production method, product example, or current Québec retail evidence.
- [Grains du Québec's sarrasin page](https://grainsduquebec.ca/nos-grains/sarrasin) currently lists whole grains, flakes, semoule, flour, and noodles as forms in which buckwheat can be eaten. It confirms local familiarity with the word `semoule`, but does not explain what buckwheat semoule looks like or how it differs from flour or groats.
- The OQLF's GDT entry for [semoule de froment](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8889524/semoule-de-froment) defines broken durum-wheat kernel. That entry does not establish `semoule de sarrasin` as a Québec product term or explain its grain size.
- A current Canadian [Bulk Mart dark buckwheat flour listing](https://bulkmart.ca/collections/bulk-flour/products/dark-buckwheat-flour-stone-ground-10-kg) calls `buckwheat meal` one of the names for its dark, stone-ground buckwheat flour. This is a retailer's product-specific synonym list, not a general definition, but it directly shows the risk of adding `buckwheat meal` as a separate identity without a clearer boundary.
- A separate supplier's [Buckwheat Meal product page](https://www.stellarfoods.org/products/buckwheat-meal) labels a product `N°05 · Coarse ground` and describes it as coarsely milled from whole buckwheat groats. This supports one specific coarse meal product, but does not establish a Canadian/Québec display name or show that all products called buckwheat meal share that grind.

Taken together, these sources permit at least two uses: a Canadian retailer's synonym for a dark whole-buckwheat flour, and a supplier's specifically coarse whole-groat meal. The 1996 French classification and current Québec grain page do not resolve which current Québec product, if either, should receive a separate picker identity. I therefore leave both candidate phrases unassigned and keep them off the existing flour, groat, and hot-cereal rows.

## Measurement and substitution boundary

The active buckwheat rows have null `defaultDensity` values and empty `unitMappings`; no buckwheat form, package-yield row, or substitution rule is present in the live package. The meal sources provide no transferable mass-volume measure, density, cooking yield, or recipe substitution. Retail package sizes are product packaging, not household conversions. Do not transfer source-specific measurements for buckwheat flour, sprouted buckwheat flour, groats, or hot cereal to this unresolved meal candidate.

## Proposal-local source register

Sources were checked on 2026-10-13. These IDs identify sources for this review only; no shared ledger or catalog file is changed.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP02-A7-BWMEAL-20261013-R23-S01` | Statistics Canada, [NAPCS Canada 2022, class 1821294 examples](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=3&CPV=1821294&CST=17022022&CVD=1386659&Function=getAllExample&MLV=4&TVD=1384502&V=447178&VST=17022022). | Human-food classification example. It separates the term from flour and groats/grits at the category level but defines no product grind or Québec name. |
| `WP02-A7-BWMEAL-20261013-R23-S02` | Statistics Canada, [Model Food Code, 1996](https://www.statcan.gc.ca/en/statistical-programs/document/3503_DLI_D12_T22_V1_B.pdf), row 914. | Historical bilingual classification pair `Buckwheat meal / Semoule de sarrasin`; no process or grain-size definition. |
| `WP02-A7-BWMEAL-20261013-R23-S03` | Grains du Québec, [Sarrasin](https://grainsduquebec.ca/nos-grains/sarrasin). | Current local organization lists semoule as one buckwheat form; does not define the product's milling boundary. |
| `WP02-A7-BWMEAL-20261013-R23-S04` | OQLF, [GDT: semoule de froment](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8889524/semoule-de-froment). | Defines the named wheat product only; does not certify a buckwheat compound term. |
| `WP02-A7-BWMEAL-20261013-R23-S05` | Bulk Mart, [Dark Buckwheat Flour Stone Ground, 10 kg](https://bulkmart.ca/collections/bulk-flour/products/dark-buckwheat-flour-stone-ground-10-kg). | Current Canadian retail listing uses `buckwheat meal` as a synonym for the named dark flour; retailer usage is product-specific. |
| `WP02-A7-BWMEAL-20261013-R23-S06` | Stellar Foods, [Buckwheat Meal](https://www.stellarfoods.org/products/buckwheat-meal). | Supplier names a coarse-ground product milled from whole groats; it does not establish Québec terminology or a universal definition. |

This review does not edit the plan, roadmap, catalog JSON, research ledger, generated index, or code. No tests were run because this is a proposal-only review.
## Coordinator integration decision (2026-10-13)

Accepted as ledger-only unresolved `candidate-buckwheat-meal`. The active catalog remains unchanged; do not add an active reference, alias, form, measure, recipe link, conversion, yield, or substitution until a Canadian or Québec source establishes a distinct product boundary and local display. See the [R23 integration record](../batches/wp02-wp03-wp04-round23-gap-review-integration-20261013/README.md).
