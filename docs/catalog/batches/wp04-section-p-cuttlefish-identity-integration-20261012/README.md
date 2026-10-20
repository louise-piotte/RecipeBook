# WP04 Section P cuttlefish identity integration — 2026-10-12

## Decision

Promoted the held `ingredient-ref-cuttlefish` ledger candidate to the identity-only reference
`cuttlefish / seiche` in `PROTEIN`. OQLF supplies the Québec food-mollusc term and *Sepia* scope;
CFIA pairs the generic name with *Sepia* spp. and *S. pharaonis*. Current Canadian wholesale and
retail listings corroborate the product name, while Azuma Foods and Metro Québec attest French
product wording. The entry does not select a species, recipe demand, harvest origin, or preparation.

The active row has no aliases. `squid` remains on calamari; `seiches`, Latin `Sepia`, named
cuttlefish species, ink, and prepared products remain separate. No forms, recipe links, measures,
density, unit mappings, conversions, yields, or substitutions were added. The full 114-recipe corpus
has no cuttlefish or seiche text hit.

The six new source IDs were appended to the existing cuttlefish ledger candidate, which was changed
from `candidate` / `needs_clarification` to `ingredient_reference` / `verified`. The unresolved hold
decision was replaced with the accepted identity decision. Existing OQLF seiche and CFIA labeling
sources remain attached and were not duplicated.

## Changed files

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- `docs/catalog/research-ledger.v1.json`
- `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt` (regenerated)
- `docs/catalog/proposals/wp04-section-p-cuttlefish-identity-gap-sweep-20261012.md`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `docs/catalog/ingredient-catalog-workflow.md`
- `roadmap.md`

## Static validation

The package has 1,218 references, 86 forms, 114 recipes / 1,123 ingredient rows, 66 legacy
candidates, and 1,520 ledger records / 5,139 source entries / 4,202 distinct source IDs / 8 unit
conversions. The generated Kotlin catalog contains 1,218 references.

- `python3 -B tools/seed_package/normalize_bundled_seed_package.py --validate-only` — passed.
- `python3 -B tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — passed.
- `validate_research_ledger()` through `tools/seed_package/bundled_seed_package.py` — passed.
- Exact normalized ownership across references, forms, and legacy candidates — passed.
- Manifest-listed recipe scan — passed; zero cuttlefish/seiche/*Sepia* hits.
- UTF-8 without BOM and scoped `git diff --check` — passed.

No tests or emulator checks were run because this integration only adds database JSON data and its
generated index under the current `AGENTS.md` rule.

See the [source-backed proposal](../../proposals/wp04-section-p-cuttlefish-identity-gap-sweep-20261012.md).

## Snapshot fingerprints

| Artifact | SHA-256 / digest |
| --- | --- |
| Ingredient references (1,218) | `a446785f1cd9b409d9220ab6471dff9b9834ff7a7c9333bcbcae49352ff43933` |
| Research ledger (1,520 records) | `a8c9e1e7597d29535831c7b43d3bb5627f5f78905567add80753ea61b51d68d2` |
| Generated Kotlin catalog | `453204d42068302ec9ec1891e93c9a649f96e1714c8a79f046fd96676ca9aade` |
| Manifest-listed recipe corpus | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
