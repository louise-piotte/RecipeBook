# WP02 B2 next flour/starch gap review — sweet lupin flour measurement and baking evidence (R529)

## Review record

- **Reviewed and sources accessed:** 2026-10-17.
- **Status:** Integrated on 2026-10-17. The existing sweet-lupin ledger record now contains the product-specific label portion and formula-bounded bread finding; no active reference or runtime substitution rule changed. See the [R528–R530 integration README](../batches/wp02-wp03-wp04-r528-r530-gap-review-integration-20261017/README.md).
- **Open checklist:** WP02 B2, “Almond flour versus almond meal; hazelnut, coconut, chestnut, peanut, chickpea/besan, lentil, pea, soy, and lupin flours,” at [the active plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L2612).
- **Record under review:** `ingredient-ref-sweet-lupin-flour`, the verified `sweet lupin flour / farine de lupin blanc` identity for *Lupinus albus*.
- **Source-ID prefix:** `WP02-B2-SWEET-LUPIN-FLOUR-MEASURE-SUBSTITUTION-R529-20261017-S`. The live ledger and proposal/batch archive were searched before use; no existing owner was found for this prefix or the new URLs below.
- **Scope:** One product-specific label portion and formula-bounded baking evidence for the existing *L. albus* flour row. This does not reopen the earlier French-display ruling or review sweet blue lupin flour.

## Recommendation

Integrate bounded research into the existing `ingredient-ref-sweet-lupin-flour` ledger record:

- Record Ecoideas’ product-label portion as **2 tbsp (15 g)** for its organic white-lupin flour. Set `measurementState` to `researched_supported`, but retain `defaultDensity: null`, empty `unitMappings`, and no reusable volume-to-mass conversion. This is one label serving, not a measured density or a general tablespoon/cup conversion.
- Record one supported, source-specific bread finding: a primary study replaced re-milled durum semolina with sweet white-lupin flour at **3, 7, 10, and 15 g per 100 g** in a defined experimental bread formula. Set `substitutionResearchState` to `researched_supported` to record that tested use, but omit `ruleId` and add no active global or contextual substitution. The study reports product- and formula-dependent changes, including lower loaf specific volume and a harder crumb; it does not supply a general flour replacement ratio.
- Keep the active reference, its bilingual display and aliases, forms, recipe links, density, unit mappings, conversions, yields, and active substitution rules unchanged. Keep the B2 parent checklist open.

“Supported” here means that a named experimental formula documents a partial replacement. It does not make that percentage suitable for arbitrary breads, pastry, sauces, or a recipe with no matching role. The label portion and the study use different products and do not combine into a density or home-baking rule.

## Plan fit and prior decisions

The B2 alternative-flour umbrella remains open and explicitly includes lupin flour. The base *L. albus* identity and its French display were reviewed earlier; the current ledger shows `identityState: verified` but still has both measurement and substitution research at `not_yet_researched`. The earlier Québec terminology reviews retained `sweet lupin flour / farine de lupin blanc` and kept generic `lupin flour` / `farine de lupin` off the alias arrays. R529 addresses the still-open measurement and baking-evidence states without reopening those decisions.

This is separate from R284 chickpea-flour measurement and substitution research, R319 Besan aliases, and R525 precooked chickpea-flour form. It does not review chickpea flour, chickpea forms, white-lupin seeds, or the existing sweet blue lupin row for *L. angustifolius*.

## Active ownership and current picker

The current active row is:

| Field | Current value |
|---|---|
| Reference | `ingredient-ref-sweet-lupin-flour` |
| Display | `sweet lupin flour / farine de lupin blanc` |
| Category | `FLOUR_AND_STARCH` |
| Aliases | `aliasesEn: []`; `aliasesFr: []` |
| Numeric/forms | `defaultDensity: null`; `unitMappings: []`; no attached form |
| Existing ledger state | Identity `verified`; measurement and substitution `not_yet_researched` |

Keep adjacent identities separate. `ingredient-ref-sweet-blue-lupin-flour` is the species-qualified *L. angustifolius* product and currently shares only the broad `lupin flour` search phrase. `ingredient-ref-white-lupin-seeds` is a whole-seed identity; do not attach a flour portion or baking finding to it. The La Moisson Québec product page used for prior terminology work is already owned by source ID `WP02-MUNG-FLOUR-QUEBEC-20261011-S05` on the `candidate-mung-bean-flour` ledger record; reuse that ID if citing the same URL rather than registering the URL under another ID.

The current `IngredientSearch.kt` implementation checks complete normalized word phrases before partial matching. This is a static projection from the current references, forms, and search code; no app picker was run.

| Query | Current results | Proposed results | Form hint |
|---|---|---|---|
| `sweet lupin flour` | `ingredient-ref-sweet-lupin-flour` | Same | None; no form is proposed |
| `farine de lupin blanc` | `ingredient-ref-sweet-lupin-flour` | Same | None |
| `lupin flour` | `ingredient-ref-sweet-blue-lupin-flour`; `ingredient-ref-sweet-lupin-flour` | Same two rows | None |
| `farine de lupin` | `ingredient-ref-sweet-blue-lupin-flour`; `ingredient-ref-sweet-lupin-flour` | Same two rows | None |
| `lupin blanc` | `ingredient-ref-sweet-lupin-flour`; `ingredient-ref-white-lupin-seeds` | Same two rows | None |
| `white lupin flour` | None | None | None; no English alias is proposed in this numeric review |
| `organic lupin flour` | None | None | None; the brand modifier is not a proposed alias |

The current bilingual display continues to resolve the exact flour names. The absence of an English alias for `white lupin flour` is recorded here as a picker observation only; this packet makes no alias recommendation and preserves the prior boundary against generic lupin aliases.

## Measurement evidence and limits

Ecoideas’ product listing describes an organic lupin flour made from European white lupin; a Québec retailer lists the same Ecoideas product in a 400 g package. An Ontario Nutrition listing for Ecoideas Organic Lupin Flour 400 g reproduces a label serving of **2 tbsp (15 g)** and identifies organic white lupin. That listing is marked out of stock. It is sufficient for one product-specific label observation, but no scoop/fill method, bulk density, or variation across lots is given.

Do not turn 2 tbsp = 15 g into 1 tbsp, 1/4 cup, 1 cup, or grams-per-millilitre values. A nutrition serving is not a standardized flour filling method. The Ontario Nutrition page also shows “Phase 1” and “Phase 2” quarter-cup amounts elsewhere on the page; those diet-plan portions are not used as product-label weights in this review.

Integrated ledger observation:

```json
{
  "observationId": "ecoideas-white-lupin-flour-2-tbsp-15g-r529-20261017",
  "relationship": "portion_weight",
  "value": 15,
  "valueUnit": "g",
  "foodDescription": "Ecoideas Organic Lupin Flour 400 g; organic white lupin; product-specific nutrition-label serving.",
  "evidenceKind": "manufacturer_label",
  "sourceIds": ["WP02-B2-SWEET-LUPIN-FLOUR-MEASURE-SUBSTITUTION-R529-20261017-S03"],
  "sourceQuantity": {"amount": 2, "unit": "tbsp"},
  "observedMassG": 15,
  "quantityBasis": "One brand-specific label serving. No spoon fill/level method or general flour conversion is stated.",
  "measurementMethod": "Retailer listing reproduces the product nutrition-label serving declaration."
}
```

This is a ledger observation only. Do not add a form, default density, unit mapping, unit conversion, recipe link, or yield.

## Baking and substitution evidence

Spina et al. tested sweet white lupin flour (*L. albus*) from Terrena in durum-wheat bread. In the flour blend, they replaced re-milled durum semolina with **3, 7, 10, or 15 g per 100 g** lupin flour. The authors selected this tested range after preliminary trials: additions below 3% showed no significant difference from the control, while levels above 15% produced excessive ash and browning. They used farinograph water absorption and a defined mixing, proofing, and baking process. The study reports reduced loaf specific volume and a harder crumb with lupin addition, and concludes that breadmaking with lupin requires adjustments to strengthen the gluten network. This supports only the named experimental semolina-bread formula and its tested flour. It does not support a 3–15% recommendation for arbitrary bread or for a general wheat-flour recipe.

Guardianelli et al. independently studied white-lupin cultivars Misak and Rumbo in wheat breads at 10%, 20%, and 30% flour incorporation. The cultivars came from different origins and behaved differently in hydration, rheology, and bread quality. This reinforces that flour composition and results vary even within *L. albus*; these inclusion levels are not added as replacement guidance for the Ecoideas retail product.

Integrated ledger finding:

```json
{
  "findingId": "sweet-lupin-flour-re-milled-durum-semola-bread-spina-r529-20261017",
  "researchState": "researched_supported",
  "fromIngredientRefId": "ingredient-ref-semola-rimacinata",
  "replacements": [
    {
      "ingredientRefId": "ingredient-ref-sweet-lupin-flour",
      "roleInCompound": "Replaced 3, 7, 10, or 15 g per 100 g of re-milled durum semolina in the named experimental bread blend; no general ratio."
    }
  ],
  "context": "Spina et al. used sweet white lupin flour (Lupinus albus L.) purchased from Terrena to replace part of re-milled durum semolina for a defined durum-bread formula. Water was set by farinograph absorption; mixing, proofing, and baking conditions were controlled. Preliminary trials set 3–15 g/100 g as the tested range.",
  "basis": "The primary study reports reduced loaf specific volume and harder crumb texture in the tested bread blends and concludes that lupin breadmaking needs adjustments to strengthen the gluten network.",
  "expectedEffects": [
    "In the tested formula, increasing the white-lupin flour proportion changed dough and bread properties.",
    "The reported bread outcome is product- and process-specific, not a universal substitution result."
  ],
  "limitations": [
    "One sweet white-lupin flour source and one experimental re-milled durum-semolina bread context; the flour was not the Ecoideas product measured above.",
    "Tested amounts are experimental blend levels. Do not treat them as a recipe replacement recommendation outside this formula.",
    "The study reports changes to loaf properties and a need to strengthen gluten; it does not define a reusable adjustment or an active substitution rule.",
    "Do not generalize to sweet blue lupin flour, other species, cakes, cookies, pastry, or other recipe roles."
  ],
  "sourceIds": ["WP02-B2-SWEET-LUPIN-FLOUR-MEASURE-SUBSTITUTION-R529-20261017-S05"]
}
```

Set `substitutionResearchState` to `researched_supported` only with this narrow finding and its limitations. Omit `ruleId`; add no global or contextual substitution rule, active replacement, warning, recipe-line link, or form conversion. The bundled recipes have no lupin demand to anchor a recipe-specific rule.

## Integrated ledger disposition

| Field | Integrated value | Boundary |
|---|---|---|
| `identityState` | `verified` | Keep the existing species-scoped identity and display. |
| `measurementState` | `researched_supported` | One Ecoideas product-label serving, 2 tbsp (15 g). |
| `measurementObservations` | Add the portion observation above | Do not activate a reusable measure, density, mapping, or conversion. |
| `substitutionResearchState` | `researched_supported` | One formula-bounded primary bread finding, no `ruleId`. |
| `substitutionFindings` | Add the finding above | Keep the tested replacement context and product/formula limits in the ledger. |
| Active references, aliases, forms, rules, and recipes | No change | Preserve the current picker, no-form state, and no-recipe-demand result. |

## Recipe corpus and package snapshot

The manifest-ordered bundled corpus was scanned across all recipe JSON and ingredient rows on 2026-10-17. It contains **114 recipes / 1,123 ingredient rows**. A case-insensitive scan for `lupin`, `lupine`, `lupini`, and `farine de lupin` found **0 matching ingredient rows** and **0 matching recipe JSON files**. No row links to `ingredient-ref-sweet-lupin-flour`; nearby whole-lupin-seed wording is not a flour demand.

| File | Rows/count | SHA-256 |
|---|---:|---|
| `manifest.v1.json` | 114 recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe filenames and bytes, hashed as `filename + NUL + file bytes` | 114 recipes / 1,123 ingredient rows | `d870d4e10ea14513b63e36f522668d948df59f27e9b21882826885a549ac26cd` |

Other current snapshot totals: 1,797 ingredient references, 144 forms, 56 legacy candidates, 2,154 ledger records, 9,900 source entries, 8,378 distinct source IDs, 7,086 distinct source URLs, and 8 unit conversions. These are review-time counts, not a merge instruction.

| Current file | SHA-256 |
|---|---|
| `ingredient-references.v1.json` | `bb380278585b32b2785b8b1bad1907b5f1b1b3903ef32ad5c5c345a849f11923` |
| `ingredient-forms.v1.json` | `5a47b562629b3f7a248f4d6068b606a6baf6c216480caca8a63fc9fb1ec74b17` |
| `research-ledger.v1.json` | `c008ddb41869db43f5c9c20b2d2fd71760da66621d1689f04b844ea902dff13c` |
| `legacy-import-identities.v1.json` | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |

## Source ownership and register

The existing sweet-lupin ledger row already owns the Health Canada English/French terminology sources, OQLF’s *L. albus* entry, and the CFIA lupin-seed terminology source. Reuse those existing IDs for identity context: `WP02-B23-FLOUR-RESIDUAL-20261010-S01/S02`, `WP02-LUPIN-QC-ROOT-20261011-S01`, and `WP02-LUPIN-QC-ROOT-20261011-S03`. The La Moisson Québec product URL is already registered on `candidate-mung-bean-flour` as `WP02-MUNG-FLOUR-QUEBEC-20261011-S05`; reuse it if the Québec French product listing is cited. No new ID is assigned to any of those URLs.

The five R529 source IDs are now registered on the existing sweet-lupin ledger record. Before integration, their exact URLs and IDs were checked against the complete ledger and proposal/batch archive and had no owner.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP02-B2-SWEET-LUPIN-FLOUR-MEASURE-SUBSTITUTION-R529-20261017-S01` | Ecoideas, [Organic Lupin Flour (200 g)](https://www.ecoideas.ca/products/organic-lupin-flour-200g), product description and package. | The manufacturer page describes the product as harvested from premium European white lupin. It corroborates the *L. albus* product family; the page gives no label serving weight. Its 200 g item was marked sold out in the retrieved page, so it is not evidence of current stock. |
| `WP02-B2-SWEET-LUPIN-FLOUR-MEASURE-SUBSTITUTION-R529-20261017-S02` | La Boîte à Grains, [Organic lupin flour](https://laboiteagrains.com/en/products/organic-lupin-flour), product listing, SKU 87540500605, 400 g format, description and ingredient statement. | Current Québec retailer listing for Ecoideas; it says Ecoideas white lupin, describes European-origin organic lupin flour, and offers the 400 g package. Supports local product scope and brand; it provides no volume-to-mass measure. The displayed commercial product name is “Organic lupin flour,” not an exact `white lupin flour` alias. |
| `WP02-B2-SWEET-LUPIN-FLOUR-MEASURE-SUBSTITUTION-R529-20261017-S03` | Ontario Nutrition, [Ecoideas Organic Lupin Flour 400 g](https://ontarionutrition.ca/product/ecoideas-organic-lupin-flour-400g/), “Nutritional Information,” serving-size row. | Reproduces the Ecoideas product panel’s **2 tbsp (15 g)** serving and identifies organic white lupin; supports one product-specific `portion_weight` observation. The page is marked out of stock and does not state a spoon-fill method, density, cultivar, or lot. Do not use the separate Dr. Poon diet-plan quarter-cup entries on the page as flour mass data. |
| `WP02-B2-SWEET-LUPIN-FLOUR-MEASURE-SUBSTITUTION-R529-20261017-S04` | Guardianelli et al., [“White Lupine (*Lupinus albus* L.) Flours for Healthy Wheat Breads: Rheological Properties of Dough and the Bread Quality”](https://pmc.ncbi.nlm.nih.gov/articles/PMC10137421/), *Foods* 12(8):1645 (2023), DOI [10.3390/foods12081645](https://doi.org/10.3390/foods12081645), Methods §2.1 and bread results §3.3/Table 3. | Primary study of white-lupin cultivars Misak and Rumbo at 10%, 20%, and 30% incorporation into wheat breads. It reports cultivar-dependent hydration, rheology, and bread results. Supports experimental variability, not an Ecoideas product match or universal replacement percentage. |
| `WP02-B2-SWEET-LUPIN-FLOUR-MEASURE-SUBSTITUTION-R529-20261017-S05` | Spina et al., [“Lupin as Ingredient in Durum Wheat Breadmaking: Physicochemical Properties of Flour Blends and Bread Quality”](https://pmc.ncbi.nlm.nih.gov/articles/PMC10931101/), *Foods* 13(5):807 (2024), DOI [10.3390/foods13050807](https://doi.org/10.3390/foods13050807), Methods §§2.1, 2.8; bread-formula Table 1; results and conclusion. | Primary study: sweet white-lupin flour (*L. albus*) from Terrena partially replaces re-milled durum semolina at 3, 7, 10, and 15 g/100 g in defined bread formulas. It reports reduced loaf specific volume/harder crumb and a need to strengthen the gluten network. This is a tested experimental formula, not a transferable home-cooking substitution. |

The existing La Moisson source, rechecked on 2026-10-17, remains useful for its Québec French product wording but is not assigned a new source ID. It lists *farine de lupin biologique*, the ingredient *lupin blanc biologique*, and 200/400 g options; the page currently reports a stockout. It supports product-language context, while Health Canada and OQLF remain the terminology basis for the stored French display.

## Static review record

- Re-read `AGENTS.md`, the active B2 checklist, current ingredient references/forms, the full research ledger and schema, legacy candidates, relevant prior proposals/integration notes, the current picker implementation, and the manifest-listed recipe bundle.
- Verified both lupin-flour reference rows, the adjacent whole-seed identity, the target ledger’s still-unresearched numeric states, and the absence of attached forms. Confirmed no prior measurement/substitution review for the *L. albus* row; prior lupin reviews were identity and Québec-display work.
- Checked source-ID/URL ownership before integration. Reused the existing La Moisson source ID and existing identity source IDs; the five new R529 IDs are now registered on the sweet-lupin ledger record.
- Reconstructed picker results from the current phrase-first implementation and scanned all manifest-listed recipes and ingredient rows. No candidate ingredient demand, recipe link, form, or picker change is proposed.
- No application tests, build, emulator, or deployment were run during this data-only work. Root integration is limited to the ledger and planning/documentation changes recorded above.
