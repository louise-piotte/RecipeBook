# WP02 A6: `milo flour` picker hold (2026-10-13)

## Decision

Keep `milo flour` off the English aliases for `ingredient-ref-sorghum-flour`. OM Foods and other Canadian-facing flour listings support the qualified phrase on specific products. Under current search, though, adding that phrase would make a bare `milo` query return sorghum flour alone. Walmart Canada currently lists Milo as a chocolate-malt drink mix, and no active Milo beverage reference could provide a competing picker result.

The [round-four proposal](../../proposals/wp02-a6-next-regional-flour-gap-review-20261013-round4.md) records the source locators, exact query projections, recipe scan, and the limits of product-specific guidance. Keep the existing `jowar flour` alias and `sorghum flour / farine de sorgho` display. No French Milo term, separate identity, form, measurement, density, conversion, yield, recipe link, or substitution is added.

## Ledger record

Five new source records and one accepted picker-boundary decision were added to the existing `ingredient-ref-sorghum-flour` ledger record. Its identity remains verified; measurement and substitution research remain `not_yet_researched`. The decision records that the qualified flour phrase has product-level support but is unsafe as a picker alias while it captures bare `milo`.

The source package sizes are not kitchen measures. OM Foods showed “Notify Availability” during review, so no in-stock claim is recorded. Retailer guidance about combining sorghum flour with other flours has no defined recipe context or ratio; no substitution finding was added.

## Static verification

- The research ledger passed `docs/catalog/research-ledger.schema.json` validation.
- Focused assertions confirmed the five new source IDs appear once in the target record, the accepted decision cites them, and measurement/substitution states and observations remain unchanged.
- Static projection against current references and attached forms returns no result for `milo` or `milo flour`; appending only `milo flour` to the existing sorghum-flour alias list would make `milo` return that row alone. `milo drink mix` would remain unmatched.
- The 114-recipe / 1,123-row corpus scan found no milo or sorghum-flour demand.
- UTF-8 without BOM, mojibake markers, and scoped whitespace were checked for the ledger, proposal, batch note, plan, and roadmap.
- No app, unit, instrumentation, or emulator tests were run. The integration adds research data to the JSON ledger and changes no runtime catalog data.
