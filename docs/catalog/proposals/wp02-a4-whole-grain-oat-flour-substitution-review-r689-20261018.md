# WP02 Section A whole-grain oat flour substitution review — R689 — 2026-10-18

## Review record

- **Status:** Integrated on 2026-10-18. The ledger finding and documentation are recorded in the [R689–R691 integration README](../batches/wp02-wp03-wp04-r689-r691-gap-review-integration-20261018/README.md).
- **Scope:** The open substitution-evidence question for existing `ingredient-ref-whole-grain-oat-flour`. This does not reopen the generic oat-flour identity, R230's Québec French naming, R575's sprouted form, or the existing CNF portion observation.
- **Checklist anchor:** The open WP02 Section A flour-grade item to resolve oat/source-grain grades at [plan lines 1673–1695](../../RecipeBook-global-ingredient-catalog-plan.txt#L1673). The R575 proposal records the whole-grain parent row's `substitutionResearchState` as `not_yet_researched`.
- **Proposed source IDs:** `WP02-A4-WGOF-SUB-R689-20261018-S01` and `WP02-A4-WGOF-SUB-R689-20261018-S02`. Both IDs and canonical URLs were absent from the live ledger and archived proposals when checked.

## Recommendation

**Add one evidence-only, cookie-scoped substitution finding to the existing whole-grain oat-flour ledger row.** Bob's Red Mill identifies its product as whole-grain oat flour and gives both general partial-replacement guidance and a specific chocolate-chip-cookie recommendation: replace up to 20% of the all-purpose flour with oat flour, with a suggested ratio of 1/4 cup oat flour per 1 1/4 cups all-purpose flour. Its test article expects a softer bite, slightly reduced structure, and mild sweetness.

Set that ledger row's `substitutionResearchState` to `researched_supported` to reflect this supported recipe context. Keep the finding scoped to the named manufacturer's cookie guidance. Do not create a global or contextual runtime rule: the advice is brand-published, the bundled recipe library has no oat-flour demand, and the source does not establish behavior for other whole-grain oat flours or the sprouted form. Add no alias, form, recipe link, measure, density, unit mapping, conversion, yield, or recipe-line substitution.

Keep the current Québec French display `farine d'avoine entière` and the existing English/French aliases. Bob's source is English-only; it does not justify a French naming change or an OQLF terminology claim.

## Current ownership and picker effect

| Owner | Current data | Boundary |
|---|---|---|
| `ingredient-ref-whole-grain-oat-flour` | `whole grain oat flour / farine d'avoine entière`, category `FLOUR_AND_STARCH`; aliases `whole oat flour`, `oat flour, whole-grain`, and `farine d'avoine, grains entiers`; null default density and empty unit mappings. | Keep this as the evidence owner. Do not transfer the finding to the generic oat-flour row. |
| `ingredient-form-whole-grain-oat-flour-sprouted` | Existing `sprouted oat flour / farine d'avoine germée` form under the whole-grain row. | Do not transfer Bob's unsprouted product guidance to the sprouted form. |
| `ingredient-ref-oat-flour` | Separate generic `oat flour / farine d'avoine` row. | No data change. |
| `ingredient-ref-all-purpose-flour` | `all-purpose flour / farine tout usage`, with its existing aliases. | The finding names this as the replaced flour only in the bounded cookie context. |

No active global or contextual substitution rule references the whole-grain oat-flour row. R689 added ledger evidence only, so every picker result remains unchanged under [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt):

| Query | Before integration | After integration |
|---|---|---|
| `whole grain oat flour`; `farine d'avoine entière` | `ingredient-ref-whole-grain-oat-flour` | Same |
| `oat flour`; `farine d'avoine` | Generic oat flour and whole-grain oat flour | Same two references |
| `sprouted oat flour`; `farine d'avoine germée` | Whole-grain oat flour with its sprouted form hint | Same |
| `all-purpose flour`; `farine tout usage` | `ingredient-ref-all-purpose-flour` | Same |

## Bundled-recipe demand

Scanned all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**, including normalized recipe text and direct reference IDs. There are no whole-grain, generic, or sprouted oat-flour phrase hits and no direct links to either oat-flour reference. The bundle has no oat-flour recipe context or line to link. No recipe row or recipe data changed.

## Integrated ledger delta

On the existing `ingredient-ref-whole-grain-oat-flour` record, the integration appended the two source entries in the register below, set `substitutionResearchState` to `researched_supported`, and added the bounded finding shown here without creating an active substitution rule:

```json
{
  "findingId": "whole-grain-oat-flour-bobs-cookie-partial-ap-substitution-r689-20261018",
  "researchState": "researched_supported",
  "fromIngredientRefId": "ingredient-ref-all-purpose-flour",
  "replacements": [
    {
      "ingredientRefId": "ingredient-ref-whole-grain-oat-flour",
      "quantity": { "amount": 0.25, "unit": "cup" },
      "roleInCompound": "Bob's Red Mill cookie guidance: replace up to 20% of the all-purpose flour; source ratio is 1/4 cup oat flour per 1 1/4 cups all-purpose flour"
    }
  ],
  "context": "Bob's Red Mill's chocolate-chip-cookie guidance and product: partial replacement of all-purpose flour with its whole-grain oat flour.",
  "basis": "The current product page identifies this as whole-grain oat flour milled from whole-grain oat groats and recommends replacing up to 20% of flour in most baked goods. The cookie guide specifically recommends replacing up to 20% of all-purpose flour with oat flour and gives 1/4 cup per 1 1/4 cups all-purpose flour.",
  "adjustments": [],
  "expectedEffects": [
    "softer bite",
    "slightly reduced structure",
    "mild sweetness"
  ],
  "limitations": [
    "The numeric recommendation is source-specific to Bob's Red Mill whole-grain oat flour and its cookie guidance; it is not a universal oat-flour ratio.",
    "Do not transfer the finding to generic oat flour, the sprouted oat-flour form, or other products without matching evidence.",
    "The stated cup ratio is recipe guidance, not a mass ratio, kitchen conversion, or density.",
    "Do not infer a 100% replacement, a general rule for breads or other baked goods, or an active runtime substitution."
  ],
  "sourceIds": [
    "WP02-A4-WGOF-SUB-R689-20261018-S01",
    "WP02-A4-WGOF-SUB-R689-20261018-S02"
  ]
}
```

The integration kept `measurementState`, the existing CNF 6275 observation, all active references/forms, and both substitution-rule files unchanged. The product page also displays a 1/4-cup (30 g) label serving; that separate product portion was not added as a measurement observation.

## Source register and ownership

| Source ID | Current source and locator | Evidence and limit |
|---|---|---|
| `WP02-A4-WGOF-SUB-R689-20261018-S01` | Bob's Red Mill, [Whole Grain Oat Flour](https://www.bobsredmill.com/product/whole-grain-oat-flour), product description; accessed 2026-10-18. | Identifies its product as freshly milled from whole-grain oat groats and recommends replacing up to 20% of flour in most baked goods. This is manufacturer advice for the named product; it does not set a universal ratio or demonstrate every recipe type. |
| `WP02-A4-WGOF-SUB-R689-20261018-S02` | Bob's Red Mill, [Best Flour for Cookies: Ranked by Chew, Softness and Spread](https://www.bobsredmill.com/articles/flour-guide-for-the-best-chocolate-chip-cookies), section on Whole Grain Oat Flour; accessed 2026-10-18. | The manufacturer says to replace up to 20% of all-purpose flour with oat flour in a cookie recipe; its suggested ratio is 1/4 cup oat flour per 1 1/4 cups all-purpose flour. It describes the expected softer bite, slightly reduced structure, and mild sweetness. This is one brand's cookie guidance, not a tested bundled recipe or independent cross-brand finding. |

The two source IDs and canonical URLs have no current live-ledger owner and do not appear in the archived proposals. Existing OQLF, CNF 6275, Québec retailer, and One Degree sources remain owned by their current records and are not duplicated or repurposed for substitution evidence.

## Integration disposition

- Added S01 and S02 to the existing whole-grain oat-flour ledger row and set `substitutionResearchState` to `researched_supported`.
- Kept the finding evidence-only; no global or contextual runtime rule was added.
- Preserved the existing CNF observation, catalog terms, recipe corpus, and separate generic and sprouted oat-flour owners.
- Static package and ledger validation passed, including source-ID and URL ownership. No software tests were run for this database-JSON-only addition under `AGENTS.md`. See the [R689–R691 integration README](../batches/wp02-wp03-wp04-r689-r691-gap-review-integration-20261018/README.md).
