# WP03/WP04/WP06 R488–R490 gap review integration

Integrated on 2026-10-17 after root review of [R488](../../proposals/wp03-section-f-chex-family-current-quebec-picker-review-r488-20261017.md), [R489](../../proposals/wp04-section-p-canned-cod-liver-picker-reassessment-r489-20261017.md), and [R490](../../proposals/wp06-african-next-regional-review-r490-20261017.md).

## Decisions

- **R488 — current Québec-evidenced Chex products:** superseded the R485 single-Rice-Chex hold by adding five separate identity-only `GRAIN_AND_CEREAL` references: Rice, Cinnamon, Honey Nut, Chocolate, and Apple Cinnamon Chex. Each has a Québec French display and current English product evidence; Cinnamon, Honey Nut, Chocolate, and Apple Cinnamon also have narrow French aliases where supported. The five are a reviewed local set, not a complete Chex roster; General Mills Canada says there are nine varieties but does not enumerate them. Corn Chex remains excluded because a Chex-team response says it is discontinued in Canada while English retailer pages remain live, and no current Québec French title was found. Peanut Butter Chex remains excluded because no current Québec French label was found. Current Québec evidence includes [Provigo’s Chex listings](https://www.provigo.ca/fr/collection/cereal), a current [Metro Cinnamon Chex listing](https://api.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-de-riz-a-la-cannelle/p/065633400139), and the paired [French](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-de-riz-aux-pommes-et-cannelle/p/065633184916) and [English](https://www.metro.ca/en/online-grocery/aisles/pantry/cereals-spreads-syrups/family-cereals/apple-cinnamon-rice-cereal/p/065633184916) Apple Cinnamon product pages.
- **R489 — canned cod liver:** added identity-only, species-neutral `canned cod liver / foie de morue en conserve`, with `cod liver in own oil / foie de morue dans son huile` as the only search aliases. The [OQLF entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488144/foie-de-morue) supports the Québec head term and distinction from extracted oil; paired [Mayrand listings](https://mayrand.ca/fr/nos-produits/epicerie/poisson-et-viande-en-conserve/poisson-en-conserve/foie-de-morue-dans-son-huile-tousain-19904) support the product wording. The 115 g unit and 12 × 115 g case remain SKU-specific. R489 advances the earlier R69 hold after R404 added the distinct steamed monkfish-liver row.
- **R490 — shiro powder:** resolved the existing ledger-only `candidate-ethiopian-shiro-powder` record in place and added identity-only `shiro powder / poudre de shiro` in `FLOUR_AND_STARCH`, with `shiro flour` as the only alias. The [Ethiopian Standards Agency catalogue](https://www.ethiostandards.org/sites/default/files/2023-04/IES%20ES%202023%20CATALOGUE.pdf) lists a shiro-powder specification; the [2023 research article](https://link.springer.com/article/10.1186/s42779-023-00175-6) distinguishes dry shiro flour from prepared shiro wot. The standard’s technical text was not retrieved. Keep bare shiro, shiro wot/wat, pure chickpea flour, and variable formulations distinct. The French display is provisional pending Québec terminology review.

No forms, reusable measures, densities, unit mappings, conversions, yields, recipe links, or substitutions were added. R489 measurement research is `researched_no_supported_value`; R490 measurement and substitution research remain `not_yet_researched`. Substitution research for R488 and R489 remains open.

## Catalog and picker effects

- Active references: **1,769**, up from 1,762. Forms remain **143**; legacy-import candidates remain **56**.
- The ledger has **2,127 records**, **9,725 source entries**, **8,241 distinct source IDs**, and **6,954 distinct URLs**. R488 adds 15 distinct source IDs, including reuse of the existing Provigo collection source ID; R489 adds four sources; R490 reuses SS08/SS09 and adds two sources.
- `Chex` returns the five reviewed products. `Rice Chex`, `Honey Nut Chex`, `Chocolate Chex`, and `Apple Cinnamon Chex` each return one identity. `Cinnamon Chex` returns both Cinnamon and Apple Cinnamon Chex because the phrase appears contiguously in the latter name. The exact proposed French product queries resolve to their intended rows.
- `rice cereal` remains at its two generic results; `cereal` and `céréales` increase from 47 / 43 to 52 / 48. `Chex au maïs` returns no result.
- `liver` and `foie` each return the two explicitly named seafood-organ products, canned cod liver and steamed monkfish liver. `cod` and `morue` each grow from six to seven results. Cod-liver-oil searches remain empty.
- `shiro` grows from two specific Japanese product results to those two plus shiro powder. `shiro powder`, `shiro flour`, and `poudre de shiro` each return the new row; `shiro wot` remains empty. `chickpea flour` remains at its three existing results.
- All **114 manifest-listed recipes / 1,123 structured ingredient rows** were scanned for the candidates, their aliases, and proposed IDs; no candidate-specific demand or link was found. The corpus remains **753,988 bytes** with fingerprint `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`.

## Validation

- Ingredient reference normalization, bundled seed package normalization and validation, and generated-index freshness passed; the generated Kotlin catalog contains **1,769 references**.
- The research ledger passed Draft 2020-12 schema validation. Every source ID maps to one URL; all new source IDs were present and unambiguous. The existing Provigo collection source ID was extended and reused.
- Static phrase-first picker projections matched the proposal’s query results. The full manifest-ordered recipe scan remained unchanged.
- Changed JSON is UTF-8 without BOM; bundled seed JSON remains ASCII-escaped. Local links and scoped whitespace checks passed.
- No app tests, Gradle tasks, emulator checks, or deployment were run. The active changes add database JSON data, so the `AGENTS.md` rule says no software tests are needed.

## Snapshot hashes

- Ingredient references: `8cccbeabdd1287821b0bbb1158c8cfdfde245a8b9925c4142eaf160b26a2af8d`
- Ingredient forms: `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6`
- Research ledger: `9ea8e1c813abf3b08d3b845b15db6435a24bd7b4c1249bb809895e217635f1b2`
- Generated Kotlin catalog: `fcef831238834cc9a080996bcdd24df24a3d6ef84b4bc58b797f5140886f456a`

Section F, Section P, and broader African regional coverage remain open.
