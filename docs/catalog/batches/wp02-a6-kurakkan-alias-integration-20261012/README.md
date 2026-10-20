# WP02 A6: Kurakkan and finger-millet alias integration

## Decision

Added two English aliases to existing grain and flour identities:

- `kurakkan` on `ingredient-ref-finger-millet` (`finger millet / éleusine cultivée`)
- `kurakkan flour` on `ingredient-ref-finger-millet-flour` (`finger millet flour / farine de ragi`)

The Sri Lankan Ministry of Education identifies Kurakkan as a name for finger millet. A current Canadian flour listing groups Kurakkan Flour with Finger Millet Flour and Ragi Flour. The existing French display remains `farine de ragi`; no French alias or separate Kurakkan identity was added. Roasted and sprouted product names remain outside the unqualified flour alias.

## Evidence and numeric behavior

The ledger now records four source-specific bulk-density values from Mudau et al.’s laboratory-prepared light- and dark-brown finger-millet flours. Table 2 reports loose and packed values with standard deviations, but its unit heading says `g/g` while the paper’s prose and method say `g/mL` or `g/cm³`. These measurements are preserved as study observations only; `defaultDensity` stays null and unit mappings remain empty.

The bread study’s 10–40% wheat-flour replacement findings are recorded as a blocked, formula-specific result. No general substitution rule, form, recipe link, package yield, or household measure was added. The full recipe corpus has no Kurakkan match. The source register and detailed ownership review are in [the accepted proposal](../../proposals/wp02-a6-kurakkan-finger-millet-flour-alias-review-20261012-round12.md).

## Verification

The bundled ingredient catalog generator was rerun to refresh `BundledIngredientCatalog.kt` after the reference JSON changed. No app, unit, instrumentation, or emulator tests were run because this change only adds database JSON data. A6 remains open.
