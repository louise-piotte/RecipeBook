# WP02 B2 — cowpea-flour Québec name and product-scope hold (2026-10-12)

## Decision

Keep a new cowpea-flour identity on hold. The Québec-facing seller's current page titles its product
`COWPEA FLOUR` and describes uses, but gives no French name, ingredient declaration, species
statement, or seed-processing specification. Its older indexed French catalogue lists
`FARINE DE NIÉBÉ` as out of stock. That history is not enough to establish the current package name
or whether this seller's flour is whole-seed or dehulled.

OQLF's `dolique à œil noir` entry and Health Canada's CNF record support names for whole cowpeas, not
flour. IITA documents both whole and dehulled niébé flour processes, and Senegal has a standard for
niébé flour; those sources establish product/process variation without identifying the Québec-facing
SKU. Keep `cowpea` and the existing whole-pulse names on `ingredient-ref-black-eyed-peas`. Do not
create a flour reference or candidate, redirect whole-pulse aliases, or add a form, measure, recipe
link, conversion, yield, or substitution.

The 114-recipe, 1,123-row corpus contains no cowpea-flour or whole-cowpea request. The full ownership,
picker, recipe, and source review is in
[`wp02-b2-cowpea-flour-quebec-name-scope-hold-20261012.md`](../../proposals/wp02-b2-cowpea-flour-quebec-name-scope-hold-20261012.md).

Evidence includes [OQLF's whole-pulse entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082985/dolique-a-oeil-noir),
[Health Canada's CNF serving record](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3281),
the current [Makeda English product page](https://www.makedasnfood.com/en/products/farine-de-niebe-copie),
the [older indexed French collection listing](https://www.makedasnfood.com/collections/all?page=2),
and IITA's [French cowpea/soy processing manual](https://www.iita.org/wp-content/uploads/2022/02/Cowpea-Soybean-manual_-French-Final.pdf).

## Current package snapshot at reconciliation

No database or recipe data changed in this hold. Hashes cover exact file bytes; the recipe-corpus
fingerprint hashes each manifest-relative path, a NUL byte, exact recipe bytes, and a trailing NUL
byte in manifest order.

| Artifact | Count | SHA-256 or corpus fingerprint |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 1,261 references | `5a464c9946adab22bc711abedc370635dcb57e544c26d04e0619cb786a0d4cc4` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,570 records; 5,507 sources; 4,545 distinct source IDs | `aae4715ecca72cafae0234e88c4f479cdc9683e3eb4944c48c94e0036109f530` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Reconciliation

- The plan and roadmap record the hold; the whole-pulse reference and its accepted ledger record are
  unchanged. No cowpea-flour ledger candidate or proposal source IDs were added.
- No tests or emulator checks were run because this reconciliation changed documentation only.
- UTF-8 without BOM, newline, scoped whitespace, and `git diff --check` checks passed.
