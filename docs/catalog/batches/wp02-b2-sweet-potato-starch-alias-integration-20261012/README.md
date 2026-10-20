# WP02 B2 sweet-potato-starch French alias integration — 2026-10-12

## Decision

- Added only `amidon de patate douce` to `aliasesFr` on the existing `ingredient-ref-sweet-potato-starch` reference.
- Kept `sweet potato starch / fécule de patate douce` as the canonical display, with category `FLOUR_AND_STARCH`, null density, and no unit mappings.
- Kept the root, whole-root flour, and finished sweet-potato-starch noodles separate. Did not activate `amidon de patates douces`, broad `amidon`, or add a recipe link.
- Added OQLF and product-label evidence to the existing research-ledger record. No measurements, forms, conversions, yields, or substitutions were added.

## Evidence and limits

- OQLF, [fécule de patate douce (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287217/fecule-de-patate-douce): identifies the extracted starch from *Ipomoea batatas* tuberous roots and gives `sweet potato starch` as its English term. It does not list the exact alias.
- OQLF, [amidon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon): identifies `amidon` as the preferred general term and explains that `fécule` is more precise for starch in tubers or other underground organs. It does not independently approve the exact compound.
- Walmart Canada, [SunGiven Vermicelles de Patates Douces](https://www.walmart.ca/fr/ip/SunGiven-Vermicelles-de-Patates-Douces/10283597): current French product details use `Amidon de Patate Douce` in the ingredient declaration. This is finished-noodle ingredient text, not a pure-starch package or terminology ruling; Walmart says supplier and third-party data are not independently verified. The page was out of stock at access.
- Haisue, [Daesang Sweet Potato Glass Noodle 500g](https://haisue.ca/products/daesang-sweet-potato-glass-noodle-500g): current Canadian listing calls the finished product a sweet-potato glass noodle and lists sweet potato starch plus other ingredients. It supports the separate noodle boundary, not a starch measure or conversion.

The reviewed decision is recorded in [the proposal](../../proposals/wp02-b2-sweet-potato-starch-french-alias-review-20261012.md) and the ledger record `ingredient-ref-sweet-potato-starch`.

## Snapshot and exact ownership

The review proposal was prepared before the same-day coarse-sugar integration. Immediately before this alias change, the package contained 1,256 references, 94 forms, 66 legacy candidates, 1,565 ledger records with 5,477 sources / 4,515 distinct source IDs, and 114 manifest-listed recipes.

| Artifact | SHA-256 before alias integration |
|---|---|
| `ingredient-references.v1.json` | `e036e35d32c5f7dbce09eda5f533ddd24be89dfd5a8415025388002d79264d65` |
| `ingredient-forms.v1.json` | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | `c18da49dbe6b8b6273c7c80580cb4c477542c5ec911d2c602804cf6825732312` |
| `manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

After integration, `ingredient-references.v1.json` has SHA-256 `8315070a479a50d0c06009d804c802bfc9506066e4da3af028eed7da7e1c7063`, and `research-ledger.v1.json` has SHA-256 `221b22c17eff1a7d135caa81225477b601b92dd1d6f0fa5f8b7cd41b5b4f8ec6`.

The exact normalized phrase `amidon de patate douce` had no owner in reference displays or aliases, forms, legacy candidates, or ledger evidence before integration. Afterward, its sole active exact owner is `ingredient-ref-sweet-potato-starch`. The plural `amidon de patates douces` remains unassigned. The existing noodle reference retains its own displays and aliases.

All 114 manifest-listed recipes and 1,123 ingredient rows were rescanned after the preceding coarse-sugar recipe link. There are zero ingredient-row matches for the proposed alias, starch identity, flour identity, or finished noodle names. The corpus remains 114 files / 1,123 ingredient rows / 753,792 bytes with fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

## Static verification

- Bundled seed normalization check and `--validate-only` passed.
- Ingredient-reference normalization check passed.
- Generated catalog check passed at 1,256 references.
- Research-ledger JSON Schema validation passed; the ledger now has 1,565 records / 5,481 source entries / 4,519 distinct source IDs.
- Exact phrase ownership, recipe-demand scan, UTF-8/no-BOM, final-newline, trailing-whitespace, and `git diff --check` checks passed.
- No app tests, instrumentation tests, emulator checks, or deployment were run. The updated `AGENTS.md` rule exempts additions to database JSON files from testing.
