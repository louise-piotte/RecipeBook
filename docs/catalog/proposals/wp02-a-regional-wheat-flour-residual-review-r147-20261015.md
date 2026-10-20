# WP02 A regional wheat-flour residual review — R147 — 2026-10-15

## Review record

- **Reviewed and sources accessed:** 2026-10-15.
- **Status:** Proposal only. No shared catalog, ledger, plan, recipe, generated file, or test was changed.
- **Scope:** Three candidates from WP02 Section A's open regional/specialist wheat-flour gap: sprouted whole-wheat flour, sprouted spelt flour, and whole Red Fife flour.
- **Open checklist item:** [WP02 A, “Add the remaining functionally distinct regional wheat-flour identities”](../../RecipeBook-global-ingredient-catalog-plan.txt#L1278).
- **Source-ID namespace:** `WP02-A-REGIONAL-WHEAT-FLOUR-RESIDUAL-R147-20261015-S01` through `S08`. The full IDs were checked against current ledger source IDs; none collide.

## Recommendation

Add three identity-only references. Keep each grain and process qualifier explicit. Add no forms, recipe links, active measurements, density defaults, unit mappings, conversions, yields, or substitution rules. Keep the broader WP02 A checklist open.

| Candidate | Recommendation | Exact display and aliases | Boundary |
|---|---|---|---|
| Sprouted whole-wheat flour | **Add** | `sprouted whole wheat flour` / `farine de blé entier germé`; English alias `sprouted wheat flour`; no French aliases. | Canadian products marketed as “sprouted wheat flour” describe whole-grain wheat, while the Québec-facing product image uses the French wording. Keep it separate from ordinary whole-wheat flour and from the existing whole-kernel sprouted-wheat-berries row. Do not add the process phrase to either existing row. |
| Sprouted spelt flour | **Add** | `sprouted spelt flour` / `farine d'épeautre germé`; no aliases. | A Québec retailer sells the One Degree product under this exact French wording and ingredient description. Keep it separate from plain spelt flour and malted spelt flour. Sprouted is not malted. |
| Whole Red Fife flour | **Add** | `whole Red Fife flour` / `farine Red Fife entière`; no aliases. | A current Québec mill and the Québec Food Directory identify whole Red Fife flour as flour from the named Canadian wheat variety. Limit this row to the whole product evidenced here; do not imply that white Red Fife flour is the same grade. Do not crosswalk it to French type T150, whole-wheat flour, bread flour, or high-gluten flour. |

For Red Fife, the cultivar-specific label is useful for selecting a named specialty flour even though the catalog has a generic whole-wheat identity. The recommended identity is deliberately scoped to the Québec product directly evidenced; the mill's separate white Red Fife product remains outside this proposal.

## Proposed reference JSON delta

These are the complete new reference objects recommended for `ingredient-references.v1.json`. No existing reference should be edited.

```json
[
  {
    "id": "ingredient-ref-sprouted-whole-wheat-flour",
    "nameFr": "farine de blé entier germé",
    "nameEn": "sprouted whole wheat flour",
    "aliasesFr": [],
    "aliasesEn": ["sprouted wheat flour"],
    "defaultDensity": null,
    "unitMappings": [],
    "updatedAt": "2026-10-15T00:00:00Z",
    "category": "FLOUR_AND_STARCH"
  },
  {
    "id": "ingredient-ref-sprouted-spelt-flour",
    "nameFr": "farine d'épeautre germé",
    "nameEn": "sprouted spelt flour",
    "aliasesFr": [],
    "aliasesEn": [],
    "defaultDensity": null,
    "unitMappings": [],
    "updatedAt": "2026-10-15T00:00:00Z",
    "category": "FLOUR_AND_STARCH"
  },
  {
    "id": "ingredient-ref-whole-red-fife-flour",
    "nameFr": "farine Red Fife entière",
    "nameEn": "whole Red Fife flour",
    "aliasesFr": [],
    "aliasesEn": [],
    "defaultDensity": null,
    "unitMappings": [],
    "updatedAt": "2026-10-15T00:00:00Z",
    "category": "FLOUR_AND_STARCH"
  }
]
```

The `sprouted wheat flour` alias is the exact English product phrase used by Canadian suppliers; their descriptions identify the flour as made from sprouted whole wheat. It lets that query find the qualified whole-wheat row while preserving the more informative display. It also means the shorter query `sprouted wheat` will return both the existing berries reference and the proposed flour reference; that is a useful picker distinction, and the longer query `sprouted wheat berries` remains exclusive to the grain row. No broader aliases such as `sprouted grain flour`, `farine germée`, `Red Fife`, or `farine de blé entier` are proposed.

## Live catalog, archive, and bundled demand

At review time, the live tree contained 1,505 ingredient references, 119 ingredient forms, and 1,850 research-ledger records with 7,790 source entries and 6,646 distinct source IDs. The manifest lists 114 recipe JSON files with 1,123 ingredient rows. A scan of those recipe files found no exact candidate display or alias phrase in recipe text or ingredient rows, so no recipe links are proposed.

The current reference catalog contains generic whole-wheat flour, white whole-wheat flour, spelt flour, malted spelt flour, and sprouted wheat berries, but none of these three candidate flour references or exact product phrases. The forms catalog contains no sprouted wheat, sprouted spelt, or Red Fife flour form. The two active substitution-rule arrays are empty. There is no matching active form, package yield, density, or unit mapping for these candidates.

The archive sweep found no prior proposal or batch that resolves sprouted spelt flour or Red Fife flour. The [sprouted-wheat-berries proposal](wp03-section-f-next-gap-review-20261012-round6.md#L60) explicitly lists sprouted wheat flour as a separate boundary but does not decide it. The [sprouted-wheat-berries integration record](../batches/wp03-section-f-sprouted-wheat-berries-identity-integration-20261012/README.md) keeps the whole-kernel product distinct from flour. The existing [sprouted buckwheat flour review](wp02-a6-sprouted-buckwheat-flour-identity-review-20261012.md) provides a relevant flour identity precedent; it does not establish wheat measures or substitutions. Previously completed regional class work remains bounded by the [WP02 wheat-flour review](wp02-regional-wheat-flour-classes-review-20261010.md) and the checklist's resolved Manitoba, Japanese, German, Italian, and French grade notes.

Exact proposed IDs and terms were also checked against the current references, forms, and ledger record IDs. All three new IDs and candidate phrases have no current owner. The source-ID prefix above was checked against the live source-ID set and is unique.

## Phrase-first picker effects

The projection follows the current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalization and whole-word-phrase matching, including its partial-match fallback. Counts are result references, before adding these rows and after adding the proposed names and aliases.

| Query | Current results | Projected results | Effect |
|---|---:|---:|---|
| `sprouted whole wheat flour` | 0 | 1 | Finds the new flour. |
| `sprouted wheat flour` | 0 | 1 | Finds the new flour through its exact Canadian product alias. |
| `sprouted wheat` | 1 | 2 | Adds the flour beside sprouted wheat berries. |
| `sprouted wheat berries` | 1 | 1 | Stays on the existing grain identity. |
| `whole wheat flour` | 2 | 3 | Adds sprouted whole-wheat flour to the existing whole-wheat results. |
| `farine de blé entier` | 3 | 4 | Adds sprouted whole-wheat flour to an already broad whole-wheat query. |
| `sprouted spelt flour` | 0 | 1 | Finds the new flour. |
| `spelt flour` | 2 | 3 | Adds it beside plain and malted spelt flour. |
| `farine d'épeautre` | 2 | 3 | Adds it beside the existing spelt results. |
| `whole Red Fife flour` / `farine Red Fife entière` | 0 | 1 | Finds the exact new specialty flour in each language. |
| `Red Fife flour` / `farine Red Fife` | 0 | 1 | The shorter phrases occur in the qualified display names, so separate aliases are unnecessary. |

## Measurements, density, and substitutions

- **Sprouted wheat and spelt:** Current Canadian product pages show package weights, but no transferable volume-to-mass measure. Keep `defaultDensity` null and `unitMappings` empty. Do not turn a bag size into a household conversion.
- **Whole Red Fife:** The Québec Food Directory reports a serving of `1/2 cup (60 g)` for La Milanaise's specific 1 kg Organic Whole Red Fife Flour listing [S08]. This supports only a source-specific published-portion observation. It does not establish a general cup mapping or bulk density. If the ledger row is added, record it as `portion_weight` with the source quantity and SKU context, and keep `defaultDensity` null and `unitMappings` empty.
- **Sprouted flour substitutions:** One Degree's FAQ says its sprouted whole-wheat flour swaps one-to-one for conventional whole-wheat flour and its sprouted spelt flour swaps one-to-one for regular spelt. It also offers a family-experience cup-for-cup swap from its sprouted spelt to regular whole-wheat flour [S05]. These are one manufacturer's recommendations, not validated cross-product rules; add no global or contextual substitution. Record substitution research as blocked pending broader evidence if these references are integrated.
- **Red Fife substitutions and grade:** La Milanaise describes its Red Fife flour as usable like traditional whole-wheat flour and states “Équivalent: T150” for its product [S07]. Keep both as manufacturer-specific claims. Do not add a T150 equivalence, recipe substitution, or protein-class mapping to the generic whole-wheat or French type-150 references.

### Ledger field recommendations

If these identities are accepted during integration, create verified `ingredient_reference` ledger records under the three proposed IDs and include the applicable full source objects from the source register below. Record the first two as `measurementState: researched_no_supported_value` and all three as `substitutionResearchState: blocked_pending_evidence`. For Red Fife use `measurementState: researched_supported` and add only this source-scoped observation:

```json
{
  "observationId": "wp02-whole-red-fife-flour-quebec-directory-half-cup-60g-20261015",
  "relationship": "portion_weight",
  "value": 60,
  "valueUnit": "g",
  "foodDescription": "La Milanaise Organic Whole Red Fife Flour, 1 kg product listing",
  "foodState": "Whole flour as listed; the product preparation state is not further specified.",
  "measurementMethod": "Published serving information in the Québec Food Directory; no cup-filling method is stated.",
  "quantityBasis": "The 1/2 cup (60 g) value belongs to this listed product only. Do not generalize it to other Red Fife flours or to wheat flour.",
  "sourceQuantity": {"amount": 0.5, "unit": "cup"},
  "evidenceKind": "published_portion",
  "sourceIds": ["WP02-A-REGIONAL-WHEAT-FLOUR-RESIDUAL-R147-20261015-S08"]
}
```

No measurement observation is proposed for sprouted wheat or spelt. Do not create form-conversion rules, recipe links, package yields, or substitution findings/rules from the single-brand guidance above.

## Source register

All sources were accessed on 2026-10-15. Current product pages support the labeled product and wording described in each locator; product-specific marketing, nutritional, protein, equivalence, or baking guidance is not generalized into catalog behavior.

| Unique source ID | Source and locator | Supports and limits |
|---|---|---|
| **WP02-A-REGIONAL-WHEAT-FLOUR-RESIDUAL-R147-20261015-S01** | La Moisson, [Organic sprouted whole wheat flour](https://lamoisson.com/en/products/farine-de-ble-entier-germe-biologique), product title, ingredient description, and product-image alt text. The page is indexed with the French label wording; direct page fetch returned a cache miss. | Supports a Québec retailer's product wording `Farine de blé entier germé biologique` for a product titled Organic Sprouted Whole Wheat Flour. The image alt is label/product wording evidence, not an OQLF ruling. |
| **WP02-A-REGIONAL-WHEAT-FLOUR-RESIDUAL-R147-20261015-S02** | Second Spring Foods, [Organic Sprouted Wheat Flour](https://secondspringfoods.com/product/organic-sprouted-wheat-flour/), product description and ingredient panel. | Identifies Canadian Red Spring wheat grown in Saskatchewan, states the flour is whole grain with nothing removed, and describes sprouting then drying and milling. It supports the English alias as a Canadian market phrase, not a universal wheat-flour standard. |
| **WP02-A-REGIONAL-WHEAT-FLOUR-RESIDUAL-R147-20261015-S03** | Everspring Farms, [Sprouted Wheat Flour](https://www.everspringfarms.ca/product/sprouted-wheat-flour/), product details table. | Uses the title “Sprouted Wheat Flour” and lists separate Canadian sprouted whole-grain product codes, including protein options. Supports the exact English alias and whole-grain scope; protein values are product-code-specific and are not imported. |
| **WP02-A-REGIONAL-WHEAT-FLOUR-RESIDUAL-R147-20261015-S04** | La Moisson, [Farine d'épeautre germé biologique](https://lamoisson.com/products/farine-depeautre-germe-biologique), product heading, ingredient declaration, and description. | Current Québec retailer listing names the product `Farine d'épeautre germé biologique`, gives the ingredient as organic sprouted spelt flour, and describes sprouting. Supports the proposed French display and distinct process-qualified product. |
| **WP02-A-REGIONAL-WHEAT-FLOUR-RESIDUAL-R147-20261015-S05** | One Degree Organics, [Sprouted Flour FAQs](https://onedegreeorganics.com/sprouted-flour-faqs/), “What is sprouted flour?”, same-grain flour comparison, substitution guidance, and process description. | Defines its sprouted flour as whole grain kernels sprouted before milling; provides the product-specific whole-wheat/spelt replacement guidance summarized above. It is manufacturer guidance and not a cross-brand validation or numeric measure. |
| **WP02-A-REGIONAL-WHEAT-FLOUR-RESIDUAL-R147-20261015-S06** | OQLF, [farine de blé entier](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8361931/farine-de-ble-entier), preferred terms and definition. | Confirms the Québec base term `farine de blé entier` and its English equivalent `whole wheat flour`. It does not define the full sprouted compound; S01 supplies Québec product wording for that compound. |
| **WP02-A-REGIONAL-WHEAT-FLOUR-RESIDUAL-R147-20261015-S07** | La Milanaise, [Farine Red Fife entière biologique](https://lamilanaise.com/produits/farine-red-fife-entiere-biologique/), product heading, description, protein statement, and equivalence claim. | Current Québec-mill wording names whole Red Fife flour and identifies Red Fife as a Canadian wheat variety. The `11.5% ± 1.5%` protein and `T150` equivalence are this product's claims only; neither is a class-wide mapping. |
| **WP02-A-REGIONAL-WHEAT-FLOUR-RESIDUAL-R147-20261015-S08** | Québec Food Directory, [Organic Whole Red Fife Flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8204194), product description, serving-size fields, and company record. | Identifies La Milanaise's 1 kg product as flour made from Red Fife wheat and publishes `1/2 cup (60 g)` for that listing. The value is a labeled serving, not a measured density or transferable unit conversion. |

## Local evidence references

- The [active WP02 plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1278) leaves remaining functionally distinct regional wheat-flour identities open. Its preceding completed notes document the already-resolved national class work and its no-crosswalk boundaries.
- Current active data: [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [seed manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), and [research ledger](../research-ledger.v1.json).
- The search projection uses [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt); the recipe scan followed the manifest's `recipeFiles` list.
- Prior records: [sprouted wheat berries boundary proposal](wp03-section-f-next-gap-review-20261012-round6.md#L60), [sprouted wheat berries integration batch](../batches/wp03-section-f-sprouted-wheat-berries-identity-integration-20261012/README.md), [sprouted buckwheat flour proposal](wp02-a6-sprouted-buckwheat-flour-identity-review-20261012.md), and [regional wheat-flour classes review](wp02-regional-wheat-flour-classes-review-20261010.md).
