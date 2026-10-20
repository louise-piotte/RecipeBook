# WP04 Section P — bream and sea-bream market groups (R604)

## Integration

Added two identity-only, bilingual `PROTEIN` name groups:

- `ingredient-ref-bream-market-group`: `bream (name used for multiple fish species)` / `brème (nom utilisé pour plusieurs espèces de poissons)`.
- `ingredient-ref-sea-bream-market-group`: `sea bream (name used for multiple fish species)` / `dorade (nom utilisé pour plusieurs espèces de poissons)`.

The visible qualifiers preserve the broad name scope. The two groups remain separate; their names do
not assert that `bream / brème` and `sea bream / dorade` are synonyms. Both rows have no aliases,
taxon, forms, density, unit mappings, recipe links, measures, conversions, yields, or substitutions.
The species-specific gilthead-bream / dorade-royale candidate remains outside active data.

CFIA's Fish List shows bream and brème wording across multiple taxa and sea-bream / dorade wording
across multiple marine taxa. OQLF confirms the Québec-qualified term `dorade royale` for
*Sparus aurata*. These sources establish common-name boundaries, not recipe equivalence or current
retail availability. The proposal records the full evidence, picker projection, source limits, and
ownership review.

The manifest-listed corpus has no matching phrase among 114 recipes or 1,123 ingredient rows.
Accordingly, no recipe link or numeric/substitution behavior was added. The Section P parent remains
open.

## Verification

The bundled seed-package and research-ledger validator passed; the ingredient-reference normalizer
and generated-index checks passed with 1,817 references. The manifest corpus scan found no matching
terms in its 114 recipes or 1,123 ingredient rows. UTF-8/no-BOM, escaped-Unicode, local-link,
trailing-whitespace, open-parent, and scoped `git diff --check` checks passed. No app tests, build,
or emulator checks were run under the updated `AGENTS.md` rule for database JSON additions.

## Proposal

See the [R604 proposal](../../proposals/wp04-section-p-bream-sea-bream-market-group-review-r604-20261018.md)
for the exact source entries, name boundary, picker projection, and limits.
