# WP02 B2/B3 pigeon-pea flour Québec naming hold — 2026-10-12

## Decision

Keep pigeon-pea flour as an unallocated candidate. Food-science studies establish flour made from
*Cajanus cajan*, but the reviewed products use different seed treatments and fractions, and no
current Canadian product label or authoritative Québec French flour name settled a source-neutral
catalog scope. Keep `farine de pois cajan` as a research translation only. Do not add a flour
reference, alias, form, measure, density, unit mapping, recipe link, conversion, yield, or
substitution. The existing `pigeon peas / pois cajan` pulse identity and its aliases remain unchanged.

The exact-owner audit found no owner for `pigeon pea flour`, `toor dal flour`, `arhar flour`,
`red gram flour`, `farine de pois cajan`, or `farine de pois d’Angole` across active references,
forms, legacy identities, and ledger evidence. The whole-pulse names `pigeon peas / pois cajan` and
the existing aliases remain on `ingredient-ref-pigeon-peas`. The 114-recipe audit found no matching
phrase or ingredient row linked to that pulse reference.

## Evidence

- OQLF, [*pois cajan* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296902/pois-cajan),
  supports Québec French names for the pulse and English `pigeon pea`, but does not name a flour.
- Two primary studies report flour made from pigeon-pea seeds using different treatments, including
  soaking, dehulling, drying, grinding, and germination or fermentation. Their study-specific
  fractions do not establish one retail flour identity.
- A [Canadian listing for Sitara split pigeon peas (Toor)](https://www.walmart.ca/en/ip/Sitara-Split-Pigeon-Peas-Toor-4LB-1-8-kg/4A9N84CVD7O3)
  identifies a split pulse, not flour. It does not support qualified flour aliases.

The [review proposal](../../proposals/wp02-b2b3-pigeon-pea-flour-quebec-boundary-review-20261012.md)
contains detailed source locators, process boundaries, exact-query analysis, and reopening criteria.

## Current snapshot and static review

Snapshot after the coarse-sugar recipe link and sweet-potato-starch alias integration. File hashes
cover exact bytes. The recipe-corpus fingerprint hashes each manifest-relative path, a NUL byte, the
exact recipe-file bytes, and a trailing NUL byte in manifest order.

| Artifact | Count / state | SHA-256 or fingerprint |
|---|---:|---|
| `ingredient-references.v1.json` | 1,256 references | `8315070a479a50d0c06009d804c802bfc9506066e4da3af028eed7da7e1c7063` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,565 records / 5,481 source entries | `221b22c17eff1a7d135caa81225477b601b92dd1d6f0fa5f8b7cd41b5b4f8ec6` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows / 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

No catalog or ledger data changed for this documentation-only hold. Static ownership, recipe-demand,
UTF-8, no-BOM, final-newline, trailing-whitespace, and scoped diff checks were used. No app tests,
instrumentation tests, emulator checks, or deployment were run.
