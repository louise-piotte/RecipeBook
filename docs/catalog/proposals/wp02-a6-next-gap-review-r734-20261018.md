# WP02 A6 next open gap review — R734

**Disposition:** Record Tootsi's Nutrition Facts serving of `1/4 cup (40 g)` for organic white quinoa flour, supplier product code `31501`, as a product-specific `portion_weight` observation on the existing `ingredient-ref-white-quinoa-flour` ledger row. Set that reference's `measurementState` to `researched_no_supported_value` because the label does not establish a transferable measure, density, or unit mapping. Leave the active reference, aliases, forms, rules, density, mappings, and package yields unchanged. Keep substitution research unreviewed; the product page's separate replacement advice is outside this measurement review.

R734 addresses the still-open measurement question for the color-qualified white quinoa flour reference. It does not repeat R731's generic buckwheat serving or R719's Cuisine Soleil portion on the separate generic quinoa-flour row. The earlier quinoa/amaranth identity proposal retained Tootsi's product-specific statements outside reusable recipe data. This proposal records the serving only as provenance-linked product evidence; it does not promote it to an active recipe measure or conversion.

See the [A6 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt), [recent roadmap](../../../roadmap.md), [catalog workflow](../ingredient-catalog-workflow.md), and the [prior quinoa-flour identity review](wp02-a6-quinoa-amaranth-flour-identity-review-20261011.md).

## Current record and scope

The active reference is `ingredient-ref-white-quinoa-flour`, displayed as `white quinoa flour / farine de quinoa blanc`, category `FLOUR_AND_STARCH`. Its English and French aliases are empty, `defaultDensity` is null, and `unitMappings` is empty. The ledger row has verified identity, `measurementState: not_yet_researched`, `substitutionResearchState: not_yet_researched`, no measurement observations, and no substitution findings. No ingredient form, substitution rule, contextual substitution rule, or package-yield relation targets it.

The generic `ingredient-ref-quinoa-flour` has a separate R719 Cuisine Soleil `1/4 cup (30 g)` product-label observation. Roasted quinoa flour was reviewed under R616 and black quinoa flour has Naturquinoa's separate 60 g nutrition portion under R728. None of those product observations is transferred to white quinoa flour. The live references, forms, substitution rules, package yields, ledger row, and [ledger schema](../research-ledger.schema.json) were inspected.

## First-party evidence and limits

- Tootsi's [English product page](https://tootsi.com/en-GB/Product/Detail/31501) identifies `organic white quinoa flour (gluten free)`, code `31501`, describes organic quinoa ground from finely ground white quinoa seeds, and gives Nutrition Facts `Per 1/4 cup (40 g)` and `Pour 1/4 tasse (40 g)`.
- Tootsi's [French product page](https://tootsi.com/fr-FR/Product/Detail/31501) identifies `farine de quinoa blanc (bio) - sans gluten`, the same code `31501`, and the same bilingual serving panel. The two pages are language views of one supplier product record, not independent measurements.
- The existing OQLF quinoa entry and the Québec mill listing remain the terminology sources already owned by the white-flour row. The direct Tootsi pages support the named product and its label portion; they do not establish that `organic`, `bio`, or Tootsi is a general ingredient name.

The reported 40 g is a manufacturer Nutrition Facts serving for product code 31501. Neither page describes cup capacity, whether the measure is level or packed, a filling/compaction procedure, or an independent weighing protocol. The pages also list a weight of `55.12 LBS`; this review does not infer a consumer package size, package yield, or serving count from that field. Record the source's portion as product-specific evidence only. Do not calculate or activate a `g/ml` density or a cup mapping.

Both product pages also state that the flour can replace up to 25% of flour in recipes. That product-page statement is outside the chosen measurement gap: this proposal does not interpret its denominator, dish scope, or product-specific basis, does not add it as a substitution finding, and does not activate a runtime rule. A separate substitution review should assess that claim before changing the current `not_yet_researched` substitution state.

## Bilingual identity, aliases, and picker projection

The live bilingual display `white quinoa flour / farine de quinoa blanc` matches the color-qualified product. The current OQLF [quinoa entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26541613/quinoa) gives `quinoa n. m.`, consistent with the existing French adjective `blanc`; the Québec mill's current [Farine de quinoa blanc biologique listing](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/farine-de-quinoa-blanc-biologique) independently uses that product phrase without a serving measure. These are terminology sources already owned by the row. No display or alias change is proposed. Keep `organic white quinoa flour`, `farine de quinoa blanc (bio)`, `farine de quinoa blanc biologique`, `Tootsi`, and `31501` as source/product descriptors rather than active aliases.

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) folds case, accents, compatibility forms, and punctuation; it prefers complete word-phrase matches before substring fallback. A static projection using current reference and form terms gives these results, all unchanged by a ledger-only addition:

| Query | Current picker result | R734 effect |
|---|---|---|
| `white quinoa flour` | `ingredient-ref-white-quinoa-flour` | No change |
| `farine de quinoa blanc` | `ingredient-ref-white-quinoa-flour` | No change |
| `quinoa flour`; `farine de quinoa` | Generic, roasted, white, red, and black quinoa-flour references | No change |
| `organic white quinoa flour`; `farine de quinoa blanc biologique` | No result | No change |

The qualified flour phrases remain distinct from whole quinoa, quinoa flakes, puffed quinoa, and the separate color/process flour rows. No alias collision is introduced.

## Manifest-listed recipe scan

Scanned all **114 manifest-listed recipe files and 1,123 ingredient rows**. A serialized-content and ingredient-row search for `ingredient-ref-white-quinoa-flour`, `white quinoa flour`, `farine de quinoa blanc`, `organic white quinoa flour`, `farine de quinoa blanc biologique`, and product code `31501` found **no hits**. There is no bundled recipe link, matching text, or recipe-specific quantity for this reference. No recipe edit or recipe-line link is proposed.

## Proposed research-ledger delta

The schema-shaped `Record` below contains only the proposed R734 sources, one portion observation, and one decision; it is not a replacement for the live record. At integration, append the two exact-page source records, observation, and decision to the existing white-quinoa-flour ledger row and update only `measurementState`. Preserve the accepted identity decision and existing source owners. The English and French pages expose the same supplier label, so they support one observation rather than two independent measurements. All IDs below are proposal-local and require a fresh ownership check at integration.

```json
{
  "recordId": "ingredient-ref-white-quinoa-flour",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP02-A6-WHITE-QUINOA-MEASURE-R734-20261018-S01",
      "url": "https://tootsi.com/en-GB/Product/Detail/31501",
      "title": "Tootsi, organic white quinoa flour (gluten free), product 31501",
      "accessedOn": "2026-10-18",
      "locator": "Product code 31501; product description and bilingual Nutrition Facts panel, Per 1/4 cup (40 g) / Pour 1/4 tasse (40 g).",
      "supports": "Tootsi identifies its organic white quinoa flour as code 31501 and states a Nutrition Facts portion of 1/4 cup (40 g). This is a product-specific label portion; the page does not state cup capacity, a fill method, compaction, or an independent weighing procedure.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-A6-WHITE-QUINOA-MEASURE-R734-20261018-S02",
      "url": "https://tootsi.com/fr-FR/Product/Detail/31501",
      "title": "Tootsi, farine de quinoa blanc (bio) - sans gluten, produit 31501",
      "accessedOn": "2026-10-18",
      "locator": "Product code 31501; French product title, product description, and bilingual Valeur nutritive panel, Pour 1/4 tasse (40 g) / Per 1/4 cup (40 g).",
      "supports": "Tootsi identifies the same supplier product as farine de quinoa blanc (bio), code 31501, and repeats the 1/4-cup (40 g) Nutrition Facts portion. This French page is a language view of the same product label, not an independent measure.",
      "sourceKind": "manufacturer"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "tootsi-white-quinoa-flour-quarter-cup-40-g-r734-20261018",
      "relationship": "portion_weight",
      "value": 40,
      "valueUnit": "g",
      "foodDescription": "Tootsi organic white quinoa flour, supplier product code 31501, described as finely ground white quinoa seeds.",
      "foodState": "Flour as sold in the named product listing.",
      "measurementMethod": "The supplier's Nutrition Facts panel reports 1/4 cup (40 g); neither language page gives a cup capacity, filling/compaction method, or independent weighing procedure.",
      "quantityBasis": "One product-specific Nutrition Facts portion for Tootsi code 31501 only. Do not transfer it to generic, roasted, red, or black quinoa flour, and do not derive an active density or unit mapping.",
      "sourceQuantity": {
        "amount": 0.25,
        "unit": "cup",
        "unitConvention": "Source-stated 1/4 cup; cup capacity and filling method are unspecified."
      },
      "observedMassG": 40,
      "evidenceKind": "manufacturer_label",
      "sourceIds": [
        "WP02-A6-WHITE-QUINOA-MEASURE-R734-20261018-S01",
        "WP02-A6-WHITE-QUINOA-MEASURE-R734-20261018-S02"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Record Tootsi's 1/4 cup (40 g) Nutrition Facts portion as product-specific evidence for code 31501. It does not establish a reusable measurement for the existing white-quinoa-flour reference, so keep active density and unit mappings empty and make no substitution or package-yield change.",
      "sourceIds": [
        "WP02-A6-WHITE-QUINOA-MEASURE-R734-20261018-S01",
        "WP02-A6-WHITE-QUINOA-MEASURE-R734-20261018-S02"
      ]
    }
  ]
}
```

The `sourceQuantity` preserves the label's 1/4-cup portion but does not define a general cup-to-gram conversion. [Requirements.md FR-5](../../../Requirements.md) requires an ingredient density or mapping for weight-volume conversions. No active density, mapping, unit conversion, reusable measure, form, package yield, or substitution rule is supported by this evidence.

## Source ID and URL ownership audit

The exact English and French product-page URLs above have no owner in the current research ledger. The existing `WP02-A6-QAM-FLOUR-20261011-S06` row source owns the Tootsi Canadian catalog PDF URL, `https://www.tootsi.com/forms/TOOTSI_CATALOG_CANADA.pdf`; its live URL is not either direct product page. The archived identity proposal groups the English detail page with that catalog source as identity evidence, but the live ledger has no exact product-page URL entry. The existing `WP02-A6-FRWORD-20261011-S06` source owns Yupik's French-facing page, not the Tootsi product page. R734 therefore uses fresh proposal-local IDs for the two direct language URLs and does not claim or transfer shared-ID ownership. No matching R734 source or observation ID was found in the current ledger or proposal archive.

## Review checks

- [x] Read current `AGENTS.md`, the FR-5 weight-volume conversion requirement, open A6 checklist, recent roadmap/workflow entries, live reference/form/rule/yield files, target ledger row, ledger schema, and prior quinoa-flour proposals.
- [x] Verified Tootsi's first-party English and French pages for product code 31501 and the bilingual 1/4-cup (40 g) Nutrition Facts portion; treated the pages as one product-label evidence set.
- [x] Kept `organic`/`bio`, the brand, and product code out of aliases; projected current picker results using `IngredientSearch.kt`.
- [x] Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows; found no target ID, name, product-code, or matching phrase hits.
- [x] Audited live source-ID and exact-URL ownership; the proposed source and observation IDs remain local to R734.
- [x] Validated the example against `research-ledger.schema.json`; checked this proposal's relative links, UTF-8 encoding without BOM, no mojibake, and trailing whitespace.
- [x] No software tests, build, emulator, or deployment were run. This is proposal-only work; `AGENTS.md` also exempts database-JSON-only additions from software testing.

The broader WP02 Section A6 review remains open.
