# R872 generic triticale-bran identity integration

Reviewed and integrated 2026-10-19. This batch adds one generic cereal milling ingredient.

## Identity and scope

Added `ingredient-ref-triticale-bran` with the displays `triticale bran / son de triticale`, category `GRAIN_AND_CEREAL`, and empty aliases. The English identity is the edible bran fraction separated from triticale grain during milling. The French compound remains provisional: OQLF supports the base terms `triticale` and `son`, but does not establish this compound as preferred Québec food wording. No OQLF-approved compound or Québec retail label is claimed.

Triticale bran remains separate from triticale grain, flour, flakes, the unresolved triticale-meal candidate, and bran from other grains. Do not extend this identity to feed or distilling fractions, shorts, mill-feed, bran-containing blends, extracts, cultivar labels, or milling grades. No aliases, forms, measures, density, unit mappings, recipe links, conversions, yields, or substitutions were added. Measurement and substitution research remain `not_yet_researched`.

## Evidence and transfer limits

- The 2024 primary milling study distinguishes coarse and fine triticale-bran fractions from flour and whole-grain fractions. Its mill procedure, cultivar samples, and composition stay study-specific.
- A 2012 Carleton University study documents triticale bran in yogurt. Its 4% inclusion ceiling and formula behavior remain specific to that yogurt study and are not a generic serving or substitution rule.
- A 2021 study documents bran milled from selected Polish triticale cultivars and one bran-enriched bread formula. Its 10% formula inclusion and analytical results are not generalized.
- OQLF GDT entries for [triticale](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8480832/triticale) and [son](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432756/son) support only the base terms. CFIA's [grain and bakery labelling guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/grain-and-bakery-products) supports naming the grain for bran from a non-wheat source; this does not establish human-food use or French terminology.

The [R872 proposal](../../proposals/wp02-generic-triticale-bran-identity-review-r872-20261019.md) contains the detailed source and ownership audit.

## Catalog, picker, and recipe audit

At integration, the catalog contains **1,902 references** and **201 forms**. The ledger contains **2,310 records**, **10,895 source entries**, **9,150 unique source IDs**, **7,781 unique source URLs**, **891 measurement observations**, and **370 substitution findings**. The recipe bundle remains **114 files / 1,123 ingredient rows**, with corpus digest `a34eb3aeb00221395c00859699bc52a295237ebef947b5abbd7a70e18a1ddc17`.

Exact queries `triticale bran` and `son de triticale` resolve to the new identity only. Broad `triticale` and `bran` queries remain multi-result and preserve existing grain, flour, flakes, and other bran identities. All 114 manifest-listed recipes and 1,123 ingredient rows were scanned; no triticale or triticale-bran hit was found, and no recipe link was added.

No existing identity or source record was renamed, merged, or deleted. The existing branded rows and their product-specific evidence remain intact. The workflow queue audit found no open A7 task whose sole purpose is a brand/product roster. Any future roster-only expansion is out of scope because commercial product counts do not add ingredient diversity.

## Static checks

Passed:

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`
- Research-ledger JSON Schema Draft 2020-12 validation.
- Reference/ID/source ownership, decision-source coverage, recipe scan, picker projection, UTF-8/no-BOM, explicit Unicode escaping in bundled JSON, local links, plan anchors, and scoped whitespace checks.

No software tests, build, emulator, or deployment were run. The active catalog changes only add database JSON data, which `AGENTS.md` exempts from tests.
