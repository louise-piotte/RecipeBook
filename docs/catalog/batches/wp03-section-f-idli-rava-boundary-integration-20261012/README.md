# WP03 Section F idli-rava boundary integration

Integrated 2026-10-12 as a ledger-only hold.

## Decision

Added `candidate-idli-rava` with nine bounded sources and an unresolved decision. The sources support a dry, coarse rice product used for idli, but do not settle whether parboiling is required for the generic product class. Canadian French listings use both `semoule de riz` and `semoule de riz grossière`; the OQLF's unqualified `semoule` entry is defined in wheat-milling contexts and does not establish a preferred Québec French name for this rice product. A study's control idli uses idli rava specifically as parboiled-rice semolina, which is evidence for that preparation rather than a universal specification.

Keep `ingredient-ref-idli-rava` unallocated. Do not activate `idli rava`, `idly rava`, `rice rava`, `rice semolina`, `rice sooji`, or French aliases. Keep bare `rava` / `rawa`, wheat semolina, prepared rava/idli/dosa mixes, intact rice, rice flour, and cream-of-rice hot cereal distinct. No forms, measurements, conversions, yields, recipe links, or substitutions were added.

## Audit and static verification

- Candidate phrase keys had no exact owner in active references, forms, legacy candidates, or ledger record IDs before integration. All nine source IDs were absent from the live ledger and are now attached to the new candidate record.
- The full manifest scan covered 114 recipe files / 1,123 ingredient rows. It found no candidate-term matches or lines linked to idli rava / rice rava.
- Bundled package validation and research-ledger schema validation passed. Source-ID uniqueness, exact candidate-key ownership, recipe scan, and UTF-8 without BOM checks passed.
- No tests or emulator checks were run because this change only adds a research candidate to database JSON under `AGENTS.md`.

## Current package snapshot

| Surface | Snapshot |
|---|---|
| Ingredient references | 1,235 rows; SHA-256 `fe44e14adc8b1ad613dd84e15a36a6c381f96ecded39a777fae1279bfc674abd` |
| Ingredient forms | 86 rows; SHA-256 `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Research ledger | 1,534 records / 5,294 source entries / 4,336 distinct source IDs; SHA-256 `baffa3f9442bacf3807d44676fd051956e827e75c97518f7007312a8ee2e58eb` |
| Legacy import candidates | 66 rows; SHA-256 `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| Generated Kotlin catalog | 1,235 references; SHA-256 `6984414cba0130931d13751768e8cdf3c2e1dd4b66ff7cec586b1dccd515cbf9` |
| Seed manifest | 114 recipe paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files / 1,123 ingredient rows / 752,993 bytes; SHA-256 `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27` |

## Sources

The [review proposal](../../proposals/wp03-section-f-idli-rava-boundary-review-20261012.md) contains the full nine-source register and source limits. Key references are the [food-science study](https://www.ijcmas.com/6-10-2017/M.%20Mounika%2C%20et%20al.pdf), the [OQLF entry for *semoule*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8895941/semoule), the [Canadian French Walmart product listing](https://www.walmart.ca/fr/ip/Priya-Idly-Idli-Rava-Farine-de-Semoule-de-Riz-Grossi-re-tuv-e-2-lb-907-g/0ZE42SQ6UMZV), and the [Priya Foods instant rava idli mix ingredient list](https://priyafoods.com/products/instant-rava-idli-mix-200g). Broader Section F work remains open.
