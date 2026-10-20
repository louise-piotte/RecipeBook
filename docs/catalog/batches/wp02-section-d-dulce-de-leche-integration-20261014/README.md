# WP02 Section D dulce de leche identity integration

Added `ingredient-ref-dulce-de-leche` as `dulce de leche / confiture de lait` in `SAUCE_AND_CONDIMENT`,
with `milk jam` as its sole English alias. OQLF accepts `dulce de leche` in French as well, so it is
already searchable from the English display and is not duplicated as a French alias. Kept it
separate from caramel sauce, sweetened condensed milk, and country-specific related products.

The ledger records OQLF terminology, a current Montréal retailer product, and Health Canada CNF 2015
food code 6789. Its 30 mL = 39.3 g, 125 mL = 163.8 g, and 250 mL = 327.6 g portions remain
food-code-specific observations only. The 840 g retailer package is SKU-specific. No active measure,
density, mapping, form, recipe link, conversion, yield, or substitution was added. No exact recipe
ingredient demand was found in the 114 manifest-listed recipes / 1,123 ingredient rows.

The generated index and catalog package were refreshed and checked. Static package, ledger, exact
phrase ownership, recipe-corpus, encoding, and whitespace checks are recorded with this batch. No
app, unit, instrumentation, or emulator tests were run because this change only adds database JSON
data, consistent with `AGENTS.md`.

See the [identity review](../../proposals/wp02-section-d-dulce-de-leche-identity-review-20261014.md)
for evidence, source IDs, search boundaries, and measurement limits.
