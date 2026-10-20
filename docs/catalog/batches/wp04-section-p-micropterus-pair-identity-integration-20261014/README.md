# WP04 Section P paired *Micropterus* bass identity integration (R91)

Proposal reviewed and integrated 2026-10-14. Section P remains open.

## Decision

Added identity-only `smallmouth bass / achigan à petite bouche` (*Micropterus dolomieu*) and
`largemouth bass / achigan à grande bouche` (*M. salmoides*) as separate `PROTEIN` references. Both
have empty aliases, null density, and no unit mappings. Their ledger records verify identity and
record no supported measurement or substitution value. No forms, recipe links, conversions, yields,
or substitution rules were added.

Keeping the two species together preserves the OQLF genus-level meaning of both broad `bass` and
`achigan` searches: each now returns the two *Micropterus* choices instead of an unrelated substring
fallback. The qualified English and Québec French searches each return one species. The separate
white-bass, striped-bass, black-sea-bass, and European-sea-bass boundaries remain unchanged; broad
`bar` results are unchanged. This identity decision does not claim a current Québec retail SKU.

OQLF gives preferred Québec names for both edible species. CFIA separately lists their bilingual
fish names, and Québec sources establish local species context and regulated sale pathways. The
legal and aquaculture evidence does not establish current retail inventory or species-specific
commercial landings.

## Integration and validation

- Added two references and two accepted `ingredient_reference` ledger records. The records contain
  16 source entries covering 9 distinct source IDs; measurement and substitution observations remain
  empty.
- Updated the Section P checklist, the plan log, and `roadmap.md`.
- Regenerated the Kotlin ingredient catalog index. It contains 1,424 references; the bundled package
  has 104 forms and the research ledger has 1,763 records.
- Seed package normalization and validation, ingredient-reference normalization, ledger-schema
  validation, and generated-index freshness checks passed. The picker projection returned both
  species for `bass` and `achigan`, one each for the four qualified phrases, and the unchanged 37
  fallback results for `bar`.
- Scanned all 114 manifest-listed recipes and 1,123 ingredient rows; no species-qualified phrase
  hits were found. UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- No app, Gradle, instrumentation, or emulator tests were run because this change only adds database
  JSON data and its generated index under `AGENTS.md`.

See the detailed [R91 review](../../proposals/wp04-section-p-smallmouth-bass-picker-boundary-review-r91-20261014.md).

## Main sources

- [OQLF — achigan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8370827/achigan),
  [smallmouth](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359907/achigan-a-petite-bouche),
  and [largemouth](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359908/achigan-a-grande-bouche).
- [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) lists the
  species separately.
- [DFO aquaculture species snapshot](https://www.dfo-mpo.gc.ca/aquaculture/farmed-elevage/listing-eng.htm?wbdisable=true)
  identifies province-level farmed-species context.
- [Québec's fish-sale regulation](https://www.legisquebec.gouv.qc.ca/fr/document/rc/c-61.1,%20r.%207)
  and [MAPAQ commercial freshwater fishing permit guidance](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/permis-peches-aquaculture-commerciales/permis-peche-commerciale-eau-douce)
  describe conditional sale channels; neither establishes a current SKU.
