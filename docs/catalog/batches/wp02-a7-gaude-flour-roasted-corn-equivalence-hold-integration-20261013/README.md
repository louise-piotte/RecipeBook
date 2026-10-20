# WP02 A7 gaude flour / roasted-corn-flour equivalence hold — 2026-10-13

## Decision

Keep French mill `farine de gaude` unallocated. Do not add it as an alias to the active
`ingredient-ref-roasted-corn-flour` or create another corn-flour identity. The French source names a
standalone roasted-corn product, but the reviewed evidence does not establish equivalence with the
active Québec mill's functional roasted-corn flour or provide a Québec French label for `gaude`.

Moulin Taron describes gaudes as corn flour roasted over a wood fire and milled on stone. Its current
product list sells 1 kg bags of roasted corn flour (Gaudes) and roasted corn semolina separately.
Les Moulins de Soulanges describes its active Québec roasted-corn flour as heat-treated to promote
starch gelatinization for baking. OQLF's `gaude` entry is a dye-plant term; the generic `farine de
maïs` entry does not give a roasted qualifier. These sources leave the Québec display and product
equivalence unresolved.

The current catalog snapshot contains 1,383 references, 100 forms, 63 legacy candidates, and 1,714
ledger records. No exact `gaude`, `gaudes`, or `farine de gaude` owner was found. The bundled corpus
has 114 recipes and 1,123 ingredient rows; none requests gaude, toasted corn flour, or the active
roasted-corn-flour identity.

No active reference, alias, form, ledger candidate, measure, recipe link, conversion, yield, or
substitution was added. No existing row was changed. The existing generic `toasted corn flour` hold
also remains unchanged; this review is scoped to the maker-named gaude product.

## Sources

- [Moulins Bourgeois — 2024 French EU catalogue](https://www.moulins-bourgeois.com/wp-content/uploads/2024/10/Catalogue-FR-UE.pdf): lists *Farine de gaude Bio*, describes it as toasted corn flour, and gives a 15 kg bakery bag. This French-market producer evidence does not specify processing profile or Québec naming.
- [Moulins Bourgeois — 2024 English EU catalogue](https://www.moulins-bourgeois.com/wp-content/uploads/2024/10/Catalogue-EN-EU-1.pdf): pairs the maker's French product name with *Toasted corn flour*; this is not a universal translation or equivalence.
- [Moulin Taron — mill presentation](https://www.gaudes-de-chaussin.com/qui-sommes-nous.htm): describes the regional flour as wood-fire-roasted corn flour, stone-milled, and used in preparations including the porridge also called *les gaudes*.
- [Moulin Taron — current product list](https://www.gaudes-de-chaussin.com/produits.htm): lists roasted corn flour (Gaudes) and roasted corn semolina separately, each in a 1 kg package.
- [OQLF — *gaude*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17052183/gaude): the entry is in the furniture/dye-plant domain and does not attest a Québec food term.
- [OQLF — *farine de maïs*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432786/farine-de-mais): defines generic fine ground-maize flour and pairs it with *corn flour*, without a toasted or roasted qualifier.
- [Les Moulins de Soulanges — *Farine de Maïs Torréfié*](https://moulinsdesoulanges.com/language/fr/farine-de-mais-torrefie/): identifies the active Québec product as a functional flour heat-treated to promote starch gelatinization for baking.
- [Afromarket — Djinkoumé](https://afromarket.ca/index.php/produit/djinkoume-farine-de-mais-torrefie-1kg/): a Québec-market retail page pairs generic *farine de maïs torréfié* with *roasted corn flour*; it does not name gaude.

The full exact-key, picker, recipe, package, and product-boundary review is in the [R59 proposal](../../proposals/wp02-a7-gaude-flour-roasted-corn-equivalence-boundary-review-20261013-round59.md).

## Validation

- Root independently reviewed the OQLF terminology pages, Moulin Taron's current mill/product pages, and the active Québec mill's product page.
- The exact-key recheck found no gaude owner across 1,383 references, 100 forms, 63 legacy candidates, and 1,714 ledger records.
- The 114-recipe / 1,123-row audit and picker boundary are detailed in the proposal.
- No database JSON changed. This documentation-only hold needed no app tests or emulator checks.
