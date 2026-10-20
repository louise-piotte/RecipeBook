# WP04 Section P — American smelt / éperlan identity integration (2026-10-12)

## Decision

Added identity-only `American smelt / éperlan` as `ingredient-ref-american-smelt`, scoped to
*Osmerus mordax*. `rainbow smelt` is the sole English search alias. OQLF supports the normalized
Québec display `éperlan`; keep `éperlan de lac` / `lake smelt` as distinct lake-product wording even
though it refers to the same species. Keep European smelt (*O. eperlanus*), Atlantic capelin, and
New Zealand whitebait separate.

No French aliases, forms, density, unit mappings, measurements, conversions, yields, recipe links, or
substitutions were added. The research ledger records that no supported culinary measure or
substitute was found. DFO's biological length information was not treated as a kitchen measure.

## Evidence and query boundary

- The [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fplist.asp?cmbIn=e&lang=e&q=American+Smelt)
  lists `Rainbow Smelt`, `Smelt`, `American Smelt`, and `Lake Smelt` for *O. mordax*, and lists
  European smelt separately under *O. eperlanus*. Its American Smelt row pairs the French field with
  `éperlan de lac`, while the distinct Lake Smelt row has no French field. OQLF's normalized
  `éperlan` display and separate lake-product entry set the Québec display and alias boundary.
- OQLF's [éperlan entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198849/eperlan)
  identifies the edible-fish term, prefers the normalized Québec display `éperlan`, and pairs it with
  *O. mordax*. It says `éperlan arc-en-ciel` was not retained for Québec fish-product
  commercialization.
- OQLF's [éperlan de lac entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198864/eperlan-de-lac)
  assigns that lake term to the same species but distinguishes its freshwater habitat and sensory
  properties. It is excluded from the general alias set.
- DFO's [American smelt profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/american-smelt-eperlan-arc-en-ciel-eng.html)
  identifies *O. mordax* and explains `rainbow smelt`; its fish lengths are biological observations.
- The [Québec species profile](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/eperlan-arc-en-ciel-pop-st-laurent)
  distinguishes capelin as a related but separate Osmeridae. It concerns a named population and does
  not establish general market availability.

The exact-query audit after integration finds `smelt`, `American smelt`, `rainbow smelt`, and
`éperlan` on this one reference. `European smelt`, `lake smelt`, `éperlan de lac`, and
`éperlan arc-en-ciel` do not resolve to it. `capelin` and `whitebait` retain their separate owners.

The manifest-listed recipe corpus contains 114 files and 1,123 ingredient rows. A full parsed-recipe
scan for smelt names, the French terms, the two Osmerus taxa, capelin, and whitebait found no
candidate phrase hits. No recipe link or saved recipe row changed.

## Static validation and snapshot

- Ingredient-reference normalization passed.
- Bundled seed-package normalization and validation passed.
- Research-ledger validation passed: 1,577 records and zero errors; all five integration source IDs
  belong to `ingredient-ref-american-smelt`.
- Generated `BundledIngredientCatalog.kt` is current at 1,269 references.
- Exact ownership and query-boundary checks passed; the full recipe scan found zero candidate hits.
- The reference and ledger JSON are UTF-8 without BOM and store non-ASCII characters as explicit
  Unicode escapes. Scoped `git diff --check` passed for the integration files.
- No app, unit, instrumentation, emulator, or deployment tests were run because this change only adds
  database JSON data, as allowed by `AGENTS.md`.

Hashes cover exact file bytes. The recipe fingerprint hashes each manifest-relative path, a NUL byte,
exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Count | Bytes | SHA-256 or corpus fingerprint |
| --- | ---: | ---: | --- |
| `ingredient-references.v1.json` | 1,269 references | 406,321 | `adb6080896bea039e290a96f8a739978edaa6c6be735efdb128abf10723056ce` |
| `ingredient-forms.v1.json` | 94 forms | 70,793 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 65 candidates | 15,508 | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,577 records; 5,566 source entries; 4,602 distinct source IDs | 5,442,433 | `d782590ca04ee42c40e3cd7896b8d75d6d3187b73b61f173997accb602d6634a` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,269 references | 556,196 | `20c9f6fdc61a2e3248ac2d41af0a6591547ae86a526bcb93808d5bbe0500f42c` |

See the [proposal](../../proposals/wp04-section-p-smelt-identity-review-20261012.md) for the full
ownership preflight, source limitations, and prior-work audit.
