# WP02 Section A7 Scottish-oatmeal serving-weight review — R631 — 2026-10-18

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Accepted and integrated on 2026-10-18. The accepted ledger delta is recorded in the [R631 integration README](../batches/wp02-a7-scottish-oatmeal-portion-integration-r631-20261018/README.md).
- **Plan anchor:** Section A7 remains open for grain-meal and milling-product review in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2094). The existing `ingredient-ref-scottish-oatmeal` has a verified identity but its measurement and substitution research states remain `not_yet_researched`.
- **Scope:** Record one current manufacturer-label serving for the existing Scottish-oatmeal identity. Do not reopen its name, generic oatmeal boundary, or oat-grits hold. Do not review or add a substitution.
- **Avoided prior work:** R605 held the separate toasted wheat-meal candidate; R624 reviewed wheat germ; and R628 reviewed wheat bran. This review concerns the distinct, already active Scottish-oatmeal identity and its still-open serving-weight field.

## Recommendation

Update only the existing `ingredient-ref-scottish-oatmeal` research-ledger record:

- Set `measurementState` to `researched_supported` and append one manufacturer-label `portion_weight` observation: **Bob’s Red Mill Scottish Oatmeal, 1/4 cup (36 g)**.
- Refresh the existing Bob’s Red Mill English and Canadian French source entries, `WP02-SCOTTISH-OATMEAL-20261011-S02` and `...-S03`, with the current serving-size locator and the 2026-10-18 access date. Reuse these existing IDs; create no new source ID.
- Keep `substitutionResearchState: not_yet_researched`, `defaultDensity: null`, and `unitMappings: []`. Add no form, conversion, yield, recipe link, alias, or runtime rule.

**Active numeric behavior supported:** none. The observation records one named product’s manufacturer-listed serving only. The two language pages show the same Bob’s Red Mill product and serving, so they are not independent product measurements. They do not establish a transferable Scottish-oatmeal measure, cup volume convention, fill method, default density, or active volume-to-mass mapping.

## Ownership, picker, and recipe-demand audit

| Surface | Current owner/state | R631 disposition |
|---|---|---|
| Active reference | `ingredient-ref-scottish-oatmeal`, `Scottish oatmeal / gruau écossais`, category `GRAIN_AND_CEREAL`; English aliases `Scotch oatmeal` and `Scottish oats`; no French aliases; density null; mappings empty. | Keep unchanged. Exact English and French names and both aliases resolve to this row alone. |
| Source ownership | The English and Canadian French Bob’s Red Mill product URLs already appear on this row as S02 and S03. The same URLs also appear on the separate `candidate-dry-oat-meal` record under `DOAM-20261011-S02` and `...-S03`. | Reuse the target row’s existing S02/S03 IDs and update only those entries on the Scottish-oatmeal row. Do not add a third source ID or alter the generic-oat-meal candidate. |
| Other active data | No Scottish-oatmeal form, global or contextual substitution rule, or package-yield record is attached. | Add none. Leave the substitution research state open. |
| Picker effect | No names or aliases change. The exact Scottish/Scotch product labels remain on the existing row; generic `oatmeal` and `oat meal` remain outside its aliases. | No picker change. Do not treat the new ledger observation as an alias or active measure. |
| Bundled recipe demand | Parsed all 114 recipe files listed in the current package manifest. None contains the reference ID, `Scottish oatmeal`, `Scotch oatmeal`, `Scottish oats`, or `gruau écossais` (accent-folded scan also found no match). | No recipe link or recipe edit. There is no bundled recipe demand for this identity. |

The proposed observation ID `scottish-oatmeal-bobs-red-mill-quarter-cup-36-g-r631-20261018` and the target proposal path were absent from the ledger and proposal/batch archive at review time.

## Current source evidence and limits

- Bob’s Red Mill’s current [Scottish Oatmeal product page](https://www.bobsredmill.com/product/scottish-oatmeal) describes stone-ground Scottish oatmeal and lists a Nutrition Facts serving size of **1/4 cup (36 g)** with `Whole Grain Oats` as the ingredient. The source does not state a cup convention or filling method. Reuse `WP02-SCOTTISH-OATMEAL-20261011-S02`.
- Bob’s Red Mill Canada’s [Gruau écossais product page](https://www.bobsredmill.ca/produit/gruau-ecossais) uses the existing French product name, describes stone grinding, and lists **1/4 tasse (36 g)**. It likewise gives no cup convention or filling method. Reuse `WP02-SCOTTISH-OATMEAL-20261011-S03`.
- Both pages refer to the same manufacturer product and report one matching package label. Retain one observation, not two separate or averaged measures. The values apply only to this named Bob’s Red Mill product; they do not establish a value for Arva Scotch Oatmeal, Scottish oatmeal generally, oat groats, oat flour, or generic oatmeal.

## Integrated ledger delta

The following merge operations were applied to `recordId: ingredient-ref-scottish-oatmeal`; this is an update to the existing ledger record, not a standalone record.

1. Set `measurementState` to `researched_supported`.
2. Replace the two existing source objects identified by S02 and S03 with the following objects. Preserve S01, S04, S05, the current identity decision, and all other row fields.

```json
[
  {
    "sourceId": "WP02-SCOTTISH-OATMEAL-20261011-S02",
    "url": "https://www.bobsredmill.com/product/scottish-oatmeal",
    "title": "Bob's Red Mill, Scottish Oatmeal",
    "accessedOn": "2026-10-18",
    "locator": "Product description, Nutrition Facts serving size, and ingredient statement.",
    "supports": "The current manufacturer page describes stone-ground Scottish oatmeal, identifies whole grain oats, and lists a serving size of 1/4 cup (36 g). This is a portion for the named product only; the page does not specify a cup convention or fill method.",
    "sourceKind": "manufacturer"
  },
  {
    "sourceId": "WP02-SCOTTISH-OATMEAL-20261011-S03",
    "url": "https://www.bobsredmill.ca/produit/gruau-ecossais",
    "title": "Bob's Red Mill Canada, Gruau écossais",
    "accessedOn": "2026-10-18",
    "locator": "French product name and description, Valeur nutritive serving size, and ingredient statement.",
    "supports": "The current Canadian French manufacturer page uses the product name gruau écossais, describes stone grinding, identifies whole-grain oats, and lists a serving size of 1/4 tasse (36 g). This is the same named product label as the English page, not an independent measurement; the page does not specify a cup convention or fill method.",
    "sourceKind": "manufacturer"
  }
]
```

3. Append this single observation:

```json
{
  "observationId": "scottish-oatmeal-bobs-red-mill-quarter-cup-36-g-r631-20261018",
  "relationship": "portion_weight",
  "value": 36,
  "valueUnit": "g",
  "foodDescription": "Bob's Red Mill Scottish Oatmeal / gruau écossais, as named on the manufacturer's English and Canadian French product pages.",
  "foodState": "Manufacturer-listed product serving; the page does not explicitly describe preparation state or filling method.",
  "measurementMethod": "The manufacturer Nutrition Facts panels list a serving size of 1/4 cup (36 g) in English and 1/4 tasse (36 g) in Canadian French.",
  "quantityBasis": "One named Bob's Red Mill product label only. Do not generalize to other Scottish oatmeal products or derive a default density or active unit mapping.",
  "sourceQuantity": {
    "amount": 0.25,
    "unit": "cup",
    "unitConvention": "The manufacturer pages do not state the cup volume convention."
  },
  "observedMassG": 36,
  "evidenceKind": "manufacturer_label",
  "sourceIds": [
    "WP02-SCOTTISH-OATMEAL-20261011-S02",
    "WP02-SCOTTISH-OATMEAL-20261011-S03"
  ]
}
```

4. Append this decision:

```json
{
  "outcome": "accepted",
  "reason": "Record Bob's Red Mill's 1/4 cup (36 g) serving as a product-specific manufacturer-label portion for the verified Scottish-oatmeal identity. The English and Canadian French product pages show the same label, not independent measurements. Keep defaultDensity null, unitMappings empty, substitution research unreviewed, and all active references, forms, conversions, yields, picker names, recipe links, and runtime rules unchanged.",
  "sourceIds": [
    "WP02-SCOTTISH-OATMEAL-20261011-S02",
    "WP02-SCOTTISH-OATMEAL-20261011-S03"
  ]
}
```

## Static review checks

- Read the root `AGENTS.md`, relevant `Requirements.md` data-model rules, active A7 plan item, current reference and ledger row, research ledger schema, and R605/R624/R628 plus neighboring A7 proposal history.
- Confirmed the identity is distinct from the held wheat-meal candidate and the already reviewed wheat-germ and wheat-bran records.
- Checked source ID and URL ownership in the active ledger. Reused the existing S02/S03 entries already attached to this identity despite the older same-URL records on the separate generic-oat-meal candidate.
- Checked exact active names and alias ownership, forms, global/contextual rules, and package yields. No catalog or picker delta is proposed.
- Parsed the 114 manifest-listed recipe files and scanned the exact reference ID and product names; found no match.
- Checked the new observation ID and target path against the existing proposal and batch archive before integration. The database-JSON-only ledger update required no software tests under `AGENTS.md`; static package and ledger checks are recorded in the integration README.
