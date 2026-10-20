# WP03 Section F — CNF 2026 roasted dry buckwheat groats measures (R576, 2026-10-17)

**Status: integrated.** The two supported Health Canada CNF 2026 volume portions are recorded on the existing ledger record; no catalog behavior or recipe was changed. See the [R575–R576 integration README](../batches/wp02-wp03-r575-r576-gap-review-integration-20261017/README.md). This review joins the Health Canada CNF 2026 rows for roasted dry buckwheat groats, Food Code 4412. Recommend two separate edition-specific volume-to-mass observations on the existing ledger record `ingredient-ref-roasted-buckwheat-groats-dry`: 100 mL = 69.315 g and 250 mL = 173.288 g. Do not add a catalog form, alias, active measure, density, unit mapping, conversion, cooking yield, recipe link, or substitution. Root owns any integration.

## Plan anchor and bounded scope

The active Section F parent remains open: “Dry versus cooked forms for remaining grains where recipes or measurements need them; generic rice, quinoa, and oat bran forms are integrated” ([plan, line 4381](../../RecipeBook-global-ingredient-catalog-plan.txt#L4390)). The roasted buckwheat identity is already integrated under the preceding grain checklist ([plan, line 4233](../../RecipeBook-global-ingredient-catalog-plan.txt#L4242)). This proposal closes only its still-unresolved CNF portion-row join; it does not close the dry/cooked forms parent or broader Section F.

This is distinct from R573’s Quaker quick-oats branded serving and from the recently joined rice, quinoa, barley, millet, oat-bran, and wild-rice CNF rows. A focused earlier review deliberately left the 2019 serving-page values inactive pending a matching CNF 2026 row and method review ([residual cereal review](wp03-section-f-residual-cereal-review-20261010.md#L94)). R576 completed that separate row join; it does not reopen the roasted-buckwheat Québec display or the prepared *kacha/kasha* boundary.

## Direct retrieval and joined rows

Health Canada’s current [CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says the 2026 file is published as relational CSVs and that the 2015 online search remains available as an interim route. The [official CNF 2026 listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) identifies the four CSV resources used here.

On 2026-10-17, Python `urllib.request` made read-only HTTPS GET requests to the four official download URLs below. `csv.DictReader` parsed the responses in memory; no local copy was saved. The Food Name file had one row for `Food_Code=4412`; the Measure Weight Conversion file had five rows for that code. Each conversion row joined by `Measure_Code` to Measure Name and by `Measure_Type_Code` to Measure Type. There were no unmatched join keys. The browser tool could not open the CSV downloads; direct file retrieval succeeded through approved read-only network access.

| File / proposal-local source ID | Official URL | Retrieved file evidence |
|---|---|---|
| Food Name — `WP03-CNF2026-BUCKWHEAT-4412-R576-S01` | [food_name.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | 5,993 data rows; 1,047,745 bytes; SHA-256 `ee75a3208e8b79ee523ec5adffcf149f3f21806ac5d9942a9449077efe414c6c`. |
| Measure Weight Conversion — `WP03-CNF2026-BUCKWHEAT-4412-R576-S02` | [measure_weight_conversion.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | 29,868 data rows; 834,367 bytes; SHA-256 `9d41fac4ba1471fddd25ea7e51a8352aec66de4f3c88802b0a2e02a85ebc3e6f`. |
| Measure Name — `WP03-CNF2026-BUCKWHEAT-4412-R576-S03` | [measure_name.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv) | 1,494 data rows; 67,867 bytes; SHA-256 `429cf2e8d4bbd2b732a6e9acf35427ce6d3b4e9447aabaf86b427c48833b112f`. |
| Measure Type — `WP03-CNF2026-BUCKWHEAT-4412-R576-S04` | [measure_type.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) | 3 data rows; 172 bytes; SHA-256 `ce6ecd0f370820d6800d7b7b88ae5710691b5d7b358c0503273d36a1a878f977`. |

For the type-9 scope note below, use proposal-local source ID `WP03-CNF2026-BUCKWHEAT-4412-R576-S05` for Health Canada’s [CNF API Guide, “Yield Amount”](https://produits-sante.canada.ca/api/documentation/cnf-documentation-en.html), accessed 2026-10-17. Its general field description does not interpret the target value.

### Food Name row

| Food Code | English description | French description | Other returned Food Name fields | Row date |
|---:|---|---|---|---|
| 4412 | `Grains, buckwheat groats, roasted, dry` | `Grains céréaliers, gruau de sarrasin, rôti, sec` | Alternate descriptions EN/FR blank; `Food_Source_Code=0`; `USDA_NDB_Code=20009`; `CNF_Food_Group_Code=20`; comments and scientific name blank | `Food_Last_Updated_Date=2012-07-31` |

### Complete Measure Weight Conversion join

| Type code and label EN / FR | Measure code | Measure label EN / FR | `Measure_Weight_Conversion` | Row last updated | Bounded treatment |
|---|---:|---|---:|---|---|
| 9 — `Yield` / `Rendement` | 921 | `amount to make 125ml` / `quantité requise pour préparer 125ml` | 36.04 | 2004-08-12 | Keep uninterpreted; do not call this a 125 mL mass, recipe amount, or cooking yield. |
| 6 — `User-defined` / `Défini par l'utilisateur` | 341 | `100 ml` / `100 ml` | 69.315 | 1997-05-01 | Recommend a separate CNF 2026 published-portion observation: 100 mL = 69.315 g. |
| 6 — `User-defined` / `Défini par l'utilisateur` | 415 | `250 ml` / `250 ml` | 173.288 | 2003-08-14 | Recommend a separate CNF 2026 published-portion observation: 250 mL = 173.288 g. |
| 6 — `User-defined` / `Défini par l'utilisateur` | 1601 | `45 g` / `45 g` | 45 | 2004-08-27 | Mass-only row; it establishes no volume portion or reusable mapping. Exclude from the proposed observations. |
| 3 — `Refuse` / `Portion non comestible` | 750 | `total refuse` / `portion non comestible totale` | 0 | 1997-05-01 | Refuse row, not edible food mass. Exclude. |

The last-updated dates above are file row dates, not the CNF edition date. They predate the 2026 publication and do not indicate that the portions were newly measured in 2026. The evidence supports only the exact Food Code 4412 entries present in the retrieved CNF 2026 files.

## Prior serving-page evidence and Yield limit

Health Canada’s [CNF Food Code 4412 serving page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4412), with page details dated 2019-03-01, displays `100ml = 69.3 g`, `250ml = 173.3 g`, `amount to make 125ml = 36.0 g`, and `total refuse 0%`. Those rounded 100/250 mL values agree with the CNF 2026 rows above. This is useful historical comparison; it does not supply the 2026 row join or explain the type-9 field. Existing source IDs `WP03-FCR-20261010-S12` and `WP03-S15` already own this serving-page URL on the target record. Keep the older values out of this narrowly scoped R576 addition and preserve the source editions separately.

The official [CNF API Guide, “Yield Amount”](https://produits-sante.canada.ca/api/documentation/cnf-documentation-en.html) says this field contains yields from refuse and/or cooking losses assigned to certain foods and is most often used for food inventory. That general description does not explain what the exact 36.04 entry for Food Code 4412 means or state a preparation protocol. The label resembles a volume target, but type 9 is `Yield / Rendement`; retain the row only as uninterpreted source evidence. Do not interpret it as 36.04 g needed to make 125 mL of cooked groats, a recipe yield, dry-to-cooked conversion, or density.

## Current catalog, ownership, picker, and recipe audit

The active reference is `ingredient-ref-roasted-buckwheat-groats-dry`, displayed as `buckwheat groats, roasted, dry / grains de sarrasin rôtis et secs` in `GRAIN_AND_CEREAL`. Its English and French alias arrays are empty, `defaultDensity` is null, `unitMappings` is empty, and there is no buckwheat form. Do not add a redundant dry form: Food Code 4412 matches the existing qualified identity directly, and this task proposes ledger evidence only.

Its ledger record is an `ingredient_reference` with `identityState=verified`, `measurementState=not_yet_researched`, and `substitutionResearchState=not_yet_researched`. It has the earlier CNF 2015 serving-page and terminology sources, but no measurement observations, active conversions, or substitutions. The four direct CSV URLs are already owned in the shared ledger by other Food Code-specific source entries, including recent records for oat bran, pearl barley, quinoa, rice, and common millet. The R576 IDs in this proposal are new and unowned; root should add them with Food Code 4412 locators on the target record rather than reusing another food code’s source IDs. `WP03-CNF2026-BUCKWHEAT-4412-R576-S01` through `S05` remain proposal-local until root integration. Cite S05 for the bounded type-9 disposition, not as evidence for either volume observation.

Static projection using the current `IngredientSearch.kt` rule (exact complete phrase first, then substring fallback) gives one result for each qualified displayed phrase: `buckwheat groats, roasted, dry` and `grains de sarrasin rôtis et secs`. The broad queries `buckwheat` and `sarrasin` return 14 and 15 identities, respectively; `gruau de sarrasin` returns two. No aliases or forms are proposed, so R576 causes no picker projection change. Preserve the existing qualified displays and keep prepared *kacha/kasha* outside the dry-groat aliases; OQLF defines *kacha/kasha* as a gruel made from roasted buckwheat ([OQLF entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506505/kacha)).

The manifest contains 114 recipe files and 1,123 structured ingredient rows. Scanning every manifest-listed recipe file and ingredient row found zero `buckwheat` or `sarrasin` text matches and zero links to `ingredient-ref-roasted-buckwheat-groats-dry`. The bundle supplies no recipe demand or recipe-specific measure, and no recipe edits or links are proposed.

## Bounded integration recommendation

Append two distinct `portion_weight` / `published_portion` observations to the existing `ingredient-ref-roasted-buckwheat-groats-dry` ledger record, without `ingredientFormId` because no form is needed for this already-qualified identity:

| Proposal-local observation ID | Source quantity | Observed mass | Source IDs |
|---|---:|---:|---|
| `roasted-buckwheat-groats-cnf2026-100ml-portion-r576-20261017` | 100 mL | 69.315 g | `WP03-CNF2026-BUCKWHEAT-4412-R576-S01`–`S04` |
| `roasted-buckwheat-groats-cnf2026-250ml-portion-r576-20261017` | 250 mL | 173.288 g | `WP03-CNF2026-BUCKWHEAT-4412-R576-S01`–`S04` |

For each, scope the description to `Health Canada CNF 2026, Grains, buckwheat groats, roasted, dry (Food Code 4412)`. State that the CSV reports the portion value without a filling or packing method. Set the quantity basis to a publication-specific Food Code 4412 portion, not a reusable density or household conversion. After recording these supported source-specific portions, set the ledger `measurementState` to `researched_supported`; this is evidence state only and does not activate application conversion behavior. Keep `substitutionResearchState=not_yet_researched`.

Add a new decision superseding the old “pending matching 2026 data and method review” rationale for this row join. Keep the old sources and prior decisions as history. Exclude Measure 1601’s mass-only row and Measure 750’s refuse row. Leave Measure 921’s type-9 value 36.04 uninterpreted. Add no density, active measure, unit mapping, form, conversion, dry-to-cooked yield, recipe amount, recipe link, picker term, or substitution. The prior page’s rounded 2015 values may remain as source comparison but are not added as R576 observations.

When integrated, update only the R576 child under the existing dry/cooked grain checklist; leave that parent and the wider Section F checklist open. At proposal time, no shared catalog, ledger, plan, roadmap, recipe, or code file has been changed.

## Verification and evidence limits

- Re-read the open Section F plan, the existing roasted-buckwheat reference and ledger record, prior R573 and CNF measurement proposals, picker implementation, and manifest-listed recipe corpus.
- Checked the five 4412 conversion rows against the 2026 Measure Name and Measure Type files, and confirmed every join key matched.
- Checked the proposed source-ID strings against the current ledger and proposal archive; none was already allocated. The shared CSV URLs are reused by other Food Code records, so source ownership must remain Food Code-specific.
- No app tests, build, emulator run, or deployment were run for this database-JSON-only addition under `AGENTS.md`; see the [integration README](../batches/wp02-wp03-r575-r576-gap-review-integration-20261017/README.md) for static validation.
- The files publish Food Code-specific amounts but do not state a fill or packing method, household measure standard, bulk density, cooking instruction, cooked yield, or substitution. The type-9 API guide describes general field semantics but does not interpret this exact row.
