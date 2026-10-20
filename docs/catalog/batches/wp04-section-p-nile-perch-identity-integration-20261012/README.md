# WP04 Section P — Nile perch identity integration (2026-10-12)

## Decision

Added identity-only `ingredient-ref-nile-perch` as **`Nile perch / perche du Nil`** in `PROTEIN`,
scoped to *Lates niloticus*. No aliases were added. Keep yellow perch, barramundi, Nile tilapia,
bare `perch` / `perche`, `capitaine`, `African snook`, `perche Victoria`, and the scientific name
outside the search terms.

The ledger preserves one Québec recipe author's approximate 180 g per-person estimate for large
Nile-perch fillets and one IFAD recipe's two-pound sablefish alternative. Both are source-specific
evidence only. No active measure, form, density, mapping, recipe link, conversion, yield, or runtime
substitution rule was added. The IFAD alternative does not establish general interchangeability,
cooking-time adjustment, or food-safety equivalence.

The Canadian terminology pair and taxon are supported by [TERMIUM Plus](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=frr&lang=eng&srchtxt=NILE%20PERCH)
and Canada's [2026 Customs Tariff](https://www.cbsa-asfc.gc.ca/trade-commerce/tariff-tarif/2026/html/02/ch03-eng.html).
[Usito's perche entry](https://usito.usherbrooke.ca/d%C3%A9finitions/perche_1/lexies) distinguishes
the generic lexical item from `perche du Nil`. A [Recettes du Québec recipe](https://www.recettes.qc.ca/recettes/recette/filets-de-perche-du-nil-a-la-franceska-147434)
contains the approximate portion estimate; [IFAD's poached sablefish recipe](https://www.ifad.org/documents/38714174/40224979/recipes-for-change-poached-sable-fish.pdf/936572b9-a457-db4e-c488-f9ace3a2be20?t=1668426909031)
is the only source for the recipe-specific alternative. See the [full identity review](../../proposals/wp04-next-open-seafood-gap-review-20261012.md)
for all source limits and the seller-specific product evidence.

## Picker and recipe audit

Picker results were evaluated using `IngredientReferenceSearchIndex` normalization, form-term
handling, whole-phrase matching, and partial fallback against the live catalog:

| Query | Result |
|---|---|
| `Nile perch` | Nile perch / perche du Nil only |
| `perche du Nil` | Nile perch / perche du Nil only |
| `perche` | Nile perch / perche du Nil only; retain this broad-query limitation |
| `perch` | yellow perch and Nile perch |
| `capitaine`, `African snook`, `perche Victoria`, `Lates niloticus` | No results |

The manifest contains 114 recipes and 1,123 ingredient rows. A full scan for the species name,
scientific name, and both reference IDs found zero bundled recipe hits and no recipe links.

## Package snapshot after integration

Hashes cover exact bytes. The recipe corpus digest hashes each manifest-relative path, a NUL byte, its
exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Count / size | SHA-256 or corpus digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,274 references; 408,049 bytes | `7dd8e817ac83fb11b5ee486007178f90e966e062cd890944dfa1a430a103b726` |
| `ingredient-forms.v1.json` | 94 forms; 70,793 bytes | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 65 candidates; 15,508 bytes | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,582 records; 5,608 source entries; 4,644 source IDs; 8 conversions; 5,487,917 bytes | `bf2cba1f35c4d6281475358bb9623f42a2570be0991cc14fc6bc274aa566da14` |
| `manifest.v1.json` | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,274 references; 558,452 bytes | `51494e0aaed4b5546a2cb93ada4d559903807453e9640adf608374867be2318c` |

## Validation

- Ingredient-reference normalization, bundled-package normalization, package validation, and
  generated-catalog freshness checks passed.
- Exact bilingual display queries return the new species identity. The `perche` result remains
  species-qualified; English `perch` presents both yellow perch and Nile perch.
- No excluded common name or scientific name is an alias or picker result.
- The full 114-file / 1,123-row recipe scan found no matching text or reference ID.
- The ledger has nine sources, one source-specific measurement observation, and one recipe-specific
  substitution finding. No runtime substitution rule or active measure was added.
- No app tests or emulator checks were run because this change only adds database JSON data and its
  generated index, as stated in `AGENTS.md`.
