# WP03 Section G fusilli identity

- **Reviewed:** 2026-10-07
- **Status:** one identity-only pasta shape integrated and verified on the Pixel 9a / Android 16 emulator; independent Québec terminology review and recipe/key audits completed.
- **Owner:** WP03 identity research; WP10 catalog integration lead for canonical IDs, seed merge, and validation.
- **Scope:** fusilli as short, spiral-shaped pasta. No grain, egg, fresh/dry/cooked state, measurement, density, yield, conversion, substitution, or recipe use is inferred.

## Acceptance checks

- [x] Use OQLF's preferred French and English label `fusilli` and French plural `fusillis`.
- [x] Keep `spirale` out of stored aliases as a catalog false-match judgment; OQLF notes it is sometimes used for this shape.
- [x] Assign `GRAIN_AND_CEREAL` as the project's existing category for pasta shapes without inferring composition.
- [x] Leave forms, measurements, density, yields, conversions, substitutions, and recipe links unset.
- [x] Complete an independent Québec terminology review and audit normalized catalog keys and all 114 recipe ingredient lines.
- [x] Validate the normalized 376-reference package, generated Kotlin index, 546-record ledger, unit tests, and Pixel 9a emulator behavior.

## Integrated reference

| ID | English | fr-CA | Aliases | Category | Identity boundary |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-fusilli` | fusilli | fusilli | FR: `fusillis` | `GRAIN_AND_CEREAL` | OQLF-defined short, spiral-shaped pasta. The category follows the project's pasta grouping and does not assert grain or egg composition. |

OQLF gives `fusilli` as the preferred French and English term and says the French plural is `fusillis`. It notes that `spirale` is sometimes used for this shape. The catalog omits `spirale` as a broad common noun that describes a shape and could match unrelated products; this is a conservative matching judgment, not an OQLF exclusion.

An independent Québec terminology reviewer confirmed the same-name bilingual label and French plural, the pasta-shape boundary, and the project category. The normalized exact keys for `fusilli` and `fusillis` have no collision with another reference. All 114 bundled recipe ingredient lines were checked; none uses fusilli or its French plural. No recipe was relinked.

## Source

- **WP03-S179 — OQLF, [fusilli](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2199913/fusilli):** short spiral-shaped pasta definition, preferred French and English name, French plural, and note on the occasional term `spirale`.

## Verification record

Verified on 2026-10-07 with the isolated Pixel 9a AVD (`emulator-5556`, Android 16 / API 36, 1080 × 2424). Seed-package normalization, generated-index freshness, ledger JSON Schema validation, UTF-8/no-BOM and mojibake checks, and `git diff --check` passed. All 125 bundled JSON files parsed as UTF-8/no-BOM, with non-ASCII characters stored as escapes. The 9 Python package tests and 270 Android unit tests passed. The deploy script's full Gradle `test` task and debug APK assembly passed; the APK installed and launched. The pulled installed APK hash matched the local debug APK.

Connected instrumentation's XML report shows 29 cases: 27 passed, 2 skipped, and 0 failures. The runner log reported an inconsistent total, so the XML count is recorded here. After instrumentation, the deploy script reinstalled the app-under-test before manual QA.

The English picker search `fusilli` returned exactly one `fusilli` row. In French app mode, searching `fusillis` returned exactly one `fusilli` row. No ingredient was selected, no recipe was saved, and the blank draft was discarded. The app returned to the French home with 114 recipes.

Pixel screenshots and SHA-256:

- [English fusilli picker](pixel9a-fusilli-picker-en.png) — `72deb34ac6e467c2f16a0ea540180474c02438c98ad5d55523aac97507c661da`
- [French fusilli picker](pixel9a-fusilli-picker-fr-ca.png) — `9379e15e946ec970e2dccff8c163176d7a6fe6b360872fc9ff7921cd629e5cb5`
- [Final French library home](pixel9a-fusilli-home-fr-ca-114.png) — `9cc2be46ecf45cf910b13d5a2f0785bd85ff01bb85c0a79a12011098bf6cf71c`

Final artifact hashes:

- Ingredient references (376 rows): `fcee0edb20363d328956c7c5aa97d9327392c88c83e989b837fed2a5f2e07fa8`
- Generated Kotlin catalog: `53e3b98a3742476d57a7881a091fb951f05dd36471f572a0f4fa12bae9d1135c`
- Research ledger (546 records): `fc440827393c95a2b8978d7226783745a6c5fbdb6695590d90088ba17b772185`
- Debug and installed APK: `f63e16dd887d91d36f7ffb2271124e9484d8717ae43a3d28da1f2b5f1dc530ff`

Identity implementation is complete for fusilli. Broader Section F/G identities and the global independent terminology review remain open.
