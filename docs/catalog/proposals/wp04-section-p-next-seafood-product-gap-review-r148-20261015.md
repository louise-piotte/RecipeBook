# WP04 Section P — shrimp balls product-identity review (R148)

- **Reviewed / sources accessed:** 2026-10-15.
- **Recommendation:** Add identity-only `shrimp balls / boulettes de crevettes` as `ingredient-ref-shrimp-balls`, category `PROTEIN`, with singular source-attested aliases `shrimp ball` and `boulette de crevettes`.
- **Scope:** The formed seafood product named as a shrimp ball in current Canadian and Québec retail listings. This is a product identity, not a form of whole shrimp or generic fish balls. A current Canadian product declaration contains both minced fish and shrimp; do not imply a universal recipe or shrimp-only composition.
- **Proposal-only status:** No catalog JSON, ledger, forms, recipes, plan, roadmap, generated code, or tests were changed. No tests were run.
- **New source IDs:** `WP04-SECTIONP-NEXT-SEAFOOD-R148-20261015-S01` through `S05`. The source prefix, proposed reference ID, and proposed form-ID namespace were searched across the shared ledger, active reference/form data, legacy identities, and proposal/batch archive; no collision was found. No form ID is proposed.

## Open checklist and prior-work boundary

The open Section P parent at the [fish powder, fish balls, and surimi checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5721) still says its named seafood work remains open. The broader current-state pointer also remains open at [the Section P continuation](../../RecipeBook-global-ingredient-catalog-plan.txt#L11974). This packet resolves only the distinct shrimp-ball product-name gap and leaves both checklist lines open.

The active catalog already has identity-only `fish balls / boulettes de poisson`; its earlier reviews explicitly exclude shrimp balls from the generic fish-ball aliases and say shrimp balls remain a separate product boundary. Those exclusions mention no dedicated identity decision, aliases, picker projection, current paired Québec product, or recipe-corpus scan for shrimp balls. The 2026-10-12 fried-fish-ball hold also names shrimp balls as a separate product, but does not review or allocate them. R147 fish tofu and R75 dried-bonito powder cover other products and remain unchanged. This proposal does not reopen generic fish balls, fish tofu, surimi, Bonga powder, generic fish powder, the anchovy-powder hold, or the fried-fish-ball and surimi-shreds holds. See the [fish-ball/surimi boundary review](wp04-fish-balls-surimi-product-boundary-review-20261011.md), the [fried-fish-ball product-state review](wp04-section-p-fried-fish-balls-product-state-review-20261012.md), and the [R147 fish-tofu review](wp04-section-p-fish-tofu-product-identity-review-r147-20261015.md).

## Identity decision and product boundary

Current Food Basics and Metro storefront pages pair **Frozen Shrimp Ball** and **Boulette de crevettes surgelée** under the same product number, `821964020299`. The English listing gives a 180 g package; Metro’s French listing gives the matching product name and amount. These are the same retailer-group SKU, so they support a bilingual product-name pair, not two independent formulations [S03–S04]. Metro’s direct page could not be parsed by the web reader during this review; the indexed product page exposed its title, package amount, product number, and cart control. The Food Basics page opened directly and reported that the item was unavailable at its selected store. These pages do not establish stock at every location or provide the paired SKU’s ingredient declaration.

A separate current Watson product page calls its item **Frozen Shrimp Ball** and lists minced golden threadfin bream (*Nemipterus virgatus*), shrimp, water, starch, egg white, and other ingredients. Its French-language view uses shrimp-ball wording, while Walmart warns that product details are supplied by manufacturers/suppliers and are not independently verified. This source shows why the identity must not imply a shrimp-only recipe or a species-independent formulation; it is one product example [S05]. CFIA’s bilingual processed-fish survey separately lists `Fried shrimp balls` / `Boulettes de crevettes frites` and `Shrimp flavoured ball` / `Boulettes à saveur de crevette`. The survey supports keeping shrimp-containing product wording apart from a shrimp-flavoured name, but is a 2015–2016 allergen survey, not a current product standard or composition source [S01–S02].

Add the narrow bilingual product identity with no claim that all shrimp-ball products share a recipe, contain a fixed proportion of shrimp, or are made from the same fish substrate. Do not alias this row to `shrimp`, `prawn`, `fish balls`, `fish tofu`, `surimi`, fish cake, seafood balls, shrimp-flavoured balls, shrimp dumplings, squid balls, crab balls, or a species. The retailer’s package sizes and the Watson ingredient declaration remain SKU-specific.

## Active ownership, IDs, and current picker projection

The live package checked for this proposal contains **1,508 ingredient references**, **119 forms**, and **114 manifest-listed recipes**. Exact-key, phrase, and archive checks covered the proposed English and French names and singular forms across active bilingual reference names/aliases, form labels/match terms, legacy-import identities, ledger record IDs, and the Section P proposal/batch archive. No current record owns `shrimp ball`, `shrimp balls`, `boulette de crevettes`, or `boulettes de crevettes`. No `ingredient-ref-shrimp-balls`, `ingredient-form-shrimp-balls-*`, or `candidate-shrimp-balls` ID is allocated. Incidental mentions in fish-ball boundary text do not assign a shrimp-ball record.

The picker follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it returns complete normalized word-phrase matches first and falls back to partial matching only when there are no phrase matches. The projection below replays that behavior over active reference and form terms, then adds the proposed row.

| Query | Current result | With proposed row | Boundary |
|---|---|---|---|
| `shrimp ball`, `shrimp balls` | None | `ingredient-ref-shrimp-balls` only | Exact product-name queries become selectable. |
| `boulette de crevettes`, `boulettes de crevettes` | None | `ingredient-ref-shrimp-balls` only | Retail-attested French singular/plural phrases select the product. |
| `shrimp` | Dried shrimp; Northern shrimp; saeu-jeot | Same three plus shrimp balls (4) | Broad English shrimp search expands by one clearly named prepared product. |
| `crevette` | Dried shrimp; Northern shrimp | Unchanged | Singular French base term is not added as an alias. |
| `crevettes` | Bagoong alamang; belacan; dried shrimp; Kapi; Northern shrimp; saeu-jeot; terasi (7) | Same seven plus shrimp balls (8) | Plural French query shows the qualified product with existing seafood/condiment rows. |
| `fish ball`, `fish balls`, `boulette de poisson`, `boulettes de poisson` | Fish balls only | Fish balls only | The existing generic fish-ball identity remains separate. |
| `fish` | Bonga powder; fish balls; fish sauce; fish stock; fish tofu (5) | Same five | The proposed name introduces no fish alias. |
| `surimi` | None | None | No paste or surimi relationship is introduced. |
| `shrimp flavoured ball`, `boulette à saveur de crevette` | None | None | CFIA’s distinct flavor-only wording remains unassigned. |
| `ball` | Fish balls; tapioca pearls (2) | Same two plus shrimp balls (3) | The intentionally broad one-word query displays multiple qualified results. |

## Bundled recipe demand

The current [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) lists **114 recipe files and 1,123 ingredient rows**. All manifest-listed recipe JSON documents and ingredient rows were searched for `shrimp ball(s)`, `boulette(s) de crevette(s)`, `shrimp-flavoured ball`, and relevant shrimp-ball wording. The scan found **zero recipe-text matches and zero ingredient-row matches**. No recipe link, relink, recipe-specific product state, amount, or substitution is proposed.

## Forms, measurements, and substitutions

- **Forms:** Add no form. A Québec storefront labels its one SKU frozen, CFIA’s survey names a fried-shrimp-ball sample, and the Watson product page describes a frozen product. This evidence does not define one reusable `frozen`, `fried`, `cooked`, stuffed, or ready-to-eat form for the named product class. Keep those states source-specific and leave all form IDs absent.
- **Measurements:** Set `defaultDensity` to `null` and `unitMappings` to `[]`. The 180 g Food Basics/Metro package and 227 g (8 oz) Walmart package are net package sizes for different SKUs. The Watson page gives no count-to-mass observation or recipe portion. Add no kitchen measure, density, conversion, measurement observation, package yield, cooking yield, or edible yield.
- **Substitutions:** Set ledger substitution research to `researched_no_supported_substitute`. No bundled recipe or reviewed product source establishes a tested ratio or equivalent cooking result between shrimp balls and whole shrimp, fish balls, fish tofu, fish cakes, surimi paste/products, crab meat, or other seafood balls. Add no global or contextual rule, warning, or recipe-line substitute.

## Exact proposed reference delta

```json
{
  "id": "ingredient-ref-shrimp-balls",
  "nameEn": "shrimp balls",
  "nameFr": "boulettes de crevettes",
  "aliasesEn": [
    "shrimp ball"
  ],
  "aliasesFr": [
    "boulette de crevettes"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "PROTEIN"
}
```

No ingredient-form record, recipe link, measurement observation, unit conversion, package-yield record, or substitution rule is proposed.

## Proposed ledger delta

The proposed active reference uses a matching `ingredient_reference` ledger record. The source texts below retain their per-listing limits; no package weight is converted into a shared measure.

```json
{
  "recordId": "ingredient-ref-shrimp-balls",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP04-SECTIONP-NEXT-SEAFOOD-R148-20261015-S01",
      "url": "https://inspection.canada.ca/en/food-safety-industry/food-chemistry-and-microbiology/food-safety-testing-reports-and-journal-articles/april-1-2015-march-31-2016",
      "title": "CFIA, Undeclared Allergens and Gluten in Processed Fish and Seafood — April 1, 2015 to March 31, 2016",
      "versionOrDate": "Survey period 2015-04-01 to 2016-03-31",
      "accessedOn": "2026-10-15",
      "locator": "Table 2, frozen or refrigerated fish/seafood sample descriptions: Fried shrimp balls; Shrimp flavoured ball.",
      "supports": "The federal survey distinguishes a Fried shrimp balls sample from a Shrimp flavoured ball sample. It supports keeping shrimp-containing wording separate from flavor-only wording; it gives no recipe/formula for either sample and is not a product standard.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-NEXT-SEAFOOD-R148-20261015-S02",
      "url": "https://inspection.canada.ca/fr/salubrite-alimentaire-lindustrie/chimie-microbiologie-alimentaires/rapports-danalyse-articles-revues-sa/1-avril-2015-au-31-mars-2016",
      "title": "ACIA, Présence non déclarée d’allergènes et de gluten dans le poisson et les fruits de mer transformés — 1 avril 2015 au 31 mars 2016",
      "versionOrDate": "Période de l’étude : 2015-04-01 au 2016-03-31",
      "accessedOn": "2026-10-15",
      "locator": "Tableau 2, échantillons de poisson/fruits de mer congelés ou réfrigérés : Boulettes de crevettes frites; Boulettes à saveur de crevette.",
      "supports": "Le rapport français distingue Boulettes de crevettes frites de Boulettes à saveur de crevette, parallèlement aux descriptions anglaises du rapport fédéral. Ce sont des descriptions d’échantillons de surveillance, sans recette ni formule universelle.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-NEXT-SEAFOOD-R148-20261015-S03",
      "url": "https://www.foodbasics.ca/aisles/fish-seafood/frozen-fish-seafood/packages-bulk/frozen-shrimp-ball/p/821964020299",
      "title": "Food Basics, Frozen Shrimp Ball, product 821964020299",
      "accessedOn": "2026-10-15",
      "locator": "Current online product page, product title, number, and 180 g package listing.",
      "supports": "Canadian retailer lists the English product name Frozen Shrimp Ball and item 821964020299 as a 180 g packaged product. Availability is store-specific; the page reported the item unavailable at the selected store during direct access. It gives no ingredient declaration.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-NEXT-SEAFOOD-R148-20261015-S04",
      "url": "https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/boulette-de-crevette-surgelee/p/821964020299",
      "title": "Metro Québec, Boulette de crevettes surgelée, product 821964020299",
      "accessedOn": "2026-10-15",
      "locator": "Indexed online product listing, title, item number, and 180 g package amount.",
      "supports": "Québec retailer listing supplies the French product wording Boulette de crevettes surgelée and the same 821964020299 product number and 180 g package as Food Basics. Direct-page retrieval failed to parse in the web reader; the indexed listing was accessible. No product composition was visible.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-NEXT-SEAFOOD-R148-20261015-S05",
      "url": "https://www.walmart.ca/fr/ip/Watson-Frozen-Shrimp-Ball-Petit-sac/6000198611087",
      "title": "Walmart Canada, Watson Frozen Shrimp Ball — Small Bag",
      "accessedOn": "2026-10-15",
      "locator": "French-language product page: item title, product details, ingredients, selected online availability, and retailer information disclaimer.",
      "supports": "The retailer page names a Watson frozen shrimp-ball item and lists minced golden threadfin bream (Nemipterus virgatus), shrimp, water, starch, egg white, and other ingredients. This is one product-specific formula, not a definition of every shrimp ball. Walmart says product information is supplier-provided and not independently verified; the page’s selected-store availability is in Ontario, not proof of Québec stock.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only shrimp balls / boulettes de crevettes as the source-backed formed seafood product name, with only the singular English and French retail variants shrimp ball and boulette de crevettes. Keep it separate from generic fish balls, shrimp, shrimp-flavoured balls, fish tofu, fish cakes, surimi products, and species identities. The current product sources do not establish a universal formulation or reusable state, and the bundled corpus has no matching demand; add no forms, measurements, conversions, yields, recipe links, or substitutions.",
      "sourceIds": [
        "WP04-SECTIONP-NEXT-SEAFOOD-R148-20261015-S01",
        "WP04-SECTIONP-NEXT-SEAFOOD-R148-20261015-S02",
        "WP04-SECTIONP-NEXT-SEAFOOD-R148-20261015-S03",
        "WP04-SECTIONP-NEXT-SEAFOOD-R148-20261015-S04",
        "WP04-SECTIONP-NEXT-SEAFOOD-R148-20261015-S05"
      ]
    }
  ]
}
```

## Full source register

All five new IDs belong only to this proposal. The two CFIA pages are the bilingual versions of one survey and are listed separately to preserve their direct English/French wording. Retailer product data remains SKU-specific.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-NEXT-SEAFOOD-R148-20261015-S01** | CFIA, [Undeclared Allergens and Gluten in Processed Fish and Seafood](https://inspection.canada.ca/en/food-safety-industry/food-chemistry-and-microbiology/food-safety-testing-reports-and-journal-articles/april-1-2015-march-31-2016). | Table 2 includes `Fried shrimp balls` and `Shrimp flavoured ball` among frozen/refrigerated fish and seafood samples. Survey period is 2015–2016. It distinguishes wording but does not define the products’ formulations or current retail availability. |
| **WP04-SECTIONP-NEXT-SEAFOOD-R148-20261015-S02** | CFIA, [Présence non déclarée d’allergènes et de gluten dans le poisson et les fruits de mer transformés](https://inspection.canada.ca/fr/salubrite-alimentaire-lindustrie/chimie-microbiologie-alimentaires/rapports-danalyse-articles-revues-sa/1-avril-2015-au-31-mars-2016). | The paired French Table 2 lists `Boulettes de crevettes frites` and separately `Boulettes à saveur de crevette`. It is an allergen-surveillance table, not a product naming standard. |
| **WP04-SECTIONP-NEXT-SEAFOOD-R148-20261015-S03** | Food Basics, [Frozen Shrimp Ball](https://www.foodbasics.ca/aisles/fish-seafood/frozen-fish-seafood/packages-bulk/frozen-shrimp-ball/p/821964020299), product 821964020299. | Canadian English storefront lists a 180 g frozen product. The page opened directly but reported the item unavailable at its selected store; this does not establish broad stock or a product composition. |
| **WP04-SECTIONP-NEXT-SEAFOOD-R148-20261015-S04** | Metro Québec, [Boulette de crevettes surgelée](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/boulette-de-crevette-surgelee/p/821964020299), product 821964020299. | Indexed current Québec retailer content pairs the French title with the same number and 180 g package as Food Basics. Direct-page retrieval failed to parse; no composition was accessible. This is same-SKU bilingual retailer evidence, not independent formula corroboration. |
| **WP04-SECTIONP-NEXT-SEAFOOD-R148-20261015-S05** | Walmart Canada, [Watson Frozen Shrimp Ball — Small Bag](https://www.walmart.ca/fr/ip/Watson-Frozen-Shrimp-Ball-Petit-sac/6000198611087). | The French-language product page gives product details and lists minced golden threadfin bream (*Nemipterus virgatus*), shrimp, water, starch, egg white, and other ingredients. It also states that suppliers provide product information and Walmart does not separately verify it. This is a distinct SKU and one formula; selected availability is Ontario, not a Québec stock claim. |

## Proposal conclusion

Recommend adding `ingredient-ref-shrimp-balls` as an identity-only `PROTEIN` reference with the exact source-attested bilingual name and singular aliases above. Do not add a form or numeric/substitution behavior. The rest of the Section P fish-powder, fish-ball, surimi, and regional-seafood checklist remains open. This file is the only proposed artifact; no shared catalog, ledger, plan, roadmap, recipe, or app data was changed.
