# WP02 Section A7 R638 — barley-grits label portion integration

- **Status:** Integrated 2026-10-18.
- **Proposal:** [R638 product-label review](../../proposals/wp02-a7-next-grain-meal-gap-review-r638-20261018.md).
- **Plan anchor:** WP02 Section A7 remains open for other grain meals and milling products.

## Ledger decision

Updated the existing `ingredient-ref-barley-grits` record. It now records one product-specific portion for Shiloh Farms Organic Barley Grits, 12 oz (340 g), UPC `047593213110`:

| Portion | Evidence |
| --- | --- |
| 1/4 cup dry (48 g) | Vitacost and iHerb transcribe the same named product's Nutrition Facts label. These are label reports, not independent weighings. |

The manufacturer confirms the product identity and links its Nutrition Information label image. Its page text gives 46 g and 48 g whole-grain-per-serving claims; those refer to whole-grain content and are not used as the dry serving mass. The two retailer pages may share product-feed data, so the ledger does not treat them as replicate measurements.

The ledger's measurement state is now `researched_supported`. The existing no-supported-substitute state remains unchanged. The active reference remains `barley grits / gruau d'orge` with null density and no unit mappings; no form, recipe link, conversion, yield, or substitution was added. The 114-recipe / 1,123-ingredient-row scan found no barley-grits demand.

## Verification

Static package normalization, generated-index freshness, ledger schema validation, source and observation ID ownership, recipe scan, local links, UTF-8/no-BOM, and scoped whitespace checks passed. No software tests, build, emulator run, or deployment were needed for this database-JSON-only evidence update under `AGENTS.md`.
