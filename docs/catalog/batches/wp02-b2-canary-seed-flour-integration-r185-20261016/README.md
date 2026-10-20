# WP02 Section 04 B2 canary seed flour integration — R185

## Decision

Added identity-only `canary seed flour / farine de graines d’alpiste des Canaries` in `FLOUR_AND_STARCH`. The identity is limited to whole-grain flour milled from glabrous, dehulled brown or yellow *Phalaris canariensis* for human food. It is separate from canary-seed groats, flakes, meal, extracted starch, and ordinary bird-feed seed.

The English display uses `canary seed flour`, with the producer-backed English alias `alpiste flour`. French aliases remain empty. The French display is descriptive and provisional for Québec: OQLF supplies the species name `alpiste des Canaries`, and Health Canada's French page uses `farine complète` / `farine de grains entiers` for flour use, but no Québec flour label or OQLF flour headword was found.

The ledger retains one study-specific bulk-density observation of approximately 0.6 g/mL for hydrothermally treated study flour. Its detailed density protocol and household filling convention are unavailable, so `defaultDensity` remains null, `unitMappings` stays empty, and `measurementState` remains `blocked_pending_evidence`. A separate blocked finding records formula-specific canary-flour trials: 25% in one commercial pan-bread formula and 35% or 50% in commercial tortilla formulas. These do not establish a general replacement ratio; no active substitution rule or recipe-line link was added. No forms, yields, or conversions were added.

The bundled recipe corpus has no matching canary-seed flour demand.

## Sources

- [ALPISTE Seeds, ALPISTE Flour](https://www.alpisteseeds.ca/products/alpiste-flour), current Canadian-grown human-food flour product page, 240 g package; marked sold out at review.
- [Alpiste Canada, Alpiste Suppliers](https://www.alpistecanada.ca/alpistesuppliers), current directory lists InfraReady Products (Saskatoon, Saskatchewan) as offering alpiste flour and meal, raw or pre-cooked.
- [Malunga et al., Exploration of the functional properties of hydrothermally treated Canary seed flour](https://www.sciencedirect.com/science/article/pii/S2772753X25001108), *Food Chemistry Advances* 7 (2025), 100994; reports bulk density of about 0.6 g/mL for hydrothermally treated flour.
- [Patterson et al., Glabrous Canary Seed: A Novel Food Ingredient](https://www.cerealsgrains.org/publications/plexus/cfw/pastissues/2018/protectedpdfs/CFW-2018-5.pdf), *Cereal Foods World* 63(5) (2018); includes the source-specific bread and tortilla trials.
- [Health Canada, Glabrous canary seed](https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/approved-products/glabrous-canary-seed-phalaris-canariensis.html) and [Santé Canada, La graine d’alpiste des Canaries glabre](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-genetiquement-modifies-autres-aliments-nouveaux/produits-approuves/graine-alpiste-canaries-glabre-phalaris-canariensis.html), human-food boundaries, whole-grain flour use, and wheat-allergy label caution.
- [Canadian Grain Commission, La graine à canaris](https://grainscanada.gc.ca/fr/recherche-donnees/rapports-scientifiques/canaris/) and [OQLF, alpiste des Canaries](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17498891/alpiste-des-canaries), flour/groat distinction and Québec French botanical term.
- [Alpiste Canada, Alpiste Products](https://www.alpistecanada.ca/products), producer's `Alpiste Flour` wording, roller-milling description, and distinction from whole groats.

## Validation

- Research-ledger schema, record-local source/finding/decision linkage, reference normalization, seed-package validation, and generated-index checks passed.
- The new reference has the proposed `FLOUR_AND_STARCH` category, no French aliases, only the source-backed `alpiste flour` English alias, null active density, and empty unit mappings. No form, recipe link, or active substitution rule was added.
- The bulk-density observation links to the 2025 study only. The substitution finding is `blocked_pending_evidence`, identifies canary-seed flour as its source ingredient, links to the documented trials, and contains no replacement or rule.
- The 114-recipe / 1,123-row corpus scan and picker projections passed. The unqualified species queries display both groats and flour; the qualified flour names resolve to the flour row.
- New source IDs and URLs were absent before integration. Five R63 source IDs were reused with their already registered URLs. UTF-8/no-BOM, escaped bundled Unicode, local links, and scoped whitespace checks passed.
- No software tests were run because this is database data with a generated static reference entry and no runtime logic change, under the current `AGENTS.md` rule.

## Review record

- [WP02 canary seed flour identity proposal](../../proposals/wp02-b2-canary-seed-flour-identity-review-r185-20261016.md)
- [WP03 canary seed groats identity proposal](../../proposals/wp03-section-f-canary-seed-groats-identity-review-20261013-r63.md)

Broader baking identities, bilingual review, measurement research, and substitution research remain open.
