# WP03 Section L R130 — tomato purée identity

## Decision

Added identity-only `ingredient-ref-tomato-puree`, displayed as `tomato purée / purée de tomates`, in `VEGETABLE_AND_AROMATIC`. OQLF supports the Québec French display and English terms; CFIA separately names tomato purée from canned tomato cuts, tomato pulp, paste, and concentrated paste; Saputo Food Service lists the same canned product name in French and English.

Keep passata separate. Mutti’s product catalogue lists passata/strained tomatoes, polpa/finely chopped tomatoes, paste, and peeled tomatoes as distinct products. Its passata page also uses “Tomato Puree” for its own product, so this row makes no universal equivalence claim and adds no `passata` or `coulis` alias. Metro’s Québec soup recipe uses canned purée and canned diced tomatoes at separate steps; it does not support a substitution.

The new row has no density or unit mappings. No forms, recipe links, measures, conversions, yields, or substitutions were added. The bundled recipe corpus has no tomato-purée line among 114 recipes / 1,123 ingredient rows.

Sources: [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17023077/puree-de-tomates), [CFIA Volume 4](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-4), [Saputo Food Service FR](https://www.saputofoodservice.ca/fr-ca/autres-produits/tomates/puree-de-tomates-en-conserve) / [EN](https://www.saputofoodservice.ca/en/other-products/tomatoes/canned-tomato-puree), [Mutti products](https://mutti-parma.com/can-en/products/) / [passata](https://mutti-parma.com/products/passata/), and [Metro Québec](https://www.metro.ca/recettes-et-occasions/recettes/soupe-aux-tomates).

## Validation

No app, Gradle, unit, instrumentation, or emulator tests were run. `AGENTS.md` says tests are not needed when a change only adds database JSON data. Passed package validation and normalization checks, reference normalization, generated-index freshness, source-ID checks, picker phrase and ambiguity checks, recipe corpus scan, UTF-8/no-BOM checks, local-link checks, whitespace checks, and `git diff --check`.

After both R130 integrations, the package contains 1,480 references and 109 forms; the ledger contains 1,825 records / 7,599 source entries / 6,455 distinct source IDs; the legacy archive remains at 61 candidates. The bundle remains 114 recipes / 1,123 ingredient rows.

See the [proposal](../../proposals/wp03-section-l-tomato-puree-identity-review-20261015-r130.md) and the [global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt). Section L remains open.
