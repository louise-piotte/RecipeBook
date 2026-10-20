# WP02 Section A next functional wheat-flour gap review — R206 — 2026-10-16

## Review record

- **Reviewed and sources accessed:** 2026-10-16.
- **Status:** Proposal only. No shared catalog, ledger, recipe, plan, roadmap, generated file, or test was changed.
- **Scope:** One candidate under the open WP02 Section A item, “Add the remaining functionally distinct regional wheat-flour identities”: whole spelt flour.
- **Checklist:** [WP02 Section A](../../RecipeBook-global-ingredient-catalog-plan.txt#L1424).
- **New source-ID namespace:** `WP02-A-FLOUR-GAP-R206-20261016-S01` through `S03`. These IDs and source URLs were checked against the current ledger; none is already registered.

## Decision

**Add one identity-only reference: `whole spelt flour / farine d'épeautre entière`.** The English and Québec French names are directly attested by Canadian and Québec product listings. A Canadian producer describes its whole-spelt product as milled with the bran and germ intact, making this a useful milling boundary from the active unqualified spelt-flour identity. Treat it as a retail ingredient identity, not a nationally standardized spelt grade: the Canadian Grain Commission says spelt is outside the grains regulated under the Canada Grain Act.

Keep the candidate separate from generic `spelt flour`, `malted spelt flour`, `sprouted spelt flour`, `spelt berries`, and `einkorn flour / farine de petit épeautre`. The Québec product page establishes the French product wording; the OQLF source establishes the base term `épeautre`, not an official full-grade term. Do not crosswalk this row to whole-wheat flour, white spelt flour, or a fixed extraction percentage. Add no aliases, forms, recipe links, density, unit mappings, conversions, yields, or substitutions.

### Proposed reference JSON delta

```json
{
  "id": "ingredient-ref-whole-spelt-flour",
  "nameFr": "farine d'épeautre entière",
  "nameEn": "whole spelt flour",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

If accepted, add a verified identity ledger record with `measurementState: researched_no_supported_value` and `substitutionResearchState: researched_no_supported_substitute`. The product-specific hydration note below is not a transferable measurement, and blending guidance is not a replacement rule. Do not add a ledger portion observation or a substitution finding/rule.

## Current owners and prior decisions

At the review snapshot, no active reference, form, legacy-import identity, or ledger record owns `ingredient-ref-whole-spelt-flour`, `whole spelt flour`, or `farine d'épeautre entière`. The exact proposed source URLs in S01–S03 also have no existing ledger owner. The main nearby records are:

| Current owner | Existing identity and data | R206 boundary |
|---|---|---|
| `ingredient-ref-spelt-flour` | `spelt flour / farine d'épeautre`; no aliases, attached forms, density, or unit mappings. Its ledger identity is verified; measurement and substitution research are still marked not yet researched. | Keep this unqualified row intact; do not broaden it with a whole-spelt alias. |
| `ingredient-ref-sprouted-spelt-flour` | `sprouted spelt flour / farine d'épeautre germé`; no forms, density, or unit mappings. | Sprouting remains distinct from whole-grain milling and malting. |
| `ingredient-ref-malted-spelt-flour` | `malted spelt flour / farine d'épeautre malté`, with English alias `spelt malt flour`; no forms or measurements. | Malting remains a process identity, not an extraction grade. |
| `ingredient-ref-spelt-berries` | `spelt berries / grains d’épeautre`; no aliases, forms, density, or unit mappings. | Keep the whole-kernel grain row separate. Do not add `whole spelt` as a grain alias. |
| `ingredient-ref-einkorn-flour` | `einkorn flour / farine de petit épeautre`; no aliases, forms, density, or unit mappings. | `petit épeautre` identifies einkorn in the reviewed Québec product evidence; do not treat it as spelt. |

The generic [spelt-flour integration note](../batches/spelt-flour-identity.md) explicitly left whole, white, extraction, and grind classes for separate review. R147 addresses sprouted spelt flour, not whole spelt flour. R170’s [spelt-berries evidence recheck](wp03-section-f-spelt-berries-current-evidence-recheck-r170-20261016.md) preserves the berry/flour boundary and rejects `whole spelt` as an alias on the grain row; it is not a decision on a flour identity. The [einkorn-flour integration note](../batches/einkorn-flour-identity.md) uses `farine de petit épeautre entière` for einkorn; that qualified product wording does not allocate the proposed spelt phrase.

No spelt-specific global or contextual substitution rule is active. The current [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) attach no form to the nearby spelt or einkorn references.

## Picker projection

The projection follows the current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), which prefers complete word-phrase matches and falls back to partial matches. Results are reference counts before and after adding the proposed row.

| Query | Current | Proposed | Effect |
|---|---:|---:|---|
| `whole spelt flour` | 0 | 1 | Finds the new whole-spelt-flour row. |
| `farine d'épeautre entière` | 0 | 1 | Finds the new row by its exact French display. |
| `spelt flour` | 3 | 4 | Adds the whole-spelt row alongside generic, malted, and sprouted spelt flour. |
| `farine d'épeautre` | 3 | 4 | Adds the whole-spelt row alongside generic, malted, and sprouted spelt flour. |
| `whole spelt` | 0 | 1 | The shorter phrase matches the new canonical display; the current spelt-berries row remains absent because it has no `whole spelt` term. This is a picker limitation to keep visible; no such alias is proposed for the grain row. |

## Bundled recipe demand

Parsed all **114 manifest-listed recipes** and **1,123 structured ingredient rows**. Case-insensitive scans of the full serialized recipe files and ingredient rows for `whole spelt flour`, `whole grain spelt flour`, `farine d'épeautre entière`, `farine intégrale d'épeautre`, and the proposed reference ID found **zero recipe-file hits and zero ingredient-row hits**. There are also zero direct recipe links to the current `ingredient-ref-spelt-flour` row. No recipe link or relink is proposed; this addition is justified by the documented Canadian/Québec market identity, not current bundled demand.

## Measurements and substitutions

- Moulin Abénakis lists 1 kg, 2 kg, and 5 kg package formats; these are package weights, not household measures.
- Fresh Acres lists 4.54 kg and 10 kg package sizes and gives its own product tip to increase hydration by 5–10%. This is a producer-specific baking recommendation, not a flour density, volume-to-mass mapping, or class-wide water rule. The page showed the product as sold out on the access date; this proposal makes no availability claim.
- Fresh Acres recommends blending its flour with light spelt or all-purpose flour. That is a product-specific blend suggestion, with no replacement ratio. It does not establish a global or contextual substitution. Moulin Abénakis’s promotional “alternative” wording is not used as substitution or health evidence.

Keep `defaultDensity` null and `unitMappings` empty. If this proposal is later accepted, the reference and ledger additions are database-data-only changes, so the repository’s JSON-only testing exception applies; no tests or emulator were run for this proposal-only review.

## Source register

All new sources were accessed on 2026-10-16. Product-specific claims below remain attached to their named producers and listings.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| **WP02-A-FLOUR-GAP-R206-20261016-S01** | Moulin Abénakis, [Farine d’épeautre entière biologique](https://moulinabenakis.com/products/farine-epeautre-entiere-bio), product heading, description, and available formats. | Current Québec product title uses `Farine d'épeautre entière biologique`, says the flour is milled in Québec, and lists 1 kg, 2 kg, and 5 kg packages. It does not state a whole-kernel percentage or a volume measure. Its gluten/intolerance marketing wording is not used as technical or health evidence. |
| **WP02-A-FLOUR-GAP-R206-20261016-S02** | Fresh Acres, [Organic Whole Spelt Flour](https://freshacres.ca/products/organic-whole-spelt-flour), title, description, best-use list, baking tips, and size selector. | Canadian product page names whole spelt flour, states its product is made from Canadian-grown spelt with full bran and germ intact, and lists breads, sourdough blends, quick breads, crackers, and flatbreads. Its 5–10% hydration and blending suggestions are product-specific. The page showed sold-out status at review; it does not establish a universal milling specification or a reusable substitution. |
| **WP02-A-FLOUR-GAP-R206-20261016-S03** | Canadian Grain Commission, [Grains regulated under the Canada Grain Act](https://www.grainscanada.gc.ca/en/protection/payment/grains-regulated.html), list of regulated grains and examples of unregulated crops. | Lists spelt among crops not regulated under the Act. This means the reviewed source does not provide a Canadian Grain Commission spelt grade; it does not establish the absence of every other standard or market convention. |
| **Reused `WP02A4-SP-S01`** | OQLF, [épeautre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354125/epeautre), base French term, English equivalent, and botanical entry. | Reused from `ingredient-ref-spelt-flour`; the same source ID is also attached to `ingredient-ref-malted-spelt-flour`. It supports `épeautre / spelt` and the underlying spelt identity, not a full French flour-grade term. |
| **Reused `WP02-A4-WBF-20261011-S03`** | Health Canada, [Whole Grains — Get the Facts](https://www.canada.ca/en/health-canada/services/canada-food-guide/resources/healthy-eating-recommendations/eat-a-variety/whole-grain/get-facts.html), whole-grain and refined-grain explanations. | Reused from `ingredient-ref-whole-barley-flour`. It explains the general whole-grain concept (bran, endosperm, and germ) and refined-grain distinction; it is not a spelt-specific grade standard. |

## Local evidence references

- Active plan: [WP02 Section A open item](../../RecipeBook-global-ingredient-catalog-plan.txt#L1424).
- Existing base identity and its unresolved extraction boundary: [spelt-flour identity note](../batches/spelt-flour-identity.md).
- Related completed boundary work: [R147 WP02 proposal](wp02-a-regional-wheat-flour-residual-review-r147-20261015.md), [R170 spelt-berries recheck](wp03-section-f-spelt-berries-current-evidence-recheck-r170-20261016.md).
- Active references, forms, substitution rules, contextual substitution rules, research ledger, recipe manifest, and recipe files were inspected read-only for ownership and demand.
