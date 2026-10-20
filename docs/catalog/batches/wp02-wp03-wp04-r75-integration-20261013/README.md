# WP02 / WP03 / WP04 R75 integration (2026-10-13)

## Decisions

### WP02 A6 — Tartary buckwheat flour

Added identity-only `ingredient-ref-tartary-buckwheat-flour` for flour from *Fagopyrum tataricum*:

- English: `Tartary buckwheat flour`
- French: `farine de sarrasin de Tartarie`
- English alias: `Tartar buckwheat flour`
- French aliases: `farine de sarrasin tartare`, `farine de sarrasin vert biologique`
- Category: `FLOUR_AND_STARCH`
- Default density: `null`; unit mappings: empty

The French display uses the Canadian common name for the species with the flour product type. The French aliases are exact product wording from the reviewed product pages. The generic and sprouted buckwheat flour rows remain unchanged. The ledger preserves the one-study 0.68 ± 0.00 g/mL bulk-density observation for cultivar Shimla B-1 and its tapped-cylinder method, plus a 25:25:50 bread blend as one product-specific formula. Neither is a reusable kitchen conversion or substitution rule. No forms, recipe links, conversions, yields, or substitutions were added. No bundled recipe demand was found.

### WP03 Section F — dry kishk

Kept dry kishk unallocated as ledger-only `candidate-kishk`. Sources establish dried fermented cereal-and-dairy products, while Québec evidence uses `kishk` only for a prepared manakish topping. No Québec French display for the standalone dry product was verified. Keep it distinct from bulgur, plain yogurt, Turkish tarhana, and the prepared topping. Add no active reference, alias, form, measurement, recipe link, conversion, yield, or substitution. The recipe corpus has no matching demand.

### WP04 Section P — powdered katsuobushi

Added `ingredient-form-dried-bonito-powder` under existing `ingredient-ref-dried-bonito`:

- English: `dried bonito powder`
- French: `bonito séché en poudre` (descriptive and provisional)
- English match terms: `bonito powder`, `katsuobushi powder`
- French match terms: none
- State: dry; density: `null`

The form records a powder presentation of dried bonito/katsuobushi. It does not create a separate fish identity or generic fish-powder term. The Canadian French `Poudre de bonite séchée` wording occurs in a multicomponent instant soup listing and is retained as wording evidence only, not as a match term. No measures, conversions, recipe links, yields, or substitutions were added. The corpus has no matching recipe demand.

## Evidence and proposals

- [WP02 Tartary buckwheat flour proposal](../../proposals/wp02-a6-tartary-buckwheat-flour-identity-review-r75-20261013.md)
- [WP03 kishk product-boundary proposal](../../proposals/wp03-section-f-lebanese-kishk-product-boundary-hold-r75-20261013.md)
- [WP04 katsuobushi powder form proposal](../../proposals/wp04-section-p-katsuobushi-powder-form-review-r75-20261013.md)

The proposal files retain source-level evidence, exact ownership and picker checks, recipe scans, and limits on numeric or linguistic claims.

## Verification

- The bundled seed package normalized and validated successfully.
- The generated ingredient catalog is current and its check passed.
- Research-ledger IDs, source-ID ownership, schema shape, record-to-reference/form links, recipe demand, UTF-8/no-BOM, mojibake, local links, and changed-file whitespace were checked.
- No app tests or emulator checks were run because the app catalog change only adds database JSON data, as allowed by `AGENTS.md`.
