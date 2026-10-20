# WP05 Section T — Spice-blend identity integration

**Date:** 2026-10-11

**Scope:** Complete the named South Asian and regional spice-blend checklist rows through identity-only additions and source verification.

## Integrated data

- Added eight identity-only references: `jerk seasoning`, `Cajun seasoning`, `Creole seasoning`, `adobo seasoning`, `shichimi togarashi`, `furikake`, `sambar powder`, and `rasam powder`.
- Added the source-supported French search alias `poudre de curry` to the existing `ingredient-ref-curry-powder`; kept `poudre de cari` as its display.
- Verified the existing `ingredient-ref-herbes-de-provence` identity and recorded three sources. Recipe 105 already links its exact “Herbes de Provence” line to that reference; the link and recipe remain unchanged.
- Kept generic sazón on hold pending independent regional or institutional evidence for a stable product identity. The WP06 Spanish-speaking Caribbean review supports keeping the product family unresolved.
- Added no forms, fixed blend formulas, densities, unit mappings, package yields, conversions, substitutions, or new recipe links.

## Identity boundaries

Jerk seasoning applies to dry products explicitly sold as seasoning and remains separate from jerk paste and sauces. Cajun and Creole remain separate even when products have similar ingredient profiles. Dry adobo seasoning remains separate from adobo sauces and pastes, Filipino dishes, and chipotles in adobo. Shichimi and furikake remain separate from one another, their component ingredients, and generic rice seasoning. Sambar and rasam powders remain separate from each other, pastes, prepared mixes, curry powder, and other named masalas. Product-specific ingredient lists, heat levels, moisture states, and allergens are not generalized.

Previously integrated identities remain covered by their earlier reviews: Chinese five-spice, garam masala, chaat masala, panch phoron, berbere, mitmita, za’atar, ras el hanout, baharat, dukkah, and Montreal steak spice. This batch does not change their catalog data.

## Review packets

- [Curry powder identity review](../../proposals/wp05-curry-powder-identity-review-20261011.md)
- [Sambar and rasam powder review](../../proposals/wp05-sambar-rasam-powder-identity-boundary-review-20261011.md)
- [Shichimi and furikake review](../../proposals/wp05-shichimi-furikake-identity-boundary-review-20261011.md)
- [Jerk, Cajun, Creole, and adobo review](../../proposals/wp05-section-t-jerk-cajun-creole-adobo-seasonings-review-20261011.md)
- [Herbes de Provence review](../../proposals/wp05-herbes-de-provence-identity-review-20261011.md)
- [WP06 Spanish-speaking Caribbean sweep and sazón hold](../../proposals/wp06-caribbean-spanish-cuisine-gap-sweep-20261011.md)

## Data snapshot and verification

After package normalization, the package contains **1,050 ingredient references**, **72 forms**, **75 legacy candidates**, and **114 manifest-listed recipes / 1,123 ingredient rows**. The research ledger contains **1,342 records**, **4,442 source entries**, and **3,669 distinct source IDs**.

Reference and ledger schemas, bundle structure, generated-index freshness, collision scope, recipe references, UTF-8/no-BOM encoding, and whitespace were checked. No tests or emulator run was needed because the work only adds or verifies database JSON data and updates its tracking documentation.

**Encoding:** UTF-8 without BOM.
