# WP04 Section P — gilthead-bream picker-boundary hold (2026-10-12)

## Decision

**Current catalog note (R604):** separate, visibly qualified `bream / brème` and `sea bream /
dorade` market-name groups now preserve broad query scope. The *Sparus aurata* species candidate
remains outside active data; R604 did not add its identity, aliases, form, recipe link, or numeric
behavior. The hold rationale below records the picker state when this batch was reviewed on
2026-10-12.

Recorded the hold for `gilthead bream / dorade royale` (*Sparus aurata*). OQLF, CFIA, and FAO
support the species identity and bilingual name pair, but the current picker matches complete phrases
inside display names. Adding the species-only row would therefore make the broader English query
`bream` and French query `dorade` each return this one species. Keep the candidate outside the active
catalog and ledger until search can preserve the generic scope or clearly communicate ambiguity.

The review scanned all 114 manifest-listed recipe files, all 1,123 ingredient rows, and the complete
recipe JSON text. It found no candidate or generic bream/dorade phrase hits. No active reference,
ledger record, recipe link, form, measure, conversion, yield, or substitution changed in this batch.
The proposal's four source IDs were local to that review; R604 later reuses its OQLF source ID S02
for a source record in the research ledger. The other three remain proposal-local.

The source review and detailed limits are in
[`wp04-section-p-gilthead-bream-dorade-royale-picker-boundary-review-20261012.md`](../../proposals/wp04-section-p-gilthead-bream-dorade-royale-picker-boundary-review-20261012.md).
It cites [OQLF's `dorade royale` entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199006/dorade-royale),
the [CFIA Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list),
[FAO's *Sparus aurata* sheet](https://www.fao.org/fishery/docs/DOCUMENT/aquaculture/CulturedSpecies/file/en/en_giltheadseabr.htm),
and a [Mayrand Québec retail listing](https://mayrand.ca/fr/nos-produits/poissonnerie/poissons-a-larrivage/dorade-royale-entiere-fr-52921).
The listing's approximate 500 g item size is product-specific and was not activated as a measure.

## Package snapshot at reconciliation

No package data changed in this batch. Hashes cover exact file bytes. The recipe-corpus fingerprint
hashes each manifest-relative path, a NUL byte, exact recipe bytes, and a trailing NUL byte in
manifest order.

| Artifact | Count | Bytes | SHA-256 or corpus fingerprint |
| --- | ---: | ---: | --- |
| `ingredient-references.v1.json` | 1,260 references | 403,410 | `f0e0f496d79abedf2e4ff0409cdc0acaaad389f6b08161ece4c6180d68185434` |
| `ingredient-forms.v1.json` | 94 forms | 70,793 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 66 candidates | — | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,569 records; 5,502 sources; 4,540 distinct source IDs | — | `5c551e67598cbefed66d9cbbb98ba869e5cb62c627df58fc5ab01f576ab9c13` |
| `manifest.v1.json` | 114 recipe paths | — | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,260 references | — | `75aca2182e780bc0fc9401d97ad88b78ed49e3ee530bc6a54a669bca55ea19ee` |

## Reconciliation

- The plan checklist and roadmap record the hold; Section P remains open. R604 later represented the
  broad bream/dorade queries with separate multi-species groups while keeping this species candidate
  outside the active catalog.
- No tests or emulator checks were needed because this reconciliation changed documentation only.
- UTF-8, no-BOM, newline, trailing-whitespace, and scoped `git diff --check` validation passed.
