# R869–R870 generic seafood and edible-flower integration

Reviewed and integrated 2026-10-19. This batch adds two generic culinary identities and no commercial product roster.

## Integrated identities

- Added `ingredient-ref-mackerel-market-group` with the displays `mackerel (name used for multiple fish species)` and `maquereau (nom utilisé pour plusieurs espèces de poissons)`. CFIA applies the exact paired Canadian label to multiple taxa. This is a qualified market-name group, not a biological taxon or a claim that the fish are interchangeable. Atlantic, Indian, Pacific, short, Spanish, and other species-qualified rows remain separate, as do canned, tomato-sauce canned, and smoked mackerel.
- Added `ingredient-ref-chive-blossoms` for the edible flowers of correctly identified, food-grown *Allium schoenoprasum*, displayed as `chive blossoms / fleurs de ciboulette` with `chive flowers` as a qualified English alias. Keep garlic-chive flowers, other *Allium* species, ornamental flowers, chive preparations, base chives, and Chinese chives separate. The RICARDO source supports the French culinary wording but is not an OQLF terminology ruling.
- Both ledger records are identity-verified. Measurement and substitution states remain `not_yet_researched`. No forms, measures, densities, mappings, recipe links, conversions, yields, or substitutions were added. The Alaska Extension chive-flower amount remains specific to its recipe and was not transferred to the catalog.

## Evidence

- Mackerel terminology: [OQLF GDT, *maquereau*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198842/maquereau). The [CFIA Fish List mackerel query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?c=&lang=e&q=Mackerel) shows the paired `Mackerel / Maquereau` label for more than one taxon. The [CFIA Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) describes its bilingual label and scientific-name scope. These sources support naming only, not culinary equivalence or current retail availability.
- Common-chive flowers: [University of Maryland Extension](https://extension.umd.edu/resource/chives) identifies *Allium schoenoprasum* and its edible flowers; [Colorado State University Extension](https://extension.colostate.edu/resource/edible-flowers/) lists common chives and garlic chives separately; [University of Alaska Fairbanks Cooperative Extension](https://www.uaf.edu/ces/publications/database/food/edible-flowers.php) documents culinary use of the blossoms and florets; [RICARDO](https://www.ricardocuisine.com/chroniques/recettes/1726-cueillette-printaniere-5-fleurs-du-jardin-a-mettre-au-menu) uses `fleurs de ciboulette` in Québec culinary writing. None of the source-specific quantities is used as a generic measure.

The [R869 proposal](../../proposals/wp04-generic-mackerel-market-group-review-r869-20261019.md) and [R870 proposal](../../proposals/wp03-generic-chive-blossom-diversity-review-r870-20261019.md) retain the detailed ownership, source limits, and review notes.

## Catalog and picker audit

At integration, the catalog contains **1,901 references** and **201 forms**. The ledger contains **2,309 records**, **10,889 source entries**, **9,146 unique source IDs**, **7,778 unique source URLs**, **891 measurement observations**, and **370 substitution findings**. The recipe bundle remains **114 files / 1,123 ingredient rows**, with corpus digest `a34eb3aeb00221395c00859699bc52a295237ebef947b5abbd7a70e18a1ddc17`.

A phrase-first projection matching `IngredientSearch.kt` gives these relevant results:

| Query | Results |
|---|---|
| `mackerel` | 11 references, including the qualified group and all existing species/preparation entries |
| `maquereau` | 8 fish references plus the unrelated gooseberry result |
| Exact qualified English or French mackerel display | The market-name group only |
| `chive blossoms`, `chive flowers`, `fleurs de ciboulette` | The new flower identity only |
| `chive` | Base chives and chive blossoms |
| `ciboulette` | Base chives, Chinese chives, and chive blossoms |
| `chives` | Base chives and Chinese chives; unchanged by the singular flower term |

The 114 manifest-listed recipes and 1,123 ingredient rows were scanned. No recipe file or ingredient row mentions mackerel, maquereau, chive blossoms/flowers, `fleurs de ciboulette`, or *Allium schoenoprasum*. No recipe links were added.

## Scope disposition and preservation

The user clarified that the generic-only scope applies across ingredient types. The queue audit found no open plan item whose sole task is expanding a brand, product line, flavor family, or retailer-specific roster. Any such roster expansion is marked out of scope because commercial-product counts do not add ingredient diversity. Existing branded rows and product-scoped evidence remain intact; no existing row was deleted, merged, or generalized. Manufacturer pages remain eligible evidence when their claims truly apply to a generic ingredient, and product-only measurements remain scoped to the named product.

Current follow-ups R871, R872, and R873 cover generic seafood, milling, and produce gaps.

## Static checks

Passed:

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`
- Research-ledger JSON Schema Draft 2020-12 validation.
- Reference ID/name/alias normalization, ledger source ownership, decision-source coverage, recipe scan, picker projection, UTF-8/no-BOM, explicit Unicode escaping in bundled JSON, local links, plan anchors, and scoped whitespace checks.

No software tests, build, emulator, or deployment were run. The active catalog changes only add database JSON data, which `AGENTS.md` exempts from tests.
