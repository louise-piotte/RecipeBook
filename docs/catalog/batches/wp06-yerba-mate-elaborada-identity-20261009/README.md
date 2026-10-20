# WP06 yerba mate elaborada identity — 2026-10-09

This coordinator batch adds the Argentine Food Code product `yerba mate elaborada` as an identity-only
ingredient. The canonical source name is retained in both language fields because OQLF terminology
for `maté` identifies the plant and infusion, not a Québec retail name for this processed product.
The French display remains provisional pending independent Québec terminology review.

## Catalog decision

- ID: `ingredient-ref-yerba-mate-elaborada`
- English and French display: `yerba mate elaborada` (provisional in fr-CA)
- Category: `HERB`
- Aliases: none. Do not alias `maté` or unqualified `yerba mate` to this dry processed product; OQLF uses those names for the plant/infusion context.
- No form, density, unit mapping, measurement, conversion, substitution, or recipe link was added.
- The Argentine Code separately names `yerba mate canchada`, `elaborada con palo`, `elaborada despalada/despalillada`, toasted yerba mate, and soluble mate products. These qualifiers are not aliases or forms on this row; their catalog boundaries remain open.
- The 114-recipe scan found no candidate-name match. No recipe file was changed.

## Sources

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP06-SOUTHAM-20261009-S23` | [Instituto Nacional de la Yerba Mate, “Hoja, polvo y palo, componentes de la yerba mate elaborada”](https://inym.org.ar/noticias/yerba-mate-argentina/78363-hoja-polvo-y-palo-componentes-de-la-yerba-mate-elaborada.html) (2017-06-08) | Quotes Argentine Code Articles 1193–1194, describing the dry leaf material and the leaf/powder/stem composition. It is an explanatory article, not a universal description of every package format. |
| `WP06-SOUTHAM-20261009-S30` | [Argentina, Código Alimentario Argentino, Capítulo XV: Productos estimulantes o fruitivos](https://www.argentina.gob.ar/sites/default/files/capitulo_xv_estimulantesactualiz_2025-12.pdf) (updated 2025-12), Articles 1193–1194, pp. 43–44 | Defines yerba mate as dried, lightly roasted, broken *Ilex paraguariensis* leaves, optionally mixed with specified young branch fragments and floral parts. It distinguishes canchada, elaborada, elaborada con palo (at least 65% leaves, at most 35% palo), elaborada despalada/despalillada (at least 90% leaves, at most 10% palo), toasted, and soluble products. These are source-defined classifications, not measurement conversions. |
| `WP06-SOUTHAM-20261009-S24` | [Office québécois de la langue française, “maté” as a beverage](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8408697/mate), updated 1990 | Defines French `maté` as an infusion and lists English `yerba mate` for the beverage. It does not name the dry processed product for Québec retail. |
| `WP06-SOUTHAM-20261009-S25` | [Office québécois de la langue française, “maté” as a plant](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8408678/mate), updated 1990 | Defines the South American plant as `maté` and notes that the term also names its infusion. It does not establish a French product name for yerba mate elaborada. |

## Validation

- Package: 468 ingredient references (SHA-256 `b6f9e9ee0abe6b44a2a24ab990b846ab59293b5c8cd51d5c0eab8847763429a3`), 17 forms; manifest SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Research ledger: 634 records, 861 source entries, 754 distinct source IDs (SHA-256 `66a6d0cd7375343023515828587dad648dc9795f178fc45b0fee2bb005470308`).
- Corpus: 114 recipes and 1,123 ingredient lines; no recipe line was relinked.
- Normalized seed package and generated Kotlin index checks passed at 468 references. All 9 Python seed-package tests passed. Android unit tests: 289 passed, 0 failures/errors/skips.
- Pixel 9a / Android 16 connected instrumentation: 29 XML cases, 27 passed, 2 skipped, 0 failures/errors. The deploy script installed and launched the build on `emulator-5556`.
- Live picker query `yerba mate elaborada` returned the canonical row in English and French. The temporary draft was discarded, and the French home remained at 114 recipes.

## Emulator evidence

| Screenshot | SHA-256 |
|---|---|
| [English picker](en-picker.png) | `7a7ffe1d2c4a14667338a0cbafefb0d3e68fe5a605299bc2dcc17f625579c354` |
| [French picker](fr-picker.png) | `bea7eeaf7f366e1d48b99ec7f5cf1b2e2b062c4d34b7aeeb760e123356e8ef55` |
| [French library home, 114 recipes](fr-library-114.png) | `442e2f7af624c8b25627124f56ba70bc5258bcffc1d566a3f202fda108995ae6` |

## Open work

Independent Québec product terminology review and the WP06 South American regional gap dispositions
remain open. The con palo/despalada variants and the infusion itself are not modeled by this batch.
