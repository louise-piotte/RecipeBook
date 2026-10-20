# WP06 jambu identity — 2026-10-09

This coordinator batch adds jambu as a source-named Amazonian herb, distinct from the other tacacá
components.

## Catalog decision

- ID: `ingredient-ref-jambu`
- English and French display: `jambu` (French display provisional)
- Category: `HERB`
- Aliases: none. Embrapa lists Portuguese common names including `agrião-do-Pará`, `agrião-do-brasil`,
  and `agrião-do-norte`; these are not put in English/French alias fields or mapped to watercress.
- Embrapa identifies the plant as *Acmella oleracea* and describes leaves, stems, and flowers in
  regional culinary use. No medical claims from the source are adopted.
- Keep jambu separate from culantro / chicória-do-Pará, tucupi, cassava gum, and other tacacá components.
- No form, density, unit mapping, measurement, conversion, substitution, or recipe link was added.
- The 114-recipe scan found no jambu ingredient name or reference ID. No recipe file changed.

## Sources

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP06-SOUTHAM-20261009-S12` | [Brazil Ministry of Fisheries and Aquaculture, “Aprenda como fazer o tradicional Tacacá”](https://www.gov.br/mpa/pt-br/assuntos/noticias/aprenda-como-fazer-o-tradicional-tacaca/) (2026-08-28), tacacá description and jambu component/assembly sections | Names jambu as a distinct herb and tacacá component. This is one recipe; its amounts and cooking times are not generalized. |
| `WP06-SOUTHAM-20261009-S34` | [Embrapa Amazônia Oriental, *Doenças do jambu*](https://www.infoteca.cnptia.embrapa.br/infoteca/bitstream/doc/1142229/1/CirTec52.pdf) (2022-04), introduction, printed pp. 2–3 | Identifies jambu as *Acmella oleracea*, an Amazon-basin nonconventional vegetable; describes regional dishes, salads, and culinary use of leaves and flowers. Alternative names are Portuguese source evidence, not English/French aliases. No medical claim or measurement is adopted. |

## Validation

- Package: 472 ingredient references (SHA-256
  `ac8a45d16036ee41fd01b8b37371feb46c2a300ad3c5834fb569839de307ca41`), 17 forms; manifest SHA-256
  `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Research ledger: 638 records, 870 source entries, and 759 distinct source IDs (SHA-256
  `480a3e99095788a13b810e874d78a22288120205d70fc989229b4b51e1cc1581`).
- Corpus: 114 recipes and 1,123 ingredient lines.
- Package normalization, generated-index freshness, and ledger JSON Schema checks passed; all 9
  Python seed-package tests passed. Android unit tests: 292 passed, 0 failures, errors, or skips.
- Pixel 9a / Android 16 instrumentation on `emulator-5556`: 29 XML cases, 27 passed, 2 skipped,
  0 failures or errors. Deployment succeeded.
- Live English and French picker queries for `jambu` each returned the dedicated row. The temporary
  draft was discarded and the French home was restored at 114 recipes.

## Emulator screenshots

| Screenshot | SHA-256 |
|---|---|
| [English picker](en-picker.png) | `b57c76b27abc186d6fb4d7e253a176385548d3a300c23147a45f9972749f08d6` |
| [French picker](fr-picker.png) | `c0728a8a5f8ba10ceb629ef57e463167b9f1defd34da3e7b90b8d91cdf4871f6` |
| [French library home, 114 recipes](fr-library-114.png) | `f5512267f94e2267f95b6bae2182da84553b2b3d55e1407e2546f253d5528bf2` |

## Open work

Review the French culinary display with a Québec terminology reviewer. Pimenta-de-cheiro and broader
Amazonian product identities remain proposal-only. Chicória-do-Pará is integrated separately as
culantro; see `../wp06-chicoria-do-para-identity-20261009/README.md`.
