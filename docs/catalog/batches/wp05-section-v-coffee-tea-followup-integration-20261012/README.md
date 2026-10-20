# WP05 Section V — dry coffee and common tea types

**Integration date:** 2026-10-12  
**Status:** identity-only and presentation-form additions; Section V remains open.

## Changes

- Added `ingredient-ref-roasted-coffee` as `roasted coffee / café torréfié`, separate from the existing brewed `coffee / café` reference. Added whole-bean and ground forms under the dry roasted-coffee reference only; neither form carries a measure, density, or preparation equivalence.
- Added `ingredient-ref-instant-coffee` as `instant coffee / café soluble`, with `soluble coffee` and `café instantané` as aliases. Keep espresso powder and prepared espresso separate.
- Added `ingredient-ref-black-tea` as `black tea / thé noir` and `ingredient-ref-green-tea` as `green tea / thé vert`, both with no aliases. Keep matcha separate, and do not add herbal infusions, brewed tea, or other tea families as aliases.
- The full 114-recipe / 1,123-row audit found no dry-coffee, instant-coffee, or tea ingredient lines. The existing two brewed-coffee links and espresso-powder row remain unchanged. Cocoa and malt beverage mixes remain held; no recipe links, measurements, conversions, yields, or substitutions were added.

## Sources

| Ledger source group | Evidence |
|---|---|
| `WP05-BEVERAGE-BOUNDARY-20261012-DRY-S01..S03` | [OQLF coffee-seed sense](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8353484/cafe), [CFIA compositional standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), and [Starbucks at Home Canada](https://www.starbucksathome.com/ca/fr-ca/produits) distinguish dry coffee stages and show Québec-market labels for whole-bean, ground, and instant formats. |
| `WP05-BEVERAGE-BOUNDARY-20261012-INSTANT-S01..S02` | [OQLF, café soluble](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8353471/cafe-soluble) directly supports the bilingual instant/soluble coffee names and aliases; Starbucks corroborates current Canadian category wording. |
| `WP05-BEVERAGE-BOUNDARY-20261012-BLACK-TEA-S01..S02` | [CFIA Volume 17](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) and [OQLF, thé noir](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3285899/the-noir) support the dry black-tea product type and bilingual name. |
| `WP05-BEVERAGE-BOUNDARY-20261012-GREEN-TEA-S01..S02` | [CFIA Volume 17](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) and [OQLF, thé vert](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19001554/the-vert) support the dry green-tea product type and bilingual name. |

At this checkpoint the package contains **1,164 references, 85 forms, 114 recipes, and 1,123 ingredient rows**; the legacy list contains **67 candidates**; and the ledger contains **1,465 records, 4,893 source entries, 4,002 distinct source IDs, and 8 unit conversions**. Static package, ledger, generated-index, ownership, recipe-demand, encoding, and whitespace checks are recorded with the integration. No tests or emulator checks were run for this JSON-only update.
