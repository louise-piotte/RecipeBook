# WP04 Section R plant beverages and coconut boundary integration

- Date: 2026-10-12
- Status: five plant beverages and one coconut-cream identity integrated; existing coconut identities reviewed; broader Section R remains open.

## Integrated decisions

Promoted the legacy candidates `ingredient-ref-oat-milk` and `ingredient-ref-almond-milk` to source-backed canonical beverage displays: `oat beverage / boisson d’avoine` and `almond beverage / boisson d’amande`. Removed those two reviewed candidates from the legacy list. The stable IDs remain internal identifiers; the public displays use the Québec/Canadian product terms.

Added identity-only `soy beverage / boisson de soya`, `rice beverage / boisson de riz`, and `coconut beverage / boisson de noix de coco`. Soy keeps the source-backed `soy drink / boisson de soja` aliases; almond keeps `almond drink`. Coconut beverage has no short aliases because the OQLF entry notes occasional use of the French term for a coconut-water-based drink. All five beverages remain separate from their source crops and from dairy milk.

Added identity-only `coconut cream / crème de coco`, distinct from coconut milk and sweetened cream of coconut. Verified and retained the existing culinary coconut-milk identity, its `canned coconut milk` match, and its three recipe links (070#10, 086#13, 095#2). Verified `cream of coconut` as a sweetened product class and updated its French display from `crème de noix de coco` to `crème de coco sucrée`; recipe 081#12 stays linked to the same reference. The OQLF coconut-cream source was reused from the existing coconut-butter ledger record.

The recipe scan found no plant-beverage or coconut-cream ingredient lines. No recipe rows or links changed. No forms, densities, measurements, conversions, yields, or substitutions were added. Sweetened/unsweetened beverage variants, coconut-water products, plant creams, spreads, and other dairy alternatives remain open.

## Evidence

- The OQLF [plant-based beverage entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26552607/boisson-vegetale) describes a family made from seeds, nuts, cereals, legumes, or other plants, names oat, soy, almond, and rice examples, and notes that commercial products may be flavoured or enriched. Its [soy-beverage entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17009153/boisson-de-soya) confirms the Québec display and the `soy drink` alias while explaining Canadian label wording; its [almond-beverage entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26552598/boisson-damande) confirms `boisson d’amande / almond beverage` and `almond drink`.
- Oatbox’s current bilingual product pages use [Original Oat Beverage](https://oatbox.com/products/oat-beverage-original) and [Boisson d’avoine Original](https://oatbox.com/fr/products/oat-beverage-original). The product formulation is specific to that SKU.
- Natura’s current Canadian manufacturer pages use [Rice Beverages](https://natura.ca/en/products/rice/) and [Boissons de riz](https://natura.ca/produits/riz/), with the product-specific source ingredients identified as brown and white rice.
- OQLF’s [coconut-beverage entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26556599/boisson-de-noix-de-coco) distinguishes the thinner beverage from culinary coconut milk and notes the occasional coconut-water use. Its [coconut-milk entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26523378/lait-de-coco) separately defines the cooking product and distinguishes both beverage and coconut water.
- OQLF’s [coconut-cream entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26556632/creme-de-coco) defines `crème de coco / coconut cream` as fat collected at the surface of coconut milk. The source was already recorded on `ingredient-ref-coconut-butter` as `WP03-COCONUT-BUTTER-QC-20261011-S03` and was reused.
- Grace Foods Canada states that its [Coco López cream of coconut](https://gracefoods.ca/product/coco-lopez/) is sweetened for piña coladas and cannot substitute for coconut cream in Thai/Southeast Asian cooking. Québec usage calls the sweetened product [crème de coco sucrée](https://www.ricardocuisine.com/recettes/8990-pina-colada), and Mayrand has a current local listing under [Crème de coco sucrée](https://mayrand.ca/fr/nos-produits/epicerie/ingredient-de-patisserie/ingredient-de-patisserie/creme-de-coco-sucree-30228). These examples support the named product class and local display, not a universal brand formulation.

## Data checks

The package contains 1,141 references / 79 forms / 114 recipes / 1,123 ingredient rows. The legacy-candidate file has 69 entries. The ledger contains 1,436 records / 4,793 source entries / 3,920 distinct source IDs / 8 unit conversions.

Package validation and normalization checks passed; the generated Kotlin index is current; the research ledger validates with no errors. Exact phrase ownership, recipe-link, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run because this change only updates bundled database JSON data, consistent with `AGENTS.md`.
