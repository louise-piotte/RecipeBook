# WP02/WP03/WP04 R695–R697 gap review integration

Integrated 2026-10-18. R695 adds one recipe-scoped substitution finding, R697 adds one dried fish form, and R696 remains a documentation-only hold. The A7, Section F, and Section P parent checklists remain open.

## R695 — Scottish oatmeal oatcake alternatives

Updated the existing `ingredient-ref-scottish-oatmeal` research-ledger row with one Bob’s Red Mill recipe source and one supported, recipe-scoped finding. For *Bob’s Favorite Scottish Oatcakes*, the manufacturer recommends briefly pulsing Old Fashioned Rolled Oats to a coarse texture or using Quick Cooking Rolled Oats; the latter may change texture. No alternate quantity or ratio is given, so no amount, reusable substitution rule, alias, form, recipe link, or picker term was added. The existing 1/4-cup / 36 g product-label observation remains unchanged.

The recipe source has no bundled recipe link; the 114-file / 1,123-row scan found no Scottish-oatmeal references or matching recipe text. The manufacturer’s direct [oatcake recipe](https://www.bobsredmill.com/recipes/how-to-make/bobs-favorite-scottish-oatcakes) supports the bounded finding.

## R696 — Little Millet remains held

No shared catalog or ledger data changed. Agriculture and Agri-Food Canada directly pairs `petit millet` with *Panicum sumatrense*. FSSAI’s grain standard identifies Little Millet as Kutki, and Ceylon Groceries lists a polished Canadian product as Little Millet / `samai`. OQLF lists `petit mil` for generic millet, millet des oiseaux, and millet perle.

The proposal routed the exact phrase `petit mil` to those three existing references by adding the same French alias to each. Current seed-package validation requires normalized reference names and aliases to have a single owner, so the shared phrase fails the package invariant. Adding Little Millet by itself would make substring fallback return Little Millet alone for `petit mil`, preserving the misleading picker result under review. The Little Millet candidate, three existing references, and all aliases remain unchanged until the catalog can represent ambiguous exact phrases safely. Sources: [AAFC](https://agriculture.canada.ca/fr/science/science-racontee/realisations-scientifiques-agriculture/pleins-feux-mil), [OQLF generic millet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet), [OQLF foxtail millet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506452/millet-des-oiseaux), and [OQLF pearl millet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506450/millet-perle).

## R697 — dried Atlantic capelin form

Added the dry form `ingredient-form-atlantic-capelin-dried` under the verified `ingredient-ref-atlantic-capelin` identity, with labels `dried Atlantic capelin / capelan de l’Atlantique séché` and match terms `dried capelin / capelan séché`. Raymer’s current indexed Québec listing at the [product catalog URL](https://raymeraquaculture.ca/poissons-et-fruits-de-mer/) identifies capelan in smoked and dried formats, with Gaspésie provenance and year-round availability on request. The page reader exposed only the site shell, so the source detail comes from the current indexed listing for that exact URL. Existing OQLF and Fisheries and Oceans Canada sources support the Québec term and species-qualified display.

The listing does not say whether the dried fish is whole, salted, trimmed, or rehydrated, and gives no measure. The form ledger record has no measurement observations or substitution findings. No density, unit mapping, conversion, yield, recipe link, or substitution was added. The 114-file / 1,123-row bundle has no capelin/capelan recipe demand. The picker projection adds exact dried-form searches with an Atlantic-capelin form hint; generic capelin/capelan and capelin-roe searches remain unchanged.

## Package snapshot

| Measure | Before R695–R697 | After integration |
| --- | ---: | ---: |
| Ingredient references | 1,838 | 1,838 |
| Forms | 172 | 173 |
| Legacy candidates | 56 | 56 |
| Research-ledger records | 2,219 | 2,220 |
| Source entries | 10,402 | 10,406 |
| Distinct source IDs | 8,780 | 8,782 |
| Distinct source URLs | 7,429 | 7,431 |

R695 adds one new source ID and URL. R697 adds one new Raymer source ID and URL and reuses the parent OQLF and DFO source entries. R696 allocates no reference, alias, or source.

## Validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` passed.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` passed; the package is normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed; the generated catalog remains current at 1,838 references.
- Research-ledger schema/custom validation passed; source IDs do not map to multiple URLs.
- Scoped picker projection, recipe-corpus, UTF-8/no-BOM, link, and whitespace checks passed.
- No app tests, build, emulator run, or deployment were run. R695 and R697 only add database JSON data; R696 changes documentation only, as allowed by `AGENTS.md`.

See the [R695 proposal](../../proposals/wp02-a7-scottish-oatmeal-oatcake-substitution-review-r695-20261018.md), [R696 review](../../proposals/wp03-section-f-little-millet-picker-boundary-review-r696-20261018.md), [R697 proposal](../../proposals/wp04-section-p-dried-atlantic-capelin-form-review-r697-20261018.md), [catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt), [workflow](../../ingredient-catalog-workflow.md), [grain and cereal packet](../plant-grains-cereals.md), and [roadmap](../../../../roadmap.md).
