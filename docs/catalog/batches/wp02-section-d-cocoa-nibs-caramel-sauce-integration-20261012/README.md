# WP02 Section D — cocoa nibs and caramel sauce integration

- **Date:** 2026-10-12
- **Status:** integrated; Section D remains open
- **Proposal:** [`wp02-section-d-confectionery-fruit-gap-sweep-20261012.md`](../../proposals/wp02-section-d-confectionery-fruit-gap-sweep-20261012.md)

## Catalog changes

Added two identity-only references, with no bundled recipe links:

- `ingredient-ref-cocoa-nibs`: `cocoa nibs / cacao en grains`; French alias `grué de cacao`; English aliases `cocoa nib` and `cacao nibs`. Kept `cracker cocoa`, U.S.-marked singular `cacao nib`, and unqualified `nibs` out of picker aliases. Cocoa nibs are cacao-bean pieces, not a chocolate form or a synonym for chips, shavings, cocoa powder, cocoa mass, or cocoa butter.
- `ingredient-ref-caramel-sauce`: `caramel sauce / sauce au caramel`, no aliases. Kept it separate from dulce de leche, salted caramel sauce wording, caramel/toffee bits, butterscotch chips, and confectionery caramels.

Both have `defaultDensity: null`, `unitMappings: []`, no forms, and no substitutions. The ledger records nine new sources and accepted decisions for both identities. The two Metro recipes show different formulations; the English recipe page displays a 1 L yield for its named formula, and a salted-caramel recipe reports four servings. Callebaut lists one 1 kg cocoa-nib bucket and one 1 kg caramel-topping bottle. These source-specific quantities remain in the ledger descriptions; no general measure or package-yield data was added.

The audit found no exact term owners before integration and no mentions in the manifest-listed recipe corpus. All 114 recipe files and 1,123 ingredient lines remain unchanged. The wider review remains open for chocolate bars, chunks, wafers, fèves, grated/chopped chocolate and other supported forms; fruit purées, powders, freeze-dried fruit, pastes, jams, curds, fillings, and dulce de leche; and the open measurement and substitution questions for current fruit-product identities.

## Snapshot

| Artifact | Count | SHA-256 or fingerprint |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 1,235 references | `b55f15a8e10fb802e4f1bfb0574a8142a2cc6f4dca349c481cfe3abae21ed330` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,533 records; 5,280 source entries; 4,322 distinct source IDs | `7a8bb76d9454d8b1bc5975424b893422411194b9f9990f0395b037d6307de422` |
| Generated `BundledIngredientCatalog.kt` | 1,235 references | `ee672c759b6b0d79de628a1d972d03ba4473e4480a60ab35dcf710141fa6fbf5` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 rows; 752,993 bytes | `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27` |

## Verification

- Ingredient-reference normalization check passed.
- Bundled seed package validation and normalization checks passed; this validated the research-ledger schema and semantics.
- Generated catalog freshness check passed.
- Exact-key scan found one owner for each accepted display/alias, no owner for excluded `cracker cocoa`, and no recipe-text hits for the candidate terms.
- Nine new source IDs are unique and absent from the prior ledger snapshot.
- Updated database JSON is UTF-8 without BOM; French aliases are Unicode-escaped in the JSON.
- No tests or emulator checks were run because this change only adds database JSON data, as directed in `AGENTS.md`.
