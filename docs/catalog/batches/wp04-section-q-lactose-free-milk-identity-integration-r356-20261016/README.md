# WP04 Section Q R356 — lactose-free milk identity

## Integrated data

Added one identity-only `DAIRY_AND_ALTERNATIVE` reference:

- English display: `lactose-free milk`
- Québec French display: `lait sans lactose`
- Aliases, forms, density, and unit mappings: none

The French and English labels are CFIA’s modified common-name examples for milk with lactase. `Lactose-reduced milk / lait réduit en lactose` remains a separate claim and is not an alias. The new identity is not a form of whole milk: current products span fat classes, and attaching it under the existing whole-milk identity would overstate the fat class.

## Evidence and limits

- CFIA’s current [English dairy-labeling guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/dairy) and [French dairy-labeling guidance](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/produits-laitiers) say that when lactase is added to standardized milk, its common name must be modified. They give `lactose-free milk / lait sans lactose` and `lactose-reduced milk / lait réduit en lactose` as different examples.
- CFIA’s [English claims guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/composition-and-quality) and [French claims guidance](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/composition-qualite) distinguish no detectable lactose by an acceptable method from a reduced-lactose claim, for which the agency’s guidance uses a reduction of at least 25%.
- The GDT [sans lactose entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26580421/sans-lactose) pairs that phrase with `lactose-free`; it is phrase-level terminology evidence and is not presented as an OQLF definition of lactose-free milk.
- Current [Lactantia English](https://lactantia.ca/food_product/lactantia-lactose-free-2-milk/) and [French](https://lactantia.ca/fr/food_product/lait-lactantia-sans-lactose-2/) product pages show the bilingual product naming and several fat-content options. Their 2% ingredient statements are product-specific and are not applied to the generic identity.
- CFIA’s dairy guidance says unqualified milk refers to cow’s milk and other animal sources must be identified. The candidate therefore remains generic cow milk and does not cover goat, sheep, buffalo, or plant beverages.

No bundled line names lactose-free or lactose-reduced milk. No density, measures, conversions, recipe links, yields, or substitutions were added. Measurement and substitution research remain `not_yet_researched`.

## Picker projection and recipe demand

| Query | Result after R356 |
|---|---|
| `lactose-free milk`, `lactose free milk` | `ingredient-ref-lactose-free-milk` |
| `lait sans lactose`, `sans lactose` | `ingredient-ref-lactose-free-milk` |
| `lactose-reduced milk`, `lait réduit en lactose` | No result from the new identity |
| `milk` | 11 results, including the new labeled identity (10 before R356) |
| `lait` | 13 results, including the new labeled identity (12 before R356) |
| `2% milk`, `lait 2%` | No result; the ordinary-milk fat-class question remains unresolved |
| `whole milk`, `skim milk` | Existing whole-milk and skim-milk identities; no lactose-free match |
| `milk powder`, `poudre de lait` | Existing three English and two French results, unchanged |

The bundle contains 114 recipes and 1,123 ingredient rows. Scans for lactose-free and lactose-reduced wording in English and French found no matching ingredient line.

## Validation

- Bundled seed-package normalization and validation passed; the package now contains 1,693 references and 139 forms.
- The generated `BundledIngredientCatalog.kt` index is current at 1,693 references; ingredient-reference normalization is current.
- Research-ledger schema and source-reference validation passed; the ledger now has 2,049 records with zero validation errors.
- Static picker projection, recipe-corpus scan, UTF-8/no-BOM, local-link, and whitespace checks passed.
- No software tests, build, emulator check, or deployment was run because this change only adds database JSON data under the updated `AGENTS.md` rule.
