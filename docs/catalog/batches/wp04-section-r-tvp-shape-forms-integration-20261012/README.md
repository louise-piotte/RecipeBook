# WP04 Section R TVP shape-form integration — 2026-10-12

## Catalog decisions

- Added four commercial shape forms beneath existing `ingredient-ref-textured-vegetable-protein`: flakes, small pieces, strips, and balls. OQLF's 2025 entry defines the generic product as an extruded, dehydrated plant-protein product and lists these four shapes. English labels for each shape are descriptive renderings; OQLF supplies the bilingual parent identity and French shape list.
- The Québec manufacturer Les Brutes sells a soy-based `PVT Lanières de soya / TVP Soy Curls` product. Kept its wording product-scoped; it is not a generic `soy curls` alias. Butler's branded whole-soybean Soy Curls product has a different product/process description, so the unqualified candidate remains unresolved.
- Kept soy-specific textured protein/PST outside generic TVP aliases. Catch-all plant-based mince and sausage remain held as formulated products whose composition and labels vary.
- Did not add dry/rehydrated forms, ingredient source species, form aliases, recipe links, measures, densities, hydration ratios, conversions, yields, or substitutions.

## Recipe and package audit

The scan of all 114 bundled recipes / 1,123 ingredient rows found no target TVP, PST, soy-curl, plant-mince, or plant-sausage ingredient row. No recipe data changed.

The package has 1,152 references / 83 forms / 114 recipes / 1,123 ingredient rows; 68 legacy candidates; and 1,453 ledger records / 4,853 source entries / 3,962 distinct source IDs / 8 unit conversions.

## Sources

- OQLF, [protéine végétale texturée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086121/proteine-vegetale-texturee) and [protéine de soya texturée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26560132/proteine-de-soya-texturee).
- Les Brutes Québec, [PVT Lanières de soya](https://lesbrutes.ca/products/pvt-lanieres-de-soya) and [TVP Soy Curls](https://lesbrutes.ca/en/products/tvp-soy-curls).
- Butler Foods, [Soy Curls](https://www.butlerfoods.com/soycurls) and [FAQ](https://www.butlerfoods.com/frequently-asked-questions.html).
- CFIA, [simulated meat and poultry products](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products/simulated-products), for the distinct formulated-product boundary.

## Static validation

Seed normalization/checking, package validation, ledger validation, exact-key ownership, the 114-recipe demand scan, UTF-8/no-BOM, and scoped whitespace checks passed after integration. No tests or emulator checks were run because this change only adds database JSON data, as directed by `AGENTS.md`.
