# WP02/WP03/WP05 R987–R989 generic ingredient integration

Reviewed and integrated on 2026-10-19. These reviews cover a milling candidate, a species-qualified edible flower bud, and a named Korean condiment. Product rosters were not pursued.

## Dispositions

- **R987, wholegrain einkorn semolina:** added an unresolved `candidate-wholegrain-einkorn-semolina` ledger record only. One primary study names stone-ground wholegrain einkorn semolina as the input for its pasta sample; the claim remains sample-specific. OQLF’s `semoule` definition is limited to durum wheat, and existing TERMIUM evidence provides the einkorn species names only. Keep the grind/wholegrain boundary and Québec French display unresolved; do not add an active reference, alias, form, measurement, recipe link, or substitution. Existing einkorn flour, einkorn berries, durum semolina, and the earlier einkorn-meal hold remain unchanged.
- **R988, tawny daylily flower buds:** added identity-only `tawny daylily flower buds (Hemerocallis fulva) / boutons floraux d’hémérocalle fauve (Hemerocallis fulva)` in `VEGETABLE_AND_AROMATIC`. NCSU supports the edible buds for this species; VASCAN supports the species and common names; UQAC supports only descriptive French plant-part wording at genus level. Keep the French display provisional and do not extend the evidence to other daylilies, hybrids, true lilies, other plant parts, safety advice, or measures. No aliases, forms, measurements, recipe links, conversions, yields, or substitutions were added.
- **R989, gukganjang:** added identity-only `gukganjang / gukganjang` in `SAUCE_AND_CONDIMENT`, with no aliases and a provisional borrowed French display. KTO and Korea’s National Institute of Agricultural Sciences identify a named Korean soy-sauce cooking type used for soups, stews, and namul. Keep unqualified `ganjang` unresolved and separate from generic soy sauce and Japanese styles. KTO salinity and RDA aging descriptions remain source-specific; no form, measure, recipe link, conversion, yield, or active substitution was added.

## Cross-category scope and preservation

The reviews remained focused on generic ingredient diversity. The A7 named Anson Mills wheat-meal lead was seen only as the previously dispositioned hold and was not reopened or researched; commercial-product counts do not add ingredient diversity. No new brand-, product-line-, flavour-family-, SKU-, retailer-variant-, or cultivar-roster-only task was pursued. Existing branded entries and product-specific evidence remain intact, and no product-specific measurement or claim was generalized. Manufacturer or study sources may support a generic claim only within the evidence scope they establish; transfer requires a separate review.

## Validation

Static package normalization and validation, reference normalization, ledger JSON Schema validation, source-ID and source-reference checks, generated-catalog freshness, identity ownership, recipe-demand, UTF-8/no-BOM, local links, and scoped whitespace checks passed at **2,005 references, 205 forms, 55 legacy candidates, 2,411 ledger records, and 114 recipes / 1,123 ingredient rows**. Eight new source IDs were allocated. No software tests or builds were run because the app changes only add ingredient database JSON under `AGENTS.md`.

See the [R987 proposal](../../proposals/wp02-a7-generic-gap-review-r987-20261019.md), [R988 proposal](../../proposals/wp03-generic-gap-review-r988-20261019.md), and [R989 proposal](../../proposals/wp05-section-w-gukganjang-identity-review-r989-20261019.md).
