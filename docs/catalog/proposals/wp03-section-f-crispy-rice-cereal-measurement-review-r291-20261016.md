# R291 — WP03 Section F crispy rice cereal measurement review

**Status:** Integrated into the crispy-rice-cereal research record and checklist on 2026-10-16; see the [R291 integration README](../batches/wp03-section-f-crispy-rice-cereal-measurement-integration-r291-20261016/README.md).
**Target:** `ingredient-ref-rice-cereal` — `crispy rice cereal / céréales de riz croustillantes`
**Plan anchor:** `docs/RecipeBook-global-ingredient-catalog-plan.txt:9876`, the unchecked bullet to continue independent Québec French review and Section F coverage while keeping crispy-rice-cereal boundaries and cooking/measurement evidence separate.

## Recommendation

Close the open measurement and substitution research states for the existing identity with source-specific evidence only:

- Set the target ledger record's `measurementState` to `researched_no_supported_value`, while retaining the two branded nutrition-label portions below as separate `portion_weight` observations.
- Set `substitutionResearchState` to `researched_no_supported_substitute`. Record that no source establishes a reusable cereal replacement for the bundled recipe's use.
- Keep the active reference identity-only: no aliases, forms, density, unit mappings, conversion, yield, recipe-line substitution, or recipe edit. Preserve recipe 040's six-cup quantity.

The two Canadian product labels report different masses for a nominal cup: 28 g for WK Kellogg Rice Krispies and 34 g for Nature's Path Organic Crispy Rice. These are six grams apart and apply to different SKUs and formulations. They do not establish a generic mass for crispy rice cereal.

## Existing identity, demand, and picker projection

The active row is `GRAIN_AND_CEREAL`, with the accepted English and French display names above, empty alias arrays, null `defaultDensity`, and empty `unitMappings`. There are no ingredient forms for this reference. Existing identity sources `WP03-S87`–`WP03-S91` remain attached to this record; this proposal does not reopen its naming decision or alter its product boundaries.

The manifest lists 114 recipe files. A scan of their 1,123 ingredient rows found one use: recipe 040, ingredient line `798352ab-d4ad-4e5d-9c90-f0484609bca2-ingredient-5`, linked to this reference as `6 cups crispy rice cereal`. Its source, Allrecipes' *Chocolate Nutty Crispy Treats* (`WP03-S86`), gives the same six-cup line. No source supplies a mass for that recipe portion.

Static projection against the active reference names and aliases, using the current phrase-first then substring search in `IngredientSearch.kt`, yields:

| Query | Matching reference rows |
| --- | --- |
| `crispy rice cereal` | `ingredient-ref-rice-cereal` only |
| `céréales de riz croustillantes` | `ingredient-ref-rice-cereal` only |
| `rice cereal` | `ingredient-ref-baby-rice-cereal` and `ingredient-ref-rice-cereal` |
| `céréales de riz` | `ingredient-ref-baby-rice-cereal` and `ingredient-ref-rice-cereal` |
| `puffed rice` / `riz soufflé` | `ingredient-ref-puffed-rice` only |

Keep `rice cereal`, infant rice cereal, plain puffed rice, rice flakes/poha, and the Rice Krispies trademark out of this row's aliases. OQLF source `WP03-S90` assigns *riz croustillant* to the Rice Krispies product. Because the picker falls back to substring matching, a search for singular `riz croustillant` can still surface the plural French display as a partial match; it is not an alias or an equivalence claim, and this measurement review proposes no picker or identity change.

## Evidence and measurement boundaries

| Proposed source ID | Current source and locator | Evidence used |
| --- | --- | --- |
| `WP03-CRRICE-R291-20261016-S01` | [WK Kellogg Canada SmartLabel, Rice Krispies Cereal, GTIN 00064100108271](https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00064100108271), Nutrition Facts | The 1,120 g product label reports `Per 1 cup (28 g)`. The manufacturer says product information can change and directs users to the package for current details. Retain this as one SKU-specific label portion. |
| `WP03-CRRICE-R291-20261016-S02` | [Healthy Planet Canada, Nature's Path Organic Crispy Rice Cereal, SKU A0014398](https://www.healthyplanetcanada.com/en/nature-s-path-organic-cereal-crispy-rice-750g.html), product and Nutrition Facts sections | The 750 g product page reports `1 cup (34 g)` and `1/2 cup (17 g)` for its brown-rice-crisp cereal. This is retailer-hosted, SKU-specific evidence; the retailer notes packaging information can change. |
| `WP03-CRRICE-R291-20261016-S03` | [Health Canada, Nutrition facts table: serving size](https://www.canada.ca/en/health-canada/services/food-nutrition/nutrition-labelling/nutrition-facts-tables.html), “Serving size” section | Health Canada says the common household measure is followed by its metric equivalent and illustrates `1/2 cup` as `125 mL`. This explains the Canadian label convention; it does not give a cereal mass or generic cereal conversion. |
| `WP03-CRRICE-R291-20261016-S04` | [WK Kellogg Canada, The Original Rice Krispies Treats Microwave Recipe](https://www.ricekrispies.ca/en/orginal-treats-microwave), ingredient list and note | The Canadian recipe lists `1.5 L (6 cups)` Rice Krispies cereal and says the recipe was tested with Kellogg products, with results using other products potentially varying. This corroborates a Canadian 250 mL cup in this branded recipe and supports keeping substitution product- and recipe-specific; it supplies no cereal mass. |

For a later ledger update, retain the label source quantities as `1 cup` with an explicit Canadian label cup convention (250 mL), not as the app's cup unit. Health Canada's 125 mL half-cup illustration and the manufacturer recipe's 1.5 L / 6 cup statement support that convention. RecipeBook defines its `cup` as 236.5882 mL. Do not convert the Canadian label portions through that app unit or activate them as mappings.

If integrated, add these two source-bound observations to the existing ledger record:

| Observation ID | Source quantity and reported mass | Scope |
| --- | --- | --- |
| `crispy-rice-cereal-rice-krispies-ca-cup-28g-r291-20261016` | 1 Canadian label cup → 28 g; `manufacturer_label` | WK Kellogg Rice Krispies, GTIN 00064100108271, dry as sold. Do not generalize to other crisp rice cereals. |
| `crispy-rice-cereal-natures-path-ca-cup-34g-r291-20261016` | 1 Canadian label cup → 34 g; `manufacturer_label` | Nature's Path Organic Crispy Rice, SKU A0014398, dry as sold. Do not generalize to other crisp rice cereals. |

Neither observation supports a generic density, unit mapping, or weight for recipe 040. The recipe's source does not name a brand, and its six-cup line remains volume-only. No forms, preparation-state conversions, or cooking yields are supported by these sources.

## Substitution assessment

Allrecipes' source for recipe 040 lists a cashew-butter alternative to almond butter, not an alternative cereal. WK Kellogg Canada's branded recipe is based on Rice Krispies and expressly warns that results with other products may vary. These sources do not support a universal swap, ratio, or recipe-line suggestion. Do not infer that plain puffed rice, corn flakes, infant cereal, or another breakfast cereal is interchangeable in this pressed chocolate-almond treat. Add no global form conversion, contextual ingredient substitution, or `IngredientLineSubstitution`.

## Source-ID and URL ownership

The four proposed IDs above and their exact direct URLs were checked against the current research ledger and `docs/catalog/`; none is already owned. `WP03-S86` remains the existing Allrecipes source for `ingredient-ref-rice-cereal` and is reused only for recipe demand and the absence of a cereal swap in that recipe. Existing identity sources `WP03-S87`–`WP03-S91` remain with the same record. No source ID is reassigned, and no shared source/ledger file was edited.

## Verification performed

- Read the current plan anchor, roadmap, active ingredient reference, ingredient forms, unit definitions, research-ledger entry and schema, and proposal archive.
- Recounted the manifest recipe files and ingredient rows and scanned the corpus for this reference and its displayed phrase.
- Checked current search projection from the catalog names and aliases against the picker’s matching behavior.
- Opened the current manufacturer and retailer label pages, Health Canada's serving-size guidance, the Canadian WK Kellogg recipe, and the existing Allrecipes source.
- Checked source-ID and exact-URL ownership. No software tests, build, or emulator run was needed for this proposal-only research task.
