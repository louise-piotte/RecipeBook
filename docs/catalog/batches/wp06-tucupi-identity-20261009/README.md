# WP06 tucupi identity — 2026-10-09

This coordinator batch adds `tucupi` as a source-named Northern Brazilian cassava condiment. The
same source spelling is retained in the English and French display fields; the French display is
provisional pending independent Québec terminology review.

## Catalog decision

- ID: `ingredient-ref-tucupi`
- English and French display: `tucupi` (provisional in fr-CA)
- Category: `SAUCE_AND_CONDIMENT`
- Aliases: none. Do not alias raw `manipueira`, `tucupi-doce`, cassava flour, tapioca starch, cassava gum, or Guyanese cassareep.
- The cited sources describe tucupi as a partially fermented cassava press-liquid sauce, with starch removed, and as a seasoned broth used separately from other tacacá components. No universal formulation or product standard is inferred.
- No form, density, unit mapping, measurement, conversion, substitution, recipe link, or preparation/safety guidance was added.
- The 114-recipe scan found no candidate-name match. No recipe file was changed.

## Sources

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP06-SOUTHAM-20261009-S11` | [Brazil Ministry of Health, Alimentos regionais brasileiros](https://bvsms.saude.gov.br/bvs/publicacoes/alimentos_regionais_brasileiros_2ed.pdf), 2nd ed. (2015), North-region `TUCUPI`, p. 96 | Describes tucupi as a partially fermented sauce made from manipueira, the liquid separated during cassava-flour production, after starch settles and is removed. It documents use in tacacá and with meat. It also names `tucupi-doce` for one white-cassava product; this batch leaves that product boundary open. |
| `WP06-SOUTHAM-20261009-S12` | [Brazil Ministry of Fisheries and Aquaculture, “Aprenda como fazer o tradicional Tacacá”](https://www.gov.br/mpa/pt-br/assuntos/noticias/aprenda-como-fazer-o-tradicional-tacaca/) (2026-08-28), description and ingredient/component sections | Describes tucupi as seasoned bitter-cassava broth in North-Brazil tacacá and lists it separately from goma de mandioca, jambu, and dried shrimp. One government recipe; not a universal product specification. |

## Validation

- Package: 469 ingredient references (SHA-256 `8938b9cd5bc23d6b835e90145768c3287cbd86397bfd74b694439563b616f281`), 17 forms; manifest SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Research ledger: 635 records, 863 source entries, 755 distinct source IDs (SHA-256 `5022265d490cc4a2d88d97393831a6317b0738a60657b42dbb9ea93387fa92d3`).
- Corpus: 114 recipes and 1,123 ingredient lines; no recipe line was relinked.
- Normalized seed package and generated Kotlin index checks passed at 469 references. All 9 Python seed-package tests passed. Android unit tests: 290 passed, 0 failures/errors/skips.
- Pixel 9a / Android 16 connected instrumentation: 29 XML cases, 27 passed, 2 skipped, 0 failures/errors. Deployment installed and launched the build on `emulator-5556`.
- Live picker query `tucupi` returned one row in English and French. The temporary draft was discarded, and the French home remained at 114 recipes.

## Emulator evidence

| Screenshot | SHA-256 |
|---|---|
| [English picker](en-picker.png) | `ff9373ce0a3206ce52f4ca8bb7652c994fded1ba7e3ace16102e014fc499e40f` |
| [French picker](fr-picker.png) | `2866d7245acc6476e1cd881721be7d842960f27ec9d43d696a8be8d9fd10aeea` |
| [French library home, 114 recipes](fr-library-114.png) | `070165b4380814e5d52a5daaf1566f04734fffc0af28f7f9741ea15344b1874c` |

## Open work

Independent Québec terminology review and the relationship between `tucupi-doce` and the broader
tucupi identity remain unresolved. Broader North and Amazon regional research stays open.
