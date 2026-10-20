# WP03 long-grain rice identity

- **Reviewed:** 2026-10-07
- **Status:** identity integrated and verified on Pixel 9a; independent Québec French terminology review remains open.
- **Scope:** generic long-grain rice class only. No recipe lines, forms, measurements, conversions, yields, or substitutions are added.

## Integrated reference

| ID | English | fr-CA | Alias | Category | Boundary |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-long-grain-rice` | long-grain rice | riz à grain long | `riz à grains longs` (French only) | `GRAIN_AND_CEREAL` | Grain-length class, not a preparation state. Keep basmati and jasmine separate; do not add blends, a universal numeric cutoff, or generic rice forms. |

The English spelling `long grain rice` is not stored as an alias because catalog normalization removes the hyphen and makes it identical to the display key. Health Canada's dry and cooked records support wording for specific white, regular long-grain products; they do not add state forms or measurements to this row. The generic `rice / riz` identity continues to own dry and cooked forms.

## Evidence and naming limits

OQLF directly pairs *long-grain rice* with *riz à grain long* and lists *riz à grains longs* as a preferred French variant [WP03-S106]. OQLF describes the kernels qualitatively as much longer than wide and notes their cooked texture. Codex recognizes long-, medium-, and short-grain rice and gives explicit ratios and lengths under three alternative classification options; traders indicate which criterion they use [WP03-S107]. The catalog therefore stores no single numeric threshold. Health Canada's CNF supplies bilingual labels for white regular long-grain rice, dry and cooked [WP03-S108–S109]; those records support product wording only.

Do not alias basmati, jasmine, long-grain-and-wild-rice blends, or white/brown and dry/cooked variants. Those describe separate types, blends, milling qualifiers, or preparation states. No density, unit mappings, conversions, yield, measurement, or substitution data are supported here.

## Recipe and collision audit

The normalized-key audit covered 354 active ingredient references and 16 forms. It found no exact display/alias collision. The French alias *riz à grains longs* remains distinct from the display key; the unhyphenated English spelling normalizes to the English display. The 114 bundled recipe files contain no long-grain rice line, so no recipe link or quantity changed.

## Verification record

- At integration, the package had 354 references and 16 forms and the ledger had 519 records. The subsequent medium-grain verification checkpoint had 356 references, 16 forms, 114 recipes, and 521 ledger records.
- Seed package validation, reference normalization, generated Kotlin catalog freshness, research-ledger schema validation, `git diff --check`, and 9 Python package tests pass. Android unit tests pass (253 tests); Pixel 9a API 36 connected instrumentation passes (29 tests, 2 existing skips).
- Pixel 9a picker results: `long-grain rice` → `long-grain rice`; French search `riz a grain long` → `riz à grain long`. The English and French searches return the dedicated grain-length class. Recipe 040 remains `6 cups crispy rice cereal` in English and `6 tasses céréales de riz croustillantes` in French.
- Final SHA-256: ingredient references `7f3ecdd18de4d3c7f932618ab9efbfb39dc36349471da794f0da68f4e9de9bee`; forms `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a`; manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; research ledger `8b37c220a7f8665dc72cf0df141dc45ae963a867180ab500fc49b08cf8ae6671`; generated Kotlin catalog `ab124930e7267bcd8913350dc305f6773ae8d6ea9c75204c50ca3c8d66adf1ba`.
- Picker screenshots: [long-grain EN](screenshots/picker-long-grain-en.png) and [long-grain fr-CA](screenshots/picker-long-grain-fr.png). Recipe 040 boundary screenshots: [EN](screenshots/recipe-040-crispy-rice-cereal-en.png) and [fr-CA](screenshots/recipe-040-crispy-rice-cereal-fr-ca.png).

## Sources

- **WP03-S106 — OQLF, [riz à grain long](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354928/riz-a-grain-long):** direct English/French pair, grain-length class, and preferred French variant.
- **WP03-S107 — Codex Alimentarius, [Standard for Rice CXS 198-1995](https://www.fao.org/input/download/standards/61/CXS_198e.pdf):** long-, medium-, and short-grain classes with alternative classification criteria; no single universal cutoff.
- **WP03-S108 — Health Canada CNF, [white long-grain rice, dry](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4471):** bilingual product wording; no serving or conversion values imported.
- **WP03-S109 — Health Canada CNF, [white long-grain rice, cooked](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4523):** bilingual product wording; no cooked form added to the new identity.
