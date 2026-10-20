# WP03 Section F `sira` alias integration — 2026-10-13

Integrated the [round-65 `sira` review](../../proposals/wp03-section-f-next-cereal-gap-review-20261013-round65-sira-alias.md).

## Catalog decision

Added only the English alias `sira` to the existing
`ingredient-ref-flattened-rice-poha` reference. Assam government sources pair `sira` with flat or
flattened rice; the NIFTEM handbook supports the existing flaked-rice product class. Preserve the
current English and Québec French displays, all other aliases, and the thin, medium, and thick
poha forms. Keep qualified `Malbhog Sira` out as a separate identity.

The research ledger records the seven reviewed sources and an accepted alias decision on the
existing flattened-rice record. Preserve its null density, empty unit mappings, recipe-specific
Chirar Polao measurement observation and its limits, and blocked poha-grade substitution research.

## Recipe and behavior limits

The bundled corpus has no exact `sira` mention or candidate ingredient phrase. No form, density,
unit mapping, reusable measure, recipe link, conversion, yield, or substitution was added or changed.
The alias is English-only; no Québec French name was inferred from the retailer listing.

## Integration checks

- Ingredient-reference normalization check passed.
- Bundled seed package validation passed.
- Generated bundled ingredient catalog is current.
- Both changed JSON files parse; catalog ownership validation found no alias collision.
- Exact `sira` scan found no bundled recipe occurrence.
- No app tests or emulator checks were run because this change only adds database JSON data and regenerates its derived catalog index under `AGENTS.md`.

Section F remains open.
