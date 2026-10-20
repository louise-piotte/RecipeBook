# WP02 Section A7 R400: buckwheat semolina product boundary

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. This file does not change catalog JSON, ingredient forms, the research ledger, plan, roadmap, recipes, generated files, or tests.
- **Open checklist:** WP02 Section A7 continues the review of other grain meals and milling products at [plan line 2004](../../RecipeBook-global-ingredient-catalog-plan.txt#L2004).
- **Adjacent decisions:** R394 added spring wheat semolina and R397 added barley semolina. R385 held Finnish rye semolina. This proposal considers a different, non-wheat grain product; it does not reopen those decisions or the generic wheat/rye meal reviews.
- **Existing related hold:** R23 kept generic `buckwheat meal / semoule de sarrasin` unresolved. This review adds one new current mill source about a specifically named buckwheat semolina product, but does not reverse that hold.
- **Proposal-local source IDs:** `WP02-A7-BUCKWHEAT-SEMOLINA-R400-20261017-S01` through `S04`. These IDs are local to this review and are not ledger entries.
- **Scope:** Review only whether the currently source-named `buckwheat semolina` product supports a new active reference and Québec French display. Do not treat it as a decision about every product called `buckwheat meal`.

## Recommendation

**Hold buckwheat semolina outside active references.** Kaskad, a Ukrainian mill, currently names buckwheat semolina as a product distinct from its buckwheat flour and says its own semolina has coarser particles [S01]. This gives product-level evidence for one mill's class. Grains du Québec also lists `semoule` among forms in which buckwheat can be eaten [S02]. However, its page does not identify a particular retail product, define the grind, or pair that form with an English product name. The archived 1996 Statistics Canada food code pairs `Buckwheat meal` with `Semoule de sarrasin`, but supplies no process or particle specification and is not current Québec retail evidence [S03].

These sources do not establish that a Canadian or Québec product is sold under the matching English/French names, or that the locally mentioned `semoule` is the same bounded product as Kaskad's coarse semolina. The OQLF's entry for `semoule de froment` is explicitly about broken durum-wheat kernels; it does not define `semoule de sarrasin` [S04]. Keep the existing `candidate-buckwheat-meal` unresolved and do not add a separate `candidate-buckwheat-semolina` ledger record in this proposal-only review.

Do not add `buckwheat semolina` or `semoule de sarrasin` as an alias on buckwheat flour, whole buckwheat flour, raw buckwheat groats, roasted buckwheat groats, or creamy buckwheat hot cereal. The earlier R23 review records a Canadian retailer's product-specific use of `buckwheat meal` as a synonym for dark buckwheat flour and a separate supplier's coarse-ground buckwheat meal; neither source establishes a common Québec product name or general equivalence. Keep those source-specific observations attached to the existing R23 candidate decision.

Reconsider only when a current Canadian or Québec product or producer source pairs a named buckwheat semolina product with a local French display and describes a boundary that separates it from buckwheat flour and groats. A general page that only lists `semoule` as one buckwheat form is not enough.

## Current catalog and picker audit

The read-only audit used the live split seed package and current catalog sources. Snapshot hashes identify the files reviewed.

| Store | Current snapshot | Exact ownership/result |
| --- | ---: | --- |
| Active ingredient references | 1,709 rows; SHA-256 `981f28d6637b344ab05108f5d784ce619a162618bd8f922153d02355126f4b3d` | No active row owns `buckwheat semolina`, `semoule de sarrasin`, or `buckwheat meal`. Relevant rows include `ingredient-ref-buckwheat-flour` (`buckwheat flour / farine de sarrasin`), `ingredient-ref-dark-buckwheat-flour`, `ingredient-ref-light-buckwheat-flour`, `ingredient-ref-whole-buckwheat-flour`, `ingredient-ref-sprouted-buckwheat-flour`, `ingredient-ref-raw-buckwheat-groats`, `ingredient-ref-roasted-buckwheat-groats-dry`, and `ingredient-ref-creamy-buckwheat-hot-cereal`. |
| Ingredient forms | 141 rows; SHA-256 `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` | No buckwheat semolina or meal form label or match term; no exact candidate form owner. |
| Legacy import identities | 56 candidates; SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` | No buckwheat semolina or meal candidate. |
| Research ledger | 2,069 records / 9,352 source entries; SHA-256 `251108937ce6645728896ef7fcc76375515f027cb0379921b26e1167e35bb195` | No `ingredient-ref-buckwheat-semolina` record. `candidate-buckwheat-meal` remains `needs_clarification`; its measurement state is `researched_no_supported_value` and substitution state is `researched_no_supported_substitute`. Its six existing sources and unresolved decision are unchanged. |
| Recipe manifest | 114 recipe files; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | Full bundle and all manifest-listed files scanned; results below. |

The static picker projection follows `IngredientSearch.kt`: normalize accents and punctuation, prefer complete word phrases, then fall back to substring matches.

| Query | Current result(s) |
| --- | --- |
| `buckwheat semolina` | None |
| `semoule de sarrasin` | None |
| `buckwheat meal` | None |
| `buckwheat flour` | Six rows: plain, dark, light, sprouted, Tartary, and whole buckwheat flour |
| `semolina` | Six rows: durum semolina, remilled durum semolina, sorghum semolina, spring wheat semolina, barley semolina, and Sankhal |

No picker terms or aliases are proposed, so there is no projected picker change. Adding a new row would also expand the broad `semolina` results from six to seven; the full buckwheat-semolina phrases currently have no owner.

## Bundled recipe demand

All **114** manifest-listed recipe files and **1,123** ingredient rows were scanned. The scan covered full serialized recipe text and ingredient-row `originalText`, `ingredientName`, `preparation`, `notes`, and `ingredientRefId`. Phrases included `buckwheat semolina`, `semoule de sarrasin`, `buckwheat meal`, `buckwheat grits`, `buckwheat flour`, and `sarrasin`.

Results: **0 matching recipes, 0 matching ingredient rows, and 0 links** to a buckwheat semolina reference. There is no bundled recipe demand or recipe-level measurement/use context to support adding or linking an identity.

## Forms, measurements, and substitutions

Kaskad's page describes its semolina as coarser than its own flour, but provides no sieve limits for the semolina. The flour's sieve specification must not be transferred to it [S01]. Grains du Québec's page gives no amount, mass-volume observation, density, or cooking yield [S02]. No exact-class reusable measure or substitution was found in the current ledger or bundled recipe corpus. Add no forms, density, unit mappings, measures, conversions, yields, recipe links, or substitutions.

## Source register

Sources were checked on 2026-10-17. Proposal-local IDs below are not added to the shared research ledger.

| Source ID | Source and locator | Supports | Limits |
| --- | --- | --- | --- |
| **WP02-A7-BUCKWHEAT-SEMOLINA-R400-20261017-S01** | Kaskad LLC, [Buckwheat flour](https://tovkaskad.com/en/product/buckwheat-flour), comparison section and FAQ on buckwheat semolina. | The manufacturer names its buckwheat semolina separately from its flour and describes it as a coarser particle product with slower, more even liquid uptake. | This is the Ukrainian mill's own B2B product comparison, not a Canada/Québec listing or general definition. It gives no semolina sieve threshold or French label; do not transfer the page's flour specification to semolina. |
| **WP02-A7-BUCKWHEAT-SEMOLINA-R400-20261017-S02** | Grains du Québec, [Sarrasin](https://grainsduquebec.ca/nos-grains/sarrasin), “Le sarrasin du Québec” paragraph. | A current Québec grain-sector page lists `semoule` as one form in which buckwheat can be consumed, alongside whole grains, flakes, flour, and noodles. | It does not identify a product, describe grind or process, or pair `semoule` with an English retail name. |
| **WP02-A7-BUCKWHEAT-SEMOLINA-R400-20261017-S03** | Statistics Canada, [Model Food Code (1996)](https://www.statcan.gc.ca/en/statistical-programs/document/3503_DLI_D12_T22_V1_B.pdf), p. 16, F232 row 914. | Historical bilingual classification lists `Buckwheat meal / Semoule de sarrasin`. | The code is from 1996 and provides no grind, process, product example, or current Québec retail display. |
| **WP02-A7-BUCKWHEAT-SEMOLINA-R400-20261017-S04** | Office québécois de la langue française, [GDT: semoule de froment](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8889524/semoule-de-froment), definition and note, accessed 2026-10-17. | Defines `semoule de froment` as broken durum-wheat kernel and notes corn semolina for polenta. | This OQLF record does not name buckwheat semolina or establish `semoule de sarrasin` as a Québec product term. |

## Disposition

Keep `buckwheat semolina`, `buckwheat meal`, and `semoule de sarrasin` outside active references and aliases. Retain the unresolved `candidate-buckwheat-meal` record without changes. Add no forms, measures, density, mappings, recipe links, conversions, yields, or substitutions. This is a documentation-only proposal; no tests, build, or emulator checks were run.
