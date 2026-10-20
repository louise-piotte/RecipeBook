# WP04 Section P R495 — canned Québec redfish product-group review (2026-10-17)

- **Review and source-access date:** 2026-10-17.
- **Candidate:** Canned Québec redfish / sébaste du Québec en conserve, covering the current Chasse-Marée sea-bacon, spicy-oil, and dill-and-mustard products.
- **Recommendation:** Add one identity-only PROTEIN reference, ingredient-ref-canned-quebec-redfish, with the exact display names and product-title aliases below. Keep the raw Québec redfish group and species-scoped references separate. Add no form, density, mapping, reusable quantity, package yield, recipe link, conversion, or substitution.
- **Proposal-only status:** This file is the only proposed change. No shared JSON, generated output, roadmap, plan, workflow, recipe, or other proposal was edited. No software tests were run.
- **Current live snapshot:** 1,772 ingredient references, 143 forms, 56 legacy candidates, and 2,130 ledger records / 9,745 source entries / 8,254 distinct source IDs / 6,967 distinct source URLs. The manifest has 114 recipes and 1,123 ingredient rows.
- **New proposal-local source IDs:** WP04-SECTIONP-CANNED-QUEBEC-REDFISH-R495-20261017-S01 through S05, plus audit label R01. Reuse existing IDs for URLs already registered, especially WP04-P-QUEBEC-REDFISH-GROUP-20261012-S01, S02, S05, and S07.

## Why this is a distinct open gap

The open [Section P seafood checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6199) includes remaining fish products, and its preserved-fish checklist remains open for smoked, salted, dried, canned, oil-packed, water-packed, and fermented items ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L7323)).

The active ingredient-ref-quebec-redfish row covers the regional Québec Sebastes market group, displayed as Québec redfish / sébaste du Québec. Its 2026-10-12 review cited Chasse-Marée's Sébaste à l’aneth et moutarde as one 175 g seasoned canned product and explicitly kept that SKU as product evidence, not a universal canned form or a generic fish conversion. The proposal and [integration README](../batches/wp04-section-p-quebec-redfish-identity-integration-20261012/README.md) remain correct on that boundary.

R495 revisits the product question with current listings for three separately named canned products from the same Québec maker: Sébaste au bacon de mer (Dulse), Sébaste à l’huile piquante, and Sébaste à l’aneth et moutarde. The Montréal retailer Racines boréales lists paired English product names for the same producer’s products. This recurring, regionally scoped product family supports considering a dedicated canned-product identity. It does not support attaching a canned form to every raw redfish reference, making a generic preserved-fish row, or treating the products as unseasoned fish.

The previous review's single-product caution is therefore retained: R495 proposes a narrow finished-product identity, not a form or conversion. Product-specific flavors remain exact search aliases only. Stock and backorder status are transient and are not used as evidence of broad availability or recipe demand.

## Proposed reference

| Field | Proposed value |
|---|---|
| ID | ingredient-ref-canned-quebec-redfish |
| Category | PROTEIN |
| English display | canned Québec redfish |
| French display | sébaste du Québec en conserve |
| English aliases | canned redfish; Redfish with sea bacon (dulse); Redfish in spicy oil; Redfish with dill and mustard |
| French aliases | sébaste en conserve; Sébaste au bacon de mer (Dulse); Sébaste à l’huile piquante; Sébaste à l’aneth et moutarde |
| Default density | null |
| Unit mappings | none |

The display pairs OQLF's Québec French sébaste and English redfish with the locally documented product state conserve / canned and the Québec market scope. The display is a catalog localization, not a claim that the producer prints this exact paired heading on every package. The generic canned aliases preserve direct product-state searches, while the variant aliases use current product names attested by the producer or retailer. Do not add bare aliases redfish, sébaste, Atlantic redfish, ocean perch, rosefish, poisson rouge, or perche de mer.

The row is scoped in its ledger evidence to this Québec canned-market product group. It does not assert one Sebastes species, all canned fish called redfish, or a general canned form for fresh or frozen fish.

## Ownership, archive, and source-ID audit

| Surface | Current live owner or evidence | R495 disposition |
|---|---|---|
| Regional raw fish group | ingredient-ref-quebec-redfish owns Québec redfish / sébaste du Québec, with no aliases or forms. Its identity ledger record is verified and already owns the Québec market-group evidence. | Keep raw market-group identity unchanged. The proposed row represents the locally sold canned finished product. |
| Species-scoped redfish | ingredient-ref-acadian-redfish owns Acadian redfish / sébaste acadien; ingredient-ref-beaked-redfish owns Beaked redfish / sébaste atlantique. Other Sebastes identities and holds have their own boundaries. | Do not merge the product into a species row or infer a species from seller wording such as Atlantic redfish. |
| Existing canned seafood | Active references include canned salmon, canned trout, canned mackerel, canned sardines, canned tuna, and canned cod liver. | Keep each as a distinct named product group; add no generic canned-fish alias or form. Cod liver is an organ product and is not a fish-flesh match. |
| Forms and numeric data | No active form label or match term owns a canned-redfish or canned-sébaste phrase. No form is attached to ingredient-ref-quebec-redfish. No proposed ID has an active density, mapping, package yield, or conversion. | Add no canned form, measurement observation, unit mapping, package yield, or numeric conversion. |
| Legacy identities | Exact normalized checks across all 56 legacy candidates found no proposed ID or exact canned-redfish / canned-sébaste product phrase. | Add no legacy mapping. |
| Research ledger | The active ingredient-ref-quebec-redfish record owns the regional group evidence and the earlier Chasse-Marée dill-and-mustard page. No ledger record ID owns ingredient-ref-canned-quebec-redfish or any exact canned product title. | Add a new identity-reference record only if accepted. Reuse the existing source ID for the already-owned dill-and-mustard URL. |
| Prior proposal and integration archive | The [Québec redfish market-group review](wp04-section-p-quebec-redfish-market-group-review-20261012.md) and integration README discuss the dill-and-mustard can as one composite product, not a global form. No focused canned-Québec-redfish identity review or integration was found. R489 canned cod liver and R492 smoked Arctic char address different products. | Treat R495 as a narrow product-group reassessment, not a revision to the raw Québec redfish identity or a duplicate of canned cod liver. |
| Proposed ID and source prefix | Exact checks of references, forms, legacy candidates, ledger IDs/source IDs, proposal archive, and batch archive found no ingredient-ref-canned-quebec-redfish, no R495 proposal, and no source IDs with the proposed R495 prefix. | Keep the proposed ID and S01-S05 local until root review. |
| Source URLs | The five new product URLs below have no exact URL owner in the live ledger. The OQLF, MAPAQ, CFIA, and dill-and-mustard producer URLs are already owned by existing sources. English and French marketplace pages are different URLs, so their source records are not duplicates. | Register only the five new URLs under S01-S05. Reuse the exact existing source IDs for every already-owned URL; do not mint a second ID for an existing URL. |

### Exact source IDs and URL ownership

| Source ID | Source and exact URL | Use and limits |
|---|---|---|
| WP04-SECTIONP-CANNED-QUEBEC-REDFISH-R495-20261017-S01 | Chasse-Marée, [Sébaste au bacon de mer (Dulse)](https://chassemaree.ca/products/sebaste-au-bacon-de-mer-dulse) | Producer page calls this a conserve, says it is prepared and canned by hand, lists a 175 g format and ingredients, and identifies it as a St. Lawrence product made in Rimouski. The package amount and dulse formula are SKU-specific. |
| WP04-SECTIONP-CANNED-QUEBEC-REDFISH-R495-20261017-S02 | Chasse-Marée, [Sébaste à l’huile piquante (12 unités)](https://chassemaree.ca/products/sebaste-a-lhuile-piquante-12-unites) | Current producer listing names a spicy-oil canned sébaste product and provides its product-specific per-unit/package details and ingredient list. The 12-unit case is not a recipe measure or reusable package yield. |
| WP04-SECTIONP-CANNED-QUEBEC-REDFISH-R495-20261017-S03 | Racines boréales, [Redfish with sea bacon (dulse)](https://racinesboreales.ca/en/products/redfish-with-sea-bacon-dulse) | Montréal retailer's English product title for Chasse-Marée's same product as S01; gives its English wording and product-specific description. This paired page is not an independent fish or recipe observation. |
| WP04-SECTIONP-CANNED-QUEBEC-REDFISH-R495-20261017-S04 | Racines boréales, [Redfish in spicy oil](https://racinesboreales.ca/en/products/redfish-in-spicy-oil) | Montréal retailer's English product title for the spicy-oil product; its description identifies the same Québec-made product family and item-specific ingredients. Do not treat the retail description Atlantic redfish as a species identification. |
| WP04-SECTIONP-CANNED-QUEBEC-REDFISH-R495-20261017-S05 | Racines boréales, [Redfish with dill and mustard](https://racinesboreales.ca/en/products/redfish-with-dill-and-mustard) | Montréal retailer's English title for the product whose French producer page is already registered as the reused S07 below. Same SKU family; not independent species evidence. |
| Reuse WP04-P-QUEBEC-REDFISH-GROUP-20261012-S07 | Chasse-Marée, [Sébaste à l’aneth et moutarde](https://chassemaree.ca/products/sebaste-a-laneth-et-moutarde) | Existing exact URL owner in the ingredient-ref-quebec-redfish record. The page names a 175 g manually canned seasoned product and its ingredients. Reuse this ID; it does not support a universal canned form. |
| Reuse WP04-P-QUEBEC-REDFISH-GROUP-20261012-S01 | OQLF, [sébaste (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198848/sebaste) | Existing exact URL owner. Supports the preferred Québec edible-fish name sébaste, English redfish, the Sebastes sp. scope, and the fact that Québec catches include multiple Sebastes species. It does not identify any canned SKU. |
| Reuse WP04-P-QUEBEC-REDFISH-GROUP-20261012-S02 | MAPAQ, [Poissons et fruits de mer du Québec à l’international (2026 brochure PDF)](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/BR_brochure-poissons-fruits-mer-qc-int_MAPAQ.pdf) | Existing exact URL owner. Supports a current Québec sébaste fishery group, not a particular species or kitchen quantity. |
| Reuse WP04-P-QUEBEC-REDFISH-GROUP-20261012-S05 | CFIA, [Fish List redfish query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Redfish) | Existing exact URL owner. The query spans multiple species/taxa with different French names; it supports preserving ambiguity and not assigning the product to one species. |

The five proposed S01-S05 IDs are unallocated in the live ledger and archive. The reuse IDs retain their existing owner and URL. Recheck product URLs and package details at integration time; prices, inventory, and backorder state are not stable evidence.

## Phrase-first picker projection

Projection uses the current accent-folding, punctuation normalization, complete-word phrase-first matching, and substring fallback in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The hypothetical row uses only the bilingual display values and exact product-title aliases above.

| Query | Current result | With proposed row |
|---|---|---|
| canned redfish; sébaste en conserve | None | ingredient-ref-canned-quebec-redfish only, through the generic canned aliases |
| Redfish with sea bacon; sébaste au bacon de mer | None | Proposed row only, through the exact product-title aliases |
| Redfish in spicy oil; sébaste à l’huile piquante | None | Proposed row only |
| Redfish with dill and mustard; sébaste à l’aneth et moutarde | None | Proposed row only |
| Québec redfish; sébaste du Québec | ingredient-ref-quebec-redfish | ingredient-ref-quebec-redfish plus ingredient-ref-canned-quebec-redfish, through its qualified display |
| redfish; sébaste | Three results: Acadian redfish, Beaked redfish, and Québec redfish | Those same three plus canned Québec redfish; both broad queries remain multi-result |
| Atlantic redfish | None | None; do not add this phrase as an alias |
| canned salmon | ingredient-ref-canned-salmon | Unchanged |

Exact canned-product searches would become available while broad redfish and sébaste searches remain visibly multi-result. The shortened Québec group queries return both raw and canned market choices under distinct displays. No alias would assign a species, trigger a smoked/salted/canned form, or merge the prepared product into its raw parent.

## Full bundled-recipe demand scan

The manifest-ordered scan parsed all **114 recipe files**, all **1,123 ingredients[] rows**, and every string in every recipe JSON object. Normalized English and French phrase checks included canned redfish, canned Québec redfish, sébaste en conserve, sébaste du Québec en conserve, all six proposed product-title aliases, redfish, sébaste / sebaste, Québec redfish, sébaste du Québec, Atlantic redfish, Sebastes, ocean perch, and the nearby Acadian/beaked redfish names.

There were **zero matching recipe files and zero matching ingredient rows**. The files total 753,988 bytes; the manifest-order digest, computed from each manifest-relative path, a NUL separator, exact file bytes, and a trailing NUL separator, is 847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e. The bundle supplies no linked recipe, preparation state, recipe amount, or substitution context for the proposed group.

## Evidence states, product boundaries, and proposed ledger entry

- **Identity:** Product pages from the Québec maker and Montréal retailer document three names for a canned redfish market group, with French and English wording. OQLF supports the local sébaste/redfish market-name pair. This verifies a bounded identity but does not assign an individual species.
- **Species:** OQLF describes Québec sébaste as Sebastes sp. and names multiple species in local catches. The CFIA redfish list spans multiple taxa. Keep the product species-neutral; do not project the seller's English Atlantic redfish wording onto ingredient-ref-beaked-redfish or ingredient-ref-acadian-redfish.
- **Product boundary:** Keep the canned product separate from raw/frozen Québec redfish, species-specific redfish, canned salmon, canned trout, canned sardines, canned mackerel, canned tuna, canned cod liver, and generic canned fish. The three aliases describe seasoned products with different added ingredients; they are not universal product states.
- **Forms and conversions:** Add no form to ingredient-ref-quebec-redfish and no canned form globally. The product itself is a prepared-food identity. Add no density, unit mapping, conversion, edible yield, cooking yield, or package yield.
- **Measurements:** The producer and retailer pages report 175 g product formats and one page describes a 12-unit case. These are package specifications for particular SKUs, not a recipe amount, serving measure, drained mass, count conversion, or general yield. Set measurementState to researched_no_supported_value and do not add a measurement observation.
- **Substitutions:** No recipe-context or tested replacement evidence was reviewed for canned redfish versus raw/frozen redfish, other canned fish, or the oil/seasoning preparations. Set substitutionResearchState to not_yet_researched; add no substitution finding or rule.

If root accepts the identity, add one ingredient-reference ledger record. The existing sources below are reused at their current IDs; the new product-page IDs S01-S05 are registered only for their own URLs.

~~~json
{
  "recordId": "ingredient-ref-canned-quebec-redfish",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP04-SECTIONP-CANNED-QUEBEC-REDFISH-R495-20261017-S01",
      "url": "https://chassemaree.ca/products/sebaste-au-bacon-de-mer-dulse",
      "title": "Chasse-Marée, Sébaste au bacon de mer (Dulse)",
      "accessedOn": "2026-10-17",
      "locator": "Current product page; product title, description, preparation as a conserve, package format, and ingredient list.",
      "supports": "Names a canned sébaste product with dulse, sunflower oil, salt, and spices; says it is made in Rimouski from a St. Lawrence River product. The formula and 175 g package are product-specific and do not identify the fish to species.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP04-SECTIONP-CANNED-QUEBEC-REDFISH-R495-20261017-S02",
      "url": "https://chassemaree.ca/products/sebaste-a-lhuile-piquante-12-unites",
      "title": "Chasse-Marée, Sébaste à l’huile piquante (12 unités)",
      "accessedOn": "2026-10-17",
      "locator": "Current producer listing; product title, per-unit format, and ingredient list.",
      "supports": "Names a spicy-oil canned sébaste product. The per-unit and case quantities apply only to this SKU; the page does not establish a recipe amount, edible yield, or species identity.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP04-SECTIONP-CANNED-QUEBEC-REDFISH-R495-20261017-S03",
      "url": "https://racinesboreales.ca/en/products/redfish-with-sea-bacon-dulse",
      "title": "Racines boréales, Redfish with sea bacon (dulse)",
      "accessedOn": "2026-10-17",
      "locator": "Current Montréal retailer product page; English name and product-specific description.",
      "supports": "Pairs the English product title with the same Québec-made Chasse-Marée dulse product documented by S01. The page's Atlantic redfish wording is not used as a species assignment.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-CANNED-QUEBEC-REDFISH-R495-20261017-S04",
      "url": "https://racinesboreales.ca/en/products/redfish-in-spicy-oil",
      "title": "Racines boréales, Redfish in spicy oil",
      "accessedOn": "2026-10-17",
      "locator": "Current Montréal retailer product page; English name and product-specific description.",
      "supports": "Pairs the English product title with the Québec spicy-oil product. Product-specific ingredients and amount do not generalize; the seller's Atlantic redfish wording does not resolve species.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-CANNED-QUEBEC-REDFISH-R495-20261017-S05",
      "url": "https://racinesboreales.ca/en/products/redfish-with-dill-and-mustard",
      "title": "Racines boréales, Redfish with dill and mustard",
      "accessedOn": "2026-10-17",
      "locator": "Current Montréal retailer product page; English name and paired Québec-made product description.",
      "supports": "Provides the English title for the product whose French producer URL is already registered under the reused S07 source ID. This is not independent evidence for a fish taxon or recipe quantity.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-P-QUEBEC-REDFISH-GROUP-20261012-S07",
      "url": "https://chassemaree.ca/products/sebaste-a-laneth-et-moutarde",
      "title": "Chasse-Marée, Sébaste à l’aneth et moutarde",
      "accessedOn": "2026-10-12",
      "locator": "Prepared Québec product name, ingredients, and package size.",
      "supports": "Lists one 175 g seasoned canned sébaste product with sunflower oil, salt, dill, mustard seed, and spices. This is composite-product evidence only; no universal canned form or cooking measure is inferred.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-P-QUEBEC-REDFISH-GROUP-20261012-S01",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198848/sebaste",
      "title": "Office québécois de la langue française, sébaste (GDT)",
      "accessedOn": "2026-10-12",
      "locator": "Zoology/ichthyology and edible-fish domains; preferred Québec term, market scope, catch note, and English terms.",
      "supports": "Normalizes sébaste for Québec fish marketing, pairs it with English redfish and Sebastes sp., and reports that Québec catches include S. marinus, S. fasciatus, and S. mentella. The entry's composition is a 2012 snapshot and does not identify a particular retail product.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-P-QUEBEC-REDFISH-GROUP-20261012-S02",
      "url": "https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/BR_brochure-poissons-fruits-mer-qc-int_MAPAQ.pdf",
      "title": "MAPAQ, Poissons et fruits de mer du Québec à l’international (2026 brochure)",
      "accessedOn": "2026-10-12",
      "locator": "Sébaste page and 2025 preliminary Québec landings summary, data consulted January 2026.",
      "supports": "Uses SÉBASTE for a Québec fishery group and describes Gulf of St. Lawrence origin; it does not identify the species in any canned retail product or supply kitchen quantities.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-P-QUEBEC-REDFISH-GROUP-20261012-S05",
      "url": "https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Redfish",
      "title": "Canadian Food Inspection Agency, Fish List redfish query",
      "accessedOn": "2026-10-12",
      "locator": "Search results for English common name redfish across listed taxa.",
      "supports": "The result set assigns Redfish to multiple Sebastes taxa and additional taxa with species-specific French names. Do not use individual entries to assign a species to the proposed product.",
      "sourceKind": "regional_authority"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only canned Québec redfish / sébaste du Québec en conserve for the recurring Québec canned-product group shown by the three distinct Chasse-Marée variants and paired English product titles. Keep its scope species-neutral and product-specific. Do not add a canned form to raw Québec redfish or any other reference; do not add measurements, forms, conversions, yields, recipe links, or substitutions.",
      "sourceIds": [
        "WP04-SECTIONP-CANNED-QUEBEC-REDFISH-R495-20261017-S01",
        "WP04-SECTIONP-CANNED-QUEBEC-REDFISH-R495-20261017-S02",
        "WP04-SECTIONP-CANNED-QUEBEC-REDFISH-R495-20261017-S03",
        "WP04-SECTIONP-CANNED-QUEBEC-REDFISH-R495-20261017-S04",
        "WP04-SECTIONP-CANNED-QUEBEC-REDFISH-R495-20261017-S05",
        "WP04-P-QUEBEC-REDFISH-GROUP-20261012-S07",
        "WP04-P-QUEBEC-REDFISH-GROUP-20261012-S01",
        "WP04-P-QUEBEC-REDFISH-GROUP-20261012-S02",
        "WP04-P-QUEBEC-REDFISH-GROUP-20261012-S05"
      ]
    }
  ]
}
~~~

## Root-review recommendation

Recommend advancing an identity-only canned Québec redfish / sébaste du Québec en conserve reference using the proposed EN/FR product-title aliases. The current catalog can then distinguish an exact canned product search from the raw Québec redfish group, while broad redfish / sébaste queries continue to show multiple named choices. Preserve the exact product variants as aliases, keep the row species-neutral, and retain the prior decision that a product-state row is not a reusable canned form. The recipe corpus supplies no demand or recipe amount, so leave links and all numeric and substitution behavior empty.

