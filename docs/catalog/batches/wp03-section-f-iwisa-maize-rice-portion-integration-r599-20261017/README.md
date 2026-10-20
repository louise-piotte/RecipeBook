# WP03 Section F R599 — Iwisa maize-rice serving

Date: 2026-10-17

## Decision

Added one `portion_weight` observation to the existing `ingredient-ref-south-african-maize-rice` ledger record: Premier FMCG’s Iwisa No.1 Maize Rice has a manufacturer-declared single serving of 50 g, uncooked. This is specific to that named product; it is not a generic maize-rice portion.

Kept `measurementState: researched_no_supported_value` for reusable household measures, `defaultDensity: null`, and `unitMappings: []`. Narrowed R55’s earlier “no household measure” decision wording to make clear that it concerns reusable/general measures; this label serving does not give a cup amount or volume. The French display remains provisional and unchanged. No alias, form, density, mapping, conversion, cooking yield, recipe link, or substitution was added.

## Evidence

- Premier FMCG, [Iwisa No.1 — Maize Rice](https://foodservices.premierfmcg.com/OurProducts/IwisaMaizeRice): the official manufacturer product page states “Single serving: 50 g maize rice (uncooked)” and pairs nutrition per 100 g of packed product with per single serving (50 g). It lists package formats separately. The page does not give a household volume, kitchen fill method, or preparation yield.
- The existing [R55 maize-rice identity review](../../proposals/wp03-section-f-south-african-maize-rice-identity-review-20261013-r55.md) and [integration README](../wp03-section-f-south-african-maize-rice-identity-integration-20261013/README.md) retain the distinction from samp, maize grits, maize flour, cornmeal, and rice grain. Their sources continue to support the identity and provisional French wording only.

The bundle has no direct maize-rice links or matching product/ingredient rows among 114 recipes and 1,123 structured ingredient rows. The source contributes bounded catalog evidence, not bundled recipe demand.

See the [R599 proposal](../../proposals/wp03-section-f-next-gap-review-r599-20261017.md), the [regional cereal and preprocessed-grain checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L4525), and the broader [Section F review](../../../RecipeBook-global-ingredient-catalog-plan.txt#L14968). Both parent checklist items remain open.

## Static verification

Research-ledger schema validation, source ID/URL ownership, bundled package validation, reference normalization, generated-index freshness, UTF-8/no-BOM, local-link, and scoped whitespace checks passed. No app tests, build, emulator check, or deployment were needed because this change only adds database JSON and tracking documentation under `AGENTS.md`.
