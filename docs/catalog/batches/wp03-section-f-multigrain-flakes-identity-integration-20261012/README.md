# WP03 Section F — multigrain flakes identity integration

## Decision

Add identity-only `multigrain flakes / flocons multigrains` as
`ingredient-ref-multigrain-flakes` in `GRAIN_AND_CEREAL`. Add `multi-grain flakes` as the sole
English spelling alias. The French display is the current Québec manufacturer wording, corroborated
by a Québec retailer; OQLF supports the adjective and English spelling family but has no dedicated
entry for the compound product phrase.

Keep the blend distinct from species-specific flakes, muesli, granola, hot cereals, bran-flakes
cereal, and formulated ready-to-eat multigrain breakfast cereals. Do not carry the La Milanaise
organic claim, one product's five-grain formula, package size, preparation directions, or
alternative-to-oats statement into universal ingredient behavior.

The accepted row has no French aliases, forms, density, unit mappings, measurements, yields,
conversions, recipe links, or substitutions. The manufacturer’s 500 g package and two-parts-water
preparation direction do not establish a general mass-volume measure or replacement quantity.

## Evidence and package audit

The OQLF GDT defines *multigrain* for food made from grains of multiple cereals and lists
`multi-grain` as an English spelling. La Milanaise’s French and English pages identify a dry blend
of oat, barley, wheat, rye, and Khorasan flakes; a Québec retailer corroborates `flocons
multigrains`. Kölln lists a different five-flake formula, supporting a source-neutral blend identity.
WK Kellogg Canada lists Frosted Flakes Multigrains as a separate finished cereal product.

Exact normalized ownership was checked in active references, forms, legacy candidates, and ledger
record IDs. No owner was found for the candidate ID or proposed product phrases. The proposal’s
seven source IDs and primary URLs were also checked against the shared ledger; none was already
registered. The full manifest-listed corpus contains 114 recipes and 1,123 ingredient rows, with no
matching candidate demand.

Sources: [multigrain (OQLF GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8355580/multigrain),
[Flocons multigrains biologiques (La Milanaise)](https://lamilanaise.com/produits/flocons-multigrains-biologique/),
[Organic Multigrain Flakes (La Milanaise)](https://lamilanaise.com/en/produits/organic-multigrain-flakes/),
and the complete [source review](../../proposals/wp03-section-f-next-cereal-grain-batch-20261012.md).

## Validation

- Added one canonical ingredient-reference JSON row and one research-ledger record.
- Regenerated the Kotlin catalog index from the canonical JSON data.
- Validated package normalization/schema, generated-index freshness, ledger schema, normalized-key
  ownership, recipe corpus, UTF-8/no-BOM, and scoped whitespace.
- No app tests or emulator checks were run because this change only adds database JSON data under
  `AGENTS.md`.

The Section F cereal-mix and preprocessed-grain sweep remains open.
