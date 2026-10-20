# WP06 fresh cassava-root identity — 2026-10-09

This coordinator batch adds a fresh cassava-root identity and keeps it separate from processed
cassava products.

## Catalog decision

- ID: `ingredient-ref-cassava-root`
- English display: `cassava root`
- French display: `manioc` (OQLF preferred term)
- Category: `VEGETABLE_AND_AROMATIC`
- Aliases: none.
- OQLF defines manioc as a tuber consumed as a vegetable or used to make tapioca and notes that
  sweet and bitter roots have different contexts. Brazilian sources distinguish table roots from
  roots generally used for industrial flour or starch and describe roots sold in natura.
- Regional names such as `mandioca`, `macaxeira`, `aipim`, and `yuca` remain research evidence, not
  global aliases. The sources distinguish root types and processing contexts; no broader identity
  or safety equivalence is implied.
- Keep the root separate from edible cassava flour, tapioca starch, gari, edible sago flour, and
  polvilhos. No form, density, unit mapping, measurement, conversion, substitution, or recipe link
  was added.
- A scan of all 114 bundled recipes (1,123 ingredient rows) found no matching name or reference ID.
  No recipe file changed.

## Sources

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP06-SOUTHAM-20261009-S08` | Office québécois de la langue française, [“manioc”](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17060768/manioc) (updated 2025), definition, preferred term, English terms, and usage note | Supports Québec French `manioc` and the cassava root identity; notes a sweet/bitter root distinction. No preparation or safety advice is adopted. |
| `WP06-SOUTHAM-20261009-S09` | Codevasf, [“Mandiocultura”](https://www.gov.br/codevasf/pt-br/assuntos/inclusao-socioprodutiva/arranjos-produtivos-locais/mandiocultura) (published 2026-04-29), opening paragraph and product list | Says mandioca, macaxeira, and aipim are names used for the same product, and lists root-derived processed products separately. Brazilian public-agency description; no preparation equivalence is inferred. |
| `WP06-SOUTHAM-20261009-S44` | Embrapa, [“Cultivares - Mandioca”](https://www.atermaisdigital.cnptia.embrapa.br/web/mandioca/cultivares), opening distinction between table and industrial roots | Describes table cassava names and distinguishes table roots from roots generally used for flour and starch industries. No cultivar, numeric threshold, processing instruction, or safety advice is transferred. |
| `WP06-SOUTHAM-20261009-S45` | Embrapa Cerrados, [*MANDIOCA no Cerrado: processamento mínimo de raízes de mandioca de mesa*](https://www.infoteca.cnptia.embrapa.br/handle/doc/1163366), 2nd ed. (2023), repository description | Describes roots for human consumption sold in natura with peel or minimally processed and lists regional names. No shelf-life or processing recommendation is adopted. |

## Validation

- Package: 476 ingredient references (SHA-256
  `d3fc5a123a37273ce0c622b4397899b8ec72cbda72691f4f3067be8ea2da1f67`), 17 forms (SHA-256
  `2098e1048796a1aba42c25e4020f018d02c04c332567620084fceac8f2d15`); manifest SHA-256
  `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Research ledger: 642 records, 886 source entries, 773 distinct source IDs (SHA-256
  `c03d73f7f46cf3585ec6b76f565d91945f8fabd721714716cd6810aaa6ab2c8b`).
- Package normalization, generated-index freshness, ledger schema validation, and all 9 Python
  seed-package tests passed. Android unit tests: 296 passed, 0 failures/errors/skips.
- Pixel 9a / Android 16 connected instrumentation on `emulator-5556`: 29 XML cases, 27 passed,
  2 skipped, 0 failures/errors. The deploy script installed the app and launched `MainActivity`.
- English picker query `cassava root` returned one `cassava root` result. French query `manioc`
  returned three distinct results: `manioc`, `farine comestible de manioc`, and `fécule de manioc`.
  The blank draft was discarded and the French library returned to 114 recipes.
- Recipe scan: 114 recipes and 1,123 ingredient rows; no cassava-root match or recipe relink.

## Emulator screenshots

| Screenshot | SHA-256 |
|---|---|
| [English picker: cassava root](en-picker.png) | `d834050d02a0c71cc815f6781e695b2ca72c175198fac6b9ba851baaf247fd8b` |
| [French picker: manioc, flour, and starch](fr-picker.png) | `b3ad4a4f046070aec06b429477f78bff4858b279532aa98c137e0f36bdb8bb17` |
| [French library home, 114 recipes](fr-library-114.png) | `e7ed69f946350c885e577f90abdc62f7022c7c7fa93ffb6a7941f1992f492883` |

## Open work

Review the French product wording with an independent Québec culinary terminology reviewer. Broader
Brazilian and South American ingredient coverage remains open.
