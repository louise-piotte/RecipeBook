# WP06 South American condiment identities — 2026-10-09

This coordinator batch integrates two source-backed South American condiment identities from the
WP06 regional gap sweep: Chilean merkén and Guyanese cassareep. It is a bounded identity update, not
a claim that South America or WP06 is complete.

## Integrated rows

| ID | English display / alias | fr-CA display / alias | Category | Evidence boundary |
|---|---|---|---|---|
| `ingredient-ref-merken` | `merkén` / `merquén` | `merkén` / `merquén` | `BAKING_AND_SPICE` | The sources support the dry seasoning identity and spelling variant. Chile Travel and CDBP describe formulations that differ on cilantro leaf versus seed, so blend details remain source-specific. |
| `ingredient-ref-cassareep` | `cassareep` / `casareep` | `cassareep` / `casareep` | `SAUCE_AND_CONDIMENT` | The Guyana Ministry source supports the alternate spelling, bitter-cassava-juice origin, culinary use, and a reported traditional preserving role. It is not a tested preservation procedure or food-safety standard. |

French displays remain provisional pending independent Québec terminology review. Neither row has a
form, density, unit mapping, measurement, conversion, substitution, or recipe link. Merkén is not an
alias of chili flakes or generic chili pepper; cassareep is not an alias of tucupi, cassava flour,
molasses, or generic syrup. No bundled recipe line matched these source spellings, and no recipe
file was changed for this batch.

## Source register

| Source ID | Source | Supports |
|---|---|---|
| `WP06-SOUTHAM-20261009-S16` | [Chile Travel, “Turismo Gourmet: Especias y sabores únicos de Chile”](https://chile.travel/blog/turismo-gourmet-especias-y-sabores-unicos-de-chile-2/) (2021-08-27), “El Merkén” section | One source formulation of merkén using dried and smoked ají cacho de cabra, cilantro, and salt, plus culinary uses. It does not establish a universal recipe or quantity. |
| `WP06-SOUTHAM-20261009-S17` | [Centro de Documentación de Bienes Patrimoniales de Chile, “Los ingredientes de la cocina chilena tradicional”](https://www.cdbp.gob.cl/noticias/los-ingredientes-de-la-cocina-chilena-tradicional) (published 2024-09-27), merkén/merquén paragraph and image caption | Explicitly names “merkén o merquén”; describes a Mapuche-origin, dried, smoked, ground ají cacho de cabra seasoning with salt and coriander seed, served as a dry powder. |
| `WP06-SOUTHAM-20261009-S27` | [Guyana Ministry of Amerindian Affairs, “Region one targeted as focal point for Cassareep production”](https://moaa.gov.gy/region-one-targeted-as-focal-point-for-cassareep-production/1461/2017/) (2017-03-10), product naming, cassava origin, culinary use, and pepperpot paragraphs | Uses both Casareep/Cassareep spellings; describes cassareep as a byproduct of bitter cassava juice used in local dishes and pepperpot. The reported preserving role is recorded as context only. |

## Validation

- Live package: 467 ingredient references (SHA-256 `40a04c3a1a1b07c547dbee3fa20d320c883941d1bf0432290d6e8de4d07bbf94`), 17 forms, manifest SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Research ledger: 633 records, 857 source entries, 750 distinct source IDs (SHA-256 `7c7ff46e169db1021b6c357485af0a02db812b0070a87699a7fd478b7b55e1ae`).
- Bundled corpus: 114 recipes and 1,123 ingredient lines. No recipe line was linked or edited.
- Package normalization and generated Kotlin index checks passed at 467 references. All 9 Python seed-package tests passed. Android unit tests: 288 passed, 0 failures/errors/skips.
- Pixel 9a / Android 16 connected instrumentation: 29 XML cases, 27 passed, 2 skipped, 0 failures/errors. Deployment installed and launched the build on `emulator-5556`.
- Live picker queries `merquen` and `casareep` each returned one canonical result in English and French. The unsaved draft was discarded; the French home remained at 114 recipes.

## Emulator evidence

The PNG SHA-256 hashes below cover the saved screenshots exactly.

| Screenshot | SHA-256 |
|---|---|
| [English merkén search](en-merken-search.png) | `bafac574f602abda60f4f1e9f3de89f7a23cf9c15971c968aa03ef62702240e6` |
| [English cassareep search](en-cassareep-search.png) | `f9965d04b84ea09673963d6c6b73973ab2df48f76d239208fb52a46753971d2a` |
| [French merkén search](fr-merken-search.png) | `8407bd6f0181da80a0312ec1ec13432b026507f632cdc70de589fa4daa83281c` |
| [French cassareep search](fr-cassareep-search.png) | `8dfbcd326ef20c00754a573c4e29538d7d1f819fdef233ab071fc6d0e66bb7e2` |
| [French library home, 114 recipes](fr-library-114.png) | `dfac5789e4784c01aca9dfc5f3038ea001a4f4aa805bb8426aff26187e3bb4d3` |

## Remaining WP06 work

The South American proposal packet remains active for all other recommendations, including Andean,
Brazilian, Amazonian, and additional Southern Cone research. The regional gap dispositions and
independent Québec/community terminology reviews also remain open.
