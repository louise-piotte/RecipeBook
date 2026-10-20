# WP05 — Calamansi juice and puree form review

- **Status:** Integrated as `ingredient-form-calamansi-juice` and `ingredient-form-calamansi-puree` under `ingredient-ref-calamansi`.
- **Reviewed:** 2026-10-18.
- **Decision:** Add separate 100% fruit juice and pure-fruit puree forms. Keep `calamansi` as the parent identity; do not add product spellings as base-fruit aliases.

## Decision and boundaries

The existing calamansi fruit identity had no forms, product spellings for `kalamansi`, or matching recipe ingredient lines. Canadian listings support both culinary juice and puree products. Mikuni Canada describes a 100% calamansi juice product, with no added ingredients; the listing showed it sold out when reviewed, so it establishes a product example, not current availability. Les vergers Boiron identifies a frozen Kalamansi puree made from 100% fruit and describes whole-fruit pressing. Québec distributor Gastronomia uses the product title `Purée de kalamansi sans sucre ajouté` and states that it contains only kalamansi.

Add `calamansi juice / jus de calamondin` as a fruit-juice form and `calamansi puree / purée de kalamansi` as a puree form. The puree's French label follows Gastronomia's Québec product wording. `Kalamansi` remains scoped to the puree form's product spelling; it is not an alias on the parent fruit. The Québec President's Choice 2023 French booklet uses `jus de calamondin` for a calamondin juice ingredient in a shrimp product, supporting local culinary wording. That dated booklet does not establish present availability or a universal product formula.

Keep sweetened ready-to-drink calamansi beverages, lemonade, and compounded concentrates distinct from the 100% fruit forms. Do not generalize Boiron's whole-fruit pressing method to all purees. No density, unit mapping, kitchen measure, conversion, yield, recipe link, or substitution is supported. Measurement and substitution research remain `not_yet_researched` for both forms.

The bundled corpus contains 114 recipes and 1,123 ingredient rows, with no calamansi or calamondin ingredient line. No recipe association was added.

## Ownership and source review

Before integration, no forms existed under `ingredient-ref-calamansi`, and no active reference or form owned `calamansi juice`, `jus de calamondin`, `calamansi puree`, or `purée de kalamansi`.

| ID | Source | Evidence and limits |
|---|---|---|
| **WP05-CALAMANSI-PREPS-R609-S01** | Les vergers Boiron, [Frozen puree without added sugar — Kalamansi](https://les-vergers-boiron.com/en/product/frozen-puree-without-added-sugar-les-vergers-boiron-kalamansi/). | Manufacturer identifies a frozen 100% Kalamansi puree and describes whole-fruit pressing. Its product method and Brix remain specific to this item; no kitchen measure is inferred. |
| **WP05-CALAMANSI-PREPS-R609-S02** | Gastronomia, [Purée de kalamansi sans sucre ajouté](https://gastronomia.ca/produit/puree-kalamansi-boiron/). | Québec product title, frozen product details, and 100% fruit/no-added-sugar declaration. The 1 kg package and 6 × 1 kg case remain product packaging, not measures. |
| **WP05-CALAMANSI-PREPS-R609-S03** | Mikuni Canada, [Calamansi Juice](https://www.mikuniwildharvest.ca/products/calamansi-juice-marugoto-shibori-750-ml-bottle). | Canadian listing identifies a 100% calamansi juice product and its single-ingredient declaration. The listing showed it sold out; its 750 mL package is not a kitchen measure. |
| **WP05-CALAMANSI-PREPS-R609-S04** | President's Choice, [Summer Insiders Booklet, French (May 2023)](https://downloads.ctfassets.net/puwhzcrt0wgo/2RCgb9rbAnhfvMHhH6teN4/1e7eb2819274209c4bafa0b2828f42d2/2023_SIR_Flipp_May-17-23_FR_5.pdf). | French Québec wording `jus de calamondin` in a calamondin feature and shrimp-product description. This dated promotional source does not establish current availability or a generic recipe formula. |

## Static checks

Exact form and source-ID ownership, recipe ingredient-line demand, ledger schema, seed-package normalization and validation, generated-index freshness, UTF-8/no-BOM, escaped-Unicode JSON, local links, and scoped whitespace checks passed. No app tests, builds, or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.
