# WP02 B2 — almond flour measurement follow-up

- **Reviewed:** 2026-10-12.
- **Status:** Proposal only. No shared catalog JSON, research ledger, manifest, generated catalog, roadmap, checklist, recipe, or existing proposal was changed.
- **Scope:** Measurement and substitution research for the existing `ingredient-ref-almond-flour` identity. The prior almond-flour/meal decision remains in force; this packet adds no identity, alias, form, or recipe link.
- **Source-ID prefix:** `WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012`; checked against the live ledger and proposal/batch archive before drafting.

## Recommendation

Complete the measurement review by recording three **source-specific published portions** in the existing almond-flour ledger record: King Arthur's chart/package-recipe value of 1 cup = 96 g, the same package PDF's nutrition serving of 1/8 cup = 16 g, and Bob's Red Mill Canada's serving of 2 tablespoons = 14 g. Keep all three observations in the research ledger only. The King Arthur package PDF gives materially inconsistent cup weights for its own blanched almond flour: 1/8 cup at 16 g scales to 128 g per cup, while its shortbread recipe says 1 cup is 96 g. The Bob's Red Mill label is also a different product-serving observation, and its filling method is unstated. These values do not establish one source-neutral almond-flour measure, packing method, or density. [S01–S03]

Set `measurementState` to `researched_supported` because the listed source-specific portions are documented. Keep the active reference's `defaultDensity: null` and `unitMappings: []`; add no form-level density, generic cup conversion, or other active measure. Do not choose the 96 g or 16 g King Arthur value as a default. The chart's adjacent almond-meal row is a separate product label and supplies no basis for assigning `almond meal` to the almond-flour identity. [S01–S02]

Complete the bounded substitution check with **no reusable catalog-level rule at this time**. King Arthur and Bob's Red Mill Canada overlap on a possible 25% replacement for baking: King Arthur says to replace one quarter of the total flour for non-yeasted treats and explicitly permits either weight or volume; Bob's says generally to replace 25% of all-purpose flour in baking recipes, without specifying the denominator across recipes with multiple flours or whether the amount is by weight or volume. Robin Hood instead recommends adding up to one quarter of the wheat-flour amount to existing recipes, while King Arthur also recommends adding almond flour to yeast dough. The overlap is a useful lead for a non-yeasted-baking contextual rule, but does not settle its denominator and amount basis across products. The active almond-flour reference is unqualified and has no form for finely ground blanched flour, so the catalog cannot scope the rule to the products represented by the converging guidance or distinguish other almond-flour/meal variants. Mark `substitutionResearchState` as `researched_no_supported_substitute` for a reusable rule under the current identity and leave active global/contextual substitution data unchanged. [S03–S05]

## Exact proposed ledger delta

Keep the active row byte-for-byte unchanged:

| Field | Retained value |
|---|---|
| `id` | `ingredient-ref-almond-flour` |
| `nameEn` / `nameFr` | `almond flour` / `farine d'amande` |
| `category` | `FLOUR_AND_STARCH` |
| `aliasesEn` | `[]` |
| `aliasesFr` | `["poudre d'amande", "poudre d'amandes"]` |
| `defaultDensity` / `unitMappings` | `null` / `[]` |

Append the following source entries and observations to the existing ledger record; retain its current identity sources and decisions. Set the two research-state fields as shown. The fragment omits unrelated existing ledger properties.

```json
{
  "measurementState": "researched_supported",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S01",
      "url": "https://www.kingarthurbaking.com/learn/ingredient-weight-chart",
      "title": "King Arthur Baking, Ingredient Weight Chart",
      "accessedOn": "2026-10-12",
      "locator": "Table rows Almond Flour and Almond meal.",
      "supports": "Lists Almond Flour at 1 cup = 3 3/8 oz = 96 g and almond meal at 1 cup = 3 oz = 84 g. The chart's cup standard and row-specific filling method are unstated. The almond-meal row is retained only as a near-neighbor boundary, not as a measure or alias for the almond-flour record.",
      "sourceKind": "test_kitchen"
    },
    {
      "sourceId": "WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S02",
      "url": "https://shop.kingarthurbaking.com/content/packaging/310701_4.pdf",
      "title": "King Arthur Baking, Almond Flour SKU 310701 package label and recipe",
      "accessedOn": "2026-10-12",
      "locator": "PDF page 2: nutrition serving size, ingredient declaration, shortbread recipe quantity, and How to Bake With It directions.",
      "supports": "Identifies the product as blanched almonds and finely ground. Its nutrition panel states 1/8 cup (16 g), while the same package's shortbread recipe states 1 cup (96 g). These source statements conflict when scaled and neither supplies a package-wide or generic flour conversion. The package also gives role-specific substitution directions.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S03",
      "url": "https://www.bobsredmill.ca/produit/almond-meal-flour",
      "title": "Bob's Red Mill Canada, Farine d'amandes",
      "accessedOn": "2026-10-12",
      "locator": "French product description, serving-size field, and ingredients.",
      "supports": "The Canadian French product page names finely ground blanched almonds and declares a serving of 2 c. à soupe (14 g). It also generally recommends replacing 25% of all-purpose flour with almond flour in baking recipes, without specifying a weight/volume basis or how to interpret the percentage when a recipe uses multiple flours. It does not state a leveling, scooping, or packing method; the portion remains product-specific.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S04",
      "url": "https://www.robinhood.ca/en/products/specialty-flours/almond",
      "title": "Robin Hood Canada, Almond Flour",
      "accessedOn": "2026-10-12",
      "locator": "Product description and Substitutions FAQ.",
      "supports": "Describes a product milled from finely ground blanched almonds. The maker says it is not a 1:1 wheat-flour substitute and recommends adding up to one quarter of the recipe's wheat-flour amount without adjusting other ingredients; the example is volume-based and product-specific.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S05",
      "url": "https://www.kingarthurbaking.com/blog/2017/03/20/baking-with-almond-flour",
      "title": "King Arthur Baking, Baking with almond flour",
      "accessedOn": "2026-10-12",
      "locator": "How to bake with almond flour; yeast-dough and non-yeast-treat guidance.",
      "supports": "For yeast dough, recommends adding up to 1/3 cup almond flour per cup of wheat flour; for non-yeasted treats, says to replace up to one quarter of total flour with almond flour. It notes that weight- and volume-based substitution differ in resulting volume. This is test-kitchen advice with dish-role limits, not a catalog-wide ratio.",
      "sourceKind": "test_kitchen"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "king-arthur-almond-flour-one-cup-96g-20261012",
      "relationship": "portion_weight",
      "value": 96,
      "valueUnit": "g",
      "foodDescription": "King Arthur Baking almond flour; the chart entry links to product SKU 310701.",
      "foodState": "Dry, finely ground almond flour made from blanched almonds according to the linked product description.",
      "measurementMethod": "The ingredient weight chart and the product's shortbread recipe each report 1 cup as 96 g. The chart does not state a cup capacity or filling method.",
      "quantityBasis": "Brand/test-kitchen and product-recipe portion only. The same product PDF's nutrition panel separately says 1/8 cup (16 g); do not resolve that conflict into a generic density, mapping, or default.",
      "sourceQuantity": {"amount": 1, "unit": "cup"},
      "observedMassG": 96,
      "evidenceKind": "published_portion",
      "sourceIds": [
        "WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S01",
        "WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S02"
      ]
    },
    {
      "observationId": "king-arthur-almond-flour-one-eighth-cup-16g-20261012",
      "relationship": "portion_weight",
      "value": 16,
      "valueUnit": "g",
      "foodDescription": "King Arthur Baking Almond Flour, SKU 310701, made from blanched almonds.",
      "foodState": "Dry, finely ground, blanched almond flour.",
      "measurementMethod": "Package nutrition panel declares a serving size of 1/8 cup (16 g); no leveling or filling method is given.",
      "quantityBasis": "One product-label serving. The same PDF's recipe gives 1 cup (96 g), so the two reported values are internally inconsistent when scaled. Do not promote either to a default.",
      "sourceQuantity": {"amount": 0.125, "unit": "cup"},
      "observedMassG": 16,
      "evidenceKind": "manufacturer_label",
      "sourceIds": ["WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S02"]
    },
    {
      "observationId": "bobs-red-mill-canada-almond-flour-two-tablespoons-14g-20261012",
      "relationship": "portion_weight",
      "value": 14,
      "valueUnit": "g",
      "foodDescription": "Bob's Red Mill Canada Farine d'amandes; finely ground blanched almonds.",
      "foodState": "Dry commercial almond flour made from blanched almonds.",
      "measurementMethod": "Canadian French product nutrition panel declares 2 c. à soupe (14 g); filling and leveling method are unstated.",
      "quantityBasis": "One brand-specific declared serving only. Do not scale it into a generic cup measure or density.",
      "sourceQuantity": {"amount": 2, "unit": "tbsp"},
      "observedMassG": 14,
      "evidenceKind": "manufacturer_label",
      "sourceIds": ["WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S03"]
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "almond-flour-no-reusable-substitution-rule-20261012",
      "researchState": "researched_no_supported_substitute",
      "fromIngredientRefId": "ingredient-ref-all-purpose-flour",
      "context": "Whether all-purpose flour can be partly replaced by almond flour under a source-neutral, non-yeasted-baking contextual catalog rule.",
      "basis": "King Arthur and Bob's Red Mill Canada both describe replacing about 25% of flour in baking, making a non-yeasted-baking rule a plausible candidate. King Arthur defines the denominator as total recipe flour for non-yeasted treats and says its guidance works by either weight or volume; Bob's statement instead names all-purpose flour and does not identify the amount basis or resolve recipes that contain multiple flours. Robin Hood recommends adding up to 25% almond flour to existing wheat-flour recipes without adjustment, not replacing that share, and King Arthur separately recommends adding almond flour to yeast dough. The catalog's almond-flour reference is unqualified and has no form that limits it to the finely ground blanched products represented by the converging guidance. It also cannot distinguish other grind, skin, or defatted variants. This overlap is therefore recorded as a lead, not an active reusable rule; current evidence does not define a consistent denominator, amount method, and product scope that the picker/resolver can enforce. The two bundled almond-flour lines request mass and contain no replacement instruction.",
      "limitations": [
        "Do not encode the King Arthur 25% non-yeasted-treatment guidance or its yeast-dough addition as a global rule.",
        "Do not treat Bob's Red Mill Canada's percentage as a weight/volume conversion or as an unambiguous denominator for recipes with multiple flours.",
        "Do not treat Robin Hood's product-specific add-in guidance as a wheat-flour replacement.",
        "A future contextual rule would need an enforceable non-yeasted-baking scope, a defined denominator and amount basis, and product/form scope consistent with the supported source products.",
        "This bounded review does not establish substitutions for almond meal, defatted almond flour, other nut flours, or non-baking roles."
      ],
      "replacements": [],
      "rejectedCandidates": [
        {
          "candidate": "All-purpose flour → almond flour: replace up to 25% for non-yeasted baking",
          "reason": "King Arthur and Bob's Red Mill Canada overlap on a 25% baking substitution, but the sources do not align on an enforceable denominator and weight/volume basis across recipes, and the current unqualified almond-flour reference cannot select the source products' blanched, fine-ground form.",
          "sourceIds": [
            "WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S03",
            "WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S04",
            "WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S05"
          ]
        }
      ],
      "sourceIds": [
        "WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S03",
        "WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S04",
        "WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S05"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Record only the King Arthur source-specific 1 cup (96 g) value, its package's separate 1/8 cup (16 g) nutrition serving, and Bob's Red Mill Canada's 2 tbsp (14 g) serving. Keep defaultDensity null and unitMappings empty because source methods are unspecified and the King Arthur product PDF conflicts internally. The Bob's Red Mill Canada and King Arthur guidance overlap on a 25% partial replacement for baking, but do not establish a denominator and amount basis that the current unqualified almond-flour identity can safely enforce as a contextual rule. Keep the catalog identity, aliases, forms, recipes, global substitutions, and contextual substitutions unchanged.",
      "sourceIds": [
        "WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S01",
        "WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S02",
        "WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S03",
        "WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S04",
        "WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S05"
      ]
    }
  ]
}
```

## Live ownership and package snapshot

Read-only snapshot of the shared worktree on 2026-10-12. Hashes fingerprint the exact bytes inspected; concurrent catalog work may change these values before integration.

| Surface | Current state | SHA-256 |
|---|---:|---|
| Active ingredient references | 1,300 rows | `e8017fbccef0477fa66b70f41300e44ae79082b1a55c51e3bf3d3418913c2b07` |
| Active ingredient forms | 98 rows | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Research-ledger records | 1,608 | `2041f91ec9e3a88361d2c85fdc5435d93ce236f19524c3420099178349191b77` |
| Legacy import candidates | 64 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The target reference is `ingredient-ref-almond-flour`, category `FLOUR_AND_STARCH`, displayed as `almond flour / farine d'amande`, with French aliases `poudre d'amande` and `poudre d'amandes`, no English aliases, null default density, and empty unit mappings. Its ledger record is identity-verified; measurement is `blocked_pending_evidence`, and substitution research is `not_yet_researched`. No exact ledger record ID for almond meal or defatted almond flour exists. The proposed source prefix and observation/finding IDs were absent from the shared ledger and archives before drafting.

Exact normalized ownership was checked across active reference names/aliases, form labels/match terms, legacy candidate names/aliases, and ledger record IDs:

| Phrase | Exact current owner | Decision |
|---|---|---|
| `almond flour` | `ingredient-ref-almond-flour` (`nameEn`) | Keep the existing identity. |
| `farine d'amande` | `ingredient-ref-almond-flour` (`nameFr`) | Keep the existing Québec French product display. |
| `poudre d'amande`, `poudre d'amandes` | `ingredient-ref-almond-flour` (`aliasesFr`) | Keep both accepted aliases unchanged. |
| `almond meal`, `almond powder`, `ground almonds`, `ground blanched almonds`, `defatted almond flour` | No exact active reference/form/legacy owner; no corresponding candidate ledger ID | Keep unassigned; this packet creates no alias or identity. |
| `ingredient-ref-almond-meal`, `ingredient-ref-defatted-almond-flour` | No active reference, form, legacy candidate, or ledger record | Do not reserve or create either ID here. |

The exact phrase `almond flour` statically resolves to one reference. Nearby picker queries, reconstructed from the current Kotlin search semantics (complete word-phrase match before substring fallback), return:

| Query | Current result |
|---|---|
| `almond flour` | `ingredient-ref-almond-flour` only |
| `farine d'amande`, `poudre d'amande`, `poudre d'amandes` | `ingredient-ref-almond-flour` only for each query |
| `almond meal`, `almond powder`, `ground almonds`, `ground blanched almonds`, `defatted almond flour` | No results |
| `almond` | Six: almond butter, almond extract, almond flour, almond beverage, almond paste, and almonds |
| `almonds` | `ingredient-ref-almonds` only; the former `ground almonds` collision is already removed |

This is a static reconstruction, not a runtime picker test. It confirms that this measurement follow-up does not require a new search term or change the existing almond/meal boundary.

## Bundled recipe demand

The current manifest lists **114 recipes and 1,123 ingredient rows**. The corpus fingerprint is SHA-256 over each manifest-ordered relative recipe path, a NUL byte, exact file bytes, and a trailing NUL byte: `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

Exactly two bundled ingredient rows link to `ingredient-ref-almond-flour`; both request mass directly, with no volume conversion or substitution direction:

| Recipe line | Current source text | Demand |
|---|---|---|
| Recipe 010, Linzer Cookies, `a1e9ba5d-be5c-447d-a368-3ae4954a0a07-ingredient-2` | `150 g almond flour` | 150 g; no cup measure. Original recipe: [Preppy Kitchen, Linzer Cookies](https://preppykitchen.com/linzer-cookies/). |
| Recipe 110, Almond Frangipane Mini Tarts, `b55e38ff-597e-441b-9a89-a4e06c07248a-ingredient-8` | `113 g almond flour` | 113 g; no cup measure. Original recipe: [Tablespoon, Almond Frangipane Mini Tarts](https://www.tblspoon.com/home/almond-frangipane-mini-tarts). |

No bundled row or recipe text requests almond meal, ground almonds, or defatted almond flour. The corpus confirms ingredient demand, but provides no volume-to-mass demand, substitution evidence, or reason to relink a recipe.

## Source interpretation and limits

- The King Arthur chart and SKU-linked product package both state 96 g per cup for a named almond-flour product. Its package nutrition panel separately reports 16 g per 1/8 cup. As written, the package values are inconsistent when scaled; retain them as separately quoted portions and do not choose a conversion from them. [S01–S02]
- Bob's Red Mill Canada's French page uses the product name `Farine d'amandes`, describes finely ground blanched almonds, declares 14 g per 2 tablespoons, and recommends generally replacing 25% of all-purpose flour in baking recipes. Its product/serving and substitution advice are Canadian French manufacturer evidence, not an OQLF terminology ruling or a generic fill method. The singular display `farine d'amande` is retained from the previous identity review, which cites Robin Hood Canada's French product name `Farine d’amande` (ledger source `WP02-ALMOND-FLOUR-MEAL-20261010-S05-FR`); Bob's plural product name does not require a display or alias change. [S03]
- King Arthur's chart lists almond meal separately at 84 g per cup. This corroborates that the source treats its meal and flour rows separately; it does not resolve the general market boundary previously reviewed, nor make almond meal a catalog alias. [S01]
- The Bob's Red Mill Canada and King Arthur sources overlap on replacing about 25% of flour for baking, but only King Arthur clearly scopes the replacement to non-yeasted treats and defines the denominator as total recipe flour; King Arthur says weight or volume can be used, while Bob's does not state the basis. Robin Hood's Canadian page instead recommends adding its product to existing wheat-flour recipes. The current unqualified almond-flour reference has no blanched/fine-ground form, so it cannot represent or enforce the product scope of the converging evidence. Record the overlap as a candidate for future research, but do not activate a global or contextual rule now. No rule is created for yeast dough, non-baking roles, other almond preparations, all almond-flour products, or substitutions between almond flour and another nut/pulse flour. [S03–S05]
- No source supports a generic density, active cup conversion, or recipe line substitution. Keep the runtime reference, forms, recipe links, substitutions, yields, and conversion tables unchanged.

## Source register

All sources were accessed on 2026-10-12. Proposal-local IDs below were checked for uniqueness against the current ledger and archive.

| ID | Source and bounded evidence | Limits |
|---|---|---|
| **WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S01** | King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart). Table rows `Almond Flour` (1 cup = 3 3/8 oz = 96 g) and `Almond meal` (1 cup = 3 oz = 84 g). | Test-kitchen chart; does not state the cup capacity or row-specific filling method. Treats the two labels as distinct rows. |
| **WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S02** | King Arthur Baking, [Almond Flour SKU 310701 package PDF](https://shop.kingarthurbaking.com/content/packaging/310701_4.pdf), page 2. Identifies blanched almonds, states the nutrition serving as 1/8 cup (16 g), gives a shortbread recipe quantity of 1 cup (96 g), and includes yeast/non-yeast use guidance. | One manufacturer's package; its serving and recipe values are internally inconsistent when scaled. It supplies no general filling or leveling method. |
| **WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S03** | Bob's Red Mill Canada, [Farine d'amandes](https://www.bobsredmill.ca/produit/almond-meal-flour). Current Canadian French product page describes finely ground blanched almonds, gives 2 c. à soupe (14 g), and says generally to replace 25% of all-purpose flour in baking recipes. | Product-specific nutrition serving and maker guidance; no filling method or weight/volume substitution basis. The 25% statement does not define the denominator for recipes with multiple flours. Supports Canadian French product wording, not an OQLF ruling. |
| **WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S04** | Robin Hood Canada, [Almond Flour](https://www.robinhood.ca/en/products/specialty-flours/almond). Describes its product as finely ground blanched almonds; its FAQ says it is not a 1:1 wheat-flour substitute and suggests adding up to one quarter of the recipe's wheat-flour amount. | Manufacturer's use advice for its own product; the example is volume-based and is an add-in, not a replacement rule. |
| **WP02-B2-ALMOND-FLOUR-MEASUREMENT-20261012-S05** | King Arthur Baking, [Baking with almond flour](https://www.kingarthurbaking.com/blog/2017/03/20/baking-with-almond-flour). Gives separate recommendations for yeast dough and non-yeasted treats, permits the 25% non-yeasted replacement by weight or volume, and notes the resulting volume differs by measure. | Test-kitchen guidance tied to baking role and its almond-flour product; it does not establish a rule for all products covered by the unqualified catalog identity. |

## Static validation plan if accepted

1. Confirm each proposal-local source, observation, and finding ID remains unique; validate the appended record against `docs/catalog/research-ledger.schema.json` and the bundled package validator.
2. Run `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` to validate the package and ledger without rewriting files.
3. Run `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` to confirm the unchanged active reference catalog still matches its generated Kotlin index.
4. Recheck the exact almond-flour and near-neighbor owners across references/forms/legacy/ledger and rescan the manifest-listed recipe rows; no recipe or active reference changes are expected.
5. Verify UTF-8 without BOM and `git diff --check` for only the accepted data/docs delta. No unit tests, Android tests, or emulator run are needed for a JSON-only database-data change under `AGENTS.md`.
