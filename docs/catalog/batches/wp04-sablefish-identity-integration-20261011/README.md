# WP04 sablefish identity integration — 2026-10-11

## Decision

Add one identity-only reference for sablefish (*Anoplopoma fimbria*), displayed as `sablefish / morue charbonnière`. CFIA and OQLF tie the species to those Canadian/Québec names, and DFO confirms the bilingual species identity. Keep `black cod` and `morue noire` as search aliases; `morue charbonnière` remains the preferred French display. Keep this species separate from Atlantic cod and salt cod.

The recipe audit found no sablefish demand, so the reference has no recipe link, form, measurement, conversion, yield, or substitution.

## Changes

- Added identity-only `ingredient-ref-sablefish` in `ingredient-references.v1.json` with null density and no unit mappings.
- Added seven source records and the accepted species-scope decision to the research ledger.
- Regenerated `BundledIngredientCatalog.kt` from the normalized reference file.
- Marked the focused sablefish review complete in the Section P plan. Broader Section P work remains open.

The full source-to-claim map, term boundaries, and pre-integration audit are in [`wp04-section-p-sablefish-identity-boundary-review-20261011.md`](../../proposals/wp04-section-p-sablefish-identity-boundary-review-20261011.md).

## Verification

- Bundled seed package normalization check and validation passed.
- Ingredient-reference normalization check and generated Kotlin catalog freshness passed at 1,030 references.
- Research-ledger schema validation passed with 1,321 records, 4,298 source entries, and 3,534 distinct source IDs; the sablefish record has seven unique sources.
- Exact-name collision scan found no pre-existing active reference, form, or legacy owner. Manifest-listed recipe scan found no sablefish terms in 114 recipes / 1,123 ingredient rows.
- UTF-8/no-BOM and targeted whitespace checks passed.
- No tests or emulator run under the current `AGENTS.md` data-only rule.

Current package: 1,030 references / 72 forms / 114 recipes / 1,123 ingredient rows. SHA-256: references `901385bdfa02a48915607876c8d6526065eb70673be9b1ace38f1563518342da`; ledger `821d591c19330351fa6464a6fa445ba873f92463b0a9009550a1944bb435d2d9`; generated Kotlin catalog `94a50183bd49dfada0baad7c5353a47f6d908f91ed26fb6865192470a9fc8410`.
