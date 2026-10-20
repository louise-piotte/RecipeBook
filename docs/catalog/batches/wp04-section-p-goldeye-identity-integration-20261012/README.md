# WP04 Section P goldeye identity integration (2026-10-12)

Added identity-only `goldeye / laquaiche aux yeux d’or` for *Hiodon alosoides* as
`ingredient-ref-goldeye` in `PROTEIN`, with `Winnipeg goldeye` as the only English alias. Kept
mooneye (*Hiodon tergisus*) separate. Keep `Lake Winnipeg Goldeye` and smoked-product wording out of
the species identity: Manitoba’s fish fact sheet and one current Gimli retailer support a regional
smoked product, not a generic smoked form or broad Canadian availability.

Added seven source records and one accepted identity decision to the research ledger. Measurement and
substitution research remain `not_yet_researched`. No forms, measures, density, unit mappings,
conversions, yields, recipe links, or substitution rules were added. The current package contains 1,317 ingredient references. The research ledger has 1,625 records,
5,963 source entries, and 4,980 distinct source IDs. The 114-file / 1,123-row manifest corpus has
no matching goldeye or mooneye demand.

Static package normalization and validation, reference normalization, generated-index freshness,
ledger schema and source-link validation, exact ownership, picker projection, recipe-corpus scan,
UTF-8/no-BOM, and scoped whitespace checks passed. No app tests or emulator checks were run because
this change only adds database JSON data and regenerates its search index.

See the [round7 proposal](../../proposals/wp04-section-p-next-gap-review-20261012-round7.md) for
the source-by-source review, snapshot, and species/product boundaries.
