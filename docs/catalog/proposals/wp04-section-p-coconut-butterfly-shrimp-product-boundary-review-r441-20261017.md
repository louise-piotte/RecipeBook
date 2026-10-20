# WP04 Section P R441 — coconut butterfly shrimp product boundary review

- **Review and source-access date:** 2026-10-17.
- **Checklist:** WP04 Section P, “Shrimp/prawn by meaningful preparation; crab and crayfish” ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6717)).
- **Scope:** Review the separately named coconut butterfly shrimp product boundary raised in R438. This proposal does not reopen regular breaded butterfly shrimp, shrimp species, generic coconut shrimp, other coconut-coated products, shrimp balls, canned or dried shrimp, crab, or other existing preparation owners.
- **Recommendation:** Add one identity-only `PROTEIN` reference, **coconut butterfly shrimp / crevettes papillon à la noix de coco**, with the exact current product-name variants below. Treat it as a separately named coconut-coated product identity, not an alias or form of R438's regular breaded butterfly shrimp. Keep shrimp species unassigned. Add no form, measure, density, mapping, recipe link, yield, conversion, or substitution.
- **Status:** The recommendation was accepted and integrated on 2026-10-17; see the [R440–R442 integration record](../batches/wp02-wp04-wp06-r440-r442-gap-review-integration-20261017/README.md). This file records the proposal and read-only audit as reviewed before integration.
- **Source IDs:** `WP04-SECTIONP-COCONUT-BUTTERFLY-SHRIMP-R441-20261017-S01` through `S06` were allocated to the accepted ledger record. Existing R438 source IDs cited below are reused references; the audit label is not a source ID.

## Recommendation and exact proposed delta

High Liner's current Canadian English and French product pages name **Coconut Butterfly Shrimp** / **Crevettes Papillon À La Noix De Coco** and describe a shrimp product with crispy breading and real coconut flakes. Metro's Québec French product page separately lists **Crevettes papillons à la noix de coco, avec queue** (High Liner product 061763002281, 315 g). These sources support a narrow bilingual named-product identity; they do not establish that generic coconut shrimp is butterfly-cut, that the product has a particular shrimp species, or that this brand's formula is universal. [S01–S05; R438-S01, R438-S02, R438-S09]

Proposed reference only:

```json
{
  "id": "ingredient-ref-coconut-butterfly-shrimp",
  "nameEn": "coconut butterfly shrimp",
  "nameFr": "crevettes papillon à la noix de coco",
  "aliasesEn": ["coconut butterfly shrimp, tail-on"],
  "aliasesFr": ["crevettes papillons à la noix de coco avec queue"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "PROTEIN"
}
```

The two tail-qualified aliases preserve Metro's English and Québec French product labels. Do not add `coconut shrimp`, `shrimp`, `crevettes`, `crevettes à la noix de coco`, `breaded butterfly shrimp`, or the R438 French aliases. Metro lists other coconut shrimp products without a butterfly qualifier, so those broader terms would erase a real product boundary. Do not add `High Liner` as an alias; it is brand metadata rather than ingredient identity. [S04–S06; R438-S09]

## Current ownership and snapshot audit

The live snapshot contains **1,733 ingredient references, 141 forms, 56 legacy candidates, and 2,092 research-ledger records** (9,500 source entries and 8,050 distinct source IDs). The manifest lists **114 recipe files** with **1,123 ingredient rows**.

Normalized ID, display, alias, form-term, legacy-candidate, ledger-record, and source URL checks found no owner for `ingredient-ref-coconut-butterfly-shrimp`, `coconut butterfly shrimp`, either proposed French product phrase, SKU `061763002281`, or the High Liner coconut product-page URLs. No coconut-butterfly-shrimp form or legacy candidate is allocated. The only existing ledger mention is R438's product-listing boundary record attached to `ingredient-ref-breaded-butterfly-shrimp`: it notes coconut butterfly shrimp as a separate item but does not allocate its identity or record the direct product pages. That record already reuses the Metro listing evidence as R438-S09; this proposal does not duplicate it in the shared ledger.

| Existing owner | Current scope | R441 handling |
|---|---|---|
| `ingredient-ref-breaded-butterfly-shrimp` (R438) | General breaded butterfly shrimp. Its aliases include `frozen breaded butterfly shrimp`, `crevettes en papillon panées et surgelées`, `crevettes en papillon panées surgelées`, and `crevettes papillon`. | Keep this owner for regular breaded butterfly shrimp. Do not add coconut terms to it or attach a coconut form. The coconut product is a separate product-name identity; the unqualified `butterfly shrimp` picker query will show both. |
| `ingredient-ref-canned-cocktail-shrimp`, `ingredient-ref-dried-shrimp`, and `ingredient-ref-northern-shrimp` | Canned, dried, and Northern shrimp identities; Northern shrimp is species/market-qualified. | Keep each boundary unchanged; add no canned, dried, Northern, or species aliases. |
| `ingredient-ref-shrimp-balls`, `ingredient-ref-saeu-jeot`, `ingredient-ref-kapi-shrimp-paste`, `ingredient-ref-bagoong-alamang`, `ingredient-ref-belacan`, and `ingredient-ref-terasi` | Formed, salted, or fermented shrimp preparations and pastes. | Keep these preparation owners unchanged; no alias, form, or substitution overlaps them. |
| `ingredient-ref-coconut` and other coconut ingredient references | Coconut as a general food ingredient, beverages, oils, flour, sugars, and other named coconut products. | Add no `coconut` or `noix de coco` alias to those references. The proposed full product name includes both coconut and shrimp. |
| Generic frozen cooked shrimp hold; crab cake (R432); crab claws (R435) | Separate held cooked-shrimp boundary and crab preparations. | No cooked-shrimp, crab, or seafood-equivalence behavior is proposed. |

The existing CFIA Fish List lookup used in R438 returns multiple species-associated entries for the common names `Shrimp` and `Crevette`. Neither High Liner nor Metro identifies a taxon for this product. Leave species blank; do not attach a binomial or a species-qualified alias. [R438-S02]

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9), which folds accents and punctuation, prefers complete normalized word phrases across names/aliases/forms, then falls back to substring matching. The replay used the live names, aliases, and forms plus the proposed row above.

| Query | Current result | With R441 row |
|---|---|---|
| `coconut butterfly shrimp`; `coconut butterfly shrimp, tail-on` | None. | `ingredient-ref-coconut-butterfly-shrimp` only. |
| `crevettes papillon à la noix de coco`; `crevettes papillons à la noix de coco`; `crevettes papillons à la noix de coco avec queue` | None. | `ingredient-ref-coconut-butterfly-shrimp` only. |
| `butterfly shrimp`; `crevettes papillon` | R438 `ingredient-ref-breaded-butterfly-shrimp` only. | R438 plus `ingredient-ref-coconut-butterfly-shrimp` (two results). |
| `breaded butterfly shrimp`; `frozen breaded butterfly shrimp`; `crevettes en papillon panées` | R438 only. | R438 only; R441 adds none of these names or aliases. |
| `shrimp` | Six results: R438 breaded butterfly shrimp, canned cocktail shrimp, dried shrimp, Northern shrimp, saeu-jeot, and shrimp balls. | Same six plus coconut butterfly shrimp (seven). |
| `crevettes` | Ten results: bagoong alamang, belacan, R438 breaded butterfly shrimp, canned cocktail shrimp, dried shrimp, Kapi paste, Northern shrimp, saeu-jeot, shrimp balls, and terasi. | Same ten plus coconut butterfly shrimp (eleven). |
| `papillon`; `butterfly` | `papillon`: R438 breaded butterfly shrimp and moth beans (two). `butterfly`: R438 only. | `papillon`: same two plus coconut butterfly shrimp (three). `butterfly`: R438 plus coconut butterfly shrimp (two). |
| `noix de coco`; `coconut` | Eight / thirteen coconut ingredient references, respectively. | Nine / fourteen; one new full product row is added to each broad coconut query. |
| `coconut shrimp`; `crevettes à la noix de coco`; `tail-on coconut butterfly shrimp`; `breaded shrimp`; `cooked shrimp` | None. | Still none. The first two are deliberately not aliases; the last three are outside the supported labels or current identity scope. |
| `shrimp balls`; `crab cake`; `crab claws` | Their current dedicated owner, respectively. | Unchanged. |

The primary picker tradeoff is intentional: `butterfly shrimp`, `crevettes papillon`, and `papillon` become broader queries that show both the regular breaded row and the separately named coconut-coated row (plus moth beans for `papillon`). The exact coconut names select only R441. The shared product category listing also shows coconut shrimp without a butterfly qualifier, supporting the decision not to add a broad `coconut shrimp` alias. [S06]

## Manifest recipe-demand scan

All **114 manifest-listed recipe JSON files and 1,123 ingredient rows** were parsed. Full recipe text and row fields were searched for `coconut butterfly shrimp`, `tail-on coconut butterfly shrimp`, `crevettes papillon à la noix de coco`, `crevettes papillons à la noix de coco`, `crevettes papillons à la noix de coco avec queue`, `coconut shrimp`, `crevettes à la noix de coco`, `shrimp`, `shrimps`, `prawn`, `prawns`, `crevette`, and `crevettes`. The scan found **zero text matches and zero ingredient-row matches** for every product or seafood term. No bundled recipe requests the product; no recipe link, relink, or recipe-derived quantity is proposed.

The broader word `coconut` appears in 12 recipe files and in 15 ingredient rows across 11 recipes, all assigned to coconut, coconut oil, coconut milk, or cream of coconut. These are unrelated baking and sauce ingredients, not seafood rows. French `noix de coco` occurs in 10 recipe files but in no ingredient row; none is a shrimp or coconut-butterfly product match.

## Forms, measures, and substitutions

- **Forms:** Add none. The coconut coating and butterfly cut are part of this named product. They are not evidence of a general same-ingredient state conversion, and R441 is not a new form attached to R438.
- **Measures and density:** Keep `defaultDensity` null and `unitMappings` empty. The product's 315 g package and its manufacturer nutrition serving of about four shrimp (84 g) are specific to High Liner SKU 061763002281. They do not establish a general piece mass, count-to-mass mapping, package yield, density, portion, or cooking yield. [S01–S04]
- **Substitutions:** Add no global or contextual rule. These sources identify one coated product, not a tested equivalence with plain breaded butterfly shrimp, other coconut shrimp, generic shrimp, tempura shrimp, shrimp balls, fish, or crab.
- **Recipe links:** Add none; the bundled corpus has no matching row.
- **Ledger if accepted:** Use one `ingredient_reference` record for the identity, with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: not_yet_researched`. Do not add package-yield, measurement, form, conversion, substitution, or recipe-line records.

## Sources and limits

The pages were checked on 2026-10-17. Manufacturer and retailer pages establish their named product and SKU facts. The manufacturer English/French pages and retailer pages describe the same High Liner product; they are not independent formulations or evidence that all coconut shrimp is butterfly shrimp.

| Source ID | Source | Evidence and limit |
|---|---|---|
| **WP04-SECTIONP-COCONUT-BUTTERFLY-SHRIMP-R441-20261017-S01** | High Liner, [Coconut Butterfly Shrimp](https://www.highliner.com/products/family-favourites/family-favourites-coconut-butterfly-shrimp). | Current manufacturer title and product description name coconut butterfly shrimp, crispy breading, and real coconut flakes. Lists 315 g and a product-specific serving of about four shrimp (84 g), ingredients, and cook-from-frozen guidance. Supports the named product only; its brand formula and package facts do not generalize. |
| **WP04-SECTIONP-COCONUT-BUTTERFLY-SHRIMP-R441-20261017-S02** | High Liner, [Crevettes Papillon À La Noix De Coco](https://www.highliner.com/fr/products/family-favourites/family-favourites-coconut-butterfly-shrimp). | Current official French product title and description use `crevettes papillon à la noix de coco` and describe a crispy coconut-flake breading. This is the French page for the same High Liner item as S01, not an independent product or a Québec terminology ruling. |
| **WP04-SECTIONP-COCONUT-BUTTERFLY-SHRIMP-R441-20261017-S03** | Loblaws, [High Liner Coconut Butterfly Shrimp, 315 g](https://www.loblaws.ca/en/coconut-butterfly-shrimp/p/21655112_EA). | Current Canadian grocery product page uses the exact English product name and lists the 315 g item, ingredients, and 4 shrimp/84 g nutrition serving. It confirms the same named High Liner product as S01/S02, not an independent formula or general measure. Store availability and price vary. |
| **WP04-SECTIONP-COCONUT-BUTTERFLY-SHRIMP-R441-20261017-S04** | Metro, [Coconut Butterfly Shrimp, Tail-On, High Liner product 061763002281](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/frozen-fish-seafood/seasoned-breaded/coconut-butterfly-shrimp/p/061763002281). | Canadian retailer product listing supplies the English tail-qualified title, 315 g package, and product number 061763002281. This is the same High Liner product as S01–S03, not an independent formulation. Stock and prices vary by store and date. |
| **WP04-SECTIONP-COCONUT-BUTTERFLY-SHRIMP-R441-20261017-S05** | Metro Québec, [Crevettes papillons à la noix de coco, avec queue, High Liner product 061763002281](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/assaisonnes-et-panes/crevettes-papillon-a-la-noix-de-coco/p/061763002281). | Québec French retailer listing gives the plural `crevettes papillons` product wording, the `avec queue` qualifier, 315 g, and manufacturer product number. The displayed promotion date on the page is stale; no current price, promotion, or stock claim is used. This is the same product/SKU as S04. |
| **WP04-SECTIONP-COCONUT-BUTTERFLY-SHRIMP-R441-20261017-S06** | Metro Québec, [frozen seafood listings](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer). | Current category listings separate coconut shrimp sold without the butterfly qualifier from butterfly products and other shrimp preparations. Supports keeping `coconut shrimp` / `crevettes à la noix de coco` out of R441 aliases. Listing scope and availability can vary by store; it does not establish a product formula. |
| **WP04-SECTIONP-BREADED-BUTTERFLY-SHRIMP-R438-20261017-S01** *(reused)* | Office québécois de la langue française, [crevette en papillon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497145/crevette-en-papillon). | Establishes the Québec French/English base pair `crevette en papillon` / `butterfly shrimp`. It does not define coconut coating, frozen state, or the full product phrase. Reused as naming context; no new ledger source. |
| **WP04-SECTIONP-BREADED-BUTTERFLY-SHRIMP-R438-20261017-S02** *(reused)* | Canadian Food Inspection Agency, [Fish List shrimp lookup](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=shrimp) and [common-names guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). | Fish List lookup links broad `Shrimp` / `Crevette` names to multiple taxa; High Liner and Metro do not name a species for this product. Supports leaving species unassigned. Reuses R438's existing CFIA source entries; adds no duplicate URLs. |
| **WP04-SECTIONP-BREADED-BUTTERFLY-SHRIMP-R438-20261017-S09** *(reused)* | Metro, current [English seafood listings](https://www.metro.ca/en/online-grocery/themed-baskets/mmmazing/seafood) and [French seasoned-and-breaded seafood listings](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/assaisonnes-et-panes). | R438's existing record uses these category pages to distinguish regular breaded butterfly shrimp, coconut butterfly shrimp, and breaded popcorn shrimp. Supports maintaining distinct product names, not a shared formula, ingredient synonym, or substitution. Reused without a new ledger source. |
| **WP04-SECTIONP-COCONUT-BUTTERFLY-SHRIMP-R441-20261017-R01** | Read-only audit of the [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6717), live references/forms/legacy candidates/research ledger, prior Section P proposals and batches, [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), and every manifest-listed recipe. | Confirms live counts and ownership, exact phrase/ID/SKU/URL checks, picker projection, prior R438 scope, and full corpus scan. This repository audit does not extend external-source claims. |

## Disposition and unresolved needs

**Recommend adding identity-only `coconut butterfly shrimp / crevettes papillon à la noix de coco`** with only the title variants in the delta above. High Liner's current bilingual product pages and Canadian grocery listings establish a distinct named product; Metro's French listing establishes the Québec plural and tail-qualified label. The product remains species-neutral. Its 315 g pack and 4-shrimp/84 g nutrition serving are SKU-specific; no general measurement, form, yield, conversion, recipe link, or substitution is supported. [S01–S05]

Keep generic coconut shrimp and non-butterfly coconut products outside this identity. Keep the R438 plain breaded butterfly owner and all existing shrimp preparations unchanged. Revisit broader coconut-shrimp terminology only if recipes or other Canadian products establish a stable shared category and its boundaries. No shared catalog or ledger update is made by this proposal.
