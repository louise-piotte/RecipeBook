# WP04 Section P Atlantic bonito identity integration (2026-10-12)

## Decision

Added identity-only `Atlantic bonito / bonite à dos rayé` for *Sarda sarda* as
`ingredient-ref-atlantic-bonito` in `PROTEIN`, with no aliases. OQLF normalizes the French species
name and identifies *Sarda sarda*; CFIA's Fish List independently pairs the qualified English and
French labels. CFIA also lists broader bonito/bonite wording for multiple taxa and a separate
Atlantic Bonito Tuna / Thon label. Keep those terms out of aliases, and keep this whole-fish identity
separate from dried bonito/katsuobushi.

## Product, picker, and recipe boundaries

- No current Québec retail product or bundled recipe request was established.
- The app's phrase search can show the qualified Atlantic bonito display for broad `bonito` and
  `bonite` searches. Those terms remain ambiguous and are not automatically linked to this identity.
- The manifest-listed corpus has no candidate-name matches across 114 recipes and 1,123 ingredient
  rows. No recipe links were added.
- Add no forms, measures, density, unit mappings, yields, conversions, or substitutions. Biological
  species descriptions do not establish culinary portions or edible yields.
- Existing dried-bonito/katsuobushi and tuna identities are unchanged.

The source register, prior-work boundary, full picker projection, and ownership audit are in the
[review proposal](../../proposals/wp04-section-p-next-gap-review-20261012-round3.md).

## Validation

- Seed package, reference, ledger, generated-index, alias-ownership, and picker-query checks passed.
- JSON text is UTF-8 without BOM, with non-ASCII French characters stored as Unicode escapes.
- No app tests or emulator checks were run because this change only adds database JSON data and its
  derived index entry.
