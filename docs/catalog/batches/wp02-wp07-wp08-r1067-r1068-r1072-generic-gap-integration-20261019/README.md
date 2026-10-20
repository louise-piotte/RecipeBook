# WP02/WP07/WP08 R1067, R1068, and R1072 — generic ingredient follow-up

## Integrated and reviewed

- **R1067 — Defatted barley bran.** Added identity-only `ingredient-ref-defatted-barley-bran` (`defatted barley bran / son d’orge dégraissé`) as a generic barley-bran fraction used in a human-food biscuit study. The French compound remains descriptive and provisional. The study's hexane protocol, drying, grinding, sieve size, biscuit formulas, and outcomes remain source-specific. No aliases, forms, measures, mappings, recipe links, conversions, yields, or active substitutions were added.
- **R1068 — Almond-extract measurement review.** Closed the reviewed-source window as a bounded no-supported-value result. Preserve the existing `researched_no_supported_value` state, null density, empty unit mappings, and original recipe amounts. The current CNF 2026 food-name and measure-weight files are listed by Health Canada but could not be inspected through the browser download route, so no claim about their almond-extract rows is made. No ledger or catalog data changed.
- **R1072 — Vegetable oil to canola oil.** Added two separate ledger findings for the named Sally McKenney cake formulas that list canola or vegetable oil in the same measured slot. The 240 ml and 120 ml options stay tied to their respective recipes. No comparative effect, general oil equivalence, reusable measure, active global/contextual rule, recipe-line link, or recipe edit was added. The generic vegetable-oil measurement state and null density remain unchanged.

## Brand and commercial scope disposition

The user's scope instruction applies across ingredient types. A search of unchecked plan lines for brands, manufacturers, retailers, product lines, flavours, SKUs, and commercial rosters found no remaining item whose sole deliverable is a commercial roster. Previously queued Section F cereal rosters and the named Anson Mills wheat-meal lead remain out of scope because commercial-product counts do not add ingredient diversity; stop that product-only work and preserve its R605 history. The already reviewed Nu Life Market/Dempsey sorghum-meal leads and Mochiko/Shiratamako display-only task remain out of scope for the same generic-diversity reason. Existing branded rows and their evidence remain intact. No information was transferred to generic rows without a transferability review.

Manufacturer pages may still support a generic ingredient where the evidence applies beyond the named product. Measurements, formulas, and claims tied to one product or recipe remain scoped to that source. These three reviews selected generic barley bran, generic almond extract, and generic vegetable oil; no branded product or commercial variant was researched.

## Evidence checked

- R1067's primary article directly identifies laboratory-milled barley bran, defats brans including barley, and describes the resulting cereal brans in biscuit use: [Nagi et al., *Effect of Storage Period and Packaging on the Shelf Life of Cereal Bran Incorporated Biscuits*](https://scialert.net/fulltext/?doi=ajft.2012.301.310), especially Materials and Methods and the conclusion.
- R1068 checked the current CFIA compositional standard, Health Canada's 2008 common-food reference, USDA SR28 Food Group 02, and current CNF 2026 metadata. The official 2026 Food Name CSV and Measure Weight Conversion CSV are listed on the [Open Government CNF dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109), but the browser could not open the CSV downloads. This limits the negative finding to the sources that were accessible.
- R1072 checked both original recipe pages: [Red Velvet Cake with Cream Cheese Frosting](https://sallysbakingaddiction.com/red-velvet-layer-cake-with-cream-cheese-frosting/) and [Upgraded German Chocolate Cake](https://sallysbakingaddiction.com/german-chocolate-cake/). Their same-slot options are formula-specific, without a comparative test.

## Validation and testing

Static checks passed: bundled seed-package normalization (`--check`), generated catalog freshness (`--check`), research-ledger JSON Schema validation, global source-ID linkage, unique record/reference IDs, modified-file UTF-8/no-BOM and whitespace, and local README links. The generator was refreshed for the new reference. Current counts are 2,069 ingredient references, 205 forms, 2,474 research-ledger records, 11,541 source entries, and 9,697 distinct source IDs. No software tests, build, emulator, or deployment were run: the active catalog changes add database JSON data, and R1068 is documentation-only, as allowed by `AGENTS.md`.

Sections A7 and WP08 remain open for generic ingredient gaps.
