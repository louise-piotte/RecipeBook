# WP02/WP03/WP04 R180 gap-review integration

**Integrated:** 2026-10-16

**Plan:** [Global ingredient catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)

**Reviewed proposals:** [Maya nut flour](../../proposals/wp02-b2-maya-nut-seed-flour-canada-quebec-boundary-hold-r180-20261016.md), [Multi-Grain Cheerios](../../proposals/wp03-section-f-multi-grain-cheerios-identity-review-r180-20261016.md), and [smoked herring fillets in oil](../../proposals/wp04-section-p-smoked-herring-fillets-in-oil-boundary-review-r180-20261016.md).

## Integrated decisions

- **WP02 B2 — Maya nut/ramón seed flour:** Held the flour and its aliases outside active references and the ledger. Canadian-facing evidence located a roasted beverage powder, while the flour listing is US-branded and out of stock; no product-matched Québec French flour name was established. The bundled corpus has no candidate demand.
- **WP03 Section F — Multi-Grain Cheerios:** Added identity-only `Multi-Grain Cheerios / céréales multigrains Cheerios` as `GRAIN_AND_CEREAL`. Kept aliases empty and recorded the manufacturer's 1 cup (30 g) nutrition serving only as a product-specific ledger observation. The conflicting three-versus-five-grain claims remain unencoded. The cereal stays separate from loose multigrain flakes and other ready-to-eat cereal products.
- **WP04 Section P — smoked herring fillets in oil:** Added identity-only `smoked herring fillets in oil / filets de hareng fumés à l’huile` as `PROTEIN`, with empty aliases. The manufacturer’s species and ingredient percentages and the retailer’s package size remain specific to that product. The new group stays separate from herring species, tomato-sauce herring, kippers, and other smoked fish.

All three reviews found no matching demand in the manifest-listed **114 recipes / 1,123 ingredient rows**. No forms, active measures, density, unit mappings, recipe links, conversions, yields, or substitutions were added.

At this integration point, searching the bare brand phrase `Cheerios` returns the new Multi-Grain product as the sole exact phrase result because no other Cheerios identity is catalogued. The reference has no brand-only alias; any later Cheerios product additions should keep the brand query multi-result.

## Source registration

- Added the two Cheerios manufacturer pages and the Metro Québec listing. The manufacturer lists 1 cup (30 g); Metro's five-grain copy conflicts with the manufacturer's three-grain claim and is used only for local market wording.
- Added the corrected Rügen Fisch manufacturer URL (`buecklingsfilets-in-feinem-pflanzenoel-und-eigenem-saft`) and the Adonis and Dutch Groceries listings for the oil-packed smoked fillets. The manufacturer's source page is indexed, but direct retrieval timed out during review.
- No Maya nut/ramón flour ledger record was added. Existing or proposal-local sources remain with their prior owners.

## Static data validation

- Bundled seed-package validation, ingredient-reference normalization, and generated Kotlin catalog freshness passed.
- Reference and ledger JSON parsing/schema, source ID and URL ownership, sorted IDs, UTF-8 without BOM, and escaped-Unicode checks passed.
- Picker projection, manifest corpus scan, local Markdown links, and scoped whitespace checks passed.
- Totals: **1,558 references**, **122 forms**, **1,903 ledger records / 8,164 source entries / 6,975 distinct source IDs / 5,771 distinct source URLs**; **114 recipes / 1,123 ingredient rows**.
- No software tests, builds, emulator runs, or deployments were performed. The catalog changes add database JSON data under the updated `AGENTS.md` rule.

Broader WP02 B2/B3, Section F, and Section P coverage remains open.
