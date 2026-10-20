# WP02 — Instant banana-flour product-boundary hold (2026-10-12)

## Decision

Keep `Instant Tooke Flour`, `instant banana flour`, `instant green banana flour`, and
`farine Tooke instantanée` out of the active catalog. BIRDC/Tooke currently distinguishes raw from
instant flour and describes the instant product as pre-cooked, but it directs buyers to the current
package or specification for the ingredients and formulation. No current Canadian or Québec package
or validated Québec French name was found. Do not add an instant form, new identity, or generic alias
to `green banana flour / farine de banane verte`.

The EAC standard for green/unripe banana and plantain flour excludes instant banana flour without
defining that product class. The primary extrusion study documents one experimental instant flour,
not the Tooke process. Keep `instant` distinct from `pregelatinized`: the historical NuBana P500 form
hold remains a separate question. A later review may consider a pre-cooked form under
`ingredient-ref-green-banana-flour` only if a current package confirms a single-ingredient flour and
a Québec reviewer validates its French label. Reassess as a formulation-specific product if the
package lists carriers or additional ingredients.

The manifest-listed bundle contains 114 recipes and 1,123 ingredient rows. The full scan found no
candidate flour phrase hits and no recipe rows linked to `ingredient-ref-green-banana-flour`. One
Ugandan retailer's 60 g flour with 200 ml water porridge direction remains product-specific; it is not
a generic density, household measure, or substitution. No catalog, ledger, form, measure, recipe link,
conversion, yield, or substitution data changed.

## Evidence reviewed

The full product-boundary review, exact ownership audit, picker results, recipe scan, source register,
and post-brown-bullhead snapshot are in the [proposal](../../proposals/wp02-b9-instant-banana-flour-boundary-review-20261012.md).
Key sources include:

- East African Community Secretariat, [Catalogue of East African Standards 2025](https://www.eac.int/documents?controller=download&file=177480db-3520-4d76-b686-1a6e0438a997&name=EAC+STANDARDS+CATALOGUE+2025.pdf&task=download.file), which states that EAS 1106:2023 does not apply to instant banana flour but does not define it.
- Banana Industrial Research and Development Centre, [Tooke products](https://tookeonline.com/en/products/) and [FAQ](https://tookeonline.com/en/faq/), distinguishing its raw and instant products and directing buyers to current product information.
- BIRDC/Tooke, [French product page](https://tookeonline.com/fr/products/), using brand-specific `farine Tooke instantanée` wording.
- Giraldo-Gómez et al., [Preparation of instant green banana flour powders by an extrusion process](https://doi.org/10.1016/j.powtec.2019.05.050), documenting a research process that does not establish Tooke's method.
- Jumia Uganda, [TOOKE Instant Banana Flour](https://www.jumia.ug/tooke-instant-banana-flour-250g-for-porridge-meals-versatile-nutritious.-24pkts-inside.-259984544.html), a third-party product listing with one porridge direction, not a Québec package or general measurement source.

## Reconciliation

This closes only the current Tooke instant-flour boundary review under open WP02 B9. The raw
green-banana-flour identity, historical P500 form hold, and broader B9 coverage remain open. Canonical
JSON, recipes, the research ledger, generated code, and app behavior were unchanged. This
documentation-only reconciliation required no app tests or emulator checks.
