# WP04 Section R natto and mycoprotein integration

- Date: 2026-10-12
- Status: two identity-only references are integrated; broader Section R remains open.
- Review packet: [remaining plant-protein product-boundary review](../../proposals/wp04-section-r-remaining-plant-protein-products-gap-review-20261012.md).
- Related batch: [tofu product integration](wp04-tofu-product-boundaries-integration-20261012/README.md).

## Integrated decisions

- Added identity-only `natto / natto` under `PROTEIN`, using Canadian bilingual food naming and Montréal maker evidence. It remains distinct from tempeh, tofu, fermented bean curd, douchi, and generic textured protein.
- Added identity-only `mycoprotein / mycoprotéine` under `PROTEIN`, using the OQLF term pair. It remains distinct from mushroom fruiting bodies, soy proteins, and shaped finished products.
- No recipe ingredient line matched either identity. No aliases, forms, measurements, conversions, yields, or substitutions were added.

## Held boundaries

- Keep the existing generic TVP/PVT identity separate from soy-specific textured protein/PST; no PST/TSP aliases were added.
- Keep generic soy curls on hold. The reviewed sources establish Butler's named product but not a generic Québec French product name or cross-product TVP equivalence.
- Do not create a catch-all plant-based mince or sausage identity. Review exact product wording and formulation only when a recipe line needs it. Recipe 095's tempeh note and all unrelated sausage/meat rows remain unchanged.

## Evidence

- Health Canada's [Canadian Nutrient File entry](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3320) pairs `Soybean, fermented products, natto` with `Soya, produits fermentés, natto`. Montréal producer [Natto Mtl](https://nattomtl.com/) provides current Québec-market product wording. Nutrient values and serving sizes were not transferred to the catalog.
- OQLF's 2025 [mycoprotéine entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26578857/mycoproteine) supplies the bilingual term pair and defines the food identity by edible fungal mycelium and fermentation. It does not establish a specific strain, finished shape, or recipe substitution.
- The proposal also checked CFIA's [simulated meat product guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products/simulated-products) and the prior OQLF entries for PST and generic TVP. Product/label variation supports keeping formulated mince and sausage terms tied to an exact future product.

## Data checks

The package contains 1,132 references / 79 forms / 114 recipes / 1,123 ingredient rows. The legacy-candidate file has 71 entries. The ledger contains 1,429 records / 4,762 source entries / 3,899 distinct source IDs / 8 unit conversions.

Seed-package validation and normalization checks passed; the generated Kotlin index is current; the research ledger validates with no errors. Exact phrase checks found one owner per new name across references, forms, and legacy candidates. The 114-recipe scan found no matching ingredient rows. UTF-8/no-BOM and scoped `git diff --check` passed. No tests or emulator checks were run because this change only adds database JSON data, consistent with `AGENTS.md`.
