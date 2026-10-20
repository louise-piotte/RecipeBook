# WP02 Specialist Wheat Flour Identities (Section 04 A1)

## Packet record

- **Owner:** WP02 / WP10 integration lead
- **Reviewers:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-05
- **Scope:** Integrate pastry flour, whole-wheat pastry flour, high-gluten flour, and self-rising flour; correct the false `farine à pâtisserie` alias on cake flour. This identity tranche does not complete A1 or WP02.
- **Input revision:** repository `HEAD` `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4`. The plan input SHA-256 was `64845d8600d2dc18f4d74f7e300087fdb26531e2056a766d03f093c460b227b9`. The pre-integration reference JSON SHA-256 was `008cb9fc173f5e0eafd64b41181df71ef1a1f0028958b3579df1e266de93082f` (293 references). The integrated file has 297 references and SHA-256 `f7ca3b37bf58862f09f032d587f0419f499f3bd8e8ae24b071e492f8fb025f90`; the canonical forms file remains at three forms.
- **Recipe audit:** The 114 recipe files contain four cake-flour ingredient lines across four recipes and no direct ingredient lines for the four new identities. No recipe line was relinked.
- **Dependencies:** WP01 identity/evidence rules; WP02 flour/starch source packet; WP10 canonical seed integration.

## Integrated identity decisions

All four new rows use `FLOUR_AND_STARCH`, null density, and empty unit mappings. Their ledger identity state is `verified`; measurement and substitution research remain `not_yet_researched`. No forms, conversion values, yields, measurements, or substitutions were activated.

| Stable ID | English / fr-CA display | Active aliases | Evidence and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-pastry-flour` | pastry flour / farine à pâtisserie | None | OQLF pairs `farine à pâtisserie` with `pastry flour`. Manufacturer documentation treats pastry flour and cake flour as separate products with different product specifications; the old cake-flour alias is removed. [S01–S02] |
| `ingredient-ref-whole-wheat-pastry-flour` | whole-wheat pastry flour / farine de blé entier à pâtisserie | None | The Québec product directory records the French product name; manufacturer documentation describes the complete wheat kernel in its whole-wheat pastry product. Keep distinct from both generic whole-wheat flour and refined pastry flour. [S03–S04] |
| `ingredient-ref-high-gluten-flour` | high-gluten flour / farine à haute teneur en gluten | None | Ardent Mills Canada publishes matching English and French product pages for a high-gluten flour. Keep distinct from generic bread flour; this identity row carries no protein specification. [S05–S06] |
| `ingredient-ref-self-rising-flour` | self-rising flour / farine à levure | EN: `self-raising flour`; FR: `farine autolevante` | OQLF gives `farine à levure` as the preferred term, lists `farine autolevante` for some contexts, and pairs it with self-rising flour. Keep this prepared product distinct from all-purpose flour and from baking powder as an ingredient; no universal formula is stored. [S07–S08] |

The existing `ingredient-ref-cake-flour` keeps its stable ID and `farine à gâteau` display name. OQLF maps that name to cake flour. Its unsupported `farine à pâtisserie` alias was removed and moved to the new pastry-flour identity. The related ledger identity is now source-verified; the removed draft measurement remains blocked pending evidence. [S01–S02, S09–S10]

## Source register

Sources were accessed on 2026-10-05.

- **S01 — OQLF, « farine à pâtisserie »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031479/farine-a-patisserie), preferred Québec French term, English equivalent, and definition.
- **S02 — King Arthur Baking, “Pastry Flour”:** [Product page](https://shop.kingarthurbaking.com/items/pastry-flour), soft-wheat pastry flour product details and direct comparison with cake flour.
- **S03 — Répertoire des aliments québécois, “Farine de blé entier à pâtisserie biologique”:** [Product listing](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8205134), Québec-market French product name and ingredient statement.
- **S04 — King Arthur Baking, “Whole Wheat Pastry Graham Flour”:** [Product page](https://shop.kingarthurbaking.com/items/whole-wheat-pastry-graham-flour), complete-kernel description and distinction from standard pastry flour.
- **S05 — Ardent Mills Canada, « Haute teneur en gluten »:** [French product page](https://ardentmills.ca/fr/products/traditional-wheat/standard-flours/high-gluten/), Canadian product name and applications.
- **S06 — Ardent Mills Canada, “High Gluten Flour”:** [English product page](https://ardentmills.ca/products/traditional-wheat/standard-flours/high-gluten/), English product name and wheat/flour description.
- **S07 — OQLF, « farine à levure »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17490878/farine-a-levure), preferred French term, contextual alternative, English equivalents, and product definition.
- **S08 — King Arthur Baking, “Unbleached Self-Rising Flour”:** [Product page](https://shop.kingarthurbaking.com/items/unbleached-self-rising-flour), product-class identity and broad composition description.
- **S09 — OQLF, « farine à gâteau »:** [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17057198/farine-a-gateau), French and English cake-flour terms and definition.
- **S10 — King Arthur Baking, “Unbleached Cake Flour”:** [Product page](https://shop.kingarthurbaking.com/items/unbleached-cake-flour), cake-flour product description and direct comparison with pastry flour.

Source IDs `WP02A1-S01`–`WP02A1-S10` are recorded on the corresponding ledger rows. Product-specific specifications were not generalized into catalog measurements.

## Search and integration checks

- `:app:testDebugUnitTest`: 201 tests passed, with no failures, errors, or skips. The UI search fixture confirms `farine à pâtisserie` and `farine à gâteau` select separate identities.
- Pixel 9a / Android 16 instrumentation: 24 of 26 tests passed, zero failures/errors; two existing environment-gated tests were skipped.
- All 9 Python package tests, reference/package normalization and validation, generated-index freshness, ledger JSON Schema validation (447 records), alias-collision checks, UTF-8/no-BOM checks across 124 bundled JSON files, and `git diff --check` passed.
- The deploy script's `test` and `:app:assembleDebug` tasks passed and installed/launched the current build. Live picker query `farine a patisserie` returned only pastry flour; `farine a gateau` returned only cake flour. `whole wheat pastry flour`, `farine a haute teneur en gluten`, and `farine autolevante` returned their matching identities. Screenshots: [pastry flour](pixel9a-pastry-flour-picker.png) and [cake flour](pixel9a-cake-flour-picker.png). The blank probe was discarded without saving and the home screen remained at 114 recipes.
- New rows have no numeric data or conversion/substitution rules. The existing cake-flour stable ID is unchanged.

## Remaining work

- Obtain independent bilingual review of the four new identities, the French terms, and the corrected cake/pastry alias boundary.
- Continue A1 coverage for white whole-wheat flour and source-reviewed bleaching/grade handling; continue A2–A7 research and baking distinction fixtures.
- Keep measurement and substitution evidence separate from this identity packet.
