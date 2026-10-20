# WP03 Section F — plain puffed einkorn boundary hold (R91)

Proposal reviewed and documentation-only hold integrated 2026-10-14. Section F remains open.

## Decision

Keep plain, ready-to-eat puffed einkorn outside active references and the research ledger until a Québec-facing French product name establishes its local picker identity. Add no reference, alias, legacy candidate, ledger record, form, measure, conversion, yield, recipe link, or substitution.

Soligrano's manufacturer page identifies a plain organic puffed-einkorn product, gives a 100 g package with five 20 g servings, and describes ready-to-eat uses. A US seller separately lists plain puffed einkorn and maple/honey variants. These sources establish a distinct plain product but do not establish Canadian availability or French Québec naming. A 2016 puffing study distinguishes einkorn from bread wheat at *Triticum monococcum* subsp. *monococcum*; its laboratory and product-composition results do not provide a Québec display or household measure.

TERMIUM records `petit épeautre` and `engrain` for einkorn. La Milanaise uses `farine de petit épeautre` and `engrain` for its Québec einkorn-flour product and explicitly distinguishes petit épeautre from épeautre. OQLF pairs `épeautre` with English `spelt`, and Metro Québec's indexed ingredient declaration uses `épeautre soufflé` for a puffed-spelt product. Keep that phrase on the existing puffed-spelt reference. No reviewed Québec/Canadian consumer label resolves `petit épeautre soufflé`, `grains de petit épeautre soufflés`, or `engrain soufflé` for a plain puffed-einkorn product.

## Picker and recipe review

The current active owners are einkorn berries, einkorn flour, generic puffed wheat, and puffed spelt. The exact English candidate phrases have no active reference, form, legacy, ledger, or recipe owner. Reproducing the picker rules shows that `puffed einkorn` and `einkorn puffs` currently return no result; `einkorn` returns the berry and flour identities; `petit épeautre` returns those same identities; and `épeautre soufflé` returns puffed spelt only. A candidate einkorn identity would add a third result to broad `einkorn` and a fourteenth to broad `puffed` queries, so it must remain separate from generic puffed wheat and spelt.

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned for candidate names, adjacent puffed-einkorn wording, and relevant recipe links. No matching row, recipe, or direct link was found.

## Measurements and substitutions

Soligrano's 20 g portion is product-specific and mass-only. Country Life's package weights are not kitchen measures. Jovial's 1 cup (40 g) portion applies to a sweetened product with added honey and sunflower oil. Do not attach it to plain puffed einkorn or transfer numeric data from einkorn berries, spelt puffs, or generic puffed wheat. No source supports a reusable density, volume mapping, puffing yield, conversion, or substitution ratio. Soligrano's qualitative crouton/puff suggestion has no quantity or tested ratio and is not an active substitution rule.

## Integration and verification

Root added one checked review item under the still-open Section F checklist and recorded the hold in the plan log and roadmap. No database JSON, generated catalog, or application file changed. The proposal remains the detailed source register and search audit: [R91 puffed-einkorn review](../../proposals/wp03-section-f-puffed-einkorn-identity-boundary-hold-20261014-r91.md).

Static review confirmed UTF-8 text, no BOM, final newlines, working repository links, and no whitespace errors in the changed plan and roadmap. No app tests, Gradle tasks, instrumentation, or emulator checks were run because this integration only records a documentation hold.

## Main sources

- [Soligrano BIO Puffed einkorn](https://soligrano.pl/en/product/puffed-bio-einkorn/)
- [Country Life Puffed Einkorn Cereals](https://countrylifefoods.com/products/puffed-kamut-organic-copy)
- [Jovial Organic Einkorn Cereal Puffs](https://jovialfoods.com/products/org-wg-einkorn-puffed-cereal-with-honey-198g-x-9)
- [OQLF GDT: épeautre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354126/epeautre)
- [La Milanaise: farine de petit épeautre](https://lamilanaise.com/produits/farine-de-petit-epeautre-entiere-biologique/)
- [Metro Québec: Muesli au chocolat noir](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/muesli-au-chocolat-noir/p/814930010646)
