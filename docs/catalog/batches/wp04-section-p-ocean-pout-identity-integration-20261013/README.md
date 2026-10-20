# WP04 Section P ocean pout identity integration

Reviewed and integrated on 2026-10-13 from [the proposal](../../proposals/wp04-section-p-ocean-pout-identity-review-20261013.md).

## Decision

Add identity-only `ocean pout / loquette d’Amérique` as `ingredient-ref-ocean-pout` in `PROTEIN`. OQLF and Canadian government naming identify the species and bilingual display; Québec food-use sources describe occasional bycatch availability. Keep the preferred French display qualified and leave both alias arrays empty. Do not add forms, recipe links, measures, density, mappings, conversions, edible yields, or substitutions.

The research ledger records the verified identity and unsupported reusable-measure/substitution findings. It reuses existing CFIA Fish List source ID `WP04-SECTIONP-BLUE-CRAB-IDENTITY-20261013-R5-S04`. The recipe corpus has no species-term demand. In picker projection, `ocean pout` and `loquette d’Amérique` select the new row; `pout` replaces the old unrelated mamey sapote substring result with the fish; the qualified French display makes bare `loquette` searchable without changing the displayed name. No competing fish result was suppressed.

## Files

- Active reference: `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- Research evidence: `docs/catalog/research-ledger.v1.json`
- Generated import index: `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt`
- Plan and roadmap: `docs/RecipeBook-global-ingredient-catalog-plan.txt`, `roadmap.md`
- Proposal: [Ocean Pout identity review](../../proposals/wp04-section-p-ocean-pout-identity-review-20261013.md)

Static reference/package, ledger, ownership, picker-projection, recipe, generated-index, UTF-8/no-BOM, link, and whitespace checks passed. No tests or emulator checks were run under the database-JSON-only rule in `AGENTS.md`.
