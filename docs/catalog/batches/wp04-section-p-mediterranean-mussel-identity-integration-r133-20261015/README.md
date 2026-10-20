# WP04 Section P R133 — Mediterranean mussel integration

## Decision

Added identity-only `Mediterranean mussel / moule méditerranéenne` for *Mytilus galloprovincialis* as `ingredient-ref-mediterranean-mussel` in `PROTEIN`. Retained only the species-qualified product names and the exact DFO / Canadian seller terms `Mussel, Gallo`, `moule gallo`, and `Honey Mussels`. Bare `mussel(s)` / `moule(s)`, the shared OQLF `moule d'élevage`, the misspelled Fish List variant, and the scientific binomial remain out of aliases. The unresolved generic mussel candidate and blue- and green-lipped mussels stay separate.

The historical RMAQ 10–15-per-pound count remains in its source record. The ledger's `count_weight` interval requires mass-per-count units, so no derived per-mussel mass is stored. The RMAQ and FAO 50% figures remain source-specific yield observations; no active yield or substitution rule, form, recipe link, or conversion was added. The ingredient-field scan found no bundled mussel demand.

## Evidence and review

The proposal records source limits and the full evidence list: [R133 Mediterranean-mussel review](../../proposals/wp04-section-p-mediterranean-mussel-identity-review-r133-20261015.md). Root independently rechecked the [CFIA Fish List overview and result](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), [DFO's bilingual farmed-species tables](https://www.dfo-mpo.gc.ca/aquaculture/farmed-elevage/listing-eng.htm), [Seafood Depot's Canadian product listing](https://www.seafooddepot.ca/product-musselhoney2), [OQLF's shared farmed-mussel term](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8408342/moule-delevage), and the [FAO species profile](https://www.fao.org/fishery/docs/CDrom/aquaculture/I1129m/file/fr/fr_mediterraneanmussel.htm). The Québec marketing report and IGA article are described in the proposal with their retrieval limits.

## Static verification

- Reference and ledger schema validation passed.
- Bundled package semantic validation and normalization checks passed.
- Generated ingredient index is current at 1,486 references.
- Static picker projection keeps broad `mussel` / `moule` searches multi-result and returns one row for the qualified bilingual name and seller product phrase.
- Ingredient-field scan found 0 matches across 114 manifest-listed recipes / 1,123 ingredient rows.
- UTF-8/no-BOM, local-link, and scoped whitespace checks passed.

No app, Gradle, unit, instrumentation, emulator, or deployment tests were run because this change adds database JSON data and refreshes its generated index under `AGENTS.md`. Section P remains open.
