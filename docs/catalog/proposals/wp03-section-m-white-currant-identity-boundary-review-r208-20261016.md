# WP03 Section M white currant identity boundary review (R208)

- **Reviewed:** 2026-10-16
- **Status:** Proposal only. This file is the only change in this packet; no catalog, form, recipe, ledger, checklist, plan, roadmap, generated, or other proposal file was changed.
- **Scope:** One open Section M currant coverage gap: white currant / groseille blanche à grappes.
- **Excluded:** WP02 wheat flour, WP04 shellfish, and the cooked-quinoa CNF review.

## Recommendation

Recommend a bounded, identity-only addition for the named white-fruited currant variant:

| Field | Proposal |
|---|---|
| Candidate ID | `ingredient-ref-white-currant` |
| Category | `FRUIT` |
| English display | `white currant` |
| Québec French display | `groseille blanche à grappes` |
| English search aliases | `whitecurrant`, `white currants` |
| French search aliases | `gadelle blanche`, `groseille blanche`, `gadelles blanches`, `groseilles blanches`, `groseilles blanches à grappes` |

OQLF recognizes the white currant as an edible-fruit term with dedicated French and English names. It describes it as a less common color variant arising among red-fruited currants, not a separate species. A distinct reference is useful for the explicit white-fruit name and color-qualified picker search; its catalog identity must not be described as a distinct taxon. No bundled recipe names it, so this is a bounded catalog-coverage recommendation rather than a recipe-driven expansion.

Keep the names color-qualified. Do not add bare `currant(s)`, `groseille`, or `gadelle` as aliases. Keep the candidate separate from black currant / cassis, gooseberry / groseille à maquereau, Indian gooseberry / groseille indienne, and dried currants / raisins de Corinthe séchés. Do not add botanical names as picker aliases: the sources identify the white-fruited variant within the red-currant group and those names describe plants rather than a safely exclusive food search term.

## Current ownership and evidence reuse

The live bundle currently has 1,593 ingredient references and 122 ingredient forms. The current research ledger has 1,938 records, and the legacy import file has 61 candidates. The manifest contains 114 recipe files and 1,123 ingredient rows.

| Adjacent identity | Current owner | Boundary |
|---|---|---|
| Black currant | `ingredient-ref-black-currant` / `cassis`; FR aliases `groseille noire`, `gadelle noire`; EN alias `blackcurrant` | Keep its source-backed black-fruit names separate. The ledger identity is verified and its measurement state is `not_yet_researched`. |
| Red currant | `ingredient-ref-red-currant` / `groseille rouge à grappes`; FR aliases `gadelle rouge`, `groseille rouge`; EN alias `redcurrant` | White currant is described by OQLF as a color variant within the red-fruited currant group, but its exact color-qualified food name should retain its own picker result. The ledger identity is verified and its measurement state is `not_yet_researched`. |
| Dried currants | `ingredient-ref-dried-currants` / `raisins de Corinthe séchés` | A dried grape product, not a fresh Ribes currant. Keep it out of the white-fruit aliases. |
| Gooseberry | `ingredient-ref-gooseberry` / `groseille à maquereau` | Keep the Québec bare `groseille` ambiguity out of the proposed aliases. |
| Indian gooseberry | `ingredient-ref-indian-gooseberry` / `groseille indienne` | Separate plant/fruit identity; do not add `groseille` as an alias. |

No live reference, form, legacy candidate, or ledger identity owns `white currant`, `whitecurrant`, `groseille blanche`, or `gadelle blanche`. The candidate ID `ingredient-ref-white-currant` is also unowned. The white-specific OQLF URL and the two corroborating agricultural/nursery URLs below do not currently occur in ledger source entries. Existing black- and red-currant ledger sources remain useful context for their own identities, but do not support white-currant aliases. The general OQLF `groseille à grappes` entry was discussed in the 2026-10-09 Section M coordinator proposal; its direct page describes the shared red/white/black cluster-currant group and can be reused as context if recorded in a later ledger update.

Use proposal-local source IDs `WP03-M-WHITE-CURRANT-R208-20261016-S01` through `S04` if this recommendation is later accepted. A source-ID collision check found no current ledger entries containing `R208`.

## Recipe demand and link disposition

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned for `white currant`, `whitecurrant`, `groseille blanche`, `gadelle blanche`, `Ribes sativum`, `Ribes vulgare`, and `White Pearl`. There were no matches.

Do not create a recipe link or change recipe text. In particular, no generic red-currant row should be relinked to this candidate based on the name alone. Revisit links only if a later recipe explicitly names white currants.

## Measurement and form disposition

Set a future ledger record's measurement state to `not_yet_researched`. The reviewed sources support terminology, food-fruit identity, and culinary use; they do not establish a portion mass, volume-to-mass factor, density, unit mapping, package yield, or substitution. Add no forms, mappings, default density, measurement rows, yields, or substitution rules. Keep the existing red- and black-currant measurement states unchanged.

## Picker and search effects

The picker normalizes accents and punctuation, prefers complete word-phrase matches, and falls back to substring matching; it does not stem singulars and plurals. A read-only projection against the current 1,593 references gives these counts before the proposed row:

| Query | Current result count | Expected result after proposal |
|---|---:|---|
| `white currant`, `whitecurrant`, `white currants` | 0 | 1: the proposed white-currant reference |
| `groseille blanche à grappes`, `groseille blanche`, `gadelle blanche` | 0 | 1: the proposed reference |
| `groseilles blanches`, `gadelles blanches`, `groseilles blanches à grappes` | 0 | 1: the proposed reference |
| `currant` | 3: black currant, red currant, dried currants | 4, adding white currant |
| `currants` | 1: dried currants | 2, adding white currants |
| `groseille` | 4: black currant, gooseberry, Indian gooseberry, red currant | 5, adding white currant |
| `gadelle` | 2: black currant and red currant | 3, adding white currant |

The bare French and English family searches remain multi-result queries and are not proposed as aliases. The `currants` result remains incomplete for red and black because the current searcher does not infer plurals and those existing references do not list plural aliases. Resolving plural coverage across the whole currant family would be a separate search-normalization or alias-review item; this packet does not change those references.

## Source register

Sources accessed 2026-10-16. No numeric values were transferred.

| ID | Source | Support used and limits |
|---|---|---|
| S01 | OQLF, [groseille blanche à grappes (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869788/groseille-blanche-a-grappes) | Food-fruit domain; defines the white clustered berry; lists `groseille blanche à grappes`, Québec/Canada `gadelle blanche`, `groseille blanche`, English `white currant` and `whitecurrant`; says white fruit is a less common mutation among red-fruited currant species. The article says red and white clustered currants belong to the same species group; its botanical names are not recommended as picker aliases. |
| S02 | OQLF, [groseille à grappes (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357861/groseille-a-grappes) | Context: clustered currants are food fruit in red, white, and black; the white and red kinds are associated with `gadelle blanche` and `gadelle rouge`, while black currant is a separate species. It also warns that bare `groseille` in Québec refers to gooseberry. |
| S03 | Province of Manitoba, [Currant Production in Manitoba](https://www.gov.mb.ca/agriculture/crops/crop-management/fruit-crops/currant-production.html) | Identifies white currants among Ribes currant types and describes currants generally as used fresh and in processed foods. It says red and black are preferred to white; it does not give white-specific measurement or culinary equivalence data. |
| S04 | Croque Paysage, Laurentides, [Gadelier White Pearl](https://croquepaysage.com/products/gadelier-white-pearl) | Québec nursery page identifies `White Pearl`, white translucent berries, fresh consumption and processing. Its line “White Currant ou Gooseberry” is imprecise; do not use `gooseberry` as a synonym and rely on OQLF for the French/English identity boundary. The page sells a plant, not harvested berries. |

## Testing

No software tests were run because this packet changes only this proposal document. If later integration only adds data to database JSON files, the current `AGENTS.md` testing exception applies.
