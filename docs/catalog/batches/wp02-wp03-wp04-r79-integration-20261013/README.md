# WP02 / WP03 / WP04 R79 integration (2026-10-13)

## Decisions

### WP02 B2 — watermelon seed flour

Added identity-only `ingredient-ref-watermelon-seed-flour`:

- English: `watermelon seed flour`
- French: `farine de graines de melon d’eau` (provisional descriptive wording)
- Category: `FLOUR_AND_STARCH`
- Aliases: none
- Default density: `null`; unit mappings: empty

Tradin lists milled watermelon-seed flour separately from whole kernels and defatted protein
powder. Beyond the Equator identifies a single-ingredient flour made from milled seed; Simple Mills
describes its own cold-milled seed flour. The French display uses the OQLF-supported Québec fruit
term `melon d’eau` with `graines`, but remains provisional pending independent Québec terminology
review or a Québec-facing flour label. Defatted/pomace flour remains a separate unresolved ledger
candidate. One paper's 0.146 g/mL observation is retained only in the ledger because its method
paragraph names cashew flour while its result identifies watermelon-seed flour. No reusable
measure, form, conversion, yield, recipe link, or substitution was added.

### WP03 Section F — puffed brown rice

Added identity-only `ingredient-ref-puffed-brown-rice`:

- English: `puffed brown rice`
- French: `riz brun soufflé`
- Category: `GRAIN_AND_CEREAL`
- Aliases: none
- Default density: `null`; unit mappings: empty

Yupik's sole-ingredient product and a Québec recipe support the qualified identity. Its 1 cup / 15 g
panel is recorded only as a Yupik SKU P31093 portion observation; the cup convention and fill method
are unknown. The unrelated recipe's 4-cup quantity has no mass or brand. The archived puffed-
Khorasan suggestion is recorded as unsupported for reusable substitution because it supplies no
replacement quantity or tested equivalence. No form, active measure, conversion, yield, recipe link,
or runtime substitution was added; generic puffed rice stays unchanged.

### WP04 Section P — Atlantic sea raven hold

Kept *Hemitripterus americanus* outside active references and the ledger. TERMIUM and Québec-facing
Exploramer support `sea raven / hémitriptère atlantique`, but no current Québec consumer product or
bundled recipe demand was found and a candidate-specific CFIA Fish List name was not verified.
Exploramer's Québec commercialization statement is kept separate from DFO's retained catch totals
for observed Maritimes halibut-directed trips. This is a scoped Québec market hold, not a claim that
the species is absent from commercial fishing. No aliases, forms, measures, recipe links, or
substitutions were added.

## Evidence and proposals

- [WP02 watermelon-seed flour proposal](../../proposals/wp02-next-flour-starch-gap-review-r79-20261013.md)
- [WP03 puffed brown-rice proposal](../../proposals/wp03-section-f-next-grain-review-r79-20261013.md)
- [WP04 Atlantic sea-raven proposal](../../proposals/wp04-section-p-next-seafood-gap-review-r79-20261013.md)

The manifest-ordered corpus contains 114 recipe files and 1,123 ingredient rows; none of the three
candidates has a matching bundled recipe line.

## Static verification

- The bundled seed package and research ledger were validated; reference normalization and the
  generated ingredient index were refreshed and checked.
- Source IDs, record IDs, reference links, candidate ownership, picker projections, recipe demand,
  UTF-8/no-BOM encoding, local links, and changed-file whitespace were checked.
- No app tests or emulator checks were run. The active application-data changes only add database
  JSON data, so the current `AGENTS.md` rule does not require tests. The seafood decision is
  documentation-only.

The WP02 B2, Section F, and Section P parent checklist items remain open.
