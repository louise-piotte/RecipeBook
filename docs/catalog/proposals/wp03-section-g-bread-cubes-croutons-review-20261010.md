# WP03 Section G bread-cubes and croutons review — 2026-10-10

- **Packet type:** source review with accepted identity-only integration recorded below.
- **Scope:** generic bread cubes and croutons only. Generic fresh/dry breadcrumbs, integrated panko, cracker crumbs, matzo meal, and Graham crumbs are excluded.
- **Disposition:** integrated `croutons / croûtons` as `ingredient-ref-croutons`, with no recipe relinks. Keep generic bread cubes as recipe-preparation wording, not an ingredient reference. No measurement, form, yield, conversion, or substitution was added.
- **Online source access date:** 2026-10-10.

## Checklist mapping

The active [Section G checklist](../../../docs/RecipeBook-global-ingredient-catalog-plan.txt) keeps the combined line “Fresh/dry breadcrumbs, panko, cracker crumbs, graham crumbs, matzo meal, bread cubes, and croutons” open. Its panko child is checked; the existing [panko review](wp03-section-g-panko-identity-review-20261010.md) and [cracker-crumb/matzo-meal review](wp03-section-g-cracker-matzo-crumb-boundary-review-20261010.md) remain closed and are not reconsidered here. This packet addresses only the bread-cube/crouton portion and does not close the combined checklist line.

## Current snapshot and audit

Snapshot read 2026-10-10. I scanned every ingredient row in the 114 manifest-listed recipe files, checking `originalText`, `ingredientName`, `ingredientRefId`, preparation, and notes for `crouton` / `croûton`, `bread cube(s)`, `cube(s) of bread`, `cubes de pain`, and related French/English variants. There are **0 exact target rows among 1,123 ingredient rows**. No recipe-local paths or relinks apply. The ordered corpus digest is SHA-256 over each manifest-relative path, a NUL byte, and that file’s raw bytes, concatenated in manifest order.

| Artifact | Current count | Bytes | SHA-256 |
| --- | ---: | ---: | --- |
| [Seed manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipes | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| [Ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 869 references | 273,678 | `b51bf8e8aa2198b54e789eca1063bb843e29ac157bea7cfae98d3329e9dc810a` |
| [Ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 48 forms; no bread-cube or crouton forms | 33,483 | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| [Research ledger](../research-ledger.v1.json) | 1,115 records; no bread-cube or crouton record | 2,848,649 | `481f3718f9b7ef27035584edb5c0c4dc4d9ca5d2ae6eb80443871104e86dff1e` |
| [Legacy identity candidates](../legacy-import-identities.v1.json) | 78 candidates; no bread-cube or crouton candidate | 18,736 | `f998916c08bf8f095be6d4ff252d647eb2c44945638a24c70db688f8dd3b6abf` |
| Manifest-listed recipe corpus | 1,123 ingredient rows; 751,959 recipe-file bytes; 0 target rows | — | Ordered digest `009a0dbd340a3e85e8a6809bc19e871f911b110357b127d55f7eb50c0cbf1055` |

At the proposal snapshot, the exact names and aliases checked across all active references and forms had no `bread cubes`, `cubes of bread`, `cubes de pain`, `crouton(s)`, or `croûton(s)` owner. Integration now adds `ingredient-ref-croutons`; bread-cube wording remains without an ingredient reference. The legacy file contains the adjacent generic candidate `ingredient-ref-bread-crumbs` (`bread crumbs` / `chapelure`); its unresolved record is outside this scope. The previous crumb review recommends reconciling it into active `ingredient-ref-breadcrumbs`, not creating another breadcrumb identity.

## Adjacent active identities and exclusions

| Current ID | Current bilingual names / aliases | State and scope disposition |
| --- | --- | --- |
| `ingredient-ref-breadcrumbs` | EN `bread crumbs`; aliases `breadcrumbs`, `dried bread crumbs`. FR `chapelure`; no aliases. | Keep generic bread crumbs separate. Ledger identity remains `unreviewed`; measurement and substitution remain `not_yet_researched`. The dried wording on recipe row `074#5` remains row-level detail; no fresh/dry form is opened here. |
| `ingredient-ref-panko` | EN `panko bread crumbs`; aliases `panko`, `panko breadcrumbs`, `Japanese breadcrumbs`, `Japanese bread crumbs`. FR `chapelure panko`; aliases `panko`, `chapelure japonaise`. | **Exclude:** integrated identity, already verified, with exact relinks at `019#9`, `023#2`, and `087#4`. Keep it separate from ordinary bread crumbs and croutons. Its current measurement disposition is `researched_no_supported_value`; substitution is `not_yet_researched`. |
| `ingredient-ref-graham-cracker-crumbs` | EN `graham cracker crumbs`; no aliases. FR `chapelure de biscuits graham`; alias `chapelure de gaufrettes Graham`. | Exclude the distinct Graham-biscuit product and its rows `006#5`, `026#1`, and `081#1`; they are neither bread cubes nor croutons. |
| `ingredient-ref-brioche-bread`, `ingredient-ref-english-muffin`, `ingredient-ref-bread-flour` | `brioche bread` / `pain brioche`; `english muffin`; `bread flour` / `farine à pain`. | Adjacent bread products, not aliases for bread cubes or croutons. |

No active alias collision was found for the proposed crouton names. Do not add bread-cube wording to any crumb or panko alias list.

## Boundary and recommendation

| Target | Recommendation | Proposed display / aliases | Boundary and recipe action |
| --- | --- | --- | --- |
| Croutons | **Integrated as identity-only reference** `ingredient-ref-croutons`. | EN display `croutons`; alias `crouton`. FR display `croûtons`; alias `croûton` (accent-insensitive search also covers the accepted unaccented spelling). | OQLF defines a croûton as a small piece or cube of dry, fried, or toasted bread, and notes its use as a soup or salad garnish [S01]. Dare’s French-language product page uses *croutons* for a prepared, lightly toasted, seasoned bread product and lists several market variants [S02]. Keep the general unbranded product identity separate from bread cubes, generic crumbs, panko, and cracker-derived crumbs. No bundled line to relink. |
| Generic bread cubes | **Hold; do not create an ingredient reference or alias set.** | No catalog display or aliases proposed. Keep `bread cubes`, `cubes of bread`, and `cubes de pain` as line-level source wording when encountered. | “Cubes” reports cut shape rather than a stable product state: a Canadian government cookbook calls for *soft bread cubes* in stuffing and separately gives a direction to toast bread cubes [S04]. A Québec recipe starts with baguette cut into cubes and subsequently oils, seasons, and bakes them until crisp [S03]. Do not assume those cubes are ready-to-use croutons; do not map cube wording to crumb references. No bundled line to relink. |

The integrated ID represents the generic crouton product rather than any one manufacturer, seasoning, bread type, package, or cube size. This packet supports the product category and French wording, but there is no bundled demand to justify relinking or choosing a more specific variant.

## Measurement and substitution disposition

No source-backed measure, density, package yield, conversion, or substitution was established for generic croutons or bread cubes. The manufacturer page gives product-specific package and product information, not a general conversion basis. Do not transfer those label details to a catalog-wide rule. The integrated crouton ledger record keeps measurement and substitution research not yet researched. No conversion between bread cubes, croutons, breadcrumbs, panko, or other crumb products is active.

## Focused future fixtures

1. `croûtons`, `croûton`, and unaccented `croutons` / `crouton` return the integrated `ingredient-ref-croutons` search result.
2. English `bread cubes` / `cubes of bread` and French `cubes de pain` return no crouton identity; preserve them as source-level preparation wording.
3. `bread crumbs` / `breadcrumbs` / `chapelure` continue to resolve to `ingredient-ref-breadcrumbs`; panko terms continue to resolve to the already integrated `ingredient-ref-panko`.
4. Do not infer a crouton form, weight per cup, count-to-mass conversion, substitution rule, or recipe relink from these identity fixtures.

## Sources and access limits

| ID | Source and supported claim | Access note |
| --- | --- | --- |
| **S01** | Office québécois de la langue française, [*croûton* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8429219/crouton). Defines the product as a small piece or cube of dry, fried, or toasted bread; identifies soup/salad garnish use; gives English `crouton` and preferred French `croûton`, while listing `crouton` as accepted under the 1990 spelling rectifications. | Direct page opened 2026-10-10. Terminology authority; no measurements. |
| **S02** | Les Aliments Dare, [Boulangerie Grissol Croutons — French brand page](https://www.darefoods.com/fr/brand/boulangerie-grissol-croutons/). Uses *croutons* in French for fresh bread that is lightly toasted and seasoned; lists four branded flavor/style variants. | Manufacturer page opened 2026-10-10. Product naming and product-family evidence; it does not define all possible crouton formulations. |
| **S03** | Recettes du Québec, [*Croûtons pour salade César*](https://www.recettes.qc.ca/recettes/recette/croutons-pour-salade-ceasar-189713). The recipe cuts baguette into small cubes, oils and seasons them, then bakes them until crisp; its note says the bread should not be fresh that day. | Direct page opened 2026-10-10. Québec recipe usage only; does not set a universal crouton specification or conversion. |
| **S04** | Fisheries and Marine Service, [*The Way to Cook Fish*](https://waves-vagues.dfo-mpo.gc.ca/library-bibliotheque/40843117.pdf), catalogue mark `FS 32-37/1975`, pp. 10–11. Uses “soft bread cubes” in stuffing and separately describes toasting bread cubes for a topping. | Government of Canada PDF opened 2026-10-10. The scan/OCR is imperfect in places; the cited ingredient and method text is legible. Supports the state ambiguity of bread-cube wording only. |
| **S05** | Ministère de l’Agriculture, des Pêcheries et de l’Alimentation du Québec, [Répertoire des aliments québécois product listing](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8247412), Boulangerie Grissol Classic Style Garden Herb, GTIN `056951454904`. | Product record was opened 2026-10-10. The site rendered its interface/product fields in English in the opened view; it corroborates a marketed Québec crouton product, while the manufacturer’s French page (S02) grounds French usage. |

## Remaining Section G work

This review leaves the combined breadcrumb/crouton checklist line open. Fresh/dry generic breadcrumb questions remain open; panko and the three new identity-only references for cracker crumbs, matzo meal, and croutons are integrated; the Graham-crumb identity and its rows are untouched. Bread cubes remain preparation wording with no bundled demand. Croutons have no recipe references or numeric behavior.
