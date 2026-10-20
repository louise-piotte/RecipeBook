# WP04 Section P — skipjack tuna picker-boundary hold (R116, superseded in R117)

Reviewed and recorded on 2026-10-14. The Section P fish and seafood checklist remains open.

## Decision

At R116, keep *Katsuwonus pelamis* out of active ingredient references and the identity ledger. The current CFIA Fish List includes `Skipjack` and `Listao` under both *K. pelamis* and *Euthynnus lineatus*. Since the picker searches phrase substrings across active display names and aliases, a sole *K. pelamis* row would make those short queries appear to select one species until the second taxon is represented or search behavior handles the overlap. R117 later represented both taxa together; see the [paired identity integration](../wp04-section-p-skipjack-pair-identity-integration-20261014/README.md).

The 2017 Canada Gazette Part I tuna table is proposal-era text, not a current SFCR species-name table. Current SFCR §262 addresses flesh-colour expressions for tuna in hermetically sealed packages and does not contain that table. The CFIA Fish List independently establishes the shared names that created the picker boundary.

Keep generic tuna and bundled recipe 111#1 (`1 tuna steak`) unchanged. No species row, alias, form, measure, recipe link, conversion, yield, or substitution was added. The bundle has no skipjack-specific line among 114 recipes and 1,123 ingredient rows.

## Sources

- CFIA, [Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), and its [current query results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fpresults.asp): the broad accepted common-name crosswalk shows both short terms under *K. pelamis* and *E. lineatus*.
- Canada Gazette, [Part I proposed regulations, 2017-01-21](https://gazette.gc.ca/rp-pr/2017/2017-01-21/html/reg1-eng.html#s253): proposal-era canned-tuna table, not enacted current SFCR text. Current [SFCR §262](https://laws-lois.justice.gc.ca/eng/regulations/SOR-2018-108/section-262.html?wbdisable=true) addresses flesh-colour expressions.
- Health Canada, [CNF serving size and portions, food code 3082](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3082): records a raw skipjack food and source-specific portions; none is generalized into an active catalog value.

See the [R116 proposal](../../proposals/wp04-next-section-p-finfish-gap-review-20261014-r1.md) for the species, Québec product, picker, recipe-corpus, and source-boundary review.

## Verification

At R116 no catalog or ledger data changed. The R117 integration adds both species together and retains the R116 picker rationale. The documentation update and JSON-only catalog additions required no app or emulator tests under the updated `AGENTS.md` rule. UTF-8 without BOM, local links, and scoped whitespace checks were checked during R117 integration.
