# WP04 Section P yellowfin tuna identity integration

Added identity-only `yellowfin tuna / thon à nageoires jaunes` for *Thunnus albacares* as
`ingredient-ref-yellowfin-tuna` in `PROTEIN`, with no aliases. CFIA lists the taxon and yellowfin
names, Québec and the Canada Gazette support French species wording, and a Montréal food-service
supplier identifies the species on its Québec-facing page. The Québec government's `thon albacore`
wording is kept as evidence only because unqualified `albacore` also names *Thunnus alalunga*.

Recipe 111#1 remains linked to generic tuna because it says only `1 tuna steak`. Broad tuna/thon
searches now show both the generic identity and yellowfin. No yellowfin recipe demand was found in
the 114 manifest-listed recipes / 1,123 ingredient rows. The Health Canada CNF 3085 Food Guide
portion (90 g) is a food-code-specific ledger observation, not an active measure. The 100 g edible
portion simply expresses the CNF per-100-g basis. No aliases, forms, active measures, density,
mappings, recipe links, conversions, yields, or substitutions were added.

Current catalog totals: 1,444 ingredient references, 105 forms, 1,784 research-ledger records, 63
legacy candidates, 114 recipes, and 1,123 ingredient rows. The Metro product page listed in the
proposal could not be retrieved by the browser during integration; it is not needed for the accepted
identity decision.

Bundled package normalization and validation, ingredient-reference normalization, ledger schema
validation, and generated-index freshness checks passed. No app, Gradle, instrumentation, or emulator
tests were run because this change only adds database JSON data and its generated index, consistent
with `AGENTS.md`.

See the [R102 identity review](../../proposals/wp04-section-p-yellowfin-tuna-identity-review-r102-20261014.md).
