# WP03 fine and medium bulgur grind forms

## Batch record

- **Integrated:** 2026-10-10
- **Scope:** Distinguish source-supported fine and medium bulgur grind classes under the existing `ingredient-ref-bulgur` identity.
- **Package result:** Added `ingredient-form-bulgur-fine-grind` / *boulgour fin* and `ingredient-form-bulgur-medium-grind` / *boulgour moyen*.
- **No recipe edits:** The 114 bundled recipes contain no bulgur or boulgour ingredient lines.

## Identity and naming decisions

Bob's Red Mill describes fine, medium, coarse, and very coarse bulgur as different grain-size classes with different cooking times and example uses. Its Red Bulgur product is specifically medium grind (#2), but that numeric grade is manufacturer-specific. Québec recipe sources use *boulgour fin* (RICARDO) and *boulgour brun moyen* (Metro). The catalog exposes only the source-supported fine and medium forms for now. Coarse and very coarse remain open pending Québec French label review.

The existing broad identity stays `bulgur / boulgour`. No alias is added for `bulghur`, `bulghur wheat`, `boulghour`, brand grade `#2`, red/brown color descriptors, or *blé concassé*. In particular, the parenthetical *blé concassé* on the RICARDO recipe is not treated as a catalog synonym because bulgur remains distinct from unprocessed cracked wheat.

## Measurement and substitution decisions

RICARDO lists 180 g (1 cup) of fine bulgur in one recipe. The ledger records that as a published recipe portion, not a standardized bulk-density measurement: the cup volume convention and packing method are unstated. Metro gives a volume-only amount for medium bulgur. Neither source supports an active `densityGPerMl`, unit mapping, conversion, or cooking-yield value.

Bob's Red Mill broadly suggests bulgur as an alternative to other grains and sides, but does not provide a dish role, cooking method, or replacement ratio. The ledger leaves this unresolved for contextual substitution and adds no active rule.

## Sources

- [Bob's Red Mill, “What Is the Best Way to Cook Bulgur?”](https://www.bobsredmill.com/articles/what-is-the-best-way-to-cook-bulgur) — four grind classes, use examples, and broad substitution claims.
- [Bob's Red Mill, Red Bulgur](https://www.bobsredmill.com/product/bulgur) — manufacturer-specific medium grind (#2) product.
- [RICARDO, Taboulé (salade de persil)](https://www.ricardocuisine.com/recettes/2011-taboule-salade-de-persil) — Québec term *boulgour fin* and one published recipe portion.
- [Metro, Taboulé de boulgour Libanais](https://www.metro.ca/recettes-et-occasions/recettes/taboule-de-boulgour-libanais) — Québec term *boulgour brun moyen* and volume-only recipe amount.

Ledger source IDs: `WP03-BULGUR-GRIND-20261010-S01` through `S04`.

## Package state and verification

After integration the package contains 821 ingredient references, 42 ingredient forms, and 114 recipes. The ledger contains 1,056 records and 1,848 distinct source IDs. The seed-package normalizer check, validation-only check, and ingredient-reference normalization check pass. Unit and instrumentation tests plus Pixel 9a picker verification are recorded below after the batch test/deploy pass.
