# WP03 Poha synonyms and thickness-grade integration

**Date:** 2026-10-10  
**Scope:** extend the existing flattened-rice (poha) identity with bounded English/French aliases and three commercial thickness-grade forms. No recipe lines, numeric conversions, or substitutions are added.

## Decision

Keep `ingredient-ref-flattened-rice-poha` as `flattened rice (poha) / flocons de riz (poha)`. Add these aliases:

- English: `rice flakes`, `flaked rice`, `beaten rice`
- French: `riz aplati`, `riz battu`

The CFTRI and CSIR sources describe these English names in the rice-flake/poha product family. Canadian French retailer and recipe sources use *riz aplati* and *riz battu*. The terms refer to the flattened-rice product here; they do not include crispy rice cereal, puffed rice, rice flour, or generic rice.

Add three commercial grade forms under the same reference:

| Form ID | English label | fr-CA label | Evidence |
| --- | --- | --- | --- |
| `ingredient-form-flattened-rice-poha-thin` | thin poha | flocons de riz fins (poha) | Canadian retail listings and French product labels |
| `ingredient-form-flattened-rice-poha-medium` | medium poha | flocons de riz moyens (poha) | Canadian retail listings and French product label |
| `ingredient-form-flattened-rice-poha-thick` | thick poha | flocons de riz épais (poha) | Canadian retail listings and French product labels |

These are product thickness grades, not standardized dimensions or cooking states. The sources establish the market names but no universal cutoff. Keep `super thin`, `nylon poha`, and `paper poha` out of the generic forms because they are product/manufacturer terms. Keep red-rice poha and maize/corn poha separate, and leave `chiwda`, `aval`, `avalakki`, `atukulu`, `chuda`, and `chira` outside the alias list pending regional and product-scope review.

## Measurements and substitutions

No density, unit mapping, mass/volume measure, conversion, cooking yield, recipe link, or substitution is added. Product-package sizes are not treated as recipe portions. The bundle has no poha recipe, and no source gives a scoped replacement recommendation or ratio between thin, medium, and thick grades. Grade-to-grade interchangeability therefore remains blocked pending dish- and method-specific evidence.

## Recipe and collision audit

- The 114 bundled recipe files contain no `poha`, rice-flake, flattened-rice, beaten-rice, or current alias terms; no recipe or ingredient line changed.
- Exact normalized-key review across active English and French reference names/aliases found no cross-reference collision for the new aliases.
- Crispy rice cereal, puffed rice, generic rice, and rice flour remain separate products.

## Sources

- **WP03-S92 — [CFTRI, Improvement of the traditional process for rice flakes](https://ir.cftri.res.in/6762/):** identifies rice flakes as poha/avalakki and describes the soaking, roasting, and flaking process.
- **WP03-S93 — [CSIR, Socially Relevant Technologies](https://www.csir.res.in/sites/default/files/2023-06/Compendium-of-Social-relevant-technologies-2.6.2021.pdf):** records rice flakes, flaked rice, beaten rice, poha, and other regional names in their Indian context; the full regional family is not imported as global aliases.
- **WP03-S96 — [Club House Canada, Poha Chivda (fr-CA)](https://www.clubhouse.ca/fr-ca/recettes/collations/poha-chivda):** uses *poha (riz aplati)* in Canadian French.
- **WP03-POHA-GRADES-20261010-S01 — [The Family Mart, Poha (Flattened Rice)](https://www.thefamilymart.ca/category/flour-grains-rice/07f10cec-8ea9-47e3-bc86-aa770868940b/poha-flattened-rice/ba8155c3-73fa-42a8-9d76-4b71dc6cb425):** lists thin, medium, and thick poha products from multiple brands; this supports retail grade distinctions only.
- **WP03-POHA-GRADES-20261010-S02 — [Spice Divine, From The Earth Thin Poha (fr-CA)](https://spicedivine.ca/fr/products/from-the-earth-thin-poha-800g):** uses *poha fin*, *riz aplati*, and *riz battu* and describes thin flakes. Its text supports local product naming, not a standard grade definition.
- **WP03-POHA-GRADES-20261010-S03 — [Spice Divine, Poha épais (flocons de riz) (fr-CA)](https://spicedivine.ca/fr/products/indian-heritage-poha-thick-rice-flaks-500gm):** supports the French thick-grade label.
- **WP03-POHA-GRADES-20261010-S04 — [Walmart Canada, PTI Poha Moyen (fr-CA)](https://www.walmart.ca/fr/ip/PTI-Poha-Moyen/6000197583673):** supports the Canadian French medium-grade product label.

## Verification

- At the original 2026-10-10 integration checkpoint, the package had 821 ingredient references, 45 forms, 114 recipes, and 1,123 recipe ingredient rows.
- Reverified all three grades in English and French on the final 927-reference build: `thin rice flakes`, `medium rice flakes`, and `thick rice flakes` return the flattened-rice identity with `thin poha`, `medium poha`, and `thick poha`; `poha fin`, `poha moyen`, and `poha epais` return `flocons de riz (poha)` with the corresponding localized thin, medium, and thick form hint.
- Pixel 9a / Android 16 API 36 instrumentation on `emulator-5560`: 37 cases, 35 passed, 2 skipped, 0 failed. Android unit tests: 396 passed, 0 failed. Python seed-package tests: 81 passed.
- `python3 -B tools/seed_package/normalize_bundled_seed_package.py --check` passed with no package changes; the generated catalog check passed at 927 references; research-ledger validation passed with 1,184 records and no errors.
- `RECIPEBOOK_EMULATOR_SERIAL=emulator-5560 ./tools/deploy_to_pixel9a_emulator.sh` built, installed, and launched the debug app successfully. The unsaved draft was discarded and the French home returned to `Toutes les recettes (114)`.
- Final merged package at verification time: 927 references, 51 forms, 114 recipes / 1,123 ingredient rows, and 1,184 ledger records / 3,164 source entries / 2,563 distinct source IDs. SHA-256: manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; ingredient references `e14ad6668bc34bd83f7e1fd3993ac023d5d748ff134fafd807583435d6850468`; ingredient forms `a195a0f3b487d193be11cf5648b291f5b51f001ee21cd643af766655dbf28267`; ledger `023f6bbe3e0dea7ecd2b701958ba230f8103fac526861b23b9c41a47dd641e97`; generated catalog `65f7c5fab875aff1057d341acb7462cc356726a6c08ddbecbec80796a65b0b0a`.
- UTF-8/no-BOM and targeted whitespace checks passed. Screenshot hashes below were recomputed from the final-build captures.

### Final-build screenshots

| Check | Screenshot | SHA-256 |
|---|---|---|
| English thin poha | [picker-en-thin-poha.png](screenshots/picker-en-thin-poha.png) | `7ad343e7cd76f225bdbf89036518a3353c21478e0625527cbc7c576694febc22` |
| English medium poha | [picker-en-medium-poha.png](screenshots/picker-en-medium-poha.png) | `0c035bc2c62e24452b0f7ccb54ba7ac3a47f3bff06c5258a72e349bb8bb91b7d` |
| English thick poha | [picker-en-thick-poha.png](screenshots/picker-en-thick-poha.png) | `78a97a3eeeecf6f7d187705ccc9a5cef0026b910cdd4cf6320d41350cd37fc3a` |
| French thin poha | [picker-fr-thin-poha.png](screenshots/picker-fr-thin-poha.png) | `07bb362f74541bccb744259ff201d23c9b1e5fa3b939872a83c84fc93573cc41` |
| French medium poha | [picker-fr-medium-poha.png](screenshots/picker-fr-medium-poha.png) | `210fed656af97bac237fbfa823b2fa2753efbc7734234ea6b5285b0fa3e9b65a` |
| French thick poha | [picker-fr-thick-poha.png](screenshots/picker-fr-thick-poha.png) | `a37104388c6abcb88bced768aaf01c082fc014bd0ccf317728c66575709d23c7` |
