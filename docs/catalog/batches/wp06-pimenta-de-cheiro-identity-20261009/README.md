# WP06 pimenta-de-cheiro identity — 2026-10-09

This coordinator batch resolves pimenta-de-cheiro as a separate source-named pepper identity.

## Catalog decision

- ID: `ingredient-ref-pimenta-de-cheiro`
- English and French display: `pimenta-de-cheiro` (provisional pending Québec terminology review)
- Category: `VEGETABLE_AND_AROMATIC`
- Aliases: none.
- Identity: Embrapa describes pimenta-de-cheiro as a variable aromatic pepper group within
  *Capsicum chinense*, with variation in fruit shape, color, and pungency. The name does not point
  to one cultivar or a fixed heat level.
- Keep it distinct from pimenta bode, cumari-do-Pará, murupi, habanero, biquinho, and generic sweet
  or hot peppers. No other pepper-group names are activated as aliases.
- No form, density, unit mapping, measurement, conversion, substitution, or recipe link was added.
- A scan of all 114 bundled recipes (1,123 ingredient rows) found no matching name or reference ID.
  No recipe file changed.

## Sources

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP06-SOUTHAM-20261009-S12` | [Brazil Ministry of Fisheries and Aquaculture, “Aprenda como fazer o tradicional Tacacá”](https://www.gov.br/mpa/pt-br/assuntos/noticias/aprenda-como-fazer-o-tradicional-tacaca/) (2026-08-28), tacacá ingredient/component list | Lists pimenta-de-cheiro as a separate tacacá component. One dish source; it does not define a general pepper taxonomy. |
| `WP06-SOUTHAM-20261009-S37` | Embrapa Hortaliças, [“Pimenta-de-cheiro”](https://www.embrapa.br/en/web/hortalicas/hortalica-nao-e-so-salada/pimenta-de-cheiro), naming and characteristics sections | Describes a variable aromatic pepper name, and focuses on one low-pungency type common in Northern and Central-Western Brazil. It does not establish one cultivar or universal heat level. |
| `WP06-SOUTHAM-20261009-S38` | Embrapa Hortaliças, [*Cultivares de pimentas das espécies Capsicum spp. desenvolvidas pela Embrapa Hortaliças*](https://www.infoteca.cnptia.embrapa.br/infoteca/bitstream/doc/1129544/1/CT-172-25-jan-2021.pdf) (2020), printed pp. 6–10 | Places pimenta-de-cheiro among *C. chinense* varietal groups, describes variation in shape and color, and reports a usual sweet-to-mild range with possible variation. No SHU value, cultivar, or product form is transferred. |

## Validation

- Package: 474 ingredient references (SHA-256
  `a5ce30a420717b559969cea09f7ed8b59c68986a78db2321d397939a24e28ba4`), 17 forms; manifest SHA-256
  `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Research ledger: 640 records, 876 source entries, 763 distinct source IDs (SHA-256
  `78b74f0fef8c352ae49f4e91e81d64842c04acf28637e307be5e01a605c139ff`).
- Package normalization, generated-index freshness, ledger schema validation, and all 9 Python
  seed-package tests passed. Android unit tests: 294 passed, 0 failures/errors/skips.
- Pixel 9a / Android 16 instrumentation on `RecipeBook_Pixel_9a` (`emulator-5556`, 1080 × 2424):
  29 XML cases, 27 passed, 2 skipped, 0 failures/errors. The deploy script installed and launched
  the build on this emulator.
- Live picker QA returned one `pimenta-de-cheiro` result in English and one result for the exact
  hyphenated source name in French. The unsaved draft was discarded and the French library
  returned to 114 recipes.

## Emulator screenshots

| Screenshot | SHA-256 |
|---|---|
| [English picker: pimenta-de-cheiro](en-picker.png) | `b44ebdc7d8add08bceda0cf0c310c5a81156d7ae221875ca82ba16af5203cf39` |
| [French picker: pimenta-de-cheiro](fr-picker.png) | `7a28d574089fc3690451191d6723274f77b3d462b20aec131b7f6048a8fe4425` |
| [French library home, 114 recipes](fr-library-114.png) | `72d829ffa672dcda2adedc05b47abd01a99092d2d2f00db143ac296e069fcb09` |

## Open work

Review the French display with a Québec culinary terminology reviewer. Other Amazonian product
boundaries and broader WP06 regional coverage remain open.
