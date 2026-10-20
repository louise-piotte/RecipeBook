# WP03 Section F puffed black rice identity integration (R93)

Proposal reviewed and integrated 2026-10-14. Section F remains open.

## Decision

Added identity-only `puffed black rice / riz noir soufflé` as a separate
`GRAIN_AND_CEREAL` reference from raw black rice, black glutinous rice, generic puffed rice, puffed
brown rice, and puffed wild rice. The French compound is attested in Canadian culinary sources; it
is not an OQLF ruling or a standalone retail label. The row has no aliases, forms, density, or unit
mappings. Its accepted ledger record contains four new sources and reuses four existing sources for
underlying black-rice and puffed-rice terminology. It records no supported measurement value and
leaves substitution research not yet researched. No recipe links, conversions, yields, or
substitution rules were added.

The qualified queries `puffed black rice` and `riz noir soufflé` return the new row alone. Broad
`black rice` and `riz noir` queries now return generic black rice, black glutinous rice, and puffed
black rice. Recheck those short-query results if the planned black-rice-vinegar identity is
activated. `puffed rice` / `riz soufflé` remain on generic puffed rice.

## Integration and validation

- Added one reference and one accepted `ingredient_reference` ledger record; regenerated the Kotlin
  ingredient catalog index. Current counts: 1,426 references, 104 forms, 1,765 ledger records, 63
  legacy candidates, 114 recipes, and 1,123 ingredient rows.
- Updated the Section F checklist, global catalog plan log, the grain-packet coverage summary, and
  `roadmap.md`.
- Seed package normalization and validation, reference normalization, ledger-schema validation, and
  generated-index freshness checks passed. The picker projection confirmed the boundaries above.
- Scanned all 114 manifest-listed recipes and 1,123 ingredient rows; no candidate phrases or direct
  links to neighboring black-rice and puffed-rice references were found. The four new source IDs
  are unique and the four reused IDs remain unchanged. UTF-8/no-BOM, local-link, and scoped
  whitespace checks passed.
- No app, Gradle, instrumentation, or emulator tests were run because this change only adds database
  JSON data and its generated index under `AGENTS.md`.

See the detailed [R93 review](../../proposals/wp03-section-f-puffed-black-rice-identity-review-20261014-r93.md).

## Main sources

- [Unilever Food Solutions Canada — Pan Seared Scallops with Gochujang Demi Glace](https://www.unileverfoodsolutions.ca/en/recipe.R0076688.html)
  calls the garnish `Puffed Black Rice` and provides a recipe-specific frying method.
- [Gordon Food Service Canada — Aubergine et riz noir soufflé](https://gfs.ca/fr-ca/idees/recette/aubergines-au-riz-noir-souffle/)
  and the [Canadian Armed Forces culinary bulletin](https://publications.gc.ca/collections/collection_2021/mdn-dnd/d3-45/D3-45-9-2-fra.pdf)
  attest the French culinary wording.
- [IRRI](https://ricetoday.irri.org/innovators-in-rice-science/) documents glutinous and non-glutinous
  black-rice varieties; do not infer glutinous type for this row.
- The primary puffing study, source limits, and reused terminology sources are listed in the detailed
  proposal.
