# WP03 nut, seed butter, chestnut product, and poppy filling integration

**Date:** 2026-10-10  
**Scope:** Eleven identity-only processed-product rows from the reviewed WP03 Section I proposal. No recipe links, forms, measurements, conversions, yields, or substitution rules were added.

## Catalog decision

Added distinct identities for:

- cashew, macadamia, walnut, pecan, pine-nut, Brazil-nut, pumpkin-seed, and sunflower-seed butter;
- plain chestnut purée and sweetened chestnut spread; and
- poppy-seed filling.

The butter products remain separate from their source nuts/seeds. Plain chestnut purée remains separate from sweetened chestnut spread, and poppy-seed filling remains separate from plain poppy seeds. The only added aliases are `beurre de cajous` on cashew butter, `crème de marrons` on sweetened chestnut spread, and `garniture de graines de pavot` on poppy-seed filling. `beurre de pignon de pin` remains a provisional French display because the exact product phrase is attested by a Canadian marketplace listing while OQLF supports the component term `pignon` only.

All eleven identities have null `defaultDensity` and empty `unitMappings`. No bundled recipe rows requested these identities. Product formulas, roast state, sugar, salt, oil, texture, and optional filling ingredients stay package- or recipe-specific.

Pistachio butter remains held pending review of the existing pistachio-paste identity and its two recipe rows. Hemp-seed butter remains held because its source does not specify whether the seeds are hulled. Existing coconut, sesame/tahini, candlenut, and mixed-butter decisions were not duplicated.

## Source review

- OQLF entries support Québec vocabulary for [pacane](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083802/noix-de-pacane), [marron](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2295692/marron), and [pignon](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083473/pignon).
- The [Nuts to You Québec French butter catalog](https://nutstoyou.ca/fr/nos-beurres/) and its [cashew](https://nutstoyou.ca/fr/products/beurre-de-cajous-cremeux/), [macadamia](https://nutstoyou.ca/products/macadamia-butter-smooth/), [pumpkin-seed](https://nutstoyou.ca/products/pumpkin-seed-butter-smooth/), and [sunflower-seed](https://nutstoyou.ca/products/sunflower-seed-butter/) pages support separately named products. Their formulas are SKU-specific.
- The Canadian [CIPO Trade-marks Journal](https://publications.gc.ca/collections/collection_2022/opic-cipo/RG42-2-69-3509-fra.pdf) lists French goods-description terms for cashew, walnut, pecan, Brazil-nut, and macadamia butter. A Québec product also attests [beurre de noix de Grenoble](https://crunature.com/products/beurre-de-noix-de-grenoble-crues), and a Québec pecan product attests [beurre de pacanes](https://lesminettes.ca/collections/cadeaux-de-profs/products/beurre-de-pacanes-erable); neither product formula is treated as universal.
- Canadian product pages support [pecan](https://balsamtahini.com/products/pecan-butter), [pine-nut](https://balsamtahini.com/products/pine-nut-butter), and [Brazil-nut](https://balsamtahini.com/products/brazil-nut-butter) butters. The exact French pine-nut-butter phrase comes from [Walmart Canada](https://www.walmart.ca/en/ip/Balsam-Natural-Pine-Nut-Butter-310g/5H6ZRGG4G8DK), so independent Québec wording review remains open.
- [Codex CXS 145-1985](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/ru/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B145-1985%252FCXS_145e.pdf) describes canned chestnut purée styles. [Qualifirst](https://www.qualifirst.com/fr_CA/food/chestnut_products) separately lists unsweetened purée and sweetened spread; [Clément Faugier](https://www.clementfaugier.fr/fr/detail_produit?produit=40) documents the ingredients in its `crème de marrons` product.
- The [European Commission poppy-seed recommendation](https://eur-lex.europa.eu/legal-content/FR/TXT/?uri=CELEX%3A32014H0662) describes a composite filling made from ground seeds, sweetener, and liquid, with optional ingredients. Its [Valašský frgál specification](https://eur-lex.europa.eu/legal-content/FR/TXT/?qid=1774460087676&uri=CELEX%3A52022XC0325%2801%29) attests `garniture aux graines de pavot` in a local cake context. OQLF confirms the base food term [graine de pavot](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095300/graine-de-pavot).

The source-specific ingredients and process descriptions support identity boundaries, not global recipes, formulas, or conversion values. Full evidence and limitations are recorded under `WP03-PASTE-PRODUCT-20261010` in `docs/catalog/research-ledger.v1.json` and in the [review proposal](../../proposals/wp03-nut-seed-paste-product-gap-review-20261010.md).

## Verification

`python3 tools/seed_package/normalize_bundled_seed_package.py` reported zero changed parts. Reference normalization and generated-catalog freshness passed. All 12 Python seed-package tests and 332 Android unit tests passed. The deploy script passed its Gradle `test`, `assembleDebug`, install, and launch steps.

On `emulator-5556` (Pixel 9a profile, Android 16 / API 36), the live ingredient picker returned `cashew butter` for the English query `cashew butter` and the French alias query `beurre de cajous`. The search results were not selected; the editor was closed without saving, and the home screen showed 114 recipes.

| Screenshot | SHA-256 |
| --- | --- |
| [English picker](pixel9a-picker-en.png) | `2ace91faff1c69a93b6e664fc6fe737902fdda38ee52e9bc3362993772c68c68` |
| [French alias picker](pixel9a-picker-fr.png) | `aa04548a26f8fde03150a9a4f90aa7d98fd8268da3a6d0fa7ddc82d905812e6a` |
| [Home, 114 recipes](pixel9a-home-114-recipes.png) | `6bcdda16791ff6a759900999f7c25e8bb40c8bc440ffcb09fbfd87eb4f9eb0f9` |

At combined verification, the package had 739 ingredient references (`c6d7f1bd73db664c6b423cc6d727c9d66b2277813a93657f0f903a4bfbf6008f`), 34 forms (`904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938`), 928 ledger records / 1,866 source entries / 1,526 source IDs (`1e47afa732b5f6a4edd62c6ee6dfb9584364b7b67868f14db21c852660ab45b`), 84 legacy candidates, and 114 recipes / 1,123 ingredient rows (`091cddbbd535ac5f77b6bdc421ec29f4da678654462cb6fe51b38aac99518321`).

Section I remains open for the held pistachio and hemp butter boundaries, coconut butter, and independent Québec review of the provisional pine-nut French display.
