# WP02/WP03/WP04 R864–R866 — generic ingredient diversity review

## R864 — barley-meal hold

The existing `candidate-barley-meal` remains `needs_clarification`. The proposed current Statistics Canada questionnaire page could not be opened directly; the accessible French SCPAN class confirms only that barley meal is not among its selected illustrative examples. That omission does not establish a Québec French name or a consumer boundary between meal and grits. The existing candidate already contains the conflicting product-specific uses and terminology evidence, so this review adds no source, active reference, or numeric behavior. Existing product evidence remains scoped to its named products.

## R865 — tomato pulp

Added identity-only generic `ingredient-ref-tomato-pulp`, displayed as `tomato pulp / pulpe de tomates` in `VEGETABLE_AND_AROMATIC`.

- OQLF provides the preferred Québec French name and its English translation; its entry dates to 1979 and remains a terminology-age limitation.
- CFIA Volume 4 names tomato pulp separately from canned tomato cuts, purée, paste, and concentrated paste. Volume 10, section 10.2.7, defines the standardized product and sets a specific-gravity threshold. These criteria are scoped to that product class; they are not kitchen measurements or reusable ingredient density.
- Existing purée and passata rows remain unchanged. Tomato pulp has no aliases, forms, recipe links, density, unit mappings, conversions, yields, or substitution findings. Substitution research remains `not_yet_researched`.
- All 114 manifest-listed recipes / 1,123 ingredient rows were scanned; no tomato-pulp ingredient line was found.

Sources: [OQLF, pulpe de tomates](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059866/pulpe-de-tomates), [CFIA Volume 4](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-4), and [CFIA Volume 10](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0).

## R866 — snapper / vivaneau market-name group

Added identity-only `ingredient-ref-snapper-market-group`, displayed as `snapper (name used for multiple fish species) / vivaneau (nom utilisé pour plusieurs espèces de poissons)` in `PROTEIN`.

- CFIA's Fish List overview describes the English/French names as acceptable Canadian fish-labelling names paired with scientific names. Its snapper search returns the broad `Snapper / Vivaneau` wording across multiple taxa, including Lutjanidae and Scorpaenidae. The 57 search-result rows are not a count of species or a full market roster.
- The visible qualifier identifies the broad market-name scope. The row has no aliases and assigns no taxon; red, gray, and yellowtail snapper names remain outside it. Their individual species-specific holds are unchanged.
- No forms, measurements, density, unit mappings, recipe links, conversions, yields, or substitution findings were added. Substitution research remains `not_yet_researched`.
- All 114 manifest-listed recipes / 1,123 ingredient rows were scanned; no snapper/vivaneau row was found.

Sources: [CFIA Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) (shared source ID `WP04-FINFISH-GAPS-20261010-S11` reused), [CFIA snapper search results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=&cmbIn=e&lang=e&q=snapper), and the OQLF entries for [vivaneau rouge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199102/vivaneau-rouge), [vivaneau gris](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199104/vivaneau-gris), and [vivaneau à queue jaune](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1299192/vivaneau-a-queue-jaune). OQLF sources constrain species-specific wording and are not aliases for the group.

## Cross-category scope

R864–R866 covered one unresolved generic milling identity, one missing generic processed-tomato identity, and one broad seafood market-name group. None required commercial-product roster research. Brand, product-line, flavor-family, and retailer-only expansion remains out of scope across all ingredient types because exhaustive coverage means ingredient diversity. Existing branded rows were not deleted or merged, and no product-only evidence was transferred. The [scope review](../generic-ingredient-scope-review-20261019/README.md) records the cross-category queue disposition and the reason for keeping the remaining work generic.

## Validation

- Bundled seed package validation passed; package and ingredient-reference normalization checks passed.
- Generated Kotlin import catalog is current at 1,897 references.
- Research ledger schema validation passed at 2,305 records. New source IDs and URLs are unique. The tomato row reuses the CFIA tomato-standard source IDs; the snapper row reuses the shared CFIA Fish List overview ID and the original OQLF proposal source IDs.
- The two new references have no name/alias collisions or active recipe links. Both have empty aliases and no forms, density, unit mappings, conversions, yields, or substitution findings.
- UTF-8/no-BOM, proposal links and plan anchors, and scoped whitespace checks are recorded for the changed files.
- No software tests, build, emulator, or deployment were run. `AGENTS.md` exempts changes that only add database JSON data from testing.

Current snapshot: 1,897 references / 201 forms / 114 recipes / 1,123 recipe ingredient rows; 2,305 ledger records / 10,873 source entries / 9,135 unique source IDs / 7,768 unique source URLs / 891 measurement observations / 370 substitution findings.

See the [R864 proposal](../../proposals/wp02-generic-grain-meal-diversity-review-r864-20261019.md), [R865 proposal](../../proposals/wp03-generic-tomato-preparation-diversity-review-r865-20261019.md), and [R866 proposal](../../proposals/wp04-generic-seafood-species-diversity-review-r866-20261019.md). Sections A7, L, and P remain open.
