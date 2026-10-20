# WP03 Section K generic edible-flower diversity review — garlic chive flowers — R878

**Status:** Proposal only. No shared catalog, ledger, plan, workflow, roadmap, or other file was changed.

**Reviewed:** 2026-10-19

**Plan anchor:** The open [Section K checklist for other documented edible flowers](../../RecipeBook-global-ingredient-catalog-plan.txt#L6615) says to keep each edible-part claim species-specific. R870 also explicitly keeps garlic-chive flowers separate from common chive blossoms.

## Recommendation

Add one identity-only generic plant-part reference for **garlic chive flowers / fleurs de ciboulette chinoise**, scoped to the edible florets of correctly identified, food-grown *Allium tuberosum*. Keep the existing `Chinese chives / ciboulette chinoise` reference and `chive blossoms / fleurs de ciboulette` reference unchanged. The latter covers *Allium schoenoprasum*, a different species.

The candidate is a documented edible flower rather than a commercial product variant. The Office québécois de la langue française identifies *A. tuberosum* as `ciboulette chinoise` / `Chinese chives` and says the white flowers are used in Chinese cooking. Colorado State University Extension separately lists *A. tuberosum* garlic chives among plants with edible flowers and says to separate the florets for serving. These sources support a narrow flower-part identity; they do not establish a general flower measure or make the flowers interchangeable with common chives.

Keep the identity scoped to florets. Do not use it for young flower stalks, scapes, unopened flowering stems, or the vegetable often called `garlic chive flower stalks`; the OQLF's English note refers to flower stalks, while the French note refers to flowers. That difference is a name-boundary warning, not evidence that the parts are interchangeable.

## Exact proposed data

```json
{
  "id": "ingredient-ref-garlic-chive-flowers",
  "nameEn": "garlic chive flowers",
  "nameFr": "fleurs de ciboulette chinoise",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

If accepted, record an `ingredient_reference` ledger row with `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Record no measurement observations or substitution findings. Add no forms, recipe links, densities, unit mappings, conversions, yields, or substitutions. No source amount was used to propose a reusable measure.

## Name and identity boundary

| Term | Proposed treatment | Evidence and limit |
|---|---|---|
| `garlic chive flowers` | English display | A transparent, flower-part-qualified name for the edible florets of *A. tuberosum*. CSU Extension identifies the species as garlic chives and recommends separating the florets for serving. It is not a name for the flowering stem or scape. |
| `fleurs de ciboulette chinoise` | Québec French display | Composed from OQLF's preferred French plant name `ciboulette chinoise` and its French note that the white flowers are used in cooking. OQLF does not list this full flower-part phrase as a separate preferred term. |
| `Chinese chives`, `garlic chives`, `ciboulette chinoise` | Do not add as aliases | These identify the existing whole culinary plant reference. The new row should require a flower-part phrase. |
| `garlic chive flower stalks`, `flower stalks`, `scapes`, `jeunes tiges florales` | Exclude from this row | The OQLF English note refers to flower stalks as a culinary part. This proposal covers detached florets and leaves the stalk/stem product distinct or unassigned. |
| *Allium tuberosum* | Taxonomic scope only | OQLF and CSU Extension support this species boundary. Do not expose the botanical name as a picker alias or extend the edible-flower claim to other *Allium* species. |
| *Allium schoenoprasum* blossoms | Exclude | The separate `chive blossoms` identity already covers the edible flowers of common chives. |
| Unidentified, wild, ornamental, or pesticide-treated flowers | Exclude | CSU Extension emphasizes positive identification and food-safe growing/sourcing. This proposal is not a foraging or safety guarantee. |

`fleurs de ciboulette chinoise` is a proposed descriptive Québec French display built on the OQLF plant name, not a claim that OQLF has standardized that compound. Independent Québec terminology review remains useful. The OQLF entry is dated 1996.

## Proposed research sources

The source IDs below are proposal-local and were absent from the shared ledger and proposal/batch archive at review. The OQLF URL is already owned by `WP03J-S13` on the existing Chinese-chives ledger row. The CSU Extension URL is already owned by R870 for the common-chive boundary. Those URLs are reused here for additional, species-part-specific claims; no existing source entry or claim is changed.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP03-K-GARLIC-CHIVE-FLOWERS-R878-20261019-S01` | Office québécois de la langue française, [GDT: ciboulette chinoise](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17015544/ciboulette-chinoise), updated 1996; accessed 2026-10-19. | Gives `ciboulette chinoise`, English `Chinese chives` and `garlic chives`, and *Allium tuberosum*. Its French note says the fragrant white flowers are used in Chinese cuisine; its English note mentions young leaves and flower stalks. The part-language difference supports keeping blossoms and stalks separate. No quantity, conversion, or part equivalence is inferred. `sourceKind: regional_authority`. |
| `WP03-K-GARLIC-CHIVE-FLOWERS-R878-20261019-S02` | Colorado State University Extension, [Edible Flowers](https://extension.colostate.edu/resource/edible-flowers/), published 1996, reviewed 2025-08; accessed 2026-10-19. | Table 2 lists `Allium tuberosum / Garlic chives` among recommended plants with edible flowers and says to separate florets to serve. The page also requires proper identification and pesticide-free flowers and excludes florist, nursery, and garden-center flowers from food use. It supplies no measure or safe serving amount. `sourceKind: extension`. |
| `WP03-K-GARLIC-CHIVE-FLOWERS-R878-20261019-S03` | North Carolina State Extension, [Allium tuberosum](https://plants.ces.ncsu.edu/plants/allium-tuberosum/common-name/wild-leek/), accessed 2026-10-19. | Identifies garlic chives as *A. tuberosum* and calls flowers edible. The page also gives a nonspecific “some toxicity noted” caveat without specifying the substance, exposure, or conditions. It is not used to infer a human risk level, safe serving, or treatment advice; the catalog scope remains correctly identified, food-grown florets only. `sourceKind: extension`. |

No manufacturer, brand, product-line, SKU, or retailer source was used. No product-only measurement or claim is transferred to the generic identity.

## Ownership, recipe, picker, and queue checks

Audit snapshot on 2026-10-19: 1,907 active ingredient references, 201 forms, 56 legacy candidates, 2,313 ledger records, and 114 manifest-listed recipes with 1,123 ingredient rows. The recipe corpus digest is `a34eb3aeb00221395c00859699bc52a295237ebef947b5abbd7a70e18a1ddc17`, calculated from each manifest-relative recipe path, a NUL byte, exact file bytes, and a NUL byte in manifest order.

Exact phrase and proposed-ID searches across active references, forms and their match terms, legacy candidates, and ledger text found no owner for `garlic chive flowers`, `fleurs de ciboulette chinoise`, or `ingredient-ref-garlic-chive-flowers`. The existing active `ingredient-ref-chinese-chives` row remains the owner of the unqualified plant names `Chinese chives / ciboulette chinoise` and the English alias `garlic chives`. The active `ingredient-ref-chive-blossoms` row remains scoped to *A. schoenoprasum*. Prior R870 proposal and the plan mention garlic-chive flowers as a distinct, still-unreviewed species boundary; neither assigns an active row. The R878 source-ID prefix and proposal path were unassigned before drafting.

The manifest-listed recipe scan found no exact candidate phrase in the 114 recipe files or 1,123 ingredient rows. This describes the current bundled library only; no recipe link is proposed.

| Query | Current results | With proposed row | Picker consequence |
|---|---|---|---|
| `garlic chive flowers` | No result | `ingredient-ref-garlic-chive-flowers` only | The exact English flower-part phrase resolves to the proposed row. |
| `fleurs de ciboulette chinoise` | No result | `ingredient-ref-garlic-chive-flowers` only | The full French flower-part phrase resolves to the proposed row. |
| `ciboulette chinoise` | `ingredient-ref-chinese-chives` | Existing Chinese-chives row plus proposed flower row | Broad French plant-name lookup gains the flower-part candidate; the full French name distinguishes it. |
| `Chinese chives`, `garlic chives` | `ingredient-ref-chinese-chives` | Unchanged | No unqualified plant alias is added to the flower row. |
| `garlic chive flower stalks`, `scapes` | No exact row | No result proposed | Stalk and scape identities stay separate or unresolved. |

The open Section K flower checklist is generic and calls for documented edible flowers, not a commercial roster. The cross-category scope review found no open task solely for expanding brands, product lines, flavor families, or retailer variants; product counts do not add ingredient diversity. Section K's Broccolini trademark mention remains an alias exclusion, not a research task. No such roster was pursued. Existing branded entries and product-specific evidence remain intact and scoped. See the [generic ingredient scope review](../batches/generic-ingredient-scope-review-20261019/README.md).

## Unresolved risks and decisions

- The evidence supports correctly identified *A. tuberosum* flowers, but the French flower-part phrase is descriptive rather than an OQLF-listed term. Confirm it in independent Québec review.
- OQLF's French note names flowers while its English note names flower stalks. Keep the proposed identity to florets only; do not attach stalk, scape, shoot, or flower-stem uses without a separate identity review.
- CSU Extension supports edible-flower use only with proper identification and food-safe growing/sourcing. This row does not guarantee foraging safety or make flowers from ornamental sales channels suitable for food.
- NCSU Extension's nonspecific toxicity note does not identify a human hazard threshold or safe intake. No safety conclusion or serving recommendation is proposed.
- No reusable measure, density, unit mapping, yield, form behavior, recipe linkage, or generally safe substitute was established. Measurement and substitution research remain open.

No software tests, build, emulator, or deployment were run because this change only adds a proposal document and no application or database data.
