# WP04 Section Q — Dried whole-egg form integration (R351, 2026-10-16)

## Integrated data

Added `ingredient-form-egg-whole-dried` under existing `ingredient-ref-egg`. The bilingual display is `dried whole egg / poudre d’œuf entier`; exact English and French product phrases include `whole egg powder`, `powdered whole egg`, `œuf entier en poudre`, and `œufs entiers en poudre`. No new reference was added. The form has no density, unit mapping, recipe link, or substitution rule.

The form describes the whole egg product with both white and yolk. It does not cover separately dried whites/yolks, salted or sweetened whole-egg mixes, meringue powder, formulated egg products, or species-specific powder coverage for the existing duck/quail references.

## Evidence and numeric limits

- CFIA’s [Canadian Standards of Identity, Volume 2](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-2) defines whole egg and names Dried Whole Egg. It sets a maximum of 5% water and separately names dried whole-egg mixes and broader dried egg products. The French standard uses `poudre d’œuf entier`.
- CFIA’s [Volume 19, §19.4.1](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) defines dried whole egg as shelled egg contents obtained by drying.
- [Caneggs Canada](https://caneggs.com/shop/whole-egg-powder/) identifies a spray-dried pasteurized product made from Grade A Canadian chicken eggs. Its page gives a 1:3 powder-to-water ratio by weight and a 2 kg package. The ratio is also corroborated by [Understanding Ingredients for the Canadian Baker](https://opentextbc.ca/ingredients/chapter/egg-products/), which notes that some dried whole-egg products add carbohydrate before drying. These preparation directions are recorded as evidence only; neither establishes household measures or fresh-egg count conversion.
- Québec-facing [SAIL product wording](https://www.sail.ca/fr-ca/products/happy-yak-ufs-entiers-en-poudre-995271-19-131570001) uses `Œufs entiers en poudre` and lists pasteurized powdered whole eggs as the ingredient. The listing does not identify the source species.
- OQLF’s [GDT `poudre d’œuf` entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8429176/poudre-doeuf) gives unqualified terms for a broader composite egg-powder preparation; those unqualified terms were not added as aliases.

The ledger records the 1:3 weight reconstitution direction as source-supported preparation evidence, not as a unit conversion, household measure, count equivalence, or direct fresh-egg substitution. Package amounts remain product-specific.

## Picker and recipe review

Exact whole-egg phrases return the generic egg row with a dried-whole-egg form hint. Exact dried white and yolk phrases retain their separate parent rows. The matcher accepts a query as a phrase contained within a longer form term, so broad `egg powder` / `poudre d’œuf` searches can return the generic egg row without a whole-form hint; only qualified whole-egg phrases select this form. Broad `powdered egg` remains ambiguous across the existing egg-white and egg-yolk forms.

The 114 manifest-listed bundled recipes and 1,123 ingredient rows have no whole-egg-powder matches. No recipe line or unit/count conversion was added.

## Validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed; the generated reference index needed no update because reference names and aliases did not change.
- JSON, ledger-source linkage, recipe-corpus, UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- No software tests or emulator checks were run because this change only adds database JSON data under the updated `AGENTS.md` rule.

See the [R351 proposal](../../proposals/wp04-section-q-dried-whole-egg-review-r351-20261016.md) and the active [global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt).
