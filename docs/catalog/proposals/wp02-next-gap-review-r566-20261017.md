# WP02 A4 whole rye flour measurement and wheat-replacement review — R566 — 2026-10-17

## Review record

- **Reviewed and sources accessed:** 2026-10-17.
- **Status:** Integrated. The active alias and evidence are in the existing ingredient-reference and research-ledger rows; see the [R566 integration README](../batches/wp02-r566-whole-rye-flour-measure-replacement-integration-20261017/README.md). No recipe or code files were changed.
- **Scope:** Complete one bounded measurement and reusable wheat-flour replacement evidence review for the existing `ingredient-ref-whole-rye-flour`. This is separate from R555's medium rye flour review and R561's rye-meal review.
- **Exact plan anchor:** The still-open WP02 Section A4 parent at [line 1658](../../RecipeBook-global-ingredient-catalog-plan.txt#L1658) includes resolving rye milling products. The whole-rye identity item at [line 1694](../../RecipeBook-global-ingredient-catalog-plan.txt#L1694) was identity-only before R566. This separate evidence follow-up does not close the A4 parent.

## Bounded decision

**Record one named Canadian product's published serving and one evidence-only finding that no reusable whole-rye-for-wheat rule is supported. Add one exact English search alias from the Canadian manufacturer's product title.** Keep all catalog conversion and substitution behavior inactive.

The integrated change adds `whole grain rye flour` as the only new English alias of `ingredient-ref-whole-rye-flour`. It records one product-specific portion observation for Anita's Organic Mill Whole Grain Rye Flour: **1/4 cup (30 g)**, as transcribed by two Canadian retailer listings. That pairing remains a named-product Nutrition Facts serving, not a generic rye-flour measure. The existing ledger row's `measurementState` is `researched_supported` for that product-specific portion and `substitutionResearchState` is `researched_no_supported_substitute` for reusable wheat-flour replacement guidance across home-recipe types.

Do not add a default density, unit mapping, form, cup-to-mass conversion, yield, recipe link, global form conversion, contextual substitution rule, or recipe-line substitution. Preserve the product's one-serving label as an observation, and retain the bread study's 60% replacement as formula-specific research evidence only.

## Current owner, aliases, and source-ID audit

The live [`ingredient-ref-whole-rye-flour` row](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L22757) is **whole rye flour / farine entière de seigle**, category `FLOUR_AND_STARCH`. It currently has English alias `complete rye flour`, French alias `farine de seigle entière`, null `defaultDensity`, and empty `unitMappings`. The bilingual identity and aliases remain distinct from general rye flour, light/medium rye flour, rye meal, and pumpernickel products.

The corresponding [ledger record](../research-ledger.v1.json#L160717) is identity-verified, with `measurementState: not_yet_researched`, `substitutionResearchState: not_yet_researched`, eight existing source entries, and no measurement observations or substitution findings. Its current source IDs are `WP02-RYE-GRADES-20261011-S01` through `S07` and `WP02-AB-DARK-RYE-GAP-20261012-S01`; they support existing Québec terminology, identity, and grade boundaries. R566 does not reuse those IDs for the new measurement or formula evidence.

| Proposed source ID | Current ownership / R566 use |
|---|---|
| `WP02-A4-WRF-MEAS-SUB-R566-20261017-S01` | New and unowned at proposal time. Anita's manufacturer page supports the exact product title `Whole Grain Rye Flour`, product identity, described milling/use scope, and Canadian origin; it has no household quantity. |
| `WP02-A4-WRF-MEAS-SUB-R566-20261017-S02` | New and unowned at proposal time. Loblaws listing `21384443_EA` transcribes the named 1 kg product's 1/4-cup (30 g) Nutrition Facts serving. |
| `WP02-A4-WRF-MEAS-SUB-R566-20261017-S03` | New and unowned at proposal time. Voilà listing `473008EA` transcribes the same product serving; it is corroborating retail publication, not independent verification of the physical package. |
| `WP02-A4-WRF-MEAS-SUB-R566-20261017-S04` | New and unowned at proposal time. The publisher abstract for Koletta et al. supports a controlled, high-inclusion rye bread study, not a home-recipe replacement rule. |
| Reused `WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012-S10` | Remains owned by `ingredient-ref-sprouted-buckwheat-flour`. Health Canada's C.6 flour reference amount and household-measure rule may be cited as a labeling boundary only; do not copy this source into R566's product observation or treat it as a whole-rye volume measurement. |

The four new source URLs and IDs were checked against the current ledger; no current ledger URL or source-ID owner was found. Existing Québec sources remain the authority for the current French display and alias. Neither Anita's English manufacturer page nor the retailers' localized page metadata establishes a new Québec French display term, so R566 proposes no French alias.

## Bilingual and picker projection

The manufacturer uses the exact English product title **Whole Grain Rye Flour** [S01]. It is a direct whole-rye-flour variant and fills a real exact-query gap. Keep the existing French display and aliases, which are already grounded in Québec mill and terminology sources. Do not add retailer URL slug wording such as `farine de seigle grains entiers`, nor unverified `wholemeal rye flour`, `farine de seigle complète`, or any pumpernickel phrase.

The static projection applies the current phrase-first and substring-fallback behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Adding just `whole grain rye flour` would yield:

| Query | Current result | With the proposed alias |
|---|---|---|
| `whole grain rye flour` | No result | Only `ingredient-ref-whole-rye-flour` |
| `whole grain` | 3 results: Weetabix whole-grain cereal, whole grain mustard, and whole grain oat flour | 4 results, adding whole rye flour |
| `grain` | 18 results | 19 results, adding whole rye flour |
| `rye flour` | 5 rye-flour identities | Unchanged |
| `rye` / `seigle` | 11 rye-family references | Unchanged |
| `whole rye flour`, `complete rye flour`, `farine entière de seigle`, `farine de seigle entière` | Only `ingredient-ref-whole-rye-flour` | Unchanged |

No other aliases, forms, or reference identities are proposed, so the broad rye-family picker results stay as currently reviewed.

## Bundled recipe demand

I scanned all **114 manifest-listed recipes** and their **1,123 structured ingredient rows** for the whole-rye and proposed alias phrases, the current French display and alias, and direct `ingredientRefId` links. There are **zero matching recipe files, zero matching ingredient rows, and zero direct links** to `ingredient-ref-whole-rye-flour`. The bundle therefore supplies no recipe context for a reusable substitution rule and no reason to relink a recipe.

## Source findings and limits

### Product serving

Anita's current Canadian manufacturer page names a **Whole Grain Rye Flour** product, describes it as finely ground and light-textured, identifies Canadian-grown grain and its Chilliwack mill, and mentions breads, bagels, and flatbreads [S01]. The manufacturer page currently shows its four-pack as sold out; that is only a page-level availability snapshot and is not generalized.

Loblaws lists the named 1 kg product as `21384443_EA` and gives a Nutrition Facts serving of **per 1/4 cup (30 g)** [S02]. Voilà lists the same brand/product and serving [S03]. These retailer pages disclose that their product and nutrition details may change and should be verified against the package. I could not inspect a package back-panel image, so the serving is proposed as a published retail-transcribed label observation, not as independently measured mass. The two listings may share product-feed data and do not constitute two independent package tests.

Health Canada's current C.6 category assigns flours including rye a **30 g nutrition-labelling reference amount** and says the household measure is the number of tablespoons or fraction of a cup closest in weight to that reference amount [reused `WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012-S10`]. This is a label-construction rule; it does not say that every rye flour's quarter cup weighs 30 g, nor does it specify a filling method. The proposed observation is the two retailers' transcription of this product's serving statement, not an inference from C.6.

### Wheat-replacement evidence

The Anita's page recommends the product for hearty baking but gives no replacement ratio, process adjustment, or formula [S01]. Koletta, Irakli, Papageorgiou, and Skendi report replacing **60% of refined wheat flour** with wholegrain rye flour, wholegrain barley flour, or oat flakes meal in enriched wheat breads. The publisher abstract reports increased water absorption and dough-development time, lower resistance to extensibility and stretching energy, significantly smaller specific loaf volume, and good overall acceptability (>5.5) for the composite breads [S04]. This is a high-inclusion experimental bread context; it does not establish a generic recipe replacement amount, and the abstract does not provide enough full-formula/process detail to translate the result to a home recipe. The publisher page exposed only the abstract during this review, so no full-text formula or methods are claimed.

The sources therefore support preserving one 60% study context in an evidence-only finding while concluding that no reusable home-recipe wheat replacement is supported. Do not turn the tested ratio into a general rule or infer water, mixing, leavening, texture, fermentation, or yield adjustments. Any future recipe-specific flour-to-flour suggestion would need the recipe role, dish type, method, quantity, and risk scope under [Requirements FR-5](../../../Requirements.md#L322) and [§6.5](../../../Requirements.md#L641). No active substitution rule is proposed.

## Integrated ledger and catalog delta

The integrated change updates only the existing whole-rye-flour row and ledger record:

| Target | Proposed value |
|---|---|
| `aliasesEn` | Append exactly `whole grain rye flour`; retain `complete rye flour`. |
| `aliasesFr` and canonical names | Unchanged. |
| `defaultDensity`, `unitMappings` | Keep `null` and `[]`. |
| `measurementState` | `researched_supported`, for one product-specific published label portion only. |
| Observation ID | `whole-rye-flour-anitas-label-portion-r566-20261017`. |
| Observation | `relationship: portion_weight`; `value: 30`; `valueUnit: g`; `sourceQuantity: { amount: 0.25, unit: cup }`; `observedMassG: 30`; `evidenceKind: published_portion`. |
| Observation context | `foodDescription`: Anita's Organic Mill Whole Grain Rye Flour, 1 kg, Loblaws item `21384443_EA` / Voilà item `473008EA`; `foodState`: dry product as sold; `measurementMethod`: retailer pages transcribe the package serving declaration and give no fill method; `quantityBasis`: one named-product Nutrition Facts serving only, not a reusable mass-volume mapping. |
| Observation `sourceIds` | New `WP02-A4-WRF-MEAS-SUB-R566-20261017-S02` and `-S03`. Do not attach Health Canada's reference amount as a product-measure source. |
| `substitutionResearchState` | `researched_no_supported_substitute` for a reusable whole-rye-flour replacement for wheat flour across home-recipe roles and methods. |
| Finding ID / state | `whole-rye-flour-no-general-wheat-replacement-r566-20261017`; `researchState: researched_no_supported_substitute`. |
| Finding context | Whether whole rye flour has reusable wheat-flour replacement guidance across home-recipe types and roles. |
| Finding basis | Anita's manufacturer page gives qualitative baking uses but no replacement amount. One publisher abstract reports a 60% refined-wheat replacement experiment including wholegrain rye flour in enriched wheat bread; it reports meaningful dough and loaf-property changes. This supports retaining a formula-specific result, not general guidance. |
| Finding limitations | Keep the 60% result limited to the study's enriched bread experiment; abstract only was accessible. Do not encode a replacement percentage or infer hydration, mixing, leavening, or yield changes. Do not generalize across bread types, other recipes, rye grades, or products. Do not create an active global or contextual substitution rule. |
| Finding `sourceIds` | New `WP02-A4-WRF-MEAS-SUB-R566-20261017-S01` and `-S04`. |

Do not add a new ingredient reference or a product form for Anita's SKU. Do not add a French alias, active cup conversion, density, mapping, yield, recipe link, or substitution rule. The checked nested evidence subtask is below the existing whole-rye identity item at [plan line 1694](../../RecipeBook-global-ingredient-catalog-plan.txt#L1694); the Section A4 parent at [line 1658](../../RecipeBook-global-ingredient-catalog-plan.txt#L1658) remains open.

## Source register

Sources were accessed on **2026-10-17**. The four R566 source IDs are now owned by the existing whole-rye-flour ledger record.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP02-A4-WRF-MEAS-SUB-R566-20261017-S01` | Anita's Organic Mill / Nature's Path, [Whole Grain Rye Flour](https://naturespath.com/en-ca/products/whole-grain-rye-flour-aom-ca), product title, description, package listing, and origin. | Primary Canadian manufacturer source for the exact English product name and qualitative uses; current four-pack is marked sold out. It provides no serving weight or replacement amount. |
| `WP02-A4-WRF-MEAS-SUB-R566-20261017-S02` | Loblaws, [Anita's Organic Mill Organic Whole Grain Rye Flour, 1 kg](https://www.loblaws.ca/en/farine-de-seigle-grains-entiers/p/21384443_EA?source=nspt), product `21384443_EA`, Nutrition Facts and ingredients sections. | Canadian retailer transcribes `per 1/4 cup (30 g)` for the named product. Listing disclaims that nutrition information can change; actual package was not inspected. |
| `WP02-A4-WRF-MEAS-SUB-R566-20261017-S03` | Voilà, [Anita's Organic Mill Rye Flour Whole Grain, 1 kg](https://voila.ca/products/anita-s-organic-mill-rye-flour-whole-grain-1-kg/473008EA), nutritional information section. | A second Canadian retailer listing reports `per 1/4 cup (30 g)`. It is corroborating publication, potentially from the same product feed, not an independent mass test or physical package verification. |
| `WP02-A4-WRF-MEAS-SUB-R566-20261017-S04` | Koletta P., Irakli M., Papageorgiou M., and Skendi A., [“Physicochemical and technological properties of highly enriched wheat breads with wholegrain non wheat flours”](https://www.sciencedirect.com/science/article/abs/pii/S073352101400160X), *Journal of Cereal Science* 60(3) (2014), 561–568, DOI [10.1016/j.jcs.2014.08.003](https://doi.org/10.1016/j.jcs.2014.08.003), publisher abstract. | Primary study abstract reports 60% replacement of refined wheat flour with wholegrain cereal flours including rye in enriched wheat breads and associated dough/bread effects. Full text was inaccessible; no unobserved methods, formula details, or general home-baking guidance are inferred. |
| Reused `WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012-S10` | Health Canada, [Table of Reference Amounts for Food](https://www.canada.ca/en/health-canada/services/technical-documents-labelling-requirements/nutrition-labelling-table-reference-amounts-food.html), item C.6. | Current Canadian labeling reference: 30 g for flours including rye, with household measure chosen closest in weight. This is a label rule, not a whole-rye cup mass. Source ID remains owned by its existing sprouted-buckwheat record. |
| **R01 — repository audit** | Current ingredient-reference, form, and substitution-rule JSON; target ledger record; active Section A4 plan; `IngredientSearch.kt`; and all manifest-listed recipe files. | Workspace snapshot on 2026-10-17. Confirms current row/source ownership, no attached form or rule, exact static picker projections, and zero bundle demand for this reference. |

## Integration checks

Before integration, UTF-8/no-BOM, whitespace, local-link, and ID-uniqueness checks passed. The R566 changes are database-JSON-only; no application tests, build, emulator run, or deployment were run. See the integration README for package and ledger validation results.
