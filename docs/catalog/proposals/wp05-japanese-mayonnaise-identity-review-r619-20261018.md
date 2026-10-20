# WP05 — Japanese mayonnaise identity (R619)

- **Status:** Accepted as an identity-only Japanese mayonnaise style.
- **Reviewed:** 2026-10-18.
- **Decision:** Add `Japanese mayonnaise / mayonnaise japonaise` as `ingredient-ref-japanese-mayonnaise` in `SAUCE_AND_CONDIMENT`.
- **Scope:** Resolve the prior hold using Québec product and culinary wording. Keep this style separate from generic mayonnaise without assigning one formula or brand.

## Evidence and limits

| ID | Source | Evidence and limits |
|---|---|---|
| **WP05-JAPANESE-MAYO-R619-S01** | Costco Canada Business Centre, [Kewpie mayonnaise à la japonaise](https://www.costcobusinesscentre.ca/p/-/kewpie-japanese-style-kewpie-mayonnaise-710-ml/4201055055?langId=-25). | Québec-facing French retail title uses `mayonnaise à la japonaise`. The Kewpie product and its 710 mL package remain SKU-specific; no measure or formula is generalized. |
| **WP05-JAPANESE-MAYO-R619-S02** | Cuisinez!, Télé-Québec, [Mayonnaise japonaise maison (type Kewpie)](https://cuisinez.telequebec.tv/recettes/5920/mayonnaise-japonaise-maison-type-kewpie). | Québec recipe title uses `mayonnaise japonaise` and marks the recipe as Kewpie-style. Its egg-yolk, rice-vinegar, oil, and mustard recipe is not treated as a universal formula. |
| **WP05-JAPANESE-MAYO-R619-S03** | Kewpie USA, [Kewpie Mayonnaise product page and FAQ](https://www.kewpieshop.com/products/kewpie-mayonnaise). | The manufacturer calls Japanese mayonnaise “Japanese-style mayonnaise” and describes its own U.S. product as egg-yolk mayonnaise with a proprietary vinegar and spice blend. These are brand-specific details, not a fixed catalog formula. |

Québec retail and culinary sources now establish the style and French wording that were missing from the earlier review. The identity is `Japanese mayonnaise / mayonnaise japonaise`; English aliases are `Japanese-style mayonnaise`, `Japanese mayo`, and `Japanese-style mayo`, with French alias `mayonnaise à la japonaise`. Do not add `Kewpie` as an alias, require egg yolks only, or encode a vinegar blend as a universal ingredient rule. Preserve the existing generic mayonnaise reference and its recipe link.

The 114 bundled recipes (1,123 ingredient rows) contain no Japanese-mayonnaise line. Generic `mayonnaise` and `mayo` queries return the existing generic mayonnaise and the new style; exact `Japanese mayonnaise` and `mayonnaise japonaise` queries resolve to the new identity. No forms, density, unit mappings, measurements, recipe links, conversions, yields, or substitutions were added.

## Static checks

The three source IDs and URLs are unique in the research ledger. Seed-package and ledger validation, generated-index freshness, alias ownership and picker-impact checks, recipe-corpus scan, UTF-8/no-BOM, local-link, and scoped whitespace checks passed. No software tests, builds, or emulator checks were run under the database-JSON no-testing rule in `AGENTS.md`.
