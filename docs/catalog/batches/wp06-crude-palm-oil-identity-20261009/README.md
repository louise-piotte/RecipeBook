# WP06 crude palm oil / azeite de dendê identity — 2026-10-09

This coordinator batch resolves the Brazilian azeite de dendê lead as crude palm oil.

## Catalog decision

- ID: `ingredient-ref-crude-palm-oil`
- English display: `crude palm oil (azeite de dendê)`
- French display: `huile de palme brute (azeite de dendê)` (provisional pending Québec terminology review)
- Category: `FAT_AND_OIL`
- Aliases: none.
- Anvisa says `azeite de dendê` is an alternative designation only for crude palm oil or palm fat.
  Codex defines palm oil as coming from the fruit's fleshy mesocarp and distinguishes it from
  palm-kernel oil and the palm olein/stearin fractions. OQLF supports the general EN/FR term pair
  `palm oil / huile de palme`; the more specific French display remains provisional.
- Bahia IPAC and an Instituto Adolfo Lutz study document the oil's culinary use with acarajé. The
  study's product-quality measurements are not copied into the catalog.
- Keep refined palm oil, palm-kernel oil, palm olein/stearin, and generic vegetable oil separate.
  No alias, form, density, unit mapping, measurement, conversion, substitution, or recipe link was
  added.
- A scan of all 114 bundled recipes (1,123 ingredient rows) found no matching name or reference ID.
  No recipe file changed.

## Sources

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP06-SOUTHAM-20261009-S13` | [Bahia IPAC, “Ofício das Baianas do Acarajé”](https://www.ba.gov.br/ipac/oficio-das-baianas-do-acaraje) (published 2013-07-26; updated 2026-10-07), opening description | Describes acarajé as fried in azeite de dendê in the traditional baiana food service. Heritage context, not a technical oil specification. |
| `WP06-SOUTHAM-20261009-S39` | [Office québécois de la langue française, “huile de palme”](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8408996/huile-de-palme) (updated 2026), definition and translation | Defines palm oil as oil from the oil-palm fruit pulp and gives the EN/FR term pair. It does not specify crude or refined processing. |
| `WP06-SOUTHAM-20261009-S40` | [Brazilian Health Regulatory Agency (Anvisa), *Perguntas e respostas sobre óleos e gorduras vegetais*](https://www.gov.br/anvisa/pt-br/centraisdeconteudo/publicacoes/alimentos/perguntas-e-respostas-arquivos/perguntas-e-respostas-sobre-oleos-e-gorduras-vegetais-gepar-120122.pdf), question 25 | Explains that IN 87/2021 allows azeite de dendê as an alternative designation for crude palm oil or palm fat. It does not establish synonymy with refined palm oil. |
| `WP06-SOUTHAM-20261009-S41` | Codex Alimentarius, [CXS 210-1999, *Standard for Named Vegetable Oils*](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/tr/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS+210-1999%2FCXS_210e.pdf), Section 2 | Distinguishes mesocarp palm oil from palm-kernel oil and palm fractions. Product-boundary evidence only; no substitute relationship is inferred. |
| `WP06-SOUTHAM-20261009-S42` | Curvelo et al., [“Qualidade do óleo de palma bruto (Elaeis guineensis): matéria-prima para fritura de acarajés”](https://periodicos.saude.sp.gov.br/RIAL/article/view/32526), *Revista do Instituto Adolfo Lutz* 70(4) (2011), pp. 641–646 | Studies crude palm-oil products used by acarajé vendors in Salvador. Study-specific quality measures are not transferred. |
| `WP06-SOUTHAM-20261009-S43` | Anvisa, [“Materiais do diálogo setorial sobre atualização das listas de óleos e gorduras vegetais”](https://www.gov.br/anvisa/pt-br/assuntos/noticias-anvisa/2026/ja-estao-disponiveis-materiais-do-dialogo-setorial-sobre-atualizacao-das-listas-de-oleos-e-gorduras-vegetais) (published 2026-09-01), regulatory next steps | Says an update to fatty-acid-composition ranges for palm oils and fractions is planned. It does not report an enacted change to the azeite de dendê denomination. |

## Validation

- Package: 475 ingredient references (SHA-256
  `0edcef47371ba3afd77617e275404594f30a7d5a266b35d561b54b585cfbd7e0`), 17 forms (SHA-256
  `2098e1048796a1aba42c25e4020f018d02c04c332567620084fceac8f2d15`); manifest SHA-256
  `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Research ledger: 641 records, 882 source entries, 769 distinct source IDs (SHA-256
  `c117ec1ef3180a670445e2fe3aa38b8502986b182c2085231ded54fc04cebc30`).
- Package normalization, generated-index freshness, ledger schema validation, and all 9 Python
  seed-package tests passed. Android unit tests: 295 passed, 0 failures/errors/skips.
- Pixel 9a / Android 16 instrumentation on `RecipeBook_Pixel_9a` (`emulator-5556`, 1080 × 2424):
  29 XML cases, 27 passed, 2 skipped, 0 failures/errors. The deploy script installed and launched
  the build on this emulator.
- Live picker QA returned one crude-palm-oil result for `crude palm oil` in English and one
  `huile de palme brute` result in French. The unsaved draft was discarded and the French library
  returned to 114 recipes.

## Emulator screenshots

| Screenshot | SHA-256 |
|---|---|
| [English picker: crude palm oil](en-picker.png) | `41370aad49982b2f2c42ce695a2a638c8c9bd27c49fa050cf93ffffa7963b4ee` |
| [French picker: huile de palme brute](fr-picker.png) | `2ccbaee55c100c646b84776093b0aa2213095a597ade25b793bc9f6c7b3b417d` |
| [French library home, 114 recipes](fr-library-114.png) | `6f402808f3c2407f05bdd0283a39df0c2656e818a2d5d0f81cd1ef30363768e3` |

## Open work

Review the French product wording with a Québec culinary terminology reviewer. Broader Brazilian
product and regional ingredient coverage remains open.
