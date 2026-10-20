# Khorasan wheat grain identity integration — 2026-10-12

Added identity-only **Khorasan wheat / blé khorasan** as
`ingredient-ref-khorasan-wheat-grain` in `GRAIN_AND_CEREAL`, scoped to intact food-grade kernels.
The OQLF lists *blé khorasan* as its preferred French term, gives *Khorasan wheat* in English, and
identifies Kamut wording as a trademark. A Québec retailer lists the bilingual Khorasan product and
its ingredient name; Canadian whole-grain listings corroborate the intact-kernel boundary. Sources:
[OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26533000/ble-khorasan),
[Artisan Tradition FR](https://www.artisan-tradition.ca/grains-cereals),
[Artisan Tradition EN](https://www.artisan-tradition.ca/en/grains-cereals),
[Fieldstone Organics](https://www.fieldstoneorganics.ca/product/organic-whole-grain-khorasan/),
[Storehouse Foods](https://storehousefoods.ca/collections/grains-cereals/products/organic-kamut-berries).

Keep Khorasan flour, Khorasan flakes, durum wheat berries, generic wheat berries, and composite
cereals separate. Keep `Kamut`, `Kamut wheat`, and `blé Kamut` out of generic aliases. The OQLF
describes Khorasan as a variety of durum wheat; the qualified Khorasan identity preserves the
product distinction without claiming a separate species. `Khorasan wheat` and `blé khorasan` each
have one exact active reference owner. Broad Khorasan searches continue to surface related products.

The complete 114-recipe, 1,123-row bundle has no matching phrase demand or links. The retailer's
soak/cook directions and approximate yield remain product-specific. Fieldstone's cooking paragraph
contains an emmer wording mismatch, so it was excluded from numeric evidence. No aliases, forms,
measures, density, unit mappings, recipe links, conversions, yields, or substitutions were added.

## Package snapshot and static validation

- 1,298 ingredient references, 98 forms, 1,606 ledger records, and 114 manifest recipes.
- Bundled-package validation and normalization checks passed.
- Generated catalog is current at 1,298 references.
- Ledger validation passed with zero errors.
- Exact-key ownership and full recipe-corpus phrase scans passed.
- Touched JSON is UTF-8 without BOM and retains explicit Unicode escapes; scoped whitespace checks passed.
- No app tests or emulator checks were run because this change adds database JSON data under the
  current `AGENTS.md` rule.

Review record: [proposal](../../proposals/wp03-section-f-next-batch-20261012.md).
