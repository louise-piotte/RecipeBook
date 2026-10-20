# R884–R886 generic ingredient gap integration

Integrated 2026-10-19. The reviews add generic identity diversity across grain milling, produce, and seafood. They do not expand commercial product rosters.

## Accepted changes

- **R884 — buckwheat bran:** added identity-only `buckwheat bran / son de sarrasin` as a common-buckwheat milling fraction. Primary food studies support bran as a separate fraction and document human-food use. The French compound remains provisional pending independent Québec terminology review. Keep Tartary-buckwheat bran flour distinct. Sample fractions, mill settings, sieve sizes, yields, compositions, formulas, and findings remain attached to their studies.
- **R885 — ivy gourd fruit:** added identity-only `ivy gourd fruit (Coccinia grandis) / fruit de courge lierre (Coccinia grandis)` for young green fruit used as a vegetable. Keep the French display provisional: `courge lierre` is attested in a Health Canada natural-health-product ingredient table, not as a Québec culinary-market term. Leaves/shoots, ripe fruit, other gourd crops, and prepared products remain separate.
- **R886 — eel name group:** promoted `candidate-unqualified-eel-identity-boundary` in place to `ingredient-ref-eel-name-group`, visibly qualifying the repeated CFIA `Eel / Anguille` label for *Anguilla dieffenbachii*, *A. japonica*, and *A. rostrata*. The prior unresolved decision and all seven source records remain intact. Québec bare `anguille` remains on American eel; smoked eel, other eel taxa, and named prepared products remain separate. The group is a market-name group, not a taxon or culinary-equivalence claim.

The two new identity records keep measurement and substitution research `not_yet_researched`. No forms, measurements, densities, unit mappings, conversions, yields, recipe links, or substitutions were added. The eel group has only the plural search inflections `eels` and `anguilles`; no species or preparation aliases were added.

## Cross-category scope disposition

The active queue review found no open item whose sole deliverable is a brand, product-line, flavour-family, SKU, or retailer-variant roster. Such work remains out of scope because commercial-product counts do not add ingredient diversity. R884 rechecked the named Anson Mills wheat-meal lead; further product-only research remains out of scope under R875. Preserve the R605 history, all current branded entries, and their product-scoped evidence. No brand row was removed, merged, or generalized, and no product-specific measurement or claim was transferred.

Manufacturer, producer, research, taxonomy, NHP, and fish-label pages remain usable where they support generic identity. Their product-only amounts, formulas, crop yields, NHP preparations, and study results stay scoped to their sources.

## Static validation

- Canonical package: **1,915 ingredient references**, **201 forms**, **114 recipes**, and **1,123 ingredient rows**. Package validation, normalization check, and generated Kotlin index freshness check passed; `BundledIngredientCatalog.kt` contains 1,915 references.
- Research ledger: **2,319 records**, **10,941 source entries**, **9,187 distinct source IDs**, **7,812 distinct source URLs**, and **8 unit conversions**. Ledger schema validation passed with zero errors. R886 has no remaining candidate record; its previous unresolved decision remains preserved on the promoted record.
- Exact static picker projection: `buckwheat bran` and `son de sarrasin` return the new bran row; broad `buckwheat`, `sarrasin`, and `bran` searches gain one distinct result. `ivy gourd`, `courge lierre`, and `Coccinia grandis` return only the new identity; broad `gourd` and `courge` remain multi-result. `eel` and `anguille` each return three visibly distinguishable results, while `eels`, `anguilles`, and `Anguilla` return the qualified name group.
- The manifest-listed recipe corpus was scanned using normalized complete words and phrases: **0 matches** across 114 files and 1,123 ingredient rows. No recipe links were added.
- Reference/source ownership, UTF-8/no-BOM, escaped Unicode in bundled reference JSON, mojibake markers, proposal/README links, plan anchors, and scoped whitespace were checked.
- No software tests, build, emulator, or deployment were run. This change only adds database JSON data, under `AGENTS.md`.

## Files

- Proposals: [R884](../../proposals/wp02-next-generic-grain-gap-review-r884-20261019.md), [R885](../../proposals/wp03-next-generic-produce-gap-review-r885-20261019.md), [R886](../../proposals/wp04-next-generic-seafood-gap-review-r886-20261019.md).
- Shared data: `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`, `docs/catalog/research-ledger.v1.json`, and generated `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt`.
- Checklists and scope notes: `docs/RecipeBook-global-ingredient-catalog-plan.txt`, `roadmap.md`, `docs/catalog/ingredient-catalog-workflow.md`, and `docs/catalog/batches/generic-ingredient-scope-review-20261019/README.md`.

Sections A7, L, and P remain open for generic ingredient coverage and terminology review.
