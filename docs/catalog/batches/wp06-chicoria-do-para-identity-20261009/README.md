# WP06 chicória-do-Pará identity — 2026-10-09

This coordinator batch resolves the Amazonian chicória-do-Pará lead as a distinct herb identity.

## Catalog decision

- ID: `ingredient-ref-culantro`
- English display: `culantro`
- French display: `chicória-do-Pará` (provisional pending Québec terminology review)
- Category: `HERB`
- Aliases: none.
- Identity: *Eryngium foetidum*. Embrapa identifies the source name and describes its aromatic
  leaves as a seasoning; Health Canada uses `culantro` for the same species and lists cilantro as
  *Coriandrum sativum* separately.
- Keep it distinct from fresh cilantro, ground coriander, coriander seed, generic chicory, jambu,
  tucupi, and other tacacá components. Portuguese terms such as `coentrão` are evidence only, not
  activated global aliases.
- Health Canada lists both fresh and dried leaf commodities. This batch adds no processed form,
  density, unit mapping, measurement, conversion, substitution, or recipe link.
- A scan of all 114 bundled recipes (1,123 ingredient rows) found no matching name or reference ID.
  No recipe file changed.

## Sources

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP06-SOUTHAM-20261009-S12` | [Brazil Ministry of Fisheries and Aquaculture, “Aprenda como fazer o tradicional Tacacá”](https://www.gov.br/mpa/pt-br/assuntos/noticias/aprenda-como-fazer-o-tradicional-tacaca/) (2026-08-28), tacacá ingredient/component list | Lists chicória-do-Pará separately from jambu, pimenta-de-cheiro, and other named components. One dish source; not a general recipe or product standard. |
| `WP06-SOUTHAM-20261009-S35` | [Embrapa / Brazil Ministry of Agriculture, *Manual de hortaliças não-convencionais*](https://www.embrapa.br/documents/1355126/33532290/manual_hortalicas-n%C3%A3o-convencionais.pdf/4a82119a-d557-0b7c-0f8a-ce4509177cd3) (2010), section 2.3.8, printed p. 59 | Identifies chicória-do-Pará as *Eryngium foetidum* and describes Amazonian cultivation and its aromatic leaves as seasoning. No recipe amount is adopted. |
| `WP06-SOUTHAM-20261009-S36` | [Health Canada, “Residue Chemistry Crop Groups”](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html), herb entries for fresh and dried leaves | Lists culantro leaves as *Eryngium foetidum* and cilantro separately as *Coriandrum sativum*. Supports the English name and species boundary, not culinary equivalence or Québec French naming. |

## Validation

- Package: 473 ingredient references (SHA-256
  `052202cb01d157049b3126355539facce3491661510965e4603bac436e1250ce`), 17 forms; manifest SHA-256
  `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Research ledger: 639 records, 873 source entries, 761 distinct source IDs (SHA-256
  `d209ec648678fd167c51cbba31ca22ada249bb36f34d2f341573a1097deca7a7`).
- Package normalization, generated-index freshness, ledger schema validation, and all 9 Python
  seed-package tests passed. Android unit tests: 293 passed, 0 failures/errors/skips.
- Pixel 9a / Android 16 instrumentation on `RecipeBook_Pixel_9a` (`emulator-5556`, 1080 × 2424):
  29 XML cases, 27 passed, 2 skipped, 0 failures/errors. The stock `Pixel_9a` AVD
  (`emulator-5554`) had 419 MB free and could not install the instrumentation APK; it ran zero cases.
  The usable profile had 3.7 GB free. The deploy script installed and launched the build there.
- Live picker QA returned one `culantro` result in English; an English `cilantro` query returned
  the separate cilantro row. French `chicoria do para` and `culantro` searches both returned the
  localized `chicória-do-Pará` row. The temporary draft was discarded and the French home returned
  to 114 recipes.

## Emulator screenshots

| Screenshot | SHA-256 |
|---|---|
| [English picker: culantro](en-picker.png) | `29fbd6e56c2486da178c0a71a648c5738874296dbcc226a02fec28126432df55` |
| [English boundary: cilantro](en-cilantro-boundary.png) | `9da8995e1a84b6f1618483928b493ef5b82975dd470382f057da99230c5dbaad` |
| [French picker: accent-folded source name](fr-picker.png) | `6229741ff38b991d644227769c3fe6167e685856861e343cc34550346d2669eb` |
| [French picker: English query](fr-english-query.png) | `40766686a83913c16a8f56477494acd81d3ddf0ada15ddd9525df105d5e01038` |
| [French library home, 114 recipes](fr-library-114.png) | `8e8cd2d5043729dec753a0fdb2f1526776774a4c5df0a2d7d88e27dd85c1f32e` |

## Open work

Review the borrowed French display with a Québec culinary terminology reviewer. Pimenta-de-cheiro,
other Amazonian product boundaries, and broader WP06 regional coverage remain open.
