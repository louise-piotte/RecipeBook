# WP02 B2 green pea flour search hold

## Decision

Keep green pea flour as a documented candidate without an active reference, aliases, or ledger identity.
The existing picker returns whole green peas for the bare query `green pea` by substring fallback.
Adding `green pea flour` would create a complete-phrase match and suppress the whole-pea result. The
picker's current phrase-priority behavior makes that an unsafe catalog addition while green-pea flour
remains distinct from the whole food.

The fr-CA wording also remains unsettled. Québec retailer listings use both `farine de pois verts` and
`farine de petits pois` in ingredient statements for finished pea pasta, not standalone flour labels.
Whole-green and split-green pea flour products are separately named by Canadian sources; the evidence
does not yet set a shared identity boundary. No recipe demand, transferable measurement, form,
conversion, yield, recipe link, or substitution was found.

See the [source review](../../proposals/wp02-b2-green-pea-flour-search-boundary-review-20261012.md)
for exact owner and recipe scans, phrase-level search consequences, and source limitations. Revisit after
search can preserve both the broad whole-pea choice and any source-backed flour identity.

## Static review

No catalog JSON, ledger, generated index, or app code changed. No tests or emulator checks were run for
this documentation-only hold.
