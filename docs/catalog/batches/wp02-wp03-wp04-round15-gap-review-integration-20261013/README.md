# WP02 / WP03 / WP04 round-fifteen gap-review integration

Date: 2026-10-13

## Dispositions

- **WP02 A6 — little millet:** Agriculture and Agri-Food Canada’s French article now pairs `petit millet` with *Panicum sumatrense*. Canadian listings support little-millet flour, but the current picker’s substring fallback makes a `petit mil` query return only the proposed grain/flour pair while OQLF also uses that term for foxtail and pearl millet. Kept both identities outside the active picker. Updated the existing grain candidate, added a separate `candidate-little-millet-flour`, and recorded two formula-specific blocked bread findings. Package quantities were not treated as kitchen measures; no general substitution was activated.
- **WP03 Section F — chena:** Added only `chena` as an English alias on `ingredient-ref-common-millet`. IIMR maps Hindi Chena to proso millet; A1’s current Barrie listing uses the exact spelling for proso-millet grain. Kept `millet commun`, proso-flour fields, measures, forms, recipe links, and substitutions unchanged.
- **WP04 Section P — Atlantic pollock:** Added identity-only `ingredient-ref-atlantic-pollock` for *Pollachius virens*, displayed as `Atlantic pollock / goberge de l’Atlantique`, with `goberge Atlantique` as its sole alias. Generic `pollock` and `goberge` remain unassigned and now return both Alaska and Atlantic pollock identities. Kept surimi separate. No measures, forms, recipe links, yields, or substitutions were activated.

## Shared data changes

The active reference package has 1,344 references and 98 forms. It gained one Atlantic pollock reference and the common-millet alias `chena`; the little-millet candidates remain unallocated. The generated `BundledIngredientCatalog.kt` was regenerated from the reference JSON.

The research ledger has 1,657 records, 6,419 source entries, and 5,377 distinct source IDs. It now contains 342 measurement observations and 195 substitution findings. The R15 additions record the reviewed names, unresolved little-millet picker boundary, and the formula-specific bread findings. No recipe files or recipe links changed; the corpus remains 114 files / 1,123 ingredient rows with fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

## Verification

Bundled-package normalization and validation, generated-index freshness, ledger-schema validation, focused source-link and changed-key picker projections, unchanged recipe-corpus fingerprint, UTF-8 without BOM, local Markdown links, and whitespace checks passed. No app, unit, instrumentation, or emulator tests were run because the changes only add database JSON data and documentation, following the updated workspace rule.

The CFIA pollock query reuses its existing Alaska-record source ID. The ledger already contains a second pre-existing source ID for that same query URL on the walleye record; R15 adds no new ID or URL duplicate for it. A whole-ledger source-ID-to-URL scan also reports three pre-existing mismatches (`WP03-S3`, `WP03-S5`, and `WP03-S24`), all tied to unrelated Health Canada CNF serving URLs. Those legacy rows were not changed; scoped R15 source-ID and URL checks passed.

The active checklist and roadmap record the dispositions. WP02 A6, WP03 Section F, and WP04 Section P remain open. See the [WP02 little-millet proposal](../../proposals/wp02-a6-next-regional-flour-gap-review-20261013-round15-little-millet.md), [WP03 chena proposal](../../proposals/wp03-section-f-next-cereal-gap-review-20261013-round15-chena-alias.md), and [WP04 Atlantic pollock proposal](../../proposals/wp04-section-p-atlantic-pollock-goberge-identity-review-20261013-round15.md).
