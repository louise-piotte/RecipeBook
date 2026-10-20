# WP04 Section P — Pompano market-group identity integration (R109)

Reviewed and integrated on 2026-10-14. Section P remains open.

## Change

Added the alias-free identity `pompano / pompano` as `ingredient-ref-pompano` in `PROTEIN`, for the
generic *Trachinotus* market group. OQLF gives `pompano` as the preferred Québec edible-fish term for
*Trachinotus* sp.; CFIA independently lists a `Trachinotus spp. — Pompano / Pompano` group row. The
catalog row does not assign one species to the group.

Kept `permit` out because the FDA uses it as the common name for *T. falcatus*, while `Pompano` is
that species' acceptable market name. Kept `pompano lune` and `palomine` as species-level CFIA names,
and excluded `trachynote` and `pompaneau` because OQLF does not retain them for Québec fish-product
commercialization. `pompano dolphin` remains outside this identity and the mahi-mahi row.

Added five sources and three decisions to the research ledger. The Canadian supplier listing is kept
as product-specific evidence for a wild *Trachinotus* item sold whole or as fillets, fresh or frozen;
those descriptions do not create reusable forms or measures. The ledger records no supported
measurement value and no supported directed substitution. No density, unit mapping, culinary
observation, form, recipe link, conversion, yield, or substitution rule was added.

## Picker and recipe boundary

The exact query `pompano` now selects the new group row. No alias was added for `permit`, `pompano
lune`, `snubnose pompano`, `palomine`, `trachynote`, `pompaneau`, or `pompano dolphin`; the new row
does not claim those species or other fish identities. The bundle has 114 recipes and 1,123 ingredient
rows, with no matching pompano or adjacent naming demand, so no recipe link was changed.

## Verification

Bundled package validation and normalization, research-ledger schema validation, generated-index
freshness, ID and source ownership, picker projection, recipe corpus scan, UTF-8/no-BOM, local links,
and whitespace checks passed. No app, Gradle, instrumentation, or emulator tests were run because
this change only adds database JSON data and its generated catalog index.

See the [R109 source and identity review](../../proposals/wp04-section-p-pompano-market-group-identity-review-r109-20261014.md).
