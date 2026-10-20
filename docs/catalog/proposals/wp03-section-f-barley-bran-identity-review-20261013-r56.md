# WP03 Section F: Barley bran identity review — 2026-10-13 (R56)

## Review record

- **Status:** Accepted and integrated on 2026-10-13 as identity-only `ingredient-ref-barley-bran`; independent Québec French review remains open. Root integration updated the reference JSON, research ledger, generated index, plan, roadmap, and batch packet. No recipe row changed.
- **Open checklist:** Section F still covers processed grain products and regional cereal/preprocessed-grain identities in the [global plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2481) and [regional/preprocessed-grain review](../../RecipeBook-global-ingredient-catalog-plan.txt#L2595).
- **Scope:** the human-food barley bran obtained from dehulled or hull-less barley grain through standard dry milling. Health Canada says that process may include steaming or tempering; those optional steps are not separate forms here.
- **Source-ID prefix:** `WP03-BARLEY-BRAN-20261013-R56-`; the prefix was absent from the ledger and proposal/batch archive before this review.
- **Recommendation:** add one identity-only `GRAIN_AND_CEREAL` reference, `barley bran / son d'orge`, with no aliases. The current English and French Health Canada pages use this direct bilingual pair and define the product separately from barley grain, bran from other cereals, and extracted barley beta-glucan. No density, unit mapping, form, measure, recipe link, yield, conversion, health claim, or substitution is proposed.

Health Canada’s current bilingual dietary-fibre list defines barley bran as a dry-milled barley fraction and uses `son d'orge` in French. CFIA’s common-name guidance says the grain source must be named when bran is not wheat bran. This establishes the identity boundary and a Canadian French display. The search did not locate a Québec product label or an OQLF entry for this exact compound, so the French wording remains subject to independent Québec review.

## Ownership and archive audit

At proposal review time, the package contained **1,380 ingredient references, 100 forms, 63 legacy-import candidates, 1,711 research-ledger records, and 114 manifest-listed recipes / 1,123 ingredient rows**. Root integration added this reference and ledger record; the current package contains **1,382 references, 100 forms, 63 legacy-import candidates, and 1,713 ledger records**.

| Surface | Current exact owner or relevant neighbor | Disposition |
| --- | --- | --- |
| Ingredient references | No exact normalized display or alias owner for `barley bran` or `son d'orge`. `ingredient-ref-barley` is the general grain. Separate bran references are `ingredient-ref-wheat-bran`, `ingredient-ref-oat-bran`, `ingredient-ref-rice-bran`, and `ingredient-ref-corn-bran`; `ingredient-ref-bran-flakes-cereal` is a formulated cereal. | Add a separate barley-milling-fraction identity; do not merge with barley grain, another cereal's bran, extracted beta-glucan, or bran-flakes cereal. |
| Forms | None of the 100 active forms has an exact `barley bran` or `son d'orge` label or match term. | No form is proposed. Optional steaming/tempering in the source does not establish distinct recipe states. |
| Legacy import | No exact normalized display or alias owner among the 63 candidates. | No promotion or remapping. |
| Research ledger | At proposal time, no exact `barley bran`, `son d'orge`, or proposed reference ID record existed. The existing `ingredient-ref-barley` record has OQLF's `orge / barley` source (`WP03-GENERIC-BARLEY-R52-20261013-S01`) but does not review bran. | Root added a separate `ingredient-ref-barley-bran` ledger record and retained the generic barley record unchanged. |
| Proposal and batch archive | No focused barley-bran identity or terminology review and no prior occurrence of the proposed source-ID prefix. Searches found no exact candidate phrase in the current Section F archive. | This is a distinct processed-grain boundary, not a reopening of the R52 generic barley identity or existing cereal-bran rows. |

At proposal time, the new reference identifier `ingredient-ref-barley-bran` was absent from references, forms, legacy candidates, and ledger record IDs. Root has since allocated it to the accepted identity-only reference and corresponding ledger record.

## Picker consequences

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) prefers complete normalized word phrases and falls back to substring matching only if no phrase match exists. A projection with the proposed bilingual display and no aliases gives:

| Query | Current result count | Projected result count | Consequence |
| --- | ---: | ---: | --- |
| `barley bran` | 0 | 1 | Exact query selects the proposed reference. |
| `son d'orge` | 0 | 1 | Exact French query selects the proposed reference. Accent and apostrophe normalization do not create another owner. |
| `bran` | 6 | 7 | Broad query gains the barley-bran reference alongside bran flakes and existing bran products. |
| `barley` | 14 | 15 | Broad grain query gains one explicitly named barley product. |
| `orge` | 14 | 15 | Broad French grain query gains the same product. |
| `wheat bran`, `oat bran`, `corn bran`, `rice bran`, `bran flakes`, `barley flakes` | Existing qualified owner(s) | Unchanged | Exact source-grain and prepared-cereal phrases keep their current owners. |

Do not add bare `bran`, `son`, `barley`, `orge`, `barley fibre`, `barley fiber`, or `barley husk` aliases. They would broaden unrelated bran, grain, hull, or dietary-fibre searches without improving exact identification.

## Bundled recipe demand

The full manifest-listed package has **zero of 114 recipe files and zero of 1,123 ingredient rows** containing `barley bran`, `son d'orge`, or the checked qualified variants. No bundled line links to a barley-bran candidate. No recipe edit or reference link is proposed.

## Numeric and substitution limits

Health Canada’s accepted-fibre definition identifies a milling fraction and optional processing steps, not a kitchen measure. Its physiological-effect classification is not a transferable recipe quantity or an app health claim. The CFIA labelling page discusses declared serving sizes generally but supplies no barley-bran portion or conversion. The reviewed sources provide no density, cup weight, dry-to-cooked yield, household measure, or amount-qualified recipe substitution. Keep `defaultDensity: null`, `unitMappings: []`, forms, package yields, conversions, and substitutions empty. Do not infer equivalence with wheat, oat, rice, or corn bran.

## Source evidence

| Source ID | Source and locator | Supports / limits |
| --- | --- | --- |
| `WP03-BARLEY-BRAN-20261013-R56-S01` | Health Canada, [List of Dietary Fibres Reviewed and Accepted by Health Canada's Food Directorate](https://www.canada.ca/en/health-canada/services/publications/food-nutrition/list-reviewed-accepted-dietary-fibres.html), Table 1, “Brans”; rechecked 2026-10-13. | Names `Barley bran` and defines it as obtained from dehulled or hull-less barley grain through standard dry milling, which may include steaming or tempering. Establishes human-food ingredient scope and product boundary; its fibre/claim classification is not imported as app nutrition or health advice. |
| `WP03-BARLEY-BRAN-20261013-R56-S02` | Health Canada, [Liste des fibres alimentaires évaluées et acceptées par la Direction des aliments](https://www.canada.ca/fr/sante-canada/services/publications/aliments-et-nutrition/liste-fibres-alimentaires-evaluees-acceptees.html), Table 1, “Sons”; rechecked 2026-10-13. | Uses `Son d'orge` and provides the same barley-bran definition in French. Supports the Canadian French display; it is not an OQLF ruling or a Québec package label. |
| `WP03-BARLEY-BRAN-20261013-R56-S03` | Canadian Food Inspection Agency, [Labelling and composition requirements for grain and bakery products](https://inspection.canada.ca/en/food-labels/labelling/industry/grain-and-bakery-products), “Common name — Bran”; rechecked 2026-10-13. | States that unqualified `bran` is understood as wheat bran and that a different grain source must be named, giving `oat bran` as an example. Supports keeping barley bran explicit and distinct; it does not define barley-bran processing or French wording. |
| Reused `WP03-GENERIC-BARLEY-R52-20261013-S01` | OQLF, [GDT: orge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8880282/orge), definition and English equivalent; last updated 2019. | Supports the `orge / barley` component and the existing generic-grain owner only. It does not define barley bran or establish `son d'orge` as an OQLF-approved compound. |

## Proposed disposition

Add identity-only `ingredient-ref-barley-bran` as `barley bran / son d'orge`, category `GRAIN_AND_CEREAL`, with empty alias arrays. Keep it separate from barley grain, barley flour, barley meal, barley beta-glucan concentrate, barley flakes, bran from other grains, and bran-flakes cereal. Preserve the French display as supported Canadian terminology pending independent Québec review. Add no form, measurement, density, unit mapping, recipe link, conversion, cooking yield, health claim, or substitution. Section F remains open.

## Root integration result

Accepted as recommended. The live reference has empty alias arrays, null density, empty unit mappings, and category `GRAIN_AND_CEREAL`; `ingredient-ref-barley-bran` has a verified identity record with no supported measurement or substitution. No recipe link, form, legacy candidate, or additional active behavior was added. The regenerated catalog index now contains 1,382 references. Static seed-package normalization, ingredient-reference normalization, catalog generation, and research-ledger validation passed; the ledger has 1,713 records and zero errors. No app tests or emulator checks were needed for this database-JSON addition. See [`wp03-section-f-barley-bran-identity-integration-20261013/README.md`](../batches/wp03-section-f-barley-bran-identity-integration-20261013/README.md).
