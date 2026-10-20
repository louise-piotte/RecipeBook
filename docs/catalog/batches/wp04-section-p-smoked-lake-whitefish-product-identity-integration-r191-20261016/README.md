# WP04 Section P smoked lake whitefish integration (R191)

## Decision

Added identity-only `smoked lake whitefish / grand corégone fumé` for the species-scoped finished-food product *Coregonus clupeaformis*. Kept generic `smoked whitefish / poisson blanc fumé` unallocated. Do not assign the species-unknown Oushata or FirstFish products to this reference, and do not add a smoked form to raw lake whitefish.

The French and English name is supported by the Ontario government's bilingual smoked-lake-whitefish dip recipes and the Québec OQLF species entry. Freshwater Fish Marketing Corporation identifies grand corégone as *Coregonus clupeaformis* and describes it as popular smoked. Oushata's Wendake listing and FirstFish's Toronto listing use unqualified corégone/whitefish wording without a species, supporting the generic boundary. The Québec-origin 160 g whitefish spread is a composite product, not a plain smoked-fish measure.

The picker now returns both raw lake whitefish and smoked lake whitefish for species-only searches such as `whitefish`, `lake whitefish`, `grand corégone`, and `corégone`; the product-state qualifier remains visible. The qualified phrases `smoked lake whitefish` and `grand corégone fumé` return the new row. The corpus scan found no matching demand across 114 recipes and 1,123 ingredient rows.

## Data added

- Reference `ingredient-ref-smoked-lake-whitefish` in `PROTEIN` with empty aliases, null density, and empty unit mappings.
- One `ingredient_reference` ledger record with verified identity, no supported reusable measurement, and a bounded no-supported-substitute finding.
- Six new source entries. Reused the existing CFIA and OQLF lake-whitefish source IDs for the species and Québec terminology boundaries rather than registering duplicate URLs.

No forms, measurements, recipe links, conversions, yields, or substitutions were activated.

## Files updated

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt`
- `docs/catalog/research-ledger.v1.json`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `docs/catalog/proposals/wp04-section-p-smoked-lake-whitefish-product-identity-review-r191-20261016.md`
- `roadmap.md`

## Evidence reviewed

- Freshwater Fish Marketing Corporation, [Espèces](https://freshwaterfish.com/especes/).
- Foodland Ontario, [Smoked Lake Whitefish Dip](https://www.ontario.ca/foodland/recipes/smoked-lake-whitefish-dip) and [Trempette de grand corégone fumé](https://www.ontario.ca/fr/terre-nourriciere/recette/trempette-de-grand-coregone-fume).
- OQLF, [grand corégone](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199106/grand-coregone), which pairs the Québec preferred term with *Coregonus clupeaformis* and explains that `poisson blanc` is not species-specific.
- Oushata, [Fumoir artisanal](https://oushata.com/); FirstFish, [Hot Smoked Whole Whitefish](https://www.firstfish.ca/product-page/smoked-whitefish); La Ferme Black River, [Smoked Whitefish Spread](https://lfbr.ca/product/smoked-whitefish-spread/).

## Verification

- Independent review confirmed source scope, the exact French species term, and the boundary around generic smoked whitefish.
- Static package validation and normalization passed; the generated picker catalog is current with 1,572 references. The nine scoped picker projections and the 114-file recipe corpus scan passed, with no candidate hits.
- The six new source IDs each map to one URL; the existing CFIA and OQLF lake-whitefish sources were reused. Scoped UTF-8/no-BOM, escaped-Unicode, local-link, and whitespace checks passed.
- No software tests were run because this change only adds database JSON data under `AGENTS.md`.
