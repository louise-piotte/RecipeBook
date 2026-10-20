# Research-ledger integrity cleanup — 2026-10-16

## Changes

- Split the shared Health Canada CNF source IDs for oat bran, quinoa, and white long-grain rice into exact dry and cooked food-code pages. Updated cooked-form citations, base-reference decisions, and source notes. New cooked-page IDs are `WP03-S24-COOKED-4494`, `WP03-S5-COOKED-5917`, and `WP03-S3-COOKED-4523`.
- Standardized `WP03-TC-20261009-S05` on the CFIA URL used by the other ledger owners.
- Added the source records already cited by yeast and cabbage decisions/findings: OQLF `WP02-E-YEAST-20261009-S03`, Fleischmann’s `WP02-E-YEAST-20261009-S09`, and OQLF `WP03K-S07` / `WP03K-S11`.
- Corrected two Pacific-herring measurement citations that omitted `IDENTITY` from the existing source ID.
- Updated the affected proposal source tables, state-form source register, integration README, checklist, and roadmap.

## Validation

- Research-ledger JSON parses successfully.
- Whole-ledger source-ID-to-URL audit: **0 conflicts**.
- Decision, measurement-observation, and substitution-finding source audit: **0 globally unresolved IDs**.
- No recipe, ingredient-reference, or ingredient-form data changed. The package remains at 1,611 references, 122 forms, and 114 recipes / 1,123 ingredient rows.
- Ledger total: 1,956 records / 8,502 source entries / 7,228 distinct source IDs.
- No application tests, build, emulator check, or deployment was needed. This change only updates database JSON evidence and its documentation, under the JSON-only exception in `AGENTS.md`.
