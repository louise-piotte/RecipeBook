# WP02 Section 04 B3 modified corn starch identity integration (R92)

Proposal reviewed and integrated 2026-10-14. Section 04 B2/B3 remains open.

## Decision

Added identity-only `modified corn starch / amidon de maïs modifié` as a separate
`FLOUR_AND_STARCH` reference from ordinary corn starch and modified pea starch. The row has no
aliases or forms, null density, and no unit mappings. Its accepted ledger record contains nine
source IDs and records no supported household measure or general substitution. No recipe links,
conversions, yields, or substitution rules were added.

The qualified English and French phrases return the modified identity alone. Broad `corn starch` and
`amidon de maïs` searches return both ordinary and modified products. `cornstarch` remains on the
ordinary row, and generic `modified starch / amidon modifié` remains unallocated. The recipe bundle
has no candidate demand.

## Integration and validation

- Added one ingredient reference and one accepted `ingredient_reference` ledger record; regenerated
  the Kotlin ingredient catalog index. Current counts: 1,425 references, 104 forms, 1,764 ledger
  records, 63 legacy candidates, 114 recipes, and 1,123 ingredient rows.
- Updated the Section 04 checklist, the global catalog plan log, and `roadmap.md`.
- Seed package normalization and validation, reference normalization, ledger-schema validation, and
  generated-index freshness checks passed. The picker projection confirmed the query behavior above.
- Scanned all 114 manifest-listed recipes and 1,123 ingredient rows; no candidate phrases were
  found. The nine new source IDs are unique with no prefix collision. UTF-8/no-BOM, local-link, and
  scoped whitespace checks passed.
- No app, Gradle, instrumentation, or emulator tests were run because this change only adds database
  JSON data and its generated index under `AGENTS.md`.

See the detailed [R92 review](../../proposals/wp02-b3-r92-modified-corn-starch-review-20261014.md).

## Main sources

- [OQLF — amidon de maïs modifié](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2494324/amidon-de-mais-modifie)
  gives the Québec French name and English equivalent.
- [CFIA common-name rules](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/common-names-ingredients-and-components)
  distinguish plant-named ordinary starch from plant-named modified starch.
- Current Québec-market label evidence and manufacturer grade information are documented with
  source limits in the detailed proposal.
