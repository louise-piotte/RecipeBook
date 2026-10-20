# WP02 Khorasan Flour Identity (Section 04 A4)

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Integrate a general Khorasan flour identity using Québec terminology and regional product evidence. Keep Khorasan distinct from generic durum flour; do not import flour grade, measurement, or substitution claims.
- **Input revision:** repository `HEAD` `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4`; pre-integration reference JSON SHA-256 `4f5c15ddb40e85dfc543af264c43062668ce5419313843862fd798e75df86145` (305 references); pre-integration evidence-ledger SHA-256 `dc9d0b657bc13cc83d5b627ec3e1318a86e243ef13e61034550b078f478d1697` (455 records); plan snapshot SHA-256 `6511f22ccc984948e5ae839f74de64c11a03304ed8a9f4ed8dce08eff5f4f478`.
- **Recipe audit:** no bundled recipe ingredient line contains Khorasan, Kamut, or farine de khorasan; no recipe line was relinked.
- **Dependencies:** WP01 identity/evidence contract; WP02 A4 flour review; WP03 cereal-grain review; WP10 canonical seed integration.

## Identity decision

| Stable ID | English / fr-CA display | Active aliases | Evidence and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-khorasan-flour` | khorasan flour / farine de khorasan | None | OQLF identifies `blé khorasan`, English `Khorasan wheat`, and *Triticum turanicum*; it explicitly labels Kamut a trademark. Québec product evidence supports Khorasan flour in both locales. Keep Kamut outside generic aliases. [S01–S04] |

The identity is `FLOUR_AND_STARCH`, separate from the general `durum flour` identity. Whole, white,
sifted, enriched, organic, and brand-specific products remain grades or product attributes outside
this general row. No density, measurement, conversion, form, or substitution data was activated.

## Source register

Sources were accessed on 2026-10-06.

- **S01 — OQLF, blé khorasan:** [Grand dictionnaire terminologique entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26533000/ble-khorasan). Gives preferred `blé khorasan`, English `Khorasan wheat`, and *Triticum turanicum*; defines it as an ancient variety of durum wheat. Marks `Kamut` and `blé Kamut` as trademarks. This supports the distinct wheat identity and alias boundary, not the flour form by itself.
- **S02 — Québec Food Directory, La Milanaise Khorasan flour:** [Product page](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8201408). The same product is named `Organic Unbleached White Khorasan Flour` and `Farine de Khorasan blanche non blanchie biologique` in the bilingual directory. Only the general flour identity and names are used; white/unbleached, organic, enrichment, nutritional, and performance details are not imported.
- **S03 — La Milanaise, Organic Whole Khorasan Flour:** [English product page](https://lamilanaise.com/en/produits/organic-whole-khorasan-flour/). The product heading corroborates the English flour identity. Whole-grain and organic qualifiers are not imported.
- **S04 — La Milanaise, farine de khorasan entière biologique:** [French product page](https://lamilanaise.com/produits/farine-de-khorasan-entiere-biologique/). The product heading corroborates the Québec French flour name. Whole-grain and organic qualifiers are not imported.

## Integration and verification

Added `ingredient-ref-khorasan-flour` to the canonical seed and evidence ledger as an identity-only
reference with identity state `verified`. The reference JSON has 306 rows (SHA-256
`0259a6499ee6bac49dec93431ea5c6833fba935a486a3dbd818fe98e0ea12f4c`); the evidence ledger has 456
records (SHA-256 `a9787d308e06fc4bdcbd95314397843421ea3d2d75f1da413dbd07481813e7d8`).

`:app:testDebugUnitTest` passed all 201 unit tests. Pixel 9a / Android 16 instrumentation reported 26
tests: 24 passed, zero failures/errors, and two environment-gated skips. All 9 Python package tests,
reference/package normalization and validation, generated-index freshness, ledger schema validation,
alias-collision checks, UTF-8/no-BOM checks, and `git diff --check` passed. The deploy script's test
and debug assembly tasks passed and installed/launched the build.

Live Pixel 9a picker search `khorasan flour` returned only Khorasan flour. Accent/punctuation-folded
French query `farine de khorasan` also returned only Khorasan flour. Trademark query `kamut` returned
no Khorasan result. Screenshots: `pixel9a-khorasan-flour-picker.png`,
`pixel9a-farine-de-khorasan-picker.png`, and `pixel9a-kamut-not-khorasan-flour-picker.png`. The
unsaved editor probe was discarded and the home screen still showed 114 recipes.

## Remaining work

- Obtain independent bilingual Québec French review of the display and trademark boundary.
- Keep the flour identity distinct from WP03 grain/form review and keep remaining A4 grade and milling distinctions open.
