# WP03 Section U lovage identity integration — R296 — 2026-10-16

## Decision

Added ingredient-ref-lovage as lovage / livèche in HERB, with aliases limited to lovage leaf, lovage leaves, feuille de livèche, and feuilles de livèche. The row represents the leafy culinary herb. Celery-like vernacular names, other plant parts, essential oil, and prepared products remain outside it.

The ledger records OQLF, Ville de Montréal Espace pour la vie, and UQAC evidence. UQAC mentions replacement for celery only in salted-herb mixtures or celery salt, without a ratio or broader context. That mention is recorded as qualitative evidence; no active substitution rule was added. No recipe demand, forms, measures, mappings, conversions, yields, or recipe links were found or added.

## Data changes

- app/src/main/assets/seed/bundled-library/ingredient-references.v1.json: added one identity-only HERB reference.
- docs/catalog/research-ledger.v1.json: added the three sources, accepted identity decision, and bounded no-rule substitution finding.
- BundledIngredientCatalog.kt: regenerated the picker index from the bundled JSON.
- docs/RecipeBook-global-ingredient-catalog-plan.txt and roadmap.md: recorded R296; Section U remains open.

## Verification

Static seed-package normalization/validation, reference normalization, generated-index freshness, ledger schema/source ownership, exact picker projection, 114-recipe/1,123-row corpus scan, UTF-8/no-BOM and escaped seed Unicode checks, local links, and scoped whitespace checks passed. Final catalog totals after R296 and R297: 1,666 references, 127 forms, 2,016 ledger records, 8,899 source entries, 7,536 distinct source IDs, and 6,297 distinct source URLs.

No software tests, builds, or emulator checks were run because these changes add bundled database JSON data and related catalog documentation, as directed by AGENTS.md.

## References

- [R296 proposal](../../proposals/wp03-section-u-lovage-identity-review-r296-20261016.md)
- [OQLF GDT: livèche](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3694734/liveche)
- [Espace pour la vie / Jardin botanique de Montréal: Livèche](https://m.espacepourlavie.ca/carnet-horticole/liveche)
- [UQAC Forêt nourricière: Livèche](https://www.uqac.ca/foretnourriciere/fines-herbes-epices-et-aromates/liveche/)
