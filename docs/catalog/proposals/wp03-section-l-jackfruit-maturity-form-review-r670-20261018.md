# WP03 Section L — jackfruit maturity and product-form review (R670, 2026-10-18)

- **Status:** Accepted and integrated. The form and its ledger record are in the bundled database JSON; the checklist, roadmap, workflow, and integration README record the decision.
- **Scope:** The open Section L jackfruit maturity/product-definition item, specifically the source-named young jackfruit packed in brine.
- **Decision:** Keep the single generic jackfruit identity and add one product-specific form, **young jackfruit in brine / jeune fruit du jacquier en saumure**, under that identity. Accept its documented picker effect: bare French `jacquier` now returns the jackfruit parent with no form hint because that word appears inside the attested product label. OQLF distinguishes the tree name, but no tree identity exists in the ingredient picker. Do not add green/unripe/young as generic maturity aliases or create a second identity. The broad fresh green/unripe maturity boundary remains open.

## Integrated project state and open work

The active reference remains **ingredient-ref-jackfruit**, displayed as **jackfruit / jaque**, with only **jakfruit / jacque** spelling aliases, category **FRUIT**, null density, and no unit mappings. It now has one attached form, **ingredient-form-jackfruit-young-in-brine**. The generic reference ledger owner remains identity verified, with measurement state **researched_no_supported_value** and substitution state **researched_no_supported_substitute**. A separate form ledger record owns the R670 source-specific evidence. Existing source ID **WP03-JACKFRUIT-MATURITY-QC-20261011-S02** is reused on that form record; it supports the preferred fruit terms *jaque* and *jacque* and does not name processed forms.

The catalog plan contains a still-open source-qualified jackfruit maturity/product review at docs/RecipeBook-global-ingredient-catalog-plan.txt near line 12700. An earlier broad review and its integration on 2026-10-11 retained the identity and held all forms because there was no local recipe demand or exact product definition. That prior evidence remains correct for an unqualified fresh-stage form. The newer bilingual manufacturer and Québec retailer records below establish one exact preserved product, so this proposal narrows the candidate to that commercial product alone. The current roadmap and catalog workflow show Section L still active: R667 integrated a fresh tomato form and R669 integrated a whole smoked-and-dried chipotle form, with both records stating that Section L remains open. This R670 review does not change those records or the open checkpoint.

Repository references: [prior WP03 jackfruit review](wp03-jackfruit-maturity-product-quebec-review-20261011.md), [research ledger](../research-ledger.v1.json), [live ingredient reference catalog](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [live form catalog](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [catalog workflow](../ingredient-catalog-workflow.md), [roadmap](../../../roadmap.md), and [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt).

## Bilingual naming and identity/form boundary

| Source wording or request | Recommendation | Boundary |
|---|---|---|
| Unqualified jackfruit / jaque | Keep the existing identity and its spelling aliases unchanged. | Do not assign ripeness or a processing state to the generic fruit. |
| Young jackfruit in brine / jeune fruit du jacquier en saumure | Added one canned-with-liquid form under ingredient-ref-jackfruit, using the exact bilingual manufacturer/Québec product wording as the form labels. | This names the manufacturer’s young fruit product in a brine medium. It does not define every young, tender, green, or unripe jackfruit, nor fresh-market green jackfruit. |
| Green jackfruit / fruit du jacquier vert; unripe jackfruit / jaque non mûr | Keep these source-qualified and unresolved as general maturity terms. Add no alias or form match term. | Current sources use maturity words differently and establish no shared measurable threshold. A retailer’s “green” label cannot be generalized to the separately marketed “young” product. |
| Ripe jackfruit in pineapple juice / fruit du jacquier mûr au jus d’ananas | Keep outside this proposed form. | The same manufacturer sells this as another canned product with a different maturity description and medium. It is a separate future product-form question, not an alias or substitute for the brined young product. |
| Jackfruit seeds, flour, pulp, or other processed products | Keep outside this form. | Edible parts and prepared products need their own source-qualified scope. |

The fruit remains the same *Artocarpus heterophyllus* identity across maturity states; maturity and processing do not justify a second botanical identity. OQLF’s generic fruit entry prefers *jaque* and *jacque* and separately defines *jaquier/jacquier* as the tree. The exact current Québec retail/manufacturer wording uses the descriptive phrase “fruit du jacquier.” Its consequence for the bare query “jacquier” is shown below; it is not proposed as a new base alias.

## Integrated form

The following single-row addition is integrated. Empty match-term arrays keep synonyms such as green, unripe, young alone, and generic French tree wording out of the explicit alias lists; the labels themselves remain searchable.

    {
      "id": "ingredient-form-jackfruit-young-in-brine",
      "ingredientRefId": "ingredient-ref-jackfruit",
      "formCode": "canned_with_liquid",
      "labelFr": "jeune fruit du jacquier en saumure",
      "labelEn": "young jackfruit in brine",
      "prepState": "with_liquid",
      "matchTermsFr": [],
      "matchTermsEn": [],
      "densityGPerMl": null,
      "notesFr": "Produit de jeune fruit vendu en bo\u00eete et en saumure. Les sources indiquent un format de 400 mL, pas une masse \u00e9goutt\u00e9e. Aucune densit\u00e9, mesure, conversion ou relation de rendement n\u2019est \u00e9tablie. Ne pas g\u00e9n\u00e9raliser les \u00e9tapes de rin\u00e7age, d\u2019\u00e9gouttage et de cuisson d\u2019une recette externe.",
      "notesEn": "Source-named canned young fruit in brine. The cited package is 400 mL; no drained mass, density, measure, conversion, or yield relationship is established. Do not generalize the rinsing, draining, and cooking steps from an external recipe.",
      "updatedAt": "2026-10-18T00:00:00Z"
    }

The schema-compatible form code **canned_with_liquid** and prep state **with_liquid** already occur in the live catalog. This row belongs only to **ingredient-ref-jackfruit**. Do not create a new identity, add “organic,” brand, UPC, size, or package terms, or attach a recipe line.

## Integrated form-specific research-ledger record

One record keyed to the form ID follows the existing ledger convention. Its form-level measurement and substitution states are researched with no supported generic value/rule. The decision is accepted for the narrowly named product form, while the wider green/unripe boundary remains unresolved on the existing jackfruit identity record. The source objects below reuse the R670 source IDs and URLs from the source register; they do not allocate a second set of IDs. The existing OQLF source ID and URL are reused as well.

    {
      "recordId": "ingredient-form-jackfruit-young-in-brine",
      "recordType": "ingredient_form",
      "identityState": "verified",
      "measurementState": "researched_no_supported_value",
      "substitutionResearchState": "researched_no_supported_substitute",
      "sources": [
        {
          "sourceId": "WP03-JACKFRUIT-MATURITY-QC-20261011-S02",
          "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297111/jaque",
          "title": "OQLF, jaque (GDT)",
          "accessedOn": "2026-10-11",
          "locator": "Preferred fruit terms, English equivalents, and Latin name; updated 1990",
          "supports": "Lists jaque/jacque as preferred fruit terms, jackfruit/jakfruit/jack in English, and A. heterophyllus. It does not name maturity or processed-product forms.",
          "sourceKind": "regional_authority"
        },
        {
          "sourceId": "WP03-SECTION-L-JACKFRUIT-20261018-R670-S01",
          "url": "https://chasorganics.com/products/young-jackfruit",
          "title": "Cha's Organics, Young Jackfruit In Brine",
          "accessedOn": "2026-10-18",
          "locator": "Product title and 400 mL variant (page lines 35-55), ingredients (61-63), and canning note (66)",
          "supports": "The manufacturer names young jackfruit in brine, lists young fruit, water, salt, and coconut vinegar, and describes canning. The 400 mL figure is package volume, not drained mass; no density, measure, or yield is provided.",
          "sourceKind": "manufacturer"
        },
        {
          "sourceId": "WP03-SECTION-L-JACKFRUIT-20261018-R670-S02",
          "url": "https://chasorganics.com/fr/products/young-jackfruit",
          "title": "Cha's Organics, Jeune Fruit du Jacquier en Saumure",
          "accessedOn": "2026-10-18",
          "locator": "Exact French product title (page line 35), 400 mL can and case options (55-59)",
          "supports": "The manufacturer supplies the exact French commercial phrase and can packaging for the source-named young product. It does not define a general green/unripe stage or a drained quantity.",
          "sourceKind": "manufacturer"
        },
        {
          "sourceId": "WP03-SECTION-L-JACKFRUIT-20261018-R670-S03",
          "url": "https://www.metro.ca/epicerie-en-ligne/allees/epicerie-biologique/garde-manger/noix-graines-et-fruits-seches-bio/jeune-fruit-du-jacquier-biologique-en-saumure/p/806253310206",
          "title": "Metro Qu\u00e9bec, Jeune fruit du jacquier biologique en saumure Cha's Organics",
          "accessedOn": "2026-10-18",
          "locator": "French indexed product title and ingredient list for product 806253310206; opened English mirror lines 321-331 and 378-409",
          "supports": "A current Qu\u00e9bec grocery listing uses the same young-fruit-in-brine phrase and matches the UPC. The English mirror lists a 400 mL package and young fruit, water, salt, and coconut vinegar; neither page gives drained mass.",
          "sourceKind": "other"
        },
        {
          "sourceId": "WP03-SECTION-L-JACKFRUIT-20261018-R670-S04",
          "url": "https://satau.ca/fr/nos-produits/chas-organics/",
          "title": "Satau, Cha's Organics catalogue",
          "accessedOn": "2026-10-18",
          "locator": "Lines 100-120: Jeune Jacquier en saumure bio, case of 12 x 400 mL, UPC 806253310206, code ARCJF001",
          "supports": "A current Qu\u00e9bec distributor lists the named brined young-jackfruit product and its case SKU. Case size and UPC remain product-specific, not general search terms or measures.",
          "sourceKind": "other"
        },
        {
          "sourceId": "WP03-SECTION-L-JACKFRUIT-20261018-R670-S05",
          "url": "https://chasorganics.com/fr/products/sweet-jackfruit",
          "title": "Cha's Organics, Fruit du Jacquier M\u00fbr",
          "accessedOn": "2026-10-18",
          "locator": "Product title and ingredients (page lines 35, 59-64)",
          "supports": "The same manufacturer lists a distinct ripe jackfruit product in pineapple juice. This keeps ripe fruit outside the proposed brined-young form; it does not support a ripe form in this review.",
          "sourceKind": "manufacturer"
        },
        {
          "sourceId": "WP03-SECTION-L-JACKFRUIT-20261018-R670-S06",
          "url": "https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0",
          "title": "CFIA, Canadian Food Compositional Standards",
          "accessedOn": "2026-10-18",
          "locator": "Volume 10, section 10.2.1, generic canned-fruit packaging in liquid; current page search for jackfruit returned no entry",
          "supports": "Regulatory boundary only: the generic standard discusses canned fruit packaged in liquid but does not define jackfruit, its maturity stages, or a jackfruit-specific brine name.",
          "sourceKind": "other"
        },
        {
          "sourceId": "WP03-SECTION-L-JACKFRUIT-20261018-R670-S07",
          "url": "https://chasorganics.com/pages/jackfruit-fish-fillet",
          "title": "Cha's Organics, Jackfruit Fish Fillet",
          "accessedOn": "2026-10-18",
          "locator": "Ingredient list line 85; rinse, drain, and cook directions lines 99-105",
          "supports": "An external manufacturer recipe uses one can of young jackfruit in brine and then rinses, drains, and cooks it. This is source-specific recipe handling, not bundled demand, drained mass, or a global substitution.",
          "sourceKind": "manufacturer"
        }
      ],
      "decisions": [
        {
          "outcome": "accepted",
          "reason": "Add one canned-with-liquid form for the explicitly named young jackfruit in brine product under ingredient-ref-jackfruit. Keep the state limited to this source-named product; do not collapse green, unripe, young, and tender into a generic stage or create another identity. The 400 mL listing is package volume only. No supported drained mass, density, household measure, conversion, yield, or global substitute was found, and the bundled corpus has no jackfruit line to link. Preserve the documented picker expansion for the bare French query jacquier as an explicit acceptance decision.",
          "sourceIds": [
            "WP03-JACKFRUIT-MATURITY-QC-20261011-S02",
            "WP03-SECTION-L-JACKFRUIT-20261018-R670-S01",
            "WP03-SECTION-L-JACKFRUIT-20261018-R670-S02",
            "WP03-SECTION-L-JACKFRUIT-20261018-R670-S03",
            "WP03-SECTION-L-JACKFRUIT-20261018-R670-S04",
            "WP03-SECTION-L-JACKFRUIT-20261018-R670-S05",
            "WP03-SECTION-L-JACKFRUIT-20261018-R670-S06",
            "WP03-SECTION-L-JACKFRUIT-20261018-R670-S07"
          ]
        }
      ]
    }

## Search projections and picker effects

Projection follows the current IngredientReferenceSearchIndex behavior: form labels join the parent’s search terms; exact full-form phrases return the parent identity with a form hint; partial phrases may return the parent without selecting the form. The table compares the current catalog with the integrated form. Counts are catalog rows/results, not new identities.

| Query | Current picker | With integrated form | Observed effect |
|---|---|---|---|
| jackfruit | 1: ingredient-ref-jackfruit | 1: ingredient-ref-jackfruit; no form hint | No change to generic English search. |
| jaque | 1: ingredient-ref-jackfruit | 1: ingredient-ref-jackfruit; no form hint | No change to preferred generic French search. |
| jacque | 1: ingredient-ref-jackfruit | 1: ingredient-ref-jackfruit; no form hint | Existing spelling alias remains unchanged. |
| young jackfruit | 0 | 1: ingredient-ref-jackfruit; no form hint | The partial product phrase finds the parent; it does not assert the brine form. |
| young jackfruit in brine | 0 | 1: ingredient-ref-jackfruit; hint ingredient-form-jackfruit-young-in-brine | Exact product phrase resolves the form. |
| jackfruit in brine | 0 | 1: ingredient-ref-jackfruit; no form hint | Partial phrase finds the parent only. |
| canned young jackfruit in brine | 0 | 0 | Extra unverified modifier is not treated as an alias. |
| jeune fruit du jacquier | 0 | 1: ingredient-ref-jackfruit; no form hint | Partial French phrase finds the parent only. |
| jeune fruit du jacquier en saumure | 0 | 1: ingredient-ref-jackfruit; hint ingredient-form-jackfruit-young-in-brine | Exact Québec product phrase resolves the form. |
| fruit du jacquier | 0 | 1: ingredient-ref-jackfruit; no form hint | Exact phrase within the attested label becomes searchable. |
| jacquier | 0 | 1: ingredient-ref-jackfruit; no form hint | **Known search expansion:** the word occurs inside the local product label, despite not being added as a base alias. |
| green jackfruit / green jackfruit in brine | 0 | 0 | Green remains outside this source-named young form. |
| unripe jackfruit | 0 | 0 | No generic maturity alias is added. |
| jaque vert / jaque non mûr | 0 | 0 | No French generic green/unripe term is added. |
| ripe jackfruit / fruit du jacquier mûr | 0 | 0 | The ripe product is not part of this proposal. |

The bare query **jacquier** is accepted as a known product-label search expansion. OQLF distinguishes *jacquier* as the tree name, but the ingredient picker contains no tree identity; the source-backed commercial phrase is the current Québec-facing product label. The parent jackfruit identity remains the only result and no form hint appears for this bare query. Do not add `jacquier` as a base alias or rewrite the product as an unattested phrase such as “jaque vert.”

## Recipe demand and recipe-line boundary

A manifest-ordered scan covered all **114 bundled recipe files and 1,123 ingredient rows**. It found no ingredient-line or recipe-text match for jackfruit, jack fruit, jakfruit, jaque, jacque, jacquier, fruit du jacquier, young jackfruit, green jackfruit, unripe jackfruit, jeune fruit du jacquier, jeune jacquier, jaque vert, jaque non mûr, or fruit du jacquier mûr. RecipeBook therefore has no internal jackfruit demand and receives no recipe reference, substitution link, or relink from this proposal.

The manufacturer’s separate English recipe page for “Jackfruit ‘Fish’ Fillet” asks for “1 can young jackfruit in brine,” then directs the cook to rinse and drain it and boil it before forming patties. This is source-specific external recipe use, not a RecipeBook line and not a generic package/yield rule. The recipe title and plant-based marketing do not support a global substitution from jackfruit to fish, pork, or poultry. No contextual substitution is proposed.

## Measurements and substitutions

- The manufacturer and Metro list **400 mL** as the package size; Satau lists cases of 12 × 400 mL and the matching UPC. These are product/package facts, not drained weight, edible mass, density, a generic can size, or a unit mapping.
- No verified jackfruit-specific household measure, mass-per-can, drained yield, density, or conversion was found. Preserve null density and add no unit mapping or conversion.
- The external recipe’s one-can amount and rinse/drain/cook directions remain local to that recipe. Do not infer a drained form link, yield, or generic preparation rule.
- Manufacturer marketing compares the texture with pulled meat and fish. That is promotional context; it does not establish a global ingredient-to-ingredient substitute. The existing ledger’s researched-no-supported-substitute state remains.

## Source and ID ownership

One form-specific ledger record keyed to **ingredient-form-jackfruit-young-in-brine** is integrated with record type **ingredient_form**. It owns R670 source IDs **WP03-SECTION-L-JACKFRUIT-20261018-R670-S01** through **S07**, reusing the same source objects and URLs listed below; no second R670 source set was allocated, and these sources were not duplicated under the unchanged generic reference record. The existing OQLF source ID **WP03-JACKFRUIT-MATURITY-QC-20261011-S02** and URL are reused. The seven R670 source IDs were unique before integration and are now each assigned once. No separate jackfruit-green identity, product identity, legacy candidate, or recipe-line record was added.

| Source ID | Source and locator | What it supports and does not support |
|---|---|---|
| Reused existing source ID WP03-JACKFRUIT-MATURITY-QC-20261011-S02 | [OQLF, jaque (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297111/jaque), existing ledger source accessed 2026-10-11; page lines 19, 28–32, 39–56. | Québec generic fruit name and English/Latin equivalents: preferred jaque/jacque, English jackfruit/jakfruit/jack, Latin Artocarpus heterophyllus. It is not a product or maturity term, and its short English jack remains excluded from aliases. |
| WP03-SECTION-L-JACKFRUIT-20261018-R670-S01 | [Cha’s Organics, Young Jackfruit In Brine](https://chasorganics.com/products/young-jackfruit), accessed 2026-10-18; product title and 400 mL variant (page lines 35–55), ingredients (61–63), canned-production note (66). | Manufacturer’s exact English name, product composition, package volume, and canning. “Backordered” is a displayed availability state only; it does not define the ingredient. The marketing language is not substitution evidence. |
| WP03-SECTION-L-JACKFRUIT-20261018-R670-S02 | [Cha’s Organics, Jeune Fruit du Jacquier en Saumure](https://chasorganics.com/fr/products/young-jackfruit), accessed 2026-10-18; exact French title (35), package status (55), case options and easy-open cans (59), cooking uses (61). | Manufacturer’s bilingual French product wording and can presentation. It does not establish an objective maturity threshold or mass/drained yield. |
| WP03-SECTION-L-JACKFRUIT-20261018-R670-S03 | [Metro Québec, Jeune fruit du jacquier biologique en saumure Cha’s Organics](https://www.metro.ca/epicerie-en-ligne/allees/epicerie-biologique/garde-manger/noix-graines-et-fruits-seches-bio/jeune-fruit-du-jacquier-biologique-en-saumure/p/806253310206), accessed 2026-10-18; French indexed title and ingredients, matched to product number 806253310206. The opened listing redirects to [Metro’s English product page](https://www.metro.ca/en/online-grocery/aisles/organic-groceries/pantry/organic-nuts-seeds-dried-fruits/organic-young-jackfruit-in-brine/p/806253310206), lines 321–331, 374, 378, 406–409. | Québec grocery product wording, matching SKU, 400 mL package, and ingredient statement (young fruit, water, salt, coconut vinegar). Its current out-of-stock status is not an availability guarantee. It gives no drained mass. |
| WP03-SECTION-L-JACKFRUIT-20261018-R670-S04 | [Satau, Cha’s Organics catalogue](https://satau.ca/fr/nos-produits/chas-organics/), accessed 2026-10-18; lines 100–120, “Jeune Jacquier en saumure bio12x400ml,” UPC 806253310206 and code ARCJF001. | Current Québec distributor’s French product name, case volume, and product ownership. UPC and case details remain source-specific and are not match terms. |
| WP03-SECTION-L-JACKFRUIT-20261018-R670-S05 | [Cha’s Organics, Fruit du Jacquier Mûr](https://chasorganics.com/fr/products/sweet-jackfruit), accessed 2026-10-18; title (35), ripe fruit in pineapple juice and package options (59–64). | Same manufacturer’s different ripe product and medium. Supports keeping it out of the young-in-brine form; no ripe form is proposed. |
| WP03-SECTION-L-JACKFRUIT-20261018-R670-S06 | [CFIA, Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), accessed 2026-10-18; Volume 10, section 10.2.1, generic canned fruit packaged in liquid. Search of the current standards page found no jackfruit entry. | Regulatory boundary only: the current generic standards discuss canned fruit and liquid packaging, but do not define jackfruit, its maturity stages, or a jackfruit brine name. Do not infer that this specific product has a jackfruit-specific standard from the generic section. |
| WP03-SECTION-L-JACKFRUIT-20261018-R670-S07 | [Cha’s Organics, Jackfruit “Fish” Fillet](https://chasorganics.com/pages/jackfruit-fish-fillet), accessed 2026-10-18; ingredient list line 85 and rinse/drain/cook directions lines 99–105. | External source recipe’s one-can input and later preparation. Not a bundled recipe, drained-mass measurement, or global substitution. |

## Static acceptance checks reviewed during integration

- Confirmed the existing ingredient-ref-jackfruit identity, displays, aliases, category, and generic ledger record remain unchanged; no second identity was added.
- Added one form record and one form-specific ledger record with the same form ID. Ledger validation confirms recordType ingredient_form, identityState verified, measurementState researched_no_supported_value, substitutionResearchState researched_no_supported_substitute, and one accepted decision.
- Confirmed canned_with_liquid and with_liquid are existing form values, the form ID has one owner in each intended catalog, and decision sourceIds resolve to source objects in the form record. R670 IDs S01–S07 and the existing OQLF ID/URL are reused without new duplicates or attachment to the generic reference record.
- Preserved null density, empty explicit match-term arrays, no unit mappings, no conversion/substitution rules, and no RecipeBook recipe link.
- Rechecked the exact picker projections above. The accepted `jacquier` result is documented; green/unripe/ripe queries remain empty and exact brine phrases provide the form hint.
- Reconfirmed the manifest recipe count and phrase/line scan. No recipe link was added, and the external Cha’s recipe was not treated as bundled demand.
- Preserved Unicode in the documentation and used explicit Unicode escapes in the bundled database JSON. No software tests were run because this integration only changed database JSON data, as allowed by AGENTS.md.
