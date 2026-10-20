# WP02 Section E R239 rose water and orange blossom water integration (2026-10-16)

## Decision

Added identity-only `rose water / eau de rose` and `orange blossom water / eau de fleur d'oranger` as separate `BAKING_AND_SPICE` references. Kept both distinct from rose petals, rose syrup, orange extract, oils, cosmetics, and non-food floral waters. The product-specific 250 mL listings are not reusable measures.

The ledger records one source-supported, one-way alternative in Maureen Abood’s Flower Water Syrup formula: 2 teaspoons orange blossom water or 1/2 teaspoon rose water. That context remains evidence only; no global or active contextual substitution rule was added. The 114-recipe / 1,123-row bundle has no matching demand.

## Sources

- OQLF, [eau de fleur d'oranger (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497589/eau-de-fleur-doranger).
- La Moisson, [Eau de fleur d'oranger / Orange blossom water](https://lamoisson.com/collections/sucres-edulcorants-sugars-sweeteners/products/eau-de-fleur-doranger-orange-blossom-water).
- La Moisson, [Eau de rose / Rosewater](https://lamoisson.com/products/eau-de-rose-rosewater).
- Maureen Abood, [publisher advance proof of *Rose Water & Orange Blossoms*](https://edelweiss-assets.abovetheline.com/PS/supplemental/RWOB_E_Galley.pdf), “Flower Water Syrup,” pp. 42–43.
- [R239 proposal](../../proposals/wp02-section-e-rose-water-orange-blossom-water-identity-review-r239-20261016.md).

## Data and checks

- References: **1,632**; forms: **122**; research-ledger records: **1,977**.
- Ledger sources: **8,644 entries / 7,327 distinct source IDs / 6,102 URLs**.
- Bundled corpus: **114 recipes / 1,123 ingredient rows**.
- Passed reference normalization, package normalization, generated-index freshness, ledger schema validation, source-ID uniqueness, UTF-8/no-BOM and escaped-Unicode checks, relative local links, and scoped whitespace checks. Candidate ownership and the 114-recipe / 1,123-row scan were completed before integration.
- No software tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

The broad Section E floral-water and product checklist remains open.
