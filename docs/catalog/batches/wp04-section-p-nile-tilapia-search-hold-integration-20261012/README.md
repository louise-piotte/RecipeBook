# WP04 Section P Nile tilapia search-boundary hold

## Decision

The verified identity `Nile tilapia / tilapia du Nil` for *Oreochromis niloticus* remains an
unallocated candidate. The active reference was removed because the current search treats `Nile tilapia` as a complete-phrase match for the bare query `tilapia`; this can surface the species-only
choice without the unresolved generic identity. Retain the evidence in ledger record
`candidate-nile-tilapia`. Revisit after search preserves both the generic unresolved result and the
species-specific result.

No recipe links, forms, measurements, density, unit mappings, conversions, yields, or substitutions
were added. Generic tilapia, other species, perche d’Afrique, and Nile perch (*Lates niloticus*) stay
separate.

See the [source review](../../proposals/wp04-section-p-nile-tilapia-identity-review-20261012.md)
for bilingual terminology, taxonomic boundaries, source notes, exact-key audit, and recipe-demand scan.

## Static verification

- Active Nile tilapia reference is absent; research-ledger candidate and its sources are retained.
- The generated catalog index was refreshed after removing the active row.
- Bundled package, ingredient-reference, generated-index, ledger, encoding, ownership, and corpus checks
  were run after the hold.
- No app tests or emulator checks were run for this database-data change.
