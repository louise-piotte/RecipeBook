# WP03 Section F: sorghum grits identity integration

Added identity-only `ingredient-ref-sorghum-grits` as **sorghum grits / gruau de sorgho** in `GRAIN_AND_CEREAL`, with the English singular alias `sorghum grit`. Kept TERMIUM’s hulled-seed `sorghum groats` terminology out of the aliases because it conflicts with the coarsely milled food product supported by FAO and USDA. The identity remains separate from whole sorghum, sorghum flour, sorghum semolina, puffed sorghum, maize hominy grits, and attiéké.

The ledger records six terminology, processing, product, and Canadian retail sources. The Canadian retailer’s 2 lb package and USDA’s soy-fortified cooking directions remain product-specific. No household measure, density, mapping, form, recipe link, conversion, yield, or general substitution is activated. The measurement and substitution states record that the reviewed evidence supports no reusable value or replacement ratio. The 114-recipe / 1,123-row corpus has no matching ingredient demand.

After integration, qualified `sorghum grits`, `sorghum grit`, and `gruau de sorgho` queries select the new row. Broad `sorghum`, `grits`, and `gruau` searches return five, three, and six rows respectively.

Static package normalization, generated-index freshness, ledger schema validation, source-ID ownership, reference ownership and picker behavior, recipe-corpus phrase scan, UTF-8/no-BOM and escaped-Unicode checks, and scoped `git diff --check` passed. No app tests or emulator checks were run because this change only adds database JSON data and catalog documentation. Section F remains open.

See the [identity review and source register](../../proposals/wp03-section-f-sorghum-grits-identity-review-20261013.md).
