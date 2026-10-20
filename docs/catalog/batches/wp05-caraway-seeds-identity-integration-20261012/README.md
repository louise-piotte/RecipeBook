# WP05 — Caraway-seed identity integration (2026-10-12)

## Decision

Promoted the existing `ingredient-ref-caraway-seeds` legacy identity in place to identity-only
`caraway seeds / graines de carvi` in `BAKING_AND_SPICE`. The reference has no aliases. The Canadian
Food Compositional Standard describes caraway/caraway seed, whole or ground, as the dried fruit of
*Carum carvi* L. OQLF prefers `carvi`, provides `caraway` in English, and notes the culinary use of
`graines de carvi`.

Keep the identity separate from cumin. OQLF also mentions `cumin des prés` as a common name for the
plant, but it is not added as an alias because it can be confused with cumin. The full 114-recipe,
1,123-row bundle has no matching caraway lines. No forms, measures, density, unit mappings, recipe
links, conversions, yields, or substitutions were added. The identity record retains
`not_yet_researched` measurement and substitution states.

## Sources

- OQLF, [carvi (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084317/carvi):
  preferred French term, English `caraway`, the `Carum carvi` taxon, and the culinary fruit/seed usage.
- CFIA, [Canadian Food Compositional Standards, Volume 6](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0),
  section 6.1.5: identifies caraway or caraway seed, whole or ground, as dried *Carum carvi* fruit.
  This standard is not used as a household measurement or as a preparation rule for RecipeBook.

The stable reference ID was already present in `docs/catalog/legacy-import-identities.v1.json` and had a
`candidate` ledger record. The legacy entry was removed, its count was reduced by one, and its ledger
record was promoted to `ingredient_reference`; no new ID was allocated.

## Static verification

- Reference normalization, generated-index freshness, seed-package validation, and ledger validation
  passed.
- Exact normalized English and French terms have one active owner; no competing form or legacy owner
  remains. The ingredient corpus scan found zero matching recipe rows.
- Database JSON uses explicit Unicode escapes; touched files decode as UTF-8 without BOM and have no
  trailing whitespace. No app, unit, instrumentation, emulator, or deployment tests were run because
  this change only adds database JSON data, as allowed by `AGENTS.md`.
