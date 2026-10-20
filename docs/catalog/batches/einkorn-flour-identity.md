# WP02 Einkorn Flour Identity (Section 04 A4)

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Integrate einkorn flour with a Québec French display and keep it distinct from spelt. Avoid inferring flour grade, measurement, or substitutions from product-specific pages.
- **Input revision:** repository `HEAD` `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4`; pre-integration reference JSON SHA-256 `1743e36345c4dde1fb95bc465b1723fc1093fcff70be041fb0966859a85457c2` (303 references); pre-integration evidence-ledger SHA-256 `4af722d2d01fb0bb9eeb06a3b29590354bed5e91fb8e996e5c2c0632b83c0444` (453 records); plan snapshot SHA-256 `420936edfc84de5d882526583e469dbc11bf73a8c14dd38613387a1e65b63915`.
- **Recipe audit:** no bundled recipe ingredient line contains einkorn, petit épeautre, or engrain; no recipe line was relinked.
- **Dependencies:** WP01 identity/evidence contract; WP02 A4 flour review; WP10 canonical seed integration.

## Identity decision

| Stable ID | English / fr-CA display | Active aliases | Evidence and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-einkorn-flour` | einkorn flour / farine de petit épeautre | None | La Milanaise uses the bilingual product pair and explicitly says einkorn/petit épeautre is distinct from spelt/épeautre. Do not alias to spelt; keep the unqualified grain name `engrain` outside the flour aliases. [S01–S03] |

The identity is `FLOUR_AND_STARCH` with null density and empty unit mappings. The source pages qualify their products as whole and organic; those qualifiers are not imported into this general identity. No `engrain`, `farine d’engrain`, or whole-grain alias is activated. No density, measurement, conversion, form, or substitution data was added.

## Source register

Sources were accessed on 2026-10-06.

- **S01 — La Milanaise, farine de petit épeautre entière biologique:** [French product page](https://lamilanaise.com/produits/farine-de-petit-epeautre-entiere-biologique/). Uses `farine de petit épeautre`, says it is also called engrain, and explicitly distinguishes it from épeautre despite their similar names. Whole-grain, organic, nutritional, and baking-performance claims are not imported.
- **S02 — La Milanaise, Organic Whole Einkorn Flour:** [English product page](https://lamilanaise.com/en/produits/organic-whole-einkorn-flour/). Pairs the English name with the French product and states that einkorn and spelt are not related. Whole-grain and product-specific claims are not imported.
- **S03 — Québec Food Directory, organic einkorn flour:** [MAPAQ product entry](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8203721). Lists `Farine de petit épeautre Biologique` in French and `Organic Einkorn Flour` in English; the page credits product data to GS1. Used as market-terminology corroboration, not measurement evidence.

## Integration and verification

- Added `ingredient-ref-einkorn-flour` to the canonical seed and evidence ledger as an identity-only reference with identity state `verified`.
- Reference JSON: 304 rows, SHA-256 `f0b792cdfb055438274a3b528f0c38aa610be4a2b3944a22692f8141396d21f5`. Evidence ledger: 454 records, SHA-256 `52d0fc25759ec034cde8a97f3fd62508207cd562b3ed5bd3ee1e1ec397db4e0c`.
- `:app:testDebugUnitTest` passed all 201 tests. Pixel 9a / Android 16 instrumentation reported 26 cases: 24 passed, zero failures/errors, and two environment-gated skips.
- All 9 Python package tests, reference/package normalization and validation, generated-index freshness, evidence-ledger schema validation, alias-collision checks, UTF-8/no-BOM checks, and `git diff --check` passed.
- The deploy script's `test` and `:app:assembleDebug` tasks passed and installed/launched the build.
- Live picker search `einkorn flour` returned only einkorn flour. The accent-folded French query `farine de petit epeautre` returned only einkorn flour. Generic `epeautre` returned both einkorn flour and spelt flour, keeping their shared wording searchable without merging the identities.
- Screenshots: `pixel9a-einkorn-flour-picker.png`, `pixel9a-farine-de-petit-epeautre-picker.png`, and `pixel9a-epeautre-flour-family-picker.png`. The unsaved probe was discarded and the home screen still showed 114 recipes.

## Remaining work

- Obtain independent bilingual Québec French review of the display and identity boundary.
- Continue A4 extraction/grind research for rye, spelt, emmer, khorasan, barley, oat, and rice flours.
