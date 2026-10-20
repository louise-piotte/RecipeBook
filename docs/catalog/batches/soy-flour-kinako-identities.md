# WP02 Soy Flour and Kinako Identities (B1/B6)

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** identities integrated and verified; independent bilingual review remains pending
- **Research date:** 2026-10-06
- **Scope:** Distinguish generic soy flour from the source-named roasted soybean flour Kinako, and
  use supported English and Québec French names without importing vendor performance claims.

## Accepted identities

| Stable ID | English / fr-CA display | Aliases | Category |
| --- | --- | --- | --- |
| `ingredient-ref-soy-flour` | soy flour / farine de soya | EN: `soybean flour`, `soya flour`; FR: `farine de soja` | `FLOUR_AND_STARCH` |
| `ingredient-ref-kinako` | kinako / poudre de soja Kinako | EN: `roasted soybean flour`; no extra French alias | `FLOUR_AND_STARCH` |

OQLF lists `farine de soya` and `farine de soja` as preferred French terms and `soy flour`,
`soybean flour`, and `soya flour` as English terms. Its definition describes a fine, sifted,
hull-free soybean meal for human food [WP02-S132]. These names belong to the generic soy-flour row.

The Japan Ministry of Agriculture, Forestry and Fisheries explicitly writes `kinako (roasted
soybean flour)` and uses `Kinako Roasted Soybean Flour` in a recipe [WP02-S133]. The Government of
Québec lists Kinako among other appellations under French `Soja` [WP02-S134]. A Canadian supplier's
French product page is titled `Poudre de soja Kinako` and describes the product as finely ground
flour made from roasted soybeans [WP02-S135]. These sources support a distinct Kinako identity and
the English roasted-soybean-flour alias. They do not make all generic soy-flour names equivalent to
Kinako.

The supplier page also states baking-replacement, nutrition, and health claims. None are imported.
Neither row has density, unit mappings, forms, conversions, yield, measurement, or substitution data.
No recipe is edited.

## Catalog and recipe audit

Before integration, the active ingredient-reference catalog had no soy-flour or Kinako name or alias,
and the 114 bundled recipe JSON files had no matching ingredient wording. An existing `sauce soya`
reference is a sauce, not a flour identity. No recipe line was changed.

The picker uses phrase matching. `soy flour`, `soya flour`, `farine de soya`, and `farine de soja`
resolve to generic soy flour. `kinako`, `roasted soybean flour`, and `poudre de soja Kinako` resolve
to Kinako. The shared phrase `soybean flour` may show both rows, so the picker displays the two
distinct names for the user to choose from.

## Sources

Sources were accessed on 2026-10-06.

- **WP02-S132 — OQLF, farine de soya:** [OQLF terminology record](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084165/farine-de-soya).
  Supports the generic English/French terms and definition. It is not a density or process-conversion
  source.
- **WP02-S133 — Japan Ministry of Agriculture, Forestry and Fisheries, Akaneko:** [official cuisine
  page](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/2675/index.html). Pairs Kinako
  with roasted soybean flour in the ingredients and recipe.
- **WP02-S134 — Gouvernement du Québec, Allergènes et leurs différentes appellations:** [Québec
  terminology page](https://www.quebec.ca/sante/alimentation/allergies-alimentaires/allergenes-differentes-appellations).
  Lists Kinako under the French soy heading; this is not a technical product specification.
- **WP02-S135 — Qualifirst, Poudre de soja Kinako:** [Canadian French product
  page](https://odoo.qualifirst.com/fr_CA/food/flours/kinako-soybean-powder-l). Supports the French
  product name and roasted-soybean description. The supplier's replacement, nutrition, and health
  claims are not imported.

## Acceptance checks

| Check | State |
| --- | --- |
| Generic soy flour and Kinako supported as distinct names/products | Pass: OQLF, MAFF, Québec government, and Canadian product sources are recorded in the ledger. |
| Catalog rows use only source-supported aliases and identity data | Pass: generic OQLF aliases and the MAFF-backed Kinako English alias only. |
| Normalized catalog and 114-recipe audit | Pass: no prior flour/Kinako row or recipe use; no recipe changed. |
| Package validation, generated index, ledger schema, Python and Android unit tests | Pass: 240 Android unit tests and 9 Python package tests. |
| Pixel 9a / Android 16 API 36 instrumentation | Pass: 29 tests, 27 passed, 2 environment-gated skips, no failures/errors. |
| Escaped-Unicode/no-BOM audit and `git diff --check` | Pass across 125 bundled seed JSON files. |
| Pixel 9a / Android 16 live picker and restored French home | Pass; all 114 recipes remain and fr-CA is restored. |
| Independent Québec French review | Pending. |

## Verification record

Final verification on 2026-10-06: the normalized package contains 337 ingredient references; its
reference JSON SHA-256 is `2ca046c1afa41ad457aabd491d8873c3a7b66840a044754a6a5185c7bb11d9b1`. The
492-record evidence ledger SHA-256 is
`39306a1b86d5273f2f54efcde0734d3a74957c4ea9b4c99580ef8a6d622d54b0`. Normalization reported zero
changed parts. Package validation, generated-index freshness (337 references), ledger-schema
validation, 9 Python package tests, 240 Android unit tests, escaped-Unicode/no-BOM checks across 125
bundled JSON files, and `git diff --check` passed. Pixel 9a / Android 16 API 36 instrumentation
passed 27 of 29 tests, with two environment-gated skips and no failures or errors.

The live English picker returned Kinako for `kinako` and `roasted soybean flour`, and generic soy
flour for `soy flour`. The shared `soybean flour` query displayed both rows for selection. The French
picker returned `poudre de soja Kinako` and `farine de soya` for their respective queries. The blank
probe was discarded and the French home was restored with all 114 recipes. Screenshots:

- English: `pixel9a-soy-kinako-picker-en.png`, `pixel9a-soy-roasted-flour-picker-en.png`,
  `pixel9a-soy-flour-picker-en.png`, and `pixel9a-soybean-flour-disambiguation-en.png`.
- Québec French and restored library: `pixel9a-soy-kinako-picker-fr-ca.png`,
  `pixel9a-soy-flour-picker-fr-ca.png`, and `pixel9a-soy-home-restored-fr-ca-114.png`.

## Remaining work

- Obtain independent Québec French review of `farine de soya`, `farine de soja`, and `poudre de soja
  Kinako` as display and search terms.
- Continue remaining B1 flour identities and B6 toasted/roasted product coverage; do not infer
  measurement or replacement behavior from product marketing.
