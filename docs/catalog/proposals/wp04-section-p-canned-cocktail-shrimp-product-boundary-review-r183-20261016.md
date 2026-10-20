# WP04 Section P — canned cocktail shrimp product-boundary review (R183)

- **Review / source-access date:** 2026-10-16.
- **Recommendation:** Add one identity-only `PROTEIN` market-product reference, `canned cocktail shrimp / crevettes cocktail en conserve`, with no aliases or forms.
- **Scope:** Shrimp products sold in sealed cans under the Canadian manufacturer name **Cocktail Shrimp / Crevettes cocktail**. Keep the product separate from raw or frozen shrimp identities, dried shrimp, shrimp balls, and cocktail sauce or a prepared shrimp-cocktail dish. Do not assign one shrimp species, size grade, package size, drained yield, or preparation process to the identity.
- **Status:** Root integration confirmed. An identity-only reference and source-backed ledger record were added; no forms, active measures, conversions, yields, recipe links, or substitutions were added. No software tests, builds, or emulator checks were run under the updated database-JSON rule.
- **Proposal-local source IDs:** `WP04-SECTIONP-CANNED-COCKTAIL-SHRIMP-R183-20261016-S01` through `S07`; audit ID `WP04-SECTIONP-CANNED-COCKTAIL-SHRIMP-R183-20261016-R01`. These are not reserved or added to the shared ledger.

## Why this is a distinct open gap

The [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt) leaves shrimp and prawn preparation boundaries open, and the preserved-fish checklist includes canned fish and seafood states. Earlier reviews held a generic fresh shrimp/prawn identity, reviewed dried shrimp and shrimp paste separately, and added shrimp balls. They did not review the Canadian canned `Cocktail Shrimp / Crevettes cocktail` product group. The canned-crab-meat form and the recent canned tuna, salmon, sardine, and mackerel identities are separate products and do not allocate this shrimp product.

The Canadian manufacturer’s current bilingual product page names **Cocktail Shrimp / Crevettes cocktail** as a ready-to-use canned-seafood product. Its declared species scope covers several genera and multiple harvest areas, so a single species identity would be false. The French manufacturer recipes specify the product by cans and drained state. This supports a species-neutral market-product identity, not a generic form on the Northern-shrimp or dried-shrimp references.

The phrase needs precise handling. CFIA's Canadian standard for **shrimp cocktail** describes cooked peeled shrimp meat served with sauce, spices, seasonings, or flavourings. The manufacturer’s distinct title **Cocktail Shrimp** names plain shrimp in water in a can, without cocktail sauce. Preserve the order and qualifier in the proposed names; do not add `shrimp cocktail` or `cocktail de crevettes` as aliases. [S01–S03]

## Exact-key, source-ownership, and catalog audit

The read-only snapshot contains **1,559 active ingredient references**, **122 forms**, **61 legacy candidates**, and **1,904 research-ledger records / 8,168 source entries / 6,979 distinct source IDs / 5,775 distinct URLs**. The package manifest lists **114 recipe files and 1,123 ingredient rows**.

The exact-key audit covered normalized bilingual reference names and aliases, form IDs/labels/match terms, legacy candidate IDs and text, ledger record IDs/terms, source IDs and URLs, and the proposal/batch archive. It found no exact owner for the new product names, `ingredient-ref-canned-cocktail-shrimp`, or the cited Clover Leaf and Metro product URLs. No focused proposal or hold for canned cocktail shrimp was found. IDs and sources below are proposal-local only.

| Existing owner or nearby product | Current scope | Boundary to preserve |
|---|---|---|
| `ingredient-ref-northern-shrimp` | Species-specific *Pandalus borealis* / `crevette nordique`. | Do not attach a canned form or this product’s terms to the species identity. |
| `ingredient-ref-dried-shrimp` | Dried shrimp product identity. | Keep distinct from ready-to-use canned shrimp. |
| `ingredient-ref-shrimp-balls` | Formed shrimp product. | Do not treat balls as canned shrimp or vice versa. |
| `ingredient-ref-saeu-jeot` | Korean salted fermented shrimp product. | Keep its fermentation and Korean product name separate. |
| `ingredient-ref-bagoong-alamang`, `ingredient-ref-belacan`, `ingredient-ref-kapi-shrimp-paste`, `ingredient-ref-terasi` | Regionally named fermented shrimp pastes/condiments. | Keep all pastes and condiments separate from shrimp pieces in water. |
| Existing crab-flavoured pollock flakes and surimi work | Pollock-based or unresolved prepared seafood products. | Do not merge imitation/formed products with actual shrimp. |
| `ingredient-ref-canned-cocktail-shrimp`; `candidate-canned-cocktail-shrimp` | No exact active, form, legacy, or ledger ID. | Proposal-local identifiers only; no legacy allocation is proposed. |
| `shrimp cocktail`; `cocktail de crevettes` | No exact catalog owner was found. CFIA’s standard uses `shrimp cocktail` for a shrimp-and-sauce prepared food. | Do not add these phrases as aliases for the plain canned product. |

The product, recipe, retailer, and Save-On-Foods URLs in S01–S04 and S06–S07 had no exact ledger URL owner at this snapshot. The CFIA standards URL in S05 already appears under `WP04-FRESH-SCALLOP-IDENTITY-20261012-S04`, whose locator is Sections 10–11 on scallops. Root adds a separate source entry ID scoped to Section 14 for the shrimp-cocktail standard rather than reusing the scallop-scoped source ID. No source ID collision was found.

## Product, species, and preservation boundary

The manufacturer’s page groups several shrimp species from Vietnam and Indonesia under the same Canadian product name. It lists the ingredients as shrimp, water, salt, citric acid, calcium disodium EDTA, and sulfites, and presents the product as ready to use in hot or cold meals. Keep the row species-neutral and ingredient-group scoped; do not copy the supplier’s species list into aliases or imply that a can has one stable taxon.

The name `canned cocktail shrimp` is intentionally more specific than generic `canned shrimp`. The reviewed product is the manufacturer's water-packed can; this review does not cover shrimp in oil, seasoned shrimp, shrimp salad, cocktail sauce, frozen cooked cocktail shrimp, or other canned crustacean products. `Cocktail` is retained as part of the product's marketed name, not reinterpreted as a serving style or a shrimp-size grade. No raw/fresh/cooked process should be inferred from the catalog identity beyond the maker's `ready to use` claim.

The French display `crevettes cocktail en conserve` is a clear descriptive rendering of the manufacturer's Québec-facing `Crevettes cocktail` name plus its explicit can/package context. Do not add `crevettes cocktail` as a general synonym for frozen or fresh ready-to-eat shrimp; use the qualified display to preserve this product scope. Do not use `cocktail de crevettes`, which can denote the prepared dish.

## Picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) prefers complete normalized word phrases and falls back to substring matches. The proposed row contains only its two display names and no aliases or forms.

| Query | Current projection | With proposed row | Effect |
|---|---|---|---|
| `canned cocktail shrimp` | No result. | The proposed product group. | Exact product wording becomes searchable. |
| `crevettes cocktail en conserve` | No result. | The proposed product group. | Exact Québec-facing product wording becomes searchable. |
| `cocktail shrimp`; `crevettes cocktail` | No exact result. | The proposed product group. | The source-marketed product phrase remains available. |
| `shrimp` | Multiple existing shrimp identities/products, including Northern shrimp, dried shrimp, shrimp balls, and salted-fermented shrimp. | Those results plus the proposed row. | Broad English search remains multiple-choice. |
| `crevette` / `crevettes` | Multiple existing shrimp references and shrimp-derived pastes/ferments. | Those results plus the proposed row. | Broad French search remains multiple-choice. |
| `shrimp cocktail`; `cocktail de crevettes` | No exact result. | No exact result. | Avoids routing the sauce-based prepared dish to the can product. |
| `canned shrimp`; `crevettes en conserve` | No exact result. | No exact result. | Do not broaden this source-specific product group into a universal canned-shrimp identity. |

No candidate alias is proposed. In particular, keep generic `shrimp`, `canned shrimp`, `shrimp cocktail`, and their unqualified French counterparts off the row.

## Bundled recipe demand

The manifest-ordered audit parsed every **114** recipe file and all **1,123** structured ingredient rows. It searched every decoded recipe JSON string and ingredient-row value for `canned cocktail shrimp`, `cocktail shrimp`, `canned shrimp`, `shrimp in water`, `crevettes cocktail`, `crevettes cocktail en conserve`, `crevettes en conserve`, `shrimp cocktail`, and related shrimp phrases. It found **zero matching recipe files and zero matching ingredient rows**. No bundled recipe link or recipe amount is proposed. [R01]

The manufacturer's own French recipes use two **106 g cans, drained**, and two **113 g cans, drained and rinsed**. Those are source-specific examples of use, outside the bundled corpus; they are not a reusable can size, serving quantity, drained-weight rule, or conversion.

## Forms, numerical behavior, and substitutions

- **Identity only:** Add no `canned`, `in-water`, `drained`, `ready-to-use`, or `cocktail` form under any raw shrimp reference. The proposed product identity itself is the narrow market-group boundary.
- **Package and quantity evidence:** The manufacturer lists a nutrition basis of **one-half can drained (55 g)**. Its separate recipe examples use the package amounts above. Record any such amounts only as source-specific observations if root later integrates the identity. They do not support a common can amount, household measure, count-to-mass mapping, drained yield, density, or package conversion.
- **Substitutions:** No evidence supports replacing the canned product with Northern shrimp, frozen cooked shrimp, raw shrimp, dried shrimp, shrimp balls, a shrimp paste, or crab-flavoured pollock flakes at a shared ratio. Add no global or contextual substitution, warning, conversion, yield, or recipe-line link.

## Proposed delta

Add one identity-only reference:

| Field | Proposed value |
|---|---|
| `id` | `ingredient-ref-canned-cocktail-shrimp` |
| `nameEn` | `canned cocktail shrimp` |
| `nameFr` | `crevettes cocktail en conserve` |
| Aliases | None |
| `category` | `PROTEIN` |
| Default density / unit mappings | `null` / `[]` |
| Forms, recipe links, conversions, yields, substitutions | None |

If accepted, create one verified research-ledger record for this market product group, with measurement state `researched_no_supported_value`, substitution state `researched_no_supported_substitute`, and the new product/regulatory sources below. Do not assign shrimp species or carry manufacturer recipe amounts into reusable catalog behavior. Keep generic `canned shrimp`, the base raw/fresh shrimp gap, and the sauce-based `shrimp cocktail` phrase unallocated.

## Source register

Sources were accessed on 2026-10-16 unless noted. IDs remain proposal-local pending root review.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-CANNED-COCKTAIL-SHRIMP-R183-20261016-S01** | Clover Leaf, [Crevettes cocktail Clover Leaf](https://www.cloverleaf.ca/fr/produits/crevettes-cocktail-clover-leaf/). | Current Canadian manufacturer's French product page gives the exact Québec-facing name, a ready-to-use claim, can-drained nutrition basis, ingredients, and several shrimp taxa and harvest/packing origins. It does not establish one species, recipe amount, household measure, or global yield. |
| **WP04-SECTIONP-CANNED-COCKTAIL-SHRIMP-R183-20261016-S02** | Clover Leaf, [Cocktail Shrimp](https://www.cloverleaf.ca/en/products/cocktail-shrimp/). | Manufacturer's English product page confirms the exact product name, multiple species, ingredients, ready-to-use claim, and drained half-can nutrition basis. It is product evidence, not a universal shrimp formulation. |
| **WP04-SECTIONP-CANNED-COCKTAIL-SHRIMP-R183-20261016-S03** | Clover Leaf, [Ceviche de crevettes et de crabe](https://www.cloverleaf.ca/fr/recette/ceviche-de-crevettes-et-de-crabe/). | Current French manufacturer recipe calls for two 106 g cans of cocktail shrimp, drained. This is an external recipe/SKU-specific amount, not bundled-library demand or a reusable package measure. |
| **WP04-SECTIONP-CANNED-COCKTAIL-SHRIMP-R183-20261016-S04** | Metro, [Crevettes cocktail sauvages Clover Leaf](https://api.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/crevettes-cocktail-sauvages/p/061362443706). | Current Québec retailer search listing uses the French product wording and files it under canned fish and seafood. The retailer page was not directly fetchable in this review; do not use it as source for ingredient, quantity, species, or availability claims. |
| **WP04-SECTIONP-CANNED-COCKTAIL-SHRIMP-R183-20261016-S05** | CFIA, [Canadian Standards of Identity: Volume 3 — Fish](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-3). | Section 14 distinguishes regulated `Shrimp cocktail`—cooked, peeled shrimp meat with sauce/spices/seasonings—from the manufacturer's product titled `Cocktail Shrimp`, whose ingredients page lists shrimp, water, and seasonings but no sauce. The URL is also cited by the scallop record under a different source ID and section locator; this source ID is scoped to Section 14. |
| **WP04-SECTIONP-CANNED-COCKTAIL-SHRIMP-R183-20261016-S06** | Save-On-Foods, [Ocean's Wild Cocktail Shrimp in Water, 113 g](https://www.saveonfoods.com/sm/planning/rsid/951/product/oceans-wild-cocktail-shrimp-in-water-00065302560911). | Canadian retailer listing independently shows a water-packed canned cocktail-shrimp product, its ingredients, 113 g net quantity, and 55 g serving. The page is marked out of stock and does not support Québec naming, species, or a generic package amount. |
| **WP04-SECTIONP-CANNED-COCKTAIL-SHRIMP-R183-20261016-S07** | Clover Leaf, [Sauce cocktail aux crevettes](https://www.cloverleaf.ca/fr/recette/sauce-cocktail-aux-crevettes/). | Current French manufacturer recipe uses two 113 g cans of cocktail shrimp, drained and rinsed. Recipe-specific package quantity only; it is not a standard package size or reusable measure. |
| **WP04-SECTIONP-CANNED-COCKTAIL-SHRIMP-R183-20261016-R01** | [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt), active references and forms, [legacy identities](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), proposal/batch archive, manifest recipes, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Read-only ownership/source-URL, picker, and corpus audit at the snapshot counts stated above. |

## Final recommendation

**Add** the identity-only `canned cocktail shrimp / crevettes cocktail en conserve` market group. The Canadian manufacturer provides an exact bilingual product name and a species-mixed canned product scope, while the French external recipe demonstrates a real drained-can use context. Keep the row separate from fresh/frozen and species-specific shrimp, avoid aliases that imply all canned shrimp or a sauce-based shrimp-cocktail dish, and add no forms, measures, conversions, recipe links, yields, or substitutions. The bundled corpus itself has no candidate demand.

## Root integration decision

**Addition confirmed.** Added `ingredient-ref-canned-cocktail-shrimp` with bilingual, species-neutral market names, empty aliases, and no forms or active conversion behavior. The Clover Leaf half-can drained (55 g) label basis is recorded only as a product-specific portion observation. The CFIA Section 14 evidence is registered with a distinct source ID and locator; the existing scallop citation remains scoped to Sections 10–11. No bundled recipe demand was found.
