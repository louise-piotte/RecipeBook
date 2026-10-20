# Chocolate Form Hints

## Batch record

| Field | Value |
|---|---|
| Owners | WP02 identity reviewer; WP10 integration lead |
| Reviewers | Independent bilingual Québec French culinary reviewer — pending |
| Status | Integrated; independent review pending |
| Date | 2026-10-06 |
| Scope | Exact bilingual chips and melted-chocolate form hints for recipe-attested lines |
| Seed effect | Six forms added; reference identities unchanged; 12 recipe lines linked |

This is a narrow Section 03 / Section D follow-up to [the chocolate identity packet](chocolate-confectionery-identities.md). It records ingredient forms under existing chocolate identities. It does not close the broader baking or chocolate category reviews.

## Decisions

| Form ID | Base identity | Labels | Boundary |
|---|---|---|---|
| `ingredient-form-semisweet-chocolate-chips` | `ingredient-ref-semisweet-chocolate` | semisweet chocolate chips / pépites de chocolat mi-sucré | Chips wording remains a form of semisweet chocolate. |
| `ingredient-form-white-chocolate-chips` | `ingredient-ref-white-chocolate` | white chocolate chips / pépites de chocolat blanc | White chips remain under white chocolate. |
| `ingredient-form-dark-chocolate-chips` | `ingredient-ref-dark-chocolate` | dark chocolate chips / pépites de chocolat noir | Dark chips remain under dark chocolate. |
| `ingredient-form-milk-chocolate-chips` | `ingredient-ref-milk-chocolate` | milk chocolate chips / pépites de chocolat au lait | Milk chips remain under milk chocolate. |
| `ingredient-form-semisweet-chocolate-melted` | `ingredient-ref-semisweet-chocolate` | melted semisweet chocolate / chocolat mi-sucré fondu | Melting is represented as a recipe form, not a new ingredient identity. |
| `ingredient-form-white-chocolate-melted` | `ingredient-ref-white-chocolate` | melted white chocolate / chocolat blanc fondu | Melting is represented as a recipe form, not a new ingredient identity. |

The forms have no density. No mass/volume mapping, conversion, package yield, or substitution rule was added. The picker carries a form only when the complete normalized query matches one unique bilingual label or match term for the selected identity. The user still chooses the base ingredient result; a partial phrase such as `chips` does not infer a form. Displayed labels preserve their original accents and spelling.

## Evidence

- The [OQLF entry for *biscuit aux pépites de chocolat*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488333/biscuit-aux-pepites-de-chocolat) gives both *pépites* and *brisures* terminology for chocolate-chip wording. It supports the Québec French form terms, not a separate chocolate identity.
- Les Producteurs laitiers du Canada use *pépites de chocolat mi-sucré* in [Crème choco-moka](https://producteurslaitiersducanada.ca/fr/plaisirs-laitiers/recettes/creme-choco-moka) and *pépites de chocolat au lait* in [Chocolat chaud sur un bâton](https://producteurslaitiersducanada.ca/fr/plaisirs-laitiers/recettes/chocolat-chaud-sur-un-baton).
- [Zeste's green pea and white chocolate cookies](https://www.zeste.ca/recettes/galettes-vertes-aux-petits-pois-et-au-chocolat-blanc) list *pépites de chocolat blanc*.
- [Télé-Québec's hot-chocolate bombs](https://cuisinez.telequebec.tv/recettes/6230/bombes-de-chocolat-chaud) list *pépites de chocolat noir* and then direct the cook to melt them.
- [FIVEheartHOME's chocolate pudding](https://www.fivehearthome.com/easy-classic-homemade-chocolate-pudding/) explicitly names semisweet chocolate chips, melted.
- [Fashion Cooking's traditional fraisier](https://www.fashioncooking.fr/2016/09/fraisier-traditionnel/) calls for *chocolat blanc fondu* in the decoration step.

These sources support the bilingual wording and the recipe-attested states above. They do not establish a universal preparation or a numeric conversion.

## Recipe audit

The 114 bundled recipes were searched for chocolate-chip and melted-chocolate wording. Twelve explicit lines now carry a form ID: nine chip lines and three melted lines. Their `originalText` values remain intact. No unqualified combined chocolate line was assigned a form, and no line received a form solely because its amount or surrounding instructions suggested one.

## Implementation and verification

- Ingredient search preserves the existing base identity. A complete exact form phrase narrows results to the form's base identity; other searches retain the existing broad phrase behavior.
- Selecting a result with one exact matching form stores that `ingredientFormId` on the line and preserves the source wording as `ingredientAliasHint` / `originalText` behavior requires.
- An initialized bundled library adds new form IDs to its stored catalog without replacing a same-ID local edit or unrelated catalog entries. The refresh remains limited to libraries whose metadata identifies the bundled library.
- `:app:testDebugUnitTest` passed all 228 tests.
- Pixel 9a / Android 16 focused `IngredientFormHintInteractionTest` passed. It searched `chocolate chips`, selected semisweet chocolate, and verified the chips form ID and unchanged original line text on save.
- All nine Python seed-package tests passed. Bundled-package normalization/validation, reference normalization, generated-index freshness, research-ledger schema and alias-collision checks, UTF-8/no-BOM checks across 125 bundled JSON files, and `git diff --check` passed.
- `tools/deploy_to_pixel9a_emulator.sh` passed its Gradle `test` and debug-assembly steps, installed the APK, and launched the app. Live picker search showed one semisweet-chocolate result with the chips form sublabel; selecting it showed that form on the editor row. The unsaved probe was discarded, and the home screen still showed 114 recipes.
- Pixel 9a screenshots: [search result](pixel9a-chocolate-chip-form-search.png), [selected form on the editor row](pixel9a-chocolate-chip-form-selected.png), and [home after discarding the probe](pixel9a-chocolate-form-hints-home-114.png).

## Remaining work

- Obtain independent Québec French review of the six labels and match terms.
- Continue the broader WP02 baking and Section D confectionery review; this batch does not cover other chocolate bar, wafer, fève, nib, grated, chopped, coating, cocoa, or confectionery identities.
