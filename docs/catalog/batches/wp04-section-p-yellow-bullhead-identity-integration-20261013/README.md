# WP04 Section P: yellow bullhead identity integration

Added identity-only `ingredient-ref-yellow-bullhead` as **yellow bullhead / barbotte jaune** for *Ameiurus natalis* in `PROTEIN`, with empty alias arrays. Québec’s fishery regulation and freshwater-fish identification poster pair the qualified names with this species; CFIA lists additional Canadian names that remain inactive.

The existing brown bullhead / `barbotte` identity stays scoped to *A. nebulosus*. The current picker returns both species for broad `bullhead` and `barbotte` searches. Keep `yellow catfish`, `Pimélode des marais`, `silure jaune`, bare `catfish`, and scientific names out of aliases. No current Québec product listing establishes yellow-bullhead retail availability.

The ledger records eight source entries, with no supported species-specific household measure or substitution. The Québec poster’s 200–300 mm biological identification range is not a food portion. The 114-recipe / 1,123-row corpus has no matching candidate or neighboring-name ingredient demand. No forms, density, unit mappings, recipe links, conversions, yields, or active substitutions were added.

Static package normalization, generated-index freshness, ledger schema validation, source-ID ownership, picker projection, recipe-corpus scan, UTF-8/no-BOM and escaped-Unicode checks, and scoped whitespace checks passed. No app tests or emulator checks were run because this change only adds database JSON data and catalog documentation. Section P remains open.

See the [identity review and source register](../../proposals/wp04-section-p-yellow-bullhead-barbotte-jaune-identity-boundary-review-20261013.md).
