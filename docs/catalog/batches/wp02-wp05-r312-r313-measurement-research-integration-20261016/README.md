# WP02 A6 R312 and WP05 Section Y R313 measurement research integration

Reviewed and integrated on 2026-10-16. Root reviewed both proposal files and checked the live source pages/indexed product records before updating the research ledger.

## R312 — generic millet flour

Recorded three exact portions on `ingredient-ref-millet-flour`: Health Canada's CNF 2015 Food Code 6186 values of 250 ml = 125.7 g and 1 serving = 20.0 g, plus Cuisine Soleil GTIN 851424000097's label portion of 1/4 cup (52 g). Each is a separate source-scoped observation. The CNF serving has no volume, and the product listing specifies no cup convention or filling method. No density, unit mapping, conversion, or substitution finding was added; `measurementState` is `researched_no_supported_value`. The generic identity fields and substitution state remain unchanged.

## R313 — amchur powder

Recorded Loblaws' indexed Suraj product listing of one 0.5 g serving and Ameen Foods' current 150 g jar, 400 g pouch, and 1,000 g pouch as separate product-specific observations on `ingredient-ref-amchur`. Reused the existing Ameen source ID and updated its evidence text to cover the current page. The Suraj product page itself did not expose extractable text; the retailer's current indexed listing supplies the product title, 100 g package, and 0.5 g serving.

Ameen qualitatively says amchur can replace lemon or tamarind in dry mixtures and suggests 1/2 teaspoon for four servings, but gives no resolved ingredient form, matched replacement amount, spoon convention, or complete comparative formula. The CIA formula concerns whole dried mango slices, and does not transfer to the powder. Therefore `substitutionResearchState` is `researched_no_supported_substitute` with an empty findings list. No alias, form, density, unit mapping, active rule, recipe link, or generic package size was added.

## Verification

The bundled package validates, the generated ingredient index is current, and source/observation IDs for these additions are unique. Totals at integration: 1,673 references, 127 forms, 2,020 ledger records, 8,961 source-entry occurrences, 7,596 distinct source IDs, and 6,346 distinct source URLs; 114 manifest-listed recipes and 1,123 ingredient rows. No software tests, Gradle builds, emulator checks, or deployment were run because this update adds database JSON data and documentation only, as specified in `AGENTS.md`.

See the [R312 proposal](../../proposals/wp02-a6-next-regional-flour-gap-review-r312-20261016.md), [R313 proposal](../../proposals/wp05-amchur-measure-substitution-review-r313-20261016.md), [research ledger](../../research-ledger.v1.json), [catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt), and [roadmap](../../../../roadmap.md). WP02 A6 and WP05 Section Y remain open for broader coverage.
