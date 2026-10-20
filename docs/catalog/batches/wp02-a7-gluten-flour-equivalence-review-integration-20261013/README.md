# WP02 A7 gluten-flour equivalence review integration — 2026-10-13

Integrated the [gluten-flour class boundary review](../../proposals/wp02-a7-gluten-flour-vital-wheat-gluten-equivalence-review-20261013.md).

## Decision

Keep the existing `gluten flour` / `farine de gluten` aliases on `ingredient-ref-vital-wheat-gluten` for the specific Canadian product evidence already reviewed. Do not infer that every product within the CFIA `Gluten Flour` compositional class has Codex's vital-wheat-gluten functionality or composition. CFIA defines the class by partial starch removal and caps starch and moisture; Codex distinguishes vital, devitalized, and solubilized wheat-protein products by hydrated function and composition. OQLF's term pair defines the named class but does not specify vital properties.

Root reopened the current CFIA standard, OQLF's entries for `farine de gluten` and `gluten de froment élastique`, and the FAO-hosted Codex CXS 163-1987 text. The standards support keeping the broader equivalence question bounded. A Canadian `Gluten Flour` product whose declared ingredient is vital wheat gluten remains SKU-specific evidence, not a universal class rule.

## Catalog and numeric limits

No active reference, alias, form, recipe link, conversion, yield, density, unit mapping, or substitution changed. New Codex, manufacturer, and retailer evidence and a bounded unresolved finding were added to the existing `ingredient-ref-vital-wheat-gluten` research-ledger record; the existing CFIA, OQLF, and Metro source IDs were reused. Product-specific 1/4 cup (30 g) and package observations were not promoted to reusable measures. The recipe corpus has no matching demand.

## Integration status

- Ingredient references: 1,383; forms: 100; legacy candidates: 63.
- Research ledger: 1,715 records.
- No seed package or generated index change was needed.
- No app tests or emulator checks were run because this batch only changes database JSON and documentation.

WP02 A7 remains open.
