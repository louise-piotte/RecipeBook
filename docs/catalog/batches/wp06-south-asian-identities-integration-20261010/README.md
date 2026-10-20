# WP06 South Asian identity integration

**Date:** 2026-10-10  
**Scope:** South Asian identity and alias-boundary decisions from the reviewed WP06 regional gap packet. No recipe links, forms, measurements, conversions, yields, or substitution rules were added.

## Catalog decision

Promoted the existing cumin-seed and curry-leaves legacy candidates, then added ten identity-only references:

- cumin seeds / graines de cumin and curry leaves / feuilles de cari;
- fenugreek seeds / graines de fenugrec, ajwain / graines d’ajwain, and nigella seeds / graines de nigelle;
- large cardamom / cardamome noire, ghee / beurre de ghee, and mustard oil / huile de moutarde;
- finger millet flour / farine de ragi, panch phoron / panch phoron, rihaakuru / rihaakuru, and timur pepper / timur.

The new aliases are limited to `ajowan` and `carom seeds` for ajwain, `ragi flour` for finger-millet flour, `ghee butter` for ghee, `mustard seed oil` for mustard oil, and `panch phoran` for panch phoron. Nigella has no `black cumin`, `black seed`, or `cumin noir` alias. Large cardamom has no bare `cardamom`, `black cardamom`, or Nepal-cardamom alias. Cumin seeds remain distinct from ground cumin; curry leaves remain distinct from curry powder; panch phoron remains a named blend without a universal recipe or `five spice` alias; and finger-millet flour remains distinct from generic millet flour and bare `ragi`.

All twelve references have null density and empty unit mappings. No bundled recipe row matched these identities.

Eighteen candidate records remain held in the research ledger: date-palm jaggery; goraka and goraka paste; Maldivian tuna process terms `hikimas` and `valhoamas`; Himali jeera; jimbu; kala zeera; pran; mawal; ratanjog; Kashmiri chilli paste; nihari masala; two momo sauces; chaku; Githeyo Mirus; and generic millet flour. The current ingredient taxonomy cannot retain the distinct tuna smoking/drying process meanings, so those remain source-specific evidence rather than global matches. The packet's other ambiguous compound and regional labels also remain held at their documented boundaries.

## Source review

- Québec French names are supported where available by the [OQLF fenugrec](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095264/fenugrec), [nigelle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8370343/nigelle), [beurre de ghee](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8413335/beurre-de-ghee), and [huile de moutarde](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8413229/huile-de-moutarde) entries. OQLF explicitly separates nigella from cumin.
- The [India Spices Board curry-leaf entry](https://indianspices.com/spice-catalog/curry-leaf.html) identifies *Murraya koenigii* leaves; its [large-cardamom entry](https://www.indianspices.com/spice-catalog/cardamom-large.html) identifies *Amomum subulatum*. The French display `cardamome noire` is grammatically normalized from the source's “Cardamome noir” wording.
- Agriculture and Agri-Food Canada's [dairy processing interpretation guidance](https://agriculture.canada.ca/fr/secteur/production-animale/centre-canadien-dinformation-laitiere/lois-reglements-codes-normes/directives-dinterpretation-secteur-transformation) places ghee in the butter-oil class; this does not make it interchangeable with all clarified butter or niter kibbeh.
- Canadian retail listings distinguish [ajwain](https://www.walmart.ca/fr/ip/Global-Choice-Graines-de-Carvi-carom-Ajwain-400-g/6Q65Y6WO0R8L) from caraway and identify [ragi flour](https://www.walmart.ca/fr/ip/Farine-de-ragi-Verka-2-lb/6000203211214) as finger-millet flour. The [FAO Bangladesh food table](https://www.fao.org/fileadmin/templates/food_composition/documents/FCT_10_2_14_final_version.pdf) distinguishes solid date-palm jaggery from liquid nolen gur; neither is broadened to a generic jaggery identity.
- The [Visit Maldives overview](https://old.visitmaldives.com/portfolio-item/maldivian-side-of-life/) distinguishes `hikimas`, `valhoamas`, and `rihaakuru`; only rihaakuru is accepted here as a condiment identity. A [Nepal Government report](https://dfomanang.gov.np/wp-content/uploads/2021/07/Final-Report-on-Conservation-and-Management-of-Threatened-Plant-Species-of-Manang.pdf) and the Himalayan Value Chains Project's [timur analysis](https://hvap.asdp.gov.np/downloadfile/HVAP_Timur%20VCA%20report%20Final_1377153519.pdf) support the species-bounded *Zanthoxylum armatum* identity.

The full source-by-source disposition is recorded under `WP06-SA-20261010` in `docs/catalog/research-ledger.v1.json` and in the [review proposal](../../proposals/wp06-south-asian-cuisine-gap-sweep-20261010.md). Independent Québec/community terminology review remains open for borrowed or provisional regional displays, including `cardamome noire`.

## Verification

Package normalization, ingredient-reference normalization, generated-catalog freshness, and research-ledger validation passed. The Python seed-package suite passed all 13 tests, and `:app:testDebugUnitTest` passed all 334 Android unit tests. Deployment to `emulator-5556` (Pixel 9a profile, Android 16 / API 36) passed.

The live picker returned `ajwain` for the English query `ajwain`, and `fenugreek seeds` for the English-interface query `fenugrec`. In French it returned `graines de nigelle` for `nigelle` and `beurre de ghee` for `beurre de ghee`; `cumin noir` returned no result. The catalog tests cover the remaining alias and product boundaries. No result was selected and no draft was saved. The app was left on the French home with 114 recipes.

| Screenshot | SHA-256 |
| --- | --- |
| [English ajwain picker](pixel9a-picker-ajwain-en.png) | `6b02e5822efc2dcf49f1fd78265357013f45f6e360c67fbaa4cc25b897dcec68` |
| [French nigelle picker](pixel9a-picker-nigelle-fr.png) | `bd98e045b0db346b6e7b91a3cccd6fba37be198da0f0a4329534c2034bec0445` |
| [French ghee picker](pixel9a-picker-ghee-fr.png) | `ba957ed0da3ae624c28aa607a051a3b9f3e24b36491fb9661edff6063d68dc96` |
| [French home, 114 recipes](pixel9a-home-fr-114-recipes.png) | `dde1eff14f3952b395c5856911dbaf4acc426823070b071aec6843127801e4d2` |

At integration, the package has 751 ingredient references (`801584a93190b050d7c6cc9736f520520e6fb8d0765a034f952dac8c2368b4c5`), 34 forms (`904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938`), 956 ledger records / 1,932 source entries / 1,565 source IDs (`27ac5cccde7cb0234e5b386dcd18ecc0759eea6bbfec5f325ec57ba389042191`), 82 legacy candidates (`60d389975134f8d31c57c66caa6375b4466c4c9614d399617a64365878d6aa5f`), and 114 recipes / 1,123 ingredient rows. The seed manifest hash is `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.

WP06 regional source coverage and independent Québec/community review remain open. Measurement, form, conversion, yield, and substitution work stays blocked until separately supported.
