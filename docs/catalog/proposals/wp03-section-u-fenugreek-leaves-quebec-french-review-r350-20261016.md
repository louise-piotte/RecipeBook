# WP03 Section U — Fenugreek leaves Québec-French review (R350, 2026-10-16)

- **Status:** Integrated; see the [R350 integration README](../batches/wp03-section-u-fenugreek-leaves-fresh-dried-form-integration-r350-20261016/README.md).
- **Scope:** Review the existing `ingredient-ref-fenugreek-leaves` Québec-French display, English aliases, separation from fenugreek seeds, and whether fresh and dried leaf states merit forms.
- **Disposition:** Keep the identity and all current names. Add fresh and dried leaf forms under the existing identity; do not add a second fenugreek-leaf identity or change the seed reference.
- **Plan ownership:** Section K already integrated this identity through `wp03-residual-leafy-greens-boundary-review-20261010.md`. Section U still lists fenugreek leaves among a larger open herb group. Treat this as terminology/form review of the existing row, not a new identity or grounds to close the whole Section U line.
- **Scope limits:** No density, unit mapping, conversion, yield, recipe link, substitution, or powder identity is supported here.

## Current catalog and source ownership

The live bundled reference is `ingredient-ref-fenugreek-leaves`, displayed as `feuilles de fenugrec` / `fenugreek leaves`, with English aliases `methi leaves` and `kasuri methi`. It is categorized as `VEGETABLE_AND_AROMATIC`, has no density or unit mappings, and has no attached form. The separate `ingredient-ref-fenugreek-seeds` is displayed as `graines de fenugrec` / `fenugreek seeds` and has no aliases or forms. The generated `BundledIngredientCatalog.kt` projection matches these two live rows. No fenugreek form exists in `ingredient-forms.v1.json`.

The leaf identity and its original source boundary belong to the WP03 residual leafy-plant review. Its ledger record reuses `WP03-RESIDUAL-LEAFY-20261010-S10–S13` (Kew, Metro, TRS, and Venus Dehydrates) and `WP06-SA-20261010-S11–S12` (OQLF and India Spices Board). The separate seed identity belongs to the WP06 South Asian review; it reuses the shared OQLF and India Spices Board sources and the Canadian seed-product listing `WP06-SA-20261010-S33`. Reuse those records rather than duplicating the plant or creating another identity. The additional current sources below are evidence for this review; root may assign ledger IDs if the form proposal is integrated.

## Québec-French terminology findings

The OQLF GDT entry gives the preferred French plant name `fenugrec`, English `fenugreek`, and the Latin name *Trigonella foenumgraecum L.* It does not define a leaf product specifically, and its page says it was last updated in 1982. TERMIUM Plus likewise returns a general plant record with `fenugrec` / `fenugreek` and the botanical name, not a leaf-specific term. The OQLF entry titled `graine de fenugrec` supports the explicit seed phrase, though its subject field is medicine rather than culinary product terminology.

For the leaf product, the existing display `feuilles de fenugrec` is the right part-qualified construction and has current Canadian French-market support. Metro Québec’s product prose repeatedly uses `feuilles de fenugrec` and says the leaves can be used fresh or dried, although the product title itself is only `Fenugrec`. Canadian food supplier Esslinger uses the French product heading `Feuilles de fenugrec` and explicitly contrasts the leaves with ground seeds. A Walmart Canada French listing is titled `PTI Feuilles de fenugrec`; its product description identifies the packaged product as sun-dried leaves. These sources support the existing display and the fresh/dried qualifiers, not an unqualified French alias `fenugrec` for the leaf row.

Health Canada’s French crop-group table lists both `Fenugrec, feuille fraîche (Trigonella foenum-graecum)` and `Fenugrec, feuille séchée (Trigonella foenum-graecum)`. This is a pesticide-residue commodity classification rather than a consumer naming guide, so it supports the taxon and fresh/dried distinction, not culinary measures or conversions. Paired with Québec grocery wording, it supports the French form labels `feuilles de fenugrec fraîches` and `feuilles de fenugrec séchées`.

## Identity boundary and aliases

Keep the current English aliases exactly as qualified:

- **`methi leaves` — keep on the leaf identity.** TRS’s manufacturer page names a `Fenugreek Leaves` product and lists `Methi Leaves` as its ingredient. A Canadian grocery page also markets a fresh-produce bunch as `Fresh Methi Leaves`. The alias identifies leaves; the word `methi` alone is broader.
- **`kasuri methi` — keep on the leaf identity and associate with the dried form.** Venus Dehydrates explicitly defines kasuri methi as dried fenugreek leaves. Its product range distinguishes whole dried leaves from fenugreek leaf powder. A Walmart Canada listing uses the spelling `Kasoori Methi` for dried fenugreek leaves, so that spelling is suitable as a narrow match term on the dried form if root wants to capture the variant. It need not replace the current `kasuri methi` spelling.
- **Do not add bare `methi`, `fenugreek`, or `fenugrec` to the leaf aliases.** Kew’s species record lists `methi` as a common name without specifying leaves; the active seed row and South Asian evidence establish a distinct seed product. OQLF and TERMIUM support the base plant term, which is not leaf-specific. The qualified French names `feuilles de fenugrec` and `graines de fenugrec` should remain separate.
- **Do not add fenugreek powder or leaf powder as a leaf alias/form.** Venus identifies fenugreek leaf powder as a separate fine-powder product, not whole dried leaves. Seed powder wording is also not equivalent to leaves.

The Indian Spices Board’s existing source distinguishes fenugreek seed spice from edible leaves and shoots. Together with the separate catalog rows and product labeling, this supports keeping the leaf and seed identities distinct. No source reviewed supports merging seeds, leaves, leaf powder, or seed powder.

## Recommended forms

Represent state explicitly beneath the existing leaf identity. These forms improve exact phrase matching and provide a form hint without asserting equivalence between states.

| Form ID / code | English label | Québec-French label | Suggested singular match terms | Preparation state |
|---|---|---|---|---|
| `ingredient-form-fenugreek-leaves-fresh` / `fresh` | `fresh fenugreek leaves` | `feuilles de fenugrec fraîches` | EN `fresh fenugreek leaf`; FR `feuille de fenugrec fraîche` | `fresh` |
| `ingredient-form-fenugreek-leaves-dried` / `dried` | `dried fenugreek leaves` | `feuilles de fenugrec séchées` | EN `dried fenugreek leaf`, `kasuri methi`, and optionally the Canadian spelling `kasoori methi`; FR `feuille de fenugrec séchée` | `dry` |

Keep `methi leaves` on the parent reference because that phrase alone does not establish a fresh or dried state. Keep `kasuri methi` on the parent reference and include it as a dried-form match term as well so an exact picker query can yield the dried hint. Do not infer a fresh/dried conversion or treat either form as powder.

## Picker behavior and collision review

`IngredientReferenceSearchIndex` searches reference names, aliases, and form terms. It prioritizes complete query phrases contained within a term, then uses partial matching; a complete form phrase can supply the form hint in the recipe ingredient picker. With the current live data:

| Query | Current catalog result | Note |
|---|---|---|
| `feuilles de fenugrec` | Leaf identity | Part-qualified French phrase is specific. |
| `graines de fenugrec` | Seed identity | Part-qualified French phrase is specific. |
| `fenugreek`; `fenugrec` | Both leaf and seed identities | The base term occurs in both references; keep the result set ambiguous. |
| `methi leaves`; `kasuri methi` | Leaf identity | Current English aliases resolve the leaf row; no form hint exists yet. |
| `methi` | Leaf identity only in the current catalog | The one-word query matches a word inside `methi leaves` / `kasuri methi` because the matcher accepts a phrase contained in a longer term. This behavior can overstate the specificity of the user’s unqualified word, even though the catalog has correctly avoided a bare `methi` alias. |
| `fresh fenugreek leaves`; `dried fenugreek leaves`; corresponding French qualified phrases | No matching form hint, and the longer query currently does not match the shorter base name | Adding the two exact forms above would make these full phrases select the leaf identity with the appropriate state hint. |

No seed alias should be added for `methi` merely to force the search result to show both rows: that would create another broad term assignment, not correct the phrase-boundary behavior. A future picker change could address short queries that match only one word of a multiword alias; that is outside this data and terminology recommendation.

## Bundled recipe demand and limits

I scanned all 114 manifest-listed bundled recipe files and their 1,123 ingredient-list rows. There are no matches for `fenugreek`, `fenugrec`, `methi`, `kasuri methi`, `methi leaves`, or `feuilles de fenugrec`. This review does not request recipe relinking or a recipe-specific quantity. Product package sizes, the Metro produce unit, and the Health Canada commodity table are not reusable ingredient measures.

## Sources consulted

Sources were accessed 2026-10-16. Retail listings can change and are cited for product labels and state wording only.

1. Office québécois de la langue française, [GDT — “fenugrec”](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095264/fenugrec). Preferred French plant term, English equivalent, and botanical name; not leaf-specific; last updated 1982.
2. Office québécois de la langue française, [GDT — “graine de fenugrec”](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19087424/graine-de-fenugrec). Supports the qualified seed phrase; subject field is medicine.
3. Government of Canada, TERMIUM Plus, [“FENOGRECO” record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=alt&lang=eng&srchtxt=FENOGRECO). Supports general `fenugreek` / `fenugrec` plant terminology and Latin name; no leaf-specific record surfaced in the leaf-phrase search.
4. Health Canada, [“Groupes de cultures et propriétés chimiques de leurs résidus”](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html), subgroup listings for `Fenugrec, feuille fraîche` and `Fenugrec, feuille séchée`. Official commodity classification supports the botanical leaf product and fresh/dried states, not recipe conversions.
5. Metro Québec, [“Fenugrec” produce listing](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/legumes-exotiques/feuilles-de-fenugrec/p/4994). The French description identifies trifoliate leaves and says they may be used fresh or dried; the product title is unqualified `Fenugrec`.
6. Esslinger Foods, [French-language “Feuilles de fenugrec” product page](https://esslingerfoods.com/fr/products/feungreek-leaves). Current Canadian product wording; its description distinguishes leaves from ground seeds. It does not state fresh/dried state.
7. Walmart Canada, [French “PTI Feuilles de fenugrec” listing](https://www.walmart.ca/fr/ip/PTI-Feuilles-de-fenugrec/6000196867605). French product heading and seller description identifying sun-dried leaves; retailer wording only.
8. TRS, [“Fenugreek Leaves”](https://www.trsfood.com/product/trs-fenugreek-leaves/), product and ingredients sections. Manufacturer product label lists `Methi Leaves`; supports the qualified alias but does not define bare `methi`.
9. Venus Dehydrates, [“Kasuri Methi”](https://www.dehydratedvegetables.in/kasuri-methi.html), product description and range. Manufacturer identifies kasuri methi as dried fenugreek leaves and separates whole leaf from leaf powder.
10. Walmart Canada, [“MDH Kasoori Methi”](https://www.walmart.ca/en/ip/MDH-Kasoori-Methi/6000196835929). Canadian product listing identifies dried fenugreek leaves under the `Kasoori Methi` spelling; spelling-variant evidence only.
11. Royal Botanic Gardens, Kew, [Plants of the World Online — *Trigonella foenum-graecum*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:523957-1/general-information), accepted name, uses, and common-name list. Supports the taxon and records `methi` as a common name, but does not scope bare `methi` to leaves.
12. India Spices Board, [“Fenugreek”](https://www.indianspices.com/indianspices/spice-catalog/fenugreek.html), botanical name and seed/leaf use sections. Reused WP06 source `WP06-SA-20261010-S12`; distinguishes seed spice from edible leaves and shoots.
13. Fine India Grocers, [“Fresh Methi Leaves / Bunch”](https://fineindia.ca/products/fresh-methi-leaves-bunch), Canadian grocery product page. Supports a fresh, leaf-qualified `methi` name; inventory can change and the listing is product usage, not a Québec terminology ruling or a measure.

## Integration notes

- Kept `ingredient-ref-fenugreek-leaves` and `ingredient-ref-fenugreek-seeds` separate and preserved the existing bilingual displays and aliases.
- Added `ingredient-form-fenugreek-leaves-fresh` and `ingredient-form-fenugreek-leaves-dried` under the existing leaf reference. Added exact singular terms for fresh and dried English/French phrases, plus `kasuri methi` and `kasoori methi` only on the dried form.
- Did not add bare `fenugreek`, `fenugrec`, or `methi` aliases. Bare `fenugreek` / `fenugrec` still returns both rows; bare `methi` still selects the leaf row through a word inside its multiword aliases, so the picker limitation remains.
- Kept powders, quantities, conversions, yields, recipe links, and substitutions out of active data. No software tests were run for this database JSON addition under the updated `AGENTS.md` rule.
