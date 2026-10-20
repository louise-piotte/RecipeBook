# WP02 B2/B3 cereal-starch identity and boundary review (2026-10-13)

## Decision

- Add identity-only `barley starch / amidon d'orge` as `ingredient-ref-barley-starch` in
  `FLOUR_AND_STARCH`. The French display is a transparent provisional construction from OQLF's
  preferred `amidon` and its Québec term `orge`; it is not an exact OQLF compound entry or a
  current Québec package title.
- Keep `oat starch` and qualified oat-starch fractions outside the active catalog until a
  standalone human-food product boundary is established. Pilot fractions, laboratory isolates,
  and the reviewed personal-care supplier listing do not identify a stable general food product.
- Add five barley-starch sources and an accepted identity decision to the research ledger. Keep
  density null and unit mappings, aliases, forms, recipe links, conversions, yields, measures, and
  substitutions empty. EFSA's product specifications and exposure scenarios are not kitchen
  quantities.
- The 114-recipe / 1,123-row bundle has no barley- or oat-starch demand. No recipes were changed.

The full product boundary, picker projection, source limits, and study-specific numeric evidence
are in the [round-70 proposal](../../proposals/wp02-b2-b3-cereal-starch-gap-review-20261013-round70.md).

## Static validation

The bundled seed package validator and catalog generator were run after integration. The generated
index matches the reference JSON. UTF-8/no-BOM, source-ID uniqueness, ledger schema, exact-key,
recipe-corpus, local-link, and whitespace checks passed.

No app tests or emulator checks were run because the change only adds database JSON data and its
generated catalog index.

WP02 B2/B3 remains open.
