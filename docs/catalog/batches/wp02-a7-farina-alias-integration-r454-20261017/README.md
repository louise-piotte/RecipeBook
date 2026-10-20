# WP02 Section A7 R454 — farina alias integration

Integrated on 2026-10-17 after root review of the [R454 proposal](../../proposals/wp02-section-a7-farina-bilingual-alias-review-r454-20261017.md).

## Decision

Added only the exact Ardent Mills Canada product-title aliases `farina flour` and `farine farina` to the existing `ingredient-ref-spring-wheat-semolina` reference. The canonical display remains `spring wheat semolina / semoule de blé tendre`; the ingredient category remains `FLOUR_AND_STARCH`. The manufacturer describes the product as a coarse granular product made from purified endosperm of Canadian hard red spring wheat, and OQLF independently lists `farina` as an English term for `semoule de blé tendre`.

The aliases are exact two-word supplier titles. No bare `farina`, generic `farine`, new reference, ledger candidate, form, measure, density, unit mapping, conversion, recipe link, yield, or substitution was added. The existing unknown-measurement state and unresearched substitution state remain unchanged. The proposal's full scan found no matching ingredient demand in the 114 bundled recipes / 1,123 ingredient rows.

The current picker searches phrases within aliases, so `farina` now returns the four Italian type-flour rows plus spring-wheat semolina (five results), and `farine` returns 171 results, one more than before. This limited broad-query effect was accepted because the OQLF term and product composition support the identity; the exact phrase aliases remain narrowly stored.

## Data and validation

- Added two aliases and two Ardent Mills source entries to the existing spring-wheat-semolina ledger record; no ingredient reference or form was added.
- Current totals: **1,742 references**, **141 forms**, **2,101 research-ledger records**, **9,564 source entries**, **8,113 distinct source IDs**, and **6,826 distinct source URLs**. The manifest has **114 recipes / 1,123 ingredient rows**.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` passed; the package is normalized and valid.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed with 1,742 references.
- Static ownership, source-ID, picker-result, UTF-8/no-BOM, and alias-scope assertions passed.
- No software tests, build, emulator check, or deployment were run because this change only adds database JSON data under `AGENTS.md`.

## Sources

- Ardent Mills Canada, [Farina Flour](https://ardentmills.ca/products/traditional-wheat/standard-flours/farina/), product title and Canadian hard-red-spring-wheat endosperm description.
- Ardent Mills Canada, [Farine Farina](https://ardentmills.ca/fr/products/traditional-wheat/standard-flours/farina/), exact French page title and matching product description.
- Reused ledger source `WP03-IDLI-RAVA-20261012-S07`: OQLF, [semoule de blé tendre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432749/semoule-de-ble-tendre), preferred French term and English terms `farina` and `spring wheat semolina`.

Section A7 remains open for other grain meals and milling products.
