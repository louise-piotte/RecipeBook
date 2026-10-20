# WP02 / WP03 / WP04 R77 integration (2026-10-13)

## Decisions

### WP02 B3 — Tacca / pia starch hold

Kept extracted starch from *Tacca leontopetaloides* outside active references and the research ledger. Regional food and botanical sources establish the product, but the bounded search found no current Canadian or Québec product listing or product-specific Québec French name. OQLF's broad `arrow-root` identity remains unchanged; do not assign `pia`, `Polynesian arrowroot`, or provisional French constructions such as `fécule de tacca` as global aliases. The FAO 9 g per tablespoon and reported study extraction yields remain source-specific evidence, with no density, conversion, yield, form, recipe link, or substitution carried into shared data.

### WP03 Section F — Mighty Tasty hot cereal

Added identity-only `ingredient-ref-mighty-tasty-hot-cereal`:

- English: `Mighty Tasty hot cereal`
- French: `Céréales chaudes savoureuses (Mighty Tasty)`
- Category: `GRAIN_AND_CEREAL`
- Aliases: none
- Default density: `null`; unit mappings: empty

The current Bob’s Red Mill English and Canadian French pages identify the same dry blend of brown rice, corn, sorghum, and buckwheat. Kept its current ¼ cup / 48 g package serving and an older archived ¼ cup / 40 g label amount as source-specific ledger observations. Neither becomes a reusable volume-to-mass mapping. Cooking instructions, preparation outputs, and external recipe quantities also remain source-specific. No bundled recipe matched the candidate, so no recipe line or form was added.

### WP04 Section P — rock crab picker hold

Kept *Cancer irroratus* outside active references and the research ledger. OQLF says `crabe commun` is often used commercially for both rock crab and Jonah crab; CFIA assigns `Rock Crab / Crabe Commun` to several taxa and `Rock Crab` to another. The phrase-first picker would make `rock crab` and `crabe commun` look like singleton species results. Keep the Jonah and generic crab-meat rows unchanged; recipe 019#8 remains generic Jumbo Lump crab meat. No recipe requests rock crab specifically.

## Evidence and proposals

- [WP02 Tacca / pia starch proposal](../../proposals/wp02-b3-tacca-pia-starch-boundary-review-r77-20261013.md)
- [WP03 Mighty Tasty hot cereal proposal](../../proposals/wp03-section-f-mighty-tasty-hot-cereal-identity-review-r77-20261013.md)
- [WP04 rock crab proposal](../../proposals/wp04-section-p-rock-crab-picker-boundary-review-r77-20261013.md)

The proposals retain the source registers, identity and picker boundaries, recipe scans, and source-specific measurement limits.

## Verification

- The bundled seed package normalized and validated; the generated ingredient catalog check passed.
- The research ledger validated against its JSON Schema; ownership, source IDs, reference links, recipe demand, and static picker projections were checked.
- UTF-8/no-BOM, mojibake, local Markdown links, and changed-file whitespace were checked.
- No app tests or emulator checks were run. The only active catalog data change adds database JSON data, covered by the current `AGENTS.md` rule; the two holds are documentation-only.

The WP02 B3, Section F, and Section P parent checklist items remain open.
