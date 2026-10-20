# WP05 Section V — Brandy Identity Review

Owner: integration lead. Status: accepted for integration on 2026-10-10. Scope: the generic
brandy identity and the exact Food & Wine recipe use; this does not complete Section V or WP05.

## Candidate and disposition

Add `ingredient-ref-brandy` with `brandy / brandy`, category `OTHER`, and French alias
`eau-de-vie de vin`. The OQLF's preferred Québec French term and its English translation are both
`brandy`. Canadian regulations use `eau-de-vie de vin (brandy)` in French, which supports the
qualified legal alias. The current category enum has no beverage/alcohol value; `OTHER` is also used
for white wine, so no schema change is warranted for this identity-only addition.

The OQLF defines brandy as a spirit distilled from wine and warns that some jurisdictions extend
the term to fruit spirits. It identifies Cognac and Armagnac as specific types with additional
standards. Keep `cognac`, `armagnac`, fruit brandies, and generic `eau-de-vie` out of this reference's
aliases; they are not interchangeable global names for the exact product scope.

The bundled recipe corpus has one exact use: recipe 057, ingredient 25, `1 tbsp brandy`, in the
chocolate frosting. Food & Wine's source recipe gives the same line and adds the brandy to the
chocolate syrup before the frosting is cooled. Link only that line, preserving its source wording,
quantity, unit, and group. The corpus search found no other brandy/eau-de-vie ingredient lines or
active reference/legacy identity for these names.

## Measurement and substitution

Keep density null, unit mappings empty, and forms, yields, conversions, and substitution rules
absent. The recipe's tablespoon is a volume quantity; it supplies no mass, density, or volume-to-mass
conversion. The OQLF and CFIA sources support identity and naming only. Record measurement research
as `researched_no_supported_value` for a generic density or mapping.

The exact recipe source gives no alternative to brandy. That is not evidence of a general culinary
equivalence, so record the frosting-context review as blocked pending an authoritative,
context-specific source. Do not suggest Cognac, Armagnac, fruit spirits, or a nonalcoholic ingredient
as a substitute by analogy.

## Sources

All sources were accessed on 2026-10-10.

| ID | Source | Support and limits |
| --- | --- | --- |
| WP05-BRANDY-20261010-S01 | [OQLF, brandy (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/23399232/brandy) | The preferred Québec French term is `brandy`; the English translation is `brandy`. Defines the product as an eau-de-vie distilled from wine, notes jurisdictional extension to other fruit spirits, and describes Cognac and Armagnac as specific types. No measurement or substitution evidence. |
| WP05-BRANDY-20261010-S02 | [CFIA, Labelling requirements for alcoholic beverages](https://inspection.canada.ca/en/food-labels/labelling/industry/alcoholic-beverages) | Lists brandy among standardized alcoholic beverages and treats `Brandy` as a bilingual common name. This confirms the same EN/FR display; it does not establish a cooking conversion. |
| WP05-BRANDY-20261010-S03 | [Food and Drug Regulations, Part B, Division 2 (official bilingual PDF)](https://laws-lois.justice.gc.ca/pdf/c.r.c.%2C_c._870.pdf) | The French regulation uses `eau-de-vie de vin (brandy)`, supporting that qualified French alias. Legal naming only. |
| WP05-BRANDY-20261010-S04 | [Food & Wine, Chocolate Truffle Layer Cake](https://www.foodandwine.com/recipes/chocolate-truffle-layer-cake) | The source lists 1 tablespoon brandy under Chocolate Frosting and adds it to the syrup before cooling. It does not give a substitute or a mass equivalent. |

## Acceptance checks

- Candidate ID is unused and the exact normalized keys `brandy` and `eau de vie de vin` have no
  existing active or legacy owner.
- Link only recipe 057 ingredient 25; do not alter its original text, quantity, unit, or group.
- Add no density, unit mapping, form, yield, conversion, recipe substitution, or broad fruit-spirit
  alias.
- Run reference/package normalization, generated-index freshness, research-ledger validation,
  Python package tests, Android unit tests, and Pixel 9a picker QA after integration.

## Coordinator integration result

Integrated as `ingredient-ref-brandy / brandy / brandy` with the French legal alias and category
`OTHER`. Recipe 057 ingredient 25 now links to the reference with all authored line values intact.
The ledger records the accepted identity, no supported generic density, and a blocked
recipe-context substitution review. Brandy picker and French `eau de vie de vin` search verification
are recorded in the integration batch report. Broader Section V/WP05 coverage remains open.
