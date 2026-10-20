# WP02 Durum Flour Identity (Section 04 A2)

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Add durum flour as the non-granular durum-wheat milling product, distinct from durum semolina and remilled durum semolina. Use official English and Québec French names; do not infer measurements or substitutions.
- **Input revision:** repository `HEAD` `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4`; pre-integration reference JSON SHA-256 `bc7ce9524ac3fc09359137bd38e1cb5deed64a0683e1d07f9c3db93812926f2d` (300 references); pre-integration ledger SHA-256 `d6905652e2a8b842bcb531a60658900e92e11f89dac6f2798420ff18b5baea0f` (450 records); plan snapshot SHA-256 `58f0c903ccb9cfd78edf06ae17d40de53fba888a8dea20128be76c2c215fb89d`.
- **Recipe audit:** no bundled recipe line contains `durum flour`, `durum wheat flour`, `farine de blé dur`, or `farine de blé durum`; no recipe line was relinked.
- **Dependencies:** WP02 A2 durum-semolina and remilled-semolina identity decisions; WP10 canonical seed integration.

## Identity decision

| Stable ID | English / fr-CA display | Active aliases | Evidence and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-durum-flour` | durum flour / farine de blé dur | EN: `durum wheat flour`; FR: `farine de blé durum` | OQLF supports both display terms and the aliases. Italian regulation describes durum flour as non-granular and durum semola as granular. Keep the flour separate from both semolina identities. [S01–S02] |

The row uses `FLOUR_AND_STARCH`, null density, and empty unit mappings. Do not use semolina or
semoule de blé dur as aliases. No protein, ash, moisture, particle-size, density, yield, unit mapping,
conversion, form, or substitution data was copied into the catalog.

## Source register

Sources were accessed on 2026-10-06.

- **S01 — Gazzetta Ufficiale, Presidential Decree 9 February 2001, No. 187:** [Article 2](https://www.gazzettaufficiale.it/atto/serie_generale/caricaArticolo?art.codiceRedazionale=001G0242&art.dataPubblicazioneGazzetta=2001-05-22&art.flagTipoArticolo=0&art.idArticolo=2&art.idGruppo=1&art.idSottoArticolo=1&art.idSottoArticolo1=10&art.progressivo=0&art.versione=1), paragraphs 1 and 4. Defines durum semola as granular and durum flour as non-granular. The legal product limits are not activated.
- **S02 — OQLF, farine de blé dur:** [Grand dictionnaire terminologique entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357377/farine-de-ble-dur). Defines the flour as made from durum-wheat kernels and lists `durum flour`, `durum wheat flour`, and the French terms `farine de blé dur` / `farine de blé durum`.

## Integration and verification

- Added `ingredient-ref-durum-flour` to the canonical seed and research ledger with identity state `verified`; no measurement or substitution evidence was activated.
- Search fixtures cover both English terms and both Québec French terms; tests also assert that durum flour remains separate from durum semolina and remilled durum semolina.
- `:app:testDebugUnitTest` passed all 201 tests. Pixel 9a / Android 16 instrumentation reported 26 cases: 24 passed, zero failures/errors, and two environment-gated skips.
- All 9 Python seed-package tests, reference/package normalization and validation, generated-index freshness, ledger schema and alias-collision checks, UTF-8/no-BOM checks across 124 bundled JSON files, and `git diff --check` passed.
- The deploy script's `test` and `:app:assembleDebug` tasks passed; the APK installed and launched on the Pixel 9a emulator.
- Live picker searches `durum flour` and `durum wheat flour` each returned only `durum flour`. The family search `durum` returned three distinct rows: `durum flour`, `durum semolina`, and `remilled durum semolina`. The empty probe was dismissed without saving, and the home list still showed 114 recipes.
- Screenshots: `pixel9a-durum-flour-picker.png`, `pixel9a-durum-wheat-flour-picker.png`, and `pixel9a-durum-family-picker.png` in this directory.

## Remaining work

- Obtain independent bilingual Québec French review of the display and alias terms.
- Continue remaining regional wheat-flour and other A1–A7 review.
