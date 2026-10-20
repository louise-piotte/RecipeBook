# WP03 Section J green-onion and pearl-onion integration

Integrated 2026-10-11 from reviewed proposals. This batch changes bundled ingredient-reference JSON, the research-ledger JSON, the catalog plan, roadmap, and batch documentation. It does not change recipe content or application code.

## Catalog changes

- Kept `ingredient-ref-green-onions` as the single green-onion/scallion identity. Added only `green onion`, `scallion`, `oignon vert`, and OQLF's accepted `ognon vert` spellings. The generic French labels, null density, and empty unit mappings remain.
- Verified the green-onion identity in the ledger from OQLF and Agriculture and Agri-Food Canada evidence. Added eight sources and seven Health Canada CNF food-code 2144 observations: three size-qualified raw count portions and four chopped metric-volume portions. They remain research observations only; no runtime mapping, density, yield, package conversion, form, or substitution was added.
- The CNF portion page is accessed 2026-10-11 and lists a 2019-03-01 modification date. The date wording in the proposal and observation methods was corrected accordingly.
- Added `ingredient-ref-pearl-onion` for raw pearl onions / `oignon perlé`, with narrow spelling and pickling-onion aliases. Its evidence supports an identity only; no form, recipe link, measurement, conversion, yield, or substitution was added. Prepared pickled/cocktail onions remain outside the raw identity.
- Kept spring-onion, bunching-onion, ciboule, and Québec `échalote verte` boundaries out of the green-onion aliases. Recipe 019#6 and 066#3 remain unchanged. The current Kitchn page's “3 medium scallions” wording is recorded as source drift, not copied into the older bundled recipe.

## Sources and review packets

The identity and alias decisions use [OQLF's green-onion entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083674/oignon-vert), [AAFC's Canadian allium crop profile](https://agriculture.canada.ca/en/science/agriculture-and-agri-food-research-centres/pest-management-centre/pesticide-risk-reduction-pest-management-centre/crop-profiles/crop-profile-allium-vegetables-canada-2024), and [Health Canada's CNF serving portions for code 2144](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2144). Pearl-onion evidence uses [OQLF's `petit oignon` entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870618/petit-oignon) and [Metro's fresh red pearl-onion listing](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/oignons-et-poireaux/oignons-perles-rouges/p/033383603513).

- [Green-onion/scallion identity review](../../proposals/wp03-j-green-onions-scallions-review-20261011.md)
- [Spring-onion/pearl-onion boundary review](../../proposals/wp03-j-spring-pearl-onion-boundary-review-20261011.md)

## Validation

- 1,009 ingredient references, 66 forms, 114 recipes, and 1,123 ingredient rows.
- 1,290 research-ledger records, 4,139 source entries, and 3,387 distinct source IDs.
- Ingredient-reference normalization check passed.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` passed.
- `git diff --check` passed for the changed catalog, plan, and proposal files.
- No tests were run: this batch adds database JSON only, as specified in `AGENTS.md`.
