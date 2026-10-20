# WP02 Section A7 R631 — Scottish-oatmeal portion

**Status:** Integrated on 2026-10-18. This is a database-JSON-only evidence update.

## Accepted change

The existing `ingredient-ref-scottish-oatmeal` ledger row now records one product-specific manufacturer-label portion: Bob’s Red Mill Scottish Oatmeal, 1/4 cup (36 g). The English and Canadian French pages show the same label, so they are one observation supported in both languages, not independent measurements. The sources do not state a cup convention or fill method.

- Refreshed the existing S02 and S03 Bob’s Red Mill source entries with current serving-size locators.
- Set the ledger row’s measurement state to `researched_supported` and appended observation `scottish-oatmeal-bobs-red-mill-quarter-cup-36-g-r631-20261018`.
- Kept density null, unit mappings empty, and substitution research `not_yet_researched`.
- Changed no active reference, alias, form, recipe, conversion, yield, or runtime rule. The recipe scan found no Scottish-oatmeal demand.

## Source review

- [Bob’s Red Mill, Scottish Oatmeal](https://www.bobsredmill.com/product/scottish-oatmeal) lists 1/4 cup (36 g) and whole-grain oats.
- [Bob’s Red Mill Canada, Gruau écossais](https://www.bobsredmill.ca/produit/gruau-ecossais) lists 1/4 tasse (36 g) for the same product.

## Validation

- Bundled seed package validation and generated catalog freshness passed after R632 integration: 1,828 references and 158 forms.
- The ledger schema and custom checks passed with 2,199 records.
- No app tests or emulator checks were run because this batch only adds evidence to database JSON under `AGENTS.md`.

Section A7 remains open for other grain-meal and milling-product boundaries.
