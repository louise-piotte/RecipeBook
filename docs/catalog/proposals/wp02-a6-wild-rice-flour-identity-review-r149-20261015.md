# WP02 Section 04 A6 R149 — wild rice flour identity review

## Review record

- **Reviewed and sources accessed:** 2026-10-15.
- **Status:** This file records the proposal and its review-time deltas. The parent task has since integrated the matching identity and research-ledger record into the shared workspace; this review did not apply those changes.
- **Scope:** One unallocated regional cereal flour: flour sold as wild rice flour, distinct from wild rice grain and ordinary rice flour.
- **Open checklist item:** [WP02 Section 04 A6, “Continue the A6 review of buckwheat, sorghum, millet, quinoa, amaranth, fonio flour, and other regional flours”](../../RecipeBook-global-ingredient-catalog-plan.txt#L1399).
- **Source-ID prefix:** `WP02-A6-WILD-RICE-FLOUR-R149-20261015-S`. IDs S01–S07 now belong to the matching R149 ledger record added by the parent task; this proposal reuses that record's source IDs.

## Recommendation

**The evidence supports an identity-only reference for wild rice flour / farine de riz sauvage.** The parent task has since integrated that reference. Current Canadian product pages identify standalone wild rice flour from Canadian suppliers. A Canadian food maker’s current bilingual ingredient list uses both “wild rice flour” and “farine de riz sauvage,” while listing ordinary rice flour separately. The French display is therefore a current Canadian product-label phrase, not an OQLF-preferred flour term or a claim about Québec retail prevalence. Keep that limit visible.

Treat this as the flour-market class for products sold as flour made from wild rice. CFIA describes wild rice as a grass outside the standardized cultivated-rice category and recognizes “wild rice” as its common food name; its export program identifies Canadian wild rice as *Zizania palustris* and *Z. aquatica* [S01]. Do not claim that every product in this market class comes from one species. The OQLF entry supports the base Québec term “riz sauvage” / “wild rice,” but its definition is old and covers the grain, not flour [S02].

Add no aliases. The exact English and French product phrases are the canonical displays. Keep organic, gluten-free, brand, source-region, and package wording out of the identity. Do not add any form, density, unit mapping, conversion, package yield, recipe link, or active substitution.

## Product and identity boundary

| Candidate or nearby identity | Recommendation | Evidence boundary |
|---|---|---|
| Wild rice flour / farine de riz sauvage | **Add** as an identity-only FLOUR_AND_STARCH reference. | Canadian suppliers currently sell standalone products with the exact English product phrase. A Canadian bilingual mix ingredient list directly attests the French phrase, but not as a standalone Québec flour package [S03–S05]. |
| Wild rice / riz sauvage | Keep on existing ingredient-ref-wild-rice. | This row represents the grain, not its milled flour. CFIA distinguishes wild rice from standardized cultivated rice; OQLF’s term entry concerns the grain [S01–S02]. |
| Rice flour / farine de riz; white, brown, glutinous, Mochiko, Shiratamako, and roasted red rice flours | Keep on the existing Oryza-related flour identities. | Wild rice is a grass, and the bilingual mix ingredient list explicitly lists ordinary rice flour separately from wild rice flour. Do not alias the proposed row to generic rice flour [S01, S03]. |
| Wild rice blend / mélange de riz sauvage | Keep on existing ingredient-ref-wild-rice-blend. | A dry mixture containing multiple grains is distinct from a single-ingredient flour. The prior WP03 blend review does not decide this flour identity. |
| Puffed wild rice / riz sauvage soufflé | Keep on existing ingredient-ref-puffed-wild-rice. | Puffed grain is not flour. No alias or process relationship is proposed. |
| “Wild rice powder,” “wild rice meal,” or “wild rice flour blend” | Leave unassigned. | No reviewed Canadian source establishes these as equivalent aliases for the plain flour class. A blend remains a composite product. |

## Proposed reference JSON delta

This is the complete new reference object proposed for ingredient-references.v1.json. No existing row should be edited.

    {
      "id": "ingredient-ref-wild-rice-flour",
      "nameFr": "farine de riz sauvage",
      "nameEn": "wild rice flour",
      "aliasesFr": [],
      "aliasesEn": [],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-15T00:00:00Z",
      "category": "FLOUR_AND_STARCH"
    }

The identity uses only the two evidenced display phrases. The standalone Canadian product pages support the English phrase [S04–S06]; the bilingual manufacturer ingredient list supports the French display while separately identifying ordinary rice flour [S03]. The French phrase is source-attested Canadian food-label wording, not a Québec terminology ruling.

## Live package, ledger, archive, picker, and recipe audit

The read-only package snapshot contained **1,511 ingredient references, 119 forms, and 1,856 research-ledger records**. The recipe manifest lists **114 recipes and 1,123 ingredient rows**.

| Surface | Finding |
|---|---|
| Active references | The review-time snapshot had ingredient-ref-wild-rice as the grain identity, ingredient-ref-wild-rice-blend as a separate blend identity, and ingredient-ref-puffed-wild-rice as a separate puffed-grain identity. The parent task has since integrated ingredient-ref-wild-rice-flour with the exact proposed display names. Existing rice-flour references include generic, white, brown, glutinous, Mochiko, Shiratamako, and roasted red rice flour. |
| Active forms | No form names, labels, or match terms mention wild rice or riz sauvage. The candidate ID ingredient-ref-wild-rice-flour is unused. |
| Research ledger | The review-time snapshot had a verified wild-rice grain record, with measurement and substitution research not yet researched, plus a separate accepted wild-rice-blend record. Neither prior record settled the flour identity or supplied flour-specific measurements. The parent task has since added the matching flour record with S01–S07 to the shared ledger. |
| Proposal and batch archive | Full-text searches for wild rice flour, farine de riz sauvage, and ingredient-ref-wild-rice-flour found no earlier focused flour review, hold, or equivalent integration. The accepted WP03 wild-rice-blend review concerns mixed dry grains and is not an equivalent flour review. |
| Recipe corpus | All 114 manifest-listed recipe JSON files and 1,123 ingredient rows were scanned. None contains wild rice flour, farine de riz sauvage, wild rice, or riz sauvage. No bundled recipe demand, link, measure, or substitution is proposed. |

The following static picker projection applies the phrase-first and partial-match behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It records the review-time baseline before the parent task integrated the reference; it is a projection from JSON, not an app test.

| Query | Before integration | After integration | Effect |
|---|---:|---:|---|
| wild rice flour | 0 | 1 | Finds only ingredient-ref-wild-rice-flour. |
| farine de riz sauvage | 0 | 1 | Finds only ingredient-ref-wild-rice-flour. |
| wild rice | 3 | 4 | Adds the flour beside wild rice grain, wild rice blend, and puffed wild rice. |
| riz sauvage | 3 | 4 | Adds the flour beside the same three distinct products. |
| rice flour | 7 | 8 | Adds the flour to the existing broad flour search. |
| farine de riz | 7 | 8 | Adds the flour to the existing broad French flour search. |
| wild rice blend | 1 | 1 | Remains exclusive to the existing blend identity. |
| puffed wild rice | 1 | 1 | Remains exclusive to the existing puffed-grain identity. |

At review time, the candidate ID and both exact display phrases had no active reference or form owner. The broad “wild rice” and “riz sauvage” queries gained one distinct flour result because the proposed display contains those phrases; the longer blend and puffed-grain queries remain exclusive. The generic “rice flour” and “farine de riz” queries also gained the new row because those complete phrases occur in the proposed displays; this is a visible qualified addition, not an alias merge.

After parent integration, the projected result counts in the final column are now the live counts. The reference is present, while no new form was added.

## Measurements and substitutions

- **Package weights:** The current Canadian product listings show package weights such as 1 lb and 454 g [S05–S06]. These are net package quantities, not cup/spoon measures or paired mass-volume observations.
- **Density and kitchen measures:** No reviewed source establishes bulk density, cup/spoon mass, or a transferable mass-volume relationship for wild rice flour. Keep defaultDensity null and unitMappings empty; add no measurement observation or conversion.
- **Bread formula:** Forbes Wild Foods’ product text says bread can be made with 1/3 wild rice flour and 2/3 hard wheat flour [S06]. It does not say whether the ratio is by mass or volume, identify a particular formula, or establish a general replacement rule. Preserve it only as this seller’s product-specific formulation advice.
- **Study evidence:** A 2024 primary study reports differences in bread made with wild rice flour compared with wheat and brown-rice breads, including lower specific volume, lower height, and greater hardness for the tested wild-rice bread [S07]. These are study-specific results, not a general substitution ratio.
- **Substitution status:** No global or contextual substitution rule is supported for the bundled recipes. The proposed ledger records a bounded no-general-substitute finding; the seller’s 1:2 bread blend remains inactive and source-specific.

## Research-ledger JSON delta (integrated; refreshed source entries)

The parent task has added this ingredient_reference record to the shared ledger with the same record ID and S01–S07 source IDs. The proposal refreshes the S03 and S07 URLs and source claims below; those updates are pending alignment in the shared ledger. The record documents the absence of a reusable kitchen measure and general substitution while keeping package and formulation figures source-scoped. No measurement observation, active substitution, or unit conversion is included.

    {
      "recordId": "ingredient-ref-wild-rice-flour",
      "recordType": "ingredient_reference",
      "identityState": "verified",
      "measurementState": "researched_no_supported_value",
      "substitutionResearchState": "researched_no_supported_substitute",
      "sources": [
        {
          "sourceId": "WP02-A6-WILD-RICE-FLOUR-R149-20261015-S01",
          "url": "https://inspection.canada.ca/en/food-labels/labelling/industry/grain-and-bakery-products",
          "title": "Canadian Food Inspection Agency, Grain and bakery product labelling requirements",
          "accessedOn": "2026-10-15",
          "locator": "Wild rice section; common-name and standardized-rice boundary.",
          "supports": "CFIA says wild rice is considered a grass rather than part of the standardized rice category and that wild rice is an appropriate common food name, including in an ingredient list. This supports keeping wild rice separate from Oryza rice; it does not define a flour product or its French name.",
          "sourceKind": "regional_authority"
        },
        {
          "sourceId": "WP02-A6-WILD-RICE-FLOUR-R149-20261015-S02",
          "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8418384/riz-sauvage",
          "title": "Office québécois de la langue française, riz sauvage (GDT)",
          "accessedOn": "2026-10-15",
          "locator": "Preferred term riz sauvage and English equivalent wild rice; entry last updated 1985.",
          "supports": "Pairs the preferred Québec grain name riz sauvage with wild rice. The older entry concerns the grain, not a flour product or the compound farine de riz sauvage.",
          "sourceKind": "regional_authority",
          "versionOrDate": "Last updated 1985"
        },
        {
          "sourceId": "WP02-A6-WILD-RICE-FLOUR-R149-20261015-S03",
          "url": "https://eatwildrice.ca/collections/made-with-rice/products/pancake-waffle-muffin-mix-gluten-free-6x-500g",
          "title": "Floating Leaf Fine Foods, Pancake Waffle & Muffin Mix (Gluten Free)",
          "accessedOn": "2026-10-15",
          "locator": "Current bilingual product page, 500 g finished mix, English and French ingredient lists.",
          "supports": "The English list names rice flour and wild rice flour separately; the French list names farine de riz and farine de riz sauvage separately. This directly supports the source-attested French flour phrase and product distinction, but the page describes a composite mix rather than a standalone flour package.",
          "sourceKind": "manufacturer"
        },
        {
          "sourceId": "WP02-A6-WILD-RICE-FLOUR-R149-20261015-S04",
          "url": "https://www.wildmanricing.ca/product/gluten-free-organic-wild-rice-flour/",
          "title": "Wild Man Ricing, Gluten Free Organic Wild Rice Flour",
          "accessedOn": "2026-10-15",
          "locator": "Product heading and description.",
          "supports": "A current Canadian producer offers a standalone product titled Gluten Free Organic Wild Rice Flour and says it is ground from its own Northern Manitoba wild rice. The page does not give a French label, package weight, or a botanical species declaration for the flour.",
          "sourceKind": "manufacturer"
        },
        {
          "sourceId": "WP02-A6-WILD-RICE-FLOUR-R149-20261015-S05",
          "url": "https://northernlightsfoods.com/collections/featured-products",
          "title": "Northern Lights Foods, Featured Products",
          "accessedOn": "2026-10-15",
          "locator": "Current official storefront listing for Organic Wild Rice Flour, 1 lb.",
          "supports": "The producer’s current storefront lists Organic Wild Rice Flour as a standalone 1 lb product. The linked product-detail page returned a cache miss in this review; the listing supports the product title and package size only.",
          "sourceKind": "manufacturer"
        },
        {
          "sourceId": "WP02-A6-WILD-RICE-FLOUR-R149-20261015-S06",
          "url": "https://www.wildfoods.ca/products/wild-rice-flour",
          "title": "Forbes Wild Foods, Wild Rice Flour",
          "accessedOn": "2026-10-15",
          "locator": "Search-indexed product description, package size, listed species, and bread-use statement; direct page open returned a cache miss.",
          "supports": "The retailer listing names Wild Rice Flour by Northern Lights Foods, shows a 454 g package, identifies its described wild rice as Zizania palustris, and says a bread can be made with 1/3 wild rice flour and 2/3 hard wheat flour. Treat the species and ratio as product-page claims only; the ratio basis is unstated and neither claim is generalized to the catalog class.",
          "sourceKind": "culinary_reference"
        },
        {
          "sourceId": "WP02-A6-WILD-RICE-FLOUR-R149-20261015-S07",
          "url": "https://www.jstage.jst.go.jp/article/fstr/30/5/30_FSTR-D-23-00232/_html/-char/en",
          "title": "Mochizuki, Okabe, Osawa, and Asami, Effects of wild rice flour on physical and tasting properties of breads",
          "accessedOn": "2026-10-15",
          "locator": "Food Science and Technology Research 30(5) (2024), 567–576; abstract and bread physical-property results.",
          "supports": "Primary study reports that the tested bread with 20% wild rice flour had lower specific volume, the lowest height, and the greatest hardness among the tested wheat, brown-rice, and wild-rice breads. These formula-specific findings do not establish a household measure or transferable flour-replacement ratio.",
          "sourceKind": "other",
          "versionOrDate": "2024"
        }
      ],
      "substitutionFindings": [
        {
          "findingId": "ingredient-ref-wild-rice-flour-no-general-substitute-r149",
          "researchState": "researched_no_supported_substitute",
          "context": "General flour replacement across household recipes.",
          "basis": "The Forbes listing gives one unspecified bread blend using 1/3 wild rice flour and 2/3 hard wheat flour, but does not state the ratio basis or establish a transferable replacement. The primary bread study reports product/formula-specific differences rather than a general replacement rule.",
          "limitations": [
            "Keep the Forbes bread ratio as product-specific formulation advice; do not encode it as a global or contextual substitution.",
            "The study findings do not establish a substitute for a bundled RecipeBook line."
          ],
          "sourceIds": [
            "WP02-A6-WILD-RICE-FLOUR-R149-20261015-S06",
            "WP02-A6-WILD-RICE-FLOUR-R149-20261015-S07"
          ]
        }
      ],
      "decisions": [
        {
          "outcome": "accepted",
          "reason": "Accept identity-only wild rice flour / farine de riz sauvage for the Canadian-attested flour product class. Keep it distinct from wild rice grain, Oryza rice flours, wild rice blend, and puffed wild rice. The French display is attested in a Canadian manufacturer’s bilingual ingredient list, not established as an OQLF-preferred or standalone Québec retail name. Add no aliases, forms, measurements, density, mappings, recipe links, conversions, yields, or active substitutions.",
          "sourceIds": [
            "WP02-A6-WILD-RICE-FLOUR-R149-20261015-S01",
            "WP02-A6-WILD-RICE-FLOUR-R149-20261015-S02",
            "WP02-A6-WILD-RICE-FLOUR-R149-20261015-S03",
            "WP02-A6-WILD-RICE-FLOUR-R149-20261015-S04",
            "WP02-A6-WILD-RICE-FLOUR-R149-20261015-S05",
            "WP02-A6-WILD-RICE-FLOUR-R149-20261015-S06",
            "WP02-A6-WILD-RICE-FLOUR-R149-20261015-S07"
          ]
        }
      ]
    }

## What remains open

- Keep the broader WP02 A6 regional flour review open.
- Recheck whether an independent Québec product label or terminology source establishes the flour-specific French phrase as a Québec-preferred term. The current delta uses it only as Canadian bilingual product wording.
- Reassess measurements or substitution only when a stated product, method, recipe, or quantity provides evidence that can safely support a reusable catalog behavior.
- This proposal does not reopen or change the existing wild rice grain, blend, puffed-grain, or rice-flour rows.

## Proposal-local static checks

UTF-8 without BOM, no trailing whitespace or mojibake markers, both JSON deltas parsing, the ledger record validating against the repository schema, local Markdown links, picker projection, manifest recipe scan, and proposal whitespace checks passed. The proposal reference matches the active reference. The integrated ledger has the same record ID and S01–S07 IDs; the S03 and S07 source URL/claim updates in this proposal await parent alignment. No form exists for the ingredient. The review-time picker projection returned the documented 0→1, 3→4, and 7→8 changes; all 114 manifest recipes and 1,123 ingredient rows parsed, with zero candidate phrase hits. No app, Gradle, emulator, or deployment tests were run.
