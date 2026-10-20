# Einkorn berries and cusk identity integration — 2026-10-12

## Decisions

Added two identity-only ingredient references:

| ID | English / Québec French | Category | Aliases |
|---|---|---|---|
| `ingredient-ref-einkorn-berries` | `einkorn berries / grains de petit épeautre` | `GRAIN_AND_CEREAL` | None |
| `ingredient-ref-cusk` | `cusk / brosme` | `PROTEIN` | None |

The einkorn row is scoped to cultivated *Triticum monococcum* subsp. *monococcum*. Canadian and
Québec retail listings use the paired English and French product displays, while TERMIUM supports
the species/name mapping. Keep einkorn flour, broader wheat berries, emmer, spelt, wild einkorn, and
unqualified farro separate. No alias or form was added.

The cusk row is scoped to *Brosme brosme*. OQLF supports Québec French `brosme` in the edible-fish
domain and pairs it with `cusk`; CFIA distinguishes this species from cusk-eel/kingklip. Keep torsk,
tusk, other broad market names, cusk-eel, and stockfish separate. The fisheries and conservation
sources are context only: the catalog row makes no claim about a directed fishery, present retail
availability, sourcing, or legal permission.

The ledger records no supported reusable einkorn measure and no supported cusk measurement or
substitute. No forms, default measures, densities, unit mappings, recipe links, conversions, yields,
or substitutions were added.

## Post-integration snapshot

Hashes cover exact bytes. The recipe-corpus fingerprint hashes each manifest-relative path, a NUL
byte, exact recipe-file bytes, and a trailing NUL byte in manifest order.

| Artifact | Count / state | SHA-256 or fingerprint |
|---|---:|---|
| `ingredient-references.v1.json` | 1,260 references | `f0e0f496d79abedf2e4ff0409cdc0acaaad389f6b08161ece4c6180d68185434` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,569 records / 5,502 source entries / 4,540 distinct source IDs | `5c551e67598cbefed66d9cbbb98bba869e5cb62c627df58fc5ab01f576ab9c13` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `BundledIngredientCatalog.kt` | Generated index for 1,260 references | `75aca2182e780bc0fc9401d97ad88b78ed49e3ee530bc6a54a669bca55ea19ee` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows / 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The normalized exact-owner audit assigns `einkorn berries` and `grains de petit épeautre` only to
the new einkorn row. The pre-existing flour row remains separate; broad `einkorn` and `petit
épeautre` searches may return both products. The new cusk row owns `cusk` and `brosme` only; it has
no alternate aliases. The 114-recipe / 1,123-row corpus has no candidate phrase hits or links for
either identity.

## Static verification

The ingredient-reference normalization check, generated catalog refresh/check, seed-package
validation, research-ledger schema validation, normalized ownership audit, recipe-corpus scan,
UTF-8/no-BOM check, and scoped `git diff --check` passed. No app tests, instrumentation tests,
emulator checks, or deployment were run; the change adds database JSON data plus its generated index
and documentation.
