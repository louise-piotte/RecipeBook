# WP03 Wheat Berries and Steel-Cut Oats (Section F)

- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** integrate source-backed wheat-berry and steel-cut-oat names as identity-only references; review broken rice evidence without allocating an active identity.
- **Dependencies:** WP01 identity/form decision for rice states; independent Québec French review remains open.

**Follow-up (2026-10-07):** The broken-rice candidate in this earlier checkpoint was later integrated
as `broken rice / riz en brisures`, an identity-only milling-grade reference. The current Canadian
Customs Tariff supplies the bilingual name; Codex scopes broken-kernel classes to rice for direct
human consumption. See `broken-rice-identity.md` for the current decision and verification.

## Identity decisions

| ID / record | English | fr-CA | Disposition |
| --- | --- | --- | --- |
| `ingredient-ref-wheat-berries` | wheat berries | grains de blé entiers | Integrated in `GRAIN_AND_CEREAL`. Canadian product sources describe edible whole wheat kernels; the federal French food-grain specification supplies the bilingual wording [S57–S59]. Keep separate from cracked wheat, bulgur, wheat flour, and species-specific wheat rows. |
| `ingredient-ref-steel-cut-oats` | steel-cut oats | avoine découpée | Integrated in `GRAIN_AND_CEREAL` from OQLF's direct bilingual entry and product definition [S60]. Keep separate from whole oat groats and rolled/quick oats. Do not use the discouraged *avoine épointée*. |
| `ingredient-ref-broken-rice` | broken rice | brisures de riz | **Unresolved candidate only**, recorded as `recordType: candidate` with `identityState: needs_clarification`. Codex and Québec retail evidence support edible broken-rice products, but the OQLF entries are brewing-scoped and Codex also treats broken kernels as rice quality classes. Resolve identity versus form with WP01's rice-state decision before allocation. Keep brewer's rice, rice grits, rice screenings, cracked rice, *riz cassé*, and *riz brisé* inactive as global aliases [S61–S66]. |

The two active rows have empty alias arrays, null density, empty unit mappings, and no forms, unit conversions, cooking yields, measurements, or substitutions. No recipe lines matched either new active identity or the broken-rice candidate, so no recipe was changed.

## Data and verification

- The canonical seed contains 344 references; `ingredient-references.v1.json` SHA-256 is `136feb056112df94ba254d01b6fb3dc597f1791863667a2dc1a21f6aad8304de`.
- The research ledger contains 501 records; SHA-256 is `ec02b77bd80616705ab5016117a1a15fdb60e08203093a6909ba01eecaca13c9`.
- `BundledIngredientCatalogTest` covers both entries as name-only identities. `RecipeEditorScreenTest` checks English and French picker lookup and rejects `avoine épointée`. The Android unit suite passed 247 tests.
- The split seed package was normalized and checked; the generated Kotlin catalog matches the seed. The Python seed-package suite passed all 9 tests.
- Pixel 9a / Android 16 live picker checks showed one English result for `wheat berries` and `steel-cut oats`; French searches showed `grains de blé entiers` for `grains de ble entiers` and `avoine découpée` for `avoine d`. The French home screen returned to `Toutes les recettes (114)` after the blank draft was discarded.
- The first APK install was rejected for insufficient emulator storage. After uninstalling `app.recipebook`, the deployment script installed and launched successfully. This cleared emulator-local app data; the bundled library was reseeded to 114 recipes. Repository and user data were not affected.
- The recipe picker and home screenshots are stored alongside this packet:
  - `pixel9a-wheat-berries-picker-en.png`
  - `pixel9a-steel-cut-oats-picker-en.png`
  - `pixel9a-wheat-berries-picker-fr-ca.png`
  - `pixel9a-steel-cut-oats-picker-fr-ca.png`
  - `pixel9a-wheat-berries-steel-cut-oats-home-fr-ca-114.png`

## Remaining review

- Obtain independent Québec French review for *grains de blé entiers* and *avoine découpée*.
- Broken rice was later resolved as a separate identity after the generic rice dry/cooked model was established; see `broken-rice-identity.md`.
- Continue the remaining Section F identities, oat-grain boundaries, and dry/cooked rice, quinoa, and oat-bran decisions.

## Sources

- [S57. Department of National Defence, Food Quality Specifications – Cereal Grain (French)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-fra.pdf)
- [S58. Arva Flour Mills, Soft Wheat Berries](https://arvaflourmills.com/products/soft-wheat-berries-bulk)
- [S59. Fresh Acres, Organic Hard Spring Red Wheat Berries](https://freshacres.ca/products/organic-wheat-berries)
- [S60. OQLF, avoine découpée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26574686/avoine-decoupee)
- [S61. OQLF, brisures de riz (1982)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8890710/brisures-de-riz)
- [S62. OQLF, brisures de riz (1986)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2088658/brisures-de-riz)
- [S63. Codex Standard for Rice CXS 198-1995](https://www.fao.org/input/download/standards/61/CXS_198e.pdf)
- [S64. Government of Canada, CUSMA Canadian Tariff Schedule (French)](https://www.international.gc.ca/trade-commerce/trade-agreements-accords-commerciaux/agr-acc/cusma-aceum/text-texte/tariff-schedule-liste-canada.aspx?lang=fra)
- [S65. Marché Afritibi, brisures de riz au jasmin parfumé](https://afritibi.com/produit/brisures-de-riz/)
- [S66. Marché Afritibi, Jasmine Broken Rice](https://afritibi.com/en/produit/jasmine-broken-rice/)
