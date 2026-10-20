# WP03 Section F: cream-of-rice hot cereal identity review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12; see the integration note below. The package snapshot and audits in this proposal describe the state at proposal review, before integration.
- **Scope:** One open Section F preprocessed-rice product: dry cream-of-rice hot cereal.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference for **`cream of rice hot cereal / crème de riz`**. Keep aliases, forms, measurements, density, mappings, yields, conversions, recipe links, and substitutions empty.
- **Checklist location:** The live plan leaves “dry versus cooked forms for remaining grains” and “regionally significant cereal mixes and preprocessed grains” open at [lines 1908–1910](../../RecipeBook-global-ingredient-catalog-plan.txt#L2001). The existing catalog covers crispy rice cereal, puffed rice, flattened rice (poha), rice flour, and hot-cereal grains such as oat bran, but not this packaged rice hot cereal.
- **Prior-review check:** No earlier proposal or batch focused on cream-of-rice hot cereal. The WP02 A7 residual-meals review considers brown rice farina separately and explicitly keeps generic cream of rice off that product’s aliases; this proposal does not reopen or merge that candidate ([review](wp02-a7-residual-grain-meals-followup-20261011.md)).

## Package snapshot at proposal review

Hashes are SHA-256 over exact file bytes. The recipe-corpus digest hashes each manifest-relative path, a NUL byte, the exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Current count/state | SHA-256 or corpus digest |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 1,220 references; 107 `GRAIN_AND_CEREAL` | `fd9b020e6938097508e264c0674262f5cae43579744fdc204dce7adbb07b7f2c` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `manifest.v1.json` | 114 listed recipes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 752,942 recipe-file bytes | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,521 records; 5,150 source entries; 4,213 distinct source IDs; 8 unit conversions | `165c9edc5ecd7876136f93db01d00f359781057ff7da6f664eed474138d46be9` |
| Generated `BundledIngredientCatalog.kt` | 1,220 references | `66b567a40639ffa2ab5139dd728c535249f644d8bf61050587fee14632aa16f0` |

All 114 paths in the manifest existed at review time. These are a dated workspace snapshot; recheck before integration.

## Product boundary and recommendation

Current Canadian retail and manufacturer sources identify a dry hot-cereal product sold as Cream of Rice. The manufacturer's Canadian-facing product page calls it a stove-top hot cereal and lists granulated rice and iron. An active Canadian grocery listing presents the 397 g hot-cereal item, lists the same ingredients, and marks it in stock at the selected store [S02–S03]. Health Canada's Canadian Nutrient File provides the bilingual food category `Cereal, hot, cream of rice, dry / Céréale, chaude, crème de riz, sèche` [S01].

Québec culinary sources use `crème de riz` for a breakfast hot cereal. RICARDO describes it as a grocery hot-cereal product prepared like cream of wheat and distinguishes it from congee made from whole rice [S04]. A Montréal retailer's French product page uses the title `Crème de riz` and describes a rice-based hot cereal; the current item page was marked out of stock, so it supports local naming and product context rather than current availability [S05]. Together, the federal bilingual category, Canadian package listing, and Québec French usage support the narrow product identity and display pair below. The English display keeps the hot-cereal scope explicit. The French display uses the source-attested Québec culinary term `crème de riz`; the federal category supplies dry hot-cereal context. This pairing is not presented as an OQLF-standardized compound.

| Proposed field | Recommendation |
| --- | --- |
| ID | `ingredient-ref-cream-of-rice-hot-cereal` |
| English display | `cream of rice hot cereal` |
| Québec French display | `crème de riz` |
| Category | `GRAIN_AND_CEREAL` |
| English and French aliases | None |
| Scope | Packaged dry rice cereal intended to be prepared as a hot cereal; the reviewed Canadian product lists granulated rice. |
| Forms and numeric data | None: no forms, density, unit mappings, serving measures, conversions, or cooking yields. |
| Recipe links and substitutions | None. |

Keep this reference distinct from plain `rice / riz`, dry/cooked rice forms, `rice flour / farine de riz`, `crispy rice cereal / céréales de riz croustillantes`, `puffed rice / riz soufflé`, `flattened rice (poha) / flocons de riz (poha)`, and prepared rice porridge/congee. Do not generalize the identity to infant rice cereal, flavored or inclusion-based Cream'd Rice products, every product made from ground rice, or the separate brown-rice-farina candidate. Product-specific fortification, package size, preparation directions, and brand wording remain source context only. The proposal does not claim a common grain color, particle size, precooking method, or instant-cooking property across all products in this class.

Health Canada's food-code page displays serving-size observations, and the retailer pages display package and serving information; none is transferred to the catalog. No default measure, density, rice-to-cereal conversion, yield, or preparation rule is proposed.

## Exact-key and recipe-corpus audit

The audit used the repository's `normalize_search_key` implementation across every active reference ID, name, and alias; every form field, label, and match term; all legacy candidates; the complete serialized ledger; and every manifest-listed recipe file and ingredient row. Candidate terms included `cream of rice`, `cream-of-rice`, `cream of rice cereal`, `cream of rice hot cereal`, `hot rice cereal`, `cereal, hot, cream of rice, dry`, `cereal, hot, cream of rice`, `rice cream`, `granulated rice cereal`, `crème de riz`, `céréale chaude, crème de riz, sèche`, `céréale chaude à la crème de riz`, `céréale de riz chaude`, and the exact proposed ID.

| Search surface | Result |
| --- | --- |
| Active reference names and aliases | 0 exact normalized-key owners. The proposed ID is absent. |
| Ingredient-form labels and match terms | 0 exact owners. No cream-of-rice form exists. |
| Legacy import candidates | 0 exact owners among 66 candidates. |
| Ledger record IDs and serialized strings | 0 exact candidate-key mentions; proposed ID absent. |
| Manifest recipe files | 0 candidate-phrase hits across all 114 serialized files. |
| Ingredient rows | 0 candidate-phrase hits across all 1,123 rows. |

Nearby active identities have deliberately narrower scopes. `ingredient-ref-rice-cereal` is crispy rice cereal; `ingredient-ref-rice-flour` and `ingredient-ref-brown-rice-flour` are flours; `ingredient-ref-rice` and `ingredient-ref-white-rice` own the existing dry/cooked forms. The poha row owns `rice flakes / flocons de riz` for flattened rice. None owns this hot-cereal identity. No recipe line needs a link, state form, quantity correction, or substitution.

This is a normalized name and content audit, not a live picker-ranking test. Exact misses do not imply that broad `rice / riz` searches will return only one result.

## Remaining Section F gaps

This recommendation closes only one preprocessed-rice identity gap. The live plan still leaves these matters open or held:

- Unqualified farro and generic sushi rice remain unresolved; pearled hominy, pozole corn, generic grits/polenta, and dried sweet corn retain their existing holds.
- Whole-kernel puffed teff, human-food puffed rye, and puffed corn remain outside the active catalog pending the evidence stated in their reviews; other residual puffed-grain products need separate checks.
- Brown-top, barnyard, and Sikiya/crab-finger millet remain held; sorghum flakes remain an unresolved product and Québec-name candidate.
- Dry/cooked forms for other grains remain unassigned unless recipe or measurement evidence calls for them. Pot barley has an independent Québec display review still open.
- The broader regional cereal-mix and preprocessed-grain sweep remains open beyond identities already integrated, including granola, muesli, wild-rice blend, and selected grain flakes.

This proposal does not repeat the integrated millet, wheat, or amaranth flakes or the previously reviewed farro, sushi-rice, hominy/pozole, grits, dried-sweet-corn, sorghum-flake, or named puffed-grain decisions.

## Proposal-local source register

These source IDs are local to this proposal, were checked absent from the shared ledger before drafting, and were not added to it. Pages were reviewed on 2026-10-12.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP03-CORCEREAL-20261012-S01` | Health Canada, [Canadian Nutrient File: Cereal, hot, cream of rice, dry (food code 1224)](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=1224). | Gives the exact federal bilingual category `Cereal, hot, cream of rice, dry / Céréale, chaude, crème de riz, sèche`. It also displays serving values, which are not imported. The entry supports a food class and bilingual naming, not a retail SKU's composition or a general measurement. |
| `WP03-CORCEREAL-20261012-S02` | Cream of Wheat Canada, [Cream of Rice Stove Top](https://creamofwheat.ca/product/cream-of-rice-stove-top/), product name and ingredients. | Current manufacturer page identifies a stove-top hot cereal and lists granulated rice and iron. It supports product class and English wording; no French label, generic process standard, or measurement is inferred. |
| `WP03-CORCEREAL-20261012-S03` | Atlantic Superstore, [Cream of Rice Hot Cereal Gluten Free, 397 g](https://www.atlanticsuperstore.ca/en/hot-cereal-gluten-free/p/21479616_EA), product code `21479616_EA`. | Current Canadian grocery page showed the item in stock at the selected store and lists granulated rice and iron. This is one current package example, not proof of Canadian manufacture, a universal recipe, or a Québec French display. Package and serving values are not imported. |
| `WP03-CORCEREAL-20261012-S04` | RICARDO, [Des céréales chaudes au petit déjeuner](https://www.ricardocuisine.com/chroniques/a-votre-sante/39-des-cereales-chaudes-au-petit-dejeuner), “Le riz” section. | Québec French culinary source calls the product `crème de riz`, places it among hot breakfast cereals, describes it as prepared like cream of wheat, and separates it from whole-rice congee. Supports French usage and category context, not a dry-product specification or exact bilingual label. |
| `WP03-CORCEREAL-20261012-S05` | Équilibre Performance Nutrition, Brossard, [Active Flavor — Crème de riz](https://epnutrition.ca/products/47327974), product title and description. | Local French storefront uses the exact product phrase `Crème de riz` and describes finely ground rice used for hot preparation. The item page showed out-of-stock status; its stevia/flavor formula and preparation directions are product-specific and are not generalized. |
| `WP03-CORCEREAL-20261012-S06` | Aliments du Québec, [Crème de céréale de riz brun biologique](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/creme-de-cereale-de-riz-brun-biologique), product title and listed points of sale. | Current Québec product-directory entry uses a brown-rice-specific hot-cereal name and lists retail points including IGA and Metro. It corroborates local cereal nomenclature and marks the brown-rice boundary; it does not establish that the brown product is the same milling class as cream of rice. |

## Review disposition

**Recommend adding identity-only `cream of rice hot cereal / crème de riz`.** Direct Canadian bilingual category evidence, a current Canadian hot-cereal package listing, and Québec French culinary/product usage support this bounded product identity. The shorter French display follows the Québec source wording; English and the source scope retain the explicit hot-cereal distinction. Keep aliases, forms, numeric values, recipe links, conversions, yields, and substitutions empty, and preserve the existing rice, rice-flour, crispy-cereal, poha, and brown-rice-farina boundaries.

## Integration status

Root added `ingredient-ref-cream-of-rice-hot-cereal` as an identity-only `GRAIN_AND_CEREAL` reference, with English display `cream of rice hot cereal` and Québec French display `crème de riz`. The display decision uses RICARDO's Québec usage and the local retailer title, while the Health Canada food category and current Canadian package listing bound it to dry hot cereal. The proposed compound `céréale chaude à la crème de riz` was not retained because it was constructed rather than directly attested in the reviewed Québec sources.

The ledger now records proposal sources S01–S06 and the accepted identity decision. Measurement and substitution research remain `not_yet_researched`; no measurement observation, substitution finding, alias, form, recipe link, conversion, yield, or runtime preparation behavior was added. The recipe corpus remains unchanged. See the [integration README](../batches/wp03-section-f-cream-of-rice-hot-cereal-integration-20261012/README.md) for post-integration counts, hashes, and checks.
