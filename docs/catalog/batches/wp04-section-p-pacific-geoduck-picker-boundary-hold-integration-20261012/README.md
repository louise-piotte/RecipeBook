# WP04 — Pacific geoduck picker-boundary hold (2026-10-12)

## Decision

Keep `Pacific geoduck / panope du Pacifique` unallocated. Canadian sources support the
species-qualified name pair for *Panopea generosa*, but international seafood nomenclature also
uses `geoduck` for other species. With a Pacific-only catalog result, the current phrase picker would
return that species for an unqualified `geoduck` query. No bundled recipe or supplied product
specifies Pacific geoduck.

Do not add an active reference, aliases, forms, measurements, conversions, yields, recipe links, or
substitutions. Keep the existing generic clam candidate held; do not use `geoduck clam` aliases that
would make a broad `clam` query return this single species.

## Evidence and scope

- Fisheries and Oceans Canada pairs *Panopea generosa* with English `Geoduck Clam` and French
  `Panope du Pacifique` in its [English profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/geoduck-clam-panope-pac-eng.html)
  and [French profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/geoduck-clam-panope-pac-fra.html).
- The [OQLF `panope` entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059023/panope)
  supports the Québec term and its English equivalent. Its older taxonomic spelling is not used as
  current taxonomy.
- The U.S. FDA lists Pacific, Atlantic, and Mexican geoduck as distinct species. This is used only to
  establish the unqualified picker-scope risk, not as Canadian naming authority: [*P. generosa*](https://hfpappexternal.fda.gov/scripts/fdcc/index.cfm?id=Panopea_generosa&set=SeafoodList),
  [*P. bitruncata*](https://hfpappexternal.fda.gov/scripts/fdcc/index.cfm?id=Panopea_bitruncata&set=SeafoodList),
  and [*P. globosa*](https://hfpappexternal.fda.gov/scripts/fdcc/index.cfm?id=Panopea_globosa&set=SeafoodList).
- The review found no geoduck/panope owner in the active references, forms, or legacy candidates,
  and no geoduck record in the research ledger. The manifest-ordered corpus scan found no matching
  term in 114 recipes or 1,123 ingredient rows. See the full audit in
  [`wp04-section-p-pacific-geoduck-picker-boundary-review-20261012.md`](../../proposals/wp04-section-p-pacific-geoduck-picker-boundary-review-20261012.md).

## Integration record

This is a documentation-only hold. No database JSON, recipe, generated index, or application code
changed. No tests or emulator checks were run.
