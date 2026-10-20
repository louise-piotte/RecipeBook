# WP04 Section P sea-scallop identity integration

## Decision

Added identity-only `sea scallop / pétoncle géant` for *Placopecten magellanicus* as a separate
`PROTEIN` reference. Generic scallop and dried scallop remain separate identities. The catalog uses
only species-qualified and plural aliases; bare scallop/pétoncle, `noix`, European
`coquille Saint-Jacques`, Bay/Hokkaido market names, and Latin names are not aliases.

A static projection of the current search routine returns this reference alone for `sea scallop`,
`giant scallop`, `Atlantic scallop`, and `pétoncle géant` queries. Broad `scallop` and `pétoncle`
queries show the generic, dried, and species-specific choices together; `dried scallop` remains
specific to the dried identity.

The ledger records MAPAQ's source-reported 10–50 g adductor-muscle range as one species-specific,
source-scoped observation. The source does not state measurement method or food state, and its muscle
range is not paired with the separate whole-scallop range. It supports no edible-yield calculation.
No forms, density, unit mappings, recipe links, package conversion, cooking yield, or substitutions
were added. The 114-recipe / 1,123-row bundle has no matching demand.

## Evidence

- [OQLF — pétoncle géant](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031442/petoncle-geant) gives the preferred French term, English names, and Latin-name entries.
- [CFIA Fish List — scallop query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&lang=f&q=scallop) assigns `Sea Scallop`, `Giant Scallop`, `Atlantic Scallop`, and qualified French names to *P. magellanicus*; broader `scallop` and `pétoncle` names also cover other taxa.
- [DFO — Identification des mollusques bivalves](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-fra.htm) identifies *P. magellanicus* as pétoncle géant and distinguishes it from other scallop species.
- [MAPAQ — Les mollusques du Québec (PDF)](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_mollusques-quebec_MAPAQ.pdf) reports 10–50 g for the giant-scallop muscle. Its product states and package descriptions are not species-assigned measures.
- [Québec — Transformation des produits marins](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/portraits-peche-aquaculture-commerciales/transformation-produits-marins) reports two scallop species and group-level product states, without a product-by-species matrix.
- [OQLF — pétoncle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199062/petoncle) describes the marketed edible muscle and notes culinary use of `noix`; that broad term is excluded from picker aliases.
- [DFO — Newfoundland and Labrador scallop management plan](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/scallop-petoncle/2019/index-fra.html) reports a fishery-accounting factor of 8.3, which is not a recipe yield or kitchen conversion.

## Integration and validation

- Added `ingredient-ref-sea-scallop` and its accepted ledger record with seven sources and one measurement observation.
- Updated the Section P checklist and integration summary in `docs/RecipeBook-global-ingredient-catalog-plan.txt` and the active catalog progress entry in `roadmap.md`.
- Refreshed the generated catalog index and normalized the bundled seed package.
- Catalog/package validation, reference normalization, ledger schema, generated-index freshness, exact-key ownership, picker projections, recipe-corpus scan, UTF-8/no-BOM, local-link, and whitespace checks passed.
- No app tests, Gradle tasks, emulator runs, or deployment were performed because the application change only adds database JSON data under `AGENTS.md`.

Section P remains open.
