# WP04 Section P R194 — Mussels in Escabeche Integration

- **Status:** Integrated as one identity-only packed-food reference.
- **Reference:** `ingredient-ref-mussels-in-escabeche` — `canned mussels in escabeche / conserve de moules à l’escabèche`, category `PROTEIN`.
- **Decision:** Keep the product group separate from mussel species, smoked mussels, Sardo herb-and-garlic marinated mussels, and fresh mussels marinated at home.
- **Data scope:** No aliases, forms, recipe links, density, unit mappings, measurements, yields, conversions, or substitutions. Product species, sauce formulas, storage state, package quantities, and drained amounts remain SKU-specific.

## Evidence

Current Canadian retail listings support a packed mussel product prepared in escabeche. Berchicci’s Québec-facing Cantara listing describes a 110 g product in a lightly acidic escabeche sauce. Luisa Paixao’s Canadian French listing uses the exact display wording `Conserve de moules à l’escabèche` for a 110 g Ati Manel product. Spanish Pig lists La Curiosa mussels as hand-packed in a can after frying and covered with escabeche marinade. Usito confirms Québec French spelling and culinary meaning. Metro’s `Moules à l’escabèche` recipe is fresh shell mussels cooked, marinated, chilled, and served in shells; it stays outside this packaged identity.

The formulations vary by SKU. No package mass, declared mussel percentage, or `6/8` size grade provides a reusable drained yield, kitchen measure, or count-to-mass conversion. No reviewed source or bundled recipe supports a direction-specific substitution.

## Ownership and recipe demand

Before integration, exact normalized searches across active references, form labels and match terms, legacy candidates, the research ledger, and proposal/archive IDs found no owner for the proposed names or ID. The shared CFIA fish-labeling source was reused under its existing R159 source ID and URL. The five new R194 source IDs each map to one new URL.

The manifest-listed bundle contains 114 recipe files and 1,123 ingredient rows. Scanning ingredient data and recipe text found no escabeche product request. French `moules` occurrences refer to baking pans, not seafood ingredients. No recipe link was added.

## Integration details

- Added one bilingual `PROTEIN` reference with no aliases and null density.
- Added one `ingredient_reference` research-ledger record with verified identity, no supported measurement value, and no supported substitute.
- Reused the CFIA label source already recorded under R159; its URL and source ID remain unchanged.
- Updated the Section P checklist and roadmap; the broader category checklist remains open.

## Verification

Static data checks passed: bundled seed normalization and validation, ingredient-reference normalization, generated catalog freshness, research-ledger schema validation, new/reused source-ID and URL ownership, exact-name ownership, picker projection, full recipe corpus scan, UTF-8/no-BOM and mojibake checks, local-link checks, and scoped whitespace checks. The integrated totals are **1,574 references**, **122 forms**, and **1,919 ledger records / 8,281 source entries / 7,064 distinct source IDs / 5,854 distinct URLs**.

No software tests or emulator checks were run because this batch only adds database JSON data, as specified in `AGENTS.md`.

See the [R194 proposal and source register](../../proposals/wp04-section-p-mussels-in-escabeche-product-identity-review-r194-20261016.md).
