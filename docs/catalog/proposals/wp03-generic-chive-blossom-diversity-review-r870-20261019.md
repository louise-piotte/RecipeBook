# WP03 Section K generic produce diversity review — chive blossoms — R870

**Status:** Proposal only. No shared catalog, ledger, plan, workflow, roadmap, or other file was changed.

**Reviewed:** 2026-10-19

**Plan anchor:** [Section K: continue reviewing other documented edible flowers](../../RecipeBook-global-ingredient-catalog-plan.txt#L6601). The open broader leafy-green/brassica sweep at [Section K](../../RecipeBook-global-ingredient-catalog-plan.txt#L6511) and other regional greens/shoots item at [Section K](../../RecipeBook-global-ingredient-catalog-plan.txt#L6603) remain open.

## Recommendation

Add one identity-only generic culinary plant-part reference for **chive blossoms / fleurs de ciboulette**, scoped to the edible flowers of common chives, *Allium schoenoprasum*. Keep the existing `chives / ciboulette` and `Chinese chives / ciboulette chinoise` references unchanged. This proposal covers one generic ingredient identity; it does not expand a brand, product line, flavor, or retailer-only roster.

The Section K checklist explicitly leaves other documented edible flowers open. University extension references identify the flowers of *A. schoenoprasum* as edible and distinguish them from the separately named garlic chive flowers of *Allium tuberosum*. A Québec culinary source uses the exact French phrase `fleurs de ciboulette`. These sources support a named flower-part identity without broadening to every *Allium* flower or to a generic `edible flowers` entry.

This review is distinct from R862 common purslane, R865 tomato pulp, and R868 celtuce. It addresses the Section K edible-flower gap only.

## Exact proposed data

### Ingredient reference

```json
{
  "id": "ingredient-ref-chive-blossoms",
  "nameFr": "fleurs de ciboulette",
  "nameEn": "chive blossoms",
  "aliasesFr": [],
  "aliasesEn": ["chive flowers"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

Scope the identity to flowers/florets from correctly identified, food-grown *Allium schoenoprasum*. Do not include *A. tuberosum* (garlic/Chinese chive) flowers, other *Allium* species, unverified wild plants, ornamental flowers, or preparations such as chive-blossom butter and flower vinegar as separate identities. Do not add Latin names, `chives`, `ciboulette`, `garlic chives`, or `ciboulette chinoise` as aliases. The exact display terms and the narrowly qualified English alias are sufficient.

If accepted, add an `ingredient_reference` ledger record with `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Add no measurement observations or substitution findings. Add no forms, recipe links, densities, unit mappings, conversions, yields, or active substitutions.

## Bilingual names and transfer limits

| Term | Proposed treatment | Source support and limit |
|---|---|---|
| `chive blossoms` | English display | University of Alaska Cooperative Extension uses this exact culinary term. University of Maryland Extension separately identifies edible flowers on *A. schoenoprasum*. |
| `chive flowers` | English alias | University of Alaska Cooperative Extension uses this phrase for the same culinary flower part. No broader `chives` alias is added. |
| `fleurs de ciboulette` | Québec French display | A Québec RICARDO culinary article uses this exact heading and describes the flowers in cooking. This is borrowed Québec culinary wording, not an OQLF-standardized flower-part term. |
| French aliases | None | The reviewed Québec source supports the plural display. No further French alias is required for the proposed row. |
| *Allium schoenoprasum* | Evidence only | University extensions establish the species boundary. Do not expose the botanical name as a picker alias. |

The existing chives ledger record cites OQLF source `WP03J-S12` for `ciboulette` / `chive`, *A. schoenoprasum*, and leaf use. That source does not document edible flowers. Its existing claim and ownership remain unchanged; this proposal does not transfer it as flower evidence. Independent extension sources below support the edible flower part. OQLF's [GDT entry for ciboulette](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083617/ciboulette) is dated 1991 and defines the base plant and its leaves. The proposed flower wording instead relies on the Québec culinary source below, without treating it as an OQLF terminology ruling.

## Proposed research sources

The source IDs below are proposal-local and unassigned in the shared ledger and proposal/batch archive.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP03-K-CHIVE-BLOSSOMS-R870-20261019-S01` | University of Maryland Extension, [Chives](https://extension.umd.edu/resource/chives), updated 2024-04-29; accessed 2026-10-19. | Identifies chives as *Allium schoenoprasum* and states that the edible lavender flowers can be used in salads. Supports species and edible part, not a quantity or conversion. `sourceKind: extension`. |
| `WP03-K-CHIVE-BLOSSOMS-R870-20261019-S02` | Colorado State University Extension, [Edible Flowers](https://extension.colostate.edu/resource/edible-flowers/), published 1996, reviewed 2025-08; accessed 2026-10-19. | Lists *A. schoenoprasum* chives and *A. tuberosum* garlic chives separately; says to separate the florets for serving. It also cautions that edible flowers require correct identification and should not be pesticide-treated or sourced from florists, garden centers, or nurseries. Do not generalize the chive claim to other *Allium* species or use this page as a foraging guarantee. `sourceKind: extension`. |
| `WP03-K-CHIVE-BLOSSOMS-R870-20261019-S03` | University of Alaska Fairbanks Cooperative Extension Service, [Edible Flowers for the Garden & Table](https://www.uaf.edu/ces/publications/database/food/edible-flowers.php), accessed 2026-10-19. | Uses both `chive blossoms` and `chive flowers`, and describes separating chive florets for salads and cooked dishes. The page's chive-blossom-butter recipe quantity (10 large, barely opened flowers, about 2 tablespoons) is specific to that recipe; it is not a general flower-to-volume conversion or reusable measure. `sourceKind: extension`. |
| `WP03-K-CHIVE-BLOSSOMS-R870-20261019-S04` | RICARDO, [Cueillette printanière: 5 fleurs du jardin à mettre au menu](https://www.ricardocuisine.com/chroniques/recettes/1726-cueillette-printaniere-5-fleurs-du-jardin-a-mettre-au-menu), accessed 2026-10-19. | The `Les fleurs de ciboulette` heading and culinary text support the Québec French display and flower use. This source does not identify a botanical species or establish official terminology; species scope comes from extension sources and the existing chives identity. `sourceKind: other`. |

No manufacturer or retailer-product source is used. No product measurement or product claim is transferred. The recipe quantities on the UAF extension page remain specific to its named formula and are excluded from the proposed catalog data.

## Ownership, picker, recipe, and scope checks

Current shared-data snapshot: 1,898 ingredient references, 201 forms, 56 legacy candidates, 2,306 ledger records, and 114 manifest-listed recipes with 1,123 ingredient rows. The recipe corpus digest is `a34eb3aeb00221395c00859699bc52a295237ebef947b5abbd7a70e18a1ddc17`, calculated from each manifest-relative recipe path, a NUL byte, exact file bytes, and a NUL byte in manifest order.

Exact phrase and ID checks across active references, forms, legacy candidates, ledger text, prior proposals, and batches found no owner for `chive blossoms`, `chive flowers`, `fleurs de ciboulette`, or `ingredient-ref-chive-blossoms`. The R870 source-ID block and the proposal filename were also unassigned before this file was created. *A. schoenoprasum* appears in the existing chives ledger evidence described above, but no flower-part owner or source-ID duplication was found. The manifest-listed recipe scan found no chive-blossom, chive-flower, French flower-name, or botanical-name match; no bundled recipe link is proposed.

| Query | Current results | With proposed row | Picker consequence |
|---|---|---|---|
| `chive blossoms`, `chive flowers` | No result | `ingredient-ref-chive-blossoms` only | Exact English flower queries resolve to the proposed identity. |
| `fleurs de ciboulette` | No result | `ingredient-ref-chive-blossoms` only | Exact Québec French flower query resolves to the proposed identity. |
| `chive` | `ingredient-ref-chives` | `ingredient-ref-chives`, `ingredient-ref-chive-blossoms` | The broad singular query returns both the base chive entry and the distinct flower-part entry. |
| `ciboulette` | `ingredient-ref-chinese-chives`, `ingredient-ref-chives` | Those two plus `ingredient-ref-chive-blossoms` | The broad French query gains the flower-part candidate; exact flower wording distinguishes it. |
| `chives` | `ingredient-ref-chinese-chives`, `ingredient-ref-chives` | Unchanged | The search has no singular/plural stemming, so the proposed singular English token does not add a result here. |
| `fleurs` | Culinary lavender, nasturtium flowers, roselle calyces, squash blossoms | Those four plus `ingredient-ref-chive-blossoms` | This broad flower query gains the named candidate; it does not create a generic edible-flower identity. |
| `garlic chives`, `Chinese chives` | `ingredient-ref-chinese-chives` only | Unchanged | No garlic/Chinese chive flower wording is assigned to this row. |

The root-level generic scope review found no open checklist item whose sole purpose is expanding a brand or product roster. Section K's Broccolini trademark wording is an existing alias exclusion, not a queued generic ingredient task; this review records it as out of scope because commercial-product roster expansion does not add generic culinary ingredient diversity. Existing branded entries and their product-scoped evidence remain untouched. See the [R861–R863 scope-queue review](../batches/wp02-wp03-wp04-r861-r863-generic-identity-integration-20261019/README.md#scope-queue-review).

## Unresolved risks and decisions

- `fleurs de ciboulette` is supported as Québec culinary wording but was not found as an OQLF flower-part entry. Independent bilingual review may confirm the borrowed display. The existing OQLF source concerns the base chive name and leaves only.
- The catalog has no explicit botanical plant-part relationship. The proposed separate reference follows the Section K edible-flower practice and supports qualified recipe search. If the coordinator prefers a flower form attached to `ingredient-ref-chives`, decide that relationship separately; preserve the current chives row and do not infer leaf measurements for flowers.
- Ornamental or pesticide-treated flowers and uncertain wild identification raise food-use risks. The proposed identity is limited to correctly identified food-grown chives; it provides no foraging guarantee. The picker schema currently has no handling-warning field to carry CSU's sourcing caution.
- No reusable measure, mass-volume conversion, yield, density, form behavior, or generally safe substitute was established. Recipe-specific chive-flower amounts remain source-scoped and should not be transferred.
- No bundled recipe uses the candidate. Recipe linkage and measurement/substitution research remain open.

No software tests, build, emulator, or deployment were run because this work changes only a proposal document and no application or database file.
