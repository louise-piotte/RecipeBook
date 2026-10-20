# WP02 Section 04 B2 R360 — Winged-bean flour measurement review

## Review record

- **Reviewed and sources accessed:** 2026-10-16.
- **Status:** Integrated on 2026-10-16; see the [integration README](../batches/wp02-b2-winged-bean-flour-measurement-integration-r360-20261016/README.md). Only the existing research-ledger record, catalog plan, roadmap, this proposal, and the batch README were updated; the active reference, recipes, generated index, and application code were unchanged. No software tests, build, or emulator run was performed because this only adds database JSON data under `AGENTS.md`.
- **Checklist fit:** WP02 Section 04 B2, the open alternative-flour group ([plan line 2388](../../RecipeBook-global-ingredient-catalog-plan.txt#L2388)). This review addresses only the outstanding measurement research for the existing `ingredient-ref-winged-bean-flour`; it does not close the wider B2/B3 checklist.
- **Candidate:** `ingredient-ref-winged-bean-flour`, `winged bean flour / farine de haricot ailé`, category `FLOUR_AND_STARCH`, scoped to flour milled from dried mature seeds of *Psophocarpus tetragonolobus*.
- **Prior-work boundary:** R263 accepted this identity without measures or density, and its integration record explicitly left measurement research inactive. At proposal-review time, the ledger had `measurementState: not_yet_researched`, no measurement observations, and `substitutionResearchState: not_yet_researched`. R263 already reviewed formula-specific bread studies; this proposal does not reopen substitution research. No focused measurement follow-up was found in the proposal or batch archive.
- **Source-ID prefix:** `WP02-B2-WINGED-BEAN-FLOUR-MEASURE-R360-20261016-S`. S01–S04 were unique when checked against the ledger and proposal/batch archive; integration registered S01 on the existing record, while S02–S04 remain proposal-local.

## Recommendation

Update only the existing ledger record for `ingredient-ref-winged-bean-flour`:

1. Set `measurementState` to `researched_supported` and add two source-scoped **laboratory bulk-density observations** from the raw and protease-hydrolyzed flour samples in Narayana and Narasinga Rao's primary study. Their abstract reports 0.387 g/mL for the starting flour and 0.597 g/mL after 45% hydrolysis. Preserve each measurement's processing context. [S01]
2. Keep the active reference unchanged: `defaultDensity: null`, `unitMappings: []`, empty alias arrays, and no ingredient form. These laboratory bulk-density readings do not establish a product-matched loose-cup weight, household portion, or reusable kitchen conversion.
3. Keep `substitutionResearchState` unchanged. The earlier R263 bread studies are formulation-specific, and recipe substitution is outside this measurement review. Add no substitutions, recipe links, or yields.

Do not convert the two readings to a household measure or average them. Their difference demonstrates that processing conditions affect the reported bulk density. The available studies also report densities for wet-milled, alkali-extracted or protein-isolate products; those values are not interchangeable with the generic flour row and should not be logged as observations for it. [S02–S04]

## Measurement evidence and scope

| Source | Finding | Limit for this catalog row |
|---|---|---|
| **S01 — Narayana and Narasinga Rao (1984), partial proteolysis** | The publisher's indexed abstract reports that bulk density rose from **0.387 to 0.597 g/mL** as winged-bean flour underwent 45% protease hydrolysis. | The starting and enzyme-treated samples are laboratory materials. The accessible abstract does not expose the filling/packing protocol or a household serving. Preserve the two reported readings as separate research observations; choose neither as a default. |
| **S02 — Putri and Budijanto (2010), wet-milled seed flour thesis** | The IPB University repository abstract reports **0.5974 g/mL** for a flour made from soaked, boiled, dehulled seeds through wet milling, alkaline extraction, isoelectric-pH precipitation, decanting, drying, and re-grinding. It also reports 46.01% protein on a dry basis and 41.22% protein recovery. | This is a highly processed, protein-enriched research product rather than a product-matched retail flour. The accessible repository abstract does not provide the density measurement protocol; do not add it as an observation or treat it as a cup conversion. |
| **S03 — Igene, Oboh, and Aletor (2005), raw and heat-processed seed flours** | The primary paper's accessible abstract says bulk density was studied for raw, boiled, roasted, and autoclaved winged-bean flours. | The abstract does not report numerical density results or a kitchen-measure pair. Processing variants reinforce the need to preserve product context. |
| **S04 — Budijanto, Sitanggang, and Murdiati (2011), protein isolate** | FAO AGRIS's record for the primary study reports **0.60 g/mL** bulk density for an isolate made from defatted flour by isoelectric precipitation and centrifugation; the isolate contained 83.87% protein on a dry basis. | This is explicitly a protein isolate, not generic winged-bean flour. It supports keeping isolates outside this row and supplies no kitchen measure. |

No reviewed source supplies a species-identified Canadian or Québec flour package serving, cup-to-mass pair, or kitchen-scale test. A bounded search for `winged bean flour Canada`, `farine de haricot ailé`, and species-identified flour listings returned Canadian seed/use descriptions and research, but no matching Canadian flour label. This search does not establish that no such product is sold.

For French scope, R263 uses the Canadian bilingual base name `haricot ailé` to support the provisional display `farine de haricot ailé`; it found no Québec flour label or OQLF flour term for this species. The separate `farine de pois carré` wording remains excluded: the [OQLF field-pea entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8876749/pois-des-champs) assigns `pois carré` to *Pisum arvense* wording. This proposal adds no French name or alias. See the [R263 identity review](wp02-section-b-gap-review-r263-20261016.md) for its terminology evidence.

## Proposed ledger disposition

| Field | Proposed value | Limit |
|---|---|---|
| `measurementState` | `researched_supported` | Supported only by the two sample-specific laboratory bulk-density readings in S01. This does not mean a household portion, cross-product density, or default conversion is known. |
| `measurementObservations` | Add the two observations below. | Preserve raw and 45%-hydrolyzed samples separately. No observations for the specialized products in S02 or S04. |
| `substitutionResearchState` | `not_yet_researched` | No change in this measurement-only review; retain R263's formula-specific findings and limits. |
| Active reference | No change | Keep null density, empty mappings and aliases, and no forms. |
| Recipes and rules | No change | No bundled recipe demand; no conversions, yields, or active substitutions. |

Proposed observation shape for integration review only:

```json
{
  "measurementState": "researched_supported",
  "measurementObservations": [
    {
      "observationId": "winged-bean-flour-raw-bulk-density-narayana-1984-r360",
      "relationship": "bulk_density",
      "value": 0.387,
      "valueUnit": "g/mL",
      "foodDescription": "Raw winged-bean flour before protease hydrolysis in the partial-proteolysis study",
      "measurementMethod": "Source-reported laboratory bulk density; the accessible abstract does not state the filling or packing protocol.",
      "evidenceKind": "measured",
      "sourceIds": ["WP02-B2-WINGED-BEAN-FLOUR-MEASURE-R360-20261016-S01"]
    },
    {
      "observationId": "winged-bean-flour-45-percent-proteolysis-bulk-density-narayana-1984-r360",
      "relationship": "bulk_density",
      "value": 0.597,
      "valueUnit": "g/mL",
      "foodDescription": "Winged-bean flour after 45% protease hydrolysis in the partial-proteolysis study",
      "measurementMethod": "Source-reported laboratory bulk density; the accessible abstract does not state the filling or packing protocol.",
      "evidenceKind": "measured",
      "sourceIds": ["WP02-B2-WINGED-BEAN-FLOUR-MEASURE-R360-20261016-S01"]
    }
  ]
}
```

The observation values are published study results, not `defaultDensity` values. Do not add `unitMappings`, convert either value into grams per cup, or infer flour substitution ratios from the study.

## Read-only catalog, picker, and recipe audit

At proposal-review time, the bundle had **1,693 ingredient references**, **139 forms**, **2,049 research-ledger records**, and a manifest of **114 recipes**. The active flour row is exactly `winged bean flour / farine de haricot ailé`, with both alias arrays empty, null `defaultDensity`, and no unit mappings. The separate mature-seed row is `winged beans / haricots ailés`, with English aliases `winged bean`, `wing bean`, and `four-angle bean`, and French aliases `haricot ailé`, `haricot dragon`, and `pois carré`. No form belongs to the flour row or matches its species-specific flour phrases.

Static search projection was checked against the current phrase-first, accent-folding implementation in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt):

| Query | Current owner(s) | Boundary |
|---|---|---|
| `winged bean flour` | `ingredient-ref-winged-bean-flour` | Specific flour query remains unique. |
| `farine de haricot ailé` | `ingredient-ref-winged-bean-flour` | Specific French flour query remains unique. |
| `winged bean` | Flour and `ingredient-ref-winged-beans` | Existing related-product overlap from the whole-seed alias; no alias changes proposed. |
| `haricot ailé` | Flour and `ingredient-ref-winged-beans` | Existing base-name overlap; no alias changes proposed. |
| `pois carré` | `ingredient-ref-winged-beans` | The flour has no alias for this OQLF-colliding phrase. |

A manifest-ordered scan of the complete recipe files counted **114 recipes and 1,123 ingredient rows** and found no winged-bean flour name, species phrase, French name, or direct link to `ingredient-ref-winged-bean-flour`. There is no recipe-grounded need for a conversion or substitution.

At proposal-review time, the ledger had eight previously registered sources for the identity record, two prior decisions, no observations, and no substitution findings. Integration added source S01, one measurement decision, and two observations; the other three R360 sources remain proposal-local. This review reuses R263's terminology conclusions by linking the existing proposal; it does not duplicate their source records. The working tree already contained unrelated changes from the parent task; this review did not alter them.

## Evidence register

S01 was registered on the existing ledger record during integration; S02–S04 remain proposal-local and are not registered in the shared ledger. Existing R263 terminology sources are reused by reference only.

| ID | Source | Support and limit |
|---|---|---|
| **S01 — `WP02-B2-WINGED-BEAN-FLOUR-MEASURE-R360-20261016-S01`** | K. Narayana and M. S. Narasinga Rao, [“Effect of Partial Proteolysis on the Functional Properties of Winged Bean (*Psophocarpus tetragonolobus*) Flour”](https://doi.org/10.1111/j.1365-2621.1984.tb13247.x), *Journal of Food Science* 49(3) (1984), 944–947. | Primary-study abstract reports 0.387 g/mL before and 0.597 g/mL at 45% proteolysis. The publisher page returned 403 on direct open; its indexed article record and abstract were checked. The paper does not supply a kitchen portion. |
| **S02 — `WP02-B2-WINGED-BEAN-FLOUR-MEASURE-R360-20261016-S02`** | Yelita Utami Putri and Slamet Budijanto, [*Studi Pembuatan Tepung Biji Kecipir … dengan Metode Penggilingan Basah*](https://repository.ipb.ac.id/handle/123456789/59976), IPB University, 2010. | Institutional repository abstract reports 0.5974 g/mL for its highly processed, protein-enriched flour and identifies the soak/boil, alkali-extraction, isoelectric-precipitation, drying, and re-grinding sequence. The linked PDF returned a cache miss; no method detail beyond the repository abstract is used. |
| **S03 — `WP02-B2-WINGED-BEAN-FLOUR-MEASURE-R360-20261016-S03`** | F. U. Igene, S. O. Oboh, and V. A. Aletor, [“Effects of Some Processing Techniques on the Functional Properties of Winged Bean Seed Flours”](https://agris.fao.org/search/en/providers/122601/records/6473992c68b4c299a3fba8cd), *Journal of Food, Agriculture & Environment* 3(2) (2005), 28–31. | FAO AGRIS indexes the primary-paper abstract, which lists bulk density among properties tested for raw, boiled, roasted, and autoclaved flours. The accessible abstract gives no numerical density or kitchen measure. |
| **S04 — `WP02-B2-WINGED-BEAN-FLOUR-MEASURE-R360-20261016-S04`** | Slamet Budijanto, Azis Boing Sitanggang, and Wita Murdiati, [“Characterization of Physicochemical and Functional Properties of Winged-Bean (*Psophocarpus tetragonolobus*) Protein Isolate”](https://agris.fao.org/search/zh/records/6851761753e52c13fc76c7de), *Jurnal Teknologi dan Industri Pangan* 22(2) (2011), 130–136. | FAO AGRIS record for the primary study reports 0.60 g/mL for an 83.87%-protein isolate made from defatted flour. It is cited only to establish an excluded product boundary, not as an observation for the active flour row. |

## Static review only

The proposal review was read-only and covered `AGENTS.md`, `Requirements.md`, the WP02 Section 04 B2 plan and active reminders, roadmap context, reference/form/ledger records, R263 and nearby R269/R302 work, picker logic, the complete manifest-listed recipe corpus, and source-ID ownership. Root integration is recorded in the linked batch README. No software tests, build, or emulator check was performed because this only adds database JSON data under `AGENTS.md`.
