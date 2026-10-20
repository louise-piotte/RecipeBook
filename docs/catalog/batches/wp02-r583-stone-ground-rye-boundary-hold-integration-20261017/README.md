# WP02 Section A R583 — stone-ground rye boundary hold

Date: 2026-10-17

## Decision

Keep `stone-ground`, `stoneground`, and `stone-milled` rye as product-level process wording. The current evidence does not support a separate rye extraction/grind identity, a global alias on rye flour, a form under rye flour, or a mapping to whole rye flour or rye meal. The broader A4 rye-class parent remains open.

## Evidence and limits

- Tevah Acres' [Fresh Milled Rye Flour](https://tevahacres.ca/products/fresh-milled-light-rye-flour-1) describes an organic Canadian rye product as stone-milled and whole-grain; it also says multiple passes create exceptionally fine flour. This product-specific wording does not define a shared particle-size or extraction class. The page shows conflicting stock labels, so no availability conclusion is drawn.
- Québec's Moulin Lacoste [Farine de Seigle Entière](https://moulinlacoste.com/index.php/product/farine-de-seigle-entiere/) identifies its product as Québec rye, stone-milled on a stone mill, and T125. These are that product's grade and process details, not a generic rye crosswalk.
- OQLF's [farine de blé entier moulue sur pierre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8361557/farine-de-ble-entier-moulue-sur-pierre) is wheat-specific. It does not establish a Québec rye term or a rye milling equivalence.
- The targeted CFIA grain-products standards define named wheat-flour and grain-product standards; the [Canadian Grain Commission's rye tables](https://www.canada.ca/en/grain-commission/services/grain-quality/official-grain-grading-guide/05-rye/primary-export-grade-determination-tables.html) concern rye grain grades. Neither supplies a consumer rye-flour stone-milling class.
- The already reviewed Moulins Bourgeois catalogue evidence is retained in the [R275 proposal](../../proposals/wp02-section-a-milling-gap-review-r275-20261016.md): that mill pairs stone-ground wording with both T130 and T170 products. R583 adds no source record and does not reopen the R275 T170 hold.

The existing source `WP02-AB-DARK-RYE-GAP-20261012-S01` remains owned by `ingredient-ref-whole-rye-flour`; R583 does not duplicate it or add any new ledger source. No recipe measure, density, unit mapping, form, conversion, yield, recipe link, substitution finding, or active rule was added.

## Picker and bundle checks

- The live package has **1,807 references** and **154 forms**; the ledger has **2,177 records** after R582.
- Current `rye flour` and `farine de seigle` searches each return the six current rye-flour identities. `whole rye flour` and `farine de seigle entière` resolve to whole rye flour; `rye meal` and `gruau de seigle` resolve to rye meal.
- The proposed English stone-ground/milled phrases and French constructions `farine de seigle moulue sur pierre` and `farine de seigle moulue sur meule` return no result. No new alias, row, or form was added.
- The scan covered **114 manifest-listed recipes** and **1,123 structured ingredient rows**. A raw substring search returned three files because `rye` appears inside `fryer` in air-fryer recipe text. Review of those matches found no standalone `rye` or `seigle`, rye ingredient row, or reviewed stone-milling phrase in the bundled recipes.

## Static checks

The proposal and this README pass UTF-8/no-BOM, local-link/anchor, and whitespace checks. The picker projection, current rye-reference ownership, source-ID ownership, and bundle demand checks pass. This was a documentation-only hold; no app tests, build, emulator run, or deployment were needed.

See the [R583 proposal](../../proposals/wp02-next-gap-review-r583-20261017.md), the [open rye extraction/grind checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L10861), the [broader A4 flour-class parent](../../../RecipeBook-global-ingredient-catalog-plan.txt#L1658), and the [R579 dark-rye integration](../wp02-r579-dark-rye-flour-identity-integration-20261017/README.md).
