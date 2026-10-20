# WP02/WP03/WP04 R177 gap-review integration

**Integrated:** 2026-10-16

**Plan:** [Global ingredient catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)

**Reviewed proposals:** [Pili nut flour](../../proposals/wp02-b2-pili-nut-flour-identity-review-r177-20261016.md), [wild-rice forms](../../proposals/wp03-section-f-wild-rice-dry-cooked-form-review-r177-20261016.md), and [oil-packed anchovy fillets](../../proposals/wp04-section-p-anchovy-fillets-in-oil-boundary-review-r177-20261016.md).

## Integrated decisions

- **WP02 B2 — pili nut flour:** Added identity-only `pili nut flour / farine de noix de pili` for flour made from the edible *Canarium ovatum* kernel. The French display is descriptive and provisional, grounded in the existing Québec-facing `noix de pili` name. The entry remains separate from whole pili nuts and pili pulp flour. The cookie study's 10%, 20%, and 30% formulations remain recipe-specific research findings; no flour substitution rule, alias, form, measure, conversion, yield, or recipe link was added.
- **WP03 Section F — wild-rice states:** Added `wild rice, dry / riz sauvage, sec` and `wild rice, cooked / riz sauvage, cuit` forms under the existing wild-rice identity. Both labels are qualified, and the forms have no match terms, density, or other active numeric behavior. The 2015 CNF portions stay source-specific historical context; measurement research remains open pending inspection of the 2026 food-name and measure-weight rows.
- **WP04 Section P — anchovy fillets in oil:** Added identity-only `anchovy fillets in oil / filets d’anchois à l’huile` as a prepared-fillet market group. Québec retail listings support anchovy fillets packed with olive or sunflower oil. The row assigns no species, cure, storage method, or canning/sterility process, and remains separate from generic Engraulidae anchovy, anchovy paste, and Norwegian sprat products. This integration accepts a narrow market group despite the WP04 proposal's hold recommendation; the product listings establish enough shared wording and ingredient state for the identity, while process-specific forms remain unallocated.

All three proposal audits report no matching demand in the bundled **114 recipes / 1,123 ingredient rows**. No recipes or recipe links changed.

## Source registration

- Added two pili-nut-flour research sources to its ledger row. Reused the existing TERMIUM `pili nut / noix de pili` and ALOCAL whole-nut source entries by their existing source IDs.
- Added five sources to the anchovy-fillets-in-oil ledger row for OQLF's separate Norwegian-sprat product, the OECD fish-products dictionary, two Metro products, and Mayrand's French-labelled Allessia product. Reused the existing OQLF `anchois` and CFIA Fish List source entries.
- Added four source entries to the existing wild-rice ledger row for the CNF 2015 dry and cooked pages and Health Canada's wild-rice recipe. Reused the existing CNF overview source record rather than creating a second URL entry.
- No measurement observations, conversions, substitutions, yields, or recipe links were added.

## Static validation

- Static seed-package, ingredient-reference, generated-index, and research-ledger checks passed.
- Exact English/French picker projection, broad-query ownership, and the manifest-ordered corpus scan passed.
- UTF-8/no-BOM, escaped-Unicode JSON, source-ID/URL ownership, local Markdown links, and scoped whitespace checks passed.
- Totals: **1,553 references**, **122 forms**, **1,898 ledger records / 8,150 source entries / 6,962 distinct source IDs / 5,758 distinct source URLs**; **114 recipes / 1,123 ingredient rows**.
- No tests, build, emulator, or deployment were run. These changes add database JSON data under the current `AGENTS.md` rule.

Broader WP02 B2, Section F, and Section P coverage remains open.
