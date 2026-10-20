# WP02 B2 whole pinto bean flour measurement and substitution review (R535)

- **Reviewed:** 2026-10-17.
- **Status:** Integrated on 2026-10-17; see the [R534–R536 integration README](../batches/wp02-wp03-wp04-r534-r536-gap-review-integration-20261017/README.md).
- **Scope:** Measurement and recipe-specific substitution evidence for the existing
  whole pinto bean flour reference, `ingredient-ref-pinto-bean-flour`.
- **Recommendation:** Integrate a no-supported-value measurement state and one
  formula-bounded ground-beef patty finding in its research-ledger record. Keep
  density, unit mappings, forms, recipe links, conversions, and active substitution
  rules empty.
- **Proposed new source ID:** `WP02-B2-PINTO-FLOUR-MEASURE-SUBSTITUTION-R535-20261017-S01`.

## Plan fit and previous decisions

The open WP02 Section B checklist covers alternative flours, including the pulse and
nut flours under review. The active whole pinto bean flour identity was integrated
from the R8 identity proposal as a source-scoped product name. R8 left its
measurement and substitution research states at `not_yet_researched`; it did not
add an observation or substitution finding. R535 addresses those two open ledger
states only. It does not reopen the accepted identity, alias, or French-display
decisions.

This review is separate from R525's precooked chickpea form, R529's sweet white-lupin
measurement and durum-bread evidence, and R532's generic soy-flour measurements.
None of those candidates is used as a source or proxy for pinto flour.

## Current identity, French naming, and ownership

The active flour row is `whole pinto bean flour / farine de haricots pinto` in
`FLOUR_AND_STARCH`. Both alias arrays are empty, density is null, and unit mappings
are empty. The distinct whole-pulse row is `pinto beans / haricots pinto` in
`LEGUME_AND_PULSE`, with its existing singular aliases. The only attached pinto
form is canned whole beans with liquid; it is not a flour form.

The existing French display remains provisional. OQLF defines the pinto bean and
prefers singular `haricot pinto`; for the plural it prefers `haricots pintos` but
also admits `haricots pinto`. This is whole-bean terminology, not a French flour
standard. The existing Cuisinart Canada source uses `farine de haricots pinto` in
indexed French text, but direct PDF retrieval failed in the R8 review. R535 proposes
no name, alias, or localized-string change.

| Query | Static picker projection from current reference and form terms |
|---|---|
| `whole pinto bean flour` | Whole pinto bean flour only. |
| `pinto bean flour` | Whole pinto bean flour only; the complete phrase occurs in its English display. |
| `farine de haricots pinto` | Whole pinto bean flour only. |
| `pinto beans` | Whole pinto beans only. |
| `pinto bean` | Whole pinto beans and whole pinto bean flour. |
| `haricots pinto` | Whole pinto beans and whole pinto bean flour. |
| `pinto flour` | No match; no source-qualified alias supports this broader phrase. |
| `farine de haricot pinto` | No match; no flour-name source supports changing the existing plural wording. |

The projection follows the phrase-first, then substring behavior in
[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt);
the application picker was not run. R535 changes no searchable terms.

## Measurement evidence and limits

No reviewed source supplies a household mass-per-volume value for the active
whole-pinto flour product.

| Source | Evidence | Limit for the active row |
|---|---|---|
| Avena Foods, existing source `WP02-B2B3-PINTO-FLOUR-20261012-ROUND8-S01` | The manufacturer lists Whole Pinto Bean Flour as a product. Its family description distinguishes whole, split, and decorticated pulse flours. | No pinto-specific serving weight, spoon measure, volume, or mass-to-volume value is published on the reviewed product page. |
| Audu et al. (2014), proposed source R535-S01 | The paper measures bulk density for raw and processed pinto seed flours. Its preparation section says the raw seed was soaked and dehulled before milling. The table reports raw bulk density as 0.38 g/cm³, while the prose gives 0.3800 g/cm³ and then 0.3500 g/cm³ for the raw sample. | The dehulled sample does not match the active whole-pinto product boundary. The internal 0.35/0.38 discrepancy prevents choosing one value, and laboratory bulk density is not a household measure or a retail product portion. Do not add an observation or density. |
| Cuisinart Canada, existing source `WP02-B2B3-PINTO-FLOUR-20261012-ROUND8-S04` | The R8 proposal transcribed an indexed recipe amount of 1 tablespoon (15 mL) of the flour. | The direct PDF could not be inspected; no mass or spoon-fill method is available. This is at most a recipe-specific volume, not a mass conversion or reusable portion observation. |
| Felker et al. (2023), existing source `WP02-B2B3-PINTO-FLOUR-20261012-ROUND8-S05` | The study reports flour and water quantities in a controlled patty formula. | Those quantities define one experimental formulation. They do not measure flour volume, density, or a household portion. |

**Measurement recommendation:** Set `measurementState` to
`researched_no_supported_value`; leave `measurementObservations` empty,
`defaultDensity` null, and `unitMappings` empty. This state records the reviewed
evidence limit for this row; it does not claim that all pinto flour products share a
single density.

## Formula-bounded substitution evidence

Felker et al. purchased pinto beans and milled them into flour for comparison with a
separately steam-jet-cooked and drum-dried flour. Their 80:20 ground-beef patty trial
tested both flours at 6%, 12%, and 18% of each 100 g patty treatment, paired with an
equal mass of water:

| 100 g patty treatment | 80:20 ground beef | Raw pinto flour | Jet-cooked/drum-dried pinto flour | Water |
|---|---:|---:|---:|---:|
| RF6 | 88 g | 6 g | 0 g | 6 g |
| RF12 | 76 g | 12 g | 0 g | 12 g |
| RF18 | 64 g | 18 g | 0 g | 18 g |
| JC6 | 88 g | 0 g | 6 g | 6 g |
| JC12 | 76 g | 0 g | 12 g | 12 g |
| JC18 | 64 g | 0 g | 18 g | 18 g |

Each treatment uses either raw flour or jet-cooked/drum-dried flour, not both. The
authors report that added-flour treatments changed cooking loss, dimensions, and
cooking time relative to untreated patties; the jet-cooked/drum-dried 18% treatment
had the largest cooked diameter and shortest cook time in their trial. These
observations support recording a study-specific partial ground-beef replacement
finding. They do not support a general meat replacement, flour substitution, or
recipe scaling rule. The study does not establish that its ingredient is the same
commercial product as Avena's flour.

**Substitution recommendation:** Set
`substitutionResearchState` to `researched_supported` and record one finding on
the existing flour record. Give it no `ruleId`; add no active rule or recipe-line
link. Keep the source-specific raw and jet-cooked/drum-dried materials distinct in
the finding's context and limitations.

Proposed ledger addition to the existing record:

```json
{
  "recordId": "ingredient-ref-pinto-bean-flour",
  "measurementState": "researched_no_supported_value",
  "measurementObservations": [],
  "substitutionResearchState": "researched_supported",
  "sources": [
    {
      "sourceId": "WP02-B2-PINTO-FLOUR-MEASURE-SUBSTITUTION-R535-20261017-S01",
      "url": "https://www.iiste.org/Journals/index.php/CPER/article/viewFile/14134/14442",
      "title": "Audu et al., Functional Properties of Processed Pinto Bean (Phaseolus vulgaris L.) Grown in Plateau State, Nigeria",
      "accessedOn": "2026-10-17",
      "versionOrDate": "2014",
      "locator": "Raw sample preparation §2.2.1; bulk-density method §2.3; raw-sample prose in Results; Table 1, p. 17.",
      "supports": "Reports laboratory bulk-density results for pinto seed flours. The raw sample was soaked and dehulled before milling. Table 1 reports 0.38 g/cm3 for raw flour, while the results prose gives both 0.3800 and 0.3500 g/cm3 for the raw sample. The dehulled sample and conflicting prose value do not support a measurement observation for the active whole-pinto flour row.",
      "sourceKind": "direct_measurement"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "whole-pinto-flour-ground-beef-patty-study-r535-20261017",
      "researchState": "researched_supported",
      "fromIngredientRefId": "ingredient-ref-ground-beef",
      "replacements": [
        {
          "ingredientRefId": "ingredient-ref-pinto-bean-flour",
          "roleInCompound": "In the cited experimental treatments only, replaces a portion of 80:20 ground beef and is paired with an equal mass of water."
        }
      ],
      "context": "Felker et al. tested raw pinto bean flour and, separately, jet-cooked/drum-dried pinto bean flour in 100 g 80:20 ground-beef patties. The 6 g, 12 g, and 18 g flour treatments used 88 g, 76 g, and 64 g beef, respectively, plus the same mass of water as flour. Do not combine the two flour processes in one treatment.",
      "basis": "Primary controlled study of pinto bean flour in ground-beef patties; the reported replacement and added-water amounts are the tested formula.",
      "expectedEffects": [
        "The flour treatments changed cooking loss, cooked dimensions, and cooking time versus untreated patties.",
        "The jet-cooked/drum-dried 18% treatment had the largest cooked diameter and shortest cook time in this study."
      ],
      "limitations": [
        "The authors milled purchased pinto beans in the laboratory; the study does not identify a match to Avena's commercial flour specification.",
        "The amounts apply only to the tested 80:20 ground-beef patty formulation and its processing conditions.",
        "Raw and jet-cooked/drum-dried flours are distinct research materials with different behavior.",
        "This finding is not a general meat-free replacement, flour-for-flour substitution, density, measure, or runtime rule."
      ],
      "sourceIds": [
        "WP02-B2B3-PINTO-FLOUR-20261012-ROUND8-S05"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Record the absence of a transferable household measurement and the narrowly supported ground-beef patty study finding on the existing whole-pinto flour ledger row. Keep all active measurement and substitution behavior unset.",
      "sourceIds": [
        "WP02-B2-PINTO-FLOUR-MEASURE-SUBSTITUTION-R535-20261017-S01",
        "WP02-B2B3-PINTO-FLOUR-20261012-ROUND8-S05"
      ]
    }
  ]
}
```

## Source ownership and source register

The target reference ID occurs once in the active reference file and once as a
research-ledger record. The R8 identity source IDs S01–S05 each have one ledger
owner, on that flour record. Reuse existing source S05 for the patty finding; do
not duplicate its source entry. Before R535, the proposed R535-S01 URL and ID
prefix had no owner in the ledger or existing proposal/batch archive; this
proposal is their first proposal-level use.

| Source ID | Source and locator | Use and limitation |
|---|---|---|
| `WP02-B2B3-PINTO-FLOUR-20261012-ROUND8-S01` | Avena Foods, [Pulse Flour Ingredients for Product Development](https://www.avenafoods.com/products/pulses-and-pulse-ingredients/flours/), product-family and Whole Pinto Bean Flour listings. | Existing manufacturer identity source. No household portion or pinto-specific density. |
| `WP02-B2B3-PINTO-FLOUR-20261012-ROUND8-S02` | OQLF, [haricot pinto (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083587/haricot-pinto), definition and plural note, updated 2024. | Whole-bean French terminology only; not a flour naming or measurement standard. |
| `WP02-B2B3-PINTO-FLOUR-20261012-ROUND8-S03` | OQLF, [haricot commun (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296955/haricot-commun), preferred term and botanical definition. | Supports the underlying common-bean identity only. |
| `WP02-B2B3-PINTO-FLOUR-20261012-ROUND8-S04` | Cuisinart Canada, [CYM-100C French instruction booklet](https://www.cuisinart.ca/on/demandware.static/-/Sites-master-ca/fr_CA/v1770545043648/Instruction%20Booklet/CYM-100C_fr.pdf), indexed French recipe text. | Canadian French usage and a recipe-specific volume phrase; direct PDF retrieval failed in R8 and no flour mass is available. |
| `WP02-B2-PINTO-FLOUR-MEASURE-SUBSTITUTION-R535-20261017-S01` | Audu et al., [Functional Properties of Processed Pinto Bean](https://www.iiste.org/Journals/index.php/CPER/article/viewFile/14134/14442), 2014, §§2.2.1 and 2.3, results prose, Table 1 p. 17. | Documents a dehulled laboratory sample and conflicting raw-density text. It is reviewed to exclude, not transfer, its laboratory value. |
| `WP02-B2B3-PINTO-FLOUR-20261012-ROUND8-S05` | Felker et al., [Comparison of Raw and Excess Steam Jet-Cooked/Drum-Dried Pinto Bean Flours and Their Effects on Ground Beef Patties](https://onlinelibrary.wiley.com/doi/10.1155/2023/5915625), Methods §2.1 and §2.3.1, Table 1, Results §3.3/Table 4. | Existing primary study source. Reuse for one formula-specific patty finding; it provides no household measurement or transferable substitution rule. |

## Current snapshot and full recipe-corpus scan

Snapshot refreshed from the shared worktree on 2026-10-17. File hashes are SHA-256
of exact file bytes. The recipe fingerprint is SHA-256 over each manifest-listed
relative recipe path, NUL, file bytes, NUL, in manifest order.

| Surface | Current count / fingerprint |
|---|---|
| Active ingredient references | 1,801; `0f4c4b4c3f86fab4ffe7c1bfbd5147c59a449d627295f9522d032a34f0ddef32` |
| Ingredient forms | 144; `5a47b562629b3f7a248f4d6068b606a6baf6c216480caca8a63fc9fb1ec74b17` |
| Global substitution rules | 0; `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| Contextual substitution rules | 0; `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| Legacy import candidates | 56; `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| Research ledger | 2,158 records / 9,922 source entries / 8,399 distinct source IDs / 7,107 distinct URLs; `a749e9aef8c8cd8450e2069a31fd93a2c2595cdfabf72c57e0321bcf964838db` |
| Manifest | 114 recipe files; `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe files and ingredient rows | 114 files / 1,123 rows; ordered recipe fingerprint `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e` |

All 114 manifest-listed recipe JSON files and 1,123 ingredient rows were scanned for
pinto flour and pinto-bean terms. One recipe file contains a pinto ingredient:
`007-haricots-pinto-refrits-refried-pinto-beans`, row `007#4`, “1 can pinto beans
with liquid.” It links to `ingredient-ref-pinto-beans` and
`ingredient-form-pinto-beans-canned-with-liquid`. No row names or links to pinto
bean flour; there is no bundled recipe demand for this finding.

The candidate has no current flour form, density, unit mapping, package-yield
record, recipe link, global substitution rule, or contextual substitution rule.
The package-yields file contains one unrelated record. The only pinto form and
recipe link belong to whole canned beans.

## Static review record

- Rechecked the active plan, the R8 identity proposal, the R525/R529/R532 proposals,
  the current reference/form files, the pinto ledger record, and the source archive.
- At proposal time, verified that the target measurement and substitution states were
  `not_yet_researched`, and that the R535 source prefix and proposed Audu URL were
  unowned.
- Recomputed the picker projections from the current names, aliases, form labels,
  and match terms using the phrase-first matching rules in source.
- Scanned the complete manifest-listed recipe corpus and recorded its current
  counts and fingerprint above.
- At proposal time, R535 changed no app, test, build, emulator, generated-catalog,
  seed, ledger, manifest, plan, workflow, or roadmap files. The accepted ledger
  update and its validation are recorded in the linked integration README.
