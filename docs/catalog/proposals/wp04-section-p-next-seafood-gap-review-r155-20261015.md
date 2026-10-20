# WP04 Section P — smoked oyster product boundary (R155)

- **Review and source-access date:** 2026-10-15.
- **Candidate:** Canadian packaged smoked oyster products sold as `smoked oysters` / `huîtres fumées`, including oil-packed products.
- **Recommendation:** **Hold** outside active references, forms, legacy mappings, and the research ledger. Do not attach a general smoked-oyster phrase to an oyster species or add a universal smoked/canned form.
- **Scope:** one named preserved-seafood product boundary. This review does not reopen fresh-oyster identities, dried oyster, oyster sauce, the generic preserved-fish review, or the R154 kipper hold.
- **Proposal-only status:** this file is the only proposed artifact. No shared catalog, ledger, manifest, recipe, plan, roadmap, or generated file was changed. No tests, emulator, app, or deployment work was run.
- **Proposal-local source IDs:** `WP04-SECTIONP-CANNED-SMOKED-OYSTER-R155-20261015-S01` through `S07`, plus audit ID `WP04-SECTIONP-CANNED-SMOKED-OYSTER-R155-20261015-R01`. They are provenance labels in this review only, not shared-ledger records.

## Why this is the next unfinished candidate

The [Section P fish checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4954) and its [preserved-seafood checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5730) remain open. The [broad preserved-fish product-state review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md) names Ocean’s smoked oysters as an example while keeping universal preservation forms inactive; it does not determine whether this named product merits a reference or a form. The [fresh-oyster boundary review](wp04-section-p-fresh-oyster-identity-boundary-review-20261012.md) keeps smoked/canned oysters distinct from fresh shell, shucked, frozen, and dried oysters, but does not decide this product. A scan of Section P proposals and batch notes found no focused smoked-oyster identity or product-boundary decision. R154 reviewed and integrated a separate kipper hold; this review does not reopen it.

The live package contains **1,526 ingredient references**, **119 forms**, **61 legacy candidates**, and **1,871 ledger records / 7,921 source entries / 6,772 distinct source IDs**. Its manifest lists **114 recipe files / 1,123 ingredient rows**. No active identity or exact reference/form/legacy/ledger owner exists for the candidate phrases or either possible ID `ingredient-ref-smoked-oyster` / `ingredient-ref-canned-smoked-oyster`. No ID is allocated or reserved under this hold.

## Current product and terminology evidence

Ocean’s current English and French pages describe smoked oysters in sunflower oil. The manufacturer identifies *Crassostrea gigas* (Pacific oyster), aquaculture, and processing/packaging in China; its listed ingredients are smoked oysters, sunflower oil, and salt. The French product title is `Huîtres fumées dans l’huile de tournesol`. Those pages describe one brand product and are not independent evidence for every item sold as smoked oysters. [S01–S02]

Clover Leaf’s current French page calls its product `Huîtres fumées Clover Leaf`, says it is hardwood-smoked and packed in sunflower oil, and lists *Crassostrea gigas*. Its details identify small and medium sizes, China sourcing/packing, and ingredients of oysters, sunflower oil, salt, and smoke. The nutrition panel is for **one can drained (65 g)**. These are Clover Leaf product details, not a common smoked-oyster specification or a reusable recipe measure. [S03]

Metro’s current Québec online listing is titled `Huîtres fumées entières Irrésistible`, **85 g**, with ingredients `Huîtres fumées, Huile de tournesol, Sel`. The listing gives no scientific species or smoking specification and cautions that supplier information can change. It establishes current Québec retail wording and one package size, not equivalence with the two manufacturer products. [S04]

OQLF’s GDT entry for bare `huître` pairs the term with American oyster, *Crassostrea virginica*, while noting both cupped *Crassostrea* and flat *Ostrea* oysters. Its separate species entry pairs `huître creuse du Pacifique` with Pacific oyster, *C. gigas*. These entries do not define a general smoked-oyster product class; they caution against using bare species wording to erase the distinction between the product pages’ species declarations and Metro’s species-unspecified SKU. Both terminology pages were last updated in 2012. [S05–S06]

The CFIA Fish List explains that it pairs acceptable Canadian English/French fish names with scientific names. This is species-labeling context, not evidence that `smoked oyster` is a taxon or a standardized preparation. [S07]

The products establish that smoked oysters are commercially named in English and Québec French, but leave a catalog boundary unresolved: Ocean’s and Clover Leaf identify *C. gigas*, while the Metro listing does not. A future exact recipe/product request may call for a product-specific identity, or a smoked product form linked to a species reference, depending on the SKU. Neither a generic state row nor a form on all oyster species is supported here.

## Exact ownership and identifier checks

The audit compared accent/punctuation-normalized exact terms across every active bilingual reference name and alias, every form label and match term, all legacy candidate names and aliases, ledger record IDs/terms, and the focused proposal/batch archive.

| Candidate key or ID | Current owner | Decision |
|---|---|---|
| `smoked oyster`; `smoked oysters`; `canned smoked oyster(s)`; `huître fumée`; `huîtres fumées`; `huîtres fumées entières` | No exact active reference, form, legacy, or ledger-term owner. | No existing exact row or form to reuse. Retail/package wording remains source-specific under the hold. |
| `ingredient-ref-smoked-oyster`; `ingredient-ref-canned-smoked-oyster` | Absent from active references, legacy candidate IDs, and ledger record IDs. | Neither ID is allocated or reserved. |
| `WP04-SECTIONP-CANNED-SMOKED-OYSTER-R155-20261015-S01`–`S07`; `…-R01` | Absent from the ledger and proposal/batch archive at audit time. | Proposal-local provenance only; do not copy into the shared ledger. |
| `Pacific oyster / huître creuse du Pacifique`; `Eastern oyster / huître de l’Est`; `European flat oyster / huître plate`; `dried oyster / huître séchée` | Existing species/product-specific references. | Keep their scopes intact. Do not put a general smoked-oyster phrase on any of these rows. |
| Oyster-adjacent results | Existing dried, Eastern, European flat, Kumamoto, and Pacific oyster rows; king/oyster mushrooms, oyster sauce, and vegan oyster sauce. | These are not owners of smoked-oyster product phrases and are not substitutes for this review. |

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): fold accents/punctuation, search bilingual names, aliases, and attached form terms, prefer complete word phrases, then use substring fallback when there is no complete phrase. The hypothetical row used only to measure impact is a singular `smoked oyster / huître fumée` identity with plural aliases `smoked oysters` / `huîtres fumées`; it is not proposed data.

| Query | Current matches | Hypothetical one-row projection |
|---|---:|---:|
| `smoked oyster`; `smoked oysters`; `huître fumée`; `huîtres fumées` | 0 | 1 smoked-oyster product result |
| `oyster` | 9 | 10 |
| `oysters` | 4 | 5 |
| `huître` | 7 | 8 |
| `huîtres` | 6 | 7 |
| `Pacific oyster`; `dried oyster` | 1 each | Unchanged: 1 each |

The actual projection under the hold is unchanged. A candidate row would improve exact product searches, but would also add to broad oyster/huître queries that already mix species, dried product, sauces, and mushrooms. Metro’s phrase `whole smoked oysters` is a package title; it is not added as a generic alias. Without recipe demand or a selected product scope, the picker effect does not justify allocating a row.

## Bundled-recipe demand

The manifest-ordered audit parsed all **114** recipe files and all **1,123** structured ingredient rows, then searched full recipe JSON and ingredient rows for the candidate English/French singular/plural phrases, canned/whole smoked-oyster wording, and `oyster` / `huître` terms. **No oyster-related term or product link was found in the bundled recipes.** No amount, role, or recipe relationship selects smoked oysters. [R01]

Ocean’s and Clover Leaf have manufacturer recipe content associated with their products, but that external brand content is not a matching line in the bundled library and does not resolve the species-unspecified Metro product. It cannot be used as bundled recipe demand or as evidence for a common quantity.

## Forms, measures, density, conversions, yields, and substitutions

- **Forms:** The current 119-form file has no oyster/huître form. Add none. Smoking, canning, whole presentation, and packing medium are separate product details; the sources do not justify a universal form for all oyster species or a form attached to a species-unspecified product.
- **Measures:** Metro’s 85 g package and Clover Leaf’s 65 g drained nutrition basis are distinct label facts. Do not convert one to the other or treat either as a standard can size, serving, recipe quantity, edible yield, or drained yield. No measurement observation is proposed.
- **Density and mappings:** Existing oyster seafood references have no density or unit mappings. No density, count, household-volume, or mass/volume mapping is supported.
- **Conversions and yields:** The ledger’s eight unit conversions and the package-yield file contain no oyster match. No draining, net-to-drained, can-to-mass, cooked/raw, smoke, or edible-yield conversion is established.
- **Substitutions:** Neither substitution file contains oyster rules, and the bundled recipes provide no contextual use. Do not propose substitution to fresh oysters, dried oyster, oyster sauce, or another smoked seafood.

## Proposed reference and ledger delta

**No reference, form, legacy mapping, or ledger delta is proposed.** Do not create `ingredient-ref-smoked-oyster` or `ingredient-ref-canned-smoked-oyster`, attach the product wording to *C. gigas* or another oyster species, or record product-specific package/nutrition facts as reusable measurement behavior. The proposal-local source IDs are not shared-ledger records. No JSON block applies because the proposed data delta is empty.

## Source register

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-CANNED-SMOKED-OYSTER-R155-20261015-S01** | Ocean’s, [Smoked Oysters in Sunflower Oil](https://oceans.ca/products/canned-smoked-oysters/), accessed 2026-10-15. | Manufacturer identifies *Crassostrea gigas*, aquaculture, Pacific harvest, China processing/packaging, sunflower oil, salt, and natural smoke. One brand SKU; not a taxonomy crosswalk for generic retail labels. |
| **WP04-SECTIONP-CANNED-SMOKED-OYSTER-R155-20261015-S02** | Ocean’s, [Huîtres fumées dans l’huile de tournesol](https://oceans.ca/fr/products/huitres-fumees-dans-lhuile-de-tournesol/), accessed 2026-10-15. | Current French-language page for the same Ocean’s product as S01. Supports the product phrase and Quebec-facing manufacturer terminology; not an independent product or species source. |
| **WP04-SECTIONP-CANNED-SMOKED-OYSTER-R155-20261015-S03** | Clover Leaf, [Huîtres fumées Clover Leaf](https://www.cloverleaf.ca/fr/produits/huitres-fumees-clover-leaf/), accessed 2026-10-15. | Manufacturer identifies *C. gigas*, hardwood smoke, sunflower oil, small/medium oyster sizes, China sourcing/packing, listed ingredients, and a nutrition basis of one can drained (65 g). These are product-specific claims and label basis only. |
| **WP04-SECTIONP-CANNED-SMOKED-OYSTER-R155-20261015-S04** | Metro, [Huîtres fumées entières Irrésistible 85 g](https://api.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/huitres-fumees-entieres/p/059749872126), accessed 2026-10-15. | Current Québec retailer listing, SKU 059749872126; title, package size, and ingredient statement. No scientific species or smoke-process detail; retailer cautions supplier information can change. |
| **WP04-SECTIONP-CANNED-SMOKED-OYSTER-R155-20261015-S05** | OQLF, [GDT: huître](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198865/huitre), last updated 2012; accessed 2026-10-15. | Pairs bare `huître` with *Crassostrea virginica* and notes cupped *Crassostrea* and flat *Ostrea* types. Terminology evidence, not a smoked-product definition. |
| **WP04-SECTIONP-CANNED-SMOKED-OYSTER-R155-20261015-S06** | OQLF, [GDT: huître creuse du Pacifique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198688/huitre-creuse-du-pacifique), last updated 2012; accessed 2026-10-15. | Pairs `huître creuse du Pacifique` / Pacific oyster with *Crassostrea gigas*. Species terminology only; it does not establish that all smoked-oyster SKUs are Pacific oyster. |
| **WP04-SECTIONP-CANNED-SMOKED-OYSTER-R155-20261015-S07** | CFIA, [CFIA Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), accessed 2026-10-15. | Describes the list’s pairing of acceptable Canadian common names and scientific names. General species-labeling context, not a product-state or smoke/canning standard. |
| **WP04-SECTIONP-CANNED-SMOKED-OYSTER-R155-20261015-R01** | [Bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), bundled recipe files, and focused Section P archive; accessed 2026-10-15. | Static ownership, source-ID, picker, and manifest audit against 1,526 references, 119 forms, 61 legacy candidates, 1,871 ledger records / 7,921 source entries / 6,772 distinct source IDs, and 114 recipe files / 1,123 ingredient rows. Repository snapshot; does not establish product availability beyond the linked pages. |

## Final disposition

**Hold** the smoked-oyster product boundary outside active references, forms, legacy mappings, and the ledger. Preserve the existing Pacific, Eastern, European flat, and dried oyster scopes. Reopen when a bundled recipe or explicit product request identifies whether it needs a species-specific smoked product or a general product label; then confirm the exact bilingual name, species scope, package state, and picker consequences. No data was changed, and no tests were run for this documentation-only proposal.
