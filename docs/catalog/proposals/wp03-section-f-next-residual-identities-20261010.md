# WP03 Section F Next Residual Identity: Puffed Wheat

## Packet record

- **Reviewed:** 2026-10-10.
- **Status:** proposal only. No seed, forms, ledger, recipe, plan, roadmap, or test file was changed.
- **Scope:** one unreviewed identity from the remaining Section F puffed-grain gap. This packet does not repeat the white-rice integration, rye-berries proposal, or existing puffed-rice and crispy-rice-cereal reviews.
- **Recommendation:** accept a separate identity for plain puffed wheat, with the exact bilingual display `puffed wheat / blé soufflé`. Add no aliases, forms, measurements, conversions, yields, substitutions, or recipe links.
- **Current snapshot:** 795 ingredient references, 36 ingredient forms, 1,021 research-ledger records, 81 legacy candidates, 114 manifest-listed recipes, and 1,123 ingredient rows.

## Candidate boundary and disposition

| Candidate or wording | Disposition | Boundary |
| --- | --- | --- |
| `puffed wheat` | **Accept as a distinct food-product identity for integration review** | Plain heat-expanded wheat kernels sold as an ingredient or ready-to-eat cereal. The proposed row does not claim a particular wheat cultivar, bran content, enrichment, brand, or serving preparation. |
| `blé soufflé` | **Accept as the fr-CA display** | Usito gives this as the Québec/Canadian French equivalent of *puffed wheat* and describes wheat grains expanded by heat. Statistics Canada independently pairs the exact English/French names. Keep it as the display only; no duplicate alias. |
| `puffed wheat cereal`, `wheat puffs`, `puffed grains`, `puffed cereals`, `céréales soufflées`, and `grains soufflés` | **Do not add as aliases** | These longer or broader expressions are not needed to identify the documented product and can include a cereal use or multiple grain species. No exact bilingual authority reviewed here establishes each as a same-scope synonym. |
| `coated puffed wheat` / `blé soufflé et enrobé` | **Exclude from this identity; hold any separate row** | A withdrawn CGSB procurement specification historically separates plain Class G from syrup-coated Class H puffed wheat. Use this only as evidence of a product boundary, not a current standard. A separate current-food and terminology review would be needed before proposing a coated product row. |
| Puffed rice and crispy rice cereal | **Keep separate; no alias or merge** | `puffed rice / riz soufflé` and `crispy rice cereal / céréales de riz croustillantes` are already distinct active identities. The existing reviews and recipe 040 boundary remain unchanged. |
| Puffed grains made from other cereals | **Outside scope; do not create a broad “puffed grains” row** | A grain-qualified product name is needed to preserve species identity. This packet supports wheat only. |

## Proposed catalog row

| Stable ID | English display | fr-CA display | English aliases | French aliases | Category and data |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-puffed-wheat` | `puffed wheat` | `blé soufflé` | none | none | `GRAIN_AND_CEREAL`; `defaultDensity: null`; `unitMappings: []` |

The proposed identity describes a processed food product made from wheat kernels. Treat puffing as the defining product process, not as a dry/cooked state form of another reference: add no `ingredient-form-puffed-wheat` row. Do not attach a “whole grain” claim. CFIA’s current grain-product guidance lists puffed cereals among refined cereals for whole-grain claims; the proposed display itself makes no bran-retention or whole-grain promise.

## Recipe demand and current-state audit

The current package manifest lists 114 recipe files. I re-read those files and scanned all 1,123 ingredient rows for the exact proposed names and nearby candidate wording, using case-folded, accent-folded, ligature-folded, punctuation-folded phrase matching. Results:

- No row contains `puffed wheat`, `blé soufflé`, `wheat puffs`, `puffed wheat cereal`, `céréales de blé soufflé`, or the broader puffed-grain terms searched.
- No ingredient reference, form, ledger record, or legacy candidate contains an exact normalized candidate phrase.
- The proposed stable ID is absent. No recipe link, text edit, amount, or line-level form hint is supported by current recipe demand.
- Current nearby identities are `ingredient-ref-puffed-rice` (`puffed rice / riz soufflé`) and `ingredient-ref-rice-cereal` (`crispy rice cereal / céréales de riz croustillantes`). Their product boundaries remain distinct.

The exact bilingual pair has no normalized exact-key collision in the current references. This is an exact-name and ID audit, not a live picker-result claim. Broad searches such as `puffed` or `soufflé` can return other products; retain the full qualified display and add no broad alias.

## Keep identity, form, measures, conversions, and substitutions separate

- **Identity:** one new, separately keyed `GRAIN_AND_CEREAL` product identity for puffed wheat. Do not alias it to broad wheat terms, another species’ puffed grain, or either existing rice cereal identity.
- **Grain/product form:** the sources describe a heat-expanded grain product. This is not evidence for a generic wheat state form, a cooking state, or an ingredient-form hint. Add no form record. Keep coated puffed wheat outside this plain identity.
- **Measurements:** no density or unit mapping. Health Canada’s 2008 table lists one branded observation, `Puffed Wheat, Quaker™`, at 250 mL / 13 g. That is historical, brand-specific household-measure evidence, not a universal measure for puffed wheat. CFIA’s current Schedule K separately assigns 14 g as a regulatory “reasonable daily intake” for the broad class “Cereals, puffed”; that regulatory quantity is not a recipe serving or a volume conversion. Store neither value in the catalog.
- **Conversions and yields:** no mass-volume conversion, volume packing rule, dry-to-puffed conversion, or process yield is established for this catalog row. Do not derive one from an old product portion or the withdrawn specification’s processing description.
- **Substitutions:** no substitution rule is proposed. The sources establish product naming and processing boundaries, not interchangeable recipe performance. Do not infer that puffed wheat can replace puffed rice, crispy rice cereal, or other puffed grains.

## Source register

Sources below were reviewed on 2026-10-10. The withdrawn standard is retained only as historical boundary evidence.

| Source ID | Source and locator | Supports / limits |
| --- | --- | --- |
| `WP03-PW-20261010-S01` | Usito, [blé](https://usito.usherbrooke.ca/d%C3%A9finitions/bl%C3%A9), derived-product sense | Pairs `blé soufflé` with English `puffed wheat`; defines it as wheat grains with their envelope removed and expanded by heat, usually eaten as breakfast cereal. Supports the fr-CA display and basic product identity; does not establish aliases, a bran specification, or numeric data. |
| `WP03-PW-20261010-S02` | Statistics Canada, [MDFoodCode, archived bilingual food-code table](https://www.statcan.gc.ca/en/statistical-programs/document/3503_DLI_D12_T22_V1_B.pdf), p. 16, code 933 | Lists `Puffed wheat / Blé soufflé` under ready-to-eat breakfast cereal, separately from puffed rice and shredded-wheat cereal. Supports exact bilingual food naming and a distinct cereal product class; this archived code table is not a current food standard. |
| `WP03-PW-20261010-S03` | Canadian General Standards Board, [GCS 32.13-88, Cereals, breakfast, prepared, ready-to-eat](https://publications.gc.ca/collections/collection_2017/ongc-cgsb/P29-5-032-013-1988.pdf), §§5.1.7–5.1.8; [Government of Canada catalogue record](https://publications.gc.ca/site/eng/9.841373/publication.html) | Historically defines Class G plain `Wheat, Puffed / Blé soufflé` and Class H `Wheat, Puffed, Coated / Blé soufflé et enrobé` separately. The catalogue marks the specification withdrawn in April 2020. Supports a conservative plain/coated scope boundary only; it is not current regulatory authority. |
| `WP03-PW-20261010-S04` | Canadian Food Inspection Agency, [Labelling and composition requirements for grain and bakery products](https://inspection.canada.ca/en/food-labels/labelling/industry/grain-and-bakery-products), “Whole grain claims for cereal products” | Current guidance lists puffed cereals among extensively processed refined cereals. Supports avoiding an unqualified whole-grain claim; it does not define puffed wheat aliases or composition. |
| `WP03-PW-20261010-S05` | Health Canada, [Nutrient Value of Some Common Foods, Table 2](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/table-2-breads-cereals-other-grain-products-nutrient-value-some-common-foods-2008.html), `Puffed Wheat, Quaker™` row; [booklet notes](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/nutrient-value-some-common-foods-booklet.html) | Shows the historical named-product measure of 250 mL / 13 g. The source set is based on the 2007b CNF and identifies some values as brand-specific; use as a measurement limitation, not as a default density, recipe conversion, or current product specification. |
| `WP03-PW-20261010-S06` | Canadian Food Inspection Agency, [Information within the Nutrition Facts table](https://inspection.canada.ca/en/food-labels/labelling/industry/nutrition-labelling/nutrition-facts-table), Schedule K table, “Cereals, puffed” | Lists 14 g as the regulatory reasonable daily intake for the broad puffed-cereal class. The page explains this intake is used for regulatory evaluation of nutrient contribution; it is not an ingredient density or recipe-measure conversion. |

## Review disposition

Accept `ingredient-ref-puffed-wheat` with the exact displays `puffed wheat / blé soufflé`, no aliases, no form record, and no numeric, conversion, yield, substitution, or recipe-link data. Keep coated puffed wheat and all broader puffed-grain wording outside the row pending separate current product and Québec terminology review. The exact candidate scan found no demand among 1,123 ingredient rows.
