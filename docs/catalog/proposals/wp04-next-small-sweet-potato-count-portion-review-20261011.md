# WP04 proposal: recipe-specific sweet-potato count portion

**Review date:** 2026-10-11
**Status:** Proposal-only. One source-specific recipe portion is supported; no general sweet-potato count conversion is proposed.

## Disposition

For the exact bundled line `090#13`, the current Cotter Crunch recipe card pairs **10 ounces (280 g)** of peeled, cubed sweet potatoes with **about 2 small** sweet potatoes. This is a new recipe-specific count-to-mass observation for the existing sweet-potato reference. Preserve the publisher's stated mass and approximate count together as one source-specific portion; do not derive an exact per-item weight, reinterpret it as purchase weight, or activate a reusable count mapping.

The page does not say whether 280 g is weighed before or after peeling, so its edible-versus-purchase basis remains unknown. Record that limit in the evidence. The recipe's preparation text (peeled and diced) and the source card's (peeled and cubed) match at the product/preparation level; the source gives no dice size.

## Exact bundled demand and source match

| Recipe line | Exact bundled record | Linked source match |
| --- | --- | --- |
| `090#13`; recipe UUID `89f89f5e-4afc-4e3a-b37f-e7841ac24ff8`; ingredient UUID `89f89f5e-4afc-4e3a-b37f-e7841ac24ff8-ingredient-13` | `2 small sweet potatoes, peeled and diced`; quantity `2`; unit `count`; reference `ingredient-ref-sweet-potato`. Instructions add the potatoes to the stew and simmer 40–60 minutes. | Cotter Crunch's *African Peanut Stew* recipe card says `10 ounces (280 g) sweet potatoes, peeled and cubed (about 2 small)`. The page was updated 2022-07-20 and its card yields 4–6. This is the exact linked recipe source, with a matching approximate count, size label, and peeled preparation. |

The source page also displays an exact paired amount of 10 ounces and 280 g. Preserve the publisher's pair as written; do not replace 280 g with a mathematically recalculated ounce conversion. The recipe page's “about” qualifier makes the count approximate, even though the bundled line says two.

## Supported and unsupported data

### Supported for this recipe source only

- Cotter Crunch reports 10 oz / 280 g for sweet potatoes, peeled and cubed, and says this is about two small potatoes.
- The mass and approximate count describe the same source recipe's ingredient. They support a recipe-specific `count_weight` observation linked to `090#13`, retaining “about” and the publisher's wording.
- The source card does not label the ingredient “raw”; the recipe context indicates it is peeled and cubed before it is simmered with the other ingredients.

### Limits and unsupported generalizations

- The source does not specify whether it weighs the potatoes before or after peeling. Do not label 280 g as a confirmed edible-portion weight or as an as-purchased gross weight.
- “About 2 small” does not define a diameter, length, variety, or retail-size class. Do not divide 280 g by two and create a 140 g per-potato observation.
- Health Canada's CNF 2015 raw sweet-potato entry lists one medium root, not a small one; it does not resolve this line's size. USDA's 1986 codebook lists a different source-defined small raw root (less than 1-3/4 inches in diameter) at 65 g edible portion. Neither government record should replace or be averaged with this recipe's own approximate amount.
- No source here establishes a reusable `small sweet potato` weight, size distribution, peeling loss, cooked mass, raw-to-cooked yield, volume mapping, or substitution.

## Disjointness and prior-source audit

The current ledger's `ingredient-ref-sweet-potato` record has no sources or measurement observations (`measurementState: not_yet_researched`). The exact Cotter Crunch URL is already recorded for separate stew-meat evidence under `WP04-STEW-MEAT-20261010-S01`, and appears in a WP05 sauce packet for its separate tomato-sauce claim. Neither existing source claim records a sweet-potato amount. This proposal covers the new `(ingredient-ref-sweet-potato, 090#13, recipe-card portion)` evidence pair only; it does not repeat either prior claim.

## Proposed ledger-only delta

On acceptance, add one source record and one source-scoped observation to `ingredient-ref-sweet-potato`:

- Source ID: `WP04-SWEETPOTATO-PORTION-20261011-S01`.
- Source kind: `other` (publisher recipe card).
- Observation relationship: `count_weight`; evidence kind: `published_portion`.
- Source quantity: about 2 small sweet potatoes, peeled and cubed; source-published mass: 280 g (the card also displays 10 oz).
- Food state: source recipe context indicates peeled and cubed before simmering; “raw” is not explicit source wording.
- Quantity basis: publisher does not state whether the 280 g amount is before or after peeling; retain approximate count and unresolved weighing stage.
- Keep `defaultDensity: null`, `unitMappings: []`, and all active conversions/substitutions unchanged. Leave recipe text and amount untouched.

This is evidence for one publisher's recipe portion only, not a generic sweet-potato portion or conversion.

## Source register

Sources accessed 2026-10-11 unless noted. Existing IDs are shown where earlier WP04 evidence is reused as boundary context.

| Source ID | Source and locator | Claim and limit |
| --- | --- | --- |
| `WP04-SWEETPOTATO-PORTION-20261011-S01` | Lindsay Cotter, Cotter Crunch, [African Peanut Stew](https://www.cottercrunch.com/crock-pot-west-african-peanut-stew/), recipe card “Ingredients,” page updated 2022-07-20. | Direct publisher source for bundled recipe 090. Lists 10 oz (280 g) sweet potatoes, peeled and cubed, “about 2 small.” It does not specify the weighing stage or define “small.” |
| `WP04-WP12-PRODUCE-20261010-S12` | Health Canada, [Sweet potato, raw, CNF 2015, Food Code 2240](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2240), serving-size and refuse tables. | Lists one medium raw sweet potato = 130 g, with 28% refuse. No small portion; not used for this recipe's small count. |
| `WP04-SWEETPOTATO-PORTION-20261011-S02` | USDA Agricultural Research Service, [Manual of Food Codes for Individual Intake, October 1986](https://www.ars.usda.gov/ARSUserFiles/80400530/pdf/8586/csfii85_4days_codebook.pdf), printed p. 648 / PDF page 656, food code 734-0100, *Sweetpotato, NFS*. | Historical table lists 1 small (less than 1-3/4 in diameter, raw) = 65 g in the edible-portion column. Its explicit size boundary does not match an unmeasured recipe potato, and it conflicts in scale with the publisher's approximate 280 g pair. Retained only as a reason not to generalize “small.” |

## Acceptance checks

1. Preserve the publisher's exact pair `10 oz (280 g)` and its qualifier `about 2 small`; do not calculate a per-potato mass or alter its rounding.
2. Link the observation only to `ingredient-ref-sweet-potato` and the exact recipe/source context `090#13`.
3. Record the weighing stage as unknown; do not claim 280 g is confirmed edible mass or purchase weight.
4. Keep the CNF medium portion and USDA historical small portion source-qualified and separate; do not use either to replace or average the publisher's recipe amount.
5. Add no default density, unit mapping, conversion, cooking or peeling yield, substitution, or recipe edit.
6. Treat this packet as proposal-only. No shared ledger, seed, checklist, plan, roadmap, package, generated file, or test is changed here.

## Validation

The proposal is UTF-8 without a byte-order mark. Whitespace and encoding checks apply to this file only. No tests were run.
