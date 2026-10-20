# WP02 B3 pea starch Québec terminology follow-up

- **Date:** 2026-10-12.
- **Status:** Integrated as a terminology-only research-ledger update.
- **Proposal:** [WP02 B3 pea starch Québec term adjudication](../../proposals/wp02-b3-pea-starch-quebec-term-adjudication-20261012.md).
- **Identity review:** [WP02 B3 pea starch identity review](../../proposals/wp02-b3-pea-starch-identity-review-20261012.md).

## Accepted decision

Confirmed the existing French display `amidon de pois` on `ingredient-ref-pea-starch`. OQLF's 2026 entry prefers `amidon` generally and describes `fécule` as more specific to starch in tubers or underground organs. Applying this general plant-part distinction to pea-seed starch supports the existing wording; OQLF does not publish a dedicated pea-starch headword. A current Montréal food label independently declares `amidon de pois` in a finished mung-bean vermicelli.

Do not add `fécule de pois` as an alias. Keep `amidon natif de pois` and modified-pea-starch wording outside the generic identity. Root added one OQLF source to the pea-starch ledger record and updated the accepted decision's rationale. The existing SUE Foods evidence was reused from the pea-starch identity review.

The active ingredient-reference row, forms, recipe lines, measurements, conversions, yields, and substitutions are unchanged. The existing row remains density-null with no unit mappings; measurement and substitution research remain `not_yet_researched`.

## Static validation

- Research ledger schema validation passed: 1,560 records, 5,435 source entries, 4,473 distinct source IDs, 0 errors.
- Post-integration research-ledger SHA-256: `8eadbfd35168df462e10ad6db01b3e1840d84735d493ace0501bfe2d833491ae`.
- The active catalog remains at 1,252 references and the seed manifest remains at 114 recipes / 1,123 ingredient rows.
- No app tests or emulator checks were run because this is a database-JSON-only research-ledger update under `AGENTS.md`.

## Sources

- OQLF, [*amidon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon): general preferred term and contextual distinction from *fécule*; applying it to pea starch is an inference.
- SUE Foods, Montréal, [*Vermicelles aux haricots (lungkow)*](https://suefoods.com/products/pagoda-brand-vermicelles-aux-haricots-lungkow): current French ingredient declaration `amidon de pois` for one finished mixed-starch food.
