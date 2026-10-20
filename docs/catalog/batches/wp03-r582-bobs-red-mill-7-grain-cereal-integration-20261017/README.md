# WP03 Section F R582 — Bob's Red Mill 7 Grain Hot Cereal

Date: 2026-10-17

## Decision

Add identity-only `Bob's Red Mill 7 Grain Hot Cereal / Céréales chaudes à 7 grains (Bob's Red Mill)` as a brand-specific `GRAIN_AND_CEREAL` reference. Keep it separate from Red River's 7 Grain Hot Cereal, Bob's Red Mill's 5, 8, and 10 Grain products, and the component grains.

The Canadian manufacturer page heading repeats “chaudes,” but its product body uses the singular French phrase `céréale chaude à 7 grains`. The catalog uses the corrected plural category wording in the brand-qualified display and retains the source-attested singular phrase as a French search alias. It does not activate the ambiguous English short phrase `7 Grain Cereal` or generic terms such as `hot cereal`, `céréales chaudes`, `gruau`, or `grits`.

## Integrated data

- Added `ingredient-ref-bobs-red-mill-7-grain-hot-cereal`, with no English aliases and the singular French alias `Céréale chaude à 7 grains`.
- Recorded the manufacturer label portion **1/4 cup (43 g)** as a product-specific `portion_weight` observation. The manufacturer pages do not specify a cup convention, so the ledger leaves it unspecified. It is not a reusable cup conversion or density.
- Recorded that the manufacturer's oatmeal-alternative and corn-free-grits statements do not support a reusable replacement rule. No active substitution was added.
- Added no form, active measure, density, unit mapping, cooking yield, conversion, package yield, recipe link, or ingredient-component alias.
- The preparation page gives product-specific cereal-and-water amounts, but no final cooked mass or volume. Those directions were not generalized into a cooking yield.
- The 2026 product list and iHerb package listing were not needed for the accepted identity or portion and were not added as ledger sources; no item-code crosswalk or package-size measure was created.

## Evidence

- Bob's Red Mill Canada, [Céréales chaudes à 7 grains](https://www.bobsredmill.ca/produit/cereales-chaudes-chaudes-a-7-grains): the page body gives the singular French wording, 1/4 cup (43 g), and the product's eight listed ingredients. The duplicated word in the heading is excluded from the catalog name.
- Bob's Red Mill, [7 Grain Hot Cereal](https://www.bobsredmill.com/product/7-grain-hot-cereal): confirms the English title, eight listed ingredients, and the same 1/4 cup (43 g) label portion.
- Bob's Red Mill, [Basic Preparation Instructions for 7 Grain Cereal](https://www.bobsredmill.com/recipes/how-to-make/basic-preparation-instructions-for-7-grain-cereal): gives preparation directions for this product but no final cooked mass or volume.

The product page lists eight ingredients, including both whole oats and oat bran as well as flaxseed. The catalog preserves the maker's product name and does not infer a universal seven-grain formula or ingredient proportions.

## Static checks

- The live package now contains **1,807 active references**, **154 forms**, and **56 legacy-import identities**. The research ledger has **2,177 records**.
- Static phrase-first picker projection: brand-qualified English and French searches each return one result; `7 grain hot cereal` and `7 grains` each return the two separately branded products; `7 grain cereal` still returns only Red River. Broad `hot cereal` / `céréales chaudes` return 13 / 9 results, and `cereal` / `céréales` return 70 / 66.
- The bundle scan covered **114 manifest-listed recipes** and **1,123 structured ingredient rows**. No file, row, or direct reference link matched the new product.
- Bundled seed normalization completed with zero other part changes. Package validation, generated-index freshness, ledger schema/source ownership, UTF-8/no-BOM and escaped-Unicode checks, local links, and scoped whitespace checks passed.
- No app tests, build, emulator run, or deployment were run for this database-JSON-only addition under `AGENTS.md`.

See the [R582 proposal](../../proposals/wp03-section-f-next-gap-review-r582-20261017.md), the [open Section F cereal-mix checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L4523), and the existing Bob's Red Mill [10 Grain integration](../wp03-section-f-bobs-red-mill-10-grain-hot-cereal-integration-20261014/README.md).
