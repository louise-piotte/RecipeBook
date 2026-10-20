# WP05 Section X: Culinary pandan leaves identity

- **Status:** leaf identity, package, unit, lint, APK, instrumentation, and Pixel 9a verification passed. R345 completed the independent Québec French display review; prepared-product boundaries remain open.
- **Accepted reference:** `ingredient-ref-pandan-leaves`, `pandan leaves / feuilles de pandan`, category `HERB`, no aliases.
- **Evidence record:** `ingredient-ref-pandan-leaves` in `research-ledger.v1.json`; sources WP05-PAN-S01–S08.
- **Cross-section owner:** WP05 owns this single raw-leaf identity. Sections K and U cross-reference it; no duplicate row was created.

## Identity boundary

NParks identifies *Pandanus amaryllifolius* and documents culinary uses of its leaves and leaf juice. Canadian English and French product listings use `pandan leaves` and `feuilles de pandan`; a Télé-Québec recipe uses the French name for leaves steeped in coconut milk and removed before serving. R345 retained the descriptive local wording without an OQLF-preferred-term claim; see the [terminology review](../proposals/wp05-pandan-quebec-french-terminology-review-r345-20261016.md).

No aliases or forms were added. Keep leaf juice, fresh extract, leaf powder, extract powder, essence, paste, and pandan-infused kaya outside this row. The reviewed sources show different preparation routes and product-specific formulations; no generic equivalence is supported.

## Measurement and substitution evidence

Product pack weights, industrial extract specifications, and the five-leaf recipe quantity do not provide a general density, household-volume conversion, package yield, or leaf-to-prepared-product ratio. No measurement observation, default density, unit mapping, form conversion, or active substitution rule was added. King Arthur's contextual dessert guidance is retained as blocked research because the prepared products and use methods are not interchangeable with the raw-leaf identity.

## Audit and validation

- The merge-time audit found no normalized-key collision among 412 references and 16 forms. The 114 bundled recipes / 1,123 ingredient rows had no pandan mention or ingredient line.
- Package validation, reference normalization, generated-index check, 9 Python package tests, and `git diff --check` passed.
- Android checks passed: 277 unit tests, `lintDebug`, debug APK and Android-test APK assembly. Pixel 9a/API 36 connected instrumentation reported 29 cases: 27 passed, 2 QA-only assumption skips, and 0 failures.
- Live picker search `pandan` returned `pandan leaves` in English and `feuilles de pandan` in fr-CA. The unsaved probe was discarded; the fr-CA home screen returned to 114 recipes.
- Verification used the isolated `/tmp/recipebook-pixel9a-userdata.img`. The original Pixel_9a AVD was restored; `app.recipebook` remains uninstalled there and `/data` has 402 MB available.

Screenshots (1080×2424):

- [English picker result](pixel9a-pandan-picker-en.png), SHA-256 `3ce80803d7a92897e0951965020d7412631dcefa45afc9fa10397389886019f1`.
- [fr-CA picker result](pixel9a-pandan-picker-fr-ca.png), SHA-256 `af742b20fb07c8d301fe7631a5e3f6e639ea72c10cda3eac0856e76795ed25f9`.

Reference JSON SHA-256: `5f7cca9264d410c2c2e619321fc0daa7ed6a6907630225dd490ba0894ce8288e`; evidence ledger SHA-256: `db6ac4439396eca82f5f66508d30d538f5b4686431e09d87240239060143c647`.

Sources:

- [Singapore NParks, *Pandanus amaryllifolius*](https://www.nparks.gov.sg/florafaunaweb/flora/2/2/2299) — species and culinary leaf uses.
- [La Plantation Canada, pandan leaves](https://laplantation.ca/products/pandan-leaves-infusion-50g) and [French product listing](https://laplantation.ca/fr/products/pandan-leaves-infusion-50g) — local English/French labels and one dehydrated-leaf product declaration.
- [Télé-Québec, Durian au riz gluant](https://cuisinez.telequebec.tv/recettes/6451/durian-au-riz-gluant) — Québec French recipe use and removal method.
- [King Arthur Baking, baking with pandan](https://www.kingarthurbaking.com/blog/2021/08/20/baking-with-pandan-chiffon-cake) — preparation and commercial-product boundaries.

The full independent source-to-claim map is in [`../proposals/wp05-pandan-product-boundary-review-20261009.md`](../proposals/wp05-pandan-product-boundary-review-20261009.md) and the earlier WP05 packet [`../proposals/wp05-southeast-asian-pandan-followup.md`](../proposals/wp05-southeast-asian-pandan-followup.md).
