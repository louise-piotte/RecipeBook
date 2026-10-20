# WP02 A6 R746 — teff-flour label measurement review — 2026-10-18

- **Status:** Integrated on 2026-10-18. One product-specific measurement observation and one accepted measurement decision were added to the existing teff-flour ledger row; active catalog behavior remains unchanged.
- **Checklist fit:** The broad [Section A6 item](../../RecipeBook-global-ingredient-catalog-plan.txt#L1832) remains open. The nested [R725 checkpoint](wp02-a6-next-gap-review-r725-20261018.md) left measurement research on `ingredient-ref-teff-flour` open; R746 now closes that product-label question. Its source audit notes that Bob’s Red Mill’s page labels a **¼ cup (35 g)** serving but R725 did not review or record it. R743 closes the separate fonio-flour measurement question; the current [R743–R745 checkpoint](../batches/wp02-wp03-wp04-r743-r745-gap-review-integration-20261018/README.md) does not review teff measurement.
- **Scope:** Record one current manufacturer-label portion for Bob’s Red Mill’s unqualified whole-grain teff flour. Do not reopen the R725 substitution review or transfer this product’s serving to ivory or brown teff flour.
- **Recommendation:** Add one source-specific `portion_weight` observation to the existing `ingredient-ref-teff-flour` ledger row for **¼ cup (35 g)**. Set `measurementState` to `researched_no_supported_value` for reusable generic measurement; the label does not state cup capacity or a flour fill/weigh method. Keep `defaultDensity` null, `unitMappings` empty, and all active catalog behavior unchanged.
- **Observation ID:** `teff-flour-bobs-red-mill-quarter-cup-35-g-label-r746-20261018` is now recorded on the existing `ingredient-ref-teff-flour` ledger row.

## Pre-integration row and scope boundary

The current package contains **1,848 ingredient references and 178 forms**. Its manifest lists **114 recipes and 1,123 ingredient rows**; the ledger contains **2,235 records**.

| Surface | Current state | R746 disposition |
|---|---|---|
| Active `ingredient-ref-teff-flour` | `teff flour / farine de teff`, `FLOUR_AND_STARCH`; no aliases; `defaultDensity: null`; `unitMappings: []`. | No active reference, name, alias, density, mapping, or form change. |
| Existing teff-flour ledger row | `identityState: verified`; `measurementState: not_yet_researched`; `substitutionResearchState: researched_supported`; zero measurement observations; R725’s Westpoint substitution finding is present. | Add only the label observation and an accepted measurement decision; preserve the R725 substitution state, finding, and decision. |
| Related identities and active behavior | Teff grain, ivory teff flour, and brown teff flour are separate references. No form, global/contextual substitution rule, or package yield targets generic teff flour. | Do not apply Bob’s Red Mill’s label portion to the other teff rows; add no form, conversion, yield, recipe link, or active rule. |

The matching evidence gap remains actionable: R725 recorded Westpoint’s scoped substitution finding and refreshed Bob’s Red Mill source `WP02-S91`, but kept measurement research open. That proposal explicitly states that the manufacturer page’s ¼-cup (35 g) portion was outside R725’s scope. Older A7 boundary proposals cite the same page for malted teff and teff meal; they do not add an observation to the generic A6 teff-flour row. R746 addresses only that unrecorded label serving.

## Primary source and measurement limit

Bob’s Red Mill’s current [Teff Flour product page](https://www.bobsredmill.com/product/teff-flour) identifies the product as **100% whole grain flour** and gives the Nutrition Facts serving size as **1/4 cup (35 g)**. The listed ingredient is Whole Grain Teff. The page is first-party manufacturer evidence; it does not provide a cup-volume convention, fill method, or direct weighing protocol. The declared serving supports one product-specific portion observation, not a bulk density, default density, generic cup mapping, or standard for other teff flours.

The page also contains manufacturer guidance about replacing part of white/all-purpose flour. That recommendation remains within the existing R725 source and decision; R746 does not alter or reinterpret it. No independent measurement or household-kitchen weighing study is used here.

## Source and identifier ownership

| Identifier | Current ownership | R746 action |
|---|---|---|
| `WP02-S91` | Existing ledger source on `ingredient-ref-teff-flour`, exact URL `https://www.bobsredmill.com/product/teff-flour`; its current support covers product identity and the manufacturer’s separate baking guidance. | Refresh this existing source in place: access date `2026-10-18`; locator includes product title, Description & Nutrition Info, Nutrition Facts serving size, and Ingredients; supports includes the ¼-cup (35 g) label portion and states that the label gives no cup capacity or flour fill/weigh method. Do not add another source record or source ID for this URL. |
| `teff-flour-bobs-red-mill-quarter-cup-35-g-label-r746-20261018` | Added to `ingredient-ref-teff-flour` during R746 integration. | Sole new measurement-observation ID; it remains product-specific. |

The official page was rechecked online on 2026-10-18. The product’s label amount is source-reported, not a direct weighing performed for this review. Keep its quantity basis and food description tied to Bob’s Red Mill’s unqualified whole-grain teff product. Do not transfer it to the distinct ivory- or brown-teff-flour identities.

## Integrated research-ledger delta

The integration updated only the existing `ingredient-ref-teff-flour` record:

1. Set `measurementState` to `researched_no_supported_value` for a reusable generic measure.
2. Refresh existing source `WP02-S91` in place as described above; preserve its identity and substitution support.
3. Append this product-specific observation:

```json
{
  "observationId": "teff-flour-bobs-red-mill-quarter-cup-35-g-label-r746-20261018",
  "relationship": "portion_weight",
  "value": 35,
  "valueUnit": "g",
  "foodDescription": "Bob's Red Mill Teff Flour, 100% whole grain teff, manufacturer-label serving",
  "evidenceKind": "manufacturer_label",
  "sourceIds": ["WP02-S91"],
  "sourceQuantity": {
    "amount": 0.25,
    "unit": "cup",
    "unitConvention": "Manufacturer-stated 1/4 cup; cup capacity and flour fill/weigh method are unspecified."
  },
  "observedMassG": 35,
  "quantityBasis": "One product-label serving for Bob's Red Mill Teff Flour; not a generic teff-flour conversion.",
  "measurementMethod": "Manufacturer Nutrition Facts declaration; no separate weighing method is stated."
}
```

4. Append one accepted decision citing `WP02-S91`: preserve the serving as evidence for this named product only; keep the reusable generic measure, density, and unit mappings unsupported because the label specifies no cup capacity or flour fill/weigh method.

Do not change `substitutionResearchState`, the R725 finding, the active ingredient reference, forms, substitution-rule files, package yields, or recipes. No source URL or new source ID is allocated.

## Picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) searches bilingual reference names, aliases, and form terms, preferring complete word phrases before substring fallback. R746 changes only ledger research, so current search results remain unchanged:

| Query | Current results | R746 projection |
|---|---|---|
| `teff flour` | Brown teff flour; ivory teff flour; generic teff flour | Same three, in the same order |
| `farine de teff` | Brown teff flour; ivory teff flour; generic teff flour | Same three, in the same order |
| `teff` | Brown teff flour; ivory teff flour; generic teff flour; teff grain | Same four, in the same order |
| `tef` | Teff grain | Same single result |
| `ivory teff flour` / `farine de teff ivoire` | Ivory teff flour | Same single result |
| `brown teff flour` / `farine de teff brun` | Brown teff flour | Same single result |

## Recipe-corpus scan

Scanned all **114 manifest-listed recipe files and 1,123 structured ingredient rows** for the teff flour, French flour, grain, and `tef` terms, plus the generic, ivory, brown, and grain reference IDs. Found zero file-text hits and zero ingredient-row hits. No bundled recipe supports an ingredient link, portion, conversion, or substitution; none is proposed.

## Review checks

- Re-read current `AGENTS.md`, the Section A6 plan item, R725 proposal, latest R743–R745 workflow/roadmap checkpoint, live references/forms/rules/yields, and the target ledger row.
- Verified the official manufacturer label page, existing `WP02-S91` URL ownership, zero current target measurements, and the unused observation ID. No new source record is proposed.
- Recomputed picker results from the active names, aliases, forms, and `IngredientSearch.kt` normalization/matching behavior.
- Scanned the full current manifest-listed recipe corpus; found no teff-related match.
- Checked this proposal’s relative links, UTF-8 without BOM, trailing whitespace, and mojibake markers. No software tests, build, emulator run, or deployment were performed.

Integration closes only the source-specific Bob’s Red Mill label-portion question; it establishes no reusable measure for generic teff flour. The broad Section A6 review remains open. See the [R746–R748 integration README](../batches/wp02-wp03-wp04-r746-r748-gap-review-integration-20261018/README.md).
