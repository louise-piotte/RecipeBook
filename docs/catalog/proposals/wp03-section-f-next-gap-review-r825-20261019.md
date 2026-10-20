# WP03 Section F R825 — parboiled-rice CNF measurement evidence

- **Reviewed:** 2026-10-19.
- **Target:** Existing ingredient-ref-parboiled-rice, displayed as **parboiled rice / riz étuvé**.
- **Recommendation:** Record three source-scoped observations from Health Canada CNF 2015 Food Code 4472 on the existing ledger record: two dry-volume portions and one “amount to make” relation. Set only the measurement state to researched-supported for those observations. Leave the CNF 2026 Food Code row review open.
- **Write scope:** Proposal only. If accepted, update the target research-ledger JSON record only. Do not change the active reference, forms, aliases, recipes, density, unit mappings, conversions, or substitution data.

## Why this remains open

The active Section F checklist still calls for remaining grain and cereal identity and terminology coverage, with other products unresolved ([plan, line 564](../../RecipeBook-global-ingredient-catalog-plan.txt#L564)). The parboiled-rice identity itself was integrated in 2026-10-06 as **parboiled rice / riz étuvé**; its prior review explicitly imported no measures. The existing ledger is therefore identity-verified but still has a not-yet-researched measurement state and no measurement observations.

This proposal is a source-specific measurement review of that existing identity, distinct from R822’s couscous measurements and R813’s hold on a generic dry-millet form. It does not create another rice identity or a dry-rice form.

## Identity, terminology, and evidence scope

The existing OQLF source WP03-S49 gives preferred Québec French **riz étuvé** and English **parboiled rice**. It lists **riz précuit** only as contextual terminology and identifies “Converted rice” as a trademark. Keep the active aliases empty and the current bilingual display unchanged. [OQLF, *riz étuvé*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17488742/riz-etuve)

The Codex Rice Standard describes parboiling as a process that may apply to husked or milled rice; the process identity is not inherently limited to white, long-grain rice. In contrast, CNF Food Code 4472 is specifically “Grains, rice, white, long-grain, parboiled, dry / Grains céréaliers, riz blanc, grain long, étuvé, sec.” Store its measurements with that exact CNF food description and code. They must not be generalized to every parboiled-rice product, rice grain-length class, or food state. [Codex CXS 198-1995, section 2.1.1.4](https://www.fao.org/input/download/standards/61/CXS_198e.pdf)

The Health Canada [CNF 2015 Food Code 4472 serving page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4472) currently publishes:

| CNF entry | Reported value | Interpretation proposed |
|---|---:|---|
| 100 mL | 78.2 g | One historical, published dry-product portion. |
| 250 mL | 195.5 g | A separate historical, published dry-product portion. |
| “amount to make 125 mL” | 25.7 g | 25.7 g dry Code 4472 input for the stated 125 mL prepared-product amount, recorded directionally as a ledger-only cooking-yield observation. |

The page does not state the filling, packing, measuring, or weighing method for the two volume portions. They are not a reusable density, standard cup conversion, or current-package serving measure. The page’s “100 grams of edible portion = 100 grams” and 0% refuse entries are not additional kitchen measures.

For the amount-to-make entry, current CFIA [Nutrition Facts table guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/nutrition-labelling/nutrition-facts-table) says that when a product requires further preparation and no unprepared-form reference amount exists, the reference amount is the amount needed to prepare the finished-product reference amount. The page gives an iced-tea-powder example; its general guidance supports reading the CNF line as input-to-prepared-output direction. It does not establish a rice-specific cooking protocol, water quantity, hydration method, package direction, measured cooked mass, or recipe-tested yield. Preserve only the published relation: **25.7 g dry CNF 2015 Food Code 4472 product input → stated 125 mL prepared-product amount**. Do not derive a conversion ratio or activate a dry-to-cooked conversion.

Health Canada’s current [CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), dated 2026-06-19, says CNF 2026 is published as downloadable relational CSVs and that the CNF 2015 online search remains available as an interim measure. This review did not verify the Food Code 4472 row in the 2026 Food Name or measure files. Make no claim about whether Code 4472 exists there or whether any 2015 values carry forward. Keep the CNF 2026 row join open.

## Live catalog, forms, ledger, and ownership audit

The current bundled catalog contains **1,886 references** and **199 forms**. The active target is bilingual **parboiled rice / riz étuvé**, category GRAIN_AND_CEREAL, with no aliases, null default density, and empty unit mappings. No form is attached to ingredient-ref-parboiled-rice.

Its ledger record has identity state verified, measurement state not_yet_researched, and substitution research state not_yet_researched. It has no measurement observations or substitution findings. Existing source WP03-S52 already owns the exact CNF 4472 URL on this record, but its locator and support were restricted to bilingual identity wording and said that serving values were not imported. Reuse and update WP03-S52; do not create a duplicate CNF page source for this record. The separate white-rice dry form and its CNF Code 4471 evidence remain separate and are not used here.

The CFIA guidance URL already appears on unrelated ledger records. Add a unique record-scoped source ID for its use on this record, rather than reusing another ingredient’s source ID. The CNF 2026 overview is context about dataset availability only and need not be added as a measurement source on this record.

## Exact proposed ledger delta

On the existing ledger record whose recordId is ingredient-ref-parboiled-rice:

1. Update existing source WP03-S52 to accessedOn 2026-10-19, sourceKind food_composition, and a locator covering the bilingual Food Code 4472 label and its serving-size rows. Its supports text should name all three reported entries—100 mL = 78.2 g, 250 mL = 195.5 g, and “amount to make 125 mL” = 25.7 g—and state that CNF gives no filling/weighing protocol or preparation method.
2. Append this separate, record-scoped CFIA source:

   | Field | Proposed value |
   |---|---|
   | sourceId | WP03-PARBOILED-RICE-MEASURE-R825-20261019-S01 |
   | url | https://inspection.canada.ca/en/food-labels/labelling/industry/nutrition-labelling/nutrition-facts-table |
   | title | CFIA, Information within the Nutrition Facts table |
   | accessedOn | 2026-10-19 |
   | locator | “Serving size and reference amounts; further preparation; iced tea powder example.” |
   | supports | General serving-size direction for products requiring further preparation: the unprepared product quantity may be the amount needed to prepare the finished-product reference amount. Supports the direction of the CNF 4472 “amount to make” entry, not a rice-specific method, water quantity, or measured cooking result. |
   | sourceKind | other |

3. Append the three observations below. Omit ingredientFormId from all observations because this target has no form.

| Observation ID | Relationship | Exact proposed stored values | Scope |
|---|---|---|---|
| parboiled-rice-cnf2015-4472-100ml-r825-20261019 | portion_weight | value 78.2, valueUnit "g"; sourceQuantity { amount: 100, unit: "mL" }; observedMassG 78.2; observedVolumeMl 100; evidenceKind published_portion; sourceIds [WP03-S52] | CNF 2015 Food Code 4472, dry white long-grain parboiled rice; reported portion only. |
| parboiled-rice-cnf2015-4472-250ml-r825-20261019 | portion_weight | value 195.5, valueUnit "g"; sourceQuantity { amount: 250, unit: "mL" }; observedMassG 195.5; observedVolumeMl 250; evidenceKind published_portion; sourceIds [WP03-S52] | CNF 2015 Food Code 4472, dry white long-grain parboiled rice; separate reported portion only. |
| parboiled-rice-cnf2015-4472-to-make-125ml-r825-20261019 | cooking_yield | value 125, valueUnit "mL"; sourceQuantity { amount: 25.7, unit: "g" }; observedVolumeMl 125; evidenceKind published_portion; sourceIds [WP03-S52, WP03-PARBOILED-RICE-MEASURE-R825-20261019-S01]; omit observedMassG | CNF 2015 Food Code 4472 “amount to make 125 mL”; dry input to stated prepared-product amount only. No method, water quantity, or prepared mass is reported. |

For every observation, populate foodDescription, foodState, measurementMethod, and quantityBasis with the exact code, edition, state, and limitations above. The volume observations are historical published portions, not density; the cooking-yield observation is a source-specific input/output statement, not a recipe-tested yield or active conversion.

Append one accepted measurement decision citing WP03-S52 and the CFIA source. State that only these three edition- and code-specific observations are accepted, that the 2026 CNF row remains unverified, and that no global conversion or recipe instruction is implied. Set only measurementState to researched_supported. Keep identityState verified and substitutionResearchState not_yet_researched unchanged. Do not add a form, alias, density, unit mapping, conversion, cooked Code 4473 data, recipe link, or substitution finding.

## Picker projection and phrase-search audit

The live picker uses exact form-label matching first, then complete word-phrase matching anywhere inside an indexed term, then substring fallback, as implemented in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). A static projection against the active references and forms returned these current results. Because this proposal changes only ledger evidence, the projected results are identical:

| Query | Current and projected result |
|---|---|
| parboiled rice | One result: ingredient-ref-parboiled-rice. |
| riz étuvé | One result: ingredient-ref-parboiled-rice. |
| parboiled | One result: ingredient-ref-parboiled-rice, found as a phrase inside the longer term “parboiled rice.” |
| rice | 76 results, including parboiled rice; this broad subphrase match is expected. |
| riz | 70 results, including parboiled rice; this broad subphrase match is expected. |
| dry rice or riz sec | Exact existing generic-rice dry-form result only. |
| rice dry | ingredient-ref-wild-rice only, because that ordered phrase occurs in its longer indexed dry-form term. |
| dry parboiled rice, parboiled rice dry, or riz étuvé sec | No result. |

No search term, alias, reference, or form is proposed, so these broad and subphrase results do not change. Do not add a dry-form label merely to make the longer queries match: the source describes one long-grain white dry CNF product and does not support a general parboiled-rice dry form.

## Recipe demand and substitution boundary

The full manifest lists **114 recipe files** with **1,123 structured ingredient rows**. A scan of recipe names, instructions, ingredient text, and structured links found no parboiled-rice or riz étuvé mention and no reference to ingredient-ref-parboiled-rice. This proposal records source evidence for an existing identity; it does not claim current recipe demand or justify relinking a recipe.

The reviewed terminology and measurement sources do not evaluate substitutes. Keep substitution research not_yet_researched; add no finding or rule. The measurements do not establish interchangeability with generic rice, white rice, instant rice, another grain length, or cooked rice.

## Static disposition and test rule

Static inspection confirmed the target reference, absence of an attached form, existing WP03-S52 ownership, empty measurement list, source/observation ID availability, current picker projection, and zero recipe mentions. Only this proposal file is changed.

The supplied AGENTS.md rule says software testing is unnecessary when an accepted change only adds database JSON data. This proposal makes no shared data change; if accepted integration remains limited to the research-ledger JSON, do not run app tests, builds, an emulator, or deployment. Static data validation is sufficient.
