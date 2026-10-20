# WP06 charqui identity — 2026-10-09

This coordinator batch adds Peru's source-defined charqui product as a distinct ingredient identity.

## Catalog decision

- ID: `ingredient-ref-charqui`
- English display: `charqui (dried salted camelid meat)`
- French display: `charqui (viande de camélidé séchée et salée)`
- Category: `PROTEIN`
- No aliases, forms, density, unit mappings, measurements, conversions, substitutions, or recipe links.
- Scope the identity to the Peruvian specification's defatted, salted alpaca, llama, or hybrid camelid
  meat obtained by drying or dehydration. Keep it separate from ordinary jerky, `charque`, chalona,
  cecina, and generic dried meat; the catalog cannot encode the regional scope needed for broader
  aliases.
- The English and French search query `charqui` resolves to this one display label.
- The full bundled-library scan covered 114 recipes and 1,123 ingredient rows; no charqui line or
  reference link was found.

## Sources

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP06-SOUTHAM-20261009-S50` | Sistema Electrónico de Contrataciones del Estado (SEACE), [*Ficha Técnica Aprobada: Charqui*](https://prod4.seace.gob.pe/documentos/documentos/FichaSubInv/19082024181118.pdf), Version 03, pp. 1–2 | Defines charqui as defatted, salted alpaca, llama, or hybrid camelid meat obtained by drying or dehydration. The specification cites NTP 201.059:2015, revised 2023. Commercial presentation examples are not modeled as forms, and no handling directions are transferred. |
| `WP06-SOUTHAM-20261009-S51` | Office québécois de la langue française, [“charqui”](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26542161/charqui), updated 2016 | Supports French `charqui` and records `charque` as a variant; its English terms include `jerky` and `charqui`. Only `charqui` is used for the Peru-specific camelid identity because regional product scope is not represented by aliases. |
| `WP06-SOUTHAM-20261009-S52` | Servicio Nacional de Sanidad Agraria (SENASA), [“Ayacucho: SENASA otorga autorización sanitaria a primera planta procesadora de charqui”](https://www.senasa.gob.pe/senasacontigo/ayacucho-senasa-otorga-autorizacion-sanitaria-a-primera-planta-procesadora-de-charqui/), 2019-06-05 | Documents an Ayacucho facility processing charqui and chalona as separate Andean dried-meat products; it names alpaca charqui and ovine chalona in one regional context. This supports regional distinction, not a universal taxonomy or food-safety advice. |

## Collision and search checks

- Before integration, `charqui`, `charque`, `jerky`, `dried salted camelid meat`, and `dried meat` had
  no exact owners among active references, forms, or legacy candidates and no matches in bundled
  recipe text. `chalona` and `cecina` also had no exact owners or recipe-text matches.
- After integration, English and French `charqui` picker queries each return the one charqui row;
  unrelated dried-meat names were not activated as aliases.
- The reference package has 479 identities, the forms package has 17 entries, the legacy candidate
  file has 99 entries, and the manifest has 114 recipes with 1,123 ingredient rows.

## Validation

- Package hashes: references `c827616bb3a7d0124575d22a9420974cb1942ef3ce5f59531741a49ad2f742b2`;
  forms `2098e1048796a1aba42c25e4020f018d02c04c332567620084fceac8f2d15`; manifest
  `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Research ledger: 645 records, 893 source entries, and 780 distinct source IDs; SHA-256
  `bf3a9b04258d4461f72518aa3465a0aa80b7289c7c22d26707080b931676e617`. Schema validation reported
  zero errors.
- Seed-package normalization and generated-index freshness passed at 479 references. All 9 Python
  package tests and all 299 Android unit tests passed.
- Pixel 9a / Android 16 connected instrumentation on `emulator-5556`: XML report has 29 cases, 27
  passed, 2 skipped, and 0 failures or errors. The deployment script completed its test/build steps,
  installed the APK, and launched the app.
- The 125 bundled JSON files are valid UTF-8 without BOM and contain escaped Unicode; no mojibake
  markers were found. `git diff --check` passed.
- The English picker search `charqui` displayed one result, `charqui (dried salted camelid meat)`.
  The French picker search `charqui` displayed one result, `charqui (viande de camélidé séchée et
  salée)`. The blank draft was discarded, and the French library home returned to 114 recipes.

## Emulator screenshots

| Screenshot | SHA-256 |
|---|---|
| [English picker: charqui](en-picker.png) | `07fe2b763689b4e308ce75b1023f6f9838a749b4c4d67c422a96722645651255` |
| [French picker: charqui](fr-picker.png) | `5d42948bcb599018ffbc6b4882d2226171f5cf6e458ab09427dfa53bb82358a4` |
| [French library home, 114 recipes](fr-home-114.png) | `568c9f2b24ad74050d3f0a1b54ef34160da261ea19f48ebe2229d1c3f6885698` |

## Open work

Continue South American product-boundary research and the independent Québec terminology review.
