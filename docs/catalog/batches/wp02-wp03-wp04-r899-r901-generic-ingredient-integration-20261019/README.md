# WP02/WP03/WP04 R899–R901 generic ingredient integration

Date: 2026-10-19  
Scope: generic culinary ingredient diversity across grain milling, plant parts, and seafood naming.

## Decisions

- **R899 — amaranth bran:** added identity-only `amaranth bran / son d’amarante` as `GRAIN_AND_CEREAL`, with no aliases. The French compound is descriptive and provisional. Primary studies support a named amaranth seed-milling fraction and experimental human-food use. The cultivar, oil-processing route, study material, 20% snack formulation, measurements, and outcomes remain study-specific. Root review opened the [Wiley primary milling study](https://aocs.onlinelibrary.wiley.com/doi/abs/10.1007/BF02577853); the [PMC page](https://pmc.ncbi.nlm.nih.gov/articles/PMC9180899/) returned a bot check, while the indexed result and linked university repository copy confirmed the experimental snack paper. [OQLF amarante](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503667/amarante) and [CFIA bran guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/grain-and-bakery-products) support only the source-grain and milling-name components, not the complete French compound or human-food use.
- **R900 — fennel fronds:** added identity-only fresh `fennel fronds / frondes de fenouil` as `HERB`, with part-qualified aliases `fennel leaves` and `feuilles de fenouil`. Keep it separate from fennel bulb, seed, stalks, flowers, pollen, and other plant parts. [UW–Madison Extension](https://hort.extension.wisc.edu/articles/fennel-foeniculum-vulgare/) and [Purdue Extension](https://www.extension.purdue.edu/foodlink/food.php?food=fennel) support culinary foliage use. [Télé-Québec](https://cuisinez.telequebec.tv/recettes/8061/salade-fraises-et-fenouil-au-sumac) and [Josée di Stasio](https://www.joseedistasio.ca/recettes/entrees-et-apero/carpaccio-du-marche/) attest Québec recipe wording and garnish use. Their amounts, storage directions, and garnish alternatives remain recipe/page-specific; no substitution is inferred.
- **R901 — tilapia name group:** added a separate, visibly qualified `tilapia (name used for multiple fish species) / tilapia (nom utilisé pour plusieurs espèces de poissons)` reference as `PROTEIN`, with plural search inflections only. The [official indexed CFIA Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fpresults.asp?cbShowAll=on&cmbIn=e&q=tilapia) show the exact bilingual `Tilapia / Tilapia` name pair for multiple species. Direct query access failed in the browser; root review used the official indexed result table and recorded it as `R901-S01`. The [OQLF entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8367900/tilapia) supports the generic term, and [CFIA common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) describes multi-species group names as a possible naming category. The qualified catalog display is not a taxon, complete membership list, fish-label authorization, preparation state, or culinary-equivalence claim.

For R901, `ingredient-ref-tilapia-fillets`, `ingredient-ref-whole-tilapia`, and the held `candidate-nile-tilapia` remain unchanged with their decisions, sources, and product- or recipe-scoped observations. For R900, existing fennel bulb and seed references remain unchanged. R899 reused reviewed OQLF/CFIA terminology sources only for their narrow naming claims. No product-only measurement or claim was generalized.

The existing rows were not deleted, merged, renamed, or generalized. Removing only the three newly appended references and ledger records reproduces the exact pre-batch R896–R898 reference and ledger fingerprints. This confirms that all prior references and research records, including branded entries and their product-scoped evidence, remain intact.

No forms, densities, unit mappings, observations, measurements, conversions, yields, recipe links, or substitutions were added. New references have null density and empty unit mappings. Measurement and substitution research remains unresearched for all three.

## Cross-category scope review

- R899–R901 selected generic grain milling, plant-part, and seafood-name gaps; they did not research or add commercial brands, product lines, flavours, SKUs, or retailer variants.
- R899 reviewed the queued Anson Mills wheat-meal lead. Further product-only research remains out of scope because another commercial product adds no ingredient diversity. Preserve the historical R605 entry and its product-scoped evidence; the generic wheat-meal question remains unresolved.
- R900 found no Section K roster-only assignment. The Broccolini trademark/alias exclusion is a prior boundary, not a pending research task. R901 found no Section P roster-only task.
- The two explicit Section F cereal-mix commercial-roster clauses remain out of scope because commercial-product counts do not add ingredient diversity; their generic diversity coverage stays open. No additional roster-only assignment was found in the reviewed queue.
- Existing branded references and their product-specific evidence were preserved. Manufacturer sources remain usable for generic claims only when their statements transfer beyond the named product. No product-specific measurements or claims were transferred in this batch.

## Picker and recipe checks

The static projection follows [`IngredientSearch.kt`](../../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): complete normalized word phrases take precedence, with substring fallback only when there is no phrase match.

- `amaranth bran` and `son d’amarante` resolve to the new bran row. Broad `amaranth` / `amarante` and `bran` searches each gain one row; no bare crop, bran, or son alias was added.
- `fennel fronds`, `fennel leaves`, `frondes de fenouil`, and `feuilles de fenouil` resolve to the foliage row. Broad `fennel` / `fenouil` gains one part-qualified result; existing bulb and seed phrases remain on their current rows.
- `tilapia` grows from the two existing active product-form results to three, including the qualified name group. `tilapias` resolves to the group. Existing tilapia-fillets and whole-tilapia phrases remain on their respective rows; no Nile species alias is added.
- All 114 manifest-listed recipes / 1,123 structured ingredient rows were scanned for the proposed terms; there were no candidate-specific recipe matches. No recipe line, quantity, or link was added.

## Data and validation

After integration the package contains **1,930 references / 201 forms / 114 recipes / 1,123 ingredient rows**. The ledger contains **2,333 records / 11,004 source entries / 9,231 distinct source IDs / 7,850 distinct URLs / 8 unit conversions**.

Passed:

- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only`
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`
- `validate_research_ledger()`: 2,333 records, 0 errors
- Exact reference/source ownership, source transferability review, static picker projection, preservation checks for existing fennel and tilapia rows/candidate, and the 114-recipe / 1,123-row scan
- UTF-8/no-BOM, escaped bundled JSON, local Markdown links/anchors, and scoped whitespace checks

No software tests, build, emulator, or deployment were run because the active ingredient additions only add database JSON data, as permitted by `AGENTS.md`.

## File fingerprints

- `ingredient-references.v1.json`: `dd3773adee9d6a3c9750cba37aac2385be09b43a429c7061eb032a1a4d5aacf4`
- `research-ledger.v1.json`: `e2e7f8b10b6cf57198b2dce099f3f8d12e48fe6fcb32f8dbc54bf18f414ab85a`
- `BundledIngredientCatalog.kt`: `9c382758c0475f5a70dd4b66853044151a8676468884a8cdc5843f4abf432396`
- Prior R896–R898 snapshot recovered after excluding only this batch's additions: references `a33922a3158ec8e5ea056ab677ec88bb548c20021493a0f9ab35ab27ea4da2a7`; ledger `4db499e82dcfbb3fbd75f803aefd9814dacc602728e6c627bb8836ef53315656`.

Sections A7, K, and P remain open for other generic ingredient gaps.
