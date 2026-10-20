# WP03 medium-grain rice identity

- **Reviewed:** 2026-10-07
- **Status:** identity integrated and verified on Pixel 9a; independent Québec French terminology review remains open.
- **Scope:** generic medium-grain rice class only. No recipe lines, forms, measurements, conversions, yields, or substitutions are added.

## Integrated reference

| ID | English | fr-CA | Alias | Category | Boundary |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-medium-grain-rice` | medium-grain rice | riz à grain moyen | `riz à grains moyens` (French only) | `GRAIN_AND_CEREAL` | Grain-length class, not cultivar or preparation state. Keep Calrose, Arborio, Carnaroli, sushi rice, glutinous rice, and generic rice state forms separate. Do not store a universal numeric cutoff. |

The English spelling `medium grain rice` is not an alias because search normalization removes the hyphen and makes it identical to the display key. OQLF's preferred French plural is the sole alias. The row has null density, empty English aliases and unit mappings, and no forms or numerical data.

## Evidence and naming limits

OQLF directly pairs *medium-grain rice* with *riz à grain moyen*, lists *riz à grains moyens* as a preferred French variant, and includes both hyphenated and unhyphenated English spellings [WP03-S113]. The unhyphenated English term therefore needs no stored alias.

Codex recognizes medium-grain rice and gives different length or ratio ranges under three alternative classification options; traders should indicate which option they use [WP03-S114]. OQLF's definition also describes medium kernels as twice as long as they are wide, but the catalog adopts no numeric cutoff because the applicable class depends on the selected standard. Keep named products such as Calrose, Arborio, and Carnaroli distinct; medium grain does not imply a particular cultivar, cooking state, or recipe use. Do not copy dry/cooked forms from generic `rice / riz`.

## Recipe and collision audit

The live normalized-key audit covered 355 references and 16 forms before integration. It found no exact display/alias collision; both English spellings normalize to the display, and the French plural remains distinct. All 114 bundled recipe files were scanned and none requests medium-grain rice. Existing recipe 040 continues to use its separate `crispy rice cereal` identity with the original six-cup quantity.

## Verification record

- At the medium-grain verification checkpoint, the seed had 356 references and 16 forms; the ledger had 521 records. Brown rice was integrated in the later 357-reference / 522-record checkpoint.
- Seed package validation, reference normalization, generated Kotlin freshness, research-ledger schema validation, `git diff --check`, and 9 Python package tests pass. Android unit tests pass (253 tests); Pixel 9a API 36 connected instrumentation passes (29 tests, 2 existing skips).
- Pixel 9a picker results: `medium-grain rice` → `medium-grain rice`; French search `grain moyen` → `riz à grain moyen`. The unsaved QA draft was discarded; the final French home showed all 114 recipes.
- Recipe 040 on the current build shows `6 cups crispy rice cereal` in English and `6 tasses céréales de riz croustillantes` in French. Screenshots: [medium-grain EN](screenshots/picker-medium-grain-en.png), [medium-grain fr-CA](screenshots/picker-medium-grain-fr.png), [recipe 040 EN](screenshots/recipe-040-crispy-rice-cereal-en.png), [recipe 040 fr-CA](screenshots/recipe-040-crispy-rice-cereal-fr-ca.png), and [fr-CA library home with 114 recipes](screenshots/recipebook-library-home-fr-114.png).
- Final SHA-256: ingredient references `7f3ecdd18de4d3c7f932618ab9efbfb39dc36349471da794f0da68f4e9de9bee`; forms `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a`; manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; research ledger `8b37c220a7f8665dc72cf0df141dc45ae963a867180ab500fc49b08cf8ae6671`; generated Kotlin catalog `ab124930e7267bcd8913350dc305f6773ae8d6ea9c75204c50ca3c8d66adf1ba`.
- The final UTF-8/no-BOM and mojibake scan and `git diff --check` passed. Bundled seed and ledger JSON serialize non-ASCII characters as explicit Unicode escapes.

## Sources

- **WP03-S113 — OQLF, [riz à grain moyen](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354927/riz-a-grain-moyen):** direct bilingual name, preferred French variant, English spelling variants, and descriptive grain-class definition.
- **WP03-S114 — Codex Alimentarius, [Standard for Rice CXS 198-1995](https://www.fao.org/input/download/standards/61/CXS_198e.pdf):** recognizes medium-grain rice and gives three alternative classification options; no universal cutoff is stored.
