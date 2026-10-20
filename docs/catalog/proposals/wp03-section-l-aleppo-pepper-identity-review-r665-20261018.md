# WP03 Section L: Aleppo pepper identity review (R665)

- Reviewed: 2026-10-18
- Status: accepted and integrated as an identity-only catalog reference and ledger record.
- Scope: the next open Section L dried-chile candidate after Kashmiri, limited to the named Aleppo pepper spice, its Québec French wording, a narrow English search alias, and boundaries with generic flakes, powders, and other regional pepper names.
- Verification: primary-source review; static package, generated-index, ledger, ownership, picker, recipe-corpus, encoding, link, and whitespace checks. No software tests, build, emulator run, or deployment.

## Recommendation

Accept one identity-only seasoning reference:

- English display: **Aleppo pepper**
- Québec French display: **piment d'Alep** (local Québec recipe wording; descriptive, not an OQLF-approved named term)
- English aliases: **Aleppo pepper flakes**, **Aleppo chili pepper flakes**
- French aliases: none
- Category: **BAKING_AND_SPICE**
- Density: null; unit mappings: empty
- Forms, recipe links, substitutions, and numeric observations: none

The University of California's Master Gardener program lists Aleppo as a named pepper and describes the dried, crushed-flake culinary presentation. A seed supplier independently sells an Aleppo pepper seed product and describes its dried, crushed or ground spice use. Current Canadian product pages use the Aleppo name for both a product whose ingredient field says only “Dried Aleppo Pepper” and a PC Black Label product whose ingredient list adds salt and vegetable oil. Together these support the source-named culinary seasoning identity, while showing why the catalog should not impose a universal product formula or preparation state. [S01–S04]

Three Québec recipe publishers use **piment d'Alep** in ingredient lists. The OQLF entry reused below supports only the generic French term **piment**; no Aleppo-specific OQLF entry appeared in the scoped search. Treat the local French display as descriptive recipe wording. Do not treat source recipe amounts or a recipe-specific “or” clause as general measurement or substitution evidence. [S05–S07; reused OQLF source]

## Plan and duplicate check

The active [WP03 Section L checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6287) still lists Aleppo in the dried-chile sweep. R654 integrated dried ñora and R657 integrated whole dried Kashmiri pepper; neither resolved Aleppo. The earlier [WP06 Mexican dried-chile review](wp06-mexican-dried-chile-boundaries-20261009.md) concerns Mexican and Central American names, not Aleppo.

The current active catalog contains no Aleppo reference, form label or match term, legacy candidate, or ledger identity. The proposed ID, ingredient-ref-aleppo-pepper, is unused across active references, forms, the legacy archive, and the ledger. No prior Aleppo-focused proposal or integration was found.

Keep active neighboring references separate:

- ingredient-ref-red-chili-flakes owns **red chili flakes / flocons de piment rouge**.
- ingredient-ref-chili-powder owns **chili powder / poudre de chili**.
- ingredient-ref-gochugaru owns the specifically named Korean seasoning.
- The previously reviewed Mexican dried-chile candidates remain within their own names and source boundaries.

The Edi Gourmet and Ameen Foods marketplace copy groups Aleppo with terms such as Halaby, Pul biber, and Marash. Those pages are sellers' own text, and they do not establish that every listed regional name is an exact interchangeable identity. The Ameen page also lists Armenian and Syrian phrases and describes one vendor's salt-and-oil preparation. Do not promote **Halaby/Halabi**, **Pul biber**, **Maraş/Marash**, **Armenian pepper**, **Syrian pepper**, **Near East pepper**, or **Aleppo paprika** to aliases. This proposal uses only the exact Aleppo product names and the Québec recipe wording. [S03, S04, S08]

## Proposed catalog delta

Add one reference only. The ID and proposed source-ID prefix are unoccupied in the current catalog, legacy archive, and ledger.

    {
      "id": "ingredient-ref-aleppo-pepper",
      "nameFr": "piment d'Alep",
      "nameEn": "Aleppo pepper",
      "aliasesFr": [],
      "aliasesEn": [
        "Aleppo pepper flakes",
        "Aleppo chili pepper flakes"
      ],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-18T00:00:00Z",
      "category": "BAKING_AND_SPICE"
    }

The alias **Aleppo pepper flakes** is the exact English product-title wording on the Canada-facing Edi listing. **Aleppo chili pepper flakes** appears as the named pepper-flake ingredient on the Loblaws PC Black Label product page; that product separately lists salt and vegetable oil, so this is only a narrow pepper-name alias, not a formula for all Aleppo pepper. [S03–S04]

Do not add a form. The reviewed sources describe crushed flakes and ground spice, while the Loblaws product combines pepper flakes with salt and oil. They do not establish one single normalized form beneath a broader active fresh Aleppo reference. This record represents the culinary spice identity in its commonly dried product context, not a fresh pepper plant or a universal whole-to-ground state model. Add no species, cultivar, heat, sweetness, color, origin, measure, density, unit mapping, conversion, yield, recipe link, or substitution.

## Proposed research-ledger delta

Add one ingredient_reference record keyed to the proposed reference. Identity is verified as a named culinary spice. Measurement and substitution research remain not_yet_researched; the Québec recipe quantities and one recipe-specific alternative are not generalized. Add eight new source entries. Reuse the existing OQLF generic piment source by source ID, WP03-L-FRESNO-20261015-R144-S04; do not allocate a second source ID for that page.

    {
      "recordId": "ingredient-ref-aleppo-pepper",
      "recordType": "ingredient_reference",
      "identityState": "verified",
      "measurementState": "not_yet_researched",
      "substitutionResearchState": "not_yet_researched",
      "sources": [
        {
          "sourceId": "WP03-L-ALEPPO-R665-20261018-S01",
          "url": "https://www.restorationseeds.com/products/aleppo-pepper-sweet",
          "title": "Restoration Seeds, Aleppo pepper, sweet, Organic",
          "accessedOn": "2026-10-18",
          "locator": "Aleppo product description and linked Capsicum annuum listing.",
          "supports": "The seed supplier lists a named Aleppo pepper product and describes its use as a dried, crushed or ground spice. The source's taxon, sweet classification, heat, color, and regional description are specific to its seed listing and are not adopted as universal catalog properties.",
          "sourceKind": "other"
        },
        {
          "sourceId": "WP03-L-ALEPPO-R665-20261018-S02",
          "url": "https://ucanr.edu/site/uc-master-gardener-program-contra-costa-county/gtps-2026-peppers",
          "title": "University of California Agriculture and Natural Resources, UC Master Gardener Program of Contra Costa County, GTPS 2026 - Peppers",
          "accessedOn": "2026-10-18",
          "locator": "Hot Peppers, Aleppo entry.",
          "supports": "The extension page lists Aleppo as a named pepper and describes its traditional culinary use dried and crushed into flakes. Its heat, fruit size, and specific seed-sale entry are not treated as universal specifications.",
          "sourceKind": "extension"
        },
        {
          "sourceId": "WP03-L-ALEPPO-R665-20261018-S03",
          "url": "https://www.walmart.ca/en/ip/Edi-Gourmet-Spice-Aleppo-Pepper-Flakes-113g-4oz/2341IGMYCBB4",
          "title": "Walmart Canada, Edi Gourmet Spice Aleppo Pepper Flakes",
          "accessedOn": "2026-10-18",
          "locator": "Product title, ingredient field, and seller identity in the listing.",
          "supports": "The Canada-facing listing title names the item Aleppo Pepper Flakes and its ingredient field says Dried Aleppo Pepper. The listing identifies Edi Gourmet Spice as the seller and Walmart as the fulfiller. Only the title and ingredient wording are used; other seller copy about synonyms, origin, heat, and flavor is not adopted.",
          "sourceKind": "other"
        },
        {
          "sourceId": "WP03-L-ALEPPO-R665-20261018-S04",
          "url": "https://www.loblaws.ca/en/aleppo-pepper/p/21431146_EA",
          "title": "Loblaws, PC Black Label Aleppo Pepper",
          "accessedOn": "2026-10-18",
          "locator": "Product title, description, ingredient list, product number 21431146_EA.",
          "supports": "The Canadian grocery listing names PC Black Label Aleppo Pepper, describes the product as chili flakes, and lists Aleppo Chili Pepper Flakes, Salt, and Vegetable Oil as ingredients. This is one product-specific seasoning formula, not a universal Aleppo-pepper composition or a reusable measure.",
          "sourceKind": "other"
        },
        {
          "sourceId": "WP03-L-ALEPPO-R665-20261018-S05",
          "url": "https://www.recettes.qc.ca/recettes/recette/veloute-de-courge-poivree",
          "title": "Recettes du Québec, Velouté de courge poivrée",
          "accessedOn": "2026-10-18",
          "locator": "Ingredient list, spicy pumpkin seeds; preparation step 5.",
          "supports": "The Québec recipe uses the French phrase piment d'Alep. Its line says 1 teaspoon piment d'Alep or 1/2 teaspoon (2 ml) generic hot-pepper flakes. This is the recipe's own wording and alternative only; it does not establish an interchangeable rule or reusable catalog measure.",
          "sourceKind": "culinary_reference"
        },
        {
          "sourceId": "WP03-L-ALEPPO-R665-20261018-S06",
          "url": "https://cuisinez.telequebec.tv/recettes/6427/pain-de-viande-d-alep",
          "title": "Télé-Québec, Cuisinez, Pain de viande d'Alep",
          "accessedOn": "2026-10-18",
          "locator": "Ingredient list, main recipe.",
          "supports": "A Québec media recipe uses piment d'Alep doux. This corroborates local use of the base wording piment d'Alep; doux is a source-specific qualifier and is not added as an alias or universal sweetness/heat claim. The recipe quantity is not a catalog measure.",
          "sourceKind": "culinary_reference"
        },
        {
          "sourceId": "WP03-L-ALEPPO-R665-20261018-S07",
          "url": "https://grainsduquebec.ca/nos-recettes/oeuf-a-la-turque-sur-riz-davoine",
          "title": "Grains du Québec, Œufs à la turque sur riz d'avoine",
          "accessedOn": "2026-10-18",
          "locator": "Ingredient list for the spiced butter.",
          "supports": "A Québec grains-sector recipe uses the phrase piment d'Alep in a spiced-butter ingredient list. This supports local recipe wording only; the recipe amount is not a general measurement observation.",
          "sourceKind": "culinary_reference"
        },
        {
          "sourceId": "WP03-L-ALEPPO-R665-20261018-S08",
          "url": "https://ameenfoods.ca/products/aleppo-sweet",
          "title": "Ameen Foods, Aleppo Pepper",
          "accessedOn": "2026-10-18",
          "locator": "Product description, traditional preparation note, and alternate-name list.",
          "supports": "The Canadian seller lists an Aleppo Pepper product, says it ships to Québec, describes its own sun-dried and semi-crushed product as mixed with salt and oil, and lists multiple alternate regional names. The page is primary evidence for its own listing only. Its broad alias list and preparation description are not treated as a universal name set or product formula.",
          "sourceKind": "other"
        },
        {
          "sourceId": "WP03-L-FRESNO-20261015-R144-S04",
          "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410223/piment",
          "title": "Office québécois de la langue française, piment (GDT)",
          "versionOrDate": "Last updated 1988",
          "accessedOn": "2026-10-15",
          "locator": "Preferred generic term and English/Latin translations.",
          "supports": "Supports piment as a generic French term for the Capsicum plant/fruit and pepper as the English translation. It is not an Aleppo-specific terminology ruling.",
          "sourceKind": "regional_authority"
        }
      ],
      "measurementObservations": [],
      "substitutionFindings": [],
      "decisions": [
        {
          "outcome": "accepted",
          "reason": "Add one identity-only Aleppo pepper culinary-spice reference. Use Aleppo pepper as the English display with only the directly attested Aleppo pepper flakes and Aleppo chili pepper flakes aliases; use the Québec recipe wording piment d'Alep as the French display, not as an OQLF-approved named term. Keep it distinct from generic red chili flakes, chili powder, gochugaru, named Mexican dried chiles, and broad seller synonym lists. The reviewed sources vary between dried pepper alone and one salt-and-oil product, so do not store a universal formula or form. Add no measurement, density, unit mapping, conversion, yield, recipe link, heat, sweetness, color, origin, botanical taxon, or substitution. Measurement and substitution research remain not_yet_researched.",
          "sourceIds": [
            "WP03-L-ALEPPO-R665-20261018-S01",
            "WP03-L-ALEPPO-R665-20261018-S02",
            "WP03-L-ALEPPO-R665-20261018-S03",
            "WP03-L-ALEPPO-R665-20261018-S04",
            "WP03-L-ALEPPO-R665-20261018-S05",
            "WP03-L-ALEPPO-R665-20261018-S06",
            "WP03-L-ALEPPO-R665-20261018-S07",
            "WP03-L-ALEPPO-R665-20261018-S08",
            "WP03-L-FRESNO-20261015-R144-S04"
          ]
        }
      ]
    }

## Product, name, and form boundaries

- **Dried seasoning versus fresh pepper:** The reviewed pepper sources describe the Aleppo pepper spice as dried and commonly crushed or ground. No active fresh Aleppo reference exists, and these sources do not justify a fresh-to-dried form relationship. The new reference covers the named culinary spice only. [S01–S03]
- **Crushed flakes versus ground product:** Sources describe more than one market presentation. No one presentation should become a universal ingredient form or a conversion. The English aliases record exact wording attested in current Canadian product listings; they do not make ground Aleppo products separate identities. [S01–S04]
- **Salt and oil:** Edi's listing identifies dried Aleppo Pepper as its ingredient, while PC Black Label and Ameen Foods describe product-specific salt-and-oil additions. Do not store the PC or Ameen formula on the reference, create a separate Aleppo seasoning blend, or imply every Aleppo product is pure pepper. [S03–S04, S08]
- **Regional names:** Seller text groups Halaby/Halabi, Pul biber, Maraş/Marash, Armenian, Syrian, Near East, and Aleppo paprika terms inconsistently. These broad phrases can represent other regional products or seller-specific synonym choices. They are not aliases in this proposal. [S03–S04, S08]
- **Québec French:** Recettes du Québec, Télé-Québec, and Grains du Québec each use piment d'Alep in a recipe. OQLF's reused piment entry is generic and does not approve that named phrase. Keep piment d'Alep as a provisional local display. Do not add flocons de piment d'Alep, piment d'Alep doux, piment fort, or generic flocons de piment rouge as aliases. [S05–S07, reused OQLF source]
- **Measurements and substitutions:** Québec recipes give source-specific teaspoon amounts. One recipe lists generic hot-pepper flakes as an “or” alternative; do not generalize that recipe line into a substitution or ratio. Add no observation or substitution finding. [S05–S07]
- **Botany and attributes:** Restoration Seeds lists Capsicum annuum for its seed product, and the extension page gives a heat value for its listed pepper entry. Neither establishes a universal botanical classification, cultivar, origin, heat, flavor, size, or color specification for all products sold as Aleppo pepper. [S01–S02]

## Ownership, picker, and recipe audit

Current review snapshot after R657: **1,836 ingredient references**, **164 forms**, **56 legacy candidates**, **2,209 ledger records**, **10,331 source entries**, and **8,726 distinct source IDs**.

Exact normalized-name and identifier checks covered Aleppo/Alep, the proposed English and French displays and aliases, Halaby/Halabi, Halab, Pul biber, Maraş/Marash, Armenian pepper, Syrian pepper, Aleppo paprika, and the generic chili-flake/powder neighbors. No Aleppo candidate name or ID was found in the active reference file, ingredient forms, legacy archive, or ledger. The proposed reference ID and new source-ID prefix R665 were unallocated.

The eight new R665 source URLs had no existing ledger owners. The generic OQLF piment URL had three existing record owners: Fresno, Padrón, and ñora. This proposal reuses `WP03-L-FRESNO-20261015-R144-S04` by source ID; before R665 that source ID was attached to Fresno and ñora, while Padrón has a separate source ID for the same URL. After integration, the reused source ID has three record owners and the OQLF URL has four. This reuse does not claim OQLF approval for `piment d'Alep`. Each of the eight new source IDs remains owned only by R665.

A static projection of the current phrase-first [ingredient picker](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), using current reference/form terms and the proposed row, gives:

| Query | Current | With proposal |
|---|---:|---:|
| Aleppo | 0 | 1: ingredient-ref-aleppo-pepper |
| Aleppo pepper | 0 | 1: ingredient-ref-aleppo-pepper |
| Aleppo pepper flakes | 0 | 1: ingredient-ref-aleppo-pepper |
| Aleppo chili pepper flakes | 0 | 1: ingredient-ref-aleppo-pepper |
| piment d'Alep | 0 | 1: ingredient-ref-aleppo-pepper |
| red chili flakes / flocons de piment rouge | 1: ingredient-ref-red-chili-flakes | unchanged |
| chili powder / poudre de chili | 1: ingredient-ref-chili-powder | unchanged |
| gochugaru | 1: ingredient-ref-gochugaru | unchanged |
| piment | 32 | 33 |
| pepper | 39 | 40 |
| Halaby pepper / pul biber / Maraş pepper | 0 | 0 |

The proposed names do not take over the generic-flake or powder searches. The broad piment and pepper queries each gain one expected result. No form is proposed, so no form hint is added.

All **114** manifest-listed recipe files and **1,123** ingredient rows were scanned for Aleppo/Alep, Halaby/Halabi, Halab, Pul biber, Marash/Maraş pepper, and piment d'Alep phrases. There were **zero** candidate hits across full recipe files and ingredient rows. The two adjacent generic chile ingredient lines are recipe 034 #6, “2 tbsp chili powder,” and recipe 043 #6, “1 tbsp red chili flakes”; both retain their current references. No bundled recipe link or relabeling is proposed. The three Québec recipe sources above show external local usage, but their quantities remain source-specific.

## Sources

| ID | Source and locator | Use and limit |
|---|---|---|
| S01 | Restoration Seeds, [Aleppo pepper, sweet, Organic](https://www.restorationseeds.com/products/aleppo-pepper-sweet), product description and linked taxon. | Primary seed-seller naming and dried/crushed or ground use; no universal taxon, heat, or origin claim. |
| S02 | University of California Agriculture and Natural Resources, [UC Master Gardener Program, GTPS 2026 - Peppers](https://ucanr.edu/site/uc-master-gardener-program-contra-costa-county/gtps-2026-peppers), Hot Peppers, Aleppo entry. | Extension entry for the name and dried/flaked culinary presentation; its heat and seed-sale details are not generalized. |
| S03 | Walmart Canada, [Edi Gourmet Spice Aleppo Pepper Flakes](https://www.walmart.ca/en/ip/Edi-Gourmet-Spice-Aleppo-Pepper-Flakes-113g-4oz/2341IGMYCBB4), product title, ingredient field, and seller identity. | The title names the product as Aleppo Pepper Flakes and the ingredient field says Dried Aleppo Pepper. Other seller copy is not used. |
| S04 | Loblaws, [PC Black Label Aleppo Pepper](https://www.loblaws.ca/en/aleppo-pepper/p/21431146_EA), title, product description, and ingredients. | Current Canadian listing; its own ingredients include pepper flakes, salt, and vegetable oil. |
| S05 | Recettes du Québec, [Velouté de courge poivrée](https://www.recettes.qc.ca/recettes/recette/veloute-de-courge-poivree), seed topping ingredient and step 5. | Direct Québec French wording and one recipe-specific alternative; no reusable measure or substitution. |
| S06 | Télé-Québec, Cuisinez, [Pain de viande d'Alep](https://cuisinez.telequebec.tv/recettes/6427/pain-de-viande-d-alep), ingredient list. | Direct Québec use of piment d'Alep doux; no universal heat/sweetness claim or amount. |
| S07 | Grains du Québec, [Œufs à la turque sur riz d'avoine](https://grainsduquebec.ca/nos-recettes/oeuf-a-la-turque-sur-riz-davoine), spiced-butter ingredient list. | Additional Québec recipe wording; no reusable amount. |
| S08 | Ameen Foods, [Aleppo Pepper](https://ameenfoods.ca/products/aleppo-sweet), product description, preparation note, and alternate-name list. | Canadian seller's own product and seller-generated terms only; its aliases and salt/oil statement are not universal. |
| Reused | Office québécois de la langue française, [piment (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410223/piment), generic preferred term and translations; source ID WP03-L-FRESNO-20261015-R144-S04. | Supports generic piment and pepper only. Reuse existing source ID; not an Aleppo-specific terminology ruling. |

## Static review checks

- Re-read AGENTS.md, Requirements.md, roadmap.md, the live Section L checklist, active reference/form JSON, the legacy archive, current ledger, and the R654/R657 and WP06 Mexican dried-chile reviews.
- Confirmed current counts, active and archived ownership, candidate ID ownership, eight new source-ID and URL owners, and the existing OQLF source-ID reuse.
- Projected specific and broad picker queries from current reference/form search terms and the proposed aliases using IngredientSearch.kt phrase-first and fallback behavior.
- Read all 114 manifest-listed recipe files and scanned 1,123 ingredient rows; found no Aleppo-specific recipe demand.
- This file is UTF-8 without BOM. No software tests, build, emulator run, or deployment were run; this proposal changes documentation only.
