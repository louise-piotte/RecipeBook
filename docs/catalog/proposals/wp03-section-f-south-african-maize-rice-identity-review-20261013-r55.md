# WP03 Section F: South African maize rice identity review — 2026-10-13 (R55)

## Review record

- **Status:** Root accepted and integrated on 2026-10-13. The canonical reference and research-ledger JSON, generated catalog, Section F checklist, plan, roadmap, this decision note, and batch README were updated; no recipe, form, conversion, or substitution data changed.
- **Scope:** the South African dry-milled maize product sold under the grade/product name *maize rice*, including the directly source-attested alternate name *mealie rice*. This is not rice grain, generic maize grits, samp, or a prepared dish.
- **Open checklist:** the Section F item for regionally significant cereal mixes and preprocessed grains remains open in the [global plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2587) and the [plant-grains checklist](../batches/plant-grains-cereals.md#L266). The R54 samp integration specifically keeps maize rice separate.
- **Recommendation:** add one identity-only `GRAIN_AND_CEREAL` reference for South African *maize rice*. Use `maize rice` in both locale display fields as a **provisional borrowed product name** until Québec French terminology is established; do not present `riz de maïs` as an approved translation. Add only the English alias `mealie rice`, which a current South African retailer identifies as another name for the same product. Keep all measurements, forms, conversions, yields, recipe links, and substitutions empty.

South African product standards and current local supplier pages establish a distinct maize product sold as *maize rice*. The 2016 grading table gives it a separate classification and sieve criteria from samp and maize grits. A current manufacturer describes its own maize-rice product as finely cut maize with some bran and germ removed; that formulation is product-specific, not a universal catalog attribute. The English product name and *mealie rice* synonym are established in current South African retail usage. The sources checked did not establish a Québec French name; the English product term in the French display therefore remains provisional.

## Ownership, alias, form, and archive audit

Read-only audit of the refreshed live package after R54: **1,379 ingredient references, 100 forms, 63 legacy-import candidates, 1,709 ledger records, and 114 manifest-listed recipes / 1,123 ingredient rows**.

| Surface | Current owner/result | Disposition |
| --- | --- | --- |
| South African maize products | `ingredient-ref-south-african-samp` is now `samp / samp`, category `GRAIN_AND_CEREAL`, with no aliases, density, or unit mappings. | Preserve R54's identity and do not merge it with maize rice. The 2016 grade criteria distinguish the two products. |
| Rice | `ingredient-ref-rice` is `rice / riz` with English alias `chawal`; the active catalog also has named rice grains, flours, flakes, cereals, and processed rice products. No reference owns exact `maize rice` or `mealie rice`. | Add a separate maize-product identity. Do not add `maize rice` or `mealie rice` as aliases to rice or any rice-grain identity. |
| Nearby corn products | `ingredient-ref-cornmeal` is `cornmeal / semoule de maïs` with alias `corn meal`; `ingredient-ref-hominy-corn` is `hominy corn / maïs lessivé` with alias `lyed corn`; `ingredient-ref-hominy-grits` is `hominy grits / gruau de maïs`; `ingredient-ref-corn-kernels` is `corn kernels / maïs`; `ingredient-ref-corn-poha` is `corn poha / poha de maïs` with `maize poha` among its English aliases; `ingredient-ref-popcorn` now has the R53 French alias `maïs éclaté`. | Do not map maize rice to cornmeal, generic grits, lye-treated hominy, unprocessed kernels, flattened maize, or popped corn. OQLF's broad *semoule de maïs* term already belongs to cornmeal; it is not an approved French alias for maize rice. |
| Forms | None of the 100 active forms has exact `maize rice`, `mealie rice`, `mielie rys`, or `riz de maïs` as a form label or match term. | No dry/cooked or grind form is proposed. The regulatory sieve grade is part of product identity evidence, not a form relation. |
| Legacy import | No exact normalized display or alias for `maize rice`, `mealie rice`, `mielie rys`, or `riz de maïs` occurs among the 63 legacy candidates. | No legacy promotion or remapping. |
| Research ledger at proposal snapshot | There was no maize-rice record or candidate. The only exact `maize rice` wording found in the 1,709 records was in R54's South African samp record, where the government source lists maize rice as a separate neighboring grade. | Root integration added a separate maize-rice record and left the samp record unchanged. |
| Proposal, batch, and plan archive | Existing mentions are contextual: the R54 proposal/integration and the open regional/preprocessed-grains checklist say to keep maize rice separate. No focused maize-rice identity or terminology review was found. The source prefix `WP03-SA-MZRICE-20261013-R55-` was unused before this proposal. | This review advances a separate product boundary within the still-open Section F checklist; it does not reopen R54. |

## Picker consequences

The live picker in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) prefers complete normalized word phrases and falls back to substring matching only when no phrase match exists. This proposal-time projection compares the pre-integration package with the proposed row:

| Query | Current | If integrated |
| --- | --- | --- |
| `maize rice` | No result | Proposed maize-rice reference only |
| `mealie rice` | No result | Proposed maize-rice reference only |
| `maize` | `ingredient-ref-corn-poha` | `ingredient-ref-corn-poha` plus proposed maize-rice reference |
| `mealie` | No result | Proposed maize-rice reference only; this follows the source-attested `mealie rice` alias and is a documented partial-query expansion |
| `rice` | 51 references | 52 references; this generic query is already broad |
| `rice flour` | 7 rice-flour references | Unchanged at 7 |
| `meal` | 5 references | Unchanged at 5 because existing phrase matches prevent substring fallback |
| `samp` | `ingredient-ref-south-african-samp` only | Unchanged; no samp alias or identity collision |
| `riz de maïs` | No result | Still no result; no unsupported French alias is proposed |

The complete phrase *maize rice* remains an exact query for the new reference even though the broad `rice` and `maize` searches expand. Do not add generic aliases `rice`, `maize`, `corn rice`, `maize meal`, `grits`, or `corn grits`. Do not add `mielie rys` without a directly relevant consumer/source label. The proposed borrowed French display is searchable under the source product name while independent Québec wording remains open.

## Bundled recipe demand

The full manifest-listed corpus has **zero of 114 recipes and zero of 1,123 ingredient rows** containing `maize rice`, `mealie rice`, `mielie rys`, or `riz de maïs`; no recipe line references a maize-rice candidate. R54's samp line remains separate. No recipe link or recipe edit is warranted.

## Numeric and substitution limits

The South African 2016 grading table defines the maize-rice class by particle-sieving criteria: at least 90% passes a 4.0 mm sieve and no more than 5% passes a 1.18 mm sieve. The same table separately classifies samp and several maize-grits grades. These are regulatory granulation thresholds for product classification, not household measures, density observations, or recipe conversions; they do not define a unique size for each kernel or a universal retail specification outside that grade.

Current sellers list kilogram package sizes, which are package quantities only. Botselo's manufacturer page markets its product as a lighter alternative to conventional rice, but supplies no recipe scope or substitution ratio. No source reviewed gives a transferable density, cup weight, cooking yield, dry-to-cooked conversion, or safe recipe-level substitution. Keep `defaultDensity: null`, `unitMappings: []`, forms, and substitutions empty. Do not infer a rice substitution from the marketing claim.

## Source evidence

| Source ID | Source and locator | Supports / limits |
| --- | --- | --- |
| `WP03-SA-MZRICE-20261013-R55-S01` | South African Government, [Regulations relating to the grading, packing and marking of maize products intended for sale in South Africa](https://www.gov.za/sites/default/files/gcis_document/201601/39627rg10551gon63.pdf), Government Gazette 39627, notice R. 63 (2016), regulation 3 and Annexure Table 1. | Lists maize rice separately from samp, maize grits, and maize flour. The table sets the maize-rice sieving criteria stated above. This is the 2016 South African grade specification, not a Québec terminology source or a household-measure reference. |
| `WP03-SA-MZRICE-20261013-R55-S02` | Botselo Mills, [Mills — Super White Maize Rice](https://botselo.co.za/mills/), product description and current product range; rechecked 2026-10-13. | A South African mill lists maize rice alongside maize meal and samp and describes its own product as finely cut maize with bran and germ partly removed. It calls the product a lighter alternative to conventional rice; that marketing statement supplies no cooking equivalence or substitution ratio. The formulation is not generalized to every maize-rice grade. |
| `WP03-SA-MZRICE-20261013-R55-S03` | Woolworths South Africa, [Maize Rice 1 kg](https://www.woolworths.co.za/prod/_/A-6009189911248), current product name and description; rechecked 2026-10-13. | Says this product is also known as `mealie rice` and describes it as finely cut maize with bran and germ partly removed. Supports the English alias for the listed product. The 1 kg value is a package size, not a household measure; the listing has no Québec French label. |
| Reused `WP03-S144` | OQLF, [*semoule de maïs*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031243/semoule-de-mais), definition and usage note (updated 2019). | Defines dried-corn milling and permits fine, medium, and coarse grinds; it gives English `corn meal`. This is the active cornmeal owner's broad Québec term and does not name the South African maize-rice product. |

## Proposed disposition

Add identity-only `ingredient-ref-south-african-maize-rice` as `maize rice / maize rice`, category `GRAIN_AND_CEREAL`, with English alias `mealie rice`. Treat the repeated French display as a provisional borrowed South African product name, not a validated Québec translation. Keep French aliases empty; do not use `riz de maïs`, `semoule de maïs`, or generic rice/corn/grits terms without stronger local evidence. Add no form, density, unit mapping, measurement, cooking yield, recipe link, conversion, or substitution. The regional cereal/preprocessed-grain checklist remains open.

## Root integration decision (2026-10-13)

Accepted the identity-only row. The South African regulation names maize rice as a separate maize-product grade from samp, maize grits, and maize flour; current Botselo and Woolworths pages list the product, and Woolworths directly identifies `mealie rice` as another name. Keep `maize rice` as the provisional French display pending Québec review and keep `riz de maïs` inactive. The existing OQLF `semoule de maïs` wording remains with cornmeal. No recipe demand, reusable measurement, density, form, conversion, yield, or substitution was found or added.

The proposal audit is the pre-integration snapshot after R54: 1,379 references and 1,709 ledger records. Integration brings the current package to 1,380 references and 1,710 records; the 100 forms, 63 legacy candidates, 114 recipes, and 1,123 ingredient rows are unchanged. See the [integration record](../batches/wp03-section-f-south-african-maize-rice-identity-integration-20261013/README.md) and the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt).
