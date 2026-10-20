# WP04 Section P R110: paired bluefin tuna identities

## Disposition

Added identity-only `Atlantic bluefin tuna / thon rouge de l'Atlantique` for *Thunnus thynnus* and `Pacific bluefin tuna / thon rouge du Pacifique` for *Thunnus orientalis*. Both are `PROTEIN` references with empty alias lists.

CFIA lists separate taxon rows and qualified bilingual names for the two species. It also uses broad `bluefin` and `thon rouge` wording across both taxa. Adding the pair resolves the singleton picker problem documented in R101: qualified queries return their species row, while the broad terms show both. Do not assign `Southern Bluefin Tuna / thon rouge du Sud` to either row; that is a separate species review.

The generic `tuna / thon` reference and recipe 111's generic tuna line remain unchanged. The bundle has no species-specific bluefin demand. Both new rows have null density and empty unit mappings; no forms, measures, recipe links, conversions, yields, package rules, or substitution rules were added. The generic CNF 90 g bluefin portion and supplier whole-fish size grades were not transferred to either species. Substitution research remains `not_yet_researched`.

## Evidence and review

- CFIA, [Fish List tuna query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=tuna) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list).
- Fisheries and Oceans Canada, [Atlantic Bluefin Tuna profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/bluefin-tuna-thon-rouge-eng.html).
- OQLF, [thon rouge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198944/thon-rouge).
- Health Canada, [CNF portion 3079](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3079), retained only as generic bluefin evidence.
- Full paired-name boundary, ownership, picker, recipe scan, and source limitations are in the [R110 proposal](../../proposals/wp04-section-p-bluefin-paired-picker-review-r110-20261014.md); accepted sources and decisions are in the [research ledger](../../research-ledger.v1.json).

## Static checks

- Ingredient-reference normalization and bundled-package validation passed.
- The generated catalog index contains 1,452 references, including both new rows.
- Ledger schema and source-reference validation passed.
- Static picker projection returns each qualified query to one row and broad `bluefin` / `thon rouge` queries to both rows; recipe 111 remains generic.
- The 114-recipe / 1,123-row corpus contains no species-specific bluefin demand.
- UTF-8/no-BOM, local-link, and whitespace checks passed.
- No application tests were run; the active changes only add database JSON data and its generated catalog entries, under the updated `AGENTS.md` rule.

Section P remains open; the R101 Atlantic singleton hold is resolved by this paired integration.
