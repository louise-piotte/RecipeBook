# WP03 Section F R831 — white-rice “amount to make” evidence

- **Reviewed:** 2026-10-19.
- **Target:** Existing `ingredient-form-white-rice-dry` under `ingredient-ref-white-rice`, Food Code 4471.
- **Recommendation:** Record CNF 2015 and CNF 2026 “amount to make 125ml” rows as two separate ledger-only `cooking_yield` observations: 35.3 g and 35.29 g of the stated dry product input to a 125 mL prepared-product amount. Apply CFIA's general further-preparation direction only; do not compare or average editions.
- **Write scope:** Proposal only. If accepted, update the existing dry white-rice research-ledger record. Do not edit active references or forms, names, aliases, density, mappings, active conversions, recipes, or substitutions.

## Open checklist and distinction from earlier reviews

The active Section F parent remains open for dry/cooked grain evidence where a recipe or measurement needs it ([plan, Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L4825)). R553 joined the CNF 2026 rows for dry white long-grain rice, Code 4471, and R563 recorded its separate CNF 2015 volume portions. Both deliberately left the Code 4471 “amount to make 125ml” entries uninterpreted ([R553](wp03-section-f-next-gap-review-r553-20261017.md), [R563](wp03-section-f-next-gap-review-r563-20261017.md); checklist [R553](../../RecipeBook-global-ingredient-catalog-plan.txt#L4955) and [R563](../../RecipeBook-global-ingredient-catalog-plan.txt#L4956)).

R831 addresses only that remaining relation for Code 4471. It is separate from R828's common-millet Code 4491 observations and from R825's parboiled-rice Code 4472. It does not repeat the already-recorded 100 mL or 250 mL portions, create another rice form, or resolve the broader Section F parent. The R827–R829 integration recorded the same relation type for common millet and supplies a bounded precedent for direction-only ledger evidence ([integration README](../batches/wp02-wp03-wp04-r827-r829-gap-review-integration-20261019/README.md)).

## Identity, bilingual terminology, and ownership

The active reference is `ingredient-ref-white-rice`, displayed as **`white rice / riz blanchi`**, in `GRAIN_AND_CEREAL`. Its existing aliases are `milled rice` and `riz blanc`; density is null and unit mappings are empty. OQLF's [riz blanchi entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432775/riz-blanchi) pairs its preferred Québec term with English `white rice` and defines the milling distinction. The entry dates to 1982, so it supports the existing bilingual identity and boundary, not a contemporary product measure.

The existing dry form is `ingredient-form-white-rice-dry`, **`dry white rice / riz blanchi, sec`**, with empty match-term arrays and null form density. The CNF code is more specific—white, long-grain, regular rice, dry—but that source-specific qualifier does not justify a second reference or form. Keep the current aliases and display names unchanged. The `amount to make` line is measurement evidence, not an ingredient-search alias.

The target ledger record is already `identityState: verified`, `measurementState: researched_supported`, and `substitutionResearchState: not_yet_researched`. R553 and R563 already own their Code 4471 sources and four published volume portions. Attach no Code 4471 source IDs to a different form and do not copy its values to generic rice, brown rice, medium-grain rice, or another rice class.

## Source evidence and directional limit

Health Canada's [CNF 2015 serving page, Food Code 4471](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4471) shows the bilingual label `Grains, rice, white, long-grain, regular, dry / Grains céréaliers, riz blanc, grain long, ordinaire, sec`. Its separate entries include 100 mL = 78.2 g, 250 mL = 195.5 g, and `amount to make 125ml = 35.3 g`. R563 already records the two volume portions; the amount-to-make entry is the remaining item. The page details date to 2019-03-01, and no filling or packing method, rice-to-water ratio, preparation method, or output mass is stated.

R553's direct CNF 2026 file join identifies Code 4471 as the same bilingual dry-food description and records Measure Code 921 as type 9 (`Yield / Rendement`), value 35.29, with Measure Name `amount to make 125ml / quantité requise pour préparer 125ml`. R553's logged join, file hashes, and source IDs remain the evidence for this row. The current Health Canada [CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) confirms the 2026 edition is distributed as relational CSV files and that the 2015 online search remains interim. During R831, the browser could not fetch the downloadable 2026 CSV contents; this proposal does not claim a fresh R831 download or row-status check.

The current CFIA [Nutrition Facts table guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/nutrition-labelling/nutrition-facts-table#wb-cont) says that where a product requires further preparation and no reference amount is established for its unprepared form, the reference amount is the quantity needed to prepare the finished product's reference amount. Its example expresses powder input needed to make a stated beverage volume. This is general nutrition-labelling guidance, not a rice-specific preparation source. Applying only its direction to CNF's exact “amount to make” label yields the bounded interpretation **dry Code 4471 input → stated 125 mL prepared-product amount**.

The Measure Type label `Yield / Rendement` by itself does not explain the row's preparation basis. The CNF API guide's general yield-field description also does not provide a Code 4471 method. Keep the source's volume as a prepared-product amount only: it is not explicitly labeled cooked, and the sources provide no resulting food form, water quantity, cooking method, end mass, or repeatable kitchen protocol. Do not create a cooked form, a dry-to-cooked conversion, or a recipe instruction from this evidence.

The CNF editions are separate publications. Record the exact displayed 2015 value (35.3 g) and exact joined 2026 value (35.29 g) separately; do not compare, average, or characterize them as replicate trials.

## Current picker projection and phrase-first audit

The current [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) checks exact form labels, then complete query phrases anywhere inside longer indexed terms, then substring fallback. The active catalog has 1,886 references and 199 forms. A static projection for relevant broad and subphrase queries is:

| Query | Current result | R831 projected effect |
|---|---|---|
| `rice` | 76 references; broad result set includes grain, cereal, and other rice-qualified entries | None; unchanged |
| `riz` | 70 references; broad result set | None; unchanged |
| `white rice` | `ingredient-ref-white-rice` and `ingredient-ref-white-rice-flour` | None; unchanged |
| `riz blanc` | `ingredient-ref-white-rice` and `ingredient-ref-white-rice-flour` | None; unchanged |
| `dry rice` / `riz sec` | `ingredient-ref-rice` with its generic dry-form hint | None; unchanged |
| `dry white rice` / `riz blanchi, sec` | `ingredient-ref-white-rice` with the existing dry-form hint | None; unchanged |
| `amount to make` | No result | None; ledger evidence is not indexed |

The two `amount to make` terms are never added to a reference or form. This proposal changes only ledger evidence, so broad phrase matches and exact form hints remain as projected.

## Bundled recipe demand, measures, and substitutions

The manifest lists **114 recipes** with **1,123 structured ingredient rows**. A read-only scan found one white-rice row: recipe 066, “Cooked white rice, for serving,” already linked to `ingredient-form-white-rice-cooked`. There are **zero links** to `ingredient-form-white-rice-dry`, zero generic dry-rice form links, and zero ingredient rows requesting dry white rice. This row review adds no recipe amount and does not change the cooked-white-rice line.

R553 and R563 already retain four Code 4471 volume observations as edition- and source-specific portions; they do not establish a reusable density or active mapping. Keep `defaultDensity` and `densityGPerMl` null, unit mappings and active measures empty, and all existing recipe links unchanged. Neither CNF nor CFIA evidence evaluates a substitution. Keep substitution research `not_yet_researched` and add no global or contextual substitution.

## Exact proposed ledger delta

On the existing `ingredient-form-white-rice-dry` ledger record only:

1. Preserve the R563 2015 source ID `WP03-CNF2015-WHITE-RICE-4471-R563-S01`; update its locator/support text to note the exact 35.3 g “amount to make 125ml” line and R831's direction-only treatment. Preserve its URL, access date, and existing portion observations.
2. Preserve the R553 Code 4471 source IDs `WP03-CNF2026-WHITE-RICE-4471-R553-S01` through `S04`. Clarify in their support text that the 2026 Code 921 row is recorded only as a source-scoped input-to-prepared-volume relation; preserve its value, bilingual measure label, type 9, file hashes, and row dates. Do not reuse source IDs scoped to other food codes.
3. Add this CFIA source record, scoped to the white-rice dry-form ledger record. The URL is already used on another ledger record, so use a distinct source ID:

| Field | Proposed value |
|---|---|
| `sourceId` | `WP03-WHITE-RICE-AMOUNT-MAKE-R831-20261019-S01` |
| `url` | `https://inspection.canada.ca/en/food-labels/labelling/industry/nutrition-labelling/nutrition-facts-table` |
| `title` | `CFIA, Information within the Nutrition Facts table` |
| `accessedOn` | `2026-10-19` |
| `sourceKind` | `other` |
| `locator` | `Serving sizes and reference amounts; note on products requiring further preparation; iced-tea-powder example.` |
| `supports` | `General Canadian reference-amount guidance says that for a product requiring further preparation, where no unprepared-form reference amount exists, the amount is the quantity needed to prepare the finished-product reference amount. The iced-tea-powder example supports input-to-stated-prepared-amount direction only; it gives no rice-specific method, water quantity, output mass, or cooking protocol.` |

4. Append two separate observations. Omit `observedMassG`: the published gram value is the dry input, not the mass of the prepared output. Omit `ingredientFormId`: CNF names no output form, and these observations stay on the existing dry-input form record.

| Observation ID | Proposed relation | Food description / limit |
|---|---|---|
| `white-rice-dry-cnf2015-amount-make-125ml-r831-20261019` | `relationship: cooking_yield`; `sourceQuantity: { amount: 35.3, unit: "g" }`; `value: 125`; `valueUnit: "mL"`; `observedVolumeMl: 125`; `evidenceKind: published_portion`; source IDs: `WP03-CNF2015-WHITE-RICE-4471-R563-S01`, `WP03-WHITE-RICE-AMOUNT-MAKE-R831-20261019-S01` | CNF 2015, Food Code 4471, `Grains, rice, white, long-grain, regular, dry / Grains céréaliers, riz blanc, grain long, ordinaire, sec`; only dry-product input to the stated prepared-product amount. |
| `white-rice-dry-cnf2026-amount-make-125ml-r831-20261019` | `relationship: cooking_yield`; `sourceQuantity: { amount: 35.29, unit: "g" }`; `value: 125`; `valueUnit: "mL"`; `observedVolumeMl: 125`; `evidenceKind: published_portion`; source IDs: `WP03-CNF2026-WHITE-RICE-4471-R553-S01`–`S04`, `WP03-WHITE-RICE-AMOUNT-MAKE-R831-20261019-S01` | CNF 2026, Food Code 4471, Measure Code 921, same exact bilingual dry-food description; only dry-product input to the stated prepared-product amount. |

For both observations, set `foodState` to say the dry Food Code 4471 food is the input and the source states a 125 mL prepared-product amount, with no output form named. Set `measurementMethod` to say the CNF “amount to make” label is interpreted only for direction using CFIA's general further-preparation guidance; no rice-specific method, water quantity, resulting form, output mass, or kitchen protocol is stated. Set `quantityBasis` to the exact edition-specific input → stated 125 mL relation, not prepared mass or an active conversion.

Append an accepted decision referencing the four existing Code 4471 source entries and the new CFIA source. Keep `identityState: verified`, `measurementState: researched_supported`, and `substitutionResearchState: not_yet_researched` unchanged. Add no active measurement, density, unit mapping, conversion, cooked form, recipe link, or substitution finding/rule.

## Source register and limits

| Source | Owner or proposed ID | Evidence and limits |
|---|---|---|
| Health Canada, [CNF 2015 Food Code 4471 serving page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4471) | Existing `WP03-CNF2015-WHITE-RICE-4471-R563-S01` | Exact bilingual dry-food label and displayed 35.3 g “amount to make 125ml”; page search result confirms the row, while direct page open timed out in this review. It does not explain method, water, output state or mass. |
| Health Canada, [CNF 2026 Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | Existing `WP03-CNF2026-WHITE-RICE-4471-R553-S01` | R553's joined row establishes Code 4471's exact bilingual dry-food description and source qualifiers; no preparation method. The downloadable file was inaccessible in the browser during R831. |
| Health Canada, [CNF 2026 Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | Existing `WP03-CNF2026-WHITE-RICE-4471-R553-S02` | R553's verified joined Code 921 row reports 35.29 and type code 9; not a cooking protocol or prepared-output mass. The downloadable file was inaccessible in the browser during R831. |
| Health Canada, [CNF 2026 Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv) | Existing `WP03-CNF2026-WHITE-RICE-4471-R553-S03` | Supplies exact bilingual `amount to make 125ml / quantité requise pour préparer 125ml` wording for Measure Code 921; no method. |
| Health Canada, [CNF 2026 Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) | Existing `WP03-CNF2026-WHITE-RICE-4471-R553-S04` | Defines type 9 as `Yield / Rendement`; the type label is not enough to identify this row's preparation basis. |
| CFIA, [Information within the Nutrition Facts table](https://inspection.canada.ca/en/food-labels/labelling/industry/nutrition-labelling/nutrition-facts-table) | Proposed `WP03-WHITE-RICE-AMOUNT-MAKE-R831-20261019-S01` | Current general further-preparation guidance and an iced-tea-powder example. Supports direction only, not rice-specific preparation or yield. |
| Office québécois de la langue française, [riz blanchi](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432775/riz-blanchi) | Existing identity evidence; no new source ID | Preferred Québec display and English `white rice`; entry last updated 1982 and supports terminology only. |

R553 provides the 2026 file-row hashes and exact joined contents in the existing proposal and ledger record. R831's browser could verify the current CNF overview and CFIA guidance, but not freshly retrieve the Code 4471 2026 CSV bytes. The 2026 row claim is therefore explicitly carried forward from the R553 source evidence, not presented as a new R831 download.

## Static disposition and no-test rule

R831 proposes no change to the bundled ingredient catalog or recipes. If accepted integration adds only these research-ledger JSON observations and source notes, the provided `AGENTS.md` rule says no software tests are needed. Static checks should verify source-ID and observation-ID uniqueness, valid ledger JSON shape, proposal encoding, and local Markdown links; do not run app tests, builds, emulator checks, or deployment for this data-only change.
