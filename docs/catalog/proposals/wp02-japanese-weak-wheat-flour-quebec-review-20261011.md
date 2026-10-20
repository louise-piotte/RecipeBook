# WP02 Québec terminology review: Japanese weak wheat flour (hakurikiko)

## Integration status

Root review integrated on 2026-10-11. Retained the qualified French display and alias as provisional constructions; no catalog fields or recipe links changed. The independent Québec sources and decision are recorded in the research ledger and in [`wp02-wp03-wp04-quebec-flour-sushi-rice-serrano-portion-integration-20261011`](../batches/wp02-wp03-wp04-quebec-flour-sushi-rice-serrano-portion-integration-20261011/README.md).

## Recommendation

**Retain the identity and both French terms as currently integrated.** The display `farine de blé tendre japonaise (hakurikiko)` uses an OQLF-preferred Québec term for the low-gluten soft-wheat flour family and keeps the Japanese class qualifier visible. The alias `farine de blé mou japonaise` uses the OQLF-listed alternate term with the same qualifier. Keep the French wording provisional as a transparent class translation, not as a Québec-attested name for a particular Japanese product.

Do not alias this row to unqualified `farine de blé tendre`, `farine de blé mou`, `farine à gâteau`, or `cake flour`. Do not add a recipe link or product-level flour specification from this terminology review.

## Québec and Canadian French evidence

The Office québécois de la langue française (OQLF) defines *farine de blé tendre* as a flour lower in gluten, used mainly for cakes, biscuits, and similar pastry. It lists both *farine de blé tendre* and *farine de blé mou* as preferred terms for English *soft wheat flour*. This directly supports the generic basis of the display and alternate alias, but does not attest either Japanese-qualified phrase as a fixed term.

Canadian French usage supports the selected head term. Metro’s French flour guide describes *farine de blé tendre* as low in gluten and appropriate for pastry; its separate sections distinguish that family from *farine à gâteau* and *farine à pâtisserie*. A Québec product listing uses *Farine de blé tendre Tipo 00* as its French title. Ardent Mills’ French Canadian flour portfolio also uses *farine de blé tendre* for a category containing cake and pastry flours. These sources support the wording, while showing that *farine de blé tendre* is a broader family label rather than a Japanese-specific label.

The Canadian product listing found for Japanese Nissin Violet flour is Suzuya Japanese Market in Burnaby, British Columbia. Its English title is `Nissin Violet Flour 1kg` and its description calls that named item `Cake flour great for pastries, tempura, etc.` The page does not use a French label or identify its title as a general translation rule for all Japanese weak wheat flour. Targeted searches did not locate a Québec or Canadian French listing for a Japanese `hakurikiko` product. Therefore, keep the French compound explicitly qualified and provisional; do not describe it as a label copied from a Canadian product.

## Class versus cake flour

Japan’s Ministry of Agriculture, Forestry and Fisheries classifies 薄力粉 by its low gluten amount and soft quality, and lists cakes, many confections, and thickening among its uses. That supports `Japanese weak wheat flour (hakurikiko)` as a distinct national flour class. The source gives no class-wide numeric composition and does not state equivalence to North American cake flour.

The Canadian Suzuya page shows that `cake flour` is used commercially for one Nissin Violet item. Metro’s French guide separately describes cake flour as a more specific product type, with fine milling and lower protein/gluten, and distinguishes it from pastry flour. Product-level use of `cake flour` is useful evidence of overlap, but it does not make the whole Japanese class synonymous with generic Canadian or North American cake flour. Preserve the existing generic `cake flour / farine à gâteau` identity and do not add `Japanese cake flour`, `cake flour`, or `farine à gâteau` as aliases to the Japanese row.

## Current catalog search review

The current reference search normalizes accents and returns exact word phrases found within a display or alias before it falls back to partial matching. Against the current catalog:

| Query | Current result |
|---|---|
| `hakurikiko` | Only `ingredient-ref-japanese-weak-wheat-flour` |
| `Japanese weak wheat flour` | Only `ingredient-ref-japanese-weak-wheat-flour` |
| `Japanese soft wheat flour` | Only `ingredient-ref-japanese-weak-wheat-flour` |
| `farine de blé tendre japonaise` | Only `ingredient-ref-japanese-weak-wheat-flour` |
| `farine de blé mou japonaise` | Only `ingredient-ref-japanese-weak-wheat-flour` |
| `farine de blé tendre` | 11 references: the Japanese row plus the existing six French-grade and four Italian-grade rows |
| `farine de blé mou` | Only the Japanese row, because its qualified alias is the only current term using *blé mou* |
| `cake flour` | Only the generic `ingredient-ref-cake-flour` row |
| `Japanese cake flour` | No result |

The unqualified `farine de blé mou` query therefore returns one Japanese-specific candidate under current prefix-phrase behavior. This is a known broad-query asymmetry, not a reason to turn the Japanese identity into a generic soft-wheat or cake-flour synonym. Keep the alias qualified in stored data and revisit broad French query coverage only as a catalog-wide search task.

## Scope limits

No current recipe row or seed text identifies *hakurikiko*, 薄力粉, Japanese weak/soft wheat flour, or the proposed French name. Existing cake-flour recipe rows remain attached to generic cake flour. This review makes no change to ingredient identity fields, forms, density, unit mappings, recipe links, measurements, conversions, yields, or substitutions.

## Sources

| Source | Evidence used |
|---|---|
| [OQLF, *farine de blé tendre*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357375/farine-de-ble-tendre) | Québec preferred terms *farine de blé tendre* and *farine de blé mou*; definition describes lower-gluten flour used for cakes and biscuits. It does not attest the full Japanese-qualified phrase. |
| [Metro, *Farine 101*](https://api.metro.ca/produits-a-decouvrir/boulangerie/nos-pains-patisseries-et-farines/farine-101-guide-des-different-type-et-usages) | Canadian French usage for soft-wheat flour; separately treats *farine à gâteau* and *farine à pâtisserie* as more specific types. |
| [Québec French product listing, *Farine de blé tendre Tipo 00*](https://www.bannieresdeproximite.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/farines-et-essentiels-de-cuisson/farine-de-ble-tendre-tipo-00/p/779921020014) | Canadian retail title and ingredient wording using *farine de blé tendre* for a named flour product; not Japanese flour. |
| [Ardent Mills, French flour portfolio](https://www.ardentmills.ca/media/2155/portefeuille-de-farines.pdf) | Canadian miller uses *farine de blé tendre* as an umbrella category including cake and pastry flour; product pages distinguish individual flours. |
| [Suzuya Japanese Market, *Nissin Violet Flour 1kg*](https://suzuya.ecwid.com/Nissin-Violet-Flour-1kg-p808562702) | Burnaby retailer’s English listing calls one Violet item cake flour for pastry and tempura. Product-level usage only; it is not a Canadian French label or class-wide equivalence. |
| [Japan MAFF, *小麦粉の種類について教えてください*](https://www.maff.go.jp/j/heya/sodan/1106/02.html) | Official Japanese class description: 薄力粉 has less gluten and a soft quality and is used for cakes, confectionery, and thickening; no North American cake-flour equivalence is stated. |
