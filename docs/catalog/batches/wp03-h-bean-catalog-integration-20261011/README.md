# WP03 Section H bean and lentil-name integration

Integrated 2026-10-11 from reviewed proposals. This batch changes only bundled library and research-ledger JSON plus the catalog plan/roadmap documentation.

## Catalog changes

- Added `ingredient-ref-kabuli-chickpeas` and `ingredient-ref-desi-chickpeas`; kept `garbanzo beans` on the generic chickpea reference and kept `Kala Chana` scoped to the existing black-chickpea market identity.
- Added split/dehulled Desi and roasted split/dehulled Desi forms. The French roasted form label `pois chiches Desi cassés et rôtis` is a descriptive translation, not an attested Canadian product name; its `matchTermsFr` is empty. The reviewed chickpea proposal keeps broad `Bengal gram`, `bhuna chana`, `pottukadalai`, and flour wording out of the active reference aliases.
- Promoted the generic white-bean ledger candidate to `ingredient-ref-white-beans`; added identity-only cranberry/Borlotti, flageolet, and whole-fava references. Kept `Romano`, `butter bean(s)`, generic French `haricot blanc`, `fayot`, and unqualified `fève` outside the selected aliases.
- Verified the existing kidney-bean reference and added source-supported singular aliases. Added the canned/rinsed/drained form and linked recipe 034#9 while preserving `540 ml kidney beans, rinsed and drained`, its amount, and its bilingual preparation. Package metadata identifies one 540 ml can and a drained-mass request; no can-yield record or active density was inferred.
- Recorded Health Canada CNF food code 7085 observations for 125 ml / 83.5 g, 175 ml / 116.9 g, and 250 ml / 166.9 g of canned kidney beans drained and rinsed. These exact-state observations do not equate the 540 ml can net contents with drained volume.
- Added singular `haricot pinto` / `pinto bean` aliases and documented why butter-bean terms are not global Lima aliases.
- Closed the broad brown/yellow lentil naming question as a no-add decision. Existing generic lentil and color-class data remain unchanged; the ledger records why broad `brown` and `yellow` names stay unassigned. Whole/split/dehulled form questions remain separate.

## Sources and review packets

The accepted names and boundaries draw on [OQLF chickpea terminology](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296897/pois-chiche), [Canadian Grain Commission chickpea classes](https://www.grainscanada.gc.ca/fr/qualite-grains/guide-officiel-classement-grains/22-pois-chiches/classes-types-varietes.html), [Statistics Canada product classifications](https://www150.statcan.gc.ca/n1/pub/12-003-x/12-003-x2022001-fra.pdf), and the independently reviewed Québec French display proposal. Common-bean decisions use OQLF terminology, Statistics Canada and CFIA crop classifications, Québec product listings, and [Health Canada’s kidney-bean serving portions](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=7085). The lentil no-add decision uses Canadian Grain Commission and CFIA seed-trait classifications alongside Canadian processor and Québec retailer wording.

- [Chickpea types and roasted split gram proposal](../../proposals/wp03-h-chickpea-types-roasted-gram-review-20261011.md)
- [Independent Québec French roasted-split display review](../../proposals/wp03-h-roasted-split-bengal-gram-quebec-french-display-review-20261011.md)
- [Common-bean identities proposal](../../proposals/wp03-h-common-beans-unfinished-identities-review-20261011.md)
- [Brown/yellow lentil naming review](../../proposals/wp03-h-brown-yellow-lentil-identity-review-20261011.md)

## Validation

- 1,008 ingredient references, 66 forms, 114 recipes, and 1,123 ingredient rows.
- 1,289 research-ledger records, 4,124 source entries, and 3,372 distinct source IDs.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py` completed.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` passed.
- No tests were run: these changes are database JSON additions and the current `AGENTS.md` rule explicitly exempts them.
