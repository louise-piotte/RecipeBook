# WP02 Section A7 R821 — whole-wheat-flour CNF portion evidence

- **Reviewed:** 2026-10-19
- **Status:** Proposal only; no shared catalog, ledger, checklist, roadmap, workflow, or generated-index files were changed.
- **A7 anchor:** The live Section A7 checklist remains open for other grain meals and milling products ([plan, Section A7](../../RecipeBook-global-ingredient-catalog-plan.txt#L2282)). This review addresses an unfilled measurement field on the existing whole-wheat-flour reference. R812 covered einkorn flour, R815 covered malted wheat flour, and R818 covered whole-wheat pastry flour; none covers this generic whole-wheat-flour row.

## Recommendation

On the existing ledger row `ingredient-ref-whole-wheat-flour`, record two source-specific published portions from Health Canada's CNF 2015 Food Code 4500:

- 100 mL = 50.7 g
- 250 mL = 126.8 g

Set `measurementState` to `researched_supported` and refresh the row's existing CNF source `S3` with the portion details and this review's access date. Keep each volume and mass exactly as published. Do not convert 250 mL to an app cup or treat either pair as density, a generic cup weight, or an active unit conversion.

The public CNF entry names the same bilingual food as the active reference: **Grains, wheat flour, whole-wheat / Grains céréaliers, farine de blé entier**. It lists the two volume portions and also “1 serving = 20.0 g.” Only the paired volume and mass values are proposed as observations; the 20 g serving is not a recipe or household volume measure.

This is deliberately historical, source-scoped evidence. Health Canada's public search page identifies itself as the **2015 CNF publication**, says it will not be updated, and points users toward the CNF 2026 dataset. The 2026 Open Government dataset is published and its metadata was modified 2026-10-04, but its resource pages returned HTTP 403 in this research browser. I could not confirm Food Code 4500's 2026 row values. Keep the R821 observations explicitly attributed to CNF 2015 and do not describe them as the latest CNF values. A later review can reconcile them against the accessible 2026 records.

## Identity, labels, and ownership

The active target is `ingredient-ref-whole-wheat-flour`, category `FLOUR_AND_STARCH`, displayed as **whole-wheat flour / farine de blé entier**. It has only the English alias **entire wheat flour**, `defaultDensity: null`, and empty `unitMappings`. Its identity is already verified; the ledger row currently has `measurementState: not_yet_researched`, no measurement observations, and `substitutionResearchState: researched_no_supported_substitute` with the existing WP08 finding. No identity, name, alias, category, substitution finding, or active reference field needs changing.

The exact food name is present bilingually in CNF Food Code 4500. The existing source `S2` is CFIA's Canadian compositional standard for “Whole Wheat Flour or Entire Wheat Flour.” Existing OQLF source `WP02-A1-ENTIRE-WHEAT-ALIAS-20261012-S02` gives **farine de blé entier** and **farine de blé complet** as preferred French terms and maps the English terms to *whole wheat flour* and *entire wheat flour*. These sources support the existing English and Québec French identity independently of the measurement evidence.

Do not add `farine de blé complet` as an alias here. The picker currently returns the separate `ingredient-ref-wheat-meal` row for that query because its alias is the longer `farine de blé complet brute`; phrase-first matching accepts that contiguous subphrase. Adding the unqualified OQLF variant to this flour row would make the query return both flour and meal. Keep the established French display and the `entire wheat flour` alias unchanged.

## Source evidence and limits

| Source | Exact evidence used | Limit |
| --- | --- | --- |
| Reuse `S3` — Health Canada, [Canadian Nutrient File: wheat flour, whole-wheat, Food Code 4500](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4500). | The current public serving-size page displays the English/French food names, `100ml = 50.7 g`, `250ml = 126.8 g`, and `1 serving = 20.0 g`. The page metadata says modified 2019-03-01. | Health Canada identifies the public tool as CNF 2015 and says it will not be updated. No filling, packing, sifting, or handling method is supplied. The source portions do not establish a universal flour density, app-cup mass, recipe-specific amount, or active conversion. The 20 g serving has no volume quantity and is excluded. |
| Existing `S2` — CFIA, [Canadian Food Compositional Standards, Volume 12](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), §12.1.3. | Names the standardized wheat product “Whole Wheat Flour or Entire Wheat Flour.” | Identity boundary only; no household portion, density, or conversion. No source update is proposed. |
| Existing `WP02-A1-ENTIRE-WHEAT-ALIAS-20261012-S02` — OQLF, [farine de blé entier (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8361931/farine-de-ble-entier). | The preferred French terms are `farine de blé entier` and `farine de blé complet`; English terms include `whole wheat flour` and `entire wheat flour`. | Terminology evidence, not measurement evidence. The unqualified French alternative remains inactive because its phrase currently resolves to the whole-wheat-meal row. |
| Health Canada, [Canadian Nutrient File, 2026 dataset metadata](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109). | Confirms a CNF 2026 dataset with Food Name and Measure Weight Conversion resources; the dataset record is listed as modified 2026-10-04. | Metadata only. The resource pages were inaccessible to this browser (HTTP 403), so no Food Code 4500 values from CNF 2026 are claimed or included. |

## Current data and picker audit

| Surface | Current state and proposed effect |
| --- | --- |
| Active identity and aliases | `ingredient-ref-whole-wheat-flour` owns `whole-wheat flour / farine de blé entier` and `entire wheat flour`. Keep all names and aliases unchanged. `farine de blé complet brute` remains on the distinct whole-wheat-meal row. |
| Measurement | The target ledger row has no observations and is `not_yet_researched`. Add two historical CNF 2015 published-portion observations; keep the measurement method and quantity basis source-limited. |
| Density, mappings, forms, and rules | Density is null, mappings are empty, and the target has no ingredient forms, global form-conversion rule, or contextual substitution rule. Preserve all of them. The existing no-supported-substitute finding remains unchanged. |
| Source and observation ownership | Existing `S3` is the sole current owner of the exact CNF Food Code 4500 URL, attached to this target row. Reuse and refresh `S3`; do not create a duplicate URL/source ID. The two proposed observation IDs `whole-wheat-flour-cnf2015-100ml-portion-r821-20261019` and `whole-wheat-flour-cnf2015-250ml-portion-r821-20261019` are absent from the ledger. |
| Phrase-first picker | Current results are unchanged because no reference, alias, or form changes are proposed. `whole wheat flour` and `whole-wheat flour` return three rows: generic whole-wheat flour, white whole-wheat flour, and sprouted whole-wheat flour. `entire wheat flour` returns the generic row only. `farine de blé entier` returns four rows: generic, sprouted, whole-wheat meal, and whole-wheat pastry flour. `farine de blé complet` returns whole-wheat meal only through its longer alias. The broad `wheat flour` query remains multi-result. These projections use the app's lowercased, accent-folded phrase-first behavior, including contiguous subphrases. The R806 `malt flour` result remains unchanged at seven rows. |
| Bundled recipe demand | A manifest-driven scan of all 114 recipe files counted 1,123 objects in `ingredients` arrays; 1,097 carry `ingredientRefId`. There are zero direct links to `ingredient-ref-whole-wheat-flour` and zero normalized full-file or ingredient-row hits for `whole wheat flour`, `whole-wheat flour`, `entire wheat flour`, `farine de blé entier`, `farine de blé complet`, `whole wheat meal`, or `wholemeal flour`. No recipe link is proposed. |

The recipe scan used the manifest-listed JSON files only. It counted each `ingredients` array object separately from the narrower `ingredientRefId` count, normalized full-file text and ingredient-row JSON with the same lowercasing, NFKD accent folding, punctuation-to-space, and whitespace folding as `IngredientSearch.kt`, then checked the phrases above and the target ID. It found no direct corpus demand for this row.

## Exact proposed ledger delta

Apply only to `records[]` entry `recordId == "ingredient-ref-whole-wheat-flour"`:

```json
{
  "replace": {
    "measurementState": "researched_supported"
  },
  "reuseAndUpdateSource": {
    "sourceId": "S3",
    "accessedOn": "2026-10-19",
    "locator": "CNF 2015 serving-size entry, Food Code 4500: bilingual food name and available serving sizes.",
    "supports": "Health Canada's public CNF 2015 Food Code 4500 page identifies Grains, wheat flour, whole-wheat / Grains céréaliers, farine de blé entier and reports 100 mL = 50.7 g, 250 mL = 126.8 g, and 1 serving = 20.0 g. Only the two volume-to-mass portions are recorded as observations. The page does not state a filling, packing, sifting, or handling method. The public page identifies itself as the 2015 CNF and says it will not be updated; these values are historical source-specific evidence, not confirmed CNF 2026 values, generic density, an app-cup mapping, or an active conversion."
  },
  "addMeasurementObservations": [
    {
      "observationId": "whole-wheat-flour-cnf2015-100ml-portion-r821-20261019",
      "relationship": "portion_weight",
      "value": 50.7,
      "valueUnit": "g",
      "foodDescription": "Health Canada CNF 2015, Grains, wheat flour, whole-wheat (Food Code 4500).",
      "foodState": "Whole-wheat flour as named by CNF; no finer grade or handling state is specified.",
      "measurementMethod": "The CNF serving-size page reports 100 mL = 50.7 g; it gives no filling, packing, sifting, or handling method.",
      "quantityBasis": "CNF 2015 Food Code 4500 published portion only; not a generic density or active unit conversion.",
      "sourceQuantity": {
        "amount": 100,
        "unit": "ml",
        "unitConvention": "CNF-published millilitre measure."
      },
      "observedMassG": 50.7,
      "observedVolumeMl": 100,
      "evidenceKind": "published_portion",
      "sourceIds": ["S3"]
    },
    {
      "observationId": "whole-wheat-flour-cnf2015-250ml-portion-r821-20261019",
      "relationship": "portion_weight",
      "value": 126.8,
      "valueUnit": "g",
      "foodDescription": "Health Canada CNF 2015, Grains, wheat flour, whole-wheat (Food Code 4500).",
      "foodState": "Whole-wheat flour as named by CNF; no finer grade or handling state is specified.",
      "measurementMethod": "The CNF serving-size page reports 250 mL = 126.8 g; it gives no filling, packing, sifting, or handling method.",
      "quantityBasis": "CNF 2015 Food Code 4500 published portion only; the source labels the volume 250 mL, not 1 app cup.",
      "sourceQuantity": {
        "amount": 250,
        "unit": "ml",
        "unitConvention": "CNF-published millilitre measure."
      },
      "observedMassG": 126.8,
      "observedVolumeMl": 250,
      "evidenceKind": "published_portion",
      "sourceIds": ["S3"]
    }
  ],
  "addDecision": {
    "outcome": "accepted",
    "reason": "Record the two volume-to-mass portions as historical CNF 2015 Food Code 4500 evidence on the matching whole-wheat-flour ledger row. Keep the published values source-scoped; do not activate density, a cup mapping, a unit conversion, a form, recipe link, or substitution rule. CNF 2026 values were not verified in this review.",
    "sourceIds": ["S3"]
  }
}
```

No reference, form, conversion, recipe, package-yield, or substitution JSON changes are proposed. Do not add the 20 g serving as a volume observation, derive an average or density, or transfer either observation to pastry flour, white whole-wheat flour, wheat meal, wholemeal flour, or any named retail product.

## Static checks and test scope

- Read the current Section A7 plan item, `Requirements.md`, relevant `roadmap.md` entries, the catalog workflow and ledger schema, the whole-wheat-flour reference and ledger row, and the R803, R809, R812, R815, R818–R820 reviews before choosing this gap.
- Reopened Health Canada's Food Code 4500 serving page and CNF search page, the OQLF terminology entry, CFIA's identity standard, and the CNF 2026 dataset metadata. Verified the published values, page/version limits, bilingual labels, and distinct meal/pastry/white/sprouted flour ownership separately.
- Checked `S3` URL/source ownership, proposed observation-ID availability, active forms/rules, live phrase-first picker results including contiguous subphrases, and all 114 manifest-listed recipes with the method and counts stated above.
- This is a proposal-only Markdown change. If accepted, the integration changes only research-ledger JSON. Under the current `AGENTS.md` rule, a database-JSON-only change needs no software tests; no tests, app build, emulator run, or deployment were performed.
