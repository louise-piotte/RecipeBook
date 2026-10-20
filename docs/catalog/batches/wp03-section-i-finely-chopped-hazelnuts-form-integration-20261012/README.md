# WP03 Section I finely chopped hazelnuts form integration — 2026-10-12

## Decision

Added `ingredient-form-hazelnuts-finely-chopped` (`finely chopped hazelnuts / noisettes hachées
finement`) under `ingredient-ref-hazelnuts`. Linked only optional recipe 021#24. Preserved its source
wording, 60 g amount, unit, preparation string, and optional state. The source specifies a fine chop,
but no general particle-size standard is inferred. No measure, density, unit mapping, conversion,
yield, or substitution was added.

See the [source review](../../proposals/wp03-section-i-finely-chopped-hazelnuts-form-review-20261012.md).

## Evidence

- [Sally’s Baking Addiction, Bûche De Noël (Yule Log)](https://sallysbakingaddiction.com/buche-de-noel-yule-log/) lists optional finely chopped hazelnuts in the cocoa hazelnut whipped cream and describes sprinkling chopped hazelnuts over the filling.

## Static verification

- Bundled package validation passed.
- Ingredient-reference normalization passed; the generated catalog is current at 1,243 references.
- Research ledger validation passed with 1,546 records and 0 errors.
- The English and French form labels have unique catalog ownership. Optional recipe row 021#24 links to the form and preserves its 60 g amount.
- All 114 recipes and 1,123 ingredient rows remain present. The recipe corpus is 753,543 bytes with manifest-ordered SHA-256 `e69bbe384c744f4478791cd8fbc334430bab37b408e50a67ce716a5456d0b904`.
- Updated JSON has no BOM and stores non-ASCII text as Unicode escapes. Scoped `git diff --check` passed.
- No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

## Snapshot after integration

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-forms.v1.json` | 91 forms | `a8f7634add93654cf144d4d8ed5ef9346b0acc73ddbba1b3f455bac8adc6aad7` |
| `research-ledger.v1.json` | 1,546 records; 5,358 source entries; 4,398 distinct source IDs | `299e26b8a596f4625c127413f64a54b3752fe60cb515916d6e25143ed89c388c` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,543 bytes | `e69bbe384c744f4478791cd8fbc334430bab37b408e50a67ce716a5456d0b904` |
