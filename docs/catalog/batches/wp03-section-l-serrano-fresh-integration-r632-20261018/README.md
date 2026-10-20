# WP03 Section L R632 — Serrano fresh-market form

**Status:** Integrated on 2026-10-18. This is a database-JSON-only catalog update.

## Accepted change

Kept the existing `ingredient-ref-serrano-pepper` and added only the English plural alias `serrano peppers` plus one whole fresh-market form:

- French label: `piment serrano frais`
- English label: `fresh serrano pepper`
- Form code and preparation state: `fresh`

The fresh form has no density or match terms. French aliases remain empty to avoid making the broad `piments` query a single Serrano result. The separate `queso fresco serrano` identity stays distinct.

## Evidence and boundaries

- The [CFIA 2026 report](https://publications.gc.ca/collections/collection_2026/acia-cfia/A104-701-2026-fra.pdf) covers whole fresh hot-pepper samples from Canadian retail, includes Québec and Montréal among collection cities, and lists 34 Serrano samples.
- Health Canada’s [CNF food code 4858](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4858) names the raw food `Pepper, serrano, raw / Piment, serrano, cru`. Its existing ledger source and the prior 6.1 g observation remain unchanged.
- Paired [Metro Québec](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/poivrons-zucchini-et-aubergines/piments-serrano/p/685750000182) and [Metro English](https://www.metro.ca/en/online-grocery/aisles/fruits-vegetables/vegetables/peppers-zucchini-eggplant/serrano-peppers/p/685750000182) listings use the same product number. The Québec title is plural, but that phrase is not stored as an alias because picker matching would make bare `piments` resolve to Serrano alone. Both retail listings show a 60 g package; it was not treated as a pepper measure.

The bundled recipe scan found one Serrano line, recipe 066 ingredient 4. It does not explicitly say fresh, so it remains unlinked. No size, cultivar, species, color, heat, measurement, conversion, package yield, or substitution was inferred.

## Validation

- Bundled seed package validation and generated catalog freshness passed: 1,828 references and 158 forms.
- Research ledger schema and custom checks passed with 2,199 records.
- The R632 picker projection preserved `serrano`, `piment`, and broad pepper results while making `serrano peppers`, `fresh serrano pepper`, and `piment serrano frais` resolve to the existing Serrano row.
- No app tests or emulator checks were run because this change only edits database JSON under `AGENTS.md`.

Section L remains open for other fresh-chile identities and product boundaries.
