# WP02 Semola Rimacinata Identity (Section 04 A2)

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Preserve semola rimacinata as a documented remilled durum-semolina product class with supported English and Québec French labels. Do not collapse it into generic durum semolina or infer measurement/substitution data.
- **Input revision:** repository `HEAD` `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4`; pre-integration reference JSON SHA-256 `d94c76ea2cf452183236fbf767e7b49d0e2b00173a0051143bf2b881ecd981bc` (299 references); pre-integration ledger SHA-256 `0076705f90631d3553dcc22a7efd911dc4354f0f31fdf84ee8b412bfaaf97fd4` (449 records); plan snapshot SHA-256 `f76a9e7d932ab1bb8fcc4ef30f7c9d6e628c35d115535b038701246d5402cdeb`.
- **Recipe audit:** no bundled recipe line contains `semola rimacinata`, `semolina rimacinata`, `remilled durum semolina`, or `semoule de blé dur remoulue`; no recipe line was relinked.
- **Dependencies:** WP02 A2 durum-semolina identity; WP10 canonical seed integration.

## Identity decision

| Stable ID | English / fr-CA display | Active aliases | Evidence and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-semola-rimacinata` | remilled durum semolina / semoule de blé dur remoulue | EN: `semola rimacinata`, `semolina rimacinata`; FR: `semola rimacinata` | Italian regulation permits semola to be remilled; an EU protected-product specification names semola rimacinata as extra-fine semola and distinguishes it from semolato (fine semolina). OQLF defines the base durum semolina as a coarse milling product. Québec-market French and manufacturer English sources support the displays. [S01–S06] |

Keep the existing `ingredient-ref-durum-semolina` for ordinary durum semolina. Do not assign the
unqualified terms `semolina` or `semoule de blé dur` as aliases of the remilled identity. A broad
family query can show both identities because the full localized names contain the family wording;
the exact remilled name and Italian product name resolve to the remilled identity.

The new row uses `FLOUR_AND_STARCH`, null density, and empty unit mappings. No grind measurement,
particle-size threshold, conversion, yield, form, or substitution was added. The legal product
specifications were used only to establish the identity boundary; their numeric limits were not
copied into the catalog.

## Source register

Sources were accessed on 2026-10-06.

- **S01 — Gazzetta Ufficiale, Presidential Decree 9 February 2001, No. 187:** [Article 2](https://www.gazzettaufficiale.it/atto/serie_generale/caricaArticolo?art.codiceRedazionale=001G0242&art.dataPubblicazioneGazzetta=2001-05-22&art.flagTipoArticolo=0&art.idArticolo=2&art.idGruppo=1&art.idSottoArticolo=1&art.idSottoArticolo1=10&art.progressivo=0&art.versione=1). Defines semola as a granular durum-wheat milling product and permits remilled semola and semolato for breadmaking and consumer sale. No legal numeric limits are imported.
- **S02 — European Commission, Pane di Matera PGI product specification amendment:** [French-language Official Journal notice](https://eur-lex.europa.eu/legal-content/FR/TXT/?uri=oj%3AJOC_2017_305_R_0013), 2017-09-15, point 3.2. Calls semola rimacinata `semoule extrafine` and distinguishes it from semolato (`semoule fine`) as durum-wheat products.
- **S03 — OQLF, semoule de blé dur:** [Grand dictionnaire terminologique entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432752/semoule-de-ble-dur). Defines the ordinary product as coarsely milled durum-wheat kernels and gives `durum semolina` as the English term.
- **S04 — Les Importations Olea, Vecchio Molino rice and flours:** [Québec-market product list](https://olea.ca/fr/produits-alimentaires-italiens/riz-et-farines/vecchio-molino), item GR637. Lists `Semola rimacinata` with the French label `Semoule de blé dur remoulue` for the same 10 × 1 kg item.
- **S05 — Le 5 Stagioni, Semola Rimacinata:** [Manufacturer product page](https://le5stagioni.com/en/prodotto/semola-rimacinata/). Uses the English product description `durum wheat remilled semolina`; only the product name is used here.
- **S06 — Bulk Mart, 5 Stagioni Semolina Rimacinata:** [Canadian product listing](https://bulkmart.ca/collections/pizza-flour/products/5-stagioni-semolina-rimacinata-durum-wheat-remilled-semolina-10-kg). Uses `Semolina Rimacinata` with `Durum Wheat Remilled Semolina`, supporting the English alias spelling.

## Integration and verification

- Added `ingredient-ref-semola-rimacinata` to the canonical seed and research ledger with identity state `verified`; no measurement or substitution evidence was activated.
- The existing durum-semolina identity remains separate. Search fixtures cover both the specific remilled name and the exact Italian term.
- `./gradlew :app:testDebugUnitTest --no-daemon --console=plain` passed all 201 unit tests. Connected Pixel 9a / Android 16 instrumentation reported 26 test cases, 24 passed, zero failures/errors, and two environment-gated skips.
- All 9 Python seed-package tests passed. Reference normalization, seed-package validation and normalization checks, generated-index freshness (300 references), evidence-ledger validation (450 records), alias-collision review, UTF-8/no-BOM audit (124 JSON files), and `git diff --check` passed.
- The deployment script's `test` and `:app:assembleDebug` tasks passed; it installed and launched the app on Pixel 9a / Android 16. Live queries `semola rimacinata` and `semolina rimacinata` returned only `remilled durum semolina`; `semolina` showed separate `durum semolina` and `remilled durum semolina` rows; `remoulue` returned only the remilled row.
- Screenshots: `pixel9a-semola-rimacinata-picker.png`, `pixel9a-semolina-rimacinata-picker.png`, `pixel9a-semolina-family-picker.png`, and `pixel9a-remoulue-picker.png`. The unsaved probe was discarded; the home screen remained at 114 recipes.

## Remaining work

- Obtain independent bilingual Québec French review of the retained French display and alias.
- Continue the remaining Italian/French flour-class, regional-flour, and other A1–A7 review.
