# WP02/WP03/WP04 R713–R715 integration — 2026-10-18

Integrated three reviewed gap proposals across cracked-wheat substitution evidence, a puffed-rice alias boundary, and coho salmon terminology.

## Decisions

- **R713 — cracked-wheat substitution evidence:** Added Fleischmann's official *Cracked Wheat Loaf* source and one `researched_supported` finding to the existing `ingredient-ref-cracked-wheat` ledger row. The finding names wheat germ only for this formula's 1/2 cup cracked-wheat ingredient. The page states no replacement quantity, amount basis, preparation method, hydration change, or expected result, so none was inferred. No wheat-germ alias, recipe link, or active global/contextual substitution rule was added. See the [R713 proposal](../../proposals/wp02-a7-cracked-wheat-substitution-review-r713-20261018.md).
- **R714 — brown-rice-puffs alias hold:** Kept `brown rice puffs` out of active aliases. A fully qualified alias would also make the shorter `rice puffs` query select only puffed brown rice, while current product pages use that unqualified phrase for products with different compositions. No alias, source entry, ledger decision, or recipe change was made. See the [R714 review](../../proposals/wp03-section-f-puffed-brown-rice-puffs-alias-review-r714-20261018.md).
- **R715 — coho salmon search alias:** Added only `silver salmon` to `ingredient-ref-coho-salmon.aliasesEn`. Kept the canonical display `coho salmon / saumon coho`, left French aliases empty, and retained the existing OQLF source ID while updating its note to include the English term. Added NOAA and FDA sources and an accepted ledger decision. `saumon argenté` remains unassigned; FDA evidence is used only for search and is not Canadian label guidance. See the [R715 proposal](../../proposals/wp04-section-p-coho-silver-salmon-alias-review-r715-20261018.md).

## Package state

- 1,841 ingredient references, 174 forms, 114 recipes, and 1,123 ingredient rows.
- 2,224 research-ledger records, 10,436 source entries, 8,805 distinct source IDs, and 7,454 distinct source URLs.
- No recipes, forms, active measures, conversions, yields, or substitution rules changed.

## Static verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — normalized.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — valid, including seed schema and ledger validation.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — generated index current at 1,841 references.
- The three new ledger source IDs each map to one URL and are attached to the intended coho or cracked-wheat record. Existing OQLF ownership was reused in place; no source ID maps to multiple URLs.
- Picker projection from `IngredientSearch.kt`: `silver salmon` returns coho; broad `salmon` and `saumon` remain the same ten references; `salmon fillets` and `filet de saumon` remain generic fillets; `silver` visibly returns coho and Swiss chard; `saumon argenté` and adjacent salmon names remain empty. R714 candidate phrases remain unassigned; current puffed-rice names and broad `puffs` results are unchanged.
- The 114-file / 1,123-row recipe corpus has no R713–R715 candidate-term matches or links to the affected references.
- Bundled JSON has no BOM or raw non-ASCII bytes; Markdown links, UTF-8/no-BOM, mojibake, and scoped whitespace checks are recorded with the integration.

No software tests, build, emulator run, or deployment were performed because the active application and ledger edits only add database JSON data under `AGENTS.md`; R714 was documentation-only. Sections A7, F, and P remain open.
