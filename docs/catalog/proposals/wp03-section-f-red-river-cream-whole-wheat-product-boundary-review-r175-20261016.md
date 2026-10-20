# WP03 Section F R175 — Red River Cream of Whole Wheat product-boundary review (2026-10-16)

**Recommendation: hold a separate identity and alias allocation.** Arva Flour Mills currently markets a Red River-branded Cream of Whole Wheat hot cereal and describes its milling fraction and whole-wheat composition. It is a distinct, current Canadian product candidate, separate from the existing generic `cream of wheat hot cereal / crème de blé` reference and the Red River Original and 7 Grain products. The available manufacturer material is English-only; no authoritative or current Québec French product name for this particular whole-wheat fraction was established. Do not invent `crème de blé entier` or `céréales chaudes de blé entier` as a display or alias. Reopen when a Québec-facing label or authoritative terminology source supports the French name.

## Scope and evidence

The candidate is limited to Arva's current Red River Cream of Whole Wheat cereal, marketed in 908 g bags and multipacks. The manufacturer says it is made on-site during milling; small midlings (farina) are extracted at the first and second breaks rather than ground into flour, bran particles remain, and the ingredient is 100% hard red winter wheat [S01]. This supports a dry wheat hot-cereal product boundary. It does not make the product interchangeable with generic cream of wheat, wheat flour, bran, cracked wheat, semolina, or any recipe's whole-wheat cereal.

The existing generic reference `ingredient-ref-cream-of-wheat-hot-cereal` already displays `cream of wheat hot cereal / crème de blé`. Québec-facing French retail and culinary sources use `crème de blé` for the broader hot-cereal category [S02–S03], while the manufacturer calls its new product Cream of Whole Wheat and explicitly distinguishes it from the Original Red River product. Those sources do not establish a Québec French product title for this particular bran-retaining, whole-wheat milling fraction. Mapping its English title to the generic reference would erase the stated whole-wheat product distinction; making a new bilingual row would require unsupported French wording.

This is distinct from R174's oat-rice/hulless-oat proposal, R173's Bob's Red Mill 8 Grain cereal, the integrated Red River 7 Grain identity, and the active Original Red River cereal. Prior Red River records mention this product only as a sibling/boundary; they do not allocate it a reference or dedicated ledger record. No focused review was found for this product candidate.

## Exact proposed delta

**None at this time.** Keep the active reference catalog, legacy identities, ledger, recipe links, forms, measures, conversions, yields, and substitutions unchanged. Do not add a separate product reference, alias on `ingredient-ref-cream-of-wheat-hot-cereal`, or provisional French phrase.

## Ownership and collision review

The active catalog has one exact nearby identity, `ingredient-ref-cream-of-wheat-hot-cereal` (`cream of wheat hot cereal / crème de blé`), with no aliases. It is the broad product class and does not encode the Red River brand or the whole-wheat/milling-fraction distinction. A distinct reference named `Red River Cream of Whole Wheat Hot Cereal` would preserve that product scope, but its French display remains unresolved. Exact candidate phrases `Red River Cream of Whole Wheat`, `Red River Cream of Whole Wheat Cereal`, and `Red River Cream of Whole Wheat hot cereal` have no active reference, form-label/match-term, or legacy-import owner. Existing Original Red River and Red River 7 Grain owners remain untouched. The research ledger contains the existing cream-of-wheat record and Red River sibling/product records, but no dedicated candidate record; prior Arva 7-Grain and Original Red River evidence is cited only as context and is not reissued here.

`cream of wheat` / `crème de blé` should continue to resolve to the existing generic hot-cereal reference. `Red River` should continue to find its existing Original and 7 Grain references; it must not be redirected to this candidate. If a future review adds a separate identity, use only a complete bilingual, product-qualified title and test the current normalized phrase matcher so short `Red River`, `cream of wheat`, and `crème de blé` searches do not falsely imply equivalence. Do not assign `farina` or `midlings` as aliases: the manufacturer describes a milling fraction, not the retail product's name.

## Recipe corpus, measurements, and substitutions

The current manifest's 114 recipe files and 1,123 ingredient rows were searched for the candidate English titles and close French phrases (`Red River Cream of Whole Wheat`, `cream of whole wheat`, `farina`, `midlings`, `crème de blé entier`, and `céréales chaudes de blé entier`); no matching demand or direct candidate link was found. This is a coverage gap, not a request to relink recipes.

The 908 g, 2-pack, and 3-pack values are package quantities. The product page's milling description and ingredient statement provide no household portion, mass-volume relationship, density, or cooking yield. No recipe-specific substitution evidence was found. Keep `defaultDensity` null and unit mappings, forms, measures, yields, conversions, recipe links, and active global/contextual substitutions empty. Do not infer that this product replaces the existing generic cream-of-wheat cereal one-to-one.

## Sources

IDs below are proposal-local and remain unallocated. URLs were checked on 2026-10-16.

| Source ID | Source and evidence | Limits |
|---|---|---|
| `WP03-RR-COWW-R175-20261016-S01` | Arva Flour Mills, [Red River Cream of Whole Wheat Cereal 908 g (Not Original)](https://arvaflourmills.com/products/red-river-cream-of-whole-wheat-cereal-908g), current manufacturer page; lists $CAD pricing, current purchase controls/reviews, milling process, retained bran, and 100% hard red winter wheat. | Primary current Canadian product evidence. English-only; does not establish a Québec French product name, a universal cream-of-wheat process, or kitchen measures. Package quantity is not a serving. |
| `WP03-RR-COWW-R175-20261016-S02` | Metro, [Crème de blé — céréales chaudes](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/flocons-d-avoine-et-cereales-chaudes/cereales-chaudes/p/072400011597), current French Québec grocery listing, checked 2026-10-16. Names a cream-of-wheat hot-cereal product and shows its ingredient declaration. | Supports local category wording for the existing generic product, not the Red River whole-wheat SKU or a terminology ruling. The listed formulation must not be transferred to Arva's product. |
| `WP03-RR-COWW-R175-20261016-S03` | RICARDO, [Des céréales chaudes au petit déjeuner](https://www.ricardocuisine.com/chroniques/a-votre-sante/39-des-cereales-chaudes-au-petit-dejeuner), current Québec culinary article, checked 2026-10-16. Calls cream of wheat `crème de blé` and treats it as a hot breakfast cereal. | Supports broad Québec culinary use only, not a preferred term or product-specific French name for the Red River whole-wheat fraction. |
| Reused `WP03-REDRIVER-20261012-S06` | Arva Flour Mills, [Red River cereal collection (French)](https://arvaflourmills.com/fr/collections/red-river-cereal), existing ledger evidence. Lists Original Red River, Red River 7 Grain, and the non-original cream-of-whole-wheat product as separate products. | Reused solely for sibling distinction; does not provide a French title for this SKU. Do not duplicate its source record. |
| Reused `WP03-REDRIVER-20261012-S07` | Arva Flour Mills, [Red River 7 Grain Hot Cereal](https://arvaflourmills.com/products/red-river-7-grain-hot-cereal), existing ledger evidence. Its ingredient list includes cream of whole wheat as one component. | Reused to distinguish the component from the composite cereal; does not provide a standalone product definition or French name. Do not duplicate its source record. |

## Disposition

Hold the standalone Red River Cream of Whole Wheat identity pending process-matched Québec French naming. Keep the existing generic cream-of-wheat identity and the Original/7 Grain Red River rows unchanged. This proposal does not modify shared seed JSON, ledger, plan, roadmap, code, generated files, or batch records.
