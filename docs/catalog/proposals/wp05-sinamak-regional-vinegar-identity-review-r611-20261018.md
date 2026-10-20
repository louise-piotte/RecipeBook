# WP05 — Sinamak regional vinegar identity review

- **Status:** Integrated as identity-only reference `ingredient-ref-sinamak`.
- **Reviewed:** 2026-10-18.
- **Decision:** Add `sinamak / sinamak` as a borrowed regional name for Filipino spiced vinegar, with no aliases.
- **Scope:** Keep source-specific vinegar bases and formulas separate. Do not use the identity as a synonym for all spiced vinegars or as a substitute for the branded Suka Pinakurat product.

## Decision and boundaries

Philippine Department of Agriculture material describes sinamak as a spiced vinegar-based dipping sauce and documents a local coconut-vinegar example. The Philippine FDA separately registers a MARCA PIÑA product titled `SPICED CANE VINEGAR (SINAMAK)`. Mama Sita’s manufacturer describes its own Sinamak as a coconut-based spiced vinegar, while IFEX Connect lists Canada among that product’s major export markets. Together these sources support a narrow regional condiment identity while showing that a single vinegar base or recipe must not be inferred.

The canonical borrowed name is retained in both locale fields. No generic `spiced vinegar`, `coconut vinegar`, or `cane vinegar` alias is added. Keep the named Suka Pinakurat product separate. The four source records document distinct evidence and product boundaries; package volumes and product-specific formulations are not reusable measures or universal definitions.

No matching Sinamak ingredient line occurs in the 114 bundled recipes (1,123 ingredient rows). Add no forms, density, unit mappings, measurements, conversions, yields, recipe links, or substitutions. Measurement and substitution research remain `not_yet_researched`.

## Ownership and source review

Before integration, no active ingredient reference, form, or recipe line owned `Sinamak`. The existing Suka Pinakurat product record mentions Sinamak only as a separate regional condiment name.

| ID | Source | Evidence and limits |
|---|---|---|
| **WP05-SINAMAK-R611-S01** | Philippine Department of Agriculture, KADIWA, [Honoring Lola Emak: Sinamak Food Processing and Production](https://kadiwa.da.gov.ph/index.php/honoring-lola-emak-sinamak-food-processing-and-production/). | Calls sinamak a vinegar-based dipping sauce and describes a Canlaon City coconut-vinegar example. It does not define one universal formula. |
| **WP05-SINAMAK-R611-S02** | Philippine Food and Drug Administration, [MARCA PIÑA Spiced Cane Vinegar (Sinamak) registration](https://verification.fda.gov.ph/food_products_2view.php?ACCOUNTCODE=4000014427703&export=pdf). | Product title establishes a cane-vinegar example carrying the Sinamak name; it does not define the full regional family. |
| **WP05-SINAMAK-R611-S03** | Mama Sita’s, [Mama Sita’s Sinamak](https://mamasitas.com/product/mama-sitas-sinamak/). | Manufacturer product title and description identify a spiced coconut-palm-flower-sheath vinegar. Formula remains brand-specific. |
| **WP05-SINAMAK-R611-S04** | IFEX Connect, [Mama Sita’s Sinamak (Spiced Vinegar)](https://www.ifexconnect.com/product-catalog/marigold-manufacturing-corporation/mama-sitas-sinamak-spiced-vinegar). | Product profile identifies fermented coconut nectar and lists Canada as a major export market; this is not evidence of current Canadian retail availability. |

## Static checks

Exact identity ownership, R611 source-ID and URL uniqueness, recipe-corpus demand, ledger schema, seed-package normalization and validation, generated-index freshness, UTF-8/no-BOM, local links, and scoped whitespace checks were reviewed. No app tests, builds, or emulator checks were run for this database-JSON catalog addition.
