# WP02/WP03/WP04 R692–R694 gap review integration

Integrated 2026-10-18. R692 and R693 update existing catalog research and forms; R694 is a documentation-only hold. The A7, Section F, and Section P parent checklists remain open.

## R692 — roasted-wheat-flour blending evidence

Updated the existing `ingredient-ref-roasted-wheat-flour` ledger row. Refreshed bilingual manufacturer sources [WP02-S126](https://moulinsdesoulanges.com/language/en/roasted-wheat-flour/) and [WP02-S127](https://moulinsdesoulanges.com/language/fr/farine-de-ble-torrefie/) to capture their statement that roasted wheat flour can be combined with other white flours. The pages name no partner flour, formula, proportion, or replacement method. Set substitution research to `blocked_pending_evidence` and added a blocked source-scoped finding. No replacement, active rule, measurement observation, form, recipe link, or picker behavior was added.

The recipe audit found no matching row or direct reference link in the 114 bundled recipes / 1,123 ingredient rows.

## R693 — extra-fine bulgur form

Added dry form `ingredient-form-bulgur-extra-fine-grind` under `ingredient-ref-bulgur`:

- Labels: `extra fine bulgur / boulgour extra fin`.
- Exact English match term: `Duru extra fine bulgur`; no `#0`, `No. 0`, generic `fine`, or generic very-coarse term was added.
- Duru’s catalogue gives extra-fine 0.5–1.6 mm and fine 0.5–2.5 mm ranges. They overlap and remain brand-specific; no universal particle-size cutoff or number-grade crosswalk is inferred.
- Québec wording is supported by the [Orkida bilingual product listing](https://www.ubereats.com/ca/store/supermarche-orkida/YhOlu13JV8Sbo4o23ju_yA), and local retailer context by [Epicure’s Duru listing](https://shopepicure.ca/products/duru-extra-fine-bulgur-1kg) and [Québec locations](https://shopepicure.ca/pages/our-locations).
- Density remains null. No household measure, unit mapping, conversion, cooking yield, recipe link, or substitution was added. The manufacturer’s 60 g nutrition serving is not treated as a household measure.

The form-level ledger record reuses the existing Sunnyland No. 5 catalog and OQLF bulgur source IDs, and records the Duru, Epicure, and Orkida sources. The 114-recipe / 1,123-row audit found no bulgur demand or direct link. The projected picker adds `extra fine bulgur`, `boulgour extra fin`, and `Duru extra fine bulgur` as exact form-hint queries; fine-bulgur and No. 5 queries remain unchanged.

## R694 — canned sardines in olive oil hold

Kept the hypothetical oil-specific identity and proposal-local sources outside active references and the research ledger. [Mayrand’s Québec listing](https://mayrand.ca/fr/nos-produits/epicerie/poisson-et-viande-en-conserve/poisson-en-conserve/sardines-dans-lhuile-dolive-pastene-49932) and [NURI’s product catalogue](https://nuriartisanalsardine.com/?lang=en) establish oil-packed sardine products. The bundled recipe corpus has no candidate demand. An oil-only picker result would also fail to make visible that smoked sardines in olive oil exist, so the product remains on hold. Existing generic canned sardine, tomato-sauce sardine, and smoked-sardine records remain unchanged.

## Package snapshot

| Measure | Before R692–R694 | After integration |
| --- | ---: | ---: |
| Ingredient references | 1,838 | 1,838 |
| Forms | 171 | 172 |
| Legacy candidates | 56 | 56 |
| Research-ledger records | 2,218 | 2,219 |
| Source entries | 10,395 | 10,402 |
| Distinct source IDs | 8,775 | 8,780 |
| Distinct source URLs | 7,424 | 7,429 |

R694 allocates no shared source IDs or URLs.

## Validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` passed.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` passed; the package is normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed; the generated catalog remains current at 1,838 references.
- Research-ledger schema/custom validation passed. No source ID maps to multiple URLs.
- Documentation links, UTF-8/no-BOM checks, and scoped whitespace checks passed.
- No app tests, build, emulator run, or deployment were run. This batch adds database JSON data only under `AGENTS.md`; R694 changes documentation only.

See the [R692 proposal](../../proposals/wp02-a7-roasted-wheat-flour-substitution-review-r692-20261018.md), [R693 proposal](../../proposals/wp03-section-f-bulgur-extra-fine-form-review-r693-20261018.md), [R694 proposal](../../proposals/wp04-section-p-canned-sardines-olive-oil-boundary-review-r694-20261018.md), [catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt), [workflow](../../ingredient-catalog-workflow.md), [grain and cereal review](../plant-grains-cereals.md), and [roadmap](../../../../roadmap.md).
