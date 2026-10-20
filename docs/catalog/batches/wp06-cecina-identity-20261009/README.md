# WP06 Peruvian Amazon cecina identity — 2026-10-09

This coordinator batch adds one narrowly scoped identity for the dried-and-smoked preserved-meat
family used in Peruvian Amazonian cooking. It does not claim that every product called `cecina`
has this regional meaning or that the family uses only pork.

## Catalog decision

- ID: `ingredient-ref-peruvian-amazonian-cecina`
- English display: `Peruvian Amazon cecina (smoked, dried meat)`
- French display: `cecina de l’Amazonie péruvienne (viande séchée et fumée)` (provisional pending
  independent Québec terminology review)
- Category: `PROTEIN`
- No aliases, forms, density, unit mappings, measurements, conversions, substitutions, package
  yields, or recipe links were added.
- Keep it separate from camelid charqui, charque, chalona, generic jerky, and broad dried or smoked
  meat terms. CONCYTEC describes Peruvian Amazon cecina as dried and smoked and says regional
  varieties differ by meat species, seasonings, and smoking method. Common pork preparations do not
  make pork an invariant product attribute.

## Sources

The full proposal and source register are in
[`wp06-cecina-boundary-review-20261009.md`](../../proposals/wp06-cecina-boundary-review-20261009.md).
The integrated ledger record reuses its unique source IDs `WP06-CECINA-20261009-S01` through `S12`.
Key evidence includes CONCYTEC's account of regional product variation, PROMPERÚ's tacacho context,
and MINCETUR's local Ucayali pork example. These sources support the bounded family identity, not a
single national technical standard.

## Collision and recipe checks

Before integration, the proposal's exact normalized-key audit found no active reference, form, or
legacy-candidate owner for the cecina and proposed-label terms. The audit also checked the charqui
boundary labels. The 114 manifest-listed recipes (1,123 ingredient rows) had no candidate-term hits;
no recipe link or recipe text was changed. The proposal records the 480-reference pre-integration
snapshot, scanned phrases, method, and hashes. The manifest-ordered recipe corpus digest remains
`e80d97c204558cb88e7a773c04b59742c116f595f10970c6785d25714a7e5397`.

## Validation

- Current package: 481 ingredient references (SHA-256
  `0279b730ce312b11048fe93237f93558b116318e9fb231d6b93173b6dc9e7be8`), 17 forms (SHA-256
  `2098e1048796a1aba42c25e4020f018d02c04c332567620432084fceac8f2d15`), and 114 recipes
  (manifest SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`).
- Research ledger: 647 records, 912 source entries, 799 distinct source IDs (SHA-256
  `1c09f68b2ce33fbe7e2ab3751ad45d304d304f375856c4ab2d59bd63213b3ff7`); schema validation
  reported zero errors.
- Package normalization, generated-index freshness, ledger validation, all 9 Python package tests,
  UTF-8/no-BOM/escaped-Unicode checks, and `git diff --check` passed.
- Android unit tests: 301 passed, 0 failures/errors/skips. Pixel 9a / Android 16 instrumentation on
  `emulator-5556`: 29 XML cases, 27 passed, 2 skipped, 0 failures/errors.
- The deploy script installed and launched the app. English and French searches for `cecina` each
  returned the single localized cecina result. The temporary draft was discarded; the French home
  returned to 114 recipes.

## Emulator screenshots

| Screenshot | SHA-256 |
|---|---|
| [English picker: cecina](en-picker.png) | `7677dab761672f37fce07c3abc5ef31a122ac709cb0fbe2af63e066aeed004e0` |
| [French picker: cecina](fr-picker.png) | `0b66fc918766d7013b3f0954cc656149925bdd904beb6f9c6a1530f2c927d55a` |
| [French home, 114 recipes](fr-home-114.png) | `d71376bb12d02c0404df5696b3583f273aca46e98df1b73d5347d50e24271873` |

## Open work

Independent Québec terminology review and broader South American identity and gap review remain
open. See the South American cuisine gap sweep for related candidate dispositions.
