# WP04 Section P chikuwa identity integration (R377)

Added the identity-only `chikuwa / chikuwa` reference as `ingredient-ref-chikuwa`, with category `PROTEIN`, no aliases, null density, and no unit mappings. The French display retains the romanized product name because the reviewed French-facing Canadian sources attest `chikuwa` but do not establish a Québec-preferred translation. The MAFF and Kikkoman descriptions support a named formed fish-paste product; the retailer and trademark wording stay evidence only. [MAFF](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/nerimono.html), [Kikkoman](https://www.kikkoman.com/en/cookbook/glossary/chikuwa.html), [Superwafer](https://www.superwafer.ca/en/product/17534/chikuwa-fish-cake), [CIPO journal](https://cipo-opic.ic.gc.ca/opic-cipo/tmj/fra/23Jul2025_fr.pdf?edition=07-23&year=2025), [Uniking](https://www.uniking.ca/fr/products).

## Boundaries retained

- Kept generic fish cake, fish paste, surimi, kamaboko generally, fish balls, fish tofu, naruto maki, fish species, and `Mini Chikuwa` separate from the new identity.
- The retailer's 112 g value remains SKU package mass; no serving measure, density, form, mapping, yield, recipe link, conversion, or substitution was added.
- The manifest-listed recipe scan found no matching term or ingredient row.
- The five source records are attached to the new ledger identity. S05 deliberately reuses Uniking's exact URL with a claim-specific source ID; the pre-existing saury source ID and support remain unchanged.

## Validation

- Seed package normalization and validation-only checks passed.
- Research ledger schema validation passed.
- Generated Kotlin catalog freshness check passed at 1,699 references.
- Ownership checks confirmed no duplicate chikuwa row, form, ledger identity, or source ID; the expected Uniking URL reuse is limited to S05.
- The manifest-ordered 114-recipe corpus scan found zero matching files or ingredient rows (1,123 ingredient rows).
- The JSON files remain canonical ASCII-escaped UTF-8 without BOM. No software tests, build, emulator run, or deployment were performed because this change only adds database JSON data under `AGENTS.md`.
