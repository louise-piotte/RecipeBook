# WP02 A6 Teff Flour Identity

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Add a distinct teff-flour milling identity using sourced English and Québec French product
  names. Do not merge the flour with bare teff grain naming or add measurement/substitution data.
- **Input package:** 312 ingredient references, SHA-256
  `5d933e22f2fb78b28a64e86c6a86ba48467cfc9919a07cc62e8dce9be632e82d`; 462 research-ledger records,
  SHA-256 `e3dce6d0df1b8b1df4aaac5e6859d908df49e9ef45facf65f7c399743c71c56a`; 114 bundled recipe files.

## Identity decision

| Stable ID | English / fr-CA display | Aliases | Category and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-teff-flour` | teff flour / farine de teff | None | `FLOUR_AND_STARCH`; a distinct flour made from teff. Keep bare grain spelling and product/organic qualifiers out of aliases. [S90–S92] |

The reference has null density and empty unit mappings. No forms, conversions, measurements, or
substitutions were added. Bob's Red Mill identifies its milling product as `Teff Flour`; a Québec
French-market listing uses `Farine de teff`. The general display does not carry the source product's
whole-grain or organic qualifier. OQLF records French `tef` as recommended but non-current and lists
English `teff`; do not activate bare `tef` as a flour alias while the bilingual reviewer considers
grain-level wording.

## Source register

- **S90 — OQLF, tef:** [Québec terminology entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8480763/tef).
  Defines the cereal, gives English `teff`, and marks `tef` as recommended orthography that is
  non-current. This spelling is not used as a flour alias.
- **S91 — Bob's Red Mill, Teff Flour:** [Manufacturer product page](https://www.bobsredmill.com/product/teff-flour).
  Names a teff-flour milling product and lists whole grain teff as its ingredient. Nutrition, gluten,
  product-use, and whole-grain claims are not imported into catalog data.
- **S92 — La Chèvre et le Chou, Farine de teff bio:** [Québec French-market product listing](https://lachevreetlechou.ca/produits/farine-de-teff-bio).
  Uses the exact product wording `farine de teff` and lists teff as the ingredient. Brand and organic
  qualifiers are not imported.

## Recipe and integration audit

All 114 bundled recipe JSON files were parsed and their ingredient-name and original-line fields were
searched for `teff flour`, `farine de teff`, and bare `teff`/`tef` spellings. No ingredient line
matched; no recipe was relinked.

The final reference package has 313 references (SHA-256
`986cc3620170a5de7e1c3cef2bfd6451e885912f15c566e2c3f663e892ff3ddb`); the research ledger has 463
records (SHA-256 `497c6b9c4511664286f89086c36cb63c4ec4cc4696fe3f8677ea58053dd0b82a`). The flour/starch
identity count is 38.

## Verification

- Android unit tests: 207 passed.
- Python seed-package tests: 9 passed.
- Android 16 / API 36 Pixel 9a instrumentation: 26 cases, 24 passed, two QA-gated skips, zero
  failures/errors. The skipped cases were `openRouterSettingsPersistAndBlankKeyDisablesRemoteAi` and
  `actualActivityRetainsEditedAmountsMetadataAndDraftPhotoAcrossRecreation`.
- The deploy script passed its test and debug-assembly tasks and installed/launched on the isolated
  temporary 8 GB Pixel 9a profile at 1080×2424; the original emulator remained separate.
- Reference normalization, bundled-package normalization and validation, generated-catalog freshness,
  ledger schema and alias-collision checks, UTF-8/no-BOM audit across all 124 bundled JSON files, and
  `git diff --check` passed.
- Live picker searches `teff flour` and `farine de teff` each returned the single matching localized
  identity. The blank draft was discarded without saving; the French home screen remained at 114
  recipes.

Screenshots: `pixel9a-teff-flour-picker-en.png`, `pixel9a-teff-flour-picker-fr-ca.png`, and
`pixel9a-teff-flour-home-fr-ca-114.png` in this batch directory.

## Remaining work

- Obtain independent bilingual Québec French review of `farine de teff` and the separate grain/flour
  boundary.
- Keep density, measurement, conversion, and substitution evidence as separate open work.
- Continue the remaining A6 identities and the wider catalog plan.
