# WP04 Section P R645 — Blue Runner identity

Integrated on 2026-10-18 after root review of the [R645 proposal](../../proposals/wp04-section-p-next-regional-fish-gap-review-r645-20261018.md).

## Catalog update

- Added identity-only `blue runner / carangue jaune` for *Caranx crysos* as `ingredient-ref-blue-runner`, category `PROTEIN`.
- Kept both alias arrays empty. Do not add `carangue coubali`, `yellow jack`, `hard tail`, generic `jack` / `carangue`, or the scientific binomial as aliases.
- Added one ledger record with CFIA, OQLF, historical Newfoundland catch, Canadian supplier, and Guadeloupe naming-boundary sources. The existing CFIA Fish List overview source was reused by ID. Measurement and substitution research remain `not_yet_researched`.
- The Canadian supplier page prints *Caranx crysops* and conflicting origin statements, so it supports use of the trade name only. The 2013 Newfoundland catches are historical, not current Québec supply. No form, measurement, recipe link, density, mapping, conversion, yield, or substitution was added.
- The 114 bundled recipes (1,123 ingredient rows) have no candidate-term match.

## Sources and static validation

- CFIA Fish List result for TSN 168612 pairs Blue Runner with *Caranx crysos*.
- OQLF fiche 1199021 pairs `blue runner` with *Caranx crysos*, selects `carangue jaune` for Québec fish-product terminology, and notes `carangue coubali` was not retained.
- The 2014 Devine and Fisher report documents commercial catches of the species off Newfoundland in 2013; this is not present-day availability evidence.
- The Guadeloupe government table pairs `Yellow jack / Carangue jaune` with *Caranx bartholomaei*, so `yellow jack` is not made a global alias.
- Static bundled-package validation passed. The generated catalog check passed with 1,833 references. Research-ledger JSON Schema validation, source/reference ownership, picker projection, recipe-corpus, encoding, local-link, and scoped-whitespace checks passed.
- No software tests, build, emulator run, or deployment were needed because this update only adds database JSON data under `AGENTS.md`.

Section P remains open.
