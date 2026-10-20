# WP03 crispy rice cereal identity

- **Owner:** WP03 grain identity research and catalog integration
- **Reviewed:** 2026-10-07
- **Status:** integrated as an identity-only processed cereal
- **Scope:** narrow the legacy rice-cereal row to the crisp rice cereal used in the bundled chocolate treat recipe. This does not define a universal rice cereal identity.

## Catalog decision

Keep stable ID `ingredient-ref-rice-cereal` and use:

- **English:** `crispy rice cereal`
- **fr-CA:** `céréales de riz croustillantes`
- **Category:** `GRAIN_AND_CEREAL`

The English source for recipe 040 requests `6 cups crispy rice cereal`. Nature's Path Canada uses the French product name *céréales de riz croustillantes* for a ready-to-eat crispy rice cereal; Télé-Québec also uses *céréales de riz (de type Rice Krispies)* in a pressed treat. The Québec market wording supports the French display; do not make the brand part of the catalog name.

The previous generic display `rice cereal / céréales de riz` is not retained as an alias. Keep unqualified `rice cereal`, `puffed rice / riz soufflé`, infant rice cereal, rice flakes/poha, and the Rice Krispies / *riz croustillant* brand-specific pairing out of aliases. No forms, density, unit mappings, measurements, conversions, cooking yields, or substitutions are added.

Recipe 040 now preserves the original source line `6 cups crispy rice cereal` and uses the localized product wording in its English and French description/instructions. The quantity remains six cups. No mass conversion is inferred.

## Sources

- **WP03-S86 — Allrecipes, [Chocolate Nutty Crispy Treats](https://www.allrecipes.com/recipe/258753/chocolate-nutty-crispy-treats/):** ingredient list requests six cups of crispy rice cereal and uses it in a chocolate-almond pressed treat. Source text restores the bundled ingredient line; no measurement conversion is imported.
- **WP03-S87 — Nature's Path Canada, [Céréales de riz croustillantes](https://naturespath.com/fr-ca/products/cereales-de-riz-croustillantes-750-g-de-terre-amicale-sac):** current French product page uses the proposed fr-CA name and identifies rice crisps as the cereal ingredient. Brand, brown-rice, organic, and sweetening qualifiers are not imported.
- **WP03-S88 — WK Kellogg Canada, [Rice Krispies (fr-CA)](https://www.wkkellogg.ca/fr/nos-aliments/nos-marques/rice-krispies):** describes the branded product as *céréales de riz grillées au four* and mentions homemade treats. This supports the processed cereal context, not a generic brand/process alias.
- **WP03-S89 — Télé-Québec, [Carrés au riz soufflé, miso et sésame](https://www.cuisinez.telequebec.tv/recettes/7997/carres-au-riz-souffle-miso-et-sesame):** uses *céréales de riz (de type Rice Krispies)* in a pressed cereal-treat recipe. The brand comparison is not activated as an alias.
- **WP03-S90 — OQLF, [riz croustillant](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18940757/riz-croustillant):** maps *riz croustillant* specifically to Rice Krispies; keep it off the generic cereal identity.
- **WP03-S91 — CFIA, [Labelling and Composition Requirements for Grain and Bakery Products](https://inspection.canada.ca/en/food-labels/labelling/industry/grain-and-bakery-products):** treats processed cereal products as distinct from raw grain but does not define a universal rice-cereal composition.

All 114 bundled recipes were audited. Recipe 040 is the sole bundled use; no normalized catalog-key collision was found for the new English and French displays.

## Verification record

- The normalized bundle contains 357 ingredient references, 16 forms, and 114 recipes; the research ledger contains 522 records. Seed, ledger, and generated-catalog hashes match the completed brown-rice verification checkpoint, so its package normalization, schema validation, generated-index check, 9 Python tests, 254 Android unit tests, and 29 connected tests (2 existing skips) cover these same catalog artifacts.
- On Pixel 9a / Android 16, English picker query `crispy rice cereal` returned the exact English display. French query `croustillantes` returned `céréales de riz croustillantes`.
- Recipe 040 was opened in both locales. The English detail shows `6 cups crispy rice cereal` and uses `crispy rice cereal` in the description and instructions. The French detail shows `6 tasses céréales de riz croustillantes` and uses `céréales de riz croustillantes` in the description and instructions. The original six-cup line remains intact; no mass conversion was introduced.
- Screenshots: [English picker](screenshots/picker-crispy-rice-cereal-en.png), [fr-CA picker](screenshots/picker-crispy-rice-cereal-fr-ca.png), [English recipe 040](screenshots/recipe-040-crispy-rice-cereal-en.png), and [fr-CA recipe 040](screenshots/recipe-040-crispy-rice-cereal-fr-ca.png).
- Screenshot SHA-256: English picker `df611f237fc0b43cd15e0ec3c046847c1ee80d8f8056837601041034e02ceb14`; fr-CA picker `117281ca964338c00fbe4cb2f22ce41a154cf2c239a2fc05b1e3e8590229bae1`; English recipe 040 `06ed1d6fc71664fb91e161df5979127e129b074894e83e4d6e1569c2fd6a05ac`; fr-CA recipe 040 `8a02ef316cfe99b4b1bc797ebccbf2c39d5c1885859c75ea7625629bd6c29c57`.
- Package SHA-256: ingredient references `4aebf7f33b8e04cf13e796200c911f7e86c43823a8b64c048028037c5acdb70a`; forms `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a`; manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; research ledger `22a9b8c9b25ebb95446be5c631c7d8c3f5835043820ee3439655fc96315fdc5a`; generated Kotlin catalog `ee09a26a0ce1a18d4c24cb5a84013e7135b6e957623bdb429297bc16477a7f0a`.
- The temporary recipe draft was discarded without selecting or saving an ingredient. The updated plan, workflow, and batch notes passed UTF-8/no-BOM and mojibake checks; bundled seed JSON remains explicit-Unicode-escaped. `git diff --check` passed.
