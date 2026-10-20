# WP03 Section I chopped pecans form review — 2026-10-12

## Decision

Add `ingredient-form-pecans-chopped` under `ingredient-ref-pecans` with display labels
`chopped pecans / pacanes hachées` and `prepState: chopped`. The sources support the named
preparation in English and Québec French. One recipe specifies coarse chopping, so the form does
not define a common particle size.

Link only these four source-attributed bundled rows:

| Recipe row | Preserved original text | Source basis |
|---|---|---|
| 025#10 | `1.5 cups pecans, chopped` | The Hungary Soul recipe article describes its filling with chopped pecans. |
| 026#6 | `1 1/3 cups chopped pecans` | Eagle Brand recipe card names chopped pecans. |
| 109#2 | `1/2 cup pecans, coarsely chopped` | Preppy Kitchen recipe card names coarsely chopped pecans. |
| 114#20 | `1 cup (125 g) chopped pecans` | Sally’s Baking Addiction source already recorded for this exact row. |

The current Preppy Kitchen card publishes 1½ cups (180 g) of coarsely chopped pecans, while bundled
row 109#2 preserves 1/2 cup. This form review relies on the source’s preparation wording only; it
does not correct or transfer the amount. Rows 053#13 and 067#4 also say chopped pecans but have no
source metadata in the bundled recipe, so they remain unlinked pending provenance.

No recipe text, quantity, unit, preparation string, or optional state changed. No common cut size,
measure, density, unit mapping, conversion, yield, or substitution was added. Whole, sliced, slivered,
ground, blanched, roasted, salted, and other nut/seed forms remain open for source-backed review.

## Evidence

- [Cuisinez, Télé-Québec — Carrés au sirop d’érable et pacanes](https://cuisinez.telequebec.tv/recettes/6555/recette-de-carres-au-sirop-d-erable-et-pacanes) names `pacanes ... hachées`, supporting the French form label. The recipe also permits walnuts, so it is used only for wording.
- [Eagle Brand — Magic Cookie Bars](https://www.eaglebrand.ca/en/recipes/bars-and-cookies/magic-cookie-bars) names chopped pecans in its recipe card. Its recipe quantity is not generalized.
- [Preppy Kitchen — The Best Pecan Pie](https://preppykitchen.com/pecan-pie/) names coarsely chopped pecans. The source’s current quantity differs from bundled row 109#2 and remains outside this form decision.
- [The Hungary Soul — Maple Pecan Cranberry Squares](https://thehungarysoul.com/maple-pecan-cranberry-squares-2/) describes the filling with chopped pecans. Only the prep-state wording is used.
- Sally’s Baking Addiction source `WP03-HI-GAP-20261011-S07` remains recorded on the pecan identity and is reused for recipe 114#20; it names chopped pecans and publishes a recipe-specific 1 cup / 125 g pair.

## Ledger and package scope

The ledger adds an `ingredient_form` record for the chopped pecan form with measurement and substitution
research still `not_yet_researched`. It adds four source entries and reuses the existing Sally’s source
entry. The form has no density. Four recipe rows receive the form ID; all source text and numeric
fields remain byte-for-byte equivalent in meaning.
