# WP04 Section P dried anchovy for broth boundary hold

## Decision

Integrated the R43 proposal as an evidence-only hold. Keep the broth-grade dried-anchovy listing outside active references, forms, and the ledger until a bundled recipe identifies the product state it needs. The Canadian retailer's English title is `Suhyup Dried Anchovy for Broth`; the Québec City retailer uses `Anchois séchés`. The first page lists a Korea-origin, 1.5 kg SKU with `Anchovy 100%` as its ingredient, while the Québec listing gives no species or package details. Both listings currently show sold out.

OQLF supports the base `anchois / anchovy` family name, not a dried-product phrase. `Anchois séchés pour bouillon` remains a descriptive French rendering of the English use context, not an OQLF term or verified package wording. Keep the candidate distinct from dried anchovy powder, salted/fermented anchovies, anchovy paste, dried bonito, fish stock, and prepared anchovy side dishes.

## Picker and recipe scope

A standalone `dried anchovy for broth / anchois séchés pour bouillon` row would add a distinct result to `anchovy` and `anchois` searches and another result to broad `dried` searches. The bundle contains no matching phrase or ingredient reference, so it does not identify which dried anchovy state or preparation is needed. A generic dried form on the family-scoped anchovy row would imply a reusable state that the evidence does not establish.

## Changes

- Added the hold under the open [Section P preservation checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L4207).
- Added this integration record and updated the plan progress log and roadmap.
- Changed no catalog JSON, generated index, research ledger, forms, recipes, legacy candidates, or application code. Added no identity, alias, form, measure, density, unit mapping, recipe link, conversion, yield, substitution, or candidate record.

## Evidence and limits

- [The K Mart](https://www.thekmart.ca/en/products/%EC%88%98%ED%98%91-%EB%8B%A4%EC%8B%9C%EB%A9%B8%EC%B9%98-1-5kg) lists `Suhyup Dried Anchovy for Broth 1.5KG`, describes the Korean-origin item as selected for broth-making, and lists `Anchovy 100%`. It gives no scientific species, complete package-label image, serving basis, dried-to-rehydrated yield, or broth extraction ratio; its listing currently says sold out.
- [Marché des Continents in Québec City](https://marchedescontinents.ca/products/anchois-seches) uses the title `Anchois séchés`, but the page does not establish species, product preparation, package size, or a complete ingredient declaration. It currently says sold out.
- [OQLF's GDT entry for `anchois`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199027/anchois) pairs the French and English family names and lists Engraulidae; it does not name a dried form or species.
- [CFIA fish-labelling guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish) says condition words such as `dried` may be needed when their omission could cause a fish product to be mistaken for another food. It does not prescribe this candidate's identity or quantity data.
- [Chez Bong's Montréal menu](https://www.chezbong.ca/shop) lists `Myulchee (dried anchovies) Bokkum` under Banchan, a prepared side-dish section. This is not evidence for a plain dried pantry ingredient.
- The proposal's exact ownership audit found no dedicated dried-anchovy reference, form, legacy candidate, or ledger decision. Its pre-proposal snapshot was 1,369 references, 100 forms, 64 legacy candidates, and 1,699 ledger records. All 114 manifest-listed recipes and 1,123 ingredient rows had zero candidate-phrase matches.
- No reusable measure, density, mapping, preparation conversion, yield, or substitution is supported. The 1.5 kg package weight and nutrition values per 100 g are not recipe quantities.

## Verification

The proposal-only ownership, picker, recipe-corpus, source-ID, local-link, and numeric audit is recorded in [the R43 proposal](../../proposals/wp04-section-p-dried-anchovy-for-broth-product-boundary-review-20261013-round43.md). No automated tests were needed or run: this integration changes documentation only. Section P remains open.
