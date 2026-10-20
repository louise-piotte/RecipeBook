# WP04 Section P R328 — blackfin sea bass picker hold

Reviewed and integrated on 2026-10-16.

Kept *Lateolabrax latus* outside active references, forms, legacy mappings, and the research ledger.
CFIA verifies the name pair `Blackfin Sea Bass / Bar à nageoires noires`, while the current
phrase-first picker would make broad `sea bass`, `blackfin`, and `bar` queries appear to resolve to
this one species. CFIA lists these name components across other fish taxa. The reviewed supplier
catalogue does not provide a binomial or French label on the item, no product-matched Québec French
listing was verified, and the bundled recipe corpus has no matching demand.

No candidate ID, aliases, forms, measurements, conversions, yields, recipe links, or substitutions
were added. This documentation-only hold leaves Section P open for a group-level sea-bass search
boundary review.

See the [R328 proposal](../../proposals/wp04-section-p-blackfin-sea-bass-picker-boundary-review-r328-20261016.md),
[CFIA Fish List result](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Blackfin%20Sea%20Bass),
and [CFIA Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list).

The read-only projection against the current phrase-first search logic confirms that adding a
`blackfin sea bass / bar à nageoires noires` row would change `sea bass` and `blackfin` from no
current results to a singleton and would change `bar` from 38 substring-fallback results to that
singleton. The 114-recipe / 1,123-ingredient-row bundle contains no matching demand. Local links,
UTF-8/no-BOM, and whitespace checks passed. No software tests were run because this documentation-only
decision changes no database JSON or application code.
