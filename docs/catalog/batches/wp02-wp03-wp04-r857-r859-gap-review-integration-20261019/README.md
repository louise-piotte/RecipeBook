# WP02/WP03/WP04 R857–R859 integration — 2026-10-19

Integrated three separate follow-up reviews while leaving the A7, F, and P parent checklists open.

## Changes

- **R857 — Khorasan semolina:** recorded a completed, proposal-only hold in the plan and progress
  records. InGrain Pastificio's statement names Khorasan/Organic Kamut grain as a substitute for
  durum semolina in its own pastas, but does not identify a Khorasan-semolina product or milling
  grade, amount, or process crosswalk. The source remains unallocated; no ledger source, finding,
  reference, or active rule was added. The target substitution state remains
  `not_yet_researched`.
- **R858 — roasted buckwheat:** added only `sarrasin grillé` as a French alias to the existing
  `ingredient-ref-roasted-buckwheat-groats-dry` reference. Added three Québec producer/retailer
  sources and a decision to its ledger row. The same sources call dry roasted groats `kasha`, while
  the existing OQLF source defines `kacha/kasha` as a cooked gruel. Added those sources and an
  unresolved ambiguity decision to the separate `ingredient-ref-kasha` candidate; its identity,
  measurement, and substitution states remain unchanged. The TournevenT 40 g / 1/4 tasse topping
  quantity remains formula-specific. No form, measurement, density, mapping, conversion, yield,
  recipe link, or substitution was added.
- **R859 — walleye:** recorded two historical CNF 2015 Food Code 3202 portions on the existing
  `ingredient-ref-walleye` ledger row: one fillet = 159.0 g and one food-guide serving = 90.0 g.
  Retained the separate 65% refuse as context. No whole-fish mass, yield, reusable fillet
  conversion, fillet form, or active search term was added; CNF 2026 continuity remains unverified.

## Static validation

- The bundled seed package validates against its schemas and internal integrity checks, and the
  normalizer reports the package as normalized.
- The generated ingredient index is current at 1,891 references. Exact `sarrasin grillé` projects to
  the roasted-groats row. `kasha` returns no active row; `kacha` reaches only the existing
  `fingerroot / krachai` substring fallback, not buckwheat groats.
- Ledger schema and scoped R858/R859 ownership checks pass. Each source ID maps to one URL, and all
  cited source IDs resolve on their respective ledger records; the two new Walleye observations cite
  sources attached to the same ledger record.
- Static picker and manifest recipe scans found no matching recipe demand for the reviewed items.
- UTF-8/no-BOM, explicit escaped Unicode in database JSON, source-ID/URL uniqueness, plan links and
  anchors, and scoped whitespace checks pass for the integration artifacts.
- No software tests, app build, emulator run, or deployment were performed. The application data
  changes add bundled database JSON; `AGENTS.md` exempts such additions from testing.

## Review records

- [R857 proposal](../../proposals/wp02-section-a7-next-gap-review-r857-20261019.md)
- [R858 proposal](../../proposals/wp03-section-f-quebec-buckwheat-groats-display-review-r858-20261019.md)
- [R859 proposal](../../proposals/wp04-section-p-next-gap-review-r859-20261019.md)
- [Catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)
