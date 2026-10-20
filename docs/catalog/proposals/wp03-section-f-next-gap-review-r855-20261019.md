# WP03 Section F R855 — Kellogg's Corn Flake Crumbs review

## Review record

- **Reviewed:** 2026-10-19.
- **Plan anchors:** Section F begins at [line 4470](../../RecipeBook-global-ingredient-catalog-plan.txt#L4479). Its open parent checklist at [line 5033](../../RecipeBook-global-ingredient-catalog-plan.txt#L5042) covers regional cereal mixes and preprocessed grains. The post-R852 plan and R851–R853 integration are reviewed below.
- **Candidate:** The Canadian manufacturer product `Kellogg's Corn Flake Crumbs® / Chapelure Kellogg's Corn Flake Crumbs®`, GTIN `00064100000223`.
- **Recommendation:** Add one bilingual, package-identified crumb-product reference in `BAKING_MIXIN_AND_PANTRY`, and one product-specific ledger portion observation for the matching `1/3 cup / 1/3 tasse (30 g)` serving.
- **Status:** Integrated on 2026-10-19. The bilingual product reference and GTIN-specific label serving are recorded in the active catalog and research ledger; the plan and progress records are updated in the [R854–R856 integration README](../batches/wp02-wp03-wp04-r854-r856-gap-review-integration-20261019/README.md).
- **Scope:** This is a named cooking-crumb product, separate from generic corn flakes and generic breadcrumbs. It does not propose a corn-flake form, ingredient-component link, broad crumb alias, generic portion, conversion, yield, recipe link, or substitution.

## Why this is a distinct, actionable gap

The still-open Section F checklist includes preprocessed grains. WK Kellogg Canada's current product page names `Kellogg's Corn Flake Crumbs®`, lists a 575 g size, and describes using it for cooking on fish or chicken or in a pie shell. The product page lists milled corn, sugars including corn and barley malt extract, salt, and vitamins and minerals. It is sold as a cooking-crumb product, not as the ordinary `Kellogg's Corn Flakes®` cereal.

The English and French WK Kellogg SmartLabel pages identify the same GTIN, `00064100000223`, and the same 575 g package. Their nutrition panels both declare one serving as `1/3 cup / 1/3 tasse (30 g)`. The manufacturer warns that package details can change and directs consumers to the actual package for current information. Record this one source-paired serving only for the exact GTIN; it is not a reusable measure for corn flakes, breadcrumbs, or other crumbs.

The exact French product name appears in the French SmartLabel title, and WK Kellogg's French Corn Flakes family page links `Chapelure Kellogg's Corn Flake Crumbs®` separately from `Céréales Kellogg's Corn Flakes®`. This bilingual, GTIN-matched product evidence supports the two display names without translating generic `corn flakes` into a crumb alias. The English product page and its label list do not establish a preparation form of the existing generic `corn flakes` identity; this proposal treats the named packaged crumb product as its own reference and infers no component relationship.

## Primary-source evidence

| Proposed source ID | Primary source and URL | What it supports and its limits |
|---|---|---|
| `WP03-CORN-FLAKE-CRUMBS-R855-20261019-S01` | WK Kellogg Co Canada, [Kellogg's Corn Flake Crumbs® product page](https://www.wkkellogg.ca/en/products/kellogg-s-corn-flake-crumbs-product) | Manufacturer product heading, cooking-use description, 575 g offering, and ingredient list. The page does not itself display a GTIN or state a kitchen serving; use the linked product-code SmartLabel for those details. |
| `WP03-CORN-FLAKE-CRUMBS-R855-20261019-S02` | WK Kellogg Canada SmartLabel, [Kellogg's Corn Flake Crumbs®](https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00064100000223) | Exact English product title, GTIN `00064100000223`, 575 g package, 1/3 cup (30 g) serving, and ingredient declaration. The portion is specific to this GTIN. No cup convention or fill method is stated; the label says package information may change. |
| `WP03-CORN-FLAKE-CRUMBS-R855-20261019-S03` | WK Kellogg Canada SmartLabel, [Chapelure Kellogg's Corn Flake Crumbs®](https://smartlabel.wkkellogg.com/fr_CA/Product/Index?gtin=00064100000223) | Exact French product title, the same GTIN and 575 g package, 1/3 tasse (30 g) serving, and corresponding ingredient declaration. Confirms the paired French label for the product-specific observation; it does not establish a generic crumb measure. |
| `WP03-CORN-FLAKE-CRUMBS-R855-20261019-S04` | WK Kellogg Co Canada, [Kellogg's Corn Flakes® brand page (French)](https://www.wkkellogg.ca/fr/nos-aliments/nos-marques/corn-flakes) | French manufacturer page names the cooking product `Chapelure Corn Flake Crumbs®` and links it separately from `Céréales Kellogg's Corn Flakes®`. This is product-family context; the SmartLabel pages provide the exact package-code match. |

The manufacturer product page links to the English SmartLabel record; the French SmartLabel record resolves independently with the same GTIN. The French product-detail route is also listed by the manufacturer, but its page body was not exposed by the web reader; the SmartLabel title and French family-page product link provide the usable French evidence here. No retailer-specific wording or UPC-to-GTIN inference is needed.

## Exact proposed data delta

### Active reference

Append this reference to `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`:

```json
{
  "id": "ingredient-ref-kelloggs-corn-flake-crumbs",
  "nameEn": "Kellogg's Corn Flake Crumbs\u00ae",
  "nameFr": "Chapelure Kellogg's Corn Flake Crumbs\u00ae",
  "aliasesEn": [],
  "aliasesFr": [],
  "category": "BAKING_MIXIN_AND_PANTRY",
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z"
}
```

The category follows the product's stated cooking-crumb role and matches the existing generic crumb identities. Keep both exact brand-qualified labels as the only search terms; do not alias the product to `corn flakes`, `corn flake crumbs`, `breadcrumbs`, `bread crumbs`, or `chapelure`.

### Research ledger

Append this `ingredient_reference` record to `docs/catalog/research-ledger.v1.json`:

```json
{
  "recordId": "ingredient-ref-kelloggs-corn-flake-crumbs",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_supported",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP03-CORN-FLAKE-CRUMBS-R855-20261019-S01",
      "url": "https://www.wkkellogg.ca/en/products/kellogg-s-corn-flake-crumbs-product",
      "title": "WK Kellogg Co Canada, Kellogg's Corn Flake Crumbs\u00ae product page",
      "accessedOn": "2026-10-19",
      "locator": "Product heading; cooking-use description; available size; Nutrition > Ingredients.",
      "supports": "Identifies Kellogg's Corn Flake Crumbs as a named Canadian cooking-crumb product, lists a 575 g offering, describes uses on fish or chicken and in a pie shell, and lists milled corn, sugars including corn and barley malt extract, salt, and vitamins and minerals. It does not display the package GTIN or a kitchen serving.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-CORN-FLAKE-CRUMBS-R855-20261019-S02",
      "url": "https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00064100000223",
      "title": "WK Kellogg Canada SmartLabel, Kellogg's Corn Flake Crumbs\u00ae",
      "accessedOn": "2026-10-19",
      "locator": "Product title, GTIN, package mass, Nutrition Facts serving size, ingredient declaration, and package-information notice.",
      "supports": "The English label identifies Kellogg's Corn Flake Crumbs, GTIN 00064100000223, 575 g, and a serving of 1/3 cup (30 g). This serving observation is limited to the named package code; the source states no cup convention or filling method and directs consumers to the actual package for current information.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-CORN-FLAKE-CRUMBS-R855-20261019-S03",
      "url": "https://smartlabel.wkkellogg.com/fr_CA/Product/Index?gtin=00064100000223",
      "title": "WK Kellogg Canada SmartLabel, Chapelure Kellogg's Corn Flake Crumbs\u00ae",
      "accessedOn": "2026-10-19",
      "locator": "French product title, GTIN, package mass, Valeur nutritive serving size, ingredient declaration, and package-information notice.",
      "supports": "The French label identifies Chapelure Kellogg's Corn Flake Crumbs, the same GTIN 00064100000223 and 575 g package, and a serving of 1/3 tasse (30 g). It confirms the paired product label and amount for this package only; no generic crumb measure or cup convention is stated.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-CORN-FLAKE-CRUMBS-R855-20261019-S04",
      "url": "https://www.wkkellogg.ca/fr/nos-aliments/nos-marques/corn-flakes",
      "title": "WK Kellogg Co Canada, Kellogg's Corn Flakes\u00ae brand page (French)",
      "accessedOn": "2026-10-19",
      "locator": "French product-family copy and distinct product links for Chapelure Kellogg's Corn Flake Crumbs and Céréales Kellogg's Corn Flakes.",
      "supports": "The French manufacturer family page links Chapelure Kellogg's Corn Flake Crumbs separately from Céréales Kellogg's Corn Flakes and describes crumb use in cooking. It provides product-family context but no package-code or serving measurement.",
      "sourceKind": "manufacturer"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "kelloggs-corn-flake-crumbs-gtin-00064100000223-one-third-cup-20261019",
      "relationship": "portion_weight",
      "value": 30,
      "valueUnit": "g",
      "foodDescription": "Kellogg's Corn Flake Crumbs, GTIN 00064100000223, 575 g package",
      "sourceQuantity": {
        "amount": 0.3333333333333333,
        "unit": "cup"
      },
      "observedMassG": 30,
      "evidenceKind": "manufacturer_label",
      "measurementMethod": "Bilingual, product-code-matched manufacturer nutrition-label serving declaration; no independent weighing procedure is published.",
      "quantityBasis": "One manufacturer-label serving for GTIN 00064100000223, printed as 1/3 cup in English and 1/3 tasse in French. Do not transfer to another corn-flake or crumb product; the label does not define a cup volume or fill method.",
      "sourceIds": [
        "WP03-CORN-FLAKE-CRUMBS-R855-20261019-S02",
        "WP03-CORN-FLAKE-CRUMBS-R855-20261019-S03"
      ]
    }
  ],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add Kellogg's Corn Flake Crumbs / Chapelure Kellogg's Corn Flake Crumbs as one named Canadian cooking-crumb product, identified by GTIN 00064100000223. The bilingual SmartLabel pages match on GTIN, 575 g package, and 1/3 cup / 1/3 tasse (30 g) serving; retain that portion only for this product code. Keep the product separate from generic corn flakes, breadcrumbs, and their existing forms. Add no broad aliases, component links, ingredient forms, density, unit mappings, generic measure, conversion, package yield, recipe link, or substitution.",
      "sourceIds": [
        "WP03-CORN-FLAKE-CRUMBS-R855-20261019-S01",
        "WP03-CORN-FLAKE-CRUMBS-R855-20261019-S02",
        "WP03-CORN-FLAKE-CRUMBS-R855-20261019-S03",
        "WP03-CORN-FLAKE-CRUMBS-R855-20261019-S04"
      ]
    }
  ]
}
```

The 575 g value identifies the package in the cited sources; it is not entered as a cooking yield. The only measurement is the exact-GTIN label serving above. The observation is ledger-only and adds no active unit conversion or serving default.

## Pre-integration ownership, picker, form, rule, and recipe audit

This audit records the state reviewed before integration on 2026-10-19. The integrated state is summarized in the R854–R856 integration README.

| Surface | Current finding |
|---|---|
| Active catalog | The post-R852 package has 1,890 references. No reference owns the proposed ID or exact English/French display. Existing `ingredient-ref-corn-flakes`, `ingredient-ref-breadcrumbs`, `ingredient-ref-cracker-crumbs`, `ingredient-ref-graham-cracker-crumbs`, and `ingredient-ref-panko` remain separate. |
| Forms | The package has 201 forms. The existing fresh and dried bread-crumb forms remain attached only to `ingredient-ref-breadcrumbs`; no corn-flake or Kellogg's crumb form is proposed. Do not treat this separately packaged, GTIN-identified item as a new form of `corn flakes`. |
| Legacy candidates | No exact Kellogg's product name or proposed ID occurs in the legacy identity file. The unresolved generic `ingredient-ref-bread-crumbs` candidate is a separate legacy entry and is not merged or resolved here. |
| Ledger and source ownership | The 2,298-record ledger has no candidate product record, GTIN `00064100000223`, observation ID, source ID, or owner for the proposed direct product/SmartLabel URLs. The French Corn Flakes family page also has no current ledger source owner. No prior Section F proposal or batch reviews this product. |
| Rules | Both bundled global and contextual substitution-rule files contain zero rows. No candidate rule is present; no substitution or conversion is proposed. |
| Picker projection | `IngredientSearch.kt` folds punctuation/accents and prefers full word phrases before partial matching. The proposed English and French display queries each return only the new row (0→1). Broad `corn flakes` remains on the generic corn-flakes row (1→1); `crumbs` gains this branded product alongside the existing generic crumb results (4→5). No broad crumb or corn-flake alias is stored. |
| Bundled recipes | All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned for the product names, GTIN, and proposed ID; there are no matches. Existing recipe-linked generic breadcrumbs remain unchanged. WK Kellogg's external product page gives cooking uses, but no bundled recipe link or text change is justified. |

## Limits and static checks

- The bilingual SmartLabel pages match the exact GTIN and serving declaration, but manufacturer label portions remain product-specific. The web page warns that package information can change; the actual package remains the current-label authority.
- The label does not state the cup volume, packing/fill method, or any density. Do not derive milliliters, activate a volume-to-mass mapping, or generalize this portion to corn flakes, breadcrumbs, or crumbs.
- The manufacturer's ingredient list does not justify separate corn, barley-malt, sugar, or vitamin/mineral component links. The product remains one branded reference with no form or substitution.
- Reviewed the current [catalog workflow](../ingredient-catalog-workflow.md), [plan](../../RecipeBook-global-ingredient-catalog-plan.txt), [roadmap](../../../roadmap.md), and post-R852 [R851–R853 integration README](../batches/wp02-wp03-wp04-r851-r853-gap-review-integration-20261019/README.md). Section F parent line 5017 remains open after R852; this proposal completes only one distinct product item.
- Proposed IDs and source URLs have no ledger owners or collisions; catalog/form/legacy ownership, rule inventory, picker projection, and full recipe corpus checks are recorded above. Both source portion statements match for the same GTIN.
- If accepted, only `ingredient-references.v1.json` and `research-ledger.v1.json` receive database data. This proposal is the sole file created for R855. Per `AGENTS.md`, database-JSON-only integration needs no software tests, build, emulator, or deployment; none were run for this review.
