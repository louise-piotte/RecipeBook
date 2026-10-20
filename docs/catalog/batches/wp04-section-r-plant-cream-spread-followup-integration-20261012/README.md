# WP04 Section R — plant whipping cream and butter substitute

**Integration date:** 2026-10-12  
**Status:** bounded identity additions; the wider Section R checklist remains open.

## Changes

- Added `ingredient-ref-plant-based-whipping-cream` as `plant-based whipping cream / crème à fouetter à base de plantes`, without aliases. Keep it separate from dairy cream, plant cooking cream, coconut cream, and whipped toppings; product performance is SKU-specific.
- Added `ingredient-ref-plant-based-butter-substitute` as `plant-based butter substitute / substitut de beurre végane`, with `vegan butter` and `beurre végane` as aliases. Keep `plant butter`, `beurre végétal`, and broad butter-alternative wording out of active aliases pending a stable broader product class. The OQLF’s older `beurre végétal` entry describes tropical-seed fats such as cocoa butter and shea butter.
- The independent WP05 fats review likewise keeps generic baking-spread and plant-butter wording held. This integration uses the narrower plant-based butter-substitute class supported by Québec products and the Québec Food Directory; it does not link the wording to margarine or dairy butter.
- The 114-recipe / 1,123-row audit found no matching line for either identity. All six existing margarine links remain unchanged. No recipe links, forms, measurements, conversions, yields, or substitutions were added.

## Sources

| Ledger source | Evidence |
|---|---|
| `WP04-R-CREAM-SPREAD-FU-20261012-S01` | [Becel, Whipped Plant-based Cream](https://www.becel.ca/en-ca/recipe/whipped-plant-based-cream-233280) identifies a current Canadian whipping-cream product; its performance instructions are product-specific. |
| `WP04-R-CREAM-SPREAD-FU-20261012-S02` | [Becel Québec, Pouding chômeur à l’érable](https://www.becel.ca/fr-ca/recipe/pouding-chomeur-a-l-erable-244518) uses the French wording `crème à fouetter à base de plantes`. |
| `WP04-R-CREAM-SPREAD-FU-20261012-S03` | [Violife Canada, Dairy Free Whipping Cream](https://www.violife.com/en-ca/products/dairy-free-whipping-cream) supports a second plant-based product in the whipping-cream class; its formula and performance claims remain SKU-specific. |
| `WP04-R-CREAM-SPREAD-FU-20261012-BUTTER-S01` | [Becel Canada, Plant Butter](https://www.becel.ca/en-ca/products/plant-butter) supports a current English product-family name; the product family is not made an alias. |
| `WP04-R-CREAM-SPREAD-FU-20261012-BUTTER-S02` | [Becel Québec, Beurre végétal sans produits laitiers](https://www.becel.ca/fr-ca/products/plant-butter) supports a current manufacturer label, but the unqualified phrase is not added as an alias. |
| `WP04-R-CREAM-SPREAD-FU-20261012-BUTTER-S03` | [Maison Le Grand, Unsalted Vegan Butter](https://lovelegrand.com/en/produit/unsalted-vegan-butter/) supports English vegan-butter wording for a Québec-made product. |
| `WP04-R-CREAM-SPREAD-FU-20261012-BUTTER-S04` | [Maison Le Grand, Beurre Végane Non Salé](https://lovelegrand.com/produit/beurre-vegane-non-sale/) supports the French alias `beurre végane`. |
| `WP04-R-CREAM-SPREAD-FU-20261012-BUTTER-S05` | [Québec Food Directory product sheet](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8205140) classifies the Le Grand product as a butter/butter substitute; the record is product-specific. |
| `WP04-R-CREAM-SPREAD-FU-20261012-BUTTER-S06` | [OQLF, beurre végétal](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8413385/beurre-vegetal) records a different, older tropical-seed-fat sense, which is why the phrase is excluded from active aliases. |

At this checkpoint the package contains **1,164 references, 85 forms, 114 recipes, and 1,123 ingredient rows**; the legacy list contains **67 candidates**; and the ledger contains **1,465 records, 4,893 source entries, 4,002 distinct source IDs, and 8 unit conversions**. Static package, ledger, generated-index, ownership, recipe-demand, encoding, and whitespace checks are recorded with the integration. No tests or emulator checks were run for this JSON-only update.
