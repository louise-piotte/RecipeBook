# WP02/WP03/WP04 R183 gap-review integration

**Integrated:** 2026-10-16

**Plan:** [Global ingredient catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)

**Reviewed proposals:** [avocado-seed flour](../../proposals/wp02-b2-avocado-seed-flour-canadian-quebec-product-boundary-hold-r183-20261016.md), [Corn Pops cereal](../../proposals/wp03-section-f-corn-pops-cereal-identity-review-r183-20261016.md), and [canned cocktail shrimp](../../proposals/wp04-section-p-canned-cocktail-shrimp-product-boundary-review-r183-20261016.md).

## Integrated decisions

- **WP02 B2 — avocado-seed flour:** Held outside active references and the ledger pending a current Canadian culinary seed-flour product and a product-matched Québec French name. Research flour preparations vary by pretreatment and drying; current Canadian avocado-powder listings do not identify seed flour. Keep avocado fruit powder, extracted seed starch, and avocado oil separate. No bundled recipe demand was found.
- **WP03 Section F — Corn Pops:** Added identity-only `Corn Pops Cereal / Céréales Corn Pops` as a named Canadian ready-to-eat cereal, separate from corn flakes, corn bran, cornmeal, and other cereals. Aliases remain empty. The Provigo 1 cup (32 g) nutrition panel is recorded only as a SKU-specific portion observation; it is not an active measure or conversion. No bundled recipe demand was found.
- **WP04 Section P — canned cocktail shrimp:** Added identity-only `canned cocktail shrimp / crevettes cocktail en conserve` as a species-neutral canned-seafood market group. Keep it separate from raw/frozen, species-specific, dried, formed, fermented, and sauce-based shrimp products. The Clover Leaf 1/2 can drained (55 g) label basis is recorded only as a product-specific portion observation. No bundled recipe demand was found.

No forms, aliases, active measures, density, mappings, conversions, cooking yields, recipe links, or substitutions were added. The CFIA Volume 3 URL already appears on the scallop ledger record for Sections 10–11; R183 records the distinct Section 14 shrimp-cocktail evidence under a separate source ID and locator.

Totals: **1,561 references**, **122 forms**, **1,906 ledger records / 8,180 source entries / 6,990 distinct source IDs / 5,785 distinct source URLs**; **114 recipes / 1,123 ingredient rows**.

## Static validation

- Bundled seed normalization, reference normalization, ledger/schema/source validation, and generated catalog freshness passed.
- Static picker projection returned the new bilingual product names for their exact searches; `shrimp cocktail`, `cocktail de crevettes`, `canned shrimp`, and `crevettes en conserve` remained unmatched.
- A manifest-ordered scan parsed all 114 recipe files and 1,123 ingredient rows and found no matching candidate terms.
- Checked source IDs and URLs, JSON structure, explicit Unicode escaping, UTF-8/no BOM, local Markdown links, and whitespace.
- No software tests, builds, or emulator checks were run because the only database changes add data to database JSON files, as directed in `AGENTS.md`.

Broader WP02 B2/B3, Section F, and Section P coverage remains open.
