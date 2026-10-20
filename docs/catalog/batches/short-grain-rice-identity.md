# WP03 short-grain rice identity

- **Reviewed:** 2026-10-07
- **Status:** identity integrated and verified on Pixel 9a; independent Québec French terminology review remains open.
- **Scope:** generic short-grain rice class only. No recipe lines, forms, measurements, conversions, yields, or substitutions are added.

## Integrated reference

| ID | English | fr-CA | Alias | Category | Boundary |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-short-grain-rice` | short-grain rice | riz à grain court | `riz à grains courts` (French only) | `GRAIN_AND_CEREAL` | Grain-length class, not a preparation state. Keep glutinous rice, sushi rice, Arborio, Bomba, and Calrose separate. Do not add a universal numeric cutoff or generic rice state forms. |

The English spelling `short grain rice` is not stored as an alias because catalog normalization removes the hyphen and makes it identical to the display. The generic `rice / riz` identity continues to own dry and cooked forms. Health Canada's specific dry-food label is wording evidence only.

## Evidence and naming limits

OQLF directly pairs *short-grain rice* with *riz à grain court* and lists *riz à grains courts* as a preferred French variant [WP03-S110]. Codex recognizes short-grain rice and gives explicit ratios and lengths under three alternative classification options; traders indicate which criterion they use [WP03-S111]. The catalog therefore stores no single numeric threshold. Codex treats glutinous rice separately, and named products such as sushi rice, Arborio, Bomba, and Calrose are not aliases of this general class.

Health Canada's CNF supplies a bilingual label for white short-grain rice, dry [WP03-S112]. It supports wording for that specific product; it does not establish generic measurements, state forms, or a conversion. No density, unit mappings, yield, measurement, or substitution data are added.

## Recipe and collision audit

The normalized-key audit covered 355 active ingredient references and 16 forms. It found no exact display/alias collision. Both English spellings normalize to the display; the French plural variant remains a distinct key. The 114 bundled recipe files contain no short-grain rice line, so no recipe link or quantity changed.

## Verification record

- At integration, the package had 355 references and 16 forms and the ledger had 520 records. The subsequent medium-grain verification checkpoint had 356 references, 16 forms, 114 recipes, and 521 ledger records.
- Seed package validation, reference normalization, generated Kotlin catalog freshness, research-ledger schema validation, `git diff --check`, and 9 Python package tests pass. Android unit tests pass (253 tests); Pixel 9a API 36 connected instrumentation passes (29 tests, 2 existing skips).
- Pixel 9a picker results: `short-grain rice` → `short-grain rice`; French search `grain court` → `riz à grain court`. The English and French searches return the dedicated grain-length class. Recipe 040 remains `6 cups crispy rice cereal` in English and `6 tasses céréales de riz croustillantes` in French.
- Final SHA-256: ingredient references `7f3ecdd18de4d3c7f932618ab9efbfb39dc36349471da794f0da68f4e9de9bee`; forms `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a`; manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; research ledger `8b37c220a7f8665dc72cf0df141dc45ae963a867180ab500fc49b08cf8ae6671`; generated Kotlin catalog `ab124930e7267bcd8913350dc305f6773ae8d6ea9c75204c50ca3c8d66adf1ba`.
- Picker screenshots: [short-grain EN](screenshots/picker-short-grain-en.png) and [short-grain fr-CA](screenshots/picker-short-grain-fr.png). Recipe 040 boundary screenshots: [EN](screenshots/recipe-040-crispy-rice-cereal-en.png) and [fr-CA](screenshots/recipe-040-crispy-rice-cereal-fr-ca.png).

## Sources

- **WP03-S110 — OQLF, [riz à grain court](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354929/riz-a-grain-court):** direct bilingual grain-length term and preferred French variant.
- **WP03-S111 — Codex Alimentarius, [Standard for Rice CXS 198-1995](https://www.fao.org/input/download/standards/61/CXS_198e.pdf):** short-grain class with alternative classification options; no universal numeric cutoff.
- **WP03-S112 — Health Canada CNF, [white short-grain rice, dry](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4476):** bilingual product wording only; no serving or conversion values imported.
