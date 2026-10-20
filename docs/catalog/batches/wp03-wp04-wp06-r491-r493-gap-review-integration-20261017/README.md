# WP03/WP04/WP06 R491–R493 gap review integration

Integrated on 2026-10-17 after root review of [R491](../../proposals/wp03-section-f-next-gap-review-r491-20261017.md), [R492](../../proposals/wp04-section-p-next-seafood-review-r492-20261017.md), and [R493](../../proposals/wp06-african-next-regional-review-r493-20261017.md).

## Decisions

- **R491 — Cocoa Loops cereal:** added identity-only `Cocoa Loops cereal / Céréales Cocoa Loops` in `GRAIN_AND_CEREAL`, with no aliases or forms. WK Kellogg Canada lists Cocoa Loops as a distinct product; Québec-facing listings support the French display. Kept SmartLabel’s `1 cup (33 g)` only as a product-specific `portion_weight` observation. The cup volume and fill method are unstated, so it is not a reusable measure, density, or conversion. Substitution research remains open.
- **R492 — smoked Arctic char:** added identity-only `smoked Arctic char / omble chevalier fumé` in `PROTEIN`, with no aliases or forms, separate from raw Arctic char and generic smoked trout. Recorded MAPAQ’s `100 g` only as one six-portion recipe’s ingredient amount; it is not allocated per serving or reusable as a measure. The ledger records no supported interchange with raw char or generic smoked trout; no substitution rule or recipe-line link was added.
- **R493 — calabash nutmeg:** added identity-only `calabash nutmeg / muscade calebasse` in `BAKING_AND_SPICE`, with English `African nutmeg` and French `fausse muscade` aliases. The French display remains provisional pending Québec terminology review. Kept ordinary *Myristica fragrans* nutmeg distinct and recorded Kew’s qualitative West African use statement as an evidence-only finding from ordinary nutmeg to calabash nutmeg, limited to soups, stews, and cakes. No active substitution rule was added.

No forms, reusable measures, densities, unit mappings, conversions, yields, or bundled recipe links were added. The 114 manifest recipes / 1,123 ingredient rows contain no candidate-specific demand. Parent Section F, Section P, and African regional coverage remain open.

## Picker effects

- `Cocoa Loops`, `Cocoa Loops cereal`, and `Céréales Cocoa Loops` each return the new cereal. `cocoa` grows from 8 to 9 and `cereal` from 52 to 53; `cacao` remains 8, `céréales` grows from 48 to 49, and `Froot Loops` remains unowned. The R491 projection was corrected to use the current whole-word phrase-first picker behavior.
- `smoked Arctic char` and `omble chevalier fumé` each return the new product. `Arctic char` and `omble chevalier` each grow from 1 to 2; generic `smoked trout` and `truite fumée` remain on their existing row. `char` grows from 2 to 3, `smoked` from 18 to 19, and `fumé` from 9 to 10. `trout` and `truite` remain at 7 and 6.
- The four calabash-nutmeg display/alias phrases each return the new row. `nutmeg` and `muscade` each grow from 1 to 2. `ehuru` remains empty. The existing `ehu` substring query still returns Desi chickpeas and urad beans because the string occurs inside `dehulled` and `dehusked`; the proposal was corrected to record this existing behavior, and no calabash-nutmeg alias was added.

## Evidence limits

- R491 uses the [WK Kellogg Canada brand page](https://www.wkkellogg.ca/en/our-foods/our-brands/froot-loops), exact-product [SmartLabel](https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00059724103757), and Québec-facing Super C / Costco French listings. The SmartLabel serving remains product-specific. Its official French locator URL reuses existing source ID `WP03-ALL-BRAN-FAMILY-R203-20261016-S03`.
- R492 uses Québec producer listings from [Fumoir Monsieur Émile](https://fumoir-monsieur-emile.com/produits/) and [Boucanerie Chelsea](https://www.boucaneriechelsea.com/product-listing), Canadian [Salties](https://www.salties.ca/products/smoked-arctic-char-whole-filets), and the [MAPAQ / ITHQ recipe](https://media.mapaq.gouv.qc.ca/pechesicimangesici/documents/Recettes_Omble_Chevalier_web.pdf). Fumoir St-Antoine’s menu, OQLF / DFO species sources, and existing smoked-trout sources are reused under their existing IDs. The MAPAQ quantity applies only to its named recipe.
- R493 uses [Kew POWO](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:74141-1/general-information), University of Cape Coast, the French [EUR-Lex commodity list](https://eur-lex.europa.eu/eli/reg/2018/62/oj?locale=fr), OQLF, and a Nigerian spice study. The Ghana report source ID `WP06-PREKESE-IDENTITY-20261016-S03` is reused. Kew’s finding records a reported regional practice, not a tested general replacement recommendation or ratio.

## Validation

- Ingredient-reference normalization and full bundled seed-package normalization checks passed; read-only package validation passed.
- The research ledger passed Draft 2020-12 schema and semantic validation. All 13 new source IDs map to 13 unique URLs; reused source IDs retain their existing URL owners. New measurements, findings, and decisions reference sources on their respective records.
- The generated Kotlin catalog is current at 1,772 references. Static phrase-first projections matched the query effects above.
- The manifest-ordered corpus remains 114 files / 1,123 ingredient rows / 753,988 bytes with fingerprint `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`; candidate-specific text and ingredient-row hits are zero.
- Seed JSON and the research ledger are UTF-8 without BOM; bundled seed JSON remains ASCII-escaped. Local links and scoped whitespace checks are recorded after this README was added.
- No Gradle tasks, app tests, instrumentation, emulator checks, or deployment were run. `AGENTS.md` says no tests are needed when a change only adds database JSON data.

## Snapshot hashes

- Ingredient references: `7f958e6acce3abd06d08f1c44d32e019d9ed7ed5874f228a6eb50c8f519add9a`
- Ingredient forms (unchanged): `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6`
- Research ledger: `d13ff4f46133680c0c7bab58599bfde2c160a314e95257a009dffbbde04a391c`
- Generated Kotlin catalog: `32240d8bb54941c5a2453833710560c93e84c8f790a2a10dcb5bc390524c24f6`
