# WP02 / WP03 / WP04 R76 integration (2026-10-13)

## Decisions

### WP02 B2 — faba bean flour / farine de féverole

Added identity-only `ingredient-ref-faba-bean-flour` for the Québec mill product named by Les Moulins de Soulanges:

- English: `faba bean flour`
- French: `farine de féverole`
- Category: `FLOUR_AND_STARCH`
- Aliases: none
- Default density: `null`; unit mappings: empty

The paired manufacturer pages support this bilingual product name. OQLF distinguishes *féverole* (*Vicia faba minor*) from the broader Québec/Canada *gourgane* (*Vicia faba*); this is a source-named flour identity, not a universal claim about every product called faba or fava flour. The existing `fava bean flour / farine de gourgane` row remains unchanged.

Added `faba bean` as an English alias to the existing whole-bean `ingredient-ref-fava-beans` row, supported by Manitoba Agriculture's crop naming. The broad `faba bean` search now returns both whole beans and flour, while the exact `faba bean flour` phrase returns only the flour row. The alias does not make the two flour products equivalent. No forms, measures, conversions, yields, recipe links, or substitutions were added; the 30 g per 1/4 cup value belongs to a different manufacturer's gourgane flour.

### WP03 Section F — Rogers Ancient Grain Blend Porridge Oats

Added one product-specific `GRAIN_AND_CEREAL` reference:

- English: `Rogers ancient grain blend porridge oats`
- French: `Avoine porridge et grains anciens Rogers`
- Aliases: none
- Default density: `null`; unit mappings: empty

The current manufacturer page supports the dry nine-component blend and says it must be cooked before eating. Canadian French retail wording supports the French title, and a Québec recipe attests local recipe use. Keep the brand and blend qualifier; do not generalize the row to generic porridge, ancient grains, multigrain flakes, or its individual components. The package serving, cooking directions/yield, and external recipe amounts remain source-specific evidence in the ledger. The bundle has no matching recipe demand.

### WP04 Section P — black tiger shrimp picker hold

Kept *Penaeus monodon* outside active references and the research ledger. OQLF and Québec retail sources support a species-qualified candidate, but CFIA assigns unqualified `tiger shrimp` and `crevette tigrée` to both *P. monodon* and *P. semisulcatus*. The phrase-first picker would make each short query return only the proposed *P. monodon* row. Do not add the row until search can preserve the qualifier or both species can be represented without a misleading singleton. No bundled recipe demand was found.

## Evidence and proposals

- [WP02 faba bean flour proposal](../../proposals/wp02-b2-faba-bean-flour-quebec-identity-review-r76-20261013.md)
- [WP03 Rogers porridge blend proposal](../../proposals/wp03-section-f-rogers-ancient-grain-porridge-blend-identity-review-r76-20261013.md)
- [WP04 black tiger shrimp picker-boundary proposal](../../proposals/wp04-section-p-black-tiger-shrimp-picker-boundary-review-r76-20261013.md)

The proposals retain source-level evidence, ownership and picker checks, recipe scans, and numeric and naming limits.

## Verification

- The bundled seed package normalized and validated successfully.
- The generated ingredient catalog is current and its check passed.
- Reference/form/ledger ownership, source IDs, record-to-reference links, picker projections, and recipe demand were checked.
- UTF-8/no-BOM, mojibake, local Markdown links, and changed-file whitespace were checked.
- No app tests or emulator checks were run. The active catalog changes add database JSON data, covered by the updated `AGENTS.md` rule; no application logic changed.

The WP02 B, Section F, and Section P parent checklist items remain open.
