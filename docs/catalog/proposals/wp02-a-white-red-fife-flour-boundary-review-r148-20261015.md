# WP02 Section A white Red Fife flour boundary review — R148 — 2026-10-15

## Review record

- **Reviewed and sources accessed:** 2026-10-15.
- **Status:** Research proposal only. The only file written for this review is this proposal.
- **Scope:** Decide whether the currently sold white Red Fife flour is a distinct identity from R147's whole Red Fife flour, an alias on that row, or a candidate to hold.
- **Open checklist item:** [WP02 Section A, “Add the remaining functionally distinct regional wheat-flour identities”](../../RecipeBook-global-ingredient-catalog-plan.txt#L1278). The R147 whole Red Fife child item is complete; the parent checklist remains open.
- **Source-ID namespace:** `WP02-A-WHITE-RED-FIFE-R148-20261015-S01` through `S07`. Every proposed source ID was checked against the live ledger source-ID set; none collide.

## Recommendation

**Add a separate, identity-only ingredient reference for white Red Fife flour. Do not make it an alias of whole Red Fife flour.** The current Québec mill catalog places its white Red Fife flour under the specialty-flour “White” grouping and its whole Red Fife flour under the separate “Whole” grouping, in both French and English [S01]. The mill's product page identifies the white flour as made from Red Fife wheat; a Québec retailer independently lists the matching French white product [S02–S05]. OQLF defines *farine blanche* as wheat flour milled after removal of the bran and germ, which is a meaningful milling-grade distinction from the whole product accepted in R147 [S07].

The proposed bilingual display names are **white Red Fife flour / farine Red Fife blanche**. Keep the exact non-bleached product wording as search aliases because it appears in current mill product names: **unbleached white Red Fife flour** and **farine Red Fife blanche non blanchie** [S02–S03]. Do not include “organic” in the identity or aliases; it is a certification attribute. Do not add a generic `white flour` or `farine blanche` alias, since those are broader terms than the Red Fife product.

This recommendation is limited to the white, endosperm-based Red Fife product currently evidenced. It does not establish a Red Fife family of white, sifted, whole, or other grades beyond those named products. It does not promote the manufacturer's T55, protein, or all-purpose-use statements to catalog-wide equivalences or substitution rules.

## R147 boundary and evidence

R147 integrated `ingredient-ref-whole-red-fife-flour` with display names `whole Red Fife flour / farine Red Fife entière`, no aliases, category `FLOUR_AND_STARCH`, null density, and no unit mappings [R147 proposal, § Proposed reference JSON delta](wp02-a-regional-wheat-flour-residual-review-r147-20261015.md#proposed-reference-json-delta). Its two sources remain attached to that existing whole-flour record: La Milanaise's whole-product page (R147 S07) and the Québec Food Directory's whole-product listing (R147 S08). The directory's `1/2 cup (60 g)` serving is already retained as a product-specific `portion_weight` observation for La Milanaise's whole flour only. It is not evidence for white Red Fife flour and must not be copied or converted into a density or unit mapping for the proposed row.

The R147 proposal explicitly kept white Red Fife and other grades separate. The current product pages resolve that boundary: the mill separately lists a white product and a whole product, and OQLF's generic definition of white flour distinguishes the milling fraction by removal of bran and germ [S01, S07]. The new row would complement the accepted whole product without changing it.

## Proposed reference JSON delta

This is the complete new ingredient-reference object proposed for `ingredient-references.v1.json`. The candidate ID and exact display and alias phrases have no current owner in the active reference catalog.

    {
      "id": "ingredient-ref-white-red-fife-flour",
      "nameFr": "farine Red Fife blanche",
      "nameEn": "white Red Fife flour",
      "aliasesFr": ["farine Red Fife blanche non blanchie"],
      "aliasesEn": ["unbleached white Red Fife flour"],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-15T00:00:00Z",
      "category": "FLOUR_AND_STARCH"
    }

The short display names are phrases found contiguously in the current bilingual supplier and retailer names; the aliases preserve the supplier's extra milling-treatment wording for exact product searches [S02–S05]. No brand, organic-certification, package-size, protein, or T55 phrase is an alias.

## Boundaries and picker projection

Keep the new white product separate from:

- R147's `whole Red Fife flour / farine Red Fife entière`; `white` and `whole` identify different fractions, not alternate names for the same flour.
- Unqualified `white flour / farine blanche`, general-purpose flour, bread flour, pastry or cake flour, and white whole-wheat flour. A Red Fife cultivar name is retained; white is not a reason to merge with a general flour class.
- Sifted Red Fife flour or intermediate-extraction flour. The supplier's FAQ distinguishes white flour, sifted flour, and whole flour; its product catalog does not classify this white product as sifted [S01, S06].
- Red Fife grain, bran, germ, and other wheat varieties or species.

The supplier calls this specific product equivalent to French type T55, reports `11.5% ± 1.5%` protein, and says it can be used like regular all-purpose flour [S02–S03]. Record these as manufacturer statements only. Do not alias the row to French type 55 flour, set a protein category, infer that all white Red Fife flours share these properties, or add an all-purpose substitution. R147's separate T150 statement is likewise product-specific to its whole-flour product.

The phrase-first picker projection follows the current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) whole-word matching and fallback behavior. Counts are references returned before and after adding the proposed row and aliases:

| Query | Current | Projected | Expected result |
|---|---:|---:|---|
| `white Red Fife flour` | 0 | 1 | Finds the proposed white identity. |
| `farine Red Fife blanche` | 0 | 1 | Finds the proposed white identity. |
| `unbleached white Red Fife flour` | 0 | 1 | Finds the proposed row by its exact English product alias. |
| `farine Red Fife blanche non blanchie` | 0 | 1 | Finds the proposed row by its exact French product alias. |
| `Red Fife flour` | 1 | 2 | Returns whole and white Red Fife flour, as expected for an unqualified cultivar search. |
| `farine Red Fife` | 1 | 2 | Returns whole and white Red Fife flour, as expected for an unqualified cultivar search. |
| `whole Red Fife flour` | 1 | 1 | Remains exclusive to the R147 whole identity. |
| `farine Red Fife entière` | 1 | 1 | Remains exclusive to the R147 whole identity. |
| `whole wheat flour` | 3 | 3 | Unchanged; the new identity is neither named nor aliased as whole wheat. |
| `farine de blé entier` | 4 | 4 | Unchanged; the new identity is neither named nor aliased as whole wheat. |

The proposed reference ID is absent from the active reference, form, and ledger record IDs. None of the four exact display and alias phrases has an existing owner in current reference or form search terms. The R147 whole Red Fife evidence remains attached to its existing record and is cited here only for the grade boundary. The new source-ID prefix has no ledger collisions, and the seven proposed source IDs are distinct from one another.

## Recipe demand, forms, measures, and substitutions

The manifest lists 114 bundled recipe files with 1,123 ingredient rows. A scan of all manifest-listed recipe JSON and the exported RecipeKeeper recipe corpus found no `Red Fife` reference or matching white/whole phrase; no recipe link is proposed. The current active catalog has 1,508 ingredient references and 119 forms. No Red Fife-specific form exists, including no form on the R147 whole Red Fife reference; the active form and substitution data offer no Red Fife conversion or rule to reuse.

Keep `defaultDensity` null and `unitMappings` empty. The product pages publish bag sizes (including 1 kg and a Canadian retailer's 20 kg listing), not a transferable cup-to-mass measure [S02–S05]. No volume measure, density, or measured recipe demand was found. The R147 whole flour's half-cup portion does not carry over to the white product.

Add no forms, conversion, package yield, measurement observation, recipe link, or substitution rule. The mill's one-product comparison to all-purpose flour and stated uses are baking guidance, not a tested cross-product ratio or a universally safe recipe substitution [S02–S03]. Keep the ledger's measurement state at `researched_no_supported_value` and substitution state at `blocked_pending_evidence`.

## Complete proposed research-ledger JSON delta

This is the complete new record proposed for `research-ledger.v1.json`. It carries the seven fresh source records above. It has no measurement observations, substitution findings, forms, or conversions; no existing record should be edited as part of this proposal.

    {
      "recordId": "ingredient-ref-white-red-fife-flour",
      "recordType": "ingredient_reference",
      "identityState": "verified",
      "measurementState": "researched_no_supported_value",
      "substitutionResearchState": "blocked_pending_evidence",
      "sources": [
        {
          "sourceId": "WP02-A-WHITE-RED-FIFE-R148-20261015-S01",
          "url": "https://lamilanaise.com/nos-produits/",
          "title": "La Milanaise, Nos produits",
          "accessedOn": "2026-10-15",
          "locator": "Farine de spécialité biologique, Blanche and Entière categories; the linked Red Fife product names.",
          "supports": "The current Québec mill catalog separately lists Farine Red Fife blanche non blanchie biologique under White and Farine Red Fife entière biologique under Whole. This is current product-category and wording evidence, not a standard for all Red Fife flour grades.",
          "sourceKind": "manufacturer"
        },
        {
          "sourceId": "WP02-A-WHITE-RED-FIFE-R148-20261015-S02",
          "url": "https://lamilanaise.com/produits/farine-red-fife-blanche-non-blanchie-biologique/",
          "title": "La Milanaise, Farine Red Fife blanche non blanchie biologique",
          "accessedOn": "2026-10-15",
          "locator": "Official French product-page search result: heading, product description, protein statement, T55 claim, available format, and uses. Direct page fetch timed out; see access note in this proposal.",
          "supports": "The mill's current French product wording identifies a white, unbleached Red Fife flour and gives product-specific T55, protein, format, and use claims. These claims are not generalized to the ingredient class.",
          "sourceKind": "manufacturer"
        },
        {
          "sourceId": "WP02-A-WHITE-RED-FIFE-R148-20261015-S03",
          "url": "https://lamilanaise.com/en/produits/organic-unbleached-white-red-fife-flour/",
          "title": "La Milanaise, Organic Unbleached White Red Fife Flour",
          "accessedOn": "2026-10-15",
          "locator": "Direct English product page: heading, product description, protein statement, T55 claim, one-kilogram format, all-purpose comparison, and uses.",
          "supports": "The current Québec mill names an Organic Unbleached White Red Fife Flour product, identifies Red Fife as wheat, and publishes product-specific protein, T55, all-purpose-use, and format statements. These do not establish cross-product equivalence or a general substitute.",
          "sourceKind": "manufacturer"
        },
        {
          "sourceId": "WP02-A-WHITE-RED-FIFE-R148-20261015-S04",
          "url": "https://lamilanaise.com/faq-produits-bio/",
          "title": "La Milanaise, FAQ produits biologiques",
          "accessedOn": "2026-10-15",
          "locator": "Question on differences among flour types and question on unbleached flour.",
          "supports": "The mill distinguishes white flour with bran and germ removed from sifted and whole flour, and explains that unbleached concerns chemical bleaching. This is the mill's general explanation of its flour terms, not a Red Fife-specific process specification.",
          "sourceKind": "manufacturer"
        },
        {
          "sourceId": "WP02-A-WHITE-RED-FIFE-R148-20261015-S05",
          "url": "https://laboiteagrains.com/products/farine-red-fife-entiere-biologique-milanaise?variant=40359808434242",
          "title": "La Boite à Grains, Farine Red Fife Blanche Non Blanchie Biologique",
          "accessedOn": "2026-10-15",
          "locator": "Visible product heading, SKU 62706219831, one-kilogram format, product description, and ingredient declaration. The URL slug contains “entiere”; the live page heading and SKU identify the white variant.",
          "supports": "A Québec retailer currently lists a one-kilogram white, unbleached Red Fife flour by Milanaise and declares organic Red Fife wheat as the ingredient. Retailer naming and product details apply to this listing.",
          "sourceKind": "other"
        },
        {
          "sourceId": "WP02-A-WHITE-RED-FIFE-R148-20261015-S06",
          "url": "https://onlineorganics.ca/products/organic-white-unbleached-wheat-flour-red-fife",
          "title": "OnlineOrganics, Organic White Wheat “Red Fife” Flour (Milanaise)",
          "accessedOn": "2026-10-15",
          "locator": "Current product title, brand, Canada origin, 20-kilogram format, and product description.",
          "supports": "A Canadian retailer lists La Milanaise's white Red Fife flour under the alternate title Organic White Wheat “Red Fife” Flour, identifies the country of origin as Canada and the maker as La Milanaise, and offers a 20-kilogram format. This is listing-specific evidence, not an alternate flour-class standard.",
          "sourceKind": "other"
        },
        {
          "sourceId": "WP02-A-WHITE-RED-FIFE-R148-20261015-S07",
          "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8356361/farine-blanche",
          "title": "OQLF, farine blanche (GDT)",
          "accessedOn": "2026-10-15",
          "locator": "Preferred term, English translation, and definition; last updated 2002.",
          "supports": "OQLF pairs farine blanche with white flour and defines it as wheat flour milled after removal of the bran and germ. This supports the generic Québec terminology and milling distinction; it does not attest the full Red Fife product name.",
          "sourceKind": "regional_authority"
        }
      ],
      "decisions": [
        {
          "outcome": "accepted",
          "reason": "Accept a separate identity-only white Red Fife flour / farine Red Fife blanche reference. Current Québec mill pages list white and whole Red Fife products separately, and the white-flour definition establishes a meaningful milling-grade distinction. Keep the new row separate from ingredient-ref-whole-red-fife-flour and other wheat classes. Add no form, measurement, density, unit mapping, recipe link, or substitution.",
          "sourceIds": [
            "WP02-A-WHITE-RED-FIFE-R148-20261015-S01",
            "WP02-A-WHITE-RED-FIFE-R148-20261015-S02",
            "WP02-A-WHITE-RED-FIFE-R148-20261015-S03",
            "WP02-A-WHITE-RED-FIFE-R148-20261015-S05",
            "WP02-A-WHITE-RED-FIFE-R148-20261015-S07"
          ]
        },
        {
          "outcome": "unresolved",
          "reason": "Keep the mill's T55 equivalence, 11.5% ± 1.5% protein statement, and all-purpose-use comparison scoped to its named white Red Fife product. Do not create a French type-55 crosswalk, protein class, or general substitution from these claims.",
          "sourceIds": [
            "WP02-A-WHITE-RED-FIFE-R148-20261015-S02",
            "WP02-A-WHITE-RED-FIFE-R148-20261015-S03"
          ]
        },
        {
          "outcome": "unresolved",
          "reason": "No volume-to-mass measure or direct density is supported for the white product. Keep package weights listing-specific and do not transfer the whole Red Fife flour's existing 1/2 cup (60 g) portion observation to this product.",
          "sourceIds": [
            "WP02-A-WHITE-RED-FIFE-R148-20261015-S02",
            "WP02-A-WHITE-RED-FIFE-R148-20261015-S05",
            "WP02-A-WHITE-RED-FIFE-R148-20261015-S06"
          ]
        }
      ]
    }

## Source register

All sources were accessed on 2026-10-15. Manufacturer claims about protein, T55, and use are kept product-specific. Retail product titles and package sizes are listing evidence only.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| **WP02-A-WHITE-RED-FIFE-R148-20261015-S01** | La Milanaise, [Nos produits](https://lamilanaise.com/nos-produits/), specialty flour categories “Blanche” and “Entière,” with linked Red Fife product names. | Directly accessible current Québec manufacturer listing places `Farine Red Fife blanche non blanchie biologique` under white specialty flour and `Farine Red Fife entière biologique` under whole specialty flour. Supports a separate product-grade boundary and exact French title wording. |
| **WP02-A-WHITE-RED-FIFE-R148-20261015-S02** | La Milanaise, [Farine Red Fife blanche non blanchie biologique](https://lamilanaise.com/produits/farine-red-fife-blanche-non-blanchie-biologique/), product heading, product description, protein, T55, format, and uses. | Search-indexed official French product content gives the exact title, states T55 and 11.5% ± 1.5% protein, offers a 1 kg format, and describes the supplier's all-purpose comparison and uses. Direct page fetch timed out during this review; the French product catalog in S01 was directly accessible. Treat all product-page claims as specific to this mill product. |
| **WP02-A-WHITE-RED-FIFE-R148-20261015-S03** | La Milanaise, [Organic Unbleached White Red Fife Flour](https://lamilanaise.com/en/produits/organic-unbleached-white-red-fife-flour/), direct English product page. | Directly accessible current primary page. Supports the exact English product phrase, Red Fife wheat identity, one-kilogram format, product-specific T55 and protein claims, all-purpose comparison, and listed uses. It does not establish general grade equivalence or substitute behavior. |
| **WP02-A-WHITE-RED-FIFE-R148-20261015-S04** | La Milanaise, [FAQ produits biologiques](https://lamilanaise.com/faq-produits-bio/), flour-type and non-bleached explanations. | The supplier explains white flour as having bran and germ removed, differentiates sifted and whole flour, and explains that unbleached refers to chemical bleaching. This guards against treating “white” and “unbleached” as the same attribute; it is general mill terminology. |
| **WP02-A-WHITE-RED-FIFE-R148-20261015-S05** | La Boite à Grains, [Farine Red Fife Blanche Non Blanchie Biologique](https://laboiteagrains.com/products/farine-red-fife-entiere-biologique-milanaise?variant=40359808434242), current retailer listing. | Direct page displays the white product title, SKU 62706219831, one-kilogram format, and ingredient “Blé Red Fife biologique.” The URL slug contains `entiere`; page title, variant and SKU identify the visible white product. Listing details do not establish general flour measures. |
| **WP02-A-WHITE-RED-FIFE-R148-20261015-S06** | OnlineOrganics, [Organic White Wheat “Red Fife” Flour (Milanaise)](https://onlineorganics.ca/products/organic-white-unbleached-wheat-flour-red-fife), current product listing. | Canadian retailer uses an alternate English product title, names La Milanaise as maker, identifies Canada as origin, and lists 20 kg. This supports current Canadian market presence and an alternate retailer title, not a separate white-wheat variety or general flour grade. |
| **WP02-A-WHITE-RED-FIFE-R148-20261015-S07** | OQLF, [farine blanche (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8356361/farine-blanche), preferred term, English translation, definition. | OQLF's preferred term is `farine blanche`, paired with `white flour`; its definition says the bran and germ have been removed. The entry was last updated in 2002 and does not name Red Fife. Use it as terminology and generic grade evidence, not as an attestation of the full product name. |

## Local evidence and access note

- The active plan's unchecked WP02 Section A parent item remains open; its completed R147 child says to keep white Red Fife and other flour grades separate [plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1278), [R147 proposal](wp02-a-regional-wheat-flour-residual-review-r147-20261015.md), and [R147 integration note](../batches/wp02-wp03-wp04-r147-gap-review-integration-20261015/README.md).
- The current working tree contains 1,508 ingredient references, 119 ingredient forms, 1,853 research-ledger records, and 6,654 distinct ledger source IDs. The split package manifest lists 114 recipe files; those files contain 1,123 ingredient rows. The phrase and ID collision checks used these current files.
- The official English manufacturer product page, bilingual product category pages, Québec retailer page, Canadian retailer page, OQLF entry, and mill FAQ were accessible. The official French product detail page itself timed out in direct fetch; its current indexed page content was available and is clearly labeled as search-indexed evidence above. The Québec retailer's visible white product page uses a URL slug containing `entiere`, so the proposal relies on its visible white title, SKU, and ingredient details and corroborates the boundary with the manufacturer's bilingual category listing.
- The review was limited to this proposal file. No shared seed data, ledger, generated Kotlin, plan, roadmap, recipes, or tests were changed.
