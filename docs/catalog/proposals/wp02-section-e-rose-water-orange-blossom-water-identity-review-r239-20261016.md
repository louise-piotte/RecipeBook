# WP02 Section E R239 — culinary rose water and orange blossom water (2026-10-16)

## Review record

- **Status:** Integrated. This proposal records the bounded product identities, source scope, and research decisions.
- **Open checklist:** [Section E floral waters and related products](../../RecipeBook-global-ingredient-catalog-plan.txt#L3320). The broad checklist remains open for pandan, ube preparations/flavoring, food coloring, and edible luster work.
- **Current pre-integration audit:** 1,630 active ingredient references, 122 forms, 61 legacy-import candidates, 1,975 research-ledger records, and 114 bundled recipes / 1,123 ingredient rows.
- **Source IDs:** `WP02-SECTIONE-FLOWER-WATER-R239-20261016-S01` through `S04`; none existed in the ledger or archive at review.

## Decision

Add two identity-only `BAKING_AND_SPICE` references:

| ID | English | Québec French | Narrow search aliases |
|---|---|---|---|
| `ingredient-ref-rose-water` | `rose water` | `eau de rose` | EN `rosewater`; FR `eau de fleur de rose` |
| `ingredient-ref-orange-blossom-water` | `orange blossom water` | `eau de fleur d'oranger` | EN `orange floral water` |

The La Moisson product pages identify culinary water products distilled from rose petals or orange blossoms and describe their use in desserts and drinks. OQLF lists `eau de fleur d'oranger` as its preferred French term in the food/beverage domain and gives `orange floral water` in English [S01–S03]. Keep these identities separate from rose petals, rose syrup, orange extract, essential oils, cosmetics, and non-food hydrosols. Do not add a generic `floral water` alias or bare `water` alias.

The package pages list 250 mL bottles. Those are package sizes, not ingredient portions or volume-to-mass evidence. Add no forms, densities, unit mappings, reusable measurements, package yields, conversions, recipe links, or active substitution rules.

## Substitution evidence

Maureen Abood’s Lebanese cookbook proof gives a single Flower Water Syrup formula with orange blossom water or rose water, specifying 2 teaspoons of the former or 1/2 teaspoon of the latter. It advises gradual addition and tasting because flavor strength varies by brand [S04]. The ledger records a one-way, formula-specific finding from orange blossom water to rose water. It does not create a global or runtime contextual substitution rule, does not support the reverse direction, and must not be generalized to other dishes.

## Ownership and recipe demand

Before integration, normalized exact checks found no active reference or form for `rose water`, `rosewater`, `eau de rose`, `eau de fleur de rose`, `orange blossom water`, `orange floral water`, or `eau de fleur d'oranger`. Existing rose-petal and rose-syrup rows remain separate. The 114 bundled recipe files and 1,123 structured ingredient rows have no matching ingredient text or direct link for either proposed identity. This adds regional culinary catalog coverage without recipe relinking.

The product-specific search phrases select their respective new rows. `rose` continues to return distinct rose-petal, rose-syrup, and rose-water choices. The new identities add two visibly scoped floral-water rows to broad `water` searches; no broad alias is added.

## Source register

| Source ID | Source and use |
|---|---|
| `WP02-SECTIONE-FLOWER-WATER-R239-20261016-S01` | OQLF, [eau de fleur d'oranger (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497589/eau-de-fleur-doranger). Food/beverage domain; preferred Québec French term and English `orange floral water`. The entry was last updated in 1984; this is terminology evidence, not product availability. The current search result showed the entry, while direct page retrieval returned a cache miss. |
| `WP02-SECTIONE-FLOWER-WATER-R239-20261016-S02` | La Moisson / Les Filles Fattoush, [Eau de fleur d'oranger / Orange blossom water](https://lamoisson.com/collections/sucres-edulcorants-sugars-sweeteners/products/eau-de-fleur-doranger-orange-blossom-water). Québec retailer listing, culinary description, distilled ingredient, and product-specific 250 mL package. |
| `WP02-SECTIONE-FLOWER-WATER-R239-20261016-S03` | La Moisson / Les Filles Fattoush, [Eau de rose / Rosewater](https://lamoisson.com/products/eau-de-rose-rosewater). Québec retailer listing, rose-water culinary use, distilled rose-petal ingredient, source-attested wording, and product-specific package. |
| `WP02-SECTIONE-FLOWER-WATER-R239-20261016-S04` | Maureen Abood, *Rose Water & Orange Blossoms: Fresh and Classic Recipes from My Lebanese Kitchen*, [publisher advance proof](https://edelweiss-assets.abovetheline.com/PS/supplemental/RWOB_E_Galley.pdf), “Flower Water Syrup,” pp. 42–43. Supports one context-specific direction and ratio only. The publisher proof was reviewed earlier; a repeat PDF fetch returned an error during the final check. |

## Integration and validation

- [R239 batch integration README](../batches/wp02-section-e-rose-water-orange-blossom-water-integration-r239-20261016/README.md)
- Added two ingredient-reference rows and two research-ledger records; added no forms, recipe links, or active substitution rules.
- The A-to-Z and recipe-demand parent items remain open.
- This database addition was statically validated. No software tests or emulator checks were run under the updated `AGENTS.md` rule.
