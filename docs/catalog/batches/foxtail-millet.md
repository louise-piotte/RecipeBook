# WP03 Section F foxtail millet identity

- **Reviewed:** 2026-10-07
- **Status:** one species-specific food-grain identity integrated and verified on the Pixel 9a / Android 16 emulator; independent Québec French and collision reviews completed.
- **Owner:** WP03 identity research; WP10 catalog integration lead for canonical IDs, seed merge, and validation.
- **Scope:** the edible grain of foxtail millet (*Setaria italica*). The row is distinct from generic millet and pearl millet. It does not assert birdseed, forage, flour, or a preparation state.

## Acceptance checks

- [x] Use OQLF's preferred French term `millet d'Italie` and English translation `foxtail millet` for *Setaria italica*.
- [x] Confirm the species is treated as a cereal crop and food grain, separate from other millet species.
- [x] Keep the generic name `millet` and other broad or bird-feed-associated terms out of aliases.
- [x] Assign `GRAIN_AND_CEREAL` under the project's existing taxonomy without inferring processing or nutrition facts.
- [x] Leave aliases, forms, measurements, density, yields, conversions, substitutions, and recipe links unset.
- [x] Complete independent Québec terminology and normalized-key/recipe-line reviews.
- [x] Validate the normalized 375-reference package, generated Kotlin index, 545-record ledger, unit tests, and Pixel 9a emulator behavior.

## Integrated reference

| ID | English | fr-CA | Aliases | Category | Identity boundary |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-foxtail-millet` | foxtail millet | millet d'Italie | None | `GRAIN_AND_CEREAL` | The species-qualified food grain of *Setaria italica*. Keep separate from generic millet and pearl millet. |

OQLF's `millet des oiseaux` entry identifies *Setaria italica*, maps it to English `foxtail millet`, and lists `millet d'Italie` among its preferred French terms. The same entry notes that `millet des oiseaux` is used for bird feed. FAO treats foxtail millet as a distinct cereal in a human-nutrition publication, while Health Canada's crop-group listing places millet d'Italie among cereals and lists it separately from other millet species. These sources support a species-specific food-grain identity; they do not establish a flour, preparation, measurement, or conversion.

An independent Québec terminology review confirmed `millet d'Italie` and `foxtail millet`. It noted the bird-feed and forage associations and supported omitting `millet des oiseaux` and broad `millet` from aliases. A separate normalized-key audit found no exact name collision and no candidate ingredient line among the 114 bundled recipes. The broad search `millet` will now include this specific identity alongside the generic and pearl-millet rows; qualified searches resolve to this new identity alone. No recipe was relinked.

## Sources

- **WP03-S175 — OQLF, [millet des oiseaux](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506452/millet-des-oiseaux):** *Setaria italica*, English name, preferred French terms, and bird-feed note.
- **WP03-S176 — Health Canada, [Groupes de cultures et propriétés chimiques de leurs résidus](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html):** separate listing of millet d'Italie within cereal crop group 15; used for crop grouping, not food-use or measurement claims.
- **WP03-S177 — FAO, [Sorghum and millets in human nutrition](https://www.fao.org/4/t0818e/t0818e01.htm):** treats foxtail millet as a distinct cereal in a human-nutrition publication and distinguishes it from common and pearl millets.
- **WP03-S178 — OQLF, [millet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet):** explains that unqualified millet may group several species or abbreviate a specific one.

## Verification record

Verified on 2026-10-07 with the isolated Pixel 9a AVD (`emulator-5556`, Android 16 / API 36, 1080 × 2424). The seed package and generated-index checks passed. All 125 bundled JSON files parsed as UTF-8 without a BOM; the research ledger passed its JSON Schema check with 545 records; and `git diff --check` passed. The 9 Python seed-package tests and 269 Android unit tests passed. `tools/deploy_to_pixel9a_emulator.sh` completed the full Gradle `test` task, assembled the debug APK, installed it, and launched the app. The pulled installed APK hash matched the local debug APK.

Connected instrumentation's XML report shows 29 cases: 27 passed, 2 skipped, and 0 failures. The Gradle runner log reported an inconsistent total, so the XML count is recorded here. After instrumentation, the deploy script reinstalled the app-under-test for manual QA.

The English picker search `foxtail millet` returned one `foxtail millet` row. In French app mode, searching `Italie` returned one canonical `millet d'Italie` row. No ingredient was selected, no recipe was saved, and the blank draft was discarded. The app returned to the French home with 114 recipes. `app.recipebook` remained installed on `emulator-5556`; `emulator-5554` had no package installed.

Pixel screenshots and SHA-256:

- [English foxtail millet picker](pixel9a-foxtail-millet-picker-en.png) — `49d62aebdaf6e92f85259c10b44272149233cd138c4753f908a6c845c3544f2e`
- [French foxtail millet picker](pixel9a-foxtail-millet-picker-fr-ca.png) — `29a977961f687cd821b22553b92ddc2cee987a866d5887ef245fba900e9cc05e`
- [Final French library home](pixel9a-foxtail-millet-home-fr-ca-114.png) — `2a074d3f228cb453c8d03a82999e54216491f97eaf5e01454c2139366bd90bf4`

Final artifact hashes:

- Ingredient references (375 rows): `7a89db21954179c2f2340a5af3b59217131808d80de61e7fba02a9c8e7344d38`
- Generated Kotlin catalog: `b1d552f28002971d417f4893c8557f3eaf854b55f206c46247b341f78fe7e8f9`
- Research ledger (545 records): `c9855606b78166b9b2985c704f3ed6a5675681d961794594e167bf8fd4fe3532`
- Debug and installed APK: `6d2b543f678d3a8fc4648b9dcdb5378816d5884efe33ba807802fea09a279904`

Identity implementation is complete for foxtail millet. Broader Section F/G identities and the global independent terminology review remain open.
