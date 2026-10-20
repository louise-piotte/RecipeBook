# WP03 Section F: Cheerios Oat Crunch family review (R198)

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Integrated as three family references and three product-specific research-ledger records; see the R198 batch README. No software tests were run for this database-JSON-only change.
- **Open checklist:** Section F continues to request regional cereal-mix and preprocessed-grain coverage in the [active plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L3656).
- **Candidate:** the three current Canadian Oat Crunch ready-to-eat cereal SKUs: Almond, Cinnamon, and Oats ‘N Honey.
- **Recommendation:** Add all three identities together as separate `GRAIN_AND_CEREAL` references. This completes the family coverage that the [R181 Cinnamon hold](wp03-section-f-cheerios-oat-crunch-cinnamon-identity-review-r181-20261016.md) said was needed before a broad `Oat Crunch` query could be useful.

## Product boundary and bilingual names

General Mills Canada's current English and French product lists each show 17 products and list exactly three Oat Crunch variants: **Oat Crunch Almond Cheerios**, **Oat Crunch Cinnamon Cheerios**, and **Oat Crunch Oats ‘N Honey Cheerios**; the French list gives **Croquantes à l’avoine Amandes Cheerios**, **Croquantes à l’avoine Cannelle Cheerios**, and **Croquantes à l’avoine Avoine et miel Cheerios** [S07–S08]. Current Canadian manufacturer SKU pages confirm each exact title, its distinct flavor description and ingredient declaration, a 516 g package, and a product-specific nutrition-label serving of 1 cup (56 g) / 1 tasse (56 g) [S01–S06].

Use the manufacturer’s exact bilingual product titles as the catalog displays. Current Québec retailer listings independently describe the Almond SKU as `Céréales croquantes à l'avoine aux amandes Cheerios` (516 g; product number `065633181274`) and list the Cinnamon and Oats-and-Honey family packages with localized French titles at 516 g [S09–S10]. These retailer titles support Québec market naming and presence, but remain evidence rather than aliases. In particular, do not translate the English marketing phrase `Oat Crunch` by constructing a French alias; use the manufacturer's current Canadian French titles.

Each candidate is one finished, formulated, ready-to-eat cereal. The manufacturer's shared description identifies a multigrain cereal topped with whole-grain oats, while the product declarations differ by almond, cinnamon, and honey [S01–S06]. Do not merge the variants, represent one as a form of another, or decompose any SKU into its oat, grain, flavor, or sweetener components. The live Canadian product lists support these three family members; this review does not include products shown only in another national market [S07–S08].

| Neighbor | Current owner or status | Boundary |
|---|---|---|
| `Multi-Grain Cheerios / céréales multigrains Cheerios` | `ingredient-ref-multi-grain-cheerios` (R180) | Separate named SKU; a shared brand does not make it an Oat Crunch alias. |
| `Strawberry Banana Cheerios / Cheerios Fraises et bananes` | `ingredient-ref-strawberry-banana-cheerios` (R185) | Separate named SKU; its product-specific 1 cup (39 g) observation does not transfer to Oat Crunch. |
| Oat Crunch Almond, Cinnamon, and Oats ‘N Honey | No active reference, form, legacy mapping, or ledger identity found | Three separate product identities with distinct flavor/ingredient declarations; add all three as one family decision. |
| Generic multigrain flakes, rolled oats, almonds, cinnamon, honey, and other listed cereal components | Existing ingredient references | Ingredients in a finished cereal are not an ingredient formula, alias, or substitution. |
| Other Cheerios-branded products | Current manufacturer list has 17 Canadian items; most are not active references | This proposal only resolves the three-member Oat Crunch family and does not make the entire Cheerios line exhaustive. |

## Ownership and source-collision audit

At the audit snapshot, the shared data contains **1,574 active ingredient references**, **122 forms**, **61 legacy-import candidates**, and **1,919 research-ledger records** with **8,281 source entries**, **7,064 distinct source IDs**, and **5,854 distinct source URLs**.

Exact searches across active reference IDs, names and aliases; form IDs, labels and match terms; legacy names and aliases; and ledger identities found no owner for the three manufacturer names, their French titles, the proposed IDs below, or the `Oat Crunch` / `Croquantes à l’avoine` family terms. The only active Cheerios references are the distinct Multi-Grain and Strawberry Banana SKUs above. No Oat Crunch forms or legacy-import mappings exist. The cinnamon ID was proposed in R181 but never allocated because the root disposition held that single row; reuse that same ID rather than minting a replacement. The almond and Oats-and-Honey IDs below are unowned in the active references, forms, legacy candidates, ledger, and proposal archive.

The archive scan found the [R181 single-SKU Cinnamon hold](wp03-section-f-cheerios-oat-crunch-cinnamon-identity-review-r181-20261016.md), which explicitly asks for a family-wide review; the [R185 Strawberry Banana proposal](wp03-section-f-strawberry-banana-cheerios-identity-review-r185-20261016.md) and [integration](../batches/wp03-section-f-strawberry-banana-cheerios-integration-r185-20261016/README.md), which list Oat Crunch only as a separate Cheerios neighbor; and the [R186 Honey Nut family hold](wp03-section-f-honey-nut-cheerios-family-picker-hold-review-r186-20261016.md) and [integration](../batches/wp03-section-f-honey-nut-cheerios-family-picker-hold-integration-r186-20261016/README.md), which cover different SKUs. No earlier Oat Crunch family-wide disposition was found. [R180 Multi-Grain Cheerios](wp03-section-f-multi-grain-cheerios-identity-review-r180-20261016.md) is also a separate SKU review. The R181 hold is the direct reopen condition addressed here.

The exact URL audit reuses `WP03-STRAWBERRY-BANANA-CHEERIOS-R185-20261016-S03` for the English product list, which is already registered in the ledger. The Cinnamon English and French product-page IDs `WP03-OAT-CRUNCH-CINNAMON-R181-20261016-S01` and `WP03-OAT-CRUNCH-CINNAMON-R181-20261016-S02`, and French product-list ID `WP03-OAT-CRUNCH-CINNAMON-R181-20261016-S04`, are reused from R181; that proposal was held, so these source entries were not added to the ledger. Do not create replacement IDs for those URLs. The six other URLs in this register are new to the ledger and archive and receive unique R198 IDs. No source ID in this register is assigned to more than one URL.

## Picker projection

The live ingredient search folds accents and punctuation, returns full word-phrase matches first, and uses substring matches only when there are no phrase matches [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). A static projection from the current references and forms gives:

| Query | Current results | With all three proposed displays |
|---|---:|---:|
| `Oat Crunch` | 0 | 3: Almond, Cinnamon, and Oats ‘N Honey |
| `Croquantes à l’avoine` | 0 | 3: Amandes, Cannelle, and Avoine et miel |
| Each exact English or French product title | 0 | 1 matching SKU |
| `Cheerios` | 2: Multi-Grain and Strawberry Banana | 5: those two plus all three Oat Crunch SKUs |
| `cereal` / `céréales` | 23 / 21 | 23 / 21; none of the three proposed display names contains either generic word |

The broad Oat Crunch phrase now returns the complete Canadian family, resolving R181's one-flavor picker issue. Each full bilingual product title remains individually selectable. Flavor terms also bring the corresponding finished cereal alongside component choices: `almond` / `amandes` increase from 7 / 3 current results to 8 / 4, `cinnamon` / `cannelle` from 1 / 1 to 2 / 2, and `honey` / `miel` from 3 / 1 to 4 / 2. These are expected separate ingredient and product choices. The broad `Cheerios` query continues to return only the five Cheerios identities currently represented in the catalog even though the manufacturer's Canadian list has 17 products; this family proposal does not claim complete brand coverage. Keep aliases empty: the exact product displays already support family and SKU queries, while retailer wording or a generic `cereal` alias could widen other picker results without identifying a new SKU.

## Bundled recipe-corpus demand

All **114 manifest-listed recipe files and 1,123 ingredient rows** were scanned for the proposed IDs, all six exact product titles, `Oat Crunch`, `Croquantes à l’avoine`, the Oats-and-Honey wording, and the Québec Almond product number. The scan found **0 matching recipe files and 0 matching ingredient rows**. No recipe link, legacy mapping, or recipe-text change is supported by the current bundle.

## Measurement, preparation, and substitution boundaries

- **Product-specific label portions:** Each manufacturer SKU page lists 1 cup (56 g) / 1 tasse (56 g) [S01–S06]. If accepted into the research ledger, retain one separate `portion_weight` observation for each SKU. The shared numerical value does not establish a generic cereal cup measure or density.
- **Package:** The 516 g figure is a manufacturer/retailer package size. It is not a recipe quantity, portion conversion, yield, or measure mapping [S01–S06, S09–S10].
- **Preparation and density:** These are ready-to-eat dry cereals. The reviewed sources establish no preparation ratio, dry-to-prepared yield, bulk density, or reusable volume-to-mass conversion. Set no forms, active measurements, density, or `unitMappings`.
- **Composition:** Product ingredient declarations name components but provide no proportions. Add no component links, formula, or mapping to oats, grains, almonds, cinnamon, honey, or sweeteners.
- **Substitution:** No reviewed source supplies a tested, quantity-qualified exchange among these three flavors, Multi-Grain Cheerios, generic flakes, oats, or another cereal. Add no global or contextual substitution rule.

## Proposed references and ledger details

If accepted, add these three reference objects together. The French accents and typographic apostrophe are escaped in the proposed JSON text for compatibility with the bundled database convention.

```json
{
  "id": "ingredient-ref-cheerios-oat-crunch-almond",
  "nameFr": "Croquantes \u00e0 l\u2019avoine Amandes Cheerios",
  "nameEn": "Oat Crunch Almond Cheerios",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

```json
{
  "id": "ingredient-ref-cheerios-oat-crunch-cinnamon",
  "nameFr": "Croquantes \u00e0 l\u2019avoine Cannelle Cheerios",
  "nameEn": "Oat Crunch Cinnamon Cheerios",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

```json
{
  "id": "ingredient-ref-cheerios-oat-crunch-oats-n-honey",
  "nameFr": "Croquantes \u00e0 l\u2019avoine Avoine et miel Cheerios",
  "nameEn": "Oat Crunch Oats \u2018N Honey Cheerios",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

For each accepted row, use a ledger record whose `recordId` matches the reference ID, `recordType` is `ingredient_reference`, `identityState` is `verified`, `measurementState` is `researched_supported`, and `substitutionResearchState` is `researched_no_supported_substitute`. Keep `substitutionFindings` empty. Attach only the relevant SKU sources plus shared family-list evidence:

In the ledger table, `S01`–`S10` abbreviate the full source IDs in the source register.

Each observation uses `relationship: portion_weight`, `value: 56`, `valueUnit: g`, `sourceQuantity: { "amount": 1, "unit": "cup" }`, `foodState: dry ready-to-eat cereal, as sold`, `measurementMethod: manufacturer Nutrition Facts serving-size label`, `quantityBasis: SKU-specific nutrition serving only; not a generic cereal measure, density, or unit conversion`, and `evidenceKind: manufacturer_label`. The row supplies its exact observation ID, food description, and source IDs.

| Ledger record | Relevant source IDs | Product-specific observation if recorded |
|---|---|---|
| `ingredient-ref-cheerios-oat-crunch-almond` | S01, S02, S07, S08, S10 | `WP03-OAT-CRUNCH-ALMOND-R198-M1-LABEL-1-CUP-56G`; food description `Oat Crunch Almond Cheerios, Canadian manufacturer Nutrition Facts serving`; source IDs S01 and S02. |
| `ingredient-ref-cheerios-oat-crunch-cinnamon` | S03, S04, S07, S08, S09 | `WP03-OAT-CRUNCH-CINNAMON-R198-M1-LABEL-1-CUP-56G`; food description `Oat Crunch Cinnamon Cheerios, Canadian manufacturer Nutrition Facts serving`; source IDs S03 and S04. |
| `ingredient-ref-cheerios-oat-crunch-oats-n-honey` | S05, S06, S07, S08, S09 | `WP03-OAT-CRUNCH-OATS-HONEY-R198-M1-LABEL-1-CUP-56G`; food description `Oat Crunch Oats ‘N Honey Cheerios, Canadian manufacturer Nutrition Facts serving`; source IDs S05 and S06. |

For each ledger decision use `outcome: accepted` and a reason that applies only to that named SKU: add the identity-only Canadian cereal with the exact manufacturer English/French titles, retain the 56 g cup serving only as a product-specific observation, and add no forms, active numeric behavior, recipe links, conversions, yields, or substitutions. Use that record's source IDs from the table above as decision evidence.

Do not create legacy mappings, ingredient forms, active measures, densities, unit mappings, recipe links, conversions, yields, or substitution rules. If an integration elects not to retain product-specific label observations, it should leave all three measurement states and observations consistently unresolved rather than transferring a value between identities.

## Source register

Sources were opened or searched on **2026-10-16**. Each row below maps one source ID to exactly one URL. Reused IDs keep their original URL ownership; new R198 IDs are prospective ledger entries only if the family is accepted.

| Source ID | Source and URL | Evidence and limits |
|---|---|---|
| `WP03-OAT-CRUNCH-FAMILY-R198-20261016-S01` | General Mills / Cheerios Canada, [Oat Crunch Almond Cheerios](https://www.cheerios.ca/products/oat-crunch-almond-cheerios). | Current Canada-English SKU page. Supports exact English title, ready-to-eat product identity, distinct almond formula description, 516 g package, and 1 cup (56 g) serving. The package label governs if online data conflict. |
| `WP03-OAT-CRUNCH-FAMILY-R198-20261016-S02` | General Mills / Cheerios Canada, [Croquantes à l’avoine Amandes Cheerios](https://www.cheerios.ca/fr-CA/products/croquantes-a-lavoine-amandes-cheerios). | Current Canadian French SKU page. Supports exact French title, product identity, ingredient declaration, 516 g size, and 1 tasse (56 g) serving. This is manufacturer wording, not an OQLF ruling. |
| `WP03-OAT-CRUNCH-CINNAMON-R181-20261016-S01` | General Mills / Cheerios Canada, [Oat Crunch Cinnamon Cheerios](https://www.cheerios.ca/products/oat-crunch-cinnamon-cheerios). | Reused from R181. Current Canada-English SKU page supports the exact English title, distinct cinnamon product, ingredient declaration, 516 g package, and 1 cup (56 g) serving. |
| `WP03-OAT-CRUNCH-CINNAMON-R181-20261016-S02` | General Mills / Cheerios Canada, [Croquantes à l’avoine Cannelle Cheerios](https://www.cheerios.ca/fr-CA/products/croquantes-a-lavoine-cannelle-cheerios). | Reused from R181. Current Canadian French SKU page supports the exact French title, ingredient declaration, 516 g package, and 1 tasse (56 g) serving. |
| `WP03-OAT-CRUNCH-FAMILY-R198-20261016-S03` | General Mills / Cheerios Canada, [Oat Crunch Oats ‘N Honey Cheerios](https://www.cheerios.ca/products/oat-crunch-oats-n-honey-cheerios). | Current Canada-English SKU page. Supports exact English title, distinct honey product description and ingredients, 516 g package, and 1 cup (56 g) serving. |
| `WP03-OAT-CRUNCH-FAMILY-R198-20261016-S04` | General Mills / Cheerios Canada, [Croquantes à l’avoine Avoine et miel Cheerios](https://www.cheerios.ca/fr-CA/products/croquantes-a-lavoine-avoine-et-miel-cheerios). | Current Canadian French SKU page. Supports exact French title, product identity, ingredient declaration, 516 g size, and 1 tasse (56 g) serving. |
| `WP03-STRAWBERRY-BANANA-CHEERIOS-R185-20261016-S03` | General Mills / Cheerios Canada, [Our Products](https://www.cheerios.ca/products). | Reused existing ledger source ID. The current 17-item Canadian English list shows the three Oat Crunch SKUs separately. It supports family scope, not product equivalence. |
| `WP03-OAT-CRUNCH-CINNAMON-R181-20261016-S04` | General Mills / Cheerios Canada, [Nos produits](https://www.cheerios.ca/fr-CA/products). | Reused from R181. The current 17-item French Canadian list gives the three exact localized titles separately. It supports family scope, not a terminology ruling or product equivalence. |
| `WP03-OAT-CRUNCH-FAMILY-R198-20261016-S05` | Provigo Québec, [Céréales](https://www.provigo.ca/fr/collection/cereal). | Current French retailer listing shows 516 g family packages for Cheerios Croquantes à l’Avoine saveur cannelle and Croquantes à l’Avoine & au miel. Supports current Québec retail wording and presence; not formula authority or a reusable measure. |
| `WP03-OAT-CRUNCH-FAMILY-R198-20261016-S06` | Super C Québec, [Céréales croquantes à l'avoine aux amandes Cheerios](https://www.superc.ca/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/cereales-croquantes-a-l-avoine-aux-amandes/p/065633181274). | Current French retail listing identifies a 516 g Almond SKU and product number `065633181274`. It corroborates Québec-facing descriptive wording and package identity; selected-store stock was unavailable in the reviewed page, so no availability claim is made. |

## Recommendation and reopen conditions

**Add all three identity-only references together:** `Oat Crunch Almond Cheerios / Croquantes à l’avoine Amandes Cheerios`, `Oat Crunch Cinnamon Cheerios / Croquantes à l’avoine Cannelle Cheerios`, and `Oat Crunch Oats ‘N Honey Cheerios / Croquantes à l’avoine Avoine et miel Cheerios`. This satisfies the R181 family-coverage condition and makes broad English and French Oat Crunch searches return all three Canadian SKUs. Keep them separate from other Cheerios products and from their ingredient components. Keep aliases empty and add no forms, active measurements, density, mappings, conversions, yields, recipe links, or substitutions. The reviewed 1 cup (56 g) panels remain product-specific ledger observations only. No bundled recipe demand was found.

Reopen the family decision if General Mills adds, removes, renames, or materially changes a Canadian Oat Crunch SKU; if the product-specific Nutrition Facts servings change; if a source establishes a valid reusable measure, preparation yield, or substitution; or if bundled recipe content creates a concrete alias or recipe-link need.

## Root integration decision

**Accepted and integrated all three family members together** as `GRAIN_AND_CEREAL` identities: Almond, Cinnamon, and Oats ’N Honey. This satisfies the R181 family-coverage condition; broad English and French Oat Crunch searches now return all three. Each manufacturer-labeled 1 cup (56 g) portion is recorded only as a SKU-specific ledger observation. Aliases, forms, density, mappings, recipes, conversions, yields, and substitutions remain empty. The live 114-recipe corpus has no matching ingredient demand.
