# WP02 B2 potato-starch Québec alias integration

Integrated 2026-10-12.

## Decision

Added the exact OQLF-preferred plural French term `amidon de pommes de terre` as an alias of the existing `ingredient-ref-potato-starch`. Kept `farine de pommes de terre` unassigned because the Canadian retail listing does not establish a general product class or processing method. Potato flour remains a separate whole-potato milling product. No new ingredient identity was created.

The existing potato-starch ledger record now contains five additional source entries and an accepted naming decision. Its measurement and substitution research states remain `not_yet_researched`. The reference has no density or unit mappings. No forms, recipe links, measurements, conversions, yields, or substitutions were added.

## Audit and static verification

- The alias had no exact owner in the live reference catalog before integration, and no exact hit in forms or legacy import candidates. After integration, its only exact owner is `ingredient-ref-potato-starch`.
- `farine de pommes de terre` remains without an exact owner in references, forms, and legacy import candidates.
- All 114 manifest-listed recipes / 1,123 ingredient rows were scanned for reviewed English, French, and product-code terms. There were no text hits and no lines linked to either `ingredient-ref-potato-flour` or `ingredient-ref-potato-starch`.
- Reference normalization, bundled package normalization and validation, generated-catalog freshness, ledger schema validation, exact-owner scan, recipe scan, and UTF-8 without BOM checks passed.
- No tests or emulator checks were run because this was a database-JSON-only update under `AGENTS.md`.

## Current package snapshot

| Surface | Snapshot |
|---|---|
| Ingredient references | 1,235 rows; SHA-256 `fe44e14adc8b1ad613dd84e15a36a6c381f96ecded39a777fae1279bfc674abd` |
| Ingredient forms | 86 rows; SHA-256 `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Research ledger | 1,533 records / 5,285 source entries / 4,327 distinct source IDs; SHA-256 `893670ac5a67b8f9c4d1eb1688184aa3a1016c620a59cd1f7028d864e0a9b5b1` |
| Legacy import candidates | 66 rows; SHA-256 `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| Generated Kotlin catalog | 1,235 references; SHA-256 `6984414cba0130931d13751768e8cdf3c2e1dd4b66ff7cec586b1dccd515cbf9` |
| Seed manifest | 114 recipe paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files / 1,123 ingredient rows / 752,993 bytes; SHA-256 `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27` |

## Sources

The [review proposal](../../proposals/wp02-section-b-regional-starch-residual-gap-sweep-20261012.md) contains the bounded evidence table and source limits. The alias is supported by the [OQLF potato-starch terminology entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357374/fecule-de-pomme-de-terre). Product-boundary review also records [Kupiec](https://kupiec.pl/sklep/niezb%C4%99dne-w-kuchni/73-maka-ziemniaczana-500g.html), the [Walmart Canada French listing](https://www.walmart.ca/fr/ip/Farine-de-Pommes-de-Terre/18X5YZEXIFQC), [E-spolem](https://espolem.szczecin.pl/pl/p/Kupiec-Maka-ziemniaczana-500-g/11762), and [Galloway's potato flour](https://www.gallowaysfoods.com/products/potato-flour). The broader WP02 B2/B3 review remains open.
