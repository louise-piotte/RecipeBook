# WP02 B3 water-chestnut flour current-label boundary review R603

- **Status:** integrated as a source update and continued hold.
- **Scope:** recheck current Montréal wording for water-chestnut flour and the search boundary between whole-corm flour, extracted *Eleocharis dulcis* starch, and dried-fruit *Trapa* flour.
- **Decision:** keep `candidate-water-chestnut-flour` unresolved. Do not add a generic reference or alias to `ingredient-ref-chinese-water-chestnut-starch`.

## Findings

Marché ShengTai, a Montréal retailer, currently lists `Pure Water Chestnut Flour / 纯正马蹄粉`, 250 g, product code `GPWCF`. The page gives no French product name, botanical source, ingredient declaration, or processing description. It therefore adds Québec-market evidence for the ambiguous English wording, but does not establish whether the product is whole-corm flour or extracted starch. The source page also displays a temporary-closure notice, so this review makes no claim about current purchase availability.

The prior boundary evidence remains controlling: the *Eleocharis dulcis* study describes whole-corm flour separately from aqueous-extracted starch, while the India National Agriculture Market definition uses “water chestnut flour” for dried *Trapa* fruits. The Montréal product title does not resolve either boundary.

Do not add a product-name alias to the active Chinese water-chestnut-starch row. The search implementation first prefers complete phrases, then falls back to substring matching (`IngredientSearch.kt`). An alias such as `Pure Water Chestnut Flour` would contain the generic query `water chestnut flour`; the fallback would make that broad query select the starch row alone even though the catalog evidence leaves several products unresolved. No safe product-matched Québec French wording was found.

The bundled recipe JSON contains no matching water-chestnut-flour phrase. No reference, alias, form, measurement, unit mapping, recipe link, conversion, yield, or substitution changed. The candidate remains `needs_clarification`; no generic measurement or substitute is supported.

## Source added

| Source ID | Source | Supports |
|---|---|---|
| `WP02-B3-WATER-CHESTNUT-20261018-R603-S01` | Marché ShengTai, [Pure Water Chestnut Flour / 纯正马蹄粉, 250 g](https://www.marcheshengtai.ca/Pure-Water-Chestnut-Flour.html), accessed 2026-10-18. | Current Montréal product wording, product code `GPWCF`, and package size. The page provides no French name, botanical source, ingredient declaration, or processing method; it also shows a temporary-closure notice. |

## Integration

The source and the rejected alias decision were added to the existing `candidate-water-chestnut-flour` research-ledger record. The Section B3 checklist and roadmap now point to this review. No app tests, build, emulator run, or deployment were run because this update only adds evidence and review data to the database JSON files, under `AGENTS.md`.
