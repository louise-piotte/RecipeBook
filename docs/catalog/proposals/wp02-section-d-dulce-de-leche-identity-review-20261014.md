# WP02 Section D — dulce de leche identity review (2026-10-14)

**Status: Integrated as an identity-only reference with source-specific CNF 2015 portions.** Add
`dulce de leche / confiture de lait` as a distinct sweet milk spread. OQLF supplies the Québec French
preferred term, accepts *dulce de leche* in French, and lists English *milk jam*. Keep the product
separate from caramel sauce and sweetened condensed milk. Do not generalize to other country-specific
products or recipes. See [the integration note](../batches/wp02-section-d-dulce-de-leche-integration-20261014/README.md).

## Identity decision

| Field | Decision |
|---|---|
| ID | `ingredient-ref-dulce-de-leche` |
| English display | `dulce de leche` |
| Québec French display | `confiture de lait` |
| English alias | `milk jam` |
| French aliases | None; OQLF accepts *dulce de leche* in French, and the phrase is already searchable as the English display. |
| Category | `SAUCE_AND_CONDIMENT`; OQLF defines the product as a *tartinade*. |
| Numeric behavior | `defaultDensity: null`, `unitMappings: []`; three CNF 2015 portions are retained as source-specific ledger observations only. |
| Recipe links and substitutions | None. The manifest recipe corpus has no direct candidate mention. Substitution research remains open. |

OQLF defines the food as a milk-and-sugar spread cooked slowly until caramelized, gives `confiture de
lait` and `dulce de leche` as preferred French terms, and lists `dulce de leche` and `milk jam` in
English. This is direct Québec terminology support, so the French display does not remain
provisional. Since the English display is itself acceptable in French and both display names are
searched, a duplicate French alias is unnecessary.

The Montréal retailer Marché Andes currently lists an 840 g San Ignacio product as `DULCE DE LECHE`
and describes it in French as `confiture de lait`; the page showed it in stock and Canada-wide
delivery during review. The SKU package size is not a portion or generic measure. Health Canada’s
CNF 2015 food code 6789 lists `Dulce de leche (caramelized milk)` / `Dulce de leche (lait
caramélisé)`. It reports 30 mL = 39.3 g, 125 mL = 163.8 g, and 250 mL = 327.6 g. These three
edition- and food-code-specific portions are retained in the ledger. The page does not report a
fill method, so the observations do not establish a default density or general volume conversion.

## Boundaries

- Keep dulce de leche separate from caramel sauce, sweetened condensed milk, caramel candies, and
  chocolate-nut spreads. The fact that one home recipe prepares it from sweetened condensed milk
  does not make the products interchangeable.
- Do not alias `cajeta`, `arequipe`, `manjar`, or Brazilian `doce de leite`; country-specific
  product definitions and milk bases have not been reconciled.
- Do not add `caramelized milk` / `lait caramélisé` as aliases. CNF uses those words as a parenthetical
  description, while OQLF’s preferred Québec name is `confiture de lait`.
- Do not derive an active measure from the Marché Andes 840 g SKU or combine the CNF portions into a
  density. No measurement conversion, substitution, preservation rule, or preparation instruction
  is introduced.

## Ownership and recipe audit

Before integration, no active reference or form owned the exact phrases `dulce de leche`,
`confiture de lait`, or `milk jam`; no legacy candidate or ingredient-reference ledger record used
the proposed ID. The broad `dulce` token already occurs in `ají dulce pepper`, so only the full
compound is used as the new identity. Exact search for `dulce de leche` and `confiture de lait`
resolves to the new row; the partial query `dulce` can show both the pepper and the spread.

The current package contains 114 manifest-listed recipes and 1,123 structured ingredient rows. No
candidate terms appear in a recipe ingredient row, so no recipe link or recipe text changes.

## Source register

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP02-DULCE-DE-LECHE-R104-20261014-S01` | Office québécois de la langue française, [`confiture de lait` (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26544281/confiture-de-lait). | Defines the milk-and-sugar spread; supplies preferred French names and the English equivalents `dulce de leche` and `milk jam`. No recipe variant or measure is inferred. |
| `WP02-DULCE-DE-LECHE-R104-20261014-S02` | Marché Andes, [San Ignacio Dulce de Leche](https://www.marcheandes.com/produit/dulce-de-leche-san-ignacio/). | Current Montréal product listing uses the Spanish title and French `confiture de lait` description. Its 840 g pack is SKU-specific, not a serving measure. |
| `WP02-DULCE-DE-LECHE-R104-20261014-S03` | Health Canada, [Canadian Nutrient File 2015 search, food code 6789](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=6789). | Confirms a separately named bilingual CNF food and lists three source-specific portion weights. The older CNF publication and its volume portions do not supply an active catalog conversion or density. |

## Integration result

The reference is identity-only and has no forms, active measures, density, mappings, recipe links,
conversions, yields, or substitution rules. The three CNF portions remain in the research ledger with
their publication and food-code scope. The related WP06 South American review now points to this
integration while keeping cross-country alias and product-variant comparison open.
