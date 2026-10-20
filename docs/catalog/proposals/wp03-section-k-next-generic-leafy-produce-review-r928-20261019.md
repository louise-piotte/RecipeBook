# WP03 Section K: common dandelion flowers identity review (R928)

- **Reviewed:** 2026-10-19
- **Disposition:** accept one identity-only `dandelion flowers / fleurs de pissenlit` reference for the culinary floral part of correctly identified *Taraxacum officinale*.
- **Scope:** one generic plant-part identity, distinct from the existing dandelion-greens row and from root or whole-plant products. This proposal changes no shared catalog, recipe, ledger, plan, workflow, or roadmap file.

## Recommendation

Add `ingredient-ref-dandelion-flowers` in `VEGETABLE_AND_AROMATIC`:

| Field | Proposed value |
|---|---|
| English display | `dandelion flowers` |
| Québec French display | `fleurs de pissenlit` |
| English alias | `dandelion flower` |
| Québec French alias | `fleur de pissenlit` |
| Category | `VEGETABLE_AND_AROMATIC` |

The singular aliases are grammatical number variants of the source-attested part-qualified names. Do not alias the whole-plant names `dandelion`, `common dandelion`, `pissenlit`, `pissenlit officinal`, or `dent-de-lion`, or expose the botanical name as a picker alias. The OQLF records those as plant names, and the current leaf identity intentionally does not own the unqualified plant name.

OQLF identifies *Taraxacum officinale* as `pissenlit` / `common dandelion` and says its leaves are eaten in salads, its flowers are transformed into wine, and its root is roasted like chicory. North Carolina State University Extension lists *T. officinale* dandelion flowers for wine, jam, and salads. These sources support a distinct culinary flower identity, not transfer of root or leaf uses. The OQLF page is the Québec terminology source; the compound `fleurs de pissenlit` is a descriptive part-qualified name, corroborated by a Québec recipe, and is not represented as a separate OQLF preferred term. [S01–S03]

## Proposed data and part boundary

```json
{
  "id": "ingredient-ref-dandelion-flowers",
  "nameFr": "fleurs de pissenlit",
  "nameEn": "dandelion flowers",
  "aliasesFr": ["fleur de pissenlit"],
  "aliasesEn": ["dandelion flower"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

| Current or related identity/term | Treatment |
|---|---|
| `ingredient-ref-dandelion-greens` — `dandelion greens / feuilles de pissenlit`, alias `dandelion leaves` | Preserve unchanged for leaves. Do not merge flowers into the leaf identity or add `dandelion` / `pissenlit` as a leaf alias. Its ledger decision explicitly keeps root, flower, and whole-plant products distinct. [S01, S05] |
| Proposed `ingredient-ref-dandelion-flowers` | Limit to the edible floral part of correctly identified *T. officinale*, with source-specified removal of stalks and green parts preserved. It does not cover leaves, roots, seeds, the hollow stalk, dandelion greens, or finished dandelion wine/jelly. |
| Whole flower head versus separated petals | Keep petal separation and removal of green parts as source-specific preparation, not as an inferred equivalence, form, or reusable amount. NCSU's general edible-flower guidance says to remove all parts except petals; RICARDO's Québec recipe asks for flowers without stalks and says to keep the buds rather than green parts; Epicurious strains and presses petals. These sources do not support treating an intact flower head with green parts as interchangeable with separated petals. [S02–S04] |
| `pissenlit`, `dandelion`, `common dandelion`, `dent-de-lion`, botanical names | Do not store as aliases. They name the plant rather than this part and could select both the existing greens and the new flower identity. The selected names should keep the part visible. |
| Wild or uncertainly identified dandelions; flowers from treated areas | Do not imply a foraging identification guarantee or safety claim. RICARDO's recipe-specific note calls for pesticide-free gathering; NCSU Extension's edible-flower guidance calls for proper identification and food-safe growing/sourcing. [S02–S03] |

The user-facing identity is generic plant-food diversity, not a brand or commercial product roster. No branded, product-line, flavor, SKU, or retailer variants were researched.

## Current ownership, exact keys, and picker projection

The current package snapshot has 1,945 active ingredient references and 204 forms; the legacy import list has 55 candidates, and the research ledger has 2,349 records. The only active dandelion ingredient identity is `ingredient-ref-dandelion-greens`; its aliases remain `dandelion leaves` only in English. It is verified and has no flower form.

I checked reference names and aliases, form labels and match terms, legacy candidate labels, ledger record IDs and text, current proposals, and the Section K checklist. There is no owner for the proposed ID or for `dandelion flowers`, `dandelion flower`, `fleurs de pissenlit`, or `fleur de pissenlit`. No flower form or legacy candidate exists. The proposed R928 source-ID prefix was not present in the ledger. No existing identity or evidence is changed.

The exact-key scan follows `normalizeIngredientSearchKey` in `IngredientSearch.kt`: lowercase, Unicode NFKD, fold common ligatures, remove diacritic marks, replace punctuation with spaces, and collapse whitespace. The exact part-qualified keys are unowned; broad plant-name lookup is expected to overlap:

| Query | Current owner | With proposed identity | Consequence |
|---|---|---|---|
| `dandelion flowers` / `dandelion flower` | None | `ingredient-ref-dandelion-flowers` | Full English part-qualified query selects the flower identity. |
| `fleurs de pissenlit` / `fleur de pissenlit` | None | `ingredient-ref-dandelion-flowers` | Full French part-qualified query selects the flower identity. |
| `dandelion greens` / `dandelion leaves` | `ingredient-ref-dandelion-greens` | Unchanged | Exact leaf searches retain the existing owner. |
| `feuilles de pissenlit` | `ingredient-ref-dandelion-greens` | Unchanged | The French leaf phrase remains specific. |
| `dandelion` / `pissenlit` | The current greens row can appear because its display contains the plant name. | The greens and flower rows can both appear, each with the part visible. | Expected broad search behavior; do not add whole-plant aliases or merge the results. |

This is a static search consequence review, not a picker runtime test.

## Bundled recipe demand

All 114 current bundled recipe files and 1,123 ingredient rows were scanned. No ingredient row or full recipe text contains a dandelion-flower phrase or the Québec equivalent. There is no link or quantity to add. The external Québec wine recipe below documents culinary use, but its amount and method are not bundle demand and stay source-scoped.

## Measurements, densities, and substitution evidence

Do not add a reusable household measure, mass conversion, density, unit mapping, form, yield, or active substitution rule.

- RICARDO's *Vin de pissenlit* recipe lists 4 L (16 cups) of flowers without stalks. Epicurious's wine recipe uses 4 cups of flowers. These are ingredient quantities for two distinct flower-wine recipes, not cup-to-mass data, density, general serving sizes, or transferable recipe amounts. RICARDO's recipe page is marked advertising content; use it only for the attested Québec phrase and the exact recipe context, not as independent evidence of retail availability. [S03–S04]
- Neither culinary reference gives flower mass, packing method, edible yield, or a reusable volume-to-weight mapping. Flower heads and separated petals also differ in preparation. Recommend `measurementState: researched_no_supported_value` for generic measurements; retain the two recipe observations only with their source and dish scope.
- Epicurious gives a flower-wine-specific suggestion to use other flowers in equal amounts, with less lavender because of its strong flavor. This is contextual wine-making guidance, not an ingredient-wide substitution between edible flowers, leaves, roots, or arbitrary recipe roles. If the identity is integrated, the ledger may record this as scoped contextual substitution evidence (`substitutionResearchState: researched_supported`), but no active rule is proposed. Require matching wine/infusion role and recipe method before any future recipe-line application. [S04]

## Sources

Sources were accessed 2026-10-19. IDs below are local to this proposal; none has been written to the shared ledger.

| ID | Source | Support and limits |
|---|---|---|
| `WP03-K-DANDELION-FLOWERS-R928-20261019-S01` | Office québécois de la langue française, [pissenlit (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296907/pissenlit) | Identifies *Taraxacum officinale*, preferred French names `pissenlit`, `pissenlit officinal`, `dent-de-lion`, and English `common dandelion` / `dandelion`; states that leaves are eaten in salads, flowers are made into wine, and roots are roasted. This supports species and part boundaries, not a separate standardized culinary flower name or measure. |
| `WP03-K-DANDELION-FLOWERS-R928-20261019-S02` | North Carolina State University Cooperative Extension, [Choosing and Using Edible Flowers (AG-790)](https://content.ces.ncsu.edu/pdf/choosing-and-using-edible-flower/2019-11-07/AG_s_web_110619.pdf) | Its edible-flower table names `Dandelion / Taraxacum officinale`, describes young versus mature flower flavor in that source, and lists wine, jam, and salads as uses. The table does not establish a reusable measure or a flavor rule for all maturity conditions. Apply the page's general edible-flower identification and food-safe sourcing cautions. |
| `WP03-K-DANDELION-FLOWERS-R928-20261019-S03` | RICARDO, [Vin de pissenlit](https://www.ricardocuisine.com/recettes/5449-vin-de-pissenlit) | Québec French part phrase and a wine recipe using flowers without stalks. The 4 L / 16 cups, rinsing, flower stage, maceration, and fermentation instructions belong to this recipe. The page identifies itself as advertising content; its availability statement is not used as independent market evidence. |
| `WP03-K-DANDELION-FLOWERS-R928-20261019-S04` | Epicurious, [Dandelion Wine](https://www.epicurious.com/recipes/food/views/dandelion-wine-51176210) | A wine recipe uses 4 cups of dandelion flowers and provides a flower-wine-only equal-amount suggestion for other flowers, with a lavender exception. Its quantity and substitution advice are specific to flower-wine use and cannot support a global swap or measure. |
| `WP03-K-DANDELION-FLOWERS-R928-20261019-S05` | [WP03 leafy-greens coordinator review](wp03-leafy-greens-coordinator-review-20261009.md) and the existing `ingredient-ref-dandelion-greens` ledger record | Records the existing Québec leaf identity and its decision not to assign unqualified dandelion/pissenlit to leaves while root and flower products remain distinct. |

## Disposition

Accept one identity-only `dandelion flowers / fleurs de pissenlit` reference in `VEGETABLE_AND_AROMATIC`, with only singular/plural number aliases as listed above. Preserve `ingredient-ref-dandelion-greens` unchanged and keep roots, whole-plant wording, stalks, and finished wine/jelly separate. Do not add forms, recipe links, densities, mappings, general measures, yields, conversions, or active substitutions. If ledger substitution evidence is retained, scope it only to the flower-wine method described in S04.
