# WP02 / WP03 / WP04 R74 integration (2026-10-13)

## Decisions

### WP02 B2 — Bambara groundnut flour

Added identity-only `ingredient-ref-bambara-groundnut-flour`:

- English: `Bambara groundnut flour`
- French: `farine de pois bambara` (provisional for Québec; the exact flour label comes from EU regulation, while Canadian French sources attest the seed name)
- English alias: `Bambara beans flour`
- French aliases: none
- Category: `FLOUR_AND_STARCH`
- Default density: `null`; unit mappings: empty

The ledger records the identity sources, including the EU French label, Canadian product listings, and studies that distinguish flour from isolates and report only process-specific bulk-density observations. It does not promote those observations to active density, measures, or conversions. No forms, recipe links, yields, or substitutions were added. The bundled recipe corpus has no matching demand.

### WP03 Section F — pearl millet flakes / “Bajra Poha”

Held the candidate unallocated. Sources support pearl-millet flakes and their English names, but no species-qualified Québec French display was verified. Do not add an identity, form, or alias. In particular, do not add `Bajra Poha`: the current matcher would make the bare `poha` query return another row alongside the existing rice and maize poha products. The candidate remains separate from whole pearl millet, pearl millet flour, and generic millet flakes.

### WP04 Section P — Northern shrimp

Added identity-only `ingredient-ref-northern-shrimp`:

- English: `Northern shrimp`
- French: `crevette nordique`
- English aliases: none
- French alias: `crevettes nordiques`
- Species: *Pandalus borealis*
- Category: `PROTEIN`
- Default density: `null`; unit mappings: empty

The ledger preserves the OQLF caveat that some commercial arrivals sold as `crevette nordique` may mix *P. borealis* and *P. montagui*. Do not map unspecified shrimp or overlapping alternate names to this species. Biological, nutrition, count, and product-grade figures remain source-specific; no forms, active measurements, conversions, yields, recipe links, or substitutions were added. The recipe corpus has no matching demand.

## Records and evidence

- New ingredient references: `ingredient-ref-bambara-groundnut-flour`, `ingredient-ref-northern-shrimp`.
- New ledger records with identity, measurement, and substitution states: the same two IDs.
- The R74 review of pearl millet flakes is documented in [the proposal](../../proposals/wp03-next-section-f-grain-review-r74-20261013.md) only; it adds no ledger candidate.
- Proposal sources and full boundary analysis: [WP02 flour review](../../proposals/wp02-next-a-b-flour-review-r74-20261013.md), [WP03 grain review](../../proposals/wp03-next-section-f-grain-review-r74-20261013.md), and [WP04 seafood review](../../proposals/wp04-next-section-p-seafood-review-r74-20261013.md).

## Verification

- The bundled seed-package normalizer/validator and generated catalog refresh passed.
- Ledger schema, source-ID, exact-key ownership, query-boundary, recipe-demand, UTF-8/no-BOM, mojibake, local-link, and whitespace checks passed.
- No Gradle or emulator tests were run. These catalog changes only add database JSON data, which the current `AGENTS.md` rule exempts from testing.

The Section B flour parent, Section F cereal sweep, and Section P shrimp/prawn parent remain open.
