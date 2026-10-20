# Adzuki flour Québec naming and picker hold — 2026-10-12

## Decision

Hold catalog promotion for adzuki flour. Manufacturer and primary-study sources document adzuki
flours, including red and green unhusked-bean flour and roasted or otherwise treated products, but
the reviewed evidence does not establish one Canadian consumer-product scope or a Québec French
flour name. Keep plausible French compounds as research wording only.

There is also a picker conflict: the current whole-bean reference displays `adzuki beans`, and the
query `adzuki bean` currently falls back to that row. Adding `adzuki bean flour` would create a
complete-phrase match for the singular query and return the flour row ahead of the existing whole
bean result. French `farine de haricot adzuki` would make `haricot adzuki` retrieve both products.
Keep the verified whole-bean identity, its dried form, and recipe 004's anko preparation unchanged.
Add no flour reference, alias, candidate, form, measurement, conversion, yield, recipe link, or
substitution. The [proposal](../../proposals/wp02-b2-adzuki-flour-quebec-boundary-hold-20261012.md)
contains source locators, the normalized ownership audit, and reopening criteria.

## Current snapshot

The database package has since received unrelated reviewed additions; this snapshot records the
current shared artifacts after the kaniwa, Atlantic wolffish, einkorn-berries, and cusk integrations.
The adzuki whole-seed row and dried form remain unchanged.

| Artifact | Count / state | SHA-256 or fingerprint |
|---|---:|---|
| `ingredient-references.v1.json` | 1,260 references | `f0e0f496d79abedf2e4ff0409cdc0acaaad389f6b08161ece4c6180d68185434` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,569 records / 5,502 source entries / 4,540 distinct source IDs | `5c551e67598cbefed66d9cbbb98bba869e5cb62c627df58fc5ab01f576ab9c13` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows / 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The hold changes documentation only. No app tests, instrumentation tests, emulator checks, or
deployment were run.
