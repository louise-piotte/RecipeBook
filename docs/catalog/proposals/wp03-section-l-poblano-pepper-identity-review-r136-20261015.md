# WP03 Section L R136 — Poblano pepper identity review — 2026-10-15

- **Status:** proposal only. No shared catalog JSON, ledger, plan, roadmap, or generated file was changed.
- **Disposition:** add one bilingual Poblano reference and one explicit fresh form: **poblano pepper / piment poblano** and **fresh poblano pepper / piment poblano frais**. Add only the crop-qualified aliases **poblanos** (French) and **poblano peppers** (English). Record two independent retailer-scoped item estimates separately. Add no reusable weight, density, unit mapping, yield, conversion, recipe link, or active substitution.
- **Open boundary:** OQLF calls dried Poblano piment ancho/ancho pepper, and a Canadian seller lists whole dried Ancho while a Canadian foodservice sheet lists ground Ancho powder. Keep ancho/ancho pepper out of the fresh Poblano reference and form for now. The evidence does not settle whether whole dried Ancho belongs as a Poblano form or as a distinct market identity; retain that structural question for a separate review.
- **Scope:** this review resolves the open fresh Poblano item in the Section L pepper checklist. It does not claim that all products called Poblano are fresh, assign a species or cultivar, or resolve other named chiles.

## Checklist, requirements, and history

The active Section L checklist still names Poblano among bell peppers and fresh chiles at [the plan’s pepper item](../../RecipeBook-global-ingredient-catalog-plan.txt#L4471). The parent Section L produce list remains open. The recent R131–R135 reviews addressed kabocha, Delicata, Chinese, Thai, and Indian eggplant; none resolves this pepper item. Requirements §2.2 and FR-7 call for bilingual searchable ingredient references and aliases, with forms separated from identity data ([Requirements.md](../../../Requirements.md#L375)).

The earlier [WP06 Mexico and Central America gap sweep](wp06-mexico-central-america-gap-sweep-20261009.md) kept the Poblano/Ancho relationship unresolved: available sources then supported a named fresh/dried relationship but did not choose a general reference-versus-form model or safe crosswalk. This review adds current bilingual Québec-market Poblano evidence and current Canadian whole and ground Ancho product evidence. It advances only the supported fresh product and leaves that earlier structural uncertainty explicit.

## Current catalog, picker, ledger, and corpus audit

Read-only snapshot on 2026-10-15:

- **Active catalog:** 1,488 ingredient references and 109 forms.
- **Research ledger:** 1,833 records, 7,655 source entries, and 6,511 distinct source IDs.
- **Legacy import identities:** 61 candidates.
- **Bundled corpus:** 114 manifest-listed recipes and 1,123 ingredient rows.

There is no active Poblano reference or form, no exact Poblano legacy candidate, and no Poblano ledger record. The proposed reference ID, fresh-form ID, R136 source-ID prefix, and ledger record ID are unused. Existing references for jalapeño, serrano, rocoto, and the source-qualified ají identities remain separate; this review adds no generic pepper or chile aliases. Existing ledger mentions of Ancho in other sauce or culinary contexts do not identify a Poblano or Ancho catalog row.

Every recipe JSON named by the live package manifest was scanned across all string fields and all ingredient rows for Poblano and Ancho spellings, including poblano, poblanos, poblano pepper, chile poblano, piment poblano, ancho, ancho pepper, chile ancho, piment ancho, and piments anchos. The result was **zero hits across 114 recipes / 1,123 ingredient rows**. No bundled demand or recipe line supports a recipe link, substitution, or portion mapping.

The picker review mirrors [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it folds case and accents, prefers whole-word phrase matches, falls back to substring matches, and returns a form hint only when the query exactly matches a form search term. It does not singularize. The proposed aliases are deliberately narrower than every term returned by OQLF:

- Canonical names use OQLF’s preferred French piment poblano and English poblano pepper, both supported by a current Québec retail listing.
- Add French poblanos, the OQLF-listed plural noun, and English poblano peppers, which appears in a current Canadian bulk-retail title.
- Do **not** add piments poblanos. In this picker, that alias would make the bare query piments return only Poblano; the live catalog currently returns no result for that bare plural. The singular canonical piment poblano remains searchable, as does the qualified noun poblanos.
- Do not alias ancho, ancho pepper, piment ancho, piments anchos, or dried poblano to the fresh Poblano row. Those terms name a dried product in the OQLF entry, and the product-model relationship remains unresolved.
- Do not add Mayrand’s piment fort poblano as an alias. It is one retailer’s title and would add the listing to the bare piment fort search. OQLF describes Poblano as low in capsaicin; the retailer adjective is not adopted as a heat classification.
- Do not add Walmart’s Poivre Poblano wording. It conflicts with OQLF’s piment and Metro Québec’s product title; the item was not directly retrievable.
- Do not alias generic pepper, piment, poivron, or chile terms.

Static projection using the live names/forms and proposed reference/form terms:

| Query | Current results | With proposal |
|---|---:|---:|
| poblano pepper / piment poblano | 0 | 1 — Poblano |
| poblano | 0 | 1 — Poblano |
| poblanos | 0 | 1 — Poblano |
| poblano peppers | 0 | 1 — Poblano |
| fresh poblano pepper / piment poblano frais | 0 | 1 — Poblano with the fresh-form hint |
| piments poblanos / piments | 0 / 0 | 0 / 0 — the compound plural alias is intentionally omitted |
| generic pepper / piment | 21 / 16 | 22 / 17 — both remain multi-result |
| peppers | 1 | 2 — remains multi-result |
| poivron | 1 | 1 — unchanged; no false Poblano match |
| piment fort | 2 | 2 — unchanged |
| ancho | 2 — anchovy and anchovy paste substring matches | 2 — unchanged |
| ancho pepper / piment ancho / dried poblano pepper | 0 / 0 / 0 | 0 / 0 / 0 |

The projection is a static reproduction of the current matching rules, not an app or UI test.

## Product identity and form boundary

Use **piment poblano / poblano pepper** as the reference names. OQLF supplies the Québec terminology, and Metro’s current French and English pages use the exact bilingual product names for the same item number, 059559000245, in the fresh-produce category. Aliments du Québec separately lists a Québec-grown Piment Poblano product. These sources support a useful current-market identity. They do not establish a species or cultivar for every item sold under the name.

Add only the explicit fresh form, **piment poblano frais / fresh poblano pepper**, because the current Québec/Canadian retailer listings describe a fresh produce item. Do not infer a dried form from the fact that OQLF uses piment ancho for dried Poblano. OQLF establishes a terminology relationship; the current Canadian sellers identify whole dried Ancho and ground Ancho powder as commercial products. These sources do not decide whether whole dried Ancho is best represented as a same-ingredient form or as a separate named identity. The powder is explicitly ground and remains distinct from the whole dried listing. No conversion, yield, form-to-form substitution, or recipe-line link is proposed.

The product wording from Mayrand, piment fort poblano, is recorded as source-specific naming evidence but not as a French alias. The Walmart French search result uses Poivre Poblano; the reviewed OQLF and Metro Québec sources instead support piment poblano. Neither alternative title is needed for the canonical picker result.

## Numeric, substitution, and recipe-demand audit

- **Metro / Food Basics:** French and English listings share product number 059559000245 and display 226 g for an item. Treat these bilingual banner pages as one product listing, not two independent samples. The pages do not state a weighing method or a sampled average.
- **Mayrand:** its separate product 04705 says one unit is approximately 0.45 kg. This is a second retailer’s approximate item quantity, not a measurement sample or an average to pool with Metro’s listing.
- **Québec producer package:** Aliments du Québec lists a 300 g package; that is package mass, not mass per pepper. The Esslinger 120 g whole-Ancho pack and the Club House 6 × 500 g ground-Ancho case are package sizes for different dried products, not fresh-Poblano weights.
- Keep the Metro/Food Basics 226 g and Mayrand approximately 450 g as separate ledger estimates only. Do not average or reconcile them. Add no reusable count weight, portion, density, edible yield, unit mapping, conversion, or package yield.
- No reviewed source provides a Poblano replacement or exchange ratio. Record substitution research as complete with no supported general substitute. The Poblano/ancho relation is a processing/product boundary question, not substitution evidence.
- The bundled corpus has no matching Poblano or Ancho line. Add no recipe link, recipe-line substitution, form assignment, or recipe-specific quantity.

## Evidence register

Sources were reviewed on 2026-10-15. Retail listings, prices, and availability can change. Direct-retrieval and indexing limitations are recorded; no current price or stock claim is used as identity evidence.

| ID | Source | Evidence and limitation |
|---|---|---|
| **WP03-L-POBLANO-20261015-R136-S01** | Office québécois de la langue française, [piment poblano (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26559648/piment-poblano) | Directly opened; last updated in 2022. Gives French piment poblano / poblano, the English equivalents poblano pepper / poblano, and the plural forms poblanos / piments poblanos. It says the pepper has low capsaicin and that dried Poblano is known as piment ancho / ancho pepper. Use as Québec terminology and boundary evidence; it does not decide the catalog’s whole-dried-Ancho identity-versus-form structure. |
| **WP03-L-POBLANO-20261015-R136-S02** | Aliments du Québec, [Piment Poblano](https://alimentsduquebec.com/aliments-dici/fruits-et-legumes/piment-poblano) | Current indexed French-facing producer page names a fresh-produce Piment Poblano from Collectif Giroflée / Ferme Giroflée and lists a 300 g package and Québec retail channels. Direct opening returned a cache miss. Package size is not one pepper’s weight. |
| **WP03-L-POBLANO-20261015-R136-S03** | Aliments du Québec, [English product mirror](https://alimentsduquebec.com/en/certified-products/fruits-and-vegetables/piment-poblano) | Current indexed English-language mirror shows the same producer/product and fresh-fruit-and-vegetable category; the product title remains Piment Poblano. Direct opening returned a cache miss. This is the same producer product as S02, not independent naming or weight evidence for a second item. |
| **WP03-L-POBLANO-20261015-R136-S04** | Bannières de proximité / Metro Québec, [Piment poblano, product 059559000245](https://www.bannieresdeproximite.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/poivrons-zucchini-et-aubergines/piment-poblano/p/059559000245) | Current indexed French product title is Piment poblano and the page displays 226 g, about $4.99 each. Direct opening returned a cache miss. The displayed item quantity is listing-specific; the page does not state that it is a sample average or reusable count weight. |
| **WP03-L-POBLANO-20261015-R136-S05** | Food Basics, [Poblano Pepper, product 059559000245](https://www.foodbasics.ca/aisles/fruits-vegetables/vegetables/peppers-zucchini-eggplant/poblano-pepper/p/059559000245) | Current indexed English counterpart uses Poblano Pepper and displays the same 226 g and product number. Direct opening returned HTTP 403. It is the English banner listing for the same product as S04, not an independent weight observation. |
| **WP03-L-POBLANO-20261015-R136-S06** | Mayrand, [Piment fort poblano, product 04705](https://mayrand.ca/fr/nos-produits/fruits-et-legumes/legumes/piment/piment-fort-poblano-04705) | Directly opened. Product text says one unit is approximately 0.45 kg and gives a per-kilogram price. Listed branches showed “Bientôt disponible” at review time. This is a retailer-specific approximate unit quantity; method and sample are unstated. The “fort” wording is not promoted to a picker alias or heat classification. |
| **WP03-L-POBLANO-20261015-R136-S07** | Esslinger Foods Canada, [Ancho Chillies — Whole](https://esslingerfoods.com/products/ancho) | Directly opened. A 120 g whole-Ancho pack page describes Ancho as dried Poblano. This supports the whole-dried product boundary, not a fresh-item measure, recipe substitution, or global catalog crosswalk. Pack size is not pepper weight. |
| **WP03-L-POBLANO-20261015-R136-S08** | Club House for Chefs / McCormick Canada, [Ground Ancho Chili Pepper product sheet](https://www.clubhouseforchefs.ca/-/media/clubhouse-for-chef/sales-support/english/19-341_mccormick_groundanchochilipepper_ss-en-july0919.pdf) | Directly opened PDF. The sheet identifies Ancho as dried Poblano and the product as ground chili pepper, code 901569925, in 6 × 500 g cases. It supports keeping powder separate from a whole dried product; case size is not a measure of fresh Poblano. |
| **WP03-L-POBLANO-20261015-R136-S09** | Costco Business Centre, [Poblano Peppers, 5 kg](https://www.costcobusinesscentre.ca/p/-/poblano-peppers-5-kg/2001216391) | Search-indexed within the month before review. The title supports the English plural alias. The 5 kg package has no per-pepper quantity and is not used as a measure. |
| **WP03-L-POBLANO-20261015-R136-S10** | Walmart Canada, [Poivre Poblano](https://www.walmart.ca/fr/ip/poivre-poblano/6000200609736) | Search result titles a French page Poivre Poblano and shows individual sale with a broad 0.20–0.60 kg range; it was out of stock for the indexed default location. Direct opening redirected to identity verification. This wording conflicts with OQLF and Metro Québec’s piment poblano; it is not adopted as an alias or numeric observation. |

## Exact proposed JSON delta

The delta adds one reference, one fresh form, and one ledger record. It adds no other forms, aliases, active rules, or recipe changes. Database JSON strings below use explicit Unicode escapes for French accents, per AGENTS.md.

    {
      "ingredientReference": {
        "id": "ingredient-ref-poblano-pepper",
        "nameFr": "piment poblano",
        "nameEn": "poblano pepper",
        "aliasesFr": ["poblanos"],
        "aliasesEn": ["poblano peppers"],
        "defaultDensity": null,
        "unitMappings": [],
        "updatedAt": "2026-10-15T00:00:00Z",
        "category": "VEGETABLE_AND_AROMATIC"
      },
      "ingredientForm": {
        "id": "ingredient-form-poblano-pepper-fresh",
        "ingredientRefId": "ingredient-ref-poblano-pepper",
        "formCode": "fresh",
        "labelFr": "piment poblano frais",
        "labelEn": "fresh poblano pepper",
        "prepState": "fresh",
        "matchTermsFr": [],
        "matchTermsEn": [],
        "densityGPerMl": null,
        "notesFr": "La présentation fraîche est appuyée par les fiches de produits frais. Aucune mesure ni relation avec le piment ancho n’est ajoutée.",
        "notesEn": "The fresh presentation is supported by fresh-produce listings. No measure or relationship to ancho is added.",
        "updatedAt": "2026-10-15T00:00:00Z"
      },
      "ledgerRecord": {
        "recordId": "ingredient-ref-poblano-pepper",
        "recordType": "ingredient_reference",
        "identityState": "verified",
        "measurementState": "researched_supported",
        "substitutionResearchState": "researched_no_supported_substitute",
        "sources": [
          {
            "sourceId": "WP03-L-POBLANO-20261015-R136-S01",
            "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26559648/piment-poblano",
            "title": "Office québécois de la langue française, piment poblano (GDT)",
            "versionOrDate": "Last updated 2022; rechecked 2026-10-15",
            "accessedOn": "2026-10-15",
            "locator": "Preferred and plural terms; English equivalents; definition and dried-Poblano note.",
            "supports": "Supports piment poblano / poblano pepper as the bilingual term, the plural noun poblanos, and the terminology piment ancho / ancho pepper for dried Poblano. It does not decide whether whole dried Ancho is a catalog form or separate identity.",
            "sourceKind": "regional_authority"
          },
          {
            "sourceId": "WP03-L-POBLANO-20261015-R136-S02",
            "url": "https://alimentsduquebec.com/aliments-dici/fruits-et-legumes/piment-poblano",
            "title": "Aliments du Québec, Piment Poblano",
            "versionOrDate": "Current indexed producer listing; direct opening returned cache miss",
            "accessedOn": "2026-10-15",
            "locator": "Product title, producer, fresh-produce category, retail channels, and package size.",
            "supports": "Current French-facing producer listing identifies a fresh Piment Poblano product from Collectif Giroflée / Ferme Giroflée. Its 300 g package is not a per-pepper measure.",
            "sourceKind": "other"
          },
          {
            "sourceId": "WP03-L-POBLANO-20261015-R136-S03",
            "url": "https://alimentsduquebec.com/en/certified-products/fruits-and-vegetables/piment-poblano",
            "title": "Aliments du Québec, English product mirror",
            "versionOrDate": "Current indexed mirror; direct opening returned cache miss",
            "accessedOn": "2026-10-15",
            "locator": "English-facing product category, producer, and product title.",
            "supports": "The indexed English mirror gives the same product and producer under fresh fruits and vegetables but keeps the title Piment Poblano. This is the same product as S02.",
            "sourceKind": "other"
          },
          {
            "sourceId": "WP03-L-POBLANO-20261015-R136-S04",
            "url": "https://www.bannieresdeproximite.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/poivrons-zucchini-et-aubergines/piment-poblano/p/059559000245",
            "title": "Bannières de proximité / Metro Québec, Piment poblano, product 059559000245",
            "versionOrDate": "Current indexed listing; direct opening returned cache miss",
            "accessedOn": "2026-10-15",
            "locator": "French title, product number, fresh-produce listing, and displayed item quantity.",
            "supports": "The French listing uses Piment poblano for product 059559000245 and displays 226 g. It does not state a sample average or weighing method.",
            "sourceKind": "other"
          },
          {
            "sourceId": "WP03-L-POBLANO-20261015-R136-S05",
            "url": "https://www.foodbasics.ca/aisles/fruits-vegetables/vegetables/peppers-zucchini-eggplant/poblano-pepper/p/059559000245",
            "title": "Food Basics, Poblano Pepper, product 059559000245",
            "versionOrDate": "Current indexed English counterpart; direct opening returned HTTP 403",
            "accessedOn": "2026-10-15",
            "locator": "English title, product number, fresh-produce listing, and displayed item quantity.",
            "supports": "The English counterpart uses Poblano Pepper and displays the same 226 g and product number as S04. It is not an independent weight observation.",
            "sourceKind": "other"
          },
          {
            "sourceId": "WP03-L-POBLANO-20261015-R136-S06",
            "url": "https://mayrand.ca/fr/nos-produits/fruits-et-legumes/legumes/piment/piment-fort-poblano-04705",
            "title": "Mayrand, Piment fort poblano, product 04705",
            "accessedOn": "2026-10-15",
            "locator": "Product title and unit text “unité (env. 0.45 kg)”; location availability.",
            "supports": "The separate retailer listing describes one unit as approximately 0.45 kg. The method is unstated and the title is not adopted as a picker alias.",
            "sourceKind": "other"
          },
          {
            "sourceId": "WP03-L-POBLANO-20261015-R136-S07",
            "url": "https://esslingerfoods.com/products/ancho",
            "title": "Esslinger Foods Canada, Ancho Chillies - Whole",
            "accessedOn": "2026-10-15",
            "locator": "Whole dried Ancho product description and 120 g package.",
            "supports": "A Canadian seller describes whole dried Ancho as dried Poblano. This supports a product relationship but does not choose same-reference form versus separate identity; the pack size is not pepper weight.",
            "sourceKind": "other"
          },
          {
            "sourceId": "WP03-L-POBLANO-20261015-R136-S08",
            "url": "https://www.clubhouseforchefs.ca/-/media/clubhouse-for-chef/sales-support/english/19-341_mccormick_groundanchochilipepper_ss-en-july0919.pdf",
            "title": "Club House for Chefs / McCormick Canada, Ground Ancho Chili Pepper product sheet",
            "versionOrDate": "July 2019",
            "accessedOn": "2026-10-15",
            "locator": "Product definition, code 901569925, and 6 × 500 g case size.",
            "supports": "Identifies Ancho as dried Poblano and this product as ground chili pepper. Keep it separate from the whole dried Ancho product; case size is not a pepper measure.",
            "sourceKind": "manufacturer"
          },
          {
            "sourceId": "WP03-L-POBLANO-20261015-R136-S09",
            "url": "https://www.costcobusinesscentre.ca/p/-/poblano-peppers-5-kg/2001216391",
            "title": "Costco Business Centre, Poblano Peppers, 5 kg",
            "versionOrDate": "Search indexed within the month before review",
            "accessedOn": "2026-10-15",
            "locator": "English bulk-retail product title.",
            "supports": "Supports the English plural wording Poblano Peppers. The bulk package has no per-pepper quantity and supplies no count measure.",
            "sourceKind": "other"
          },
          {
            "sourceId": "WP03-L-POBLANO-20261015-R136-S10",
            "url": "https://www.walmart.ca/fr/ip/poivre-poblano/6000200609736",
            "title": "Walmart Canada, Poivre Poblano",
            "versionOrDate": "Search result reviewed 2026-10-15; direct page redirected to identity verification",
            "accessedOn": "2026-10-15",
            "locator": "French product title, individually sold wording, and 0.20–0.60 kg range in indexed result.",
            "supports": "The indexed French title uses Poivre Poblano but is not adopted because OQLF and Metro Québec use piment poblano; the direct product page was inaccessible and the broad range is not used as a measurement.",
            "sourceKind": "other"
          }
        ],
        "measurementObservations": [
          {
            "observationId": "poblano-metro-product-059559000245-displayed-item-quantity-20261015",
            "relationship": "count_weight",
            "ingredientFormId": "ingredient-form-poblano-pepper-fresh",
            "value": 226,
            "valueUnit": "g",
            "foodDescription": "Fresh whole Poblano listed as Metro product 059559000245.",
            "foodState": "Fresh produce item as listed; the page does not report an individual sample or weighing method.",
            "measurementMethod": "Retailer-displayed 226 g item quantity; average status and method are not stated.",
            "quantityBasis": "One item in the Metro/Food Basics listing only. The French and English pages share product number 059559000245 and are one product observation, not independent samples. Do not use as a general count conversion, density, portion, or unit mapping.",
            "sourceQuantity": {
              "amount": 1,
              "unit": "item"
            },
            "evidenceKind": "estimate",
            "sourceIds": [
              "WP03-L-POBLANO-20261015-R136-S04",
              "WP03-L-POBLANO-20261015-R136-S05"
            ]
          },
          {
            "observationId": "poblano-mayrand-product-04705-approximate-unit-quantity-20261015",
            "relationship": "count_weight",
            "ingredientFormId": "ingredient-form-poblano-pepper-fresh",
            "value": 450,
            "valueUnit": "g",
            "foodDescription": "Fresh whole Poblano sold as Mayrand product 04705.",
            "foodState": "Fresh produce item as listed; Mayrand labels one unit approximately 0.45 kg.",
            "measurementMethod": "Retailer-displayed approximate unit quantity; sample and method are not stated.",
            "quantityBasis": "One Mayrand item-specific approximate quantity only. Keep separate from the Metro/Food Basics 226 g listing; do not pool, average, or use as a general count conversion, density, portion, or unit mapping.",
            "sourceQuantity": {
              "amount": 1,
              "unit": "item"
            },
            "evidenceKind": "estimate",
            "sourceIds": [
              "WP03-L-POBLANO-20261015-R136-S06"
            ]
          }
        ],
        "substitutionFindings": [
          {
            "findingId": "poblano-pepper-general-substitution-review-20261015",
            "researchState": "researched_no_supported_substitute",
            "fromIngredientRefId": "ingredient-ref-poblano-pepper",
            "context": "General substitution review for fresh whole Poblano pepper.",
            "basis": "The reviewed terminology and product sources establish a fresh Poblano name and a separate dried/ground Ancho product boundary; they provide no replacement instruction or exchange ratio. The bundled corpus contains no matching Poblano or Ancho ingredient line.",
            "limitations": [
              "Do not treat the dried-Poblano/Ancho naming relation as a substitution.",
              "No active global or contextual substitution rule is proposed."
            ],
            "sourceIds": [
              "WP03-L-POBLANO-20261015-R136-S01",
              "WP03-L-POBLANO-20261015-R136-S02",
              "WP03-L-POBLANO-20261015-R136-S04",
              "WP03-L-POBLANO-20261015-R136-S06",
              "WP03-L-POBLANO-20261015-R136-S07",
              "WP03-L-POBLANO-20261015-R136-S08"
            ]
          }
        ],
        "decisions": [
          {
            "outcome": "accepted",
            "reason": "Add Poblano pepper / piment poblano as a current fresh-market produce identity. Keep aliases to the OQLF-supported noun poblanos and the Canadian product title Poblano Peppers. Do not infer a species or cultivar.",
            "sourceIds": [
              "WP03-L-POBLANO-20261015-R136-S01",
              "WP03-L-POBLANO-20261015-R136-S02",
              "WP03-L-POBLANO-20261015-R136-S03",
              "WP03-L-POBLANO-20261015-R136-S04",
              "WP03-L-POBLANO-20261015-R136-S05",
              "WP03-L-POBLANO-20261015-R136-S09"
            ]
          },
          {
            "outcome": "accepted",
            "reason": "Add a fresh form for the current fresh-produce listings. Do not add a dried or powdered Ancho form, unit mapping, density, or conversion in this proposal.",
            "sourceIds": [
              "WP03-L-POBLANO-20261015-R136-S02",
              "WP03-L-POBLANO-20261015-R136-S04",
              "WP03-L-POBLANO-20261015-R136-S05",
              "WP03-L-POBLANO-20261015-R136-S06"
            ]
          },
          {
            "outcome": "accepted",
            "reason": "Record Metro/Food Basics product 059559000245 at displayed 226 g and Mayrand product 04705 at approximately 450 g as separate retailer-specific estimates. Do not pool or promote either to a reusable measure.",
            "sourceIds": [
              "WP03-L-POBLANO-20261015-R136-S04",
              "WP03-L-POBLANO-20261015-R136-S05",
              "WP03-L-POBLANO-20261015-R136-S06"
            ]
          },
          {
            "outcome": "unresolved",
            "reason": "OQLF calls dried Poblano piment ancho/ancho pepper and Canadian listings distinguish whole dried Ancho from ground Ancho powder, but the evidence does not settle whether whole dried Ancho belongs as a Poblano form or a separate identity. Do not attach ancho names to the fresh reference or form pending a separate product-boundary review.",
            "sourceIds": [
              "WP03-L-POBLANO-20261015-R136-S01",
              "WP03-L-POBLANO-20261015-R136-S07",
              "WP03-L-POBLANO-20261015-R136-S08"
            ]
          },
          {
            "outcome": "accepted",
            "reason": "No reviewed source supports a general Poblano substitute or an exchange ratio. Keep substitution research complete with no supported substitute and add no active rule.",
            "sourceIds": [
              "WP03-L-POBLANO-20261015-R136-S01",
              "WP03-L-POBLANO-20261015-R136-S02",
              "WP03-L-POBLANO-20261015-R136-S04",
              "WP03-L-POBLANO-20261015-R136-S06",
              "WP03-L-POBLANO-20261015-R136-S07",
              "WP03-L-POBLANO-20261015-R136-S08"
            ]
          }
        ]
      }
    }

## Review checks and limitations

The proposal is proposal-only and changes no shared catalog, ledger, checklist, roadmap, or generated file. Static checks confirmed that the JSON delta parses, the appended ledger record passes the research-ledger schema, all ten new source IDs are unique and absent from the live ledger, both proposed catalog IDs are unused, local Markdown links resolve, and the file has no trailing whitespace or encoding markers. The static picker projection confirms singleton qualified names and unchanged plural and broad-query boundaries. Per AGENTS.md, database-JSON-only integration needs no app, Gradle, unit, instrumentation, emulator, or deployment tests; none were run for this proposal.

