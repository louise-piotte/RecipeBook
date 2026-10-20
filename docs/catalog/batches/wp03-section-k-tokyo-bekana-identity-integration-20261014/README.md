# WP03 Section K Tokyo Bekana identity integration

## Decision

Added identity-only `Tokyo Bekana cabbage / chou Tokyo Bekana` as
`ingredient-ref-tokyo-bekana` in `VEGETABLE_AND_AROMATIC`. Current Québec farm and marketplace pages
use these English and French market names. The French display is accepted as borrowed Québec market
wording; no OQLF entry was found, so it is not described as OQLF-standardized.

The two alias arrays remain empty. Do not assign broad `Chinese cabbage` / `chou chinois`, bare
`Bekana`, Napa, or generic cabbage terms to this row. The 114-recipe, 1,123-row bundled corpus has
no direct Tokyo Bekana ingredient line or recipe link.

## Measurements and substitutions

The research ledger records Lufa's 100 g listing and Marché de proximité de Québec's 250 g listing
as product-specific package observations only. They are not head weights, serving defaults,
densities, household measures, conversions, or yields. No forms, unit mappings, or active numeric
behavior were added.

Catena's own site confirms a Tokyo Bekana chickpea-curry recipe, but the linked recipe page was not
available during review. A secondary transcription offers one Tokyo Bekana cabbage or regular
cabbage for that dish; this remains blocked, recipe-specific evidence with no mass or preparation
equivalence. Lufa's recipe interface offers Tokyo Bekana among shopping options while its ingredient
line remains three cups of generic Chinese cabbage. Neither source supports an active global or
contextual substitution rule.

## Evidence and review

The R118 proposal records the primary cultivar paper, Cornell and UF/IFAS horticulture sources,
Catena's Québec grower page, Lufa's bilingual marketplace wording, and the Québec Marketplace
listing. It also records the lower-confidence recipe evidence and the negative OQLF/CNF search
limits. The coordinator reviewed the borrowed French display against the current Québec sources and
accepted it as a market name without claiming terminology standardization.

See [the proposal](../../proposals/wp03-next-section-k-tokyo-bekana-identity-gap-review-20261014-r1.md)
and [the catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt). Section K's broader
leafy-green and brassica sweep remains open.

No app, Gradle, instrumentation, or emulator tests were run: the integration only adds database JSON
data and documentation under the updated `AGENTS.md` rule.
