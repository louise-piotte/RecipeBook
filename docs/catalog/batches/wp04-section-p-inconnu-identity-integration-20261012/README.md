# WP04 Section P inconnu identity integration (2026-10-12)

Added identity-only `Inconnu / inconnu` for *Stenodus leucichthys* as
`ingredient-ref-inconnu` in `PROTEIN`, with `coney` as the sole English alias. CFIA’s species-linked
Fish List result supports the bilingual display and alias; TERMIUM supplies bilingual terminology,
and Fisheries and Oceans Canada plus the Government of Northwest Territories bound the evidence to
regional fishery and sport-fishing contexts. This does not establish broad Canadian retail
availability.

Kept `sheefish`, `connie`, `conny`, `beloribitsa`, `nelma`, `whitefish`, `poisson blanc`, and the
scientific name out of aliases. The existing lake-whitefish identity remains distinct. Added seven
source records and one accepted identity decision to the research ledger. No forms, measures,
observations, density, unit mappings, conversions, yields, recipe links, or substitutions were added;
measurement and substitution research remain `not_yet_researched`.

The full 114-file manifest corpus / 1,123 ingredient rows has no inconnu, coney, alternative-name, or
scientific-name demand and no linked recipe row. Regional fish size observations and catch information
were not used as kitchen quantities or general product availability. The ledger has 1,621 records,
5,936 source entries, and 4,953 distinct source IDs; the package has 1,313 ingredient references.

Static package normalization and validation, reference normalization, generated-index freshness,
ledger schema validation, exact normalized ownership, picker projection, recipe-corpus scan,
UTF-8/no-BOM, and scoped whitespace checks passed. No app tests or emulator checks were run because
this change only adds database JSON data and regenerates its search index.

See the [round6 proposal](../../proposals/wp04-section-p-next-gap-review-20261012-round6.md) for
the source-by-source review and species/product boundaries.
