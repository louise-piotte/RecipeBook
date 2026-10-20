# WP04 Section P R320: Bombay duck identity integration

Added the identity-only `ingredient-ref-bombay-duck` reference in `PROTEIN`, displayed as
`Bombay duck fish / Scopelodé` for *Harpadon nehereus*. The CFIA Fish List pairs the species with
`Bombay Duck / Scopelodé`; CFIA guidance describes the list as a Canadian source for fish names.
The French display is directly supported by the CFIA name, not presented as an OQLF term.

The Montréal `Dry Lottia / Loitta Shutki` listing links its own 150 g dried product to the binomial
and recommends a 10–15 minute soak. T&T lists a separate 250 g prepared crispy product, while
PriceSmart lists a frozen, headed/tail-off, gutted item. These product states, package amounts, and
instructions remain source-specific. No local-product alias, form, package yield, measure, conversion,
recipe link, or substitution was added. Bare `duck` and `canard` were not added as aliases, keeping
the fish separate from poultry duck.

No matching term appears in the full bundle: **114 recipe files / 1,123 ingredient rows**. Picker
projection after integration returns the new row for `Bombay duck`, `Bombay duck fish`, and
`Scopelodé`; `duck` expands from 2 to 3 rows, and `fish` from 9 to 10. `poisson` remains at 10;
`duck egg`, `duck fat`, and `canard` retain their previous owners. Binomial and local dried-product
terms remain unindexed.

## Review records

- [R320 proposal and source review](../../proposals/wp04-section-p-bombay-duck-identity-boundary-review-r320-20261016.md)
- [Research-ledger record](../../research-ledger.v1.json)
- WP04 Section P checklist: `docs/RecipeBook-global-ingredient-catalog-plan.txt`

## Static validation

Package structure/schema validation, normalized-seed checks, generated-index freshness, research-ledger
JSON Schema validation, source-ID/decision ownership, picker phrase projection, recipe-corpus scan,
UTF-8 without BOM and escaped seed accent checks, relative-link checks, and scoped whitespace checks
passed. The package contains **1,675 references**, **127 forms**, **2,022 ledger records**, **8,980
source-entry occurrences**, **7,615 distinct source IDs**, and **6,363 distinct source URLs**; the
bundle remains at **114 recipes** and **1,123 ingredient rows**.

No software tests, Gradle tasks, emulator checks, or deployment were run because this update only adds
database JSON data under the user's `AGENTS.md` rule. Section P remains open.
