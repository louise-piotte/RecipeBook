# WP03 Section I finely chopped almond form review — 2026-10-12

## Recommendation

Add `finely chopped almonds / amandes hachées finement` as a form under the existing almond
identity and link only recipe `006#7`. The current Allrecipes card explicitly names finely chopped
almonds, so it supports the form state. Preserve the saved row's `40 g` amount and required state;
the current publisher card gives a different volume and marks the ingredient optional, so its numeric
and optionality differences remain unresolved.

Add no mass conversion, density, transferable measure, yield, or substitution. Do not change the
recipe text, amount, optional state, or instructions in this form integration.

## Exact demand and source comparison

| Recipe row | Saved row | Current publisher card | Form disposition |
|---|---|---|---|
| `006#7` | `40 g almonds, finely chopped`; required in the bundle | Allrecipes, [Nanaimo Bars](https://www.allrecipes.com/recipe/25095/nanaimo-bars-iii/), updated 2026-01-20: `1/2 cup finely chopped almonds (Optional)` | Link the finely chopped form only. Preserve 40 g and the current required state; do not convert the publisher's 1/2 cup. |

The current card confirms the preparation name but does not support the saved mass or required
optionality. The plan's form decision must not silently reconcile those recipe-source differences.

The complete recipe-corpus scan found only this linked almond row with a finely chopped state. Other
almond rows request sliced, blanched, whole, or unqualified almonds and retain their existing states.

## Québec French wording

The OQLF [*hacher* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17491547/hacher)
defines the culinary verb as reducing food to small pieces and gives English *chop*. The source
specifies the finer cut; `amandes hachées finement` describes that source wording without setting a
standard particle size for almonds.

## Numeric and substitution boundaries

- Allrecipes publishes 1/2 cup for this source version; the bundle stores 40 g. No mass conversion
  or cup convention is supplied, so leave both values source-scoped and do not treat the pair as
  equivalent.
- The publisher marks the almonds optional; the saved recipe does not. Preserve the saved state and
  leave source reconciliation open.
- Measurement and substitution research remain `not_yet_researched`. Add no density, mapping,
  conversion, yield, or substitution.

## Ledger source-ID audit

The two proposed source IDs were checked against the current research ledger and existing proposal
and batch files:

| Source ID | Source and bounded support |
|---|---|
| `WP03-ALMOND-FINELY-CHOPPED-FORM-20261012-S01` | Allrecipes, Nanaimo Bars, updated 2026-01-20; supports the finely chopped form only. Its optional 1/2-cup line does not supersede the bundled 40 g required row. |
| `WP03-ALMOND-FINELY-CHOPPED-FORM-20261012-S02` | OQLF, *hacher*; supports French *hachées* and the English *chop* correspondence, not a particle-size threshold. |

## Integration boundary

Add one `finely_chopped` form under `ingredient-ref-almonds` and attach it only to `006#7`.
Keep the saved row's text, 40 g amount, unit, and required state intact. Resolve the source amount and
optionality mismatch separately before changing that recipe row.
