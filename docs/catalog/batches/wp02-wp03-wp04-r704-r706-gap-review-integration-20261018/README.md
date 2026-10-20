# WP02/WP03/WP04 R704–R706 integration — 2026-10-18

This batch records one identity addition and two evidence-backed holds. A7, Section F, and Section P remain open.

## Decisions

- **R704 — sprouted whole-barley-flour form:** held the proposed form under `ingredient-ref-whole-barley-flour` pending manufacturer confirmation. Metro Québec and La Boîte à Grains currently list sprouted whole-barley flour in the ingredients for Silver Hills Little Big Bread, but Silver Hills’ current English and French product pages list sprouted whole wheat and oats and omit barley. No active form, reference, alias, or ledger candidate was added. See the [R704 review](../../proposals/wp02-a7-sprouted-whole-barley-flour-form-review-r704-20261018.md).
- **R705 — Riceberry rice:** added identity-only `Riceberry rice / riz violet Riceberry`, category `GRAIN_AND_CEREAL`, as `ingredient-ref-riceberry-rice`. The source-named rice variety is separate from generic purple rice, black rice, black glutinous rice, jasmine rice, and Riceberry-containing blends. No aliases, forms, measurements, density, mappings, conversions, yields, recipe links, or substitutions were added. The 114-recipe corpus has no Riceberry demand. Four new ledger sources support the variety, Canadian product, and Québec French market wording. See the [R705 proposal](../../proposals/wp03-section-f-next-grain-gap-review-r705-20261018.md).
- **R706 — frozen sablefish fillet:** held the prospective form outside active data. La Mer’s paired Montréal product pages support the bilingual frozen fillet, but its natural labels would make broad `cod fillet` and `filet de morue` queries return sablefish alone. No form, ledger source, or recipe behavior was added. See the [R706 proposal](../../proposals/wp04-section-p-next-seafood-gap-review-r706-20261018.md).

## Resulting data

- Bundled catalog: **1,841 references**, 173 forms, 114 recipes, and 1,123 ingredient rows.
- Research ledger: **2,223 records**, 10,417 source entries, 8,789 distinct source IDs, and 7,438 distinct source URLs.
- Generated `BundledIngredientCatalog.kt` was refreshed from the canonical reference JSON.

## Checks

- Seed-package normalization check and validation passed; the package is already normalized and valid.
- Generated catalog freshness passed at 1,841 references.
- Research-ledger schema validation and ownership checks for the four new source IDs and URLs passed; normalized-name checks passed.
- Picker projection returns one Riceberry row for `Riceberry`, `Riceberry rice`, `riz violet Riceberry`, and `riz violet`; `purple rice` remains unmatched, and the four existing `black rice` results remain unchanged. Broad `rice` returns 73 rows and `riz` returns 70.
- All 114 manifest-listed recipe files were scanned; there were no Riceberry phrase hits or structured ingredient-row hits.
- Database JSON remains UTF-8 without BOM with escaped non-ASCII text. Relative Markdown links and scoped whitespace checks passed.
- No software tests, build, emulator run, or deployment were performed. The application change only adds database JSON data; R704 and R706 are documentation-only holds.

See the [catalog workflow](../../ingredient-catalog-workflow.md) and [global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt).
