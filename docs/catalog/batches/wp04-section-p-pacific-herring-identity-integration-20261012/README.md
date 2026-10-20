# WP04 Section P — Pacific-herring identity integration (2026-10-12)

## Decision

Added identity-only `Pacific herring / hareng du Pacifique` as
`ingredient-ref-pacific-herring` in `PROTEIN`, for *Clupea pallasii*. No aliases were added. Keep
Atlantic herring, unqualified herring, roe, and preserved herring products separately scoped. The
114-recipe corpus has no matching demand.

Health Canada CNF food code 3018 observations are recorded only in the research ledger: one raw fish
listed as `fish (700 g)` corresponds to 378.6 g edible portion, one fillet is listed as 184 g, one
food-guide serving is 90 g, and total refuse is 46%. These are source-specific observations; none is an
active recipe measure, count mapping, reusable fillet weight, or generalized edible-yield conversion.
No forms, density, unit mappings, recipe links, conversions, yields, or substitutions were added.

## Evidence and limits

- Fisheries and Oceans Canada identifies Pacific herring as *Clupea pallasii* and describes commercial
  fisheries for food and bait, roe, and spawn-on-kelp: [English plan](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/herring-hareng-ifmp-pgip-sm-eng.html),
  [French plan](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/herring-hareng-ifmp-pgip-sm-fra.html).
- The Translation Bureau's TERMIUM Plus pairs `Pacific herring / hareng du Pacifique` with
  *Clupea pallasii* and marks the French commercial-fisheries name as standardized:
  [TERMIUM Plus](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frb&lang=fra&srchtxt=HARENG+PACIFIQUE).
- Health Canada CNF food code 3018 supplies the raw-food portions and refuse percentage above:
  [serving portions](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3018).
- CFIA's fish-grade compendium defines generic herring there as *Clupea harengus* or *C. pallasii*.
  This supports keeping unqualified herring distinct from the two species-qualified references; it
  does not make the species interchangeable: [Volume 8 — Fish](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-grade-compendium-volume-8).

## Ownership and corpus review

The exact normalized phrases `Pacific herring` and `hareng du Pacifique` each have one active owner,
`ingredient-ref-pacific-herring`, and no competing form or legacy-candidate owner. Broad `herring` and
`hareng` searches return both the existing Atlantic herring and new Pacific herring identities. No
broad alias was added. The complete 114-file, 1,123-row recipe scan found no matching Pacific-herring
or related phrase; no recipe rows were changed.

## Package snapshot after integration

Hashes cover exact file bytes. The recipe-corpus fingerprint hashes each manifest-relative path, a NUL
byte, exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Count | Bytes | SHA-256 or corpus fingerprint |
| --- | ---: | ---: | --- |
| `ingredient-references.v1.json` | 1,265 references | 404,968 | `9ba32a8390b08dc51e58febd93489f51ec74be85468efb3eeb4e699ad1f15cf4` |
| `ingredient-forms.v1.json` | 94 forms | 70,793 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 66 candidates | 15,752 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,574 records; 5,534 sources; 4,570 distinct source IDs | 5,412,817 | `4de44380aa8c51109e4e99052ac3410e8bec8a3bc23f53f6874b765e9ae2c0b3` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,265 references | 554,429 | `58dfc0ce6067f370b53a24dd90fb74dadccacbd3c52236df8dc91debd07a2598` |

## Static verification

- Reference normalization, generated-index freshness, bundled seed-package validation, and research-
  ledger schema validation passed.
- Exact phrase ownership, broad herring query behavior, and full recipe-corpus phrase scan passed.
- Database JSON is UTF-8 without BOM and uses explicit Unicode escapes. Scoped whitespace and
  `git diff --check` passed.
- No app, unit, instrumentation, emulator, or deployment tests were run because this change only adds
  database JSON data, as allowed by `AGENTS.md`.
