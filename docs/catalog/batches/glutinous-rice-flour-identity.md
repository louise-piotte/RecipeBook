# WP02 Glutinous Rice Flour Identity (Section 04 A4 / B5)

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Add the generic glutinous rice flour identity, distinct from ordinary rice flour and glutinous rice grain. Keep Japanese milling-product names and cooked/roasted grades open; do not infer measurements or substitutions.
- **Input revision:** repository `HEAD` `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4`; pre-integration reference JSON SHA-256 `392b68395d123e68ecb4ef369adc590929f5f67a57dc85b4b6541c66b09a8835` (307 references); pre-integration research-ledger SHA-256 `e868ad32a7e519d47f8fce8af5d50795699a9571f12d3539d0e7ca815ade3874` (457 records); plan snapshot SHA-256 `148ef4f32adfb5143274a63901390c1158dcb615773f84b519a6170c28ed60fb`; 114 recipe-file fingerprint SHA-256 `819cdd59f0eac4669168622e3c54b680d3884846f0f95892f6e653f0a3ad12a2`.
- **Recipe audit:** no bundled recipe file contains `glutinous rice flour`, `farine de riz gluant`, `sweet rice flour`, `mochiko`, or `shiratamako`; no recipe line was relinked.
- **Existing identity audit:** ordinary `ingredient-ref-rice-flour` and grain `ingredient-ref-glutinous-rice` already exist. No glutinous-rice-flour identity, form, conversion, or substitution record exists.
- **Dependencies:** WP01 identity/evidence contract; WP02 A4 cereal flours and B5 Japanese glutinous-rice product review; WP03 grain review; WP10 canonical seed integration.

## Identity decision

| Stable ID | English / fr-CA display | Accepted aliases | Evidence and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-glutinous-rice-flour` | glutinous rice flour / farine de riz gluant | EN: `sweet rice flour`, `sweet rice powder`; FR: none | MAFF distinguishes glutinous-rice flour from short-grain rice flour in one recipe; a Canadian manufacturer supplies the English product name and aliases, and a Québec-market listing uses the French display. Keep ordinary rice flour and glutinous rice grain separate. [S01–S04] |

The identity is `FLOUR_AND_STARCH`. The generic product is distinct from `ingredient-ref-rice-flour`
and `ingredient-ref-glutinous-rice` in `GRAIN_AND_CEREAL`. The English aliases are manufacturer-listed
names for this flour; they do not alias the glutinous-rice grain or regular rice flour. Do not alias
`mochiko` or `shiratamako` while their milling and product boundaries remain under review. Cooked,
roasted, brown-glutinous-rice, and other qualified products are outside this row. Density, unit
mappings, forms, conversions, and substitutions remain unset.

## Source register

Sources were accessed on 2026-10-06.

- **S01 — OQLF, riz glutineux:** [Grand dictionnaire terminologique entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8393595/riz-glutineux). Lists `riz gluant` as a preferred fr-CA term for the source grain alongside `riz glutineux` and `riz doux`; this supports the source-grain wording only.
- **S02 — Japan Ministry of Agriculture, Forestry and Fisheries, Kushi-dango:** [Regional cuisine entry](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/7285/index.html). Names `shiratamako` as glutinous rice flour and `joshinko` as short-grain rice flour, then uses both separately in one recipe. Supports the flour distinction; the native milling-product names remain unassigned.
- **S03 — Kosa Foods, Glutinous Rice Flour:** [Manufacturer product listing](https://www.kosafoods.com/shop/). Its 400 g product is named glutinous rice flour, lists glutinous rice as the ingredient, and calls it `sweet rice flour` or `sweet rice powder`.
- **S04 — SUE Foods, Farine de riz gluant:** [Québec-market product listing](https://suefoods.com/products/king-elephant-brand-farine-de-riz-gluant). Uses the exact French product name and describes the flour as made from glutinous rice.

## Integration and verification

Integration is complete. The final reference JSON has 308 rows (SHA-256
`db2c505e090df9d45c641bb899d20b7c4da0f109e238bb3fc5433bedffaabcdb`); the research ledger has 458
records (SHA-256 `c4a9a5c70d72a144aae538dfd5ba4a8725a142c87d02524e063722d22611098e`).

- `:app:testDebugUnitTest` passed all 202 unit tests. Android 16 / API 36 instrumentation on the
  Pixel 9a AVD reported 26 tests: 24 passed, two skips gated to the isolated `app.recipebook.qa`
  package, and zero failures or errors. All 9 Python seed-package tests passed.
- Reference normalization (`--check`), bundled package validation and normalization (`--validate-only`
  and `--check`), generated-catalog freshness, and `git diff --check` passed. The 124 bundled JSON
  files had zero BOMs, raw non-ASCII bytes, or known mojibake markers.
- `tools/deploy_to_pixel9a_emulator.sh` passed its test and debug-assembly tasks, installed the app
  on `emulator-5554`, and launched it. Live picker searches for `glutinous rice flour`, `sweet rice
  flour`, `sweet rice powder`, and `farine de riz gluant` each returned the generic glutinous-rice-
  flour identity. `rice flour` returned separate `glutinous rice flour` and `rice flour` rows;
  `mochiko` and `shiratamako` returned no catalog rows. The unsaved probe was discarded, and the home
  screen still showed 114 recipes.
- Screenshots: [accepted-name result](pixel9a-glutinous-rice-flour-live-search.png), [ordinary and
  glutinous rice flour separation](pixel9a-rice-flour-separation.png), and [unchanged home screen]
  (pixel9a-glutinous-rice-flour-home-114.png).

Independent bilingual Québec French approval remains open; the French query resolved successfully,
but the reviewer must still approve the display wording and boundary. Japanese product-name review,
measurement research, and substitution research also remain open.

## Remaining work

- Obtain independent bilingual review of the French display and the generic-vs-native product boundary.
- Review `mochiko` and `shiratamako` against manufacturer milling specifications and Canadian French packaging before assigning either name.
- Research measurement and substitution evidence separately; do not copy generic rice-flour values into this identity.
