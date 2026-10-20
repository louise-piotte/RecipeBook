# WP03 Section I roasted-peanut form integration — 2026-10-14

Added `ingredient-form-peanuts-roasted` (`roasted peanuts / arachides grillées`) under the existing `ingredient-ref-peanuts` and linked it only to recipe `085#9`. The recipe's original text, optional state, lack of quantity, and chopped preparation were preserved.

The French label follows current Canadian recipe usage; OQLF separately supports `arachides hachées` for chopped peanuts. Dry-roasted and oil-roasted Canadian Nutrient File portions remain source-specific ledger evidence. The form has null density and empty match terms; no unit mapping, conversion, yield, substitution, or extra recipe link was added. Recipe-source roast medium and salt state remain unknown.

Static bundled-package, ledger, generated-catalog, UTF-8, and scoped whitespace validation passed. No app tests or emulator checks were run because this change only adds database JSON data, as allowed by `AGENTS.md`.

Proposal: [`wp03-section-i-roasted-peanut-form-review-20261014.md`](../../proposals/wp03-section-i-roasted-peanut-form-review-20261014.md).

