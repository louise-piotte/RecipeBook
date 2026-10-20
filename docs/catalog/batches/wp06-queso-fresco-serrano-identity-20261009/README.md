# WP06 Peruvian queso fresco serrano identity — 2026-10-09

This coordinator batch adds the source-named Peruvian cheese identity without treating it as a
universal fresh-cheese style or translating it to a different Québec cheese product.

## Catalog decision

- ID: `ingredient-ref-queso-fresco-serrano`
- English display: `queso fresco serrano`
- French display: `queso fresco serrano` (provisional pending Québec terminology review)
- Category: `CHEESE`
- No aliases, forms, density, unit mappings, measurements, conversions, substitutions, package
  yields, or recipe links were added.
- Keep it separate from cheese curds / fromage en grains, fromage frais, queso andino, and generic
  queso fresco. The source evidence supports the product name in Peruvian culinary and procurement
  contexts, not one composition or process specification.

## Sources and boundary review

The full source register and cheese comparisons are in
[`wp06-queso-fresco-serrano-boundary-review-20261009.md`](../../proposals/wp06-queso-fresco-serrano-boundary-review-20261009.md).
The integrated research-ledger record reuses unique sources
`WP06-QUESO-FRESCO-SERRANO-20261009-S01` through `S10`. Perú Travel, INEI, and MINCETUR provide
several distinct recipe contexts; a Peruvian procurement schedule separately names queso fresco
serrano and queso fresco de vaca. These sources do not justify a general alias or composition.

## Collision and recipe checks

The pre-integration audit scanned 481 references, 17 forms, 99 legacy candidates, and all 114
manifest-listed recipes / 1,123 ingredient rows. It found no exact normalized-key owner or recipe
text hit for the candidate phrases. The proposal records the query list and pre-integration hashes.
No RecipeBook recipe was changed or relinked.

## Validation

- Current package: 484 ingredient references (SHA-256
  `9f5f96bfc9c9e13b9347f2e1a410e05c75357384586b04bce45dbdc3ce3c0b23`), 18 forms (SHA-256
  `ee299dbe8f4a2349a16c495b37ac6ee4830a128fdceffd91f3bf2001f1e10617`), and 114 recipes
  (manifest SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`).
- Research ledger: 651 records, 940 source entries, 826 distinct source IDs (SHA-256
  `559954ed9afd499b2fd73e4d3cd9e5bcfcf0c14f0428f1fa043c8ad1626e7f51`); schema validation
  reported zero errors.
- Package normalization, reference normalization, generated-index freshness, ledger/package
  validation, all 9 Python package tests, and `git diff --check` passed.
- Android unit tests: 303 passed, 0 failures/errors/skips. Pixel 9a / Android 16 instrumentation on
  `emulator-5556`: 29 XML cases, 27 passed, 2 skipped, 0 failures/errors.
- The deployment script installed and launched the app. English and French picker searches for
  `queso fresco serrano` each returned one result with the source-named display. The blank draft was
  discarded and the French home returned to 114 recipes.

## Emulator screenshots

| Screenshot | SHA-256 |
|---|---|
| [English picker](en-picker.png) | `b6a21755e9d0a5efe191453a52c02f630337064c546296e7b8b12cc96236d482` |
| [French picker](fr-picker.png) | `cd5927c83a2d32c54b78f39c5ba0626ff59b022bff7b7b379bf41dcc2ab1dc69` |
| [French home, 114 recipes](fr-home-114.png) | `c0bc6b29be378f51e71e5838808d56ce7e19c45a3e62d0830f5ea0cd3119d9c7` |

Independent Québec terminology review and broader South American candidate coverage remain open.
