# WP04 Proposal: Bread-and-Butter Pickle Count Portion Gap — 2026-10-10

**Review date:** 2026-10-10
**Status:** Research-only proposal. The exact recipe line remains unavailable for count-to-mass use. No canonical reference, form, ledger, recipe, plan, or code change is proposed.

## Scope and recommendation

This review selects one still-open preserved-cucumber count line: one bread-and-butter pickle in Big Mac Sauce (`101#7`). The current verified identity is categorized `SAUCE_AND_CONDIMENT`, and its previous WP05 review addressed identity and recipe linking only. The pickle is a preserved cucumber product, not a fresh-cucumber measurement case. It is advanced here because the exact count line has no prior WP04/WP12 measurement review and the catalog still has no portion observation for it.

**Keep the recipe line's weight unavailable.** Health Canada's legacy Canadian Nutrient File (CNF) food code 2337 and USDA Standard Reference 28 (SR28) publish weights for sweet cucumber-pickle slices and for small, medium, or large gherkins. USDA explicitly says its sweet-pickle food includes bread-and-butter pickles; Health Canada's English/French food labels match the existing identity and a Québec manufacturer pairs the same French label with bread-and-butter pickles. These records establish source-specific portions for the stated slice or gherkin size, but recipe `101#7` does not say whether its one pickle is a slice or gherkin or give a size. The 2026 CNF relational files were not readable during this review. No numeric observation is proposed for this recipe line, and no portion below should be assigned to it.

The existing ledger measurement state is `not_yet_researched`. Leave the canonical state untouched in this proposal-only review. Substitution research also remains `not_yet_researched`; no substitution is recommended.

## Exact recipe demand and current catalog state

The local line was checked in the live recipe file, and the source page was reopened on 2026-10-10.

| Field | Current value |
|---|---|
| Recipe | `101` — *Big Mac Sauce* |
| Ingredient line | `834bade3-bdda-432f-a4a6-1cb0fec6f065-ingredient-7` (`101#7`) |
| Exact bundled text | `1 bread and butter pickle, finely diced` |
| Structured amount | `quantity: 1`, `unit: "count"` |
| Preparation | `finely diced` / `finement coupé en dés` |
| Current reference | `ingredient-ref-bread-and-butter-pickle` |
| Current display | EN `bread and butter pickle`; fr-CA `cornichons sucrés`; no aliases |
| Current reference dimensions | Category `SAUCE_AND_CONDIMENT`; `defaultDensity: null`; `unitMappings: []`; no linked form |
| Current ledger state | `identityState: verified`; `measurementState: not_yet_researched`; `substitutionResearchState: not_yet_researched`; no measurement observations |
| Saved recipe source | Joshua Weissman, `https://www.joshuaweissman.com/post/mcdonald-s-big-mac-but-better` |

The current Joshua Weissman page resolves to [`Making The McDonald's Big Mac At Home | But Better`](https://www.joshuaweissman.com/recipes/best-homemade-mcdonalds-big-mac-recipe). Its Big Mac Sauce ingredient list names one bread-and-butter pickle to dice and separately lists a splash of pickle brine. The page says the recipe serves four, but gives no pickle weight or per-person pickle amount. Keep the pickle body and brine distinct; do not divide the count by four or infer that the pickle includes a measured amount of brine.

## Corpus and prior-review check

The manifest-listed corpus contains 114 recipe files and 1,123 ingredient rows. A full scan of current `ingredientRefId` values found exactly one row for `ingredient-ref-bread-and-butter-pickle`: `101#7`. The exact line and recipe source also appear in the WP05 preserved-condiment identity review. That review and its completed identity integration retained the reference and recipe link, but explicitly added no numeric data or form. A search of the existing WP04/WP12 portion proposals and completed WP04 measurement batches found no prior measurement review of this line. The current [WP04 chipotle proposal](wp04-count-portion-next-candidate-review-20261010.md) covers a different ingredient and does not include this bread-and-butter-pickle line.

The WP04 count/edible-portion fixture item and WP07 evidence rules remain open in the catalog plan. The governing evidence rules keep ingredient identity, supported measurement, and substitution readiness separate; they prohibit inferred count weights and category defaults. See [the catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L13), [WP04](../../RecipeBook-global-ingredient-catalog-plan.txt#L497), [WP07](../../RecipeBook-global-ingredient-catalog-plan.txt#L793), and [the workflow checkpoint](../ingredient-catalog-workflow.md).

## Source evidence and measurement limits

| Proposal-local source ID | Source and exact published evidence | Match to `101#7` |
|---|---|---|
| `WP04-PICKLE-PORTION-20261010-S01` | Health Canada, [CNF serving portion, food code 2337](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2337), *Pickles, cucumber, sweet* / *Marinades, cornichons sucrés*. It lists `1 slice = 7.0 g`; `1 small gherkin (6.4 cm long) = 15.0 g`; `1 medium gherkin (7 cm long) = 25.0 g`; `1 large gherkin (7.6 cm long) = 35.0 g`; and `4 slices = 28.0 g`. It labels these as available portion sizes, gives `100 g edible portion = 100 g`, and reports total refuse of 0%. The page details say modified 2019-03-01. | Same sweet-pickle food family and French display, but its count portions distinguish a slice from three length-qualified gherkin sizes. The recipe states neither shape nor size. The 0% refuse value does not state that the count weight includes packing liquid or establish a drainage method. |
| `WP04-PICKLE-PORTION-20261010-S02` | USDA ARS, [SR28 Food Group 11 PDF, NDB 11940](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg11.pdf#page=1383), *Pickles, cucumber, sweet (includes bread and butter pickles)*. The report's edible-portion measure block lists `35 g: 1 large Gherkin (3" long)`. It also lists 160 g per cup chopped and 153 g per cup sliced or chips; those volume portions are not relevant to the recipe count. SR28 was issued September 2015 and slightly revised May 2016. | Supports a source-specific 35 g portion only for one large, 3-inch gherkin in this historical food record. This agrees with the CNF large gherkin length and weight, but neither source establishes that the recipe's unqualified pickle is large or is a gherkin. |
| `WP04-PICKLE-PORTION-20261010-S03` | Joshua Weissman, [Big Mac recipe page](https://www.joshuaweissman.com/recipes/best-homemade-mcdonalds-big-mac-recipe) — accessed 2026-10-10; the page has no publication date displayed and carries a 2024 copyright line. | Original recipe evidence for one diced bread-and-butter pickle and a separate splash of pickle brine. No size, mass, product, drainage, or portion weight is stated. |
| `WP04-PICKLE-PORTION-20261010-S04` | Health Canada, [Canadian Nutrient File overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) and [CNF 2026 dataset record](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) — accessed 2026-10-10. The overview, dated 2026-06-19, says the CNF is published as relational CSV files and describes the 2015 online tool as an interim measure. The dataset record returned 403 when opened from this review. | Confirms the public serving page is a legacy access surface and a 2026 dataset exists. This review did not verify a 2026 food/measure row for pickles; do not claim the older values remain present in 2026. The earlier [WP04/WP12 retrieval check](wp04-wp12-cnf-2026-portion-retrieval-check-20261010.md) records that the 2026 download and its files were inaccessible in this environment. |
| `WP04-PICKLE-PORTION-20261010-S05` | USDA ARS, [SR28 documentation](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/sr28/sr28_doc.pdf) — issued September 2015; slightly revised May 2016. | Dates the SR28 evidence above. It does not provide newer product or serving data. |
| `WP04-PICKLE-PORTION-20261010-S06` | Brine&Co., [Québec product catalogue](https://wccobrands.com/wp-content/uploads/2026/02/BrineCo.Sales-Catalogue-comp-.pdf), pp. 5–6; identity source already recorded as `WP05-PRESCOND-20261010-S04` in the live ledger. | Pairs the Québec product names `Cornichons sucrés` and `Bread & Butter Pickles`, supporting the food-family identity match only. Its catalog package information is not a one-pickle portion or a recipe-specific product match. |

The Health Canada CNF page and USDA SR28 both publish the same value for a **large, length-qualified** gherkin: 35 g at approximately 3 inches / 7.6 cm. That concordance is not a universal count weight. The Health Canada page also demonstrates why the missing qualifier matters: it gives 15 g for a small gherkin, 25 g for a medium gherkin, 35 g for a large gherkin, and 7 g for a slice. Do not select a row based on the recipe's later dicing instruction.

The recipe and government pages do not identify the recipe's product brand, cultivar, whether its pickle is a whole gherkin or a slice, its size, or whether the source expects draining. The published `edible portion` and refuse values must remain attributed to their own CNF/SR28 entries; they do not describe a package yield, sauce/brine mass, or post-dicing measurement method. No source authorizes treating the separate splash of brine as part of the pickle weight.

## Disposition and acceptance checks

**Disposition: blocked for the exact recipe line; no numeric observation is proposed.** Keep the current count, text, preparation, identity link, null density, empty unit mappings, and absence of forms and package yields. Preserve the verified identity. Do not add a default count mapping or update the ledger from these historical portions in this review.

If a future review resolves the line or elects to retain historical source observations, accept evidence only with the exact source food and portion qualifier attached. At minimum:

1. Preserve each source's own food description, source release/page date, reported portion text, value precision, edible/refuse qualifier, unit, and source URL. Keep source observations separate; do not average the two 35 g values.
2. Keep `1 slice = 7 g` separate from each length-qualified gherkin measure, and keep low-sodium pickle records separate from standard sweet-pickle records. Do not derive a per-pickle weight from a multi-slice amount.
3. Do not apply any slice or gherkin observation to `101#7` unless the recipe's actual count unit/size is established. `Finely diced` describes a later preparation and does not identify the pickle before dicing.
4. Do not create a density, `count`/`item` unit mapping, form conversion, reusable package yield, drained/edible yield, cooking yield, or recipe edit from this evidence.
5. Keep the brine line distinct and do not invent an amount of packing liquid attached to the pickle.
6. Leave substitution research untouched. The recipe's use of one bread-and-butter pickle does not establish a substitute for raw cucumber, dill pickle, relish, or any other preserved condiment.
7. A future exact match should first compare the corresponding 2026 CNF food and measure rows if those files become accessible, then verify that the source portion's size and basis match the recipe's actual item.

The remaining gap is specific: the only bundled recipe requests one bread-and-butter pickle but omits its size and shape, while available official historical portions depend on slice-versus-gherkin and gherkin length. A readable 2026 CNF row could refresh source currency, but it cannot by itself supply the missing recipe qualifier.

## Local evidence and unchanged scope

- Current reference, forms, and ledger record were read from `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`, `ingredient-forms.v1.json`, and `docs/catalog/research-ledger.v1.json` on 2026-10-10.
- The recipe text, structured amount, preparation, source URL, and link were read from [bundled recipe 101](../../../app/src/main/assets/seed/bundled-library/recipes/101-sauce-bigmac-bigmac-sauce-834bade3-bdda-432f-a4a6-1cb0fec6f065.v1.json) on 2026-10-10.
- Prior identity-only scope is documented in [the WP05 preserved-condiment review](wp05-preserved-condiments-exact-recipe-demand-review-20261010.md) and [its completed integration checkpoint](../batches/wp02-wp05-roasted-flour-preserved-condiment-followup-integration-20261010/README.md). The current canonical record has no aliases after that integration.
- The source identifiers beginning `WP04-PICKLE-PORTION-20261010-` are local to this proposal; they are not proposed ledger source IDs.
- No canonical package, ledger, recipe, workflow, plan, roadmap, test, or code file was edited. No tests were run.

## Coordinator integration result — 2026-10-10

Integrated the research blocker on the existing verified reference. The ledger now records
`measurementState: blocked_pending_evidence` with Health Canada CNF and USDA SR28 source entries;
it contains no measurement observation or count mapping. The recipe remains `1 bread and butter
pickle, finely diced`, and substitution research remains `not_yet_researched`. The recipe page and
Québec product label reuse their existing ledger evidence. The historical slice/gherkin portions
remain excluded from runtime and recipe-line measurements because the exact item’s shape and size
are unspecified.
