# WP04 Section O pork-loin-chop display integration — R297 — 2026-10-16

## Decision

Updated the existing ingredient-ref-pork-loin-chops English display to boneless pork loin chops, retaining côtelettes de longe de porc désossées, category PROTEIN, and both empty alias arrays. CFIA item 1413 supports the bilingual boneless cut wording. OQLF's center-cut term is narrower and was used only as a boundary.

Recipe 095#1 already requests boneless pork loin chops and remains linked to the same reference. Mayrand's nine-piece package listing is product-specific; no general chop weight was derived. The ledger marks identity verified only. Measurement and substitution states remain not_yet_researched. No form, measure, conversion, yield, or active substitution was added.

## Data changes

- app/src/main/assets/seed/bundled-library/ingredient-references.v1.json: corrected the English display on the existing identity.
- docs/catalog/research-ledger.v1.json: recorded four sources and the accepted identity decision.
- docs/catalog/batches/protein-dairy-identities.md: updated the active display and closed the bilingual naming review.
- docs/RecipeBook-global-ingredient-catalog-plan.txt and roadmap.md: recorded R297; broader Section O remains open.
- BundledIngredientCatalog.kt: regenerated from the canonical bundled reference JSON.

## Verification

Static seed-package normalization/validation, reference normalization, generated-index freshness, ledger schema/source ownership, picker projection, 114-recipe/1,123-row corpus scan, UTF-8/no-BOM and escaped seed Unicode checks, local links, and scoped whitespace checks passed. Final catalog totals after R296 and R297: 1,666 references, 127 forms, 2,016 ledger records, 8,899 source entries, 7,536 distinct source IDs, and 6,297 distinct source URLs.

No software tests, builds, or emulator checks were run because these changes update bundled database JSON and related catalog documentation, as directed by AGENTS.md.

## References

- [R297 proposal](../../proposals/wp04-section-o-pork-loin-chop-bilingual-display-review-r297-20261016.md)
- [CFIA: Pork wholesale nomenclature — English](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products/wholesale-meat/pork)
- [CFIA: Nomenclature du porc — français](https://inspection.canada.ca/fr/etiquetage-aliments/etiquetage/industrie/produits-viande-volaille/viande-vendue-gros/porc)
- [OQLF: côtelette désossée milieu de longe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428048/cotelette-desossee-milieu-de-longe)
- [Mayrand: Côtelettes de longe de porc désossées 160 g x9](https://mayrand.ca/fr/nos-produits/boucherie/porc/porc-cotelette-longe-desossee-fr-50220)
