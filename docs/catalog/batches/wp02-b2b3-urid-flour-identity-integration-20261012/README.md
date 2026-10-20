# WP02 B2/B3 urid-flour identity integration (2026-10-12)

Added identity-only `urid flour / farine de haricot urd` as `ingredient-ref-urid-flour` in
`FLOUR_AND_STARCH`. The English display matches Niru Enterprise Inc.’s current Canadian product title.
The French display is a transparent construction from CFIA’s packaged-grain name `haricot urd`; the
complete flour phrase is not independently attested by OQLF or a standalone Québec flour label, so
keep it provisional pending an independent Québec terminology review.

Kept the separately marketed `Urid Flour (Roasted)` identity distinct. The plain-title manufacturer
page does not state the pulse’s Latin species, seed preparation, or an unroasted process, so no such
claim is added. Both alias arrays remain empty. Niru’s 900 g package is not a kitchen measure. No
forms, density, mappings, observations, conversions, yields, recipe links, or substitution rules were
added; measurement and substitution research remain `not_yet_researched`.

Added five source records and one accepted identity decision to the research ledger. The package has
1,317 ingredient references; the ledger has 1,625 records, 5,963 source entries, and 4,980 distinct
source IDs. The 114-file / 1,123-row manifest corpus has no matching urid-flour demand.

Static package normalization and validation, reference normalization, generated-index freshness,
ledger schema and source-ID validation, exact ownership, picker projection, recipe-corpus scan,
UTF-8/no-BOM, and scoped whitespace checks passed. No app tests or emulator checks were run because
this change only adds database JSON data and regenerates its search index.

See the [round7 proposal](../../proposals/wp02-b2b3-next-gap-review-20261012-round7.md) for the
source-by-source review, current snapshot, and naming boundaries.
