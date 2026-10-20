# WP02 Section A7 Wheat Bran and Wheat Germ Identities

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Integrate wheat bran and wheat germ as distinct, source-backed milling-fraction identities. This checkpoint does not close Section A7 or add measurement, conversion, form, or substitution data.

## Identity decisions

| Stable ID | English / fr-CA display | Aliases | Category and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-wheat-bran` | wheat bran / son de blé | None | `GRAIN_AND_CEREAL`; a wheat milling fraction, distinct from whole-wheat flour and intact wheat grain. [S98, S100] |
| `ingredient-ref-wheat-germ` | wheat germ / germe de blé | None | `GRAIN_AND_CEREAL`; the wheat-kernel embryo, distinct from bran and whole-wheat flour. [S99, S100] |

The category is an existing model value. The OQLF records support the English and Québec French
names, while a Canadian French product list presents both as separate named products. Neither
source establishes a universal alias set, measurement, density, or substitution, so none was added.
The records have null density and empty unit mappings; no forms or recipe links were added.

## Source register

- **S98 — OQLF, son de blé:** [Québec terminology entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18097318/son-de-ble).
  Pairs the preferred French term `son de blé` with English `wheat bran`. Used for naming only.
- **S99 — OQLF, germe de blé:** [Québec terminology entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432763/germe-de-ble).
  Defines `germe de blé` as the wheat-kernel embryo, notes that milling removes it from flour, and
  gives `wheat germ` as the English term. Used for identity and naming only.
- **S100 — Bob’s Red Mill, 2026 Canadian French Product List, pages 28–29:** [Canadian French product list](https://bobs-ebooks.cld.bz/Bob-s-Red-Mill-Canadian-French-Product-List/28-29/).
  Lists `Son de blé / Wheat Bran` and `Germe de blé / Wheat Germ` separately. Used to corroborate
  bilingual market labels, not product composition, numeric data, or behavior.

The three source records are also attached to the corresponding ingredient-reference entries in
`docs/catalog/research-ledger.v1.json` as `WP02-S98` through `WP02-S100`.

## Recipe and package audit

All 114 bundled recipe JSON files were parsed and recursively checked for whole-word English and
French names, including unaccented `son de ble` and `germe de ble`. No match was found, so no recipe
line was relinked. The fingerprint of the audited recipe snapshot is
`558a9ca9b1334e8039709aa2954b7a3a5451513ba55c5fa873189fe8cf6df282` (sorted filename, NUL, file
bytes, NUL).

At this bran/germ checkpoint, before the later cracked-wheat follow-up, the canonical package had
326 references (SHA-256
`fa6c4b9df4d53515d6926bf9865ccff5e03bc4db5ee70348354c26ea11cb55bb`). The research ledger had 480
records (SHA-256 `5c291c42f980d159ff748560e93e8b64c4db0b92fd62b5e0b54b49bd820d2195`). Both new rows
remain identity-only. The current 327-reference package and 481-record ledger are recorded in
`cracked-wheat-identity.md`.

## Verification

- All 230 Android unit tests and all 9 Python seed-package tests passed. Bundled-package validation,
  generated-index freshness, ledger schema and alias-collision validation, UTF-8/no-BOM and escaped
  Unicode audit across 125 bundled JSON files, and `git diff --check` passed.
- `tools/deploy_to_pixel9a_emulator.sh` passed its Gradle `test` and debug-assembly steps and
  installed/launched `MainActivity` on Android 16 / API 36 at 1080×2424.
- In the English picker, `wheat bran` and `wheat germ` each returned one matching result. With the
  app in French, accent-folded `son de ble` and `germe de ble` each returned one result with the
  displayed labels `son de blé` and `germe de blé`. The unsaved draft was discarded; the French
  home still showed 114 recipes.
- Screenshots: [English wheat bran](pixel9a-wheat-bran-picker-en.png),
  [English wheat germ](pixel9a-wheat-germ-picker-en.png),
  [French wheat bran](pixel9a-wheat-bran-picker-fr-ca.png),
  [French wheat germ](pixel9a-wheat-germ-picker-fr-ca.png), and
  [French home with 114 recipes](pixel9a-wheat-bran-germ-home-fr-ca.png).

## Remaining work

- Keep the umbrella A7 review open for other grain meal, wheat starch boundaries, malted flour,
  vital wheat gluten, and toasted flour. Cracked wheat is covered separately in
  `cracked-wheat-identity.md`.
- Obtain independent bilingual Québec French review of both display names and their category.
- Research measurements and substitutions separately; identity sources above do not support them.
