# WP06 makrut lime leaves integration — 2026-10-09

This batch adds a leaf-specific *Citrus hystrix* ingredient identity and the three explicitly
documented preservation states. The fruit, rind, zest, and juice remain separate concepts.

## Catalog decision

- ID: `ingredient-ref-makrut-lime-leaves`; category: `HERB`.
- Displays: `makrut lime leaves` / `feuilles de combava`. The French wording is descriptive and
  remains provisional pending independent Québec terminology review.
- Aliases: `makrut lime leaf` / `feuille de combava`. Bare `combava`, generic lime terms, and
  `kaffir` wording are excluded from aliases.
- Forms: fresh, frozen, and dried leaves. No density, unit mapping, measurement, conversion,
  substitution, or recipe link was added.
- The 114-recipe scan found no makrut/combava leaf rows; no recipe changed.

OQLF supplies the French fruit term `combava`, the English term `makrut lime`, and notes the
culinary use of the leaves. UCANR explicitly names fresh, frozen, and dried leaf states; the Thai
Herbal Pharmacopoeia independently defines dried *C. hystrix* leaf. The Thai Department of Internal
Trade PDF originally cited by the proposal returned 404 on coordinator recheck and is not relied
upon. The name choice also avoids a documented English usage hazard for `kaffir`. Source locators
and evidence limits are recorded in
[`wp06-makrut-lime-leaf-identity-20261009.md`](../../proposals/wp06-makrut-lime-leaf-identity-20261009.md)
and `docs/catalog/research-ledger.v1.json`.

## Validation

- Package: 496 ingredient references (SHA-256
  `f6429c73a9a0cac9ddbe065f93cf87e418c07ee2ad7666159aba69299ca481dd`), 30 forms
  (`9b53e0ca3c6dc4d95b1d14707a495f3d1b3043d0c59400e3a15cd518733683f`), and manifest SHA-256
  `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Research ledger: 675 records, 1,044 source entries, and 888 distinct source IDs; SHA-256
  `264d0cea09a791f730558ba0bb64c5026514bc92ecce11f3f8b0946c0b4f3e71`.
- Legacy candidates: 99; recipe corpus: 114 recipes and 1,123 ingredient rows.
- Seed/package normalization, generated catalog freshness, and research-ledger validation passed;
  all 9 Python seed-package tests passed.
- Android unit tests: 313 passed, 0 failures, errors, or skips.
- Pixel 9a / Android 16 instrumentation on `emulator-5556`: 29 cases, 27 passed, 2 skipped,
  0 failures or errors. Deployment and launch succeeded.
- In the live picker, English and French displayed the identity and fresh/frozen/dried form hints.
  The temporary recipe draft was discarded and the French library home was restored at 114 recipes.

## Emulator screenshots

| Screenshot | SHA-256 |
|---|---|
| [English identity](en-makrut-identity.png) | `45cb1840687fda59d310584c776988ecb2aaa27d26d4ab621bf41c4723f47900` |
| [English fresh form](en-makrut-fresh.png) | `28804d9e4705ede5ea917df143066446b00a262ae91f2f7e0e4a7b45e9c31cee` |
| [English frozen form](en-makrut-frozen.png) | `3efeaaeca1a9bc8dd8f4a17299519bb7dc587e2259ebf55e409cc56957a09018` |
| [English dried form](en-makrut-dried.png) | `78a9b1e602106ec981865f3b5f8a89f2e56abda28c3903823bec094f7aac506c` |
| [French identity](fr-makrut-identity.png) | `d4751d84fbcaea278586b00226ada1437662afb20802aa3bc1052d159071d563` |
| [French fresh form](fr-makrut-fresh.png) | `6c90d75f0c7b8a6151856b340b07b6a25f2aec2a232868dc9e4a131fdc4d9dfc` |
| [French frozen form](fr-makrut-frozen.png) | `c6987a6f316f388c27ae434408bf2e0943f5e49098c2044055324ff7537d204f` |
| [French dried form](fr-makrut-dried.png) | `a842333412cd31ccef856bcbeb961f1ef129ca83f7b9858180b620a447a88bf9` |
| [French library home, 114 recipes](fr-library-home.png) | `d8eef22569e2a1277bfefe524548d6fcc74cc8bd8c88728279e8e8d816be5714` |

## Open work

The fr-CA leaf wording needs independent Québec terminology review. Broader Section U herb coverage,
measurements, conversions, substitutions, and independent bilingual review remain open.
