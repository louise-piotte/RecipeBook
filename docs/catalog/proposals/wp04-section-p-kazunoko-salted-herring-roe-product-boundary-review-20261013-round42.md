# WP04 Section P — kazunoko / salted herring roe product-boundary review (round 42)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** proposal-only Canadian/Québec naming, product boundary, ownership, picker, recipe-demand, and numeric-evidence review.
- **Recommendation:** Hold plain kazunoko / salted herring roe outside active references, forms, and the shared ledger until a bundled recipe requests it with enough product context. Add no alias, form, measure, recipe link, conversion, yield, or substitution now.
- **Write scope:** This proposal file only. No shared catalog, ledger, checklist, roadmap, recipe, code, or batch README changed.
- **New source-ID prefix:** `WP04-SECTIONP-KAZUNOKO-20261013-R42-`. The prefix was absent from the active ledger and archive before this review; IDs below remain local to this proposal.

## Bounded gap and decision

The live Section P checklist leaves [roe products open](../../RecipeBook-global-ingredient-catalog-plan.txt#L4378). Its salmon-roe hold expressly leaves other roe identities unrepresented. The distinct candidate here is **kazunoko**, the herring-roe product sold as intact roe skeins. The current Canadian product pages and processor catalogue show a named product, but the bundled recipe corpus has no demand for it. Keep the candidate held.

This review covers the plain herring-roe-skein product only. It does not cover the separate spawn-on-kelp product: Canfisco distinguishes extracted herring roe (`kazunoko`) from kelp carrying herring roe spawn (`herring roe on kelp / komochi kombu`), and Aero Trading likewise separates `Kazunoko` from `Kazunoko Kombu`. Do not use `Kazunoko Kombu`, `Komochi Kombu`, `spawn-on-kelp`, or `œufs de hareng sur algue` as aliases for plain kazunoko. [S01, S07]

The bounded English evidence is **kazunoko / herring roe**. Canadian Government French usage gives **kazunoko salé et aromatisé (œufs de hareng)**; current Québec government material also uses **œufs de hareng** for herring roe generally. OQLF’s entry is broader, preferring **œufs de poisson** for *fish roe*; it does not provide a kazunoko-specific term. These sources support a French explanation for the product, not a Québec retail package label or a universal seasoning statement. [S03–S05]

Keep the roe product as a separate boundary from `ingredient-ref-atlantic-herring` and `ingredient-ref-pacific-herring`; neither whole-fish row should own a processed roe product. Canfisco and Aero Trading both place their own Canadian Kazunoko products in a Pacific-herring context. Canfisco's product-origin table itself says only `Herring`, and none of these sources supplies a scientific name. Treat the Pacific-herring statement as supplier-specific evidence, not a universal definition for every product sold as kazunoko; verify the exact recipe package or supplier before assigning species if the candidate is later integrated. Keep salted roe skeins separate from whole herring, roe on kelp, salmon roe, lumpfish roe, tobiko, masago, mentaiko, bottarga, sturgeon caviar, sea-urchin roe, and generic fish eggs. [S01, S02, S07]

## English and Québec French naming boundary

| Wording | Evidence and limit |
|---|---|
| **kazunoko / herring roe** | Canfisco’s Canadian product catalogue names a separate `Herring Roe (Kazunoko)` line; a current Toronto retailer uses `Kazunoko / Herring Roe / 数の子`. This is a named roe product, not a whole-herring identity. [S01–S02] |
| **salted herring roe** | The Toronto retailer describes its 200 g kazunoko as salted herring roe cured in saltwater brine and marinated with soy-dashi seasoning. This supports that seller’s SKU description; it does not establish one formulation or salt level for every kazunoko product. [S02] |
| **kazunoko salé et aromatisé (œufs de hareng)** | Agriculture and Agri-Food Canada used this French wording in a 2014 release about the Canadian Pacific Kazunoko Association. It is official Canadian French product wording, but not a current package label or an OQLF-specific entry. [S03] |
| **œufs de hareng** | The Québec government’s current marine-products page identifies herring roe as a high-value export product. This supports the French noun phrase, but not a product-specific preparation name. [S04] |
| **œufs de poisson** | OQLF’s preferred generic Québec term for `fish roe`. It is an umbrella term; do not use it as an alias that collapses different roe products. [S05] |
| **kazunoko kombu / komochi kombu; herring roe on kelp / spawn-on-kelp** | Supplier and processor sources use these names for a separate roe-on-kelp product. Keep them out of this candidate’s name and aliases. [S01–S02] |

No OQLF entry specifically naming kazunoko was found. The proposed French phrase is therefore a source-backed descriptor, not a claim that OQLF has standardized a product name. Canadian processors identify Pacific herring for their own Kazunoko products, but no scientific species name is inferred and that supplier context is not generalized to every kazunoko product.

## Exact ownership and archive audit

The live package contains **1,369 active references**, **100 forms**, **64 legacy-import candidates**, and **1,699 research-ledger records**. Exact checks covered reference names and aliases, form labels and match terms, legacy-candidate names and aliases, ledger record IDs and source text, and the proposal/batch archive. No active reference, form, legacy candidate, or dedicated ledger candidate owns `kazunoko`, `数の子`, `salted herring roe`, or `kazunoko salé`. No prior matching Section P R42 proposal or duplicate source-ID-prefix collision was found. [R01]

| Nearby live owner or prior mention | Exact boundary |
|---|---|
| `ingredient-ref-atlantic-herring` / `Atlantic herring` / `hareng de l’Atlantique` | Species identity only; no roe product or roe form. |
| `ingredient-ref-pacific-herring` / `Pacific herring` / `hareng du Pacifique` | Species identity only; its ledger source discusses commercial roe and spawn-on-kelp fisheries as context. It does not allocate a roe product. |
| `ingredient-ref-greenland-halibut` / `Greenland halibut` / `flétan du Groenland` | Current accidental substring result for the bare query `roe`; it is not a roe owner. |
| `ingredient-ref-kombu` / `kombu` | Kelp ingredient identity; it does not own a roe-on-kelp compound product. |
| `candidate-salmon-roe` | Separate held salmon-roe candidate; it does not own herring roe. |

The Pacific-herring identity review explicitly kept roe and spawn-on-kelp terms off the whole-fish reference. That preserves the product boundary used here; it did not make a product identity or a recipe-linked decision for kazunoko. Other proposal notes mention herring roe as one product-specific ingredient in tobiko/masago formulations, but no standalone kazunoko review or allocation was found. [R01]

## Picker projection

This static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize case, accents, ligatures, and punctuation; prefer complete word-phrase matches across reference and form terms; use substring fallback only when no phrase matches. It compares the live references/forms with a hypothetical row displayed as **kazunoko (salted herring roe) / kazunoko salé et aromatisé (œufs de hareng)**, with no aliases or forms. This display is a search projection only, not an integration proposal.

| Query | Current result | Hypothetical result | Picker effect |
|---|---|---|---|
| `kazunoko`; `salted herring roe`; `œufs de hareng` | None | Kazunoko only | The specific product becomes searchable in both languages. |
| `roe` | Greenland halibut / flétan du Groenland by substring fallback | Kazunoko only | The exact `roe` phrase would win over the fallback match and replace the current result. |
| `herring` | Atlantic herring; Pacific herring | Atlantic herring; Pacific herring; kazunoko | A broad whole-fish query would also surface a roe product. |
| `kazunoko kombu`; `komochi kombu` | None | None | No kelp-spawn terms are added to the roe-skein candidate. |
| `kombu` | Kombu | Kombu | No product alias changes the kelp result. |

The candidate-specific query would become useful, but a new row would also capture bare `roe` and broaden `herring`. With no recipe requesting this product, keep the row out of the picker.

## Bundled recipe demand

The scan covered all manifest-listed bundled recipes: **114 files and 1,123 ingredient rows**. It searched complete recipe documents and ingredient rows for `kazunoko`, `数の子`, `salted herring roe`, `herring roe`, `kazunoko salé`, `œufs de hareng`, `kazunoko kombu`, `komochi kombu`, `herring roe on kelp`, `spawn-on-kelp`, and `roe on kelp`. It found **zero matching recipe files and zero matching ingredient rows**. This establishes no demand in the bundled recipe corpus only; it does not cover recipes outside the bundle. [R01]

## Numeric and substitution limits

The current Toronto retailer page lists a **200 g** item. Ozawa Canada lists its separate `Kazunoko (Herring Roe)` item FS-1001A at **200 g**. Canfisco’s product catalogue lists bulk `Kazunoko` in **38 lb pails**. These are source-specific package declarations, not serving sizes, household measures, or equivalent products. Do not convert between a bulk pail and the retail item or infer piece count, density, edible yield, brining loss, or sodium content. [S01–S02, S06]

No bundled recipe or reviewed product source provides a recipe portion, measure-to-mass relationship, density, preparation yield, or validated conversion for this candidate. Add no active measure, unit mapping, density, form conversion, or package yield. The seller’s soy-dashi preparation and the processor’s bulk product wording do not establish one universal recipe-ready state.

No reviewed recipe or source supports substituting kazunoko for salmon roe, lumpfish roe, tobiko, masago, mentaiko, bottarga, sturgeon caviar, spawn-on-kelp, plain kelp/kombu, or herring flesh. Keep both global conversions and contextual substitutions absent; do not infer equivalence from a shared roe label, herring species, brining, or common cuisine.

## Recommended next action

Keep kazunoko unallocated and the Section P roe item open. Revisit when a bundled recipe names kazunoko or salted herring roe and gives enough context to choose between an intact roe-skein product, a seasoned SKU, or spawn-on-kelp. At that point, match the recipe line to its package label, verify species and preparation only from that item’s own evidence, and rerun the exact ownership, picker, and numeric review. Do not make either whole-herring row the ingredient identity or make kazunoko a generic roe/caviar alias; retain supplier-backed Pacific-herring provenance only if the selected recipe product supports it.

## Source register

Online pages were accessed on 2026-10-13. These proposal-local source IDs do not create ledger records.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-KAZUNOKO-20261013-R42-S01** | Canfisco Group, [Salmon and Herring Roe Products](https://canfiscogroup.com/wp-content/uploads/2023/06/CanfiscoGroup-products-2023-06.pdf), pp. 5–6; `Herring Roe (Kazunoko)` and `Herring Roe on Kelp (Komochi Kombu)`. | Canadian processor places its Kazunoko line in a section describing Pacific herring harvested mainly for roe; the product-origin table lists `Herring` and the line is packed in 38 lb pails. It separately describes kelp covered with roe spawn as brine-cured `komochi kombu`. Supplier-specific evidence, with no scientific name, recipe portion, or retail formulation. |
| **WP04-SECTIONP-KAZUNOKO-20261013-R42-S02** | Seaborn Toronto, [Kazunoko / Herring Roe / 数の子](https://www.seaborntoronto.com/product-page/kazunoko-herring-roe-%E6%95%B0%E3%81%AE%E5%AD%90), product title, 200 g listing, and description. | Current Toronto retail listing calls the product salted herring roe, says it is cured in saltwater brine and marinated with soy-dashi seasoning, and describes spring herring roe harvested off British Columbia. This is seller copy for one SKU, not a complete ingredient label, Québec French label, or species determination. |
| **WP04-SECTIONP-KAZUNOKO-20261013-R42-S03** | Agriculture and Agri-Food Canada, [Le gouvernement investit afin de trouver de nouveaux marchés pour les fruits de mer canadiens haut de gamme](https://www.canada.ca/fr/nouvelles/archive/2014/10/gouvernement-harper-investit-afin-trouver-nouveaux-marches-fruits-mer-canadiens-haut-gamme.html), French release, 2014-10-16. | Uses `kazunoko salé et aromatisé (œufs de hareng)` for the Canadian product association. The source supports French product wording, not a current package label or recipe measure. |
| **WP04-SECTIONP-KAZUNOKO-20261013-R42-S04** | Gouvernement du Québec, [Transformation des produits marins](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/portraits-peche-aquaculture-commerciales/transformation-produits-marins), `Hareng`, page last updated 2026-06-16. | Says herring roe (`œufs de hareng`) is a high-value product sought on export markets. Current Québec context; it does not name kazunoko or a specific preparation. |
| **WP04-SECTIONP-KAZUNOKO-20261013-R42-S05** | Office québécois de la langue française, [GDT: œufs de poisson](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10435851/oeufs-de-poisson), preferred term and English translation. | Supports the generic Québec term `œufs de poisson` for `fish roe`. The entry dates to 1983 and does not establish a kazunoko-specific term, product state, or synonym set. |
| **WP04-SECTIONP-KAZUNOKO-20261013-R42-S06** | Ozawa Canada, [Kazunoko (Herring Roe)](https://ozawa.ca/product/kazunoko-300g/), item FS-1001A, packaging field. | Canadian distributor lists a 200 g kazunoko item and gives a Montreal office. Confirms a current Canadian-market listing and package size only; it supplies no preparation statement or serving basis. |
| **WP04-SECTIONP-KAZUNOKO-20261013-R42-S07** | Aero Trading Co. Ltd., [Herring Roe & Herring Roe on Kelp](https://aerotrading.ca/our-products/kazunoko/), product description. | Canadian processor says its Kazunoko products are Pacific herring roe sacs/egg skeins, distinguishes them from `herring roe on kelp (Kazunoko Kombu)`, and packs select grades in 30 lb pails. This is supplier-specific product-line wording, not a scientific species name, retail ingredient declaration, or support for treating the two products as aliases. |
| **WP04-SECTIONP-KAZUNOKO-20261013-R42-R01** | [Bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), and [research ledger](../research-ledger.v1.json). | Static audit used the live files, search implementation, and manifest-listed recipe rows. It found no dedicated active, form, legacy, or ledger owner and 0 of 114 recipe files / 1,123 ingredient rows with the reviewed candidate terms. Existing Pacific-herring context mentions roe and spawn-on-kelp fisheries but does not allocate this product. |

No app tests or emulator checks were run. This is a proposal-only documentation change; catalog data and app behavior were not modified.
