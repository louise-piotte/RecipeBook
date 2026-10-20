# WP02 Section A7 durum-semolina serving-weight review — R635 — 2026-10-18

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Accepted and integrated. See the [R635 integration README](../batches/wp02-a7-durum-semolina-measurement-integration-r635-20261018/README.md). The integration changes only the existing ledger JSON and catalog documentation; active catalog behavior and recipes remain unchanged.
- **Plan anchor:** WP02 Section A7 remains open for other grain meals and milling products in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2094). Durum semolina's identity was integrated earlier. Before R635, its measurement state was `not_yet_researched` and the row had no measurement observations.
- **Scope:** Record current, source-specific portions for the existing `ingredient-ref-durum-semolina`. Do not reopen its identity or French name, research substitutions, or activate a general measure.
- **Avoided prior work:** R605 reviewed and held toasted stone-cut wheat meal; R624 reviewed wheat germ; R628 reviewed wheat bran; and R631 reviewed Scottish oatmeal. Durum semolina is a separate active milling-product identity with an unresearched measurement field.

## Recommendation

Update only the existing `ingredient-ref-durum-semolina` research-ledger record:

- Set `measurementState` to `researched_supported` and append five source-bounded `portion_weight` observations listed below.
- Append four new source entries and attach the already-owned Bob's Red Mill flour-weight-chart ID to this row with a semolina-specific locator.
- Keep `substitutionResearchState: "not_yet_researched"`. Keep the active reference's `defaultDensity: null` and `unitMappings: []`; add no alias, form, conversion, package yield, recipe link, or substitution rule.

**Active numeric behavior supported: none.** The sources support only product-label, manufacturer-chart, package-formula, and test-kitchen observations. They do not establish one value transferable across durum-semolina products, a default density, or an active volume-to-mass mapping. Preserve each published context separately; do not average, scale, or derive a density from the listed portions.

## Source evidence and limits

| Source | Direct evidence | Limit retained |
|---|---|---|
| Bob's Red Mill, [Semolina Flour product page](https://www.bobsredmill.com/product/semolina-pasta-flour) (`R635-S01`) | Describes its product as made from durum wheat and lists a Nutrition Facts serving of **1/4 cup (45 g)**. | A named manufacturer's label portion only. The page does not state cup capacity or how the serving is filled. |
| Bob's Red Mill, [Flour Weight Chart](https://www.bobsredmill.com/articles/bobs-red-mill-flour-weight-chart) (reuse `WP02-B23-RESIDUAL-20261010-S05`) | Its Semolina Flour row directly lists **1/4 cup = 45 g** and **1 cup = 180 g**. | The 1/4-cup chart entry repeats the same manufacturer's product-page serving and is not independent corroboration. Record only the separately stated 1-cup chart portion as a second observation. The chart recommends weighing and provides general spoon-and-level guidance, but does not name the method used for its semolina row or specify a cup capacity. |
| King Arthur Baking, [Semolina Flour product page](https://shop.kingarthurbaking.com/items/semolina-flour), SKU 100227 / UPC 071012108268 (`R635-S02`) | Identifies the retail item as Semolina Flour made from a coarse grind of durum wheat, and links to the package label. | Product-identity context only; no measure is taken from this page. |
| King Arthur Baking, [Semolina Flour package PDF](https://shop.kingarthurbaking.com/content/packaging/100227_1.pdf) (`R635-S03`) | Identifies the 3 lb package as coarse-ground semolina from high-protein durum wheat. Its Nutrition Facts serving is **3 tablespoons (28 g)**. The package's Semolina Sandwich Bread formula lists **2 3/4 cups (448 g)** semolina flour. | The Nutrition Facts serving and bread formula are separate package contexts. The label gives no spoon volume convention or fill method; the formula gives no method for measuring the flour. Retain the recipe amount as formula-specific. |
| King Arthur Baking, [Semolina Pasta recipe](https://www.kingarthurbaking.com/recipes/semolina-pasta-recipe) (`R635-S04`) | The ingredient list gives **1 3/4 cup (285 g)** King Arthur Semolina Flour, plus an unquantified amount for sprinkling. Its measuring instruction says to weigh the flour or gently spoon it into a cup and sweep off excess. | Record the listed pasta-formula amount and stated method only. The extra flour for sprinkling is unquantified; the recipe does not define a catalog-wide mapping or cup convention. |

The Bob's Red Mill product page and chart are from the same manufacturer; the chart's quarter-cup cell repeats the product label's serving. King Arthur's package label, package bread recipe, and pasta recipe each provide directly printed portions, but the portions belong to different product-label and formula contexts. No new amount is calculated from another amount.

## Ownership, picker, and recipe-demand audit

| Surface | Current owner/state | R635 disposition |
|---|---|---|
| Active reference | `ingredient-ref-durum-semolina`, `durum semolina / semoule de blé dur`, category `FLOUR_AND_STARCH`; no aliases; density null; mappings empty. | Keep the identity and every active field unchanged. |
| Neighboring picker results | `durum semolina` currently returns both `ingredient-ref-durum-semolina` and `ingredient-ref-semola-rimacinata` (`remilled durum semolina`). `semolina` matches eight qualified active identities. `semoule de blé dur` returns the ordinary and remilled durum identities. | Add no aliases. Keep ordinary, remilled, spring-wheat, barley, emmer, Khorasan, sorghum, and sankhal semolina products separate. In particular, do not add generic `semolina` or product-specific `semolina flour` as aliases. |
| Source ownership | Before R635, the Bob's product page, King Arthur product page, package PDF, and King Arthur recipe had no ledger entries. The Bob's flour-chart URL already belongs to source ID `WP02-B23-RESIDUAL-20261010-S05`, reused on other ingredient records. | The four new R635 source IDs are now attached to the durum-semolina row. Reuse the chart's existing ID for its semolina row; do not mint a duplicate ID for that URL. |
| Other catalog data | No form, global or contextual substitution rule, or package-yield record is attached to `ingredient-ref-durum-semolina`. The one package-yield record in the current package is for another ingredient. | Add none. The identity row's substitution state remains open. |
| Nearby published substitution study | R529 records Spina et al.'s durum-bread blend experiment on the sweet-white-lupin record. The study's source names **re-milled durum semolina**, and its ledger finding is scoped to that ingredient and formula; it does not establish a durum-semolina measure or reusable substitution. | Do not duplicate or broaden the R529 finding. This batch is measure-only. |
| Bundled recipe demand | Parsed all **114** recipe files listed by the current manifest, covering **1,123** structured ingredient lines. No file or ingredient line contains the reference ID, `durum semolina`, `semolina flour`, `semolina`, `semoule de blé dur`, or accent-folded `semoule de ble dur`. | No recipe link or recipe edit. The cited King Arthur recipe is external evidence, not bundled recipe demand. |

No names, aliases, or forms change, so picker results do not change. The new ledger observations are not available as active conversions or ingredient-picker measures.

## Integrated ledger delta

The accepted changes are on the existing `ingredient-ref-durum-semolina` row. The source and decision objects below are append-only additions; the current `S4`, `WP02-S23`, and identity decision remain. The chart object reuses an existing source ID for its exact existing URL.

Set:

```json
{
  "measurementState": "researched_supported",
  "substitutionResearchState": "not_yet_researched"
}
```

Added to `sources`:

```json
[
  {
    "sourceId": "WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S01",
    "url": "https://www.bobsredmill.com/product/semolina-pasta-flour",
    "title": "Bob's Red Mill, Semolina Flour",
    "accessedOn": "2026-10-18",
    "locator": "Product description, Nutrition Facts serving size, and ingredient statement.",
    "supports": "The manufacturer describes Semolina Flour as made from durum wheat and lists a 1/4 cup (45 g) Nutrition Facts serving. The ingredient declaration is enriched durum flour. This supports a named-product label portion only; no cup capacity or fill method is stated.",
    "sourceKind": "manufacturer"
  },
  {
    "sourceId": "WP02-B23-RESIDUAL-20261010-S05",
    "url": "https://www.bobsredmill.com/articles/bobs-red-mill-flour-weight-chart",
    "title": "Bob's Red Mill, Flour Weight Chart",
    "accessedOn": "2026-10-18",
    "locator": "Semolina Flour row, 1/4-cup and 1-cup columns; general measurement guidance.",
    "supports": "The chart directly lists Semolina Flour as 45 g per 1/4 cup and 180 g per 1 cup. The quarter-cup entry repeats the same manufacturer's 45 g product-page serving, not an independent product measure. The page recommends weighing and gives general spoon-and-level guidance but does not state the semolina-row method or cup capacity.",
    "sourceKind": "manufacturer"
  },
  {
    "sourceId": "WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S02",
    "url": "https://shop.kingarthurbaking.com/items/semolina-flour",
    "title": "King Arthur Baking, Semolina Flour, SKU 100227",
    "accessedOn": "2026-10-18",
    "locator": "Product identification, product description, and linked package PDF.",
    "supports": "Identifies SKU 100227 (UPC 071012108268) as Semolina Flour made from a coarse grind of durum wheat and links to its package PDF. Product-identity context only; no measurement is imported from this page.",
    "sourceKind": "manufacturer"
  },
  {
    "sourceId": "WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S03",
    "url": "https://shop.kingarthurbaking.com/content/packaging/100227_1.pdf",
    "title": "King Arthur Baking, Semolina Flour 3 lb package",
    "accessedOn": "2026-10-18",
    "locator": "Package description; Semolina Sandwich Bread formula; Nutrition Facts serving size.",
    "supports": "The package identifies coarse-ground semolina from high-protein durum wheat. Nutrition Facts gives a 3 tablespoons (28 g) serving; the printed Semolina Sandwich Bread formula separately lists 2 3/4 cups (448 g). Do not use either value as a cross-product measure or infer an unstated spoon or cup method.",
    "sourceKind": "manufacturer"
  },
  {
    "sourceId": "WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S04",
    "url": "https://www.kingarthurbaking.com/recipes/semolina-pasta-recipe",
    "title": "King Arthur Baking, Semolina Pasta",
    "versionOrDate": "Updated 2025-04-30",
    "accessedOn": "2026-10-18",
    "locator": "Ingredients list and first measuring instruction.",
    "supports": "The formula lists 1 3/4 cup (285 g) King Arthur Semolina Flour, plus additional unquantified flour for sprinkling. The instruction says to weigh or gently spoon flour into a cup and sweep off excess. This method and portion are limited to the cited recipe.",
    "sourceKind": "test_kitchen"
  }
]
```

Added to `measurementObservations`:

```json
[
  {
    "observationId": "durum-semolina-bobs-red-mill-label-quarter-cup-45g-r635-20261018",
    "relationship": "portion_weight",
    "value": 45,
    "valueUnit": "g",
    "foodDescription": "Bob's Red Mill Semolina Flour, manufacturer product-page Nutrition Facts serving.",
    "foodState": "Dry, as sold; the product ingredient declaration names enriched durum flour.",
    "measurementMethod": "Manufacturer Nutrition Facts serving declaration.",
    "quantityBasis": "One named-product label portion only; no cup conversion, density, or generic durum-semolina measure.",
    "sourceQuantity": {
      "amount": 0.25,
      "unit": "cup",
      "unitConvention": "Product-label serving; cup capacity and filling method are not stated."
    },
    "observedMassG": 45,
    "evidenceKind": "manufacturer_label",
    "sourceIds": [
      "WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S01"
    ]
  },
  {
    "observationId": "durum-semolina-bobs-chart-one-cup-180g-r635-20261018",
    "relationship": "portion_weight",
    "value": 180,
    "valueUnit": "g",
    "foodDescription": "Bob's Red Mill Flour Weight Chart, Semolina Flour row.",
    "foodState": "Dry chart entry; the chart does not identify a product SKU.",
    "measurementMethod": "Published manufacturer flour-weight chart. The page gives general weighing and spoon-and-level guidance but no semolina-row-specific measuring method.",
    "quantityBasis": "Directly published 1-cup chart portion only. The chart's quarter-cup value repeats the same manufacturer's product serving; do not derive a conversion, density, or general mapping.",
    "sourceQuantity": {
      "amount": 1,
      "unit": "cup",
      "unitConvention": "Chart cup capacity is not stated."
    },
    "observedMassG": 180,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP02-B23-RESIDUAL-20261010-S05"
    ]
  },
  {
    "observationId": "durum-semolina-kab-label-three-tbsp-28g-r635-20261018",
    "relationship": "portion_weight",
    "value": 28,
    "valueUnit": "g",
    "foodDescription": "King Arthur Baking Semolina Flour, SKU 100227, package Nutrition Facts serving.",
    "foodState": "Dry, as sold; package identifies coarse-ground durum semolina.",
    "measurementMethod": "Manufacturer package Nutrition Facts serving declaration.",
    "quantityBasis": "One package serving only; no spoon volume convention, fill method, or cross-product measure is stated.",
    "sourceQuantity": {
      "amount": 3,
      "unit": "tbsp",
      "unitConvention": "The package prints 3 tbsps; spoon volume convention and filling method are not stated."
    },
    "observedMassG": 28,
    "evidenceKind": "manufacturer_label",
    "sourceIds": [
      "WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S03"
    ]
  },
  {
    "observationId": "durum-semolina-kab-package-bread-2-3-4-cup-448g-r635-20261018",
    "relationship": "portion_weight",
    "value": 448,
    "valueUnit": "g",
    "foodDescription": "King Arthur Baking Semolina Flour, amount listed in its package's Semolina Sandwich Bread formula.",
    "foodState": "Dry flour ingredient in the package-printed bread formula.",
    "measurementMethod": "Published package recipe ingredient amount; the source does not state a flour measuring method.",
    "quantityBasis": "One formula-specific amount only. Do not treat it as a package serving or reusable cup mapping.",
    "sourceQuantity": {
      "amount": 2.75,
      "unit": "cup",
      "unitConvention": "Package formula; cup capacity and filling method are not stated."
    },
    "observedMassG": 448,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S03"
    ]
  },
  {
    "observationId": "durum-semolina-kab-pasta-recipe-1-3-4-cup-285g-r635-20261018",
    "relationship": "portion_weight",
    "value": 285,
    "valueUnit": "g",
    "foodDescription": "King Arthur Baking Semolina Flour, amount listed in the Semolina Pasta formula.",
    "foodState": "Dry flour ingredient in the cited pasta formula; additional flour for sprinkling is unquantified.",
    "measurementMethod": "The recipe instructs readers to weigh the flour or gently spoon it into a cup and sweep off excess.",
    "quantityBasis": "One recipe-specific amount and measuring method only; do not make it an active mapping or apply it to another semolina product or formula.",
    "sourceQuantity": {
      "amount": 1.75,
      "unit": "cup",
      "unitConvention": "The cited recipe's gently-spoon-and-sweep method; cup capacity is not stated."
    },
    "observedMassG": 285,
    "evidenceKind": "published_portion",
    "sourceIds": [
      "WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S04"
    ]
  }
]
```

Added this decision to `decisions`:

```json
{
  "outcome": "accepted",
  "reason": "Record five directly published, source-bounded durum-semolina portions: a Bob's Red Mill product-label serving and its separate manufacturer-chart cup row, a King Arthur package serving, that package's bread formula amount, and a King Arthur pasta formula amount. These sources support ledger observations only, not an identity-wide measure, active conversion, density, or substitution. Keep the substitution research state open and the active reference unchanged.",
  "sourceIds": [
    "WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S01",
    "WP02-B23-RESIDUAL-20261010-S05",
    "WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S02",
    "WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S03",
    "WP02-A7-DURUM-SEMOLINA-MEASUREMENT-R635-20261018-S04"
  ]
}
```

## Static review checks

- Read the root `AGENTS.md`, relevant data-model requirements, active roadmap, current WP02 A7 plan checkpoint, active catalog and ledger, ledger schema, and the R605/R624/R628/R631 proposal history.
- Before integration, confirmed that the target ledger row was identity-verified, had no measurement observations, and was `not_yet_researched`; its then-current sources and identity decision supported naming only.
- Checked exact source URLs and source-ID ownership. Before integration, the four new R635 source IDs and five observation IDs were unowned; the Bob's chart URL already had the shared ID reused above. The requested proposal path was absent before creation.
- Checked current reference names and aliases, forms, substitution rules, contextual rules, and package yields. No active catalog or picker change is proposed.
- Parsed all 114 manifest-listed recipe files and their 1,123 structured ingredient lines; no target identity or semolina phrase was found.
- Checked the proposed observation shapes and enum values against `docs/catalog/research-ledger.schema.json`. The source quantities are direct published amounts; no measurement is derived.
- The integration adds only database ledger JSON and documentation. No software tests, build, emulator, or deployment checks were needed under `AGENTS.md`.
