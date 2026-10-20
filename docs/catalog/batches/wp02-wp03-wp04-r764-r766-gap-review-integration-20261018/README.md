# WP02/WP03/WP04 R764–R766 integration

## Integrated reviews

- **R764 — ivory teff flour substitution:** Updated the existing `ingredient-ref-ivory-teff-flour` ledger row with the current Berhan product wording, Maskal's separate general 1:1 no-rise guidance, and Ronda et al.'s cultivar-specific ciabatta study. The finding is `blocked_pending_evidence`: none supports a replacement amount for Berhan's source-named product. No active substitution, pair, recipe link, measure, density, form, conversion, yield, or alias was added; measurement research remains `researched_no_supported_value`.
- **R765 — Quaker Harvest Crunch / Croque Nature:** Added seven identity-only bilingual `GRAIN_AND_CEREAL` references for Apple Crumble, Canadian Maple, Dark Chocolate Cranberry & Almond, Light & Crisp Honey & Nut, Original, Raisin & Almond, and Light & Crisp Raisin Almond. The seven paired entries are a supported bilingual subset, not a complete family roster. The two English-only Protein products remain outside active data until the manufacturer supplies French names. No aliases, forms, measures, recipe links, or substitutions were added. This resolves R524's Canadian Maple hold through a family-level picker review.
- **R766 — lake whitefish:** Added `ingredient-form-lake-whitefish-whole-fish` under the existing `ingredient-ref-lake-whitefish` as `whole lake whitefish / grand corégone entier`. The form describes only whole presentation; freshness and supplier-specific dressing, size, and case details remain excluded. No measure, yield, recipe link, conversion, or substitution was added.

The A6, broader Section F, and Section P plan items remain open.

## Evidence and boundaries

- Ontario Made's [Berhan Ivory Teff Flour page](https://supportontariomade.ca/explore-products/1-lb-ivory-teff-flour) describes broad recipe uses without a replacement ratio. [Maskal Teff's FAQ](https://teffco.com/pages/faq) gives a general 1:1 suggestion for no-rise baked goods for its own products. [Ronda et al.'s primary study](https://doi.org/10.1016/j.jcs.2015.05.009) tests named tef cultivars in one ciabatta formulation; its 0–40% replacement levels are not generalized to Berhan flour or home recipes.
- Quaker / PepsiCo Canada's current [English family roster](https://www.tastyrewards.com/en-ca/brands/quaker/products-categories/c%C3%A9r%C3%A9ales-croque-naturemc) and [French family roster](https://www.tastyrewards.com/fr-ca/marques/quaker/produits-categories/c%C3%A9r%C3%A9ales-croque-naturemc) support the seven paired variants. Product-page evidence and the two unpaired Protein products are documented in the [R765 proposal](../../proposals/wp03-section-f-next-gap-review-r765-20261018.md).
- [Seacore's Whitefish page](https://www.seacoreseafood.com/product/Whitefish) identifies *Coregonus clupeaformis* and lists whole or fillet presentations. [Allseas' whole lake whitefish page](https://www.allseas.net/product/freshwater-fish/whitefish-whole) supports a whole presentation but keeps its dressed wording and trade-size details product-specific. The existing [OQLF grand corégone entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199106/grand-coregone) supplies the Québec species name.

## Catalog and picker impact

After R764–R766, the bundled package contains **1,857 references** (**290** in `GRAIN_AND_CEREAL`) and **187 forms**. The research ledger contains **2,253 records**, **10,572 source entries**, **8,913 distinct source IDs**, and **7,560 distinct source URLs**. The generated ingredient-reference index contains 1,857 entries.

R764 changes no picker-visible field. R765's static phrase-first projection has these effects:

| Query | Before | After | Effect |
| --- | ---: | ---: | --- |
| `Harvest Crunch` / `Croque Nature` | 0 / 0 | 7 / 7 | Returns the seven paired products; does not imply the two Protein products are represented. |
| Each full bilingual product display | 0 | 1 | Selects the corresponding product. |
| `Quaker` | 4 | 11 | Adds seven named products. |
| `granola` | 4 | 6 | Adds Canadian Maple and Light & Crisp Raisin Almond. |
| `cereal` / `céréales` | 77 / 74 | 84 / 81 | Adds seven rows to each broad term. |
| `maple` / `érable` | 8 / 8 | 9 / 9 | Adds Canadian Maple only. |

R766's static projection adds exact results for `whole lake whitefish` and `grand corégone entier` (0→1 each). Broad `lake whitefish` / `grand corégone` remain at 2 each; `whole fish` / `poisson entier` remain at 1 each; `whole` / `entier` increase 52→53 / 25→26; `fresh whole` stays at 8. No search aliases or fresh-state form terms were added.

## Recipe corpus

The manifest lists **114 recipes** and **1,123 structured ingredient rows**. The proposal scans found no recipe demand or direct reference links for the R764 teff-flour review, any of the seven R765 products, or lake whitefish and its whole form. No recipe was changed or linked.

## Files updated

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json`
- `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt` (regenerated from the canonical reference JSON)
- `docs/catalog/research-ledger.v1.json`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`

## Static validation

- Bundled package normalization and validation passed with no additional normalization required.
- Generated ingredient-index freshness, research-ledger schema, unique reference/form/record IDs, and targeted new source-ID and URL ownership checks passed.
- Confirmed ASCII-escaped JSON text, UTF-8 without BOM, recipe-corpus scan results, picker projections, local Markdown links, mojibake scan, and scoped whitespace checks.
- No software tests, build, emulator run, or deployment were performed. The active catalog changes add database JSON data under `AGENTS.md`; package, ledger, index, and static consistency checks were used for verification.

Full source records and accepted decisions are in the [research ledger](../../research-ledger.v1.json). See the [R764 teff-flour proposal](../../proposals/wp02-a6-next-gap-review-r764-20261018.md), [R765 cereal-family proposal](../../proposals/wp03-section-f-next-gap-review-r765-20261018.md), and [R766 lake-whitefish proposal](../../proposals/wp04-section-p-next-open-gap-review-r766-20261018.md).
