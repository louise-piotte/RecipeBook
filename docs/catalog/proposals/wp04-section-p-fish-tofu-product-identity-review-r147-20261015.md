# WP04 Section P — fish tofu product-identity review (R147)

- **Reviewed / sources accessed:** 2026-10-15.
- **Recommendation:** Add identity-only `fish tofu / tofu au poisson` as `ingredient-ref-fish-tofu`, category `PROTEIN`, with narrowly sourced French search aliases `tofu de poisson` and `poisson tofu`. Keep it separate from soybean tofu, fish balls, fish cakes, surimi paste or shreds, and plant-based “vegan fish tofu.”
- **Scope:** The Canadian and Québec-market fish-based formed product sold or menu-listed as fish tofu. The sources establish a product name and distinguish it from fish balls and soybean tofu; they do not establish one species, recipe, or universal formulation.
- **Proposal-only status:** No shared catalog, forms, ledger, plan, roadmap, recipe, or test files were changed. No tests were run.
- **New source-ID prefix:** `WP04-SECTIONP-FISH-TOFU-20261015-R147-`. The prefix and proposed reference ID were checked against the live ledger, references, forms, proposal files, and batch archive; no collision was found.

## Evidence and identity boundary

The CFIA’s bilingual processed-fish survey lists **Fish tofu / Tofu au poisson** as a distinct frozen or refrigerated fish/seafood product name. Its table separately names fish balls, fish cakes, and surimi chunks, so it supports keeping those product terms apart; it is a surveillance table, not a product standard or formulation [S01].

Fondue de Pékin in Brossard currently lists `Poisson Tofu / Fish tofu` and `Boulettes de poisson / Fish balls` as separate hot-pot items. It also lists tofu under its separate soybean-products section. The restaurant marks both fish tofu and fish balls as needing cooking before consumption; that instruction is specific to this menu and is not generalized to the catalog identity [S02].

A current Canadian Walmart listing for Watson Frozen Fish Tofu names a product whose ingredient declaration begins with minced fish and identifies golden threadfin bream (*Nemipterus virgatus*), then water, potato starch, soy oil, and other ingredients. Walmart’s French listing and image description use `tofu de poisson`. This is one retailer-reported product example, not evidence that all fish tofu uses this species or formula; the item was out of stock at the selected location when checked [S03].

Together, the official bilingual name, a current Québec restaurant’s separate menu category, and a current packaged product support a bounded prepared-fish identity and a real picker gap. The proposal does not claim an OQLF-preferred term: `tofu au poisson` is the official bilingual survey wording, while `tofu de poisson` and `poisson tofu` are recorded only as source-attested retailer/menu variants. Exclude soybean tofu, plant-based fish imitations, fish balls, fish cakes/croquettes, surimi paste, retail surimi shreds, and fish species as aliases. Do not infer that all fish tofu products are fried, ready-to-eat, made with surimi, or made from one species.

## Current catalog, picker, archive, and recipe audit

The live package contains **1,503 ingredient references**, **119 forms**, and **114 manifest-listed recipes with 1,123 ingredient rows**. Exact-key and phrase checks covered active bilingual reference names and aliases plus all form labels and match terms. None of `fish tofu`, `tofu au poisson`, `tofu de poisson`, or `poisson tofu` currently has an exact active owner. No fish-tofu reference or form exists in the ledger or archive, and no matching fish-tofu proposal/batch decision was found. The existing generic fish-ball identity, Bonga powder, fish-ball product-state reviews, surimi holds, and crab-flavoured pollock-flakes integration remain separate.

The projection follows `normalizeIngredientSearchKey` and complete-word-phrase-first behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt):

| Query | Current result | With proposed row | Effect |
|---|---|---|---|
| `fish tofu` | none | fish tofu / tofu au poisson | Qualified product query becomes selectable. |
| `tofu au poisson` | none | fish tofu / tofu au poisson | Official French phrase selects the product. |
| `tofu de poisson` | none | fish tofu / tofu au poisson | Retailer-attested French variant selects the product. |
| `poisson tofu` | none | fish tofu / tofu au poisson | Québec menu wording selects the product. |
| `fish` | Bonga dried fish powder; fish balls; fish sauce; fish stock (4) | Same four plus fish tofu (5) | Visible additional prepared-fish result. |
| `tofu` | 7 references | Same 7 plus fish tofu (8) | Result is displayed with its fish qualifier; no plain `tofu` alias is added. |
| `poisson` | 7 references | Same 7 plus fish tofu (8) | Result is displayed with its tofu-style product qualifier. |
| `fish ball` / `fish balls` | fish balls (1) | fish balls (1) | Existing formed-product identity remains separate. |
| `surimi` | none | none | No surimi alias or paste equivalence is introduced. |

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned for the four proposed phrases and adjacent fish-tofu, fish-ball, surimi, fish-paste, and relevant French wording. There were **zero target hits** in recipe text or ingredient rows. No recipe link is proposed. The Brossard menu is product-use context, not a recipe or a recipe quantity.

This does not reopen the integrated fish-ball identity, the generic surimi hold, or the source-scoped Bonga powder and crab-flavoured pollock flakes. See the [fish-balls/surimi reassessment](wp04-fish-balls-surimi-current-source-reassessment-20261011.md), [fried fish-ball hold](../batches/wp04-section-p-fried-fish-balls-product-state-hold-integration-20261012/README.md), [surimi-shreds hold](../batches/wp04-section-p-surimi-shreds-search-hold-integration-20261012/README.md), [Bonga powder review](wp04-section-p-fish-powder-identity-boundary-review-20261011.md), and [pollock-flakes integration](../batches/wp02-wp03-wp04-round29-gap-review-integration-20261013/README.md).

## Forms, measurements, and substitutions

Do not add an ingredient form. Product sources differ in how they describe and prepare their items, and the available evidence does not establish one reusable frozen, fresh, fried, cooked, or ready-to-eat state for the full named class. The restaurant’s cook-before-eating marker applies only to its own menu item.

Set `defaultDensity` to `null` and `unitMappings` to `[]`. No paired mass-volume observation, count-to-mass relationship, reusable household measure, serving amount, or recipe-linked yield was found. The retail package weight is SKU-specific and must not become a generic measure or conversion.

Set ledger `measurementState` to `researched_no_supported_value` and `substitutionResearchState` to `researched_no_supported_substitute`. No source or bundled recipe establishes a directed substitution, ratio, yield, or equivalent cooking behavior among fish tofu, fish balls, fish cake, plain fish, soybean tofu, or surimi. Add no conversion, yield, recipe-line link, or substitution rule.

## Exact proposed catalog delta

```json
{
  "id": "ingredient-ref-fish-tofu",
  "nameFr": "tofu au poisson",
  "nameEn": "fish tofu",
  "aliasesFr": [
    "tofu de poisson",
    "poisson tofu"
  ],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "PROTEIN"
}
```

No form, recipe link, measurement observation, unit conversion, package yield, or substitution rule is proposed.

## Proposed ledger record

```json
{
  "recordId": "ingredient-ref-fish-tofu",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP04-SECTIONP-FISH-TOFU-20261015-R147-S01",
      "url": "https://inspection.canada.ca/en/food-safety-industry/food-chemistry-and-microbiology/food-safety-testing-reports-and-journal-articles/april-1-2015-march-31-2016",
      "title": "CFIA, Undeclared Allergens and Gluten in Processed Fish and Seafood — April 1, 2015 to March 31, 2016",
      "accessedOn": "2026-10-15",
      "locator": "Frozen or refrigerated fish/seafood table; Fish tofu entry, alongside separate fish-ball and surimi-chunk product names.",
      "supports": "Official Canadian English report lists Fish tofu as a distinct product label; the paired French report lists Tofu au poisson. This is surveillance naming, not a composition standard or product approval.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-FISH-TOFU-20261015-R147-S02",
      "url": "https://brossard.fonduedepekin.ca/",
      "title": "Fondue de Pékin, Brossard — current menu",
      "accessedOn": "2026-10-15",
      "locator": "Hot-pot menu items J1 and J4 and the separate soya-bean-products section.",
      "supports": "Lists Poisson Tofu / Fish tofu separately from Boulettes de poisson / Fish balls and from soybean tofu; marks the menu’s fish tofu and fish balls for cooking before consumption. Does not provide an ingredient statement or reusable preparation rule.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-FISH-TOFU-20261015-R147-S03",
      "url": "https://www.walmart.ca/fr/ip/Watson-Frozen-Fish-Tofu-Small-Bag/6000198610690",
      "title": "Walmart Canada, Watson Frozen Fish Tofu-Small Bag",
      "accessedOn": "2026-10-15",
      "locator": "Bilingual product listing, product description, image description, and ingredient declaration.",
      "supports": "Current Canadian retail listing names a fish-tofu product and uses tofu de poisson in its French rendering; its reported ingredients identify minced golden threadfin bream (*Nemipterus virgatus*) and other product-specific components. The listing is out of stock at the selected location and retailer information is not independently verified.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only fish tofu / tofu au poisson as a bounded fish-based formed-product identity with only the source-attested French variants tofu de poisson and poisson tofu. Keep soybean tofu, fish balls, fish cakes, surimi products, plant-based imitations, and fish species separate. Sources and recipes establish no reusable form, measure, density, mapping, yield, recipe link, conversion, or substitution.",
      "sourceIds": [
        "WP04-SECTIONP-FISH-TOFU-20261015-R147-S01",
        "WP04-SECTIONP-FISH-TOFU-20261015-R147-S02",
        "WP04-SECTIONP-FISH-TOFU-20261015-R147-S03"
      ]
    }
  ]
}
```

## Source register

The three new source IDs are local to this proposal and were checked against the current research ledger and proposal/batch archive.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-FISH-TOFU-20261015-R147-S01** | CFIA, [Undeclared Allergens and Gluten in Processed Fish and Seafood](https://inspection.canada.ca/en/food-safety-industry/food-chemistry-and-microbiology/food-safety-testing-reports-and-journal-articles/april-1-2015-march-31-2016); French report [Présence non déclarée d’allergènes et de gluten dans le poisson et les fruits de mer transformés](https://inspection.canada.ca/fr/salubrite-alimentaire-lindustrie/chimie-microbiologie-alimentaires/rapports-danalyse-articles-revues-sa/1-avril-2015-au-31-mars-2016). | Bilingual federal survey tables identify `Fish tofu / Tofu au poisson` as a frozen or refrigerated fish/seafood label and list fish balls and surimi chunks separately. Survey naming is not a product standard or composition evidence. |
| **WP04-SECTIONP-FISH-TOFU-20261015-R147-S02** | Fondue de Pékin, Brossard, [current menu](https://brossard.fonduedepekin.ca/). | The Québec restaurant lists `Poisson Tofu / Fish tofu` separately from fish balls and the soybean-products section. The menu marks its hot-pot fish-tofu and fish-ball items for cooking before consumption; it gives no composition or recipe amount. |
| **WP04-SECTIONP-FISH-TOFU-20261015-R147-S03** | Walmart Canada, [Watson Frozen Fish Tofu-Small Bag](https://www.walmart.ca/fr/ip/Watson-Frozen-Fish-Tofu-Small-Bag/6000198610690). | Current bilingual retailer page provides the English product name and French `tofu de poisson` rendering. The retailer-reported ingredient list names minced golden threadfin bream (*Nemipterus virgatus*) and other components; this is one product example, not a generic species/formula. The selected location showed out of stock. |

The live Section P parent remains open after this candidate; the existing fish-ball, surimi, Bonga powder, and crab-flavoured-pollock decisions are unchanged.
