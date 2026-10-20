# WP05 Section X — Peanut sauce identity review

- **Status:** Integrated as identity-only reference `ingredient-ref-peanut-sauce`.
- **Reviewed:** 2026-10-18.
- **Decision:** Add `peanut sauce / sauce aux arachides` to `SAUCE_AND_CONDIMENT`, with no aliases or numeric behavior.
- **Scope:** Prepared sauces marketed as peanut sauce or peanut dipping sauce. Product formulas, regional variants, and named styles remain source-specific.

## Decision and boundaries

The reviewed Canadian product evidence supports a broad prepared-sauce identity. San-J names a Thai Peanut Sauce and describes marinade, cooking-sauce, and spring-roll dipping uses. Canadian distributor Satau lists that product in a 6 × 296 mL case with UPC 075810140260, and Metro's French listing uses `sauce aux arachides à la thaï` for the same UPC and 296 mL product. The San-J manufacturer page separately lists a 10 fl oz item with UPC 075810-140253; do not treat those UPCs or package sizes as interchangeable.

A Canadian Street Kitchen spring-roll kit lists peanut dipping sauce as one component. Its 145 g is the whole kit weight, not a standalone sauce size. These examples support the searchable prepared-sauce identity but do not establish a shared recipe, formula, texture, regional style, or package measure.

Keep peanut sauce separate from `satay sauce / sauce satay`: local satay products can contain peanuts or be explicitly peanut-free, and the names do not establish equivalent ingredients. The 114 bundled recipes (1,123 ingredient rows) contain no matching premade peanut-sauce line. Recipe 095 is a satay dish whose sauce is made from listed components; it does not call for premade peanut sauce.

The reference uses the French display `sauce aux arachides`, supported by the Québec Metro product title's more specific phrase. No aliases are needed. Add no forms, density, unit mappings, measurements, recipe links, conversions, yields, or substitutions. Measurement and substitution research remain `not_yet_researched`.

## Ownership and source review

Before integration, no active reference, form, or ledger identity owned `peanut sauce` or `sauce aux arachides`. Existing `ingredient-ref-satay-sauce` remains separate and has no such aliases. No recipe ingredient line matched.

| ID | Source | Evidence and limits |
|---|---|---|
| **WP05-PEANUT-SAUCE-R608-S01** | San-J, [Thai Peanut Sauce](https://san-j.com/product/thai-peanut-sauce/). | Manufacturer names the prepared sauce, describes marinade, cooking-sauce, and spring-roll dipping uses, and lists a 10 fl oz product with UPC 075810-140253. Product formulation and package details remain specific to this manufacturer listing. |
| **WP05-PEANUT-SAUCE-R608-S02** | Satau, [San-J product portfolio](https://satau.ca/en/our-products/san-j/). | Canadian distributor lists Thai Peanut Sauce in a 6 × 296 mL case with UPC 075810140260 and serves the Québec/Ottawa/Maritimes region. The case pack is not a household measure. |
| **WP05-PEANUT-SAUCE-R608-S03** | Metro, [Sauce aux arachides à la thaï San-J](https://api2.metro.ca/epicerie-en-ligne/allees/garde-manger/condiments-et-garnitures/condiments-internationaux/sauce-aux-arachides-a-la-thai/p/075810140260). | French product title, 296 mL package, product number 075810140260, description, and ingredients. It matches the distributor-listed Canadian item by UPC. Product-specific ingredients are not generalized. |
| **WP05-PEANUT-SAUCE-R608-S04** | Walmart Canada, [Street Kitchen Vietnamese Spring Roll Kit with Peanut Sauce](https://www.walmart.ca/fr/ip/Street-Kitchen-Kit-de-Rouleaux-de-Printemps-Vietnamiens-avec-Sauce-aux-Arachides-145-g-Stable-Temp-rature-Ambiante/1USI39TLQ5J1). | French listing identifies a spring-roll kit with a peanut dipping-sauce component. The 145 g belongs to the full kit; no standalone sauce SKU or shared formula is established. |

## Static checks

Exact identity ownership, recipe ingredient-line demand, R608 source-ID uniqueness, ledger schema, seed-package normalization and validation, generated-index freshness, Unicode escaping, UTF-8/no-BOM, local links, and scoped whitespace checks passed. No app tests, builds, or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.
