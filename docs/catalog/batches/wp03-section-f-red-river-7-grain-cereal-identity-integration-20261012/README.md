# WP03 Section F Red River 7 Grain Hot Cereal identity integration (2026-10-12)

## Decision

Added identity-only `Red River 7 Grain Hot Cereal / Céréales chaudes Red River 7 grains`
as `ingredient-ref-red-river-7-grain-hot-cereal` in `GRAIN_AND_CEREAL`. The English manufacturer
product title and the French title on Arva's Canadian retailer listing support this branded blend.
Kept it separate from Original Red River cereal, Arva's non-original cream-of-whole-wheat cereal,
the component grains and seeds, generic hot cereal, and cooked porridge.

The shorter manufacturer recipe term `Red River 7 Grain Cereal` and the French Canadian product
title variant `Red River Céréales Chaudes 7 Grains` are recorded as aliases. Generic
`hot cereal`, `céréales chaudes`, `7 grain cereal`, and `céréales à 7 grains`
remain unassigned. The broad `Red River` picker query can now find both the original and 7-grain
products; no broad alias was added.

## Numeric and recipe boundary

Arva's spice-muffin recipe uses 1 cup of the 7-grain cereal in a 12-muffin yield, and Canadian
listings give a 685 g bag. Both facts remain source-specific. Neither establishes an app cup weight,
serving measure, density, unit mapping, reusable yield, form conversion, or substitution. The
manifest-listed corpus audit found no demand for the new product across 114 recipes and 1,123
ingredient rows; no recipe links were added.

The new research-ledger record retains the product identity evidence and records that no reusable
measurement or substitution is supported. The full source register and ownership audit are in the
[review proposal](../../proposals/wp03-section-f-next-gap-review-20261012-round3.md).

## Validation

- Seed package normalization and validation, generated ingredient-index freshness, reference and
  ledger validation, source/alias ownership, and the manifest-listed corpus scan passed.
- JSON text is UTF-8 without BOM, with non-ASCII French characters stored as Unicode escapes.
- No app tests or emulator checks were run because this change only adds database JSON data and its
  derived index entry.
