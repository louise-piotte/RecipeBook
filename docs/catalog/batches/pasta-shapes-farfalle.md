# WP03 Section G farfalle identity

- **Reviewed:** 2026-10-07
- **Status:** one identity-only shape integrated and verified on the Pixel 9a / Android 16 emulator.
- **Owner:** WP03 identity research; WP10 catalog integration lead for canonical IDs, seed merge, and validation.
- **Scope:** farfalle as a pasta shape. No specific grain composition, dry/fresh/cooked form, measurement, density, yield, conversion, substitution, or recipe link is inferred.

## Acceptance checks

- [x] Use the OQLF pasta-shape definition and preferred English and Québec French label.
- [x] Add French plural `farfalles` and the narrower English alias `bow tie pasta`.
- [x] Keep broad terms `bow tie`, `butterfly`, `boucle`, and `papillon` out of stored aliases as a catalog false-match judgment; OQLF itself lists these as terms for the shape.
- [x] Assign `GRAIN_AND_CEREAL` as the project's existing category for pasta shapes without asserting grain composition.
- [x] Leave measurements, forms, yields, conversions, substitutions, and recipe links unset.
- [x] Independently audit the Québec French label and alias boundary.
- [x] Scan all 114 bundled recipe ingredient lines and normalized catalog keys; no ingredient use or collision was found.
- [x] Validate the normalized 374-reference package, generated Kotlin index, 544-record ledger, unit tests, and Pixel 9a emulator behavior.

## Integrated reference

| ID | English | fr-CA | Aliases | Category | Identity boundary |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-farfalle` | farfalle | farfalle | FR: `farfalles`; EN: `bow tie pasta` | `GRAIN_AND_CEREAL` | OQLF-defined pasta shaped like a small bow tie with serrated edges. Category follows the project’s pasta classification and does not assert a specific grain. |

OQLF gives `farfalle` as the preferred French and English term, and records the French plural `farfalles`. It defines the product as pasta shaped like a small bow tie with serrated edges. The English term `bow tie pasta` is active as the most specific English alternative. OQLF also lists `bow tie`, `butterfly`, `boucle`, and `papillon`; those broad common words are omitted as a conservative catalog choice to reduce false matches, not because the source excludes them.

An independent Québec terminology reviewer confirmed the labels and aliases and noted that the broad terms are source-listed. The `GRAIN_AND_CEREAL` assignment follows the project’s existing pasta-shape classification; the source does not establish grain composition. No forms or numeric data are added.

## Recipe and collision audit

All 114 bundled recipe ingredient lines were scanned; none requests farfalle or its active aliases. The normalized exact keys for `farfalle`, `farfalles`, and `bow tie pasta` have no collision with another reference. The broad English query `pasta` returns the generic pasta row and farfalle because its specific English alias contains that word; this follows the searcher's existing word-phrase behavior. The qualified queries `farfalle` and `bow tie pasta` resolve to the intended shape. No recipe was relinked.

## Source

- **WP03-S174 — OQLF, [farfalle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2094730/farfalle):** pasta-shape definition, preferred French and English terms, French plural, and English alternatives.

## Verification record

Verified on 2026-10-07 with the isolated Pixel 9a AVD (`emulator-5556`, Android 16 / API 36). Seed-package normalization, generated-index freshness, JSON Schema validation of the 544-record research ledger, UTF-8/no-BOM and mojibake checks, and `git diff --check` passed. All 125 bundled seed JSON files parsed and contained escaped Unicode without a BOM. The 9 Python seed-package tests and 268 Android unit tests passed. The deploy script's full Gradle `test` task, debug APK assembly, installation, and launch passed. Connected instrumentation's XML report shows 29 cases: 27 passed, 2 skipped, and 0 failures; the runner log reported an inconsistent total, so the XML report is recorded here.

English picker search for `farfalle` returned one matching row. In French app mode, `farfalles` returned one canonical `farfalle` row. The temporary draft was discarded without selecting an ingredient or saving a recipe, and the app returned to the French home with 114 recipes. `app.recipebook` remained installed on the isolated `emulator-5556`; the original `emulator-5554` had no package installed.

Pixel screenshots and SHA-256:

- [English farfalle picker](pixel9a-farfalle-picker-en.png) — `ae90aca9efffccc57c67cd1add011d1c2a6949f4703d13c72bf441a1326db5db`
- [French farfalle picker](pixel9a-farfalle-picker-fr-ca.png) — `5d21186fbd4a428be30b196f53cfef9ec374d41de69d1d0811ff3e5a460fa24f`
- [Final French library home](pixel9a-farfalle-home-fr-ca-114.png) — `f72d0bd9fa11a64a92e54ebf58ebb5c616cb67cecfca5583a22e187ab71f249b`

Final artifact hashes:

- Ingredient references (374 rows): `99a102e7403636c8f01195694c3bb7760a1a2a8894911cc12b1579980e28e354`
- Generated Kotlin catalog: `1a981ad246b9b343fb009ebd6d368da9dfdbe925c52f1426f4c53ffff76a4ba7`
- Research ledger (544 records): `55b377a806a05ec8117f33b6f2335b6c66e18e123e4ddf93c3bd9f27e2f2fa80`
- Debug APK: `f9f3ba158892b6b4d66c726c54e39d7884903bbc9e446e0029a30106498c0317`

Identity implementation is complete for farfalle. Broader Section F/G candidates and the global independent terminology review remain open.
