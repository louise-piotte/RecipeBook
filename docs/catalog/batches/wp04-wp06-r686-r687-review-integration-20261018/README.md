# WP04 / WP06 R686–R687 integration

**Date:** 2026-10-18

## R686 — frozen whole octopus form

Added `ingredient-form-octopus-frozen-whole` under the existing species-neutral
`ingredient-ref-octopus` reference. The display names are `frozen whole octopus` and
`pieuvre entière surgelée`; form match terms are limited to `whole octopus` and
`pieuvre entière`. Pêcheries Océanic’s paired product pages support the names and frozen
storage state. Poissonnerie La Gambas supplies separate Québec market wording and species
context; its cleaned state is not transferred to the supplier product. The supplier’s species,
additives, grades, origin, and package details remain product-specific.

Added a form-level ledger record with three new source IDs. Research is complete for this narrow form and found no supported reusable measure or substitute. No density, unit mapping, conversion, yield, recipe link, or substitution
was added; the bundled corpus has no octopus demand. The form was inserted beside the existing
cooked-tentacle form.

## R687 — wattleseed picker-boundary hold

Kept the existing `candidate-wattleseed` record and active catalog unchanged. Supplier examples name
*Acacia victoriae*, while Australian industry and commodity sources show that the broader source name
can cover multiple species. A species-specific row under the bare `wattleseed` term would make that
query appear resolved to one species. No Québec French product wording resolves the display, and the
bundled recipe corpus has no demand. No active reference, form, alias, or ledger evidence was added.
WP06 regional coverage remains open.

## Verification and references

Static bundled-package and research-ledger validation, source-ID/URL ownership, picker projection,
recipe-corpus scan, UTF-8/no-BOM, local-link, and scoped whitespace checks are recorded for this
integration. No software tests/build/emulator were run: R686 adds database JSON data only, and R687 is
a documentation-only hold under `AGENTS.md`.

- [R686 proposal](../../proposals/wp04-section-p-frozen-whole-octopus-form-review-r686-20261018.md)
- [R687 proposal](../../proposals/wp06-wattleseed-species-picker-boundary-review-r687-20261018.md)
