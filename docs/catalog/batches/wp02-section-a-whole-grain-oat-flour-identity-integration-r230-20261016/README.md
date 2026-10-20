# WP02 Section A whole-grain oat flour identity integration (R230)

## Integration

Added identity-only `ingredient-ref-whole-grain-oat-flour` as `whole grain oat flour / farine d'avoine entière` in `FLOUR_AND_STARCH`. Kept it as a qualified grade beside the broader `oat flour / farine d'avoine` family, whose definition includes whole and non-whole oat flour.

Added only source-attested qualified aliases: `whole oat flour` and `oat flour, whole-grain` in English; `farine d'avoine, grains entiers` in French. The 20.0 g serving reported for CNF food code 6275 is stored as a source-specific portion observation only. It is not a recipe measure, density, unit mapping, or conversion. No forms, recipe links, yields, or substitutions were added. The 114-recipe corpus has no matching phrase or link to the generic oat-flour row.

## Evidence boundaries

- Health Canada distinguishes whole grains by retaining bran, endosperm, and germ; it does not specify the milling process for a named oat-flour SKU.
- CNF code 6275 provides a bilingual class name and a food-code-specific serving. The portion is not generalized to a kitchen measure.
- OQLF's broader `farine d'avoine` term includes whole and non-whole oat grains. The qualified French display is supported by Québec product naming, not described as an OQLF ruling.
- Product package sizes, organic claims, and baking guidance remain product-specific.

## Verification

Bundled package validation and normalization, research-ledger validation, generated-index freshness, UTF-8/no-BOM checks, and scoped whitespace checks passed. The generated Kotlin ingredient index now contains 1,621 references. No app tests or emulator checks were run because this change adds database identity and source-specific research data, with the matching generated search index, under the current `AGENTS.md` rule.

## Sources and proposal

See the [R230 proposal](../../proposals/wp02-section-a-whole-grain-oat-flour-boundary-review-r230-20261016.md) for source links, alias boundaries, and the full picker/corpus audit.
