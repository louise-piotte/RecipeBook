# WP05 Section S infused-oil integration — 2026-10-12

## Catalog decisions

- Added identity-only `ingredient-ref-garlic-infused-oil` as `garlic-infused oil / huile infusée à l’ail`, without aliases. Québec product wording covers vegetable-oil and olive-oil based products; the base oils and formulations remain product-specific.
- Kept ready-to-use chopped garlic in oil distinct from infused oil. Preserved the existing chili oil and Chiu Chow chili-crisp identities. Held scallion oil, annatto oil, and generic infused-oil wording because the available names do not justify a general source/form identity.
- Kept the source-unspecified `oil spray` ingredient row in recipe 033#8 unlinked. The row does not identify the oil or delivery product; the corpus has no rows for the new garlic-infused identity.

## Recipe and numeric data

No recipe row, quantity, note, form, measurement, conversion, yield, or substitution was changed. The package has 1,151 references / 79 forms / 114 recipes / 1,123 ingredient rows; 68 legacy candidates; and 1,445 ledger records / 4,826 source entries / 3,946 distinct source IDs / 8 unit conversions.

## Sources

- TournevenT Québec, [huile végétale biologique infusée à l’ail](https://tournevent.ca/products/huile-vegetale-biologique-infusee-a-lail).
- Plaisirs Gourmets Québec, [English product listing](https://www.fromagesduquebec.qc.ca/en/catalogue/huile-vegetale-infusee-a-lail/) and [French product listing](https://www.fromagesduquebec.qc.ca/fr/catalogue/huile-vegetale-infusee-a-lail/).
- Fody Foods Canada, [garlic-infused olive oil](https://fodyfoods.ca/fr/products/garlic-infused-olive-oil-2-pack).
- Québec Food Directory, [chopped garlic in oil](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/73942), supporting the product boundary.

## Static validation

Seed normalization/checking, package validation, generated-index freshness, ledger validation, exact-key ownership, recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed after integration. No tests or emulator checks were run because this change only adds database JSON data, as directed by `AGENTS.md`.
