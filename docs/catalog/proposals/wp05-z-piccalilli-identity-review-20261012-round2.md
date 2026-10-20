# WP05 Section Z piccalilli identity review

- **Date:** 2026-10-12
- **Status:** Integrated on 2026-10-12 as an identity-only reference with a verified ledger record. See the integration batch README.
- **Plan item:** `docs/RecipeBook-global-ingredient-catalog-plan.txt`, Section Z, “Sauerkraut, pickled cucumbers, capers/caperberries, olives, pickled onions, chutneys, relishes, piccalilli, giardiniera, and mustard-fruit preparations.”
- **Recommendation:** add an identity-only `piccalilli / piccalilli` candidate in `SAUCE_AND_CONDIMENT`, with no aliases or recipe links.

## Proposed identity

| Field | Recommendation |
|---|---|
| Candidate ID | `ingredient-ref-piccalilli` |
| English display | `piccalilli` |
| fr-CA display | `piccalilli` |
| English / French aliases | None |
| Category | `SAUCE_AND_CONDIMENT` |
| Product boundary | A named English-style condiment made from vegetables preserved in vinegar and mustard. Do not reduce it to a generic pickle, relish, mustard, or chutney identity. |
| Numeric and recipe behavior | No form, measure, density, mapping, conversion, yield, substitution, or recipe link. |

The Québec OQLF entry gives preferred French `piccalilli`, the same English term, and defines it as a preserve of gherkins and other vegetables in vinegar and mustard. It labels the product an English condiment [S01]. A current Heinz manufacturer page titled *Sauce Piccalilli* describes its French-market product as a vegetable condiment and lists cauliflower, small onions, and gherkins among the vegetables. Its 44% vegetable content and exact ingredient list are one SKU's formulation, not a universal recipe [S02]. These sources support the borrowed French display without requiring a literal `sauce` alias.

## Exact ownership and adjacent identities

The live exact-key audit used the package's accent-, punctuation-, and case-folded search normalization. It found no exact owner for `piccalilli`, `piccalilli sauce`, `sauce piccalilli`, or the checked spellings `piccalily` and `piccalili` across active reference names/aliases, form labels/match terms, or legacy-candidate names/aliases. The proposed ID `ingredient-ref-piccalilli` is unallocated in both the active and legacy catalogs.

No prior WP05 proposal or integration batch reviews piccalilli. The existing [preserved-condiment demand review](wp05-preserved-condiments-exact-recipe-demand-review-20261010.md) explicitly puts piccalilli outside its six-product scope. Its ledger-only `candidate-relish` decision mentions piccalilli as a boundary example; it is not a piccalilli candidate record or source review. Keep that distinction: the same ledger decision says not to treat relish as synonymous with piccalilli.

Nearby active identities remain separate:

- `ingredient-ref-bread-and-butter-pickle` — `bread and butter pickle / cornichons sucrés`;
- `ingredient-ref-sweet-mango-chutney` — `sweet mango chutney / chutney de mangue doux`;
- `ingredient-ref-mango-pickle` and `ingredient-ref-lime-pickle` — separately named South Asian pickles;
- `ingredient-ref-haitian-pikliz` — Haitian pikliz;
- `ingredient-ref-pickled-mustard-greens` — pickled mustard greens;
- `ingredient-ref-yellow-mustard` — yellow mustard.

Do not add `relish`, `pickle relish`, `mustard pickle`, `chow-chow`, `Indian pickle`, `sauce piccalilli`, or `piccalilli sauce` as global aliases. Some are broader product classes, regional labels, or one manufacturer's title; the reviewed authority only establishes the preferred headword `piccalilli`.

## Recipe demand

I scanned all 114 manifest-listed recipe JSON files (1,123 ingredient rows) for `piccalilli`, `piccalily`, and `piccalili` in full recipe text and ingredient-row fields. There are zero ingredient-row matches and zero recipe-text matches. No line is relinked. The identity is proposed as a distinct catalog gap from Section Z, without claiming current recipe demand.

## Source register

| Source ID | Primary / authoritative source | Claim used and limit |
|---|---|---|
| `WP05-Z-PICCALILLI-20261012-S01` | Office québécois de la langue française, [piccalilli (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059903/piccalilli), accessed 2026-10-12. | Preferred Québec French term `piccalilli`; English equivalent also `piccalilli`; defines a vinegar-and-mustard preserve of gherkins and other vegetables; calls it an English condiment. The entry was last updated in 1979 and does not establish modern recipes or package formulations. |
| `WP05-Z-PICCALILLI-20261012-S02` | Heinz, [Sauce Piccalilli](https://www.heinz.com/fr-FR/produits/05000157076052-sauce-piccalilli), accessed 2026-10-12. | Current manufacturer page uses the product title `Sauce Piccalilli`, describes a crunchy vegetable-and-mustard condiment, and lists cauliflower, small onions, gherkins, vinegar, sugar, malt vinegar, and mustard-containing spices. It supports one product example and French market wording only; its formula and “sauce” title are not promoted to global aliases. |
| `WP05-Z-PICCALILLI-20261012-S03` | Gouvernement du Québec, Répertoire du patrimoine culturel du Québec, [Bocal à relish](https://www.patrimoine-culturel.gouv.qc.ca/detail.do?id=236173&methode=consulter&type=bien), accessed 2026-10-12. | Historical Québec heritage entry describes a relish jar used for a chow-chow-type condiment also called piccalilli, made with pickled cucumber, onion, cauliflower, and green pepper. This supports local historical use and product variation; it does not establish `chow-chow` or `relish` as universal synonyms. |

**Disposition:** recommend one bounded piccalilli identity, with the OQLF-supported name in both locales and no aliases. No recipe, numeric, conversion, preservation, or substitution behavior follows from these identity sources.
