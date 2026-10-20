# WP04 — common-carp picker-boundary hold (2026-10-12)

## Decision

Keep prospective `Common carp / carpe commune` for *Cyprinus carpio* unallocated. This is a
species-specific follow-up to the existing generic `carp` / `carpe` hold; it does not reopen or
change that earlier decision. Québec sources support the species as a food fish and document a
licensed commercial-sale pathway. The live picker still makes a qualified display unsafe for the
broad query: adding `Common carp / carpe commune`, even with empty alias arrays, would make it the
only result for both `carp` and `carpe`.

The current `carp` query returns only `ingredient-ref-mascarpone` via substring fallback (`carp` is
inside `mascarpone`); `carpe` returns nothing. A complete phrase match from the prospective common-
carp display would outrank that partial match and make the species row the sole result. Do not add
bare `carp` or `carpe` aliases.

The full manifest-listed recipe scan found 0 candidate matches across 114 recipes and 1,123
ingredient rows. No active reference, form, legacy candidate, ledger record, recipe link, measure,
conversion, yield, or substitution was added. The government fishery sources do not establish a
current retail SKU, recipe quantity, edible yield, or transferable safety instruction.

## Evidence reviewed

- [OQLF's `carpe` entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198858/carpe)
  normalizes Québec fish-product terminology to `carpe`, pairs it with English `carp` and *Cyprinus
  carpio*, and labels `carpe commune` France/Europe terminology.
- The [Québec government species profile](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/carpe-commune)
  uses `Carpe commune / Common carp`, identifies *C. carpio*, and says the species is commercially
  caught in the St. Lawrence. Its size and wild-fish consumption warnings are not culinary measures
  or a food-safety rule for recipes.
- MAPAQ's [freshwater commercial-fishing permit page](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/permis-peches-aquaculture-commerciales/permis-peche-commerciale-eau-douce)
  lists common carp among permit species and allows licensed catch intended for consumption to be
  sold. This establishes a regulated pathway, not current retail stock.
- The [CFIA Fish List carp query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Carp)
  and the prior [generic carp boundary review](../../proposals/wp04-finfish-gaps-20261010.md) explain
  why generic Canadian `carp` / `carpe` wording cannot automatically be assigned to *C. carpio*.
- The full species, ownership, exact picker projection, recipe scan, and numeric/substitution limits
  are in the [WP04 proposal](../../proposals/wp04-next-open-section-p-seafood-candidate-review-20261012.md).

## Reconciliation

This completes one species-specific review under the still-open Section P finfish item. It leaves both
the generic carp family and this common-carp species row unallocated until picker search can preserve
the broader scope or clearly communicate ambiguity. No database JSON, recipe, generated index, or
application code changed. The plan and roadmap record the hold; no app tests or emulator checks were
run because the reconciliation changed documentation only.
