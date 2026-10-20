# WP03 Section F Koshihikari rice identity integration (R231)

## Integration

Added identity-only `ingredient-ref-koshihikari-rice` as `Koshihikari rice / riz Koshihikari` in
`GRAIN_AND_CEREAL`. MAFF names Koshihikari as a rice variety; UCANR lists it in its short-grain
table; and current Canadian and Montréal retailer listings attest to the variety-qualified product
name and French retail wording.

Kept the row separate from generic short-grain rice, Calrose, and the label-defined sushi-rice
category. Alias lists, forms, density, unit mappings, measures, conversions, cooking yields, recipe
links, and substitution rules remain empty. A scan of the 114 bundled recipes / 1,123 ingredient
rows found no Koshihikari demand.

## Evidence boundaries

- The proposed French display is supported by current Canadian and Montréal product titles; it is
  not presented as an OQLF-preferred cultivar term.
- Retail package sizes and brand-specific growing claims remain attached to their product listings.
- UCANR's short-grain class does not make `short-grain rice` an alias for Koshihikari.
- Use of Koshihikari in sushi-marketed products does not make the variety synonymous with sushi
  rice.

## Verification

Bundled-package validation and normalization, research-ledger validation, generated-index freshness,
UTF-8/no-BOM checks, and scoped whitespace checks passed. The generated Kotlin ingredient index now
contains 1,620 references. No app tests or emulator checks were run because this update only adds a
database identity and its generated data index under the current `AGENTS.md` rule.

## Sources and proposal

See the [R231 proposal](../../proposals/wp03-section-f-koshihikari-rice-identity-review-r231-20261016.md)
for source links and the full identity-boundary audit.
