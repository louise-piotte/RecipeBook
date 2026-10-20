# WP04 Section P R131 — Eastern oyster identity

## Decision

Added identity-only `ingredient-ref-eastern-oyster` for *Crassostrea virginica*, displayed as `Eastern oyster / huître de l’Est`, in `PROTEIN`. Aliases are limited to source-qualified Eastern, American, and Atlantic names. DFO’s bilingual bivalve guide directly supports the display pair and Canadian species context; CFIA guidance explains the species-linked Canadian naming list. OQLF’s notes are why Malpèque and Caraquet product names and the France/Europe wording `huître américaine` stay out of the Québec aliases.

The generic fresh-oyster candidate remains unresolved. Pacific oyster and dried oyster remain separate, and broad oyster queries remain multi-result. No forms, measures, density, mappings, yields, conversions, recipe links, or substitutions were added. The recipe bundle contains no matching demand.

Sources: [DFO French species guide](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-fra.htm), [DFO English species guide](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm), [CFIA common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names), [ITIS](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=79872), [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198865/huitre), [Metro Québec](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/fruits-de-mer-frais/huitres/huitres-malpeque/p/836443006084), and [Mayrand](https://mayrand.ca/en/our-products/fish-and-seafood/oyster/huitre-malpeque-53986).

## Validation

No app, Gradle, unit, instrumentation, or emulator tests were run because the active changes only add database JSON data. Passed bundled-package validation and normalization checks, reference normalization, generated-index freshness, source-ID and ledger ownership checks, picker projections, recipe-corpus scan, UTF-8/no-BOM, local-link, whitespace, and scoped `git diff --check` checks. The package now contains 1,482 references and 109 forms; the ledger has 1,827 records / 7,613 source entries / 6,469 distinct source IDs; the library remains 114 recipes / 1,123 ingredient rows.

The generic oyster candidate remains unresolved; the Section P parent remains open for other shellfish and seafood boundaries.

See the [proposal](../../proposals/wp04-section-p-eastern-oyster-identity-review-r131-20261015.md) and [global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt).
