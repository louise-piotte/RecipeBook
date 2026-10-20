# WP05 — Suka Pinakurat product identity review

- **Status:** Integrated as identity-only reference `ingredient-ref-suka-pinakurat`.
- **Reviewed:** 2026-10-18.
- **Decision:** Add product-specific `Suka Pinakurat spiced coconut vinegar / vinaigre de noix de coco épicé Suka Pinakurat` to `SAUCE_AND_CONDIMENT`.
- **Scope:** The named Filipino product made from fermented coconut sap vinegar with chiles and spices. This is not a general identity for every Filipino spiced vinegar.

## Decision and boundaries

The brand owner's FAQ says Suka Pinakurat is a brand name for a blended spiced coconut-sap vinegar. It describes fermented coconut sap and bird's-eye chiles as key ingredients, with garlic, onion, ginger, and sweet peppers among the other spices. The owner explicitly distinguishes the branded product from the broader spiced-vinegar family and identifies different regional names, including Sinamak. A Canadian distributor lists `Pinakurat Spiced Vinegar` and describes it as coconut vinegar infused with chile and spices. A Canadian retail delivery menu also lists `Pinakurat Spiced Vinegar` and identifies its coconut-sap base.

This supports a product-specific identity because the named product has a distinct, source-described composition and behavior from plain coconut vinegar. It does not support a generic `spiced vinegar` identity or aliases shared with Sinamak. Keep the displayed English name and exact product-title alias scoped to Suka Pinakurat. The French display is descriptive, assembled from the existing French coconut-vinegar wording and the named product; it is not presented as an OQLF-preferred term and remains pending independent Québec terminology review.

No matching ingredient row occurs in the 114 bundled recipes (1,123 ingredient rows). Add no forms, density, unit mappings, measurements, conversions, yields, recipe links, or substitutions. Measurement and substitution research remain `not_yet_researched`.

## Ownership and source review

Before integration, no active reference, form, or ledger identity owned `Suka Pinakurat`, `Sukang Pinakurat`, or `Pinakurat spiced vinegar`.

| ID | Source | Evidence and limits |
|---|---|---|
| **WP05-SUKA-PINAKURAT-R610-S01** | Green Gold Gourmet, [Suka Pinakurat FAQ](https://web.sukapinakurat.com/faq/). | Brand owner identifies Suka Pinakurat as a named blended spiced coconut-sap vinegar, describes its ingredient family, and explicitly distinguishes the brand from generic spiced vinegar and Sinamak. It is product-specific evidence, not a standard formula for all regional spiced vinegars. |
| **WP05-SUKA-PINAKURAT-R610-S02** | WOW Food Distributor, [Pinakurat Spiced Vinegar](https://www.wowfooddistributor.com/products/suka-pinakurat-250ml). | Distributor product title and description identify coconut vinegar infused with chile and spices, and use the product as a dipping condiment or marinade. Listed case/package information is not a kitchen measure. |
| **WP05-SUKA-PINAKURAT-R610-S03** | Skip Canada, [Pinoy Meaty Mart](https://www.skipthedishes.com/fr/pinoy-meaty-mart). | Canadian retail menu lists `Pinakurat Spiced Vinegar` and describes it as a vinegar made from fermented coconut sap from Iligan City. The menu is French-language site chrome but the product title remains English; no French product name is claimed. |

## Static checks

Exact identity ownership, R610 source-ID uniqueness, recipe ingredient-line demand, ledger schema, seed-package normalization and validation, generated-index freshness, UTF-8/no-BOM, escaped-Unicode JSON, local links, and scoped whitespace checks passed. No app tests, builds, or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.


**Search follow-up:** R613 adds the generic Filipino `suka` alias to `vinegar / vinaigre`, so the broad `suka` query returns both generic vinegar and this separate Suka Pinakurat product. See the [R613 review](wp05-suka-generic-vinegar-alias-review-r613-20261018.md).
