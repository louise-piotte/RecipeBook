# WP04 Section P R587 — Hilsa identity integration

Date: 2026-10-17

## Decision

Added identity-only `Hilsa / poisson hilsa` as `ingredient-ref-hilsa` in `PROTEIN`, scoped to *Tenualosa ilisha*. The English aliases are `Hilsa fish`, `Hilsha`, and `Ilish`; the French alias is `alose hilsa`. CFIA pairs *T. ilisha* with Hilsa / Alose hilsa, and a Montréal seller identifies the product as Hilsa (Ilish) / Poisson Hilsa. The seller page's inconsistent product-state, origin, package, and handling details remain product-specific.

The picker projection includes `Ilish`: exact phrase matching returns Hilsa for `ilish`, suppressing the prior `kilishi` substring false positive. The generic fish/poisson queries remain broad. Other fish species and product forms remain separate.

No form, density, unit mapping, measure, package yield, conversion, recipe link, or substitution was added. All 114 manifest-listed recipes and 1,123 ingredient rows were reviewed; no Hilsa name or linked ingredient row was found.

## Evidence

- Canadian Food Inspection Agency, [Fish List lookup for Hilsa](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Hilsa): TSN 551297, *Tenualosa ilisha*, Hilsa / Alose hilsa.
- Belaamie, Montréal, [Hilsha 500g Box](https://belaamie.com/product/hilsha/): scientific name *Tenualosa ilisha*, English name Hilsa (Ilish), French name Poisson Hilsa. Package and product-state details are not generalized.
- The general CFIA Fish List overview reuses source ID `WP04-FINFISH-GAPS-20261010-S11`; candidate-specific evidence is stored under R587 source IDs S01 and S02 in the research ledger.

See the [R587 proposal](../../proposals/wp04-section-p-next-seafood-review-r587-20261017.md), the open [regional-fish checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L6426), and the broader [Section P seafood work item](../../../RecipeBook-global-ingredient-catalog-plan.txt#L14981). The broader Section P and fish-powder/fish-ball/surimi work remains open.

## Static verification

Static package, generated-index, ledger/schema, source ownership, picker, encoding, recipe-corpus, local-link, and whitespace checks passed. No software tests, build, emulator check, or deployment were run because this change only adds database JSON data and tracking documentation under `AGENTS.md`.
