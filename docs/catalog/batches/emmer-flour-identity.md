# WP02 Emmer Flour Identity (Section 04 A4)

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Integrate general emmer flour with an OQLF-supported Québec French name. Keep emmer distinct from generic wheat, spelt, and einkorn; do not infer grade, measurement, or substitution from product pages.
- **Input revision:** repository `HEAD` `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4`; pre-integration reference JSON SHA-256 `f0b792cdfb055438274a3b528f0c38aa610be4a2a3944a22692f8141396d21f5` (304 references); pre-integration evidence-ledger SHA-256 `52d0fc25759ec034cde8a97f3fd62508207cd562b3ed5bd3ee1e1ec397db4e0c` (454 records); plan snapshot SHA-256 `9f04212526d98dfa84c083ad59f06c360fdd67f4e9d99c3ed3fdab5f90184202`.
- **Recipe audit:** no bundled recipe ingredient line contains emmer, amidonnier, or farro; no recipe line was relinked.
- **Dependencies:** WP01 identity/evidence contract; WP02 A4 flour review; WP03 cereal-grain review; WP10 canonical seed integration.

## Identity decision

| Stable ID | English / fr-CA display | Active aliases | Evidence and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-emmer-flour` | emmer flour / farine d'amidonnier | None | OQLF maps `amidonnier` to English `emmer` and identifies *Triticum dicoccum*. Canadian and French-language mills list corresponding flour products. Keep unqualified `farro` outside the flour aliases because its grain-versus-flour use remains under WP03 review. [S01–S03] |

The identity is `FLOUR_AND_STARCH` with null density and empty unit mappings. Product pages qualify their flours as whole or mi-blanche; those grades, organic labels, and baking claims are not imported into this general identity. No `farro`, cultivar, whole-grain, density, measurement, conversion, form, or substitution data was activated.

## Source register

Sources were accessed on 2026-10-06.

- **S01 — OQLF, amidonnier:** [Grand dictionnaire terminologique entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10487378/amidonnier). Pairs French `amidonnier` with English `emmer`, supplies the Latin taxon *Triticum dicoccum*, and lists `farro` as an acceptable term for the cereal. It supports identity and Québec terminology, not an unqualified flour form.
- **S02 — Arva Flour Mill, Organic Whole Emmer Flour:** [Ontario mill product page](https://arvaflourmills.com/products/whole-emmer-flour). The mill sells a named emmer-flour product. Its whole-grain, organic, process, nutrition, and performance details are not imported.
- **S03 — Biofarm, farine d'amidonnier mi-blanche:** [French-language flour product page](https://biofarm.ch/fr/emmerhalbweissmehl-ch-16760-g). Uses the French flour name and identifies amidonnier as its ingredient. Swiss origin, mi-blanche milling grade, organic label, nutrition, and baking claims are not imported.

## Integration and verification

- Added `ingredient-ref-emmer-flour` to the canonical seed and evidence ledger as an identity-only reference with identity state `verified`.
- Reference JSON: 305 rows, SHA-256 `4f5c15ddb40e85dfc543af264c43062668ce5419313843862fd798e75df86145`. Evidence ledger: 455 records, SHA-256 `dc9d0b657bc13cc83d5b627ec3e1318a86e243ef13e61034550b078f478d1697`.
- `:app:testDebugUnitTest` passed all 201 tests. Pixel 9a / Android 16 instrumentation reported 26 cases: 24 passed, zero failures/errors, and two environment-gated skips.
- All 9 Python package tests, reference/package normalization and validation, generated-index freshness, evidence-ledger schema validation, alias-collision checks, UTF-8/no-BOM checks, and `git diff --check` passed.
- The deploy script's `test` and `:app:assembleDebug` tasks passed and installed/launched the build.
- Live picker search `emmer flour` returned only emmer flour. Accent-folded French query `farine d amidonnier` returned only emmer flour. Unqualified `farro` returned no flour result, preserving the separate grain/form review.
- Screenshots: `pixel9a-emmer-flour-picker.png`, `pixel9a-farine-d-amidonnier-picker.png`, and `pixel9a-farro-not-emmer-flour-picker.png`. The unsaved probe was discarded and the home screen still showed 114 recipes.

## Remaining work

- Obtain independent bilingual Québec French review of the display and grain/flour boundary.
- Resolve unqualified farro grain/form identity in WP03; keep that decision separate from the accepted emmer-flour identity.
- Continue A4 extraction/grind research for rye, spelt, einkorn, khorasan, barley, oat, and rice flours.
