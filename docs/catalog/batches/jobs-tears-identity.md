# WP03 Section F Job's tears identity

- **Reviewed:** 2026-10-07
- **Status:** integrated and verified on the Pixel 9a / Android 16 emulator; terminology, normalized-key, and recipe-line audits complete.
- **Owner:** WP03 identity research; WP10 catalog integration lead for canonical IDs, seed merge, and validation.
- **Scope:** edible cereal grain of *Coix lacryma-jobi*. Exclude hard-shelled bead seeds and ornamentals, feed, flour, tea and other beverages, medicinal preparations, and other plant parts. Do not imply every seed of the species is food. No form, measurement, density, yield, conversion, substitution, or recipe link is inferred.

## Acceptance checks

- [x] Use English Job's tears and fr-CA larme-de-Job; include larmes-de-Job as the sourced French plural.
- [x] Include the supported English spellings adlay and adlai as aliases for the edible grain.
- [x] Assign GRAIN_AND_CEREAL; keep botanical alternatives and broader millet wording out of active aliases.
- [x] Leave forms, density, unit mappings, yields, conversions, substitutions, and recipe links unset.
- [x] Complete independent Québec terminology, normalized-key, and 114-recipe ingredient-line audits.
- [x] Validate the normalized package, generated index, research-ledger schema, UTF-8/no-BOM package encoding, and `git diff --check`.

## Integrated reference

| ID | English | fr-CA | Aliases | Category | Identity boundary |
| --- | --- | --- | --- | --- | --- |
| ingredient-ref-jobs-tears | Job's tears | larme-de-Job | EN: adlay, adlai; FR: larmes-de-Job | GRAIN_AND_CEREAL | Edible cereal grain of *Coix lacryma-jobi*; excludes bead seeds, forage/feed, flour, beverages, medicines, and other plant parts. |

OQLF gives larme-de-Job as the preferred French botanical term and larmes-de-Job as its plural, with Job's tears as the English term. This 1985 entry names the species but does not establish food use. The Philippine DOST-FNRI food-composition entry directly lists Job's tears grain as *Coix lacryma-jobi*, gives Adlay as an alternate/common name, and marks the edible portion as 100%. Philippine Department of Agriculture sources describe grain cooked like rice and distinguish the edible crop from hard bead-making forms; CFIA and Health Canada place the species among cereals/grain crops.

Adlay and adlai are retained as documented spelling variants tied to the food grain. OQLF alternatives tear grass, larme-du-Christ, larmille, and larmille des Indes remain inactive because they are botanical terms without a specific food-product need. Broad millet compounds are omitted to avoid blurring this identity with generic and species-qualified millet. No recipe line was relinked.

## Sources

- **WP03-S184 — OQLF, [larme-de-Job](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17042985/larme-de-job):** French botanical term and plural, English terms, and Latin species name; not a food-use source.
- **WP03-S185 — Philippine DOST-FNRI, [Philippine Food Composition Table, Food A008](https://i.fnri.dost.gov.ph/fct/library/report/2970):** lists Job's tears grain, *Coix lacryma-jobi*, Adlay, and 100% edible portion.
- **WP03-S186 — Philippine Department of Agriculture, Bureau of Agricultural Research, [Aggie Trends, February 2019](https://www.da.gov.ph/wp-content/uploads/2019/03/AGGIE-TRENDS-FEBRUARY-2019.pdf):** distinguishes bead-making *var. lacryma-jobi* from cereal-harvested *var. ma-yuen* and describes food uses.
- **WP03-S187 — Philippine Department of Agriculture, Agricultural Training Institute, [Gabay sa Produksyon ng Adlay](https://ati2.da.gov.ph/ati-4b/content/sites/default/files/2022-11/Gabay%20sa%20Produksyon%20ng%20Adlay.pdf):** distinguishes soft-shelled eaten grain from hard-shelled wild grass and discusses food, feed, medicinal, beverage, and accessory uses.
- **WP03-S188 — Health Canada, [Residue Chemistry Crop Groups](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html):** lists Job's tears in cereal subgroup 15-21E and distinguishes it from millet species.
- **WP03-S189 — Canadian Food Inspection Agency, [List of Grains and Field Crops](https://inspection.canada.ca/en/plant-health/grains-and-field-crops/list-grains-and-field-crops):** lists *Coix lacryma-jobi* under cereals.

## Verification record

Verified on 2026-10-07 using the Pixel_9a AVD (emulator-5556, Android 16 / API 36, 1080 × 2424). The normalized 378-reference package, generated Kotlin index, 548-record research ledger schema, UTF-8/no-BOM and mojibake checks, and git diff --check passed. All 125 bundled package JSON files parse as UTF-8 without BOM, contain only escaped non-ASCII data, and have no mojibake markers. The 9 Python package tests and 272 Android unit tests passed.

The deploy script's full Gradle test task and :app:assembleDebug passed. Connected Android instrumentation completed on emulator-5556; its XML report records 29 cases, 27 passed, 2 skipped, and 0 failures. The runner log printed 31; the XML report is recorded here. The app was redeployed after instrumentation. The installed APK SHA-256 matched the local debug APK.

English picker search for the exact canonical phrase Job's tears returned exactly one row. In French app mode, larme-de-Job returned exactly one row. Neither ingredient was selected; both blank drafts were discarded. The library returned to the French home with 114 recipes. No recipe line was relinked.

Screenshots and SHA-256:

- English Job's tears picker (pixel9a-jobs-tears-picker-en.png) — 0680b44fbdf1381c6f3322f4bd2ecab25f340faa5599e7820259897e21f8492a
- French Job's tears picker (pixel9a-jobs-tears-picker-fr-ca.png) — 4571ef9e99dcdeb0685ccf80dd8f7e4406f87a1e834e6250c0eab8d817c06574
- Final French library home (pixel9a-jobs-tears-home-fr-ca-114.png) — 113eee61deff6f92c8e6c343ff0cc4a41e0bce683e4512c0f71a023f649afea7

Final artifact hashes:

- Ingredient references (378 rows): 7738bc927c441d05c1c4adc4bdc67fe43a183e3206e65f232d734a61210a9755
- Generated Kotlin catalog: 4ece0a565b309c266b8376aef9be73734498b5930656e70794ce0dfc58d8834f
- Research ledger (548 records): e17569cbeb2bce90078aee035008dffb435c78790bc44b203749d4711a0b0e53
- Local and installed debug APK: eca44116a9df47600c14c91d1bd62396a40448e7f89c89c4c5d76bc0dd3e4041
