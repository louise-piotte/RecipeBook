# WP03 Section F — Quaker quick-oats portion review (R573, 2026-10-17)

- **Status:** Integrated on 2026-10-17; root completed the shared-ledger changes.
- **Disposition:** Added one source-scoped, branded portion observation to the existing `ingredient-ref-quick-oats` ledger record: Quaker Quick Oats, 1/3 label cup = 30 g. Kept `measurementState: blocked_pending_evidence`, active density and unit mappings empty, and the existing recipe quantities unchanged.
- **Plan anchor:** [Global catalog plan, Section F, “Dry versus cooked forms for remaining grains where recipes or measurements need them”](../../RecipeBook-global-ingredient-catalog-plan.txt#L4389). The parent stays open. This review addresses a bounded measurement observation; it does not create a quick-oats form or close the broader dry/cooked checklist.

## Why this gap

The live quick-oats identity has two exact bundled recipe uses, one mass-based and one volume-based. Current Québec and English Quaker Canada product pages publish a bilingual, product-specific 1/3 cup (30 g) portion. Health Canada’s older CNF serving page identifies the corresponding Quaker dry quick-oats food and separately shows a 30 g serving. At review time the quick-oats ledger had no measurement observation, despite another brand’s 1/2 cup (45 g) statement already being recorded as source evidence only; the Quaker observation is now integrated.

The evidence supports retaining one Quaker-specific published portion on the existing identity. It does not support a general quick-oats cup weight, a density, or a conversion for either bundled recipe. Quaker’s product title `Gruau Quaker Rapide` is not proposed as a French alias; the live French display remains more precise and keeps this dry flake product separate from prepared *gruau*. OQLF defines unqualified `gruau` as a cooked dish of oat flakes; this existing source (`WP03-S27`, owned by the separate instant-oats ledger record) is contextual naming evidence only, not a source ID to duplicate on quick oats [OQLF, *gruau*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau).

## Current catalog, form, and ledger audit

| Surface | Current state | R573 result |
|---|---|---|
| Active identity | `ingredient-ref-quick-oats`, `quick oats / flocons d'avoine à cuisson rapide`, category `GRAIN_AND_CEREAL`; [seed reference](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L16810). | Keep the same stable ID and bilingual display. No new identity. |
| Aliases | EN: `quick-cooking oats`; fr-CA: `avoine à cuisson rapide`. The identity is verified. Existing identity sources include TERMIUM Plus, OQLF, Bob's Red Mill Canada, and Mayrand. | Add no alias. In particular, do not add `Gruau Quaker Rapide`, `gruau rapide`, or bare `gruau`; those phrases are product-title evidence and can resolve as prepared oatmeal. |
| Forms and active measures | No quick-oats form exists in [the live form file](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json). Reference density is null and unit mappings are empty. At review time the [ledger record](../research-ledger.v1.json#L122888) had `measurementState: blocked_pending_evidence` and no `measurementObservations`; the integrated Quaker observation remains source-specific. | Do not add a dry or cooked form. The relevant sources concern dry quick-oat flakes as sold; the bundled corpus has no prepared quick-oat form line. Keep density, mappings, conversions, and active measures empty. |
| Existing measure evidence | Existing ledger source `WP03-FCR-20261010-S03` records Bob's Red Mill Canada’s product-specific 1/2 cup = 45 g statement, which has not been promoted to a measurement observation or generic mapping. | Preserve that separate branded evidence. Do not combine brands or normalize either portion into a cross-brand density. |
| Source-ID ownership | Before integration, the IDs below were searched in the complete research ledger and proposal directory; none was assigned. | The source IDs and observation ID below are now in the quick-oats ledger record. |
| Existing Québec term evidence | `WP03-S27` is already owned by `ingredient-ref-instant-oats` and cites OQLF's `gruau` entry. | Cite it as contextual evidence only; do not duplicate that source ID on quick oats. |

## Bilingual source evidence and limits

| Source ID | Primary source | What it supports and its limits |
|---|---|---|
| `WP03-QUICK-OATS-QUAKER-R573-S01` | Quaker Canada, [Quick Oats](https://www.tastyrewards.com/en-ca/brands/quaker/products/quick-quakerr-oats), accessed 2026-10-17. | Current English brand page gives `Per 1/3 Cup (30 g)` and lists `100% rolled oats` as the ingredients. This is a Quaker product serving, not an average for all quick oats. The page is owned by PepsiCo Canada ULC. |
| `WP03-QUICK-OATS-QUAKER-R573-S02` | Quaker Canada, [Gruau Quaker Rapide](https://www.tastyrewards.com/fr-ca/marques/quaker/produits/gruau-quakerr-rapide), accessed 2026-10-17. | The French narrative reports `1/3 de tasse (30 g)` and the ingredient declaration says `100 % de flocons d'avoine`. The nutrition table contains the apparent typo `1/3 coup (30 g)`; rely on the narrative together with the English table, and do not treat the typo as a separate unit. The product title is not proposed as a catalog alias. |
| `WP03-QUICK-OATS-CNF1439-R573-S03` | Health Canada, [CNF 2015 serving page, Food Code 1439](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=1439&wbdisable=true), accessed 2026-10-17. | The bilingual food name is `Cereal, hot, oats, quick, dry, Quaker / Céréale, chaude, avoine (gruau), rapide, sèche, Quaker`. The page lists 1 serving = 30.0 g, `amount to make 175ml cooked = 30.0 g`, and 0% refuse. It is the 2015 CNF page (modified 2019-03-01), so it is historical corroboration, not a current-edition row claim. Keep the `amount to make` entry uninterpreted; it does not establish a household conversion or cooking yield for the app. |
| `WP03-QUICK-OATS-LABEL-RULE-R573-S04` | CFIA, [Information within the Nutrition Facts table](https://inspection.canada.ca/en/food-labels/labelling/industry/nutrition-labelling/nutrition-facts-table?wbdisable=false), accessed 2026-10-17. | Current guidance says serving size for foods requiring preparation is stated for the food as sold, with a prepared serving optional. This supports treating the single Quaker 1/3 cup (30 g) nutrition declaration as the dry product as sold; it supplies no oat-specific measurement. |

### CNF 2026 access boundary

Health Canada’s [current CNF page](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says the 2026 database is published in relational CSV files; the Open Government listing was modified 2026-10-04. This review did not inspect the 2026 rows for Food Code 1439 and makes no claim that the code, food name, or portions are present or absent in that edition. Direct opens of the listed CSV resources failed in the web tool with `URL ... is not accessible via this tool` for each of these official links:

- [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv)
- [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv)
- [Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv)
- [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv)

The CNF 2026 dataset listing establishes the download resources, not their row contents. A future direct-file join may update the evidence, but this proposal does not depend on or pre-empt that inspection.

## Picker and bilingual projection

The live English display `quick oats` and French display `flocons d'avoine à cuisson rapide` remain the exact ingredient choices. Existing alias ownership remains `quick-cooking oats` and `avoine à cuisson rapide`; no alias or form term is added. Under the current phrase-first picker, exact English and French quick-oats phrases continue to return the single existing reference. `rolled oats` and `instant oats` remain separate references. `gruau Quaker rapide` remains source wording only and is not projected into the picker. A ledger-only portion observation has no picker effect.

## Bundled recipe demand

The manifest audit counted 114 bundled recipes and 1,123 ingredient rows. Exactly two rows use the target identity:

| Recipe line | Current ingredient text | Scope |
|---|---|---|
| `024#6` | `175 g quick oats` | Existing mass quantity; no brand is specified. Keep 175 g unchanged. |
| `047#4` | `1 1/2 cups quick oats` | Existing volume quantity; no brand, cup capacity, or fill method is specified. Do not convert it using Quaker’s serving. |

The four total oat-flake rows are those two plus rolled-oats lines `001#1` and `065#1`. There are no quick-oats form references or explicit Quaker-branded recipe lines. The catalog observation is useful source evidence, but cannot be attached to or used to rewrite a generic recipe quantity.

## Integrated measurement observation

Added one observation to the existing `ingredient-ref-quick-oats` ledger record:

| Field | Integrated value |
|---|---|
| `observationId` | `quick-oats-quaker-30g-third-cup-r573-20261017` |
| `relationship` | `portion_weight` |
| `value` / `valueUnit` | `30` / `g` |
| `foodDescription` | Quaker Canada Quick Oats; the manufacturer product page lists 100% rolled oats. |
| `foodState` | Dry product as sold. |
| `sourceQuantity` | `1/3 cup`, exactly as published; keep cup capacity and filling method unstated and do not convert to mL. |
| `observedMassG` | `30` |
| `evidenceKind` | `manufacturer_label` |
| `sourceIds` | `WP03-QUICK-OATS-QUAKER-R573-S01`, `WP03-QUICK-OATS-QUAKER-R573-S02`, and `WP03-QUICK-OATS-LABEL-RULE-R573-S04`. The CNF 2015 page may be cited as corroborating source evidence, but its `amount to make 175ml cooked` entry is not a second observation. |

The separate Quaker (1/3 cup, 30 g) and Bob's Red Mill (1/2 cup, 45 g) statements are product-specific published portions. Their proportional cup figures must not be transformed into a generic cup mass, density, or unit mapping: the product labels do not establish a common cup capacity, fill/packing method, measurement protocol, or unrounded value.

## Form, conversion, and substitution boundaries

- Do not create a `quick oats, dry` form. The reviewed Quaker and CNF records concern dry flakes as sold, and both quick-oats recipe rows already refer to that product identity. No bundled quick-oats line asks for cooked oatmeal.
- Do not create a cooked quick-oats form or a dry-to-cooked yield. The CNF label `amount to make 175ml cooked` is retained as uninterpreted source text, not as a measured yield.
- Do not create a density, active unit mapping, cup conversion, recipe amount, or cross-brand measure. The 30 g portion is not transferable to the generic rows `024#6` or `047#4`.
- Do not infer a substitution between quick oats and rolled oats, instant oats, oat bran, or prepared oatmeal. No substitution source or rule is proposed; keep the existing `substitutionResearchState: not_yet_researched`.

## Integrated result

Added the bilingual Quaker source entries and the single 1/3-cup = 30 g branded portion observation to the existing quick-oats ledger record. Keep its identity and aliases unchanged; retain `measurementState: blocked_pending_evidence`, `defaultDensity: null`, and `unitMappings: []`. Add no form, active measure, conversion, yield, recipe link, recipe edit, or substitution. Keep the broad Section F parent open and revisit only if the CNF 2026 Food Code 1439 rows become directly inspectable or a genuinely reusable non-branded measure is found.

## Checks

- Audited the complete manifest-listed corpus: 114 recipes, 1,123 ingredient rows, and two exact quick-oats rows.
- Confirmed the current quick-oats reference and ledger ownership, empty form/mapping state, existing source IDs, and no collisions for the R573 source or observation IDs before integration.
- Read the phrase-first search projection code; this proposal adds no picker terms and therefore changes no search result.
- Updated the ledger, plan, roadmap, proposal, and integration README. Static package, ledger, source-ownership, encoding, local-link, and whitespace checks were run. No software tests, app build, emulator run, or deployment were run for this database-JSON-only update.
