# WP03 Section I macadamia-butter formulation integration (R379)

Added the exact English alias `macadamia nut butter` to the existing `ingredient-ref-macadamia-butter` row. Kept the French display `beurre de macadamia` and French alias list unchanged. The phrase `beurre de noix de macadamia` appears in Québec-facing product listings, but is not an active alias because it would also make the whole-nut query `noix de macadamia` return the butter row.

Added three source records under the existing ledger identity. House of Macadamias lists macadamias, sunflower stabilizer, and sea salt in one SKU and advises stirring if oil separation occurs; its product page said sold out at review. Keys Nutrition uses the French phrase on its Québec retailer listing. La Natura Casa describes a 400 g organic SKU made only with dry-roasted macadamias; its indexed page had conflicting stock notices, so availability is not recorded. These claims remain specific to the cited products. The existing Nuts to You sources remain reused and unchanged. [House of Macadamias](https://www.houseofmacadamias.com/collections/all-products/products/macadamia-nut-butter-sea-salt-flavor), [Keys Nutrition](https://keysnutrition.com/en/products/house-of-macadamias-beurre-de-noix-de-macadamia-sel-de-mer-250g-keys-nutrition), [La Natura Casa](https://lanaturacasa.com/products/beurre-de-noix-de-macadamia-biologique), [Nuts to You](https://nutstoyou.ca/products/macadamia-butter-smooth/).

No forms, densities, unit mappings, measurements, recipe links, conversions, yields, or substitutions were added. Measurement and substitution research remain `not_yet_researched`; the 114-file, 1,123-row recipe bundle has no macadamia matches.

## Validation

- Ingredient-reference normalization check passed.
- Bundled seed package normalization and validation-only checks passed.
- Research ledger schema validation passed.
- Generated Kotlin catalog freshness check passed at 1,699 references.
- Ownership, source-ID/URL, alias-scope, recipe-corpus, JSON encoding, and touched-document checks are recorded as static checks.
- No software tests, build, emulator run, or deployment was performed because this change only adds database JSON data under `AGENTS.md`.
