# WP03 teff and triticale grain identities

- **Owner:** WP03 plant-food research and catalog integration
- **Reviewed:** 2026-10-07
- **Status:** two identity-only references integrated and verified on Pixel 9a; Section F remains open
- **Scope:** whole teff grain and food triticale grain. No recipe lines, forms, measurements, conversions, cooking yields, or substitutions are added. R90 later added `tef` as a French search alias on teff grain only; triticale still has no aliases.
- **Recipe audit:** all 114 bundled recipe files were scanned; none mentions teff or triticale.

## Catalog decisions

| ID | English | fr-CA | Category | Boundary |
| --- | --- | --- | --- | --- |
| `ingredient-ref-teff-grain` | teff | teff d'Abyssinie | `GRAIN_AND_CEREAL` | Whole teff grain as a food ingredient, distinct from `ingredient-ref-teff-flour`. R90 adds `tef` as a French search alias only; keep the display pending independent Québec review. |
| `ingredient-ref-triticale-grain` | triticale | triticale | `GRAIN_AND_CEREAL` | Food grain from the wheat–rye cereal, distinct from wheat, rye, triticale flour, feed grain, silage, and forage. No aliases. |

Both references have null default density and empty unit mappings. No forms or recipe links were added. The recipe scan found no matches; normalized English and French keys do not collide with existing names or aliases. Independent Québec French review remains open.

## Evidence

- **WP03-S75 — CFIA, [List of Grains and Field Crops](https://inspection.canada.ca/en/plant-health/grains-and-field-crops/list-grains-and-field-crops):** identifies Triticosecale spp. / triticale and Eragrostis (= Poa) abyssinica / teff as cereals. Supports English names and category only; it is a crop list, not an edible-product specification.
- **WP03-S76 — ACIA, [Liste de grains et grandes cultures](https://inspection.canada.ca/fr/protection-vegetaux/grains-grandes-cultures/liste-grains-grandes-cultures):** supplies the French labels *triticale* and *teff d'Abyssinie* under cereals. The page is dated 2015; use it for the documented term pair, not as a current product standard.
- **WP03-S77 — CFIA, [Multi-mycotoxins in Milled Grain Products](https://inspection.canada.ca/DAM/DAM-food-aliments/STAGING/text-texte/multi-mycotoxins_in_milled_grain_products-april_1_2015_to_march_31_2018_1697482956573_eng.pdf):** Table 1 lists teff products as flour and grain and reports samples collected from Canadian retail locations. This supports separate food-product identities for grain and flour, not measurements or culinary behavior.
- **WP03-S78 — Government of Saskatchewan, [Triticale: Production and Use](https://www.saskatchewan.ca/business/agriculture-natural-resources-and-industry/agribusiness-farmers-and-ranchers/crops-and-irrigation/field-crops/cereals-barley-wheat-oats-triticale/triticale-production-and-use):** defines triticale as a small-grain cereal and describes its human-food market and whole-grain flour use. Feed, silage, and forage uses are excluded from this food identity.
- **WP03-S79 — Usito, [triticale](https://usito.usherbrooke.ca/d%C3%A9finitions/triticale):** current Québec French dictionary defines the cereal as a wheat–rye cross and also uses *triticale* for its grains and flour. The current content was updated 2026-05-22.
- **WP03-S80 — Health Canada, [Blé et triticale - Allergènes alimentaires prioritaires](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/rapports-publications/salubrite-aliments/allergene-alimentaire-prioritaire.html):** identifies triticale in Canadian food labeling and defines it as a wheat–rye hybrid; the page notes that it is not usually offered on the market, so no prevalence claim is made.
- **WP02-S90 — OQLF, [tef](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8480763/tef):** defines the cereal and lists English *teff*, while marking French *tef* recommended but non-current. The current CFIA label *teff d'Abyssinie* remains the display; after R90, *tef* is a French search alias on the grain only.

The evidence and decisions are recorded against both references in `research-ledger.v1.json`. Measurement and substitution states remain not yet researched.

## Verification record

- The normalized bundle contains 357 ingredient references, 16 forms, and 114 recipes; the research ledger contains 522 records. Seed, ledger, and generated-catalog hashes match the completed brown-rice verification checkpoint, so its package normalization, schema validation, generated-index check, 9 Python tests, 254 Android unit tests, and 29 connected tests (2 existing skips) cover these same catalog artifacts.
- On Pixel 9a / Android 16, the English picker query `teff` returned `teff` and the distinct `teff flour` result; the French query `teff` returned `teff d'Abyssinie` and `farine de teff`. The English and French `triticale` queries each returned `triticale`.
- Screenshots: [English teff](screenshots/picker-teff-grain-en.png), [fr-CA teff](screenshots/picker-teff-grain-fr-ca.png), [English triticale](screenshots/picker-triticale-en.png), and [fr-CA triticale](screenshots/picker-triticale-fr-ca.png).
- Screenshot SHA-256: English teff `b77e86ca6576562431612ad2f960905e5e4fc5a47db10d2957da9ecc2c9cd76a`; fr-CA teff `50b155ea7d8c9c2f9ec3081cee8181fc1643729aa72240d2a904065909dc0964`; English triticale `cd663ebb0addd1733a46b372b9eeb3cca6d254ce5c8bf7dfafd7d373b856cb5f`; fr-CA triticale `36f0ac77a6ffa48d2522d260a527b4239245087ba55726d4a782bdeac7197001`.
- Package SHA-256: ingredient references `4aebf7f33b8e04cf13e796200c911f7e86c43823a8b64c048028037c5acdb70a`; forms `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a`; manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; research ledger `22a9b8c9b25ebb95446be5c631c7d8c3f5835043820ee3439655fc96315fdc5a`; generated Kotlin catalog `ee09a26a0ce1a18d4c24cb5a84013e7135b6e957623bdb429297bc16477a7f0a`.
- The temporary recipe draft was discarded without selecting or saving an ingredient. The updated plan, workflow, and batch notes passed UTF-8/no-BOM and mojibake checks; bundled seed JSON remains explicit-Unicode-escaped. `git diff --check` passed.

## Follow-up

- Continue the open Section F work: instant oats, unqualified farro, broken rice, generic sushi rice, rice flakes/poha, corn products, and remaining grain forms. Black rice and scoped edible red rice have since been integrated in separate identity packets.
- Obtain independent Québec French review of *teff d'Abyssinie* as the grain display and its distinction from *farine de teff*. R90 added *tef* as a grain search alias without changing the display.
- Do not infer quantities, cooking behavior, conversions, or substitutions from the identity sources.

## R90 follow-up — 2026-10-13

Added `tef` to `aliasesFr` on `ingredient-ref-teff-grain` after TERMIUM confirmed `tef` as correct and `teff` / `teff d'Abyssinie` as correct normalized French terms, and a current Canadian Yupik product page confirmed French consumer-facing use of `graines de teff`. CFIA's `teff d'Abyssinie` display remains unchanged; a separate human Québec display review remains open. No flour alias, form, measurement, conversion, yield, recipe link, or substitution changed. See the [R90 proposal](../proposals/wp03-section-f-teff-grain-tef-alias-review-20261013-r90.md) and [integration record](wp03-section-f-tef-alias-integration-20261013/README.md). Static package, reference, and generated-index checks passed; no app tests were run because this change only adds database JSON data.
