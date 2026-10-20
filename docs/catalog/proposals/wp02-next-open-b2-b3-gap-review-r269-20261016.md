# WP02 Sections B2/B3 R269 — Chestnut-flour measurement and substitution evidence review

## Review record

- **Reviewed and sources accessed:** 2026-10-16.
- **Status:** Proposal-only. No shared catalog JSON, ledger, checklist, roadmap, generated index, recipe, or application file was changed. No tests, build, or emulator run was performed.
- **Checklist fit:** WP02 Section 04 B2, the open alternative-flour group beginning with “Almond flour versus almond meal; hazelnut, coconut, chestnut, peanut, chickpea/besan, lentil…” ([plan line 2307](../../RecipeBook-global-ingredient-catalog-plan.txt#L2307)). This review addresses only the unfinished measurement and substitution research states for the existing chestnut-flour identity; it does not reopen its accepted identity or close the B2 parent.
- **Candidate:** `ingredient-ref-chestnut-flour`, `chestnut flour / farine de châtaigne`, category `FLOUR_AND_STARCH`.
- **Prior-work boundary:** The 2026-10-10 identity review accepted this row without measures or substitution findings. R263 covers winged-bean flour and R266 covers pregelatinized potato starch; neither is reopened here. No focused chestnut-flour measurement or substitution review was found in the proposal/batch archive.
- **Proposed source-ID prefix:** `WP02-B2-CHESTNUT-FLOUR-MEASURE-SUBSTITUTION-R269-20261016-S`. It was checked against current ledger and proposal/batch records and was unused.
- **Proposed integration batch path:** `docs/catalog/batches/wp02-b2-chestnut-flour-measurement-substitution-evidence-integration-r269-20261016/README.md` (proposed only; no batch file was created).

## Recommendation

Update only the existing ledger record for `ingredient-ref-chestnut-flour` with a small set of source-scoped measurement observations and formulation-specific substitution findings. Mark measurement and substitution research as completed with evidence. Keep the active ingredient row unchanged: no default density, unit mapping, `IngredientForm`, recipe link, conversion, yield, or active substitution rule.

The published volume-to-mass examples do not agree closely enough to define a reusable cup measure. GialloZafferano gives 2 cups (200 g) for chestnut flour in its cantucci recipe, while The American Chestnut Foundation’s Chestnut Blondies recipe gives 1½ cups (7½ oz, about 212.6 g). These are recipe-published quantities, not controlled density measurements; they differ by roughly 42% when expressed per cup, and the sources do not provide a consistent flour-packing method or product specification. Record them as separate `portion_weight` observations only. Do not choose a value, average them, or promote either to an active density or unit mapping. [S01–S02]

Primary formulation studies support context-bound replacement findings, but they do not justify a general chestnut-flour-for-wheat-flour ratio. Raczyk et al. (Marianna Raczyk is first author; Bartosz Kruszewski is second author) tested chestnut-flour replacements of 5%, 10%, 15%, 30%, and 50% by weight in wheat bread; their sensory and quality findings depended on that bread process, and the 50% sample performed poorly on several outcomes. Gallego et al. studied wheat, chestnut, and chickpea flour combinations in layer cakes. The tested 50% wheat/50% chestnut blend had lower specific volume and lower consumer overall-acceptability than the wheat-only control; the 100% chestnut-flour sample was not consumer-scored. Record these as two research findings with their dish type, tested percentages, and limitations. Do not create a reusable contextual rule from the lab formulas. [S03–S04]

Hearthy Foods markets its chestnut flour for uses including baked goods, sauces, and roux and calls it a substitute for white flour, but provides no replacement percentage or matched recipe formula on the product page. Treat this as broad manufacturer guidance, not a ratio or permission for one-for-one substitution. [S05]

## Proposed ledger disposition

| Field | Proposed value | Limit |
|---|---|---|
| `measurementState` | `researched_supported` | Supported only as two separately attributed recipe portions. No canonical chestnut-flour cup weight or density is supported. |
| `measurementObservations` | Add one published portion for 2 cups / 200 g and one for 1½ cups / 7½ oz (about 212.6 g). | Preserve the published quantities and identify the ounce-to-gram conversion as derived. The recipe source’s flour type, cup fill, and packing method remain unspecified. |
| `substitutionResearchState` | `researched_supported` | Evidence supports experimental, dish-specific replacement findings only. It does not support a global replacement, a general household rule, or a default ratio. |
| `substitutionFindings` | Add one wheat-bread study finding and one layer-cake study finding, each tied to its tested recipe system and mass percentages. | Store findings as research evidence only; do not add runtime `substitutionRules` or `contextualSubstitutionRules`. |
| Active reference | No change | Retain `defaultDensity: null`, empty `unitMappings`, empty aliases, and no forms or recipe links. |

No bundled recipe demand was found for chestnut flour. The two paper findings therefore document product behavior and research coverage only; they do not create a recipe-specific substitution link.

The following is a reviewable shape for the ledger observations and findings, not an applied JSON delta. The ACF mass is converted from the recipe’s reported ounces; the amount is kept tied to the source’s 1½ cups.

```json
{
  "measurementObservations": [
    {
      "observationId": "giallozafferano-cantucci-chestnut-flour-2-cups-200g-r269",
      "relationship": "portion_weight",
      "value": 200,
      "valueUnit": "g",
      "foodDescription": "Chestnut flour in GialloZafferano chestnut-flour cantucci recipe",
      "evidenceKind": "published_portion",
      "sourceIds": ["WP02-B2-CHESTNUT-FLOUR-MEASURE-SUBSTITUTION-R269-20261016-S01"],
      "sourceQuantity": {"amount": 2, "unit": "cup"},
      "observedMassG": 200,
      "quantityBasis": "Recipe-published pair of 2 cups and 200 g; not a global cup measure.",
      "measurementMethod": "Published recipe quantity; no cup-filling or weighing method is specified."
    },
    {
      "observationId": "acf-chestnut-blondies-chestnut-flour-1-5-cups-7-5-oz-r269",
      "relationship": "portion_weight",
      "value": 212.6,
      "valueUnit": "g",
      "foodDescription": "Chestnut flour in The American Chestnut Foundation Chestnut Blondies recipe",
      "evidenceKind": "derived",
      "sourceIds": ["WP02-B2-CHESTNUT-FLOUR-MEASURE-SUBSTITUTION-R269-20261016-S02"],
      "sourceQuantity": {"amount": 1.5, "unit": "cup"},
      "observedMassG": 212.6,
      "quantityBasis": "Recipe-published pair of 1½ cups and 7½ oz; the gram value is derived and remains recipe-specific.",
      "measurementMethod": "Convert the published 7.5 avoirdupois oz to grams; cup fill and packing method are not specified.",
      "calculation": "7.5 oz × 28.3495 g/oz = 212.621 g, rounded to 212.6 g."
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "chestnut-flour-wheat-bread-formulation-study-r269",
      "researchState": "researched_supported",
      "replacements": [
        {"ingredientRefId": "ingredient-ref-chestnut-flour", "roleInCompound": "study-specific partial replacement for wheat flour"}
      ],
      "context": "Experimental wheat bread; chestnut flour was tested as 5%, 10%, 15%, 30%, and 50% by-weight replacement of wheat flour.",
      "basis": "Raczyk et al. (Marianna Raczyk first author; Bartosz Kruszewski second author) report good-quality bread and favorable overall acceptance for the tested 5–15% formulations; the 50% chestnut-flour loaf performed poorly on several evaluated outcomes.",
      "expectedEffects": ["Results varied with the substitution level and the tested bread process."],
      "limitations": ["Study-specific formula and flour samples; do not generalize as a bread or baking substitution ratio."],
      "sourceIds": ["WP02-B2-CHESTNUT-FLOUR-MEASURE-SUBSTITUTION-R269-20261016-S03"]
    },
    {
      "findingId": "chestnut-flour-layer-cake-formulation-study-r269",
      "researchState": "researched_supported",
      "replacements": [
        {"ingredientRefId": "ingredient-ref-chestnut-flour", "roleInCompound": "study-specific replacement material in wheat-flour layer-cake formulations"}
      ],
      "context": "Experimental layer cakes included a 50% wheat-flour / 50% chestnut-flour blend, a 100% chestnut-flour sample, wheat-only control, and chickpea/chestnut combinations.",
      "basis": "Gallego et al. report that the 50% wheat / 50% chestnut blend had lower specific volume and lower consumer overall-acceptability than the wheat-only control. The 100% chestnut-flour sample was not consumer-scored.",
      "expectedEffects": ["For the tested layer-cake formula, the 50/50 wheat/chestnut blend had lower specific volume and consumer overall-acceptability than the wheat-only control."],
      "limitations": ["The 100% chestnut-flour sample was not included in consumer scoring. The flour was a particular supplied sample sieved below 130 μm; do not generalize to other cake types, brands, or household recipes."],
      "sourceIds": ["WP02-B2-CHESTNUT-FLOUR-MEASURE-SUBSTITUTION-R269-20261016-S04"]
    }
  ]
}
```

## Measurement evidence

| Source | Observation | Why it stays source-scoped |
|---|---|---|
| **S01 — GialloZafferano, Chestnut Flour Cantucci with Almonds and Chocolate** | The ingredient list gives chestnut flour as **2 cups (200 g)**. | This is a published formula for one recipe. It does not report a weighed cup sample, the product, or whether the cup was sifted, dipped, or packed. |
| **S02 — The American Chestnut Foundation, “Chestnut Blondies”** | The recipe gives **1½ cups chestnut flour (7½ oz)**. Converting 7.5 avoirdupois ounces gives approximately **212.6 g** for that recipe amount. | The mass is converted from the recipe’s ounce amount. The recipe does not identify flour origin, volume standard, or measuring technique. Keep the conversion attached to this recipe rather than treating it as a measured bulk density. |

These observations conflict as mass-per-cup equivalents. The static evidence supports preserving both recipe values; it does not support choosing a default. Both mass-volume pairs are ingredients in multi-component formulas, not laboratory density measurements.

## Substitution evidence and boundary

| Source | Bounded finding | Limit |
|---|---|---|
| **S03 — Raczyk et al. (2021), wheat bread** | Marianna Raczyk is first author and Bartosz Kruszewski is second author. The study tested 5%, 10%, 15%, 30%, and 50% chestnut-flour replacement by weight. In the tested formulation, breads at 5–15% retained acceptable quality and the 15% loaf scored favorably; the 50% loaf was very sweet and performed poorly on evaluated quality outcomes. | This applies to the study’s wheat-bread formula, flour samples, and process. It is not a universal recommendation or an equal-volume rule. The paper notes uncertainty in whether 15% or 30% remains preferable for overall quality. |
| **S04 — Gallego et al. (2022), layer cakes** | The study tested wheat-only and chestnut-only samples, a 50/50 wheat/chestnut flour blend, and other wheat/chestnut/chickpea combinations. The 50/50 blend had lower specific volume and lower consumer overall-acceptability than the wheat-only control. The 100% chestnut-flour sample was not consumer-scored. | The commercial chestnut flour was sieved below 130 μm and the recipes used a fixed layer-cake system. The reported comparison is specific to the 50/50 blend and wheat-only control; it does not establish a replacement for other cakes, breads, or cookies. |
| **S05 — Hearthy Foods, Chestnut Flour** | The manufacturer recommends the product for several uses and says it can substitute for white flour; it also suggests 1–2 tablespoons for roux. | No proportion, control recipe, or measured thickening equivalence is given. Keep the claim qualitative and specific to the maker’s product page. |

The primary studies show that replacement outcomes vary by product and formula. Keep each finding in the research ledger with the tested dish, sample/process limits, and exact replacement levels. Do not activate a global rule or generalize the study percentages to recipes in the bundled library.

## Read-only catalog and corpus audit

The current active row is `ingredient-ref-chestnut-flour` with `nameEn: chestnut flour`, `nameFr: farine de châtaigne`, empty aliases, `defaultDensity: null`, and empty unit mappings. The research ledger marks identity `verified`, but measurement and substitution research remain `not_yet_researched`; it currently has only the three sources from the accepted 2026-10-10 identity review and has no measurement observations or substitution findings. No chestnut-flour form was found.

The active seed package contains 1,656 ingredient references. The manifest-listed corpus has 114 recipes and 1,123 ingredient rows; a read-only phrase scan found no occurrence of `chestnut flour`, `farine de châtaigne`, or the candidate ID. No recipe relink is justified. The candidate ID remains the single active identity owner for the exact English and French displays. No existing measurement or substitution rule for this row was found.

## Remaining uncertainty

- No controlled household-measure study or consistent manufacturer label was found that establishes a generic mass per cup for the active chestnut-flour identity.
- The two recipe mass-volume pairs disagree, and neither source specifies cup fill or packing method. Recipe-published observations should not be interpreted as a common density.
- The bread and layer-cake studies use particular flour materials and formulas. They do not establish substitution guidance for other dish types, flours, brands, or a specific household recipe.
- Hearthy’s statement that chestnut flour substitutes for white flour is qualitative and gives no rate or recipe-matched outcome.
- The seed recipe corpus contains no direct chestnut-flour use from which to derive a recipe-specific rule.

## Static review only

Read-only review covered the WP02 plan section, current active reference row, ingredient forms, research-ledger record, proposal/batch archive, recipe manifest and manifest-listed recipe text. The proposed R269 source-ID prefix and batch path were checked for collisions. No file outside this proposal was changed. No software tests, build, instrumentation, or emulator run was performed or needed for this proposal-only review.

## Evidence register

Sources were reviewed on 2026-10-16. New source IDs below are proposal-local; no source record was added to the shared ledger.

| ID | Source and direct support | Limit |
|---|---|---|
| **S01** | GialloZafferano, [Chestnut Flour Cantucci with Almonds and Chocolate](https://www.giallozafferano.com/recipes/chestnut-flour-cantucci-with-almonds-and-chocolate.html), ingredient list. Gives 2 cups (200 g) chestnut flour in the recipe. | Recipe-published pair only; no controlled measurement method. |
| **S02** | The American Chestnut Foundation, [The Journal of The American Chestnut Foundation, Winter 2019, “Chestnut Blondies”](https://www.acf.org/wp-content/uploads/2020/05/FINAL_Chestnut_Winter2019.pdf), p. 36. Recipe by Kathy Patrick lists 1½ cups chestnut flour (7½ oz). | Published recipe amount, not a weighed cup protocol. The gram equivalent is a proposal calculation from 7.5 oz. |
| **S03** | Raczyk et al. (Marianna Raczyk first author; Bartosz Kruszewski second author), [Effect of Coconut and Chestnut Flour Supplementations on Texture, Nutritional and Sensory Properties of Baked Wheat Based Bread](https://pmc.ncbi.nlm.nih.gov/articles/PMC8347958/), 2021. Tests chestnut-flour replacement at 5–50% by weight in wheat bread and reports quality and sensory outcomes. | Specific flour samples, dough formula, bread process, and study panel; not universal substitution guidance. |
| **S04** | Gallego et al., [Effects of adding chickpea and chestnut flours to layer cakes](https://academic.oup.com/ijfst/article/57/8/4840/7807014), *International Journal of Food Science and Technology* 57(8), 2022. The 50% wheat/50% chestnut blend had lower specific volume and lower consumer overall-acceptability than the wheat-only control; the 100% chestnut-flour sample was not consumer-scored. | Chestnut flour was supplied by Sortegel and sieved below 130 μm; outcomes remain formula-specific. |
| **S05** | Hearthy Foods, [Chestnut Flour](https://www.hearthyfoods.com/en-ca/products/chestnut-flour), current manufacturer product page. Describes the product’s intended uses, calls it a white-flour substitute, and suggests 1–2 tablespoons for roux. | Maker-specific qualitative guidance with no replacement ratio or comparable control formula. |
