# WP02/WP03/WP04 R176 gap-review integration

**Integrated:** 2026-10-16

**Plan:** [Global ingredient catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)

**Reviewed proposals:** [Sacha Inchi flour boundary](../../proposals/wp02-b2-sacha-inchi-flour-process-boundary-review-r176-20261016.md), [Bistro Express brown-rice pouch boundary](../../proposals/wp03-section-f-ready-to-heat-brown-rice-boundary-review-r176-20261016.md), and [canned mackerel product boundary](../../proposals/wp04-section-p-canned-mackerel-boundary-review-r176-20261016.md).

## Integrated decisions

- **WP02 B2 — Sacha Inchi flour:** Held a generic flour identity and aliases outside the active catalog. Research distinguishes wet-extracted kernel cake from oil-pressed cake; the reviewed Canadian seller lists whole Sacha Inchi seeds as the powder ingredient, and no product-matched Québec French culinary-flour name was established. Keep both research products and seed powder distinct until consumer-product evidence resolves the intended flour.
- **WP03 Section F — ready-to-heat brown rice:** Held the BEN'S ORIGINAL Bistro Express 250 g pouch outside the active catalog. The product is a ready-to-heat branded SKU, while its English and Québec French titles contain the broad phrases `brown rice` and `riz brun`. Preserve generic brown rice, dry quick-cooking rice, and parboiled rice as separate owners. No recipe link, measure, yield, conversion, or substitution was added.
- **WP04 Section P — canned mackerel:** Added identity-only `canned mackerel / maquereau en conserve` as `ingredient-ref-canned-mackerel`, category `PROTEIN`. Québec and Canadian retail evidence supports the product-market wording; the CFIA sources demonstrate why no fish species is assigned. Keep the row separate from raw, species-qualified, and smoked mackerel. Add no `jack mackerel` alias, forms, measures, conversions, yields, recipe links, or substitutions. Package, cut, packing medium, and drained state remain product-specific. No bundled recipe demand was found.

## Source registration

- Added five new source records, S03–S07, to `ingredient-ref-canned-mackerel` for Provigo Québec, Brunswick’s brine and tomato-sauce products, OQLF’s `maquereau` entry, and Walmart Canada’s canned-mackerel category.
- Reused CFIA Fish List source `WP04-POLLOCK-MACKEREL-SPECIES-BOUNDARY-20261009-S06` and fish-labelling source `WP04-SALMON-TUNA-BOUNDARY-20261011-S01`. No duplicate source IDs or URLs were created.
- The Sacha Inchi and brown-rice holds remain proposal-only; no shared ledger entries were added for them.

## Static validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`, ingredient-reference normalization check, generated catalog freshness check, and research-ledger validation passed.
- Static picker projection confirmed exact `canned mackerel` and `maquereau en conserve` results resolve to the new product group; broad mackerel searches remain multi-result, and no species row gained a canned form or alias.
- The proposal audits cover all **114 manifest recipes / 1,123 ingredient rows** and found no R176 recipe text or direct links.
- UTF-8/no-BOM, escaped-Unicode database JSON, local Markdown links, and scoped whitespace checks passed.
- Totals: **1,551 references**, **120 forms**, **1,896 ledger records / 8,135 source entries / 6,952 distinct source IDs / 5,748 distinct source URLs**; **114 recipes / 1,123 ingredient rows**.
- No app, unit, instrumentation, emulator, build, deployment, or other software tests were run. The catalog addition is database JSON data under the updated `AGENTS.md` rule.

Broader WP02 A6, Section F, and Section P coverage remains open.
