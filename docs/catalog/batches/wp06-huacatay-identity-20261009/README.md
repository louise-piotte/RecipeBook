# WP06 huacatay identity — 2026-10-09

This coordinator batch integrates a narrowly scoped, source-named culinary identity for Peruvian
huacatay. The regional plant name has more than one botanical use; the row does not assign one
universal species to every food or medicinal use of the name.

## Catalog decision

- ID: `ingredient-ref-huacatay`
- English display: `huacatay`
- French display: `huacatay` (provisional pending independent Québec terminology review)
- Category: `VEGETABLE_AND_AROMATIC`
- No aliases, forms, density, unit mappings, measurements, conversions, substitutions, or recipe
  links were added.
- The reviewed food sources associate documented Peruvian culinary use especially with
  *Tagetes minuta*. INIA's medicinal germplasm database also labels accessions of *T. terniflora*
  huacatay, but gives no culinary-use evidence for those accessions. Do not claim that every
  regional use of the common name is one species, or turn medicinal accessions into food identities.

## Sources

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP06-HUACATAY-20261009-S01` | PROMPERÚ, [“7 recetas fáciles que puedes preparar con la papa peruana”](https://www.peru.travel/es/inspirate/7-recetas-faciles-que-puedes-preparar-con-la-papa-peruana), “Ocopa arequipeña.” | Names huacatay as the aromatic herb in ocopa; does not identify a species. |
| `WP06-HUACATAY-20261009-S02` | INIA, [*Cultivo de hierbas Aromáticas y medicinales*](https://repositorio.inia.gob.pe/bitstreams/36824049-e6c1-4a62-8e17-8d55d3376740/download), “Huacatay, quincho.” | Lists *Tagetes* spp. and culinary uses in pachamanca, ají dishes, picante, ocopa, and soups; does not resolve a species or prove quincho is a safe alias. |
| `WP06-HUACATAY-20261009-S03` | Embajada del Perú en Indonesia, [*101 Razones para estar orgullosos del Perú*](https://cdn.www.gob.pe/uploads/document/file/3112346/101%20razones%20para%20estar%20orgullosos%20del%20PERU%CC%81_220510_230921.pdf.pdf), p. 32. | A government-hosted cultural guide identifies huacatay as *Tagetes minuta* and describes culinary use; it is not a botanical voucher or food standard. |
| `WP06-SOUTHAM-20261009-S49` | INIA, [Germoplasma accession query](https://genebankperu.inia.gob.pe/consulta?type=2&var=27), “Plantas Medicinales de Costa,” accessions PER1001065–PER1001067. | Labels one *T. terniflora* and two *T. minuta* accessions huacatay in a medicinal collection. This does not establish culinary use or a universal species meaning. This existing South American source ID is reused to avoid a duplicate ledger citation. |
| `WP06-HUACATAY-20261009-S05` | Medina Huarcaya and Meza Beltran, [2018 sauce study](https://alicia.concytec.gob.pe/vufind/Record/UNCP_e25efa8a6b8b1fed8be87a22a0eb3505), Universidad Nacional del Centro del Perú. | Food-sauce study associates huacatay with *T. minuta* and distinguishes it from chincho; one study, not a universal naming standard. |
| `WP06-HUACATAY-20261009-S06` | Kew, Plants of the World Online, [*Tagetes minuta*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:252132-1/general-information). | Treats *T. minuta* as an accepted species; botanical taxonomy only. |
| `WP06-HUACATAY-20261009-S07` | Kew, Plants of the World Online, [*Tagetes terniflora*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:60461729-2/general-information). | Treats *T. terniflora* as a separate accepted species; it does not connect the species to Peruvian food use. |

## Collision and recipe checks

Before integration, exact normalized-key scans found no owners in active references, forms, or
legacy candidates for `huacatay`, `huatacay`, `huacataya`, `wacatay`, `wakatay`, `wakataya`,
`chinchi wakatay`, `chincho`, `quincho`, `Tagetes minuta`, `Tagetes terniflora`,
`Tagetes elliptica`, `Peruvian black mint`, `black mint`, `menta negra peruana`, `menta negra`,
`tagète des décombres`, or `wild marigold`. These are exact normalized-key checks, not fuzzy or
semantic matching. After integration, `huacatay` is owned by the new reference; the other terms
remain unassigned.

All 114 manifest-listed recipes (1,123 ingredient rows) were scanned recursively for these terms;
there were zero hits and no recipe links were added. The recipe corpus was unchanged; its
manifest-order digest remains `e80d97c204558cb88e7a773c04b59742c116f595f10970c6785d25714a7e5397`.

## Validation

- Canonical package: 480 ingredient references (SHA-256
  `640e66a6172020ace27f10ba267dbc8fbad467be73a51a517c7cb64e42077459`), 17 forms (SHA-256
  `2098e1048796a1aba42c25e4020f018d02c04c332567620084fceac8f2d15`), manifest SHA-256
  `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Research ledger: 646 records, 900 source entries, 787 distinct source IDs (SHA-256
  `33452b8faa035c04a2df62b52620db542c66dc9e6c68c85d63438f2febf19d5e`); schema validation
  reported zero errors.
- Package normalization, generated-index freshness, ledger validation, all 9 Python package tests,
  UTF-8/no-BOM/escaped-Unicode checks, and `git diff --check` passed.
- Android unit tests: 300 passed, 0 failures/errors/skips. Pixel 9a / Android 16 instrumentation
  on `emulator-5556`: 29 XML cases, 27 passed, 2 skipped, 0 failures/errors.
- The deploy script installed and launched the app. English and French `huacatay` picker searches
  each returned one `huacatay` result. The empty draft was discarded and the French home screen
  returned to 114 recipes.

## Emulator screenshots

| Screenshot | SHA-256 |
|---|---|
| [English picker: huacatay](en-picker.png) | `7aafc106f1166d0d1cd846bfbf971ba2131ac00f13a78fa4ff67acd0deb67d05` |
| [French picker: huacatay](fr-picker.png) | `23d200ee8d7378707ca3ccca8c0d3f0c580f508b0a5fc9ab47501bed4bbd6e7f` |
| [French home, 114 recipes](fr-home-114.png) | `d42a1e4560a59f391589e5902ba1617d674aa2ca7ff25547f1875122d37728f1` |

## Open work

Independent Québec terminology review, remaining Andean and South American identity proposals, and
broader WP06 regional gap disposition remain open.
