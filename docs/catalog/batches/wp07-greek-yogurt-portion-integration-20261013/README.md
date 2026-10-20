# WP07 Greek-style yogurt portion integration

Added seven Health Canada Canadian Nutrient File `portion_weight` observations to the existing `ingredient-ref-greek-yogurt` ledger record:

- CNF Food Code 7469: plain Greek-style yogurt at 2% M.F., with portions 100 mL = 101.0 g, 125 mL = 126.3 g, 175 mL = 176.8 g, and 250 mL = 252.5 g.
- CNF Food Code 6982: plain rich Greek-style yogurt at 8–12% M.F., with portions 125 mL = 130.4 g, 175 mL = 182.6 g, and 250 mL = 260.8 g.

The observations remain tied to their exact food codes. The source pages do not state a measuring or packing procedure, and none of the four linked recipe rows specifies either fat class. `defaultDensity` remains null; `unitMappings` remains empty; no recipe line, form, conversion, yield, or substitution changed. The measurement state is `researched_supported` for this source-specific evidence.

The identity remains linked to four ingredient rows across three recipes. The ledger now contains 1,759 records, 7,064 source entries, and 376 measurement observations; the recipe corpus remains 114 files and 1,123 rows. The generated ingredient index remains current at 1,420 references.

Static package normalization and validation, reference normalization, ledger schema/source checks, generated-index freshness, recipe-corpus counts, UTF-8/no-BOM, local-link, and focused whitespace checks passed. No app, unit, instrumentation, emulator, or other tests were run because the change only adds database JSON evidence under the updated `AGENTS.md` rule.

See [the review memo](../../proposals/wp07-greek-yogurt-portions-review-20261013.md) for source details and limitations. WP07 remains open.
