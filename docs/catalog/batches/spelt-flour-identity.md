# WP02 Spelt Flour Identity (Section 04 A4)

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Integrate general spelt flour with English and Québec French displays. Keep small spelt/einkorn, extraction grades, whole-grain products, and product-specific milling claims distinct and unresolved.
- **Input revision:** repository `HEAD` `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4`; pre-integration reference JSON SHA-256 `f3b10cbe28cee065a339bc215e617a0217322d451d4e24dc6cf370cad3063a41` (302 references); pre-integration evidence-ledger SHA-256 `4281b713779da258a08b98ea7a83d220f17ab713c6bb324c03aaa765897feacb` (452 records); plan snapshot SHA-256 `c731dea4267b6959235ef64e1d04938ef253410ecad2bc444e6f89f32c9ba6cd`.
- **Recipe audit:** no bundled recipe ingredient line contains spelt, épeautre, einkorn, engrain, or petit épeautre; no recipe line was relinked.
- **Dependencies:** WP01 identity/evidence contract; WP02 A4 flour review; WP10 canonical seed integration.

## Identity decision

| Stable ID | English / fr-CA display | Active aliases | Evidence and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-spelt-flour` | spelt flour / farine d'épeautre | None | OQLF pairs `épeautre` with English `spelt`, and a Québec catalog uses the bilingual flour product names. The Québec Food Directory identifies `petit épeautre` as `engrain`; do not activate it as a spelt alias. [S01–S03] |

The identity is `FLOUR_AND_STARCH` with null density and empty unit mappings. No alias to whole-wheat flour, einkorn flour, or small-spelt flour was added. Whole, white, extraction, and grind classes remain outside the general identity pending separate review. No density, measurement, conversion, form, or substitution data was activated.

## Source register

Sources were accessed on 2026-10-06.

- **S01 — OQLF, épeautre:** [Grand dictionnaire terminologique entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354125/epeautre). Gives `spelt` as the English equivalent and identifies the botanical taxon *Triticum aestivum* subsp. *spelta*.
- **S02 — AGROBIO, 2023 product catalog:** [Québec product catalog (PDF)](https://www.coopagrobioquebec.com/wp-content/uploads/2023/05/catalogue-2023.pdf), page 5. Uses `FARINE D’ÉPEAUTRE` for a Québec-grown flour and a bilingual bag label pairs it with `ORGANIC SPELT FLOUR`. Organic, milling, nutrition, and package details are not imported.
- **S03 — Québec Food Directory, organic small-spelt flour:** [MAPAQ product entry](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8203721). Names the product `Farine de petit épeautre` and describes `petit épeautre` as `engrain`; this is recorded as a distinct naming boundary, not an alias.

The sources support identity and terminology only. Product-specific nutrition or package observations were not used as conversion evidence.

## Integration and verification

- Added `ingredient-ref-spelt-flour` to the canonical seed and evidence ledger as an identity-only reference with identity state `verified`.
- Reference JSON: 303 rows, SHA-256 `1743e36345c4dde1fb95bc465b1723fc1093fcff70be041fb0966859a85457c2`. Evidence ledger: 453 records, SHA-256 `4af722d2d01fb0bb9eeb06a3b29590354bed5e91fb8e996e5c2c0632b83c0444`.
- `:app:testDebugUnitTest` passed all 201 tests. Pixel 9a / Android 16 instrumentation reported 26 cases: 24 passed, zero failures/errors, and two environment-gated skips.
- All 9 Python package tests, reference/package normalization and validation, generated-index freshness, evidence-ledger schema validation, alias-collision checks, UTF-8/no-BOM checks across 124 bundled JSON files, and `git diff --check` passed.
- The deploy script's `test` and `:app:assembleDebug` tasks passed and installed/launched the build. Live picker search `spelt flour` returned only spelt flour. The French-name search `farine d epeautre` returned only spelt flour; the emulator shell accepted an accent-folded ASCII query, while unit fixtures verify `farine d'épeautre` and its unaccented form `farine d'epeautre` directly.
- Android reported one transient ANR during the first manual ADB input attempt in the unsaved editor. The Pixel 9a AVD was restarted, and both picker searches succeeded on retry; no probe was saved.
- Screenshots: `pixel9a-spelt-flour-picker.png` and `pixel9a-farine-d-epeautre-picker.png`. The unsaved probe was dismissed; the home screen still showed 114 recipes.

## Remaining work

- Obtain independent bilingual Québec French review of the display and identity boundary.
- Review useful spelt extraction/grind classes separately from einkorn, emmer, khorasan, and rye flour.
