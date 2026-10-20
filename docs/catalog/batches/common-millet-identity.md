# WP03 Section F common millet identity

- **Reviewed:** 2026-10-07
- **Status:** species-specific food-grain identity integrated and verified on the Pixel 9a / Android 16 emulator; terminology, normalized-key, and recipe-line audits complete.
- **Owner:** WP03 identity research; WP10 catalog integration lead for canonical IDs, seed merge, and validation.
- **Scope:** edible cereal grain of common/proso millet (*Panicum miliaceum*). Keep it separate from generic millet, foxtail millet, pearl millet, and bird-feed products. No flour, form, measurement, density, yield, conversion, substitution, or recipe link is inferred.

## Acceptance checks

- [x] Use English `common millet`, fr-CA `millet commun`, and the English alias `proso millet`, all supported by OQLF and FAO sources.
- [x] Keep bare `millet` and `mil` out of aliases because the catalog has a generic millet identity and multiple species; do not add unsupported French `millet proso`.
- [x] Keep the row scoped to the species-qualified edible cereal grain and assign `GRAIN_AND_CEREAL` under the project taxonomy.
- [x] Leave French aliases, forms, density, unit mappings, yields, conversions, substitutions, and recipe links unset.
- [x] Complete independent Québec terminology, normalized-key, and 114-recipe ingredient-line audits.
- [x] Validate the normalized 377-reference package, generated Kotlin index, 547-record ledger, unit tests, and Pixel 9a emulator behavior.

## Integrated reference

| ID | English | fr-CA | Aliases | Category | Identity boundary |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-common-millet` | common millet | millet commun | EN: `proso millet` | `GRAIN_AND_CEREAL` | Species-qualified cereal grain of *Panicum miliaceum*. Separate from generic millet and other millet species. |

OQLF gives `millet commun` as a preferred French term and `common millet` and `proso millet` as English terms for *Panicum miliaceum*. It also lists other English alternatives and the French terms `millet` and `mil`; only `proso millet` is retained as an alias. FAO's human-nutrition publication identifies *Panicum miliaceum* as common/proso millet and describes its grain. Health Canada's cereal crop subgroup lists proso millet separately from foxtail, pearl, little, finger, and barnyard millet.

An independent Québec terminology review confirmed the preferred French label, the English alias, and the distinction from generic and other millet identities. A normalized exact-key audit found no collision for `common millet`, `millet commun`, or `proso millet`; a scan of all 114 bundled recipe ingredient lines found no use. Broad `millet` search now includes this row alongside generic millet, pearl millet, pearl millet flour, and foxtail millet. No recipe was relinked.

## Sources

- **WP03-S180 — OQLF, [millet commun](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506451/millet-commun):** preferred French term, English translations, and Latin name *Panicum miliaceum*.
- **WP03-S181 — Health Canada, [Residue Chemistry Crop Groups](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html):** lists proso millet in cereal grain subgroup 15-21E and separates it taxonomically from other millet species.
- **WP03-S182 — FAO, [Sorghum and millets in human nutrition](https://www.fao.org/4/T0818e/T0818E01.htm):** identifies *Panicum miliaceum* as proso/common millet and describes the grain in a human-nutrition source.
- **WP03-S183 — FAO, [À propos de l'Année internationale du mil 2023](https://www.fao.org/millets-2023/about/fr):** uses the French name `millet commun` for *Panicum miliaceum*.

## Verification record

Verified on 2026-10-07 with the isolated Pixel 9a AVD (`emulator-5556`, Android 16 / API 36, 1080 × 2424). Seed-package normalization, generated-index freshness, ledger JSON Schema validation, UTF-8/no-BOM and mojibake checks, and `git diff --check` passed. All 125 bundled JSON files parsed as UTF-8/no-BOM with non-ASCII characters stored as escapes. The 9 Python package tests and 271 Android unit tests passed. The deploy script's full Gradle `test` task and debug APK assembly passed; the APK installed and launched. The pulled installed APK hash matched the local debug APK.

Connected instrumentation's XML report shows 29 cases: 27 passed, 2 skipped, and 0 failures. The runner log reported 31, so the XML count is recorded here. After instrumentation, the deploy script reinstalled the app-under-test before manual QA.

The English picker search `common millet` returned exactly one `common millet` row. In French app mode, searching `millet commun` returned exactly one `millet commun` row. No ingredient was selected, no recipe was saved, and the blank drafts were discarded. The app returned to the French home with 114 recipes.

Pixel screenshots and SHA-256:

- [English common millet picker](pixel9a-common-millet-picker-en.png) — `fb7ec11245ab6af133e5f06d98fb6ba26726cf317a60d9ec6bd667a71c2307b9`
- [French common millet picker](pixel9a-common-millet-picker-fr-ca.png) — `b9a0bd169a7d5711a5203de8d4aaf6bd5e8458a7734c89627e0e37d3d670fefc`
- [Final French library home](pixel9a-common-millet-home-fr-ca-114.png) — `74c256a71f602371c9bc728ca18b1b0601e7f651b37baaca4e7783f76e708c9f`

Final artifact hashes:

- Ingredient references (377 rows): `d39d424355a0cd018b08b1780f9183a08f8ee8ce4e880a3ed44ec04ad1bf325f`
- Generated Kotlin catalog: `061f1d1ebe00f0ee972fbaf728a8927e5cb5c5d02e6a9c05d14806b10e2ceb4c`
- Research ledger (547 records): `8c6b879b88299279c410e111a4842d703287df0ce0c8de3f0a6d84603bdd6ebb`
- Debug and installed APK: `c0acd74e502319981727ba86bd88e22304ef40c4f1de3fdc34a0902e8cecdbe5`

Identity implementation is complete for common millet. Broader Section F/G identities and the global independent terminology review remain open.
