# WP03/WP05 R1061–R1062 generic ingredient integration

Reviewed 2026-10-19. This batch adds two source-supported generic culinary identities across plant foods and regional preserves. It does not expand any brand, product-line, flavour-family, SKU, retailer-variant, or commercial roster.

## Integrated identities

- **R1061 — Jackfruit seeds / graines de jacque:** Added the edible seed part of *Artocarpus heterophyllus* as a distinct identity from jackfruit fruit, brined young jackfruit, and the held seed-flour and seed-starch candidates. The French compound remains provisional for Québec. No cooked form, aliases, measures, recipe links, conversions, yields, or substitutions were added. Crop seed counts and source-recipe quantities remain source-specific.
- **R1062 — Matsumae-zuke:** Added `Matsumae-zuke (Hokkaido squid and kelp preserve) / matsumae-zuke (préparation marinée de calmar séché et de kombu du Hokkaidō)` as an identity-only regional preserved food. Keep it distinct from Nishin Zuke, plain squid, kelp, herring roe, fish pastes, and generic pickles. MAFF recipe amounts, optional additions, and marinating details remain source-specific. No aliases, forms, measures, recipe links, conversions, yields, or substitutions were added.

The proposal reviews contain exact ownership checks, source locators, identity boundaries, and evidence limits:

- [R1061 jackfruit-seed review](../../proposals/wp03-section-m-jackfruit-seeds-identity-review-r1061-20261019.md)
- [R1062 Matsumae-zuke review](../../proposals/wp05-section-w-matsumae-zuke-identity-review-r1062-20261019.md)

## Scope and preservation

The user’s rule applies across all ingredient types: generic ingredient diversity is the target. A queue item devoted only to brands, product lines, flavour families, SKUs, or retailer variants is out of scope because commercial-product counts do not add ingredient diversity; stop that line after recording the reason. Preserve existing branded rows. Do not delete or merge them into generic entries without reviewing transferability. Manufacturer pages may support generic identities when their evidence applies beyond the named product, while product-specific amounts and claims stay scoped to that product.

No roster-only item was pursued in these assignments. The active generic plan parents remain open for their other ingredient gaps.

## Static verification

- Bundled seed package normalization and validation passed.
- Generated ingredient catalog index was refreshed and its freshness check passed.
- Research-ledger schema validation and source ownership checks passed.
- Exact identity and recipe-demand checks found no existing jackfruit-seed or Matsumae-zuke owner or bundled recipe row.
- UTF-8 without BOM, package normalization, and scoped whitespace checks passed.
- Final snapshot: 2,068 active references, 205 forms, 2,473 ledger records, 11,525 source entries, 9,684 distinct source IDs, 55 legacy candidates, and 114 recipes / 1,123 ingredient rows.
- No software tests or Android emulator run was needed: application changes only add database JSON, as allowed by `AGENTS.md`.
