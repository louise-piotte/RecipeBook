# WP03 Section L gourds and okra identity integration — 2026-10-09

## Scope and decisions

This batch integrates six of the seven new identity recommendations in
[`wp03-gourds-okra-identity-coordinator-review-20261009.md`](../../proposals/wp03-gourds-okra-identity-coordinator-review-20261009.md).
All six are identity-only `VEGETABLE_AND_AROMATIC` references. No forms, densities, unit mappings,
package yields, numeric measurements, conversions, substitutions, or recipe links were added.

| ID | English / fr-CA | Integrated aliases and boundaries |
|---|---|---|
| `ingredient-ref-bitter-melon` | bitter melon / margose | `bitter gourd`, `bitter cucumber`; French `melon amer`, `courge amère`. Omit `balsam pear` and poetic `pomme/poire de merveille` names because of apple/pear search collisions. |
| `ingredient-ref-winter-melon` | winter melon / melon d’hiver | English: `winter gourd`, `wax gourd`, `wax melon`, `white gourd`, `Chinese winter melon`, `ash gourd`. French: `courge cireuse`, `bénincasa`, `gourde cireuse chinoise`. Omit generic melon, fuzzy melon, and the shared `Chinese Preserving Melon` name. |
| `ingredient-ref-bottle-gourd` | bottle gourd / courge bouteille | French `courge-bouteille`, `courge calebasse`. The identity is the edible immature fruit; the mature dried vessel is a separate use. Omit generic `gourde`, bare `calabash/calebasse`, and the shared `Chinese Preserving Melon` name. |
| `ingredient-ref-ridge-gourd` | ridge gourd / luffa à fruit anguleux | English `angled luffa`, `angled loofah`, `angled gourd`. Keep smooth loofah/sponge gourd, `Chinese okra`, and `courge torchon` separate. Independent Québec terminology review remains open. |
| `ingredient-ref-chayote` | chayote / chayotte | French `chayote`, rare `chaïote`. Keep regional `christophine`, `chouchou`, and `mirliton` out of unscoped aliases; do not merge with summer squash. |
| `ingredient-ref-okra` | okra / gombo | French `okra`; English `bhendi`, `bamia`. Omit `gumbo`, `lady’s fingers`, and `Chinese okra`; the reference is the vegetable pod. |

Snake gourd stays open because its proposed Québec French display still lacks a Québec terminology or
market-label source. `Green jackfruit` remains under the existing jackfruit identity; its maturity
and product-form terms stay unresolved and were not added as aliases.

## Evidence and recipe audit

Identity sources were added to the research ledger under
`WP03-L-GOURDS-OKRA-IDENTITY-20261009-S01`–`S18`. Terminology and botanical boundaries were reviewed
against OQLF entries for [margose](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18980195/margose),
[gourde](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17486050/gourde),
[chayotte](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082826/chayotte),
[gombo](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082830/gombo), and
[louffa](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359332/louffa), plus the
Ontario government’s [winter melon](https://www.omafra.gov.on.ca/CropOp/fr/spec_veg/cucurbits/wintr.html),
[bottle gourd](https://www.omafra.gov.on.ca/CropOp/fr/spec_veg/cucurbits/botg.html),
[angled luffa](https://www.omafra.gov.on.ca/CropOp/fr/spec_veg/cucurbits/luffa.html), and
[okra](https://www.omafra.gov.on.ca/CropOp/fr/spec_veg/fruit_veg/okra.html) profiles. USDA ARS and
EPPO taxonomy sources support the angled-versus-smooth luffa boundary; exact source locators and
limitations are in the proposal.

The 114-recipe scan found no ingredient row naming any integrated identity. Recipe lines and recipe
links are unchanged. Health Canada’s 2015 CNF contains a few source-specific bitter-melon and okra
portions, but they remain deferred pending confirmation in the newer CNF resource; no density,
conversion, or universal measure was inferred. Chayote’s qualitative use in place of some summer
squash lacks a quantified ratio, so no substitution rule was added.

## Package audit

| Artifact | Count | SHA-256 |
|---|---:|---|
| Ingredient references | 559 | `872c313f2cd81a087ab6fefde9f55316dcb16c99061834ceb87d25ef9c3fe556` |
| Ingredient forms | 33 | `275f21eda9369a4c08a869aad3952ebbe2e9e64664ccf0b48af2bb7034928732` |
| Manifest recipe paths | 114 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Research ledger | 737 records / 1,209 source entries / 1,023 source IDs | `8030ff4f5dacc7beffd4a35eb5671e203b500bbfd40cefe850142433a1bf5968` |
| Legacy candidates | 94 | `1421628350323bd7c3fbf2dc566073cfc602f3dc6ff054b44aca3034680e69b5` |
| Recipe corpus | 114 recipes / 1,123 ingredient rows | `30e8640e29dfaf52843f22feb3fde376b0e5e618909163548c267d88bd6e41e6` |

Bundled JSON remains UTF-8 without BOM, with explicit Unicode escapes in seed data. Seed-package and
reference normalization, generated-index freshness, research-ledger validation, `git diff --check`,
and all 10 Python seed-package tests passed. `:app:testDebugUnitTest` passed all 317 tests.

## Pixel 9a / Android 16 verification

The deploy script installed and launched the updated build on `emulator-5556`. Picker search showed
`margose` and `gombo` in French and `ridge gourd` in English. The draft was discarded without saving,
and the French home was restored at 114 recipes.

| Screenshot | Query or state | SHA-256 |
|---|---|---|
| `screenshots/wp03-fr-margose.png` | French `margose` → margose | `ff204ec2d314c76d65a7855aa04bf97802b75653688b73bff3b4edf809bb9dd6` |
| `screenshots/wp03-fr-gombo.png` | French `gombo` → gombo | `43db6b08b18781edb158a8df5e98d645cc97335e81644e0521e6c77a9e6fffff` |
| `screenshots/wp03-en-ridge-gourd.png` | English `ridge gourd` → ridge gourd | `3f8153b6aefcd80e3fef4110e789020746ca761b40c8f9a36de91b5e19134d9c` |
| `screenshots/wp03-home-fr-114.png` | Restored French home, 114 recipes | `e89971914862ad8de7ba372bf21b2453a480921ffcd9104df024891f828e255e` |

## Remaining work

Section L remains open for snake-gourd Québec terminology, green-jackfruit maturity/product scope,
other listed produce and chile identities, and unresolved forms. Measurement, substitution, and
independent Québec terminology coverage remains tracked separately in the global plan.
