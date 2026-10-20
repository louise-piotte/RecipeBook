# WP03 Section F R103 — Shreddies Original picker-boundary hold

- **Date:** 2026-10-14
- **Decision:** Keep Shreddies Original / `Shreddies Originale` outside the active reference catalog and research ledger.
- **Review:** [Picker-boundary proposal](../../proposals/wp03-section-f-shreddies-original-picker-hold-r103-20261014.md)

## Decision and boundary

The Canadian manufacturer lists Original, Honey, and Cinnamon Vanilla. A single Original row would make the broad `Shreddies` query return one flavor as though the brand family were resolved. Keep the candidate unallocated until a recipe names a variety or picker behavior can represent the brand family without choosing Original by default.

Do not merge this product with `shredded wheat cereal / blé filamenté`; the reviewed manufacturer materials do not establish equivalent grain-forming processes. The recipe bundle has no Shreddies product line. The existing generic shredded-wheat identity is unchanged.

## Evidence

- The manufacturer’s [English Original page](https://www.postconsumerbrands.ca/brand/shreddies/original-shreddies/) and [French brand page](https://www.postconsumerbrands.ca/fr-ca/marques/shreddies-fr/) support `Shreddies Original` and `Shreddies Originale` and list multiple variants.
- Metro’s [Shreddies whole-wheat cereal listing](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-de-ble-entier-format-familial/p/628154437062) supports a Québec-facing product listing and ingredients; its SKU text does not resolve the broader Shreddies family.
- The corpus contains 114 recipes and 1,123 ingredient rows, with no Shreddies mentions or reference links.

## Picker projection

| Query | Current results | With Original row | Decision |
|---|---:|---:|---|
| `Shreddies` | 0 | 1 | Misleading singleton while multiple flavors exist. |
| `Shreddies Original` / `Shreddies Originale` | 0 each | 1 each | Qualified variant queries would be precise, but do not justify a broad family singleton. |
| `shredded wheat cereal` / `shredded wheat` / `blé filamenté` | 1 each | 1 each | Keep the existing generic identity unchanged. |

No reference, alias, form, ledger candidate, measurement, recipe link, conversion, yield, or substitution was added. This documentation-only hold needed no tests or emulator checks.
