# WP02 A7 malted-rye-meal candidate integration — 2026-10-13

## Decision

Added unresolved ledger-only `candidate-malted-rye-meal`. Master Baker's Grainex Dark page uses
that exact phrase for one component of a commercial multigrain bread concentrate, but does not
identify the component's grind, malting specification, amount, or standalone availability. Current
Canadian and Finnish sources list a related coarse malted rye flour, while the manufacturer
separates coarsely crushed rye malt from ground rye malt. They do not establish that those products
are equivalent to the concentrate component.

The candidate is `needs_clarification`; measurement research is `researched_no_supported_value` and
substitution research is `researched_no_supported_substitute`. TERMIUM supports the existing plain
rye-meal terms `gruau de seigle` and `semoule de seigle`; OQLF's malt and brewing `gruau` entries do
not establish a Québec French name for a standalone malted rye meal product. Keep the candidate
separate from plain rye meal, malted rye flour, and generic malt flour. No active reference, alias,
form, legacy identity, recipe link, measure, density, unit mapping, conversion, yield, or substitution
was added.

The proposal snapshot of 1,379 references and 1,709 ledger records predates the R55 maize-rice
integration. The live counts immediately before this R56 integration were 1,380 references, 100
forms, 63 legacy candidates, and 1,710 ledger records; after adding the candidate, the ledger has
1,711 records. The 114-file / 1,123-row bundle has no matching recipe demand.

## Evidence

- [Master Baker Middle East — Grainex Dark](https://www.masterbakerme.com/product/grainex-dark-mix-of-grains-seeds/): names malted rye meal as one ingredient in a 25 kg bread concentrate; blend usage applies to the whole blend.
- [Viking Foods — Laihian Coarse Malted Rye Flour](https://www.vikingfoods.ca/products/laihian-coarse-malted-rye-flour-1-kg): a related current Canadian product, named as coarse malted rye flour rather than meal.
- [Laihian Mallas FAQ](https://laihianmallas.fi/usein-kysyttya/): distinguishes coarsely crushed rye malt from a pale ground malt product for bread and mämmi.
- [Arva Flour Mill — Rye Meal](https://arvaflourmills.com/products/rye-meal): plain, unmalted rye-meal comparator.
- [TERMIUM Plus — rye meal / gruau de seigle](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=GRUAU+SEIGLE): supports the existing plain rye-meal name.
- [OQLF — malt](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26545137/malt) and [gruau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8430011/gruau): neither establishes a consumer French display for malted rye meal.

The full ownership, picker, corpus, source, measurement, and substitution review is in the
[R56 proposal](../../proposals/wp02-a7-malted-rye-meal-boundary-review-20261013-round56.md) and
the [A7 checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L1449).

## Verification

- Ledger schema validation and source-ID uniqueness checks pass with seven new source records.
- Active references, forms, legacy candidates, recipe links, and runtime numeric/substitution behavior remain unchanged.
- No app, unit, instrumentation, or emulator tests were run because this change only adds database JSON data and documentation under the updated `AGENTS.md` rule.
