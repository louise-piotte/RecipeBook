# WP04 Section O Montréal smoked-meat integration

Integrated 2026-10-11 from the reviewed [identity proposal](../../proposals/wp04-section-o-montreal-smoked-meat-identity-review-20261011.md). This batch adds one identity-only PROTEIN reference and its research-ledger record. It makes no recipe or application-logic change; the generated Kotlin reference index was refreshed from the canonical JSON.

## Catalog decision

- Added `ingredient-ref-montreal-smoked-meat`, displayed as `smoked meat / Montreal smoked meat` for Québec French and scoped English, respectively.
- Added only the exact Metro French label aliases `viande fumée de Montréal` and `viande fumée style Montréal`. The OQLF hyphenated spelling `smoked-meat` normalizes to the French display key.
- Stored no English alias: `smoked meat` is already the French display and the exact borrowed English term, so the shared bilingual search indexes it without a duplicate alias.
- Kept the identity separate from pastrami, corned beef, generic smoked/cured meat, pork cured meats, smoke ingredients, charqui, and cecina.
- The bundled corpus has no Montréal smoked-meat recipe row, so no recipe links, forms, measurements, density, mappings, conversions, yields, or substitutions were added. Measurement and substitution research remain `not_yet_researched`.

## Sources

The ledger records six sources. [OQLF defines Montréal smoked meat and distinguishes it from pastrami](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8369658/smoked-meat); its [pastrami entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8369657/pastrami) documents the related but distinct product. CFIA guidance covers meat-product common names and the difference between smoked and smoke-flavoured declarations. Metro Québec listings support the two exact French product aliases; their product-specific ingredients and package sizes were not made general catalog data.

## Validation

- 1,012 ingredient references, 66 forms, 114 recipes, and 1,123 ingredient rows.
- 1,293 research-ledger records, 4,161 source entries, 3,409 distinct source IDs, and 8 unit conversions.
- Ingredient-reference normalization and package/ledger validation passed.
- Generated catalog freshness check passed for 1,012 references.
- No tests were run because this batch adds database JSON only, as specified in `AGENTS.md`.
