# WP03 Section F finger millet identity

- **Reviewed:** 2026-10-07
- **Status:** integrated and verified on the Pixel 9a / Android 16 emulator; terminology, normalized-key, and recipe-line audits complete.
- **Owner:** WP03 identity research; WP10 catalog integration lead for canonical IDs, seed merge, and validation.
- **Scope:** edible cereal grain of cultivated *Eleusine coracana* subsp. *coracana*. Exclude other *Eleusine* taxa, forage/feed, planting seed, flour, malt or beer products, and other processed forms. No preparation state, measurement, density, yield, conversion, substitution, or recipe link is inferred.

## Acceptance checks

- [x] Use English `finger millet` and fr-CA `éleusine cultivée`, supported by Canadian government and FAO sources.
- [x] Include English `ragi` as the only alias; leave French aliases empty.
- [x] Assign `GRAIN_AND_CEREAL`; keep `millet africain` inactive because an OECD agricultural glossary also maps it to pearl millet.
- [x] Leave density, unit mappings, forms, yields, conversions, substitutions, and recipe links unset.
- [x] Complete independent terminology, normalized-key, and 114-recipe ingredient-line audits.
- [x] Validate the normalized package, generated index, research-ledger schema, UTF-8/no-BOM seed encoding, and `git diff --check`.
- [x] Complete Android instrumentation, deploy the app, and verify the English and French picker searches on the Pixel 9a / Android 16 emulator.

## Integrated reference

| ID | English | fr-CA | Aliases | Category | Identity boundary |
| --- | --- | --- | --- | --- | --- |
| ingredient-ref-finger-millet | finger millet | éleusine cultivée | EN: ragi; FR: none | GRAIN_AND_CEREAL | Edible grain of cultivated *Eleusine coracana* subsp. *coracana*; excludes other taxa, forage/feed, planting seed, flour, malt/beer products, and other processed forms. |

Health Canada places finger millet / Éleusine with *Eleusine coracana* subsp. *coracana* in cereal-grain subgroup 15-21E. FAO’s human-nutrition publication identifies the grain as a staple and lists `ragi`; its French edition uses `éleusine cultivée`. Espace pour la vie provides local French crop usage and documents harvesting the grains. The sources distinguish the named cereal crop from other species and products; they do not support adding forms or quantitative values.

`Millet africain` is omitted from French aliases. The OECD glossary maps that name to pearl millet in addition to use of similar African-millet wording for finger millet elsewhere, so the phrase would blur this row with `pearl millet / millet perlé`. The generic catalog identity `millet` also remains separate. No French aliases are activated.

## Sources

- **WP03-S190 — Health Canada, [Residue Chemistry Crop Groups](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html):** cereal subgroup 15-21E lists “Millet, finger” with *Eleusine coracana* subsp. *coracana*.
- **WP03-S191 — Santé Canada, [Groupes de cultures et propriétés chimiques de leurs résidus](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html):** the same cereal subgroup lists “Éleusine” with *Eleusine coracana* ssp. *coracana*.
- **WP03-S192 — FAO, [Sorghum and millets in human nutrition](https://www.fao.org/4/t0818e/t0818e01.htm):** Table 1 and the finger-millet section identify *Eleusine coracana*, `ragi`, and staple-grain use.
- **WP03-S193 — FAO, [Le sorgho et les mils dans la nutrition humaine](https://www.fao.org/4/T0818F/T0818F01.htm):** the introduction uses `éleusine cultivée`, identifies `ragi`, and describes the grain as a staple food.
- **WP03-S194 — Espace pour la vie, [Potager africain](https://espacepourlavie.ca/potager-africain):** uses `Éleusine` for *Eleusine coracana* and describes harvesting the grains in a Montréal gardening context.
- **WP03-S195 — OECD/OCDE, [Glossaire de l’agriculture: anglais-français](https://www.oecd.org/content/dam/oecd/fr/publications/reports/1999/07/glossaire-de-l-agriculture_g1ghg24e/9789264273245-fr.pdf):** page 311 maps finger millet to `éleusine cultivée` / `coracan` and maps `millet africain` to pearl millet, supporting the alias omission.

## Independent review and audits

An independent Luna review accepted the canonical names, species boundary, `ragi` alias, and grain category. It found no exact normalized-key collision in the live catalog and no candidate spelling in bundled recipe ingredient text. A separate local audit of the 379-reference catalog found no exact normalized-key collision for the canonical terms or `ragi`; a scan of all 114 bundled recipe files found no matching ingredient-line use. No recipe changed.

## Verification record

Verified on 2026-10-07 using the Pixel_9a AVD (`emulator-5556`, Android 16 / API 36, 1080 × 2424). The normalized 379-reference package, generated Kotlin index, 549-record research ledger schema, UTF-8/no-BOM package encoding, and `git diff --check` passed. All 9 Python package tests and 273 Android unit tests passed. Connected instrumentation completed 29 XML cases: 27 passed, 2 skipped, and 0 failed. The deployment script's `test` and `assembleDebug` tasks passed, the app installed and launched, and the installed APK SHA-256 matched the local build.

In English app mode, searching `finger millet` returned exactly one picker row. In French mode, Android shell text injection could not enter accented characters, so the manual search used `eleusine cultivee`; accent folding returned exactly one row, displayed as `éleusine cultivée`. The automated unit test also searches the accented canonical term. A blank probe was created during the locale switch and then deleted; the French home was restored with 114 recipes. No ingredient was selected and no recipe line changed.

Picker screenshots and SHA-256:

- English `finger millet` picker (`pixel9a-finger-millet-picker-en.png`) — `79be6cf395e8ffc298c9572ad80cd6f39f16e433d4e9fa53b946b9245d57f975`
- French `éleusine cultivée` picker (`pixel9a-finger-millet-picker-fr-ca.png`) — `24b3a368103c5b7aeb75f879c058a3ac52d60eccad0a09a6e0cd37df3bfee8de`
- Restored French library home (`pixel9a-finger-millet-home-fr-ca-114.png`) — `fd8dcd747430e1bb26770bbfb82d5e62de6065c5a9be7672c6b595e7919a7acf`

Artifact hashes:

- Ingredient references (379 rows): `fdcd098c132be936363e8ab03240d4a74f51c956233eda2c842b1194749912b4`
- Generated Kotlin catalog: `c509c92942fd4c6850573750e6464e646575dc47808939eebd47140613fe4480`
- Research ledger (549 records): `73238ffd801031b55bc4f8b26d68e305f9ddce714d596b5533a7f956c22d505d`
- Local and installed debug APK: `11c08fa72fccbb9cd8f2d5ed7a6fc439c0e4f4c60b0bd235d7f1472179387a82`
