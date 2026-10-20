# WP06 tropical leafy greens — 2026-10-09

## Catalog decision

Integrated four separate identities in `VEGETABLE_AND_AROMATIC`:

- `ingredient-ref-water-spinach`: `water spinach` / `épinard d'eau`; source-supported aliases include `Chinese water spinach`, `water convolvulus`, `kangkong`, `kang kong`, and `ong choy`.
- `ingredient-ref-malabar-spinach`: `Malabar spinach` / `baselle`; kept at *Basella* genus scope, with scoped Ceylon, Indian, vine, and French aliases.
- `ingredient-ref-jute-leaves`: `jute leaves` / provisional `feuilles de jute`; kept at *Corchorus* genus scope, with no aliases.
- `ingredient-ref-molokhia-leaves`: `molokhia leaves` / provisional `molokhia (feuilles de corète potagère)`; narrower culinary scope associated with *Corchorus olitorius*, with scoped source-name aliases.

Water spinach stays distinct from ordinary spinach. Malabar spinach is not assigned a universal species. Jute leaves and molokhia remain separate at genus-level and narrower culinary scopes. Every new reference has a null default density and no unit mappings. No forms, numeric data, conversions, substitutions, or recipe links were added.

## Evidence and audit

The source review uses University of Georgia Extension for water spinach identity and use; Health Canada's crop group listing to distinguish ordinary spinach, Malabar spinach, and *Corchorus* leaves; University of Florida IFAS and Québec OQLF / government sources for the Malabar spinach boundary and `baselle`; USDA historical food-use records, Kew taxonomy, and an Egyptian agricultural paper to keep generic jute leaves separate from molokhia. The proposal packet contains all 14 source entries, locators, use limits, and exact alias boundaries: [WP06 tropical leafy greens naming review](../../proposals/wp06-tropical-leafy-greens-boundaries-20261009.md).

Before integration, the exact normalized-key audit covered 489 active references, 22 forms, 99 legacy candidates, 114 recipes, and 1,123 ingredient rows. Across the four candidate phrase sets, 62 distinct normalized keys had no exact or phrase owner in active references, forms, or legacy candidates, and none appeared in recipe ingredient rows. No recipe text or link changed.

## Validation

- Current ingredient references: 493, SHA-256 `2bbb650402dae4437f8d0c0b814b0d445963bdee02777c88dffe1d5a57413a65`.
- Current ingredient forms: 22, SHA-256 `e258fddbdae2b6df168dfe7e14b1926e7f05004bde775916beeaeaa0b8fd17ff`.
- Manifest: 114 recipe paths, SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Legacy identity candidates: 99, SHA-256 `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b`.
- Research ledger: 664 records / 1,010 source entries / 865 distinct source IDs, SHA-256 `a67cf228bc05c69b454bdec7e38b297d4d8a29ac3e9397bb2a8d03d3e7aa9477`.
- Package normalizers and generated-index freshness passed. All 9 Python package tests and all 309 Android unit tests passed.
- Pixel 9a / Android 16 connected instrumentation on `emulator-5556`: 29 XML cases, 27 passed, 2 skipped, 0 failures or errors. The deploy script installed and launched the app.
- English picker searches `water spinach`, `Malabar spinach`, `jute leaves`, and `molokhia` returned the intended identities. French searches `ong choy`, `baselle`, `feuilles de jute`, and `molokhia` returned `épinard d'eau`, `baselle`, `feuilles de jute`, and `molokhia (feuilles de corète potagère)`. The temporary drafts were discarded and the French library home returned to 114 recipes.

## Pixel 9a screenshots

| Screenshot | SHA-256 |
|---|---|
| [English picker: water spinach](en-water-spinach-picker.png) | `c7bd0d81f63fe93f7960152f244810a846fb0ecf9823400f8281c60e6af863ec` |
| [English picker: Malabar spinach](en-malabar-spinach-picker.png) | `5b13a6208a6876c427988acd3082e949f14c74acc9467ff4ba985c7920ebf360` |
| [English picker: jute leaves](en-jute-leaves-picker.png) | `61d25cf07b81c18082a00274e77f7e610ed31f87a72cb000873cb8a9e079c2fb` |
| [English picker: molokhia](en-molokhia-picker.png) | `8983c500e19f657af0db38260fee4683879e2b58ab9fe76b86393178365f8153` |
| [French picker: water spinach (`ong choy`)](fr-water-spinach-picker.png) | `cca902984d31e7d6c087b0fed9e9d0e00ecd7b24e4b91489ec321c26d389e1a0` |
| [French picker: Malabar spinach (`baselle`)](fr-malabar-spinach-picker.png) | `a166a922ee3e730bfc7029da6b76f565a26b2071a881ae3d49cac36852b27ce3` |
| [French picker: jute leaves](fr-jute-leaves-picker.png) | `18254a16f95fe0934b50685119bec8505ad600b956d964ca2e7507bc6ca48dd5` |
| [French picker: molokhia](fr-molokhia-picker.png) | `4cf980b46e1b124a9c0e7ea8a12a42cc6a6c7d6ead741a8a6a8053fc88d57d00` |
| [French library home, 114 recipes](fr-library-home.png) | `6ab3abc1c867630a2cd4a313dc0a16e287f1da90ac3d138b416bc089390f7933` |

## Open work

French `feuilles de jute` and `molokhia (feuilles de corète potagère)` remain provisional pending independent Québec and community terminology review. Broader leafy-green coverage remains open.
