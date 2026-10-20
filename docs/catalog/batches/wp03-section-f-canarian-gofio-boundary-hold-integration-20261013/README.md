# WP03 Section F Canarian gofio boundary hold integration

## Decision

Integrated the R46 proposal as an evidence-only hold. Keep protected Canarian `Gofio Canario` outside the active catalog until a Québec-facing French dry-product label or a bundled recipe resolves whether the picker should represent the protected regional product or a broader gofio product family. The official specification describes toasted-and-milled cereals, optionally with sea salt and sometimes similarly processed pulses. It does not establish that every product sold as gofio is Canarian.

The Canadian storefront sample includes organic corn gofio and a separate whole-wheat gofio described as native to Galicia. Adding a qualified Canarian row with a `gofio`-containing display or alias would make bare `gofio` resolve to that one regional row in the current phrase-first picker. The recipe bundle has no matching demand to resolve that scope.

## Changes

- Added the hold under the open [Section F regional cereal and preprocessed-grain checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L2556).
- Added this integration record and updated the plan progress log and roadmap.
- Changed no database JSON, generated catalog index, research ledger, forms, recipes, or application code. Added no active identity, alias, form, measure, density, unit mapping, recipe link, conversion, yield, substitution, or candidate record.

## Evidence and limits

- The [Canary Islands protected-product specification](https://www.gobiernodecanarias.org/cmsgob2/export/sites/agpsa/icca/galerias/doc/calidad/Pliego_de_condiciones_IGP_Gofio_Canario.pdf) defines *Gofio Canario* as a powder made in the Canaries from milled roasted cereals, with optional sea salt and sometimes similarly processed pulses. The allowed cereal and pulse ingredients vary. The specification's roasting temperature is a manufacturing limit, not a recipe conversion.
- The Fuerteventura interpretation centre uses French `gofio canarien` in regional material. This supports French-language regional usage, not Québec terminology approval or a Québec retail label.
- Naturitas Canada lists Gofio La Piña Organic Corn Gofio in a 500 g package and gives product-specific tablespoon directions without a mass per spoon. This does not support a reusable measure, density, or the exact package's protected status.
- Naturitas Canada also lists a whole-wheat gofio product whose wheat is described as native to Galicia. These listings demonstrate variation in the storefront's use of `gofio`; they do not establish the full Canadian market.
- The proposal found no exact active catalog, form, legacy-candidate, ledger, prior-decision, or recipe owner. Its pre-proposal snapshot was 1,369 references, 100 forms, 64 legacy candidates, and 1,699 ledger records. All 114 manifest-listed recipes and 1,123 ingredient rows had zero candidate-phrase matches.
- No reusable measure, density, mapping, cooking yield, or substitution is supported. Package weight and an unweighted tablespoon instruction remain product-specific.

## Verification

The proposal-only source, ownership, picker, corpus, source-ID, and link review is recorded in [the R46 proposal](../../proposals/wp03-section-f-canarian-gofio-picker-boundary-hold-20261013-r46.md). No automated tests were needed or run: this integration changes documentation only. Section F remains open.
