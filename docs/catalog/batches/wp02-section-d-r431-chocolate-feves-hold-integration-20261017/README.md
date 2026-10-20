# WP02 Section D R431 chocolate-fèves picker hold

**Date:** 2026-10-17

## Decision

Keep generic chocolate `fèves`, `drops`, `pistoles`, and `callets` outside active reference and form data. Valrhona uses `fèves` for its own couverture products and distinguishes its pieces by shape and product naming; Callebaut’s `Callets` is also a producer-specific product label. Neither source supports a universal chocolate-type alias or transferable measure. See the [R431 proposal](../../proposals/wp02-section-d-chocolate-feves-shape-and-picker-boundary-review-r431-20261017.md).

Root review also checked OQLF’s current [pépite de chocolat](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9898216/pepite-de-chocolat) entry. It describes the existing baking-chip category, whose pieces can have a small-drop shape and retain their form during baking. It does not equate those chips with Valrhona couverture pistoles/fèves. Keep the chip forms, chocolate-type identities, and chocolate shavings identity unchanged.

## Ownership and picker

The live package now has 1,727 references and 141 forms. Current projection from the phrase-first ingredient picker gives:

| Query | Result |
|---|---|
| `fève` | Edamame; fava beans |
| `fèves` | Edamame; soybeans |
| `fèves de chocolat`, `chocolate fèves`, `chocolate drops`, `pistoles de chocolat`, `callets` | No result |
| `chocolate chips` | Existing chocolate-type chip results |

Do not add bare `fève`/`fèves`: those queries already select legume identities. A future chocolate form needs a concrete recipe or picker request and must retain the chocolate type.

## Corpus and data boundary

The manifest lists 114 recipes and 1,123 ingredient rows. A current full-text scan found no `fève(s) de chocolat`, `chocolate fève(s)`, `chocolate drop(s)`, `pistole(s) de chocolat`, `chocolate callet(s)`, standalone `pistole(s)`, or `callet(s)` mention. No recipe needs a relink or text edit.

This is a documentation-only hold. No reference, alias, form, ledger record, measure, density, mapping, yield, recipe link, or substitution changed. No app tests, builds, emulator checks, or deployment were run.
