# WP03 / WP04 / WP06 gap review integration — R504–R506

Date: 2026-10-17

## Integrated changes

- **R504, Section P:** Added identity-only `snow crab sections / sections de crabe des neiges` for the marketable section or cluster assembly. Kept it separate from crab legs, picked meat, claws, crayfish, and the R12 species-level snow-crab hold. The identity makes no taxonomic claim and adds no forms, measures, density, mappings, yields, recipe links, or substitutions.
- **R505, Africa:** Added identity-only garden egg fruit / aubergine écarlate for *Solanum aethiopicum*. The French display is provisional for fr-CA. Scientific names remain research evidence rather than picker aliases; *S. macrocarpon* gboma leaves and generic *S. melongena* eggplant remain distinct. The research ledger retains one market-sample density observation (1.05 g/mL) and an unscoped common-eggplant replacement finding as blocked evidence only. Active density and mappings remain empty, and no substitution rule was activated.
- **R506, Section F:** Added `white corn grits` as an English alias on the existing corn-grits row. Kept French aliases empty so `gruau de maïs` remains on hominy grits; no new identity, ledger record, measure, form, recipe link, or substitution was added.

The full recipe corpus has no candidate-specific hits: 114 manifest recipes, 1,123 ingredient rows, 753,988 recipe-file bytes. No recipe references or recipe files changed.

## Static verification

- Bundled seed-package validation and normalization check passed.
- Generated Kotlin ingredient index is current at 1,785 references.
- Research-ledger schema validation passed with zero errors. The ledger has 2,142 records and 9,829 source entries; its 8,317 distinct source IDs map to 7,027 distinct URLs, with no source ID mapped to multiple URLs.
- Candidate picker projections, alias boundaries, and source reuse are recorded in the three review proposals.
- Manifest recipe scan returned zero candidate-specific file and ingredient-row hits. Corpus fingerprint: `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`.
- UTF-8/no-BOM and escaped-Unicode checks passed for the edited database JSON. Local links and scoped whitespace were checked.
- No software tests, build, emulator run, or deployment were performed. The changes add database JSON data; the generated catalog index was refreshed from the canonical JSON package, under the `AGENTS.md` testing rule.

## Snapshot and open coverage

After integration: 1,785 ingredient references / 143 forms / 56 legacy candidates; 2,142 research-ledger records / 9,829 source entries / 8,317 distinct source IDs / 7,027 distinct URLs; 114 recipes / 1,123 ingredient rows.

The aggregate Section F grits and corn products, Section P seafood, and African regional coverage remain open.

Reviews: [R504 snow-crab sections](../../proposals/wp04-section-p-next-seafood-review-r504-20261017.md), [R505 garden egg](../../proposals/wp06-african-next-regional-review-r505-20261017.md), and [R506 white-corn grits alias](../../proposals/wp03-section-f-next-gap-review-r506-20261017.md).
