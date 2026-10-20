# WP02 A6 next open gap review — R731

**Disposition:** Record Coop Agrobio’s 2023 catalog serving for its named organic buckwheat flour as a product-specific `portion_weight` observation on the existing generic buckwheat-flour ledger row. Set only that row’s `measurementState` to `researched_no_supported_value`. Leave generic density, mappings, reusable measures, forms, substitutions, recipe links, and active reference data unchanged. Keep substitution research `not_yet_researched`.

This review selects a measurement gap distinct from R728’s Naturquinoa black-quinoa-flour portion. The A6 parent checklist remains open, and the target buckwheat-flour row still has no measurement observations. See the [A6 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt), [recent roadmap](../../../roadmap.md), and [catalog workflow](../ingredient-catalog-workflow.md). The R728 entry is documented in the [R728 proposal](wp02-a6-next-gap-review-r728-20261018.md).

## Current record and scope

The active reference is `ingredient-ref-buckwheat-flour`, displayed as `buckwheat flour / farine de sarrasin`, category `FLOUR_AND_STARCH`, with aliases `kuttu atta`, `kuttu ka atta`, `kuttu flour`, and `soba-ko`. Its `defaultDensity` is `null` and `unitMappings` is empty. The existing OQLF source `WP02-S31` pairs the Québec French term `farine de sarrasin` with English `buckwheat flour`; no name or alias change is proposed. The source-named Agrobio product is plain buckwheat flour with an organic descriptor, not evidence for whole, light, dark, sprouted, or Tartary flour.

The target ledger row currently has identity `verified`, measurement `not_yet_researched`, substitution research `not_yet_researched`, no measurement observations, and no substitution findings. Existing sources and accepted identity/alias decisions remain in place. There are no buckwheat forms, active substitution rules, or package-yield entries attached to this reference. The live files checked were [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [substitution rules](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json), [contextual rules](../../../app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json), [package yields](../../../app/src/main/assets/seed/bundled-library/package-yields.v1.json), the [target ledger row](../research-ledger.v1.json), and the [ledger schema](../research-ledger.schema.json).

## First-party evidence and limits

- Coop Agrobio’s [2023 bilingual product catalog](https://www.coopagrobioquebec.com/wp-content/uploads/2023/05/catalogue-2023.pdf), PDF p. 6, section “FARINE DE SARRASIN,” describes its flour as stone-ground in Coaticook from organic buckwheat grown in Québec. Its Nutrition Facts panel states `1/4 tasse (40 g)` / `Per 1/4 cup (40 g)` and lists the named product’s package formats. This directly supports one serving statement for the named Agrobio product in that 2023 catalog.
- Coop Agrobio’s current [English homepage](https://coopagrobioquebec.com/en/) lists organic buckwheat flour among its products and describes its Québec organic-grain-to-flour cooperative. This corroborates that the product class remains in the cooperative’s current portfolio; it provides no serving or conversion data.
- The existing [OQLF entry for farine de sarrasin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497972/farine-de-sarrasin) already supports the target’s Québec French/English display. It is not portion evidence.

The 40 g figure is a manufacturer-catalog nutrition serving, not an independently weighed sample or a standardized cup conversion. The catalog does not state cup capacity, a scoop/fill or compaction method, flour moisture, or a weighing protocol. Its 2023 label snapshot also does not prove that the physical package sold today carries unchanged nutrition text. Do not generalize the serving to generic buckwheat flour or another buckwheat product, derive a `g/ml` density, or activate a cup mapping. The current homepage confirms product listing only; it does not independently corroborate the 40 g serving.

## Bilingual identity, aliases, and picker projection

The product’s bilingual source wording aligns with the already established generic display. Keep “organic” and “Agrobio” as product descriptors, not aliases. Do not add `farine de sarrasin biologique`, `organic buckwheat flour`, a brand alias, or any grade/process phrase.

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) folds case, accents, compatibility characters, and punctuation; it prefers whole word-phrase matches before substring fallback. Applying that behavior to the live reference and form terms gives these current results, which remain unchanged because R731 adds ledger evidence only:

| Query | Current picker results | R731 effect |
|---|---|---|
| `buckwheat flour` | Generic, dark, light, sprouted, Tartary, and whole buckwheat flour | No change |
| `farine de sarrasin` | Generic, sprouted, Tartary, and whole buckwheat flour | No change |
| `kuttu atta`, `kuttu flour`, `soba-ko` | Generic buckwheat flour | No change |
| `organic buckwheat flour`, `farine de sarrasin biologique` | No result | No change |

The previously reviewed fused spelling `sobako` remains unassigned because of the distinct buckwheat-free SOBAKO product-name collision. R731 neither reopens that alias decision nor changes the existing overlapping flour queries.

## Manifest-listed recipe scan

Scanned all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**. Searched complete recipe JSON text and ingredient rows for the target ID, `buckwheat flour`, `farine de sarrasin`, `kuttu atta`, `kuttu ka atta`, `kuttu flour`, and `soba-ko`. There were zero file-text hits, zero target-ID ingredient links, and zero ingredient-row phrase hits. The bundle therefore supplies no recipe-specific amount or demand for a reusable measure, conversion, or substitution.

## Proposed research-ledger delta

This schema-shaped `Record` example contains only proposed R731 entries; it is not a replacement for the live record. At integration, append the two sources, observation, and decision, preserve existing identity/alias evidence and decisions, and update only `measurementState`. All identifiers below are proposal-local and require a fresh ownership check at integration.

```json
{
  "recordId": "ingredient-ref-buckwheat-flour",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP02-A6-BUCKWHEAT-FLOUR-MEASURE-R731-20261018-S01",
      "url": "https://www.coopagrobioquebec.com/wp-content/uploads/2023/05/catalogue-2023.pdf",
      "title": "Coop Agrobio du Québec, Catalogue 2023",
      "versionOrDate": "2023 catalog",
      "accessedOn": "2026-10-18",
      "locator": "PDF p. 6, FARINE DE SARRASIN entry: product description, bilingual Nutrition Facts serving, and package formats.",
      "supports": "The catalog describes the named Agrobio buckwheat flour as stone-ground in Coaticook from organic buckwheat grown in Québec and states a nutrition serving of 1/4 cup (40 g). This is product-specific catalog evidence; it does not state a standardized cup capacity, flour fill method, or generic conversion.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-A6-BUCKWHEAT-FLOUR-MEASURE-R731-20261018-S02",
      "url": "https://coopagrobioquebec.com/en/",
      "title": "Coop Agrobio Québec, English homepage and product list",
      "accessedOn": "2026-10-18",
      "locator": "Current product list includes organic buckwheat flour; cooperative description and page footer.",
      "supports": "The current first-party homepage lists organic buckwheat flour in the cooperative's Québec organic product line. It supports current portfolio context only and supplies no serving or measure.",
      "sourceKind": "manufacturer"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "agrobio-buckwheat-flour-quarter-cup-40-g-r731-20261018",
      "relationship": "portion_weight",
      "value": 40,
      "valueUnit": "g",
      "foodDescription": "Coop Agrobio organic buckwheat flour, the named product in the cooperative's 2023 catalog.",
      "foodState": "Dry flour as sold; serving reported in the product catalog.",
      "measurementMethod": "The catalog's Nutrition Facts panel states 1/4 cup (40 g); it gives no fill, compaction, or weighing procedure.",
      "quantityBasis": "One catalog-reported nutrition portion for the named Agrobio product only. Do not transfer this value to generic buckwheat flour or derive density or a unit mapping.",
      "sourceQuantity": {
        "amount": 0.25,
        "unit": "cup",
        "unitConvention": "Source-stated 1/4 cup; the catalog does not specify cup capacity or fill method."
      },
      "observedMassG": 40,
      "evidenceKind": "manufacturer_label",
      "sourceIds": [
        "WP02-A6-BUCKWHEAT-FLOUR-MEASURE-R731-20261018-S01"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Record the 2023 Agrobio catalog's 1/4 cup (40 g) nutrition portion as product-specific evidence on the existing generic buckwheat-flour row. The current product listing does not independently confirm that serving. One dated label statement supports no generic measure, density, mapping, or conversion; keep substitution research unreviewed and active catalog data unchanged.",
      "sourceIds": [
        "WP02-A6-BUCKWHEAT-FLOUR-MEASURE-R731-20261018-S01",
        "WP02-A6-BUCKWHEAT-FLOUR-MEASURE-R731-20261018-S02"
      ]
    }
  ]
}
```

The observation’s `sourceQuantity` preserves the manufacturer’s reported 1/4-cup serving while its convention explicitly leaves capacity and fill method unspecified. This does not authorize `defaultDensity`, `unitMappings`, an active measure, or any package-yield record. No `SubstitutionFinding` is proposed.

## Source ownership and identifier audit

| Proposed source | Current ownership and use |
|---|---|
| R731 S01, proposal-local | The same catalog PDF URL is already owned by `ingredient-ref-rye-flour` (`WP02A4-S02`, p. 7 rye entry) and `ingredient-ref-spelt-flour` (`WP02A4-SP-S02`, p. 5 spelt entry). R569 also reuses it for a rye-specific product-page review. R731 uses a new source ID and the distinct p. 6 buckwheat entry; do not reuse or transfer those source IDs. |
| R731 S02, proposal-local | The current Coop Agrobio homepage URL has no source owner in the live ledger or proposal archive. The home/product listing is contextual product-availability evidence only. |
| `WP02-S31`, existing target owner | Existing OQLF source on `ingredient-ref-buckwheat-flour`; retain it in place for the bilingual name pair. |
| R731 observation ID, proposal-local | No matching observation ID exists in the live ledger or proposal archive. |

The target reference and ledger record already exist; no new shared reference, ledger record, source-ID allocation, or recipe link is proposed. The two R731 source IDs and observation ID must remain proposal-local until root integration confirms uniqueness.

## Static review checks

- [x] Read current `AGENTS.md`, relevant conversion requirements, the open A6 plan, recent R728 roadmap/workflow progress, the target reference and ledger row, applicable forms/rules/yields, ledger schema, and prior A6 buckwheat/quinoa reviews.
- [x] Verified the first-party 2023 catalog and current Coop Agrobio product listing online; used the existing OQLF source only for the bilingual display.
- [x] Audited aliases and picker projections against `IngredientSearch.kt`; no catalog alias or reference change is proposed.
- [x] Scanned the full manifest-listed recipe corpus: 114 files / 1,123 ingredient rows, with no target links or phrase hits.
- [x] Checked existing source-ID and URL ownership. R731 identifiers remain proposal-local; the shared catalog PDF URL is explicitly reused with a new ID and page-specific locator.
- [x] Validated the embedded Record example against `research-ledger.schema.json`; checked Markdown links, UTF-8/no-BOM, mojibake markers, and trailing whitespace.
- [x] No software tests, build, emulator, or deployment were run. This is a proposal-only review; any eventual active change is limited to database JSON, for which `AGENTS.md` says software testing is not needed.
