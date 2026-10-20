# WP02 / WP03 / WP04 round-nine gap-review integration (2026-10-13)

## Integrated decisions

- **WP02 A6:** Added `ramdana` to `ingredient-ref-amaranth-grain.aliasesEn` and `ramdana flour` to `ingredient-ref-amaranth-flour.aliasesEn`. Added the five reviewed source registrations to the corresponding existing ledger records and recorded accepted alias decisions. No French names, forms, measurements, conversions, yields, recipe links, or substitutions changed. Bare `ramdana` remains a grain/flour choice.
- **WP03 Section F:** Added unresolved ledger-only candidate `candidate-sorghum-couscous`, reusing four already-registered OQLF/Codex/sorghum source IDs and registering the eight new reviewed sources. Added no active reference, alias, form, measurement observation, recipe link, or substitution.
- **WP04 Section P:** Kept Pacific hake (*Merluccius productus*) outside the picker because the proposed French display would make broad `merlu` select one species. Added no catalog or ledger row. Reconsider if picker matching preserves multiple exact-token results or a Québec species-specific display avoids the broad token.

## Data scope

The active reference count remains 1,342. The ledger now has 1,652 records and 6,328 source registrations / 5,313 distinct source IDs; the candidate has no observations or findings. Global observation/finding counts remain 341/190. The manifest-listed recipe corpus remains 114 files, 1,123 ingredient rows, and 753,792 bytes (fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`). Recipe data was not changed.

## Static verification

Static package normalization/validation, reference normalization, generated-catalog freshness, research-ledger schema and identifier checks, focused picker projections, manifest recipe-corpus checks, UTF-8/no-BOM/LF checks, mojibake and whitespace scans, and scoped `git diff --check` passed. No app, unit, instrumentation, emulator, or application tests were run because the catalog and ledger changes only add data to database JSON files; the Pacific-hake hold was documentation-only.

Proposal records:

- `docs/catalog/proposals/wp02-a6-next-regional-flour-gap-review-20261013-round9.md`
- `docs/catalog/proposals/wp03-section-f-next-cereal-gap-review-20261013-round9.md`
- `docs/catalog/proposals/wp04-section-p-next-fish-gap-review-20261013-round9.md`
