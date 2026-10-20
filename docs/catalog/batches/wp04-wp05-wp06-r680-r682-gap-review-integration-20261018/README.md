# WP04–WP06 R680–R682 — grouper addition and naming holds

Integrated 2026-10-18. This batch adds one species-neutral fish market-name group and records two bounded identity holds.

## R680 — grouper / mérou market-name group

Added identity-only `ingredient-ref-grouper-market-group` with visible bilingual scope: `grouper (name used for multiple fish species) / mérou (nom utilisé pour plusieurs espèces de poissons)`. A Health Canada report summarizes the CFIA Fish List as applying grouper wording to several Serranidae taxa, and OQLF uses `mérou` broadly for this family, particularly *Epinephelus* and *Mycteroperca*. A current Montréal retailer lists grouper fillets but supplies no binomial or French product term; a dated supplier sheet separately lists `filet de mérou noir / black grouper fillet` without a binomial. These sources support the broad market group, not a species identity. [Health Canada report](https://www.canada.ca/content/dam/hc-sc/migration/hc-sc/fn-an/alt_formats/hpfb-dgpsa/pdf/nutrition/risk-risque_strat-eng.pdf), [CFIA Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), [OQLF `mérou`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428135/merou), [MTL Meats listing](https://mtlmeats.ca/products/grouper), and [Poissonnerie La Mer arrival list dated 2026-04-28](https://cdn.shopify.com/s/files/1/0287/2662/4338/files/Arrivages_Poissonnerie_28-04-2026.pdf?v=1777318537).

- Kept Red Grouper, Black Grouper, `mérou noir`, supplier fillet wording, aliases, and taxon fields outside the group.
- Added no forms, measures, density, unit mappings, conversion, yield, recipe link, or substitution. The 114-recipe / 1,123-row bundle has no matching grouper demand.
- Added five new source IDs and six record-level source entries, reusing the existing CFIA Fish List overview source ID. Measurement and substitution research are recorded as researched with no supported value/substitute.

## R681 — Nigerian pepper-soup spice naming hold

The English product identity is supported by a Nigerian primary study and current Nigerian and Canadian product listings, but the proposal's `mélange d’épices pour soupe nigériane épicée` display is not directly attested as a Québec product name. The French-language sources reviewed use `soupe au poivre` for the Nigerian dish; a French recipe uses the phrase `mélange d'épices soupe au poivre`, but does not establish that proposed catalog display. A Montréal restaurant menu presentation also lists `Soupe au Poivre`, which supports the dish name locally, not a packaged seasoning name. [Koki Afrique recipe](https://www.kokiafrique.com/dishes/pepper-soup/), [Montréal restaurant menu presentation](https://prezi.com/p/waqyyjoqukvg/la-cuisine-nigerianne/), and [AfroSmartShop French recipe](https://www.afrosmartshop.com/fr/recettes/soupe-africaine-au-poivre-poulet/).

Under the plan's rule against invented translations, kept the candidate outside active references and the research ledger until a product-matched Québec French display is supported or independently reviewed. No alias, recipe link, form, numeric value, or substitution was added.

## R682 — brown-sauce identity hold

Kept generic brown sauce outside active data. OQLF's `sauce brune` entry defines a stock-based foundation sauce, while its 2025 `sauce` entry says *gravy* applies more specifically to a brown sauce. Heinz describes its named HP product as `sauce brune anglaise`; this is product-specific wording. Québec product pages also use the unqualified term for a local sauce product and a dry sauce mix, so it is unsafe as a global alias for the British condiment. The recipe corpus has no matching demand. [OQLF `sauce brune`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8431654/sauce-brune), [OQLF `sauce`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059945/sauce), [Heinz HP product page](https://www.heinz.com/fr-FR/produits/05000111001007-hp-brown-flacon-verre-255-g-x-12), [Aliments du Québec `Sauce brune`](https://alimentsduquebec.com/aliments-dici/assaisonnements-sauces-et-condiments/sauce-brune-2), and [Mayrand `Mélange pour sauce brune`](https://mayrand.ca/fr/nos-produits/epicerie/sauce/sauce-deshydratee/melange-pour-sauce-brune-berthelet-00654).

No reference, candidate, ledger source, alias, form, measurement, recipe link, or substitution was added. Revisit only when demand identifies a specific British condiment and a safe Québec French display.

## Validation

The bundled package normalized with zero changed parts and passed `--check` and `--validate-only`. Ingredient-reference normalization and the generated catalog check passed at **1,838 references**. The ledger schema/custom validator passed with **2,216 records and zero errors**; it contains **10,383 source entries, 8,766 distinct source IDs, and 7,415 distinct URLs**, with no source ID mapped to multiple URLs.

The picker projection returns the new group alone for `grouper` and `mérou`; `red grouper`, `black grouper`, and `mérou noir` still return no active reference. Brown-sauce and pepper-soup queries have no active result. The full corpus contains **114 recipes / 1,123 ingredient rows** and has zero matches for the R680–R682 candidate phrases.

Database JSON remains ASCII-only with escaped Unicode, UTF-8 without BOM, and final newlines. Seven scoped documents passed UTF-8/no-BOM, local-link, and whitespace checks; the plan links validated across 1,804 local Markdown targets. No software tests, build, emulator, or deployment were run: R680 only adds database JSON, and R681/R682 are documentation-only holds under the updated `AGENTS.md` rule.

See the [R680 proposal](../../proposals/wp04-section-p-grouper-market-group-review-r680-20261018.md), [R681 proposal](../../proposals/wp06-nigerian-pepper-soup-spice-blend-review-r681-20261018.md), [R682 proposal](../../proposals/wp05-section-z-brown-sauce-identity-boundary-review-r682-20261018.md), and the [global plan](../../../RecipeBook-global-ingredient-catalog-plan.txt).
