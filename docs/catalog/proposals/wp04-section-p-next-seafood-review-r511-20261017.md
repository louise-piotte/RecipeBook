# WP04 Section P — shrimp-ring product-boundary review (R511)

- **Review and online source-access date:** 2026-10-17.
- **Checklist:** Open WP04 Section P parent, “Shrimp/prawn by meaningful preparation; crab and crayfish” ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6885)).
- **Gap selected:** Canadian shrimp-ring retail products and the Québec French listing “Couronne de crevettes.”
- **Recommendation:** **Hold a general shrimp-ring identity unallocated.** Current listings establish real human-food products, including ready-to-serve platter products, but ingredient details and whether sauce is included are not consistently disclosed across the reviewed listings. A hypothetical bilingual row would also take over broad one-word queries such as “ring” and “couronne” under the current phrase-first picker. The manifest recipe corpus has no matching demand.
- **Scope:** The reviewed listings concern shrimp presented as a ring or platter. This review makes no species assignment across products, does not establish that every ring includes cocktail sauce, and does not cover generic shrimp/prawn, cocktail sauce alone, the canned product already held by R183, or freshwater crayfish. Keep freshwater crayfish / écrevisse d’eau douce under its existing R501 identity.
- **Proposal status:** Integrated as a documentation-only hold; no shared reference, form, legacy mapping, ledger record, recipe data, or generated file changed. No tests, build, emulator, or deployment were run.
- **Proposal-local source IDs:** R511-S01 through S05 below. They remain unregistered because this recommendation is a hold. Reuse the existing CFIA source ID WP04-SECTIONP-CANNED-COCKTAIL-SHRIMP-R183-20261016-S05 for the Canadian standard.

## Why this is a distinct open gap

The Section P parent remains open in the current [plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6885), and the [roadmap](../../../roadmap.md) records R508 as a recent, separate shrimp-dumpling hold. R183 added the narrow canned product “Cocktail Shrimp / Crevettes cocktail en conserve” and expressly kept frozen, sauce-based, and prepared shrimp-cocktail products separate ([R183 proposal](wp04-section-p-canned-cocktail-shrimp-product-boundary-review-r183-20261016.md)). R229 reviewed generic frozen cooked shrimp and its picker boundary; it did not evaluate a ring or platter product ([R229 proposal](wp04-section-p-next-seafood-gap-review-r229-20261016.md)). R501 resolved the existing freshwater-crayfish candidate in place ([R501 proposal](wp04-section-p-crayfish-boundary-recheck-r501-20261017.md)), so this review covers a separate shrimp product presentation.

R508 held shrimp dumplings because their broad dumpling wording would draw a shrimp-specific product into generic dumpling queries; that is a distinct preparation and picker case ([R508 proposal](wp04-section-p-next-seafood-review-r508-20261017.md)).

Current retail pages use labels such as “Shrimp Ring,” “Shrimp Ring with Sauce,” and “Frozen Large Pacific White Shrimp Ring with Cocktail Sauce.” Mayrand’s Québec-facing page lists a frozen Blue Tide product as “Couronne de crevettes 26/30 170 g,” but gives no ingredient statement or sauce detail. Loblaws groups both “Seaquest Shrimp Ring 227 g” and “Seaquest Shrimp Ring With Mild Cocktail Sauce 454 g” under its “Shrimp Rings” category. The listing titles establish current market wording; they do not prove the smaller product has no sauce or that all products share a formulation.

For products explicitly sold with cocktail sauce, CFIA’s Section 14 standard describes shrimp cocktail as sound, cooked, peeled shrimp meat containing sauce, spices, seasonings, flavouring preparations, or a combination. That standard helps distinguish prepared shrimp-and-sauce products from R183’s plain canned “Cocktail Shrimp.” It does not make “shrimp ring” a universal ingredient name, establish sauce contents for the Mayrand item, or supply a French retail equivalence for every sauce-included product. [Reused R183-S05]

## Current catalog and archive audit

The live snapshot was read on 2026-10-17. Hashes are SHA-256 of the exact files.

| Dataset | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| [Ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 1,786 | 583,151 | **ebabed50a163c97108584a62ffcf4029026d04035e2b4b8fedd5ebe722c9094b** |
| [Ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 143 | 113,370 | **ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6** |
| [Legacy candidates](../legacy-import-identities.v1.json) | 56 | 13,351 | **8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720** |
| [Research ledger](../research-ledger.v1.json): records / source entries / distinct source IDs / distinct URLs | 2,143 / 9,835 / 8,323 / 7,033 | 9,958,005 | **4edc63792a4fa8713676594c970b031b1457de969c74adad22b7d29c495117b5** |
| [Manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipe paths | 12,011 | **b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984** |

The exact-key audit covered bilingual reference names and aliases, form IDs/labels/match terms, legacy candidate IDs and text, ledger IDs/source IDs/URLs, and the proposal/batch archive. No active reference, form, legacy candidate, or ledger record owns “shrimp ring,” “shrimp rings,” “couronne de crevettes,” or “anneau de crevettes.” The IDs ingredient-ref-shrimp-ring, ingredient-form-shrimp-ring, and candidate-shrimp-ring are unallocated. Before R511, the source-ID prefix and five retailer URLs below had no ledger or proposal/batch-archive owner. No focused earlier shrimp-ring or couronne-de-crevettes proposal or integration record was found.

| Existing owner | Current scope | Boundary to preserve |
|---|---|---|
| ingredient-ref-canned-cocktail-shrimp | Water-packed canned “Cocktail Shrimp / Crevettes cocktail en conserve,” integrated from R183. | Keep it separate from frozen or ready-to-serve shrimp rings. The current crevettes cocktail query resolves to this canned row. Do not transfer shrimp cocktail or cocktail de crevettes to it. |
| ingredient-ref-northern-shrimp, ingredient-ref-dried-shrimp, ingredient-ref-shrimp-balls, ingredient-ref-breaded-shrimp, ingredient-ref-breaded-butterfly-shrimp, ingredient-ref-coconut-shrimp, ingredient-ref-coconut-butterfly-shrimp, ingredient-ref-popcorn-shrimp, and ingredient-ref-saeu-jeot | Existing species, preserved, formed, coated, or prepared shrimp rows. | Keep each product and state distinct; add no ring alias or form to these references. |
| ingredient-ref-bagoong-alamang, ingredient-ref-belacan, ingredient-ref-kapi-shrimp-paste, and ingredient-ref-terasi | Shrimp-based fermented condiments or pastes. | Keep these ingredient and condiment products distinct from a ready-to-serve platter. |
| ingredient-ref-crayfish | R501 freshwater crayfish / écrevisse d’eau douce, species and product state unspecified. | This is a separate freshwater crustacean identity. Do not equate it with shrimp or add crawfish, prawn, or crayfish terms to this review. |
| ingredient-ref-calamari with ingredient-form-calamari-rings; ingredient-ref-breaded-calamari-rings | Current calamari and breaded-calamari ring owners. | The generic query ring currently finds these among its substring results; preserve those existing results. |
| ingredient-ref-garland-chrysanthemum | Existing French alias chrysanthème à couronnes. | The current one-word couronne query returns this row through substring fallback. |
| ingredient-ref-cherry-tomato | Existing French alias tomate cocktail. | It is one of two current cocktail query results; do not use cocktail as a ring alias. |

The reused CFIA source ID WP04-SECTIONP-CANNED-COCKTAIL-SHRIMP-R183-20261016-S05 already belongs to ingredient-ref-canned-cocktail-shrimp for Section 14. The same CFIA URL is also present on ingredient-ref-lobster-meat and ingredient-ref-scallop under the shared existing ID WP04-FRESH-SCALLOP-IDENTITY-20261012-S04, with Section 3 and Sections 10–11 locators. Reuse the R183 Section 14 source entry; do not create a new ID for that URL.

## Source-ID to URL register

Each proposal-local source ID below maps to exactly one URL. The retailer URLs and R511 IDs had no pre-existing research-ledger or proposal/batch-archive owner. This proposal is their first archive entry; the IDs remain unregistered in the ledger under this hold.

| Source ID | Exact URL | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-SHRIMP-RING-R511-20261017-S01** | [Mayrand — Couronne de crevettes 26/30](https://mayrand.ca/fr/nos-produits/surgele/fruit-de-mer-surgele/crevette-cuite-surgelee/couronne-de-crevettes-2630-14236) | Current Québec retailer page identifies Blue Tide “Couronne de crevettes 26/30 170 g,” UPC 836443005032, and lists it in stores including Brossard. It supplies no ingredient declaration, species, sauce information, preparation direction, or common measure. Availability varies by store. |
| **WP04-SECTIONP-SHRIMP-RING-R511-20261017-S02** | [Food Basics — Frozen Large Pacific White Shrimp Ring with Cocktail Sauce](https://www.foodbasics.ca/aisles/fish-seafood/frozen-fish-seafood/packages-bulk/frozen-large-pacific-white-shrimp-ring-with-cocktail-sauce/p/059749962209) | The retailer listing surfaced the exact name, 312 g size, 15–20 count grade, and “ready to serve once previously frozen” description. Direct page retrieval returned 403 in this review; use only the visible retailer listing text, not an inaccessible ingredient panel or broader availability claim. |
| **WP04-SECTIONP-SHRIMP-RING-R511-20261017-S03** | [Walmart — Our Finest Shrimp Ring with Sauce, 370 g](https://www.walmart.ca/en/ip/Our-Finest-Shrimp-Ring/5NVN33TEJFOI) | Current product page identifies fully cooked shrimp, mild cocktail sauce, a minimum 38 shrimp per ring, frozen storage, and thaw-and-serve use; it separately lists shrimp and sauce ingredients. These are this 370 g product’s claims, not universal ring specifications. Page availability is store and delivery-location dependent. |
| **WP04-SECTIONP-SHRIMP-RING-R511-20261017-S04** | [Loblaws — Seaquest Shrimp Ring With Mild Cocktail Sauce, 454 g](https://www.loblaws.ca/en/shrimp-ring-with-mild-cocktail-sauce/p/21687413_EA) | The current retailer search listing gives the 454 g product title and ingredients including farmed Pacific white shrimp and mild cocktail sauce; it showed stock at a selected Ottawa store. Direct detail-page retrieval returned no page text, so ingredient and stock claims rely on the surfaced retailer listing and remain SKU/location specific. |
| **WP04-SECTIONP-SHRIMP-RING-R511-20261017-S05** | [Loblaws — Shrimp Rings category](https://www.loblaws.ca/en/food/fish-seafood/shrimp/shrimp-rings/c/56978) | The retailer uses plural “Shrimp Rings” as a category and lists, among others, a 227 g Seaquest Shrimp Ring and a 454 g Seaquest Shrimp Ring With Mild Cocktail Sauce. This supports the market wording and SKU variation, not a shared formulation. A product title that omits sauce is not evidence that no sauce is included. |
| **Reused WP04-SECTIONP-CANNED-COCKTAIL-SHRIMP-R183-20261016-S05** | [CFIA — Canadian Standards of Identity: Volume 3 — Fish](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-3) | Existing ledger owner is ingredient-ref-canned-cocktail-shrimp; its locator is Section 14. The standard defines shrimp cocktail by cooked, peeled shrimp meat and sauce/seasoning additions. It does not establish a ring identity or a standard formulation for every retail listing. |

## Picker projection

[IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes accents and punctuation, returns complete word-phrase matches first, and uses substring matching only if there are no phrase matches. The hypothetical projection below uses the observed display terms “shrimp ring / couronne de crevettes” plus the directly observed Loblaws category wording “shrimp rings.” This is only a projection to assess picker cost; none of these terms is being proposed for active catalog data.

| Query | Current projection | Hypothetical projection | Effect |
|---|---|---|---|
| shrimp ring; shrimp rings; couronne de crevettes | No exact result. | One shrimp-ring candidate. | The exact market wording would become searchable. |
| ring | 19 current substring results, including breaded calamari rings and calamari’s squid-rings form. | One shrimp-ring candidate by word-phrase match. | The new term suppresses the 19 current fallback results for this unqualified query. |
| couronne | One result: garland chrysanthemum / chrysanthème comestible, by substring fallback. | One shrimp-ring candidate by word-phrase match. | The new French display replaces the current owner for the unqualified word. |
| rings | Two word-phrase results: breaded calamari rings and calamari. | Those two plus the shrimp-ring candidate if shrimp rings is indexed. | A sourced plural term expands the existing plural ring search. |
| shrimp | 10 references. | The same 10 plus the hypothetical row. | Broad shrimp search remains multi-result. |
| crevettes | 14 references. | The same 14 plus the hypothetical row. | Broad French shrimp search remains multi-result. |
| cocktail | Two results: canned cocktail shrimp and cherry tomato. | Same two, with no cocktail alias proposed. | The existing broad query remains unchanged. |
| shrimp cocktail; cocktail de crevettes | No result. | No result if kept off the hypothetical row. | Avoids turning the ring package into a generic sauce-based dish alias. |
| crevettes cocktail; canned cocktail shrimp | One result: ingredient-ref-canned-cocktail-shrimp. | Same existing owner. | Preserves the R183 canned-product boundary. |
| freshwater prawn | No result; crayfish and écrevisse each return the existing freshwater-crayfish row. | Unchanged. | No freshwater-prawn or crayfish mapping is introduced. |

The projection shows that the narrow product phrase can be searchable without broadening shrimp beyond a multi-result query, but its English and French headwords would take over generic one-word searches. The candidate therefore remains unallocated until recipe demand or picker behavior provides a safer scope.

## Manifest recipe-corpus scan

The audit parsed all **114** manifest-listed recipe files in manifest order and all **1,123** structured ingredient rows. It searched every decoded JSON string and ingredient-row value for shrimp, prawn, crayfish, écrevisse, cocktail sauce, “shrimp ring(s),” “couronne de crevettes,” “anneau de crevettes,” shrimp cocktail, and their relevant French wording. It found **zero matching recipe files, zero matching ingredient rows, and zero shrimp/prawn/crayfish reference-ID rows**. No recipe link or recipe-specific amount is proposed.

Corpus fingerprint: **753,988 exact recipe-file bytes**, SHA-256 **847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e**. The digest was computed in manifest order over each relative path encoded as UTF-8, a NUL byte, the exact file bytes, then a NUL byte.

## Measures, forms, and substitutions

- **Identity/forms:** Keep shrimp ring and couronne de crevettes out of active references, forms, aliases, legacy identities, and the research ledger. Do not attach a frozen, cooked, ready-to-serve, cocktail-sauce, count-grade, species, or ring form to the general shrimp reference; listing claims are SKU-specific.
- **Measures:** The observed 170 g, 312 g, 370 g, 454 g package weights and individual count grades belong to separate listings. The pages do not establish a shared shrimp-only weight, sauce ratio, piece count, household serving, density, drained yield, or reusable measure. Add no numeric behavior.
- **Substitutions:** The corpus and reviewed product pages provide no recipe-method evidence for replacing an ingredient with a packaged ring or platter, or replacing one ring product with raw shrimp, frozen cooked shrimp, canned cocktail shrimp, or sauce alone. Add no conversion, yield, warning, contextual substitution, or recipe-line link.

## Disposition

Keep the general shrimp-ring product group unallocated. Canadian and Québec listings establish market terminology, but the ring label describes a presentation of shrimp and may accompany a separate cocktail-sauce component; the Mayrand French listing does not reveal its formulation. The current phrase-first picker would replace all 19 current results for the unqualified ring query with the new product alone, and would replace the current couronne result as well. The recipe corpus supplies no demand to justify those search effects.

Reopen this review if a bundled recipe specifies a shrimp-ring platter as an ingredient or if a Québec product label establishes a consistent French product and ingredient scope and picker changes can preserve one-word ring and couronne searches. Keep the existing canned cocktail-shrimp and freshwater-crayfish owners unchanged. Add no identity, form, alias, candidate, ledger record, measure, conversion, yield, recipe link, or substitution under this hold.

## Evidence limits

The sources are current retailer listings, not a national availability survey or a compositional standard for shrimp rings. The Mayrand page does not disclose its product ingredients or sauce component. The Food Basics detail page returned 403, and the Loblaws product detail page returned no text in direct retrieval; their visible listing information is retained with those limits. Retail availability is selected-store specific. CFIA’s shrimp-cocktail standard supports a boundary for products with sauce but does not establish that every shrimp ring contains sauce or that a market-ring name is interchangeable with “shrimp cocktail.” No reviewed source supplies a reusable measure, density, yield, or substitution.
