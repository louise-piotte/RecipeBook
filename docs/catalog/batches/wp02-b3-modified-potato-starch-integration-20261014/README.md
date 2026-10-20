# WP02 Section 04 B3 R96 — Modified Potato Starch Integration

Reviewed and integrated 2026-10-14. The broader B2/B3 flour-and-starch sweep remains open.

## Decision

Added identity-only `modified potato starch / amidon de pomme de terre modifié` as
`ingredient-ref-modified-potato-starch` in `FLOUR_AND_STARCH`, with the source-attested French alias
`fécule de pomme de terre modifiée`. Keep the row distinct from ordinary potato starch, whole
potato flour, modified corn starch, modified pea starch, and modified tapioca starch. Do not infer
the modification chemistry or technical grade from the plant-qualified name.

The ledger records 11 sources, no supported reusable measurement, and one formula-specific cookie
study comparison: a laboratory-modified potato starch amount was replaced with an equal mass of
generic gram flour in the study's control. This is bounded research evidence only. No active
substitution rule, recipe-line link, measurement observation, form, density, unit mapping, recipe
link, conversion, or yield was added. The study's laboratory starch is not treated as equivalent to
commercial modified-starch grades. The bundled recipe corpus has no matching demand.

## Integration and validation

- Added one canonical ingredient reference, one accepted `ingredient_reference` research-ledger
  record, and regenerated the Kotlin ingredient catalog index. Current counts: 1,430 references,
  105 forms, 1,770 ledger records, 63 legacy candidates, 114 recipes, and 1,123 ingredient rows.
- Updated the Section 04 B2/B3 checklist, global catalog plan, roadmap, and proposal decision status.
- Seed-package and reference-normalization checks passed; research-ledger schema validation passed;
  generated-index check passed. Static picker projection, source/ID ownership, recipe-corpus,
  UTF-8/no-BOM, local-link, and whitespace checks passed.
- No app, Gradle, instrumentation, or emulator tests were run because the application change adds
  database JSON data and its generated catalog index under the `AGENTS.md` exception.

See the detailed [R96 review](../../proposals/wp02-b3-r96-modified-potato-starch-review-20261014.md).

## Sources

- CFIA's [English naming table](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/common-names-ingredients-and-components)
  and ACIA's [French naming table](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/noms-usuels-dingredients-constituants)
  specify that a modified-starch common name includes the plant source.
- OQLF's [amidon entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon)
  supports `amidon` as the preferred general term, while its [potato-starch entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357374/fecule-de-pomme-de-terre)
  supports the potato `fécule` wording.
- Daiya's [Canadian bilingual product declaration](https://daiyafoods.com/en-ca/products/dairy-free-cheddar-block)
  uses `Modified potato starch / Amidon de pomme de terre modifié`.
- Ali et al.'s [2023 open-access cookie study](https://pmc.ncbi.nlm.nih.gov/articles/PMC10558832/)
  documents one potato-starch modification process, the formula-specific cookie comparison, and its
  limitations. KMC's [modified potato-starch portfolio](https://www.kmc.dk/solutions/ingredients/modified-starches)
  documents grade-specific industrial behavior, not household substitutions.
