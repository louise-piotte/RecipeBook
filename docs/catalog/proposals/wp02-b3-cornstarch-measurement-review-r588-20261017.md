# WP02 B3 R588: cornstarch portion-evidence review

- **Reviewed:** 2026-10-17.
- **Status:** Integrated into the shared research ledger and catalog review log. The five published portions remain source-specific; no active density, unit mapping, conversion, form, recipe link, or substitution was added. See the [integration README](../batches/wp02-b3-cornstarch-portion-evidence-integration-r588-20261017/README.md).
- **Scope:** Published volume-to-mass portions for the existing `ingredient-ref-cornstarch` identity. This is a measurement evidence review, not an alias, form, conversion, or substitution review.
- **Open plan anchor:** [Continue broader WP02 B2/B3 flour and starch review](../../RecipeBook-global-ingredient-catalog-plan.txt#L15900) is still unchecked at line 15855. The checked R585 pea-starch review is immediately below it at line 15856. The narrower B3 checklist at lines 3036–3079 remains open as well; its current parent is “Water-chestnut flour and other documented regional starches.” This proposal examines the separate existing cornstarch reference and does not revisit pea-starch evidence.
- **Recommendation:** **Evidence-only add** five source-specific `portion_weight` observations to the existing cornstarch ledger record if accepted: two Health Canada CNF 2015 Food Code 4419 volume portions, one King Arthur chart portion, and two Bob’s Red Mill chart portions. Keep the default density and unit mappings empty, and leave `measurementState: blocked_pending_evidence` because the sources do not define a common volume convention or fill method and the two charts differ at their nominal quarter-cup portions. Do not add a form, conversion, recipe link, or substitution.

## Current record and boundary

The active reference is `ingredient-ref-cornstarch`, displayed as `cornstarch / fécule de maïs`, category `FLOUR_AND_STARCH`, with aliases `corn starch` and `amidon de maïs`. Its `defaultDensity` is `null`, `unitMappings` is empty, and no `IngredientForm` points to it. The ledger currently has `identityState: verified`, `measurementState: blocked_pending_evidence`, `substitutionResearchState: blocked_pending_evidence`, and **zero measurement observations**. Existing substitution findings concern sauce/gravy thickening and an unresolved cornstarch/tapioca-thickening ratio; this proposal changes neither.

OQLF’s current entry lists both *fécule de maïs* and *amidon de maïs* as preferred Québec French terms and pairs *amidon de maïs* with `corn starch`. Retain the current display and aliases exactly; add no French or English terms. [WP02-S89]

## Source findings and proposed observations

The source rows support observations that preserve each publisher’s own basis. They do not support a single active mass-per-volume value:

In the table, `S01` refers to the proposed Health Canada source ID `WP02-B3-CORNSTARCH-MEASURE-R588-20261017-S01`.

| Proposed observation ID | Source and exact published row | Proposed record scope | Limit |
|---|---|---|---|
| `cornstarch-cnf4419-100ml-541g-r588-20261017` | Health Canada 2015 CNF Food Code 4419: 100 mL = 54.1 g. [S01] | CNF’s generic bilingual item “Grains, cornstarch / Grains céréaliers, fécule de maïs,” 100 mL portion. | Food-code-specific database portion; the page does not state a powder-fill or settling method. Not a current 2026 CNF row claim. |
| `cornstarch-cnf4419-250ml-1352g-r588-20261017` | Health Canada 2015 CNF Food Code 4419: 250 mL = 135.2 g. [S01] | Same CNF food code, 250 mL portion. | Preserve the source’s metric quantity. Do not reinterpret it as RecipeBook’s cup or as a universal density. |
| `cornstarch-kab-chart-quarter-cup-28g-r588-20261017` | King Arthur Baking Ingredient Weight Chart: “Cornstarch,” 1/4 cup = 1 oz = 28 g. [WP07-KAB-IWC] | Unqualified chart entry, at the chart’s 1/4-cup basis. | The chart does not specify product/brand, cup capacity, or a row-specific fill method. Keep this as a chart observation. |
| `cornstarch-bobs-chart-quarter-cup-32g-r588-20261017` | Bob’s Red Mill Flour Weight Chart: “Cornstarch,” 1/4 cup = 32 g. [WP02-B23-RESIDUAL-20261010-S05] | The manufacturer chart’s cornstarch row, at its 1/4-cup basis. | The article describes itself as converting “our flours” from cups to grams and links its cornstarch row to a product page; that linked product page did not load in this review. The chart does not state the cup capacity or cornstarch-row method. Do not represent this as a verified package Nutrition Facts serving. |
| `cornstarch-bobs-chart-cup-128g-r588-20261017` | Bob’s Red Mill Flour Weight Chart: “Cornstarch,” 1 cup = 128 g. [WP02-B23-RESIDUAL-20261010-S05] | Same chart row, at its 1-cup basis. | Retain the published row as-is; do not convert between this chart’s cup and CNF millilitres because the chart’s cup convention is unstated. |

For integration, use `relationship: portion_weight`, `evidenceKind: published_portion`, and each source’s exact `sourceQuantity` and `value`. Describe the CNF entries as Food Code 4419, not as a brand or retail package. Describe the King Arthur value as that chart’s unqualified row. Describe the Bob’s values as that manufacturer chart’s row, without asserting the inaccessible linked product page’s details. Each observation should state that method/cup conventions are unspecified where applicable. Keep the numeric values separate; do not average them, combine them into an interval, scale one source to another, or derive a `mass_density` observation.

The nominal quarter-cup values differ: King Arthur reports 28 g, while Bob’s Red Mill reports 32 g. The chart pages do not supply a shared cup-volume or fill protocol, so this difference is a reason to preserve source ownership and leave a generic measure unresolved. CNF’s 100 mL and 250 mL portions are internally close to a proportional pair, but their matching Food Code and unstated preparation method do not independently establish a physical bulk density or the recipe app’s cup conversion.

## Current-edition boundary

Health Canada’s current [CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says CNF 2026 is published as relational CSV files and that the 2015 online CNF remains accessible as an interim measure. The 2015 Food Code 4419 page is directly accessible and states its date modified as 2019-03-01. The official [CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) lists Food Name and Measure Weight Conversion CSV resources, but its CSV download was not accessible through the research browser in this review. Therefore, this proposal makes no claim about whether Food Code 4419 or a successor row appears in CNF 2026 and does not label the 2015 values current-edition values. If integrating the current-CNF context source, reuse existing source ID `WP03-QCM-20261012-S05`; do not create another ID for that Canada.ca URL.

## Picker, French wording, and source ownership

- **Picker:** No active reference term changes. The existing full-phrase queries `cornstarch`, `corn starch`, `fécule de maïs`, and `amidon de maïs` keep their present result sets. No new broad corn/flour search path is introduced.
- **FR-CA:** Retain the existing canonical *fécule de maïs* and alias *amidon de maïs*. Both are OQLF-preferred; no translation of a source’s measurement row is added to the picker.
- **Candidate ID:** Reuse only `ingredient-ref-cornstarch`. No second cornstarch identity or measurement-specific form is proposed.
- **Source IDs:** `WP07-KAB-IWC` is the existing ledger ID for the exact King Arthur chart URL; reuse it. `WP02-B23-RESIDUAL-20261010-S05` is the existing ID for the exact Bob’s Red Mill chart URL, already used for arrowroot and rice-flour rows; reuse it. The exact Health Canada 2015 Food Code 4419 URL has no ledger entry, so the proposed new source ID is `WP02-B3-CORNSTARCH-MEASURE-R588-20261017-S01`. The proposed R588 source prefix and five observation IDs were absent from the current proposal/batch and ledger archives. No existing source ID is being reassigned to a different URL.

## Bundled recipe demand

A manifest-ordered scan covered all **114** bundled recipe files and **1,123** ingredient rows. It found **9 rows linked to `ingredient-ref-cornstarch` in 8 recipes**; all exact amounts are below. The recipes include both volume amounts and direct gram amounts, but no line pairs the mass and volume of the same product. In “Strawberry Fraisier Cake,” the two cornstarch entries are 20 g and 50 g in separate sponge/cream groups, not a mass-volume pair. These recipe quantities are demand evidence, not new measurements.

| Recipe | Stored cornstarch line | Stored unit | Recipe source recorded in the bundle |
|---|---|---|---|
| Blueberry Cake Filling | 2 tbsp | tbsp | Baking With Butter |
| Cherry Cake Filling | 2 tbsp cornstarch or arrowroot | tbsp | Baking With Butter |
| Strawberry Fraisier Cake | 20 g (sponge) | g | Anne-Sophie / Fashion Cooking |
| Strawberry Fraisier Cake | 50 g (mousseline cream) | g | Anne-Sophie / Fashion Cooking |
| Salmon Pot Pie | 1 tbsp | tbsp | Ricardo Cuisine |
| Maple Chicken | 3 tbsp | tbsp | Foodie Badge |
| Chocolate Pudding | 4 tsp | tsp | Five Heart Home |
| Blueberry Pie | 1 tbsp | tbsp | Preppy Kitchen |
| Raspberry Pie | 1 tbsp | tbsp | The Busy Baker |

The one recipe-level “cornstarch or arrowroot” line stays attached to the current cornstarch reference. This portion review does not turn that alternative into a substitution rule or alter the line. No recipe is edited or linked to a new form.

## Forms, conversions, substitutions, and disposition

Do not create a dry/raw/cooked cornstarch form: the sources report flour/starch chart or database portions but no distinct same-ingredient recipe form. Do not activate `defaultDensity`, `unitMappings`, a unit conversion, or a cup-to-mass rule. In particular, the CNF values use millilitres and the charts use unspecified cups; no source defines the crosswalk required to make those interchangeable in the app.

Leave `substitutionResearchState` and the current bounded thickening findings unchanged. Portion weights do not validate a cornstarch replacement ratio. The separate unresolved tapioca-thickening amount conflict, and the existing cornstarch-to-flour sauce/gravy finding, are outside this review. Add no global or contextual substitution rule and no recipe-line substitution link.

If accepted, the ledger delta is limited to one CNF source entry plus five source-specific `portion_weight` observations on `ingredient-ref-cornstarch`; retain `measurementState: blocked_pending_evidence` and all active numeric fields as they are. This preserves the observed evidence while leaving general measure behavior for later evidence with defined volume capacity and method.

## Source register

| ID | Direct source | Support and limitations |
|---|---|---|
| **WP02-B3-CORNSTARCH-MEASURE-R588-20261017-S01** | Health Canada, [CNF 2015 serving portion, Food Code 4419](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4419), accessed 2026-10-17. | Lists “Grains, cornstarch / Grains céréaliers, fécule de maïs”; 100 mL = 54.1 g, 250 mL = 135.2 g, and 1 serving = 20.0 g. Only the two volume/mass pairs are proposed as observations. The 20 g serving has no volume and is not converted. The page is the 2015 online CNF route, with page details dated 2019-03-01; no CNF 2026 row claim is made. |
| **Reuse `WP07-KAB-IWC`** | King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart), accessed 2026-10-17. | The “Cornstarch” row states 1/4 cup = 1 ounce = 28 g. The chart recommends a digital scale but does not give the cup capacity or a row-specific cornstarch method. This URL and source ID already occur in the ledger for other ingredient records. |
| **Reuse `WP02-B23-RESIDUAL-20261010-S05`** | Bob’s Red Mill, [Flour Weight Chart](https://www.bobsredmill.com/articles/bobs-red-mill-flour-weight-chart), accessed 2026-10-17. | The “Cornstarch” row lists 32 g per 1/4 cup and 128 g per 1 cup. The page’s general flour advice and separate row link do not specify the cornstarch cup or packing method. This URL and source ID already occur in the ledger for arrowroot and rice-flour chart rows. |
| **Reuse `WP02-S89` for terminology only** | OQLF, [amidon de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357607/amidon-de-mais), accessed 2026-10-17. | Lists *amidon de maïs* and *fécule de maïs* as preferred terms and English `corn starch`; it supports retaining current FR-CA wording and supplies no measurement. |
| **Reuse `WP03-QCM-20261012-S05` for edition context only** | Health Canada, [Canadian Nutrient File overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), page details 2026-06-19. | Describes the 2026 CSV publication and the 2015 online interface as interim access. It does not establish a CNF 2026 cornstarch row value. |

## Review checks

- [x] Read `AGENTS.md`, the active roadmap, the open plan parent and B3 checklist, and prior flour/starch proposals and batch archive.
- [x] Confirmed the active reference, aliases, null density, empty unit mappings, absence of attached forms, and current ledger state/zero measurement observations.
- [x] Scanned all 114 manifest-listed recipes and 1,123 rows; recorded every linked cornstarch row and checked the full recipe text for cornstarch wording.
- [x] Audited the source URLs and IDs: reused IDs retain their registered URLs; the CNF 4419 URL and proposed R588 source/observation identifiers are new.
- [x] Checked direct sources, product/row scope, French terminology, and the current CNF-edition caveat.
- [x] Verified this proposal is the only file created by this review; UTF-8/no-BOM and scoped whitespace checks passed.

No app tests, build, emulator run, or deployment were run. This proposal changes no application code or bundled database JSON.
