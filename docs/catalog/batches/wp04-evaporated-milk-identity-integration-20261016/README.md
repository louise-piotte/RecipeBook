# WP04 evaporated-milk identity integration

## Result

Verified the existing `ingredient-ref-evaporated-milk` identity as a milk product with water
removed. The bilingual catalog name remains `evaporated milk / lait évaporé`. Canadian standards
distinguish it from sweetened condensed milk and from evaporated skim and partly skimmed products;
the current Canadian Carnation page uses `Lait évaporé` as the product title.

The OQLF's 1982 entry discusses the broader category `produit laitier concentré` and its terminology
note does not identify the current retail product label. No `lait concentré` or `lait condensé`
aliases were added. No reference, form, measure, density, unit mapping, conversion, yield,
substitution, or recipe link was added. Recipe 114's existing 354 ml ingredient remains unchanged.

## Research ledger

- Set the existing identity record's `identityState` to `verified` and recorded the CFIA English and
  French standards, current Carnation product name, and OQLF category boundary.
- Kept measurement data blocked and added no active catalog facts.
- The WP08 whole-milk finding remains blocked: the general substitution tables agree on 1/2 cup
  evaporated milk plus 1/2 cup water for 1 cup whole milk, but they do not test the bundled recipe
  and their source-cup values are not converted to RecipeBook's unit basis.

## Verification

Static ledger schema and reference checks were run after integration. No app tests or emulator checks
were run; this update contains research-ledger JSON and documentation only, as allowed by
`AGENTS.md`.

## Sources and proposal

See [the identity review proposal](../../proposals/wp04-evaporated-milk-identity-review-20261016.md)
for source links and the full terminology disposition.
