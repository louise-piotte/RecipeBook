# WP03 Section K: garden cress identity review (R955)

- **Reviewed:** 2026-10-19
- **Disposition:** Recommend one identity-only generic reference for garden cress / cresson alénois, limited to the young leafy culinary crop of *Lepidium sativum*.
- **Scope:** Generic culinary ingredient diversity. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched.
- **Plan anchor:** Section K's broader leafy-green and brassica sweep remains open ([catalog plan, lines 6551–6558](../../RecipeBook-global-ingredient-catalog-plan.txt#L6551)).
- **Mutation scope:** Proposal only. No shared catalog, ledger, recipe, plan, workflow, or roadmap file is changed.

## Recommendation

Add `ingredient-ref-garden-cress` as a generic leafy vegetable. OQLF pairs the Québec French name `cresson alénois` with English `garden cress` and *Lepidium sativum*, and describes culinary use of young plants in salads, sauces, sandwiches, and as a garnish. Utah State University Extension independently describes cultivation for the leaves and their use in salads, sandwiches, soups, and as baby greens. This supports a distinct edible leafy identity, separate from watercress. [S01–S02]

The OQLF page was last updated in 1991 and is used for terminology and species identification, not current Québec retail availability. The USU page is an extension fact sheet, not a Québec market source. Neither establishes demand in the bundled recipe corpus. [S01–S02]

## Proposed minimal data

```json
{
  "id": "ingredient-ref-garden-cress",
  "nameFr": "cresson alénois",
  "nameEn": "garden cress",
  "aliasesFr": ["passerage cultivée", "nasitort"],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

OQLF lists `passerage cultivée` and `nasitort` as preferred French terms for the same entry. Keep the row scoped to the young leafy culinary crop; the OQLF note that roots are occasionally used as a condiment does not extend this identity to roots. Do not add `cresson de jardin`, which the OQLF says is used for garden cress in some culinary contexts but also for the distinct cresson de terre in horticultural texts. Do not add bare `cress` / `cresson`, which would not distinguish the existing watercress identity from other cresses. Omit `peppergrass` because the precise bilingual display is sufficient; do not add botanical names as picker aliases. [S01, S04]

## Current ownership and nearby identities

The package snapshot contains **1,972 active ingredient references**, **205 forms**, **55 legacy candidates**, and **2,377 ledger records**. The recipe manifest contains **114 files** with **1,123 structured ingredient rows**.

Exact and normalized phrase scans across reference names and aliases, form labels and match terms, legacy candidates, and ledger record IDs and decisions found no owner for the proposed reference ID or for `garden cress`, `garden-cress`, `cresson alénois`, `passerage cultivée`, `nasitort`, `Lepidium sativum`, `cresson de jardin`, `upland cress`, or `land cress`. No matching form or legacy candidate exists. The three new source URLs below and the R955 source-ID prefix were also absent from the live ledger; the source-ID prefix and proposed reference ID are unused in the proposal archive checked for this review.

| Existing identity or evidence | Boundary to preserve |
|---|---|
| `ingredient-ref-watercress` — `watercress / cresson de fontaine` | Keep *Nasturtium officinale* distinct from *Lepidium sativum*. Its current source `WP03-LEAFY-GREENS-20261009-S06` remains owned by the watercress ledger record; its evidence is cross-referenced here only for the naming boundary. Do not transfer or edit its row or source. [S04] |
| Upland/land cress | No active reference, form, or legacy owner was found in the exact-name scan. Keep these separate from garden cress; this proposal does not resolve their names or add an identity. The earlier leafy-greens review explicitly notes garden cress and upland/land cress as distinct named vegetables. [S04] |
| `cresson de jardin`, bare `cress` / `cresson`, and `peppergrass` | Omit as aliases. OQLF documents conflicting use of `cresson de jardin`; the earlier coordinator review explains why short cress/cresson terms are excluded from watercress while other cress vegetables remain distinct. The precise bilingual display does not need the additional `peppergrass` term. [S01, S04] |
| R949 `celery leaves / feuilles de céleri`; R952 `common lamb's-quarters / chénopode blanc`; R928 `dandelion flowers / fleurs de pissenlit` | These are distinct accepted plant parts or leafy crops; preserve each identity and its evidence. None owns a cress term. |

Nearby proposal checks found no focused garden-cress add/hold decision. The [leafy-greens coordinator review](wp03-leafy-greens-coordinator-review-20261009.md) already flags garden cress and upland/land cress as distinct from watercress, but it did not add either reference. The current Section K checklist leaves the broader leafy-green sweep open. Its Broccolini trademark note is an alias exclusion, not a commercial-roster assignment; no roster-only task was offered in the reviewed Section K lane. If one appears in the queue, mark it out of scope because commercial-product counts do not add ingredient diversity, then stop that line. Preserve existing branded rows and their evidence.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 structured ingredient rows** were scanned for garden cress, garden-cress, cresson alénois (with and without its accent), passerage cultivée, nasitort, *Lepidium sativum*, cresson de jardin, upland cress, and land cress. The scan found **zero matching ingredient rows and zero matching recipe files**. No recipe link, row relink, or quantity is proposed. The external culinary descriptions in S01–S02 establish use, not bundled demand. [S01–S02]

## Measurements, forms, and proposed ledger state

Health Canada's Canadian Nutrient File serving page identifies `Cress, garden, raw / Cresson alénois, cru`, Food Code 2084. It reports 100 mL = 21.1 g, 250 mL = 52.8 g, 1 sprig = 1.0 g, and 29% refuse (stems, crown, and spoiled leaves). If these figures are retained in the ledger, keep them only as observations for this exact CNF food-code entry. They do not establish default density, a universal sprig size, a trim/yield rule, a form conversion, or reusable mappings for all garden cress. The page is dated 2019-03-01. [S03]

For the proposed ingredient-reference ledger record, use:

- `identityState: verified`;
- `measurementState: researched_supported` only for the source-scoped CNF Food Code 2084 observations above;
- `substitutionResearchState: not_yet_researched`;
- sources S01–S03, with the observations attached only to S03;
- no form, default density, unit mapping, package yield, conversion, recipe link, or active substitution.

Do not attach the existing watercress source S04 to the new record: cite it as a boundary reference only, with its current ownership unchanged. No substitution research was done. No safe-foraging, medicinal, or current-market claim is inferred from these sources.

## Sources

Online sources were opened 2026-10-19. New source IDs are proposal-local; none has been written to the shared ledger.

| Source ID | Source | Support and limits |
|---|---|---|
| `WP03-K-GARDEN-CRESS-R955-20261019-S01` | Office québécois de la langue française, [cresson alénois (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296926/cresson-alenois) | Gives `cresson alénois`, English `garden cress`, and Latin *Lepidium sativum*; describes young plants as a salad/sauce condiment and garnish. The entry was last updated in 1991. It also lists `passerage cultivée` and `nasitort`; its note identifies `cresson de jardin` as ambiguous across garden and upland/land cress usage. No current retail claim is inferred. |
| `WP03-K-GARDEN-CRESS-R955-20261019-S02` | Utah State University Extension, [How to Grow Garden Cress in Your Garden](https://extension.usu.edu/yardandgarden/research/garden-cress-in-the-garden) | Peer-reviewed fact sheet published April 2020. Says the plant is cultivated for leaves used in salads, sandwiches, soups, and as baby greens. The garden-growing directions and cultivar list are not ingredient variants or kitchen-measure evidence; medicinal statements on the page are not used. |
| `WP03-K-GARDEN-CRESS-R955-20261019-S03` | Health Canada, [Canadian Nutrient File serving size, Food Code 2084](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2084) | Direct bilingual food name and raw state; gives 100 mL = 21.1 g, 250 mL = 52.8 g, 1 sprig = 1.0 g, and 29% refuse for stems, crown, and spoiled leaves. All values stay specific to this CNF entry and do not become generic density or active unit mappings. Page details give 2019-03-01. |
| Existing `WP03-LEAFY-GREENS-20261009-S06` (owner retained) | Office québécois de la langue française, [cresson de fontaine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082831/cresson-de-fontaine), currently attached to `ingredient-ref-watercress` | Identifies watercress / cresson de fontaine and *Nasturtium officinale*. Reused here only to preserve the separate watercress boundary; do not duplicate its source record under garden cress or transfer its evidence. |

The source-ID prefix `WP03-K-GARDEN-CRESS-R955-20261019-` and each new URL were checked against the ledger before this proposal. No exact source URL or source ID is currently owned there. The only reused source identifier is S04, whose ledger owner remains `ingredient-ref-watercress`.

## Disposition

Recommend adding one generic `VEGETABLE_AND_AROMATIC` identity, `garden cress / cresson alénois`, with only the OQLF-listed French aliases above. Keep it distinct from watercress and from unresolved upland/land cress; preserve all existing rows and source ownership. Retain CNF values only as Food Code 2084 observations. Add no forms, generic measures, conversions, yields, recipe links, or active substitutions. Section K's broader leafy-green sweep remains open.
