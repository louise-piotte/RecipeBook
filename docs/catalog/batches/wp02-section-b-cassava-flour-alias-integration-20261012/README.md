# WP02 Section B — cassava-flour Québec French alias integration

## Decision

Added the Québec French search alias `farine de manioc` to the existing
`ingredient-ref-cassava-flour` reference. The canonical display remains
`edible cassava flour / farine comestible de manioc`. OQLF defines the exact shorter term as powder
from dry-ground manioc roots, while Codex defines edible cassava flour from dried cassava material
and retains the more specific French product label. Current Québec retail titles independently use
`farine de manioc` for cassava-flour products.

Kept wet-extracted manioc/tapioca starch separate. Did not add process-qualified cassava products,
forms, density, unit mappings, measurements, conversions, recipe links, yields, or substitutions.
Otto's 1:1-by-weight and 25%-less-by-volume advice remains specific to its branded single-ingredient
product and is not a general cassava-flour rule. Both measurement and substitution research states
remain `not_yet_researched`.

The full 114-recipe / 1,123-ingredient-row audit found no cassava-flour phrase or existing link, so
no recipe rows changed. See the [source review](../../proposals/wp02-section-b-alternative-flour-starch-gap-sweep-20261012.md)
for the ownership audit, prior-decision reconciliation, exact limits, and source details.

## Sources

- [OQLF — farine de manioc (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287122/farine-de-manioc): exact French headword; dry-ground manioc-root flour; English terms `manioc flour` and `cassava flour`.
- [Codex CXS 176-1989 — Norme pour la farine comestible de manioc](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/ua/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B176-1989%252FCXS_176f.pdf): edible flour identity, processing boundary, and label name `farine comestible de manioc`.
- [OQLF — fécule de manioc](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287219/fecule-de-manioc) and [tapioca](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497643/tapioca): support the separate wet-extracted starch/tapioca product family.
- [Marché Kaïa — SAC Cassava Flour / Farine De Manioc](https://marchekaia.com/products/sac-cassava-flour-farine-de-manioc) and [Marché des Continents — Farine de manioc (Cameroun)](https://marchedescontinents.ca/products/farine-manioc-cameroun): Québec retail wording only; no general process or measurement claims are inferred.
- [Otto's Naturals — Organic Cassava Flour](https://www.ottosnaturals.com/products/ottos-organic-cassava-flour): brand-specific replacement advice, not a generic conversion or substitution.

The eight source records and the accepted decision are stored on the existing cassava-flour ledger
record in `research-ledger.v1.json`.

## Snapshot and validation

Snapshot after integration; hashes cover the exact file bytes.

| Surface | Count | SHA-256 |
| --- | ---: | --- |
| Ingredient references | 1,228 | `373845dac8aa1453d0d4f85eaeb35033efc6130c347b75dc48e351b842576dde` |
| Ingredient forms | 86 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Legacy import identities | 66 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Research ledger | 1,526 records; 5,231 source entries; 4,294 distinct source IDs | `239362c04fe319180fdd78929b29383a174e5f605792dd4fea4ade7e6a93a563` |
| Generated Kotlin catalog | 1,228 references | `b20d530da179c1a91174d8290476685a8a0883ac48139f1185aa4965934b9720` |
| Seed manifest | 114 recipes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 files; 1,123 ingredient rows | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |

Seed-package validation, reference normalization, generated-catalog freshness, ledger validation,
normalized exact-key ownership, recipe scanning, UTF-8/no-BOM, and scoped whitespace checks passed.
No tests or emulator checks were run because this change only adds database JSON data, as directed in
`AGENTS.md`.
