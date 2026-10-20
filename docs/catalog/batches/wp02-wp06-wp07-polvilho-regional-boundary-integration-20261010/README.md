# WP02 polvilho identities and WP06/WP07 boundary follow-up

**Integrated:** 2026-10-10  
**Status:** two identity-only catalog additions complete; broader WP02, Section Z, and WP07 work remain open.

## Catalog decisions

Added two distinct `FLOUR_AND_STARCH` references:

| ID | English display | fr-CA display | Aliases and scope |
|---|---|---|---|
| `ingredient-ref-brazil-polvilho-doce` | `sweet cassava starch (polvilho doce)` | `polvilho doce` | No aliases. The English descriptor stays paired with the Brazilian product name; the French display remains provisional. |
| `ingredient-ref-brazil-polvilho-azedo` | `sour cassava starch (polvilho azedo)` | `polvilho azedo` | No aliases. The English descriptor stays paired with the Brazilian product name; the French display remains provisional. |

The [Brazilian polvilho review](../../proposals/wp02-brazilian-polvilho-label-boundary-review-20261010.md) supports separate identities. Brazil's [MAPA guidance](https://www.gov.br/agricultura/pt-br/assuntos/inspecao/produtos-vegetal/arquivos/orientacao_tecnica_oficio_circular_nr_01_2022-polvilhos/%40%40download/file) distinguishes the named products from generic fécula, but does not provide a repeatable method for distinguishing fécula, the polvilhos, and mixtures. [Grupo PQ's doce page](https://www.grupopq.com.br/produto/polvilho-doce/) and [azedo page](https://www.grupopq.com.br/produto/polvilho-azedo/) supply product-specific English descriptions. Do not infer a universal process threshold, baking behavior, or conversion from those sources.

Do not add `sweet tapioca starch` or `sour tapioca starch` as aliases, or map either product to generic `tapioca starch`, `cassava starch`, or `fécule de manioc`. No forms, densities, unit mappings, measurement observations, conversions, yields, substitutions, or recipe links were added. The recipe scan found no matching rows among 114 recipes / 1,123 ingredient rows.

## Related reviews with no catalog change

- The [groundnut-paste and red-palm boundary review](../../proposals/wp06-section-z-groundnut-palm-boundary-20261010.md) found the names source- and product-contextual. It recommends no global groundnut-paste/peanut-butter aliases and no blanket mapping of red palm oil, zomi, dzomi, or amidze to the active crude-palm-oil identity. No matching bundled recipe rows were found.
- The [FDC chicken-egg portion follow-up](../../proposals/wp07-fdc-chicken-egg-portions-followup-20261010.md) confirmed the official search records but could not retrieve official portion detail rows through the available search, API, or download paths. No third-party mirror weights entered the ledger; exact FDC retrieval and sample variability remain open.

## Artifact snapshot

| Artifact | Count | SHA-256 |
|---|---:|---|
| Ingredient references | 705 | `d440179e59ff9e94d6c91f29a8932e79893917a9c8142fa93cd3adcf11fa04d2` |
| Ingredient forms | 34 | `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938` |
| Research ledger | 894 records; 1,690 source entries; 1,393 distinct source IDs | `3d834b3550480998f2481620e91c0b4a4e3f5ac795843a748f2f83312929fa22` |
| Recipe manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Bundled recipe corpus | 114 files; 1,123 ingredient rows | `921fe260478d90251440fbb082d7b30be5828bfaddeaee67fe42541963aaa629` (unchanged) |

The two reference records have null density and empty unit mappings. The recipe files were not edited. The bundled JSON was normalized in place and stores accented text using explicit Unicode escapes.

## Verification

- Bundled seed-package normalization, ingredient-reference normalization, generated catalog freshness, ledger validation, and `git diff --check` passed.
- All 10 Python seed-package tests passed.
- Android unit tests: 322 passed, 0 failed, 0 skipped.
- Pixel 9a / Android 16 API 36 connected instrumentation on `emulator-5556`: 30 XML cases, 28 passed, 2 skipped, 0 failures/errors.
- The deploy script's test and debug assembly stages passed; the APK installed and launched on `emulator-5556`.
- English picker query `sweet cassava starch` returned `sweet cassava starch (polvilho doce)`; `sour cassava starch` returned `sour cassava starch (polvilho azedo)`.
- English `sweet tapioca starch` and `sour tapioca starch` queries returned no results. In French mode, `polvilho doce` and `polvilho azedo` each returned their own display row.
- The blank draft was discarded without selecting an ingredient or saving. The app returned to its French home showing all 114 recipes.

Screenshots show the query text and picker results. Their SHA-256 values are recorded in [`screenshots/SHA256SUMS.txt`](screenshots/SHA256SUMS.txt).

| Screenshot | Evidence |
|---|---|
| [English polvilho doce search](screenshots/en-polvilho-doce.png) | Product-specific English descriptor resolves to the doce identity. |
| [English polvilho azedo search](screenshots/en-polvilho-azedo.png) | Product-specific English descriptor resolves to the separate azedo identity. |
| [English sweet tapioca no-result search](screenshots/en-sweet-tapioca-no-result.png) | Generic sweet tapioca wording remains unmatched. |
| [English sour tapioca no-result search](screenshots/en-sour-tapioca-no-result.png) | Generic sour tapioca wording remains unmatched. |
| [French polvilho doce search](screenshots/fr-polvilho-doce.png) | Source name displays as `polvilho doce`. |
| [French polvilho azedo search](screenshots/fr-polvilho-azedo.png) | Source name displays as `polvilho azedo`. |
| [French home with 114 recipes](screenshots/fr-home-114.png) | Final emulator state after discarding the blank draft. |
