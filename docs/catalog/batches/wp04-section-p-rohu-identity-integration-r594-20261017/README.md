# WP04 Section P R594 — Rohu identity

Date: 2026-10-17

## Decision

Added identity-only `ingredient-ref-rohu` for *Labeo rohita*, with English display `rohu`, French display `labéo roho`, empty alias arrays, and category `PROTEIN`. The ledger identity is verified; measurement research found no supported value and substitution research found no supported substitute. No form, measure, unit mapping, recipe link, conversion, yield, or substitution was added.

The CFIA Fish List’s `Rohu / Labéo roho` row is the display authority. `Rui` remains a source-local name only. Bangladesh’s 2023–24 pond-production figure is historical regional context, not a current production claim or a claim about any product’s origin. The Department of Fisheries index also lists a 2024–25 yearbook; its table was not used for the figure recorded here.

## Evidence

- CFIA, [Fish List lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp): TSN 163681 lists *Labeo rohita*, `Rohu`, and `Labéo roho`. Reused the existing CFIA results source ID.
- CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list): describes the Canadian fish-list labeling role, common names, scientific names, and TSNs. Reused the existing overview source ID.
- Bangladesh Department of Fisheries, [Yearbook of Fisheries Statistics of Bangladesh 2023–24](https://fisheries.gov.bd/sites/default/files/files/fisheries.portal.gov.bd/publications/21964f20_05cc_4cf7_968b_9a351aa055f3/2025-06-15-10-40-24afb31473c54701bb5e3a4de91f8d41.pdf), Table 3.18: lists Rui (*Labeo rohita*) at 345,046 metric tonnes and 14.57% of reported 2023–24 annual pond production. This is dated regional context only.
- Bangladesh Department of Fisheries, [fisheries statistics publication index](https://fisheries.portal.gov.bd/pages/static-pages/6922e13e933eb65569e2b13e), updated 2026-08-12: lists 2024–25 and 2023–24 yearbooks; no value from the 2024–25 table was used.

See the [R594 proposal](../../proposals/wp04-section-p-next-seafood-review-r594-20261017.md), the [regional-fish plan item](../../../RecipeBook-global-ingredient-catalog-plan.txt#L6426), and the [broader Section P review](../../../RecipeBook-global-ingredient-catalog-plan.txt#L14981). Both larger plan items remain open.

## Static verification

The seed package and ledger validate, the reference normalizer and generated index are current, source IDs map consistently to URLs, and the static picker/corpus projection matches the proposal. UTF-8/no-BOM, local-link, and scoped whitespace checks passed. No application tests, build, emulator check, or deployment were needed because this change only adds database JSON data and tracking documentation under `AGENTS.md`.
