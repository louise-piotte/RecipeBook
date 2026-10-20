# WP02 Section A7 barley-grits serving review — R638 — 2026-10-18

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Accepted and integrated 2026-10-18. The existing barley-grits ledger row now includes the refreshed manufacturer source, two retailer-transcribed label sources, one product-specific portion observation, and an accepted decision; the active reference and app code are unchanged.
- **Plan anchor:** WP02 Section A7 remains open for other grain meals and milling products in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2094). The existing `ingredient-ref-barley-grits` identity was added in R412 with no measurement observation.
- **Scope:** Review one product-label portion for the existing barley-grits identity. Do not reopen its identity or French display, or add a general measure or substitution.
- **Avoided prior reviews:** R605 reviewed toasted stone-cut wheat meal; R624 wheat germ; R628 wheat bran; R631 Scottish oatmeal; and R635 durum semolina. This proposal covers the distinct existing barley-grits row and its previously unfilled measurement evidence.

## Recommendation

Update only the existing `ingredient-ref-barley-grits` research-ledger record:

- Set `measurementState` to `researched_supported` and append one product-specific `portion_weight` observation for Shiloh Farms Organic Barley Grits, UPC `047593213110`: **1/4 cup dry (48 g)**.
- Refresh its existing manufacturer source S01 to reflect the current product page and its linked nutrition-label image. Add two retailer source records that transcribe the same UPC's label portion.
- Preserve `substitutionResearchState: researched_no_supported_substitute`, which R412 already established. Keep the active reference unchanged: `defaultDensity: null`, `unitMappings: []`, and no new aliases or forms.

**Active numeric behavior supported:** none. The ledger observation is evidence for one named product label only. It does not support an active density, unit mapping, conversion, general barley-grits measure, recipe link, or substitution rule.

## Source evidence and limits

| Source | Evidence | Limits |
|---|---|---|
| [Shiloh Farms, Barley Grits, Organic](https://shilohfarms.com/barley-grits-organic/) (existing S01) | The manufacturer identifies its product as barley grits, says it is made from hulled barley cut into six pieces, lists organic whole-grain barley as the ingredient, and links a Nutrition Information label image. | The page text gives conflicting 46 g and 48 g **whole-grain-per-serving** claims. Those are not stated as the dry product serving mass and must not be used as such. The page text does not transcribe the label's serving size. |
| [Vitacost, Shiloh Farms Organic Barley Grits, 12 oz (340 g)](https://www.vitacost.com/products/shiloh-farms-organic-barley-grits-12-oz-340-g-158301) (new S01) | Lists UPC `047593213110` and transcribes Nutrition Facts as `1/4 cup dry (48 g)`. | This is a retailer transcription of the package label, not an independent weighing. It does not state cup capacity or a fill method. |
| [iHerb, Shiloh Farms Organic Barley Grits, 12 oz (340 g)](https://ng.iherb.com/pr/shiloh-farms-organic-barley-grits-12-oz-340-g/158301) (new S02) | Lists the same UPC and transcribes the same Nutrition Facts serving, `1/4 cup dry (48g)`. The listing says products are sourced from brands or authorized distributors and excludes third-party resellers. | It is also a retailer transcription, not an independent weighing; its page notes product images or information may lag manufacturing changes. The two retail pages may share product-feed data, so they corroborate a reported label portion but are not replicate measurements. |

The bounded result is suitable as a published product-label portion because the two retailer listings identify the same product by UPC and report the same dry serving. Keep it tied to that UPC. Do not infer the portion from the manufacturer's separate 46 g / 48 g whole-grain claims, or generalize it to other barley grits.

## Ownership, picker, and recipe-demand audit

| Surface | Current state | R638 disposition |
|---|---|---|
| Active identity | `ingredient-ref-barley-grits`, `barley grits / gruau d'orge`, category `GRAIN_AND_CEREAL`; both alias lists empty; density null; mappings empty. | Leave all catalog fields unchanged. Exact-name ownership belongs to this one row. |
| Source and ID ownership | Before integration, the manufacturer URL belonged to this row as `WP02-A7-BARLEY-GRITS-R412-20261017-S01`; the retailer URLs and R638 source/observation IDs were unowned. | The existing manufacturer source is refreshed, and the two named retailer pages and one observation are now attached to this row. No ingredient identity was created. |
| Forms, rules, and yields | No matching ingredient form, global or contextual substitution rule, or package-yield record is attached to the barley-grits identity. | No form, rule, yield, or recipe link is proposed. Preserve the existing no-supported-substitute state. |
| Picker effect | The display names and aliases remain unchanged, and the ledger is research-only. | No picker result or active numeric behavior changes. |
| Bundled recipe demand | Parsed all 114 recipe JSON files and 1,123 structured ingredient rows. No reference-ID or barley/grits term match was found. The only substring `orge` occurs in an unrelated French instruction in recipe 049, not an ingredient line. | No recipe link or recipe edit. There is no bundled recipe demand for this identity. |

The R638 source IDs `WP02-A7-BARLEY-GRITS-SERVING-R638-20261018-S01` and `...-S02`, observation ID `barley-grits-shiloh-upc-047593213110-quarter-cup-48g-r638-20261018`, and proposal path were confirmed unowned/absent before integration.

## Exact integrated ledger delta

The following delta was merged into the existing ledger record `ingredient-ref-barley-grits`. All other source records and the R412 decision were retained.

1. Set `measurementState` to `researched_supported`.
2. Replace source `WP02-A7-BARLEY-GRITS-R412-20261017-S01` with the refreshed object below, then append the two new retailer sources.

```json
[
  {
    "sourceId": "WP02-A7-BARLEY-GRITS-R412-20261017-S01",
    "url": "https://shilohfarms.com/barley-grits-organic/",
    "title": "Shiloh Farms, Barley Grits, Organic",
    "accessedOn": "2026-10-18",
    "locator": "Product description, ingredients, cooking directions, and linked Nutrition Information label image.",
    "supports": "The manufacturer identifies its product as barley grits made from hulled barley cut into six pieces and lists organic whole-grain barley as the ingredient. The page links a Nutrition Information label image, but its text gives conflicting 46 g and 48 g whole-grain-per-serving claims without transcribing the dry serving mass; do not use either claim as a measure.",
    "sourceKind": "manufacturer"
  },
  {
    "sourceId": "WP02-A7-BARLEY-GRITS-SERVING-R638-20261018-S01",
    "url": "https://www.vitacost.com/products/shiloh-farms-organic-barley-grits-12-oz-340-g-158301",
    "title": "Vitacost, Shiloh Farms Organic Barley Grits, 12 oz (340 g), UPC 047593213110",
    "accessedOn": "2026-10-18",
    "locator": "Product identification and Nutrition Facts serving size.",
    "supports": "The retailer listing identifies the Shiloh Farms 12 oz (340 g) product by UPC 047593213110 and transcribes its Nutrition Facts serving as 1/4 cup dry (48 g). This records a retailer-reported manufacturer-label portion only; no cup capacity, fill method, or independent weighing is provided.",
    "sourceKind": "other"
  },
  {
    "sourceId": "WP02-A7-BARLEY-GRITS-SERVING-R638-20261018-S02",
    "url": "https://ng.iherb.com/pr/shiloh-farms-organic-barley-grits-12-oz-340-g/158301",
    "title": "iHerb, Shiloh Farms Organic Barley Grits, 12 oz (340 g), UPC 047593213110",
    "accessedOn": "2026-10-18",
    "locator": "Product code SHH-21311, UPC, and Nutrition Facts serving size.",
    "supports": "The retailer listing identifies the same 12 oz (340 g) product by UPC 047593213110 and transcribes its Nutrition Facts serving as 1/4 cup dry (48 g). iHerb says the product is sourced from brands or authorized distributors and excludes third-party resellers, while noting its page information may lag package changes. This is retailer-transcribed label evidence, not an independent weighing.",
    "sourceKind": "other"
  }
]
```

3. Append this one observation. Its source IDs are the two retailer transcriptions; the manufacturer source is retained for product identity and the label-image link, not as textual evidence of the 48 g mass.

```json
{
  "observationId": "barley-grits-shiloh-upc-047593213110-quarter-cup-48g-r638-20261018",
  "relationship": "portion_weight",
  "value": 48,
  "valueUnit": "g",
  "foodDescription": "Shiloh Farms Organic Barley Grits, 12 oz (340 g), UPC 047593213110, as listed by Vitacost and iHerb.",
  "foodState": "Dry barley grits as sold, before cooking; both retailer listings label the serving as dry.",
  "measurementMethod": "Vitacost and iHerb transcribe the product Nutrition Facts serving as 1/4 cup dry (48 g). Neither listing reports an independent fill-and-weigh method; the pages may share product-feed data.",
  "quantityBasis": "One named Shiloh Farms UPC label serving only. Cup capacity and filling method are unspecified; this is not a generic barley-grits measure, density, or volume conversion.",
  "sourceQuantity": {
    "amount": 0.25,
    "unit": "cup",
    "unitConvention": "Retailer-transcribed label serving; cup capacity and fill or leveling method are not stated."
  },
  "observedMassG": 48,
  "evidenceKind": "published_portion",
  "sourceIds": [
    "WP02-A7-BARLEY-GRITS-SERVING-R638-20261018-S01",
    "WP02-A7-BARLEY-GRITS-SERVING-R638-20261018-S02"
  ]
}
```

4. Append this decision and retain `substitutionResearchState: researched_no_supported_substitute`:

```json
{
  "outcome": "accepted",
  "reason": "Record one published product-label portion, 1/4 cup dry (48 g), for Shiloh Farms Organic Barley Grits UPC 047593213110. Vitacost and iHerb transcribe the same named product label; these are not replicate weighings. The manufacturer page confirms the product identity and hulled-barley description but its separate whole-grain-per-serving text conflicts and is not used as a serving mass. Keep defaultDensity null, unitMappings empty, substitution research unchanged, and active catalog behavior, picker data, forms, conversions, yields, and recipe links unchanged.",
  "sourceIds": [
    "WP02-A7-BARLEY-GRITS-R412-20261017-S01",
    "WP02-A7-BARLEY-GRITS-SERVING-R638-20261018-S01",
    "WP02-A7-BARLEY-GRITS-SERVING-R638-20261018-S02"
  ]
}
```

## Static review checks

- Read `AGENTS.md`, relevant `Requirements.md` rules, the current roadmap and A7 checklist, active reference and research-ledger records, research-ledger schema, and prior A7 proposal history.
- Confirmed that the target is the existing verified barley-grits identity, with no measurement observation before R638 and an existing R412 no-supported-substitute result.
- Audited source and ID ownership across the ledger: the manufacturer URL/S01 is already owned by this row; both retailer URLs, the two proposed source IDs, and the observation ID are unowned. Confirmed the proposal path was absent.
- Checked active name/alias ownership, ingredient forms, global and contextual rules, and package-yield records. The proposal changes only ledger research evidence.
- Parsed the 114 bundled recipes (1,123 ingredient rows); found no barley-grits name, related barley meal/flour/semolina term, or target reference ID in recipe ingredient data.
- Checked the proposed source and observation objects against `docs/catalog/research-ledger.schema.json`. The reported 48 g is source-published for one product serving; no value is calculated or generalized.
- Static validation passed after integration: the ledger schema reports 2,200 records with zero errors, source and observation IDs are unique, and the package/index checks remain current. No software tests, build, emulator run, or deployment were needed because this update only adds database JSON evidence under `AGENTS.md`. See the [R638 integration README](../batches/wp02-a7-barley-grits-measurement-integration-r638-20261018/README.md).
