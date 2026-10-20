# WP03 Section F R358 — Cinnamon Toast Crunch family picker hold

## Decision

Keep the proposed `Cinnamon Toast Crunch cereal / céréales Croque Cannelle` identity outside active references and the shared research ledger until the current Canadian product family can be reviewed as one picker decision. No catalog or ledger data changed.

General Mills Canada's English page identifies Cinnamon Toast Crunch as a cinnamon-sugar cereal. Its French page keeps the English heading while its Québec-facing text identifies the Croque Cannelle brand. Walmart Canada's French product listing uses `Croque Cannelle` for the 354 g plain cereal and describes crisp whole-wheat and rice squares with cinnamon sugar. The Walmart brand listing snapshot available to the review also displays differently named products, including filled, waffle, churros, strawberry, and French-toast entries. Its accessible crawl may predate the review and it is a retailer page, not a complete manufacturer SKU list; current sibling availability remains unverified.

That snapshot raises a picker-family question: adding only the plain cereal could make the broad `Cinnamon Toast Crunch` or `Croque Cannelle` query return one row even if differently named siblings remain in the Canadian assortment. Reopen after a current manufacturer-backed family review defines which siblings should be represented. Do not treat variant names as aliases for the plain cereal.

## Scope and evidence limits

- No active reference, alias, form, legacy mapping, research-ledger candidate, recipe link, measure, conversion, yield, or substitution was added.
- The 354 g and larger plain-cereal packages are SKU package amounts, not reusable measures or conversions.
- The bundle contains 114 manifest-listed recipes and 1,123 ingredient rows; no candidate-name demand was found.
- The review does not claim that the retailer's nine listed entries are all currently available or that they represent the complete manufacturer family.

Sources checked 2026-10-16:

- General Mills Canada, [Cinnamon Toast Crunch (English)](https://www.generalmills.ca/our-food/brands/cinnamon-toast-crunch) and [French](https://www.generalmills.ca/fr-ca/our-food/brands/cinnamon-toast-crunch) brand pages.
- Walmart Canada, [Croque Cannelle 354 g](https://www.walmart.ca/fr/ip/Croque-Cannelle-C-r-ales-Pour-le-Petit-d-jeuner-au-Gout-De-Cannelle-Authentique-Grains-Entiers-354-g/6000198307325) and [Cinnamon Toast Crunch brand listings](https://www.walmart.ca/fr/c/brand/cinnamon-toast-crunch). The latter is treated as a retailer snapshot; current inventory and family completeness are not inferred.

## Validation

- Cross-checked the brand and product wording against General Mills Canada and Walmart Canada pages.
- Confirmed the 114-recipe / 1,123-row corpus has no matching candidate names.
- No software tests were run because this documentation-only decision does not change database JSON or runtime code.
